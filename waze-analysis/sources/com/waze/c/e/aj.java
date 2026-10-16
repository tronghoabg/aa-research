package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f18511a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f18512b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(al alVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18512b = i2;
        this.f18511a = alVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f18512b;
        Object obj2 = this.f18511a;
        return i2 != 0 ? new aj((k) obj2, eVar, 1) : new aj((al) obj2, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f18512b != 0 ? ((aj) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((aj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f18512b != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            k kVar = (k) this.f18511a;
            kotlinx.coroutines.aj.z(kVar.f18675d, null, null, new ah(kVar, (h.c.e) null, 1), 3).bY(new com.airbnb.lottie.b.q(kVar, 17));
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        al alVar = (al) this.f18511a;
        com.waze.ui.b.e eVarC = alVar.c().c();
        com.waze.ui.b.e eVar = com.waze.ui.b.e.f42052a;
        int iOrdinal = eVarC.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            alVar.d().e(com.waze.ui.b.o.f42079a);
        } else {
            if (iOrdinal != 2 && iOrdinal != 3) {
                throw new h.i();
            }
            alVar.d().e(com.waze.ui.b.o.f42080b);
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18512b = i2;
        this.f18511a = kVar;
    }
}
