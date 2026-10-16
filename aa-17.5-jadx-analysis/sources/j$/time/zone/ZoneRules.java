package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.chrono.s;
import j$.time.j;
import j$.time.temporal.m;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class ZoneRules implements Serializable {
    public static final long[] i = new long[0];
    public static final d[] j = new d[0];
    public static final LocalDateTime[] k = new LocalDateTime[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final ZoneOffset[] b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final ZoneOffset[] e;
    public final d[] f;
    public final TimeZone g;
    public final transient ConcurrentHashMap h = new ConcurrentHashMap();

    public ZoneRules(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, d[] dVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = dVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                ZoneOffset zoneOffset = zoneOffsetArr2[i2];
                int i3 = i2 + 1;
                ZoneOffset zoneOffset2 = zoneOffsetArr2[i3];
                LocalDateTime localDateTimeH = LocalDateTime.H(jArr2[i2], 0, zoneOffset);
                if (zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds()) {
                    arrayList.add(localDateTimeH);
                    arrayList.add(localDateTimeH.J(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                } else {
                    arrayList.add(localDateTimeH.J(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                    arrayList.add(localDateTimeH);
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(j$.time.LocalDateTime r6, j$.time.zone.b r7) {
        /*
            j$.time.LocalDateTime r0 = r7.b
            j$.time.LocalDateTime r1 = r7.b
            j$.time.ZoneOffset r2 = r7.d
            j$.time.ZoneOffset r3 = r7.c
            boolean r4 = r7.h()
            if (r4 == 0) goto L2a
            boolean r0 = r6.A(r0)
            if (r0 == 0) goto L15
            goto L45
        L15:
            int r0 = r2.getTotalSeconds()
            int r3 = r3.getTotalSeconds()
            int r0 = r0 - r3
            long r3 = (long) r0
            j$.time.LocalDateTime r0 = r1.J(r3)
            boolean r6 = r6.A(r0)
            if (r6 == 0) goto L30
            goto L46
        L2a:
            boolean r0 = r6.A(r0)
            if (r0 != 0) goto L31
        L30:
            return r2
        L31:
            int r0 = r2.getTotalSeconds()
            int r2 = r3.getTotalSeconds()
            int r0 = r0 - r2
            long r4 = (long) r0
            j$.time.LocalDateTime r0 = r1.J(r4)
            boolean r6 = r6.A(r0)
            if (r6 == 0) goto L46
        L45:
            return r3
        L46:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.ZoneRules.a(j$.time.LocalDateTime, j$.time.zone.b):java.lang.Object");
    }

    public static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.ofEpochDay(j$.desugar.sun.nio.fs.g.y(j2 + zoneOffset.getTotalSeconds(), 86400L)).a;
    }

    public static ZoneOffset h(int i2) {
        return ZoneOffset.ofTotalSeconds(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b[] b(int i2) {
        byte b;
        b[] bVarArr;
        LocalDate localDateS;
        d dVar;
        long j2;
        Integer numValueOf = Integer.valueOf(i2);
        ConcurrentHashMap concurrentHashMap = this.h;
        b[] bVarArr2 = (b[]) concurrentHashMap.get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        int i3 = 2100;
        boolean z = false;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] bVarArr3 = l;
            if (i2 < 1800) {
                return bVarArr3;
            }
            LocalDateTime localDateTime = LocalDateTime.c;
            LocalDate localDateO = LocalDate.O(i2 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.s(0L);
            long epochSecond = new LocalDateTime(localDateO, LocalTime.h[0]).toEpochSecond(this.b[0]);
            int offset = timeZone.getOffset(epochSecond * 1000);
            long j3 = 31968000 + epochSecond;
            while (epochSecond < j3) {
                long j4 = epochSecond + 7776000;
                if (offset != timeZone.getOffset(j4 * 1000)) {
                    while (j4 - epochSecond > 1) {
                        long jY = j$.desugar.sun.nio.fs.g.y(j4 + epochSecond, 2L);
                        timeZone = timeZone;
                        if (timeZone.getOffset(jY * 1000) == offset) {
                            epochSecond = jY;
                        } else {
                            j4 = jY;
                        }
                    }
                    if (timeZone.getOffset(epochSecond * 1000) == offset) {
                        epochSecond = j4;
                    }
                    ZoneOffset zoneOffsetH = h(offset);
                    int offset2 = timeZone.getOffset(epochSecond * 1000);
                    ZoneOffset zoneOffsetH2 = h(offset2);
                    if (c(epochSecond, zoneOffsetH2) == i2) {
                        b[] bVarArr4 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length + 1);
                        bVarArr4[bVarArr4.length - 1] = new b(epochSecond, zoneOffsetH, zoneOffsetH2);
                        offset = offset2;
                        bVarArr3 = bVarArr4;
                    } else {
                        offset = offset2;
                    }
                } else {
                    epochSecond = j4;
                }
            }
            if (1916 <= i2 && i2 < 2100) {
                concurrentHashMap.putIfAbsent(numValueOf, bVarArr3);
            }
            return bVarArr3;
        }
        byte b2 = 1;
        long j5 = 1;
        d[] dVarArr = this.f;
        b[] bVarArr5 = new b[dVarArr.length];
        int i4 = 0;
        while (i4 < dVarArr.length) {
            d dVar2 = dVarArr[i4];
            ZoneOffset zoneOffset = dVar2.h;
            j$.time.b bVar = dVar2.c;
            byte b3 = dVar2.b;
            j jVar = dVar2.a;
            if (b3 < 0) {
                b = b2;
                long j6 = i2;
                int iS = jVar.s(s.c.isLeapYear(j6)) + b + b3;
                LocalDate localDate = LocalDate.d;
                j$.time.temporal.a.YEAR.s(j6);
                j$.time.temporal.a.DAY_OF_MONTH.s(iS);
                localDateS = LocalDate.s(i2, jVar.getValue(), iS);
                if (bVar != null) {
                    localDateS = localDateS.k(new m(bVar.getValue(), b));
                }
                bVarArr = bVarArr5;
                dVar = dVar2;
            } else {
                b = b2;
                LocalDate localDate2 = LocalDate.d;
                bVarArr = bVarArr5;
                j$.time.temporal.a.YEAR.s(i2);
                j$.time.temporal.a.DAY_OF_MONTH.s(b3);
                localDateS = LocalDate.s(i2, jVar.getValue(), b3);
                if (bVar != null) {
                    localDateS = localDateS.k(new m(bVar.getValue(), (byte) 0));
                }
                dVar = dVar2;
            }
            if (dVar.e) {
                j2 = j5;
                localDateS = localDateS.R(j2);
            } else {
                j2 = j5;
            }
            LocalDateTime localDateTimeB = LocalDateTime.B(localDateS, dVar.d);
            c cVar = dVar.f;
            ZoneOffset zoneOffset2 = dVar.g;
            int iOrdinal = cVar.ordinal();
            if (iOrdinal == 0) {
                localDateTimeB = localDateTimeB.J(zoneOffset.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
            } else if (iOrdinal == 2) {
                localDateTimeB = localDateTimeB.J(zoneOffset.getTotalSeconds() - zoneOffset2.getTotalSeconds());
            }
            bVarArr[i4] = new b(localDateTimeB, zoneOffset, dVar.i);
            i4++;
            j5 = j2;
            bVarArr5 = bVarArr;
            b2 = b;
            i3 = 2100;
            z = false;
        }
        b[] bVarArr6 = bVarArr5;
        if (i2 < i3) {
            concurrentHashMap.putIfAbsent(numValueOf, bVarArr6);
        }
        return bVarArr6;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(j$.time.LocalDateTime r10) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.ZoneRules.d(j$.time.LocalDateTime):java.lang.Object");
    }

    public final b e(LocalDateTime localDateTime) {
        Object objD = d(localDateTime);
        if (objD instanceof b) {
            return (b) objD;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneRules)) {
            return false;
        }
        ZoneRules zoneRules = (ZoneRules) obj;
        return Objects.equals(this.g, zoneRules.g) && Arrays.equals(this.a, zoneRules.a) && Arrays.equals(this.b, zoneRules.b) && Arrays.equals(this.c, zoneRules.c) && Arrays.equals(this.e, zoneRules.e) && Arrays.equals(this.f, zoneRules.f);
    }

    public final List f(LocalDateTime localDateTime) {
        Object objD = d(localDateTime);
        if (!(objD instanceof b)) {
            return Collections.singletonList((ZoneOffset) objD);
        }
        b bVar = (b) objD;
        return bVar.h() ? Collections.EMPTY_LIST : j$.desugar.sun.nio.fs.g.A(new Object[]{bVar.c, bVar.d});
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffsetH;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffsetH = h(timeZone.getRawOffset());
        } else {
            int length = this.c.length;
            ZoneOffset[] zoneOffsetArr = this.b;
            if (length == 0) {
                zoneOffsetH = zoneOffsetArr[0];
            } else {
                int iBinarySearch = Arrays.binarySearch(this.a, instant.getEpochSecond());
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 2;
                }
                zoneOffsetH = zoneOffsetArr[iBinarySearch + 1];
            }
        }
        return !zoneOffsetH.equals(getOffset(instant));
    }

    public ZoneOffset getOffset(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return h(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f.length;
        ZoneOffset[] zoneOffsetArr = this.e;
        if (length <= 0 || epochSecond <= jArr[jArr.length - 1]) {
            int iBinarySearch = Arrays.binarySearch(jArr, epochSecond);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return zoneOffsetArr[iBinarySearch + 1];
        }
        b[] bVarArrB = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
        b bVar = null;
        for (int i2 = 0; i2 < bVarArrB.length; i2++) {
            bVar = bVarArrB[i2];
            if (epochSecond < bVar.a) {
                return bVar.c;
            }
        }
        return bVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) ^ ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e));
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + String.valueOf(this.b[r3.length - 1]) + "]";
    }

    public ZoneOffset getOffset(LocalDateTime localDateTime) {
        Object objD = d(localDateTime);
        if (objD instanceof b) {
            return ((b) objD).c;
        }
        return (ZoneOffset) objD;
    }

    public ZoneRules(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    public ZoneRules(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {h(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }
}
