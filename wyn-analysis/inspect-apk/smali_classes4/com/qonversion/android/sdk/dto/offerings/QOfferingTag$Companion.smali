.class public final Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag$Companion;",
        "",
        "()V",
        "fromTag",
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;",
        "tag",
        "",
        "(Ljava/lang/Integer;)Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;",
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromTag(Ljava/lang/Integer;)Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;
    .locals 1
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-eqz p1, :cond_2

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-eq p1, v0, :cond_1

    .line 13
    .line 14
    sget-object p1, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->Unknown:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_1
    sget-object p1, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->Main:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_2
    sget-object p1, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->None:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 21
    .line 22
    return-object p1
.end method
