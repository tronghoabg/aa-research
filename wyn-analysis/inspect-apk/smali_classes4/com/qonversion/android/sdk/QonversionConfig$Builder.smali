.class public final Lcom/qonversion/android/sdk/QonversionConfig$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/QonversionConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u00020\u0000J\u0006\u00103\u001a\u00020\u0000J\u000e\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\nJ\u000e\u00106\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u00107\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u00108\u001a\u00020\u00002\u0008\u0008\u0001\u00109\u001a\u00020\u001cJ\u000e\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R\u001a\u0010\"\u001a\u00020#X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R\u001a\u0010-\u001a\u00020#X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008.\u0010%\"\u0004\u0008/\u0010\'\u00a8\u0006<"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/QonversionConfig$Builder;",
        "",
        "context",
        "Landroid/content/Context;",
        "projectKey",
        "",
        "launchMode",
        "Lcom/qonversion/android/sdk/dto/QLaunchMode;",
        "(Landroid/content/Context;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QLaunchMode;)V",
        "entitlementsCacheLifetime",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;",
        "getEntitlementsCacheLifetime$sdk_release",
        "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;",
        "setEntitlementsCacheLifetime$sdk_release",
        "(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;)V",
        "entitlementsUpdateListener",
        "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;",
        "getEntitlementsUpdateListener$sdk_release",
        "()Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;",
        "setEntitlementsUpdateListener$sdk_release",
        "(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V",
        "environment",
        "Lcom/qonversion/android/sdk/dto/QEnvironment;",
        "getEnvironment$sdk_release",
        "()Lcom/qonversion/android/sdk/dto/QEnvironment;",
        "setEnvironment$sdk_release",
        "(Lcom/qonversion/android/sdk/dto/QEnvironment;)V",
        "fallbackFileIdentifier",
        "",
        "getFallbackFileIdentifier$sdk_release",
        "()Ljava/lang/Integer;",
        "setFallbackFileIdentifier$sdk_release",
        "(Ljava/lang/Integer;)V",
        "Ljava/lang/Integer;",
        "isKidsMode",
        "",
        "isKidsMode$sdk_release",
        "()Z",
        "setKidsMode$sdk_release",
        "(Z)V",
        "proxyUrl",
        "getProxyUrl$sdk_release",
        "()Ljava/lang/String;",
        "setProxyUrl$sdk_release",
        "(Ljava/lang/String;)V",
        "sendFbAttribution",
        "getSendFbAttribution$sdk_release",
        "setSendFbAttribution$sdk_release",
        "build",
        "Lcom/qonversion/android/sdk/QonversionConfig;",
        "disableFacebookAttribution",
        "enableKidsMode",
        "setEntitlementsCacheLifetime",
        "lifetime",
        "setEntitlementsUpdateListener",
        "setEnvironment",
        "setFallbackFileIdentifier",
        "id",
        "setProxyURL",
        "url",
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
.field private final context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private environment:Lcom/qonversion/android/sdk/dto/QEnvironment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private fallbackFileIdentifier:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private isKidsMode:Z

.field private final launchMode:Lcom/qonversion/android/sdk/dto/QLaunchMode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final projectKey:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private proxyUrl:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private sendFbAttribution:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QLaunchMode;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/dto/QLaunchMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "projectKey"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "launchMode"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->context:Landroid/content/Context;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->projectKey:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->launchMode:Lcom/qonversion/android/sdk/dto/QLaunchMode;

    .line 24
    .line 25
    sget-object p1, Lcom/qonversion/android/sdk/dto/QEnvironment;->Production:Lcom/qonversion/android/sdk/dto/QEnvironment;

    .line 26
    .line 27
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->environment:Lcom/qonversion/android/sdk/dto/QEnvironment;

    .line 28
    .line 29
    sget-object p1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->Month:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 30
    .line 31
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->sendFbAttribution:Z

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final build()Lcom/qonversion/android/sdk/QonversionConfig;
    .locals 13
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->projectKey:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->environment:Lcom/qonversion/android/sdk/dto/QEnvironment;

    .line 10
    .line 11
    sget-object v1, Lcom/qonversion/android/sdk/dto/QEnvironment;->Production:Lcom/qonversion/android/sdk/dto/QEnvironment;

    .line 12
    .line 13
    const-string v2, "Qonversion"

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->context:Landroid/content/Context;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->isDebuggable(Landroid/content/Context;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const-string v0, "Environment level is set to Production for debug build."

    .line 26
    .line 27
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->environment:Lcom/qonversion/android/sdk/dto/QEnvironment;

    .line 32
    .line 33
    sget-object v1, Lcom/qonversion/android/sdk/dto/QEnvironment;->Sandbox:Lcom/qonversion/android/sdk/dto/QEnvironment;

    .line 34
    .line 35
    if-ne v0, v1, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->context:Landroid/content/Context;

    .line 38
    .line 39
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->isDebuggable(Landroid/content/Context;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    const-string v0, "Environment level is set to Sandbox for release build."

    .line 46
    .line 47
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    new-instance v3, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    .line 51
    .line 52
    iget-object v4, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->projectKey:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v5, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->launchMode:Lcom/qonversion/android/sdk/dto/QLaunchMode;

    .line 55
    .line 56
    iget-object v6, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->environment:Lcom/qonversion/android/sdk/dto/QEnvironment;

    .line 57
    .line 58
    iget-object v7, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->proxyUrl:Ljava/lang/String;

    .line 59
    .line 60
    iget-boolean v8, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->isKidsMode:Z

    .line 61
    .line 62
    iget-boolean v9, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->sendFbAttribution:Z

    .line 63
    .line 64
    const/16 v11, 0x40

    .line 65
    .line 66
    const/4 v12, 0x0

    .line 67
    const/4 v10, 0x0

    .line 68
    invoke-direct/range {v3 .. v12}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;-><init>(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QLaunchMode;Lcom/qonversion/android/sdk/dto/QEnvironment;Ljava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 69
    .line 70
    .line 71
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

    .line 72
    .line 73
    iget-object v1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 74
    .line 75
    iget-object v2, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->fallbackFileIdentifier:Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;-><init>(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;Ljava/lang/Integer;)V

    .line 78
    .line 79
    .line 80
    new-instance v1, Lcom/qonversion/android/sdk/QonversionConfig;

    .line 81
    .line 82
    iget-object v2, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->context:Landroid/content/Context;

    .line 83
    .line 84
    invoke-static {v2}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->getApplication(Landroid/content/Context;)Landroid/app/Application;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    iget-object v4, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    .line 89
    .line 90
    invoke-direct {v1, v2, v3, v0, v4}, Lcom/qonversion/android/sdk/QonversionConfig;-><init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V

    .line 91
    .line 92
    .line 93
    return-object v1

    .line 94
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 95
    .line 96
    const-string v1, "Project key is empty"

    .line 97
    .line 98
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v0
.end method

.method public final disableFacebookAttribution()Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->sendFbAttribution:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public final enableKidsMode()Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->isKidsMode:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public final getEntitlementsCacheLifetime$sdk_release()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getEntitlementsUpdateListener$sdk_release()Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getEnvironment$sdk_release()Lcom/qonversion/android/sdk/dto/QEnvironment;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->environment:Lcom/qonversion/android/sdk/dto/QEnvironment;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFallbackFileIdentifier$sdk_release()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->fallbackFileIdentifier:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getProxyUrl$sdk_release()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->proxyUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSendFbAttribution$sdk_release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->sendFbAttribution:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isKidsMode$sdk_release()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->isKidsMode:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setEntitlementsCacheLifetime(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "lifetime"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 7
    .line 8
    return-object p0
.end method

.method public final setEntitlementsCacheLifetime$sdk_release(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;
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
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 7
    .line 8
    return-void
.end method

.method public final setEntitlementsUpdateListener(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "entitlementsUpdateListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    .line 7
    .line 8
    return-object p0
.end method

.method public final setEntitlementsUpdateListener$sdk_release(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V
    .locals 0
    .param p1    # Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    .line 2
    .line 3
    return-void
.end method

.method public final setEnvironment(Lcom/qonversion/android/sdk/dto/QEnvironment;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/dto/QEnvironment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "environment"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->environment:Lcom/qonversion/android/sdk/dto/QEnvironment;

    .line 7
    .line 8
    return-object p0
.end method

.method public final setEnvironment$sdk_release(Lcom/qonversion/android/sdk/dto/QEnvironment;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/dto/QEnvironment;
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
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->environment:Lcom/qonversion/android/sdk/dto/QEnvironment;

    .line 7
    .line 8
    return-void
.end method

.method public final setFallbackFileIdentifier(I)Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->fallbackFileIdentifier:Ljava/lang/Integer;

    .line 6
    .line 7
    return-object p0
.end method

.method public final setFallbackFileIdentifier$sdk_release(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->fallbackFileIdentifier:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setKidsMode$sdk_release(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->isKidsMode:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setProxyURL(Ljava/lang/String;)Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->proxyUrl:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "http://"

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {p1, v0, v1}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string v0, "https://"

    .line 18
    .line 19
    invoke-static {p1, v0, v1}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    iget-object v2, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->proxyUrl:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0, v2}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->proxyUrl:Ljava/lang/String;

    .line 32
    .line 33
    :cond_0
    const-string v0, "/"

    .line 34
    .line 35
    invoke-static {p1, v0, v1}, LBf/r;->b0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    iget-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->proxyUrl:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {p1, v0}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->proxyUrl:Ljava/lang/String;

    .line 48
    .line 49
    :cond_1
    return-object p0
.end method

.method public final setProxyUrl$sdk_release(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->proxyUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setSendFbAttribution$sdk_release(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/QonversionConfig$Builder;->sendFbAttribution:Z

    .line 2
    .line 3
    return-void
.end method
