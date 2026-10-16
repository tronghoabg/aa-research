package androidx.compose.material3;

import androidx.compose.material3.tokens.TypeScaleTokens;
import androidx.compose.material3.tokens.TypographyTokens;
import androidx.compose.material3.tokens.TypographyTokensKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.GenericFontFamily;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Typography {
    public static final int $stable = 0;
    private final TextStyle bodyLarge;
    private final TextStyle bodyLargeEmphasized;
    private final TextStyle bodyMedium;
    private final TextStyle bodyMediumEmphasized;
    private final TextStyle bodySmall;
    private final TextStyle bodySmallEmphasized;
    private final TextStyle displayLarge;
    private final TextStyle displayLargeEmphasized;
    private final TextStyle displayMedium;
    private final TextStyle displayMediumEmphasized;
    private final TextStyle displaySmall;
    private final TextStyle displaySmallEmphasized;
    private final TextStyle headlineLarge;
    private final TextStyle headlineLargeEmphasized;
    private final TextStyle headlineMedium;
    private final TextStyle headlineMediumEmphasized;
    private final TextStyle headlineSmall;
    private final TextStyle headlineSmallEmphasized;
    private final TextStyle labelLarge;
    private final TextStyle labelLargeEmphasized;
    private final TextStyle labelMedium;
    private final TextStyle labelMediumEmphasized;
    private final TextStyle labelSmall;
    private final TextStyle labelSmallEmphasized;
    private final TextStyle titleLarge;
    private final TextStyle titleLargeEmphasized;
    private final TextStyle titleMedium;
    private final TextStyle titleMediumEmphasized;
    private final TextStyle titleSmall;
    private final TextStyle titleSmallEmphasized;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, TextStyle textStyle16, TextStyle textStyle17, TextStyle textStyle18, TextStyle textStyle19, TextStyle textStyle20, TextStyle textStyle21, TextStyle textStyle22, TextStyle textStyle23, TextStyle textStyle24, TextStyle textStyle25, TextStyle textStyle26, TextStyle textStyle27, TextStyle textStyle28, TextStyle textStyle29, TextStyle textStyle30, int i2, o oVar) {
        TextStyle textStyleM10559copyp1EtxEg$default;
        TextStyle textStyleM10559copyp1EtxEg$default2;
        TextStyle textStyleM10559copyp1EtxEg$default3;
        TextStyle textStyleM10559copyp1EtxEg$default4;
        TextStyle textStyleM10559copyp1EtxEg$default5;
        TextStyle textStyleM10559copyp1EtxEg$default6;
        TextStyle textStyleM10559copyp1EtxEg$default7;
        TextStyle textStyleM10559copyp1EtxEg$default8;
        TextStyle textStyleM10559copyp1EtxEg$default9;
        TextStyle textStyleM10559copyp1EtxEg$default10;
        TextStyle textStyleM10559copyp1EtxEg$default11;
        TextStyle textStyleM10559copyp1EtxEg$default12;
        TextStyle textStyleM10559copyp1EtxEg$default13;
        TextStyle textStyleM10559copyp1EtxEg$default14;
        TextStyle textStyleM10559copyp1EtxEg$default15;
        TextStyle textStyleM10559copyp1EtxEg$default16;
        TextStyle textStyleM10559copyp1EtxEg$default17;
        TextStyle textStyleM10559copyp1EtxEg$default18;
        TextStyle textStyleM10559copyp1EtxEg$default19;
        TextStyle textStyleM10559copyp1EtxEg$default20;
        TextStyle textStyleM10559copyp1EtxEg$default21;
        TextStyle textStyleM10559copyp1EtxEg$default22;
        TextStyle textStyleM10559copyp1EtxEg$default23;
        TextStyle textStyleM10559copyp1EtxEg$default24;
        TextStyle textStyleM10559copyp1EtxEg$default25;
        TextStyle textStyleM10559copyp1EtxEg$default26;
        TextStyle textStyleM10559copyp1EtxEg$default27;
        TextStyle textStyleM10559copyp1EtxEg$default28;
        TextStyle textStyleM10559copyp1EtxEg$default29;
        TextStyle textStyleM10559copyp1EtxEg$default30;
        if ((i2 & 1) != 0) {
            TypographyTokens typographyTokens = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily = typographyTokens.getFontFamily();
            textStyleM10559copyp1EtxEg$default = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7198getDisplayLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getDisplayLargeWeight(), null, null, fontFamily == null ? TypeScaleTokens.INSTANCE.getDisplayLargeFont() : fontFamily, null, TypeScaleTokens.INSTANCE.m7199getDisplayLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7197getDisplayLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default = textStyle;
        }
        if ((i2 & 2) != 0) {
            TypographyTokens typographyTokens2 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle2 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily2 = typographyTokens2.getFontFamily();
            textStyleM10559copyp1EtxEg$default2 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle2, 0L, TypeScaleTokens.INSTANCE.m7204getDisplayMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getDisplayMediumWeight(), null, null, fontFamily2 == null ? TypeScaleTokens.INSTANCE.getDisplayMediumFont() : fontFamily2, null, TypeScaleTokens.INSTANCE.m7205getDisplayMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7203getDisplayMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default2 = textStyle2;
        }
        if ((i2 & 4) != 0) {
            TypographyTokens typographyTokens3 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle3 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily3 = typographyTokens3.getFontFamily();
            textStyleM10559copyp1EtxEg$default3 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle3, 0L, TypeScaleTokens.INSTANCE.m7210getDisplaySmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getDisplaySmallWeight(), null, null, fontFamily3 == null ? TypeScaleTokens.INSTANCE.getDisplaySmallFont() : fontFamily3, null, TypeScaleTokens.INSTANCE.m7211getDisplaySmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7209getDisplaySmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default3 = textStyle3;
        }
        if ((i2 & 8) != 0) {
            TypographyTokens typographyTokens4 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle4 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily4 = typographyTokens4.getFontFamily();
            textStyleM10559copyp1EtxEg$default4 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle4, 0L, TypeScaleTokens.INSTANCE.m7216getHeadlineLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getHeadlineLargeWeight(), null, null, fontFamily4 == null ? TypeScaleTokens.INSTANCE.getHeadlineLargeFont() : fontFamily4, null, TypeScaleTokens.INSTANCE.m7217getHeadlineLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7215getHeadlineLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default4 = textStyle4;
        }
        if ((i2 & 16) != 0) {
            TypographyTokens typographyTokens5 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle5 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily5 = typographyTokens5.getFontFamily();
            textStyleM10559copyp1EtxEg$default5 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle5, 0L, TypeScaleTokens.INSTANCE.m7222getHeadlineMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getHeadlineMediumWeight(), null, null, fontFamily5 == null ? TypeScaleTokens.INSTANCE.getHeadlineMediumFont() : fontFamily5, null, TypeScaleTokens.INSTANCE.m7223getHeadlineMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7221getHeadlineMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default5 = textStyle5;
        }
        if ((i2 & 32) != 0) {
            TypographyTokens typographyTokens6 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle6 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily6 = typographyTokens6.getFontFamily();
            textStyleM10559copyp1EtxEg$default6 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle6, 0L, TypeScaleTokens.INSTANCE.m7228getHeadlineSmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getHeadlineSmallWeight(), null, null, fontFamily6 == null ? TypeScaleTokens.INSTANCE.getHeadlineSmallFont() : fontFamily6, null, TypeScaleTokens.INSTANCE.m7229getHeadlineSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7227getHeadlineSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default6 = textStyle6;
        }
        if ((i2 & 64) != 0) {
            TypographyTokens typographyTokens7 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle7 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily7 = typographyTokens7.getFontFamily();
            textStyleM10559copyp1EtxEg$default7 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle7, 0L, TypeScaleTokens.INSTANCE.m7252getTitleLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getTitleLargeWeight(), null, null, fontFamily7 == null ? TypeScaleTokens.INSTANCE.getTitleLargeFont() : fontFamily7, null, TypeScaleTokens.INSTANCE.m7253getTitleLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7251getTitleLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default7 = textStyle7;
        }
        if ((i2 & 128) != 0) {
            TypographyTokens typographyTokens8 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle8 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily8 = typographyTokens8.getFontFamily();
            textStyleM10559copyp1EtxEg$default8 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle8, 0L, TypeScaleTokens.INSTANCE.m7258getTitleMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getTitleMediumWeight(), null, null, fontFamily8 == null ? TypeScaleTokens.INSTANCE.getTitleMediumFont() : fontFamily8, null, TypeScaleTokens.INSTANCE.m7259getTitleMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7257getTitleMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default8 = textStyle8;
        }
        if ((i2 & 256) != 0) {
            TypographyTokens typographyTokens9 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle9 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily9 = typographyTokens9.getFontFamily();
            textStyleM10559copyp1EtxEg$default9 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle9, 0L, TypeScaleTokens.INSTANCE.m7264getTitleSmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getTitleSmallWeight(), null, null, fontFamily9 == null ? TypeScaleTokens.INSTANCE.getTitleSmallFont() : fontFamily9, null, TypeScaleTokens.INSTANCE.m7265getTitleSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7263getTitleSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default9 = textStyle9;
        }
        if ((i2 & 512) != 0) {
            TypographyTokens typographyTokens10 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle10 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily10 = typographyTokens10.getFontFamily();
            textStyleM10559copyp1EtxEg$default10 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle10, 0L, TypeScaleTokens.INSTANCE.m7180getBodyLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getBodyLargeWeight(), null, null, fontFamily10 == null ? TypeScaleTokens.INSTANCE.getBodyLargeFont() : fontFamily10, null, TypeScaleTokens.INSTANCE.m7181getBodyLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7179getBodyLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default10 = textStyle10;
        }
        if ((i2 & 1024) != 0) {
            TypographyTokens typographyTokens11 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle11 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily11 = typographyTokens11.getFontFamily();
            textStyleM10559copyp1EtxEg$default11 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle11, 0L, TypeScaleTokens.INSTANCE.m7186getBodyMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getBodyMediumWeight(), null, null, fontFamily11 == null ? TypeScaleTokens.INSTANCE.getBodyMediumFont() : fontFamily11, null, TypeScaleTokens.INSTANCE.m7187getBodyMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7185getBodyMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default11 = textStyle11;
        }
        if ((i2 & 2048) != 0) {
            TypographyTokens typographyTokens12 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle12 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily12 = typographyTokens12.getFontFamily();
            textStyleM10559copyp1EtxEg$default12 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle12, 0L, TypeScaleTokens.INSTANCE.m7192getBodySmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getBodySmallWeight(), null, null, fontFamily12 == null ? TypeScaleTokens.INSTANCE.getBodySmallFont() : fontFamily12, null, TypeScaleTokens.INSTANCE.m7193getBodySmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7191getBodySmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default12 = textStyle12;
        }
        if ((i2 & 4096) != 0) {
            TypographyTokens typographyTokens13 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle13 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily13 = typographyTokens13.getFontFamily();
            textStyleM10559copyp1EtxEg$default13 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle13, 0L, TypeScaleTokens.INSTANCE.m7234getLabelLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getLabelLargeWeight(), null, null, fontFamily13 == null ? TypeScaleTokens.INSTANCE.getLabelLargeFont() : fontFamily13, null, TypeScaleTokens.INSTANCE.m7235getLabelLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7233getLabelLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default13 = textStyle13;
        }
        if ((i2 & 8192) != 0) {
            TypographyTokens typographyTokens14 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle14 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily14 = typographyTokens14.getFontFamily();
            textStyleM10559copyp1EtxEg$default14 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle14, 0L, TypeScaleTokens.INSTANCE.m7240getLabelMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getLabelMediumWeight(), null, null, fontFamily14 == null ? TypeScaleTokens.INSTANCE.getLabelMediumFont() : fontFamily14, null, TypeScaleTokens.INSTANCE.m7241getLabelMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7239getLabelMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default14 = textStyle14;
        }
        if ((i2 & 16384) != 0) {
            TypographyTokens typographyTokens15 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle15 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily15 = typographyTokens15.getFontFamily();
            textStyleM10559copyp1EtxEg$default15 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle15, 0L, TypeScaleTokens.INSTANCE.m7246getLabelSmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getLabelSmallWeight(), null, null, fontFamily15 == null ? TypeScaleTokens.INSTANCE.getLabelSmallFont() : fontFamily15, null, TypeScaleTokens.INSTANCE.m7247getLabelSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7245getLabelSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default15 = textStyle15;
        }
        if ((i2 & 32768) != 0) {
            TypographyTokens typographyTokens16 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle16 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily16 = typographyTokens16.getFontFamily();
            textStyleM10559copyp1EtxEg$default16 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle16, 0L, TypeScaleTokens.INSTANCE.m7195getDisplayLargeEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getDisplayLargeEmphasizedWeight(), null, null, fontFamily16 == null ? TypeScaleTokens.INSTANCE.getDisplayLargeEmphasizedFont() : fontFamily16, null, TypeScaleTokens.INSTANCE.m7196getDisplayLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7194getDisplayLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default16 = textStyle16;
        }
        if ((i2 & 65536) != 0) {
            TypographyTokens typographyTokens17 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle17 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily17 = typographyTokens17.getFontFamily();
            textStyleM10559copyp1EtxEg$default17 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle17, 0L, TypeScaleTokens.INSTANCE.m7201getDisplayMediumEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getDisplayMediumEmphasizedWeight(), null, null, fontFamily17 == null ? TypeScaleTokens.INSTANCE.getDisplayMediumEmphasizedFont() : fontFamily17, null, TypeScaleTokens.INSTANCE.m7202getDisplayMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7200getDisplayMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default17 = textStyle17;
        }
        if ((i2 & 131072) != 0) {
            TypographyTokens typographyTokens18 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle18 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily18 = typographyTokens18.getFontFamily();
            textStyleM10559copyp1EtxEg$default18 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle18, 0L, TypeScaleTokens.INSTANCE.m7207getDisplaySmallEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getDisplaySmallEmphasizedWeight(), null, null, fontFamily18 == null ? TypeScaleTokens.INSTANCE.getDisplaySmallEmphasizedFont() : fontFamily18, null, TypeScaleTokens.INSTANCE.m7208getDisplaySmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7206getDisplaySmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default18 = textStyle18;
        }
        if ((i2 & 262144) != 0) {
            TypographyTokens typographyTokens19 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle19 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily19 = typographyTokens19.getFontFamily();
            textStyleM10559copyp1EtxEg$default19 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle19, 0L, TypeScaleTokens.INSTANCE.m7213getHeadlineLargeEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getHeadlineLargeEmphasizedWeight(), null, null, fontFamily19 == null ? TypeScaleTokens.INSTANCE.getHeadlineLargeEmphasizedFont() : fontFamily19, null, TypeScaleTokens.INSTANCE.m7214getHeadlineLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7212getHeadlineLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default19 = textStyle19;
        }
        if ((i2 & 524288) != 0) {
            TypographyTokens typographyTokens20 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle20 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily20 = typographyTokens20.getFontFamily();
            textStyleM10559copyp1EtxEg$default20 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle20, 0L, TypeScaleTokens.INSTANCE.m7219getHeadlineMediumEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getHeadlineMediumEmphasizedWeight(), null, null, fontFamily20 == null ? TypeScaleTokens.INSTANCE.getHeadlineMediumEmphasizedFont() : fontFamily20, null, TypeScaleTokens.INSTANCE.m7220getHeadlineMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7218getHeadlineMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default20 = textStyle20;
        }
        if ((i2 & 1048576) != 0) {
            TypographyTokens typographyTokens21 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle21 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily21 = typographyTokens21.getFontFamily();
            textStyleM10559copyp1EtxEg$default21 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle21, 0L, TypeScaleTokens.INSTANCE.m7225getHeadlineSmallEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getHeadlineSmallEmphasizedWeight(), null, null, fontFamily21 == null ? TypeScaleTokens.INSTANCE.getHeadlineSmallEmphasizedFont() : fontFamily21, null, TypeScaleTokens.INSTANCE.m7226getHeadlineSmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7224getHeadlineSmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default21 = textStyle21;
        }
        if ((i2 & 2097152) != 0) {
            TypographyTokens typographyTokens22 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle22 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily22 = typographyTokens22.getFontFamily();
            textStyleM10559copyp1EtxEg$default22 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle22, 0L, TypeScaleTokens.INSTANCE.m7249getTitleLargeEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getTitleLargeEmphasizedWeight(), null, null, fontFamily22 == null ? TypeScaleTokens.INSTANCE.getTitleLargeEmphasizedFont() : fontFamily22, null, TypeScaleTokens.INSTANCE.m7250getTitleLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7248getTitleLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default22 = textStyle22;
        }
        if ((i2 & 4194304) != 0) {
            TypographyTokens typographyTokens23 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle23 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily23 = typographyTokens23.getFontFamily();
            textStyleM10559copyp1EtxEg$default23 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle23, 0L, TypeScaleTokens.INSTANCE.m7255getTitleMediumEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getTitleMediumEmphasizedWeight(), null, null, fontFamily23 == null ? TypeScaleTokens.INSTANCE.getTitleMediumEmphasizedFont() : fontFamily23, null, TypeScaleTokens.INSTANCE.m7256getTitleMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7254getTitleMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default23 = textStyle23;
        }
        if ((i2 & 8388608) != 0) {
            TypographyTokens typographyTokens24 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle24 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily24 = typographyTokens24.getFontFamily();
            textStyleM10559copyp1EtxEg$default24 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle24, 0L, TypeScaleTokens.INSTANCE.m7261getTitleSmallEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getTitleSmallEmphasizedWeight(), null, null, fontFamily24 == null ? TypeScaleTokens.INSTANCE.getTitleSmallEmphasizedFont() : fontFamily24, null, TypeScaleTokens.INSTANCE.m7262getTitleSmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7260getTitleSmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default24 = textStyle24;
        }
        if ((i2 & 16777216) != 0) {
            TypographyTokens typographyTokens25 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle25 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily25 = typographyTokens25.getFontFamily();
            textStyleM10559copyp1EtxEg$default25 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle25, 0L, TypeScaleTokens.INSTANCE.m7177getBodyLargeEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getBodyLargeEmphasizedWeight(), null, null, fontFamily25 == null ? TypeScaleTokens.INSTANCE.getBodyLargeEmphasizedFont() : fontFamily25, null, TypeScaleTokens.INSTANCE.m7178getBodyLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7176getBodyLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default25 = textStyle25;
        }
        if ((i2 & GroupFlagsKt.HasAuxSlotFlag) != 0) {
            TypographyTokens typographyTokens26 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle26 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily26 = typographyTokens26.getFontFamily();
            textStyleM10559copyp1EtxEg$default26 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle26, 0L, TypeScaleTokens.INSTANCE.m7183getBodyMediumEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getBodyMediumEmphasizedWeight(), null, null, fontFamily26 == null ? TypeScaleTokens.INSTANCE.getBodyMediumEmphasizedFont() : fontFamily26, null, TypeScaleTokens.INSTANCE.m7184getBodyMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7182getBodyMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default26 = textStyle26;
        }
        if ((i2 & 67108864) != 0) {
            TypographyTokens typographyTokens27 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle27 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily27 = typographyTokens27.getFontFamily();
            textStyleM10559copyp1EtxEg$default27 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle27, 0L, TypeScaleTokens.INSTANCE.m7189getBodySmallEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getBodySmallEmphasizedWeight(), null, null, fontFamily27 == null ? TypeScaleTokens.INSTANCE.getBodySmallEmphasizedFont() : fontFamily27, null, TypeScaleTokens.INSTANCE.m7190getBodySmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7188getBodySmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default27 = textStyle27;
        }
        if ((i2 & 134217728) != 0) {
            TypographyTokens typographyTokens28 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle28 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily28 = typographyTokens28.getFontFamily();
            textStyleM10559copyp1EtxEg$default28 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle28, 0L, TypeScaleTokens.INSTANCE.m7231getLabelLargeEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getLabelLargeEmphasizedWeight(), null, null, fontFamily28 == null ? TypeScaleTokens.INSTANCE.getLabelLargeEmphasizedFont() : fontFamily28, null, TypeScaleTokens.INSTANCE.m7232getLabelLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7230getLabelLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default28 = textStyle28;
        }
        if ((i2 & 268435456) != 0) {
            TypographyTokens typographyTokens29 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle29 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily29 = typographyTokens29.getFontFamily();
            textStyleM10559copyp1EtxEg$default29 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle29, 0L, TypeScaleTokens.INSTANCE.m7237getLabelMediumEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getLabelMediumEmphasizedWeight(), null, null, fontFamily29 == null ? TypeScaleTokens.INSTANCE.getLabelMediumEmphasizedFont() : fontFamily29, null, TypeScaleTokens.INSTANCE.m7238getLabelMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7236getLabelMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default29 = textStyle29;
        }
        if ((i2 & 536870912) != 0) {
            TypographyTokens typographyTokens30 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle30 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily30 = typographyTokens30.getFontFamily();
            textStyleM10559copyp1EtxEg$default30 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle30, 0L, TypeScaleTokens.INSTANCE.m7243getLabelSmallEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getLabelSmallEmphasizedWeight(), null, null, fontFamily30 == null ? TypeScaleTokens.INSTANCE.getLabelSmallEmphasizedFont() : fontFamily30, null, TypeScaleTokens.INSTANCE.m7244getLabelSmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7242getLabelSmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default30 = textStyle30;
        }
        this(textStyleM10559copyp1EtxEg$default, textStyleM10559copyp1EtxEg$default2, textStyleM10559copyp1EtxEg$default3, textStyleM10559copyp1EtxEg$default4, textStyleM10559copyp1EtxEg$default5, textStyleM10559copyp1EtxEg$default6, textStyleM10559copyp1EtxEg$default7, textStyleM10559copyp1EtxEg$default8, textStyleM10559copyp1EtxEg$default9, textStyleM10559copyp1EtxEg$default10, textStyleM10559copyp1EtxEg$default11, textStyleM10559copyp1EtxEg$default12, textStyleM10559copyp1EtxEg$default13, textStyleM10559copyp1EtxEg$default14, textStyleM10559copyp1EtxEg$default15, textStyleM10559copyp1EtxEg$default16, textStyleM10559copyp1EtxEg$default17, textStyleM10559copyp1EtxEg$default18, textStyleM10559copyp1EtxEg$default19, textStyleM10559copyp1EtxEg$default20, textStyleM10559copyp1EtxEg$default21, textStyleM10559copyp1EtxEg$default22, textStyleM10559copyp1EtxEg$default23, textStyleM10559copyp1EtxEg$default24, textStyleM10559copyp1EtxEg$default25, textStyleM10559copyp1EtxEg$default26, textStyleM10559copyp1EtxEg$default27, textStyleM10559copyp1EtxEg$default28, textStyleM10559copyp1EtxEg$default29, textStyleM10559copyp1EtxEg$default30);
    }

    public static /* synthetic */ Typography copy$default(Typography typography, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, TextStyle textStyle16, TextStyle textStyle17, TextStyle textStyle18, TextStyle textStyle19, TextStyle textStyle20, TextStyle textStyle21, TextStyle textStyle22, TextStyle textStyle23, TextStyle textStyle24, TextStyle textStyle25, TextStyle textStyle26, TextStyle textStyle27, TextStyle textStyle28, TextStyle textStyle29, TextStyle textStyle30, int i2, Object obj) {
        TextStyle textStyle31;
        TextStyle textStyle32;
        TextStyle textStyle33 = (i2 & 1) != 0 ? typography.displayLarge : textStyle;
        TextStyle textStyle34 = (i2 & 2) != 0 ? typography.displayMedium : textStyle2;
        TextStyle textStyle35 = (i2 & 4) != 0 ? typography.displaySmall : textStyle3;
        TextStyle textStyle36 = (i2 & 8) != 0 ? typography.headlineLarge : textStyle4;
        TextStyle textStyle37 = (i2 & 16) != 0 ? typography.headlineMedium : textStyle5;
        TextStyle textStyle38 = (i2 & 32) != 0 ? typography.headlineSmall : textStyle6;
        TextStyle textStyle39 = (i2 & 64) != 0 ? typography.titleLarge : textStyle7;
        TextStyle textStyle40 = (i2 & 128) != 0 ? typography.titleMedium : textStyle8;
        TextStyle textStyle41 = (i2 & 256) != 0 ? typography.titleSmall : textStyle9;
        TextStyle textStyle42 = (i2 & 512) != 0 ? typography.bodyLarge : textStyle10;
        TextStyle textStyle43 = (i2 & 1024) != 0 ? typography.bodyMedium : textStyle11;
        TextStyle textStyle44 = (i2 & 2048) != 0 ? typography.bodySmall : textStyle12;
        TextStyle textStyle45 = (i2 & 4096) != 0 ? typography.labelLarge : textStyle13;
        TextStyle textStyle46 = (i2 & 8192) != 0 ? typography.labelMedium : textStyle14;
        TextStyle textStyle47 = textStyle33;
        TextStyle textStyle48 = (i2 & 16384) != 0 ? typography.labelSmall : textStyle15;
        TextStyle textStyle49 = (i2 & 32768) != 0 ? typography.displayLargeEmphasized : textStyle16;
        TextStyle textStyle50 = (i2 & 65536) != 0 ? typography.displayMediumEmphasized : textStyle17;
        TextStyle textStyle51 = (i2 & 131072) != 0 ? typography.displaySmallEmphasized : textStyle18;
        TextStyle textStyle52 = (i2 & 262144) != 0 ? typography.headlineLargeEmphasized : textStyle19;
        TextStyle textStyle53 = (i2 & 524288) != 0 ? typography.headlineMediumEmphasized : textStyle20;
        TextStyle textStyle54 = (i2 & 1048576) != 0 ? typography.headlineSmallEmphasized : textStyle21;
        TextStyle textStyle55 = (i2 & 2097152) != 0 ? typography.titleLargeEmphasized : textStyle22;
        TextStyle textStyle56 = (i2 & 4194304) != 0 ? typography.titleMediumEmphasized : textStyle23;
        TextStyle textStyle57 = (i2 & 8388608) != 0 ? typography.titleSmallEmphasized : textStyle24;
        TextStyle textStyle58 = (i2 & 16777216) != 0 ? typography.bodyLargeEmphasized : textStyle25;
        TextStyle textStyle59 = (i2 & GroupFlagsKt.HasAuxSlotFlag) != 0 ? typography.bodyMediumEmphasized : textStyle26;
        TextStyle textStyle60 = (i2 & 67108864) != 0 ? typography.bodySmallEmphasized : textStyle27;
        TextStyle textStyle61 = (i2 & 134217728) != 0 ? typography.labelLargeEmphasized : textStyle28;
        TextStyle textStyle62 = (i2 & 268435456) != 0 ? typography.labelMediumEmphasized : textStyle29;
        if ((i2 & 536870912) != 0) {
            textStyle32 = textStyle62;
            textStyle31 = typography.labelSmallEmphasized;
        } else {
            textStyle31 = textStyle30;
            textStyle32 = textStyle62;
        }
        return typography.copy(textStyle47, textStyle34, textStyle35, textStyle36, textStyle37, textStyle38, textStyle39, textStyle40, textStyle41, textStyle42, textStyle43, textStyle44, textStyle45, textStyle46, textStyle48, textStyle49, textStyle50, textStyle51, textStyle52, textStyle53, textStyle54, textStyle55, textStyle56, textStyle57, textStyle58, textStyle59, textStyle60, textStyle61, textStyle32, textStyle31);
    }

    public final Typography copy(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15) {
        return copy(textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, textStyle15, this.displayLargeEmphasized, this.displayMediumEmphasized, this.displaySmallEmphasized, this.headlineLargeEmphasized, this.headlineMediumEmphasized, this.headlineSmallEmphasized, this.titleLargeEmphasized, this.titleMediumEmphasized, this.titleSmallEmphasized, this.bodyLargeEmphasized, this.bodyMediumEmphasized, this.bodySmallEmphasized, this.labelLargeEmphasized, this.labelMediumEmphasized, this.labelSmallEmphasized);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        return x.n(this.displayLarge, typography.displayLarge) && x.n(this.displayMedium, typography.displayMedium) && x.n(this.displaySmall, typography.displaySmall) && x.n(this.headlineLarge, typography.headlineLarge) && x.n(this.headlineMedium, typography.headlineMedium) && x.n(this.headlineSmall, typography.headlineSmall) && x.n(this.titleLarge, typography.titleLarge) && x.n(this.titleMedium, typography.titleMedium) && x.n(this.titleSmall, typography.titleSmall) && x.n(this.bodyLarge, typography.bodyLarge) && x.n(this.bodyMedium, typography.bodyMedium) && x.n(this.bodySmall, typography.bodySmall) && x.n(this.labelLarge, typography.labelLarge) && x.n(this.labelMedium, typography.labelMedium) && x.n(this.labelSmall, typography.labelSmall) && x.n(this.displayLargeEmphasized, typography.displayLargeEmphasized) && x.n(this.displayMediumEmphasized, typography.displayMediumEmphasized) && x.n(this.displaySmallEmphasized, typography.displaySmallEmphasized) && x.n(this.headlineLargeEmphasized, typography.headlineLargeEmphasized) && x.n(this.headlineMediumEmphasized, typography.headlineMediumEmphasized) && x.n(this.headlineSmallEmphasized, typography.headlineSmallEmphasized) && x.n(this.titleLargeEmphasized, typography.titleLargeEmphasized) && x.n(this.titleMediumEmphasized, typography.titleMediumEmphasized) && x.n(this.titleSmallEmphasized, typography.titleSmallEmphasized) && x.n(this.bodyLargeEmphasized, typography.bodyLargeEmphasized) && x.n(this.bodyMediumEmphasized, typography.bodyMediumEmphasized) && x.n(this.bodySmallEmphasized, typography.bodySmallEmphasized) && x.n(this.labelLargeEmphasized, typography.labelLargeEmphasized) && x.n(this.labelMediumEmphasized, typography.labelMediumEmphasized) && x.n(this.labelSmallEmphasized, typography.labelSmallEmphasized);
    }

    public final TextStyle getBodyLarge() {
        return this.bodyLarge;
    }

    public final TextStyle getBodyLargeEmphasized() {
        return this.bodyLargeEmphasized;
    }

    public final TextStyle getBodyMedium() {
        return this.bodyMedium;
    }

    public final TextStyle getBodyMediumEmphasized() {
        return this.bodyMediumEmphasized;
    }

    public final TextStyle getBodySmall() {
        return this.bodySmall;
    }

    public final TextStyle getBodySmallEmphasized() {
        return this.bodySmallEmphasized;
    }

    public final TextStyle getDisplayLarge() {
        return this.displayLarge;
    }

    public final TextStyle getDisplayLargeEmphasized() {
        return this.displayLargeEmphasized;
    }

    public final TextStyle getDisplayMedium() {
        return this.displayMedium;
    }

    public final TextStyle getDisplayMediumEmphasized() {
        return this.displayMediumEmphasized;
    }

    public final TextStyle getDisplaySmall() {
        return this.displaySmall;
    }

    public final TextStyle getDisplaySmallEmphasized() {
        return this.displaySmallEmphasized;
    }

    public final TextStyle getHeadlineLarge() {
        return this.headlineLarge;
    }

    public final TextStyle getHeadlineLargeEmphasized() {
        return this.headlineLargeEmphasized;
    }

    public final TextStyle getHeadlineMedium() {
        return this.headlineMedium;
    }

    public final TextStyle getHeadlineMediumEmphasized() {
        return this.headlineMediumEmphasized;
    }

    public final TextStyle getHeadlineSmall() {
        return this.headlineSmall;
    }

    public final TextStyle getHeadlineSmallEmphasized() {
        return this.headlineSmallEmphasized;
    }

    public final TextStyle getLabelLarge() {
        return this.labelLarge;
    }

    public final TextStyle getLabelLargeEmphasized() {
        return this.labelLargeEmphasized;
    }

    public final TextStyle getLabelMedium() {
        return this.labelMedium;
    }

    public final TextStyle getLabelMediumEmphasized() {
        return this.labelMediumEmphasized;
    }

    public final TextStyle getLabelSmall() {
        return this.labelSmall;
    }

    public final TextStyle getLabelSmallEmphasized() {
        return this.labelSmallEmphasized;
    }

    public final TextStyle getTitleLarge() {
        return this.titleLarge;
    }

    public final TextStyle getTitleLargeEmphasized() {
        return this.titleLargeEmphasized;
    }

    public final TextStyle getTitleMedium() {
        return this.titleMedium;
    }

    public final TextStyle getTitleMediumEmphasized() {
        return this.titleMediumEmphasized;
    }

    public final TextStyle getTitleSmall() {
        return this.titleSmall;
    }

    public final TextStyle getTitleSmallEmphasized() {
        return this.titleSmallEmphasized;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.displayLarge.hashCode() * 31) + this.displayMedium.hashCode()) * 31) + this.displaySmall.hashCode()) * 31) + this.headlineLarge.hashCode()) * 31) + this.headlineMedium.hashCode()) * 31) + this.headlineSmall.hashCode()) * 31) + this.titleLarge.hashCode()) * 31) + this.titleMedium.hashCode()) * 31) + this.titleSmall.hashCode()) * 31) + this.bodyLarge.hashCode()) * 31) + this.bodyMedium.hashCode()) * 31) + this.bodySmall.hashCode()) * 31) + this.labelLarge.hashCode()) * 31) + this.labelMedium.hashCode()) * 31) + this.labelSmall.hashCode()) * 31) + this.displayLargeEmphasized.hashCode()) * 31) + this.displayMediumEmphasized.hashCode()) * 31) + this.displaySmallEmphasized.hashCode()) * 31) + this.headlineLargeEmphasized.hashCode()) * 31) + this.headlineMediumEmphasized.hashCode()) * 31) + this.headlineSmallEmphasized.hashCode()) * 31) + this.titleLargeEmphasized.hashCode()) * 31) + this.titleMediumEmphasized.hashCode()) * 31) + this.titleSmallEmphasized.hashCode()) * 31) + this.bodyLargeEmphasized.hashCode()) * 31) + this.bodyMediumEmphasized.hashCode()) * 31) + this.bodySmallEmphasized.hashCode()) * 31) + this.labelLargeEmphasized.hashCode()) * 31) + this.labelMediumEmphasized.hashCode()) * 31) + this.labelSmallEmphasized.hashCode();
    }

    public String toString() {
        return "Typography(displayLarge=" + this.displayLarge + ", displayMedium=" + this.displayMedium + ",displaySmall=" + this.displaySmall + ", headlineLarge=" + this.headlineLarge + ", headlineMedium=" + this.headlineMedium + ", headlineSmall=" + this.headlineSmall + ", titleLarge=" + this.titleLarge + ", titleMedium=" + this.titleMedium + ", titleSmall=" + this.titleSmall + ", bodyLarge=" + this.bodyLarge + ", bodyMedium=" + this.bodyMedium + ", bodySmall=" + this.bodySmall + ", labelLarge=" + this.labelLarge + ", labelMedium=" + this.labelMedium + ", labelSmall=" + this.labelSmall + ", displayLargeEmphasized=" + this.displayLargeEmphasized + ", displayMediumEmphasized=" + this.displayMediumEmphasized + ", displaySmallEmphasized=" + this.displaySmallEmphasized + ", headlineLargeEmphasized=" + this.headlineLargeEmphasized + ", headlineMediumEmphasized=" + this.headlineMediumEmphasized + ", headlineSmallEmphasized=" + this.headlineSmallEmphasized + ", titleLargeEmphasized=" + this.titleLargeEmphasized + ", titleMediumEmphasized=" + this.titleMediumEmphasized + ", titleSmallEmphasized=" + this.titleSmallEmphasized + ", bodyLargeEmphasized=" + this.bodyLargeEmphasized + ", bodyMediumEmphasized=" + this.bodyMediumEmphasized + ", bodySmallEmphasized=" + this.bodySmallEmphasized + ", labelLargeEmphasized=" + this.labelLargeEmphasized + ", labelMediumEmphasized=" + this.labelMediumEmphasized + ", labelSmallEmphasized=" + this.labelSmallEmphasized + ')';
    }

    public final Typography copy(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, TextStyle textStyle16, TextStyle textStyle17, TextStyle textStyle18, TextStyle textStyle19, TextStyle textStyle20, TextStyle textStyle21, TextStyle textStyle22, TextStyle textStyle23, TextStyle textStyle24, TextStyle textStyle25, TextStyle textStyle26, TextStyle textStyle27, TextStyle textStyle28, TextStyle textStyle29, TextStyle textStyle30) {
        return new Typography(textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, textStyle15, textStyle16, textStyle17, textStyle18, textStyle19, textStyle20, textStyle21, textStyle22, textStyle23, textStyle24, textStyle25, textStyle26, textStyle27, textStyle28, textStyle29, textStyle30);
    }

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, TextStyle textStyle16, TextStyle textStyle17, TextStyle textStyle18, TextStyle textStyle19, TextStyle textStyle20, TextStyle textStyle21, TextStyle textStyle22, TextStyle textStyle23, TextStyle textStyle24, TextStyle textStyle25, TextStyle textStyle26, TextStyle textStyle27, TextStyle textStyle28, TextStyle textStyle29, TextStyle textStyle30) {
        this.displayLarge = textStyle;
        this.displayMedium = textStyle2;
        this.displaySmall = textStyle3;
        this.headlineLarge = textStyle4;
        this.headlineMedium = textStyle5;
        this.headlineSmall = textStyle6;
        this.titleLarge = textStyle7;
        this.titleMedium = textStyle8;
        this.titleSmall = textStyle9;
        this.bodyLarge = textStyle10;
        this.bodyMedium = textStyle11;
        this.bodySmall = textStyle12;
        this.labelLarge = textStyle13;
        this.labelMedium = textStyle14;
        this.labelSmall = textStyle15;
        this.displayLargeEmphasized = textStyle16;
        this.displayMediumEmphasized = textStyle17;
        this.displaySmallEmphasized = textStyle18;
        this.headlineLargeEmphasized = textStyle19;
        this.headlineMediumEmphasized = textStyle20;
        this.headlineSmallEmphasized = textStyle21;
        this.titleLargeEmphasized = textStyle22;
        this.titleMediumEmphasized = textStyle23;
        this.titleSmallEmphasized = textStyle24;
        this.bodyLargeEmphasized = textStyle25;
        this.bodyMediumEmphasized = textStyle26;
        this.bodySmallEmphasized = textStyle27;
        this.labelLargeEmphasized = textStyle28;
        this.labelMediumEmphasized = textStyle29;
        this.labelSmallEmphasized = textStyle30;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private Typography(TypographyTokens typographyTokens, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, TextStyle textStyle16, TextStyle textStyle17, TextStyle textStyle18, TextStyle textStyle19, TextStyle textStyle20, TextStyle textStyle21, TextStyle textStyle22, TextStyle textStyle23, TextStyle textStyle24, TextStyle textStyle25, TextStyle textStyle26, TextStyle textStyle27, TextStyle textStyle28, TextStyle textStyle29, TextStyle textStyle30) {
        TextStyle textStyleWithDefaultFontFamily = TypographyKt.withDefaultFontFamily(textStyle, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily == null) {
            TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7198getDisplayLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getDisplayLargeWeight(), null, null, fontFamily == null ? TypeScaleTokens.INSTANCE.getDisplayLargeFont() : fontFamily, null, TypeScaleTokens.INSTANCE.m7199getDisplayLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7197getDisplayLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyleWithDefaultFontFamily2 = TypographyKt.withDefaultFontFamily(textStyle2, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily2 == null) {
            TextStyle defaultTextStyle2 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily2 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily2 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle2, 0L, TypeScaleTokens.INSTANCE.m7204getDisplayMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getDisplayMediumWeight(), null, null, fontFamily2 == null ? TypeScaleTokens.INSTANCE.getDisplayMediumFont() : fontFamily2, null, TypeScaleTokens.INSTANCE.m7205getDisplayMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7203getDisplayMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyleWithDefaultFontFamily3 = TypographyKt.withDefaultFontFamily(textStyle3, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily3 == null) {
            TextStyle defaultTextStyle3 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily3 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily3 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle3, 0L, TypeScaleTokens.INSTANCE.m7210getDisplaySmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getDisplaySmallWeight(), null, null, fontFamily3 == null ? TypeScaleTokens.INSTANCE.getDisplaySmallFont() : fontFamily3, null, TypeScaleTokens.INSTANCE.m7211getDisplaySmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7209getDisplaySmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyleWithDefaultFontFamily4 = TypographyKt.withDefaultFontFamily(textStyle4, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily4 == null) {
            TextStyle defaultTextStyle4 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily4 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily4 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle4, 0L, TypeScaleTokens.INSTANCE.m7216getHeadlineLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getHeadlineLargeWeight(), null, null, fontFamily4 == null ? TypeScaleTokens.INSTANCE.getHeadlineLargeFont() : fontFamily4, null, TypeScaleTokens.INSTANCE.m7217getHeadlineLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7215getHeadlineLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyleWithDefaultFontFamily5 = TypographyKt.withDefaultFontFamily(textStyle5, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily5 == null) {
            TextStyle defaultTextStyle5 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily5 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily5 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle5, 0L, TypeScaleTokens.INSTANCE.m7222getHeadlineMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getHeadlineMediumWeight(), null, null, fontFamily5 == null ? TypeScaleTokens.INSTANCE.getHeadlineMediumFont() : fontFamily5, null, TypeScaleTokens.INSTANCE.m7223getHeadlineMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7221getHeadlineMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyleWithDefaultFontFamily6 = TypographyKt.withDefaultFontFamily(textStyle6, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily6 == null) {
            TextStyle defaultTextStyle6 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily6 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily6 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle6, 0L, TypeScaleTokens.INSTANCE.m7228getHeadlineSmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getHeadlineSmallWeight(), null, null, fontFamily6 == null ? TypeScaleTokens.INSTANCE.getHeadlineSmallFont() : fontFamily6, null, TypeScaleTokens.INSTANCE.m7229getHeadlineSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7227getHeadlineSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyleWithDefaultFontFamily7 = TypographyKt.withDefaultFontFamily(textStyle7, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily7 == null) {
            TextStyle defaultTextStyle7 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily7 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily7 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle7, 0L, TypeScaleTokens.INSTANCE.m7252getTitleLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getTitleLargeWeight(), null, null, fontFamily7 == null ? TypeScaleTokens.INSTANCE.getTitleLargeFont() : fontFamily7, null, TypeScaleTokens.INSTANCE.m7253getTitleLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7251getTitleLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyleWithDefaultFontFamily8 = TypographyKt.withDefaultFontFamily(textStyle8, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily8 == null) {
            TextStyle defaultTextStyle8 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily8 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily8 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle8, 0L, TypeScaleTokens.INSTANCE.m7258getTitleMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getTitleMediumWeight(), null, null, fontFamily8 == null ? TypeScaleTokens.INSTANCE.getTitleMediumFont() : fontFamily8, null, TypeScaleTokens.INSTANCE.m7259getTitleMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7257getTitleMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyleWithDefaultFontFamily9 = TypographyKt.withDefaultFontFamily(textStyle9, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily9 == null) {
            TextStyle defaultTextStyle9 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily9 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily9 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle9, 0L, TypeScaleTokens.INSTANCE.m7264getTitleSmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getTitleSmallWeight(), null, null, fontFamily9 == null ? TypeScaleTokens.INSTANCE.getTitleSmallFont() : fontFamily9, null, TypeScaleTokens.INSTANCE.m7265getTitleSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7263getTitleSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyleWithDefaultFontFamily10 = TypographyKt.withDefaultFontFamily(textStyle10, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily10 == null) {
            TextStyle defaultTextStyle10 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily10 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily10 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle10, 0L, TypeScaleTokens.INSTANCE.m7180getBodyLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getBodyLargeWeight(), null, null, fontFamily10 == null ? TypeScaleTokens.INSTANCE.getBodyLargeFont() : fontFamily10, null, TypeScaleTokens.INSTANCE.m7181getBodyLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7179getBodyLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyleWithDefaultFontFamily11 = TypographyKt.withDefaultFontFamily(textStyle11, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily11 == null) {
            TextStyle defaultTextStyle11 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily11 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily11 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle11, 0L, TypeScaleTokens.INSTANCE.m7186getBodyMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getBodyMediumWeight(), null, null, fontFamily11 == null ? TypeScaleTokens.INSTANCE.getBodyMediumFont() : fontFamily11, null, TypeScaleTokens.INSTANCE.m7187getBodyMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7185getBodyMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyleWithDefaultFontFamily12 = TypographyKt.withDefaultFontFamily(textStyle12, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily12 == null) {
            TextStyle defaultTextStyle12 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily12 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily12 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle12, 0L, TypeScaleTokens.INSTANCE.m7192getBodySmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getBodySmallWeight(), null, null, fontFamily12 == null ? TypeScaleTokens.INSTANCE.getBodySmallFont() : fontFamily12, null, TypeScaleTokens.INSTANCE.m7193getBodySmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7191getBodySmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyleWithDefaultFontFamily13 = TypographyKt.withDefaultFontFamily(textStyle13, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily13 == null) {
            TextStyle defaultTextStyle13 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily13 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily13 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle13, 0L, TypeScaleTokens.INSTANCE.m7234getLabelLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getLabelLargeWeight(), null, null, fontFamily13 == null ? TypeScaleTokens.INSTANCE.getLabelLargeFont() : fontFamily13, null, TypeScaleTokens.INSTANCE.m7235getLabelLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7233getLabelLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyleWithDefaultFontFamily14 = TypographyKt.withDefaultFontFamily(textStyle14, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily14 == null) {
            TextStyle defaultTextStyle14 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily14 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily14 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle14, 0L, TypeScaleTokens.INSTANCE.m7240getLabelMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getLabelMediumWeight(), null, null, fontFamily14 == null ? TypeScaleTokens.INSTANCE.getLabelMediumFont() : fontFamily14, null, TypeScaleTokens.INSTANCE.m7241getLabelMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7239getLabelMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyleWithDefaultFontFamily15 = TypographyKt.withDefaultFontFamily(textStyle15, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily15 == null) {
            TextStyle defaultTextStyle15 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily15 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily15 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle15, 0L, TypeScaleTokens.INSTANCE.m7246getLabelSmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getLabelSmallWeight(), null, null, fontFamily15 == null ? TypeScaleTokens.INSTANCE.getLabelSmallFont() : fontFamily15, null, TypeScaleTokens.INSTANCE.m7247getLabelSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7245getLabelSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyle31 = textStyleWithDefaultFontFamily;
        TextStyle textStyleWithDefaultFontFamily16 = TypographyKt.withDefaultFontFamily(textStyle16, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily16 == null) {
            TextStyle defaultTextStyle16 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily16 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily16 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle16, 0L, TypeScaleTokens.INSTANCE.m7195getDisplayLargeEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getDisplayLargeEmphasizedWeight(), null, null, fontFamily16 == null ? TypeScaleTokens.INSTANCE.getDisplayLargeEmphasizedFont() : fontFamily16, null, TypeScaleTokens.INSTANCE.m7196getDisplayLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7194getDisplayLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyle32 = textStyleWithDefaultFontFamily16;
        TextStyle textStyleWithDefaultFontFamily17 = TypographyKt.withDefaultFontFamily(textStyle17, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily17 == null) {
            TextStyle defaultTextStyle17 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily17 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily17 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle17, 0L, TypeScaleTokens.INSTANCE.m7201getDisplayMediumEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getDisplayMediumEmphasizedWeight(), null, null, fontFamily17 == null ? TypeScaleTokens.INSTANCE.getDisplayMediumEmphasizedFont() : fontFamily17, null, TypeScaleTokens.INSTANCE.m7202getDisplayMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7200getDisplayMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyle33 = textStyleWithDefaultFontFamily17;
        TextStyle textStyleWithDefaultFontFamily18 = TypographyKt.withDefaultFontFamily(textStyle18, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily18 == null) {
            TextStyle defaultTextStyle18 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily18 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily18 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle18, 0L, TypeScaleTokens.INSTANCE.m7207getDisplaySmallEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getDisplaySmallEmphasizedWeight(), null, null, fontFamily18 == null ? TypeScaleTokens.INSTANCE.getDisplaySmallEmphasizedFont() : fontFamily18, null, TypeScaleTokens.INSTANCE.m7208getDisplaySmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7206getDisplaySmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyle34 = textStyleWithDefaultFontFamily18;
        TextStyle textStyleWithDefaultFontFamily19 = TypographyKt.withDefaultFontFamily(textStyle19, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily19 == null) {
            TextStyle defaultTextStyle19 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily19 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily19 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle19, 0L, TypeScaleTokens.INSTANCE.m7213getHeadlineLargeEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getHeadlineLargeEmphasizedWeight(), null, null, fontFamily19 == null ? TypeScaleTokens.INSTANCE.getHeadlineLargeEmphasizedFont() : fontFamily19, null, TypeScaleTokens.INSTANCE.m7214getHeadlineLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7212getHeadlineLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyle35 = textStyleWithDefaultFontFamily19;
        TextStyle textStyleWithDefaultFontFamily20 = TypographyKt.withDefaultFontFamily(textStyle20, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily20 == null) {
            TextStyle defaultTextStyle20 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily20 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily20 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle20, 0L, TypeScaleTokens.INSTANCE.m7219getHeadlineMediumEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getHeadlineMediumEmphasizedWeight(), null, null, fontFamily20 == null ? TypeScaleTokens.INSTANCE.getHeadlineMediumEmphasizedFont() : fontFamily20, null, TypeScaleTokens.INSTANCE.m7220getHeadlineMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7218getHeadlineMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyle36 = textStyleWithDefaultFontFamily20;
        TextStyle textStyleWithDefaultFontFamily21 = TypographyKt.withDefaultFontFamily(textStyle21, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily21 == null) {
            TextStyle defaultTextStyle21 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily21 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily21 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle21, 0L, TypeScaleTokens.INSTANCE.m7225getHeadlineSmallEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getHeadlineSmallEmphasizedWeight(), null, null, fontFamily21 == null ? TypeScaleTokens.INSTANCE.getHeadlineSmallEmphasizedFont() : fontFamily21, null, TypeScaleTokens.INSTANCE.m7226getHeadlineSmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7224getHeadlineSmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyle37 = textStyleWithDefaultFontFamily21;
        TextStyle textStyleWithDefaultFontFamily22 = TypographyKt.withDefaultFontFamily(textStyle22, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily22 == null) {
            TextStyle defaultTextStyle22 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily22 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily22 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle22, 0L, TypeScaleTokens.INSTANCE.m7249getTitleLargeEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getTitleLargeEmphasizedWeight(), null, null, fontFamily22 == null ? TypeScaleTokens.INSTANCE.getTitleLargeEmphasizedFont() : fontFamily22, null, TypeScaleTokens.INSTANCE.m7250getTitleLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7248getTitleLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyle38 = textStyleWithDefaultFontFamily22;
        TextStyle textStyleWithDefaultFontFamily23 = TypographyKt.withDefaultFontFamily(textStyle23, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily23 == null) {
            TextStyle defaultTextStyle23 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily23 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily23 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle23, 0L, TypeScaleTokens.INSTANCE.m7255getTitleMediumEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getTitleMediumEmphasizedWeight(), null, null, fontFamily23 == null ? TypeScaleTokens.INSTANCE.getTitleMediumEmphasizedFont() : fontFamily23, null, TypeScaleTokens.INSTANCE.m7256getTitleMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7254getTitleMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyle39 = textStyleWithDefaultFontFamily23;
        TextStyle textStyleWithDefaultFontFamily24 = TypographyKt.withDefaultFontFamily(textStyle24, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily24 == null) {
            TextStyle defaultTextStyle24 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily24 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily24 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle24, 0L, TypeScaleTokens.INSTANCE.m7261getTitleSmallEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getTitleSmallEmphasizedWeight(), null, null, fontFamily24 == null ? TypeScaleTokens.INSTANCE.getTitleSmallEmphasizedFont() : fontFamily24, null, TypeScaleTokens.INSTANCE.m7262getTitleSmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7260getTitleSmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyle40 = textStyleWithDefaultFontFamily24;
        TextStyle textStyleWithDefaultFontFamily25 = TypographyKt.withDefaultFontFamily(textStyle25, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily25 == null) {
            TextStyle defaultTextStyle25 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily25 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily25 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle25, 0L, TypeScaleTokens.INSTANCE.m7177getBodyLargeEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getBodyLargeEmphasizedWeight(), null, null, fontFamily25 == null ? TypeScaleTokens.INSTANCE.getBodyLargeEmphasizedFont() : fontFamily25, null, TypeScaleTokens.INSTANCE.m7178getBodyLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7176getBodyLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyle41 = textStyleWithDefaultFontFamily25;
        TextStyle textStyleWithDefaultFontFamily26 = TypographyKt.withDefaultFontFamily(textStyle26, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily26 == null) {
            TextStyle defaultTextStyle26 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily26 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily26 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle26, 0L, TypeScaleTokens.INSTANCE.m7183getBodyMediumEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getBodyMediumEmphasizedWeight(), null, null, fontFamily26 == null ? TypeScaleTokens.INSTANCE.getBodyMediumEmphasizedFont() : fontFamily26, null, TypeScaleTokens.INSTANCE.m7184getBodyMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7182getBodyMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyle42 = textStyleWithDefaultFontFamily26;
        TextStyle textStyleWithDefaultFontFamily27 = TypographyKt.withDefaultFontFamily(textStyle27, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily27 == null) {
            TextStyle defaultTextStyle27 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily27 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily27 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle27, 0L, TypeScaleTokens.INSTANCE.m7189getBodySmallEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getBodySmallEmphasizedWeight(), null, null, fontFamily27 == null ? TypeScaleTokens.INSTANCE.getBodySmallEmphasizedFont() : fontFamily27, null, TypeScaleTokens.INSTANCE.m7190getBodySmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7188getBodySmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyle43 = textStyleWithDefaultFontFamily27;
        TextStyle textStyleWithDefaultFontFamily28 = TypographyKt.withDefaultFontFamily(textStyle28, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily28 == null) {
            TextStyle defaultTextStyle28 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily28 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily28 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle28, 0L, TypeScaleTokens.INSTANCE.m7231getLabelLargeEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getLabelLargeEmphasizedWeight(), null, null, fontFamily28 == null ? TypeScaleTokens.INSTANCE.getLabelLargeEmphasizedFont() : fontFamily28, null, TypeScaleTokens.INSTANCE.m7232getLabelLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7230getLabelLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyle44 = textStyleWithDefaultFontFamily28;
        TextStyle textStyleWithDefaultFontFamily29 = TypographyKt.withDefaultFontFamily(textStyle29, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily29 == null) {
            TextStyle defaultTextStyle29 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily29 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily29 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle29, 0L, TypeScaleTokens.INSTANCE.m7237getLabelMediumEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getLabelMediumEmphasizedWeight(), null, null, fontFamily29 == null ? TypeScaleTokens.INSTANCE.getLabelMediumEmphasizedFont() : fontFamily29, null, TypeScaleTokens.INSTANCE.m7238getLabelMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7236getLabelMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        TextStyle textStyle45 = textStyleWithDefaultFontFamily29;
        TextStyle textStyleWithDefaultFontFamily30 = TypographyKt.withDefaultFontFamily(textStyle30, typographyTokens.getFontFamily());
        if (textStyleWithDefaultFontFamily30 == null) {
            TextStyle defaultTextStyle30 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily30 = typographyTokens.getFontFamily();
            textStyleWithDefaultFontFamily30 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle30, 0L, TypeScaleTokens.INSTANCE.m7243getLabelSmallEmphasizedSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getLabelSmallEmphasizedWeight(), null, null, fontFamily30 == null ? TypeScaleTokens.INSTANCE.getLabelSmallEmphasizedFont() : fontFamily30, null, TypeScaleTokens.INSTANCE.m7244getLabelSmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7242getLabelSmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        }
        this(textStyle31, textStyleWithDefaultFontFamily2, textStyleWithDefaultFontFamily3, textStyleWithDefaultFontFamily4, textStyleWithDefaultFontFamily5, textStyleWithDefaultFontFamily6, textStyleWithDefaultFontFamily7, textStyleWithDefaultFontFamily8, textStyleWithDefaultFontFamily9, textStyleWithDefaultFontFamily10, textStyleWithDefaultFontFamily11, textStyleWithDefaultFontFamily12, textStyleWithDefaultFontFamily13, textStyleWithDefaultFontFamily14, textStyleWithDefaultFontFamily15, textStyle32, textStyle33, textStyle34, textStyle35, textStyle36, textStyle37, textStyle38, textStyle39, textStyle40, textStyle41, textStyle42, textStyle43, textStyle44, textStyle45, textStyleWithDefaultFontFamily30);
    }

    public Typography() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null);
    }

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15) {
        this(textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, textStyle15, textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, textStyle15);
    }

    public Typography(FontFamily fontFamily, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, TextStyle textStyle16, TextStyle textStyle17, TextStyle textStyle18, TextStyle textStyle19, TextStyle textStyle20, TextStyle textStyle21, TextStyle textStyle22, TextStyle textStyle23, TextStyle textStyle24, TextStyle textStyle25, TextStyle textStyle26, TextStyle textStyle27, TextStyle textStyle28, TextStyle textStyle29, TextStyle textStyle30) {
        this(new TypographyTokens(fontFamily), textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, textStyle15, textStyle16, textStyle17, textStyle18, textStyle19, textStyle20, textStyle21, textStyle22, textStyle23, textStyle24, textStyle25, textStyle26, textStyle27, textStyle28, textStyle29, textStyle30);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, int i2, o oVar) {
        TextStyle textStyleM10559copyp1EtxEg$default;
        TextStyle textStyleM10559copyp1EtxEg$default2;
        TextStyle textStyleM10559copyp1EtxEg$default3;
        TextStyle textStyleM10559copyp1EtxEg$default4;
        TextStyle textStyleM10559copyp1EtxEg$default5;
        TextStyle textStyleM10559copyp1EtxEg$default6;
        TextStyle textStyleM10559copyp1EtxEg$default7;
        TextStyle textStyleM10559copyp1EtxEg$default8;
        TextStyle textStyleM10559copyp1EtxEg$default9;
        TextStyle textStyleM10559copyp1EtxEg$default10;
        TextStyle textStyleM10559copyp1EtxEg$default11;
        TextStyle textStyleM10559copyp1EtxEg$default12;
        TextStyle textStyleM10559copyp1EtxEg$default13;
        TextStyle textStyleM10559copyp1EtxEg$default14;
        TextStyle textStyleM10559copyp1EtxEg$default15;
        if ((i2 & 1) != 0) {
            TypographyTokens typographyTokens = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily = typographyTokens.getFontFamily();
            textStyleM10559copyp1EtxEg$default = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7198getDisplayLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getDisplayLargeWeight(), null, null, fontFamily == null ? TypeScaleTokens.INSTANCE.getDisplayLargeFont() : fontFamily, null, TypeScaleTokens.INSTANCE.m7199getDisplayLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7197getDisplayLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default = textStyle;
        }
        if ((i2 & 2) != 0) {
            TypographyTokens typographyTokens2 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle2 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily2 = typographyTokens2.getFontFamily();
            textStyleM10559copyp1EtxEg$default2 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle2, 0L, TypeScaleTokens.INSTANCE.m7204getDisplayMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getDisplayMediumWeight(), null, null, fontFamily2 == null ? TypeScaleTokens.INSTANCE.getDisplayMediumFont() : fontFamily2, null, TypeScaleTokens.INSTANCE.m7205getDisplayMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7203getDisplayMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default2 = textStyle2;
        }
        if ((i2 & 4) != 0) {
            TypographyTokens typographyTokens3 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle3 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily3 = typographyTokens3.getFontFamily();
            textStyleM10559copyp1EtxEg$default3 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle3, 0L, TypeScaleTokens.INSTANCE.m7210getDisplaySmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getDisplaySmallWeight(), null, null, fontFamily3 == null ? TypeScaleTokens.INSTANCE.getDisplaySmallFont() : fontFamily3, null, TypeScaleTokens.INSTANCE.m7211getDisplaySmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7209getDisplaySmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default3 = textStyle3;
        }
        if ((i2 & 8) != 0) {
            TypographyTokens typographyTokens4 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle4 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily4 = typographyTokens4.getFontFamily();
            textStyleM10559copyp1EtxEg$default4 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle4, 0L, TypeScaleTokens.INSTANCE.m7216getHeadlineLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getHeadlineLargeWeight(), null, null, fontFamily4 == null ? TypeScaleTokens.INSTANCE.getHeadlineLargeFont() : fontFamily4, null, TypeScaleTokens.INSTANCE.m7217getHeadlineLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7215getHeadlineLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default4 = textStyle4;
        }
        if ((i2 & 16) != 0) {
            TypographyTokens typographyTokens5 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle5 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily5 = typographyTokens5.getFontFamily();
            textStyleM10559copyp1EtxEg$default5 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle5, 0L, TypeScaleTokens.INSTANCE.m7222getHeadlineMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getHeadlineMediumWeight(), null, null, fontFamily5 == null ? TypeScaleTokens.INSTANCE.getHeadlineMediumFont() : fontFamily5, null, TypeScaleTokens.INSTANCE.m7223getHeadlineMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7221getHeadlineMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default5 = textStyle5;
        }
        if ((i2 & 32) != 0) {
            TypographyTokens typographyTokens6 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle6 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily6 = typographyTokens6.getFontFamily();
            textStyleM10559copyp1EtxEg$default6 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle6, 0L, TypeScaleTokens.INSTANCE.m7228getHeadlineSmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getHeadlineSmallWeight(), null, null, fontFamily6 == null ? TypeScaleTokens.INSTANCE.getHeadlineSmallFont() : fontFamily6, null, TypeScaleTokens.INSTANCE.m7229getHeadlineSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7227getHeadlineSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default6 = textStyle6;
        }
        if ((i2 & 64) != 0) {
            TypographyTokens typographyTokens7 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle7 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily7 = typographyTokens7.getFontFamily();
            textStyleM10559copyp1EtxEg$default7 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle7, 0L, TypeScaleTokens.INSTANCE.m7252getTitleLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getTitleLargeWeight(), null, null, fontFamily7 == null ? TypeScaleTokens.INSTANCE.getTitleLargeFont() : fontFamily7, null, TypeScaleTokens.INSTANCE.m7253getTitleLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7251getTitleLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default7 = textStyle7;
        }
        if ((i2 & 128) != 0) {
            TypographyTokens typographyTokens8 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle8 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily8 = typographyTokens8.getFontFamily();
            textStyleM10559copyp1EtxEg$default8 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle8, 0L, TypeScaleTokens.INSTANCE.m7258getTitleMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getTitleMediumWeight(), null, null, fontFamily8 == null ? TypeScaleTokens.INSTANCE.getTitleMediumFont() : fontFamily8, null, TypeScaleTokens.INSTANCE.m7259getTitleMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7257getTitleMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default8 = textStyle8;
        }
        if ((i2 & 256) != 0) {
            TypographyTokens typographyTokens9 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle9 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily9 = typographyTokens9.getFontFamily();
            textStyleM10559copyp1EtxEg$default9 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle9, 0L, TypeScaleTokens.INSTANCE.m7264getTitleSmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getTitleSmallWeight(), null, null, fontFamily9 == null ? TypeScaleTokens.INSTANCE.getTitleSmallFont() : fontFamily9, null, TypeScaleTokens.INSTANCE.m7265getTitleSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7263getTitleSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default9 = textStyle9;
        }
        if ((i2 & 512) != 0) {
            TypographyTokens typographyTokens10 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle10 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily10 = typographyTokens10.getFontFamily();
            textStyleM10559copyp1EtxEg$default10 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle10, 0L, TypeScaleTokens.INSTANCE.m7180getBodyLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getBodyLargeWeight(), null, null, fontFamily10 == null ? TypeScaleTokens.INSTANCE.getBodyLargeFont() : fontFamily10, null, TypeScaleTokens.INSTANCE.m7181getBodyLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7179getBodyLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default10 = textStyle10;
        }
        if ((i2 & 1024) != 0) {
            TypographyTokens typographyTokens11 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle11 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily11 = typographyTokens11.getFontFamily();
            textStyleM10559copyp1EtxEg$default11 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle11, 0L, TypeScaleTokens.INSTANCE.m7186getBodyMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getBodyMediumWeight(), null, null, fontFamily11 == null ? TypeScaleTokens.INSTANCE.getBodyMediumFont() : fontFamily11, null, TypeScaleTokens.INSTANCE.m7187getBodyMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7185getBodyMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default11 = textStyle11;
        }
        if ((i2 & 2048) != 0) {
            TypographyTokens typographyTokens12 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle12 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily12 = typographyTokens12.getFontFamily();
            textStyleM10559copyp1EtxEg$default12 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle12, 0L, TypeScaleTokens.INSTANCE.m7192getBodySmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getBodySmallWeight(), null, null, fontFamily12 == null ? TypeScaleTokens.INSTANCE.getBodySmallFont() : fontFamily12, null, TypeScaleTokens.INSTANCE.m7193getBodySmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7191getBodySmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default12 = textStyle12;
        }
        if ((i2 & 4096) != 0) {
            TypographyTokens typographyTokens13 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle13 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily13 = typographyTokens13.getFontFamily();
            textStyleM10559copyp1EtxEg$default13 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle13, 0L, TypeScaleTokens.INSTANCE.m7234getLabelLargeSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getLabelLargeWeight(), null, null, fontFamily13 == null ? TypeScaleTokens.INSTANCE.getLabelLargeFont() : fontFamily13, null, TypeScaleTokens.INSTANCE.m7235getLabelLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7233getLabelLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default13 = textStyle13;
        }
        if ((i2 & 8192) != 0) {
            TypographyTokens typographyTokens14 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle14 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily14 = typographyTokens14.getFontFamily();
            textStyleM10559copyp1EtxEg$default14 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle14, 0L, TypeScaleTokens.INSTANCE.m7240getLabelMediumSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getLabelMediumWeight(), null, null, fontFamily14 == null ? TypeScaleTokens.INSTANCE.getLabelMediumFont() : fontFamily14, null, TypeScaleTokens.INSTANCE.m7241getLabelMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7239getLabelMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default14 = textStyle14;
        }
        if ((i2 & 16384) != 0) {
            TypographyTokens typographyTokens15 = TypographyKt.typographyTokens;
            TextStyle defaultTextStyle15 = TypographyTokensKt.getDefaultTextStyle();
            GenericFontFamily fontFamily15 = typographyTokens15.getFontFamily();
            textStyleM10559copyp1EtxEg$default15 = TextStyle.m10559copyp1EtxEg$default(defaultTextStyle15, 0L, TypeScaleTokens.INSTANCE.m7246getLabelSmallSizeXSAIIZE(), TypeScaleTokens.INSTANCE.getLabelSmallWeight(), null, null, fontFamily15 == null ? TypeScaleTokens.INSTANCE.getLabelSmallFont() : fontFamily15, null, TypeScaleTokens.INSTANCE.m7247getLabelSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7245getLabelSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
        } else {
            textStyleM10559copyp1EtxEg$default15 = textStyle15;
        }
        this(textStyleM10559copyp1EtxEg$default, textStyleM10559copyp1EtxEg$default2, textStyleM10559copyp1EtxEg$default3, textStyleM10559copyp1EtxEg$default4, textStyleM10559copyp1EtxEg$default5, textStyleM10559copyp1EtxEg$default6, textStyleM10559copyp1EtxEg$default7, textStyleM10559copyp1EtxEg$default8, textStyleM10559copyp1EtxEg$default9, textStyleM10559copyp1EtxEg$default10, textStyleM10559copyp1EtxEg$default11, textStyleM10559copyp1EtxEg$default12, textStyleM10559copyp1EtxEg$default13, textStyleM10559copyp1EtxEg$default14, textStyleM10559copyp1EtxEg$default15);
    }

    public /* synthetic */ Typography(FontFamily fontFamily, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, TextStyle textStyle16, TextStyle textStyle17, TextStyle textStyle18, TextStyle textStyle19, TextStyle textStyle20, TextStyle textStyle21, TextStyle textStyle22, TextStyle textStyle23, TextStyle textStyle24, TextStyle textStyle25, TextStyle textStyle26, TextStyle textStyle27, TextStyle textStyle28, TextStyle textStyle29, TextStyle textStyle30, int i2, o oVar) {
        this(fontFamily, (i2 & 2) != 0 ? null : textStyle, (i2 & 4) != 0 ? null : textStyle2, (i2 & 8) != 0 ? null : textStyle3, (i2 & 16) != 0 ? null : textStyle4, (i2 & 32) != 0 ? null : textStyle5, (i2 & 64) != 0 ? null : textStyle6, (i2 & 128) != 0 ? null : textStyle7, (i2 & 256) != 0 ? null : textStyle8, (i2 & 512) != 0 ? null : textStyle9, (i2 & 1024) != 0 ? null : textStyle10, (i2 & 2048) != 0 ? null : textStyle11, (i2 & 4096) != 0 ? null : textStyle12, (i2 & 8192) != 0 ? null : textStyle13, (i2 & 16384) != 0 ? null : textStyle14, (i2 & 32768) != 0 ? null : textStyle15, (i2 & 65536) != 0 ? null : textStyle16, (i2 & 131072) != 0 ? null : textStyle17, (i2 & 262144) != 0 ? null : textStyle18, (i2 & 524288) != 0 ? null : textStyle19, (i2 & 1048576) != 0 ? null : textStyle20, (i2 & 2097152) != 0 ? null : textStyle21, (i2 & 4194304) != 0 ? null : textStyle22, (i2 & 8388608) != 0 ? null : textStyle23, (i2 & 16777216) != 0 ? null : textStyle24, (i2 & GroupFlagsKt.HasAuxSlotFlag) != 0 ? null : textStyle25, (i2 & 67108864) != 0 ? null : textStyle26, (i2 & 134217728) != 0 ? null : textStyle27, (i2 & 268435456) != 0 ? null : textStyle28, (i2 & 536870912) != 0 ? null : textStyle29, (i2 & 1073741824) != 0 ? null : textStyle30);
    }
}
