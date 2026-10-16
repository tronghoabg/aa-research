package androidx.media;

import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes3.dex */
public final class AudioManagerCompat {
    public static final int AUDIOFOCUS_GAIN = 1;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    private static final String TAG = "AudioManCompat";

    /* compiled from: WazeSource */
    class Api26Impl {
        private Api26Impl() {
        }

        static int abandonAudioFocusRequest(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }

        static int requestAudioFocus(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }

    /* compiled from: WazeSource */
    class Api28Impl {
        private Api28Impl() {
        }

        static int getStreamMinVolume(AudioManager audioManager, int i2) {
            return audioManager.getStreamMinVolume(i2);
        }
    }

    private AudioManagerCompat() {
    }

    public static int abandonAudioFocusRequest(AudioManager audioManager, AudioFocusRequestCompat audioFocusRequestCompat) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (audioFocusRequestCompat != null) {
            return Api26Impl.abandonAudioFocusRequest(audioManager, audioFocusRequestCompat.getAudioFocusRequest());
        }
        throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }

    public static int getStreamMaxVolume(AudioManager audioManager, int i2) {
        return audioManager.getStreamMaxVolume(i2);
    }

    public static int getStreamMinVolume(AudioManager audioManager, int i2) {
        return Api28Impl.getStreamMinVolume(audioManager, i2);
    }

    public static boolean isVolumeFixed(AudioManager audioManager) {
        return audioManager.isVolumeFixed();
    }

    public static int requestAudioFocus(AudioManager audioManager, AudioFocusRequestCompat audioFocusRequestCompat) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (audioFocusRequestCompat != null) {
            return Api26Impl.requestAudioFocus(audioManager, audioFocusRequestCompat.getAudioFocusRequest());
        }
        throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }
}
