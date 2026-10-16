package androidx.compose.ui.text.input;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PartialGapBuffer {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;
    private GapBuffer buffer;
    private String text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private int bufStart = -1;
    private int bufEnd = -1;

    public PartialGapBuffer(String str) {
        this.text = str;
    }

    public final char get(int i2) {
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

    public final int getLength() {
        GapBuffer gapBuffer = this.buffer;
        String str = this.text;
        return gapBuffer == null ? str.length() : (str.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    public final String getText() {
        return this.text;
    }

    public final void replace(int i2, int i3, String str) {
        if (i2 > i3) {
            InlineClassHelperKt.throwIllegalArgumentException("start index must be less than or equal to end index: " + i2 + " > " + i3);
        }
        if (i2 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("start must be non-negative, but was " + i2);
        }
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer != null) {
            int i4 = this.bufStart;
            int i5 = i2 - i4;
            int i6 = i3 - i4;
            if (i5 >= 0 && i6 <= gapBuffer.length()) {
                gapBuffer.replace(i5, i6, str);
                return;
            }
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            replace(i2, i3, str);
            return;
        }
        int iMax = Math.max(255, str.length() + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i2, 64);
        int iMin2 = Math.min(this.text.length() - i3, 64);
        int i7 = i2 - iMin;
        GapBuffer_jvmAndAndroidKt.toCharArray(this.text, cArr, 0, i7, i2);
        int i8 = iMax - iMin2;
        int i9 = iMin2 + i3;
        GapBuffer_jvmAndAndroidKt.toCharArray(this.text, cArr, i8, i3, i9);
        GapBufferKt.toCharArray(str, cArr, iMin);
        this.buffer = new GapBuffer(cArr, iMin + str.length(), i8);
        this.bufStart = i7;
        this.bufEnd = i9;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        String str = this.text;
        if (gapBuffer == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str, 0, this.bufStart);
        gapBuffer.append(sb);
        String str2 = this.text;
        sb.append((CharSequence) str2, this.bufEnd, str2.length());
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
