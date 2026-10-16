package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bo implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f34887a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bp f34888b;

    public bo(kotlinx.coroutines.b.k kVar, bp bpVar) {
        this.f34887a = kVar;
        this.f34888b = bpVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f34887a.collect(new bn(lVar, this.f34888b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
