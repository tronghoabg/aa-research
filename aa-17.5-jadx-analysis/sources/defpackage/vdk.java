package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.libraries.maps.MapsApiSettings;
import com.google.android.libraries.maps.MapsAppCheckTokenCallback;

/* loaded from: classes3.dex */
public final class vdk implements MapsAppCheckTokenCallback {
    final /* synthetic */ vet a;

    public vdk(vet vetVar) {
        this.a = vetVar;
    }

    @Override // com.google.android.libraries.maps.MapsAppCheckTokenCallback
    public final void onFailure() {
        try {
            this.a.e();
        } catch (RemoteException e) {
            Log.e(MapsApiSettings.a, "Failed to call AppCheck token failure callback", e);
        }
    }

    @Override // com.google.android.libraries.maps.MapsAppCheckTokenCallback
    public final void onSuccess(String str) {
        try {
            this.a.f(str);
        } catch (RemoteException e) {
            Log.e(MapsApiSettings.a, "Failed to call AppCheck token success callback", e);
        }
    }
}
