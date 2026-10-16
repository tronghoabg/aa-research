package com.waze.nightmode;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class y extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f32514a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f32515b;

    y(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        y yVar = new y((h.c.e) obj3);
        yVar.f32514a = zBooleanValue;
        yVar.f32515b = zBooleanValue2;
        return yVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new h.k(Boolean.valueOf(this.f32514a), Boolean.valueOf(this.f32515b));
    }
}
