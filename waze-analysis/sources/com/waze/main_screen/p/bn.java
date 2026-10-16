package com.waze.main_screen.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bn extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f27215a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bs f27216b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bn(bs bsVar, h.c.e eVar) {
        super(2, eVar);
        this.f27216b = bsVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        bn bnVar = new bn(this.f27216b, eVar);
        bnVar.f27215a = ((Boolean) obj).booleanValue();
        return bnVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((bn) create(bool, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        com.waze.main_screen.q.b.i iVarA;
        Object objD;
        bm bmVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        if (this.f27215a) {
            bs bsVar = this.f27216b;
            iVarA = bsVar.f27232h.a(new com.waze.main_screen.t.aq(bsVar, 1));
        } else {
            iVarA = null;
        }
        com.waze.main_screen.q.b.i iVar = iVarA;
        kotlinx.coroutines.b.bn bnVar = this.f27216b.H;
        do {
            objD = bnVar.d();
            bmVar = (bm) objD;
        } while (!bnVar.f(objD, bm.m(bmVar, null, iVar, null, null, null, null, null, null, null, null, null, 4093)));
        com.waze.main_screen.q.b.i iVarG = bmVar.g();
        if (iVarG != null) {
            iVarG.b();
        }
        return h.ab.f48028a;
    }
}
