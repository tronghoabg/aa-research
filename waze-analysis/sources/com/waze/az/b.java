package com.waze.az;

import com.waze.coroutines.c;
import com.waze.native_managers.n;
import com.waze.push.h;
import com.waze.shared_infra.i.e;
import h.ab;
import h.g;
import h.g.a.l;
import h.g.b.x;
import java.util.ArrayList;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Object f16130a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f16131b;

    public b() {
        this.f16131b = g.a(new n(18));
        this.f16130a = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.shared_infra.i.b, java.lang.Object] */
    static final ab a(l lVar, b bVar, Throwable th) {
        x.f(th, "exception");
        lVar.invoke(th);
        bVar.f16131b.a(th, null);
        return ab.f48028a;
    }

    public final br b(c cVar, final l lVar) {
        x.f(cVar, "parameters");
        x.f(lVar, "beforeReportingNonFatalError");
        return ((com.waze.coroutines.b) this.f16130a).a(cVar).b(new l() { // from class: com.waze.az.a
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return b.a(lVar, this, (Throwable) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    public final void c(h hVar) {
        x.f(hVar, "pushMessageHandler");
        ?? r1 = this.f16130a;
        if (r1.contains(hVar)) {
            return;
        }
        r1.add(hVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v0, types: [h.f, java.lang.Object] */
    public final boolean d(Object obj) {
        for (h hVar : this.f16130a) {
            ((e) this.f16131b.getValue()).a("Checking ".concat(hVar.a()));
            if (hVar.b(obj) && hVar.c(obj)) {
                com.waze.shared_infra.i.h.a("Push handled by " + hVar.a() + ", stopping handlers");
                return true;
            }
        }
        return false;
    }

    public b(com.waze.coroutines.b bVar, com.waze.shared_infra.i.b bVar2) {
        x.f(bVar, "threadResponsivenessDetectorFactory");
        x.f(bVar2, "exceptionReporter");
        this.f16130a = bVar;
        this.f16131b = bVar2;
    }
}
