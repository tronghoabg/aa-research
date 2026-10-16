package com.waze.main_screen.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bd extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ int f27177a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ int f27178b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.main_screen.m.p f27179c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bd(com.waze.main_screen.m.p pVar, h.c.e eVar) {
        super(3, eVar);
        this.f27179c = pVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        bd bdVar = new bd(this.f27179c, (h.c.e) obj3);
        bdVar.f27177a = iIntValue;
        bdVar.f27178b = iIntValue2;
        return bdVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return com.waze.map.main.aa.h(this.f27179c.c(), 0, 0, 0, 0, 0, Math.max(this.f27177a, this.f27178b), 0, 95);
    }
}
