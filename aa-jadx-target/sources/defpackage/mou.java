package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mou extends defpackage.mpa {
    public mou() {
        super("CameraOverlay");
    }

    @Override // defpackage.mpa
    protected final void a(android.content.Intent intent) {
        defpackage.yqj yqjVar = (defpackage.yqj) defpackage.mpa.b.f();
        java.lang.String action = intent.getAction();
        android.content.ComponentName component = intent.getComponent();
        yqjVar.M("Blocking intent because camera overlay is active and non-dismissable: intent action: %s, intent component: %s", action, component != null ? component.toShortString() : null);
    }

    @Override // defpackage.mpa
    protected final boolean b(android.content.Intent intent) {
        java.lang.Integer num;
        return (defpackage.mkt.e.equals(intent.getComponent()) || (num = (java.lang.Integer) defpackage.kkw.a.a().e()) == null || num.intValue() != 2) ? false : true;
    }
}
