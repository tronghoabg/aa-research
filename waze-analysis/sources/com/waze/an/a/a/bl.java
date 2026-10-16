package com.waze.an.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bl extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f14456a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f14457b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f14458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(ar arVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f14458c = i2;
        this.f14457b = arVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f14458c;
        Object obj2 = this.f14457b;
        return i2 != 0 ? new bl((ar) obj2, eVar, 1) : new bl((bm) obj2, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f14458c != 0 ? ((bl) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bl) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f14458c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f14456a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f14457b;
                this.f14456a = 1;
                if (ar.b((ar) obj2, this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f14456a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj3 = this.f14457b;
            bm bmVar = (bm) obj3;
            this.f14456a = 1;
            if (new bf(bmVar.f14459a.getQuestionFlow(), obj3, 2).collect(new bj(bmVar), this) == aVar2) {
                return aVar2;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bm bmVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f14458c = i2;
        this.f14457b = bmVar;
    }
}
