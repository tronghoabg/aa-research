package com.waze.bw.a.b;

import h.ab;
import h.g.b.x;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class u extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f17612a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f17613b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v f17614c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(v vVar, h.c.e eVar) {
        super(2, eVar);
        this.f17614c = vVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        u uVar = new u(this.f17614c, eVar);
        uVar.f17613b = obj;
        return uVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((u) create((com.waze.resume_drive.a) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Object objD2;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f17612a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            boolean zN = x.n((com.waze.resume_drive.a) this.f17613b, com.waze.bn.e.f17151a);
            v vVar = this.f17614c;
            if (!zN) {
                bn bnVar = vVar.f17624j;
                do {
                    objD = bnVar.d();
                } while (!bnVar.f(objD, com.waze.bw.a.c.r.j((com.waze.bw.a.c.r) objD, false, false, false, null, null, false, false, 3967)));
                return ab.f48028a;
            }
            this.f17612a = 1;
            if (aj.r(vVar.f17616b.d(), this) == aVar) {
                return aVar;
            }
        }
        bn bnVar2 = this.f17614c.f17624j;
        do {
            objD2 = bnVar2.d();
        } while (!bnVar2.f(objD2, com.waze.bw.a.c.r.j((com.waze.bw.a.c.r) objD2, false, false, false, null, null, true, false, 3967)));
        return ab.f48028a;
    }
}
