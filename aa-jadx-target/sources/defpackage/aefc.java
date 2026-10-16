package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aefc {
    @java.lang.Deprecated
    public static java.lang.Integer I(aemo aemoVar, java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((java.lang.Long) obj).longValue();
        int iS = aemoVar.s(jLongValue);
        if (iS == 0) {
            if (!aemoVar.d(jLongValue)) {
                return null;
            }
            iS = 0;
        }
        return java.lang.Integer.valueOf(iS);
    }

    @java.lang.Deprecated
    public static java.lang.Integer J(aemo aemoVar, java.lang.Long l, java.lang.Integer num) {
        long jLongValue = l.longValue();
        boolean zD = aemoVar.d(jLongValue);
        int iA = aemoVar.a(jLongValue, num.intValue());
        if (zD) {
            return java.lang.Integer.valueOf(iA);
        }
        return null;
    }

    @java.lang.Deprecated
    public static java.lang.Integer K(aemo aemoVar, java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((java.lang.Long) obj).longValue();
        if (aemoVar.d(jLongValue)) {
            return java.lang.Integer.valueOf(aemoVar.b(jLongValue));
        }
        return null;
    }

    @java.lang.Deprecated
    public static boolean L(aemo aemoVar, java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return aemoVar.d(((java.lang.Long) obj).longValue());
    }

    public static /* synthetic */ void M() {
        throw new java.lang.NoSuchMethodError();
    }

    @java.lang.Deprecated
    public static void N(aelm aelmVar, java.util.function.Consumer consumer) {
        java.util.function.IntConsumer aellVar;
        if (a$.ExternalSyntheticApiModelOutline2.m$3(consumer)) {
            aellVar = a$.ExternalSyntheticApiModelOutline2.m(consumer);
        } else {
            consumer.getClass();
            aellVar = new aell(consumer);
        }
        aelmVar.forEachRemaining(aellVar);
    }

    @java.lang.Deprecated
    public static boolean O(aelm aelmVar, java.util.function.Consumer consumer) {
        java.util.function.IntConsumer aellVar;
        if (a$.ExternalSyntheticApiModelOutline2.m$3(consumer)) {
            aellVar = a$.ExternalSyntheticApiModelOutline2.m(consumer);
        } else {
            consumer.getClass();
            aellVar = new aell(consumer);
        }
        return aelmVar.tryAdvance(aellVar);
    }

    public static void P() {
        throw new java.lang.IllegalStateException();
    }

    @java.lang.Deprecated
    public static void Q(aelb aelbVar, java.lang.Integer num) {
        aelbVar.c(num.intValue());
    }

    @java.lang.Deprecated
    public static void S(aelb aelbVar, java.lang.Integer num) {
        aelbVar.e(num.intValue());
    }

    public static void U() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static void V() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static void W() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static java.lang.Integer X(aela aelaVar, int i) {
        return java.lang.Integer.valueOf(aelaVar.m(i));
    }

    @java.lang.Deprecated
    public static java.lang.Integer Y(aekr aekrVar) {
        return java.lang.Integer.valueOf(aekrVar.nextInt());
    }

    @java.lang.Deprecated
    public static void Z(aekr aekrVar, java.util.function.Consumer consumer) {
        java.util.function.IntConsumer aekqVar;
        if (a$.ExternalSyntheticApiModelOutline2.m$3(consumer)) {
            aekqVar = a$.ExternalSyntheticApiModelOutline2.m(consumer);
        } else {
            consumer.getClass();
            aekqVar = new aekq(consumer);
        }
        aekrVar.forEachRemaining(aekqVar);
    }

    public static void a(int i, int i2, int i3) {
        if (i2 < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(defpackage.a.bm(i2, "Start index (", ") is negative"));
        }
        if (i2 > i3) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bz(i3, i2, "Start index (", ") is greater than end index (", ")"));
        }
        if (i3 > i) {
            throw new java.lang.ArrayIndexOutOfBoundsException(defpackage.a.bz(i, i3, "End index (", ") is greater than array length (", ")"));
        }
    }

    @java.lang.Deprecated
    public static int aa(aekj aekjVar, java.lang.Integer num, java.lang.Integer num2) {
        return aekjVar.a(num.intValue(), num2.intValue());
    }

    public static java.util.Comparator ac(aekj aekjVar, java.util.Comparator comparator) {
        return comparator instanceof aekj ? aekjVar.c((aekj) comparator) : j$.util.Comparator.-CC.$default$thenComparing(aekjVar, comparator);
    }

    public static void b(int i, int i2, int i3) {
        if (i2 < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(defpackage.a.bm(i2, "Offset (", ") is negative"));
        }
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bm(i3, "Length (", ") is negative"));
        }
        if (i3 <= i - i2) {
            return;
        }
        throw new java.lang.ArrayIndexOutOfBoundsException("Last index (" + (((long) i2) + ((long) i3)) + ") is greater than array length (" + i + ")");
    }

    public static boolean c(aekp aekpVar) {
        return aekpVar.b == 0;
    }

    public static int d(int i, float f) {
        long jMax = java.lang.Math.max(2L, 1 << (64 - java.lang.Long.numberOfLeadingZeros(((long) java.lang.Math.ceil(((double) i) / ((double) f))) - 1)));
        if (jMax <= 1073741824) {
            return (int) jMax;
        }
        throw new java.lang.IllegalArgumentException("Too large (" + i + " expected elements with load factor " + f + ")");
    }

    public static int e(int i, float f) {
        return java.lang.Math.min((int) java.lang.Math.ceil(((double) i) * ((double) f)), i - 1);
    }

    @java.lang.Deprecated
    public static void f(aegp aegpVar, java.lang.Byte b) {
        aegpVar.f(b.byteValue());
    }

    @java.lang.Deprecated
    public static void h(aegp aegpVar, java.lang.Byte b) {
        aegpVar.h(b.byteValue());
    }

    @java.lang.Deprecated
    public static java.lang.Byte j(aegl aeglVar) {
        return java.lang.Byte.valueOf(aeglVar.c());
    }

    @java.lang.Deprecated
    public static void l(aegl aeglVar, java.util.function.Consumer consumer) {
        aegj aegkVar;
        if (consumer instanceof aegj) {
            aegkVar = (aegj) consumer;
        } else {
            consumer.getClass();
            aegkVar = new aegk(consumer);
        }
        aeglVar.b(aegkVar);
    }

    public static aegj m(aegj aegjVar, aegj aegjVar2) {
        aegjVar2.getClass();
        return new aegi(aegjVar, aegjVar2);
    }

    public static aegj n(aegj aegjVar, java.util.function.IntConsumer intConsumer) {
        aegj aeghVar;
        if (intConsumer instanceof aegj) {
            aeghVar = (aegj) intConsumer;
        } else {
            intConsumer.getClass();
            aeghVar = new aegh(intConsumer);
        }
        return aegjVar.a(aeghVar);
    }

    @java.lang.Deprecated
    public static void o(aegj aegjVar, int i) {
        defpackage.aeao.h(i);
        aegjVar.b((byte) i);
    }

    @java.lang.Deprecated
    public static void p(aegj aegjVar, java.lang.Byte b) {
        aegjVar.b(b.byteValue());
    }

    @java.lang.Deprecated
    public static int r(aegb aegbVar, java.lang.Byte b, java.lang.Byte b2) {
        return aegbVar.a(b.byteValue(), b2.byteValue());
    }

    public static java.util.Comparator t(aegb aegbVar, java.util.Comparator comparator) {
        return comparator instanceof aegb ? aegbVar.c((aegb) comparator) : j$.util.Comparator.-CC.$default$thenComparing(aegbVar, comparator);
    }

    @java.lang.Deprecated
    public static java.lang.Integer u(aems aemsVar, java.lang.Long l, java.util.function.BiFunction biFunction) {
        return (java.lang.Integer) j$.util.Map.-CC.$default$compute(aemsVar, l, biFunction);
    }

    @java.lang.Deprecated
    public static java.lang.Integer v(aems aemsVar, java.lang.Long l, java.util.function.Function function) {
        return (java.lang.Integer) j$.util.Map.-CC.$default$computeIfAbsent(aemsVar, l, function);
    }

    @java.lang.Deprecated
    public static java.lang.Integer w(aems aemsVar, java.lang.Long l, java.util.function.BiFunction biFunction) {
        return (java.lang.Integer) j$.util.Map.-CC.$default$computeIfPresent(aemsVar, l, biFunction);
    }

    @java.lang.Deprecated
    public static java.lang.Integer x(aems aemsVar, java.lang.Long l, java.lang.Integer num, java.util.function.BiFunction biFunction) {
        return (java.lang.Integer) j$.util.Map.-CC.$default$merge(aemsVar, l, num, biFunction);
    }

    @java.lang.Deprecated
    public static java.lang.Integer y(aems aemsVar, java.lang.Long l, java.lang.Integer num) {
        return (java.lang.Integer) j$.util.Map.-CC.$default$putIfAbsent(aemsVar, l, num);
    }

    @java.lang.Deprecated
    public static java.lang.Integer z(aems aemsVar, java.lang.Long l, java.lang.Integer num) {
        return (java.lang.Integer) j$.util.Map.-CC.$default$replace(aemsVar, l, num);
    }
}
