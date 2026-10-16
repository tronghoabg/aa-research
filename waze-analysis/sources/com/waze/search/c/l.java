package com.waze.search.c;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f35595a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f35596b;

    public l(kotlinx.coroutines.b.k kVar, m mVar) {
        this.f35595a = kVar;
        this.f35596b = mVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f35595a.collect(new k(lVar, this.f35596b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
