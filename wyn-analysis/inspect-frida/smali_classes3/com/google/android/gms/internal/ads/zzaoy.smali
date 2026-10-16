.class final Lcom/google/android/gms/internal/ads/zzaoy;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:[I

.field private zzb:J

.field private zzc:J

.field private zzd:Z

.field private zze:Z

.field private zzf:[I

.field private zzg:I

.field private zzh:I

.field private zzi:Landroid/graphics/Rect;

.field private zzj:I

.field private zzk:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzb:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzc:J

    const/4 v0, 0x4

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zza:[I

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzj:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzk:I

    return-void
.end method

.method private static zzg([II)I
    .locals 1

    .line 1
    array-length v0, p0

    .line 2
    if-lt p1, v0, :cond_0

    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    :cond_0
    aget p0, p0, p1

    .line 6
    .line 7
    return p0
.end method

.method private static zzh(II)I
    .locals 1

    mul-int/lit8 p1, p1, 0x11

    const v0, 0xffffff

    and-int/2addr p0, v0

    shl-int/lit8 p1, p1, 0x18

    or-int/2addr p0, p1

    return p0
.end method

.method private final zzi(Lcom/google/android/gms/internal/ads/zzet;ZLandroid/graphics/Rect;[I)V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    xor-int/2addr p2, v0

    .line 3
    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    mul-int v2, p2, v1

    .line 8
    .line 9
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    move v4, v3

    .line 15
    :cond_0
    move v6, v0

    .line 16
    move v5, v3

    .line 17
    :goto_1
    const/4 v7, 0x4

    .line 18
    if-ge v5, v6, :cond_2

    .line 19
    .line 20
    const/16 v8, 0x40

    .line 21
    .line 22
    if-gt v6, v8, :cond_2

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzc()I

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    if-ge v8, v7, :cond_1

    .line 29
    .line 30
    const/4 v5, -0x1

    .line 31
    move v6, v5

    .line 32
    move v5, v3

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    shl-int/lit8 v5, v5, 0x4

    .line 35
    .line 36
    invoke-virtual {p1, v7}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    or-int/2addr v5, v7

    .line 41
    shl-int/lit8 v6, v6, 0x2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    and-int/lit8 v6, v5, 0x3

    .line 45
    .line 46
    if-ge v5, v7, :cond_3

    .line 47
    .line 48
    move v5, v1

    .line 49
    goto :goto_2

    .line 50
    :cond_3
    shr-int/lit8 v5, v5, 0x2

    .line 51
    .line 52
    :goto_2
    sub-int v7, v1, v4

    .line 53
    .line 54
    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-lez v5, :cond_4

    .line 59
    .line 60
    add-int v7, v2, v5

    .line 61
    .line 62
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zza:[I

    .line 63
    .line 64
    aget v6, v8, v6

    .line 65
    .line 66
    invoke-static {p4, v2, v7, v6}, Ljava/util/Arrays;->fill([IIII)V

    .line 67
    .line 68
    .line 69
    add-int/2addr v4, v5

    .line 70
    move v2, v7

    .line 71
    :cond_4
    if-lt v4, v1, :cond_0

    .line 72
    .line 73
    add-int/lit8 p2, p2, 0x2

    .line 74
    .line 75
    if-lt p2, p3, :cond_5

    .line 76
    .line 77
    return-void

    .line 78
    :cond_5
    mul-int v2, p2, v1

    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzm()V

    .line 81
    .line 82
    .line 83
    goto :goto_0
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)V
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "\\r?\\n"

    .line 9
    .line 10
    const/4 v2, -0x1

    .line 11
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    array-length v1, p1

    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    if-ge v4, v1, :cond_3

    .line 19
    .line 20
    aget-object v5, p1, v4

    .line 21
    .line 22
    const-string v6, "palette: "

    .line 23
    .line 24
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    const-string v7, "VobsubParser"

    .line 29
    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    const/16 v6, 0x9

    .line 33
    .line 34
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    const-string v6, ","

    .line 39
    .line 40
    invoke-virtual {v5, v6, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    array-length v6, v5

    .line 45
    new-array v6, v6, [I

    .line 46
    .line 47
    iput-object v6, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzf:[I

    .line 48
    .line 49
    move v6, v3

    .line 50
    :goto_1
    array-length v8, v5

    .line 51
    if-ge v6, v8, :cond_2

    .line 52
    .line 53
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzf:[I

    .line 54
    .line 55
    aget-object v9, v5, v6

    .line 56
    .line 57
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    const/16 v10, 0x10

    .line 62
    .line 63
    :try_start_0
    invoke-static {v9, v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 64
    .line 65
    .line 66
    move-result v9
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    goto :goto_2

    .line 68
    :catch_0
    move-exception v9

    .line 69
    const-string v10, "Parsing color failed"

    .line 70
    .line 71
    invoke-static {v7, v10, v9}, Lcom/google/android/gms/internal/ads/zzeh;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    move v9, v3

    .line 75
    :goto_2
    aput v9, v8, v6

    .line 76
    .line 77
    add-int/2addr v6, v0

    .line 78
    goto :goto_1

    .line 79
    :cond_0
    const-string v6, "size: "

    .line 80
    .line 81
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_2

    .line 86
    .line 87
    const/4 v6, 0x6

    .line 88
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    const-string v8, "x"

    .line 97
    .line 98
    invoke-virtual {v6, v8, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    array-length v8, v6

    .line 103
    const/4 v9, 0x2

    .line 104
    if-eq v8, v9, :cond_1

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    new-instance v8, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    add-int/lit8 v6, v6, 0x24

    .line 113
    .line 114
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 115
    .line 116
    .line 117
    const-string v6, "Ignoring malformed IDX size line: \'"

    .line 118
    .line 119
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v5, "\'"

    .line 126
    .line 127
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    invoke-static {v7, v5}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_1
    :try_start_1
    aget-object v5, v6, v3

    .line 139
    .line 140
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    iput v5, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzg:I

    .line 145
    .line 146
    aget-object v5, v6, v0

    .line 147
    .line 148
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    iput v5, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzh:I

    .line 153
    .line 154
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzd:Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :catch_1
    move-exception v5

    .line 158
    const-string v6, "Parsing IDX failed"

    .line 159
    .line 160
    invoke-static {v7, v6, v5}, Lcom/google/android/gms/internal/ads/zzeh;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    :cond_2
    :goto_3
    add-int/2addr v4, v0

    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_3
    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzcy;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzf:[I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzd:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zze:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzi:Landroid/graphics/Rect;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzj:I

    .line 18
    .line 19
    const/4 v2, -0x1

    .line 20
    if-eq v1, v2, :cond_1

    .line 21
    .line 22
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzk:I

    .line 23
    .line 24
    if-eq v1, v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x2

    .line 31
    if-lt v0, v1, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzi:Landroid/graphics/Rect;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-ge v0, v1, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzi:Landroid/graphics/Rect;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    mul-int/2addr v2, v1

    .line 53
    new-array v1, v2, [I

    .line 54
    .line 55
    new-instance v2, Lcom/google/android/gms/internal/ads/zzet;

    .line 56
    .line 57
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzet;-><init>()V

    .line 58
    .line 59
    .line 60
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzj:I

    .line 61
    .line 62
    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzet;->zza(Lcom/google/android/gms/internal/ads/zzeu;)V

    .line 66
    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    invoke-direct {p0, v2, v3, v0, v1}, Lcom/google/android/gms/internal/ads/zzaoy;->zzi(Lcom/google/android/gms/internal/ads/zzet;ZLandroid/graphics/Rect;[I)V

    .line 70
    .line 71
    .line 72
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzk:I

    .line 73
    .line 74
    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzet;->zza(Lcom/google/android/gms/internal/ads/zzeu;)V

    .line 78
    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    invoke-direct {p0, v2, p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzaoy;->zzi(Lcom/google/android/gms/internal/ads/zzet;ZLandroid/graphics/Rect;[I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 93
    .line 94
    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    new-instance v2, Lcom/google/android/gms/internal/ads/zzcx;

    .line 99
    .line 100
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzcx;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzcx;->zzc(Landroid/graphics/Bitmap;)Lcom/google/android/gms/internal/ads/zzcx;

    .line 104
    .line 105
    .line 106
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 107
    .line 108
    int-to-float v1, v1

    .line 109
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzg:I

    .line 110
    .line 111
    int-to-float v3, v3

    .line 112
    div-float/2addr v1, v3

    .line 113
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzcx;->zzi(F)Lcom/google/android/gms/internal/ads/zzcx;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzcx;->zzj(I)Lcom/google/android/gms/internal/ads/zzcx;

    .line 117
    .line 118
    .line 119
    iget v1, v0, Landroid/graphics/Rect;->top:I

    .line 120
    .line 121
    int-to-float v1, v1

    .line 122
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzh:I

    .line 123
    .line 124
    int-to-float v3, v3

    .line 125
    div-float/2addr v1, v3

    .line 126
    invoke-virtual {v2, v1, p1}, Lcom/google/android/gms/internal/ads/zzcx;->zzf(FI)Lcom/google/android/gms/internal/ads/zzcx;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzcx;->zzg(I)Lcom/google/android/gms/internal/ads/zzcx;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    int-to-float p1, p1

    .line 137
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzg:I

    .line 138
    .line 139
    int-to-float v1, v1

    .line 140
    div-float/2addr p1, v1

    .line 141
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzcx;->zzm(F)Lcom/google/android/gms/internal/ads/zzcx;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    int-to-float p1, p1

    .line 149
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzh:I

    .line 150
    .line 151
    int-to-float v0, v0

    .line 152
    div-float/2addr p1, v0

    .line 153
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzcx;->zzn(F)Lcom/google/android/gms/internal/ads/zzcx;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcx;->zzr()Lcom/google/android/gms/internal/ads/zzcy;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    return-object p1

    .line 161
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 162
    return-object p1
.end method

.method public final zzc()V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzb:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzc:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zze:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzi:Landroid/graphics/Rect;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzj:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzk:I

    return-void
.end method

.method public final synthetic zzd(Lcom/google/android/gms/internal/ads/zzeu;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaoy;->zzf:[I

    .line 6
    .line 7
    const-string v3, "VobsubParser"

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    const-string v1, "Skipping SPU (no palette)"

    .line 12
    .line 13
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzaoy;->zzd:Z

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    const-string v1, "Skipping SPU (no plane)"

    .line 22
    .line 23
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    add-int/lit8 v2, v2, -0x2

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    add-int/2addr v4, v2

    .line 38
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    const/4 v5, 0x4

    .line 46
    if-ge v4, v5, :cond_3

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    goto/16 :goto_7

    .line 50
    .line 51
    :cond_3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    mul-int/lit16 v7, v7, 0x2710

    .line 60
    .line 61
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    add-int/2addr v8, v2

    .line 66
    const/4 v9, 0x1

    .line 67
    if-eq v8, v4, :cond_4

    .line 68
    .line 69
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-ge v8, v4, :cond_4

    .line 74
    .line 75
    move v4, v9

    .line 76
    goto :goto_0

    .line 77
    :cond_4
    const/4 v4, 0x0

    .line 78
    :goto_0
    if-eqz v4, :cond_5

    .line 79
    .line 80
    move v10, v8

    .line 81
    goto :goto_1

    .line 82
    :cond_5
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    :goto_1
    :pswitch_0
    move v11, v9

    .line 87
    :goto_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 88
    .line 89
    .line 90
    move-result v12

    .line 91
    if-ge v12, v10, :cond_c

    .line 92
    .line 93
    if-eqz v11, :cond_c

    .line 94
    .line 95
    int-to-long v11, v7

    .line 96
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    const/16 v14, 0xff

    .line 101
    .line 102
    if-eq v13, v14, :cond_b

    .line 103
    .line 104
    const/4 v14, 0x3

    .line 105
    const/4 v15, 0x2

    .line 106
    packed-switch v13, :pswitch_data_0

    .line 107
    .line 108
    .line 109
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v11

    .line 113
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    new-instance v12, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    add-int/lit8 v11, v11, 0x16

    .line 120
    .line 121
    invoke-direct {v12, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 122
    .line 123
    .line 124
    const-string v11, "Unrecognized command: "

    .line 125
    .line 126
    invoke-static {v12, v11, v13, v3}, Lcb/a;->v(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :goto_3
    const/4 v11, 0x0

    .line 130
    goto :goto_2

    .line 131
    :pswitch_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    if-ge v11, v5, :cond_6

    .line 136
    .line 137
    const-string v11, "Incomplete offsets command"

    .line 138
    .line 139
    invoke-static {v3, v11}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_6
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 144
    .line 145
    .line 146
    move-result v11

    .line 147
    iput v11, v0, Lcom/google/android/gms/internal/ads/zzaoy;->zzj:I

    .line 148
    .line 149
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 150
    .line 151
    .line 152
    move-result v11

    .line 153
    iput v11, v0, Lcom/google/android/gms/internal/ads/zzaoy;->zzk:I

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :pswitch_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    const/4 v12, 0x6

    .line 161
    if-ge v11, v12, :cond_7

    .line 162
    .line 163
    const-string v11, "Incomplete area command"

    .line 164
    .line 165
    invoke-static {v3, v11}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_7
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 170
    .line 171
    .line 172
    move-result v11

    .line 173
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 178
    .line 179
    .line 180
    move-result v13

    .line 181
    shl-int/2addr v11, v5

    .line 182
    shr-int/lit8 v14, v12, 0x4

    .line 183
    .line 184
    and-int/lit8 v12, v12, 0xf

    .line 185
    .line 186
    shl-int/lit8 v12, v12, 0x8

    .line 187
    .line 188
    or-int/2addr v12, v13

    .line 189
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 190
    .line 191
    .line 192
    move-result v13

    .line 193
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 194
    .line 195
    .line 196
    move-result v15

    .line 197
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 198
    .line 199
    .line 200
    move-result v16

    .line 201
    shl-int/2addr v13, v5

    .line 202
    shr-int/lit8 v17, v15, 0x4

    .line 203
    .line 204
    and-int/lit8 v15, v15, 0xf

    .line 205
    .line 206
    shl-int/lit8 v15, v15, 0x8

    .line 207
    .line 208
    or-int v15, v15, v16

    .line 209
    .line 210
    add-int/2addr v12, v9

    .line 211
    add-int/2addr v15, v9

    .line 212
    new-instance v5, Landroid/graphics/Rect;

    .line 213
    .line 214
    or-int/2addr v11, v14

    .line 215
    or-int v13, v13, v17

    .line 216
    .line 217
    invoke-direct {v5, v11, v13, v12, v15}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 218
    .line 219
    .line 220
    iput-object v5, v0, Lcom/google/android/gms/internal/ads/zzaoy;->zzi:Landroid/graphics/Rect;

    .line 221
    .line 222
    :goto_4
    move v11, v9

    .line 223
    :goto_5
    const/4 v5, 0x4

    .line 224
    goto/16 :goto_2

    .line 225
    .line 226
    :pswitch_3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    if-ge v5, v15, :cond_8

    .line 231
    .line 232
    const-string v5, "Incomplete alpha command"

    .line 233
    .line 234
    invoke-static {v3, v5}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :goto_6
    const/4 v5, 0x4

    .line 238
    goto :goto_3

    .line 239
    :cond_8
    iget-boolean v5, v0, Lcom/google/android/gms/internal/ads/zzaoy;->zze:Z

    .line 240
    .line 241
    if-nez v5, :cond_9

    .line 242
    .line 243
    const-string v5, "Ignoring alpha command before color command"

    .line 244
    .line 245
    invoke-static {v3, v5}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_9
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 254
    .line 255
    .line 256
    move-result v11

    .line 257
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzaoy;->zza:[I

    .line 258
    .line 259
    aget v13, v12, v14

    .line 260
    .line 261
    const/16 v17, 0x0

    .line 262
    .line 263
    shr-int/lit8 v6, v5, 0x4

    .line 264
    .line 265
    invoke-static {v13, v6}, Lcom/google/android/gms/internal/ads/zzaoy;->zzh(II)I

    .line 266
    .line 267
    .line 268
    move-result v6

    .line 269
    aput v6, v12, v14

    .line 270
    .line 271
    aget v6, v12, v15

    .line 272
    .line 273
    and-int/lit8 v5, v5, 0xf

    .line 274
    .line 275
    invoke-static {v6, v5}, Lcom/google/android/gms/internal/ads/zzaoy;->zzh(II)I

    .line 276
    .line 277
    .line 278
    move-result v5

    .line 279
    aput v5, v12, v15

    .line 280
    .line 281
    aget v5, v12, v9

    .line 282
    .line 283
    shr-int/lit8 v6, v11, 0x4

    .line 284
    .line 285
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/ads/zzaoy;->zzh(II)I

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    aput v5, v12, v9

    .line 290
    .line 291
    aget v5, v12, v17

    .line 292
    .line 293
    and-int/lit8 v6, v11, 0xf

    .line 294
    .line 295
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/ads/zzaoy;->zzh(II)I

    .line 296
    .line 297
    .line 298
    move-result v5

    .line 299
    aput v5, v12, v17

    .line 300
    .line 301
    goto :goto_4

    .line 302
    :pswitch_4
    const/16 v17, 0x0

    .line 303
    .line 304
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 305
    .line 306
    .line 307
    move-result v5

    .line 308
    if-ge v5, v15, :cond_a

    .line 309
    .line 310
    const-string v5, "Incomplete color command"

    .line 311
    .line 312
    invoke-static {v3, v5}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    move/from16 v11, v17

    .line 316
    .line 317
    goto :goto_5

    .line 318
    :cond_a
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 323
    .line 324
    .line 325
    move-result v6

    .line 326
    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzaoy;->zza:[I

    .line 327
    .line 328
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzaoy;->zzf:[I

    .line 329
    .line 330
    shr-int/lit8 v13, v5, 0x4

    .line 331
    .line 332
    invoke-static {v12, v13}, Lcom/google/android/gms/internal/ads/zzaoy;->zzg([II)I

    .line 333
    .line 334
    .line 335
    move-result v12

    .line 336
    aput v12, v11, v14

    .line 337
    .line 338
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzaoy;->zzf:[I

    .line 339
    .line 340
    and-int/lit8 v5, v5, 0xf

    .line 341
    .line 342
    invoke-static {v12, v5}, Lcom/google/android/gms/internal/ads/zzaoy;->zzg([II)I

    .line 343
    .line 344
    .line 345
    move-result v5

    .line 346
    aput v5, v11, v15

    .line 347
    .line 348
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzaoy;->zzf:[I

    .line 349
    .line 350
    shr-int/lit8 v12, v6, 0x4

    .line 351
    .line 352
    invoke-static {v5, v12}, Lcom/google/android/gms/internal/ads/zzaoy;->zzg([II)I

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    aput v5, v11, v9

    .line 357
    .line 358
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzaoy;->zzf:[I

    .line 359
    .line 360
    and-int/lit8 v6, v6, 0xf

    .line 361
    .line 362
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/ads/zzaoy;->zzg([II)I

    .line 363
    .line 364
    .line 365
    move-result v5

    .line 366
    aput v5, v11, v17

    .line 367
    .line 368
    iput-boolean v9, v0, Lcom/google/android/gms/internal/ads/zzaoy;->zze:Z

    .line 369
    .line 370
    goto/16 :goto_4

    .line 371
    .line 372
    :pswitch_5
    const/16 v17, 0x0

    .line 373
    .line 374
    iput-wide v11, v0, Lcom/google/android/gms/internal/ads/zzaoy;->zzc:J

    .line 375
    .line 376
    goto/16 :goto_4

    .line 377
    .line 378
    :pswitch_6
    const/16 v17, 0x0

    .line 379
    .line 380
    iput-wide v11, v0, Lcom/google/android/gms/internal/ads/zzaoy;->zzb:J

    .line 381
    .line 382
    goto/16 :goto_4

    .line 383
    .line 384
    :cond_b
    const/16 v17, 0x0

    .line 385
    .line 386
    move/from16 v11, v17

    .line 387
    .line 388
    goto/16 :goto_2

    .line 389
    .line 390
    :cond_c
    if-eqz v4, :cond_d

    .line 391
    .line 392
    invoke-virtual {v1, v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 393
    .line 394
    .line 395
    :cond_d
    move v6, v4

    .line 396
    :goto_7
    if-nez v6, :cond_2

    .line 397
    .line 398
    return-void

    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final synthetic zze()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzb:J

    return-wide v0
.end method

.method public final synthetic zzf()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaoy;->zzc:J

    return-wide v0
.end method
