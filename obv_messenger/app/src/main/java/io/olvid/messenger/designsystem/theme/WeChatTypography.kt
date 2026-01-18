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

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.sp

/**
 * WeChat-style typography based on the wechat-html-pure project.
 * Reference: G:\olvid-android\wechat-html-pure\styles\main.css
 *
 * Font sizes follow WeChat's design system:
 * - Title: 18px, weight 600
 * - Name: 17px, weight 500
 * - Body: 15px
 * - Secondary/Time: 12px, color TextSub
 * - Tab text: 12px
 */
val WeChatTypography = Typography(
    defaultFontFamily = FontFamily.Default,

    // Large title (微信 title in header)
    headlineLarge = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        lineHeight = 22.sp,
        textDirection = TextDirection.ContentOrLtr
    ),

    // Medium title (contact name, chat title)
    headlineMedium = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 17.sp,
        lineHeight = 22.sp,
        textDirection = TextDirection.ContentOrLtr
    ),

    // Body text (message content)
    bodyLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        lineHeight = 21.sp,
        textDirection = TextDirection.ContentOrLtr
    ),

    // Secondary text (message preview, descriptions)
    bodyMedium = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 19.sp,
        textDirection = TextDirection.ContentOrLtr
    ),

    // Small text (time, date)
    bodySmall = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        textDirection = TextDirection.ContentOrLtr
    ),

    // Tab bar text
    labelSmall = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 14.sp,
        textDirection = TextDirection.ContentOrLtr
    )
)
