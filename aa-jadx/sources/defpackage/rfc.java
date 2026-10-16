package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rfc extends defpackage.ref {
    private defpackage.qvl l;

    public rfc(android.os.Looper looper, final java.lang.Runnable runnable) {
        super(looper);
        this.f = new defpackage.rps(new java.util.function.Consumer() { // from class: rfb
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                android.os.RemoteException remoteException = (android.os.RemoteException) obj;
                if (defpackage.omv.c("CAR.CLIENT", 3)) {
                    defpackage.rrx.a("CAR.CLIENT", remoteException, "carServiceExceptionHandler invoked");
                }
                java.lang.Runnable runnable2 = runnable;
                this.a.G();
                runnable2.run();
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ref
    public final synchronized defpackage.qvl C() {
        defpackage.qvl qvlVar;
        qvlVar = this.l;
        if (qvlVar == null) {
            throw new java.lang.IllegalStateException("WrapperCarClient not connected.");
        }
        return qvlVar;
    }

    @Override // defpackage.ref
    public final synchronized void G() {
        super.G();
        this.l = null;
    }

    public final synchronized void O(defpackage.qvl qvlVar) {
        this.l = qvlVar;
        if (qvlVar != null) {
            E();
        }
    }

    public final boolean P() {
        return this.l != null;
    }
}
