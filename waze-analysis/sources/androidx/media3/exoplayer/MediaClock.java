package androidx.media3.exoplayer;

import androidx.media3.common.PlaybackParameters;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface MediaClock {

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.exoplayer.MediaClock$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$hasSkippedSilenceSinceLastCall(MediaClock mediaClock) {
            return false;
        }
    }

    PlaybackParameters getPlaybackParameters();

    long getPositionUs();

    boolean hasSkippedSilenceSinceLastCall();

    void setPlaybackParameters(PlaybackParameters playbackParameters);
}
