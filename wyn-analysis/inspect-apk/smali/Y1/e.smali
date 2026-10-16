.class public final LY1/e;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "SourceFile"

# interfaces
.implements Lo2/o;


# static fields
.field public static final b:Ljava/util/regex/Pattern;

.field public static final c:Ljava/util/regex/Pattern;

.field public static final d:Ljava/util/regex/Pattern;

.field public static final e:[I


# instance fields
.field public final a:Lorg/xmlpull/v1/XmlPullParserFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "(\\d+)(?:/(\\d+))?"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LY1/e;->b:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "CC([1-4])=.*"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LY1/e;->c:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "([1-9]|[1-5][0-9]|6[0-3])=.*"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, LY1/e;->d:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    const/16 v0, 0x15

    .line 26
    .line 27
    new-array v0, v0, [I

    .line 28
    .line 29
    fill-array-data v0, :array_0

    .line 30
    .line 31
    .line 32
    sput-object v0, LY1/e;->e:[I

    .line 33
    .line 34
    return-void

    .line 35
    :array_0
    .array-data 4
        -0x1
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x8
        0x2
        0x3
        0x4
        0x7
        0x8
        0x18
        0x8
        0xc
        0xa
        0xc
        0xe
        0xc
        0xe
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

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
    iput-object v0, p0, LY1/e;->a:Lorg/xmlpull/v1/XmlPullParserFactory;
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    return-void

    .line 11
    :catch_0
    move-exception v0

    .line 12
    new-instance v1, Ljava/lang/RuntimeException;

    .line 13
    .line 14
    const-string v2, "Couldn\'t create XmlPullParserFactory instance"

    .line 15
    .line 16
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    throw v1
.end method

.method public static a(Ljava/util/ArrayList;JJIJ)J
    .locals 2

    .line 1
    if-ltz p5, :cond_0

    .line 2
    .line 3
    add-int/lit8 p5, p5, 0x1

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sub-long/2addr p6, p1

    .line 7
    sget p5, LQ1/x;->a:I

    .line 8
    .line 9
    add-long/2addr p6, p3

    .line 10
    const-wide/16 v0, 0x1

    .line 11
    .line 12
    sub-long/2addr p6, v0

    .line 13
    div-long/2addr p6, p3

    .line 14
    long-to-int p5, p6

    .line 15
    :goto_0
    const/4 p6, 0x0

    .line 16
    :goto_1
    if-ge p6, p5, :cond_1

    .line 17
    .line 18
    new-instance p7, LY1/q;

    .line 19
    .line 20
    invoke-direct {p7, p1, p2, p3, p4}, LY1/q;-><init>(JJ)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    add-long/2addr p1, p3

    .line 27
    add-int/lit8 p6, p6, 0x1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    return-wide p1
.end method

.method public static b(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 4

    .line 1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_2

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    :cond_0
    :goto_0
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-ne v2, v1, :cond_1

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x3

    .line 28
    if-ne v2, v3, :cond_0

    .line 29
    .line 30
    add-int/lit8 v0, v0, -0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    return-void
.end method

.method public static c(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 12

    .line 1
    const/4 v0, 0x6

    .line 2
    const/4 v1, 0x5

    .line 3
    const/4 v2, 0x4

    .line 4
    const/4 v3, 0x3

    .line 5
    const/4 v4, 0x0

    .line 6
    const/4 v5, 0x2

    .line 7
    const/4 v6, 0x1

    .line 8
    const/4 v7, -0x1

    .line 9
    const/4 v8, 0x0

    .line 10
    const-string v9, "schemeIdUri"

    .line 11
    .line 12
    invoke-interface {p0, v8, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v9

    .line 16
    if-nez v9, :cond_0

    .line 17
    .line 18
    move-object v9, v8

    .line 19
    :cond_0
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const-string v10, "value"

    .line 23
    .line 24
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v11

    .line 28
    sparse-switch v11, :sswitch_data_0

    .line 29
    .line 30
    .line 31
    :goto_0
    move v9, v7

    .line 32
    goto :goto_1

    .line 33
    :sswitch_0
    const-string v11, "urn:dolby:dash:audio_channel_configuration:2011"

    .line 34
    .line 35
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    if-nez v9, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move v9, v0

    .line 43
    goto :goto_1

    .line 44
    :sswitch_1
    const-string v11, "tag:dts.com,2018:uhd:audio_channel_configuration"

    .line 45
    .line 46
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    if-nez v9, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move v9, v1

    .line 54
    goto :goto_1

    .line 55
    :sswitch_2
    const-string v11, "tag:dts.com,2014:dash:audio_channel_configuration:2012"

    .line 56
    .line 57
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-nez v9, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    move v9, v2

    .line 65
    goto :goto_1

    .line 66
    :sswitch_3
    const-string v11, "urn:mpeg:mpegB:cicp:ChannelConfiguration"

    .line 67
    .line 68
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    if-nez v9, :cond_4

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    move v9, v3

    .line 76
    goto :goto_1

    .line 77
    :sswitch_4
    const-string v11, "tag:dolby.com,2014:dash:audio_channel_configuration:2011"

    .line 78
    .line 79
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    if-nez v9, :cond_5

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_5
    move v9, v5

    .line 87
    goto :goto_1

    .line 88
    :sswitch_5
    const-string v11, "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"

    .line 89
    .line 90
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    if-nez v9, :cond_6

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_6
    move v9, v6

    .line 98
    goto :goto_1

    .line 99
    :sswitch_6
    const-string v11, "urn:dts:dash:audio_channel_configuration:2012"

    .line 100
    .line 101
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    if-nez v9, :cond_7

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_7
    move v9, v4

    .line 109
    :goto_1
    packed-switch v9, :pswitch_data_0

    .line 110
    .line 111
    .line 112
    goto/16 :goto_8

    .line 113
    .line 114
    :pswitch_0
    invoke-interface {p0, v8, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    if-nez v0, :cond_8

    .line 119
    .line 120
    goto/16 :goto_8

    .line 121
    .line 122
    :cond_8
    const/16 v1, 0x10

    .line 123
    .line 124
    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_10

    .line 133
    .line 134
    goto/16 :goto_8

    .line 135
    .line 136
    :pswitch_1
    invoke-interface {p0, v8, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-nez v0, :cond_9

    .line 141
    .line 142
    move v0, v7

    .line 143
    goto :goto_2

    .line 144
    :cond_9
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    :goto_2
    if-ltz v0, :cond_13

    .line 149
    .line 150
    sget-object v1, LY1/e;->e:[I

    .line 151
    .line 152
    array-length v2, v1

    .line 153
    if-ge v0, v2, :cond_13

    .line 154
    .line 155
    aget v7, v1, v0

    .line 156
    .line 157
    goto/16 :goto_8

    .line 158
    .line 159
    :pswitch_2
    invoke-interface {p0, v8, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    if-nez v8, :cond_a

    .line 164
    .line 165
    :goto_3
    move v0, v7

    .line 166
    goto/16 :goto_6

    .line 167
    .line 168
    :cond_a
    invoke-static {v8}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 176
    .line 177
    .line 178
    move-result v9

    .line 179
    sparse-switch v9, :sswitch_data_1

    .line 180
    .line 181
    .line 182
    :goto_4
    move v2, v7

    .line 183
    goto :goto_5

    .line 184
    :sswitch_7
    const-string v3, "fa01"

    .line 185
    .line 186
    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-nez v3, :cond_f

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :sswitch_8
    const-string v2, "f801"

    .line 194
    .line 195
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-nez v2, :cond_b

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_b
    move v2, v3

    .line 203
    goto :goto_5

    .line 204
    :sswitch_9
    const-string v2, "f800"

    .line 205
    .line 206
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-nez v2, :cond_c

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_c
    move v2, v5

    .line 214
    goto :goto_5

    .line 215
    :sswitch_a
    const-string v2, "a000"

    .line 216
    .line 217
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    if-nez v2, :cond_d

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_d
    move v2, v6

    .line 225
    goto :goto_5

    .line 226
    :sswitch_b
    const-string v2, "4000"

    .line 227
    .line 228
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    if-nez v2, :cond_e

    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_e
    move v2, v4

    .line 236
    :cond_f
    :goto_5
    packed-switch v2, :pswitch_data_1

    .line 237
    .line 238
    .line 239
    goto :goto_3

    .line 240
    :pswitch_3
    const/16 v0, 0x8

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :pswitch_4
    move v0, v1

    .line 244
    goto :goto_6

    .line 245
    :pswitch_5
    move v0, v5

    .line 246
    goto :goto_6

    .line 247
    :pswitch_6
    move v0, v6

    .line 248
    :cond_10
    :goto_6
    :pswitch_7
    move v7, v0

    .line 249
    goto :goto_8

    .line 250
    :pswitch_8
    invoke-interface {p0, v8, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    if-nez v0, :cond_11

    .line 255
    .line 256
    goto :goto_8

    .line 257
    :cond_11
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    goto :goto_8

    .line 262
    :pswitch_9
    invoke-interface {p0, v8, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    if-nez v0, :cond_12

    .line 267
    .line 268
    move v0, v7

    .line 269
    goto :goto_7

    .line 270
    :cond_12
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    :goto_7
    if-lez v0, :cond_13

    .line 275
    .line 276
    const/16 v1, 0x21

    .line 277
    .line 278
    if-ge v0, v1, :cond_13

    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_13
    :goto_8
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 282
    .line 283
    .line 284
    const-string v0, "AudioChannelConfiguration"

    .line 285
    .line 286
    invoke-static {p0, v0}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    if-eqz v0, :cond_13

    .line 291
    .line 292
    return v7

    .line 293
    :sswitch_data_0
    .sparse-switch
        -0x7ee09c90 -> :sswitch_6
        -0x50a2db6e -> :sswitch_5
        -0x43d6a909 -> :sswitch_4
        -0x3aced4cf -> :sswitch_3
        -0x4b58cf3 -> :sswitch_2
        0x129b7989 -> :sswitch_1
        0x79657164 -> :sswitch_0
    .end sparse-switch

    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_2
        :pswitch_1
        :pswitch_9
        :pswitch_0
        :pswitch_2
    .end packed-switch

    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    :sswitch_data_1
    .sparse-switch
        0x185d7c -> :sswitch_b
        0x2cd22f -> :sswitch_a
        0x2f3612 -> :sswitch_9
        0x2f3613 -> :sswitch_8
        0x2fcffc -> :sswitch_7
    .end sparse-switch

    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_7
        :pswitch_3
    .end packed-switch
.end method

.method public static d(Lorg/xmlpull/v1/XmlPullParser;J)J
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "availabilityTimeOffset"

    .line 3
    .line 4
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-wide p1

    .line 11
    :cond_0
    const-string p1, "INF"

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    const-wide p0, 0x7fffffffffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    return-wide p0

    .line 25
    :cond_1
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    const p1, 0x49742400    # 1000000.0f

    .line 30
    .line 31
    .line 32
    mul-float/2addr p0, p1

    .line 33
    float-to-long p0, p0

    .line 34
    return-wide p0
.end method

.method public static e(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/ArrayList;Z)Ljava/util/ArrayList;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "dvb:priority"

    .line 4
    .line 5
    invoke-interface {p0, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    if-eqz p2, :cond_1

    .line 18
    .line 19
    move v2, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/high16 v2, -0x80000000

    .line 22
    .line 23
    :goto_0
    const-string v4, "dvb:weight"

    .line 24
    .line 25
    invoke-interface {p0, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move v4, v3

    .line 37
    :goto_1
    const-string v5, "serviceLocation"

    .line 38
    .line 39
    invoke-interface {p0, v1, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v5, ""

    .line 44
    .line 45
    :cond_3
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 46
    .line 47
    .line 48
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    const/4 v7, 0x4

    .line 53
    if-ne v6, v7, :cond_4

    .line 54
    .line 55
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    goto :goto_2

    .line 60
    :cond_4
    invoke-static {p0}, LY1/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 61
    .line 62
    .line 63
    :goto_2
    const-string v6, "BaseURL"

    .line 64
    .line 65
    invoke-static {p0, v6}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-eqz v6, :cond_3

    .line 70
    .line 71
    if-eqz v5, :cond_6

    .line 72
    .line 73
    invoke-static {v5}, LQ1/k;->n(Ljava/lang/String;)[I

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    aget p0, p0, v0

    .line 78
    .line 79
    const/4 v6, -0x1

    .line 80
    if-eq p0, v6, :cond_6

    .line 81
    .line 82
    if-nez v1, :cond_5

    .line 83
    .line 84
    move-object v1, v5

    .line 85
    :cond_5
    new-instance p0, LY1/b;

    .line 86
    .line 87
    invoke-direct {p0, v5, v1, v2, v4}, LY1/b;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    .line 88
    .line 89
    .line 90
    new-array p1, v3, [LY1/b;

    .line 91
    .line 92
    aput-object p0, p1, v0

    .line 93
    .line 94
    invoke-static {p1}, Ll8/s;->n([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :cond_6
    new-instance p0, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-ge v0, v6, :cond_9

    .line 109
    .line 110
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    check-cast v6, LY1/b;

    .line 115
    .line 116
    iget-object v7, v6, LY1/b;->a:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v7, v5}, LQ1/k;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    if-nez v1, :cond_7

    .line 123
    .line 124
    move-object v8, v7

    .line 125
    goto :goto_4

    .line 126
    :cond_7
    move-object v8, v1

    .line 127
    :goto_4
    if-eqz p2, :cond_8

    .line 128
    .line 129
    iget v2, v6, LY1/b;->c:I

    .line 130
    .line 131
    iget v4, v6, LY1/b;->d:I

    .line 132
    .line 133
    iget-object v8, v6, LY1/b;->b:Ljava/lang/String;

    .line 134
    .line 135
    :cond_8
    new-instance v6, LY1/b;

    .line 136
    .line 137
    invoke-direct {v6, v7, v8, v2, v4}, LY1/b;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    add-int/2addr v0, v3

    .line 144
    goto :goto_3

    .line 145
    :cond_9
    return-object p0
.end method

.method public static f(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/Pair;
    .locals 15

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const-string v3, "schemeIdUri"

    .line 5
    .line 6
    invoke-interface {p0, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const/4 v4, -0x1

    .line 11
    const/16 v5, 0x3a

    .line 12
    .line 13
    const-string v6, "MpdParser"

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    if-eqz v3, :cond_9

    .line 17
    .line 18
    invoke-static {v3}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    sparse-switch v8, :sswitch_data_0

    .line 30
    .line 31
    .line 32
    :goto_0
    move v3, v4

    .line 33
    goto :goto_1

    .line 34
    :sswitch_0
    const-string v8, "urn:mpeg:dash:mp4protection:2011"

    .line 35
    .line 36
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v3, 0x3

    .line 44
    goto :goto_1

    .line 45
    :sswitch_1
    const-string v8, "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"

    .line 46
    .line 47
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-nez v3, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move v3, v0

    .line 55
    goto :goto_1

    .line 56
    :sswitch_2
    const-string v8, "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"

    .line 57
    .line 58
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-nez v3, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move v3, v1

    .line 66
    goto :goto_1

    .line 67
    :sswitch_3
    const-string v8, "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e"

    .line 68
    .line 69
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-nez v3, :cond_3

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    move v3, v7

    .line 77
    :goto_1
    packed-switch v3, :pswitch_data_0

    .line 78
    .line 79
    .line 80
    goto/16 :goto_9

    .line 81
    .line 82
    :pswitch_0
    const-string v3, "value"

    .line 83
    .line 84
    invoke-interface {p0, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    move v9, v7

    .line 93
    :goto_2
    if-ge v9, v8, :cond_6

    .line 94
    .line 95
    invoke-interface {p0, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    invoke-virtual {v10, v5}, Ljava/lang/String;->indexOf(I)I

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    if-ne v11, v4, :cond_4

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    add-int/2addr v11, v1

    .line 107
    invoke-virtual {v10, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    :goto_3
    const-string v11, "default_KID"

    .line 112
    .line 113
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-eqz v10, :cond_5

    .line 118
    .line 119
    invoke-interface {p0, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    goto :goto_4

    .line 124
    :cond_5
    add-int/2addr v9, v1

    .line 125
    goto :goto_2

    .line 126
    :cond_6
    move-object v8, v2

    .line 127
    :goto_4
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    if-nez v9, :cond_8

    .line 132
    .line 133
    const-string v9, "00000000-0000-0000-0000-000000000000"

    .line 134
    .line 135
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    if-nez v9, :cond_8

    .line 140
    .line 141
    const-string v9, "\\s+"

    .line 142
    .line 143
    invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    array-length v9, v8

    .line 148
    new-array v9, v9, [Ljava/util/UUID;

    .line 149
    .line 150
    move v10, v7

    .line 151
    :goto_5
    array-length v11, v8

    .line 152
    if-ge v10, v11, :cond_7

    .line 153
    .line 154
    aget-object v11, v8, v10

    .line 155
    .line 156
    invoke-static {v11}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 157
    .line 158
    .line 159
    move-result-object v11

    .line 160
    aput-object v11, v9, v10

    .line 161
    .line 162
    add-int/2addr v10, v1

    .line 163
    goto :goto_5

    .line 164
    :cond_7
    sget-object v8, LN1/e;->b:Ljava/util/UUID;

    .line 165
    .line 166
    invoke-static {v8, v9, v2}, LM2/r;->a(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    move-object v10, v2

    .line 171
    goto :goto_a

    .line 172
    :cond_8
    const-string v8, "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute."

    .line 173
    .line 174
    invoke-static {v6, v8}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    move-object v8, v2

    .line 178
    :goto_6
    move-object v9, v8

    .line 179
    :goto_7
    move-object v10, v9

    .line 180
    goto :goto_a

    .line 181
    :pswitch_1
    sget-object v8, LN1/e;->d:Ljava/util/UUID;

    .line 182
    .line 183
    :goto_8
    move-object v3, v2

    .line 184
    move-object v9, v3

    .line 185
    goto :goto_7

    .line 186
    :pswitch_2
    sget-object v8, LN1/e;->e:Ljava/util/UUID;

    .line 187
    .line 188
    goto :goto_8

    .line 189
    :pswitch_3
    sget-object v8, LN1/e;->c:Ljava/util/UUID;

    .line 190
    .line 191
    goto :goto_8

    .line 192
    :cond_9
    :goto_9
    move-object v3, v2

    .line 193
    move-object v8, v3

    .line 194
    goto :goto_6

    .line 195
    :cond_a
    :goto_a
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 196
    .line 197
    .line 198
    const-string v11, "clearkey:Laurl"

    .line 199
    .line 200
    invoke-static {p0, v11}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result v11

    .line 204
    const/4 v12, 0x4

    .line 205
    if-nez v11, :cond_b

    .line 206
    .line 207
    const-string v11, "dashif:Laurl"

    .line 208
    .line 209
    invoke-static {p0, v11}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    if-eqz v11, :cond_c

    .line 214
    .line 215
    :cond_b
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 216
    .line 217
    .line 218
    move-result v11

    .line 219
    if-ne v11, v12, :cond_c

    .line 220
    .line 221
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    goto/16 :goto_d

    .line 226
    .line 227
    :cond_c
    const-string v11, "ms:laurl"

    .line 228
    .line 229
    invoke-static {p0, v11}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    if-eqz v11, :cond_d

    .line 234
    .line 235
    const-string v10, "licenseUrl"

    .line 236
    .line 237
    invoke-interface {p0, v2, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v10

    .line 241
    goto/16 :goto_d

    .line 242
    .line 243
    :cond_d
    if-nez v9, :cond_11

    .line 244
    .line 245
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 246
    .line 247
    .line 248
    move-result v11

    .line 249
    if-ne v11, v0, :cond_11

    .line 250
    .line 251
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v11

    .line 255
    invoke-virtual {v11, v5}, Ljava/lang/String;->indexOf(I)I

    .line 256
    .line 257
    .line 258
    move-result v13

    .line 259
    if-ne v13, v4, :cond_e

    .line 260
    .line 261
    goto :goto_b

    .line 262
    :cond_e
    add-int/2addr v13, v1

    .line 263
    invoke-virtual {v11, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    :goto_b
    const-string v13, "pssh"

    .line 268
    .line 269
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v11

    .line 273
    if-eqz v11, :cond_11

    .line 274
    .line 275
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 276
    .line 277
    .line 278
    move-result v11

    .line 279
    if-ne v11, v12, :cond_11

    .line 280
    .line 281
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    invoke-static {v8, v7}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 286
    .line 287
    .line 288
    move-result-object v8

    .line 289
    invoke-static {v8}, LM2/r;->i([B)LY9/c;

    .line 290
    .line 291
    .line 292
    move-result-object v9

    .line 293
    if-nez v9, :cond_f

    .line 294
    .line 295
    move-object v9, v2

    .line 296
    goto :goto_c

    .line 297
    :cond_f
    iget-object v9, v9, LY9/c;->b:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v9, Ljava/util/UUID;

    .line 300
    .line 301
    :goto_c
    if-nez v9, :cond_10

    .line 302
    .line 303
    const-string v8, "Skipping malformed cenc:pssh data"

    .line 304
    .line 305
    invoke-static {v6, v8}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    move-object v8, v9

    .line 309
    move-object v9, v2

    .line 310
    goto :goto_d

    .line 311
    :cond_10
    move-object v14, v9

    .line 312
    move-object v9, v8

    .line 313
    move-object v8, v14

    .line 314
    goto :goto_d

    .line 315
    :cond_11
    if-nez v9, :cond_12

    .line 316
    .line 317
    sget-object v11, LN1/e;->e:Ljava/util/UUID;

    .line 318
    .line 319
    invoke-virtual {v11, v8}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v13

    .line 323
    if-eqz v13, :cond_12

    .line 324
    .line 325
    const-string v13, "mspr:pro"

    .line 326
    .line 327
    invoke-static {p0, v13}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 328
    .line 329
    .line 330
    move-result v13

    .line 331
    if-eqz v13, :cond_12

    .line 332
    .line 333
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 334
    .line 335
    .line 336
    move-result v13

    .line 337
    if-ne v13, v12, :cond_12

    .line 338
    .line 339
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v9

    .line 343
    invoke-static {v9, v7}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 344
    .line 345
    .line 346
    move-result-object v9

    .line 347
    invoke-static {v11, v2, v9}, LM2/r;->a(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    .line 348
    .line 349
    .line 350
    move-result-object v9

    .line 351
    goto :goto_d

    .line 352
    :cond_12
    invoke-static {p0}, LY1/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 353
    .line 354
    .line 355
    :goto_d
    const-string v11, "ContentProtection"

    .line 356
    .line 357
    invoke-static {p0, v11}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 358
    .line 359
    .line 360
    move-result v11

    .line 361
    if-eqz v11, :cond_a

    .line 362
    .line 363
    if-eqz v8, :cond_13

    .line 364
    .line 365
    new-instance v2, LN1/i;

    .line 366
    .line 367
    const-string p0, "video/mp4"

    .line 368
    .line 369
    invoke-direct {v2, v8, v10, p0, v9}, LN1/i;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 370
    .line 371
    .line 372
    :cond_13
    invoke-static {v3, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 373
    .line 374
    .line 375
    move-result-object p0

    .line 376
    return-object p0

    .line 377
    :sswitch_data_0
    .sparse-switch
        -0x7610741f -> :sswitch_3
        0x1d2c5beb -> :sswitch_2
        0x2d06c692 -> :sswitch_1
        0x6c0c9d2a -> :sswitch_0
    .end sparse-switch

    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static g(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "contentType"

    .line 3
    .line 4
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v0, "audio"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_1
    const-string v0, "video"

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    const/4 p0, 0x2

    .line 34
    return p0

    .line 35
    :cond_2
    const-string v0, "text"

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    const/4 p0, 0x3

    .line 44
    return p0

    .line 45
    :cond_3
    const-string v0, "image"

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_4

    .line 52
    .line 53
    const/4 p0, 0x4

    .line 54
    return p0

    .line 55
    :cond_4
    :goto_0
    const/4 p0, -0x1

    .line 56
    return p0
.end method

.method public static h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LY1/f;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "schemeIdUri"

    .line 3
    .line 4
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const-string v1, ""

    .line 11
    .line 12
    :cond_0
    const-string v2, "value"

    .line 13
    .line 14
    invoke-interface {p0, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    move-object v2, v0

    .line 21
    :cond_1
    const-string v3, "id"

    .line 22
    .line 23
    invoke-interface {p0, v0, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-nez v3, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    move-object v0, v3

    .line 31
    :cond_3
    :goto_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 32
    .line 33
    .line 34
    invoke-static {p0, p1}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    new-instance p0, LY1/f;

    .line 41
    .line 42
    invoke-direct {p0, v1, v2, v0}, LY1/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object p0
.end method

.method public static i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-wide p2

    .line 9
    :cond_0
    sget-object p1, LQ1/x;->i:Ljava/util/regex/Pattern;

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    const-wide v2, 0x40ac200000000000L    # 3600.0

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    if-eqz p2, :cond_8

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    invoke-virtual {p1, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    const/4 p2, 0x3

    .line 41
    invoke-virtual {p1, p2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const-wide/16 v4, 0x0

    .line 46
    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    invoke-static {p2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 50
    .line 51
    .line 52
    move-result-wide p2

    .line 53
    const-wide v6, 0x417e1852c0000000L    # 3.1556908E7

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    mul-double/2addr p2, v6

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move-wide p2, v4

    .line 61
    :goto_0
    const/4 v6, 0x5

    .line 62
    invoke-virtual {p1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    if-eqz v6, :cond_2

    .line 67
    .line 68
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 69
    .line 70
    .line 71
    move-result-wide v6

    .line 72
    const-wide v8, 0x4144103580000000L    # 2629739.0

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    mul-double/2addr v6, v8

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    move-wide v6, v4

    .line 80
    :goto_1
    add-double/2addr p2, v6

    .line 81
    const/4 v6, 0x7

    .line 82
    invoke-virtual {p1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    if-eqz v6, :cond_3

    .line 87
    .line 88
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 89
    .line 90
    .line 91
    move-result-wide v6

    .line 92
    const-wide v8, 0x40f5180000000000L    # 86400.0

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    mul-double/2addr v6, v8

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    move-wide v6, v4

    .line 100
    :goto_2
    add-double/2addr p2, v6

    .line 101
    const/16 v6, 0xa

    .line 102
    .line 103
    invoke-virtual {p1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    if-eqz v6, :cond_4

    .line 108
    .line 109
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 110
    .line 111
    .line 112
    move-result-wide v6

    .line 113
    mul-double/2addr v6, v2

    .line 114
    goto :goto_3

    .line 115
    :cond_4
    move-wide v6, v4

    .line 116
    :goto_3
    add-double/2addr p2, v6

    .line 117
    const/16 v2, 0xc

    .line 118
    .line 119
    invoke-virtual {p1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    if-eqz v2, :cond_5

    .line 124
    .line 125
    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 126
    .line 127
    .line 128
    move-result-wide v2

    .line 129
    const-wide/high16 v6, 0x404e000000000000L    # 60.0

    .line 130
    .line 131
    mul-double/2addr v2, v6

    .line 132
    goto :goto_4

    .line 133
    :cond_5
    move-wide v2, v4

    .line 134
    :goto_4
    add-double/2addr p2, v2

    .line 135
    const/16 v2, 0xe

    .line 136
    .line 137
    invoke-virtual {p1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-eqz p1, :cond_6

    .line 142
    .line 143
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 144
    .line 145
    .line 146
    move-result-wide v4

    .line 147
    :cond_6
    add-double/2addr p2, v4

    .line 148
    mul-double/2addr p2, v0

    .line 149
    double-to-long p1, p2

    .line 150
    if-nez p0, :cond_7

    .line 151
    .line 152
    neg-long p0, p1

    .line 153
    return-wide p0

    .line 154
    :cond_7
    return-wide p1

    .line 155
    :cond_8
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 156
    .line 157
    .line 158
    move-result-wide p0

    .line 159
    mul-double/2addr p0, v2

    .line 160
    mul-double/2addr p0, v0

    .line 161
    double-to-long p0, p0

    .line 162
    return-wide p0
.end method

.method public static j(Lorg/xmlpull/v1/XmlPullParser;F)F
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "frameRate"

    .line 3
    .line 4
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    sget-object v0, LY1/e;->b:Ljava/util/regex/Pattern;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/4 v0, 0x2

    .line 32
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    int-to-float p1, p1

    .line 43
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    int-to-float p0, p0

    .line 48
    div-float/2addr p1, p0

    .line 49
    return p1

    .line 50
    :cond_0
    int-to-float p0, p1

    .line 51
    return p0

    .line 52
    :cond_1
    return p1
.end method

.method public static k(Lorg/xmlpull/v1/XmlPullParser;Landroid/net/Uri;)LY1/c;
    .locals 157

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v12, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    new-array v2, v1, [Ljava/lang/String;

    .line 6
    .line 7
    const-string v3, "profiles"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-interface {v0, v4, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v2, ","

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    :goto_0
    array-length v3, v2

    .line 24
    move v5, v1

    .line 25
    :goto_1
    if-ge v5, v3, :cond_2

    .line 26
    .line 27
    aget-object v6, v2, v5

    .line 28
    .line 29
    const-string v7, "urn:dvb:dash:profile:dvb-dash:"

    .line 30
    .line 31
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    move v2, v12

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    add-int/2addr v5, v12

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move v2, v1

    .line 42
    :goto_2
    const-string v3, "availabilityStartTime"

    .line 43
    .line 44
    invoke-interface {v0, v4, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    if-nez v3, :cond_3

    .line 54
    .line 55
    move-wide/from16 v17, v5

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    invoke-static {v3}, LQ1/x;->N(Ljava/lang/String;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v7

    .line 62
    move-wide/from16 v17, v7

    .line 63
    .line 64
    :goto_3
    const-string v3, "mediaPresentationDuration"

    .line 65
    .line 66
    invoke-static {v0, v3, v5, v6}, LY1/e;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 67
    .line 68
    .line 69
    move-result-wide v19

    .line 70
    const-string v3, "minBufferTime"

    .line 71
    .line 72
    invoke-static {v0, v3, v5, v6}, LY1/e;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 73
    .line 74
    .line 75
    move-result-wide v21

    .line 76
    const-string v3, "type"

    .line 77
    .line 78
    invoke-interface {v0, v4, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    const-string v7, "dynamic"

    .line 83
    .line 84
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v23

    .line 88
    if-eqz v23, :cond_4

    .line 89
    .line 90
    const-string v3, "minimumUpdatePeriod"

    .line 91
    .line 92
    invoke-static {v0, v3, v5, v6}, LY1/e;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 93
    .line 94
    .line 95
    move-result-wide v7

    .line 96
    move-wide/from16 v24, v7

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_4
    move-wide/from16 v24, v5

    .line 100
    .line 101
    :goto_4
    if-eqz v23, :cond_5

    .line 102
    .line 103
    const-string v3, "timeShiftBufferDepth"

    .line 104
    .line 105
    invoke-static {v0, v3, v5, v6}, LY1/e;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 106
    .line 107
    .line 108
    move-result-wide v7

    .line 109
    move-wide v10, v7

    .line 110
    goto :goto_5

    .line 111
    :cond_5
    move-wide v10, v5

    .line 112
    :goto_5
    if-eqz v23, :cond_6

    .line 113
    .line 114
    const-string v3, "suggestedPresentationDelay"

    .line 115
    .line 116
    invoke-static {v0, v3, v5, v6}, LY1/e;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 117
    .line 118
    .line 119
    move-result-wide v7

    .line 120
    move-wide/from16 v28, v7

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_6
    move-wide/from16 v28, v5

    .line 124
    .line 125
    :goto_6
    const-string v3, "publishTime"

    .line 126
    .line 127
    invoke-interface {v0, v4, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    if-nez v3, :cond_7

    .line 132
    .line 133
    move-wide/from16 v30, v5

    .line 134
    .line 135
    goto :goto_7

    .line 136
    :cond_7
    invoke-static {v3}, LQ1/x;->N(Ljava/lang/String;)J

    .line 137
    .line 138
    .line 139
    move-result-wide v7

    .line 140
    move-wide/from16 v30, v7

    .line 141
    .line 142
    :goto_7
    const-wide/16 v26, 0x0

    .line 143
    .line 144
    if-eqz v23, :cond_8

    .line 145
    .line 146
    move-wide/from16 v7, v26

    .line 147
    .line 148
    goto :goto_8

    .line 149
    :cond_8
    move-wide v7, v5

    .line 150
    :goto_8
    new-instance v3, LY1/b;

    .line 151
    .line 152
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v14

    .line 160
    if-eqz v2, :cond_9

    .line 161
    .line 162
    move v13, v12

    .line 163
    goto :goto_9

    .line 164
    :cond_9
    const/high16 v32, -0x80000000

    .line 165
    .line 166
    move/from16 v13, v32

    .line 167
    .line 168
    :goto_9
    invoke-direct {v3, v9, v14, v13, v12}, LY1/b;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    .line 169
    .line 170
    .line 171
    new-array v9, v12, [LY1/b;

    .line 172
    .line 173
    aput-object v3, v9, v1

    .line 174
    .line 175
    invoke-static {v9}, Ll8/s;->n([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 176
    .line 177
    .line 178
    move-result-object v13

    .line 179
    new-instance v14, Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 182
    .line 183
    .line 184
    new-instance v3, Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 187
    .line 188
    .line 189
    if-eqz v23, :cond_a

    .line 190
    .line 191
    move-wide/from16 v34, v5

    .line 192
    .line 193
    goto :goto_a

    .line 194
    :cond_a
    move-wide/from16 v34, v26

    .line 195
    .line 196
    :goto_a
    move-wide/from16 v36, v34

    .line 197
    .line 198
    move-wide/from16 v34, v5

    .line 199
    .line 200
    move-wide/from16 v5, v36

    .line 201
    .line 202
    move/from16 v32, v1

    .line 203
    .line 204
    move/from16 v36, v32

    .line 205
    .line 206
    move-object/from16 v37, v4

    .line 207
    .line 208
    move-object/from16 v38, v37

    .line 209
    .line 210
    move-object/from16 v39, v38

    .line 211
    .line 212
    move-object/from16 v40, v39

    .line 213
    .line 214
    :goto_b
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 215
    .line 216
    .line 217
    const-string v9, "BaseURL"

    .line 218
    .line 219
    invoke-static {v0, v9}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 220
    .line 221
    .line 222
    move-result v41

    .line 223
    if-eqz v41, :cond_c

    .line 224
    .line 225
    if-nez v32, :cond_b

    .line 226
    .line 227
    invoke-static {v0, v7, v8}, LY1/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 228
    .line 229
    .line 230
    move-result-wide v7

    .line 231
    move/from16 v32, v12

    .line 232
    .line 233
    :cond_b
    invoke-static {v0, v13, v2}, LY1/e;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/ArrayList;Z)Ljava/util/ArrayList;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 238
    .line 239
    .line 240
    move/from16 v42, v1

    .line 241
    .line 242
    move/from16 v91, v2

    .line 243
    .line 244
    move-object/from16 v51, v3

    .line 245
    .line 246
    move/from16 v41, v12

    .line 247
    .line 248
    move-object/from16 v44, v13

    .line 249
    .line 250
    move-object v9, v14

    .line 251
    const/16 v16, 0x4

    .line 252
    .line 253
    const/16 v33, 0x2

    .line 254
    .line 255
    :goto_c
    const/16 v43, -0x1

    .line 256
    .line 257
    move-wide v11, v10

    .line 258
    goto/16 :goto_98

    .line 259
    .line 260
    :cond_c
    const-string v12, "ProgramInformation"

    .line 261
    .line 262
    invoke-static {v0, v12}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 263
    .line 264
    .line 265
    move-result v42

    .line 266
    const-string v15, "lang"

    .line 267
    .line 268
    if-eqz v42, :cond_13

    .line 269
    .line 270
    const-string v9, "moreInformationURL"

    .line 271
    .line 272
    invoke-interface {v0, v4, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v9

    .line 276
    if-nez v9, :cond_d

    .line 277
    .line 278
    move-object/from16 v48, v4

    .line 279
    .line 280
    goto :goto_d

    .line 281
    :cond_d
    move-object/from16 v48, v9

    .line 282
    .line 283
    :goto_d
    invoke-interface {v0, v4, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v9

    .line 287
    if-nez v9, :cond_e

    .line 288
    .line 289
    move-object/from16 v49, v4

    .line 290
    .line 291
    goto :goto_e

    .line 292
    :cond_e
    move-object/from16 v49, v9

    .line 293
    .line 294
    :goto_e
    move-object v9, v4

    .line 295
    move-object v15, v9

    .line 296
    move-object/from16 v37, v15

    .line 297
    .line 298
    :goto_f
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 299
    .line 300
    .line 301
    const-string v1, "Title"

    .line 302
    .line 303
    invoke-static {v0, v1}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    if-eqz v1, :cond_f

    .line 308
    .line 309
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v9

    .line 313
    :goto_10
    move-object/from16 v45, v9

    .line 314
    .line 315
    move-object/from16 v46, v15

    .line 316
    .line 317
    move-object/from16 v47, v37

    .line 318
    .line 319
    goto :goto_11

    .line 320
    :cond_f
    const-string v1, "Source"

    .line 321
    .line 322
    invoke-static {v0, v1}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    if-eqz v1, :cond_10

    .line 327
    .line 328
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v15

    .line 332
    goto :goto_10

    .line 333
    :cond_10
    const-string v1, "Copyright"

    .line 334
    .line 335
    invoke-static {v0, v1}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    if-eqz v1, :cond_11

    .line 340
    .line 341
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v37

    .line 345
    goto :goto_10

    .line 346
    :cond_11
    invoke-static {v0}, LY1/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 347
    .line 348
    .line 349
    goto :goto_10

    .line 350
    :goto_11
    invoke-static {v0, v12}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-eqz v1, :cond_12

    .line 355
    .line 356
    new-instance v44, LY1/i;

    .line 357
    .line 358
    invoke-direct/range {v44 .. v49}, LY1/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    move/from16 v91, v2

    .line 362
    .line 363
    move-object/from16 v51, v3

    .line 364
    .line 365
    move-wide v11, v10

    .line 366
    move-object v9, v14

    .line 367
    move-object/from16 v37, v44

    .line 368
    .line 369
    const/16 v16, 0x4

    .line 370
    .line 371
    const/16 v33, 0x2

    .line 372
    .line 373
    const/16 v41, 0x1

    .line 374
    .line 375
    const/16 v42, 0x0

    .line 376
    .line 377
    const/16 v43, -0x1

    .line 378
    .line 379
    move-object/from16 v44, v13

    .line 380
    .line 381
    goto/16 :goto_98

    .line 382
    .line 383
    :cond_12
    move-object/from16 v9, v45

    .line 384
    .line 385
    move-object/from16 v15, v46

    .line 386
    .line 387
    move-object/from16 v37, v47

    .line 388
    .line 389
    const/4 v1, 0x0

    .line 390
    goto :goto_f

    .line 391
    :cond_13
    const-string v1, "UTCTiming"

    .line 392
    .line 393
    invoke-static {v0, v1}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    const-string v12, "value"

    .line 398
    .line 399
    move-object/from16 v44, v13

    .line 400
    .line 401
    const-string v13, "schemeIdUri"

    .line 402
    .line 403
    if-eqz v1, :cond_14

    .line 404
    .line 405
    invoke-interface {v0, v4, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    invoke-interface {v0, v4, v12}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v9

    .line 413
    new-instance v12, LY1/t;

    .line 414
    .line 415
    const/4 v13, 0x0

    .line 416
    invoke-direct {v12, v13, v1, v9}, LY1/t;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    move/from16 v91, v2

    .line 420
    .line 421
    move-object/from16 v51, v3

    .line 422
    .line 423
    move-object/from16 v38, v12

    .line 424
    .line 425
    move/from16 v42, v13

    .line 426
    .line 427
    move-object v9, v14

    .line 428
    const/16 v16, 0x4

    .line 429
    .line 430
    const/16 v33, 0x2

    .line 431
    .line 432
    const/16 v41, 0x1

    .line 433
    .line 434
    goto/16 :goto_c

    .line 435
    .line 436
    :cond_14
    const/16 v42, 0x0

    .line 437
    .line 438
    const-string v1, "Location"

    .line 439
    .line 440
    invoke-static {v0, v1}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    if-eqz v1, :cond_15

    .line 445
    .line 446
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v9

    .line 454
    invoke-static {v1, v9}, LQ1/k;->u(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 455
    .line 456
    .line 457
    move-result-object v39

    .line 458
    move/from16 v91, v2

    .line 459
    .line 460
    move-object/from16 v51, v3

    .line 461
    .line 462
    move-wide v11, v10

    .line 463
    move-object v9, v14

    .line 464
    :goto_12
    const/16 v16, 0x4

    .line 465
    .line 466
    const/16 v33, 0x2

    .line 467
    .line 468
    const/16 v41, 0x1

    .line 469
    .line 470
    const/16 v43, -0x1

    .line 471
    .line 472
    goto/16 :goto_98

    .line 473
    .line 474
    :cond_15
    const-string v1, "ServiceDescription"

    .line 475
    .line 476
    invoke-static {v0, v1}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 477
    .line 478
    .line 479
    move-result v45

    .line 480
    if-eqz v45, :cond_1e

    .line 481
    .line 482
    const v45, -0x800001

    .line 483
    .line 484
    .line 485
    move-wide/from16 v12, v34

    .line 486
    .line 487
    move-wide/from16 v46, v12

    .line 488
    .line 489
    move-wide/from16 v48, v46

    .line 490
    .line 491
    move/from16 v9, v45

    .line 492
    .line 493
    move v15, v9

    .line 494
    :goto_13
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 495
    .line 496
    .line 497
    const-string v4, "Latency"

    .line 498
    .line 499
    invoke-static {v0, v4}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 500
    .line 501
    .line 502
    move-result v4

    .line 503
    move-object/from16 v51, v3

    .line 504
    .line 505
    const-string v3, "max"

    .line 506
    .line 507
    move/from16 v40, v4

    .line 508
    .line 509
    const-string v4, "min"

    .line 510
    .line 511
    if-eqz v40, :cond_19

    .line 512
    .line 513
    const-string v12, "target"

    .line 514
    .line 515
    const/4 v13, 0x0

    .line 516
    invoke-interface {v0, v13, v12}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v12

    .line 520
    if-nez v12, :cond_16

    .line 521
    .line 522
    move-wide/from16 v46, v34

    .line 523
    .line 524
    goto :goto_14

    .line 525
    :cond_16
    invoke-static {v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 526
    .line 527
    .line 528
    move-result-wide v46

    .line 529
    :goto_14
    invoke-interface {v0, v13, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v4

    .line 533
    if-nez v4, :cond_17

    .line 534
    .line 535
    move-wide/from16 v48, v34

    .line 536
    .line 537
    goto :goto_15

    .line 538
    :cond_17
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 539
    .line 540
    .line 541
    move-result-wide v48

    .line 542
    :goto_15
    invoke-interface {v0, v13, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v3

    .line 546
    if-nez v3, :cond_18

    .line 547
    .line 548
    move-wide/from16 v3, v34

    .line 549
    .line 550
    goto :goto_16

    .line 551
    :cond_18
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 552
    .line 553
    .line 554
    move-result-wide v3

    .line 555
    :goto_16
    move-wide/from16 v52, v7

    .line 556
    .line 557
    move-wide/from16 v12, v46

    .line 558
    .line 559
    move-wide v7, v3

    .line 560
    move-wide/from16 v3, v48

    .line 561
    .line 562
    goto :goto_19

    .line 563
    :cond_19
    move-wide/from16 v52, v7

    .line 564
    .line 565
    const/4 v7, 0x0

    .line 566
    const-string v8, "PlaybackRate"

    .line 567
    .line 568
    invoke-static {v0, v8}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 569
    .line 570
    .line 571
    move-result v8

    .line 572
    if-eqz v8, :cond_1c

    .line 573
    .line 574
    invoke-interface {v0, v7, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v4

    .line 578
    if-nez v4, :cond_1a

    .line 579
    .line 580
    move/from16 v9, v45

    .line 581
    .line 582
    goto :goto_17

    .line 583
    :cond_1a
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 584
    .line 585
    .line 586
    move-result v4

    .line 587
    move v9, v4

    .line 588
    :goto_17
    invoke-interface {v0, v7, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v3

    .line 592
    if-nez v3, :cond_1b

    .line 593
    .line 594
    move/from16 v15, v45

    .line 595
    .line 596
    goto :goto_18

    .line 597
    :cond_1b
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 598
    .line 599
    .line 600
    move-result v3

    .line 601
    move v15, v3

    .line 602
    :cond_1c
    :goto_18
    move-wide/from16 v3, v46

    .line 603
    .line 604
    move-wide/from16 v7, v48

    .line 605
    .line 606
    :goto_19
    invoke-static {v0, v1}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 607
    .line 608
    .line 609
    move-result v40

    .line 610
    if-eqz v40, :cond_1d

    .line 611
    .line 612
    new-instance v1, LE5/Y;

    .line 613
    .line 614
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 615
    .line 616
    .line 617
    iput-wide v12, v1, LE5/Y;->a:J

    .line 618
    .line 619
    iput-wide v3, v1, LE5/Y;->b:J

    .line 620
    .line 621
    iput-wide v7, v1, LE5/Y;->c:J

    .line 622
    .line 623
    iput v9, v1, LE5/Y;->d:F

    .line 624
    .line 625
    iput v15, v1, LE5/Y;->e:F

    .line 626
    .line 627
    move-object/from16 v40, v1

    .line 628
    .line 629
    move/from16 v91, v2

    .line 630
    .line 631
    move-wide v11, v10

    .line 632
    move-object v9, v14

    .line 633
    move-wide/from16 v7, v52

    .line 634
    .line 635
    goto/16 :goto_12

    .line 636
    .line 637
    :cond_1d
    move-wide/from16 v46, v3

    .line 638
    .line 639
    move-wide/from16 v48, v7

    .line 640
    .line 641
    move-object/from16 v3, v51

    .line 642
    .line 643
    move-wide/from16 v7, v52

    .line 644
    .line 645
    const/4 v4, 0x0

    .line 646
    goto/16 :goto_13

    .line 647
    .line 648
    :cond_1e
    move-object/from16 v51, v3

    .line 649
    .line 650
    move-wide/from16 v52, v7

    .line 651
    .line 652
    const-string v1, "Period"

    .line 653
    .line 654
    invoke-static {v0, v1}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 655
    .line 656
    .line 657
    move-result v3

    .line 658
    if-eqz v3, :cond_b5

    .line 659
    .line 660
    if-nez v36, :cond_b5

    .line 661
    .line 662
    invoke-virtual/range {v51 .. v51}, Ljava/util/ArrayList;->isEmpty()Z

    .line 663
    .line 664
    .line 665
    move-result v3

    .line 666
    if-nez v3, :cond_1f

    .line 667
    .line 668
    move-object/from16 v3, v51

    .line 669
    .line 670
    goto :goto_1a

    .line 671
    :cond_1f
    move-object/from16 v3, v44

    .line 672
    .line 673
    :goto_1a
    const-string v4, "id"

    .line 674
    .line 675
    const/4 v7, 0x0

    .line 676
    invoke-interface {v0, v7, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v46

    .line 680
    const-string v7, "start"

    .line 681
    .line 682
    invoke-static {v0, v7, v5, v6}, LY1/e;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 683
    .line 684
    .line 685
    move-result-wide v47

    .line 686
    cmp-long v7, v17, v34

    .line 687
    .line 688
    if-eqz v7, :cond_20

    .line 689
    .line 690
    add-long v7, v17, v47

    .line 691
    .line 692
    :goto_1b
    move-object/from16 v54, v14

    .line 693
    .line 694
    goto :goto_1c

    .line 695
    :cond_20
    move-wide/from16 v7, v34

    .line 696
    .line 697
    goto :goto_1b

    .line 698
    :goto_1c
    const-string v14, "duration"

    .line 699
    .line 700
    move-wide/from16 v55, v5

    .line 701
    .line 702
    move-wide/from16 v5, v34

    .line 703
    .line 704
    invoke-static {v0, v14, v5, v6}, LY1/e;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    .line 705
    .line 706
    .line 707
    move-result-wide v34

    .line 708
    move-object/from16 v45, v14

    .line 709
    .line 710
    new-instance v14, Ljava/util/ArrayList;

    .line 711
    .line 712
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 713
    .line 714
    .line 715
    move-object/from16 v49, v13

    .line 716
    .line 717
    new-instance v13, Ljava/util/ArrayList;

    .line 718
    .line 719
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 720
    .line 721
    .line 722
    move-object/from16 v57, v13

    .line 723
    .line 724
    new-instance v13, Ljava/util/ArrayList;

    .line 725
    .line 726
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 727
    .line 728
    .line 729
    move-wide/from16 v62, v5

    .line 730
    .line 731
    move/from16 v58, v42

    .line 732
    .line 733
    move-wide/from16 v5, v52

    .line 734
    .line 735
    const/16 v59, 0x0

    .line 736
    .line 737
    :goto_1d
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 738
    .line 739
    .line 740
    invoke-static {v0, v9}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 741
    .line 742
    .line 743
    move-result v64

    .line 744
    if-eqz v64, :cond_22

    .line 745
    .line 746
    if-nez v58, :cond_21

    .line 747
    .line 748
    invoke-static {v0, v5, v6}, LY1/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 749
    .line 750
    .line 751
    move-result-wide v5

    .line 752
    const/16 v58, 0x1

    .line 753
    .line 754
    :cond_21
    move-object/from16 v64, v1

    .line 755
    .line 756
    invoke-static {v0, v3, v2}, LY1/e;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/ArrayList;Z)Ljava/util/ArrayList;

    .line 757
    .line 758
    .line 759
    move-result-object v1

    .line 760
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 761
    .line 762
    .line 763
    move/from16 v91, v2

    .line 764
    .line 765
    move-object/from16 v73, v3

    .line 766
    .line 767
    move-object/from16 v112, v4

    .line 768
    .line 769
    move-wide v3, v7

    .line 770
    move-object/from16 v130, v9

    .line 771
    .line 772
    move-object/from16 v70, v12

    .line 773
    .line 774
    move-object/from16 v67, v13

    .line 775
    .line 776
    move-object/from16 v69, v14

    .line 777
    .line 778
    move-object/from16 v107, v15

    .line 779
    .line 780
    move-object/from16 v13, v49

    .line 781
    .line 782
    move-object/from16 v50, v57

    .line 783
    .line 784
    move-object/from16 v1, v64

    .line 785
    .line 786
    const/16 v16, 0x4

    .line 787
    .line 788
    const/16 v33, 0x2

    .line 789
    .line 790
    const/16 v41, 0x1

    .line 791
    .line 792
    const/16 v43, -0x1

    .line 793
    .line 794
    move-wide v7, v5

    .line 795
    move-wide v11, v10

    .line 796
    move-wide/from16 v5, v34

    .line 797
    .line 798
    move-object/from16 v49, v45

    .line 799
    .line 800
    :goto_1e
    const-wide v34, -0x7fffffffffffffffL    # -4.9E-324

    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    goto/16 :goto_94

    .line 806
    .line 807
    :cond_22
    move-object/from16 v64, v1

    .line 808
    .line 809
    const-string v1, "AdaptationSet"

    .line 810
    .line 811
    invoke-static {v0, v1}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 812
    .line 813
    .line 814
    move-result v65

    .line 815
    const-string v66, ""

    .line 816
    .line 817
    move-object/from16 v67, v13

    .line 818
    .line 819
    const-string v13, "SegmentBase"

    .line 820
    .line 821
    move-object/from16 v69, v14

    .line 822
    .line 823
    const-string v14, "SegmentList"

    .line 824
    .line 825
    move-object/from16 v70, v12

    .line 826
    .line 827
    const-string v12, "SegmentTemplate"

    .line 828
    .line 829
    if-eqz v65, :cond_9d

    .line 830
    .line 831
    invoke-virtual/range {v67 .. v67}, Ljava/util/ArrayList;->isEmpty()Z

    .line 832
    .line 833
    .line 834
    move-result v65

    .line 835
    move-object/from16 v71, v12

    .line 836
    .line 837
    if-nez v65, :cond_23

    .line 838
    .line 839
    move-object/from16 v12, v67

    .line 840
    .line 841
    :goto_1f
    move-object/from16 v65, v1

    .line 842
    .line 843
    const/4 v1, 0x0

    .line 844
    goto :goto_20

    .line 845
    :cond_23
    move-object v12, v3

    .line 846
    goto :goto_1f

    .line 847
    :goto_20
    invoke-interface {v0, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v50

    .line 851
    if-nez v50, :cond_24

    .line 852
    .line 853
    const-wide/16 v72, -0x1

    .line 854
    .line 855
    :goto_21
    move-wide/from16 v75, v72

    .line 856
    .line 857
    goto :goto_22

    .line 858
    :cond_24
    invoke-static/range {v50 .. v50}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 859
    .line 860
    .line 861
    move-result-wide v72

    .line 862
    goto :goto_21

    .line 863
    :goto_22
    invoke-static {v0}, LY1/e;->g(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 864
    .line 865
    .line 866
    move-result v72

    .line 867
    move-object/from16 v73, v3

    .line 868
    .line 869
    const-string v3, "mimeType"

    .line 870
    .line 871
    invoke-interface {v0, v1, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object v74

    .line 875
    move-wide/from16 v77, v5

    .line 876
    .line 877
    const-string v5, "codecs"

    .line 878
    .line 879
    invoke-interface {v0, v1, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 880
    .line 881
    .line 882
    move-result-object v79

    .line 883
    const-string v6, "width"

    .line 884
    .line 885
    invoke-interface {v0, v1, v6}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 886
    .line 887
    .line 888
    move-result-object v50

    .line 889
    if-nez v50, :cond_25

    .line 890
    .line 891
    const/16 v80, -0x1

    .line 892
    .line 893
    :goto_23
    move-wide/from16 v81, v7

    .line 894
    .line 895
    goto :goto_24

    .line 896
    :cond_25
    invoke-static/range {v50 .. v50}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 897
    .line 898
    .line 899
    move-result v50

    .line 900
    move/from16 v80, v50

    .line 901
    .line 902
    goto :goto_23

    .line 903
    :goto_24
    const-string v7, "height"

    .line 904
    .line 905
    invoke-interface {v0, v1, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 906
    .line 907
    .line 908
    move-result-object v8

    .line 909
    if-nez v8, :cond_26

    .line 910
    .line 911
    const/16 v83, -0x1

    .line 912
    .line 913
    goto :goto_25

    .line 914
    :cond_26
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 915
    .line 916
    .line 917
    move-result v8

    .line 918
    move/from16 v83, v8

    .line 919
    .line 920
    :goto_25
    const/high16 v8, -0x40800000    # -1.0f

    .line 921
    .line 922
    invoke-static {v0, v8}, LY1/e;->j(Lorg/xmlpull/v1/XmlPullParser;F)F

    .line 923
    .line 924
    .line 925
    move-result v8

    .line 926
    move-wide/from16 v84, v10

    .line 927
    .line 928
    const-string v10, "audioSamplingRate"

    .line 929
    .line 930
    invoke-interface {v0, v1, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 931
    .line 932
    .line 933
    move-result-object v11

    .line 934
    if-nez v11, :cond_27

    .line 935
    .line 936
    const/16 v86, -0x1

    .line 937
    .line 938
    goto :goto_26

    .line 939
    :cond_27
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 940
    .line 941
    .line 942
    move-result v11

    .line 943
    move/from16 v86, v11

    .line 944
    .line 945
    :goto_26
    invoke-interface {v0, v1, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v11

    .line 949
    move-object/from16 v87, v11

    .line 950
    .line 951
    const-string v11, "label"

    .line 952
    .line 953
    invoke-interface {v0, v1, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 954
    .line 955
    .line 956
    move-result-object v11

    .line 957
    new-instance v1, Ljava/util/ArrayList;

    .line 958
    .line 959
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 960
    .line 961
    .line 962
    move-object/from16 v88, v1

    .line 963
    .line 964
    new-instance v1, Ljava/util/ArrayList;

    .line 965
    .line 966
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 967
    .line 968
    .line 969
    move-object/from16 v89, v11

    .line 970
    .line 971
    new-instance v11, Ljava/util/ArrayList;

    .line 972
    .line 973
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 974
    .line 975
    .line 976
    move-object/from16 v90, v11

    .line 977
    .line 978
    new-instance v11, Ljava/util/ArrayList;

    .line 979
    .line 980
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 981
    .line 982
    .line 983
    move-object/from16 v91, v14

    .line 984
    .line 985
    new-instance v14, Ljava/util/ArrayList;

    .line 986
    .line 987
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 988
    .line 989
    .line 990
    move-object/from16 v92, v13

    .line 991
    .line 992
    new-instance v13, Ljava/util/ArrayList;

    .line 993
    .line 994
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 995
    .line 996
    .line 997
    move-object/from16 v93, v10

    .line 998
    .line 999
    new-instance v10, Ljava/util/ArrayList;

    .line 1000
    .line 1001
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1002
    .line 1003
    .line 1004
    move/from16 v94, v8

    .line 1005
    .line 1006
    new-instance v8, Ljava/util/ArrayList;

    .line 1007
    .line 1008
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1009
    .line 1010
    .line 1011
    move-object/from16 v95, v8

    .line 1012
    .line 1013
    new-instance v8, Ljava/util/ArrayList;

    .line 1014
    .line 1015
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1016
    .line 1017
    .line 1018
    move-object/from16 v99, v3

    .line 1019
    .line 1020
    move-object/from16 v98, v4

    .line 1021
    .line 1022
    move-object/from16 v97, v6

    .line 1023
    .line 1024
    move-object/from16 v96, v7

    .line 1025
    .line 1026
    move-object/from16 v100, v59

    .line 1027
    .line 1028
    move-wide/from16 v101, v62

    .line 1029
    .line 1030
    move/from16 v6, v72

    .line 1031
    .line 1032
    move-wide/from16 v3, v77

    .line 1033
    .line 1034
    move-object/from16 v7, v87

    .line 1035
    .line 1036
    const/16 v87, 0x0

    .line 1037
    .line 1038
    const/16 v103, -0x1

    .line 1039
    .line 1040
    move/from16 v72, v42

    .line 1041
    .line 1042
    :goto_27
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 1043
    .line 1044
    .line 1045
    invoke-static {v0, v9}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1046
    .line 1047
    .line 1048
    move-result v104

    .line 1049
    if-eqz v104, :cond_29

    .line 1050
    .line 1051
    if-nez v72, :cond_28

    .line 1052
    .line 1053
    invoke-static {v0, v3, v4}, LY1/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 1054
    .line 1055
    .line 1056
    move-result-wide v3

    .line 1057
    const/16 v72, 0x1

    .line 1058
    .line 1059
    :cond_28
    move-wide/from16 v104, v3

    .line 1060
    .line 1061
    invoke-static {v0, v12, v2}, LY1/e;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/ArrayList;Z)Ljava/util/ArrayList;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v3

    .line 1065
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1066
    .line 1067
    .line 1068
    move-object/from16 v139, v1

    .line 1069
    .line 1070
    move-object/from16 v50, v5

    .line 1071
    .line 1072
    move-object/from16 v131, v8

    .line 1073
    .line 1074
    move-object/from16 v130, v9

    .line 1075
    .line 1076
    move-object/from16 v129, v13

    .line 1077
    .line 1078
    move-object/from16 v108, v14

    .line 1079
    .line 1080
    move-object v8, v15

    .line 1081
    move-wide/from16 v143, v34

    .line 1082
    .line 1083
    move-object/from16 v1, v65

    .line 1084
    .line 1085
    move-object/from16 v141, v70

    .line 1086
    .line 1087
    move-object/from16 v14, v71

    .line 1088
    .line 1089
    move-wide/from16 v60, v77

    .line 1090
    .line 1091
    move-wide/from16 v3, v81

    .line 1092
    .line 1093
    move-wide/from16 v34, v84

    .line 1094
    .line 1095
    move-object/from16 v137, v89

    .line 1096
    .line 1097
    move-object/from16 v13, v91

    .line 1098
    .line 1099
    move-object/from16 v15, v92

    .line 1100
    .line 1101
    move-object/from16 v77, v93

    .line 1102
    .line 1103
    move/from16 v118, v94

    .line 1104
    .line 1105
    move-object/from16 v93, v96

    .line 1106
    .line 1107
    move-object/from16 v96, v97

    .line 1108
    .line 1109
    move-object/from16 v112, v98

    .line 1110
    .line 1111
    move-object/from16 v97, v99

    .line 1112
    .line 1113
    move-wide/from16 v105, v104

    .line 1114
    .line 1115
    move/from16 v91, v2

    .line 1116
    .line 1117
    move-object/from16 v85, v7

    .line 1118
    .line 1119
    move-object/from16 v81, v10

    .line 1120
    .line 1121
    move-object/from16 v78, v11

    .line 1122
    .line 1123
    move-object/from16 v104, v12

    .line 1124
    .line 1125
    move-object/from16 v10, v88

    .line 1126
    .line 1127
    move-object/from16 v2, v90

    .line 1128
    .line 1129
    :goto_28
    const/4 v7, 0x2

    .line 1130
    const/4 v12, 0x4

    .line 1131
    goto/16 :goto_6c

    .line 1132
    .line 1133
    :cond_29
    move-object/from16 v104, v12

    .line 1134
    .line 1135
    const-string v12, "ContentProtection"

    .line 1136
    .line 1137
    invoke-static {v0, v12}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1138
    .line 1139
    .line 1140
    move-result v105

    .line 1141
    if-eqz v105, :cond_2c

    .line 1142
    .line 1143
    invoke-static {v0}, LY1/e;->f(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/Pair;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v12

    .line 1147
    move-wide/from16 v105, v3

    .line 1148
    .line 1149
    iget-object v3, v12, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1150
    .line 1151
    if-eqz v3, :cond_2a

    .line 1152
    .line 1153
    move-object/from16 v87, v3

    .line 1154
    .line 1155
    check-cast v87, Ljava/lang/String;

    .line 1156
    .line 1157
    :cond_2a
    iget-object v3, v12, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1158
    .line 1159
    if-eqz v3, :cond_2b

    .line 1160
    .line 1161
    check-cast v3, LN1/i;

    .line 1162
    .line 1163
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1164
    .line 1165
    .line 1166
    :cond_2b
    :goto_29
    move-object/from16 v139, v1

    .line 1167
    .line 1168
    move-object/from16 v50, v5

    .line 1169
    .line 1170
    move-object/from16 v131, v8

    .line 1171
    .line 1172
    move-object/from16 v130, v9

    .line 1173
    .line 1174
    move-object/from16 v129, v13

    .line 1175
    .line 1176
    move-object/from16 v108, v14

    .line 1177
    .line 1178
    move-object v8, v15

    .line 1179
    move-wide/from16 v143, v34

    .line 1180
    .line 1181
    move-object/from16 v1, v65

    .line 1182
    .line 1183
    move-object/from16 v141, v70

    .line 1184
    .line 1185
    move-object/from16 v14, v71

    .line 1186
    .line 1187
    move-wide/from16 v60, v77

    .line 1188
    .line 1189
    move-wide/from16 v3, v81

    .line 1190
    .line 1191
    move-wide/from16 v34, v84

    .line 1192
    .line 1193
    move-object/from16 v137, v89

    .line 1194
    .line 1195
    move-object/from16 v13, v91

    .line 1196
    .line 1197
    move-object/from16 v15, v92

    .line 1198
    .line 1199
    move-object/from16 v77, v93

    .line 1200
    .line 1201
    move/from16 v118, v94

    .line 1202
    .line 1203
    move-object/from16 v93, v96

    .line 1204
    .line 1205
    move-object/from16 v96, v97

    .line 1206
    .line 1207
    move-object/from16 v112, v98

    .line 1208
    .line 1209
    move-object/from16 v97, v99

    .line 1210
    .line 1211
    const/4 v12, 0x4

    .line 1212
    move/from16 v91, v2

    .line 1213
    .line 1214
    move-object/from16 v85, v7

    .line 1215
    .line 1216
    move-object/from16 v81, v10

    .line 1217
    .line 1218
    move-object/from16 v78, v11

    .line 1219
    .line 1220
    move-object/from16 v10, v88

    .line 1221
    .line 1222
    move-object/from16 v2, v90

    .line 1223
    .line 1224
    const/4 v7, 0x2

    .line 1225
    goto/16 :goto_6c

    .line 1226
    .line 1227
    :cond_2c
    move-wide/from16 v105, v3

    .line 1228
    .line 1229
    const-string v3, "ContentComponent"

    .line 1230
    .line 1231
    invoke-static {v0, v3}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1232
    .line 1233
    .line 1234
    move-result v3

    .line 1235
    if-eqz v3, :cond_32

    .line 1236
    .line 1237
    const/4 v3, 0x0

    .line 1238
    invoke-interface {v0, v3, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v4

    .line 1242
    if-nez v7, :cond_2d

    .line 1243
    .line 1244
    move-object v7, v4

    .line 1245
    goto :goto_2a

    .line 1246
    :cond_2d
    if-nez v4, :cond_2e

    .line 1247
    .line 1248
    goto :goto_2a

    .line 1249
    :cond_2e
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1250
    .line 1251
    .line 1252
    move-result v3

    .line 1253
    invoke-static {v3}, LQ1/k;->g(Z)V

    .line 1254
    .line 1255
    .line 1256
    :goto_2a
    invoke-static {v0}, LY1/e;->g(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 1257
    .line 1258
    .line 1259
    move-result v3

    .line 1260
    const/4 v4, -0x1

    .line 1261
    if-ne v6, v4, :cond_2f

    .line 1262
    .line 1263
    move v6, v3

    .line 1264
    goto :goto_29

    .line 1265
    :cond_2f
    if-ne v3, v4, :cond_30

    .line 1266
    .line 1267
    goto :goto_29

    .line 1268
    :cond_30
    if-ne v6, v3, :cond_31

    .line 1269
    .line 1270
    const/4 v3, 0x1

    .line 1271
    goto :goto_2b

    .line 1272
    :cond_31
    move/from16 v3, v42

    .line 1273
    .line 1274
    :goto_2b
    invoke-static {v3}, LQ1/k;->g(Z)V

    .line 1275
    .line 1276
    .line 1277
    goto :goto_29

    .line 1278
    :cond_32
    const-string v3, "Role"

    .line 1279
    .line 1280
    invoke-static {v0, v3}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1281
    .line 1282
    .line 1283
    move-result v4

    .line 1284
    if-eqz v4, :cond_33

    .line 1285
    .line 1286
    invoke-static {v0, v3}, LY1/e;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LY1/f;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v3

    .line 1290
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1291
    .line 1292
    .line 1293
    :goto_2c
    move-object/from16 v139, v1

    .line 1294
    .line 1295
    move-object/from16 v50, v5

    .line 1296
    .line 1297
    move/from16 v123, v6

    .line 1298
    .line 1299
    move-object/from16 v131, v8

    .line 1300
    .line 1301
    move-object/from16 v130, v9

    .line 1302
    .line 1303
    move-object/from16 v129, v13

    .line 1304
    .line 1305
    move-object/from16 v108, v14

    .line 1306
    .line 1307
    move-object v8, v15

    .line 1308
    move-wide/from16 v143, v34

    .line 1309
    .line 1310
    move-object/from16 v141, v70

    .line 1311
    .line 1312
    move-object/from16 v14, v71

    .line 1313
    .line 1314
    move-wide/from16 v60, v77

    .line 1315
    .line 1316
    move-wide/from16 v3, v81

    .line 1317
    .line 1318
    move-wide/from16 v34, v84

    .line 1319
    .line 1320
    move-object/from16 v137, v89

    .line 1321
    .line 1322
    move-object/from16 v13, v91

    .line 1323
    .line 1324
    move-object/from16 v15, v92

    .line 1325
    .line 1326
    move-object/from16 v77, v93

    .line 1327
    .line 1328
    move/from16 v118, v94

    .line 1329
    .line 1330
    move-object/from16 v93, v96

    .line 1331
    .line 1332
    move-object/from16 v96, v97

    .line 1333
    .line 1334
    move-object/from16 v112, v98

    .line 1335
    .line 1336
    move-object/from16 v97, v99

    .line 1337
    .line 1338
    move-wide/from16 v5, v101

    .line 1339
    .line 1340
    :goto_2d
    const/4 v12, 0x4

    .line 1341
    move/from16 v91, v2

    .line 1342
    .line 1343
    move-object/from16 v85, v7

    .line 1344
    .line 1345
    move-object/from16 v81, v10

    .line 1346
    .line 1347
    move-object/from16 v78, v11

    .line 1348
    .line 1349
    move-object/from16 v10, v88

    .line 1350
    .line 1351
    move-object/from16 v2, v90

    .line 1352
    .line 1353
    :goto_2e
    const/4 v7, 0x2

    .line 1354
    goto/16 :goto_6b

    .line 1355
    .line 1356
    :cond_33
    const-string v3, "AudioChannelConfiguration"

    .line 1357
    .line 1358
    invoke-static {v0, v3}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1359
    .line 1360
    .line 1361
    move-result v4

    .line 1362
    if-eqz v4, :cond_34

    .line 1363
    .line 1364
    invoke-static {v0}, LY1/e;->c(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 1365
    .line 1366
    .line 1367
    move-result v103

    .line 1368
    goto/16 :goto_29

    .line 1369
    .line 1370
    :cond_34
    const-string v4, "Accessibility"

    .line 1371
    .line 1372
    invoke-static {v0, v4}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1373
    .line 1374
    .line 1375
    move-result v107

    .line 1376
    if-eqz v107, :cond_35

    .line 1377
    .line 1378
    invoke-static {v0, v4}, LY1/e;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LY1/f;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v3

    .line 1382
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1383
    .line 1384
    .line 1385
    goto :goto_2c

    .line 1386
    :cond_35
    const-string v4, "EssentialProperty"

    .line 1387
    .line 1388
    invoke-static {v0, v4}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1389
    .line 1390
    .line 1391
    move-result v107

    .line 1392
    if-eqz v107, :cond_36

    .line 1393
    .line 1394
    invoke-static {v0, v4}, LY1/e;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LY1/f;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v3

    .line 1398
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1399
    .line 1400
    .line 1401
    goto :goto_2c

    .line 1402
    :cond_36
    move-object/from16 v107, v15

    .line 1403
    .line 1404
    const-string v15, "SupplementalProperty"

    .line 1405
    .line 1406
    invoke-static {v0, v15}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1407
    .line 1408
    .line 1409
    move-result v108

    .line 1410
    if-eqz v108, :cond_37

    .line 1411
    .line 1412
    invoke-static {v0, v15}, LY1/e;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LY1/f;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v3

    .line 1416
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1417
    .line 1418
    .line 1419
    move-object/from16 v139, v1

    .line 1420
    .line 1421
    move-object/from16 v50, v5

    .line 1422
    .line 1423
    move/from16 v123, v6

    .line 1424
    .line 1425
    move-object/from16 v131, v8

    .line 1426
    .line 1427
    move-object/from16 v130, v9

    .line 1428
    .line 1429
    move-object/from16 v129, v13

    .line 1430
    .line 1431
    move-object/from16 v108, v14

    .line 1432
    .line 1433
    move-wide/from16 v143, v34

    .line 1434
    .line 1435
    move-object/from16 v141, v70

    .line 1436
    .line 1437
    move-object/from16 v14, v71

    .line 1438
    .line 1439
    move-wide/from16 v60, v77

    .line 1440
    .line 1441
    move-wide/from16 v3, v81

    .line 1442
    .line 1443
    move-wide/from16 v34, v84

    .line 1444
    .line 1445
    move-object/from16 v137, v89

    .line 1446
    .line 1447
    move-object/from16 v13, v91

    .line 1448
    .line 1449
    move-object/from16 v15, v92

    .line 1450
    .line 1451
    move-object/from16 v77, v93

    .line 1452
    .line 1453
    move/from16 v118, v94

    .line 1454
    .line 1455
    move-object/from16 v93, v96

    .line 1456
    .line 1457
    move-object/from16 v96, v97

    .line 1458
    .line 1459
    move-object/from16 v112, v98

    .line 1460
    .line 1461
    move-object/from16 v97, v99

    .line 1462
    .line 1463
    move-wide/from16 v5, v101

    .line 1464
    .line 1465
    move-object/from16 v8, v107

    .line 1466
    .line 1467
    goto :goto_2d

    .line 1468
    :cond_37
    move-object/from16 v108, v14

    .line 1469
    .line 1470
    const-string v14, "Representation"

    .line 1471
    .line 1472
    invoke-static {v0, v14}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1473
    .line 1474
    .line 1475
    move-result v109

    .line 1476
    move-object/from16 v110, v14

    .line 1477
    .line 1478
    const-string v14, "InbandEventStream"

    .line 1479
    .line 1480
    if-eqz v109, :cond_81

    .line 1481
    .line 1482
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1483
    .line 1484
    .line 1485
    move-result v109

    .line 1486
    move-object/from16 v50, v4

    .line 1487
    .line 1488
    move-object/from16 v4, v98

    .line 1489
    .line 1490
    move-object/from16 v98, v15

    .line 1491
    .line 1492
    if-nez v109, :cond_38

    .line 1493
    .line 1494
    move-object v15, v8

    .line 1495
    :goto_2f
    move-object/from16 v109, v1

    .line 1496
    .line 1497
    move-object/from16 v111, v14

    .line 1498
    .line 1499
    const/4 v1, 0x0

    .line 1500
    goto :goto_30

    .line 1501
    :cond_38
    move-object/from16 v15, v104

    .line 1502
    .line 1503
    goto :goto_2f

    .line 1504
    :goto_30
    invoke-interface {v0, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v14

    .line 1508
    move-object/from16 v112, v4

    .line 1509
    .line 1510
    const-string v4, "bandwidth"

    .line 1511
    .line 1512
    invoke-interface {v0, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v4

    .line 1516
    if-nez v4, :cond_39

    .line 1517
    .line 1518
    move-object/from16 v4, v99

    .line 1519
    .line 1520
    const/16 v99, -0x1

    .line 1521
    .line 1522
    goto :goto_31

    .line 1523
    :cond_39
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1524
    .line 1525
    .line 1526
    move-result v4

    .line 1527
    move-object/from16 v155, v99

    .line 1528
    .line 1529
    move/from16 v99, v4

    .line 1530
    .line 1531
    move-object/from16 v4, v155

    .line 1532
    .line 1533
    :goto_31
    invoke-interface {v0, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v113

    .line 1537
    if-nez v113, :cond_3a

    .line 1538
    .line 1539
    move-object/from16 v114, v74

    .line 1540
    .line 1541
    goto :goto_32

    .line 1542
    :cond_3a
    move-object/from16 v114, v113

    .line 1543
    .line 1544
    :goto_32
    invoke-interface {v0, v1, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1545
    .line 1546
    .line 1547
    move-result-object v113

    .line 1548
    if-nez v113, :cond_3b

    .line 1549
    .line 1550
    move-object/from16 v113, v97

    .line 1551
    .line 1552
    move-object/from16 v97, v4

    .line 1553
    .line 1554
    move-object/from16 v4, v113

    .line 1555
    .line 1556
    move-object/from16 v113, v79

    .line 1557
    .line 1558
    goto :goto_33

    .line 1559
    :cond_3b
    move-object/from16 v155, v97

    .line 1560
    .line 1561
    move-object/from16 v97, v4

    .line 1562
    .line 1563
    move-object/from16 v4, v155

    .line 1564
    .line 1565
    :goto_33
    invoke-interface {v0, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v115

    .line 1569
    if-nez v115, :cond_3c

    .line 1570
    .line 1571
    move-object/from16 v116, v96

    .line 1572
    .line 1573
    move-object/from16 v96, v4

    .line 1574
    .line 1575
    move-object/from16 v4, v116

    .line 1576
    .line 1577
    move/from16 v116, v80

    .line 1578
    .line 1579
    goto :goto_34

    .line 1580
    :cond_3c
    invoke-static/range {v115 .. v115}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1581
    .line 1582
    .line 1583
    move-result v115

    .line 1584
    move-object/from16 v116, v96

    .line 1585
    .line 1586
    move-object/from16 v96, v4

    .line 1587
    .line 1588
    move-object/from16 v4, v116

    .line 1589
    .line 1590
    move/from16 v116, v115

    .line 1591
    .line 1592
    :goto_34
    invoke-interface {v0, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v115

    .line 1596
    if-nez v115, :cond_3d

    .line 1597
    .line 1598
    move/from16 v117, v83

    .line 1599
    .line 1600
    move-object/from16 v115, v14

    .line 1601
    .line 1602
    move/from16 v1, v94

    .line 1603
    .line 1604
    goto :goto_35

    .line 1605
    :cond_3d
    invoke-static/range {v115 .. v115}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1606
    .line 1607
    .line 1608
    move-result v115

    .line 1609
    move/from16 v117, v115

    .line 1610
    .line 1611
    move/from16 v1, v94

    .line 1612
    .line 1613
    move-object/from16 v115, v14

    .line 1614
    .line 1615
    :goto_35
    invoke-static {v0, v1}, LY1/e;->j(Lorg/xmlpull/v1/XmlPullParser;F)F

    .line 1616
    .line 1617
    .line 1618
    move-result v14

    .line 1619
    move-object/from16 v118, v93

    .line 1620
    .line 1621
    move-object/from16 v93, v4

    .line 1622
    .line 1623
    move-object/from16 v4, v118

    .line 1624
    .line 1625
    move/from16 v118, v1

    .line 1626
    .line 1627
    const/4 v1, 0x0

    .line 1628
    invoke-interface {v0, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v94

    .line 1632
    if-nez v94, :cond_3e

    .line 1633
    .line 1634
    move/from16 v119, v86

    .line 1635
    .line 1636
    :goto_36
    move/from16 v94, v14

    .line 1637
    .line 1638
    goto :goto_37

    .line 1639
    :cond_3e
    invoke-static/range {v94 .. v94}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1640
    .line 1641
    .line 1642
    move-result v94

    .line 1643
    move/from16 v119, v94

    .line 1644
    .line 1645
    goto :goto_36

    .line 1646
    :goto_37
    new-instance v14, Ljava/util/ArrayList;

    .line 1647
    .line 1648
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 1649
    .line 1650
    .line 1651
    move-object/from16 v125, v14

    .line 1652
    .line 1653
    new-instance v14, Ljava/util/ArrayList;

    .line 1654
    .line 1655
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 1656
    .line 1657
    .line 1658
    move-object/from16 v126, v14

    .line 1659
    .line 1660
    new-instance v14, Ljava/util/ArrayList;

    .line 1661
    .line 1662
    invoke-direct {v14, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1663
    .line 1664
    .line 1665
    move-object/from16 v129, v13

    .line 1666
    .line 1667
    new-instance v13, Ljava/util/ArrayList;

    .line 1668
    .line 1669
    invoke-direct {v13, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1670
    .line 1671
    .line 1672
    move-object/from16 v128, v13

    .line 1673
    .line 1674
    new-instance v13, Ljava/util/ArrayList;

    .line 1675
    .line 1676
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 1677
    .line 1678
    .line 1679
    move-object/from16 v121, v1

    .line 1680
    .line 1681
    move/from16 v123, v6

    .line 1682
    .line 1683
    move-object/from16 v122, v7

    .line 1684
    .line 1685
    move/from16 v120, v42

    .line 1686
    .line 1687
    move-object/from16 v124, v100

    .line 1688
    .line 1689
    move-wide/from16 v130, v101

    .line 1690
    .line 1691
    move/from16 v127, v103

    .line 1692
    .line 1693
    move-wide/from16 v6, v105

    .line 1694
    .line 1695
    :goto_38
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 1696
    .line 1697
    .line 1698
    invoke-static {v0, v9}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1699
    .line 1700
    .line 1701
    move-result v132

    .line 1702
    if-eqz v132, :cond_40

    .line 1703
    .line 1704
    if-nez v120, :cond_3f

    .line 1705
    .line 1706
    invoke-static {v0, v6, v7}, LY1/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 1707
    .line 1708
    .line 1709
    move-result-wide v6

    .line 1710
    const/16 v120, 0x1

    .line 1711
    .line 1712
    :cond_3f
    invoke-static {v0, v15, v2}, LY1/e;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/ArrayList;Z)Ljava/util/ArrayList;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v1

    .line 1716
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1717
    .line 1718
    .line 1719
    :goto_39
    move-object/from16 v141, v70

    .line 1720
    .line 1721
    move-object/from16 v142, v71

    .line 1722
    .line 1723
    move-wide/from16 v60, v77

    .line 1724
    .line 1725
    move-object/from16 v138, v88

    .line 1726
    .line 1727
    move-object/from16 v137, v89

    .line 1728
    .line 1729
    move-object/from16 v140, v90

    .line 1730
    .line 1731
    move-object/from16 v136, v91

    .line 1732
    .line 1733
    move/from16 v71, v99

    .line 1734
    .line 1735
    move-object/from16 v139, v109

    .line 1736
    .line 1737
    move-object/from16 v70, v124

    .line 1738
    .line 1739
    move-object/from16 v1, v128

    .line 1740
    .line 1741
    move-wide/from16 v88, v130

    .line 1742
    .line 1743
    const/16 v41, 0x1

    .line 1744
    .line 1745
    move/from16 v91, v2

    .line 1746
    .line 1747
    move-object/from16 v77, v4

    .line 1748
    .line 1749
    move-object/from16 v131, v8

    .line 1750
    .line 1751
    move-object/from16 v130, v9

    .line 1752
    .line 1753
    move-object/from16 v78, v11

    .line 1754
    .line 1755
    move-object/from16 v9, v111

    .line 1756
    .line 1757
    move-object/from16 v124, v121

    .line 1758
    .line 1759
    move/from16 v2, v127

    .line 1760
    .line 1761
    move-wide v7, v6

    .line 1762
    move-wide/from16 v155, v81

    .line 1763
    .line 1764
    move-object/from16 v82, v3

    .line 1765
    .line 1766
    move-object/from16 v81, v10

    .line 1767
    .line 1768
    move-object/from16 v3, v110

    .line 1769
    .line 1770
    move-object/from16 v10, v125

    .line 1771
    .line 1772
    move-wide/from16 v109, v155

    .line 1773
    .line 1774
    move-object/from16 v155, v50

    .line 1775
    .line 1776
    move-object/from16 v50, v5

    .line 1777
    .line 1778
    move-wide/from16 v5, v34

    .line 1779
    .line 1780
    move-object/from16 v34, v13

    .line 1781
    .line 1782
    move-object/from16 v35, v15

    .line 1783
    .line 1784
    move-object/from16 v13, v155

    .line 1785
    .line 1786
    move-object v15, v12

    .line 1787
    move-wide/from16 v11, v84

    .line 1788
    .line 1789
    move-object/from16 v85, v122

    .line 1790
    .line 1791
    move/from16 v84, v123

    .line 1792
    .line 1793
    goto/16 :goto_3f

    .line 1794
    .line 1795
    :cond_40
    invoke-static {v0, v3}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1796
    .line 1797
    .line 1798
    move-result v1

    .line 1799
    if-eqz v1, :cond_41

    .line 1800
    .line 1801
    invoke-static {v0}, LY1/e;->c(Lorg/xmlpull/v1/XmlPullParser;)I

    .line 1802
    .line 1803
    .line 1804
    move-result v127

    .line 1805
    goto :goto_39

    .line 1806
    :cond_41
    move-object/from16 v1, v92

    .line 1807
    .line 1808
    invoke-static {v0, v1}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1809
    .line 1810
    .line 1811
    move-result v92

    .line 1812
    if-eqz v92, :cond_42

    .line 1813
    .line 1814
    move-object/from16 v92, v1

    .line 1815
    .line 1816
    move-object/from16 v1, v124

    .line 1817
    .line 1818
    check-cast v1, LY1/r;

    .line 1819
    .line 1820
    invoke-static {v0, v1}, LY1/e;->o(Lorg/xmlpull/v1/XmlPullParser;LY1/r;)LY1/r;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v124

    .line 1824
    goto :goto_39

    .line 1825
    :cond_42
    move-object/from16 v92, v1

    .line 1826
    .line 1827
    move-object/from16 v1, v91

    .line 1828
    .line 1829
    invoke-static {v0, v1}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1830
    .line 1831
    .line 1832
    move-result v91

    .line 1833
    if-eqz v91, :cond_43

    .line 1834
    .line 1835
    move-object/from16 v133, v1

    .line 1836
    .line 1837
    move/from16 v91, v2

    .line 1838
    .line 1839
    move-wide/from16 v1, v130

    .line 1840
    .line 1841
    move-object/from16 v131, v8

    .line 1842
    .line 1843
    move-object/from16 v130, v9

    .line 1844
    .line 1845
    invoke-static {v0, v1, v2}, LY1/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 1846
    .line 1847
    .line 1848
    move-result-wide v8

    .line 1849
    move-object/from16 v1, v124

    .line 1850
    .line 1851
    check-cast v1, LY1/o;

    .line 1852
    .line 1853
    move-wide/from16 v60, v81

    .line 1854
    .line 1855
    move-object/from16 v82, v3

    .line 1856
    .line 1857
    move-wide/from16 v2, v60

    .line 1858
    .line 1859
    move-object/from16 v81, v10

    .line 1860
    .line 1861
    move-wide/from16 v60, v77

    .line 1862
    .line 1863
    move-object/from16 v138, v88

    .line 1864
    .line 1865
    move-object/from16 v137, v89

    .line 1866
    .line 1867
    move-object/from16 v140, v90

    .line 1868
    .line 1869
    move-object/from16 v139, v109

    .line 1870
    .line 1871
    move-object/from16 v136, v133

    .line 1872
    .line 1873
    move-object/from16 v77, v4

    .line 1874
    .line 1875
    move-object/from16 v78, v11

    .line 1876
    .line 1877
    move-wide/from16 v10, v84

    .line 1878
    .line 1879
    move-object/from16 v85, v122

    .line 1880
    .line 1881
    move/from16 v84, v123

    .line 1882
    .line 1883
    move-object/from16 v155, v50

    .line 1884
    .line 1885
    move-object/from16 v50, v5

    .line 1886
    .line 1887
    move-wide/from16 v4, v34

    .line 1888
    .line 1889
    move-object/from16 v34, v13

    .line 1890
    .line 1891
    move-object/from16 v35, v15

    .line 1892
    .line 1893
    move-object/from16 v13, v155

    .line 1894
    .line 1895
    move/from16 v15, v99

    .line 1896
    .line 1897
    invoke-static/range {v0 .. v11}, LY1/e;->p(Lorg/xmlpull/v1/XmlPullParser;LY1/o;JJJJJ)LY1/o;

    .line 1898
    .line 1899
    .line 1900
    move-result-object v124

    .line 1901
    move-wide/from16 v88, v6

    .line 1902
    .line 1903
    move-wide v5, v4

    .line 1904
    move-wide v3, v2

    .line 1905
    move-wide v1, v3

    .line 1906
    move-object/from16 v3, v110

    .line 1907
    .line 1908
    move-wide/from16 v109, v1

    .line 1909
    .line 1910
    move-wide/from16 v1, v88

    .line 1911
    .line 1912
    move-wide/from16 v88, v8

    .line 1913
    .line 1914
    move-wide v7, v1

    .line 1915
    move-object/from16 v141, v70

    .line 1916
    .line 1917
    move-object/from16 v142, v71

    .line 1918
    .line 1919
    move-object/from16 v9, v111

    .line 1920
    .line 1921
    move-object/from16 v70, v124

    .line 1922
    .line 1923
    move/from16 v2, v127

    .line 1924
    .line 1925
    move-object/from16 v1, v128

    .line 1926
    .line 1927
    const/16 v41, 0x1

    .line 1928
    .line 1929
    move/from16 v71, v15

    .line 1930
    .line 1931
    move-object/from16 v124, v121

    .line 1932
    .line 1933
    move-object v15, v12

    .line 1934
    move-wide v11, v10

    .line 1935
    move-object/from16 v10, v125

    .line 1936
    .line 1937
    goto/16 :goto_3f

    .line 1938
    .line 1939
    :cond_43
    move-object/from16 v136, v1

    .line 1940
    .line 1941
    move/from16 v91, v2

    .line 1942
    .line 1943
    move-wide/from16 v60, v77

    .line 1944
    .line 1945
    move-object/from16 v138, v88

    .line 1946
    .line 1947
    move-object/from16 v137, v89

    .line 1948
    .line 1949
    move-object/from16 v140, v90

    .line 1950
    .line 1951
    move-object/from16 v139, v109

    .line 1952
    .line 1953
    move-wide/from16 v1, v130

    .line 1954
    .line 1955
    move-object/from16 v77, v4

    .line 1956
    .line 1957
    move-wide/from16 v88, v6

    .line 1958
    .line 1959
    move-object/from16 v131, v8

    .line 1960
    .line 1961
    move-object/from16 v130, v9

    .line 1962
    .line 1963
    move-object/from16 v78, v11

    .line 1964
    .line 1965
    move-object/from16 v7, v71

    .line 1966
    .line 1967
    move-wide/from16 v155, v81

    .line 1968
    .line 1969
    move-object/from16 v82, v3

    .line 1970
    .line 1971
    move-object/from16 v81, v10

    .line 1972
    .line 1973
    move-wide/from16 v3, v155

    .line 1974
    .line 1975
    move-wide/from16 v10, v84

    .line 1976
    .line 1977
    move-object/from16 v85, v122

    .line 1978
    .line 1979
    move/from16 v84, v123

    .line 1980
    .line 1981
    move-object/from16 v155, v50

    .line 1982
    .line 1983
    move-object/from16 v50, v5

    .line 1984
    .line 1985
    move-wide/from16 v5, v34

    .line 1986
    .line 1987
    move-object/from16 v34, v13

    .line 1988
    .line 1989
    move-object/from16 v35, v15

    .line 1990
    .line 1991
    move-object/from16 v13, v155

    .line 1992
    .line 1993
    move/from16 v15, v99

    .line 1994
    .line 1995
    invoke-static {v0, v7}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1996
    .line 1997
    .line 1998
    move-result v8

    .line 1999
    if-eqz v8, :cond_44

    .line 2000
    .line 2001
    move-object v8, v12

    .line 2002
    move-wide v11, v10

    .line 2003
    invoke-static {v0, v1, v2}, LY1/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 2004
    .line 2005
    .line 2006
    move-result-wide v9

    .line 2007
    move-object/from16 v1, v124

    .line 2008
    .line 2009
    check-cast v1, LY1/p;

    .line 2010
    .line 2011
    move-object/from16 v142, v7

    .line 2012
    .line 2013
    move/from16 v71, v15

    .line 2014
    .line 2015
    move-object/from16 v141, v70

    .line 2016
    .line 2017
    move-object/from16 v2, v81

    .line 2018
    .line 2019
    const/16 v41, 0x1

    .line 2020
    .line 2021
    move-object v15, v8

    .line 2022
    move-wide/from16 v7, v88

    .line 2023
    .line 2024
    invoke-static/range {v0 .. v12}, LY1/e;->q(Lorg/xmlpull/v1/XmlPullParser;LY1/p;Ljava/util/List;JJJJJ)LY1/p;

    .line 2025
    .line 2026
    .line 2027
    move-result-object v124

    .line 2028
    move-wide v1, v3

    .line 2029
    move-object/from16 v3, v110

    .line 2030
    .line 2031
    move-wide/from16 v109, v1

    .line 2032
    .line 2033
    move-wide/from16 v88, v9

    .line 2034
    .line 2035
    move-object/from16 v9, v111

    .line 2036
    .line 2037
    move-object/from16 v70, v124

    .line 2038
    .line 2039
    move-object/from16 v10, v125

    .line 2040
    .line 2041
    :goto_3a
    move/from16 v2, v127

    .line 2042
    .line 2043
    move-object/from16 v1, v128

    .line 2044
    .line 2045
    :goto_3b
    move-object/from16 v124, v121

    .line 2046
    .line 2047
    goto/16 :goto_3f

    .line 2048
    .line 2049
    :cond_44
    move-object/from16 v142, v7

    .line 2050
    .line 2051
    move/from16 v71, v15

    .line 2052
    .line 2053
    move-object/from16 v141, v70

    .line 2054
    .line 2055
    move-wide/from16 v7, v88

    .line 2056
    .line 2057
    const/16 v41, 0x1

    .line 2058
    .line 2059
    move-object v15, v12

    .line 2060
    move-wide v11, v10

    .line 2061
    invoke-static {v0, v15}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 2062
    .line 2063
    .line 2064
    move-result v9

    .line 2065
    if-eqz v9, :cond_47

    .line 2066
    .line 2067
    invoke-static {v0}, LY1/e;->f(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/Pair;

    .line 2068
    .line 2069
    .line 2070
    move-result-object v9

    .line 2071
    iget-object v10, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 2072
    .line 2073
    if-eqz v10, :cond_45

    .line 2074
    .line 2075
    move-object/from16 v121, v10

    .line 2076
    .line 2077
    check-cast v121, Ljava/lang/String;

    .line 2078
    .line 2079
    :cond_45
    iget-object v9, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 2080
    .line 2081
    if-eqz v9, :cond_46

    .line 2082
    .line 2083
    check-cast v9, LN1/i;

    .line 2084
    .line 2085
    move-object/from16 v10, v125

    .line 2086
    .line 2087
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2088
    .line 2089
    .line 2090
    goto :goto_3c

    .line 2091
    :cond_46
    move-object/from16 v10, v125

    .line 2092
    .line 2093
    :goto_3c
    move-wide/from16 v88, v3

    .line 2094
    .line 2095
    move-object/from16 v3, v110

    .line 2096
    .line 2097
    move-wide/from16 v109, v88

    .line 2098
    .line 2099
    move-wide/from16 v88, v1

    .line 2100
    .line 2101
    move-object/from16 v9, v111

    .line 2102
    .line 2103
    move-object/from16 v70, v124

    .line 2104
    .line 2105
    goto :goto_3a

    .line 2106
    :cond_47
    move-object/from16 v9, v111

    .line 2107
    .line 2108
    move-object/from16 v10, v125

    .line 2109
    .line 2110
    invoke-static {v0, v9}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 2111
    .line 2112
    .line 2113
    move-result v70

    .line 2114
    if-eqz v70, :cond_48

    .line 2115
    .line 2116
    move-wide/from16 v88, v1

    .line 2117
    .line 2118
    invoke-static {v0, v9}, LY1/e;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LY1/f;

    .line 2119
    .line 2120
    .line 2121
    move-result-object v1

    .line 2122
    move-object/from16 v2, v126

    .line 2123
    .line 2124
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2125
    .line 2126
    .line 2127
    :goto_3d
    move-object/from16 v1, v128

    .line 2128
    .line 2129
    goto :goto_3e

    .line 2130
    :cond_48
    move-wide/from16 v88, v1

    .line 2131
    .line 2132
    move-object/from16 v2, v126

    .line 2133
    .line 2134
    invoke-static {v0, v13}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 2135
    .line 2136
    .line 2137
    move-result v1

    .line 2138
    if-eqz v1, :cond_49

    .line 2139
    .line 2140
    invoke-static {v0, v13}, LY1/e;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LY1/f;

    .line 2141
    .line 2142
    .line 2143
    move-result-object v1

    .line 2144
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2145
    .line 2146
    .line 2147
    move-object/from16 v126, v2

    .line 2148
    .line 2149
    goto :goto_3d

    .line 2150
    :cond_49
    move-object/from16 v1, v98

    .line 2151
    .line 2152
    invoke-static {v0, v1}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 2153
    .line 2154
    .line 2155
    move-result v70

    .line 2156
    if-eqz v70, :cond_4a

    .line 2157
    .line 2158
    move-object/from16 v126, v2

    .line 2159
    .line 2160
    invoke-static {v0, v1}, LY1/e;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LY1/f;

    .line 2161
    .line 2162
    .line 2163
    move-result-object v2

    .line 2164
    move-object/from16 v98, v1

    .line 2165
    .line 2166
    move-object/from16 v1, v128

    .line 2167
    .line 2168
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2169
    .line 2170
    .line 2171
    goto :goto_3e

    .line 2172
    :cond_4a
    move-object/from16 v98, v1

    .line 2173
    .line 2174
    move-object/from16 v126, v2

    .line 2175
    .line 2176
    move-object/from16 v1, v128

    .line 2177
    .line 2178
    invoke-static {v0}, LY1/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 2179
    .line 2180
    .line 2181
    :goto_3e
    move-wide/from16 v155, v3

    .line 2182
    .line 2183
    move-object/from16 v3, v110

    .line 2184
    .line 2185
    move-wide/from16 v109, v155

    .line 2186
    .line 2187
    move-object/from16 v70, v124

    .line 2188
    .line 2189
    move/from16 v2, v127

    .line 2190
    .line 2191
    goto/16 :goto_3b

    .line 2192
    .line 2193
    :goto_3f
    invoke-static {v0, v3}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 2194
    .line 2195
    .line 2196
    move-result v4

    .line 2197
    if-eqz v4, :cond_80

    .line 2198
    .line 2199
    invoke-static/range {v114 .. v114}, LN1/C;->i(Ljava/lang/String;)Z

    .line 2200
    .line 2201
    .line 2202
    move-result v3

    .line 2203
    if-eqz v3, :cond_4e

    .line 2204
    .line 2205
    if-nez v113, :cond_4c

    .line 2206
    .line 2207
    :cond_4b
    :goto_40
    const/4 v4, 0x0

    .line 2208
    goto :goto_43

    .line 2209
    :cond_4c
    invoke-static/range {v113 .. v113}, LQ1/x;->U(Ljava/lang/String;)[Ljava/lang/String;

    .line 2210
    .line 2211
    .line 2212
    move-result-object v3

    .line 2213
    array-length v4, v3

    .line 2214
    move/from16 v7, v42

    .line 2215
    .line 2216
    :goto_41
    if-ge v7, v4, :cond_4b

    .line 2217
    .line 2218
    aget-object v8, v3, v7

    .line 2219
    .line 2220
    invoke-static {v8}, LN1/C;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 2221
    .line 2222
    .line 2223
    move-result-object v8

    .line 2224
    if-eqz v8, :cond_4d

    .line 2225
    .line 2226
    invoke-static {v8}, LN1/C;->i(Ljava/lang/String;)Z

    .line 2227
    .line 2228
    .line 2229
    move-result v9

    .line 2230
    if-eqz v9, :cond_4d

    .line 2231
    .line 2232
    :goto_42
    move-object v4, v8

    .line 2233
    goto :goto_43

    .line 2234
    :cond_4d
    add-int/lit8 v7, v7, 0x1

    .line 2235
    .line 2236
    goto :goto_41

    .line 2237
    :goto_43
    move-object v3, v4

    .line 2238
    move-object/from16 v4, v114

    .line 2239
    .line 2240
    goto :goto_46

    .line 2241
    :cond_4e
    invoke-static/range {v114 .. v114}, LN1/C;->l(Ljava/lang/String;)Z

    .line 2242
    .line 2243
    .line 2244
    move-result v3

    .line 2245
    if-eqz v3, :cond_51

    .line 2246
    .line 2247
    if-nez v113, :cond_4f

    .line 2248
    .line 2249
    goto :goto_40

    .line 2250
    :cond_4f
    invoke-static/range {v113 .. v113}, LQ1/x;->U(Ljava/lang/String;)[Ljava/lang/String;

    .line 2251
    .line 2252
    .line 2253
    move-result-object v3

    .line 2254
    array-length v4, v3

    .line 2255
    move/from16 v7, v42

    .line 2256
    .line 2257
    :goto_44
    if-ge v7, v4, :cond_4b

    .line 2258
    .line 2259
    aget-object v8, v3, v7

    .line 2260
    .line 2261
    invoke-static {v8}, LN1/C;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 2262
    .line 2263
    .line 2264
    move-result-object v8

    .line 2265
    if-eqz v8, :cond_50

    .line 2266
    .line 2267
    invoke-static {v8}, LN1/C;->l(Ljava/lang/String;)Z

    .line 2268
    .line 2269
    .line 2270
    move-result v9

    .line 2271
    if-eqz v9, :cond_50

    .line 2272
    .line 2273
    goto :goto_42

    .line 2274
    :cond_50
    add-int/lit8 v7, v7, 0x1

    .line 2275
    .line 2276
    goto :goto_44

    .line 2277
    :cond_51
    invoke-static/range {v114 .. v114}, LN1/C;->k(Ljava/lang/String;)Z

    .line 2278
    .line 2279
    .line 2280
    move-result v3

    .line 2281
    if-eqz v3, :cond_52

    .line 2282
    .line 2283
    goto :goto_45

    .line 2284
    :cond_52
    invoke-static/range {v114 .. v114}, LN1/C;->j(Ljava/lang/String;)Z

    .line 2285
    .line 2286
    .line 2287
    move-result v3

    .line 2288
    if-eqz v3, :cond_53

    .line 2289
    .line 2290
    :goto_45
    move-object/from16 v3, v114

    .line 2291
    .line 2292
    move-object v4, v3

    .line 2293
    goto :goto_46

    .line 2294
    :cond_53
    const-string v3, "application/mp4"

    .line 2295
    .line 2296
    move-object/from16 v4, v114

    .line 2297
    .line 2298
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2299
    .line 2300
    .line 2301
    move-result v3

    .line 2302
    if-eqz v3, :cond_54

    .line 2303
    .line 2304
    invoke-static/range {v113 .. v113}, LN1/C;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 2305
    .line 2306
    .line 2307
    move-result-object v3

    .line 2308
    const-string v7, "text/vtt"

    .line 2309
    .line 2310
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2311
    .line 2312
    .line 2313
    move-result v7

    .line 2314
    if-eqz v7, :cond_55

    .line 2315
    .line 2316
    const-string v3, "application/x-mp4-vtt"

    .line 2317
    .line 2318
    goto :goto_46

    .line 2319
    :cond_54
    const/4 v3, 0x0

    .line 2320
    :cond_55
    :goto_46
    const-string v7, "audio/eac3"

    .line 2321
    .line 2322
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2323
    .line 2324
    .line 2325
    move-result v8

    .line 2326
    if-eqz v8, :cond_5b

    .line 2327
    .line 2328
    move/from16 v3, v42

    .line 2329
    .line 2330
    :goto_47
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 2331
    .line 2332
    .line 2333
    move-result v8

    .line 2334
    const-string v9, "audio/eac3-joc"

    .line 2335
    .line 2336
    const-string v13, "ec+3"

    .line 2337
    .line 2338
    if-ge v3, v8, :cond_59

    .line 2339
    .line 2340
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2341
    .line 2342
    .line 2343
    move-result-object v8

    .line 2344
    check-cast v8, LY1/f;

    .line 2345
    .line 2346
    iget-object v15, v8, LY1/f;->a:Ljava/lang/String;

    .line 2347
    .line 2348
    move-object/from16 v128, v1

    .line 2349
    .line 2350
    const-string v1, "tag:dolby.com,2018:dash:EC3_ExtensionType:2018"

    .line 2351
    .line 2352
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2353
    .line 2354
    .line 2355
    move-result v1

    .line 2356
    iget-object v8, v8, LY1/f;->b:Ljava/lang/String;

    .line 2357
    .line 2358
    if-eqz v1, :cond_56

    .line 2359
    .line 2360
    const-string v1, "JOC"

    .line 2361
    .line 2362
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2363
    .line 2364
    .line 2365
    move-result v1

    .line 2366
    if-nez v1, :cond_57

    .line 2367
    .line 2368
    :cond_56
    const-string v1, "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"

    .line 2369
    .line 2370
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2371
    .line 2372
    .line 2373
    move-result v1

    .line 2374
    if-eqz v1, :cond_58

    .line 2375
    .line 2376
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2377
    .line 2378
    .line 2379
    move-result v1

    .line 2380
    if-eqz v1, :cond_58

    .line 2381
    .line 2382
    :cond_57
    move-object v3, v9

    .line 2383
    goto :goto_48

    .line 2384
    :cond_58
    add-int/lit8 v3, v3, 0x1

    .line 2385
    .line 2386
    move-object/from16 v1, v128

    .line 2387
    .line 2388
    goto :goto_47

    .line 2389
    :cond_59
    move-object/from16 v128, v1

    .line 2390
    .line 2391
    move-object v3, v7

    .line 2392
    :goto_48
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2393
    .line 2394
    .line 2395
    move-result v1

    .line 2396
    if-eqz v1, :cond_5a

    .line 2397
    .line 2398
    goto :goto_4a

    .line 2399
    :cond_5a
    :goto_49
    move-object/from16 v13, v113

    .line 2400
    .line 2401
    goto :goto_4a

    .line 2402
    :cond_5b
    move-object/from16 v128, v1

    .line 2403
    .line 2404
    goto :goto_49

    .line 2405
    :goto_4a
    move/from16 v1, v42

    .line 2406
    .line 2407
    move v7, v1

    .line 2408
    :goto_4b
    invoke-virtual/range {v108 .. v108}, Ljava/util/ArrayList;->size()I

    .line 2409
    .line 2410
    .line 2411
    move-result v8

    .line 2412
    const-string v9, "urn:mpeg:dash:role:2011"

    .line 2413
    .line 2414
    if-ge v1, v8, :cond_5f

    .line 2415
    .line 2416
    move-object/from16 v8, v108

    .line 2417
    .line 2418
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2419
    .line 2420
    .line 2421
    move-result-object v15

    .line 2422
    check-cast v15, LY1/f;

    .line 2423
    .line 2424
    move/from16 v82, v1

    .line 2425
    .line 2426
    iget-object v1, v15, LY1/f;->a:Ljava/lang/String;

    .line 2427
    .line 2428
    invoke-static {v9, v1}, LA6/h;->v(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2429
    .line 2430
    .line 2431
    move-result v1

    .line 2432
    if-eqz v1, :cond_5e

    .line 2433
    .line 2434
    iget-object v1, v15, LY1/f;->b:Ljava/lang/String;

    .line 2435
    .line 2436
    if-nez v1, :cond_5c

    .line 2437
    .line 2438
    :goto_4c
    move/from16 v1, v42

    .line 2439
    .line 2440
    goto :goto_4d

    .line 2441
    :cond_5c
    const-string v9, "forced_subtitle"

    .line 2442
    .line 2443
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2444
    .line 2445
    .line 2446
    move-result v9

    .line 2447
    if-nez v9, :cond_5d

    .line 2448
    .line 2449
    const-string v9, "forced-subtitle"

    .line 2450
    .line 2451
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2452
    .line 2453
    .line 2454
    move-result v1

    .line 2455
    if-nez v1, :cond_5d

    .line 2456
    .line 2457
    goto :goto_4c

    .line 2458
    :cond_5d
    const/4 v1, 0x2

    .line 2459
    :goto_4d
    or-int/2addr v1, v7

    .line 2460
    move v7, v1

    .line 2461
    :cond_5e
    add-int/lit8 v1, v82, 0x1

    .line 2462
    .line 2463
    move-object/from16 v108, v8

    .line 2464
    .line 2465
    goto :goto_4b

    .line 2466
    :cond_5f
    move-object/from16 v8, v108

    .line 2467
    .line 2468
    move-object/from16 v90, v4

    .line 2469
    .line 2470
    move/from16 v1, v42

    .line 2471
    .line 2472
    move v15, v1

    .line 2473
    :goto_4e
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 2474
    .line 2475
    .line 2476
    move-result v4

    .line 2477
    if-ge v1, v4, :cond_61

    .line 2478
    .line 2479
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2480
    .line 2481
    .line 2482
    move-result-object v4

    .line 2483
    check-cast v4, LY1/f;

    .line 2484
    .line 2485
    move/from16 v82, v1

    .line 2486
    .line 2487
    iget-object v1, v4, LY1/f;->a:Ljava/lang/String;

    .line 2488
    .line 2489
    invoke-static {v9, v1}, LA6/h;->v(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2490
    .line 2491
    .line 2492
    move-result v1

    .line 2493
    if-eqz v1, :cond_60

    .line 2494
    .line 2495
    iget-object v1, v4, LY1/f;->b:Ljava/lang/String;

    .line 2496
    .line 2497
    invoke-static {v1}, LY1/e;->m(Ljava/lang/String;)I

    .line 2498
    .line 2499
    .line 2500
    move-result v1

    .line 2501
    or-int/2addr v1, v15

    .line 2502
    move v15, v1

    .line 2503
    :cond_60
    add-int/lit8 v1, v82, 0x1

    .line 2504
    .line 2505
    goto :goto_4e

    .line 2506
    :cond_61
    move/from16 v1, v42

    .line 2507
    .line 2508
    move/from16 v82, v1

    .line 2509
    .line 2510
    :goto_4f
    invoke-virtual/range {v78 .. v78}, Ljava/util/ArrayList;->size()I

    .line 2511
    .line 2512
    .line 2513
    move-result v4

    .line 2514
    if-ge v1, v4, :cond_6a

    .line 2515
    .line 2516
    move-object/from16 v4, v78

    .line 2517
    .line 2518
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2519
    .line 2520
    .line 2521
    move-result-object v78

    .line 2522
    move/from16 v88, v1

    .line 2523
    .line 2524
    move-object/from16 v1, v78

    .line 2525
    .line 2526
    check-cast v1, LY1/f;

    .line 2527
    .line 2528
    move-wide/from16 v143, v5

    .line 2529
    .line 2530
    iget-object v5, v1, LY1/f;->a:Ljava/lang/String;

    .line 2531
    .line 2532
    invoke-static {v9, v5}, LA6/h;->v(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2533
    .line 2534
    .line 2535
    move-result v5

    .line 2536
    iget-object v6, v1, LY1/f;->b:Ljava/lang/String;

    .line 2537
    .line 2538
    if-eqz v5, :cond_62

    .line 2539
    .line 2540
    invoke-static {v6}, LY1/e;->m(Ljava/lang/String;)I

    .line 2541
    .line 2542
    .line 2543
    move-result v1

    .line 2544
    :goto_50
    or-int v1, v82, v1

    .line 2545
    .line 2546
    move/from16 v82, v1

    .line 2547
    .line 2548
    goto/16 :goto_54

    .line 2549
    .line 2550
    :cond_62
    const-string v5, "urn:tva:metadata:cs:AudioPurposeCS:2007"

    .line 2551
    .line 2552
    iget-object v1, v1, LY1/f;->a:Ljava/lang/String;

    .line 2553
    .line 2554
    invoke-static {v5, v1}, LA6/h;->v(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2555
    .line 2556
    .line 2557
    move-result v1

    .line 2558
    if-eqz v1, :cond_69

    .line 2559
    .line 2560
    if-nez v6, :cond_63

    .line 2561
    .line 2562
    :goto_51
    move/from16 v1, v42

    .line 2563
    .line 2564
    goto :goto_50

    .line 2565
    :cond_63
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 2566
    .line 2567
    .line 2568
    move-result v1

    .line 2569
    packed-switch v1, :pswitch_data_0

    .line 2570
    .line 2571
    .line 2572
    :goto_52
    :pswitch_0
    const/4 v1, -0x1

    .line 2573
    goto :goto_53

    .line 2574
    :pswitch_1
    const-string v1, "6"

    .line 2575
    .line 2576
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2577
    .line 2578
    .line 2579
    move-result v1

    .line 2580
    if-nez v1, :cond_64

    .line 2581
    .line 2582
    goto :goto_52

    .line 2583
    :cond_64
    const/4 v1, 0x4

    .line 2584
    goto :goto_53

    .line 2585
    :pswitch_2
    const-string v1, "4"

    .line 2586
    .line 2587
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2588
    .line 2589
    .line 2590
    move-result v1

    .line 2591
    if-nez v1, :cond_65

    .line 2592
    .line 2593
    goto :goto_52

    .line 2594
    :cond_65
    const/4 v1, 0x3

    .line 2595
    goto :goto_53

    .line 2596
    :pswitch_3
    const-string v1, "3"

    .line 2597
    .line 2598
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2599
    .line 2600
    .line 2601
    move-result v1

    .line 2602
    if-nez v1, :cond_66

    .line 2603
    .line 2604
    goto :goto_52

    .line 2605
    :cond_66
    const/4 v1, 0x2

    .line 2606
    goto :goto_53

    .line 2607
    :pswitch_4
    const-string v1, "2"

    .line 2608
    .line 2609
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2610
    .line 2611
    .line 2612
    move-result v1

    .line 2613
    if-nez v1, :cond_67

    .line 2614
    .line 2615
    goto :goto_52

    .line 2616
    :cond_67
    move/from16 v1, v41

    .line 2617
    .line 2618
    goto :goto_53

    .line 2619
    :pswitch_5
    const-string v1, "1"

    .line 2620
    .line 2621
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2622
    .line 2623
    .line 2624
    move-result v1

    .line 2625
    if-nez v1, :cond_68

    .line 2626
    .line 2627
    goto :goto_52

    .line 2628
    :cond_68
    move/from16 v1, v42

    .line 2629
    .line 2630
    :goto_53
    packed-switch v1, :pswitch_data_1

    .line 2631
    .line 2632
    .line 2633
    goto :goto_51

    .line 2634
    :pswitch_6
    move/from16 v1, v41

    .line 2635
    .line 2636
    goto :goto_50

    .line 2637
    :pswitch_7
    const/16 v1, 0x8

    .line 2638
    .line 2639
    goto :goto_50

    .line 2640
    :pswitch_8
    const/4 v1, 0x4

    .line 2641
    goto :goto_50

    .line 2642
    :pswitch_9
    const/16 v1, 0x800

    .line 2643
    .line 2644
    goto :goto_50

    .line 2645
    :pswitch_a
    const/16 v1, 0x200

    .line 2646
    .line 2647
    goto :goto_50

    .line 2648
    :cond_69
    :goto_54
    add-int/lit8 v1, v88, 0x1

    .line 2649
    .line 2650
    move-object/from16 v78, v4

    .line 2651
    .line 2652
    move-wide/from16 v5, v143

    .line 2653
    .line 2654
    goto/16 :goto_4f

    .line 2655
    .line 2656
    :cond_6a
    move-wide/from16 v143, v5

    .line 2657
    .line 2658
    move-object/from16 v4, v78

    .line 2659
    .line 2660
    or-int v1, v15, v82

    .line 2661
    .line 2662
    invoke-static {v14}, LY1/e;->n(Ljava/util/ArrayList;)I

    .line 2663
    .line 2664
    .line 2665
    move-result v5

    .line 2666
    or-int/2addr v1, v5

    .line 2667
    invoke-static/range {v128 .. v128}, LY1/e;->n(Ljava/util/ArrayList;)I

    .line 2668
    .line 2669
    .line 2670
    move-result v5

    .line 2671
    or-int/2addr v1, v5

    .line 2672
    move/from16 v5, v42

    .line 2673
    .line 2674
    :goto_55
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 2675
    .line 2676
    .line 2677
    move-result v6

    .line 2678
    if-ge v5, v6, :cond_6e

    .line 2679
    .line 2680
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2681
    .line 2682
    .line 2683
    move-result-object v6

    .line 2684
    check-cast v6, LY1/f;

    .line 2685
    .line 2686
    iget-object v9, v6, LY1/f;->a:Ljava/lang/String;

    .line 2687
    .line 2688
    const-string v15, "http://dashif.org/thumbnail_tile"

    .line 2689
    .line 2690
    invoke-static {v15, v9}, LA6/h;->v(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2691
    .line 2692
    .line 2693
    move-result v9

    .line 2694
    if-nez v9, :cond_6b

    .line 2695
    .line 2696
    const-string v9, "http://dashif.org/guidelines/thumbnail_tile"

    .line 2697
    .line 2698
    iget-object v15, v6, LY1/f;->a:Ljava/lang/String;

    .line 2699
    .line 2700
    invoke-static {v9, v15}, LA6/h;->v(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2701
    .line 2702
    .line 2703
    move-result v9

    .line 2704
    if-eqz v9, :cond_6d

    .line 2705
    .line 2706
    :cond_6b
    iget-object v6, v6, LY1/f;->b:Ljava/lang/String;

    .line 2707
    .line 2708
    if-eqz v6, :cond_6d

    .line 2709
    .line 2710
    sget v9, LQ1/x;->a:I

    .line 2711
    .line 2712
    const-string v9, "x"

    .line 2713
    .line 2714
    const/4 v15, -0x1

    .line 2715
    invoke-virtual {v6, v9, v15}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 2716
    .line 2717
    .line 2718
    move-result-object v6

    .line 2719
    array-length v9, v6

    .line 2720
    const/4 v15, 0x2

    .line 2721
    if-eq v9, v15, :cond_6c

    .line 2722
    .line 2723
    goto :goto_56

    .line 2724
    :cond_6c
    :try_start_0
    aget-object v9, v6, v42

    .line 2725
    .line 2726
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2727
    .line 2728
    .line 2729
    move-result v9

    .line 2730
    aget-object v6, v6, v41

    .line 2731
    .line 2732
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2733
    .line 2734
    .line 2735
    move-result v6

    .line 2736
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2737
    .line 2738
    .line 2739
    move-result-object v9

    .line 2740
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2741
    .line 2742
    .line 2743
    move-result-object v6

    .line 2744
    invoke-static {v9, v6}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 2745
    .line 2746
    .line 2747
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2748
    goto :goto_57

    .line 2749
    :catch_0
    :cond_6d
    :goto_56
    add-int/lit8 v5, v5, 0x1

    .line 2750
    .line 2751
    goto :goto_55

    .line 2752
    :cond_6e
    const/4 v5, 0x0

    .line 2753
    :goto_57
    new-instance v6, LN1/m;

    .line 2754
    .line 2755
    invoke-direct {v6}, LN1/m;-><init>()V

    .line 2756
    .line 2757
    .line 2758
    move-object/from16 v9, v115

    .line 2759
    .line 2760
    iput-object v9, v6, LN1/m;->a:Ljava/lang/String;

    .line 2761
    .line 2762
    invoke-static/range {v90 .. v90}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 2763
    .line 2764
    .line 2765
    move-result-object v9

    .line 2766
    iput-object v9, v6, LN1/m;->l:Ljava/lang/String;

    .line 2767
    .line 2768
    invoke-static {v3}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 2769
    .line 2770
    .line 2771
    move-result-object v9

    .line 2772
    iput-object v9, v6, LN1/m;->m:Ljava/lang/String;

    .line 2773
    .line 2774
    iput-object v13, v6, LN1/m;->j:Ljava/lang/String;

    .line 2775
    .line 2776
    move/from16 v9, v71

    .line 2777
    .line 2778
    iput v9, v6, LN1/m;->i:I

    .line 2779
    .line 2780
    iput v7, v6, LN1/m;->e:I

    .line 2781
    .line 2782
    iput v1, v6, LN1/m;->f:I

    .line 2783
    .line 2784
    move-object/from16 v1, v85

    .line 2785
    .line 2786
    iput-object v1, v6, LN1/m;->d:Ljava/lang/String;

    .line 2787
    .line 2788
    if-eqz v5, :cond_6f

    .line 2789
    .line 2790
    iget-object v7, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 2791
    .line 2792
    check-cast v7, Ljava/lang/Integer;

    .line 2793
    .line 2794
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 2795
    .line 2796
    .line 2797
    move-result v7

    .line 2798
    goto :goto_58

    .line 2799
    :cond_6f
    const/4 v7, -0x1

    .line 2800
    :goto_58
    iput v7, v6, LN1/m;->I:I

    .line 2801
    .line 2802
    if-eqz v5, :cond_70

    .line 2803
    .line 2804
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 2805
    .line 2806
    check-cast v5, Ljava/lang/Integer;

    .line 2807
    .line 2808
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 2809
    .line 2810
    .line 2811
    move-result v5

    .line 2812
    goto :goto_59

    .line 2813
    :cond_70
    const/4 v5, -0x1

    .line 2814
    :goto_59
    iput v5, v6, LN1/m;->J:I

    .line 2815
    .line 2816
    invoke-static {v3}, LN1/C;->l(Ljava/lang/String;)Z

    .line 2817
    .line 2818
    .line 2819
    move-result v5

    .line 2820
    if-eqz v5, :cond_71

    .line 2821
    .line 2822
    move/from16 v5, v116

    .line 2823
    .line 2824
    iput v5, v6, LN1/m;->t:I

    .line 2825
    .line 2826
    move/from16 v7, v117

    .line 2827
    .line 2828
    iput v7, v6, LN1/m;->u:I

    .line 2829
    .line 2830
    move/from16 v2, v94

    .line 2831
    .line 2832
    iput v2, v6, LN1/m;->v:F

    .line 2833
    .line 2834
    goto/16 :goto_5f

    .line 2835
    .line 2836
    :cond_71
    move/from16 v5, v116

    .line 2837
    .line 2838
    move/from16 v7, v117

    .line 2839
    .line 2840
    invoke-static {v3}, LN1/C;->i(Ljava/lang/String;)Z

    .line 2841
    .line 2842
    .line 2843
    move-result v9

    .line 2844
    if-eqz v9, :cond_72

    .line 2845
    .line 2846
    iput v2, v6, LN1/m;->B:I

    .line 2847
    .line 2848
    move/from16 v2, v119

    .line 2849
    .line 2850
    iput v2, v6, LN1/m;->C:I

    .line 2851
    .line 2852
    goto/16 :goto_5f

    .line 2853
    .line 2854
    :cond_72
    invoke-static {v3}, LN1/C;->k(Ljava/lang/String;)Z

    .line 2855
    .line 2856
    .line 2857
    move-result v2

    .line 2858
    if-eqz v2, :cond_79

    .line 2859
    .line 2860
    const-string v2, "application/cea-608"

    .line 2861
    .line 2862
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2863
    .line 2864
    .line 2865
    move-result v2

    .line 2866
    const-string v5, "MpdParser"

    .line 2867
    .line 2868
    if-eqz v2, :cond_75

    .line 2869
    .line 2870
    move/from16 v2, v42

    .line 2871
    .line 2872
    :goto_5a
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 2873
    .line 2874
    .line 2875
    move-result v3

    .line 2876
    if-ge v2, v3, :cond_78

    .line 2877
    .line 2878
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2879
    .line 2880
    .line 2881
    move-result-object v3

    .line 2882
    check-cast v3, LY1/f;

    .line 2883
    .line 2884
    iget-object v7, v3, LY1/f;->a:Ljava/lang/String;

    .line 2885
    .line 2886
    const-string v9, "urn:scte:dash:cc:cea-608:2015"

    .line 2887
    .line 2888
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2889
    .line 2890
    .line 2891
    move-result v7

    .line 2892
    if-eqz v7, :cond_74

    .line 2893
    .line 2894
    iget-object v3, v3, LY1/f;->b:Ljava/lang/String;

    .line 2895
    .line 2896
    if-eqz v3, :cond_74

    .line 2897
    .line 2898
    sget-object v7, LY1/e;->c:Ljava/util/regex/Pattern;

    .line 2899
    .line 2900
    invoke-virtual {v7, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2901
    .line 2902
    .line 2903
    move-result-object v7

    .line 2904
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    .line 2905
    .line 2906
    .line 2907
    move-result v9

    .line 2908
    if-eqz v9, :cond_73

    .line 2909
    .line 2910
    move/from16 v9, v41

    .line 2911
    .line 2912
    invoke-virtual {v7, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 2913
    .line 2914
    .line 2915
    move-result-object v2

    .line 2916
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2917
    .line 2918
    .line 2919
    move-result v2

    .line 2920
    goto :goto_5e

    .line 2921
    :cond_73
    move/from16 v9, v41

    .line 2922
    .line 2923
    const-string v7, "Unable to parse CEA-608 channel number from: "

    .line 2924
    .line 2925
    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2926
    .line 2927
    .line 2928
    move-result-object v3

    .line 2929
    invoke-static {v5, v3}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 2930
    .line 2931
    .line 2932
    goto :goto_5b

    .line 2933
    :cond_74
    move/from16 v9, v41

    .line 2934
    .line 2935
    :goto_5b
    add-int/2addr v2, v9

    .line 2936
    move/from16 v41, v9

    .line 2937
    .line 2938
    goto :goto_5a

    .line 2939
    :cond_75
    const-string v2, "application/cea-708"

    .line 2940
    .line 2941
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2942
    .line 2943
    .line 2944
    move-result v2

    .line 2945
    if-eqz v2, :cond_78

    .line 2946
    .line 2947
    move/from16 v2, v42

    .line 2948
    .line 2949
    :goto_5c
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 2950
    .line 2951
    .line 2952
    move-result v3

    .line 2953
    if-ge v2, v3, :cond_78

    .line 2954
    .line 2955
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2956
    .line 2957
    .line 2958
    move-result-object v3

    .line 2959
    check-cast v3, LY1/f;

    .line 2960
    .line 2961
    iget-object v7, v3, LY1/f;->a:Ljava/lang/String;

    .line 2962
    .line 2963
    const-string v9, "urn:scte:dash:cc:cea-708:2015"

    .line 2964
    .line 2965
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2966
    .line 2967
    .line 2968
    move-result v7

    .line 2969
    if-eqz v7, :cond_77

    .line 2970
    .line 2971
    iget-object v3, v3, LY1/f;->b:Ljava/lang/String;

    .line 2972
    .line 2973
    if-eqz v3, :cond_77

    .line 2974
    .line 2975
    sget-object v7, LY1/e;->d:Ljava/util/regex/Pattern;

    .line 2976
    .line 2977
    invoke-virtual {v7, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 2978
    .line 2979
    .line 2980
    move-result-object v7

    .line 2981
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    .line 2982
    .line 2983
    .line 2984
    move-result v9

    .line 2985
    if-eqz v9, :cond_76

    .line 2986
    .line 2987
    const/4 v9, 0x1

    .line 2988
    invoke-virtual {v7, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 2989
    .line 2990
    .line 2991
    move-result-object v2

    .line 2992
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2993
    .line 2994
    .line 2995
    move-result v2

    .line 2996
    goto :goto_5e

    .line 2997
    :cond_76
    const/4 v9, 0x1

    .line 2998
    const-string v7, "Unable to parse CEA-708 service block number from: "

    .line 2999
    .line 3000
    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 3001
    .line 3002
    .line 3003
    move-result-object v3

    .line 3004
    invoke-static {v5, v3}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 3005
    .line 3006
    .line 3007
    goto :goto_5d

    .line 3008
    :cond_77
    const/4 v9, 0x1

    .line 3009
    :goto_5d
    add-int/2addr v2, v9

    .line 3010
    goto :goto_5c

    .line 3011
    :cond_78
    const/4 v2, -0x1

    .line 3012
    :goto_5e
    iput v2, v6, LN1/m;->G:I

    .line 3013
    .line 3014
    goto :goto_5f

    .line 3015
    :cond_79
    invoke-static {v3}, LN1/C;->j(Ljava/lang/String;)Z

    .line 3016
    .line 3017
    .line 3018
    move-result v2

    .line 3019
    if-eqz v2, :cond_7a

    .line 3020
    .line 3021
    iput v5, v6, LN1/m;->t:I

    .line 3022
    .line 3023
    iput v7, v6, LN1/m;->u:I

    .line 3024
    .line 3025
    :cond_7a
    :goto_5f
    new-instance v2, LN1/n;

    .line 3026
    .line 3027
    invoke-direct {v2, v6}, LN1/n;-><init>(LN1/m;)V

    .line 3028
    .line 3029
    .line 3030
    if-eqz v70, :cond_7b

    .line 3031
    .line 3032
    move-object/from16 v123, v70

    .line 3033
    .line 3034
    goto :goto_60

    .line 3035
    :cond_7b
    new-instance v145, LY1/r;

    .line 3036
    .line 3037
    const-wide/16 v147, 0x1

    .line 3038
    .line 3039
    const-wide/16 v149, 0x0

    .line 3040
    .line 3041
    const/16 v146, 0x0

    .line 3042
    .line 3043
    const-wide/16 v151, 0x0

    .line 3044
    .line 3045
    const-wide/16 v153, 0x0

    .line 3046
    .line 3047
    invoke-direct/range {v145 .. v154}, LY1/r;-><init>(LY1/j;JJJJ)V

    .line 3048
    .line 3049
    .line 3050
    move-object/from16 v123, v145

    .line 3051
    .line 3052
    :goto_60
    new-instance v120, LY1/d;

    .line 3053
    .line 3054
    invoke-virtual/range {v34 .. v34}, Ljava/util/ArrayList;->isEmpty()Z

    .line 3055
    .line 3056
    .line 3057
    move-result v3

    .line 3058
    if-nez v3, :cond_7c

    .line 3059
    .line 3060
    move-object/from16 v122, v34

    .line 3061
    .line 3062
    :goto_61
    move-object/from16 v121, v2

    .line 3063
    .line 3064
    move-object/from16 v125, v10

    .line 3065
    .line 3066
    move-object/from16 v127, v14

    .line 3067
    .line 3068
    goto :goto_62

    .line 3069
    :cond_7c
    move-object/from16 v122, v35

    .line 3070
    .line 3071
    goto :goto_61

    .line 3072
    :goto_62
    invoke-direct/range {v120 .. v128}, LY1/d;-><init>(LN1/n;Ljava/util/ArrayList;LY1/s;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 3073
    .line 3074
    .line 3075
    move-object/from16 v3, v120

    .line 3076
    .line 3077
    move-object/from16 v2, v121

    .line 3078
    .line 3079
    iget-object v2, v2, LN1/n;->n:Ljava/lang/String;

    .line 3080
    .line 3081
    invoke-static {v2}, LN1/C;->h(Ljava/lang/String;)I

    .line 3082
    .line 3083
    .line 3084
    move-result v6

    .line 3085
    move/from16 v14, v84

    .line 3086
    .line 3087
    const/4 v15, -0x1

    .line 3088
    if-ne v14, v15, :cond_7d

    .line 3089
    .line 3090
    :goto_63
    move-object/from16 v10, v95

    .line 3091
    .line 3092
    goto :goto_66

    .line 3093
    :cond_7d
    if-ne v6, v15, :cond_7e

    .line 3094
    .line 3095
    :goto_64
    move v6, v14

    .line 3096
    goto :goto_63

    .line 3097
    :cond_7e
    if-ne v14, v6, :cond_7f

    .line 3098
    .line 3099
    const/4 v2, 0x1

    .line 3100
    goto :goto_65

    .line 3101
    :cond_7f
    move/from16 v2, v42

    .line 3102
    .line 3103
    :goto_65
    invoke-static {v2}, LQ1/k;->g(Z)V

    .line 3104
    .line 3105
    .line 3106
    goto :goto_64

    .line 3107
    :goto_66
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3108
    .line 3109
    .line 3110
    move-object/from16 v85, v1

    .line 3111
    .line 3112
    move-object/from16 v78, v4

    .line 3113
    .line 3114
    move-object/from16 v108, v8

    .line 3115
    .line 3116
    move-object/from16 v95, v10

    .line 3117
    .line 3118
    move-wide/from16 v34, v11

    .line 3119
    .line 3120
    move-object/from16 v1, v65

    .line 3121
    .line 3122
    move-object/from16 v15, v92

    .line 3123
    .line 3124
    :goto_67
    move-object/from16 v8, v107

    .line 3125
    .line 3126
    move-wide/from16 v3, v109

    .line 3127
    .line 3128
    move-object/from16 v13, v136

    .line 3129
    .line 3130
    :goto_68
    move-object/from16 v10, v138

    .line 3131
    .line 3132
    move-object/from16 v2, v140

    .line 3133
    .line 3134
    move-object/from16 v14, v142

    .line 3135
    .line 3136
    goto/16 :goto_28

    .line 3137
    .line 3138
    :cond_80
    move-wide/from16 v143, v5

    .line 3139
    .line 3140
    move-object/from16 v4, v78

    .line 3141
    .line 3142
    move-object/from16 v128, v1

    .line 3143
    .line 3144
    move/from16 v127, v2

    .line 3145
    .line 3146
    move-wide v6, v7

    .line 3147
    move-object/from16 v111, v9

    .line 3148
    .line 3149
    move-object/from16 v125, v10

    .line 3150
    .line 3151
    move-object/from16 v5, v50

    .line 3152
    .line 3153
    move/from16 v99, v71

    .line 3154
    .line 3155
    move-object/from16 v10, v81

    .line 3156
    .line 3157
    move/from16 v123, v84

    .line 3158
    .line 3159
    move-object/from16 v122, v85

    .line 3160
    .line 3161
    move/from16 v2, v91

    .line 3162
    .line 3163
    move-object/from16 v121, v124

    .line 3164
    .line 3165
    move-object/from16 v9, v130

    .line 3166
    .line 3167
    move-object/from16 v8, v131

    .line 3168
    .line 3169
    move-object/from16 v91, v136

    .line 3170
    .line 3171
    move-object/from16 v90, v140

    .line 3172
    .line 3173
    move-object/from16 v71, v142

    .line 3174
    .line 3175
    const/4 v1, 0x0

    .line 3176
    move-wide/from16 v84, v11

    .line 3177
    .line 3178
    move-object/from16 v50, v13

    .line 3179
    .line 3180
    move-object v12, v15

    .line 3181
    move-object/from16 v13, v34

    .line 3182
    .line 3183
    move-object/from16 v15, v35

    .line 3184
    .line 3185
    move-object/from16 v124, v70

    .line 3186
    .line 3187
    move-wide/from16 v130, v88

    .line 3188
    .line 3189
    move-object/from16 v89, v137

    .line 3190
    .line 3191
    move-object/from16 v88, v138

    .line 3192
    .line 3193
    move-object/from16 v70, v141

    .line 3194
    .line 3195
    move-wide/from16 v34, v143

    .line 3196
    .line 3197
    move-object v11, v4

    .line 3198
    move-object/from16 v4, v77

    .line 3199
    .line 3200
    move-wide/from16 v77, v60

    .line 3201
    .line 3202
    move-wide/from16 v155, v109

    .line 3203
    .line 3204
    move-object/from16 v110, v3

    .line 3205
    .line 3206
    move-object/from16 v3, v82

    .line 3207
    .line 3208
    move-wide/from16 v81, v155

    .line 3209
    .line 3210
    move-object/from16 v109, v139

    .line 3211
    .line 3212
    goto/16 :goto_38

    .line 3213
    .line 3214
    :cond_81
    move-object/from16 v139, v1

    .line 3215
    .line 3216
    move-object/from16 v50, v5

    .line 3217
    .line 3218
    move-object v1, v7

    .line 3219
    move-object/from16 v131, v8

    .line 3220
    .line 3221
    move-object/from16 v130, v9

    .line 3222
    .line 3223
    move-object v4, v11

    .line 3224
    move-object/from16 v129, v13

    .line 3225
    .line 3226
    move-object v9, v14

    .line 3227
    move-wide/from16 v143, v34

    .line 3228
    .line 3229
    move-object/from16 v141, v70

    .line 3230
    .line 3231
    move-object/from16 v142, v71

    .line 3232
    .line 3233
    move-wide/from16 v60, v77

    .line 3234
    .line 3235
    move-wide/from16 v109, v81

    .line 3236
    .line 3237
    move-wide/from16 v11, v84

    .line 3238
    .line 3239
    move-object/from16 v138, v88

    .line 3240
    .line 3241
    move-object/from16 v137, v89

    .line 3242
    .line 3243
    move-object/from16 v140, v90

    .line 3244
    .line 3245
    move-object/from16 v136, v91

    .line 3246
    .line 3247
    move-object/from16 v77, v93

    .line 3248
    .line 3249
    move/from16 v118, v94

    .line 3250
    .line 3251
    move-object/from16 v93, v96

    .line 3252
    .line 3253
    move-object/from16 v96, v97

    .line 3254
    .line 3255
    move-object/from16 v112, v98

    .line 3256
    .line 3257
    move-object/from16 v97, v99

    .line 3258
    .line 3259
    move/from16 v91, v2

    .line 3260
    .line 3261
    move v14, v6

    .line 3262
    move-object/from16 v81, v10

    .line 3263
    .line 3264
    move-object/from16 v2, v92

    .line 3265
    .line 3266
    move-object/from16 v10, v95

    .line 3267
    .line 3268
    invoke-static {v0, v2}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 3269
    .line 3270
    .line 3271
    move-result v3

    .line 3272
    if-eqz v3, :cond_82

    .line 3273
    .line 3274
    move-object/from16 v3, v100

    .line 3275
    .line 3276
    check-cast v3, LY1/r;

    .line 3277
    .line 3278
    invoke-static {v0, v3}, LY1/e;->o(Lorg/xmlpull/v1/XmlPullParser;LY1/r;)LY1/r;

    .line 3279
    .line 3280
    .line 3281
    move-result-object v100

    .line 3282
    move-object/from16 v85, v1

    .line 3283
    .line 3284
    move-object v15, v2

    .line 3285
    move-object/from16 v78, v4

    .line 3286
    .line 3287
    move-object/from16 v95, v10

    .line 3288
    .line 3289
    move-wide/from16 v34, v11

    .line 3290
    .line 3291
    move v6, v14

    .line 3292
    move-object/from16 v1, v65

    .line 3293
    .line 3294
    goto/16 :goto_67

    .line 3295
    .line 3296
    :cond_82
    move-object/from16 v13, v136

    .line 3297
    .line 3298
    invoke-static {v0, v13}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 3299
    .line 3300
    .line 3301
    move-result v3

    .line 3302
    if-eqz v3, :cond_83

    .line 3303
    .line 3304
    move-wide/from16 v5, v101

    .line 3305
    .line 3306
    invoke-static {v0, v5, v6}, LY1/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 3307
    .line 3308
    .line 3309
    move-result-wide v8

    .line 3310
    check-cast v100, LY1/o;

    .line 3311
    .line 3312
    move-object/from16 v85, v1

    .line 3313
    .line 3314
    move-object v15, v2

    .line 3315
    move-object/from16 v78, v4

    .line 3316
    .line 3317
    move-object/from16 v95, v10

    .line 3318
    .line 3319
    move-wide v10, v11

    .line 3320
    move-object/from16 v1, v100

    .line 3321
    .line 3322
    move-wide/from16 v6, v105

    .line 3323
    .line 3324
    move-wide/from16 v2, v109

    .line 3325
    .line 3326
    move-wide/from16 v4, v143

    .line 3327
    .line 3328
    invoke-static/range {v0 .. v11}, LY1/e;->p(Lorg/xmlpull/v1/XmlPullParser;LY1/o;JJJJJ)LY1/o;

    .line 3329
    .line 3330
    .line 3331
    move-result-object v100

    .line 3332
    move-wide v11, v10

    .line 3333
    move-wide v3, v2

    .line 3334
    move-wide/from16 v101, v8

    .line 3335
    .line 3336
    move-wide/from16 v34, v11

    .line 3337
    .line 3338
    move v6, v14

    .line 3339
    move-object/from16 v1, v65

    .line 3340
    .line 3341
    move-object/from16 v8, v107

    .line 3342
    .line 3343
    goto/16 :goto_68

    .line 3344
    .line 3345
    :cond_83
    move-object/from16 v85, v1

    .line 3346
    .line 3347
    move-object v15, v2

    .line 3348
    move-object/from16 v78, v4

    .line 3349
    .line 3350
    move-object/from16 v95, v10

    .line 3351
    .line 3352
    move-wide/from16 v5, v101

    .line 3353
    .line 3354
    move-wide/from16 v3, v109

    .line 3355
    .line 3356
    move-object/from16 v1, v142

    .line 3357
    .line 3358
    invoke-static {v0, v1}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 3359
    .line 3360
    .line 3361
    move-result v2

    .line 3362
    if-eqz v2, :cond_84

    .line 3363
    .line 3364
    invoke-static {v0, v5, v6}, LY1/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 3365
    .line 3366
    .line 3367
    move-result-wide v9

    .line 3368
    check-cast v100, LY1/p;

    .line 3369
    .line 3370
    move/from16 v123, v14

    .line 3371
    .line 3372
    move-object/from16 v2, v81

    .line 3373
    .line 3374
    move-wide/from16 v7, v105

    .line 3375
    .line 3376
    move-wide/from16 v5, v143

    .line 3377
    .line 3378
    move-object v14, v1

    .line 3379
    move-object/from16 v1, v100

    .line 3380
    .line 3381
    invoke-static/range {v0 .. v12}, LY1/e;->q(Lorg/xmlpull/v1/XmlPullParser;LY1/p;Ljava/util/List;JJJJJ)LY1/p;

    .line 3382
    .line 3383
    .line 3384
    move-result-object v100

    .line 3385
    move-wide/from16 v101, v9

    .line 3386
    .line 3387
    move-wide/from16 v34, v11

    .line 3388
    .line 3389
    move-object/from16 v1, v65

    .line 3390
    .line 3391
    move-object/from16 v8, v107

    .line 3392
    .line 3393
    move/from16 v6, v123

    .line 3394
    .line 3395
    move-object/from16 v10, v138

    .line 3396
    .line 3397
    move-object/from16 v2, v140

    .line 3398
    .line 3399
    goto/16 :goto_28

    .line 3400
    .line 3401
    :cond_84
    move/from16 v123, v14

    .line 3402
    .line 3403
    move-object v14, v1

    .line 3404
    invoke-static {v0, v9}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 3405
    .line 3406
    .line 3407
    move-result v1

    .line 3408
    if-eqz v1, :cond_85

    .line 3409
    .line 3410
    invoke-static {v0, v9}, LY1/e;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LY1/f;

    .line 3411
    .line 3412
    .line 3413
    move-result-object v1

    .line 3414
    move-object/from16 v2, v140

    .line 3415
    .line 3416
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3417
    .line 3418
    .line 3419
    move-wide/from16 v34, v11

    .line 3420
    .line 3421
    move-object/from16 v8, v107

    .line 3422
    .line 3423
    move-object/from16 v10, v138

    .line 3424
    .line 3425
    const/4 v7, 0x2

    .line 3426
    const/4 v12, 0x4

    .line 3427
    goto :goto_6b

    .line 3428
    :cond_85
    move-object/from16 v2, v140

    .line 3429
    .line 3430
    const-string v1, "Label"

    .line 3431
    .line 3432
    invoke-static {v0, v1}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 3433
    .line 3434
    .line 3435
    move-result v7

    .line 3436
    if-eqz v7, :cond_88

    .line 3437
    .line 3438
    move-object/from16 v8, v107

    .line 3439
    .line 3440
    const/4 v7, 0x0

    .line 3441
    invoke-interface {v0, v7, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3442
    .line 3443
    .line 3444
    move-result-object v9

    .line 3445
    move-object/from16 v7, v66

    .line 3446
    .line 3447
    :goto_69
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 3448
    .line 3449
    .line 3450
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 3451
    .line 3452
    .line 3453
    move-result v10

    .line 3454
    move-wide/from16 v34, v11

    .line 3455
    .line 3456
    const/4 v12, 0x4

    .line 3457
    if-ne v10, v12, :cond_86

    .line 3458
    .line 3459
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 3460
    .line 3461
    .line 3462
    move-result-object v7

    .line 3463
    goto :goto_6a

    .line 3464
    :cond_86
    invoke-static {v0}, LY1/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 3465
    .line 3466
    .line 3467
    :goto_6a
    invoke-static {v0, v1}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 3468
    .line 3469
    .line 3470
    move-result v10

    .line 3471
    if-eqz v10, :cond_87

    .line 3472
    .line 3473
    new-instance v1, LN1/o;

    .line 3474
    .line 3475
    invoke-direct {v1, v9, v7}, LN1/o;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 3476
    .line 3477
    .line 3478
    move-object/from16 v10, v138

    .line 3479
    .line 3480
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3481
    .line 3482
    .line 3483
    goto/16 :goto_2e

    .line 3484
    .line 3485
    :cond_87
    move-wide/from16 v11, v34

    .line 3486
    .line 3487
    goto :goto_69

    .line 3488
    :cond_88
    move-wide/from16 v34, v11

    .line 3489
    .line 3490
    move-object/from16 v8, v107

    .line 3491
    .line 3492
    move-object/from16 v10, v138

    .line 3493
    .line 3494
    const/4 v12, 0x4

    .line 3495
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 3496
    .line 3497
    .line 3498
    move-result v1

    .line 3499
    const/4 v7, 0x2

    .line 3500
    if-ne v1, v7, :cond_89

    .line 3501
    .line 3502
    invoke-static {v0}, LY1/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 3503
    .line 3504
    .line 3505
    :cond_89
    :goto_6b
    move-wide/from16 v101, v5

    .line 3506
    .line 3507
    move-object/from16 v1, v65

    .line 3508
    .line 3509
    move/from16 v6, v123

    .line 3510
    .line 3511
    :goto_6c
    invoke-static {v0, v1}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 3512
    .line 3513
    .line 3514
    move-result v5

    .line 3515
    if-eqz v5, :cond_9c

    .line 3516
    .line 3517
    new-instance v1, Ljava/util/ArrayList;

    .line 3518
    .line 3519
    invoke-virtual/range {v95 .. v95}, Ljava/util/ArrayList;->size()I

    .line 3520
    .line 3521
    .line 3522
    move-result v5

    .line 3523
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 3524
    .line 3525
    .line 3526
    move/from16 v5, v42

    .line 3527
    .line 3528
    :goto_6d
    invoke-virtual/range {v95 .. v95}, Ljava/util/ArrayList;->size()I

    .line 3529
    .line 3530
    .line 3531
    move-result v9

    .line 3532
    if-ge v5, v9, :cond_9b

    .line 3533
    .line 3534
    move-object/from16 v9, v95

    .line 3535
    .line 3536
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3537
    .line 3538
    .line 3539
    move-result-object v11

    .line 3540
    check-cast v11, LY1/d;

    .line 3541
    .line 3542
    iget-object v13, v11, LY1/d;->a:LN1/n;

    .line 3543
    .line 3544
    invoke-virtual {v13}, LN1/n;->a()LN1/m;

    .line 3545
    .line 3546
    .line 3547
    move-result-object v13

    .line 3548
    move-object/from16 v14, v137

    .line 3549
    .line 3550
    if-eqz v14, :cond_8a

    .line 3551
    .line 3552
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 3553
    .line 3554
    .line 3555
    move-result v15

    .line 3556
    if-eqz v15, :cond_8a

    .line 3557
    .line 3558
    iput-object v14, v13, LN1/m;->b:Ljava/lang/String;

    .line 3559
    .line 3560
    goto :goto_6e

    .line 3561
    :cond_8a
    invoke-static {v10}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 3562
    .line 3563
    .line 3564
    move-result-object v15

    .line 3565
    iput-object v15, v13, LN1/m;->c:Ll8/K;

    .line 3566
    .line 3567
    :goto_6e
    iget-object v15, v11, LY1/d;->d:Ljava/lang/String;

    .line 3568
    .line 3569
    if-nez v15, :cond_8b

    .line 3570
    .line 3571
    move-object/from16 v15, v87

    .line 3572
    .line 3573
    :cond_8b
    iget-object v7, v11, LY1/d;->e:Ljava/util/ArrayList;

    .line 3574
    .line 3575
    move-object/from16 v12, v139

    .line 3576
    .line 3577
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 3578
    .line 3579
    .line 3580
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 3581
    .line 3582
    .line 3583
    move-result v50

    .line 3584
    move-wide/from16 v109, v3

    .line 3585
    .line 3586
    if-nez v50, :cond_98

    .line 3587
    .line 3588
    move/from16 v3, v42

    .line 3589
    .line 3590
    :goto_6f
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 3591
    .line 3592
    .line 3593
    move-result v4

    .line 3594
    if-ge v3, v4, :cond_8d

    .line 3595
    .line 3596
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3597
    .line 3598
    .line 3599
    move-result-object v4

    .line 3600
    check-cast v4, LN1/i;

    .line 3601
    .line 3602
    move/from16 v50, v5

    .line 3603
    .line 3604
    sget-object v5, LN1/e;->c:Ljava/util/UUID;

    .line 3605
    .line 3606
    move/from16 v65, v6

    .line 3607
    .line 3608
    iget-object v6, v4, LN1/i;->b:Ljava/util/UUID;

    .line 3609
    .line 3610
    invoke-virtual {v5, v6}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 3611
    .line 3612
    .line 3613
    move-result v5

    .line 3614
    if-eqz v5, :cond_8c

    .line 3615
    .line 3616
    iget-object v4, v4, LN1/i;->c:Ljava/lang/String;

    .line 3617
    .line 3618
    if-eqz v4, :cond_8c

    .line 3619
    .line 3620
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 3621
    .line 3622
    .line 3623
    goto :goto_70

    .line 3624
    :cond_8c
    const/16 v41, 0x1

    .line 3625
    .line 3626
    add-int/lit8 v3, v3, 0x1

    .line 3627
    .line 3628
    move/from16 v5, v50

    .line 3629
    .line 3630
    move/from16 v6, v65

    .line 3631
    .line 3632
    goto :goto_6f

    .line 3633
    :cond_8d
    move/from16 v50, v5

    .line 3634
    .line 3635
    move/from16 v65, v6

    .line 3636
    .line 3637
    const/4 v4, 0x0

    .line 3638
    :goto_70
    if-nez v4, :cond_8f

    .line 3639
    .line 3640
    :cond_8e
    move-object/from16 v107, v8

    .line 3641
    .line 3642
    move-object/from16 v95, v9

    .line 3643
    .line 3644
    const/16 v41, 0x1

    .line 3645
    .line 3646
    goto :goto_74

    .line 3647
    :cond_8f
    move/from16 v3, v42

    .line 3648
    .line 3649
    :goto_71
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 3650
    .line 3651
    .line 3652
    move-result v5

    .line 3653
    if-ge v3, v5, :cond_8e

    .line 3654
    .line 3655
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3656
    .line 3657
    .line 3658
    move-result-object v5

    .line 3659
    check-cast v5, LN1/i;

    .line 3660
    .line 3661
    sget-object v6, LN1/e;->b:Ljava/util/UUID;

    .line 3662
    .line 3663
    move-object/from16 v107, v8

    .line 3664
    .line 3665
    iget-object v8, v5, LN1/i;->b:Ljava/util/UUID;

    .line 3666
    .line 3667
    invoke-virtual {v6, v8}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 3668
    .line 3669
    .line 3670
    move-result v6

    .line 3671
    if-eqz v6, :cond_90

    .line 3672
    .line 3673
    iget-object v6, v5, LN1/i;->c:Ljava/lang/String;

    .line 3674
    .line 3675
    if-nez v6, :cond_90

    .line 3676
    .line 3677
    new-instance v6, LN1/i;

    .line 3678
    .line 3679
    sget-object v8, LN1/e;->c:Ljava/util/UUID;

    .line 3680
    .line 3681
    move-object/from16 v95, v9

    .line 3682
    .line 3683
    iget-object v9, v5, LN1/i;->d:Ljava/lang/String;

    .line 3684
    .line 3685
    iget-object v5, v5, LN1/i;->e:[B

    .line 3686
    .line 3687
    invoke-direct {v6, v8, v4, v9, v5}, LN1/i;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 3688
    .line 3689
    .line 3690
    invoke-virtual {v7, v3, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 3691
    .line 3692
    .line 3693
    :goto_72
    const/16 v41, 0x1

    .line 3694
    .line 3695
    goto :goto_73

    .line 3696
    :cond_90
    move-object/from16 v95, v9

    .line 3697
    .line 3698
    goto :goto_72

    .line 3699
    :goto_73
    add-int/lit8 v3, v3, 0x1

    .line 3700
    .line 3701
    move-object/from16 v9, v95

    .line 3702
    .line 3703
    move-object/from16 v8, v107

    .line 3704
    .line 3705
    goto :goto_71

    .line 3706
    :goto_74
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 3707
    .line 3708
    .line 3709
    move-result v3

    .line 3710
    add-int/lit8 v3, v3, -0x1

    .line 3711
    .line 3712
    :goto_75
    if-ltz v3, :cond_97

    .line 3713
    .line 3714
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3715
    .line 3716
    .line 3717
    move-result-object v4

    .line 3718
    check-cast v4, LN1/i;

    .line 3719
    .line 3720
    iget-object v5, v4, LN1/i;->e:[B

    .line 3721
    .line 3722
    if-eqz v5, :cond_92

    .line 3723
    .line 3724
    :cond_91
    :goto_76
    const/16 v43, -0x1

    .line 3725
    .line 3726
    goto :goto_7b

    .line 3727
    :cond_92
    move/from16 v5, v42

    .line 3728
    .line 3729
    :goto_77
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 3730
    .line 3731
    .line 3732
    move-result v6

    .line 3733
    if-ge v5, v6, :cond_91

    .line 3734
    .line 3735
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3736
    .line 3737
    .line 3738
    move-result-object v6

    .line 3739
    check-cast v6, LN1/i;

    .line 3740
    .line 3741
    iget-object v8, v6, LN1/i;->e:[B

    .line 3742
    .line 3743
    if-eqz v8, :cond_93

    .line 3744
    .line 3745
    iget-object v8, v4, LN1/i;->e:[B

    .line 3746
    .line 3747
    if-eqz v8, :cond_94

    .line 3748
    .line 3749
    :cond_93
    const/16 v41, 0x1

    .line 3750
    .line 3751
    goto :goto_7a

    .line 3752
    :cond_94
    iget-object v8, v4, LN1/i;->b:Ljava/util/UUID;

    .line 3753
    .line 3754
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3755
    .line 3756
    .line 3757
    sget-object v9, LN1/e;->a:Ljava/util/UUID;

    .line 3758
    .line 3759
    iget-object v6, v6, LN1/i;->b:Ljava/util/UUID;

    .line 3760
    .line 3761
    invoke-virtual {v9, v6}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 3762
    .line 3763
    .line 3764
    move-result v9

    .line 3765
    if-nez v9, :cond_96

    .line 3766
    .line 3767
    invoke-virtual {v8, v6}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 3768
    .line 3769
    .line 3770
    move-result v6

    .line 3771
    if-eqz v6, :cond_95

    .line 3772
    .line 3773
    goto :goto_78

    .line 3774
    :cond_95
    move/from16 v6, v42

    .line 3775
    .line 3776
    goto :goto_79

    .line 3777
    :cond_96
    :goto_78
    const/4 v6, 0x1

    .line 3778
    :goto_79
    if-eqz v6, :cond_93

    .line 3779
    .line 3780
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 3781
    .line 3782
    .line 3783
    goto :goto_76

    .line 3784
    :goto_7a
    add-int/lit8 v5, v5, 0x1

    .line 3785
    .line 3786
    goto :goto_77

    .line 3787
    :goto_7b
    add-int/lit8 v3, v3, -0x1

    .line 3788
    .line 3789
    goto :goto_75

    .line 3790
    :cond_97
    const/16 v43, -0x1

    .line 3791
    .line 3792
    new-instance v3, LN1/j;

    .line 3793
    .line 3794
    invoke-direct {v3, v15, v7}, LN1/j;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 3795
    .line 3796
    .line 3797
    iput-object v3, v13, LN1/m;->q:LN1/j;

    .line 3798
    .line 3799
    goto :goto_7c

    .line 3800
    :cond_98
    move/from16 v50, v5

    .line 3801
    .line 3802
    move/from16 v65, v6

    .line 3803
    .line 3804
    move-object/from16 v107, v8

    .line 3805
    .line 3806
    move-object/from16 v95, v9

    .line 3807
    .line 3808
    const/16 v43, -0x1

    .line 3809
    .line 3810
    :goto_7c
    iget-object v3, v11, LY1/d;->f:Ljava/util/ArrayList;

    .line 3811
    .line 3812
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 3813
    .line 3814
    .line 3815
    new-instance v4, LN1/n;

    .line 3816
    .line 3817
    invoke-direct {v4, v13}, LN1/n;-><init>(LN1/m;)V

    .line 3818
    .line 3819
    .line 3820
    iget-object v5, v11, LY1/d;->c:LY1/s;

    .line 3821
    .line 3822
    instance-of v6, v5, LY1/r;

    .line 3823
    .line 3824
    iget-object v7, v11, LY1/d;->g:Ljava/util/ArrayList;

    .line 3825
    .line 3826
    iget-object v8, v11, LY1/d;->h:Ljava/util/ArrayList;

    .line 3827
    .line 3828
    iget-object v9, v11, LY1/d;->b:Ll8/K;

    .line 3829
    .line 3830
    if-eqz v6, :cond_99

    .line 3831
    .line 3832
    new-instance v96, LY1/l;

    .line 3833
    .line 3834
    move-object/from16 v99, v5

    .line 3835
    .line 3836
    check-cast v99, LY1/r;

    .line 3837
    .line 3838
    move-object/from16 v100, v3

    .line 3839
    .line 3840
    move-object/from16 v97, v4

    .line 3841
    .line 3842
    move-object/from16 v101, v7

    .line 3843
    .line 3844
    move-object/from16 v102, v8

    .line 3845
    .line 3846
    move-object/from16 v98, v9

    .line 3847
    .line 3848
    invoke-direct/range {v96 .. v102}, LY1/l;-><init>(LN1/n;Ll8/K;LY1/r;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 3849
    .line 3850
    .line 3851
    :goto_7d
    move-object/from16 v3, v96

    .line 3852
    .line 3853
    goto :goto_7e

    .line 3854
    :cond_99
    move-object/from16 v100, v3

    .line 3855
    .line 3856
    move-object/from16 v97, v4

    .line 3857
    .line 3858
    move-object/from16 v101, v7

    .line 3859
    .line 3860
    move-object/from16 v102, v8

    .line 3861
    .line 3862
    move-object/from16 v98, v9

    .line 3863
    .line 3864
    instance-of v3, v5, LY1/n;

    .line 3865
    .line 3866
    if-eqz v3, :cond_9a

    .line 3867
    .line 3868
    new-instance v96, LY1/k;

    .line 3869
    .line 3870
    move-object/from16 v99, v5

    .line 3871
    .line 3872
    check-cast v99, LY1/n;

    .line 3873
    .line 3874
    invoke-direct/range {v96 .. v102}, LY1/k;-><init>(LN1/n;Ll8/K;LY1/n;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 3875
    .line 3876
    .line 3877
    goto :goto_7d

    .line 3878
    :goto_7e
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3879
    .line 3880
    .line 3881
    const/16 v41, 0x1

    .line 3882
    .line 3883
    add-int/lit8 v5, v50, 0x1

    .line 3884
    .line 3885
    move-object/from16 v139, v12

    .line 3886
    .line 3887
    move-object/from16 v137, v14

    .line 3888
    .line 3889
    move/from16 v6, v65

    .line 3890
    .line 3891
    move-object/from16 v8, v107

    .line 3892
    .line 3893
    move-wide/from16 v3, v109

    .line 3894
    .line 3895
    const/4 v7, 0x2

    .line 3896
    const/4 v12, 0x4

    .line 3897
    goto/16 :goto_6d

    .line 3898
    .line 3899
    :cond_9a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 3900
    .line 3901
    const-string v1, "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"

    .line 3902
    .line 3903
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 3904
    .line 3905
    .line 3906
    throw v0

    .line 3907
    :cond_9b
    move-wide/from16 v109, v3

    .line 3908
    .line 3909
    move/from16 v65, v6

    .line 3910
    .line 3911
    move-object/from16 v107, v8

    .line 3912
    .line 3913
    const/16 v43, -0x1

    .line 3914
    .line 3915
    new-instance v74, LY1/a;

    .line 3916
    .line 3917
    move/from16 v77, v65

    .line 3918
    .line 3919
    move-object/from16 v79, v78

    .line 3920
    .line 3921
    move-object/from16 v80, v129

    .line 3922
    .line 3923
    move-object/from16 v78, v1

    .line 3924
    .line 3925
    invoke-direct/range {v74 .. v81}, LY1/a;-><init>(JILjava/util/ArrayList;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 3926
    .line 3927
    .line 3928
    move-object/from16 v1, v74

    .line 3929
    .line 3930
    move-object/from16 v3, v69

    .line 3931
    .line 3932
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3933
    .line 3934
    .line 3935
    move-object/from16 v69, v3

    .line 3936
    .line 3937
    move-wide/from16 v11, v34

    .line 3938
    .line 3939
    move-object/from16 v13, v49

    .line 3940
    .line 3941
    move-object/from16 v50, v57

    .line 3942
    .line 3943
    move-wide/from16 v7, v60

    .line 3944
    .line 3945
    move-wide/from16 v3, v109

    .line 3946
    .line 3947
    move-object/from16 v70, v141

    .line 3948
    .line 3949
    move-wide/from16 v5, v143

    .line 3950
    .line 3951
    const/16 v16, 0x4

    .line 3952
    .line 3953
    const/16 v33, 0x2

    .line 3954
    .line 3955
    const-wide v34, -0x7fffffffffffffffL    # -4.9E-324

    .line 3956
    .line 3957
    .line 3958
    .line 3959
    .line 3960
    const/16 v41, 0x1

    .line 3961
    .line 3962
    move-object/from16 v49, v45

    .line 3963
    .line 3964
    goto/16 :goto_93

    .line 3965
    .line 3966
    :cond_9c
    move/from16 v65, v6

    .line 3967
    .line 3968
    const/16 v43, -0x1

    .line 3969
    .line 3970
    move-object/from16 v90, v2

    .line 3971
    .line 3972
    move-object/from16 v88, v10

    .line 3973
    .line 3974
    move-object/from16 v71, v14

    .line 3975
    .line 3976
    move-object/from16 v92, v15

    .line 3977
    .line 3978
    move-object/from16 v5, v50

    .line 3979
    .line 3980
    move-object/from16 v11, v78

    .line 3981
    .line 3982
    move-object/from16 v10, v81

    .line 3983
    .line 3984
    move-object/from16 v7, v85

    .line 3985
    .line 3986
    move/from16 v2, v91

    .line 3987
    .line 3988
    move-object/from16 v99, v97

    .line 3989
    .line 3990
    move-object/from16 v12, v104

    .line 3991
    .line 3992
    move-object/from16 v14, v108

    .line 3993
    .line 3994
    move-object/from16 v98, v112

    .line 3995
    .line 3996
    move/from16 v94, v118

    .line 3997
    .line 3998
    move-object/from16 v9, v130

    .line 3999
    .line 4000
    move-object/from16 v89, v137

    .line 4001
    .line 4002
    move-object/from16 v70, v141

    .line 4003
    .line 4004
    move-object/from16 v65, v1

    .line 4005
    .line 4006
    move-wide/from16 v81, v3

    .line 4007
    .line 4008
    move-object v15, v8

    .line 4009
    move-object/from16 v91, v13

    .line 4010
    .line 4011
    move-wide/from16 v84, v34

    .line 4012
    .line 4013
    move-object/from16 v97, v96

    .line 4014
    .line 4015
    move-wide/from16 v3, v105

    .line 4016
    .line 4017
    move-object/from16 v13, v129

    .line 4018
    .line 4019
    move-object/from16 v8, v131

    .line 4020
    .line 4021
    move-object/from16 v1, v139

    .line 4022
    .line 4023
    move-wide/from16 v34, v143

    .line 4024
    .line 4025
    move-object/from16 v96, v93

    .line 4026
    .line 4027
    move-object/from16 v93, v77

    .line 4028
    .line 4029
    move-wide/from16 v77, v60

    .line 4030
    .line 4031
    goto/16 :goto_27

    .line 4032
    .line 4033
    :cond_9d
    move/from16 v91, v2

    .line 4034
    .line 4035
    move-object/from16 v73, v3

    .line 4036
    .line 4037
    move-object/from16 v112, v4

    .line 4038
    .line 4039
    move-wide/from16 v60, v5

    .line 4040
    .line 4041
    move-wide/from16 v109, v7

    .line 4042
    .line 4043
    move-object/from16 v130, v9

    .line 4044
    .line 4045
    move-object/from16 v107, v15

    .line 4046
    .line 4047
    move-wide/from16 v143, v34

    .line 4048
    .line 4049
    move-object/from16 v3, v69

    .line 4050
    .line 4051
    move-object/from16 v141, v70

    .line 4052
    .line 4053
    const/16 v43, -0x1

    .line 4054
    .line 4055
    move-wide/from16 v34, v10

    .line 4056
    .line 4057
    move-object v15, v13

    .line 4058
    move-object v13, v14

    .line 4059
    move-object v14, v12

    .line 4060
    const-string v1, "EventStream"

    .line 4061
    .line 4062
    invoke-static {v0, v1}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 4063
    .line 4064
    .line 4065
    move-result v2

    .line 4066
    if-eqz v2, :cond_ac

    .line 4067
    .line 4068
    move-object/from16 v12, v49

    .line 4069
    .line 4070
    const/4 v7, 0x0

    .line 4071
    invoke-interface {v0, v7, v12}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4072
    .line 4073
    .line 4074
    move-result-object v2

    .line 4075
    if-nez v2, :cond_9e

    .line 4076
    .line 4077
    move-object/from16 v75, v66

    .line 4078
    .line 4079
    :goto_7f
    move-object/from16 v2, v141

    .line 4080
    .line 4081
    goto :goto_80

    .line 4082
    :cond_9e
    move-object/from16 v75, v2

    .line 4083
    .line 4084
    goto :goto_7f

    .line 4085
    :goto_80
    invoke-interface {v0, v7, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4086
    .line 4087
    .line 4088
    move-result-object v4

    .line 4089
    if-nez v4, :cond_9f

    .line 4090
    .line 4091
    move-object/from16 v76, v66

    .line 4092
    .line 4093
    goto :goto_81

    .line 4094
    :cond_9f
    move-object/from16 v76, v4

    .line 4095
    .line 4096
    :goto_81
    const-string v4, "timescale"

    .line 4097
    .line 4098
    invoke-interface {v0, v7, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4099
    .line 4100
    .line 4101
    move-result-object v4

    .line 4102
    if-nez v4, :cond_a0

    .line 4103
    .line 4104
    const-wide/16 v4, 0x1

    .line 4105
    .line 4106
    :goto_82
    move-wide/from16 v81, v4

    .line 4107
    .line 4108
    goto :goto_83

    .line 4109
    :cond_a0
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 4110
    .line 4111
    .line 4112
    move-result-wide v4

    .line 4113
    goto :goto_82

    .line 4114
    :goto_83
    const-string v4, "presentationTimeOffset"

    .line 4115
    .line 4116
    invoke-interface {v0, v7, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4117
    .line 4118
    .line 4119
    move-result-object v4

    .line 4120
    if-nez v4, :cond_a1

    .line 4121
    .line 4122
    move-wide/from16 v4, v26

    .line 4123
    .line 4124
    goto :goto_84

    .line 4125
    :cond_a1
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 4126
    .line 4127
    .line 4128
    move-result-wide v4

    .line 4129
    :goto_84
    new-instance v6, Ljava/util/ArrayList;

    .line 4130
    .line 4131
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 4132
    .line 4133
    .line 4134
    new-instance v7, Ljava/io/ByteArrayOutputStream;

    .line 4135
    .line 4136
    const/16 v8, 0x200

    .line 4137
    .line 4138
    invoke-direct {v7, v8}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 4139
    .line 4140
    .line 4141
    :goto_85
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 4142
    .line 4143
    .line 4144
    const-string v8, "Event"

    .line 4145
    .line 4146
    invoke-static {v0, v8}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 4147
    .line 4148
    .line 4149
    move-result v9

    .line 4150
    if-eqz v9, :cond_a9

    .line 4151
    .line 4152
    move-object/from16 v9, v112

    .line 4153
    .line 4154
    const/4 v13, 0x0

    .line 4155
    invoke-interface {v0, v13, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4156
    .line 4157
    .line 4158
    move-result-object v10

    .line 4159
    if-nez v10, :cond_a2

    .line 4160
    .line 4161
    move-wide/from16 v10, v26

    .line 4162
    .line 4163
    :goto_86
    move-object/from16 v14, v45

    .line 4164
    .line 4165
    goto :goto_87

    .line 4166
    :cond_a2
    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 4167
    .line 4168
    .line 4169
    move-result-wide v10

    .line 4170
    goto :goto_86

    .line 4171
    :goto_87
    invoke-interface {v0, v13, v14}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4172
    .line 4173
    .line 4174
    move-result-object v15

    .line 4175
    if-nez v15, :cond_a3

    .line 4176
    .line 4177
    const-wide v77, -0x7fffffffffffffffL    # -4.9E-324

    .line 4178
    .line 4179
    .line 4180
    .line 4181
    .line 4182
    goto :goto_88

    .line 4183
    :cond_a3
    invoke-static {v15}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 4184
    .line 4185
    .line 4186
    move-result-wide v49

    .line 4187
    move-wide/from16 v77, v49

    .line 4188
    .line 4189
    :goto_88
    const-string v15, "presentationTime"

    .line 4190
    .line 4191
    invoke-interface {v0, v13, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4192
    .line 4193
    .line 4194
    move-result-object v15

    .line 4195
    if-nez v15, :cond_a4

    .line 4196
    .line 4197
    move-wide/from16 v49, v26

    .line 4198
    .line 4199
    goto :goto_89

    .line 4200
    :cond_a4
    invoke-static {v15}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 4201
    .line 4202
    .line 4203
    move-result-wide v49

    .line 4204
    :goto_89
    sget v13, LQ1/x;->a:I

    .line 4205
    .line 4206
    sget-object v83, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 4207
    .line 4208
    const-wide/16 v79, 0x3e8

    .line 4209
    .line 4210
    invoke-static/range {v77 .. v83}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 4211
    .line 4212
    .line 4213
    move-result-wide v65

    .line 4214
    sub-long v77, v49, v4

    .line 4215
    .line 4216
    const-wide/32 v79, 0xf4240

    .line 4217
    .line 4218
    .line 4219
    invoke-static/range {v77 .. v83}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 4220
    .line 4221
    .line 4222
    move-result-wide v49

    .line 4223
    move-wide/from16 v68, v81

    .line 4224
    .line 4225
    const-string v13, "messageData"

    .line 4226
    .line 4227
    const/4 v15, 0x0

    .line 4228
    invoke-interface {v0, v15, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4229
    .line 4230
    .line 4231
    move-result-object v13

    .line 4232
    if-nez v13, :cond_a5

    .line 4233
    .line 4234
    const/4 v13, 0x0

    .line 4235
    :cond_a5
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 4236
    .line 4237
    .line 4238
    invoke-static {}, Landroid/util/Xml;->newSerializer()Lorg/xmlpull/v1/XmlSerializer;

    .line 4239
    .line 4240
    .line 4241
    move-result-object v15

    .line 4242
    sget-object v45, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 4243
    .line 4244
    move-object/from16 v70, v2

    .line 4245
    .line 4246
    invoke-virtual/range {v45 .. v45}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 4247
    .line 4248
    .line 4249
    move-result-object v2

    .line 4250
    invoke-interface {v15, v7, v2}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 4251
    .line 4252
    .line 4253
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextToken()I

    .line 4254
    .line 4255
    .line 4256
    :goto_8a
    invoke-static {v0, v8}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 4257
    .line 4258
    .line 4259
    move-result v2

    .line 4260
    if-nez v2, :cond_a7

    .line 4261
    .line 4262
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 4263
    .line 4264
    .line 4265
    move-result v2

    .line 4266
    packed-switch v2, :pswitch_data_2

    .line 4267
    .line 4268
    .line 4269
    :goto_8b
    move-object/from16 v45, v3

    .line 4270
    .line 4271
    :cond_a6
    :goto_8c
    move-wide/from16 v71, v4

    .line 4272
    .line 4273
    goto/16 :goto_8e

    .line 4274
    .line 4275
    :pswitch_b
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 4276
    .line 4277
    .line 4278
    move-result-object v2

    .line 4279
    invoke-interface {v15, v2}, Lorg/xmlpull/v1/XmlSerializer;->docdecl(Ljava/lang/String;)V

    .line 4280
    .line 4281
    .line 4282
    goto :goto_8b

    .line 4283
    :pswitch_c
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 4284
    .line 4285
    .line 4286
    move-result-object v2

    .line 4287
    invoke-interface {v15, v2}, Lorg/xmlpull/v1/XmlSerializer;->comment(Ljava/lang/String;)V

    .line 4288
    .line 4289
    .line 4290
    goto :goto_8b

    .line 4291
    :pswitch_d
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 4292
    .line 4293
    .line 4294
    move-result-object v2

    .line 4295
    invoke-interface {v15, v2}, Lorg/xmlpull/v1/XmlSerializer;->processingInstruction(Ljava/lang/String;)V

    .line 4296
    .line 4297
    .line 4298
    goto :goto_8b

    .line 4299
    :pswitch_e
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 4300
    .line 4301
    .line 4302
    move-result-object v2

    .line 4303
    invoke-interface {v15, v2}, Lorg/xmlpull/v1/XmlSerializer;->ignorableWhitespace(Ljava/lang/String;)V

    .line 4304
    .line 4305
    .line 4306
    goto :goto_8b

    .line 4307
    :pswitch_f
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 4308
    .line 4309
    .line 4310
    move-result-object v2

    .line 4311
    invoke-interface {v15, v2}, Lorg/xmlpull/v1/XmlSerializer;->entityRef(Ljava/lang/String;)V

    .line 4312
    .line 4313
    .line 4314
    goto :goto_8b

    .line 4315
    :pswitch_10
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 4316
    .line 4317
    .line 4318
    move-result-object v2

    .line 4319
    invoke-interface {v15, v2}, Lorg/xmlpull/v1/XmlSerializer;->cdsect(Ljava/lang/String;)V

    .line 4320
    .line 4321
    .line 4322
    goto :goto_8b

    .line 4323
    :pswitch_11
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 4324
    .line 4325
    .line 4326
    move-result-object v2

    .line 4327
    invoke-interface {v15, v2}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 4328
    .line 4329
    .line 4330
    goto :goto_8b

    .line 4331
    :pswitch_12
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    .line 4332
    .line 4333
    .line 4334
    move-result-object v2

    .line 4335
    move-object/from16 v45, v3

    .line 4336
    .line 4337
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 4338
    .line 4339
    .line 4340
    move-result-object v3

    .line 4341
    invoke-interface {v15, v2, v3}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 4342
    .line 4343
    .line 4344
    goto :goto_8c

    .line 4345
    :pswitch_13
    move-object/from16 v45, v3

    .line 4346
    .line 4347
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    .line 4348
    .line 4349
    .line 4350
    move-result-object v2

    .line 4351
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 4352
    .line 4353
    .line 4354
    move-result-object v3

    .line 4355
    invoke-interface {v15, v2, v3}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 4356
    .line 4357
    .line 4358
    move/from16 v2, v42

    .line 4359
    .line 4360
    :goto_8d
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 4361
    .line 4362
    .line 4363
    move-result v3

    .line 4364
    if-ge v2, v3, :cond_a6

    .line 4365
    .line 4366
    invoke-interface {v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeNamespace(I)Ljava/lang/String;

    .line 4367
    .line 4368
    .line 4369
    move-result-object v3

    .line 4370
    move-wide/from16 v71, v4

    .line 4371
    .line 4372
    invoke-interface {v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 4373
    .line 4374
    .line 4375
    move-result-object v4

    .line 4376
    invoke-interface {v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 4377
    .line 4378
    .line 4379
    move-result-object v5

    .line 4380
    invoke-interface {v15, v3, v4, v5}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 4381
    .line 4382
    .line 4383
    const/16 v41, 0x1

    .line 4384
    .line 4385
    add-int/lit8 v2, v2, 0x1

    .line 4386
    .line 4387
    move-wide/from16 v4, v71

    .line 4388
    .line 4389
    goto :goto_8d

    .line 4390
    :pswitch_14
    move-object/from16 v45, v3

    .line 4391
    .line 4392
    move-wide/from16 v71, v4

    .line 4393
    .line 4394
    invoke-interface {v15}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 4395
    .line 4396
    .line 4397
    goto :goto_8e

    .line 4398
    :pswitch_15
    move-object/from16 v45, v3

    .line 4399
    .line 4400
    move-wide/from16 v71, v4

    .line 4401
    .line 4402
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 4403
    .line 4404
    const/4 v3, 0x0

    .line 4405
    invoke-interface {v15, v3, v2}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 4406
    .line 4407
    .line 4408
    :goto_8e
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextToken()I

    .line 4409
    .line 4410
    .line 4411
    move-object/from16 v3, v45

    .line 4412
    .line 4413
    move-wide/from16 v4, v71

    .line 4414
    .line 4415
    goto/16 :goto_8a

    .line 4416
    .line 4417
    :cond_a7
    move-object/from16 v45, v3

    .line 4418
    .line 4419
    move-wide/from16 v71, v4

    .line 4420
    .line 4421
    invoke-interface {v15}, Lorg/xmlpull/v1/XmlSerializer;->flush()V

    .line 4422
    .line 4423
    .line 4424
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 4425
    .line 4426
    .line 4427
    move-result-object v2

    .line 4428
    invoke-static/range {v49 .. v50}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4429
    .line 4430
    .line 4431
    move-result-object v3

    .line 4432
    if-nez v13, :cond_a8

    .line 4433
    .line 4434
    :goto_8f
    move-object/from16 v81, v2

    .line 4435
    .line 4436
    goto :goto_90

    .line 4437
    :cond_a8
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 4438
    .line 4439
    invoke-virtual {v13, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 4440
    .line 4441
    .line 4442
    move-result-object v2

    .line 4443
    goto :goto_8f

    .line 4444
    :goto_90
    new-instance v74, LD2/a;

    .line 4445
    .line 4446
    move-wide/from16 v79, v10

    .line 4447
    .line 4448
    move-wide/from16 v77, v65

    .line 4449
    .line 4450
    invoke-direct/range {v74 .. v81}, LD2/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    .line 4451
    .line 4452
    .line 4453
    move-object/from16 v5, v74

    .line 4454
    .line 4455
    move-object/from16 v2, v75

    .line 4456
    .line 4457
    move-object/from16 v4, v76

    .line 4458
    .line 4459
    invoke-static {v3, v5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 4460
    .line 4461
    .line 4462
    move-result-object v3

    .line 4463
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4464
    .line 4465
    .line 4466
    goto :goto_91

    .line 4467
    :cond_a9
    move-object/from16 v70, v2

    .line 4468
    .line 4469
    move-wide/from16 v71, v4

    .line 4470
    .line 4471
    move-object/from16 v14, v45

    .line 4472
    .line 4473
    move-object/from16 v2, v75

    .line 4474
    .line 4475
    move-object/from16 v4, v76

    .line 4476
    .line 4477
    move-wide/from16 v68, v81

    .line 4478
    .line 4479
    move-object/from16 v9, v112

    .line 4480
    .line 4481
    move-object/from16 v45, v3

    .line 4482
    .line 4483
    invoke-static {v0}, LY1/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 4484
    .line 4485
    .line 4486
    :goto_91
    invoke-static {v0, v1}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 4487
    .line 4488
    .line 4489
    move-result v3

    .line 4490
    if-eqz v3, :cond_ab

    .line 4491
    .line 4492
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 4493
    .line 4494
    .line 4495
    move-result v1

    .line 4496
    new-array v1, v1, [J

    .line 4497
    .line 4498
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 4499
    .line 4500
    .line 4501
    move-result v3

    .line 4502
    new-array v3, v3, [LD2/a;

    .line 4503
    .line 4504
    move/from16 v5, v42

    .line 4505
    .line 4506
    :goto_92
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 4507
    .line 4508
    .line 4509
    move-result v7

    .line 4510
    if-ge v5, v7, :cond_aa

    .line 4511
    .line 4512
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4513
    .line 4514
    .line 4515
    move-result-object v7

    .line 4516
    check-cast v7, Landroid/util/Pair;

    .line 4517
    .line 4518
    iget-object v8, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 4519
    .line 4520
    check-cast v8, Ljava/lang/Long;

    .line 4521
    .line 4522
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 4523
    .line 4524
    .line 4525
    move-result-wide v10

    .line 4526
    aput-wide v10, v1, v5

    .line 4527
    .line 4528
    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 4529
    .line 4530
    check-cast v7, LD2/a;

    .line 4531
    .line 4532
    aput-object v7, v3, v5

    .line 4533
    .line 4534
    const/16 v41, 0x1

    .line 4535
    .line 4536
    add-int/lit8 v5, v5, 0x1

    .line 4537
    .line 4538
    goto :goto_92

    .line 4539
    :cond_aa
    const/16 v41, 0x1

    .line 4540
    .line 4541
    new-instance v5, LY1/g;

    .line 4542
    .line 4543
    invoke-direct {v5, v2, v4, v1, v3}, LY1/g;-><init>(Ljava/lang/String;Ljava/lang/String;[J[LD2/a;)V

    .line 4544
    .line 4545
    .line 4546
    move-object/from16 v3, v57

    .line 4547
    .line 4548
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4549
    .line 4550
    .line 4551
    move-object/from16 v50, v3

    .line 4552
    .line 4553
    move-object/from16 v112, v9

    .line 4554
    .line 4555
    move-object v13, v12

    .line 4556
    move-object/from16 v49, v14

    .line 4557
    .line 4558
    move-wide/from16 v11, v34

    .line 4559
    .line 4560
    move-object/from16 v69, v45

    .line 4561
    .line 4562
    move-wide/from16 v7, v60

    .line 4563
    .line 4564
    move-wide/from16 v3, v109

    .line 4565
    .line 4566
    move-wide/from16 v5, v143

    .line 4567
    .line 4568
    const/16 v16, 0x4

    .line 4569
    .line 4570
    const/16 v33, 0x2

    .line 4571
    .line 4572
    const-wide v34, -0x7fffffffffffffffL    # -4.9E-324

    .line 4573
    .line 4574
    .line 4575
    .line 4576
    .line 4577
    goto/16 :goto_93

    .line 4578
    .line 4579
    :cond_ab
    const/16 v41, 0x1

    .line 4580
    .line 4581
    move-object/from16 v75, v2

    .line 4582
    .line 4583
    move-object/from16 v76, v4

    .line 4584
    .line 4585
    move-object/from16 v112, v9

    .line 4586
    .line 4587
    move-object/from16 v3, v45

    .line 4588
    .line 4589
    move-wide/from16 v81, v68

    .line 4590
    .line 4591
    move-object/from16 v2, v70

    .line 4592
    .line 4593
    move-wide/from16 v4, v71

    .line 4594
    .line 4595
    move-object/from16 v45, v14

    .line 4596
    .line 4597
    goto/16 :goto_85

    .line 4598
    .line 4599
    :cond_ac
    move-object/from16 v12, v49

    .line 4600
    .line 4601
    move-object/from16 v9, v112

    .line 4602
    .line 4603
    move-object/from16 v70, v141

    .line 4604
    .line 4605
    const/16 v41, 0x1

    .line 4606
    .line 4607
    move-object/from16 v49, v45

    .line 4608
    .line 4609
    move-object/from16 v45, v3

    .line 4610
    .line 4611
    move-object/from16 v3, v57

    .line 4612
    .line 4613
    invoke-static {v0, v15}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 4614
    .line 4615
    .line 4616
    move-result v1

    .line 4617
    if-eqz v1, :cond_ad

    .line 4618
    .line 4619
    const/4 v7, 0x0

    .line 4620
    invoke-static {v0, v7}, LY1/e;->o(Lorg/xmlpull/v1/XmlPullParser;LY1/r;)LY1/r;

    .line 4621
    .line 4622
    .line 4623
    move-result-object v1

    .line 4624
    move-object/from16 v59, v1

    .line 4625
    .line 4626
    move-object/from16 v50, v3

    .line 4627
    .line 4628
    move-object/from16 v112, v9

    .line 4629
    .line 4630
    move-object v13, v12

    .line 4631
    move-wide/from16 v11, v34

    .line 4632
    .line 4633
    move-object/from16 v69, v45

    .line 4634
    .line 4635
    move-wide/from16 v7, v60

    .line 4636
    .line 4637
    move-object/from16 v1, v64

    .line 4638
    .line 4639
    move-wide/from16 v3, v109

    .line 4640
    .line 4641
    move-wide/from16 v5, v143

    .line 4642
    .line 4643
    const/16 v16, 0x4

    .line 4644
    .line 4645
    const/16 v33, 0x2

    .line 4646
    .line 4647
    goto/16 :goto_1e

    .line 4648
    .line 4649
    :cond_ad
    invoke-static {v0, v13}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 4650
    .line 4651
    .line 4652
    move-result v1

    .line 4653
    if-eqz v1, :cond_ae

    .line 4654
    .line 4655
    move-object/from16 v112, v9

    .line 4656
    .line 4657
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4658
    .line 4659
    .line 4660
    .line 4661
    .line 4662
    invoke-static {v0, v1, v2}, LY1/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 4663
    .line 4664
    .line 4665
    move-result-wide v8

    .line 4666
    move-wide v5, v1

    .line 4667
    const/4 v1, 0x0

    .line 4668
    move-object/from16 v50, v3

    .line 4669
    .line 4670
    move-wide/from16 v10, v34

    .line 4671
    .line 4672
    move-object/from16 v69, v45

    .line 4673
    .line 4674
    move-wide/from16 v2, v109

    .line 4675
    .line 4676
    const/16 v33, 0x2

    .line 4677
    .line 4678
    move-wide/from16 v34, v5

    .line 4679
    .line 4680
    move-wide/from16 v6, v60

    .line 4681
    .line 4682
    move-wide/from16 v4, v143

    .line 4683
    .line 4684
    invoke-static/range {v0 .. v11}, LY1/e;->p(Lorg/xmlpull/v1/XmlPullParser;LY1/o;JJJJJ)LY1/o;

    .line 4685
    .line 4686
    .line 4687
    move-result-object v1

    .line 4688
    move-wide v13, v8

    .line 4689
    move-wide v7, v6

    .line 4690
    move-wide v5, v4

    .line 4691
    move-wide v3, v2

    .line 4692
    move-object/from16 v59, v1

    .line 4693
    .line 4694
    move-wide/from16 v62, v13

    .line 4695
    .line 4696
    move-object/from16 v1, v64

    .line 4697
    .line 4698
    const/16 v16, 0x4

    .line 4699
    .line 4700
    move-object v13, v12

    .line 4701
    move-wide v11, v10

    .line 4702
    goto :goto_94

    .line 4703
    :cond_ae
    move-object/from16 v50, v3

    .line 4704
    .line 4705
    move-object/from16 v112, v9

    .line 4706
    .line 4707
    move-wide/from16 v10, v34

    .line 4708
    .line 4709
    move-object/from16 v69, v45

    .line 4710
    .line 4711
    move-wide/from16 v7, v60

    .line 4712
    .line 4713
    move-wide/from16 v3, v109

    .line 4714
    .line 4715
    move-wide/from16 v5, v143

    .line 4716
    .line 4717
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4718
    .line 4719
    .line 4720
    .line 4721
    .line 4722
    const/16 v33, 0x2

    .line 4723
    .line 4724
    invoke-static {v0, v14}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 4725
    .line 4726
    .line 4727
    move-result v9

    .line 4728
    if-eqz v9, :cond_af

    .line 4729
    .line 4730
    move-wide/from16 v34, v10

    .line 4731
    .line 4732
    invoke-static {v0, v1, v2}, LY1/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    .line 4733
    .line 4734
    .line 4735
    move-result-wide v9

    .line 4736
    sget-object v11, Ll8/K;->b:Ll8/I;

    .line 4737
    .line 4738
    move-wide/from16 v134, v1

    .line 4739
    .line 4740
    sget-object v2, Ll8/e0;->e:Ll8/e0;

    .line 4741
    .line 4742
    const/4 v1, 0x0

    .line 4743
    move-object v13, v12

    .line 4744
    move-wide/from16 v11, v34

    .line 4745
    .line 4746
    move-wide/from16 v34, v134

    .line 4747
    .line 4748
    const/16 v16, 0x4

    .line 4749
    .line 4750
    invoke-static/range {v0 .. v12}, LY1/e;->q(Lorg/xmlpull/v1/XmlPullParser;LY1/p;Ljava/util/List;JJJJJ)LY1/p;

    .line 4751
    .line 4752
    .line 4753
    move-result-object v1

    .line 4754
    move-object/from16 v59, v1

    .line 4755
    .line 4756
    move-wide/from16 v62, v9

    .line 4757
    .line 4758
    :goto_93
    move-object/from16 v1, v64

    .line 4759
    .line 4760
    goto :goto_94

    .line 4761
    :cond_af
    move-wide/from16 v34, v1

    .line 4762
    .line 4763
    move-object v13, v12

    .line 4764
    const/16 v16, 0x4

    .line 4765
    .line 4766
    move-wide v11, v10

    .line 4767
    const-string v1, "AssetIdentifier"

    .line 4768
    .line 4769
    invoke-static {v0, v1}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 4770
    .line 4771
    .line 4772
    move-result v2

    .line 4773
    if-eqz v2, :cond_b0

    .line 4774
    .line 4775
    invoke-static {v0, v1}, LY1/e;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LY1/f;

    .line 4776
    .line 4777
    .line 4778
    goto :goto_93

    .line 4779
    :cond_b0
    invoke-static {v0}, LY1/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 4780
    .line 4781
    .line 4782
    goto :goto_93

    .line 4783
    :goto_94
    invoke-static {v0, v1}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 4784
    .line 4785
    .line 4786
    move-result v2

    .line 4787
    if-eqz v2, :cond_b4

    .line 4788
    .line 4789
    new-instance v45, LY1/h;

    .line 4790
    .line 4791
    move-object/from16 v49, v69

    .line 4792
    .line 4793
    invoke-direct/range {v45 .. v50}, LY1/h;-><init>(Ljava/lang/String;JLjava/util/ArrayList;Ljava/util/List;)V

    .line 4794
    .line 4795
    .line 4796
    move-object/from16 v1, v45

    .line 4797
    .line 4798
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4799
    .line 4800
    .line 4801
    move-result-object v2

    .line 4802
    invoke-static {v1, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 4803
    .line 4804
    .line 4805
    move-result-object v1

    .line 4806
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 4807
    .line 4808
    check-cast v2, LY1/h;

    .line 4809
    .line 4810
    iget-wide v3, v2, LY1/h;->b:J

    .line 4811
    .line 4812
    cmp-long v3, v3, v34

    .line 4813
    .line 4814
    if-nez v3, :cond_b2

    .line 4815
    .line 4816
    if-eqz v23, :cond_b1

    .line 4817
    .line 4818
    move/from16 v36, v41

    .line 4819
    .line 4820
    move-object/from16 v9, v54

    .line 4821
    .line 4822
    move-wide/from16 v5, v55

    .line 4823
    .line 4824
    goto :goto_97

    .line 4825
    :cond_b1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4826
    .line 4827
    const-string v1, "Unable to determine start of period "

    .line 4828
    .line 4829
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4830
    .line 4831
    .line 4832
    invoke-virtual/range {v54 .. v54}, Ljava/util/ArrayList;->size()I

    .line 4833
    .line 4834
    .line 4835
    move-result v1

    .line 4836
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 4837
    .line 4838
    .line 4839
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4840
    .line 4841
    .line 4842
    move-result-object v0

    .line 4843
    const/4 v7, 0x0

    .line 4844
    invoke-static {v0, v7}, LN1/D;->b(Ljava/lang/String;Ljava/lang/Exception;)LN1/D;

    .line 4845
    .line 4846
    .line 4847
    move-result-object v0

    .line 4848
    throw v0

    .line 4849
    :cond_b2
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 4850
    .line 4851
    check-cast v1, Ljava/lang/Long;

    .line 4852
    .line 4853
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 4854
    .line 4855
    .line 4856
    move-result-wide v3

    .line 4857
    cmp-long v1, v3, v34

    .line 4858
    .line 4859
    if-nez v1, :cond_b3

    .line 4860
    .line 4861
    move-wide/from16 v5, v34

    .line 4862
    .line 4863
    :goto_95
    move-object/from16 v9, v54

    .line 4864
    .line 4865
    goto :goto_96

    .line 4866
    :cond_b3
    iget-wide v5, v2, LY1/h;->b:J

    .line 4867
    .line 4868
    add-long/2addr v5, v3

    .line 4869
    goto :goto_95

    .line 4870
    :goto_96
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4871
    .line 4872
    .line 4873
    :goto_97
    move-wide/from16 v7, v52

    .line 4874
    .line 4875
    goto :goto_98

    .line 4876
    :cond_b4
    move-wide/from16 v34, v5

    .line 4877
    .line 4878
    move-wide v5, v7

    .line 4879
    move-wide v10, v11

    .line 4880
    move-object/from16 v45, v49

    .line 4881
    .line 4882
    move-object/from16 v57, v50

    .line 4883
    .line 4884
    move-object/from16 v14, v69

    .line 4885
    .line 4886
    move-object/from16 v12, v70

    .line 4887
    .line 4888
    move/from16 v2, v91

    .line 4889
    .line 4890
    move-object/from16 v15, v107

    .line 4891
    .line 4892
    move-object/from16 v9, v130

    .line 4893
    .line 4894
    move-wide v7, v3

    .line 4895
    move-object/from16 v49, v13

    .line 4896
    .line 4897
    move-object/from16 v13, v67

    .line 4898
    .line 4899
    move-object/from16 v3, v73

    .line 4900
    .line 4901
    move-object/from16 v4, v112

    .line 4902
    .line 4903
    goto/16 :goto_1d

    .line 4904
    .line 4905
    :cond_b5
    move/from16 v91, v2

    .line 4906
    .line 4907
    move-wide/from16 v55, v5

    .line 4908
    .line 4909
    move-wide v11, v10

    .line 4910
    move-object v9, v14

    .line 4911
    const/16 v16, 0x4

    .line 4912
    .line 4913
    const/16 v33, 0x2

    .line 4914
    .line 4915
    const/16 v41, 0x1

    .line 4916
    .line 4917
    const/16 v43, -0x1

    .line 4918
    .line 4919
    invoke-static {v0}, LY1/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 4920
    .line 4921
    .line 4922
    move-wide/from16 v7, v52

    .line 4923
    .line 4924
    move-wide/from16 v5, v55

    .line 4925
    .line 4926
    :goto_98
    const-string v1, "MPD"

    .line 4927
    .line 4928
    invoke-static {v0, v1}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 4929
    .line 4930
    .line 4931
    move-result v1

    .line 4932
    if-eqz v1, :cond_ba

    .line 4933
    .line 4934
    cmp-long v0, v19, v34

    .line 4935
    .line 4936
    if-nez v0, :cond_b6

    .line 4937
    .line 4938
    cmp-long v0, v5, v34

    .line 4939
    .line 4940
    if-eqz v0, :cond_b7

    .line 4941
    .line 4942
    move-wide/from16 v19, v5

    .line 4943
    .line 4944
    :cond_b6
    :goto_99
    const/4 v1, 0x0

    .line 4945
    goto :goto_9a

    .line 4946
    :cond_b7
    if-eqz v23, :cond_b8

    .line 4947
    .line 4948
    goto :goto_99

    .line 4949
    :cond_b8
    const-string v0, "Unable to determine duration of static manifest."

    .line 4950
    .line 4951
    const/4 v1, 0x0

    .line 4952
    invoke-static {v0, v1}, LN1/D;->b(Ljava/lang/String;Ljava/lang/Exception;)LN1/D;

    .line 4953
    .line 4954
    .line 4955
    move-result-object v0

    .line 4956
    throw v0

    .line 4957
    :goto_9a
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4958
    .line 4959
    .line 4960
    move-result v0

    .line 4961
    if-nez v0, :cond_b9

    .line 4962
    .line 4963
    new-instance v16, LY1/c;

    .line 4964
    .line 4965
    move-object/from16 v36, v9

    .line 4966
    .line 4967
    move-wide/from16 v26, v11

    .line 4968
    .line 4969
    move-object/from16 v32, v37

    .line 4970
    .line 4971
    move-object/from16 v33, v38

    .line 4972
    .line 4973
    move-object/from16 v35, v39

    .line 4974
    .line 4975
    move-object/from16 v34, v40

    .line 4976
    .line 4977
    invoke-direct/range {v16 .. v36}, LY1/c;-><init>(JJJZJJJJLY1/i;LY1/t;LE5/Y;Landroid/net/Uri;Ljava/util/ArrayList;)V

    .line 4978
    .line 4979
    .line 4980
    return-object v16

    .line 4981
    :cond_b9
    const-string v0, "No periods found."

    .line 4982
    .line 4983
    invoke-static {v0, v1}, LN1/D;->b(Ljava/lang/String;Ljava/lang/Exception;)LN1/D;

    .line 4984
    .line 4985
    .line 4986
    move-result-object v0

    .line 4987
    throw v0

    .line 4988
    :cond_ba
    move-object v14, v9

    .line 4989
    move-wide v10, v11

    .line 4990
    move/from16 v12, v41

    .line 4991
    .line 4992
    move/from16 v1, v42

    .line 4993
    .line 4994
    move-object/from16 v13, v44

    .line 4995
    .line 4996
    move-object/from16 v3, v51

    .line 4997
    .line 4998
    move/from16 v2, v91

    .line 4999
    .line 5000
    const/4 v4, 0x0

    .line 5001
    goto/16 :goto_b

    :pswitch_data_0
    .packed-switch 0x31
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch
.end method

.method public static l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)LY1/j;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v2

    .line 6
    invoke-interface {p0, v0, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-wide/16 p1, -0x1

    .line 11
    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    const-string v0, "-"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 v0, 0x0

    .line 21
    aget-object v0, p0, v0

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    array-length v3, p0

    .line 28
    const/4 v4, 0x2

    .line 29
    if-ne v3, v4, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    aget-object p0, p0, p1

    .line 33
    .line 34
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 35
    .line 36
    .line 37
    move-result-wide p0

    .line 38
    sub-long/2addr p0, v0

    .line 39
    const-wide/16 v3, 0x1

    .line 40
    .line 41
    add-long/2addr p0, v3

    .line 42
    move-wide v5, p0

    .line 43
    :goto_0
    move-wide v3, v0

    .line 44
    goto :goto_2

    .line 45
    :cond_0
    :goto_1
    move-wide v5, p1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const-wide/16 v0, 0x0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :goto_2
    new-instance v1, LY1/j;

    .line 51
    .line 52
    invoke-direct/range {v1 .. v6}, LY1/j;-><init>(Ljava/lang/String;JJ)V

    .line 53
    .line 54
    .line 55
    return-object v1
.end method

.method public static m(Ljava/lang/String;)I
    .locals 7

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    const/4 v5, -0x1

    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    sparse-switch v6, :sswitch_data_0

    .line 17
    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :sswitch_0
    const-string v6, "supplementary"

    .line 22
    .line 23
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :cond_1
    const/16 v5, 0xc

    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :sswitch_1
    const-string v6, "emergency"

    .line 36
    .line 37
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_2

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_2
    const/16 v5, 0xb

    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :sswitch_2
    const-string v6, "commentary"

    .line 50
    .line 51
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_3

    .line 56
    .line 57
    goto/16 :goto_0

    .line 58
    .line 59
    :cond_3
    const/16 v5, 0xa

    .line 60
    .line 61
    goto/16 :goto_0

    .line 62
    .line 63
    :sswitch_3
    const-string v6, "caption"

    .line 64
    .line 65
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-nez p0, :cond_4

    .line 70
    .line 71
    goto/16 :goto_0

    .line 72
    .line 73
    :cond_4
    const/16 v5, 0x9

    .line 74
    .line 75
    goto/16 :goto_0

    .line 76
    .line 77
    :sswitch_4
    const-string v6, "sign"

    .line 78
    .line 79
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-nez p0, :cond_5

    .line 84
    .line 85
    goto/16 :goto_0

    .line 86
    .line 87
    :cond_5
    move v5, v0

    .line 88
    goto/16 :goto_0

    .line 89
    .line 90
    :sswitch_5
    const-string v6, "main"

    .line 91
    .line 92
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-nez p0, :cond_6

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_6
    const/4 v5, 0x7

    .line 100
    goto :goto_0

    .line 101
    :sswitch_6
    const-string v6, "dub"

    .line 102
    .line 103
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-nez p0, :cond_7

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_7
    const/4 v5, 0x6

    .line 111
    goto :goto_0

    .line 112
    :sswitch_7
    const-string v6, "forced-subtitle"

    .line 113
    .line 114
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-nez p0, :cond_8

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_8
    const/4 v5, 0x5

    .line 122
    goto :goto_0

    .line 123
    :sswitch_8
    const-string v6, "alternate"

    .line 124
    .line 125
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-nez p0, :cond_9

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_9
    move v5, v1

    .line 133
    goto :goto_0

    .line 134
    :sswitch_9
    const-string v6, "forced_subtitle"

    .line 135
    .line 136
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-nez p0, :cond_a

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_a
    const/4 v5, 0x3

    .line 144
    goto :goto_0

    .line 145
    :sswitch_a
    const-string v6, "enhanced-audio-intelligibility"

    .line 146
    .line 147
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    if-nez p0, :cond_b

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_b
    move v5, v2

    .line 155
    goto :goto_0

    .line 156
    :sswitch_b
    const-string v6, "description"

    .line 157
    .line 158
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-nez p0, :cond_c

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_c
    move v5, v3

    .line 166
    goto :goto_0

    .line 167
    :sswitch_c
    const-string v6, "subtitle"

    .line 168
    .line 169
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    if-nez p0, :cond_d

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_d
    move v5, v4

    .line 177
    :goto_0
    packed-switch v5, :pswitch_data_0

    .line 178
    .line 179
    .line 180
    :goto_1
    return v4

    .line 181
    :pswitch_0
    return v1

    .line 182
    :pswitch_1
    const/16 p0, 0x20

    .line 183
    .line 184
    return p0

    .line 185
    :pswitch_2
    return v0

    .line 186
    :pswitch_3
    const/16 p0, 0x40

    .line 187
    .line 188
    return p0

    .line 189
    :pswitch_4
    const/16 p0, 0x100

    .line 190
    .line 191
    return p0

    .line 192
    :pswitch_5
    return v3

    .line 193
    :pswitch_6
    const/16 p0, 0x10

    .line 194
    .line 195
    return p0

    .line 196
    :pswitch_7
    return v2

    .line 197
    :pswitch_8
    const/16 p0, 0x800

    .line 198
    .line 199
    return p0

    .line 200
    :pswitch_9
    const/16 p0, 0x200

    .line 201
    .line 202
    return p0

    .line 203
    :pswitch_a
    const/16 p0, 0x80

    .line 204
    .line 205
    return p0

    .line 206
    nop

    .line 207
    :sswitch_data_0
    .sparse-switch
        -0x7ad0b3e8 -> :sswitch_c
        -0x66ca7c04 -> :sswitch_b
        -0x5e3a5c50 -> :sswitch_a
        -0x5dde3142 -> :sswitch_9
        -0x53ecbf86 -> :sswitch_8
        -0x533bdf74 -> :sswitch_7
        0x185f1 -> :sswitch_6
        0x3305b9 -> :sswitch_5
        0x35ddbd -> :sswitch_4
        0x20ef99e6 -> :sswitch_3
        0x3597fba9 -> :sswitch_2
        0x6118c591 -> :sswitch_1
        0x6e96bb0f -> :sswitch_0
    .end sparse-switch

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_a
        :pswitch_7
        :pswitch_a
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static n(Ljava/util/ArrayList;)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v0, v2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, LY1/f;

    .line 14
    .line 15
    const-string v3, "http://dashif.org/guidelines/trickmode"

    .line 16
    .line 17
    iget-object v2, v2, LY1/f;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v3, v2}, LA6/h;->v(Ljava/lang/String;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    const/16 v1, 0x4000

    .line 26
    .line 27
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return v1
.end method

.method public static o(Lorg/xmlpull/v1/XmlPullParser;LY1/r;)LY1/r;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v4, v1, LY1/s;->b:J

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-wide v4, v2

    .line 13
    :goto_0
    const/4 v6, 0x0

    .line 14
    const-string v7, "timescale"

    .line 15
    .line 16
    invoke-interface {v0, v6, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    if-nez v7, :cond_1

    .line 21
    .line 22
    :goto_1
    move-wide v9, v4

    .line 23
    goto :goto_2

    .line 24
    :cond_1
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    goto :goto_1

    .line 29
    :goto_2
    const-wide/16 v4, 0x0

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-wide v7, v1, LY1/s;->c:J

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_2
    move-wide v7, v4

    .line 37
    :goto_3
    const-string v11, "presentationTimeOffset"

    .line 38
    .line 39
    invoke-interface {v0, v6, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v11

    .line 43
    if-nez v11, :cond_3

    .line 44
    .line 45
    :goto_4
    move-wide v11, v7

    .line 46
    goto :goto_5

    .line 47
    :cond_3
    invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    goto :goto_4

    .line 52
    :goto_5
    if-eqz v1, :cond_4

    .line 53
    .line 54
    iget-wide v7, v1, LY1/r;->d:J

    .line 55
    .line 56
    goto :goto_6

    .line 57
    :cond_4
    move-wide v7, v4

    .line 58
    :goto_6
    if-eqz v1, :cond_5

    .line 59
    .line 60
    iget-wide v4, v1, LY1/r;->e:J

    .line 61
    .line 62
    :cond_5
    const-string v13, "indexRange"

    .line 63
    .line 64
    invoke-interface {v0, v6, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    if-eqz v13, :cond_6

    .line 69
    .line 70
    const-string v4, "-"

    .line 71
    .line 72
    invoke-virtual {v13, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    const/4 v5, 0x0

    .line 77
    aget-object v5, v4, v5

    .line 78
    .line 79
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 80
    .line 81
    .line 82
    move-result-wide v7

    .line 83
    const/4 v5, 0x1

    .line 84
    aget-object v4, v4, v5

    .line 85
    .line 86
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 87
    .line 88
    .line 89
    move-result-wide v4

    .line 90
    sub-long/2addr v4, v7

    .line 91
    add-long/2addr v4, v2

    .line 92
    :cond_6
    move-wide v15, v4

    .line 93
    move-wide v13, v7

    .line 94
    if-eqz v1, :cond_7

    .line 95
    .line 96
    iget-object v6, v1, LY1/s;->a:LY1/j;

    .line 97
    .line 98
    :cond_7
    :goto_7
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 99
    .line 100
    .line 101
    const-string v1, "Initialization"

    .line 102
    .line 103
    invoke-static {v0, v1}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_8

    .line 108
    .line 109
    const-string v1, "sourceURL"

    .line 110
    .line 111
    const-string v2, "range"

    .line 112
    .line 113
    invoke-static {v0, v1, v2}, LY1/e;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)LY1/j;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    :goto_8
    move-object v8, v6

    .line 118
    goto :goto_9

    .line 119
    :cond_8
    invoke-static {v0}, LY1/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 120
    .line 121
    .line 122
    goto :goto_8

    .line 123
    :goto_9
    const-string v1, "SegmentBase"

    .line 124
    .line 125
    invoke-static {v0, v1}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_9

    .line 130
    .line 131
    new-instance v7, LY1/r;

    .line 132
    .line 133
    invoke-direct/range {v7 .. v16}, LY1/r;-><init>(LY1/j;JJJJ)V

    .line 134
    .line 135
    .line 136
    return-object v7

    .line 137
    :cond_9
    move-object v6, v8

    .line 138
    goto :goto_7
.end method

.method public static p(Lorg/xmlpull/v1/XmlPullParser;LY1/o;JJJJJ)LY1/o;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v4, v1, LY1/s;->b:J

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-wide v4, v2

    .line 13
    :goto_0
    const/4 v6, 0x0

    .line 14
    const-string v7, "timescale"

    .line 15
    .line 16
    invoke-interface {v0, v6, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    if-nez v7, :cond_1

    .line 21
    .line 22
    :goto_1
    move-wide v9, v4

    .line 23
    goto :goto_2

    .line 24
    :cond_1
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    goto :goto_1

    .line 29
    :goto_2
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-wide v4, v1, LY1/s;->c:J

    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_2
    const-wide/16 v4, 0x0

    .line 35
    .line 36
    :goto_3
    const-string v7, "presentationTimeOffset"

    .line 37
    .line 38
    invoke-interface {v0, v6, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    if-nez v7, :cond_3

    .line 43
    .line 44
    :goto_4
    move-wide v11, v4

    .line 45
    goto :goto_5

    .line 46
    :cond_3
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    goto :goto_4

    .line 51
    :goto_5
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    iget-wide v7, v1, LY1/n;->e:J

    .line 59
    .line 60
    goto :goto_6

    .line 61
    :cond_4
    move-wide v7, v4

    .line 62
    :goto_6
    const-string v13, "duration"

    .line 63
    .line 64
    invoke-interface {v0, v6, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    if-nez v13, :cond_5

    .line 69
    .line 70
    :goto_7
    move-wide v15, v7

    .line 71
    goto :goto_8

    .line 72
    :cond_5
    invoke-static {v13}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 73
    .line 74
    .line 75
    move-result-wide v7

    .line 76
    goto :goto_7

    .line 77
    :goto_8
    if-eqz v1, :cond_6

    .line 78
    .line 79
    iget-wide v2, v1, LY1/n;->d:J

    .line 80
    .line 81
    :cond_6
    const-string v7, "startNumber"

    .line 82
    .line 83
    invoke-interface {v0, v6, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    if-nez v7, :cond_7

    .line 88
    .line 89
    :goto_9
    move-wide v13, v2

    .line 90
    goto :goto_a

    .line 91
    :cond_7
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 92
    .line 93
    .line 94
    move-result-wide v2

    .line 95
    goto :goto_9

    .line 96
    :goto_a
    cmp-long v2, p8, v4

    .line 97
    .line 98
    if-nez v2, :cond_8

    .line 99
    .line 100
    move-wide/from16 v2, p6

    .line 101
    .line 102
    goto :goto_b

    .line 103
    :cond_8
    move-wide/from16 v2, p8

    .line 104
    .line 105
    :goto_b
    const-wide v7, 0x7fffffffffffffffL

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    cmp-long v7, v2, v7

    .line 111
    .line 112
    if-nez v7, :cond_9

    .line 113
    .line 114
    move-wide/from16 v18, v4

    .line 115
    .line 116
    goto :goto_c

    .line 117
    :cond_9
    move-wide/from16 v18, v2

    .line 118
    .line 119
    :goto_c
    move-object v2, v6

    .line 120
    move-object v3, v2

    .line 121
    :cond_a
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 122
    .line 123
    .line 124
    const-string v4, "Initialization"

    .line 125
    .line 126
    invoke-static {v0, v4}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_b

    .line 131
    .line 132
    const-string v2, "sourceURL"

    .line 133
    .line 134
    const-string v4, "range"

    .line 135
    .line 136
    invoke-static {v0, v2, v4}, LY1/e;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)LY1/j;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    move-wide/from16 v4, p4

    .line 141
    .line 142
    goto :goto_d

    .line 143
    :cond_b
    const-string v4, "SegmentTimeline"

    .line 144
    .line 145
    invoke-static {v0, v4}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-eqz v4, :cond_c

    .line 150
    .line 151
    move-wide/from16 v4, p4

    .line 152
    .line 153
    invoke-static {v0, v9, v10, v4, v5}, LY1/e;->r(Lorg/xmlpull/v1/XmlPullParser;JJ)Ljava/util/ArrayList;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    goto :goto_d

    .line 158
    :cond_c
    move-wide/from16 v4, p4

    .line 159
    .line 160
    const-string v7, "SegmentURL"

    .line 161
    .line 162
    invoke-static {v0, v7}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    if-eqz v7, :cond_e

    .line 167
    .line 168
    if-nez v6, :cond_d

    .line 169
    .line 170
    new-instance v6, Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 173
    .line 174
    .line 175
    :cond_d
    const-string v7, "media"

    .line 176
    .line 177
    const-string v8, "mediaRange"

    .line 178
    .line 179
    invoke-static {v0, v7, v8}, LY1/e;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)LY1/j;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    goto :goto_d

    .line 187
    :cond_e
    invoke-static {v0}, LY1/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 188
    .line 189
    .line 190
    :goto_d
    const-string v7, "SegmentList"

    .line 191
    .line 192
    invoke-static {v0, v7}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    if-eqz v7, :cond_a

    .line 197
    .line 198
    if-eqz v1, :cond_12

    .line 199
    .line 200
    if-eqz v2, :cond_f

    .line 201
    .line 202
    goto :goto_e

    .line 203
    :cond_f
    iget-object v2, v1, LY1/s;->a:LY1/j;

    .line 204
    .line 205
    :goto_e
    if-eqz v3, :cond_10

    .line 206
    .line 207
    goto :goto_f

    .line 208
    :cond_10
    iget-object v3, v1, LY1/n;->f:Ljava/util/List;

    .line 209
    .line 210
    :goto_f
    if-eqz v6, :cond_11

    .line 211
    .line 212
    goto :goto_10

    .line 213
    :cond_11
    iget-object v6, v1, LY1/o;->j:Ljava/util/List;

    .line 214
    .line 215
    :cond_12
    :goto_10
    move-object v8, v2

    .line 216
    move-object/from16 v17, v3

    .line 217
    .line 218
    move-object/from16 v20, v6

    .line 219
    .line 220
    new-instance v7, LY1/o;

    .line 221
    .line 222
    invoke-static/range {p10 .. p11}, LQ1/x;->K(J)J

    .line 223
    .line 224
    .line 225
    move-result-wide v21

    .line 226
    invoke-static/range {p2 .. p3}, LQ1/x;->K(J)J

    .line 227
    .line 228
    .line 229
    move-result-wide v23

    .line 230
    invoke-direct/range {v7 .. v24}, LY1/o;-><init>(LY1/j;JJJJLjava/util/List;JLjava/util/List;JJ)V

    .line 231
    .line 232
    .line 233
    return-object v7
.end method

.method public static q(Lorg/xmlpull/v1/XmlPullParser;LY1/p;Ljava/util/List;JJJJJ)LY1/p;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v4, v1, LY1/s;->b:J

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-wide v4, v2

    .line 13
    :goto_0
    const/4 v6, 0x0

    .line 14
    const-string v7, "timescale"

    .line 15
    .line 16
    invoke-interface {v0, v6, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    if-nez v7, :cond_1

    .line 21
    .line 22
    :goto_1
    move-wide v9, v4

    .line 23
    goto :goto_2

    .line 24
    :cond_1
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    goto :goto_1

    .line 29
    :goto_2
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-wide v4, v1, LY1/s;->c:J

    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_2
    const-wide/16 v4, 0x0

    .line 35
    .line 36
    :goto_3
    const-string v7, "presentationTimeOffset"

    .line 37
    .line 38
    invoke-interface {v0, v6, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    if-nez v7, :cond_3

    .line 43
    .line 44
    :goto_4
    move-wide v11, v4

    .line 45
    goto :goto_5

    .line 46
    :cond_3
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    goto :goto_4

    .line 51
    :goto_5
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    iget-wide v7, v1, LY1/n;->e:J

    .line 59
    .line 60
    goto :goto_6

    .line 61
    :cond_4
    move-wide v7, v4

    .line 62
    :goto_6
    const-string v13, "duration"

    .line 63
    .line 64
    invoke-interface {v0, v6, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    if-nez v13, :cond_5

    .line 69
    .line 70
    :goto_7
    move-wide/from16 v17, v7

    .line 71
    .line 72
    goto :goto_8

    .line 73
    :cond_5
    invoke-static {v13}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v7

    .line 77
    goto :goto_7

    .line 78
    :goto_8
    if-eqz v1, :cond_6

    .line 79
    .line 80
    iget-wide v2, v1, LY1/n;->d:J

    .line 81
    .line 82
    :cond_6
    const-string v7, "startNumber"

    .line 83
    .line 84
    invoke-interface {v0, v6, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    if-nez v7, :cond_7

    .line 89
    .line 90
    :goto_9
    move-wide v13, v2

    .line 91
    goto :goto_a

    .line 92
    :cond_7
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 93
    .line 94
    .line 95
    move-result-wide v2

    .line 96
    goto :goto_9

    .line 97
    :goto_a
    const/4 v2, 0x0

    .line 98
    :goto_b
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-ge v2, v3, :cond_9

    .line 103
    .line 104
    move-object/from16 v3, p2

    .line 105
    .line 106
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    check-cast v7, LY1/f;

    .line 111
    .line 112
    iget-object v8, v7, LY1/f;->a:Ljava/lang/String;

    .line 113
    .line 114
    const-string v15, "http://dashif.org/guidelines/last-segment-number"

    .line 115
    .line 116
    invoke-static {v15, v8}, LA6/h;->v(Ljava/lang/String;Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    if-eqz v8, :cond_8

    .line 121
    .line 122
    iget-object v2, v7, LY1/f;->b:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 125
    .line 126
    .line 127
    move-result-wide v2

    .line 128
    :goto_c
    move-wide v15, v2

    .line 129
    goto :goto_d

    .line 130
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 131
    .line 132
    goto :goto_b

    .line 133
    :cond_9
    const-wide/16 v2, -0x1

    .line 134
    .line 135
    goto :goto_c

    .line 136
    :goto_d
    cmp-long v2, p9, v4

    .line 137
    .line 138
    if-nez v2, :cond_a

    .line 139
    .line 140
    move-wide/from16 v2, p7

    .line 141
    .line 142
    goto :goto_e

    .line 143
    :cond_a
    move-wide/from16 v2, p9

    .line 144
    .line 145
    :goto_e
    const-wide v7, 0x7fffffffffffffffL

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    cmp-long v7, v2, v7

    .line 151
    .line 152
    if-nez v7, :cond_b

    .line 153
    .line 154
    move-wide/from16 v20, v4

    .line 155
    .line 156
    goto :goto_f

    .line 157
    :cond_b
    move-wide/from16 v20, v2

    .line 158
    .line 159
    :goto_f
    if-eqz v1, :cond_c

    .line 160
    .line 161
    iget-object v2, v1, LY1/p;->k:LG6/t;

    .line 162
    .line 163
    goto :goto_10

    .line 164
    :cond_c
    move-object v2, v6

    .line 165
    :goto_10
    const-string v3, "media"

    .line 166
    .line 167
    invoke-static {v0, v3, v2}, LY1/e;->s(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;LG6/t;)LG6/t;

    .line 168
    .line 169
    .line 170
    move-result-object v23

    .line 171
    if-eqz v1, :cond_d

    .line 172
    .line 173
    iget-object v2, v1, LY1/p;->j:LG6/t;

    .line 174
    .line 175
    goto :goto_11

    .line 176
    :cond_d
    move-object v2, v6

    .line 177
    :goto_11
    const-string v3, "initialization"

    .line 178
    .line 179
    invoke-static {v0, v3, v2}, LY1/e;->s(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;LG6/t;)LG6/t;

    .line 180
    .line 181
    .line 182
    move-result-object v22

    .line 183
    move-object v2, v6

    .line 184
    :cond_e
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 185
    .line 186
    .line 187
    const-string v3, "Initialization"

    .line 188
    .line 189
    invoke-static {v0, v3}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-eqz v3, :cond_f

    .line 194
    .line 195
    const-string v3, "sourceURL"

    .line 196
    .line 197
    const-string v4, "range"

    .line 198
    .line 199
    invoke-static {v0, v3, v4}, LY1/e;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)LY1/j;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    move-object v6, v3

    .line 204
    move-wide/from16 v3, p5

    .line 205
    .line 206
    goto :goto_12

    .line 207
    :cond_f
    const-string v3, "SegmentTimeline"

    .line 208
    .line 209
    invoke-static {v0, v3}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-eqz v3, :cond_10

    .line 214
    .line 215
    move-wide/from16 v3, p5

    .line 216
    .line 217
    invoke-static {v0, v9, v10, v3, v4}, LY1/e;->r(Lorg/xmlpull/v1/XmlPullParser;JJ)Ljava/util/ArrayList;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    goto :goto_12

    .line 222
    :cond_10
    move-wide/from16 v3, p5

    .line 223
    .line 224
    invoke-static {v0}, LY1/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 225
    .line 226
    .line 227
    :goto_12
    const-string v5, "SegmentTemplate"

    .line 228
    .line 229
    invoke-static {v0, v5}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-eqz v5, :cond_e

    .line 234
    .line 235
    if-eqz v1, :cond_13

    .line 236
    .line 237
    if-eqz v6, :cond_11

    .line 238
    .line 239
    goto :goto_13

    .line 240
    :cond_11
    iget-object v6, v1, LY1/s;->a:LY1/j;

    .line 241
    .line 242
    :goto_13
    if-eqz v2, :cond_12

    .line 243
    .line 244
    goto :goto_14

    .line 245
    :cond_12
    iget-object v2, v1, LY1/n;->f:Ljava/util/List;

    .line 246
    .line 247
    :cond_13
    :goto_14
    move-object/from16 v19, v2

    .line 248
    .line 249
    move-object v8, v6

    .line 250
    new-instance v7, LY1/p;

    .line 251
    .line 252
    invoke-static/range {p11 .. p12}, LQ1/x;->K(J)J

    .line 253
    .line 254
    .line 255
    move-result-wide v24

    .line 256
    invoke-static/range {p3 .. p4}, LQ1/x;->K(J)J

    .line 257
    .line 258
    .line 259
    move-result-wide v26

    .line 260
    invoke-direct/range {v7 .. v27}, LY1/p;-><init>(LY1/j;JJJJJLjava/util/List;JLG6/t;LG6/t;JJ)V

    .line 261
    .line 262
    .line 263
    return-object v7
.end method

.method public static r(Lorg/xmlpull/v1/XmlPullParser;JJ)Ljava/util/ArrayList;
    .locals 14

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/4 v10, 0x0

    .line 14
    move-wide v4, v8

    .line 15
    move v3, v10

    .line 16
    move v6, v3

    .line 17
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 18
    .line 19
    .line 20
    const-string v7, "S"

    .line 21
    .line 22
    invoke-static {p0, v7}, LQ1/k;->q(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    if-eqz v7, :cond_6

    .line 27
    .line 28
    const-string v7, "t"

    .line 29
    .line 30
    const/4 v11, 0x0

    .line 31
    invoke-interface {p0, v11, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    if-nez v7, :cond_1

    .line 36
    .line 37
    move-wide v12, v8

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 40
    .line 41
    .line 42
    move-result-wide v12

    .line 43
    :goto_0
    if-eqz v3, :cond_2

    .line 44
    .line 45
    move-wide v3, v4

    .line 46
    move v5, v6

    .line 47
    move-wide v6, v12

    .line 48
    invoke-static/range {v0 .. v7}, LY1/e;->a(Ljava/util/ArrayList;JJIJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide v1

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move-wide v6, v12

    .line 54
    :goto_1
    cmp-long v3, v6, v8

    .line 55
    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    move-wide v1, v6

    .line 59
    :cond_3
    const-string v3, "d"

    .line 60
    .line 61
    invoke-interface {p0, v11, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    if-nez v3, :cond_4

    .line 66
    .line 67
    move-wide v4, v8

    .line 68
    goto :goto_2

    .line 69
    :cond_4
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 70
    .line 71
    .line 72
    move-result-wide v3

    .line 73
    move-wide v4, v3

    .line 74
    :goto_2
    const-string v3, "r"

    .line 75
    .line 76
    invoke-interface {p0, v11, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    if-nez v3, :cond_5

    .line 81
    .line 82
    move v6, v10

    .line 83
    goto :goto_3

    .line 84
    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    move v6, v3

    .line 89
    :goto_3
    const/4 v3, 0x1

    .line 90
    goto :goto_4

    .line 91
    :cond_6
    invoke-static {p0}, LY1/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 92
    .line 93
    .line 94
    :goto_4
    const-string v7, "SegmentTimeline"

    .line 95
    .line 96
    invoke-static {p0, v7}, LQ1/k;->p(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-eqz v7, :cond_0

    .line 101
    .line 102
    if-eqz v3, :cond_7

    .line 103
    .line 104
    sget p0, LQ1/x;->a:I

    .line 105
    .line 106
    sget-object v13, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 107
    .line 108
    const-wide/16 v11, 0x3e8

    .line 109
    .line 110
    move-wide v9, p1

    .line 111
    move-wide/from16 v7, p3

    .line 112
    .line 113
    invoke-static/range {v7 .. v13}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 114
    .line 115
    .line 116
    move-result-wide v7

    .line 117
    move-wide v3, v4

    .line 118
    move v5, v6

    .line 119
    move-wide v6, v7

    .line 120
    invoke-static/range {v0 .. v7}, LY1/e;->a(Ljava/util/ArrayList;JJIJ)J

    .line 121
    .line 122
    .line 123
    :cond_7
    return-object v0
.end method

.method public static s(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;LG6/t;)LG6/t;
    .locals 12

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x1

    .line 5
    const/4 v4, 0x0

    .line 6
    invoke-interface {p0, v4, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p0, :cond_a

    .line 11
    .line 12
    new-instance p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance p2, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v4, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v5, ""

    .line 28
    .line 29
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move v6, v1

    .line 33
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-ge v6, v7, :cond_9

    .line 38
    .line 39
    const-string v7, "$"

    .line 40
    .line 41
    invoke-virtual {p0, v7, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    if-ne v8, v0, :cond_0

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    new-instance v8, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    check-cast v9, Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-virtual {p1, v7, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    goto :goto_0

    .line 88
    :cond_0
    if-eq v8, v6, :cond_1

    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    new-instance v9, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    invoke-virtual {p1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    check-cast v10, Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v6, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    invoke-virtual {p1, v7, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move v6, v8

    .line 127
    goto :goto_0

    .line 128
    :cond_1
    const-string v8, "$$"

    .line 129
    .line 130
    invoke-virtual {p0, v8, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    if-eqz v8, :cond_2

    .line 135
    .line 136
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    new-instance v9, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    invoke-virtual {p1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    check-cast v10, Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    invoke-virtual {p1, v8, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    add-int/2addr v6, v2

    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_2
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    add-int/2addr v6, v3

    .line 175
    invoke-virtual {p0, v7, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    invoke-virtual {p0, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    const-string v8, "RepresentationID"

    .line 184
    .line 185
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    if-eqz v8, :cond_3

    .line 190
    .line 191
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    goto/16 :goto_5

    .line 199
    .line 200
    :cond_3
    const-string v8, "%0"

    .line 201
    .line 202
    invoke-virtual {v6, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    if-eq v8, v0, :cond_5

    .line 207
    .line 208
    invoke-virtual {v6, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    const-string v10, "d"

    .line 213
    .line 214
    invoke-virtual {v9, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    if-nez v11, :cond_4

    .line 219
    .line 220
    const-string v11, "x"

    .line 221
    .line 222
    invoke-virtual {v9, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 223
    .line 224
    .line 225
    move-result v11

    .line 226
    if-nez v11, :cond_4

    .line 227
    .line 228
    const-string v11, "X"

    .line 229
    .line 230
    invoke-virtual {v9, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 231
    .line 232
    .line 233
    move-result v11

    .line 234
    if-nez v11, :cond_4

    .line 235
    .line 236
    invoke-virtual {v9, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    :cond_4
    invoke-virtual {v6, v1, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    goto :goto_1

    .line 245
    :cond_5
    const-string v9, "%01d"

    .line 246
    .line 247
    :goto_1
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    sparse-switch v8, :sswitch_data_0

    .line 255
    .line 256
    .line 257
    :goto_2
    move v6, v0

    .line 258
    goto :goto_3

    .line 259
    :sswitch_0
    const-string v8, "Bandwidth"

    .line 260
    .line 261
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    if-nez v6, :cond_6

    .line 266
    .line 267
    goto :goto_2

    .line 268
    :cond_6
    move v6, v2

    .line 269
    goto :goto_3

    .line 270
    :sswitch_1
    const-string v8, "Time"

    .line 271
    .line 272
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v6

    .line 276
    if-nez v6, :cond_7

    .line 277
    .line 278
    goto :goto_2

    .line 279
    :cond_7
    move v6, v3

    .line 280
    goto :goto_3

    .line 281
    :sswitch_2
    const-string v8, "Number"

    .line 282
    .line 283
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v6

    .line 287
    if-nez v6, :cond_8

    .line 288
    .line 289
    goto :goto_2

    .line 290
    :cond_8
    move v6, v1

    .line 291
    :goto_3
    packed-switch v6, :pswitch_data_0

    .line 292
    .line 293
    .line 294
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 295
    .line 296
    const-string p2, "Invalid template: "

    .line 297
    .line 298
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    throw p1

    .line 306
    :pswitch_0
    const/4 v6, 0x3

    .line 307
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    goto :goto_4

    .line 315
    :pswitch_1
    const/4 v6, 0x4

    .line 316
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    goto :goto_4

    .line 324
    :pswitch_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object v6

    .line 328
    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    :goto_4
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 332
    .line 333
    .line 334
    move-result v6

    .line 335
    sub-int/2addr v6, v3

    .line 336
    invoke-virtual {v4, v6, v9}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    :goto_5
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    add-int/2addr v7, v3

    .line 343
    move v6, v7

    .line 344
    goto/16 :goto_0

    .line 345
    .line 346
    :cond_9
    new-instance p0, LG6/t;

    .line 347
    .line 348
    invoke-direct {p0, p1, p2, v4}, LG6/t;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 349
    .line 350
    .line 351
    return-object p0

    .line 352
    :cond_a
    return-object p2

    .line 353
    :sswitch_data_0
    .sparse-switch
        -0x74423897 -> :sswitch_2
        0x27c6ed -> :sswitch_1
        0x246e091 -> :sswitch_0
    .end sparse-switch

    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final t(Landroid/net/Uri;LS1/j;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, LY1/e;->a:Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 3
    .line 4
    invoke-virtual {v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-interface {v1, p2, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    const/4 v2, 0x2

    .line 16
    if-ne p2, v2, :cond_0

    .line 17
    .line 18
    const-string p2, "MPD"

    .line 19
    .line 20
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    invoke-static {v1, p1}, LY1/e;->k(Lorg/xmlpull/v1/XmlPullParser;Landroid/net/Uri;)LY1/c;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :catch_0
    move-exception p1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string p1, "inputStream does not contain a valid media presentation description"

    .line 38
    .line 39
    invoke-static {p1, v0}, LN1/D;->b(Ljava/lang/String;Ljava/lang/Exception;)LN1/D;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    throw p1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    :goto_0
    invoke-static {v0, p1}, LN1/D;->b(Ljava/lang/String;Ljava/lang/Exception;)LN1/D;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    throw p1
.end method
