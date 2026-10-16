package defpackage;

import j$.util.Comparator;
import j$.util.DesugarCollections;
import j$.util.function.IntPredicate$CC;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class adzo {
    private adzo() {
    }

    @Deprecated
    public static Object A(aegu aeguVar, Integer num, Object obj) {
        int iIntValue = num.intValue();
        boolean zC = aeguVar.c(iIntValue);
        Object objA = aeguVar.a(iIntValue, obj);
        if (zC) {
            return objA;
        }
        return null;
    }

    @Deprecated
    public static Object B(aegu aeguVar, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (aeguVar.c(iIntValue)) {
            return aeguVar.b(iIntValue);
        }
        return null;
    }

    @Deprecated
    public static boolean C(aegu aeguVar, Object obj) {
        if (obj == null) {
            return false;
        }
        return aeguVar.c(((Integer) obj).intValue());
    }

    @Deprecated
    public static void D(aefz aefzVar, Consumer consumer) {
        aefj aefyVar;
        if (consumer instanceof aefj) {
            aefyVar = (aefj) consumer;
        } else {
            consumer.getClass();
            aefyVar = new aefy(consumer);
        }
        aefzVar.forEachRemaining((aefz) aefyVar);
    }

    @Deprecated
    public static boolean E(aefz aefzVar, Consumer consumer) {
        aefj aefyVar;
        if (consumer instanceof aefj) {
            aefyVar = (aefj) consumer;
        } else {
            consumer.getClass();
            aefyVar = new aefy(consumer);
        }
        return aefzVar.tryAdvance((aefz) aefyVar);
    }

    public static aefb F() {
        throw new IllegalStateException();
    }

    public static Set a(Map map, String str) {
        adnn adnnVarValueOf;
        List listW = adqq.w(map, str);
        if (listW == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(adnn.class);
        for (Object obj : listW) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int iIntValue = d.intValue();
                wub.I(((double) iIntValue) == d.doubleValue(), "Status code %s is not integral", obj);
                adnnVarValueOf = adnq.b(iIntValue).p;
                wub.I(adnnVarValueOf.r == d.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new xyj("Can not convert status code " + String.valueOf(obj) + " to Status.Code, because its type is " + String.valueOf(obj.getClass()));
                }
                try {
                    adnnVarValueOf = adnn.valueOf((String) obj);
                } catch (IllegalArgumentException e) {
                    throw new xyj(a.bV(obj, "Status code ", " is not valid"), e);
                }
            }
            enumSetNoneOf.add(adnnVarValueOf);
        }
        return DesugarCollections.unmodifiableSet(enumSetNoneOf);
    }

    public static final PasswordAuthentication b(String str, InetAddress inetAddress, int i) {
        URL url;
        try {
            url = new URL("https", str, i, "");
        } catch (MalformedURLException unused) {
            adxh.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", str});
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i, "https", "", null, url, Authenticator.RequestorType.PROXY);
    }

    public static final int c(String[] strArr) {
        return strArr.length >> 1;
    }

    public static final String d(int i, String[] strArr) {
        int i2 = i + i;
        if (i2 < 0 || i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public static final String e(int i, String[] strArr) {
        int i2 = i + i + 1;
        if (i2 < 0 || i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public static /* synthetic */ String f(int i) {
        return i != 1 ? "OUTBOUND" : "INBOUND";
    }

    @Deprecated
    public static int g(aefb aefbVar, Byte b, Byte b2) {
        return aefbVar.a(b.byteValue(), b2.byteValue());
    }

    public static Comparator i(aefb aefbVar, Comparator comparator) {
        return comparator instanceof aefb ? aefbVar.c((aefb) comparator) : Comparator.CC.$default$thenComparing(aefbVar, comparator);
    }

    @Deprecated
    public static boolean j(aeez aeezVar, Byte b) {
        return aeezVar.c(b.byteValue());
    }

    @Deprecated
    public static Byte k(aeex aeexVar) {
        return Byte.valueOf(aeexVar.d());
    }

    public static long l(Collection collection) {
        return collection instanceof aeef ? ((aeef) collection).a() : collection.size();
    }

    public static long m(Map map) {
        return map instanceof aeef ? ((aeef) map).a() : map.size();
    }

    @Deprecated
    public static int n(aejj aejjVar, Integer num, Integer num2) {
        return aejjVar.a(num.intValue(), num2.intValue());
    }

    public static java.util.Comparator p(aejj aejjVar, java.util.Comparator comparator) {
        return comparator instanceof aejj ? aejjVar.c((aejj) comparator) : Comparator.CC.$default$thenComparing(aejjVar, comparator);
    }

    @Deprecated
    public static boolean q(aejf aejfVar, Integer num) {
        return aejfVar.c(num.intValue());
    }

    @Deprecated
    public static boolean r(aejf aejfVar, final Predicate predicate) {
        return aejfVar.i(a$$ExternalSyntheticApiModelOutline3.m$2(predicate) ? a$$ExternalSyntheticApiModelOutline3.m41m((Object) predicate) : new IntPredicate() { // from class: aeje
            public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                return IntPredicate$CC.$default$and(this, intPredicate);
            }

            public final /* synthetic */ IntPredicate negate() {
                return IntPredicate$CC.$default$negate(this);
            }

            public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                return IntPredicate$CC.$default$or(this, intPredicate);
            }

            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return predicate.test(Integer.valueOf(i));
            }
        });
    }

    @Deprecated
    public static Integer s(aejd aejdVar) {
        return Integer.valueOf(aejdVar.a());
    }

    @Deprecated
    public static Object u(aeia aeiaVar, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        Object objH = aeiaVar.h(iIntValue);
        if (objH != null || aeiaVar.c(iIntValue)) {
            return objH;
        }
        return null;
    }

    @Deprecated
    public static Object v(aeia aeiaVar, Integer num, Object obj) {
        int iIntValue = num.intValue();
        boolean zC = aeiaVar.c(iIntValue);
        Object objA = aeiaVar.a(iIntValue, obj);
        if (zC) {
            return objA;
        }
        return null;
    }

    @Deprecated
    public static Object w(aeia aeiaVar, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (aeiaVar.c(iIntValue)) {
            return aeiaVar.b(iIntValue);
        }
        return null;
    }

    @Deprecated
    public static boolean x(aeia aeiaVar, Object obj) {
        if (obj == null) {
            return false;
        }
        return aeiaVar.c(((Integer) obj).intValue());
    }

    @Deprecated
    public static Object z(aegu aeguVar, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        Object objP = aeguVar.p(iIntValue);
        if (objP != null || aeguVar.c(iIntValue)) {
            return objP;
        }
        return null;
    }
}
