package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ag extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f39414a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f39415b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f39416c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.a.ad f39417d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(ah ahVar, kotlinx.coroutines.a.ad adVar, h.c.e eVar) {
        super(2, eVar);
        this.f39416c = ahVar;
        this.f39417d = adVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ag agVar = new ag(this.f39416c, this.f39417d, eVar);
        agVar.f39415b = obj;
        return agVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ag) create((h.a.ag) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f39414a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ab abVar = (ab) ((h.a.ag) this.f39415b).c();
            this.f39414a = 1;
            if (ah.f(this.f39416c, this.f39417d, abVar, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
