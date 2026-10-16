package p9;

/* renamed from: p9.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3785f {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC3784e f43352a;

    /* renamed from: b, reason: collision with root package name */
    public final s9.k f43353b;

    public C3785f(EnumC3784e enumC3784e, s9.k kVar) {
        this.f43352a = enumC3784e;
        this.f43353b = kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3785f)) {
            return false;
        }
        C3785f c3785f = (C3785f) obj;
        return this.f43352a.equals(c3785f.f43352a) && this.f43353b.equals(c3785f.f43353b);
    }

    public final int hashCode() {
        int iHashCode = (this.f43352a.hashCode() + 1891) * 31;
        s9.k kVar = this.f43353b;
        return kVar.f45384e.hashCode() + ((kVar.f45380a.f45375a.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "DocumentViewChange(" + this.f43353b + "," + this.f43352a + ")";
    }
}
