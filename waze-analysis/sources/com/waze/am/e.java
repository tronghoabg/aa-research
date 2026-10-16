package com.waze.am;

import h.ab;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f14315a;

    public e(k kVar) {
        this.f14315a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(l lVar, h.c.e eVar) {
        Object objCollect = this.f14315a.collect(new d(lVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
