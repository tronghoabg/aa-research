package com.waze.network.f;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f32300a;

    public c(kotlinx.coroutines.b.k kVar) {
        this.f32300a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f32300a.collect(new b(lVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
