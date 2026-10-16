package androidx.compose.foundation.text.input.internal;

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
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(android.view.inputmethod.CursorAnchorInfo.Builder r14, int r15, int r16, androidx.compose.ui.text.TextLayoutResult r17, androidx.compose.ui.geometry.Rect r18) {
        /*
            r0 = r16
            r1 = r18
            int r2 = r0 - r15
            int r2 = r2 * 4
            float[] r2 = new float[r2]
            androidx.compose.ui.text.MultiParagraph r3 = r17.getMultiParagraph()
            long r4 = androidx.compose.ui.text.TextRangeKt.TextRange(r15, r16)
            r6 = 0
            r3.m10406fillBoundingBoxes8ffj60Q(r4, r2, r6)
            r8 = r15
        L17:
            if (r8 >= r0) goto L76
            int r3 = r8 - r15
            int r3 = r3 * 4
            androidx.compose.ui.geometry.Rect r4 = new androidx.compose.ui.geometry.Rect
            r5 = r2[r3]
            int r6 = r3 + 1
            r6 = r2[r6]
            int r7 = r3 + 2
            r7 = r2[r7]
            int r3 = r3 + 3
            r3 = r2[r3]
            r4.<init>(r5, r6, r7, r3)
            boolean r3 = r1.overlaps(r4)
            float r5 = r4.getLeft()
            float r6 = r4.getTop()
            boolean r5 = androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(r1, r5, r6)
            if (r5 == 0) goto L50
            float r5 = r4.getRight()
            float r6 = r4.getBottom()
            boolean r5 = androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(r1, r5, r6)
            if (r5 != 0) goto L52
        L50:
            r3 = r3 | 2
        L52:
            r5 = r17
            androidx.compose.ui.text.style.ResolvedTextDirection r6 = r5.getBidiRunDirection(r8)
            androidx.compose.ui.text.style.ResolvedTextDirection r7 = androidx.compose.ui.text.style.ResolvedTextDirection.Rtl
            if (r6 != r7) goto L5e
            r3 = r3 | 4
        L5e:
            r13 = r3
            float r9 = r4.getLeft()
            float r10 = r4.getTop()
            float r11 = r4.getRight()
            float r12 = r4.getBottom()
            r7 = r14
            r7.addCharacterBounds(r8, r9, r10, r11, r12, r13)
            int r8 = r8 + 1
            goto L17
        L76:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnchorInfoBuilder_androidKt.addCharacterBounds(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, androidx.compose.ui.text.TextLayoutResult, androidx.compose.ui.geometry.Rect):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    /* renamed from: build-vxqZcH0, reason: not valid java name */
    public static final CursorAnchorInfo m3522buildvxqZcH0(CursorAnchorInfo.Builder builder, CharSequence charSequence, long j2, TextRange textRange, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        int iM10544getMinimpl = TextRange.m10544getMinimpl(j2);
        builder.setSelectionRange(iM10544getMinimpl, TextRange.m10543getMaximpl(j2));
        if (z) {
            setInsertionMarker(builder, iM10544getMinimpl, textLayoutResult, rect);
        }
        if (z2) {
            int iM10544getMinimpl2 = textRange != null ? TextRange.m10544getMinimpl(textRange.m10550unboximpl()) : -1;
            int iM10543getMaximpl = textRange != null ? TextRange.m10543getMaximpl(textRange.m10550unboximpl()) : -1;
            if (iM10544getMinimpl2 >= 0 && iM10544getMinimpl2 < iM10543getMaximpl) {
                builder.setComposingText(iM10544getMinimpl2, charSequence.subSequence(iM10544getMinimpl2, iM10543getMaximpl));
                addCharacterBounds(builder, iM10544getMinimpl2, iM10543getMaximpl, textLayoutResult, rect);
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

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i2, TextLayoutResult textLayoutResult, Rect rect) {
        if (i2 < 0) {
            return builder;
        }
        Rect cursorRect = textLayoutResult.getCursorRect(i2);
        float fG = n.g(cursorRect.getLeft(), 0.0f, (int) (textLayoutResult.m10517getSizeYbymL2g() >> 32));
        boolean zContainsInclusive = LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect, fG, cursorRect.getTop());
        boolean zContainsInclusive2 = LegacyCursorAnchorInfoBuilder_androidKt.containsInclusive(rect, fG, cursorRect.getBottom());
        ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(i2);
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
