package com.google.android.datatransport.runtime;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f4228a;

    s(Runnable runnable) {
        this.f4228a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4228a.run();
        } catch (Exception e2) {
            com.google.android.datatransport.cct.e.d("Executor", "Background execution failure.", e2);
        }
    }
}
