package com.google.android.gms.auth.api.identity;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private l f4497a;

    /* renamed from: b, reason: collision with root package name */
    private f f4498b;

    /* renamed from: c, reason: collision with root package name */
    private j f4499c;

    /* renamed from: d, reason: collision with root package name */
    private h f4500d;

    /* renamed from: e, reason: collision with root package name */
    private String f4501e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4502f;

    /* renamed from: g, reason: collision with root package name */
    private int f4503g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4504h;

    public e() {
        k kVar = new k();
        kVar.b(false);
        this.f4497a = kVar.a();
        this.f4498b = new f(false, null, null, true, null, null, false, null, null);
        i iVar = new i();
        iVar.d(false);
        this.f4499c = iVar.a();
        g gVar = new g();
        gVar.c(false);
        this.f4500d = gVar.a();
    }

    public final m a() {
        return new m(this.f4497a, this.f4498b, this.f4501e, this.f4502f, this.f4503g, this.f4499c, this.f4500d, this.f4504h);
    }

    public final void b(boolean z) {
        this.f4502f = z;
    }

    public final void c(f fVar) {
        this.f4498b = fVar;
    }

    public final void d(h hVar) {
        this.f4500d = hVar;
    }

    @Deprecated
    public final void e(j jVar) {
        this.f4499c = jVar;
    }

    public final void f(l lVar) {
        this.f4497a = lVar;
    }

    public final void g(boolean z) {
        this.f4504h = z;
    }

    public final void h(String str) {
        this.f4501e = str;
    }

    public final void i(int i2) {
        this.f4503g = i2;
    }
}
