package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class isw implements defpackage.ist {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.AUDIO.AFM");
    private static final android.media.AudioManager.OnAudioFocusChangeListener e = new defpackage.isv();
    public final defpackage.isu b;
    public volatile android.os.Handler c;
    public final defpackage.isz d;
    private final android.media.AudioManager f;
    private android.media.AudioFocusRequest g;
    private final java.lang.Object h = new java.lang.Object();

    public isw(android.media.AudioManager audioManager, defpackage.isu isuVar, defpackage.isz iszVar) {
        this.f = audioManager;
        this.b = isuVar;
        this.d = iszVar;
    }

    @Override // defpackage.ist
    public final void a() {
        ((defpackage.yqj) a.l().ai((char) 1294)).u("Abandon Android audio focus");
        synchronized (this.h) {
            android.media.AudioFocusRequest audioFocusRequest = this.g;
            if (audioFocusRequest != null) {
                ep$.ExternalSyntheticApiModelOutline1.m(this.f, audioFocusRequest);
                this.g = null;
            }
        }
    }

    @Override // defpackage.ist
    public final void b(int i) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 1297)).y("Request Android audio focus: %s", new defpackage.zkf(defpackage.zke.a, defpackage.ere.f(i)));
        int iD = d(i, new android.media.AudioAttributes.Builder().setUsage(0).setContentType(0).build());
        if (iD == 0) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 1299)).u("Got unexpected AUDIOFOCUS_REQUEST_FAILED");
        } else {
            if (iD == 1 || iD == 2) {
                return;
            }
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 1298)).w("Unrecognized focus hint in requestAndroidAudioFocus: %d", i);
        }
    }

    @Override // defpackage.ist
    public final boolean c() {
        return this.d.a() != 0;
    }

    public final int d(int i, android.media.AudioAttributes audioAttributes) {
        int iM$1;
        android.media.AudioFocusRequest audioFocusRequestM = ep$.ExternalSyntheticApiModelOutline1.m(ep$.ExternalSyntheticApiModelOutline1.m(ep$.ExternalSyntheticApiModelOutline1.m(ep$.ExternalSyntheticApiModelOutline1.m(new android.media.AudioFocusRequest.Builder(i), audioAttributes), true), e));
        synchronized (this.h) {
            this.g = audioFocusRequestM;
            iM$1 = ep$.ExternalSyntheticApiModelOutline1.m$1(this.f, audioFocusRequestM);
        }
        return iM$1;
    }
}
