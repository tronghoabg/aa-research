package com.google.ar.imp.core.media;

/* JADX INFO: loaded from: classes3.dex */
class OnCompletionListener implements android.media.MediaPlayer.OnCompletionListener {
    private final long a;

    public OnCompletionListener(long j) {
        this.a = j;
    }

    private static native void nOnCompletion(long j);

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(android.media.MediaPlayer mediaPlayer) {
        nOnCompletion(this.a);
    }
}
