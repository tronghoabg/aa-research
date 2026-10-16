.class final Lcom/google/android/gms/internal/safetynet/zzab;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/t;


# instance fields
.field private final zza:Lcom/google/android/gms/common/api/Status;

.field private final zzb:LC7/j;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;LC7/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/safetynet/zzab;->zza:Lcom/google/android/gms/common/api/Status;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/safetynet/zzab;->zzb:LC7/j;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/safetynet/zzab;->zza:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public final getTokenResult()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/safetynet/zzab;->zzb:LC7/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v0, v0, LC7/j;->a:Ljava/lang/String;

    .line 8
    .line 9
    return-object v0
.end method
