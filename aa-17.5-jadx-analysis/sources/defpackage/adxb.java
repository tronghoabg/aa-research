package defpackage;

import java.net.SocketAddress;
import java.nio.charset.Charset;
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

/* loaded from: classes3.dex */
public final class adxb extends adli {
    public static final Logger f = Logger.getLogger(adxb.class.getName());
    static final boolean g;
    public final boolean h;
    public final adla i;
    public final Map j;
    public final adww k;
    public int l;
    public boolean m;
    public adjh n;
    public adjh o;
    public boolean p;
    public adtp q;
    public aebg r;
    public aebg s;
    private final boolean t;

    static {
        Charset charset = adue.a;
        g = adjw.a("GRPC_EXPERIMENTAL_PF_WEIGHTED_SHUFFLING", true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public adxb(defpackage.adla r6) {
        /*
            r5 = this;
            r5.<init>()
            boolean r0 = j()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L19
            int r0 = defpackage.adxg.b
            java.nio.charset.Charset r0 = defpackage.adue.a
            java.lang.String r0 = "GRPC_PF_USE_HAPPY_EYEBALLS"
            boolean r0 = defpackage.adjw.a(r0, r2)
            if (r0 == 0) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            r5.h = r0
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r5.j = r3
            adww r3 = new adww
            int r4 = defpackage.yfq.d
            yfq r4 = defpackage.yls.a
            r3.<init>(r4, r0)
            r5.k = r3
            r5.l = r2
            r5.m = r1
            r0 = 0
            r5.r = r0
            adjh r2 = defpackage.adjh.d
            r5.n = r2
            r5.o = r2
            r5.p = r1
            r5.s = r0
            boolean r0 = j()
            r5.t = r0
            r5.i = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adxb.<init>(adla):void");
    }

    static List e(List list, Random random) {
        if (!g) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, random);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            adjv adjvVar = (adjv) it.next();
            Long l = (Long) adjvVar.f.a(adkl.a);
            if (l == null) {
                l = 1L;
            }
            arrayList2.add(new adxa(adjvVar, Math.pow(random.nextDouble(), 1.0d / l.longValue())));
        }
        Collections.sort(arrayList2, Collections.reverseOrder());
        return yrm.V(arrayList2, new ykz(12));
    }

    static boolean j() {
        Charset charset = adue.a;
        return adjw.a("GRPC_SERIALIZE_RETRIES", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.net.SocketAddress k(defpackage.adlf r3) {
        /*
            adrl r3 = (defpackage.adrl) r3
            advv r0 = r3.i
            adnw r0 = r0.m
            r0.c()
            boolean r0 = r3.g
            java.lang.String r1 = "not started"
            defpackage.woy.aa(r0, r1)
            java.util.List r3 = r3.e
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
            defpackage.woy.ad(r2, r1, r3)
            java.lang.Object r3 = r3.get(r0)
            adjv r3 = (defpackage.adjv) r3
            java.util.List r3 = r3.e
            java.lang.Object r3 = r3.get(r0)
            java.net.SocketAddress r3 = (java.net.SocketAddress) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adxb.k(adlf):java.net.SocketAddress");
    }

    private final void l() {
        if (this.h) {
            aebg aebgVar = this.r;
            if (aebgVar == null || !aebgVar.i()) {
                adla adlaVar = this.i;
                this.r = adlaVar.c().d(new aduy((Object) this, 13), 250L, TimeUnit.MILLISECONDS, adlaVar.d());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean m(yfq yfqVar) {
        Map map = this.j;
        HashSet<SocketAddress> hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        int size = yfqVar.size();
        for (int i = 0; i < size; i++) {
            hashSet2.addAll(((adjv) yfqVar.get(i)).e);
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((adwz) map.remove(socketAddress)).a.b();
            }
        }
        return hashSet.isEmpty();
    }

    @Override // defpackage.adli
    public final adnq a(adle adleVar) {
        adwx adwxVar;
        Boolean bool;
        if (this.n == adjh.e) {
            return adnq.j.e("Already shut down");
        }
        adis adisVar = adleVar.b;
        Boolean bool2 = (Boolean) adisVar.a(e);
        this.p = bool2 == null || !bool2.booleanValue();
        List<adjv> list = adleVar.a;
        if (list.isEmpty()) {
            adnq adnqVarE = adnq.m.e("NameResolver returned no usable address. addrs=" + String.valueOf(list) + ", attrs=" + adisVar.toString());
            b(adnqVarE);
            return adnqVarE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((adjv) it.next()) == null) {
                adnq adnqVarE2 = adnq.m.e("NameResolver returned address list with null endpoint. addrs=" + String.valueOf(list) + ", attrs=" + adisVar.toString());
                b(adnqVarE2);
                return adnqVarE2;
            }
        }
        this.m = true;
        HashSet hashSet = new HashSet();
        List arrayList = new ArrayList();
        for (adjv adjvVar : list) {
            ArrayList arrayList2 = new ArrayList();
            for (SocketAddress socketAddress : adjvVar.e) {
                if (hashSet.add(socketAddress)) {
                    arrayList2.add(socketAddress);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new adjv(arrayList2, adjvVar.f));
            }
        }
        Object obj = adleVar.c;
        if ((obj instanceof adwx) && (bool = (adwxVar = (adwx) obj).a) != null && bool.booleanValue()) {
            Long l = adwxVar.b;
            arrayList = e(arrayList, new Random());
        }
        yfq yfqVarO = yfq.o(arrayList);
        adjh adjhVar = this.n;
        adjh adjhVar2 = adjh.b;
        if (adjhVar == adjhVar2 || (adjhVar == adjh.a && (!this.h || this.k.f()))) {
            adww adwwVar = this.k;
            SocketAddress socketAddressB = adwwVar.b();
            adwwVar.d(yfqVarO);
            if (adwwVar.g(socketAddressB)) {
                adlf adlfVar = ((adwz) this.j.get(socketAddressB)).a;
                if (!adwwVar.f()) {
                    throw new IllegalStateException("Index is past the end of the address group list");
                }
                aebg aebgVar = (aebg) adwwVar.a.get(adwwVar.b);
                adlfVar.d(Collections.singletonList(new adjv((SocketAddress) aebgVar.b, (adis) aebgVar.a)));
                m(yfqVarO);
                return adnq.b;
            }
        } else {
            this.k.d(yfqVarO);
        }
        if (m(yfqVarO)) {
            adjh adjhVar3 = adjh.a;
            this.n = adjhVar3;
            h(adjhVar3, new adkz(adlc.d("pick_first: address list updated")));
        }
        adjh adjhVar4 = this.n;
        if (adjhVar4 == adjhVar2) {
            adjh adjhVar5 = adjh.d;
            this.n = adjhVar5;
            h(adjhVar5, new adwy(this, this));
        } else if (adjhVar4 == adjh.a || adjhVar4 == adjh.c) {
            f();
            c();
        }
        return adnq.b;
    }

    @Override // defpackage.adli
    public final void b(adnq adnqVar) {
        if (this.n == adjh.e) {
            return;
        }
        Map map = this.j;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((adwz) it.next()).a.b();
        }
        map.clear();
        adww adwwVar = this.k;
        int i = yfq.d;
        adwwVar.d(yls.a);
        adjh adjhVar = adjh.c;
        this.n = adjhVar;
        h(adjhVar, new adkz(adlc.b(adnqVar)));
    }

    @Override // defpackage.adli
    public final void c() {
        adww adwwVar = this.k;
        if (adwwVar.f() && this.n != adjh.e && this.s == null) {
            SocketAddress socketAddressB = adwwVar.b();
            Map map = this.j;
            adwz adwzVar = (adwz) map.get(socketAddressB);
            if (adwzVar == null) {
                if (!adwwVar.f()) {
                    throw new IllegalStateException("Index is off the end of the address group list");
                }
                Object obj = ((aebg) adwwVar.a.get(adwwVar.b)).a;
                adwv adwvVar = new adwv(this);
                adla adlaVar = this.i;
                adkv adkvVar = new adkv();
                int i = 1;
                adkvVar.c(yrm.R(new adjv(socketAddressB, (adis) obj)));
                adkvVar.b(b, adwvVar);
                adkvVar.b(adli.c, Boolean.valueOf(this.t));
                adlf adlfVarB = adlaVar.b(adkvVar.a());
                adwz adwzVar2 = new adwz(adlfVarB, adjh.d);
                adwvVar.a = adwzVar2;
                map.put(socketAddressB, adwzVar2);
                adkx adkxVar = ((adrl) adlfVarB).a;
                if (this.p || adkxVar.b.a(adli.d) == null) {
                    adwzVar2.d = adji.a(adjh.b);
                }
                adlfVarB.c(new adxc(this, adwzVar2, i));
                adwzVar = adwzVar2;
            }
            int iOrdinal = adwzVar.b.ordinal();
            if (iOrdinal == 0) {
                l();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    return;
                }
                adwzVar.a.a();
                adwzVar.b(adjh.a);
                l();
                return;
            }
            if (!this.t) {
                adwwVar.e();
                c();
            } else if (!adwwVar.f()) {
                g();
            } else {
                adwzVar.a.a();
                adwzVar.b(adjh.a);
            }
        }
    }

    @Override // defpackage.adli
    public final void d() {
        Logger logger = f;
        Level level = Level.FINE;
        Map map = this.j;
        logger.logp(level, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        adjh adjhVar = adjh.e;
        this.n = adjhVar;
        this.o = adjhVar;
        f();
        aebg aebgVar = this.s;
        if (aebgVar != null) {
            aebgVar.h();
            this.s = null;
        }
        this.q = null;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((adwz) it.next()).a.b();
        }
        map.clear();
    }

    public final void f() {
        aebg aebgVar = this.r;
        if (aebgVar != null) {
            aebgVar.h();
            this.r = null;
        }
    }

    public final void g() {
        if (this.t && this.s == null) {
            adtp adtpVar = this.q;
            if (adtpVar == null) {
                adtpVar = new adtp();
                this.q = adtpVar;
            }
            long jA = adtpVar.a();
            adla adlaVar = this.i;
            this.s = adlaVar.c().d(new aduy((Object) this, 12), jA, TimeUnit.NANOSECONDS, adlaVar.d());
        }
    }

    public final void h(adjh adjhVar, adlg adlgVar) {
        if (adjhVar == this.o && (adjhVar == adjh.d || adjhVar == adjh.a)) {
            return;
        }
        this.o = adjhVar;
        this.i.f(adjhVar, adlgVar);
    }

    public final void i(adwz adwzVar) {
        adjh adjhVar = adwzVar.b;
        adjh adjhVar2 = adjh.b;
        if (adjhVar != adjhVar2) {
            return;
        }
        if (this.p || adwzVar.a() == adjhVar2) {
            h(adjhVar2, new adkz(adlc.e(adwzVar.a)));
            return;
        }
        adjh adjhVarA = adwzVar.a();
        adjh adjhVar3 = adjh.c;
        if (adjhVarA == adjhVar3) {
            h(adjhVar3, new adkz(adlc.b(adwzVar.d.b)));
        } else if (this.o != adjhVar3) {
            h(adwzVar.a(), new adkz(adlc.d("health check state: ".concat(adwzVar.a().toString()))));
        }
    }
}
