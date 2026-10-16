package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CursorAnchorInfoBuilder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, androidx.compose.ui.text.input.OffsetMapping r20, androidx.compose.ui.text.TextLayoutResult r21, androidx.compose.ui.geometry.Rect r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r18
            r3 = r22
            int r4 = r1.originalToTransformed(r2)
            int r5 = r1.originalToTransformed(r0)
            int r6 = r5 - r4
            int r6 = r6 * 4
            float[] r6 = new float[r6]
            androidx.compose.ui.text.MultiParagraph r7 = r21.getMultiParagraph()
            long r8 = androidx.compose.ui.text.TextRangeKt.TextRange(r4, r5)
            r5 = 0
            r7.m10406fillBoundingBoxes8ffj60Q(r8, r6, r5)
            r11 = r2
        L23:
            if (r11 >= r0) goto L88
            int r2 = r1.originalToTransformed(r11)
            int r5 = r2 - r4
            int r5 = r5 * 4
            androidx.compose.ui.geometry.Rect r7 = new androidx.compose.ui.geometry.Rect
            r8 = r6[r5]
            int r9 = r5 + 1
            r9 = r6[r9]
            int r10 = r5 + 2
            r10 = r6[r10]
            int r5 = r5 + 3
            r5 = r6[r5]
            r7.<init>(r8, r9, r10, r5)
            boolean r5 = r3.overlaps(r7)
            float r8 = r7.getLeft()
            float r9 = r7.getTop()
            boolean r8 = containsInclusive(r3, r8, r9)
            if (r8 == 0) goto L60
            float r8 = r7.getRight()
            float r9 = r7.getBottom()
            boolean r8 = containsInclusive(r3, r8, r9)
            if (r8 != 0) goto L62
        L60:
            r5 = r5 | 2
        L62:
            r8 = r21
            androidx.compose.ui.text.style.ResolvedTextDirection r2 = r8.getBidiRunDirection(r2)
            androidx.compose.ui.text.style.ResolvedTextDirection r9 = androidx.compose.ui.text.style.ResolvedTextDirection.Rtl
            if (r2 != r9) goto L6e
            r5 = r5 | 4
        L6e:
            r16 = r5
            float r12 = r7.getLeft()
            float r13 = r7.getTop()
            float r14 = r7.getRight()
            float r15 = r7.getBottom()
            r10 = r17
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r11 = r11 + 1
            goto L23
        L88:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.CursorAnchorInfoBuilder_androidKt.addCharacterBounds(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, androidx.compose.ui.text.input.OffsetMapping, androidx.compose.ui.text.TextLayoutResult, androidx.compose.ui.geometry.Rect):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    public static final CursorAnchorInfo build(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        int iM10544getMinimpl = TextRange.m10544getMinimpl(textFieldValue.m10831getSelectiond9O1mEE());
        builder.setSelectionRange(iM10544getMinimpl, TextRange.m10543getMaximpl(textFieldValue.m10831getSelectiond9O1mEE()));
        if (z) {
            setInsertionMarker(builder, iM10544getMinimpl, offsetMapping, textLayoutResult, rect);
        }
        if (z2) {
            TextRange textRangeM10830getCompositionMzsxiRA = textFieldValue.m10830getCompositionMzsxiRA();
            int iM10544getMinimpl2 = textRangeM10830getCompositionMzsxiRA != null ? TextRange.m10544getMinimpl(textRangeM10830getCompositionMzsxiRA.m10550unboximpl()) : -1;
            TextRange textRangeM10830getCompositionMzsxiRA2 = textFieldValue.m10830getCompositionMzsxiRA();
            int iM10543getMaximpl = textRangeM10830getCompositionMzsxiRA2 != null ? TextRange.m10543getMaximpl(textRangeM10830getCompositionMzsxiRA2.m10550unboximpl()) : -1;
            if (iM10544getMinimpl2 >= 0 && iM10544getMinimpl2 < iM10543getMaximpl) {
                builder.setComposingText(iM10544getMinimpl2, textFieldValue.getText().subSequence(iM10544getMinimpl2, iM10543getMaximpl));
                addCharacterBounds(builder, iM10544getMinimpl2, iM10543getMaximpl, offsetMapping, textLayoutResult, rect);
            }
        }
        if (Build.VERSION.SDK_INT >= 33 && z3) {
            CursorAnchorInfoApi33Helper.setEditorBoundsInfo(builder, rect2);
        }
        if (Build.VERSION.SDK_INT >= 34 && z4) {
            CursorAnchorInfoApi34Helper.addVisibleLineBounds(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    private static final boolean containsInclusive(Rect rect, float f2, float f3) {
        float left = rect.getLeft();
        if (f2 > rect.getRight() || left > f2) {
            return false;
        }
        return f3 <= rect.getBottom() && rect.getTop() <= f3;
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i2, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect rect) {
        if (i2 < 0) {
            return builder;
        }
        int iOriginalToTransformed = offsetMapping.originalToTransformed(i2);
        Rect cursorRect = textLayoutResult.getCursorRect(iOriginalToTransformed);
        float fG = n.g(cursorRect.getLeft(), 0.0f, (int) (textLayoutResult.m10517getSizeYbymL2g() >> 32));
        boolean zContainsInclusive = containsInclusive(rect, fG, cursorRect.getTop());
        boolean zContainsInclusive2 = containsInclusive(rect, fG, cursorRect.getBottom());
        ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(iOriginalToTransformed);
        ResolvedTextDirection resolvedTextDirection = ResolvedTextDirection.Rtl;
        int i3 = 1;
        if (!zContainsInclusive && !zContainsInclusive2) {
            i3 = 0;
        }
        if (!zContainsInclusive || !zContainsInclusive2) {
            i3 |= 2;
        }
        if (bidiRunDirection == resolvedTextDirection) {
            i3 |= 4;
        }
        builder.setInsertionMarkerLocation(fG, cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), i3);
        return builder;
    }
}
