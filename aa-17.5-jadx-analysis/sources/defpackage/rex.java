package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class rex implements ruf, rse {
    public static final /* synthetic */ int a = 0;
    private static final ypf b = ols.R("CAR.AUDIO.DIAGNOST");
    private final otv c;
    private final ouh d;
    private final int e;
    private final rzn f;
    private final rse g;
    private rew h;
    private int i = -1;
    private final ykd j;

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, rse] */
    public rex(sy syVar) {
        Object obj = syVar.d;
        obj.getClass();
        this.j = (ykd) obj;
        Object obj2 = syVar.g;
        obj2.getClass();
        this.c = (otv) obj2;
        Object obj3 = syVar.e;
        obj3.getClass();
        this.d = (ouh) obj3;
        this.e = syVar.a;
        ral ralVar = new ral(this, 6);
        ypf ypfVar = rzn.a;
        rzl rzlVar = new rzl(ralVar);
        ?? r0 = syVar.f;
        r0.getClass();
        rzlVar.b = r0;
        long j = syVar.b;
        woy.N(j >= 0);
        rzlVar.c = j;
        long j2 = syVar.b;
        woy.N(j2 > 0);
        rzlVar.d = j2;
        rzlVar.e = TimeUnit.MILLISECONDS;
        rzlVar.b.getClass();
        woy.aa(rzlVar.d > 0, "period is required");
        rzlVar.e.getClass();
        this.f = new rzn(rzlVar);
        ?? r9 = syVar.c;
        r9.getClass();
        this.g = r9;
    }

    private final ots q(rew rewVar, otr otrVar) {
        int i = rewVar.m;
        Queue queue = rewVar.n;
        final int i2 = 0;
        final int i3 = 1;
        woy.Z(i >= queue.size());
        abnp abnpVarN = ots.a.n();
        abnp abnpVarN2 = otw.a.n();
        int i4 = this.i;
        abnpVarN2.t();
        otw otwVar = (otw) abnpVarN2.b;
        otwVar.b |= 1;
        otwVar.c = i4;
        abnpVarN2.t();
        otw otwVar2 = (otw) abnpVarN2.b;
        otwVar2.d = this.c.e;
        otwVar2.b |= 2;
        abnpVarN2.t();
        otw otwVar3 = (otw) abnpVarN2.b;
        otwVar3.e = this.d.f;
        otwVar3.b |= 4;
        abnpVarN.t();
        ots otsVar = (ots) abnpVarN.b;
        otw otwVar4 = (otw) abnpVarN2.q();
        otwVar4.getClass();
        otsVar.c = otwVar4;
        otsVar.b |= 1;
        int i5 = rewVar.a;
        abnpVarN.t();
        ots otsVar2 = (ots) abnpVarN.b;
        otsVar2.b |= 2;
        otsVar2.d = i5;
        abnpVarN.t();
        ots otsVar3 = (ots) abnpVarN.b;
        otsVar3.e = otrVar.d;
        otsVar3.b |= 4;
        abpt abptVarD = abqu.d();
        abnp abnpVarN3 = ott.a.n();
        abnpVarN3.t();
        ott ottVar = (ott) abnpVarN3.b;
        abpt abptVar = rewVar.b;
        abptVar.getClass();
        ottVar.c = abptVar;
        ottVar.b |= 1;
        abnpVarN3.t();
        ott ottVar2 = (ott) abnpVarN3.b;
        abptVarD.getClass();
        ottVar2.d = abptVarD;
        ottVar2.b |= 2;
        int i6 = rewVar.d;
        abnpVarN3.t();
        ott ottVar3 = (ott) abnpVarN3.b;
        ottVar3.b |= 8;
        ottVar3.f = i6;
        int i7 = rewVar.c;
        abnpVarN3.t();
        ott ottVar4 = (ott) abnpVarN3.b;
        ottVar4.b |= 4;
        ottVar4.e = i7;
        int i8 = rewVar.e;
        abnpVarN3.t();
        ott ottVar5 = (ott) abnpVarN3.b;
        ottVar5.b |= 16;
        ottVar5.g = i8;
        int i9 = rewVar.g;
        abnpVarN3.t();
        ott ottVar6 = (ott) abnpVarN3.b;
        ottVar6.b |= 64;
        ottVar6.i = i9;
        int i10 = rewVar.f;
        if (i10 > Integer.MIN_VALUE) {
            abnpVarN3.t();
            ott ottVar7 = (ott) abnpVarN3.b;
            ottVar7.b |= 32;
            ottVar7.h = i10;
        }
        rfj rfjVar = rewVar.h;
        if (rfjVar.a > 0) {
            otz otzVarR = r(rfjVar, new rev() { // from class: reu
                @Override // defpackage.rev
                public final abnf a(long j) {
                    return i3 != 0 ? abqs.b(j) : abqs.c(j);
                }
            });
            abnpVarN3.t();
            ott ottVar8 = (ott) abnpVarN3.b;
            otzVarR.getClass();
            ottVar8.l = otzVarR;
            ottVar8.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        }
        rfj rfjVar2 = rewVar.i;
        if (rfjVar2.a > 0) {
            otz otzVarR2 = r(rfjVar2, new rev() { // from class: reu
                @Override // defpackage.rev
                public final abnf a(long j) {
                    return i3 != 0 ? abqs.b(j) : abqs.c(j);
                }
            });
            abnpVarN3.t();
            ott ottVar9 = (ott) abnpVarN3.b;
            otzVarR2.getClass();
            ottVar9.o = otzVarR2;
            ottVar9.b |= 4096;
        }
        rfj rfjVar3 = rewVar.j;
        if (rfjVar3.a > 0) {
            otz otzVarR3 = r(rfjVar3, new rev() { // from class: reu
                @Override // defpackage.rev
                public final abnf a(long j) {
                    return i2 != 0 ? abqs.b(j) : abqs.c(j);
                }
            });
            abnpVarN3.t();
            ott ottVar10 = (ott) abnpVarN3.b;
            otzVarR3.getClass();
            ottVar10.n = otzVarR3;
            ottVar10.b |= 2048;
        }
        rfj rfjVar4 = rewVar.k;
        if (rfjVar4.a > 0) {
            abnp abnpVarN4 = oua.a.n();
            int i11 = rfjVar4.a;
            abnpVarN4.t();
            oua ouaVar = (oua) abnpVarN4.b;
            ouaVar.b |= 1;
            ouaVar.c = i11;
            long j = rfjVar4.b;
            abnpVarN4.t();
            oua ouaVar2 = (oua) abnpVarN4.b;
            ouaVar2.b |= 2;
            ouaVar2.d = j;
            long j2 = rfjVar4.c;
            abnpVarN4.t();
            oua ouaVar3 = (oua) abnpVarN4.b;
            ouaVar3.b |= 4;
            ouaVar3.e = j2;
            long j3 = rfjVar4.d;
            abnpVarN4.t();
            oua ouaVar4 = (oua) abnpVarN4.b;
            ouaVar4.b |= 8;
            ouaVar4.f = j3;
            double d = rfjVar4.e;
            abnpVarN4.t();
            oua ouaVar5 = (oua) abnpVarN4.b;
            ouaVar5.b |= 16;
            ouaVar5.g = d;
            double dA = rfjVar4.a();
            abnpVarN4.t();
            oua ouaVar6 = (oua) abnpVarN4.b;
            ouaVar6.b |= 32;
            ouaVar6.h = dA;
            oua ouaVar7 = (oua) abnpVarN4.q();
            abnpVarN3.t();
            ott ottVar11 = (ott) abnpVarN3.b;
            ouaVar7.getClass();
            ottVar11.q = ouaVar7;
            ottVar11.b |= 32768;
        }
        Iterator it = rewVar.l.iterator();
        while (it.hasNext()) {
            abnpVarN3.B((ouj) ((abnp) it.next()).q());
        }
        ott ottVar12 = (ott) abnpVarN3.q();
        abnpVarN.t();
        ots otsVar4 = (ots) abnpVarN.b;
        ottVar12.getClass();
        otsVar4.f = ottVar12;
        otsVar4.b |= 8;
        abnpVarN.A(queue);
        int size = rewVar.m - queue.size();
        abnpVarN.t();
        ots otsVar5 = (ots) abnpVarN.b;
        otsVar5.b |= 16;
        otsVar5.h = size;
        ots otsVar6 = (ots) abnpVarN.q();
        rewVar.a++;
        rewVar.m = 0;
        queue.clear();
        return otsVar6;
    }

    private static otz r(rfj rfjVar, rev revVar) {
        abnp abnpVarN = otz.a.n();
        int i = rfjVar.a;
        abnpVarN.t();
        otz otzVar = (otz) abnpVarN.b;
        otzVar.b |= 1;
        otzVar.c = i;
        abnf abnfVarA = revVar.a(rfjVar.b);
        abnpVarN.t();
        otz otzVar2 = (otz) abnpVarN.b;
        abnfVarA.getClass();
        otzVar2.d = abnfVarA;
        otzVar2.b |= 2;
        abnf abnfVarA2 = revVar.a(rfjVar.c);
        abnpVarN.t();
        otz otzVar3 = (otz) abnpVarN.b;
        abnfVarA2.getClass();
        otzVar3.e = abnfVarA2;
        otzVar3.b |= 4;
        abnf abnfVarA3 = revVar.a(rfjVar.d);
        abnpVarN.t();
        otz otzVar4 = (otz) abnpVarN.b;
        abnfVarA3.getClass();
        otzVar4.f = abnfVarA3;
        otzVar4.b |= 8;
        abnf abnfVarA4 = revVar.a((long) rfjVar.e);
        abnpVarN.t();
        otz otzVar5 = (otz) abnpVarN.b;
        abnfVarA4.getClass();
        otzVar5.g = abnfVarA4;
        otzVar5.b |= 16;
        abnf abnfVarA5 = revVar.a((long) rfjVar.a());
        abnpVarN.t();
        otz otzVar6 = (otz) abnpVarN.b;
        abnfVarA5.getClass();
        otzVar6.h = abnfVarA5;
        otzVar6.b |= 32;
        return (otz) abnpVarN.q();
    }

    private final synchronized rew s() {
        return this.h;
    }

    private static final void t(abnp abnpVar) {
        woy.N(1 == (((oup) abnpVar.b).b & 1));
        woy.N((((oup) abnpVar.b).b & 4) != 0);
        abpt abptVarD = abqu.d();
        abnpVar.t();
        oup oupVar = (oup) abnpVar.b;
        abptVarD.getClass();
        oupVar.d = abptVarD;
        oupVar.b |= 2;
    }

    @Override // defpackage.rse
    public final synchronized void a() {
        this.g.a();
    }

    @Override // defpackage.rul
    public final synchronized void b(int i) {
        this.g.b(i);
    }

    @Override // defpackage.rul
    public final synchronized void c(int i) {
        rew rewVarS = s();
        if (rewVarS != null) {
            rewVarS.k.b(i);
        }
        this.g.c(i);
    }

    @Override // defpackage.rul
    public final synchronized void d() {
        rew rewVarS = s();
        if (rewVarS != null) {
            rewVarS.e++;
        }
        this.g.d();
    }

    @Override // defpackage.rul
    public final synchronized void e(long j, long j2) {
        rew rewVarS = s();
        if (rewVarS != null) {
            rewVarS.i.b(j);
        }
        this.g.e(j, j2);
    }

    @Override // defpackage.rul
    public final synchronized void f(int i) {
        rew rewVarS = s();
        if (rewVarS != null) {
            rewVarS.d++;
            rewVarS.c += i;
        } else {
            b.l().l(10, TimeUnit.SECONDS).ai(7917).w("frame sent outside session. size: %d", i);
        }
        this.g.f(i);
    }

    @Override // defpackage.rul
    public final synchronized void g(int i) {
        rew rewVarS = s();
        if (rewVarS != null) {
            rewVarS.f = i;
        }
        this.g.g(i);
    }

    @Override // defpackage.rul
    public final synchronized void h() {
        rew rewVarS = s();
        if (rewVarS != null) {
            rewVarS.g++;
        }
        this.g.h();
    }

    @Override // defpackage.rul
    public final synchronized void i(long j) {
        rew rewVarS = s();
        if (rewVarS != null) {
            rewVarS.j.b(j);
        }
        this.g.i(j);
    }

    @Override // defpackage.rul
    public final synchronized void j() {
        this.g.j();
    }

    @Override // defpackage.ruf
    public final synchronized void k() {
        rew rewVar = this.h;
        if (rewVar == null) {
            b.l().ai(7916).u("Session has ended or did not start.");
            return;
        }
        this.j.y(q(rewVar, otr.NOT_STREAMING));
        this.f.b();
        this.h = null;
        b.l().ai(7915).D("Session #%d ended for stream: %s", this.i, this.d.name());
    }

    @Override // defpackage.ruf
    public final synchronized void l(String str, oui ouiVar) {
        rew rewVarS = s();
        if (rewVarS != null) {
            List<abnp> list = rewVarS.l;
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
            int i2 = rewVarS.d;
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
        }
    }

    public final synchronized void m() {
        rew rewVar = this.h;
        if (rewVar == null) {
            b.l().ai(7919).u("Not publishing diagnostics: session is over.");
        } else {
            this.j.y(q(rewVar, otr.STREAMING));
        }
    }

    @Override // defpackage.ruf
    public final synchronized void n(abnp abnpVar) {
        t(abnpVar);
        rew rewVar = this.h;
        if (rewVar == null) {
            o(abnpVar);
            return;
        }
        rewVar.n.add((oup) abnpVar.q());
        rewVar.m++;
    }

    @Override // defpackage.ruf
    public final void o(abnp abnpVar) {
        t(abnpVar);
        oup oupVar = (oup) abnpVar.q();
        abnp abnpVarN = ots.a.n();
        abnp abnpVarN2 = otw.a.n();
        abnpVarN2.t();
        otw otwVar = (otw) abnpVarN2.b;
        otwVar.d = this.c.e;
        otwVar.b |= 2;
        abnpVarN2.t();
        otw otwVar2 = (otw) abnpVarN2.b;
        otwVar2.e = this.d.f;
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
        abnpVarN.A(yfq.q(oupVar));
        this.j.y((ots) abnpVarN.q());
    }

    @Override // defpackage.ruf
    public final synchronized void p(abnp abnpVar) {
        t(abnpVar);
        rew rewVar = this.h;
        if (rewVar == null) {
            rew rewVar2 = new rew(abqu.d(), this.e);
            this.h = rewVar2;
            this.f.a();
            int i = this.i;
            this.i = i == -1 ? 0 : i + 1;
            b.l().ai(7918).D("Session #%d started for stream: %s", this.i, this.d.name());
            rewVar = rewVar2;
        }
        rewVar.n.add((oup) abnpVar.q());
        rewVar.m++;
    }
}
