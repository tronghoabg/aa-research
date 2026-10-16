.class final Lcom/google/android/gms/internal/safetynet/zzo;
.super Lcom/google/android/gms/internal/safetynet/zzx;
.source "SourceFile"


# instance fields
.field final synthetic zza:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/safetynet/zzae;Lcom/google/android/gms/common/api/o;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lcom/google/android/gms/internal/safetynet/zzo;->zza:Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/safetynet/zzx;-><init>(Lcom/google/android/gms/common/api/o;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final bridge synthetic doExecute(Lcom/google/android/gms/common/api/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/safetynet/zzaf;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/safetynet/zzx;->zzb:Lcom/google/android/gms/internal/safetynet/zzg;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/safetynet/zzo;->zza:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/f;->getService()Landroid/os/IInterface;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/google/android/gms/internal/safetynet/zzh;

    .line 12
    .line 13
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/safetynet/zzh;->zzj(Lcom/google/android/gms/internal/safetynet/zzg;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
