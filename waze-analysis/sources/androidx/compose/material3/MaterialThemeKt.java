package androidx.compose.material3;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.MediaQueryKt;
import androidx.compose.ui.UiMediaScope;
import androidx.compose.ui.graphics.Color;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MaterialThemeKt {
    public static final float TextSelectionBackgroundOpacity = 0.4f;
    private static final ProvidableCompositionLocal<Boolean> LocalUsingExpressiveTheme = CompositionLocalKt.staticCompositionLocalOf(new a() { // from class: androidx.compose.material3.MaterialThemeKt$$ExternalSyntheticLambda3
        @Override // h.g.a.a
        public final Object invoke() {
            float f2 = MaterialThemeKt.TextSelectionBackgroundOpacity;
            return false;
        }
    });
    private static final ProvidableCompositionLocal<MaterialTheme.Values> _localMaterialTheme = CompositionLocalKt.staticCompositionLocalOf(new a() { // from class: androidx.compose.material3.MaterialThemeKt$$ExternalSyntheticLambda4
        @Override // h.g.a.a
        public final Object invoke() {
            return MaterialThemeKt._localMaterialTheme$lambda$0();
        }
    });

    static final boolean LocalUsingExpressiveTheme$lambda$0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MaterialExpressiveTheme(androidx.compose.material3.ColorScheme r20, androidx.compose.material3.MotionScheme r21, androidx.compose.material3.Shapes r22, androidx.compose.material3.Typography r23, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MaterialThemeKt.MaterialExpressiveTheme(androidx.compose.material3.ColorScheme, androidx.compose.material3.MotionScheme, androidx.compose.material3.Shapes, androidx.compose.material3.Typography, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab MaterialExpressiveTheme$lambda$0(ColorScheme colorScheme, MotionScheme motionScheme, Shapes shapes, Typography typography, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1535649272, i2, -1, "androidx.compose.material3.MaterialExpressiveTheme.<anonymous> (MaterialTheme.kt:287)");
            }
            MaterialTheme(colorScheme == null ? ColorSchemeKt.expressiveLightColorScheme() : colorScheme, motionScheme == null ? MotionScheme.Companion.expressive() : motionScheme, shapes == null ? new Shapes(null, null, null, null, null, 31, null) : shapes, typography == null ? new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null) : typography, pVar, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab MaterialExpressiveTheme$lambda$1(ColorScheme colorScheme, MotionScheme motionScheme, Shapes shapes, Typography typography, p pVar, int i2, int i3, Composer composer, int i4) {
        MaterialExpressiveTheme(colorScheme, motionScheme, shapes, typography, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final void MaterialTheme(ColorScheme colorScheme, MotionScheme motionScheme, Shapes shapes, Typography typography, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2, final int i3) {
        ColorScheme colorScheme2;
        int i4;
        MotionScheme motionScheme2;
        Shapes shapes2;
        final Typography typography2;
        char c2;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(904511636);
        if (i5 == 0) {
            if ((i3 & 1) == 0) {
                colorScheme2 = colorScheme;
                int i6 = composerStartRestartGroup.changed(colorScheme2) ? 4 : 2;
                i4 = i6 | i2;
            } else {
                colorScheme2 = colorScheme;
            }
            i4 = i6 | i2;
        } else {
            colorScheme2 = colorScheme;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i7 = 16;
            if ((i3 & 2) == 0) {
                motionScheme2 = motionScheme;
                if (composerStartRestartGroup.changed(motionScheme2)) {
                    i7 = 32;
                }
            } else {
                motionScheme2 = motionScheme;
            }
            i4 |= i7;
        } else {
            motionScheme2 = motionScheme;
        }
        if ((i2 & 384) == 0) {
            int i8 = 128;
            if ((i3 & 4) == 0) {
                shapes2 = shapes;
                if (composerStartRestartGroup.changed(shapes2)) {
                    i8 = 256;
                }
            } else {
                shapes2 = shapes;
            }
            i4 |= i8;
        } else {
            shapes2 = shapes;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            int i9 = 1024;
            if ((i3 & 8) == 0) {
                typography2 = typography;
                if (composerStartRestartGroup.changed(typography2)) {
                    i9 = 2048;
                }
            } else {
                typography2 = typography;
            }
            i4 |= i9;
        } else {
            typography2 = typography;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            int i10 = i3 & 8;
            int i11 = i3 & 4;
            int i12 = i3 & 2;
            int i13 = i3 & 1;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                c2 = 2;
                if (i13 != 0) {
                    i4 &= -15;
                    colorScheme2 = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6);
                }
                if (i12 != 0) {
                    motionScheme2 = MaterialTheme.INSTANCE.getMotionScheme(composerStartRestartGroup, 6);
                    i4 &= -113;
                }
                if (i11 != 0) {
                    shapes2 = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if (i10 != 0) {
                    i4 &= -7169;
                    typography2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if (i13 != 0) {
                    i4 &= -15;
                }
                if (i12 != 0) {
                    i4 &= -113;
                }
                if (i11 != 0) {
                    i4 &= -897;
                }
                if (i10 != 0) {
                    i4 &= -7169;
                }
                c2 = 2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(904511636, i4, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:104)");
            }
            MaterialTheme.Values values = new MaterialTheme.Values(colorScheme2, typography2, shapes2, motionScheme2);
            IndicationNodeFactory indicationNodeFactoryM5414rippleOu1YvPQ$default = RippleKt.m5414rippleOu1YvPQ$default(false, 0.0f, 0L, null, false, false, false, false, 255, null);
            TextSelectionColors textSelectionColorsRememberTextSelectionColors = rememberTextSelectionColors(colorScheme2, composerStartRestartGroup, i4 & 14);
            ProvidedValue[] providedValueArr = new ProvidedValue[3];
            providedValueArr[0] = _localMaterialTheme.provides(values);
            providedValueArr[1] = IndicationKt.getLocalIndication().provides(indicationNodeFactoryM5414rippleOu1YvPQ$default);
            providedValueArr[c2] = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textSelectionColorsRememberTextSelectionColors);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(-1750539308, true, new p() { // from class: androidx.compose.material3.MaterialThemeKt$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return MaterialThemeKt.MaterialTheme$lambda$1(typography2, pVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final ColorScheme colorScheme3 = colorScheme2;
        final MotionScheme motionScheme3 = motionScheme2;
        final Shapes shapes3 = shapes2;
        final Typography typography3 = typography2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.MaterialThemeKt$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return MaterialThemeKt.MaterialTheme$lambda$2(colorScheme3, motionScheme3, shapes3, typography3, pVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab MaterialTheme$lambda$0(ColorScheme colorScheme, Shapes shapes, Typography typography, p pVar, int i2, int i3, Composer composer, int i4) {
        MaterialTheme(colorScheme, shapes, typography, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab MaterialTheme$lambda$1(Typography typography, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1750539308, i2, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:119)");
            }
            if (ComposeUiFlags.isMediaQueryIntegrationEnabled) {
                composer.startReplaceGroup(-823547588);
                UiMediaScope uiMediaScope = (UiMediaScope) composer.consume(MediaQueryKt.getLocalUiMediaScope());
                PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().setValue(Boolean.valueOf(UiMediaScope.PointerPrecision.m7690equalsimpl0(uiMediaScope.mo7672getPointerPrecisionfpxItnM(), UiMediaScope.PointerPrecision.Companion.m7696getFinefpxItnM()) && UiMediaScope.KeyboardKind.m7680equalsimpl0(uiMediaScope.mo7671getKeyboardKindJ9_QTjY(), UiMediaScope.KeyboardKind.Companion.m7685getPhysicalJ9_QTjY())));
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-823284274);
                composer.endReplaceGroup();
            }
            TextKt.ProvideTextStyle(typography.getBodyLarge(), pVar, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab MaterialTheme$lambda$2(ColorScheme colorScheme, MotionScheme motionScheme, Shapes shapes, Typography typography, p pVar, int i2, int i3, Composer composer, int i4) {
        MaterialTheme(colorScheme, motionScheme, shapes, typography, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final MaterialTheme.Values _localMaterialTheme$lambda$0() {
        return new MaterialTheme.Values(null, null, null, null, 15, null);
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalUsingExpressiveTheme() {
        return LocalUsingExpressiveTheme;
    }

    public static final TextSelectionColors rememberTextSelectionColors(ColorScheme colorScheme, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1866455512, i2, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:303)");
        }
        long jM4568getPrimary0d7_KjU = colorScheme.m4568getPrimary0d7_KjU();
        boolean zChanged = composer.changed(jM4568getPrimary0d7_KjU);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            TextSelectionColors textSelectionColors = new TextSelectionColors(jM4568getPrimary0d7_KjU, Color.m8227copywmQWz5c$default(jM4568getPrimary0d7_KjU, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            composer.updateRememberedValue(textSelectionColors);
            objRememberedValue = textSelectionColors;
        }
        TextSelectionColors textSelectionColors2 = (TextSelectionColors) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textSelectionColors2;
    }

    private static /* synthetic */ void get_localMaterialTheme$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MaterialTheme(androidx.compose.material3.ColorScheme r14, androidx.compose.material3.Shapes r15, androidx.compose.material3.Typography r16, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MaterialThemeKt.MaterialTheme(androidx.compose.material3.ColorScheme, androidx.compose.material3.Shapes, androidx.compose.material3.Typography, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
