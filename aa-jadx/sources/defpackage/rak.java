package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rak extends defpackage.ijw implements defpackage.ral {
    private final android.os.ParcelFileDescriptor a;

    public rak(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        super("com.google.android.gms.car.IFdBinder");
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.ral
    public final android.os.ParcelFileDescriptor e() {
        return this.a;
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        android.os.ParcelFileDescriptor parcelFileDescriptor = this.a;
        parcel2.writeNoException();
        defpackage.ijx.h(parcel2, parcelFileDescriptor);
        return true;
    }
}
