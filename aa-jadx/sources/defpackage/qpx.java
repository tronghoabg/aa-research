package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class qpx extends defpackage.ijw implements android.os.IInterface {
    public qpx() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    public void a(java.lang.String str) throws android.os.RemoteException {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            defpackage.ijx.d(parcel);
            throw new java.lang.UnsupportedOperationException();
        }
        if (i != 2) {
            return false;
        }
        java.lang.String string = parcel.readString();
        defpackage.ijx.d(parcel);
        a(string);
        parcel2.writeNoException();
        return true;
    }
}
