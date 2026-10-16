package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adve {
    public static final defpackage.admy b;
    public static final defpackage.admy c;
    public static final defpackage.admy d;
    public static final defpackage.admy e;
    public static final defpackage.admy f;
    static final defpackage.admy g;
    public static final defpackage.admy h;
    public static final defpackage.admy i;
    public static final defpackage.admy j;
    public static final defpackage.xzd k;
    public static final long l;
    public static final adoe m;
    public static final defpackage.adjv n;
    public static final aeaq o;
    public static final aeaq p;
    public static final defpackage.xzi q;
    private static final defpackage.adkb t;
    private static final java.util.logging.Logger r = java.util.logging.Logger.getLogger(defpackage.adve.class.getName());
    private static final java.util.Set s = j$.util.DesugarCollections.unmodifiableSet(java.util.EnumSet.of(defpackage.adoo.OK, defpackage.adoo.INVALID_ARGUMENT, defpackage.adoo.NOT_FOUND, defpackage.adoo.ALREADY_EXISTS, defpackage.adoo.FAILED_PRECONDITION, defpackage.adoo.ABORTED, defpackage.adoo.OUT_OF_RANGE, defpackage.adoo.DATA_LOSS));
    public static final java.nio.charset.Charset a = java.nio.charset.Charset.forName("US-ASCII");

    static {
        defpackage.advd advdVar = new defpackage.advd(0);
        int i2 = defpackage.admy.d;
        b = new defpackage.admu("grpc-timeout", advdVar);
        c = new defpackage.admu("grpc-encoding", defpackage.adnd.b);
        d = defpackage.adlq.a("grpc-accept-encoding", new defpackage.advg(1));
        e = new defpackage.admu("content-encoding", defpackage.adnd.b);
        f = defpackage.adlq.a("accept-encoding", new defpackage.advg(1));
        g = new defpackage.admu("content-length", defpackage.adnd.b);
        h = new defpackage.admu("content-type", defpackage.adnd.b);
        i = new defpackage.admu("te", defpackage.adnd.b);
        j = new defpackage.admu("user-agent", defpackage.adnd.b);
        k = defpackage.xzd.c(',').f();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        l = 20000000000L;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.HOURS;
        java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.SECONDS;
        java.util.concurrent.TimeUnit timeUnit4 = java.util.concurrent.TimeUnit.MINUTES;
        m = new defpackage.adyj();
        n = new defpackage.adjv("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", null);
        t = new defpackage.adkb();
        o = new defpackage.advb();
        p = new defpackage.aebq(1);
        q = new defpackage.qcv(2);
    }

    private adve() {
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0029  */
    /* JADX WARN: Code duplicated, block: B:25:0x0035  */
    public static defpackage.ador a(int i2) {
        defpackage.adoo adooVar;
        if ((i2 >= 100 && i2 < 200) || i2 == 400) {
            adooVar = defpackage.adoo.INTERNAL;
        } else if (i2 == 401) {
            adooVar = defpackage.adoo.UNAUTHENTICATED;
        } else if (i2 == 403) {
            adooVar = defpackage.adoo.PERMISSION_DENIED;
        } else if (i2 == 404) {
            adooVar = defpackage.adoo.UNIMPLEMENTED;
        } else if (i2 == 429) {
            adooVar = defpackage.adoo.UNAVAILABLE;
        } else if (i2 != 431) {
            switch (i2) {
                case 502:
                case 503:
                case 504:
                    adooVar = defpackage.adoo.UNAVAILABLE;
                    break;
                default:
                    adooVar = defpackage.adoo.UNKNOWN;
                    break;
            }
        } else {
            adooVar = defpackage.adoo.INTERNAL;
        }
        return adooVar.a().e(defpackage.a.bo(i2, "HTTP status code "));
    }

    public static defpackage.ador b(defpackage.ador adorVar) {
        defpackage.ysr.aX(adorVar != null);
        java.util.Set set = s;
        defpackage.adoo adooVar = adorVar.p;
        if (!set.contains(adooVar)) {
            return adorVar;
        }
        return defpackage.ador.l.e("Inappropriate status code from control plane: " + adooVar.toString() + " " + adorVar.q).d(adorVar.r);
    }

    static adtl c(defpackage.admd admdVar, boolean z) {
        adtl adtlVarA;
        defpackage.admg admgVar = admdVar.b;
        if (admgVar != null) {
            defpackage.adsm adsmVar = (defpackage.adsm) admgVar;
            defpackage.ysr.bk(adsmVar.g, "Subchannel is not started");
            adtlVarA = adsmVar.f.a();
        } else {
            adtlVarA = null;
        }
        if (adtlVarA != null) {
            return adtlVarA;
        }
        defpackage.ador adorVar = admdVar.c;
        if (!adorVar.g()) {
            if (admdVar.d) {
                return new defpackage.adur(b(adorVar), defpackage.adtj.c);
            }
            if (!z) {
                return new defpackage.adur(b(adorVar), defpackage.adtj.a);
            }
        }
        return null;
    }

    public static java.lang.String d(java.lang.String str, int i2) {
        java.lang.String str2;
        int i3;
        try {
            str2 = str;
            i3 = i2;
            try {
                return new java.net.URI(null, null, str2, i3, null, null, null).getAuthority();
            } catch (java.net.URISyntaxException e2) {
                e = e2;
                throw new java.lang.IllegalArgumentException(defpackage.a.by(i3, str2, "Invalid host or port: ", " "), e);
            }
        } catch (java.net.URISyntaxException e3) {
            e = e3;
            str2 = str;
            i3 = i2;
        }
    }

    public static java.net.URI e(java.lang.String str) {
        java.lang.String str2;
        str.getClass();
        try {
            str2 = str;
            try {
                return new java.net.URI(null, str2, null, null, null);
            } catch (java.net.URISyntaxException e2) {
                e = e2;
                throw new java.lang.IllegalArgumentException("Invalid authority: ".concat(str2), e);
            }
        } catch (java.net.URISyntaxException e3) {
            e = e3;
            str2 = str;
        }
    }

    static void f(aeax aeaxVar) {
        while (true) {
            java.io.InputStream inputStreamG = aeaxVar.g();
            if (inputStreamG == null) {
                return;
            } else {
                g(inputStreamG);
            }
        }
    }

    public static void g(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.io.IOException e2) {
            r.logp(java.util.logging.Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (java.lang.Throwable) e2);
        }
    }

    public static boolean h(defpackage.adjw adjwVar) {
        return !java.lang.Boolean.TRUE.equals(adjwVar.g(n));
    }

    public static java.util.concurrent.ThreadFactory i(java.lang.String str) {
        defpackage.adrn adrnVar = new defpackage.adrn((byte[]) null);
        adrnVar.e();
        adrnVar.f(str);
        return defpackage.adrn.g(adrnVar);
    }

    public static java.lang.String j(java.lang.String str) {
        return defpackage.a.bp(str, "grpc-java-", "/1.84.0-SNAPSHOT");
    }

    public static defpackage.adkb[] k(defpackage.adjw adjwVar) {
        java.util.List list = adjwVar.e;
        int size = list.size();
        defpackage.adkb[] adkbVarArr = new defpackage.adkb[size + 1];
        adjwVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            adkbVarArr[i2] = ((defpackage.adrq) list.get(i2)).aU();
        }
        adkbVarArr[size] = t;
        return adkbVarArr;
    }
}
