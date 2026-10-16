package com.waze.ao.b;

import h.ab;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f14902a;

    public e(k kVar) {
        this.f14902a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(l lVar, h.c.e eVar) {
        Object objCollect = this.f14902a.collect(new d(lVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
