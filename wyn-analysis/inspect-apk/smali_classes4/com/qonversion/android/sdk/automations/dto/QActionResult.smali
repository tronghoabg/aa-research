.class public final Lcom/qonversion/android/sdk/automations/dto/QActionResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0008\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J+\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0016\u0008\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001R\u001c\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/dto/QActionResult;",
        "",
        "type",
        "Lcom/qonversion/android/sdk/automations/dto/QActionResultType;",
        "value",
        "",
        "",
        "(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;)V",
        "error",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "getError",
        "()Lcom/qonversion/android/sdk/dto/QonversionError;",
        "setError",
        "(Lcom/qonversion/android/sdk/dto/QonversionError;)V",
        "getType",
        "()Lcom/qonversion/android/sdk/automations/dto/QActionResultType;",
        "getValue",
        "()Ljava/util/Map;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private error:Lcom/qonversion/android/sdk/dto/QonversionError;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final type:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final value:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/automations/dto/QActionResultType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/automations/dto/QActionResultType;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->type:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->value:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;-><init>(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/automations/dto/QActionResult;Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;ILjava/lang/Object;)Lcom/qonversion/android/sdk/automations/dto/QActionResult;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->type:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->value:Ljava/util/Map;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->copy(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;)Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/qonversion/android/sdk/automations/dto/QActionResultType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->type:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    return-object v0
.end method

.method public final component2()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->value:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;)Lcom/qonversion/android/sdk/automations/dto/QActionResult;
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/automations/dto/QActionResultType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/automations/dto/QActionResultType;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/qonversion/android/sdk/automations/dto/QActionResult;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    invoke-direct {v0, p1, p2}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;-><init>(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;)V

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
    instance-of v1, p1, Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->type:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    iget-object v3, p1, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->type:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->value:Ljava/util/Map;

    iget-object p1, p1, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->value:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getError()Lcom/qonversion/android/sdk/dto/QonversionError;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->error:Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()Lcom/qonversion/android/sdk/automations/dto/QActionResultType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->type:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getValue()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->value:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->type:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->value:Ljava/util/Map;

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

.method public final setError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 0
    .param p1    # Lcom/qonversion/android/sdk/dto/QonversionError;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->error:Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->type:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->value:Ljava/util/Map;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "QActionResult(type="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", value="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
