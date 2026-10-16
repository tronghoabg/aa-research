package androidx.compose.material3.tokens;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TypographyTokens {
    public static final int $stable = 0;
    private final FontFamily fontFamily;

    public /* synthetic */ TypographyTokens(FontFamily fontFamily, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : fontFamily);
    }

    public final TextStyle getBodyLarge() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getBodyLargeFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight bodyLargeWeight = TypeScaleTokens.INSTANCE.getBodyLargeWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7180getBodyLargeSizeXSAIIZE(), bodyLargeWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7181getBodyLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7179getBodyLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getBodyLargeEmphasized() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getBodyLargeEmphasizedFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight bodyLargeEmphasizedWeight = TypeScaleTokens.INSTANCE.getBodyLargeEmphasizedWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7177getBodyLargeEmphasizedSizeXSAIIZE(), bodyLargeEmphasizedWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7178getBodyLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7176getBodyLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getBodyMedium() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getBodyMediumFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight bodyMediumWeight = TypeScaleTokens.INSTANCE.getBodyMediumWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7186getBodyMediumSizeXSAIIZE(), bodyMediumWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7187getBodyMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7185getBodyMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getBodyMediumEmphasized() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getBodyMediumEmphasizedFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight bodyMediumEmphasizedWeight = TypeScaleTokens.INSTANCE.getBodyMediumEmphasizedWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7183getBodyMediumEmphasizedSizeXSAIIZE(), bodyMediumEmphasizedWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7184getBodyMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7182getBodyMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getBodySmall() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getBodySmallFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight bodySmallWeight = TypeScaleTokens.INSTANCE.getBodySmallWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7192getBodySmallSizeXSAIIZE(), bodySmallWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7193getBodySmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7191getBodySmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getBodySmallEmphasized() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getBodySmallEmphasizedFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight bodySmallEmphasizedWeight = TypeScaleTokens.INSTANCE.getBodySmallEmphasizedWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7189getBodySmallEmphasizedSizeXSAIIZE(), bodySmallEmphasizedWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7190getBodySmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7188getBodySmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getDisplayLarge() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getDisplayLargeFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight displayLargeWeight = TypeScaleTokens.INSTANCE.getDisplayLargeWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7198getDisplayLargeSizeXSAIIZE(), displayLargeWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7199getDisplayLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7197getDisplayLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getDisplayLargeEmphasized() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getDisplayLargeEmphasizedFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight displayLargeEmphasizedWeight = TypeScaleTokens.INSTANCE.getDisplayLargeEmphasizedWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7195getDisplayLargeEmphasizedSizeXSAIIZE(), displayLargeEmphasizedWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7196getDisplayLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7194getDisplayLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getDisplayMedium() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getDisplayMediumFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight displayMediumWeight = TypeScaleTokens.INSTANCE.getDisplayMediumWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7204getDisplayMediumSizeXSAIIZE(), displayMediumWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7205getDisplayMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7203getDisplayMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getDisplayMediumEmphasized() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getDisplayMediumEmphasizedFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight displayMediumEmphasizedWeight = TypeScaleTokens.INSTANCE.getDisplayMediumEmphasizedWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7201getDisplayMediumEmphasizedSizeXSAIIZE(), displayMediumEmphasizedWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7202getDisplayMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7200getDisplayMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getDisplaySmall() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getDisplaySmallFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight displaySmallWeight = TypeScaleTokens.INSTANCE.getDisplaySmallWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7210getDisplaySmallSizeXSAIIZE(), displaySmallWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7211getDisplaySmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7209getDisplaySmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getDisplaySmallEmphasized() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getDisplaySmallEmphasizedFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight displaySmallEmphasizedWeight = TypeScaleTokens.INSTANCE.getDisplaySmallEmphasizedWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7207getDisplaySmallEmphasizedSizeXSAIIZE(), displaySmallEmphasizedWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7208getDisplaySmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7206getDisplaySmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final TextStyle getHeadlineLarge() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getHeadlineLargeFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight headlineLargeWeight = TypeScaleTokens.INSTANCE.getHeadlineLargeWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7216getHeadlineLargeSizeXSAIIZE(), headlineLargeWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7217getHeadlineLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7215getHeadlineLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getHeadlineLargeEmphasized() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getHeadlineLargeEmphasizedFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight headlineLargeEmphasizedWeight = TypeScaleTokens.INSTANCE.getHeadlineLargeEmphasizedWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7213getHeadlineLargeEmphasizedSizeXSAIIZE(), headlineLargeEmphasizedWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7214getHeadlineLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7212getHeadlineLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getHeadlineMedium() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getHeadlineMediumFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight headlineMediumWeight = TypeScaleTokens.INSTANCE.getHeadlineMediumWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7222getHeadlineMediumSizeXSAIIZE(), headlineMediumWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7223getHeadlineMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7221getHeadlineMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getHeadlineMediumEmphasized() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getHeadlineMediumEmphasizedFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight headlineMediumEmphasizedWeight = TypeScaleTokens.INSTANCE.getHeadlineMediumEmphasizedWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7219getHeadlineMediumEmphasizedSizeXSAIIZE(), headlineMediumEmphasizedWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7220getHeadlineMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7218getHeadlineMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getHeadlineSmall() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getHeadlineSmallFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight headlineSmallWeight = TypeScaleTokens.INSTANCE.getHeadlineSmallWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7228getHeadlineSmallSizeXSAIIZE(), headlineSmallWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7229getHeadlineSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7227getHeadlineSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getHeadlineSmallEmphasized() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getHeadlineSmallEmphasizedFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight headlineSmallEmphasizedWeight = TypeScaleTokens.INSTANCE.getHeadlineSmallEmphasizedWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7225getHeadlineSmallEmphasizedSizeXSAIIZE(), headlineSmallEmphasizedWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7226getHeadlineSmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7224getHeadlineSmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getLabelLarge() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getLabelLargeFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight labelLargeWeight = TypeScaleTokens.INSTANCE.getLabelLargeWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7234getLabelLargeSizeXSAIIZE(), labelLargeWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7235getLabelLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7233getLabelLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getLabelLargeEmphasized() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getLabelLargeEmphasizedFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight labelLargeEmphasizedWeight = TypeScaleTokens.INSTANCE.getLabelLargeEmphasizedWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7231getLabelLargeEmphasizedSizeXSAIIZE(), labelLargeEmphasizedWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7232getLabelLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7230getLabelLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getLabelMedium() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getLabelMediumFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight labelMediumWeight = TypeScaleTokens.INSTANCE.getLabelMediumWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7240getLabelMediumSizeXSAIIZE(), labelMediumWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7241getLabelMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7239getLabelMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getLabelMediumEmphasized() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getLabelMediumEmphasizedFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight labelMediumEmphasizedWeight = TypeScaleTokens.INSTANCE.getLabelMediumEmphasizedWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7237getLabelMediumEmphasizedSizeXSAIIZE(), labelMediumEmphasizedWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7238getLabelMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7236getLabelMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getLabelSmall() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getLabelSmallFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight labelSmallWeight = TypeScaleTokens.INSTANCE.getLabelSmallWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7246getLabelSmallSizeXSAIIZE(), labelSmallWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7247getLabelSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7245getLabelSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getLabelSmallEmphasized() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getLabelSmallEmphasizedFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight labelSmallEmphasizedWeight = TypeScaleTokens.INSTANCE.getLabelSmallEmphasizedWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7243getLabelSmallEmphasizedSizeXSAIIZE(), labelSmallEmphasizedWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7244getLabelSmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7242getLabelSmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getTitleLarge() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getTitleLargeFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight titleLargeWeight = TypeScaleTokens.INSTANCE.getTitleLargeWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7252getTitleLargeSizeXSAIIZE(), titleLargeWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7253getTitleLargeTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7251getTitleLargeLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getTitleLargeEmphasized() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getTitleLargeEmphasizedFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight titleLargeEmphasizedWeight = TypeScaleTokens.INSTANCE.getTitleLargeEmphasizedWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7249getTitleLargeEmphasizedSizeXSAIIZE(), titleLargeEmphasizedWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7250getTitleLargeEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7248getTitleLargeEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getTitleMedium() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getTitleMediumFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight titleMediumWeight = TypeScaleTokens.INSTANCE.getTitleMediumWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7258getTitleMediumSizeXSAIIZE(), titleMediumWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7259getTitleMediumTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7257getTitleMediumLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getTitleMediumEmphasized() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getTitleMediumEmphasizedFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight titleMediumEmphasizedWeight = TypeScaleTokens.INSTANCE.getTitleMediumEmphasizedWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7255getTitleMediumEmphasizedSizeXSAIIZE(), titleMediumEmphasizedWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7256getTitleMediumEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7254getTitleMediumEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getTitleSmall() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getTitleSmallFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight titleSmallWeight = TypeScaleTokens.INSTANCE.getTitleSmallWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7264getTitleSmallSizeXSAIIZE(), titleSmallWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7265getTitleSmallTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7263getTitleSmallLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public final TextStyle getTitleSmallEmphasized() {
        TextStyle defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
        GenericFontFamily fontFamily = getFontFamily();
        if (fontFamily == null) {
            fontFamily = TypeScaleTokens.INSTANCE.getTitleSmallEmphasizedFont();
        }
        FontFamily fontFamily2 = fontFamily;
        FontWeight titleSmallEmphasizedWeight = TypeScaleTokens.INSTANCE.getTitleSmallEmphasizedWeight();
        return TextStyle.m10559copyp1EtxEg$default(defaultTextStyle, 0L, TypeScaleTokens.INSTANCE.m7261getTitleSmallEmphasizedSizeXSAIIZE(), titleSmallEmphasizedWeight, null, null, fontFamily2, null, TypeScaleTokens.INSTANCE.m7262getTitleSmallEmphasizedTrackingXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0, TypeScaleTokens.INSTANCE.m7260getTitleSmallEmphasizedLineHeightXSAIIZE(), null, null, null, 0, 0, null, 16645977, null);
    }

    public TypographyTokens(FontFamily fontFamily) {
        this.fontFamily = fontFamily;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TypographyTokens() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
