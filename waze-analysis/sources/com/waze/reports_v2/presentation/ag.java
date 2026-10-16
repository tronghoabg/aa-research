package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ag extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f34774a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ah f34775b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aa f34776c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(ah ahVar, aa aaVar, h.c.e eVar) {
        super(2, eVar);
        this.f34775b = ahVar;
        this.f34776c = aaVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ag(this.f34775b, this.f34776c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ag) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f34774a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ah ahVar = this.f34775b;
            aa aaVar = this.f34776c;
            this.f34774a = 1;
            if (ahVar.f34788l.emit(aaVar, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
