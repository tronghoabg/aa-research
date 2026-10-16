package com.waze.car_lib.j;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20189a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f20190b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f20191c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f20192d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f20193e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(kotlinx.coroutines.b.k kVar, w wVar, h.g.a.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20193e = i2;
        this.f20190b = kVar;
        this.f20192d = wVar;
        this.f20191c = lVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r3v1, types: [h.g.a.l, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f20193e == 0) {
            return new aj(this.f20190b, (kotlinx.coroutines.b.k) this.f20191c, (ak) this.f20192d, eVar, 0);
        }
        return new aj(this.f20190b, (w) this.f20192d, (h.g.a.l) this.f20191c, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f20193e != 0 ? ((aj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((aj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r4v7, types: [h.g.a.l, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f20193e == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f20189a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f20189a = 1;
                if (kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.q(this.f20190b, this.f20191c, new ah(null)), new ai((ak) this.f20192d, null), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f20189a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.b.k kVar = this.f20190b;
            w wVar = (w) this.f20192d;
            this.f20189a = 1;
            if (kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.q(kVar, wVar.f20283a.a(), new u(null)), new v(wVar, this.f20191c, null), this) == aVar2) {
                return aVar2;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(kotlinx.coroutines.b.k kVar, kotlinx.coroutines.b.k kVar2, ak akVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20193e = i2;
        this.f20190b = kVar;
        this.f20191c = kVar2;
        this.f20192d = akVar;
    }
}
