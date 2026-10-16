package com.google.ar.imp.core.media;

/* JADX INFO: loaded from: classes3.dex */
class OnSeekCompleteListener implements android.media.MediaPlayer.OnSeekCompleteListener {
    private final long a;

    public OnSeekCompleteListener(long j) {
        this.a = j;
    }

    private static native void nSeekComplete(long j);

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(android.media.MediaPlayer mediaPlayer) {
        nSeekComplete(this.a);
    }
}
