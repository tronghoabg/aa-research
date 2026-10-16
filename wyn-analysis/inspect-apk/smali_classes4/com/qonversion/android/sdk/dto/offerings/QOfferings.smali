.class public final Lcom/qonversion/android/sdk/dto/offerings/QOfferings;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J%\u0010\r\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0008\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;",
        "",
        "main",
        "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
        "availableOfferings",
        "",
        "(Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;)V",
        "getAvailableOfferings",
        "()Ljava/util/List;",
        "getMain",
        "()Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "offeringForID",
        "id",
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
.field private final availableOfferings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final main:Lcom/qonversion/android/sdk/dto/offerings/QOffering;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/dto/offerings/QOffering;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            ">;)V"
        }
    .end annotation

    const-string v0, "availableOfferings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->main:Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->availableOfferings:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Lff/v;->a:Lff/v;

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;-><init>(Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/offerings/QOfferings;Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/offerings/QOfferings;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->main:Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->availableOfferings:Ljava/util/List;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->copy(Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;)Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/qonversion/android/sdk/dto/offerings/QOffering;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->main:Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->availableOfferings:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;)Lcom/qonversion/android/sdk/dto/offerings/QOfferings;
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/dto/offerings/QOffering;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            ">;)",
            "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "availableOfferings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    invoke-direct {v0, p1, p2}, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;-><init>(Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    instance-of v0, p1, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-eq p1, p0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->main:Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    .line 8
    .line 9
    check-cast p1, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    .line 10
    .line 11
    iget-object v1, p1, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->main:Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->availableOfferings:Ljava/util/List;

    .line 20
    .line 21
    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->availableOfferings:Ljava/util/List;

    .line 22
    .line 23
    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->equalsIgnoreOrder(Ljava/util/List;Ljava/util/List;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    :cond_0
    const/4 p1, 0x1

    .line 30
    return p1

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    return p1
.end method

.method public final getAvailableOfferings()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->availableOfferings:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMain()Lcom/qonversion/android/sdk/dto/offerings/QOffering;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->main:Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final offeringForID(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/offerings/QOffering;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->availableOfferings:Ljava/util/List;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Iterable;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    move-object v2, v1

    .line 25
    check-cast v2, Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->getOfferingID()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v1, 0x0

    .line 39
    :goto_0
    check-cast v1, Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    .line 40
    .line 41
    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->main:Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->availableOfferings:Ljava/util/List;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "QOfferings(main="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", availableOfferings="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
