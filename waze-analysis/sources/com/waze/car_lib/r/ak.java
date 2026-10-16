package com.waze.car_lib.r;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ak {

    /* renamed from: a, reason: collision with root package name */
    private final Object f20950a;

    public ak(com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        this.f20950a = new com.waze.car_lib.p.dg(aVar.c(R.string.AAOS_LEGAL_NOTICES_SCREEN_TITLE, new Object[0]), aVar.c(R.string.AAOS_LEGAL_NOTICES_SCREEN_TEXT, new Object[0]), Integer.valueOf(R.drawable.launch_icon_64px), false, new com.waze.car_lib.p.dc(aVar.c(R.string.AAOS_LEGAL_NOTICES_SCREEN_TERMS_OF_SERVICE_BUTTON, new Object[0]), false), new com.waze.car_lib.p.dc(aVar.c(R.string.AAOS_LEGAL_NOTICES_SCREEN_PRIVACY_POLICY_BUTTON, new Object[0]), false), 8);
    }

    public final com.waze.car_lib.p.dg a() {
        return (com.waze.car_lib.p.dg) this.f20950a;
    }

    public final /* synthetic */ com.waze.n.f b() {
        com.google.v.du duVarBuild = ((com.google.v.dm) this.f20950a).build();
        h.g.b.x.e(duVarBuild, "build(...)");
        return (com.waze.n.f) duVarBuild;
    }

    public final void c(String str) {
        h.g.b.x.f(str, "value");
        ((com.waze.n.e) this.f20950a).a(str);
    }

    public final void d(String str) {
        h.g.b.x.f(str, "value");
        ((com.waze.n.e) this.f20950a).b(str);
    }

    public final void e(boolean z) {
        ((com.waze.n.e) this.f20950a).c(z);
    }

    public /* synthetic */ ak(com.waze.n.e eVar) {
        this.f20950a = eVar;
    }
}
