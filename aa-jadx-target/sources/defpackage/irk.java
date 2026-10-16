package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class irk implements defpackage.jbv, defpackage.irt {
    private static final defpackage.absv A;
    private static final defpackage.absv B;
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.AUDIO");
    public static final defpackage.yhx b;
    public static java.util.concurrent.CountDownLatch c;
    private static final defpackage.absv z;
    private final defpackage.iqr C;
    private final defpackage.its D;
    private final defpackage.jfa E;
    private final com.google.android.gms.car.CarInfo F;
    private final defpackage.ilj G;
    private final defpackage.jgq H;
    private final defpackage.isf I;
    private final boolean J;
    private final defpackage.iqc K;
    public final defpackage.irg g;
    public final defpackage.jfo h;
    public final defpackage.jfd i;
    protected final defpackage.jfe j;
    protected final android.content.Context k;
    public final boolean l;
    public final boolean m;
    final boolean n;
    public final defpackage.imn o;
    public volatile defpackage.itd q;
    final defpackage.izq x;
    public final defpackage.mku y;
    public final android.util.SparseArray d = new android.util.SparseArray();
    protected final java.util.concurrent.ScheduledExecutorService e = java.util.concurrent.Executors.newScheduledThreadPool(1);
    public final defpackage.iqj[] v = new defpackage.iqj[3];
    public final defpackage.iqi[] f = new defpackage.iqi[3];
    public final defpackage.iqh[] w = new defpackage.iqh[3];
    public final defpackage.jfu p = new defpackage.jfu("CarAudioService");
    public int r = 5;
    public boolean s = true;
    public boolean t = true;
    public boolean u = false;

    static {
        defpackage.abor aborVarN = defpackage.absv.a.n();
        aborVarN.ai(1);
        aborVarN.ai(2);
        aborVarN.ai(4);
        defpackage.absv absvVar = (defpackage.absv) aborVarN.q();
        z = absvVar;
        A = absvVar;
        defpackage.abor aborVarN2 = defpackage.absv.a.n();
        aborVarN2.ai(2);
        aborVarN2.ai(4);
        aborVarN2.ai(1);
        B = (defpackage.absv) aborVarN2.q();
        b = defpackage.yhx.p(3, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public irk(defpackage.iqg iqgVar, final defpackage.jfo jfoVar, defpackage.jfa jfaVar, defpackage.jfd jfdVar, defpackage.ilj iljVar, defpackage.jfe jfeVar, defpackage.irg irgVar, defpackage.its itsVar, android.content.Context context, defpackage.jgq jgqVar, defpackage.isf isfVar, defpackage.imn imnVar) {
        int i;
        this.h = jfoVar;
        this.E = jfaVar;
        this.D = itsVar;
        this.i = jfdVar;
        this.G = iljVar;
        this.j = jfeVar;
        this.g = irgVar;
        defpackage.iqu iquVar = ((defpackage.irf) irgVar).b;
        this.C = iquVar;
        this.k = context;
        this.H = jgqVar;
        this.I = isfVar;
        com.google.android.gms.car.CarInfo carInfoT = jfaVar.t();
        this.F = carInfoT;
        carInfoT.getClass();
        this.o = imnVar;
        defpackage.absx absxVarB = defpackage.acof.a.fF().b();
        defpackage.yqm yqmVar = defpackage.kjl.a;
        j$.util.stream.Stream streamD = defpackage.tht.d(new defpackage.ilz(16), absxVarB);
        int i2 = defpackage.ygw.d;
        j$.util.stream.Collector collector = defpackage.yds.a;
        boolean zH = defpackage.kjl.h(carInfoT, (defpackage.ygw) streamD.collect(collector));
        this.l = zH;
        defpackage.yqm yqmVar2 = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 1206)).y("force single channel capturing:%b", java.lang.Boolean.valueOf(zH));
        defpackage.lag lagVar = new defpackage.lag(1 == true ? 1 : 0);
        jfoVar.getClass();
        this.y = new defpackage.mku(lagVar, new defpackage.irp() { // from class: irh
            @Override // defpackage.irp
            public final void a(defpackage.rrw rrwVar) {
                jfoVar.b(rrwVar);
            }
        });
        this.q = c();
        defpackage.izq izqVar = new defpackage.izq(this);
        this.x = izqVar;
        int i3 = 16;
        this.K = new defpackage.iqc(context, iquVar, itsVar, izqVar, iqgVar, jfeVar, jfdVar, jfaVar, jfoVar, zH, new defpackage.iqw(2));
        if (iljVar.l()) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 1208)).u("Clean up existing raw audio data on device");
            java.io.File fileB = defpackage.qtq.b(context);
            defpackage.yqm yqmVar3 = ivy.a;
            if (fileB == null) {
                ((defpackage.yqj) ((defpackage.yqj) ivy.a.g()).ai((char) 1424)).u("Failed to get directory");
            } else if (fileB.isDirectory()) {
                long jB = acoi.b();
                java.io.File[] fileArrListFiles = fileB.listFiles();
                long length = 0;
                if (fileArrListFiles != null) {
                    for (java.io.File file : fileArrListFiles) {
                        length += file.length();
                    }
                }
                defpackage.yqm yqmVar4 = ivy.a;
                ((defpackage.yqj) ((defpackage.yqj) yqmVar4.f()).ai(1425)).R("Directory %s has size (in bytes): %d, clean up limit: %d", fileB.getPath(), java.lang.Long.valueOf(length), java.lang.Long.valueOf(jB));
                if (length > jB) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar4.f()).ai((char) 1422)).y("Remove all contents from directory: %s", fileB.getPath());
                    java.io.File[] fileArrListFiles2 = fileB.listFiles();
                    if (fileArrListFiles2 != null) {
                        for (java.io.File file2 : fileArrListFiles2) {
                            file2.delete();
                        }
                    }
                }
            } else {
                ((defpackage.yqj) ((defpackage.yqj) ivy.a.g()).ai((char) 1423)).y("File %s is not directory", fileB.getPath());
            }
        }
        if (c == null) {
            c = new java.util.concurrent.CountDownLatch(1);
            java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
            i = 0;
            executorServiceNewSingleThreadExecutor.execute(new defpackage.iri(i));
            executorServiceNewSingleThreadExecutor.shutdown();
        } else {
            i = 0;
        }
        com.google.android.gms.car.CarInfo carInfo = this.F;
        boolean z2 = (carInfo == null || !defpackage.kjl.h(carInfo, (defpackage.ygw) defpackage.tht.d(new defpackage.ilz(i3), defpackage.acnl.a.fF().l()).collect(collector))) ? i : 1;
        this.m = z2;
        boolean z3 = this.F.e >= 5 ? 1 : i;
        this.J = z3;
        if (z3 == 0) {
            this.n = (defpackage.acnz.h() && z2 == 0) ? 1 : i;
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 1207)).u("Ackless audio enabled for PDK 5.0+");
            this.n = true;
        }
    }

    private static java.lang.String e(int i) {
        if (i != 1) {
            return i != 2 ? "UNKNOWN" : "WIFI";
        }
        return "USB";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x025f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0294  */
    /* JADX WARN: Code duplicated, block: B:113:0x029d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:117:0x02af  */
    /* JADX WARN: Code duplicated, block: B:119:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:120:0x02dc  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:123:0x0305
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // defpackage.jbv
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.izd a(defpackage.xpa r32) {
        /*
            Method dump skipped, instruction units count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irk.a(xpa):izd");
    }

    @Override // defpackage.irt
    public final void b(qwj qwjVar) {
        this.p.b(qwjVar);
        ((defpackage.yqj) a.l().ai((char) 1227)).y("Removed listener %s", qwjVar);
    }

    public final defpackage.itd c() {
        defpackage.irg irgVar = this.g;
        irgVar.getClass();
        defpackage.jfo jfoVar = this.h;
        jfoVar.getClass();
        return new defpackage.itd(this.l, ((defpackage.isw) ((defpackage.irf) irgVar).e).d, this.D, jfoVar);
    }

    public final void d(int i, defpackage.iqi iqiVar, defpackage.iqh iqhVar, defpackage.itd itdVar) {
        int iAb = defpackage.a.ab(i);
        com.google.android.gms.car.CarAudioConfiguration carAudioConfiguration = iqiVar.b;
        itdVar.c(i, carAudioConfiguration.a);
        defpackage.iqj iqjVar = new defpackage.iqj(iqiVar.a, carAudioConfiguration, itdVar, iqiVar.c, iqiVar.d, iqiVar.i, iqiVar.e, iqiVar.g, iqiVar.h, iqiVar.f);
        this.v[iAb] = iqjVar;
        defpackage.irg irgVar = this.g;
        irgVar.getClass();
        irgVar.o(iAb, iqjVar, iqhVar);
    }

    @Override // defpackage.irt
    public final void ev(qwj qwjVar) {
        qwjVar.getClass();
        if (this.p.c(qwjVar, new ixf(qwjVar, 1))) {
            ((defpackage.yqj) a.l().ai((char) 1210)).y("Added listener %s", qwjVar);
        } else {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1209)).y("Failed to add listener %s", qwjVar);
        }
    }
}
