package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class mpb {
    private static final defpackage.yqm c = defpackage.yqm.c("GH.IntentProcessor");
    private final java.lang.String b;

    protected mpb(java.lang.String str) {
        this.b = str;
    }

    public static defpackage.mqi e(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("GH.TargetComponent");
        return stringExtra != null ? defpackage.mpr.c(stringExtra) : defpackage.mqi.b(intent);
    }

    protected abstract boolean d(android.content.Intent intent, defpackage.qrh qrhVar);

    public final void f(android.content.Intent intent, defpackage.qrh qrhVar) {
        if (d(intent, qrhVar)) {
            defpackage.yqm yqmVar = c;
            defpackage.yqj yqjVar = (defpackage.yqj) yqmVar.l().ai(5133);
            java.lang.String str = this.b;
            yqjVar.M("%s intent processor will process the intent %s", str, intent);
            i(intent, qrhVar);
            ((defpackage.yqj) yqmVar.l().ai(5134)).M("%s intent processor processed the intent %s", str, intent);
        }
    }

    protected final void g(android.content.Intent intent) {
        defpackage.mqi mqiVarB = defpackage.mqi.b(intent);
        intent.putExtra("GH.TargetComponent", mqiVarB == null ? null : mqiVarB.c());
        ((defpackage.yqj) c.l().ai(5135)).M("%s intent processor stored target component for the intent %s", this.b, intent);
    }

    protected abstract void i(android.content.Intent intent, defpackage.qrh qrhVar);
}
