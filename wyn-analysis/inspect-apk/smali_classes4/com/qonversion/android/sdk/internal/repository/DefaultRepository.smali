.class public final Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/repository/QRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0000\u0018\u0000 \u0095\u00012\u00020\u0001:\u0002\u0095\u0001B9\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00122\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ-\u0010 \u001a\u00020\u00122\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008 \u0010\"J\'\u0010&\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u001f\u0010(\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u001f\u0010,\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020+H\u0016\u00a2\u0006\u0004\u0008,\u0010-J\u001f\u0010.\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020+H\u0016\u00a2\u0006\u0004\u0008.\u0010-J1\u00102\u001a\u00020\u00122\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0008\u00103\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u000204H\u0016\u00a2\u0006\u0004\u00082\u00105J5\u0010:\u001a\u00020\u00122\u0006\u00100\u001a\u00020/2\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u0002060\u001b2\u0006\u0010\u0018\u001a\u0002042\u0006\u00109\u001a\u000208H\u0016\u00a2\u0006\u0004\u0008:\u0010;JQ\u0010E\u001a\u00020\u00122\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020=0<2\u0006\u0010?\u001a\u00020\u00152\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010@2\u0014\u0010D\u001a\u0010\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u0012\u0018\u00010BH\u0016\u00a2\u0006\u0004\u0008E\u0010FJK\u0010I\u001a\u00020\u00122\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150<2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u00120B2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00120BH\u0016\u00a2\u0006\u0004\u0008I\u0010JJ=\u0010L\u001a\u00020\u00122\u0018\u0010A\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020K0\u001b\u0012\u0004\u0012\u00020\u00120B2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00120BH\u0016\u00a2\u0006\u0004\u0008L\u0010MJ-\u0010P\u001a\u00020\u00122\u000c\u0010N\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u001b2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0018\u001a\u00020OH\u0016\u00a2\u0006\u0004\u0008P\u0010QJG\u0010T\u001a\u00020\u00122\u0006\u0010R\u001a\u00020\u00152\u0006\u0010S\u001a\u00020\u00152\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120B2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00120BH\u0016\u00a2\u0006\u0004\u0008T\u0010UJ?\u0010X\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\u00152\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u00120B2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00120BH\u0016\u00a2\u0006\u0004\u0008X\u0010YJ\u0017\u0010Z\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008Z\u0010[JM\u0010^\u001a\u00020\u00122\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150<2\u0014\u0010A\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010]\u0012\u0004\u0012\u00020\u00120B2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00120BH\u0016\u00a2\u0006\u0004\u0008^\u0010JJ9\u0010a\u001a\u00020\u00122\u0006\u0010`\u001a\u00020_2\u000c\u0010A\u001a\u0008\u0012\u0004\u0012\u00020\u00120@2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00120BH\u0016\u00a2\u0006\u0004\u0008a\u0010bJ5\u0010g\u001a\u00020\u00122\u0006\u00100\u001a\u00020/2\u000c\u0010d\u001a\u0008\u0012\u0004\u0012\u00020c0\u001b2\u0006\u0010\u0018\u001a\u0002042\u0006\u0010e\u001a\u000208H\u0001\u00a2\u0006\u0004\u0008f\u0010;J+\u0010i\u001a\u00020h2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020=0<2\u0006\u0010?\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008i\u0010jJ;\u0010m\u001a\u00020\u00122\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0008\u00103\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u0002042\u0008\u0008\u0002\u0010l\u001a\u00020kH\u0002\u00a2\u0006\u0004\u0008m\u0010nJE\u0010r\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u0002042\u0006\u0010o\u001a\u00020C2\u0008\u0010p\u001a\u0004\u0018\u00010k2\u0006\u0010l\u001a\u00020k2\u0012\u0010q\u001a\u000e\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020\u00120BH\u0002\u00a2\u0006\u0004\u0008r\u0010sJ%\u0010v\u001a\u0008\u0012\u0004\u0012\u00020u0\u001b2\u000e\u0010t\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u001bH\u0002\u00a2\u0006\u0004\u0008v\u0010wJ#\u0010y\u001a\u00020x2\u0006\u00102\u001a\u0002012\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u0015H\u0002\u00a2\u0006\u0004\u0008y\u0010zJ#\u0010{\u001a\u0008\u0012\u0004\u0012\u00020c0\u001b2\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u0002060\u001bH\u0002\u00a2\u0006\u0004\u0008{\u0010wJ0\u0010\u0080\u0001\u001a\u00020\u00122\u0012\u0010\u007f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020~0}0|2\u0008\u0010\u0018\u001a\u0004\u0018\u000104H\u0002\u00a2\u0006\u0006\u0008\u0080\u0001\u0010\u0081\u0001J#\u0010\u0083\u0001\u001a\u00020\u0015\"\u0005\u0008\u0000\u0010\u0082\u0001*\u0008\u0012\u0004\u0012\u00028\u00000|H\u0002\u00a2\u0006\u0006\u0008\u0083\u0001\u0010\u0084\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0003\u0010\u0085\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0005\u0010\u0086\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0007\u0010\u0087\u0001R\u0015\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\t\u0010\u0088\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000b\u0010\u0089\u0001R\u0015\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\r\u0010\u008a\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008b\u0001\u0010\u008c\u0001R\u0017\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u00080\u0010\u008d\u0001R\u0017\u0010\u008e\u0001\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008e\u0001\u0010\u008c\u0001R\u0017\u0010\u008f\u0001\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008f\u0001\u0010\u0090\u0001R\u0017\u0010\u0091\u0001\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0091\u0001\u0010\u008c\u0001R\u0017\u0010\u0094\u0001\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0092\u0001\u0010\u0093\u0001\u00a8\u0006\u0096\u0001"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "Lcom/qonversion/android/sdk/internal/api/Api;",
        "api",
        "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;",
        "environmentProvider",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "config",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;",
        "errorMapper",
        "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;",
        "delayCalculator",
        "<init>",
        "(Lcom/qonversion/android/sdk/internal/api/Api;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;)V",
        "Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;",
        "requestData",
        "Lef/C;",
        "init",
        "(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V",
        "",
        "contextKey",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
        "callback",
        "remoteConfig",
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
        "",
        "installDate",
        "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
        "purchase",
        "qProductId",
        "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
        "(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V",
        "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
        "historyRecords",
        "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
        "requestTrigger",
        "restore",
        "(JLjava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V",
        "",
        "",
        "conversionInfo",
        "from",
        "Lkotlin/Function0;",
        "onSuccess",
        "Lkotlin/Function1;",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "onError",
        "attribution",
        "(Ljava/util/Map;Ljava/lang/String;Ltf/a;Ltf/l;)V",
        "properties",
        "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;",
        "sendProperties",
        "(Ljava/util/Map;Ltf/l;Ltf/l;)V",
        "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;",
        "getProperties",
        "(Ltf/l;Ltf/l;)V",
        "productIds",
        "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
        "eligibilityForProductIds",
        "(Ljava/util/List;JLcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V",
        "userID",
        "currentUserID",
        "identify",
        "(Ljava/lang/String;Ljava/lang/String;Ltf/l;Ltf/l;)V",
        "screenId",
        "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;",
        "screens",
        "(Ljava/lang/String;Ltf/l;Ltf/l;)V",
        "views",
        "(Ljava/lang/String;)V",
        "queryParams",
        "Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;",
        "actionPoints",
        "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;",
        "crashData",
        "crashReport",
        "(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Ltf/a;Ltf/l;)V",
        "Lcom/qonversion/android/sdk/internal/dto/purchase/History;",
        "history",
        "trigger",
        "restoreRequest$sdk_release",
        "restoreRequest",
        "Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;",
        "createAttributionRequest",
        "(Ljava/util/Map;Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;",
        "",
        "attemptIndex",
        "purchaseRequest",
        "(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;I)V",
        "error",
        "errorCode",
        "retry",
        "handlePurchaseError",
        "(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/dto/QonversionError;Ljava/lang/Integer;ILtf/l;)V",
        "purchases",
        "Lcom/qonversion/android/sdk/internal/dto/purchase/Inapp;",
        "convertPurchases",
        "(Ljava/util/List;)Ljava/util/List;",
        "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;",
        "convertPurchaseDetails",
        "(Lcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;",
        "convertHistory",
        "Lzg/Q;",
        "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;",
        "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
        "response",
        "handlePermissionsResponse",
        "(Lzg/Q;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V",
        "T",
        "getLogMessage",
        "(Lzg/Q;)Ljava/lang/String;",
        "Lcom/qonversion/android/sdk/internal/api/Api;",
        "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;",
        "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;",
        "advertisingId",
        "Ljava/lang/String;",
        "J",
        "key",
        "isDebugMode",
        "Z",
        "sdkVersion",
        "getUid",
        "()Ljava/lang/String;",
        "uid",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final MAX_RETRIES_COUNT:I = 0x3


# instance fields
.field private advertisingId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final api:Lcom/qonversion/android/sdk/internal/api/Api;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final config:Lcom/qonversion/android/sdk/internal/InternalConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final delayCalculator:Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final environmentProvider:Lcom/qonversion/android/sdk/internal/EnvironmentProvider;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final errorMapper:Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private installDate:J

.field private final isDebugMode:Z

.field private final key:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final logger:Lcom/qonversion/android/sdk/internal/logger/Logger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final sdkVersion:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->Companion:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/api/Api;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/api/Api;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/EnvironmentProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/InternalConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/internal/logger/Logger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "api"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "environmentProvider"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "config"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "logger"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "errorMapper"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "delayCalculator"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 35
    .line 36
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->environmentProvider:Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    .line 37
    .line 38
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->config:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 39
    .line 40
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 41
    .line 42
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->errorMapper:Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    .line 43
    .line 44
    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->delayCalculator:Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

    .line 45
    .line 46
    invoke-virtual {p3}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;->getProjectKey()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->key:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {p3}, Lcom/qonversion/android/sdk/internal/InternalConfig;->isSandbox()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->isDebugMode:Z

    .line 61
    .line 62
    invoke-virtual {p3}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;->getSdkVersion()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->sdkVersion:Ljava/lang/String;

    .line 71
    .line 72
    return-void
.end method

.method public static final synthetic access$getErrorMapper$p(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->errorMapper:Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getLogMessage(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lzg/Q;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getLogMessage(Lzg/Q;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)Lcom/qonversion/android/sdk/internal/logger/Logger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$handlePermissionsResponse(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lzg/Q;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->handlePermissionsResponse(Lzg/Q;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$handlePurchaseError(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/dto/QonversionError;Ljava/lang/Integer;ILtf/l;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->handlePurchaseError(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/dto/QonversionError;Ljava/lang/Integer;ILtf/l;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$purchaseRequest(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;I)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->purchaseRequest(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final convertHistory(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/purchase/History;",
            ">;"
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/lang/Iterable;

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;->getHistoryRecord()Lcom/android/billingclient/api/PurchaseHistoryRecord;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v2}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    new-instance v3, Lcom/qonversion/android/sdk/internal/dto/purchase/History;

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;->getHistoryRecord()Lcom/android/billingclient/api/PurchaseHistoryRecord;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->getPurchaseToken()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const-string v5, "getPurchaseToken(...)"

    .line 47
    .line 48
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;->getHistoryRecord()Lcom/android/billingclient/api/PurchaseHistoryRecord;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->getPurchaseTime()J

    .line 56
    .line 57
    .line 58
    move-result-wide v5

    .line 59
    invoke-static {v5, v6}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->milliSecondsToSeconds(J)J

    .line 60
    .line 61
    .line 62
    move-result-wide v5

    .line 63
    invoke-direct {v3, v2, v4, v5, v6}, Lcom/qonversion/android/sdk/internal/dto/purchase/History;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 64
    .line 65
    .line 66
    move-object v1, v3

    .line 67
    :goto_1
    if-eqz v1, :cond_0

    .line 68
    .line 69
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    return-object v0
.end method

.method private final convertPurchaseDetails(Lcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;
    .locals 10

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getPurchaseToken()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getPurchaseTime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getOrderId()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getOriginalOrderId()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getStoreProductId()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    const-string v7, ""

    .line 24
    .line 25
    if-nez v6, :cond_0

    .line 26
    .line 27
    move-object v6, v7

    .line 28
    :cond_0
    if-nez p2, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v7, p2

    .line 32
    :goto_0
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getContextKeys()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getScreenUid()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v9

    .line 40
    invoke-direct/range {v0 .. v9}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public static synthetic convertPurchaseDetails$default(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->convertPurchaseDetails(Lcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final convertPurchases(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/purchase/Inapp;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    check-cast p1, Ljava/lang/Iterable;

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-static {p0, v1, v3, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->convertPurchaseDetails$default(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    new-instance v2, Lcom/qonversion/android/sdk/internal/dto/purchase/Inapp;

    .line 33
    .line 34
    invoke-direct {v2, v1}, Lcom/qonversion/android/sdk/internal/dto/purchase/Inapp;-><init>(Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {v0}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1
.end method

.method private final createAttributionRequest(Ljava/util/Map;Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->environmentProvider:Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-static {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->getInfo$default(Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/internal/dto/Environment;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->sdkVersion:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->key:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v8

    .line 17
    new-instance v7, Lcom/qonversion/android/sdk/internal/dto/ProviderData;

    .line 18
    .line 19
    invoke-direct {v7, p1, p2}, Lcom/qonversion/android/sdk/internal/dto/ProviderData;-><init>(Ljava/util/Map;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;

    .line 23
    .line 24
    invoke-direct/range {v3 .. v8}, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;-><init>(Lcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/ProviderData;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v3
.end method

.method private final getLogMessage(Lzg/Q;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lzg/Q<",
            "TT;>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lzg/Q;->a:Lokhttp3/Response;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/Response;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v1, "success - "

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->errorMapper:Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getErrorFromResponse(Lzg/Q;)Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v1, "failure - "

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0
.end method

.method private final getUid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->config:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getUid()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private final handlePermissionsResponse(Lzg/Q;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzg/Q<",
            "Lcom/qonversion/android/sdk/internal/dto/BaseResponse<",
            "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
            ">;>;",
            "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lzg/Q;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/qonversion/android/sdk/internal/dto/BaseResponse;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/BaseResponse;->getSuccess()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/BaseResponse;->getData()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;

    .line 20
    .line 21
    invoke-interface {p2, p1}, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;->onSuccess(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    if-eqz p2, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->errorMapper:Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getErrorFromResponse(Lzg/Q;)Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p2, p1}, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method private final handlePurchaseError(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/dto/QonversionError;Ljava/lang/Integer;ILtf/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Ljava/lang/Integer;",
            "I",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x3

    .line 2
    if-ge p4, v0, :cond_2

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p3

    .line 10
    invoke-static {p3}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->isInternalServerError(I)Z

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    if-eqz p3, :cond_2

    .line 15
    .line 16
    :cond_0
    add-int/lit8 p1, p4, 0x1

    .line 17
    .line 18
    if-nez p4, :cond_1

    .line 19
    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p5, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :try_start_0
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->delayCalculator:Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

    .line 29
    .line 30
    add-int/lit8 p4, p4, -0x1

    .line 31
    .line 32
    const/4 p3, 0x0

    .line 33
    invoke-virtual {p2, p3, p4}, Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;->countDelay(II)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    new-instance p4, Ljava/util/Timer;

    .line 38
    .line 39
    const-string v0, "Delayed retry"

    .line 40
    .line 41
    invoke-direct {p4, v0, p3}, Ljava/util/Timer;-><init>(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    new-instance p3, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$handlePurchaseError$1;

    .line 45
    .line 46
    invoke-direct {p3, p5, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$handlePurchaseError$1;-><init>(Ltf/l;I)V

    .line 47
    .line 48
    .line 49
    int-to-long v0, p2

    .line 50
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->secondsToMilliSeconds(J)J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    invoke-virtual {p4, p3, v0, v1}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :catch_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p5, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    invoke-interface {p1, p2}, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method private final purchaseRequest(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;I)V
    .locals 15

    .line 1
    new-instance v2, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->environmentProvider:Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    .line 4
    .line 5
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->advertisingId:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v3}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->getInfo(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/Environment;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->sdkVersion:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v7, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->key:Ljava/lang/String;

    .line 14
    .line 15
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v8

    .line 19
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->isDebugMode:Z

    .line 20
    .line 21
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->stringValue(Z)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v10

    .line 25
    move-object/from16 v0, p3

    .line 26
    .line 27
    move-object/from16 v14, p4

    .line 28
    .line 29
    invoke-direct {p0, v0, v14}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->convertPurchaseDetails(Lcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;

    .line 30
    .line 31
    .line 32
    move-result-object v11

    .line 33
    const/16 v12, 0x20

    .line 34
    .line 35
    const/4 v13, 0x0

    .line 36
    const/4 v9, 0x0

    .line 37
    move-wide/from16 v3, p1

    .line 38
    .line 39
    invoke-direct/range {v2 .. v13}, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;-><init>(JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    .line 41
    .line 42
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 43
    .line 44
    sget-object v4, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Purchase:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 45
    .line 46
    invoke-virtual {v4}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->getKey()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    add-int/lit8 v5, p6, 0x1

    .line 51
    .line 52
    invoke-interface {v3, v2, v4, v5}, Lcom/qonversion/android/sdk/internal/api/Api;->purchase(Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;Ljava/lang/String;I)Lzg/c;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1;

    .line 57
    .line 58
    move-object v1, p0

    .line 59
    move-wide/from16 v4, p1

    .line 60
    .line 61
    move-object/from16 v6, p3

    .line 62
    .line 63
    move-object/from16 v2, p5

    .line 64
    .line 65
    move/from16 v3, p6

    .line 66
    .line 67
    move-object v7, v14

    .line 68
    invoke-direct/range {v0 .. v7}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;IJLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v8, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public static synthetic purchaseRequest$default(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;IILjava/lang/Object;)V
    .locals 7

    .line 1
    and-int/lit8 p7, p7, 0x10

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const/4 p6, 0x0

    .line 6
    :cond_0
    move-object v0, p0

    .line 7
    move-wide v1, p1

    .line 8
    move-object v3, p3

    .line 9
    move-object v4, p4

    .line 10
    move-object v5, p5

    .line 11
    move v6, p6

    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->purchaseRequest(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public actionPoints(Ljava/util/Map;Ltf/l;Ltf/l;)V
    .locals 2
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "queryParams"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onSuccess"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onError"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/api/Api;->actionPoints(Ljava/lang/String;Ljava/util/Map;)Lzg/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$actionPoints$1;

    .line 27
    .line 28
    invoke-direct {v0, p0, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$actionPoints$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Ltf/l;Ltf/l;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .locals 2
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
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;

    .line 17
    .line 18
    invoke-direct {v0, p2}, Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {p2, p1, v1, v0}, Lcom/qonversion/android/sdk/internal/api/Api;->attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/request/AttachUserRequest;)Lzg/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance p2, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attachUserToExperiment$1;

    .line 32
    .line 33
    invoke-direct {p2, p0, p3}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attachUserToExperiment$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p2}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public attachUserToRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 2
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
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, p1, v1}, Lcom/qonversion/android/sdk/internal/api/Api;->attachUserToRemoteConfiguration(Ljava/lang/String;Ljava/lang/String;)Lzg/c;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attachUserToRemoteConfiguration$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attachUserToRemoteConfiguration$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public attribution(Ljava/util/Map;Ljava/lang/String;Ltf/a;Ltf/l;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltf/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/Nullable;
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
            "Ljava/lang/String;",
            "Ltf/a;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "conversionInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "from"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->createAttributionRequest(Ljava/util/Map;Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 16
    .line 17
    invoke-interface {p2, p1}, Lcom/qonversion/android/sdk/internal/api/Api;->attribution(Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;)Lzg/c;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance p2, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attribution$1;

    .line 22
    .line 23
    invoke-direct {p2, p0, p3, p4}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attribution$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Ltf/a;Ltf/l;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, p2}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public crashReport(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Ltf/a;Ltf/l;)V
    .locals 3
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;",
            "Ltf/a;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "crashData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onSuccess"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onError"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-static {v0, p1, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/api/Api$DefaultImpls;->crashLogs$default(Lcom/qonversion/android/sdk/internal/api/Api;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Ljava/lang/String;ILjava/lang/Object;)Lzg/c;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$crashReport$1;

    .line 25
    .line 26
    invoke-direct {v0, p0, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$crashReport$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Ltf/a;Ltf/l;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public detachUserFromExperiment(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .locals 2
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
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, p1, v1}, Lcom/qonversion/android/sdk/internal/api/Api;->detachUserFromExperiment(Ljava/lang/String;Ljava/lang/String;)Lzg/c;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$detachUserFromExperiment$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$detachUserFromExperiment$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public detachUserFromRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 2
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
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, p1, v1}, Lcom/qonversion/android/sdk/internal/api/Api;->detachUserFromRemoteConfiguration(Ljava/lang/String;Ljava/lang/String;)Lzg/c;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$detachUserFromRemoteConfiguration$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$detachUserFromRemoteConfiguration$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public eligibilityForProductIds(Ljava/util/List;JLcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V
    .locals 17
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;J",
            "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    const-string v3, "productIds"

    .line 8
    .line 9
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "callback"

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->environmentProvider:Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    .line 18
    .line 19
    iget-object v4, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->advertisingId:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v3, v4}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->getInfo(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/Environment;

    .line 22
    .line 23
    .line 24
    move-result-object v8

    .line 25
    iget-object v9, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->sdkVersion:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v10, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->key:Ljava/lang/String;

    .line 28
    .line 29
    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v11

    .line 33
    iget-boolean v3, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->isDebugMode:Z

    .line 34
    .line 35
    invoke-static {v3}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->stringValue(Z)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v13

    .line 39
    check-cast v1, Ljava/lang/Iterable;

    .line 40
    .line 41
    new-instance v14, Ljava/util/ArrayList;

    .line 42
    .line 43
    const/16 v3, 0xa

    .line 44
    .line 45
    invoke-static {v1, v3}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-direct {v14, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_0

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Ljava/lang/String;

    .line 67
    .line 68
    new-instance v4, Lcom/qonversion/android/sdk/internal/dto/eligibility/StoreProductInfo;

    .line 69
    .line 70
    invoke-direct {v4, v3}, Lcom/qonversion/android/sdk/internal/dto/eligibility/StoreProductInfo;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v14, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    new-instance v5, Lcom/qonversion/android/sdk/internal/dto/request/EligibilityRequest;

    .line 78
    .line 79
    const/4 v12, 0x0

    .line 80
    const/16 v15, 0x20

    .line 81
    .line 82
    const/16 v16, 0x0

    .line 83
    .line 84
    move-wide/from16 v6, p2

    .line 85
    .line 86
    invoke-direct/range {v5 .. v16}, Lcom/qonversion/android/sdk/internal/dto/request/EligibilityRequest;-><init>(JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 87
    .line 88
    .line 89
    iget-object v1, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 90
    .line 91
    invoke-interface {v1, v5}, Lcom/qonversion/android/sdk/internal/api/Api;->eligibility(Lcom/qonversion/android/sdk/internal/dto/request/EligibilityRequest;)Lzg/c;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$eligibilityForProductIds$1;

    .line 96
    .line 97
    invoke-direct {v3, v0, v2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$eligibilityForProductIds$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v1, v3}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public getProperties(Ltf/l;Ltf/l;)V
    .locals 2
    .param p1    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "onSuccess"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onError"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/api/Api;->getProperties(Ljava/lang/String;)Lzg/c;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$getProperties$1;

    .line 22
    .line 23
    invoke-direct {v1, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$getProperties$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Ltf/l;Ltf/l;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public identify(Ljava/lang/String;Ljava/lang/String;Ltf/l;Ltf/l;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "userID"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "currentUserID"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onSuccess"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onError"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;

    .line 22
    .line 23
    invoke-direct {v0, p2, p1}, Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 27
    .line 28
    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/internal/api/Api;->identify(Lcom/qonversion/android/sdk/internal/dto/request/IdentityRequest;)Lzg/c;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance p2, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$identify$1;

    .line 33
    .line 34
    invoke-direct {p2, p0, p3, p4}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$identify$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Ltf/l;Ltf/l;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public init(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V
    .locals 13
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "requestData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->getIdfa()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->advertisingId:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->getInstallDate()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iput-wide v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->installDate:J

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->getPurchases()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->convertPurchases(Ljava/util/List;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v10

    .line 26
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;

    .line 27
    .line 28
    iget-wide v2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->installDate:J

    .line 29
    .line 30
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->environmentProvider:Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    .line 31
    .line 32
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->advertisingId:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v4}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->getInfo(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/Environment;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->sdkVersion:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->key:Ljava/lang/String;

    .line 41
    .line 42
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->isDebugMode:Z

    .line 47
    .line 48
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->stringValue(Z)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    const/16 v11, 0x20

    .line 53
    .line 54
    const/4 v12, 0x0

    .line 55
    const/4 v8, 0x0

    .line 56
    invoke-direct/range {v1 .. v12}, Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;-><init>(JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->getRequestTrigger()Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->getKey()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-interface {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/api/Api;->init(Lcom/qonversion/android/sdk/internal/dto/request/InitRequest;Ljava/lang/String;)Lzg/c;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-instance v1, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$init$1;

    .line 74
    .line 75
    invoke-direct {v1, p0, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$init$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public purchase(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V
    .locals 10
    .param p3    # Lcom/qonversion/android/sdk/internal/purchase/Purchase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "purchase"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/16 v8, 0x10

    .line 12
    .line 13
    const/4 v9, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    move-object v1, p0

    .line 16
    move-wide v2, p1

    .line 17
    move-object v4, p3

    .line 18
    move-object v5, p4

    .line 19
    move-object v6, p5

    .line 20
    invoke-static/range {v1 .. v9}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->purchaseRequest$default(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;IILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public remoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/api/Api;->remoteConfig(Ljava/lang/String;Ljava/lang/String;)Lzg/c;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1;

    .line 17
    .line 18
    invoke-direct {v0, p0, p2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public remoteConfigList(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 5
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lcom/qonversion/android/sdk/internal/api/Api$DefaultImpls;->remoteConfigList$default(Lcom/qonversion/android/sdk/internal/api/Api;Ljava/lang/String;ZILjava/lang/Object;)Lzg/c;

    move-result-object v0

    new-instance v1, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$2;

    invoke-direct {v1, p0, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

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
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lcom/qonversion/android/sdk/internal/api/Api;->remoteConfigList(Ljava/lang/String;Ljava/util/List;Z)Lzg/c;

    move-result-object p1

    new-instance p2, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$1;

    invoke-direct {p2, p0, p3}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    invoke-static {p1, p2}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

    return-void
.end method

.method public restore(JLjava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 7
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/qonversion/android/sdk/internal/api/RequestTrigger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;",
            "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
            "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "historyRecords"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "requestTrigger"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p3}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->convertHistory(Ljava/util/List;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    move-object v1, p0

    .line 21
    move-wide v2, p1

    .line 22
    move-object v5, p4

    .line 23
    move-object v6, p5

    .line 24
    invoke-virtual/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->restoreRequest$sdk_release(JLjava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final restoreRequest$sdk_release(JLjava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 16
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/qonversion/android/sdk/internal/api/RequestTrigger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/purchase/History;",
            ">;",
            "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
            "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    const-string v2, "history"

    .line 6
    .line 7
    move-object/from16 v12, p3

    .line 8
    .line 9
    invoke-static {v12, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v2, "callback"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v2, "trigger"

    .line 18
    .line 19
    move-object/from16 v15, p5

    .line 20
    .line 21
    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance v3, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;

    .line 25
    .line 26
    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->environmentProvider:Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    .line 27
    .line 28
    iget-object v4, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->advertisingId:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v2, v4}, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;->getInfo(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/Environment;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    iget-object v7, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->sdkVersion:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v8, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->key:Ljava/lang/String;

    .line 37
    .line 38
    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    iget-boolean v2, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->isDebugMode:Z

    .line 43
    .line 44
    invoke-static {v2}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->stringValue(Z)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v11

    .line 48
    const/16 v13, 0x20

    .line 49
    .line 50
    const/4 v14, 0x0

    .line 51
    const/4 v10, 0x0

    .line 52
    move-wide/from16 v4, p1

    .line 53
    .line 54
    invoke-direct/range {v3 .. v14}, Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;-><init>(JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 55
    .line 56
    .line 57
    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 58
    .line 59
    invoke-virtual {v15}, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->getKey()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-interface {v2, v3, v4}, Lcom/qonversion/android/sdk/internal/api/Api;->restore(Lcom/qonversion/android/sdk/internal/dto/request/RestoreRequest;Ljava/lang/String;)Lzg/c;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$restoreRequest$1;

    .line 68
    .line 69
    invoke-direct {v3, v0, v1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$restoreRequest$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v2, v3}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public screens(Ljava/lang/String;Ltf/l;Ltf/l;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "screenId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onSuccess"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onError"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/internal/api/Api;->screens(Ljava/lang/String;)Lzg/c;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$screens$1;

    .line 23
    .line 24
    invoke-direct {v0, p0, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$screens$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Ltf/l;Ltf/l;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public sendProperties(Ljava/util/Map;Ltf/l;Ltf/l;)V
    .locals 4
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "properties"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onSuccess"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onError"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Ljava/util/Map$Entry;

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/lang/String;

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Ljava/lang/String;

    .line 56
    .line 57
    new-instance v3, Lcom/qonversion/android/sdk/internal/dto/request/data/UserPropertyRequestData;

    .line 58
    .line 59
    invoke-direct {v3, v2, v1}, Lcom/qonversion/android/sdk/internal/dto/request/data/UserPropertyRequestData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 67
    .line 68
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-interface {p1, v1, v0}, Lcom/qonversion/android/sdk/internal/api/Api;->sendProperties(Ljava/lang/String;Ljava/util/List;)Lzg/c;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$sendProperties$1;

    .line 77
    .line 78
    invoke-direct {v0, p0, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$sendProperties$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Ltf/l;Ltf/l;)V

    .line 79
    .line 80
    .line 81
    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public views(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "screenId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/request/ViewsRequest;

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->getUid()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/dto/request/ViewsRequest;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->api:Lcom/qonversion/android/sdk/internal/api/Api;

    .line 16
    .line 17
    invoke-interface {v1, p1, v0}, Lcom/qonversion/android/sdk/internal/api/Api;->views(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/request/ViewsRequest;)Lzg/c;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$views$1;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$views$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->enqueue(Lzg/c;Ltf/l;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
