package defpackage;

import j$.util.DesugarCollections;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class adtn extends admr {
    public static final Logger b;
    public static final Set c;
    static final boolean d;
    static final boolean e;
    protected static final boolean f;
    public static final adtm g;
    private static final String s;
    private static final String t;
    private static final String u;
    private static String v;
    private adqs A;
    public final String j;
    public final int k;
    public final long l;
    public final adnw m;
    public final admq n;
    public final xya o;
    public boolean p;
    public boolean q;
    private final String w;
    private final adwt x;
    private boolean y;
    private Executor z;
    public final Random h = new Random();
    protected volatile int r = 1;
    public final AtomicReference i = new AtomicReference();

    static {
        Logger logger = Logger.getLogger(adtn.class.getName());
        b = logger;
        c = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        s = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        t = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        u = property3;
        d = Boolean.parseBoolean(property);
        e = Boolean.parseBoolean(property2);
        f = Boolean.parseBoolean(property3);
        adtm adtmVar = null;
        try {
            try {
                try {
                    adtm adtmVar2 = (adtm) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, adtn.class.getClassLoader()).asSubclass(adtm.class).getConstructor(null).newInstance(null);
                    if (adtmVar2.b() != null) {
                        logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", adtmVar2.b());
                    } else {
                        adtmVar = adtmVar2;
                    }
                } catch (Exception e2) {
                    b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e2);
                }
            } catch (Exception e3) {
                b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e3);
            }
        } catch (ClassCastException e4) {
            b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e4);
        } catch (ClassNotFoundException e5) {
            b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e5);
        }
        g = adtmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected adtn(java.lang.String r10, defpackage.admm r11, defpackage.adzq r12, defpackage.xya r13, boolean r14) throws java.lang.NumberFormatException {
        /*
            r9 = this;
            r9.<init>()
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r9.h = r0
            r0 = 1
            r9.r = r0
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>()
            r9.i = r1
            r11.getClass()
            r10.getClass()
            java.lang.String r1 = "//"
            java.lang.String r1 = r1.concat(r10)
            java.net.URI r1 = java.net.URI.create(r1)
            java.lang.String r2 = r1.getHost()
            r3 = 0
            if (r2 == 0) goto L2d
            r2 = r0
            goto L2e
        L2d:
            r2 = r3
        L2e:
            java.lang.String r4 = "Invalid DNS name: %s"
            defpackage.woy.S(r2, r4, r10)
            java.lang.String r10 = r1.getAuthority()
            r10.getClass()
            r9.w = r10
            java.lang.String r10 = r1.getHost()
            r9.j = r10
            int r10 = r1.getPort()
            r2 = -1
            if (r10 != r2) goto L4e
            int r10 = r11.a
            r9.k = r10
            goto L54
        L4e:
            int r10 = r1.getPort()
            r9.k = r10
        L54:
            java.util.concurrent.Executor r10 = r11.f
            if (r10 == 0) goto L60
            adzs r12 = new adzs
            r12.<init>(r10, r0)
            r9.x = r12
            goto L67
        L60:
            adzs r10 = new adzs
            r10.<init>(r12, r3)
            r9.x = r10
        L67:
            if (r14 == 0) goto L71
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 30000000000(0x6fc23ac00, double:1.4821969375E-313)
            goto La9
        L71:
            java.lang.String r10 = "networkaddress.cache.ttl"
            java.lang.String r12 = java.lang.System.getProperty(r10)
            r1 = 30
            if (r12 == 0) goto L9c
            long r0 = java.lang.Long.parseLong(r12)     // Catch: java.lang.NumberFormatException -> L80
            goto L9d
        L80:
            r14 = r3
            java.util.logging.Logger r3 = defpackage.adtn.b
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            r6 = 3
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r8[r14] = r10
            r8[r0] = r12
            r10 = 2
            r8[r10] = r5
            java.lang.String r6 = "getNetworkAddressCacheTtlNanos"
            java.lang.String r7 = "Property({0}) valid is not valid number format({1}), fall back to default({2})"
            java.lang.String r5 = "io.grpc.internal.DnsNameResolver"
            r3.logp(r4, r5, r6, r7, r8)
        L9c:
            r0 = r1
        L9d:
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 <= 0) goto La9
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r10.toNanos(r0)
        La9:
            r9.l = r0
            r9.o = r13
            adnw r10 = r11.c
            r9.m = r10
            admq r10 = r11.d
            r9.n = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adtn.<init>(java.lang.String, admm, adzq, xya, boolean):void");
    }

    public static String e() {
        String str = v;
        if (str != null) {
            return str;
        }
        try {
            String hostName = InetAddress.getLocalHost().getHostName();
            v = hostName;
            return hostName;
        } catch (UnknownHostException e2) {
            throw new RuntimeException(e2);
        }
    }

    private final void f() {
        if (this.q || this.y) {
            return;
        }
        if (this.p) {
            long j = this.l;
            if (j != 0 && (j <= 0 || this.o.a(TimeUnit.NANOSECONDS) <= j)) {
                return;
            }
        }
        this.q = true;
        this.z.execute(new adtk(this, this.A));
    }

    @Override // defpackage.admr
    public final String a() {
        return this.w;
    }

    @Override // defpackage.admr
    public final void b() {
        woy.aa(this.A != null, "not started");
        f();
    }

    @Override // defpackage.admr
    public final void c() {
        if (this.y) {
            return;
        }
        this.y = true;
        Executor executor = this.z;
        if (executor != null) {
            this.x.b(executor);
            this.z = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.admr
    public final void d(adqs adqsVar) {
        woy.aa(this.A == null, "already started");
        this.z = this.x.a();
        this.A = adqsVar;
        f();
    }
}
