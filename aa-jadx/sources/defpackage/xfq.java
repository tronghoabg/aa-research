package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xfq extends defpackage.ijw implements defpackage.xfr {
    public xfq() {
        super("com.google.android.projection.gearhead.sdk.ICarSystemUiCallback");
    }

    @Override // defpackage.xfr
    public final void e(byte b) {
        throw null;
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                defpackage.ijx.d(parcel);
                return true;
            case 2:
                defpackage.ijx.d(parcel);
                return true;
            case 3:
                defpackage.ijx.d(parcel);
                return true;
            case 4:
                parcel.readInt();
                defpackage.ijx.d(parcel);
                return true;
            case 5:
                parcel.readInt();
                defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                return true;
            case 6:
                defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                return true;
            case 7:
                parcel.readByte();
                defpackage.ijx.d(parcel);
                throw null;
            default:
                return false;
        }
    }
}
