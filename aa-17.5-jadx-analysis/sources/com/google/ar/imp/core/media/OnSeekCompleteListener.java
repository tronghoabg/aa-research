package com.google.ar.imp.core.media;

import android.media.MediaPlayer;

/* loaded from: classes3.dex */
class OnSeekCompleteListener implements MediaPlayer.OnSeekCompleteListener {
    private final long a;

    public OnSeekCompleteListener(long j) {
        this.a = j;
    }

    private static native void nSeekComplete(long j);

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        nSeekComplete(this.a);
    }
}
