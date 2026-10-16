package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ez extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28874a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cx f28875b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.map.canvas.a.e f28876c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ gb f28877d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f28878e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ez(cx cxVar, com.waze.map.canvas.a.e eVar, gb gbVar, h.c.e eVar2, int i2) {
        super(2, eVar2);
        this.f28878e = i2;
        this.f28875b = cxVar;
        this.f28876c = eVar;
        this.f28877d = gbVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f28878e != 0 ? new ez(this.f28875b, this.f28877d, this.f28876c, eVar, 1) : new ez(this.f28875b, this.f28876c, this.f28877d, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f28878e != 0 ? ((ez) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ez) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f28878e == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f28874a == 0) {
                e.b.c.b(obj);
                cx cxVar = this.f28875b;
                com.waze.map.canvas.a.e eVar = this.f28876c;
                this.f28874a = 1;
                if (cxVar.h().collect(new ey(eVar), this) == aVar) {
                    return aVar;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f28874a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            cx cxVar2 = this.f28875b;
            gb gbVar = this.f28877d;
            com.waze.map.canvas.a.e eVar2 = this.f28876c;
            this.f28874a = 1;
            if (cxVar2.b().collect(new fp(gbVar, eVar2, 1), this) == aVar2) {
                return aVar2;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ez(cx cxVar, gb gbVar, com.waze.map.canvas.a.e eVar, h.c.e eVar2, int i2) {
        super(2, eVar2);
        this.f28878e = i2;
        this.f28875b = cxVar;
        this.f28877d = gbVar;
        this.f28876c = eVar;
    }
}
