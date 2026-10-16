package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class isc implements defpackage.jcp, defpackage.jba {
    public final defpackage.yqm a;
    public final defpackage.ous b;
    public final defpackage.ove c;
    long d;
    long e;
    long f;
    long g;
    long h;
    long i;
    long j;
    long k;
    long l;
    long m;
    long n;
    long o;
    private final int p;
    private final defpackage.jfx q;
    private final defpackage.jcp r;
    private final defpackage.isf s;
    private isb t;
    private isb u;
    private final java.util.Queue v;
    private int w = -1;
    private int x;
    private long y;
    private final defpackage.izq z;

    public isc(defpackage.iry iryVar) {
        defpackage.izq izqVar = iryVar.h;
        izqVar.getClass();
        this.z = izqVar;
        defpackage.ous ousVar = iryVar.a;
        ousVar.getClass();
        this.b = ousVar;
        defpackage.ove oveVar = iryVar.b;
        oveVar.getClass();
        this.c = oveVar;
        this.a = new defpackage.yqm(defpackage.yrs.d("CAR.AUDIO.".concat(defpackage.dmh.L(oveVar))));
        this.p = iryVar.d;
        defpackage.ire ireVar = new defpackage.ire(this, 3);
        defpackage.yqm yqmVar = defpackage.jfx.a;
        defpackage.jfv jfvVar = new defpackage.jfv(ireVar);
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = iryVar.c;
        scheduledExecutorService.getClass();
        jfvVar.b = scheduledExecutorService;
        jfvVar.b(iryVar.e);
        jfvVar.c(iryVar.e);
        jfvVar.e = java.util.concurrent.TimeUnit.MILLISECONDS;
        this.q = jfvVar.a();
        defpackage.jcp jcpVar = iryVar.f;
        jcpVar.getClass();
        this.r = jcpVar;
        defpackage.isf isfVar = iryVar.g;
        isfVar.getClass();
        this.s = isfVar;
        this.v = new defpackage.yfd((int) defpackage.acxt.a.fF().k());
    }

    private final synchronized isb D() {
        isb isbVar;
        isbVar = this.t;
        if (isbVar == null) {
            isb isbVar2 = new isb(defpackage.abrx.d(), this.p);
            this.s.d();
            this.t = isbVar2;
            this.q.a();
            int i = this.w;
            this.w = i == -1 ? 0 : i + 1;
            ((defpackage.yqj) this.a.l().ai(1259)).D("Session #%d started for stream: %s", this.w, this.c.name());
            isbVar = isbVar2;
        }
        return isbVar;
    }

    private final defpackage.oup E(isb isbVar, defpackage.ouo ouoVar) {
        defpackage.ysr.bk(isbVar.F >= isbVar.G.size(), "event size");
        defpackage.abor aborVarN = defpackage.oup.a.n();
        defpackage.abor aborVarN2 = defpackage.out.a.n();
        int i = this.w;
        aborVarN2.t();
        defpackage.out outVar = (defpackage.out) aborVarN2.b;
        outVar.b |= 1;
        outVar.c = i;
        aborVarN2.t();
        defpackage.out outVar2 = (defpackage.out) aborVarN2.b;
        outVar2.d = this.b.e;
        outVar2.b |= 2;
        aborVarN2.t();
        defpackage.out outVar3 = (defpackage.out) aborVarN2.b;
        outVar3.e = this.c.f;
        outVar3.b |= 4;
        aborVarN.t();
        defpackage.oup oupVar = (defpackage.oup) aborVarN.b;
        defpackage.out outVar4 = (defpackage.out) aborVarN2.q();
        outVar4.getClass();
        oupVar.c = outVar4;
        oupVar.b |= 1;
        int i2 = isbVar.a;
        aborVarN.t();
        defpackage.oup oupVar2 = (defpackage.oup) aborVarN.b;
        oupVar2.b |= 2;
        oupVar2.d = i2;
        aborVarN.t();
        defpackage.oup oupVar3 = (defpackage.oup) aborVarN.b;
        oupVar3.e = ouoVar.d;
        oupVar3.b |= 4;
        defpackage.abqv abqvVarD = defpackage.abrx.d();
        defpackage.abor aborVarN3 = defpackage.ouq.a.n();
        aborVarN3.t();
        defpackage.ouq ouqVar = (defpackage.ouq) aborVarN3.b;
        defpackage.abqv abqvVar = isbVar.b;
        abqvVar.getClass();
        ouqVar.c = abqvVar;
        ouqVar.b |= 1;
        aborVarN3.t();
        defpackage.ouq ouqVar2 = (defpackage.ouq) aborVarN3.b;
        abqvVarD.getClass();
        ouqVar2.d = abqvVarD;
        ouqVar2.b |= 2;
        int i3 = isbVar.d;
        aborVarN3.t();
        defpackage.ouq ouqVar3 = (defpackage.ouq) aborVarN3.b;
        ouqVar3.b |= 8;
        ouqVar3.f = i3;
        int i4 = isbVar.c;
        aborVarN3.t();
        defpackage.ouq ouqVar4 = (defpackage.ouq) aborVarN3.b;
        ouqVar4.b |= 4;
        ouqVar4.e = i4;
        int i5 = isbVar.e;
        aborVarN3.t();
        defpackage.ouq ouqVar5 = (defpackage.ouq) aborVarN3.b;
        ouqVar5.b |= 16;
        ouqVar5.g = i5;
        int i6 = isbVar.g;
        aborVarN3.t();
        defpackage.ouq ouqVar6 = (defpackage.ouq) aborVarN3.b;
        ouqVar6.b |= 64;
        ouqVar6.i = i6;
        int i7 = isbVar.f;
        if (i7 > Integer.MIN_VALUE) {
            aborVarN3.t();
            defpackage.ouq ouqVar7 = (defpackage.ouq) aborVarN3.b;
            ouqVar7.b |= 32;
            ouqVar7.h = i7;
        }
        try {
            isk iskVar = isbVar.o;
            if (iskVar.a > 0) {
                ouw ouwVarF = F(iskVar, new irx(1));
                aborVarN3.t();
                defpackage.ouq ouqVar8 = (defpackage.ouq) aborVarN3.b;
                ouwVarF.getClass();
                ouqVar8.o = ouwVarF;
                ouqVar8.b |= 4096;
            }
            isk iskVar2 = isbVar.j;
            if (iskVar2.a > 0) {
                ouw ouwVarF2 = F(iskVar2, new irx(0));
                aborVarN3.t();
                defpackage.ouq ouqVar9 = (defpackage.ouq) aborVarN3.b;
                ouwVarF2.getClass();
                ouqVar9.j = ouwVarF2;
                ouqVar9.b |= 128;
            }
            isk iskVar3 = isbVar.k;
            if (iskVar3.a > 0) {
                int i8 = (int) isbVar.i;
                aborVarN3.t();
                defpackage.ouq ouqVar10 = (defpackage.ouq) aborVarN3.b;
                ouqVar10.b |= 256;
                ouqVar10.k = i8;
                ouw ouwVarF3 = F(iskVar3, new irx(0));
                aborVarN3.t();
                defpackage.ouq ouqVar11 = (defpackage.ouq) aborVarN3.b;
                ouwVarF3.getClass();
                ouqVar11.l = ouwVarF3;
                ouqVar11.b |= 512;
            }
            isk iskVar4 = isbVar.l;
            if (iskVar4.a > 0) {
                ouw ouwVarF4 = F(iskVar4, new irx(0));
                aborVarN3.t();
                defpackage.ouq ouqVar12 = (defpackage.ouq) aborVarN3.b;
                ouwVarF4.getClass();
                ouqVar12.m = ouwVarF4;
                ouqVar12.b |= 1024;
            }
            isk iskVar5 = isbVar.m;
            if (iskVar5.a > 0) {
                ouw ouwVarF5 = F(iskVar5, new irx(0));
                aborVarN3.t();
                defpackage.ouq ouqVar13 = (defpackage.ouq) aborVarN3.b;
                ouwVarF5.getClass();
                ouqVar13.n = ouwVarF5;
                ouqVar13.b |= 2048;
            }
            isk iskVar6 = isbVar.n;
            if (iskVar6.a > 0) {
                ouw ouwVarF6 = F(iskVar6, new irx(0));
                aborVarN3.t();
                defpackage.ouq ouqVar14 = (defpackage.ouq) aborVarN3.b;
                ouwVarF6.getClass();
                ouqVar14.p = ouwVarF6;
                ouqVar14.b |= 16384;
            }
        } catch (java.lang.IllegalArgumentException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) this.a.h()).p(e)).ai((char) 1249)).u("Failed to convert latency stats");
        }
        isk iskVar7 = isbVar.p;
        if (iskVar7.a > 0) {
            defpackage.abor aborVarN4 = oux.a.n();
            int i9 = iskVar7.a;
            aborVarN4.t();
            oux ouxVar = aborVarN4.b;
            ouxVar.b |= 1;
            ouxVar.c = i9;
            long j = iskVar7.b;
            aborVarN4.t();
            oux ouxVar2 = aborVarN4.b;
            ouxVar2.b |= 2;
            ouxVar2.d = j;
            long j2 = iskVar7.c;
            aborVarN4.t();
            oux ouxVar3 = aborVarN4.b;
            ouxVar3.b |= 4;
            ouxVar3.e = j2;
            long j3 = iskVar7.d;
            aborVarN4.t();
            oux ouxVar4 = aborVarN4.b;
            ouxVar4.b |= 8;
            ouxVar4.f = j3;
            double d = iskVar7.e;
            aborVarN4.t();
            oux ouxVar5 = aborVarN4.b;
            ouxVar5.b |= 16;
            ouxVar5.g = d;
            double dA = iskVar7.a();
            aborVarN4.t();
            oux ouxVar6 = aborVarN4.b;
            ouxVar6.b |= 32;
            ouxVar6.h = dA;
            oux ouxVarQ = aborVarN4.q();
            aborVarN3.t();
            defpackage.ouq ouqVar15 = (defpackage.ouq) aborVarN3.b;
            ouxVarQ.getClass();
            ouqVar15.q = ouxVarQ;
            ouqVar15.b |= 32768;
        }
        java.util.Iterator it = isbVar.E.iterator();
        while (it.hasNext()) {
            aborVarN3.B((ovg) ((defpackage.abor) it.next()).q());
        }
        defpackage.ouq ouqVar16 = (defpackage.ouq) aborVarN3.q();
        aborVarN.t();
        defpackage.oup oupVar4 = (defpackage.oup) aborVarN.b;
        ouqVar16.getClass();
        oupVar4.f = ouqVar16;
        oupVar4.b |= 8;
        java.util.Queue queue = isbVar.G;
        aborVarN.A(queue);
        int size = isbVar.F - queue.size();
        aborVarN.t();
        defpackage.oup oupVar5 = (defpackage.oup) aborVarN.b;
        oupVar5.b |= 16;
        oupVar5.h = size;
        defpackage.oup oupVar6 = (defpackage.oup) aborVarN.q();
        isbVar.a++;
        isbVar.F = 0;
        queue.clear();
        return oupVar6;
    }

    private static ouw F(isk iskVar, irz irzVar) {
        defpackage.abor aborVarN = ouw.a.n();
        int i = iskVar.a;
        aborVarN.t();
        ouw ouwVar = aborVarN.b;
        ouwVar.b |= 1;
        ouwVar.c = i;
        defpackage.aboh abohVarA = irzVar.a(iskVar.b);
        aborVarN.t();
        ouw ouwVar2 = aborVarN.b;
        abohVarA.getClass();
        ouwVar2.d = abohVarA;
        ouwVar2.b |= 2;
        defpackage.aboh abohVarA2 = irzVar.a(iskVar.c);
        aborVarN.t();
        ouw ouwVar3 = aborVarN.b;
        abohVarA2.getClass();
        ouwVar3.e = abohVarA2;
        ouwVar3.b |= 4;
        defpackage.aboh abohVarA3 = irzVar.a(iskVar.d);
        aborVarN.t();
        ouw ouwVar4 = aborVarN.b;
        abohVarA3.getClass();
        ouwVar4.f = abohVarA3;
        ouwVar4.b |= 8;
        defpackage.aboh abohVarA4 = irzVar.a((long) iskVar.e);
        aborVarN.t();
        ouw ouwVar5 = aborVarN.b;
        abohVarA4.getClass();
        ouwVar5.g = abohVarA4;
        ouwVar5.b |= 16;
        defpackage.aboh abohVarA5 = irzVar.a((long) iskVar.a());
        aborVarN.t();
        ouw ouwVar6 = aborVarN.b;
        abohVarA5.getClass();
        ouwVar6.h = abohVarA5;
        ouwVar6.b |= 32;
        return aborVarN.q();
    }

    private final synchronized j$.util.Optional G() {
        return j$.util.Optional.ofNullable(this.t);
    }

    private final synchronized void H(java.io.PrintWriter printWriter) {
        java.util.Queue<isa> queue = this.v;
        if (queue.isEmpty()) {
            printWriter.println("No GUIDANCE stream MediaStats received.");
            return;
        }
        printWriter.println("Last " + queue.size() + " GUIDANCE MediaStats:");
        for (isa isaVar : queue) {
            printWriter.println("  " + java.lang.String.valueOf(isaVar.b.atZone(j$.time.ZoneId.systemDefault()).toLocalDateTime()) + " [Session #" + isaVar.c + "] " + s(isaVar.a, this.c).replace("\n", "\n  "));
        }
    }

    private final synchronized void I(java.io.PrintWriter printWriter) {
        isb isbVar = this.t;
        isb isbVar2 = this.u;
        if (isbVar == null && isbVar2 == null) {
            printWriter.println("No active or previous audio session for MEDIA stream.");
            return;
        }
        if (isbVar == null) {
            printWriter.println("No active audio session for MEDIA stream, dumping last session.");
            isbVar2.getClass();
            isbVar = isbVar2;
        }
        java.util.Queue<isa> queue = isbVar.H;
        if (queue.isEmpty()) {
            printWriter.println("No MEDIA stream MediaStats received for the audio session.");
            return;
        }
        printWriter.println("Last " + queue.size() + " MEDIA MediaStats:");
        for (isa isaVar : queue) {
            printWriter.println("  " + java.lang.String.valueOf(isaVar.b.atZone(j$.time.ZoneId.systemDefault()).toLocalDateTime()) + " " + s(isaVar.a, this.c).replace("\n", "\n  "));
        }
    }

    private final void J() {
        ((defpackage.yqj) ((defpackage.yqj) this.a.f()).ai(1255)).X("Latency stats for stream %s in the last %d aac frames: timeSpentInCaptureThread: [%s, %.2f] ms, timeSpentInTxQ: [%s, %.2f] ms, timeSpentInEncoding: [%s, %.2f] ms, timeSpentInCodecConfig: [%s, %.2f] ms, timeSpentWaitingForAckAndEnqueuingFrames: [%s, %.2f] ms, audioPipelineLatency: [%s, %.2f] ms", defpackage.dmh.L(this.c), java.lang.Integer.valueOf(this.x), java.lang.Long.valueOf(this.d), java.lang.Double.valueOf(this.e / ((double) this.x)), java.lang.Long.valueOf(this.f), java.lang.Double.valueOf(this.g / ((double) this.x)), java.lang.Long.valueOf(this.h), java.lang.Double.valueOf(this.i / ((double) this.x)), java.lang.Long.valueOf(this.j), java.lang.Double.valueOf(this.k / ((double) this.x)), java.lang.Long.valueOf(this.l), java.lang.Double.valueOf(this.m / ((double) this.x)), java.lang.Long.valueOf(this.n), java.lang.Double.valueOf(this.o / ((double) this.x)));
        N();
    }

    private final void K() {
        ((defpackage.yqj) ((defpackage.yqj) this.a.f()).ai(1256)).W("Latency stats for stream %s in the last %d pcm frames: timeSpentInCaptureThread: [%s, %.2f] ms, timeSpentInTxQ: [%s, %.2f] ms, timeSpentWaitingForAckAndEnqueuingFrames: [%s, %.2f] ms, audioPipelineLatency: [%s, %.2f] ms", defpackage.dmh.L(this.c), java.lang.Integer.valueOf(this.x), java.lang.Long.valueOf(this.d), java.lang.Double.valueOf(this.e / ((double) this.x)), java.lang.Long.valueOf(this.f), java.lang.Double.valueOf(this.g / ((double) this.x)), java.lang.Long.valueOf(this.l), java.lang.Double.valueOf(this.m / ((double) this.x)), java.lang.Long.valueOf(this.n), java.lang.Double.valueOf(this.o / ((double) this.x)));
        N();
    }

    private final synchronized void L(defpackage.oup oupVar, long j) {
        if (j < 0) {
            return;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i = 10;
        if (jElapsedRealtime - this.y < j) {
            ((defpackage.yqj) ((defpackage.yqj) this.a.l().l(10, java.util.concurrent.TimeUnit.SECONDS)).ai(1257)).R("Skip logging audio stream session stats, current time: %s, last time: %s, threshold: %s", java.lang.Long.valueOf(jElapsedRealtime), java.lang.Long.valueOf(this.y), java.lang.Long.valueOf(j));
            return;
        }
        defpackage.abor aborVarN = defpackage.yxu.a.n();
        defpackage.ove oveVar = this.c;
        aborVarN.t();
        defpackage.yxu yxuVar = (defpackage.yxu) aborVarN.b;
        yxuVar.b |= 128;
        yxuVar.j = oveVar.f;
        defpackage.ous ousVar = this.b;
        aborVarN.t();
        defpackage.yxu yxuVar2 = (defpackage.yxu) aborVarN.b;
        yxuVar2.b |= 64;
        yxuVar2.i = ousVar.e;
        defpackage.ouq ouqVar = oupVar.f;
        if (ouqVar == null) {
            ouqVar = defpackage.ouq.a;
        }
        ouw ouwVar = ouqVar.j;
        if (ouwVar == null) {
            ouwVar = ouw.a;
        }
        defpackage.aboh abohVar = ouwVar.f;
        if (abohVar == null) {
            abohVar = defpackage.aboh.a;
        }
        int iA = (int) defpackage.abrv.a(abohVar);
        aborVarN.t();
        defpackage.yxu yxuVar3 = (defpackage.yxu) aborVarN.b;
        yxuVar3.b |= 262144;
        yxuVar3.u = iA;
        ouw ouwVar2 = ouqVar.m;
        if (ouwVar2 == null) {
            ouwVar2 = ouw.a;
        }
        defpackage.aboh abohVar2 = ouwVar2.f;
        if (abohVar2 == null) {
            abohVar2 = defpackage.aboh.a;
        }
        int iA2 = (int) defpackage.abrv.a(abohVar2);
        aborVarN.t();
        defpackage.yxu yxuVar4 = (defpackage.yxu) aborVarN.b;
        yxuVar4.b |= 1048576;
        yxuVar4.w = iA2;
        ouw ouwVar3 = ouqVar.n;
        if (ouwVar3 == null) {
            ouwVar3 = ouw.a;
        }
        defpackage.aboh abohVar3 = ouwVar3.f;
        if (abohVar3 == null) {
            abohVar3 = defpackage.aboh.a;
        }
        int iA3 = (int) defpackage.abrv.a(abohVar3);
        aborVarN.t();
        defpackage.yxu yxuVar5 = (defpackage.yxu) aborVarN.b;
        yxuVar5.b |= 8192;
        yxuVar5.p = iA3;
        ouw ouwVar4 = ouqVar.p;
        if (ouwVar4 == null) {
            ouwVar4 = ouw.a;
        }
        defpackage.aboh abohVar4 = ouwVar4.f;
        if (abohVar4 == null) {
            abohVar4 = defpackage.aboh.a;
        }
        int iA4 = (int) defpackage.abrv.a(abohVar4);
        aborVarN.t();
        defpackage.yxu yxuVar6 = (defpackage.yxu) aborVarN.b;
        yxuVar6.b |= 4194304;
        yxuVar6.x = iA4;
        if (ousVar == defpackage.ous.AAC_LC || ousVar == defpackage.ous.AAC_LC_ADTS) {
            int i2 = ouqVar.k;
            aborVarN.t();
            defpackage.yxu yxuVar7 = (defpackage.yxu) aborVarN.b;
            yxuVar7.b |= 8388608;
            yxuVar7.y = i2;
            ouw ouwVar5 = ouqVar.l;
            if (ouwVar5 == null) {
                ouwVar5 = ouw.a;
            }
            defpackage.aboh abohVar5 = ouwVar5.f;
            if (abohVar5 == null) {
                abohVar5 = defpackage.aboh.a;
            }
            int iA5 = (int) defpackage.abrv.a(abohVar5);
            aborVarN.t();
            defpackage.yxu yxuVar8 = (defpackage.yxu) aborVarN.b;
            yxuVar8.b |= 524288;
            yxuVar8.v = iA5;
        }
        isb isbVar = this.t;
        isbVar.getClass();
        j$.util.Optional optionalA = isbVar.r.a();
        defpackage.ilx ilxVar = new defpackage.ilx(aborVarN, 9);
        if (true == optionalA.isPresent()) {
            java.lang.Object obj = optionalA.get();
            java.lang.Object obj2 = ilxVar.a;
            ((defpackage.abor) obj2).t();
            defpackage.yxu yxuVar9 = (defpackage.yxu) ((defpackage.abor) obj2).b;
            yxuVar9.z = (yzv) obj;
            yxuVar9.b |= 16777216;
        }
        j$.util.Optional optionalA2 = isbVar.s.a();
        defpackage.ilx ilxVar2 = new defpackage.ilx(aborVarN, i);
        if (true == optionalA2.isPresent()) {
            java.lang.Object obj3 = optionalA2.get();
            java.lang.Object obj4 = ilxVar2.a;
            ((defpackage.abor) obj4).t();
            defpackage.yxu yxuVar10 = (defpackage.yxu) ((defpackage.abor) obj4).b;
            yxuVar10.A = (yzv) obj3;
            yxuVar10.b |= 33554432;
        }
        j$.util.Optional optionalA3 = isbVar.t.a();
        defpackage.ilx ilxVar3 = new defpackage.ilx(aborVarN, 11);
        if (true == optionalA3.isPresent()) {
            java.lang.Object obj5 = optionalA3.get();
            java.lang.Object obj6 = ilxVar3.a;
            ((defpackage.abor) obj6).t();
            defpackage.yxu yxuVar11 = (defpackage.yxu) ((defpackage.abor) obj6).b;
            yxuVar11.B = (yzv) obj5;
            yxuVar11.b |= 67108864;
        }
        j$.util.Optional optionalA4 = isbVar.u.a();
        defpackage.ilx ilxVar4 = new defpackage.ilx(aborVarN, 12);
        if (true == optionalA4.isPresent()) {
            java.lang.Object obj7 = optionalA4.get();
            java.lang.Object obj8 = ilxVar4.a;
            ((defpackage.abor) obj8).t();
            defpackage.yxu yxuVar12 = (defpackage.yxu) ((defpackage.abor) obj8).b;
            yxuVar12.C = (yzv) obj7;
            yxuVar12.b |= 134217728;
        }
        j$.util.Optional optionalA5 = isbVar.v.a();
        defpackage.ilx ilxVar5 = new defpackage.ilx(aborVarN, 13);
        if (true == optionalA5.isPresent()) {
            java.lang.Object obj9 = optionalA5.get();
            java.lang.Object obj10 = ilxVar5.a;
            ((defpackage.abor) obj10).t();
            defpackage.yxu yxuVar13 = (defpackage.yxu) ((defpackage.abor) obj10).b;
            yxuVar13.D = (yzv) obj9;
            yxuVar13.b |= 268435456;
        }
        j$.util.Optional optionalA6 = isbVar.w.a();
        defpackage.ilx ilxVar6 = new defpackage.ilx(aborVarN, 14);
        if (true == optionalA6.isPresent()) {
            java.lang.Object obj11 = optionalA6.get();
            java.lang.Object obj12 = ilxVar6.a;
            ((defpackage.abor) obj12).t();
            defpackage.yxu yxuVar14 = (defpackage.yxu) ((defpackage.abor) obj12).b;
            yxuVar14.E = (yzv) obj11;
            yxuVar14.b |= 536870912;
        }
        j$.util.Optional optionalA7 = this.s.a();
        j$.util.Optional optionalOfNullable = true != optionalA7.isPresent() ? optionalA7 : j$.util.Optional.ofNullable(((ise) optionalA7.get()).a);
        defpackage.ilx ilxVar7 = new defpackage.ilx(aborVarN, 4);
        if (true == optionalOfNullable.isPresent()) {
            java.lang.Object obj13 = optionalOfNullable.get();
            java.lang.Object obj14 = ilxVar7.a;
            ((defpackage.abor) obj14).t();
            defpackage.yxu yxuVar15 = (defpackage.yxu) ((defpackage.abor) obj14).b;
            yxuVar15.F = (yzv) obj13;
            yxuVar15.b |= 1073741824;
        }
        if (true == optionalA7.isPresent()) {
            optionalA7 = j$.util.Optional.ofNullable(((ise) optionalA7.get()).b);
        }
        defpackage.ilx ilxVar8 = new defpackage.ilx(aborVarN, 5);
        if (true == optionalA7.isPresent()) {
            java.lang.Object obj15 = optionalA7.get();
            java.lang.Object obj16 = ilxVar8.a;
            ((defpackage.abor) obj16).t();
            defpackage.yxu yxuVar16 = (defpackage.yxu) ((defpackage.abor) obj16).b;
            yxuVar16.G = (yzv) obj15;
            yxuVar16.b |= Integer.MIN_VALUE;
        }
        c((defpackage.yxu) aborVarN.q());
        this.y = jElapsedRealtime;
    }

    private final synchronized void M() {
        isb isbVar;
        if (defpackage.acuc.c() && (isbVar = this.t) != null) {
            java.util.Queue queue = isbVar.H;
            if (!queue.isEmpty()) {
                defpackage.abor aborVarN = defpackage.yzy.a.n();
                java.util.Iterator it = queue.iterator();
                long jA = 0;
                long j = 0;
                long j2 = 0;
                long j3 = 0;
                while (it.hasNext()) {
                    defpackage.xlr xlrVar = ((isa) it.next()).a;
                    defpackage.aboh abohVar = xlrVar.c;
                    if (abohVar == null) {
                        abohVar = defpackage.aboh.a;
                    }
                    jA += defpackage.abrv.a(abohVar);
                    j += xlrVar.d;
                    j2 += xlrVar.f;
                    j3 += xlrVar.e;
                }
                aborVarN.t();
                defpackage.yzy yzyVar = (defpackage.yzy) aborVarN.b;
                yzyVar.b |= 1;
                yzyVar.c = jA;
                aborVarN.t();
                defpackage.yzy yzyVar2 = (defpackage.yzy) aborVarN.b;
                yzyVar2.b |= 2;
                yzyVar2.d = j;
                aborVarN.t();
                defpackage.yzy yzyVar3 = (defpackage.yzy) aborVarN.b;
                yzyVar3.b |= 4;
                yzyVar3.e = j2;
                aborVarN.t();
                defpackage.yzy yzyVar4 = (defpackage.yzy) aborVarN.b;
                int i = 8;
                yzyVar4.b |= 8;
                yzyVar4.f = j3;
                defpackage.ove oveVar = this.c;
                aborVarN.t();
                defpackage.yzy yzyVar5 = (defpackage.yzy) aborVarN.b;
                yzyVar5.b |= 32768;
                yzyVar5.r = oveVar.f;
                if (!queue.isEmpty()) {
                    long j4 = ((isa) queue.iterator().next()).a.k;
                    aborVarN.t();
                    defpackage.yzy yzyVar6 = (defpackage.yzy) aborVarN.b;
                    yzyVar6.b |= 256;
                    yzyVar6.k = j4;
                }
                j$.util.Optional optionalB = isbVar.B.b();
                aborVarN.getClass();
                defpackage.ilx ilxVar = new defpackage.ilx(aborVarN, 3);
                if (true == optionalB.isPresent()) {
                    java.lang.Object obj = optionalB.get();
                    java.lang.Object obj2 = ilxVar.a;
                    ((defpackage.abor) obj2).t();
                    defpackage.yzy yzyVar7 = (defpackage.yzy) ((defpackage.abor) obj2).b;
                    yzyVar7.g = (zat) obj;
                    yzyVar7.b |= 16;
                }
                j$.util.Optional optionalB2 = isbVar.A.b();
                defpackage.ilx ilxVar2 = new defpackage.ilx(aborVarN, 6);
                if (true == optionalB2.isPresent()) {
                    java.lang.Object obj3 = optionalB2.get();
                    java.lang.Object obj4 = ilxVar2.a;
                    ((defpackage.abor) obj4).t();
                    defpackage.yzy yzyVar8 = (defpackage.yzy) ((defpackage.abor) obj4).b;
                    yzyVar8.h = (zat) obj3;
                    yzyVar8.b |= 32;
                }
                j$.util.Optional optionalB3 = isbVar.C.b();
                defpackage.ilx ilxVar3 = new defpackage.ilx(aborVarN, 7);
                if (true == optionalB3.isPresent()) {
                    java.lang.Object obj5 = optionalB3.get();
                    java.lang.Object obj6 = ilxVar3.a;
                    ((defpackage.abor) obj6).t();
                    defpackage.yzy yzyVar9 = (defpackage.yzy) ((defpackage.abor) obj6).b;
                    yzyVar9.i = (zat) obj5;
                    yzyVar9.b |= 64;
                }
                j$.util.Optional optionalB4 = isbVar.D.b();
                defpackage.ilx ilxVar4 = new defpackage.ilx(aborVarN, i);
                if (true == optionalB4.isPresent()) {
                    java.lang.Object obj7 = optionalB4.get();
                    java.lang.Object obj8 = ilxVar4.a;
                    ((defpackage.abor) obj8).t();
                    defpackage.yzy yzyVar10 = (defpackage.yzy) ((defpackage.abor) obj8).b;
                    yzyVar10.j = (zat) obj7;
                    yzyVar10.b |= 128;
                }
                o((defpackage.yzy) aborVarN.q());
            }
        }
    }

    private final void N() {
        this.x = 0;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
        this.n = 0L;
        this.o = 0L;
    }

    private final void O(defpackage.ipy ipyVar) {
        j$.util.Optional optionalG = G();
        kgd kgdVar = new kgd(this, ipyVar, 1, (byte[]) null);
        if (true != optionalG.isPresent()) {
            return;
        }
        java.lang.Object obj = optionalG.get();
        java.lang.Object obj2 = kgdVar.b;
        isb isbVar = (isb) obj;
        defpackage.ipy ipyVar2 = (defpackage.ipy) kgdVar.a;
        if (ipyVar2.c() > isbVar.h) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) ((defpackage.isc) obj2).a.f()).l(1, java.util.concurrent.TimeUnit.SECONDS)).ai(1254)).x("Audio pipeline latency on MD increased to %d ms", ipyVar2.c());
        }
        isbVar.h = java.lang.Math.max(isbVar.h, ipyVar2.c());
        isbVar.j.b(ipyVar2.g());
        defpackage.isc iscVar = (defpackage.isc) obj2;
        defpackage.ous ousVar = iscVar.b;
        defpackage.ous ousVar2 = defpackage.ous.PCM;
        if (ousVar == ousVar2) {
            isbVar.l.b(ipyVar2.i());
        }
        defpackage.ous ousVar3 = defpackage.ous.AAC_LC;
        if (ousVar == ousVar3 || ousVar == defpackage.ous.AAC_LC_ADTS) {
            isk iskVar = isbVar.k;
            if (iskVar.a == 0) {
                ((defpackage.yqj) iscVar.a.l().ai(1253)).x("Encoding latency for the first frame: %s ms", ipyVar2.f());
                isbVar.i = ipyVar2.f();
            }
            iskVar.b(ipyVar2.f());
            isbVar.l.b(ipyVar2.h());
        }
        isbVar.r.c(ipyVar2.d(), 1);
        isbVar.s.c(ipyVar2.g(), 1);
        if (ousVar == ousVar2) {
            isbVar.u.c(ipyVar2.i(), 1);
        }
        if (ousVar == ousVar3 || ousVar == defpackage.ous.AAC_LC_ADTS) {
            isbVar.t.c(ipyVar2.f(), 1);
            isbVar.u.c(ipyVar2.h(), 1);
        }
    }

    private static final void P(defpackage.abor aborVar) {
        defpackage.ysr.aY(1 == (((defpackage.ovm) aborVar.b).b & 1), "event.hasTag()");
        defpackage.ysr.aY((((defpackage.ovm) aborVar.b).b & 4) != 0, "event.hasEventType()");
        defpackage.abqv abqvVarD = defpackage.abrx.d();
        aborVar.t();
        defpackage.ovm ovmVar = (defpackage.ovm) aborVar.b;
        abqvVarD.getClass();
        ovmVar.d = abqvVarD;
        ovmVar.b |= 2;
    }

    public static java.lang.String s(defpackage.xlr xlrVar, defpackage.ove oveVar) {
        defpackage.xif xifVar = xlrVar.g;
        if (xifVar == null) {
            xifVar = defpackage.xif.a;
        }
        defpackage.xif xifVar2 = xlrVar.h;
        if (xifVar2 == null) {
            xifVar2 = defpackage.xif.a;
        }
        defpackage.xif xifVar3 = xlrVar.i;
        if (xifVar3 == null) {
            xifVar3 = defpackage.xif.a;
        }
        defpackage.xif xifVar4 = xlrVar.j;
        if (xifVar4 == null) {
            xifVar4 = defpackage.xif.a;
        }
        java.util.Locale locale = java.util.Locale.US;
        java.lang.String strName = oveVar.name();
        defpackage.aboh abohVar = xlrVar.c;
        if (abohVar == null) {
            abohVar = defpackage.aboh.a;
        }
        return java.lang.String.format(locale, "Media stats for stream %s in the last %d ms and %d frames:\n  Audio overflow count: %d\n  Audio underrun count: %d\n  Estimated Audio Buffer (us): {avg: %d, min: %d, max: %d, count: %d}\n  Audio/Video lag (us): {avg: %d, min: %d, max: %d, count: %d}\n  Audio delay (us): {avg: %d, min: %d, max: %d, count: %d}\n  Video delay (us): {avg: %d, min: %d, max: %d, count: %d}\n  Audio output latency offset: %d us", strName, java.lang.Long.valueOf(defpackage.abrv.a(abohVar)), java.lang.Long.valueOf(xlrVar.d), java.lang.Long.valueOf(xlrVar.e), java.lang.Long.valueOf(xlrVar.f), java.lang.Long.valueOf(xifVar.b), java.lang.Long.valueOf(xifVar.c), java.lang.Long.valueOf(xifVar.d), java.lang.Long.valueOf(xifVar.e), java.lang.Long.valueOf(xifVar2.b), java.lang.Long.valueOf(xifVar2.c), java.lang.Long.valueOf(xifVar2.d), java.lang.Long.valueOf(xifVar2.e), java.lang.Long.valueOf(xifVar3.b), java.lang.Long.valueOf(xifVar3.c), java.lang.Long.valueOf(xifVar3.d), java.lang.Long.valueOf(xifVar3.e), java.lang.Long.valueOf(xifVar4.b), java.lang.Long.valueOf(xifVar4.c), java.lang.Long.valueOf(xifVar4.d), java.lang.Long.valueOf(xifVar4.e), java.lang.Long.valueOf(xlrVar.k));
    }

    @Override // defpackage.jba
    public final synchronized void A(defpackage.abor aborVar) {
        P(aborVar);
        isb isbVar = this.t;
        if (isbVar == null) {
            B(aborVar);
            return;
        }
        isbVar.G.add((defpackage.ovm) aborVar.q());
        isbVar.F++;
    }

    @Override // defpackage.jba
    public final void B(defpackage.abor aborVar) {
        P(aborVar);
        defpackage.ovm ovmVar = (defpackage.ovm) aborVar.q();
        defpackage.abor aborVarN = defpackage.oup.a.n();
        defpackage.abor aborVarN2 = defpackage.out.a.n();
        aborVarN2.t();
        defpackage.out outVar = (defpackage.out) aborVarN2.b;
        outVar.d = this.b.e;
        outVar.b |= 2;
        aborVarN2.t();
        defpackage.out outVar2 = (defpackage.out) aborVarN2.b;
        outVar2.e = this.c.f;
        outVar2.b |= 4;
        aborVarN.t();
        defpackage.oup oupVar = (defpackage.oup) aborVarN.b;
        defpackage.out outVar3 = (defpackage.out) aborVarN2.q();
        outVar3.getClass();
        oupVar.c = outVar3;
        oupVar.b |= 1;
        defpackage.ouo ouoVar = defpackage.ouo.NOT_STREAMING;
        aborVarN.t();
        defpackage.oup oupVar2 = (defpackage.oup) aborVarN.b;
        oupVar2.e = ouoVar.d;
        oupVar2.b |= 4;
        int i = defpackage.ygw.d;
        java.lang.Object[] objArr = {ovmVar};
        defpackage.ysr.B(objArr, 1);
        aborVarN.A(new defpackage.ymx(objArr, 1));
        this.z.b((defpackage.oup) aborVarN.q());
    }

    public final synchronized void C(defpackage.abor aborVar) {
        P(aborVar);
        isb isbVarD = D();
        isbVarD.G.add((defpackage.ovm) aborVar.q());
        isbVarD.F++;
    }

    @Override // defpackage.jcp
    public final synchronized void a() {
        this.r.a();
        if (this.x > 0) {
            if (this.b == defpackage.ous.PCM) {
                K();
            } else {
                J();
            }
        }
    }

    @Override // defpackage.jdy
    public final synchronized void b(int i) {
        this.r.b(i);
    }

    @Override // defpackage.jcp
    public final synchronized void c(defpackage.yxu yxuVar) {
        this.r.c(yxuVar);
    }

    @Override // defpackage.jdy
    public final synchronized void d(int i) {
        j$.util.Optional optionalG = G();
        defpackage.iru iruVar = new defpackage.iru(i, 0);
        if (true == optionalG.isPresent()) {
            ((isb) optionalG.get()).p.b(iruVar.a);
        }
        this.r.d(i);
    }

    @Override // defpackage.jdy
    public final synchronized void e() {
        j$.util.Optional optionalG = G();
        if (true == optionalG.isPresent()) {
            ((isb) optionalG.get()).e++;
        }
        this.r.e();
    }

    @Override // defpackage.jdy
    public final synchronized void f(long j, long j2) {
        j$.util.Optional optionalG = G();
        irv irvVar = new irv(j, 1);
        if (true == optionalG.isPresent()) {
            java.lang.Object obj = optionalG.get();
            ((isb) obj).o.b(irvVar.a);
        }
        this.r.f(j, j2);
    }

    @Override // defpackage.jdy
    public final synchronized void g(int i) {
        throw new java.lang.UnsupportedOperationException("log frame encoded not supported in AudioStreamDiagnosticsTracker");
    }

    @Override // defpackage.jdy
    public final synchronized void h(long j) {
        j$.util.Optional optionalG = G();
        irv irvVar = new irv(j, 0);
        if (true == optionalG.isPresent()) {
            java.lang.Object obj = optionalG.get();
            long j2 = irvVar.a;
            isb isbVar = (isb) obj;
            isbVar.n.b(j2);
            isbVar.w.c(j2, 1);
        }
        this.r.h(j);
    }

    @Override // defpackage.jdy
    public final void i() {
        throw new java.lang.UnsupportedOperationException("log frame lost in encoder not supported in AudioStreamDiagnosticsTracker");
    }

    @Override // defpackage.jdy
    public final synchronized void k(int i) {
        G().ifPresentOrElse(new irw(i), new defpackage.hif(this, i, 3));
        this.r.k(i);
    }

    @Override // defpackage.jdy
    public final synchronized void m(int i) {
        j$.util.Optional optionalG = G();
        defpackage.iru iruVar = new defpackage.iru(i, 2);
        if (true == optionalG.isPresent()) {
            ((isb) optionalG.get()).f = iruVar.a;
        }
        this.r.m(i);
    }

    @Override // defpackage.jdy
    public final synchronized void n(defpackage.xlr xlrVar) {
        j$.time.Instant instantNow = j$.time.Instant.now();
        isb isbVar = this.t;
        if (isbVar == null) {
            isbVar = this.u;
        }
        isa isaVar = new isa(xlrVar, instantNow, this.w);
        if (isbVar != null) {
            isbVar.H.add(isaVar);
        }
        if (this.c.equals(defpackage.ove.GUIDANCE)) {
            this.v.add(isaVar);
        }
        if (isbVar != null && defpackage.acuc.c()) {
            if ((xlrVar.b & 16) != 0) {
                defpackage.xif xifVar = xlrVar.g;
                if (xifVar == null) {
                    xifVar = defpackage.xif.a;
                }
                defpackage.iup iupVar = isbVar.B;
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MICROSECONDS;
                iupVar.c(xifVar.b / 1000, (int) xifVar.e);
            }
            if ((xlrVar.b & 32) != 0) {
                defpackage.xif xifVar2 = xlrVar.h;
                if (xifVar2 == null) {
                    xifVar2 = defpackage.xif.a;
                }
                defpackage.iup iupVar2 = isbVar.A;
                java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MICROSECONDS;
                iupVar2.c(xifVar2.b / 1000, (int) xifVar2.e);
            }
            if ((xlrVar.b & 64) != 0) {
                defpackage.xif xifVar3 = xlrVar.i;
                if (xifVar3 == null) {
                    xifVar3 = defpackage.xif.a;
                }
                defpackage.iup iupVar3 = isbVar.C;
                java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.MICROSECONDS;
                iupVar3.c(xifVar3.b / 1000, (int) xifVar3.e);
            }
            if ((xlrVar.b & 128) != 0) {
                defpackage.xif xifVar4 = xlrVar.j;
                if (xifVar4 == null) {
                    xifVar4 = defpackage.xif.a;
                }
                defpackage.iup iupVar4 = isbVar.D;
                java.util.concurrent.TimeUnit timeUnit4 = java.util.concurrent.TimeUnit.MICROSECONDS;
                iupVar4.c(xifVar4.b / 1000, (int) xifVar4.e);
            }
        }
    }

    @Override // defpackage.jcp
    public final synchronized void o(defpackage.yzy yzyVar) {
        this.r.o(yzyVar);
    }

    @Override // defpackage.jdy
    public final synchronized void p() {
        j$.util.Optional optionalG = G();
        if (true == optionalG.isPresent()) {
            ((isb) optionalG.get()).g++;
        }
        this.r.p();
    }

    @Override // defpackage.jdy
    public final synchronized void q(long j) {
        j$.util.Optional optionalG = G();
        irv irvVar = new irv(j, 2);
        if (true == optionalG.isPresent()) {
            java.lang.Object obj = optionalG.get();
            long j2 = irvVar.a;
            isb isbVar = (isb) obj;
            isbVar.m.b(j2);
            isbVar.v.c(j2, 1);
        }
        this.r.q(j);
    }

    @Override // defpackage.jdy
    public final synchronized void r() {
        this.r.r();
    }

    public final synchronized void t(java.io.PrintWriter printWriter) {
        defpackage.ove oveVar = this.c;
        if (oveVar == defpackage.ove.MEDIA) {
            I(printWriter);
        } else if (oveVar == defpackage.ove.GUIDANCE) {
            H(printWriter);
        } else {
            printWriter.println("Dumping not supported for stream type: ".concat(java.lang.String.valueOf(oveVar.name())));
        }
    }

    @Override // defpackage.jba
    public final synchronized void u(boolean z) {
        isb isbVar = this.t;
        if (isbVar == null) {
            ((defpackage.yqj) this.a.l().ai(1251)).u("Session has ended or did not start.");
            return;
        }
        if (z || isbVar.d == 0) {
            defpackage.oup oupVarE = E(isbVar, defpackage.ouo.NOT_STREAMING);
            this.z.b(oupVarE);
            this.q.b();
            defpackage.ove oveVar = this.c;
            if (oveVar == defpackage.ove.MEDIA) {
                isb isbVar2 = this.t;
                isbVar2.getClass();
                if (isbVar2.d > (this.b == defpackage.ous.PCM ? defpackage.acnw.c() : defpackage.acnw.d())) {
                    L(oupVarE, defpackage.acnw.g());
                }
            }
            M();
            this.u = this.t;
            this.t = null;
            ((defpackage.yqj) this.a.l().ai(1250)).D("Session #%d ended for stream: %s", this.w, oveVar.name());
        }
    }

    public final synchronized void v(defpackage.ipy ipyVar) {
        O(ipyVar);
        this.x++;
        this.d = java.lang.Math.max(ipyVar.d(), this.d);
        this.e += ipyVar.d();
        this.f = java.lang.Math.max(ipyVar.g(), this.f);
        this.g += ipyVar.g();
        this.h = java.lang.Math.max(ipyVar.f(), this.h);
        this.i += ipyVar.f();
        this.j = java.lang.Math.max(ipyVar.e(), this.j);
        this.k += ipyVar.e();
        this.l = java.lang.Math.max(ipyVar.h(), this.l);
        this.m += ipyVar.h();
        this.n = java.lang.Math.max(ipyVar.c(), this.n);
        this.o += ipyVar.c();
        if (this.x >= 234) {
            J();
        }
    }

    @Override // defpackage.jba
    public final synchronized void w(java.lang.String str, defpackage.ovf ovfVar) {
        isb isbVar = this.t;
        if (isbVar != null) {
            java.util.List<defpackage.abor> list = isbVar.E;
            for (defpackage.abor aborVar : list) {
                ovg ovgVar = aborVar.b;
                if (str.equals(ovgVar.c)) {
                    defpackage.ovf ovfVarB = defpackage.ovf.b(ovgVar.d);
                    if (ovfVarB == null) {
                        ovfVarB = defpackage.ovf.DROPPED_MEDIA_STREAM_FRAME_REASON_UNSPECIFIED;
                    }
                    if (ovfVar.equals(ovfVarB)) {
                        int i = aborVar.b.e + 1;
                        aborVar.t();
                        ovg ovgVar2 = aborVar.b;
                        ovgVar2.b |= 4;
                        ovgVar2.e = i;
                        return;
                    }
                }
            }
            defpackage.abor aborVarN = ovg.a.n();
            aborVarN.t();
            ovg ovgVar3 = aborVarN.b;
            ovgVar3.b |= 1;
            ovgVar3.c = str;
            aborVarN.t();
            ovg ovgVar4 = aborVarN.b;
            ovgVar4.d = ovfVar.k;
            ovgVar4.b |= 2;
            aborVarN.t();
            ovg ovgVar5 = aborVarN.b;
            ovgVar5.b |= 4;
            ovgVar5.e = 1;
            int i2 = isbVar.d;
            aborVarN.t();
            ovg ovgVar6 = aborVarN.b;
            ovgVar6.b |= 8;
            ovgVar6.f = i2;
            defpackage.abqv abqvVarD = defpackage.abrx.d();
            aborVarN.t();
            ovg ovgVar7 = aborVarN.b;
            abqvVarD.getClass();
            ovgVar7.g = abqvVarD;
            ovgVar7.b |= 16;
            list.add(aborVarN);
            return;
        }
        defpackage.abor aborVarN2 = ovg.a.n();
        aborVarN2.t();
        ovg ovgVar8 = aborVarN2.b;
        ovgVar8.b |= 1;
        ovgVar8.c = str;
        aborVarN2.t();
        ovg ovgVar9 = aborVarN2.b;
        ovgVar9.d = ovfVar.k;
        ovgVar9.b |= 2;
        aborVarN2.t();
        ovg ovgVar10 = aborVarN2.b;
        ovgVar10.b |= 4;
        ovgVar10.e = 1;
        defpackage.abqv abqvVarD2 = defpackage.abrx.d();
        aborVarN2.t();
        ovg ovgVar11 = aborVarN2.b;
        abqvVarD2.getClass();
        ovgVar11.g = abqvVarD2;
        ovgVar11.b |= 16;
        ovg ovgVarQ = aborVarN2.q();
        defpackage.izq izqVar = this.z;
        defpackage.abor aborVarN3 = defpackage.ouq.a.n();
        defpackage.abqv abqvVar = ovgVarQ.g;
        if (abqvVar == null) {
            abqvVar = defpackage.abqv.a;
        }
        aborVarN3.t();
        defpackage.ouq ouqVar = (defpackage.ouq) aborVarN3.b;
        abqvVar.getClass();
        ouqVar.c = abqvVar;
        ouqVar.b |= 1;
        aborVarN3.B(ovgVarQ);
        defpackage.abor aborVarN4 = defpackage.oup.a.n();
        defpackage.abor aborVarN5 = defpackage.out.a.n();
        defpackage.ous ousVar = this.b;
        aborVarN5.t();
        defpackage.out outVar = (defpackage.out) aborVarN5.b;
        outVar.d = ousVar.e;
        outVar.b |= 2;
        defpackage.ove oveVar = this.c;
        aborVarN5.t();
        defpackage.out outVar2 = (defpackage.out) aborVarN5.b;
        outVar2.e = oveVar.f;
        outVar2.b |= 4;
        aborVarN4.t();
        defpackage.oup oupVar = (defpackage.oup) aborVarN4.b;
        defpackage.out outVar3 = (defpackage.out) aborVarN5.q();
        outVar3.getClass();
        oupVar.c = outVar3;
        oupVar.b = 1 | oupVar.b;
        defpackage.ouo ouoVar = defpackage.ouo.NOT_STREAMING;
        aborVarN4.t();
        defpackage.oup oupVar2 = (defpackage.oup) aborVarN4.b;
        oupVar2.e = ouoVar.d;
        oupVar2.b |= 4;
        defpackage.ouq ouqVar2 = (defpackage.ouq) aborVarN3.q();
        aborVarN4.t();
        defpackage.oup oupVar3 = (defpackage.oup) aborVarN4.b;
        ouqVar2.getClass();
        oupVar3.f = ouqVar2;
        oupVar3.b |= 8;
        izqVar.b((defpackage.oup) aborVarN4.q());
    }

    public final synchronized void x(defpackage.ipy ipyVar) {
        O(ipyVar);
        this.x++;
        this.d = java.lang.Math.max(ipyVar.d(), this.d);
        this.e += ipyVar.d();
        this.f = java.lang.Math.max(ipyVar.g(), this.f);
        this.g += ipyVar.g();
        this.l = java.lang.Math.max(ipyVar.i(), this.l);
        this.m += ipyVar.i();
        this.n = java.lang.Math.max(ipyVar.c(), this.n);
        this.o += ipyVar.c();
        if (this.x >= 234) {
            K();
        }
    }

    public final synchronized void y() {
        isb isbVar = this.t;
        if (isbVar == null) {
            ((defpackage.yqj) this.a.l().ai(1260)).u("Not publishing diagnostics: session is over.");
        } else {
            this.z.b(E(isbVar, defpackage.ouo.STREAMING));
        }
    }

    @Override // defpackage.jba
    public final synchronized void z() {
        D();
    }

    @Override // defpackage.jdy
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.jdy
    public final /* synthetic */ void l() {
    }
}
