package defpackage;

import android.graphics.Point;
import android.view.View;
import j$.util.Optional;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class tzz implements trj, trk, umw {
    public static final /* synthetic */ int e = 0;
    public final ackk a;
    public final ackk b;
    public volatile float c;
    public volatile int d;
    private final ackk f;
    private final ackk g;
    private final ackk h;
    private final ackk i;
    private final ackk j;
    private final ackk k;
    private final ackk l;
    private final ackk m;
    private volatile int n;

    static {
        abnr abnrVar = (abnr) abeg.a.n();
        abnp abnpVarN = abch.a.n();
        abnpVarN.t();
        abch abchVar = (abch) abnpVarN.b;
        abchVar.b |= 1;
        abchVar.c = 14;
        abnp abnpVarN2 = abav.a.n();
        abnpVarN2.W();
        abnpVarN.t();
        abch abchVar2 = (abch) abnpVarN.b;
        abav abavVar = (abav) abnpVarN2.q();
        abavVar.getClass();
        abchVar2.e = abavVar;
        abchVar2.b |= 4;
        abnrVar.t();
        abeg abegVar = (abeg) abnrVar.b;
        abch abchVar3 = (abch) abnpVarN.q();
        abchVar3.getClass();
        abegVar.d = abchVar3;
        abegVar.b |= 2;
        abnp abnpVarN3 = abks.a.n();
        abnpVarN3.t();
        abks abksVar = (abks) abnpVarN3.b;
        abksVar.b |= 1;
        abksVar.c = 68109;
        abnp abnpVarN4 = abkt.a.n();
        abnpVarN4.t();
        abkt abktVar = (abkt) abnpVarN4.b;
        abktVar.d = 14;
        abktVar.b |= 2;
        abkt abktVar2 = (abkt) abnpVarN4.q();
        abnpVarN3.t();
        abks abksVar2 = (abks) abnpVarN3.b;
        abktVar2.getClass();
        abksVar2.d = abktVar2;
        abksVar2.b |= 2;
        abnrVar.t();
        abeg abegVar2 = (abeg) abnrVar.b;
        abks abksVar3 = (abks) abnpVarN3.q();
        abksVar3.getClass();
        abegVar2.i = abksVar3;
        abegVar2.b |= 64;
    }

    public tzz(ackk ackkVar, ackk ackkVar2, ackk ackkVar3, ackk ackkVar4, ackk ackkVar5, ackk ackkVar6, ackk ackkVar7, ackk ackkVar8, ackk ackkVar9, ackk ackkVar10, ackk ackkVar11, ackk ackkVar12, ackk ackkVar13, ackk ackkVar14, ackk ackkVar15, ackk ackkVar16, ackk ackkVar17, ackk ackkVar18, ackk ackkVar19, ackk ackkVar20) {
        new AtomicInteger(-1);
        this.n = 1;
        yfy.l(false, new tmo(), true, new tmo());
        new HashMap();
        this.c = 1.0f;
        this.d = 2;
        new ReentrantLock();
        new HashSet();
        new HashSet();
        wub.L(new qfe(ackkVar20, 11));
        wub.L(new qfe(ackkVar20, 12));
        wub.L(new qfe(ackkVar20, 13));
        wub.L(new qfe(ackkVar20, 14));
        this.f = ackkVar;
        this.g = ackkVar2;
        this.a = ackkVar3;
        this.h = ackkVar4;
        this.i = ackkVar5;
        this.j = ackkVar6;
        this.k = ackkVar7;
        this.l = ackkVar8;
        this.m = ackkVar15;
        this.b = ackkVar16;
        ackkVar9.a();
        ackkVar10.a();
        ackkVar11.a();
        ackkVar12.a();
        ackkVar13.a();
        ackkVar14.a();
        ackkVar15.a();
        ackkVar17.a();
        ackkVar18.a();
        ackkVar19.a();
        n();
        if (((uaj) ackkVar16.a()).l()) {
            Optional optional = (Optional) ackkVar4.a();
            qat qatVar = new qat(this, 3);
            if (true != optional.isPresent()) {
                return;
            }
            Object obj = optional.get();
            ((ums) ((tzz) qatVar.a).a.a()).q((trl) obj);
        }
    }

    @Override // defpackage.trj
    public final tnq a() {
        return (tnq) this.f.a();
    }

    @Override // defpackage.trj
    public final tnl c() {
        return (tnl) this.g.a();
    }

    @Override // defpackage.trj
    public final qrx d() {
        return (qrx) this.j.a();
    }

    @Override // defpackage.trj
    public final qrx e() {
        return (qrx) this.k.a();
    }

    @Override // defpackage.trk
    public final View f() {
        n();
        return ((tnq) this.f.a()).a();
    }

    @Override // defpackage.trk
    public final trx g() {
        return (trx) this.l.a();
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        n();
        ((tnq) this.f.a()).c().gt(str, printWriter);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [ackk, java.lang.Object] */
    @Override // defpackage.trk
    public final void h() {
        n();
        ackk ackkVar = this.f;
        tnq tnqVar = (tnq) ackkVar.a();
        Point point = new Point();
        tnqVar.y.a = new txw(point, 1);
        ((tnq) ackkVar.a()).e();
        final qrx qrxVar = (qrx) this.j.a();
        Optional optional = (Optional) qrxVar.d;
        optional.isPresent();
        kqe kqeVar = new kqe(qrxVar, 3);
        optional.isPresent();
        zhc zhcVar = ((tnq) ((qrx) kqeVar.a).f.a()).l;
        prj prjVar = new prj() { // from class: pin
            @Override // defpackage.prj
            public final void a(Object obj) {
                qrx qrxVar2 = qrxVar;
                psb psbVar = psb.UI_THREAD;
                yfy yfyVarK = yfy.k(psbVar, qrxVar2.a);
                ygs ygsVar = new ygs();
                psb psbVar2 = psb.DANGEROUS_PUBLISHER_THREAD;
                Executor executorB = pio.b(psbVar2, yfyVarK);
                Object obj2 = qrxVar2.c;
                qsb qsbVar = (qsb) obj2;
                ygsVar.b(pih.class, new pio(0, pih.class, qsbVar, psbVar2, executorB));
                ygsVar.b(ule.class, new pio(1, ule.class, qsbVar, psbVar, pio.b(psbVar, yfyVarK)));
                ygsVar.b(pyr.class, new pio(2, pyr.class, qsbVar, psbVar2, pio.b(psbVar2, yfyVarK)));
                ygsVar.b(pnc.class, new pio(3, pnc.class, qsbVar, psbVar2, pio.b(psbVar2, yfyVarK)));
                ygsVar.b(pjb.class, new pio(4, pjb.class, qsbVar, psbVar, pio.b(psbVar, yfyVarK)));
                ((psj) qrxVar2.b).d(obj2, ygsVar.a());
                ((AtomicBoolean) qrxVar2.e).set(true);
            }
        };
        wub.ah(zhcVar, new prk(prjVar), zfq.a);
    }

    @Override // defpackage.trk
    public final void i() {
        n();
        ((qrx) this.j.a()).a();
        ((tnq) this.f.a()).f();
        if (((uaj) this.b.a()).l()) {
            Optional optional = (Optional) this.h.a();
            qat qatVar = new qat(this, 4);
            if (true != optional.isPresent()) {
                return;
            }
            Object obj = optional.get();
            ((ums) ((tzz) qatVar.a).a.a()).s((trl) obj);
        }
    }

    @Override // defpackage.trk
    public final void j() {
        n();
        ((tnq) this.f.a()).h();
        m();
        m().m();
        m();
        n();
    }

    @Override // defpackage.trk
    public final void k() {
        n();
        ((tnq) this.f.a()).i();
        m();
        n();
    }

    @Override // defpackage.trk
    public final boolean l() {
        return ((gjv) this.m.a()).r();
    }

    @Override // defpackage.trk
    @Deprecated
    public final uaj m() {
        return (uaj) this.b.a();
    }

    @Override // defpackage.trk
    public final void n() {
    }

    @Override // defpackage.trk
    public final rjg o() {
        return (rjg) this.i.a();
    }

    @Override // defpackage.umw
    public final void p() {
        ((uaj) this.b.a()).m();
    }
}
