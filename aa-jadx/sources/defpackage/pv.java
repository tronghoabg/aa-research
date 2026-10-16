package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pv implements defpackage.qt {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pv(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.qt
    public final java.lang.Object a(java.lang.Object obj) throws android.os.RemoteException {
        int i = this.b;
        if (i == 0) {
            ((androidx.car.app.IAppHost) obj).sendLocation((android.location.Location) this.a);
            return null;
        }
        if (i != 1) {
            ((androidx.car.app.media.IMediaPlaybackHost) obj).registerMediaSessionToken((androidx.car.app.serialization.Bundleable) this.a);
            return null;
        }
        try {
            androidx.car.app.serialization.Bundleable bundleableOpenMicrophone = ((androidx.car.app.IAppHost) obj).openMicrophone(new androidx.car.app.serialization.Bundleable(this.a));
            if (bundleableOpenMicrophone == null) {
                return null;
            }
            return (androidx.car.app.media.OpenMicrophoneResponse) bundleableOpenMicrophone.a();
        } catch (defpackage.xy e) {
            android.util.Log.e("CarApp", "Cannot open microphone", e);
            return null;
        }
    }
}
