package com.waze.main_screen.p.a.b.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class f extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f26953a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f26954b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(q qVar, h.c.e eVar) {
        super(2, eVar);
        this.f26954b = qVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new f(this.f26954b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((f) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f26953a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            q qVar = this.f26954b;
            this.f26953a = 1;
            if (kotlinx.coroutines.b.ai.y(new n(qVar.n, 1)).collect(new d(qVar), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
