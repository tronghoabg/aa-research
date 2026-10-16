.class public final Lcom/qonversion/android/sdk/internal/dto/QProductRenewStateAdapter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0004H\u0003\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/QProductRenewStateAdapter;",
        "",
        "()V",
        "fromJson",
        "Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;",
        "type",
        "",
        "toJson",
        "enum",
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

.method private final toJson(Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;)I
    .locals 0
    .annotation runtime Lhb/Q;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;->getType()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method


# virtual methods
.method public final fromJson(I)Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;
    .locals 1
    .annotation runtime Lhb/n;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;->Companion:Lcom/qonversion/android/sdk/internal/dto/QProductRenewState$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/dto/QProductRenewState$Companion;->fromType(I)Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
