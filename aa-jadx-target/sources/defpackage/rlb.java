package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rlb extends defpackage.ijw implements defpackage.rlc {
    private final java.util.Set a;
    private final defpackage.stq b;

    public rlb(byte[] bArr) {
        super("com.google.android.gms.car.display.manager.ICarDisplayContentInsetsChangedListener");
        this.a = new defpackage.zf(0);
        this.b = new defpackage.stq(android.os.Looper.getMainLooper());
    }

    public final synchronized void a() {
        this.a.clear();
    }

    public final synchronized void b(defpackage.shg shgVar) {
        this.a.add(shgVar);
    }

    public final synchronized void c(defpackage.shg shgVar) {
        this.a.remove(shgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rlc
    public final void e(com.google.android.gms.car.display.CarDisplayId carDisplayId, android.graphics.Rect rect) {
        defpackage.ze zeVar = new defpackage.ze((defpackage.zf) this.a);
        while (zeVar.hasNext()) {
            this.b.post(new defpackage.qjn(zeVar.next(), (java.lang.Object) carDisplayId, (java.lang.Object) rect, 5, (byte[]) null));
        }
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.car.display.CarDisplayId carDisplayId = (com.google.android.gms.car.display.CarDisplayId) defpackage.ijx.a(parcel, com.google.android.gms.car.display.CarDisplayId.CREATOR);
        android.graphics.Rect rect = (android.graphics.Rect) defpackage.ijx.a(parcel, android.graphics.Rect.CREATOR);
        defpackage.ijx.d(parcel);
        e(carDisplayId, rect);
        parcel2.writeNoException();
        return true;
    }

    public rlb() {
        throw null;
    }
}
