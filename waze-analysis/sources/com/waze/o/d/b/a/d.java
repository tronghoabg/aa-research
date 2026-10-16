package com.waze.o.d.b.a;

import com.waze.o.b.b.k;
import com.waze.t.c.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final l f32877a;

    /* renamed from: b, reason: collision with root package name */
    private final k f32878b;

    public d(k kVar, l lVar) {
        x.f(kVar, "companinioController");
        x.f(lVar, "conversationPermissionStateHolder");
        this.f32878b = kVar;
        this.f32877a = lVar;
    }

    public final l a() {
        return this.f32877a;
    }

    public final void b() {
        this.f32878b.g();
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }
}
