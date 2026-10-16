package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class alj implements defpackage.affc {
    public final /* synthetic */ float a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ alj(float f, java.lang.Object obj, int i) {
        this.c = i;
        this.a = f;
        this.b = obj;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean zC;
        int i = this.c;
        if (i == 0) {
            float f = this.a;
            defpackage.afhw afhwVar = (defpackage.afhw) this.b;
            defpackage.dbb.i((defpackage.dek) obj, new defpackage.ddv(((java.lang.Number) defpackage.afqt.n(java.lang.Float.valueOf(f), afhwVar)).floatValue(), afhwVar));
            return defpackage.afbk.a;
        }
        boolean z = false;
        if (i == 1) {
            long jLongValue = ((java.lang.Long) obj).longValue();
            defpackage.agn agnVar = (defpackage.agn) this.b;
            if (!agnVar.w()) {
                if (agnVar.c() == Long.MIN_VALUE) {
                    agnVar.l(jLongValue);
                }
                float f2 = this.a;
                long jC = jLongValue - agnVar.c();
                z = f2 != 0.0f;
                if (f2 != 0.0f) {
                    jC = defpackage.afhi.l(jC / ((double) f2));
                }
                agnVar.n(jC);
                agnVar.j(jC, !z);
            }
            return defpackage.afbk.a;
        }
        defpackage.aol aolVar = (defpackage.aol) obj;
        boolean zF = defpackage.afga.f(aolVar.d(), "waiting");
        if (aolVar.n() == null) {
            zC = false;
        } else {
            float f3 = this.a;
            defpackage.apn apnVarN = aolVar.n();
            apnVarN.getClass();
            zC = defpackage.aon.c(apnVarN, f3);
        }
        defpackage.afgq afgqVar = (defpackage.afgq) this.b;
        if (afgqVar.a || (zF && zC)) {
            z = true;
        }
        afgqVar.a = z;
        return java.lang.Boolean.valueOf(!z);
    }

    public /* synthetic */ alj(defpackage.agn agnVar, float f, int i) {
        this.c = i;
        this.b = agnVar;
        this.a = f;
    }
}
