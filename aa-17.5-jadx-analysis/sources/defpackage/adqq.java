package defpackage;

import android.content.Context;
import android.os.UserHandle;
import j$.lang.Iterable$EL;
import j$.util.Comparator;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.LongConsumer$CC;
import j$.util.function.LongPredicate$CC;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public class adqq {
    private static volatile Method a;

    private adqq() {
    }

    public static void A(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
    }

    public static List B(Class cls, Iterator it, xyc xycVar, adnm adnmVar) {
        Object objNewInstance;
        if (!(it instanceof ListIterator)) {
            if (C(cls.getClassLoader())) {
                Iterable<Class> iterable = (Iterable) xycVar.gu();
                ArrayList arrayList = new ArrayList();
                for (Class cls2 : iterable) {
                    try {
                        objNewInstance = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                    } catch (ClassCastException unused) {
                        objNewInstance = null;
                    } catch (Throwable th) {
                        throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                    }
                    if (objNewInstance != null) {
                        arrayList.add(objNewInstance);
                    }
                }
                it = arrayList.iterator();
            } else if (!it.hasNext()) {
                it = ServiceLoader.load(cls).iterator();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        while (it.hasNext()) {
            Object next = it.next();
            adnmVar.b(next);
            arrayList2.add(next);
        }
        Collections.sort(arrayList2, Collections.reverseOrder(new czs(adnmVar, 10, null)));
        return DesugarCollections.unmodifiableList(arrayList2);
    }

    public static boolean C(ClassLoader classLoader) throws ClassNotFoundException {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static adnq D(adjq adjqVar) {
        adjqVar.getClass();
        if (!adjqVar.i()) {
            return null;
        }
        Throwable thC = adjqVar.c();
        if (thC == null) {
            return adnq.c.e("io.grpc.Context was cancelled without error");
        }
        if (thC instanceof TimeoutException) {
            return adnq.f.e(thC.getMessage()).d(thC);
        }
        adnq adnqVarC = adnq.c(thC);
        return (adnn.UNKNOWN.equals(adnqVarC.p) && adnqVarC.r == thC) ? adnq.c.e("Context cancelled").d(thC) : adnqVarC.d(thC);
    }

    public static adix E(adix adixVar, List list) {
        adixVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            adixVar = new adja(adixVar, (adiz) it.next());
        }
        return adixVar;
    }

    public static adix F(adix adixVar, adiz... adizVarArr) {
        return E(adixVar, Arrays.asList(adizVarArr));
    }

    public static Object G(aesy aesyVar, Object obj, BiFunction biFunction) {
        biFunction.getClass();
        Object obj2 = aesyVar.get(obj);
        boolean z = obj2 != null || aesyVar.containsKey(obj);
        if (true != z) {
            obj2 = null;
        }
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply != null) {
            aesyVar.put(obj, objApply);
            return objApply;
        }
        if (z) {
            aesyVar.remove(obj);
        }
        return null;
    }

    public static Object H(aesy aesyVar, Object obj, BiFunction biFunction) {
        biFunction.getClass();
        Object obj2 = aesyVar.get(obj);
        if (obj2 == null && !aesyVar.containsKey(obj)) {
            return null;
        }
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply == null) {
            aesyVar.remove(obj);
            return null;
        }
        aesyVar.put(obj, objApply);
        return objApply;
    }

    public static Object I(aesy aesyVar, Object obj, Object obj2, BiFunction biFunction) {
        biFunction.getClass();
        obj2.getClass();
        Object obj3 = aesyVar.get(obj);
        if ((obj3 != null || aesyVar.containsKey(obj)) && (obj2 = biFunction.apply(obj3, obj2)) == null) {
            aesyVar.remove(obj);
            return null;
        }
        aesyVar.put(obj, obj2);
        return obj2;
    }

    public static Object J(aesy aesyVar, Object obj, Object obj2) {
        Object obj3 = aesyVar.get(obj);
        if (obj3 != null || aesyVar.containsKey(obj)) {
            return obj3;
        }
        aesyVar.put(obj, obj2);
        return null;
    }

    public static Object K(aesy aesyVar, Object obj, Object obj2) {
        if (aesyVar.containsKey(obj)) {
            return aesyVar.put(obj, obj2);
        }
        return null;
    }

    public static boolean L(aesy aesyVar, Object obj, Object obj2) {
        Object obj3 = aesyVar.get(obj);
        if (!Objects.equals(obj3, obj2)) {
            return false;
        }
        if (obj3 == null && !aesyVar.containsKey(obj)) {
            return false;
        }
        aesyVar.remove(obj);
        return true;
    }

    public static boolean M(aesy aesyVar, Object obj, Object obj2, Object obj3) {
        Object obj4 = aesyVar.get(obj);
        if (!Objects.equals(obj4, obj2)) {
            return false;
        }
        if (obj4 == null && !aesyVar.containsKey(obj)) {
            return false;
        }
        aesyVar.put(obj, obj3);
        return true;
    }

    public static Object N() {
        throw new UnsupportedOperationException();
    }

    public static Object O() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static Integer P(aert aertVar, Object obj, Integer num) {
        return (Integer) Map.CC.$default$getOrDefault(aertVar, obj, num);
    }

    @Deprecated
    public static Integer Q(aert aertVar, Object obj, Integer num, BiFunction biFunction) {
        return (Integer) Map.CC.$default$merge(aertVar, obj, num, biFunction);
    }

    @Deprecated
    public static Integer R(aert aertVar, Object obj, Integer num) {
        return (Integer) Map.CC.$default$putIfAbsent(aertVar, obj, num);
    }

    @Deprecated
    public static Integer S(aert aertVar, Object obj, Integer num) {
        return (Integer) Map.CC.$default$replace(aertVar, obj, num);
    }

    public static void Y(aert aertVar, final BiConsumer biConsumer) {
        aeum aeumVarP = aertVar.p();
        Consumer consumer = new Consumer() { // from class: aerr
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aers aersVar = (aers) obj;
                biConsumer.accept(aersVar.getKey(), Integer.valueOf(aersVar.a()));
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        if (!(aeumVarP instanceof aese)) {
            Iterable$EL.forEach(aeumVarP, consumer);
            return;
        }
        aesj aesjVar = ((aese) aeumVarP).a;
        aesd aesdVar = new aesd(aesjVar);
        if (aesjVar.d) {
            aesdVar.a = aesjVar.e;
            consumer.accept(aesdVar);
        }
        Object[] objArr = aesjVar.a;
        int i = aesjVar.e;
        while (i != 0) {
            i--;
            if (objArr[i] != null) {
                aesdVar.a = i;
                consumer.accept(aesdVar);
            }
        }
    }

    @Deprecated
    public static Object aB(aene aeneVar, Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((Long) obj).longValue();
        Object objP = aeneVar.p(jLongValue);
        if (objP != null || aeneVar.c(jLongValue)) {
            return objP;
        }
        return null;
    }

    @Deprecated
    public static Object aC(aene aeneVar, Long l, Object obj) {
        long jLongValue = l.longValue();
        boolean zC = aeneVar.c(jLongValue);
        Object objA = aeneVar.a(jLongValue, obj);
        if (zC) {
            return objA;
        }
        return null;
    }

    @Deprecated
    public static Object aD(aene aeneVar, Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((Long) obj).longValue();
        if (aeneVar.c(jLongValue)) {
            return aeneVar.b(jLongValue);
        }
        return null;
    }

    @Deprecated
    public static boolean aE(aene aeneVar, Object obj) {
        if (obj == null) {
            return false;
        }
        return aeneVar.c(((Long) obj).longValue());
    }

    @Deprecated
    public static Long aF(aemo aemoVar, Long l, BiFunction biFunction) {
        return (Long) Map.CC.$default$compute(aemoVar, l, biFunction);
    }

    @Deprecated
    public static Long aG(aemo aemoVar, Long l, Function function) {
        return (Long) Map.CC.$default$computeIfAbsent(aemoVar, l, function);
    }

    @Deprecated
    public static Long aH(aemo aemoVar, Long l, BiFunction biFunction) {
        return (Long) Map.CC.$default$computeIfPresent(aemoVar, l, biFunction);
    }

    @Deprecated
    public static Long aI(aemo aemoVar, Object obj, Long l) {
        return (Long) Map.CC.$default$getOrDefault(aemoVar, obj, l);
    }

    @Deprecated
    public static Long aJ(aemo aemoVar, Long l, Long l2, BiFunction biFunction) {
        return (Long) Map.CC.$default$merge(aemoVar, l, l2, biFunction);
    }

    @Deprecated
    public static Long aK(aemo aemoVar, Long l, Long l2) {
        return (Long) Map.CC.$default$putIfAbsent(aemoVar, l, l2);
    }

    @Deprecated
    public static Long aL(aemo aemoVar, Long l, Long l2) {
        return (Long) Map.CC.$default$replace(aemoVar, l, l2);
    }

    public static void aT(aemo aemoVar, final BiConsumer biConsumer) {
        aeum aeumVarU = aemoVar.u();
        Consumer consumer = new Consumer() { // from class: aemn
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aemx aemxVar = (aemx) obj;
                biConsumer.accept(Long.valueOf(aemxVar.a()), Long.valueOf(aemxVar.b()));
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        if (!(aeumVarU instanceof aemy)) {
            Iterable$EL.forEach(aeumVarU, consumer);
            return;
        }
        aend aendVar = ((aemy) aeumVarU).a;
        aemx aemxVar = new aemx(aendVar);
        if (aendVar.e) {
            aemxVar.a = aendVar.f;
            consumer.accept(aemxVar);
        }
        long[] jArr = aendVar.b;
        int i = aendVar.f;
        while (i != 0) {
            i--;
            if (jArr[i] != 0) {
                aemxVar.a = i;
                consumer.accept(aemxVar);
            }
        }
    }

    @Deprecated
    public static boolean aU(aemo aemoVar, Object obj) {
        if (obj == null) {
            return false;
        }
        return aemoVar.r(((Long) obj).longValue());
    }

    @Deprecated
    public static Long aW(aemj aemjVar, Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((Long) obj).longValue();
        long jT = aemjVar.t(jLongValue);
        if (jT != aemjVar.a() || aemjVar.e(jLongValue)) {
            return Long.valueOf(jT);
        }
        return null;
    }

    @Deprecated
    public static Long aX(aemj aemjVar, Long l, Long l2) {
        long jLongValue = l.longValue();
        boolean zE = aemjVar.e(jLongValue);
        long jB = aemjVar.b(jLongValue, l2.longValue());
        if (zE) {
            return Long.valueOf(jB);
        }
        return null;
    }

    @Deprecated
    public static Long aY(aemj aemjVar, Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((Long) obj).longValue();
        if (aemjVar.e(jLongValue)) {
            return Long.valueOf(aemjVar.c(jLongValue));
        }
        return null;
    }

    @Deprecated
    public static boolean aZ(aemj aemjVar, Object obj) {
        if (obj == null) {
            return false;
        }
        return aemjVar.e(((Long) obj).longValue());
    }

    public static void aa() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static Integer ab(aern aernVar, Object obj) {
        int iO = aernVar.o(obj);
        if (iO == 0) {
            if (!aernVar.containsKey(obj)) {
                return null;
            }
            iO = 0;
        }
        return Integer.valueOf(iO);
    }

    @Deprecated
    public static Integer ac(aern aernVar, Object obj, Integer num) {
        boolean zContainsKey = aernVar.containsKey(obj);
        int iA = aernVar.a(obj, num.intValue());
        if (zContainsKey) {
            return Integer.valueOf(iA);
        }
        return null;
    }

    @Deprecated
    public static Integer ad(aern aernVar, Object obj) {
        if (aernVar.containsKey(obj)) {
            return Integer.valueOf(aernVar.b(obj));
        }
        return null;
    }

    @Deprecated
    public static void ae(aeqd aeqdVar, Consumer consumer) {
        LongConsumer aeqcVar;
        if (a$$ExternalSyntheticApiModelOutline3.m49m((Object) consumer)) {
            aeqcVar = a$$ExternalSyntheticApiModelOutline3.m42m((Object) consumer);
        } else {
            consumer.getClass();
            aeqcVar = new aeqc(consumer);
        }
        aeqdVar.forEachRemaining(aeqcVar);
    }

    @Deprecated
    public static boolean af(aeqd aeqdVar, Consumer consumer) {
        LongConsumer aeqcVar;
        if (a$$ExternalSyntheticApiModelOutline3.m49m((Object) consumer)) {
            aeqcVar = a$$ExternalSyntheticApiModelOutline3.m42m((Object) consumer);
        } else {
            consumer.getClass();
            aeqcVar = new aeqc(consumer);
        }
        return aeqdVar.tryAdvance(aeqcVar);
    }

    public static aepf ag() {
        throw new IllegalStateException();
    }

    @Deprecated
    public static void ah(aept aeptVar, Long l) {
        aeptVar.c(l.longValue());
    }

    @Deprecated
    public static void aj(aept aeptVar, Long l) {
        aeptVar.e(l.longValue());
    }

    public static void al() {
        throw new UnsupportedOperationException();
    }

    public static void am() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static Long an(aepm aepmVar) {
        return Long.valueOf(aepmVar.nextLong());
    }

    @Deprecated
    public static void ao(aepm aepmVar, final Consumer consumer) {
        LongConsumer longConsumerM42m;
        if (a$$ExternalSyntheticApiModelOutline3.m49m((Object) consumer)) {
            longConsumerM42m = a$$ExternalSyntheticApiModelOutline3.m42m((Object) consumer);
        } else {
            consumer.getClass();
            longConsumerM42m = new LongConsumer() { // from class: aepl
                @Override // java.util.function.LongConsumer
                public final void accept(long j) {
                    consumer.accept(Long.valueOf(j));
                }

                public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
                    return LongConsumer$CC.$default$andThen(this, longConsumer);
                }
            };
        }
        aepmVar.forEachRemaining(longConsumerM42m);
    }

    @Deprecated
    public static int ap(aepf aepfVar, Long l, Long l2) {
        return aepfVar.a(l.longValue(), l2.longValue());
    }

    public static Comparator ar(aepf aepfVar, Comparator comparator) {
        return comparator instanceof aepf ? aepfVar.c((aepf) comparator) : Comparator.CC.$default$thenComparing(aepfVar, comparator);
    }

    @Deprecated
    public static boolean as(aepb aepbVar, Long l) {
        return aepbVar.c(l.longValue());
    }

    @Deprecated
    public static boolean at(aepb aepbVar, final Predicate predicate) {
        return aepbVar.i(a$$ExternalSyntheticApiModelOutline3.m$1(predicate) ? a$$ExternalSyntheticApiModelOutline3.m43m((Object) predicate) : new LongPredicate() { // from class: aepa
            public final /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
                return LongPredicate$CC.$default$and(this, longPredicate);
            }

            public final /* synthetic */ LongPredicate negate() {
                return LongPredicate$CC.$default$negate(this);
            }

            public final /* synthetic */ LongPredicate or(LongPredicate longPredicate) {
                return LongPredicate$CC.$default$or(this, longPredicate);
            }

            @Override // java.util.function.LongPredicate
            public final boolean test(long j) {
                return predicate.test(Long.valueOf(j));
            }
        });
    }

    @Deprecated
    public static Long au(aeoz aeozVar) {
        return Long.valueOf(aeozVar.a());
    }

    @Deprecated
    public static Object aw(aenw aenwVar, Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((Long) obj).longValue();
        Object objH = aenwVar.h(jLongValue);
        if (objH != null || aenwVar.c(jLongValue)) {
            return objH;
        }
        return null;
    }

    @Deprecated
    public static Object ax(aenw aenwVar, Long l, Object obj) {
        long jLongValue = l.longValue();
        boolean zC = aenwVar.c(jLongValue);
        Object objA = aenwVar.a(jLongValue, obj);
        if (zC) {
            return objA;
        }
        return null;
    }

    @Deprecated
    public static Object ay(aenw aenwVar, Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((Long) obj).longValue();
        if (aenwVar.c(jLongValue)) {
            return aenwVar.b(jLongValue);
        }
        return null;
    }

    @Deprecated
    public static boolean az(aenw aenwVar, Object obj) {
        if (obj == null) {
            return false;
        }
        return aenwVar.c(((Long) obj).longValue());
    }

    public static Context p(Context context, UserHandle userHandle) throws ReflectiveOperationException {
        if (a == null) {
            synchronized (adqq.class) {
                if (a == null) {
                    a = Context.class.getMethod("createContextAsUser", UserHandle.class, Integer.TYPE);
                }
            }
        }
        return (Context) a.invoke(context, userHandle, 0);
    }

    public static Boolean r(java.util.Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static Double s(java.util.Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Integer t(java.util.Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d = (Double) obj;
        int iIntValue = d.intValue();
        if (iIntValue == d.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        java.util.Objects.toString(d);
        throw new ClassCastException("Number expected to be integer: ".concat(String.valueOf(d)));
    }

    public static Long u(java.util.Map map, String str) throws NumberFormatException, ParseException {
        boolean z;
        int iCharAt;
        String strV = v(map, str);
        if (strV == null) {
            return null;
        }
        try {
            if (strV.isEmpty() || strV.charAt(strV.length() - 1) != 's') {
                throw new ParseException("Invalid duration string: ".concat(strV), 0);
            }
            if (strV.charAt(0) == '-') {
                strV = strV.substring(1);
                z = true;
            } else {
                z = false;
            }
            String strSubstring = strV.substring(0, strV.length() - 1);
            String strSubstring2 = "";
            int iIndexOf = strSubstring.indexOf(46);
            if (iIndexOf != -1) {
                strSubstring2 = strSubstring.substring(iIndexOf + 1);
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            long jA = Long.parseLong(strSubstring);
            if (strSubstring2.isEmpty()) {
                iCharAt = 0;
            } else {
                iCharAt = 0;
                for (int i = 0; i < 9; i++) {
                    iCharAt *= 10;
                    if (i < strSubstring2.length()) {
                        if (strSubstring2.charAt(i) < '0' || strSubstring2.charAt(i) > '9') {
                            throw new ParseException("Invalid nanoseconds.", 0);
                        }
                        iCharAt += strSubstring2.charAt(i) - '0';
                    }
                }
            }
            if (jA < 0) {
                throw new ParseException("Invalid duration string: ".concat(String.valueOf(strV)), 0);
            }
            if (z) {
                jA = -jA;
                iCharAt = -iCharAt;
            }
            if (iCharAt <= -1000000000 || iCharAt >= 1000000000) {
                try {
                    jA = a.A(jA, iCharAt / 1000000000);
                    iCharAt %= 1000000000;
                } catch (IllegalArgumentException unused) {
                    throw new ParseException("Duration value is out of range.", 0);
                }
            }
            if (jA > 0 && iCharAt < 0) {
                iCharAt += 1000000000;
                jA--;
            }
            if (jA < 0 && iCharAt > 0) {
                iCharAt -= 1000000000;
                jA++;
            }
            if (!a.o(jA, iCharAt)) {
                throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(jA), Integer.valueOf(iCharAt)));
            }
            long nanos = TimeUnit.SECONDS.toNanos(jA);
            long j = iCharAt;
            long j2 = nanos + j;
            if (!(((nanos ^ j2) >= 0) | ((j ^ nanos) < 0))) {
                j2 = ((j2 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
            return Long.valueOf(j2);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static String v(java.util.Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static List w(java.util.Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List x(java.util.Map map, String str) {
        List listW = w(map, str);
        if (listW == null) {
            return null;
        }
        A(listW);
        return listW;
    }

    public static List y(java.util.Map map, String str) {
        List listW = w(map, str);
        if (listW == null) {
            return null;
        }
        for (int i = 0; i < listW.size(); i++) {
            if (!(listW.get(i) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listW.get(i), Integer.valueOf(i), listW));
            }
        }
        return listW;
    }

    public static java.util.Map z(java.util.Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof java.util.Map) {
            return (java.util.Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public void a(adnq adnqVar, admc admcVar) {
        throw null;
    }

    public void b(adqq adqqVar, admc admcVar) {
        throw null;
    }

    public adjb bd() {
        throw null;
    }

    public void g(Object obj) {
        throw null;
    }

    public final synchronized void q() {
    }

    public adqq(char[] cArr, byte[] bArr) {
    }

    public void h() {
    }

    public void j() {
    }

    public void be(admc admcVar) {
    }

    public void d(long j) {
    }

    public void e(long j) {
    }

    public void m(int i) {
    }

    public void n(Object obj) {
    }

    public void i(String str, Throwable th) {
    }
}
