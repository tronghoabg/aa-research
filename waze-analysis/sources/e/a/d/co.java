package e.a.d;

import androidx.autofill.HintConstants;
import androidx.credentials.provider.CredentialEntry;
import j$.util.DesugarCollections;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
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

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class co extends e.a.dd {

    /* renamed from: b, reason: collision with root package name */
    static final boolean f46747b;

    /* renamed from: c, reason: collision with root package name */
    static final boolean f46748c;

    /* renamed from: d, reason: collision with root package name */
    protected static final boolean f46749d;

    /* renamed from: h, reason: collision with root package name */
    private static final Logger f46750h;

    /* renamed from: i, reason: collision with root package name */
    private static final Set f46751i;

    /* renamed from: j, reason: collision with root package name */
    private static final String f46752j;

    /* renamed from: k, reason: collision with root package name */
    private static final String f46753k;

    /* renamed from: l, reason: collision with root package name */
    private static final String f46754l;
    private static final cn m;
    private static String n;
    private boolean A;
    private e.a.dt B;

    /* renamed from: e, reason: collision with root package name */
    final e.a.dr f46755e;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f46757g;
    private final String q;
    private final String r;
    private final int s;
    private final gr t;
    private final long u;
    private final e.a.el v;
    private final e.a.dc w;
    private final com.google.d.b.ai x;
    private boolean y;
    private Executor z;
    private final Random o = new Random();

    /* renamed from: f, reason: collision with root package name */
    protected volatile cg f46756f = ch.f46737a;
    private final AtomicReference p = new AtomicReference();

    static {
        Logger logger = Logger.getLogger(co.class.getName());
        f46750h = logger;
        f46751i = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", CredentialEntry.TRUE_STRING);
        f46752j = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", CredentialEntry.FALSE_STRING);
        f46753k = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", CredentialEntry.FALSE_STRING);
        f46754l = property3;
        f46747b = Boolean.parseBoolean(property);
        f46748c = Boolean.parseBoolean(property2);
        f46749d = Boolean.parseBoolean(property3);
        cn cnVar = null;
        try {
            try {
                try {
                    cn cnVar2 = (cn) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, co.class.getClassLoader()).asSubclass(cn.class).getConstructor(null).newInstance(null);
                    if (cnVar2.b() != null) {
                        logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", cnVar2.b());
                    } else {
                        cnVar = cnVar2;
                    }
                } catch (Exception e2) {
                    f46750h.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e2);
                }
            } catch (Exception e3) {
                f46750h.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e3);
            }
        } catch (ClassCastException e4) {
            f46750h.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e4);
        } catch (ClassNotFoundException e5) {
            f46750h.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e5);
        }
        m = cnVar;
    }

    protected co(String str, e.a.cx cxVar, jp jpVar, com.google.d.b.ai aiVar, boolean z) throws NumberFormatException {
        long nanos;
        com.google.d.b.an.C(cxVar, "args");
        com.google.d.b.an.C(str, HintConstants.AUTOFILL_HINT_NAME);
        URI uriCreate = URI.create("//".concat(str));
        com.google.d.b.an.q(uriCreate.getHost() != null, "Invalid DNS name: %s", str);
        String authority = uriCreate.getAuthority();
        com.google.d.b.an.D(authority, "nameUri (%s) doesn't have an authority", uriCreate);
        this.q = authority;
        this.r = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.s = cxVar.a();
        } else {
            this.s = uriCreate.getPort();
        }
        this.f46755e = cxVar.d();
        Executor executorG = cxVar.g();
        if (executorG != null) {
            this.t = new jr(executorG, 1);
        } else {
            this.t = jr.c(jpVar);
        }
        if (z) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            nanos = 30000000000L;
        } else {
            String property = System.getProperty("networkaddress.cache.ttl");
            nanos = 30;
            if (property != null) {
                try {
                    nanos = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    f46750h.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            if (nanos > 0) {
                nanos = TimeUnit.SECONDS.toNanos(nanos);
            }
        }
        this.u = nanos;
        this.x = aiVar;
        this.v = cxVar.e();
        this.w = cxVar.c();
    }

    static /* bridge */ /* synthetic */ e.a.ai g(co coVar) {
        e.a.dq dqVarA = coVar.f46755e.a(InetSocketAddress.createUnresolved(coVar.r, coVar.s));
        if (dqVarA != null) {
            return new e.a.ai(dqVarA);
        }
        return null;
    }

    private static String m() {
        String str = n;
        if (str != null) {
            return str;
        }
        try {
            String hostName = InetAddress.getLocalHost().getHostName();
            n = hostName;
            return hostName;
        } catch (UnknownHostException e2) {
            throw new RuntimeException(e2);
        }
    }

    private final void n() {
        if (this.A || this.y) {
            return;
        }
        if (this.f46757g) {
            long j2 = this.u;
            if (j2 != 0 && (j2 <= 0 || this.x.a(TimeUnit.NANOSECONDS) <= j2)) {
                return;
            }
        }
        this.A = true;
        this.z.execute(new cl(this, this.B));
    }

    @Override // e.a.dd
    public final String a() {
        return this.q;
    }

    @Override // e.a.dd
    public final void b() {
        com.google.d.b.an.v(this.B != null, "not started");
        n();
    }

    @Override // e.a.dd
    public final void c() {
        if (this.y) {
            return;
        }
        this.y = true;
        Executor executor = this.z;
        if (executor != null) {
            this.t.b(executor);
            this.z = null;
        }
    }

    @Override // e.a.dd
    public final void d(e.a.dt dtVar) {
        com.google.d.b.an.v(this.B == null, "already started");
        this.z = (Executor) this.t.a();
        this.B = dtVar;
        n();
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[LOOP:2: B:63:0x0155->B:146:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b6 A[Catch: RuntimeException -> 0x0210, TryCatch #2 {RuntimeException -> 0x0210, blocks: (B:66:0x0161, B:67:0x0169, B:69:0x016f, B:70:0x0185, B:72:0x018d, B:74:0x0193, B:75:0x0197, B:77:0x019d, B:81:0x01ae, B:83:0x01b6, B:88:0x01c3, B:91:0x01cf, B:93:0x01d7, B:95:0x01dd, B:96:0x01e1, B:98:0x01e7, B:100:0x01f3, B:105:0x01fd, B:106:0x020f), top: B:129:0x0161 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cf A[Catch: RuntimeException -> 0x0210, TryCatch #2 {RuntimeException -> 0x0210, blocks: (B:66:0x0161, B:67:0x0169, B:69:0x016f, B:70:0x0185, B:72:0x018d, B:74:0x0193, B:75:0x0197, B:77:0x019d, B:81:0x01ae, B:83:0x01b6, B:88:0x01c3, B:91:0x01cf, B:93:0x01d7, B:95:0x01dd, B:96:0x01e1, B:98:0x01e7, B:100:0x01f3, B:105:0x01fd, B:106:0x020f), top: B:129:0x0161 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final e.a.db h() {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.d.co.h():e.a.db");
    }
}
