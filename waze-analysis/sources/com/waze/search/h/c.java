package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f35880a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f35881b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.z.a.d.ak f35882c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f35883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(o oVar, com.waze.z.a.d.ak akVar, boolean z, h.c.e eVar) {
        super(2, eVar);
        this.f35881b = oVar;
        this.f35882c = akVar;
        this.f35883d = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new c(this.f35881b, this.f35882c, this.f35883d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f35880a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        o oVar = this.f35881b;
        oVar.f35952h = false;
        com.waze.z.a.d.ak akVar = this.f35882c;
        boolean z = this.f35883d;
        com.waze.j.b.a aVar2 = oVar.f35945a;
        String strB = akVar.b();
        boolean z2 = akVar.a() == com.waze.z.a.d.aj.f45921b || akVar.a() == com.waze.z.a.d.aj.f45922c;
        this.f35880a = 1;
        Object objB = aVar2.b(strB, z, z2, this);
        return objB == aVar ? aVar : objB;
    }
}
