package androidx.media3.exoplayer;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PlaybackLooperProvider {
    private HandlerThread internalPlaybackThread;
    private final Object lock;
    private Looper playbackLooper;
    private int referenceCount;

    public PlaybackLooperProvider(Looper looper) {
        this.lock = new Object();
        this.playbackLooper = looper;
        this.internalPlaybackThread = null;
        this.referenceCount = 0;
    }

    public Looper obtainLooper() {
        Looper looper;
        synchronized (this.lock) {
            looper = this.playbackLooper;
            if (looper == null) {
                boolean z = false;
                if (this.referenceCount == 0 && this.internalPlaybackThread == null) {
                    z = true;
                }
                an.u(z);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.internalPlaybackThread = handlerThread;
                handlerThread.start();
                looper = this.internalPlaybackThread.getLooper();
                this.playbackLooper = looper;
            }
            this.referenceCount++;
        }
        return looper;
    }

    public void releaseLooper() {
        HandlerThread handlerThread;
        synchronized (this.lock) {
            an.u(this.referenceCount > 0);
            int i2 = this.referenceCount - 1;
            this.referenceCount = i2;
            if (i2 == 0 && (handlerThread = this.internalPlaybackThread) != null) {
                handlerThread.quit();
                this.internalPlaybackThread = null;
                this.playbackLooper = null;
            }
        }
    }

    public PlaybackLooperProvider() {
        this(null);
    }
}
