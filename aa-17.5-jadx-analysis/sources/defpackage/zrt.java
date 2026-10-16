package defpackage;

import android.os.Looper;

/* loaded from: classes3.dex */
public final class zrt {
    public static final zrt a = new zrt(Looper.getMainLooper().getThread());
    private final Thread b;

    public zrt(Thread thread) {
        zkt.n(thread, "expectedThread");
        this.b = thread;
    }

    public final void a() {
        ysi.V(Thread.currentThread() == this.b, "Not on the main thread");
    }

    public final void b() {
        ysi.V(Thread.currentThread() != this.b, "Should not be on the main thread");
    }
}
