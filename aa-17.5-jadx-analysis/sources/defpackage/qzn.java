package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qzn extends ijn implements qzp {
    public qzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IFdBinder");
    }

    @Override // defpackage.qzp
    public final ParcelFileDescriptor e() throws RemoteException {
        Parcel parcelGi = gi(1, gh());
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ijp.a(parcelGi, ParcelFileDescriptor.CREATOR);
        parcelGi.recycle();
        return parcelFileDescriptor;
    }
}
