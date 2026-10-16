package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ci {

    /* renamed from: a, reason: collision with root package name */
    private final ck f31164a;

    /* renamed from: b, reason: collision with root package name */
    private final de f31165b;

    /* renamed from: c, reason: collision with root package name */
    private final ag f31166c;

    public ci(ck ckVar, de deVar, ag agVar) {
        this.f31164a = ckVar;
        this.f31165b = deVar;
        this.f31166c = agVar;
    }

    public static /* synthetic */ ci d(ci ciVar, ck ckVar, de deVar, ag agVar, int i2) {
        if ((i2 & 1) != 0) {
            ckVar = ciVar.f31164a;
        }
        if ((i2 & 2) != 0) {
            deVar = ciVar.f31165b;
        }
        if ((i2 & 4) != 0) {
            agVar = ciVar.f31166c;
        }
        return new ci(ckVar, deVar, agVar);
    }

    public final ag a() {
        return this.f31166c;
    }

    public final ck b() {
        return this.f31164a;
    }

    public final de c() {
        return this.f31165b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci)) {
            return false;
        }
        ci ciVar = (ci) obj;
        return h.g.b.x.n(this.f31164a, ciVar.f31164a) && h.g.b.x.n(this.f31165b, ciVar.f31165b) && h.g.b.x.n(this.f31166c, ciVar.f31166c);
    }

    public final int hashCode() {
        ck ckVar = this.f31164a;
        int iHashCode = ckVar == null ? 0 : ckVar.hashCode();
        de deVar = this.f31165b;
        int iHashCode2 = deVar == null ? 0 : deVar.hashCode();
        int i2 = iHashCode * 31;
        ag agVar = this.f31166c;
        return ((i2 + iHashCode2) * 31) + (agVar != null ? agVar.hashCode() : 0);
    }

    public final String toString() {
        return "EtaState(time=" + this.f31164a + ", distance=" + this.f31165b + ", arrivalTime=" + this.f31166c + ")";
    }

    public ci() {
        this(null);
    }

    public /* synthetic */ ci(byte[] bArr) {
        this(null, null, null);
    }
}
