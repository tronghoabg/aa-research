.class final Lcom/google/android/gms/internal/ads/zzaqg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzahm;

.field private final zzb:Landroid/util/SparseArray;

.field private final zzc:Landroid/util/SparseArray;

.field private final zzd:[B

.field private zze:I

.field private zzf:J

.field private zzg:J

.field private zzh:Z

.field private zzi:J

.field private zzj:J

.field private zzk:Z

.field private zzl:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzahm;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zza:Lcom/google/android/gms/internal/ads/zzahm;

    .line 5
    .line 6
    new-instance p1, Landroid/util/SparseArray;

    .line 7
    .line 8
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzb:Landroid/util/SparseArray;

    .line 12
    .line 13
    new-instance p1, Landroid/util/SparseArray;

    .line 14
    .line 15
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzc:Landroid/util/SparseArray;

    .line 19
    .line 20
    const/16 p1, 0x80

    .line 21
    .line 22
    new-array p1, p1, [B

    .line 23
    .line 24
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzd:[B

    .line 25
    .line 26
    new-instance p2, Lcom/google/android/gms/internal/ads/zzgy;

    .line 27
    .line 28
    const/4 p3, 0x0

    .line 29
    invoke-direct {p2, p1, p3, p3}, Lcom/google/android/gms/internal/ads/zzgy;-><init>([BII)V

    .line 30
    .line 31
    .line 32
    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzh:Z

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzgq;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzb:Landroid/util/SparseArray;

    .line 2
    .line 3
    iget v1, p1, Lcom/google/android/gms/internal/ads/zzgq;->zzd:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzgp;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzc:Landroid/util/SparseArray;

    .line 2
    .line 3
    iget v1, p1, Lcom/google/android/gms/internal/ads/zzgp;->zza:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final zzc()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzh:Z

    return-void
.end method

.method public final zzd(JIJZ)V
    .locals 0

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zze:I

    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzg:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzf:J

    iput-boolean p6, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzl:Z

    return-void
.end method

.method public final zze(JIZ)Z
    .locals 11

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zze:I

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p4, :cond_1

    .line 11
    .line 12
    iget-boolean p4, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzh:Z

    .line 13
    .line 14
    if-eqz p4, :cond_1

    .line 15
    .line 16
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzf:J

    .line 17
    .line 18
    sub-long/2addr p1, v0

    .line 19
    long-to-int p1, p1

    .line 20
    add-int v9, p3, p1

    .line 21
    .line 22
    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzj:J

    .line 23
    .line 24
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    cmp-long p1, v5, p1

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzi:J

    .line 34
    .line 35
    cmp-long p3, v0, p1

    .line 36
    .line 37
    if-eqz p3, :cond_1

    .line 38
    .line 39
    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzk:Z

    .line 40
    .line 41
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zza:Lcom/google/android/gms/internal/ads/zzahm;

    .line 42
    .line 43
    sub-long/2addr v0, p1

    .line 44
    long-to-int v8, v0

    .line 45
    const/4 v10, 0x0

    .line 46
    invoke-interface/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/zzahm;->zze(JIIILcom/google/android/gms/internal/ads/zzahl;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzf:J

    .line 50
    .line 51
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzi:J

    .line 52
    .line 53
    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzg:J

    .line 54
    .line 55
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzj:J

    .line 56
    .line 57
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzk:Z

    .line 58
    .line 59
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzh:Z

    .line 60
    .line 61
    :goto_0
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzl:Z

    .line 62
    .line 63
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzk:Z

    .line 64
    .line 65
    iget p3, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zze:I

    .line 66
    .line 67
    const/4 p4, 0x5

    .line 68
    if-eq p3, p4, :cond_2

    .line 69
    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    if-ne p3, v3, :cond_3

    .line 73
    .line 74
    :cond_2
    move v2, v3

    .line 75
    :cond_3
    or-int p1, p2, v2

    .line 76
    .line 77
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zzk:Z

    .line 78
    .line 79
    const/16 p2, 0x18

    .line 80
    .line 81
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzaqg;->zze:I

    .line 82
    .line 83
    return p1
.end method
