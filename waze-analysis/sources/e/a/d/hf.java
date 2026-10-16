package e.a.d;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hf extends e.a.bt {

    /* renamed from: f, reason: collision with root package name */
    static final boolean f47080f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f47081g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static final Logger f47082h = Logger.getLogger(hf.class.getName());

    /* renamed from: i, reason: collision with root package name */
    private final boolean f47083i;

    /* renamed from: j, reason: collision with root package name */
    private final e.a.bl f47084j;

    /* renamed from: k, reason: collision with root package name */
    private final Map f47085k;

    /* renamed from: l, reason: collision with root package name */
    private final gz f47086l;
    private int m;
    private boolean n;
    private e.a.ek o;
    private e.a.w p;
    private e.a.w q;
    private boolean r;
    private e.a.ek s;
    private final boolean t;
    private cq u;

    static {
        e.a.ch chVar = dh.f46791a;
        f47080f = e.a.dt.j("GRPC_EXPERIMENTAL_PF_WEIGHTED_SHUFFLING", true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    hf(e.a.bl r6) {
        /*
            r5 = this;
            r5.<init>()
            boolean r0 = m()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L19
            int r0 = e.a.d.hl.f47098b
            e.a.ch r0 = e.a.d.dh.f46791a
            java.lang.String r0 = "GRPC_PF_USE_HAPPY_EYEBALLS"
            boolean r0 = e.a.dt.j(r0, r2)
            if (r0 == 0) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            r5.f47083i = r0
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r5.f47085k = r3
            e.a.d.gz r3 = new e.a.d.gz
            com.google.d.d.bn r4 = com.google.d.d.bn.p()
            r3.<init>(r4, r0)
            r5.f47086l = r3
            r5.m = r2
            r5.n = r1
            r0 = 0
            r5.o = r0
            e.a.w r2 = e.a.w.f47854d
            r5.p = r2
            r5.q = r2
            r5.r = r1
            r5.s = r0
            boolean r0 = m()
            r5.t = r0
            r0 = r6
            e.a.bl r0 = (e.a.bl) r0
            r5.f47084j = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.d.hf.<init>(e.a.bl):void");
    }

    static List g(List list, Random random) {
        if (!f47080f) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, random);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e.a.ai aiVar = (e.a.ai) it.next();
            Long l2 = (Long) aiVar.a().c(e.a.ax.f46296a);
            if (l2 == null) {
                l2 = 1L;
            }
            arrayList2.add(new he(aiVar, Math.pow(random.nextDouble(), 1.0d / l2.longValue())));
        }
        Collections.sort(arrayList2, Collections.reverseOrder());
        return com.google.d.d.fo.G(arrayList2, new gu());
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void j(e.a.d.hf r7, e.a.d.hd r8, e.a.x r9) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.d.hf.j(e.a.d.hf, e.a.d.hd, e.a.x):void");
    }

    static boolean m() {
        e.a.ch chVar = dh.f46791a;
        return e.a.dt.j("GRPC_SERIALIZE_RETRIES", false);
    }

    private final void p() {
        e.a.ek ekVar = this.o;
        if (ekVar != null) {
            ekVar.a();
            this.o = null;
        }
    }

    private final void q() {
        if (this.t && this.s == null) {
            cq cqVar = this.u;
            if (cqVar == null) {
                cqVar = new cq();
                this.u = cqVar;
            }
            long jA = cqVar.a();
            e.a.bl blVar = this.f47084j;
            this.s = blVar.c().a(new gv(this), jA, TimeUnit.NANOSECONDS, blVar.d());
        }
    }

    private final void r() {
        if (this.f47083i) {
            e.a.ek ekVar = this.o;
            if (ekVar == null || !ekVar.b()) {
                e.a.bl blVar = this.f47084j;
                this.o = blVar.c().a(new gw(this), 250L, TimeUnit.MILLISECONDS, blVar.d());
            }
        }
    }

    private final void s(e.a.w wVar, e.a.br brVar) {
        if (wVar == this.q && (wVar == e.a.w.f47854d || wVar == e.a.w.f47851a)) {
            return;
        }
        this.q = wVar;
        this.f47084j.f(wVar, brVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(hd hdVar) {
        e.a.w wVar = hdVar.f47075b;
        e.a.w wVar2 = e.a.w.f47852b;
        if (wVar != wVar2) {
            return;
        }
        if (this.r || hdVar.f47077d.a() == wVar2) {
            s(wVar2, new e.a.bk(e.a.bn.d(hdVar.f47074a)));
            return;
        }
        e.a.w wVarA = hdVar.f47077d.a();
        e.a.w wVar3 = e.a.w.f47853c;
        if (wVarA == wVar3) {
            s(wVar3, new e.a.bk(e.a.bn.b(hdVar.f47077d.d())));
        } else if (this.q != wVar3) {
            s(hdVar.f47077d.a(), new e.a.bk(e.a.bn.c()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean u(com.google.d.d.bn bnVar) {
        Map map = this.f47085k;
        HashSet<SocketAddress> hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        int size = bnVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            hashSet2.addAll(((e.a.ai) bnVar.get(i2)).b());
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((hd) map.remove(socketAddress)).f().c();
            }
        }
        return hashSet.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.net.SocketAddress v(e.a.bq r3) {
        /*
            e.a.d.g r3 = (e.a.d.g) r3
            e.a.d.fp r0 = r3.f46994j
            e.a.el r0 = r0.f46951d
            r0.d()
            boolean r0 = r3.f46991g
            java.lang.String r1 = "not started"
            com.google.d.b.an.v(r0, r1)
            java.util.List r3 = r3.f46989e
            r0 = 0
            if (r3 == 0) goto L1d
            int r1 = r3.size()
            r2 = 1
            if (r1 != r2) goto L1d
            goto L1e
        L1d:
            r2 = r0
        L1e:
            java.lang.String r1 = "%s does not have exactly one group"
            com.google.d.b.an.y(r2, r1, r3)
            java.lang.Object r3 = r3.get(r0)
            e.a.ai r3 = (e.a.ai) r3
            java.util.List r3 = r3.b()
            java.lang.Object r3 = r3.get(r0)
            java.net.SocketAddress r3 = (java.net.SocketAddress) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.d.hf.v(e.a.bq):java.net.SocketAddress");
    }

    @Override // e.a.bt
    public final e.a.ee a(e.a.bp bpVar) {
        ha haVar;
        Boolean bool;
        if (this.p == e.a.w.f47855e) {
            return e.a.ee.f47408h.g("Already shut down");
        }
        Boolean bool2 = (Boolean) bpVar.a().c(f46507e);
        this.r = bool2 == null || !bool2.booleanValue();
        List<e.a.ai> listC = bpVar.c();
        if (listC.isEmpty()) {
            e.a.ee eeVarG = e.a.ee.f47411k.g("NameResolver returned no usable address. addrs=" + String.valueOf(bpVar.c()) + ", attrs=" + bpVar.a().toString());
            b(eeVarG);
            return eeVarG;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (((e.a.ai) it.next()) == null) {
                e.a.ee eeVarG2 = e.a.ee.f47411k.g("NameResolver returned address list with null endpoint. addrs=" + String.valueOf(bpVar.c()) + ", attrs=" + bpVar.a().toString());
                b(eeVarG2);
                return eeVarG2;
            }
        }
        this.n = true;
        HashSet hashSet = new HashSet();
        List arrayList = new ArrayList();
        for (e.a.ai aiVar : listC) {
            ArrayList arrayList2 = new ArrayList();
            for (SocketAddress socketAddress : aiVar.b()) {
                if (hashSet.add(socketAddress)) {
                    arrayList2.add(socketAddress);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new e.a.ai(arrayList2, aiVar.a()));
            }
        }
        if ((bpVar.b() instanceof ha) && (bool = (haVar = (ha) bpVar.b()).f47068a) != null && bool.booleanValue()) {
            Long l2 = haVar.f47069b;
            arrayList = g(arrayList, new Random());
        }
        com.google.d.d.bn bnVarN = com.google.d.d.bn.n(arrayList);
        e.a.w wVar = this.p;
        e.a.w wVar2 = e.a.w.f47852b;
        if (wVar == wVar2 || (wVar == e.a.w.f47851a && (!this.f47083i || this.f47086l.h()))) {
            gz gzVar = this.f47086l;
            SocketAddress socketAddressC = gzVar.c();
            gzVar.f(bnVarN);
            if (gzVar.i(socketAddressC)) {
                ((hd) this.f47085k.get(socketAddressC)).f().e(gzVar.d());
                u(bnVarN);
                return e.a.ee.f47401a;
            }
        } else {
            this.f47086l.f(bnVarN);
        }
        if (u(bnVarN)) {
            e.a.w wVar3 = e.a.w.f47851a;
            this.p = wVar3;
            s(wVar3, new e.a.bk(e.a.bn.c()));
        }
        e.a.w wVar4 = this.p;
        if (wVar4 == wVar2) {
            e.a.w wVar5 = e.a.w.f47854d;
            this.p = wVar5;
            s(wVar5, new hc(this, this));
        } else if (wVar4 == e.a.w.f47851a || wVar4 == e.a.w.f47853c) {
            p();
            c();
        }
        return e.a.ee.f47401a;
    }

    @Override // e.a.bt
    public final void b(e.a.ee eeVar) {
        if (this.p == e.a.w.f47855e) {
            return;
        }
        Map map = this.f47085k;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((hd) it.next()).f().c();
        }
        map.clear();
        this.f47086l.f(com.google.d.d.bn.p());
        e.a.w wVar = e.a.w.f47853c;
        this.p = wVar;
        s(wVar, new e.a.bk(e.a.bn.b(eeVar)));
    }

    @Override // e.a.bt
    public final void c() {
        gz gzVar = this.f47086l;
        if (gzVar.h() && this.p != e.a.w.f47855e && this.s == null) {
            Map map = this.f47085k;
            SocketAddress socketAddressC = gzVar.c();
            hd hdVar = (hd) map.get(socketAddressC);
            if (hdVar == null) {
                e.a.c cVarB = gzVar.b();
                gx gxVar = new gx(this);
                e.a.bl blVar = this.f47084j;
                e.a.bg bgVarB = e.a.bi.b();
                bgVarB.c(com.google.d.d.fo.E(new e.a.ai(socketAddressC, cVarB)));
                bgVarB.b(f46504b, gxVar);
                bgVarB.b(e.a.bt.f46505c, Boolean.valueOf(this.t));
                e.a.bq bqVarB = blVar.b(bgVarB.a());
                final hd hdVar2 = new hd(bqVarB, e.a.w.f47854d);
                gxVar.f47062b = hdVar2;
                map.put(socketAddressC, hdVar2);
                e.a.c cVarA = ((g) bqVarB).f46985a.a();
                if (this.r || cVarA.c(e.a.bt.f46506d) == null) {
                    hdVar2.f47077d = e.a.x.b(e.a.w.f47852b);
                }
                bqVarB.d(new e.a.bs() { // from class: e.a.d.gt
                    @Override // e.a.bs
                    public final void a(e.a.x xVar) {
                        hf.j(this.f47057a, hdVar2, xVar);
                    }
                });
                hdVar = hdVar2;
            }
            int iOrdinal = hdVar.c().ordinal();
            if (iOrdinal == 0) {
                r();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    return;
                }
                hdVar.f47074a.b();
                hd.h(hdVar, e.a.w.f47851a);
                r();
                return;
            }
            if (!this.t) {
                gzVar.g();
                c();
            } else if (!gzVar.h()) {
                q();
            } else {
                hdVar.f47074a.b();
                hd.h(hdVar, e.a.w.f47851a);
            }
        }
    }

    @Override // e.a.bt
    public final void d() {
        Map map = this.f47085k;
        f47082h.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        e.a.w wVar = e.a.w.f47855e;
        this.p = wVar;
        this.q = wVar;
        p();
        e.a.ek ekVar = this.s;
        if (ekVar != null) {
            ekVar.a();
            this.s = null;
        }
        this.u = null;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((hd) it.next()).f().c();
        }
        map.clear();
    }
}
