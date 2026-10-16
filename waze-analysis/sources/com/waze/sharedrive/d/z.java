package com.waze.sharedrive.d;

import com.waze.navigate.ek;
import com.waze.navigate.el;
import com.waze.navigate.em;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class z extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38289a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aq f38290b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(aq aqVar, h.c.e eVar) {
        super(2, eVar);
        this.f38290b = aqVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        z zVar = new z(this.f38290b, eVar);
        zVar.f38289a = obj;
        return zVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((z) create((em) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        r rVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        em emVar = (em) this.f38289a;
        boolean z = emVar instanceof el;
        boolean z2 = false;
        if (z && ((el) emVar).a() == ek.f31315b) {
            z2 = true;
        }
        if (z) {
            aq aqVar = this.f38290b;
            bn bnVar = aqVar.f38221i;
            do {
                objD = bnVar.d();
                rVar = (r) objD;
                if (rVar instanceof g) {
                    aqVar.f38219g.a("Navigation ended while in Creating state, clearing state");
                    rVar = null;
                }
            } while (!bnVar.f(objD, rVar));
        }
        if (!z2) {
            return h.ab.f48028a;
        }
        aq aqVar2 = this.f38290b;
        aqVar2.R(aqVar2.f38224l, new y(aqVar2, null));
        return h.ab.f48028a;
    }
}
