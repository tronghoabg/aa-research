package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rnd extends defpackage.ijw implements defpackage.rne {
    private final java.lang.ref.WeakReference a;

    public rnd(defpackage.iol iolVar) {
        super("com.google.android.gms.car.input.ICarProjectionInputServiceCallback");
        this.a = new java.lang.ref.WeakReference(iolVar);
    }

    @Override // defpackage.rne
    public final void e() {
        defpackage.iol iolVar = (defpackage.iol) this.a.get();
        if (iolVar != null) {
            iolVar.b.post(new defpackage.iks(iolVar, 9));
        }
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        e();
        parcel2.writeNoException();
        return true;
    }
}
