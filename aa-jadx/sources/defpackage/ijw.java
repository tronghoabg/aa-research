package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class ijw extends android.os.Binder implements android.os.IInterface {
    protected ijw(java.lang.String str) {
        attachInterface(this, str);
    }

    protected boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        return false;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return eu(i, parcel, parcel2);
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }
}
