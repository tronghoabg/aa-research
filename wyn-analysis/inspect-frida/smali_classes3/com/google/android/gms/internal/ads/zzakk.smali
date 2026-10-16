.class final Lcom/google/android/gms/internal/ads/zzakk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzahd;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzafo;

.field private final zzb:Landroid/util/SparseArray;

.field private final zzc:J

.field private final zzd:I


# direct methods
.method public constructor <init>(Landroid/util/SparseArray;JIJJ)V
    .locals 12

    .line 1
    move/from16 v2, p4

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakk;->zzb:Landroid/util/SparseArray;

    .line 7
    .line 8
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzakk;->zzc:J

    .line 9
    .line 10
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzakk;->zzd:I

    .line 11
    .line 12
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/util/List;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz p1, :cond_5

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    new-array v3, v2, [I

    .line 34
    .line 35
    new-array v4, v2, [J

    .line 36
    .line 37
    new-array v5, v2, [J

    .line 38
    .line 39
    new-array v6, v2, [J

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    move v8, v7

    .line 43
    :goto_0
    if-ge v8, v2, :cond_1

    .line 44
    .line 45
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    check-cast v9, Lcom/google/android/gms/internal/ads/zzakj;

    .line 50
    .line 51
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzakj;->zza()J

    .line 52
    .line 53
    .line 54
    move-result-wide v10

    .line 55
    aput-wide v10, v6, v8

    .line 56
    .line 57
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzakj;->zzb()J

    .line 58
    .line 59
    .line 60
    move-result-wide v9

    .line 61
    aput-wide v9, v4, v8

    .line 62
    .line 63
    add-int/lit8 v8, v8, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    :goto_1
    add-int/lit8 p1, v2, -0x1

    .line 67
    .line 68
    if-ge v7, p1, :cond_2

    .line 69
    .line 70
    add-int/lit8 p1, v7, 0x1

    .line 71
    .line 72
    aget-wide v8, v4, p1

    .line 73
    .line 74
    aget-wide v10, v4, v7

    .line 75
    .line 76
    sub-long/2addr v8, v10

    .line 77
    long-to-int v8, v8

    .line 78
    aput v8, v3, v7

    .line 79
    .line 80
    aget-wide v8, v6, p1

    .line 81
    .line 82
    aget-wide v10, v6, v7

    .line 83
    .line 84
    sub-long/2addr v8, v10

    .line 85
    aput-wide v8, v5, v7

    .line 86
    .line 87
    move v7, p1

    .line 88
    goto :goto_1

    .line 89
    :cond_2
    move v2, p1

    .line 90
    :goto_2
    if-lez v2, :cond_3

    .line 91
    .line 92
    aget-wide v7, v6, v2

    .line 93
    .line 94
    cmp-long v7, v7, p2

    .line 95
    .line 96
    if-ltz v7, :cond_3

    .line 97
    .line 98
    add-int/lit8 v2, v2, -0x1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    add-long v7, p5, p7

    .line 102
    .line 103
    aget-wide v9, v4, v2

    .line 104
    .line 105
    sub-long/2addr v7, v9

    .line 106
    long-to-int v7, v7

    .line 107
    aput v7, v3, v2

    .line 108
    .line 109
    aget-wide v7, v6, v2

    .line 110
    .line 111
    sub-long v0, p2, v7

    .line 112
    .line 113
    aput-wide v0, v5, v2

    .line 114
    .line 115
    if-ge v2, p1, :cond_4

    .line 116
    .line 117
    const-string p1, "MatroskaExtractor"

    .line 118
    .line 119
    const-string v0, "Discarding trailing cue points with timestamps greater than total duration."

    .line 120
    .line 121
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    add-int/lit8 v2, v2, 0x1

    .line 125
    .line 126
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([II)[I

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-static {v5, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-static {v6, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    :cond_4
    new-instance v2, Lcom/google/android/gms/internal/ads/zzafo;

    .line 143
    .line 144
    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/internal/ads/zzafo;-><init>([I[J[J[J)V

    .line 145
    .line 146
    .line 147
    :cond_5
    :goto_3
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzakk;->zza:Lcom/google/android/gms/internal/ads/zzafo;

    .line 148
    .line 149
    return-void
.end method


# virtual methods
.method public final zza()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzakk;->zzc:J

    return-wide v0
.end method

.method public final zzb()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzakk;->zzb:Landroid/util/SparseArray;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzakk;->zzd:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/List;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public final zzc(J)Lcom/google/android/gms/internal/ads/zzahb;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzakk;->zza:Lcom/google/android/gms/internal/ads/zzafo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzafo;->zzc(J)Lcom/google/android/gms/internal/ads/zzahb;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zzahb;

    .line 11
    .line 12
    sget-object p2, Lcom/google/android/gms/internal/ads/zzahe;->zza:Lcom/google/android/gms/internal/ads/zzahe;

    .line 13
    .line 14
    invoke-direct {p1, p2, p2}, Lcom/google/android/gms/internal/ads/zzahb;-><init>(Lcom/google/android/gms/internal/ads/zzahe;Lcom/google/android/gms/internal/ads/zzahe;)V

    .line 15
    .line 16
    .line 17
    return-object p1
.end method

.method public final synthetic zzj()Z
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/h;->a(Lcom/google/android/gms/internal/ads/zzahd;)Z

    move-result v0

    return v0
.end method
