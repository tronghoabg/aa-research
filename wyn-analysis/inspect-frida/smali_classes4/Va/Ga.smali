.class public final LVa/Ga;
.super LVa/Ba;
.source "SourceFile"


# static fields
.field public static final i:[C

.field public static j:I = 0x0

.field public static k:I = 0x1


# instance fields
.field public final synthetic c:I

.field public synthetic d:Ljava/lang/Object;

.field public synthetic e:Ljava/lang/Object;

.field public synthetic f:Ljava/lang/Object;

.field public synthetic g:Ljava/lang/Object;

.field public synthetic h:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x24

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/Ga;->i:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x55s
        0x53s
        0x2ds
        0x41s
        0x43s
        0x49s
        0x52s
        0x65s
        0x6ds
        0x6fs
        0x74s
        0x44s
        0x42s
        0x63s
        0x72s
        0x79s
        0x70s
        0x64s
        0x20s
        0x73s
        0x69s
        0x6es
        0x67s
        0x66s
        0x61s
        0x76s
        0x6cs
        0x68s
        0x2fs
        0x45s
        0x56s
        0x57s
        0x58s
        0x59s
        0x5as
        0x5bs
    .end array-data
.end method

.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x5

    iput v0, p0, LVa/Ga;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LVa/Ha;Ljava/lang/String;LVa/Pa;Ljava/lang/String;LVa/ya;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LVa/Ga;->c:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LVa/Ga;->h:Ljava/lang/Object;

    iput-object p2, p0, LVa/Ga;->d:Ljava/lang/Object;

    iput-object p3, p0, LVa/Ga;->f:Ljava/lang/Object;

    iput-object p4, p0, LVa/Ga;->e:Ljava/lang/Object;

    iput-object p5, p0, LVa/Ga;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LVa/Kb;Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;Ljava/lang/String;Landroid/app/Application;Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LVa/Ga;->c:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, LVa/Ga;->h:Ljava/lang/Object;

    iput-object p2, p0, LVa/Ga;->e:Ljava/lang/Object;

    iput-object p3, p0, LVa/Ga;->d:Ljava/lang/Object;

    iput-object p4, p0, LVa/Ga;->f:Ljava/lang/Object;

    iput-object p5, p0, LVa/Ga;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LVa/Lb;Lorg/json/JSONObject;Landroid/view/View;LVa/Vb;Landroid/view/KeyEvent$Callback;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LVa/Ga;->c:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, LVa/Ga;->d:Ljava/lang/Object;

    iput-object p2, p0, LVa/Ga;->e:Ljava/lang/Object;

    iput-object p3, p0, LVa/Ga;->f:Ljava/lang/Object;

    iput-object p4, p0, LVa/Ga;->g:Ljava/lang/Object;

    iput-object p5, p0, LVa/Ga;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(LVa/V;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LVa/Ba;I)V
    .locals 0

    .line 2
    iput p6, p0, LVa/Ga;->c:I

    iput-object p1, p0, LVa/Ga;->h:Ljava/lang/Object;

    iput-object p2, p0, LVa/Ga;->d:Ljava/lang/Object;

    iput-object p3, p0, LVa/Ga;->e:Ljava/lang/Object;

    iput-object p4, p0, LVa/Ga;->f:Ljava/lang/Object;

    iput-object p5, p0, LVa/Ga;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(ILjava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [C

    .line 6
    .line 7
    sget-object v0, LVa/a;->u:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sput p0, LVa/a;->t:I

    .line 11
    .line 12
    array-length p0, p1

    .line 13
    new-array p0, p0, [C

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    sput v1, LVa/a;->s:I

    .line 17
    .line 18
    :goto_0
    sget v1, LVa/a;->s:I

    .line 19
    .line 20
    array-length v2, p1

    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    aget-char v2, p1, v1

    .line 24
    .line 25
    sget v3, LVa/a;->t:I

    .line 26
    .line 27
    mul-int/2addr v3, v1

    .line 28
    xor-int/2addr v2, v3

    .line 29
    int-to-long v2, v2

    .line 30
    const-wide v4, 0x34a55e92357f4114L    # 4.357561307283612E-55

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    xor-long/2addr v2, v4

    .line 36
    long-to-int v2, v2

    .line 37
    int-to-char v2, v2

    .line 38
    aput-char v2, p0, v1

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    sput v1, LVa/a;->s:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    .line 50
    .line 51
    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    return-object p1

    .line 54
    :goto_1
    monitor-exit v0

    .line 55
    throw p0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    new-instance v3, Lorg/json/JSONObject;

    .line 8
    .line 9
    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-static {v4}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    add-int/lit8 v5, v5, 0x4

    .line 18
    .line 19
    invoke-static {v4, v4}, Landroid/view/View;->resolveSize(II)I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    add-int/lit8 v6, v6, 0x54

    .line 24
    .line 25
    int-to-byte v6, v6

    .line 26
    const-string v7, "\t\u0013\u00b7"

    .line 27
    .line 28
    invoke-static {v6, v5, v7}, LVa/Ga;->h(BILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    const/4 v7, 0x1

    .line 45
    const/4 v9, 0x2

    .line 46
    if-eq v6, v7, :cond_6

    .line 47
    .line 48
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/16 v6, 0x10

    .line 53
    .line 54
    shr-int/2addr v0, v6

    .line 55
    rsub-int/lit8 v0, v0, 0x2

    .line 56
    .line 57
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    shr-int/lit8 v10, v10, 0x16

    .line 62
    .line 63
    rsub-int/lit8 v10, v10, 0x37

    .line 64
    .line 65
    int-to-byte v10, v10

    .line 66
    const-string v11, "\u0013\u001a"

    .line 67
    .line 68
    invoke-static {v10, v0, v11}, LVa/Ga;->h(BILjava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const/16 v10, 0x30

    .line 81
    .line 82
    invoke-static {v10}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    add-int/lit8 v11, v11, -0x2c

    .line 87
    .line 88
    const-string v12, ""

    .line 89
    .line 90
    invoke-static {v12, v12}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 91
    .line 92
    .line 93
    move-result v13

    .line 94
    add-int/2addr v13, v10

    .line 95
    int-to-byte v10, v13

    .line 96
    const-string v13, "\u0012\u0019\u001c\u0008"

    .line 97
    .line 98
    invoke-static {v10, v11, v13}, LVa/Ga;->h(BILjava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    sget v10, LVa/Ha;->h:I

    .line 111
    .line 112
    add-int/lit8 v11, v10, 0x29

    .line 113
    .line 114
    rem-int/lit16 v13, v11, 0x80

    .line 115
    .line 116
    sput v13, LVa/Ha;->g:I

    .line 117
    .line 118
    rem-int/2addr v11, v9

    .line 119
    if-nez v11, :cond_5

    .line 120
    .line 121
    add-int/lit8 v10, v10, 0x65

    .line 122
    .line 123
    rem-int/lit16 v11, v10, 0x80

    .line 124
    .line 125
    sput v11, LVa/Ha;->g:I

    .line 126
    .line 127
    rem-int/2addr v10, v9

    .line 128
    sget-object v11, LVa/Ha;->e:Ljava/lang/String;

    .line 129
    .line 130
    if-eqz v10, :cond_0

    .line 131
    .line 132
    const/16 v10, 0x57

    .line 133
    .line 134
    div-int/2addr v10, v4

    .line 135
    :cond_0
    new-instance v10, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    const-wide/16 v13, 0x0

    .line 141
    .line 142
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-static {v5, v4}, Landroid/util/Base64;->decode([BI)[B

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    array-length v15, v5

    .line 151
    invoke-static {v5, v6, v15}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 152
    .line 153
    .line 154
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    .line 155
    :try_start_1
    invoke-static {v0}, LVa/pb;->Q(Ljava/lang/String;)[B

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v3}, LVa/pb;->Q(Ljava/lang/String;)[B

    .line 160
    .line 161
    .line 162
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 163
    const/16 v15, 0xa

    .line 164
    .line 165
    :try_start_2
    new-array v15, v15, [I

    .line 166
    .line 167
    fill-array-data v15, :array_0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 168
    .line 169
    .line 170
    :try_start_3
    invoke-static {v12}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 171
    .line 172
    .line 173
    move-result v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 174
    move/from16 p0, v6

    .line 175
    .line 176
    rsub-int/lit8 v6, v16, 0x13

    .line 177
    .line 178
    :try_start_4
    invoke-static {v6, v15}, LVa/pb;->B(I[I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    invoke-static {v6}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    new-instance v15, Ljavax/crypto/spec/PBEKeySpec;

    .line 191
    .line 192
    invoke-virtual {v11}, Ljava/lang/String;->toCharArray()[C

    .line 193
    .line 194
    .line 195
    move-result-object v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 196
    const/16 v16, 0x0

    .line 197
    .line 198
    const/16 v8, 0x100

    .line 199
    .line 200
    :try_start_5
    invoke-direct {v15, v11, v3, v7, v8}, Ljavax/crypto/spec/PBEKeySpec;-><init>([C[BII)V

    .line 201
    .line 202
    .line 203
    const/16 v3, 0x12

    .line 204
    .line 205
    new-array v3, v3, [I

    .line 206
    .line 207
    fill-array-data v3, :array_1

    .line 208
    .line 209
    .line 210
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 211
    .line 212
    .line 213
    move-result-wide v7

    .line 214
    cmp-long v7, v7, v13

    .line 215
    .line 216
    add-int/lit8 v7, v7, 0x21

    .line 217
    .line 218
    invoke-static {v7, v3}, LVa/pb;->B(I[I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    const v7, -0x58df8887

    .line 227
    .line 228
    .line 229
    const v8, 0x8230bb3

    .line 230
    .line 231
    .line 232
    filled-new-array {v8, v7}, [I

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    const v11, 0x1000002

    .line 241
    .line 242
    .line 243
    add-int/2addr v8, v11

    .line 244
    invoke-static {v8, v7}, LVa/pb;->B(I[I)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    invoke-static {v3, v7}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-virtual {v3, v15}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    new-instance v7, Ljavax/crypto/spec/IvParameterSpec;

    .line 261
    .line 262
    invoke-virtual {v6}, Ljavax/crypto/Cipher;->getBlockSize()I

    .line 263
    .line 264
    .line 265
    move-result v8

    .line 266
    invoke-direct {v7, v0, v4, v8}, Ljavax/crypto/spec/IvParameterSpec;-><init>([BII)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v6, v9, v3, v7}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 270
    .line 271
    .line 272
    new-instance v3, Ljavax/crypto/CipherInputStream;

    .line 273
    .line 274
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 275
    .line 276
    invoke-direct {v0, v5}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 277
    .line 278
    .line 279
    invoke-direct {v3, v0, v6}, Ljavax/crypto/CipherInputStream;-><init>(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 280
    .line 281
    .line 282
    const v0, -0x55290443

    .line 283
    .line 284
    .line 285
    const v5, 0x465734ea

    .line 286
    .line 287
    .line 288
    const v6, -0x7d697777

    .line 289
    .line 290
    .line 291
    const v7, 0x1271c835

    .line 292
    .line 293
    .line 294
    :try_start_6
    filled-new-array {v7, v6, v5, v0}, [I

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 299
    .line 300
    .line 301
    move-result v11

    .line 302
    int-to-byte v11, v11

    .line 303
    add-int/lit8 v11, v11, 0x6

    .line 304
    .line 305
    invoke-static {v11, v8}, LVa/pb;->B(I[I)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v8

    .line 309
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    const/16 v8, 0x2000

    .line 313
    .line 314
    new-array v8, v8, [B

    .line 315
    .line 316
    invoke-virtual {v3, v8}, Ljava/io/InputStream;->read([B)I

    .line 317
    .line 318
    .line 319
    move-result v11
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 320
    sget v15, LVa/pb;->b:I

    .line 321
    .line 322
    add-int/lit8 v15, v15, 0x69

    .line 323
    .line 324
    rem-int/lit16 v15, v15, 0x80

    .line 325
    .line 326
    sput v15, LVa/pb;->c:I

    .line 327
    .line 328
    :goto_0
    if-ltz v11, :cond_1

    .line 329
    .line 330
    :try_start_7
    new-instance v15, Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 331
    .line 332
    move/from16 v17, v9

    .line 333
    .line 334
    :try_start_8
    filled-new-array {v7, v6, v5, v0}, [I

    .line 335
    .line 336
    .line 337
    move-result-object v9

    .line 338
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 339
    .line 340
    .line 341
    move-result v16

    .line 342
    const/16 v18, 0x0

    .line 343
    .line 344
    cmpl-float v16, v16, v18

    .line 345
    .line 346
    rsub-int/lit8 v0, v16, 0x5

    .line 347
    .line 348
    invoke-static {v0, v9}, LVa/pb;->B(I[I)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-direct {v15, v8, v4, v11, v0}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v3, v8}, Ljava/io/InputStream;->read([B)I

    .line 363
    .line 364
    .line 365
    move-result v11
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 366
    move/from16 v9, v17

    .line 367
    .line 368
    const v0, -0x55290443

    .line 369
    .line 370
    .line 371
    goto :goto_0

    .line 372
    :catchall_0
    move-exception v0

    .line 373
    :goto_1
    move-object v8, v3

    .line 374
    goto :goto_4

    .line 375
    :catchall_1
    move-exception v0

    .line 376
    move/from16 v17, v9

    .line 377
    .line 378
    goto :goto_1

    .line 379
    :cond_1
    move/from16 v17, v9

    .line 380
    .line 381
    :try_start_9
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_a

    .line 382
    .line 383
    .line 384
    goto/16 :goto_6

    .line 385
    .line 386
    :catchall_2
    move-exception v0

    .line 387
    move/from16 v17, v9

    .line 388
    .line 389
    :goto_2
    move-object/from16 v8, v16

    .line 390
    .line 391
    goto :goto_4

    .line 392
    :catchall_3
    move-exception v0

    .line 393
    :goto_3
    move/from16 v17, v9

    .line 394
    .line 395
    const/16 v16, 0x0

    .line 396
    .line 397
    goto :goto_2

    .line 398
    :catchall_4
    move-exception v0

    .line 399
    move/from16 p0, v6

    .line 400
    .line 401
    goto :goto_3

    .line 402
    :catchall_5
    move-exception v0

    .line 403
    move/from16 p0, v6

    .line 404
    .line 405
    goto :goto_3

    .line 406
    :goto_4
    :try_start_a
    new-array v3, v1, [I

    .line 407
    .line 408
    fill-array-data v3, :array_2

    .line 409
    .line 410
    .line 411
    invoke-static {v12, v4, v4}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 412
    .line 413
    .line 414
    move-result v5

    .line 415
    add-int/2addr v5, v2

    .line 416
    invoke-static {v5, v3}, LVa/pb;->B(I[I)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    const/16 v5, 0xc

    .line 425
    .line 426
    new-array v5, v5, [I

    .line 427
    .line 428
    fill-array-data v5, :array_3

    .line 429
    .line 430
    .line 431
    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 432
    .line 433
    .line 434
    move-result v6

    .line 435
    rsub-int/lit8 v6, v6, 0x17

    .line 436
    .line 437
    invoke-static {v6, v5}, LVa/pb;->B(I[I)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v5

    .line 441
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v5

    .line 445
    invoke-static {v3, v5, v0, v4}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 446
    .line 447
    .line 448
    if-eqz v8, :cond_3

    .line 449
    .line 450
    :try_start_b
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 451
    .line 452
    .line 453
    goto :goto_6

    .line 454
    :catchall_6
    move-exception v0

    .line 455
    if-eqz v8, :cond_2

    .line 456
    .line 457
    :try_start_c
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 458
    .line 459
    .line 460
    sget v3, LVa/pb;->b:I

    .line 461
    .line 462
    add-int/lit8 v3, v3, 0x9

    .line 463
    .line 464
    rem-int/lit16 v3, v3, 0x80

    .line 465
    .line 466
    sput v3, LVa/pb;->c:I

    .line 467
    .line 468
    :catchall_7
    :cond_2
    :try_start_d
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 469
    :catchall_8
    move-exception v0

    .line 470
    goto :goto_5

    .line 471
    :catchall_9
    move-exception v0

    .line 472
    move/from16 p0, v6

    .line 473
    .line 474
    move/from16 v17, v9

    .line 475
    .line 476
    :goto_5
    new-array v1, v1, [I

    .line 477
    .line 478
    fill-array-data v1, :array_4

    .line 479
    .line 480
    .line 481
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    shr-int/lit8 v3, v3, 0x10

    .line 486
    .line 487
    add-int/2addr v3, v2

    .line 488
    invoke-static {v3, v1}, LVa/pb;->B(I[I)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    new-array v2, v2, [I

    .line 497
    .line 498
    fill-array-data v2, :array_5

    .line 499
    .line 500
    .line 501
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 502
    .line 503
    .line 504
    move-result-wide v5

    .line 505
    cmp-long v3, v5, v13

    .line 506
    .line 507
    add-int/lit8 v3, v3, 0x1a

    .line 508
    .line 509
    invoke-static {v3, v2}, LVa/pb;->B(I[I)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    invoke-static {v1, v2, v0, v4}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 518
    .line 519
    .line 520
    :catchall_a
    :cond_3
    :goto_6
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    sget v1, LVa/Ga;->j:I

    .line 525
    .line 526
    add-int/lit8 v1, v1, 0x77

    .line 527
    .line 528
    rem-int/lit16 v2, v1, 0x80

    .line 529
    .line 530
    sput v2, LVa/Ga;->k:I

    .line 531
    .line 532
    rem-int/lit8 v1, v1, 0x2

    .line 533
    .line 534
    if-nez v1, :cond_4

    .line 535
    .line 536
    const/16 v1, 0x5f

    .line 537
    .line 538
    div-int/2addr v1, v4

    .line 539
    :cond_4
    return-object v0

    .line 540
    :cond_5
    const/16 v16, 0x0

    .line 541
    .line 542
    throw v16

    .line 543
    :cond_6
    move/from16 v17, v9

    .line 544
    .line 545
    const/16 v16, 0x0

    .line 546
    .line 547
    sget v1, LVa/Ga;->j:I

    .line 548
    .line 549
    add-int/lit8 v1, v1, 0x13

    .line 550
    .line 551
    rem-int/lit16 v1, v1, 0x80

    .line 552
    .line 553
    sput v1, LVa/Ga;->k:I

    .line 554
    .line 555
    add-int/lit8 v1, v1, 0x5d

    .line 556
    .line 557
    rem-int/lit16 v2, v1, 0x80

    .line 558
    .line 559
    sput v2, LVa/Ga;->j:I

    .line 560
    .line 561
    rem-int/lit8 v1, v1, 0x2

    .line 562
    .line 563
    if-nez v1, :cond_7

    .line 564
    .line 565
    return-object v0

    .line 566
    :cond_7
    throw v16

    .line 567
    :array_0
    .array-data 4
        -0x71868377
        -0x2a12da84
        0x65f6405a
        -0x6e549940
        -0x67fb2ed7
        -0x5a16aa27
        -0x5dddb1d7
        -0x67d5fb24
        0x2969028b
        0x7aa10e7e
    .end array-data

    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    :array_1
    .array-data 4
        -0xba07ac6
        -0xe4bac93
        -0x3078aa29
        0x61a2ef23
        0x46a67ca8
        0x5fc963f7
        0x6d304e2
        -0x676c5f53
        -0xbc81fe7
        0x775b2b98
        0x730c256f
        -0x7ff732c3
        -0x4f26ab03
        -0x3380d9cd    # -6.6885836E7f
        -0x4a3375f7
        0x385a7ce2
        -0x4002f197
        0x2f24e317
    .end array-data

    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    :array_2
    .array-data 4
        -0x67c9ea10
        0x2764f3c1
        -0x2a7c6108
        0x444c0566
        -0x698e447b
        -0xa79c95a
        -0x74d0fd0c
        -0x18f0ea35
    .end array-data

    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    :array_3
    .array-data 4
        -0x204ea7fb
        -0x27cc17ce
        0x1ebbd768
        -0x1b5909c2
        -0x6230d1a
        0x7d014a71
        0x4901f3bf
        0x79730b16
        0x595d6a87
        0x6af071bd
        0xf0c17e1
        0x3ad21376
    .end array-data

    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    :array_4
    .array-data 4
        -0x67c9ea10
        0x2764f3c1
        -0x2a7c6108
        0x444c0566
        -0x698e447b
        -0xa79c95a
        -0x74d0fd0c
        -0x18f0ea35
    .end array-data

    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    :array_5
    .array-data 4
        -0x204ea7fb
        -0x27cc17ce
        -0x52cb623a
        0x683129ae
        0x3287f346
        0x53f27261
        0x624436a5
        0x2272a528
        -0x198aea58
        -0x3908147d
        0x1e4cd8a
        0x1ab12728
        0x345610ce
        0x75e75a4f
    .end array-data
.end method

.method private final g()V
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/16 v0, 0x5e

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/16 v3, 0xc

    .line 7
    .line 8
    const/16 v4, 0x37

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const v6, 0x8c5d

    .line 12
    .line 13
    .line 14
    :try_start_0
    iget-object v7, v1, LVa/Ga;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v7, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    .line 17
    .line 18
    invoke-virtual {v7}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->getUserId()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    iget-object v8, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v8, LVa/Kb;

    .line 25
    .line 26
    iget-object v9, v1, LVa/Ga;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v9, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    .line 29
    .line 30
    invoke-virtual {v9}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->getLogLevel()Lcom/ironsource/adqualitysdk/sdk/ISAdQualityLogLevel;

    .line 31
    .line 32
    .line 33
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 34
    :try_start_1
    sget v10, LVa/Kb;->x:I

    .line 35
    .line 36
    add-int/lit8 v10, v10, 0x19

    .line 37
    .line 38
    rem-int/lit16 v11, v10, 0x80

    .line 39
    .line 40
    sput v11, LVa/Kb;->w:I

    .line 41
    .line 42
    rem-int/lit8 v10, v10, 0x2

    .line 43
    .line 44
    if-eqz v10, :cond_0

    .line 45
    .line 46
    invoke-virtual {v8, v9}, LVa/Kb;->A(Lcom/ironsource/adqualitysdk/sdk/ISAdQualityLogLevel;)V

    .line 47
    .line 48
    .line 49
    const/16 v8, 0x29

    .line 50
    .line 51
    div-int/2addr v8, v5

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {v8, v9}, LVa/Kb;->A(Lcom/ironsource/adqualitysdk/sdk/ISAdQualityLogLevel;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    sget v8, LVa/Kb;->w:I

    .line 57
    .line 58
    add-int/lit8 v8, v8, 0x2d

    .line 59
    .line 60
    rem-int/lit16 v9, v8, 0x80

    .line 61
    .line 62
    sput v9, LVa/Kb;->x:I

    .line 63
    .line 64
    rem-int/lit8 v8, v8, 0x2

    .line 65
    .line 66
    if-nez v8, :cond_1

    .line 67
    .line 68
    const/16 v8, 0x16

    .line 69
    .line 70
    div-int/2addr v8, v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 71
    :cond_1
    :try_start_2
    const-string v8, "\u4155\ucd2d\u59ff\ue476\u7001\ufca9\u0b53\u97eb\u2385\uae02\u3af2\u46a0"

    .line 72
    .line 73
    const-string v9, ""

    .line 74
    .line 75
    invoke-static {v9, v5, v5}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    sub-int v9, v6, v9

    .line 80
    .line 81
    invoke-static {v9, v8}, LVa/Ga;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    new-instance v9, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    const-string v10, "\u415d\u4001\u438b\u4511\u4491\u4612\u499a\u4b20\u4ab6\u4c2e\u4fb4\u513a\u50f0\u525c\u55c7\u5755\u56cc\u581f\u5bd3\u5d45\u5cf8\u5e23\u61ed\u637c\u62e5\u6437"

    .line 95
    .line 96
    const-string v11, ""

    .line 97
    .line 98
    invoke-static {v11}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    rsub-int v11, v11, 0x17b

    .line 103
    .line 104
    invoke-static {v11, v10}, LVa/Ga;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    iget-object v10, v1, LVa/Ga;->d:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v10, Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    invoke-static {v8, v9}, LVa/Ab;->Y(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-object v8, v1, LVa/Ga;->f:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v8, Landroid/app/Application;

    .line 132
    .line 133
    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    invoke-static {v8}, LVa/Xa;->a(Landroid/content/Context;)LVa/Xa;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    monitor-enter v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 142
    :try_start_3
    sget v9, LVa/Xa;->k:I

    .line 143
    .line 144
    add-int/lit8 v9, v9, 0x53

    .line 145
    .line 146
    rem-int/lit16 v10, v9, 0x80

    .line 147
    .line 148
    sput v10, LVa/Xa;->l:I

    .line 149
    .line 150
    rem-int/lit8 v9, v9, 0x2

    .line 151
    .line 152
    const/4 v10, 0x1

    .line 153
    iput-boolean v10, v8, LVa/Xa;->b:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :catchall_0
    move-exception v0

    .line 157
    move/from16 v26, v6

    .line 158
    .line 159
    goto/16 :goto_d

    .line 160
    .line 161
    :goto_1
    :try_start_4
    monitor-exit v8

    .line 162
    iget-object v8, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v8, LVa/Kb;

    .line 165
    .line 166
    iget-object v9, v1, LVa/Ga;->e:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v9, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    .line 169
    .line 170
    invoke-virtual {v9}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->isTestMode()Z

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    sget v11, LVa/Kb;->x:I

    .line 175
    .line 176
    add-int/lit8 v11, v11, 0x17

    .line 177
    .line 178
    rem-int/lit16 v12, v11, 0x80

    .line 179
    .line 180
    sput v12, LVa/Kb;->w:I

    .line 181
    .line 182
    rem-int/lit8 v11, v11, 0x2

    .line 183
    .line 184
    if-nez v11, :cond_21

    .line 185
    .line 186
    invoke-virtual {v8, v9}, LVa/Kb;->B(Z)V

    .line 187
    .line 188
    .line 189
    sget v8, LVa/Kb;->w:I

    .line 190
    .line 191
    add-int/lit8 v8, v8, 0x1f

    .line 192
    .line 193
    rem-int/lit16 v9, v8, 0x80

    .line 194
    .line 195
    sput v9, LVa/Kb;->x:I

    .line 196
    .line 197
    rem-int/lit8 v8, v8, 0x2

    .line 198
    .line 199
    if-eqz v8, :cond_20

    .line 200
    .line 201
    iget-object v8, v1, LVa/Ga;->e:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v8, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    .line 204
    .line 205
    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->isTestMode()Z

    .line 206
    .line 207
    .line 208
    move-result v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 209
    if-eqz v8, :cond_2

    .line 210
    .line 211
    :try_start_5
    const-string v8, "\u4155\ucd2d\u59ff\ue476\u7001\ufca9\u0b53\u97eb\u2385\uae02\u3af2\u46a0"

    .line 212
    .line 213
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    shr-int/lit8 v9, v9, 0x10

    .line 218
    .line 219
    add-int/2addr v9, v6

    .line 220
    invoke-static {v9, v8}, LVa/Ga;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    const-string v9, "\u4143\u9cd2\ufa48\ud9cf\u3741\u12f9\u7079\u4f84\uad0d\u888a\ue672\uc59d\u232f\u7eef\u5c18\ubb92\u9910\uf4c3\ud20d\u307e\u0fb8\u6d6b\u48e7\ua643\u85d9\ue31b\u3ed5\u1c40\u7ba4\u5937\ub4e6\u9239\uf191\ucf00\u2a8e\u082c\u6787\u45f3\ua37b\ufeb8\udc78\u3bf9\u1947\u74dc\u5201\ub18e\u8f77\ueafd\uc801\u27b5\u052f\u609f\ube0c\u9d94\ufb4e\ud962\u34f5\u126f\u71ea\u4f29\uaac4\u885a\ue7d5\uc559\u2099\u7e3c\u5dbe\ubb24\u96f5\uf403\ud38c\u3110\u0c89\u6a4b\u4865\ua7f0\u856c\ue0e3\u3e16\u1ddf\u7b41\u5683\ub44e\u93b8\uf12b\ucca4\u2a2f\u0987\u6718\u429e\ua006\uffc8\uddb1\u3b3e"

    .line 229
    .line 230
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 231
    .line 232
    .line 233
    move-result v11

    .line 234
    shr-int/lit8 v11, v11, 0x10

    .line 235
    .line 236
    const v13, 0xdd87

    .line 237
    .line 238
    .line 239
    add-int/2addr v11, v13

    .line 240
    invoke-static {v11, v9}, LVa/Ga;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v9

    .line 244
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v9

    .line 248
    invoke-static {v8, v9}, LVa/Ab;->k(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 249
    .line 250
    .line 251
    goto :goto_2

    .line 252
    :catchall_1
    move-exception v0

    .line 253
    move-object v8, v0

    .line 254
    move/from16 v26, v6

    .line 255
    .line 256
    goto/16 :goto_e

    .line 257
    .line 258
    :cond_2
    :goto_2
    :try_start_6
    const-string v8, "\u4175\ud3b1\u64e6\uf907\u0a57\u9c8a\u31b2\u42b7\ud723\u6844\ufad4\u0fec\ua0e3\u3522\u4660\ud892\u6df0\ufe0e\u1321\ua46e"

    .line 259
    .line 260
    invoke-static {v5, v5}, Landroid/view/View;->getDefaultSize(II)I

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    const v11, 0x92cb

    .line 265
    .line 266
    .line 267
    sub-int/2addr v11, v9

    .line 268
    invoke-static {v11, v8}, LVa/Ga;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 277
    .line 278
    .line 279
    :catchall_2
    :try_start_7
    iget-object v8, v1, LVa/Ga;->g:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v8, Landroid/app/Activity;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 282
    .line 283
    if-eqz v8, :cond_3

    .line 284
    .line 285
    :try_start_8
    invoke-static {v8}, LVa/qb;->g(Landroid/app/Activity;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 286
    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_3
    :try_start_9
    iget-object v8, v1, LVa/Ga;->f:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v8, Landroid/app/Application;

    .line 292
    .line 293
    sget v9, LVa/qb;->d:I

    .line 294
    .line 295
    add-int/lit8 v9, v9, 0x1d

    .line 296
    .line 297
    rem-int/lit16 v9, v9, 0x80

    .line 298
    .line 299
    sput v9, LVa/qb;->e:I

    .line 300
    .line 301
    if-eqz v8, :cond_4

    .line 302
    .line 303
    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 304
    .line 305
    .line 306
    move-result-object v8

    .line 307
    invoke-static {v8}, LVa/qb;->i(Landroid/content/Context;)V

    .line 308
    .line 309
    .line 310
    :cond_4
    sget v8, LVa/qb;->d:I

    .line 311
    .line 312
    add-int/lit8 v8, v8, 0x13

    .line 313
    .line 314
    rem-int/lit16 v9, v8, 0x80

    .line 315
    .line 316
    sput v9, LVa/qb;->e:I

    .line 317
    .line 318
    rem-int/lit8 v8, v8, 0x2

    .line 319
    .line 320
    if-eqz v8, :cond_1f

    .line 321
    .line 322
    :goto_3
    iget-object v8, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v8, LVa/Kb;

    .line 325
    .line 326
    invoke-static {v8}, LVa/Kb;->k(LVa/Kb;)LVa/H;

    .line 327
    .line 328
    .line 329
    move-result-object v8

    .line 330
    iget-object v9, v1, LVa/Ga;->d:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v9, Ljava/lang/String;

    .line 333
    .line 334
    sget v11, LVa/H;->j:I

    .line 335
    .line 336
    iput-object v9, v8, LVa/H;->d:Ljava/lang/String;

    .line 337
    .line 338
    add-int/lit8 v11, v11, 0x41

    .line 339
    .line 340
    rem-int/lit16 v8, v11, 0x80

    .line 341
    .line 342
    sput v8, LVa/H;->k:I

    .line 343
    .line 344
    rem-int/lit8 v11, v11, 0x2

    .line 345
    .line 346
    if-eqz v11, :cond_1e

    .line 347
    .line 348
    iget-object v8, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v8, LVa/Kb;

    .line 351
    .line 352
    invoke-static {v8}, LVa/Kb;->k(LVa/Kb;)LVa/H;

    .line 353
    .line 354
    .line 355
    move-result-object v8

    .line 356
    iget-object v9, v1, LVa/Ga;->e:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v9, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    .line 359
    .line 360
    invoke-virtual {v9}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->getInitializationSource()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v9

    .line 364
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    sget v11, LVa/H;->k:I

    .line 368
    .line 369
    add-int/lit8 v11, v11, 0x4b

    .line 370
    .line 371
    rem-int/lit16 v11, v11, 0x80

    .line 372
    .line 373
    sput v11, LVa/H;->j:I

    .line 374
    .line 375
    iput-object v9, v8, LVa/H;->f:Ljava/lang/String;

    .line 376
    .line 377
    add-int/lit8 v11, v11, 0x4d

    .line 378
    .line 379
    rem-int/lit16 v8, v11, 0x80

    .line 380
    .line 381
    sput v8, LVa/H;->k:I

    .line 382
    .line 383
    rem-int/lit8 v11, v11, 0x2

    .line 384
    .line 385
    if-eqz v11, :cond_1d

    .line 386
    .line 387
    iget-object v8, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v8, LVa/Kb;

    .line 390
    .line 391
    invoke-static {v8}, LVa/Kb;->k(LVa/Kb;)LVa/H;

    .line 392
    .line 393
    .line 394
    move-result-object v8

    .line 395
    iget-object v9, v1, LVa/Ga;->e:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v9, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    .line 398
    .line 399
    invoke-virtual {v9}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->getCoppa()Z

    .line 400
    .line 401
    .line 402
    move-result v9

    .line 403
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    sget v11, LVa/H;->j:I

    .line 407
    .line 408
    add-int/lit8 v11, v11, 0x49

    .line 409
    .line 410
    rem-int/lit16 v13, v11, 0x80

    .line 411
    .line 412
    sput v13, LVa/H;->k:I

    .line 413
    .line 414
    rem-int/lit8 v11, v11, 0x2

    .line 415
    .line 416
    if-eqz v11, :cond_1c

    .line 417
    .line 418
    iput-boolean v9, v8, LVa/H;->b:Z

    .line 419
    .line 420
    iget-object v8, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v8, LVa/Kb;

    .line 423
    .line 424
    invoke-static {v8}, LVa/Kb;->k(LVa/Kb;)LVa/H;

    .line 425
    .line 426
    .line 427
    move-result-object v8

    .line 428
    iget-object v9, v1, LVa/Ga;->e:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v9, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    .line 431
    .line 432
    invoke-virtual {v9}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->getDeviceIdType()Lcom/ironsource/adqualitysdk/sdk/ISAdQualityDeviceIdType;

    .line 433
    .line 434
    .line 435
    move-result-object v9

    .line 436
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    sget v11, LVa/H;->k:I

    .line 440
    .line 441
    add-int/lit8 v11, v11, 0x33

    .line 442
    .line 443
    rem-int/lit16 v11, v11, 0x80

    .line 444
    .line 445
    sput v11, LVa/H;->j:I

    .line 446
    .line 447
    iput-object v9, v8, LVa/H;->h:Ljava/lang/Object;

    .line 448
    .line 449
    add-int/2addr v11, v10

    .line 450
    rem-int/lit16 v11, v11, 0x80

    .line 451
    .line 452
    sput v11, LVa/H;->k:I

    .line 453
    .line 454
    iget-object v8, v1, LVa/Ga;->e:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v8, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    .line 457
    .line 458
    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->getMetaData()Ljava/util/Map;

    .line 459
    .line 460
    .line 461
    move-result-object v8
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 462
    const-wide/16 v13, 0x0

    .line 463
    .line 464
    const/4 v9, 0x0

    .line 465
    if-eqz v8, :cond_6

    .line 466
    .line 467
    :try_start_a
    iget-object v8, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v8, LVa/Kb;

    .line 470
    .line 471
    invoke-static {v8}, LVa/Kb;->k(LVa/Kb;)LVa/H;

    .line 472
    .line 473
    .line 474
    move-result-object v8

    .line 475
    iget-object v11, v1, LVa/Ga;->e:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v11, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    .line 478
    .line 479
    invoke-virtual {v11}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->getMetaData()Ljava/util/Map;

    .line 480
    .line 481
    .line 482
    move-result-object v11

    .line 483
    iget-object v8, v8, LVa/H;->i:Ljava/util/AbstractMap;

    .line 484
    .line 485
    check-cast v8, Lj$/util/concurrent/ConcurrentHashMap;

    .line 486
    .line 487
    invoke-virtual {v8}, Lj$/util/concurrent/ConcurrentHashMap;->clear()V

    .line 488
    .line 489
    .line 490
    if-eqz v11, :cond_5

    .line 491
    .line 492
    sget v15, LVa/H;->j:I

    .line 493
    .line 494
    add-int/2addr v15, v4

    .line 495
    rem-int/lit16 v15, v15, 0x80

    .line 496
    .line 497
    sput v15, LVa/H;->k:I

    .line 498
    .line 499
    invoke-virtual {v8, v11}, Lj$/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 500
    .line 501
    .line 502
    sget v8, LVa/H;->j:I

    .line 503
    .line 504
    add-int/lit8 v8, v8, 0x15

    .line 505
    .line 506
    rem-int/lit16 v8, v8, 0x80

    .line 507
    .line 508
    sput v8, LVa/H;->k:I

    .line 509
    .line 510
    :cond_5
    iget-object v8, v1, LVa/Ga;->e:Ljava/lang/Object;

    .line 511
    .line 512
    check-cast v8, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    .line 513
    .line 514
    invoke-virtual {v8}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->getMetaData()Ljava/util/Map;

    .line 515
    .line 516
    .line 517
    move-result-object v8

    .line 518
    const-string v11, "\u4161\u0010\uc3ba\u8548\u44df\u079e\uc92f\u88a4\u4a4f\u0df0\ucc89\u8e2d\u51f7\u1341\ud2fd\u9594\u5721\u16cf"

    .line 519
    .line 520
    invoke-static {v9, v9}, Landroid/graphics/PointF;->length(FF)F

    .line 521
    .line 522
    .line 523
    move-result v15

    .line 524
    cmpl-float v15, v15, v9

    .line 525
    .line 526
    add-int/lit16 v15, v15, 0x4165

    .line 527
    .line 528
    invoke-static {v15, v11}, LVa/Ga;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v11

    .line 532
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v11

    .line 536
    invoke-interface {v8, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v8

    .line 540
    if-eqz v8, :cond_6

    .line 541
    .line 542
    iget-object v8, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v8, LVa/Kb;

    .line 545
    .line 546
    invoke-static {v8}, LVa/Kb;->k(LVa/Kb;)LVa/H;

    .line 547
    .line 548
    .line 549
    move-result-object v8

    .line 550
    iget-object v11, v1, LVa/Ga;->e:Ljava/lang/Object;

    .line 551
    .line 552
    check-cast v11, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    .line 553
    .line 554
    invoke-virtual {v11}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->getMetaData()Ljava/util/Map;

    .line 555
    .line 556
    .line 557
    move-result-object v11

    .line 558
    const-string v15, "\u4161\u0010\uc3ba\u8548\u44df\u079e\uc92f\u88a4\u4a4f\u0df0\ucc89\u8e2d\u51f7\u1341\ud2fd\u9594\u5721\u16cf"

    .line 559
    .line 560
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 561
    .line 562
    .line 563
    move-result-wide v16

    .line 564
    move/from16 v18, v4

    .line 565
    .line 566
    cmp-long v4, v16, v13

    .line 567
    .line 568
    rsub-int v4, v4, 0x4166

    .line 569
    .line 570
    invoke-static {v4, v15}, LVa/Ga;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v4

    .line 574
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v4

    .line 578
    invoke-interface {v11, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v4

    .line 582
    check-cast v4, Ljava/lang/String;

    .line 583
    .line 584
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    sget v11, LVa/H;->j:I

    .line 588
    .line 589
    add-int/lit8 v11, v11, 0x65

    .line 590
    .line 591
    rem-int/lit16 v11, v11, 0x80

    .line 592
    .line 593
    sput v11, LVa/H;->k:I

    .line 594
    .line 595
    iput-object v4, v8, LVa/H;->g:Ljava/io/Serializable;

    .line 596
    .line 597
    add-int/lit8 v11, v11, 0x49

    .line 598
    .line 599
    rem-int/lit16 v11, v11, 0x80

    .line 600
    .line 601
    sput v11, LVa/H;->j:I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 602
    .line 603
    goto :goto_4

    .line 604
    :cond_6
    move/from16 v18, v4

    .line 605
    .line 606
    :goto_4
    :try_start_b
    iget-object v4, v1, LVa/Ga;->f:Ljava/lang/Object;

    .line 607
    .line 608
    check-cast v4, Landroid/app/Application;

    .line 609
    .line 610
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 611
    .line 612
    .line 613
    move-result-object v4

    .line 614
    iget-object v8, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v8, LVa/Kb;

    .line 617
    .line 618
    sget v11, LVa/Kb;->w:I

    .line 619
    .line 620
    add-int/lit8 v11, v11, 0x41

    .line 621
    .line 622
    rem-int/lit16 v11, v11, 0x80

    .line 623
    .line 624
    sput v11, LVa/Kb;->x:I

    .line 625
    .line 626
    iput-object v4, v8, LVa/Kb;->i:Landroid/content/Context;

    .line 627
    .line 628
    add-int/lit8 v11, v11, 0x7d

    .line 629
    .line 630
    rem-int/lit16 v11, v11, 0x80

    .line 631
    .line 632
    sput v11, LVa/Kb;->w:I

    .line 633
    .line 634
    new-instance v11, LVa/z;

    .line 635
    .line 636
    invoke-direct {v11, v4}, LVa/z;-><init>(Landroid/content/Context;)V

    .line 637
    .line 638
    .line 639
    sget v15, LVa/Kb;->w:I

    .line 640
    .line 641
    add-int/lit8 v15, v15, 0x51

    .line 642
    .line 643
    rem-int/lit16 v15, v15, 0x80

    .line 644
    .line 645
    sput v15, LVa/Kb;->x:I

    .line 646
    .line 647
    iput-object v11, v8, LVa/Kb;->m:LVa/z;

    .line 648
    .line 649
    add-int/lit8 v15, v15, 0x7b

    .line 650
    .line 651
    rem-int/lit16 v8, v15, 0x80

    .line 652
    .line 653
    sput v8, LVa/Kb;->w:I

    .line 654
    .line 655
    rem-int/lit8 v15, v15, 0x2

    .line 656
    .line 657
    if-nez v15, :cond_1b

    .line 658
    .line 659
    iget-object v8, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 660
    .line 661
    check-cast v8, LVa/Kb;

    .line 662
    .line 663
    new-instance v11, LVa/Ra;

    .line 664
    .line 665
    invoke-static {v8}, LVa/Kb;->w(LVa/Kb;)LVa/A;

    .line 666
    .line 667
    .line 668
    sget v15, LVa/A;->f:I

    .line 669
    .line 670
    add-int/lit8 v15, v15, 0x41

    .line 671
    .line 672
    rem-int/lit16 v15, v15, 0x80

    .line 673
    .line 674
    sput v15, LVa/A;->e:I

    .line 675
    .line 676
    const-string v15, ""

    .line 677
    .line 678
    invoke-static {v15, v15, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 679
    .line 680
    .line 681
    move-result v15

    .line 682
    int-to-short v15, v15

    .line 683
    invoke-static {v5}, Landroid/graphics/Color;->red(I)I

    .line 684
    .line 685
    .line 686
    move-result v16
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 687
    const v17, -0x6146d6dc

    .line 688
    .line 689
    .line 690
    move/from16 v26, v6

    .line 691
    .line 692
    add-int v6, v16, v17

    .line 693
    .line 694
    :try_start_c
    invoke-static {v13, v14}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 695
    .line 696
    .line 697
    move-result v16

    .line 698
    const/16 v17, 0x0

    .line 699
    .line 700
    add-int/lit8 v12, v16, -0x27

    .line 701
    .line 702
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 703
    .line 704
    .line 705
    move-result v16

    .line 706
    shr-int/lit8 v16, v16, 0x10

    .line 707
    .line 708
    const v19, 0x11f86478

    .line 709
    .line 710
    .line 711
    move-wide/from16 v27, v13

    .line 712
    .line 713
    sub-int v13, v19, v16

    .line 714
    .line 715
    invoke-static {v5, v9, v9}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 716
    .line 717
    .line 718
    move-result v14

    .line 719
    cmpl-float v9, v14, v9

    .line 720
    .line 721
    add-int/lit8 v9, v9, 0x4b

    .line 722
    .line 723
    int-to-byte v9, v9

    .line 724
    invoke-static {v6, v12, v9, v15, v13}, LVa/A;->a(IIBSI)Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v6

    .line 728
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v6

    .line 732
    sget v9, LVa/A;->f:I

    .line 733
    .line 734
    add-int/lit8 v9, v9, 0x77

    .line 735
    .line 736
    rem-int/lit16 v9, v9, 0x80

    .line 737
    .line 738
    sput v9, LVa/A;->e:I

    .line 739
    .line 740
    new-instance v9, Ljava/lang/String;

    .line 741
    .line 742
    new-array v12, v3, [C

    .line 743
    .line 744
    fill-array-data v12, :array_0

    .line 745
    .line 746
    .line 747
    invoke-direct {v9, v12}, Ljava/lang/String;-><init>([C)V

    .line 748
    .line 749
    .line 750
    invoke-direct {v11, v4, v6, v9}, LVa/Ra;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 751
    .line 752
    .line 753
    sget v6, LVa/Kb;->w:I

    .line 754
    .line 755
    add-int/lit8 v9, v6, 0x47

    .line 756
    .line 757
    rem-int/lit16 v12, v9, 0x80

    .line 758
    .line 759
    sput v12, LVa/Kb;->x:I

    .line 760
    .line 761
    rem-int/lit8 v9, v9, 0x2

    .line 762
    .line 763
    if-nez v9, :cond_7

    .line 764
    .line 765
    iput-object v11, v8, LVa/Kb;->o:LVa/Ra;

    .line 766
    .line 767
    div-int/lit8 v8, v18, 0x0

    .line 768
    .line 769
    goto :goto_5

    .line 770
    :cond_7
    iput-object v11, v8, LVa/Kb;->o:LVa/Ra;

    .line 771
    .line 772
    :goto_5
    add-int/lit8 v6, v6, 0x65

    .line 773
    .line 774
    rem-int/lit16 v6, v6, 0x80

    .line 775
    .line 776
    sput v6, LVa/Kb;->x:I

    .line 777
    .line 778
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 779
    .line 780
    .line 781
    move-result-object v19

    .line 782
    iget-object v6, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v6, LVa/Kb;

    .line 785
    .line 786
    invoke-static {v6}, LVa/Kb;->o(LVa/Kb;)LVa/z;

    .line 787
    .line 788
    .line 789
    move-result-object v21

    .line 790
    iget-object v6, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 791
    .line 792
    check-cast v6, LVa/Kb;

    .line 793
    .line 794
    invoke-static {v6}, LVa/Kb;->w(LVa/Kb;)LVa/A;

    .line 795
    .line 796
    .line 797
    move-result-object v22

    .line 798
    new-instance v6, LVa/Eb;

    .line 799
    .line 800
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 801
    .line 802
    .line 803
    iput-object v1, v6, LVa/Eb;->a:LVa/Ga;

    .line 804
    .line 805
    iget-object v8, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 806
    .line 807
    check-cast v8, LVa/Kb;

    .line 808
    .line 809
    sget v9, LVa/Kb;->w:I

    .line 810
    .line 811
    add-int/lit8 v9, v9, 0x23

    .line 812
    .line 813
    rem-int/lit16 v11, v9, 0x80

    .line 814
    .line 815
    sput v11, LVa/Kb;->x:I

    .line 816
    .line 817
    rem-int/lit8 v9, v9, 0x2

    .line 818
    .line 819
    if-nez v9, :cond_8

    .line 820
    .line 821
    invoke-virtual {v8}, LVa/Kb;->g()Z

    .line 822
    .line 823
    .line 824
    move-result v8

    .line 825
    const/16 v9, 0x32

    .line 826
    .line 827
    div-int/2addr v9, v5

    .line 828
    :goto_6
    move/from16 v24, v8

    .line 829
    .line 830
    goto :goto_7

    .line 831
    :cond_8
    invoke-virtual {v8}, LVa/Kb;->g()Z

    .line 832
    .line 833
    .line 834
    move-result v8

    .line 835
    goto :goto_6

    .line 836
    :goto_7
    sget v8, LVa/Kb;->x:I

    .line 837
    .line 838
    add-int/lit8 v8, v8, 0x79

    .line 839
    .line 840
    rem-int/lit16 v9, v8, 0x80

    .line 841
    .line 842
    sput v9, LVa/Kb;->w:I

    .line 843
    .line 844
    rem-int/lit8 v8, v8, 0x2

    .line 845
    .line 846
    if-eqz v8, :cond_9

    .line 847
    .line 848
    div-int/lit8 v8, v2, 0x0

    .line 849
    .line 850
    :cond_9
    move-object/from16 v20, v4

    .line 851
    .line 852
    move-object/from16 v23, v6

    .line 853
    .line 854
    invoke-virtual/range {v19 .. v24}, LVa/G;->Q(Landroid/content/Context;LVa/z;LVa/A;LVa/Eb;Z)V

    .line 855
    .line 856
    .line 857
    move-object/from16 v4, v20

    .line 858
    .line 859
    iget-object v6, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 860
    .line 861
    check-cast v6, LVa/Kb;

    .line 862
    .line 863
    new-instance v8, LVa/Ha;

    .line 864
    .line 865
    iget-object v9, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 866
    .line 867
    check-cast v9, LVa/Kb;

    .line 868
    .line 869
    invoke-static {v9}, LVa/Kb;->o(LVa/Kb;)LVa/z;

    .line 870
    .line 871
    .line 872
    move-result-object v9

    .line 873
    iget-object v11, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 874
    .line 875
    check-cast v11, LVa/Kb;

    .line 876
    .line 877
    invoke-static {v11}, LVa/Kb;->w(LVa/Kb;)LVa/A;

    .line 878
    .line 879
    .line 880
    move-result-object v11

    .line 881
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 882
    .line 883
    .line 884
    sget v12, LVa/A;->f:I

    .line 885
    .line 886
    add-int/lit8 v13, v12, 0x31

    .line 887
    .line 888
    rem-int/lit16 v14, v13, 0x80

    .line 889
    .line 890
    sput v14, LVa/A;->e:I

    .line 891
    .line 892
    rem-int/lit8 v13, v13, 0x2

    .line 893
    .line 894
    if-nez v13, :cond_1a

    .line 895
    .line 896
    add-int/lit8 v12, v12, 0x35

    .line 897
    .line 898
    rem-int/lit16 v12, v12, 0x80

    .line 899
    .line 900
    sput v12, LVa/A;->e:I

    .line 901
    .line 902
    iget-object v11, v11, LVa/A;->c:Ljava/lang/String;

    .line 903
    .line 904
    invoke-direct {v8, v4, v9, v11}, LVa/Ha;-><init>(Landroid/content/Context;LVa/z;Ljava/lang/String;)V

    .line 905
    .line 906
    .line 907
    sget v9, LVa/Kb;->x:I

    .line 908
    .line 909
    add-int/lit8 v11, v9, 0x53

    .line 910
    .line 911
    rem-int/lit16 v11, v11, 0x80

    .line 912
    .line 913
    sput v11, LVa/Kb;->w:I

    .line 914
    .line 915
    iput-object v8, v6, LVa/Kb;->p:LVa/Ha;

    .line 916
    .line 917
    add-int/lit8 v9, v9, 0x47

    .line 918
    .line 919
    rem-int/lit16 v6, v9, 0x80

    .line 920
    .line 921
    sput v6, LVa/Kb;->w:I

    .line 922
    .line 923
    rem-int/lit8 v9, v9, 0x2

    .line 924
    .line 925
    if-nez v9, :cond_19

    .line 926
    .line 927
    invoke-static {v4}, LVa/a;->u(Landroid/content/Context;)Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    move-result-object v14

    .line 931
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 932
    .line 933
    .line 934
    move-result-object v6

    .line 935
    new-instance v8, LVa/Fb;

    .line 936
    .line 937
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 938
    .line 939
    .line 940
    iput-object v1, v8, LVa/Fb;->b:LVa/Ga;

    .line 941
    .line 942
    iput-object v14, v8, LVa/Fb;->a:Ljava/lang/String;

    .line 943
    .line 944
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 945
    .line 946
    .line 947
    sget v9, LVa/G;->E:I

    .line 948
    .line 949
    add-int/lit8 v9, v9, 0x6f

    .line 950
    .line 951
    rem-int/lit16 v9, v9, 0x80

    .line 952
    .line 953
    sput v9, LVa/G;->F:I

    .line 954
    .line 955
    iget-object v9, v6, LVa/G;->m:Landroid/os/Handler;

    .line 956
    .line 957
    if-eqz v9, :cond_a

    .line 958
    .line 959
    new-instance v11, LVa/y;

    .line 960
    .line 961
    invoke-direct {v11, v3}, LVa/y;-><init>(I)V

    .line 962
    .line 963
    .line 964
    iput-object v6, v11, LVa/y;->e:Ljava/lang/Object;

    .line 965
    .line 966
    iput-object v8, v11, LVa/y;->d:Ljava/lang/Object;

    .line 967
    .line 968
    invoke-virtual {v9, v11}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 969
    .line 970
    .line 971
    sget v3, LVa/G;->F:I

    .line 972
    .line 973
    add-int/lit8 v3, v3, 0x5

    .line 974
    .line 975
    rem-int/lit16 v3, v3, 0x80

    .line 976
    .line 977
    sput v3, LVa/G;->E:I

    .line 978
    .line 979
    :cond_a
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 980
    .line 981
    .line 982
    move-result-object v3

    .line 983
    new-instance v6, LVa/j;

    .line 984
    .line 985
    invoke-direct {v6, v2}, LVa/j;-><init>(I)V

    .line 986
    .line 987
    .line 988
    iput-object v1, v6, LVa/j;->b:Ljava/lang/Object;

    .line 989
    .line 990
    invoke-virtual {v3, v6}, LVa/G;->d0(LVa/j;)V

    .line 991
    .line 992
    .line 993
    iget-object v2, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 994
    .line 995
    check-cast v2, LVa/Kb;

    .line 996
    .line 997
    sget v3, LVa/Kb;->x:I

    .line 998
    .line 999
    add-int/lit8 v3, v3, 0x23

    .line 1000
    .line 1001
    rem-int/lit16 v6, v3, 0x80

    .line 1002
    .line 1003
    sput v6, LVa/Kb;->w:I

    .line 1004
    .line 1005
    rem-int/lit8 v3, v3, 0x2

    .line 1006
    .line 1007
    if-nez v3, :cond_18

    .line 1008
    .line 1009
    invoke-virtual {v2, v4}, LVa/Kb;->F(Landroid/content/Context;)V

    .line 1010
    .line 1011
    .line 1012
    iget-object v2, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 1013
    .line 1014
    check-cast v2, LVa/Kb;

    .line 1015
    .line 1016
    new-instance v19, LVa/x;

    .line 1017
    .line 1018
    invoke-static {v2}, LVa/Kb;->k(LVa/Kb;)LVa/H;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v21

    .line 1022
    iget-object v3, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 1023
    .line 1024
    check-cast v3, LVa/Kb;

    .line 1025
    .line 1026
    invoke-static {v3}, LVa/Kb;->w(LVa/Kb;)LVa/A;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v22

    .line 1030
    iget-object v3, v1, LVa/Ga;->g:Ljava/lang/Object;

    .line 1031
    .line 1032
    check-cast v3, Landroid/app/Activity;

    .line 1033
    .line 1034
    if-eqz v3, :cond_b

    .line 1035
    .line 1036
    move/from16 v23, v10

    .line 1037
    .line 1038
    goto :goto_8

    .line 1039
    :cond_b
    move/from16 v23, v5

    .line 1040
    .line 1041
    :goto_8
    new-instance v3, LVa/Ra;

    .line 1042
    .line 1043
    invoke-direct {v3, v1}, LVa/Ra;-><init>(Ljava/lang/Object;)V

    .line 1044
    .line 1045
    .line 1046
    move-object/from16 v25, v3

    .line 1047
    .line 1048
    move-object/from16 v20, v4

    .line 1049
    .line 1050
    move-object/from16 v24, v14

    .line 1051
    .line 1052
    invoke-direct/range {v19 .. v25}, LVa/x;-><init>(Landroid/content/Context;LVa/H;LVa/A;ZLjava/lang/String;LVa/Ra;)V

    .line 1053
    .line 1054
    .line 1055
    move-object/from16 v3, v19

    .line 1056
    .line 1057
    move-object/from16 v4, v20

    .line 1058
    .line 1059
    sget v6, LVa/Kb;->w:I

    .line 1060
    .line 1061
    add-int/lit8 v8, v6, 0x67

    .line 1062
    .line 1063
    rem-int/lit16 v9, v8, 0x80

    .line 1064
    .line 1065
    sput v9, LVa/Kb;->x:I

    .line 1066
    .line 1067
    rem-int/lit8 v8, v8, 0x2

    .line 1068
    .line 1069
    if-eqz v8, :cond_17

    .line 1070
    .line 1071
    iput-object v3, v2, LVa/Kb;->n:LVa/x;

    .line 1072
    .line 1073
    add-int/lit8 v6, v6, 0x49

    .line 1074
    .line 1075
    rem-int/lit16 v6, v6, 0x80

    .line 1076
    .line 1077
    sput v6, LVa/Kb;->x:I

    .line 1078
    .line 1079
    iget-object v2, v1, LVa/Ga;->e:Ljava/lang/Object;

    .line 1080
    .line 1081
    check-cast v2, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;

    .line 1082
    .line 1083
    invoke-virtual {v2}, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityConfig;->isUserIdSet()Z

    .line 1084
    .line 1085
    .line 1086
    move-result v2

    .line 1087
    if-nez v2, :cond_c

    .line 1088
    .line 1089
    iget-object v2, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 1090
    .line 1091
    check-cast v2, LVa/Kb;

    .line 1092
    .line 1093
    invoke-static {v2}, LVa/Kb;->k(LVa/Kb;)LVa/H;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v2

    .line 1097
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1098
    .line 1099
    .line 1100
    sget v3, LVa/H;->j:I

    .line 1101
    .line 1102
    add-int/lit8 v6, v3, 0x3b

    .line 1103
    .line 1104
    rem-int/lit16 v7, v6, 0x80

    .line 1105
    .line 1106
    sput v7, LVa/H;->k:I

    .line 1107
    .line 1108
    rem-int/lit8 v6, v6, 0x2

    .line 1109
    .line 1110
    iput-boolean v10, v2, LVa/H;->c:Z

    .line 1111
    .line 1112
    add-int/lit8 v3, v3, 0x27

    .line 1113
    .line 1114
    rem-int/lit16 v2, v3, 0x80

    .line 1115
    .line 1116
    sput v2, LVa/H;->k:I

    .line 1117
    .line 1118
    rem-int/lit8 v3, v3, 0x2

    .line 1119
    .line 1120
    if-eqz v3, :cond_d

    .line 1121
    .line 1122
    iget-object v2, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 1123
    .line 1124
    check-cast v2, LVa/Kb;

    .line 1125
    .line 1126
    invoke-static {v2}, LVa/Kb;->i(LVa/Kb;)LVa/x;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v2

    .line 1130
    invoke-virtual {v2}, LVa/x;->i()Ljava/lang/String;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v7

    .line 1134
    :cond_c
    move-object v8, v7

    .line 1135
    goto :goto_a

    .line 1136
    :catchall_3
    move-exception v0

    .line 1137
    :goto_9
    move-object v8, v0

    .line 1138
    goto/16 :goto_e

    .line 1139
    .line 1140
    :cond_d
    throw v17

    .line 1141
    :goto_a
    iget-object v2, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 1142
    .line 1143
    check-cast v2, LVa/Kb;

    .line 1144
    .line 1145
    invoke-virtual {v2}, LVa/Kb;->t()Z

    .line 1146
    .line 1147
    .line 1148
    move-result v2

    .line 1149
    if-eqz v2, :cond_e

    .line 1150
    .line 1151
    iget-object v2, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 1152
    .line 1153
    check-cast v2, LVa/Kb;

    .line 1154
    .line 1155
    invoke-static {v2}, LVa/Kb;->i(LVa/Kb;)LVa/x;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v2

    .line 1159
    new-instance v3, LVa/Gb;

    .line 1160
    .line 1161
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1162
    .line 1163
    .line 1164
    iput-object v1, v3, LVa/Gb;->a:LVa/Ga;

    .line 1165
    .line 1166
    invoke-virtual {v2, v3}, LVa/x;->k(LVa/Gb;)V

    .line 1167
    .line 1168
    .line 1169
    :cond_e
    iget-object v2, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 1170
    .line 1171
    check-cast v2, LVa/Kb;

    .line 1172
    .line 1173
    invoke-static {v2}, LVa/Kb;->i(LVa/Kb;)LVa/x;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v2

    .line 1177
    new-instance v3, LVa/Db;

    .line 1178
    .line 1179
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1180
    .line 1181
    .line 1182
    iput-object v1, v3, LVa/Db;->a:LVa/Ga;

    .line 1183
    .line 1184
    invoke-virtual {v2, v3}, LVa/x;->E(LVa/Db;)V

    .line 1185
    .line 1186
    .line 1187
    new-instance v15, LVa/la;

    .line 1188
    .line 1189
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 1190
    .line 1191
    .line 1192
    new-instance v2, Ljava/util/HashMap;

    .line 1193
    .line 1194
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 1195
    .line 1196
    .line 1197
    iput-object v2, v15, LVa/la;->a:Ljava/util/HashMap;

    .line 1198
    .line 1199
    new-instance v2, Landroid/os/Handler;

    .line 1200
    .line 1201
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v3

    .line 1205
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1206
    .line 1207
    .line 1208
    iget-object v2, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 1209
    .line 1210
    check-cast v2, LVa/Kb;

    .line 1211
    .line 1212
    new-instance v11, LVa/V;

    .line 1213
    .line 1214
    sget v3, LVa/Kb;->x:I

    .line 1215
    .line 1216
    add-int/lit8 v6, v3, 0x5b

    .line 1217
    .line 1218
    rem-int/lit16 v6, v6, 0x80

    .line 1219
    .line 1220
    sput v6, LVa/Kb;->w:I

    .line 1221
    .line 1222
    iget-object v12, v2, LVa/Kb;->p:LVa/Ha;

    .line 1223
    .line 1224
    add-int/lit8 v3, v3, 0x5f

    .line 1225
    .line 1226
    rem-int/lit16 v3, v3, 0x80

    .line 1227
    .line 1228
    sput v3, LVa/Kb;->w:I

    .line 1229
    .line 1230
    invoke-static {v2}, LVa/Kb;->i(LVa/Kb;)LVa/x;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v13

    .line 1234
    new-instance v3, LVa/Hb;

    .line 1235
    .line 1236
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1237
    .line 1238
    .line 1239
    iput-object v1, v3, LVa/Hb;->a:LVa/Ga;

    .line 1240
    .line 1241
    move-object/from16 v16, v3

    .line 1242
    .line 1243
    move-object/from16 v14, v24

    .line 1244
    .line 1245
    invoke-direct/range {v11 .. v16}, LVa/V;-><init>(LVa/Ha;LVa/x;Ljava/lang/String;LVa/la;LVa/Hb;)V

    .line 1246
    .line 1247
    .line 1248
    sget v3, LVa/Kb;->w:I

    .line 1249
    .line 1250
    add-int/lit8 v3, v3, 0x65

    .line 1251
    .line 1252
    rem-int/lit16 v3, v3, 0x80

    .line 1253
    .line 1254
    sput v3, LVa/Kb;->x:I

    .line 1255
    .line 1256
    iput-object v11, v2, LVa/Kb;->k:LVa/V;

    .line 1257
    .line 1258
    add-int/lit8 v3, v3, 0x55

    .line 1259
    .line 1260
    rem-int/lit16 v2, v3, 0x80

    .line 1261
    .line 1262
    sput v2, LVa/Kb;->w:I

    .line 1263
    .line 1264
    rem-int/lit8 v3, v3, 0x2

    .line 1265
    .line 1266
    if-nez v3, :cond_16

    .line 1267
    .line 1268
    iget-object v2, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 1269
    .line 1270
    check-cast v2, LVa/Kb;

    .line 1271
    .line 1272
    invoke-static {v2}, LVa/Kb;->j(LVa/Kb;)LVa/V;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v2

    .line 1276
    new-instance v3, LVa/Eb;

    .line 1277
    .line 1278
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1279
    .line 1280
    .line 1281
    iput-object v1, v3, LVa/Eb;->a:LVa/Ga;

    .line 1282
    .line 1283
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1284
    .line 1285
    .line 1286
    sget v6, LVa/V;->p:I

    .line 1287
    .line 1288
    add-int/lit8 v7, v6, 0x17

    .line 1289
    .line 1290
    rem-int/lit16 v9, v7, 0x80

    .line 1291
    .line 1292
    sput v9, LVa/V;->q:I

    .line 1293
    .line 1294
    rem-int/lit8 v7, v7, 0x2

    .line 1295
    .line 1296
    iget-object v2, v2, LVa/V;->n:LVa/f0;

    .line 1297
    .line 1298
    if-eqz v7, :cond_14

    .line 1299
    .line 1300
    sget v7, LVa/f0;->h:I

    .line 1301
    .line 1302
    iput-object v3, v2, LVa/f0;->a:LVa/Eb;

    .line 1303
    .line 1304
    add-int/lit8 v7, v7, 0x6f

    .line 1305
    .line 1306
    rem-int/lit16 v2, v7, 0x80

    .line 1307
    .line 1308
    sput v2, LVa/f0;->g:I

    .line 1309
    .line 1310
    rem-int/lit8 v7, v7, 0x2

    .line 1311
    .line 1312
    if-eqz v7, :cond_f

    .line 1313
    .line 1314
    div-int/2addr v0, v5

    .line 1315
    :cond_f
    add-int/lit8 v6, v6, 0x33

    .line 1316
    .line 1317
    rem-int/lit16 v0, v6, 0x80

    .line 1318
    .line 1319
    sput v0, LVa/V;->q:I

    .line 1320
    .line 1321
    rem-int/lit8 v6, v6, 0x2

    .line 1322
    .line 1323
    if-nez v6, :cond_10

    .line 1324
    .line 1325
    const/16 v0, 0x12

    .line 1326
    .line 1327
    div-int/2addr v0, v5

    .line 1328
    :cond_10
    iget-object v0, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 1329
    .line 1330
    check-cast v0, LVa/Kb;

    .line 1331
    .line 1332
    new-instance v2, LVa/z;

    .line 1333
    .line 1334
    invoke-static {v0}, LVa/Kb;->j(LVa/Kb;)LVa/V;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v3

    .line 1338
    invoke-direct {v2, v3}, LVa/z;-><init>(LVa/V;)V

    .line 1339
    .line 1340
    .line 1341
    sget v3, LVa/Kb;->w:I

    .line 1342
    .line 1343
    add-int/lit8 v3, v3, 0x2b

    .line 1344
    .line 1345
    rem-int/lit16 v6, v3, 0x80

    .line 1346
    .line 1347
    sput v6, LVa/Kb;->x:I

    .line 1348
    .line 1349
    rem-int/lit8 v3, v3, 0x2

    .line 1350
    .line 1351
    if-eqz v3, :cond_13

    .line 1352
    .line 1353
    iput-object v2, v0, LVa/Kb;->r:LVa/z;

    .line 1354
    .line 1355
    iget-object v0, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 1356
    .line 1357
    check-cast v0, LVa/Kb;

    .line 1358
    .line 1359
    new-instance v2, LVa/r;

    .line 1360
    .line 1361
    invoke-static {v0}, LVa/Kb;->i(LVa/Kb;)LVa/x;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v3

    .line 1365
    invoke-direct {v2, v3}, LVa/r;-><init>(LVa/x;)V

    .line 1366
    .line 1367
    .line 1368
    sget v3, LVa/Kb;->x:I

    .line 1369
    .line 1370
    add-int/lit8 v3, v3, 0x7

    .line 1371
    .line 1372
    rem-int/lit16 v3, v3, 0x80

    .line 1373
    .line 1374
    sput v3, LVa/Kb;->w:I

    .line 1375
    .line 1376
    iput-object v2, v0, LVa/Kb;->s:LVa/r;

    .line 1377
    .line 1378
    add-int/lit8 v3, v3, 0x53

    .line 1379
    .line 1380
    rem-int/lit16 v3, v3, 0x80

    .line 1381
    .line 1382
    sput v3, LVa/Kb;->x:I

    .line 1383
    .line 1384
    const-string v0, "\u4155\ucd2d\u59ff\ue476\u7001\ufca9\u0b53\u97eb\u2385\uae02\u3af2\u46a0"

    .line 1385
    .line 1386
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 1387
    .line 1388
    .line 1389
    move-result v2

    .line 1390
    shr-int/lit8 v2, v2, 0x10

    .line 1391
    .line 1392
    sub-int v6, v26, v2

    .line 1393
    .line 1394
    invoke-static {v6, v0}, LVa/Ga;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v0

    .line 1398
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v0

    .line 1402
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1403
    .line 1404
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1405
    .line 1406
    .line 1407
    const-string v3, "\u415d\uc61e\u4fe7\ud77b\u5c21\ue5dc\u6d63\uf217\u7bb5\u8341\u0817\u9194\u197c\u9eda\u27ea\uaf50\u34f0\ubd9c\uc524\u4afb\ud389\u5b37\ue0d5\u69cb\uf12a\u76ca\ufe6c\u0757\u8cdd\u1473\u9d16\u22e9\uaa14"

    .line 1408
    .line 1409
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1410
    .line 1411
    .line 1412
    move-result-wide v6

    .line 1413
    cmp-long v6, v6, v27

    .line 1414
    .line 1415
    const v7, 0x875a

    .line 1416
    .line 1417
    .line 1418
    sub-int/2addr v7, v6

    .line 1419
    invoke-static {v7, v3}, LVa/Ga;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v3

    .line 1423
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v3

    .line 1427
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1428
    .line 1429
    .line 1430
    iget-object v3, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 1431
    .line 1432
    check-cast v3, LVa/Kb;

    .line 1433
    .line 1434
    invoke-static {v3}, LVa/Kb;->w(LVa/Kb;)LVa/A;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v3

    .line 1438
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1439
    .line 1440
    .line 1441
    sget v6, LVa/A;->e:I

    .line 1442
    .line 1443
    add-int/lit8 v6, v6, 0x4d

    .line 1444
    .line 1445
    rem-int/lit16 v7, v6, 0x80

    .line 1446
    .line 1447
    sput v7, LVa/A;->f:I

    .line 1448
    .line 1449
    rem-int/lit8 v6, v6, 0x2

    .line 1450
    .line 1451
    iget-object v3, v3, LVa/A;->a:Ljava/lang/String;

    .line 1452
    .line 1453
    if-nez v6, :cond_11

    .line 1454
    .line 1455
    const/16 v6, 0x36

    .line 1456
    .line 1457
    div-int/2addr v6, v5

    .line 1458
    :cond_11
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v2

    .line 1465
    invoke-static {v0, v2}, LVa/Ab;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1466
    .line 1467
    .line 1468
    iget-object v0, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 1469
    .line 1470
    move-object v6, v0

    .line 1471
    check-cast v6, LVa/Kb;

    .line 1472
    .line 1473
    iget-object v0, v1, LVa/Ga;->g:Ljava/lang/Object;

    .line 1474
    .line 1475
    check-cast v0, Landroid/app/Activity;

    .line 1476
    .line 1477
    if-eqz v0, :cond_12

    .line 1478
    .line 1479
    move-object v7, v0

    .line 1480
    goto :goto_b

    .line 1481
    :cond_12
    move-object v7, v4

    .line 1482
    :goto_b
    sget v0, LVa/Kb;->x:I

    .line 1483
    .line 1484
    add-int/lit8 v0, v0, 0x1f

    .line 1485
    .line 1486
    rem-int/lit16 v0, v0, 0x80

    .line 1487
    .line 1488
    sput v0, LVa/Kb;->w:I

    .line 1489
    .line 1490
    const/4 v9, 0x1

    .line 1491
    const/4 v10, 0x0

    .line 1492
    const/4 v11, 0x1

    .line 1493
    invoke-virtual/range {v6 .. v11}, LVa/Kb;->r(Landroid/content/Context;Ljava/lang/String;ZZZ)V

    .line 1494
    .line 1495
    .line 1496
    sget v0, LVa/Kb;->x:I

    .line 1497
    .line 1498
    add-int/lit8 v0, v0, 0x77

    .line 1499
    .line 1500
    rem-int/lit16 v0, v0, 0x80

    .line 1501
    .line 1502
    sput v0, LVa/Kb;->w:I

    .line 1503
    .line 1504
    iget-object v0, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 1505
    .line 1506
    check-cast v0, LVa/Kb;

    .line 1507
    .line 1508
    invoke-static {v0, v4}, LVa/Kb;->q(LVa/Kb;Landroid/content/Context;)V

    .line 1509
    .line 1510
    .line 1511
    iget-object v0, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 1512
    .line 1513
    check-cast v0, LVa/Kb;

    .line 1514
    .line 1515
    sget v2, LVa/Kb;->w:I

    .line 1516
    .line 1517
    add-int/lit8 v2, v2, 0x5f

    .line 1518
    .line 1519
    rem-int/lit16 v3, v2, 0x80

    .line 1520
    .line 1521
    sput v3, LVa/Kb;->x:I

    .line 1522
    .line 1523
    rem-int/lit8 v2, v2, 0x2

    .line 1524
    .line 1525
    invoke-virtual {v0}, LVa/Kb;->v()V

    .line 1526
    .line 1527
    .line 1528
    iget-object v0, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 1529
    .line 1530
    check-cast v0, LVa/Kb;

    .line 1531
    .line 1532
    invoke-static {v0}, LVa/Kb;->d(LVa/Kb;)V

    .line 1533
    .line 1534
    .line 1535
    return-void

    .line 1536
    :cond_13
    iput-object v2, v0, LVa/Kb;->r:LVa/z;

    .line 1537
    .line 1538
    throw v17

    .line 1539
    :cond_14
    sget v4, LVa/f0;->h:I

    .line 1540
    .line 1541
    iput-object v3, v2, LVa/f0;->a:LVa/Eb;

    .line 1542
    .line 1543
    add-int/lit8 v4, v4, 0x6f

    .line 1544
    .line 1545
    rem-int/lit16 v2, v4, 0x80

    .line 1546
    .line 1547
    sput v2, LVa/f0;->g:I

    .line 1548
    .line 1549
    rem-int/lit8 v4, v4, 0x2

    .line 1550
    .line 1551
    if-eqz v4, :cond_15

    .line 1552
    .line 1553
    div-int/2addr v0, v5

    .line 1554
    :cond_15
    throw v17

    .line 1555
    :cond_16
    throw v17

    .line 1556
    :cond_17
    iput-object v3, v2, LVa/Kb;->n:LVa/x;

    .line 1557
    .line 1558
    throw v17

    .line 1559
    :cond_18
    invoke-virtual {v2, v4}, LVa/Kb;->F(Landroid/content/Context;)V

    .line 1560
    .line 1561
    .line 1562
    throw v17

    .line 1563
    :cond_19
    throw v17

    .line 1564
    :cond_1a
    throw v17

    .line 1565
    :catchall_4
    move-exception v0

    .line 1566
    :goto_c
    move/from16 v26, v6

    .line 1567
    .line 1568
    goto/16 :goto_9

    .line 1569
    .line 1570
    :cond_1b
    move/from16 v26, v6

    .line 1571
    .line 1572
    const/16 v17, 0x0

    .line 1573
    .line 1574
    throw v17

    .line 1575
    :cond_1c
    move/from16 v26, v6

    .line 1576
    .line 1577
    const/16 v17, 0x0

    .line 1578
    .line 1579
    iput-boolean v9, v8, LVa/H;->b:Z

    .line 1580
    .line 1581
    throw v17

    .line 1582
    :cond_1d
    move/from16 v26, v6

    .line 1583
    .line 1584
    const/16 v17, 0x0

    .line 1585
    .line 1586
    throw v17

    .line 1587
    :cond_1e
    move/from16 v26, v6

    .line 1588
    .line 1589
    const/16 v17, 0x0

    .line 1590
    .line 1591
    throw v17

    .line 1592
    :cond_1f
    move/from16 v26, v6

    .line 1593
    .line 1594
    const/16 v17, 0x0

    .line 1595
    .line 1596
    throw v17

    .line 1597
    :cond_20
    move/from16 v26, v6

    .line 1598
    .line 1599
    const/16 v17, 0x0

    .line 1600
    .line 1601
    throw v17

    .line 1602
    :cond_21
    move/from16 v26, v6

    .line 1603
    .line 1604
    const/16 v17, 0x0

    .line 1605
    .line 1606
    invoke-virtual {v8, v9}, LVa/Kb;->B(Z)V

    .line 1607
    .line 1608
    .line 1609
    throw v17
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 1610
    :goto_d
    :try_start_d
    monitor-exit v8
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 1611
    :try_start_e
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 1612
    :catchall_5
    move-exception v0

    .line 1613
    goto :goto_d

    .line 1614
    :catchall_6
    move-exception v0

    .line 1615
    goto :goto_c

    .line 1616
    :goto_e
    const-string v0, "\u4151\u0a6d\ud770\ua05a\u6d4a\u3603\u833f\u4c37\u1925\ue203\uaf13\u780c\uc5fc\u8ef2\u5bf4\u24d8\uf1ca\ubac8\u07f2\ud08c\u9d9b\u66b2\u3382\ufcb8\u4869\u1566\ude66\uab54\u7454\uc152\u8a7e\u5712\u2030\ued34"

    .line 1617
    .line 1618
    invoke-static {v5}, Landroid/graphics/Color;->red(I)I

    .line 1619
    .line 1620
    .line 1621
    move-result v2

    .line 1622
    rsub-int v2, v2, 0x4b0b

    .line 1623
    .line 1624
    invoke-static {v2, v0}, LVa/Ga;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v0

    .line 1628
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v7

    .line 1632
    const-string v0, "\u4155\ucd2d\u59ff\ue476\u7001\ufca9\u0b53\u97eb\u2385\uae02\u3af2\u46a0"

    .line 1633
    .line 1634
    invoke-static {v5}, Landroid/os/Process;->getThreadPriority(I)I

    .line 1635
    .line 1636
    .line 1637
    move-result v2

    .line 1638
    add-int/lit8 v2, v2, 0x14

    .line 1639
    .line 1640
    shr-int/lit8 v2, v2, 0x6

    .line 1641
    .line 1642
    add-int v2, v2, v26

    .line 1643
    .line 1644
    invoke-static {v2, v0}, LVa/Ga;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v0

    .line 1648
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v6

    .line 1652
    const/4 v11, 0x1

    .line 1653
    const/4 v9, 0x1

    .line 1654
    const/4 v10, 0x0

    .line 1655
    invoke-static/range {v6 .. v11}, LVa/Ab;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V

    .line 1656
    .line 1657
    .line 1658
    iget-object v0, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 1659
    .line 1660
    check-cast v0, LVa/Kb;

    .line 1661
    .line 1662
    sget-object v2, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;->EXCEPTION_ON_INIT:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;

    .line 1663
    .line 1664
    invoke-static {v0, v2, v7}, LVa/Kb;->x(LVa/Kb;Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;Ljava/lang/String;)V

    .line 1665
    .line 1666
    .line 1667
    return-void

    .line 1668
    nop

    .line 1669
    :array_0
    .array-data 2
        0x42s
        0x30s
        0x72s
        0x31s
        0x73s
        0x57s
        0x40s
        0x73s
        0x48s
        0x33s
        0x72s
        0x65s
    .end array-data
.end method

.method public static h(BILjava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->B:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sget-object v1, LVa/Ga;->i:[C

    .line 11
    .line 12
    new-array v2, p1, [C

    .line 13
    .line 14
    rem-int/lit8 v3, p1, 0x2

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    add-int/lit8 p1, p1, -0x1

    .line 19
    .line 20
    aget-char v3, p2, p1

    .line 21
    .line 22
    sub-int/2addr v3, p0

    .line 23
    int-to-char v3, v3

    .line 24
    aput-char v3, v2, p1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_3

    .line 29
    :cond_0
    :goto_0
    const/4 v3, 0x1

    .line 30
    if-le p1, v3, :cond_4

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    sput v3, LVa/Ab;->A:I

    .line 34
    .line 35
    :goto_1
    sget v3, LVa/Ab;->A:I

    .line 36
    .line 37
    if-ge v3, p1, :cond_4

    .line 38
    .line 39
    aget-char v4, p2, v3

    .line 40
    .line 41
    add-int/lit8 v5, v3, 0x1

    .line 42
    .line 43
    aget-char v6, p2, v5

    .line 44
    .line 45
    if-ne v4, v6, :cond_1

    .line 46
    .line 47
    sub-int/2addr v4, p0

    .line 48
    int-to-char v4, v4

    .line 49
    aput-char v4, v2, v3

    .line 50
    .line 51
    sub-int/2addr v6, p0

    .line 52
    int-to-char v4, v6

    .line 53
    aput-char v4, v2, v5

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    div-int/lit8 v7, v4, 0x6

    .line 57
    .line 58
    rem-int/lit8 v4, v4, 0x6

    .line 59
    .line 60
    div-int/lit8 v8, v6, 0x6

    .line 61
    .line 62
    rem-int/lit8 v6, v6, 0x6

    .line 63
    .line 64
    if-ne v4, v6, :cond_2

    .line 65
    .line 66
    add-int/lit8 v7, v7, 0x5

    .line 67
    .line 68
    rem-int/lit8 v7, v7, 0x6

    .line 69
    .line 70
    add-int/lit8 v8, v8, 0x5

    .line 71
    .line 72
    rem-int/lit8 v8, v8, 0x6

    .line 73
    .line 74
    mul-int/lit8 v7, v7, 0x6

    .line 75
    .line 76
    add-int/2addr v7, v4

    .line 77
    mul-int/lit8 v8, v8, 0x6

    .line 78
    .line 79
    add-int/2addr v8, v6

    .line 80
    aget-char v4, v1, v7

    .line 81
    .line 82
    aput-char v4, v2, v3

    .line 83
    .line 84
    aget-char v4, v1, v8

    .line 85
    .line 86
    aput-char v4, v2, v5

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    if-ne v7, v8, :cond_3

    .line 90
    .line 91
    add-int/lit8 v4, v4, 0x5

    .line 92
    .line 93
    rem-int/lit8 v4, v4, 0x6

    .line 94
    .line 95
    add-int/lit8 v6, v6, 0x5

    .line 96
    .line 97
    rem-int/lit8 v6, v6, 0x6

    .line 98
    .line 99
    mul-int/lit8 v7, v7, 0x6

    .line 100
    .line 101
    add-int/2addr v7, v4

    .line 102
    mul-int/lit8 v8, v8, 0x6

    .line 103
    .line 104
    add-int/2addr v8, v6

    .line 105
    aget-char v4, v1, v7

    .line 106
    .line 107
    aput-char v4, v2, v3

    .line 108
    .line 109
    aget-char v4, v1, v8

    .line 110
    .line 111
    aput-char v4, v2, v5

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    mul-int/lit8 v7, v7, 0x6

    .line 115
    .line 116
    add-int/2addr v7, v6

    .line 117
    mul-int/lit8 v8, v8, 0x6

    .line 118
    .line 119
    add-int/2addr v8, v4

    .line 120
    aget-char v4, v1, v7

    .line 121
    .line 122
    aput-char v4, v2, v3

    .line 123
    .line 124
    aget-char v4, v1, v8

    .line 125
    .line 126
    aput-char v4, v2, v5

    .line 127
    .line 128
    :goto_2
    add-int/lit8 v3, v3, 0x2

    .line 129
    .line 130
    sput v3, LVa/Ab;->A:I

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_4
    new-instance p0, Ljava/lang/String;

    .line 134
    .line 135
    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    .line 136
    .line 137
    .line 138
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    return-object p0

    .line 140
    :goto_3
    monitor-exit v0

    .line 141
    throw p0
.end method


# virtual methods
.method public final c()V
    .locals 5

    .line 1
    iget v0, p0, LVa/Ga;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LVa/Ga;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-static {v0}, LVa/ba;->f(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, LVa/Ga;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, LVa/ba;

    .line 17
    .line 18
    invoke-static {v2}, LVa/ba;->m(LVa/ba;)Ljava/util/HashMap;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, LVa/Tb;

    .line 27
    .line 28
    iget-object v4, p0, LVa/Ga;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v4, LVa/ib;

    .line 31
    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    new-instance v3, LVa/Tb;

    .line 35
    .line 36
    invoke-direct {v3, v4}, LVa/Pb;-><init>(LVa/ib;)V

    .line 37
    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    iput-boolean v4, v3, LVa/Tb;->m:Z

    .line 41
    .line 42
    iput-boolean v4, v3, LVa/Tb;->n:Z

    .line 43
    .line 44
    iput-boolean v4, v3, LVa/Tb;->o:Z

    .line 45
    .line 46
    iput-boolean v4, v3, LVa/Tb;->p:Z

    .line 47
    .line 48
    invoke-virtual {v3, v0}, LVa/Tb;->M(Lorg/json/JSONObject;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v2}, LVa/ba;->m(LVa/ba;)Ljava/util/HashMap;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iput-object v4, v3, LVa/Pb;->i:LVa/ib;

    .line 60
    .line 61
    invoke-virtual {v3, v0}, LVa/Tb;->M(Lorg/json/JSONObject;)V

    .line 62
    .line 63
    .line 64
    :goto_0
    iget-object v0, p0, LVa/Ga;->f:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, LVa/o7;

    .line 67
    .line 68
    invoke-virtual {v3, v0}, LVa/Mb;->l(LVa/Lb;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, LVa/Ga;->g:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, LVa/q;

    .line 74
    .line 75
    invoke-virtual {v3, v0}, LVa/Tb;->R(LVa/q;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_0
    invoke-direct {p0}, LVa/Ga;->g()V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_1
    iget-object v0, p0, LVa/Ga;->g:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, LVa/Vb;

    .line 86
    .line 87
    iget-object v1, p0, LVa/Ga;->h:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v1, Landroid/view/KeyEvent$Callback;

    .line 90
    .line 91
    iget-object v2, p0, LVa/Ga;->d:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, LVa/Lb;

    .line 94
    .line 95
    iget-object v3, p0, LVa/Ga;->e:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v3, Lorg/json/JSONObject;

    .line 98
    .line 99
    iget-object v4, p0, LVa/Ga;->f:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v4, Landroid/view/View;

    .line 102
    .line 103
    invoke-interface {v2, v3, v4, v0, v1}, LVa/Lb;->w(Lorg/json/JSONObject;Landroid/view/View;LVa/Vb;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :pswitch_2
    new-instance v0, LVa/v;

    .line 108
    .line 109
    const/16 v1, 0xa

    .line 110
    .line 111
    invoke-direct {v0, v1}, LVa/v;-><init>(I)V

    .line 112
    .line 113
    .line 114
    iput-object p0, v0, LVa/v;->d:Ljava/lang/Object;

    .line 115
    .line 116
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v1}, LVa/G;->E()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    int-to-long v1, v1

    .line 125
    invoke-static {v0, v1, v2}, LVa/Cb;->f(LVa/Ba;J)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :pswitch_3
    iget-object v0, p0, LVa/Ga;->h:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, LVa/V;

    .line 132
    .line 133
    invoke-static {v0}, LVa/V;->M(LVa/V;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_1

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_1
    iget-object v1, p0, LVa/Ga;->d:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v1, Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-static {v0}, LVa/V;->A(LVa/V;)LVa/la;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    if-nez v0, :cond_2

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_2
    iget-object v0, v0, LVa/la;->a:Ljava/util/HashMap;

    .line 160
    .line 161
    new-instance v2, LVa/c0;

    .line 162
    .line 163
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 164
    .line 165
    .line 166
    sget-object v3, LVa/a0;->a:LVa/a0;

    .line 167
    .line 168
    iput-object v3, v2, LVa/c0;->g:LVa/a0;

    .line 169
    .line 170
    sget-object v3, LVa/b0;->a:LVa/b0;

    .line 171
    .line 172
    iput-object v3, v2, LVa/c0;->h:LVa/b0;

    .line 173
    .line 174
    iput-object v1, v2, LVa/c0;->a:Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    new-instance v0, LVa/y;

    .line 180
    .line 181
    const/4 v2, 0x1

    .line 182
    invoke-direct {v0, v2}, LVa/y;-><init>(I)V

    .line 183
    .line 184
    .line 185
    iput-object p0, v0, LVa/y;->e:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object v1, v0, LVa/y;->d:Ljava/lang/Object;

    .line 188
    .line 189
    invoke-static {v0}, LVa/Cb;->e(LVa/Ba;)V

    .line 190
    .line 191
    .line 192
    :goto_1
    return-void

    .line 193
    :pswitch_4
    sget v0, LVa/Ga;->k:I

    .line 194
    .line 195
    add-int/lit8 v0, v0, 0x41

    .line 196
    .line 197
    rem-int/lit16 v1, v0, 0x80

    .line 198
    .line 199
    sput v1, LVa/Ga;->j:I

    .line 200
    .line 201
    rem-int/lit8 v0, v0, 0x2

    .line 202
    .line 203
    iget-object v1, p0, LVa/Ga;->g:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v1, LVa/ya;

    .line 206
    .line 207
    iget-object v2, p0, LVa/Ga;->e:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v2, Ljava/lang/String;

    .line 210
    .line 211
    iget-object v3, p0, LVa/Ga;->f:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v3, LVa/Pa;

    .line 214
    .line 215
    iget-object v4, p0, LVa/Ga;->d:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v4, Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {p0, v4, v3, v2, v1}, LVa/Ga;->f(Ljava/lang/String;LVa/Pa;Ljava/lang/String;LVa/ya;)V

    .line 220
    .line 221
    .line 222
    if-nez v0, :cond_3

    .line 223
    .line 224
    return-void

    .line 225
    :cond_3
    const/4 v0, 0x0

    .line 226
    throw v0

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public f(Ljava/lang/String;LVa/Pa;Ljava/lang/String;LVa/ya;)V
    .locals 9

    .line 1
    const-string v0, "\u0007\u0008\t\n\u000b\u0008\u0006\u0011"

    .line 2
    .line 3
    iget-object v1, p0, LVa/Ga;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LVa/Ha;

    .line 6
    .line 7
    invoke-static {v1}, LVa/Ha;->a(LVa/Ha;)LVa/z;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, LVa/z;->a()LVa/Ea;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, LVa/Ea;->f()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    sget p1, LVa/Ga;->j:I

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x3f

    .line 25
    .line 26
    rem-int/lit16 p3, p1, 0x80

    .line 27
    .line 28
    sput p3, LVa/Ga;->k:I

    .line 29
    .line 30
    rem-int/lit8 p1, p1, 0x2

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0, p2, p4}, LVa/Ga;->i(LVa/Pa;LVa/ya;)V

    .line 35
    .line 36
    .line 37
    const/16 p1, 0x5a

    .line 38
    .line 39
    div-int/2addr p1, v3

    .line 40
    return-void

    .line 41
    :cond_0
    invoke-virtual {p0, p2, p4}, LVa/Ga;->i(LVa/Pa;LVa/ya;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    :try_start_0
    invoke-static {p1}, LVa/pb;->j(Ljava/lang/String;)LVa/lb;

    .line 46
    .line 47
    .line 48
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    const/16 v4, 0x30

    .line 50
    .line 51
    const-string v5, ""

    .line 52
    .line 53
    if-eqz v2, :cond_5

    .line 54
    .line 55
    sget v6, LVa/Ga;->j:I

    .line 56
    .line 57
    add-int/lit8 v6, v6, 0x4f

    .line 58
    .line 59
    rem-int/lit16 v7, v6, 0x80

    .line 60
    .line 61
    sput v7, LVa/Ga;->k:I

    .line 62
    .line 63
    rem-int/lit8 v6, v6, 0x2

    .line 64
    .line 65
    if-nez v6, :cond_2

    .line 66
    .line 67
    :try_start_1
    iget-object v6, v2, LVa/lb;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v6, LVa/Aa;

    .line 70
    .line 71
    iget v6, v6, LVa/Aa;->a:I

    .line 72
    .line 73
    const/16 v7, 0x3e9e

    .line 74
    .line 75
    if-ne v6, v7, :cond_5

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    iget-object v6, v2, LVa/lb;->c:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v6, LVa/Aa;

    .line 81
    .line 82
    iget v6, v6, LVa/Aa;->a:I

    .line 83
    .line 84
    const/16 v7, 0xc8

    .line 85
    .line 86
    if-ne v6, v7, :cond_5

    .line 87
    .line 88
    :goto_0
    invoke-static {v2}, LVa/pb;->C(LVa/lb;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-static {v2}, LVa/Ga;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-static {v3}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    add-int/lit8 v6, v6, 0x9

    .line 101
    .line 102
    const-string v7, "\u0001\u0002\u0003\u0004\u0002\u0005\u00bf\u00bf"

    .line 103
    .line 104
    invoke-static {v5, v4, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    add-int/lit8 v8, v8, 0x77

    .line 109
    .line 110
    int-to-byte v8, v8

    .line 111
    invoke-static {v8, v6, v7}, LVa/Ga;->h(BILjava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    invoke-static {v6}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    invoke-virtual {v6}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-virtual {v6, v2}, Ljava/nio/charset/CharsetEncoder;->canEncode(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-nez v6, :cond_3

    .line 132
    .line 133
    invoke-static {v5, v3}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 134
    .line 135
    .line 136
    move-result p3

    .line 137
    rsub-int/lit8 p3, p3, 0x8

    .line 138
    .line 139
    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    const v6, 0x1000071

    .line 144
    .line 145
    .line 146
    add-int/2addr v2, v6

    .line 147
    int-to-byte v2, v2

    .line 148
    invoke-static {v2, p3, v0}, LVa/Ga;->h(BILjava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p3

    .line 152
    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p3

    .line 156
    new-instance v2, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    shr-int/lit8 v6, v6, 0x10

    .line 166
    .line 167
    rsub-int/lit8 v6, v6, 0x16

    .line 168
    .line 169
    const-string v7, "\u0006\u0008\u000e\u000f\u0010\u0011\u000b\u0008\u000c\u0017\u0016\u0007\u0014\u001a\u0016\u0017\u0013\u0012\u000f\u0008\u0006\u0014"

    .line 170
    .line 171
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    shr-int/lit8 v8, v8, 0x10

    .line 176
    .line 177
    add-int/lit8 v8, v8, 0x34

    .line 178
    .line 179
    int-to-byte v8, v8

    .line 180
    invoke-static {v8, v6, v7}, LVa/Ga;->h(BILjava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-static {v3, v3}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    add-int/lit8 v6, v6, 0x17

    .line 199
    .line 200
    const-string v7, "\u0013\u000c\u000f\u001b\u0006\u001c\u0015\u0016\u0014\u0013\u0015\u0016\u001a\u0019 \u001a\u000c\u0017\u000f\u0019\u001a\u000c\u0090"

    .line 201
    .line 202
    invoke-static {v5, v4, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    rsub-int/lit8 v4, v4, 0x1c

    .line 207
    .line 208
    int-to-byte v4, v4

    .line 209
    invoke-static {v4, v6, v7}, LVa/Ga;->h(BILjava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    const/4 v4, 0x0

    .line 225
    invoke-static {p3, v2, v4, v3}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 226
    .line 227
    .line 228
    return-void

    .line 229
    :catch_0
    move-exception p3

    .line 230
    goto/16 :goto_2

    .line 231
    .line 232
    :cond_3
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    if-nez v4, :cond_9

    .line 237
    .line 238
    sget v4, LVa/Ha;->g:I

    .line 239
    .line 240
    add-int/lit8 v4, v4, 0x5b

    .line 241
    .line 242
    rem-int/lit16 v5, v4, 0x80

    .line 243
    .line 244
    sput v5, LVa/Ha;->h:I

    .line 245
    .line 246
    rem-int/lit8 v4, v4, 0x2

    .line 247
    .line 248
    if-nez v4, :cond_4

    .line 249
    .line 250
    iget-object v4, v1, LVa/Ha;->a:LVa/Ra;

    .line 251
    .line 252
    const/16 v5, 0x23

    .line 253
    .line 254
    div-int/2addr v5, v3

    .line 255
    goto :goto_1

    .line 256
    :cond_4
    iget-object v4, v1, LVa/Ha;->a:LVa/Ra;

    .line 257
    .line 258
    :goto_1
    invoke-virtual {v4, p3, v2}, LVa/Ra;->q(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    new-instance p3, LVa/y;

    .line 262
    .line 263
    const/16 v4, 0xf

    .line 264
    .line 265
    invoke-direct {p3, v4}, LVa/y;-><init>(I)V

    .line 266
    .line 267
    .line 268
    iput-object p4, p3, LVa/y;->d:Ljava/lang/Object;

    .line 269
    .line 270
    iput-object v2, p3, LVa/y;->e:Ljava/lang/Object;

    .line 271
    .line 272
    invoke-static {p3}, LVa/Cb;->c(LVa/Ba;)V

    .line 273
    .line 274
    .line 275
    return-void

    .line 276
    :cond_5
    invoke-static {v1}, LVa/Ha;->a(LVa/Ha;)LVa/z;

    .line 277
    .line 278
    .line 279
    move-result-object p3

    .line 280
    invoke-virtual {p3}, LVa/z;->a()LVa/Ea;

    .line 281
    .line 282
    .line 283
    move-result-object p3

    .line 284
    invoke-virtual {p3}, LVa/Ea;->f()Z

    .line 285
    .line 286
    .line 287
    move-result p3

    .line 288
    if-nez p3, :cond_6

    .line 289
    .line 290
    invoke-virtual {p0, p2, p4}, LVa/Ga;->i(LVa/Pa;LVa/ya;)V

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :cond_6
    if-eqz v2, :cond_9

    .line 295
    .line 296
    iget-object p3, v2, LVa/lb;->c:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast p3, LVa/Aa;

    .line 299
    .line 300
    iget p3, p3, LVa/Aa;->a:I

    .line 301
    .line 302
    const/16 v2, 0x193

    .line 303
    .line 304
    if-eq p3, v2, :cond_7

    .line 305
    .line 306
    const/16 v2, 0x194

    .line 307
    .line 308
    if-ne p3, v2, :cond_9

    .line 309
    .line 310
    :cond_7
    invoke-static {v5, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 311
    .line 312
    .line 313
    move-result p3

    .line 314
    rsub-int/lit8 p3, p3, 0x3

    .line 315
    .line 316
    const-string v2, "\t\u0013\u001a\u001d"

    .line 317
    .line 318
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    shr-int/lit8 v4, v4, 0x10

    .line 323
    .line 324
    rsub-int/lit8 v4, v4, 0x2

    .line 325
    .line 326
    int-to-byte v4, v4

    .line 327
    invoke-static {v4, p3, v2}, LVa/Ga;->h(BILjava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object p3

    .line 331
    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p3

    .line 335
    invoke-virtual {p1, p3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 336
    .line 337
    .line 338
    move-result p3

    .line 339
    if-eqz p3, :cond_9

    .line 340
    .line 341
    sget p3, LVa/Pa;->f:I

    .line 342
    .line 343
    iput-boolean v3, p2, LVa/Pa;->e:Z

    .line 344
    .line 345
    add-int/lit8 p3, p3, 0x7

    .line 346
    .line 347
    rem-int/lit16 p3, p3, 0x80

    .line 348
    .line 349
    sput p3, LVa/Pa;->g:I

    .line 350
    .line 351
    invoke-virtual {v1, p2, p4}, LVa/Ha;->c(LVa/Pa;LVa/ya;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 352
    .line 353
    .line 354
    return-void

    .line 355
    :goto_2
    invoke-static {v1}, LVa/Ha;->a(LVa/Ha;)LVa/z;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-virtual {v1}, LVa/z;->a()LVa/Ea;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    invoke-virtual {v1}, LVa/Ea;->f()Z

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    if-nez v1, :cond_8

    .line 368
    .line 369
    invoke-virtual {p0, p2, p4}, LVa/Ga;->i(LVa/Pa;LVa/ya;)V

    .line 370
    .line 371
    .line 372
    return-void

    .line 373
    :cond_8
    invoke-static {v3, v3}, Landroid/view/View;->resolveSize(II)I

    .line 374
    .line 375
    .line 376
    move-result p2

    .line 377
    add-int/lit8 p2, p2, 0x8

    .line 378
    .line 379
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 380
    .line 381
    .line 382
    move-result p4

    .line 383
    int-to-byte p4, p4

    .line 384
    rsub-int/lit8 p4, p4, 0x70

    .line 385
    .line 386
    int-to-byte p4, p4

    .line 387
    invoke-static {p4, p2, v0}, LVa/Ga;->h(BILjava/lang/String;)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object p2

    .line 391
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object p2

    .line 395
    new-instance p4, Ljava/lang/StringBuilder;

    .line 396
    .line 397
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 398
    .line 399
    .line 400
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    shr-int/lit8 v0, v0, 0x10

    .line 405
    .line 406
    rsub-int/lit8 v0, v0, 0x21

    .line 407
    .line 408
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 409
    .line 410
    .line 411
    move-result-wide v1

    .line 412
    const-wide/16 v4, 0x0

    .line 413
    .line 414
    cmp-long v1, v1, v4

    .line 415
    .line 416
    add-int/lit8 v1, v1, 0x35

    .line 417
    .line 418
    int-to-byte v1, v1

    .line 419
    const-string v2, "\u001a\u0011\u000f\u0008\u000c\u0014\u0013\n\u00aa\u00aa\u0015\u0016\u0017\u0013\r\u0008\t\n\u000b\u0008\u0013\u0000\u0008\u0010\u0015\u0016\u0017\u0013\u0014\u0011\n\tV"

    .line 420
    .line 421
    invoke-static {v1, v0, v2}, LVa/Ga;->h(BILjava/lang/String;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    invoke-static {p2, p1, p3, v3}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 440
    .line 441
    .line 442
    :cond_9
    return-void
.end method

.method public i(LVa/Pa;LVa/ya;)V
    .locals 3

    .line 1
    iget-object v0, p0, LVa/Ga;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LVa/Ha;

    .line 4
    .line 5
    invoke-static {v0}, LVa/Ha;->a(LVa/Ha;)LVa/z;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, LVa/z;->a()LVa/Ea;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, LVa/Fa;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, v2}, LVa/Fa;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p0, v1, LVa/Fa;->d:LVa/Ba;

    .line 20
    .line 21
    iput-object p1, v1, LVa/Fa;->b:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p2, v1, LVa/Fa;->c:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, LVa/Ea;->d(LVa/za;)V

    .line 26
    .line 27
    .line 28
    sget p1, LVa/Ga;->j:I

    .line 29
    .line 30
    add-int/lit8 p1, p1, 0x41

    .line 31
    .line 32
    rem-int/lit16 p2, p1, 0x80

    .line 33
    .line 34
    sput p2, LVa/Ga;->k:I

    .line 35
    .line 36
    rem-int/lit8 p1, p1, 0x2

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    throw p1
.end method
