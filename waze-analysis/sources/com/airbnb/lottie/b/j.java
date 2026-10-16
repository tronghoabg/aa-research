package com.airbnb.lottie.b;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class j extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f2016a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.airbnb.lottie.h f2017b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f2018c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f2019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(k kVar, com.airbnb.lottie.h hVar, float f2, boolean z, h.c.e eVar) {
        super(1, eVar);
        this.f2016a = kVar;
        this.f2017b = hVar;
        this.f2018c = f2;
        this.f2019d = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(h.c.e<?> eVar) {
        return new j(this.f2016a, this.f2017b, this.f2018c, this.f2019d, eVar);
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((j) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        k kVar = this.f2016a;
        kVar.f2028i.setValue(this.f2017b);
        kVar.D(this.f2018c);
        kVar.B(1);
        kVar.f2020a.setValue(Boolean.valueOf(false));
        if (this.f2019d) {
            kVar.C(Long.MIN_VALUE);
        }
        return h.ab.f48028a;
    }
}
