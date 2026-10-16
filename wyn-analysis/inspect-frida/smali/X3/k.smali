.class public final LX3/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lh4/b;

.field public final c:Lef/p;

.field public final d:Lba/a;

.field public final e:Lef/p;

.field public final f:LX3/b;

.field public final g:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lh4/b;Lef/p;Lef/p;Lef/p;LX3/b;Lk4/i;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x4

    .line 9
    const/4 v5, 0x5

    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v7, 0x1

    .line 12
    const/4 v8, 0x0

    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, v0, LX3/k;->a:Landroid/content/Context;

    .line 17
    .line 18
    move-object/from16 v9, p2

    .line 19
    .line 20
    iput-object v9, v0, LX3/k;->b:Lh4/b;

    .line 21
    .line 22
    iput-object v2, v0, LX3/k;->c:Lef/p;

    .line 23
    .line 24
    invoke-static {}, LEf/H;->f()LEf/I0;

    .line 25
    .line 26
    .line 27
    move-result-object v9

    .line 28
    sget-object v10, LEf/S;->a:LLf/e;

    .line 29
    .line 30
    sget-object v10, LJf/n;->a:LFf/e;

    .line 31
    .line 32
    iget-object v10, v10, LFf/e;->e:LFf/e;

    .line 33
    .line 34
    invoke-static {v9, v10}, LFe/e;->O(Ljf/f;Ljf/h;)Ljf/h;

    .line 35
    .line 36
    .line 37
    move-result-object v9

    .line 38
    new-instance v10, LX3/j;

    .line 39
    .line 40
    invoke-direct {v10, v0}, LX3/j;-><init>(LX3/k;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v9, v10}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    invoke-static {v9}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 48
    .line 49
    .line 50
    new-instance v9, Lk4/j;

    .line 51
    .line 52
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-direct {v9, v0, v1}, Lk4/j;-><init>(LX3/k;Landroid/content/Context;)V

    .line 56
    .line 57
    .line 58
    new-instance v10, Lba/a;

    .line 59
    .line 60
    invoke-direct {v10, v0, v9}, Lba/a;-><init>(LX3/k;Lk4/j;)V

    .line 61
    .line 62
    .line 63
    iput-object v10, v0, LX3/k;->d:Lba/a;

    .line 64
    .line 65
    iput-object v2, v0, LX3/k;->e:Lef/p;

    .line 66
    .line 67
    new-instance v2, LC8/i;

    .line 68
    .line 69
    move-object/from16 v11, p6

    .line 70
    .line 71
    invoke-direct {v2, v11}, LC8/i;-><init>(LX3/b;)V

    .line 72
    .line 73
    .line 74
    new-instance v11, Le4/a;

    .line 75
    .line 76
    invoke-direct {v11, v6}, Le4/a;-><init>(I)V

    .line 77
    .line 78
    .line 79
    const-class v12, Lokhttp3/HttpUrl;

    .line 80
    .line 81
    invoke-virtual {v2, v11, v12}, LC8/i;->f(Le4/a;Ljava/lang/Class;)V

    .line 82
    .line 83
    .line 84
    new-instance v11, Le4/a;

    .line 85
    .line 86
    invoke-direct {v11, v5}, Le4/a;-><init>(I)V

    .line 87
    .line 88
    .line 89
    const-class v12, Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v2, v11, v12}, LC8/i;->f(Le4/a;Ljava/lang/Class;)V

    .line 92
    .line 93
    .line 94
    new-instance v11, Le4/a;

    .line 95
    .line 96
    invoke-direct {v11, v7}, Le4/a;-><init>(I)V

    .line 97
    .line 98
    .line 99
    const-class v12, Landroid/net/Uri;

    .line 100
    .line 101
    invoke-virtual {v2, v11, v12}, LC8/i;->f(Le4/a;Ljava/lang/Class;)V

    .line 102
    .line 103
    .line 104
    new-instance v11, Le4/a;

    .line 105
    .line 106
    invoke-direct {v11, v4}, Le4/a;-><init>(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v11, v12}, LC8/i;->f(Le4/a;Ljava/lang/Class;)V

    .line 110
    .line 111
    .line 112
    new-instance v11, Le4/a;

    .line 113
    .line 114
    invoke-direct {v11, v3}, Le4/a;-><init>(I)V

    .line 115
    .line 116
    .line 117
    const-class v13, Ljava/lang/Integer;

    .line 118
    .line 119
    invoke-virtual {v2, v11, v13}, LC8/i;->f(Le4/a;Ljava/lang/Class;)V

    .line 120
    .line 121
    .line 122
    new-instance v11, Le4/a;

    .line 123
    .line 124
    invoke-direct {v11, v8}, Le4/a;-><init>(I)V

    .line 125
    .line 126
    .line 127
    const-class v13, [B

    .line 128
    .line 129
    invoke-virtual {v2, v11, v13}, LC8/i;->f(Le4/a;Ljava/lang/Class;)V

    .line 130
    .line 131
    .line 132
    new-instance v11, Ld4/a;

    .line 133
    .line 134
    invoke-direct {v11, v7}, Ld4/a;-><init>(I)V

    .line 135
    .line 136
    .line 137
    iget-object v13, v2, LC8/i;->d:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v13, Ljava/util/ArrayList;

    .line 140
    .line 141
    new-instance v14, Lef/k;

    .line 142
    .line 143
    invoke-direct {v14, v11, v12}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    new-instance v11, Ld4/a;

    .line 150
    .line 151
    invoke-direct {v11, v8}, Ld4/a;-><init>(I)V

    .line 152
    .line 153
    .line 154
    new-instance v14, Lef/k;

    .line 155
    .line 156
    const-class v15, Ljava/io/File;

    .line 157
    .line 158
    invoke-direct {v14, v11, v15}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    new-instance v11, Lb4/i;

    .line 165
    .line 166
    move-object/from16 v14, p4

    .line 167
    .line 168
    move-object/from16 v6, p5

    .line 169
    .line 170
    invoke-direct {v11, v6, v14}, Lb4/i;-><init>(Lef/p;Lef/p;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v11, v12}, LC8/i;->e(Lb4/f;Ljava/lang/Class;)V

    .line 174
    .line 175
    .line 176
    new-instance v6, Lb4/a;

    .line 177
    .line 178
    invoke-direct {v6, v5}, Lb4/a;-><init>(I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v6, v15}, LC8/i;->e(Lb4/f;Ljava/lang/Class;)V

    .line 182
    .line 183
    .line 184
    new-instance v5, Lb4/a;

    .line 185
    .line 186
    invoke-direct {v5, v8}, Lb4/a;-><init>(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v5, v12}, LC8/i;->e(Lb4/f;Ljava/lang/Class;)V

    .line 190
    .line 191
    .line 192
    new-instance v5, Lb4/a;

    .line 193
    .line 194
    invoke-direct {v5, v3}, Lb4/a;-><init>(I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v5, v12}, LC8/i;->e(Lb4/f;Ljava/lang/Class;)V

    .line 198
    .line 199
    .line 200
    new-instance v3, Lb4/a;

    .line 201
    .line 202
    const/4 v5, 0x6

    .line 203
    invoke-direct {v3, v5}, Lb4/a;-><init>(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v3, v12}, LC8/i;->e(Lb4/f;Ljava/lang/Class;)V

    .line 207
    .line 208
    .line 209
    new-instance v3, Lb4/a;

    .line 210
    .line 211
    invoke-direct {v3, v4}, Lb4/a;-><init>(I)V

    .line 212
    .line 213
    .line 214
    const-class v4, Landroid/graphics/drawable/Drawable;

    .line 215
    .line 216
    invoke-virtual {v2, v3, v4}, LC8/i;->e(Lb4/f;Ljava/lang/Class;)V

    .line 217
    .line 218
    .line 219
    new-instance v3, Lb4/a;

    .line 220
    .line 221
    invoke-direct {v3, v7}, Lb4/a;-><init>(I)V

    .line 222
    .line 223
    .line 224
    const-class v4, Landroid/graphics/Bitmap;

    .line 225
    .line 226
    invoke-virtual {v2, v3, v4}, LC8/i;->e(Lb4/f;Ljava/lang/Class;)V

    .line 227
    .line 228
    .line 229
    new-instance v3, Lb4/a;

    .line 230
    .line 231
    const/4 v4, 0x2

    .line 232
    invoke-direct {v3, v4}, Lb4/a;-><init>(I)V

    .line 233
    .line 234
    .line 235
    const-class v4, Ljava/nio/ByteBuffer;

    .line 236
    .line 237
    invoke-virtual {v2, v3, v4}, LC8/i;->e(Lb4/f;Ljava/lang/Class;)V

    .line 238
    .line 239
    .line 240
    new-instance v3, LZ3/c;

    .line 241
    .line 242
    invoke-direct {v3}, LZ3/c;-><init>()V

    .line 243
    .line 244
    .line 245
    iget-object v4, v2, LC8/i;->f:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v4, Ljava/util/ArrayList;

    .line 248
    .line 249
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    new-instance v3, LX3/b;

    .line 253
    .line 254
    iget-object v5, v2, LC8/i;->b:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v5, Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-static {v5}, Lr7/e;->R(Ljava/util/ArrayList;)Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    iget-object v6, v2, LC8/i;->c:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v6, Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-static {v6}, Lr7/e;->R(Ljava/util/ArrayList;)Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    invoke-static {v13}, Lr7/e;->R(Ljava/util/ArrayList;)Ljava/util/List;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    iget-object v2, v2, LC8/i;->e:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v2, Ljava/util/ArrayList;

    .line 277
    .line 278
    invoke-static {v2}, Lr7/e;->R(Ljava/util/ArrayList;)Ljava/util/List;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-static {v4}, Lr7/e;->R(Ljava/util/ArrayList;)Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    move-object/from16 p6, v2

    .line 287
    .line 288
    move-object/from16 p2, v3

    .line 289
    .line 290
    move-object/from16 p7, v4

    .line 291
    .line 292
    move-object/from16 p3, v5

    .line 293
    .line 294
    move-object/from16 p4, v6

    .line 295
    .line 296
    move-object/from16 p5, v7

    .line 297
    .line 298
    invoke-direct/range {p2 .. p7}, LX3/b;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 299
    .line 300
    .line 301
    move-object/from16 v2, p2

    .line 302
    .line 303
    move-object/from16 v3, p3

    .line 304
    .line 305
    iput-object v2, v0, LX3/k;->f:LX3/b;

    .line 306
    .line 307
    move-object v5, v3

    .line 308
    check-cast v5, Ljava/util/Collection;

    .line 309
    .line 310
    new-instance v2, Lc4/h;

    .line 311
    .line 312
    invoke-direct {v2, v0, v10}, Lc4/h;-><init>(LX3/k;Lba/a;)V

    .line 313
    .line 314
    .line 315
    invoke-static {v5, v2}, Lff/o;->F0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    iput-object v2, v0, LX3/k;->g:Ljava/util/ArrayList;

    .line 320
    .line 321
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 322
    .line 323
    invoke-direct {v2, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v1, v9}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 327
    .line 328
    .line 329
    return-void
.end method

.method public static final a(LX3/k;Lh4/h;ILlf/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, LX3/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LX3/h;

    .line 7
    .line 8
    iget v1, v0, LX3/h;->h:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LX3/h;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LX3/h;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, LX3/h;-><init>(LX3/k;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LX3/h;->f:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LX3/h;->h:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v6, :cond_3

    .line 38
    .line 39
    if-eq v2, v5, :cond_2

    .line 40
    .line 41
    if-ne v2, v4, :cond_1

    .line 42
    .line 43
    iget-object p0, v0, LX3/h;->d:LX3/c;

    .line 44
    .line 45
    iget-object p1, v0, LX3/h;->c:Lh4/h;

    .line 46
    .line 47
    iget-object p2, v0, LX3/h;->b:Lh4/a;

    .line 48
    .line 49
    iget-object v1, v0, LX3/h;->a:LX3/k;

    .line 50
    .line 51
    :try_start_0
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    move-object v9, p0

    .line 55
    move-object p0, v1

    .line 56
    goto/16 :goto_5

    .line 57
    .line 58
    :catchall_0
    move-exception v0

    .line 59
    move-object p3, v0

    .line 60
    move-object p3, p0

    .line 61
    move-object p0, v1

    .line 62
    goto/16 :goto_9

    .line 63
    .line 64
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p0

    .line 72
    :cond_2
    iget-object p0, v0, LX3/h;->e:Landroid/graphics/Bitmap;

    .line 73
    .line 74
    iget-object p1, v0, LX3/h;->d:LX3/c;

    .line 75
    .line 76
    iget-object p2, v0, LX3/h;->c:Lh4/h;

    .line 77
    .line 78
    iget-object v2, v0, LX3/h;->b:Lh4/a;

    .line 79
    .line 80
    iget-object v5, v0, LX3/h;->a:LX3/k;

    .line 81
    .line 82
    :try_start_1
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 83
    .line 84
    .line 85
    move-object v10, p0

    .line 86
    move-object v9, p1

    .line 87
    move-object v6, p2

    .line 88
    move-object p2, v2

    .line 89
    move-object v7, v5

    .line 90
    goto/16 :goto_3

    .line 91
    .line 92
    :catchall_1
    move-exception v0

    .line 93
    move-object p3, v0

    .line 94
    move-object p0, v5

    .line 95
    move-object p3, p1

    .line 96
    move-object p1, p2

    .line 97
    move-object p2, v2

    .line 98
    goto/16 :goto_9

    .line 99
    .line 100
    :cond_3
    iget-object p0, v0, LX3/h;->d:LX3/c;

    .line 101
    .line 102
    iget-object p1, v0, LX3/h;->c:Lh4/h;

    .line 103
    .line 104
    iget-object p2, v0, LX3/h;->b:Lh4/a;

    .line 105
    .line 106
    iget-object v2, v0, LX3/h;->a:LX3/k;

    .line 107
    .line 108
    :try_start_2
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 109
    .line 110
    .line 111
    move-object p3, p0

    .line 112
    move-object p0, v2

    .line 113
    goto :goto_2

    .line 114
    :catchall_2
    move-exception v0

    .line 115
    move-object p3, v0

    .line 116
    move-object p3, p0

    .line 117
    move-object p0, v2

    .line 118
    goto/16 :goto_9

    .line 119
    .line 120
    :cond_4
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v0}, Ljf/c;->getContext()Ljf/h;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    invoke-static {p3}, LEf/H;->u(Ljf/h;)LEf/m0;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    iget-object v2, p0, LX3/k;->d:Lba/a;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    iget-object v2, p1, Lh4/h;->q:Landroidx/lifecycle/o;

    .line 137
    .line 138
    new-instance v7, Lh4/a;

    .line 139
    .line 140
    invoke-direct {v7, v2, p3}, Lh4/a;-><init>(Landroidx/lifecycle/o;LEf/m0;)V

    .line 141
    .line 142
    .line 143
    invoke-static {p1}, Lh4/h;->a(Lh4/h;)Lh4/g;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    iget-object p3, p0, LX3/k;->b:Lh4/b;

    .line 148
    .line 149
    iput-object p3, p1, Lh4/g;->b:Lh4/b;

    .line 150
    .line 151
    const/4 p3, 0x0

    .line 152
    iput p3, p1, Lh4/g;->q:I

    .line 153
    .line 154
    invoke-virtual {p1}, Lh4/g;->a()Lh4/h;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    sget-object p3, LX3/c;->a:LX3/c;

    .line 159
    .line 160
    :try_start_3
    iget-object v8, p1, Lh4/h;->b:Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 161
    .line 162
    :try_start_4
    sget-object v9, Lh4/j;->a:Lh4/j;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 163
    .line 164
    :try_start_5
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    if-nez v8, :cond_c

    .line 169
    .line 170
    invoke-virtual {v2, v7}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/u;)V

    .line 171
    .line 172
    .line 173
    if-nez p2, :cond_5

    .line 174
    .line 175
    iget-object p2, p1, Lh4/h;->q:Landroidx/lifecycle/o;

    .line 176
    .line 177
    iput-object p0, v0, LX3/h;->a:LX3/k;

    .line 178
    .line 179
    iput-object v7, v0, LX3/h;->b:Lh4/a;

    .line 180
    .line 181
    iput-object p1, v0, LX3/h;->c:Lh4/h;

    .line 182
    .line 183
    iput-object p3, v0, LX3/h;->d:LX3/c;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 184
    .line 185
    :try_start_6
    iput v6, v0, LX3/h;->h:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 186
    .line 187
    :try_start_7
    invoke-static {p2, v0}, Ltg/b;->i(Landroidx/lifecycle/o;Llf/c;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 191
    if-ne p2, v1, :cond_5

    .line 192
    .line 193
    goto/16 :goto_4

    .line 194
    .line 195
    :catchall_3
    move-exception v0

    .line 196
    move-object p2, v0

    .line 197
    move-object v0, p2

    .line 198
    :goto_1
    move-object p2, v7

    .line 199
    goto/16 :goto_9

    .line 200
    .line 201
    :catchall_4
    move-exception v0

    .line 202
    move-object p2, v0

    .line 203
    goto :goto_1

    .line 204
    :cond_5
    move-object p2, v7

    .line 205
    :goto_2
    :try_start_8
    iget-object v2, p0, LX3/k;->e:Lef/p;

    .line 206
    .line 207
    invoke-virtual {v2}, Lef/p;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    check-cast v2, Lf4/e;

    .line 212
    .line 213
    if-eqz v2, :cond_6

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    :cond_6
    iget-object v2, p1, Lh4/h;->u:Lh4/b;

    .line 219
    .line 220
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    sget-object v2, Lk4/d;->a:Lh4/b;

    .line 224
    .line 225
    iget-object v2, p1, Lh4/h;->c:Ly3/j;

    .line 226
    .line 227
    if-eqz v2, :cond_7

    .line 228
    .line 229
    new-instance v6, LY3/e;

    .line 230
    .line 231
    iget-object v2, v2, Ly3/j;->b:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v2, LY3/n;

    .line 234
    .line 235
    invoke-direct {v6, v3}, LY3/e;-><init>(Lh0/c;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v6}, LY3/n;->i(LY3/g;)V

    .line 239
    .line 240
    .line 241
    :cond_7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    iget-object v2, p1, Lh4/h;->r:Li4/g;

    .line 245
    .line 246
    iput-object p0, v0, LX3/h;->a:LX3/k;

    .line 247
    .line 248
    iput-object p2, v0, LX3/h;->b:Lh4/a;

    .line 249
    .line 250
    iput-object p1, v0, LX3/h;->c:Lh4/h;

    .line 251
    .line 252
    iput-object p3, v0, LX3/h;->d:LX3/c;

    .line 253
    .line 254
    iput-object v3, v0, LX3/h;->e:Landroid/graphics/Bitmap;

    .line 255
    .line 256
    iput v5, v0, LX3/h;->h:I

    .line 257
    .line 258
    invoke-interface {v2, v0}, Li4/g;->a(LX3/h;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_9

    .line 262
    if-ne v2, v1, :cond_8

    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_8
    move-object v7, p0

    .line 266
    move-object v6, p1

    .line 267
    move-object v9, p3

    .line 268
    move-object p3, v2

    .line 269
    move-object v10, v3

    .line 270
    :goto_3
    :try_start_9
    move-object v8, p3

    .line 271
    check-cast v8, Li4/f;

    .line 272
    .line 273
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 274
    .line 275
    .line 276
    :try_start_a
    iget-object p0, v6, Lh4/h;->m:LEf/A;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 277
    .line 278
    :try_start_b
    new-instance v5, LX3/i;

    .line 279
    .line 280
    const/4 v11, 0x0

    .line 281
    invoke-direct/range {v5 .. v11}, LX3/i;-><init>(Lh4/h;LX3/k;Li4/f;LX3/c;Landroid/graphics/Bitmap;Ljf/c;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 282
    .line 283
    .line 284
    :try_start_c
    iput-object v7, v0, LX3/h;->a:LX3/k;

    .line 285
    .line 286
    iput-object p2, v0, LX3/h;->b:Lh4/a;

    .line 287
    .line 288
    iput-object v6, v0, LX3/h;->c:Lh4/h;

    .line 289
    .line 290
    iput-object v9, v0, LX3/h;->d:LX3/c;

    .line 291
    .line 292
    iput-object v3, v0, LX3/h;->e:Landroid/graphics/Bitmap;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 293
    .line 294
    :try_start_d
    iput v4, v0, LX3/h;->h:I

    .line 295
    .line 296
    invoke-static {p0, v5, v0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object p3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 300
    if-ne p3, v1, :cond_9

    .line 301
    .line 302
    :goto_4
    return-object v1

    .line 303
    :cond_9
    move-object p1, v6

    .line 304
    move-object p0, v7

    .line 305
    :goto_5
    :try_start_e
    check-cast p3, Lh4/i;

    .line 306
    .line 307
    instance-of v0, p3, Lh4/o;

    .line 308
    .line 309
    if-eqz v0, :cond_a

    .line 310
    .line 311
    move-object v0, p3

    .line 312
    check-cast v0, Lh4/o;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 313
    .line 314
    :try_start_f
    iget-object v1, p1, Lh4/h;->c:Ly3/j;

    .line 315
    .line 316
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    iget-object v0, v0, Lh4/o;->b:Lh4/h;

    .line 320
    .line 321
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 325
    .line 326
    .line 327
    goto :goto_7

    .line 328
    :catchall_5
    move-exception v0

    .line 329
    move-object p3, v0

    .line 330
    move-object v0, p3

    .line 331
    :goto_6
    move-object p3, v9

    .line 332
    goto :goto_9

    .line 333
    :catchall_6
    move-exception v0

    .line 334
    move-object p3, v0

    .line 335
    goto :goto_6

    .line 336
    :cond_a
    :try_start_10
    instance-of v0, p3, Lh4/d;

    .line 337
    .line 338
    if-eqz v0, :cond_b

    .line 339
    .line 340
    move-object v0, p3

    .line 341
    check-cast v0, Lh4/d;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 342
    .line 343
    :try_start_11
    iget-object v1, p1, Lh4/h;->c:Ly3/j;

    .line 344
    .line 345
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    invoke-static {v0, v1, v9}, LX3/k;->b(Lh4/d;Ly3/j;LX3/c;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    .line 349
    .line 350
    .line 351
    :cond_b
    :goto_7
    iget-object p0, p2, Lh4/a;->b:Landroidx/lifecycle/o;

    .line 352
    .line 353
    invoke-virtual {p0, p2}, Landroidx/lifecycle/o;->c(Landroidx/lifecycle/u;)V

    .line 354
    .line 355
    .line 356
    return-object p3

    .line 357
    :catchall_7
    move-exception v0

    .line 358
    move-object p3, v0

    .line 359
    :goto_8
    move-object p1, v6

    .line 360
    move-object p0, v7

    .line 361
    goto :goto_6

    .line 362
    :catchall_8
    move-exception v0

    .line 363
    move-object p3, v0

    .line 364
    move-object v0, p3

    .line 365
    goto :goto_8

    .line 366
    :catchall_9
    move-exception v0

    .line 367
    goto :goto_9

    .line 368
    :cond_c
    :try_start_12
    new-instance p2, Lh4/k;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    .line 369
    .line 370
    :try_start_13
    const-string v0, "The request\'s data is null."

    .line 371
    .line 372
    invoke-direct {p2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    .line 373
    .line 374
    .line 375
    :try_start_14
    throw p2
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    .line 376
    :goto_9
    :try_start_15
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 377
    .line 378
    if-nez v1, :cond_d

    .line 379
    .line 380
    iget-object p0, p0, LX3/k;->d:Lba/a;

    .line 381
    .line 382
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    invoke-static {p1, v0}, Lba/a;->r(Lh4/h;Ljava/lang/Throwable;)Lh4/d;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    iget-object p1, p1, Lh4/h;->c:Ly3/j;

    .line 390
    .line 391
    invoke-static {p0, p1, p3}, LX3/k;->b(Lh4/d;Ly3/j;LX3/c;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 392
    .line 393
    .line 394
    iget-object p1, p2, Lh4/a;->b:Landroidx/lifecycle/o;

    .line 395
    .line 396
    invoke-virtual {p1, p2}, Landroidx/lifecycle/o;->c(Landroidx/lifecycle/u;)V

    .line 397
    .line 398
    .line 399
    return-object p0

    .line 400
    :catchall_a
    move-exception v0

    .line 401
    move-object p0, v0

    .line 402
    goto :goto_a

    .line 403
    :cond_d
    :try_start_16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    throw v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_a

    .line 413
    :goto_a
    iget-object p1, p2, Lh4/a;->b:Landroidx/lifecycle/o;

    .line 414
    .line 415
    invoke-virtual {p1, p2}, Landroidx/lifecycle/o;->c(Landroidx/lifecycle/u;)V

    .line 416
    .line 417
    .line 418
    throw p0
.end method

.method public static b(Lh4/d;Ly3/j;LX3/c;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lh4/d;->b:Lh4/h;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    return-void
.end method
