package com.waze.main_screen.t;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class r extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f27621a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.main_screen.v.m f27622b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(boolean z, com.waze.main_screen.v.m mVar, h.c.e eVar) {
        super(2, eVar);
        this.f27621a = z;
        this.f27622b = mVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new r(this.f27621a, this.f27622b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((r) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f27621a;
        com.waze.main_screen.v.m mVar = this.f27622b;
        if (z) {
            mVar.c();
        } else {
            mVar.d();
        }
        return h.ab.f48028a;
    }
}
