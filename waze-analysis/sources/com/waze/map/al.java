package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class al extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27949a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MapLineResolverNativeManager f27950b;

    /* renamed from: c, reason: collision with root package name */
    int f27951c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    al(MapLineResolverNativeManager mapLineResolverNativeManager, h.c.e eVar) {
        super(eVar);
        this.f27950b = mapLineResolverNativeManager;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27949a = obj;
        this.f27951c |= Integer.MIN_VALUE;
        Object objMo28511findNearestMapLinegIAlus = this.f27950b.mo28511findNearestMapLinegIAlus(null, this);
        return objMo28511findNearestMapLinegIAlus == h.c.a.a.f48038a ? objMo28511findNearestMapLinegIAlus : h.m.d(objMo28511findNearestMapLinegIAlus);
    }
}
