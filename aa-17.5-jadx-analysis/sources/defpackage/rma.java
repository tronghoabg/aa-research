package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class rma extends ijn implements rmc {
    public rma(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.input.ICarEditableListener");
    }

    @Override // defpackage.rmc
    public final void e(int i, int i2, int i3, int i4) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        parcelGh.writeInt(i3);
        parcelGh.writeInt(i4);
        gj(1, parcelGh);
    }
}
