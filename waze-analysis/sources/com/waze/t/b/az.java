package com.waze.t.b;

import j$.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class az {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentLinkedQueue f40707a = new ConcurrentLinkedQueue();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentLinkedQueue f40708b = new ConcurrentLinkedQueue();

    private az() {
    }

    public static final /* synthetic */ Object d(az azVar, kotlinx.coroutines.b.k kVar, h.c.e eVar) {
        azVar.f40708b.clear();
        Object objCollect = kotlinx.coroutines.b.ai.y(new aw(kVar, 0)).collect(new ax(azVar, 0), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    public static final /* synthetic */ Object e(az azVar, kotlinx.coroutines.b.k kVar, h.c.e eVar) {
        azVar.f40707a.clear();
        Object objCollect = kotlinx.coroutines.b.ai.y(new aw(kVar, 2)).collect(new av(azVar, 3), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    public final ar a() {
        return new ar(h.a.i.ao(this.f40707a), h.a.i.ao(this.f40708b));
    }

    public final void f() {
        this.f40707a.clear();
        this.f40708b.clear();
    }

    public /* synthetic */ az(byte[] bArr) {
    }
}
