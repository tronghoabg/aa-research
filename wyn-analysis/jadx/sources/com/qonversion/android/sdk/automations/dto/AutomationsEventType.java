package com.qonversion.android.sdk.automations.dto;

import ic.d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, d2 = {"Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "Unknown", "TrialStarted", "TrialConverted", "TrialCanceled", "TrialBillingRetry", "SubscriptionStarted", "SubscriptionRenewed", "SubscriptionRefunded", "SubscriptionCanceled", "SubscriptionBillingRetry", "InAppPurchase", "SubscriptionUpgraded", "TrialStillActive", "TrialExpired", "SubscriptionExpired", "SubscriptionDowngraded", "SubscriptionProductChanged", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AutomationsEventType {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ AutomationsEventType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String type;
    public static final AutomationsEventType Unknown = new AutomationsEventType("Unknown", 0, "unknown");
    public static final AutomationsEventType TrialStarted = new AutomationsEventType("TrialStarted", 1, "trial_started");
    public static final AutomationsEventType TrialConverted = new AutomationsEventType("TrialConverted", 2, "trial_converted");
    public static final AutomationsEventType TrialCanceled = new AutomationsEventType("TrialCanceled", 3, "trial_canceled");
    public static final AutomationsEventType TrialBillingRetry = new AutomationsEventType("TrialBillingRetry", 4, "trial_billing_retry_entered");
    public static final AutomationsEventType SubscriptionStarted = new AutomationsEventType("SubscriptionStarted", 5, "subscription_started");
    public static final AutomationsEventType SubscriptionRenewed = new AutomationsEventType("SubscriptionRenewed", 6, "subscription_renewed");
    public static final AutomationsEventType SubscriptionRefunded = new AutomationsEventType("SubscriptionRefunded", 7, "subscription_refunded");
    public static final AutomationsEventType SubscriptionCanceled = new AutomationsEventType("SubscriptionCanceled", 8, "subscription_canceled");
    public static final AutomationsEventType SubscriptionBillingRetry = new AutomationsEventType("SubscriptionBillingRetry", 9, "subscription_billing_retry_entered");
    public static final AutomationsEventType InAppPurchase = new AutomationsEventType("InAppPurchase", 10, "in_app_purchase");
    public static final AutomationsEventType SubscriptionUpgraded = new AutomationsEventType("SubscriptionUpgraded", 11, "subscription_upgraded");
    public static final AutomationsEventType TrialStillActive = new AutomationsEventType("TrialStillActive", 12, "trial_still_active");
    public static final AutomationsEventType TrialExpired = new AutomationsEventType("TrialExpired", 13, "trial_expired");
    public static final AutomationsEventType SubscriptionExpired = new AutomationsEventType("SubscriptionExpired", 14, "subscription_expired");
    public static final AutomationsEventType SubscriptionDowngraded = new AutomationsEventType("SubscriptionDowngraded", 15, "subscription_downgraded");
    public static final AutomationsEventType SubscriptionProductChanged = new AutomationsEventType("SubscriptionProductChanged", 16, "subscription_product_changed");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType$Companion;", "", "()V", "fromType", "Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;", "type", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AutomationsEventType fromType(@Nullable String type) {
            AutomationsEventType automationsEventType;
            AutomationsEventType[] automationsEventTypeArrValues = AutomationsEventType.values();
            int length = automationsEventTypeArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    automationsEventType = null;
                    break;
                }
                automationsEventType = automationsEventTypeArrValues[i5];
                if (AbstractC3340k.a(automationsEventType.getType(), type)) {
                    break;
                }
                i5++;
            }
            return automationsEventType == null ? AutomationsEventType.Unknown : automationsEventType;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ AutomationsEventType[] $values() {
        return new AutomationsEventType[]{Unknown, TrialStarted, TrialConverted, TrialCanceled, TrialBillingRetry, SubscriptionStarted, SubscriptionRenewed, SubscriptionRefunded, SubscriptionCanceled, SubscriptionBillingRetry, InAppPurchase, SubscriptionUpgraded, TrialStillActive, TrialExpired, SubscriptionExpired, SubscriptionDowngraded, SubscriptionProductChanged};
    }

    static {
        AutomationsEventType[] automationsEventTypeArr$values = $values();
        $VALUES = automationsEventTypeArr$values;
        $ENTRIES = d.t(automationsEventTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private AutomationsEventType(String str, int i5, String str2) {
        this.type = str2;
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static AutomationsEventType valueOf(String str) {
        return (AutomationsEventType) Enum.valueOf(AutomationsEventType.class, str);
    }

    public static AutomationsEventType[] values() {
        return (AutomationsEventType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
