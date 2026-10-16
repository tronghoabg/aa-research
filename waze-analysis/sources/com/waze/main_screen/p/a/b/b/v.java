package com.waze.main_screen.p.a.b.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class v extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f26995a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f26996b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(ab abVar, h.c.e eVar) {
        super(2, eVar);
        this.f26996b = abVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new v(this.f26996b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((v) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f26995a == 0) {
            e.b.c.b(obj);
            ab abVar = this.f26996b;
            this.f26995a = 1;
            if (abVar.f26879b.ac().collect(new u(abVar), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
