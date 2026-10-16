.class public final Lcom/google/android/gms/internal/ads/zzcjk;
.super Lcom/google/android/gms/internal/ads/zzcjh;
.source "SourceFile"


# static fields
.field public static final synthetic zzd:I

.field private static final zze:Ljava/util/Set;

.field private static final zzf:Ljava/text/DecimalFormat;


# instance fields
.field private zzg:Ljava/io/File;

.field private zzh:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lj$/util/DesugarCollections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lcom/google/android/gms/internal/ads/zzcjk;->zze:Ljava/util/Set;

    .line 11
    .line 12
    new-instance v0, Ljava/text/DecimalFormat;

    .line 13
    .line 14
    const-string v1, "#,###"

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/google/android/gms/internal/ads/zzcjk;->zzf:Ljava/text/DecimalFormat;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzchu;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzcjh;-><init>(Lcom/google/android/gms/internal/ads/zzchu;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjh;->zza:Landroid/content/Context;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    sget p1, LG6/L;->b:I

    .line 13
    .line 14
    const-string p1, "Context.getCacheDir() returned null"

    .line 15
    .line 16
    invoke-static {p1}, LH6/l;->f(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 21
    .line 22
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfzu;->zza()Lcom/google/android/gms/internal/ads/zzfzv;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "admobVideoStreams"

    .line 27
    .line 28
    invoke-interface {v1, p1, v2}, Lcom/google/android/gms/internal/ads/zzfzv;->zza(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjk;->zzg:Ljava/io/File;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    const/4 v0, 0x0

    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjk;->zzg:Ljava/io/File;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_1

    .line 51
    .line 52
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjk;->zzg:Ljava/io/File;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    sget v1, LG6/L;->b:I

    .line 63
    .line 64
    const-string v1, "Could not create preload cache directory at "

    .line 65
    .line 66
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p1}, LH6/l;->f(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjk;->zzg:Ljava/io/File;

    .line 74
    .line 75
    return-void

    .line 76
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjk;->zzg:Ljava/io/File;

    .line 77
    .line 78
    const/4 v1, 0x1

    .line 79
    const/4 v2, 0x0

    .line 80
    invoke-virtual {p1, v1, v2}, Ljava/io/File;->setReadable(ZZ)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjk;->zzg:Ljava/io/File;

    .line 87
    .line 88
    invoke-virtual {p1, v1, v2}, Ljava/io/File;->setExecutable(ZZ)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-nez p1, :cond_2

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    return-void

    .line 96
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjk;->zzg:Ljava/io/File;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    sget v1, LG6/L;->b:I

    .line 107
    .line 108
    const-string v1, "Could not set cache file permissions at "

    .line 109
    .line 110
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {p1}, LH6/l;->f(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjk;->zzg:Ljava/io/File;

    .line 118
    .line 119
    return-void
.end method

.method private final zza(Ljava/io/File;)Ljava/io/File;
    .locals 4

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfzu;->zza()Lcom/google/android/gms/internal/ads/zzfzv;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcjk;->zzg:Ljava/io/File;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v3, ".done"

    .line 18
    .line 19
    invoke-virtual {p1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzfzv;->zza(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method


# virtual methods
.method public final zze(Ljava/lang/String;)Z
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v8, " sec"

    .line 6
    .line 7
    const-string v9, "Timeout exceeded. Limit: "

    .line 8
    .line 9
    const-string v0, " at "

    .line 10
    .line 11
    const-string v3, "HTTP status code "

    .line 12
    .line 13
    const-string v4, "HTTP request failed. Code: "

    .line 14
    .line 15
    const-string v10, "Preloaded "

    .line 16
    .line 17
    const-string v5, " exceeds limit at "

    .line 18
    .line 19
    const-string v6, "Content length "

    .line 20
    .line 21
    const-string v11, "Stream cache aborted, missing content-length header at "

    .line 22
    .line 23
    const-string v12, "Stream cache already in progress at "

    .line 24
    .line 25
    const-string v13, " bytes from "

    .line 26
    .line 27
    const-string v14, "Caching "

    .line 28
    .line 29
    iget-object v15, v1, Lcom/google/android/gms/internal/ads/zzcjk;->zzg:Ljava/io/File;

    .line 30
    .line 31
    const/16 v16, 0x1

    .line 32
    .line 33
    const/16 v17, 0x0

    .line 34
    .line 35
    if-eqz v15, :cond_1b

    .line 36
    .line 37
    :goto_0
    iget-object v15, v1, Lcom/google/android/gms/internal/ads/zzcjk;->zzg:Ljava/io/File;

    .line 38
    .line 39
    if-nez v15, :cond_0

    .line 40
    .line 41
    move/from16 v7, v17

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_0
    invoke-virtual {v15}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 45
    .line 46
    .line 47
    move-result-object v15

    .line 48
    array-length v7, v15

    .line 49
    move-object/from16 v18, v15

    .line 50
    .line 51
    move/from16 v15, v17

    .line 52
    .line 53
    move/from16 v19, v15

    .line 54
    .line 55
    :goto_1
    if-ge v15, v7, :cond_2

    .line 56
    .line 57
    aget-object v20, v18, v15

    .line 58
    .line 59
    move/from16 v21, v7

    .line 60
    .line 61
    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    move/from16 v20, v15

    .line 66
    .line 67
    const-string v15, ".done"

    .line 68
    .line 69
    invoke-virtual {v7, v15}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-nez v7, :cond_1

    .line 74
    .line 75
    add-int/lit8 v19, v19, 0x1

    .line 76
    .line 77
    :cond_1
    add-int/lit8 v15, v20, 0x1

    .line 78
    .line 79
    move/from16 v7, v21

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    move/from16 v7, v19

    .line 83
    .line 84
    :goto_2
    sget-object v15, Lcom/google/android/gms/internal/ads/zzbix;->zzy:Lcom/google/android/gms/internal/ads/zzbio;

    .line 85
    .line 86
    move-object/from16 v18, v10

    .line 87
    .line 88
    sget-object v10, LD6/s;->e:LD6/s;

    .line 89
    .line 90
    move-object/from16 v19, v8

    .line 91
    .line 92
    iget-object v8, v10, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 93
    .line 94
    invoke-virtual {v8, v15}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    check-cast v8, Ljava/lang/Integer;

    .line 99
    .line 100
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-le v7, v8, :cond_9

    .line 105
    .line 106
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzcjk;->zzg:Ljava/io/File;

    .line 107
    .line 108
    if-nez v7, :cond_4

    .line 109
    .line 110
    :cond_3
    move/from16 v7, v17

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_4
    invoke-virtual {v7}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    array-length v8, v7

    .line 118
    const-wide v20, 0x7fffffffffffffffL

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    move/from16 v10, v17

    .line 124
    .line 125
    const/4 v15, 0x0

    .line 126
    :goto_3
    if-ge v10, v8, :cond_6

    .line 127
    .line 128
    aget-object v22, v7, v10

    .line 129
    .line 130
    move-object/from16 v23, v7

    .line 131
    .line 132
    invoke-virtual/range {v22 .. v22}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    move/from16 v24, v8

    .line 137
    .line 138
    const-string v8, ".done"

    .line 139
    .line 140
    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    if-nez v7, :cond_5

    .line 145
    .line 146
    invoke-virtual/range {v22 .. v22}, Ljava/io/File;->lastModified()J

    .line 147
    .line 148
    .line 149
    move-result-wide v7

    .line 150
    cmp-long v25, v7, v20

    .line 151
    .line 152
    if-gez v25, :cond_5

    .line 153
    .line 154
    move-wide/from16 v20, v7

    .line 155
    .line 156
    move-object/from16 v15, v22

    .line 157
    .line 158
    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 159
    .line 160
    move-object/from16 v7, v23

    .line 161
    .line 162
    move/from16 v8, v24

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_6
    if-eqz v15, :cond_3

    .line 166
    .line 167
    invoke-virtual {v15}, Ljava/io/File;->delete()Z

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    invoke-direct {v1, v15}, Lcom/google/android/gms/internal/ads/zzcjk;->zza(Ljava/io/File;)Ljava/io/File;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    .line 176
    .line 177
    .line 178
    move-result v10

    .line 179
    if-eqz v10, :cond_7

    .line 180
    .line 181
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    and-int/2addr v7, v8

    .line 186
    :cond_7
    :goto_4
    if-nez v7, :cond_8

    .line 187
    .line 188
    sget v0, LG6/L;->b:I

    .line 189
    .line 190
    const-string v0, "Unable to expire stream cache"

    .line 191
    .line 192
    invoke-static {v0}, LH6/l;->f(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    const-string v0, "expireFailed"

    .line 196
    .line 197
    const/4 v3, 0x0

    .line 198
    invoke-virtual {v1, v2, v3, v0, v3}, Lcom/google/android/gms/internal/ads/zzcjh;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    return v17

    .line 202
    :cond_8
    move-object/from16 v10, v18

    .line 203
    .line 204
    move-object/from16 v8, v19

    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :cond_9
    const-string v7, "MD5"

    .line 209
    .line 210
    invoke-static {v2, v7}, LH6/f;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    new-instance v8, Ljava/io/File;

    .line 215
    .line 216
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfzu;->zza()Lcom/google/android/gms/internal/ads/zzfzv;

    .line 217
    .line 218
    .line 219
    move-result-object v15

    .line 220
    move-object/from16 v20, v9

    .line 221
    .line 222
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzcjk;->zzg:Ljava/io/File;

    .line 223
    .line 224
    invoke-interface {v15, v9, v7}, Lcom/google/android/gms/internal/ads/zzfzv;->zza(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    invoke-direct {v8, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-direct {v1, v8}, Lcom/google/android/gms/internal/ads/zzcjk;->zza(Ljava/io/File;)Ljava/io/File;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    .line 236
    .line 237
    .line 238
    move-result v9

    .line 239
    if-eqz v9, :cond_a

    .line 240
    .line 241
    invoke-virtual {v7}, Ljava/io/File;->isFile()Z

    .line 242
    .line 243
    .line 244
    move-result v9

    .line 245
    if-eqz v9, :cond_a

    .line 246
    .line 247
    invoke-virtual {v8}, Ljava/io/File;->length()J

    .line 248
    .line 249
    .line 250
    move-result-wide v3

    .line 251
    long-to-int v0, v3

    .line 252
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    sget v4, LG6/L;->b:I

    .line 257
    .line 258
    const-string v4, "Stream cache hit at "

    .line 259
    .line 260
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-static {v3}, LH6/l;->a(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/internal/ads/zzcjh;->zzo(Ljava/lang/String;Ljava/lang/String;I)V

    .line 272
    .line 273
    .line 274
    return v16

    .line 275
    :cond_a
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzcjk;->zzg:Ljava/io/File;

    .line 276
    .line 277
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v9

    .line 281
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v9

    .line 285
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v15

    .line 289
    move-object/from16 v21, v7

    .line 290
    .line 291
    sget-object v7, Lcom/google/android/gms/internal/ads/zzcjk;->zze:Ljava/util/Set;

    .line 292
    .line 293
    invoke-virtual {v9, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    monitor-enter v7

    .line 298
    :try_start_0
    invoke-interface {v7, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v15

    .line 302
    if-eqz v15, :cond_b

    .line 303
    .line 304
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    add-int/lit8 v0, v0, 0x24

    .line 313
    .line 314
    new-instance v3, Ljava/lang/StringBuilder;

    .line 315
    .line 316
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    sget v3, LG6/L;->b:I

    .line 330
    .line 331
    invoke-static {v0}, LH6/l;->f(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    const-string v3, "inProgress"

    .line 339
    .line 340
    const/4 v4, 0x0

    .line 341
    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/google/android/gms/internal/ads/zzcjh;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    monitor-exit v7

    .line 345
    return v17

    .line 346
    :catchall_0
    move-exception v0

    .line 347
    goto/16 :goto_18

    .line 348
    .line 349
    :cond_b
    invoke-interface {v7, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 353
    const-string v12, "error"

    .line 354
    .line 355
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgag;->zza()Lcom/google/android/gms/internal/ads/zzgas;

    .line 356
    .line 357
    .line 358
    move-result-object v15
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_14
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_13

    .line 359
    move-object/from16 v22, v12

    .line 360
    .line 361
    :try_start_2
    new-instance v12, Lcom/google/android/gms/internal/ads/zzcjj;

    .line 362
    .line 363
    invoke-direct {v12, v2}, Lcom/google/android/gms/internal/ads/zzcjj;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_12
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_11

    .line 364
    .line 365
    .line 366
    move-object/from16 v23, v8

    .line 367
    .line 368
    const/16 v8, 0x109

    .line 369
    .line 370
    move-object/from16 v24, v13

    .line 371
    .line 372
    const/4 v13, -0x1

    .line 373
    :try_start_3
    invoke-virtual {v15, v12, v8, v13}, Lcom/google/android/gms/internal/ads/zzgas;->zzh(Lcom/google/android/gms/internal/ads/zzgai;II)Ljava/net/HttpURLConnection;

    .line 374
    .line 375
    .line 376
    move-result-object v8

    .line 377
    instance-of v12, v8, Ljava/net/HttpURLConnection;

    .line 378
    .line 379
    if-eqz v12, :cond_d

    .line 380
    .line 381
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 382
    .line 383
    .line 384
    move-result v12

    .line 385
    const/16 v13, 0x190

    .line 386
    .line 387
    if-ge v12, v13, :cond_c

    .line 388
    .line 389
    goto :goto_a

    .line 390
    :cond_c
    const-string v5, "badUrl"
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4

    .line 391
    .line 392
    :try_start_4
    invoke-static {v12}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v7

    .line 400
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 401
    .line 402
    .line 403
    move-result v7

    .line 404
    add-int/lit8 v7, v7, 0x1b

    .line 405
    .line 406
    new-instance v8, Ljava/lang/StringBuilder;

    .line 407
    .line 408
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v4
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2

    .line 421
    :try_start_5
    new-instance v6, Ljava/io/IOException;

    .line 422
    .line 423
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v7

    .line 427
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 428
    .line 429
    .line 430
    move-result v7

    .line 431
    add-int/lit8 v7, v7, 0x15

    .line 432
    .line 433
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v8

    .line 437
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 438
    .line 439
    .line 440
    move-result v8

    .line 441
    add-int/2addr v7, v8

    .line 442
    new-instance v8, Ljava/lang/StringBuilder;

    .line 443
    .line 444
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-direct {v6, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    throw v6
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0

    .line 467
    :catch_0
    move-exception v0

    .line 468
    goto :goto_5

    .line 469
    :catch_1
    move-exception v0

    .line 470
    :goto_5
    move-object v12, v5

    .line 471
    move-object/from16 v15, v23

    .line 472
    .line 473
    :goto_6
    const/4 v7, 0x0

    .line 474
    goto/16 :goto_16

    .line 475
    .line 476
    :catch_2
    move-exception v0

    .line 477
    goto :goto_7

    .line 478
    :catch_3
    move-exception v0

    .line 479
    :goto_7
    move-object v12, v5

    .line 480
    move-object/from16 v15, v23

    .line 481
    .line 482
    :goto_8
    const/4 v4, 0x0

    .line 483
    goto :goto_6

    .line 484
    :catch_4
    move-exception v0

    .line 485
    :goto_9
    move-object/from16 v15, v23

    .line 486
    .line 487
    goto/16 :goto_15

    .line 488
    .line 489
    :catch_5
    move-exception v0

    .line 490
    goto :goto_9

    .line 491
    :cond_d
    :goto_a
    :try_start_6
    invoke-virtual {v8}, Ljava/net/URLConnection;->getContentLength()I

    .line 492
    .line 493
    .line 494
    move-result v0

    .line 495
    if-gez v0, :cond_e

    .line 496
    .line 497
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    add-int/lit8 v0, v0, 0x37

    .line 506
    .line 507
    new-instance v3, Ljava/lang/StringBuilder;

    .line 508
    .line 509
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    sget v3, LG6/L;->b:I

    .line 523
    .line 524
    invoke-static {v0}, LH6/l;->f(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v23 .. v23}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    const-string v3, "contentLengthMissing"

    .line 532
    .line 533
    const/4 v4, 0x0

    .line 534
    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/google/android/gms/internal/ads/zzcjh;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    invoke-interface {v7, v9}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    return v17

    .line 541
    :cond_e
    sget-object v11, Lcom/google/android/gms/internal/ads/zzcjk;->zzf:Ljava/text/DecimalFormat;

    .line 542
    .line 543
    int-to-long v3, v0

    .line 544
    invoke-virtual {v11, v3, v4}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v3

    .line 548
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbix;->zzz:Lcom/google/android/gms/internal/ads/zzbio;

    .line 549
    .line 550
    iget-object v12, v10, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 551
    .line 552
    invoke-virtual {v12, v4}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    check-cast v4, Ljava/lang/Integer;

    .line 557
    .line 558
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 559
    .line 560
    .line 561
    move-result v12
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_4

    .line 562
    const-string v13, "File too big for full file cache. Size: "

    .line 563
    .line 564
    if-le v0, v12, :cond_f

    .line 565
    .line 566
    :try_start_7
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 571
    .line 572
    .line 573
    move-result v0

    .line 574
    add-int/lit8 v0, v0, 0x21

    .line 575
    .line 576
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v4

    .line 580
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 581
    .line 582
    .line 583
    move-result v4

    .line 584
    add-int/2addr v0, v4

    .line 585
    new-instance v4, Ljava/lang/StringBuilder;

    .line 586
    .line 587
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    sget v4, LG6/L;->b:I

    .line 607
    .line 608
    invoke-static {v0}, LH6/l;->f(Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 616
    .line 617
    .line 618
    move-result v0

    .line 619
    add-int/lit8 v0, v0, 0x28

    .line 620
    .line 621
    new-instance v4, Ljava/lang/StringBuilder;

    .line 622
    .line 623
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    invoke-virtual/range {v23 .. v23}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v3

    .line 640
    const-string v4, "sizeExceeded"

    .line 641
    .line 642
    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ads/zzcjh;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    invoke-interface {v7, v9}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    return v17

    .line 649
    :cond_f
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v4

    .line 653
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 654
    .line 655
    .line 656
    move-result v4

    .line 657
    add-int/lit8 v4, v4, 0x14

    .line 658
    .line 659
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v5

    .line 663
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 664
    .line 665
    .line 666
    move-result v5

    .line 667
    add-int/2addr v4, v5

    .line 668
    new-instance v5, Ljava/lang/StringBuilder;

    .line 669
    .line 670
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 674
    .line 675
    .line 676
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 677
    .line 678
    .line 679
    move-object/from16 v7, v24

    .line 680
    .line 681
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v3

    .line 691
    sget v4, LG6/L;->b:I

    .line 692
    .line 693
    invoke-static {v3}, LH6/l;->a(Ljava/lang/String;)V

    .line 694
    .line 695
    .line 696
    invoke-virtual {v8}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 697
    .line 698
    .line 699
    move-result-object v3

    .line 700
    invoke-static {v3}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/InputStream;)Ljava/nio/channels/ReadableByteChannel;

    .line 701
    .line 702
    .line 703
    move-result-object v8

    .line 704
    new-instance v14, Ljava/io/FileOutputStream;
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_4

    .line 705
    .line 706
    move-object/from16 v15, v23

    .line 707
    .line 708
    :try_start_8
    invoke-direct {v14, v15}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_10
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_f

    .line 709
    .line 710
    .line 711
    :try_start_9
    invoke-virtual {v14}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 712
    .line 713
    .line 714
    move-result-object v3

    .line 715
    const/high16 v4, 0x100000

    .line 716
    .line 717
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 718
    .line 719
    .line 720
    move-result-object v4

    .line 721
    sget-object v5, LC6/n;->D:LC6/n;

    .line 722
    .line 723
    iget-object v5, v5, LC6/n;->k:Ln7/b;

    .line 724
    .line 725
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 729
    .line 730
    .line 731
    move-result-wide v23

    .line 732
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbix;->zzar:Lcom/google/android/gms/internal/ads/zzbio;

    .line 733
    .line 734
    iget-object v6, v10, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 735
    .line 736
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v5

    .line 740
    check-cast v5, Ljava/lang/Long;

    .line 741
    .line 742
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 743
    .line 744
    .line 745
    move-result-wide v5
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_e
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_d

    .line 746
    move-object/from16 v25, v14

    .line 747
    .line 748
    :try_start_a
    new-instance v14, LG6/C;

    .line 749
    .line 750
    invoke-direct {v14, v5, v6}, LG6/C;-><init>(J)V

    .line 751
    .line 752
    .line 753
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbix;->zzaq:Lcom/google/android/gms/internal/ads/zzbio;

    .line 754
    .line 755
    iget-object v6, v10, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 756
    .line 757
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v5

    .line 761
    check-cast v5, Ljava/lang/Long;

    .line 762
    .line 763
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 764
    .line 765
    .line 766
    move-result-wide v26

    .line 767
    move/from16 v5, v17

    .line 768
    .line 769
    :goto_b
    invoke-interface {v8, v4}, Ljava/nio/channels/ReadableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 770
    .line 771
    .line 772
    move-result v6

    .line 773
    if-ltz v6, :cond_15

    .line 774
    .line 775
    add-int/2addr v5, v6

    .line 776
    if-gt v5, v12, :cond_14

    .line 777
    .line 778
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 779
    .line 780
    .line 781
    :goto_c
    invoke-virtual {v3, v4}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 782
    .line 783
    .line 784
    move-result v6

    .line 785
    if-gtz v6, :cond_13

    .line 786
    .line 787
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 788
    .line 789
    .line 790
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 791
    .line 792
    .line 793
    move-result-wide v28

    .line 794
    sub-long v28, v28, v23

    .line 795
    .line 796
    const-wide/16 v30, 0x3e8

    .line 797
    .line 798
    mul-long v30, v30, v26

    .line 799
    .line 800
    cmp-long v6, v28, v30

    .line 801
    .line 802
    if-gtz v6, :cond_12

    .line 803
    .line 804
    iget-boolean v6, v1, Lcom/google/android/gms/internal/ads/zzcjk;->zzh:Z

    .line 805
    .line 806
    if-nez v6, :cond_11

    .line 807
    .line 808
    invoke-virtual {v14}, LG6/C;->a()Z

    .line 809
    .line 810
    .line 811
    move-result v6

    .line 812
    if-eqz v6, :cond_10

    .line 813
    .line 814
    move-object v6, v3

    .line 815
    invoke-virtual {v15}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v3

    .line 819
    sget-object v10, LH6/f;->b:Lcom/google/android/gms/internal/ads/zzgax;

    .line 820
    .line 821
    move-object/from16 v28, v4

    .line 822
    .line 823
    move v4, v5

    .line 824
    move v5, v0

    .line 825
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcjb;

    .line 826
    .line 827
    move-object/from16 v29, v6

    .line 828
    .line 829
    const/4 v6, 0x0

    .line 830
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzcjb;-><init>(Lcom/google/android/gms/internal/ads/zzcjh;Ljava/lang/String;Ljava/lang/String;IIZ)V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v10, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 834
    .line 835
    .line 836
    goto :goto_d

    .line 837
    :catch_6
    move-exception v0

    .line 838
    goto/16 :goto_12

    .line 839
    .line 840
    :catch_7
    move-exception v0

    .line 841
    goto/16 :goto_12

    .line 842
    .line 843
    :cond_10
    move-object/from16 v29, v3

    .line 844
    .line 845
    move-object/from16 v28, v4

    .line 846
    .line 847
    move v4, v5

    .line 848
    move v5, v0

    .line 849
    :goto_d
    move v0, v5

    .line 850
    move-object/from16 v3, v29

    .line 851
    .line 852
    move v5, v4

    .line 853
    move-object/from16 v4, v28

    .line 854
    .line 855
    goto :goto_b

    .line 856
    :cond_11
    const-string v12, "externalAbort"
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_6

    .line 857
    .line 858
    :try_start_b
    new-instance v0, Ljava/io/IOException;

    .line 859
    .line 860
    const-string v3, "abort requested"

    .line 861
    .line 862
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 863
    .line 864
    .line 865
    throw v0
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_8

    .line 866
    :catch_8
    move-exception v0

    .line 867
    goto :goto_e

    .line 868
    :catch_9
    move-exception v0

    .line 869
    :goto_e
    move-object/from16 v7, v25

    .line 870
    .line 871
    const/4 v4, 0x0

    .line 872
    goto/16 :goto_16

    .line 873
    .line 874
    :cond_12
    :try_start_c
    const-string v12, "downloadTimeout"
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_6

    .line 875
    .line 876
    :try_start_d
    invoke-static/range {v26 .. v27}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 877
    .line 878
    .line 879
    move-result-object v0

    .line 880
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 881
    .line 882
    .line 883
    move-result-object v3

    .line 884
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 885
    .line 886
    .line 887
    move-result v3

    .line 888
    add-int/lit8 v3, v3, 0x1d

    .line 889
    .line 890
    new-instance v4, Ljava/lang/StringBuilder;

    .line 891
    .line 892
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 893
    .line 894
    .line 895
    move-object/from16 v3, v20

    .line 896
    .line 897
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 898
    .line 899
    .line 900
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 901
    .line 902
    .line 903
    move-object/from16 v0, v19

    .line 904
    .line 905
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 909
    .line 910
    .line 911
    move-result-object v7
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_8

    .line 912
    :try_start_e
    new-instance v0, Ljava/io/IOException;

    .line 913
    .line 914
    const-string v3, "stream cache time limit exceeded"

    .line 915
    .line 916
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 917
    .line 918
    .line 919
    throw v0
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_a

    .line 920
    :catch_a
    move-exception v0

    .line 921
    goto :goto_f

    .line 922
    :catch_b
    move-exception v0

    .line 923
    :goto_f
    move-object v4, v7

    .line 924
    move-object/from16 v7, v25

    .line 925
    .line 926
    goto/16 :goto_16

    .line 927
    .line 928
    :cond_13
    move-object/from16 v28, v4

    .line 929
    .line 930
    move v4, v5

    .line 931
    move-object/from16 v4, v28

    .line 932
    .line 933
    goto/16 :goto_c

    .line 934
    .line 935
    :cond_14
    move v4, v5

    .line 936
    :try_start_f
    const-string v12, "sizeExceeded"
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_f .. :try_end_f} :catch_6

    .line 937
    .line 938
    :try_start_10
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 943
    .line 944
    .line 945
    move-result-object v3

    .line 946
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 947
    .line 948
    .line 949
    move-result v3

    .line 950
    add-int/lit8 v3, v3, 0x28

    .line 951
    .line 952
    new-instance v4, Ljava/lang/StringBuilder;

    .line 953
    .line 954
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 955
    .line 956
    .line 957
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 958
    .line 959
    .line 960
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 961
    .line 962
    .line 963
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 964
    .line 965
    .line 966
    move-result-object v7
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_10 .. :try_end_10} :catch_8

    .line 967
    :try_start_11
    new-instance v0, Ljava/io/IOException;

    .line 968
    .line 969
    const-string v3, "stream cache file size limit exceeded"

    .line 970
    .line 971
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 972
    .line 973
    .line 974
    throw v0
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_11 .. :try_end_11} :catch_a

    .line 975
    :cond_15
    :try_start_12
    invoke-virtual/range {v25 .. v25}, Ljava/io/FileOutputStream;->close()V

    .line 976
    .line 977
    .line 978
    const/4 v0, 0x3

    .line 979
    invoke-static {v0}, LH6/l;->j(I)Z

    .line 980
    .line 981
    .line 982
    move-result v0

    .line 983
    if-eqz v0, :cond_16

    .line 984
    .line 985
    int-to-long v3, v5

    .line 986
    invoke-virtual {v11, v3, v4}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 987
    .line 988
    .line 989
    move-result-object v0

    .line 990
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 991
    .line 992
    .line 993
    move-result-object v3

    .line 994
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 995
    .line 996
    .line 997
    move-result v3

    .line 998
    add-int/lit8 v3, v3, 0x16

    .line 999
    .line 1000
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v4

    .line 1004
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1005
    .line 1006
    .line 1007
    move-result v4

    .line 1008
    add-int/2addr v3, v4

    .line 1009
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1010
    .line 1011
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1012
    .line 1013
    .line 1014
    move-object/from16 v3, v18

    .line 1015
    .line 1016
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v0

    .line 1032
    invoke-static {v0}, LH6/l;->a(Ljava/lang/String;)V

    .line 1033
    .line 1034
    .line 1035
    :cond_16
    move/from16 v0, v16

    .line 1036
    .line 1037
    move/from16 v3, v17

    .line 1038
    .line 1039
    invoke-virtual {v15, v0, v3}, Ljava/io/File;->setReadable(ZZ)Z

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual/range {v21 .. v21}, Ljava/io/File;->isFile()Z

    .line 1043
    .line 1044
    .line 1045
    move-result v0

    .line 1046
    if-eqz v0, :cond_17

    .line 1047
    .line 1048
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1049
    .line 1050
    .line 1051
    move-result-wide v3

    .line 1052
    move-object/from16 v0, v21

    .line 1053
    .line 1054
    invoke-virtual {v0, v3, v4}, Ljava/io/File;->setLastModified(J)Z
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_12 .. :try_end_12} :catch_6

    .line 1055
    .line 1056
    .line 1057
    goto :goto_10

    .line 1058
    :cond_17
    move-object/from16 v0, v21

    .line 1059
    .line 1060
    :try_start_13
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_c
    .catch Ljava/lang/RuntimeException; {:try_start_13 .. :try_end_13} :catch_6

    .line 1061
    .line 1062
    .line 1063
    :catch_c
    :goto_10
    :try_start_14
    invoke-virtual {v15}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    invoke-virtual {v1, v2, v0, v5}, Lcom/google/android/gms/internal/ads/zzcjh;->zzo(Ljava/lang/String;Ljava/lang/String;I)V

    .line 1068
    .line 1069
    .line 1070
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcjk;->zze:Ljava/util/Set;

    .line 1071
    .line 1072
    invoke-interface {v0, v9}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_14 .. :try_end_14} :catch_6

    .line 1073
    .line 1074
    .line 1075
    const/16 v16, 0x1

    .line 1076
    .line 1077
    return v16

    .line 1078
    :catch_d
    move-exception v0

    .line 1079
    :goto_11
    move-object/from16 v25, v14

    .line 1080
    .line 1081
    goto :goto_12

    .line 1082
    :catch_e
    move-exception v0

    .line 1083
    goto :goto_11

    .line 1084
    :goto_12
    move-object/from16 v12, v22

    .line 1085
    .line 1086
    goto/16 :goto_e

    .line 1087
    .line 1088
    :catch_f
    move-exception v0

    .line 1089
    goto :goto_15

    .line 1090
    :catch_10
    move-exception v0

    .line 1091
    goto :goto_15

    .line 1092
    :catch_11
    move-exception v0

    .line 1093
    :goto_13
    move-object v15, v8

    .line 1094
    goto :goto_15

    .line 1095
    :catch_12
    move-exception v0

    .line 1096
    goto :goto_13

    .line 1097
    :catch_13
    move-exception v0

    .line 1098
    :goto_14
    move-object v15, v8

    .line 1099
    move-object/from16 v22, v12

    .line 1100
    .line 1101
    goto :goto_15

    .line 1102
    :catch_14
    move-exception v0

    .line 1103
    goto :goto_14

    .line 1104
    :goto_15
    move-object/from16 v12, v22

    .line 1105
    .line 1106
    goto/16 :goto_8

    .line 1107
    .line 1108
    :goto_16
    instance-of v3, v0, Ljava/lang/RuntimeException;

    .line 1109
    .line 1110
    if-eqz v3, :cond_18

    .line 1111
    .line 1112
    const-string v3, "VideoStreamFullFileCache.preload"

    .line 1113
    .line 1114
    sget-object v5, LC6/n;->D:LC6/n;

    .line 1115
    .line 1116
    iget-object v5, v5, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 1117
    .line 1118
    invoke-virtual {v5, v0, v3}, Lcom/google/android/gms/internal/ads/zzcfk;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 1119
    .line 1120
    .line 1121
    :cond_18
    :try_start_15
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_15
    .catch Ljava/lang/NullPointerException; {:try_start_15 .. :try_end_15} :catch_15

    .line 1122
    .line 1123
    .line 1124
    :catch_15
    iget-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzcjk;->zzh:Z

    .line 1125
    .line 1126
    const-string v5, "\""

    .line 1127
    .line 1128
    if-eqz v3, :cond_19

    .line 1129
    .line 1130
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v0

    .line 1134
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1135
    .line 1136
    .line 1137
    move-result v0

    .line 1138
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1139
    .line 1140
    add-int/lit8 v0, v0, 0x1a

    .line 1141
    .line 1142
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1143
    .line 1144
    .line 1145
    const-string v0, "Preload aborted for URL \""

    .line 1146
    .line 1147
    invoke-static {v3, v0, v2, v5}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v0

    .line 1151
    sget v3, LG6/L;->b:I

    .line 1152
    .line 1153
    invoke-static {v0}, LH6/l;->e(Ljava/lang/String;)V

    .line 1154
    .line 1155
    .line 1156
    goto :goto_17

    .line 1157
    :cond_19
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v3

    .line 1161
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1162
    .line 1163
    .line 1164
    move-result v3

    .line 1165
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1166
    .line 1167
    add-int/lit8 v3, v3, 0x19

    .line 1168
    .line 1169
    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1170
    .line 1171
    .line 1172
    const-string v3, "Preload failed for URL \""

    .line 1173
    .line 1174
    invoke-static {v6, v3, v2, v5}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v3

    .line 1178
    sget v5, LG6/L;->b:I

    .line 1179
    .line 1180
    invoke-static {v3, v0}, LH6/l;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1181
    .line 1182
    .line 1183
    :goto_17
    invoke-virtual {v15}, Ljava/io/File;->exists()Z

    .line 1184
    .line 1185
    .line 1186
    move-result v0

    .line 1187
    if-eqz v0, :cond_1a

    .line 1188
    .line 1189
    invoke-virtual {v15}, Ljava/io/File;->delete()Z

    .line 1190
    .line 1191
    .line 1192
    move-result v0

    .line 1193
    if-nez v0, :cond_1a

    .line 1194
    .line 1195
    invoke-virtual {v15}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v0

    .line 1199
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v0

    .line 1203
    const-string v3, "Could not delete partial cache file at "

    .line 1204
    .line 1205
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v0

    .line 1209
    invoke-static {v0}, LH6/l;->f(Ljava/lang/String;)V

    .line 1210
    .line 1211
    .line 1212
    :cond_1a
    invoke-virtual {v15}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v0

    .line 1216
    invoke-virtual {v1, v2, v0, v12, v4}, Lcom/google/android/gms/internal/ads/zzcjh;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1217
    .line 1218
    .line 1219
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcjk;->zze:Ljava/util/Set;

    .line 1220
    .line 1221
    invoke-interface {v0, v9}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1222
    .line 1223
    .line 1224
    const/16 v17, 0x0

    .line 1225
    .line 1226
    return v17

    .line 1227
    :goto_18
    :try_start_16
    monitor-exit v7
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    .line 1228
    throw v0

    .line 1229
    :cond_1b
    const-string v0, "noCacheDir"

    .line 1230
    .line 1231
    const/4 v4, 0x0

    .line 1232
    invoke-virtual {v1, v2, v4, v0, v4}, Lcom/google/android/gms/internal/ads/zzcjh;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1233
    .line 1234
    .line 1235
    const/16 v17, 0x0

    .line 1236
    .line 1237
    return v17
.end method

.method public final zzl()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjk;->zzh:Z

    return-void
.end method
