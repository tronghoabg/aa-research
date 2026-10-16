package defpackage;

import java.lang.Thread;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public final class advf implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public advf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            qnd qndVar = ((qmh) obj).e;
            if (qndVar != null) {
                qndVar.p(6, "Job execution failed", th, null, null);
                return;
            }
            return;
        }
        adkn adknVar = ((advv) obj).g;
        advv.a.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + String.valueOf(adknVar) + "] Uncaught exception in the SynchronizationContext. Panic!", th);
        try {
            if (((advv) obj).t) {
                return;
            }
            ((advv) obj).t = true;
            try {
                ((advv) obj).g(true);
                ((advv) obj).l(false);
            } finally {
                ((advv) obj).m(new adkz(adlc.a(adnq.l.e("Panic! This is a bug!").d(th))));
                ((advv) obj).H.b(null);
                ((advv) obj).F.a(4, "PANIC! Entering TRANSIENT_FAILURE");
                ((advv) obj).o.a(adjh.c);
            }
        } catch (Throwable th2) {
            adkn adknVar2 = ((advv) this.a).g;
            advv.a.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + String.valueOf(adknVar2) + "] Uncaught exception while panicking", th2);
        }
    }
}
