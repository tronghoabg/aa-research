package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class vek extends ijn implements vem {
    public vek(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.ILocationSourceDelegate");
    }

    @Override // defpackage.vem
    public final void a(vgg vggVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, vggVar);
        gj(1, parcelGh);
    }

    @Override // defpackage.vem
    public final void b() throws RemoteException {
        gj(2, gh());
    }
}
