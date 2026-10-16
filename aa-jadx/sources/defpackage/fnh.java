package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fnh extends defpackage.fnj {
    private final android.content.BroadcastReceiver e;

    public fnh(android.content.Context context, defpackage.ajer ajerVar) {
        super(context, ajerVar);
        this.e = new defpackage.fng(this);
    }

    public abstract android.content.IntentFilter a();

    public abstract void c(android.content.Intent intent);

    @Override // defpackage.fnj
    public final void d() {
        defpackage.fjv.a().c(defpackage.fni.a, java.lang.String.valueOf(getClass().getSimpleName()).concat(": registering receiver"));
        this.a.registerReceiver(this.e, a());
    }

    @Override // defpackage.fnj
    public final void e() {
        defpackage.fjv.a().c(defpackage.fni.a, java.lang.String.valueOf(getClass().getSimpleName()).concat(": unregistering receiver"));
        this.a.unregisterReceiver(this.e);
    }
}
