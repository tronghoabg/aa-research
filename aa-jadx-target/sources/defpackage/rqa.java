package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rqa extends defpackage.ijw implements defpackage.rqb {
    public final defpackage.qvl a;
    private final java.util.Set b;
    private final java.util.Map c;
    private boolean d;
    private final defpackage.stq e;

    public rqa(defpackage.qvl qvlVar) {
        super("com.google.android.gms.car.lifecycle.ICarDisplayLayoutUpdateCompleteListener");
        this.b = new defpackage.zf(0);
        this.c = new java.util.HashMap();
        this.e = new defpackage.stq(android.os.Looper.getMainLooper());
        this.a = qvlVar;
    }

    private final void d() {
        defpackage.rps.l(new defpackage.rev(this, 0));
        this.d = false;
    }

    public final synchronized void a() {
        if (defpackage.rrx.e("GH.MpCarDispUpdateLstnr", 3)) {
            defpackage.rrx.d(3, "GH.MpCarDispUpdateLstnr", null, "Clearing local CarDisplayLayoutUpdateCompleteListener %s", this.b);
        }
        this.b.clear();
        if (this.d) {
            d();
        }
    }

    public final synchronized void b(defpackage.wyz wyzVar) throws android.os.RemoteException {
        if (defpackage.rrx.e("GH.MpCarDispUpdateLstnr", 3)) {
            defpackage.rrx.d(3, "GH.MpCarDispUpdateLstnr", null, "Registering local CarDisplayLayoutUpdateCompleteListener %s", wyzVar);
        }
        java.util.Set set = this.b;
        defpackage.ysr.bk(!set.contains(wyzVar), "Attempted to re-register a CarDisplayLayoutUpdateCompleteListener");
        java.util.Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            this.e.post(new defpackage.qnf(wyzVar, (java.util.Map.Entry) it.next(), 12, (char[]) null));
        }
        set.add(wyzVar);
        if (this.d) {
            return;
        }
        this.a.aN(this);
        this.d = true;
    }

    public final synchronized void c(defpackage.wyz wyzVar) {
        java.util.Set set = this.b;
        if (!set.remove(wyzVar)) {
            throw new java.lang.IllegalStateException("Attempted to unregister listener that was never registered");
        }
        if (set.isEmpty() && this.d) {
            d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rqb
    public final synchronized void e(java.lang.String str, com.google.android.gms.car.display.CarDisplayId carDisplayId) throws android.os.RemoteException {
        defpackage.ze zeVar = new defpackage.ze((defpackage.zf) this.b);
        while (zeVar.hasNext()) {
            defpackage.wyz wyzVar = (defpackage.wyz) zeVar.next();
            java.util.UUID uuidFromString = java.util.UUID.fromString(str);
            this.c.put(carDisplayId, uuidFromString);
            this.e.post(new defpackage.imx(wyzVar, uuidFromString, carDisplayId, 7));
        }
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 2) {
            return false;
        }
        java.lang.String string = parcel.readString();
        com.google.android.gms.car.display.CarDisplayId carDisplayId = (com.google.android.gms.car.display.CarDisplayId) defpackage.ijx.a(parcel, com.google.android.gms.car.display.CarDisplayId.CREATOR);
        defpackage.ijx.d(parcel);
        e(string, carDisplayId);
        return true;
    }

    public rqa() {
        throw null;
    }
}
