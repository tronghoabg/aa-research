package com.waze.car_lib.r;

import com.waze.car_lib.f.il;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fk {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21642a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.config.c f21643b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.system.e f21644c;

    public fk(com.waze.shared_infra.o.a aVar, com.waze.config.c cVar, com.waze.system.e eVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(cVar, "loginTimeoutSecConfig");
        h.g.b.x.f(eVar, "systemSettingsInterface");
        this.f21642a = aVar;
        this.f21643b = cVar;
        this.f21644c = eVar;
    }

    public final ay a(il ilVar) {
        h.g.b.x.f(ilVar, "coordinatorController");
        return new ay(ilVar, this.f21642a, this.f21643b, this.f21644c);
    }
}
