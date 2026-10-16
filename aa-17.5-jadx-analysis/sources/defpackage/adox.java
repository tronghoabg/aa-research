package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class adox extends adoz implements adkm {
    public final List a;
    private final adqn b;

    public adox(adwt adwtVar, adis adisVar, List list) {
        super(adwtVar, adisVar, adkn.a(adox.class, "from ".concat(String.valueOf(String.valueOf(adisVar.a(adkd.a))))));
        this.b = new adqn();
        this.a = list;
    }

    final synchronized adnq a(adzj adzjVar, String str, admc admcVar) {
        adjj adjjVar;
        if (z()) {
            return adnq.m.e("transport is shutdown");
        }
        adqn adqnVar = this.b;
        boolean z = true;
        woy.aa(adqnVar.a != null, "Not yet set!");
        adzl adzlVar = ((adon) adqnVar.a).a;
        int i = aeeb.a;
        adzg adzgVar = ((adzf) adzlVar).b;
        Executor adyqVar = adzgVar.e != zfq.a ? new adyq(adzgVar.e) : new adym();
        adlx adlxVar = adue.c;
        if (admcVar.g(adlxVar)) {
            String str2 = (String) admcVar.b(adlxVar);
            if (adzgVar.s.a(str2) == null) {
                adzjVar.i(adzg.c);
                adzjVar.e(adnq.k.e(String.format("Can't find decompressor for %s", str2)), new admc());
            }
            return adnq.b;
        }
        adzv adzvVarB = adzjVar.b();
        adzvVarB.getClass();
        aebg aebgVar = (aebg) adzgVar.f.a.get(str);
        Long l = (Long) admcVar.b(adue.b);
        adjq adjqVar = adzgVar.r;
        adjqVar.getClass();
        adqq[] adqqVarArr = adzvVarB.b;
        if (adqqVarArr.length > 0) {
            adqq adqqVar = adqqVarArr[0];
            throw null;
        }
        if (l == null) {
            adjjVar = new adjj(adjqVar);
        } else {
            adjr adjrVarG = adjr.g(l.longValue(), TimeUnit.NANOSECONDS, adzgVar.v);
            ScheduledExecutorService scheduledExecutorService = ((adzf) adzlVar).c.j;
            adjq.m(scheduledExecutorService, "scheduler");
            adjr adjrVarB = adjqVar.b();
            if (adjrVarB != null && adjrVarB.compareTo(adjrVarG) <= 0) {
                z = false;
                adjrVarG = adjrVarB;
            }
            adjj adjjVar2 = new adjj(adjqVar, adjrVarG);
            if (z) {
                if (adjrVarG.f()) {
                    adjjVar2.j(new TimeoutException("context timed out"));
                } else {
                    synchronized (adjjVar2) {
                        aabr aabrVar = new aabr(adjjVar2, 13);
                        scheduledExecutorService.getClass();
                        adjjVar2.b = scheduledExecutorService.schedule(aabrVar, adjrVarG.a - System.nanoTime(), TimeUnit.NANOSECONDS);
                    }
                }
            }
            adjjVar = adjjVar2;
        }
        adyy adyyVar = new adyy(adyqVar, adzgVar.e, adzjVar, adjjVar);
        adzjVar.i(adyyVar);
        zhc zhcVar = new zhc();
        adjj adjjVar3 = adjjVar;
        adyqVar.execute(new adze((adzf) adzlVar, adjjVar3, aebgVar, str, adzjVar, adyyVar, zhcVar, adzvVarB, admcVar));
        adyqVar.execute(new adzd(adjjVar3, zhcVar, admcVar, adzjVar, adyyVar));
        return adnq.b;
    }

    public final synchronized void c() {
        w(adnq.b, false);
    }

    public final synchronized void d(adnq adnqVar) {
        w(adnqVar, true);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    public final synchronized void f(adzl adzlVar) {
        adqn adqnVar = this.b;
        woy.aa(adqnVar.a == null, "Already set!");
        adqnVar.a = adzlVar;
        ?? r1 = adqnVar.b;
        if (r1 != 0) {
            for (adqq adqqVar : r1) {
                adzlVar.a();
            }
            adqnVar.b = null;
        }
        if (!z()) {
            adqb adqbVar = this.p;
            adqbVar.getClass();
            u(adqbVar);
            if (!z()) {
                B(3);
                adis adisVar = this.n;
                adzl adzlVar2 = ((adon) adzlVar).a;
                ((adzf) adzlVar2).a.cancel(false);
                ((adzf) adzlVar2).a = null;
                Iterator it = ((adzf) adzlVar2).b.g.iterator();
                if (it.hasNext()) {
                    throw null;
                }
                this.n = adisVar;
            }
        }
    }

    @Override // defpackage.adoz
    protected final adpl ho(int i) {
        return new adpi(this, this.n, i);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [adzl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.adoz
    public final void k() {
        adqq adqqVar = new adqq();
        adqn adqnVar = this.b;
        ?? r1 = adqnVar.a;
        if (r1 != 0) {
            r1.a();
            return;
        }
        if (adqnVar.b == null) {
            adqnVar.b = new ArrayList();
        }
        adqnVar.b.add(adqqVar);
    }

    @Override // defpackage.adoz
    public final void j(adnq adnqVar) {
    }
}
