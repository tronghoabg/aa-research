package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ksn implements defpackage.lhn {
    public final defpackage.eqs c;
    private final android.content.Context e;
    private final android.content.ComponentCallbacks f;
    public static final defpackage.ksm a = new defpackage.ksm();
    private static final defpackage.yqm d = defpackage.yqm.c("GH.PrimaryColorProvider");
    public static final defpackage.afhl b = new defpackage.kkv(defpackage.mkp.b, 3);

    public /* synthetic */ ksn(byte[] bArr) {
        android.content.Context context = defpackage.mkp.a.c;
        context.getClass();
        defpackage.eqs eqsVar = new defpackage.eqs(null);
        context.getClass();
        this.e = context;
        this.c = eqsVar;
        this.f = new defpackage.rbj(this, 1);
    }

    public static final defpackage.ksn b() {
        return a.a();
    }

    public final int a(int i) {
        int i2 = this.e.getResources().getConfiguration().uiMode & 48;
        defpackage.acay acayVar = new defpackage.acay(i);
        double d2 = acayVar.a;
        double d3 = acayVar.b;
        double d4 = 0.0d;
        double d5 = 150.0d;
        double d6 = 0.0d;
        while (d4 <= d5) {
            double d7 = i2 == 32 ? 80.0d : 50.0d;
            double d8 = ((d5 - d4) / 2.0d) + d4;
            defpackage.ysr.bI(d2, d8, new java.util.HashMap());
            double d9 = new defpackage.acay(new defpackage.acbc(d2, d8).a((int) d7)).b;
            if (java.lang.Math.abs(d9 - d3) < 0.5d) {
                d4 = d8 + 0.01d;
                d6 = d8;
            } else if (d9 < d3) {
                d4 = d8 + 0.01d;
            } else {
                d5 = (-0.01d) + d8;
            }
        }
        return new defpackage.acay(defpackage.acaz.b(d2, d6 > 48.0d ? d6 : 48.0d, 50.0d)).c;
    }

    @Override // defpackage.lhn
    public final void d() {
        ((defpackage.yqj) d.f()).u("Tearing down on lifetime stop");
        e();
    }

    public final void e() {
        ((defpackage.yqj) d.f()).u("onProjectionEnd");
        this.e.unregisterComponentCallbacks(this.f);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        ((defpackage.yqj) d.f()).u("Setting up on lifetime start");
        f();
    }

    public final void f() {
        ((defpackage.yqj) d.f()).u("onProjectionStart");
        this.e.registerComponentCallbacks(this.f);
        g();
    }

    public final void g() {
        if (defpackage.acqe.a.fF().w()) {
            android.content.Context context = this.e;
            android.util.TypedValue typedValueBo = defpackage.sqs.bo(context.getTheme(), android.R.attr.colorPrimary);
            java.lang.Integer numValueOf = typedValueBo != null ? java.lang.Integer.valueOf(defpackage.sqs.by(context, typedValueBo)) : null;
            if (numValueOf == null) {
                ((defpackage.yqj) d.f()).u("Phone primary color is null");
                this.c.m(null);
                return;
            }
            defpackage.yqm yqmVar = d;
            ((defpackage.yqj) yqmVar.f()).w("Retrieved phone primary color: 0x%x", numValueOf.intValue());
            int iA = a(numValueOf.intValue());
            ((defpackage.yqj) yqmVar.f()).w("Extracted seed color: 0x%x", numValueOf.intValue());
            this.c.m(java.lang.Integer.valueOf(iA));
            return;
        }
        if (!((defpackage.mkw) defpackage.mkp.a.i(defpackage.mkw.class)).a().g("key_settings_use_phone_wallpaper", true)) {
            ((defpackage.yqj) d.f()).u("Not using phone wallpaper, setting seed color to null");
            this.c.m(null);
            return;
        }
        android.content.Context context2 = this.e;
        android.util.TypedValue typedValueBo2 = defpackage.sqs.bo(context2.getTheme(), android.R.attr.colorPrimary);
        java.lang.Integer numValueOf2 = typedValueBo2 != null ? java.lang.Integer.valueOf(defpackage.sqs.by(context2, typedValueBo2)) : null;
        if (numValueOf2 == null) {
            ((defpackage.yqj) d.f()).u("Phone primary color is null");
            return;
        }
        defpackage.yqm yqmVar2 = d;
        ((defpackage.yqj) yqmVar2.f()).w("Retrieved phone primary color: 0x%x", numValueOf2.intValue());
        int iA2 = a(numValueOf2.intValue());
        ((defpackage.yqj) yqmVar2.f()).w("Extracted seed color: 0x%x", numValueOf2.intValue());
        this.c.m(java.lang.Integer.valueOf(iA2));
    }

    public ksn() {
        this(null);
    }
}
