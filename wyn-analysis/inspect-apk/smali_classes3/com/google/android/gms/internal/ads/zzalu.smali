.class final Lcom/google/android/gms/internal/ads/zzalu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzahd;


# instance fields
.field private final zza:Landroid/util/SparseArray;

.field private final zzb:Landroid/util/SparseArray;

.field private final zzc:J

.field private final zzd:J

.field private final zze:I


# direct methods
.method public synthetic constructor <init>(Landroid/util/SparseArray;Landroid/util/SparseArray;JJI[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzalu;->zza:Landroid/util/SparseArray;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzalu;->zzb:Landroid/util/SparseArray;

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzalu;->zzc:J

    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/zzalu;->zzd:J

    iput p7, p0, Lcom/google/android/gms/internal/ads/zzalu;->zze:I

    return-void
.end method


# virtual methods
.method public final zza()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzalu;->zzc:J

    return-wide v0
.end method

.method public final zzb()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final zzc(J)Lcom/google/android/gms/internal/ads/zzahb;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzalu;->zza:Landroid/util/SparseArray;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzalu;->zze:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, [J

    .line 10
    .line 11
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzalu;->zzb:Landroid/util/SparseArray;

    .line 12
    .line 13
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, [J

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    if-nez v4, :cond_2

    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, [J

    .line 29
    .line 30
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    move-object v4, v1

    .line 35
    check-cast v4, [J

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    if-nez v4, :cond_2

    .line 40
    .line 41
    :cond_1
    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    move-object v2, v0

    .line 46
    check-cast v2, [J

    .line 47
    .line 48
    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    move-object v4, v0

    .line 53
    check-cast v4, [J

    .line 54
    .line 55
    :cond_2
    array-length v0, v2

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    aget-wide v0, v2, v5

    .line 59
    .line 60
    cmp-long v0, p1, v0

    .line 61
    .line 62
    if-gez v0, :cond_3

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    const/4 v0, 0x1

    .line 66
    invoke-static {v2, p1, p2, v0, v0}, Lcom/google/android/gms/internal/ads/zzfm;->zzo([JJZZ)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    new-instance p2, Lcom/google/android/gms/internal/ads/zzahb;

    .line 71
    .line 72
    new-instance v0, Lcom/google/android/gms/internal/ads/zzahe;

    .line 73
    .line 74
    aget-wide v1, v2, p1

    .line 75
    .line 76
    aget-wide v3, v4, p1

    .line 77
    .line 78
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzahe;-><init>(JJ)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p2, v0, v0}, Lcom/google/android/gms/internal/ads/zzahb;-><init>(Lcom/google/android/gms/internal/ads/zzahe;Lcom/google/android/gms/internal/ads/zzahe;)V

    .line 82
    .line 83
    .line 84
    return-object p2

    .line 85
    :cond_4
    :goto_0
    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/zzalu;->zzd:J

    .line 86
    .line 87
    new-instance v0, Lcom/google/android/gms/internal/ads/zzahb;

    .line 88
    .line 89
    new-instance v1, Lcom/google/android/gms/internal/ads/zzahe;

    .line 90
    .line 91
    const-wide/16 v2, 0x0

    .line 92
    .line 93
    invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/internal/ads/zzahe;-><init>(JJ)V

    .line 94
    .line 95
    .line 96
    invoke-direct {v0, v1, v1}, Lcom/google/android/gms/internal/ads/zzahb;-><init>(Lcom/google/android/gms/internal/ads/zzahe;Lcom/google/android/gms/internal/ads/zzahe;)V

    .line 97
    .line 98
    .line 99
    return-object v0
.end method

.method public final synthetic zzj()Z
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/h;->a(Lcom/google/android/gms/internal/ads/zzahd;)Z

    move-result v0

    return v0
.end method
