.class public final Lcom/qonversion/android/sdk/internal/dto/QOfferingTagAdapter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0003\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/QOfferingTagAdapter;",
        "",
        "()V",
        "fromJson",
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;",
        "tag",
        "",
        "(Ljava/lang/Integer;)Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;",
        "toJson",
        "enum",
        "(Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;)Ljava/lang/Integer;",
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

.method private final toJson(Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;)Ljava/lang/Integer;
    .locals 0
    .annotation runtime Lhb/Q;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->getTag()Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method


# virtual methods
.method public final fromJson(Ljava/lang/Integer;)Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;
    .locals 1
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lhb/n;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->Companion:Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag$Companion;->fromTag(Ljava/lang/Integer;)Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
