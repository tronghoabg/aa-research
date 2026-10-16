package com.waze.main_screen.k.a;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f26522a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f26523b;

    public g(kotlinx.coroutines.b.k kVar, int i2) {
        this.f26523b = i2;
        this.f26522a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = this.f26523b;
        if (i2 == 0) {
            Object objCollect = this.f26522a.collect(new f(lVar, 0), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
        }
        if (i2 != 1) {
            Object objCollect2 = this.f26522a.collect(new f(lVar, 2), eVar);
            return objCollect2 == h.c.a.a.f48038a ? objCollect2 : ab.f48028a;
        }
        Object objCollect3 = this.f26522a.collect(new f(lVar, 1), eVar);
        return objCollect3 == h.c.a.a.f48038a ? objCollect3 : ab.f48028a;
    }
}
