package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qvt extends defpackage.ijw implements qvu {
    private final defpackage.stq a;
    private final defpackage.qvl b;
    private final java.util.Queue c;
    private defpackage.qrm d;

    public qvt(defpackage.qvl qvlVar) {
        super("com.google.android.gms.car.ICarActivityStartProcessor");
        this.a = new defpackage.stq(android.os.Looper.getMainLooper());
        this.c = new java.util.ArrayDeque();
        this.b = qvlVar;
    }

    private final void d() {
        if (this.d != null) {
            defpackage.qvl qvlVar = this.b;
            qvlVar.getClass();
            defpackage.rps.l(new defpackage.rev(qvlVar, 4));
            this.d = null;
        }
    }

    public final synchronized void a() {
        if (defpackage.rrx.e("GH.PrxyActStartHndlr", 3)) {
            defpackage.rrx.d(3, "GH.PrxyActStartHndlr", null, "Clearing local CarActivityStartListener %s", this.d);
        }
        d();
    }

    public final synchronized void b(defpackage.qrm qrmVar) throws android.os.RemoteException {
        short[] sArr = null;
        if (defpackage.rrx.e("GH.PrxyActStartHndlr", 3)) {
            defpackage.rrx.d(3, "GH.PrxyActStartHndlr", null, "Registering local CarActivityStartListener %s", qrmVar);
        }
        if (this.d != null) {
            throw new java.lang.IllegalStateException("Attempted registration of multiple CarActivityStartListeners");
        }
        defpackage.qvl qvlVar = this.b;
        qvlVar.bf();
        qvlVar.aL(this);
        this.d = qrmVar;
        java.util.Queue queue = this.c;
        java.util.Iterator it = queue.iterator();
        while (it.hasNext()) {
            defpackage.rbz.j(new defpackage.qnf(qrmVar, (android.content.Intent) it.next(), 20, sArr));
        }
        queue.clear();
    }

    public final synchronized void c(defpackage.qrm qrmVar) {
        if (defpackage.rrx.e("GH.PrxyActStartHndlr", 3)) {
            defpackage.rrx.d(3, "GH.PrxyActStartHndlr", null, "Unregistering local CarActivityStartListener %s", qrmVar);
        }
        defpackage.qrm qrmVar2 = this.d;
        if (qrmVar2 != null && qrmVar2 != qrmVar) {
            throw new java.lang.IllegalStateException("Attempting to unregister wrong CarActivityStartListener");
        }
        d();
    }

    public final synchronized void e(android.content.Intent intent) {
        defpackage.qrm qrmVar = this.d;
        short[] sArr = null;
        if (qrmVar != null) {
            this.a.post(new defpackage.qnf(qrmVar, intent, 19, sArr));
            return;
        }
        if (defpackage.rrx.e("GH.PrxyActStartHndlr", 4)) {
            defpackage.rrx.d(4, "GH.PrxyActStartHndlr", null, "Trying to send processAndStart but there is no registered CarActivityStartProcessor. Queuing intent: %s", intent);
        }
        this.c.add(intent);
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        android.content.Intent intent = (android.content.Intent) defpackage.ijx.a(parcel, android.content.Intent.CREATOR);
        defpackage.ijx.d(parcel);
        e(intent);
        return true;
    }

    public qvt() {
        throw null;
    }
}
