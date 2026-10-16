package Ge;

import be.EnumC1525a;
import com.android.billingclient.api.SkuDetails;
import com.applovin.sdk.AppLovinEventParameters;
import com.qonversion.android.sdk.dto.QRemoteConfig;
import com.qonversion.android.sdk.dto.QRemoteConfigList;
import com.qonversion.android.sdk.dto.QRemoteConfigurationAssignmentType;
import com.qonversion.android.sdk.dto.QRemoteConfigurationSource;
import com.qonversion.android.sdk.dto.QRemoteConfigurationSourceType;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.entitlements.QEntitlement;
import com.qonversion.android.sdk.dto.entitlements.QTransaction;
import com.qonversion.android.sdk.dto.experiments.QExperiment;
import com.qonversion.android.sdk.dto.experiments.QExperimentGroup;
import com.qonversion.android.sdk.dto.experiments.QExperimentGroupType;
import com.qonversion.android.sdk.dto.offerings.QOffering;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.dto.products.QProductInAppDetails;
import com.qonversion.android.sdk.dto.products.QProductInstallmentPlanDetails;
import com.qonversion.android.sdk.dto.products.QProductOfferDetails;
import com.qonversion.android.sdk.dto.products.QProductPrice;
import com.qonversion.android.sdk.dto.products.QProductPricingPhase;
import com.qonversion.android.sdk.dto.products.QProductStoreDetails;
import com.qonversion.android.sdk.dto.products.QSubscriptionPeriod;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.ads.metadata.MediationMetaData;
import ef.C2527k;
import ff.AbstractC2640A;
import ff.AbstractC2641B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class c {
    public static final LinkedHashMap a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2641B.D(map.size()));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            QEntitlement qEntitlement = (QEntitlement) entry.getValue();
            AbstractC3340k.e(qEntitlement, "<this>");
            C2527k c2527k = new C2527k("id", qEntitlement.getId());
            C2527k c2527k2 = new C2527k("startedTimestamp", Double.valueOf(qEntitlement.getStartedDate().getTime()));
            String str = "expirationTimestamp";
            C2527k c2527k3 = new C2527k("expirationTimestamp", qEntitlement.getExpirationDate() != null ? Double.valueOf(r0.getTime()) : null);
            C2527k c2527k4 = new C2527k("active", Boolean.valueOf(qEntitlement.isActive()));
            C2527k c2527k5 = new C2527k("source", qEntitlement.getSource().name());
            C2527k c2527k6 = new C2527k(InAppPurchaseMetaData.KEY_PRODUCT_ID, qEntitlement.getProductId());
            C2527k c2527k7 = new C2527k("renewState", qEntitlement.getRenewState().getType());
            C2527k c2527k8 = new C2527k("renewsCount", Integer.valueOf(qEntitlement.getRenewsCount()));
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            C2527k c2527k9 = new C2527k("trialStartTimestamp", qEntitlement.getTrialStartDate() != null ? Double.valueOf(r0.getTime()) : null);
            C2527k c2527k10 = new C2527k("firstPurchaseTimestamp", qEntitlement.getFirstPurchaseDate() != null ? Double.valueOf(r0.getTime()) : null);
            Iterator it2 = it;
            C2527k c2527k11 = new C2527k("lastPurchaseTimestamp", qEntitlement.getLastPurchaseDate() != null ? Double.valueOf(r0.getTime()) : null);
            C2527k c2527k12 = new C2527k("lastActivatedOfferCode", qEntitlement.getLastActivatedOfferCode());
            C2527k c2527k13 = new C2527k("autoRenewDisableTimestamp", qEntitlement.getAutoRenewDisableDate() != null ? Double.valueOf(r0.getTime()) : null);
            C2527k c2527k14 = new C2527k("grantType", qEntitlement.getGrantType().name());
            List<QTransaction> transactions = qEntitlement.getTransactions();
            ArrayList arrayList = new ArrayList(ff.p.a0(transactions, 10));
            Iterator it3 = transactions.iterator();
            while (it3.hasNext()) {
                QTransaction qTransaction = (QTransaction) it3.next();
                AbstractC3340k.e(qTransaction, "<this>");
                Iterator it4 = it3;
                C2527k c2527k15 = c2527k4;
                C2527k c2527k16 = c2527k5;
                String str2 = str;
                arrayList.add(AbstractC2640A.R(new C2527k("originalTransactionId", qTransaction.getOriginalTransactionId()), new C2527k("transactionId", qTransaction.getTransactionId()), new C2527k("offerCode", qTransaction.getOfferCode()), new C2527k("transactionTimestamp", Double.valueOf(qTransaction.getTransactionDate().getTime())), new C2527k(str, qTransaction.getExpirationDate() != null ? Double.valueOf(r0.getTime()) : null), new C2527k("transactionRevocationTimestamp", qTransaction.getTransactionRevocationDate() != null ? Double.valueOf(r0.getTime()) : null), new C2527k("ownershipType", qTransaction.getOwnershipType().name()), new C2527k("type", qTransaction.getType().name()), new C2527k("environment", qTransaction.getEnvironment().name())));
                str = str2;
                it3 = it4;
                c2527k4 = c2527k15;
                c2527k5 = c2527k16;
            }
            linkedHashMap2.put(key, AbstractC2640A.R(c2527k, c2527k2, c2527k3, c2527k4, c2527k5, c2527k6, c2527k7, c2527k8, c2527k9, c2527k10, c2527k11, c2527k12, c2527k13, c2527k14, new C2527k("transactions", arrayList)));
            linkedHashMap = linkedHashMap2;
            it = it2;
        }
        return linkedHashMap;
    }

    public static final Map b(G9.e eVar) {
        AbstractC3340k.e(eVar, "<this>");
        C2527k c2527k = new C2527k("code", ((EnumC1525a) eVar.f4685b).toString());
        C2527k c2527k2 = new C2527k("description", (String) eVar.f4686c);
        QonversionError qonversionError = (QonversionError) eVar.f4687d;
        return AbstractC2640A.R(c2527k, c2527k2, new C2527k("qonversionError", qonversionError != null ? AbstractC2640A.R(new C2527k("code", qonversionError.getCode().toString()), new C2527k("description", qonversionError.getDescription()), new C2527k("additionalMessage", qonversionError.getAdditionalMessage())) : null));
    }

    public static final Map c(ae.f fVar) {
        LinkedHashMap linkedHashMap;
        Map map = fVar.f17649b;
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC2641B.D(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap2.put(((ae.c) entry.getKey()).f17635a, entry.getValue());
            }
            linkedHashMap = new LinkedHashMap(AbstractC2641B.D(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        } else {
            linkedHashMap = null;
        }
        C2527k c2527k = new C2527k("type", fVar.f17648a.f17647a);
        C2527k c2527k2 = new C2527k("parameters", linkedHashMap);
        G9.e eVar = fVar.f17650c;
        return AbstractC2640A.R(c2527k, c2527k2, new C2527k("error", eVar != null ? b(eVar) : null));
    }

    public static final Map d(QRemoteConfig qRemoteConfig) {
        char c10;
        Map mapR;
        AbstractC3340k.e(qRemoteConfig, "<this>");
        C2527k c2527k = new C2527k("payload", qRemoteConfig.getPayload());
        QExperiment experiment = qRemoteConfig.getExperiment();
        String str = "unknown";
        if (experiment != null) {
            C2527k c2527k2 = new C2527k("id", experiment.getId());
            C2527k c2527k3 = new C2527k(MediationMetaData.KEY_NAME, experiment.getName());
            QExperimentGroup group = experiment.getGroup();
            AbstractC3340k.e(group, "<this>");
            C2527k c2527k4 = new C2527k("id", group.getId());
            c10 = 0;
            C2527k c2527k5 = new C2527k(MediationMetaData.KEY_NAME, group.getName());
            QExperimentGroupType type = group.getType();
            AbstractC3340k.e(type, "<this>");
            int i5 = b.f4735a[type.ordinal()];
            mapR = AbstractC2640A.R(c2527k2, c2527k3, new C2527k("group", AbstractC2640A.R(c2527k4, c2527k5, new C2527k("type", i5 != 1 ? i5 != 2 ? "unknown" : "control" : "treatment"))));
        } else {
            c10 = 0;
            mapR = null;
        }
        C2527k c2527k6 = new C2527k("experiment", mapR);
        QRemoteConfigurationSource source = qRemoteConfig.getSource();
        AbstractC3340k.e(source, "<this>");
        C2527k c2527k7 = new C2527k("id", source.getId());
        C2527k c2527k8 = new C2527k(MediationMetaData.KEY_NAME, source.getName());
        QRemoteConfigurationSourceType type2 = source.getType();
        AbstractC3340k.e(type2, "<this>");
        int i10 = b.f4736b[type2.ordinal()];
        C2527k c2527k9 = new C2527k("type", i10 != 1 ? i10 != 2 ? i10 != 3 ? "unknown" : "experiment_control_group" : "experiment_treatment_group" : "remote_configuration");
        QRemoteConfigurationAssignmentType assignmentType = source.getAssignmentType();
        AbstractC3340k.e(assignmentType, "<this>");
        int i11 = b.f4737c[assignmentType.ordinal()];
        if (i11 == 1) {
            str = "auto";
        } else if (i11 == 2) {
            str = "manual";
        }
        C2527k c2527k10 = new C2527k("assignmentType", str);
        C2527k c2527k11 = new C2527k("contextKey", source.getContextKey());
        C2527k[] c2527kArr = new C2527k[5];
        c2527kArr[c10] = c2527k7;
        c2527kArr[1] = c2527k8;
        c2527kArr[2] = c2527k9;
        c2527kArr[3] = c2527k10;
        c2527kArr[4] = c2527k11;
        C2527k c2527k12 = new C2527k("source", AbstractC2640A.R(c2527kArr));
        C2527k[] c2527kArr2 = new C2527k[3];
        c2527kArr2[c10] = c2527k;
        c2527kArr2[1] = c2527k6;
        c2527kArr2[2] = c2527k12;
        return AbstractC2640A.R(c2527kArr2);
    }

    public static final Map e(QRemoteConfigList qRemoteConfigList) {
        List<QRemoteConfig> remoteConfigs = qRemoteConfigList.getRemoteConfigs();
        ArrayList arrayList = new ArrayList(ff.p.a0(remoteConfigs, 10));
        Iterator<T> it = remoteConfigs.iterator();
        while (it.hasNext()) {
            arrayList.add(d((QRemoteConfig) it.next()));
        }
        return AbstractC2641B.E(new C2527k("remoteConfigs", arrayList));
    }

    public static final Map f(QOffering qOffering) {
        AbstractC3340k.e(qOffering, "<this>");
        C2527k c2527k = new C2527k("id", qOffering.getOfferingID());
        C2527k c2527k2 = new C2527k("tag", qOffering.getTag().getTag());
        List<QProduct> products = qOffering.getProducts();
        ArrayList arrayList = new ArrayList(ff.p.a0(products, 10));
        Iterator<T> it = products.iterator();
        while (it.hasNext()) {
            arrayList.add(g((QProduct) it.next()));
        }
        return AbstractC2640A.R(c2527k, c2527k2, new C2527k("products", arrayList));
    }

    public static final Map g(QProduct qProduct) {
        int i5;
        Map mapR;
        C2527k c2527k;
        C2527k c2527k2;
        ArrayList arrayList;
        AbstractC3340k.e(qProduct, "<this>");
        C2527k c2527k3 = new C2527k("id", qProduct.getQonversionID());
        C2527k c2527k4 = new C2527k("storeId", qProduct.getStoreID());
        C2527k c2527k5 = new C2527k("basePlanId", qProduct.getBasePlanID());
        C2527k c2527k6 = new C2527k("type", qProduct.getType().name());
        QSubscriptionPeriod subscriptionPeriod = qProduct.getSubscriptionPeriod();
        C2527k c2527k7 = new C2527k("subscriptionPeriod", subscriptionPeriod != null ? k(subscriptionPeriod) : null);
        QSubscriptionPeriod trialPeriod = qProduct.getTrialPeriod();
        C2527k c2527k8 = new C2527k("trialPeriod", trialPeriod != null ? k(trialPeriod) : null);
        SkuDetails skuDetail = qProduct.getSkuDetail();
        if (skuDetail != null) {
            i5 = 10;
            mapR = AbstractC2640A.R(new C2527k("description", skuDetail.getDescription()), new C2527k("freeTrialPeriod", skuDetail.getFreeTrialPeriod()), new C2527k("iconUrl", skuDetail.getIconUrl()), new C2527k("introductoryPrice", skuDetail.getIntroductoryPrice()), new C2527k("introductoryPriceAmountMicros", Long.valueOf(skuDetail.getIntroductoryPriceAmountMicros())), new C2527k("introductoryPriceCycles", Integer.valueOf(skuDetail.getIntroductoryPriceCycles())), new C2527k("introductoryPricePeriod", skuDetail.getIntroductoryPricePeriod()), new C2527k("originalJson", skuDetail.getOriginalJson()), new C2527k("originalPrice", skuDetail.getOriginalPrice()), new C2527k("originalPriceAmountMicros", Long.valueOf(skuDetail.getOriginalPriceAmountMicros())), new C2527k(InAppPurchaseMetaData.KEY_PRICE, skuDetail.getPrice()), new C2527k("priceAmountMicros", Long.valueOf(skuDetail.getPriceAmountMicros())), new C2527k("priceCurrencyCode", skuDetail.getPriceCurrencyCode()), new C2527k(AppLovinEventParameters.PRODUCT_IDENTIFIER, skuDetail.getSku()), new C2527k("subscriptionPeriod", skuDetail.getSubscriptionPeriod()), new C2527k("title", skuDetail.getTitle()), new C2527k("type", skuDetail.getType()), new C2527k("hashCode", Integer.valueOf(skuDetail.hashCode())), new C2527k("toString", skuDetail.toString()));
        } else {
            i5 = 10;
            mapR = null;
        }
        C2527k c2527k9 = new C2527k("skuDetails", mapR);
        QProductStoreDetails storeDetails = qProduct.getStoreDetails();
        if (storeDetails != null) {
            C2527k c2527k10 = new C2527k("basePlanId", storeDetails.getBasePlanId());
            C2527k c2527k11 = new C2527k(InAppPurchaseMetaData.KEY_PRODUCT_ID, storeDetails.getProductId());
            C2527k c2527k12 = new C2527k(MediationMetaData.KEY_NAME, storeDetails.getName());
            C2527k c2527k13 = new C2527k("title", storeDetails.getTitle());
            C2527k c2527k14 = new C2527k("description", storeDetails.getDescription());
            List<QProductOfferDetails> subscriptionOfferDetails = storeDetails.getSubscriptionOfferDetails();
            if (subscriptionOfferDetails != null) {
                List<QProductOfferDetails> list = subscriptionOfferDetails;
                c2527k = c2527k9;
                c2527k2 = c2527k13;
                arrayList = new ArrayList(ff.p.a0(list, i5));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(h((QProductOfferDetails) it.next()));
                }
            } else {
                c2527k = c2527k9;
                c2527k2 = c2527k13;
                arrayList = null;
            }
            C2527k c2527k15 = new C2527k("subscriptionOfferDetails", arrayList);
            QProductOfferDetails defaultSubscriptionOfferDetails = storeDetails.getDefaultSubscriptionOfferDetails();
            C2527k c2527k16 = new C2527k("defaultSubscriptionOfferDetails", defaultSubscriptionOfferDetails != null ? h(defaultSubscriptionOfferDetails) : null);
            QProductOfferDetails basePlanSubscriptionOfferDetails = storeDetails.getBasePlanSubscriptionOfferDetails();
            C2527k c2527k17 = new C2527k("basePlanSubscriptionOfferDetails", basePlanSubscriptionOfferDetails != null ? h(basePlanSubscriptionOfferDetails) : null);
            QProductInAppDetails inAppOfferDetails = storeDetails.getInAppOfferDetails();
            mapR = AbstractC2640A.R(c2527k10, c2527k11, c2527k12, c2527k2, c2527k14, c2527k15, c2527k16, c2527k17, new C2527k("inAppOfferDetails", inAppOfferDetails != null ? AbstractC2641B.E(new C2527k(InAppPurchaseMetaData.KEY_PRICE, i(inAppOfferDetails.getPrice()))) : null), new C2527k("hasTrialOffer", Boolean.valueOf(storeDetails.getHasTrialOffer())), new C2527k("hasIntroOffer", Boolean.valueOf(storeDetails.getHasIntroOffer())), new C2527k("hasTrialOrIntroOffer", Boolean.valueOf(storeDetails.getHasTrialOrIntroOffer())), new C2527k("productType", storeDetails.getProductType().name()), new C2527k("isInApp", Boolean.valueOf(storeDetails.getIsInApp())), new C2527k("isSubscription", Boolean.valueOf(storeDetails.getIsSubscription())), new C2527k("isPrepaid", Boolean.valueOf(storeDetails.getIsPrepaid())), new C2527k("isInstallment", Boolean.valueOf(storeDetails.getIsInstallment())));
        } else {
            c2527k = c2527k9;
        }
        return AbstractC2640A.R(c2527k3, c2527k4, c2527k5, c2527k6, c2527k7, c2527k8, c2527k, new C2527k("storeDetails", mapR), new C2527k("prettyPrice", qProduct.getPrettyPrice()), new C2527k("offeringId", qProduct.getOfferingID()));
    }

    public static final Map h(QProductOfferDetails qProductOfferDetails) {
        AbstractC3340k.e(qProductOfferDetails, "<this>");
        C2527k c2527k = new C2527k("basePlanId", qProductOfferDetails.getBasePlanId());
        C2527k c2527k2 = new C2527k("offerId", qProductOfferDetails.getOfferId());
        C2527k c2527k3 = new C2527k("offerToken", qProductOfferDetails.getOfferToken());
        C2527k c2527k4 = new C2527k("tags", qProductOfferDetails.getTags());
        List<QProductPricingPhase> pricingPhases = qProductOfferDetails.getPricingPhases();
        ArrayList arrayList = new ArrayList(ff.p.a0(pricingPhases, 10));
        Iterator<T> it = pricingPhases.iterator();
        while (it.hasNext()) {
            arrayList.add(j((QProductPricingPhase) it.next()));
        }
        C2527k c2527k5 = new C2527k("pricingPhases", arrayList);
        QProductPricingPhase basePlan = qProductOfferDetails.getBasePlan();
        C2527k c2527k6 = new C2527k("basePlan", basePlan != null ? j(basePlan) : null);
        QProductInstallmentPlanDetails installmentPlanDetails = qProductOfferDetails.getInstallmentPlanDetails();
        C2527k c2527k7 = new C2527k("installmentPlanDetails", installmentPlanDetails != null ? AbstractC2640A.R(new C2527k("commitmentPaymentsCount", Integer.valueOf(installmentPlanDetails.getCommitmentPaymentsCount())), new C2527k("subsequentCommitmentPaymentsCount", Integer.valueOf(installmentPlanDetails.getSubsequentCommitmentPaymentsCount()))) : null);
        QProductPricingPhase trialPhase = qProductOfferDetails.getTrialPhase();
        C2527k c2527k8 = new C2527k("trialPhase", trialPhase != null ? j(trialPhase) : null);
        QProductPricingPhase introPhase = qProductOfferDetails.getIntroPhase();
        return AbstractC2640A.R(c2527k, c2527k2, c2527k3, c2527k4, c2527k5, c2527k6, c2527k7, c2527k8, new C2527k("introPhase", introPhase != null ? j(introPhase) : null), new C2527k("hasTrial", Boolean.valueOf(qProductOfferDetails.getHasTrial())), new C2527k("hasIntro", Boolean.valueOf(qProductOfferDetails.getHasIntro())), new C2527k("hasTrialOrIntro", Boolean.valueOf(qProductOfferDetails.getHasTrialOrIntro())));
    }

    public static final Map i(QProductPrice qProductPrice) {
        AbstractC3340k.e(qProductPrice, "<this>");
        return AbstractC2640A.R(new C2527k("priceAmountMicros", Long.valueOf(qProductPrice.getPriceAmountMicros())), new C2527k("priceCurrencyCode", qProductPrice.getPriceCurrencyCode()), new C2527k("formattedPrice", qProductPrice.getFormattedPrice()), new C2527k("isFree", Boolean.valueOf(qProductPrice.getIsFree())), new C2527k("currencySymbol", qProductPrice.getCurrencySymbol()));
    }

    public static final Map j(QProductPricingPhase qProductPricingPhase) {
        AbstractC3340k.e(qProductPricingPhase, "<this>");
        return AbstractC2640A.R(new C2527k(InAppPurchaseMetaData.KEY_PRICE, i(qProductPricingPhase.getPrice())), new C2527k("billingPeriod", k(qProductPricingPhase.getBillingPeriod())), new C2527k("billingCycleCount", Integer.valueOf(qProductPricingPhase.getBillingCycleCount())), new C2527k("recurrenceMode", qProductPricingPhase.getRecurrenceMode().name()), new C2527k("type", qProductPricingPhase.getType().name()), new C2527k("isTrial", Boolean.valueOf(qProductPricingPhase.getIsTrial())), new C2527k("isIntro", Boolean.valueOf(qProductPricingPhase.getIsIntro())), new C2527k("isBasePlan", Boolean.valueOf(qProductPricingPhase.getIsBasePlan())));
    }

    public static final Map k(QSubscriptionPeriod qSubscriptionPeriod) {
        AbstractC3340k.e(qSubscriptionPeriod, "<this>");
        return AbstractC2640A.R(new C2527k("unitCount", Integer.valueOf(qSubscriptionPeriod.getUnitCount())), new C2527k("unit", qSubscriptionPeriod.getUnit().name()), new C2527k("iso", qSubscriptionPeriod.getIso()));
    }

    public static final v l(QonversionError qonversionError) {
        AbstractC3340k.e(qonversionError, "<this>");
        return new v(qonversionError);
    }
}
