package androidx.media3.common.audio;

import androidx.media3.common.PlaybackParameters;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface AudioProcessorChain {
    PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters);

    boolean applySkipSilenceEnabled(boolean z);

    AudioProcessor[] getAudioProcessors();

    long getMediaDuration(long j2);

    long getSkippedOutputFrameCount();
}
