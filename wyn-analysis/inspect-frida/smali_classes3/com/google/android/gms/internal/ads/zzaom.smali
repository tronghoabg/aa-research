.class public final Lcom/google/android/gms/internal/ads/zzaom;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzans;


# static fields
.field private static final zza:Ljava/util/regex/Pattern;

.field private static final zzb:Ljava/util/regex/Pattern;


# instance fields
.field private final zzc:Ljava/lang/StringBuilder;

.field private final zzd:Ljava/util/ArrayList;

.field private final zze:Lcom/google/android/gms/internal/ads/zzeu;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaom;->zza:Ljava/util/regex/Pattern;

    const-string v0, "\\{\\\\.*?\\}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaom;->zzb:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaom;->zzc:Ljava/lang/StringBuilder;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaom;->zzd:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeu;

    .line 19
    .line 20
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzeu;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaom;->zze:Lcom/google/android/gms/internal/ads/zzeu;

    .line 24
    .line 25
    return-void
.end method

.method public static zzb(I)F
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    const p0, 0x3f6b851f    # 0.92f

    .line 10
    .line 11
    .line 12
    return p0

    .line 13
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 16
    .line 17
    .line 18
    throw p0

    .line 19
    :cond_1
    const/high16 p0, 0x3f000000    # 0.5f

    .line 20
    .line 21
    return p0

    .line 22
    :cond_2
    const p0, 0x3da3d70a    # 0.08f

    .line 23
    .line 24
    .line 25
    return p0
.end method

.method private static zzc(Ljava/util/regex/Matcher;I)J
    .locals 6

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/32 v2, 0x36ee80

    .line 14
    .line 15
    .line 16
    mul-long/2addr v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    :goto_0
    add-int/lit8 v2, p1, 0x2

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    const-wide/32 v4, 0xea60

    .line 34
    .line 35
    .line 36
    mul-long/2addr v2, v4

    .line 37
    add-long/2addr v2, v0

    .line 38
    add-int/lit8 v0, p1, 0x3

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    const-wide/16 v4, 0x3e8

    .line 52
    .line 53
    mul-long/2addr v0, v4

    .line 54
    add-long/2addr v0, v2

    .line 55
    add-int/lit8 p1, p1, 0x4

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-eqz p0, :cond_1

    .line 62
    .line 63
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 64
    .line 65
    .line 66
    move-result-wide p0

    .line 67
    add-long/2addr v0, p0

    .line 68
    :cond_1
    mul-long/2addr v0, v4

    .line 69
    return-wide v0
.end method


# virtual methods
.method public final zza([BIILcom/google/android/gms/internal/ads/zzanr;Lcom/google/android/gms/internal/ads/zzdu;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "SubripParser"

    .line 6
    .line 7
    add-int v3, v1, p3

    .line 8
    .line 9
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaom;->zze:Lcom/google/android/gms/internal/ads/zzeu;

    .line 10
    .line 11
    move-object/from16 v5, p1

    .line 12
    .line 13
    invoke-virtual {v4, v5, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzb([BI)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzR()Ljava/nio/charset/Charset;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 26
    .line 27
    :cond_0
    :goto_0
    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzN(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v3, :cond_11

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-nez v5, :cond_10

    .line 38
    .line 39
    :try_start_0
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaom;->zze:Lcom/google/android/gms/internal/ads/zzeu;

    .line 43
    .line 44
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzN(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    if-nez v5, :cond_1

    .line 49
    .line 50
    const-string v1, "Unexpected end"

    .line 51
    .line 52
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    sget-object v6, Lcom/google/android/gms/internal/ads/zzaom;->zza:Ljava/util/regex/Pattern;

    .line 57
    .line 58
    invoke-virtual {v6, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_f

    .line 67
    .line 68
    const/4 v5, 0x1

    .line 69
    invoke-static {v6, v5}, Lcom/google/android/gms/internal/ads/zzaom;->zzc(Ljava/util/regex/Matcher;I)J

    .line 70
    .line 71
    .line 72
    move-result-wide v9

    .line 73
    const/4 v7, 0x6

    .line 74
    invoke-static {v6, v7}, Lcom/google/android/gms/internal/ads/zzaom;->zzc(Ljava/util/regex/Matcher;I)J

    .line 75
    .line 76
    .line 77
    move-result-wide v6

    .line 78
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzaom;->zzc:Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const/4 v11, 0x0

    .line 81
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 82
    .line 83
    .line 84
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzaom;->zzd:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzN(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v13

    .line 93
    :goto_1
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result v14

    .line 97
    if-nez v14, :cond_4

    .line 98
    .line 99
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    .line 100
    .line 101
    .line 102
    move-result v14

    .line 103
    if-lez v14, :cond_2

    .line 104
    .line 105
    const-string v14, "<br>"

    .line 106
    .line 107
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    :cond_2
    invoke-virtual {v13}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    new-instance v14, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    sget-object v15, Lcom/google/android/gms/internal/ads/zzaom;->zzb:Ljava/util/regex/Pattern;

    .line 120
    .line 121
    invoke-virtual {v15, v13}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 122
    .line 123
    .line 124
    move-result-object v13

    .line 125
    move v15, v11

    .line 126
    :goto_2
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->find()Z

    .line 127
    .line 128
    .line 129
    move-result v16

    .line 130
    if-eqz v16, :cond_3

    .line 131
    .line 132
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->start()I

    .line 140
    .line 141
    .line 142
    move-result v16

    .line 143
    sub-int v5, v16, v15

    .line 144
    .line 145
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 146
    .line 147
    .line 148
    move-result v11

    .line 149
    add-int v0, v5, v11

    .line 150
    .line 151
    move-object/from16 v16, v4

    .line 152
    .line 153
    const-string v4, ""

    .line 154
    .line 155
    invoke-virtual {v14, v5, v0, v4}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    add-int/2addr v15, v11

    .line 159
    move-object/from16 v0, p0

    .line 160
    .line 161
    move-object/from16 v4, v16

    .line 162
    .line 163
    const/4 v5, 0x1

    .line 164
    const/4 v11, 0x0

    .line 165
    goto :goto_2

    .line 166
    :cond_3
    move-object/from16 v16, v4

    .line 167
    .line 168
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzN(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v13

    .line 179
    move-object/from16 v0, p0

    .line 180
    .line 181
    const/4 v5, 0x1

    .line 182
    const/4 v11, 0x0

    .line 183
    goto :goto_1

    .line 184
    :cond_4
    move-object/from16 v16, v4

    .line 185
    .line 186
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    const/4 v3, 0x0

    .line 195
    :goto_3
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-ge v3, v4, :cond_6

    .line 200
    .line 201
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    check-cast v4, Ljava/lang/String;

    .line 206
    .line 207
    const-string v5, "\\{\\\\an[1-9]\\}"

    .line 208
    .line 209
    invoke-virtual {v4, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    if-eqz v5, :cond_5

    .line 214
    .line 215
    :goto_4
    move-wide v5, v6

    .line 216
    goto :goto_5

    .line 217
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_6
    const/4 v4, 0x0

    .line 221
    goto :goto_4

    .line 222
    :goto_5
    new-instance v7, Lcom/google/android/gms/internal/ads/zzank;

    .line 223
    .line 224
    new-instance v3, Lcom/google/android/gms/internal/ads/zzcx;

    .line 225
    .line 226
    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzcx;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzcx;->zza(Ljava/lang/CharSequence;)Lcom/google/android/gms/internal/ads/zzcx;

    .line 230
    .line 231
    .line 232
    if-nez v4, :cond_7

    .line 233
    .line 234
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzcx;->zzr()Lcom/google/android/gms/internal/ads/zzcy;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    goto/16 :goto_d

    .line 239
    .line 240
    :cond_7
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    const-string v11, "{\\an1}"

    .line 245
    .line 246
    const-string v12, "{\\an3}"

    .line 247
    .line 248
    const-string v13, "{\\an7}"

    .line 249
    .line 250
    const-string v14, "{\\an9}"

    .line 251
    .line 252
    const/4 v8, 0x2

    .line 253
    sparse-switch v0, :sswitch_data_0

    .line 254
    .line 255
    .line 256
    goto :goto_6

    .line 257
    :sswitch_0
    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_8

    .line 262
    .line 263
    const/4 v0, 0x5

    .line 264
    goto :goto_7

    .line 265
    :sswitch_1
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-eqz v0, :cond_8

    .line 270
    .line 271
    move v0, v8

    .line 272
    goto :goto_7

    .line 273
    :sswitch_2
    const-string v0, "{\\an6}"

    .line 274
    .line 275
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-eqz v0, :cond_8

    .line 280
    .line 281
    const/4 v0, 0x4

    .line 282
    goto :goto_7

    .line 283
    :sswitch_3
    const-string v0, "{\\an4}"

    .line 284
    .line 285
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_8

    .line 290
    .line 291
    const/4 v0, 0x1

    .line 292
    goto :goto_7

    .line 293
    :sswitch_4
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    if-eqz v0, :cond_8

    .line 298
    .line 299
    const/4 v0, 0x3

    .line 300
    goto :goto_7

    .line 301
    :sswitch_5
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-eqz v0, :cond_8

    .line 306
    .line 307
    const/4 v0, 0x0

    .line 308
    goto :goto_7

    .line 309
    :cond_8
    :goto_6
    const/4 v0, -0x1

    .line 310
    :goto_7
    if-eqz v0, :cond_a

    .line 311
    .line 312
    const/4 v15, 0x1

    .line 313
    if-eq v0, v15, :cond_a

    .line 314
    .line 315
    if-eq v0, v8, :cond_a

    .line 316
    .line 317
    const/4 v8, 0x3

    .line 318
    if-eq v0, v8, :cond_9

    .line 319
    .line 320
    const/4 v8, 0x4

    .line 321
    if-eq v0, v8, :cond_9

    .line 322
    .line 323
    const/4 v8, 0x5

    .line 324
    if-eq v0, v8, :cond_9

    .line 325
    .line 326
    invoke-virtual {v3, v15}, Lcom/google/android/gms/internal/ads/zzcx;->zzj(I)Lcom/google/android/gms/internal/ads/zzcx;

    .line 327
    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_9
    const/4 v0, 0x2

    .line 331
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzcx;->zzj(I)Lcom/google/android/gms/internal/ads/zzcx;

    .line 332
    .line 333
    .line 334
    goto :goto_8

    .line 335
    :cond_a
    const/4 v0, 0x0

    .line 336
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzcx;->zzj(I)Lcom/google/android/gms/internal/ads/zzcx;

    .line 337
    .line 338
    .line 339
    :goto_8
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    sparse-switch v0, :sswitch_data_1

    .line 344
    .line 345
    .line 346
    goto :goto_9

    .line 347
    :sswitch_6
    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-eqz v0, :cond_b

    .line 352
    .line 353
    const/4 v0, 0x5

    .line 354
    goto :goto_a

    .line 355
    :sswitch_7
    const-string v0, "{\\an8}"

    .line 356
    .line 357
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    if-eqz v0, :cond_b

    .line 362
    .line 363
    const/4 v0, 0x4

    .line 364
    goto :goto_a

    .line 365
    :sswitch_8
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    if-eqz v0, :cond_b

    .line 370
    .line 371
    const/4 v0, 0x3

    .line 372
    goto :goto_a

    .line 373
    :sswitch_9
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-eqz v0, :cond_b

    .line 378
    .line 379
    const/4 v0, 0x2

    .line 380
    goto :goto_a

    .line 381
    :sswitch_a
    const-string v0, "{\\an2}"

    .line 382
    .line 383
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    if-eqz v0, :cond_b

    .line 388
    .line 389
    const/4 v0, 0x1

    .line 390
    goto :goto_a

    .line 391
    :sswitch_b
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    if-eqz v0, :cond_b

    .line 396
    .line 397
    const/4 v0, 0x0

    .line 398
    goto :goto_a

    .line 399
    :cond_b
    :goto_9
    const/4 v0, -0x1

    .line 400
    :goto_a
    if-eqz v0, :cond_e

    .line 401
    .line 402
    const/4 v15, 0x1

    .line 403
    if-eq v0, v15, :cond_e

    .line 404
    .line 405
    const/4 v4, 0x2

    .line 406
    if-eq v0, v4, :cond_d

    .line 407
    .line 408
    const/4 v8, 0x3

    .line 409
    if-eq v0, v8, :cond_c

    .line 410
    .line 411
    const/4 v8, 0x4

    .line 412
    if-eq v0, v8, :cond_c

    .line 413
    .line 414
    const/4 v8, 0x5

    .line 415
    if-eq v0, v8, :cond_c

    .line 416
    .line 417
    invoke-virtual {v3, v15}, Lcom/google/android/gms/internal/ads/zzcx;->zzg(I)Lcom/google/android/gms/internal/ads/zzcx;

    .line 418
    .line 419
    .line 420
    goto :goto_c

    .line 421
    :cond_c
    const/4 v0, 0x0

    .line 422
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzcx;->zzg(I)Lcom/google/android/gms/internal/ads/zzcx;

    .line 423
    .line 424
    .line 425
    goto :goto_c

    .line 426
    :cond_d
    move v0, v4

    .line 427
    goto :goto_b

    .line 428
    :cond_e
    const/4 v0, 0x2

    .line 429
    :goto_b
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzcx;->zzg(I)Lcom/google/android/gms/internal/ads/zzcx;

    .line 430
    .line 431
    .line 432
    :goto_c
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzcx;->zzk()I

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaom;->zzb(I)F

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzcx;->zzi(F)Lcom/google/android/gms/internal/ads/zzcx;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzcx;->zzh()I

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaom;->zzb(I)F

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    const/4 v4, 0x0

    .line 452
    invoke-virtual {v3, v0, v4}, Lcom/google/android/gms/internal/ads/zzcx;->zzf(FI)Lcom/google/android/gms/internal/ads/zzcx;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzcx;->zzr()Lcom/google/android/gms/internal/ads/zzcy;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    :goto_d
    sub-long v11, v5, v9

    .line 460
    .line 461
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 462
    .line 463
    .line 464
    move-result-object v8

    .line 465
    invoke-direct/range {v7 .. v12}, Lcom/google/android/gms/internal/ads/zzank;-><init>(Ljava/util/List;JJ)V

    .line 466
    .line 467
    .line 468
    move-object/from16 v0, p5

    .line 469
    .line 470
    invoke-interface {v0, v7}, Lcom/google/android/gms/internal/ads/zzdu;->zza(Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    goto :goto_e

    .line 474
    :cond_f
    move-object/from16 v0, p5

    .line 475
    .line 476
    move-object/from16 v16, v4

    .line 477
    .line 478
    const-string v3, "Skipping invalid timing: "

    .line 479
    .line 480
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v3

    .line 484
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    goto :goto_e

    .line 488
    :catch_0
    move-object/from16 v0, p5

    .line 489
    .line 490
    move-object/from16 v16, v4

    .line 491
    .line 492
    const-string v4, "Skipping invalid index: "

    .line 493
    .line 494
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    goto :goto_e

    .line 502
    :cond_10
    move-object/from16 v0, p5

    .line 503
    .line 504
    move-object/from16 v16, v4

    .line 505
    .line 506
    :goto_e
    move-object/from16 v0, p0

    .line 507
    .line 508
    move-object/from16 v4, v16

    .line 509
    .line 510
    goto/16 :goto_0

    .line 511
    .line 512
    :cond_11
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x28ddbde6 -> :sswitch_5
        -0x28ddbda8 -> :sswitch_4
        -0x28ddbd89 -> :sswitch_3
        -0x28ddbd4b -> :sswitch_2
        -0x28ddbd2c -> :sswitch_1
        -0x28ddbcee -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x28ddbde6 -> :sswitch_b
        -0x28ddbdc7 -> :sswitch_a
        -0x28ddbda8 -> :sswitch_9
        -0x28ddbd2c -> :sswitch_8
        -0x28ddbd0d -> :sswitch_7
        -0x28ddbcee -> :sswitch_6
    .end sparse-switch
.end method
