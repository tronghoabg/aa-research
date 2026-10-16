package defpackage;

import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class rdy extends qwf {
    private volatile boolean a;
    private volatile int b;
    private final Set c = new LinkedHashSet();
    private final sss d = new sss(Looper.getMainLooper());

    @Override // defpackage.qwg
    public final synchronized void a(int i) {
        if (omc.c("GH.MultiCarCxnListener", 3)) {
            rrd.d(3, "GH.MultiCarCxnListener", null, "Connection failure on binder thread. instance: %s", new zjd(zjc.a, this));
        }
        c();
    }

    @Override // defpackage.qwg
    public final synchronized void b(int i) {
        if (!this.a) {
            this.a = true;
            this.b = i;
            for (rcf rcfVar : this.c) {
                if (omc.c("GH.MultiCarCxnListener", 3)) {
                    zjc zjcVar = zjc.a;
                    rrd.d(3, "GH.MultiCarCxnListener", null, "onCarConnected() on binder thread. instance: %s, listener: %s", new zjd(zjcVar, this), new zjd(zjcVar, rcfVar));
                }
                this.d.post(new ira(rcfVar, i, 5));
            }
        } else if (omc.c("GH.MultiCarCxnListener", 3)) {
            rrd.d(3, "GH.MultiCarCxnListener", null, "Already connected on binder thread. Not notifying listeners. instance: %s", new zjd(zjc.a, this));
        }
    }

    @Override // defpackage.qwg
    public final synchronized void c() {
        if (this.a) {
            this.a = false;
            for (rcf rcfVar : this.c) {
                if (omc.c("GH.MultiCarCxnListener", 3)) {
                    zjc zjcVar = zjc.a;
                    rrd.d(3, "GH.MultiCarCxnListener", null, "onCarDisconnected() on binder thread. instance: %s, listener: %s", new zjd(zjcVar, this), new zjd(zjcVar, rcfVar));
                }
                sss sssVar = this.d;
                rcfVar.getClass();
                sssVar.post(new ral(rcfVar, 5));
            }
        } else if (omc.c("GH.MultiCarCxnListener", 3)) {
            rrd.d(3, "GH.MultiCarCxnListener", null, "Already disconnected on binder thread. Not notifying listeners. instance: %s", new zjd(zjc.a, this));
        }
    }

    public final synchronized void d() {
        if (omc.c("GH.MultiCarCxnListener", 3)) {
            rrd.d(3, "GH.MultiCarCxnListener", null, "Clearing out all listeners. instance: %s", new zjd(zjc.a, this));
        }
        this.c.clear();
    }

    public final synchronized void f(rcf rcfVar) {
        if (omc.c("GH.MultiCarCxnListener", 3)) {
            zjc zjcVar = zjc.a;
            rrd.d(3, "GH.MultiCarCxnListener", null, "Registering listener. instance: %s, listener: %s", new zjd(zjcVar, this), new zjd(zjcVar, rcfVar));
        }
        if (this.c.add(rcfVar) && this.a) {
            rcfVar.a(this.b);
        }
    }

    public final synchronized void g(rcf rcfVar) {
        if (omc.c("GH.MultiCarCxnListener", 3)) {
            zjc zjcVar = zjc.a;
            rrd.d(3, "GH.MultiCarCxnListener", null, "Unregistering listener. instance: %s, listener: %s", new zjd(zjcVar, this), new zjd(zjcVar, rcfVar));
        }
        this.c.remove(rcfVar);
    }
}
