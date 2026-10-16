package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class rwq extends ijn implements rws {
    public rwq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.startup.IProxySensorsEndPointCallback");
    }

    @Override // defpackage.rws
    public final void a(int i, byte[] bArr) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeByteArray(bArr);
        gj(1, parcelGh);
    }

    @Override // defpackage.rws
    public final void b() throws RemoteException {
        gj(2, gh());
    }

    @Override // defpackage.rws
    public final void c() throws RemoteException {
        gj(3, gh());
    }
}
