package com.waze.search.h;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bo extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35840a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bx f35841b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f35842c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bo(bx bxVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f35842c = i2;
        this.f35841b = bxVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f35842c != 0) {
            bo boVar = new bo(this.f35841b, eVar, 1, null);
            boVar.f35840a = obj;
            return boVar;
        }
        bo boVar2 = new bo(this.f35841b, eVar, 0);
        boVar2.f35840a = obj;
        return boVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f35842c != 0 ? ((bo) create((com.waze.z.a.d.ap) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bo) create((List) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Object objD2;
        ce ceVarL;
        if (this.f35842c == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            List list = (List) this.f35840a;
            bx bxVar = this.f35841b;
            if (!(((ce) bxVar.s.d()).k() instanceof com.waze.search.e.ac)) {
                kotlinx.coroutines.b.bn bnVar = bxVar.s;
                do {
                    objD = bnVar.d();
                } while (!bnVar.f(objD, ce.l((ce) objD, null, new com.waze.search.e.ae(list), null, null, false, false, false, null, null, false, 4093)));
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.z.a.d.ap apVar = (com.waze.z.a.d.ap) this.f35840a;
        kotlinx.coroutines.b.bn bnVar2 = this.f35841b.s;
        do {
            objD2 = bnVar2.d();
            ceVarL = (ce) objD2;
            com.waze.z.a.d.an anVarA = ceVarL.a();
            if (anVarA instanceof com.waze.z.a.d.ak) {
                ceVarL = ce.l(ceVarL, com.waze.z.a.d.ak.d((com.waze.z.a.d.ak) anVarA, null, bx.P(apVar), 3), null, null, null, false, false, false, null, null, false, 4094);
            } else if (!(anVarA instanceof com.waze.z.a.d.am)) {
                throw new h.i();
            }
        } while (!bnVar2.f(objD2, ceVarL));
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bo(bx bxVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f35842c = i2;
        this.f35841b = bxVar;
    }
}
