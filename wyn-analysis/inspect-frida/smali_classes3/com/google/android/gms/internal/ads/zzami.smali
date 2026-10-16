.class public final Lcom/google/android/gms/internal/ads/zzami;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaga;


# static fields
.field public static final synthetic zza:I


# instance fields
.field private zzA:Z

.field private zzB:I

.field private zzC:I

.field private zzD:J

.field private zzE:Lcom/google/android/gms/internal/ads/zzagd;

.field private zzF:[Lcom/google/android/gms/internal/ads/zzamh;

.field private zzG:[[J

.field private zzH:I

.field private final zzb:Lcom/google/android/gms/internal/ads/zzanq;

.field private final zzc:I

.field private final zzd:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zze:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzh:Ljava/util/ArrayDeque;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzamm;

.field private final zzj:Ljava/util/List;

.field private final zzk:Ljava/util/List;

.field private final zzl:Ljava/util/List;

.field private zzm:Lcom/google/android/gms/internal/ads/zzgwt;

.field private zzn:I

.field private zzo:I

.field private zzp:J

.field private zzq:I

.field private zzr:Lcom/google/android/gms/internal/ads/zzeu;

.field private zzs:I

.field private zzt:I

.field private zzu:I

.field private zzv:I

.field private zzw:Z

.field private zzx:Z

.field private zzy:Z

.field private zzz:J


# direct methods
.method public constructor <init>()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzanq;->zza:Lcom/google/android/gms/internal/ads/zzanq;

    const/16 v1, 0x10

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzami;-><init>(Lcom/google/android/gms/internal/ads/zzanq;I)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzanq;I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzb:Lcom/google/android/gms/internal/ads/zzanq;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzami;->zzc:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgwt;->zzi()Lcom/google/android/gms/internal/ads/zzgwt;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzm:Lcom/google/android/gms/internal/ads/zzgwt;

    and-int/lit8 p1, p2, 0x4

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzn:I

    .line 3
    new-instance p1, Lcom/google/android/gms/internal/ads/zzamm;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzamm;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzi:Lcom/google/android/gms/internal/ads/zzamm;

    new-instance p1, Ljava/util/ArrayList;

    .line 4
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzj:Ljava/util/List;

    .line 5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzg:Lcom/google/android/gms/internal/ads/zzeu;

    new-instance p1, Ljava/util/ArrayDeque;

    .line 6
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzh:Ljava/util/ArrayDeque;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    .line 7
    sget-object v0, Lcom/google/android/gms/internal/ads/zzgr;->zza:[B

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzeu;-><init>([B)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzd:Lcom/google/android/gms/internal/ads/zzeu;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    const/4 v0, 0x6

    .line 8
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zze:Lcom/google/android/gms/internal/ads/zzeu;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    .line 9
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzf:Lcom/google/android/gms/internal/ads/zzeu;

    const/4 p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzs:I

    sget-object p1, Lcom/google/android/gms/internal/ads/zzagd;->zza:Lcom/google/android/gms/internal/ads/zzagd;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzE:Lcom/google/android/gms/internal/ads/zzagd;

    new-array p1, p2, [Lcom/google/android/gms/internal/ads/zzamh;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzF:[Lcom/google/android/gms/internal/ads/zzamh;

    new-instance p1, Ljava/util/ArrayList;

    .line 10
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzk:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzl:Ljava/util/List;

    return-void
.end method

.method public static synthetic zzh(Lcom/google/android/gms/internal/ads/zzams;JJ)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzami;->zzl(Lcom/google/android/gms/internal/ads/zzams;J)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, -0x1

    .line 6
    if-ne p1, p2, :cond_0

    .line 7
    .line 8
    return-wide p3

    .line 9
    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzams;->zzc:[J

    .line 10
    .line 11
    aget-wide p1, p0, p1

    .line 12
    .line 13
    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->min(JJ)J

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    return-wide p0
.end method

.method public static synthetic zzi(Lcom/google/android/gms/internal/ads/zzams;J)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzami;->zzl(Lcom/google/android/gms/internal/ads/zzams;J)I

    move-result p0

    return p0
.end method

.method private final zzj()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzami;->zzn:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzami;->zzq:I

    return-void
.end method

.method private final zzk(J)V
    .locals 45
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v4, 0x0

    .line 6
    :goto_0
    const/4 v5, 0x1

    .line 7
    :goto_1
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzami;->zzh:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v7

    .line 13
    if-nez v7, :cond_37

    .line 14
    .line 15
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    check-cast v7, Lcom/google/android/gms/internal/ads/zzfz;

    .line 20
    .line 21
    iget-wide v7, v7, Lcom/google/android/gms/internal/ads/zzfz;->zza:J

    .line 22
    .line 23
    cmp-long v7, v7, p1

    .line 24
    .line 25
    if-nez v7, :cond_37

    .line 26
    .line 27
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    move-object v8, v7

    .line 32
    check-cast v8, Lcom/google/android/gms/internal/ads/zzfz;

    .line 33
    .line 34
    iget v7, v8, Lcom/google/android/gms/internal/ads/zzgb;->zzd:I

    .line 35
    .line 36
    const v9, 0x6d6f6f76

    .line 37
    .line 38
    .line 39
    if-ne v7, v9, :cond_36

    .line 40
    .line 41
    const v7, 0x6d657461

    .line 42
    .line 43
    .line 44
    invoke-virtual {v8, v7}, Lcom/google/android/gms/internal/ads/zzfz;->zzd(I)Lcom/google/android/gms/internal/ads/zzfz;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    new-instance v9, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    const-wide/16 v17, 0x0

    .line 54
    .line 55
    const/16 v19, 0x0

    .line 56
    .line 57
    if-eqz v7, :cond_a

    .line 58
    .line 59
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzalo;->zze(Lcom/google/android/gms/internal/ads/zzfz;)Lcom/google/android/gms/internal/ads/zzap;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/zzami;->zzA:Z

    .line 64
    .line 65
    const-class v11, Lcom/google/android/gms/internal/ads/zzfx;

    .line 66
    .line 67
    if-eqz v10, :cond_6

    .line 68
    .line 69
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sget-object v9, Lcom/google/android/gms/internal/ads/zzamb;->zza:Lcom/google/android/gms/internal/ads/zzamb;

    .line 73
    .line 74
    invoke-virtual {v7, v11, v9}, Lcom/google/android/gms/internal/ads/zzap;->zzc(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgts;)Lcom/google/android/gms/internal/ads/zzao;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    check-cast v9, Lcom/google/android/gms/internal/ads/zzfx;

    .line 79
    .line 80
    if-eqz v9, :cond_0

    .line 81
    .line 82
    iget-object v9, v9, Lcom/google/android/gms/internal/ads/zzfx;->zzb:[B

    .line 83
    .line 84
    aget-byte v9, v9, v4

    .line 85
    .line 86
    if-nez v9, :cond_0

    .line 87
    .line 88
    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/zzami;->zzz:J

    .line 89
    .line 90
    const-wide/16 v12, 0x10

    .line 91
    .line 92
    add-long/2addr v9, v12

    .line 93
    iput-wide v9, v0, Lcom/google/android/gms/internal/ads/zzami;->zzD:J

    .line 94
    .line 95
    :cond_0
    sget-object v9, Lcom/google/android/gms/internal/ads/zzamc;->zza:Lcom/google/android/gms/internal/ads/zzamc;

    .line 96
    .line 97
    invoke-virtual {v7, v11, v9}, Lcom/google/android/gms/internal/ads/zzap;->zzc(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgts;)Lcom/google/android/gms/internal/ads/zzao;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    check-cast v9, Lcom/google/android/gms/internal/ads/zzfx;

    .line 102
    .line 103
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzfx;->zzb()Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    new-instance v10, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 113
    .line 114
    .line 115
    move-result v11

    .line 116
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 117
    .line 118
    .line 119
    move v11, v4

    .line 120
    :goto_2
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    move-result v12

    .line 124
    if-ge v11, v12, :cond_5

    .line 125
    .line 126
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v12

    .line 130
    check-cast v12, Ljava/lang/Integer;

    .line 131
    .line 132
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 133
    .line 134
    .line 135
    move-result v12

    .line 136
    if-eqz v12, :cond_4

    .line 137
    .line 138
    if-eq v12, v5, :cond_3

    .line 139
    .line 140
    if-eq v12, v2, :cond_2

    .line 141
    .line 142
    if-eq v12, v1, :cond_1

    .line 143
    .line 144
    move v12, v4

    .line 145
    goto :goto_3

    .line 146
    :cond_1
    const/4 v12, 0x4

    .line 147
    goto :goto_3

    .line 148
    :cond_2
    move v12, v1

    .line 149
    goto :goto_3

    .line 150
    :cond_3
    move v12, v2

    .line 151
    goto :goto_3

    .line 152
    :cond_4
    move v12, v5

    .line 153
    :goto_3
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object v12

    .line 157
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    add-int/2addr v11, v5

    .line 161
    goto :goto_2

    .line 162
    :cond_5
    move-object v9, v10

    .line 163
    goto :goto_4

    .line 164
    :cond_6
    if-eqz v7, :cond_b

    .line 165
    .line 166
    iget v10, v0, Lcom/google/android/gms/internal/ads/zzami;->zzc:I

    .line 167
    .line 168
    and-int/lit8 v10, v10, 0x40

    .line 169
    .line 170
    if-nez v10, :cond_7

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_7
    sget-object v10, Lcom/google/android/gms/internal/ads/zzama;->zza:Lcom/google/android/gms/internal/ads/zzama;

    .line 174
    .line 175
    invoke-virtual {v7, v11, v10}, Lcom/google/android/gms/internal/ads/zzap;->zzc(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgts;)Lcom/google/android/gms/internal/ads/zzao;

    .line 176
    .line 177
    .line 178
    move-result-object v10

    .line 179
    check-cast v10, Lcom/google/android/gms/internal/ads/zzfx;

    .line 180
    .line 181
    if-nez v10, :cond_8

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_8
    new-instance v11, Lcom/google/android/gms/internal/ads/zzeu;

    .line 185
    .line 186
    iget-object v10, v10, Lcom/google/android/gms/internal/ads/zzfx;->zzb:[B

    .line 187
    .line 188
    invoke-direct {v11, v10}, Lcom/google/android/gms/internal/ads/zzeu;-><init>([B)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzeu;->zzJ()J

    .line 192
    .line 193
    .line 194
    move-result-wide v10

    .line 195
    cmp-long v12, v10, v17

    .line 196
    .line 197
    if-gtz v12, :cond_9

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_9
    iput-wide v10, v0, Lcom/google/android/gms/internal/ads/zzami;->zzz:J

    .line 201
    .line 202
    iput-boolean v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzy:Z

    .line 203
    .line 204
    move/from16 v25, v1

    .line 205
    .line 206
    move/from16 v21, v4

    .line 207
    .line 208
    move-object/from16 v32, v6

    .line 209
    .line 210
    goto/16 :goto_27

    .line 211
    .line 212
    :cond_a
    move-object/from16 v7, v19

    .line 213
    .line 214
    :cond_b
    :goto_4
    new-instance v10, Ljava/util/ArrayList;

    .line 215
    .line 216
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 217
    .line 218
    .line 219
    iget v11, v0, Lcom/google/android/gms/internal/ads/zzami;->zzH:I

    .line 220
    .line 221
    move-object v12, v9

    .line 222
    new-instance v9, Lcom/google/android/gms/internal/ads/zzagt;

    .line 223
    .line 224
    invoke-direct {v9}, Lcom/google/android/gms/internal/ads/zzagt;-><init>()V

    .line 225
    .line 226
    .line 227
    const v13, 0x75647461

    .line 228
    .line 229
    .line 230
    invoke-virtual {v8, v13}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    .line 231
    .line 232
    .line 233
    move-result-object v13

    .line 234
    if-eqz v13, :cond_c

    .line 235
    .line 236
    invoke-static {v13}, Lcom/google/android/gms/internal/ads/zzalo;->zzc(Lcom/google/android/gms/internal/ads/zzga;)Lcom/google/android/gms/internal/ads/zzap;

    .line 237
    .line 238
    .line 239
    move-result-object v13

    .line 240
    invoke-virtual {v9, v13}, Lcom/google/android/gms/internal/ads/zzagt;->zza(Lcom/google/android/gms/internal/ads/zzap;)Z

    .line 241
    .line 242
    .line 243
    move-object/from16 v20, v13

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_c
    move-object/from16 v20, v19

    .line 247
    .line 248
    :goto_5
    new-instance v13, Lcom/google/android/gms/internal/ads/zzap;

    .line 249
    .line 250
    const v14, 0x6d766864

    .line 251
    .line 252
    .line 253
    invoke-virtual {v8, v14}, Lcom/google/android/gms/internal/ads/zzfz;->zzc(I)Lcom/google/android/gms/internal/ads/zzga;

    .line 254
    .line 255
    .line 256
    move-result-object v14

    .line 257
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    if-eq v5, v11, :cond_d

    .line 261
    .line 262
    move v11, v4

    .line 263
    goto :goto_6

    .line 264
    :cond_d
    move v11, v5

    .line 265
    :goto_6
    iget-object v14, v14, Lcom/google/android/gms/internal/ads/zzga;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 266
    .line 267
    invoke-static {v14}, Lcom/google/android/gms/internal/ads/zzalo;->zzd(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzgd;

    .line 268
    .line 269
    .line 270
    move-result-object v14

    .line 271
    new-array v15, v5, [Lcom/google/android/gms/internal/ads/zzao;

    .line 272
    .line 273
    aput-object v14, v15, v4

    .line 274
    .line 275
    move/from16 v21, v4

    .line 276
    .line 277
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    invoke-direct {v13, v3, v4, v15}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V

    .line 283
    .line 284
    .line 285
    iget v14, v0, Lcom/google/android/gms/internal/ads/zzami;->zzc:I

    .line 286
    .line 287
    and-int/lit8 v15, v14, 0x1

    .line 288
    .line 289
    if-eq v5, v15, :cond_e

    .line 290
    .line 291
    move-object v15, v13

    .line 292
    move/from16 v13, v21

    .line 293
    .line 294
    goto :goto_7

    .line 295
    :cond_e
    move-object v15, v13

    .line 296
    move v13, v5

    .line 297
    :goto_7
    sget-object v16, Lcom/google/android/gms/internal/ads/zzamf;->zza:Lcom/google/android/gms/internal/ads/zzamf;

    .line 298
    .line 299
    move-object/from16 v22, v15

    .line 300
    .line 301
    move-object/from16 v15, v16

    .line 302
    .line 303
    const/16 v16, 0x0

    .line 304
    .line 305
    move-object/from16 v23, v10

    .line 306
    .line 307
    move/from16 v24, v14

    .line 308
    .line 309
    move v14, v11

    .line 310
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    move-object/from16 v25, v12

    .line 316
    .line 317
    const/4 v12, 0x0

    .line 318
    move-object/from16 v26, v25

    .line 319
    .line 320
    invoke-static/range {v8 .. v16}, Lcom/google/android/gms/internal/ads/zzalo;->zzb(Lcom/google/android/gms/internal/ads/zzfz;Lcom/google/android/gms/internal/ads/zzagt;JLcom/google/android/gms/internal/ads/zzq;ZZLcom/google/android/gms/internal/ads/zzgti;Z)Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    iget-boolean v10, v0, Lcom/google/android/gms/internal/ads/zzami;->zzA:Z

    .line 325
    .line 326
    if-eqz v10, :cond_10

    .line 327
    .line 328
    invoke-interface/range {v26 .. v26}, Ljava/util/List;->size()I

    .line 329
    .line 330
    .line 331
    move-result v10

    .line 332
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 333
    .line 334
    .line 335
    move-result v11

    .line 336
    if-ne v10, v11, :cond_f

    .line 337
    .line 338
    move v10, v5

    .line 339
    goto :goto_8

    .line 340
    :cond_f
    move/from16 v10, v21

    .line 341
    .line 342
    :goto_8
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 343
    .line 344
    invoke-interface/range {v26 .. v26}, Ljava/util/List;->size()I

    .line 345
    .line 346
    .line 347
    move-result v11

    .line 348
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 349
    .line 350
    .line 351
    move-result v12

    .line 352
    const-string v13, "The number of auxiliary track types from metadata ("

    .line 353
    .line 354
    const-string v14, ") is not same as the number of auxiliary tracks ("

    .line 355
    .line 356
    const-string v15, ")"

    .line 357
    .line 358
    invoke-static {v13, v11, v14, v12, v15}, LN0/a;->e(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v11

    .line 362
    invoke-static {v10, v11}, Lcom/google/android/gms/internal/ads/zzgtr;->zzj(ZLjava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    :cond_10
    new-instance v10, Ljava/util/ArrayList;

    .line 366
    .line 367
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 368
    .line 369
    .line 370
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 371
    .line 372
    .line 373
    move-result-object v11

    .line 374
    :cond_11
    :goto_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 375
    .line 376
    .line 377
    move-result v12

    .line 378
    const/4 v13, -0x1

    .line 379
    if-eqz v12, :cond_12

    .line 380
    .line 381
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v12

    .line 385
    check-cast v12, Lcom/google/android/gms/internal/ads/zzams;

    .line 386
    .line 387
    iget-object v12, v12, Lcom/google/android/gms/internal/ads/zzams;->zza:Lcom/google/android/gms/internal/ads/zzamp;

    .line 388
    .line 389
    iget v12, v12, Lcom/google/android/gms/internal/ads/zzamp;->zzl:I

    .line 390
    .line 391
    if-eq v12, v13, :cond_11

    .line 392
    .line 393
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 394
    .line 395
    .line 396
    move-result-object v12

    .line 397
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v13

    .line 401
    if-nez v13, :cond_11

    .line 402
    .line 403
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    goto :goto_9

    .line 407
    :cond_12
    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzami;->zzk:Ljava/util/List;

    .line 408
    .line 409
    invoke-interface {v11}, Ljava/util/List;->clear()V

    .line 410
    .line 411
    .line 412
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 413
    .line 414
    .line 415
    move-result-object v12

    .line 416
    :cond_13
    :goto_a
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 417
    .line 418
    .line 419
    move-result v14

    .line 420
    if-eqz v14, :cond_14

    .line 421
    .line 422
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v14

    .line 426
    check-cast v14, Lcom/google/android/gms/internal/ads/zzams;

    .line 427
    .line 428
    iget-object v15, v14, Lcom/google/android/gms/internal/ads/zzams;->zza:Lcom/google/android/gms/internal/ads/zzamp;

    .line 429
    .line 430
    iget v15, v15, Lcom/google/android/gms/internal/ads/zzamp;->zza:I

    .line 431
    .line 432
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 433
    .line 434
    .line 435
    move-result-object v15

    .line 436
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v15

    .line 440
    if-eqz v15, :cond_13

    .line 441
    .line 442
    invoke-interface {v11, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    goto :goto_a

    .line 446
    :cond_14
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzalz;->zza(Ljava/util/List;)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v10

    .line 450
    move/from16 v25, v1

    .line 451
    .line 452
    move-wide/from16 v27, v3

    .line 453
    .line 454
    move v1, v13

    .line 455
    move/from16 v12, v21

    .line 456
    .line 457
    move v14, v12

    .line 458
    :goto_b
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 459
    .line 460
    .line 461
    move-result v15

    .line 462
    if-ge v12, v15, :cond_2d

    .line 463
    .line 464
    invoke-interface {v8, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v15

    .line 468
    check-cast v15, Lcom/google/android/gms/internal/ads/zzams;

    .line 469
    .line 470
    move/from16 v16, v5

    .line 471
    .line 472
    iget v5, v15, Lcom/google/android/gms/internal/ads/zzams;->zzb:I

    .line 473
    .line 474
    if-nez v5, :cond_15

    .line 475
    .line 476
    goto :goto_c

    .line 477
    :cond_15
    iget-object v13, v15, Lcom/google/android/gms/internal/ads/zzams;->zza:Lcom/google/android/gms/internal/ads/zzamp;

    .line 478
    .line 479
    iget-boolean v2, v13, Lcom/google/android/gms/internal/ads/zzamp;->zzm:Z

    .line 480
    .line 481
    if-nez v2, :cond_16

    .line 482
    .line 483
    :goto_c
    move v2, v1

    .line 484
    move-object/from16 v32, v6

    .line 485
    .line 486
    move-object/from16 v36, v8

    .line 487
    .line 488
    move-object v1, v10

    .line 489
    move-object/from16 v33, v11

    .line 490
    .line 491
    move/from16 v39, v12

    .line 492
    .line 493
    move-object/from16 v5, v23

    .line 494
    .line 495
    move-wide/from16 v10, v27

    .line 496
    .line 497
    const/4 v8, -0x1

    .line 498
    goto/16 :goto_22

    .line 499
    .line 500
    :cond_16
    new-instance v2, Lcom/google/android/gms/internal/ads/zzamh;

    .line 501
    .line 502
    move/from16 v30, v5

    .line 503
    .line 504
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzE:Lcom/google/android/gms/internal/ads/zzagd;

    .line 505
    .line 506
    add-int/lit8 v31, v14, 0x1

    .line 507
    .line 508
    move-object/from16 v32, v6

    .line 509
    .line 510
    iget v6, v13, Lcom/google/android/gms/internal/ads/zzamp;->zzb:I

    .line 511
    .line 512
    invoke-interface {v5, v14, v6}, Lcom/google/android/gms/internal/ads/zzagd;->zzs(II)Lcom/google/android/gms/internal/ads/zzahm;

    .line 513
    .line 514
    .line 515
    move-result-object v5

    .line 516
    invoke-direct {v2, v13, v15, v5}, Lcom/google/android/gms/internal/ads/zzamh;-><init>(Lcom/google/android/gms/internal/ads/zzamp;Lcom/google/android/gms/internal/ads/zzams;Lcom/google/android/gms/internal/ads/zzahm;)V

    .line 517
    .line 518
    .line 519
    move-object v14, v10

    .line 520
    move-object v5, v11

    .line 521
    iget-wide v10, v13, Lcom/google/android/gms/internal/ads/zzamp;->zze:J

    .line 522
    .line 523
    cmp-long v33, v10, v27

    .line 524
    .line 525
    if-nez v33, :cond_17

    .line 526
    .line 527
    iget-wide v10, v15, Lcom/google/android/gms/internal/ads/zzams;->zzi:J

    .line 528
    .line 529
    :cond_17
    move-object/from16 v33, v5

    .line 530
    .line 531
    iget-object v5, v2, Lcom/google/android/gms/internal/ads/zzamh;->zzc:Lcom/google/android/gms/internal/ads/zzahm;

    .line 532
    .line 533
    invoke-interface {v5, v10, v11}, Lcom/google/android/gms/internal/ads/zzahm;->zzP(J)V

    .line 534
    .line 535
    .line 536
    invoke-static {v3, v4, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 537
    .line 538
    .line 539
    move-result-wide v3

    .line 540
    move-wide/from16 v34, v3

    .line 541
    .line 542
    iget-object v3, v13, Lcom/google/android/gms/internal/ads/zzamp;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    .line 543
    .line 544
    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 545
    .line 546
    move-object/from16 v36, v8

    .line 547
    .line 548
    const-string v8, "audio/true-hd"

    .line 549
    .line 550
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    move-result v8

    .line 554
    if-eqz v8, :cond_18

    .line 555
    .line 556
    iget v8, v15, Lcom/google/android/gms/internal/ads/zzams;->zze:I

    .line 557
    .line 558
    mul-int/lit8 v8, v8, 0x10

    .line 559
    .line 560
    :goto_d
    move-object/from16 v37, v14

    .line 561
    .line 562
    goto :goto_e

    .line 563
    :cond_18
    iget v8, v15, Lcom/google/android/gms/internal/ads/zzams;->zze:I

    .line 564
    .line 565
    add-int/lit8 v8, v8, 0x1e

    .line 566
    .line 567
    goto :goto_d

    .line 568
    :goto_e
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 569
    .line 570
    .line 571
    move-result-object v14

    .line 572
    invoke-virtual {v14, v8}, Lcom/google/android/gms/internal/ads/zzt;->zzp(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 573
    .line 574
    .line 575
    const/4 v8, 0x2

    .line 576
    if-ne v6, v8, :cond_1c

    .line 577
    .line 578
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzv;->zzf:I

    .line 579
    .line 580
    and-int/lit8 v8, v24, 0x8

    .line 581
    .line 582
    if-eqz v8, :cond_1a

    .line 583
    .line 584
    const/4 v8, -0x1

    .line 585
    if-ne v1, v8, :cond_19

    .line 586
    .line 587
    move/from16 v8, v16

    .line 588
    .line 589
    goto :goto_f

    .line 590
    :cond_19
    const/4 v8, 0x2

    .line 591
    :goto_f
    or-int/2addr v6, v8

    .line 592
    :cond_1a
    iget-boolean v8, v0, Lcom/google/android/gms/internal/ads/zzami;->zzA:Z

    .line 593
    .line 594
    if-eqz v8, :cond_1b

    .line 595
    .line 596
    const v8, 0x8000

    .line 597
    .line 598
    .line 599
    or-int/2addr v6, v8

    .line 600
    move-object/from16 v8, v26

    .line 601
    .line 602
    invoke-interface {v8, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v26

    .line 606
    check-cast v26, Ljava/lang/Integer;

    .line 607
    .line 608
    move/from16 v38, v6

    .line 609
    .line 610
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Integer;->intValue()I

    .line 611
    .line 612
    .line 613
    move-result v6

    .line 614
    invoke-virtual {v14, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzh(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 615
    .line 616
    .line 617
    move/from16 v6, v38

    .line 618
    .line 619
    goto :goto_10

    .line 620
    :cond_1b
    move-object/from16 v8, v26

    .line 621
    .line 622
    :goto_10
    invoke-virtual {v14, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzg(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 623
    .line 624
    .line 625
    const/4 v6, 0x2

    .line 626
    goto :goto_11

    .line 627
    :cond_1c
    move-object/from16 v8, v26

    .line 628
    .line 629
    :goto_11
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzas;->zzb(Ljava/lang/String;)Z

    .line 630
    .line 631
    .line 632
    move-result v26

    .line 633
    if-nez v26, :cond_1d

    .line 634
    .line 635
    move-object/from16 v30, v2

    .line 636
    .line 637
    move-object/from16 v26, v8

    .line 638
    .line 639
    move/from16 v39, v12

    .line 640
    .line 641
    move v12, v1

    .line 642
    :goto_12
    move-wide/from16 v1, v27

    .line 643
    .line 644
    goto/16 :goto_18

    .line 645
    .line 646
    :cond_1d
    move-object/from16 v26, v8

    .line 647
    .line 648
    iget-boolean v8, v15, Lcom/google/android/gms/internal/ads/zzams;->zzj:Z

    .line 649
    .line 650
    move/from16 v38, v8

    .line 651
    .line 652
    if-nez v8, :cond_1e

    .line 653
    .line 654
    iget-object v8, v15, Lcom/google/android/gms/internal/ads/zzams;->zzh:[I

    .line 655
    .line 656
    array-length v8, v8

    .line 657
    goto :goto_13

    .line 658
    :cond_1e
    move/from16 v8, v30

    .line 659
    .line 660
    :goto_13
    cmp-long v30, v10, v27

    .line 661
    .line 662
    move/from16 v39, v12

    .line 663
    .line 664
    const/16 v12, 0x14

    .line 665
    .line 666
    invoke-static {v8, v12}, Ljava/lang/Math;->min(II)I

    .line 667
    .line 668
    .line 669
    move-result v8

    .line 670
    if-eqz v30, :cond_1f

    .line 671
    .line 672
    move/from16 v12, v16

    .line 673
    .line 674
    goto :goto_14

    .line 675
    :cond_1f
    move/from16 v12, v21

    .line 676
    .line 677
    :goto_14
    invoke-static {v12}, Lcom/google/android/gms/internal/ads/zzgtr;->zzi(Z)V

    .line 678
    .line 679
    .line 680
    move v12, v1

    .line 681
    move-object/from16 v30, v2

    .line 682
    .line 683
    const-wide/32 v1, 0x989680

    .line 684
    .line 685
    .line 686
    invoke-static {v10, v11, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 687
    .line 688
    .line 689
    move-result-wide v1

    .line 690
    move-wide/from16 v40, v1

    .line 691
    .line 692
    move/from16 v10, v21

    .line 693
    .line 694
    move v11, v10

    .line 695
    const/4 v1, -0x1

    .line 696
    :goto_15
    if-ge v10, v8, :cond_21

    .line 697
    .line 698
    if-eqz v38, :cond_20

    .line 699
    .line 700
    move/from16 v42, v10

    .line 701
    .line 702
    goto :goto_16

    .line 703
    :cond_20
    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zzams;->zzh:[I

    .line 704
    .line 705
    aget v2, v2, v10

    .line 706
    .line 707
    move/from16 v42, v2

    .line 708
    .line 709
    :goto_16
    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zzams;->zzf:[J

    .line 710
    .line 711
    aget-wide v43, v2, v42

    .line 712
    .line 713
    cmp-long v2, v43, v40

    .line 714
    .line 715
    if-lez v2, :cond_22

    .line 716
    .line 717
    :cond_21
    const/4 v8, -0x1

    .line 718
    goto :goto_17

    .line 719
    :cond_22
    cmp-long v2, v43, v17

    .line 720
    .line 721
    if-ltz v2, :cond_23

    .line 722
    .line 723
    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zzams;->zzd:[I

    .line 724
    .line 725
    aget v2, v2, v42

    .line 726
    .line 727
    if-le v2, v11, :cond_23

    .line 728
    .line 729
    move v11, v2

    .line 730
    move/from16 v1, v42

    .line 731
    .line 732
    :cond_23
    add-int/lit8 v10, v10, 0x1

    .line 733
    .line 734
    goto :goto_15

    .line 735
    :goto_17
    if-ne v1, v8, :cond_24

    .line 736
    .line 737
    goto :goto_12

    .line 738
    :cond_24
    iget-object v2, v15, Lcom/google/android/gms/internal/ads/zzams;->zzf:[J

    .line 739
    .line 740
    aget-wide v1, v2, v1

    .line 741
    .line 742
    :goto_18
    cmp-long v8, v1, v27

    .line 743
    .line 744
    if-eqz v8, :cond_25

    .line 745
    .line 746
    new-instance v8, Lcom/google/android/gms/internal/ads/zzap;

    .line 747
    .line 748
    new-instance v10, Lcom/google/android/gms/internal/ads/zzajd;

    .line 749
    .line 750
    invoke-direct {v10, v1, v2}, Lcom/google/android/gms/internal/ads/zzajd;-><init>(J)V

    .line 751
    .line 752
    .line 753
    move/from16 v1, v16

    .line 754
    .line 755
    new-array v2, v1, [Lcom/google/android/gms/internal/ads/zzao;

    .line 756
    .line 757
    aput-object v10, v2, v21

    .line 758
    .line 759
    move-wide/from16 v10, v27

    .line 760
    .line 761
    invoke-direct {v8, v10, v11, v2}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V

    .line 762
    .line 763
    .line 764
    goto :goto_19

    .line 765
    :cond_25
    move-wide/from16 v10, v27

    .line 766
    .line 767
    move-object/from16 v8, v19

    .line 768
    .line 769
    :goto_19
    invoke-static {v6, v9, v14}, Lcom/google/android/gms/internal/ads/zzaly;->zzb(ILcom/google/android/gms/internal/ads/zzagt;Lcom/google/android/gms/internal/ads/zzt;)V

    .line 770
    .line 771
    .line 772
    iget-object v1, v3, Lcom/google/android/gms/internal/ads/zzv;->zzl:Lcom/google/android/gms/internal/ads/zzap;

    .line 773
    .line 774
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzj:Ljava/util/List;

    .line 775
    .line 776
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 777
    .line 778
    .line 779
    move-result v3

    .line 780
    if-eqz v3, :cond_26

    .line 781
    .line 782
    move-object/from16 v3, v19

    .line 783
    .line 784
    :goto_1a
    const/4 v2, 0x4

    .line 785
    goto :goto_1b

    .line 786
    :cond_26
    new-instance v3, Lcom/google/android/gms/internal/ads/zzap;

    .line 787
    .line 788
    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/ads/zzap;-><init>(Ljava/util/List;)V

    .line 789
    .line 790
    .line 791
    goto :goto_1a

    .line 792
    :goto_1b
    new-array v15, v2, [Lcom/google/android/gms/internal/ads/zzap;

    .line 793
    .line 794
    aput-object v3, v15, v21

    .line 795
    .line 796
    const/16 v16, 0x1

    .line 797
    .line 798
    aput-object v20, v15, v16

    .line 799
    .line 800
    const/16 v29, 0x2

    .line 801
    .line 802
    aput-object v22, v15, v29

    .line 803
    .line 804
    aput-object v8, v15, v25

    .line 805
    .line 806
    invoke-static {v6, v7, v14, v1, v15}, Lcom/google/android/gms/internal/ads/zzaly;->zza(ILcom/google/android/gms/internal/ads/zzap;Lcom/google/android/gms/internal/ads/zzt;Lcom/google/android/gms/internal/ads/zzap;[Lcom/google/android/gms/internal/ads/zzap;)V

    .line 807
    .line 808
    .line 809
    move-object/from16 v1, v37

    .line 810
    .line 811
    invoke-virtual {v14, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzn(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 815
    .line 816
    .line 817
    move-result-object v2

    .line 818
    const-string v3, "audio/mpeg"

    .line 819
    .line 820
    invoke-static {v4, v3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    move-result v3

    .line 824
    iget v4, v13, Lcom/google/android/gms/internal/ads/zzamp;->zzl:I

    .line 825
    .line 826
    const/4 v8, -0x1

    .line 827
    if-eq v4, v8, :cond_28

    .line 828
    .line 829
    invoke-interface/range {v33 .. v33}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 830
    .line 831
    .line 832
    move-result-object v8

    .line 833
    :cond_27
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 834
    .line 835
    .line 836
    move-result v13

    .line 837
    if-eqz v13, :cond_28

    .line 838
    .line 839
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v13

    .line 843
    check-cast v13, Lcom/google/android/gms/internal/ads/zzams;

    .line 844
    .line 845
    iget-object v13, v13, Lcom/google/android/gms/internal/ads/zzams;->zza:Lcom/google/android/gms/internal/ads/zzamp;

    .line 846
    .line 847
    iget v13, v13, Lcom/google/android/gms/internal/ads/zzamp;->zza:I

    .line 848
    .line 849
    if-ne v13, v4, :cond_27

    .line 850
    .line 851
    const/4 v4, 0x1

    .line 852
    goto :goto_1c

    .line 853
    :cond_28
    move/from16 v4, v21

    .line 854
    .line 855
    :goto_1c
    if-nez v3, :cond_29

    .line 856
    .line 857
    if-eqz v4, :cond_2a

    .line 858
    .line 859
    :cond_29
    move-object/from16 v3, v30

    .line 860
    .line 861
    goto :goto_1e

    .line 862
    :cond_2a
    invoke-interface {v5, v2}, Lcom/google/android/gms/internal/ads/zzahm;->zzA(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 863
    .line 864
    .line 865
    move-object/from16 v3, v30

    .line 866
    .line 867
    :goto_1d
    const/4 v8, 0x2

    .line 868
    goto :goto_1f

    .line 869
    :goto_1e
    iput-object v2, v3, Lcom/google/android/gms/internal/ads/zzamh;->zzf:Lcom/google/android/gms/internal/ads/zzv;

    .line 870
    .line 871
    goto :goto_1d

    .line 872
    :goto_1f
    if-ne v6, v8, :cond_2b

    .line 873
    .line 874
    const/4 v8, -0x1

    .line 875
    if-ne v12, v8, :cond_2c

    .line 876
    .line 877
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->size()I

    .line 878
    .line 879
    .line 880
    move-result v2

    .line 881
    :goto_20
    move-object/from16 v5, v23

    .line 882
    .line 883
    goto :goto_21

    .line 884
    :cond_2b
    const/4 v8, -0x1

    .line 885
    :cond_2c
    move v2, v12

    .line 886
    goto :goto_20

    .line 887
    :goto_21
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 888
    .line 889
    .line 890
    move/from16 v14, v31

    .line 891
    .line 892
    move-wide/from16 v3, v34

    .line 893
    .line 894
    const/16 v16, 0x1

    .line 895
    .line 896
    :goto_22
    add-int/lit8 v12, v39, 0x1

    .line 897
    .line 898
    move-object/from16 v23, v5

    .line 899
    .line 900
    move v13, v8

    .line 901
    move-wide/from16 v27, v10

    .line 902
    .line 903
    move-object/from16 v6, v32

    .line 904
    .line 905
    move-object/from16 v11, v33

    .line 906
    .line 907
    move-object/from16 v8, v36

    .line 908
    .line 909
    const/4 v5, 0x1

    .line 910
    move-object v10, v1

    .line 911
    move v1, v2

    .line 912
    const/4 v2, 0x2

    .line 913
    goto/16 :goto_b

    .line 914
    .line 915
    :cond_2d
    move v12, v1

    .line 916
    move-object/from16 v32, v6

    .line 917
    .line 918
    move v8, v13

    .line 919
    move/from16 v2, v21

    .line 920
    .line 921
    move-object/from16 v5, v23

    .line 922
    .line 923
    new-array v1, v2, [Lcom/google/android/gms/internal/ads/zzamh;

    .line 924
    .line 925
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    move-result-object v1

    .line 929
    check-cast v1, [Lcom/google/android/gms/internal/ads/zzamh;

    .line 930
    .line 931
    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzami;->zzF:[Lcom/google/android/gms/internal/ads/zzamh;

    .line 932
    .line 933
    array-length v2, v1

    .line 934
    new-array v5, v2, [[J

    .line 935
    .line 936
    new-array v6, v2, [I

    .line 937
    .line 938
    new-array v7, v2, [J

    .line 939
    .line 940
    new-array v2, v2, [Z

    .line 941
    .line 942
    const/4 v9, 0x0

    .line 943
    :goto_23
    array-length v10, v1

    .line 944
    if-ge v9, v10, :cond_2e

    .line 945
    .line 946
    aget-object v10, v1, v9

    .line 947
    .line 948
    iget-object v10, v10, Lcom/google/android/gms/internal/ads/zzamh;->zzb:Lcom/google/android/gms/internal/ads/zzams;

    .line 949
    .line 950
    iget v10, v10, Lcom/google/android/gms/internal/ads/zzams;->zzb:I

    .line 951
    .line 952
    new-array v10, v10, [J

    .line 953
    .line 954
    aput-object v10, v5, v9

    .line 955
    .line 956
    aget-object v10, v1, v9

    .line 957
    .line 958
    iget-object v10, v10, Lcom/google/android/gms/internal/ads/zzamh;->zzb:Lcom/google/android/gms/internal/ads/zzams;

    .line 959
    .line 960
    iget-object v10, v10, Lcom/google/android/gms/internal/ads/zzams;->zzf:[J

    .line 961
    .line 962
    const/16 v21, 0x0

    .line 963
    .line 964
    aget-wide v13, v10, v21

    .line 965
    .line 966
    aput-wide v13, v7, v9

    .line 967
    .line 968
    const/16 v16, 0x1

    .line 969
    .line 970
    add-int/lit8 v9, v9, 0x1

    .line 971
    .line 972
    goto :goto_23

    .line 973
    :cond_2e
    const/16 v21, 0x0

    .line 974
    .line 975
    move/from16 v9, v21

    .line 976
    .line 977
    :goto_24
    array-length v10, v1

    .line 978
    if-ge v9, v10, :cond_32

    .line 979
    .line 980
    const-wide v10, 0x7fffffffffffffffL

    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    move-wide v13, v10

    .line 986
    move/from16 v10, v21

    .line 987
    .line 988
    move v11, v8

    .line 989
    :goto_25
    array-length v15, v1

    .line 990
    if-ge v10, v15, :cond_30

    .line 991
    .line 992
    aget-boolean v15, v2, v10

    .line 993
    .line 994
    if-nez v15, :cond_2f

    .line 995
    .line 996
    aget-wide v19, v7, v10

    .line 997
    .line 998
    cmp-long v15, v19, v13

    .line 999
    .line 1000
    if-gtz v15, :cond_2f

    .line 1001
    .line 1002
    move v11, v10

    .line 1003
    move-wide/from16 v13, v19

    .line 1004
    .line 1005
    :cond_2f
    const/16 v16, 0x1

    .line 1006
    .line 1007
    add-int/lit8 v10, v10, 0x1

    .line 1008
    .line 1009
    goto :goto_25

    .line 1010
    :cond_30
    const/16 v16, 0x1

    .line 1011
    .line 1012
    aget v10, v6, v11

    .line 1013
    .line 1014
    aget-object v13, v5, v11

    .line 1015
    .line 1016
    aput-wide v17, v13, v10

    .line 1017
    .line 1018
    aget-object v14, v1, v11

    .line 1019
    .line 1020
    iget-object v14, v14, Lcom/google/android/gms/internal/ads/zzamh;->zzb:Lcom/google/android/gms/internal/ads/zzams;

    .line 1021
    .line 1022
    iget-object v15, v14, Lcom/google/android/gms/internal/ads/zzams;->zzd:[I

    .line 1023
    .line 1024
    aget v15, v15, v10

    .line 1025
    .line 1026
    move/from16 v19, v9

    .line 1027
    .line 1028
    int-to-long v8, v15

    .line 1029
    add-long v17, v17, v8

    .line 1030
    .line 1031
    add-int/lit8 v10, v10, 0x1

    .line 1032
    .line 1033
    aput v10, v6, v11

    .line 1034
    .line 1035
    array-length v8, v13

    .line 1036
    if-ge v10, v8, :cond_31

    .line 1037
    .line 1038
    iget-object v8, v14, Lcom/google/android/gms/internal/ads/zzams;->zzf:[J

    .line 1039
    .line 1040
    aget-wide v9, v8, v10

    .line 1041
    .line 1042
    aput-wide v9, v7, v11

    .line 1043
    .line 1044
    move/from16 v9, v19

    .line 1045
    .line 1046
    :goto_26
    const/4 v8, -0x1

    .line 1047
    goto :goto_24

    .line 1048
    :cond_31
    aput-boolean v16, v2, v11

    .line 1049
    .line 1050
    add-int/lit8 v9, v19, 0x1

    .line 1051
    .line 1052
    goto :goto_26

    .line 1053
    :cond_32
    iput-object v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzG:[[J

    .line 1054
    .line 1055
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzami;->zzE:Lcom/google/android/gms/internal/ads/zzagd;

    .line 1056
    .line 1057
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagd;->zzv()V

    .line 1058
    .line 1059
    .line 1060
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzami;->zzE:Lcom/google/android/gms/internal/ads/zzagd;

    .line 1061
    .line 1062
    new-instance v2, Lcom/google/android/gms/internal/ads/zzamg;

    .line 1063
    .line 1064
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzF:[Lcom/google/android/gms/internal/ads/zzamh;

    .line 1065
    .line 1066
    invoke-direct {v2, v3, v4, v5, v12}, Lcom/google/android/gms/internal/ads/zzamg;-><init>(J[Lcom/google/android/gms/internal/ads/zzamh;I)V

    .line 1067
    .line 1068
    .line 1069
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzagd;->zzw(Lcom/google/android/gms/internal/ads/zzahd;)V

    .line 1070
    .line 1071
    .line 1072
    :goto_27
    invoke-virtual/range {v32 .. v32}, Ljava/util/ArrayDeque;->clear()V

    .line 1073
    .line 1074
    .line 1075
    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzami;->zzy:Z

    .line 1076
    .line 1077
    if-nez v1, :cond_35

    .line 1078
    .line 1079
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzami;->zzk:Ljava/util/List;

    .line 1080
    .line 1081
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1082
    .line 1083
    .line 1084
    move-result v1

    .line 1085
    const/4 v2, 0x1

    .line 1086
    if-eq v2, v1, :cond_33

    .line 1087
    .line 1088
    const/4 v8, 0x4

    .line 1089
    goto :goto_28

    .line 1090
    :cond_33
    const/4 v8, 0x2

    .line 1091
    :goto_28
    iput v8, v0, Lcom/google/android/gms/internal/ads/zzami;->zzn:I

    .line 1092
    .line 1093
    :cond_34
    :goto_29
    move v5, v2

    .line 1094
    move/from16 v4, v21

    .line 1095
    .line 1096
    move/from16 v1, v25

    .line 1097
    .line 1098
    const/4 v2, 0x2

    .line 1099
    goto/16 :goto_1

    .line 1100
    .line 1101
    :cond_35
    move/from16 v4, v21

    .line 1102
    .line 1103
    move/from16 v1, v25

    .line 1104
    .line 1105
    const/4 v2, 0x2

    .line 1106
    goto/16 :goto_0

    .line 1107
    .line 1108
    :cond_36
    move/from16 v25, v1

    .line 1109
    .line 1110
    move/from16 v21, v4

    .line 1111
    .line 1112
    move v2, v5

    .line 1113
    move-object/from16 v32, v6

    .line 1114
    .line 1115
    invoke-virtual/range {v32 .. v32}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1116
    .line 1117
    .line 1118
    move-result v1

    .line 1119
    if-nez v1, :cond_34

    .line 1120
    .line 1121
    invoke-virtual/range {v32 .. v32}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v1

    .line 1125
    check-cast v1, Lcom/google/android/gms/internal/ads/zzfz;

    .line 1126
    .line 1127
    invoke-virtual {v1, v8}, Lcom/google/android/gms/internal/ads/zzfz;->zzb(Lcom/google/android/gms/internal/ads/zzfz;)V

    .line 1128
    .line 1129
    .line 1130
    goto :goto_29

    .line 1131
    :cond_37
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzami;->zzn:I

    .line 1132
    .line 1133
    const/4 v2, 0x4

    .line 1134
    if-eq v1, v2, :cond_38

    .line 1135
    .line 1136
    const/4 v8, 0x2

    .line 1137
    if-eq v1, v8, :cond_38

    .line 1138
    .line 1139
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzami;->zzj()V

    .line 1140
    .line 1141
    .line 1142
    :cond_38
    return-void
.end method

.method private static zzl(Lcom/google/android/gms/internal/ads/zzams;J)I
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzams;->zza(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzams;->zzb(J)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_0
    return v0
.end method

.method private static zzm(I)I
    .locals 1

    const v0, 0x71742020

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzagb;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzamn;->zzb(Lcom/google/android/gms/internal/ads/zzagb;)Lcom/google/android/gms/internal/ads/zzahh;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgwt;->zzi()Lcom/google/android/gms/internal/ads/zzgwt;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzami;->zzm:Lcom/google/android/gms/internal/ads/zzgwt;

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method public final synthetic zzb()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzami;->zzm:Lcom/google/android/gms/internal/ads/zzgwt;

    return-object v0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzagd;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzami;->zzc:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzami;->zzb:Lcom/google/android/gms/internal/ads/zzanq;

    .line 8
    .line 9
    new-instance v1, Lcom/google/android/gms/internal/ads/zzant;

    .line 10
    .line 11
    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzant;-><init>(Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzanq;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v1

    .line 15
    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzE:Lcom/google/android/gms/internal/ads/zzagd;

    .line 16
    .line 17
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzaha;)I
    .locals 42
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    :cond_0
    :goto_0
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzn:I

    .line 8
    .line 9
    const v4, 0x66747970

    .line 10
    .line 11
    .line 12
    const-wide/16 v5, 0x0

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, -0x1

    .line 16
    const/16 v9, 0x8

    .line 17
    .line 18
    const/4 v10, 0x1

    .line 19
    const/4 v11, 0x0

    .line 20
    if-eqz v3, :cond_36

    .line 21
    .line 22
    const/4 v14, 0x2

    .line 23
    if-eq v3, v10, :cond_2b

    .line 24
    .line 25
    const-string v4, "audio/mpeg"

    .line 26
    .line 27
    if-eq v3, v14, :cond_b

    .line 28
    .line 29
    const/4 v8, 0x3

    .line 30
    if-eq v3, v8, :cond_9

    .line 31
    .line 32
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzk:Ljava/util/List;

    .line 33
    .line 34
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzB:I

    .line 35
    .line 36
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, Lcom/google/android/gms/internal/ads/zzams;

    .line 41
    .line 42
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzami;->zzC:I

    .line 43
    .line 44
    iget v8, v5, Lcom/google/android/gms/internal/ads/zzams;->zzb:I

    .line 45
    .line 46
    if-ge v6, v8, :cond_3

    .line 47
    .line 48
    iget-object v3, v5, Lcom/google/android/gms/internal/ads/zzams;->zzc:[J

    .line 49
    .line 50
    aget-wide v12, v3, v6

    .line 51
    .line 52
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    cmp-long v3, v3, v12

    .line 57
    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    iput-wide v12, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 61
    .line 62
    return v10

    .line 63
    :cond_1
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzams;->zzd:[I

    .line 64
    .line 65
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzC:I

    .line 66
    .line 67
    aget v2, v2, v3

    .line 68
    .line 69
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzf:Lcom/google/android/gms/internal/ads/zzeu;

    .line 70
    .line 71
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-interface {v1, v4, v11, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 94
    .line 95
    invoke-virtual {v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzK(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzams;->zzf:[J

    .line 100
    .line 101
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzC:I

    .line 102
    .line 103
    aget-wide v3, v2, v3

    .line 104
    .line 105
    invoke-static {v3, v4}, Lcom/google/android/gms/internal/ads/zzfm;->zzs(J)J

    .line 106
    .line 107
    .line 108
    move-result-wide v3

    .line 109
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzami;->zzC:I

    .line 110
    .line 111
    add-int/2addr v6, v10

    .line 112
    if-ge v6, v8, :cond_2

    .line 113
    .line 114
    aget-wide v5, v2, v6

    .line 115
    .line 116
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/ads/zzfm;->zzs(J)J

    .line 117
    .line 118
    .line 119
    move-result-wide v5

    .line 120
    goto :goto_1

    .line 121
    :cond_2
    iget-wide v5, v5, Lcom/google/android/gms/internal/ads/zzams;->zzi:J

    .line 122
    .line 123
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/ads/zzfm;->zzs(J)J

    .line 124
    .line 125
    .line 126
    move-result-wide v5

    .line 127
    :goto_1
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzl:Ljava/util/List;

    .line 128
    .line 129
    new-instance v8, Lcom/google/android/gms/internal/ads/zzaiy;

    .line 130
    .line 131
    invoke-direct {v8}, Lcom/google/android/gms/internal/ads/zzaiy;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v8, v3, v4}, Lcom/google/android/gms/internal/ads/zzaiy;->zza(J)Lcom/google/android/gms/internal/ads/zzaiy;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v8, v5, v6}, Lcom/google/android/gms/internal/ads/zzaiy;->zzb(J)Lcom/google/android/gms/internal/ads/zzaiy;

    .line 138
    .line 139
    .line 140
    new-instance v3, Lcom/google/android/gms/internal/ads/zzx;

    .line 141
    .line 142
    invoke-direct {v3, v7, v1}, Lcom/google/android/gms/internal/ads/zzx;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v8, v3}, Lcom/google/android/gms/internal/ads/zzaiy;->zzd(Lcom/google/android/gms/internal/ads/zzx;)Lcom/google/android/gms/internal/ads/zzaiy;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzaiy;->zze()Lcom/google/android/gms/internal/ads/zzaiz;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzami;->zzC:I

    .line 156
    .line 157
    add-int/2addr v1, v10

    .line 158
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzami;->zzC:I

    .line 159
    .line 160
    return v11

    .line 161
    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzami;->zzF:[Lcom/google/android/gms/internal/ads/zzamh;

    .line 162
    .line 163
    array-length v2, v1

    .line 164
    move v6, v11

    .line 165
    :goto_2
    if-ge v6, v2, :cond_7

    .line 166
    .line 167
    aget-object v8, v1, v6

    .line 168
    .line 169
    iget-object v9, v8, Lcom/google/android/gms/internal/ads/zzamh;->zza:Lcom/google/android/gms/internal/ads/zzamp;

    .line 170
    .line 171
    iget v9, v9, Lcom/google/android/gms/internal/ads/zzamp;->zzl:I

    .line 172
    .line 173
    iget-object v12, v5, Lcom/google/android/gms/internal/ads/zzams;->zza:Lcom/google/android/gms/internal/ads/zzamp;

    .line 174
    .line 175
    iget v12, v12, Lcom/google/android/gms/internal/ads/zzamp;->zza:I

    .line 176
    .line 177
    if-ne v9, v12, :cond_6

    .line 178
    .line 179
    iget-object v9, v8, Lcom/google/android/gms/internal/ads/zzamh;->zzf:Lcom/google/android/gms/internal/ads/zzv;

    .line 180
    .line 181
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    iget-object v12, v9, Lcom/google/android/gms/internal/ads/zzv;->zzl:Lcom/google/android/gms/internal/ads/zzap;

    .line 185
    .line 186
    new-instance v13, Ljava/util/ArrayList;

    .line 187
    .line 188
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 189
    .line 190
    .line 191
    if-eqz v12, :cond_4

    .line 192
    .line 193
    const-class v15, Lcom/google/android/gms/internal/ads/zzao;

    .line 194
    .line 195
    move/from16 v16, v10

    .line 196
    .line 197
    sget-object v10, Lcom/google/android/gms/internal/ads/zzamd;->zza:Lcom/google/android/gms/internal/ads/zzamd;

    .line 198
    .line 199
    invoke-virtual {v12, v15, v10}, Lcom/google/android/gms/internal/ads/zzap;->zze(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgts;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 204
    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_4
    move/from16 v16, v10

    .line 208
    .line 209
    :goto_3
    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzami;->zzl:Ljava/util/List;

    .line 210
    .line 211
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 212
    .line 213
    .line 214
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    new-instance v10, Lcom/google/android/gms/internal/ads/zzap;

    .line 219
    .line 220
    invoke-direct {v10, v13}, Lcom/google/android/gms/internal/ads/zzap;-><init>(Ljava/util/List;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/ads/zzt;->zzl(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzt;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    iget-object v10, v9, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 231
    .line 232
    invoke-static {v10, v4}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    if-eqz v10, :cond_5

    .line 237
    .line 238
    iput-object v9, v8, Lcom/google/android/gms/internal/ads/zzamh;->zzf:Lcom/google/android/gms/internal/ads/zzv;

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_5
    iget-object v10, v8, Lcom/google/android/gms/internal/ads/zzamh;->zzc:Lcom/google/android/gms/internal/ads/zzahm;

    .line 242
    .line 243
    invoke-interface {v10, v9}, Lcom/google/android/gms/internal/ads/zzahm;->zzA(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 244
    .line 245
    .line 246
    iput-object v7, v8, Lcom/google/android/gms/internal/ads/zzamh;->zzf:Lcom/google/android/gms/internal/ads/zzv;

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_6
    move/from16 v16, v10

    .line 250
    .line 251
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 252
    .line 253
    move/from16 v10, v16

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_7
    move/from16 v16, v10

    .line 257
    .line 258
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzami;->zzB:I

    .line 259
    .line 260
    add-int/lit8 v1, v1, 0x1

    .line 261
    .line 262
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzami;->zzB:I

    .line 263
    .line 264
    iput v11, v0, Lcom/google/android/gms/internal/ads/zzami;->zzC:I

    .line 265
    .line 266
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzami;->zzl:Ljava/util/List;

    .line 267
    .line 268
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 269
    .line 270
    .line 271
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzami;->zzB:I

    .line 272
    .line 273
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    if-eq v1, v2, :cond_8

    .line 278
    .line 279
    return v11

    .line 280
    :cond_8
    iput v14, v0, Lcom/google/android/gms/internal/ads/zzami;->zzn:I

    .line 281
    .line 282
    return v11

    .line 283
    :cond_9
    move/from16 v16, v10

    .line 284
    .line 285
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzi:Lcom/google/android/gms/internal/ads/zzamm;

    .line 286
    .line 287
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzami;->zzj:Ljava/util/List;

    .line 288
    .line 289
    invoke-virtual {v3, v1, v2, v4}, Lcom/google/android/gms/internal/ads/zzamm;->zzb(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzaha;Ljava/util/List;)I

    .line 290
    .line 291
    .line 292
    iget-wide v1, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 293
    .line 294
    cmp-long v1, v1, v5

    .line 295
    .line 296
    if-eqz v1, :cond_a

    .line 297
    .line 298
    return v16

    .line 299
    :cond_a
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzami;->zzj()V

    .line 300
    .line 301
    .line 302
    return v16

    .line 303
    :cond_b
    move/from16 v16, v10

    .line 304
    .line 305
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 306
    .line 307
    .line 308
    move-result-wide v9

    .line 309
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzs:I

    .line 310
    .line 311
    if-ne v3, v8, :cond_15

    .line 312
    .line 313
    const-wide v17, 0x7fffffffffffffffL

    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    move-wide/from16 v20, v5

    .line 319
    .line 320
    move v6, v8

    .line 321
    move/from16 v28, v6

    .line 322
    .line 323
    move v5, v11

    .line 324
    move/from16 v3, v16

    .line 325
    .line 326
    move/from16 v19, v3

    .line 327
    .line 328
    move-wide/from16 v22, v17

    .line 329
    .line 330
    move-wide/from16 v24, v22

    .line 331
    .line 332
    move-wide/from16 v26, v24

    .line 333
    .line 334
    const-wide/32 v29, 0x40000

    .line 335
    .line 336
    .line 337
    :goto_5
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzami;->zzF:[Lcom/google/android/gms/internal/ads/zzamh;

    .line 338
    .line 339
    array-length v13, v12

    .line 340
    if-ge v5, v13, :cond_13

    .line 341
    .line 342
    aget-object v12, v12, v5

    .line 343
    .line 344
    iget v13, v12, Lcom/google/android/gms/internal/ads/zzamh;->zze:I

    .line 345
    .line 346
    iget-object v12, v12, Lcom/google/android/gms/internal/ads/zzamh;->zzb:Lcom/google/android/gms/internal/ads/zzams;

    .line 347
    .line 348
    move/from16 v31, v14

    .line 349
    .line 350
    iget v14, v12, Lcom/google/android/gms/internal/ads/zzams;->zzb:I

    .line 351
    .line 352
    if-ne v13, v14, :cond_c

    .line 353
    .line 354
    goto :goto_8

    .line 355
    :cond_c
    iget-object v12, v12, Lcom/google/android/gms/internal/ads/zzams;->zzc:[J

    .line 356
    .line 357
    aget-wide v32, v12, v13

    .line 358
    .line 359
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzami;->zzG:[[J

    .line 360
    .line 361
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    aget-object v12, v12, v5

    .line 365
    .line 366
    aget-wide v13, v12, v13

    .line 367
    .line 368
    sub-long v32, v32, v9

    .line 369
    .line 370
    cmp-long v12, v32, v20

    .line 371
    .line 372
    if-ltz v12, :cond_d

    .line 373
    .line 374
    cmp-long v12, v32, v29

    .line 375
    .line 376
    if-ltz v12, :cond_e

    .line 377
    .line 378
    :cond_d
    move/from16 v12, v16

    .line 379
    .line 380
    goto :goto_6

    .line 381
    :cond_e
    move v12, v11

    .line 382
    :goto_6
    if-nez v12, :cond_f

    .line 383
    .line 384
    if-nez v19, :cond_10

    .line 385
    .line 386
    move v7, v11

    .line 387
    goto :goto_7

    .line 388
    :cond_f
    move/from16 v7, v19

    .line 389
    .line 390
    :goto_7
    if-ne v12, v7, :cond_11

    .line 391
    .line 392
    cmp-long v19, v32, v26

    .line 393
    .line 394
    if-gez v19, :cond_11

    .line 395
    .line 396
    :cond_10
    move/from16 v28, v5

    .line 397
    .line 398
    move v7, v12

    .line 399
    move-wide/from16 v24, v13

    .line 400
    .line 401
    move-wide/from16 v26, v32

    .line 402
    .line 403
    :cond_11
    cmp-long v19, v13, v22

    .line 404
    .line 405
    if-gez v19, :cond_12

    .line 406
    .line 407
    move v6, v5

    .line 408
    move/from16 v19, v7

    .line 409
    .line 410
    move v3, v12

    .line 411
    move-wide/from16 v22, v13

    .line 412
    .line 413
    goto :goto_8

    .line 414
    :cond_12
    move/from16 v19, v7

    .line 415
    .line 416
    :goto_8
    add-int/lit8 v5, v5, 0x1

    .line 417
    .line 418
    move/from16 v14, v31

    .line 419
    .line 420
    const/4 v7, 0x0

    .line 421
    goto :goto_5

    .line 422
    :cond_13
    move/from16 v31, v14

    .line 423
    .line 424
    cmp-long v5, v22, v17

    .line 425
    .line 426
    if-eqz v5, :cond_14

    .line 427
    .line 428
    if-eqz v3, :cond_14

    .line 429
    .line 430
    const-wide/32 v12, 0xa00000

    .line 431
    .line 432
    .line 433
    add-long v22, v22, v12

    .line 434
    .line 435
    cmp-long v3, v24, v22

    .line 436
    .line 437
    if-ltz v3, :cond_14

    .line 438
    .line 439
    move v3, v6

    .line 440
    goto :goto_9

    .line 441
    :cond_14
    move/from16 v3, v28

    .line 442
    .line 443
    :goto_9
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzs:I

    .line 444
    .line 445
    if-ne v3, v8, :cond_16

    .line 446
    .line 447
    return v8

    .line 448
    :cond_15
    move-wide/from16 v20, v5

    .line 449
    .line 450
    move/from16 v31, v14

    .line 451
    .line 452
    const-wide/32 v29, 0x40000

    .line 453
    .line 454
    .line 455
    :cond_16
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzF:[Lcom/google/android/gms/internal/ads/zzamh;

    .line 456
    .line 457
    aget-object v3, v5, v3

    .line 458
    .line 459
    iget-object v5, v3, Lcom/google/android/gms/internal/ads/zzamh;->zzc:Lcom/google/android/gms/internal/ads/zzahm;

    .line 460
    .line 461
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzamh;->zze:I

    .line 462
    .line 463
    iget-object v7, v3, Lcom/google/android/gms/internal/ads/zzamh;->zzb:Lcom/google/android/gms/internal/ads/zzams;

    .line 464
    .line 465
    iget-object v12, v7, Lcom/google/android/gms/internal/ads/zzams;->zzc:[J

    .line 466
    .line 467
    aget-wide v13, v12, v6

    .line 468
    .line 469
    move-wide/from16 v17, v9

    .line 470
    .line 471
    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzami;->zzD:J

    .line 472
    .line 473
    add-long/2addr v13, v8

    .line 474
    iget-object v8, v7, Lcom/google/android/gms/internal/ads/zzams;->zzd:[I

    .line 475
    .line 476
    aget v9, v8, v6

    .line 477
    .line 478
    iget-object v10, v3, Lcom/google/android/gms/internal/ads/zzamh;->zzd:Lcom/google/android/gms/internal/ads/zzahn;

    .line 479
    .line 480
    sub-long v17, v13, v17

    .line 481
    .line 482
    iget v12, v0, Lcom/google/android/gms/internal/ads/zzami;->zzt:I

    .line 483
    .line 484
    move/from16 v32, v11

    .line 485
    .line 486
    int-to-long v11, v12

    .line 487
    add-long v17, v17, v11

    .line 488
    .line 489
    cmp-long v11, v17, v20

    .line 490
    .line 491
    if-ltz v11, :cond_2a

    .line 492
    .line 493
    cmp-long v11, v17, v29

    .line 494
    .line 495
    if-ltz v11, :cond_17

    .line 496
    .line 497
    goto/16 :goto_13

    .line 498
    .line 499
    :cond_17
    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzamh;->zza:Lcom/google/android/gms/internal/ads/zzamp;

    .line 500
    .line 501
    iget v11, v2, Lcom/google/android/gms/internal/ads/zzamp;->zzh:I

    .line 502
    .line 503
    move/from16 v12, v16

    .line 504
    .line 505
    if-ne v11, v12, :cond_18

    .line 506
    .line 507
    const-wide/16 v11, 0x8

    .line 508
    .line 509
    add-long v17, v17, v11

    .line 510
    .line 511
    add-int/lit8 v9, v9, -0x8

    .line 512
    .line 513
    :cond_18
    move-wide/from16 v11, v17

    .line 514
    .line 515
    long-to-int v11, v11

    .line 516
    invoke-interface {v1, v11}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 517
    .line 518
    .line 519
    iget-object v11, v2, Lcom/google/android/gms/internal/ads/zzamp;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    .line 520
    .line 521
    iget-object v12, v11, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 522
    .line 523
    const-string v13, "video/avc"

    .line 524
    .line 525
    invoke-static {v12, v13}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v13

    .line 529
    if-eqz v13, :cond_1a

    .line 530
    .line 531
    iget v13, v0, Lcom/google/android/gms/internal/ads/zzami;->zzc:I

    .line 532
    .line 533
    and-int/lit8 v13, v13, 0x20

    .line 534
    .line 535
    if-nez v13, :cond_19

    .line 536
    .line 537
    :goto_a
    const/4 v13, 0x1

    .line 538
    goto :goto_b

    .line 539
    :cond_19
    const/4 v13, 0x1

    .line 540
    goto :goto_c

    .line 541
    :cond_1a
    const-string v13, "video/hevc"

    .line 542
    .line 543
    invoke-static {v12, v13}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v13

    .line 547
    if-eqz v13, :cond_1b

    .line 548
    .line 549
    iget v13, v0, Lcom/google/android/gms/internal/ads/zzami;->zzc:I

    .line 550
    .line 551
    and-int/lit16 v13, v13, 0x80

    .line 552
    .line 553
    if-nez v13, :cond_19

    .line 554
    .line 555
    goto :goto_a

    .line 556
    :cond_1b
    const-string v13, "video/apv"

    .line 557
    .line 558
    invoke-static {v12, v13}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v13

    .line 562
    if-nez v13, :cond_19

    .line 563
    .line 564
    goto :goto_a

    .line 565
    :goto_b
    iput-boolean v13, v0, Lcom/google/android/gms/internal/ads/zzami;->zzw:Z

    .line 566
    .line 567
    :goto_c
    iget v2, v2, Lcom/google/android/gms/internal/ads/zzamp;->zzk:I

    .line 568
    .line 569
    if-eqz v2, :cond_21

    .line 570
    .line 571
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzami;->zze:Lcom/google/android/gms/internal/ads/zzeu;

    .line 572
    .line 573
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 574
    .line 575
    .line 576
    move-result-object v12

    .line 577
    aput-byte v32, v12, v32

    .line 578
    .line 579
    aput-byte v32, v12, v13

    .line 580
    .line 581
    aput-byte v32, v12, v31

    .line 582
    .line 583
    rsub-int/lit8 v13, v2, 0x4

    .line 584
    .line 585
    add-int/2addr v9, v13

    .line 586
    :goto_d
    iget v14, v0, Lcom/google/android/gms/internal/ads/zzami;->zzu:I

    .line 587
    .line 588
    if-ge v14, v9, :cond_20

    .line 589
    .line 590
    iget v14, v0, Lcom/google/android/gms/internal/ads/zzami;->zzv:I

    .line 591
    .line 592
    if-nez v14, :cond_1f

    .line 593
    .line 594
    iget-boolean v14, v0, Lcom/google/android/gms/internal/ads/zzami;->zzw:Z

    .line 595
    .line 596
    if-nez v14, :cond_1c

    .line 597
    .line 598
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzgr;->zzc(Lcom/google/android/gms/internal/ads/zzv;)I

    .line 599
    .line 600
    .line 601
    move-result v14

    .line 602
    add-int/2addr v14, v2

    .line 603
    aget v17, v8, v6

    .line 604
    .line 605
    iget v15, v0, Lcom/google/android/gms/internal/ads/zzami;->zzt:I

    .line 606
    .line 607
    sub-int v15, v17, v15

    .line 608
    .line 609
    if-gt v14, v15, :cond_1c

    .line 610
    .line 611
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzgr;->zzc(Lcom/google/android/gms/internal/ads/zzv;)I

    .line 612
    .line 613
    .line 614
    move-result v14

    .line 615
    add-int v15, v2, v14

    .line 616
    .line 617
    goto :goto_e

    .line 618
    :cond_1c
    move v15, v2

    .line 619
    move/from16 v14, v32

    .line 620
    .line 621
    :goto_e
    invoke-interface {v1, v12, v13, v15}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 622
    .line 623
    .line 624
    move/from16 v17, v2

    .line 625
    .line 626
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzt:I

    .line 627
    .line 628
    add-int/2addr v2, v15

    .line 629
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzt:I

    .line 630
    .line 631
    move/from16 v2, v32

    .line 632
    .line 633
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 637
    .line 638
    .line 639
    move-result v15

    .line 640
    if-ltz v15, :cond_1e

    .line 641
    .line 642
    sub-int/2addr v15, v14

    .line 643
    iput v15, v0, Lcom/google/android/gms/internal/ads/zzami;->zzv:I

    .line 644
    .line 645
    iget-object v15, v0, Lcom/google/android/gms/internal/ads/zzami;->zzd:Lcom/google/android/gms/internal/ads/zzeu;

    .line 646
    .line 647
    invoke-virtual {v15, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 648
    .line 649
    .line 650
    const/4 v2, 0x4

    .line 651
    invoke-interface {v5, v15, v2}, Lcom/google/android/gms/internal/ads/zzahm;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V

    .line 652
    .line 653
    .line 654
    iget v15, v0, Lcom/google/android/gms/internal/ads/zzami;->zzu:I

    .line 655
    .line 656
    add-int/2addr v15, v2

    .line 657
    iput v15, v0, Lcom/google/android/gms/internal/ads/zzami;->zzu:I

    .line 658
    .line 659
    if-lez v14, :cond_1d

    .line 660
    .line 661
    invoke-interface {v5, v4, v14}, Lcom/google/android/gms/internal/ads/zzahm;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V

    .line 662
    .line 663
    .line 664
    iget v15, v0, Lcom/google/android/gms/internal/ads/zzami;->zzu:I

    .line 665
    .line 666
    add-int/2addr v15, v14

    .line 667
    iput v15, v0, Lcom/google/android/gms/internal/ads/zzami;->zzu:I

    .line 668
    .line 669
    invoke-static {v12, v2, v14, v11}, Lcom/google/android/gms/internal/ads/zzgr;->zzd([BIILcom/google/android/gms/internal/ads/zzv;)Z

    .line 670
    .line 671
    .line 672
    move-result v14

    .line 673
    if-eqz v14, :cond_1d

    .line 674
    .line 675
    const/4 v2, 0x1

    .line 676
    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzw:Z

    .line 677
    .line 678
    :cond_1d
    :goto_f
    move/from16 v2, v17

    .line 679
    .line 680
    const/16 v32, 0x0

    .line 681
    .line 682
    goto :goto_d

    .line 683
    :cond_1e
    const-string v1, "Invalid NAL length"

    .line 684
    .line 685
    const/4 v2, 0x0

    .line 686
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    throw v1

    .line 691
    :cond_1f
    move/from16 v17, v2

    .line 692
    .line 693
    move/from16 v2, v32

    .line 694
    .line 695
    invoke-interface {v5, v1, v14, v2}, Lcom/google/android/gms/internal/ads/zzahm;->zza(Lcom/google/android/gms/internal/ads/zzj;IZ)I

    .line 696
    .line 697
    .line 698
    move-result v14

    .line 699
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzt:I

    .line 700
    .line 701
    add-int/2addr v2, v14

    .line 702
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzt:I

    .line 703
    .line 704
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzu:I

    .line 705
    .line 706
    add-int/2addr v2, v14

    .line 707
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzu:I

    .line 708
    .line 709
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzv:I

    .line 710
    .line 711
    sub-int/2addr v2, v14

    .line 712
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzv:I

    .line 713
    .line 714
    goto :goto_f

    .line 715
    :cond_20
    move/from16 v39, v9

    .line 716
    .line 717
    goto/16 :goto_11

    .line 718
    .line 719
    :cond_21
    const-string v2, "audio/ac4"

    .line 720
    .line 721
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 722
    .line 723
    .line 724
    move-result v2

    .line 725
    if-eqz v2, :cond_23

    .line 726
    .line 727
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzu:I

    .line 728
    .line 729
    if-nez v2, :cond_22

    .line 730
    .line 731
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzf:Lcom/google/android/gms/internal/ads/zzeu;

    .line 732
    .line 733
    invoke-static {v9, v2}, Lcom/google/android/gms/internal/ads/zzafd;->zzc(ILcom/google/android/gms/internal/ads/zzeu;)V

    .line 734
    .line 735
    .line 736
    const/4 v4, 0x7

    .line 737
    invoke-interface {v5, v2, v4}, Lcom/google/android/gms/internal/ads/zzahm;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V

    .line 738
    .line 739
    .line 740
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzu:I

    .line 741
    .line 742
    add-int/2addr v2, v4

    .line 743
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzu:I

    .line 744
    .line 745
    :cond_22
    add-int/lit8 v9, v9, 0x7

    .line 746
    .line 747
    goto :goto_10

    .line 748
    :cond_23
    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzamh;->zzf:Lcom/google/android/gms/internal/ads/zzv;

    .line 749
    .line 750
    if-eqz v2, :cond_25

    .line 751
    .line 752
    invoke-static {v12, v4}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    move-result v2

    .line 756
    if-eqz v2, :cond_25

    .line 757
    .line 758
    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzamh;->zzf:Lcom/google/android/gms/internal/ads/zzv;

    .line 759
    .line 760
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzami;->zzf:Lcom/google/android/gms/internal/ads/zzeu;

    .line 761
    .line 762
    const/4 v8, 0x4

    .line 763
    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 767
    .line 768
    .line 769
    move-result-object v11

    .line 770
    const/4 v12, 0x0

    .line 771
    invoke-interface {v1, v11, v12, v8}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 772
    .line 773
    .line 774
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 775
    .line 776
    .line 777
    new-instance v8, Lcom/google/android/gms/internal/ads/zzagx;

    .line 778
    .line 779
    invoke-direct {v8}, Lcom/google/android/gms/internal/ads/zzagx;-><init>()V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 783
    .line 784
    .line 785
    move-result v4

    .line 786
    invoke-virtual {v8, v4}, Lcom/google/android/gms/internal/ads/zzagx;->zza(I)Z

    .line 787
    .line 788
    .line 789
    move-result v4

    .line 790
    if-eqz v4, :cond_24

    .line 791
    .line 792
    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 793
    .line 794
    iget-object v11, v8, Lcom/google/android/gms/internal/ads/zzagx;->zzb:Ljava/lang/String;

    .line 795
    .line 796
    invoke-static {v4, v11}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 797
    .line 798
    .line 799
    move-result v4

    .line 800
    if-nez v4, :cond_24

    .line 801
    .line 802
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 803
    .line 804
    .line 805
    move-result-object v2

    .line 806
    iget-object v4, v8, Lcom/google/android/gms/internal/ads/zzagx;->zzb:Ljava/lang/String;

    .line 807
    .line 808
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 809
    .line 810
    .line 811
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 815
    .line 816
    .line 817
    move-result-object v2

    .line 818
    :cond_24
    invoke-interface {v5, v2}, Lcom/google/android/gms/internal/ads/zzahm;->zzA(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 819
    .line 820
    .line 821
    const/4 v2, 0x0

    .line 822
    iput-object v2, v3, Lcom/google/android/gms/internal/ads/zzamh;->zzf:Lcom/google/android/gms/internal/ads/zzv;

    .line 823
    .line 824
    goto :goto_10

    .line 825
    :cond_25
    if-eqz v10, :cond_26

    .line 826
    .line 827
    invoke-virtual {v10, v1}, Lcom/google/android/gms/internal/ads/zzahn;->zzb(Lcom/google/android/gms/internal/ads/zzagb;)V

    .line 828
    .line 829
    .line 830
    :cond_26
    :goto_10
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzu:I

    .line 831
    .line 832
    if-ge v2, v9, :cond_20

    .line 833
    .line 834
    sub-int v2, v9, v2

    .line 835
    .line 836
    const/4 v12, 0x0

    .line 837
    invoke-interface {v5, v1, v2, v12}, Lcom/google/android/gms/internal/ads/zzahm;->zza(Lcom/google/android/gms/internal/ads/zzj;IZ)I

    .line 838
    .line 839
    .line 840
    move-result v2

    .line 841
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzami;->zzt:I

    .line 842
    .line 843
    add-int/2addr v4, v2

    .line 844
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzami;->zzt:I

    .line 845
    .line 846
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzami;->zzu:I

    .line 847
    .line 848
    add-int/2addr v4, v2

    .line 849
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzami;->zzu:I

    .line 850
    .line 851
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzami;->zzv:I

    .line 852
    .line 853
    sub-int/2addr v4, v2

    .line 854
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzami;->zzv:I

    .line 855
    .line 856
    goto :goto_10

    .line 857
    :goto_11
    iget-object v1, v7, Lcom/google/android/gms/internal/ads/zzams;->zzf:[J

    .line 858
    .line 859
    aget-wide v36, v1, v6

    .line 860
    .line 861
    iget-object v1, v7, Lcom/google/android/gms/internal/ads/zzams;->zzg:[I

    .line 862
    .line 863
    aget v1, v1, v6

    .line 864
    .line 865
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzw:Z

    .line 866
    .line 867
    if-nez v2, :cond_27

    .line 868
    .line 869
    const/high16 v2, 0x4000000

    .line 870
    .line 871
    or-int/2addr v1, v2

    .line 872
    :cond_27
    move/from16 v38, v1

    .line 873
    .line 874
    if-eqz v10, :cond_28

    .line 875
    .line 876
    const/16 v40, 0x0

    .line 877
    .line 878
    const/16 v41, 0x0

    .line 879
    .line 880
    move-object/from16 v35, v5

    .line 881
    .line 882
    move-object/from16 v34, v10

    .line 883
    .line 884
    invoke-virtual/range {v34 .. v41}, Lcom/google/android/gms/internal/ads/zzahn;->zzc(Lcom/google/android/gms/internal/ads/zzahm;JIIILcom/google/android/gms/internal/ads/zzahl;)V

    .line 885
    .line 886
    .line 887
    move-object/from16 v2, v34

    .line 888
    .line 889
    move-object/from16 v1, v35

    .line 890
    .line 891
    const/16 v16, 0x1

    .line 892
    .line 893
    add-int/lit8 v6, v6, 0x1

    .line 894
    .line 895
    iget v4, v7, Lcom/google/android/gms/internal/ads/zzams;->zzb:I

    .line 896
    .line 897
    if-ne v6, v4, :cond_29

    .line 898
    .line 899
    const/4 v4, 0x0

    .line 900
    invoke-virtual {v2, v1, v4}, Lcom/google/android/gms/internal/ads/zzahn;->zzd(Lcom/google/android/gms/internal/ads/zzahm;Lcom/google/android/gms/internal/ads/zzahl;)V

    .line 901
    .line 902
    .line 903
    goto :goto_12

    .line 904
    :cond_28
    move-object v1, v5

    .line 905
    const/16 v16, 0x1

    .line 906
    .line 907
    const/16 v27, 0x0

    .line 908
    .line 909
    const/16 v28, 0x0

    .line 910
    .line 911
    move-object/from16 v22, v1

    .line 912
    .line 913
    move-wide/from16 v23, v36

    .line 914
    .line 915
    move/from16 v25, v38

    .line 916
    .line 917
    move/from16 v26, v39

    .line 918
    .line 919
    invoke-interface/range {v22 .. v28}, Lcom/google/android/gms/internal/ads/zzahm;->zze(JIIILcom/google/android/gms/internal/ads/zzahl;)V

    .line 920
    .line 921
    .line 922
    :cond_29
    :goto_12
    iget v1, v3, Lcom/google/android/gms/internal/ads/zzamh;->zze:I

    .line 923
    .line 924
    add-int/lit8 v1, v1, 0x1

    .line 925
    .line 926
    iput v1, v3, Lcom/google/android/gms/internal/ads/zzamh;->zze:I

    .line 927
    .line 928
    const/4 v12, -0x1

    .line 929
    iput v12, v0, Lcom/google/android/gms/internal/ads/zzami;->zzs:I

    .line 930
    .line 931
    const/4 v2, 0x0

    .line 932
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzt:I

    .line 933
    .line 934
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzu:I

    .line 935
    .line 936
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzv:I

    .line 937
    .line 938
    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzami;->zzw:Z

    .line 939
    .line 940
    return v2

    .line 941
    :cond_2a
    :goto_13
    iput-wide v13, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 942
    .line 943
    return v16

    .line 944
    :cond_2b
    move/from16 v31, v14

    .line 945
    .line 946
    const-wide/32 v29, 0x40000

    .line 947
    .line 948
    .line 949
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzp:J

    .line 950
    .line 951
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzq:I

    .line 952
    .line 953
    int-to-long v7, v3

    .line 954
    sub-long/2addr v5, v7

    .line 955
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 956
    .line 957
    .line 958
    move-result-wide v7

    .line 959
    add-long/2addr v7, v5

    .line 960
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzr:Lcom/google/android/gms/internal/ads/zzeu;

    .line 961
    .line 962
    if-eqz v3, :cond_31

    .line 963
    .line 964
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 965
    .line 966
    .line 967
    move-result-object v10

    .line 968
    iget v11, v0, Lcom/google/android/gms/internal/ads/zzami;->zzq:I

    .line 969
    .line 970
    long-to-int v5, v5

    .line 971
    invoke-interface {v1, v10, v11, v5}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 972
    .line 973
    .line 974
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzo:I

    .line 975
    .line 976
    if-ne v5, v4, :cond_30

    .line 977
    .line 978
    const/4 v13, 0x1

    .line 979
    iput-boolean v13, v0, Lcom/google/android/gms/internal/ads/zzami;->zzx:Z

    .line 980
    .line 981
    invoke-virtual {v3, v9}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 982
    .line 983
    .line 984
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 985
    .line 986
    .line 987
    move-result v4

    .line 988
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzami;->zzm(I)I

    .line 989
    .line 990
    .line 991
    move-result v4

    .line 992
    if-eqz v4, :cond_2c

    .line 993
    .line 994
    :goto_14
    const/4 v3, 0x1

    .line 995
    goto :goto_15

    .line 996
    :cond_2c
    const/4 v4, 0x4

    .line 997
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 998
    .line 999
    .line 1000
    :cond_2d
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 1001
    .line 1002
    .line 1003
    move-result v4

    .line 1004
    if-lez v4, :cond_2e

    .line 1005
    .line 1006
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 1007
    .line 1008
    .line 1009
    move-result v4

    .line 1010
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzami;->zzm(I)I

    .line 1011
    .line 1012
    .line 1013
    move-result v4

    .line 1014
    if-eqz v4, :cond_2d

    .line 1015
    .line 1016
    goto :goto_14

    .line 1017
    :cond_2e
    const/4 v3, 0x0

    .line 1018
    :goto_15
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzH:I

    .line 1019
    .line 1020
    :cond_2f
    :goto_16
    const/4 v3, 0x0

    .line 1021
    goto :goto_17

    .line 1022
    :cond_30
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzami;->zzh:Ljava/util/ArrayDeque;

    .line 1023
    .line 1024
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1025
    .line 1026
    .line 1027
    move-result v5

    .line 1028
    if-nez v5, :cond_2f

    .line 1029
    .line 1030
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v4

    .line 1034
    check-cast v4, Lcom/google/android/gms/internal/ads/zzfz;

    .line 1035
    .line 1036
    new-instance v5, Lcom/google/android/gms/internal/ads/zzga;

    .line 1037
    .line 1038
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzami;->zzo:I

    .line 1039
    .line 1040
    invoke-direct {v5, v6, v3}, Lcom/google/android/gms/internal/ads/zzga;-><init>(ILcom/google/android/gms/internal/ads/zzeu;)V

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzfz;->zza(Lcom/google/android/gms/internal/ads/zzga;)V

    .line 1044
    .line 1045
    .line 1046
    goto :goto_16

    .line 1047
    :cond_31
    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzx:Z

    .line 1048
    .line 1049
    if-nez v3, :cond_32

    .line 1050
    .line 1051
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzo:I

    .line 1052
    .line 1053
    const v4, 0x6d646174

    .line 1054
    .line 1055
    .line 1056
    if-ne v3, v4, :cond_32

    .line 1057
    .line 1058
    const/4 v13, 0x1

    .line 1059
    iput v13, v0, Lcom/google/android/gms/internal/ads/zzami;->zzH:I

    .line 1060
    .line 1061
    :cond_32
    cmp-long v3, v5, v29

    .line 1062
    .line 1063
    if-gez v3, :cond_33

    .line 1064
    .line 1065
    long-to-int v3, v5

    .line 1066
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 1067
    .line 1068
    .line 1069
    goto :goto_16

    .line 1070
    :cond_33
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 1071
    .line 1072
    .line 1073
    move-result-wide v3

    .line 1074
    add-long/2addr v3, v5

    .line 1075
    iput-wide v3, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 1076
    .line 1077
    const/4 v3, 0x1

    .line 1078
    :goto_17
    invoke-direct {v0, v7, v8}, Lcom/google/android/gms/internal/ads/zzami;->zzk(J)V

    .line 1079
    .line 1080
    .line 1081
    iget-boolean v4, v0, Lcom/google/android/gms/internal/ads/zzami;->zzy:Z

    .line 1082
    .line 1083
    const/4 v13, 0x1

    .line 1084
    if-eqz v4, :cond_34

    .line 1085
    .line 1086
    iput-boolean v13, v0, Lcom/google/android/gms/internal/ads/zzami;->zzA:Z

    .line 1087
    .line 1088
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzz:J

    .line 1089
    .line 1090
    iput-wide v3, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 1091
    .line 1092
    const/4 v12, 0x0

    .line 1093
    iput-boolean v12, v0, Lcom/google/android/gms/internal/ads/zzami;->zzy:Z

    .line 1094
    .line 1095
    goto :goto_18

    .line 1096
    :cond_34
    if-nez v3, :cond_35

    .line 1097
    .line 1098
    goto/16 :goto_0

    .line 1099
    .line 1100
    :cond_35
    :goto_18
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzn:I

    .line 1101
    .line 1102
    move/from16 v4, v31

    .line 1103
    .line 1104
    if-eq v3, v4, :cond_0

    .line 1105
    .line 1106
    return v13

    .line 1107
    :cond_36
    move-wide/from16 v20, v5

    .line 1108
    .line 1109
    move v13, v10

    .line 1110
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzq:I

    .line 1111
    .line 1112
    if-nez v3, :cond_38

    .line 1113
    .line 1114
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzg:Lcom/google/android/gms/internal/ads/zzeu;

    .line 1115
    .line 1116
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 1117
    .line 1118
    .line 1119
    move-result-object v5

    .line 1120
    const/4 v6, 0x0

    .line 1121
    invoke-interface {v1, v5, v6, v9, v13}, Lcom/google/android/gms/internal/ads/zzagb;->zzb([BIIZ)Z

    .line 1122
    .line 1123
    .line 1124
    move-result v5

    .line 1125
    if-nez v5, :cond_37

    .line 1126
    .line 1127
    const/4 v12, -0x1

    .line 1128
    return v12

    .line 1129
    :cond_37
    iput v9, v0, Lcom/google/android/gms/internal/ads/zzami;->zzq:I

    .line 1130
    .line 1131
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    .line 1135
    .line 1136
    .line 1137
    move-result-wide v5

    .line 1138
    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzp:J

    .line 1139
    .line 1140
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 1141
    .line 1142
    .line 1143
    move-result v3

    .line 1144
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzo:I

    .line 1145
    .line 1146
    :cond_38
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzp:J

    .line 1147
    .line 1148
    const-wide/16 v7, 0x1

    .line 1149
    .line 1150
    cmp-long v3, v5, v7

    .line 1151
    .line 1152
    if-nez v3, :cond_39

    .line 1153
    .line 1154
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzg:Lcom/google/android/gms/internal/ads/zzeu;

    .line 1155
    .line 1156
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 1157
    .line 1158
    .line 1159
    move-result-object v5

    .line 1160
    invoke-interface {v1, v5, v9, v9}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 1161
    .line 1162
    .line 1163
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzq:I

    .line 1164
    .line 1165
    add-int/2addr v5, v9

    .line 1166
    iput v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzq:I

    .line 1167
    .line 1168
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzJ()J

    .line 1169
    .line 1170
    .line 1171
    move-result-wide v5

    .line 1172
    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzp:J

    .line 1173
    .line 1174
    goto :goto_1a

    .line 1175
    :cond_39
    cmp-long v3, v5, v20

    .line 1176
    .line 1177
    if-nez v3, :cond_3c

    .line 1178
    .line 1179
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    .line 1180
    .line 1181
    .line 1182
    move-result-wide v5

    .line 1183
    const-wide/16 v7, -0x1

    .line 1184
    .line 1185
    cmp-long v3, v5, v7

    .line 1186
    .line 1187
    if-nez v3, :cond_3b

    .line 1188
    .line 1189
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzh:Ljava/util/ArrayDeque;

    .line 1190
    .line 1191
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v3

    .line 1195
    check-cast v3, Lcom/google/android/gms/internal/ads/zzfz;

    .line 1196
    .line 1197
    if-eqz v3, :cond_3a

    .line 1198
    .line 1199
    iget-wide v5, v3, Lcom/google/android/gms/internal/ads/zzfz;->zza:J

    .line 1200
    .line 1201
    goto :goto_19

    .line 1202
    :cond_3a
    move-wide v5, v7

    .line 1203
    :cond_3b
    :goto_19
    cmp-long v3, v5, v7

    .line 1204
    .line 1205
    if-eqz v3, :cond_3c

    .line 1206
    .line 1207
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 1208
    .line 1209
    .line 1210
    move-result-wide v7

    .line 1211
    sub-long/2addr v5, v7

    .line 1212
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzq:I

    .line 1213
    .line 1214
    int-to-long v7, v3

    .line 1215
    add-long/2addr v5, v7

    .line 1216
    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzp:J

    .line 1217
    .line 1218
    :cond_3c
    :goto_1a
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzp:J

    .line 1219
    .line 1220
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzq:I

    .line 1221
    .line 1222
    int-to-long v7, v3

    .line 1223
    cmp-long v5, v5, v7

    .line 1224
    .line 1225
    if-gez v5, :cond_3e

    .line 1226
    .line 1227
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzo:I

    .line 1228
    .line 1229
    const v6, 0x66726565

    .line 1230
    .line 1231
    .line 1232
    if-ne v5, v6, :cond_3d

    .line 1233
    .line 1234
    if-ne v3, v9, :cond_3d

    .line 1235
    .line 1236
    iput-wide v7, v0, Lcom/google/android/gms/internal/ads/zzami;->zzp:J

    .line 1237
    .line 1238
    move v3, v9

    .line 1239
    goto :goto_1b

    .line 1240
    :cond_3d
    const-string v1, "Atom size less than header length (unsupported)."

    .line 1241
    .line 1242
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v1

    .line 1246
    throw v1

    .line 1247
    :cond_3e
    :goto_1b
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzo:I

    .line 1248
    .line 1249
    const v6, 0x6d6f6f76

    .line 1250
    .line 1251
    .line 1252
    const v7, 0x6d657461

    .line 1253
    .line 1254
    .line 1255
    if-eq v5, v6, :cond_44

    .line 1256
    .line 1257
    const v6, 0x7472616b

    .line 1258
    .line 1259
    .line 1260
    if-eq v5, v6, :cond_44

    .line 1261
    .line 1262
    const v6, 0x6d646961

    .line 1263
    .line 1264
    .line 1265
    if-eq v5, v6, :cond_44

    .line 1266
    .line 1267
    const v6, 0x6d696e66

    .line 1268
    .line 1269
    .line 1270
    if-eq v5, v6, :cond_44

    .line 1271
    .line 1272
    const v6, 0x7374626c

    .line 1273
    .line 1274
    .line 1275
    if-eq v5, v6, :cond_44

    .line 1276
    .line 1277
    const v6, 0x65647473

    .line 1278
    .line 1279
    .line 1280
    if-eq v5, v6, :cond_44

    .line 1281
    .line 1282
    if-eq v5, v7, :cond_44

    .line 1283
    .line 1284
    const v6, 0x61787465

    .line 1285
    .line 1286
    .line 1287
    if-eq v5, v6, :cond_44

    .line 1288
    .line 1289
    const v6, 0x74726566

    .line 1290
    .line 1291
    .line 1292
    if-ne v5, v6, :cond_3f

    .line 1293
    .line 1294
    goto/16 :goto_20

    .line 1295
    .line 1296
    :cond_3f
    const v6, 0x6d646864

    .line 1297
    .line 1298
    .line 1299
    if-eq v5, v6, :cond_41

    .line 1300
    .line 1301
    const v6, 0x6d766864

    .line 1302
    .line 1303
    .line 1304
    if-eq v5, v6, :cond_41

    .line 1305
    .line 1306
    const v6, 0x68646c72    # 4.3148E24f

    .line 1307
    .line 1308
    .line 1309
    if-eq v5, v6, :cond_41

    .line 1310
    .line 1311
    const v6, 0x73747364

    .line 1312
    .line 1313
    .line 1314
    if-eq v5, v6, :cond_41

    .line 1315
    .line 1316
    const v6, 0x73747473

    .line 1317
    .line 1318
    .line 1319
    if-eq v5, v6, :cond_41

    .line 1320
    .line 1321
    const v6, 0x73747373

    .line 1322
    .line 1323
    .line 1324
    if-eq v5, v6, :cond_41

    .line 1325
    .line 1326
    const v6, 0x63747473

    .line 1327
    .line 1328
    .line 1329
    if-eq v5, v6, :cond_41

    .line 1330
    .line 1331
    const v6, 0x656c7374

    .line 1332
    .line 1333
    .line 1334
    if-eq v5, v6, :cond_41

    .line 1335
    .line 1336
    const v6, 0x73747363

    .line 1337
    .line 1338
    .line 1339
    if-eq v5, v6, :cond_41

    .line 1340
    .line 1341
    const v6, 0x7374737a

    .line 1342
    .line 1343
    .line 1344
    if-eq v5, v6, :cond_41

    .line 1345
    .line 1346
    const v6, 0x73747a32

    .line 1347
    .line 1348
    .line 1349
    if-eq v5, v6, :cond_41

    .line 1350
    .line 1351
    const v6, 0x7374636f

    .line 1352
    .line 1353
    .line 1354
    if-eq v5, v6, :cond_41

    .line 1355
    .line 1356
    const v6, 0x636f3634

    .line 1357
    .line 1358
    .line 1359
    if-eq v5, v6, :cond_41

    .line 1360
    .line 1361
    const v6, 0x746b6864

    .line 1362
    .line 1363
    .line 1364
    if-eq v5, v6, :cond_41

    .line 1365
    .line 1366
    if-eq v5, v4, :cond_41

    .line 1367
    .line 1368
    const v4, 0x75647461

    .line 1369
    .line 1370
    .line 1371
    if-eq v5, v4, :cond_41

    .line 1372
    .line 1373
    const v4, 0x6b657973

    .line 1374
    .line 1375
    .line 1376
    if-eq v5, v4, :cond_41

    .line 1377
    .line 1378
    const v4, 0x696c7374

    .line 1379
    .line 1380
    .line 1381
    if-eq v5, v4, :cond_41

    .line 1382
    .line 1383
    const v4, 0x63686170

    .line 1384
    .line 1385
    .line 1386
    if-ne v5, v4, :cond_40

    .line 1387
    .line 1388
    goto :goto_1d

    .line 1389
    :cond_40
    const/4 v4, 0x0

    .line 1390
    iput-object v4, v0, Lcom/google/android/gms/internal/ads/zzami;->zzr:Lcom/google/android/gms/internal/ads/zzeu;

    .line 1391
    .line 1392
    :goto_1c
    const/4 v13, 0x1

    .line 1393
    iput v13, v0, Lcom/google/android/gms/internal/ads/zzami;->zzn:I

    .line 1394
    .line 1395
    goto/16 :goto_0

    .line 1396
    .line 1397
    :cond_41
    :goto_1d
    if-ne v3, v9, :cond_42

    .line 1398
    .line 1399
    const/4 v3, 0x1

    .line 1400
    goto :goto_1e

    .line 1401
    :cond_42
    const/4 v3, 0x0

    .line 1402
    :goto_1e
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzgtr;->zzi(Z)V

    .line 1403
    .line 1404
    .line 1405
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzp:J

    .line 1406
    .line 1407
    const-wide/32 v5, 0x7fffffff

    .line 1408
    .line 1409
    .line 1410
    cmp-long v3, v3, v5

    .line 1411
    .line 1412
    if-gtz v3, :cond_43

    .line 1413
    .line 1414
    const/4 v3, 0x1

    .line 1415
    goto :goto_1f

    .line 1416
    :cond_43
    const/4 v3, 0x0

    .line 1417
    :goto_1f
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzgtr;->zzi(Z)V

    .line 1418
    .line 1419
    .line 1420
    new-instance v3, Lcom/google/android/gms/internal/ads/zzeu;

    .line 1421
    .line 1422
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzami;->zzp:J

    .line 1423
    .line 1424
    long-to-int v4, v4

    .line 1425
    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 1426
    .line 1427
    .line 1428
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzami;->zzg:Lcom/google/android/gms/internal/ads/zzeu;

    .line 1429
    .line 1430
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 1431
    .line 1432
    .line 1433
    move-result-object v4

    .line 1434
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 1435
    .line 1436
    .line 1437
    move-result-object v5

    .line 1438
    const/4 v12, 0x0

    .line 1439
    invoke-static {v4, v12, v5, v12, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1440
    .line 1441
    .line 1442
    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzami;->zzr:Lcom/google/android/gms/internal/ads/zzeu;

    .line 1443
    .line 1444
    goto :goto_1c

    .line 1445
    :cond_44
    :goto_20
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 1446
    .line 1447
    .line 1448
    move-result-wide v3

    .line 1449
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzp:J

    .line 1450
    .line 1451
    add-long/2addr v3, v5

    .line 1452
    iget v8, v0, Lcom/google/android/gms/internal/ads/zzami;->zzq:I

    .line 1453
    .line 1454
    int-to-long v10, v8

    .line 1455
    cmp-long v5, v5, v10

    .line 1456
    .line 1457
    if-eqz v5, :cond_45

    .line 1458
    .line 1459
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzo:I

    .line 1460
    .line 1461
    if-ne v5, v7, :cond_45

    .line 1462
    .line 1463
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzf:Lcom/google/android/gms/internal/ads/zzeu;

    .line 1464
    .line 1465
    invoke-virtual {v5, v9}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 1466
    .line 1467
    .line 1468
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 1469
    .line 1470
    .line 1471
    move-result-object v6

    .line 1472
    const/4 v12, 0x0

    .line 1473
    invoke-interface {v1, v6, v12, v9}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 1474
    .line 1475
    .line 1476
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzalo;->zzf(Lcom/google/android/gms/internal/ads/zzeu;)V

    .line 1477
    .line 1478
    .line 1479
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 1480
    .line 1481
    .line 1482
    move-result v5

    .line 1483
    invoke-interface {v1, v5}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 1484
    .line 1485
    .line 1486
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 1487
    .line 1488
    .line 1489
    :cond_45
    sub-long/2addr v3, v10

    .line 1490
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzh:Ljava/util/ArrayDeque;

    .line 1491
    .line 1492
    new-instance v6, Lcom/google/android/gms/internal/ads/zzfz;

    .line 1493
    .line 1494
    iget v7, v0, Lcom/google/android/gms/internal/ads/zzami;->zzo:I

    .line 1495
    .line 1496
    invoke-direct {v6, v7, v3, v4}, Lcom/google/android/gms/internal/ads/zzfz;-><init>(IJ)V

    .line 1497
    .line 1498
    .line 1499
    invoke-virtual {v5, v6}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 1500
    .line 1501
    .line 1502
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzami;->zzp:J

    .line 1503
    .line 1504
    iget v7, v0, Lcom/google/android/gms/internal/ads/zzami;->zzq:I

    .line 1505
    .line 1506
    int-to-long v7, v7

    .line 1507
    cmp-long v5, v5, v7

    .line 1508
    .line 1509
    if-nez v5, :cond_46

    .line 1510
    .line 1511
    invoke-direct {v0, v3, v4}, Lcom/google/android/gms/internal/ads/zzami;->zzk(J)V

    .line 1512
    .line 1513
    .line 1514
    goto/16 :goto_0

    .line 1515
    .line 1516
    :cond_46
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzami;->zzj()V

    .line 1517
    .line 1518
    .line 1519
    goto/16 :goto_0
.end method

.method public final zze(JJ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzami;->zzh:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzami;->zzq:I

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzs:I

    .line 11
    .line 12
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzami;->zzt:I

    .line 13
    .line 14
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzami;->zzu:I

    .line 15
    .line 16
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzami;->zzv:I

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzami;->zzw:Z

    .line 19
    .line 20
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzami;->zzB:I

    .line 21
    .line 22
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzami;->zzC:I

    .line 23
    .line 24
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzami;->zzk:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzami;->zzl:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 32
    .line 33
    .line 34
    const-wide/16 v2, 0x0

    .line 35
    .line 36
    cmp-long p1, p1, v2

    .line 37
    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzn:I

    .line 41
    .line 42
    const/4 p2, 0x3

    .line 43
    if-eq p1, p2, :cond_0

    .line 44
    .line 45
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzami;->zzj()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzi:Lcom/google/android/gms/internal/ads/zzamm;

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzamm;->zza()V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzj:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzami;->zzF:[Lcom/google/android/gms/internal/ads/zzamh;

    .line 61
    .line 62
    array-length p2, p1

    .line 63
    :goto_0
    if-ge v0, p2, :cond_4

    .line 64
    .line 65
    aget-object v2, p1, v0

    .line 66
    .line 67
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzamh;->zzb:Lcom/google/android/gms/internal/ads/zzams;

    .line 68
    .line 69
    invoke-virtual {v3, p3, p4}, Lcom/google/android/gms/internal/ads/zzams;->zza(J)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-ne v4, v1, :cond_2

    .line 74
    .line 75
    invoke-virtual {v3, p3, p4}, Lcom/google/android/gms/internal/ads/zzams;->zzb(J)I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    :cond_2
    iput v4, v2, Lcom/google/android/gms/internal/ads/zzamh;->zze:I

    .line 80
    .line 81
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzamh;->zzd:Lcom/google/android/gms/internal/ads/zzahn;

    .line 82
    .line 83
    if-eqz v2, :cond_3

    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzahn;->zza()V

    .line 86
    .line 87
    .line 88
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    return-void
.end method

.method public final zzf()V
    .locals 0

    return-void
.end method

.method public final synthetic zzg()Lcom/google/android/gms/internal/ads/zzaga;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/f;->b(Lcom/google/android/gms/internal/ads/zzaga;)Lcom/google/android/gms/internal/ads/zzaga;

    move-result-object v0

    return-object v0
.end method
