package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class rty extends ijn implements rua {
    public rty(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.senderprotocol.ICarGalMonitorProxy");
    }

    @Override // defpackage.rua
    public final void e(long j, int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        parcelGh.writeInt(i);
        gj(1, parcelGh);
    }
}
