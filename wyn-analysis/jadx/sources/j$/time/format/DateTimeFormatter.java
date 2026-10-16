package j$.time.format;

import com.applovin.sdk.AppLovinEventParameters;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter ISO_LOCAL_DATE_TIME;

    /* renamed from: f, reason: collision with root package name */
    public static final DateTimeFormatter f37562f;

    /* renamed from: a, reason: collision with root package name */
    private final e f37563a;

    /* renamed from: b, reason: collision with root package name */
    private final Locale f37564b;

    /* renamed from: c, reason: collision with root package name */
    private final w f37565c;

    /* renamed from: d, reason: collision with root package name */
    private final y f37566d;

    /* renamed from: e, reason: collision with root package name */
    private final j$.time.chrono.t f37567e;

    static {
        p pVar = new p();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        z zVar = z.EXCEEDS_PAD;
        pVar.l(aVar, 4, 10, zVar);
        pVar.e('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        pVar.k(aVar2, 2);
        pVar.e('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        pVar.k(aVar3, 2);
        y yVar = y.STRICT;
        j$.time.chrono.t tVar = j$.time.chrono.t.f37543d;
        DateTimeFormatter dateTimeFormatterU = pVar.u(yVar, tVar);
        ISO_LOCAL_DATE = dateTimeFormatterU;
        p pVar2 = new p();
        pVar2.p();
        pVar2.a(dateTimeFormatterU);
        pVar2.h();
        pVar2.u(yVar, tVar);
        p pVar3 = new p();
        pVar3.p();
        pVar3.a(dateTimeFormatterU);
        pVar3.o();
        pVar3.h();
        pVar3.u(yVar, tVar);
        p pVar4 = new p();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        pVar4.k(aVar4, 2);
        pVar4.e(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        pVar4.k(aVar5, 2);
        pVar4.o();
        pVar4.e(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        pVar4.k(aVar6, 2);
        pVar4.o();
        pVar4.b(j$.time.temporal.a.NANO_OF_SECOND);
        DateTimeFormatter dateTimeFormatterU2 = pVar4.u(yVar, null);
        p pVar5 = new p();
        pVar5.p();
        pVar5.a(dateTimeFormatterU2);
        pVar5.h();
        pVar5.u(yVar, null);
        p pVar6 = new p();
        pVar6.p();
        pVar6.a(dateTimeFormatterU2);
        pVar6.o();
        pVar6.h();
        pVar6.u(yVar, null);
        p pVar7 = new p();
        pVar7.p();
        pVar7.a(dateTimeFormatterU);
        pVar7.e('T');
        pVar7.a(dateTimeFormatterU2);
        DateTimeFormatter dateTimeFormatterU3 = pVar7.u(yVar, tVar);
        ISO_LOCAL_DATE_TIME = dateTimeFormatterU3;
        p pVar8 = new p();
        pVar8.p();
        pVar8.a(dateTimeFormatterU3);
        pVar8.r();
        pVar8.h();
        pVar8.s();
        DateTimeFormatter dateTimeFormatterU4 = pVar8.u(yVar, tVar);
        p pVar9 = new p();
        pVar9.a(dateTimeFormatterU4);
        pVar9.o();
        pVar9.e('[');
        pVar9.q();
        pVar9.m();
        pVar9.e(']');
        pVar9.u(yVar, tVar);
        p pVar10 = new p();
        pVar10.a(dateTimeFormatterU3);
        pVar10.o();
        pVar10.h();
        pVar10.o();
        pVar10.e('[');
        pVar10.q();
        pVar10.m();
        pVar10.e(']');
        pVar10.u(yVar, tVar);
        p pVar11 = new p();
        pVar11.p();
        pVar11.l(aVar, 4, 10, zVar);
        pVar11.e('-');
        pVar11.k(j$.time.temporal.a.DAY_OF_YEAR, 3);
        pVar11.o();
        pVar11.h();
        pVar11.u(yVar, tVar);
        p pVar12 = new p();
        pVar12.p();
        pVar12.l(j$.time.temporal.i.f37678c, 4, 10, zVar);
        pVar12.f("-W");
        pVar12.k(j$.time.temporal.i.f37677b, 2);
        pVar12.e('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        pVar12.k(aVar7, 1);
        pVar12.o();
        pVar12.h();
        pVar12.u(yVar, tVar);
        p pVar13 = new p();
        pVar13.p();
        pVar13.c();
        f37562f = pVar13.u(yVar, null);
        p pVar14 = new p();
        pVar14.p();
        pVar14.k(aVar, 4);
        pVar14.k(aVar2, 2);
        pVar14.k(aVar3, 2);
        pVar14.o();
        pVar14.r();
        pVar14.g("+HHMMss", "Z");
        pVar14.s();
        pVar14.u(yVar, tVar);
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
        p pVar15 = new p();
        pVar15.p();
        pVar15.r();
        pVar15.o();
        pVar15.i(aVar7, map);
        pVar15.f(", ");
        pVar15.n();
        pVar15.l(aVar3, 1, 2, z.NOT_NEGATIVE);
        pVar15.e(' ');
        pVar15.i(aVar2, map2);
        pVar15.e(' ');
        pVar15.k(aVar, 4);
        pVar15.e(' ');
        pVar15.k(aVar4, 2);
        pVar15.e(':');
        pVar15.k(aVar5, 2);
        pVar15.o();
        pVar15.e(':');
        pVar15.k(aVar6, 2);
        pVar15.n();
        pVar15.e(' ');
        pVar15.g("+HHMM", "GMT");
        pVar15.u(y.SMART, tVar);
    }

    DateTimeFormatter(e eVar, Locale locale, y yVar, j$.time.chrono.t tVar) {
        w wVar = w.f37621a;
        this.f37563a = (e) Objects.requireNonNull(eVar, "printerParser");
        this.f37564b = (Locale) Objects.requireNonNull(locale, "locale");
        this.f37565c = (w) Objects.requireNonNull(wVar, "decimalStyle");
        this.f37566d = (y) Objects.requireNonNull(yVar, "resolverStyle");
        this.f37567e = tVar;
    }

    public final Locale c() {
        return this.f37564b;
    }

    public final w b() {
        return this.f37565c;
    }

    public final j$.time.chrono.m a() {
        return this.f37567e;
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb2 = new StringBuilder(32);
        Objects.requireNonNull(temporalAccessor, "temporal");
        Objects.requireNonNull(sb2, "appendable");
        try {
            this.f37563a.o(new t(temporalAccessor, this), sb2);
            return sb2.toString();
        } catch (IOException e7) {
            throw new j$.time.c(e7.getMessage(), e7);
        }
    }

    public final Object d(CharSequence charSequence, j$.time.h hVar) {
        String string;
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(hVar, AppLovinEventParameters.SEARCH_QUERY);
        try {
            return ((x) e(charSequence)).B(hVar);
        } catch (r e7) {
            throw e7;
        } catch (RuntimeException e10) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            r rVar = new r("Text '" + string + "' could not be parsed: " + e10.getMessage(), e10);
            charSequence.toString();
            throw rVar;
        }
    }

    private TemporalAccessor e(CharSequence charSequence) {
        String string;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(parsePosition, "position");
        q qVar = new q(this);
        int iQ = this.f37563a.q(qVar, charSequence, parsePosition.getIndex());
        if (iQ < 0) {
            parsePosition.setErrorIndex(~iQ);
            qVar = null;
        } else {
            parsePosition.setIndex(iQ);
        }
        if (qVar == null || parsePosition.getErrorIndex() >= 0 || parsePosition.getIndex() < charSequence.length()) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            if (parsePosition.getErrorIndex() >= 0) {
                String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
                parsePosition.getErrorIndex();
                throw new r(str, charSequence);
            }
            String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
            parsePosition.getIndex();
            throw new r(str2, charSequence);
        }
        return qVar.s(this.f37566d);
    }

    final e f() {
        return this.f37563a.a();
    }

    public final String toString() {
        String string = this.f37563a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
