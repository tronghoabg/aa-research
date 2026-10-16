package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rky extends defpackage.ijw implements defpackage.rkz {
    private final java.util.Set a;
    private final defpackage.stq b;
    private com.google.android.gms.car.display.CarDisplay c;

    public rky(byte[] bArr) {
        super("com.google.android.gms.car.display.manager.ICarDisplayChangedListener");
        this.a = new defpackage.zf(0);
        this.b = new defpackage.stq(android.os.Looper.getMainLooper());
    }

    public final synchronized void a() {
        this.a.clear();
    }

    public final synchronized void b(defpackage.shg shgVar) {
        this.a.add(shgVar);
        com.google.android.gms.car.display.CarDisplay carDisplay = this.c;
        if (carDisplay != null) {
            shgVar.c(carDisplay);
        }
    }

    public final synchronized void c(defpackage.shg shgVar) {
        this.a.remove(shgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rkz
    public final synchronized void e(com.google.android.gms.car.display.CarDisplay carDisplay) {
        defpackage.ze zeVar = new defpackage.ze((defpackage.zf) this.a);
        while (zeVar.hasNext()) {
            this.b.post(new defpackage.qnf((defpackage.shg) zeVar.next(), carDisplay, 11, (char[]) null));
        }
        this.c = carDisplay;
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.car.display.CarDisplay carDisplay = (com.google.android.gms.car.display.CarDisplay) defpackage.ijx.a(parcel, com.google.android.gms.car.display.CarDisplay.CREATOR);
        defpackage.ijx.d(parcel);
        e(carDisplay);
        parcel2.writeNoException();
        return true;
    }

    public rky() {
        throw null;
    }
}
