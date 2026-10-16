package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rry {
    private final defpackage.sip a;
    private final defpackage.tns b;

    public rry(android.content.Context context) {
        java.util.List list = defpackage.sip.n;
        this.a = new defpackage.sik(context, "CAR").a();
        this.b = new defpackage.tns(context, new defpackage.tnn(new ajff()));
    }

    public final void a(defpackage.yyh yyhVar, defpackage.yyg yygVar, java.util.List list) {
        defpackage.sim simVarF;
        synchronized (this) {
            simVarF = this.a.f(yygVar);
            simVarF.g(yyhVar.aw);
            simVarF.f("com.google.android.gms.car");
            simVarF.f("com.google.android.projection.gearhead");
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) it.next();
                num.intValue();
                if (simVarF.c == null) {
                    simVarF.c = new java.util.ArrayList();
                }
                simVarF.c.add(num);
            }
            simVarF.c(this.b);
        }
        simVarF.b();
    }
}
