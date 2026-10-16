package defpackage;

import android.os.SystemClock;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class iru implements jci, jat {
    public final yph a;
    public final otv b;
    public final ouh c;
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
    private final jfp q;
    private final jci r;
    private final irx s;
    private irt t;
    private irt u;
    private final Queue v;
    private int w = -1;
    private int x;
    private long y;
    private final izj z;

    public iru(irq irqVar) {
        izj izjVar = irqVar.h;
        izjVar.getClass();
        this.z = izjVar;
        otv otvVar = irqVar.a;
        otvVar.getClass();
        this.b = otvVar;
        ouh ouhVar = irqVar.b;
        ouhVar.getClass();
        this.c = ouhVar;
        this.a = new yph(yqn.d("CAR.AUDIO.".concat(epq.f(ouhVar))));
        this.p = irqVar.d;
        imt imtVar = new imt(this, 9, null);
        yph yphVar = jfp.a;
        jfn jfnVar = new jfn(imtVar);
        ScheduledExecutorService scheduledExecutorService = irqVar.c;
        scheduledExecutorService.getClass();
        jfnVar.b = scheduledExecutorService;
        jfnVar.b(irqVar.e);
        jfnVar.c(irqVar.e);
        jfnVar.e = TimeUnit.MILLISECONDS;
        this.q = jfnVar.a();
        jci jciVar = irqVar.f;
        jciVar.getClass();
        this.r = jciVar;
        irx irxVar = irqVar.g;
        irxVar.getClass();
        this.s = irxVar;
        this.v = new ydx((int) acwr.a.gu().k());
    }

    private final synchronized irt D() {
        irt irtVar;
        irtVar = this.t;
        if (irtVar == null) {
            irt irtVar2 = new irt(abqu.d(), this.p);
            this.s.d();
            this.t = irtVar2;
            this.q.a();
            int i = this.w;
            this.w = i == -1 ? 0 : i + 1;
            ((ype) this.a.l().ai(1259)).D("Session #%d started for stream: %s", this.w, this.c.name());
            irtVar = irtVar2;
        }
        return irtVar;
    }

    private final ots E(irt irtVar, otr otrVar) {
        final int i = 1;
        final int i2 = 0;
        woy.aa(irtVar.F >= irtVar.G.size(), "event size");
        abnp abnpVarN = ots.a.n();
        abnp abnpVarN2 = otw.a.n();
        int i3 = this.w;
        abnpVarN2.t();
        otw otwVar = (otw) abnpVarN2.b;
        otwVar.b |= 1;
        otwVar.c = i3;
        abnpVarN2.t();
        otw otwVar2 = (otw) abnpVarN2.b;
        otwVar2.d = this.b.e;
        otwVar2.b |= 2;
        abnpVarN2.t();
        otw otwVar3 = (otw) abnpVarN2.b;
        otwVar3.e = this.c.f;
        otwVar3.b |= 4;
        abnpVarN.t();
        ots otsVar = (ots) abnpVarN.b;
        otw otwVar4 = (otw) abnpVarN2.q();
        otwVar4.getClass();
        otsVar.c = otwVar4;
        otsVar.b |= 1;
        int i4 = irtVar.a;
        abnpVarN.t();
        ots otsVar2 = (ots) abnpVarN.b;
        otsVar2.b |= 2;
        otsVar2.d = i4;
        abnpVarN.t();
        ots otsVar3 = (ots) abnpVarN.b;
        otsVar3.e = otrVar.d;
        otsVar3.b |= 4;
        abpt abptVarD = abqu.d();
        abnp abnpVarN3 = ott.a.n();
        abnpVarN3.t();
        ott ottVar = (ott) abnpVarN3.b;
        abpt abptVar = irtVar.b;
        abptVar.getClass();
        ottVar.c = abptVar;
        ottVar.b |= 1;
        abnpVarN3.t();
        ott ottVar2 = (ott) abnpVarN3.b;
        abptVarD.getClass();
        ottVar2.d = abptVarD;
        ottVar2.b |= 2;
        int i5 = irtVar.d;
        abnpVarN3.t();
        ott ottVar3 = (ott) abnpVarN3.b;
        ottVar3.b |= 8;
        ottVar3.f = i5;
        int i6 = irtVar.c;
        abnpVarN3.t();
        ott ottVar4 = (ott) abnpVarN3.b;
        ottVar4.b |= 4;
        ottVar4.e = i6;
        int i7 = irtVar.e;
        abnpVarN3.t();
        ott ottVar5 = (ott) abnpVarN3.b;
        ottVar5.b |= 16;
        ottVar5.g = i7;
        int i8 = irtVar.g;
        abnpVarN3.t();
        ott ottVar6 = (ott) abnpVarN3.b;
        ottVar6.b |= 64;
        ottVar6.i = i8;
        int i9 = irtVar.f;
        if (i9 > Integer.MIN_VALUE) {
            abnpVarN3.t();
            ott ottVar7 = (ott) abnpVarN3.b;
            ottVar7.b |= 32;
            ottVar7.h = i9;
        }
        try {
            isc iscVar = irtVar.o;
            if (iscVar.a > 0) {
                otz otzVarF = F(iscVar, new irr() { // from class: irp
                    @Override // defpackage.irr
                    public final abnf a(long j) {
                        return i != 0 ? abqs.b(j) : abqs.c(j);
                    }
                });
                abnpVarN3.t();
                ott ottVar8 = (ott) abnpVarN3.b;
                otzVarF.getClass();
                ottVar8.o = otzVarF;
                ottVar8.b |= 4096;
            }
            isc iscVar2 = irtVar.j;
            if (iscVar2.a > 0) {
                otz otzVarF2 = F(iscVar2, new irr() { // from class: irp
                    @Override // defpackage.irr
                    public final abnf a(long j) {
                        return i2 != 0 ? abqs.b(j) : abqs.c(j);
                    }
                });
                abnpVarN3.t();
                ott ottVar9 = (ott) abnpVarN3.b;
                otzVarF2.getClass();
                ottVar9.j = otzVarF2;
                ottVar9.b |= 128;
            }
            isc iscVar3 = irtVar.k;
            if (iscVar3.a > 0) {
                int i10 = (int) irtVar.i;
                abnpVarN3.t();
                ott ottVar10 = (ott) abnpVarN3.b;
                ottVar10.b |= 256;
                ottVar10.k = i10;
                otz otzVarF3 = F(iscVar3, new irr() { // from class: irp
                    @Override // defpackage.irr
                    public final abnf a(long j) {
                        return i2 != 0 ? abqs.b(j) : abqs.c(j);
                    }
                });
                abnpVarN3.t();
                ott ottVar11 = (ott) abnpVarN3.b;
                otzVarF3.getClass();
                ottVar11.l = otzVarF3;
                ottVar11.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
            }
            isc iscVar4 = irtVar.l;
            if (iscVar4.a > 0) {
                otz otzVarF4 = F(iscVar4, new irr() { // from class: irp
                    @Override // defpackage.irr
                    public final abnf a(long j) {
                        return i2 != 0 ? abqs.b(j) : abqs.c(j);
                    }
                });
                abnpVarN3.t();
                ott ottVar12 = (ott) abnpVarN3.b;
                otzVarF4.getClass();
                ottVar12.m = otzVarF4;
                ottVar12.b |= 1024;
            }
            isc iscVar5 = irtVar.m;
            if (iscVar5.a > 0) {
                otz otzVarF5 = F(iscVar5, new irr() { // from class: irp
                    @Override // defpackage.irr
                    public final abnf a(long j) {
                        return i2 != 0 ? abqs.b(j) : abqs.c(j);
                    }
                });
                abnpVarN3.t();
                ott ottVar13 = (ott) abnpVarN3.b;
                otzVarF5.getClass();
                ottVar13.n = otzVarF5;
                ottVar13.b |= 2048;
            }
            isc iscVar6 = irtVar.n;
            if (iscVar6.a > 0) {
                otz otzVarF6 = F(iscVar6, new irr() { // from class: irp
                    @Override // defpackage.irr
                    public final abnf a(long j) {
                        return i2 != 0 ? abqs.b(j) : abqs.c(j);
                    }
                });
                abnpVarN3.t();
                ott ottVar14 = (ott) abnpVarN3.b;
                otzVarF6.getClass();
                ottVar14.p = otzVarF6;
                ottVar14.b |= 16384;
            }
        } catch (IllegalArgumentException e) {
            ((ype) ((ype) ((ype) this.a.h()).p(e)).ai((char) 1249)).u("Failed to convert latency stats");
        }
        isc iscVar7 = irtVar.p;
        if (iscVar7.a > 0) {
            abnp abnpVarN4 = oua.a.n();
            int i11 = iscVar7.a;
            abnpVarN4.t();
            oua ouaVar = (oua) abnpVarN4.b;
            ouaVar.b |= 1;
            ouaVar.c = i11;
            long j = iscVar7.b;
            abnpVarN4.t();
            oua ouaVar2 = (oua) abnpVarN4.b;
            ouaVar2.b |= 2;
            ouaVar2.d = j;
            long j2 = iscVar7.c;
            abnpVarN4.t();
            oua ouaVar3 = (oua) abnpVarN4.b;
            ouaVar3.b |= 4;
            ouaVar3.e = j2;
            long j3 = iscVar7.d;
            abnpVarN4.t();
            oua ouaVar4 = (oua) abnpVarN4.b;
            ouaVar4.b |= 8;
            ouaVar4.f = j3;
            double d = iscVar7.e;
            abnpVarN4.t();
            oua ouaVar5 = (oua) abnpVarN4.b;
            ouaVar5.b |= 16;
            ouaVar5.g = d;
            double dA = iscVar7.a();
            abnpVarN4.t();
            oua ouaVar6 = (oua) abnpVarN4.b;
            ouaVar6.b |= 32;
            ouaVar6.h = dA;
            oua ouaVar7 = (oua) abnpVarN4.q();
            abnpVarN3.t();
            ott ottVar15 = (ott) abnpVarN3.b;
            ouaVar7.getClass();
            ottVar15.q = ouaVar7;
            ottVar15.b |= 32768;
        }
        Iterator it = irtVar.E.iterator();
        while (it.hasNext()) {
            abnpVarN3.B((ouj) ((abnp) it.next()).q());
        }
        ott ottVar16 = (ott) abnpVarN3.q();
        abnpVarN.t();
        ots otsVar4 = (ots) abnpVarN.b;
        ottVar16.getClass();
        otsVar4.f = ottVar16;
        otsVar4.b |= 8;
        Queue queue = irtVar.G;
        abnpVarN.A(queue);
        int size = irtVar.F - queue.size();
        abnpVarN.t();
        ots otsVar5 = (ots) abnpVarN.b;
        otsVar5.b |= 16;
        otsVar5.h = size;
        ots otsVar6 = (ots) abnpVarN.q();
        irtVar.a++;
        irtVar.F = 0;
        queue.clear();
        return otsVar6;
    }

    private static otz F(isc iscVar, irr irrVar) {
        abnp abnpVarN = otz.a.n();
        int i = iscVar.a;
        abnpVarN.t();
        otz otzVar = (otz) abnpVarN.b;
        otzVar.b |= 1;
        otzVar.c = i;
        abnf abnfVarA = irrVar.a(iscVar.b);
        abnpVarN.t();
        otz otzVar2 = (otz) abnpVarN.b;
        abnfVarA.getClass();
        otzVar2.d = abnfVarA;
        otzVar2.b |= 2;
        abnf abnfVarA2 = irrVar.a(iscVar.c);
        abnpVarN.t();
        otz otzVar3 = (otz) abnpVarN.b;
        abnfVarA2.getClass();
        otzVar3.e = abnfVarA2;
        otzVar3.b |= 4;
        abnf abnfVarA3 = irrVar.a(iscVar.d);
        abnpVarN.t();
        otz otzVar4 = (otz) abnpVarN.b;
        abnfVarA3.getClass();
        otzVar4.f = abnfVarA3;
        otzVar4.b |= 8;
        abnf abnfVarA4 = irrVar.a((long) iscVar.e);
        abnpVarN.t();
        otz otzVar5 = (otz) abnpVarN.b;
        abnfVarA4.getClass();
        otzVar5.g = abnfVarA4;
        otzVar5.b |= 16;
        abnf abnfVarA5 = irrVar.a((long) iscVar.a());
        abnpVarN.t();
        otz otzVar6 = (otz) abnpVarN.b;
        abnfVarA5.getClass();
        otzVar6.h = abnfVarA5;
        otzVar6.b |= 32;
        return (otz) abnpVarN.q();
    }

    private final synchronized Optional G() {
        return Optional.ofNullable(this.t);
    }

    private final synchronized void H(PrintWriter printWriter) {
        Queue<irs> queue = this.v;
        if (queue.isEmpty()) {
            printWriter.println("No GUIDANCE stream MediaStats received.");
            return;
        }
        printWriter.println("Last " + queue.size() + " GUIDANCE MediaStats:");
        for (irs irsVar : queue) {
            printWriter.println("  " + String.valueOf(irsVar.b.atZone(ZoneId.systemDefault()).toLocalDateTime()) + " [Session #" + irsVar.c + "] " + s(irsVar.a, this.c).replace("\n", "\n  "));
        }
    }

    private final synchronized void I(PrintWriter printWriter) {
        irt irtVar = this.t;
        irt irtVar2 = this.u;
        if (irtVar == null && irtVar2 == null) {
            printWriter.println("No active or previous audio session for MEDIA stream.");
            return;
        }
        if (irtVar == null) {
            printWriter.println("No active audio session for MEDIA stream, dumping last session.");
            irtVar2.getClass();
            irtVar = irtVar2;
        }
        Queue<irs> queue = irtVar.H;
        if (queue.isEmpty()) {
            printWriter.println("No MEDIA stream MediaStats received for the audio session.");
            return;
        }
        printWriter.println("Last " + queue.size() + " MEDIA MediaStats:");
        for (irs irsVar : queue) {
            printWriter.println("  " + String.valueOf(irsVar.b.atZone(ZoneId.systemDefault()).toLocalDateTime()) + " " + s(irsVar.a, this.c).replace("\n", "\n  "));
        }
    }

    private final void J() {
        ((ype) ((ype) this.a.f()).ai(1255)).X("Latency stats for stream %s in the last %d aac frames: timeSpentInCaptureThread: [%s, %.2f] ms, timeSpentInTxQ: [%s, %.2f] ms, timeSpentInEncoding: [%s, %.2f] ms, timeSpentInCodecConfig: [%s, %.2f] ms, timeSpentWaitingForAckAndEnqueuingFrames: [%s, %.2f] ms, audioPipelineLatency: [%s, %.2f] ms", epq.f(this.c), Integer.valueOf(this.x), Long.valueOf(this.d), Double.valueOf(this.e / this.x), Long.valueOf(this.f), Double.valueOf(this.g / this.x), Long.valueOf(this.h), Double.valueOf(this.i / this.x), Long.valueOf(this.j), Double.valueOf(this.k / this.x), Long.valueOf(this.l), Double.valueOf(this.m / this.x), Long.valueOf(this.n), Double.valueOf(this.o / this.x));
        N();
    }

    private final void K() {
        ((ype) ((ype) this.a.f()).ai(1256)).W("Latency stats for stream %s in the last %d pcm frames: timeSpentInCaptureThread: [%s, %.2f] ms, timeSpentInTxQ: [%s, %.2f] ms, timeSpentWaitingForAckAndEnqueuingFrames: [%s, %.2f] ms, audioPipelineLatency: [%s, %.2f] ms", epq.f(this.c), Integer.valueOf(this.x), Long.valueOf(this.d), Double.valueOf(this.e / this.x), Long.valueOf(this.f), Double.valueOf(this.g / this.x), Long.valueOf(this.l), Double.valueOf(this.m / this.x), Long.valueOf(this.n), Double.valueOf(this.o / this.x));
        N();
    }

    private final synchronized void L(ots otsVar, long j) {
        if (j < 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = 10;
        if (jElapsedRealtime - this.y < j) {
            ((ype) ((ype) this.a.l().l(10, TimeUnit.SECONDS)).ai(1257)).R("Skip logging audio stream session stats, current time: %s, last time: %s, threshold: %s", Long.valueOf(jElapsedRealtime), Long.valueOf(this.y), Long.valueOf(j));
            return;
        }
        abnp abnpVarN = ywp.a.n();
        ouh ouhVar = this.c;
        abnpVarN.t();
        ywp ywpVar = (ywp) abnpVarN.b;
        ywpVar.b |= 128;
        ywpVar.j = ouhVar.f;
        otv otvVar = this.b;
        abnpVarN.t();
        ywp ywpVar2 = (ywp) abnpVarN.b;
        ywpVar2.b |= 64;
        ywpVar2.i = otvVar.e;
        ott ottVar = otsVar.f;
        if (ottVar == null) {
            ottVar = ott.a;
        }
        otz otzVar = ottVar.j;
        if (otzVar == null) {
            otzVar = otz.a;
        }
        abnf abnfVar = otzVar.f;
        if (abnfVar == null) {
            abnfVar = abnf.a;
        }
        int iA = (int) abqs.a(abnfVar);
        abnpVarN.t();
        ywp ywpVar3 = (ywp) abnpVarN.b;
        ywpVar3.b |= 262144;
        ywpVar3.u = iA;
        otz otzVar2 = ottVar.m;
        if (otzVar2 == null) {
            otzVar2 = otz.a;
        }
        abnf abnfVar2 = otzVar2.f;
        if (abnfVar2 == null) {
            abnfVar2 = abnf.a;
        }
        int iA2 = (int) abqs.a(abnfVar2);
        abnpVarN.t();
        ywp ywpVar4 = (ywp) abnpVarN.b;
        ywpVar4.b |= 1048576;
        ywpVar4.w = iA2;
        otz otzVar3 = ottVar.n;
        if (otzVar3 == null) {
            otzVar3 = otz.a;
        }
        abnf abnfVar3 = otzVar3.f;
        if (abnfVar3 == null) {
            abnfVar3 = abnf.a;
        }
        int iA3 = (int) abqs.a(abnfVar3);
        abnpVarN.t();
        ywp ywpVar5 = (ywp) abnpVarN.b;
        ywpVar5.b |= 8192;
        ywpVar5.p = iA3;
        otz otzVar4 = ottVar.p;
        if (otzVar4 == null) {
            otzVar4 = otz.a;
        }
        abnf abnfVar4 = otzVar4.f;
        if (abnfVar4 == null) {
            abnfVar4 = abnf.a;
        }
        int iA4 = (int) abqs.a(abnfVar4);
        abnpVarN.t();
        ywp ywpVar6 = (ywp) abnpVarN.b;
        ywpVar6.b |= 4194304;
        ywpVar6.x = iA4;
        if (otvVar == otv.AAC_LC || otvVar == otv.AAC_LC_ADTS) {
            int i2 = ottVar.k;
            abnpVarN.t();
            ywp ywpVar7 = (ywp) abnpVarN.b;
            ywpVar7.b |= 8388608;
            ywpVar7.y = i2;
            otz otzVar5 = ottVar.l;
            if (otzVar5 == null) {
                otzVar5 = otz.a;
            }
            abnf abnfVar5 = otzVar5.f;
            if (abnfVar5 == null) {
                abnfVar5 = abnf.a;
            }
            int iA5 = (int) abqs.a(abnfVar5);
            abnpVarN.t();
            ywp ywpVar8 = (ywp) abnpVarN.b;
            ywpVar8.b |= 524288;
            ywpVar8.v = iA5;
        }
        irt irtVar = this.t;
        irtVar.getClass();
        Optional optionalA = irtVar.r.a();
        iln ilnVar = new iln(abnpVarN, 8);
        if (true == optionalA.isPresent()) {
            Object obj = optionalA.get();
            Object obj2 = ilnVar.a;
            ((abnp) obj2).t();
            ywp ywpVar9 = (ywp) ((abnp) obj2).b;
            ywpVar9.z = (yyq) obj;
            ywpVar9.b |= 16777216;
        }
        Optional optionalA2 = irtVar.s.a();
        iln ilnVar2 = new iln(abnpVarN, 9);
        if (true == optionalA2.isPresent()) {
            Object obj3 = optionalA2.get();
            Object obj4 = ilnVar2.a;
            ((abnp) obj4).t();
            ywp ywpVar10 = (ywp) ((abnp) obj4).b;
            ywpVar10.A = (yyq) obj3;
            ywpVar10.b |= 33554432;
        }
        Optional optionalA3 = irtVar.t.a();
        iln ilnVar3 = new iln(abnpVarN, i);
        if (true == optionalA3.isPresent()) {
            Object obj5 = optionalA3.get();
            Object obj6 = ilnVar3.a;
            ((abnp) obj6).t();
            ywp ywpVar11 = (ywp) ((abnp) obj6).b;
            ywpVar11.B = (yyq) obj5;
            ywpVar11.b |= 67108864;
        }
        Optional optionalA4 = irtVar.u.a();
        iln ilnVar4 = new iln(abnpVarN, 11);
        if (true == optionalA4.isPresent()) {
            Object obj7 = optionalA4.get();
            Object obj8 = ilnVar4.a;
            ((abnp) obj8).t();
            ywp ywpVar12 = (ywp) ((abnp) obj8).b;
            ywpVar12.C = (yyq) obj7;
            ywpVar12.b |= 134217728;
        }
        Optional optionalA5 = irtVar.v.a();
        iln ilnVar5 = new iln(abnpVarN, 12);
        if (true == optionalA5.isPresent()) {
            Object obj9 = optionalA5.get();
            Object obj10 = ilnVar5.a;
            ((abnp) obj10).t();
            ywp ywpVar13 = (ywp) ((abnp) obj10).b;
            ywpVar13.D = (yyq) obj9;
            ywpVar13.b |= 268435456;
        }
        Optional optionalA6 = irtVar.w.a();
        iln ilnVar6 = new iln(abnpVarN, 13);
        if (true == optionalA6.isPresent()) {
            Object obj11 = optionalA6.get();
            Object obj12 = ilnVar6.a;
            ((abnp) obj12).t();
            ywp ywpVar14 = (ywp) ((abnp) obj12).b;
            ywpVar14.E = (yyq) obj11;
            ywpVar14.b |= 536870912;
        }
        Optional optionalA7 = this.s.a();
        Optional optionalOfNullable = true != optionalA7.isPresent() ? optionalA7 : Optional.ofNullable(((irw) optionalA7.get()).a);
        iln ilnVar7 = new iln(abnpVarN, 3);
        if (true == optionalOfNullable.isPresent()) {
            Object obj13 = optionalOfNullable.get();
            Object obj14 = ilnVar7.a;
            ((abnp) obj14).t();
            ywp ywpVar15 = (ywp) ((abnp) obj14).b;
            ywpVar15.F = (yyq) obj13;
            ywpVar15.b |= 1073741824;
        }
        if (true == optionalA7.isPresent()) {
            optionalA7 = Optional.ofNullable(((irw) optionalA7.get()).b);
        }
        iln ilnVar8 = new iln(abnpVarN, 4);
        if (true == optionalA7.isPresent()) {
            Object obj15 = optionalA7.get();
            Object obj16 = ilnVar8.a;
            ((abnp) obj16).t();
            ywp ywpVar16 = (ywp) ((abnp) obj16).b;
            ywpVar16.G = (yyq) obj15;
            ywpVar16.b |= Integer.MIN_VALUE;
        }
        c((ywp) abnpVarN.q());
        this.y = jElapsedRealtime;
    }

    private final synchronized void M() {
        irt irtVar;
        if (acta.c() && (irtVar = this.t) != null) {
            Queue queue = irtVar.H;
            if (!queue.isEmpty()) {
                abnp abnpVarN = yyt.a.n();
                Iterator it = queue.iterator();
                long jA = 0;
                long j = 0;
                long j2 = 0;
                long j3 = 0;
                while (it.hasNext()) {
                    xkq xkqVar = ((irs) it.next()).a;
                    abnf abnfVar = xkqVar.c;
                    if (abnfVar == null) {
                        abnfVar = abnf.a;
                    }
                    jA += abqs.a(abnfVar);
                    j += xkqVar.d;
                    j2 += xkqVar.f;
                    j3 += xkqVar.e;
                }
                abnpVarN.t();
                yyt yytVar = (yyt) abnpVarN.b;
                yytVar.b |= 1;
                yytVar.c = jA;
                abnpVarN.t();
                yyt yytVar2 = (yyt) abnpVarN.b;
                int i = 2;
                yytVar2.b |= 2;
                yytVar2.d = j;
                abnpVarN.t();
                yyt yytVar3 = (yyt) abnpVarN.b;
                yytVar3.b |= 4;
                yytVar3.e = j2;
                abnpVarN.t();
                yyt yytVar4 = (yyt) abnpVarN.b;
                yytVar4.b |= 8;
                yytVar4.f = j3;
                ouh ouhVar = this.c;
                abnpVarN.t();
                yyt yytVar5 = (yyt) abnpVarN.b;
                yytVar5.b |= 32768;
                yytVar5.r = ouhVar.f;
                if (!queue.isEmpty()) {
                    long j4 = ((irs) queue.iterator().next()).a.k;
                    abnpVarN.t();
                    yyt yytVar6 = (yyt) abnpVarN.b;
                    yytVar6.b |= 256;
                    yytVar6.k = j4;
                }
                Optional optionalB = irtVar.B.b();
                abnpVarN.getClass();
                iln ilnVar = new iln(abnpVarN, i);
                if (true == optionalB.isPresent()) {
                    Object obj = optionalB.get();
                    Object obj2 = ilnVar.a;
                    ((abnp) obj2).t();
                    yyt yytVar7 = (yyt) ((abnp) obj2).b;
                    yytVar7.g = (yzo) obj;
                    yytVar7.b |= 16;
                }
                Optional optionalB2 = irtVar.A.b();
                iln ilnVar2 = new iln(abnpVarN, 5);
                if (true == optionalB2.isPresent()) {
                    Object obj3 = optionalB2.get();
                    Object obj4 = ilnVar2.a;
                    ((abnp) obj4).t();
                    yyt yytVar8 = (yyt) ((abnp) obj4).b;
                    yytVar8.h = (yzo) obj3;
                    yytVar8.b |= 32;
                }
                Optional optionalB3 = irtVar.C.b();
                iln ilnVar3 = new iln(abnpVarN, 6);
                if (true == optionalB3.isPresent()) {
                    Object obj5 = optionalB3.get();
                    Object obj6 = ilnVar3.a;
                    ((abnp) obj6).t();
                    yyt yytVar9 = (yyt) ((abnp) obj6).b;
                    yytVar9.i = (yzo) obj5;
                    yytVar9.b |= 64;
                }
                Optional optionalB4 = irtVar.D.b();
                iln ilnVar4 = new iln(abnpVarN, 7);
                if (true == optionalB4.isPresent()) {
                    Object obj7 = optionalB4.get();
                    Object obj8 = ilnVar4.a;
                    ((abnp) obj8).t();
                    yyt yytVar10 = (yyt) ((abnp) obj8).b;
                    yytVar10.j = (yzo) obj7;
                    yytVar10.b |= 128;
                }
                o((yyt) abnpVarN.q());
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

    private final void O(ipr iprVar) {
        Optional optionalG = G();
        kga kgaVar = new kga(this, iprVar, 1, null);
        if (true != optionalG.isPresent()) {
            return;
        }
        Object obj = optionalG.get();
        Object obj2 = kgaVar.b;
        irt irtVar = (irt) obj;
        ipr iprVar2 = (ipr) kgaVar.a;
        if (iprVar2.c() > irtVar.h) {
            ((ype) ((ype) ((ype) ((iru) obj2).a.f()).l(1, TimeUnit.SECONDS)).ai(1254)).x("Audio pipeline latency on MD increased to %d ms", iprVar2.c());
        }
        irtVar.h = Math.max(irtVar.h, iprVar2.c());
        irtVar.j.b(iprVar2.g());
        iru iruVar = (iru) obj2;
        otv otvVar = iruVar.b;
        otv otvVar2 = otv.PCM;
        if (otvVar == otvVar2) {
            irtVar.l.b(iprVar2.i());
        }
        otv otvVar3 = otv.AAC_LC;
        if (otvVar == otvVar3 || otvVar == otv.AAC_LC_ADTS) {
            isc iscVar = irtVar.k;
            if (iscVar.a == 0) {
                ((ype) iruVar.a.l().ai(1253)).x("Encoding latency for the first frame: %s ms", iprVar2.f());
                irtVar.i = iprVar2.f();
            }
            iscVar.b(iprVar2.f());
            irtVar.l.b(iprVar2.h());
        }
        irtVar.r.c(iprVar2.d(), 1);
        irtVar.s.c(iprVar2.g(), 1);
        if (otvVar == otvVar2) {
            irtVar.u.c(iprVar2.i(), 1);
        }
        if (otvVar == otvVar3 || otvVar == otv.AAC_LC_ADTS) {
            irtVar.t.c(iprVar2.f(), 1);
            irtVar.u.c(iprVar2.h(), 1);
        }
    }

    private static final void P(abnp abnpVar) {
        woy.O(1 == (((oup) abnpVar.b).b & 1), "event.hasTag()");
        woy.O((((oup) abnpVar.b).b & 4) != 0, "event.hasEventType()");
        abpt abptVarD = abqu.d();
        abnpVar.t();
        oup oupVar = (oup) abnpVar.b;
        abptVarD.getClass();
        oupVar.d = abptVarD;
        oupVar.b |= 2;
    }

    public static String s(xkq xkqVar, ouh ouhVar) {
        xhe xheVar = xkqVar.g;
        if (xheVar == null) {
            xheVar = xhe.a;
        }
        xhe xheVar2 = xkqVar.h;
        if (xheVar2 == null) {
            xheVar2 = xhe.a;
        }
        xhe xheVar3 = xkqVar.i;
        if (xheVar3 == null) {
            xheVar3 = xhe.a;
        }
        xhe xheVar4 = xkqVar.j;
        if (xheVar4 == null) {
            xheVar4 = xhe.a;
        }
        Locale locale = Locale.US;
        String strName = ouhVar.name();
        abnf abnfVar = xkqVar.c;
        if (abnfVar == null) {
            abnfVar = abnf.a;
        }
        return String.format(locale, "Media stats for stream %s in the last %d ms and %d frames:\n  Audio overflow count: %d\n  Audio underrun count: %d\n  Estimated Audio Buffer (us): {avg: %d, min: %d, max: %d, count: %d}\n  Audio/Video lag (us): {avg: %d, min: %d, max: %d, count: %d}\n  Audio delay (us): {avg: %d, min: %d, max: %d, count: %d}\n  Video delay (us): {avg: %d, min: %d, max: %d, count: %d}\n  Audio output latency offset: %d us", strName, Long.valueOf(abqs.a(abnfVar)), Long.valueOf(xkqVar.d), Long.valueOf(xkqVar.e), Long.valueOf(xkqVar.f), Long.valueOf(xheVar.b), Long.valueOf(xheVar.c), Long.valueOf(xheVar.d), Long.valueOf(xheVar.e), Long.valueOf(xheVar2.b), Long.valueOf(xheVar2.c), Long.valueOf(xheVar2.d), Long.valueOf(xheVar2.e), Long.valueOf(xheVar3.b), Long.valueOf(xheVar3.c), Long.valueOf(xheVar3.d), Long.valueOf(xheVar3.e), Long.valueOf(xheVar4.b), Long.valueOf(xheVar4.c), Long.valueOf(xheVar4.d), Long.valueOf(xheVar4.e), Long.valueOf(xkqVar.k));
    }

    @Override // defpackage.jat
    public final synchronized void A(abnp abnpVar) {
        P(abnpVar);
        irt irtVar = this.t;
        if (irtVar == null) {
            B(abnpVar);
            return;
        }
        irtVar.G.add((oup) abnpVar.q());
        irtVar.F++;
    }

    @Override // defpackage.jat
    public final void B(abnp abnpVar) {
        P(abnpVar);
        oup oupVar = (oup) abnpVar.q();
        abnp abnpVarN = ots.a.n();
        abnp abnpVarN2 = otw.a.n();
        abnpVarN2.t();
        otw otwVar = (otw) abnpVarN2.b;
        otwVar.d = this.b.e;
        otwVar.b |= 2;
        abnpVarN2.t();
        otw otwVar2 = (otw) abnpVarN2.b;
        otwVar2.e = this.c.f;
        otwVar2.b |= 4;
        abnpVarN.t();
        ots otsVar = (ots) abnpVarN.b;
        otw otwVar3 = (otw) abnpVarN2.q();
        otwVar3.getClass();
        otsVar.c = otwVar3;
        otsVar.b |= 1;
        otr otrVar = otr.NOT_STREAMING;
        abnpVarN.t();
        ots otsVar2 = (ots) abnpVarN.b;
        otsVar2.e = otrVar.d;
        otsVar2.b |= 4;
        int i = yfq.d;
        Object[] objArr = {oupVar};
        yrm.B(objArr, 1);
        abnpVarN.A(new yls(objArr, 1));
        this.z.b((ots) abnpVarN.q());
    }

    public final synchronized void C(abnp abnpVar) {
        P(abnpVar);
        irt irtVarD = D();
        irtVarD.G.add((oup) abnpVar.q());
        irtVarD.F++;
    }

    @Override // defpackage.jci
    public final synchronized void a() {
        this.r.a();
        if (this.x > 0) {
            if (this.b == otv.PCM) {
                K();
            } else {
                J();
            }
        }
    }

    @Override // defpackage.jdr
    public final synchronized void b(int i) {
        this.r.b(i);
    }

    @Override // defpackage.jci
    public final synchronized void c(ywp ywpVar) {
        this.r.c(ywpVar);
    }

    @Override // defpackage.jdr
    public final synchronized void d(int i) {
        Optional optionalG = G();
        irm irmVar = new irm(i, 0);
        if (true == optionalG.isPresent()) {
            ((irt) optionalG.get()).p.b(irmVar.a);
        }
        this.r.d(i);
    }

    @Override // defpackage.jdr
    public final synchronized void e() {
        Optional optionalG = G();
        if (true == optionalG.isPresent()) {
            ((irt) optionalG.get()).e++;
        }
        this.r.e();
    }

    @Override // defpackage.jdr
    public final synchronized void f(long j, long j2) {
        Optional optionalG = G();
        irn irnVar = new irn(j, 1);
        if (true == optionalG.isPresent()) {
            Object obj = optionalG.get();
            ((irt) obj).o.b(irnVar.a);
        }
        this.r.f(j, j2);
    }

    @Override // defpackage.jdr
    public final synchronized void g(int i) {
        throw new UnsupportedOperationException("log frame encoded not supported in AudioStreamDiagnosticsTracker");
    }

    @Override // defpackage.jdr
    public final synchronized void h(long j) {
        Optional optionalG = G();
        irn irnVar = new irn(j, 0);
        if (true == optionalG.isPresent()) {
            Object obj = optionalG.get();
            long j2 = irnVar.a;
            irt irtVar = (irt) obj;
            irtVar.n.b(j2);
            irtVar.w.c(j2, 1);
        }
        this.r.h(j);
    }

    @Override // defpackage.jdr
    public final void i() {
        throw new UnsupportedOperationException("log frame lost in encoder not supported in AudioStreamDiagnosticsTracker");
    }

    @Override // defpackage.jdr
    public final synchronized void k(final int i) {
        G().ifPresentOrElse(new Consumer() { // from class: iro
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                irt irtVar = (irt) obj;
                irtVar.d++;
                irtVar.c += i;
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new hhx(this, i, 3));
        this.r.k(i);
    }

    @Override // defpackage.jdr
    public final synchronized void m(int i) {
        Optional optionalG = G();
        irm irmVar = new irm(i, 2);
        if (true == optionalG.isPresent()) {
            ((irt) optionalG.get()).f = irmVar.a;
        }
        this.r.m(i);
    }

    @Override // defpackage.jdr
    public final synchronized void n(xkq xkqVar) {
        Instant instantNow = Instant.now();
        irt irtVar = this.t;
        if (irtVar == null) {
            irtVar = this.u;
        }
        irs irsVar = new irs(xkqVar, instantNow, this.w);
        if (irtVar != null) {
            irtVar.H.add(irsVar);
        }
        if (this.c.equals(ouh.GUIDANCE)) {
            this.v.add(irsVar);
        }
        if (irtVar != null && acta.c()) {
            if ((xkqVar.b & 16) != 0) {
                xhe xheVar = xkqVar.g;
                if (xheVar == null) {
                    xheVar = xhe.a;
                }
                iuh iuhVar = irtVar.B;
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                iuhVar.c(xheVar.b / 1000, (int) xheVar.e);
            }
            if ((xkqVar.b & 32) != 0) {
                xhe xheVar2 = xkqVar.h;
                if (xheVar2 == null) {
                    xheVar2 = xhe.a;
                }
                iuh iuhVar2 = irtVar.A;
                TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                iuhVar2.c(xheVar2.b / 1000, (int) xheVar2.e);
            }
            if ((xkqVar.b & 64) != 0) {
                xhe xheVar3 = xkqVar.i;
                if (xheVar3 == null) {
                    xheVar3 = xhe.a;
                }
                iuh iuhVar3 = irtVar.C;
                TimeUnit timeUnit3 = TimeUnit.MICROSECONDS;
                iuhVar3.c(xheVar3.b / 1000, (int) xheVar3.e);
            }
            if ((xkqVar.b & 128) != 0) {
                xhe xheVar4 = xkqVar.j;
                if (xheVar4 == null) {
                    xheVar4 = xhe.a;
                }
                iuh iuhVar4 = irtVar.D;
                TimeUnit timeUnit4 = TimeUnit.MICROSECONDS;
                iuhVar4.c(xheVar4.b / 1000, (int) xheVar4.e);
            }
        }
    }

    @Override // defpackage.jci
    public final synchronized void o(yyt yytVar) {
        this.r.o(yytVar);
    }

    @Override // defpackage.jdr
    public final synchronized void p() {
        Optional optionalG = G();
        if (true == optionalG.isPresent()) {
            ((irt) optionalG.get()).g++;
        }
        this.r.p();
    }

    @Override // defpackage.jdr
    public final synchronized void q(long j) {
        Optional optionalG = G();
        irn irnVar = new irn(j, 2);
        if (true == optionalG.isPresent()) {
            Object obj = optionalG.get();
            long j2 = irnVar.a;
            irt irtVar = (irt) obj;
            irtVar.m.b(j2);
            irtVar.v.c(j2, 1);
        }
        this.r.q(j);
    }

    @Override // defpackage.jdr
    public final synchronized void r() {
        this.r.r();
    }

    public final synchronized void t(PrintWriter printWriter) {
        ouh ouhVar = this.c;
        if (ouhVar == ouh.MEDIA) {
            I(printWriter);
        } else if (ouhVar == ouh.GUIDANCE) {
            H(printWriter);
        } else {
            printWriter.println("Dumping not supported for stream type: ".concat(String.valueOf(ouhVar.name())));
        }
    }

    @Override // defpackage.jat
    public final synchronized void u(boolean z) {
        irt irtVar = this.t;
        if (irtVar == null) {
            ((ype) this.a.l().ai(1251)).u("Session has ended or did not start.");
            return;
        }
        if (z || irtVar.d == 0) {
            ots otsVarE = E(irtVar, otr.NOT_STREAMING);
            this.z.b(otsVarE);
            this.q.b();
            ouh ouhVar = this.c;
            if (ouhVar == ouh.MEDIA) {
                this.t.getClass();
                if (r1.d > (this.b == otv.PCM ? acmu.c() : acmu.d())) {
                    L(otsVarE, acmu.g());
                }
            }
            M();
            this.u = this.t;
            this.t = null;
            ((ype) this.a.l().ai(1250)).D("Session #%d ended for stream: %s", this.w, ouhVar.name());
        }
    }

    public final synchronized void v(ipr iprVar) {
        O(iprVar);
        this.x++;
        this.d = Math.max(iprVar.d(), this.d);
        this.e += iprVar.d();
        this.f = Math.max(iprVar.g(), this.f);
        this.g += iprVar.g();
        this.h = Math.max(iprVar.f(), this.h);
        this.i += iprVar.f();
        this.j = Math.max(iprVar.e(), this.j);
        this.k += iprVar.e();
        this.l = Math.max(iprVar.h(), this.l);
        this.m += iprVar.h();
        this.n = Math.max(iprVar.c(), this.n);
        this.o += iprVar.c();
        if (this.x >= 234) {
            J();
        }
    }

    @Override // defpackage.jat
    public final synchronized void w(String str, oui ouiVar) {
        irt irtVar = this.t;
        if (irtVar != null) {
            List<abnp> list = irtVar.E;
            for (abnp abnpVar : list) {
                ouj oujVar = (ouj) abnpVar.b;
                if (str.equals(oujVar.c)) {
                    oui ouiVarB = oui.b(oujVar.d);
                    if (ouiVarB == null) {
                        ouiVarB = oui.DROPPED_MEDIA_STREAM_FRAME_REASON_UNSPECIFIED;
                    }
                    if (ouiVar.equals(ouiVarB)) {
                        int i = ((ouj) abnpVar.b).e + 1;
                        abnpVar.t();
                        ouj oujVar2 = (ouj) abnpVar.b;
                        oujVar2.b |= 4;
                        oujVar2.e = i;
                        return;
                    }
                }
            }
            abnp abnpVarN = ouj.a.n();
            abnpVarN.t();
            ouj oujVar3 = (ouj) abnpVarN.b;
            oujVar3.b |= 1;
            oujVar3.c = str;
            abnpVarN.t();
            ouj oujVar4 = (ouj) abnpVarN.b;
            oujVar4.d = ouiVar.k;
            oujVar4.b |= 2;
            abnpVarN.t();
            ouj oujVar5 = (ouj) abnpVarN.b;
            oujVar5.b |= 4;
            oujVar5.e = 1;
            int i2 = irtVar.d;
            abnpVarN.t();
            ouj oujVar6 = (ouj) abnpVarN.b;
            oujVar6.b |= 8;
            oujVar6.f = i2;
            abpt abptVarD = abqu.d();
            abnpVarN.t();
            ouj oujVar7 = (ouj) abnpVarN.b;
            abptVarD.getClass();
            oujVar7.g = abptVarD;
            oujVar7.b |= 16;
            list.add(abnpVarN);
            return;
        }
        abnp abnpVarN2 = ouj.a.n();
        abnpVarN2.t();
        ouj oujVar8 = (ouj) abnpVarN2.b;
        oujVar8.b |= 1;
        oujVar8.c = str;
        abnpVarN2.t();
        ouj oujVar9 = (ouj) abnpVarN2.b;
        oujVar9.d = ouiVar.k;
        oujVar9.b |= 2;
        abnpVarN2.t();
        ouj oujVar10 = (ouj) abnpVarN2.b;
        oujVar10.b |= 4;
        oujVar10.e = 1;
        abpt abptVarD2 = abqu.d();
        abnpVarN2.t();
        ouj oujVar11 = (ouj) abnpVarN2.b;
        abptVarD2.getClass();
        oujVar11.g = abptVarD2;
        oujVar11.b |= 16;
        ouj oujVar12 = (ouj) abnpVarN2.q();
        izj izjVar = this.z;
        abnp abnpVarN3 = ott.a.n();
        abpt abptVar = oujVar12.g;
        if (abptVar == null) {
            abptVar = abpt.a;
        }
        abnpVarN3.t();
        ott ottVar = (ott) abnpVarN3.b;
        abptVar.getClass();
        ottVar.c = abptVar;
        ottVar.b |= 1;
        abnpVarN3.B(oujVar12);
        abnp abnpVarN4 = ots.a.n();
        abnp abnpVarN5 = otw.a.n();
        otv otvVar = this.b;
        abnpVarN5.t();
        otw otwVar = (otw) abnpVarN5.b;
        otwVar.d = otvVar.e;
        otwVar.b |= 2;
        ouh ouhVar = this.c;
        abnpVarN5.t();
        otw otwVar2 = (otw) abnpVarN5.b;
        otwVar2.e = ouhVar.f;
        otwVar2.b |= 4;
        abnpVarN4.t();
        ots otsVar = (ots) abnpVarN4.b;
        otw otwVar3 = (otw) abnpVarN5.q();
        otwVar3.getClass();
        otsVar.c = otwVar3;
        otsVar.b = 1 | otsVar.b;
        otr otrVar = otr.NOT_STREAMING;
        abnpVarN4.t();
        ots otsVar2 = (ots) abnpVarN4.b;
        otsVar2.e = otrVar.d;
        otsVar2.b |= 4;
        ott ottVar2 = (ott) abnpVarN3.q();
        abnpVarN4.t();
        ots otsVar3 = (ots) abnpVarN4.b;
        ottVar2.getClass();
        otsVar3.f = ottVar2;
        otsVar3.b |= 8;
        izjVar.b((ots) abnpVarN4.q());
    }

    public final synchronized void x(ipr iprVar) {
        O(iprVar);
        this.x++;
        this.d = Math.max(iprVar.d(), this.d);
        this.e += iprVar.d();
        this.f = Math.max(iprVar.g(), this.f);
        this.g += iprVar.g();
        this.l = Math.max(iprVar.i(), this.l);
        this.m += iprVar.i();
        this.n = Math.max(iprVar.c(), this.n);
        this.o += iprVar.c();
        if (this.x >= 234) {
            K();
        }
    }

    public final synchronized void y() {
        irt irtVar = this.t;
        if (irtVar == null) {
            ((ype) this.a.l().ai(1260)).u("Not publishing diagnostics: session is over.");
        } else {
            this.z.b(E(irtVar, otr.STREAMING));
        }
    }

    @Override // defpackage.jat
    public final synchronized void z() {
        D();
    }

    @Override // defpackage.jdr
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.jdr
    public final /* synthetic */ void l() {
    }
}
