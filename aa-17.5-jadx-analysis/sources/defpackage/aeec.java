package defpackage;

import j$.util.Map;
import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* loaded from: classes.dex */
public final class aeec {
    @Deprecated
    public static Integer A(aels aelsVar, Long l, Integer num) {
        return (Integer) Map.CC.$default$replace(aelsVar, l, num);
    }

    @Deprecated
    public static Integer J(aelo aeloVar, Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((Long) obj).longValue();
        int iS = aeloVar.s(jLongValue);
        if (iS == 0) {
            if (!aeloVar.d(jLongValue)) {
                return null;
            }
            iS = 0;
        }
        return Integer.valueOf(iS);
    }

    @Deprecated
    public static Integer K(aelo aeloVar, Long l, Integer num) {
        long jLongValue = l.longValue();
        boolean zD = aeloVar.d(jLongValue);
        int iA = aeloVar.a(jLongValue, num.intValue());
        if (zD) {
            return Integer.valueOf(iA);
        }
        return null;
    }

    @Deprecated
    public static Integer L(aelo aeloVar, Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((Long) obj).longValue();
        if (aeloVar.d(jLongValue)) {
            return Integer.valueOf(aeloVar.b(jLongValue));
        }
        return null;
    }

    @Deprecated
    public static boolean M(aelo aeloVar, Object obj) {
        if (obj == null) {
            return false;
        }
        return aeloVar.d(((Long) obj).longValue());
    }

    public static /* synthetic */ void N() {
        throw new NoSuchMethodError();
    }

    @Deprecated
    public static void O(aekm aekmVar, Consumer consumer) {
        IntConsumer aeklVar;
        if (a$$ExternalSyntheticApiModelOutline3.m$3(consumer)) {
            aeklVar = a$$ExternalSyntheticApiModelOutline3.m40m((Object) consumer);
        } else {
            consumer.getClass();
            aeklVar = new aekl(consumer);
        }
        aekmVar.forEachRemaining(aeklVar);
    }

    @Deprecated
    public static boolean P(aekm aekmVar, Consumer consumer) {
        IntConsumer aeklVar;
        if (a$$ExternalSyntheticApiModelOutline3.m$3(consumer)) {
            aeklVar = a$$ExternalSyntheticApiModelOutline3.m40m((Object) consumer);
        } else {
            consumer.getClass();
            aeklVar = new aekl(consumer);
        }
        return aekmVar.tryAdvance(aeklVar);
    }

    public static void Q() {
        throw new IllegalStateException();
    }

    @Deprecated
    public static void R(aekb aekbVar, Integer num) {
        aekbVar.c(num.intValue());
    }

    @Deprecated
    public static void T(aekb aekbVar, Integer num) {
        aekbVar.e(num.intValue());
    }

    public static void V() {
        throw new UnsupportedOperationException();
    }

    public static void W() {
        throw new UnsupportedOperationException();
    }

    public static void X() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static Integer Y(aeka aekaVar, int i) {
        return Integer.valueOf(aekaVar.m(i));
    }

    @Deprecated
    public static Integer Z(aejr aejrVar) {
        return Integer.valueOf(aejrVar.nextInt());
    }

    public static void a(admf admfVar, aedp aedpVar) {
        aedpVar.b(new adnt(adnq.k.e(String.format("Method %s is unimplemented", admfVar.b)), null));
    }

    @Deprecated
    public static void aa(aejr aejrVar, final Consumer consumer) {
        IntConsumer intConsumerM40m;
        if (a$$ExternalSyntheticApiModelOutline3.m$3(consumer)) {
            intConsumerM40m = a$$ExternalSyntheticApiModelOutline3.m40m((Object) consumer);
        } else {
            consumer.getClass();
            intConsumerM40m = new IntConsumer() { // from class: aejq
                @Override // java.util.function.IntConsumer
                public final void accept(int i) {
                    consumer.accept(Integer.valueOf(i));
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return IntConsumer$CC.$default$andThen(this, intConsumer);
                }
            };
        }
        aejrVar.forEachRemaining(intConsumerM40m);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    public static final void ab(String str, String str2, erb erbVar) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str));
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        for (int i3 = 0; i3 < str2.length(); i3++) {
            char cCharAt2 = str2.charAt(i3);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i3), str2));
            }
        }
        while (true) {
            ?? r1 = erbVar.a;
            if (i >= r1.size()) {
                r1.add(str);
                r1.add(str2.trim());
                return;
            } else {
                if (str.equalsIgnoreCase((String) r1.get(i))) {
                    r1.remove(i);
                    r1.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }
    }

    public static aefw b(aefw aefwVar, aefw aefwVar2) {
        aefwVar2.getClass();
        return new aefv(aefwVar, aefwVar2, 0);
    }

    public static aefw c(aefw aefwVar, IntPredicate intPredicate) {
        aefw aefuVar;
        if (intPredicate instanceof aefw) {
            aefuVar = (aefw) intPredicate;
        } else {
            intPredicate.getClass();
            aefuVar = new aefu(intPredicate);
        }
        return aefwVar.a(aefuVar);
    }

    public static aefw d(aefw aefwVar, aefw aefwVar2) {
        aefwVar2.getClass();
        return new aefv(aefwVar, aefwVar2, 1);
    }

    public static aefw e(aefw aefwVar, IntPredicate intPredicate) {
        aefw aefuVar;
        if (intPredicate instanceof aefw) {
            aefuVar = (aefw) intPredicate;
        } else {
            intPredicate.getClass();
            aefuVar = new aefu(intPredicate);
        }
        return aefwVar.b(aefuVar);
    }

    @Deprecated
    public static boolean f(aefw aefwVar, int i) {
        adqs.m(i);
        return aefwVar.c((byte) i);
    }

    @Deprecated
    public static boolean g(aefw aefwVar, Byte b) {
        return aefwVar.c(b.byteValue());
    }

    @Deprecated
    public static void i(aefp aefpVar, Byte b) {
        aefpVar.f(b.byteValue());
    }

    @Deprecated
    public static void k(aefp aefpVar, Byte b) {
        aefpVar.h(b.byteValue());
    }

    @Deprecated
    public static Byte m(aefl aeflVar) {
        return Byte.valueOf(aeflVar.c());
    }

    @Deprecated
    public static void o(aefl aeflVar, final Consumer consumer) {
        aefj aefjVar;
        if (consumer instanceof aefj) {
            aefjVar = (aefj) consumer;
        } else {
            consumer.getClass();
            aefjVar = new aefj() { // from class: aefk
                @Override // defpackage.aefj
                public final /* synthetic */ aefj a(aefj aefjVar2) {
                    return aeec.p(this, aefjVar2);
                }

                @Override // java.util.function.IntConsumer
                public final /* synthetic */ void accept(int i) {
                    aeec.r(this, i);
                }

                @Override // java.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }

                @Override // defpackage.aefj
                public final void b(byte b) {
                    consumer.accept(Byte.valueOf(b));
                }

                @Override // defpackage.aefj
                public final /* synthetic */ void c(Byte b) {
                    aeec.s(this, b);
                }

                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    c((Byte) obj);
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return aeec.q(this, intConsumer);
                }
            };
        }
        aeflVar.b(aefjVar);
    }

    public static aefj p(final aefj aefjVar, final aefj aefjVar2) {
        aefjVar2.getClass();
        return new aefj() { // from class: aefi
            @Override // defpackage.aefj
            public final /* synthetic */ aefj a(aefj aefjVar3) {
                return aeec.p(this, aefjVar3);
            }

            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i) {
                aeec.r(this, i);
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }

            @Override // defpackage.aefj
            public final void b(byte b) {
                aefjVar.b(b);
                aefjVar2.b(b);
            }

            @Override // defpackage.aefj
            public final /* synthetic */ void c(Byte b) {
                aeec.s(this, b);
            }

            @Override // java.util.function.Consumer
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                c((Byte) obj);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return aeec.q(this, intConsumer);
            }
        };
    }

    public static aefj q(aefj aefjVar, final IntConsumer intConsumer) {
        aefj aefjVar2;
        if (intConsumer instanceof aefj) {
            aefjVar2 = (aefj) intConsumer;
        } else {
            intConsumer.getClass();
            aefjVar2 = new aefj() { // from class: aefh
                @Override // defpackage.aefj
                public final /* synthetic */ aefj a(aefj aefjVar3) {
                    return aeec.p(this, aefjVar3);
                }

                @Override // java.util.function.IntConsumer
                public final /* synthetic */ void accept(int i) {
                    aeec.r(this, i);
                }

                @Override // java.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }

                @Override // defpackage.aefj
                public final void b(byte b) {
                    intConsumer.accept(b);
                }

                @Override // defpackage.aefj
                public final /* synthetic */ void c(Byte b) {
                    aeec.s(this, b);
                }

                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    c((Byte) obj);
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return aeec.q(this, intConsumer2);
                }
            };
        }
        return aefjVar.a(aefjVar2);
    }

    @Deprecated
    public static void r(aefj aefjVar, int i) {
        adqs.m(i);
        aefjVar.b((byte) i);
    }

    @Deprecated
    public static void s(aefj aefjVar, Byte b) {
        aefjVar.b(b.byteValue());
    }

    public static /* synthetic */ void u() {
        throw new NoSuchMethodError();
    }

    @Deprecated
    public static Integer v(aels aelsVar, Long l, BiFunction biFunction) {
        return (Integer) Map.CC.$default$compute(aelsVar, l, biFunction);
    }

    @Deprecated
    public static Integer w(aels aelsVar, Long l, Function function) {
        return (Integer) Map.CC.$default$computeIfAbsent(aelsVar, l, function);
    }

    @Deprecated
    public static Integer x(aels aelsVar, Long l, BiFunction biFunction) {
        return (Integer) Map.CC.$default$computeIfPresent(aelsVar, l, biFunction);
    }

    @Deprecated
    public static Integer y(aels aelsVar, Long l, Integer num, BiFunction biFunction) {
        return (Integer) Map.CC.$default$merge(aelsVar, l, num, biFunction);
    }

    @Deprecated
    public static Integer z(aels aelsVar, Long l, Integer num) {
        return (Integer) Map.CC.$default$putIfAbsent(aelsVar, l, num);
    }
}
