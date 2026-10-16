package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class iso implements isl {
    public static final yph a = yph.c("CAR.AUDIO.AFM");
    private static final AudioManager.OnAudioFocusChangeListener e = new isn();
    public final ism b;
    public volatile Handler c;
    public final isr d;
    private final AudioManager f;
    private AudioFocusRequest g;
    private final Object h = new Object();

    public iso(AudioManager audioManager, ism ismVar, isr isrVar) {
        this.f = audioManager;
        this.b = ismVar;
        this.d = isrVar;
    }

    @Override // defpackage.isl
    public final void a() {
        ((ype) a.l().ai((char) 1294)).u("Abandon Android audio focus");
        synchronized (this.h) {
            AudioFocusRequest audioFocusRequest = this.g;
            if (audioFocusRequest != null) {
                this.f.abandonAudioFocusRequest(audioFocusRequest);
                this.g = null;
            }
        }
    }

    @Override // defpackage.isl
    public final void b(int i) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 1297)).y("Request Android audio focus: %s", new zjd(zjc.a, epq.k(i)));
        int iD = d(i, new AudioAttributes.Builder().setUsage(0).setContentType(0).build());
        if (iD == 0) {
            ((ype) ((ype) yphVar.g()).ai((char) 1299)).u("Got unexpected AUDIOFOCUS_REQUEST_FAILED");
        } else {
            if (iD == 1 || iD == 2) {
                return;
            }
            ((ype) ((ype) yphVar.g()).ai((char) 1298)).w("Unrecognized focus hint in requestAndroidAudioFocus: %d", i);
        }
    }

    @Override // defpackage.isl
    public final boolean c() {
        return this.d.a() != 0;
    }

    public final int d(int i, AudioAttributes audioAttributes) {
        int iRequestAudioFocus;
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(i).setAudioAttributes(audioAttributes).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(e).build();
        synchronized (this.h) {
            this.g = audioFocusRequestBuild;
            iRequestAudioFocus = this.f.requestAudioFocus(audioFocusRequestBuild);
        }
        return iRequestAudioFocus;
    }
}
