package com.qonversion.android.sdk.internal.billing;

import A7.AbstractC0279p0;
import E5.Q;
import R8.v;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.dto.products.QProductOfferDetails;
import com.qonversion.android.sdk.dto.products.QProductPricingPhase;
import com.qonversion.android.sdk.dto.products.QSubscriptionPeriod;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import ff.o;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\b\u0010\"\u001a\u00020#H\u0000\u001a\f\u0010$\u001a\u00020\u001c*\u00020#H\u0002\u001a\f\u0010%\u001a\u00020\u001c*\u00020\u0014H\u0000\u001a\f\u0010%\u001a\u00020\u001c*\u00020\u001dH\u0000\u001a\f\u0010%\u001a\u00020\u001c*\u00020 H\u0000\u001a\f\u0010%\u001a\u00020\u001c*\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\u0002\u001a\u00020\u0001*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007\"\u001e\u0010\b\u001a\u00020\t*\u00020\n8@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0018\u0010\u000f\u001a\u00020\u0001*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015\"\u0018\u0010\u0016\u001a\u00020\u0017*\u00020\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001c*\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001c*\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010!¨\u0006&"}, d2 = {"MAX_BILLING_PHASES_DURATION_YEARS", "", "durationDays", "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;", "getDurationDays", "(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;)I", "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;", "(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)I", "hasAnyStoreDetails", "", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "getHasAnyStoreDetails$annotations", "(Lcom/qonversion/android/sdk/dto/products/QProduct;)V", "getHasAnyStoreDetails", "(Lcom/qonversion/android/sdk/dto/products/QProduct;)Z", "inDays", "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;", "getInDays", "(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;)I", "isOk", "Lcom/android/billingclient/api/BillingResult;", "(Lcom/android/billingclient/api/BillingResult;)Z", "pricePerMaxDuration", "", "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;", "getPricePerMaxDuration", "(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)D", InAppPurchaseMetaData.KEY_PRODUCT_ID, "", "Lcom/android/billingclient/api/Purchase;", "getProductId", "(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;", "getCurrentTimeInMillis", "", "convertLongToTime", "getDescription", "sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UtilsKt {
    private static final int MAX_BILLING_PHASES_DURATION_YEARS = 55;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[QProductPricingPhase.Type.values().length];
            try {
                iArr[QProductPricingPhase.Type.FreeTrial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QProductPricingPhase.Type.DiscountedRecurringPayment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QProductPricingPhase.Type.DiscountedSinglePayment.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[QSubscriptionPeriod.Unit.values().length];
            try {
                iArr2[QSubscriptionPeriod.Unit.Day.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[QSubscriptionPeriod.Unit.Week.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[QSubscriptionPeriod.Unit.Month.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[QSubscriptionPeriod.Unit.Year.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[QSubscriptionPeriod.Unit.Unknown.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final String convertLongToTime(long j8) {
        String str = new SimpleDateFormat("yyyy.MM.dd HH:mm", Locale.getDefault()).format(new Date(j8));
        AbstractC3340k.d(str, "format(...)");
        return str;
    }

    public static final long getCurrentTimeInMillis() {
        return Calendar.getInstance().getTimeInMillis();
    }

    @NotNull
    public static final String getDescription(@NotNull BillingResult billingResult) {
        AbstractC3340k.e(billingResult, "<this>");
        return v.f("It is a proxy of the Google BillingClient error: ", getDescription(billingResult.getResponseCode()));
    }

    public static final int getDurationDays(@NotNull QProductPricingPhase qProductPricingPhase) {
        AbstractC3340k.e(qProductPricingPhase, "<this>");
        int i5 = WhenMappings.$EnumSwitchMapping$0[qProductPricingPhase.getType().ordinal()];
        if (i5 != 1 && i5 != 2 && i5 != 3) {
            return 0;
        }
        return qProductPricingPhase.getBillingCycleCount() * getDurationDays(qProductPricingPhase.getBillingPeriod());
    }

    public static final boolean getHasAnyStoreDetails(@NotNull QProduct qProduct) {
        AbstractC3340k.e(qProduct, "<this>");
        return (qProduct.getSkuDetail() == null && qProduct.getStoreDetails() == null) ? false : true;
    }

    public static /* synthetic */ void getHasAnyStoreDetails$annotations(QProduct qProduct) {
    }

    public static final int getInDays(@NotNull QSubscriptionPeriod.Unit unit) {
        AbstractC3340k.e(unit, "<this>");
        int i5 = WhenMappings.$EnumSwitchMapping$1[unit.ordinal()];
        if (i5 == 1) {
            return 1;
        }
        if (i5 == 2) {
            return 7;
        }
        if (i5 == 3) {
            return 30;
        }
        if (i5 == 4) {
            return 365;
        }
        if (i5 == 5) {
            return 0;
        }
        throw new Q((byte) 0, 9);
    }

    public static final double getPricePerMaxDuration(@NotNull QProductOfferDetails qProductOfferDetails) {
        AbstractC3340k.e(qProductOfferDetails, "<this>");
        int inDays = getInDays(QSubscriptionPeriod.Unit.Year) * 55;
        double priceAmountMicros = 0.0d;
        for (QProductPricingPhase qProductPricingPhase : qProductOfferDetails.getPricingPhases()) {
            if (qProductPricingPhase.getIsBasePlan()) {
                return (qProductPricingPhase.getPrice().getPriceAmountMicros() * (getDurationDays(qProductPricingPhase.getBillingPeriod()) != 0 ? inDays / getDurationDays(qProductPricingPhase.getBillingPeriod()) : Double.MAX_VALUE)) + priceAmountMicros;
            }
            inDays -= getDurationDays(qProductPricingPhase);
            if (!qProductPricingPhase.getIsTrial()) {
                priceAmountMicros += qProductPricingPhase.getPrice().getPriceAmountMicros() * qProductPricingPhase.getBillingCycleCount();
            }
        }
        return priceAmountMicros;
    }

    @Nullable
    public static final String getProductId(@NotNull Purchase purchase) {
        AbstractC3340k.e(purchase, "<this>");
        List<String> products = purchase.getProducts();
        AbstractC3340k.d(products, "getProducts(...)");
        return (String) o.s0(products);
    }

    public static final boolean isOk(@NotNull BillingResult billingResult) {
        AbstractC3340k.e(billingResult, "<this>");
        return billingResult.getResponseCode() == 0;
    }

    @Nullable
    public static final String getProductId(@NotNull PurchaseHistoryRecord purchaseHistoryRecord) {
        AbstractC3340k.e(purchaseHistoryRecord, "<this>");
        List<String> products = purchaseHistoryRecord.getProducts();
        AbstractC3340k.d(products, "getProducts(...)");
        return (String) o.s0(products);
    }

    public static final int getDurationDays(@NotNull QSubscriptionPeriod qSubscriptionPeriod) {
        AbstractC3340k.e(qSubscriptionPeriod, "<this>");
        return qSubscriptionPeriod.getUnitCount() * getInDays(qSubscriptionPeriod.getUnit());
    }

    @NotNull
    public static final String getDescription(@NotNull PurchaseHistoryRecord purchaseHistoryRecord) {
        AbstractC3340k.e(purchaseHistoryRecord, "<this>");
        String productId = getProductId(purchaseHistoryRecord);
        String strConvertLongToTime = convertLongToTime(purchaseHistoryRecord.getPurchaseTime());
        String purchaseToken = purchaseHistoryRecord.getPurchaseToken();
        StringBuilder sbR = AbstractC0279p0.r("ProductId: ", productId, "; PurchaseTime: ", strConvertLongToTime, "; PurchaseToken: ");
        sbR.append(purchaseToken);
        return sbR.toString();
    }

    @NotNull
    public static final String getDescription(@NotNull Purchase purchase) {
        AbstractC3340k.e(purchase, "<this>");
        String productId = getProductId(purchase);
        String orderId = purchase.getOrderId();
        String purchaseToken = purchase.getPurchaseToken();
        StringBuilder sbR = AbstractC0279p0.r("ProductId: ", productId, "; OrderId: ", orderId, "; PurchaseToken: ");
        sbR.append(purchaseToken);
        return sbR.toString();
    }

    private static final String getDescription(int i5) {
        if (i5 != 12) {
            switch (i5) {
                case -2:
                    return "FEATURE_NOT_SUPPORTED";
                case -1:
                    return "SERVICE_DISCONNECTED";
                case 0:
                    return "OK";
                case 1:
                    return "USER_CANCELED";
                case 2:
                    return "SERVICE_UNAVAILABLE";
                case 3:
                    return "BILLING_UNAVAILABLE";
                case 4:
                    return "ITEM_UNAVAILABLE";
                case 5:
                    return "DEVELOPER_ERROR";
                case 6:
                    return "ERROR";
                case 7:
                    return "ITEM_ALREADY_OWNED";
                case 8:
                    return "ITEM_NOT_OWNED";
                default:
                    return String.valueOf(i5);
            }
        }
        return "NETWORK_ERROR";
    }
}
