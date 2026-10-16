package defpackage;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
public final class ntv extends eqj {
    private final TelephonyManager a;
    private final PhoneStateListener h = new ntu(this);

    public ntv(Context context) {
        this.a = (TelephonyManager) context.getSystemService("phone");
    }

    @Override // defpackage.eqj
    protected final void c() {
        this.a.listen(this.h, 1);
    }

    @Override // defpackage.eqj
    protected final void d() {
        this.a.listen(this.h, 0);
    }
}
