package com.waze.main_screen.p.a.b.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class i extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f26956a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f26957b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(q qVar, h.c.e eVar) {
        super(2, eVar);
        this.f26957b = qVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new i(this.f26957b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((i) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f26956a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            q qVar = this.f26957b;
            this.f26956a = 1;
            if (kotlinx.coroutines.b.ai.y(kotlinx.coroutines.b.ai.s(qVar.f26974a.P(), qVar.f26985l, qVar.m, qVar.f26975b.a(), new g(qVar))).collect(new h(qVar), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
