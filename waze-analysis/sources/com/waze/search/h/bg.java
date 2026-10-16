package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bg extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f35825a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f35826b;

    bg(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        bg bgVar = new bg((h.c.e) obj3);
        bgVar.f35825a = zBooleanValue;
        bgVar.f35826b = zBooleanValue2;
        return bgVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new an(!this.f35825a, !this.f35826b);
    }
}
