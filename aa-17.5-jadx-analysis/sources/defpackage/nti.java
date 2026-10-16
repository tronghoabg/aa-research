package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyDisplayInfo;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class nti extends PhoneStateListener {
    final /* synthetic */ ntm a;

    public nti(ntm ntmVar) {
        this.a = ntmVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ((ype) ntm.a.l().ai(5426)).w("onCallStateChanged state=%d", i);
        ntm ntmVar = this.a;
        if (ntmVar.b()) {
            ntmVar.a();
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDataActivity(int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        yph yphVar = ntm.a;
        this.a.a();
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDataConnectionStateChanged(int i, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ((ype) ntm.a.l().ai(5428)).B("onDataConnectionStateChanged: state=%d type=%d", i, i2);
        this.a.a();
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ((ype) ntm.a.l().ai((char) 5429)).y("displayInfo changed: %s", telephonyDisplayInfo);
        ntm ntmVar = this.a;
        ntmVar.m = telephonyDisplayInfo.getOverrideNetworkType();
        ntmVar.a();
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        yph yphVar = ntm.a;
        this.a.a();
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        yph yphVar = ntm.a;
        ntm ntmVar = this.a;
        ntmVar.l = signalStrength;
        ntmVar.a();
    }
}
