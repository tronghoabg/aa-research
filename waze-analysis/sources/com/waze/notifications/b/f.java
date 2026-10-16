package com.waze.notifications.b;

import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f32558a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32559b;

    /* renamed from: c, reason: collision with root package name */
    private final bn f32560c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f32561d;

    public f(g gVar, int i2, com.waze.notifications.c cVar) {
        x.f(cVar, "data");
        this.f32558a = gVar;
        this.f32559b = i2;
        bn bnVarB = ck.b(cVar);
        this.f32560c = bnVarB;
        this.f32561d = ai.U(bnVarB);
    }

    @Override // com.waze.notifications.b.a
    public final ch a() {
        return this.f32561d;
    }

    @Override // com.waze.notifications.b.a
    public final void b(c cVar) {
        x.f(cVar, "reason");
        g.c(this.f32558a, this.f32559b);
        com.waze.notifications.a aVar = ((com.waze.notifications.c) this.f32561d.d()).f32569f;
        if (aVar != null) {
            aVar.a(cVar);
        }
    }

    @Override // com.waze.notifications.b.a
    public final void c() {
        Runnable runnable = ((com.waze.notifications.c) this.f32561d.d()).f32568e;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    public final int d() {
        return this.f32559b;
    }

    public final bn e() {
        return this.f32560c;
    }
}
