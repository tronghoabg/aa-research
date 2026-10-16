package com.waze.map.e;

import h.ab;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f28805a;

    public g(k kVar) {
        this.f28805a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(l lVar, h.c.e eVar) {
        Object objCollect = this.f28805a.collect(new f(lVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
