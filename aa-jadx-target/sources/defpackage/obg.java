package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class obg extends defpackage.ers {
    public static final defpackage.yhx a;
    public final defpackage.eqp b;
    public final defpackage.eqp c;
    public final defpackage.qsh d;
    public final defpackage.eqp e;
    public final defpackage.eqp f;
    public final defpackage.eqp g;
    public final defpackage.eqp i;
    public final defpackage.eqp j;
    public final defpackage.eqp k;
    public final defpackage.eqp l;
    public final defpackage.eqp m;
    public final defpackage.eqp n;
    public final defpackage.eqp o;
    public final defpackage.eqp p;
    public final defpackage.eqp q;
    public final defpackage.eqp r;
    private final defpackage.afar s;
    private final defpackage.afar t;
    private final defpackage.mku u;

    static {
        defpackage.yqm.c("GH.StatusElementVM");
        defpackage.yhx yhxVarP = defpackage.yhx.p("debug", "dogfood");
        yhxVarP.getClass();
        a = yhxVarP;
    }

    public obg(defpackage.eqp eqpVar, defpackage.eqp eqpVar2, defpackage.qsh qshVar) {
        java.lang.Object afavVar;
        eqpVar2.getClass();
        this.b = eqpVar;
        this.c = eqpVar2;
        this.d = qshVar;
        this.u = new defpackage.mku(defpackage.mkp.a.c);
        int i = 2;
        try {
            defpackage.eqp eqpVarA = defpackage.kjx.a.a().a();
            defpackage.oat oatVar = new defpackage.oat(i);
            defpackage.afdo afdoVar = defpackage.tcu.a;
            afavVar = defpackage.ebo.f(eqpVarA, oatVar);
        } catch (java.lang.Throwable th) {
            afavVar = new defpackage.afav(th);
        }
        defpackage.afce afceVar = defpackage.afce.a;
        defpackage.afdo afdoVar2 = defpackage.tcu.a;
        this.e = defpackage.ebo.f(new defpackage.ocl(), new defpackage.nkn(16));
        defpackage.yqm yqmVar = defpackage.kfs.a;
        this.f = ((defpackage.kfs) defpackage.mkp.a.i(defpackage.kfs.class)).c;
        defpackage.ngj ngjVar = defpackage.ngk.a;
        defpackage.eqp eqpVarF = defpackage.ebo.f(ngjVar.a().d, new defpackage.tci(2));
        this.g = eqpVarF;
        defpackage.acyc acycVar = defpackage.acyc.a;
        this.i = acycVar.fF().ae() ? defpackage.tcu.a(defpackage.tcu.a(ngjVar.a().d, ngjVar.a().f), ngjVar.a().e) : defpackage.tcu.d;
        this.j = acycVar.fF().ae() ? defpackage.ebo.f(ngjVar.a().f, new defpackage.tci(2)) : defpackage.tcu.y(defpackage.ebo.f(eqpVarF, new defpackage.tci(2)), defpackage.ebo.f(ngjVar.a().f, new defpackage.tci(2)));
        this.k = acycVar.fF().ae() ? defpackage.ebo.f(ngjVar.a().e, new defpackage.tci(2)) : defpackage.tcu.y(defpackage.ebo.f(eqpVarF, new defpackage.tci(2)), defpackage.ebo.f(ngjVar.a().e, new defpackage.tci(2)));
        this.s = new defpackage.afay(new defpackage.nhn(13));
        defpackage.mku mkuVar = this.u;
        this.l = (defpackage.eqp) mkuVar.a;
        this.m = (defpackage.eqp) mkuVar.d;
        defpackage.eqp eqpVar3 = (defpackage.eqp) mkuVar.c;
        this.n = eqpVar3;
        this.o = defpackage.ebo.f(eqpVar3, new defpackage.affc() { // from class: obd
            @Override // defpackage.affc
            public final java.lang.Object invoke(java.lang.Object obj) {
                defpackage.nue nueVar = (defpackage.nue) obj;
                nueVar.getClass();
                defpackage.lee leeVarA = defpackage.lee.a.a();
                defpackage.qsh qshVarE = this.a.d;
                if (qshVarE == null) {
                    defpackage.yqm yqmVar2 = defpackage.kit.a;
                    qshVarE = ((defpackage.kit) defpackage.mkp.a.i(defpackage.kit.class)).e();
                    qshVarE.getClass();
                }
                if (leeVarA.c(qshVarE)) {
                    java.lang.String str = android.os.Build.MANUFACTURER;
                    str.getClass();
                    if (afzh.u(str, "samsung", true)) {
                        switch (nueVar.a.ordinal()) {
                            case defpackage.abnt.b /* 0 */:
                                return 2131231942;
                            case 1:
                                return 2131231943;
                            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                                return 2131231949;
                            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                                return 2131231948;
                            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                                return 2131231952;
                            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                                return 2131231944;
                            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                                return 2131231945;
                            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                                return 2131231950;
                            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                                return 2131231951;
                            case 9:
                                return 2131231946;
                            case 10:
                                return 2131231947;
                            case 11:
                                return 2131231947;
                            case 12:
                            case 13:
                                return null;
                            default:
                                throw new defpackage.afas();
                        }
                    }
                    switch (nueVar.a.ordinal()) {
                        case defpackage.abnt.b /* 0 */:
                            return 2131231942;
                        case 1:
                            return 2131231943;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            return 2131231949;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            return 2131231948;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            return 2131231952;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            return 2131231944;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            return 2131231945;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            return 2131231950;
                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                            return 2131231951;
                        case 9:
                            return 2131231946;
                        case 10:
                            return 2131231947;
                        case 11:
                            return 2131231947;
                        case 12:
                        case 13:
                            return null;
                        default:
                            throw new defpackage.afas();
                    }
                }
                java.lang.String str2 = android.os.Build.MANUFACTURER;
                str2.getClass();
                if (afzh.u(str2, "samsung", true)) {
                    switch (nueVar.a.ordinal()) {
                        case defpackage.abnt.b /* 0 */:
                            return 2131232620;
                        case 1:
                            return 2131232621;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            return 2131232627;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            return 2131232626;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            return 2131232630;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            return 2131232622;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            return 2131232623;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            return 2131232628;
                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                            return 2131232629;
                        case 9:
                            return 2131232624;
                        case 10:
                            return 2131232625;
                        case 11:
                            return 2131232625;
                        case 12:
                        case 13:
                            return null;
                        default:
                            throw new defpackage.afas();
                    }
                }
                switch (nueVar.a.ordinal()) {
                    case defpackage.abnt.b /* 0 */:
                        return 2131232095;
                    case 1:
                        return 2131232096;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        return 2131232103;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        return 2131232102;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        return 2131232106;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        return 2131232097;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        return 2131232098;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        return 2131232104;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        return 2131232105;
                    case 9:
                        return 2131232099;
                    case 10:
                        return 2131232100;
                    case 11:
                        return 2131232101;
                    case 12:
                    case 13:
                        return null;
                    default:
                        throw new defpackage.afas();
                }
            }
        });
        android.content.ComponentName componentName = defpackage.nye.a;
        this.p = ((defpackage.nye) defpackage.mkp.a.i(defpackage.nye.class)).d;
        this.t = new defpackage.afay(new defpackage.njw(this, 8));
        defpackage.nfp.a.a();
        defpackage.qsh qshVarE = this.d;
        if (qshVarE == null) {
            defpackage.yqm yqmVar2 = defpackage.kit.a;
            qshVarE = ((defpackage.kit) defpackage.mkp.a.i(defpackage.kit.class)).e();
            qshVarE.getClass();
        }
        qshVarE.getClass();
        this.q = !defpackage.ebq.n(qshVarE) ? new defpackage.eqs(null) : new defpackage.nfq(qshVarE);
        this.r = ngjVar.a().c;
    }

    public final defpackage.eqp a() {
        return (defpackage.eqp) this.s.a();
    }

    public final defpackage.eqp b() {
        return (defpackage.eqp) this.t.a();
    }

    public obg() {
        defpackage.nfg nfgVarA = defpackage.nfg.a.a();
        defpackage.eqr eqrVar = new defpackage.eqr();
        defpackage.afgq afgqVar = new defpackage.afgq();
        afgqVar.a = true;
        eqrVar.r(nfgVarA, new defpackage.nol(new defpackage.nam(eqrVar, afgqVar, 14), 5));
        this(eqrVar, defpackage.nfn.a.a().a(), null);
    }
}
