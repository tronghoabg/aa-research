package com.waze.uid.state_impl.add_id;

import com.waze.uid.c.bb;
import com.waze.uid.c.bm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class m implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f44589a;

    m(o oVar) {
        this.f44589a = oVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        o oVar = this.f44589a;
        com.waze.uid.d.g gVar = (com.waze.uid.d.g) obj;
        oVar.f44485c.k(oVar.f44485c.a().e(new bb(bm.o, null, new k(gVar.a(), gVar.b()), false)));
        return h.ab.f48028a;
    }
}
