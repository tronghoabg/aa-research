package com.waze.alerters.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f14206a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f14207b;

    public x(kotlinx.coroutines.b.k kVar, y yVar) {
        this.f14206a = kVar;
        this.f14207b = yVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f14206a.collect(new w(lVar, this.f14207b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
