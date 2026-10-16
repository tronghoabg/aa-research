package com.waze.car_lib.n;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ap extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20372a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ar f20373b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f20374c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ap(ar arVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20374c = i2;
        this.f20373b = arVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f20374c != 0 ? new ap(this.f20373b, eVar, 1, null) : new ap(this.f20373b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f20374c != 0 ? ((ap) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ap) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f20374c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f20372a == 0) {
                e.b.c.b(obj);
                ar arVar = this.f20373b;
                this.f20372a = 1;
                if (arVar.f20380b.d().collect(new an(arVar), this) == aVar) {
                    return aVar;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f20372a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ar arVar2 = this.f20373b;
            this.f20372a = 1;
            if (kotlinx.coroutines.b.ai.w(arVar2.f20389k, 250L).collect(new ao(arVar2), this) == aVar2) {
                return aVar2;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ap(ar arVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f20374c = i2;
        this.f20373b = arVar;
    }
}
