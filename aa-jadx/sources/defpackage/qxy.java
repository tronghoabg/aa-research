package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qxy extends defpackage.ijw implements defpackage.qxz {
    private final java.lang.ref.WeakReference a;

    public qxy(defpackage.roz rozVar) {
        super("com.google.android.gms.car.ICarMessageCallback");
        this.a = new java.lang.ref.WeakReference(rozVar);
    }

    @Override // defpackage.qxz
    public final void e(int i, int i2, int i3) {
        defpackage.roz rozVar = (defpackage.roz) this.a.get();
        if (rozVar == null) {
            return;
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
        android.os.Handler handler = rozVar.c;
        handler.sendMessage(handler.obtainMessage(1, i, i2, numValueOf));
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            defpackage.ijx.d(parcel);
            e(i2, i3, i4);
        } else {
            if (i != 2) {
                return false;
            }
            int i5 = parcel.readInt();
            defpackage.ijx.d(parcel);
            f(i5);
        }
        return true;
    }

    @Override // defpackage.qxz
    public final void f(int i) {
        defpackage.roz rozVar = (defpackage.roz) this.a.get();
        if (rozVar == null) {
            return;
        }
        android.os.Handler handler = rozVar.c;
        handler.sendMessage(handler.obtainMessage(2, i, 0));
    }
}
