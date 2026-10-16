package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nzg implements defpackage.lhn, defpackage.mnj {
    public volatile android.content.ComponentName a;

    public static defpackage.nzg a() {
        return (defpackage.nzg) defpackage.mkp.a.b(defpackage.nzg.class, new defpackage.oad(1));
    }

    @Override // defpackage.lhn
    public final void eQ() {
        defpackage.mni.a().c(defpackage.mnh.x, defpackage.ler.c(), this);
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        mnl mnlVarL = mnq.l();
        mnm mnmVarA = mnn.a();
        mnmVarA.a = "Startup Component Name";
        mnmVarA.b();
        mnmVarA.c('|');
        mnmVarA.d(true);
        mnlVarL.b(mnmVarA.a());
        mnm mnmVarA2 = mnn.a();
        mnmVarA2.a = "Fallback Component Name";
        mnmVarA2.b();
        mnmVarA2.c('|');
        mnmVarA2.d(true);
        mnlVarL.b(mnmVarA2.a());
        android.content.ComponentName componentName = this.a;
        mnlVarL.c(new java.lang.Object[]{componentName == null ? "null" : componentName.toShortString(), defpackage.mkt.s.toShortString()});
        mnlVarL.a().m(printWriter);
        printWriter.println("\n-------------------------------");
    }

    @Override // defpackage.lhn
    public final void d() {
    }
}
