package com.waze.main_screen.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class al extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f27029a;

    /* renamed from: b, reason: collision with root package name */
    int f27030b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bf f27031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    al(bf bfVar, h.c.e eVar) {
        super(2, eVar);
        this.f27031c = bfVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new al(this.f27031c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((al) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        bf bfVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.f27030b;
        if (i2 == 0) {
            e.b.c.b(obj);
            bf bfVar2 = this.f27031c;
            this.f27030b = 1;
            obj = kotlinx.coroutines.b.ai.k(kotlinx.coroutines.b.ai.q(bfVar2.h().w(), bfVar2.D(), new aj(bfVar2, null)), new ak(null), this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i2 != 1) {
            bfVar = (bf) this.f27029a;
            e.b.c.b(obj);
            bfVar.z().invoke();
            return h.ab.f48028a;
        }
        e.b.c.b(obj);
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            bf bfVar3 = this.f27031c;
            bool.booleanValue();
            com.waze.main_screen.p.a.b.a.t tVarH = bfVar3.h();
            this.f27029a = bfVar3;
            this.f27030b = 2;
            if (tVarH.E(this) != aVar) {
                bfVar = bfVar3;
                bfVar.z().invoke();
            }
            return aVar;
        }
        return h.ab.f48028a;
    }
}
