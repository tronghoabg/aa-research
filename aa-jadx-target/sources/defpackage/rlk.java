package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rlk extends defpackage.ijw implements rll {
    private final java.util.Set a;
    private final defpackage.stq b;

    public rlk(byte[] bArr) {
        super("com.google.android.gms.car.display.manager.ICarDisplayUiFeaturesChangedListener");
        this.a = new defpackage.zf(0);
        this.b = new defpackage.stq(android.os.Looper.getMainLooper());
    }

    public final synchronized void a() {
        this.a.clear();
    }

    public final synchronized void b(rdb rdbVar) {
        this.a.add(rdbVar);
    }

    public final synchronized void c(rdb rdbVar) {
        this.a.remove(rdbVar);
    }

    public final void e(com.google.android.gms.car.display.CarDisplayId carDisplayId, com.google.android.gms.car.display.CarDisplayUiFeatures carDisplayUiFeatures) {
        defpackage.ze zeVar = new defpackage.ze((defpackage.zf) this.a);
        while (zeVar.hasNext()) {
            this.b.post(new defpackage.qnf((rdb) zeVar.next(), carDisplayUiFeatures, 13, (char[]) null));
        }
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 2) {
            return false;
        }
        com.google.android.gms.car.display.CarDisplayId carDisplayId = (com.google.android.gms.car.display.CarDisplayId) defpackage.ijx.a(parcel, com.google.android.gms.car.display.CarDisplayId.CREATOR);
        com.google.android.gms.car.display.CarDisplayUiFeatures carDisplayUiFeatures = (com.google.android.gms.car.display.CarDisplayUiFeatures) defpackage.ijx.a(parcel, com.google.android.gms.car.display.CarDisplayUiFeatures.CREATOR);
        defpackage.ijx.d(parcel);
        e(carDisplayId, carDisplayUiFeatures);
        parcel2.writeNoException();
        return true;
    }

    public rlk() {
        throw null;
    }
}
