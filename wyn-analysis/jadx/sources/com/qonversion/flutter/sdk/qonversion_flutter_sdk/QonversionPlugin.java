package com.qonversion.flutter.sdk.qonversion_flutter_sdk;

import Af.q;
import Fe.c;
import Ge.a;
import Ge.i;
import Ge.j;
import Ge.k;
import Ge.m;
import Ge.n;
import Ge.o;
import Ge.p;
import Ge.r;
import Ge.s;
import Ge.t;
import Ge.u;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.qonversion.android.sdk.Qonversion;
import com.qonversion.android.sdk.QonversionConfig;
import com.qonversion.android.sdk.dto.QAttributionProvider;
import com.qonversion.android.sdk.dto.QEnvironment;
import com.qonversion.android.sdk.dto.QLaunchMode;
import com.qonversion.android.sdk.dto.entitlements.QEntitlementsCacheLifetime;
import com.qonversion.android.sdk.dto.properties.QUserPropertyKey;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import ef.C2515C;
import ef.InterfaceC2525i;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import la.l;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4269f;
import uc.InterfaceC4270g;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 H2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001HB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u0019H\u0016J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J$\u0010'\u001a\u00020\u00192\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0006\u0010%\u001a\u00020&H\u0002J\u001a\u0010,\u001a\u00020\u00192\b\u0010-\u001a\u0004\u0018\u00010*2\u0006\u0010%\u001a\u00020&H\u0002J$\u0010.\u001a\u00020\u00192\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0006\u0010%\u001a\u00020&H\u0002J$\u0010/\u001a\u00020\u00192\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u00100\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u00101\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u00102\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u00103\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u00104\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0002J\u001a\u00105\u001a\u00020\u00192\b\u00106\u001a\u0004\u0018\u00010*2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u00107\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0002J$\u00107\u001a\u00020\u00192\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u00108\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0002J$\u00109\u001a\u00020\u00192\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0006\u0010%\u001a\u00020&H\u0002J$\u0010:\u001a\u00020\u00192\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010;\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0002J$\u0010<\u001a\u00020\u00192\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0006\u0010%\u001a\u00020&H\u0002J$\u0010=\u001a\u00020\u00192\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0006\u0010%\u001a\u00020&H\u0002J$\u0010>\u001a\u00020\u00192\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0006\u0010%\u001a\u00020&H\u0002J$\u0010?\u001a\u00020\u00192\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0006\u0010%\u001a\u00020&H\u0002J$\u0010@\u001a\u00020\u00192\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0006\u0010%\u001a\u00020&H\u0002J$\u0010A\u001a\u00020\u00192\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010B\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0002J$\u0010C\u001a\u00020\u00192\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010D\u001a\u00020\u00192\u0006\u0010E\u001a\u00020F2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010G\u001a\u00020\u0019H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/QonversionPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "application", "Landroid/app/Application;", "activity", "Landroid/app/Activity;", "channel", "Lio/flutter/plugin/common/MethodChannel;", "updatedEntitlementsStreamHandler", "Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/BaseEventStreamHandler;", "noCodesPlugin", "Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/NoCodesPlugin;", "qonversionSandwich", "Lio/qonversion/sandwich/QonversionSandwich;", "getQonversionSandwich", "()Lio/qonversion/sandwich/QonversionSandwich;", "qonversionSandwich$delegate", "Lkotlin/Lazy;", "qonversionEventsListener", "Lio/qonversion/sandwich/QonversionEventsListener;", "onAttachedToEngine", "", "binding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onAttachedToActivity", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "onDetachedFromEngine", "onMethodCall", "call", "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", MobileAdsBridgeBase.initializeMethodName, "args", "", "", "", "identify", "userId", "purchase", "updatePurchase", "checkEntitlements", "restore", "offerings", "userProperties", "isFallbackFileAccessible", "remoteConfig", "contextKey", "remoteConfigList", "products", "setDefinedUserProperty", "setCustomUserProperty", "syncPurchases", "addAttributionData", "checkTrialIntroEligibility", "attachUserToExperiment", "detachUserFromExperiment", "attachUserToRemoteConfiguration", "detachUserFromRemoteConfiguration", "userInfo", "storeSdkInfo", "setup", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "tearDown", "Companion", "qonversion_flutter_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QonversionPlugin implements InterfaceC4279p, InterfaceC3885b, InterfaceC3964a {

    @NotNull
    private static final String EVENT_CHANNEL_PROMO_PURCHASES = "promo_purchases";

    @NotNull
    private static final String EVENT_CHANNEL_UPDATED_ENTITLEMENTS = "updated_entitlements";

    @NotNull
    private static final String METHOD_CHANNEL = "qonversion_plugin";

    @Nullable
    private Activity activity;

    @Nullable
    private Application application;

    @Nullable
    private C4281r channel;

    @Nullable
    private NoCodesPlugin noCodesPlugin;

    @Nullable
    private BaseEventStreamHandler updatedEntitlementsStreamHandler;

    @NotNull
    private final InterfaceC2525i qonversionSandwich$delegate = c.z(new q(this, 26));

    @NotNull
    private final i qonversionEventsListener = new i() { // from class: com.qonversion.flutter.sdk.qonversion_flutter_sdk.QonversionPlugin$qonversionEventsListener$1
        @Override // Ge.i
        public void onEntitlementsUpdated(Map<String, ? extends Object> entitlements) {
            InterfaceC4270g eventSink;
            AbstractC3340k.e(entitlements, "entitlements");
            String strF = new l().f(entitlements);
            BaseEventStreamHandler baseEventStreamHandler = this.this$0.updatedEntitlementsStreamHandler;
            if (baseEventStreamHandler == null || (eventSink = baseEventStreamHandler.getEventSink()) == null) {
                return;
            }
            eventSink.a(strF);
        }
    };

    private final void addAttributionData(Map<String, ? extends Object> map, InterfaceC4280q interfaceC4280q) {
        Object obj = map.get(JsonStorageKeyNames.DATA_KEY);
        Map<String, ? extends Object> map2 = obj instanceof Map ? (Map) obj : null;
        if (map2 == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        if (map2.isEmpty()) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        Object obj2 = map.get("provider");
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        getQonversionSandwich().getClass();
        try {
            Qonversion.INSTANCE.getSharedInstance().attribution(map2, QAttributionProvider.valueOf(str));
        } catch (IllegalArgumentException unused) {
        }
        interfaceC4280q.a(null);
    }

    private final void attachUserToExperiment(Map<String, ? extends Object> map, InterfaceC4280q interfaceC4280q) {
        Object obj = map.get("experimentId");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        Object obj2 = map.get("groupId");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        t qonversionSandwich = getQonversionSandwich();
        u resultListener = ExtenstionsKt.toJsonResultListener(interfaceC4280q);
        qonversionSandwich.getClass();
        AbstractC3340k.e(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().attachUserToExperiment(str, str2, new j(resultListener, qonversionSandwich));
    }

    private final void attachUserToRemoteConfiguration(Map<String, ? extends Object> map, InterfaceC4280q interfaceC4280q) {
        Object obj = map.get("remoteConfigurationId");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        t qonversionSandwich = getQonversionSandwich();
        u resultListener = ExtenstionsKt.toJsonResultListener(interfaceC4280q);
        qonversionSandwich.getClass();
        AbstractC3340k.e(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().attachUserToRemoteConfiguration(str, new k(resultListener, qonversionSandwich));
    }

    private final void checkEntitlements(InterfaceC4280q interfaceC4280q) {
        t qonversionSandwich = getQonversionSandwich();
        u resultListener = ExtenstionsKt.toJsonResultListener(interfaceC4280q);
        qonversionSandwich.getClass();
        AbstractC3340k.e(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().checkEntitlements(new n(resultListener));
    }

    private final void checkTrialIntroEligibility(Map<String, ? extends Object> map, InterfaceC4280q interfaceC4280q) {
        Object obj = map.get("ids");
        List<String> list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        t qonversionSandwich = getQonversionSandwich();
        u resultListener = ExtenstionsKt.toJsonResultListener(interfaceC4280q);
        qonversionSandwich.getClass();
        AbstractC3340k.e(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().checkTrialIntroEligibility(list, new Ge.l(resultListener, 0));
    }

    private final void detachUserFromExperiment(Map<String, ? extends Object> map, InterfaceC4280q interfaceC4280q) {
        Object obj = map.get("experimentId");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        t qonversionSandwich = getQonversionSandwich();
        u resultListener = ExtenstionsKt.toJsonResultListener(interfaceC4280q);
        qonversionSandwich.getClass();
        AbstractC3340k.e(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().detachUserFromExperiment(str, new m(resultListener, qonversionSandwich));
    }

    private final void detachUserFromRemoteConfiguration(Map<String, ? extends Object> map, InterfaceC4280q interfaceC4280q) {
        Object obj = map.get("remoteConfigurationId");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        t qonversionSandwich = getQonversionSandwich();
        u resultListener = ExtenstionsKt.toJsonResultListener(interfaceC4280q);
        qonversionSandwich.getClass();
        AbstractC3340k.e(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().detachUserFromRemoteConfiguration(str, new S3.l(resultListener, qonversionSandwich));
    }

    private final t getQonversionSandwich() {
        return (t) this.qonversionSandwich$delegate.getValue();
    }

    private final void identify(String str, InterfaceC4280q interfaceC4280q) {
        if (str == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        t qonversionSandwich = getQonversionSandwich();
        u resultListener = ExtenstionsKt.toResultListener(interfaceC4280q);
        qonversionSandwich.getClass();
        AbstractC3340k.e(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().identify(str, new o(resultListener));
    }

    private final void initialize(Map<String, ? extends Object> map, InterfaceC4280q interfaceC4280q) {
        Application application = this.application;
        if (application == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        Object obj = map.get("projectKey");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        Object obj2 = map.get("launchMode");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        Object obj3 = map.get("environment");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        if (str3 == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        Object obj4 = map.get("entitlementsCacheLifetime");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        if (str4 == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        Object obj5 = map.get("proxyUrl");
        String str5 = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = map.get("kidsMode");
        Boolean bool = obj6 instanceof Boolean ? (Boolean) obj6 : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        t qonversionSandwich = getQonversionSandwich();
        qonversionSandwich.getClass();
        QonversionConfig.Builder builder = new QonversionConfig.Builder(application, str, QLaunchMode.valueOf(str2));
        try {
            builder.setEnvironment(QEnvironment.valueOf(str3));
        } catch (IllegalArgumentException unused) {
            Log.w("Qonversion", "No environment found for key ".concat(str3));
        }
        try {
            builder.setEntitlementsCacheLifetime(QEntitlementsCacheLifetime.valueOf(str4));
        } catch (IllegalArgumentException unused2) {
            Log.w("Qonversion", "No entitlements cache lifetime found for key ".concat(str4));
        }
        builder.setEntitlementsUpdateListener(new s(qonversionSandwich));
        if (str5 != null) {
            builder.setProxyURL(str5);
        }
        if (zBooleanValue) {
            builder.enableKidsMode();
        }
        Qonversion.INSTANCE.initialize(builder.build());
        interfaceC4280q.a(null);
    }

    private final void isFallbackFileAccessible(InterfaceC4280q interfaceC4280q) {
        t qonversionSandwich = getQonversionSandwich();
        u resultListener = ExtenstionsKt.toJsonResultListener(interfaceC4280q);
        qonversionSandwich.getClass();
        AbstractC3340k.e(resultListener, "resultListener");
        resultListener.onSuccess(t.a(Qonversion.INSTANCE.getSharedInstance().isFallbackFileAccessible()));
    }

    private final void offerings(InterfaceC4280q interfaceC4280q) {
        t qonversionSandwich = getQonversionSandwich();
        u resultListener = ExtenstionsKt.toJsonResultListener(interfaceC4280q);
        qonversionSandwich.getClass();
        AbstractC3340k.e(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().offerings(new j(resultListener));
    }

    private final void products(InterfaceC4280q interfaceC4280q) {
        t qonversionSandwich = getQonversionSandwich();
        u resultListener = ExtenstionsKt.toResultListener(interfaceC4280q);
        qonversionSandwich.getClass();
        AbstractC3340k.e(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().products(new p(resultListener));
    }

    private final void purchase(Map<String, ? extends Object> map, InterfaceC4280q interfaceC4280q) {
        Object obj = map.get(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        Object obj2 = map.get("oldProductId");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("offerId");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = map.get("applyOffer");
        Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
        Object obj5 = map.get("updatePolicyKey");
        String str4 = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = map.get("contextKeys");
        List list = obj6 instanceof List ? (List) obj6 : null;
        t qonversionSandwich = getQonversionSandwich();
        u resultListener = ExtenstionsKt.toJsonResultListener(interfaceC4280q);
        qonversionSandwich.getClass();
        AbstractC3340k.e(resultListener, "resultListener");
        Activity currentActivity = qonversionSandwich.f4774b.getCurrentActivity();
        if (currentActivity == null) {
            resultListener.onError(Ge.c.l(qonversionSandwich.f4776d));
        } else {
            Qonversion.INSTANCE.getSharedInstance().products(new Ge.q(str, str2, qonversionSandwich, str3, bool, str4, list, currentActivity, new n(resultListener)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.qonversion.flutter.sdk.qonversion_flutter_sdk.QonversionPlugin$qonversionSandwich$2$1$1] */
    public static final t qonversionSandwich_delegate$lambda$0(final QonversionPlugin qonversionPlugin) {
        Application application = qonversionPlugin.application;
        if (application != null) {
            return new t(application, new a() { // from class: com.qonversion.flutter.sdk.qonversion_flutter_sdk.QonversionPlugin$qonversionSandwich$2$1$1
                @Override // Ge.a
                public Activity getCurrentActivity() {
                    return this.this$0.activity;
                }
            }, qonversionPlugin.qonversionEventsListener);
        }
        throw new IllegalStateException("Failed to initialize Qonversion Sandwich. Application is null.");
    }

    private final void remoteConfig(String str, InterfaceC4280q interfaceC4280q) {
        C2515C c2515c;
        t qonversionSandwich = getQonversionSandwich();
        u resultListener = ExtenstionsKt.toJsonResultListener(interfaceC4280q);
        qonversionSandwich.getClass();
        AbstractC3340k.e(resultListener, "resultListener");
        r rVar = new r(resultListener);
        if (str != null) {
            Qonversion.INSTANCE.getSharedInstance().remoteConfig(str, rVar);
            c2515c = C2515C.f34653a;
        } else {
            c2515c = null;
        }
        if (c2515c == null) {
            Qonversion.INSTANCE.getSharedInstance().remoteConfig(rVar);
        }
    }

    private final void remoteConfigList(InterfaceC4280q interfaceC4280q) {
        t qonversionSandwich = getQonversionSandwich();
        u resultListener = ExtenstionsKt.toJsonResultListener(interfaceC4280q);
        qonversionSandwich.getClass();
        AbstractC3340k.e(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().remoteConfigList(new Ge.l(resultListener, 1));
    }

    private final void restore(InterfaceC4280q interfaceC4280q) {
        t qonversionSandwich = getQonversionSandwich();
        u resultListener = ExtenstionsKt.toJsonResultListener(interfaceC4280q);
        qonversionSandwich.getClass();
        AbstractC3340k.e(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().restore(new n(resultListener));
    }

    private final void setCustomUserProperty(Map<String, ? extends Object> map, InterfaceC4280q interfaceC4280q) {
        Object obj = map.get("property");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        Object obj2 = map.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        getQonversionSandwich().getClass();
        Qonversion.INSTANCE.getSharedInstance().setCustomUserProperty(str, str2);
        interfaceC4280q.a(null);
    }

    private final void setDefinedUserProperty(Map<String, ? extends Object> map, InterfaceC4280q interfaceC4280q) {
        Object obj = map.get("property");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        Object obj2 = map.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        getQonversionSandwich().getClass();
        try {
            Qonversion.INSTANCE.getSharedInstance().setUserProperty(QUserPropertyKey.valueOf(str), str2);
        } catch (IllegalArgumentException unused) {
        }
        interfaceC4280q.a(null);
    }

    private final void setup(InterfaceC4269f interfaceC4269f, Application application) {
        this.application = application;
        C4281r c4281r = new C4281r(interfaceC4269f, METHOD_CHANNEL);
        this.channel = c4281r;
        c4281r.b(this);
        try {
            this.noCodesPlugin = new NoCodesPlugin(interfaceC4269f, application);
        } catch (Exception e7) {
            System.out.println((Object) ("Failed to initialize NoCodesPlugin: " + e7.getMessage()));
        }
        BaseListenerWrapper baseListenerWrapper = new BaseListenerWrapper(interfaceC4269f, EVENT_CHANNEL_UPDATED_ENTITLEMENTS);
        baseListenerWrapper.register();
        this.updatedEntitlementsStreamHandler = baseListenerWrapper.getEventStreamHandler();
        new BaseListenerWrapper(interfaceC4269f, EVENT_CHANNEL_PROMO_PURCHASES).register();
    }

    private final void storeSdkInfo(Map<String, ? extends Object> map, InterfaceC4280q interfaceC4280q) {
        Object obj = map.get("version");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        Object obj2 = map.get("source");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        t qonversionSandwich = getQonversionSandwich();
        qonversionSandwich.getClass();
        StringBuilder sb2 = new StringBuilder();
        Application application = qonversionSandwich.f4773a;
        sb2.append(application.getPackageName());
        sb2.append("_preferences");
        SharedPreferences.Editor editorEdit = application.getSharedPreferences(sb2.toString(), 0).edit();
        editorEdit.putString(ApiHeadersProvider.PREFS_SOURCE_VERSION_KEY, str);
        editorEdit.putString(ApiHeadersProvider.PREFS_SOURCE_KEY, str2);
        editorEdit.apply();
        interfaceC4280q.a(null);
    }

    private final void syncPurchases(InterfaceC4280q interfaceC4280q) {
        getQonversionSandwich().getClass();
        Qonversion.INSTANCE.getSharedInstance().syncPurchases();
        interfaceC4280q.a(null);
    }

    private final void tearDown() {
        C4281r c4281r = this.channel;
        if (c4281r != null) {
            c4281r.b(null);
        }
        this.channel = null;
        this.updatedEntitlementsStreamHandler = null;
        this.noCodesPlugin = null;
        this.application = null;
    }

    private final void updatePurchase(Map<String, ? extends Object> map, InterfaceC4280q interfaceC4280q) {
        purchase(map, interfaceC4280q);
    }

    private final void userInfo(InterfaceC4280q interfaceC4280q) {
        t qonversionSandwich = getQonversionSandwich();
        u resultListener = ExtenstionsKt.toResultListener(interfaceC4280q);
        qonversionSandwich.getClass();
        AbstractC3340k.e(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().userInfo(new o(resultListener));
    }

    private final void userProperties(InterfaceC4280q interfaceC4280q) {
        t qonversionSandwich = getQonversionSandwich();
        u resultListener = ExtenstionsKt.toJsonResultListener(interfaceC4280q);
        qonversionSandwich.getClass();
        AbstractC3340k.e(resultListener, "resultListener");
        Qonversion.INSTANCE.getSharedInstance().userProperties(new m(resultListener));
    }

    @Override // rc.InterfaceC3964a
    public void onAttachedToActivity(@NotNull InterfaceC3965b binding) {
        AbstractC3340k.e(binding, "binding");
        this.activity = (Activity) ((s1) binding).f43896a;
    }

    @Override // qc.InterfaceC3885b
    public void onAttachedToEngine(@NotNull C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        InterfaceC4269f interfaceC4269f = binding.f44188c;
        AbstractC3340k.d(interfaceC4269f, "getBinaryMessenger(...)");
        Context context = binding.f44186a;
        AbstractC3340k.c(context, "null cannot be cast to non-null type android.app.Application");
        setup(interfaceC4269f, (Application) context);
    }

    @Override // rc.InterfaceC3964a
    public void onDetachedFromActivity() {
        this.activity = null;
    }

    @Override // rc.InterfaceC3964a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // qc.InterfaceC3885b
    public void onDetachedFromEngine(@NotNull C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        tearDown();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // uc.InterfaceC4279p
    public void onMethodCall(@NotNull C4278o call, @NotNull InterfaceC4280q result) {
        NoCodesPlugin noCodesPlugin;
        AbstractC3340k.e(call, "call");
        AbstractC3340k.e(result, "result");
        String str = call.f46759a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1097329270:
                    if (str.equals("logout")) {
                        getQonversionSandwich().getClass();
                        Qonversion.INSTANCE.getSharedInstance().logout();
                        result.a(null);
                        return;
                    }
                    break;
                case -1003761308:
                    if (str.equals("products")) {
                        products(result);
                        return;
                    }
                    break;
                case -266803431:
                    if (str.equals("userInfo")) {
                        userInfo(result);
                        return;
                    }
                    break;
                case -171551906:
                    if (str.equals("userProperties")) {
                        userProperties(result);
                        return;
                    }
                    break;
                case -163699186:
                    if (str.equals("checkEntitlements")) {
                        checkEntitlements(result);
                        return;
                    }
                    break;
                case 255117071:
                    if (str.equals("syncHistoricalData")) {
                        getQonversionSandwich().getClass();
                        Qonversion.INSTANCE.getSharedInstance().syncHistoricalData();
                        result.a(null);
                        return;
                    }
                    break;
                case 474324894:
                    if (str.equals("isFallbackFileAccessible")) {
                        isFallbackFileAccessible(result);
                        return;
                    }
                    break;
                case 739186125:
                    if (str.equals("closeNoCodes") && (noCodesPlugin = this.noCodesPlugin) != null) {
                        noCodesPlugin.closeNoCodes(result);
                        break;
                    }
                    break;
                case 1097519758:
                    if (str.equals("restore")) {
                        restore(result);
                        return;
                    }
                    break;
                case 1193828151:
                    if (str.equals("syncPurchases")) {
                        syncPurchases(result);
                        return;
                    }
                    break;
                case 1608248294:
                    if (str.equals("remoteConfigList")) {
                        remoteConfigList(result);
                        return;
                    }
                    break;
                case 1945170221:
                    if (str.equals("offerings")) {
                        offerings(result);
                        return;
                    }
                    break;
            }
        }
        Object obj = call.f46760b;
        Map<String, ? extends Object> map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(result);
            return;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1681471254:
                    if (str.equals("updatePurchase")) {
                        updatePurchase(map, result);
                        return;
                    }
                    break;
                case -1517525528:
                    if (str.equals("addAttributionData")) {
                        addAttributionData(map, result);
                        return;
                    }
                    break;
                case -1310263321:
                    if (str.equals("storeSdkInfo")) {
                        storeSdkInfo(map, result);
                        return;
                    }
                    break;
                case -1236314925:
                    if (str.equals("setCustomUserProperty")) {
                        setCustomUserProperty(map, result);
                        return;
                    }
                    break;
                case -1210205273:
                    if (str.equals("setDefinedUserProperty")) {
                        setDefinedUserProperty(map, result);
                        return;
                    }
                    break;
                case -506881240:
                    if (str.equals("remoteConfig")) {
                        Object obj2 = map.get("contextKey");
                        remoteConfig(obj2 instanceof String ? (String) obj2 : null, result);
                        return;
                    }
                    break;
                case -400789361:
                    if (str.equals("checkTrialIntroEligibility")) {
                        checkTrialIntroEligibility(map, result);
                        return;
                    }
                    break;
                case -155482188:
                    if (str.equals("showNoCodesScreen")) {
                        NoCodesPlugin noCodesPlugin2 = this.noCodesPlugin;
                        if (noCodesPlugin2 != null) {
                            Object obj3 = map.get("contextKey");
                            noCodesPlugin2.showNoCodesScreen(obj3 instanceof String ? (String) obj3 : null, result);
                            return;
                        }
                        return;
                    }
                    break;
                case -135762164:
                    if (str.equals("identify")) {
                        Object obj4 = map.get("userId");
                        identify(obj4 instanceof String ? (String) obj4 : null, result);
                        return;
                    }
                    break;
                case -65208728:
                    if (str.equals("detachUserFromRemoteConfiguration")) {
                        detachUserFromRemoteConfiguration(map, result);
                        return;
                    }
                    break;
                case -14179835:
                    if (str.equals("attachUserToRemoteConfiguration")) {
                        attachUserToRemoteConfiguration(map, result);
                        return;
                    }
                    break;
                case 572180800:
                    if (str.equals("remoteConfigListForContextKeys")) {
                        remoteConfigList(map, result);
                        return;
                    }
                    break;
                case 871091088:
                    if (str.equals(MobileAdsBridgeBase.initializeMethodName)) {
                        initialize(map, result);
                        return;
                    }
                    break;
                case 984199397:
                    if (str.equals("detachUserFromExperiment")) {
                        detachUserFromExperiment(map, result);
                        return;
                    }
                    break;
                case 1552566026:
                    if (str.equals("setScreenPresentationConfig")) {
                        NoCodesPlugin noCodesPlugin3 = this.noCodesPlugin;
                        if (noCodesPlugin3 != null) {
                            Object obj5 = map.get("config");
                            Map<String, ? extends Object> map2 = obj5 instanceof Map ? (Map) obj5 : null;
                            Object obj6 = map.get("contextKey");
                            noCodesPlugin3.setScreenPresentationConfig(map2, obj6 instanceof String ? (String) obj6 : null, result);
                            return;
                        }
                        return;
                    }
                    break;
                case 1743324417:
                    if (str.equals("purchase")) {
                        purchase(map, result);
                        return;
                    }
                    break;
                case 2002000040:
                    if (str.equals("attachUserToExperiment")) {
                        attachUserToExperiment(map, result);
                        return;
                    }
                    break;
                case 2053582133:
                    if (str.equals("initializeNoCodes")) {
                        NoCodesPlugin noCodesPlugin4 = this.noCodesPlugin;
                        if (noCodesPlugin4 != null) {
                            noCodesPlugin4.initializeNoCodes(map, result);
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        result.c();
    }

    @Override // rc.InterfaceC3964a
    public void onReattachedToActivityForConfigChanges(@NotNull InterfaceC3965b binding) {
        AbstractC3340k.e(binding, "binding");
        onAttachedToActivity(binding);
    }

    private final void remoteConfigList(Map<String, ? extends Object> map, InterfaceC4280q interfaceC4280q) {
        Object obj = map.get("contextKeys");
        List<String> list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
            return;
        }
        Object obj2 = map.get("includeEmptyContextKey");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            t qonversionSandwich = getQonversionSandwich();
            u resultListener = ExtenstionsKt.toJsonResultListener(interfaceC4280q);
            qonversionSandwich.getClass();
            AbstractC3340k.e(resultListener, "resultListener");
            Qonversion.INSTANCE.getSharedInstance().remoteConfigList(list, zBooleanValue, new k(resultListener));
            return;
        }
        FlutterResult_CustomErrorsKt.noNecessaryDataError(interfaceC4280q);
    }
}
