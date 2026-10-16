package j$.time.format;

import j$.time.chrono.Chronology;
import j$.util.Objects;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class DateTimeFormatterBuilder {

    /* renamed from: h, reason: collision with root package name */
    public static final j$.desugar.sun.nio.fs.n f49905h = new j$.desugar.sun.nio.fs.n(2);

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f49906i;

    /* renamed from: a, reason: collision with root package name */
    public DateTimeFormatterBuilder f49907a;

    /* renamed from: b, reason: collision with root package name */
    public final DateTimeFormatterBuilder f49908b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f49909c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f49910d;

    /* renamed from: e, reason: collision with root package name */
    public int f49911e;

    /* renamed from: f, reason: collision with root package name */
    public char f49912f;

    /* renamed from: g, reason: collision with root package name */
    public int f49913g;

    static {
        HashMap map = new HashMap();
        f49906i = map;
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.f fVar = j$.time.temporal.h.f50054a;
        map.put('Q', fVar);
        map.put('q', fVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.j.f50062a);
    }

    public DateTimeFormatterBuilder() {
        this.f49907a = this;
        this.f49909c = new ArrayList();
        this.f49913g = -1;
        this.f49908b = null;
        this.f49910d = false;
    }

    public static String getLocalizedDateTimePattern(FormatStyle formatStyle, FormatStyle formatStyle2, Chronology chronology, Locale locale) {
        Objects.requireNonNull(locale, "locale");
        Objects.requireNonNull(chronology, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            j$.time.f.b("Either dateStyle or timeStyle must be non-null");
            return null;
        }
        DateFormat dateInstance = formatStyle2 == null ? DateFormat.getDateInstance(formatStyle.ordinal(), locale) : formatStyle == null ? DateFormat.getTimeInstance(formatStyle2.ordinal(), locale) : DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        if (!(dateInstance instanceof SimpleDateFormat)) {
            throw new UnsupportedOperationException("Can't determine pattern from ".concat(String.valueOf(dateInstance)));
        }
        String pattern = ((SimpleDateFormat) dateInstance).toPattern();
        if (pattern == null) {
            return null;
        }
        int i2 = 0;
        boolean z = pattern.indexOf(66) != -1;
        boolean z2 = pattern.indexOf(98) != -1;
        if (!z && !z2) {
            return pattern;
        }
        StringBuilder sb = new StringBuilder(pattern.length());
        char c2 = ' ';
        while (i2 < pattern.length()) {
            char cCharAt = pattern.charAt(i2);
            if (cCharAt != ' ') {
                if (cCharAt != 'B' && cCharAt != 'b') {
                    sb.append(cCharAt);
                }
            } else if (i2 == 0 || (c2 != 'B' && c2 != 'b')) {
                sb.append(cCharAt);
            }
            i2++;
            c2 = cCharAt;
        }
        int length = sb.length() - 1;
        if (length >= 0 && sb.charAt(length) == ' ') {
            sb.deleteCharAt(length);
        }
        return sb.toString();
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d dVar = dateTimeFormatter.f49899a;
        if (dVar.f49936b) {
            dVar = new d(dVar.f49935a, false);
        }
        c(dVar);
    }

    public final void b(j$.time.temporal.a aVar, int i2, int i3, boolean z) {
        if (i2 != i3 || z) {
            c(new f(aVar, i2, i3, z));
        } else {
            k(new f(aVar, i2, i3, z));
        }
    }

    public final int c(e eVar) {
        Objects.requireNonNull(eVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f49907a;
        int i2 = dateTimeFormatterBuilder.f49911e;
        if (i2 > 0) {
            if (eVar != null) {
                eVar = new k(eVar, i2, dateTimeFormatterBuilder.f49912f);
            }
            dateTimeFormatterBuilder.f49911e = 0;
            dateTimeFormatterBuilder.f49912f = (char) 0;
        }
        dateTimeFormatterBuilder.f49909c.add(eVar);
        this.f49907a.f49913g = -1;
        return r4.f49909c.size() - 1;
    }

    public final void d(char c2) {
        c(new c(c2));
    }

    public final void e(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        int i2 = 1;
        if (str.length() == 1) {
            c(new c(str.charAt(0)));
        } else {
            c(new h(i2, str));
        }
    }

    public final void f(TextStyle textStyle) {
        Objects.requireNonNull(textStyle, "style");
        if (textStyle == TextStyle.FULL || textStyle == TextStyle.SHORT) {
            c(new h(0, textStyle));
        } else {
            j$.time.f.b("Style must be either full or short");
        }
    }

    public final void g(String str, String str2) {
        c(new j(str, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03a7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.h(java.lang.String):void");
    }

    public final void i(j$.time.temporal.a aVar, HashMap map) {
        Objects.requireNonNull(aVar, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        c(new q(aVar, textStyle, new a(new y(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public final void j(j$.time.temporal.m mVar, TextStyle textStyle) {
        Objects.requireNonNull(mVar, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        c(new q(mVar, textStyle, z.f50006c));
    }

    public final void k(i iVar) {
        i iVarD;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f49907a;
        int i2 = dateTimeFormatterBuilder.f49913g;
        if (i2 < 0) {
            dateTimeFormatterBuilder.f49913g = c(iVar);
            return;
        }
        i iVar2 = (i) dateTimeFormatterBuilder.f49909c.get(i2);
        int i3 = iVar.f49949b;
        int i4 = iVar.f49950c;
        if (i3 == i4 && iVar.f49951d == c0.NOT_NEGATIVE) {
            iVarD = iVar2.e(i4);
            c(iVar.d());
            this.f49907a.f49913g = i2;
        } else {
            iVarD = iVar2.d();
            this.f49907a.f49913g = c(iVar);
        }
        this.f49907a.f49909c.set(i2, iVarD);
    }

    public final void l(j$.time.temporal.m mVar) {
        Objects.requireNonNull(mVar, "field");
        k(new i(mVar, 1, 19, c0.NORMAL));
    }

    public final void m(j$.time.temporal.m mVar, int i2) {
        Objects.requireNonNull(mVar, "field");
        if (i2 < 1 || i2 > 19) {
            j$.time.f.i("The width must be from 1 to 19 inclusive but was ", i2);
        } else {
            k(new i(mVar, i2, i2, c0.NOT_NEGATIVE));
        }
    }

    public final void n(j$.time.temporal.m mVar, int i2, int i3, c0 c0Var) {
        if (i2 == i3 && c0Var == c0.NOT_NEGATIVE) {
            m(mVar, i3);
            return;
        }
        Objects.requireNonNull(mVar, "field");
        Objects.requireNonNull(c0Var, "signStyle");
        if (i2 < 1 || i2 > 19) {
            j$.time.f.i("The minimum width must be from 1 to 19 inclusive but was ", i2);
            return;
        }
        if (i3 < 1 || i3 > 19) {
            j$.time.f.i("The maximum width must be from 1 to 19 inclusive but was ", i3);
            return;
        }
        if (i3 >= i2) {
            k(new i(mVar, i2, i3, c0Var));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public final void o() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f49907a;
        if (dateTimeFormatterBuilder.f49908b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        int size = dateTimeFormatterBuilder.f49909c.size();
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f49907a;
        if (size <= 0) {
            this.f49907a = dateTimeFormatterBuilder2.f49908b;
            return;
        }
        d dVar = new d(dateTimeFormatterBuilder2.f49909c, dateTimeFormatterBuilder2.f49910d);
        this.f49907a = this.f49907a.f49908b;
        c(dVar);
    }

    public final void p() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f49907a;
        dateTimeFormatterBuilder.f49913g = -1;
        this.f49907a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
    }

    public final DateTimeFormatter q(b0 b0Var, Chronology chronology) {
        return r(Locale.getDefault(), b0Var, chronology);
    }

    public final DateTimeFormatter r(Locale locale, b0 b0Var, Chronology chronology) {
        Objects.requireNonNull(locale, "locale");
        while (this.f49907a.f49908b != null) {
            o();
        }
        return new DateTimeFormatter(new d(this.f49909c, false), locale, DecimalStyle.f49914d, b0Var, chronology, null);
    }

    public DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.f49907a = this;
        this.f49909c = new ArrayList();
        this.f49913g = -1;
        this.f49908b = dateTimeFormatterBuilder;
        this.f49910d = true;
    }
}
