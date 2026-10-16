package com.waze.ui.w;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class v extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f43791a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f43792b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f43793c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(c cVar, h.g.a.l lVar, float f2, h.c.e eVar) {
        super(2, eVar);
        this.f43791a = cVar;
        this.f43792b = lVar;
        this.f43793c = f2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new v(this.f43791a, this.f43792b, this.f43793c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((v) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        c cVar = this.f43791a;
        if (!Float.isNaN(cVar.a())) {
            this.f43792b.invoke(new com.waze.ui.w.b.a(h.h.a.b(this.f43793c - cVar.a())));
        }
        return h.ab.f48028a;
    }
}
