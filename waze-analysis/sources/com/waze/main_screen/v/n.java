package com.waze.main_screen.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.l f27809a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27810b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.ac.g f27811c;

    /* renamed from: d, reason: collision with root package name */
    private final String f27812d;

    /* renamed from: e, reason: collision with root package name */
    private final String f27813e;

    /* renamed from: f, reason: collision with root package name */
    private final String f27814f;

    public n(h.g.a.l lVar, String str, com.waze.ui.ac.g gVar, String str2, String str3, String str4) {
        h.g.b.x.f(lVar, "eventCallback");
        h.g.b.x.f(str, "message");
        this.f27809a = lVar;
        this.f27810b = str;
        this.f27811c = gVar;
        this.f27812d = str2;
        this.f27813e = str3;
        this.f27814f = str4;
    }

    public final com.waze.ui.ac.g a() {
        return this.f27811c;
    }

    public final String b() {
        return this.f27812d;
    }

    public final String c() {
        return this.f27813e;
    }

    public final String d() {
        return this.f27810b;
    }

    public final String e() {
        return this.f27814f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return h.g.b.x.n(this.f27809a, nVar.f27809a) && h.g.b.x.n(this.f27810b, nVar.f27810b) && h.g.b.x.n(this.f27811c, nVar.f27811c) && h.g.b.x.n(this.f27812d, nVar.f27812d) && h.g.b.x.n(this.f27813e, nVar.f27813e) && h.g.b.x.n(this.f27814f, nVar.f27814f);
    }

    public final h.g.a.l f() {
        return this.f27809a;
    }

    public final int hashCode() {
        int iHashCode = (this.f27809a.hashCode() * 31) + this.f27810b.hashCode();
        com.waze.ui.ac.g gVar = this.f27811c;
        int iHashCode2 = ((iHashCode * 31) + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str = this.f27812d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f27813e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27814f;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "State(eventCallback=" + this.f27809a + ", message=" + this.f27810b + ", imageSource=" + this.f27811c + ", ctaMessage=" + this.f27812d + ", id=" + this.f27813e + ", name=" + this.f27814f + ")";
    }

    public n() {
        this(new com.waze.main_screen.s.a(11), "", null, null, null, null);
    }
}
