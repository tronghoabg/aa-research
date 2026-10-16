package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.material3.tokens.TypographyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import h.g.a.a;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TypographyKt {
    private static final ProvidableCompositionLocal<Typography> LocalTypography = CompositionLocalKt.staticCompositionLocalOf(new a() { // from class: androidx.compose.material3.TypographyKt$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return TypographyKt.LocalTypography$lambda$0();
        }
    });
    private static final TypographyTokens typographyTokens = new TypographyTokens(null, 1, 0 == true ? 1 : 0);

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TypographyKeyTokens.values().length];
            try {
                iArr[TypographyKeyTokens.DisplayLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypographyKeyTokens.DisplayMedium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TypographyKeyTokens.DisplaySmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineLarge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineMedium.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineSmall.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TypographyKeyTokens.TitleLarge.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TypographyKeyTokens.TitleMedium.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TypographyKeyTokens.TitleSmall.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TypographyKeyTokens.BodyLarge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TypographyKeyTokens.BodyMedium.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TypographyKeyTokens.BodySmall.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TypographyKeyTokens.LabelLarge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TypographyKeyTokens.LabelMedium.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[TypographyKeyTokens.LabelSmall.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[TypographyKeyTokens.DisplayLargeEmphasized.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[TypographyKeyTokens.DisplayMediumEmphasized.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[TypographyKeyTokens.DisplaySmallEmphasized.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineLargeEmphasized.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineMediumEmphasized.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineSmallEmphasized.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[TypographyKeyTokens.TitleLargeEmphasized.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[TypographyKeyTokens.TitleMediumEmphasized.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[TypographyKeyTokens.TitleSmallEmphasized.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[TypographyKeyTokens.BodyLargeEmphasized.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[TypographyKeyTokens.BodyMediumEmphasized.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[TypographyKeyTokens.BodySmallEmphasized.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[TypographyKeyTokens.LabelLargeEmphasized.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[TypographyKeyTokens.LabelMediumEmphasized.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[TypographyKeyTokens.LabelSmallEmphasized.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final Typography LocalTypography$lambda$0() {
        return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public static final TextStyle fromToken(Typography typography, TypographyKeyTokens typographyKeyTokens) {
        TypographyKeyTokens typographyKeyTokens2 = TypographyKeyTokens.BodyLarge;
        switch (typographyKeyTokens.ordinal()) {
            case 0:
                return typography.getBodyLarge();
            case 1:
                return typography.getBodyMedium();
            case 2:
                return typography.getBodySmall();
            case 3:
                return typography.getDisplayLarge();
            case 4:
                return typography.getDisplayMedium();
            case 5:
                return typography.getDisplaySmall();
            case 6:
                return typography.getHeadlineLarge();
            case 7:
                return typography.getHeadlineMedium();
            case 8:
                return typography.getHeadlineSmall();
            case 9:
                return typography.getLabelLarge();
            case 10:
                return typography.getLabelMedium();
            case 11:
                return typography.getLabelSmall();
            case 12:
                return typography.getTitleLarge();
            case 13:
                return typography.getTitleMedium();
            case 14:
                return typography.getTitleSmall();
            case 15:
                return typography.getBodyLargeEmphasized();
            case 16:
                return typography.getBodyMediumEmphasized();
            case 17:
                return typography.getBodySmallEmphasized();
            case 18:
                return typography.getDisplayLargeEmphasized();
            case 19:
                return typography.getDisplayMediumEmphasized();
            case 20:
                return typography.getDisplaySmallEmphasized();
            case 21:
                return typography.getHeadlineLargeEmphasized();
            case 22:
                return typography.getHeadlineMediumEmphasized();
            case 23:
                return typography.getHeadlineSmallEmphasized();
            case 24:
                return typography.getLabelLargeEmphasized();
            case 25:
                return typography.getLabelMediumEmphasized();
            case 26:
                return typography.getLabelSmallEmphasized();
            case 27:
                return typography.getTitleLargeEmphasized();
            case 28:
                return typography.getTitleMediumEmphasized();
            case 29:
                return typography.getTitleSmallEmphasized();
            default:
                throw new i();
        }
    }

    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return LocalTypography;
    }

    public static final TextStyle getValue(TypographyKeyTokens typographyKeyTokens, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1049072145, i2, -1, "androidx.compose.material3.<get-value> (Typography.kt:783)");
        }
        TextStyle textStyleFromToken = fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), typographyKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textStyleFromToken;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle withDefaultFontFamily(TextStyle textStyle, FontFamily fontFamily) {
        return (textStyle == null || textStyle.getFontFamily() != null) ? textStyle : TextStyle.m10559copyp1EtxEg$default(textStyle, 0L, 0L, null, null, null, fontFamily, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null);
    }
}
