package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class veu extends ijn implements vew {
    public veu(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IMapsAppCheckTokenProvider");
    }

    @Override // defpackage.vew
    public final void e(vet vetVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vetVar);
        gj(2, parcelGh);
    }
}
