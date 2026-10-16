package com.waze.car_lib;

import android.content.Context;
import com.waze.mo;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ax implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f18914a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.af f18915b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f18916c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bd f18917d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.i.a.a f18918e;

    ax(h.g.b.aq aqVar, kotlinx.coroutines.af afVar, Context context, com.waze.car_lib.i.a.a aVar, bd bdVar) {
        this.f18914a = aqVar;
        this.f18915b = afVar;
        this.f18916c = context;
        this.f18918e = aVar;
        this.f18917d = bdVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        h.g.b.aq aqVar = this.f18914a;
        ((kotlinx.coroutines.br) aqVar.f48105a).s(null);
        kotlinx.coroutines.af afVar = this.f18915b;
        aqVar.f48105a = h.g.b.o.c(h.g.b.o.d(afVar.getCoroutineContext()));
        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(afVar.getCoroutineContext().plus((h.c.j) aqVar.f48105a));
        ((com.waze.car_lib.c.f) obj).d().c(this.f18916c, afVarE, this.f18918e);
        List list = this.f18917d.r;
        mo moVar = new mo(17);
        List listAo = h.a.i.ao(list);
        list.clear();
        Iterator it = listAo.iterator();
        while (it.hasNext()) {
            moVar.invoke(it.next());
        }
        return h.ab.f48028a;
    }
}
