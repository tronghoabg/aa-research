package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dwf extends android.os.Binder implements defpackage.dwg {
    final /* synthetic */ android.support.v4.os.ResultReceiver a;

    public dwf(android.support.v4.os.ResultReceiver resultReceiver) {
        this.a = resultReceiver;
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    @Override // defpackage.dwg
    public final void a(int i, android.os.Bundle bundle) {
        android.support.v4.os.ResultReceiver resultReceiver = this.a;
        android.os.Handler handler = resultReceiver.b;
        if (handler != null) {
            handler.post(new defpackage.ec(resultReceiver, i, bundle));
        } else {
            resultReceiver.a(i, bundle);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.os.IResultReceiver");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        a(parcel.readInt(), (android.os.Bundle) parcel.readTypedObject(android.os.Bundle.CREATOR));
        return true;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }
}
