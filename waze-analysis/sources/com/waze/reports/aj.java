package com.waze.reports;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f33604a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ak f33605b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f33606c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(ak akVar, h.c.e eVar) {
        super(2, eVar);
        this.f33605b = akVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        aj ajVar = new aj(this.f33605b, eVar);
        ajVar.f33606c = obj;
        return ajVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f33604a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f33606c;
            ak akVar = this.f33605b;
            this.f33604a = 1;
            if (kotlinx.coroutines.b.ai.e(kotlinx.coroutines.b.ai.y(akVar.f33607a.d()), new ai(akVar, afVar, null), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
