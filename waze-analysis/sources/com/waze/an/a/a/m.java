package com.waze.an.a.a;

import com.waze.navigate.ej;
import com.waze.navigate.el;
import com.waze.navigate.em;
import com.waze.navigate.et;
import java.util.List;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class m extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14490a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f14491b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f14492c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f14493d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ p f14494e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(h.g.b.aq aqVar, p pVar, h.c.e eVar) {
        super(4, eVar);
        this.f14493d = aqVar;
        this.f14494e = pVar;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        m mVar = new m(this.f14493d, this.f14494e, (h.c.e) obj4);
        mVar.f14490a = (List) obj;
        mVar.f14491b = zBooleanValue;
        mVar.f14492c = (em) obj3;
        return mVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        List listD;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        List list = (List) this.f14490a;
        boolean z = this.f14491b;
        em emVar = (em) this.f14492c;
        boolean z2 = emVar instanceof ej;
        boolean z3 = (emVar instanceof el) && !et.p((el) emVar);
        h.g.b.aq aqVar = this.f14493d;
        Object obj2 = aqVar.f48105a;
        boolean z4 = obj2 instanceof ej;
        em emVar2 = (em) obj2;
        boolean z5 = (emVar2 instanceof el) && !et.p((el) emVar2);
        boolean z6 = z4 && z3;
        boolean z7 = z5 && z2;
        aqVar.f48105a = emVar;
        p pVar = this.f14494e;
        pVar.f14499b.e("hasFteBeenShown: " + z + ", startedNewNavigation: " + z7 + ", lastNavigationStateProviderState: " + aqVar.f48105a);
        if (z || !z7) {
            if (!z6) {
                return list;
            }
            pVar.f14500c.e(h.a.i.h());
            return list;
        }
        bn bnVar = pVar.f14500c;
        do {
            objD = bnVar.d();
            listD = h.a.i.d(pVar.h());
        } while (!bnVar.f(objD, listD));
        return listD;
    }
}
