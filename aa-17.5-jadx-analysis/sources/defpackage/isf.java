package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class isf {
    public static final yph a = yph.c("CAR.MicDiagnosticsTrckr");
    public ise b;
    public final fbf c;
    private final jfp d;
    private final List e = new ArrayList(2);
    private int f = -1;
    private final izj g;

    public isf(isd isdVar) {
        this.g = isdVar.c;
        this.c = isdVar.d;
        imt imtVar = new imt(this, 10, null);
        yph yphVar = jfp.a;
        jfn jfnVar = new jfn(imtVar);
        jfnVar.b = isdVar.a;
        jfnVar.b(isdVar.b);
        jfnVar.c(isdVar.b);
        jfnVar.e = TimeUnit.MILLISECONDS;
        this.d = jfnVar.a();
    }

    private final void g() {
        ise iseVar = this.b;
        iseVar.getClass();
        Queue queue = iseVar.d;
        woy.Z(iseVar.c >= queue.size());
        abnp abnpVarN = oub.a.n();
        int i = this.f;
        abnpVarN.t();
        oub oubVar = (oub) abnpVarN.b;
        oubVar.b |= 1;
        oubVar.c = i;
        int i2 = iseVar.a;
        abnpVarN.t();
        oub oubVar2 = (oub) abnpVarN.b;
        oubVar2.b |= 2;
        oubVar2.d = i2;
        int size = this.e.size();
        abnpVarN.t();
        oub oubVar3 = (oub) abnpVarN.b;
        oubVar3.b |= 4;
        oubVar3.e = size;
        abpt abptVarH = h();
        int iMin = Math.min(iseVar.f, 128);
        oue oueVar = oue.a;
        abnp abnpVarN2 = oueVar.n();
        abnpVarN2.t();
        oue oueVar2 = (oue) abnpVarN2.b;
        abpt abptVar = iseVar.b;
        abptVar.getClass();
        oueVar2.c = abptVar;
        oueVar2.b |= 1;
        abnpVarN2.t();
        oue oueVar3 = (oue) abnpVarN2.b;
        abptVarH.getClass();
        oueVar3.d = abptVarH;
        oueVar3.b |= 2;
        int i3 = iseVar.e;
        abnpVarN2.t();
        oue oueVar4 = (oue) abnpVarN2.b;
        oueVar4.b |= 4;
        oueVar4.e = i3;
        int i4 = iseVar.g;
        abnpVarN2.t();
        oue oueVar5 = (oue) abnpVarN2.b;
        oueVar5.b |= 8;
        oueVar5.f = i4;
        abms abmsVarW = abms.w(iseVar.m, 0, iMin);
        abnpVarN2.t();
        oue oueVar6 = (oue) abnpVarN2.b;
        abmsVarW.getClass();
        oueVar6.b = 128 | oueVar6.b;
        oueVar6.j = abmsVarW;
        int i5 = iseVar.f - iMin;
        abnpVarN2.t();
        oue oueVar7 = (oue) abnpVarN2.b;
        oueVar7.b |= 256;
        oueVar7.k = i5;
        int i6 = iseVar.l;
        abnpVarN2.t();
        oue oueVar8 = (oue) abnpVarN2.b;
        oueVar8.b |= 64;
        oueVar8.i = i6;
        int i7 = iseVar.e;
        if (i7 > 1) {
            isc iscVar = iseVar.j;
            woy.Z(iscVar.a == i7 + (-1));
            abnp abnpVarN3 = otz.a.n();
            int i8 = iscVar.a;
            abnpVarN3.t();
            otz otzVar = (otz) abnpVarN3.b;
            otzVar.b |= 1;
            otzVar.c = i8;
            abnf abnfVarC = abqs.c(iscVar.b);
            abnpVarN3.t();
            otz otzVar2 = (otz) abnpVarN3.b;
            abnfVarC.getClass();
            otzVar2.d = abnfVarC;
            otzVar2.b |= 2;
            abnf abnfVarC2 = abqs.c(iscVar.c);
            abnpVarN3.t();
            otz otzVar3 = (otz) abnpVarN3.b;
            abnfVarC2.getClass();
            otzVar3.e = abnfVarC2;
            otzVar3.b |= 4;
            abnf abnfVarC3 = abqs.c(iscVar.d);
            abnpVarN3.t();
            otz otzVar4 = (otz) abnpVarN3.b;
            abnfVarC3.getClass();
            otzVar4.f = abnfVarC3;
            otzVar4.b |= 8;
            abnf abnfVarC4 = abqs.c((long) iscVar.e);
            abnpVarN3.t();
            otz otzVar5 = (otz) abnpVarN3.b;
            abnfVarC4.getClass();
            otzVar5.g = abnfVarC4;
            otzVar5.b |= 16;
            abnf abnfVarC5 = abqs.c((long) iscVar.a());
            abnpVarN3.t();
            otz otzVar6 = (otz) abnpVarN3.b;
            abnfVarC5.getClass();
            otzVar6.h = abnfVarC5;
            otzVar6.b |= 32;
            otz otzVar7 = (otz) abnpVarN3.q();
            abnpVarN2.t();
            oue oueVar9 = (oue) abnpVarN2.b;
            otzVar7.getClass();
            oueVar9.g = otzVar7;
            oueVar9.b |= 16;
        }
        isc iscVar2 = iseVar.k;
        if (iscVar2.a > 0) {
            abnp abnpVarN4 = oua.a.n();
            int i9 = iscVar2.a;
            abnpVarN4.t();
            oua ouaVar = (oua) abnpVarN4.b;
            ouaVar.b |= 1;
            ouaVar.c = i9;
            long j = iscVar2.b;
            abnpVarN4.t();
            oua ouaVar2 = (oua) abnpVarN4.b;
            ouaVar2.b |= 2;
            ouaVar2.d = j;
            long j2 = iscVar2.c;
            abnpVarN4.t();
            oua ouaVar3 = (oua) abnpVarN4.b;
            ouaVar3.b |= 4;
            ouaVar3.e = j2;
            long j3 = iscVar2.d;
            abnpVarN4.t();
            oua ouaVar4 = (oua) abnpVarN4.b;
            ouaVar4.b |= 8;
            ouaVar4.f = j3;
            double d = iscVar2.e;
            abnpVarN4.t();
            oua ouaVar5 = (oua) abnpVarN4.b;
            ouaVar5.b |= 16;
            ouaVar5.g = d;
            double dA = iscVar2.a();
            abnpVarN4.t();
            oua ouaVar6 = (oua) abnpVarN4.b;
            ouaVar6.b |= 32;
            ouaVar6.h = dA;
            oua ouaVar7 = (oua) abnpVarN4.q();
            abnpVarN2.t();
            oue oueVar10 = (oue) abnpVarN2.b;
            ouaVar7.getClass();
            oueVar10.h = ouaVar7;
            oueVar10.b |= 32;
        }
        Iterator it = iseVar.n.iterator();
        while (it.hasNext()) {
            oty otyVar = (oty) ((abnp) it.next()).q();
            abnpVarN2.t();
            oue oueVar11 = (oue) abnpVarN2.b;
            otyVar.getClass();
            aboh abohVar = oueVar11.l;
            if (!abohVar.c()) {
                oueVar11.l = abnv.I(abohVar);
            }
            oueVar11.l.add(otyVar);
        }
        iseVar.f = 0;
        oue oueVar12 = (oue) abnpVarN2.q();
        abnpVarN.t();
        oub oubVar4 = (oub) abnpVarN.b;
        oueVar12.getClass();
        oubVar4.f = oueVar12;
        oubVar4.b |= 8;
        abnpVarN.C(queue);
        int size2 = iseVar.c - queue.size();
        abnpVarN.t();
        oub oubVar5 = (oub) abnpVarN.b;
        oubVar5.b |= 16;
        oubVar5.h = size2;
        oub oubVar6 = (oub) abnpVarN.q();
        ((iwz) this.g.a).e.a(roc.Q(oubVar6));
        fbf fbfVar = this.c;
        Iterator<E> it2 = oubVar6.g.iterator();
        while (it2.hasNext()) {
            ouc oucVarB = ouc.b(((oud) it2.next()).e);
            if (oucVarB == null) {
                oucVarB = ouc.MICROPHONE_SESSION_EVENT_TYPE_UNSPECIFIED;
            }
            fbfVar.j(fbf.i(oucVarB), 1);
        }
        fbfVar.j(yzy.xJ, oubVar6.h);
        yzy yzyVar = yzy.xL;
        oue oueVar13 = oubVar6.f;
        if (oueVar13 == null) {
            oueVar13 = oueVar;
        }
        fbfVar.j(yzyVar, oueVar13.k);
        if (oubVar6.e == 0) {
            oue oueVar14 = oubVar6.f;
            if (oueVar14 != null) {
                oueVar = oueVar14;
            }
            for (oty otyVar2 : oueVar.l) {
                otx otxVarB = otx.b(otyVar2.d);
                if (otxVarB == null) {
                    otxVarB = otx.DROPPED_MICROPHONE_FRAME_REASON_UNSPECIFIED;
                }
                fbfVar.j(fbf.h(otxVarB), otyVar2.e);
            }
            fbfVar.j(yzy.xM, oueVar.e);
            fbfVar.j(yzy.xK, oueVar.i);
        }
        iseVar.a++;
        iseVar.c = 0;
        queue.clear();
    }

    private static final abpt h() {
        return abqu.b(Instant.now().toEpochMilli());
    }

    public final synchronized void a(String str, otx otxVar) {
        ise iseVar = this.b;
        if (iseVar == null) {
            ype ypeVar = (ype) ((ype) ((ype) a.h()).q(ypd.MEDIUM)).ai(1275);
            zjc zjcVar = zjc.a;
            ypeVar.M("logDroppedFrame(tag=%s, reason=%s): discarding event because session is not in progress", new zjd(zjcVar, str), new zjd(zjcVar, otxVar.name()));
            this.c.k(fbf.h(otxVar));
            return;
        }
        yph yphVar = a;
        zjc zjcVar2 = zjc.a;
        ((ype) yphVar.l().ai((char) 1274)).M("logDroppedFrame(tag=%s, reason=%s)", new zjd(zjcVar2, str), new zjd(zjcVar2, otxVar.name()));
        woy.aa(iseVar.e > 0, "No frames have been received yet");
        List<abnp> list = iseVar.n;
        for (abnp abnpVar : list) {
            otx otxVarB = otx.b(((oty) abnpVar.b).d);
            if (otxVarB == null) {
                otxVarB = otx.DROPPED_MICROPHONE_FRAME_REASON_UNSPECIFIED;
            }
            if (otxVar.equals(otxVarB) && str.equals(((oty) abnpVar.b).c)) {
                int i = ((oty) abnpVar.b).e + 1;
                abnpVar.t();
                oty otyVar = (oty) abnpVar.b;
                otyVar.b |= 4;
                otyVar.e = i;
                return;
            }
        }
        abnp abnpVarN = oty.a.n();
        abnpVarN.t();
        oty otyVar2 = (oty) abnpVarN.b;
        str.getClass();
        otyVar2.b |= 1;
        otyVar2.c = str;
        abnpVarN.t();
        oty otyVar3 = (oty) abnpVarN.b;
        otyVar3.d = otxVar.f;
        otyVar3.b |= 2;
        abnpVarN.t();
        oty otyVar4 = (oty) abnpVarN.b;
        otyVar4.b |= 4;
        otyVar4.e = 1;
        int i2 = iseVar.e - 1;
        abnpVarN.t();
        oty otyVar5 = (oty) abnpVarN.b;
        otyVar5.b |= 8;
        otyVar5.f = i2;
        abpt abptVarH = h();
        abnpVarN.t();
        oty otyVar6 = (oty) abnpVarN.b;
        abptVarH.getClass();
        otyVar6.g = abptVarH;
        otyVar6.b |= 16;
        list.add(abnpVarN);
    }

    public final synchronized void b(String str, ouc oucVar) {
        ise iseVar = this.b;
        if (iseVar == null) {
            ype ypeVar = (ype) ((ype) ((ype) a.h()).q(ypd.MEDIUM)).ai(1277);
            zjc zjcVar = zjc.a;
            ypeVar.M("logEvent(tag=%s, event=%s): discarding event because session is not in progress", new zjd(zjcVar, str), new zjd(zjcVar, oucVar.name()));
            this.c.k(fbf.i(oucVar));
            return;
        }
        yph yphVar = a;
        zjc zjcVar2 = zjc.a;
        ((ype) yphVar.l().ai((char) 1276)).M("logEvent(tag=%s, event=%s)", new zjd(zjcVar2, str), new zjd(zjcVar2, oucVar.name()));
        abnp abnpVarN = oud.a.n();
        abnpVarN.t();
        oud oudVar = (oud) abnpVarN.b;
        str.getClass();
        oudVar.b |= 1;
        oudVar.c = str;
        abpt abptVarH = h();
        abnpVarN.t();
        oud oudVar2 = (oud) abnpVarN.b;
        abptVarH.getClass();
        oudVar2.d = abptVarH;
        oudVar2.b |= 2;
        abnpVarN.t();
        oud oudVar3 = (oud) abnpVarN.b;
        oudVar3.e = oucVar.s;
        oudVar3.b |= 4;
        iseVar.d.add((oud) abnpVarN.q());
        iseVar.c++;
    }

    public final synchronized void c() {
        List list = this.e;
        if (!list.isEmpty()) {
            list.clear();
            this.b = null;
            this.d.b();
        }
        this.c.l();
    }

    public final synchronized void d() {
        if (this.e.isEmpty()) {
            ((ype) a.l().ai((char) 1279)).u("Not publishing diagnostics: session is over.");
        } else {
            g();
        }
    }

    public final synchronized void e(String str) {
        yph yphVar = a;
        zjc zjcVar = zjc.a;
        ((ype) yphVar.l().ai((char) 1280)).y("startTracking(%s)", new zjd(zjcVar, str));
        List list = this.e;
        woy.S(!list.contains(str), "Session already started with %s", str);
        list.add(str);
        int size = list.size();
        ise iseVar = this.b;
        if (size > 1) {
            iseVar.getClass();
            return;
        }
        int i = 0;
        woy.Z(iseVar == null);
        this.b = new ise(h());
        this.d.a();
        int i2 = this.f;
        if (i2 != -1) {
            i = i2 + 1;
        }
        this.f = i;
        ((ype) yphVar.l().ai((char) 1281)).y("Session #%s started", new zjd(zjcVar, Integer.valueOf(i)));
    }

    public final synchronized void f(String str) {
        yph yphVar = a;
        zjc zjcVar = zjc.a;
        ((ype) yphVar.l().ai((char) 1282)).y("stopTracking(%s)", new zjd(zjcVar, str));
        List list = this.e;
        woy.S(list.remove(str), "Session not started with %s", str);
        this.b.getClass();
        if (list.isEmpty()) {
            this.d.b();
            g();
            this.b = null;
            ((ype) yphVar.l().ai((char) 1283)).y("Session #%s ended", new zjd(zjcVar, Integer.valueOf(this.f)));
        }
    }
}
