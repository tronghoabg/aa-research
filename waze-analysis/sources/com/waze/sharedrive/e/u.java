package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f38561a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f38562b;

    public u(kotlinx.coroutines.b.k kVar, v vVar) {
        this.f38561a = kVar;
        this.f38562b = vVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f38561a.collect(new t(lVar, this.f38562b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
