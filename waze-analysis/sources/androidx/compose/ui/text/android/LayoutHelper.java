package androidx.compose.ui.text.android;

import android.text.Layout;
import h.a.i;
import h.g.b.x;
import h.n.o;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayoutHelper {
    public static final int $stable = 8;
    private final boolean[] bidiProcessedParagraphs;
    private final Layout layout;
    private final List<Bidi> paragraphBidi;
    private final int paragraphCount;
    private final List<Integer> paragraphEnds;
    private char[] tmpBuffer;

    /* compiled from: WazeSource */
    public final class BidiRun {
        public static final int $stable = 0;
        private final int end;
        private final boolean isRtl;
        private final int start;

        public BidiRun(int i2, int i3, boolean z) {
            this.start = i2;
            this.end = i3;
            this.isRtl = z;
        }

        public static /* synthetic */ BidiRun copy$default(BidiRun bidiRun, int i2, int i3, boolean z, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = bidiRun.start;
            }
            if ((i4 & 2) != 0) {
                i3 = bidiRun.end;
            }
            if ((i4 & 4) != 0) {
                z = bidiRun.isRtl;
            }
            return bidiRun.copy(i2, i3, z);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final boolean component3() {
            return this.isRtl;
        }

        public final BidiRun copy(int i2, int i3, boolean z) {
            return new BidiRun(i2, i3, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) obj;
            return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (((this.start * 31) + this.end) * 31) + LayoutHelper$BidiRun$$ExternalSyntheticBackport0.m(this.isRtl);
        }

        public final boolean isRtl() {
            return this.isRtl;
        }

        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }
    }

    public LayoutHelper(Layout layout) {
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iW = o.W(this.layout.getText(), '\n', length, 4);
            length = iW < 0 ? this.layout.getText().length() : iW + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    private final float getDownstreamHorizontal(int i2, boolean z) {
        Layout layout = this.layout;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i2));
        if (i2 > lineEnd) {
            i2 = lineEnd;
        }
        Layout layout2 = this.layout;
        return z ? layout2.getPrimaryHorizontal(i2) : layout2.getSecondaryHorizontal(i2);
    }

    public static /* synthetic */ int getParagraphForOffset$default(LayoutHelper layoutHelper, int i2, boolean z, int i3, Object obj) {
        return layoutHelper.getParagraphForOffset(i2, z & ((i3 & 2) == 0));
    }

    private final int lineEndToVisibleEnd(int i2, int i3) {
        while (i2 > i3) {
            int i4 = i2 - 1;
            if (!isLineEndSpace(this.layout.getText().charAt(i4))) {
                break;
            }
            i2 = i4;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.text.Bidi analyzeBidi(int r11) {
        /*
            r10 = this;
            boolean[] r0 = r10.bidiProcessedParagraphs
            boolean r0 = r0[r11]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r10 = r10.paragraphBidi
            java.lang.Object r10 = r10.get(r11)
            java.text.Bidi r10 = (java.text.Bidi) r10
            return r10
        Lf:
            r0 = 0
            if (r11 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List<java.lang.Integer> r1 = r10.paragraphEnds
            int r2 = r11 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List<java.lang.Integer> r2 = r10.paragraphEnds
            java.lang.Object r2 = r2.get(r11)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r10.tmpBuffer
            if (r3 == 0) goto L37
            int r4 = r3.length
            if (r4 >= r8) goto L39
        L37:
            char[] r3 = new char[r8]
        L39:
            r4 = r3
            android.text.Layout r3 = r10.layout
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r4, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r4, r0, r8)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L5d
            boolean r9 = r10.isRtlParagraph(r11)
            java.text.Bidi r3 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r0 = r3.getRunCount()
            if (r0 != r1) goto L5e
        L5d:
            r3 = r2
        L5e:
            java.util.List<java.text.Bidi> r0 = r10.paragraphBidi
            r0.set(r11, r3)
            boolean[] r0 = r10.bidiProcessedParagraphs
            r0[r11] = r1
            if (r3 == 0) goto L70
            char[] r11 = r10.tmpBuffer
            if (r4 != r11) goto L6f
            r4 = r2
            goto L70
        L6f:
            r4 = r11
        L70:
            r10.tmpBuffer = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.LayoutHelper.analyzeBidi(int):java.text.Bidi");
    }

    public final float getHorizontalPosition(int i2, boolean z, boolean z2) {
        int iLineEndToVisibleEnd = i2;
        if (!z2) {
            return getDownstreamHorizontal(i2, z);
        }
        boolean z3 = true;
        int lineForOffset = LayoutCompat_androidKt.getLineForOffset(this.layout, iLineEndToVisibleEnd, true);
        int lineStart = this.layout.getLineStart(lineForOffset);
        int lineEnd = this.layout.getLineEnd(lineForOffset);
        if (iLineEndToVisibleEnd != lineStart && iLineEndToVisibleEnd != lineEnd) {
            return getDownstreamHorizontal(i2, z);
        }
        if (iLineEndToVisibleEnd == 0 || iLineEndToVisibleEnd == this.layout.getText().length()) {
            return getDownstreamHorizontal(i2, z);
        }
        int paragraphForOffset = getParagraphForOffset(iLineEndToVisibleEnd, true);
        boolean zIsRtlParagraph = isRtlParagraph(paragraphForOffset);
        int iLineEndToVisibleEnd2 = lineEndToVisibleEnd(lineEnd, lineStart);
        int paragraphStart = getParagraphStart(paragraphForOffset);
        int i3 = lineStart - paragraphStart;
        int i4 = iLineEndToVisibleEnd2 - paragraphStart;
        Bidi bidiAnalyzeBidi = analyzeBidi(paragraphForOffset);
        Bidi bidiCreateLineBidi = bidiAnalyzeBidi != null ? bidiAnalyzeBidi.createLineBidi(i3, i4) : null;
        int i5 = 0;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (!z && zIsRtlParagraph != zIsRtlCharAt) {
                z3 = zIsRtlParagraph;
            } else if (zIsRtlParagraph) {
                z3 = false;
            }
            return (iLineEndToVisibleEnd != lineStart ? z3 : !z3) ? this.layout.getLineRight(lineForOffset) : this.layout.getLineLeft(lineForOffset);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            bidiRunArr[i6] = new BidiRun(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        if (iLineEndToVisibleEnd == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i8 = -1;
                    break;
                }
                if (bidiRunArr[i8].getStart() == iLineEndToVisibleEnd) {
                    break;
                }
                i8++;
            }
            BidiRun bidiRun = bidiRunArr[i8];
            if (z || zIsRtlParagraph == bidiRun.isRtl()) {
                zIsRtlParagraph = !zIsRtlParagraph;
            }
            if (i8 != 0) {
                i5 = i8;
            } else if (zIsRtlParagraph) {
                return this.layout.getLineLeft(lineForOffset);
            }
            x.f(bidiRunArr, "<this>");
            if (i5 == runCount - 1 && !zIsRtlParagraph) {
                return this.layout.getLineRight(lineForOffset);
            }
            Layout layout = this.layout;
            return zIsRtlParagraph ? layout.getPrimaryHorizontal(bidiRunArr[i5 - 1].getStart()) : layout.getPrimaryHorizontal(bidiRunArr[i5 + 1].getStart());
        }
        if (iLineEndToVisibleEnd > iLineEndToVisibleEnd2) {
            iLineEndToVisibleEnd = lineEndToVisibleEnd(iLineEndToVisibleEnd, lineStart);
        }
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i9 = -1;
                break;
            }
            if (bidiRunArr[i9].getEnd() == iLineEndToVisibleEnd) {
                break;
            }
            i9++;
        }
        BidiRun bidiRun2 = bidiRunArr[i9];
        if (!z && zIsRtlParagraph != bidiRun2.isRtl()) {
            zIsRtlParagraph = !zIsRtlParagraph;
        }
        if (i9 != 0) {
            i5 = i9;
        } else if (zIsRtlParagraph) {
            return this.layout.getLineLeft(lineForOffset);
        }
        x.f(bidiRunArr, "<this>");
        if (i5 == runCount - 1 && !zIsRtlParagraph) {
            return this.layout.getLineRight(lineForOffset);
        }
        Layout layout2 = this.layout;
        return zIsRtlParagraph ? layout2.getPrimaryHorizontal(bidiRunArr[i5 - 1].getEnd()) : layout2.getPrimaryHorizontal(bidiRunArr[i5 + 1].getEnd());
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final BidiRun[] getLineBidiRuns$ui_text(int i2) {
        Bidi bidiCreateLineBidi;
        Layout layout = this.layout;
        int lineStart = layout.getLineStart(i2);
        int lineEnd = layout.getLineEnd(i2);
        int paragraphForOffset$default = getParagraphForOffset$default(this, lineStart, false, 2, null);
        int paragraphStart = getParagraphStart(paragraphForOffset$default);
        int i3 = lineStart - paragraphStart;
        int i4 = lineEnd - paragraphStart;
        Bidi bidiAnalyzeBidi = analyzeBidi(paragraphForOffset$default);
        if (bidiAnalyzeBidi == null || (bidiCreateLineBidi = bidiAnalyzeBidi.createLineBidi(i3, i4)) == null) {
            return new BidiRun[]{new BidiRun(lineStart, lineEnd, this.layout.isRtlCharAt(lineStart))};
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i5 = 0; i5 < runCount; i5++) {
            bidiRunArr[i5] = new BidiRun(bidiCreateLineBidi.getRunStart(i5) + lineStart, bidiCreateLineBidi.getRunLimit(i5) + lineStart, bidiCreateLineBidi.getRunLevel(i5) % 2 == 1);
        }
        return bidiRunArr;
    }

    public final int getLineVisibleEnd(int i2) {
        Layout layout = this.layout;
        return lineEndToVisibleEnd(layout.getLineEnd(i2), layout.getLineStart(i2));
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public final int getParagraphEnd(int i2) {
        return this.paragraphEnds.get(i2).intValue();
    }

    public final int getParagraphForOffset(int i2, boolean z) {
        int iAI = i.aI(this.paragraphEnds, Integer.valueOf(i2));
        int i3 = iAI < 0 ? -(iAI + 1) : iAI + 1;
        if (z && i3 > 0) {
            int i4 = i3 - 1;
            if (i2 == this.paragraphEnds.get(i4).intValue()) {
                return i4;
            }
        }
        return i3;
    }

    public final int getParagraphStart(int i2) {
        if (i2 == 0) {
            return 0;
        }
        return this.paragraphEnds.get(i2 - 1).intValue();
    }

    public final boolean isLineEndSpace(char c2) {
        if (c2 == ' ' || c2 == '\n' || c2 == 5760) {
            return true;
        }
        if (x.a(c2, 8192) >= 0 && x.a(c2, 8202) <= 0) {
            if (c2 != 8199) {
                return true;
            }
            c2 = 8199;
        }
        return c2 == 8287 || c2 == 12288;
    }

    public final boolean isRtlParagraph(int i2) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(getParagraphStart(i2))) == -1;
    }
}
