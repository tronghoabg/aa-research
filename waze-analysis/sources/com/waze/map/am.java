package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class am extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27952a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MapLineResolverNativeManager f27953b;

    /* renamed from: c, reason: collision with root package name */
    int f27954c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    am(MapLineResolverNativeManager mapLineResolverNativeManager, h.c.e eVar) {
        super(eVar);
        this.f27953b = mapLineResolverNativeManager;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27952a = obj;
        this.f27954c |= Integer.MIN_VALUE;
        Object objMo28512resolveSegmentToMapLinegIAlus = this.f27953b.mo28512resolveSegmentToMapLinegIAlus(null, this);
        return objMo28512resolveSegmentToMapLinegIAlus == h.c.a.a.f48038a ? objMo28512resolveSegmentToMapLinegIAlus : h.m.d(objMo28512resolveSegmentToMapLinegIAlus);
    }
}
