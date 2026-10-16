package com.waze.app_nav.hub.b;

import com.waze.iw;
import h.g.b.x;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends i {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f15261a;

    /* renamed from: b, reason: collision with root package name */
    private final f f15262b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f15263c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.q f15264d;

    /* renamed from: e, reason: collision with root package name */
    private h.g.a.a f15265e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f15266f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h.g.a.a aVar, f fVar, boolean z, h.g.a.q qVar) {
        super(null);
        x.f(aVar, "onPostDismiss");
        x.f(qVar, "content");
        this.f15261a = aVar;
        this.f15262b = fVar;
        this.f15263c = z;
        this.f15264d = qVar;
        this.f15265e = new iw(1);
        this.f15266f = new AtomicBoolean(true);
    }

    public final h.g.a.q a() {
        return this.f15264d;
    }

    @Override // com.waze.app_nav.hub.b.i
    public final void b(boolean z) {
        if (z || !this.f15266f.compareAndSet(true, false)) {
            return;
        }
        this.f15265e.invoke();
        this.f15261a.invoke();
        f fVar = this.f15262b;
        if (fVar != null) {
            fVar.a();
        }
    }

    public final void c() {
        f fVar = this.f15262b;
        if (fVar != null) {
            fVar.b();
        }
    }

    public final void d(h.g.a.a aVar) {
        x.f(aVar, "onDismiss");
        this.f15265e = aVar;
    }

    public final boolean e() {
        return this.f15263c;
    }

    public /* synthetic */ e(h.g.a.a aVar, f fVar, h.g.a.q qVar, int i2) {
        this((i2 & 1) != 0 ? new iw(2) : aVar, (i2 & 2) != 0 ? null : fVar, true, qVar);
    }
}
