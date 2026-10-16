package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class q extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f40801a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f40802b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ag f40803c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f40804d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(ag agVar, int i2, h.c.e eVar) {
        super(3, eVar);
        this.f40803c = agVar;
        this.f40804d = i2;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        q qVar = new q(this.f40803c, this.f40804d, (h.c.e) obj3);
        qVar.f40802b = (Throwable) obj2;
        return qVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f40801a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Throwable th = (Throwable) this.f40802b;
            this.f40801a = 1;
            if (ag.j(this.f40803c, th, this.f40804d, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
