package com.waze.main_screen.p.a.b.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class k extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f26959a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f26960b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(q qVar, h.c.e eVar) {
        super(2, eVar);
        this.f26960b = qVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new k(this.f26960b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((k) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f26959a == 0) {
            e.b.c.b(obj);
            q qVar = this.f26960b;
            this.f26959a = 1;
            if (qVar.f26979f.b().collect(new j(qVar), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
