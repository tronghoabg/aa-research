package defpackage;

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

/* loaded from: classes.dex */
public final class adue {
    public static final adlx b;
    public static final adlx c;
    public static final adlx d;
    public static final adlx e;
    public static final adlx f;
    static final adlx g;
    public static final adlx h;
    public static final adlx i;
    public static final adlx j;
    public static final xxx k;
    public static final long l;
    public static final adnd m;
    public static final adiv n;
    public static final adzq o;
    public static final adzq p;
    public static final xyc q;
    private static final adjb t;
    private static final Logger r = Logger.getLogger(adue.class.getName());
    private static final Set s = DesugarCollections.unmodifiableSet(EnumSet.of(adnn.OK, adnn.INVALID_ARGUMENT, adnn.NOT_FOUND, adnn.ALREADY_EXISTS, adnn.FAILED_PRECONDITION, adnn.ABORTED, adnn.OUT_OF_RANGE, adnn.DATA_LOSS));
    public static final Charset a = Charset.forName("US-ASCII");

    static {
        adud adudVar = new adud(0);
        int i2 = adlx.d;
        b = new adlt("grpc-timeout", adudVar);
        c = new adlt("grpc-encoding", admc.b);
        d = adkp.a("grpc-accept-encoding", new adug(1));
        e = new adlt("content-encoding", admc.b);
        f = adkp.a("accept-encoding", new adug(1));
        g = new adlt("content-length", admc.b);
        h = new adlt("content-type", admc.b);
        i = new adlt("te", admc.b);
        j = new adlt("user-agent", admc.b);
        k = xxx.c(',').f();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        l = 20000000000L;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        m = new adxh();
        n = new adiv("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", null);
        t = new adjb();
        o = new adub();
        p = new aeaq(1);
        q = new qbx(2);
    }

    private adue() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.adnq a(int r2) {
        /*
            r0 = 100
            if (r2 < r0) goto Lb
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 >= r0) goto Lb
            adnn r0 = defpackage.adnn.INTERNAL
            goto L37
        Lb:
            r0 = 400(0x190, float:5.6E-43)
            if (r2 == r0) goto L35
            r0 = 401(0x191, float:5.62E-43)
            if (r2 == r0) goto L32
            r0 = 403(0x193, float:5.65E-43)
            if (r2 == r0) goto L2f
            r0 = 404(0x194, float:5.66E-43)
            if (r2 == r0) goto L2c
            r0 = 429(0x1ad, float:6.01E-43)
            if (r2 == r0) goto L29
            r0 = 431(0x1af, float:6.04E-43)
            if (r2 == r0) goto L35
            switch(r2) {
                case 502: goto L29;
                case 503: goto L29;
                case 504: goto L29;
                default: goto L26;
            }
        L26:
            adnn r0 = defpackage.adnn.UNKNOWN
            goto L37
        L29:
            adnn r0 = defpackage.adnn.UNAVAILABLE
            goto L37
        L2c:
            adnn r0 = defpackage.adnn.UNIMPLEMENTED
            goto L37
        L2f:
            adnn r0 = defpackage.adnn.PERMISSION_DENIED
            goto L37
        L32:
            adnn r0 = defpackage.adnn.UNAUTHENTICATED
            goto L37
        L35:
            adnn r0 = defpackage.adnn.INTERNAL
        L37:
            adnq r0 = r0.a()
            java.lang.String r1 = "HTTP status code "
            java.lang.String r2 = defpackage.a.bp(r2, r1)
            adnq r2 = r0.e(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adue.a(int):adnq");
    }

    public static adnq b(adnq adnqVar) {
        woy.N(adnqVar != null);
        Set set = s;
        adnn adnnVar = adnqVar.p;
        if (!set.contains(adnnVar)) {
            return adnqVar;
        }
        return adnq.l.e("Inappropriate status code from control plane: " + adnnVar.toString() + " " + adnqVar.q).d(adnqVar.r);
    }

    static adsk c(adlc adlcVar, boolean z) {
        adsk adskVarA;
        adlf adlfVar = adlcVar.b;
        if (adlfVar != null) {
            adrl adrlVar = (adrl) adlfVar;
            woy.aa(adrlVar.g, "Subchannel is not started");
            adskVarA = adrlVar.f.a();
        } else {
            adskVarA = null;
        }
        if (adskVarA != null) {
            return adskVarA;
        }
        adnq adnqVar = adlcVar.c;
        if (!adnqVar.g()) {
            if (adlcVar.d) {
                return new adtr(b(adnqVar), adsi.c);
            }
            if (!z) {
                return new adtr(b(adnqVar), adsi.a);
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
                throw new IllegalArgumentException(a.bA(i3, str2, "Invalid host or port: ", " "), e);
            }
        } catch (URISyntaxException e3) {
            e = e3;
            str2 = str;
            i3 = i2;
        }
    }

    public static URI e(String str) {
        String str2;
        str.getClass();
        try {
            str2 = str;
        } catch (URISyntaxException e2) {
            e = e2;
            str2 = str;
        }
        try {
            return new URI(null, str2, null, null, null);
        } catch (URISyntaxException e3) {
            e = e3;
            throw new IllegalArgumentException("Invalid authority: ".concat(str2), e);
        }
    }

    static void f(adzx adzxVar) throws IOException {
        while (true) {
            InputStream inputStreamG = adzxVar.g();
            if (inputStreamG == null) {
                return;
            } else {
                g(inputStreamG);
            }
        }
    }

    public static void g(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e2) {
            r.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static boolean h(adiw adiwVar) {
        return !Boolean.TRUE.equals(adiwVar.g(n));
    }

    public static ThreadFactory i(String str) {
        zhe zheVar = new zhe();
        zheVar.c();
        zheVar.d(str);
        return zhe.b(zheVar);
    }

    public static String j(String str) {
        return a.bq(str, "grpc-java-", "/1.84.0-SNAPSHOT");
    }

    public static adjb[] k(adiw adiwVar) {
        List list = adiwVar.e;
        int size = list.size();
        adjb[] adjbVarArr = new adjb[size + 1];
        adiwVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            adjbVarArr[i2] = ((adqq) list.get(i2)).bd();
        }
        adjbVarArr[size] = t;
        return adjbVarArr;
    }
}
