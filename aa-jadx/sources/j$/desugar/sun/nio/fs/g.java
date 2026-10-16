package j$.desugar.sun.nio.fs;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static java.util.List A(java.lang.Object[] objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            obj.getClass();
            arrayList.add(obj);
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    public static java.util.Set B(java.lang.Object[] objArr) {
        java.util.HashSet hashSet = new java.util.HashSet(objArr.length);
        for (java.lang.Object obj : objArr) {
            obj.getClass();
            if (!hashSet.add(obj)) {
                throw new java.lang.IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return java.util.Collections.unmodifiableSet(hashSet);
    }

    public static /* synthetic */ j$.nio.file.attribute.r[] C(java.nio.file.attribute.FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        j$.nio.file.attribute.r[] rVarArr = new j$.nio.file.attribute.r[length];
        for (int i = 0; i < length; i++) {
            rVarArr[i] = j$.nio.file.attribute.u.a(fileAttributeArr[i]);
        }
        return rVarArr;
    }

    public static /* synthetic */ java.nio.file.CopyOption[] D(j$.nio.file.CopyOption[] copyOptionArr) {
        java.nio.file.CopyOption copyOptionD;
        if (copyOptionArr == null) {
            return null;
        }
        int length = copyOptionArr.length;
        java.nio.file.CopyOption[] copyOptionArr2 = new java.nio.file.CopyOption[length];
        for (int i = 0; i < length; i++) {
            j$.nio.file.CopyOption copyOption = copyOptionArr[i];
            if (copyOption == null) {
                copyOptionD = null;
            } else if (copyOption instanceof j$.nio.file.c) {
                copyOptionD = ((j$.nio.file.c) copyOption).a;
            } else if (copyOption instanceof j$.nio.file.LinkOption) {
                copyOptionD = j$.nio.file.a.c((j$.nio.file.LinkOption) copyOption);
            } else {
                copyOptionD = copyOption instanceof j$.nio.file.StandardCopyOption ? j$.nio.file.a.d((j$.nio.file.StandardCopyOption) copyOption) : new j$.nio.file.d(copyOption);
            }
            copyOptionArr2[i] = copyOptionD;
        }
        return copyOptionArr2;
    }

    public static java.nio.file.attribute.FileAttribute[] E(j$.nio.file.attribute.r[] rVarArr) {
        java.nio.file.attribute.FileAttribute qVar;
        if (rVarArr == null) {
            return null;
        }
        int length = rVarArr.length;
        java.nio.file.attribute.FileAttribute[] fileAttributeArr = new java.nio.file.attribute.FileAttribute[length];
        for (int i = 0; i < length; i++) {
            j$.nio.file.attribute.r rVar = rVarArr[i];
            if (rVar == null) {
                qVar = null;
            } else if (j$.nio.file.attribute.u.d(rVar.value())) {
                qVar = new j$.nio.file.attribute.t(rVar);
            } else {
                qVar = rVar instanceof j$.nio.file.attribute.p ? ((j$.nio.file.attribute.p) rVar).a : new j$.nio.file.attribute.q(rVar);
            }
            fileAttributeArr[i] = qVar;
        }
        return fileAttributeArr;
    }

    public static /* synthetic */ long F(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long G(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new java.lang.ArithmeticException();
    }

    public static /* synthetic */ long H(long j, long j2) {
        int iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(~j2) + java.lang.Long.numberOfLeadingZeros(j2) + java.lang.Long.numberOfLeadingZeros(~j) + java.lang.Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j2 != Long.MIN_VALUE) | (j >= 0)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new java.lang.ArithmeticException();
    }

    public static /* synthetic */ long I(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new java.lang.ArithmeticException();
    }

    public static java.lang.String J(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String str = "null";
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str.getChars(0, length2, cArr, length + 1);
        return new java.lang.String(cArr);
    }

    public static char K(java.lang.String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    public static j$.time.temporal.Temporal a(j$.time.chrono.b bVar, j$.time.temporal.Temporal temporal) {
        return temporal.a(bVar.toEpochDay(), j$.time.temporal.a.EPOCH_DAY);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static j$.util.function.b b(final java.util.function.DoubleConsumer doubleConsumer, final java.util.function.DoubleConsumer doubleConsumer2) {
        doubleConsumer2.getClass();
        return new java.util.function.DoubleConsumer() { // from class: j$.util.function.b
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                doubleConsumer.accept(d);
                doubleConsumer2.accept(d);
            }

            public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer3) {
                return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer3);
            }
        };
    }

    public static int c(j$.time.chrono.b bVar, j$.time.chrono.b bVar2) {
        int iCompare = java.lang.Long.compare(bVar.toEpochDay(), bVar2.toEpochDay());
        if (iCompare != 0) {
            return iCompare;
        }
        return bVar.getChronology().getId().compareTo(bVar2.getChronology().getId());
    }

    public static int d(j$.time.chrono.e eVar, j$.time.chrono.e eVar2) {
        int iG = eVar.toLocalDate().G(eVar2.toLocalDate());
        return (iG == 0 && (iG = eVar.toLocalTime().compareTo(eVar2.toLocalTime())) == 0) ? eVar.getChronology().getId().compareTo(eVar2.getChronology().getId()) : iG;
    }

    public static int e(j$.time.chrono.j jVar, j$.time.chrono.j jVar2) {
        int iCompare = java.lang.Long.compare(jVar.toEpochSecond(), jVar2.toEpochSecond());
        return (iCompare == 0 && (iCompare = jVar.toLocalTime().d - jVar2.toLocalTime().d) == 0 && (iCompare = jVar.toLocalDateTime().E(jVar2.toLocalDateTime())) == 0 && (iCompare = jVar.getZone().getId().compareTo(jVar2.getZone().getId())) == 0) ? jVar.getChronology().getId().compareTo(jVar2.getChronology().getId()) : iCompare;
    }

    public static void f(j$.util.e0 e0Var, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.DoubleConsumer) {
            e0Var.forEachRemaining((java.util.function.DoubleConsumer) consumer);
        } else {
            if (j$.util.a1.a) {
                j$.util.a1.a(e0Var.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            e0Var.forEachRemaining((java.util.function.DoubleConsumer) new j$.util.y(consumer));
        }
    }

    public static int g(j$.time.chrono.j jVar, j$.time.temporal.m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.n.a(jVar, mVar);
        }
        int i = j$.time.chrono.i.a[((j$.time.temporal.a) mVar).ordinal()];
        if (i != 1) {
            return i != 2 ? jVar.toLocalDateTime().h(mVar) : jVar.getOffset().getTotalSeconds();
        }
        j$.time.g.e("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        return 0;
    }

    public static int h(j$.time.chrono.m mVar, j$.time.temporal.m mVar2) {
        return mVar2 == j$.time.temporal.a.ERA ? mVar.getValue() : j$.time.temporal.n.a(mVar, mVar2);
    }

    public static long i(j$.time.chrono.m mVar, j$.time.temporal.m mVar2) {
        if (mVar2 == j$.time.temporal.a.ERA) {
            return mVar.getValue();
        }
        if (!(mVar2 instanceof j$.time.temporal.a)) {
            return mVar2.l(mVar);
        }
        j$.time.g.e("Unsupported field: ".concat(java.lang.String.valueOf(mVar2)));
        return 0L;
    }

    public static boolean j(j$.time.chrono.b bVar, j$.time.temporal.m mVar) {
        if (mVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) mVar).isDateBased();
        }
        return mVar != null && mVar.h(bVar);
    }

    public static boolean k(j$.time.chrono.m mVar, j$.time.temporal.m mVar2) {
        if (mVar2 instanceof j$.time.temporal.a) {
            return mVar2 == j$.time.temporal.a.ERA;
        }
        return mVar2 != null && mVar2.h(mVar);
    }

    public static java.lang.Object l(j$.time.chrono.b bVar, j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.n.a || nVar == j$.time.temporal.n.e || nVar == j$.time.temporal.n.d || nVar == j$.time.temporal.n.g) {
            return null;
        }
        if (nVar == j$.time.temporal.n.b) {
            return bVar.getChronology();
        }
        return nVar == j$.time.temporal.n.c ? j$.time.temporal.ChronoUnit.DAYS : nVar.c(bVar);
    }

    public static java.lang.Object m(j$.time.chrono.e eVar, j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.n.a || nVar == j$.time.temporal.n.e || nVar == j$.time.temporal.n.d) {
            return null;
        }
        if (nVar == j$.time.temporal.n.g) {
            return eVar.toLocalTime();
        }
        if (nVar == j$.time.temporal.n.b) {
            return eVar.getChronology();
        }
        return nVar == j$.time.temporal.n.c ? j$.time.temporal.ChronoUnit.NANOS : nVar.c(eVar);
    }

    public static java.lang.Object n(j$.time.chrono.j jVar, j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.n.e || nVar == j$.time.temporal.n.a) {
            return jVar.getZone();
        }
        if (nVar == j$.time.temporal.n.d) {
            return jVar.getOffset();
        }
        if (nVar == j$.time.temporal.n.g) {
            return jVar.toLocalTime();
        }
        if (nVar == j$.time.temporal.n.b) {
            return jVar.getChronology();
        }
        return nVar == j$.time.temporal.n.c ? j$.time.temporal.ChronoUnit.NANOS : nVar.c(jVar);
    }

    public static java.lang.Object o(j$.time.chrono.m mVar, j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.n.c ? j$.time.temporal.ChronoUnit.ERAS : j$.time.temporal.n.c(mVar, nVar);
    }

    public static long p(j$.time.chrono.e eVar, j$.time.ZoneOffset zoneOffset) {
        j$.util.Objects.a(zoneOffset, "offset");
        return ((eVar.toLocalDate().toEpochDay() * 86400) + ((long) eVar.toLocalTime().toSecondOfDay())) - ((long) zoneOffset.getTotalSeconds());
    }

    public static long q(j$.time.chrono.j jVar) {
        return ((jVar.toLocalDate().toEpochDay() * 86400) + ((long) jVar.toLocalTime().toSecondOfDay())) - ((long) jVar.getOffset().getTotalSeconds());
    }

    public static boolean r(j$.util.e0 e0Var, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.DoubleConsumer) {
            return e0Var.tryAdvance((java.util.function.DoubleConsumer) consumer);
        }
        if (j$.util.a1.a) {
            j$.util.a1.a(e0Var.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return e0Var.tryAdvance((java.util.function.DoubleConsumer) new j$.util.y(consumer));
    }

    public static java.lang.String s(long j, java.lang.String str, java.util.Locale locale) {
        java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone("UTC");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static java.lang.String t(long j, java.lang.String str, java.util.Locale locale) {
        java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone("UTC");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static j$.time.chrono.a u(j$.time.temporal.TemporalAccessor temporalAccessor) {
        j$.util.Objects.a(temporalAccessor, "temporal");
        return (j$.time.chrono.a) j$.util.Objects.requireNonNullElse((j$.time.chrono.a) temporalAccessor.w(j$.time.temporal.n.b), j$.time.chrono.s.c);
    }

    public static /* synthetic */ int x(long j) {
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new java.lang.ArithmeticException();
    }

    public static /* synthetic */ long y(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ java.lang.String z(java.util.Collection collection) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = collection.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((java.lang.CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((java.lang.CharSequence) "/");
            }
        }
        return sb.toString();
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(java.lang.Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(java.lang.Object obj) {
        obj.getClass();
        return false;
    }

    public j$.util.Spliterator trySplit() {
        return null;
    }

    public abstract j$.nio.file.attribute.h0 v(java.lang.String str);

    public abstract j$.nio.file.attribute.u0 w(java.lang.String str);
}
