package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class rfq implements rfp {
    public static final ypf a = ols.R("CAR.AUDIO");
    public static final AudioManager.OnAudioFocusChangeListener b = new iol(6);
    public volatile Handler c;
    public final rfr d;
    public final ykd e;
    private final AudioManager f;
    private AudioFocusRequest g;
    private final Object h;
    private final ykd i;

    public rfq(AudioManager audioManager, ykd ykdVar) {
        ykd ykdVar2 = new ykd(this);
        this.i = ykdVar2;
        this.h = new Object();
        this.f = audioManager;
        this.e = ykdVar;
        this.d = new rfr(ykdVar2);
    }

    @Override // defpackage.rfp
    public final void a() {
        synchronized (this.h) {
            AudioFocusRequest audioFocusRequest = this.g;
            if (audioFocusRequest != null) {
                this.f.abandonAudioFocusRequest(audioFocusRequest);
                this.g = null;
            }
        }
    }

    @Override // defpackage.rfp
    public final void b(int i) {
        int iD = d(i, b);
        if (iD == 0) {
            a.g().ai(7960).u("Got unexpected AUDIOFOCUS_REQUEST_FAILED");
        } else {
            if (iD == 1 || iD == 2) {
                return;
            }
            a.g().ai(7959).w("Unrecognized focus hint in requestAndroidAudioFocus: %d", i);
        }
    }

    @Override // defpackage.rfp
    public final boolean c() {
        return this.d.a() != 0;
    }

    public final int d(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        int iRequestAudioFocus;
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(i).setAudioAttributes(new AudioAttributes.Builder().setUsage(0).setContentType(0).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(onAudioFocusChangeListener).build();
        synchronized (this.h) {
            this.g = audioFocusRequestBuild;
            iRequestAudioFocus = this.f.requestAudioFocus(audioFocusRequestBuild);
        }
        return iRequestAudioFocus;
    }
}
