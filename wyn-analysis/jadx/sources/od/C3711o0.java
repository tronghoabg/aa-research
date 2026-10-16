package od;

import A7.C0237b0;
import E5.C0441b;
import Va.X7;
import ba.C1521a;
import g5.RunnableC2707d;
import j$.util.DesugarCollections;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import md.AbstractC3537e;
import md.C3531C;
import md.C3534b;
import md.C3546n;
import md.C3552u;
import md.C3557z;
import md.EnumC3545m;

/* renamed from: od.o0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3711o0 implements md.E {

    /* renamed from: a, reason: collision with root package name */
    public final md.F f42026a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42027b;

    /* renamed from: c, reason: collision with root package name */
    public final Y1 f42028c;

    /* renamed from: d, reason: collision with root package name */
    public final a2 f42029d;

    /* renamed from: e, reason: collision with root package name */
    public final C3695j f42030e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f42031f;

    /* renamed from: g, reason: collision with root package name */
    public final C3531C f42032g;

    /* renamed from: h, reason: collision with root package name */
    public final X7 f42033h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC3537e f42034i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f42035j;
    public final md.n0 k;

    /* renamed from: l, reason: collision with root package name */
    public final C3702l0 f42036l;

    /* renamed from: m, reason: collision with root package name */
    public volatile List f42037m;

    /* renamed from: n, reason: collision with root package name */
    public Q f42038n;

    /* renamed from: o, reason: collision with root package name */
    public final j.E f42039o;

    /* renamed from: p, reason: collision with root package name */
    public C1521a f42040p;

    /* renamed from: q, reason: collision with root package name */
    public C1521a f42041q;

    /* renamed from: r, reason: collision with root package name */
    public U0 f42042r;

    /* renamed from: u, reason: collision with root package name */
    public C3699k0 f42045u;

    /* renamed from: v, reason: collision with root package name */
    public volatile C3699k0 f42046v;

    /* renamed from: x, reason: collision with root package name */
    public md.k0 f42048x;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f42043s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final C3687g0 f42044t = new C3687g0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public volatile C3546n f42047w = C3546n.a(EnumC3545m.f40695d);

    public C3711o0(List list, String str, Y1 y12, C3695j c3695j, ScheduledExecutorService scheduledExecutorService, Y y10, md.n0 n0Var, a2 a2Var, C3531C c3531c, X7 x72, C3704m c3704m, md.F f10, AbstractC3537e abstractC3537e, ArrayList arrayList) {
        Fe.e.t(list, "addressGroups");
        Fe.e.p("addressGroups is empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fe.e.t(it.next(), "addressGroups contains null entry");
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.f42037m = listUnmodifiableList;
        C3702l0 c3702l0 = new C3702l0();
        c3702l0.f42004a = listUnmodifiableList;
        this.f42036l = c3702l0;
        this.f42027b = str;
        this.f42028c = y12;
        this.f42030e = c3695j;
        this.f42031f = scheduledExecutorService;
        y10.getClass();
        this.f42039o = new j.E(1);
        this.k = n0Var;
        this.f42029d = a2Var;
        this.f42032g = c3531c;
        this.f42033h = x72;
        Fe.e.t(c3704m, "channelTracer");
        Fe.e.t(f10, "logId");
        this.f42026a = f10;
        Fe.e.t(abstractC3537e, "channelLogger");
        this.f42034i = abstractC3537e;
        this.f42035j = arrayList;
    }

    public static void g(C3711o0 c3711o0, EnumC3545m enumC3545m) {
        c3711o0.k.e();
        c3711o0.i(C3546n.a(enumC3545m));
    }

    public static void h(C3711o0 c3711o0) {
        SocketAddress socketAddress;
        C3557z c3557z;
        md.n0 n0Var = c3711o0.k;
        n0Var.e();
        Fe.e.w("Should have no reconnectTask scheduled", c3711o0.f42040p == null);
        C3702l0 c3702l0 = c3711o0.f42036l;
        if (c3702l0.f42005b == 0 && c3702l0.f42006c == 0) {
            j.E e7 = c3711o0.f42039o;
            e7.f38375b = false;
            e7.b();
        }
        SocketAddress socketAddress2 = (SocketAddress) ((C3552u) c3702l0.f42004a.get(c3702l0.f42005b)).f40728a.get(c3702l0.f42006c);
        if (socketAddress2 instanceof C3557z) {
            c3557z = (C3557z) socketAddress2;
            socketAddress = c3557z.f40733b;
        } else {
            socketAddress = socketAddress2;
            c3557z = null;
        }
        C3534b c3534b = ((C3552u) c3702l0.f42004a.get(c3702l0.f42005b)).f40729b;
        String str = (String) c3534b.f40613a.get(C3552u.f40727d);
        C3730v c3730v = new C3730v();
        c3730v.f42108a = "unknown-authority";
        c3730v.f42109b = C3534b.f40612b;
        if (str == null) {
            str = c3711o0.f42027b;
        }
        Fe.e.t(str, "authority");
        c3730v.f42108a = str;
        c3730v.f42109b = c3534b;
        c3730v.f42110c = c3557z;
        C3708n0 c3708n0 = new C3708n0();
        c3708n0.f42019d = c3711o0.f42026a;
        C3695j c3695j = c3711o0.f42030e;
        pd.g gVar = c3695j.f41993a;
        if (gVar.f43501n) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        C3677d c3677d = gVar.f43498j;
        long j8 = c3677d.f41934b.get();
        pd.m mVar = new pd.m(gVar, (InetSocketAddress) socketAddress, c3730v.f42108a, c3730v.f42109b, c3730v.f42110c, new RunnableC2707d(new A2.d(c3677d, j8, 11), 18));
        if (gVar.f43497i) {
            mVar.f43548G = true;
            mVar.f43549H = j8;
            mVar.f43550I = gVar.k;
        }
        C3699k0 c3699k0 = new C3699k0(new C3692i(c3695j, mVar, c3730v.f42108a), c3711o0.f42033h);
        c3708n0.f42019d = c3699k0.f();
        c3711o0.f42045u = c3699k0;
        c3711o0.f42043s.add(c3699k0);
        Runnable runnableE = c3699k0.e(new C0441b(c3711o0, c3699k0));
        if (runnableE != null) {
            n0Var.c(runnableE);
        }
        c3711o0.f42034i.h(2, "Started transport {0}", c3708n0.f42019d);
    }

    public static String j(md.k0 k0Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k0Var.f40685a);
        String str = k0Var.f40686b;
        if (str != null) {
            N0.a.r(sb2, "(", str, ")");
        }
        Throwable th = k0Var.f40687c;
        if (th != null) {
            sb2.append("[");
            sb2.append(th);
            sb2.append("]");
        }
        return sb2.toString();
    }

    @Override // md.E
    public final md.F f() {
        return this.f42026a;
    }

    public final void i(C3546n c3546n) {
        this.k.e();
        if (this.f42047w.f40701a != c3546n.f40701a) {
            Fe.e.w("Cannot transition out of SHUTDOWN to " + c3546n, this.f42047w.f40701a != EnumC3545m.f40696e);
            this.f42047w = c3546n;
            ((md.N) this.f42029d.f41914b).a(c3546n);
        }
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.e(this.f42026a.f40575c, "logId");
        c0237b0S.f(this.f42037m, "addressGroups");
        return c0237b0S.toString();
    }
}
