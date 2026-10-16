package com.waze.app_nav.hub.c;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class n extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15319a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f15320b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(h.c.e eVar, int i2) {
        super(2, eVar);
        this.f15320b = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f15320b != 0) {
            n nVar = new n(eVar, 1, null);
            nVar.f15319a = obj;
            return nVar;
        }
        n nVar2 = new n(eVar, 0);
        nVar2.f15319a = obj;
        return nVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f15320b != 0 ? ((n) create((com.waze.app_nav.hub.a.a) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((n) create((a) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f15320b != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return Boolean.valueOf(((com.waze.app_nav.hub.a.a) this.f15319a).a());
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(((a) this.f15319a) != a.f15293c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f15320b = i2;
    }
}
