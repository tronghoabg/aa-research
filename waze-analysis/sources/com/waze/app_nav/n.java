package com.waze.app_nav;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class n extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f15424a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f15425b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f15426c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(r rVar, o oVar, h.c.e eVar) {
        super(2, eVar);
        this.f15425b = rVar;
        this.f15426c = oVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new n(this.f15425b, this.f15426c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((n) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f15424a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f15424a = 1;
            if (this.f15425b.a(this) == aVar) {
                return aVar;
            }
        }
        this.f15426c.b();
        return h.ab.f48028a;
    }
}
