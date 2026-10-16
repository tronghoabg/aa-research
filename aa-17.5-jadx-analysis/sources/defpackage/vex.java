package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.CameraPosition;

/* loaded from: classes3.dex */
public final class vex extends ijn implements vez {
    public vex(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnCameraChangeListener");
    }

    @Override // defpackage.vez
    public final void a(CameraPosition cameraPosition) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, cameraPosition);
        gj(1, parcelGh);
    }
}
