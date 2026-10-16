package com.waze.main_screen.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class i extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f26249a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.z.a.g.aa f26250b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(com.waze.z.a.g.aa aaVar, h.c.e eVar) {
        super(2, eVar);
        this.f26250b = aaVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new i(this.f26250b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((i) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f26249a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f26249a = 1;
            if (this.f26250b.b(this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
