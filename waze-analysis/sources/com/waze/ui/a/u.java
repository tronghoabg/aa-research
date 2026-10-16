package com.waze.ui.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final String f41692a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ac.i f41693b;

    /* renamed from: c, reason: collision with root package name */
    private final q f41694c;

    /* renamed from: d, reason: collision with root package name */
    private final String f41695d;

    /* renamed from: e, reason: collision with root package name */
    private final h.o.a f41696e;

    /* renamed from: f, reason: collision with root package name */
    private final String f41697f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f41698g;

    /* renamed from: h, reason: collision with root package name */
    private final t f41699h;

    private u(String str, com.waze.ui.ac.i iVar, q qVar, String str2, h.o.a aVar, String str3, boolean z, t tVar) {
        h.g.b.x.f(tVar, "primaryAction");
        this.f41692a = str;
        this.f41693b = iVar;
        this.f41694c = qVar;
        this.f41695d = str2;
        this.f41696e = aVar;
        this.f41697f = str3;
        this.f41698g = z;
        this.f41699h = tVar;
    }

    public static /* synthetic */ u i(u uVar, String str, int i2) {
        if ((i2 & 1) != 0) {
            str = uVar.f41692a;
        }
        String str2 = str;
        com.waze.ui.ac.i iVar = (i2 & 2) != 0 ? uVar.f41693b : null;
        q qVar = uVar.f41694c;
        String str3 = uVar.f41695d;
        h.o.a aVar = uVar.f41696e;
        String str4 = uVar.f41697f;
        boolean z = uVar.f41698g;
        t tVar = uVar.f41699h;
        h.g.b.x.f(tVar, "primaryAction");
        return new u(str2, iVar, qVar, str3, aVar, str4, z, tVar);
    }

    public final q a() {
        return this.f41694c;
    }

    public final t b() {
        return this.f41699h;
    }

    public final com.waze.ui.ac.i c() {
        return this.f41693b;
    }

    public final String d() {
        return this.f41697f;
    }

    public final String e() {
        return this.f41695d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return h.g.b.x.n(this.f41692a, uVar.f41692a) && h.g.b.x.n(this.f41693b, uVar.f41693b) && h.g.b.x.n(this.f41694c, uVar.f41694c) && h.g.b.x.n(this.f41695d, uVar.f41695d) && h.g.b.x.n(this.f41696e, uVar.f41696e) && h.g.b.x.n(this.f41697f, uVar.f41697f) && this.f41698g == uVar.f41698g && h.g.b.x.n(this.f41699h, uVar.f41699h);
    }

    public final String f() {
        return this.f41692a;
    }

    public final h.o.a g() {
        return this.f41696e;
    }

    public final boolean h() {
        return this.f41698g;
    }

    public final int hashCode() {
        String str = this.f41692a;
        int iHashCode = str == null ? 0 : str.hashCode();
        com.waze.ui.ac.i iVar = this.f41693b;
        int iHashCode2 = iVar == null ? 0 : iVar.hashCode();
        int i2 = iHashCode * 31;
        q qVar = this.f41694c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (qVar == null ? 0 : qVar.hashCode())) * 31;
        String str2 = this.f41695d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        h.o.a aVar = this.f41696e;
        int iB = (iHashCode4 + (aVar == null ? 0 : a.a.b(aVar.w()))) * 31;
        String str3 = this.f41697f;
        return ((((iB + (str3 != null ? str3.hashCode() : 0)) * 31) + a.a.a(this.f41698g)) * 31) + this.f41699h.hashCode();
    }

    public final String toString() {
        return "AdState(title=" + this.f41692a + ", imageSource=" + this.f41693b + ", openStatus=" + this.f41694c + ", rating=" + this.f41695d + ", detourDuration=" + this.f41696e + ", aboutThisAdUrl=" + this.f41697f + ", adInfoVisible=" + this.f41698g + ", primaryAction=" + this.f41699h + ")";
    }

    public /* synthetic */ u(String str, com.waze.ui.ac.i iVar, q qVar, String str2, h.o.a aVar, String str3, boolean z, t tVar, byte[] bArr) {
        this(str, iVar, qVar, str2, aVar, str3, z, tVar);
    }

    public /* synthetic */ u(com.waze.ui.ac.i iVar, q qVar, h.o.a aVar) {
        this("Waze-y Eats", iVar, qVar, "4.2", aVar, "aboutThisAdUrl", false, s.f41691a);
    }
}
