package com.waze.main_screen.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.b.a.f f26277a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.main_screen.ae.a.d f26278b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.main_screen.j.a.h f26279c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.nav_connect.b.j f26280d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.main_screen.c.e.i f26281e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.main_screen.c.f.i f26282f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.o.d.b.a.d f26283g;

    public u(com.waze.main_screen.b.a.f fVar, com.waze.main_screen.ae.a.d dVar, com.waze.main_screen.j.a.h hVar, com.waze.main_screen.c.f.i iVar, com.waze.nav_connect.b.j jVar, com.waze.main_screen.c.e.i iVar2, com.waze.o.d.b.a.d dVar2) {
        this.f26277a = fVar;
        this.f26278b = dVar;
        this.f26279c = hVar;
        this.f26282f = iVar;
        this.f26280d = jVar;
        this.f26281e = iVar2;
        this.f26283g = dVar2;
    }

    public final com.waze.main_screen.b.a.f a() {
        return this.f26277a;
    }

    public final com.waze.main_screen.c.e.i b() {
        return this.f26281e;
    }

    public final com.waze.main_screen.j.a.h c() {
        return this.f26279c;
    }

    public final com.waze.main_screen.ae.a.d d() {
        return this.f26278b;
    }

    public final com.waze.nav_connect.b.j e() {
        return this.f26280d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return h.g.b.x.n(this.f26277a, uVar.f26277a) && h.g.b.x.n(this.f26278b, uVar.f26278b) && h.g.b.x.n(this.f26279c, uVar.f26279c) && h.g.b.x.n(this.f26282f, uVar.f26282f) && h.g.b.x.n(this.f26280d, uVar.f26280d) && h.g.b.x.n(this.f26281e, uVar.f26281e) && h.g.b.x.n(this.f26283g, uVar.f26283g);
    }

    public final com.waze.main_screen.c.f.i f() {
        return this.f26282f;
    }

    public final com.waze.o.d.b.a.d g() {
        return this.f26283g;
    }

    public final int hashCode() {
        com.waze.main_screen.b.a.f fVar = this.f26277a;
        int iHashCode = fVar == null ? 0 : fVar.hashCode();
        com.waze.main_screen.ae.a.d dVar = this.f26278b;
        int iHashCode2 = dVar == null ? 0 : dVar.hashCode();
        int i2 = iHashCode * 31;
        com.waze.main_screen.j.a.h hVar = this.f26279c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (hVar == null ? 0 : hVar.hashCode())) * 31;
        com.waze.main_screen.c.f.i iVar = this.f26282f;
        int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        com.waze.nav_connect.b.j jVar = this.f26280d;
        int iHashCode5 = (iHashCode4 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        com.waze.main_screen.c.e.i iVar2 = this.f26281e;
        int iHashCode6 = (iHashCode5 + (iVar2 == null ? 0 : iVar2.hashCode())) * 31;
        com.waze.o.d.b.a.d dVar2 = this.f26283g;
        return iHashCode6 + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    public final String toString() {
        return "State(audioSdkButtonStateHolder=" + this.f26277a + ", transportSdkButtonStateHolder=" + this.f26278b + ", googleAssistantButtonStateHolder=" + this.f26279c + ", soundButtonStateHolder=" + this.f26282f + ", navConnectButtonStateHolder=" + this.f26280d + ", shareDriveButtonStateHolder=" + this.f26281e + ", companinioButtonStateHolder=" + this.f26283g + ")";
    }

    public u() {
        this(null);
    }

    public /* synthetic */ u(byte[] bArr) {
        this(null, null, null, null, null, null, null);
    }
}
