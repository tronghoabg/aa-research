package androidx.compose.foundation.text;

import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.aq;
import h.g.b.o;
import h.p;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldDelegate {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: drawHighlight-Le-punE, reason: not valid java name */
        private final void m3391drawHighlightLepunE(Canvas canvas, long j2, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint paint) {
            int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m10544getMinimpl(j2));
            int iOriginalToTransformed2 = offsetMapping.originalToTransformed(TextRange.m10543getMaximpl(j2));
            if (iOriginalToTransformed != iOriginalToTransformed2) {
                canvas.drawPath(textLayoutResult.getPathForRange(iOriginalToTransformed, iOriginalToTransformed2), paint);
            }
        }

        /* renamed from: layout-_EkL_-Y$foundation$default, reason: not valid java name */
        public static /* synthetic */ p m3392layout_EkL_Y$foundation$default(Companion companion, TextDelegate textDelegate, long j2, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                textLayoutResult = null;
            }
            return companion.m3395layout_EkL_Y$foundation(textDelegate, j2, layoutDirection, textLayoutResult);
        }

        static final ab restartInput$lambda$0(EditProcessor editProcessor, l lVar, aq aqVar, List list) {
            TextFieldDelegate.Companion.onEditCommand$foundation(list, editProcessor, lVar, (TextInputSession) aqVar.f48105a);
            return ab.f48028a;
        }

        /* renamed from: applyCompositionDecoration-72CqOWE, reason: not valid java name */
        public final TransformedText m3393applyCompositionDecoration72CqOWE(long j2, TransformedText transformedText) {
            int iOriginalToTransformed = transformedText.getOffsetMapping().originalToTransformed(TextRange.m10546getStartimpl(j2));
            int iOriginalToTransformed2 = transformedText.getOffsetMapping().originalToTransformed(TextRange.m10541getEndimpl(j2));
            int iMin = Math.min(iOriginalToTransformed, iOriginalToTransformed2);
            int iMax = Math.max(iOriginalToTransformed, iOriginalToTransformed2);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(transformedText.getText());
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (o) null), iMin, iMax);
            return new TransformedText(builder.toAnnotatedString(), transformedText.getOffsetMapping());
        }

        /* renamed from: draw-Q1vqE60$foundation, reason: not valid java name */
        public final void m3394drawQ1vqE60$foundation(Canvas canvas, TextFieldValue textFieldValue, long j2, long j3, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint paint, long j4) {
            if (!TextRange.m10540getCollapsedimpl(j2)) {
                paint.mo8104setColor8_81llA(j4);
                m3391drawHighlightLepunE(canvas, j2, offsetMapping, textLayoutResult, paint);
            } else if (!TextRange.m10540getCollapsedimpl(j3)) {
                Color colorM8218boximpl = Color.m8218boximpl(textLayoutResult.getLayoutInput().getStyle().m10576getColor0d7_KjU());
                if (colorM8218boximpl.m8238unboximpl() == 16) {
                    colorM8218boximpl = null;
                }
                long jM8238unboximpl = colorM8218boximpl != null ? colorM8218boximpl.m8238unboximpl() : Color.Companion.m8254getBlack0d7_KjU();
                paint.mo8104setColor8_81llA(Color.m8227copywmQWz5c$default(jM8238unboximpl, Color.m8230getAlphaimpl(jM8238unboximpl) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                m3391drawHighlightLepunE(canvas, j3, offsetMapping, textLayoutResult, paint);
            } else if (!TextRange.m10540getCollapsedimpl(textFieldValue.m10831getSelectiond9O1mEE())) {
                paint.mo8104setColor8_81llA(j4);
                m3391drawHighlightLepunE(canvas, textFieldValue.m10831getSelectiond9O1mEE(), offsetMapping, textLayoutResult, paint);
            }
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        /* renamed from: layout-_EkL_-Y$foundation, reason: not valid java name */
        public final p<Integer, Integer, TextLayoutResult> m3395layout_EkL_Y$foundation(TextDelegate textDelegate, long j2, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
            TextLayoutResult textLayoutResultM3382layoutNN6EwU = textDelegate.m3382layoutNN6EwU(j2, layoutDirection, textLayoutResult);
            return new p<>(Integer.valueOf((int) (textLayoutResultM3382layoutNN6EwU.m10517getSizeYbymL2g() >> 32)), Integer.valueOf((int) (textLayoutResultM3382layoutNN6EwU.m10517getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), textLayoutResultM3382layoutNN6EwU);
        }

        public final void notifyFocusedRect$foundation(TextFieldValue textFieldValue, final TextDelegate textDelegate, TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, TextInputSession textInputSession, boolean z, OffsetMapping offsetMapping) {
            if (z) {
                textInputSession.notifyFocusedRect(TextFieldDelegateKt.focusedRectInRoot(textLayoutResult, layoutCoordinates, offsetMapping.originalToTransformed(TextRange.m10543getMaximpl(textFieldValue.m10831getSelectiond9O1mEE())), new a() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        TextDelegate textDelegate2 = textDelegate;
                        return IntSize.m11331boximpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate2.getStyle(), textDelegate2.getDensity(), textDelegate2.getFontFamilyResolver(), 0, 8, null));
                    }
                }));
            }
        }

        public final void onBlur$foundation(TextInputSession textInputSession, EditProcessor editProcessor, l<? super TextFieldValue, ab> lVar) {
            lVar.invoke(TextFieldValue.m10826copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null));
            textInputSession.dispose();
        }

        public final void onEditCommand$foundation(List<? extends EditCommand> list, EditProcessor editProcessor, l<? super TextFieldValue, ab> lVar, TextInputSession textInputSession) {
            TextFieldValue textFieldValueApply = editProcessor.apply(list);
            if (textInputSession != null) {
                textInputSession.updateState(null, textFieldValueApply);
            }
            lVar.invoke(textFieldValueApply);
        }

        public final TextInputSession onFocus$foundation(TextInputService textInputService, TextFieldValue textFieldValue, EditProcessor editProcessor, ImeOptions imeOptions, l<? super TextFieldValue, ab> lVar, l<? super ImeAction, ab> lVar2) {
            return restartInput$foundation(textInputService, textFieldValue, editProcessor, imeOptions, lVar, lVar2);
        }

        public final TextInputSession restartInput$foundation(TextInputService textInputService, TextFieldValue textFieldValue, final EditProcessor editProcessor, ImeOptions imeOptions, final l<? super TextFieldValue, ab> lVar, l<? super ImeAction, ab> lVar2) {
            final aq aqVar = new aq();
            aqVar.f48105a = textInputService.startInput(textFieldValue, imeOptions, new l() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TextFieldDelegate.Companion.restartInput$lambda$0(editProcessor, lVar, aqVar, (List) obj);
                }
            }, lVar2);
            return (TextInputSession) aqVar.f48105a;
        }

        /* renamed from: setCursorOffset-ULxng0E$foundation, reason: not valid java name */
        public final void m3396setCursorOffsetULxng0E$foundation(long j2, TextLayoutResultProxy textLayoutResultProxy, EditProcessor editProcessor, OffsetMapping offsetMapping, l<? super TextFieldValue, ab> lVar) {
            lVar.invoke(TextFieldValue.m10826copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, TextRangeKt.TextRange(offsetMapping.transformedToOriginal(textLayoutResultProxy.m3423getOffsetForPosition3MmeM6k(j2, false | (!((2 & 2) == 0))))), (TextRange) null, 5, (Object) null));
        }

        public final void updateTextLayoutResult$foundation(TextInputSession textInputSession, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy) {
            LayoutCoordinates decorationBoxCoordinates;
            final LayoutCoordinates innerTextFieldCoordinates = textLayoutResultProxy.getInnerTextFieldCoordinates();
            if (innerTextFieldCoordinates == null || !innerTextFieldCoordinates.isAttached() || (decorationBoxCoordinates = textLayoutResultProxy.getDecorationBoxCoordinates()) == null) {
                return;
            }
            textInputSession.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResultProxy.getValue(), new l<Matrix, ab>() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Matrix matrix) {
                    m3397invoke58bKbWc(matrix.m8515unboximpl());
                    return ab.f48028a;
                }

                /* renamed from: invoke-58bKbWc, reason: not valid java name */
                public final void m3397invoke58bKbWc(float[] fArr) {
                    if (innerTextFieldCoordinates.isAttached()) {
                        LayoutCoordinates layoutCoordinates = innerTextFieldCoordinates;
                        LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates).mo9750transformFromEL8BTi8(layoutCoordinates, fArr);
                    }
                }
            }, SelectionManagerKt.visibleBounds(innerTextFieldCoordinates), innerTextFieldCoordinates.localBoundingBoxOf(decorationBoxCoordinates, false));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
