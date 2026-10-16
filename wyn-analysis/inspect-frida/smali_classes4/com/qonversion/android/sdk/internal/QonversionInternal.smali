.class public final Lcom/qonversion/android/sdk/internal/QonversionInternal;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/Qonversion;
.implements Lcom/qonversion/android/sdk/internal/LifecycleDelegate;
.implements Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b6\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000cJ\'\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0017\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J/\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u001bJ\'\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u001cJ/\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\'\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0017\u00a2\u0006\u0004\u0008\u001d\u0010 J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020$H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010(\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\'H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u001f\u0010(\u001a\u00020\n2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\'H\u0016\u00a2\u0006\u0004\u0008(\u0010,J-\u00102\u001a\u00020\n2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020*0-2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0014\u001a\u000201H\u0016\u00a2\u0006\u0004\u00082\u00103J\u0017\u00102\u001a\u00020\n2\u0006\u0010\u0014\u001a\u000201H\u0016\u00a2\u0006\u0004\u00082\u00104J\'\u00108\u001a\u00020\n2\u0006\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020*2\u0006\u0010\u0014\u001a\u000207H\u0016\u00a2\u0006\u0004\u00088\u00109J\u001f\u0010:\u001a\u00020\n2\u0006\u00105\u001a\u00020*2\u0006\u0010\u0014\u001a\u000207H\u0016\u00a2\u0006\u0004\u0008:\u0010;J\u001f\u0010>\u001a\u00020\n2\u0006\u0010<\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020=H\u0016\u00a2\u0006\u0004\u0008>\u0010?J\u001f\u0010@\u001a\u00020\n2\u0006\u0010<\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020=H\u0016\u00a2\u0006\u0004\u0008@\u0010?J%\u0010C\u001a\u00020\n2\u000c\u0010A\u001a\u0008\u0012\u0004\u0012\u00020*0-2\u0006\u0010\u0014\u001a\u00020BH\u0016\u00a2\u0006\u0004\u0008C\u0010DJ\u0017\u0010E\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008E\u0010FJ\u0017\u0010G\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008G\u0010FJ\u000f\u0010H\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008H\u0010\u000cJ\u0017\u0010J\u001a\u00020\n2\u0006\u0010I\u001a\u00020*H\u0016\u00a2\u0006\u0004\u0008J\u0010KJ\u001f\u0010J\u001a\u00020\n2\u0006\u0010I\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020LH\u0016\u00a2\u0006\u0004\u0008J\u0010MJ\u000f\u0010N\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008N\u0010\u000cJ\u0017\u0010O\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020LH\u0016\u00a2\u0006\u0004\u0008O\u0010PJ+\u0010V\u001a\u00020\n2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020R0Q2\u0006\u0010U\u001a\u00020TH\u0016\u00a2\u0006\u0004\u0008V\u0010WJ\u001f\u0010[\u001a\u00020\n2\u0006\u0010Y\u001a\u00020X2\u0006\u0010Z\u001a\u00020*H\u0016\u00a2\u0006\u0004\u0008[\u0010\\J\u001f\u0010]\u001a\u00020\n2\u0006\u0010Y\u001a\u00020*2\u0006\u0010Z\u001a\u00020*H\u0016\u00a2\u0006\u0004\u0008]\u0010^J\u0017\u0010`\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020_H\u0016\u00a2\u0006\u0004\u0008`\u0010aJ\u000f\u0010b\u001a\u00020/H\u0016\u00a2\u0006\u0004\u0008b\u0010cJ\u0017\u0010f\u001a\u00020\n2\u0006\u0010e\u001a\u00020dH\u0016\u00a2\u0006\u0004\u0008f\u0010gJ!\u0010h\u001a\u00020\n2\u0008\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u0014\u001a\u00020\'H\u0002\u00a2\u0006\u0004\u0008h\u0010,J\u0017\u0010i\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008i\u0010jJ\u0017\u0010l\u001a\u00020k2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008l\u0010mJ\u0017\u0010n\u001a\u00020L2\u0006\u0010\u0014\u001a\u00020LH\u0002\u00a2\u0006\u0004\u0008n\u0010oJ\u001d\u0010r\u001a\u00020\n2\u000c\u0010q\u001a\u0008\u0012\u0004\u0012\u00020\n0pH\u0002\u00a2\u0006\u0004\u0008r\u0010sR\u0016\u0010u\u001a\u00020t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008u\u0010vR\u0016\u0010x\u001a\u00020w8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008x\u0010yR\u0016\u0010{\u001a\u00020z8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008{\u0010|R\u0016\u0010~\u001a\u00020}8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008~\u0010\u007fR\u001a\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0087\u0001\u0010\u0088\u0001R\u001a\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008a\u0001\u0010\u008b\u0001R\u001a\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008d\u0001\u0010\u008e\u0001R\u001a\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0090\u0001\u0010\u0091\u0001R*\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0093\u0001\u0010\u0094\u0001\u001a\u0006\u0008\u0095\u0001\u0010\u0096\u0001\"\u0006\u0008\u0097\u0001\u0010\u0098\u0001\u00a8\u0006\u0099\u0001"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/QonversionInternal;",
        "Lcom/qonversion/android/sdk/Qonversion;",
        "Lcom/qonversion/android/sdk/internal/LifecycleDelegate;",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "internalConfig",
        "Landroid/app/Application;",
        "application",
        "<init>",
        "(Lcom/qonversion/android/sdk/internal/InternalConfig;Landroid/app/Application;)V",
        "Lef/C;",
        "onAppBackground",
        "()V",
        "onAppForeground",
        "syncHistoricalData",
        "Landroid/app/Activity;",
        "context",
        "Lcom/qonversion/android/sdk/dto/QPurchaseModel;",
        "purchaseModel",
        "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;",
        "callback",
        "purchase",
        "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/QPurchaseModel;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "product",
        "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
        "options",
        "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V",
        "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V",
        "updatePurchase",
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;",
        "purchaseUpdateModel",
        "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V",
        "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;",
        "products",
        "(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V",
        "Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;",
        "offerings",
        "(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
        "remoteConfig",
        "(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V",
        "",
        "contextKey",
        "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V",
        "",
        "contextKeys",
        "",
        "includeEmptyContextKey",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
        "remoteConfigList",
        "(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V",
        "(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V",
        "experimentId",
        "groupId",
        "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;",
        "attachUserToExperiment",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V",
        "detachUserFromExperiment",
        "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V",
        "remoteConfigurationId",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;",
        "attachUserToRemoteConfiguration",
        "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V",
        "detachUserFromRemoteConfiguration",
        "productIds",
        "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
        "checkTrialIntroEligibility",
        "(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V",
        "checkEntitlements",
        "(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V",
        "restore",
        "syncPurchases",
        "userID",
        "identify",
        "(Ljava/lang/String;)V",
        "Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;",
        "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V",
        "logout",
        "userInfo",
        "(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V",
        "",
        "",
        "data",
        "Lcom/qonversion/android/sdk/dto/QAttributionProvider;",
        "provider",
        "attribution",
        "(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/QAttributionProvider;)V",
        "Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;",
        "key",
        "value",
        "setUserProperty",
        "(Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;Ljava/lang/String;)V",
        "setCustomUserProperty",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;",
        "userProperties",
        "(Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;)V",
        "isFallbackFileAccessible",
        "()Z",
        "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;",
        "entitlementsUpdateListener",
        "setEntitlementsUpdateListener",
        "(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V",
        "loadRemoteConfig",
        "mainEntitlementsCallback",
        "(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;",
        "Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;",
        "mainPurchaseCallback",
        "(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;",
        "mainUserCallback",
        "(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;",
        "Lkotlin/Function0;",
        "runnable",
        "postToMainThread",
        "(Ltf/a;)V",
        "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;",
        "userPropertiesManager",
        "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;",
        "Lcom/qonversion/android/sdk/internal/QAttributionManager;",
        "attributionManager",
        "Lcom/qonversion/android/sdk/internal/QAttributionManager;",
        "Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
        "productCenterManager",
        "Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
        "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;",
        "automationsManager",
        "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;",
        "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;",
        "Landroid/os/Handler;",
        "handler",
        "Landroid/os/Handler;",
        "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
        "sharedPreferencesCache",
        "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
        "Lcom/qonversion/android/sdk/internal/logger/ExceptionManager;",
        "exceptionManager",
        "Lcom/qonversion/android/sdk/internal/logger/ExceptionManager;",
        "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;",
        "remoteConfigManager",
        "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;",
        "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;",
        "fallbackService",
        "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;",
        "Lcom/qonversion/android/sdk/internal/AppState;",
        "appState",
        "Lcom/qonversion/android/sdk/internal/AppState;",
        "getAppState",
        "()Lcom/qonversion/android/sdk/internal/AppState;",
        "setAppState",
        "(Lcom/qonversion/android/sdk/internal/AppState;)V",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private appState:Lcom/qonversion/android/sdk/internal/AppState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private attributionManager:Lcom/qonversion/android/sdk/internal/QAttributionManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private exceptionManager:Lcom/qonversion/android/sdk/internal/logger/ExceptionManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private fallbackService:Lcom/qonversion/android/sdk/internal/services/QFallbacksService;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final handler:Landroid/os/Handler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private sharedPreferencesCache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/InternalConfig;Landroid/app/Application;)V
    .locals 12
    .param p1    # Lcom/qonversion/android/sdk/internal/InternalConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "internalConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "application"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v0, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 15
    .line 16
    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 20
    .line 21
    new-instance v0, Landroid/os/Handler;

    .line 22
    .line 23
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->handler:Landroid/os/Handler;

    .line 31
    .line 32
    sget-object v0, Lcom/qonversion/android/sdk/internal/AppState;->Background:Lcom/qonversion/android/sdk/internal/AppState;

    .line 33
    .line 34
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->appState:Lcom/qonversion/android/sdk/internal/AppState;

    .line 35
    .line 36
    sget-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    .line 37
    .line 38
    invoke-virtual {v0, p2, p1, p0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->buildAppComponent$sdk_release(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface {v1}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->exceptionManager()Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1, p2}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->initialize(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    iput-object v1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->exceptionManager:Lcom/qonversion/android/sdk/internal/logger/ExceptionManager;

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v1}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->repository()Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-interface {v1}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->purchasesCache()Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v1}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->handledPurchasesCache()Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-interface {v1}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->launchResultCacheWrapper()Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-interface {v1}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->userInfoService()Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-interface {v1}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->identityManager()Lcom/qonversion/android/sdk/internal/QIdentityManager;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-interface {v1}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->sharedPreferencesCache()Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    iput-object v1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->sharedPreferencesCache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 111
    .line 112
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->obtainUserID()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {p1, v1}, Lcom/qonversion/android/sdk/internal/InternalConfig;->setUid(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-interface {v1}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->fallbacksService()Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    iput-object v1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->fallbackService:Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    .line 128
    .line 129
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-interface {v1}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->automationsManager()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iput-object v1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 138
    .line 139
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-interface {v1}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->userPropertiesManager()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    iput-object v1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 148
    .line 149
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->remoteConfigManager()Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 154
    .line 155
    .line 156
    move-result-object v11

    .line 157
    new-instance v0, Lcom/qonversion/android/sdk/internal/QAttributionManager;

    .line 158
    .line 159
    invoke-direct {v0, v3, p0}, Lcom/qonversion/android/sdk/internal/QAttributionManager;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)V

    .line 160
    .line 161
    .line 162
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->attributionManager:Lcom/qonversion/android/sdk/internal/QAttributionManager;

    .line 163
    .line 164
    new-instance v2, Lcom/qonversion/android/sdk/internal/QonversionFactory;

    .line 165
    .line 166
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 167
    .line 168
    invoke-direct {v2, p2, v0}, Lcom/qonversion/android/sdk/internal/QonversionFactory;-><init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    .line 169
    .line 170
    .line 171
    move-object v10, p0

    .line 172
    move-object v9, p1

    .line 173
    invoke-virtual/range {v2 .. v11}, Lcom/qonversion/android/sdk/internal/QonversionFactory;->createProductCenterManager(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;Lcom/qonversion/android/sdk/internal/QIdentityManager;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-virtual {v11, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->setUserStateProvider(Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;)V

    .line 178
    .line 179
    .line 180
    iput-object p1, v10, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 181
    .line 182
    iput-object v11, v10, Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 183
    .line 184
    iget-object p2, v10, Lcom/qonversion/android/sdk/internal/QonversionInternal;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 185
    .line 186
    invoke-virtual {p2, p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->setProductCenterManager$sdk_release(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v9}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;->getSendFbAttribution()Z

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    if-eqz p1, :cond_0

    .line 198
    .line 199
    iget-object p1, v10, Lcom/qonversion/android/sdk/internal/QonversionInternal;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 200
    .line 201
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->sendFacebookAttribution()V

    .line 202
    .line 203
    .line 204
    :cond_0
    iget-object p1, v10, Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 205
    .line 206
    iget-object p2, v10, Lcom/qonversion/android/sdk/internal/QonversionInternal;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 207
    .line 208
    invoke-virtual {p1, p2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->setUserPropertiesManager(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V

    .line 209
    .line 210
    .line 211
    new-instance p1, Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;

    .line 212
    .line 213
    invoke-direct {p1, p0}, Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;-><init>(Lcom/qonversion/android/sdk/internal/LifecycleDelegate;)V

    .line 214
    .line 215
    .line 216
    new-instance p2, Lcom/qonversion/android/sdk/internal/QonversionInternal$3;

    .line 217
    .line 218
    invoke-direct {p2, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$3;-><init>(Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;)V

    .line 219
    .line 220
    .line 221
    invoke-direct {p0, p2}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->postToMainThread(Ltf/a;)V

    .line 222
    .line 223
    .line 224
    iget-object p1, v10, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 225
    .line 226
    sget-object p2, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Init:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 227
    .line 228
    const/4 v0, 0x2

    .line 229
    const/4 v1, 0x0

    .line 230
    invoke-static {p1, p2, v1, v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launch$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;ILjava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    return-void
.end method

.method public static synthetic a(Ltf/a;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->postToMainThread$lambda$2(Ltf/a;)V

    return-void
.end method

.method public static final synthetic access$getLogger$p(Lcom/qonversion/android/sdk/internal/QonversionInternal;)Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getSharedPreferencesCache$p(Lcom/qonversion/android/sdk/internal/QonversionInternal;)Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->sharedPreferencesCache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$postToMainThread(Lcom/qonversion/android/sdk/internal/QonversionInternal;Ltf/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->postToMainThread(Ltf/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final loadRemoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 2
    .line 3
    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$loadRemoteConfig$1;

    .line 4
    .line 5
    invoke-direct {v1, p0, p2}, Lcom/qonversion/android/sdk/internal/QonversionInternal$loadRemoteConfig$1;-><init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadRemoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final mainEntitlementsCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;
    .locals 1

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainEntitlementsCallback$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainEntitlementsCallback$1;-><init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final mainPurchaseCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$purchaseCallback$1;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$purchaseCallback$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    .line 11
    .line 12
    .line 13
    move-object p1, v0

    .line 14
    :goto_0
    new-instance v0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;

    .line 15
    .line 16
    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;-><init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method private final mainUserCallback(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;
    .locals 1

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainUserCallback$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainUserCallback$1;-><init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final postToMainThread(Ltf/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->handler:Landroid/os/Handler;

    .line 20
    .line 21
    new-instance v1, LM0/g;

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    invoke-direct {v1, p1, v2}, LM0/g;-><init>(Ltf/a;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private static final postToMainThread$lambda$2(Ltf/a;)V
    .locals 1

    .line 1
    const-string v0, "$tmp0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "experimentId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "groupId"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "callback"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public attachUserToRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "remoteConfigurationId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->attachUserToRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public attribution(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/QAttributionProvider;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/QAttributionProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/qonversion/android/sdk/dto/QAttributionProvider;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "provider"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->attributionManager:Lcom/qonversion/android/sdk/internal/QAttributionManager;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/QAttributionManager;->attribution(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/QAttributionProvider;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public checkEntitlements(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainEntitlementsCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->checkEntitlements(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public checkTrialIntroEligibility(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "productIds"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 12
    .line 13
    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$checkTrialIntroEligibility$1;

    .line 14
    .line 15
    invoke-direct {v1, p2}, Lcom/qonversion/android/sdk/internal/QonversionInternal$checkTrialIntroEligibility$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->checkTrialIntroEligibilityForProductIds(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public detachUserFromExperiment(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "experimentId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->detachUserFromExperiment(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public detachUserFromRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "remoteConfigurationId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->detachUserFromRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public getAppState()Lcom/qonversion/android/sdk/internal/AppState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->appState:Lcom/qonversion/android/sdk/internal/AppState;

    .line 2
    .line 3
    return-object v0
.end method

.method public identify(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "userID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identify$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public identify(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "userID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identify(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V

    return-void
.end method

.method public isFallbackFileAccessible()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->fallbackService:Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;->obtainFallbackData()Lcom/qonversion/android/sdk/dto/QFallbackObject;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public logout()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->logout()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public offerings(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 7
    .line 8
    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$offerings$1;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$offerings$1;-><init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->offerings(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onAppBackground()V
    .locals 1

    .line 1
    sget-object v0, Lcom/qonversion/android/sdk/internal/AppState;->Background:Lcom/qonversion/android/sdk/internal/AppState;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->setAppState(Lcom/qonversion/android/sdk/internal/AppState;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->onAppBackground()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onAppForeground()V
    .locals 1

    .line 1
    sget-object v0, Lcom/qonversion/android/sdk/internal/AppState;->Foreground:Lcom/qonversion/android/sdk/internal/AppState;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->setAppState(Lcom/qonversion/android/sdk/internal/AppState;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->onAppForeground()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->onAppForeground()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->attributionManager:Lcom/qonversion/android/sdk/internal/QAttributionManager;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QAttributionManager;->onAppForeground()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public products(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 7
    .line 8
    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$products$1;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$products$1;-><init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->loadProducts(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/QPurchaseModel;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/QPurchaseModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lef/c;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchaseModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 2
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;

    invoke-direct {v1, p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;-><init>(Lcom/qonversion/android/sdk/dto/QPurchaseModel;)V

    .line 3
    invoke-direct {p0, p3}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainPurchaseCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    move-result-object p2

    .line 4
    invoke-virtual {v0, p1, v1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchaseProduct(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    return-void
.end method

.method public purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/products/QProduct;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/dto/QPurchaseOptions;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "product"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 6
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;

    invoke-direct {v1, p2, p3}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;-><init>(Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V

    .line 7
    invoke-direct {p0, p4}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainPurchaseCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    move-result-object p2

    .line 8
    invoke-virtual {v0, p1, v1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchaseProduct(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    return-void
.end method

.method public purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 4
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/products/QProduct;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "product"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 10
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v1, p2, v2, v3, v2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;-><init>(Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    invoke-direct {p0, p3}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainPurchaseCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    move-result-object p2

    .line 12
    invoke-virtual {v0, p1, v1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchaseProduct(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    return-void
.end method

.method public remoteConfig(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->loadRemoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    return-void
.end method

.method public remoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "contextKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->loadRemoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    return-void
.end method

.method public remoteConfigList(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$2;

    invoke-direct {v1, p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$2;-><init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadRemoteConfigList(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    return-void
.end method

.method public remoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
            ")V"
        }
    .end annotation

    const-string v0, "contextKeys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigManager:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 2
    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$1;

    invoke-direct {v1, p0, p3}, Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$1;-><init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    .line 3
    invoke-virtual {v0, p1, p2, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadRemoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    return-void
.end method

.method public restore(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 7
    .line 8
    sget-object v1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Restore:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainEntitlementsCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restore(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setAppState(Lcom/qonversion/android/sdk/internal/AppState;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/AppState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->appState:Lcom/qonversion/android/sdk/internal/AppState;

    .line 7
    .line 8
    return-void
.end method

.method public setCustomUserProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->setCustomUserProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setEntitlementsUpdateListener(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "entitlementsUpdateListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->setEntitlementsUpdateListener(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setUserProperty(Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->setUserProperty(Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public syncHistoricalData()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->sharedPreferencesCache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "com.qonversion.keys.is_historical_data_synced"

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    invoke-static {v0, v3, v4, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/Cache$DefaultImpls;->getBool$default(Lcom/qonversion/android/sdk/internal/storage/Cache;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 16
    .line 17
    sget-object v1, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->SyncHistoricalData:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 18
    .line 19
    new-instance v2, Lcom/qonversion/android/sdk/internal/QonversionInternal$syncHistoricalData$1;

    .line 20
    .line 21
    invoke-direct {v2, p0}, Lcom/qonversion/android/sdk/internal/QonversionInternal$syncHistoricalData$1;-><init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restore(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public syncPurchases()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->syncPurchases()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public updatePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lef/c;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchaseUpdateModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 6
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;

    invoke-direct {v1, p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;-><init>(Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;)V

    .line 7
    invoke-direct {p0, p3}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainPurchaseCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    move-result-object p2

    .line 8
    invoke-virtual {v0, p1, v1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchaseProduct(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    return-void
.end method

.method public updatePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/products/QProduct;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/dto/QPurchaseOptions;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "product"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 2
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;

    invoke-direct {v1, p2, p3}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;-><init>(Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V

    .line 3
    invoke-direct {p0, p4}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainPurchaseCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    move-result-object p2

    .line 4
    invoke-virtual {v0, p1, v1, p2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->purchaseProduct(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V

    return-void
.end method

.method public userInfo(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainUserCallback(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getUserInfo(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public userProperties(Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->userProperties(Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
