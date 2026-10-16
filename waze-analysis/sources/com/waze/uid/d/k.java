package com.waze.uid.d;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.b.a f44454a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.l.d f44455b;

    public k(com.waze.shared_infra.b.a aVar) {
        x.f(aVar, "storage");
        this.f44454a = aVar;
        this.f44455b = new com.google.l.e().a();
    }

    @Override // com.waze.uid.d.j
    public final com.waze.uid.e.d a(Class cls) {
        x.f(cls, "paramsClass");
        com.waze.shared_infra.i.h.i("UidEventsController", "loading parameters");
        byte[] bArrC = this.f44454a.c();
        if (bArrC == null) {
            return null;
        }
        try {
            return (com.waze.uid.e.d) this.f44455b.f(new String(bArrC, h.n.a.f48221b), cls);
        } catch (Exception e2) {
            com.waze.shared_infra.i.h.l("UidEventsController", "failed to load parameters", e2);
            return null;
        }
    }

    @Override // com.waze.uid.d.j
    public final void b() {
        com.waze.shared_infra.i.h.i("UidEventsController", "erasing stored parameters");
        this.f44454a.a();
    }

    @Override // com.waze.uid.d.j
    public final void c(com.waze.uid.e.d dVar) {
        x.f(dVar, "model");
        com.waze.shared_infra.i.h.i("UidEventsController", "storing parameters");
        try {
            String strH = this.f44455b.h(dVar);
            com.waze.shared_infra.b.a aVar = this.f44454a;
            byte[] bytes = strH.getBytes(h.n.a.f48221b);
            x.e(bytes, "getBytes(...)");
            aVar.b(bytes);
        } catch (Exception e2) {
            com.waze.shared_infra.i.h.l("UidEventsController", "failed to store parameters", e2);
        }
    }
}
