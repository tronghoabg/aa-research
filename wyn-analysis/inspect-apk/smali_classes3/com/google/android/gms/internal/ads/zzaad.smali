.class final synthetic Lcom/google/android/gms/internal/ads/zzaad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaaq;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzaan;

.field private final synthetic zzb:Ljava/lang/String;

.field private final synthetic zzc:[I

.field private final synthetic zzd:Landroid/graphics/Point;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzaan;Ljava/lang/String;[ILandroid/graphics/Point;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaad;->zza:Lcom/google/android/gms/internal/ads/zzaan;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaad;->zzb:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzaad;->zzc:[I

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzaad;->zzd:Landroid/graphics/Point;

    return-void
.end method


# virtual methods
.method public final synthetic zza(ILcom/google/android/gms/internal/ads/zzbg;[I)Ljava/util/List;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    sget v1, Lcom/google/android/gms/internal/ads/zzaaz;->zzb:I

    .line 6
    .line 7
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaad;->zzd:Landroid/graphics/Point;

    .line 8
    .line 9
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaad;->zzc:[I

    .line 10
    .line 11
    aget v8, v2, p1

    .line 12
    .line 13
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzaad;->zza:Lcom/google/android/gms/internal/ads/zzaan;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget v2, v1, Landroid/graphics/Point;->x:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzbl;->zzi:I

    .line 21
    .line 22
    :goto_0
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    iget v1, v5, Lcom/google/android/gms/internal/ads/zzbl;->zzj:I

    .line 28
    .line 29
    :goto_1
    iget-boolean v4, v5, Lcom/google/android/gms/internal/ads/zzbl;->zzl:Z

    .line 30
    .line 31
    const v13, 0x7fffffff

    .line 32
    .line 33
    .line 34
    if-eq v2, v13, :cond_b

    .line 35
    .line 36
    if-ne v1, v13, :cond_2

    .line 37
    .line 38
    move v10, v13

    .line 39
    const/16 v16, 0x1

    .line 40
    .line 41
    const/16 v17, -0x1

    .line 42
    .line 43
    goto/16 :goto_9

    .line 44
    .line 45
    :cond_2
    move v7, v13

    .line 46
    const/4 v6, 0x0

    .line 47
    :goto_2
    iget v9, v3, Lcom/google/android/gms/internal/ads/zzbg;->zza:I

    .line 48
    .line 49
    if-ge v6, v9, :cond_a

    .line 50
    .line 51
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/zzbg;->zza(I)Lcom/google/android/gms/internal/ads/zzv;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    iget v14, v9, Lcom/google/android/gms/internal/ads/zzv;->zzw:I

    .line 56
    .line 57
    if-lez v14, :cond_8

    .line 58
    .line 59
    iget v9, v9, Lcom/google/android/gms/internal/ads/zzv;->zzx:I

    .line 60
    .line 61
    if-lez v9, :cond_8

    .line 62
    .line 63
    if-eqz v4, :cond_5

    .line 64
    .line 65
    if-gt v14, v9, :cond_3

    .line 66
    .line 67
    const/4 v15, 0x0

    .line 68
    goto :goto_3

    .line 69
    :cond_3
    const/4 v15, 0x1

    .line 70
    :goto_3
    if-gt v2, v1, :cond_4

    .line 71
    .line 72
    const/4 v10, 0x0

    .line 73
    :goto_4
    const/16 v16, 0x1

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_4
    const/4 v10, 0x1

    .line 77
    goto :goto_4

    .line 78
    :goto_5
    if-eq v15, v10, :cond_6

    .line 79
    .line 80
    move v15, v1

    .line 81
    move v10, v2

    .line 82
    goto :goto_6

    .line 83
    :cond_5
    const/16 v16, 0x1

    .line 84
    .line 85
    :cond_6
    move v10, v1

    .line 86
    move v15, v2

    .line 87
    :goto_6
    mul-int v12, v14, v10

    .line 88
    .line 89
    const/16 v17, -0x1

    .line 90
    .line 91
    mul-int v11, v9, v15

    .line 92
    .line 93
    if-lt v12, v11, :cond_7

    .line 94
    .line 95
    new-instance v10, Landroid/graphics/Point;

    .line 96
    .line 97
    sget-object v12, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 98
    .line 99
    add-int/2addr v11, v14

    .line 100
    add-int/lit8 v11, v11, -0x1

    .line 101
    .line 102
    div-int/2addr v11, v14

    .line 103
    invoke-direct {v10, v15, v11}, Landroid/graphics/Point;-><init>(II)V

    .line 104
    .line 105
    .line 106
    goto :goto_7

    .line 107
    :cond_7
    new-instance v11, Landroid/graphics/Point;

    .line 108
    .line 109
    sget-object v15, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 110
    .line 111
    add-int/2addr v12, v9

    .line 112
    add-int/lit8 v12, v12, -0x1

    .line 113
    .line 114
    div-int/2addr v12, v9

    .line 115
    invoke-direct {v11, v12, v10}, Landroid/graphics/Point;-><init>(II)V

    .line 116
    .line 117
    .line 118
    move-object v10, v11

    .line 119
    :goto_7
    mul-int v11, v14, v9

    .line 120
    .line 121
    iget v12, v10, Landroid/graphics/Point;->x:I

    .line 122
    .line 123
    int-to-float v12, v12

    .line 124
    const v15, 0x3f7ae148    # 0.98f

    .line 125
    .line 126
    .line 127
    mul-float/2addr v12, v15

    .line 128
    float-to-int v12, v12

    .line 129
    if-lt v14, v12, :cond_9

    .line 130
    .line 131
    iget v10, v10, Landroid/graphics/Point;->y:I

    .line 132
    .line 133
    int-to-float v10, v10

    .line 134
    mul-float/2addr v10, v15

    .line 135
    float-to-int v10, v10

    .line 136
    if-lt v9, v10, :cond_9

    .line 137
    .line 138
    if-ge v11, v7, :cond_9

    .line 139
    .line 140
    move v7, v11

    .line 141
    goto :goto_8

    .line 142
    :cond_8
    const/16 v16, 0x1

    .line 143
    .line 144
    const/16 v17, -0x1

    .line 145
    .line 146
    :cond_9
    :goto_8
    add-int/lit8 v6, v6, 0x1

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_a
    const/16 v16, 0x1

    .line 150
    .line 151
    const/16 v17, -0x1

    .line 152
    .line 153
    move v10, v7

    .line 154
    goto :goto_9

    .line 155
    :cond_b
    const/16 v16, 0x1

    .line 156
    .line 157
    const/16 v17, -0x1

    .line 158
    .line 159
    move v10, v13

    .line 160
    :goto_9
    sget v1, Lcom/google/android/gms/internal/ads/zzgwt;->zzd:I

    .line 161
    .line 162
    new-instance v11, Lcom/google/android/gms/internal/ads/zzgwq;

    .line 163
    .line 164
    invoke-direct {v11}, Lcom/google/android/gms/internal/ads/zzgwq;-><init>()V

    .line 165
    .line 166
    .line 167
    const/4 v4, 0x0

    .line 168
    :goto_a
    iget v1, v3, Lcom/google/android/gms/internal/ads/zzbg;->zza:I

    .line 169
    .line 170
    if-ge v4, v1, :cond_e

    .line 171
    .line 172
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzbg;->zza(I)Lcom/google/android/gms/internal/ads/zzv;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzv;->zzc()I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-eq v10, v13, :cond_d

    .line 181
    .line 182
    move/from16 v12, v17

    .line 183
    .line 184
    if-eq v1, v12, :cond_c

    .line 185
    .line 186
    if-gt v1, v10, :cond_c

    .line 187
    .line 188
    :goto_b
    move/from16 v9, v16

    .line 189
    .line 190
    goto :goto_c

    .line 191
    :cond_c
    const/4 v9, 0x0

    .line 192
    goto :goto_c

    .line 193
    :cond_d
    move/from16 v12, v17

    .line 194
    .line 195
    goto :goto_b

    .line 196
    :goto_c
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzaad;->zzb:Ljava/lang/String;

    .line 197
    .line 198
    new-instance v1, Lcom/google/android/gms/internal/ads/zzaay;

    .line 199
    .line 200
    aget v6, p3, v4

    .line 201
    .line 202
    move/from16 v2, p1

    .line 203
    .line 204
    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/ads/zzaay;-><init>(ILcom/google/android/gms/internal/ads/zzbg;ILcom/google/android/gms/internal/ads/zzaan;ILjava/lang/String;IZ)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v11, v1}, Lcom/google/android/gms/internal/ads/zzgwq;->zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwq;

    .line 208
    .line 209
    .line 210
    add-int/lit8 v4, v4, 0x1

    .line 211
    .line 212
    move-object/from16 v3, p2

    .line 213
    .line 214
    move/from16 v17, v12

    .line 215
    .line 216
    goto :goto_a

    .line 217
    :cond_e
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzgwq;->zzi()Lcom/google/android/gms/internal/ads/zzgwt;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    return-object v1
.end method
