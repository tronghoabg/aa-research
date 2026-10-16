package com.waze.main_screen.v;

import java.util.List;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class x extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27832a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f27833b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f27834c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(z zVar, h.c.e eVar) {
        super(2, eVar);
        this.f27833b = zVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        x xVar = new x(this.f27833b, eVar);
        xVar.f27834c = obj;
        return xVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((x) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        final kotlinx.coroutines.af afVar;
        Object objD;
        h.g.a.l lVar;
        String strF;
        String strD;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f27832a != 0) {
            afVar = (kotlinx.coroutines.af) this.f27834c;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar2 = (kotlinx.coroutines.af) this.f27834c;
            z zVar = this.f27833b;
            if (!z.m(zVar)) {
                return h.ab.f48028a;
            }
            this.f27834c = afVar2;
            this.f27832a = 1;
            Object objA = zVar.f27838a.a(this);
            if (objA == aVar) {
                return aVar;
            }
            afVar = afVar2;
            obj = objA;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            z zVar2 = this.f27833b;
            zVar2.f27844g.g("empty promotionalChips");
            zVar2.n();
            return h.ab.f48028a;
        }
        Object objP = h.a.i.P(list);
        final z zVar3 = this.f27833b;
        final i iVar = (i) objP;
        if (z.m(zVar3)) {
            bn bnVar = zVar3.f27847j;
            do {
                objD = bnVar.d();
                lVar = new h.g.a.l() { // from class: com.waze.main_screen.v.t
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        z zVar4 = zVar3;
                        i iVar2 = iVar;
                        aj.z(afVar, null, null, new u(zVar4, iVar2, null), 3);
                        z.l(zVar4, (com.waze.ui.q.c) obj2, iVar2);
                        return h.ab.f48028a;
                    }
                };
                strF = iVar.f();
                strD = iVar.d();
            } while (!bnVar.f(objD, new n(lVar, strF, strD != null ? new com.waze.ui.ac.g(strD) : null, iVar.b(), iVar.c(), iVar.e())));
            zVar3.f27845h.b(iVar.c(), iVar.f(), iVar.d());
        }
        aj.z(afVar, null, null, new w(zVar3, (h.c.e) null, 1, (byte[]) null), 3);
        aj.z(afVar, null, null, new w(zVar3, null, 0), 3);
        aj.z(afVar, null, null, new w(zVar3, (h.c.e) null, 2, (char[]) null), 3);
        return h.ab.f48028a;
    }
}
