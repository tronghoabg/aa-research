package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ito extends android.media.audiopolicy.AudioPolicy.AudioPolicyFocusListener {
    private final defpackage.itk a;

    public ito(defpackage.itk itkVar) {
        this.a = itkVar;
    }

    private static com.google.android.gms.car.AudioFocusInfo a(android.media.AudioFocusInfo audioFocusInfo) {
        return new com.google.android.gms.car.AudioFocusInfo(audioFocusInfo.getAttributes(), audioFocusInfo.getClientUid(), audioFocusInfo.getClientId(), audioFocusInfo.getPackageName(), audioFocusInfo.getGainRequest(), audioFocusInfo.getLossReceived(), audioFocusInfo.getFlags());
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
