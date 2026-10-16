package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class et extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28857a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f28858b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.map.canvas.a.e f28859c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    et(com.waze.map.canvas.a.e eVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f28859c = eVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        et etVar = new et(this.f28859c, eVar);
        etVar.f28858b = obj;
        return etVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((et) create((cm) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f28857a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            cm cmVar = (cm) this.f28858b;
            this.f28857a = 1;
            if (this.f28859c.setDarkenHighlight(cmVar.a(), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
