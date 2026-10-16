package defpackage;

import android.media.AudioManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
public final class ita implements isy {
    public static final yph a = yph.c("CAR.AUDIO");
    public final TelephonyManager b;
    public final isx c;
    public volatile boolean d;
    public final PhoneStateListener e = new isz(this);
    private final AudioManager f;

    public ita(AudioManager audioManager, TelephonyManager telephonyManager, isx isxVar) {
        this.f = audioManager;
        this.b = telephonyManager;
        this.c = isxVar;
        this.d = c() != 0;
    }

    @Override // defpackage.isy
    public final boolean a() {
        int mode = this.f.getMode();
        return mode == 2 || mode == 1;
    }

    @Override // defpackage.isy
    public final boolean b() {
        return c() != 0 || this.d || a();
    }

    public final int c() {
        return this.b.getCallState();
    }
}
