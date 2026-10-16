package androidx.compose.ui.text.input;

import h.a.c;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class GapBuffer {
    private char[] buffer;
    private int capacity;
    private int gapEnd;
    private int gapStart;

    public GapBuffer(char[] cArr, int i2, int i3) {
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i2;
        this.gapEnd = i3;
    }

    private final void delete(int i2, int i3) {
        int i4 = this.gapStart;
        if (i2 < i4 && i3 <= i4) {
            char[] cArr = this.buffer;
            int i5 = i4 - i3;
            c.ao(cArr, cArr, this.gapEnd - i5, i3, i4);
            this.gapStart = i2;
            this.gapEnd -= i5;
            return;
        }
        if (i2 < i4 && i3 >= i4) {
            this.gapEnd = i3 + gapLength();
            this.gapStart = i2;
            return;
        }
        int iGapLength = i2 + gapLength();
        int iGapLength2 = i3 + gapLength();
        int i6 = this.gapEnd;
        char[] cArr2 = this.buffer;
        c.ao(cArr2, cArr2, i4, i6, iGapLength);
        this.gapStart += iGapLength - i6;
        this.gapEnd = iGapLength2;
    }

    private final int gapLength() {
        return this.gapEnd - this.gapStart;
    }

    private final void makeSureAvailableSpace(int i2) {
        if (i2 <= gapLength()) {
            return;
        }
        int iGapLength = i2 - gapLength();
        int i3 = this.capacity;
        do {
            i3 += i3;
        } while (i3 - this.capacity < iGapLength);
        char[] cArr = new char[i3];
        c.ao(this.buffer, cArr, 0, 0, this.gapStart);
        int i4 = this.capacity;
        int i5 = this.gapEnd;
        int i6 = i4 - i5;
        int i7 = i3 - i6;
        c.ao(this.buffer, cArr, i7, i5, i6 + i5);
        this.buffer = cArr;
        this.capacity = i3;
        this.gapEnd = i7;
    }

    public final void append(StringBuilder sb) {
        sb.append(this.buffer, 0, this.gapStart);
        x.e(sb, "append(...)");
        char[] cArr = this.buffer;
        int i2 = this.gapEnd;
        sb.append(cArr, i2, this.capacity - i2);
        x.e(sb, "append(...)");
    }

    public final char get(int i2) {
        int i3 = this.gapStart;
        char[] cArr = this.buffer;
        if (i2 < i3) {
            return cArr[i2];
        }
        return cArr[(i2 - i3) + this.gapEnd];
    }

    public final int length() {
        return this.capacity - gapLength();
    }

    public final void replace(int i2, int i3, String str) {
        makeSureAvailableSpace(str.length() - (i3 - i2));
        delete(i2, i3);
        GapBufferKt.toCharArray(str, this.buffer, this.gapStart);
        this.gapStart += str.length();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        return sb.toString();
    }
}
