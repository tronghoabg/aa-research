.class final Lcom/google/android/gms/internal/safetynet/zzaa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/t;


# instance fields
.field private final zza:Lcom/google/android/gms/common/api/Status;

.field private final zzb:LC7/i;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;LC7/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/safetynet/zzaa;->zza:Lcom/google/android/gms/common/api/Status;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/safetynet/zzaa;->zzb:LC7/i;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getHarmfulAppsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LC7/a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/safetynet/zzaa;->zzb:LC7/i;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, v0, LC7/i;->b:[LC7/a;

    .line 9
    .line 10
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public final getHoursSinceLastScanWithHarmfulApp()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/safetynet/zzaa;->zzb:LC7/i;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget v0, v0, LC7/i;->c:I

    return v0
.end method

.method public final getLastScanTimeMs()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/safetynet/zzaa;->zzb:LC7/i;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget-wide v0, v0, LC7/i;->a:J

    return-wide v0
.end method

.method public final getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/safetynet/zzaa;->zza:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
