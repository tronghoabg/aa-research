package od;

import com.unity3d.ads.metadata.MediationMetaData;
import g2.C2690k;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import k8.AbstractC3211t;
import md.AbstractC3537e;
import md.AbstractC3556y;
import md.C3552u;
import ra.C3962a;

/* loaded from: classes5.dex */
public final class O extends AbstractC3556y {

    /* renamed from: s, reason: collision with root package name */
    public static final Logger f41740s;

    /* renamed from: t, reason: collision with root package name */
    public static final Set f41741t;

    /* renamed from: u, reason: collision with root package name */
    public static final boolean f41742u;

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f41743v;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f41744w;

    /* renamed from: x, reason: collision with root package name */
    public static String f41745x;

    /* renamed from: a, reason: collision with root package name */
    public final C3712o1 f41746a;

    /* renamed from: b, reason: collision with root package name */
    public final Random f41747b = new Random();

    /* renamed from: c, reason: collision with root package name */
    public volatile M f41748c = M.f41643a;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f41749d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final String f41750e;

    /* renamed from: f, reason: collision with root package name */
    public final String f41751f;

    /* renamed from: g, reason: collision with root package name */
    public final int f41752g;

    /* renamed from: h, reason: collision with root package name */
    public final Y1 f41753h;

    /* renamed from: i, reason: collision with root package name */
    public final long f41754i;

    /* renamed from: j, reason: collision with root package name */
    public final md.n0 f41755j;
    public final j.E k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f41756l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f41757m;

    /* renamed from: n, reason: collision with root package name */
    public Executor f41758n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f41759o;

    /* renamed from: p, reason: collision with root package name */
    public final C2690k f41760p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f41761q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC3537e f41762r;

    static {
        Logger logger = Logger.getLogger(O.class.getName());
        f41740s = logger;
        f41741t = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f41742u = Boolean.parseBoolean(property);
        f41743v = Boolean.parseBoolean(property2);
        f41744w = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    if (Class.forName("od.p0", true, O.class.getClassLoader()).asSubclass(N.class).getConstructor(new Class[0]).newInstance(new Object[0]) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (Exception e7) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e7);
                }
            } catch (Exception e10) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e10);
            }
        } catch (ClassCastException e11) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e11);
        } catch (ClassNotFoundException e12) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e12);
        }
    }

    public O(String str, Q9.a aVar, Y1 y12, j.E e7, boolean z2) throws NumberFormatException {
        Fe.e.t(aVar, "args");
        this.f41753h = y12;
        Fe.e.t(str, MediationMetaData.KEY_NAME);
        URI uriCreate = URI.create("//".concat(str));
        Fe.e.r(uriCreate.getHost() != null, "Invalid DNS name: %s", str);
        String authority = uriCreate.getAuthority();
        if (authority == null) {
            throw new NullPointerException(Fe.g.E("nameUri (%s) doesn't have an authority", uriCreate));
        }
        this.f41750e = authority;
        this.f41751f = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.f41752g = aVar.f9912b;
        } else {
            this.f41752g = uriCreate.getPort();
        }
        C3712o1 c3712o1 = (C3712o1) aVar.f9913c;
        Fe.e.t(c3712o1, "proxyDetector");
        this.f41746a = c3712o1;
        long nanos = 0;
        if (!z2) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j8 = 30;
            if (property != null) {
                try {
                    j8 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    f41740s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j8 > 0 ? TimeUnit.SECONDS.toNanos(j8) : j8;
        }
        this.f41754i = nanos;
        this.k = e7;
        md.n0 n0Var = (md.n0) aVar.f9914d;
        Fe.e.t(n0Var, "syncContext");
        this.f41755j = n0Var;
        D0 d02 = (D0) aVar.f9918h;
        this.f41758n = d02;
        this.f41759o = d02 == null;
        C2690k c2690k = (C2690k) aVar.f9915e;
        Fe.e.t(c2690k, "serviceConfigParser");
        this.f41760p = c2690k;
    }

    public static Map n(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            U8.v0.p0(f41741t.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List listD = AbstractC3719r0.d("clientLanguage", map);
        if (listD != null && !listD.isEmpty()) {
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double dE = AbstractC3719r0.e("percentage", map);
        if (dE != null) {
            int iIntValue = dE.intValue();
            U8.v0.p0(iIntValue >= 0 && iIntValue <= 100, "Bad percentage: %s", dE);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listD2 = AbstractC3719r0.d("clientHostname", map);
        if (listD2 != null && !listD2.isEmpty()) {
            Iterator it2 = listD2.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map mapG = AbstractC3719r0.g("serviceConfig", map);
        if (mapG != null) {
            return mapG;
        }
        throw new E5.Q(String.format("key '%s' missing in '%s'", map, "serviceConfig"), 12);
    }

    public static ArrayList o() {
        List<String> list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith("grpc_config=")) {
                String strSubstring = str.substring(12);
                Logger logger = AbstractC3717q0.f42075a;
                C3962a c3962a = new C3962a(new StringReader(strSubstring));
                try {
                    Object objA = AbstractC3717q0.a(c3962a);
                    if (!(objA instanceof List)) {
                        throw new ClassCastException("wrong type " + objA);
                    }
                    List list2 = (List) objA;
                    AbstractC3719r0.a(list2);
                    arrayList.addAll(list2);
                } finally {
                    try {
                        c3962a.close();
                    } catch (IOException e7) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e7);
                    }
                }
            } else {
                f41740s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    @Override // md.AbstractC3556y
    public final String f() {
        return this.f41750e;
    }

    @Override // md.AbstractC3556y
    public final void h() {
        Fe.e.w("not started", this.f41762r != null);
        p();
    }

    @Override // md.AbstractC3556y
    public final void j() {
        if (this.f41757m) {
            return;
        }
        this.f41757m = true;
        Executor executor = this.f41758n;
        if (executor == null || !this.f41759o) {
            return;
        }
        V1.b(this.f41753h, executor);
        this.f41758n = null;
    }

    @Override // md.AbstractC3556y
    public final void k(AbstractC3537e abstractC3537e) {
        Fe.e.w("already started", this.f41762r == null);
        if (this.f41759o) {
            this.f41758n = (Executor) V1.a(this.f41753h);
        }
        this.f41762r = abstractC3537e;
        p();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final md.J m() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: od.O.m():md.J");
    }

    public final void p() {
        if (this.f41761q || this.f41757m) {
            return;
        }
        if (this.f41756l) {
            long j8 = this.f41754i;
            if (j8 != 0) {
                if (j8 <= 0) {
                    return;
                }
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                if (this.k.a() <= j8) {
                    return;
                }
            }
        }
        this.f41761q = true;
        this.f41758n.execute(new RunnableC3666A(this, this.f41762r));
    }

    public final List q() {
        try {
            try {
                M m10 = this.f41748c;
                String str = this.f41751f;
                m10.getClass();
                List listUnmodifiableList = DesugarCollections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                Iterator it = listUnmodifiableList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C3552u(new InetSocketAddress((InetAddress) it.next(), this.f41752g)));
                }
                return DesugarCollections.unmodifiableList(arrayList);
            } catch (Exception e7) {
                Object obj = AbstractC3211t.f39322a;
                if (e7 instanceof RuntimeException) {
                    throw ((RuntimeException) e7);
                }
                throw new RuntimeException(e7);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                f41740s.log(Level.FINE, "Address resolution failure", (Throwable) null);
            }
            throw th;
        }
    }
}
