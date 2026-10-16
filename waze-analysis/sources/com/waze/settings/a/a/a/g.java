package com.waze.settings.a.a.a;

import com.waze.mywaze.ag;
import h.ab;
import h.g.a.p;
import h.m;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f36709a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f36710b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.copilot.data.c f36711c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, com.waze.copilot.data.c cVar, h.c.e eVar) {
        super(2, eVar);
        this.f36710b = hVar;
        this.f36711c = cVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new g(this.f36710b, this.f36711c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((g) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objD;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f36709a != 0) {
            e.b.c.b(obj);
            objA = ((m) obj).b();
        } else {
            e.b.c.b(obj);
            h hVar = this.f36710b;
            com.waze.copilot.data.c cVar = this.f36711c;
            this.f36709a = 1;
            objA = hVar.f36713b.a(cVar, ag.f30571e, this);
            if (objA == aVar) {
                return aVar;
            }
        }
        h hVar2 = this.f36710b;
        if (m.e(objA)) {
            bn bnVar = hVar2.f36719h;
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, e.f((e) objD, null, null, null, true, false, 7)));
        }
        if (m.c(objA) != null) {
            hVar2.o(c.f36700a);
        }
        return ab.f48028a;
    }
}
