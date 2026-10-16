package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class scu extends defpackage.ijw implements defpackage.scv {
    private android.os.IBinder a;
    private final boolean b;

    public scu(android.os.IBinder iBinder) {
        super("com.google.android.gms.carsetup.ILocalBinderTransport");
        this.a = iBinder;
        this.b = true;
    }

    @Override // defpackage.scv
    public final android.os.IBinder e() {
        if (android.os.Binder.getCallingPid() != android.os.Process.myPid()) {
            throw new java.lang.RuntimeException("Non-local call");
        }
        android.os.IBinder iBinder = this.a;
        if (this.b) {
            this.a = null;
        }
        return iBinder;
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        android.os.IBinder iBinderE = e();
        parcel2.writeNoException();
        parcel2.writeStrongBinder(iBinderE);
        return true;
    }
}
