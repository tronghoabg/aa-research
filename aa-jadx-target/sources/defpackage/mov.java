package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mov extends defpackage.mpb {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.CameraOverlayIP");

    public mov() {
        super("CameraOverlay");
    }

    @Override // defpackage.mpb
    protected final boolean d(android.content.Intent intent, defpackage.qrh qrhVar) {
        intent.getClass();
        java.lang.Integer num = (java.lang.Integer) defpackage.kkw.a.a().e();
        return num != null && num.intValue() == 1 && kkq.b();
    }

    @Override // defpackage.mpb
    protected final void i(android.content.Intent intent, defpackage.qrh qrhVar) {
        intent.getClass();
        defpackage.yqj yqjVar = (defpackage.yqj) a.f();
        java.lang.String action = intent.getAction();
        android.content.ComponentName component = intent.getComponent();
        yqjVar.M("Dismissing camera overlay because intent was sent: intent action: %s, intent component: %s", action, component != null ? component.toShortString() : null);
        kkq.a();
    }
}
