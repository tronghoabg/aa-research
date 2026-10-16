.class public final Lcom/qonversion/android/sdk/internal/dto/QOfferingsAdapter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0018\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0003\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/QOfferingsAdapter;",
        "",
        "()V",
        "fromJson",
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;",
        "offerings",
        "",
        "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
        "toJson",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final toJson(Lcom/qonversion/android/sdk/dto/offerings/QOfferings;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;",
            ")",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            ">;"
        }
    .end annotation

    .annotation runtime Lhb/Q;
    .end annotation

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->getAvailableOfferings()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-object p1

    .line 11
    :cond_1
    :goto_0
    sget-object p1, Lff/v;->a:Lff/v;

    .line 12
    .line 13
    return-object p1
.end method


# virtual methods
.method public final fromJson(Ljava/util/List;)Lcom/qonversion/android/sdk/dto/offerings/QOfferings;
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            ">;)",
            "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;"
        }
    .end annotation

    .annotation runtime Lhb/n;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "offerings"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    move-object v0, p1

    .line 15
    check-cast v0, Ljava/lang/Iterable;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    move-object v3, v2

    .line 32
    check-cast v3, Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    .line 33
    .line 34
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->getTag()Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    sget-object v4, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->Main:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 39
    .line 40
    if-ne v3, v4, :cond_1

    .line 41
    .line 42
    move-object v1, v2

    .line 43
    :cond_2
    check-cast v1, Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    .line 44
    .line 45
    new-instance v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    .line 46
    .line 47
    invoke-direct {v0, v1, p1}, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;-><init>(Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method
