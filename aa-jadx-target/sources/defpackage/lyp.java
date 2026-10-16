package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lyp extends defpackage.jrx {
    private final defpackage.luv a = defpackage.luv.e();

    @Override // defpackage.jrx
    protected final defpackage.mqi a(android.content.Intent intent) {
        return defpackage.mpr.b(defpackage.mkt.o);
    }

    @Override // defpackage.jrx
    protected final void b(android.content.Intent intent) {
        android.content.ComponentName component = intent.getComponent();
        component.getClass();
        java.lang.String packageName = component.getPackageName();
        defpackage.yqm yqmVar = jsg.a;
        intent.putExtra("TemplateCarActivity.SESSION_ID", packageName);
    }

    @Override // defpackage.mpb
    protected final boolean d(android.content.Intent intent, defpackage.qrh qrhVar) {
        defpackage.mqi mqiVarB = defpackage.mqi.b(intent);
        if (mqiVarB == null) {
            return false;
        }
        return j$.util.Collection.-EL.stream(this.a.b(defpackage.kit.b().e(), defpackage.nze.a())).map(new defpackage.lvg(4)).anyMatch(new defpackage.lpa(mqiVarB, 10));
    }
}
