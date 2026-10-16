package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class hvr {
    final Map a;
    public final ReferenceQueue b;
    public volatile boolean c;
    public volatile hvp d;

    public hvr() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new hvo());
        this.a = new HashMap();
        this.b = new ReferenceQueue();
        executorServiceNewSingleThreadExecutor.execute(new gnu(this, 16, null));
    }

    public final synchronized hwr a(hui huiVar) {
        hvq hvqVar = (hvq) this.a.get(huiVar);
        if (hvqVar == null) {
            return null;
        }
        hwr hwrVar = (hwr) hvqVar.get();
        if (hwrVar == null) {
            c(hvqVar);
        }
        return hwrVar;
    }

    public final synchronized void b(hui huiVar, hwr hwrVar) {
        hvq hvqVar = (hvq) this.a.put(huiVar, new hvq(huiVar, hwrVar, this.b));
        if (hvqVar != null) {
            hvqVar.a();
        }
    }

    public final void c(hvq hvqVar) {
        synchronized (this) {
            this.a.remove(hvqVar.a);
            if (hvqVar.b) {
                hwx hwxVar = hvqVar.c;
            }
        }
    }

    final synchronized void d(hui huiVar) {
        hvq hvqVar = (hvq) this.a.remove(huiVar);
        if (hvqVar != null) {
            hvqVar.a();
        }
    }
}
