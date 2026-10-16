package com.waze.bq;

import h.ab;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f17245a;

    public d(k kVar) {
        this.f17245a = kVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(l lVar, h.c.e eVar) {
        Object objCollect = this.f17245a.collect(new c(lVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
