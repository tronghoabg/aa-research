package com.waze.search.a.c;

import h.ab;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f35464a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f35465b;

    public f(k kVar, g gVar) {
        this.f35464a = kVar;
        this.f35465b = gVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(l lVar, h.c.e eVar) {
        Object objCollect = this.f35464a.collect(new e(lVar, this.f35465b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
