package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qvh extends defpackage.ijw implements defpackage.qvi {
    public qvh() {
        super("com.google.android.gms.car.IAudioRecord");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            int iE = e();
            parcel2.writeNoException();
            parcel2.writeInt(iE);
        } else if (i == 2) {
            int i2 = parcel.readInt();
            defpackage.ijx.d(parcel);
            android.os.ParcelFileDescriptor parcelFileDescriptorF = f(i2);
            parcel2.writeNoException();
            defpackage.ijx.h(parcel2, parcelFileDescriptorF);
        } else {
            if (i != 3) {
                return false;
            }
            g();
            parcel2.writeNoException();
        }
        return true;
    }
}
