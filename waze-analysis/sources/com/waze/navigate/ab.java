package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ab extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f30948a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.av.d.k f30949b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f30950c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ af f30951d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f30952e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(com.waze.av.d.k kVar, String str, af afVar, String str2, h.c.e eVar) {
        super(2, eVar);
        this.f30949b = kVar;
        this.f30950c = str;
        this.f30951d = afVar;
        this.f30952e = str2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ab(this.f30949b, this.f30950c, this.f30951d, this.f30952e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ab) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f30948a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.av.d.k kVar = this.f30949b;
            if (kVar != null) {
                return kVar;
            }
            String str = this.f30950c;
            if (str == null) {
                return null;
            }
            af afVar = this.f30951d;
            String str2 = this.f30952e;
            this.f30948a = 1;
            obj = afVar.f30983g.a(str, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return (com.waze.av.d.k) obj;
    }
}
