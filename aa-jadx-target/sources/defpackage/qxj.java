package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qxj extends defpackage.ijw implements defpackage.qxk {
    final /* synthetic */ defpackage.nrm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxj(defpackage.nrm nrmVar) {
        super("com.google.android.gms.car.ICarGestureListener");
        this.a = nrmVar;
    }

    @Override // defpackage.qxk
    public final void e(com.google.android.gms.car.GestureDirection gestureDirection) {
        gestureDirection.getClass();
        defpackage.nrm nrmVar = this.a;
        nrmVar.e.post(new defpackage.mbx(gestureDirection, nrmVar, 16));
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 2) {
            return false;
        }
        com.google.android.gms.car.GestureDirection gestureDirection = (com.google.android.gms.car.GestureDirection) defpackage.ijx.a(parcel, com.google.android.gms.car.GestureDirection.CREATOR);
        defpackage.ijx.d(parcel);
        e(gestureDirection);
        return true;
    }
}
