package com.waze.network.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bb extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    int f31994a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bc f31995b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f31996c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bb(bc bcVar, w wVar, h.c.e eVar) {
        super(1, eVar);
        this.f31995b = bcVar;
        this.f31996c = wVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(h.c.e<?> eVar) {
        return new bb(this.f31995b, this.f31996c, eVar);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((bb) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f31994a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f31994a = 1;
            if (bc.d(this.f31995b, this.f31996c, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
