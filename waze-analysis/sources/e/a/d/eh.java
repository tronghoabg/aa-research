package e.a.d;

import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class eh implements e.a.ay {
    private final String A;
    private cq B;

    /* renamed from: a, reason: collision with root package name */
    private final e.a.az f46866a;

    /* renamed from: b, reason: collision with root package name */
    private final String f46867b;

    /* renamed from: c, reason: collision with root package name */
    private final ea f46868c;

    /* renamed from: d, reason: collision with root package name */
    private final am f46869d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f46870e;

    /* renamed from: f, reason: collision with root package name */
    private final e.a.au f46871f;

    /* renamed from: g, reason: collision with root package name */
    private final u f46872g;

    /* renamed from: h, reason: collision with root package name */
    private final e.a.cs f46873h;

    /* renamed from: i, reason: collision with root package name */
    private final e.a.j f46874i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f46875j;

    /* renamed from: k, reason: collision with root package name */
    private final List f46876k;

    /* renamed from: l, reason: collision with root package name */
    private final e.a.el f46877l;
    private final eb m;
    private volatile List n;
    private final com.google.d.b.ai o;
    private e.a.ek p;
    private e.a.ek q;
    private ge r;
    private as u;
    private volatile ge v;
    private e.a.ee x;
    private volatile e.a.c y;
    private final jx z;
    private final Collection s = new ArrayList();
    private final dm t = new dp(this);
    private volatile e.a.x w = e.a.x.b(e.a.w.f47854d);

    eh(e.a.bi biVar, String str, am amVar, ScheduledExecutorService scheduledExecutorService, com.google.d.b.aj ajVar, e.a.el elVar, ea eaVar, e.a.au auVar, u uVar, w wVar, e.a.az azVar, e.a.j jVar, List list, String str2, e.a.cs csVar) {
        List listD = biVar.d();
        com.google.d.b.an.m(!listD.isEmpty(), "addressGroups is empty");
        L(listD, "addressGroups contains null entry");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(listD));
        this.n = listUnmodifiableList;
        this.m = new eb(listUnmodifiableList);
        this.f46867b = str;
        this.f46869d = amVar;
        this.f46870e = scheduledExecutorService;
        this.o = (com.google.d.b.ai) ajVar.get();
        this.f46877l = elVar;
        this.f46873h = csVar;
        this.f46868c = eaVar;
        this.f46871f = auVar;
        this.f46872g = uVar;
        this.f46866a = azVar;
        this.f46874i = jVar;
        this.f46876k = list;
        this.f46875j = ((Boolean) biVar.c(e.a.bt.f46505c)).booleanValue();
        this.A = str2;
        this.z = new jx(csVar);
    }

    static /* bridge */ /* synthetic */ void A(eh ehVar, e.a.w wVar) {
        ehVar.f46877l.d();
        ehVar.M(e.a.x.b(wVar));
    }

    static /* bridge */ /* synthetic */ void D(eh ehVar, e.a.ee eeVar) {
        e.a.el elVar = ehVar.f46877l;
        elVar.d();
        ehVar.M(e.a.x.c(eeVar));
        if (ehVar.f46875j) {
            return;
        }
        cq cqVar = ehVar.B;
        if (cqVar == null) {
            cqVar = new cq();
            ehVar.B = cqVar;
        }
        long jA = cqVar.a() - ehVar.o.a(TimeUnit.NANOSECONDS);
        ehVar.f46874i.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", N(eeVar), Long.valueOf(jA));
        com.google.d.b.an.v(ehVar.p == null, "previous reconnectTask is not done");
        ehVar.p = elVar.a(new dq(ehVar), jA, TimeUnit.NANOSECONDS, ehVar.f46870e);
    }

    static /* bridge */ /* synthetic */ void E(eh ehVar) {
        e.a.aq aqVar;
        e.a.el elVar = ehVar.f46877l;
        elVar.d();
        com.google.d.b.an.v(ehVar.p == null, "Should have no reconnectTask scheduled");
        eb ebVar = ehVar.m;
        if (ebVar.f()) {
            com.google.d.b.ai aiVar = ehVar.o;
            aiVar.d();
            aiVar.e();
        }
        SocketAddress socketAddressB = ebVar.b();
        if (socketAddressB instanceof e.a.aq) {
            e.a.aq aqVar2 = (e.a.aq) socketAddressB;
            aqVar = aqVar2;
            socketAddressB = aqVar2.d();
        } else {
            aqVar = null;
        }
        e.a.c cVarA = ebVar.a();
        String str = (String) cVarA.c(e.a.ai.f46253a);
        al alVar = new al();
        if (str == null) {
            str = ehVar.f46867b;
        }
        alVar.d(str);
        alVar.e(cVarA);
        alVar.g();
        com.google.d.b.an.C(ehVar.f46873h, "metricRecorder");
        alVar.f(aqVar);
        eg egVar = new eg();
        egVar.f46865a = ehVar.f46866a;
        dz dzVar = new dz(ehVar.f46869d.a(socketAddressB, alVar, egVar), ehVar.f46872g);
        egVar.f46865a = dzVar.c();
        ehVar.f46871f.c(dzVar);
        ehVar.u = dzVar;
        ehVar.s.add(dzVar);
        Runnable runnableD = dzVar.d(new ef(ehVar, dzVar));
        if (runnableD != null) {
            elVar.c(runnableD);
        }
        ehVar.f46874i.b(2, "Started transport {0}", egVar.f46865a);
    }

    private static void L(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.d.b.an.C(it.next(), str);
        }
    }

    private final void M(e.a.x xVar) {
        this.f46877l.d();
        if (this.w.a() != xVar.a()) {
            com.google.d.b.an.y(this.w.a() != e.a.w.f47855e, "Cannot transition out of SHUTDOWN to %s", xVar.a());
            if (this.f46875j && xVar.a() == e.a.w.f47853c) {
                this.w = e.a.x.b(e.a.w.f47854d);
            } else {
                this.w = xVar;
            }
            ea eaVar = this.f46868c;
            com.google.d.b.an.v(true, "listener is null");
            eaVar.f46852a.a(xVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String N(e.a.ee eeVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(eeVar.a());
        if (eeVar.i() != null) {
            sb.append("(");
            sb.append(eeVar.i());
            sb.append(")");
        }
        if (eeVar.j() != null) {
            sb.append("[");
            sb.append(eeVar.j());
            sb.append("]");
        }
        return sb.toString();
    }

    static /* bridge */ /* synthetic */ void z(eh ehVar) {
        ehVar.f46877l.d();
        e.a.ek ekVar = ehVar.p;
        if (ekVar != null) {
            ekVar.a();
            ehVar.p = null;
            ehVar.B = null;
        }
    }

    public final void F(e.a.ee eeVar) {
        this.f46877l.execute(new du(this, eeVar));
    }

    public final void G(List list) {
        com.google.d.b.an.C(list, "newAddressGroups");
        L(list, "newAddressGroups contains null entry");
        com.google.d.b.an.m(!list.isEmpty(), "newAddressGroups is empty");
        this.f46877l.execute(new dt(this, DesugarCollections.unmodifiableList(new ArrayList(list))));
    }

    @Override // e.a.be
    public final e.a.az c() {
        return this.f46866a;
    }

    public final aj h() {
        ge geVar = this.v;
        if (geVar != null) {
            return geVar;
        }
        this.f46877l.execute(new dr(this));
        return null;
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.c("logId", this.f46866a.a());
        zVarH.d("addressGroups", this.n);
        return zVarH.toString();
    }
}
