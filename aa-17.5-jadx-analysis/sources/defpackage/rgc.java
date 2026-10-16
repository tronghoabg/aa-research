package defpackage;

import android.media.audiopolicy.AudioPolicy;
import com.google.android.gms.car.AudioFocusInfo;

/* loaded from: classes2.dex */
public final class rgc extends AudioPolicy.AudioPolicyFocusListener {
    private final rfx a;

    public rgc(rfx rfxVar) {
        this.a = rfxVar;
    }

    private static AudioFocusInfo a(android.media.AudioFocusInfo audioFocusInfo) {
        return new AudioFocusInfo(audioFocusInfo.getAttributes(), audioFocusInfo.getClientUid(), audioFocusInfo.getClientId(), audioFocusInfo.getPackageName(), audioFocusInfo.getGainRequest(), audioFocusInfo.getLossReceived(), audioFocusInfo.getFlags());
    }

    public final void onAudioFocusAbandon(android.media.AudioFocusInfo audioFocusInfo) {
        this.a.c(a(audioFocusInfo));
    }

    public final void onAudioFocusGrant(android.media.AudioFocusInfo audioFocusInfo, int i) {
        this.a.d(a(audioFocusInfo), i);
    }

    public final void onAudioFocusLoss(android.media.AudioFocusInfo audioFocusInfo, boolean z) {
        this.a.e(a(audioFocusInfo), z);
    }

    public final void onAudioFocusRequest(android.media.AudioFocusInfo audioFocusInfo, int i) {
        this.a.f(a(audioFocusInfo), i);
    }
}
