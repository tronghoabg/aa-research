.class public final Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;",
        "",
        "entitlementsCacheLifetime",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;",
        "fallbackFileIdentifier",
        "",
        "(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;Ljava/lang/Integer;)V",
        "getEntitlementsCacheLifetime",
        "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;",
        "getFallbackFileIdentifier",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "component1",
        "component2",
        "copy",
        "(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;Ljava/lang/Integer;)Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
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
.field private final entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final fallbackFileIdentifier:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;Ljava/lang/Integer;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "entitlementsCacheLifetime"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->fallbackFileIdentifier:Ljava/lang/Integer;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->fallbackFileIdentifier:Ljava/lang/Integer;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->copy(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;Ljava/lang/Integer;)Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->fallbackFileIdentifier:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;Ljava/lang/Integer;)Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "entitlementsCacheLifetime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

    invoke-direct {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;-><init>(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    iget-object v3, p1, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->fallbackFileIdentifier:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->fallbackFileIdentifier:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getEntitlementsCacheLifetime()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFallbackFileIdentifier()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->fallbackFileIdentifier:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->fallbackFileIdentifier:Ljava/lang/Integer;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->entitlementsCacheLifetime:Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->fallbackFileIdentifier:Ljava/lang/Integer;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "CacheConfig(entitlementsCacheLifetime="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fallbackFileIdentifier="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
