package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class adyj implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public adyj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [aitf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        ajiu ajiuVarA;
        long jNanoTime;
        switch (this.b) {
            case 0:
                ((admr) this.a).b();
                return;
            case 1:
                adyg adygVar = ((adyd) this.a).b;
                if (adygVar.A) {
                    return;
                }
                adygVar.w.e();
                return;
            case 2:
                ((adzf) this.a).c.d(adnq.c.e("Handshake timeout exceeded"));
                return;
            case 3:
                try {
                    Object obj = this.a;
                    ajoa ajoaVar = ((aeal) obj).f;
                    if (ajoaVar != null) {
                        ajmy ajmyVar = ((aeal) obj).b;
                        long j = ajmyVar.b;
                        if (j > 0) {
                            ajoaVar.a(ajmyVar, j);
                        }
                    }
                } catch (IOException e) {
                    ((aeal) this.a).c.d(e);
                }
                try {
                    ajoa ajoaVar2 = ((aeal) this.a).f;
                    if (ajoaVar2 != null) {
                        ajoaVar2.close();
                    }
                } catch (IOException e2) {
                    ((aeal) this.a).c.d(e2);
                }
                try {
                    Socket socket = ((aeal) this.a).g;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (IOException e3) {
                    ((aeal) this.a).c.d(e3);
                    return;
                }
            case 4:
                adrn adrnVar = (adrn) this.a;
                adro adroVar = adrnVar.b;
                AtomicLong atomicLong = adroVar.c;
                long j2 = adrnVar.a;
                long jMax = Math.max(j2 + j2, j2);
                if (atomicLong.compareAndSet(j2, jMax)) {
                    adro.a.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{adroVar.b, Long.valueOf(jMax)});
                    return;
                }
                return;
            case 5:
                Object obj2 = this.a;
                synchronized (((aebe) obj2).m) {
                    ((aebe) obj2).z = Alert.DURATION_SHOW_INDEFINITELY;
                    woy.aa(((aebe) obj2).A.isEmpty(), "Pending streams detected during transport start. RPCs should not be started before transport is ready.");
                }
                aebe aebeVar = (aebe) this.a;
                aebeVar.o.execute(aebeVar.q);
                return;
            case 6:
                aiwx.b(this.a);
                return;
            default:
                Object obj3 = this.a;
                synchronized (obj3) {
                    ((ajix) obj3).c++;
                    ajiuVarA = ((ajix) obj3).a();
                }
                if (ajiuVarA == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                do {
                    ajiu ajiuVar = ajiuVarA;
                    try {
                        threadCurrentThread.setName(ajiuVar.a);
                        Object obj4 = this.a;
                        Logger logger = ((ajix) obj4).b;
                        ajiw ajiwVar = ajiuVar.b;
                        ajiwVar.getClass();
                        boolean zIsLoggable = logger.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            ahee.b(logger, ajiuVar, ajiwVar, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jA = ajiuVar.a();
                            if (zIsLoggable) {
                                ahee.b(logger, ajiuVar, ajiwVar, "finished run in " + ahee.a(System.nanoTime() - jNanoTime));
                            }
                            synchronized (obj4) {
                                ((ajix) obj4).c(ajiuVar, jA, true);
                                ajiuVarA = ((ajix) obj4).a();
                            }
                        } catch (Throwable th) {
                            if (zIsLoggable) {
                                ahee.b(logger, ajiuVar, ajiwVar, "failed a run in " + ahee.a(System.nanoTime() - jNanoTime));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            Object obj5 = this.a;
                            synchronized (obj5) {
                                ((ajix) obj5).c(ajiuVar, -1L, false);
                                if (!(th2 instanceof InterruptedException)) {
                                    throw th2;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } finally {
                            threadCurrentThread.setName(name);
                        }
                    }
                } while (ajiuVarA != null);
                return;
        }
    }
}
