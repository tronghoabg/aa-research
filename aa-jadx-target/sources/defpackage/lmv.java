package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lmv implements ljy {
    final /* synthetic */ defpackage.lnb a;
    private final /* synthetic */ int b;

    public lmv(defpackage.lnb lnbVar, int i) {
        this.b = i;
        this.a = lnbVar;
    }

    public final void a(android.content.ComponentName componentName) {
        if (this.b != 0) {
            this.a.k(componentName);
        }
    }

    public final void b(android.content.Intent intent, boolean z, android.content.ComponentName componentName) {
        if (this.b == 0 && !defpackage.adae.p()) {
            defpackage.lnb lnbVar = this.a;
            if (!z || !componentName.equals(lnbVar.a().a)) {
                intent = null;
            }
            lnbVar.d = intent;
        }
    }

    public final void c(android.content.Intent intent, android.content.ComponentName componentName) {
        if (this.b == 0 && !defpackage.adae.p()) {
            defpackage.lnb lnbVar = this.a;
            if (intent.equals(lnbVar.d) && componentName.equals(lnbVar.a().a)) {
                lnbVar.d = null;
            }
        }
    }
}
