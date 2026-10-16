package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class qvl extends ijn implements qvn {
    public qvl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarAudioStreamDiagnosticsListener");
    }

    @Override // defpackage.qvn
    public final void e(byte[] bArr) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeByteArray(bArr);
        gk(2, parcelGh);
    }
}
