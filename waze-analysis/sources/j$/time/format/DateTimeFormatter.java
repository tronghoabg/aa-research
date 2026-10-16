package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* renamed from: g, reason: collision with root package name */
    public static final DateTimeFormatter f49898g;

    /* renamed from: a, reason: collision with root package name */
    public final d f49899a;

    /* renamed from: b, reason: collision with root package name */
    public final Locale f49900b;

    /* renamed from: c, reason: collision with root package name */
    public final DecimalStyle f49901c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f49902d;

    /* renamed from: e, reason: collision with root package name */
    public final Chronology f49903e;

    /* renamed from: f, reason: collision with root package name */
    public final ZoneId f49904f;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        c0 c0Var = c0.EXCEEDS_PAD;
        dateTimeFormatterBuilder.n(aVar, 4, 10, c0Var);
        dateTimeFormatterBuilder.d('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        dateTimeFormatterBuilder.m(aVar2, 2);
        dateTimeFormatterBuilder.d('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        dateTimeFormatterBuilder.m(aVar3, 2);
        b0 b0Var = b0.STRICT;
        j$.time.chrono.r rVar = j$.time.chrono.r.f49878d;
        DateTimeFormatter dateTimeFormatterQ = dateTimeFormatterBuilder.q(b0Var, rVar);
        ISO_LOCAL_DATE = dateTimeFormatterQ;
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        p pVar = p.INSENSITIVE;
        dateTimeFormatterBuilder2.c(pVar);
        dateTimeFormatterBuilder2.a(dateTimeFormatterQ);
        j jVar = j.f49954e;
        dateTimeFormatterBuilder2.c(jVar);
        dateTimeFormatterBuilder2.q(b0Var, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.c(pVar);
        dateTimeFormatterBuilder3.a(dateTimeFormatterQ);
        dateTimeFormatterBuilder3.p();
        dateTimeFormatterBuilder3.c(jVar);
        dateTimeFormatterBuilder3.q(b0Var, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        dateTimeFormatterBuilder4.m(aVar4, 2);
        dateTimeFormatterBuilder4.d(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder4.m(aVar5, 2);
        dateTimeFormatterBuilder4.p();
        dateTimeFormatterBuilder4.d(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder4.m(aVar6, 2);
        dateTimeFormatterBuilder4.p();
        dateTimeFormatterBuilder4.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterQ2 = dateTimeFormatterBuilder4.q(b0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder5.c(pVar);
        dateTimeFormatterBuilder5.a(dateTimeFormatterQ2);
        dateTimeFormatterBuilder5.c(jVar);
        dateTimeFormatterBuilder5.q(b0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder6 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder6.c(pVar);
        dateTimeFormatterBuilder6.a(dateTimeFormatterQ2);
        dateTimeFormatterBuilder6.p();
        dateTimeFormatterBuilder6.c(jVar);
        dateTimeFormatterBuilder6.q(b0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder7.c(pVar);
        dateTimeFormatterBuilder7.a(dateTimeFormatterQ);
        dateTimeFormatterBuilder7.d('T');
        dateTimeFormatterBuilder7.a(dateTimeFormatterQ2);
        DateTimeFormatter dateTimeFormatterQ3 = dateTimeFormatterBuilder7.q(b0Var, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder8.c(pVar);
        dateTimeFormatterBuilder8.a(dateTimeFormatterQ3);
        p pVar2 = p.LENIENT;
        dateTimeFormatterBuilder8.c(pVar2);
        dateTimeFormatterBuilder8.c(jVar);
        p pVar3 = p.STRICT;
        dateTimeFormatterBuilder8.c(pVar3);
        DateTimeFormatter dateTimeFormatterQ4 = dateTimeFormatterBuilder8.q(b0Var, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder9.a(dateTimeFormatterQ4);
        dateTimeFormatterBuilder9.p();
        dateTimeFormatterBuilder9.d('[');
        p pVar4 = p.SENSITIVE;
        dateTimeFormatterBuilder9.c(pVar4);
        j$.desugar.sun.nio.fs.n nVar = DateTimeFormatterBuilder.f49905h;
        dateTimeFormatterBuilder9.c(new s(nVar, "ZoneRegionId()"));
        dateTimeFormatterBuilder9.d(']');
        dateTimeFormatterBuilder9.q(b0Var, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder10.a(dateTimeFormatterQ3);
        dateTimeFormatterBuilder10.p();
        dateTimeFormatterBuilder10.c(jVar);
        dateTimeFormatterBuilder10.p();
        dateTimeFormatterBuilder10.d('[');
        dateTimeFormatterBuilder10.c(pVar4);
        dateTimeFormatterBuilder10.c(new s(nVar, "ZoneRegionId()"));
        dateTimeFormatterBuilder10.d(']');
        dateTimeFormatterBuilder10.q(b0Var, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder11.c(pVar);
        dateTimeFormatterBuilder11.n(aVar, 4, 10, c0Var);
        dateTimeFormatterBuilder11.d('-');
        dateTimeFormatterBuilder11.m(j$.time.temporal.a.DAY_OF_YEAR, 3);
        dateTimeFormatterBuilder11.p();
        dateTimeFormatterBuilder11.c(jVar);
        dateTimeFormatterBuilder11.q(b0Var, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder12.c(pVar);
        dateTimeFormatterBuilder12.n(j$.time.temporal.h.f50056c, 4, 10, c0Var);
        dateTimeFormatterBuilder12.e("-W");
        dateTimeFormatterBuilder12.m(j$.time.temporal.h.f50055b, 2);
        dateTimeFormatterBuilder12.d('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        dateTimeFormatterBuilder12.m(aVar7, 1);
        dateTimeFormatterBuilder12.p();
        dateTimeFormatterBuilder12.c(jVar);
        dateTimeFormatterBuilder12.q(b0Var, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder13.c(pVar);
        dateTimeFormatterBuilder13.c(new g());
        f49898g = dateTimeFormatterBuilder13.q(b0Var, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder14.c(pVar);
        dateTimeFormatterBuilder14.m(aVar, 4);
        dateTimeFormatterBuilder14.m(aVar2, 2);
        dateTimeFormatterBuilder14.m(aVar3, 2);
        dateTimeFormatterBuilder14.p();
        dateTimeFormatterBuilder14.c(pVar2);
        dateTimeFormatterBuilder14.g("+HHMMss", "Z");
        dateTimeFormatterBuilder14.c(pVar3);
        dateTimeFormatterBuilder14.q(b0Var, rVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder15.c(pVar);
        dateTimeFormatterBuilder15.c(pVar2);
        dateTimeFormatterBuilder15.p();
        dateTimeFormatterBuilder15.i(aVar7, map);
        dateTimeFormatterBuilder15.e(", ");
        dateTimeFormatterBuilder15.o();
        dateTimeFormatterBuilder15.n(aVar3, 1, 2, c0.NOT_NEGATIVE);
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.i(aVar2, map2);
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.m(aVar, 4);
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.m(aVar4, 2);
        dateTimeFormatterBuilder15.d(':');
        dateTimeFormatterBuilder15.m(aVar5, 2);
        dateTimeFormatterBuilder15.p();
        dateTimeFormatterBuilder15.d(':');
        dateTimeFormatterBuilder15.m(aVar6, 2);
        dateTimeFormatterBuilder15.o();
        dateTimeFormatterBuilder15.d(' ');
        dateTimeFormatterBuilder15.g("+HHMM", "GMT");
        dateTimeFormatterBuilder15.q(b0.SMART, rVar);
    }

    public DateTimeFormatter(d dVar, Locale locale, DecimalStyle decimalStyle, b0 b0Var, Chronology chronology, ZoneId zoneId) {
        this.f49899a = (d) Objects.requireNonNull(dVar, "printerParser");
        this.f49900b = (Locale) Objects.requireNonNull(locale, "locale");
        this.f49901c = (DecimalStyle) Objects.requireNonNull(decimalStyle, "decimalStyle");
        this.f49902d = (b0) Objects.requireNonNull(b0Var, "resolverStyle");
        this.f49903e = chronology;
        this.f49904f = zoneId;
    }

    public static DateTimeFormatter ofPattern(String str) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.h(str);
        return dateTimeFormatterBuilder.r(Locale.getDefault(), b0.SMART, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.format.a0 a(java.lang.CharSequence r25) {
        /*
            Method dump skipped, instructions count: 929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatter.a(java.lang.CharSequence):j$.time.format.a0");
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        d dVar = this.f49899a;
        Objects.requireNonNull(temporalAccessor, "temporal");
        Objects.requireNonNull(sb, "appendable");
        try {
            dVar.f(new w(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e2) {
            throw new j$.time.c(e2.getMessage(), e2);
        }
    }

    public final String toString() {
        String string = this.f49899a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }

    public DateTimeFormatter withDecimalStyle(DecimalStyle decimalStyle) {
        if (this.f49901c.equals(decimalStyle)) {
            return this;
        }
        return new DateTimeFormatter(this.f49899a, this.f49900b, decimalStyle, this.f49902d, this.f49903e, this.f49904f);
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        if (Objects.equals(this.f49904f, zoneId)) {
            return this;
        }
        return new DateTimeFormatter(this.f49899a, this.f49900b, this.f49901c, this.f49902d, this.f49903e, zoneId);
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.h(str);
        return dateTimeFormatterBuilder.r(locale, b0.SMART, null);
    }
}
