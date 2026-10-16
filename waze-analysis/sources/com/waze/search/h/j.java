package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f35930a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f35931b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f35932c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.j.a.c f35933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(o oVar, com.waze.j.a.c cVar, h.c.e eVar) {
        super(2, eVar);
        this.f35932c = oVar;
        this.f35933d = cVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        j jVar = new j(this.f35932c, this.f35933d, eVar);
        jVar.f35931b = obj;
        return jVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((j) create((com.waze.z.a.d.ak) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = h.c.a.a.f48038a;
        if (this.f35930a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.z.a.d.ak akVar = (com.waze.z.a.d.ak) this.f35931b;
            if (akVar != null) {
                o oVar = this.f35932c;
                com.waze.j.a.c cVar = this.f35933d;
                this.f35930a = 1;
                Object objD = kotlinx.coroutines.aj.d(new d(akVar, oVar, cVar, null), this);
                if (objD != obj2) {
                    objD = h.ab.f48028a;
                }
                if (objD == obj2) {
                    return obj2;
                }
            }
        }
        return h.ab.f48028a;
    }
}
