package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PartialGapBuffer implements CharSequence {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;
    private GapBuffer buffer;
    private CharSequence text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private int bufStart = -1;
    private int bufEnd = -1;

    public PartialGapBuffer(CharSequence charSequence) {
        this.text = charSequence;
    }

    public static /* synthetic */ void replace$default(PartialGapBuffer partialGapBuffer, int i2, int i3, CharSequence charSequence, int i4, int i5, int i6, Object obj) {
        if ((i6 & 16) != 0) {
            i5 = charSequence.length();
        }
        int i7 = i5;
        if ((i6 & 8) != 0) {
            i4 = 0;
        }
        partialGapBuffer.replace(i2, i3, charSequence, i4, i7);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i2) {
        return get(i2);
    }

    public final boolean contentEquals(CharSequence charSequence) {
        return x.n(toString(), charSequence.toString());
    }

    public char get(int i2) {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.charAt(i2);
        }
        int i3 = this.bufStart;
        if (i2 < i3) {
            return this.text.charAt(i2);
        }
        int length = gapBuffer.length();
        return i2 < length + i3 ? gapBuffer.get(i2 - i3) : this.text.charAt(i2 - ((length - this.bufEnd) + i3));
    }

    public int getLength() {
        GapBuffer gapBuffer = this.buffer;
        CharSequence charSequence = this.text;
        return gapBuffer == null ? charSequence.length() : (charSequence.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final void replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        if (i2 > i3) {
            InlineClassHelperKt.throwIllegalArgumentException("start=" + i2 + " > end=" + i3);
        }
        if (i4 > i5) {
            InlineClassHelperKt.throwIllegalArgumentException("textStart=" + i4 + " > textEnd=" + i5);
        }
        if (i2 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("start must be non-negative, but was " + i2);
        }
        if (i4 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("textStart must be non-negative, but was " + i4);
        }
        GapBuffer gapBuffer = this.buffer;
        int i6 = i5 - i4;
        if (gapBuffer != null) {
            int i7 = this.bufStart;
            int i8 = i2 - i7;
            int i9 = i3 - i7;
            if (i8 >= 0 && i9 <= gapBuffer.length()) {
                gapBuffer.replace(i8, i9, charSequence, i4, i5);
                return;
            }
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            replace(i2, i3, charSequence, i4, i5);
            return;
        }
        int iMax = Math.max(255, i6 + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i2, 64);
        int iMin2 = Math.min(this.text.length() - i3, 64);
        int i10 = i2 - iMin;
        ToCharArray_androidKt.toCharArray(this.text, cArr, 0, i10, i2);
        int i11 = iMax - iMin2;
        int i12 = iMin2 + i3;
        ToCharArray_androidKt.toCharArray(this.text, cArr, i11, i3, i12);
        ToCharArray_androidKt.toCharArray(charSequence, cArr, iMin, i4, i5);
        this.buffer = new GapBuffer(cArr, iMin + i6, i11);
        this.bufStart = i10;
        this.bufEnd = i12;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return toString().subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.toString();
        }
        StringBuilder sb = new StringBuilder(((this.bufStart + gapBuffer.length()) + this.text.length()) - this.bufEnd);
        sb.append(this.text, 0, this.bufStart);
        gapBuffer.append(sb);
        CharSequence charSequence = this.text;
        sb.append(charSequence, this.bufEnd, charSequence.length());
        return sb.toString();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
