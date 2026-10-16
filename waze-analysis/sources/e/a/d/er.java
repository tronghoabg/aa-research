package e.a.d;

import j$.util.Objects;
import java.lang.Thread;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class er implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fp f46896a;

    er(fp fpVar) {
        Objects.requireNonNull(fpVar);
        this.f46896a = fpVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        fp fpVar = this.f46896a;
        fp.f46944a.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + String.valueOf(fpVar.c()) + "] Uncaught exception in the SynchronizationContext. Panic!", th);
        try {
            fpVar.V(th);
        } catch (Throwable th2) {
            fp fpVar2 = this.f46896a;
            fp.f46944a.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + String.valueOf(fpVar2.c()) + "] Uncaught exception while panicking", th2);
        }
    }
}
