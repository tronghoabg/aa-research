package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nfg extends defpackage.eqp {
    public static final defpackage.nfe a = new defpackage.nfe();
    public static final defpackage.afhl h = new defpackage.kkv(defpackage.mkp.b, 19);
    private final defpackage.nff i = new defpackage.nff(this);

    public final void a(android.content.Intent intent) {
        defpackage.nfh nfhVar;
        if (intent == null) {
            nfhVar = null;
        } else {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("plugged", 0);
            int i = 2;
            if (intExtra2 != 0) {
                if (intExtra2 == 1) {
                    i = 5;
                } else if (intExtra2 == 2) {
                    i = 4;
                } else if (intExtra2 != 4) {
                    i = intExtra2 != 8 ? 1 : 6;
                } else {
                    i = 3;
                }
            }
            nfhVar = new defpackage.nfh(intExtra, i, intent.getIntExtra("temperature", 0) / 10.0f);
        }
        m(nfhVar);
    }

    @Override // defpackage.eqp
    protected final void c() {
        a(defpackage.mkp.a.c.registerReceiver(this.i, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED")));
    }

    @Override // defpackage.eqp
    protected final void d() {
        defpackage.mkp.a.c.unregisterReceiver(this.i);
    }
}
