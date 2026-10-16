package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class u {
    public static final j$.desugar.sun.nio.fs.n h = new j$.desugar.sun.nio.fs.n(4);
    public static final HashMap i;
    public u a;
    public final u b;
    public final ArrayList c;
    public final boolean d;
    public int e;
    public char f;
    public int g;

    static {
        HashMap map = new HashMap();
        i = map;
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.f fVar = j$.time.temporal.h.a;
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
        map.put('g', j$.time.temporal.j.a);
    }

    public u() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        d dVar = dateTimeFormatter.a;
        if (dVar.b) {
            dVar = new d(dVar.a, false);
        }
        c(dVar);
    }

    public final void b(j$.time.temporal.a aVar, int i2, int i3, boolean z) {
        if (i2 != i3 || z) {
            c(new f(aVar, i2, i3, z));
        } else {
            j(new f(aVar, i2, i3, z));
        }
    }

    public final int c(e eVar) {
        Objects.a(eVar, "pp");
        u uVar = this.a;
        int i2 = uVar.e;
        if (i2 > 0) {
            k kVar = new k(eVar, i2, uVar.f);
            uVar.e = 0;
            uVar.f = (char) 0;
            eVar = kVar;
        }
        uVar.c.add(eVar);
        this.a.g = -1;
        return r4.c.size() - 1;
    }

    public final void d(char c) {
        c(new c(c));
    }

    public final void e(String str) {
        Objects.a(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        byte b = 1;
        if (str.length() == 1) {
            c(new c(str.charAt(0)));
        } else {
            c(new h(b, str));
        }
    }

    public final void f(TextStyle textStyle) {
        Objects.a(textStyle, "style");
        if (textStyle == TextStyle.FULL || textStyle == TextStyle.SHORT) {
            c(new h((byte) 0, textStyle));
        } else {
            j$.time.g.a("Style must be either full or short");
        }
    }

    public final void g(String str, String str2) {
        c(new j(str, str2));
    }

    public final void h(j$.time.temporal.a aVar, HashMap map) {
        Objects.a(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        c(new q(aVar, textStyle, new a(new z(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public final void i(j$.time.temporal.n nVar, TextStyle textStyle) {
        Objects.a(textStyle, "textStyle");
        c(new q(nVar, textStyle, a0.c));
    }

    public final void j(i iVar) {
        i iVarD;
        u uVar = this.a;
        int i2 = uVar.g;
        if (i2 < 0) {
            uVar.g = c(iVar);
            return;
        }
        i iVar2 = (i) uVar.c.get(i2);
        int i3 = iVar.b;
        int i4 = iVar.c;
        if (i3 == i4 && iVar.d == e0.NOT_NEGATIVE) {
            iVarD = iVar2.e(i4);
            c(iVar.d());
            this.a.g = i2;
        } else {
            iVarD = iVar2.d();
            this.a.g = c(iVar);
        }
        this.a.c.set(i2, iVarD);
    }

    public final void k(j$.time.temporal.n nVar) {
        j(new i(nVar, 1, 19, e0.NORMAL));
    }

    public final void l(j$.time.temporal.n nVar, int i2) {
        Objects.a(nVar, "field");
        if (i2 < 1 || i2 > 19) {
            j$.time.g.f("The width must be from 1 to 19 inclusive but was ", i2);
        } else {
            j(new i(nVar, i2, i2, e0.NOT_NEGATIVE));
        }
    }

    public final void m(j$.time.temporal.n nVar, int i2, int i3, e0 e0Var) {
        if (i2 == i3 && e0Var == e0.NOT_NEGATIVE) {
            l(nVar, i3);
            return;
        }
        Objects.a(nVar, "field");
        Objects.a(e0Var, "signStyle");
        if (i2 < 1 || i2 > 19) {
            j$.time.g.f("The minimum width must be from 1 to 19 inclusive but was ", i2);
            return;
        }
        if (i3 < 1 || i3 > 19) {
            j$.time.g.f("The maximum width must be from 1 to 19 inclusive but was ", i3);
            return;
        }
        if (i3 >= i2) {
            j(new i(nVar, i2, i3, e0Var));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public final void n() {
        u uVar = this.a;
        if (uVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        int size = uVar.c.size();
        u uVar2 = this.a;
        if (size <= 0) {
            this.a = uVar2.b;
            return;
        }
        d dVar = new d(uVar2.c, uVar2.d);
        this.a = this.a.b;
        c(dVar);
    }

    public final void o() {
        u uVar = this.a;
        uVar.g = -1;
        this.a = new u(uVar);
    }

    public final DateTimeFormatter p(d0 d0Var, j$.time.chrono.a aVar) {
        return q(Locale.getDefault(), d0Var, aVar);
    }

    public final DateTimeFormatter q(Locale locale, d0 d0Var, j$.time.chrono.a aVar) {
        Objects.a(locale, "locale");
        while (this.a.b != null) {
            n();
        }
        d dVar = new d(this.c, false);
        int i2 = b0.a;
        return new DateTimeFormatter(dVar, locale, d0Var, aVar);
    }

    public u(u uVar) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = uVar;
        this.d = true;
    }
}
