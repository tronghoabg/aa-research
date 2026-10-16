package defpackage;

import android.os.Parcel;
import j$.util.Comparator;
import j$.util.Map;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* loaded from: classes.dex */
public class adqs {
    public adqs(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this(null, null);
    }

    @Deprecated
    public static boolean A(aeze aezeVar, Consumer consumer) {
        aeys aezdVar;
        if (consumer instanceof aeys) {
            aezdVar = (aeys) consumer;
        } else {
            consumer.getClass();
            aezdVar = new aezd(consumer);
        }
        return aezeVar.tryAdvance((aeze) aezdVar);
    }

    public static aeyk B() {
        throw new IllegalStateException();
    }

    public static aezc C(aezc aezcVar, aezc aezcVar2) {
        aezcVar2.getClass();
        return new aeyz(aezcVar, aezcVar2, 0);
    }

    public static aezc D(aezc aezcVar, IntPredicate intPredicate) {
        aezc aezaVar;
        if (intPredicate instanceof aezc) {
            aezaVar = (aezc) intPredicate;
        } else {
            intPredicate.getClass();
            aezaVar = new aeza(intPredicate);
        }
        return aezcVar.a(aezaVar);
    }

    public static aezc E(aezc aezcVar, aezc aezcVar2) {
        aezcVar2.getClass();
        return new aeyz(aezcVar, aezcVar2, 1);
    }

    public static aezc F(aezc aezcVar, IntPredicate intPredicate) {
        aezc aezaVar;
        if (intPredicate instanceof aezc) {
            aezaVar = (aezc) intPredicate;
        } else {
            intPredicate.getClass();
            aezaVar = new aeza(intPredicate);
        }
        return aezcVar.b(aezaVar);
    }

    @Deprecated
    public static boolean G(aezc aezcVar, int i) {
        n(i);
        return aezcVar.d((short) i);
    }

    @Deprecated
    public static boolean I(aezc aezcVar, Short sh) {
        return aezcVar.d(sh.shortValue());
    }

    @Deprecated
    public static void K(aeyy aeyyVar, Short sh) {
        aeyyVar.g(sh.shortValue());
    }

    @Deprecated
    public static void M(aeyy aeyyVar, Short sh) {
        aeyyVar.i(sh.shortValue());
    }

    @Deprecated
    public static Short N(aeyu aeyuVar) {
        return Short.valueOf(aeyuVar.d());
    }

    @Deprecated
    public static void P(aeyu aeyuVar, final Consumer consumer) {
        aeys aeysVar;
        if (consumer instanceof aeys) {
            aeysVar = (aeys) consumer;
        } else {
            consumer.getClass();
            aeysVar = new aeys() { // from class: aeyt
                @Override // defpackage.aeys
                public final /* synthetic */ aeys a(aeys aeysVar2) {
                    return adqs.Q(this, aeysVar2);
                }

                @Override // java.util.function.IntConsumer
                public final /* synthetic */ void accept(int i) {
                    adqs.S(this, i);
                }

                @Override // java.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }

                @Override // defpackage.aeys
                public final /* synthetic */ void b(Short sh) {
                    adqs.U(this, sh);
                }

                @Override // defpackage.aeys
                public final void c(short s) {
                    consumer.accept(Short.valueOf(s));
                }

                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    b((Short) obj);
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return adqs.R(this, intConsumer);
                }
            };
        }
        aeyuVar.b(aeysVar);
    }

    public static aeys Q(final aeys aeysVar, final aeys aeysVar2) {
        aeysVar2.getClass();
        return new aeys() { // from class: aeyr
            @Override // defpackage.aeys
            public final /* synthetic */ aeys a(aeys aeysVar3) {
                return adqs.Q(this, aeysVar3);
            }

            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i) {
                adqs.S(this, i);
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }

            @Override // defpackage.aeys
            public final /* synthetic */ void b(Short sh) {
                adqs.U(this, sh);
            }

            @Override // defpackage.aeys
            public final void c(short s) {
                aeysVar.c(s);
                aeysVar2.c(s);
            }

            @Override // java.util.function.Consumer
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                b((Short) obj);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return adqs.R(this, intConsumer);
            }
        };
    }

    public static aeys R(aeys aeysVar, final IntConsumer intConsumer) {
        aeys aeysVar2;
        if (intConsumer instanceof aeys) {
            aeysVar2 = (aeys) intConsumer;
        } else {
            intConsumer.getClass();
            aeysVar2 = new aeys() { // from class: aeyq
                @Override // defpackage.aeys
                public final /* synthetic */ aeys a(aeys aeysVar3) {
                    return adqs.Q(this, aeysVar3);
                }

                @Override // java.util.function.IntConsumer
                public final /* synthetic */ void accept(int i) {
                    adqs.S(this, i);
                }

                @Override // java.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }

                @Override // defpackage.aeys
                public final /* synthetic */ void b(Short sh) {
                    adqs.U(this, sh);
                }

                @Override // defpackage.aeys
                public final void c(short s) {
                    intConsumer.accept(s);
                }

                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    b((Short) obj);
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return adqs.R(this, intConsumer2);
                }
            };
        }
        return aeysVar.a(aeysVar2);
    }

    @Deprecated
    public static void S(aeys aeysVar, int i) {
        n(i);
        aeysVar.c((short) i);
    }

    @Deprecated
    public static void U(aeys aeysVar, Short sh) {
        aeysVar.c(sh.shortValue());
    }

    @Deprecated
    public static int W(aeyk aeykVar, Short sh, Short sh2) {
        return aeykVar.b(sh.shortValue(), sh2.shortValue());
    }

    public static Comparator X(aeyk aeykVar, Comparator comparator) {
        return comparator instanceof aeyk ? aeykVar.c((aeyk) comparator) : Comparator.CC.$default$thenComparing(aeykVar, comparator);
    }

    @Deprecated
    public static Short Y(aeyg aeygVar) {
        return Short.valueOf(aeygVar.e());
    }

    public static Object Z(aewp aewpVar, Object obj, BiFunction biFunction) {
        biFunction.getClass();
        Object obj2 = aewpVar.get(obj);
        boolean z = obj2 != null || aewpVar.containsKey(obj);
        if (true != z) {
            obj2 = null;
        }
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply != null) {
            aewpVar.put(obj, objApply);
            return objApply;
        }
        if (z) {
            aewpVar.remove(obj);
        }
        return null;
    }

    @Deprecated
    public static Integer aA(aeva aevaVar, Object obj, Integer num) {
        boolean zContainsKey = aevaVar.containsKey(obj);
        int iA = aevaVar.a(obj, num.intValue());
        if (zContainsKey) {
            return Integer.valueOf(iA);
        }
        return null;
    }

    @Deprecated
    public static Integer aB(aeva aevaVar, Object obj) {
        if (aevaVar.containsKey(obj)) {
            return Integer.valueOf(aevaVar.b(obj));
        }
        return null;
    }

    public static void aC() {
        throw new UnsupportedOperationException();
    }

    public static void aD() {
        throw new UnsupportedOperationException();
    }

    public static void aE() {
        throw new UnsupportedOperationException();
    }

    public static Object aa(aewp aewpVar, Object obj, BiFunction biFunction) {
        biFunction.getClass();
        Object obj2 = aewpVar.get(obj);
        if (obj2 == null && !aewpVar.containsKey(obj)) {
            return null;
        }
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply == null) {
            aewpVar.remove(obj);
            return null;
        }
        aewpVar.put(obj, objApply);
        return objApply;
    }

    public static Object ab(aewp aewpVar, Object obj, Object obj2, BiFunction biFunction) {
        biFunction.getClass();
        obj2.getClass();
        Object obj3 = aewpVar.get(obj);
        if ((obj3 != null || aewpVar.containsKey(obj)) && (obj2 = biFunction.apply(obj3, obj2)) == null) {
            aewpVar.remove(obj);
            return null;
        }
        aewpVar.put(obj, obj2);
        return obj2;
    }

    public static Object ac(aewp aewpVar, Object obj, Object obj2) {
        Object obj3 = aewpVar.get(obj);
        if (obj3 != null || aewpVar.containsKey(obj)) {
            return obj3;
        }
        aewpVar.put(obj, obj2);
        return null;
    }

    public static Object ad(aewp aewpVar, Object obj, Object obj2) {
        if (aewpVar.containsKey(obj)) {
            return aewpVar.put(obj, obj2);
        }
        return null;
    }

    public static boolean ae(aewp aewpVar, Object obj, Object obj2) {
        Object obj3 = aewpVar.get(obj);
        if (obj3 != obj2) {
            return false;
        }
        if (obj3 == null && !aewpVar.containsKey(obj)) {
            return false;
        }
        aewpVar.remove(obj);
        return true;
    }

    public static boolean af(aewp aewpVar, Object obj, Object obj2, Object obj3) {
        Object obj4 = aewpVar.get(obj);
        if (obj4 != obj2) {
            return false;
        }
        if (obj4 == null && !aewpVar.containsKey(obj)) {
            return false;
        }
        aewpVar.put(obj, obj3);
        return true;
    }

    public static Object ag() {
        throw new UnsupportedOperationException();
    }

    public static Object ah() {
        throw new UnsupportedOperationException();
    }

    public static Object ai(aevy aevyVar, Object obj, BiFunction biFunction) {
        biFunction.getClass();
        Object obj2 = aevyVar.get(obj);
        boolean z = obj2 != null || aevyVar.containsKey(obj);
        if (true != z) {
            obj2 = null;
        }
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply != null) {
            aevyVar.put(obj, objApply);
            return objApply;
        }
        if (z) {
            aevyVar.remove(obj);
        }
        return null;
    }

    public static Object aj(aevy aevyVar, Object obj, BiFunction biFunction) {
        biFunction.getClass();
        Object obj2 = aevyVar.get(obj);
        if (obj2 == null && !aevyVar.containsKey(obj)) {
            return null;
        }
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply == null) {
            aevyVar.remove(obj);
            return null;
        }
        aevyVar.put(obj, objApply);
        return objApply;
    }

    public static Object ak(aevy aevyVar, Object obj, Object obj2, BiFunction biFunction) {
        biFunction.getClass();
        obj2.getClass();
        Object obj3 = aevyVar.get(obj);
        if ((obj3 != null || aevyVar.containsKey(obj)) && (obj2 = biFunction.apply(obj3, obj2)) == null) {
            aevyVar.remove(obj);
            return null;
        }
        aevyVar.put(obj, obj2);
        return obj2;
    }

    public static Object al(aevy aevyVar, Object obj, Object obj2) {
        Object obj3 = aevyVar.get(obj);
        if (obj3 != null || aevyVar.containsKey(obj)) {
            return obj3;
        }
        aevyVar.put(obj, obj2);
        return null;
    }

    public static Object am(aevy aevyVar, Object obj, Object obj2) {
        if (aevyVar.containsKey(obj)) {
            return aevyVar.put(obj, obj2);
        }
        return null;
    }

    public static boolean an(aevy aevyVar, Object obj, Object obj2) {
        Object obj3 = aevyVar.get(obj);
        if (!Objects.equals(obj3, obj2)) {
            return false;
        }
        if (obj3 == null && !aevyVar.containsKey(obj)) {
            return false;
        }
        aevyVar.remove(obj);
        return true;
    }

    public static boolean ao(aevy aevyVar, Object obj, Object obj2, Object obj3) {
        Object obj4 = aevyVar.get(obj);
        if (!Objects.equals(obj4, obj2)) {
            return false;
        }
        if (obj4 == null && !aevyVar.containsKey(obj)) {
            return false;
        }
        aevyVar.put(obj, obj3);
        return true;
    }

    public static Object ap() {
        throw new UnsupportedOperationException();
    }

    public static Object aq() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static Integer ar(aeve aeveVar, Object obj, Integer num, BiFunction biFunction) {
        return (Integer) Map.CC.$default$merge(aeveVar, obj, num, biFunction);
    }

    @Deprecated
    public static Integer as(aeve aeveVar, Object obj, Integer num) {
        return (Integer) Map.CC.$default$putIfAbsent(aeveVar, obj, num);
    }

    @Deprecated
    public static Integer at(aeve aeveVar, Object obj, Integer num) {
        return (Integer) Map.CC.$default$replace(aeveVar, obj, num);
    }

    @Deprecated
    public static Integer az(aeva aevaVar, Object obj) {
        int iO = aevaVar.o(obj);
        if (iO == 0) {
            if (!aevaVar.containsKey(obj)) {
                return null;
            }
            iO = 0;
        }
        return Integer.valueOf(iO);
    }

    static int h(Parcel parcel, adnq adnqVar) {
        int i = adnqVar.p.r;
        String strSubstring = adnqVar.q;
        if (strSubstring != null && strSubstring.length() > 1000) {
            strSubstring = strSubstring.substring(0, 1000);
        }
        int i2 = i << 16;
        if (strSubstring == null) {
            return i2;
        }
        int i3 = i2 | 32;
        parcel.writeString(strSubstring);
        return i3;
    }

    static adnq i(int i, Parcel parcel) {
        int i2 = i >> 16;
        int i3 = i & 32;
        adnq adnqVarB = adnq.b(i2 & 255);
        return i3 != 0 ? adnqVarB.e(parcel.readString()) : adnqVarB;
    }

    static void j(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(0);
        parcel.writeInt(i);
        parcel.setDataPosition(iDataPosition);
    }

    static boolean k(int i, int i2) {
        return (i & i2) != 0;
    }

    public static advc l() {
        return adxn.a == null ? new adxn() : new adrp();
    }

    public static void m(int i) {
        if (i < -128 || i > 127) {
            throw new IllegalArgumentException(i + " can't be represented as byte (out of range)");
        }
    }

    public static void n(int i) {
        if (i < -32768 || i > 32767) {
            throw new IllegalArgumentException(i + " can't be represented as short (out of range)");
        }
    }

    public static boolean o(aejp aejpVar) {
        return aejpVar.b == 0;
    }

    public static int p(int i, float f) {
        long jMax = Math.max(2L, 1 << (64 - Long.numberOfLeadingZeros(((long) Math.ceil(i / f)) - 1)));
        if (jMax <= 1073741824) {
            return (int) jMax;
        }
        throw new IllegalArgumentException("Too large (" + i + " expected elements with load factor " + f + ")");
    }

    public static int q(int i, float f) {
        return Math.min((int) Math.ceil(i * f), i - 1);
    }

    public static void r(int i, int i2, int i3) {
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.bn(i2, "Start index (", ") is negative"));
        }
        if (i2 > i3) {
            throw new IllegalArgumentException(a.bB(i3, i2, "Start index (", ") is greater than end index (", ")"));
        }
        if (i3 > i) {
            throw new ArrayIndexOutOfBoundsException(a.bB(i, i3, "End index (", ") is greater than array length (", ")"));
        }
    }

    public static void s(int i, int i2, int i3) {
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.bn(i2, "Offset (", ") is negative"));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(a.bn(i3, "Length (", ") is negative"));
        }
        if (i3 <= i - i2) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Last index (" + (i2 + i3) + ") is greater than array length (" + i + ")");
    }

    public static void t(admf admfVar, adnh adnhVar, String str, java.util.Map map) {
        aebg aebgVar = new aebg(admfVar, adnhVar, null);
        admf admfVar2 = (admf) aebgVar.a;
        String str2 = admfVar2.b;
        woy.W("wireless.android.auto.proto.assistant.CarAssistantCallbacksService".equals(admfVar2.c), "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", "wireless.android.auto.proto.assistant.CarAssistantCallbacksService", str2);
        woy.ad(!map.containsKey(str2), "Method by same name already registered: %s", str2);
        map.put(str2, aebgVar);
    }

    public static void v() {
        Iterator it = ajlp.o().h().iterator();
        while (it.hasNext()) {
            ((adjg) it.next()).a();
        }
    }

    public static void w() {
        ajlp.o().i();
    }

    public static String x(File file) {
        String name = file.getName();
        name.getClass();
        return afyh.p(name, '.', "");
    }

    public static void y(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            if (afdk.a()) {
                th.addSuppressed(th2);
                return;
            }
            Method method = afdi.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    @Deprecated
    public static void z(aeze aezeVar, Consumer consumer) {
        aeys aezdVar;
        if (consumer instanceof aeys) {
            aezdVar = (aeys) consumer;
        } else {
            consumer.getClass();
            aezdVar = new aezd(consumer);
        }
        aezeVar.forEachRemaining((aeze) aezdVar);
    }

    public void a(adni adniVar) {
        throw null;
    }

    public adnq u(admp admpVar) {
        throw null;
    }

    public adqs(byte[] bArr, byte[] bArr2) {
    }

    private adqs() {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public void f() {
    }

    public void e(Object obj) {
    }
}
