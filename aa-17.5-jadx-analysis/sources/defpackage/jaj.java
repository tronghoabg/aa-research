package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class jaj extends ijn implements jal {
    public jaj(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.carservice.car.senderprotocol.ICarGalMonitorProxy");
    }

    @Override // defpackage.jal
    public final void e(long j, int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeLong(j);
        parcelGh.writeInt(i);
        gj(1, parcelGh);
    }
}
