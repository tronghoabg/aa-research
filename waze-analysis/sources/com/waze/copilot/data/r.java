package com.waze.copilot.data;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class r extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f23050a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f23051b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f23052c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f23053d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(w wVar, af afVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f23053d = i2;
        this.f23051b = wVar;
        this.f23052c = afVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f23053d;
        if (i2 == 0) {
            return new r((w) this.f23051b, (af) this.f23052c, eVar, 0);
        }
        if (i2 != 1) {
            return new r((w) this.f23051b, (ag) this.f23052c, eVar, 2);
        }
        return new r((w) this.f23052c, (c) this.f23051b, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f23053d;
        return i2 != 0 ? i2 != 1 ? ((r) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((r) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((r) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objH;
        Object objC;
        Object objA;
        int i2 = this.f23053d;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f23050a != 0) {
                e.b.c.b(obj);
                objH = ((h.m) obj).b();
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f23051b;
                af afVar = (af) this.f23052c;
                this.f23050a = 1;
                objH = ((w) obj2).h(afVar.b(), afVar.c(), this);
                if (objH == aVar) {
                    return aVar;
                }
            }
            return h.m.d(objH);
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f23050a != 0) {
                e.b.c.b(obj);
                objA = ((h.m) obj).b();
            } else {
                e.b.c.b(obj);
                Object obj3 = this.f23051b;
                Object obj4 = this.f23052c;
                this.f23050a = 1;
                w wVar = (w) obj3;
                objA = wVar.a((ag) obj4, false, this);
                if (objA == aVar2) {
                    return aVar2;
                }
            }
            return h.m.d(objA);
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f23050a != 0) {
            e.b.c.b(obj);
            objC = ((h.m) obj).b();
        } else {
            e.b.c.b(obj);
            Object obj5 = this.f23052c;
            Object obj6 = this.f23051b;
            this.f23050a = 1;
            w wVar2 = (w) obj5;
            objC = wVar2.c((c) obj6, this);
            if (objC == aVar3) {
                return aVar3;
            }
        }
        return h.m.d(objC);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(w wVar, ag agVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f23053d = i2;
        this.f23051b = wVar;
        this.f23052c = agVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(w wVar, c cVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f23053d = i2;
        this.f23052c = wVar;
        this.f23051b = cVar;
    }
}
