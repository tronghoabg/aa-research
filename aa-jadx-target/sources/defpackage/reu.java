package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class reu extends defpackage.qxb {
    private volatile boolean a;
    private volatile int b;
    private final java.util.Set c = new java.util.LinkedHashSet();
    private final defpackage.stq d = new defpackage.stq(android.os.Looper.getMainLooper());

    @Override // defpackage.qxc
    public final synchronized void a(int i) {
        if (defpackage.omv.c("GH.MultiCarCxnListener", 3)) {
            defpackage.rrx.d(3, "GH.MultiCarCxnListener", null, "Connection failure on binder thread. instance: %s", new defpackage.zkf(defpackage.zke.a, this));
        }
        c();
    }

    @Override // defpackage.qxc
    public final synchronized void b(int i) {
        if (!this.a) {
            this.a = true;
            this.b = i;
            for (defpackage.rda rdaVar : this.c) {
                if (defpackage.omv.c("GH.MultiCarCxnListener", 3)) {
                    defpackage.zke zkeVar = defpackage.zke.a;
                    defpackage.rrx.d(3, "GH.MultiCarCxnListener", null, "onCarConnected() on binder thread. instance: %s, listener: %s", new defpackage.zkf(zkeVar, this), new defpackage.zkf(zkeVar, rdaVar));
                }
                this.d.post(new defpackage.irj(rdaVar, i, 4));
            }
        } else if (defpackage.omv.c("GH.MultiCarCxnListener", 3)) {
            defpackage.rrx.d(3, "GH.MultiCarCxnListener", null, "Already connected on binder thread. Not notifying listeners. instance: %s", new defpackage.zkf(defpackage.zke.a, this));
        }
    }

    @Override // defpackage.qxc
    public final synchronized void c() {
        if (this.a) {
            this.a = false;
            for (defpackage.rda rdaVar : this.c) {
                if (defpackage.omv.c("GH.MultiCarCxnListener", 3)) {
                    defpackage.zke zkeVar = defpackage.zke.a;
                    defpackage.rrx.d(3, "GH.MultiCarCxnListener", null, "onCarDisconnected() on binder thread. instance: %s, listener: %s", new defpackage.zkf(zkeVar, this), new defpackage.zkf(zkeVar, rdaVar));
                }
                defpackage.stq stqVar = this.d;
                rdaVar.getClass();
                stqVar.post(new defpackage.qth(rdaVar, 11));
            }
        } else if (defpackage.omv.c("GH.MultiCarCxnListener", 3)) {
            defpackage.rrx.d(3, "GH.MultiCarCxnListener", null, "Already disconnected on binder thread. Not notifying listeners. instance: %s", new defpackage.zkf(defpackage.zke.a, this));
        }
    }

    public final synchronized void d() {
        if (defpackage.omv.c("GH.MultiCarCxnListener", 3)) {
            defpackage.rrx.d(3, "GH.MultiCarCxnListener", null, "Clearing out all listeners. instance: %s", new defpackage.zkf(defpackage.zke.a, this));
        }
        this.c.clear();
    }

    public final synchronized void f(defpackage.rda rdaVar) {
        if (defpackage.omv.c("GH.MultiCarCxnListener", 3)) {
            defpackage.zke zkeVar = defpackage.zke.a;
            defpackage.rrx.d(3, "GH.MultiCarCxnListener", null, "Registering listener. instance: %s, listener: %s", new defpackage.zkf(zkeVar, this), new defpackage.zkf(zkeVar, rdaVar));
        }
        if (this.c.add(rdaVar) && this.a) {
            rdaVar.a(this.b);
        }
    }

    public final synchronized void g(defpackage.rda rdaVar) {
        if (defpackage.omv.c("GH.MultiCarCxnListener", 3)) {
            defpackage.zke zkeVar = defpackage.zke.a;
            defpackage.rrx.d(3, "GH.MultiCarCxnListener", null, "Unregistering listener. instance: %s, listener: %s", new defpackage.zkf(zkeVar, this), new defpackage.zkf(zkeVar, rdaVar));
        }
        this.c.remove(rdaVar);
    }
}
