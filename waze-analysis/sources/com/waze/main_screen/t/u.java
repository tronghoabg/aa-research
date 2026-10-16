package com.waze.main_screen.t;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class u extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f27630a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f27631b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(com.waze.ao.b.f fVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27631b = i2;
        this.f27630a = fVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [h.g.a.l, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f27631b;
        return i2 != 0 ? i2 != 1 ? new u((h.g.a.l) this.f27630a, eVar, 2) : new u((am) this.f27630a, eVar, 1) : new u((com.waze.ao.b.f) this.f27630a, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f27631b;
        return i2 != 0 ? i2 != 1 ? ((u) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((u) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((u) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [h.g.a.l, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f27631b;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((com.waze.ao.b.f) this.f27630a).e();
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((am) this.f27630a).q().e();
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ?? r2 = this.f27630a;
        if (r2 != 0) {
            r2.invoke(null);
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(am amVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27631b = i2;
        this.f27630a = amVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(h.g.a.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27631b = i2;
        this.f27630a = lVar;
    }
}
