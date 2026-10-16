package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f30394a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f30395b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f30396c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(bk bkVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f30396c = i2;
        this.f30395b = bkVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.g.a.l, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f30396c != 0 ? new bj((bk) this.f30395b, eVar, 1) : new bj((h.g.a.l) this.f30395b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f30396c != 0 ? ((bj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [h.g.a.l, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f30396c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f30394a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            bk bkVar = (bk) this.f30395b;
            this.f30394a = 1;
            Object objK = bk.k(bkVar, new bb(bkVar, null), this);
            return objK == aVar ? aVar : objK;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f30394a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        ?? r5 = this.f30395b;
        this.f30394a = 1;
        Object objInvoke = r5.invoke(this);
        return objInvoke == aVar2 ? aVar2 : objInvoke;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(h.g.a.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f30396c = i2;
        this.f30395b = lVar;
    }
}
