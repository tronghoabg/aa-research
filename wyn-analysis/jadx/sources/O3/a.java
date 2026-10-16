package O3;

import A7.AbstractC0279p0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8852a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8853b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8854c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8855d;

    public a(boolean z2, boolean z10, boolean z11, boolean z12) {
        this.f8852a = z2;
        this.f8853b = z10;
        this.f8854c = z11;
        this.f8855d = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8852a == aVar.f8852a && this.f8853b == aVar.f8853b && this.f8854c == aVar.f8854c && this.f8855d == aVar.f8855d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z2 = this.f8852a;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int i10 = i5 * 31;
        boolean z10 = this.f8853b;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z11 = this.f8854c;
        int i13 = z11;
        if (z11 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z12 = this.f8855d;
        return i14 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkState(isConnected=");
        sb2.append(this.f8852a);
        sb2.append(", isValidated=");
        sb2.append(this.f8853b);
        sb2.append(", isMetered=");
        sb2.append(this.f8854c);
        sb2.append(", isNotRoaming=");
        return AbstractC0279p0.p(sb2, this.f8855d, ')');
    }
}
