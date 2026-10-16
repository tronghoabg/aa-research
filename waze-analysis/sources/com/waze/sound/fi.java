package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fi implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f40012a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fl f40013b;

    public fi(kotlinx.coroutines.b.k kVar, fl flVar) {
        this.f40012a = kVar;
        this.f40013b = flVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f40012a.collect(new fh(lVar, this.f40013b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
