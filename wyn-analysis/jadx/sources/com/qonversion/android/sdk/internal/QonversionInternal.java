package com.qonversion.android.sdk.internal;

import M0.g;
import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.J;
import com.android.billingclient.api.Purchase;
import com.applovin.sdk.AppLovinEventTypes;
import com.qonversion.android.sdk.Qonversion;
import com.qonversion.android.sdk.automations.internal.QAutomationsManager;
import com.qonversion.android.sdk.dto.QAttributionProvider;
import com.qonversion.android.sdk.dto.QPurchaseModel;
import com.qonversion.android.sdk.dto.QPurchaseOptions;
import com.qonversion.android.sdk.dto.QPurchaseUpdateModel;
import com.qonversion.android.sdk.dto.QRemoteConfig;
import com.qonversion.android.sdk.dto.QRemoteConfigList;
import com.qonversion.android.sdk.dto.QUser;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.eligibility.QEligibility;
import com.qonversion.android.sdk.dto.entitlements.QEntitlement;
import com.qonversion.android.sdk.dto.offerings.QOfferings;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.dto.properties.QUserPropertyKey;
import com.qonversion.android.sdk.internal.api.RequestTrigger;
import com.qonversion.android.sdk.internal.di.QDependencyInjector;
import com.qonversion.android.sdk.internal.dto.purchase.PurchaseModelInternal;
import com.qonversion.android.sdk.internal.logger.ConsoleLogger;
import com.qonversion.android.sdk.internal.logger.ExceptionManager;
import com.qonversion.android.sdk.internal.logger.QExceptionManager;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.services.QFallbacksService;
import com.qonversion.android.sdk.internal.services.QUserInfoService;
import com.qonversion.android.sdk.internal.storage.Cache;
import com.qonversion.android.sdk.internal.storage.LaunchResultCacheWrapper;
import com.qonversion.android.sdk.internal.storage.PurchasesCache;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import com.qonversion.android.sdk.listeners.QEntitlementsUpdateListener;
import com.qonversion.android.sdk.listeners.QonversionEligibilityCallback;
import com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback;
import com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback;
import com.qonversion.android.sdk.listeners.QonversionOfferingsCallback;
import com.qonversion.android.sdk.listeners.QonversionProductsCallback;
import com.qonversion.android.sdk.listeners.QonversionPurchaseCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback;
import com.qonversion.android.sdk.listeners.QonversionUserCallback;
import com.qonversion.android.sdk.listeners.QonversionUserPropertiesCallback;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import ef.C2515C;
import ef.InterfaceC2519c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import tf.a;

@Metadata(d1 = {"\u0000¶\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ'\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u001bJ'\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u001cJ/\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ'\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u001d\u0010 J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010(\u001a\u00020\n2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010,J-\u00102\u001a\u00020\n2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020*0-2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0014\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00102\u001a\u00020\n2\u0006\u0010\u0014\u001a\u000201H\u0016¢\u0006\u0004\b2\u00104J'\u00108\u001a\u00020\n2\u0006\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020*2\u0006\u0010\u0014\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\n2\u0006\u00105\u001a\u00020*2\u0006\u0010\u0014\u001a\u000207H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020\n2\u0006\u0010<\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\n2\u0006\u0010<\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020=H\u0016¢\u0006\u0004\b@\u0010?J%\u0010C\u001a\u00020\n2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020*0-2\u0006\u0010\u0014\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bG\u0010FJ\u000f\u0010H\u001a\u00020\nH\u0016¢\u0006\u0004\bH\u0010\fJ\u0017\u0010J\u001a\u00020\n2\u0006\u0010I\u001a\u00020*H\u0016¢\u0006\u0004\bJ\u0010KJ\u001f\u0010J\u001a\u00020\n2\u0006\u0010I\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020LH\u0016¢\u0006\u0004\bJ\u0010MJ\u000f\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bN\u0010\fJ\u0017\u0010O\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020LH\u0016¢\u0006\u0004\bO\u0010PJ+\u0010V\u001a\u00020\n2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020R0Q2\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ\u001f\u0010[\u001a\u00020\n2\u0006\u0010Y\u001a\u00020X2\u0006\u0010Z\u001a\u00020*H\u0016¢\u0006\u0004\b[\u0010\\J\u001f\u0010]\u001a\u00020\n2\u0006\u0010Y\u001a\u00020*2\u0006\u0010Z\u001a\u00020*H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020_H\u0016¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020/H\u0016¢\u0006\u0004\bb\u0010cJ\u0017\u0010f\u001a\u00020\n2\u0006\u0010e\u001a\u00020dH\u0016¢\u0006\u0004\bf\u0010gJ!\u0010h\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u0014\u001a\u00020'H\u0002¢\u0006\u0004\bh\u0010,J\u0017\u0010i\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bi\u0010jJ\u0017\u0010l\u001a\u00020k2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bl\u0010mJ\u0017\u0010n\u001a\u00020L2\u0006\u0010\u0014\u001a\u00020LH\u0002¢\u0006\u0004\bn\u0010oJ\u001d\u0010r\u001a\u00020\n2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\n0pH\u0002¢\u0006\u0004\br\u0010sR\u0016\u0010u\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010x\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010{\u001a\u00020z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010~\u001a\u00020}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001a\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001a\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R*\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001¨\u0006\u0099\u0001"}, d2 = {"Lcom/qonversion/android/sdk/internal/QonversionInternal;", "Lcom/qonversion/android/sdk/Qonversion;", "Lcom/qonversion/android/sdk/internal/LifecycleDelegate;", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "internalConfig", "Landroid/app/Application;", "application", "<init>", "(Lcom/qonversion/android/sdk/internal/InternalConfig;Landroid/app/Application;)V", "Lef/C;", "onAppBackground", "()V", "onAppForeground", "syncHistoricalData", "Landroid/app/Activity;", "context", "Lcom/qonversion/android/sdk/dto/QPurchaseModel;", "purchaseModel", "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;", "callback", "purchase", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/QPurchaseModel;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V", "Lcom/qonversion/android/sdk/dto/products/QProduct;", AppLovinEventTypes.USER_VIEWED_PRODUCT, "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;", "options", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V", "updatePurchase", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;", "purchaseUpdateModel", "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V", "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;", "products", "(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V", "Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;", "offerings", "(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;", "remoteConfig", "(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V", "", "contextKey", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V", "", "contextKeys", "", "includeEmptyContextKey", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "remoteConfigList", "(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V", "(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V", "experimentId", "groupId", "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;", "attachUserToExperiment", "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V", "detachUserFromExperiment", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V", "remoteConfigurationId", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;", "attachUserToRemoteConfiguration", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V", "detachUserFromRemoteConfiguration", "productIds", "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;", "checkTrialIntroEligibility", "(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V", "checkEntitlements", "(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V", "restore", "syncPurchases", "userID", "identify", "(Ljava/lang/String;)V", "Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;", "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V", "logout", "userInfo", "(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V", "", "", JsonStorageKeyNames.DATA_KEY, "Lcom/qonversion/android/sdk/dto/QAttributionProvider;", "provider", "attribution", "(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/QAttributionProvider;)V", "Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, "setUserProperty", "(Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;Ljava/lang/String;)V", "setCustomUserProperty", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;", "userProperties", "(Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;)V", "isFallbackFileAccessible", "()Z", "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;", "entitlementsUpdateListener", "setEntitlementsUpdateListener", "(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V", "loadRemoteConfig", "mainEntitlementsCallback", "(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;", "Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;", "mainPurchaseCallback", "(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;", "mainUserCallback", "(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;", "Lkotlin/Function0;", "runnable", "postToMainThread", "(Ltf/a;)V", "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;", "userPropertiesManager", "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;", "Lcom/qonversion/android/sdk/internal/QAttributionManager;", "attributionManager", "Lcom/qonversion/android/sdk/internal/QAttributionManager;", "Lcom/qonversion/android/sdk/internal/QProductCenterManager;", "productCenterManager", "Lcom/qonversion/android/sdk/internal/QProductCenterManager;", "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;", "automationsManager", "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;", "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;", "logger", "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "sharedPreferencesCache", "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "Lcom/qonversion/android/sdk/internal/logger/ExceptionManager;", "exceptionManager", "Lcom/qonversion/android/sdk/internal/logger/ExceptionManager;", "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;", "remoteConfigManager", "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;", "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;", "fallbackService", "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;", "Lcom/qonversion/android/sdk/internal/AppState;", "appState", "Lcom/qonversion/android/sdk/internal/AppState;", "getAppState", "()Lcom/qonversion/android/sdk/internal/AppState;", "setAppState", "(Lcom/qonversion/android/sdk/internal/AppState;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QonversionInternal implements Qonversion, LifecycleDelegate, AppStateProvider {

    @NotNull
    private AppState appState;

    @NotNull
    private QAttributionManager attributionManager;

    @NotNull
    private QAutomationsManager automationsManager;

    @NotNull
    private ExceptionManager exceptionManager;

    @NotNull
    private QFallbacksService fallbackService;

    @NotNull
    private final Handler handler;

    @NotNull
    private ConsoleLogger logger;

    @NotNull
    private QProductCenterManager productCenterManager;

    @NotNull
    private QRemoteConfigManager remoteConfigManager;

    @NotNull
    private SharedPreferencesCache sharedPreferencesCache;

    @NotNull
    private QUserPropertiesManager userPropertiesManager;

    public QonversionInternal(@NotNull InternalConfig internalConfig, @NotNull Application application) {
        AbstractC3340k.e(internalConfig, "internalConfig");
        AbstractC3340k.e(application, "application");
        this.logger = new ConsoleLogger();
        this.handler = new Handler(Looper.getMainLooper());
        this.appState = AppState.Background;
        QDependencyInjector qDependencyInjector = QDependencyInjector.INSTANCE;
        qDependencyInjector.buildAppComponent$sdk_release(application, internalConfig, this);
        QExceptionManager qExceptionManagerExceptionManager = qDependencyInjector.getAppComponent$sdk_release().exceptionManager();
        qExceptionManagerExceptionManager.initialize(application);
        this.exceptionManager = qExceptionManagerExceptionManager;
        QRepository qRepositoryRepository = qDependencyInjector.getAppComponent$sdk_release().repository();
        PurchasesCache purchasesCache = qDependencyInjector.getAppComponent$sdk_release().purchasesCache();
        QHandledPurchasesCache qHandledPurchasesCacheHandledPurchasesCache = qDependencyInjector.getAppComponent$sdk_release().handledPurchasesCache();
        LaunchResultCacheWrapper launchResultCacheWrapper = qDependencyInjector.getAppComponent$sdk_release().launchResultCacheWrapper();
        QUserInfoService qUserInfoServiceUserInfoService = qDependencyInjector.getAppComponent$sdk_release().userInfoService();
        QIdentityManager qIdentityManagerIdentityManager = qDependencyInjector.getAppComponent$sdk_release().identityManager();
        this.sharedPreferencesCache = qDependencyInjector.getAppComponent$sdk_release().sharedPreferencesCache();
        internalConfig.setUid(qUserInfoServiceUserInfoService.obtainUserID());
        this.fallbackService = qDependencyInjector.getAppComponent$sdk_release().fallbacksService();
        this.automationsManager = qDependencyInjector.getAppComponent$sdk_release().automationsManager();
        this.userPropertiesManager = qDependencyInjector.getAppComponent$sdk_release().userPropertiesManager();
        QRemoteConfigManager qRemoteConfigManagerRemoteConfigManager = qDependencyInjector.getAppComponent$sdk_release().remoteConfigManager();
        this.attributionManager = new QAttributionManager(qRepositoryRepository, this);
        QProductCenterManager qProductCenterManagerCreateProductCenterManager = new QonversionFactory(application, this.logger).createProductCenterManager(qRepositoryRepository, purchasesCache, qHandledPurchasesCacheHandledPurchasesCache, launchResultCacheWrapper, qUserInfoServiceUserInfoService, qIdentityManagerIdentityManager, internalConfig, this, qRemoteConfigManagerRemoteConfigManager);
        qRemoteConfigManagerRemoteConfigManager.setUserStateProvider(qProductCenterManagerCreateProductCenterManager);
        this.productCenterManager = qProductCenterManagerCreateProductCenterManager;
        this.remoteConfigManager = qRemoteConfigManagerRemoteConfigManager;
        this.userPropertiesManager.setProductCenterManager$sdk_release(qProductCenterManagerCreateProductCenterManager);
        if (internalConfig.getPrimaryConfig().getSendFbAttribution()) {
            this.userPropertiesManager.sendFacebookAttribution();
        }
        this.remoteConfigManager.setUserPropertiesManager(this.userPropertiesManager);
        postToMainThread(new AnonymousClass3(new AppLifecycleHandler(this)));
        QProductCenterManager.launch$default(this.productCenterManager, RequestTrigger.Init, null, 2, null);
    }

    private final void loadRemoteConfig(String contextKey, final QonversionRemoteConfigCallback callback) {
        this.remoteConfigManager.loadRemoteConfig(contextKey, new QonversionRemoteConfigCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.loadRemoteConfig.1
            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                QonversionInternal.this.postToMainThread(new QonversionInternal$loadRemoteConfig$1$onError$1(callback, error));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback
            public void onSuccess(@NotNull QRemoteConfig remoteConfig) {
                AbstractC3340k.e(remoteConfig, "remoteConfig");
                QonversionInternal.this.postToMainThread(new QonversionInternal$loadRemoteConfig$1$onSuccess$1(callback, remoteConfig));
            }
        });
    }

    private final QonversionEntitlementsCallback mainEntitlementsCallback(final QonversionEntitlementsCallback callback) {
        return new QonversionEntitlementsCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.mainEntitlementsCallback.1
            @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                QonversionInternal.this.postToMainThread(new QonversionInternal$mainEntitlementsCallback$1$onError$1(callback, error));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
            public void onSuccess(@NotNull Map<String, QEntitlement> entitlements) {
                AbstractC3340k.e(entitlements, "entitlements");
                QonversionInternal.this.postToMainThread(new QonversionInternal$mainEntitlementsCallback$1$onSuccess$1(callback, entitlements));
            }
        };
    }

    private final QonversionPurchaseCallback mainPurchaseCallback(final QonversionEntitlementsCallback callback) {
        final QonversionPurchaseCallback qonversionPurchaseCallback = callback instanceof QonversionPurchaseCallback ? (QonversionPurchaseCallback) callback : new QonversionPurchaseCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal$mainPurchaseCallback$purchaseCallback$1
            @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                callback.onError(error);
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionPurchaseCallback
            public void onSuccess(@NotNull Map<String, QEntitlement> map, @NotNull Purchase purchase) {
                QonversionPurchaseCallback.DefaultImpls.onSuccess(this, map, purchase);
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
            public void onSuccess(@NotNull Map<String, QEntitlement> entitlements) {
                AbstractC3340k.e(entitlements, "entitlements");
                callback.onSuccess(entitlements);
            }
        };
        return new QonversionPurchaseCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.mainPurchaseCallback.1
            @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                QonversionInternal.this.postToMainThread(new QonversionInternal$mainPurchaseCallback$1$onError$1(qonversionPurchaseCallback, error));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionPurchaseCallback
            public void onSuccess(@NotNull Map<String, QEntitlement> entitlements, @NotNull Purchase purchase) {
                AbstractC3340k.e(entitlements, "entitlements");
                AbstractC3340k.e(purchase, "purchase");
                QonversionInternal.this.postToMainThread(new QonversionInternal$mainPurchaseCallback$1$onSuccess$1(qonversionPurchaseCallback, entitlements, purchase));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
            public void onSuccess(@NotNull Map<String, QEntitlement> entitlements) {
                AbstractC3340k.e(entitlements, "entitlements");
                QonversionInternal.this.postToMainThread(new QonversionInternal$mainPurchaseCallback$1$onSuccess$2(qonversionPurchaseCallback, entitlements));
            }
        };
    }

    private final QonversionUserCallback mainUserCallback(final QonversionUserCallback callback) {
        return new QonversionUserCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.mainUserCallback.1
            @Override // com.qonversion.android.sdk.listeners.QonversionUserCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                QonversionInternal.this.postToMainThread(new QonversionInternal$mainUserCallback$1$onError$1(callback, error));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionUserCallback
            public void onSuccess(@NotNull QUser user) {
                AbstractC3340k.e(user, "user");
                QonversionInternal.this.postToMainThread(new QonversionInternal$mainUserCallback$1$onSuccess$1(callback, user));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postToMainThread(a runnable) {
        if (AbstractC3340k.a(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.invoke();
        } else {
            this.handler.post(new g(runnable, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postToMainThread$lambda$2(a tmp0) {
        AbstractC3340k.e(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void attachUserToExperiment(@NotNull String experimentId, @NotNull String groupId, @NotNull QonversionExperimentAttachCallback callback) {
        AbstractC3340k.e(experimentId, "experimentId");
        AbstractC3340k.e(groupId, "groupId");
        AbstractC3340k.e(callback, "callback");
        this.remoteConfigManager.attachUserToExperiment(experimentId, groupId, callback);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void attachUserToRemoteConfiguration(@NotNull String remoteConfigurationId, @NotNull QonversionRemoteConfigurationAttachCallback callback) {
        AbstractC3340k.e(remoteConfigurationId, "remoteConfigurationId");
        AbstractC3340k.e(callback, "callback");
        this.remoteConfigManager.attachUserToRemoteConfiguration(remoteConfigurationId, callback);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void attribution(@NotNull Map<String, ? extends Object> data, @NotNull QAttributionProvider provider) {
        AbstractC3340k.e(data, "data");
        AbstractC3340k.e(provider, "provider");
        this.attributionManager.attribution(data, provider);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void checkEntitlements(@NotNull QonversionEntitlementsCallback callback) {
        AbstractC3340k.e(callback, "callback");
        this.productCenterManager.checkEntitlements(mainEntitlementsCallback(callback));
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void checkTrialIntroEligibility(@NotNull List<String> productIds, @NotNull final QonversionEligibilityCallback callback) {
        AbstractC3340k.e(productIds, "productIds");
        AbstractC3340k.e(callback, "callback");
        this.productCenterManager.checkTrialIntroEligibilityForProductIds(productIds, new QonversionEligibilityCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.checkTrialIntroEligibility.1
            @Override // com.qonversion.android.sdk.listeners.QonversionEligibilityCallback, com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                callback.onError(error);
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionEligibilityCallback
            public void onSuccess(@NotNull Map<String, QEligibility> eligibilities) {
                AbstractC3340k.e(eligibilities, "eligibilities");
                callback.onSuccess(eligibilities);
            }
        });
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void detachUserFromExperiment(@NotNull String experimentId, @NotNull QonversionExperimentAttachCallback callback) {
        AbstractC3340k.e(experimentId, "experimentId");
        AbstractC3340k.e(callback, "callback");
        this.remoteConfigManager.detachUserFromExperiment(experimentId, callback);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void detachUserFromRemoteConfiguration(@NotNull String remoteConfigurationId, @NotNull QonversionRemoteConfigurationAttachCallback callback) {
        AbstractC3340k.e(remoteConfigurationId, "remoteConfigurationId");
        AbstractC3340k.e(callback, "callback");
        this.remoteConfigManager.detachUserFromRemoteConfiguration(remoteConfigurationId, callback);
    }

    @Override // com.qonversion.android.sdk.internal.provider.AppStateProvider
    @NotNull
    public AppState getAppState() {
        return this.appState;
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void identify(@NotNull String userID) {
        AbstractC3340k.e(userID, "userID");
        QProductCenterManager.identify$default(this.productCenterManager, userID, null, 2, null);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public boolean isFallbackFileAccessible() {
        return this.fallbackService.obtainFallbackData() != null;
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void logout() {
        this.productCenterManager.logout();
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void offerings(@NotNull final QonversionOfferingsCallback callback) {
        AbstractC3340k.e(callback, "callback");
        this.productCenterManager.offerings(new QonversionOfferingsCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.offerings.1
            @Override // com.qonversion.android.sdk.listeners.QonversionOfferingsCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                QonversionInternal.this.postToMainThread(new QonversionInternal$offerings$1$onError$1(callback, error));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionOfferingsCallback
            public void onSuccess(@NotNull QOfferings offerings) {
                AbstractC3340k.e(offerings, "offerings");
                QonversionInternal.this.postToMainThread(new QonversionInternal$offerings$1$onSuccess$1(callback, offerings));
            }
        });
    }

    @Override // com.qonversion.android.sdk.internal.LifecycleDelegate
    public void onAppBackground() {
        setAppState(AppState.Background);
        this.userPropertiesManager.onAppBackground();
    }

    @Override // com.qonversion.android.sdk.internal.LifecycleDelegate
    public void onAppForeground() {
        setAppState(AppState.Foreground);
        this.userPropertiesManager.onAppForeground();
        this.productCenterManager.onAppForeground();
        this.attributionManager.onAppForeground();
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void products(@NotNull final QonversionProductsCallback callback) {
        AbstractC3340k.e(callback, "callback");
        this.productCenterManager.loadProducts(new QonversionProductsCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.products.1
            @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                QonversionInternal.this.postToMainThread(new QonversionInternal$products$1$onError$1(callback, error));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
            public void onSuccess(@NotNull Map<String, QProduct> products) {
                AbstractC3340k.e(products, "products");
                QonversionInternal.this.postToMainThread(new QonversionInternal$products$1$onSuccess$1(callback, products));
            }
        });
    }

    @Override // com.qonversion.android.sdk.Qonversion
    @InterfaceC2519c
    public void purchase(@NotNull Activity context, @NotNull QPurchaseModel purchaseModel, @NotNull QonversionEntitlementsCallback callback) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(purchaseModel, "purchaseModel");
        AbstractC3340k.e(callback, "callback");
        this.productCenterManager.purchaseProduct(context, new PurchaseModelInternal(purchaseModel), mainPurchaseCallback(callback));
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void remoteConfig(@NotNull QonversionRemoteConfigCallback callback) {
        AbstractC3340k.e(callback, "callback");
        loadRemoteConfig(null, callback);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void remoteConfigList(@NotNull List<String> contextKeys, boolean includeEmptyContextKey, @NotNull final QonversionRemoteConfigListCallback callback) {
        AbstractC3340k.e(contextKeys, "contextKeys");
        AbstractC3340k.e(callback, "callback");
        this.remoteConfigManager.loadRemoteConfigList(contextKeys, includeEmptyContextKey, new QonversionRemoteConfigListCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.remoteConfigList.1
            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                QonversionInternal.this.postToMainThread(new QonversionInternal$remoteConfigList$1$onError$1(callback, error));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
            public void onSuccess(@NotNull QRemoteConfigList remoteConfigList) {
                AbstractC3340k.e(remoteConfigList, "remoteConfigList");
                QonversionInternal.this.postToMainThread(new QonversionInternal$remoteConfigList$1$onSuccess$1(callback, remoteConfigList));
            }
        });
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void restore(@NotNull QonversionEntitlementsCallback callback) {
        AbstractC3340k.e(callback, "callback");
        this.productCenterManager.restore(RequestTrigger.Restore, mainEntitlementsCallback(callback));
    }

    public void setAppState(@NotNull AppState appState) {
        AbstractC3340k.e(appState, "<set-?>");
        this.appState = appState;
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void setCustomUserProperty(@NotNull String key, @NotNull String value) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(value, "value");
        this.userPropertiesManager.setCustomUserProperty(key, value);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void setEntitlementsUpdateListener(@NotNull QEntitlementsUpdateListener entitlementsUpdateListener) {
        AbstractC3340k.e(entitlementsUpdateListener, "entitlementsUpdateListener");
        this.productCenterManager.setEntitlementsUpdateListener(entitlementsUpdateListener);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void setUserProperty(@NotNull QUserPropertyKey key, @NotNull String value) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(value, "value");
        this.userPropertiesManager.setUserProperty(key, value);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void syncHistoricalData() {
        if (Cache.DefaultImpls.getBool$default(this.sharedPreferencesCache, Constants.IS_HISTORICAL_DATA_SYNCED, false, 2, null)) {
            return;
        }
        this.productCenterManager.restore(RequestTrigger.SyncHistoricalData, new QonversionEntitlementsCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.syncHistoricalData.1
            @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                QonversionInternal.this.logger.error("Historical data sync failed.");
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
            public void onSuccess(@NotNull Map<String, QEntitlement> entitlements) {
                AbstractC3340k.e(entitlements, "entitlements");
                QonversionInternal.this.sharedPreferencesCache.putBool(Constants.IS_HISTORICAL_DATA_SYNCED, true);
            }
        });
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void syncPurchases() {
        this.productCenterManager.syncPurchases();
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void updatePurchase(@NotNull Activity context, @NotNull QProduct product, @NotNull QPurchaseOptions options, @NotNull QonversionEntitlementsCallback callback) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(product, "product");
        AbstractC3340k.e(options, "options");
        AbstractC3340k.e(callback, "callback");
        this.productCenterManager.purchaseProduct(context, new PurchaseModelInternal(product, options), mainPurchaseCallback(callback));
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void userInfo(@NotNull QonversionUserCallback callback) {
        AbstractC3340k.e(callback, "callback");
        this.productCenterManager.getUserInfo(mainUserCallback(callback));
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void userProperties(@NotNull QonversionUserPropertiesCallback callback) {
        AbstractC3340k.e(callback, "callback");
        this.userPropertiesManager.userProperties(callback);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void identify(@NotNull String userID, @NotNull QonversionUserCallback callback) {
        AbstractC3340k.e(userID, "userID");
        AbstractC3340k.e(callback, "callback");
        this.productCenterManager.identify(userID, callback);
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void remoteConfig(@NotNull String contextKey, @NotNull QonversionRemoteConfigCallback callback) {
        AbstractC3340k.e(contextKey, "contextKey");
        AbstractC3340k.e(callback, "callback");
        loadRemoteConfig(contextKey, callback);
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lef/C;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.internal.QonversionInternal$3, reason: invalid class name */
    public static final class AnonymousClass3 extends AbstractC3343n implements a {
        final /* synthetic */ AppLifecycleHandler $lifecycleHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AppLifecycleHandler appLifecycleHandler) {
            super(0);
            this.$lifecycleHandler = appLifecycleHandler;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m204invoke() {
            J.f18589i.f18595f.a(this.$lifecycleHandler);
        }

        @Override // tf.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m204invoke();
            return C2515C.f34653a;
        }
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void remoteConfigList(@NotNull final QonversionRemoteConfigListCallback callback) {
        AbstractC3340k.e(callback, "callback");
        this.remoteConfigManager.loadRemoteConfigList(new QonversionRemoteConfigListCallback() { // from class: com.qonversion.android.sdk.internal.QonversionInternal.remoteConfigList.2
            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                QonversionInternal.this.postToMainThread(new QonversionInternal$remoteConfigList$2$onError$1(callback, error));
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback
            public void onSuccess(@NotNull QRemoteConfigList remoteConfigList) {
                AbstractC3340k.e(remoteConfigList, "remoteConfigList");
                QonversionInternal.this.postToMainThread(new QonversionInternal$remoteConfigList$2$onSuccess$1(callback, remoteConfigList));
            }
        });
    }

    @Override // com.qonversion.android.sdk.Qonversion
    public void purchase(@NotNull Activity context, @NotNull QProduct product, @NotNull QPurchaseOptions options, @NotNull QonversionEntitlementsCallback callback) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(product, "product");
        AbstractC3340k.e(options, "options");
        AbstractC3340k.e(callback, "callback");
        this.productCenterManager.purchaseProduct(context, new PurchaseModelInternal(product, options), mainPurchaseCallback(callback));
    }

    @Override // com.qonversion.android.sdk.Qonversion
    @InterfaceC2519c
    public void updatePurchase(@NotNull Activity context, @NotNull QPurchaseUpdateModel purchaseUpdateModel, @NotNull QonversionEntitlementsCallback callback) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(purchaseUpdateModel, "purchaseUpdateModel");
        AbstractC3340k.e(callback, "callback");
        this.productCenterManager.purchaseProduct(context, new PurchaseModelInternal(purchaseUpdateModel), mainPurchaseCallback(callback));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qonversion.android.sdk.Qonversion
    public void purchase(@NotNull Activity context, @NotNull QProduct product, @NotNull QonversionEntitlementsCallback callback) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(product, "product");
        AbstractC3340k.e(callback, "callback");
        this.productCenterManager.purchaseProduct(context, new PurchaseModelInternal(product, (QPurchaseOptions) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)), mainPurchaseCallback(callback));
    }
}
