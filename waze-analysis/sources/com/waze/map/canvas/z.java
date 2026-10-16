package com.waze.map.canvas;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class z extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28671a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f28672b;

    z(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        z zVar = new z((h.c.e) obj3);
        zVar.f28671a = (String) obj;
        zVar.f28672b = (Map) obj2;
        return zVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return ((Map) this.f28672b).get((String) this.f28671a);
    }
}
