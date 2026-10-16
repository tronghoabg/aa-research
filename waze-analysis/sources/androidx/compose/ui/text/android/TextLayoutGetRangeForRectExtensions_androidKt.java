package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.ui.text.android.LayoutHelper;
import androidx.compose.ui.text.android.selection.SegmentFinder;
import androidx.compose.ui.text.android.selection.SegmentFinder_androidKt;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;
import h.a.c;
import h.g.a.p;
import h.g.b.x;
import h.k.h;
import h.k.j;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextLayoutGetRangeForRectExtensions_androidKt {
    private static final float getCharacterLeftBounds(int i2, int i3, float[] fArr) {
        int i4 = i2 - i3;
        return fArr[i4 + i4];
    }

    private static final float getCharacterRightBounds(int i2, int i3, float[] fArr) {
        int i4 = i2 - i3;
        return fArr[i4 + i4 + 1];
    }

    private static final int getEndOffsetForRectWithinRun(LayoutHelper.BidiRun bidiRun, RectF rectF, int i2, int i3, int i4, float f2, float f3, float[] fArr, SegmentFinder segmentFinder, p<? super RectF, ? super RectF, Boolean> pVar) {
        int end;
        int iNextEndBoundary;
        if (!horizontalOverlap(rectF, f2, f3)) {
            return -1;
        }
        if ((bidiRun.isRtl() || rectF.right < f3) && (!bidiRun.isRtl() || rectF.left > f2)) {
            int start = bidiRun.getStart();
            end = bidiRun.getEnd();
            while (end - start > 1) {
                int i5 = (end + start) / 2;
                float characterLeftBounds = getCharacterLeftBounds(i5, i2, fArr);
                if ((bidiRun.isRtl() || characterLeftBounds <= rectF.right) && (!bidiRun.isRtl() || characterLeftBounds >= rectF.left)) {
                    start = i5;
                } else {
                    end = i5;
                }
            }
            if (true != bidiRun.isRtl()) {
                end = start;
            }
        } else {
            end = bidiRun.getEnd() - 1;
        }
        int iPreviousStartBoundary = segmentFinder.previousStartBoundary(end + 1);
        if (iPreviousStartBoundary == -1 || (iNextEndBoundary = segmentFinder.nextEndBoundary(iPreviousStartBoundary)) <= bidiRun.getStart()) {
            return -1;
        }
        int iH = n.h(iPreviousStartBoundary, bidiRun.getStart());
        int i6 = n.i(iNextEndBoundary, bidiRun.getEnd());
        RectF rectF2 = new RectF(0.0f, i3, 0.0f, i4);
        while (true) {
            rectF2.left = bidiRun.isRtl() ? getCharacterLeftBounds(i6 - 1, i2, fArr) : getCharacterLeftBounds(iH, i2, fArr);
            rectF2.right = bidiRun.isRtl() ? getCharacterRightBounds(iH, i2, fArr) : getCharacterRightBounds(i6 - 1, i2, fArr);
            if (pVar.invoke(rectF2, rectF).booleanValue()) {
                return i6;
            }
            i6 = segmentFinder.previousEndBoundary(i6);
            if (i6 == -1 || i6 <= bidiRun.getStart()) {
                break;
            }
            iH = n.h(segmentFinder.previousStartBoundary(i6), bidiRun.getStart());
        }
        return -1;
    }

    public static final int[] getRangeForRect(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, RectF rectF, int i2, p<? super RectF, ? super RectF, Boolean> pVar) {
        int i3;
        SegmentFinder wordSegmentFinder = i2 == 1 ? new WordSegmentFinder(textLayout.getText(), textLayout.getWordIterator()) : SegmentFinder_androidKt.createGraphemeClusterSegmentFinder(textLayout.getText(), textLayout.getTextPaint());
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > textLayout.getLineBottom(lineForVertical) && (lineForVertical = lineForVertical + 1) >= textLayout.getLineCount()) {
            return null;
        }
        int i4 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0) {
            if (rectF.bottom < textLayout.getLineTop(0)) {
                return null;
            }
            lineForVertical2 = 0;
        }
        int startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i4, rectF, wordSegmentFinder, pVar, true);
        while (true) {
            i3 = i4;
            if (startOrEndOffsetForRectWithinLine != -1 || i3 >= lineForVertical2) {
                break;
            }
            i4 = i3 + 1;
            startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i4, rectF, wordSegmentFinder, pVar, true);
        }
        if (startOrEndOffsetForRectWithinLine == -1) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, lineForVertical2, rectF, wordSegmentFinder, pVar, false);
        while (startOrEndOffsetForRectWithinLine2 == -1 && i3 < lineForVertical2) {
            int i5 = lineForVertical2 - 1;
            startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i5, rectF, wordSegmentFinder, pVar, false);
            lineForVertical2 = i5;
        }
        if (startOrEndOffsetForRectWithinLine2 != -1) {
            return new int[]{wordSegmentFinder.previousStartBoundary(startOrEndOffsetForRectWithinLine + 1), wordSegmentFinder.nextEndBoundary(startOrEndOffsetForRectWithinLine2 - 1)};
        }
        return null;
    }

    private static final int getStartOffsetForRectWithinRun(LayoutHelper.BidiRun bidiRun, RectF rectF, int i2, int i3, int i4, float f2, float f3, float[] fArr, SegmentFinder segmentFinder, p<? super RectF, ? super RectF, Boolean> pVar) {
        int end;
        int iPreviousStartBoundary;
        if (!horizontalOverlap(rectF, f2, f3)) {
            return -1;
        }
        if ((bidiRun.isRtl() || rectF.left > f2) && (!bidiRun.isRtl() || rectF.right < f3)) {
            int start = bidiRun.getStart();
            end = bidiRun.getEnd();
            while (end - start > 1) {
                int i5 = (end + start) / 2;
                float characterLeftBounds = getCharacterLeftBounds(i5, i2, fArr);
                if ((bidiRun.isRtl() || characterLeftBounds <= rectF.left) && (!bidiRun.isRtl() || characterLeftBounds >= rectF.right)) {
                    start = i5;
                } else {
                    end = i5;
                }
            }
            if (true != bidiRun.isRtl()) {
                end = start;
            }
        } else {
            end = bidiRun.getStart();
        }
        int iNextEndBoundary = segmentFinder.nextEndBoundary(end);
        if (iNextEndBoundary == -1 || (iPreviousStartBoundary = segmentFinder.previousStartBoundary(iNextEndBoundary)) >= bidiRun.getEnd()) {
            return -1;
        }
        int iH = n.h(iPreviousStartBoundary, bidiRun.getStart());
        int i6 = n.i(iNextEndBoundary, bidiRun.getEnd());
        RectF rectF2 = new RectF(0.0f, i3, 0.0f, i4);
        while (true) {
            rectF2.left = bidiRun.isRtl() ? getCharacterLeftBounds(i6 - 1, i2, fArr) : getCharacterLeftBounds(iH, i2, fArr);
            rectF2.right = bidiRun.isRtl() ? getCharacterRightBounds(iH, i2, fArr) : getCharacterRightBounds(i6 - 1, i2, fArr);
            if (pVar.invoke(rectF2, rectF).booleanValue()) {
                return iH;
            }
            iH = segmentFinder.nextStartBoundary(iH);
            if (iH == -1 || iH >= bidiRun.getEnd()) {
                break;
            }
            i6 = n.i(segmentFinder.nextEndBoundary(iH), bidiRun.getEnd());
        }
        return -1;
    }

    private static final int getStartOrEndOffsetForRectWithinLine(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, int i2, RectF rectF, SegmentFinder segmentFinder, p<? super RectF, ? super RectF, Boolean> pVar, boolean z) {
        j hVar;
        int lineTop = layout.getLineTop(i2);
        int lineBottom = layout.getLineBottom(i2);
        int lineStart = layout.getLineStart(i2);
        int lineEnd = layout.getLineEnd(i2);
        if (lineStart != lineEnd) {
            int i3 = lineEnd - lineStart;
            float[] fArr = new float[i3 + i3];
            textLayout.fillLineHorizontalBounds$ui_text(i2, fArr);
            LayoutHelper.BidiRun[] lineBidiRuns$ui_text = layoutHelper.getLineBidiRuns$ui_text(i2);
            if (z) {
                x.f(lineBidiRuns$ui_text, "<this>");
                hVar = new j(0, c.A(lineBidiRuns$ui_text));
            } else {
                hVar = new h(c.A(lineBidiRuns$ui_text), 0, -1);
            }
            int iA = hVar.a();
            int iB = hVar.b();
            int iC = hVar.c();
            if ((iC > 0 && iA <= iB) || (iC < 0 && iB <= iA)) {
                int i4 = iA;
                while (true) {
                    LayoutHelper.BidiRun bidiRun = lineBidiRuns$ui_text[i4];
                    float characterLeftBounds = bidiRun.isRtl() ? getCharacterLeftBounds(bidiRun.getEnd() - 1, lineStart, fArr) : getCharacterLeftBounds(bidiRun.getStart(), lineStart, fArr);
                    float characterRightBounds = bidiRun.isRtl() ? getCharacterRightBounds(bidiRun.getStart(), lineStart, fArr) : getCharacterRightBounds(bidiRun.getEnd() - 1, lineStart, fArr);
                    int startOffsetForRectWithinRun = z ? getStartOffsetForRectWithinRun(bidiRun, rectF, lineStart, lineTop, lineBottom, characterLeftBounds, characterRightBounds, fArr, segmentFinder, pVar) : getEndOffsetForRectWithinRun(bidiRun, rectF, lineStart, lineTop, lineBottom, characterLeftBounds, characterRightBounds, fArr, segmentFinder, pVar);
                    if (startOffsetForRectWithinRun < 0) {
                        if (i4 == iB) {
                            break;
                        }
                        i4 += iC;
                    } else {
                        return startOffsetForRectWithinRun;
                    }
                }
            }
        }
        return -1;
    }

    private static final boolean horizontalOverlap(RectF rectF, float f2, float f3) {
        return f3 >= rectF.left && f2 <= rectF.right;
    }
}
