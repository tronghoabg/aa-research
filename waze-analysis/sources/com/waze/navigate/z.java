package com.waze.navigate;

import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class z extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f31835a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ af f31836b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f31837c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f31838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(com.waze.av.b.n nVar, af afVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f31838d = i2;
        this.f31837c = nVar;
        this.f31836b = afVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f31838d;
        if (i2 == 0) {
            return new z(this.f31836b, (com.waze.av.b.n) this.f31837c, eVar, 0);
        }
        if (i2 == 1) {
            return new z((com.waze.av.b.n) this.f31837c, this.f31836b, eVar, 1);
        }
        if (i2 == 2) {
            return new z(this.f31836b, (com.waze.av.d.k) this.f31837c, eVar, 2);
        }
        if (i2 == 3) {
            return new z(this.f31836b, (com.waze.av.b.n) this.f31837c, eVar, 3, null);
        }
        return new z((com.waze.av.d.k) this.f31837c, this.f31836b, eVar, 4);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f31838d;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f31838d;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f31835a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            af afVar = this.f31836b;
            Object obj2 = this.f31837c;
            this.f31835a = 1;
            Object objA = afVar.f30979c.a(((com.waze.av.b.n) obj2).e(), this);
            return objA == aVar ? aVar : objA;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f31835a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            this.f31835a = 1;
            Object objC = ax.c(((com.waze.av.b.n) this.f31837c).e().d(), this.f31836b.f30977a, this);
            return objC == aVar2 ? aVar2 : objC;
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f31835a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            af afVar2 = this.f31836b;
            Object obj3 = this.f31837c;
            this.f31835a = 1;
            Object objF = af.f(afVar2, (com.waze.av.d.k) obj3, this);
            return objF == aVar3 ? aVar3 : objF;
        }
        if (i2 == 3) {
            h.c.a.a aVar4 = h.c.a.a.f48038a;
            if (this.f31835a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            af afVar3 = this.f31836b;
            Object obj4 = this.f31837c;
            this.f31835a = 1;
            Object objG = af.g(afVar3, (com.waze.av.b.n) obj4, this);
            return objG == aVar4 ? aVar4 : objG;
        }
        h.c.a.a aVar5 = h.c.a.a.f48038a;
        if (this.f31835a == 0) {
            e.b.c.b(obj);
            Object obj5 = this.f31837c;
            if (obj5 != null) {
                af afVar4 = this.f31836b;
                this.f31835a = 1;
                obj = af.h(afVar4, (com.waze.av.d.k) obj5, this);
                if (obj == aVar5) {
                    return aVar5;
                }
            }
            return h.a.i.h();
        }
        e.b.c.b(obj);
        Collection collection = (Collection) obj;
        if (collection != null) {
            return collection;
        }
        return h.a.i.h();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(com.waze.av.d.k kVar, af afVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f31838d = i2;
        this.f31837c = kVar;
        this.f31836b = afVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(af afVar, com.waze.av.b.n nVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f31838d = i2;
        this.f31836b = afVar;
        this.f31837c = nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(af afVar, com.waze.av.b.n nVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f31838d = i2;
        this.f31836b = afVar;
        this.f31837c = nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(af afVar, com.waze.av.d.k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f31838d = i2;
        this.f31836b = afVar;
        this.f31837c = kVar;
    }
}
