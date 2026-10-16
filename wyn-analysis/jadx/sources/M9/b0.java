package m9;

import A7.AbstractC0279p0;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40468a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f40469b;

    public b0(boolean z2, boolean z10) {
        this.f40468a = z2;
        this.f40469b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f40468a == b0Var.f40468a && this.f40469b == b0Var.f40469b;
    }

    public final int hashCode() {
        return ((this.f40468a ? 1 : 0) * 31) + (this.f40469b ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SnapshotMetadata{hasPendingWrites=");
        sb2.append(this.f40468a);
        sb2.append(", isFromCache=");
        return AbstractC0279p0.p(sb2, this.f40469b, '}');
    }
}
