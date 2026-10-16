package defpackage;

import android.location.Location;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IAppHost;
import androidx.car.app.media.IMediaPlaybackHost;
import androidx.car.app.media.OpenMicrophoneResponse;
import androidx.car.app.serialization.Bundleable;

/* loaded from: classes2.dex */
public final /* synthetic */ class ps implements qo {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ps(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.qo
    public final Object a(Object obj) throws RemoteException {
        int i = this.b;
        if (i == 0) {
            ((IAppHost) obj).sendLocation((Location) this.a);
            return null;
        }
        if (i != 1) {
            ((IMediaPlaybackHost) obj).registerMediaSessionToken((Bundleable) this.a);
            return null;
        }
        try {
            Bundleable bundleableOpenMicrophone = ((IAppHost) obj).openMicrophone(new Bundleable(this.a));
            if (bundleableOpenMicrophone == null) {
                return null;
            }
            return (OpenMicrophoneResponse) bundleableOpenMicrophone.a();
        } catch (xr e) {
            Log.e("CarApp", "Cannot open microphone", e);
            return null;
        }
    }
}
