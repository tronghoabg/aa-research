package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vei implements com.google.android.libraries.maps.MapsAppCheckTokenCallback {
    final /* synthetic */ defpackage.vfq a;

    public vei(defpackage.vfq vfqVar) {
        this.a = vfqVar;
    }

    @Override // com.google.android.libraries.maps.MapsAppCheckTokenCallback
    public final void onFailure() {
        try {
            this.a.e();
        } catch (android.os.RemoteException e) {
            android.util.Log.e(com.google.android.libraries.maps.MapsApiSettings.a, "Failed to call AppCheck token failure callback", e);
        }
    }

    @Override // com.google.android.libraries.maps.MapsAppCheckTokenCallback
    public final void onSuccess(java.lang.String str) {
        try {
            this.a.f(str);
        } catch (android.os.RemoteException e) {
            android.util.Log.e(com.google.android.libraries.maps.MapsApiSettings.a, "Failed to call AppCheck token success callback", e);
        }
    }
}
