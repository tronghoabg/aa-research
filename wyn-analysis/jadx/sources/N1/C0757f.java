package N1;

import java.util.Arrays;
import ka.AbstractC3256n;

/* renamed from: N1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0757f {

    /* renamed from: h, reason: collision with root package name */
    public static final C0757f f8149h = new C0757f(1, 2, 3, -1, -1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f8150a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8151b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8152c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8153d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8154e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8155f;

    /* renamed from: g, reason: collision with root package name */
    public int f8156g;

    static {
        N0.a.k(0, 1, 2, 3, 4);
        Q1.x.E(5);
    }

    public C0757f(int i5, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f8150a = i5;
        this.f8151b = i10;
        this.f8152c = i11;
        this.f8153d = bArr;
        this.f8154e = i12;
        this.f8155f = i13;
    }

    public static String a(int i5) {
        return i5 != -1 ? i5 != 1 ? i5 != 2 ? AbstractC3256n.g(i5, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i5) {
        return i5 != -1 ? i5 != 6 ? i5 != 1 ? i5 != 2 ? AbstractC3256n.g(i5, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i5) {
        return i5 != -1 ? i5 != 10 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 6 ? i5 != 7 ? AbstractC3256n.g(i5, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean e(C0757f c0757f) {
        if (c0757f == null) {
            return true;
        }
        int i5 = c0757f.f8150a;
        if (i5 != -1 && i5 != 1 && i5 != 2) {
            return false;
        }
        int i10 = c0757f.f8151b;
        if (i10 != -1 && i10 != 2) {
            return false;
        }
        int i11 = c0757f.f8152c;
        if ((i11 != -1 && i11 != 3) || c0757f.f8153d != null) {
            return false;
        }
        int i12 = c0757f.f8155f;
        if (i12 != -1 && i12 != 8) {
            return false;
        }
        int i13 = c0757f.f8154e;
        return i13 == -1 || i13 == 8;
    }

    public static int f(int i5) {
        if (i5 == 1) {
            return 1;
        }
        if (i5 != 9) {
            return (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i5) {
        if (i5 == 1) {
            return 3;
        }
        if (i5 == 4) {
            return 10;
        }
        if (i5 == 13) {
            return 2;
        }
        if (i5 == 16) {
            return 6;
        }
        if (i5 != 18) {
            return (i5 == 6 || i5 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.f8150a == -1 || this.f8151b == -1 || this.f8152c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0757f.class == obj.getClass()) {
            C0757f c0757f = (C0757f) obj;
            if (this.f8150a == c0757f.f8150a && this.f8151b == c0757f.f8151b && this.f8152c == c0757f.f8152c && Arrays.equals(this.f8153d, c0757f.f8153d) && this.f8154e == c0757f.f8154e && this.f8155f == c0757f.f8155f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8156g == 0) {
            this.f8156g = ((((Arrays.hashCode(this.f8153d) + ((((((527 + this.f8150a) * 31) + this.f8151b) * 31) + this.f8152c) * 31)) * 31) + this.f8154e) * 31) + this.f8155f;
        }
        return this.f8156g;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f8150a));
        sb2.append(", ");
        sb2.append(a(this.f8151b));
        sb2.append(", ");
        sb2.append(c(this.f8152c));
        sb2.append(", ");
        sb2.append(this.f8153d != null);
        sb2.append(", ");
        String str2 = "NA";
        int i5 = this.f8154e;
        if (i5 != -1) {
            str = i5 + "bit Luma";
        } else {
            str = "NA";
        }
        sb2.append(str);
        sb2.append(", ");
        int i10 = this.f8155f;
        if (i10 != -1) {
            str2 = i10 + "bit Chroma";
        }
        return wg.b.c(sb2, str2, ")");
    }
}
