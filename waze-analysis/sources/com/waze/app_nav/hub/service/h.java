package com.waze.app_nav.hub.service;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f15386a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f15387b;

    public h(kotlinx.coroutines.b.k kVar, i iVar) {
        this.f15386a = kVar;
        this.f15387b = iVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f15386a.collect(new g(lVar, this.f15387b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
