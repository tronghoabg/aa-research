package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qwy extends defpackage.ijw implements defpackage.qwz {
    public qwy() {
        super("com.google.android.gms.car.ICarCallback");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            parcel.readInt();
            defpackage.ijx.d(parcel);
            throw new java.lang.UnsupportedOperationException();
        }
        if (i != 2) {
            return false;
        }
        com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter = (com.google.android.gms.common.data.BitmapTeleporter) defpackage.ijx.a(parcel, com.google.android.gms.common.data.BitmapTeleporter.CREATOR);
        defpackage.ijx.d(parcel);
        e(bitmapTeleporter);
        return true;
    }
}
