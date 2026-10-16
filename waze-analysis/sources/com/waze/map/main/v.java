package com.waze.map.main;

import com.waze.map.cd;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final Object f29472a;

    v(org.a.d.k.b bVar) {
        int i2 = h.g.b.ar.f48106a;
        this.f29472a = (com.waze.location.o) bVar.a(new h.g.b.m(com.waze.location.o.class), null, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.location.o, java.lang.Object] */
    public final kotlinx.coroutines.b.k a() {
        return new u(this.f29472a.speedometerData(), 0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.location.o, java.lang.Object] */
    public final boolean b() {
        return this.f29472a.isGpsEnabled();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.map.cd, java.lang.Object] */
    public final cd c() {
        return this.f29472a;
    }

    public v(cd cdVar) {
        h.g.b.x.f(cdVar, "viewportResolver");
        this.f29472a = cdVar;
    }
}
