package com.waze.coroutines;

import com.waze.map.bc;
import h.g.b.x;
import kotlinx.coroutines.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Object f23170a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f23171b;

    public b(String str, h.g.a.l lVar) {
        x.f(str, "tagForClicks");
        x.f(lVar, "onClick");
        this.f23171b = str;
        this.f23170a = lVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    public final g a(c cVar) {
        x.f(cVar, "parameters");
        return new g(cVar, (ab) this.f23170a, this.f23171b);
    }

    public final bc b() {
        return (bc) this.f23170a;
    }

    public final String c() {
        return (String) this.f23171b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.l, java.lang.Object] */
    public final h.g.a.l d() {
        return this.f23170a;
    }

    public final b e() {
        return (b) this.f23171b;
    }

    public b(bc bcVar, b bVar) {
        x.f(bcVar, "markerView");
        this.f23170a = bcVar;
        this.f23171b = bVar;
    }

    public b(ab abVar, com.waze.shared_infra.i.e eVar) {
        x.f(abVar, "detectorDispatcher");
        x.f(eVar, "logger");
        this.f23170a = abVar;
        this.f23171b = eVar;
    }
}
