package defpackage;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;
import com.google.android.libraries.maps.model.RuntimeRemoteException;

/* loaded from: classes3.dex */
final class zvv extends std {
    final /* synthetic */ zvw a;

    public zvv(zvw zvwVar) {
        this.a = zvwVar;
    }

    @Override // defpackage.std
    public final void a(LocationResult locationResult) {
        Location locationA = locationResult.a();
        vgg vggVar = this.a.d;
        if (vggVar != null) {
            try {
                vggVar.e(new sqi(locationA));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }
}
