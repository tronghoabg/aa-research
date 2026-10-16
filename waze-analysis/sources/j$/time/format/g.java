package j$.time.format;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import java.util.Locale;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class g implements e {
    @Override // j$.time.format.e
    public final boolean f(w wVar, StringBuilder sb) {
        Long lA = wVar.a(j$.time.temporal.a.INSTANT_SECONDS);
        TemporalAccessor temporalAccessor = wVar.f49999a;
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long lValueOf = temporalAccessor.c(aVar) ? Long.valueOf(temporalAccessor.D(aVar)) : null;
        int i2 = 0;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int iA = aVar.f50048b.a(lValueOf != null ? lValueOf.longValue() : 0L, aVar);
        if (jLongValue >= -62167219200L) {
            long j2 = jLongValue - 253402300800L;
            long jF = j$.com.android.tools.r8.a.F(j2, 315569520000L) + 1;
            LocalDateTime localDateTimeO = LocalDateTime.O(j$.com.android.tools.r8.a.O(j2, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jF > 0) {
                sb.append('+');
                sb.append(jF);
            }
            sb.append(localDateTimeO);
            if (localDateTimeO.f49806b.f49812c == 0) {
                sb.append(":00");
            }
        } else {
            long j3 = jLongValue + 62167219200L;
            long j4 = j3 / 315569520000L;
            long j5 = j3 % 315569520000L;
            LocalDateTime localDateTimeO2 = LocalDateTime.O(j5 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeO2);
            if (localDateTimeO2.f49806b.f49812c == 0) {
                sb.append(":00");
            }
            if (j4 < 0) {
                if (localDateTimeO2.f49805a.getYear() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j4 - 1));
                } else if (j5 == 0) {
                    sb.insert(length, j4);
                } else {
                    sb.insert(length + 1, Math.abs(j4));
                }
            }
        }
        if (iA > 0) {
            sb.append('.');
            int i3 = 100000000;
            while (true) {
                if (iA <= 0 && i2 % 3 == 0 && i2 >= -2) {
                    break;
                }
                int i4 = iA / i3;
                sb.append((char) (i4 + 48));
                iA -= i4 * i3;
                i3 /= 10;
                i2++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // j$.time.format.e
    public final int h(u uVar, CharSequence charSequence, int i2) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.a(DateTimeFormatter.ISO_LOCAL_DATE);
        dateTimeFormatterBuilder.d('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        dateTimeFormatterBuilder.m(aVar, 2);
        dateTimeFormatterBuilder.d(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder.m(aVar2, 2);
        dateTimeFormatterBuilder.d(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder.m(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        int i3 = 1;
        dateTimeFormatterBuilder.b(aVar4, 0, 9, true);
        dateTimeFormatterBuilder.d('Z');
        d dVar = dateTimeFormatterBuilder.r(Locale.getDefault(), b0.SMART, null).f49899a;
        if (dVar.f49936b) {
            dVar = new d(dVar.f49935a, false);
        }
        u uVar2 = new u(uVar.f49990a);
        uVar2.f49991b = uVar.f49991b;
        uVar2.f49992c = uVar.f49992c;
        int iH = dVar.h(uVar2, charSequence, i2);
        if (iH < 0) {
            return iH;
        }
        long jLongValue = uVar2.d(j$.time.temporal.a.YEAR).longValue();
        int iIntValue = uVar2.d(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int iIntValue2 = uVar2.d(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int iIntValue3 = uVar2.d(aVar).intValue();
        int iIntValue4 = uVar2.d(aVar2).intValue();
        Long lD = uVar2.d(aVar3);
        Long lD2 = uVar2.d(aVar4);
        int iIntValue5 = lD != null ? lD.intValue() : 0;
        int iIntValue6 = lD2 != null ? lD2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            iIntValue3 = 0;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            uVar.c().f49926d = true;
            i3 = 0;
            iIntValue5 = 59;
        } else {
            i3 = 0;
        }
        int i4 = ((int) jLongValue) % 10000;
        try {
            LocalDateTime localDateTime = LocalDateTime.f49803c;
            LocalDate localDateOf = LocalDate.of(i4, iIntValue, iIntValue2);
            LocalTime localTimeO = LocalTime.O(iIntValue3, iIntValue4, iIntValue5, 0);
            return uVar.f(aVar4, iIntValue6, i2, uVar.f(j$.time.temporal.a.INSTANT_SECONDS, new LocalDateTime(localDateOf, localTimeO).T(localDateOf.W(i3), localTimeO).toEpochSecond(ZoneOffset.UTC) + j$.com.android.tools.r8.a.Q(jLongValue / 10000, 315569520000L), i2, iH));
        } catch (RuntimeException unused) {
            return ~i2;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
