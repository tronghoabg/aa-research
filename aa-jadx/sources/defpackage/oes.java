package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oes extends defpackage.eqp {
    private final android.telephony.TelephonyManager a;
    private final android.telephony.PhoneStateListener h;

    public oes(android.content.Context context) {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
        telephonyManager.getClass();
        this.a = telephonyManager;
        this.h = new defpackage.oer(this);
    }

    @Override // defpackage.eqp
    protected final void c() {
        android.telephony.TelephonyManager telephonyManager = this.a;
        m(java.lang.Integer.valueOf(telephonyManager.getCallState()));
        telephonyManager.listen(this.h, 32);
    }

    @Override // defpackage.eqp
    protected final void d() {
        this.a.listen(this.h, 0);
    }
}
