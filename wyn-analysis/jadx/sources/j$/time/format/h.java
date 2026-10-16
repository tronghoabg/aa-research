package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC2901i;
import j$.time.temporal.TemporalAccessor;

/* loaded from: classes2.dex */
final class h implements f {
    @Override // j$.time.format.f
    public final boolean o(t tVar, StringBuilder sb2) {
        boolean z2;
        Long lE = tVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        TemporalAccessor temporalAccessorD = tVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long lValueOf = temporalAccessorD.g(aVar) ? Long.valueOf(tVar.d().w(aVar)) : null;
        int i5 = 0;
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        int iR = aVar.R(lValueOf != null ? lValueOf.longValue() : 0L);
        if (jLongValue >= -62167219200L) {
            long j8 = jLongValue - 253402300800L;
            long jF = j$.time.b.f(j8, 315569520000L) + 1;
            LocalDateTime localDateTimeG0 = LocalDateTime.g0(j$.time.b.e(j8, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jF > 0) {
                sb2.append('+');
                sb2.append(jF);
            }
            sb2.append(localDateTimeG0);
            if (localDateTimeG0.Z() == 0) {
                sb2.append(":00");
            }
            z2 = true;
        } else {
            long j10 = jLongValue + 62167219200L;
            z2 = true;
            long j11 = j10 / 315569520000L;
            long j12 = j10 % 315569520000L;
            LocalDateTime localDateTimeG02 = LocalDateTime.g0(j12 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb2.length();
            sb2.append(localDateTimeG02);
            if (localDateTimeG02.Z() == 0) {
                sb2.append(":00");
            }
            if (j11 < 0) {
                if (localDateTimeG02.a0() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j11 - 1));
                } else if (j12 == 0) {
                    sb2.insert(length, j11);
                } else {
                    sb2.insert(length + 1, Math.abs(j11));
                }
            }
        }
        if (iR > 0) {
            sb2.append('.');
            int i10 = 100000000;
            while (true) {
                if (iR <= 0 && i5 % 3 == 0 && i5 >= -2) {
                    break;
                }
                int i11 = iR / i10;
                sb2.append((char) (i11 + 48));
                iR -= i11 * i10;
                i10 /= 10;
                i5++;
            }
        }
        sb2.append('Z');
        return z2;
    }

    @Override // j$.time.format.f
    public final int q(q qVar, CharSequence charSequence, int i5) {
        int i10;
        int i11;
        p pVar = new p();
        pVar.a(DateTimeFormatter.ISO_LOCAL_DATE);
        pVar.e('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        pVar.k(aVar, 2);
        pVar.e(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        pVar.k(aVar2, 2);
        pVar.e(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        pVar.k(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        pVar.b(aVar4);
        pVar.e('Z');
        e eVarF = pVar.t().f();
        q qVarC = qVar.c();
        int iQ = eVarF.q(qVarC, charSequence, i5);
        if (iQ < 0) {
            return iQ;
        }
        long jLongValue = qVarC.i(j$.time.temporal.a.YEAR).longValue();
        int iIntValue = qVarC.i(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int iIntValue2 = qVarC.i(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int iIntValue3 = qVarC.i(aVar).intValue();
        int iIntValue4 = qVarC.i(aVar2).intValue();
        Long lI = qVarC.i(aVar3);
        Long lI2 = qVarC.i(aVar4);
        int i12 = 0;
        int iIntValue5 = lI != null ? lI.intValue() : 0;
        int iIntValue6 = lI2 != null ? lI2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            i11 = iIntValue5;
            i10 = 0;
            i12 = 1;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            qVar.o();
            i10 = iIntValue3;
            i11 = 59;
        } else {
            i10 = iIntValue3;
            i11 = iIntValue5;
        }
        try {
            LocalDateTime localDateTimePlusDays = LocalDateTime.e0(((int) jLongValue) % 10000, iIntValue, iIntValue2, i10, iIntValue4, i11, 0).plusDays(i12);
            ZoneOffset zoneOffset = ZoneOffset.UTC;
            localDateTimePlusDays.getClass();
            return qVar.n(aVar4, iIntValue6, i5, qVar.n(j$.time.temporal.a.INSTANT_SECONDS, AbstractC2901i.o(localDateTimePlusDays, zoneOffset) + j$.time.b.g(jLongValue / 10000, 315569520000L), i5, iQ));
        } catch (RuntimeException unused) {
            return ~i5;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
