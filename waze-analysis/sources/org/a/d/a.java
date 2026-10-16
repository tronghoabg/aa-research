package org.a.d;

import com.waze.ch.a.a.f;
import com.waze.places.o;
import com.waze.shared_infra.n.c;
import e.a.dw;
import h.ab;
import h.g.a.q;
import h.g.b.x;
import h.k;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.g.n;
import org.a.d.k.b;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f56369a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f56370b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f56371c;

    public a() {
        this.f56369a = new org.a.d.j.a(this);
        this.f56370b = new c(this);
        x.f(this, "_koin");
        dw.f();
        x.f(this, "_koin");
        new HashMap();
        this.f56371c = new o(org.a.d.f.a.f56398e);
    }

    public static /* synthetic */ b g(a aVar, org.a.d.i.a aVar2) {
        x.f("MobileCoordinatorCreator", "scopeId");
        x.f(aVar2, "qualifier");
        b bVarD = ((org.a.d.j.a) aVar.f56369a).d("MobileCoordinatorCreator");
        return bVarD == null ? aVar.c("MobileCoordinatorCreator", aVar2, null) : bVarD;
    }

    public final org.a.d.j.a a() {
        return (org.a.d.j.a) this.f56369a;
    }

    public final b b(org.a.d.a.b bVar) {
        x.f(bVar, "t");
        return ((org.a.d.j.a) this.f56369a).b(org.a.b.c.a.c(bVar), org.a.b.c.a.d(bVar), null);
    }

    public final b c(String str, org.a.d.i.a aVar, Object obj) {
        x.f(str, "scopeId");
        x.f(aVar, "qualifier");
        return ((org.a.d.j.a) this.f56369a).b(str, aVar, obj);
    }

    public final b d(String str) {
        x.f(str, "scopeId");
        return ((org.a.d.j.a) this.f56369a).d(str);
    }

    public final void e() {
        o oVar = (o) this.f56371c;
        oVar.c("Create eager instances ...");
        long jNanoTime = System.nanoTime();
        ((c) this.f56370b).l();
        oVar.c("Created eager instances in " + ((Number) new k(ab.f48028a, Double.valueOf((System.nanoTime() - jNanoTime) / 1000000.0d)).d()).doubleValue() + " ms");
    }

    public final Object f(h.l.c cVar, h.g.a.a aVar) {
        x.f(cVar, "clazz");
        return ((org.a.d.j.a) this.f56369a).c().a(cVar, null, aVar);
    }

    public final Object h(h.l.c cVar) {
        x.f(cVar, "clazz");
        return ((org.a.d.j.a) this.f56369a).c().b(cVar, null, null);
    }

    public final void i(List list, boolean z) {
        x.f(list, "modules");
        Object obj = this.f56370b;
        Set setH = f.h(list);
        ((c) obj).n(setH, z);
        ((org.a.d.j.a) this.f56369a).f(setH);
    }

    public final Object k() {
        return this.f56371c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.q, java.lang.Object] */
    public final q l() {
        return this.f56370b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.q, java.lang.Object] */
    public final q m() {
        return this.f56369a;
    }

    public final o n() {
        return (o) this.f56371c;
    }

    public final c o() {
        return (c) this.f56370b;
    }

    public /* synthetic */ a(Object obj, q qVar) {
        this.f56371c = obj;
        this.f56369a = qVar;
        this.f56370b = n.f52005a;
    }
}
