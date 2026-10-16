package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface AudioOutput {

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.exoplayer.audio.AudioOutput$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$setPlayerId(AudioOutput audioOutput, PlayerId playerId) {
        }
    }

    /* compiled from: WazeSource */
    public interface Listener {
        void onOffloadDataRequest();

        void onOffloadPresentationEnded();

        void onPositionAdvancing(long j2);

        void onReleased();

        void onUnderrun();
    }

    /* compiled from: WazeSource */
    public final class WriteException extends Exception {
        public final int errorCode;
        public final boolean isRecoverable;

        public WriteException(int i2, boolean z) {
            super("AudioOutput write failed: " + i2);
            this.isRecoverable = z;
            this.errorCode = i2;
        }
    }

    void addListener(Listener listener);

    void attachAuxEffect(int i2);

    boolean canReuseAudioOutput(AudioOutputProvider.OutputConfig outputConfig, AudioOutputProvider.FormatConfig formatConfig, AudioOutputProvider.OutputConfig outputConfig2);

    void flush();

    int getAudioSessionId();

    long getBufferSizeInFrames();

    PlaybackParameters getPlaybackParameters();

    long getPositionUs();

    int getSampleRate();

    boolean isOffloadedPlayback();

    boolean isStalled();

    void pause();

    void play();

    void release();

    void removeListener(Listener listener);

    void setAuxEffectSendLevel(float f2);

    void setOffloadDelayPadding(int i2, int i3);

    void setOffloadEndOfStream();

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    void setPlayerId(PlayerId playerId);

    void setPreferredDevice(AudioDeviceInfo audioDeviceInfo);

    void setVolume(float f2);

    void stop();

    boolean write(ByteBuffer byteBuffer, int i2, long j2);
}
