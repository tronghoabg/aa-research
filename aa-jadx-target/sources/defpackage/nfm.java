package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nfm extends defpackage.eqp {
    private final defpackage.afar a = new defpackage.afay(new defpackage.lfu(15));
    private final defpackage.nfl h = new defpackage.nfl(this);

    private final android.content.Context a() {
        java.lang.Object objA = this.a.a();
        objA.getClass();
        return (android.content.Context) objA;
    }

    @Override // defpackage.eqp
    protected final void c() {
        a().registerReceiver(this.h, new android.content.IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"));
        defpackage.nfk nfkVar = defpackage.nfn.a;
        android.content.Context contextA = a();
        int i = defpackage.nfk.b;
        m(java.lang.Boolean.valueOf(defpackage.nfk.b(contextA)));
    }

    @Override // defpackage.eqp
    protected final void d() {
        a().unregisterReceiver(this.h);
    }
}
