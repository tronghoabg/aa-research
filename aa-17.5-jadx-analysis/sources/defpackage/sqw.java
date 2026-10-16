package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class sqw extends ijn implements IInterface {
    public sqw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int e() throws RemoteException {
        Parcel parcelGi = gi(6, gh());
        int i = parcelGi.readInt();
        parcelGi.recycle();
        return i;
    }
}
