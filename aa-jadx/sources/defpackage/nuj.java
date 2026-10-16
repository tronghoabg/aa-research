package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nuj extends defpackage.eqp {
    private final android.telephony.TelephonyManager a;
    private final android.telephony.PhoneStateListener h = new defpackage.nui(this);

    public nuj(android.content.Context context) {
        this.a = (android.telephony.TelephonyManager) context.getSystemService("phone");
    }

    @Override // defpackage.eqp
    protected final void c() {
        this.a.listen(this.h, 1);
    }

    @Override // defpackage.eqp
    protected final void d() {
        this.a.listen(this.h, 0);
    }
}
