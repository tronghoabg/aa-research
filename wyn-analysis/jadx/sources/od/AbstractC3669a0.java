package od;

import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import k8.C3197f;
import md.AbstractC3537e;
import md.AbstractC3540h;
import md.AbstractC3541i;
import md.C3535c;
import md.C3542j;
import org.apache.tika.utils.StringUtils;

/* renamed from: od.a0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3669a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f41885a = Logger.getLogger(AbstractC3669a0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Set f41886b = DesugarCollections.unmodifiableSet(EnumSet.of(md.j0.OK, md.j0.INVALID_ARGUMENT, md.j0.NOT_FOUND, md.j0.ALREADY_EXISTS, md.j0.FAILED_PRECONDITION, md.j0.ABORTED, md.j0.OUT_OF_RANGE, md.j0.DATA_LOSS));

    /* renamed from: c, reason: collision with root package name */
    public static final md.W f41887c;

    /* renamed from: d, reason: collision with root package name */
    public static final md.W f41888d;

    /* renamed from: e, reason: collision with root package name */
    public static final md.Z f41889e;

    /* renamed from: f, reason: collision with root package name */
    public static final md.W f41890f;

    /* renamed from: g, reason: collision with root package name */
    public static final md.Z f41891g;

    /* renamed from: h, reason: collision with root package name */
    public static final md.W f41892h;

    /* renamed from: i, reason: collision with root package name */
    public static final md.W f41893i;

    /* renamed from: j, reason: collision with root package name */
    public static final md.W f41894j;
    public static final md.W k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f41895l;

    /* renamed from: m, reason: collision with root package name */
    public static final C3712o1 f41896m;

    /* renamed from: n, reason: collision with root package name */
    public static final B8.e f41897n;

    /* renamed from: o, reason: collision with root package name */
    public static final X f41898o;

    /* renamed from: p, reason: collision with root package name */
    public static final Y1 f41899p;

    /* renamed from: q, reason: collision with root package name */
    public static final Y1 f41900q;

    /* renamed from: r, reason: collision with root package name */
    public static final Y f41901r;

    static {
        Charset.forName("US-ASCII");
        f41887c = new md.W("grpc-timeout", new Y1(11));
        C3542j c3542j = md.b0.f40615d;
        f41888d = new md.W("grpc-encoding", c3542j);
        f41889e = md.G.a("grpc-accept-encoding", new Y1(10));
        f41890f = new md.W("content-encoding", c3542j);
        f41891g = md.G.a("accept-encoding", new Y1(10));
        f41892h = new md.W("content-length", c3542j);
        f41893i = new md.W("content-type", c3542j);
        f41894j = new md.W("te", c3542j);
        k = new md.W("user-agent", c3542j);
        C3197f.f39298c.getClass();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f41895l = timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        f41896m = new C3712o1();
        f41897n = new B8.e("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", 4);
        f41898o = new X();
        f41899p = new Y1(8);
        f41900q = new Y1(9);
        f41901r = new Y(0);
    }

    public static URI a(String str) {
        String str2;
        Fe.e.t(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e7) {
                e = e7;
                throw new IllegalArgumentException("Invalid authority: ".concat(str2), e);
            }
        } catch (URISyntaxException e10) {
            e = e10;
            str2 = str;
        }
    }

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e7) {
            f41885a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e7);
        }
    }

    public static AbstractC3541i[] c(C3535c c3535c, md.b0 b0Var, int i5, boolean z2) {
        List list = c3535c.f40624e;
        int size = list.size();
        AbstractC3541i[] abstractC3541iArr = new AbstractC3541i[size + 1];
        C3535c c3535c2 = C3535c.f40619i;
        Yf.B b5 = new Yf.B(c3535c, i5, z2);
        for (int i10 = 0; i10 < list.size(); i10++) {
            abstractC3541iArr[i10] = ((AbstractC3540h) list.get(i10)).a(b5, b0Var);
        }
        abstractC3541iArr[size] = f41898o;
        return abstractC3541iArr;
    }

    public static String d(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static p8.r e(String str) {
        Boolean bool = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        return new p8.r(Executors.defaultThreadFactory(), str, new AtomicLong(0L), bool);
    }

    public static InterfaceC3727u f(md.K k5, boolean z2) {
        C3699k0 c3699k0;
        AbstractC3537e abstractC3537e = k5.f40584a;
        if (abstractC3537e == null) {
            c3699k0 = null;
        } else {
            C3711o0 c3711o0 = (C3711o0) abstractC3537e.e();
            c3699k0 = c3711o0.f42046v;
            if (c3699k0 == null) {
                c3711o0.k.execute(new RunnableC3690h0(c3711o0, 1));
                c3699k0 = null;
            }
        }
        if (c3699k0 != null) {
            vd.p pVar = k5.f40585b;
            return pVar == null ? c3699k0 : new T(pVar, c3699k0);
        }
        md.k0 k0Var = k5.f40586c;
        if (!k0Var.f()) {
            if (k5.f40587d) {
                return new T(h(k0Var), EnumC3721s.f42084c);
            }
            if (!z2) {
                return new T(h(k0Var), EnumC3721s.f42082a);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static md.k0 g(int r3) {
        /*
            r0 = 100
            if (r3 < r0) goto Lb
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 >= r0) goto Lb
            md.j0 r0 = md.j0.INTERNAL
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
            md.j0 r0 = md.j0.UNKNOWN
            goto L37
        L29:
            md.j0 r0 = md.j0.UNAVAILABLE
            goto L37
        L2c:
            md.j0 r0 = md.j0.UNIMPLEMENTED
            goto L37
        L2f:
            md.j0 r0 = md.j0.PERMISSION_DENIED
            goto L37
        L32:
            md.j0 r0 = md.j0.UNAUTHENTICATED
            goto L37
        L35:
            md.j0 r0 = md.j0.INTERNAL
        L37:
            md.k0 r0 = r0.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "HTTP status code "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            md.k0 r3 = r0.h(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: od.AbstractC3669a0.g(int):md.k0");
    }

    public static md.k0 h(md.k0 k0Var) {
        Fe.e.q(k0Var != null);
        if (!f41886b.contains(k0Var.f40685a)) {
            return k0Var;
        }
        return md.k0.f40681m.h("Inappropriate status code from control plane: " + k0Var.f40685a + StringUtils.SPACE + k0Var.f40686b).g(k0Var.f40687c);
    }
}
