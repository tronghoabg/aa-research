package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fd implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f28923a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cr f28924b;

    public fd(kotlinx.coroutines.b.k kVar, cr crVar) {
        this.f28923a = kVar;
        this.f28924b = crVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f28923a.collect(new fc(lVar, this.f28924b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
