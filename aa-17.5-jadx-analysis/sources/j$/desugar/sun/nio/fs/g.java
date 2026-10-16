package j$.desugar.sun.nio.fs;

import j$.nio.file.LinkOption;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.h0;
import j$.nio.file.attribute.r;
import j$.nio.file.attribute.t;
import j$.nio.file.attribute.u;
import j$.nio.file.attribute.u0;
import j$.time.ZoneOffset;
import j$.time.chrono.s;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.a1;
import j$.util.e0;
import j$.util.y;
import java.nio.file.CopyOption;
import java.nio.file.attribute.FileAttribute;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class g {
    public static List A(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Set B(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static /* synthetic */ r[] C(FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        r[] rVarArr = new r[length];
        for (int i = 0; i < length; i++) {
            rVarArr[i] = u.a(fileAttributeArr[i]);
        }
        return rVarArr;
    }

    public static /* synthetic */ CopyOption[] D(j$.nio.file.CopyOption[] copyOptionArr) {
        if (copyOptionArr == null) {
            return null;
        }
        int length = copyOptionArr.length;
        CopyOption[] copyOptionArr2 = new CopyOption[length];
        for (int i = 0; i < length; i++) {
            j$.nio.file.CopyOption copyOption = copyOptionArr[i];
            copyOptionArr2[i] = copyOption == null ? null : copyOption instanceof j$.nio.file.c ? ((j$.nio.file.c) copyOption).a : copyOption instanceof LinkOption ? j$.nio.file.a.c((LinkOption) copyOption) : copyOption instanceof StandardCopyOption ? j$.nio.file.a.d((StandardCopyOption) copyOption) : new j$.nio.file.d(copyOption);
        }
        return copyOptionArr2;
    }

    public static FileAttribute[] E(r[] rVarArr) {
        if (rVarArr == null) {
            return null;
        }
        int length = rVarArr.length;
        FileAttribute[] fileAttributeArr = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            r rVar = rVarArr[i];
            fileAttributeArr[i] = rVar == null ? null : u.d(rVar.value()) ? new t(rVar) : rVar instanceof j$.nio.file.attribute.p ? ((j$.nio.file.attribute.p) rVar).a : new j$.nio.file.attribute.q(rVar);
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
        throw new ArithmeticException();
    }

    public static /* synthetic */ long H(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
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
        throw new ArithmeticException();
    }

    public static /* synthetic */ long I(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static String J(Object obj, Object obj2) {
        String string;
        String string2;
        String str = "null";
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
        return new String(cArr);
    }

    public static char K(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    public static Temporal a(j$.time.chrono.b bVar, Temporal temporal) {
        return temporal.a(bVar.toEpochDay(), j$.time.temporal.a.EPOCH_DAY);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static j$.util.function.b b(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        doubleConsumer2.getClass();
        return new DoubleConsumer() { // from class: j$.util.function.b
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                doubleConsumer.accept(d);
                doubleConsumer2.accept(d);
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer3);
            }
        };
    }

    public static int c(j$.time.chrono.b bVar, j$.time.chrono.b bVar2) {
        int iCompare = Long.compare(bVar.toEpochDay(), bVar2.toEpochDay());
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
        int iCompare = Long.compare(jVar.toEpochSecond(), jVar2.toEpochSecond());
        return (iCompare == 0 && (iCompare = jVar.toLocalTime().d - jVar2.toLocalTime().d) == 0 && (iCompare = jVar.toLocalDateTime().E(jVar2.toLocalDateTime())) == 0 && (iCompare = jVar.getZone().getId().compareTo(jVar2.getZone().getId())) == 0) ? jVar.getChronology().getId().compareTo(jVar2.getChronology().getId()) : iCompare;
    }

    public static void f(e0 e0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            e0Var.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (a1.a) {
                a1.a(e0Var.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            e0Var.forEachRemaining((DoubleConsumer) new y(consumer));
        }
    }

    public static int g(j$.time.chrono.j jVar, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.o.a(jVar, nVar);
        }
        int i = j$.time.chrono.i.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? jVar.toLocalDateTime().h(nVar) : jVar.getOffset().getTotalSeconds();
        }
        j$.time.g.e("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        return 0;
    }

    public static int h(j$.time.chrono.m mVar, j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.a.ERA ? mVar.getValue() : j$.time.temporal.o.a(mVar, nVar);
    }

    public static long i(j$.time.chrono.m mVar, j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.ERA) {
            return mVar.getValue();
        }
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(mVar);
        }
        j$.time.g.e("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0L;
    }

    public static boolean j(j$.time.chrono.b bVar, j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).isDateBased() : nVar != null && nVar.h(bVar);
    }

    public static boolean k(j$.time.chrono.m mVar, j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.ERA : nVar != null && nVar.h(mVar);
    }

    public static Object l(j$.time.chrono.b bVar, n nVar) {
        if (nVar == j$.time.temporal.o.a || nVar == j$.time.temporal.o.e || nVar == j$.time.temporal.o.d || nVar == j$.time.temporal.o.g) {
            return null;
        }
        return nVar == j$.time.temporal.o.b ? bVar.getChronology() : nVar == j$.time.temporal.o.c ? ChronoUnit.DAYS : nVar.c(bVar);
    }

    public static Object m(j$.time.chrono.e eVar, n nVar) {
        if (nVar == j$.time.temporal.o.a || nVar == j$.time.temporal.o.e || nVar == j$.time.temporal.o.d) {
            return null;
        }
        return nVar == j$.time.temporal.o.g ? eVar.toLocalTime() : nVar == j$.time.temporal.o.b ? eVar.getChronology() : nVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : nVar.c(eVar);
    }

    public static Object n(j$.time.chrono.j jVar, n nVar) {
        return (nVar == j$.time.temporal.o.e || nVar == j$.time.temporal.o.a) ? jVar.getZone() : nVar == j$.time.temporal.o.d ? jVar.getOffset() : nVar == j$.time.temporal.o.g ? jVar.toLocalTime() : nVar == j$.time.temporal.o.b ? jVar.getChronology() : nVar == j$.time.temporal.o.c ? ChronoUnit.NANOS : nVar.c(jVar);
    }

    public static Object o(j$.time.chrono.m mVar, n nVar) {
        return nVar == j$.time.temporal.o.c ? ChronoUnit.ERAS : j$.time.temporal.o.c(mVar, nVar);
    }

    public static long p(j$.time.chrono.e eVar, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        return ((eVar.toLocalDate().toEpochDay() * 86400) + eVar.toLocalTime().toSecondOfDay()) - zoneOffset.getTotalSeconds();
    }

    public static long q(j$.time.chrono.j jVar) {
        return ((jVar.toLocalDate().toEpochDay() * 86400) + jVar.toLocalTime().toSecondOfDay()) - jVar.getOffset().getTotalSeconds();
    }

    public static boolean r(e0 e0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return e0Var.tryAdvance((DoubleConsumer) consumer);
        }
        if (a1.a) {
            a1.a(e0Var.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return e0Var.tryAdvance((DoubleConsumer) new y(consumer));
    }

    public static String s(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static String t(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static j$.time.chrono.a u(j$.time.temporal.k kVar) {
        Objects.a(kVar, "temporal");
        return (j$.time.chrono.a) Objects.requireNonNullElse((j$.time.chrono.a) kVar.w(j$.time.temporal.o.b), s.c);
    }

    public static /* synthetic */ int x(long j) {
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long y(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ String z(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "/");
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

    public void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }

    public abstract h0 v(String str);

    public abstract u0 w(String str);
}
