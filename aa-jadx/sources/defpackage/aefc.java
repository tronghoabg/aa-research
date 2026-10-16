package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aefc {
    @java.lang.Deprecated
    public static java.lang.Integer I(defpackage.aemo aemoVar, java.lang.Object obj) {
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
    public static java.lang.Integer J(defpackage.aemo aemoVar, java.lang.Long l, java.lang.Integer num) {
        long jLongValue = l.longValue();
        boolean zD = aemoVar.d(jLongValue);
        int iA = aemoVar.a(jLongValue, num.intValue());
        if (zD) {
            return java.lang.Integer.valueOf(iA);
        }
        return null;
    }

    @java.lang.Deprecated
    public static java.lang.Integer K(defpackage.aemo aemoVar, java.lang.Object obj) {
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
    public static boolean L(defpackage.aemo aemoVar, java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return aemoVar.d(((java.lang.Long) obj).longValue());
    }

    public static /* synthetic */ void M() {
        throw new java.lang.NoSuchMethodError();
    }

    @java.lang.Deprecated
    public static void N(defpackage.aelm aelmVar, java.util.function.Consumer consumer) {
        java.util.function.IntConsumer aellVar;
        if (defpackage.a$$ExternalSyntheticApiModelOutline2.m$3(consumer)) {
            aellVar = defpackage.a$$ExternalSyntheticApiModelOutline2.m39m((java.lang.Object) consumer);
        } else {
            consumer.getClass();
            aellVar = new defpackage.aell(consumer);
        }
        aelmVar.forEachRemaining(aellVar);
    }

    @java.lang.Deprecated
    public static boolean O(defpackage.aelm aelmVar, java.util.function.Consumer consumer) {
        java.util.function.IntConsumer aellVar;
        if (defpackage.a$$ExternalSyntheticApiModelOutline2.m$3(consumer)) {
            aellVar = defpackage.a$$ExternalSyntheticApiModelOutline2.m39m((java.lang.Object) consumer);
        } else {
            consumer.getClass();
            aellVar = new defpackage.aell(consumer);
        }
        return aelmVar.tryAdvance(aellVar);
    }

    public static void P() {
        throw new java.lang.IllegalStateException();
    }

    @java.lang.Deprecated
    public static void Q(defpackage.aelb aelbVar, java.lang.Integer num) {
        aelbVar.c(num.intValue());
    }

    @java.lang.Deprecated
    public static void S(defpackage.aelb aelbVar, java.lang.Integer num) {
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
    public static java.lang.Integer X(defpackage.aela aelaVar, int i) {
        return java.lang.Integer.valueOf(aelaVar.m(i));
    }

    @java.lang.Deprecated
    public static java.lang.Integer Y(defpackage.aekr aekrVar) {
        return java.lang.Integer.valueOf(aekrVar.nextInt());
    }

    @java.lang.Deprecated
    public static void Z(defpackage.aekr aekrVar, final java.util.function.Consumer consumer) {
        java.util.function.IntConsumer intConsumerM39m;
        if (defpackage.a$$ExternalSyntheticApiModelOutline2.m$3(consumer)) {
            intConsumerM39m = defpackage.a$$ExternalSyntheticApiModelOutline2.m39m((java.lang.Object) consumer);
        } else {
            consumer.getClass();
            intConsumerM39m = new java.util.function.IntConsumer() { // from class: aekq
                @Override // java.util.function.IntConsumer
                public final void accept(int i) {
                    consumer.accept(java.lang.Integer.valueOf(i));
                }

                public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
                    return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
                }
            };
        }
        aekrVar.forEachRemaining(intConsumerM39m);
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
    public static int aa(defpackage.aekj aekjVar, java.lang.Integer num, java.lang.Integer num2) {
        return aekjVar.a(num.intValue(), num2.intValue());
    }

    public static java.util.Comparator ac(defpackage.aekj aekjVar, java.util.Comparator comparator) {
        return comparator instanceof defpackage.aekj ? aekjVar.c((defpackage.aekj) comparator) : j$.util.Comparator.CC.$default$thenComparing(aekjVar, comparator);
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

    public static boolean c(defpackage.aekp aekpVar) {
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
    public static void f(defpackage.aegp aegpVar, java.lang.Byte b) {
        aegpVar.f(b.byteValue());
    }

    @java.lang.Deprecated
    public static void h(defpackage.aegp aegpVar, java.lang.Byte b) {
        aegpVar.h(b.byteValue());
    }

    @java.lang.Deprecated
    public static java.lang.Byte j(defpackage.aegl aeglVar) {
        return java.lang.Byte.valueOf(aeglVar.c());
    }

    @java.lang.Deprecated
    public static void l(defpackage.aegl aeglVar, final java.util.function.Consumer consumer) {
        defpackage.aegj aegjVar;
        if (consumer instanceof defpackage.aegj) {
            aegjVar = (defpackage.aegj) consumer;
        } else {
            consumer.getClass();
            aegjVar = new defpackage.aegj() { // from class: aegk
                @Override // defpackage.aegj
                public final /* synthetic */ defpackage.aegj a(defpackage.aegj aegjVar2) {
                    return defpackage.aefc.m(this, aegjVar2);
                }

                @Override // java.util.function.IntConsumer
                public final /* synthetic */ void accept(int i) {
                    defpackage.aefc.o(this, i);
                }

                @Override // java.util.function.Consumer
                public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer2) {
                    return j$.util.function.Consumer$CC.$default$andThen(this, consumer2);
                }

                @Override // defpackage.aegj
                public final void b(byte b) {
                    consumer.accept(java.lang.Byte.valueOf(b));
                }

                @Override // defpackage.aegj
                public final /* synthetic */ void c(java.lang.Byte b) {
                    defpackage.aefc.p(this, b);
                }

                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(java.lang.Object obj) {
                    c((java.lang.Byte) obj);
                }

                public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
                    return defpackage.aefc.n(this, intConsumer);
                }
            };
        }
        aeglVar.b(aegjVar);
    }

    public static defpackage.aegj m(final defpackage.aegj aegjVar, final defpackage.aegj aegjVar2) {
        aegjVar2.getClass();
        return new defpackage.aegj() { // from class: aegi
            @Override // defpackage.aegj
            public final /* synthetic */ defpackage.aegj a(defpackage.aegj aegjVar3) {
                return defpackage.aefc.m(this, aegjVar3);
            }

            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i) {
                defpackage.aefc.o(this, i);
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
            }

            @Override // defpackage.aegj
            public final void b(byte b) {
                aegjVar.b(b);
                aegjVar2.b(b);
            }

            @Override // defpackage.aegj
            public final /* synthetic */ void c(java.lang.Byte b) {
                defpackage.aefc.p(this, b);
            }

            @Override // java.util.function.Consumer
            public final /* bridge */ /* synthetic */ void accept(java.lang.Object obj) {
                c((java.lang.Byte) obj);
            }

            public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
                return defpackage.aefc.n(this, intConsumer);
            }
        };
    }

    public static defpackage.aegj n(defpackage.aegj aegjVar, final java.util.function.IntConsumer intConsumer) {
        defpackage.aegj aegjVar2;
        if (intConsumer instanceof defpackage.aegj) {
            aegjVar2 = (defpackage.aegj) intConsumer;
        } else {
            intConsumer.getClass();
            aegjVar2 = new defpackage.aegj() { // from class: aegh
                @Override // defpackage.aegj
                public final /* synthetic */ defpackage.aegj a(defpackage.aegj aegjVar3) {
                    return defpackage.aefc.m(this, aegjVar3);
                }

                @Override // java.util.function.IntConsumer
                public final /* synthetic */ void accept(int i) {
                    defpackage.aefc.o(this, i);
                }

                @Override // java.util.function.Consumer
                public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                    return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
                }

                @Override // defpackage.aegj
                public final void b(byte b) {
                    intConsumer.accept(b);
                }

                @Override // defpackage.aegj
                public final /* synthetic */ void c(java.lang.Byte b) {
                    defpackage.aefc.p(this, b);
                }

                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(java.lang.Object obj) {
                    c((java.lang.Byte) obj);
                }

                public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer2) {
                    return defpackage.aefc.n(this, intConsumer2);
                }
            };
        }
        return aegjVar.a(aegjVar2);
    }

    @java.lang.Deprecated
    public static void o(defpackage.aegj aegjVar, int i) {
        defpackage.aeao.h(i);
        aegjVar.b((byte) i);
    }

    @java.lang.Deprecated
    public static void p(defpackage.aegj aegjVar, java.lang.Byte b) {
        aegjVar.b(b.byteValue());
    }

    @java.lang.Deprecated
    public static int r(defpackage.aegb aegbVar, java.lang.Byte b, java.lang.Byte b2) {
        return aegbVar.a(b.byteValue(), b2.byteValue());
    }

    public static java.util.Comparator t(defpackage.aegb aegbVar, java.util.Comparator comparator) {
        return comparator instanceof defpackage.aegb ? aegbVar.c((defpackage.aegb) comparator) : j$.util.Comparator.CC.$default$thenComparing(aegbVar, comparator);
    }

    @java.lang.Deprecated
    public static java.lang.Integer u(defpackage.aems aemsVar, java.lang.Long l, java.util.function.BiFunction biFunction) {
        return (java.lang.Integer) j$.util.Map.CC.$default$compute(aemsVar, l, biFunction);
    }

    @java.lang.Deprecated
    public static java.lang.Integer v(defpackage.aems aemsVar, java.lang.Long l, java.util.function.Function function) {
        return (java.lang.Integer) j$.util.Map.CC.$default$computeIfAbsent(aemsVar, l, function);
    }

    @java.lang.Deprecated
    public static java.lang.Integer w(defpackage.aems aemsVar, java.lang.Long l, java.util.function.BiFunction biFunction) {
        return (java.lang.Integer) j$.util.Map.CC.$default$computeIfPresent(aemsVar, l, biFunction);
    }

    @java.lang.Deprecated
    public static java.lang.Integer x(defpackage.aems aemsVar, java.lang.Long l, java.lang.Integer num, java.util.function.BiFunction biFunction) {
        return (java.lang.Integer) j$.util.Map.CC.$default$merge(aemsVar, l, num, biFunction);
    }

    @java.lang.Deprecated
    public static java.lang.Integer y(defpackage.aems aemsVar, java.lang.Long l, java.lang.Integer num) {
        return (java.lang.Integer) j$.util.Map.CC.$default$putIfAbsent(aemsVar, l, num);
    }

    @java.lang.Deprecated
    public static java.lang.Integer z(defpackage.aems aemsVar, java.lang.Long l, java.lang.Integer num) {
        return (java.lang.Integer) j$.util.Map.CC.$default$replace(aemsVar, l, num);
    }
}
