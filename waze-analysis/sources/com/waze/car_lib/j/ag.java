package com.waze.car_lib.j;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ag implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f20182a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ak f20183b;

    public ag(kotlinx.coroutines.b.k kVar, ak akVar) {
        this.f20182a = kVar;
        this.f20183b = akVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f20182a.collect(new af(lVar, this.f20183b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
