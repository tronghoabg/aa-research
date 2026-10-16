package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dg extends com.waze.car_lib.r.cq {

    /* renamed from: a, reason: collision with root package name */
    private final String f20784a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20785b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f20786c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f20787d;

    /* renamed from: e, reason: collision with root package name */
    private final dc f20788e;

    /* renamed from: f, reason: collision with root package name */
    private final dc f20789f;

    public /* synthetic */ dg(String str, String str2, Integer num, boolean z, dc dcVar, dc dcVar2, int i2) {
        this(str, str2, (i2 & 4) != 0 ? null : num, z | (!((i2 & 8) == 0)), (i2 & 16) != 0 ? null : dcVar, (i2 & 32) != 0 ? null : dcVar2);
    }

    public final dc a() {
        return this.f20788e;
    }

    public final dc c() {
        return this.f20789f;
    }

    public final Integer d() {
        return this.f20786c;
    }

    public final String e() {
        return this.f20785b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg)) {
            return false;
        }
        dg dgVar = (dg) obj;
        return h.g.b.x.n(this.f20784a, dgVar.f20784a) && h.g.b.x.n(this.f20785b, dgVar.f20785b) && h.g.b.x.n(this.f20786c, dgVar.f20786c) && this.f20787d == dgVar.f20787d && h.g.b.x.n(this.f20788e, dgVar.f20788e) && h.g.b.x.n(this.f20789f, dgVar.f20789f);
    }

    public final boolean f() {
        return this.f20787d;
    }

    public final int hashCode() {
        String str = this.f20784a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + this.f20785b.hashCode();
        Integer num = this.f20786c;
        int iHashCode2 = ((((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + a.a.a(this.f20787d)) * 31;
        dc dcVar = this.f20788e;
        int iHashCode3 = (iHashCode2 + (dcVar == null ? 0 : dcVar.hashCode())) * 31;
        dc dcVar2 = this.f20789f;
        return iHashCode3 + (dcVar2 != null ? dcVar2.hashCode() : 0);
    }

    @Override // com.waze.car_lib.r.cq
    public final String m() {
        return this.f20784a;
    }

    public final String toString() {
        return "Message(title=" + this.f20784a + ", message=" + this.f20785b + ", iconResId=" + this.f20786c + ", shouldShowBackButton=" + this.f20787d + ", firstAction=" + this.f20788e + ", secondAction=" + this.f20789f + ")";
    }

    public dg(String str, String str2, Integer num, boolean z, dc dcVar, dc dcVar2) {
        h.g.b.x.f(str2, "message");
        this.f20784a = str;
        this.f20785b = str2;
        this.f20786c = num;
        this.f20787d = z;
        this.f20788e = dcVar;
        this.f20789f = dcVar2;
    }
}
