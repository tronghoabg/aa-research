package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f35941a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f35942b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f35943c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f35944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(o oVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f35944d = i2;
        this.f35942b = oVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f35944d != 0) {
            n nVar = new n(this.f35942b, eVar, 1, null);
            nVar.f35943c = obj;
            return nVar;
        }
        n nVar2 = new n(this.f35942b, eVar, 0);
        nVar2.f35943c = obj;
        return nVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f35944d != 0 ? ((n) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((n) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.af afVar;
        Object objD;
        if (this.f35944d == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f35941a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                kotlinx.coroutines.af afVar2 = (kotlinx.coroutines.af) this.f35943c;
                o oVar = this.f35942b;
                com.waze.j.a.c cVarA = oVar.f35949e.a(new f(oVar, afVar2));
                this.f35941a = 1;
                if (kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.x(new m(kotlinx.coroutines.b.ai.y(oVar.f35955k), oVar), new com.waze.network.q(20)), new j(oVar, cVarA, null), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f35941a != 0) {
            afVar = (kotlinx.coroutines.af) this.f35943c;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar3 = (kotlinx.coroutines.af) this.f35943c;
            this.f35943c = afVar3;
            this.f35941a = 1;
            if (kotlinx.coroutines.aj.q(1000L, this) == aVar2) {
                return aVar2;
            }
            afVar = afVar3;
        }
        if (kotlinx.coroutines.aj.j(afVar)) {
            o oVar2 = this.f35942b;
            oVar2.f35951g.a("AutoComplete - show loading");
            kotlinx.coroutines.b.bn bnVar = oVar2.f35953i;
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, com.waze.search.e.ac.c((com.waze.search.e.ac) objD, com.waze.search.e.aa.f35611a)));
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(o oVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f35944d = i2;
        this.f35942b = oVar;
    }
}
