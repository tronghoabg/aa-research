.class abstract Lcom/google/android/gms/internal/safetynet/zze;
.super Lcom/google/android/gms/common/api/internal/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/common/api/t;",
        ">",
        "Lcom/google/android/gms/common/api/internal/e;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/o;)V
    .locals 1

    .line 1
    sget-object v0, LC7/c;->a:Lcom/google/android/gms/common/api/i;

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/internal/e;-><init>(Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/o;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final bridge synthetic setResult(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/common/api/t;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/t;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
