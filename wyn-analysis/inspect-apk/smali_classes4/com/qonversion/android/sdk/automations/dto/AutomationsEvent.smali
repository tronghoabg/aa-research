.class public final Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u00c2\u0003J)\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;",
        "",
        "type",
        "Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;",
        "date",
        "Ljava/util/Date;",
        "productId",
        "",
        "(Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;Ljava/util/Date;Ljava/lang/String;)V",
        "getDate",
        "()Ljava/util/Date;",
        "getType",
        "()Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;",
        "component1",
        "component2",
        "component3",
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
.field private final date:Ljava/util/Date;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final productId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final type:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;Ljava/util/Date;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "date"

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
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->type:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->date:Ljava/util/Date;

    .line 17
    .line 18
    iput-object p3, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->productId:Ljava/lang/String;

    .line 19
    .line 20
    return-void
.end method

.method private final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;Ljava/util/Date;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->type:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->date:Ljava/util/Date;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->productId:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->copy(Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;Ljava/util/Date;Ljava/lang/String;)Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->type:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    return-object v0
.end method

.method public final component2()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->date:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;Ljava/util/Date;Ljava/lang/String;)Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Date;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "date"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;

    invoke-direct {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;-><init>(Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;Ljava/util/Date;Ljava/lang/String;)V

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
    instance-of v1, p1, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;

    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->type:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    iget-object v3, p1, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->type:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->date:Ljava/util/Date;

    iget-object v3, p1, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->date:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->productId:Ljava/lang/String;

    iget-object p1, p1, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->productId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDate()Ljava/util/Date;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->date:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->type:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->type:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->date:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->productId:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->type:Lcom/qonversion/android/sdk/automations/dto/AutomationsEventType;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->date:Ljava/util/Date;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;->productId:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v4, "AutomationsEvent(type="

    .line 10
    .line 11
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v0, ", date="

    .line 18
    .line 19
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, ", productId="

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, ")"

    .line 31
    .line 32
    invoke-static {v3, v2, v0}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method
