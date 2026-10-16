package com.waze.location.b;

import com.waze.shared_infra.q.m;
import com.waze.shared_infra.q.n;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class h extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    Object f25320a;

    /* renamed from: b, reason: collision with root package name */
    int f25321b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f25322c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ c f25323d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f25324e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f25325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, c cVar, CompletableDeferred completableDeferred, h.c.e eVar) {
        super(2, eVar);
        this.f25322c = iVar;
        this.f25323d = cVar;
        this.f25324e = completableDeferred;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        h hVar = new h(this.f25322c, this.f25323d, this.f25324e, eVar);
        hVar.f25325f = obj;
        return hVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        br brVar;
        br brVar2;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f25321b != 0) {
            brVar = (br) this.f25320a;
            brVar2 = (br) this.f25325f;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            af afVar = (af) this.f25325f;
            i iVar = this.f25322c;
            n nVarA = m.a(true);
            CompletableDeferred completableDeferred = this.f25324e;
            br brVarZ = aj.z(afVar, null, null, new f(iVar, nVarA, completableDeferred, null, 1, null), 3);
            br brVarZ2 = aj.z(afVar, null, null, new f(iVar, nVarA, completableDeferred, null, 0), 3);
            this.f25325f = brVarZ;
            this.f25320a = brVarZ2;
            this.f25321b = 1;
            Object objJ = aj.J(iVar.f25326a.b(), new g(completableDeferred, iVar, null), this);
            if (objJ == aVar) {
                return aVar;
            }
            brVar = brVarZ2;
            obj = objJ;
            brVar2 = brVarZ;
        }
        c cVar = (c) obj;
        aj.X(brVar2, "location lookup finished", null);
        aj.X(brVar, "location lookup finished", null);
        return cVar == null ? this.f25323d : cVar;
    }
}
