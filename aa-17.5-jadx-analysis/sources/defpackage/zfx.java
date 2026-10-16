package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class zfx extends AtomicReference implements Executor, Runnable {
    zfz a;
    Executor b;
    Runnable c;
    Thread d;

    public zfx(Executor executor, zfz zfzVar) {
        super(zfw.a);
        this.b = executor;
        this.a = zfzVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == zfw.b) {
            this.b = null;
            this.a = null;
            return;
        }
        this.d = Thread.currentThread();
        try {
            zfz zfzVar = this.a;
            zfzVar.getClass();
            zfy zfyVar = zfzVar.a;
            if (zfyVar.a == this.d) {
                this.a = null;
                if (zfyVar.b != null) {
                    throw new IllegalStateException();
                }
                zfyVar.b = runnable;
                Executor executor = this.b;
                executor.getClass();
                zfyVar.c = executor;
                this.b = null;
            } else {
                Executor executor2 = this.b;
                executor2.getClass();
                this.b = null;
                this.c = runnable;
                executor2.execute(this);
            }
        } finally {
            this.d = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r0;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.d) {
            Runnable runnable = this.c;
            runnable.getClass();
            this.c = null;
            runnable.run();
            return;
        }
        zfy zfyVar = new zfy();
        zfyVar.a = threadCurrentThread;
        zfz zfzVar = this.a;
        zfzVar.getClass();
        zfzVar.a = zfyVar;
        this.a = null;
        try {
            Runnable runnable2 = this.c;
            runnable2.getClass();
            this.c = null;
            runnable2.run();
            while (true) {
                ?? r3 = zfyVar.b;
                if (r3 == 0 || (r0 = zfyVar.c) == 0) {
                    break;
                }
                zfyVar.b = null;
                zfyVar.c = null;
                r0.execute(r3);
            }
        } finally {
            zfyVar.a = null;
        }
    }
}
