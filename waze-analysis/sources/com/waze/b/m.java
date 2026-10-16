package com.waze.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f16155a;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f16156b;

    public m(Boolean bool, Boolean bool2) {
        this.f16155a = bool;
        this.f16156b = bool2;
    }

    public final Boolean a() {
        return this.f16155a;
    }

    public final Boolean b() {
        return this.f16156b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return h.g.b.x.n(this.f16155a, mVar.f16155a) && h.g.b.x.n(this.f16156b, mVar.f16156b);
    }

    public final int hashCode() {
        Boolean bool = this.f16155a;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.f16156b;
        return (iHashCode * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "AadcRestrictionMode(isAadcRestricted=" + this.f16155a + ", isU16Restricted=" + this.f16156b + ")";
    }
}
