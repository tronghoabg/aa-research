.class public final LVa/K8;
.super LVa/I8;
.source "SourceFile"


# static fields
.field public static j:I = 0x0

.field public static k:I = 0x1


# instance fields
.field public final i:LVa/y8;


# direct methods
.method public constructor <init>(LVa/y8;LVa/y8;LVa/y8;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LVa/I8;-><init>(LVa/y8;LVa/y8;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LVa/K8;->i:LVa/y8;

    .line 5
    .line 6
    return-void
.end method

.method public static h(Ljava/lang/String;IIIZ)Ljava/lang/String;
    .locals 5

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
    sget-object v0, LVa/Ab;->x:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    new-array v1, p1, [C

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    sput v2, LVa/Ab;->v:I

    .line 14
    .line 15
    :goto_0
    sget v3, LVa/Ab;->v:I

    .line 16
    .line 17
    if-ge v3, p1, :cond_0

    .line 18
    .line 19
    aget-char v4, p0, v3

    .line 20
    .line 21
    add-int/2addr v4, p2

    .line 22
    int-to-char v4, v4

    .line 23
    aput-char v4, v1, v3

    .line 24
    .line 25
    add-int/lit16 v4, v4, -0x8c

    .line 26
    .line 27
    int-to-char v4, v4

    .line 28
    aput-char v4, v1, v3

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    sput v3, LVa/Ab;->v:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    if-lez p3, :cond_1

    .line 38
    .line 39
    sput p3, LVa/Ab;->w:I

    .line 40
    .line 41
    new-array p0, p1, [C

    .line 42
    .line 43
    invoke-static {v1, v2, p0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    sget p2, LVa/Ab;->w:I

    .line 47
    .line 48
    sub-int p3, p1, p2

    .line 49
    .line 50
    invoke-static {p0, v2, v1, p3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    sget p2, LVa/Ab;->w:I

    .line 54
    .line 55
    sub-int p3, p1, p2

    .line 56
    .line 57
    invoke-static {p0, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    :cond_1
    if-eqz p4, :cond_3

    .line 61
    .line 62
    new-array p0, p1, [C

    .line 63
    .line 64
    sput v2, LVa/Ab;->v:I

    .line 65
    .line 66
    :goto_1
    sget p2, LVa/Ab;->v:I

    .line 67
    .line 68
    if-ge p2, p1, :cond_2

    .line 69
    .line 70
    sub-int p3, p1, p2

    .line 71
    .line 72
    add-int/lit8 p3, p3, -0x1

    .line 73
    .line 74
    aget-char p3, v1, p3

    .line 75
    .line 76
    aput-char p3, p0, p2

    .line 77
    .line 78
    add-int/lit8 p2, p2, 0x1

    .line 79
    .line 80
    sput p2, LVa/Ab;->v:I

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v1, p0

    .line 84
    :cond_3
    new-instance p0, Ljava/lang/String;

    .line 85
    .line 86
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 87
    .line 88
    .line 89
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    return-object p0

    .line 91
    :goto_2
    monitor-exit v0

    .line 92
    throw p0
.end method


# virtual methods
.method public final b(LVa/x8;LVa/y7;)LVa/s8;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    const-string v4, "\u0003\u0010\u000e\u0016\u0003\uffbe\u0012\u0013\u000e\uffbe\u0012\u000e\u0007\u0010\u0001\u0011\u0000\u0013\u0011\uffbe\u0005\u000c\u0007\u0012\uffff\u0013\n\uffff\u0014\u0003\uffbe\u0010\r\u0010\u0010\uffe3\uffc5\uffbe\u000c\r\u0007\u0011\u0011"

    .line 8
    .line 9
    invoke-virtual {v1}, LVa/I8;->e()LVa/y8;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, v2, v3}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget v5, LVa/K8;->j:I

    .line 18
    .line 19
    add-int/lit8 v5, v5, 0x5b

    .line 20
    .line 21
    rem-int/lit16 v5, v5, 0x80

    .line 22
    .line 23
    sput v5, LVa/K8;->k:I

    .line 24
    .line 25
    add-int/lit8 v5, v5, 0x17

    .line 26
    .line 27
    rem-int/lit16 v5, v5, 0x80

    .line 28
    .line 29
    sput v5, LVa/K8;->j:I

    .line 30
    .line 31
    iget-object v5, v1, LVa/K8;->i:LVa/y8;

    .line 32
    .line 33
    invoke-virtual {v5, v2, v3}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    const/16 v6, 0x30

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    const-wide/16 v8, 0x0

    .line 41
    .line 42
    const/4 v10, 0x1

    .line 43
    :try_start_0
    invoke-virtual {v1}, LVa/I8;->g()LVa/y8;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    invoke-virtual {v11, v2, v3}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 48
    .line 49
    .line 50
    move-result-object v11

    .line 51
    invoke-virtual {v11}, LVa/s8;->c()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v11

    .line 55
    instance-of v12, v11, Lorg/json/JSONObject;

    .line 56
    .line 57
    if-eqz v12, :cond_0

    .line 58
    .line 59
    check-cast v11, Lorg/json/JSONObject;

    .line 60
    .line 61
    invoke-virtual {v0}, LVa/s8;->c()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v5}, LVa/s8;->c()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v12

    .line 71
    invoke-virtual {v11, v0, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 72
    .line 73
    .line 74
    return-object v5

    .line 75
    :catch_0
    move-exception v0

    .line 76
    move-wide/from16 v17, v8

    .line 77
    .line 78
    goto/16 :goto_0

    .line 79
    .line 80
    :cond_0
    instance-of v12, v11, Lorg/json/JSONArray;

    .line 81
    .line 82
    xor-int/2addr v12, v10

    .line 83
    if-eq v12, v10, :cond_1

    .line 84
    .line 85
    check-cast v11, Lorg/json/JSONArray;

    .line 86
    .line 87
    invoke-virtual {v0}, LVa/s8;->a()Ljava/lang/Number;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-virtual {v5}, LVa/s8;->c()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v12

    .line 99
    invoke-virtual {v11, v0, v12}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    .line 100
    .line 101
    .line 102
    return-object v5

    .line 103
    :cond_1
    instance-of v12, v11, Ljava/util/Map;

    .line 104
    .line 105
    if-eqz v12, :cond_2

    .line 106
    .line 107
    check-cast v11, Ljava/util/Map;

    .line 108
    .line 109
    invoke-virtual {v0}, LVa/s8;->c()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v5}, LVa/s8;->c()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v12

    .line 117
    invoke-interface {v11, v0, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .line 119
    .line 120
    sget v0, LVa/K8;->j:I

    .line 121
    .line 122
    add-int/2addr v0, v10

    .line 123
    rem-int/lit16 v0, v0, 0x80

    .line 124
    .line 125
    sput v0, LVa/K8;->k:I

    .line 126
    .line 127
    return-object v5

    .line 128
    :cond_2
    :try_start_1
    instance-of v12, v11, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 129
    .line 130
    const/4 v13, 0x0

    .line 131
    if-eqz v12, :cond_4

    .line 132
    .line 133
    sget v12, LVa/K8;->k:I

    .line 134
    .line 135
    add-int/lit8 v12, v12, 0x63

    .line 136
    .line 137
    rem-int/lit16 v14, v12, 0x80

    .line 138
    .line 139
    sput v14, LVa/K8;->j:I

    .line 140
    .line 141
    rem-int/lit8 v12, v12, 0x2

    .line 142
    .line 143
    if-nez v12, :cond_3

    .line 144
    .line 145
    :try_start_2
    check-cast v11, Ljava/util/List;

    .line 146
    .line 147
    invoke-virtual {v0}, LVa/s8;->a()Ljava/lang/Number;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    invoke-virtual {v5}, LVa/s8;->c()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    invoke-interface {v11, v0, v12}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    return-object v5

    .line 163
    :cond_3
    check-cast v11, Ljava/util/List;

    .line 164
    .line 165
    invoke-virtual {v0}, LVa/s8;->a()Ljava/lang/Number;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    invoke-virtual {v5}, LVa/s8;->c()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    invoke-interface {v11, v0, v12}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 178
    .line 179
    .line 180
    :try_start_3
    throw v13
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 181
    :catchall_0
    move-exception v0

    .line 182
    throw v0

    .line 183
    :cond_4
    :try_start_4
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    invoke-virtual {v12}, Ljava/lang/Class;->isArray()Z

    .line 188
    .line 189
    .line 190
    move-result v12

    .line 191
    if-eqz v12, :cond_5

    .line 192
    .line 193
    check-cast v11, [Ljava/lang/Object;

    .line 194
    .line 195
    invoke-virtual {v0}, LVa/s8;->a()Ljava/lang/Number;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    invoke-virtual {v5}, LVa/s8;->c()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v12

    .line 207
    aput-object v12, v11, v0

    .line 208
    .line 209
    return-object v5

    .line 210
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 216
    .line 217
    .line 218
    move-result-wide v14

    .line 219
    cmp-long v12, v14, v8

    .line 220
    .line 221
    add-int/lit8 v12, v12, 0x2a

    .line 222
    .line 223
    invoke-static {v7}, Landroid/graphics/Color;->blue(I)I

    .line 224
    .line 225
    .line 226
    move-result v14

    .line 227
    add-int/lit16 v14, v14, 0xee

    .line 228
    .line 229
    invoke-static {v7}, Landroid/os/Process;->getThreadPriority(I)I

    .line 230
    .line 231
    .line 232
    move-result v15

    .line 233
    add-int/lit8 v15, v15, 0x14

    .line 234
    .line 235
    shr-int/lit8 v15, v15, 0x6

    .line 236
    .line 237
    rsub-int/lit8 v15, v15, 0x24

    .line 238
    .line 239
    invoke-static {v4, v12, v14, v15, v10}, LVa/K8;->h(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v12

    .line 243
    invoke-virtual {v12}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v12

    .line 247
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 254
    .line 255
    .line 256
    move-result v12

    .line 257
    shr-int/lit8 v12, v12, 0x10

    .line 258
    .line 259
    add-int/lit8 v12, v12, 0x2d

    .line 260
    .line 261
    invoke-static {v6}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 262
    .line 263
    .line 264
    move-result v14

    .line 265
    add-int/lit16 v14, v14, 0xb6

    .line 266
    .line 267
    const-string v15, "\uffc6\u001b\u0014\u0019\u001b\u0016\u0016\u0015\u0018\u001a\u000b\n\uffc6\u0015\u0008\u0010\u000b\t\u001a\uffc6\uffcd\uffe0\uffc6\u001a\u0018\u001f\u000f\u0014\r\uffc6\u001a\u0015\uffc6\u001b\u0019\u000b\uffc6\u0001\u0003\uffc6\u0015\u0014\uffc6\u0007\u0014"

    .line 268
    .line 269
    invoke-static {v8, v9}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 270
    .line 271
    .line 272
    move-result v16
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 273
    move-wide/from16 v17, v8

    .line 274
    .line 275
    add-int/lit8 v8, v16, 0x14

    .line 276
    .line 277
    :try_start_5
    invoke-static {v15, v12, v14, v8, v7}, LVa/K8;->h(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v8

    .line 281
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    new-instance v8, LVa/j8;

    .line 296
    .line 297
    invoke-direct {v8, v3, v2, v0, v13}, LVa/j8;-><init>(LVa/y7;LVa/x8;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v3}, LVa/y7;->f()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-virtual {v8, v0}, LVa/j8;->d(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 305
    .line 306
    .line 307
    return-object v5

    .line 308
    :catch_1
    move-exception v0

    .line 309
    :goto_0
    new-instance v8, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 312
    .line 313
    .line 314
    invoke-static/range {v17 .. v18}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 315
    .line 316
    .line 317
    move-result v9

    .line 318
    rsub-int/lit8 v9, v9, 0x2b

    .line 319
    .line 320
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 321
    .line 322
    .line 323
    move-result-wide v11

    .line 324
    cmp-long v11, v11, v17

    .line 325
    .line 326
    add-int/lit16 v11, v11, 0xed

    .line 327
    .line 328
    const-string v12, ""

    .line 329
    .line 330
    invoke-static {v12, v6, v7}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 331
    .line 332
    .line 333
    move-result v6

    .line 334
    rsub-int/lit8 v6, v6, 0x23

    .line 335
    .line 336
    invoke-static {v4, v9, v11, v6, v10}, LVa/K8;->h(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 351
    .line 352
    .line 353
    move-result-wide v11

    .line 354
    const-wide/16 v13, -0x1

    .line 355
    .line 356
    cmp-long v4, v11, v13

    .line 357
    .line 358
    invoke-static {v7}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 359
    .line 360
    .line 361
    move-result-wide v6

    .line 362
    cmp-long v6, v6, v17

    .line 363
    .line 364
    rsub-int v6, v6, 0xb3

    .line 365
    .line 366
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 367
    .line 368
    .line 369
    move-result-wide v11

    .line 370
    cmp-long v7, v11, v17

    .line 371
    .line 372
    const-string v9, "\u0000"

    .line 373
    .line 374
    invoke-static {v9, v4, v6, v7, v10}, LVa/K8;->h(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    new-instance v6, LVa/j8;

    .line 390
    .line 391
    invoke-direct {v6, v3, v2, v4, v0}, LVa/j8;-><init>(LVa/y7;LVa/x8;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v3}, LVa/y7;->f()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {v6, v0}, LVa/j8;->d(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    return-object v5
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    sget v0, LVa/K8;->k:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/K8;->j:I

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-ne p0, p1, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    if-eqz p1, :cond_5

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-class v3, LVa/K8;

    .line 21
    .line 22
    if-eq v3, v2, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-super {p0, p1}, LVa/I8;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    sget p1, LVa/K8;->k:I

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x73

    .line 34
    .line 35
    rem-int/lit16 p1, p1, 0x80

    .line 36
    .line 37
    sput p1, LVa/K8;->j:I

    .line 38
    .line 39
    return v1

    .line 40
    :cond_2
    check-cast p1, LVa/K8;

    .line 41
    .line 42
    iget-object p1, p1, LVa/K8;->i:LVa/y8;

    .line 43
    .line 44
    iget-object v2, p0, LVa/K8;->i:LVa/y8;

    .line 45
    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    sget v0, LVa/K8;->k:I

    .line 49
    .line 50
    add-int/lit8 v0, v0, 0x21

    .line 51
    .line 52
    rem-int/lit16 v0, v0, 0x80

    .line 53
    .line 54
    sput v0, LVa/K8;->j:I

    .line 55
    .line 56
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    return p1

    .line 61
    :cond_3
    if-nez p1, :cond_5

    .line 62
    .line 63
    sget p1, LVa/K8;->j:I

    .line 64
    .line 65
    add-int/lit8 p1, p1, 0x23

    .line 66
    .line 67
    rem-int/lit16 v2, p1, 0x80

    .line 68
    .line 69
    sput v2, LVa/K8;->k:I

    .line 70
    .line 71
    rem-int/lit8 p1, p1, 0x2

    .line 72
    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    const/16 p1, 0x2c

    .line 76
    .line 77
    div-int/2addr p1, v1

    .line 78
    :cond_4
    return v0

    .line 79
    :cond_5
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    invoke-super {p0}, LVa/I8;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object v1, p0, LVa/K8;->i:LVa/y8;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    sget v2, LVa/K8;->j:I

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x77

    .line 14
    .line 15
    rem-int/lit16 v3, v2, 0x80

    .line 16
    .line 17
    sput v3, LVa/K8;->k:I

    .line 18
    .line 19
    rem-int/lit8 v2, v2, 0x2

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    sget v2, LVa/K8;->j:I

    .line 28
    .line 29
    add-int/lit8 v2, v2, 0x7b

    .line 30
    .line 31
    rem-int/lit16 v2, v2, 0x80

    .line 32
    .line 33
    sput v2, LVa/K8;->k:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    throw v0

    .line 41
    :cond_1
    const/4 v1, 0x0

    .line 42
    :goto_0
    add-int/2addr v0, v1

    .line 43
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, LVa/I8;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ""

    .line 14
    .line 15
    invoke-static {v1}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    rsub-int/lit8 v1, v1, 0x2

    .line 20
    .line 21
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    const-wide/16 v4, 0x0

    .line 26
    .line 27
    cmp-long v2, v2, v4

    .line 28
    .line 29
    add-int/lit16 v2, v2, 0xb4

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static {v3, v3}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 33
    .line 34
    .line 35
    move-result-wide v6

    .line 36
    cmp-long v4, v6, v4

    .line 37
    .line 38
    add-int/lit8 v4, v4, 0x3

    .line 39
    .line 40
    const-string v5, "\u0014\ufff7\ufff7"

    .line 41
    .line 42
    invoke-static {v5, v1, v2, v4, v3}, LVa/K8;->h(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    sget v1, LVa/K8;->j:I

    .line 54
    .line 55
    add-int/lit8 v1, v1, 0x5b

    .line 56
    .line 57
    rem-int/lit16 v1, v1, 0x80

    .line 58
    .line 59
    sput v1, LVa/K8;->k:I

    .line 60
    .line 61
    add-int/lit8 v1, v1, 0x17

    .line 62
    .line 63
    rem-int/lit16 v1, v1, 0x80

    .line 64
    .line 65
    sput v1, LVa/K8;->j:I

    .line 66
    .line 67
    iget-object v1, p0, LVa/K8;->i:LVa/y8;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sget v1, LVa/K8;->k:I

    .line 81
    .line 82
    add-int/lit8 v1, v1, 0x5

    .line 83
    .line 84
    rem-int/lit16 v2, v1, 0x80

    .line 85
    .line 86
    sput v2, LVa/K8;->j:I

    .line 87
    .line 88
    rem-int/lit8 v1, v1, 0x2

    .line 89
    .line 90
    if-eqz v1, :cond_0

    .line 91
    .line 92
    const/16 v1, 0x42

    .line 93
    .line 94
    div-int/2addr v1, v3

    .line 95
    :cond_0
    return-object v0
.end method
