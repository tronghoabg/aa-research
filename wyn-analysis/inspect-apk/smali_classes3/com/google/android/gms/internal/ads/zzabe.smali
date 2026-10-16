.class public final Lcom/google/android/gms/internal/ads/zzabe;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:[I

.field private final zzb:[Lcom/google/android/gms/internal/ads/zzzo;

.field private final zzc:[I

.field private final zzd:[[[I

.field private final zze:Lcom/google/android/gms/internal/ads/zzzo;


# direct methods
.method public constructor <init>([Ljava/lang/String;[I[Lcom/google/android/gms/internal/ads/zzzo;[I[[[ILcom/google/android/gms/internal/ads/zzzo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzabe;->zza:[I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzabe;->zzb:[Lcom/google/android/gms/internal/ads/zzzo;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzabe;->zzd:[[[I

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzabe;->zzc:[I

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzabe;->zze:Lcom/google/android/gms/internal/ads/zzzo;

    return-void
.end method


# virtual methods
.method public final zza(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabe;->zza:[I

    .line 2
    .line 3
    aget p1, v0, p1

    .line 4
    .line 5
    return p1
.end method

.method public final zzb(I)Lcom/google/android/gms/internal/ads/zzzo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabe;->zzb:[Lcom/google/android/gms/internal/ads/zzzo;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
.end method

.method public final zzc(III)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabe;->zzd:[[[I

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    aget-object p1, p1, p2

    .line 6
    .line 7
    aget p1, p1, p3

    .line 8
    .line 9
    return p1
.end method

.method public final zzd(IIZ)I
    .locals 8

    .line 1
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzabe;->zzb:[Lcom/google/android/gms/internal/ads/zzzo;

    .line 2
    .line 3
    aget-object v0, p3, p1

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzzo;->zza(I)Lcom/google/android/gms/internal/ads/zzbg;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzbg;->zza:I

    .line 10
    .line 11
    new-array v1, v0, [I

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v3, v0, :cond_1

    .line 17
    .line 18
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzabe;->zzd:[[[I

    .line 19
    .line 20
    aget-object v5, v5, p1

    .line 21
    .line 22
    aget-object v5, v5, p2

    .line 23
    .line 24
    aget v5, v5, v3

    .line 25
    .line 26
    and-int/lit8 v5, v5, 0x7

    .line 27
    .line 28
    const/4 v6, 0x4

    .line 29
    if-ne v5, v6, :cond_0

    .line 30
    .line 31
    add-int/lit8 v5, v4, 0x1

    .line 32
    .line 33
    aput v3, v1, v4

    .line 34
    .line 35
    move v4, v5

    .line 36
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([II)[I

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/4 v1, 0x0

    .line 44
    const/16 v3, 0x10

    .line 45
    .line 46
    move v4, v2

    .line 47
    move v5, v3

    .line 48
    move v3, v4

    .line 49
    :goto_1
    array-length v6, v0

    .line 50
    if-ge v2, v6, :cond_3

    .line 51
    .line 52
    aget v6, v0, v2

    .line 53
    .line 54
    aget-object v7, p3, p1

    .line 55
    .line 56
    invoke-virtual {v7, p2}, Lcom/google/android/gms/internal/ads/zzzo;->zza(I)Lcom/google/android/gms/internal/ads/zzbg;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/ads/zzbg;->zza(I)Lcom/google/android/gms/internal/ads/zzv;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 65
    .line 66
    add-int/lit8 v7, v4, 0x1

    .line 67
    .line 68
    if-nez v4, :cond_2

    .line 69
    .line 70
    move-object v1, v6

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    invoke-static {v1, v6}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    xor-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    or-int/2addr v3, v4

    .line 79
    :goto_2
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzabe;->zzd:[[[I

    .line 80
    .line 81
    aget-object v4, v4, p1

    .line 82
    .line 83
    aget-object v4, v4, p2

    .line 84
    .line 85
    aget v4, v4, v2

    .line 86
    .line 87
    and-int/lit8 v4, v4, 0x18

    .line 88
    .line 89
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    add-int/lit8 v2, v2, 0x1

    .line 94
    .line 95
    move v4, v7

    .line 96
    goto :goto_1

    .line 97
    :cond_3
    if-eqz v3, :cond_4

    .line 98
    .line 99
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzabe;->zzc:[I

    .line 100
    .line 101
    aget p1, p2, p1

    .line 102
    .line 103
    invoke-static {v5, p1}, Ljava/lang/Math;->min(II)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    return p1

    .line 108
    :cond_4
    return v5
.end method

.method public final zze()Lcom/google/android/gms/internal/ads/zzzo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabe;->zze:Lcom/google/android/gms/internal/ads/zzzo;

    return-object v0
.end method
