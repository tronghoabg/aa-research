package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ksi {
    public final defpackage.eqp d;
    public final defpackage.eqp e;
    private final defpackage.eqp g;
    public static final defpackage.ksc a = new defpackage.ksc();
    public static final defpackage.afhl b = new defpackage.kkv(defpackage.mkp.b, 2);
    private static final defpackage.yqm f = defpackage.yqm.c("GH.CoolwalkColors");
    public static final defpackage.afar c = defpackage.afga.cA(new defpackage.ksa(2));

    public /* synthetic */ ksi(byte[] bArr) {
        defpackage.eqp eqsVar;
        defpackage.ojd ojdVarA = defpackage.ojd.a.a();
        defpackage.lem.a.a();
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            defpackage.eqp eqpVar = defpackage.ngf.a.a().g;
            defpackage.krx krxVar = new defpackage.krx(4);
            defpackage.afdo afdoVar = defpackage.tcu.a;
            eqpVar.getClass();
            eqsVar = defpackage.ebo.f(eqpVar, new defpackage.nnp(krxVar, 14));
        } else {
            defpackage.afdo afdoVar2 = defpackage.tcu.a;
            eqsVar = new defpackage.eqs(null);
        }
        this.g = eqsVar;
        int i = 13;
        this.d = defpackage.acqe.a.fF().B() ? defpackage.ebo.f(defpackage.ksn.a.a().c, new defpackage.nnp(f(), i)) : defpackage.ebo.f(eqsVar, new defpackage.nnp(f(), i));
        defpackage.eqp eqpVarF = defpackage.ebo.f(defpackage.ebo.e(new defpackage.eqr(this, ojdVarA)), new defpackage.krx(5));
        java.lang.Object objE = eqpVarF.e();
        defpackage.eqs eqsVar2 = (objE == null || (objE instanceof defpackage.ksh)) ? new defpackage.eqs(eqpVarF.e()) : new defpackage.eqs();
        eqpVarF.i(new defpackage.kku(new defpackage.adv(eqsVar2, 6), 2));
        this.e = eqsVar2;
    }

    public static final defpackage.ksi d() {
        return a.a();
    }

    private static final java.lang.Integer f() {
        java.lang.String strJ = afzh.J(defpackage.acqe.a.fF().m(), "0x", "#");
        if (afzh.v(strJ)) {
            return null;
        }
        f.l().y("Found flagged color: %s", strJ);
        try {
            return java.lang.Integer.valueOf(android.graphics.Color.parseColor(strJ));
        } catch (java.lang.IllegalArgumentException e) {
            ((defpackage.yqj) ((defpackage.yqj) f.g()).p(e)).u("Unable to parse color extra");
            return null;
        }
    }

    public final android.content.Context a(android.content.Context context) {
        context.getClass();
        return b(context, false);
    }

    public final android.content.Context b(android.content.Context context, boolean z) {
        return (z || defpackage.sqs.bT(context)) ? c().a.a(context) : context;
    }

    public final defpackage.ksh c() {
        java.lang.Object objE = this.e.e();
        objE.getClass();
        return (defpackage.ksh) objE;
    }

    public final android.content.Context e(android.content.Context context, int i) {
        context.getClass();
        return new defpackage.pl(b(context, true), i);
    }

    public ksi() {
        this(null);
    }
}
