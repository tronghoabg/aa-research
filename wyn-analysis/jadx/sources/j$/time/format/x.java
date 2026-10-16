package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC2894b;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes2.dex */
final class x implements TemporalAccessor {

    /* renamed from: b, reason: collision with root package name */
    ZoneId f37623b;

    /* renamed from: c, reason: collision with root package name */
    j$.time.chrono.m f37624c;

    /* renamed from: d, reason: collision with root package name */
    boolean f37625d;

    /* renamed from: e, reason: collision with root package name */
    private y f37626e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC2894b f37627f;

    /* renamed from: g, reason: collision with root package name */
    private j$.time.k f37628g;

    /* renamed from: a, reason: collision with root package name */
    final HashMap f37622a = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    j$.time.s f37629h = j$.time.s.f37658d;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int q(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ j$.time.temporal.t t(j$.time.temporal.q qVar) {
        return j$.time.temporal.l.d(this, qVar);
    }

    x() {
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        if (this.f37622a.containsKey(qVar)) {
            return true;
        }
        InterfaceC2894b interfaceC2894b = this.f37627f;
        if (interfaceC2894b != null && interfaceC2894b.g(qVar)) {
            return true;
        }
        j$.time.k kVar = this.f37628g;
        if (kVar == null || !kVar.g(qVar)) {
            return (qVar == null || (qVar instanceof j$.time.temporal.a) || !qVar.t(this)) ? false : true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        Objects.requireNonNull(qVar, "field");
        Long l10 = (Long) this.f37622a.get(qVar);
        if (l10 != null) {
            return l10.longValue();
        }
        InterfaceC2894b interfaceC2894b = this.f37627f;
        if (interfaceC2894b != null && interfaceC2894b.g(qVar)) {
            return this.f37627f.w(qVar);
        }
        j$.time.k kVar = this.f37628g;
        if (kVar != null && kVar.g(qVar)) {
            return this.f37628g.w(qVar);
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", qVar));
        }
        return qVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.k()) {
            return this.f37623b;
        }
        if (rVar == j$.time.temporal.l.e()) {
            return this.f37624c;
        }
        if (rVar == j$.time.temporal.l.f()) {
            InterfaceC2894b interfaceC2894b = this.f37627f;
            if (interfaceC2894b != null) {
                return j$.time.g.T(interfaceC2894b);
            }
            return null;
        }
        if (rVar == j$.time.temporal.l.g()) {
            return this.f37628g;
        }
        if (rVar == j$.time.temporal.l.h()) {
            Long l10 = (Long) this.f37622a.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l10 != null) {
                return ZoneOffset.c0(l10.intValue());
            }
            ZoneId zoneId = this.f37623b;
            return zoneId instanceof ZoneOffset ? zoneId : rVar.h(this);
        }
        if (rVar == j$.time.temporal.l.j()) {
            return rVar.h(this);
        }
        if (rVar == j$.time.temporal.l.i()) {
            return null;
        }
        return rVar.h(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void m(j$.time.format.y r27) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.x.m(j$.time.format.y):void");
    }

    private void D(j$.time.temporal.q qVar, j$.time.temporal.a aVar, Long l10) {
        Long l11 = (Long) this.f37622a.put(aVar, l10);
        if (l11 == null || l11.longValue() == l10.longValue()) {
            return;
        }
        throw new j$.time.c("Conflict found: " + aVar + StringUtils.SPACE + l11 + " differs from " + aVar + StringUtils.SPACE + l10 + " while resolving  " + qVar);
    }

    private void n() {
        HashMap map = this.f37622a;
        if (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f37623b;
            if (zoneId != null) {
                r(zoneId);
                return;
            }
            Long l10 = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l10 != null) {
                r(ZoneOffset.c0(l10.intValue()));
            }
        }
    }

    private void r(ZoneId zoneId) {
        HashMap map = this.f37622a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        C(this.f37624c.L(Instant.W(((Long) map.remove(aVar)).longValue()), zoneId).c());
        D(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(r5.b().k0()));
    }

    private void C(InterfaceC2894b interfaceC2894b) {
        InterfaceC2894b interfaceC2894b2 = this.f37627f;
        if (interfaceC2894b2 != null) {
            if (interfaceC2894b == null || interfaceC2894b2.equals(interfaceC2894b)) {
                return;
            }
            throw new j$.time.c("Conflict found: Fields resolved to two different dates: " + this.f37627f + StringUtils.SPACE + interfaceC2894b);
        }
        if (interfaceC2894b != null) {
            if (!this.f37624c.equals(interfaceC2894b.a())) {
                throw new j$.time.c("ChronoLocalDate must use the effective parsed chronology: " + this.f37624c);
            }
            this.f37627f = interfaceC2894b;
        }
    }

    private void y() {
        HashMap map = this.f37622a;
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (map.containsKey(aVar)) {
            long jLongValue = ((Long) map.remove(aVar)).longValue();
            y yVar = this.f37626e;
            if (yVar == y.STRICT || (yVar == y.SMART && jLongValue != 0)) {
                aVar.S(jLongValue);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            D(aVar, aVar2, Long.valueOf(jLongValue));
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (map.containsKey(aVar3)) {
            long jLongValue2 = ((Long) map.remove(aVar3)).longValue();
            y yVar2 = this.f37626e;
            if (yVar2 == y.STRICT || (yVar2 == y.SMART && jLongValue2 != 0)) {
                aVar3.S(jLongValue2);
            }
            D(aVar3, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.AMPM_OF_DAY;
        if (map.containsKey(aVar4)) {
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (map.containsKey(aVar5)) {
                long jLongValue3 = ((Long) map.remove(aVar4)).longValue();
                long jLongValue4 = ((Long) map.remove(aVar5)).longValue();
                if (this.f37626e == y.LENIENT) {
                    D(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(j$.time.b.b(j$.time.b.g(jLongValue3, 12), jLongValue4)));
                } else {
                    aVar4.S(jLongValue3);
                    aVar5.S(jLongValue3);
                    D(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.NANO_OF_DAY;
        if (map.containsKey(aVar6)) {
            long jLongValue5 = ((Long) map.remove(aVar6)).longValue();
            if (this.f37626e != y.LENIENT) {
                aVar6.S(jLongValue5);
            }
            D(aVar6, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            D(aVar6, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            D(aVar6, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            D(aVar6, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MICRO_OF_DAY;
        if (map.containsKey(aVar7)) {
            long jLongValue6 = ((Long) map.remove(aVar7)).longValue();
            if (this.f37626e != y.LENIENT) {
                aVar7.S(jLongValue6);
            }
            D(aVar7, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            D(aVar7, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MILLI_OF_DAY;
        if (map.containsKey(aVar8)) {
            long jLongValue7 = ((Long) map.remove(aVar8)).longValue();
            if (this.f37626e != y.LENIENT) {
                aVar8.S(jLongValue7);
            }
            D(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            D(aVar8, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.SECOND_OF_DAY;
        if (map.containsKey(aVar9)) {
            long jLongValue8 = ((Long) map.remove(aVar9)).longValue();
            if (this.f37626e != y.LENIENT) {
                aVar9.S(jLongValue8);
            }
            D(aVar9, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            D(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            D(aVar9, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (map.containsKey(aVar10)) {
            long jLongValue9 = ((Long) map.remove(aVar10)).longValue();
            if (this.f37626e != y.LENIENT) {
                aVar10.S(jLongValue9);
            }
            D(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            D(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        j$.time.temporal.a aVar11 = j$.time.temporal.a.NANO_OF_SECOND;
        if (map.containsKey(aVar11)) {
            long jLongValue10 = ((Long) map.get(aVar11)).longValue();
            y yVar3 = this.f37626e;
            y yVar4 = y.LENIENT;
            if (yVar3 != yVar4) {
                aVar11.S(jLongValue10);
            }
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (map.containsKey(aVar12)) {
                long jLongValue11 = ((Long) map.remove(aVar12)).longValue();
                if (this.f37626e != yVar4) {
                    aVar12.S(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                D(aVar12, aVar11, Long.valueOf(jLongValue10));
            }
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar13)) {
                long jLongValue12 = ((Long) map.remove(aVar13)).longValue();
                if (this.f37626e != yVar4) {
                    aVar13.S(jLongValue12);
                }
                D(aVar13, aVar11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        j$.time.temporal.a aVar14 = j$.time.temporal.a.HOUR_OF_DAY;
        if (map.containsKey(aVar14)) {
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (map.containsKey(aVar15)) {
                j$.time.temporal.a aVar16 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (map.containsKey(aVar16) && map.containsKey(aVar11)) {
                    v(((Long) map.remove(aVar14)).longValue(), ((Long) map.remove(aVar15)).longValue(), ((Long) map.remove(aVar16)).longValue(), ((Long) map.remove(aVar11)).longValue());
                }
            }
        }
    }

    private void v(long j8, long j10, long j11, long j12) {
        if (this.f37626e == y.LENIENT) {
            long jB = j$.time.b.b(j$.time.b.b(j$.time.b.b(j$.time.b.g(j8, 3600000000000L), j$.time.b.g(j10, 60000000000L)), j$.time.b.g(j11, 1000000000L)), j12);
            A(j$.time.k.b0(j$.time.b.e(jB, 86400000000000L)), j$.time.s.b((int) j$.time.b.f(jB, 86400000000000L)));
            return;
        }
        int iR = j$.time.temporal.a.MINUTE_OF_HOUR.R(j10);
        int iR2 = j$.time.temporal.a.NANO_OF_SECOND.R(j12);
        if (this.f37626e == y.SMART && j8 == 24 && iR == 0 && j11 == 0 && iR2 == 0) {
            A(j$.time.k.f37642g, j$.time.s.b(1));
        } else {
            A(j$.time.k.a0(j$.time.temporal.a.HOUR_OF_DAY.R(j8), iR, j$.time.temporal.a.SECOND_OF_MINUTE.R(j11), iR2), j$.time.s.f37658d);
        }
    }

    private void A(j$.time.k kVar, j$.time.s sVar) {
        j$.time.k kVar2 = this.f37628g;
        if (kVar2 != null) {
            if (!kVar2.equals(kVar)) {
                throw new j$.time.c("Conflict found: Fields resolved to different times: " + this.f37628g + StringUtils.SPACE + kVar);
            }
            j$.time.s sVar2 = this.f37629h;
            sVar2.getClass();
            j$.time.s sVar3 = j$.time.s.f37658d;
            if (sVar2 != sVar3 && sVar != sVar3 && !this.f37629h.equals(sVar)) {
                throw new j$.time.c("Conflict found: Fields resolved to different excess periods: " + this.f37629h + StringUtils.SPACE + sVar);
            }
            this.f37629h = sVar;
            return;
        }
        this.f37628g = kVar;
        this.f37629h = sVar;
    }

    private void h(TemporalAccessor temporalAccessor) {
        Iterator it = this.f37622a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.q qVar = (j$.time.temporal.q) entry.getKey();
            if (temporalAccessor.g(qVar)) {
                try {
                    long jW = temporalAccessor.w(qVar);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jW != jLongValue) {
                        throw new j$.time.c("Conflict found: Field " + qVar + StringUtils.SPACE + jW + " differs from " + qVar + StringUtils.SPACE + jLongValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(this.f37622a);
        sb2.append(',');
        sb2.append(this.f37624c);
        if (this.f37623b != null) {
            sb2.append(',');
            sb2.append(this.f37623b);
        }
        if (this.f37627f != null || this.f37628g != null) {
            sb2.append(" resolved to ");
            InterfaceC2894b interfaceC2894b = this.f37627f;
            if (interfaceC2894b != null) {
                sb2.append(interfaceC2894b);
                if (this.f37628g != null) {
                    sb2.append('T');
                    sb2.append(this.f37628g);
                }
            } else {
                sb2.append(this.f37628g);
            }
        }
        return sb2.toString();
    }
}
