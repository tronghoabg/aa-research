package com.waze.asks;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bg extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f15566a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f15567b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f15568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(ah ahVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f15568c = i2;
        this.f15567b = ahVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f15568c;
        Object obj2 = this.f15567b;
        return i2 != 0 ? new bg((ah) obj2, eVar, 1) : new bg((bj) obj2, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f15568c != 0 ? ((bg) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bg) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f15568c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f15566a == 0) {
                e.b.c.b(obj);
                Object obj2 = this.f15567b;
                this.f15566a = 1;
                if (((ah) obj2).i().e().collect(new bf(obj2, 1), this) == aVar) {
                    return aVar;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f15566a == 0) {
            e.b.c.b(obj);
            Object obj3 = this.f15567b;
            this.f15566a = 1;
            if (((bj) obj3).f15578f.collect(new bf(obj3, 0), this) == aVar2) {
                return aVar2;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(bj bjVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f15568c = i2;
        this.f15567b = bjVar;
    }
}
