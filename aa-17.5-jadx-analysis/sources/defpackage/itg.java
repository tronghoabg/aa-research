package defpackage;

import android.media.audiopolicy.AudioPolicy;
import com.google.android.gms.car.AudioFocusInfo;

/* loaded from: classes.dex */
final class itg extends AudioPolicy.AudioPolicyFocusListener {
    private final itc a;

    public itg(itc itcVar) {
        this.a = itcVar;
    }

    private static AudioFocusInfo a(android.media.AudioFocusInfo audioFocusInfo) {
        return new AudioFocusInfo(audioFocusInfo.getAttributes(), audioFocusInfo.getClientUid(), audioFocusInfo.getClientId(), audioFocusInfo.getPackageName(), audioFocusInfo.getGainRequest(), audioFocusInfo.getLossReceived(), audioFocusInfo.getFlags());
    }

    public final void onAudioFocusAbandon(android.media.AudioFocusInfo audioFocusInfo) {
        a(audioFocusInfo);
    }

    public final void onAudioFocusGrant(android.media.AudioFocusInfo audioFocusInfo, int i) {
        this.a.c(a(audioFocusInfo), i);
    }

    public final void onAudioFocusLoss(android.media.AudioFocusInfo audioFocusInfo, boolean z) {
        this.a.d(a(audioFocusInfo), z);
    }

    public final void onAudioFocusRequest(android.media.AudioFocusInfo audioFocusInfo, int i) {
        a(audioFocusInfo);
    }
}
