package com.waze.main_screen.j.a;

import h.ab;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f26473a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f26474b;

    public e(k kVar, g gVar) {
        this.f26473a = kVar;
        this.f26474b = gVar;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(l lVar, h.c.e eVar) {
        Object objCollect = this.f26473a.collect(new d(lVar, this.f26474b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
