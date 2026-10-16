package com.waze.shared_infra.a;

import h.ab;
import h.g.a.p;
import java.util.Iterator;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f37765a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f37766b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(f fVar, h.c.e eVar) {
        super(2, eVar);
        this.f37766b = fVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        d dVar = new d(this.f37766b, eVar);
        dVar.f37765a = ((Boolean) obj).booleanValue();
        return dVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((d) create(bool, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        if (this.f37765a) {
            h.c.j jVarPlus = getContext().plus(aj.Q());
            f fVar = this.f37766b;
            af afVarE = aj.e(jVarPlus.plus(new ae(fVar.c())).plus(new i(CoroutineExceptionHandler.f51269c, fVar, 1)));
            fVar.f37771d.e("starting group " + fVar.c() + " daemons");
            Iterator it = fVar.f37769b.iterator();
            while (it.hasNext()) {
                aj.z(afVarE, null, null, new j((c) it.next(), null, 1, null), 3);
            }
            fVar.f(afVarE);
        } else {
            f fVar2 = this.f37766b;
            fVar2.f37771d.e("stopping group " + fVar2.c() + " daemons");
            af afVarE2 = fVar2.e();
            if (afVarE2 != null) {
                aj.h(afVarE2, null);
            }
        }
        return ab.f48028a;
    }
}
