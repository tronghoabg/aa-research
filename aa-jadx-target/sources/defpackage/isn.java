package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class isn {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.MicDiagnosticsTrckr");
    public ism b;
    public final defpackage.fbl c;
    private final defpackage.jfx d;
    private final java.util.List e = new java.util.ArrayList(2);
    private int f = -1;
    private final defpackage.izq g;

    public isn(defpackage.isl islVar) {
        this.g = islVar.c;
        this.c = islVar.d;
        defpackage.ire ireVar = new defpackage.ire(this, 4);
        defpackage.yqm yqmVar = defpackage.jfx.a;
        defpackage.jfv jfvVar = new defpackage.jfv(ireVar);
        jfvVar.b = islVar.a;
        jfvVar.b(islVar.b);
        jfvVar.c(islVar.b);
        jfvVar.e = java.util.concurrent.TimeUnit.MILLISECONDS;
        this.d = jfvVar.a();
    }

    private final void g() {
        ism ismVar = this.b;
        ismVar.getClass();
        java.util.Queue queue = ismVar.d;
        defpackage.ysr.bj(ismVar.c >= queue.size());
        defpackage.abor aborVarN = ouy.a.n();
        int i = this.f;
        aborVarN.t();
        ouy ouyVar = aborVarN.b;
        ouyVar.b |= 1;
        ouyVar.c = i;
        int i2 = ismVar.a;
        aborVarN.t();
        ouy ouyVar2 = aborVarN.b;
        ouyVar2.b |= 2;
        ouyVar2.d = i2;
        int size = this.e.size();
        aborVarN.t();
        ouy ouyVar3 = aborVarN.b;
        ouyVar3.b |= 4;
        ouyVar3.e = size;
        defpackage.abqv abqvVarH = h();
        int iMin = java.lang.Math.min(ismVar.f, 128);
        ovb ovbVar = ovb.a;
        defpackage.abor aborVarN2 = ovbVar.n();
        aborVarN2.t();
        ovb ovbVar2 = aborVarN2.b;
        defpackage.abqv abqvVar = ismVar.b;
        abqvVar.getClass();
        ovbVar2.c = abqvVar;
        ovbVar2.b |= 1;
        aborVarN2.t();
        ovb ovbVar3 = aborVarN2.b;
        abqvVarH.getClass();
        ovbVar3.d = abqvVarH;
        ovbVar3.b |= 2;
        int i3 = ismVar.e;
        aborVarN2.t();
        ovb ovbVar4 = aborVarN2.b;
        ovbVar4.b |= 4;
        ovbVar4.e = i3;
        int i4 = ismVar.g;
        aborVarN2.t();
        ovb ovbVar5 = aborVarN2.b;
        ovbVar5.b |= 8;
        ovbVar5.f = i4;
        defpackage.abnv abnvVarW = defpackage.abnv.w(ismVar.m, 0, iMin);
        aborVarN2.t();
        ovb ovbVar6 = aborVarN2.b;
        abnvVarW.getClass();
        ovbVar6.b = 128 | ovbVar6.b;
        ovbVar6.j = abnvVarW;
        int i5 = ismVar.f - iMin;
        aborVarN2.t();
        ovb ovbVar7 = aborVarN2.b;
        ovbVar7.b |= 256;
        ovbVar7.k = i5;
        int i6 = ismVar.l;
        aborVarN2.t();
        ovb ovbVar8 = aborVarN2.b;
        ovbVar8.b |= 64;
        ovbVar8.i = i6;
        int i7 = ismVar.e;
        if (i7 > 1) {
            isk iskVar = ismVar.j;
            defpackage.ysr.bj(iskVar.a == i7 + (-1));
            defpackage.abor aborVarN3 = ouw.a.n();
            int i8 = iskVar.a;
            aborVarN3.t();
            ouw ouwVar = aborVarN3.b;
            ouwVar.b |= 1;
            ouwVar.c = i8;
            defpackage.aboh abohVarC = defpackage.abrv.c(iskVar.b);
            aborVarN3.t();
            ouw ouwVar2 = aborVarN3.b;
            abohVarC.getClass();
            ouwVar2.d = abohVarC;
            ouwVar2.b |= 2;
            defpackage.aboh abohVarC2 = defpackage.abrv.c(iskVar.c);
            aborVarN3.t();
            ouw ouwVar3 = aborVarN3.b;
            abohVarC2.getClass();
            ouwVar3.e = abohVarC2;
            ouwVar3.b |= 4;
            defpackage.aboh abohVarC3 = defpackage.abrv.c(iskVar.d);
            aborVarN3.t();
            ouw ouwVar4 = aborVarN3.b;
            abohVarC3.getClass();
            ouwVar4.f = abohVarC3;
            ouwVar4.b |= 8;
            defpackage.aboh abohVarC4 = defpackage.abrv.c((long) iskVar.e);
            aborVarN3.t();
            ouw ouwVar5 = aborVarN3.b;
            abohVarC4.getClass();
            ouwVar5.g = abohVarC4;
            ouwVar5.b |= 16;
            defpackage.aboh abohVarC5 = defpackage.abrv.c((long) iskVar.a());
            aborVarN3.t();
            ouw ouwVar6 = aborVarN3.b;
            abohVarC5.getClass();
            ouwVar6.h = abohVarC5;
            ouwVar6.b |= 32;
            ouw ouwVarQ = aborVarN3.q();
            aborVarN2.t();
            ovb ovbVar9 = aborVarN2.b;
            ouwVarQ.getClass();
            ovbVar9.g = ouwVarQ;
            ovbVar9.b |= 16;
        }
        isk iskVar2 = ismVar.k;
        if (iskVar2.a > 0) {
            defpackage.abor aborVarN4 = oux.a.n();
            int i9 = iskVar2.a;
            aborVarN4.t();
            oux ouxVar = aborVarN4.b;
            ouxVar.b |= 1;
            ouxVar.c = i9;
            long j = iskVar2.b;
            aborVarN4.t();
            oux ouxVar2 = aborVarN4.b;
            ouxVar2.b |= 2;
            ouxVar2.d = j;
            long j2 = iskVar2.c;
            aborVarN4.t();
            oux ouxVar3 = aborVarN4.b;
            ouxVar3.b |= 4;
            ouxVar3.e = j2;
            long j3 = iskVar2.d;
            aborVarN4.t();
            oux ouxVar4 = aborVarN4.b;
            ouxVar4.b |= 8;
            ouxVar4.f = j3;
            double d = iskVar2.e;
            aborVarN4.t();
            oux ouxVar5 = aborVarN4.b;
            ouxVar5.b |= 16;
            ouxVar5.g = d;
            double dA = iskVar2.a();
            aborVarN4.t();
            oux ouxVar6 = aborVarN4.b;
            ouxVar6.b |= 32;
            ouxVar6.h = dA;
            oux ouxVarQ = aborVarN4.q();
            aborVarN2.t();
            ovb ovbVar10 = aborVarN2.b;
            ouxVarQ.getClass();
            ovbVar10.h = ouxVarQ;
            ovbVar10.b |= 32;
        }
        java.util.Iterator it = ismVar.n.iterator();
        while (it.hasNext()) {
            ouv ouvVarQ = ((defpackage.abor) it.next()).q();
            aborVarN2.t();
            ovb ovbVar11 = aborVarN2.b;
            ouvVarQ.getClass();
            defpackage.abpj abpjVar = ovbVar11.l;
            if (!abpjVar.c()) {
                ovbVar11.l = defpackage.abox.I(abpjVar);
            }
            ovbVar11.l.add(ouvVarQ);
        }
        ismVar.f = 0;
        ovb ovbVarQ = aborVarN2.q();
        aborVarN.t();
        ouy ouyVar4 = aborVarN.b;
        ovbVarQ.getClass();
        ouyVar4.f = ovbVarQ;
        ouyVar4.b |= 8;
        aborVarN.C(queue);
        int size2 = ismVar.c - queue.size();
        aborVarN.t();
        ouy ouyVar5 = aborVarN.b;
        ouyVar5.b |= 16;
        ouyVar5.h = size2;
        ouy ouyVarQ = aborVarN.q();
        ((defpackage.ixh) this.g.a).e.a(defpackage.tna.aa(ouyVarQ));
        defpackage.fbl fblVar = this.c;
        java.util.Iterator<E> it2 = ouyVarQ.g.iterator();
        while (it2.hasNext()) {
            defpackage.ouz ouzVarB = defpackage.ouz.b(((ova) it2.next()).e);
            if (ouzVarB == null) {
                ouzVarB = defpackage.ouz.MICROPHONE_SESSION_EVENT_TYPE_UNSPECIFIED;
            }
            fblVar.f(defpackage.fbl.e(ouzVarB), 1);
        }
        fblVar.f(defpackage.zbd.xN, ouyVarQ.h);
        defpackage.zbd zbdVar = defpackage.zbd.xP;
        ovb ovbVar12 = ouyVarQ.f;
        if (ovbVar12 == null) {
            ovbVar12 = ovbVar;
        }
        fblVar.f(zbdVar, ovbVar12.k);
        if (ouyVarQ.e == 0) {
            ovb ovbVar13 = ouyVarQ.f;
            if (ovbVar13 != null) {
                ovbVar = ovbVar13;
            }
            for (ouv ouvVar : ovbVar.l) {
                ouu ouuVarB = ouu.b(ouvVar.d);
                if (ouuVarB == null) {
                    ouuVarB = ouu.a;
                }
                fblVar.f(defpackage.fbl.d(ouuVarB), ouvVar.e);
            }
            fblVar.f(defpackage.zbd.xQ, ovbVar.e);
            fblVar.f(defpackage.zbd.xO, ovbVar.i);
        }
        ismVar.a++;
        ismVar.c = 0;
        queue.clear();
    }

    private static final defpackage.abqv h() {
        return defpackage.abrx.b(j$.time.Instant.now().toEpochMilli());
    }

    public final synchronized void a(java.lang.String str, ouu ouuVar) {
        ism ismVar = this.b;
        if (ismVar == null) {
            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).q(defpackage.yqi.MEDIUM)).ai(1275);
            defpackage.zke zkeVar = defpackage.zke.a;
            yqjVar.M("logDroppedFrame(tag=%s, reason=%s): discarding event because session is not in progress", new defpackage.zkf(zkeVar, str), new defpackage.zkf(zkeVar, ouuVar.name()));
            this.c.g(defpackage.fbl.d(ouuVar));
            return;
        }
        defpackage.yqm yqmVar = a;
        defpackage.zke zkeVar2 = defpackage.zke.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 1274)).M("logDroppedFrame(tag=%s, reason=%s)", new defpackage.zkf(zkeVar2, str), new defpackage.zkf(zkeVar2, ouuVar.name()));
        defpackage.ysr.bk(ismVar.e > 0, "No frames have been received yet");
        java.util.List<defpackage.abor> list = ismVar.n;
        for (defpackage.abor aborVar : list) {
            ouu ouuVarB = ouu.b(aborVar.b.d);
            if (ouuVarB == null) {
                ouuVarB = ouu.a;
            }
            if (ouuVar.equals(ouuVarB) && str.equals(aborVar.b.c)) {
                int i = aborVar.b.e + 1;
                aborVar.t();
                ouv ouvVar = aborVar.b;
                ouvVar.b |= 4;
                ouvVar.e = i;
                return;
            }
        }
        defpackage.abor aborVarN = ouv.a.n();
        aborVarN.t();
        ouv ouvVar2 = aborVarN.b;
        str.getClass();
        ouvVar2.b |= 1;
        ouvVar2.c = str;
        aborVarN.t();
        ouv ouvVar3 = aborVarN.b;
        ouvVar3.d = ouuVar.f;
        ouvVar3.b |= 2;
        aborVarN.t();
        ouv ouvVar4 = aborVarN.b;
        ouvVar4.b |= 4;
        ouvVar4.e = 1;
        int i2 = ismVar.e - 1;
        aborVarN.t();
        ouv ouvVar5 = aborVarN.b;
        ouvVar5.b |= 8;
        ouvVar5.f = i2;
        defpackage.abqv abqvVarH = h();
        aborVarN.t();
        ouv ouvVar6 = aborVarN.b;
        abqvVarH.getClass();
        ouvVar6.g = abqvVarH;
        ouvVar6.b |= 16;
        list.add(aborVarN);
    }

    public final synchronized void b(java.lang.String str, defpackage.ouz ouzVar) {
        ism ismVar = this.b;
        if (ismVar == null) {
            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).q(defpackage.yqi.MEDIUM)).ai(1277);
            defpackage.zke zkeVar = defpackage.zke.a;
            yqjVar.M("logEvent(tag=%s, event=%s): discarding event because session is not in progress", new defpackage.zkf(zkeVar, str), new defpackage.zkf(zkeVar, ouzVar.name()));
            this.c.g(defpackage.fbl.e(ouzVar));
            return;
        }
        defpackage.yqm yqmVar = a;
        defpackage.zke zkeVar2 = defpackage.zke.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 1276)).M("logEvent(tag=%s, event=%s)", new defpackage.zkf(zkeVar2, str), new defpackage.zkf(zkeVar2, ouzVar.name()));
        defpackage.abor aborVarN = ova.a.n();
        aborVarN.t();
        ova ovaVar = aborVarN.b;
        str.getClass();
        ovaVar.b |= 1;
        ovaVar.c = str;
        defpackage.abqv abqvVarH = h();
        aborVarN.t();
        ova ovaVar2 = aborVarN.b;
        abqvVarH.getClass();
        ovaVar2.d = abqvVarH;
        ovaVar2.b |= 2;
        aborVarN.t();
        ova ovaVar3 = aborVarN.b;
        ovaVar3.e = ouzVar.s;
        ovaVar3.b |= 4;
        ismVar.d.add(aborVarN.q());
        ismVar.c++;
    }

    public final synchronized void c() {
        java.util.List list = this.e;
        if (!list.isEmpty()) {
            list.clear();
            this.b = null;
            this.d.b();
        }
        this.c.h();
    }

    public final synchronized void d() {
        if (this.e.isEmpty()) {
            ((defpackage.yqj) a.l().ai((char) 1279)).u("Not publishing diagnostics: session is over.");
        } else {
            g();
        }
    }

    public final synchronized void e(java.lang.String str) {
        defpackage.yqm yqmVar = a;
        defpackage.zke zkeVar = defpackage.zke.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 1280)).y("startTracking(%s)", new defpackage.zkf(zkeVar, str));
        java.util.List list = this.e;
        defpackage.ysr.bc(!list.contains(str), "Session already started with %s", str);
        list.add(str);
        int size = list.size();
        ism ismVar = this.b;
        if (size > 1) {
            ismVar.getClass();
            return;
        }
        int i = 0;
        defpackage.ysr.bj(ismVar == null);
        this.b = new ism(h());
        this.d.a();
        int i2 = this.f;
        if (i2 != -1) {
            i = i2 + 1;
        }
        this.f = i;
        ((defpackage.yqj) yqmVar.l().ai((char) 1281)).y("Session #%s started", new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(i)));
    }

    public final synchronized void f(java.lang.String str) {
        defpackage.yqm yqmVar = a;
        defpackage.zke zkeVar = defpackage.zke.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 1282)).y("stopTracking(%s)", new defpackage.zkf(zkeVar, str));
        java.util.List list = this.e;
        defpackage.ysr.bc(list.remove(str), "Session not started with %s", str);
        this.b.getClass();
        if (list.isEmpty()) {
            this.d.b();
            g();
            this.b = null;
            ((defpackage.yqj) yqmVar.l().ai((char) 1283)).y("Session #%s ended", new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(this.f)));
        }
    }
}
