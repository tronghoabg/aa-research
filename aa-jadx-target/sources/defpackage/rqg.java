package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rqg extends defpackage.ijw implements defpackage.rqh {
    private final java.lang.ref.WeakReference a;

    public rqg(defpackage.rqm rqmVar) {
        super("com.google.android.gms.car.lifetime.IProjectionLifetimeCallback");
        this.a = new java.lang.ref.WeakReference(rqmVar);
    }

    @Override // defpackage.rqh
    public final void e(int i) {
        if (defpackage.rrx.e("CAR.PROJECTION.PLSCM", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PLSCM", null, "Binder:onProjectionLifetimeStateChanged(state:%s)", java.lang.Integer.valueOf(i));
        }
        defpackage.rqm rqmVar = (defpackage.rqm) this.a.get();
        if (rqmVar == null) {
            return;
        }
        defpackage.rbz.h(new defpackage.rhh(rqmVar, i, 4, null));
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 2) {
            return false;
        }
        int i2 = parcel.readInt();
        defpackage.ijx.d(parcel);
        e(i2);
        return true;
    }
}
