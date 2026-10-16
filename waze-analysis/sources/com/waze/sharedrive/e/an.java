package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class an extends h.c.b.a.g implements h.g.a.t {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38336a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f38337b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f38338c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f38339d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ boolean f38340e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ at f38341f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    an(at atVar, h.c.e eVar) {
        super(6, eVar);
        this.f38341f = atVar;
    }

    @Override // h.g.a.t
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        an anVar = new an(this.f38341f, (h.c.e) obj6);
        anVar.f38336a = (com.waze.sharedrive.d.r) obj;
        anVar.f38337b = (com.waze.sharedrive.g.z) obj2;
        anVar.f38338c = (y) obj3;
        anVar.f38339d = (String) obj4;
        anVar.f38340e = zBooleanValue;
        return anVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return this.f38341f.z((com.waze.sharedrive.d.r) this.f38336a, (com.waze.sharedrive.g.z) this.f38337b, (y) this.f38338c, (String) this.f38339d, this.f38340e);
    }
}
