package com.google.ar.imp.core.media;

/* JADX INFO: loaded from: classes3.dex */
class OnPreparedListener implements android.media.MediaPlayer.OnPreparedListener {
    private final long a;

    public OnPreparedListener(long j) {
        this.a = j;
    }

    private static native void nOnPrepared(long j);

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(android.media.MediaPlayer mediaPlayer) {
        nOnPrepared(this.a);
    }
}
