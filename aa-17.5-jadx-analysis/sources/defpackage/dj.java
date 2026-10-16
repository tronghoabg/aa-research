package defpackage;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes2.dex */
final class dj extends MediaController.Callback {
    private final WeakReference a;

    public dj(dl dlVar) {
        this.a = new WeakReference(dlVar);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        dl dlVar = (dl) this.a.get();
        if (dlVar != null) {
            int playbackType = playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            int i = AudioAttributesCompat.b;
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
            dlVar.a(new dn(playbackType));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        MediaSessionCompat.c(bundle);
        dl dlVar = (dl) this.a.get();
        if (dlVar != null) {
            dlVar.b(bundle);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        dl dlVar = (dl) this.a.get();
        if (dlVar != null) {
            dlVar.c(MediaMetadataCompat.d(mediaMetadata));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        dl dlVar = (dl) this.a.get();
        if (dlVar == null || dlVar.c != null) {
            return;
        }
        dlVar.d(PlaybackStateCompat.a(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        dl dlVar = (dl) this.a.get();
        if (dlVar != null) {
            dlVar.e(MediaSessionCompat.QueueItem.a(list));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        dl dlVar = (dl) this.a.get();
        if (dlVar != null) {
            dlVar.f();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        MediaSessionCompat.c(bundle);
    }
}
