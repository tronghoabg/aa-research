package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: f, reason: collision with root package name */
    private static final C2904a f37602f = new C2904a();

    /* renamed from: a, reason: collision with root package name */
    private p f37603a;

    /* renamed from: b, reason: collision with root package name */
    private final p f37604b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f37605c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37606d;

    /* renamed from: e, reason: collision with root package name */
    private int f37607e;

    static {
        HashMap map = new HashMap();
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.q qVar = j$.time.temporal.i.f37676a;
        map.put('Q', qVar);
        map.put('q', qVar);
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
        map.put('g', j$.time.temporal.k.f37683a);
    }

    public p() {
        this.f37603a = this;
        this.f37605c = new ArrayList();
        this.f37607e = -1;
        this.f37604b = null;
        this.f37606d = false;
    }

    private p(p pVar) {
        this.f37603a = this;
        this.f37605c = new ArrayList();
        this.f37607e = -1;
        this.f37604b = pVar;
        this.f37606d = true;
    }

    public final void q() {
        d(m.SENSITIVE);
    }

    public final void p() {
        d(m.INSENSITIVE);
    }

    public final void s() {
        d(m.STRICT);
    }

    public final void r() {
        d(m.LENIENT);
    }

    public final void k(j$.time.temporal.q qVar, int i5) {
        Objects.requireNonNull(qVar, "field");
        if (i5 < 1 || i5 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i5);
        }
        j(new i(qVar, i5, i5, z.NOT_NEGATIVE));
    }

    public final void l(j$.time.temporal.q qVar, int i5, int i10, z zVar) {
        if (i5 == i10 && zVar == z.NOT_NEGATIVE) {
            k(qVar, i10);
            return;
        }
        Objects.requireNonNull(qVar, "field");
        Objects.requireNonNull(zVar, "signStyle");
        if (i5 < 1 || i5 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i5);
        }
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i10);
        }
        if (i10 < i5) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i10 + " < " + i5);
        }
        j(new i(qVar, i5, i10, zVar));
    }

    private void j(i iVar) {
        i iVarC;
        p pVar = this.f37603a;
        int i5 = pVar.f37607e;
        if (i5 >= 0) {
            i iVar2 = (i) pVar.f37605c.get(i5);
            int i10 = iVar.f37578b;
            int i11 = iVar.f37579c;
            if (i10 == i11 && iVar.f37580d == z.NOT_NEGATIVE) {
                iVarC = iVar2.d(i11);
                d(iVar.c());
                this.f37603a.f37607e = i5;
            } else {
                iVarC = iVar2.c();
                this.f37603a.f37607e = d(iVar);
            }
            this.f37603a.f37605c.set(i5, iVarC);
            return;
        }
        pVar.f37607e = d(iVar);
    }

    public final void b(j$.time.temporal.a aVar) {
        g gVar = new g(aVar, 0, 9, true, 0);
        Objects.requireNonNull(aVar, "field");
        if (aVar.o().g()) {
            d(gVar);
        } else {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        }
    }

    public final void i(j$.time.temporal.a aVar, HashMap map) {
        Objects.requireNonNull(aVar, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        A a5 = A.FULL;
        d(new o(aVar, a5, new b(new v(Collections.singletonMap(a5, linkedHashMap)))));
    }

    public final void c() {
        d(new h());
    }

    public final void h() {
        d(j.f37583e);
    }

    public final void g(String str, String str2) {
        d(new j(str, str2));
    }

    public final void m() {
        d(new n(1, f37602f));
    }

    public final void e(char c10) {
        d(new d(c10));
    }

    public final void f(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            d(new d(str.charAt(0)));
        } else {
            d(new n(0, str));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.f());
    }

    public final void o() {
        p pVar = this.f37603a;
        pVar.f37607e = -1;
        this.f37603a = new p(pVar);
    }

    public final void n() {
        p pVar = this.f37603a;
        if (pVar.f37604b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (pVar.f37605c.size() > 0) {
            p pVar2 = this.f37603a;
            e eVar = new e(pVar2.f37605c, pVar2.f37606d);
            this.f37603a = this.f37603a.f37604b;
            d(eVar);
            return;
        }
        this.f37603a = this.f37603a.f37604b;
    }

    private int d(f fVar) {
        Objects.requireNonNull(fVar, "pp");
        p pVar = this.f37603a;
        pVar.getClass();
        pVar.f37605c.add(fVar);
        this.f37603a.f37607e = -1;
        return r2.f37605c.size() - 1;
    }

    public final DateTimeFormatter t() {
        return v(Locale.getDefault(), y.SMART, null);
    }

    final DateTimeFormatter u(y yVar, j$.time.chrono.t tVar) {
        return v(Locale.getDefault(), yVar, tVar);
    }

    private DateTimeFormatter v(Locale locale, y yVar, j$.time.chrono.t tVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f37603a.f37604b != null) {
            n();
        }
        e eVar = new e(this.f37605c, false);
        w wVar = w.f37621a;
        return new DateTimeFormatter(eVar, locale, yVar, tVar);
    }
}
