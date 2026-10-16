package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ak extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27946a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MapLineResolverNativeManager f27947b;

    /* renamed from: c, reason: collision with root package name */
    int f27948c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(MapLineResolverNativeManager mapLineResolverNativeManager, h.c.e eVar) {
        super(eVar);
        this.f27947b = mapLineResolverNativeManager;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27946a = obj;
        this.f27948c |= Integer.MIN_VALUE;
        Object objMo28510findIntersectionMetadatagIAlus = this.f27947b.mo28510findIntersectionMetadatagIAlus(null, this);
        return objMo28510findIntersectionMetadatagIAlus == h.c.a.a.f48038a ? objMo28510findIntersectionMetadatagIAlus : h.m.d(objMo28510findIntersectionMetadatagIAlus);
    }
}
