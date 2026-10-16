.class final Lcom/google/android/gms/internal/safetynet/zzq;
.super Lcom/google/android/gms/internal/safetynet/zzd;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/safetynet/zzr;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/safetynet/zzr;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/safetynet/zzq;->zza:Lcom/google/android/gms/internal/safetynet/zzr;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/safetynet/zzd;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final zzd(Lcom/google/android/gms/common/api/Status;LC7/h;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/safetynet/zzq;->zza:Lcom/google/android/gms/internal/safetynet/zzr;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/safetynet/zzp;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/safetynet/zzp;-><init>(Lcom/google/android/gms/common/api/Status;LC7/h;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/t;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
