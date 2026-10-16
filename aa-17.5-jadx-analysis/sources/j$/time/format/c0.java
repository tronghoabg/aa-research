package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class c0 implements j$.time.temporal.k {
    public ZoneId b;
    public j$.time.chrono.a c;
    public boolean d;
    public d0 e;
    public j$.time.chrono.b f;
    public LocalTime g;
    public final HashMap a = new HashMap();
    public j$.time.p h = j$.time.p.d;

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        Objects.a(nVar, "field");
        Long l = (Long) this.a.get(nVar);
        if (l != null) {
            return l.longValue();
        }
        j$.time.chrono.b bVar = this.f;
        if (bVar != null && bVar.d(nVar)) {
            return this.f.C(nVar);
        }
        LocalTime localTime = this.g;
        if (localTime != null && localTime.d(nVar)) {
            return this.g.C(nVar);
        }
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        j$.time.g.e("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0L;
    }

    public final void c(j$.time.temporal.k kVar) {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.n nVar = (j$.time.temporal.n) entry.getKey();
            if (kVar.d(nVar)) {
                try {
                    long jC = kVar.C(nVar);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jC != jLongValue) {
                        throw new DateTimeException("Conflict found: Field " + String.valueOf(nVar) + " " + jC + " differs from " + String.valueOf(nVar) + " " + jLongValue + " derived from " + String.valueOf(kVar));
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        if (this.a.containsKey(nVar)) {
            return true;
        }
        j$.time.chrono.b bVar = this.f;
        if (bVar != null && bVar.d(nVar)) {
            return true;
        }
        LocalTime localTime = this.g;
        if (localTime == null || !localTime.d(nVar)) {
            return (nVar == null || (nVar instanceof j$.time.temporal.a) || !nVar.h(this)) ? false : true;
        }
        return true;
    }

    public final void f() {
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        HashMap map = this.a;
        if (map.containsKey(aVar)) {
            ZoneId zoneId = this.b;
            if (zoneId != null) {
                i(zoneId);
                return;
            }
            Long l = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l != null) {
                i(ZoneOffset.ofTotalSeconds(l.intValue()));
            }
        }
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int h(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.a(this, nVar);
    }

    public final void i(ZoneId zoneId) {
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        o(this.c.N(Instant.r(((Long) this.a.remove(aVar)).longValue(), 0), zoneId).toLocalDate());
        p(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(r5.toLocalTime().toSecondOfDay()));
    }

    public final void j(long j, long j2, long j3, long j4) {
        if (this.e == d0.LENIENT) {
            long jG = j$.desugar.sun.nio.fs.g.G(j$.desugar.sun.nio.fs.g.G(j$.desugar.sun.nio.fs.g.G(j$.desugar.sun.nio.fs.g.H(j, 3600000000000L), j$.desugar.sun.nio.fs.g.H(j2, 60000000000L)), j$.desugar.sun.nio.fs.g.H(j3, 1000000000L)), j4);
            n(LocalTime.I(j$.desugar.sun.nio.fs.g.F(jG, 86400000000000L)), j$.time.p.a(0, 0, (int) j$.desugar.sun.nio.fs.g.y(jG, 86400000000000L)));
            return;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.MINUTE_OF_HOUR;
        int iA = aVar.b.a(j2, aVar);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
        int iA2 = aVar2.b.a(j4, aVar2);
        if (this.e == d0.SMART && j == 24 && iA == 0 && j3 == 0 && iA2 == 0) {
            n(LocalTime.g, j$.time.p.a(0, 0, 1));
            return;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.HOUR_OF_DAY;
        int iA3 = aVar3.b.a(j, aVar3);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.SECOND_OF_MINUTE;
        n(LocalTime.H(iA3, iA, aVar4.b.a(j3, aVar4), iA2), j$.time.p.d);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ j$.time.temporal.q l(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.d(this, nVar);
    }

    public final void m() {
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        HashMap map = this.a;
        if (map.containsKey(aVar)) {
            long jLongValue = ((Long) map.remove(aVar)).longValue();
            d0 d0Var = this.e;
            if (d0Var == d0.STRICT || (d0Var == d0.SMART && jLongValue != 0)) {
                aVar.s(jLongValue);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            p(aVar, aVar2, Long.valueOf(jLongValue));
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (map.containsKey(aVar3)) {
            long jLongValue2 = ((Long) map.remove(aVar3)).longValue();
            d0 d0Var2 = this.e;
            if (d0Var2 == d0.STRICT || (d0Var2 == d0.SMART && jLongValue2 != 0)) {
                aVar3.s(jLongValue2);
            }
            p(aVar3, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.AMPM_OF_DAY;
        if (map.containsKey(aVar4)) {
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (map.containsKey(aVar5)) {
                long jLongValue3 = ((Long) map.remove(aVar4)).longValue();
                long jLongValue4 = ((Long) map.remove(aVar5)).longValue();
                if (this.e == d0.LENIENT) {
                    p(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(j$.desugar.sun.nio.fs.g.G(j$.desugar.sun.nio.fs.g.H(jLongValue3, 12L), jLongValue4)));
                } else {
                    aVar4.s(jLongValue3);
                    aVar5.s(jLongValue3);
                    p(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.NANO_OF_DAY;
        if (map.containsKey(aVar6)) {
            long jLongValue5 = ((Long) map.remove(aVar6)).longValue();
            if (this.e != d0.LENIENT) {
                aVar6.s(jLongValue5);
            }
            p(aVar6, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            p(aVar6, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            p(aVar6, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            p(aVar6, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MICRO_OF_DAY;
        if (map.containsKey(aVar7)) {
            long jLongValue6 = ((Long) map.remove(aVar7)).longValue();
            if (this.e != d0.LENIENT) {
                aVar7.s(jLongValue6);
            }
            p(aVar7, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            p(aVar7, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MILLI_OF_DAY;
        if (map.containsKey(aVar8)) {
            long jLongValue7 = ((Long) map.remove(aVar8)).longValue();
            if (this.e != d0.LENIENT) {
                aVar8.s(jLongValue7);
            }
            p(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            p(aVar8, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.SECOND_OF_DAY;
        if (map.containsKey(aVar9)) {
            long jLongValue8 = ((Long) map.remove(aVar9)).longValue();
            if (this.e != d0.LENIENT) {
                aVar9.s(jLongValue8);
            }
            p(aVar9, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            p(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            p(aVar9, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (map.containsKey(aVar10)) {
            long jLongValue9 = ((Long) map.remove(aVar10)).longValue();
            if (this.e != d0.LENIENT) {
                aVar10.s(jLongValue9);
            }
            p(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            p(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        j$.time.temporal.a aVar11 = j$.time.temporal.a.NANO_OF_SECOND;
        if (map.containsKey(aVar11)) {
            long jLongValue10 = ((Long) map.get(aVar11)).longValue();
            d0 d0Var3 = this.e;
            d0 d0Var4 = d0.LENIENT;
            if (d0Var3 != d0Var4) {
                aVar11.s(jLongValue10);
            }
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (map.containsKey(aVar12)) {
                long jLongValue11 = ((Long) map.remove(aVar12)).longValue();
                if (this.e != d0Var4) {
                    aVar12.s(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                p(aVar12, aVar11, Long.valueOf(jLongValue10));
            }
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar13)) {
                long jLongValue12 = ((Long) map.remove(aVar13)).longValue();
                if (this.e != d0Var4) {
                    aVar13.s(jLongValue12);
                }
                p(aVar13, aVar11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        j$.time.temporal.a aVar14 = j$.time.temporal.a.HOUR_OF_DAY;
        if (map.containsKey(aVar14)) {
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (map.containsKey(aVar15)) {
                j$.time.temporal.a aVar16 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (map.containsKey(aVar16) && map.containsKey(aVar11)) {
                    j(((Long) map.remove(aVar14)).longValue(), ((Long) map.remove(aVar15)).longValue(), ((Long) map.remove(aVar16)).longValue(), ((Long) map.remove(aVar11)).longValue());
                }
            }
        }
    }

    public final void n(LocalTime localTime, j$.time.p pVar) {
        LocalTime localTime2 = this.g;
        if (localTime2 == null) {
            this.g = localTime;
            this.h = pVar;
            return;
        }
        if (!localTime2.equals(localTime)) {
            j$.time.g.g(j$.time.e.a("Conflict found: Fields resolved to different times: ", String.valueOf(this.g), " ", String.valueOf(localTime)));
            return;
        }
        j$.time.p pVar2 = this.h;
        j$.time.p pVar3 = j$.time.p.d;
        if (pVar2 == pVar3 || pVar == pVar3 || pVar2.equals(pVar)) {
            this.h = pVar;
        } else {
            j$.time.g.g(j$.time.e.a("Conflict found: Fields resolved to different excess periods: ", String.valueOf(this.h), " ", String.valueOf(pVar)));
        }
    }

    public final void o(j$.time.chrono.b bVar) {
        j$.time.chrono.b bVar2 = this.f;
        if (bVar2 != null) {
            if (bVar == null || bVar2.equals(bVar)) {
                return;
            }
            j$.time.g.g(j$.time.e.a("Conflict found: Fields resolved to two different dates: ", String.valueOf(this.f), " ", String.valueOf(bVar)));
            return;
        }
        if (bVar != null) {
            if (this.c.equals(bVar.getChronology())) {
                this.f = bVar;
            } else {
                j$.time.g.g("ChronoLocalDate must use the effective parsed chronology: ".concat(String.valueOf(this.c)));
            }
        }
    }

    public final void p(j$.time.temporal.n nVar, j$.time.temporal.a aVar, Long l) {
        Long l2 = (Long) this.a.put(aVar, l);
        if (l2 == null || l2.longValue() == l.longValue()) {
            return;
        }
        throw new DateTimeException("Conflict found: " + String.valueOf(aVar) + " " + l2 + " differs from " + String.valueOf(aVar) + " " + l + " while resolving  " + String.valueOf(nVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            j$.time.chrono.b bVar = this.f;
            if (bVar != null) {
                sb.append(bVar);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.o.a) {
            return this.b;
        }
        if (nVar == j$.time.temporal.o.b) {
            return this.c;
        }
        if (nVar == j$.time.temporal.o.f) {
            j$.time.chrono.b bVar = this.f;
            if (bVar != null) {
                return LocalDate.A(bVar);
            }
            return null;
        }
        if (nVar == j$.time.temporal.o.g) {
            return this.g;
        }
        if (nVar == j$.time.temporal.o.d) {
            Long l = (Long) this.a.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l != null) {
                return ZoneOffset.ofTotalSeconds(l.intValue());
            }
            ZoneId zoneId = this.b;
            return zoneId instanceof ZoneOffset ? zoneId : nVar.c(this);
        }
        if (nVar == j$.time.temporal.o.e) {
            return nVar.c(this);
        }
        if (nVar == j$.time.temporal.o.c) {
            return null;
        }
        return nVar.c(this);
    }
}
