package com.waze.an.b;

import h.g.b.ar;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.k.a f14627a;

    /* renamed from: b, reason: collision with root package name */
    private final org.a.d.k.b f14628b;

    public e(com.waze.main_screen.k.a aVar, org.a.d.k.b bVar) {
        x.f(aVar, "insightConfig");
        x.f(bVar, "koinScope");
        this.f14627a = aVar;
        this.f14628b = bVar;
    }

    public final g a() {
        boolean zC = this.f14627a.c();
        org.a.d.k.b bVar = this.f14628b;
        if (zC) {
            int i2 = ar.f48106a;
            return (g) bVar.a(new h.g.b.m(o.class), null, null);
        }
        int i3 = ar.f48106a;
        return (g) bVar.a(new h.g.b.m(d.class), null, null);
    }
}
