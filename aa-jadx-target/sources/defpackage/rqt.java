package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rqt {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.ANALYTICS");
    public static final java.lang.Object b = new java.lang.Object();
    public static final defpackage.rqo c = new defpackage.wzs(null).a();
    private static volatile defpackage.rqt k;
    public defpackage.rqs d;
    public final defpackage.rry e;
    public final java.util.concurrent.BlockingQueue f;
    public final defpackage.sac g;
    public final defpackage.sac h;
    public final defpackage.sac i;
    public final int j;
    private final defpackage.rqv l;
    private final java.util.concurrent.Executor m;
    private final defpackage.sac n;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public rqt(defpackage.rqs rqsVar, defpackage.rry rryVar, defpackage.sac sacVar, defpackage.rqv rqvVar, defpackage.sac sacVar2, java.util.concurrent.Executor executor, defpackage.sac sacVar3, defpackage.sac sacVar4) {
        java.lang.String strM = hh$.ExternalSyntheticApiModelOutline0.m();
        int i = 1;
        if (strM != null) {
            switch (strM.hashCode()) {
                case -1998252575:
                    if (strM.equals("com.google.android.projection.gearhead:car")) {
                        i = 5;
                    }
                    break;
                case -1346310731:
                    if (strM.equals("com.google.android.projection.gearhead:vanagon")) {
                        i = 3;
                    }
                    break;
                case -1231601864:
                    if (strM.equals("com.google.android.projection.gearhead:shared")) {
                        i = 4;
                    }
                    break;
                case -931760128:
                    if (strM.equals("com.google.android.gms:car")) {
                        i = 6;
                    }
                    break;
                case 51100578:
                    if (strM.equals("com.google.android.projection.gearhead:projection")) {
                        i = 2;
                    }
                    break;
            }
        }
        this.j = i;
        this.d = rqsVar;
        this.e = rryVar;
        this.g = sacVar;
        this.l = rqvVar;
        this.f = new java.util.concurrent.ArrayBlockingQueue(10000);
        this.h = sacVar2;
        this.m = executor;
        this.i = sacVar3;
        this.n = sacVar4;
    }

    public static defpackage.rqt a(android.content.Context context) {
        if (k == null) {
            synchronized (b) {
                if (k == null) {
                    final android.content.Context applicationContext = context.getApplicationContext();
                    final int i = 0;
                    defpackage.rqp rqpVar = new defpackage.rqp(0);
                    defpackage.rry rryVar = new defpackage.rry(applicationContext);
                    int i2 = defpackage.rqn.a;
                    final int i3 = 1;
                    final defpackage.xzi xziVarAQ = defpackage.ysr.aQ(new defpackage.sac() { // from class: rqq
                        @Override // defpackage.xzi
                        public final java.lang.Object fF() {
                            int i4 = i3;
                            if (i4 == 0) {
                                return new defpackage.rrb();
                            }
                            if (i4 == 1) {
                                return defpackage.rqx.a();
                            }
                            defpackage.yqk yqkVar = defpackage.rqt.a;
                            defpackage.rit ritVar = defpackage.rit.INSTANCE;
                            return new defpackage.rqz(new java.util.Random());
                        }
                    });
                    xziVarAQ.getClass();
                    defpackage.sac sacVar = new defpackage.sac() { // from class: sab
                        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xzi] */
                        @Override // defpackage.xzi
                        public final java.lang.Object fF() {
                            if (i == 0) {
                                return xziVarAQ.fF();
                            }
                            defpackage.yqk yqkVar = defpackage.rqt.a;
                            return new defpackage.abpu((android.content.Context) xziVarAQ);
                        }
                    };
                    defpackage.rqv rqvVarA = defpackage.rqv.a(applicationContext);
                    final defpackage.xzi xziVarAQ2 = defpackage.ysr.aQ(new defpackage.sac() { // from class: rqq
                        @Override // defpackage.xzi
                        public final java.lang.Object fF() {
                            int i4 = i;
                            if (i4 == 0) {
                                return new defpackage.rrb();
                            }
                            if (i4 == 1) {
                                return defpackage.rqx.a();
                            }
                            defpackage.yqk yqkVar = defpackage.rqt.a;
                            defpackage.rit ritVar = defpackage.rit.INSTANCE;
                            return new defpackage.rqz(new java.util.Random());
                        }
                    });
                    xziVarAQ2.getClass();
                    defpackage.sac sacVar2 = new defpackage.sac() { // from class: sab
                        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xzi] */
                        @Override // defpackage.xzi
                        public final java.lang.Object fF() {
                            if (i == 0) {
                                return xziVarAQ2.fF();
                            }
                            defpackage.yqk yqkVar = defpackage.rqt.a;
                            return new defpackage.abpu((android.content.Context) xziVarAQ2);
                        }
                    };
                    java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
                    defpackage.rit ritVar = defpackage.rit.INSTANCE;
                    final defpackage.xzi xziVarAQ3 = defpackage.ysr.aQ(new defpackage.sac() { // from class: sab
                        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xzi] */
                        @Override // defpackage.xzi
                        public final java.lang.Object fF() {
                            if (i3 == 0) {
                                return applicationContext.fF();
                            }
                            defpackage.yqk yqkVar = defpackage.rqt.a;
                            return new defpackage.abpu((android.content.Context) applicationContext);
                        }
                    });
                    xziVarAQ3.getClass();
                    defpackage.sac sacVar3 = new defpackage.sac() { // from class: sab
                        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xzi] */
                        @Override // defpackage.xzi
                        public final java.lang.Object fF() {
                            if (i == 0) {
                                return xziVarAQ3.fF();
                            }
                            defpackage.yqk yqkVar = defpackage.rqt.a;
                            return new defpackage.abpu((android.content.Context) xziVarAQ3);
                        }
                    };
                    final int i4 = 2;
                    final defpackage.xzi xziVarAQ4 = defpackage.ysr.aQ(new defpackage.sac() { // from class: rqq
                        @Override // defpackage.xzi
                        public final java.lang.Object fF() {
                            int i5 = i4;
                            if (i5 == 0) {
                                return new defpackage.rrb();
                            }
                            if (i5 == 1) {
                                return defpackage.rqx.a();
                            }
                            defpackage.yqk yqkVar = defpackage.rqt.a;
                            defpackage.rit ritVar2 = defpackage.rit.INSTANCE;
                            return new defpackage.rqz(new java.util.Random());
                        }
                    });
                    xziVarAQ4.getClass();
                    k = new defpackage.rqt(rqpVar, rryVar, sacVar, rqvVarA, sacVar2, executorServiceNewSingleThreadExecutor, sacVar3, new defpackage.sac() { // from class: sab
                        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xzi] */
                        @Override // defpackage.xzi
                        public final java.lang.Object fF() {
                            if (i == 0) {
                                return xziVarAQ4.fF();
                            }
                            defpackage.yqk yqkVar = defpackage.rqt.a;
                            return new defpackage.abpu((android.content.Context) xziVarAQ4);
                        }
                    });
                }
            }
        }
        return k;
    }

    private final void g(defpackage.yzd yzdVar, defpackage.yyh yyhVar, defpackage.abor aborVar, java.util.List list) {
        defpackage.yzc yzcVar = ((defpackage.yyg) aborVar.b).O;
        if (yzcVar == null) {
            yzcVar = defpackage.yzc.a;
        }
        defpackage.ysr.bk(!((yzcVar.b & 2) != 0), "sourceDomainLifetimeId is reserved for CarTelemetryLogger lib use");
        defpackage.rqz rqzVar = (defpackage.rqz) this.n.fF();
        float f = rqzVar.c;
        if (f < 1.0f && rqzVar.d.nextFloat() > f) {
            if (yyhVar == defpackage.yyh.UI) {
                defpackage.yyg yygVar = (defpackage.yyg) aborVar.b;
                if ((yygVar.b & 4096) != 0) {
                    defpackage.zbg zbgVar = yygVar.o;
                    if (zbgVar == null) {
                        zbgVar = defpackage.zbg.a;
                    }
                    if (rqzVar.a.contains(java.lang.Integer.valueOf(zbgVar.e))) {
                        return;
                    }
                }
            }
            if (yyhVar == defpackage.yyh.NON_UI) {
                defpackage.yyg yygVar2 = (defpackage.yyg) aborVar.b;
                if ((yygVar2.b & 8192) != 0) {
                    defpackage.zae zaeVar = yygVar2.p;
                    if (zaeVar == null) {
                        zaeVar = defpackage.zae.a;
                    }
                    if (rqzVar.b.contains(java.lang.Integer.valueOf(zaeVar.d))) {
                        return;
                    }
                }
            }
            if (yyhVar == defpackage.yyh.GEARHEAD_CAR_SERVICE_CONNECTION) {
                defpackage.yyg yygVar3 = (defpackage.yyg) aborVar.b;
                if ((yygVar3.c & 8388608) != 0) {
                    defpackage.yzl yzlVar = yygVar3.V;
                    if (yzlVar == null) {
                        yzlVar = defpackage.yzl.a;
                    }
                    if (yzlVar.e) {
                        return;
                    }
                }
            }
            if (yyhVar == defpackage.yyh.CAR_CLIENT_CONNECTION) {
                defpackage.yyg yygVar4 = (defpackage.yyg) aborVar.b;
                if ((yygVar4.c & 2097152) != 0) {
                    defpackage.yye yyeVar = yygVar4.T;
                    if (yyeVar == null) {
                        yyeVar = defpackage.yye.a;
                    }
                    if (yyeVar.d) {
                        return;
                    }
                }
            }
        }
        if (!this.f.offer(new defpackage.mku(yzdVar, yyhVar, (defpackage.yyg) aborVar.q(), list))) {
            a.h().ai(8218).u("Cannot queue item because queue overflowing");
            return;
        }
        defpackage.zhs zhsVarB = this.l.b();
        zhsVarB.c(new defpackage.zhi(zhsVarB, new defpackage.rqr(this)), this.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        defpackage.ygw ygwVarO;
        int i;
        int i2;
        defpackage.rrb rrbVar = (defpackage.rrb) this.h.fF();
        synchronized (rrbVar) {
            java.util.Map map = rrbVar.b;
            ygwVarO = defpackage.ygw.o(map.values());
            map.clear();
            i = rrbVar.c;
            i2 = 0;
            rrbVar.c = 0;
        }
        int size = ygwVarO.size();
        while (true) {
            defpackage.rry rryVar = this.e;
            if (i2 >= size) {
                defpackage.rrb.a(rryVar, defpackage.zbd.rA, ygwVarO.size());
                defpackage.rrb.a(rryVar, defpackage.zbd.rB, i);
                return;
            }
            defpackage.rkc rkcVar = (defpackage.rkc) ygwVarO.get(i2);
            defpackage.zbg zbgVar = (defpackage.zbg) ((defpackage.abor) rkcVar.a).q();
            defpackage.abor aborVarK = ((defpackage.abox) rkcVar.b).K();
            aborVarK.t();
            defpackage.yyg yygVar = (defpackage.yyg) aborVarK.b;
            zbgVar.getClass();
            yygVar.o = zbgVar;
            yygVar.b |= 4096;
            defpackage.yyg yygVar2 = (defpackage.yyg) aborVarK.q();
            defpackage.rrb.b(zbgVar);
            rryVar.a(defpackage.yyh.UI, yygVar2, defpackage.ymx.a);
            i2++;
        }
    }

    public final void c(defpackage.rrs rrsVar) {
        defpackage.ygw ygwVarG;
        defpackage.yzd yzdVarF = rrsVar.f();
        defpackage.yyh yyhVarE = rrsVar.e();
        defpackage.abor aborVarG = rrsVar.g();
        defpackage.yhx yhxVarD = rrsVar.d();
        if (yhxVarD == null || yhxVarD.isEmpty()) {
            int i = defpackage.ygw.d;
            ygwVarG = defpackage.ymx.a;
        } else {
            defpackage.ygr ygrVar = new defpackage.ygr(4);
            java.util.Iterator<E> it = yhxVarD.iterator();
            while (it.hasNext()) {
                ygrVar.i(java.lang.Integer.valueOf(((defpackage.acbk) it.next()).a()));
            }
            ygwVarG = ygrVar.g();
        }
        g(yzdVarF, yyhVarE, aborVarG, ygwVarG);
    }

    public final void d(defpackage.yyh yyhVar, defpackage.yyg yygVar) {
        int i = defpackage.ygw.d;
        e(yyhVar, yygVar, defpackage.ymx.a);
    }

    public final void e(defpackage.yyh yyhVar, defpackage.yyg yygVar, java.util.List list) {
        defpackage.yzd yzdVar;
        defpackage.yzc yzcVar = yygVar.O;
        if (yzcVar == null) {
            yzcVar = defpackage.yzc.a;
        }
        if ((yzcVar.b & 1) != 0) {
            defpackage.yzc yzcVar2 = yygVar.O;
            if (yzcVar2 == null) {
                yzcVar2 = defpackage.yzc.a;
            }
            switch (yzcVar2.c) {
                case defpackage.abnt.b /* 0 */:
                    yzdVar = defpackage.yzd.DOMAIN_UNSPECIFIED;
                    break;
                case 1:
                    yzdVar = defpackage.yzd.GEARHEAD;
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    yzdVar = defpackage.yzd.CONNECTIVITY;
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    yzdVar = defpackage.yzd.FRX;
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    yzdVar = defpackage.yzd.CAR_SERVICE;
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    yzdVar = defpackage.yzd.BINDING;
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    yzdVar = defpackage.yzd.PROVIDER;
                    break;
                default:
                    yzdVar = null;
                    break;
            }
            yzdVar.getClass();
        } else {
            yzdVar = defpackage.yzd.DOMAIN_UNSPECIFIED;
        }
        g(yzdVar, yyhVar, yygVar.K(), list);
    }

    public final void f(defpackage.rqs rqsVar) {
        synchronized (b) {
            this.d = rqsVar;
        }
    }
}
