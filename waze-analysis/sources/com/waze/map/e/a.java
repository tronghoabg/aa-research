package com.waze.map.e;

import com.waze.main_screen.ac.k;
import com.waze.map.b.ed;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f28786a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f28787b;

    public a() {
        this.f28786a = h.g.a(new k(7));
        this.f28787b = h.g.a(new k(8));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.f, java.lang.Object] */
    public final long a() {
        Object value = this.f28787b.getValue();
        x.e(value, "getValue(...)");
        return ((Number) value).longValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.f, java.lang.Object] */
    public final long b() {
        return ((h.o.a) this.f28786a.getValue()).w();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.map.b.ed, java.lang.Object] */
    public final ed c() {
        return this.f28786a;
    }

    public final com.waze.shared_infra.n.c d() {
        return (com.waze.shared_infra.n.c) this.f28787b;
    }

    public a(ed edVar, com.waze.shared_infra.n.c cVar) {
        x.f(edVar, "mapController");
        x.f(cVar, "controlObject");
        this.f28786a = edVar;
        this.f28787b = cVar;
    }
}
