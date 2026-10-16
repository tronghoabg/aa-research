package com.waze.search.h;

import com.waze.config.cv;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l.a.bjz;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f35902a;

    /* renamed from: b, reason: collision with root package name */
    boolean f35903b;

    /* renamed from: c, reason: collision with root package name */
    int f35904c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.z.a.d.an f35905d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ o f35906e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.j.a.c f35907f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f35908g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(com.waze.z.a.d.an anVar, o oVar, com.waze.j.a.c cVar, h.c.e eVar) {
        super(2, eVar);
        this.f35905d = anVar;
        this.f35906e = oVar;
        this.f35907f = cVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        d dVar = new d(this.f35905d, this.f35906e, this.f35907f, eVar);
        dVar.f35908g = obj;
        return dVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        com.waze.z.a.d.ak akVar;
        kotlinx.coroutines.br brVarZ;
        Object objC;
        boolean z;
        kotlinx.coroutines.b.bn bnVar;
        com.waze.j.a.c cVar;
        Object objD;
        h.c.a.a aVar = h.c.a.a.f48038a;
        boolean z2 = true;
        if (this.f35904c == 0) {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f35908g;
            com.waze.z.a.d.an anVar = this.f35905d;
            akVar = anVar instanceof com.waze.z.a.d.ak ? (com.waze.z.a.d.ak) anVar : null;
            if (akVar != null) {
                o oVar = this.f35906e;
                boolean z3 = oVar.f35952h;
                oVar.f35951g.a("AutoComplete - start loading results, firstSearch=" + z3);
                kotlinx.coroutines.am amVarY = kotlinx.coroutines.aj.y(afVar, null, null, new c(oVar, akVar, z3, null), 3);
                amVarY.bY(new cv(oVar, 2));
                oVar.f35951g.a("AutoComplete - countdown for loading...");
                brVarZ = kotlinx.coroutines.aj.z(afVar, null, null, new n(oVar, null, 1, null), 3);
                brVarZ.bY(new cv(oVar, 3));
                this.f35908g = akVar;
                this.f35902a = brVarZ;
                this.f35903b = z3;
                this.f35904c = 1;
                objC = amVarY.c(this);
                if (objC == aVar) {
                    return aVar;
                }
                z = z3;
            }
            return h.ab.f48028a;
        }
        z = this.f35903b;
        brVarZ = (kotlinx.coroutines.br) this.f35902a;
        akVar = (com.waze.z.a.d.ak) this.f35908g;
        e.b.c.b(obj);
        objC = obj;
        com.waze.z.a.b.n nVar = (com.waze.z.a.b.n) objC;
        if (nVar instanceof com.waze.w.a) {
            brVarZ.s(null);
            o oVar2 = this.f35906e;
            com.waze.search.stats.s sVar = oVar2.f35947c;
            long length = akVar.b().length();
            com.waze.w.a aVar2 = (com.waze.w.a) nVar;
            int iA = aVar2.a();
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(oVar2.f35946b.a());
            if (akVar.a() != com.waze.z.a.d.aj.f45921b && akVar.a() != com.waze.z.a.d.aj.f45922c) {
                z2 = false;
            }
            sVar.e(length, 0, iA, boolValueOf, boolValueOf2, Boolean.valueOf(z2), false, bjz.MOBILE_ANDROID);
            oVar2.f35951g.g("AutoComplete - failed to load autoComplete results :" + aVar2.a());
        } else {
            if (!(nVar instanceof com.waze.w.b)) {
                throw new h.i();
            }
            brVarZ.s(null);
            o oVar3 = this.f35906e;
            com.waze.search.stats.s sVar2 = oVar3.f35947c;
            long length2 = akVar.b().length();
            com.waze.w.b bVar = (com.waze.w.b) nVar;
            int size = bVar.a().size();
            Boolean boolValueOf3 = Boolean.valueOf(z);
            Boolean boolValueOf4 = Boolean.valueOf(oVar3.f35946b.a());
            Boolean boolValueOf5 = Boolean.valueOf(akVar.a() == com.waze.z.a.d.aj.f45921b || akVar.a() == com.waze.z.a.d.aj.f45922c);
            List listA = bVar.a();
            if ((listA instanceof Collection) && listA.isEmpty()) {
                z2 = false;
                sVar2.e(length2, size, 0, boolValueOf3, boolValueOf4, boolValueOf5, Boolean.valueOf(z2), bjz.MOBILE_ANDROID);
                oVar3.f35951g.a("AutoComplete - finished successfully loading results size:" + bVar.a().size());
                bnVar = oVar3.f35953i;
                cVar = this.f35907f;
                do {
                    objD = bnVar.d();
                } while (!bnVar.f(objD, new com.waze.search.e.ac(null, cVar.a(akVar.b(), bVar.a()))));
            } else {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (((com.waze.w.i) it.next()) instanceof com.waze.w.e) {
                        break;
                    }
                }
                z2 = false;
                sVar2.e(length2, size, 0, boolValueOf3, boolValueOf4, boolValueOf5, Boolean.valueOf(z2), bjz.MOBILE_ANDROID);
                oVar3.f35951g.a("AutoComplete - finished successfully loading results size:" + bVar.a().size());
                bnVar = oVar3.f35953i;
                cVar = this.f35907f;
                do {
                    objD = bnVar.d();
                } while (!bnVar.f(objD, new com.waze.search.e.ac(null, cVar.a(akVar.b(), bVar.a()))));
            }
        }
        return h.ab.f48028a;
    }
}
