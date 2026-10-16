package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rkv extends defpackage.ijw implements defpackage.rkw {
    private final defpackage.yhe a;

    public rkv(defpackage.yhe yheVar) {
        super("com.google.android.gms.car.display.manager.ICarDisplayActionsController");
        defpackage.ysr.bk(!yheVar.isEmpty(), "No car displays are attached. Displays have not been discovered or car is disconnected/disconnecting.");
        this.a = yheVar;
    }

    public final defpackage.ivi a(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        defpackage.ivc ivcVar = (defpackage.ivc) this.a.get(carDisplayId);
        ivcVar.getClass();
        defpackage.ivi iviVar = ivcVar.o;
        iviVar.getClass();
        return iviVar;
    }

    @Override // defpackage.rkw
    public final void e(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        defpackage.ysr.bn(carDisplayId.equals(com.google.android.gms.car.display.CarDisplayId.a), "requestResizeDisplayLarger must be called on the primary display, not valid for carDisplayId: %s.", carDisplayId);
        defpackage.rbz.h(new defpackage.hie(this, carDisplayId, 9));
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 2) {
            com.google.android.gms.car.display.CarDisplayId carDisplayId = (com.google.android.gms.car.display.CarDisplayId) defpackage.ijx.a(parcel, com.google.android.gms.car.display.CarDisplayId.CREATOR);
            defpackage.ijx.d(parcel);
            f(carDisplayId);
            return true;
        }
        if (i != 3) {
            return false;
        }
        com.google.android.gms.car.display.CarDisplayId carDisplayId2 = (com.google.android.gms.car.display.CarDisplayId) defpackage.ijx.a(parcel, com.google.android.gms.car.display.CarDisplayId.CREATOR);
        defpackage.ijx.d(parcel);
        e(carDisplayId2);
        return true;
    }

    @Override // defpackage.rkw
    public final void f(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        defpackage.ysr.bn(carDisplayId.equals(com.google.android.gms.car.display.CarDisplayId.a), "requestResizeDisplaySmaller must be called on the primary display, not valid for carDisplayId: %s.", carDisplayId);
        defpackage.rbz.h(new defpackage.hie(this, carDisplayId, 10));
    }
}
