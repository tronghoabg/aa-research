package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class nui extends android.telephony.PhoneStateListener {
    final /* synthetic */ defpackage.nuj a;

    public nui(defpackage.nuj nujVar) {
        this.a = nujVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(android.telephony.ServiceState serviceState) {
        this.a.m(serviceState);
    }
}
