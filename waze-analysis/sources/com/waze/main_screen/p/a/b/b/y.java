package com.waze.main_screen.p.a.b.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class y extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27001a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f27002b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ab abVar, h.c.e eVar) {
        super(2, eVar);
        this.f27002b = abVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new y(this.f27002b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f27001a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ab abVar = this.f27002b;
            this.f27001a = 1;
            if (new n(kotlinx.coroutines.b.ai.D(abVar.f26878a.M()), 4).collect(new w(abVar), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
