package kotlinx.b.d.a;

import okhttp3.al;
import okhttp3.ap;
import okhttp3.aq;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai {
    public static final kotlinx.b.a.q a(kotlinx.b.a.q qVar, kotlinx.b.e.e eVar) {
        kotlinx.b.a.q qVarA;
        kotlinx.b.b bVarB;
        h.g.b.x.f(qVar, "<this>");
        h.g.b.x.f(eVar, "module");
        if (!h.g.b.x.n(qVar.h(), kotlinx.b.a.v.f50938a)) {
            return qVar.j() ? a(qVar.g(0), eVar) : qVar;
        }
        h.g.b.x.f(eVar, "<this>");
        h.g.b.x.f(qVar, "descriptor");
        h.l.c cVarA = kotlinx.b.a.b.a(qVar);
        kotlinx.b.a.q descriptor = null;
        if (cVarA != null && (bVarB = eVar.b(cVarA, h.a.i.h())) != null) {
            descriptor = bVarB.getDescriptor();
        }
        return (descriptor == null || (qVarA = a(descriptor, eVar)) == null) ? qVar : qVarA;
    }

    public static final ah b(kotlinx.b.d.b bVar, kotlinx.b.a.q qVar) {
        h.g.b.x.f(bVar, "<this>");
        h.g.b.x.f(qVar, "desc");
        kotlinx.b.a.x xVarH = qVar.h();
        if (xVarH instanceof kotlinx.b.a.f) {
            return ah.f51146d;
        }
        if (h.g.b.x.n(xVarH, kotlinx.b.a.z.f50941a)) {
            return ah.f51144b;
        }
        if (!h.g.b.x.n(xVarH, kotlinx.b.a.aa.f50902a)) {
            return ah.f51143a;
        }
        kotlinx.b.a.q qVarA = a(qVar.g(0), bVar.b());
        kotlinx.b.a.x xVarH2 = qVarA.h();
        if ((xVarH2 instanceof kotlinx.b.a.p) || h.g.b.x.n(xVarH2, kotlinx.b.a.w.f50939a)) {
            return ah.f51145c;
        }
        bVar.a();
        throw kotlinx.coroutines.d.d.h(qVarA);
    }

    public static final Object c(kotlinx.b.d.b bVar, kotlinx.b.d.k kVar, kotlinx.b.a aVar) {
        t tVar;
        h.g.b.x.f(bVar, "json");
        h.g.b.x.f(kVar, "element");
        h.g.b.x.f(aVar, "deserializer");
        String str = null;
        if (kVar instanceof kotlinx.b.d.v) {
            tVar = new w(bVar, (kotlinx.b.d.v) kVar, str, 12);
        } else if (kVar instanceof kotlinx.b.d.c) {
            tVar = new x(bVar, (kotlinx.b.d.c) kVar);
        } else {
            if (!(kVar instanceof kotlinx.b.d.q) && !h.g.b.x.n(kVar, kotlinx.b.d.t.f51222a)) {
                throw new h.i();
            }
            tVar = new t(bVar, (kotlinx.b.d.y) kVar, null);
        }
        return tVar.decodeSerializableValue(aVar);
    }

    public static final Object d(kotlinx.b.d.b bVar, String str, kotlinx.b.d.v vVar, kotlinx.b.a aVar) {
        h.g.b.x.f(bVar, "<this>");
        h.g.b.x.f(str, "discriminator");
        h.g.b.x.f(vVar, "element");
        h.g.b.x.f(aVar, "deserializer");
        return new w(bVar, vVar, str, aVar.getDescriptor()).decodeSerializableValue(aVar);
    }

    public static final al e(al alVar) {
        return alVar;
    }

    public static final /* synthetic */ aq f(aq aqVar) {
        return (aqVar != null ? aqVar.m() : null) != null ? new ap(aqVar).b(null).n() : aqVar;
    }
}
