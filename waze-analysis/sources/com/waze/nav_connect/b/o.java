package com.waze.nav_connect.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class o extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f30816a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ long f30817b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f30818c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(w wVar, h.c.e eVar) {
        super(3, eVar);
        this.f30818c = wVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        long jLongValue = ((Number) obj2).longValue();
        o oVar = new o(this.f30818c, (h.c.e) obj3);
        oVar.f30816a = zBooleanValue;
        oVar.f30817b = jLongValue;
        return oVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f30816a;
        long j2 = this.f30817b;
        boolean z2 = true;
        if (!z && j2 < com.waze.nav_connect.a.f()) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
