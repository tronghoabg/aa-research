package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lsj extends defpackage.lhm {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.MediaSearchIntentPr");
    public android.content.ComponentName b;
    public android.content.ComponentName c;
    public boolean e;
    public android.os.CancellationSignal d = new android.os.CancellationSignal();
    private final java.util.Map g = new java.util.HashMap();
    public final java.util.Map f = new java.util.HashMap();

    public lsj() {
        defpackage.eqp eqpVarA = defpackage.lhe.b().a(defpackage.mqg.MEDIA);
        eqpVarA.eM(this, new defpackage.lnj(this, 13));
        defpackage.tcu.C(eqpVarA, new defpackage.lqi(20)).eM(this, new defpackage.lkt(8));
        int i = 3;
        defpackage.tcu.v(defpackage.tcu.C(eqpVarA, new defpackage.lra(defpackage.lpg.j(), i)), new defpackage.lsf(1)).eM(this, new defpackage.lkt(9));
        defpackage.eqp eqpVarB = defpackage.loo.b();
        eqpVarB.eM(this, new defpackage.lnj(this, 14));
        defpackage.tcu.v(defpackage.tcu.C(eqpVarB, new defpackage.lra(defpackage.lpg.j(), i)), new defpackage.lsf(0)).eM(this, new defpackage.lnj(this, 15));
    }

    public static android.os.CancellationSignal a(defpackage.eqg eqgVar, android.content.ComponentName componentName, android.content.ComponentName componentName2, java.lang.String str, android.os.Bundle bundle) {
        android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
        g(eqgVar, cancellationSignal, componentName, componentName2, str, bundle);
        return cancellationSignal;
    }

    public static defpackage.eqp b(android.content.ComponentName componentName) {
        return defpackage.tcu.C(defpackage.tcu.v(defpackage.lpg.j().b(componentName), new defpackage.lqi(18)), new defpackage.lqi(19));
    }

    public static defpackage.lsj f() {
        return (defpackage.lsj) defpackage.mkp.a.i(defpackage.lsj.class);
    }

    public static void g(defpackage.eqg eqgVar, android.os.CancellationSignal cancellationSignal, android.content.ComponentName componentName, android.content.ComponentName componentName2, java.lang.String str, android.os.Bundle bundle) {
        defpackage.eqs eqsVar = new defpackage.eqs(java.lang.Boolean.FALSE);
        if (componentName != null) {
            defpackage.rox.q(h(componentName), eqgVar, new lrh(cancellationSignal, componentName, eqsVar, 3));
        } else {
            eqsVar.m(java.lang.Boolean.TRUE);
        }
        defpackage.eqp eqpVarD = defpackage.tcu.D(h(componentName2), eqsVar);
        if (!j$.util.Objects.equals(componentName, componentName2)) {
            defpackage.eqp lshVar = new lsh(eqpVarD, 1000L);
            defpackage.rox.q(defpackage.tcu.t(new lsh(b(componentName2), 15000L)), eqgVar, new defpackage.lnj(componentName2, 16));
            eqpVarD = lshVar;
        }
        defpackage.rox.q(defpackage.tcu.t(eqpVarD), eqgVar, new lse(cancellationSignal, componentName2, str, bundle));
    }

    private static defpackage.eqp h(android.content.ComponentName componentName) {
        return defpackage.tcu.v(defpackage.lpg.j().f(componentName), new defpackage.lsf(2));
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void d() {
        super.d();
        java.util.Iterator it = this.g.values().iterator();
        while (it.hasNext()) {
            ((defpackage.eqs) it.next()).m(null);
        }
        java.util.Iterator it2 = this.f.values().iterator();
        while (it2.hasNext()) {
            ((defpackage.eqs) it2.next()).m(null);
        }
    }

    public final defpackage.eqs e(android.content.ComponentName componentName) {
        return (defpackage.eqs) j$.util.Map.-EL.computeIfAbsent(this.g, componentName, new lkg(18));
    }
}
