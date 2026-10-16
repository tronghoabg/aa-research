package okhttp3.internal.b;

import h.g.b.x;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f55972a;

    d(e eVar) {
        this.f55972a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVarB;
        long jNanoTime;
        while (true) {
            e eVar = this.f55972a;
            synchronized (eVar) {
                aVarB = eVar.b();
            }
            if (aVarB == null) {
                return;
            }
            c cVarD = aVarB.d();
            x.c(cVarD);
            boolean zIsLoggable = e.f55974b.isLoggable(Level.FINE);
            if (zIsLoggable) {
                jNanoTime = System.nanoTime();
                com.waze.view.popups.b.b.j(aVarB, cVarD, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                e.d(eVar, aVarB);
                if (zIsLoggable) {
                    com.waze.view.popups.b.b.j(aVarB, cVarD, "finished run in ".concat(String.valueOf(com.waze.view.popups.b.b.i(System.nanoTime() - jNanoTime))));
                }
            } finally {
            }
        }
    }
}
