# Olvid Android 微信 UI 风格改造计划（以 wechat-html-pure 为准）

目标：将 Olvid Android 核心页面改造为微信风格；布局、颜色、气泡样式尽量做到与 `wechat-html-pure/` 一比一对齐。  
范围：会话列表、聊天详情、通讯录、底部 4 Tab（微信/联系人/群聊/通话）。  
深色模式：暂不支持（后续单独规划）。

## 0. 规格来源（强约束）

- 全局：`wechat-html-pure/styles/main.css`
- 会话列表：`wechat-html-pure/styles/chats.css`
- 聊天详情：`wechat-html-pure/styles/chat-detail.css`
- 通讯录：`wechat-html-pure/styles/contacts.css`

> 备注：当本计划与上述 CSS 冲突时，以 CSS 为准并回填更新本计划。

## 1. 主题系统改造

### 1.1 颜色变量（Android resources）

文件：`obv_messenger/app/src/main/res/values/colors.xml`

已新增（微信风格色板）：
- `wechat_primary` `#07C160`
- `wechat_primary_dark` `#06AD56`
- `wechat_sent_bubble` `#95EC69`
- `wechat_received_bubble` `#FFFFFF`
- `wechat_background` `#FFFFFF`
- `wechat_background_secondary` `#F2F2F2`
- `wechat_fill` `#F7F7F7`
- `wechat_line` `#E5E6EB`
- `wechat_text_main` `#1D2129`
- `wechat_text_sub` `#86909C`
- `wechat_text_weak` `#A0A0A0`
- `wechat_danger` `#FB6E77`
- `wechat_online` `#23C343`
- `wechat_tab_bar_background` `#F7F7F7`

待补充（聊天页专用背景）：
- `wechat_chat_background`：对齐 `chat-detail.css` 的 `--chat-bg: #EDEDED`
- `wechat_chat_header_background`：对齐 `chat-detail.css` 的 `--header-bg: #EDEDED`

### 1.2 Compose 颜色常量

文件：`obv_messenger/app/src/main/java/io/olvid/messenger/designsystem/theme/WeChatColors.kt`（已存在）

原则：Compose 侧优先用 `colorResource(R.color.xxx)` 与资源保持一致；`WeChatColors` 仅作为可读性补充。

### 1.3 Typography（按 wechat-html-pure）

文件：`obv_messenger/app/src/main/java/io/olvid/messenger/designsystem/theme/WeChatTypography.kt`（已存在）

对齐目标（主要来自 `main.css` / `chats.css` / `contacts.css` / `chat-detail.css`）：
- Header 标题：18px、weight 600
- 名称：17px、weight 500
- 列表预览：14px
- 时间/次要：12px（色 `wechat_text_sub`）
- Tab 文案：12px

## 2. 主界面（MainActivity）改造

参考：`wechat-html-pure/index.html` + `styles/main.css` 的 `.wechat-header`、`.tab-bar`

目标：
- 顶部栏：高度 52dp、背景 `wechat_fill`、标题居中、18sp/600
- 底部 TabBar：4 项（微信/联系人/群聊/通话），图标+文字，整体高度 60dp（对齐 `.tab-item { height: 60px; }`）
- 激活态：文字与图标为 `wechat_primary`
- 未激活态：`wechat_text_sub`
- 分割线：顶部 1dp/0.5dp（对齐 `--line`）

## 3. 会话列表（微信页 / Discussions）

参考：`styles/chats.css`

目标（列表项一比一）：
- item 高度：72dp
- 头像：48dp，圆角 6dp
- 分割线：0.5dp，色 `wechat_line`
- 名称：17sp/500，色 `wechat_text_main`
- 时间：12sp，色 `wechat_text_sub`
- 预览：14sp，色 `wechat_text_sub`
- 按压态：`rgba(0,0,0,0.05)`

## 4. 聊天详情（对话页 / DiscussionActivity）

参考：`styles/chat-detail.css`

### 4.1 页面背景

- 整体：`#EDEDED`（`--chat-bg`）
- Header：`#EDEDED`（`--header-bg`）
- Footer：`#F7F7F7`（`--footer-bg`）
- 分割线：`0.5dp` + `wechat_line`

### 4.2 消息行与气泡

- 头像：40dp，圆角 4dp
- 气泡：圆角 4dp（`.bubble { border-radius: 4px; }`）
- 气泡颜色：
  - 发送：`wechat_sent_bubble`（#95EC69）
  - 接收：`wechat_received_bubble`（#FFFFFF）
- 气泡尾巴：8x8 旋转方块（对应 `.bubble::after`），位置 top=16px
- 文本字号：16sp（`.bubble-text { font-size: 16px; }`）
- 昵称（群聊）：11sp，色 `wechat_text_sub`

### 4.3 时间条

目标（按产品要求）：
- 仅显示“上午/下午 HH:mm”
- 间隔 > 5 分钟才显示
- 样式对齐 `chat-detail.css` 的 `.system-banner`：13px、`#b2b2b2`、居中、透明背景

### 4.4 输入栏（Footer）

对齐 `chat-detail.css`：
- toolbar 最小高度：56dp，padding 8dp/10dp，gap 10dp
- 输入框：高度 38dp、圆角 4dp、白底
- 语音/表情/加号按钮：28dp，按压态 rgba(0,0,0,0.05)
- 发送按钮：minWidth 60dp，高 32dp，圆角 4dp，背景 `wechat_primary`，文字 15sp/500

## 5. 通讯录（Contacts）

参考：`styles/contacts.css`

目标：
- 搜索栏：height 36dp、圆角 8dp、白底（注意：不是灰底）
- 列表项：56dp 高，右箭头
- 分组标题 sticky：24dp，字 14sp
- 右侧索引条：A-Z，交互与高亮对齐 `.contacts-index`

## 6. 资源与图标

需从 `wechat-html-pure/assets/icon/` 移植并转为 Android Vector：
- tabs：chats/contacts/（以及后续 discover/me 若要扩展）
- chats：circle-plus、scan、add-contacts 等
- common：arrow-right、mute、search 等

## 7. 实施步骤（建议顺序）

1) 先完成“聊天详情一比一复刻”（对话页），确保气泡/背景/输入栏完全对齐  
2) 再做会话列表 72/48/0.5 的布局对齐  
3) 最后统一主界面 TabBar/顶部栏和通讯录索引条

