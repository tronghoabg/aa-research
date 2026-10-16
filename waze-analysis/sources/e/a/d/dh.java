package e.a.d;

import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dh {

    /* renamed from: a, reason: collision with root package name */
    public static final e.a.ch f46791a;

    /* renamed from: b, reason: collision with root package name */
    public static final e.a.ch f46792b;

    /* renamed from: c, reason: collision with root package name */
    public static final e.a.ch f46793c;

    /* renamed from: d, reason: collision with root package name */
    public static final e.a.ch f46794d;

    /* renamed from: e, reason: collision with root package name */
    public static final e.a.ch f46795e;

    /* renamed from: f, reason: collision with root package name */
    static final e.a.ch f46796f;

    /* renamed from: g, reason: collision with root package name */
    public static final e.a.ch f46797g;

    /* renamed from: h, reason: collision with root package name */
    public static final e.a.ch f46798h;

    /* renamed from: i, reason: collision with root package name */
    public static final e.a.ch f46799i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f46800j;

    /* renamed from: k, reason: collision with root package name */
    public static final e.a.dr f46801k;

    /* renamed from: l, reason: collision with root package name */
    public static final e.a.g f46802l;
    public static final jp m;
    public static final jp n;
    public static final com.google.d.b.aj o;
    private static final Logger p = Logger.getLogger(dh.class.getName());
    private static final Set q = DesugarCollections.unmodifiableSet(EnumSet.of(e.a.eb.OK, e.a.eb.INVALID_ARGUMENT, e.a.eb.NOT_FOUND, e.a.eb.ALREADY_EXISTS, e.a.eb.FAILED_PRECONDITION, e.a.eb.ABORTED, e.a.eb.OUT_OF_RANGE, e.a.eb.DATA_LOSS));
    private static final e.a.p r;

    static {
        Charset.forName("US-ASCII");
        f46791a = e.a.ch.c("grpc-timeout", new dg());
        f46792b = e.a.ch.c("grpc-encoding", e.a.cm.f46534a);
        f46793c = e.a.bc.b("grpc-accept-encoding", new dj(1));
        f46794d = e.a.ch.c("content-encoding", e.a.cm.f46534a);
        f46795e = e.a.bc.b("accept-encoding", new dj(1));
        f46796f = e.a.ch.c("content-length", e.a.cm.f46534a);
        f46797g = e.a.ch.c("content-type", e.a.cm.f46534a);
        f46798h = e.a.ch.c("te", e.a.cm.f46534a);
        f46799i = e.a.ch.c("user-agent", e.a.cm.f46534a);
        com.google.d.b.ag.b(',');
        com.google.d.b.ag.g();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f46800j = 20000000000L;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        f46801k = new hn();
        f46802l = e.a.g.a("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        r = new dc();
        m = new dd();
        n = new de();
        o = new hm(1);
    }

    private dh() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e.a.ee a(int r3) {
        /*
            r0 = 100
            if (r3 < r0) goto Lb
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 >= r0) goto Lb
            e.a.eb r0 = e.a.eb.INTERNAL
            goto L37
        Lb:
            r0 = 400(0x190, float:5.6E-43)
            if (r3 == r0) goto L35
            r0 = 401(0x191, float:5.62E-43)
            if (r3 == r0) goto L32
            r0 = 403(0x193, float:5.65E-43)
            if (r3 == r0) goto L2f
            r0 = 404(0x194, float:5.66E-43)
            if (r3 == r0) goto L2c
            r0 = 429(0x1ad, float:6.01E-43)
            if (r3 == r0) goto L29
            r0 = 431(0x1af, float:6.04E-43)
            if (r3 == r0) goto L35
            switch(r3) {
                case 502: goto L29;
                case 503: goto L29;
                case 504: goto L29;
                default: goto L26;
            }
        L26:
            e.a.eb r0 = e.a.eb.UNKNOWN
            goto L37
        L29:
            e.a.eb r0 = e.a.eb.UNAVAILABLE
            goto L37
        L2c:
            e.a.eb r0 = e.a.eb.UNIMPLEMENTED
            goto L37
        L2f:
            e.a.eb r0 = e.a.eb.PERMISSION_DENIED
            goto L37
        L32:
            e.a.eb r0 = e.a.eb.UNAUTHENTICATED
            goto L37
        L35:
            e.a.eb r0 = e.a.eb.INTERNAL
        L37:
            e.a.ee r0 = r0.b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "HTTP status code "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            e.a.ee r3 = r0.g(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.d.dh.a(int):e.a.ee");
    }

    public static e.a.ee b(e.a.ee eeVar) {
        com.google.d.b.an.l(true);
        if (!q.contains(eeVar.a())) {
            return eeVar;
        }
        return e.a.ee.f47410j.g("Inappropriate status code from control plane: " + eeVar.a().toString() + " " + eeVar.i()).f(eeVar.j());
    }

    static aj c(e.a.bn bnVar, boolean z) {
        e.a.bq bqVarE = bnVar.e();
        aj ajVarH = bqVarE != null ? ((eh) bqVarE.a()).h() : null;
        if (ajVarH != null) {
            return ajVarH;
        }
        if (!bnVar.f().l()) {
            if (bnVar.h()) {
                return new cs(b(bnVar.f()), ag.f46607c);
            }
            if (!z) {
                return new cs(b(bnVar.f()), ag.f46605a);
            }
        }
        return null;
    }

    public static String d(String str, int i2) {
        String str2;
        int i3;
        try {
            str2 = str;
            i3 = i2;
            try {
                return new URI(null, null, str2, i3, null, null, null).getAuthority();
            } catch (URISyntaxException e2) {
                e = e2;
                throw new IllegalArgumentException("Invalid host or port: " + str2 + " " + i3, e);
            }
        } catch (URISyntaxException e3) {
            e = e3;
            str2 = str;
            i3 = i2;
        }
    }

    public static URI e(String str) {
        String str2;
        com.google.d.b.an.C(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e2) {
                e = e2;
                throw new IllegalArgumentException("Invalid authority: ".concat(String.valueOf(str2)), e);
            }
        } catch (URISyntaxException e3) {
            e = e3;
            str2 = str;
        }
    }

    static void f(jv jvVar) throws IOException {
        while (true) {
            InputStream inputStreamF = jvVar.f();
            if (inputStreamF == null) {
                return;
            } else {
                g(inputStreamF);
            }
        }
    }

    public static void g(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e2) {
            p.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static boolean h(e.a.h hVar) {
        return !Boolean.TRUE.equals(hVar.p(f46802l));
    }

    public static ThreadFactory i(String str) {
        com.google.d.m.a.bx bxVar = new com.google.d.m.a.bx();
        bxVar.c();
        bxVar.d(str);
        return bxVar.b();
    }

    public static e.a.p[] j(e.a.h hVar, int i2, boolean z, boolean z2) {
        List listR = hVar.r();
        int size = listR.size();
        e.a.p[] pVarArr = new e.a.p[size + 1];
        e.a.n nVarA = e.a.o.a();
        nVarA.a(hVar);
        nVarA.d(i2);
        nVarA.c(z);
        nVarA.b(z2);
        nVarA.e();
        for (int i3 = 0; i3 < listR.size(); i3++) {
            pVarArr[i3] = ((e.a.dt) listR.get(i3)).p();
        }
        pVarArr[size] = r;
        return pVarArr;
    }
}
