package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rov {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public rov(defpackage.qwn qwnVar, android.os.Looper looper) throws android.os.RemoteException {
        if (defpackage.omv.c("CAR.BT", 3)) {
            defpackage.rrx.a("CAR.BT", null, "CarBluetoothConnectionManager");
        }
        this.a = qwnVar;
        this.b = new defpackage.qwp(looper);
        java.lang.Integer num = (java.lang.Integer) new defpackage.nub((java.lang.Integer) defpackage.rps.f(new defpackage.res(this, 7))).i(-2);
        if (num.intValue() != 0) {
            defpackage.rrx.d(5, "CAR.BT", null, "CarBluetoothConnectionManager initialization error: %d", num);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    public final void a(java.lang.Exception exc) throws defpackage.qst, rlo {
        if (exc instanceof android.os.RemoteException) {
            if (defpackage.omv.c("CAR.BT", 4)) {
                defpackage.rrx.d(4, "CAR.BT", exc, "RemoteException from car service: %s", exc.getMessage());
            }
            ((defpackage.qwp) this.b).a();
            throw new rlo((android.os.RemoteException) exc);
        }
        if (!(exc instanceof java.lang.IllegalStateException)) {
            throw new java.lang.RuntimeException(exc);
        }
        defpackage.oml.G((java.lang.IllegalStateException) exc);
    }

    public final java.lang.String b(java.lang.String str) {
        return ((java.lang.String) this.a).concat(str);
    }

    public final void c(java.lang.String str, java.lang.Throwable th) {
        android.util.Log.e((java.lang.String) this.b, b(str), th);
    }

    public final void d(java.lang.String str) {
        android.util.Log.e((java.lang.String) this.b, b(str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, tqx] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, tqx] */
    public final synchronized void e(java.lang.Runnable runnable) {
        for (txf txfVar : this.a) {
            ?? r2 = txfVar.c;
            java.lang.Object obj = txfVar.b;
            if (r2 != obj) {
                txfVar.c = obj;
                ?? r1 = txfVar.c;
                if (r1 != 0) {
                    r1.i();
                }
                if (r2 != 0) {
                    r2.f();
                }
            }
        }
        if (runnable != null) {
            java.lang.Object obj2 = this.b;
            ((defpackage.gkc) obj2).m(runnable);
            ((defpackage.gkc) obj2).l();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized void f(txf txfVar) {
        this.a.remove(txfVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, tqx] */
    public final synchronized void g(java.lang.Runnable runnable) {
        for (txf txfVar : this.a) {
            java.lang.Object obj = txfVar.a;
            ?? r3 = txfVar.b;
            if (obj != r3) {
                if (r3 != 0 && r3 != txfVar.c) {
                    r3.f();
                }
                txfVar.b = txfVar.a;
            }
        }
        java.lang.Runnable sbjVar = new sbj(this, runnable, 19, (byte[]) null);
        if (uve.b()) {
            sbjVar.run();
            return;
        }
        java.lang.Object obj2 = this.b;
        ((defpackage.gkc) obj2).m(sbjVar);
        ((defpackage.gkc) obj2).l();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final txf h() {
        txf txfVar = new txf(this);
        synchronized (this) {
            this.a.add(txfVar);
        }
        return txfVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aclm, java.lang.Object] */
    public final tvv i() {
        ?? r0 = this.b;
        if (r0 == 0) {
            return null;
        }
        return (tvv) r0.a();
    }

    public final android.graphics.Bitmap j(java.lang.String str) {
        return (android.graphics.Bitmap) ((j$.util.concurrent.ConcurrentHashMap) this.a).get(str);
    }

    public rov(trb trbVar, tpm tpmVar) {
        this.a = trbVar;
        this.b = tpmVar;
    }

    public rov(defpackage.gkc gkcVar) {
        new java.util.concurrent.atomic.AtomicBoolean(false);
        new java.util.ArrayList();
        this.a = new java.util.ArrayList();
        this.b = gkcVar;
    }

    public rov(defpackage.aclm aclmVar, tnm tnmVar) {
        this.b = aclmVar;
        this.a = tnmVar;
    }

    public rov(java.lang.String str) {
        this.a = str;
        this.b = "Auth";
        for (int i = 2; i <= 7 && !android.util.Log.isLoggable((java.lang.String) this.b, i); i++) {
        }
    }

    public rov() {
        this.b = new java.util.concurrent.atomic.AtomicLong();
        this.a = new j$.util.concurrent.ConcurrentHashMap();
    }
}
