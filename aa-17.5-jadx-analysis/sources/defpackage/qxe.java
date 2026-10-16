package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class qxe extends ijn implements qxg {
    public qxe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarMicrophoneDiagnosticsListener");
    }

    @Override // defpackage.qxg
    public final void e(byte[] bArr) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeByteArray(bArr);
        gk(2, parcelGh);
    }
}
