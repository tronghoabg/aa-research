.class public interface abstract Lcom/qonversion/android/sdk/Qonversion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/Qonversion$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u0000 ]2\u00020\u0001:\u0001]J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J/\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\'\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u000bH&\u00a2\u0006\u0004\u0008\r\u0010\u000fJ/\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH&\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\'\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u000bH\'\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000c\u001a\u00020\u000bH\'\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0017H&\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u001aH&\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u001dH&\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\u000c\u001a\u00020\u001dH&\u00a2\u0006\u0004\u0008\u001e\u0010\"J-\u0010(\u001a\u00020\u00022\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020 0#2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u000c\u001a\u00020\'H&\u00a2\u0006\u0004\u0008(\u0010)J\u0017\u0010(\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\'H&\u00a2\u0006\u0004\u0008(\u0010*J\'\u0010.\u001a\u00020\u00022\u0006\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020 2\u0006\u0010\u000c\u001a\u00020-H&\u00a2\u0006\u0004\u0008.\u0010/J\u001f\u00100\u001a\u00020\u00022\u0006\u0010+\u001a\u00020 2\u0006\u0010\u000c\u001a\u00020-H&\u00a2\u0006\u0004\u00080\u00101J\u001f\u00104\u001a\u00020\u00022\u0006\u00102\u001a\u00020 2\u0006\u0010\u000c\u001a\u000203H&\u00a2\u0006\u0004\u00084\u00105J\u001f\u00106\u001a\u00020\u00022\u0006\u00102\u001a\u00020 2\u0006\u0010\u000c\u001a\u000203H&\u00a2\u0006\u0004\u00086\u00105J%\u00109\u001a\u00020\u00022\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020 0#2\u0006\u0010\u000c\u001a\u000208H&\u00a2\u0006\u0004\u00089\u0010:J\u0017\u0010;\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH&\u00a2\u0006\u0004\u0008;\u0010<J\u0017\u0010=\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH&\u00a2\u0006\u0004\u0008=\u0010<J\u000f\u0010>\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008>\u0010\u0004J\u0017\u0010@\u001a\u00020\u00022\u0006\u0010?\u001a\u00020 H&\u00a2\u0006\u0004\u0008@\u0010AJ\u001f\u0010@\u001a\u00020\u00022\u0006\u0010?\u001a\u00020 2\u0006\u0010\u000c\u001a\u00020BH&\u00a2\u0006\u0004\u0008@\u0010CJ\u000f\u0010D\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008D\u0010\u0004J\u0017\u0010E\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020BH&\u00a2\u0006\u0004\u0008E\u0010FJ+\u0010K\u001a\u00020\u00022\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00010G2\u0006\u0010J\u001a\u00020IH&\u00a2\u0006\u0004\u0008K\u0010LJ\u001f\u0010P\u001a\u00020\u00022\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020 H&\u00a2\u0006\u0004\u0008P\u0010QJ\u001f\u0010R\u001a\u00020\u00022\u0006\u0010N\u001a\u00020 2\u0006\u0010O\u001a\u00020 H&\u00a2\u0006\u0004\u0008R\u0010SJ\u0017\u0010U\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020TH&\u00a2\u0006\u0004\u0008U\u0010VJ\u000f\u0010W\u001a\u00020%H&\u00a2\u0006\u0004\u0008W\u0010XJ\u0017\u0010[\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020YH&\u00a2\u0006\u0004\u0008[\u0010\\\u00a8\u0006^"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/Qonversion;",
        "",
        "Lef/C;",
        "syncHistoricalData",
        "()V",
        "Landroid/app/Activity;",
        "context",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "product",
        "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
        "options",
        "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;",
        "callback",
        "purchase",
        "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V",
        "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V",
        "updatePurchase",
        "Lcom/qonversion/android/sdk/dto/QPurchaseModel;",
        "purchaseModel",
        "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/QPurchaseModel;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V",
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
.field public static final Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/Qonversion$Companion;->$$INSTANCE:Lcom/qonversion/android/sdk/Qonversion$Companion;

    sput-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    return-void
.end method


# virtual methods
.method public abstract attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
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
.end method

.method public abstract attachUserToRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract attribution(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/QAttributionProvider;)V
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
.end method

.method public abstract checkEntitlements(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract checkTrialIntroEligibility(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V
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
.end method

.method public abstract detachUserFromExperiment(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract detachUserFromRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract identify(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract identify(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract isFallbackFileAccessible()Z
.end method

.method public abstract logout()V
.end method

.method public abstract offerings(Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;)V
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract products(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/QPurchaseModel;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
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
.end method

.method public abstract purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
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
.end method

.method public abstract purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
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
.end method

.method public abstract remoteConfig(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract remoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract remoteConfigList(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract remoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
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
.end method

.method public abstract restore(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setCustomUserProperty(Ljava/lang/String;Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setEntitlementsUpdateListener(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V
    .param p1    # Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract setUserProperty(Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;Ljava/lang/String;)V
    .param p1    # Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract syncHistoricalData()V
.end method

.method public abstract syncPurchases()V
.end method

.method public abstract updatePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
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
.end method

.method public abstract updatePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
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
.end method

.method public abstract userInfo(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract userProperties(Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;)V
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
