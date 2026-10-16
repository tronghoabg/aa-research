package com.waze.main_screen.c;

import com.waze.sdk.bi;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.c.f.j f26130a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.main_screen.b.a.c f26131b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.main_screen.j.a.b f26132c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.google_assistant.aa f26133d;

    /* renamed from: e, reason: collision with root package name */
    private final bi f26134e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.nav_connect.a.f f26135f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.o.c.c.b f26136g;

    /* renamed from: h, reason: collision with root package name */
    private final h.f f26137h;

    /* renamed from: i, reason: collision with root package name */
    private final h.f f26138i;

    /* renamed from: j, reason: collision with root package name */
    private final h.f f26139j;

    /* renamed from: k, reason: collision with root package name */
    private final h.f f26140k;

    /* renamed from: l, reason: collision with root package name */
    private final h.f f26141l;
    private final h.f m;

    public b(com.waze.main_screen.c.f.j jVar, com.waze.main_screen.b.a.c cVar, com.waze.main_screen.j.a.b bVar, com.waze.google_assistant.aa aaVar, bi biVar, com.waze.nav_connect.a aVar, com.waze.nav_connect.a.f fVar, com.waze.o.c.c.b bVar2) {
        h.g.b.x.f(jVar, "soundSettingsConfiguration");
        h.g.b.x.f(cVar, "audioSdkButtonConfig");
        h.g.b.x.f(bVar, "googleAssistantConfig");
        h.g.b.x.f(aaVar, "googleAssistantManager");
        h.g.b.x.f(biVar, "sdkManagerV1");
        h.g.b.x.f(aVar, "navConnectConfig");
        h.g.b.x.f(fVar, "navConnectRepository");
        h.g.b.x.f(bVar2, "companinioConfig");
        this.f26130a = jVar;
        this.f26131b = cVar;
        this.f26132c = bVar;
        this.f26133d = aaVar;
        this.f26134e = biVar;
        this.f26135f = fVar;
        this.f26136g = bVar2;
        this.f26137h = h.g.a(new com.waze.ab.z(12));
        this.f26138i = h.g.a(new com.waze.ab.z(13));
        this.f26139j = h.g.a(new com.waze.ab.z(14));
        this.f26140k = h.g.a(new com.waze.ab.z(15));
        this.f26141l = h.g.a(new com.waze.ab.z(16));
        this.m = h.g.a(new com.waze.ab.z(17));
    }

    @Override // com.waze.main_screen.c.a
    public final int a() {
        return ((Number) this.f26140k.getValue()).intValue();
    }

    @Override // com.waze.main_screen.c.a
    public final d b() {
        return (d) this.m.getValue();
    }

    @Override // com.waze.main_screen.c.a
    public final j c() {
        return (j) this.f26141l.getValue();
    }

    @Override // com.waze.main_screen.c.a
    public final boolean d() {
        Object value = this.f26138i.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }

    @Override // com.waze.main_screen.c.a
    public final boolean e() {
        Object value = this.f26139j.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }

    @Override // com.waze.main_screen.c.a
    public final boolean f() {
        Object value = this.f26137h.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }

    @Override // com.waze.main_screen.c.a
    public final boolean g() {
        Boolean[] boolArr = {(Boolean) this.f26131b.a().d(), Boolean.valueOf(this.f26136g.d() || (((Boolean) this.f26132c.a().d()).booleanValue() && this.f26133d.E())), (Boolean) this.f26130a.a().d(), Boolean.valueOf(this.f26134e.p()), Boolean.valueOf(com.waze.nav_connect.a.e() && ((com.waze.map.isolated.k) this.f26135f.b().d()).c())};
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            if (boolArr[i3].booleanValue()) {
                i2++;
            }
        }
        return i2 >= a();
    }
}
