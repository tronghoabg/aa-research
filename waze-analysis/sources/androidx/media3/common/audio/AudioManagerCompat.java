package androidx.media3.common.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.BackgroundExecutor;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import com.google.d.b.an;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AudioManagerCompat {
    public static final int AUDIOFOCUS_GAIN = 1;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    public static final int AUDIOFOCUS_NONE = 0;
    private static final String TAG = "AudioManagerCompat";
    private static Context applicationContext;
    private static AudioManager audioManager;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AudioFocusGain {
    }

    private AudioManagerCompat() {
    }

    public static int abandonAudioFocusRequest(AudioManager audioManager2, AudioFocusRequestCompat audioFocusRequestCompat) {
        return audioManager2.abandonAudioFocusRequest(audioFocusRequestCompat.getAudioFocusRequest());
    }

    public static synchronized AudioManager getAudioManager(Context context) {
        final Context applicationContext2 = context.getApplicationContext();
        if (applicationContext != applicationContext2) {
            audioManager = null;
        }
        AudioManager audioManager2 = audioManager;
        if (audioManager2 != null) {
            return audioManager2;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
            final ConditionVariable conditionVariable = new ConditionVariable();
            BackgroundExecutor.get().execute(new Runnable() { // from class: androidx.media3.common.audio.AudioManagerCompat$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AudioManagerCompat.lambda$getAudioManager$0(applicationContext2, conditionVariable);
                }
            });
            conditionVariable.blockUninterruptible();
            AudioManager audioManager3 = audioManager;
            an.B(audioManager3);
            return audioManager3;
        }
        AudioManager audioManager4 = (AudioManager) applicationContext2.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        audioManager = audioManager4;
        an.B(audioManager4);
        return audioManager4;
    }

    public static int getStreamMaxVolume(AudioManager audioManager2, int i2) {
        return audioManager2.getStreamMaxVolume(i2);
    }

    public static int getStreamMinVolume(AudioManager audioManager2, int i2) {
        return audioManager2.getStreamMinVolume(i2);
    }

    public static int getStreamVolume(AudioManager audioManager2, int i2) {
        try {
            return audioManager2.getStreamVolume(i2);
        } catch (RuntimeException e2) {
            Log.w(TAG, "Could not retrieve stream volume for stream type " + i2, e2);
            return audioManager2.getStreamMaxVolume(i2);
        }
    }

    public static boolean isStreamMute(AudioManager audioManager2, int i2) {
        return audioManager2.isStreamMute(i2);
    }

    static /* synthetic */ void lambda$getAudioManager$0(Context context, ConditionVariable conditionVariable) {
        audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        conditionVariable.open();
    }

    public static int requestAudioFocus(AudioManager audioManager2, AudioFocusRequestCompat audioFocusRequestCompat) {
        return audioManager2.requestAudioFocus(audioFocusRequestCompat.getAudioFocusRequest());
    }
}
