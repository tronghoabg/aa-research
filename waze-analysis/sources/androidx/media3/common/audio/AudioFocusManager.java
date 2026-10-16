package androidx.media3.common.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.audio.AudioFocusRequestCompat;
import androidx.media3.common.util.Log;
import com.google.d.b.aj;
import com.google.d.b.an;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AudioFocusManager {
    private static final int AUDIO_FOCUS_STATE_HAVE_FOCUS = 2;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT = 3;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT_DUCK = 4;
    private static final int AUDIO_FOCUS_STATE_NOT_REQUESTED = 0;
    private static final int AUDIO_FOCUS_STATE_NO_FOCUS = 1;
    public static final int PLAYER_COMMAND_DO_NOT_PLAY = -1;
    public static final int PLAYER_COMMAND_PLAY_WHEN_READY = 1;
    public static final int PLAYER_COMMAND_WAIT_FOR_CALLBACK = 0;
    private static final String TAG = "AudioFocusManager";
    private static final float VOLUME_MULTIPLIER_DEFAULT = 1.0f;
    private static final float VOLUME_MULTIPLIER_DUCK = 0.2f;
    private AudioAttributes audioAttributes;
    private AudioFocusRequestCompat audioFocusRequest;
    private final aj<AudioManager> audioManager;
    private final Handler eventHandler;
    private int focusGainToRequest;
    private PlayerControl playerControl;
    private boolean rebuildAudioFocusRequest;
    private float volumeMultiplier = 1.0f;
    private int audioFocusState = 0;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface AudioFocusState {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerCommand {
    }

    /* compiled from: WazeSource */
    public interface PlayerControl {
        void executePlayerCommand(int i2);

        void setVolumeMultiplier(float f2);
    }

    public AudioFocusManager(final Context context, Looper looper, PlayerControl playerControl) {
        this.audioManager = an.a(new aj() { // from class: androidx.media3.common.audio.AudioFocusManager$$ExternalSyntheticLambda1
            @Override // com.google.d.b.aj
            public final Object get() {
                return AudioManagerCompat.getAudioManager(context);
            }
        });
        this.playerControl = playerControl;
        this.eventHandler = new Handler(looper);
    }

    private void abandonAudioFocusIfHeld() {
        int i2 = this.audioFocusState;
        if (i2 == 1 || i2 == 0 || this.audioFocusRequest == null) {
            return;
        }
        AudioManagerCompat.abandonAudioFocusRequest(this.audioManager.get(), this.audioFocusRequest);
    }

    private static int convertAudioAttributesToFocusGain(AudioAttributes audioAttributes) {
        if (audioAttributes == null) {
            return 0;
        }
        int i2 = audioAttributes.usage;
        switch (i2) {
            case 0:
                Log.w(TAG, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (audioAttributes.contentType == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                Log.w(TAG, "Unidentified audio usage: " + i2);
                return 0;
            case 16:
                return 4;
        }
    }

    private void executePlayerCommand(int i2) {
        PlayerControl playerControl = this.playerControl;
        if (playerControl != null) {
            playerControl.executePlayerCommand(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePlatformAudioFocusChange(int i2) {
        if (i2 == -3 || i2 == -2) {
            if (i2 != -2 && !willPauseWhenDucked()) {
                setAudioFocusState(4);
                return;
            } else {
                executePlayerCommand(0);
                setAudioFocusState(3);
                return;
            }
        }
        if (i2 == -1) {
            executePlayerCommand(-1);
            abandonAudioFocusIfHeld();
            setAudioFocusState(1);
        } else if (i2 == 1) {
            setAudioFocusState(2);
            executePlayerCommand(1);
        } else {
            Log.w(TAG, "Unknown focus change type: " + i2);
        }
    }

    private int requestAudioFocus() {
        if (this.audioFocusState == 2) {
            return 1;
        }
        int iRequestAudioFocusInternal = requestAudioFocusInternal();
        if (iRequestAudioFocusInternal == 1 || iRequestAudioFocusInternal == 2) {
            setAudioFocusState(2);
            return 1;
        }
        setAudioFocusState(1);
        return -1;
    }

    private int requestAudioFocusInternal() {
        AudioFocusRequestCompat audioFocusRequestCompat = this.audioFocusRequest;
        if (audioFocusRequestCompat == null || this.rebuildAudioFocusRequest) {
            AudioFocusRequestCompat.Builder builder = audioFocusRequestCompat == null ? new AudioFocusRequestCompat.Builder(this.focusGainToRequest) : audioFocusRequestCompat.buildUpon();
            boolean zWillPauseWhenDucked = willPauseWhenDucked();
            AudioAttributes audioAttributes = this.audioAttributes;
            an.B(audioAttributes);
            builder.setAudioAttributes(audioAttributes);
            builder.setWillPauseWhenDucked(zWillPauseWhenDucked);
            builder.setAcceptsDelayedFocusGain(true);
            builder.setOnAudioFocusChangeListener(new AudioFocusManager$$ExternalSyntheticLambda0(this), this.eventHandler);
            this.audioFocusRequest = builder.build();
            this.rebuildAudioFocusRequest = false;
        }
        return AudioManagerCompat.requestAudioFocus(this.audioManager.get(), this.audioFocusRequest);
    }

    private void setAudioFocusState(int i2) {
        if (this.audioFocusState == i2) {
            return;
        }
        this.audioFocusState = i2;
        float f2 = i2 == 4 ? 0.2f : 1.0f;
        if (this.volumeMultiplier != f2) {
            this.volumeMultiplier = f2;
            PlayerControl playerControl = this.playerControl;
            if (playerControl != null) {
                playerControl.setVolumeMultiplier(f2);
            }
        }
    }

    private boolean shouldHandleAudioFocus(int i2) {
        return i2 != 1 && this.focusGainToRequest == 1;
    }

    private boolean willPauseWhenDucked() {
        AudioAttributes audioAttributes = this.audioAttributes;
        return audioAttributes != null && audioAttributes.contentType == 1;
    }

    AudioManager.OnAudioFocusChangeListener getFocusListener() {
        return new AudioFocusManager$$ExternalSyntheticLambda0(this);
    }

    public float getVolumeMultiplier() {
        return this.volumeMultiplier;
    }

    public void release() {
        this.playerControl = null;
        abandonAudioFocusIfHeld();
        setAudioFocusState(0);
    }

    public void setAudioAttributes(AudioAttributes audioAttributes) {
        if (Objects.equals(this.audioAttributes, audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        int iConvertAudioAttributesToFocusGain = convertAudioAttributesToFocusGain(audioAttributes);
        this.focusGainToRequest = iConvertAudioAttributesToFocusGain;
        boolean z = true;
        if (iConvertAudioAttributesToFocusGain != 1 && iConvertAudioAttributesToFocusGain != 0) {
            z = false;
        }
        an.m(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int updateAudioFocus(boolean z, int i2) {
        if (!shouldHandleAudioFocus(i2)) {
            abandonAudioFocusIfHeld();
            setAudioFocusState(0);
            return 1;
        }
        if (z) {
            return requestAudioFocus();
        }
        int i3 = this.audioFocusState;
        if (i3 != 1) {
            return i3 != 3 ? 1 : 0;
        }
        return -1;
    }
}
