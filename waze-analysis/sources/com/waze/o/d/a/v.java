package com.waze.o.d.a;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f32872a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f32873b;

    public v(kotlinx.coroutines.b.k kVar, boolean z) {
        this.f32872a = kVar;
        this.f32873b = z;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f32872a.collect(new u(lVar, this.f32873b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }
}
