package defpackage;

import java.io.Serializable;
import java.nio.CharBuffer;

/* loaded from: classes2.dex */
public final class akbh implements CharSequence, Serializable {
    private static final long serialVersionUID = -6208952725094867135L;
    public char[] a;
    public int b;

    public akbh(int i) {
        ahgm.d(i, "Buffer capacity");
        this.a = new char[i];
    }

    private final void k(int i) {
        int length = this.a.length;
        char[] cArr = new char[Math.max(length + length, i)];
        System.arraycopy(this.a, 0, cArr, 0, this.b);
        this.a = cArr;
    }

    public final int a(int i) {
        return b(i, 0, this.b);
    }

    public final int b(int i, int i2, int i3) {
        int i4 = this.b;
        if (i3 > i4) {
            i3 = i4;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 <= i3) {
            while (i2 < i3) {
                if (this.a[i2] == i) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    public final String c(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.bp(i, "Negative beginIndex: "));
        }
        int i3 = this.b;
        if (i2 > i3) {
            throw new IndexOutOfBoundsException(a.bo(i3, i2, "endIndex: ", " > length: "));
        }
        if (i <= i2) {
            return new String(this.a, i, i2 - i);
        }
        throw new IndexOutOfBoundsException(a.bo(i2, i, "beginIndex: ", " > endIndex: "));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a[i];
    }

    public final String d(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.bp(i, "Negative beginIndex: "));
        }
        int i3 = this.b;
        if (i2 > i3) {
            throw new IndexOutOfBoundsException(a.bo(i3, i2, "endIndex: ", " > length: "));
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException(a.bo(i2, i, "beginIndex: ", " > endIndex: "));
        }
        while (i < i2 && akaz.a(this.a[i])) {
            i++;
        }
        while (i2 > i) {
            int i4 = i2 - 1;
            if (!akaz.a(this.a[i4])) {
                break;
            }
            i2 = i4;
        }
        return new String(this.a, i, i2 - i);
    }

    public final void e(char c) {
        int i = this.b + 1;
        if (i > this.a.length) {
            k(i);
        }
        this.a[this.b] = c;
        this.b = i;
    }

    public final void f(String str) {
        if (str == null) {
            str = "null";
        }
        int i = this.b;
        int length = str.length();
        int i2 = i + length;
        if (i2 > this.a.length) {
            k(i2);
        }
        str.getChars(0, length, this.a, this.b);
        this.b = i2;
    }

    public final void g(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (bArr == null) {
            return;
        }
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) < 0 || i3 > length) {
            throw new IndexOutOfBoundsException("off: " + i + " len: " + i2 + " b.length: " + bArr.length);
        }
        if (i2 != 0) {
            int i4 = this.b;
            int i5 = i2 + i4;
            if (i5 > this.a.length) {
                k(i5);
            }
            while (i4 < i5) {
                this.a[i4] = (char) (bArr[i] & 255);
                i++;
                i4++;
            }
            this.b = i5;
        }
    }

    public final void h(char[] cArr, int i, int i2) {
        int length;
        int i3;
        if (cArr == null) {
            return;
        }
        if (i < 0 || i > (length = cArr.length) || i2 < 0 || (i3 = i + i2) < 0 || i3 > length) {
            throw new IndexOutOfBoundsException("off: " + i + " len: " + i2 + " b.length: " + cArr.length);
        }
        if (i2 != 0) {
            int i4 = this.b + i2;
            if (i4 > this.a.length) {
                k(i4);
            }
            System.arraycopy(cArr, i, this.a, this.b, i2);
            this.b = i4;
        }
    }

    public final void i() {
        this.b = 0;
    }

    public final boolean isEmpty() {
        return this.b == 0;
    }

    public final void j(int i) {
        if (i <= 0) {
            return;
        }
        int length = this.a.length;
        int i2 = this.b;
        if (i > length - i2) {
            k(i2 + i);
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.bp(i, "Negative beginIndex: "));
        }
        int i3 = this.b;
        if (i2 > i3) {
            throw new IndexOutOfBoundsException(a.bo(i3, i2, "endIndex: ", " > length: "));
        }
        if (i <= i2) {
            return CharBuffer.wrap(this.a, i, i2);
        }
        throw new IndexOutOfBoundsException(a.bo(i2, i, "beginIndex: ", " > endIndex: "));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.a, 0, this.b);
    }
}
