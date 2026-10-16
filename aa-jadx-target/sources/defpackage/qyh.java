package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qyh extends defpackage.ijw implements qyi {
    private final java.lang.ref.WeakReference a;

    public qyh(defpackage.rpb rpbVar) {
        super("com.google.android.gms.car.ICarNavigationStatusEventListener");
        this.a = new java.lang.ref.WeakReference(rpbVar);
    }

    public final void e(int i, int i2, int i3, int i4, int i5) {
        defpackage.rpb rpbVar = (defpackage.rpb) this.a.get();
        if (rpbVar != null) {
            if (defpackage.omv.c("CAR.SENSOR", 3)) {
                defpackage.rrx.d(3, "CAR.SENSOR", null, "onStart(%d, %d, %d, %d, %d)", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i5));
            }
            rpbVar.b = i;
            rpbVar.c = i2;
            rpbVar.d = i3;
            rpbVar.e = i4;
            rpbVar.f = i5;
            android.os.Handler handler = rpbVar.g;
            handler.sendMessage(handler.obtainMessage(1));
        }
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            defpackage.ijx.d(parcel);
            e(i2, i3, i4, i5, i6);
        } else {
            if (i != 2) {
                return false;
            }
            f();
        }
        return true;
    }

    public final void f() {
        defpackage.rpb rpbVar = (defpackage.rpb) this.a.get();
        if (rpbVar != null) {
            android.os.Handler handler = rpbVar.g;
            handler.sendMessage(handler.obtainMessage(2));
        }
    }
}
