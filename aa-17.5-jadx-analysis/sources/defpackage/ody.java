package defpackage;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
public final class ody extends eqj {
    private final TelephonyManager a;
    private final PhoneStateListener h;

    public ody(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        telephonyManager.getClass();
        this.a = telephonyManager;
        this.h = new odx(this);
    }

    @Override // defpackage.eqj
    protected final void c() {
        TelephonyManager telephonyManager = this.a;
        m(Integer.valueOf(telephonyManager.getCallState()));
        telephonyManager.listen(this.h, 32);
    }

    @Override // defpackage.eqj
    protected final void d() {
        this.a.listen(this.h, 0);
    }
}
