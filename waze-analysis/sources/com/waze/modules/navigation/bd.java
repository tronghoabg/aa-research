package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bd extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f30372a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ao f30373b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bk f30374c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ak f30375d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f30376e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f30377f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bd(ao aoVar, bk bkVar, ak akVar, boolean z, boolean z2, h.c.e eVar) {
        super(2, eVar);
        this.f30373b = aoVar;
        this.f30374c = bkVar;
        this.f30375d = akVar;
        this.f30376e = z;
        this.f30377f = z2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bd(this.f30373b, this.f30374c, this.f30375d, this.f30376e, this.f30377f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bd) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f30372a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ao aoVar = this.f30373b;
            if (aoVar.h()) {
                this.f30372a = 1;
                if (this.f30374c.w(aoVar, this) == aVar) {
                    return aVar;
                }
            }
        }
        bk bkVar = this.f30374c;
        bkVar.f30400d.u(((ai) this.f30375d).a(), new com.waze.car_lib.b.n(bkVar, 20), this.f30376e, this.f30377f, this.f30373b.g());
        return h.ab.f48028a;
    }
}
