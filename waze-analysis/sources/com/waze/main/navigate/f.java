package com.waze.main.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class f implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f25506a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f25507b;

    public /* synthetic */ f(Object obj, int i2) {
        this.f25507b = i2;
        this.f25506a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.waze.main_screen.q.b.i, java.lang.Object] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        int i2 = this.f25507b;
        if (i2 == 0) {
            g.a((g) this.f25506a);
            return;
        }
        if (i2 == 1) {
            this.f25506a.b();
            return;
        }
        Object obj = this.f25506a;
        if (i2 != 2) {
            ((com.waze.shared_infra.n.c) obj).f();
        } else if (obj != null) {
            ((com.waze.ao.b.f) obj).close();
        }
    }
}
