package L1;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public abstract class b {
    public static AudioFocusRequest a(int i5, AudioAttributes audioAttributes, boolean z2, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        return new AudioFocusRequest.Builder(i5).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z2).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }
}
