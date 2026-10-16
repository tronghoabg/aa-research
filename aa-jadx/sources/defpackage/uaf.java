package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uaf {
    public defpackage.uas a;
    public final java.util.List c = new java.util.concurrent.CopyOnWriteArrayList();
    public final defpackage.plv b = new defpackage.plv(50, defpackage.plt.INDOOR_ACTIVE_LEVELS, null, null);

    public final defpackage.uau a(defpackage.uas uasVar) {
        if (uasVar == null) {
            return null;
        }
        defpackage.acku ackuVar = (defpackage.acku) this.b.h(uasVar.b);
        if (ackuVar == null) {
            return uasVar.a();
        }
        int i = ackuVar.a;
        if (i != -1) {
            return uasVar.b(i);
        }
        return null;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("[focused: %s]", this.a);
    }
}
