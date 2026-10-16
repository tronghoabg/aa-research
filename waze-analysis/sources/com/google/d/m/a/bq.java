package com.google.d.m.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bq extends j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f8033a;

    bq(Runnable runnable) {
        com.google.d.b.an.B(runnable);
        this.f8033a = runnable;
    }

    @Override // com.google.d.m.a.k
    protected final String a() {
        return "task=[" + this.f8033a.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f8033a.run();
        } catch (Throwable th) {
            d(th);
            throw th;
        }
    }
}
