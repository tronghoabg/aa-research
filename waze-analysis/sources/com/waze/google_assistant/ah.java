package com.waze.google_assistant;

import com.waze.map.b.fi;
import com.waze.map.cn;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    private final Object f24091a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f24092b;

    public ah(cn cnVar, CompletableDeferred completableDeferred) {
        h.g.b.x.f(cnVar, "input");
        h.g.b.x.f(completableDeferred, "completeHandler");
        this.f24092b = cnVar;
        this.f24091a = completableDeferred;
    }

    public final void a(e eVar) {
        c(eVar, true);
    }

    public final void b(e eVar, d dVar) {
        e(eVar, dVar, true);
    }

    public final void c(e eVar, boolean z) {
        e(eVar, null, z);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.google_assistant.a.b, java.lang.Object] */
    public final void d(g gVar, f fVar, boolean z) {
        this.f24092b.d(gVar, z, fVar, ((aa) this.f24091a).f());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.google_assistant.a.b, java.lang.Object] */
    public final void e(e eVar, d dVar, boolean z) {
        this.f24092b.e(eVar, z, dVar, ((aa) this.f24091a).f());
    }

    public final cn f() {
        return (cn) this.f24092b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    public final CompletableDeferred g() {
        return this.f24091a;
    }

    public final fi h() {
        return (fi) this.f24091a;
    }

    public final com.waze.coroutines.b i() {
        return (com.waze.coroutines.b) this.f24092b;
    }

    public ah(fi fiVar, com.waze.coroutines.b bVar) {
        h.g.b.x.f(fiVar, "polylineData");
        this.f24091a = fiVar;
        this.f24092b = bVar;
    }

    public ah(aa aaVar, com.waze.google_assistant.a.b bVar) {
        this.f24091a = aaVar;
        this.f24092b = bVar;
    }
}
