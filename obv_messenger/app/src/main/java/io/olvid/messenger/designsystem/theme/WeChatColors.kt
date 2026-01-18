/*
 *  Olvid for Android
 *  Copyright © 2019-2025 Olvid SAS
 *
 *  This file is part of Olvid for Android.
 *
 *  Olvid is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License, version 3,
 *  as published by the Free Software Foundation.
 *
 *  Olvid is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with Olvid.  If not, see <https://www.gnu.org/licenses/>.
 */

package io.olvid.messenger.designsystem.theme

import androidx.compose.ui.graphics.Color

/**
 * WeChat-style color palette based on the wechat-html-pure project.
 * Reference: G:\olvid-android\wechat-html-pure\styles\main.css
 */
object WeChatColors {
    // Primary theme color
    val Primary = Color(0xFF07C160)
    val PrimaryDark = Color(0xFF06AD56)

    // Message bubble colors
    val SentBubble = Color(0xFF95EC69)
    val ReceivedBubble = Color(0xFFFFFFFF)

    // Background colors
    val Background = Color(0xFFFFFFFF)
    val BackgroundSecondary = Color(0xFFF2F2F2)
    val Fill = Color(0xFFF7F7F7)

    // Border and separator
    val Line = Color(0xFFE5E6EB)

    // Text colors
    val TextMain = Color(0xFF1D2129)
    val TextSub = Color(0xFF86909C)
    val TextWeak = Color(0xFFA0A0A0)

    // Status colors
    val Danger = Color(0xFFFB6E77)
    val Online = Color(0xFF23C343)

    // Tab bar
    val TabBarBackground = Color(0xFFF7F7F7)

    // Chat detail page
    val ChatBackground = Color(0xFFEDEDED)
    val ChatHeaderBackground = Color(0xFFEDEDED)
}
