package com.waze.main_screen.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class at extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ int f27053a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ int f27054b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ boolean f27055c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f27056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    at(int i2, h.c.e eVar) {
        super(4, eVar);
        this.f27056d = i2;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        at atVar = new at(this.f27056d, (h.c.e) obj4);
        atVar.f27053a = iIntValue;
        atVar.f27054b = iIntValue2;
        atVar.f27055c = zBooleanValue;
        return atVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new Integer(this.f27055c ? 0 : h.k.n.i(this.f27056d - this.f27054b, this.f27053a));
    }
}
