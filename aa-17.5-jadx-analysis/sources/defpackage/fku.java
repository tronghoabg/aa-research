package defpackage;

import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class fku implements Runnable {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public fku(fov fovVar, Runnable runnable, int i) {
        this.a = i;
        this.b = fovVar;
        this.c = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future, zgp] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.concurrent.Future, zgp] */
    /* JADX WARN: Type inference failed for: r3v0, types: [aitf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aitf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [afck, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [afck, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i == 0) {
            ?? r0 = this.b;
            boolean zIsCancelled = r0.isCancelled();
            ?? r3 = this.c;
            if (zIsCancelled) {
                r3.g(null);
                return;
            }
            try {
                r3.w(fma.b(r0));
                return;
            } catch (ExecutionException e) {
                this.c.w(woy.dE(fma.c(e)));
                return;
            }
        }
        if (i == 1) {
            ?? r02 = this.b;
            boolean zIsCancelled2 = r02.isCancelled();
            ?? r32 = this.c;
            if (zIsCancelled2) {
                r32.g(null);
                return;
            }
            try {
                int i2 = dnv.c;
                r32.w(a.L(r02));
                return;
            } catch (ExecutionException e2) {
                this.c.w(woy.dE(vy.i(e2)));
                return;
            }
        }
        if (i != 2) {
            vaq.d();
            ((umx) this.b).c.lock();
            try {
                this.c.run();
                return;
            } finally {
                ((umx) this.b).c.unlock();
            }
        }
        try {
            this.c.run();
            Object obj = this.b;
            synchronized (((fov) obj).a) {
                ((fov) obj).a();
            }
        } catch (Throwable th) {
            Object obj2 = this.b;
            synchronized (((fov) obj2).a) {
                ((fov) obj2).a();
                throw th;
            }
        }
    }

    public fku(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
