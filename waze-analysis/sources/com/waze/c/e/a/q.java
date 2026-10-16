package com.waze.c.e.a;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class q extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18457a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f18458b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18458b = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f18458b != 0) {
            q qVar = new q(eVar, 1, null);
            qVar.f18457a = obj;
            return qVar;
        }
        q qVar2 = new q(eVar, 0);
        qVar2.f18457a = obj;
        return qVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f18458b != 0 ? ((q) create((c) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((q) create((com.waze.map.b.d) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f18458b != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return Boolean.valueOf(((c) this.f18457a).f());
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(((com.waze.map.b.d) this.f18457a) == com.waze.map.b.d.f28178d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f18458b = i2;
    }
}
