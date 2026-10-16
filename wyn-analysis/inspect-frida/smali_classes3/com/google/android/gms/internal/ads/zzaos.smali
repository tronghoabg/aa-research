.class public final Lcom/google/android/gms/internal/ads/zzaos;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzans;


# static fields
.field static final zza:Ljava/util/regex/Pattern;

.field static final zzb:Ljava/util/regex/Pattern;

.field private static final zzc:Ljava/util/regex/Pattern;

.field private static final zzd:Ljava/util/regex/Pattern;

.field private static final zze:Ljava/util/regex/Pattern;

.field private static final zzf:Ljava/util/regex/Pattern;

.field private static final zzg:Ljava/util/regex/Pattern;

.field private static final zzh:Lcom/google/android/gms/internal/ads/zzaoq;


# instance fields
.field private final zzi:Lorg/xmlpull/v1/XmlPullParserFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaos;->zzc:Ljava/util/regex/Pattern;

    const-string v0, "^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaos;->zzd:Ljava/util/regex/Pattern;

    const-string v0, "^(([0-9]*.)?[0-9]+)(px|em|%)$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaos;->zze:Ljava/util/regex/Pattern;

    const-string v0, "^([-+]?\\d+\\.?\\d*?)%$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaos;->zza:Ljava/util/regex/Pattern;

    const-string v0, "^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaos;->zzb:Ljava/util/regex/Pattern;

    const-string v0, "^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaos;->zzf:Ljava/util/regex/Pattern;

    const-string v0, "^(\\d+) (\\d+)$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaos;->zzg:Ljava/util/regex/Pattern;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaoq;

    const/high16 v1, 0x41f00000    # 30.0f

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzaoq;-><init>(FII)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaos;->zzh:Lcom/google/android/gms/internal/ads/zzaoq;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaos;->zzi:Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->setNamespaceAware(Z)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception v0

    .line 16
    new-instance v1, Ljava/lang/RuntimeException;

    .line 17
    .line 18
    const-string v2, "Couldn\'t create XmlPullParserFactory instance"

    .line 19
    .line 20
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    throw v1
.end method

.method private static zzc(Ljava/lang/String;)[Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    new-array p0, p0, [Ljava/lang/String;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 16
    .line 17
    const-string v0, "\\s+"

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method private static zzd(Lorg/xmlpull/v1/XmlPullParser;Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    const/4 v4, 0x0

    .line 9
    move-object/from16 v0, p1

    .line 10
    .line 11
    move v5, v4

    .line 12
    :goto_0
    if-ge v5, v3, :cond_24

    .line 13
    .line 14
    invoke-interface {v1, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    invoke-interface {v1, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v8

    .line 26
    const/4 v9, 0x5

    .line 27
    const/4 v10, 0x4

    .line 28
    const/4 v11, -0x1

    .line 29
    const/4 v12, 0x3

    .line 30
    const/4 v13, 0x2

    .line 31
    sparse-switch v8, :sswitch_data_0

    .line 32
    .line 33
    .line 34
    goto/16 :goto_1

    .line 35
    .line 36
    :sswitch_0
    const-string v8, "multiRowAlign"

    .line 37
    .line 38
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-eqz v7, :cond_0

    .line 43
    .line 44
    const/16 v7, 0x8

    .line 45
    .line 46
    goto/16 :goto_2

    .line 47
    .line 48
    :sswitch_1
    const-string v8, "backgroundColor"

    .line 49
    .line 50
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-eqz v7, :cond_0

    .line 55
    .line 56
    move v7, v2

    .line 57
    goto/16 :goto_2

    .line 58
    .line 59
    :sswitch_2
    const-string v8, "rubyPosition"

    .line 60
    .line 61
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-eqz v7, :cond_0

    .line 66
    .line 67
    const/16 v7, 0xb

    .line 68
    .line 69
    goto/16 :goto_2

    .line 70
    .line 71
    :sswitch_3
    const-string v8, "textEmphasis"

    .line 72
    .line 73
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_0

    .line 78
    .line 79
    const/16 v7, 0xd

    .line 80
    .line 81
    goto/16 :goto_2

    .line 82
    .line 83
    :sswitch_4
    const-string v8, "fontSize"

    .line 84
    .line 85
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-eqz v7, :cond_0

    .line 90
    .line 91
    move v7, v10

    .line 92
    goto/16 :goto_2

    .line 93
    .line 94
    :sswitch_5
    const-string v8, "textCombine"

    .line 95
    .line 96
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-eqz v7, :cond_0

    .line 101
    .line 102
    const/16 v7, 0x9

    .line 103
    .line 104
    goto/16 :goto_2

    .line 105
    .line 106
    :sswitch_6
    const-string v8, "shear"

    .line 107
    .line 108
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-eqz v7, :cond_0

    .line 113
    .line 114
    const/16 v7, 0xe

    .line 115
    .line 116
    goto/16 :goto_2

    .line 117
    .line 118
    :sswitch_7
    const-string v8, "color"

    .line 119
    .line 120
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    if-eqz v7, :cond_0

    .line 125
    .line 126
    move v7, v13

    .line 127
    goto/16 :goto_2

    .line 128
    .line 129
    :sswitch_8
    const-string v8, "ruby"

    .line 130
    .line 131
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    if-eqz v7, :cond_0

    .line 136
    .line 137
    const/16 v7, 0xa

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :sswitch_9
    const-string v8, "id"

    .line 141
    .line 142
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-eqz v7, :cond_0

    .line 147
    .line 148
    move v7, v4

    .line 149
    goto :goto_2

    .line 150
    :sswitch_a
    const-string v8, "fontWeight"

    .line 151
    .line 152
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    if-eqz v7, :cond_0

    .line 157
    .line 158
    move v7, v9

    .line 159
    goto :goto_2

    .line 160
    :sswitch_b
    const-string v8, "textDecoration"

    .line 161
    .line 162
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    if-eqz v7, :cond_0

    .line 167
    .line 168
    const/16 v7, 0xc

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :sswitch_c
    const-string v8, "origin"

    .line 172
    .line 173
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v7

    .line 177
    if-eqz v7, :cond_0

    .line 178
    .line 179
    const/16 v7, 0xf

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :sswitch_d
    const-string v8, "textAlign"

    .line 183
    .line 184
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    if-eqz v7, :cond_0

    .line 189
    .line 190
    const/4 v7, 0x7

    .line 191
    goto :goto_2

    .line 192
    :sswitch_e
    const-string v8, "fontFamily"

    .line 193
    .line 194
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    if-eqz v7, :cond_0

    .line 199
    .line 200
    move v7, v12

    .line 201
    goto :goto_2

    .line 202
    :sswitch_f
    const-string v8, "extent"

    .line 203
    .line 204
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v7

    .line 208
    if-eqz v7, :cond_0

    .line 209
    .line 210
    const/16 v7, 0x10

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :sswitch_10
    const-string v8, "fontStyle"

    .line 214
    .line 215
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    if-eqz v7, :cond_0

    .line 220
    .line 221
    const/4 v7, 0x6

    .line 222
    goto :goto_2

    .line 223
    :cond_0
    :goto_1
    move v7, v11

    .line 224
    :goto_2
    const/4 v8, 0x0

    .line 225
    const-string v14, "TtmlParser"

    .line 226
    .line 227
    packed-switch v7, :pswitch_data_0

    .line 228
    .line 229
    .line 230
    goto/16 :goto_d

    .line 231
    .line 232
    :pswitch_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzaov;->zzM(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 237
    .line 238
    .line 239
    goto/16 :goto_d

    .line 240
    .line 241
    :pswitch_1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzaov;->zzK(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 246
    .line 247
    .line 248
    goto/16 :goto_d

    .line 249
    .line 250
    :pswitch_2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    sget-object v0, Lcom/google/android/gms/internal/ads/zzaos;->zza:Ljava/util/regex/Pattern;

    .line 255
    .line 256
    invoke-virtual {v0, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    const v10, 0x7f7fffff    # Float.MAX_VALUE

    .line 265
    .line 266
    .line 267
    if-nez v9, :cond_1

    .line 268
    .line 269
    const-string v0, "Invalid value for shear: "

    .line 270
    .line 271
    invoke-static {v6, v0, v14}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_1
    :try_start_0
    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    if-eqz v0, :cond_2

    .line 280
    .line 281
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    const/high16 v8, -0x3d380000    # -100.0f

    .line 286
    .line 287
    invoke-static {v8, v0}, Ljava/lang/Math;->max(FF)F

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    const/high16 v8, 0x42c80000    # 100.0f

    .line 292
    .line 293
    invoke-static {v8, v0}, Ljava/lang/Math;->min(FF)F

    .line 294
    .line 295
    .line 296
    move-result v10

    .line 297
    goto :goto_4

    .line 298
    :catch_0
    move-exception v0

    .line 299
    goto :goto_3

    .line 300
    :cond_2
    throw v8
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 301
    :goto_3
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    const-string v8, "Failed to parse shear: "

    .line 306
    .line 307
    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    invoke-static {v14, v6, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 312
    .line 313
    .line 314
    :goto_4
    invoke-virtual {v7, v10}, Lcom/google/android/gms/internal/ads/zzaov;->zzp(F)Lcom/google/android/gms/internal/ads/zzaov;

    .line 315
    .line 316
    .line 317
    move-object v0, v7

    .line 318
    goto/16 :goto_d

    .line 319
    .line 320
    :pswitch_3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzaoo;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaoo;

    .line 325
    .line 326
    .line 327
    move-result-object v6

    .line 328
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzaov;->zzF(Lcom/google/android/gms/internal/ads/zzaoo;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 329
    .line 330
    .line 331
    goto/16 :goto_d

    .line 332
    .line 333
    :pswitch_4
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzgsz;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v6

    .line 337
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 338
    .line 339
    .line 340
    move-result v7

    .line 341
    sparse-switch v7, :sswitch_data_1

    .line 342
    .line 343
    .line 344
    goto :goto_5

    .line 345
    :sswitch_11
    const-string v7, "linethrough"

    .line 346
    .line 347
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v6

    .line 351
    if-eqz v6, :cond_3

    .line 352
    .line 353
    move v11, v4

    .line 354
    goto :goto_5

    .line 355
    :sswitch_12
    const-string v7, "nolinethrough"

    .line 356
    .line 357
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    if-eqz v6, :cond_3

    .line 362
    .line 363
    move v11, v2

    .line 364
    goto :goto_5

    .line 365
    :sswitch_13
    const-string v7, "underline"

    .line 366
    .line 367
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    if-eqz v6, :cond_3

    .line 372
    .line 373
    move v11, v13

    .line 374
    goto :goto_5

    .line 375
    :sswitch_14
    const-string v7, "nounderline"

    .line 376
    .line 377
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v6

    .line 381
    if-eqz v6, :cond_3

    .line 382
    .line 383
    move v11, v12

    .line 384
    :cond_3
    :goto_5
    if-eqz v11, :cond_7

    .line 385
    .line 386
    if-eq v11, v2, :cond_6

    .line 387
    .line 388
    if-eq v11, v13, :cond_5

    .line 389
    .line 390
    if-eq v11, v12, :cond_4

    .line 391
    .line 392
    goto/16 :goto_d

    .line 393
    .line 394
    :cond_4
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzaov;->zze(Z)Lcom/google/android/gms/internal/ads/zzaov;

    .line 399
    .line 400
    .line 401
    goto/16 :goto_d

    .line 402
    .line 403
    :cond_5
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzaov;->zze(Z)Lcom/google/android/gms/internal/ads/zzaov;

    .line 408
    .line 409
    .line 410
    goto/16 :goto_d

    .line 411
    .line 412
    :cond_6
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzaov;->zzc(Z)Lcom/google/android/gms/internal/ads/zzaov;

    .line 417
    .line 418
    .line 419
    goto/16 :goto_d

    .line 420
    .line 421
    :cond_7
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzaov;->zzc(Z)Lcom/google/android/gms/internal/ads/zzaov;

    .line 426
    .line 427
    .line 428
    goto/16 :goto_d

    .line 429
    .line 430
    :pswitch_5
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzgsz;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v6

    .line 434
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 435
    .line 436
    .line 437
    move-result v7

    .line 438
    const v8, -0x5305c081

    .line 439
    .line 440
    .line 441
    if-eq v7, v8, :cond_9

    .line 442
    .line 443
    const v8, 0x58705dc

    .line 444
    .line 445
    .line 446
    if-eq v7, v8, :cond_8

    .line 447
    .line 448
    goto :goto_6

    .line 449
    :cond_8
    const-string v7, "after"

    .line 450
    .line 451
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result v6

    .line 455
    if-eqz v6, :cond_a

    .line 456
    .line 457
    move v11, v2

    .line 458
    goto :goto_6

    .line 459
    :cond_9
    const-string v7, "before"

    .line 460
    .line 461
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result v6

    .line 465
    if-eqz v6, :cond_a

    .line 466
    .line 467
    move v11, v4

    .line 468
    :cond_a
    :goto_6
    if-eqz v11, :cond_c

    .line 469
    .line 470
    if-eq v11, v2, :cond_b

    .line 471
    .line 472
    goto/16 :goto_d

    .line 473
    .line 474
    :cond_b
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/ads/zzaov;->zzw(I)Lcom/google/android/gms/internal/ads/zzaov;

    .line 479
    .line 480
    .line 481
    goto/16 :goto_d

    .line 482
    .line 483
    :cond_c
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzaov;->zzw(I)Lcom/google/android/gms/internal/ads/zzaov;

    .line 488
    .line 489
    .line 490
    goto/16 :goto_d

    .line 491
    .line 492
    :pswitch_6
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzgsz;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v6

    .line 496
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 497
    .line 498
    .line 499
    move-result v7

    .line 500
    sparse-switch v7, :sswitch_data_2

    .line 501
    .line 502
    .line 503
    goto :goto_7

    .line 504
    :sswitch_15
    const-string v7, "text"

    .line 505
    .line 506
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result v6

    .line 510
    if-eqz v6, :cond_d

    .line 511
    .line 512
    move v11, v12

    .line 513
    goto :goto_7

    .line 514
    :sswitch_16
    const-string v7, "base"

    .line 515
    .line 516
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v6

    .line 520
    if-eqz v6, :cond_d

    .line 521
    .line 522
    move v11, v2

    .line 523
    goto :goto_7

    .line 524
    :sswitch_17
    const-string v7, "textContainer"

    .line 525
    .line 526
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result v6

    .line 530
    if-eqz v6, :cond_d

    .line 531
    .line 532
    move v11, v10

    .line 533
    goto :goto_7

    .line 534
    :sswitch_18
    const-string v7, "delimiter"

    .line 535
    .line 536
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v6

    .line 540
    if-eqz v6, :cond_d

    .line 541
    .line 542
    move v11, v9

    .line 543
    goto :goto_7

    .line 544
    :sswitch_19
    const-string v7, "container"

    .line 545
    .line 546
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v6

    .line 550
    if-eqz v6, :cond_d

    .line 551
    .line 552
    move v11, v4

    .line 553
    goto :goto_7

    .line 554
    :sswitch_1a
    const-string v7, "baseContainer"

    .line 555
    .line 556
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    move-result v6

    .line 560
    if-eqz v6, :cond_d

    .line 561
    .line 562
    move v11, v13

    .line 563
    :cond_d
    :goto_7
    if-eqz v11, :cond_11

    .line 564
    .line 565
    if-eq v11, v2, :cond_10

    .line 566
    .line 567
    if-eq v11, v13, :cond_10

    .line 568
    .line 569
    if-eq v11, v12, :cond_f

    .line 570
    .line 571
    if-eq v11, v10, :cond_f

    .line 572
    .line 573
    if-eq v11, v9, :cond_e

    .line 574
    .line 575
    goto/16 :goto_d

    .line 576
    .line 577
    :cond_e
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/ads/zzaov;->zzu(I)Lcom/google/android/gms/internal/ads/zzaov;

    .line 582
    .line 583
    .line 584
    goto/16 :goto_d

    .line 585
    .line 586
    :cond_f
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/ads/zzaov;->zzu(I)Lcom/google/android/gms/internal/ads/zzaov;

    .line 591
    .line 592
    .line 593
    goto/16 :goto_d

    .line 594
    .line 595
    :cond_10
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/ads/zzaov;->zzu(I)Lcom/google/android/gms/internal/ads/zzaov;

    .line 600
    .line 601
    .line 602
    goto/16 :goto_d

    .line 603
    .line 604
    :cond_11
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzaov;->zzu(I)Lcom/google/android/gms/internal/ads/zzaov;

    .line 609
    .line 610
    .line 611
    goto/16 :goto_d

    .line 612
    .line 613
    :pswitch_7
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzgsz;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v6

    .line 617
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 618
    .line 619
    .line 620
    move-result v7

    .line 621
    const v8, 0x179a1

    .line 622
    .line 623
    .line 624
    if-eq v7, v8, :cond_13

    .line 625
    .line 626
    const v8, 0x33af38

    .line 627
    .line 628
    .line 629
    if-eq v7, v8, :cond_12

    .line 630
    .line 631
    goto :goto_8

    .line 632
    :cond_12
    const-string v7, "none"

    .line 633
    .line 634
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 635
    .line 636
    .line 637
    move-result v6

    .line 638
    if-eqz v6, :cond_14

    .line 639
    .line 640
    move v11, v4

    .line 641
    goto :goto_8

    .line 642
    :cond_13
    const-string v7, "all"

    .line 643
    .line 644
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 645
    .line 646
    .line 647
    move-result v6

    .line 648
    if-eqz v6, :cond_14

    .line 649
    .line 650
    move v11, v2

    .line 651
    :cond_14
    :goto_8
    if-eqz v11, :cond_16

    .line 652
    .line 653
    if-eq v11, v2, :cond_15

    .line 654
    .line 655
    goto/16 :goto_d

    .line 656
    .line 657
    :cond_15
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzaov;->zzD(Z)Lcom/google/android/gms/internal/ads/zzaov;

    .line 662
    .line 663
    .line 664
    goto/16 :goto_d

    .line 665
    .line 666
    :cond_16
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzaov;->zzD(Z)Lcom/google/android/gms/internal/ads/zzaov;

    .line 671
    .line 672
    .line 673
    goto/16 :goto_d

    .line 674
    .line 675
    :pswitch_8
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzaos;->zzf(Ljava/lang/String;)Landroid/text/Layout$Alignment;

    .line 680
    .line 681
    .line 682
    move-result-object v6

    .line 683
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzaov;->zzB(Landroid/text/Layout$Alignment;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 684
    .line 685
    .line 686
    goto/16 :goto_d

    .line 687
    .line 688
    :pswitch_9
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzaos;->zzf(Ljava/lang/String;)Landroid/text/Layout$Alignment;

    .line 693
    .line 694
    .line 695
    move-result-object v6

    .line 696
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzaov;->zzz(Landroid/text/Layout$Alignment;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 697
    .line 698
    .line 699
    goto/16 :goto_d

    .line 700
    .line 701
    :pswitch_a
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    const-string v7, "italic"

    .line 706
    .line 707
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 708
    .line 709
    .line 710
    move-result v6

    .line 711
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzaov;->zzg(Z)Lcom/google/android/gms/internal/ads/zzaov;

    .line 712
    .line 713
    .line 714
    goto/16 :goto_d

    .line 715
    .line 716
    :pswitch_b
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    const-string v7, "bold"

    .line 721
    .line 722
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 723
    .line 724
    .line 725
    move-result v6

    .line 726
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzaov;->zzf(Z)Lcom/google/android/gms/internal/ads/zzaov;

    .line 727
    .line 728
    .line 729
    goto/16 :goto_d

    .line 730
    .line 731
    :pswitch_c
    :try_start_1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    const-string v7, "\\s+"

    .line 736
    .line 737
    const-string v9, "Invalid number of entries for fontSize: "

    .line 738
    .line 739
    const-string v10, "."

    .line 740
    .line 741
    const-string v15, "Invalid expression for fontSize: \'"

    .line 742
    .line 743
    const-string v4, "\'."

    .line 744
    .line 745
    move-object/from16 p1, v8

    .line 746
    .line 747
    const-string v8, "Invalid unit for fontSize: \'"

    .line 748
    .line 749
    sget-object v16, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 750
    .line 751
    invoke-virtual {v6, v7, v11}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object v7

    .line 755
    array-length v11, v7

    .line 756
    if-ne v11, v2, :cond_17

    .line 757
    .line 758
    sget-object v7, Lcom/google/android/gms/internal/ads/zzaos;->zze:Ljava/util/regex/Pattern;

    .line 759
    .line 760
    invoke-virtual {v7, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 761
    .line 762
    .line 763
    move-result-object v7

    .line 764
    goto :goto_9

    .line 765
    :cond_17
    if-ne v11, v13, :cond_22

    .line 766
    .line 767
    sget-object v9, Lcom/google/android/gms/internal/ads/zzaos;->zze:Ljava/util/regex/Pattern;

    .line 768
    .line 769
    aget-object v7, v7, v2

    .line 770
    .line 771
    invoke-virtual {v9, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 772
    .line 773
    .line 774
    move-result-object v7

    .line 775
    const-string v9, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first."

    .line 776
    .line 777
    invoke-static {v14, v9}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 778
    .line 779
    .line 780
    :goto_9
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    .line 781
    .line 782
    .line 783
    move-result v9

    .line 784
    if-eqz v9, :cond_21

    .line 785
    .line 786
    invoke-virtual {v7, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v9

    .line 790
    if-eqz v9, :cond_20

    .line 791
    .line 792
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 793
    .line 794
    .line 795
    move-result v10
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/zzano; {:try_start_1 .. :try_end_1} :catch_1

    .line 796
    const/16 v11, 0x25

    .line 797
    .line 798
    if-eq v10, v11, :cond_1a

    .line 799
    .line 800
    const/16 v11, 0xca8

    .line 801
    .line 802
    if-eq v10, v11, :cond_19

    .line 803
    .line 804
    const/16 v11, 0xe08

    .line 805
    .line 806
    if-eq v10, v11, :cond_18

    .line 807
    .line 808
    goto :goto_a

    .line 809
    :cond_18
    const-string v10, "px"

    .line 810
    .line 811
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 812
    .line 813
    .line 814
    move-result v10

    .line 815
    if-eqz v10, :cond_1b

    .line 816
    .line 817
    const/4 v11, 0x0

    .line 818
    goto :goto_b

    .line 819
    :cond_19
    const-string v10, "em"

    .line 820
    .line 821
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 822
    .line 823
    .line 824
    move-result v10

    .line 825
    if-eqz v10, :cond_1b

    .line 826
    .line 827
    move v11, v2

    .line 828
    goto :goto_b

    .line 829
    :cond_1a
    const-string v10, "%"

    .line 830
    .line 831
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 832
    .line 833
    .line 834
    move-result v10

    .line 835
    if-eqz v10, :cond_1b

    .line 836
    .line 837
    move v11, v13

    .line 838
    goto :goto_b

    .line 839
    :cond_1b
    :goto_a
    const/4 v11, -0x1

    .line 840
    :goto_b
    if-eqz v11, :cond_1e

    .line 841
    .line 842
    if-eq v11, v2, :cond_1d

    .line 843
    .line 844
    if-ne v11, v13, :cond_1c

    .line 845
    .line 846
    :try_start_2
    invoke-virtual {v0, v12}, Lcom/google/android/gms/internal/ads/zzaov;->zzH(I)Lcom/google/android/gms/internal/ads/zzaov;

    .line 847
    .line 848
    .line 849
    goto :goto_c

    .line 850
    :cond_1c
    new-instance v7, Lcom/google/android/gms/internal/ads/zzano;

    .line 851
    .line 852
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 853
    .line 854
    .line 855
    move-result v10

    .line 856
    add-int/lit8 v10, v10, 0x1e

    .line 857
    .line 858
    new-instance v11, Ljava/lang/StringBuilder;

    .line 859
    .line 860
    invoke-direct {v11, v10}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 864
    .line 865
    .line 866
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 867
    .line 868
    .line 869
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 870
    .line 871
    .line 872
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object v4

    .line 876
    invoke-direct {v7, v4}, Lcom/google/android/gms/internal/ads/zzano;-><init>(Ljava/lang/String;)V

    .line 877
    .line 878
    .line 879
    throw v7

    .line 880
    :cond_1d
    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/ads/zzaov;->zzH(I)Lcom/google/android/gms/internal/ads/zzaov;

    .line 881
    .line 882
    .line 883
    goto :goto_c

    .line 884
    :cond_1e
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzaov;->zzH(I)Lcom/google/android/gms/internal/ads/zzaov;

    .line 885
    .line 886
    .line 887
    :goto_c
    invoke-virtual {v7, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v4

    .line 891
    if-eqz v4, :cond_1f

    .line 892
    .line 893
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 894
    .line 895
    .line 896
    move-result v4

    .line 897
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzaov;->zzG(F)Lcom/google/android/gms/internal/ads/zzaov;

    .line 898
    .line 899
    .line 900
    goto/16 :goto_d

    .line 901
    .line 902
    :cond_1f
    throw p1

    .line 903
    :cond_20
    throw p1

    .line 904
    :cond_21
    new-instance v7, Lcom/google/android/gms/internal/ads/zzano;

    .line 905
    .line 906
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 907
    .line 908
    .line 909
    move-result v8

    .line 910
    add-int/lit8 v8, v8, 0x24

    .line 911
    .line 912
    new-instance v9, Ljava/lang/StringBuilder;

    .line 913
    .line 914
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 915
    .line 916
    .line 917
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 918
    .line 919
    .line 920
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 921
    .line 922
    .line 923
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 924
    .line 925
    .line 926
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v4

    .line 930
    invoke-direct {v7, v4}, Lcom/google/android/gms/internal/ads/zzano;-><init>(Ljava/lang/String;)V

    .line 931
    .line 932
    .line 933
    throw v7

    .line 934
    :cond_22
    new-instance v4, Lcom/google/android/gms/internal/ads/zzano;

    .line 935
    .line 936
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v7

    .line 940
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 941
    .line 942
    .line 943
    move-result v7

    .line 944
    add-int/lit8 v7, v7, 0x29

    .line 945
    .line 946
    new-instance v8, Ljava/lang/StringBuilder;

    .line 947
    .line 948
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 949
    .line 950
    .line 951
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 952
    .line 953
    .line 954
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 955
    .line 956
    .line 957
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 958
    .line 959
    .line 960
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 961
    .line 962
    .line 963
    move-result-object v7

    .line 964
    invoke-direct {v4, v7}, Lcom/google/android/gms/internal/ads/zzano;-><init>(Ljava/lang/String;)V

    .line 965
    .line 966
    .line 967
    throw v4
    :try_end_2
    .catch Lcom/google/android/gms/internal/ads/zzano; {:try_start_2 .. :try_end_2} :catch_1

    .line 968
    :catch_1
    const-string v4, "Failed parsing fontSize value: "

    .line 969
    .line 970
    invoke-static {v6, v4, v14}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 971
    .line 972
    .line 973
    goto :goto_d

    .line 974
    :pswitch_d
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 975
    .line 976
    .line 977
    move-result-object v0

    .line 978
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzaov;->zzi(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 979
    .line 980
    .line 981
    goto :goto_d

    .line 982
    :pswitch_e
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 983
    .line 984
    .line 985
    move-result-object v0

    .line 986
    :try_start_3
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzds;->zza(Ljava/lang/String;)I

    .line 987
    .line 988
    .line 989
    move-result v4

    .line 990
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzaov;->zzk(I)Lcom/google/android/gms/internal/ads/zzaov;
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_2

    .line 991
    .line 992
    .line 993
    goto :goto_d

    .line 994
    :catch_2
    const-string v4, "Failed parsing color value: "

    .line 995
    .line 996
    invoke-static {v6, v4, v14}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 997
    .line 998
    .line 999
    goto :goto_d

    .line 1000
    :pswitch_f
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v0

    .line 1004
    :try_start_4
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzds;->zza(Ljava/lang/String;)I

    .line 1005
    .line 1006
    .line 1007
    move-result v4

    .line 1008
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzaov;->zzn(I)Lcom/google/android/gms/internal/ads/zzaov;
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_3

    .line 1009
    .line 1010
    .line 1011
    goto :goto_d

    .line 1012
    :catch_3
    const-string v4, "Failed parsing background value: "

    .line 1013
    .line 1014
    invoke-static {v6, v4, v14}, Lcb/a;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1015
    .line 1016
    .line 1017
    goto :goto_d

    .line 1018
    :pswitch_10
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v4

    .line 1022
    const-string v7, "style"

    .line 1023
    .line 1024
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1025
    .line 1026
    .line 1027
    move-result v4

    .line 1028
    if-eqz v4, :cond_23

    .line 1029
    .line 1030
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzaov;->zzs(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 1035
    .line 1036
    .line 1037
    :cond_23
    :goto_d
    add-int/2addr v5, v2

    .line 1038
    const/4 v4, 0x0

    .line 1039
    goto/16 :goto_0

    .line 1040
    .line 1041
    :cond_24
    return-object v0

    .line 1042
    nop

    .line 1043
    :sswitch_data_0
    .sparse-switch
        -0x5c71855e -> :sswitch_10
        -0x4cd540d6 -> :sswitch_f
        -0x48ff636d -> :sswitch_e
        -0x3f826a28 -> :sswitch_d
        -0x3c1e50da -> :sswitch_c
        -0x3468fa43 -> :sswitch_b
        -0x2bc67c59 -> :sswitch_a
        0xd1b -> :sswitch_9
        0x3595da -> :sswitch_8
        0x5a72f63 -> :sswitch_7
        0x6855ce1 -> :sswitch_6
        0x6909352 -> :sswitch_5
        0x15caa0f0 -> :sswitch_4
        0x36e741c9 -> :sswitch_3
        0x42841923 -> :sswitch_2
        0x4cb7f6d5 -> :sswitch_1
        0x6899f5a4 -> :sswitch_0
    .end sparse-switch

    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    :sswitch_data_1
    .sparse-switch
        -0x57195dd5 -> :sswitch_14
        -0x3d363934 -> :sswitch_13
        0x36723ff0 -> :sswitch_12
        0x641ec051 -> :sswitch_11
    .end sparse-switch

    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    :sswitch_data_2
    .sparse-switch
        -0x24de7f50 -> :sswitch_1a
        -0x187eb37f -> :sswitch_19
        -0xeee99f9 -> :sswitch_18
        -0x81c562c -> :sswitch_17
        0x2e06d1 -> :sswitch_16
        0x36452d -> :sswitch_15
    .end sparse-switch
.end method

.method private static zze(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    if-nez p0, :cond_0

    new-instance p0, Lcom/google/android/gms/internal/ads/zzaov;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzaov;-><init>()V

    :cond_0
    return-object p0
.end method

.method private static zzf(Ljava/lang/String;)Landroid/text/Layout$Alignment;
    .locals 5

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgsz;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x4

    .line 10
    const/4 v2, 0x3

    .line 11
    const/4 v3, 0x2

    .line 12
    const/4 v4, 0x1

    .line 13
    sparse-switch v0, :sswitch_data_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :sswitch_0
    const-string v0, "start"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    move p0, v4

    .line 26
    goto :goto_1

    .line 27
    :sswitch_1
    const-string v0, "right"

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    move p0, v3

    .line 36
    goto :goto_1

    .line 37
    :sswitch_2
    const-string v0, "left"

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    goto :goto_1

    .line 47
    :sswitch_3
    const-string v0, "end"

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_0

    .line 54
    .line 55
    move p0, v2

    .line 56
    goto :goto_1

    .line 57
    :sswitch_4
    const-string v0, "center"

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_0

    .line 64
    .line 65
    move p0, v1

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    :goto_0
    const/4 p0, -0x1

    .line 68
    :goto_1
    if-eqz p0, :cond_3

    .line 69
    .line 70
    if-eq p0, v4, :cond_3

    .line 71
    .line 72
    if-eq p0, v3, :cond_2

    .line 73
    .line 74
    if-eq p0, v2, :cond_2

    .line 75
    .line 76
    if-eq p0, v1, :cond_1

    .line 77
    .line 78
    const/4 p0, 0x0

    .line 79
    return-object p0

    .line 80
    :cond_1
    sget-object p0, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_2
    sget-object p0, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_3
    sget-object p0, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 87
    .line 88
    return-object p0

    .line 89
    :sswitch_data_0
    .sparse-switch
        -0x514d33ab -> :sswitch_4
        0x188db -> :sswitch_3
        0x32a007 -> :sswitch_2
        0x677c21c -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch
.end method

.method private static zzg(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaoq;)J
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzano;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzaos;->zzc:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-wide v2, 0x412e848000000000L    # 1000000.0

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const/4 v4, 0x5

    .line 17
    const/4 v5, 0x4

    .line 18
    const/4 v6, 0x3

    .line 19
    const/4 v7, 0x2

    .line 20
    const/4 v8, 0x1

    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    invoke-virtual {v0, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v8

    .line 34
    const-wide/16 v10, 0xe10

    .line 35
    .line 36
    mul-long/2addr v8, v10

    .line 37
    invoke-virtual {v0, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    long-to-double v7, v8

    .line 45
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v9

    .line 49
    const-wide/16 v11, 0x3c

    .line 50
    .line 51
    mul-long/2addr v9, v11

    .line 52
    invoke-virtual {v0, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    long-to-double v9, v9

    .line 60
    add-double/2addr v7, v9

    .line 61
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 62
    .line 63
    .line 64
    move-result-wide v9

    .line 65
    long-to-double v9, v9

    .line 66
    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const-wide/16 v5, 0x0

    .line 71
    .line 72
    if-eqz p0, :cond_0

    .line 73
    .line 74
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 75
    .line 76
    .line 77
    move-result-wide v11

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    move-wide v11, v5

    .line 80
    :goto_0
    add-double/2addr v7, v9

    .line 81
    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-eqz p0, :cond_1

    .line 86
    .line 87
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 88
    .line 89
    .line 90
    move-result-wide v9

    .line 91
    long-to-float p0, v9

    .line 92
    iget v1, p1, Lcom/google/android/gms/internal/ads/zzaoq;->zza:F

    .line 93
    .line 94
    div-float/2addr p0, v1

    .line 95
    float-to-double v9, p0

    .line 96
    goto :goto_1

    .line 97
    :cond_1
    move-wide v9, v5

    .line 98
    :goto_1
    add-double/2addr v7, v11

    .line 99
    const/4 p0, 0x6

    .line 100
    invoke-virtual {v0, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-eqz p0, :cond_2

    .line 105
    .line 106
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 107
    .line 108
    .line 109
    move-result-wide v0

    .line 110
    long-to-double v0, v0

    .line 111
    iget p0, p1, Lcom/google/android/gms/internal/ads/zzaoq;->zzb:I

    .line 112
    .line 113
    int-to-double v4, p0

    .line 114
    iget p0, p1, Lcom/google/android/gms/internal/ads/zzaoq;->zza:F

    .line 115
    .line 116
    float-to-double p0, p0

    .line 117
    div-double/2addr v0, v4

    .line 118
    div-double v5, v0, p0

    .line 119
    .line 120
    :cond_2
    add-double/2addr v7, v9

    .line 121
    add-double/2addr v7, v5

    .line 122
    mul-double/2addr v7, v2

    .line 123
    double-to-long p0, v7

    .line 124
    return-wide p0

    .line 125
    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/ads/zzaos;->zzd:Ljava/util/regex/Pattern;

    .line 126
    .line 127
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_10

    .line 136
    .line 137
    invoke-virtual {v0, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 145
    .line 146
    .line 147
    move-result-wide v9

    .line 148
    invoke-virtual {v0, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    const/16 v1, 0x66

    .line 160
    .line 161
    if-eq v0, v1, :cond_9

    .line 162
    .line 163
    const/16 v1, 0x68

    .line 164
    .line 165
    if-eq v0, v1, :cond_8

    .line 166
    .line 167
    const/16 v1, 0x6d

    .line 168
    .line 169
    if-eq v0, v1, :cond_7

    .line 170
    .line 171
    const/16 v1, 0xda6

    .line 172
    .line 173
    if-eq v0, v1, :cond_6

    .line 174
    .line 175
    const/16 v1, 0x73

    .line 176
    .line 177
    if-eq v0, v1, :cond_5

    .line 178
    .line 179
    const/16 v1, 0x74

    .line 180
    .line 181
    if-eq v0, v1, :cond_4

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_4
    const-string v0, "t"

    .line 185
    .line 186
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    if-eqz p0, :cond_a

    .line 191
    .line 192
    move v7, v4

    .line 193
    goto :goto_3

    .line 194
    :cond_5
    const-string v0, "s"

    .line 195
    .line 196
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result p0

    .line 200
    if-eqz p0, :cond_a

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_6
    const-string v0, "ms"

    .line 204
    .line 205
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    if-eqz p0, :cond_a

    .line 210
    .line 211
    move v7, v6

    .line 212
    goto :goto_3

    .line 213
    :cond_7
    const-string v0, "m"

    .line 214
    .line 215
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    if-eqz p0, :cond_a

    .line 220
    .line 221
    move v7, v8

    .line 222
    goto :goto_3

    .line 223
    :cond_8
    const-string v0, "h"

    .line 224
    .line 225
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result p0

    .line 229
    if-eqz p0, :cond_a

    .line 230
    .line 231
    const/4 v7, 0x0

    .line 232
    goto :goto_3

    .line 233
    :cond_9
    const-string v0, "f"

    .line 234
    .line 235
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result p0

    .line 239
    if-eqz p0, :cond_a

    .line 240
    .line 241
    move v7, v5

    .line 242
    goto :goto_3

    .line 243
    :cond_a
    :goto_2
    const/4 v7, -0x1

    .line 244
    :goto_3
    if-eqz v7, :cond_f

    .line 245
    .line 246
    if-eq v7, v8, :cond_e

    .line 247
    .line 248
    if-eq v7, v6, :cond_d

    .line 249
    .line 250
    if-eq v7, v5, :cond_c

    .line 251
    .line 252
    if-eq v7, v4, :cond_b

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_b
    iget p0, p1, Lcom/google/android/gms/internal/ads/zzaoq;->zzc:I

    .line 256
    .line 257
    int-to-double p0, p0

    .line 258
    :goto_4
    div-double/2addr v9, p0

    .line 259
    goto :goto_6

    .line 260
    :cond_c
    iget p0, p1, Lcom/google/android/gms/internal/ads/zzaoq;->zza:F

    .line 261
    .line 262
    float-to-double p0, p0

    .line 263
    goto :goto_4

    .line 264
    :cond_d
    const-wide p0, 0x408f400000000000L    # 1000.0

    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_e
    const-wide/high16 p0, 0x404e000000000000L    # 60.0

    .line 271
    .line 272
    :goto_5
    mul-double/2addr v9, p0

    .line 273
    goto :goto_6

    .line 274
    :cond_f
    const-wide p0, 0x40ac200000000000L    # 3600.0

    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    goto :goto_5

    .line 280
    :goto_6
    mul-double/2addr v9, v2

    .line 281
    double-to-long p0, v9

    .line 282
    return-wide p0

    .line 283
    :cond_10
    new-instance p1, Lcom/google/android/gms/internal/ads/zzano;

    .line 284
    .line 285
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    const-string v0, "Malformed time expression: "

    .line 290
    .line 291
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/zzano;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw p1
.end method


# virtual methods
.method public final zza([BIILcom/google/android/gms/internal/ads/zzanr;Lcom/google/android/gms/internal/ads/zzdu;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzaos;->zzb([BII)Lcom/google/android/gms/internal/ads/zzann;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1, p4, p5}, Lcom/google/android/gms/internal/ads/zzanm;->zza(Lcom/google/android/gms/internal/ads/zzann;Lcom/google/android/gms/internal/ads/zzanr;Lcom/google/android/gms/internal/ads/zzdu;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final zzb([BII)Lcom/google/android/gms/internal/ads/zzann;
    .locals 49

    .line 1
    const/4 v5, 0x1

    .line 2
    const-string v6, ""

    .line 3
    .line 4
    const-string v7, "http://www.w3.org/ns/ttml#parameter"

    .line 5
    .line 6
    const-string v8, "Ignoring unsupported tag: "

    .line 7
    .line 8
    move-object/from16 v9, p0

    .line 9
    .line 10
    :try_start_0
    iget-object v0, v9, Lcom/google/android/gms/internal/ads/zzaos;->zzi:Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 11
    .line 12
    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    .line 13
    .line 14
    .line 15
    move-result-object v10

    .line 16
    new-instance v11, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v12, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v13, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v14, Lcom/google/android/gms/internal/ads/zzaot;

    .line 32
    .line 33
    const-string v15, ""

    .line 34
    .line 35
    const v16, -0x800001

    .line 36
    .line 37
    .line 38
    const/high16 v18, -0x80000000

    .line 39
    .line 40
    move/from16 v17, v16

    .line 41
    .line 42
    move/from16 v19, v18

    .line 43
    .line 44
    move/from16 v20, v16

    .line 45
    .line 46
    move/from16 v21, v16

    .line 47
    .line 48
    move/from16 v22, v18

    .line 49
    .line 50
    move/from16 v23, v16

    .line 51
    .line 52
    move/from16 v24, v18

    .line 53
    .line 54
    invoke-direct/range {v14 .. v24}, Lcom/google/android/gms/internal/ads/zzaot;-><init>(Ljava/lang/String;FFIIFFIFI)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v12, v6, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 61
    .line 62
    move-object/from16 v14, p1

    .line 63
    .line 64
    move/from16 v15, p2

    .line 65
    .line 66
    move/from16 v2, p3

    .line 67
    .line 68
    invoke-direct {v0, v14, v15, v2}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    .line 69
    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-interface {v10, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    new-instance v14, Ljava/util/ArrayDeque;

    .line 76
    .line 77
    invoke-direct {v14}, Ljava/util/ArrayDeque;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    sget-object v15, Lcom/google/android/gms/internal/ads/zzaos;->zzh:Lcom/google/android/gms/internal/ads/zzaoq;

    .line 85
    .line 86
    const/16 v17, 0xf

    .line 87
    .line 88
    const/16 v18, 0x0

    .line 89
    .line 90
    move-object/from16 v19, v2

    .line 91
    .line 92
    move-object/from16 v22, v19

    .line 93
    .line 94
    move-object/from16 v21, v15

    .line 95
    .line 96
    move/from16 v23, v17

    .line 97
    .line 98
    move/from16 v20, v18

    .line 99
    .line 100
    :goto_0
    if-eq v0, v5, :cond_59

    .line 101
    .line 102
    invoke-virtual {v14}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v24

    .line 106
    move-object/from16 v3, v24

    .line 107
    .line 108
    check-cast v3, Lcom/google/android/gms/internal/ads/zzaop;

    .line 109
    .line 110
    const/4 v1, 0x2

    .line 111
    if-nez v20, :cond_56

    .line 112
    .line 113
    move-object/from16 p2, v2

    .line 114
    .line 115
    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    move/from16 v25, v5

    .line 120
    .line 121
    const-string v5, "tt"

    .line 122
    .line 123
    if-ne v0, v1, :cond_51

    .line 124
    .line 125
    :try_start_1
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 129
    const-string v1, "extent"

    .line 130
    .line 131
    const/high16 v26, 0x3f800000    # 1.0f

    .line 132
    .line 133
    const-string v4, "TtmlParser"

    .line 134
    .line 135
    if-eqz v0, :cond_f

    .line 136
    .line 137
    :try_start_2
    const-string v0, "frameRate"

    .line 138
    .line 139
    invoke-interface {v10, v7, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    if-eqz v0, :cond_0

    .line 144
    .line 145
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    :goto_1
    move-object/from16 v28, v6

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :catch_0
    move-exception v0

    .line 153
    goto/16 :goto_34

    .line 154
    .line 155
    :catch_1
    move-exception v0

    .line 156
    goto/16 :goto_35

    .line 157
    .line 158
    :cond_0
    const/16 v0, 0x1e

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :goto_2
    const-string v6, "frameRateMultiplier"

    .line 162
    .line 163
    invoke-interface {v10, v7, v6}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    if-eqz v6, :cond_2

    .line 168
    .line 169
    const-string v9, " "

    .line 170
    .line 171
    sget-object v21, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 172
    .line 173
    move-object/from16 v29, v14

    .line 174
    .line 175
    const/4 v14, -0x1

    .line 176
    invoke-virtual {v6, v9, v14}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    array-length v9, v6

    .line 181
    const/4 v14, 0x2

    .line 182
    if-ne v9, v14, :cond_1

    .line 183
    .line 184
    move/from16 v9, v25

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_1
    move/from16 v9, v18

    .line 188
    .line 189
    :goto_3
    const-string v14, "frameRateMultiplier doesn\'t have 2 parts"

    .line 190
    .line 191
    invoke-static {v9, v14}, Lcom/google/android/gms/internal/ads/zzgtr;->zzb(ZLjava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    aget-object v9, v6, v18

    .line 195
    .line 196
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    int-to-float v9, v9

    .line 201
    aget-object v6, v6, v25

    .line 202
    .line 203
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    int-to-float v6, v6

    .line 208
    div-float/2addr v9, v6

    .line 209
    goto :goto_4

    .line 210
    :cond_2
    move-object/from16 v29, v14

    .line 211
    .line 212
    move/from16 v9, v26

    .line 213
    .line 214
    :goto_4
    iget v6, v15, Lcom/google/android/gms/internal/ads/zzaoq;->zzb:I

    .line 215
    .line 216
    const-string v14, "subFrameRate"

    .line 217
    .line 218
    invoke-interface {v10, v7, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v14

    .line 222
    if-eqz v14, :cond_3

    .line 223
    .line 224
    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    :cond_3
    iget v14, v15, Lcom/google/android/gms/internal/ads/zzaoq;->zzc:I

    .line 229
    .line 230
    move/from16 v21, v9

    .line 231
    .line 232
    const-string v9, "tickRate"

    .line 233
    .line 234
    invoke-interface {v10, v7, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    if-eqz v9, :cond_4

    .line 239
    .line 240
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 241
    .line 242
    .line 243
    move-result v14

    .line 244
    :cond_4
    new-instance v9, Lcom/google/android/gms/internal/ads/zzaoq;

    .line 245
    .line 246
    int-to-float v0, v0

    .line 247
    mul-float v0, v0, v21

    .line 248
    .line 249
    invoke-direct {v9, v0, v6, v14}, Lcom/google/android/gms/internal/ads/zzaoq;-><init>(FII)V

    .line 250
    .line 251
    .line 252
    const-string v0, "cellResolution"

    .line 253
    .line 254
    const-string v6, "Ignoring malformed cell resolution: "

    .line 255
    .line 256
    invoke-interface {v10, v7, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    if-nez v0, :cond_5

    .line 261
    .line 262
    :goto_5
    move-object/from16 v30, v7

    .line 263
    .line 264
    move-object/from16 v21, v9

    .line 265
    .line 266
    move-object/from16 v31, v15

    .line 267
    .line 268
    :goto_6
    move/from16 v23, v17

    .line 269
    .line 270
    goto/16 :goto_a

    .line 271
    .line 272
    :cond_5
    sget-object v14, Lcom/google/android/gms/internal/ads/zzaos;->zzg:Ljava/util/regex/Pattern;

    .line 273
    .line 274
    invoke-virtual {v14, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 275
    .line 276
    .line 277
    move-result-object v14

    .line 278
    invoke-virtual {v14}, Ljava/util/regex/Matcher;->matches()Z

    .line 279
    .line 280
    .line 281
    move-result v21

    .line 282
    if-nez v21, :cond_6

    .line 283
    .line 284
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 289
    .line 290
    .line 291
    goto :goto_5

    .line 292
    :cond_6
    move-object/from16 v30, v7

    .line 293
    .line 294
    move/from16 v7, v25

    .line 295
    .line 296
    :try_start_3
    invoke-virtual {v14, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v21

    .line 300
    if-eqz v21, :cond_a

    .line 301
    .line 302
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 303
    .line 304
    .line 305
    move-result v7
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 306
    move-object/from16 v21, v9

    .line 307
    .line 308
    const/4 v9, 0x2

    .line 309
    :try_start_4
    invoke-virtual {v14, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v14

    .line 313
    if-eqz v14, :cond_9

    .line 314
    .line 315
    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 316
    .line 317
    .line 318
    move-result v9
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 319
    if-eqz v7, :cond_8

    .line 320
    .line 321
    if-eqz v9, :cond_7

    .line 322
    .line 323
    move-object/from16 v31, v15

    .line 324
    .line 325
    const/4 v14, 0x1

    .line 326
    goto :goto_7

    .line 327
    :cond_7
    move-object/from16 v31, v15

    .line 328
    .line 329
    move/from16 v9, v18

    .line 330
    .line 331
    move v14, v9

    .line 332
    goto :goto_7

    .line 333
    :cond_8
    move-object/from16 v31, v15

    .line 334
    .line 335
    move/from16 v14, v18

    .line 336
    .line 337
    :goto_7
    :try_start_5
    const-string v15, "Invalid cell resolution %s %s"

    .line 338
    .line 339
    invoke-static {v14, v15, v7, v9}, Lcom/google/android/gms/internal/ads/zzgtr;->zzg(ZLjava/lang/String;II)V

    .line 340
    .line 341
    .line 342
    move/from16 v23, v9

    .line 343
    .line 344
    goto :goto_a

    .line 345
    :catch_2
    :goto_8
    move-object/from16 v31, v15

    .line 346
    .line 347
    goto :goto_9

    .line 348
    :cond_9
    move-object/from16 v31, v15

    .line 349
    .line 350
    throw p2

    .line 351
    :catch_3
    move-object/from16 v21, v9

    .line 352
    .line 353
    goto :goto_8

    .line 354
    :cond_a
    move-object/from16 v21, v9

    .line 355
    .line 356
    move-object/from16 v31, v15

    .line 357
    .line 358
    throw p2
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 359
    :catch_4
    :goto_9
    :try_start_6
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    goto :goto_6

    .line 367
    :goto_a
    const-string v0, "Ignoring malformed tts extent: "

    .line 368
    .line 369
    const-string v6, "Ignoring non-pixel tts extent: "

    .line 370
    .line 371
    invoke-static {v10, v1}, Lcom/google/android/gms/internal/ads/zzfv;->zzc(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v7

    .line 375
    if-nez v7, :cond_b

    .line 376
    .line 377
    :goto_b
    move-object/from16 v22, p2

    .line 378
    .line 379
    goto :goto_c

    .line 380
    :cond_b
    sget-object v9, Lcom/google/android/gms/internal/ads/zzaos;->zzf:Ljava/util/regex/Pattern;

    .line 381
    .line 382
    invoke-virtual {v9, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 383
    .line 384
    .line 385
    move-result-object v9

    .line 386
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->matches()Z

    .line 387
    .line 388
    .line 389
    move-result v14

    .line 390
    if-nez v14, :cond_c

    .line 391
    .line 392
    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    .line 397
    .line 398
    .line 399
    goto :goto_b

    .line 400
    :cond_c
    const/4 v6, 0x1

    .line 401
    :try_start_7
    invoke-virtual {v9, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v14

    .line 405
    if-eqz v14, :cond_e

    .line 406
    .line 407
    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 408
    .line 409
    .line 410
    move-result v6

    .line 411
    const/4 v14, 0x2

    .line 412
    invoke-virtual {v9, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v9

    .line 416
    if-eqz v9, :cond_d

    .line 417
    .line 418
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 419
    .line 420
    .line 421
    move-result v9

    .line 422
    new-instance v14, Lcom/google/android/gms/internal/ads/zzaor;

    .line 423
    .line 424
    invoke-direct {v14, v6, v9}, Lcom/google/android/gms/internal/ads/zzaor;-><init>(II)V

    .line 425
    .line 426
    .line 427
    move-object/from16 v22, v14

    .line 428
    .line 429
    goto :goto_c

    .line 430
    :cond_d
    throw p2

    .line 431
    :cond_e
    throw p2
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    .line 432
    :catch_5
    :try_start_8
    invoke-virtual {v0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    goto :goto_b

    .line 440
    :goto_c
    move-object/from16 v6, v21

    .line 441
    .line 442
    move-object/from16 v7, v22

    .line 443
    .line 444
    move/from16 v9, v23

    .line 445
    .line 446
    goto :goto_d

    .line 447
    :cond_f
    move-object/from16 v28, v6

    .line 448
    .line 449
    move-object/from16 v30, v7

    .line 450
    .line 451
    move-object/from16 v29, v14

    .line 452
    .line 453
    move-object/from16 v31, v15

    .line 454
    .line 455
    goto :goto_c

    .line 456
    :goto_d
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    move-result v0
    :try_end_8
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    .line 460
    const-string v5, "image"

    .line 461
    .line 462
    const-string v14, "metadata"

    .line 463
    .line 464
    const-string v15, "region"

    .line 465
    .line 466
    move-object/from16 v32, v3

    .line 467
    .line 468
    const-string v3, "head"

    .line 469
    .line 470
    move-object/from16 v21, v6

    .line 471
    .line 472
    const-string v6, "style"

    .line 473
    .line 474
    if-nez v0, :cond_12

    .line 475
    .line 476
    :try_start_9
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    if-nez v0, :cond_12

    .line 481
    .line 482
    const-string v0, "body"

    .line 483
    .line 484
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    if-nez v0, :cond_12

    .line 489
    .line 490
    const-string v0, "div"

    .line 491
    .line 492
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    if-nez v0, :cond_12

    .line 497
    .line 498
    const-string v0, "p"

    .line 499
    .line 500
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    move-result v0

    .line 504
    if-nez v0, :cond_12

    .line 505
    .line 506
    const-string v0, "span"

    .line 507
    .line 508
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    if-nez v0, :cond_12

    .line 513
    .line 514
    const-string v0, "br"

    .line 515
    .line 516
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v0

    .line 520
    if-nez v0, :cond_12

    .line 521
    .line 522
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    move-result v0

    .line 526
    if-nez v0, :cond_12

    .line 527
    .line 528
    const-string v0, "styling"

    .line 529
    .line 530
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    move-result v0

    .line 534
    if-nez v0, :cond_12

    .line 535
    .line 536
    const-string v0, "layout"

    .line 537
    .line 538
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-result v0

    .line 542
    if-nez v0, :cond_12

    .line 543
    .line 544
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    move-result v0

    .line 548
    if-nez v0, :cond_12

    .line 549
    .line 550
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    move-result v0

    .line 554
    if-nez v0, :cond_12

    .line 555
    .line 556
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    move-result v0

    .line 560
    if-nez v0, :cond_12

    .line 561
    .line 562
    const-string v0, "data"

    .line 563
    .line 564
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move-result v0

    .line 568
    if-nez v0, :cond_12

    .line 569
    .line 570
    const-string v0, "information"

    .line 571
    .line 572
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-result v0

    .line 576
    if-eqz v0, :cond_10

    .line 577
    .line 578
    goto :goto_11

    .line 579
    :cond_10
    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 588
    .line 589
    .line 590
    move-result v1

    .line 591
    add-int/lit8 v1, v1, 0x1a

    .line 592
    .line 593
    new-instance v2, Ljava/lang/StringBuilder;

    .line 594
    .line 595
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 602
    .line 603
    .line 604
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzb(Ljava/lang/String;Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    move-object/from16 v22, v7

    .line 612
    .line 613
    move-object/from16 v33, v8

    .line 614
    .line 615
    move/from16 v23, v9

    .line 616
    .line 617
    move-object v3, v12

    .line 618
    move-object/from16 v6, v29

    .line 619
    .line 620
    const/4 v8, 0x5

    .line 621
    :goto_e
    const/16 v20, 0x1

    .line 622
    .line 623
    :cond_11
    :goto_f
    const/16 v25, 0x1

    .line 624
    .line 625
    :goto_10
    const/16 v27, -0x1

    .line 626
    .line 627
    goto/16 :goto_33

    .line 628
    .line 629
    :cond_12
    :goto_11
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 630
    .line 631
    .line 632
    move-result v0

    .line 633
    if-eqz v0, :cond_3e

    .line 634
    .line 635
    :goto_12
    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 636
    .line 637
    .line 638
    invoke-static {v10, v6}, Lcom/google/android/gms/internal/ads/zzfv;->zzb(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 639
    .line 640
    .line 641
    move-result v0

    .line 642
    if-eqz v0, :cond_16

    .line 643
    .line 644
    invoke-static {v10, v6}, Lcom/google/android/gms/internal/ads/zzfv;->zzc(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    new-instance v2, Lcom/google/android/gms/internal/ads/zzaov;

    .line 649
    .line 650
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzaov;-><init>()V

    .line 651
    .line 652
    .line 653
    invoke-static {v10, v2}, Lcom/google/android/gms/internal/ads/zzaos;->zzd(Lorg/xmlpull/v1/XmlPullParser;Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    if-eqz v0, :cond_13

    .line 658
    .line 659
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaos;->zzc(Ljava/lang/String;)[Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    move-object/from16 v33, v8

    .line 664
    .line 665
    array-length v8, v0

    .line 666
    move-object/from16 v22, v3

    .line 667
    .line 668
    move/from16 v3, v18

    .line 669
    .line 670
    :goto_13
    if-ge v3, v8, :cond_14

    .line 671
    .line 672
    move/from16 v23, v3

    .line 673
    .line 674
    aget-object v3, v0, v23

    .line 675
    .line 676
    invoke-virtual {v11, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v3

    .line 680
    check-cast v3, Lcom/google/android/gms/internal/ads/zzaov;

    .line 681
    .line 682
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzaov;->zzr(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 683
    .line 684
    .line 685
    const/16 v25, 0x1

    .line 686
    .line 687
    add-int/lit8 v3, v23, 0x1

    .line 688
    .line 689
    goto :goto_13

    .line 690
    :cond_13
    move-object/from16 v22, v3

    .line 691
    .line 692
    move-object/from16 v33, v8

    .line 693
    .line 694
    :cond_14
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzaov;->zzt()Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    if-eqz v0, :cond_15

    .line 699
    .line 700
    invoke-virtual {v11, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    :cond_15
    move-object v3, v12

    .line 704
    move-object v0, v14

    .line 705
    move-object/from16 v23, v15

    .line 706
    .line 707
    :goto_14
    move-object/from16 v2, v22

    .line 708
    .line 709
    goto/16 :goto_23

    .line 710
    .line 711
    :cond_16
    move-object/from16 v22, v3

    .line 712
    .line 713
    move-object/from16 v33, v8

    .line 714
    .line 715
    invoke-static {v10, v15}, Lcom/google/android/gms/internal/ads/zzfv;->zzb(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 716
    .line 717
    .line 718
    move-result v0
    :try_end_9
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0

    .line 719
    const-string v2, "id"

    .line 720
    .line 721
    if-eqz v0, :cond_39

    .line 722
    .line 723
    :try_start_a
    const-string v0, "Ignoring region with malformed origin: "

    .line 724
    .line 725
    const-string v3, "Ignoring region with malformed extent: "

    .line 726
    .line 727
    const-string v8, "Ignoring region with unsupported origin: "

    .line 728
    .line 729
    move-object/from16 v23, v15

    .line 730
    .line 731
    const-string v15, "Ignoring region with missing tts:extent: "

    .line 732
    .line 733
    move-object/from16 v34, v13

    .line 734
    .line 735
    const-string v13, "Ignoring region with unsupported extent: "

    .line 736
    .line 737
    invoke-static {v10, v2}, Lcom/google/android/gms/internal/ads/zzfv;->zzc(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v36

    .line 741
    if-nez v36, :cond_17

    .line 742
    .line 743
    move-object/from16 v0, p2

    .line 744
    .line 745
    move-object/from16 v46, v5

    .line 746
    .line 747
    move-object/from16 v48, v12

    .line 748
    .line 749
    move-object/from16 v47, v14

    .line 750
    .line 751
    goto/16 :goto_1f

    .line 752
    .line 753
    :cond_17
    const-string v2, "origin"

    .line 754
    .line 755
    invoke-static {v10, v2}, Lcom/google/android/gms/internal/ads/zzfv;->zzc(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v2

    .line 759
    if-nez v2, :cond_18

    .line 760
    .line 761
    move-object/from16 p1, v2

    .line 762
    .line 763
    invoke-static {v10, v6}, Lcom/google/android/gms/internal/ads/zzfv;->zzc(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v2

    .line 767
    if-eqz v2, :cond_19

    .line 768
    .line 769
    invoke-virtual {v11, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v2

    .line 773
    check-cast v2, Lcom/google/android/gms/internal/ads/zzaov;

    .line 774
    .line 775
    if-eqz v2, :cond_19

    .line 776
    .line 777
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzaov;->zzL()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v2

    .line 781
    goto :goto_15

    .line 782
    :cond_18
    move-object/from16 p1, v2

    .line 783
    .line 784
    :cond_19
    move-object/from16 v2, p1

    .line 785
    .line 786
    :goto_15
    const/high16 v32, 0x42c80000    # 100.0f

    .line 787
    .line 788
    if-eqz v2, :cond_21

    .line 789
    .line 790
    move-object/from16 v46, v5

    .line 791
    .line 792
    sget-object v5, Lcom/google/android/gms/internal/ads/zzaos;->zzb:Ljava/util/regex/Pattern;

    .line 793
    .line 794
    invoke-virtual {v5, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 795
    .line 796
    .line 797
    move-result-object v5

    .line 798
    move-object/from16 v47, v14

    .line 799
    .line 800
    sget-object v14, Lcom/google/android/gms/internal/ads/zzaos;->zzf:Ljava/util/regex/Pattern;

    .line 801
    .line 802
    invoke-virtual {v14, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 803
    .line 804
    .line 805
    move-result-object v14

    .line 806
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 807
    .line 808
    .line 809
    move-result v35
    :try_end_a
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0

    .line 810
    if-eqz v35, :cond_1c

    .line 811
    .line 812
    move-object/from16 v48, v12

    .line 813
    .line 814
    const/4 v12, 0x1

    .line 815
    :try_start_b
    invoke-virtual {v5, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v8

    .line 819
    if-eqz v8, :cond_1b

    .line 820
    .line 821
    invoke-static {v8}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 822
    .line 823
    .line 824
    move-result v8

    .line 825
    div-float v8, v8, v32

    .line 826
    .line 827
    const/4 v14, 0x2

    .line 828
    invoke-virtual {v5, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v5

    .line 832
    if-eqz v5, :cond_1a

    .line 833
    .line 834
    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 835
    .line 836
    .line 837
    move-result v0

    .line 838
    div-float v0, v0, v32

    .line 839
    .line 840
    move/from16 v37, v8

    .line 841
    .line 842
    goto :goto_17

    .line 843
    :cond_1a
    throw p2

    .line 844
    :cond_1b
    throw p2
    :try_end_b
    .catch Ljava/lang/NumberFormatException; {:try_start_b .. :try_end_b} :catch_6
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_b .. :try_end_b} :catch_1
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_0

    .line 845
    :catch_6
    :try_start_c
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 850
    .line 851
    .line 852
    :goto_16
    move-object/from16 v0, p2

    .line 853
    .line 854
    goto/16 :goto_1f

    .line 855
    .line 856
    :cond_1c
    move-object/from16 v48, v12

    .line 857
    .line 858
    invoke-virtual {v14}, Ljava/util/regex/Matcher;->matches()Z

    .line 859
    .line 860
    .line 861
    move-result v5

    .line 862
    if-eqz v5, :cond_20

    .line 863
    .line 864
    if-nez v7, :cond_1d

    .line 865
    .line 866
    invoke-virtual {v15, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_c .. :try_end_c} :catch_1
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_0

    .line 871
    .line 872
    .line 873
    goto :goto_16

    .line 874
    :cond_1d
    const/4 v12, 0x1

    .line 875
    :try_start_d
    invoke-virtual {v14, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v5

    .line 879
    if-eqz v5, :cond_1f

    .line 880
    .line 881
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 882
    .line 883
    .line 884
    move-result v5

    .line 885
    const/4 v8, 0x2

    .line 886
    invoke-virtual {v14, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v12

    .line 890
    if-eqz v12, :cond_1e

    .line 891
    .line 892
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 893
    .line 894
    .line 895
    move-result v8

    .line 896
    int-to-float v5, v5

    .line 897
    iget v12, v7, Lcom/google/android/gms/internal/ads/zzaor;->zza:I

    .line 898
    .line 899
    int-to-float v12, v12

    .line 900
    div-float/2addr v5, v12

    .line 901
    int-to-float v8, v8

    .line 902
    iget v0, v7, Lcom/google/android/gms/internal/ads/zzaor;->zzb:I

    .line 903
    .line 904
    int-to-float v0, v0

    .line 905
    div-float v0, v8, v0

    .line 906
    .line 907
    move/from16 v37, v5

    .line 908
    .line 909
    goto :goto_17

    .line 910
    :cond_1e
    throw p2

    .line 911
    :cond_1f
    throw p2
    :try_end_d
    .catch Ljava/lang/NumberFormatException; {:try_start_d .. :try_end_d} :catch_7
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_d .. :try_end_d} :catch_1
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_0

    .line 912
    :catch_7
    :try_start_e
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 917
    .line 918
    .line 919
    goto :goto_16

    .line 920
    :cond_20
    invoke-virtual {v8, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 925
    .line 926
    .line 927
    goto :goto_16

    .line 928
    :cond_21
    move-object/from16 v46, v5

    .line 929
    .line 930
    move-object/from16 v48, v12

    .line 931
    .line 932
    move-object/from16 v47, v14

    .line 933
    .line 934
    const/4 v0, 0x0

    .line 935
    const/16 v37, 0x0

    .line 936
    .line 937
    :goto_17
    invoke-static {v10, v1}, Lcom/google/android/gms/internal/ads/zzfv;->zzc(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v5

    .line 941
    if-nez v5, :cond_22

    .line 942
    .line 943
    invoke-static {v10, v6}, Lcom/google/android/gms/internal/ads/zzfv;->zzc(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 944
    .line 945
    .line 946
    move-result-object v8

    .line 947
    if-eqz v8, :cond_22

    .line 948
    .line 949
    invoke-virtual {v11, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 950
    .line 951
    .line 952
    move-result-object v8

    .line 953
    check-cast v8, Lcom/google/android/gms/internal/ads/zzaov;

    .line 954
    .line 955
    if-eqz v8, :cond_22

    .line 956
    .line 957
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzaov;->zzN()Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    move-result-object v5

    .line 961
    :cond_22
    if-eqz v5, :cond_2a

    .line 962
    .line 963
    sget-object v8, Lcom/google/android/gms/internal/ads/zzaos;->zzb:Ljava/util/regex/Pattern;

    .line 964
    .line 965
    invoke-virtual {v8, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 966
    .line 967
    .line 968
    move-result-object v8

    .line 969
    sget-object v12, Lcom/google/android/gms/internal/ads/zzaos;->zzf:Ljava/util/regex/Pattern;

    .line 970
    .line 971
    invoke-virtual {v12, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 972
    .line 973
    .line 974
    move-result-object v5

    .line 975
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    .line 976
    .line 977
    .line 978
    move-result v12
    :try_end_e
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_0

    .line 979
    if-eqz v12, :cond_25

    .line 980
    .line 981
    const/4 v12, 0x1

    .line 982
    :try_start_f
    invoke-virtual {v8, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v5

    .line 986
    if-eqz v5, :cond_24

    .line 987
    .line 988
    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 989
    .line 990
    .line 991
    move-result v5

    .line 992
    div-float v5, v5, v32

    .line 993
    .line 994
    const/4 v14, 0x2

    .line 995
    invoke-virtual {v8, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v8

    .line 999
    if-eqz v8, :cond_23

    .line 1000
    .line 1001
    invoke-static {v8}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1002
    .line 1003
    .line 1004
    move-result v2

    .line 1005
    div-float v2, v2, v32

    .line 1006
    .line 1007
    move/from16 v42, v2

    .line 1008
    .line 1009
    move/from16 v41, v5

    .line 1010
    .line 1011
    goto :goto_18

    .line 1012
    :cond_23
    throw p2

    .line 1013
    :cond_24
    throw p2
    :try_end_f
    .catch Ljava/lang/NumberFormatException; {:try_start_f .. :try_end_f} :catch_8
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_f .. :try_end_f} :catch_1
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_0

    .line 1014
    :catch_8
    :try_start_10
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v0

    .line 1018
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v0

    .line 1022
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    goto/16 :goto_16

    .line 1026
    .line 1027
    :cond_25
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 1028
    .line 1029
    .line 1030
    move-result v8

    .line 1031
    if-eqz v8, :cond_29

    .line 1032
    .line 1033
    if-nez v7, :cond_26

    .line 1034
    .line 1035
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v0

    .line 1039
    invoke-virtual {v15, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v0

    .line 1043
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_10
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_10 .. :try_end_10} :catch_1
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_0

    .line 1044
    .line 1045
    .line 1046
    goto/16 :goto_16

    .line 1047
    .line 1048
    :cond_26
    const/4 v12, 0x1

    .line 1049
    :try_start_11
    invoke-virtual {v5, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v8

    .line 1053
    if-eqz v8, :cond_28

    .line 1054
    .line 1055
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1056
    .line 1057
    .line 1058
    move-result v8

    .line 1059
    const/4 v14, 0x2

    .line 1060
    invoke-virtual {v5, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v5

    .line 1064
    if-eqz v5, :cond_27

    .line 1065
    .line 1066
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1067
    .line 1068
    .line 1069
    move-result v5

    .line 1070
    int-to-float v8, v8

    .line 1071
    iget v12, v7, Lcom/google/android/gms/internal/ads/zzaor;->zza:I

    .line 1072
    .line 1073
    int-to-float v12, v12

    .line 1074
    div-float/2addr v8, v12

    .line 1075
    int-to-float v5, v5

    .line 1076
    iget v2, v7, Lcom/google/android/gms/internal/ads/zzaor;->zzb:I

    .line 1077
    .line 1078
    int-to-float v2, v2

    .line 1079
    div-float v2, v5, v2

    .line 1080
    .line 1081
    move/from16 v42, v2

    .line 1082
    .line 1083
    move/from16 v41, v8

    .line 1084
    .line 1085
    goto :goto_18

    .line 1086
    :cond_27
    throw p2

    .line 1087
    :cond_28
    throw p2
    :try_end_11
    .catch Ljava/lang/NumberFormatException; {:try_start_11 .. :try_end_11} :catch_9
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_11 .. :try_end_11} :catch_1
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_0

    .line 1088
    :catch_9
    :try_start_12
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v0

    .line 1092
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v0

    .line 1096
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 1097
    .line 1098
    .line 1099
    goto/16 :goto_16

    .line 1100
    .line 1101
    :cond_29
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    invoke-virtual {v13, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v0

    .line 1109
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 1110
    .line 1111
    .line 1112
    goto/16 :goto_16

    .line 1113
    .line 1114
    :cond_2a
    move/from16 v41, v26

    .line 1115
    .line 1116
    move/from16 v42, v41

    .line 1117
    .line 1118
    :goto_18
    const-string v2, "displayAlign"

    .line 1119
    .line 1120
    invoke-static {v10, v2}, Lcom/google/android/gms/internal/ads/zzfv;->zzc(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v2

    .line 1124
    if-eqz v2, :cond_2e

    .line 1125
    .line 1126
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzgsz;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v2

    .line 1130
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 1131
    .line 1132
    .line 1133
    move-result v3
    :try_end_12
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_12 .. :try_end_12} :catch_1
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_0

    .line 1134
    const v5, -0x514d33ab

    .line 1135
    .line 1136
    .line 1137
    if-eq v3, v5, :cond_2c

    .line 1138
    .line 1139
    const v5, 0x58705dc

    .line 1140
    .line 1141
    .line 1142
    if-eq v3, v5, :cond_2b

    .line 1143
    .line 1144
    goto :goto_19

    .line 1145
    :cond_2b
    const-string v3, "after"

    .line 1146
    .line 1147
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1148
    .line 1149
    .line 1150
    move-result v2

    .line 1151
    if-eqz v2, :cond_2d

    .line 1152
    .line 1153
    const/4 v2, 0x1

    .line 1154
    goto :goto_1a

    .line 1155
    :cond_2c
    const-string v3, "center"

    .line 1156
    .line 1157
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1158
    .line 1159
    .line 1160
    move-result v2

    .line 1161
    if-eqz v2, :cond_2d

    .line 1162
    .line 1163
    move/from16 v2, v18

    .line 1164
    .line 1165
    goto :goto_1a

    .line 1166
    :cond_2d
    :goto_19
    const/4 v2, -0x1

    .line 1167
    :goto_1a
    if-eqz v2, :cond_30

    .line 1168
    .line 1169
    const/4 v12, 0x1

    .line 1170
    if-eq v2, v12, :cond_2f

    .line 1171
    .line 1172
    :cond_2e
    move/from16 v38, v0

    .line 1173
    .line 1174
    move/from16 v40, v18

    .line 1175
    .line 1176
    goto :goto_1b

    .line 1177
    :cond_2f
    add-float v0, v0, v42

    .line 1178
    .line 1179
    move/from16 v38, v0

    .line 1180
    .line 1181
    const/16 v40, 0x2

    .line 1182
    .line 1183
    goto :goto_1b

    .line 1184
    :cond_30
    const/high16 v2, 0x40000000    # 2.0f

    .line 1185
    .line 1186
    div-float v2, v42, v2

    .line 1187
    .line 1188
    add-float/2addr v0, v2

    .line 1189
    move/from16 v38, v0

    .line 1190
    .line 1191
    const/16 v40, 0x1

    .line 1192
    .line 1193
    :goto_1b
    int-to-float v0, v9

    .line 1194
    div-float v44, v26, v0

    .line 1195
    .line 1196
    :try_start_13
    const-string v0, "writingMode"

    .line 1197
    .line 1198
    invoke-static {v10, v0}, Lcom/google/android/gms/internal/ads/zzfv;->zzc(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    if-eqz v0, :cond_35

    .line 1203
    .line 1204
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgsz;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v0

    .line 1208
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 1209
    .line 1210
    .line 1211
    move-result v2
    :try_end_13
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_13 .. :try_end_13} :catch_1
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_0

    .line 1212
    const/16 v3, 0xe6e

    .line 1213
    .line 1214
    if-eq v2, v3, :cond_33

    .line 1215
    .line 1216
    const v3, 0x363874

    .line 1217
    .line 1218
    .line 1219
    if-eq v2, v3, :cond_32

    .line 1220
    .line 1221
    const v3, 0x363928

    .line 1222
    .line 1223
    .line 1224
    if-eq v2, v3, :cond_31

    .line 1225
    .line 1226
    goto :goto_1c

    .line 1227
    :cond_31
    const-string v2, "tbrl"

    .line 1228
    .line 1229
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1230
    .line 1231
    .line 1232
    move-result v0

    .line 1233
    if-eqz v0, :cond_34

    .line 1234
    .line 1235
    const/4 v0, 0x2

    .line 1236
    goto :goto_1d

    .line 1237
    :cond_32
    const-string v2, "tblr"

    .line 1238
    .line 1239
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1240
    .line 1241
    .line 1242
    move-result v0

    .line 1243
    if-eqz v0, :cond_34

    .line 1244
    .line 1245
    const/4 v0, 0x1

    .line 1246
    goto :goto_1d

    .line 1247
    :cond_33
    const-string v2, "tb"

    .line 1248
    .line 1249
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1250
    .line 1251
    .line 1252
    move-result v0

    .line 1253
    if-eqz v0, :cond_34

    .line 1254
    .line 1255
    move/from16 v0, v18

    .line 1256
    .line 1257
    goto :goto_1d

    .line 1258
    :cond_34
    :goto_1c
    const/4 v0, -0x1

    .line 1259
    :goto_1d
    if-eqz v0, :cond_37

    .line 1260
    .line 1261
    const/4 v12, 0x1

    .line 1262
    if-eq v0, v12, :cond_37

    .line 1263
    .line 1264
    const/4 v14, 0x2

    .line 1265
    if-eq v0, v14, :cond_36

    .line 1266
    .line 1267
    :cond_35
    const/high16 v45, -0x80000000

    .line 1268
    .line 1269
    goto :goto_1e

    .line 1270
    :cond_36
    const/16 v45, 0x1

    .line 1271
    .line 1272
    goto :goto_1e

    .line 1273
    :cond_37
    const/16 v45, 0x2

    .line 1274
    .line 1275
    :goto_1e
    :try_start_14
    new-instance v35, Lcom/google/android/gms/internal/ads/zzaot;

    .line 1276
    .line 1277
    const/16 v39, 0x0

    .line 1278
    .line 1279
    const/16 v43, 0x1

    .line 1280
    .line 1281
    invoke-direct/range {v35 .. v45}, Lcom/google/android/gms/internal/ads/zzaot;-><init>(Ljava/lang/String;FFIIFFIFI)V

    .line 1282
    .line 1283
    .line 1284
    move-object/from16 v0, v35

    .line 1285
    .line 1286
    :goto_1f
    if-eqz v0, :cond_38

    .line 1287
    .line 1288
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaot;->zza:Ljava/lang/String;

    .line 1289
    .line 1290
    move-object/from16 v3, v48

    .line 1291
    .line 1292
    invoke-virtual {v3, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1293
    .line 1294
    .line 1295
    :goto_20
    move-object/from16 v2, v22

    .line 1296
    .line 1297
    move-object/from16 v13, v34

    .line 1298
    .line 1299
    move-object/from16 v5, v46

    .line 1300
    .line 1301
    move-object/from16 v0, v47

    .line 1302
    .line 1303
    goto :goto_23

    .line 1304
    :cond_38
    move-object/from16 v3, v48

    .line 1305
    .line 1306
    goto :goto_20

    .line 1307
    :cond_39
    move-object/from16 v46, v5

    .line 1308
    .line 1309
    move-object v3, v12

    .line 1310
    move-object/from16 v34, v13

    .line 1311
    .line 1312
    move-object v0, v14

    .line 1313
    move-object/from16 v23, v15

    .line 1314
    .line 1315
    invoke-static {v10, v0}, Lcom/google/android/gms/internal/ads/zzfv;->zzb(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1316
    .line 1317
    .line 1318
    move-result v5

    .line 1319
    if-eqz v5, :cond_3c

    .line 1320
    .line 1321
    :goto_21
    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 1322
    .line 1323
    .line 1324
    move-object/from16 v5, v46

    .line 1325
    .line 1326
    invoke-static {v10, v5}, Lcom/google/android/gms/internal/ads/zzfv;->zzb(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1327
    .line 1328
    .line 1329
    move-result v8

    .line 1330
    if-eqz v8, :cond_3a

    .line 1331
    .line 1332
    invoke-static {v10, v2}, Lcom/google/android/gms/internal/ads/zzfv;->zzc(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v8

    .line 1336
    if-eqz v8, :cond_3a

    .line 1337
    .line 1338
    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v12

    .line 1342
    move-object/from16 v13, v34

    .line 1343
    .line 1344
    invoke-virtual {v13, v8, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1345
    .line 1346
    .line 1347
    goto :goto_22

    .line 1348
    :cond_3a
    move-object/from16 v13, v34

    .line 1349
    .line 1350
    :goto_22
    invoke-static {v10, v0}, Lcom/google/android/gms/internal/ads/zzfv;->zza(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1351
    .line 1352
    .line 1353
    move-result v8

    .line 1354
    if-eqz v8, :cond_3b

    .line 1355
    .line 1356
    goto/16 :goto_14

    .line 1357
    .line 1358
    :cond_3b
    move-object/from16 v46, v5

    .line 1359
    .line 1360
    move-object/from16 v34, v13

    .line 1361
    .line 1362
    goto :goto_21

    .line 1363
    :cond_3c
    move-object/from16 v13, v34

    .line 1364
    .line 1365
    move-object/from16 v5, v46

    .line 1366
    .line 1367
    goto/16 :goto_14

    .line 1368
    .line 1369
    :goto_23
    invoke-static {v10, v2}, Lcom/google/android/gms/internal/ads/zzfv;->zza(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1370
    .line 1371
    .line 1372
    move-result v8
    :try_end_14
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_14 .. :try_end_14} :catch_1
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_0

    .line 1373
    if-eqz v8, :cond_3d

    .line 1374
    .line 1375
    move-object/from16 v2, v21

    .line 1376
    .line 1377
    move-object/from16 v6, v29

    .line 1378
    .line 1379
    const/4 v8, 0x5

    .line 1380
    goto/16 :goto_30

    .line 1381
    .line 1382
    :cond_3d
    move-object v14, v0

    .line 1383
    move-object v12, v3

    .line 1384
    move-object/from16 v15, v23

    .line 1385
    .line 1386
    move-object/from16 v8, v33

    .line 1387
    .line 1388
    move-object v3, v2

    .line 1389
    goto/16 :goto_12

    .line 1390
    .line 1391
    :cond_3e
    move-object/from16 v33, v8

    .line 1392
    .line 1393
    move-object v3, v12

    .line 1394
    move-object/from16 v23, v15

    .line 1395
    .line 1396
    :try_start_15
    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 1397
    .line 1398
    .line 1399
    move-result v0

    .line 1400
    move-object/from16 v1, p2

    .line 1401
    .line 1402
    invoke-static {v10, v1}, Lcom/google/android/gms/internal/ads/zzaos;->zzd(Lorg/xmlpull/v1/XmlPullParser;Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v39
    :try_end_15
    .catch Lcom/google/android/gms/internal/ads/zzano; {:try_start_15 .. :try_end_15} :catch_e
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_15 .. :try_end_15} :catch_1
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_0

    .line 1406
    move/from16 v5, v18

    .line 1407
    .line 1408
    move-object/from16 v41, v28

    .line 1409
    .line 1410
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    const-wide v34, -0x7fffffffffffffffL    # -4.9E-324

    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    const-wide v36, -0x7fffffffffffffffL    # -4.9E-324

    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    const/16 v40, 0x0

    .line 1426
    .line 1427
    const/16 v42, 0x0

    .line 1428
    .line 1429
    :goto_24
    if-ge v5, v0, :cond_48

    .line 1430
    .line 1431
    :try_start_16
    invoke-interface {v10, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v8

    .line 1435
    invoke-interface {v10, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v12

    .line 1439
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 1440
    .line 1441
    .line 1442
    move-result v22
    :try_end_16
    .catch Lcom/google/android/gms/internal/ads/zzano; {:try_start_16 .. :try_end_16} :catch_c
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_16 .. :try_end_16} :catch_1
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_0

    .line 1443
    sparse-switch v22, :sswitch_data_0

    .line 1444
    .line 1445
    .line 1446
    move-object/from16 v1, v23

    .line 1447
    .line 1448
    const-wide v43, -0x7fffffffffffffffL    # -4.9E-324

    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    goto/16 :goto_25

    .line 1454
    .line 1455
    :sswitch_0
    const-wide v43, -0x7fffffffffffffffL    # -4.9E-324

    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    const-string v1, "backgroundImage"

    .line 1461
    .line 1462
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1463
    .line 1464
    .line 1465
    move-result v1

    .line 1466
    if-eqz v1, :cond_3f

    .line 1467
    .line 1468
    move-object/from16 v1, v23

    .line 1469
    .line 1470
    const/4 v2, 0x5

    .line 1471
    goto :goto_26

    .line 1472
    :cond_3f
    move-object/from16 v1, v23

    .line 1473
    .line 1474
    goto :goto_25

    .line 1475
    :sswitch_1
    const-wide v43, -0x7fffffffffffffffL    # -4.9E-324

    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1481
    .line 1482
    .line 1483
    move-result v1

    .line 1484
    if-eqz v1, :cond_3f

    .line 1485
    .line 1486
    move-object/from16 v1, v23

    .line 1487
    .line 1488
    const/4 v2, 0x3

    .line 1489
    goto :goto_26

    .line 1490
    :sswitch_2
    const-wide v43, -0x7fffffffffffffffL    # -4.9E-324

    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    const-string v1, "begin"

    .line 1496
    .line 1497
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1498
    .line 1499
    .line 1500
    move-result v1

    .line 1501
    if-eqz v1, :cond_3f

    .line 1502
    .line 1503
    move/from16 v2, v18

    .line 1504
    .line 1505
    move-object/from16 v1, v23

    .line 1506
    .line 1507
    goto :goto_26

    .line 1508
    :sswitch_3
    const-wide v43, -0x7fffffffffffffffL    # -4.9E-324

    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    const-string v1, "end"

    .line 1514
    .line 1515
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1516
    .line 1517
    .line 1518
    move-result v1

    .line 1519
    if-eqz v1, :cond_3f

    .line 1520
    .line 1521
    move-object/from16 v1, v23

    .line 1522
    .line 1523
    const/4 v2, 0x1

    .line 1524
    goto :goto_26

    .line 1525
    :sswitch_4
    const-wide v43, -0x7fffffffffffffffL    # -4.9E-324

    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    const-string v1, "dur"

    .line 1531
    .line 1532
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1533
    .line 1534
    .line 1535
    move-result v1

    .line 1536
    if-eqz v1, :cond_3f

    .line 1537
    .line 1538
    move-object/from16 v1, v23

    .line 1539
    .line 1540
    const/4 v2, 0x2

    .line 1541
    goto :goto_26

    .line 1542
    :sswitch_5
    move-object/from16 v1, v23

    .line 1543
    .line 1544
    const-wide v43, -0x7fffffffffffffffL    # -4.9E-324

    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1550
    .line 1551
    .line 1552
    move-result v2

    .line 1553
    if-eqz v2, :cond_40

    .line 1554
    .line 1555
    const/4 v2, 0x4

    .line 1556
    goto :goto_26

    .line 1557
    :cond_40
    :goto_25
    const/4 v2, -0x1

    .line 1558
    :goto_26
    if-eqz v2, :cond_47

    .line 1559
    .line 1560
    const/4 v8, 0x1

    .line 1561
    if-eq v2, v8, :cond_46

    .line 1562
    .line 1563
    const/4 v8, 0x2

    .line 1564
    if-eq v2, v8, :cond_45

    .line 1565
    .line 1566
    const/4 v8, 0x3

    .line 1567
    if-eq v2, v8, :cond_44

    .line 1568
    .line 1569
    const/4 v8, 0x4

    .line 1570
    if-eq v2, v8, :cond_43

    .line 1571
    .line 1572
    const/4 v8, 0x5

    .line 1573
    if-eq v2, v8, :cond_41

    .line 1574
    .line 1575
    goto :goto_27

    .line 1576
    :cond_41
    :try_start_17
    const-string v2, "#"

    .line 1577
    .line 1578
    invoke-virtual {v12, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1579
    .line 1580
    .line 1581
    move-result v2

    .line 1582
    if-eqz v2, :cond_42

    .line 1583
    .line 1584
    const/4 v2, 0x1

    .line 1585
    invoke-virtual {v12, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v12

    .line 1589
    move-object/from16 v42, v12

    .line 1590
    .line 1591
    :cond_42
    :goto_27
    move-object/from16 v2, v21

    .line 1592
    .line 1593
    :goto_28
    const/16 v25, 0x1

    .line 1594
    .line 1595
    goto :goto_2a

    .line 1596
    :catch_a
    move-exception v0

    .line 1597
    move-object/from16 v2, v21

    .line 1598
    .line 1599
    :goto_29
    move-object/from16 v6, v29

    .line 1600
    .line 1601
    goto/16 :goto_31

    .line 1602
    .line 1603
    :cond_43
    const/4 v8, 0x5

    .line 1604
    invoke-virtual {v3, v12}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 1605
    .line 1606
    .line 1607
    move-result v2

    .line 1608
    if-eqz v2, :cond_42

    .line 1609
    .line 1610
    move-object/from16 v41, v12

    .line 1611
    .line 1612
    goto :goto_27

    .line 1613
    :cond_44
    const/4 v8, 0x5

    .line 1614
    invoke-static {v12}, Lcom/google/android/gms/internal/ads/zzaos;->zzc(Ljava/lang/String;)[Ljava/lang/String;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v2

    .line 1618
    array-length v12, v2
    :try_end_17
    .catch Lcom/google/android/gms/internal/ads/zzano; {:try_start_17 .. :try_end_17} :catch_a
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_17 .. :try_end_17} :catch_1
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_0

    .line 1619
    if-lez v12, :cond_42

    .line 1620
    .line 1621
    move-object/from16 v40, v2

    .line 1622
    .line 1623
    goto :goto_27

    .line 1624
    :cond_45
    move-object/from16 v2, v21

    .line 1625
    .line 1626
    const/4 v8, 0x5

    .line 1627
    :try_start_18
    invoke-static {v12, v2}, Lcom/google/android/gms/internal/ads/zzaos;->zzg(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaoq;)J

    .line 1628
    .line 1629
    .line 1630
    move-result-wide v36

    .line 1631
    goto :goto_28

    .line 1632
    :catch_b
    move-exception v0

    .line 1633
    goto :goto_29

    .line 1634
    :cond_46
    move-object/from16 v2, v21

    .line 1635
    .line 1636
    const/4 v8, 0x5

    .line 1637
    invoke-static {v12, v2}, Lcom/google/android/gms/internal/ads/zzaos;->zzg(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaoq;)J

    .line 1638
    .line 1639
    .line 1640
    move-result-wide v14

    .line 1641
    goto :goto_28

    .line 1642
    :cond_47
    move-object/from16 v2, v21

    .line 1643
    .line 1644
    const/4 v8, 0x5

    .line 1645
    invoke-static {v12, v2}, Lcom/google/android/gms/internal/ads/zzaos;->zzg(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaoq;)J

    .line 1646
    .line 1647
    .line 1648
    move-result-wide v34

    .line 1649
    goto :goto_28

    .line 1650
    :goto_2a
    add-int/lit8 v5, v5, 0x1

    .line 1651
    .line 1652
    move-object/from16 v23, v1

    .line 1653
    .line 1654
    move-object/from16 v21, v2

    .line 1655
    .line 1656
    goto/16 :goto_24

    .line 1657
    .line 1658
    :catch_c
    move-exception v0

    .line 1659
    move-object/from16 v2, v21

    .line 1660
    .line 1661
    const/4 v8, 0x5

    .line 1662
    goto :goto_29

    .line 1663
    :cond_48
    move-object/from16 v2, v21

    .line 1664
    .line 1665
    const/4 v8, 0x5

    .line 1666
    const-wide v43, -0x7fffffffffffffffL    # -4.9E-324

    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    if-eqz v32, :cond_4c

    .line 1672
    .line 1673
    move-object/from16 v1, v32

    .line 1674
    .line 1675
    iget-wide v5, v1, Lcom/google/android/gms/internal/ads/zzaop;->zzd:J

    .line 1676
    .line 1677
    cmp-long v0, v5, v43

    .line 1678
    .line 1679
    if-eqz v0, :cond_4a

    .line 1680
    .line 1681
    cmp-long v0, v34, v43

    .line 1682
    .line 1683
    if-eqz v0, :cond_49

    .line 1684
    .line 1685
    add-long v34, v34, v5

    .line 1686
    .line 1687
    goto :goto_2b

    .line 1688
    :cond_49
    move-wide/from16 v34, v43

    .line 1689
    .line 1690
    :goto_2b
    cmp-long v0, v14, v43

    .line 1691
    .line 1692
    if-eqz v0, :cond_4b

    .line 1693
    .line 1694
    add-long/2addr v14, v5

    .line 1695
    :cond_4a
    move-object v0, v1

    .line 1696
    goto :goto_2c

    .line 1697
    :cond_4b
    move-object v0, v1

    .line 1698
    move-wide/from16 v14, v43

    .line 1699
    .line 1700
    goto :goto_2c

    .line 1701
    :cond_4c
    move-object/from16 v1, v32

    .line 1702
    .line 1703
    const/4 v0, 0x0

    .line 1704
    :goto_2c
    cmp-long v5, v14, v43

    .line 1705
    .line 1706
    if-nez v5, :cond_4f

    .line 1707
    .line 1708
    cmp-long v5, v36, v43

    .line 1709
    .line 1710
    if-eqz v5, :cond_4d

    .line 1711
    .line 1712
    add-long v5, v34, v36

    .line 1713
    .line 1714
    :goto_2d
    move-wide/from16 v37, v5

    .line 1715
    .line 1716
    :goto_2e
    move-wide/from16 v35, v34

    .line 1717
    .line 1718
    goto :goto_2f

    .line 1719
    :cond_4d
    if-eqz v0, :cond_4e

    .line 1720
    .line 1721
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzaop;->zze:J

    .line 1722
    .line 1723
    cmp-long v12, v5, v43

    .line 1724
    .line 1725
    if-eqz v12, :cond_4e

    .line 1726
    .line 1727
    goto :goto_2d

    .line 1728
    :cond_4e
    move-wide/from16 v35, v34

    .line 1729
    .line 1730
    move-wide/from16 v37, v43

    .line 1731
    .line 1732
    goto :goto_2f

    .line 1733
    :cond_4f
    move-wide/from16 v37, v14

    .line 1734
    .line 1735
    goto :goto_2e

    .line 1736
    :goto_2f
    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v34

    .line 1740
    move-object/from16 v43, v0

    .line 1741
    .line 1742
    invoke-static/range {v34 .. v43}, Lcom/google/android/gms/internal/ads/zzaop;->zzb(Ljava/lang/String;JJLcom/google/android/gms/internal/ads/zzaov;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaop;)Lcom/google/android/gms/internal/ads/zzaop;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v0
    :try_end_18
    .catch Lcom/google/android/gms/internal/ads/zzano; {:try_start_18 .. :try_end_18} :catch_b
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_18 .. :try_end_18} :catch_1
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_0

    .line 1746
    move-object/from16 v6, v29

    .line 1747
    .line 1748
    :try_start_19
    invoke-virtual {v6, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 1749
    .line 1750
    .line 1751
    if-eqz v1, :cond_50

    .line 1752
    .line 1753
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzaop;->zzd(Lcom/google/android/gms/internal/ads/zzaop;)V
    :try_end_19
    .catch Lcom/google/android/gms/internal/ads/zzano; {:try_start_19 .. :try_end_19} :catch_d
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_19 .. :try_end_19} :catch_1
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_0

    .line 1754
    .line 1755
    .line 1756
    goto :goto_30

    .line 1757
    :catch_d
    move-exception v0

    .line 1758
    goto :goto_31

    .line 1759
    :cond_50
    :goto_30
    move-object/from16 v21, v2

    .line 1760
    .line 1761
    move-object/from16 v22, v7

    .line 1762
    .line 1763
    move/from16 v23, v9

    .line 1764
    .line 1765
    goto/16 :goto_f

    .line 1766
    .line 1767
    :catch_e
    move-exception v0

    .line 1768
    move-object/from16 v2, v21

    .line 1769
    .line 1770
    move-object/from16 v6, v29

    .line 1771
    .line 1772
    const/4 v8, 0x5

    .line 1773
    :goto_31
    :try_start_1a
    const-string v1, "Suppressing parser error"

    .line 1774
    .line 1775
    invoke-static {v4, v1, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1776
    .line 1777
    .line 1778
    move-object/from16 v21, v2

    .line 1779
    .line 1780
    move-object/from16 v22, v7

    .line 1781
    .line 1782
    move/from16 v23, v9

    .line 1783
    .line 1784
    goto/16 :goto_e

    .line 1785
    .line 1786
    :cond_51
    move-object v1, v3

    .line 1787
    move-object/from16 v28, v6

    .line 1788
    .line 1789
    move-object/from16 v30, v7

    .line 1790
    .line 1791
    move-object/from16 v33, v8

    .line 1792
    .line 1793
    move-object v3, v12

    .line 1794
    move-object v6, v14

    .line 1795
    move-object/from16 v31, v15

    .line 1796
    .line 1797
    const/4 v2, 0x4

    .line 1798
    const/4 v8, 0x5

    .line 1799
    if-ne v0, v2, :cond_53

    .line 1800
    .line 1801
    if-eqz v1, :cond_52

    .line 1802
    .line 1803
    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 1804
    .line 1805
    .line 1806
    move-result-object v0

    .line 1807
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaop;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaop;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v0

    .line 1811
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzaop;->zzd(Lcom/google/android/gms/internal/ads/zzaop;)V

    .line 1812
    .line 1813
    .line 1814
    goto/16 :goto_f

    .line 1815
    .line 1816
    :cond_52
    const/4 v1, 0x0

    .line 1817
    throw v1

    .line 1818
    :cond_53
    const/4 v1, 0x3

    .line 1819
    if-ne v0, v1, :cond_11

    .line 1820
    .line 1821
    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v0

    .line 1825
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1826
    .line 1827
    .line 1828
    move-result v0

    .line 1829
    if-eqz v0, :cond_55

    .line 1830
    .line 1831
    new-instance v0, Lcom/google/android/gms/internal/ads/zzaow;

    .line 1832
    .line 1833
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v1

    .line 1837
    check-cast v1, Lcom/google/android/gms/internal/ads/zzaop;

    .line 1838
    .line 1839
    if-eqz v1, :cond_54

    .line 1840
    .line 1841
    invoke-direct {v0, v1, v11, v3, v13}, Lcom/google/android/gms/internal/ads/zzaow;-><init>(Lcom/google/android/gms/internal/ads/zzaop;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    .line 1842
    .line 1843
    .line 1844
    move-object/from16 v19, v0

    .line 1845
    .line 1846
    goto :goto_32

    .line 1847
    :cond_54
    const/4 v1, 0x0

    .line 1848
    throw v1

    .line 1849
    :cond_55
    :goto_32
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 1850
    .line 1851
    .line 1852
    goto/16 :goto_f

    .line 1853
    .line 1854
    :cond_56
    move-object/from16 v28, v6

    .line 1855
    .line 1856
    move-object/from16 v30, v7

    .line 1857
    .line 1858
    move-object/from16 v33, v8

    .line 1859
    .line 1860
    move-object v3, v12

    .line 1861
    move-object v6, v14

    .line 1862
    move-object/from16 v31, v15

    .line 1863
    .line 1864
    const/4 v8, 0x5

    .line 1865
    move v14, v1

    .line 1866
    if-ne v0, v14, :cond_57

    .line 1867
    .line 1868
    const/16 v25, 0x1

    .line 1869
    .line 1870
    add-int/lit8 v20, v20, 0x1

    .line 1871
    .line 1872
    goto/16 :goto_10

    .line 1873
    .line 1874
    :cond_57
    const/4 v1, 0x3

    .line 1875
    const/16 v25, 0x1

    .line 1876
    .line 1877
    const/16 v27, -0x1

    .line 1878
    .line 1879
    if-ne v0, v1, :cond_58

    .line 1880
    .line 1881
    add-int/lit8 v20, v20, -0x1

    .line 1882
    .line 1883
    :cond_58
    :goto_33
    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 1884
    .line 1885
    .line 1886
    invoke-interface {v10}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 1887
    .line 1888
    .line 1889
    move-result v0

    .line 1890
    move-object/from16 v9, p0

    .line 1891
    .line 1892
    move-object v12, v3

    .line 1893
    move-object v14, v6

    .line 1894
    move/from16 v5, v25

    .line 1895
    .line 1896
    move-object/from16 v6, v28

    .line 1897
    .line 1898
    move-object/from16 v7, v30

    .line 1899
    .line 1900
    move-object/from16 v15, v31

    .line 1901
    .line 1902
    move-object/from16 v8, v33

    .line 1903
    .line 1904
    const/4 v2, 0x0

    .line 1905
    goto/16 :goto_0

    .line 1906
    .line 1907
    :cond_59
    if-eqz v19, :cond_5a

    .line 1908
    .line 1909
    return-object v19

    .line 1910
    :cond_5a
    const/4 v1, 0x0

    .line 1911
    throw v1
    :try_end_1a
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1a .. :try_end_1a} :catch_1
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_0

    .line 1912
    :goto_34
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1913
    .line 1914
    const-string v2, "Unexpected error when reading input."

    .line 1915
    .line 1916
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1917
    .line 1918
    .line 1919
    throw v1

    .line 1920
    :goto_35
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 1921
    .line 1922
    const-string v2, "Unable to decode source"

    .line 1923
    .line 1924
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1925
    .line 1926
    .line 1927
    throw v1

    .line 1928
    nop

    .line 1929
    :sswitch_data_0
    .sparse-switch
        -0x37b7d90c -> :sswitch_5
        0x18601 -> :sswitch_4
        0x188db -> :sswitch_3
        0x59478a9 -> :sswitch_2
        0x68b1db1 -> :sswitch_1
        0x4d0b70cd -> :sswitch_0
    .end sparse-switch
.end method
