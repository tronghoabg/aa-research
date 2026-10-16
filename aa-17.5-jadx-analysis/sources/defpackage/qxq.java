package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class qxq extends ijn implements qxs {
    public qxq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarPhoneStatusEventListener");
    }

    @Override // defpackage.qxs
    public final void e(KeyEvent keyEvent) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, keyEvent);
        gk(3, parcelGh);
    }

    @Override // defpackage.qxs
    public final void f(String str, String str2, int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeString(str);
        parcelGh.writeString(str2);
        parcelGh.writeInt(i);
        gk(2, parcelGh);
    }
}
