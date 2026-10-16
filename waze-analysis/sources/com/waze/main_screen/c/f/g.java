package com.waze.main_screen.c.f;

import h.ab;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f26230a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f26231b;

    public g(k kVar, h hVar) {
        this.f26230a = kVar;
        this.f26231b = hVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(l lVar, h.c.e eVar) {
        Object objCollect = this.f26230a.collect(new f(lVar, this.f26231b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
