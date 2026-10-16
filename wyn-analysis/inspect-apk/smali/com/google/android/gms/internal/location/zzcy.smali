.class abstract Lcom/google/android/gms/internal/location/zzcy;
.super Lcom/google/android/gms/common/api/internal/e;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/o;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/location/zzbi;->zzb:Lcom/google/android/gms/common/api/i;

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/internal/e;-><init>(Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/o;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/t;
    .locals 2

    .line 1
    new-instance v0, Lx7/r;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lx7/r;-><init>(Lcom/google/android/gms/common/api/Status;Lx7/s;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

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
