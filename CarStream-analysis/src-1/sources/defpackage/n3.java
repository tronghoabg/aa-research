package defpackage;

import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class n3 extends MediaBrowserCompat.ConnectionCallback {
    public final /* synthetic */ s3 a;

    public n3(s3 s3Var) {
        this.a = s3Var;
    }

    @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
    public final void onConnected() {
        s3 s3Var = this.a;
        try {
            MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(s3Var.getCarContext(), s3Var.a.getSessionToken());
            s3Var.b = mediaControllerCompat;
            mediaControllerCompat.registerCallback(s3Var.d);
            s3Var.h();
            s3Var.k();
        } catch (Exception e) {
            String.valueOf(e);
        }
    }

    @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
    public final void onConnectionFailed() {
        this.a.e("phien tu choi noi");
    }
}
