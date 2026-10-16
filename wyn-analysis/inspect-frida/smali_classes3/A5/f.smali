.class public final synthetic LA5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA5/k;
.implements Lcom/google/android/gms/tasks/SuccessContinuation;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lk8/h;
.implements Lu6/g;
.implements LE5/g;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA5/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LA5/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LF5/f;

    .line 7
    .line 8
    check-cast p1, Lu6/q;

    .line 9
    .line 10
    invoke-direct {v0, p1}, LF5/f;-><init>(Lu6/q;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    new-array v1, v0, [Ljava/lang/String;

    .line 18
    .line 19
    const-string v2, "SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id"

    .line 20
    .line 21
    invoke-virtual {p1, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-static {}, Lt5/i;->a()Lne/a;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const/4 v3, 0x1

    .line 41
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v2, v3}, Lne/a;->h(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 v3, 0x2

    .line 49
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-static {v3}, LD5/a;->b(I)Lq5/e;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iput-object v3, v2, Lne/a;->c:Ljava/lang/Object;

    .line 58
    .line 59
    const/4 v3, 0x3

    .line 60
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    if-nez v3, :cond_0

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    invoke-static {v3, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    :goto_1
    iput-object v3, v2, Lne/a;->b:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-virtual {v2}, Lne/a;->c()Lt5/i;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 83
    .line 84
    .line 85
    return-object v1

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 88
    .line 89
    .line 90
    throw v0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(Landroid/os/Bundle;)LE5/h;
    .locals 47

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const-string v3, ""

    .line 5
    .line 6
    const v13, -0x800001

    .line 7
    .line 8
    .line 9
    const/4 v14, 0x6

    .line 10
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    const/4 v2, 0x5

    .line 16
    const/4 v15, 0x4

    .line 17
    const/4 v6, 0x3

    .line 18
    const/4 v7, 0x2

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v9, 0x1

    .line 21
    const/16 v10, 0x24

    .line 22
    .line 23
    move-object/from16 v11, p0

    .line 24
    .line 25
    iget v12, v11, LA5/f;->a:I

    .line 26
    .line 27
    packed-switch v12, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-nez v2, :cond_0

    .line 50
    .line 51
    sget-object v2, Ll8/K;->b:Ll8/I;

    .line 52
    .line 53
    sget-object v2, Ll8/e0;->e:Ll8/e0;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    sget-object v4, LE5/T;->H:LA5/f;

    .line 57
    .line 58
    invoke-static {v4, v2}, Lu6/a;->s(LE5/g;Ljava/util/ArrayList;)Ll8/e0;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :goto_0
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {v1, v4, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    new-instance v3, Lf6/Z;

    .line 71
    .line 72
    new-array v4, v8, [LE5/T;

    .line 73
    .line 74
    invoke-virtual {v2, v4}, Ll8/F;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, [LE5/T;

    .line 79
    .line 80
    invoke-direct {v3, v1, v2}, Lf6/Z;-><init>(Ljava/lang/String;[LE5/T;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget v2, v3, Lf6/Z;->a:I

    .line 92
    .line 93
    new-array v4, v2, [I

    .line 94
    .line 95
    invoke-static {v1, v4}, LBa/c;->s(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, [I

    .line 100
    .line 101
    invoke-static {v6, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getBooleanArray(Ljava/lang/String;)[Z

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    new-array v2, v2, [Z

    .line 110
    .line 111
    invoke-static {v4, v2}, LBa/c;->s(Ljava/io/Serializable;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, [Z

    .line 116
    .line 117
    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-virtual {v0, v4, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    new-instance v4, LE5/K0;

    .line 126
    .line 127
    invoke-direct {v4, v3, v0, v1, v2}, LE5/K0;-><init>(Lf6/Z;Z[I[Z)V

    .line 128
    .line 129
    .line 130
    return-object v4

    .line 131
    :pswitch_0
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    if-eqz v3, :cond_1

    .line 140
    .line 141
    sget-object v12, LE5/d0;->g:LA5/f;

    .line 142
    .line 143
    invoke-virtual {v12, v3}, LA5/f;->e(Landroid/os/Bundle;)LE5/h;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    check-cast v3, LE5/d0;

    .line 148
    .line 149
    move-object/from16 v29, v3

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_1
    const/16 v29, 0x0

    .line 153
    .line 154
    :goto_1
    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-virtual {v0, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 159
    .line 160
    .line 161
    move-result-wide v30

    .line 162
    invoke-static {v6, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-virtual {v0, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 167
    .line 168
    .line 169
    move-result-wide v32

    .line 170
    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-virtual {v0, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 175
    .line 176
    .line 177
    move-result-wide v34

    .line 178
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v0, v2, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 183
    .line 184
    .line 185
    move-result v36

    .line 186
    invoke-static {v14, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-virtual {v0, v2, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 191
    .line 192
    .line 193
    move-result v37

    .line 194
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    if-eqz v1, :cond_2

    .line 203
    .line 204
    new-instance v38, LE5/Z;

    .line 205
    .line 206
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-virtual {v1, v2, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 211
    .line 212
    .line 213
    move-result-wide v39

    .line 214
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v1, v2, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 219
    .line 220
    .line 221
    move-result-wide v41

    .line 222
    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-virtual {v1, v2, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 227
    .line 228
    .line 229
    move-result-wide v43

    .line 230
    invoke-static {v6, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-virtual {v1, v2, v13}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 235
    .line 236
    .line 237
    move-result v45

    .line 238
    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-virtual {v1, v2, v13}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 243
    .line 244
    .line 245
    move-result v46

    .line 246
    invoke-direct/range {v38 .. v46}, LE5/Z;-><init>(JJJFF)V

    .line 247
    .line 248
    .line 249
    :goto_2
    const/16 v1, 0x8

    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_2
    const/16 v38, 0x0

    .line 253
    .line 254
    goto :goto_2

    .line 255
    :goto_3
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-virtual {v0, v1, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    const/16 v2, 0x9

    .line 264
    .line 265
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    const-wide/16 v6, 0x0

    .line 270
    .line 271
    invoke-virtual {v0, v2, v6, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 272
    .line 273
    .line 274
    move-result-wide v39

    .line 275
    const/16 v2, 0xa

    .line 276
    .line 277
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-virtual {v0, v2, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 282
    .line 283
    .line 284
    move-result-wide v41

    .line 285
    const/16 v2, 0xb

    .line 286
    .line 287
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    invoke-virtual {v0, v2, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 292
    .line 293
    .line 294
    move-result v43

    .line 295
    const/16 v2, 0xc

    .line 296
    .line 297
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-virtual {v0, v2, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 302
    .line 303
    .line 304
    move-result v44

    .line 305
    const/16 v2, 0xd

    .line 306
    .line 307
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    const-wide/16 v6, 0x0

    .line 312
    .line 313
    invoke-virtual {v0, v2, v6, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 314
    .line 315
    .line 316
    move-result-wide v45

    .line 317
    new-instance v27, LE5/I0;

    .line 318
    .line 319
    invoke-direct/range {v27 .. v27}, LE5/I0;-><init>()V

    .line 320
    .line 321
    .line 322
    sget-object v28, LE5/I0;->r:Ljava/lang/Object;

    .line 323
    .line 324
    invoke-virtual/range {v27 .. v46}, LE5/I0;->b(Ljava/lang/Object;LE5/d0;JJJZZLE5/Z;JJIIJ)V

    .line 325
    .line 326
    .line 327
    move-object/from16 v0, v27

    .line 328
    .line 329
    iput-boolean v1, v0, LE5/I0;->k:Z

    .line 330
    .line 331
    return-object v0

    .line 332
    :pswitch_1
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-virtual {v0, v1, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 337
    .line 338
    .line 339
    move-result v28

    .line 340
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-virtual {v0, v1, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 345
    .line 346
    .line 347
    move-result-wide v29

    .line 348
    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    const-wide/16 v2, 0x0

    .line 353
    .line 354
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 355
    .line 356
    .line 357
    move-result-wide v31

    .line 358
    invoke-static {v6, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 363
    .line 364
    .line 365
    move-result v34

    .line 366
    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    if-eqz v0, :cond_3

    .line 375
    .line 376
    sget-object v1, Lg6/b;->h:Lcom/applovin/impl/Z0;

    .line 377
    .line 378
    invoke-virtual {v1, v0}, Lcom/applovin/impl/Z0;->e(Landroid/os/Bundle;)LE5/h;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    check-cast v0, Lg6/b;

    .line 383
    .line 384
    :goto_4
    move-object/from16 v33, v0

    .line 385
    .line 386
    goto :goto_5

    .line 387
    :cond_3
    sget-object v0, Lg6/b;->f:Lg6/b;

    .line 388
    .line 389
    goto :goto_4

    .line 390
    :goto_5
    new-instance v25, LE5/H0;

    .line 391
    .line 392
    invoke-direct/range {v25 .. v25}, LE5/H0;-><init>()V

    .line 393
    .line 394
    .line 395
    const/16 v26, 0x0

    .line 396
    .line 397
    const/16 v27, 0x0

    .line 398
    .line 399
    invoke-virtual/range {v25 .. v34}, LE5/H0;->h(Ljava/lang/Integer;Ljava/lang/Object;IJJLg6/b;Z)V

    .line 400
    .line 401
    .line 402
    return-object v25

    .line 403
    :pswitch_2
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    const/4 v2, -0x1

    .line 408
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    if-ne v1, v6, :cond_4

    .line 413
    .line 414
    move v1, v9

    .line 415
    goto :goto_6

    .line 416
    :cond_4
    move v1, v8

    .line 417
    :goto_6
    invoke-static {v1}, Lu6/a;->e(Z)V

    .line 418
    .line 419
    .line 420
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    invoke-virtual {v0, v1, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    if-eqz v1, :cond_5

    .line 429
    .line 430
    new-instance v1, LE5/F0;

    .line 431
    .line 432
    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    invoke-virtual {v0, v2, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    invoke-direct {v1, v0}, LE5/F0;-><init>(Z)V

    .line 441
    .line 442
    .line 443
    goto :goto_7

    .line 444
    :cond_5
    new-instance v1, LE5/F0;

    .line 445
    .line 446
    invoke-direct {v1}, LE5/F0;-><init>()V

    .line 447
    .line 448
    .line 449
    :goto_7
    return-object v1

    .line 450
    :pswitch_3
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    const/4 v3, -0x1

    .line 455
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    if-ne v1, v7, :cond_6

    .line 460
    .line 461
    move v8, v9

    .line 462
    :cond_6
    invoke-static {v8}, Lu6/a;->e(Z)V

    .line 463
    .line 464
    .line 465
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    const/high16 v15, -0x40800000    # -1.0f

    .line 478
    .line 479
    invoke-virtual {v0, v2, v15}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    cmpl-float v2, v0, v15

    .line 484
    .line 485
    if-nez v2, :cond_7

    .line 486
    .line 487
    new-instance v0, LE5/D0;

    .line 488
    .line 489
    invoke-direct {v0, v1}, LE5/D0;-><init>(I)V

    .line 490
    .line 491
    .line 492
    goto :goto_8

    .line 493
    :cond_7
    new-instance v2, LE5/D0;

    .line 494
    .line 495
    invoke-direct {v2, v1, v0}, LE5/D0;-><init>(IF)V

    .line 496
    .line 497
    .line 498
    move-object v0, v2

    .line 499
    :goto_8
    return-object v0

    .line 500
    :pswitch_4
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    const/4 v3, -0x1

    .line 505
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 506
    .line 507
    .line 508
    move-result v1

    .line 509
    if-eqz v1, :cond_11

    .line 510
    .line 511
    if-eq v1, v9, :cond_e

    .line 512
    .line 513
    if-eq v1, v7, :cond_b

    .line 514
    .line 515
    if-ne v1, v6, :cond_a

    .line 516
    .line 517
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 522
    .line 523
    .line 524
    move-result v1

    .line 525
    if-ne v1, v6, :cond_8

    .line 526
    .line 527
    move v1, v9

    .line 528
    goto :goto_9

    .line 529
    :cond_8
    move v1, v8

    .line 530
    :goto_9
    invoke-static {v1}, Lu6/a;->e(Z)V

    .line 531
    .line 532
    .line 533
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    invoke-virtual {v0, v1, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 538
    .line 539
    .line 540
    move-result v1

    .line 541
    if-eqz v1, :cond_9

    .line 542
    .line 543
    new-instance v1, LE5/F0;

    .line 544
    .line 545
    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    invoke-virtual {v0, v2, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 550
    .line 551
    .line 552
    move-result v0

    .line 553
    invoke-direct {v1, v0}, LE5/F0;-><init>(Z)V

    .line 554
    .line 555
    .line 556
    goto/16 :goto_b

    .line 557
    .line 558
    :cond_9
    new-instance v1, LE5/F0;

    .line 559
    .line 560
    invoke-direct {v1}, LE5/F0;-><init>()V

    .line 561
    .line 562
    .line 563
    goto/16 :goto_b

    .line 564
    .line 565
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 566
    .line 567
    const-string v2, "Unknown RatingType: "

    .line 568
    .line 569
    invoke-static {v1, v2}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    throw v0

    .line 577
    :cond_b
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    const/4 v3, -0x1

    .line 582
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 583
    .line 584
    .line 585
    move-result v1

    .line 586
    if-ne v1, v7, :cond_c

    .line 587
    .line 588
    move v8, v9

    .line 589
    :cond_c
    invoke-static {v8}, Lu6/a;->e(Z)V

    .line 590
    .line 591
    .line 592
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 597
    .line 598
    .line 599
    move-result v1

    .line 600
    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    const/high16 v15, -0x40800000    # -1.0f

    .line 605
    .line 606
    invoke-virtual {v0, v2, v15}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    cmpl-float v2, v0, v15

    .line 611
    .line 612
    if-nez v2, :cond_d

    .line 613
    .line 614
    new-instance v0, LE5/D0;

    .line 615
    .line 616
    invoke-direct {v0, v1}, LE5/D0;-><init>(I)V

    .line 617
    .line 618
    .line 619
    move-object v1, v0

    .line 620
    goto :goto_b

    .line 621
    :cond_d
    new-instance v2, LE5/D0;

    .line 622
    .line 623
    invoke-direct {v2, v1, v0}, LE5/D0;-><init>(IF)V

    .line 624
    .line 625
    .line 626
    move-object v1, v2

    .line 627
    goto :goto_b

    .line 628
    :cond_e
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    const/4 v3, -0x1

    .line 633
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 634
    .line 635
    .line 636
    move-result v1

    .line 637
    if-ne v1, v9, :cond_f

    .line 638
    .line 639
    move v8, v9

    .line 640
    :cond_f
    invoke-static {v8}, Lu6/a;->e(Z)V

    .line 641
    .line 642
    .line 643
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v1

    .line 647
    const/high16 v15, -0x40800000    # -1.0f

    .line 648
    .line 649
    invoke-virtual {v0, v1, v15}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 650
    .line 651
    .line 652
    move-result v0

    .line 653
    cmpl-float v1, v0, v15

    .line 654
    .line 655
    if-nez v1, :cond_10

    .line 656
    .line 657
    new-instance v1, LE5/p0;

    .line 658
    .line 659
    invoke-direct {v1}, LE5/p0;-><init>()V

    .line 660
    .line 661
    .line 662
    goto :goto_b

    .line 663
    :cond_10
    new-instance v1, LE5/p0;

    .line 664
    .line 665
    invoke-direct {v1, v0}, LE5/p0;-><init>(F)V

    .line 666
    .line 667
    .line 668
    goto :goto_b

    .line 669
    :cond_11
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    const/4 v3, -0x1

    .line 674
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 675
    .line 676
    .line 677
    move-result v1

    .line 678
    if-nez v1, :cond_12

    .line 679
    .line 680
    move v1, v9

    .line 681
    goto :goto_a

    .line 682
    :cond_12
    move v1, v8

    .line 683
    :goto_a
    invoke-static {v1}, Lu6/a;->e(Z)V

    .line 684
    .line 685
    .line 686
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    invoke-virtual {v0, v1, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 691
    .line 692
    .line 693
    move-result v1

    .line 694
    if-eqz v1, :cond_13

    .line 695
    .line 696
    new-instance v1, LE5/U;

    .line 697
    .line 698
    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v2

    .line 702
    invoke-virtual {v0, v2, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 703
    .line 704
    .line 705
    move-result v0

    .line 706
    invoke-direct {v1, v0}, LE5/U;-><init>(Z)V

    .line 707
    .line 708
    .line 709
    goto :goto_b

    .line 710
    :cond_13
    new-instance v1, LE5/U;

    .line 711
    .line 712
    invoke-direct {v1}, LE5/U;-><init>()V

    .line 713
    .line 714
    .line 715
    :goto_b
    return-object v1

    .line 716
    :pswitch_5
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v1

    .line 720
    const/4 v3, -0x1

    .line 721
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 722
    .line 723
    .line 724
    move-result v1

    .line 725
    if-ne v1, v9, :cond_14

    .line 726
    .line 727
    move v8, v9

    .line 728
    :cond_14
    invoke-static {v8}, Lu6/a;->e(Z)V

    .line 729
    .line 730
    .line 731
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v1

    .line 735
    const/high16 v15, -0x40800000    # -1.0f

    .line 736
    .line 737
    invoke-virtual {v0, v1, v15}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 738
    .line 739
    .line 740
    move-result v0

    .line 741
    cmpl-float v1, v0, v15

    .line 742
    .line 743
    if-nez v1, :cond_15

    .line 744
    .line 745
    new-instance v0, LE5/p0;

    .line 746
    .line 747
    invoke-direct {v0}, LE5/p0;-><init>()V

    .line 748
    .line 749
    .line 750
    goto :goto_c

    .line 751
    :cond_15
    new-instance v1, LE5/p0;

    .line 752
    .line 753
    invoke-direct {v1, v0}, LE5/p0;-><init>(F)V

    .line 754
    .line 755
    .line 756
    move-object v0, v1

    .line 757
    :goto_c
    return-object v0

    .line 758
    :pswitch_6
    new-instance v1, LE5/e0;

    .line 759
    .line 760
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 761
    .line 762
    .line 763
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v3

    .line 767
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 768
    .line 769
    .line 770
    move-result-object v3

    .line 771
    iput-object v3, v1, LE5/e0;->a:Ljava/lang/CharSequence;

    .line 772
    .line 773
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object v3

    .line 777
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 778
    .line 779
    .line 780
    move-result-object v3

    .line 781
    iput-object v3, v1, LE5/e0;->b:Ljava/lang/CharSequence;

    .line 782
    .line 783
    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v3

    .line 787
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 788
    .line 789
    .line 790
    move-result-object v3

    .line 791
    iput-object v3, v1, LE5/e0;->c:Ljava/lang/CharSequence;

    .line 792
    .line 793
    invoke-static {v6, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v3

    .line 797
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 798
    .line 799
    .line 800
    move-result-object v3

    .line 801
    iput-object v3, v1, LE5/e0;->d:Ljava/lang/CharSequence;

    .line 802
    .line 803
    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v3

    .line 807
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 808
    .line 809
    .line 810
    move-result-object v3

    .line 811
    iput-object v3, v1, LE5/e0;->e:Ljava/lang/CharSequence;

    .line 812
    .line 813
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v2

    .line 817
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 818
    .line 819
    .line 820
    move-result-object v2

    .line 821
    iput-object v2, v1, LE5/e0;->f:Ljava/lang/CharSequence;

    .line 822
    .line 823
    invoke-static {v14, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v2

    .line 827
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 828
    .line 829
    .line 830
    move-result-object v2

    .line 831
    iput-object v2, v1, LE5/e0;->g:Ljava/lang/CharSequence;

    .line 832
    .line 833
    const/16 v2, 0xa

    .line 834
    .line 835
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 836
    .line 837
    .line 838
    move-result-object v2

    .line 839
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    const/16 v3, 0x1d

    .line 844
    .line 845
    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v4

    .line 849
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 850
    .line 851
    .line 852
    move-result v4

    .line 853
    if-eqz v4, :cond_16

    .line 854
    .line 855
    invoke-static {v3, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v3

    .line 859
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 860
    .line 861
    .line 862
    move-result v3

    .line 863
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 864
    .line 865
    .line 866
    move-result-object v3

    .line 867
    goto :goto_d

    .line 868
    :cond_16
    const/4 v3, 0x0

    .line 869
    :goto_d
    if-nez v2, :cond_17

    .line 870
    .line 871
    const/4 v2, 0x0

    .line 872
    goto :goto_e

    .line 873
    :cond_17
    invoke-virtual {v2}, [B->clone()Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v2

    .line 877
    check-cast v2, [B

    .line 878
    .line 879
    :goto_e
    iput-object v2, v1, LE5/e0;->j:[B

    .line 880
    .line 881
    iput-object v3, v1, LE5/e0;->k:Ljava/lang/Integer;

    .line 882
    .line 883
    const/16 v2, 0xb

    .line 884
    .line 885
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 886
    .line 887
    .line 888
    move-result-object v2

    .line 889
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 890
    .line 891
    .line 892
    move-result-object v2

    .line 893
    check-cast v2, Landroid/net/Uri;

    .line 894
    .line 895
    iput-object v2, v1, LE5/e0;->l:Landroid/net/Uri;

    .line 896
    .line 897
    const/16 v2, 0x16

    .line 898
    .line 899
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v2

    .line 903
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 904
    .line 905
    .line 906
    move-result-object v2

    .line 907
    iput-object v2, v1, LE5/e0;->w:Ljava/lang/CharSequence;

    .line 908
    .line 909
    const/16 v2, 0x17

    .line 910
    .line 911
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v2

    .line 915
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 916
    .line 917
    .line 918
    move-result-object v2

    .line 919
    iput-object v2, v1, LE5/e0;->x:Ljava/lang/CharSequence;

    .line 920
    .line 921
    const/16 v2, 0x18

    .line 922
    .line 923
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 928
    .line 929
    .line 930
    move-result-object v2

    .line 931
    iput-object v2, v1, LE5/e0;->y:Ljava/lang/CharSequence;

    .line 932
    .line 933
    const/16 v2, 0x1b

    .line 934
    .line 935
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 936
    .line 937
    .line 938
    move-result-object v2

    .line 939
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 940
    .line 941
    .line 942
    move-result-object v2

    .line 943
    iput-object v2, v1, LE5/e0;->B:Ljava/lang/CharSequence;

    .line 944
    .line 945
    const/16 v2, 0x1c

    .line 946
    .line 947
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 948
    .line 949
    .line 950
    move-result-object v2

    .line 951
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 952
    .line 953
    .line 954
    move-result-object v2

    .line 955
    iput-object v2, v1, LE5/e0;->C:Ljava/lang/CharSequence;

    .line 956
    .line 957
    const/16 v2, 0x1e

    .line 958
    .line 959
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 960
    .line 961
    .line 962
    move-result-object v2

    .line 963
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 964
    .line 965
    .line 966
    move-result-object v2

    .line 967
    iput-object v2, v1, LE5/e0;->D:Ljava/lang/CharSequence;

    .line 968
    .line 969
    const/16 v2, 0x3e8

    .line 970
    .line 971
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 972
    .line 973
    .line 974
    move-result-object v2

    .line 975
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 976
    .line 977
    .line 978
    move-result-object v2

    .line 979
    iput-object v2, v1, LE5/e0;->E:Landroid/os/Bundle;

    .line 980
    .line 981
    const/16 v2, 0x8

    .line 982
    .line 983
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 984
    .line 985
    .line 986
    move-result-object v3

    .line 987
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 988
    .line 989
    .line 990
    move-result v3

    .line 991
    sget-object v4, LE5/A0;->a:LA5/f;

    .line 992
    .line 993
    if-eqz v3, :cond_18

    .line 994
    .line 995
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v2

    .line 999
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v2

    .line 1003
    if-eqz v2, :cond_18

    .line 1004
    .line 1005
    invoke-virtual {v4, v2}, LA5/f;->e(Landroid/os/Bundle;)LE5/h;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v2

    .line 1009
    check-cast v2, LE5/A0;

    .line 1010
    .line 1011
    iput-object v2, v1, LE5/e0;->h:LE5/A0;

    .line 1012
    .line 1013
    :cond_18
    const/16 v2, 0x9

    .line 1014
    .line 1015
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v3

    .line 1019
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v3

    .line 1023
    if-eqz v3, :cond_19

    .line 1024
    .line 1025
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v2

    .line 1029
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v2

    .line 1033
    if-eqz v2, :cond_19

    .line 1034
    .line 1035
    invoke-virtual {v4, v2}, LA5/f;->e(Landroid/os/Bundle;)LE5/h;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v2

    .line 1039
    check-cast v2, LE5/A0;

    .line 1040
    .line 1041
    iput-object v2, v1, LE5/e0;->i:LE5/A0;

    .line 1042
    .line 1043
    :cond_19
    const/16 v2, 0xc

    .line 1044
    .line 1045
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v3

    .line 1049
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1050
    .line 1051
    .line 1052
    move-result v3

    .line 1053
    if-eqz v3, :cond_1a

    .line 1054
    .line 1055
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v2

    .line 1059
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1060
    .line 1061
    .line 1062
    move-result v2

    .line 1063
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v2

    .line 1067
    iput-object v2, v1, LE5/e0;->m:Ljava/lang/Integer;

    .line 1068
    .line 1069
    :cond_1a
    const/16 v2, 0xd

    .line 1070
    .line 1071
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v3

    .line 1075
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1076
    .line 1077
    .line 1078
    move-result v3

    .line 1079
    if-eqz v3, :cond_1b

    .line 1080
    .line 1081
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v2

    .line 1085
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1086
    .line 1087
    .line 1088
    move-result v2

    .line 1089
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v2

    .line 1093
    iput-object v2, v1, LE5/e0;->n:Ljava/lang/Integer;

    .line 1094
    .line 1095
    :cond_1b
    const/16 v2, 0xe

    .line 1096
    .line 1097
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v3

    .line 1101
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1102
    .line 1103
    .line 1104
    move-result v3

    .line 1105
    if-eqz v3, :cond_1c

    .line 1106
    .line 1107
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v2

    .line 1111
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1112
    .line 1113
    .line 1114
    move-result v2

    .line 1115
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v2

    .line 1119
    iput-object v2, v1, LE5/e0;->o:Ljava/lang/Integer;

    .line 1120
    .line 1121
    :cond_1c
    const/16 v2, 0xf

    .line 1122
    .line 1123
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v3

    .line 1127
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1128
    .line 1129
    .line 1130
    move-result v3

    .line 1131
    if-eqz v3, :cond_1d

    .line 1132
    .line 1133
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v2

    .line 1137
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 1138
    .line 1139
    .line 1140
    move-result v2

    .line 1141
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v2

    .line 1145
    iput-object v2, v1, LE5/e0;->p:Ljava/lang/Boolean;

    .line 1146
    .line 1147
    :cond_1d
    const/16 v2, 0x10

    .line 1148
    .line 1149
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v3

    .line 1153
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1154
    .line 1155
    .line 1156
    move-result v3

    .line 1157
    if-eqz v3, :cond_1e

    .line 1158
    .line 1159
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v2

    .line 1163
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1164
    .line 1165
    .line 1166
    move-result v2

    .line 1167
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v2

    .line 1171
    iput-object v2, v1, LE5/e0;->q:Ljava/lang/Integer;

    .line 1172
    .line 1173
    :cond_1e
    const/16 v2, 0x11

    .line 1174
    .line 1175
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v3

    .line 1179
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1180
    .line 1181
    .line 1182
    move-result v3

    .line 1183
    if-eqz v3, :cond_1f

    .line 1184
    .line 1185
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v2

    .line 1189
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1190
    .line 1191
    .line 1192
    move-result v2

    .line 1193
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v2

    .line 1197
    iput-object v2, v1, LE5/e0;->r:Ljava/lang/Integer;

    .line 1198
    .line 1199
    :cond_1f
    const/16 v2, 0x12

    .line 1200
    .line 1201
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v3

    .line 1205
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1206
    .line 1207
    .line 1208
    move-result v3

    .line 1209
    if-eqz v3, :cond_20

    .line 1210
    .line 1211
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v2

    .line 1215
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1216
    .line 1217
    .line 1218
    move-result v2

    .line 1219
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v2

    .line 1223
    iput-object v2, v1, LE5/e0;->s:Ljava/lang/Integer;

    .line 1224
    .line 1225
    :cond_20
    const/16 v2, 0x13

    .line 1226
    .line 1227
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v3

    .line 1231
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1232
    .line 1233
    .line 1234
    move-result v3

    .line 1235
    if-eqz v3, :cond_21

    .line 1236
    .line 1237
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v2

    .line 1241
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1242
    .line 1243
    .line 1244
    move-result v2

    .line 1245
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v2

    .line 1249
    iput-object v2, v1, LE5/e0;->t:Ljava/lang/Integer;

    .line 1250
    .line 1251
    :cond_21
    const/16 v2, 0x14

    .line 1252
    .line 1253
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v3

    .line 1257
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1258
    .line 1259
    .line 1260
    move-result v3

    .line 1261
    if-eqz v3, :cond_22

    .line 1262
    .line 1263
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v2

    .line 1267
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1268
    .line 1269
    .line 1270
    move-result v2

    .line 1271
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v2

    .line 1275
    iput-object v2, v1, LE5/e0;->u:Ljava/lang/Integer;

    .line 1276
    .line 1277
    :cond_22
    const/16 v2, 0x15

    .line 1278
    .line 1279
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v3

    .line 1283
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1284
    .line 1285
    .line 1286
    move-result v3

    .line 1287
    if-eqz v3, :cond_23

    .line 1288
    .line 1289
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v2

    .line 1293
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1294
    .line 1295
    .line 1296
    move-result v2

    .line 1297
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v2

    .line 1301
    iput-object v2, v1, LE5/e0;->v:Ljava/lang/Integer;

    .line 1302
    .line 1303
    :cond_23
    const/16 v2, 0x19

    .line 1304
    .line 1305
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v3

    .line 1309
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1310
    .line 1311
    .line 1312
    move-result v3

    .line 1313
    if-eqz v3, :cond_24

    .line 1314
    .line 1315
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v2

    .line 1319
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1320
    .line 1321
    .line 1322
    move-result v2

    .line 1323
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v2

    .line 1327
    iput-object v2, v1, LE5/e0;->z:Ljava/lang/Integer;

    .line 1328
    .line 1329
    :cond_24
    const/16 v2, 0x1a

    .line 1330
    .line 1331
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v3

    .line 1335
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 1336
    .line 1337
    .line 1338
    move-result v3

    .line 1339
    if-eqz v3, :cond_25

    .line 1340
    .line 1341
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v2

    .line 1345
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1346
    .line 1347
    .line 1348
    move-result v0

    .line 1349
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v0

    .line 1353
    iput-object v0, v1, LE5/e0;->A:Ljava/lang/Integer;

    .line 1354
    .line 1355
    :cond_25
    new-instance v0, LE5/f0;

    .line 1356
    .line 1357
    invoke-direct {v0, v1}, LE5/f0;-><init>(LE5/e0;)V

    .line 1358
    .line 1359
    .line 1360
    return-object v0

    .line 1361
    :pswitch_7
    new-instance v1, LG9/e;

    .line 1362
    .line 1363
    invoke-direct {v1, v15}, LG9/e;-><init>(I)V

    .line 1364
    .line 1365
    .line 1366
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v2

    .line 1370
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v2

    .line 1374
    check-cast v2, Landroid/net/Uri;

    .line 1375
    .line 1376
    iput-object v2, v1, LG9/e;->b:Ljava/lang/Object;

    .line 1377
    .line 1378
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v2

    .line 1382
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v2

    .line 1386
    iput-object v2, v1, LG9/e;->c:Ljava/lang/Object;

    .line 1387
    .line 1388
    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v2

    .line 1392
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v0

    .line 1396
    iput-object v0, v1, LG9/e;->d:Ljava/lang/Object;

    .line 1397
    .line 1398
    new-instance v0, LE5/b0;

    .line 1399
    .line 1400
    invoke-direct {v0, v1}, LE5/b0;-><init>(LG9/e;)V

    .line 1401
    .line 1402
    .line 1403
    return-object v0

    .line 1404
    :pswitch_8
    new-instance v2, LE5/Z;

    .line 1405
    .line 1406
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v1

    .line 1410
    invoke-virtual {v0, v1, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 1411
    .line 1412
    .line 1413
    move-result-wide v16

    .line 1414
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v1

    .line 1418
    invoke-virtual {v0, v1, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 1419
    .line 1420
    .line 1421
    move-result-wide v8

    .line 1422
    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v1

    .line 1426
    invoke-virtual {v0, v1, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 1427
    .line 1428
    .line 1429
    move-result-wide v3

    .line 1430
    invoke-static {v6, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v1

    .line 1434
    invoke-virtual {v0, v1, v13}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 1435
    .line 1436
    .line 1437
    move-result v1

    .line 1438
    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v5

    .line 1442
    invoke-virtual {v0, v5, v13}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 1443
    .line 1444
    .line 1445
    move-result v10

    .line 1446
    move-wide v5, v8

    .line 1447
    move v9, v1

    .line 1448
    move-wide v7, v3

    .line 1449
    move-wide/from16 v3, v16

    .line 1450
    .line 1451
    invoke-direct/range {v2 .. v10}, LE5/Z;-><init>(JJJFF)V

    .line 1452
    .line 1453
    .line 1454
    return-object v2

    .line 1455
    :pswitch_9
    new-instance v1, LE5/V;

    .line 1456
    .line 1457
    invoke-direct {v1}, LE5/V;-><init>()V

    .line 1458
    .line 1459
    .line 1460
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v2

    .line 1464
    const-wide/16 v3, 0x0

    .line 1465
    .line 1466
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 1467
    .line 1468
    .line 1469
    move-result-wide v12

    .line 1470
    cmp-long v2, v12, v3

    .line 1471
    .line 1472
    if-ltz v2, :cond_26

    .line 1473
    .line 1474
    move v2, v9

    .line 1475
    goto :goto_f

    .line 1476
    :cond_26
    move v2, v8

    .line 1477
    :goto_f
    invoke-static {v2}, Lu6/a;->e(Z)V

    .line 1478
    .line 1479
    .line 1480
    iput-wide v12, v1, LE5/V;->a:J

    .line 1481
    .line 1482
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v2

    .line 1486
    const-wide/high16 v3, -0x8000000000000000L

    .line 1487
    .line 1488
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 1489
    .line 1490
    .line 1491
    move-result-wide v12

    .line 1492
    cmp-long v2, v12, v3

    .line 1493
    .line 1494
    if-eqz v2, :cond_28

    .line 1495
    .line 1496
    const-wide/16 v23, 0x0

    .line 1497
    .line 1498
    cmp-long v2, v12, v23

    .line 1499
    .line 1500
    if-ltz v2, :cond_27

    .line 1501
    .line 1502
    goto :goto_10

    .line 1503
    :cond_27
    move v9, v8

    .line 1504
    :cond_28
    :goto_10
    invoke-static {v9}, Lu6/a;->e(Z)V

    .line 1505
    .line 1506
    .line 1507
    iput-wide v12, v1, LE5/V;->b:J

    .line 1508
    .line 1509
    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v2

    .line 1513
    invoke-virtual {v0, v2, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 1514
    .line 1515
    .line 1516
    move-result v2

    .line 1517
    iput-boolean v2, v1, LE5/V;->c:Z

    .line 1518
    .line 1519
    invoke-static {v6, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v2

    .line 1523
    invoke-virtual {v0, v2, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 1524
    .line 1525
    .line 1526
    move-result v2

    .line 1527
    iput-boolean v2, v1, LE5/V;->d:Z

    .line 1528
    .line 1529
    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v2

    .line 1533
    invoke-virtual {v0, v2, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 1534
    .line 1535
    .line 1536
    move-result v0

    .line 1537
    iput-boolean v0, v1, LE5/V;->e:Z

    .line 1538
    .line 1539
    new-instance v0, LE5/X;

    .line 1540
    .line 1541
    invoke-direct {v0, v1}, LE5/W;-><init>(LE5/V;)V

    .line 1542
    .line 1543
    .line 1544
    return-object v0

    .line 1545
    :pswitch_a
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v1

    .line 1549
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v17

    .line 1553
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1554
    .line 1555
    .line 1556
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v1

    .line 1560
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v1

    .line 1564
    if-nez v1, :cond_29

    .line 1565
    .line 1566
    sget-object v1, LE5/Z;->f:LE5/Z;

    .line 1567
    .line 1568
    move-object/from16 v20, v1

    .line 1569
    .line 1570
    goto :goto_11

    .line 1571
    :cond_29
    new-instance v18, LE5/Z;

    .line 1572
    .line 1573
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v2

    .line 1577
    invoke-virtual {v1, v2, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 1578
    .line 1579
    .line 1580
    move-result-wide v19

    .line 1581
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v2

    .line 1585
    invoke-virtual {v1, v2, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 1586
    .line 1587
    .line 1588
    move-result-wide v21

    .line 1589
    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v2

    .line 1593
    invoke-virtual {v1, v2, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 1594
    .line 1595
    .line 1596
    move-result-wide v23

    .line 1597
    invoke-static {v6, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v2

    .line 1601
    invoke-virtual {v1, v2, v13}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 1602
    .line 1603
    .line 1604
    move-result v25

    .line 1605
    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v2

    .line 1609
    invoke-virtual {v1, v2, v13}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 1610
    .line 1611
    .line 1612
    move-result v26

    .line 1613
    invoke-direct/range {v18 .. v26}, LE5/Z;-><init>(JJJFF)V

    .line 1614
    .line 1615
    .line 1616
    move-object/from16 v20, v18

    .line 1617
    .line 1618
    :goto_11
    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v1

    .line 1622
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v1

    .line 1626
    if-nez v1, :cond_2a

    .line 1627
    .line 1628
    sget-object v1, LE5/f0;->G:LE5/f0;

    .line 1629
    .line 1630
    :goto_12
    move-object/from16 v21, v1

    .line 1631
    .line 1632
    goto :goto_13

    .line 1633
    :cond_2a
    sget-object v2, LE5/f0;->H:LA5/f;

    .line 1634
    .line 1635
    invoke-virtual {v2, v1}, LA5/f;->e(Landroid/os/Bundle;)LE5/h;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v1

    .line 1639
    check-cast v1, LE5/f0;

    .line 1640
    .line 1641
    goto :goto_12

    .line 1642
    :goto_13
    invoke-static {v6, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v1

    .line 1646
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v1

    .line 1650
    if-nez v1, :cond_2b

    .line 1651
    .line 1652
    sget-object v1, LE5/X;->g:LE5/X;

    .line 1653
    .line 1654
    :goto_14
    move-object/from16 v18, v1

    .line 1655
    .line 1656
    goto :goto_15

    .line 1657
    :cond_2b
    sget-object v2, LE5/W;->f:LA5/f;

    .line 1658
    .line 1659
    invoke-virtual {v2, v1}, LA5/f;->e(Landroid/os/Bundle;)LE5/h;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v1

    .line 1663
    check-cast v1, LE5/X;

    .line 1664
    .line 1665
    goto :goto_14

    .line 1666
    :goto_15
    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v1

    .line 1670
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v0

    .line 1674
    if-nez v0, :cond_2c

    .line 1675
    .line 1676
    sget-object v0, LE5/b0;->c:LE5/b0;

    .line 1677
    .line 1678
    :goto_16
    move-object/from16 v22, v0

    .line 1679
    .line 1680
    goto :goto_17

    .line 1681
    :cond_2c
    sget-object v1, LE5/b0;->d:LA5/f;

    .line 1682
    .line 1683
    :try_start_0
    invoke-virtual {v1, v0}, LA5/f;->e(Landroid/os/Bundle;)LE5/h;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1687
    check-cast v0, LE5/b0;

    .line 1688
    .line 1689
    goto :goto_16

    .line 1690
    :goto_17
    new-instance v16, LE5/d0;

    .line 1691
    .line 1692
    const/16 v19, 0x0

    .line 1693
    .line 1694
    invoke-direct/range {v16 .. v22}, LE5/d0;-><init>(Ljava/lang/String;LE5/X;LE5/a0;LE5/Z;LE5/f0;LE5/b0;)V

    .line 1695
    .line 1696
    .line 1697
    return-object v16

    .line 1698
    :catchall_0
    move-exception v0

    .line 1699
    throw v0

    .line 1700
    :pswitch_b
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v1

    .line 1704
    const/4 v3, -0x1

    .line 1705
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1706
    .line 1707
    .line 1708
    move-result v1

    .line 1709
    if-nez v1, :cond_2d

    .line 1710
    .line 1711
    move v1, v9

    .line 1712
    goto :goto_18

    .line 1713
    :cond_2d
    move v1, v8

    .line 1714
    :goto_18
    invoke-static {v1}, Lu6/a;->e(Z)V

    .line 1715
    .line 1716
    .line 1717
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v1

    .line 1721
    invoke-virtual {v0, v1, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 1722
    .line 1723
    .line 1724
    move-result v1

    .line 1725
    if-eqz v1, :cond_2e

    .line 1726
    .line 1727
    new-instance v1, LE5/U;

    .line 1728
    .line 1729
    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v2

    .line 1733
    invoke-virtual {v0, v2, v8}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 1734
    .line 1735
    .line 1736
    move-result v0

    .line 1737
    invoke-direct {v1, v0}, LE5/U;-><init>(Z)V

    .line 1738
    .line 1739
    .line 1740
    goto :goto_19

    .line 1741
    :cond_2e
    new-instance v1, LE5/U;

    .line 1742
    .line 1743
    invoke-direct {v1}, LE5/U;-><init>()V

    .line 1744
    .line 1745
    .line 1746
    :goto_19
    return-object v1

    .line 1747
    :pswitch_c
    new-instance v3, LE5/S;

    .line 1748
    .line 1749
    invoke-direct {v3}, LE5/S;-><init>()V

    .line 1750
    .line 1751
    .line 1752
    if-eqz v0, :cond_2f

    .line 1753
    .line 1754
    const-class v4, Lu6/a;

    .line 1755
    .line 1756
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v4

    .line 1760
    sget v5, Lu6/v;->a:I

    .line 1761
    .line 1762
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 1763
    .line 1764
    .line 1765
    :cond_2f
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v4

    .line 1769
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v4

    .line 1773
    sget-object v5, LE5/T;->G:LE5/T;

    .line 1774
    .line 1775
    iget-object v12, v5, LE5/T;->a:Ljava/lang/String;

    .line 1776
    .line 1777
    if-eqz v4, :cond_30

    .line 1778
    .line 1779
    goto :goto_1a

    .line 1780
    :cond_30
    move-object v4, v12

    .line 1781
    :goto_1a
    iput-object v4, v3, LE5/S;->a:Ljava/lang/String;

    .line 1782
    .line 1783
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v4

    .line 1787
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1788
    .line 1789
    .line 1790
    move-result-object v4

    .line 1791
    if-eqz v4, :cond_31

    .line 1792
    .line 1793
    goto :goto_1b

    .line 1794
    :cond_31
    iget-object v4, v5, LE5/T;->b:Ljava/lang/String;

    .line 1795
    .line 1796
    :goto_1b
    iput-object v4, v3, LE5/S;->b:Ljava/lang/String;

    .line 1797
    .line 1798
    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v4

    .line 1802
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v4

    .line 1806
    if-eqz v4, :cond_32

    .line 1807
    .line 1808
    goto :goto_1c

    .line 1809
    :cond_32
    iget-object v4, v5, LE5/T;->c:Ljava/lang/String;

    .line 1810
    .line 1811
    :goto_1c
    iput-object v4, v3, LE5/S;->c:Ljava/lang/String;

    .line 1812
    .line 1813
    invoke-static {v6, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1814
    .line 1815
    .line 1816
    move-result-object v4

    .line 1817
    iget v12, v5, LE5/T;->d:I

    .line 1818
    .line 1819
    invoke-virtual {v0, v4, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1820
    .line 1821
    .line 1822
    move-result v4

    .line 1823
    iput v4, v3, LE5/S;->d:I

    .line 1824
    .line 1825
    invoke-static {v15, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v4

    .line 1829
    iget v12, v5, LE5/T;->e:I

    .line 1830
    .line 1831
    invoke-virtual {v0, v4, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1832
    .line 1833
    .line 1834
    move-result v4

    .line 1835
    iput v4, v3, LE5/S;->e:I

    .line 1836
    .line 1837
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v2

    .line 1841
    iget v4, v5, LE5/T;->f:I

    .line 1842
    .line 1843
    invoke-virtual {v0, v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1844
    .line 1845
    .line 1846
    move-result v2

    .line 1847
    iput v2, v3, LE5/S;->f:I

    .line 1848
    .line 1849
    invoke-static {v14, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v2

    .line 1853
    iget v4, v5, LE5/T;->g:I

    .line 1854
    .line 1855
    invoke-virtual {v0, v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1856
    .line 1857
    .line 1858
    move-result v2

    .line 1859
    iput v2, v3, LE5/S;->g:I

    .line 1860
    .line 1861
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v1

    .line 1865
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v1

    .line 1869
    if-eqz v1, :cond_33

    .line 1870
    .line 1871
    goto :goto_1d

    .line 1872
    :cond_33
    iget-object v1, v5, LE5/T;->i:Ljava/lang/String;

    .line 1873
    .line 1874
    :goto_1d
    iput-object v1, v3, LE5/S;->h:Ljava/lang/String;

    .line 1875
    .line 1876
    const/16 v1, 0x8

    .line 1877
    .line 1878
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1879
    .line 1880
    .line 1881
    move-result-object v1

    .line 1882
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v1

    .line 1886
    check-cast v1, LW5/c;

    .line 1887
    .line 1888
    if-eqz v1, :cond_34

    .line 1889
    .line 1890
    goto :goto_1e

    .line 1891
    :cond_34
    iget-object v1, v5, LE5/T;->j:LW5/c;

    .line 1892
    .line 1893
    :goto_1e
    iput-object v1, v3, LE5/S;->i:LW5/c;

    .line 1894
    .line 1895
    const/16 v2, 0x9

    .line 1896
    .line 1897
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1898
    .line 1899
    .line 1900
    move-result-object v1

    .line 1901
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1902
    .line 1903
    .line 1904
    move-result-object v1

    .line 1905
    if-eqz v1, :cond_35

    .line 1906
    .line 1907
    goto :goto_1f

    .line 1908
    :cond_35
    iget-object v1, v5, LE5/T;->k:Ljava/lang/String;

    .line 1909
    .line 1910
    :goto_1f
    iput-object v1, v3, LE5/S;->j:Ljava/lang/String;

    .line 1911
    .line 1912
    const/16 v2, 0xa

    .line 1913
    .line 1914
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v1

    .line 1918
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v1

    .line 1922
    if-eqz v1, :cond_36

    .line 1923
    .line 1924
    goto :goto_20

    .line 1925
    :cond_36
    iget-object v1, v5, LE5/T;->l:Ljava/lang/String;

    .line 1926
    .line 1927
    :goto_20
    iput-object v1, v3, LE5/S;->k:Ljava/lang/String;

    .line 1928
    .line 1929
    const/16 v2, 0xb

    .line 1930
    .line 1931
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1932
    .line 1933
    .line 1934
    move-result-object v1

    .line 1935
    iget v2, v5, LE5/T;->m:I

    .line 1936
    .line 1937
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1938
    .line 1939
    .line 1940
    move-result v1

    .line 1941
    iput v1, v3, LE5/S;->l:I

    .line 1942
    .line 1943
    new-instance v1, Ljava/util/ArrayList;

    .line 1944
    .line 1945
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1946
    .line 1947
    .line 1948
    move v2, v8

    .line 1949
    :goto_21
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1950
    .line 1951
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1952
    .line 1953
    .line 1954
    const/16 v12, 0xc

    .line 1955
    .line 1956
    invoke-static {v12, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v13

    .line 1960
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1961
    .line 1962
    .line 1963
    const-string v13, "_"

    .line 1964
    .line 1965
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1966
    .line 1967
    .line 1968
    invoke-static {v2, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1969
    .line 1970
    .line 1971
    move-result-object v13

    .line 1972
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1973
    .line 1974
    .line 1975
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v4

    .line 1979
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 1980
    .line 1981
    .line 1982
    move-result-object v4

    .line 1983
    if-nez v4, :cond_38

    .line 1984
    .line 1985
    iput-object v1, v3, LE5/S;->m:Ljava/util/List;

    .line 1986
    .line 1987
    const/16 v13, 0xd

    .line 1988
    .line 1989
    invoke-static {v13, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v1

    .line 1993
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 1994
    .line 1995
    .line 1996
    move-result-object v1

    .line 1997
    check-cast v1, LI5/c;

    .line 1998
    .line 1999
    iput-object v1, v3, LE5/S;->n:LI5/c;

    .line 2000
    .line 2001
    const/16 v1, 0xe

    .line 2002
    .line 2003
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v1

    .line 2007
    iget-wide v12, v5, LE5/T;->p:J

    .line 2008
    .line 2009
    invoke-virtual {v0, v1, v12, v13}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 2010
    .line 2011
    .line 2012
    move-result-wide v1

    .line 2013
    iput-wide v1, v3, LE5/S;->o:J

    .line 2014
    .line 2015
    const/16 v1, 0xf

    .line 2016
    .line 2017
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2018
    .line 2019
    .line 2020
    move-result-object v1

    .line 2021
    iget v2, v5, LE5/T;->q:I

    .line 2022
    .line 2023
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 2024
    .line 2025
    .line 2026
    move-result v1

    .line 2027
    iput v1, v3, LE5/S;->p:I

    .line 2028
    .line 2029
    const/16 v1, 0x10

    .line 2030
    .line 2031
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2032
    .line 2033
    .line 2034
    move-result-object v1

    .line 2035
    iget v2, v5, LE5/T;->r:I

    .line 2036
    .line 2037
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 2038
    .line 2039
    .line 2040
    move-result v1

    .line 2041
    iput v1, v3, LE5/S;->q:I

    .line 2042
    .line 2043
    const/16 v1, 0x11

    .line 2044
    .line 2045
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v1

    .line 2049
    iget v2, v5, LE5/T;->s:F

    .line 2050
    .line 2051
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 2052
    .line 2053
    .line 2054
    move-result v1

    .line 2055
    iput v1, v3, LE5/S;->r:F

    .line 2056
    .line 2057
    const/16 v1, 0x12

    .line 2058
    .line 2059
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2060
    .line 2061
    .line 2062
    move-result-object v1

    .line 2063
    iget v2, v5, LE5/T;->t:I

    .line 2064
    .line 2065
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 2066
    .line 2067
    .line 2068
    move-result v1

    .line 2069
    iput v1, v3, LE5/S;->s:I

    .line 2070
    .line 2071
    const/16 v1, 0x13

    .line 2072
    .line 2073
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2074
    .line 2075
    .line 2076
    move-result-object v1

    .line 2077
    iget v2, v5, LE5/T;->u:F

    .line 2078
    .line 2079
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    .line 2080
    .line 2081
    .line 2082
    move-result v1

    .line 2083
    iput v1, v3, LE5/S;->t:F

    .line 2084
    .line 2085
    const/16 v1, 0x14

    .line 2086
    .line 2087
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2088
    .line 2089
    .line 2090
    move-result-object v1

    .line 2091
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 2092
    .line 2093
    .line 2094
    move-result-object v1

    .line 2095
    iput-object v1, v3, LE5/S;->u:[B

    .line 2096
    .line 2097
    const/16 v1, 0x15

    .line 2098
    .line 2099
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v1

    .line 2103
    iget v2, v5, LE5/T;->w:I

    .line 2104
    .line 2105
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 2106
    .line 2107
    .line 2108
    move-result v1

    .line 2109
    iput v1, v3, LE5/S;->v:I

    .line 2110
    .line 2111
    const/16 v1, 0x16

    .line 2112
    .line 2113
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2114
    .line 2115
    .line 2116
    move-result-object v1

    .line 2117
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 2118
    .line 2119
    .line 2120
    move-result-object v1

    .line 2121
    if-eqz v1, :cond_37

    .line 2122
    .line 2123
    new-instance v2, Lv6/b;

    .line 2124
    .line 2125
    invoke-static {v8, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2126
    .line 2127
    .line 2128
    move-result-object v4

    .line 2129
    const/4 v14, -0x1

    .line 2130
    invoke-virtual {v1, v4, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 2131
    .line 2132
    .line 2133
    move-result v4

    .line 2134
    invoke-static {v9, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2135
    .line 2136
    .line 2137
    move-result-object v8

    .line 2138
    invoke-virtual {v1, v8, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 2139
    .line 2140
    .line 2141
    move-result v8

    .line 2142
    invoke-static {v7, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2143
    .line 2144
    .line 2145
    move-result-object v7

    .line 2146
    invoke-virtual {v1, v7, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 2147
    .line 2148
    .line 2149
    move-result v7

    .line 2150
    invoke-static {v6, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2151
    .line 2152
    .line 2153
    move-result-object v6

    .line 2154
    invoke-virtual {v1, v6}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 2155
    .line 2156
    .line 2157
    move-result-object v1

    .line 2158
    invoke-direct {v2, v4, v1, v8, v7}, Lv6/b;-><init>(I[BII)V

    .line 2159
    .line 2160
    .line 2161
    iput-object v2, v3, LE5/S;->w:Lv6/b;

    .line 2162
    .line 2163
    :cond_37
    const/16 v1, 0x17

    .line 2164
    .line 2165
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2166
    .line 2167
    .line 2168
    move-result-object v1

    .line 2169
    iget v2, v5, LE5/T;->y:I

    .line 2170
    .line 2171
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 2172
    .line 2173
    .line 2174
    move-result v1

    .line 2175
    iput v1, v3, LE5/S;->x:I

    .line 2176
    .line 2177
    const/16 v1, 0x18

    .line 2178
    .line 2179
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2180
    .line 2181
    .line 2182
    move-result-object v1

    .line 2183
    iget v2, v5, LE5/T;->z:I

    .line 2184
    .line 2185
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 2186
    .line 2187
    .line 2188
    move-result v1

    .line 2189
    iput v1, v3, LE5/S;->y:I

    .line 2190
    .line 2191
    const/16 v1, 0x19

    .line 2192
    .line 2193
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2194
    .line 2195
    .line 2196
    move-result-object v1

    .line 2197
    iget v2, v5, LE5/T;->A:I

    .line 2198
    .line 2199
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 2200
    .line 2201
    .line 2202
    move-result v1

    .line 2203
    iput v1, v3, LE5/S;->z:I

    .line 2204
    .line 2205
    const/16 v1, 0x1a

    .line 2206
    .line 2207
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2208
    .line 2209
    .line 2210
    move-result-object v1

    .line 2211
    iget v2, v5, LE5/T;->B:I

    .line 2212
    .line 2213
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 2214
    .line 2215
    .line 2216
    move-result v1

    .line 2217
    iput v1, v3, LE5/S;->A:I

    .line 2218
    .line 2219
    const/16 v1, 0x1b

    .line 2220
    .line 2221
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v1

    .line 2225
    iget v2, v5, LE5/T;->C:I

    .line 2226
    .line 2227
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 2228
    .line 2229
    .line 2230
    move-result v1

    .line 2231
    iput v1, v3, LE5/S;->B:I

    .line 2232
    .line 2233
    const/16 v1, 0x1c

    .line 2234
    .line 2235
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2236
    .line 2237
    .line 2238
    move-result-object v1

    .line 2239
    iget v2, v5, LE5/T;->D:I

    .line 2240
    .line 2241
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 2242
    .line 2243
    .line 2244
    move-result v1

    .line 2245
    iput v1, v3, LE5/S;->C:I

    .line 2246
    .line 2247
    const/16 v1, 0x1d

    .line 2248
    .line 2249
    invoke-static {v1, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v1

    .line 2253
    iget v2, v5, LE5/T;->E:I

    .line 2254
    .line 2255
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 2256
    .line 2257
    .line 2258
    move-result v0

    .line 2259
    iput v0, v3, LE5/S;->D:I

    .line 2260
    .line 2261
    new-instance v0, LE5/T;

    .line 2262
    .line 2263
    invoke-direct {v0, v3}, LE5/T;-><init>(LE5/S;)V

    .line 2264
    .line 2265
    .line 2266
    return-object v0

    .line 2267
    :cond_38
    const/16 v13, 0xd

    .line 2268
    .line 2269
    const/4 v14, -0x1

    .line 2270
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2271
    .line 2272
    .line 2273
    add-int/2addr v2, v9

    .line 2274
    goto/16 :goto_21

    .line 2275
    .line 2276
    nop

    .line 2277
    :pswitch_data_0
    .packed-switch 0x7
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
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, LA5/f;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LF5/j;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :sswitch_0
    check-cast p1, LF5/j;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :sswitch_1
    check-cast p1, LF5/j;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :sswitch_2
    check-cast p1, LF5/j;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :sswitch_3
    check-cast p1, LF5/j;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :sswitch_4
    check-cast p1, LF5/j;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :sswitch_5
    check-cast p1, LF5/j;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :sswitch_6
    check-cast p1, LF5/j;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :sswitch_7
    check-cast p1, LF5/j;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :sswitch_8
    check-cast p1, LE5/u0;

    .line 61
    .line 62
    invoke-interface {p1}, LE5/u0;->w()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :sswitch_9
    check-cast p1, LE5/u0;

    .line 67
    .line 68
    invoke-interface {p1}, LE5/u0;->B()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :sswitch_a
    check-cast p1, LE5/u0;

    .line 73
    .line 74
    new-instance v0, LE5/Q;

    .line 75
    .line 76
    const-string v1, "Player release timed out."

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-direct {v0, v1, v2}, LE5/Q;-><init>(Ljava/lang/String;I)V

    .line 80
    .line 81
    .line 82
    new-instance v1, LE5/o;

    .line 83
    .line 84
    const/4 v2, 0x2

    .line 85
    const/16 v3, 0x3eb

    .line 86
    .line 87
    invoke-direct {v1, v2, v0, v3}, LE5/o;-><init>(ILjava/lang/Exception;I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {p1, v1}, LE5/u0;->y(LE5/o;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    nop

    .line 95
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_a
        0x5 -> :sswitch_9
        0x6 -> :sswitch_8
        0x15 -> :sswitch_7
        0x16 -> :sswitch_6
        0x17 -> :sswitch_5
        0x18 -> :sswitch_4
        0x19 -> :sswitch_3
        0x1a -> :sswitch_2
        0x1b -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    check-cast p1, LC8/a;

    .line 1
    invoke-static {p1}, LC8/b;->a(LC8/a;)LC8/b;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC8/b;

    .line 4
    invoke-static {p1}, LC8/c;->a(LC8/b;)LC8/c;

    move-result-object p1

    .line 5
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    .line 6
    :cond_0
    new-instance v0, Ls8/j;

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ls8/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    new-instance p1, LC8/c;

    const-string v1, "eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ=="

    invoke-direct {p1, v1, v0}, LC8/c;-><init>(Ljava/lang/String;Ls8/j;)V

    .line 10
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
