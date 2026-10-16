package defpackage;

import android.os.SystemClock;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class uck implements ucf, uct {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/label/LabelControllerImpl");
    private final pkx A;
    private final aezk B;
    private final zgs C;
    private final Executor D;
    private final ucc E;
    private final vaa F;
    private final tzt G;
    private final uaj H;
    private final qsb I;
    private rjs J;
    private final qsb K;
    public final Object b = new Object();
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final uci e;
    public final uci f;
    public final plf g;
    public final ArrayList h;
    public volatile boolean i;
    public boolean j;
    public final AtomicReference k;
    public final ucg l;
    public final ufe m;
    public final List n;
    public final List o;
    ttn p;
    ttn q;
    public final tra r;
    public final rfe s;
    private final ucy t;
    private final AtomicBoolean u;
    private final ucm v;
    private final vaa w;
    private final vaa x;
    private final vaa y;
    private boolean z;

    public uck(tzt tztVar, qsb qsbVar, qsb qsbVar2, ucm ucmVar, pkx pkxVar, erb erbVar, aezk aezkVar, zgs zgsVar, Executor executor, ufe ufeVar, aezk aezkVar2, rjr rjrVar, boolean z, uaj uajVar, tmb tmbVar) {
        erb erbVar2;
        tmb tmbVar2;
        uci uciVar = new uci();
        this.e = uciVar;
        uci uciVar2 = new uci();
        this.f = uciVar2;
        this.s = new rfe(null, null);
        this.g = new uch();
        this.h = new ArrayList();
        boolean z2 = true;
        this.i = true;
        this.u = new AtomicBoolean(false);
        this.k = new AtomicReference(null);
        this.w = new vaa(false);
        vaa vaaVar = new vaa(false);
        this.x = vaaVar;
        this.y = new vaa(false);
        this.z = false;
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.G = tztVar;
        this.I = qsbVar;
        this.K = qsbVar2;
        this.v = ucmVar;
        this.A = pkxVar;
        this.B = aezkVar;
        this.r = (tra) aezkVar.a();
        this.C = zgsVar;
        this.D = executor;
        this.m = ufeVar;
        this.E = new ucc(ufeVar, aezkVar, aezkVar2);
        this.F = new vaa(tqh.a);
        if (uajVar == null || !uajVar.b()) {
            erbVar2 = erbVar;
            tmbVar2 = tmbVar;
            z2 = false;
        } else {
            erbVar2 = erbVar;
            tmbVar2 = tmbVar;
        }
        this.t = new ucy(z2, erbVar2, tmbVar2);
        this.l = new ucg(vaaVar);
        this.H = uajVar;
        uciVar2.g = z ? ujk.b : ujk.a;
        uciVar.g = z ? ujk.b : ujk.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.lang.Runnable] */
    private final void I() {
        rjs rjsVar = this.J;
        if (rjsVar == null || !this.z) {
            return;
        }
        aezk aezkVar = this.B;
        ucp ucpVar = new ucp((uvg) rjsVar.a, aezkVar);
        rjs rjsVar2 = this.J;
        Object obj = rjsVar2.b;
        Object obj2 = rjsVar2.a;
        qsb qsbVar = this.I;
        qsb qsbVar2 = this.K;
        ucy ucyVar = this.t;
        aezkVar.a();
        usy usyVar = (usy) obj;
        udd uddVar = new udd(usyVar, (uvg) obj2, qsbVar, qsbVar2, ucyVar, this.w, this.y, this, null);
        rjs rjsVar3 = this.J;
        if (rjsVar3 != null) {
            ((uvg) rjsVar3.a).H = uddVar;
        }
        ucm ucmVar = this.v;
        tzt tztVar = this.G;
        pkx pkxVar = this.A;
        uce uceVar = new uce(pkxVar);
        uen uenVar = new uen(pkxVar);
        ucc uccVar = this.E;
        vaa vaaVar = this.F;
        uci uciVar = this.e;
        udq udqVar = new udq(uddVar, ucpVar, ucmVar, tztVar, uceVar, uenVar, qsbVar, ucyVar, aezkVar, uccVar, vaaVar, uciVar.g, this.H);
        udd uddVar2 = udqVar.k;
        uddVar2.b = false;
        uddVar2.c = false;
        ucj ucjVar = new ucj(this, udqVar, this.C, this.D);
        usy usyVar2 = (usy) rjsVar.b;
        uciVar.a = usyVar2.o();
        uciVar.c = usyVar2.k();
        uciVar.d = usyVar2.j();
        uciVar.e = usyVar2.f();
        qsb qsbVar3 = new qsb(new usy(usyVar2), udqVar, ucjVar, new ueh(this, 1));
        this.k.set(qsbVar3);
        ((uvg) this.J.a).e(qsbVar3.d);
        ?? r0 = qsbVar3.a;
        ucj ucjVar2 = (ucj) r0;
        ucjVar2.e.r(ucjVar2.d.submit(r0));
        ucjVar2.a = true;
        v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, uda] */
    private final void J(boolean z) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        qsb qsbVar = (qsb) this.k.get();
        if (qsbVar != null) {
            tvv tvvVar = new tvv(countDownLatch, 20);
            zgs zgsVar = this.C;
            ucj ucjVar = (ucj) qsbVar.a;
            if (ucjVar.a) {
                ucjVar.e.c(tvvVar, zgsVar);
            } else {
                zgsVar.execute(tvvVar);
            }
            ucjVar.b();
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            qsbVar = null;
        }
        synchronized (this) {
            if (z) {
                synchronized (this.b) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.c.iterator();
                    while (it.hasNext()) {
                        ajnt ajntVar = (ajnt) it.next();
                        if (ajntVar.b.d()) {
                            ajntVar.f();
                            this.g.g(ajntVar);
                        } else {
                            arrayList.add(ajntVar);
                        }
                    }
                    this.c = arrayList;
                }
                int i = yfq.d;
                yfl yflVar = new yfl(4);
                ArrayList arrayList2 = this.h;
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    uda udaVar = (uda) arrayList2.get(i2);
                    if (udaVar.d()) {
                        ((uda) arrayList2.get(i2)).c(this);
                        yflVar.i(udaVar);
                    }
                }
                arrayList2.removeAll(yflVar.g());
            } else {
                ArrayList arrayList3 = this.h;
                int size2 = arrayList3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((uda) arrayList3.get(i3)).c(this);
                }
                arrayList3.clear();
            }
            this.j = true;
            if (qsbVar != null) {
                rjs rjsVar = this.J;
                if (rjsVar != null) {
                    ((uvg) rjsVar.a).j(qsbVar.d);
                }
                Object obj = qsbVar.c;
                ((udq) obj).f.g(0);
                ((udq) obj).l.b();
                ((udq) obj).k.d();
                ((udq) obj).c.b();
                ((udq) obj).w.c();
                this.t.d();
                this.k.set(null);
            }
            this.z = false;
        }
        if (z) {
            return;
        }
        this.C.shutdown();
    }

    @Override // defpackage.ucf
    public final void A(ufs ufsVar) {
        List list = this.n;
        synchronized (list) {
            if (!list.contains(ufsVar)) {
                list.add(ufsVar);
            }
        }
    }

    @Override // defpackage.ucf
    public final void B(ufs ufsVar) {
        List list = this.n;
        synchronized (list) {
            list.remove(ufsVar);
        }
    }

    @Override // defpackage.ucf
    public final void C(uqm uqmVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ucf
    public final void D() {
        if (!this.i) {
            this.i = true;
            v();
        }
    }

    @Override // defpackage.ucf
    public final synchronized void E(uvg uvgVar, usy usyVar) {
        xul xulVarO = ysi.o();
        try {
            if (this.J == null) {
                this.J = new rjs(uvgVar, usyVar);
                I();
            }
            xulVarO.close();
        } finally {
        }
    }

    @Override // defpackage.ucf
    public final void F() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ucf
    public final zdh G(uda udaVar, rfe rfeVar) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uct
    public final void H(ygr ygrVar) {
        yfq yfqVarO;
        List list = this.n;
        synchronized (list) {
            yfqVarO = yfq.o(list);
        }
        int size = yfqVarO.size();
        for (int i = 0; i < size; i++) {
            ((ufs) yfqVarO.get(i)).z(ygrVar);
        }
    }

    @Override // defpackage.upw
    public final void a(upy upyVar) {
        if (!upyVar.l() || upyVar.c() == null) {
            return;
        }
        v();
    }

    @Override // defpackage.ucf
    public final synchronized ueu c() {
        return this.e.f;
    }

    @Override // defpackage.ucf
    public final uzy d() {
        return this.F.a;
    }

    @Override // defpackage.ucf
    public final void e(tqg tqgVar) {
        List list = this.o;
        synchronized (list) {
            if (!list.contains(tqgVar)) {
                list.add(tqgVar);
            }
        }
    }

    @Override // defpackage.ucf
    public final void f(trz trzVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ucf
    public final synchronized void g(tqj tqjVar) {
        this.t.c(tqjVar);
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        printWriter.println(str.concat("LabelerControllerImpl:"));
        qsb qsbVar = (qsb) this.k.get();
        if (qsbVar != null) {
            String strConcat = " ".concat(str);
            printWriter.println(strConcat.concat(" ManagedThreadCommunicationLabeler:"));
            udq udqVar = (udq) qsbVar.c;
            udm udmVar = (udm) udqVar.s.get();
            if (udmVar != null) {
                long j = udmVar.h;
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                String strConcat2 = strConcat.concat(" ");
                printWriter.println(strConcat2.concat(" total/callout/placeable/added/removed/updated"));
                printWriter.println(strConcat2 + " " + udmVar.a + " / " + udmVar.b + " / " + udmVar.f + " / " + udmVar.c + " / " + udmVar.e + " / " + udmVar.d);
                printWriter.println(strConcat2.concat(" last pass duration/time since"));
                StringBuilder sb = new StringBuilder();
                sb.append(strConcat2);
                sb.append(" ");
                sb.append(j - udmVar.g);
                sb.append(" / ");
                sb.append(jElapsedRealtime);
                printWriter.println(sb.toString());
                ucc uccVar = udqVar.b;
                String strConcat3 = strConcat2.concat(" ");
                printWriter.println(strConcat3.concat("LabelAnnotationApplier"));
                String strConcat4 = strConcat3.concat("  ");
                printWriter.printf("%sAnnotatedLabelsCache\n", strConcat4);
                uav uavVar = uccVar.a;
                printWriter.printf("%s  cache size=%d\n", strConcat4, Integer.valueOf(uavVar.a.h));
                printWriter.printf("%s  hits=%d wrongAnnotations=%d notPresent=%d rate=%.1f%%\n", strConcat4, Integer.valueOf(uavVar.c), Integer.valueOf(uavVar.d), Integer.valueOf(uavVar.e), Float.valueOf((uavVar.c * 100.0f) / ((r6 + uavVar.d) + uavVar.e)));
                printWriter.printf("%s  total passes=%d\n", strConcat4, Integer.valueOf(uavVar.b));
                printWriter.printf("%s  last pass: retained=%d evicted=%d\n", strConcat4, Integer.valueOf(uavVar.f), Integer.valueOf(uavVar.g));
            }
        }
    }

    @Override // defpackage.ucf
    public final void h(uda udaVar) {
        synchronized (this.b) {
            ArrayList arrayList = this.c;
            ajnt ajntVar = (ajnt) this.g.b();
            ajntVar.g(udaVar, 1);
            arrayList.add(ajntVar);
        }
        v();
    }

    @Override // defpackage.ucf
    public final void i(abcw abcwVar, trt trtVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ucf
    public final synchronized void j() {
        this.e.h = true;
    }

    @Override // defpackage.ucf
    public final void k() throws InterruptedException {
        J(false);
    }

    @Override // defpackage.ucf
    public final void l() throws InterruptedException {
        vaq.d();
        J(true);
        synchronized (this) {
            this.z = true;
            I();
        }
    }

    @Override // defpackage.ucf
    public final void m(uda udaVar) {
        synchronized (this.b) {
            ArrayList arrayList = this.c;
            ajnt ajntVar = (ajnt) this.g.b();
            ajntVar.g(udaVar, 3);
            arrayList.add(ajntVar);
        }
        v();
    }

    @Override // defpackage.ucf
    public final void o(Runnable runnable, Executor executor) {
        boolean z;
        ucg ucgVar = this.l;
        synchronized (ucgVar) {
            z = false;
            if (ucgVar.a) {
                ucgVar.e.add(new rjs(runnable, executor));
            } else if (ucgVar.c) {
                ucgVar.d.add(new rjs(runnable, executor));
            } else {
                z = true;
            }
        }
        if (z) {
            runnable.run();
        }
    }

    @Override // defpackage.ucf
    public final void p(tqg tqgVar) {
        List list = this.o;
        synchronized (list) {
            list.remove(tqgVar);
        }
    }

    @Override // defpackage.ucf
    public final void q(trz trzVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ucf
    public final void r(uda udaVar) {
        synchronized (this.b) {
            ArrayList arrayList = this.c;
            ajnt ajntVar = (ajnt) this.g.b();
            ajntVar.g(udaVar, 2);
            arrayList.add(ajntVar);
        }
        v();
    }

    @Override // defpackage.ucf
    public final void s(trt trtVar) {
        throw new UnsupportedOperationException();
    }

    public final synchronized void t() {
        rjs rjsVar = this.J;
        if (rjsVar != null) {
            uci uciVar = this.e;
            Object obj = rjsVar.b;
            uciVar.c = ((usy) obj).k();
            uciVar.d = ((usy) obj).j();
            uciVar.e = ((usy) obj).f();
            uciVar.b = ((usy) obj).d;
            if (this.i) {
                ttn ttnVarO = ((usy) obj).o();
                if (ttnVarO.equals(this.q)) {
                    this.q.equals(this.p);
                }
                if (qrv.E(ttnVarO, uciVar.a, uciVar.d, uciVar.e)) {
                    uciVar.a = ttnVarO;
                    v();
                }
                this.p = this.q;
                this.q = ttnVarO;
            }
        }
    }

    @Override // defpackage.ucf
    public final void u(uda udaVar, uda udaVar2) {
        synchronized (this.b) {
            ArrayList arrayList = this.c;
            plf plfVar = this.g;
            ajnt ajntVar = (ajnt) plfVar.b();
            ajntVar.g(udaVar, 2);
            arrayList.add(ajntVar);
            ArrayList arrayList2 = this.c;
            ajnt ajntVar2 = (ajnt) plfVar.b();
            ajntVar2.g(udaVar2, 1);
            arrayList2.add(ajntVar2);
        }
        v();
    }

    @Override // defpackage.ucf
    public final void v() {
        if (this.u.get()) {
            return;
        }
        this.l.a();
        qsb qsbVar = (qsb) this.k.get();
        if (qsbVar != null) {
            ucj ucjVar = (ucj) qsbVar.a;
            if (ucjVar.e.isDone()) {
                return;
            }
            ucjVar.a();
        }
    }

    @Override // defpackage.ucf
    public final void w(Runnable runnable) {
        runnable.run();
    }

    @Override // defpackage.ucf
    public final synchronized void x(ueu ueuVar) {
        uci uciVar = this.e;
        if (uciVar.f != ueuVar) {
            uciVar.f = ueuVar;
            v();
        }
    }

    @Override // defpackage.ucf
    public final synchronized void y(ujk ujkVar) {
        uci uciVar = this.e;
        if (uciVar.g != ujkVar) {
            uciVar.g = ujkVar;
            v();
        }
    }

    @Override // defpackage.ucf
    public final boolean z() {
        if (!this.i || this.u.get()) {
            return true;
        }
        synchronized (this) {
            if (this.J != null && this.z) {
                qsb qsbVar = (qsb) this.k.get();
                qsbVar.getClass();
                if (((udq) qsbVar.c).k.k()) {
                    return this.l.c();
                }
                return false;
            }
            return false;
        }
    }

    @Override // defpackage.ucf
    public final void n() {
    }
}
