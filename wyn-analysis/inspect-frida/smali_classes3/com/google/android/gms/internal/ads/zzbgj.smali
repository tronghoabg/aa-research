.class public final Lcom/google/android/gms/internal/ads/zzbgj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzbfz;

.field private final zzb:I

.field private final zzc:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbgj;->zzb:I

    const/16 p1, 0x40

    if-gt p2, p1, :cond_0

    if-gez p2, :cond_1

    :cond_0
    move p2, p1

    :cond_1
    if-gtz p3, :cond_2

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbgj;->zzc:I

    goto :goto_0

    :cond_2
    iput p3, p0, Lcom/google/android/gms/internal/ads/zzbgj;->zzc:I

    :goto_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbgh;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzbgh;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbgj;->zza:Lcom/google/android/gms/internal/ads/zzbfz;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    new-instance v3, Lcom/google/android/gms/internal/ads/zzbgi;

    .line 7
    .line 8
    invoke-direct {v3, v1}, Lcom/google/android/gms/internal/ads/zzbgi;-><init>(Lcom/google/android/gms/internal/ads/zzbgj;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 12
    .line 13
    .line 14
    new-instance v3, Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-ge v5, v6, :cond_10

    .line 25
    .line 26
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    check-cast v6, Lcom/google/android/gms/internal/ads/zzbfy;

    .line 31
    .line 32
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzbfy;->zze()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    move-object/from16 v7, p1

    .line 37
    .line 38
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    check-cast v6, Ljava/lang/CharSequence;

    .line 43
    .line 44
    sget-object v8, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    .line 45
    .line 46
    invoke-static {v6, v8}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 51
    .line 52
    invoke-virtual {v6, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    const-string v8, "\n"

    .line 57
    .line 58
    invoke-virtual {v6, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    array-length v8, v6

    .line 63
    if-nez v8, :cond_0

    .line 64
    .line 65
    goto/16 :goto_a

    .line 66
    .line 67
    :cond_0
    const/4 v8, 0x0

    .line 68
    :goto_1
    array-length v9, v6

    .line 69
    if-ge v8, v9, :cond_f

    .line 70
    .line 71
    aget-object v9, v6, v8

    .line 72
    .line 73
    const-string v10, "\'"

    .line 74
    .line 75
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    if-eqz v10, :cond_8

    .line 80
    .line 81
    new-instance v10, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    move v11, v2

    .line 87
    const/4 v12, 0x0

    .line 88
    :goto_2
    add-int/lit8 v13, v11, 0x2

    .line 89
    .line 90
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    .line 91
    .line 92
    .line 93
    move-result v14

    .line 94
    if-gt v13, v14, :cond_5

    .line 95
    .line 96
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 97
    .line 98
    .line 99
    move-result v14

    .line 100
    const/16 v15, 0x27

    .line 101
    .line 102
    if-ne v14, v15, :cond_4

    .line 103
    .line 104
    add-int/lit8 v12, v11, -0x1

    .line 105
    .line 106
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    const/16 v14, 0x20

    .line 111
    .line 112
    if-eq v12, v14, :cond_3

    .line 113
    .line 114
    add-int/lit8 v12, v11, 0x1

    .line 115
    .line 116
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 117
    .line 118
    .line 119
    move-result v15

    .line 120
    const/16 v4, 0x73

    .line 121
    .line 122
    if-eq v15, v4, :cond_1

    .line 123
    .line 124
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    const/16 v12, 0x53

    .line 129
    .line 130
    if-ne v4, v12, :cond_3

    .line 131
    .line 132
    :cond_1
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    if-eq v13, v4, :cond_2

    .line 137
    .line 138
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-ne v4, v14, :cond_3

    .line 143
    .line 144
    :cond_2
    invoke-virtual {v10, v11, v14}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    move v11, v13

    .line 148
    goto :goto_3

    .line 149
    :cond_3
    invoke-virtual {v10, v11, v14}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    .line 150
    .line 151
    .line 152
    :goto_3
    move v12, v2

    .line 153
    :cond_4
    add-int/2addr v11, v2

    .line 154
    goto :goto_2

    .line 155
    :cond_5
    if-eqz v12, :cond_6

    .line 156
    .line 157
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    goto :goto_4

    .line 162
    :cond_6
    const/4 v4, 0x0

    .line 163
    :goto_4
    if-nez v4, :cond_7

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_7
    move-object v9, v4

    .line 167
    :cond_8
    :goto_5
    invoke-static {v9, v2}, Lcom/google/android/gms/internal/ads/zzbgd;->zzb(Ljava/lang/String;Z)[Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    array-length v9, v4

    .line 172
    iget v10, v1, Lcom/google/android/gms/internal/ads/zzbgj;->zzc:I

    .line 173
    .line 174
    if-ge v9, v10, :cond_9

    .line 175
    .line 176
    goto :goto_9

    .line 177
    :cond_9
    const/4 v9, 0x0

    .line 178
    :goto_6
    array-length v11, v4

    .line 179
    if-ge v9, v11, :cond_d

    .line 180
    .line 181
    const-string v11, ""

    .line 182
    .line 183
    const/4 v12, 0x0

    .line 184
    :goto_7
    if-ge v12, v10, :cond_c

    .line 185
    .line 186
    add-int v13, v9, v12

    .line 187
    .line 188
    array-length v14, v4

    .line 189
    if-lt v13, v14, :cond_a

    .line 190
    .line 191
    goto :goto_8

    .line 192
    :cond_a
    if-lez v12, :cond_b

    .line 193
    .line 194
    const-string v14, " "

    .line 195
    .line 196
    invoke-virtual {v11, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    :cond_b
    aget-object v13, v4, v13

    .line 201
    .line 202
    invoke-static {v13}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v13

    .line 206
    invoke-virtual {v11, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v11

    .line 210
    add-int/2addr v12, v2

    .line 211
    goto :goto_7

    .line 212
    :cond_c
    invoke-virtual {v3, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    .line 216
    .line 217
    .line 218
    move-result v11

    .line 219
    iget v12, v1, Lcom/google/android/gms/internal/ads/zzbgj;->zzb:I

    .line 220
    .line 221
    if-ge v11, v12, :cond_10

    .line 222
    .line 223
    add-int/2addr v9, v2

    .line 224
    goto :goto_6

    .line 225
    :cond_d
    :goto_8
    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    iget v9, v1, Lcom/google/android/gms/internal/ads/zzbgj;->zzb:I

    .line 230
    .line 231
    if-lt v4, v9, :cond_e

    .line 232
    .line 233
    goto :goto_b

    .line 234
    :cond_e
    :goto_9
    add-int/2addr v8, v2

    .line 235
    goto/16 :goto_1

    .line 236
    .line 237
    :cond_f
    :goto_a
    add-int/2addr v5, v2

    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :cond_10
    :goto_b
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbgb;

    .line 241
    .line 242
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzbgb;-><init>()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    if-eqz v3, :cond_11

    .line 254
    .line 255
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    check-cast v3, Ljava/lang/String;

    .line 260
    .line 261
    :try_start_0
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzbgj;->zza:Lcom/google/android/gms/internal/ads/zzbfz;

    .line 262
    .line 263
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzbfz;->zza(Ljava/lang/String;)[B

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzbgb;->zzb:Landroid/util/Base64OutputStream;

    .line 268
    .line 269
    invoke-virtual {v4, v3}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 270
    .line 271
    .line 272
    goto :goto_c

    .line 273
    :catch_0
    move-exception v0

    .line 274
    sget v3, LG6/L;->b:I

    .line 275
    .line 276
    const-string v3, "Error while writing hash to byteStream"

    .line 277
    .line 278
    invoke-static {v3, v0}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 279
    .line 280
    .line 281
    :cond_11
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbgb;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    return-object v0
.end method
