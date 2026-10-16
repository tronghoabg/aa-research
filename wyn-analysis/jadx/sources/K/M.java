package K;

import N.L0;
import e0.C2465q;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final L0 f6215a = new L0(C0681f.f6258r);

    public static final z0.p a(z0.p pVar, E0.o oVar) {
        z0.j jVar = pVar.f48337a;
        if (jVar.f48305f != null) {
            return pVar;
        }
        long jA = jVar.f48300a.a();
        z0.j jVar2 = pVar.f48337a;
        long j8 = jVar2.f48301b;
        z0.h hVar = pVar.f48338b;
        K0.c cVar = hVar.f48294a;
        K0.g bVar = jVar2.f48300a;
        if (!C2465q.b(jA, bVar.a())) {
            bVar = jA != C2465q.f34380i ? new K0.b(jA) : K0.f.f6318a;
        }
        return new z0.p(new z0.j(bVar, j8, jVar2.f48302c, jVar2.f48303d, jVar2.f48304e, oVar, jVar2.f48306g, jVar2.f48307h, jVar2.f48308i, jVar2.f48309j, jVar2.k, jVar2.f48310l, jVar2.f48311m, jVar2.f48312n), new z0.h(cVar, hVar.f48295b, hVar.f48296c, hVar.f48297d, null), 0);
    }
}
