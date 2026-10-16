package androidx.media3.common.audio;

import android.media.AudioManager;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final /* synthetic */ class AudioFocusManager$$ExternalSyntheticLambda0 implements AudioManager.OnAudioFocusChangeListener {
    public /* synthetic */ AudioFocusManager f$0;

    public /* synthetic */ AudioFocusManager$$ExternalSyntheticLambda0(AudioFocusManager audioFocusManager) {
        this.f$0 = audioFocusManager;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i2) {
        this.f$0.handlePlatformAudioFocusChange(i2);
    }
}
