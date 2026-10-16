package com.waze.an.c.a;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f14698a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f14699b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f14700c;

    public k(kotlinx.coroutines.b.k kVar, Object obj, int i2) {
        this.f14700c = i2;
        this.f14698a = kVar;
        this.f14699b = obj;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        int i2 = this.f14700c;
        Object obj = this.f14699b;
        if (i2 != 0) {
            Object objCollect = this.f14698a.collect(new j(lVar, obj, 1), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
        }
        Object objCollect2 = this.f14698a.collect(new j(lVar, obj, 0), eVar);
        return objCollect2 == h.c.a.a.f48038a ? objCollect2 : ab.f48028a;
    }
}
