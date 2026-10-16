package j$.util;

import java.util.Arrays;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f50294a;

    /* renamed from: b, reason: collision with root package name */
    public final String f50295b;

    /* renamed from: c, reason: collision with root package name */
    public final String f50296c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f50297d;

    /* renamed from: e, reason: collision with root package name */
    public int f50298e;

    /* renamed from: f, reason: collision with root package name */
    public int f50299f;

    public q1(CharSequence charSequence) {
        Objects.requireNonNull("", "The prefix must not be null");
        Objects.requireNonNull(charSequence, "The delimiter must not be null");
        Objects.requireNonNull("", "The suffix must not be null");
        this.f50294a = "";
        this.f50295b = charSequence.toString();
        this.f50296c = "";
    }

    public static int c(String str, char[] cArr, int i2) {
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        return length;
    }

    public final void a(CharSequence charSequence) {
        String strValueOf = String.valueOf(charSequence);
        String[] strArr = this.f50297d;
        if (strArr == null) {
            this.f50297d = new String[8];
        } else {
            int i2 = this.f50298e;
            if (i2 == strArr.length) {
                this.f50297d = (String[]) Arrays.copyOf(strArr, i2 * 2);
            }
            this.f50299f = this.f50295b.length() + this.f50299f;
        }
        this.f50299f = strValueOf.length() + this.f50299f;
        String[] strArr2 = this.f50297d;
        int i3 = this.f50298e;
        this.f50298e = i3 + 1;
        strArr2[i3] = strValueOf;
    }

    public final void b() {
        String[] strArr;
        if (this.f50298e > 1) {
            char[] cArr = new char[this.f50299f];
            int iC = c(this.f50297d[0], cArr, 0);
            int i2 = 1;
            do {
                int iC2 = c(this.f50295b, cArr, iC) + iC;
                iC = c(this.f50297d[i2], cArr, iC2) + iC2;
                strArr = this.f50297d;
                strArr[i2] = null;
                i2++;
            } while (i2 < this.f50298e);
            this.f50298e = 1;
            strArr[0] = new String(cArr);
        }
    }

    public final String toString() {
        String[] strArr = this.f50297d;
        int i2 = this.f50298e;
        String str = this.f50294a;
        int length = str.length();
        String str2 = this.f50296c;
        int length2 = str2.length() + length;
        if (length2 == 0) {
            b();
            return i2 == 0 ? "" : strArr[0];
        }
        char[] cArr = new char[this.f50299f + length2];
        int iC = c(str, cArr, 0);
        if (i2 > 0) {
            int iC2 = c(strArr[0], cArr, iC) + iC;
            for (int i3 = 1; i3 < i2; i3++) {
                int iC3 = c(this.f50295b, cArr, iC2) + iC2;
                iC2 = c(strArr[i3], cArr, iC3) + iC3;
            }
            iC = iC2;
        }
        c(str2, cArr, iC);
        return new String(cArr);
    }
}
