package com.google.ar.imp.core.media;

import android.media.MediaPlayer;

/* loaded from: classes3.dex */
class OnCompletionListener implements MediaPlayer.OnCompletionListener {
    private final long a;

    public OnCompletionListener(long j) {
        this.a = j;
    }

    private static native void nOnCompletion(long j);

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        nOnCompletion(this.a);
    }
}
