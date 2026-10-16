package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ap extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28014a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f28015b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bd f28016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ap(bd bdVar, h.c.e eVar) {
        super(2, eVar);
        this.f28016c = bdVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ap apVar = new ap(this.f28016c, eVar);
        apVar.f28015b = obj;
        return apVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ap) create((com.waze.map.canvas.bm) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f28014a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.map.canvas.bm bmVar = (com.waze.map.canvas.bm) this.f28015b;
            this.f28014a = 1;
            obj = c.a(this.f28016c.f28060g, bmVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.f28016c.f28059f.b((bi) obj);
        return h.ab.f48028a;
    }
}
