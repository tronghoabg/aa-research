.class final Lcom/google/android/gms/internal/safetynet/zzk;
.super Lcom/google/android/gms/internal/safetynet/zzz;
.source "SourceFile"


# instance fields
.field final synthetic zza:[I

.field final synthetic zzb:I

.field final synthetic zzc:Ljava/lang/String;

.field final synthetic zzd:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/o;[IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/safetynet/zzk;->zza:[I

    .line 2
    .line 3
    iput p3, p0, Lcom/google/android/gms/internal/safetynet/zzk;->zzb:I

    .line 4
    .line 5
    iput-object p4, p0, Lcom/google/android/gms/internal/safetynet/zzk;->zzc:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p5, p0, Lcom/google/android/gms/internal/safetynet/zzk;->zzd:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/safetynet/zzz;-><init>(Lcom/google/android/gms/common/api/o;)V

    .line 10
    .line 11
    .line 12
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
    new-instance v2, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/google/android/gms/internal/safetynet/zzk;->zza:[I

    .line 10
    .line 11
    array-length v1, p1

    .line 12
    const/4 v3, 0x0

    .line 13
    :goto_0
    if-ge v3, v1, :cond_0

    .line 14
    .line 15
    aget v4, p1, v3

    .line 16
    .line 17
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/safetynet/zzz;->zze:Lcom/google/android/gms/internal/safetynet/zzg;

    .line 28
    .line 29
    iget v3, p0, Lcom/google/android/gms/internal/safetynet/zzk;->zzb:I

    .line 30
    .line 31
    iget-object v4, p0, Lcom/google/android/gms/internal/safetynet/zzk;->zzc:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v5, p0, Lcom/google/android/gms/internal/safetynet/zzk;->zzd:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/safetynet/zzaf;->zzq(Lcom/google/android/gms/internal/safetynet/zzg;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
