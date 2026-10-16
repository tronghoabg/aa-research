package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class eg extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fi f36423a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f36424b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f36425c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f36426d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eg(fi fiVar, String str, boolean z, boolean z2, h.c.e eVar) {
        super(2, eVar);
        this.f36423a = fiVar;
        this.f36424b = str;
        this.f36425c = z;
        this.f36426d = z2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new eg(this.f36423a, this.f36424b, this.f36425c, this.f36426d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((eg) create(bool, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f36423a.aa(new bp(this.f36424b, this.f36425c, this.f36426d));
        return h.ab.f48028a;
    }
}
