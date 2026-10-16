package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dj extends android.media.session.MediaController.Callback {
    private final java.lang.ref.WeakReference a;

    public dj(defpackage.dl dlVar) {
        this.a = new java.lang.ref.WeakReference(dlVar);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(android.media.session.MediaController.PlaybackInfo playbackInfo) {
        defpackage.dl dlVar = (defpackage.dl) this.a.get();
        if (dlVar != null) {
            int playbackType = playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            int i = androidx.media.AudioAttributesCompat.b;
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
            dlVar.a(new defpackage.dn(playbackType));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(android.os.Bundle bundle) {
        android.support.v4.media.session.MediaSessionCompat.c(bundle);
        defpackage.dl dlVar = (defpackage.dl) this.a.get();
        if (dlVar != null) {
            dlVar.b(bundle);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(android.media.MediaMetadata mediaMetadata) {
        defpackage.dl dlVar = (defpackage.dl) this.a.get();
        if (dlVar != null) {
            dlVar.c(android.support.v4.media.MediaMetadataCompat.d(mediaMetadata));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(android.media.session.PlaybackState playbackState) {
        defpackage.dl dlVar = (defpackage.dl) this.a.get();
        if (dlVar == null || dlVar.c != null) {
            return;
        }
        dlVar.d(android.support.v4.media.session.PlaybackStateCompat.a(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(java.util.List list) {
        defpackage.dl dlVar = (defpackage.dl) this.a.get();
        if (dlVar != null) {
            dlVar.e(android.support.v4.media.session.MediaSessionCompat.QueueItem.a(list));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(java.lang.CharSequence charSequence) {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        defpackage.dl dlVar = (defpackage.dl) this.a.get();
        if (dlVar != null) {
            dlVar.f();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(java.lang.String str, android.os.Bundle bundle) {
        android.support.v4.media.session.MediaSessionCompat.c(bundle);
    }
}
