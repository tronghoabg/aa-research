package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ev extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28864a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f28865b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.map.canvas.a.e f28866c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ev(com.waze.map.canvas.a.e eVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f28866c = eVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ev evVar = new ev(this.f28866c, eVar);
        evVar.f28865b = ((Boolean) obj).booleanValue();
        return evVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ev) create(bool, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f28864a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            boolean z = this.f28865b;
            this.f28864a = 1;
            if (this.f28866c.setShowMapLoader(z, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
