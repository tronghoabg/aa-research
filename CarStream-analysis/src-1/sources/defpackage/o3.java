package defpackage;

import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class o3 extends MediaControllerCompat.Callback {
    public final /* synthetic */ s3 a;

    public o3(s3 s3Var) {
        this.a = s3Var;
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.Callback
    public final void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        s3 s3Var = this.a;
        Handler handler = s3Var.m;
        p3 p3Var = s3Var.e;
        handler.removeCallbacks(p3Var);
        handler.postDelayed(p3Var, 250L);
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.Callback
    public final void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        s3 s3Var = this.a;
        Handler handler = s3Var.m;
        p3 p3Var = s3Var.e;
        handler.removeCallbacks(p3Var);
        handler.postDelayed(p3Var, 250L);
    }

    @Override // android.support.v4.media.session.MediaControllerCompat.Callback
    public final void onSessionDestroyed() {
        s3 s3Var = this.a;
        Handler handler = s3Var.m;
        p3 p3Var = s3Var.e;
        handler.removeCallbacks(p3Var);
        handler.postDelayed(p3Var, 250L);
    }
}
