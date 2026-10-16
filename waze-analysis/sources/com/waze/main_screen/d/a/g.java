package com.waze.main_screen.d.a;

import h.ab;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f26312a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f26313b;

    public g(k kVar, h hVar) {
        this.f26312a = kVar;
        this.f26313b = hVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(l lVar, h.c.e eVar) {
        Object objCollect = this.f26312a.collect(new f(lVar, this.f26313b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
