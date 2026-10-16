package com.google.ar.imp.core.media;

/* JADX INFO: loaded from: classes3.dex */
public class OnErrorListener implements android.media.MediaPlayer.OnErrorListener {
    private final long a;

    public OnErrorListener(long j) {
        this.a = j;
    }

    private static native boolean nOnError(long j, int i, int i2);

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        return nOnError(this.a, i, i2);
    }
}
