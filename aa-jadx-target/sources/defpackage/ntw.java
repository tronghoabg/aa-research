package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ntw extends android.telephony.PhoneStateListener {
    final /* synthetic */ defpackage.nua a;

    public ntw(defpackage.nua nuaVar) {
        this.a = nuaVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, java.lang.String str) {
        ((defpackage.yqj) defpackage.nua.a.l().ai(5429)).w("onCallStateChanged state=%d", i);
        defpackage.nua nuaVar = this.a;
        if (nuaVar.b()) {
            nuaVar.a();
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDataActivity(int i) {
        defpackage.yqm yqmVar = defpackage.nua.a;
        this.a.a();
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDataConnectionStateChanged(int i, int i2) {
        ((defpackage.yqj) defpackage.nua.a.l().ai(5431)).B("onDataConnectionStateChanged: state=%d type=%d", i, i2);
        this.a.a();
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo telephonyDisplayInfo) {
        ((defpackage.yqj) defpackage.nua.a.l().ai((char) 5432)).y("displayInfo changed: %s", telephonyDisplayInfo);
        defpackage.nua nuaVar = this.a;
        nuaVar.m = bgp$.ExternalSyntheticApiModelOutline0.m(telephonyDisplayInfo);
        nuaVar.a();
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(android.telephony.ServiceState serviceState) {
        defpackage.yqm yqmVar = defpackage.nua.a;
        this.a.a();
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) {
        defpackage.yqm yqmVar = defpackage.nua.a;
        defpackage.nua nuaVar = this.a;
        nuaVar.l = signalStrength;
        nuaVar.a();
    }
}
