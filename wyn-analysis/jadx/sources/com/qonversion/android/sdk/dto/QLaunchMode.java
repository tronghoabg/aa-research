package com.qonversion.android.sdk.dto;

import ic.d;
import kotlin.Metadata;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/qonversion/android/sdk/dto/QLaunchMode;", "", "(Ljava/lang/String;I)V", "Analytics", "SubscriptionManagement", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QLaunchMode {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ QLaunchMode[] $VALUES;
    public static final QLaunchMode Analytics = new QLaunchMode("Analytics", 0);
    public static final QLaunchMode SubscriptionManagement = new QLaunchMode("SubscriptionManagement", 1);

    private static final /* synthetic */ QLaunchMode[] $values() {
        return new QLaunchMode[]{Analytics, SubscriptionManagement};
    }

    static {
        QLaunchMode[] qLaunchModeArr$values = $values();
        $VALUES = qLaunchModeArr$values;
        $ENTRIES = d.t(qLaunchModeArr$values);
    }

    private QLaunchMode(String str, int i5) {
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static QLaunchMode valueOf(String str) {
        return (QLaunchMode) Enum.valueOf(QLaunchMode.class, str);
    }

    public static QLaunchMode[] values() {
        return (QLaunchMode[]) $VALUES.clone();
    }
}
