.class public final Lcom/qonversion/android/sdk/QonversionConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/QonversionConfig$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001:\u0001\u0013B)\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/QonversionConfig;",
        "",
        "application",
        "Landroid/app/Application;",
        "primaryConfig",
        "Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;",
        "cacheConfig",
        "Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;",
        "entitlementsUpdateListener",
        "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;",
        "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V",
        "getApplication$sdk_release",
        "()Landroid/app/Application;",
        "getCacheConfig$sdk_release",
        "()Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;",
        "getEntitlementsUpdateListener$sdk_release",
        "()Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;",
        "getPrimaryConfig$sdk_release",
        "()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;",
        "Builder",
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
.field private final application:Landroid/app/Application;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cacheConfig:Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final primaryConfig:Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "application"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "primaryConfig"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "cacheConfig"

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
    iput-object p1, p0, Lcom/qonversion/android/sdk/QonversionConfig;->application:Landroid/app/Application;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/qonversion/android/sdk/QonversionConfig;->primaryConfig:Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/qonversion/android/sdk/QonversionConfig;->cacheConfig:Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

    .line 24
    .line 25
    iput-object p4, p0, Lcom/qonversion/android/sdk/QonversionConfig;->entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final getApplication$sdk_release()Landroid/app/Application;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig;->application:Landroid/app/Application;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCacheConfig$sdk_release()Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig;->cacheConfig:Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getEntitlementsUpdateListener$sdk_release()Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig;->entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPrimaryConfig$sdk_release()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/QonversionConfig;->primaryConfig:Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    .line 2
    .line 3
    return-object v0
.end method
