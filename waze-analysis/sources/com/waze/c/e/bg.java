package com.waze.c.e;

import com.waze.navigate.ek;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bg extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18583a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bk f18584b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(bk bkVar, h.c.e eVar) {
        super(2, eVar);
        this.f18584b = bkVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        bg bgVar = new bg(this.f18584b, eVar);
        bgVar.f18583a = obj;
        return bgVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bg) create((h.k) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        bi biVar;
        boolean zN;
        l nVar;
        m mVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        h.k kVar = (h.k) this.f18583a;
        ek ekVar = (ek) kVar.a();
        g gVar = (g) kVar.b();
        kotlinx.coroutines.b.bn bnVar = this.f18584b.f18606l;
        do {
            objD = bnVar.d();
            biVar = (bi) objD;
            f fVarA = gVar.a();
            d dVar = d.f18660a;
            zN = h.g.b.x.n(fVarA, dVar);
            f fVarA2 = gVar.a();
            if (h.g.b.x.n(fVarA2, dVar)) {
                nVar = p.f18684a;
            } else if (fVarA2 instanceof c) {
                nVar = new o(((c) fVarA2).a());
            } else if (fVarA2 instanceof b) {
                a aVarA = ((b) fVarA2).a();
                a aVar2 = a.f18407a;
                int iOrdinal = aVarA.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    mVar = m.f18680b;
                    nVar = new n(mVar);
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new h.i();
                    }
                    mVar = m.f18680b;
                    nVar = new n(mVar);
                } else {
                    mVar = m.f18679a;
                    nVar = new n(mVar);
                }
            } else {
                if (!h.g.b.x.n(fVarA2, e.f18661a)) {
                    throw new h.i();
                }
                nVar = l.f18678a;
            }
        } while (!bnVar.f(objD, bi.g(biVar, gVar, null, new r(zN, nVar), null, ekVar, 22)));
        return h.ab.f48028a;
    }
}
