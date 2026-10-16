package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class vio extends ijo implements vip {
    public vio() {
        super("com.google.android.libraries.maps.internal.ISnapshotReadyCallback");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        sqj sqhVar;
        if (i == 1) {
            Bitmap bitmap = (Bitmap) ijp.a(parcel, Bitmap.CREATOR);
            ijp.d(parcel);
            a(bitmap);
        } else {
            if (i != 2) {
                return false;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                sqhVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
            }
            ijp.d(parcel);
            b(sqhVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
