package E;

import Va.M6;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final int f2668a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2669b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2670c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2671d;

    public C(int i5, int i10, int i11, int i12) {
        this.f2668a = i5;
        this.f2669b = i10;
        this.f2670c = i11;
        this.f2671d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return this.f2668a == c10.f2668a && this.f2669b == c10.f2669b && this.f2670c == c10.f2670c && this.f2671d == c10.f2671d;
    }

    public final int hashCode() {
        return (((((this.f2668a * 31) + this.f2669b) * 31) + this.f2670c) * 31) + this.f2671d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f2668a);
        sb2.append(", top=");
        sb2.append(this.f2669b);
        sb2.append(", right=");
        sb2.append(this.f2670c);
        sb2.append(", bottom=");
        return M6.r(sb2, this.f2671d, ')');
    }
}
