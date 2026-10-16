package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aa extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f30943a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f30944b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ af f30945c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f30946d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f30947e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(long j2, com.waze.av.d.k kVar, af afVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f30947e = i2;
        this.f30944b = j2;
        this.f30946d = kVar;
        this.f30945c = afVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f30947e;
        if (i2 == 0) {
            return new aa(this.f30944b, this.f30945c, (com.waze.av.b.n) this.f30946d, eVar, 0);
        }
        if (i2 == 1) {
            return new aa(this.f30944b, this.f30945c, (com.waze.av.d.k) this.f30946d, eVar, 1);
        }
        return new aa(this.f30944b, (com.waze.av.d.k) this.f30946d, this.f30945c, eVar, 2);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f30947e;
        return i2 != 0 ? i2 != 1 ? ((aa) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((aa) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((aa) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f30947e;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f30943a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            this.f30943a = 1;
            Object objI = kotlinx.coroutines.aj.I(this.f30944b, new z(this.f30945c, (com.waze.av.b.n) this.f30946d, null, 3, null), this);
            return objI == aVar ? aVar : objI;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f30943a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            this.f30943a = 1;
            Object objI2 = kotlinx.coroutines.aj.I(this.f30944b, new z(this.f30945c, (com.waze.av.d.k) this.f30946d, (h.c.e) null, 2), this);
            return objI2 == aVar2 ? aVar2 : objI2;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f30943a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        long j2 = this.f30944b;
        com.waze.av.d.k kVar = (com.waze.av.d.k) this.f30946d;
        this.f30943a = 1;
        Object objI3 = kotlinx.coroutines.aj.I(j2, new z(kVar, this.f30945c, (h.c.e) null, 4), this);
        return objI3 == aVar3 ? aVar3 : objI3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(long j2, af afVar, com.waze.av.b.n nVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f30947e = i2;
        this.f30944b = j2;
        this.f30945c = afVar;
        this.f30946d = nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(long j2, af afVar, com.waze.av.d.k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f30947e = i2;
        this.f30944b = j2;
        this.f30945c = afVar;
        this.f30946d = kVar;
    }
}
