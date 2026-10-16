package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ff extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28931a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cx f28932b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ gb f28933c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.map.canvas.a.e f28934d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.bn f28935e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f28936f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ff(cx cxVar, gb gbVar, com.waze.map.canvas.a.e eVar, kotlinx.coroutines.b.bn bnVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f28932b = cxVar;
        this.f28933c = gbVar;
        this.f28934d = eVar;
        this.f28935e = bnVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ff ffVar = new ff(this.f28932b, this.f28933c, this.f28934d, this.f28935e, eVar);
        ffVar.f28936f = obj;
        return ffVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ff) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f28931a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f28936f;
            cx cxVar = this.f28932b;
            gb gbVar = this.f28933c;
            com.waze.map.canvas.a.e eVar = this.f28934d;
            kotlinx.coroutines.b.bn bnVar = this.f28935e;
            this.f28931a = 1;
            if (kotlinx.coroutines.b.ai.e(cxVar.d(), new fe(gbVar, afVar, eVar, bnVar, null), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
