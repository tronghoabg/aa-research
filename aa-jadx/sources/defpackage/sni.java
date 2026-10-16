package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sni extends defpackage.ijw implements defpackage.snj {
    public sni() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) defpackage.ijx.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
        defpackage.ijx.d(parcel);
        a(status);
        return true;
    }
}
