package com.waze.modules.d;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class w implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f30259a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f30260b;

    public w(kotlinx.coroutines.b.k kVar, int i2) {
        this.f30260b = i2;
        this.f30259a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        if (this.f30260b != 0) {
            Object objCollect = this.f30259a.collect(new v(lVar, 1), eVar);
            return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
        }
        Object objCollect2 = this.f30259a.collect(new v(lVar, 0), eVar);
        return objCollect2 == h.c.a.a.f48038a ? objCollect2 : ab.f48028a;
    }
}
