package com.waze.map.canvas;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ae implements kotlinx.coroutines.b.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f28508a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f28509b;

    public ae(kotlinx.coroutines.b.k kVar, String str) {
        this.f28508a = kVar;
        this.f28509b = str;
    }

    @Override // kotlinx.coroutines.b.k
    public final Object collect(kotlinx.coroutines.b.l lVar, h.c.e eVar) {
        Object objCollect = this.f28508a.collect(new ad(lVar, this.f28509b), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }
}
