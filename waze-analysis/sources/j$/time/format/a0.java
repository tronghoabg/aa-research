package j$.time.format;

import androidx.media3.common.C;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class a0 implements TemporalAccessor {

    /* renamed from: b, reason: collision with root package name */
    public ZoneId f49924b;

    /* renamed from: c, reason: collision with root package name */
    public Chronology f49925c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f49926d;

    /* renamed from: e, reason: collision with root package name */
    public b0 f49927e;

    /* renamed from: f, reason: collision with root package name */
    public j$.time.chrono.b f49928f;

    /* renamed from: g, reason: collision with root package name */
    public LocalTime f49929g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f49923a = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public j$.time.n f49930h = j$.time.n.f50019d;

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.m mVar) {
        Objects.requireNonNull(mVar, "field");
        Long l2 = (Long) this.f49923a.get(mVar);
        if (l2 != null) {
            return l2.longValue();
        }
        j$.time.chrono.b bVar = this.f49928f;
        if (bVar != null && bVar.c(mVar)) {
            return this.f49928f.D(mVar);
        }
        LocalTime localTime = this.f49929g;
        if (localTime != null && localTime.c(mVar)) {
            return this.f49929g.D(mVar);
        }
        if (!(mVar instanceof j$.time.temporal.a)) {
            return mVar.k(this);
        }
        j$.time.f.f("Unsupported field: ".concat(String.valueOf(mVar)));
        return 0L;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.m mVar) {
        if (this.f49923a.containsKey(mVar)) {
            return true;
        }
        j$.time.chrono.b bVar = this.f49928f;
        if (bVar != null && bVar.c(mVar)) {
            return true;
        }
        LocalTime localTime = this.f49929g;
        if (localTime == null || !localTime.c(mVar)) {
            return (mVar == null || (mVar instanceof j$.time.temporal.a) || !mVar.f(this)) ? false : true;
        }
        return true;
    }

    public final void e(TemporalAccessor temporalAccessor) {
        Iterator it = this.f49923a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.m mVar = (j$.time.temporal.m) entry.getKey();
            if (temporalAccessor.c(mVar)) {
                try {
                    long jD = temporalAccessor.D(mVar);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jD != jLongValue) {
                        throw new j$.time.c("Conflict found: Field " + String.valueOf(mVar) + " " + jD + " differs from " + String.valueOf(mVar) + " " + jLongValue + " derived from " + String.valueOf(temporalAccessor));
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int f(j$.time.temporal.m mVar) {
        return j$.time.temporal.n.a(this, mVar);
    }

    public final void g() {
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        HashMap map = this.f49923a;
        if (map.containsKey(aVar)) {
            ZoneId zoneId = this.f49924b;
            if (zoneId != null) {
                i(zoneId);
                return;
            }
            Long l2 = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l2 != null) {
                i(ZoneOffset.S(l2.intValue()));
            }
        }
    }

    public final void i(ZoneId zoneId) {
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        n(this.f49925c.J(Instant.ofEpochSecond(((Long) this.f49923a.remove(aVar)).longValue()), zoneId).toLocalDate());
        o(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(r5.toLocalTime().toSecondOfDay()));
    }

    public final void j(long j2, long j3, long j4, long j5) {
        if (this.f49927e == b0.LENIENT) {
            long jP = j$.com.android.tools.r8.a.P(j$.com.android.tools.r8.a.P(j$.com.android.tools.r8.a.P(j$.com.android.tools.r8.a.Q(j2, 3600000000000L), j$.com.android.tools.r8.a.Q(j3, 60000000000L)), j$.com.android.tools.r8.a.Q(j4, C.NANOS_PER_SECOND)), j5);
            m(LocalTime.P(j$.com.android.tools.r8.a.O(jP, 86400000000000L)), j$.time.n.a(0, 0, (int) j$.com.android.tools.r8.a.F(jP, 86400000000000L)));
            return;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.MINUTE_OF_HOUR;
        int iA = aVar.f50048b.a(j3, aVar);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
        int iA2 = aVar2.f50048b.a(j5, aVar2);
        if (this.f49927e == b0.SMART && j2 == 24 && iA == 0 && j4 == 0 && iA2 == 0) {
            m(LocalTime.MIDNIGHT, j$.time.n.a(0, 0, 1));
            return;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.HOUR_OF_DAY;
        int iA3 = aVar3.f50048b.a(j2, aVar3);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.SECOND_OF_MINUTE;
        m(LocalTime.O(iA3, iA, aVar4.f50048b.a(j4, aVar4), iA2), j$.time.n.f50019d);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ j$.time.temporal.p k(j$.time.temporal.m mVar) {
        return j$.time.temporal.n.d(this, mVar);
    }

    public final void l() {
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        HashMap map = this.f49923a;
        if (map.containsKey(aVar)) {
            long jLongValue = ((Long) map.remove(aVar)).longValue();
            b0 b0Var = this.f49927e;
            if (b0Var == b0.STRICT || (b0Var == b0.SMART && jLongValue != 0)) {
                aVar.z(jLongValue);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            o(aVar, aVar2, Long.valueOf(jLongValue));
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (map.containsKey(aVar3)) {
            long jLongValue2 = ((Long) map.remove(aVar3)).longValue();
            b0 b0Var2 = this.f49927e;
            if (b0Var2 == b0.STRICT || (b0Var2 == b0.SMART && jLongValue2 != 0)) {
                aVar3.z(jLongValue2);
            }
            o(aVar3, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.AMPM_OF_DAY;
        if (map.containsKey(aVar4)) {
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (map.containsKey(aVar5)) {
                long jLongValue3 = ((Long) map.remove(aVar4)).longValue();
                long jLongValue4 = ((Long) map.remove(aVar5)).longValue();
                if (this.f49927e == b0.LENIENT) {
                    o(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(j$.com.android.tools.r8.a.P(j$.com.android.tools.r8.a.Q(jLongValue3, 12L), jLongValue4)));
                } else {
                    aVar4.z(jLongValue3);
                    aVar5.z(jLongValue3);
                    o(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.NANO_OF_DAY;
        if (map.containsKey(aVar6)) {
            long jLongValue5 = ((Long) map.remove(aVar6)).longValue();
            if (this.f49927e != b0.LENIENT) {
                aVar6.z(jLongValue5);
            }
            o(aVar6, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            o(aVar6, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            o(aVar6, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / C.NANOS_PER_SECOND) % 60));
            o(aVar6, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue5 % C.NANOS_PER_SECOND));
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MICRO_OF_DAY;
        if (map.containsKey(aVar7)) {
            long jLongValue6 = ((Long) map.remove(aVar7)).longValue();
            if (this.f49927e != b0.LENIENT) {
                aVar7.z(jLongValue6);
            }
            o(aVar7, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            o(aVar7, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MILLI_OF_DAY;
        if (map.containsKey(aVar8)) {
            long jLongValue7 = ((Long) map.remove(aVar8)).longValue();
            if (this.f49927e != b0.LENIENT) {
                aVar8.z(jLongValue7);
            }
            o(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            o(aVar8, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.SECOND_OF_DAY;
        if (map.containsKey(aVar9)) {
            long jLongValue8 = ((Long) map.remove(aVar9)).longValue();
            if (this.f49927e != b0.LENIENT) {
                aVar9.z(jLongValue8);
            }
            o(aVar9, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            o(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            o(aVar9, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (map.containsKey(aVar10)) {
            long jLongValue9 = ((Long) map.remove(aVar10)).longValue();
            if (this.f49927e != b0.LENIENT) {
                aVar10.z(jLongValue9);
            }
            o(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            o(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        j$.time.temporal.a aVar11 = j$.time.temporal.a.NANO_OF_SECOND;
        if (map.containsKey(aVar11)) {
            long jLongValue10 = ((Long) map.get(aVar11)).longValue();
            b0 b0Var3 = this.f49927e;
            b0 b0Var4 = b0.LENIENT;
            if (b0Var3 != b0Var4) {
                aVar11.z(jLongValue10);
            }
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (map.containsKey(aVar12)) {
                long jLongValue11 = ((Long) map.remove(aVar12)).longValue();
                if (this.f49927e != b0Var4) {
                    aVar12.z(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                o(aVar12, aVar11, Long.valueOf(jLongValue10));
            }
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar13)) {
                long jLongValue12 = ((Long) map.remove(aVar13)).longValue();
                if (this.f49927e != b0Var4) {
                    aVar13.z(jLongValue12);
                }
                o(aVar13, aVar11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
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

    public final void m(LocalTime localTime, j$.time.n nVar) {
        LocalTime localTime2 = this.f49929g;
        if (localTime2 == null) {
            this.f49929g = localTime;
            this.f49930h = nVar;
            return;
        }
        if (!localTime2.equals(localTime)) {
            j$.time.f.h(j$.desugar.sun.nio.fs.h.b("Conflict found: Fields resolved to different times: ", String.valueOf(this.f49929g), " ", String.valueOf(localTime)));
            return;
        }
        j$.time.n nVar2 = this.f49930h;
        j$.time.n nVar3 = j$.time.n.f50019d;
        if (nVar2 == nVar3 || nVar == nVar3 || nVar2.equals(nVar)) {
            this.f49930h = nVar;
        } else {
            j$.time.f.h(j$.desugar.sun.nio.fs.h.b("Conflict found: Fields resolved to different excess periods: ", String.valueOf(this.f49930h), " ", String.valueOf(nVar)));
        }
    }

    public final void n(j$.time.chrono.b bVar) {
        j$.time.chrono.b bVar2 = this.f49928f;
        if (bVar2 != null) {
            if (bVar == null || bVar2.equals(bVar)) {
                return;
            }
            j$.time.f.h(j$.desugar.sun.nio.fs.h.b("Conflict found: Fields resolved to two different dates: ", String.valueOf(this.f49928f), " ", String.valueOf(bVar)));
            return;
        }
        if (bVar != null) {
            if (this.f49925c.equals(bVar.getChronology())) {
                this.f49928f = bVar;
            } else {
                j$.time.f.h("ChronoLocalDate must use the effective parsed chronology: ".concat(String.valueOf(this.f49925c)));
            }
        }
    }

    public final void o(j$.time.temporal.m mVar, j$.time.temporal.a aVar, Long l2) {
        Long l3 = (Long) this.f49923a.put(aVar, l2);
        if (l3 == null || l3.longValue() == l2.longValue()) {
            return;
        }
        throw new j$.time.c("Conflict found: " + String.valueOf(aVar) + " " + l3 + " differs from " + String.valueOf(aVar) + " " + l2 + " while resolving  " + String.valueOf(mVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f49923a);
        sb.append(',');
        sb.append(this.f49925c);
        if (this.f49924b != null) {
            sb.append(',');
            sb.append(this.f49924b);
        }
        if (this.f49928f != null || this.f49929g != null) {
            sb.append(" resolved to ");
            j$.time.chrono.b bVar = this.f49928f;
            if (bVar != null) {
                sb.append(bVar);
                if (this.f49929g != null) {
                    sb.append('T');
                    sb.append(this.f49929g);
                }
            } else {
                sb.append(this.f49929g);
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object x(j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == j$.time.temporal.n.f50065a) {
            return this.f49924b;
        }
        if (nVar == j$.time.temporal.n.f50066b) {
            return this.f49925c;
        }
        if (nVar == j$.time.temporal.n.f50070f) {
            j$.time.chrono.b bVar = this.f49928f;
            if (bVar != null) {
                return LocalDate.M(bVar);
            }
            return null;
        }
        if (nVar == j$.time.temporal.n.f50071g) {
            return this.f49929g;
        }
        if (nVar == j$.time.temporal.n.f50068d) {
            Long l2 = (Long) this.f49923a.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l2 != null) {
                return ZoneOffset.S(l2.intValue());
            }
            ZoneId zoneId = this.f49924b;
            return zoneId instanceof ZoneOffset ? zoneId : nVar.d(this);
        }
        if (nVar == j$.time.temporal.n.f50069e) {
            return nVar.d(this);
        }
        if (nVar == j$.time.temporal.n.f50067c) {
            return null;
        }
        return nVar.d(this);
    }
}
