package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class rjc extends ijn implements rje {
    public rjc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.diagnostics.IDataCollectedCallback");
    }

    @Override // defpackage.rje
    public final void e(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, parcelFileDescriptor);
        gk(1, parcelGh);
    }
}
