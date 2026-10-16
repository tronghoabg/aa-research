package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ea extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f23628a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f23629b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f23630c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f23631d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ea(dt dtVar, com.waze.y.c cVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f23631d = i2;
        this.f23630c = dtVar;
        this.f23629b = cVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f23631d;
        if (i2 == 0) {
            return new ea((com.waze.q.l) this.f23629b, (el) this.f23630c, eVar, 0);
        }
        Object obj2 = this.f23630c;
        if (i2 != 1) {
            return new ea((iz) obj2, (com.waze.am.a) this.f23629b, eVar, 2);
        }
        return new ea((dt) obj2, (com.waze.y.c) this.f23629b, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f23631d;
        return i2 != 0 ? i2 != 1 ? ((ea) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ea) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ea) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f23631d;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f23628a == 0) {
                e.b.c.b(obj);
                Object obj2 = this.f23629b;
                Object obj3 = this.f23630c;
                com.waze.q.l lVar = (com.waze.q.l) obj2;
                this.f23628a = 1;
                if (lVar.c().collect(new dz((el) obj3, lVar), this) == aVar) {
                    return aVar;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f23628a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj4 = this.f23630c;
                this.f23628a = 1;
                if (dt.e((dt) obj4, ((com.waze.y.c) this.f23629b).a(), com.waze.mywaze.ag.f30568b, this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f23628a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj5 = this.f23630c;
            Object obj6 = this.f23629b;
            this.f23628a = 1;
            if (((iz) obj5).waitForAtLeast((com.waze.am.a) obj6, this) == aVar3) {
                return aVar3;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ea(iz izVar, com.waze.am.a aVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f23631d = i2;
        this.f23630c = izVar;
        this.f23629b = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ea(com.waze.q.l lVar, el elVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f23631d = i2;
        this.f23629b = lVar;
        this.f23630c = elVar;
    }
}
