.class public final Lcom/qonversion/android/sdk/internal/QonversionInternal$checkTrialIntroEligibility$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QonversionInternal;->checkTrialIntroEligibility(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "com/qonversion/android/sdk/internal/QonversionInternal$checkTrialIntroEligibility$1",
        "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
        "",
        "",
        "Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;",
        "eligibilities",
        "Lef/C;",
        "onSuccess",
        "(Ljava/util/Map;)V",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "error",
        "onError",
        "(Lcom/qonversion/android/sdk/dto/QonversionError;)V",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$checkTrialIntroEligibility$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/dto/QonversionError;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$checkTrialIntroEligibility$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onSuccess(Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "eligibilities"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$checkTrialIntroEligibility$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;->onSuccess(Ljava/util/Map;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
