package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;

/* loaded from: classes.dex */
final class ntu extends PhoneStateListener {
    final /* synthetic */ ntv a;

    public ntu(ntv ntvVar) {
        this.a = ntvVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        this.a.m(serviceState);
    }
}
