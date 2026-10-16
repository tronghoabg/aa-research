package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aeao {
    private aeao() {
    }

    public static aegw A(aegw aegwVar, java.util.function.IntPredicate intPredicate) {
        aegw aeguVar;
        if (intPredicate instanceof aegw) {
            aeguVar = (aegw) intPredicate;
        } else {
            intPredicate.getClass();
            aeguVar = new aegu(intPredicate);
        }
        return aegwVar.a(aeguVar);
    }

    public static aegw B(aegw aegwVar, aegw aegwVar2) {
        aegwVar2.getClass();
        return new aegv(aegwVar, aegwVar2, 1);
    }

    public static aegw C(aegw aegwVar, java.util.function.IntPredicate intPredicate) {
        aegw aeguVar;
        if (intPredicate instanceof aegw) {
            aeguVar = (aegw) intPredicate;
        } else {
            intPredicate.getClass();
            aeguVar = new aegu(intPredicate);
        }
        return aegwVar.b(aeguVar);
    }

    @java.lang.Deprecated
    public static boolean D(aegw aegwVar, int i) {
        h(i);
        return aegwVar.c((byte) i);
    }

    @java.lang.Deprecated
    public static boolean E(aegw aegwVar, java.lang.Byte b) {
        return aegwVar.c(b.byteValue());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: xzp */
    public static java.util.Set a(java.util.Map map, java.lang.String str) throws xzp {
        defpackage.adoo adooVarValueOf;
        java.util.List listQ = defpackage.adrs.q(map, str);
        if (listQ == null) {
            return null;
        }
        java.util.EnumSet enumSetNoneOf = java.util.EnumSet.noneOf(defpackage.adoo.class);
        for (java.lang.Object obj : listQ) {
            if (obj instanceof java.lang.Double) {
                java.lang.Double d = (java.lang.Double) obj;
                int iIntValue = d.intValue();
                defpackage.ysr.aN(((double) iIntValue) == d.doubleValue(), "Status code %s is not integral", obj);
                adooVarValueOf = defpackage.ador.b(iIntValue).p;
                defpackage.ysr.aN(adooVarValueOf.r == d.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof java.lang.String)) {
                    throw new xzp("Can not convert status code " + java.lang.String.valueOf(obj) + " to Status.Code, because its type is " + java.lang.String.valueOf(obj.getClass()));
                }
                try {
                    adooVarValueOf = defpackage.adoo.valueOf((java.lang.String) obj);
                } catch (java.lang.IllegalArgumentException e) {
                    throw new xzp(defpackage.a.bU(obj, "Status code ", " is not valid"), e);
                }
            }
            enumSetNoneOf.add(adooVarValueOf);
        }
        return j$.util.DesugarCollections.unmodifiableSet(enumSetNoneOf);
    }

    public static final java.net.PasswordAuthentication b(java.lang.String str, java.net.InetAddress inetAddress, int i) {
        java.net.URL url;
        try {
            url = new java.net.URL("https", str, i, "");
        } catch (java.net.MalformedURLException unused) {
            defpackage.adyj.a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new java.lang.Object[]{"https", str});
            url = null;
        }
        return java.net.Authenticator.requestPasswordAuthentication(str, inetAddress, i, "https", "", null, url, java.net.Authenticator.RequestorType.PROXY);
    }

    public static adwc c() {
        return defpackage.adyq.a == null ? new defpackage.adyq() : new adsq();
    }

    @java.lang.Deprecated
    public static boolean d(aefz aefzVar, java.lang.Byte b) {
        return aefzVar.c(b.byteValue());
    }

    @java.lang.Deprecated
    public static java.lang.Byte e(aefx aefxVar) {
        return java.lang.Byte.valueOf(aefxVar.d());
    }

    public static long f(java.util.Collection collection) {
        return collection instanceof aeff ? ((aeff) collection).a() : collection.size();
    }

    public static long g(java.util.Map map) {
        return map instanceof aeff ? ((aeff) map).a() : map.size();
    }

    public static void h(int i) {
        if (i < -128 || i > 127) {
            throw new java.lang.IllegalArgumentException(i + " can't be represented as byte (out of range)");
        }
    }

    public static void i(int i) {
        if (i < -32768 || i > 32767) {
            throw new java.lang.IllegalArgumentException(i + " can't be represented as short (out of range)");
        }
    }

    @java.lang.Deprecated
    public static boolean j(aekf aekfVar, java.lang.Integer num) {
        return aekfVar.c(num.intValue());
    }

    @java.lang.Deprecated
    public static boolean k(aekf aekfVar, java.util.function.Predicate predicate) {
        return aekfVar.i(a$.ExternalSyntheticApiModelOutline2.m$2(predicate) ? a$.ExternalSyntheticApiModelOutline2.m(predicate) : new aeke(predicate));
    }

    @java.lang.Deprecated
    public static java.lang.Integer l(aekd aekdVar) {
        return java.lang.Integer.valueOf(aekdVar.a());
    }

    @java.lang.Deprecated
    public static java.lang.Object n(aeja aejaVar, java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((java.lang.Integer) obj).intValue();
        java.lang.Object objH = aejaVar.h(iIntValue);
        if (objH != null || aejaVar.c(iIntValue)) {
            return objH;
        }
        return null;
    }

    @java.lang.Deprecated
    public static java.lang.Object o(aeja aejaVar, java.lang.Integer num, java.lang.Object obj) {
        int iIntValue = num.intValue();
        boolean zC = aejaVar.c(iIntValue);
        java.lang.Object objA = aejaVar.a(iIntValue, obj);
        if (zC) {
            return objA;
        }
        return null;
    }

    @java.lang.Deprecated
    public static java.lang.Object p(aeja aejaVar, java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((java.lang.Integer) obj).intValue();
        if (aejaVar.c(iIntValue)) {
            return aejaVar.b(iIntValue);
        }
        return null;
    }

    @java.lang.Deprecated
    public static boolean q(aeja aejaVar, java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return aejaVar.c(((java.lang.Integer) obj).intValue());
    }

    @java.lang.Deprecated
    public static java.lang.Object s(aehu aehuVar, java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((java.lang.Integer) obj).intValue();
        java.lang.Object objP = aehuVar.p(iIntValue);
        if (objP != null || aehuVar.c(iIntValue)) {
            return objP;
        }
        return null;
    }

    @java.lang.Deprecated
    public static java.lang.Object t(aehu aehuVar, java.lang.Integer num, java.lang.Object obj) {
        int iIntValue = num.intValue();
        boolean zC = aehuVar.c(iIntValue);
        java.lang.Object objA = aehuVar.a(iIntValue, obj);
        if (zC) {
            return objA;
        }
        return null;
    }

    @java.lang.Deprecated
    public static java.lang.Object u(aehu aehuVar, java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((java.lang.Integer) obj).intValue();
        if (aehuVar.c(iIntValue)) {
            return aehuVar.b(iIntValue);
        }
        return null;
    }

    @java.lang.Deprecated
    public static boolean v(aehu aehuVar, java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return aehuVar.c(((java.lang.Integer) obj).intValue());
    }

    @java.lang.Deprecated
    public static void w(aegz aegzVar, java.util.function.Consumer consumer) {
        aegj aegyVar;
        if (consumer instanceof aegj) {
            aegyVar = (aegj) consumer;
        } else {
            consumer.getClass();
            aegyVar = new aegy(consumer);
        }
        aegzVar.forEachRemaining(aegyVar);
    }

    @java.lang.Deprecated
    public static boolean x(aegz aegzVar, java.util.function.Consumer consumer) {
        aegj aegyVar;
        if (consumer instanceof aegj) {
            aegyVar = (aegj) consumer;
        } else {
            consumer.getClass();
            aegyVar = new aegy(consumer);
        }
        return aegzVar.tryAdvance(aegyVar);
    }

    public static aegb y() {
        throw new java.lang.IllegalStateException();
    }

    public static aegw z(aegw aegwVar, aegw aegwVar2) {
        aegwVar2.getClass();
        return new aegv(aegwVar, aegwVar2, 0);
    }
}
