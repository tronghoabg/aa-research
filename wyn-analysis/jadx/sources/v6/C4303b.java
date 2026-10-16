package v6;

import E5.InterfaceC0453h;
import java.util.Arrays;

/* renamed from: v6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4303b implements InterfaceC0453h {

    /* renamed from: a, reason: collision with root package name */
    public final int f46840a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46841b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46842c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f46843d;

    /* renamed from: e, reason: collision with root package name */
    public int f46844e;

    public C4303b(int i5, byte[] bArr, int i10, int i11) {
        this.f46840a = i5;
        this.f46841b = i10;
        this.f46842c = i11;
        this.f46843d = bArr;
    }

    public static int a(int i5) {
        if (i5 == 1) {
            return 1;
        }
        if (i5 != 9) {
            return (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) ? 2 : -1;
        }
        return 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4303b.class == obj.getClass()) {
            C4303b c4303b = (C4303b) obj;
            if (this.f46840a == c4303b.f46840a && this.f46841b == c4303b.f46841b && this.f46842c == c4303b.f46842c && Arrays.equals(this.f46843d, c4303b.f46843d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f46844e == 0) {
            this.f46844e = Arrays.hashCode(this.f46843d) + ((((((527 + this.f46840a) * 31) + this.f46841b) * 31) + this.f46842c) * 31);
        }
        return this.f46844e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f46840a);
        sb2.append(", ");
        sb2.append(this.f46841b);
        sb2.append(", ");
        sb2.append(this.f46842c);
        sb2.append(", ");
        sb2.append(this.f46843d != null);
        sb2.append(")");
        return sb2.toString();
    }
}
