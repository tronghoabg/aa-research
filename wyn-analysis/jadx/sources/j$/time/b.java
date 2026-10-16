package j$.time;

import j$.util.Objects;
import j$.util.TimeZoneRetargetClass;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract class b {
    public static /* synthetic */ long b(long j8, long j10) {
        long j11 = j8 + j10;
        if (((j10 ^ j8) < 0) || ((j8 ^ j11) >= 0)) {
            return j11;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ AbstractMap.SimpleImmutableEntry c(String str, String str2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(str), Objects.requireNonNull(str2));
    }

    public static /* synthetic */ List d(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Objects.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ long e(long j8, long j10) {
        long j11 = j8 % j10;
        if (j11 == 0) {
            return 0L;
        }
        return (((j8 ^ j10) >> 63) | 1) > 0 ? j11 : j11 + j10;
    }

    public static /* synthetic */ long f(long j8, long j10) {
        long j11 = j8 / j10;
        return (j8 - (j10 * j11) != 0 && (((j8 ^ j10) >> 63) | 1) < 0) ? j11 - 1 : j11;
    }

    public static /* synthetic */ long g(long j8, long j10) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j8);
        if (iNumberOfLeadingZeros > 65) {
            return j8 * j10;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j10 != Long.MIN_VALUE) | (j8 >= 0)) {
                long j11 = j8 * j10;
                if (j8 == 0 || j11 / j8 == j10) {
                    return j11;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long h(long j8, long j10) {
        long j11 = j8 - j10;
        if (((j10 ^ j8) >= 0) || ((j8 ^ j11) >= 0)) {
            return j11;
        }
        throw new ArithmeticException();
    }

    public abstract ZoneId a();

    public static b i() {
        return new a(TimeZoneRetargetClass.toZoneId(TimeZone.getDefault()));
    }

    protected b() {
    }
}
