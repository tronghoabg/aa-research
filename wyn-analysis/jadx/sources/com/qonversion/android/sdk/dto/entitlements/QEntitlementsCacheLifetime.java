package com.qonversion.android.sdk.dto.entitlements;

import com.google.android.gms.common.api.f;
import ic.d;
import kotlin.Metadata;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;", "", "days", "", "(Ljava/lang/String;II)V", "getDays", "()I", "Week", "TwoWeeks", "Month", "TwoMonths", "ThreeMonths", "SixMonths", "Year", "Unlimited", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QEntitlementsCacheLifetime {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ QEntitlementsCacheLifetime[] $VALUES;
    private final int days;
    public static final QEntitlementsCacheLifetime Week = new QEntitlementsCacheLifetime("Week", 0, 7);
    public static final QEntitlementsCacheLifetime TwoWeeks = new QEntitlementsCacheLifetime("TwoWeeks", 1, 14);
    public static final QEntitlementsCacheLifetime Month = new QEntitlementsCacheLifetime("Month", 2, 30);
    public static final QEntitlementsCacheLifetime TwoMonths = new QEntitlementsCacheLifetime("TwoMonths", 3, 60);
    public static final QEntitlementsCacheLifetime ThreeMonths = new QEntitlementsCacheLifetime("ThreeMonths", 4, 90);
    public static final QEntitlementsCacheLifetime SixMonths = new QEntitlementsCacheLifetime("SixMonths", 5, 180);
    public static final QEntitlementsCacheLifetime Year = new QEntitlementsCacheLifetime("Year", 6, 365);
    public static final QEntitlementsCacheLifetime Unlimited = new QEntitlementsCacheLifetime("Unlimited", 7, f.API_PRIORITY_OTHER);

    private static final /* synthetic */ QEntitlementsCacheLifetime[] $values() {
        return new QEntitlementsCacheLifetime[]{Week, TwoWeeks, Month, TwoMonths, ThreeMonths, SixMonths, Year, Unlimited};
    }

    static {
        QEntitlementsCacheLifetime[] qEntitlementsCacheLifetimeArr$values = $values();
        $VALUES = qEntitlementsCacheLifetimeArr$values;
        $ENTRIES = d.t(qEntitlementsCacheLifetimeArr$values);
    }

    private QEntitlementsCacheLifetime(String str, int i5, int i10) {
        this.days = i10;
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static QEntitlementsCacheLifetime valueOf(String str) {
        return (QEntitlementsCacheLifetime) Enum.valueOf(QEntitlementsCacheLifetime.class, str);
    }

    public static QEntitlementsCacheLifetime[] values() {
        return (QEntitlementsCacheLifetime[]) $VALUES.clone();
    }

    public final int getDays() {
        return this.days;
    }
}
