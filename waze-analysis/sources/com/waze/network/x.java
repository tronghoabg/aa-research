package com.waze.network;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class x implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f32420a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f32421b;

    public x(kotlinx.coroutines.b.k kVar, y yVar) {
        this.f32420a = kVar;
        this.f32421b = yVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f32420a.collect(new w(lVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
