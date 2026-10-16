package com.waze.uid;

import com.waze.ni;
import com.waze.sharedui.profile.AgeRestrictionMode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final ni f44543a = new ni(4);

    /* renamed from: b, reason: collision with root package name */
    private static final h.f f44544b = h.g.a(new com.waze.ui.o.ac(16));

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.r.a f44545c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.bf.a f44546d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.b.u f44547e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f44548f;

    /* renamed from: g, reason: collision with root package name */
    private final h.f f44549g;

    /* renamed from: h, reason: collision with root package name */
    private final h.f f44550h;

    public o(com.waze.r.a aVar, com.waze.bf.a aVar2, com.waze.b.u uVar) {
        h.g.b.x.f(aVar, "nd4cConsentManager");
        h.g.b.x.f(aVar2, "privacyConsentManager");
        h.g.b.x.f(uVar, "ageRestrictionRepository");
        this.f44545c = aVar;
        this.f44546d = aVar2;
        this.f44547e = uVar;
        this.f44548f = h.g.a(new a(this, 2));
        this.f44549g = h.g.a(new a(this, 3));
        this.f44550h = h.g.a(new a(this, 4));
    }

    static final boolean b(o oVar) {
        com.waze.b.e eVarA = ((com.waze.b.s) oVar.f44547e.a().d()).a();
        h.g.b.x.f(eVarA, "<this>");
        return eVarA instanceof com.waze.b.d;
    }

    static final boolean c(o oVar) {
        return oVar.f44546d.j();
    }

    static final boolean g(o oVar) {
        return oVar.f44545c.i();
    }

    public final boolean d() {
        return ((Boolean) this.f44549g.getValue()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) this.f44548f.getValue()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) this.f44550h.getValue()).booleanValue();
    }

    public final boolean h() {
        com.waze.b.z zVarB = ((com.waze.b.s) this.f44547e.a().d()).b();
        h.g.b.x.f(zVarB, "<this>");
        return zVarB.a() != AgeRestrictionMode.UNRESTRICTED;
    }

    public final boolean i() {
        return com.waze.ads.c.e.c(((com.waze.b.s) this.f44547e.a().d()).b());
    }
}
