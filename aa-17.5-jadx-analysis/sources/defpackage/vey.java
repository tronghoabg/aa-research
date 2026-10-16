package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.CameraPosition;

/* loaded from: classes3.dex */
public abstract class vey extends ijo implements vez {
    public vey() {
        super("com.google.android.libraries.maps.internal.IOnCameraChangeListener");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) ijp.a(parcel, CameraPosition.CREATOR);
        ijp.d(parcel);
        a(cameraPosition);
        parcel2.writeNoException();
        return true;
    }
}
