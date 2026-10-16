package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qzi extends defpackage.ijw implements defpackage.qzj {
    private final java.util.Set a;
    private final defpackage.stq b;

    public qzi(byte[] bArr) {
        super("com.google.android.gms.car.ICarUiInfoChangedListener");
        this.a = new defpackage.zf(0);
        this.b = new defpackage.stq(android.os.Looper.getMainLooper());
    }

    public final synchronized void a() {
        this.a.clear();
    }

    public final synchronized void b(defpackage.rdf rdfVar) {
        this.a.add(rdfVar);
    }

    public final synchronized void c(defpackage.rdf rdfVar) {
        this.a.remove(rdfVar);
    }

    @Override // defpackage.qzj
    public final synchronized void e(com.google.android.gms.car.CarUiInfo carUiInfo) {
        defpackage.ze zeVar = new defpackage.ze((defpackage.zf) this.a);
        while (zeVar.hasNext()) {
            this.b.post(new defpackage.qnf((defpackage.rdf) zeVar.next(), carUiInfo, 14, (short[]) null));
        }
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.car.CarUiInfo carUiInfo = (com.google.android.gms.car.CarUiInfo) defpackage.ijx.a(parcel, com.google.android.gms.car.CarUiInfo.CREATOR);
        defpackage.ijx.d(parcel);
        e(carUiInfo);
        return true;
    }

    public qzi() {
        throw null;
    }
}
