package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fe implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f21630a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f21631b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f21632c;

    public fe(kotlinx.coroutines.b.k kVar, Object obj, int i2) {
        this.f21632c = i2;
        this.f21630a = kVar;
        this.f21631b = obj;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = this.f21632c;
        Object obj = this.f21631b;
        if (i2 != 0) {
            Object objCollect = this.f21630a.collect(new fd(lVar, obj, 1), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
        }
        Object objCollect2 = this.f21630a.collect(new fd(lVar, obj, 0), eVar);
        return objCollect2 == h.c.a.a.f48038a ? objCollect2 : h.ab.f48028a;
    }
}
