.class public final LD6/w1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD6/w1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LD6/w1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LD6/w1;->a:LD6/w1;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Landroid/content/Context;LD6/Q0;)LD6/v1;
    .locals 33

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v13, v0, LD6/Q0;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, v0, LD6/Q0;->c:Ljava/util/Set;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v6, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v6, v3

    .line 26
    :goto_0
    invoke-static {}, LD6/Z0;->d()LD6/Z0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v1, v1, LD6/Z0;->l:Lx6/s;

    .line 31
    .line 32
    sget-object v2, LD6/q;->g:LD6/q;

    .line 33
    .line 34
    iget-object v2, v2, LD6/q;->a:LH6/f;

    .line 35
    .line 36
    invoke-static/range {p0 .. p0}, LH6/f;->c(Landroid/content/Context;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v4, v0, LD6/Q0;->h:Ljava/util/Set;

    .line 41
    .line 42
    invoke-interface {v4, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    const/4 v5, 0x0

    .line 47
    if-nez v4, :cond_2

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance v4, Ljava/util/ArrayList;

    .line 53
    .line 54
    iget-object v1, v1, Lx6/s;->d:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    move v7, v5

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    :goto_1
    const/4 v1, 0x1

    .line 69
    move v7, v1

    .line 70
    :goto_2
    const-class v1, Lcom/google/ads/mediation/admob/AdMobAdapter;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget-object v2, v0, LD6/Q0;->d:Landroid/os/Bundle;

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-eqz v1, :cond_9

    .line 87
    .line 88
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v2}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :goto_3
    add-int/lit8 v8, v5, 0x1

    .line 101
    .line 102
    array-length v9, v2

    .line 103
    if-ge v8, v9, :cond_5

    .line 104
    .line 105
    aget-object v5, v2, v5

    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    const-string v10, "loadAd"

    .line 116
    .line 117
    invoke-virtual {v10, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-eqz v5, :cond_4

    .line 122
    .line 123
    sget-object v5, LH6/f;->c:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v5, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-nez v5, :cond_3

    .line 130
    .line 131
    sget-object v5, LH6/f;->d:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v5, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-nez v5, :cond_3

    .line 138
    .line 139
    sget-object v5, LH6/f;->e:Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {v5, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-nez v5, :cond_3

    .line 146
    .line 147
    sget-object v5, LH6/f;->f:Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {v5, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-nez v5, :cond_3

    .line 154
    .line 155
    sget-object v5, LH6/f;->g:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v5, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    if-eqz v5, :cond_4

    .line 162
    .line 163
    :cond_3
    aget-object v2, v2, v8

    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    goto :goto_4

    .line 170
    :cond_4
    move v5, v8

    .line 171
    goto :goto_3

    .line 172
    :cond_5
    move-object v2, v3

    .line 173
    :goto_4
    if-eqz v1, :cond_8

    .line 174
    .line 175
    new-instance v5, Ljava/util/StringTokenizer;

    .line 176
    .line 177
    const-string v8, "."

    .line 178
    .line 179
    invoke-direct {v5, v1, v8}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    new-instance v9, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v5}, Ljava/util/StringTokenizer;->hasMoreElements()Z

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    if-eqz v10, :cond_7

    .line 192
    .line 193
    invoke-virtual {v5}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    const/4 v1, 0x2

    .line 201
    :goto_5
    if-lez v1, :cond_6

    .line 202
    .line 203
    invoke-virtual {v5}, Ljava/util/StringTokenizer;->hasMoreElements()Z

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    if-eqz v10, :cond_6

    .line 208
    .line 209
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v5}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v10

    .line 216
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    add-int/lit8 v1, v1, -0x1

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_6
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    :cond_7
    if-eqz v2, :cond_8

    .line 227
    .line 228
    invoke-virtual {v2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-nez v1, :cond_8

    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_8
    move-object v2, v3

    .line 236
    :goto_6
    move-object/from16 v18, v2

    .line 237
    .line 238
    goto :goto_7

    .line 239
    :cond_9
    move-object/from16 v18, v3

    .line 240
    .line 241
    :goto_7
    invoke-static {}, LD6/Z0;->d()LD6/Z0;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    iget-object v1, v1, LD6/Z0;->l:Lx6/s;

    .line 246
    .line 247
    iget v2, v1, Lx6/s;->a:I

    .line 248
    .line 249
    iget v5, v0, LD6/Q0;->g:I

    .line 250
    .line 251
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    .line 252
    .line 253
    .line 254
    move-result v8

    .line 255
    iget-object v2, v1, Lx6/s;->c:Ljava/lang/String;

    .line 256
    .line 257
    if-nez v2, :cond_a

    .line 258
    .line 259
    const-string v2, ""

    .line 260
    .line 261
    :cond_a
    filled-new-array {v3, v2}, [Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    sget-object v3, LA7/R0;->b:LA7/R0;

    .line 270
    .line 271
    invoke-static {v2, v3}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    move-object/from16 v22, v2

    .line 276
    .line 277
    check-cast v22, Ljava/lang/String;

    .line 278
    .line 279
    new-instance v2, Ljava/util/ArrayList;

    .line 280
    .line 281
    iget-object v3, v0, LD6/Q0;->b:Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 284
    .line 285
    .line 286
    new-instance v3, LD6/v1;

    .line 287
    .line 288
    new-instance v5, Ljava/util/ArrayList;

    .line 289
    .line 290
    iget-object v9, v0, LD6/Q0;->j:Ljava/util/Set;

    .line 291
    .line 292
    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 293
    .line 294
    .line 295
    invoke-static {v5}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object v16

    .line 299
    iget v5, v1, Lx6/s;->e:I

    .line 300
    .line 301
    invoke-static {v5}, LA/f;->f(I)I

    .line 302
    .line 303
    .line 304
    move-result v26

    .line 305
    iget-wide v9, v0, LD6/Q0;->n:J

    .line 306
    .line 307
    iget v5, v0, LD6/Q0;->m:I

    .line 308
    .line 309
    iget-object v11, v0, LD6/Q0;->l:Ljava/lang/String;

    .line 310
    .line 311
    const/16 v12, 0x8

    .line 312
    .line 313
    move-object/from16 v23, v2

    .line 314
    .line 315
    move-object v14, v3

    .line 316
    move/from16 v24, v5

    .line 317
    .line 318
    const/4 v5, -0x1

    .line 319
    move-wide/from16 v27, v9

    .line 320
    .line 321
    const/4 v9, 0x0

    .line 322
    iget-object v10, v0, LD6/Q0;->e:Ljava/lang/String;

    .line 323
    .line 324
    move-object/from16 v25, v11

    .line 325
    .line 326
    const/4 v11, 0x0

    .line 327
    move v15, v12

    .line 328
    const/4 v12, 0x0

    .line 329
    move-object/from16 v17, v14

    .line 330
    .line 331
    iget-object v14, v0, LD6/Q0;->d:Landroid/os/Bundle;

    .line 332
    .line 333
    move/from16 v19, v15

    .line 334
    .line 335
    iget-object v15, v0, LD6/Q0;->i:Landroid/os/Bundle;

    .line 336
    .line 337
    iget-object v2, v0, LD6/Q0;->f:Ljava/lang/String;

    .line 338
    .line 339
    iget-boolean v0, v0, LD6/Q0;->k:Z

    .line 340
    .line 341
    move/from16 v21, v19

    .line 342
    .line 343
    move/from16 v19, v0

    .line 344
    .line 345
    move-object/from16 v0, v17

    .line 346
    .line 347
    move-object/from16 v17, v2

    .line 348
    .line 349
    const-wide/16 v2, -0x1

    .line 350
    .line 351
    const/16 v20, 0x0

    .line 352
    .line 353
    iget v1, v1, Lx6/s;->b:I

    .line 354
    .line 355
    const-wide/16 v29, 0x0

    .line 356
    .line 357
    const/16 v31, -0x1

    .line 358
    .line 359
    move/from16 v32, v21

    .line 360
    .line 361
    move/from16 v21, v1

    .line 362
    .line 363
    move/from16 v1, v32

    .line 364
    .line 365
    invoke-direct/range {v0 .. v31}, LD6/v1;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;LD6/q1;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLD6/Q;ILjava/lang/String;Ljava/util/List;ILjava/lang/String;IJJI)V

    .line 366
    .line 367
    .line 368
    return-object v0
.end method
