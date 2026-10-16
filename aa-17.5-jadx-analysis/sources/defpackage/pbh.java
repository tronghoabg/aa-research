package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class pbh extends ijn implements pbj {
    public pbh(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.wireless.setup.service.IWirelessSetupSharedServiceCallback");
    }

    @Override // defpackage.pbj
    public final void e(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        gj(3, parcelGh);
    }
}
