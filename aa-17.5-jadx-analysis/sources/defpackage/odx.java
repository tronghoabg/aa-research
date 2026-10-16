package defpackage;

import android.telephony.PhoneStateListener;

/* loaded from: classes.dex */
final class odx extends PhoneStateListener {
    final /* synthetic */ ody a;

    public odx(ody odyVar) {
        this.a = odyVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        this.a.m(Integer.valueOf(i));
    }
}
