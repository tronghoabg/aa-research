package j$.com.android.tools.r8;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import j$.nio.file.LinkOption;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.h0;
import j$.nio.file.attribute.p;
import j$.nio.file.attribute.q;
import j$.nio.file.attribute.r;
import j$.nio.file.attribute.t;
import j$.nio.file.attribute.u;
import j$.nio.file.attribute.u0;
import j$.nio.file.c;
import j$.nio.file.d;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.e;
import j$.time.chrono.i;
import j$.time.chrono.l;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.m;
import j$.time.temporal.n;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.c0;
import j$.util.function.f;
import j$.util.g0;
import j$.util.k0;
import j$.util.r1;
import j$.util.s0;
import j$.util.w;
import j$.util.x0;
import java.nio.file.CopyOption;
import java.nio.file.attribute.FileAttribute;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
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
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract /* synthetic */ class a {
    public static String A(long j2, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j2, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static void B(Iterator it, Consumer consumer) {
        if (it instanceof w) {
            ((w) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static /* synthetic */ int E(long j2) {
        int i2 = (int) j2;
        if (j2 == i2) {
            return i2;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long F(long j2, long j3) {
        long j4 = j2 / j3;
        return (j2 - (j3 * j4) != 0 && (((j2 ^ j3) >> 63) | 1) < 0) ? j4 - 1 : j4;
    }

    public static /* synthetic */ String G(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) DomExceptionUtils.SEPARATOR);
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ AbstractMap.SimpleImmutableEntry H(String str, String str2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(str), Objects.requireNonNull(str2));
    }

    public static /* synthetic */ List I(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Objects.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ Set J(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            if (!hashSet.add(Objects.requireNonNull(obj))) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static /* synthetic */ boolean K(Unsafe unsafe, Object obj, long j2, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j2, obj2, obj3)) {
            if (unsafe.getObject(obj, j2) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ r[] L(FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        r[] rVarArr = new r[length];
        for (int i2 = 0; i2 < length; i2++) {
            rVarArr[i2] = u.a(fileAttributeArr[i2]);
        }
        return rVarArr;
    }

    public static /* synthetic */ CopyOption[] M(j$.nio.file.CopyOption[] copyOptionArr) {
        if (copyOptionArr == null) {
            return null;
        }
        int length = copyOptionArr.length;
        CopyOption[] copyOptionArr2 = new CopyOption[length];
        for (int i2 = 0; i2 < length; i2++) {
            j$.nio.file.CopyOption copyOption = copyOptionArr[i2];
            copyOptionArr2[i2] = copyOption == null ? null : copyOption instanceof c ? ((c) copyOption).f49742a : copyOption instanceof LinkOption ? j$.nio.file.a.c((LinkOption) copyOption) : copyOption instanceof StandardCopyOption ? j$.nio.file.a.d((StandardCopyOption) copyOption) : new d(copyOption);
        }
        return copyOptionArr2;
    }

    public static FileAttribute[] N(r[] rVarArr) {
        if (rVarArr == null) {
            return null;
        }
        int length = rVarArr.length;
        FileAttribute[] fileAttributeArr = new FileAttribute[length];
        for (int i2 = 0; i2 < length; i2++) {
            r rVar = rVarArr[i2];
            fileAttributeArr[i2] = rVar == null ? null : u.d(rVar.value()) ? new t(rVar) : rVar instanceof p ? ((p) rVar).f49725a : new q(rVar);
        }
        return fileAttributeArr;
    }

    public static /* synthetic */ long O(long j2, long j3) {
        long j4 = j2 % j3;
        if (j4 == 0) {
            return 0L;
        }
        return (((j2 ^ j3) >> 63) | 1) > 0 ? j4 : j4 + j3;
    }

    public static /* synthetic */ long P(long j2, long j3) {
        long j4 = j2 + j3;
        if (((j3 ^ j2) < 0) || ((j2 ^ j4) >= 0)) {
            return j4;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long Q(long j2, long j3) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2);
        if (iNumberOfLeadingZeros > 65) {
            return j2 * j3;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j3 != Long.MIN_VALUE) | (j2 >= 0)) {
                long j4 = j2 * j3;
                if (j2 == 0 || j4 / j2 == j3) {
                    return j4;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long R(long j2, long j3) {
        long j4 = j2 - j3;
        if (((j3 ^ j2) >= 0) || ((j2 ^ j4) >= 0)) {
            return j4;
        }
        throw new ArithmeticException();
    }

    public static String S(Object obj, Object obj2) {
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

    public static char T(String str, int i2) {
        if (i2 < str.length()) {
            return str.charAt(i2);
        }
        return (char) 0;
    }

    public static Temporal a(j$.time.chrono.b bVar, Temporal temporal) {
        return temporal.a(bVar.toEpochDay(), j$.time.temporal.a.EPOCH_DAY);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static j$.util.function.b b(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d2) {
                doubleConsumer.accept(d2);
                doubleConsumer2.accept(d2);
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.com.android.tools.r8.a.b(this, doubleConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.f] */
    public static f c(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.f
            @Override // java.util.function.LongConsumer
            public final void accept(long j2) {
                longConsumer.accept(j2);
                longConsumer2.accept(j2);
            }

            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.com.android.tools.r8.a.c(this, longConsumer3);
            }
        };
    }

    public static int d(j$.time.chrono.b bVar, j$.time.chrono.b bVar2) {
        int iCompare = Long.compare(bVar.toEpochDay(), bVar2.toEpochDay());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((j$.time.chrono.a) bVar.getChronology()).t(bVar2.getChronology());
    }

    public static int e(e eVar, e eVar2) {
        int iK = eVar.toLocalDate().compareTo(eVar2.toLocalDate());
        return (iK == 0 && (iK = eVar.toLocalTime().compareTo(eVar2.toLocalTime())) == 0) ? eVar.getChronology().t(eVar2.getChronology()) : iK;
    }

    public static int f(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int iCompare = Long.compare(chronoZonedDateTime.toEpochSecond(), chronoZonedDateTime2.toEpochSecond());
        return (iCompare == 0 && (iCompare = chronoZonedDateTime.toLocalTime().f49813d - chronoZonedDateTime2.toLocalTime().f49813d) == 0 && (iCompare = chronoZonedDateTime.toLocalDateTime().G(chronoZonedDateTime2.toLocalDateTime())) == 0 && (iCompare = chronoZonedDateTime.getZone().getId().compareTo(chronoZonedDateTime2.getZone().getId())) == 0) ? chronoZonedDateTime.getChronology().t(chronoZonedDateTime2.getChronology()) : iCompare;
    }

    public static void g(s0 s0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            s0Var.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (r1.f50305a) {
                r1.a(s0Var.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            s0Var.forEachRemaining((DoubleConsumer) new c0(consumer, 0));
        }
    }

    public static void h(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            ofInt.forEachRemaining((IntConsumer) consumer);
        } else {
            if (r1.f50305a) {
                r1.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            ofInt.forEachRemaining((IntConsumer) new g0(consumer, 0));
        }
    }

    public static void i(x0 x0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            x0Var.forEachRemaining((LongConsumer) consumer);
        } else {
            if (r1.f50305a) {
                r1.a(x0Var.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            x0Var.forEachRemaining((LongConsumer) new k0(consumer, 0));
        }
    }

    public static int j(ChronoZonedDateTime chronoZonedDateTime, m mVar) {
        if (!(mVar instanceof j$.time.temporal.a)) {
            return n.a(chronoZonedDateTime, mVar);
        }
        int i2 = i.f49856a[((j$.time.temporal.a) mVar).ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? chronoZonedDateTime.toLocalDateTime().f(mVar) : chronoZonedDateTime.getOffset().getTotalSeconds();
        }
        j$.time.f.f("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        return 0;
    }

    public static int k(l lVar, m mVar) {
        return mVar == j$.time.temporal.a.ERA ? lVar.getValue() : n.a(lVar, mVar);
    }

    public static long l(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static long m(l lVar, m mVar) {
        if (mVar == j$.time.temporal.a.ERA) {
            return lVar.getValue();
        }
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.k(lVar);
        }
        j$.time.f.f("Unsupported field: ".concat(String.valueOf(mVar)));
        return 0L;
    }

    public static boolean n(Spliterator spliterator, int i2) {
        return (spliterator.characteristics() & i2) == i2;
    }

    public static boolean o(j$.time.chrono.b bVar, m mVar) {
        return mVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) mVar).isDateBased() : mVar != null && mVar.f(bVar);
    }

    public static boolean p(l lVar, m mVar) {
        return mVar instanceof j$.time.temporal.a ? mVar == j$.time.temporal.a.ERA : mVar != null && mVar.f(lVar);
    }

    public static Object q(j$.time.chrono.b bVar, j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == n.f50065a || nVar == n.f50069e || nVar == n.f50068d || nVar == n.f50071g) {
            return null;
        }
        return nVar == n.f50066b ? bVar.getChronology() : nVar == n.f50067c ? ChronoUnit.DAYS : nVar.d(bVar);
    }

    public static Object r(e eVar, j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == n.f50065a || nVar == n.f50069e || nVar == n.f50068d) {
            return null;
        }
        return nVar == n.f50071g ? eVar.toLocalTime() : nVar == n.f50066b ? eVar.getChronology() : nVar == n.f50067c ? ChronoUnit.NANOS : nVar.d(eVar);
    }

    public static Object s(ChronoZonedDateTime chronoZonedDateTime, j$.desugar.sun.nio.fs.n nVar) {
        return (nVar == n.f50069e || nVar == n.f50065a) ? chronoZonedDateTime.getZone() : nVar == n.f50068d ? chronoZonedDateTime.getOffset() : nVar == n.f50071g ? chronoZonedDateTime.toLocalTime() : nVar == n.f50066b ? chronoZonedDateTime.getChronology() : nVar == n.f50067c ? ChronoUnit.NANOS : nVar.d(chronoZonedDateTime);
    }

    public static Object t(l lVar, j$.desugar.sun.nio.fs.n nVar) {
        return nVar == n.f50067c ? ChronoUnit.ERAS : n.c(lVar, nVar);
    }

    public static long u(e eVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        return ((eVar.toLocalDate().toEpochDay() * 86400) + eVar.toLocalTime().toSecondOfDay()) - zoneOffset.getTotalSeconds();
    }

    public static long v(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.toLocalDate().toEpochDay() * 86400) + chronoZonedDateTime.toLocalTime().toSecondOfDay()) - chronoZonedDateTime.getOffset().getTotalSeconds();
    }

    public static boolean w(s0 s0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return s0Var.tryAdvance((DoubleConsumer) consumer);
        }
        if (r1.f50305a) {
            r1.a(s0Var.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return s0Var.tryAdvance((DoubleConsumer) new c0(consumer, 0));
    }

    public static boolean x(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return ofInt.tryAdvance((IntConsumer) consumer);
        }
        if (r1.f50305a) {
            r1.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return ofInt.tryAdvance((IntConsumer) new g0(consumer, 0));
    }

    public static boolean y(x0 x0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return x0Var.tryAdvance((LongConsumer) consumer);
        }
        if (r1.f50305a) {
            r1.a(x0Var.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return x0Var.tryAdvance((LongConsumer) new k0(consumer, 0));
    }

    public static String z(long j2, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j2, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public abstract h0 C(String str);

    public abstract u0 D(String str);

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
