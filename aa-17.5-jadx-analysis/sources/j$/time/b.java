package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class b implements j$.time.temporal.k, j$.time.temporal.l {
    public static final b FRIDAY;
    public static final b MONDAY;
    public static final b SATURDAY;
    public static final b SUNDAY;
    public static final b THURSDAY;
    public static final b TUESDAY;
    public static final b WEDNESDAY;
    public static final b[] a;
    public static final /* synthetic */ b[] b;

    static {
        b bVar = new b("MONDAY", 0);
        MONDAY = bVar;
        b bVar2 = new b("TUESDAY", 1);
        TUESDAY = bVar2;
        b bVar3 = new b("WEDNESDAY", 2);
        WEDNESDAY = bVar3;
        b bVar4 = new b("THURSDAY", 3);
        THURSDAY = bVar4;
        b bVar5 = new b("FRIDAY", 4);
        FRIDAY = bVar5;
        b bVar6 = new b("SATURDAY", 5);
        SATURDAY = bVar6;
        b bVar7 = new b("SUNDAY", 6);
        SUNDAY = bVar7;
        b = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
        a = values();
    }

    public static b r(int i) {
        if (i >= 1 && i <= 7) {
            return a[i - 1];
        }
        g.b("Invalid value for DayOfWeek: ", i);
        return null;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) b.clone();
    }

    @Override // j$.time.temporal.k
    public final long C(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.l(this);
        }
        g.e("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0L;
    }

    @Override // j$.time.temporal.k
    public final boolean d(j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.DAY_OF_WEEK : nVar != null && nVar.h(this);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.a.DAY_OF_WEEK ? getValue() : j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q l(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.a.DAY_OF_WEEK ? nVar.range() : j$.time.temporal.o.d(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        return temporal.a(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }

    @Override // j$.time.temporal.k
    public final Object w(j$.desugar.sun.nio.fs.n nVar) {
        return nVar == j$.time.temporal.o.c ? ChronoUnit.DAYS : j$.time.temporal.o.c(this, nVar);
    }
}
