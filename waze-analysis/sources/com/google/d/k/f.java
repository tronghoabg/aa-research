package com.google.d.k;

import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends com.google.d.e.a {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f7954a = {'+'};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f7955b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7956c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean[] f7957d;

    public f(String str, boolean z) {
        an.m(!str.matches(".*[0-9A-Za-z].*"), "Alphanumeric characters are always 'safe' and should not be explicitly specified");
        String strConcat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (z && strConcat.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.f7956c = z;
        char[] charArray = strConcat.toCharArray();
        int iMax = -1;
        for (char c2 : charArray) {
            iMax = Math.max((int) c2, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c3 : charArray) {
            zArr[c3] = true;
        }
        this.f7957d = zArr;
    }

    @Override // com.google.d.e.a
    protected final int a(CharSequence charSequence, int i2, int i3) {
        an.B(charSequence);
        while (i2 < i3) {
            char cCharAt = charSequence.charAt(i2);
            boolean[] zArr = this.f7957d;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                break;
            }
            i2++;
        }
        return i2;
    }

    @Override // com.google.d.e.a
    public final String b(String str) {
        an.B(str);
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            boolean[] zArr = this.f7957d;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                return c(str, i2);
            }
        }
        return str;
    }

    @Override // com.google.d.e.a
    protected final char[] d(int i2) {
        boolean[] zArr = this.f7957d;
        if (i2 < zArr.length && zArr[i2]) {
            return null;
        }
        if (i2 == 32 && this.f7956c) {
            return f7954a;
        }
        if (i2 <= 127) {
            char[] cArr = f7955b;
            return new char[]{'%', cArr[i2 >>> 4], cArr[i2 & 15]};
        }
        if (i2 <= 2047) {
            char[] cArr2 = f7955b;
            return new char[]{'%', cArr2[(i2 >>> 10) | 12], cArr2[(i2 >>> 6) & 15], '%', cArr2[((i2 >>> 4) & 3) | 8], cArr2[i2 & 15]};
        }
        if (i2 <= 65535) {
            char[] cArr3 = f7955b;
            return new char[]{'%', 'E', cArr3[i2 >>> 12], '%', cArr3[((i2 >>> 10) & 3) | 8], cArr3[(i2 >>> 6) & 15], '%', cArr3[((i2 >>> 4) & 3) | 8], cArr3[i2 & 15]};
        }
        if (i2 <= 1114111) {
            char[] cArr4 = f7955b;
            return new char[]{'%', 'F', cArr4[i2 >>> 18], '%', cArr4[((i2 >>> 16) & 3) | 8], cArr4[(i2 >>> 12) & 15], '%', cArr4[((i2 >>> 10) & 3) | 8], cArr4[(i2 >>> 6) & 15], '%', cArr4[((i2 >>> 4) & 3) | 8], cArr4[i2 & 15]};
        }
        throw new IllegalArgumentException("Invalid unicode character value " + i2);
    }
}
