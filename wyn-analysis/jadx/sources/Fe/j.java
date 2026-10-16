package Fe;

import ac.C1346a;
import android.webkit.WebView;
import be.EnumC1525a;
import com.applovin.sdk.AppLovinEventParameters;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.dto.products.QProductInAppDetails;
import com.qonversion.android.sdk.dto.products.QProductOfferDetails;
import com.qonversion.android.sdk.dto.products.QProductPrice;
import com.qonversion.android.sdk.dto.products.QProductPricingPhase;
import com.qonversion.android.sdk.dto.products.QProductStoreDetails;
import com.qonversion.android.sdk.listeners.QonversionProductsCallback;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import ef.C2527k;
import ff.AbstractC2640A;
import ff.AbstractC2641B;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class j implements QonversionProductsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f4093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f4094b;

    public j(m mVar, List list) {
        this.f4093a = mVar;
        this.f4094b = list;
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
    public final void onError(QonversionError error) {
        AbstractC3340k.e(error, "error");
        Ba.c.q((C1346a) this.f4093a.f421a, "Failed to load products for the screen:\n" + error);
    }

    @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
    public final void onSuccess(Map products) throws be.b {
        m mVar;
        QProductPrice price;
        AbstractC3340k.e(products, "products");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : products.entrySet()) {
            if (this.f4094b.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC2641B.D(linkedHashMap.size()));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            mVar = this.f4093a;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key = entry2.getKey();
            QProduct qProduct = (QProduct) entry2.getValue();
            mVar.getClass();
            LinkedHashMap linkedHashMapS = AbstractC2640A.S(new C2527k("id", qProduct.getQonversionID()), new C2527k(AppLovinEventParameters.IN_APP_PURCHASE_TRANSACTION_IDENTIFIER, qProduct.getStoreID()));
            QProductStoreDetails storeDetails = qProduct.getStoreDetails();
            if (storeDetails != null) {
                linkedHashMapS.put("title", storeDetails.getTitle());
                if (storeDetails.getIsInApp()) {
                    QProductInAppDetails inAppOfferDetails = storeDetails.getInAppOfferDetails();
                    if (inAppOfferDetails != null && (price = inAppOfferDetails.getPrice()) != null) {
                        linkedHashMapS.put(InAppPurchaseMetaData.KEY_PRICE, Double.valueOf(price.getPriceAmount()));
                        linkedHashMapS.put("currency_symbol", price.getCurrencySymbol());
                        linkedHashMapS.put("currency_code", price.getPriceCurrencyCode());
                    }
                } else {
                    QProductOfferDetails defaultSubscriptionOfferDetails = storeDetails.getDefaultSubscriptionOfferDetails();
                    if (defaultSubscriptionOfferDetails != null) {
                        QProductPricingPhase basePlan = defaultSubscriptionOfferDetails.getBasePlan();
                        if (basePlan != null) {
                            QProductPrice price2 = basePlan.getPrice();
                            linkedHashMapS.put(InAppPurchaseMetaData.KEY_PRICE, Double.valueOf(price2.getPriceAmount()));
                            linkedHashMapS.put("currency_symbol", price2.getCurrencySymbol());
                            linkedHashMapS.put("currency_code", price2.getPriceCurrencyCode());
                            linkedHashMapS.put("period_unit", m.e0(basePlan.getBillingPeriod().getUnit()));
                            linkedHashMapS.put("period_unit_count", Integer.valueOf(basePlan.getBillingPeriod().getUnitCount()));
                        }
                        QProductPricingPhase trialPhase = defaultSubscriptionOfferDetails.getTrialPhase();
                        if (trialPhase == null) {
                            trialPhase = defaultSubscriptionOfferDetails.getIntroPhase();
                        }
                        if (trialPhase != null) {
                            linkedHashMapS.put("payment_mode", trialPhase.getIsTrial() ? "trial" : "intro");
                            linkedHashMapS.put("intro_price", Double.valueOf(trialPhase.getPrice().getPriceAmount()));
                            int i5 = i.f4092b[trialPhase.getType().ordinal()];
                            linkedHashMapS.put("intro_price_type", i5 != 1 ? i5 != 2 ? i5 != 3 ? null : "pay_as_you_go" : "pay_up_front" : "trial");
                            linkedHashMapS.put("intro_period_unit", m.e0(trialPhase.getBillingPeriod().getUnit()));
                            linkedHashMapS.put("intro_period_unit_count", Integer.valueOf(trialPhase.getBillingPeriod().getUnitCount()));
                            linkedHashMapS.put("intro_number_of_periods", Integer.valueOf(trialPhase.getBillingCycleCount()));
                        }
                    }
                }
            }
            linkedHashMap2.put(key, linkedHashMapS);
        }
        Map data = AbstractC2641B.E(new C2527k(JsonStorageKeyNames.DATA_KEY, linkedHashMap2));
        mVar.f4105e.getClass();
        AbstractC3340k.e(data, "data");
        try {
            String string = new JSONObject(data).toString();
            if (string == null) {
                throw new be.b(EnumC1525a.f19462e, "Json might contain unsupported elements (f.e. null keys)", null, 4);
            }
            h hVar = mVar.f4103c;
            hVar.getClass();
            X2.j jVar = hVar.f4090d;
            if (jVar != null) {
                ((WebView) jVar.f16076c).evaluateJavascript("window.dispatchEvent(new CustomEvent(\"setProducts\",  {detail: " + string + "} ))", null);
            }
        } catch (NullPointerException e7) {
            throw new be.b(EnumC1525a.f19462e, null, e7, 2);
        }
    }
}
