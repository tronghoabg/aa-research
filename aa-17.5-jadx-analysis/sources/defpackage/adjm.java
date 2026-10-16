package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* loaded from: classes3.dex */
final class adjm implements Runnable {
    final adjk a;
    public final adjq b;
    private final Executor c;

    public adjm(Executor executor, adjk adjkVar, adjq adjqVar) {
        this.c = executor;
        this.a = adjkVar;
        this.b = adjqVar;
    }

    final void a() {
        try {
            this.c.execute(this);
        } catch (Throwable th) {
            adjq.c.logp(Level.INFO, "io.grpc.Context$ExecutableListener", "deliver", "Exception notifying context listener", th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
