package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldCursorKt {
    public static final Modifier cursor(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldValue textFieldValue, final OffsetMapping offsetMapping, final Brush brush, boolean z) {
        return z ? ComposedModifierKt.composed$default(modifier, null, new q() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$$ExternalSyntheticLambda1
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TextFieldCursorKt.cursor$lambda$0(brush, legacyTextFieldState, textFieldValue, offsetMapping, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null) : modifier;
    }

    static final Modifier cursor$lambda$0(final Brush brush, final LegacyTextFieldState legacyTextFieldState, final TextFieldValue textFieldValue, final OffsetMapping offsetMapping, Modifier modifier, Composer composer, int i2) {
        Modifier.Companion companionDrawWithContent;
        composer.startReplaceGroup(-84507373);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-84507373, i2, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:46)");
        }
        boolean zBooleanValue = ((Boolean) composer.consume(CompositionLocalsKt.getLocalCursorBlinkEnabled())).booleanValue();
        boolean zChanged = composer.changed(zBooleanValue);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new CursorAnimationState(zBooleanValue);
            composer.updateRememberedValue(objRememberedValue);
        }
        final CursorAnimationState cursorAnimationState = (CursorAnimationState) objRememberedValue;
        boolean z = true;
        if ((brush instanceof SolidColor) && ((SolidColor) brush).m8614getValue0d7_KjU() == 16) {
            z = false;
        }
        if (((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused() && legacyTextFieldState.getHasFocus() && TextRange.m10540getCollapsedimpl(textFieldValue.m10831getSelectiond9O1mEE()) && z) {
            composer.startReplaceGroup(-707487962);
            AnnotatedString annotatedString = textFieldValue.getAnnotatedString();
            TextRange textRangeM10534boximpl = TextRange.m10534boximpl(textFieldValue.m10831getSelectiond9O1mEE());
            boolean zChangedInstance = composer.changedInstance(cursorAnimationState);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (p) new TextFieldCursorKt$cursor$1$1$1(cursorAnimationState, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(annotatedString, textRangeM10534boximpl, (p) objRememberedValue2, composer, 0);
            boolean zChangedInstance2 = composer.changedInstance(cursorAnimationState) | composer.changedInstance(offsetMapping) | composer.changed(textFieldValue) | composer.changedInstance(legacyTextFieldState) | composer.changed(brush);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                Object obj = new l() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return TextFieldCursorKt.cursor$lambda$0$2$0(cursorAnimationState, offsetMapping, textFieldValue, legacyTextFieldState, brush, (ContentDrawScope) obj2);
                    }
                };
                composer.updateRememberedValue(obj);
                objRememberedValue3 = obj;
            }
            companionDrawWithContent = DrawModifierKt.drawWithContent(modifier, (l) objRememberedValue3);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-705473241);
            composer.endReplaceGroup();
            companionDrawWithContent = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return companionDrawWithContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab cursor$lambda$0$2$0(CursorAnimationState cursorAnimationState, OffsetMapping offsetMapping, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, Brush brush, ContentDrawScope contentDrawScope) {
        TextLayoutResult value;
        contentDrawScope.drawContent();
        float cursorAlpha = cursorAnimationState.getCursorAlpha();
        if (cursorAlpha != 0.0f) {
            int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m10546getStartimpl(textFieldValue.m10831getSelectiond9O1mEE()));
            TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            Rect rect = (layoutResult == null || (value = layoutResult.getValue()) == null) ? new Rect(0.0f, 0.0f, 0.0f, 0.0f) : value.getCursorRect(iOriginalToTransformed);
            float fE = n.e((float) Math.floor(contentDrawScope.mo2127toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness())), 1.0f);
            float f2 = fE / 2.0f;
            int i2 = ((int) fE) % 2;
            double dE = n.e(n.f(rect.getLeft() + f2, Float.intBitsToFloat((int) (contentDrawScope.mo8751getSizeNHjbRc() >> 32)) - f2), f2);
            float fFloor = i2 == 1 ? ((float) Math.floor(dE)) + 0.5f : (float) Math.rint(dE);
            float top = rect.getTop();
            DrawScope.CC.m8827drawLine1RTmtNc$default(contentDrawScope, brush, (Float.floatToRawIntBits(fFloor) << 32) | (Float.floatToRawIntBits(top) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (Float.floatToRawIntBits(rect.getBottom()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fFloor) << 32), fE, 0, null, cursorAlpha, null, 0, DisplayStrings.DS_DIRT_ROADS, null);
        }
        return ab.f48028a;
    }
}
