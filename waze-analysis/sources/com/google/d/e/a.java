package com.google.d.e;

import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class a {
    protected a() {
    }

    private static char[] e(char[] cArr, int i2, int i3) {
        if (i3 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i3];
        if (i2 > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i2);
        }
        return cArr2;
    }

    protected int a(CharSequence charSequence, int i2, int i3) {
        throw null;
    }

    public String b(String str) {
        throw null;
    }

    protected final String c(String str, int i2) {
        int length = str.length();
        char[] cArrA = c.a();
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            an.B(str);
            if (i2 >= length) {
                throw new IndexOutOfBoundsException("Index exceeds specified range");
            }
            int i5 = i2 + 1;
            char cCharAt = str.charAt(i2);
            int codePoint = cCharAt;
            if (cCharAt >= 55296) {
                codePoint = cCharAt;
                if (cCharAt <= 57343) {
                    if (cCharAt > 56319) {
                        throw new IllegalArgumentException("Unexpected low surrogate character '" + cCharAt + "' with value " + ((int) cCharAt) + " at index " + i2 + " in '" + String.valueOf(str) + "'");
                    }
                    if (i5 == length) {
                        codePoint = -cCharAt;
                    } else {
                        char cCharAt2 = str.charAt(i5);
                        if (!Character.isLowSurrogate(cCharAt2)) {
                            throw new IllegalArgumentException("Expected low surrogate but got char '" + cCharAt2 + "' with value " + ((int) cCharAt2) + " at index " + i5 + " in '" + String.valueOf(str) + "'");
                        }
                        codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                    }
                }
            }
            if (codePoint < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] cArrD = d(codePoint);
            int iCharCount = Character.charCount(codePoint) + i2;
            if (cArrD != null) {
                int i6 = i2 - i3;
                int i7 = i4 + i6;
                int length2 = cArrA.length;
                int length3 = cArrD.length;
                int i8 = i7 + length3;
                if (length2 < i8) {
                    cArrA = e(cArrA, i4, i8 + (length - i2) + 32);
                }
                if (i6 > 0) {
                    str.getChars(i3, i2, cArrA, i4);
                    i4 = i7;
                }
                System.arraycopy(cArrD, 0, cArrA, i4, length3);
                i4 += length3;
                i3 = iCharCount;
            }
            i2 = a(str, iCharCount, length);
        }
        int i9 = length - i3;
        if (i9 > 0) {
            int i10 = i9 + i4;
            if (cArrA.length < i10) {
                cArrA = e(cArrA, i4, i10);
            }
            str.getChars(i3, length, cArrA, i4);
            i4 = i10;
        }
        return new String(cArrA, 0, i4);
    }

    protected abstract char[] d(int i2);
}
