package com.waze.reports_v2.a.b;

import h.ab;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f33998a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f33999b;

    public d(k kVar, e eVar) {
        this.f33998a = kVar;
        this.f33999b = eVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(l lVar, h.c.e eVar) {
        Object objCollect = this.f33998a.collect(new c(lVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
