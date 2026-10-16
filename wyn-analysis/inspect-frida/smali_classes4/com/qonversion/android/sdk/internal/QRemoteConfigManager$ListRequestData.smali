.class public final Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ListRequestData"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0008\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;",
        "",
        "callback",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
        "contextKeys",
        "",
        "",
        "includeEmptyContextKey",
        "",
        "(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;Ljava/util/List;Z)V",
        "getCallback",
        "()Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
        "getContextKeys",
        "()Ljava/util/List;",
        "getIncludeEmptyContextKey",
        "()Z",
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
.field private final callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final contextKeys:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final includeEmptyContextKey:Z


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;Ljava/util/List;Z)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;->callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;->contextKeys:Ljava/util/List;

    .line 4
    iput-boolean p3, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;->includeEmptyContextKey:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;Ljava/util/List;Z)V

    return-void
.end method


# virtual methods
.method public final getCallback()Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;->callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getContextKeys()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;->contextKeys:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getIncludeEmptyContextKey()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;->includeEmptyContextKey:Z

    .line 2
    .line 3
    return v0
.end method
