package defpackage;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.libraries.maps.LocationSource;
import com.google.android.libraries.maps.model.RuntimeRemoteException;

/* loaded from: classes3.dex */
final class vcy implements LocationSource.OnLocationChangedListener {
    final /* synthetic */ vgg a;

    public vcy(vgg vggVar) {
        this.a = vggVar;
    }

    @Override // com.google.android.libraries.maps.LocationSource.OnLocationChangedListener
    public final void onLocationChanged(Location location) {
        try {
            this.a.f(location);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
