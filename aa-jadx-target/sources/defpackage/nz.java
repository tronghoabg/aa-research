package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nz implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public nz(defpackage.agn agnVar, int i, byte[] bArr) {
        this.b = i;
        this.a = agnVar;
    }

    /* JADX WARN: Type inference failed for: r6v23, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v43, types: [cwm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [fbm, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        int i = 1;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.exc excVar = new defpackage.exc();
                ((defpackage.od) this.a).r().aa().s(excVar);
                return excVar;
            case 1:
                return new defpackage.jyp(((defpackage.od) this.a).l);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ?? r6 = this.a;
                defpackage.od odVar = (defpackage.od) r6;
                return new defpackage.ern(odVar.getApplication(), r6, odVar.getIntent() != null ? odVar.getIntent().getExtras() : null);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Object obj = this.a;
                defpackage.bil bilVar = new defpackage.bil(new defpackage.bgf(obj, i));
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    if (!defpackage.afga.f(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                        new android.os.Handler(android.os.Looper.getMainLooper()).post(new defpackage.af(obj, (java.lang.Object) bilVar, 12, (byte[]) null));
                        return bilVar;
                    }
                    ((defpackage.od) obj).z(bilVar);
                }
                return bilVar;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.or((defpackage.bil) this.a);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return java.lang.Boolean.valueOf(defpackage.ca.O((defpackage.agn) this.a));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.agn) this.a).g();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aga agaVar = defpackage.acs.a;
                defpackage.adi adiVar = (defpackage.adi) this.a;
                adiVar.g(defpackage.add.a);
                adiVar.r.e();
                adiVar.b = 0L;
                adiVar.c = 1.0f;
                adiVar.d = 1.0f;
                defpackage.sr srVar = adiVar.s;
                if (srVar != null) {
                    srVar.e();
                }
                adiVar.e = defpackage.tna.aK(0.5f, 0.5f);
                adiVar.f = 0L;
                defpackage.sr srVar2 = adiVar.t;
                adiVar.p = null;
                adiVar.q = null;
                adiVar.u = null;
                adiVar.j(null);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Float.valueOf(defpackage.afw.c(this.a.c()));
            case 9:
                ((defpackage.aek) this.a).d = false;
                return defpackage.afbk.a;
            case 10:
                ((defpackage.aek) this.a).d = false;
                return defpackage.afbk.a;
            case 11:
                defpackage.agn agnVar = (defpackage.agn) this.a;
                return java.lang.Boolean.valueOf(!defpackage.afga.f(agnVar.g(), agnVar.e()) || agnVar.v() || ((java.lang.Boolean) agnVar.d.a()).booleanValue());
            case 12:
                return java.lang.Long.valueOf(((defpackage.agn) this.a).a());
            case 13:
                ?? r7 = this.a;
                defpackage.akl aklVar = (defpackage.akl) defpackage.cjv.y(r7, defpackage.akn.a);
                if (!(aklVar instanceof defpackage.akr)) {
                    java.util.Objects.toString(aklVar);
                    defpackage.asq.c("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: ".concat(java.lang.String.valueOf(aklVar)));
                }
                defpackage.aiw aiwVar = (defpackage.aiw) r7;
                defpackage.akr akrVar = aiwVar.c;
                aiwVar.c = (defpackage.akr) aklVar;
                if (akrVar != null && !defpackage.afga.f(aiwVar.c, akrVar)) {
                    aiwVar.v();
                }
                return defpackage.afbk.a;
            case 14:
                ((defpackage.aiw) this.a).u();
                return java.lang.Boolean.TRUE;
            case 15:
                ((defpackage.akt) this.a).h();
                return defpackage.afbk.a;
            case 16:
                return new defpackage.cji(((defpackage.akt) this.a).m);
            case 17:
                defpackage.ctc ctcVar = (defpackage.ctc) ((defpackage.akt) this.a).l.a();
                return new defpackage.cji(ctcVar != null ? ctcVar.j(0L) : 9205357640488583168L);
            case 18:
                return java.lang.Float.valueOf(((defpackage.alk) this.a).a.c());
            case 19:
                return java.lang.Float.valueOf(((defpackage.alk) this.a).a.b());
            default:
                defpackage.all allVar = (defpackage.all) this.a;
                return java.lang.Boolean.valueOf(allVar.c() < allVar.b());
        }
    }

    public /* synthetic */ nz(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
