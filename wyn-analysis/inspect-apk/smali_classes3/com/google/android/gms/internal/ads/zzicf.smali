.class abstract Lcom/google/android/gms/internal/ads/zzicf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field zza:Lcom/google/android/gms/internal/ads/zzicg;

.field zzb:Lcom/google/android/gms/internal/ads/zzicg;

.field zzc:I

.field final synthetic zzd:Lcom/google/android/gms/internal/ads/zzich;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzich;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzicf;->zzd:Lcom/google/android/gms/internal/ads/zzich;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzich;->zzd:Lcom/google/android/gms/internal/ads/zzicg;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzicg;->zzd:Lcom/google/android/gms/internal/ads/zzicg;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzicf;->zza:Lcom/google/android/gms/internal/ads/zzicg;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzicf;->zzb:Lcom/google/android/gms/internal/ads/zzicg;

    .line 17
    .line 18
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzich;->zzc:I

    .line 19
    .line 20
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzicf;->zzc:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzicf;->zzd:Lcom/google/android/gms/internal/ads/zzich;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzicf;->zza:Lcom/google/android/gms/internal/ads/zzicg;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzich;->zzd:Lcom/google/android/gms/internal/ads/zzicg;

    if-eq v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final remove()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzicf;->zzb:Lcom/google/android/gms/internal/ads/zzicg;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzicf;->zzd:Lcom/google/android/gms/internal/ads/zzich;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzich;->zzd(Lcom/google/android/gms/internal/ads/zzicg;Z)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzicf;->zzb:Lcom/google/android/gms/internal/ads/zzicg;

    .line 13
    .line 14
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzich;->zzc:I

    .line 15
    .line 16
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzicf;->zzc:I

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw v0
.end method

.method public final zza()Lcom/google/android/gms/internal/ads/zzicg;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzicf;->zzd:Lcom/google/android/gms/internal/ads/zzich;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzicf;->zza:Lcom/google/android/gms/internal/ads/zzicg;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzich;->zzd:Lcom/google/android/gms/internal/ads/zzicg;

    .line 6
    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzich;->zzc:I

    .line 10
    .line 11
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzicf;->zzc:I

    .line 12
    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzicg;->zzd:Lcom/google/android/gms/internal/ads/zzicg;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzicf;->zza:Lcom/google/android/gms/internal/ads/zzicg;

    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzicf;->zzb:Lcom/google/android/gms/internal/ads/zzicg;

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw v0
.end method
