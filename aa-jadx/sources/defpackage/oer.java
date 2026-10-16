package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class oer extends android.telephony.PhoneStateListener {
    final /* synthetic */ defpackage.oes a;

    public oer(defpackage.oes oesVar) {
        this.a = oesVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, java.lang.String str) {
        this.a.m(java.lang.Integer.valueOf(i));
    }
}
