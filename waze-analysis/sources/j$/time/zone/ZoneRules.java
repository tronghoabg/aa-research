package j$.time.zone;

import com.waze.strings.DisplayStrings;
import j$.desugar.sun.nio.fs.h;
import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.chrono.r;
import j$.time.temporal.l;
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

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class ZoneRules implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final long[] f50085i = new long[0];

    /* renamed from: j, reason: collision with root package name */
    public static final d[] f50086j = new d[0];

    /* renamed from: k, reason: collision with root package name */
    public static final LocalDateTime[] f50087k = new LocalDateTime[0];

    /* renamed from: l, reason: collision with root package name */
    public static final b[] f50088l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a, reason: collision with root package name */
    public final long[] f50089a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset[] f50090b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f50091c;

    /* renamed from: d, reason: collision with root package name */
    public final LocalDateTime[] f50092d;

    /* renamed from: e, reason: collision with root package name */
    public final ZoneOffset[] f50093e;

    /* renamed from: f, reason: collision with root package name */
    public final d[] f50094f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeZone f50095g;

    /* renamed from: h, reason: collision with root package name */
    public final transient ConcurrentHashMap f50096h = new ConcurrentHashMap();

    public ZoneRules(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, d[] dVarArr) {
        this.f50089a = jArr;
        this.f50090b = zoneOffsetArr;
        this.f50091c = jArr2;
        this.f50093e = zoneOffsetArr2;
        this.f50094f = dVarArr;
        if (jArr2.length == 0) {
            this.f50092d = f50087k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                ZoneOffset zoneOffset = zoneOffsetArr2[i2];
                int i3 = i2 + 1;
                ZoneOffset zoneOffset2 = zoneOffsetArr2[i3];
                LocalDateTime localDateTimeO = LocalDateTime.O(jArr2[i2], 0, zoneOffset);
                if (zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds()) {
                    arrayList.add(localDateTimeO);
                    arrayList.add(localDateTimeO.Q(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                } else {
                    arrayList.add(localDateTimeO.Q(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                    arrayList.add(localDateTimeO);
                }
                i2 = i3;
            }
            this.f50092d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f50095g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(j$.time.LocalDateTime r6, j$.time.zone.b r7) {
        /*
            j$.time.LocalDateTime r0 = r7.f50100b
            j$.time.LocalDateTime r1 = r7.f50100b
            j$.time.ZoneOffset r2 = r7.f50102d
            j$.time.ZoneOffset r3 = r7.f50101c
            boolean r4 = r7.f()
            if (r4 == 0) goto L2a
            boolean r0 = r6.M(r0)
            if (r0 == 0) goto L15
            goto L45
        L15:
            int r0 = r2.getTotalSeconds()
            int r3 = r3.getTotalSeconds()
            int r0 = r0 - r3
            long r3 = (long) r0
            j$.time.LocalDateTime r0 = r1.Q(r3)
            boolean r6 = r6.M(r0)
            if (r6 == 0) goto L30
            goto L46
        L2a:
            boolean r0 = r6.M(r0)
            if (r0 != 0) goto L31
        L30:
            return r2
        L31:
            int r0 = r2.getTotalSeconds()
            int r2 = r3.getTotalSeconds()
            int r0 = r0 - r2
            long r4 = (long) r0
            j$.time.LocalDateTime r0 = r1.Q(r4)
            boolean r6 = r6.M(r0)
            if (r6 == 0) goto L46
        L45:
            return r3
        L46:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.ZoneRules.a(j$.time.LocalDateTime, j$.time.zone.b):java.lang.Object");
    }

    public static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.ofEpochDay(j$.com.android.tools.r8.a.F(j2 + zoneOffset.getTotalSeconds(), 86400L)).getYear();
    }

    public static ZoneOffset i(int i2) {
        return ZoneOffset.S(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f50095g != null ? (byte) 100 : (byte) 1, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b[] b(int i2) {
        int i3;
        b[] bVarArr;
        LocalDate localDateL;
        int i4;
        d dVar;
        long j2;
        Integer numValueOf = Integer.valueOf(i2);
        ConcurrentHashMap concurrentHashMap = this.f50096h;
        b[] bVarArr2 = (b[]) concurrentHashMap.get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        int i5 = DisplayStrings.DS_ALERT_TITLE_ACCIDENT;
        int i6 = 0;
        TimeZone timeZone = this.f50095g;
        if (timeZone != null) {
            b[] bVarArr3 = f50088l;
            if (i2 < 1800) {
                return bVarArr3;
            }
            LocalDateTime localDateTime = LocalDateTime.f49803c;
            LocalDate localDateOf = LocalDate.of(i2 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.z(0L);
            long epochSecond = new LocalDateTime(localDateOf, LocalTime.f49809g[0]).toEpochSecond(this.f50090b[0]);
            int offset = timeZone.getOffset(epochSecond * 1000);
            long j3 = 31968000 + epochSecond;
            while (epochSecond < j3) {
                long j4 = epochSecond + 7776000;
                if (offset != timeZone.getOffset(j4 * 1000)) {
                    while (j4 - epochSecond > 1) {
                        long jF = j$.com.android.tools.r8.a.F(j4 + epochSecond, 2L);
                        timeZone = timeZone;
                        if (timeZone.getOffset(jF * 1000) == offset) {
                            epochSecond = jF;
                        } else {
                            j4 = jF;
                        }
                    }
                    if (timeZone.getOffset(epochSecond * 1000) == offset) {
                        epochSecond = j4;
                    }
                    ZoneOffset zoneOffsetI = i(offset);
                    int offset2 = timeZone.getOffset(epochSecond * 1000);
                    ZoneOffset zoneOffsetI2 = i(offset2);
                    if (c(epochSecond, zoneOffsetI2) == i2) {
                        b[] bVarArr4 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length + 1);
                        bVarArr4[bVarArr4.length - 1] = new b(epochSecond, zoneOffsetI, zoneOffsetI2);
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
        int i7 = 1;
        long j5 = 1;
        d[] dVarArr = this.f50094f;
        b[] bVarArr5 = new b[dVarArr.length];
        int i8 = 0;
        while (i8 < dVarArr.length) {
            d dVar2 = dVarArr[i8];
            ZoneOffset zoneOffset = dVar2.f50111h;
            DayOfWeek dayOfWeek = dVar2.f50106c;
            byte b2 = dVar2.f50105b;
            Month month = dVar2.f50104a;
            if (b2 < 0) {
                int i9 = i7;
                long j6 = i2;
                int iL = month.L(r.f49878d.isLeapYear(j6)) + 1 + b2;
                LocalDate localDate = LocalDate.f49798d;
                j$.time.temporal.a.YEAR.z(j6);
                Objects.requireNonNull(month, "month");
                j$.time.temporal.a.DAY_OF_MONTH.z(iL);
                localDateL = LocalDate.L(i2, month.getValue(), iL);
                if (dayOfWeek != null) {
                    i3 = i9;
                    localDateL = localDateL.h(new l(dayOfWeek.getValue(), i3));
                } else {
                    i3 = i9;
                }
                bVarArr = bVarArr5;
                i4 = i6;
                dVar = dVar2;
            } else {
                i3 = i7;
                LocalDate localDate2 = LocalDate.f49798d;
                bVarArr = bVarArr5;
                j$.time.temporal.a.YEAR.z(i2);
                Objects.requireNonNull(month, "month");
                j$.time.temporal.a.DAY_OF_MONTH.z(b2);
                localDateL = LocalDate.L(i2, month.getValue(), b2);
                if (dayOfWeek != null) {
                    i4 = 0;
                    localDateL = localDateL.h(new l(dayOfWeek.getValue(), i4));
                } else {
                    i4 = 0;
                }
                dVar = dVar2;
            }
            if (dVar.f50108e) {
                j2 = j5;
                localDateL = localDateL.W(j2);
            } else {
                j2 = j5;
            }
            LocalDateTime localDateTimeN = LocalDateTime.N(localDateL, dVar.f50107d);
            c cVar = dVar.f50109f;
            ZoneOffset zoneOffset2 = dVar.f50110g;
            int iOrdinal = cVar.ordinal();
            if (iOrdinal == 0) {
                localDateTimeN = localDateTimeN.Q(zoneOffset.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
            } else if (iOrdinal == 2) {
                localDateTimeN = localDateTimeN.Q(zoneOffset.getTotalSeconds() - zoneOffset2.getTotalSeconds());
            }
            bVarArr[i8] = new b(localDateTimeN, zoneOffset, dVar.f50112i);
            i8++;
            j5 = j2;
            i7 = i3;
            i5 = DisplayStrings.DS_ALERT_TITLE_ACCIDENT;
            i6 = i4;
            bVarArr5 = bVarArr;
        }
        b[] bVarArr6 = bVarArr5;
        if (i2 >= i5) {
            return bVarArr6;
        }
        concurrentHashMap.putIfAbsent(numValueOf, bVarArr6);
        return bVarArr6;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f50095g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f50091c;
        if (jArr.length == 0) {
            return this.f50090b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f50094f.length;
        ZoneOffset[] zoneOffsetArr = this.f50093e;
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
            if (epochSecond < bVar.f50099a) {
                return bVar.f50101c;
            }
        }
        return bVar.f50102d;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(j$.time.LocalDateTime r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.ZoneRules.e(j$.time.LocalDateTime):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneRules)) {
            return false;
        }
        ZoneRules zoneRules = (ZoneRules) obj;
        return Objects.equals(this.f50095g, zoneRules.f50095g) && Arrays.equals(this.f50089a, zoneRules.f50089a) && Arrays.equals(this.f50090b, zoneRules.f50090b) && Arrays.equals(this.f50091c, zoneRules.f50091c) && Arrays.equals(this.f50093e, zoneRules.f50093e) && Arrays.equals(this.f50094f, zoneRules.f50094f);
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        return bVar.f() ? Collections.EMPTY_LIST : j$.com.android.tools.r8.a.I(new Object[]{bVar.f50101c, bVar.f50102d});
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffsetI;
        TimeZone timeZone = this.f50095g;
        if (timeZone != null) {
            zoneOffsetI = i(timeZone.getRawOffset());
        } else {
            int length = this.f50091c.length;
            ZoneOffset[] zoneOffsetArr = this.f50090b;
            if (length == 0) {
                zoneOffsetI = zoneOffsetArr[0];
            } else {
                int iBinarySearch = Arrays.binarySearch(this.f50089a, instant.getEpochSecond());
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 2;
                }
                zoneOffsetI = zoneOffsetArr[iBinarySearch + 1];
            }
        }
        return !zoneOffsetI.equals(d(instant));
    }

    public ZoneOffset getOffset(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        return objE instanceof b ? ((b) objE).f50101c : (ZoneOffset) objE;
    }

    public final boolean h() {
        b bVar;
        TimeZone timeZone = this.f50095g;
        if (timeZone != null) {
            if (timeZone.useDaylightTime() || timeZone.getDSTSavings() != 0) {
                return false;
            }
            Instant instantNow = Instant.now();
            long epochSecond = instantNow.getEpochSecond();
            if (instantNow.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                epochSecond++;
            }
            int iC = c(epochSecond, d(instantNow));
            b[] bVarArrB = b(iC);
            int length = bVarArrB.length - 1;
            while (true) {
                if (length >= 0) {
                    bVar = bVarArrB[length];
                    if (epochSecond > bVar.f50099a) {
                        break;
                    }
                    length--;
                } else {
                    bVar = null;
                    if (iC > 1800) {
                        b[] bVarArrB2 = b(iC - 1);
                        int length2 = bVarArrB2.length - 1;
                        while (true) {
                            if (length2 >= 0) {
                                b bVar2 = bVarArrB2[length2];
                                if (epochSecond > bVar2.f50099a) {
                                    bVar = bVar2;
                                    break;
                                }
                                length2--;
                            } else {
                                int i2 = j$.time.b.f49834a;
                                j$.time.a.f49832c.getClass();
                                long jMin = Math.min(epochSecond - 31104000, (System.currentTimeMillis() / 1000) + 31968000);
                                int offset = timeZone.getOffset((epochSecond - 1) * 1000);
                                long epochDay = LocalDate.of(DisplayStrings.DS_BEACONS_GO_TO_SETTINGS_FOR_PERMISSIONS_BUTTON2, 1, 1).toEpochDay() * 86400;
                                while (true) {
                                    if (epochDay > jMin) {
                                        break;
                                    }
                                    int offset2 = timeZone.getOffset(jMin * 1000);
                                    if (offset != offset2) {
                                        int iC2 = c(jMin, i(offset2));
                                        b[] bVarArrB3 = b(iC2 + 1);
                                        int length3 = bVarArrB3.length - 1;
                                        while (true) {
                                            if (length3 < 0) {
                                                b[] bVarArrB4 = b(iC2);
                                                bVar = bVarArrB4[bVarArrB4.length - 1];
                                                break;
                                            }
                                            bVar = bVarArrB3[length3];
                                            if (epochSecond > bVar.f50099a) {
                                                break;
                                            }
                                            length3--;
                                        }
                                    } else {
                                        jMin -= 7776000;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (bVar != null) {
                return false;
            }
        } else if (this.f50091c.length != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f50094f) ^ ((((Objects.hashCode(this.f50095g) ^ Arrays.hashCode(this.f50089a)) ^ Arrays.hashCode(this.f50090b)) ^ Arrays.hashCode(this.f50091c)) ^ Arrays.hashCode(this.f50093e));
    }

    public final String toString() {
        TimeZone timeZone = this.f50095g;
        if (timeZone != null) {
            return h.a("ZoneRules[timeZone=", timeZone.getID(), "]");
        }
        return h.a("ZoneRules[currentStandardOffset=", String.valueOf(this.f50090b[r2.length - 1]), "]");
    }

    public ZoneRules(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f50090b = zoneOffsetArr;
        long[] jArr = f50085i;
        this.f50089a = jArr;
        this.f50091c = jArr;
        this.f50092d = f50087k;
        this.f50093e = zoneOffsetArr;
        this.f50094f = f50086j;
        this.f50095g = null;
    }

    public ZoneRules(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {i(timeZone.getRawOffset())};
        this.f50090b = zoneOffsetArr;
        long[] jArr = f50085i;
        this.f50089a = jArr;
        this.f50091c = jArr;
        this.f50092d = f50087k;
        this.f50093e = zoneOffsetArr;
        this.f50094f = f50086j;
        this.f50095g = timeZone;
    }
}
