package j$.time;

import com.vungle.ads.internal.protos.Sdk;
import j$.time.chrono.AbstractC2901i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m implements TemporalAccessor, j$.time.temporal.m {
    public static final m APRIL;
    public static final m AUGUST;
    public static final m DECEMBER;
    public static final m FEBRUARY;
    public static final m JANUARY;
    public static final m JULY;
    public static final m JUNE;
    public static final m MARCH;
    public static final m MAY;
    public static final m NOVEMBER;
    public static final m OCTOBER;
    public static final m SEPTEMBER;

    /* renamed from: a, reason: collision with root package name */
    private static final m[] f37649a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ m[] f37650b;

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f37650b.clone();
    }

    static {
        m mVar = new m("JANUARY", 0);
        JANUARY = mVar;
        m mVar2 = new m("FEBRUARY", 1);
        FEBRUARY = mVar2;
        m mVar3 = new m("MARCH", 2);
        MARCH = mVar3;
        m mVar4 = new m("APRIL", 3);
        APRIL = mVar4;
        m mVar5 = new m("MAY", 4);
        MAY = mVar5;
        m mVar6 = new m("JUNE", 5);
        JUNE = mVar6;
        m mVar7 = new m("JULY", 6);
        JULY = mVar7;
        m mVar8 = new m("AUGUST", 7);
        AUGUST = mVar8;
        m mVar9 = new m("SEPTEMBER", 8);
        SEPTEMBER = mVar9;
        m mVar10 = new m("OCTOBER", 9);
        OCTOBER = mVar10;
        m mVar11 = new m("NOVEMBER", 10);
        NOVEMBER = mVar11;
        m mVar12 = new m("DECEMBER", 11);
        DECEMBER = mVar12;
        f37650b = new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12};
        f37649a = values();
    }

    public static m U(int i5) {
        if (i5 < 1 || i5 > 12) {
            throw new c("Invalid value for MonthOfYear: " + i5);
        }
        return f37649a[i5 - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.MONTH_OF_YEAR : qVar != null && qVar.t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return qVar.o();
        }
        return j$.time.temporal.l.d(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int q(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        return j$.time.temporal.l.a(this, qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(d.a("Unsupported field: ", qVar));
        }
        return qVar.s(this);
    }

    public final m V() {
        return f37649a[((((int) 1) + 12) + ordinal()) % 12];
    }

    public final int S(boolean z2) {
        int i5 = l.f37648a[ordinal()];
        return i5 != 1 ? (i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5) ? 30 : 31 : z2 ? 29 : 28;
    }

    public final int T() {
        int i5 = l.f37648a[ordinal()];
        if (i5 != 1) {
            return (i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int R(boolean z2) {
        switch (l.f37648a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z2 ? 1 : 0) + 91;
            case 3:
                return (z2 ? 1 : 0) + 152;
            case 4:
                return (z2 ? 1 : 0) + 244;
            case 5:
                return (z2 ? 1 : 0) + Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE;
            case 6:
                return 1;
            case 7:
                return (z2 ? 1 : 0) + 60;
            case 8:
                return (z2 ? 1 : 0) + 121;
            case 9:
                return (z2 ? 1 : 0) + 182;
            case 10:
                return (z2 ? 1 : 0) + Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE;
            case 11:
                return (z2 ? 1 : 0) + 274;
            default:
                return (z2 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object B(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.e()) {
            return j$.time.chrono.t.f37543d;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        if (!AbstractC2901i.q(temporal).equals(j$.time.chrono.t.f37543d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return temporal.d(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
