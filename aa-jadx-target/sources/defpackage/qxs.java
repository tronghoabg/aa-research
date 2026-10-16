package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qxs extends defpackage.ijw implements qxt {
    private final java.lang.ref.WeakReference a;

    public qxs(defpackage.qsr qsrVar) {
        super("com.google.android.gms.car.ICarMediaPlaybackStatusEventListener");
        this.a = new java.lang.ref.WeakReference(qsrVar);
    }

    public final void e(int i) {
        defpackage.qsr qsrVar = (defpackage.qsr) this.a.get();
        if (qsrVar != null) {
            android.os.Handler handler = (android.os.Handler) qsrVar.b;
            handler.sendMessage(handler.obtainMessage(3, i, 0));
        }
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        int i2 = parcel.readInt();
        defpackage.ijx.d(parcel);
        e(i2);
        return true;
    }
}
