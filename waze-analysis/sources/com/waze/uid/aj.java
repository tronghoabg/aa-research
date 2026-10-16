package com.waze.uid;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f44124a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44125b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(h.c.e eVar, int i2) {
        super(2, eVar);
        this.f44125b = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f44125b != 0) {
            aj ajVar = new aj(eVar, 1, null);
            ajVar.f44124a = obj;
            return ajVar;
        }
        aj ajVar2 = new aj(eVar, 0);
        ajVar2.f44124a = obj;
        return ajVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f44125b != 0 ? ((aj) create((com.waze.app_nav.hub.c.a) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((aj) create((com.waze.b.s) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f44125b != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return Boolean.valueOf(((com.waze.app_nav.hub.c.a) this.f44124a) != com.waze.app_nav.hub.c.a.f15293c);
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(com.waze.ads.c.e.c(((com.waze.b.s) this.f44124a).b()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f44125b = i2;
    }
}
