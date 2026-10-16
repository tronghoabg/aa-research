package defpackage;

import android.media.AudioManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/* loaded from: classes2.dex */
public final class rfw implements rfu {
    public static final ypf a = ols.R("CAR.AUDIO");
    public final TelephonyManager b;
    public final rft c;
    public volatile boolean d;
    public final PhoneStateListener e = new rfv(this);
    private final AudioManager f;

    public rfw(AudioManager audioManager, TelephonyManager telephonyManager, rft rftVar) {
        this.f = audioManager;
        this.b = telephonyManager;
        this.c = rftVar;
        this.d = c() != 0;
    }

    @Override // defpackage.rfu
    public final boolean a() {
        int mode = this.f.getMode();
        return mode == 2 || mode == 1;
    }

    @Override // defpackage.rfu
    public final boolean b() {
        return c() != 0 || this.d || a();
    }

    public final int c() {
        return this.b.getCallState();
    }
}
