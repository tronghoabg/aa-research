package androidx.compose.foundation.text;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.q;
import h.h.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class HeightInLinesModifierKt {
    public static final int DefaultMinLines = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int computeHeightFromThreeLines(float f2, float f3, float f4, int i2, int i3) {
        if (i2 == i3) {
            return -1;
        }
        int i4 = i2 - 2;
        if (i4 < 0) {
            i4 = 0;
        }
        float f5 = f2 + (f3 * i4);
        int i5 = i2 - 1;
        if (i5 > 1) {
            i5 = 1;
        }
        return a.b(f5 + (f4 * i5));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.Modifier heightInLines(androidx.compose.ui.Modifier r1, androidx.compose.ui.text.TextStyle r2, boolean r3, int r4, int r5) {
        /*
            validateMinMaxLines(r4, r5)
            r0 = 1
            if (r4 != r0) goto Lc
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r4) goto Le
            r4 = r0
        Lc:
            if (r3 != 0) goto Lf
        Le:
            return r1
        Lf:
            boolean r3 = androidx.compose.foundation.ComposeFoundationFlags.isBasicTextFieldMinSizeOptimizationEnabled
            if (r3 == 0) goto L1f
            androidx.compose.foundation.text.HeightInLinesElement r3 = new androidx.compose.foundation.text.HeightInLinesElement
            r3.<init>(r2, r4, r5)
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            androidx.compose.ui.Modifier r1 = r1.then(r3)
            return r1
        L1f:
            androidx.compose.ui.Modifier r1 = legacyHeightInLines(r1, r2, r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines(androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, boolean, int, int):androidx.compose.ui.Modifier");
    }

    public static /* synthetic */ Modifier heightInLines$default(Modifier modifier, TextStyle textStyle, boolean z, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return heightInLines(modifier, textStyle, z, i2, i3);
    }

    public static final Modifier legacyHeightInLines(Modifier modifier, final TextStyle textStyle, final int i2, final int i3) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new HeightInLinesModifierKt$legacyHeightInLines$$inlined$debugInspectorInfo$1(i2, i3, textStyle) : InspectableValueKt.getNoInspectorInfo(), new q() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$$ExternalSyntheticLambda0
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HeightInLinesModifierKt.legacyHeightInLines$lambda$1(textStyle, i2, i3, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    public static /* synthetic */ Modifier legacyHeightInLines$default(Modifier modifier, TextStyle textStyle, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 1;
        }
        if ((i4 & 4) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return legacyHeightInLines(modifier, textStyle, i2, i3);
    }

    static final Modifier legacyHeightInLines$lambda$1(TextStyle textStyle, int i2, int i3, Modifier modifier, Composer composer, int i4) {
        int i5;
        Integer numValueOf;
        Integer numValueOf2;
        composer.startReplaceGroup(595899793);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(595899793, i4, -1, "androidx.compose.foundation.text.legacyHeightInLines.<anonymous> (HeightInLinesModifier.kt:365)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        LayoutDirection layoutDirection2 = layoutDirection;
        boolean zChanged = composer.changed(textStyle) | composer.changed(layoutDirection2.ordinal());
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
            composer.updateRememberedValue(objRememberedValue);
        }
        TextStyle textStyle2 = (TextStyle) objRememberedValue;
        boolean zChanged2 = composer.changed(resolver) | composer.changed(textStyle2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            FontFamily fontFamily = textStyle2.getFontFamily();
            FontWeight fontWeight = textStyle2.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle fontStyleM10578getFontStyle4Lr2A7w = textStyle2.m10578getFontStyle4Lr2A7w();
            int iM10664unboximpl = fontStyleM10578getFontStyle4Lr2A7w != null ? fontStyleM10578getFontStyle4Lr2A7w.m10664unboximpl() : FontStyle.Companion.m10668getNormal_LCdwA();
            FontSynthesis fontSynthesisM10579getFontSynthesisZQGJjVo = textStyle2.m10579getFontSynthesisZQGJjVo();
            objRememberedValue2 = resolver.mo10633resolveDPcqOEQ(fontFamily, fontWeight, iM10664unboximpl, fontSynthesisM10579getFontSynthesisZQGJjVo != null ? fontSynthesisM10579getFontSynthesisZQGJjVo.m10677unboximpl() : FontSynthesis.Companion.m10678getAllGVVA2EU());
            composer.updateRememberedValue(objRememberedValue2);
        }
        State state = (State) objRememberedValue2;
        if (ComposeFoundationFlags.isBasicTextFieldHeightInLinesOptimizationEnabled) {
            composer.startReplaceGroup(1351781622);
            composer.endReplaceGroup();
            Paragraph paragraphParagraphForDefaultText = TextFieldDelegateKt.paragraphForDefaultText(textStyle2, density, resolver, 3);
            float lineHeight = paragraphParagraphForDefaultText.getLineHeight(0);
            float lineHeight2 = paragraphParagraphForDefaultText.getLineHeight(1);
            float lineHeight3 = paragraphParagraphForDefaultText.getLineHeight(2);
            numValueOf = Integer.valueOf(computeHeightFromThreeLines(lineHeight, lineHeight2, lineHeight3, i2, 1));
            numValueOf2 = Integer.valueOf(computeHeightFromThreeLines(lineHeight, lineHeight2, lineHeight3, i3, Integer.MAX_VALUE));
        } else {
            composer.startReplaceGroup(1352530520);
            boolean zChanged3 = composer.changed(state.getValue()) | composer.changed(density) | composer.changed(resolver) | composer.changed(textStyle) | composer.changed(layoutDirection2.ordinal());
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                i5 = 1;
                objRememberedValue3 = Integer.valueOf((int) (TextFieldDelegateKt.computeSizeForDefaultText$default(textStyle2, density, resolver, 0, 8, null) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                composer.updateRememberedValue(objRememberedValue3);
            } else {
                i5 = 1;
            }
            int iIntValue = ((Number) objRememberedValue3).intValue();
            boolean zChanged4 = composer.changed(textStyle) | composer.changed(density) | composer.changed(resolver) | composer.changed(layoutDirection2.ordinal()) | composer.changed(state.getValue());
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = Integer.valueOf((int) (TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, 2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                composer.updateRememberedValue(objRememberedValue4);
            }
            int iIntValue2 = ((Number) objRememberedValue4).intValue() - iIntValue;
            numValueOf = i2 == i5 ? null : Integer.valueOf(((i2 - 1) * iIntValue2) + iIntValue);
            numValueOf2 = i3 == Integer.MAX_VALUE ? null : Integer.valueOf(iIntValue + (iIntValue2 * (i3 - 1)));
            composer.endReplaceGroup();
        }
        Modifier modifierM2809heightInVpY3zN4 = SizeKt.m2809heightInVpY3zN4(Modifier.Companion, numValueOf != null ? density.mo2124toDpu2uoSUM(numValueOf.intValue()) : Dp.Companion.m11184getUnspecifiedD9Ej5fM(), numValueOf2 != null ? density.mo2124toDpu2uoSUM(numValueOf2.intValue()) : Dp.Companion.m11184getUnspecifiedD9Ej5fM());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM2809heightInVpY3zN4;
    }

    public static final void validateMinMaxLines(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            InlineClassHelperKt.throwIllegalArgumentException("both minLines " + i2 + " and maxLines " + i3 + " must be greater than zero");
        }
        if (i2 <= i3) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("minLines " + i2 + " must be less than or equal to maxLines " + i3);
    }
}
