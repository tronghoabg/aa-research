package com.qonversion.android.sdk.dto.products;

import com.android.billingclient.api.ProductDetails;
import com.qonversion.android.sdk.dto.products.QSubscriptionPeriod;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import ic.d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002'(B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0013\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006)"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;", "", "originalPricingPhase", "Lcom/android/billingclient/api/ProductDetails$PricingPhase;", "(Lcom/android/billingclient/api/ProductDetails$PricingPhase;)V", "billingCycleCount", "", "getBillingCycleCount", "()I", "billingPeriod", "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;", "getBillingPeriod", "()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;", "isBasePlan", "", "()Z", "isIntro", "isTrial", "getOriginalPricingPhase", "()Lcom/android/billingclient/api/ProductDetails$PricingPhase;", InAppPurchaseMetaData.KEY_PRICE, "Lcom/qonversion/android/sdk/dto/products/QProductPrice;", "getPrice", "()Lcom/qonversion/android/sdk/dto/products/QProductPrice;", "recurrenceMode", "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;", "getRecurrenceMode", "()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;", "type", "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;", "getType", "()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;", "component1", "copy", "equals", "other", "hashCode", "toString", "", "RecurrenceMode", "Type", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QProductPricingPhase {
    private final int billingCycleCount;

    @NotNull
    private final QSubscriptionPeriod billingPeriod;
    private final boolean isBasePlan;
    private final boolean isIntro;
    private final boolean isTrial;

    @NotNull
    private final ProductDetails.PricingPhase originalPricingPhase;

    @NotNull
    private final QProductPrice price;

    @NotNull
    private final RecurrenceMode recurrenceMode;

    @NotNull
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;", "", "code", "", "(Ljava/lang/String;II)V", "InfiniteRecurring", "FiniteRecurring", "NonRecurring", "Unknown", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RecurrenceMode {
        private static final /* synthetic */ InterfaceC3559a $ENTRIES;
        private static final /* synthetic */ RecurrenceMode[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        private final int code;
        public static final RecurrenceMode InfiniteRecurring = new RecurrenceMode("InfiniteRecurring", 0, 1);
        public static final RecurrenceMode FiniteRecurring = new RecurrenceMode("FiniteRecurring", 1, 2);
        public static final RecurrenceMode NonRecurring = new RecurrenceMode("NonRecurring", 2, 3);
        public static final RecurrenceMode Unknown = new RecurrenceMode("Unknown", 3, -1);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode$Companion;", "", "()V", "from", "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;", "code", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final RecurrenceMode from(int code) {
                RecurrenceMode recurrenceMode;
                RecurrenceMode[] recurrenceModeArrValues = RecurrenceMode.values();
                int length = recurrenceModeArrValues.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        recurrenceMode = null;
                        break;
                    }
                    recurrenceMode = recurrenceModeArrValues[i5];
                    if (recurrenceMode.code == code) {
                        break;
                    }
                    i5++;
                }
                return recurrenceMode == null ? RecurrenceMode.Unknown : recurrenceMode;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ RecurrenceMode[] $values() {
            return new RecurrenceMode[]{InfiniteRecurring, FiniteRecurring, NonRecurring, Unknown};
        }

        static {
            RecurrenceMode[] recurrenceModeArr$values = $values();
            $VALUES = recurrenceModeArr$values;
            $ENTRIES = d.t(recurrenceModeArr$values);
            INSTANCE = new Companion(null);
        }

        private RecurrenceMode(String str, int i5, int i10) {
            this.code = i10;
        }

        @NotNull
        public static InterfaceC3559a getEntries() {
            return $ENTRIES;
        }

        public static RecurrenceMode valueOf(String str) {
            return (RecurrenceMode) Enum.valueOf(RecurrenceMode.class, str);
        }

        public static RecurrenceMode[] values() {
            return (RecurrenceMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;", "", "(Ljava/lang/String;I)V", "Regular", "FreeTrial", "DiscountedSinglePayment", "DiscountedRecurringPayment", "Unknown", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ InterfaceC3559a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Regular = new Type("Regular", 0);
        public static final Type FreeTrial = new Type("FreeTrial", 1);
        public static final Type DiscountedSinglePayment = new Type("DiscountedSinglePayment", 2);
        public static final Type DiscountedRecurringPayment = new Type("DiscountedRecurringPayment", 3);
        public static final Type Unknown = new Type("Unknown", 4);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{Regular, FreeTrial, DiscountedSinglePayment, DiscountedRecurringPayment, Unknown};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = d.t(typeArr$values);
        }

        private Type(String str, int i5) {
        }

        @NotNull
        public static InterfaceC3559a getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public QProductPricingPhase(@NotNull ProductDetails.PricingPhase originalPricingPhase) {
        AbstractC3340k.e(originalPricingPhase, "originalPricingPhase");
        this.originalPricingPhase = originalPricingPhase;
        long priceAmountMicros = originalPricingPhase.getPriceAmountMicros();
        String priceCurrencyCode = originalPricingPhase.getPriceCurrencyCode();
        AbstractC3340k.d(priceCurrencyCode, "getPriceCurrencyCode(...)");
        String formattedPrice = originalPricingPhase.getFormattedPrice();
        AbstractC3340k.d(formattedPrice, "getFormattedPrice(...)");
        QProductPrice qProductPrice = new QProductPrice(priceAmountMicros, priceCurrencyCode, formattedPrice);
        this.price = qProductPrice;
        QSubscriptionPeriod.Companion companion = QSubscriptionPeriod.INSTANCE;
        String billingPeriod = originalPricingPhase.getBillingPeriod();
        AbstractC3340k.d(billingPeriod, "getBillingPeriod(...)");
        this.billingPeriod = companion.from(billingPeriod);
        int billingCycleCount = originalPricingPhase.getBillingCycleCount();
        this.billingCycleCount = billingCycleCount;
        RecurrenceMode recurrenceModeFrom = RecurrenceMode.INSTANCE.from(originalPricingPhase.getRecurrenceMode());
        this.recurrenceMode = recurrenceModeFrom;
        Type type = recurrenceModeFrom != RecurrenceMode.FiniteRecurring ? Type.Regular : qProductPrice.getIsFree() ? Type.FreeTrial : billingCycleCount == 1 ? Type.DiscountedSinglePayment : billingCycleCount > 1 ? Type.DiscountedRecurringPayment : Type.Unknown;
        this.type = type;
        this.isTrial = type == Type.FreeTrial;
        this.isIntro = type == Type.DiscountedSinglePayment || type == Type.DiscountedRecurringPayment;
        this.isBasePlan = type == Type.Regular;
    }

    public static /* synthetic */ QProductPricingPhase copy$default(QProductPricingPhase qProductPricingPhase, ProductDetails.PricingPhase pricingPhase, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            pricingPhase = qProductPricingPhase.originalPricingPhase;
        }
        return qProductPricingPhase.copy(pricingPhase);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductDetails.PricingPhase getOriginalPricingPhase() {
        return this.originalPricingPhase;
    }

    @NotNull
    public final QProductPricingPhase copy(@NotNull ProductDetails.PricingPhase originalPricingPhase) {
        AbstractC3340k.e(originalPricingPhase, "originalPricingPhase");
        return new QProductPricingPhase(originalPricingPhase);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QProductPricingPhase) && AbstractC3340k.a(this.originalPricingPhase, ((QProductPricingPhase) other).originalPricingPhase);
    }

    public final int getBillingCycleCount() {
        return this.billingCycleCount;
    }

    @NotNull
    public final QSubscriptionPeriod getBillingPeriod() {
        return this.billingPeriod;
    }

    @NotNull
    public final ProductDetails.PricingPhase getOriginalPricingPhase() {
        return this.originalPricingPhase;
    }

    @NotNull
    public final QProductPrice getPrice() {
        return this.price;
    }

    @NotNull
    public final RecurrenceMode getRecurrenceMode() {
        return this.recurrenceMode;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        return this.originalPricingPhase.hashCode();
    }

    /* renamed from: isBasePlan, reason: from getter */
    public final boolean getIsBasePlan() {
        return this.isBasePlan;
    }

    /* renamed from: isIntro, reason: from getter */
    public final boolean getIsIntro() {
        return this.isIntro;
    }

    /* renamed from: isTrial, reason: from getter */
    public final boolean getIsTrial() {
        return this.isTrial;
    }

    @NotNull
    public String toString() {
        return "QProductPricingPhase(originalPricingPhase=" + this.originalPricingPhase + ")";
    }
}
