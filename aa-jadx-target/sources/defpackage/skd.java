package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class skd {
    public final java.lang.Object a;
    public boolean b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public skd() {
        this.a = new java.lang.Object();
        this.c = new java.util.ArrayDeque();
        this.d = new java.util.ArrayDeque();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, jbv, rxi] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, jbu] */
    public final defpackage.rxi a(defpackage.jbw jbwVar, defpackage.rxl rxlVar) throws android.os.RemoteException {
        synchronized (this.d) {
            boolean z = this.b;
            ?? r2 = this.c;
            if (z) {
                return r2;
            }
            if (jbwVar.a(r2) != 1) {
                this.a.aF(defpackage.zaj.PROTOCOL_WRONG_CONFIGURATION, defpackage.zak.NO_SENSORS, "No sensors");
                return null;
            }
            this.b = true;
            ((defpackage.jlf) r2).f(rxlVar);
            jbwVar.j(new jqs(this, 0));
            return r2;
        }
    }

    public skd(defpackage.jbu jbuVar) {
        this.d = new java.lang.Object();
        this.a = jbuVar;
        this.c = new defpackage.jlf(jbuVar);
    }

    public skd(defpackage.ngb ngbVar, defpackage.cvl cvlVar, defpackage.bam bamVar) {
        this.a = ngbVar;
        this.d = cvlVar;
        this.c = bamVar;
        this.b = true;
    }
}
