package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cn implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f22510a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ co f22511b;

    public cn(kotlinx.coroutines.b.k kVar, co coVar) {
        this.f22510a = kVar;
        this.f22511b = coVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f22510a.collect(new cm(lVar, this.f22511b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
