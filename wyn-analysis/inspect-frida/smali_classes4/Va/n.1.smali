.class public final LVa/n;
.super LVa/lb;
.source "SourceFile"


# static fields
.field public static final l:[C

.field public static m:I = 0x0

.field public static n:I = 0x1


# instance fields
.field public g:Ljava/lang/String;

.field public h:I

.field public i:I

.field public j:I

.field public k:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x27

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/n;->l:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x491bs
        -0x57d9s
        -0x74e3s
        -0x15f1s
        -0x3291s
        0x2c71s
        0xf41s
        0x6ebcs
        0x41b1s
        -0x5f4cs
        -0x7c6es
        -0x1d12s
        -0x3a30s
        0x24d9s
        0x617s
        0x7922s
        0x5804s
        -0x4484s
        -0x6582s
        -0x2aes
        -0x23aes
        0x3fbas
        0x1e8as
        0x5e1fs
        -0x40f5s
        -0x63c7s
        0x64s
        -0x1e99s
        -0x3dabs
        0x73s
        -0x1e9as
        -0x3db1s
        -0x5ca3s
        -0x26ads
        0x385as
        0x1b62s
        -0x125bs
        0xcabs
        0x2f9ds
    .end array-data
.end method

.method public static synthetic d(LVa/n;)V
    .locals 2

    .line 1
    sget v0, LVa/n;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x33

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/n;->n:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget v0, p0, LVa/n;->i:I

    .line 14
    .line 15
    :goto_0
    iput v0, p0, LVa/n;->i:I

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget v0, p0, LVa/n;->i:I

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0
.end method

.method public static e(IIC)Ljava/lang/String;
    .locals 9

    .line 1
    sget-object v0, LVa/Ab;->u:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-array v1, p1, [C

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    sput v2, LVa/Ab;->t:I

    .line 8
    .line 9
    :goto_0
    sget v2, LVa/Ab;->t:I

    .line 10
    .line 11
    if-ge v2, p1, :cond_0

    .line 12
    .line 13
    sget-object v3, LVa/n;->l:[C

    .line 14
    .line 15
    add-int v4, p0, v2

    .line 16
    .line 17
    aget-char v3, v3, v4

    .line 18
    .line 19
    int-to-long v3, v3

    .line 20
    int-to-long v5, v2

    .line 21
    const-wide v7, 0x4c528ef8182be113L    # 4.659736953211462E59

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    mul-long/2addr v5, v7

    .line 27
    xor-long/2addr v3, v5

    .line 28
    int-to-long v5, p2

    .line 29
    xor-long/2addr v3, v5

    .line 30
    long-to-int v3, v3

    .line 31
    int-to-char v3, v3

    .line 32
    aput-char v3, v1, v2

    .line 33
    .line 34
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    sput v2, LVa/Ab;->t:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 42
    .line 43
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 44
    .line 45
    .line 46
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    return-object p0

    .line 48
    :goto_1
    monitor-exit v0

    .line 49
    throw p0
.end method

.method public static f(Ljava/lang/String;I)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, [C

    .line 6
    .line 7
    sget-object v0, LVa/pb;->D:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    const-wide v1, 0x41cc21dab7fb5a68L    # 9.439614559636965E8

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-static {v1, v2, p0, p1}, LVa/pb;->z(J[CI)[C

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 p1, 0x4

    .line 20
    sput p1, LVa/pb;->C:I

    .line 21
    .line 22
    :goto_0
    sget v3, LVa/pb;->C:I

    .line 23
    .line 24
    array-length v4, p0

    .line 25
    if-ge v3, v4, :cond_0

    .line 26
    .line 27
    add-int/lit8 v4, v3, -0x4

    .line 28
    .line 29
    aget-char v5, p0, v3

    .line 30
    .line 31
    rem-int/lit8 v6, v3, 0x4

    .line 32
    .line 33
    aget-char v6, p0, v6

    .line 34
    .line 35
    xor-int/2addr v5, v6

    .line 36
    int-to-long v5, v5

    .line 37
    int-to-long v7, v4

    .line 38
    mul-long/2addr v7, v1

    .line 39
    xor-long/2addr v5, v7

    .line 40
    long-to-int v4, v5

    .line 41
    int-to-char v4, v4

    .line 42
    aput-char v4, p0, v3

    .line 43
    .line 44
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    sput v3, LVa/pb;->C:I

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    new-instance v1, Ljava/lang/String;

    .line 52
    .line 53
    array-length v2, p0

    .line 54
    sub-int/2addr v2, p1

    .line 55
    invoke-direct {v1, p0, p1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 56
    .line 57
    .line 58
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    return-object v1

    .line 60
    :goto_1
    monitor-exit v0

    .line 61
    throw p0
.end method


# virtual methods
.method public final c(Lorg/json/JSONObject;ZZZ)Lorg/json/JSONObject;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    invoke-static {}, LVa/pb;->g0()J

    .line 5
    .line 6
    .line 7
    move-result-wide v2

    .line 8
    invoke-static {}, LVa/pb;->S()J

    .line 9
    .line 10
    .line 11
    move-result-wide v4

    .line 12
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    invoke-super/range {p0 .. p4}, LVa/lb;->c(Lorg/json/JSONObject;ZZZ)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    const/4 v7, 0x0

    .line 18
    :try_start_1
    sget-object v0, LVa/sa;->f:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 21
    .line 22
    .line 23
    move-result-wide v8

    .line 24
    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const-wide/16 v10, 0x0

    .line 28
    .line 29
    cmp-long v0, v8, v10

    .line 30
    .line 31
    const/4 v12, 0x0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sub-long v13, v2, v8

    .line 36
    .line 37
    sub-long v13, v4, v13

    .line 38
    .line 39
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    cmpl-float v0, v0, v12

    .line 44
    .line 45
    add-int/lit16 v0, v0, 0x5e6b

    .line 46
    .line 47
    int-to-char v0, v0

    .line 48
    invoke-static {v7}, Landroid/graphics/Color;->green(I)I

    .line 49
    .line 50
    .line 51
    move-result v15

    .line 52
    add-int/lit8 v15, v15, 0x17

    .line 53
    .line 54
    invoke-static {v7}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 55
    .line 56
    .line 57
    move-result-wide v16

    .line 58
    cmp-long v10, v16, v10

    .line 59
    .line 60
    rsub-int/lit8 v10, v10, 0x3

    .line 61
    .line 62
    invoke-static {v15, v10, v0}, LVa/n;->e(IIC)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v6, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    const-string v0, "\u715e\ucd98\u6d51\u712d\u3a29\u9785\ud9f5"

    .line 74
    .line 75
    invoke-static {v7, v7}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-static {v0, v2}, LVa/n;->f(Ljava/lang/String;I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v6, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    move-wide v2, v8

    .line 91
    move-wide v4, v13

    .line 92
    :goto_0
    const-string v0, ""

    .line 93
    .line 94
    const/16 v8, 0x30

    .line 95
    .line 96
    invoke-static {v0, v8, v7}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    const/4 v9, 0x1

    .line 101
    add-int/2addr v0, v9

    .line 102
    int-to-char v0, v0

    .line 103
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    shr-int/lit8 v10, v10, 0x10

    .line 108
    .line 109
    rsub-int/lit8 v10, v10, 0x1a

    .line 110
    .line 111
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    shr-int/lit8 v11, v11, 0x8

    .line 116
    .line 117
    rsub-int/lit8 v11, v11, 0x3

    .line 118
    .line 119
    invoke-static {v10, v11, v0}, LVa/n;->e(IIC)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v6, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 128
    .line 129
    .line 130
    const-string v0, "\u64f2\u9f42\ucbee\u6487\u6488\uc55e"

    .line 131
    .line 132
    invoke-static {v7, v7, v7}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    invoke-static {v0, v2}, LVa/n;->f(Ljava/lang/String;I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v6, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 145
    .line 146
    .line 147
    invoke-static {v8}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    sub-int/2addr v8, v0

    .line 152
    int-to-char v0, v8

    .line 153
    invoke-static {v7, v7}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    add-int/lit8 v2, v2, 0x1d

    .line 158
    .line 159
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    shr-int/lit8 v3, v3, 0x10

    .line 164
    .line 165
    rsub-int/lit8 v3, v3, 0x4

    .line 166
    .line 167
    invoke-static {v2, v3, v0}, LVa/n;->e(IIC)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    iget-object v2, v1, LVa/n;->g:Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v6, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 178
    .line 179
    .line 180
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    shr-int/lit8 v0, v0, 0x10

    .line 185
    .line 186
    const v2, 0xd920

    .line 187
    .line 188
    .line 189
    sub-int/2addr v2, v0

    .line 190
    int-to-char v0, v2

    .line 191
    const-string v2, ""

    .line 192
    .line 193
    invoke-static {v2}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    add-int/lit8 v2, v2, 0x21

    .line 198
    .line 199
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    cmpl-float v3, v3, v12

    .line 204
    .line 205
    rsub-int/lit8 v3, v3, 0x4

    .line 206
    .line 207
    invoke-static {v2, v3, v0}, LVa/n;->e(IIC)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    iget v2, v1, LVa/n;->h:I

    .line 216
    .line 217
    invoke-virtual {v6, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 218
    .line 219
    .line 220
    invoke-static {v7}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    const v2, 0xedd6

    .line 225
    .line 226
    .line 227
    sub-int/2addr v2, v0

    .line 228
    int-to-char v0, v2

    .line 229
    invoke-static {v7, v7, v7}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    rsub-int/lit8 v2, v2, 0x24

    .line 234
    .line 235
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    int-to-byte v3, v3

    .line 240
    add-int/lit8 v3, v3, 0x4

    .line 241
    .line 242
    invoke-static {v2, v3, v0}, LVa/n;->e(IIC)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    sget v2, LVa/n;->n:I

    .line 251
    .line 252
    add-int/lit8 v2, v2, 0x29

    .line 253
    .line 254
    rem-int/lit16 v3, v2, 0x80

    .line 255
    .line 256
    sput v3, LVa/n;->m:I

    .line 257
    .line 258
    rem-int/lit8 v2, v2, 0x2

    .line 259
    .line 260
    if-eqz v2, :cond_1

    .line 261
    .line 262
    iget v2, v1, LVa/n;->i:I

    .line 263
    .line 264
    const/16 v4, 0x43

    .line 265
    .line 266
    div-int/2addr v4, v7

    .line 267
    if-nez v2, :cond_2

    .line 268
    .line 269
    goto :goto_1

    .line 270
    :cond_1
    iget v2, v1, LVa/n;->i:I

    .line 271
    .line 272
    if-nez v2, :cond_2

    .line 273
    .line 274
    :goto_1
    add-int/lit8 v3, v3, 0x5f

    .line 275
    .line 276
    rem-int/lit16 v3, v3, 0x80

    .line 277
    .line 278
    sput v3, LVa/n;->n:I

    .line 279
    .line 280
    move v2, v9

    .line 281
    goto :goto_2

    .line 282
    :cond_2
    iget v2, v1, LVa/n;->i:I

    .line 283
    .line 284
    :goto_2
    invoke-virtual {v6, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 285
    .line 286
    .line 287
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-virtual {v0}, LVa/G;->D()Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-eqz v0, :cond_3

    .line 296
    .line 297
    const-string v0, "\u39e3\u1fe6\u15b5\u3980\u0810\u45fd\ua109\u074c"

    .line 298
    .line 299
    const-string v2, ""

    .line 300
    .line 301
    invoke-static {v2}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    invoke-static {v0, v2}, LVa/n;->f(Ljava/lang/String;I)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-virtual {v6, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 314
    .line 315
    .line 316
    goto :goto_3

    .line 317
    :catch_0
    move-exception v0

    .line 318
    goto :goto_4

    .line 319
    :cond_3
    :goto_3
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-virtual {v0}, LVa/G;->K()LVa/C;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    if-eqz v0, :cond_4

    .line 328
    .line 329
    invoke-virtual {v0}, LVa/C;->y()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    if-nez v2, :cond_4

    .line 338
    .line 339
    const-string v2, "\udff1\u4608\u196c\udf94\u9245\u1c14\uadc8"

    .line 340
    .line 341
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    shr-int/lit8 v3, v3, 0x18

    .line 346
    .line 347
    invoke-static {v2, v3}, LVa/n;->f(Ljava/lang/String;I)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-virtual {v6, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 356
    .line 357
    .line 358
    :cond_4
    if-eqz p3, :cond_5

    .line 359
    .line 360
    invoke-virtual {v1, v6}, LVa/n;->g(Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 361
    .line 362
    .line 363
    return-object v6

    .line 364
    :goto_4
    invoke-static {v7}, Landroid/graphics/Color;->alpha(I)I

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    add-int/lit16 v2, v2, 0x495a

    .line 369
    .line 370
    int-to-char v2, v2

    .line 371
    const/high16 v3, 0x1000000

    .line 372
    .line 373
    invoke-static {v7, v7, v7}, Landroid/graphics/Color;->rgb(III)I

    .line 374
    .line 375
    .line 376
    move-result v4

    .line 377
    add-int/2addr v4, v3

    .line 378
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    shr-int/lit8 v3, v3, 0x18

    .line 383
    .line 384
    rsub-int/lit8 v3, v3, 0x17

    .line 385
    .line 386
    invoke-static {v4, v3, v2}, LVa/n;->e(IIC)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    const-string v3, "\ufe01\u694e\u6ef6\ufe44\uc817\u3354\uda54\uc740\u97d3\uad66\u70e5\ub0bd\u2d24\u4487\ue692\u2a06\uc28f\ufe61\u9f66\u846a\u58f7\u69c3\u35c8\u7ddb\uee6c\u03a3\uaa72\ud72e"

    .line 395
    .line 396
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    shr-int/lit8 v4, v4, 0x8

    .line 401
    .line 402
    invoke-static {v3, v4}, LVa/n;->f(Ljava/lang/String;I)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v3

    .line 406
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    invoke-static {v2, v3, v0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 411
    .line 412
    .line 413
    :cond_5
    return-object v6

    .line 414
    :catchall_0
    move-exception v0

    .line 415
    monitor-exit p0

    .line 416
    throw v0
.end method

.method public final declared-synchronized g(Lorg/json/JSONObject;)V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/n;->m:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x21

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, LVa/n;->n:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, LVa/cb;->p()LVa/cb;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LVa/cb;->r()LVa/ta;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget v2, v0, LVa/ta;->a:I

    .line 24
    .line 25
    iget v3, v0, LVa/ta;->b:I

    .line 26
    .line 27
    iget-wide v4, v0, LVa/ta;->c:J

    .line 28
    .line 29
    iget-wide v6, v0, LVa/ta;->d:J

    .line 30
    .line 31
    invoke-static/range {v2 .. v7}, LVa/Ab;->W(IIJJ)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    :try_start_1
    const-string v2, "\u20d3\u7a1f\ua592\u20bf\u98e7\u2016\u1131\u97ab\u4927\ube78\ubb97\ue05c\uf3fb"

    .line 36
    .line 37
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    cmpl-float v1, v3, v1

    .line 42
    .line 43
    invoke-static {v2, v1}, LVa/n;->f(Ljava/lang/String;I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :goto_0
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    move-object p1, v0

    .line 57
    goto :goto_3

    .line 58
    :catch_0
    move-exception v0

    .line 59
    move-object p1, v0

    .line 60
    goto :goto_2

    .line 61
    :cond_0
    :try_start_2
    invoke-static {}, LVa/cb;->p()LVa/cb;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, LVa/cb;->r()LVa/ta;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget v2, v0, LVa/ta;->a:I

    .line 70
    .line 71
    iget v3, v0, LVa/ta;->b:I

    .line 72
    .line 73
    iget-wide v4, v0, LVa/ta;->c:J

    .line 74
    .line 75
    iget-wide v6, v0, LVa/ta;->d:J

    .line 76
    .line 77
    invoke-static/range {v2 .. v7}, LVa/Ab;->W(IIJJ)Lorg/json/JSONObject;

    .line 78
    .line 79
    .line 80
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 81
    :try_start_3
    const-string v2, "\u20d3\u7a1f\ua592\u20bf\u98e7\u2016\u1131\u97ab\u4927\ube78\ubb97\ue05c\uf3fb"

    .line 82
    .line 83
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    cmpl-float v1, v3, v1

    .line 88
    .line 89
    invoke-static {v2, v1}, LVa/n;->f(Ljava/lang/String;I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 97
    goto :goto_0

    .line 98
    :goto_1
    :try_start_4
    sget p1, LVa/n;->n:I

    .line 99
    .line 100
    add-int/lit8 p1, p1, 0x43

    .line 101
    .line 102
    rem-int/lit16 p1, p1, 0x80

    .line 103
    .line 104
    sput p1, LVa/n;->m:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 105
    .line 106
    monitor-exit p0

    .line 107
    return-void

    .line 108
    :goto_2
    :try_start_5
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 109
    .line 110
    .line 111
    move-result-wide v0

    .line 112
    const-wide/16 v2, 0x0

    .line 113
    .line 114
    cmp-long v0, v0, v2

    .line 115
    .line 116
    rsub-int v0, v0, 0x495b

    .line 117
    .line 118
    int-to-char v0, v0

    .line 119
    const-string v1, ""

    .line 120
    .line 121
    invoke-static {v1}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    const-string v2, ""

    .line 126
    .line 127
    const/16 v3, 0x30

    .line 128
    .line 129
    const/4 v4, 0x0

    .line 130
    invoke-static {v2, v3, v4, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    add-int/lit8 v2, v2, 0x18

    .line 135
    .line 136
    invoke-static {v1, v2, v0}, LVa/n;->e(IIC)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-string v1, "\u3783\u979e\u9ec0\u37e6\uc675\ucd84\u2a62\uc922\u5e51\u53b6\u80d1\ubec9\ue4a7\uba5f\u16be\u246a\u0b43\u00ba\u6f11\u8a1e\u9177\u9719\uc5e5\u73ae\u27cb\ufd36\u5a44\ud942\u4e63\u43d3\ub026\u4ee8\ud48d\uaa22"

    .line 145
    .line 146
    invoke-static {v4}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    invoke-static {v1, v2}, LVa/n;->f(Ljava/lang/String;I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-static {v0, v1, p1}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 159
    .line 160
    .line 161
    monitor-exit p0

    .line 162
    return-void

    .line 163
    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 164
    throw p1
.end method
