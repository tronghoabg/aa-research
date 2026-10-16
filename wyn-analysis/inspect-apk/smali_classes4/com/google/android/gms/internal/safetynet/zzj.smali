.class final Lcom/google/android/gms/internal/safetynet/zzj;
.super Lcom/google/android/gms/internal/safetynet/zzz;
.source "SourceFile"


# instance fields
.field final synthetic zza:Ljava/util/List;

.field final synthetic zzb:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/safetynet/zzae;Lcom/google/android/gms/common/api/o;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lcom/google/android/gms/internal/safetynet/zzj;->zza:Ljava/util/List;

    .line 2
    .line 3
    iput-object p4, p0, Lcom/google/android/gms/internal/safetynet/zzj;->zzb:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/safetynet/zzz;-><init>(Lcom/google/android/gms/common/api/o;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge synthetic doExecute(Lcom/google/android/gms/common/api/b;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/safetynet/zzaf;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/google/android/gms/internal/safetynet/zzz;->zze:Lcom/google/android/gms/internal/safetynet/zzg;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/google/android/gms/internal/safetynet/zzj;->zza:Ljava/util/List;

    .line 7
    .line 8
    iget-object v4, p0, Lcom/google/android/gms/internal/safetynet/zzj;->zzb:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/safetynet/zzaf;->zzq(Lcom/google/android/gms/internal/safetynet/zzg;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
