package com.qonversion.android.sdk.dto.products;

import Bf.e;
import Bf.f;
import Bf.r;
import ic.d;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wg.b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;", "", "unitCount", "", "unit", "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;", "iso", "", "(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)V", "getIso", "()Ljava/lang/String;", "getUnit", "()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;", "getUnitCount", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "Unit", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QSubscriptionPeriod {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String iso;

    @NotNull
    private final Unit unit;
    private final int unitCount;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;", "", "()V", "from", "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;", "isoPeriod", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static final int from$toPeriodCount(String str) {
            String str2 = str.length() > 0 ? str : null;
            if (str2 != null) {
                String strSubstring = str2.substring(0, str.length() - 1);
                AbstractC3340k.d(strSubstring, "substring(...)");
                Integer numL0 = r.l0(strSubstring);
                if (numL0 != null) {
                    return numL0.intValue();
                }
            }
            return 0;
        }

        @NotNull
        public final QSubscriptionPeriod from(@NotNull String isoPeriod) {
            AbstractC3340k.e(isoPeriod, "isoPeriod");
            Pattern patternCompile = Pattern.compile("^P(?!$)(\\d+Y)?(\\d+M)?(\\d+W)?(\\d+D)?$");
            AbstractC3340k.d(patternCompile, "compile(...)");
            Matcher matcher = patternCompile.matcher(isoPeriod);
            AbstractC3340k.d(matcher, "matcher(...)");
            f fVar = !matcher.matches() ? null : new f(matcher, isoPeriod);
            if (fVar == null) {
                return new QSubscriptionPeriod(0, Unit.Unknown, isoPeriod);
            }
            String str = (String) ((e) fVar.a()).get(1);
            String str2 = (String) ((e) fVar.a()).get(2);
            String str3 = (String) ((e) fVar.a()).get(3);
            String str4 = (String) ((e) fVar.a()).get(4);
            int iFrom$toPeriodCount = from$toPeriodCount(str);
            int iFrom$toPeriodCount2 = from$toPeriodCount(str2);
            int iFrom$toPeriodCount3 = from$toPeriodCount(str3);
            int iFrom$toPeriodCount4 = from$toPeriodCount(str4);
            return iFrom$toPeriodCount > 0 ? new QSubscriptionPeriod(iFrom$toPeriodCount, Unit.Year, isoPeriod) : iFrom$toPeriodCount2 > 0 ? new QSubscriptionPeriod(iFrom$toPeriodCount2, Unit.Month, isoPeriod) : iFrom$toPeriodCount3 > 0 ? new QSubscriptionPeriod(iFrom$toPeriodCount3, Unit.Week, isoPeriod) : iFrom$toPeriodCount4 > 0 ? new QSubscriptionPeriod(iFrom$toPeriodCount4, Unit.Day, isoPeriod) : new QSubscriptionPeriod(0, Unit.Unknown, isoPeriod);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;", "", "(Ljava/lang/String;I)V", "Day", "Week", "Month", "Year", "Unknown", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Unit {
        private static final /* synthetic */ InterfaceC3559a $ENTRIES;
        private static final /* synthetic */ Unit[] $VALUES;
        public static final Unit Day = new Unit("Day", 0);
        public static final Unit Week = new Unit("Week", 1);
        public static final Unit Month = new Unit("Month", 2);
        public static final Unit Year = new Unit("Year", 3);
        public static final Unit Unknown = new Unit("Unknown", 4);

        private static final /* synthetic */ Unit[] $values() {
            return new Unit[]{Day, Week, Month, Year, Unknown};
        }

        static {
            Unit[] unitArr$values = $values();
            $VALUES = unitArr$values;
            $ENTRIES = d.t(unitArr$values);
        }

        private Unit(String str, int i5) {
        }

        @NotNull
        public static InterfaceC3559a getEntries() {
            return $ENTRIES;
        }

        public static Unit valueOf(String str) {
            return (Unit) Enum.valueOf(Unit.class, str);
        }

        public static Unit[] values() {
            return (Unit[]) $VALUES.clone();
        }
    }

    public QSubscriptionPeriod(int i5, @NotNull Unit unit, @NotNull String iso) {
        AbstractC3340k.e(unit, "unit");
        AbstractC3340k.e(iso, "iso");
        this.unitCount = i5;
        this.unit = unit;
        this.iso = iso;
    }

    public static /* synthetic */ QSubscriptionPeriod copy$default(QSubscriptionPeriod qSubscriptionPeriod, int i5, Unit unit, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i5 = qSubscriptionPeriod.unitCount;
        }
        if ((i10 & 2) != 0) {
            unit = qSubscriptionPeriod.unit;
        }
        if ((i10 & 4) != 0) {
            str = qSubscriptionPeriod.iso;
        }
        return qSubscriptionPeriod.copy(i5, unit, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUnitCount() {
        return this.unitCount;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Unit getUnit() {
        return this.unit;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getIso() {
        return this.iso;
    }

    @NotNull
    public final QSubscriptionPeriod copy(int unitCount, @NotNull Unit unit, @NotNull String iso) {
        AbstractC3340k.e(unit, "unit");
        AbstractC3340k.e(iso, "iso");
        return new QSubscriptionPeriod(unitCount, unit, iso);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QSubscriptionPeriod)) {
            return false;
        }
        QSubscriptionPeriod qSubscriptionPeriod = (QSubscriptionPeriod) other;
        return this.unitCount == qSubscriptionPeriod.unitCount && this.unit == qSubscriptionPeriod.unit && AbstractC3340k.a(this.iso, qSubscriptionPeriod.iso);
    }

    @NotNull
    public final String getIso() {
        return this.iso;
    }

    @NotNull
    public final Unit getUnit() {
        return this.unit;
    }

    public final int getUnitCount() {
        return this.unitCount;
    }

    public int hashCode() {
        return this.iso.hashCode() + ((this.unit.hashCode() + (this.unitCount * 31)) * 31);
    }

    @NotNull
    public String toString() {
        int i5 = this.unitCount;
        Unit unit = this.unit;
        String str = this.iso;
        StringBuilder sb2 = new StringBuilder("QSubscriptionPeriod(unitCount=");
        sb2.append(i5);
        sb2.append(", unit=");
        sb2.append(unit);
        sb2.append(", iso=");
        return b.c(sb2, str, ")");
    }
}
