package androidx.compose.foundation.text;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.a.q;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldSizeKt {
    public static final Modifier legacyTextFieldMinSize(Modifier modifier, final TextStyle textStyle) {
        return ComposedModifierKt.composed$default(modifier, null, new q() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$$ExternalSyntheticLambda2
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TextFieldSizeKt.legacyTextFieldMinSize$lambda$0(textStyle, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }

    static final Modifier legacyTextFieldMinSize$lambda$0(TextStyle textStyle, Modifier modifier, Composer composer, int i2) {
        composer.startReplaceGroup(-390200690);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-390200690, i2, -1, "androidx.compose.foundation.text.legacyTextFieldMinSize.<anonymous> (TextFieldSize.kt:163)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        boolean zChanged = composer.changed(textStyle) | composer.changed(layoutDirection.ordinal());
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
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new LegacyTextFieldSize(layoutDirection, density, resolver, textStyle, state.getValue());
            composer.updateRememberedValue(objRememberedValue3);
        }
        final LegacyTextFieldSize legacyTextFieldSize = (LegacyTextFieldSize) objRememberedValue3;
        legacyTextFieldSize.update(layoutDirection, density, resolver, textStyle2, state.getValue());
        Modifier.Companion companion = Modifier.Companion;
        boolean zChangedInstance = composer.changedInstance(legacyTextFieldSize);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = new q() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$$ExternalSyntheticLambda1
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return TextFieldSizeKt.legacyTextFieldMinSize$lambda$0$4$0(legacyTextFieldSize, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        Modifier modifierLayout = LayoutModifierKt.layout(companion, (q) objRememberedValue4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult legacyTextFieldMinSize$lambda$0$4$0(LegacyTextFieldSize legacyTextFieldSize, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        long jM3339getMinSizeYbymL2g = legacyTextFieldSize.m3339getMinSizeYbymL2g();
        long jM11113unboximpl = constraints.m11113unboximpl();
        int iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(constraints.m11113unboximpl());
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(constraints.m11113unboximpl());
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(jM11113unboximpl, n.j((int) (jM3339getMinSizeYbymL2g >> 32), iM11109getMinWidthimpl, iM11107getMaxWidthimpl), 0, n.j((int) (jM3339getMinSizeYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE), Constraints.m11108getMinHeightimpl(constraints.m11113unboximpl()), Constraints.m11106getMaxHeightimpl(constraints.m11113unboximpl())), 0, 10, null));
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldSizeKt.legacyTextFieldMinSize$lambda$0$4$0$0(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab legacyTextFieldMinSize$lambda$0$4$0$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    public static final Modifier textFieldMinSize(Modifier modifier, TextStyle textStyle) {
        return ComposeFoundationFlags.isBasicTextFieldMinSizeOptimizationEnabled ? modifier.then(new TextFieldSizeElement(textStyle)) : legacyTextFieldMinSize(modifier, textStyle);
    }
}
