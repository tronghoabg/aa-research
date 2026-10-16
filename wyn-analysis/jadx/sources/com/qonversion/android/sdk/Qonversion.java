package com.qonversion.android.sdk;

import android.app.Activity;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.qonversion.android.sdk.dto.QAttributionProvider;
import com.qonversion.android.sdk.dto.QPurchaseModel;
import com.qonversion.android.sdk.dto.QPurchaseOptions;
import com.qonversion.android.sdk.dto.QPurchaseUpdateModel;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.dto.properties.QUserPropertyKey;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.QonversionInternal;
import com.qonversion.android.sdk.listeners.QEntitlementsUpdateListener;
import com.qonversion.android.sdk.listeners.QonversionEligibilityCallback;
import com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback;
import com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback;
import com.qonversion.android.sdk.listeners.QonversionOfferingsCallback;
import com.qonversion.android.sdk.listeners.QonversionProductsCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback;
import com.qonversion.android.sdk.listeners.QonversionUserCallback;
import com.qonversion.android.sdk.listeners.QonversionUserPropertiesCallback;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import ef.C2514B;
import ef.InterfaceC2519c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 ]2\u00020\u0001:\u0001]J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000fJ/\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0010\u0010\u000eJ'\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u0010\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\"J-\u0010(\u001a\u00020\u00022\f\u0010$\u001a\b\u0012\u0004\u0012\u00020 0#2\u0006\u0010&\u001a\u00020%2\u0006\u0010\f\u001a\u00020'H&¢\u0006\u0004\b(\u0010)J\u0017\u0010(\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020'H&¢\u0006\u0004\b(\u0010*J'\u0010.\u001a\u00020\u00022\u0006\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020 2\u0006\u0010\f\u001a\u00020-H&¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u00022\u0006\u0010+\u001a\u00020 2\u0006\u0010\f\u001a\u00020-H&¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\u00022\u0006\u00102\u001a\u00020 2\u0006\u0010\f\u001a\u000203H&¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\u00022\u0006\u00102\u001a\u00020 2\u0006\u0010\f\u001a\u000203H&¢\u0006\u0004\b6\u00105J%\u00109\u001a\u00020\u00022\f\u00107\u001a\b\u0012\u0004\u0012\u00020 0#2\u0006\u0010\f\u001a\u000208H&¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b=\u0010<J\u000f\u0010>\u001a\u00020\u0002H&¢\u0006\u0004\b>\u0010\u0004J\u0017\u0010@\u001a\u00020\u00022\u0006\u0010?\u001a\u00020 H&¢\u0006\u0004\b@\u0010AJ\u001f\u0010@\u001a\u00020\u00022\u0006\u0010?\u001a\u00020 2\u0006\u0010\f\u001a\u00020BH&¢\u0006\u0004\b@\u0010CJ\u000f\u0010D\u001a\u00020\u0002H&¢\u0006\u0004\bD\u0010\u0004J\u0017\u0010E\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020BH&¢\u0006\u0004\bE\u0010FJ+\u0010K\u001a\u00020\u00022\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00010G2\u0006\u0010J\u001a\u00020IH&¢\u0006\u0004\bK\u0010LJ\u001f\u0010P\u001a\u00020\u00022\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020 H&¢\u0006\u0004\bP\u0010QJ\u001f\u0010R\u001a\u00020\u00022\u0006\u0010N\u001a\u00020 2\u0006\u0010O\u001a\u00020 H&¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020TH&¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020%H&¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020YH&¢\u0006\u0004\b[\u0010\\¨\u0006^"}, d2 = {"Lcom/qonversion/android/sdk/Qonversion;", "", "Lef/C;", "syncHistoricalData", "()V", "Landroid/app/Activity;", "context", "Lcom/qonversion/android/sdk/dto/products/QProduct;", AppLovinEventTypes.USER_VIEWED_PRODUCT, "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "options", "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;", "callback", "purchase", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V", "updatePurchase", "Lcom/qonversion/android/sdk/dto/QPurchaseModel;", "purchaseModel", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/QPurchaseModel;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;", "purchaseUpdateModel", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V", "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;", "products", "(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V", "Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;", "offerings", "(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;", "remoteConfig", "(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V", "", "contextKey", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V", "", "contextKeys", "", "includeEmptyContextKey", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "remoteConfigList", "(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V", "(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V", "experimentId", "groupId", "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;", "attachUserToExperiment", "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V", "detachUserFromExperiment", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V", "remoteConfigurationId", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;", "attachUserToRemoteConfiguration", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V", "detachUserFromRemoteConfiguration", "productIds", "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;", "checkTrialIntroEligibility", "(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V", "checkEntitlements", "(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V", "restore", "syncPurchases", "userID", "identify", "(Ljava/lang/String;)V", "Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V", "logout", "userInfo", "(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V", "", JsonStorageKeyNames.DATA_KEY, "Lcom/qonversion/android/sdk/dto/QAttributionProvider;", "provider", "attribution", "(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/QAttributionProvider;)V", "Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "setUserProperty", "(Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;Ljava/lang/String;)V", "setCustomUserProperty", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;", "userProperties", "(Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;)V", "isFallbackFileAccessible", "()Z", "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;", "entitlementsUpdateListener", "setEntitlementsUpdateListener", "(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Qonversion {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/qonversion/android/sdk/Qonversion$Companion;", "", "()V", "backingInstance", "Lcom/qonversion/android/sdk/Qonversion;", "shared", "getSharedInstance$annotations", "getSharedInstance", "()Lcom/qonversion/android/sdk/Qonversion;", MobileAdsBridgeBase.initializeMethodName, "config", "Lcom/qonversion/android/sdk/QonversionConfig;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Nullable
        private static Qonversion backingInstance;

        private Companion() {
        }

        public static /* synthetic */ void getSharedInstance$annotations() {
        }

        @NotNull
        public final Qonversion getSharedInstance() {
            Qonversion qonversion = backingInstance;
            if (qonversion != null) {
                return qonversion;
            }
            throw new C2514B("Qonversion has not been initialized. You should call the initialize method before accessing the shared instance of Qonversion.");
        }

        @NotNull
        public final Qonversion initialize(@NotNull QonversionConfig config) {
            AbstractC3340k.e(config, "config");
            Qonversion qonversion = backingInstance;
            if (qonversion != null) {
                Log.e("Qonversion", "Qonversion has been initialized already. Multiple instances of Qonversion are not supported now.");
                return qonversion;
            }
            QonversionInternal qonversionInternal = new QonversionInternal(new InternalConfig(config), config.getApplication());
            backingInstance = qonversionInternal;
            return qonversionInternal;
        }
    }

    void attachUserToExperiment(@NotNull String experimentId, @NotNull String groupId, @NotNull QonversionExperimentAttachCallback callback);

    void attachUserToRemoteConfiguration(@NotNull String remoteConfigurationId, @NotNull QonversionRemoteConfigurationAttachCallback callback);

    void attribution(@NotNull Map<String, ? extends Object> data, @NotNull QAttributionProvider provider);

    void checkEntitlements(@NotNull QonversionEntitlementsCallback callback);

    void checkTrialIntroEligibility(@NotNull List<String> productIds, @NotNull QonversionEligibilityCallback callback);

    void detachUserFromExperiment(@NotNull String experimentId, @NotNull QonversionExperimentAttachCallback callback);

    void detachUserFromRemoteConfiguration(@NotNull String remoteConfigurationId, @NotNull QonversionRemoteConfigurationAttachCallback callback);

    void identify(@NotNull String userID);

    void identify(@NotNull String userID, @NotNull QonversionUserCallback callback);

    boolean isFallbackFileAccessible();

    void logout();

    void offerings(@NotNull QonversionOfferingsCallback callback);

    void products(@NotNull QonversionProductsCallback callback);

    @InterfaceC2519c
    void purchase(@NotNull Activity context, @NotNull QPurchaseModel purchaseModel, @NotNull QonversionEntitlementsCallback callback);

    void purchase(@NotNull Activity context, @NotNull QProduct product, @NotNull QPurchaseOptions options, @NotNull QonversionEntitlementsCallback callback);

    void purchase(@NotNull Activity context, @NotNull QProduct product, @NotNull QonversionEntitlementsCallback callback);

    void remoteConfig(@NotNull QonversionRemoteConfigCallback callback);

    void remoteConfig(@NotNull String contextKey, @NotNull QonversionRemoteConfigCallback callback);

    void remoteConfigList(@NotNull QonversionRemoteConfigListCallback callback);

    void remoteConfigList(@NotNull List<String> contextKeys, boolean includeEmptyContextKey, @NotNull QonversionRemoteConfigListCallback callback);

    void restore(@NotNull QonversionEntitlementsCallback callback);

    void setCustomUserProperty(@NotNull String key, @NotNull String value);

    void setEntitlementsUpdateListener(@NotNull QEntitlementsUpdateListener entitlementsUpdateListener);

    void setUserProperty(@NotNull QUserPropertyKey key, @NotNull String value);

    void syncHistoricalData();

    void syncPurchases();

    @InterfaceC2519c
    void updatePurchase(@NotNull Activity context, @NotNull QPurchaseUpdateModel purchaseUpdateModel, @NotNull QonversionEntitlementsCallback callback);

    void updatePurchase(@NotNull Activity context, @NotNull QProduct product, @NotNull QPurchaseOptions options, @NotNull QonversionEntitlementsCallback callback);

    void userInfo(@NotNull QonversionUserCallback callback);

    void userProperties(@NotNull QonversionUserPropertiesCallback callback);
}
