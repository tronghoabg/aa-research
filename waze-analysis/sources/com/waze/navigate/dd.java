package com.waze.navigate;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dd implements db {

    /* renamed from: a, reason: collision with root package name */
    private final eo f31226a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f31227b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f31228c;

    public dd(eo eoVar, h.g.a.a aVar) {
        h.g.b.x.f(eoVar, "navigationStatus");
        h.g.b.x.f(aVar, "stopNavigationAction");
        this.f31226a = eoVar;
        this.f31227b = eoVar.ac();
        this.f31228c = eoVar.Z();
    }

    static final h.ab g() {
        NativeManager.Post(new com.google.android.gms.common.api.internal.bc(17));
        return h.ab.f48028a;
    }

    @Override // com.waze.navigate.db
    public final com.waze.shared_infra.h.c a() {
        return (com.waze.shared_infra.h.c) d().d();
    }

    @Override // com.waze.navigate.db
    public final kotlinx.coroutines.b.ch b() {
        return this.f31228c;
    }

    @Override // com.waze.navigate.db
    public final kotlinx.coroutines.b.ch c() {
        return this.f31227b;
    }

    @Override // com.waze.navigate.db
    public final kotlinx.coroutines.b.ch d() {
        return this.f31226a.ak();
    }

    @Override // com.waze.navigate.db
    public final kotlinx.coroutines.b.ch e() {
        return this.f31226a.ah();
    }

    @Override // com.waze.navigate.db
    public final void f() {
        g();
    }
}
