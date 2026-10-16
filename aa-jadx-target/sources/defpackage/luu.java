package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class luu implements defpackage.mnj {
    private final defpackage.ygw a;

    public luu() {
        int i = defpackage.ygw.d;
        this.a = defpackage.ymx.a;
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        mnl mnlVarL = mnq.l();
        mnm mnmVarA = mnn.a();
        mnmVarA.a = "isMessaging";
        mnmVarA.b();
        mnmVarA.c('|');
        mnmVarA.d(true);
        mnlVarL.b(mnmVarA.a());
        mnm mnmVarA2 = mnn.a();
        mnmVarA2.a = "isOem";
        mnmVarA2.b();
        mnmVarA2.c('|');
        mnmVarA2.d(true);
        mnlVarL.b(mnmVarA2.a());
        mnm mnmVarA3 = mnn.a();
        mnmVarA3.a = "isMedia";
        mnmVarA3.b();
        mnmVarA3.c('|');
        mnmVarA3.d(true);
        mnlVarL.b(mnmVarA3.a());
        mnm mnmVarA4 = mnn.a();
        mnmVarA4.a = "isNav";
        mnmVarA4.b();
        mnmVarA4.c('|');
        mnmVarA4.d(true);
        mnlVarL.b(mnmVarA4.a());
        mnm mnmVarA5 = mnn.a();
        mnmVarA5.a = "componentName";
        mnmVarA5.b();
        mnmVarA5.c('|');
        mnmVarA5.d(true);
        mnlVarL.b(mnmVarA5.a());
        defpackage.ygw ygwVar = this.a;
        int i = ((defpackage.ymx) ygwVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            lut lutVar = (lut) ygwVar.get(i2);
            mnlVarL.c(new java.lang.Object[]{java.lang.Boolean.valueOf(lutVar.c()), java.lang.Boolean.valueOf(lutVar.e()), java.lang.Boolean.valueOf(lutVar.b()), java.lang.Boolean.valueOf(lutVar.d()), lutVar.a()});
        }
        mnlVarL.a().m(printWriter);
    }
}
