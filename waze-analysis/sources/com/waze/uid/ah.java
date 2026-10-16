package com.waze.uid;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ah extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f44117a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f44118b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f44119c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f44120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(al alVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f44120d = i2;
        this.f44119c = alVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f44120d;
        Object obj2 = this.f44119c;
        if (i2 != 0) {
            ah ahVar = new ah((d) obj2, eVar, 1);
            ahVar.f44118b = obj;
            return ahVar;
        }
        ah ahVar2 = new ah((al) obj2, eVar, 0);
        ahVar2.f44118b = obj;
        return ahVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f44120d != 0 ? ((ah) create((com.waze.b.s) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ah) create((ac) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f44120d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f44117a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                com.waze.b.s sVar = (com.waze.b.s) this.f44118b;
                Object obj2 = this.f44119c;
                this.f44117a = 1;
                if (d.a((d) obj2, sVar, this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f44117a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ac acVar = (ac) this.f44118b;
            Object obj3 = this.f44119c;
            this.f44117a = 1;
            if (al.d((al) obj3, acVar, this) == aVar2) {
                return aVar2;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(d dVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f44120d = i2;
        this.f44119c = dVar;
    }
}
