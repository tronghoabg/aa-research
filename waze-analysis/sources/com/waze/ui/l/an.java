package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class an extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f42504a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ba f42505b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f42506c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ck f42507d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f42508e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(ba baVar, float f2, ck ckVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f42508e = i2;
        this.f42505b = baVar;
        this.f42506c = f2;
        this.f42507d = ckVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f42508e != 0 ? new an(this.f42505b, this.f42506c, this.f42507d, eVar, 1, null) : new an(this.f42505b, this.f42506c, this.f42507d, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f42508e != 0 ? ((an) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((an) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f42508e != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f42504a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f42504a = 1;
                if (this.f42505b.L(this.f42506c, this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f42504a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f42504a = 1;
            if (this.f42505b.M(this.f42506c, this) == aVar2) {
                return aVar2;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(ba baVar, float f2, ck ckVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f42508e = i2;
        this.f42505b = baVar;
        this.f42506c = f2;
        this.f42507d = ckVar;
    }
}
