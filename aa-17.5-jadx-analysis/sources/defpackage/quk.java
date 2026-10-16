package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class quk extends ijn implements qum {
    public quk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IAudioRecord");
    }

    @Override // defpackage.qum
    public final int e() throws RemoteException {
        Parcel parcelGi = gi(1, gh());
        int i = parcelGi.readInt();
        parcelGi.recycle();
        return i;
    }

    @Override // defpackage.qum
    public final ParcelFileDescriptor f(int i) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(2048);
        Parcel parcelGi = gi(2, parcelGh);
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ijp.a(parcelGi, ParcelFileDescriptor.CREATOR);
        parcelGi.recycle();
        return parcelFileDescriptor;
    }

    @Override // defpackage.qum
    public final void g() throws RemoteException {
        gj(3, gh());
    }
}
