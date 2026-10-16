.class public final LCd/k0;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final synthetic c:Lwd/c;

.field public synthetic d:Ljava/lang/Object;

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lwd/c;Ljf/c;I)V
    .locals 0

    .line 1
    iput p4, p0, LCd/k0;->a:I

    iput-object p1, p0, LCd/k0;->f:Ljava/lang/Object;

    iput-object p2, p0, LCd/k0;->c:Lwd/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Llf/j;-><init>(ILjf/c;)V

    return-void
.end method

.method public constructor <init>(Lwd/c;LAd/e;Ljf/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LCd/k0;->a:I

    .line 2
    iput-object p1, p0, LCd/k0;->c:Lwd/c;

    iput-object p2, p0, LCd/k0;->f:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Llf/j;-><init>(ILjf/c;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LCd/k0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LRd/e;

    .line 7
    .line 8
    check-cast p3, Ljf/c;

    .line 9
    .line 10
    new-instance v0, LCd/k0;

    .line 11
    .line 12
    iget-object v1, p0, LCd/k0;->f:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LAd/e;

    .line 15
    .line 16
    iget-object v2, p0, LCd/k0;->c:Lwd/c;

    .line 17
    .line 18
    invoke-direct {v0, v2, v1, p3}, LCd/k0;-><init>(Lwd/c;LAd/e;Ljf/c;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, LCd/k0;->d:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p2, v0, LCd/k0;->e:Ljava/lang/Object;

    .line 24
    .line 25
    sget-object p1, Lef/C;->a:Lef/C;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, LCd/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :pswitch_0
    check-cast p1, LCd/u0;

    .line 33
    .line 34
    check-cast p2, LFd/c;

    .line 35
    .line 36
    check-cast p3, Ljf/c;

    .line 37
    .line 38
    new-instance v0, LCd/k0;

    .line 39
    .line 40
    iget-object v1, p0, LCd/k0;->f:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Ltf/q;

    .line 43
    .line 44
    iget-object v2, p0, LCd/k0;->c:Lwd/c;

    .line 45
    .line 46
    const/4 v3, 0x1

    .line 47
    invoke-direct {v0, v1, v2, p3, v3}, LCd/k0;-><init>(Ljava/lang/Object;Lwd/c;Ljf/c;I)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, LCd/k0;->d:Ljava/lang/Object;

    .line 51
    .line 52
    iput-object p2, v0, LCd/k0;->e:Ljava/lang/Object;

    .line 53
    .line 54
    sget-object p1, Lef/C;->a:Lef/C;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, LCd/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :pswitch_1
    check-cast p1, LRd/e;

    .line 62
    .line 63
    check-cast p3, Ljf/c;

    .line 64
    .line 65
    new-instance v0, LCd/k0;

    .line 66
    .line 67
    iget-object v1, p0, LCd/k0;->f:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, LCd/l0;

    .line 70
    .line 71
    iget-object v2, p0, LCd/k0;->c:Lwd/c;

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-direct {v0, v1, v2, p3, v3}, LCd/k0;-><init>(Ljava/lang/Object;Lwd/c;Ljf/c;I)V

    .line 75
    .line 76
    .line 77
    iput-object p1, v0, LCd/k0;->d:Ljava/lang/Object;

    .line 78
    .line 79
    iput-object p2, v0, LCd/k0;->e:Ljava/lang/Object;

    .line 80
    .line 81
    sget-object p1, Lef/C;->a:Lef/C;

    .line 82
    .line 83
    invoke-virtual {v0, p1}, LCd/k0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LCd/k0;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 9
    .line 10
    iget v2, v0, LCd/k0;->b:I

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    const/4 v4, 0x1

    .line 14
    iget-object v5, v0, LCd/k0;->c:Lwd/c;

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    if-eq v2, v4, :cond_1

    .line 20
    .line 21
    if-ne v2, v3, :cond_0

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto/16 :goto_7

    .line 27
    .line 28
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v1

    .line 36
    :cond_1
    iget-object v2, v0, LCd/k0;->e:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, LFd/d;

    .line 39
    .line 40
    iget-object v4, v0, LCd/k0;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v4, LRd/e;

    .line 43
    .line 44
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object v7, v4

    .line 48
    move-object/from16 v4, p1

    .line 49
    .line 50
    goto/16 :goto_6

    .line 51
    .line 52
    :cond_2
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v2, v0, LCd/k0;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, LRd/e;

    .line 58
    .line 59
    iget-object v7, v0, LCd/k0;->e:Ljava/lang/Object;

    .line 60
    .line 61
    new-instance v8, LFd/c;

    .line 62
    .line 63
    invoke-direct {v8}, LFd/c;-><init>()V

    .line 64
    .line 65
    .line 66
    iget-object v9, v2, LRd/e;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v9, LFd/c;

    .line 69
    .line 70
    const-string v10, "builder"

    .line 71
    .line 72
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object v10, v9, LFd/c;->e:LEf/I0;

    .line 76
    .line 77
    iput-object v10, v8, LFd/c;->e:LEf/I0;

    .line 78
    .line 79
    invoke-virtual {v8, v9}, LFd/c;->d(LFd/c;)V

    .line 80
    .line 81
    .line 82
    const-class v9, Ljava/lang/Object;

    .line 83
    .line 84
    if-nez v7, :cond_3

    .line 85
    .line 86
    sget-object v7, LMd/a;->a:LMd/a;

    .line 87
    .line 88
    iput-object v7, v8, LFd/c;->d:Ljava/lang/Object;

    .line 89
    .line 90
    sget-object v7, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 91
    .line 92
    invoke-virtual {v7, v9}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    :try_start_0
    invoke-static {v9}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 97
    .line 98
    .line 99
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    goto :goto_0

    .line 101
    :catchall_0
    move-object v9, v6

    .line 102
    :goto_0
    new-instance v10, LSd/a;

    .line 103
    .line 104
    invoke-direct {v10, v7, v9}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v8, v10}, LFd/c;->b(LSd/a;)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    instance-of v10, v7, LMd/c;

    .line 112
    .line 113
    if-eqz v10, :cond_4

    .line 114
    .line 115
    iput-object v7, v8, LFd/c;->d:Ljava/lang/Object;

    .line 116
    .line 117
    invoke-virtual {v8, v6}, LFd/c;->b(LSd/a;)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    iput-object v7, v8, LFd/c;->d:Ljava/lang/Object;

    .line 122
    .line 123
    sget-object v7, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 124
    .line 125
    invoke-virtual {v7, v9}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    :try_start_1
    invoke-static {v9}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 130
    .line 131
    .line 132
    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 133
    goto :goto_1

    .line 134
    :catchall_1
    move-object v9, v6

    .line 135
    :goto_1
    new-instance v10, LSd/a;

    .line 136
    .line 137
    invoke-direct {v10, v7, v9}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v8, v10}, LFd/c;->b(LSd/a;)V

    .line 141
    .line 142
    .line 143
    :goto_2
    iget-object v7, v5, Lwd/c;->j:Ly3/j;

    .line 144
    .line 145
    sget-object v9, LHd/a;->b:Lwa/a;

    .line 146
    .line 147
    invoke-virtual {v7, v9}, Ly3/j;->q(Lwa/a;)V

    .line 148
    .line 149
    .line 150
    new-instance v10, LFd/d;

    .line 151
    .line 152
    iget-object v7, v8, LFd/c;->a:LJd/B;

    .line 153
    .line 154
    invoke-virtual {v7}, LJd/B;->b()LJd/H;

    .line 155
    .line 156
    .line 157
    move-result-object v11

    .line 158
    iget-object v12, v8, LFd/c;->b:LJd/s;

    .line 159
    .line 160
    new-instance v13, LJd/o;

    .line 161
    .line 162
    iget-object v7, v8, LFd/c;->c:LJd/n;

    .line 163
    .line 164
    iget-object v7, v7, LA7/B0;->a:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v7, Ljava/util/Map;

    .line 167
    .line 168
    invoke-direct {v13, v7}, LJd/o;-><init>(Ljava/util/Map;)V

    .line 169
    .line 170
    .line 171
    iget-object v7, v8, LFd/c;->d:Ljava/lang/Object;

    .line 172
    .line 173
    instance-of v9, v7, LMd/c;

    .line 174
    .line 175
    if-eqz v9, :cond_5

    .line 176
    .line 177
    check-cast v7, LMd/c;

    .line 178
    .line 179
    move-object v14, v7

    .line 180
    goto :goto_3

    .line 181
    :cond_5
    move-object v14, v6

    .line 182
    :goto_3
    if-eqz v14, :cond_e

    .line 183
    .line 184
    iget-object v15, v8, LFd/c;->e:LEf/I0;

    .line 185
    .line 186
    iget-object v7, v8, LFd/c;->f:LNd/d;

    .line 187
    .line 188
    move-object/from16 v16, v7

    .line 189
    .line 190
    invoke-direct/range {v10 .. v16}, LFd/d;-><init>(LJd/H;LJd/s;LJd/o;LMd/c;LEf/I0;LNd/d;)V

    .line 191
    .line 192
    .line 193
    sget-object v8, Lzd/h;->b:LNd/a;

    .line 194
    .line 195
    iget-object v9, v5, Lwd/c;->k:Lwd/d;

    .line 196
    .line 197
    invoke-virtual {v7, v8, v9}, LNd/d;->e(LNd/a;Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    iget-object v7, v13, LNd/l;->c:Ljava/util/Map;

    .line 201
    .line 202
    invoke-interface {v7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    const-string v8, "<this>"

    .line 207
    .line 208
    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v7}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    const-string v8, "unmodifiableSet(...)"

    .line 216
    .line 217
    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    check-cast v7, Ljava/lang/Iterable;

    .line 221
    .line 222
    new-instance v8, Ljava/util/ArrayList;

    .line 223
    .line 224
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 225
    .line 226
    .line 227
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    :cond_6
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    if-eqz v9, :cond_7

    .line 236
    .line 237
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    move-object v11, v9

    .line 242
    check-cast v11, Ljava/lang/String;

    .line 243
    .line 244
    sget-object v12, LJd/p;->a:Ljava/util/List;

    .line 245
    .line 246
    invoke-interface {v12, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v11

    .line 250
    if-eqz v11, :cond_6

    .line 251
    .line 252
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_7
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    if-eqz v7, :cond_d

    .line 261
    .line 262
    iget-object v7, v10, LFd/d;->g:Ljava/util/Set;

    .line 263
    .line 264
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v8

    .line 272
    iget-object v9, v0, LCd/k0;->f:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v9, LAd/e;

    .line 275
    .line 276
    if-eqz v8, :cond_9

    .line 277
    .line 278
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    check-cast v8, Lzd/f;

    .line 283
    .line 284
    iget-object v9, v9, LAd/e;->e:Ljava/util/Set;

    .line 285
    .line 286
    invoke-interface {v9, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v9

    .line 290
    if-eqz v9, :cond_8

    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    const-string v2, "Engine doesn\'t support "

    .line 296
    .line 297
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 308
    .line 309
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    throw v2

    .line 317
    :cond_9
    iput-object v2, v0, LCd/k0;->d:Ljava/lang/Object;

    .line 318
    .line 319
    iput-object v10, v0, LCd/k0;->e:Ljava/lang/Object;

    .line 320
    .line 321
    iput v4, v0, LCd/k0;->b:I

    .line 322
    .line 323
    invoke-static {v9, v10, v0}, La/a;->i(LAd/e;LFd/d;Llf/c;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    if-ne v4, v1, :cond_a

    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_a
    move-object v7, v2

    .line 331
    move-object v2, v10

    .line 332
    :goto_6
    check-cast v4, LFd/g;

    .line 333
    .line 334
    new-instance v8, Lxd/c;

    .line 335
    .line 336
    const-string v9, "client"

    .line 337
    .line 338
    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    const-string v9, "requestData"

    .line 342
    .line 343
    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    const-string v9, "responseData"

    .line 347
    .line 348
    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    invoke-direct {v8, v5}, Lxd/c;-><init>(Lwd/c;)V

    .line 352
    .line 353
    .line 354
    new-instance v9, LFd/a;

    .line 355
    .line 356
    invoke-direct {v9, v8, v2}, LFd/a;-><init>(Lxd/c;LFd/d;)V

    .line 357
    .line 358
    .line 359
    iput-object v9, v8, Lxd/c;->b:LFd/b;

    .line 360
    .line 361
    new-instance v2, LGd/a;

    .line 362
    .line 363
    invoke-direct {v2, v8, v4}, LGd/a;-><init>(Lxd/c;LFd/g;)V

    .line 364
    .line 365
    .line 366
    iput-object v2, v8, Lxd/c;->c:LGd/a;

    .line 367
    .line 368
    invoke-virtual {v8}, Lxd/c;->b()LNd/d;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    sget-object v9, Lxd/c;->e:LNd/a;

    .line 373
    .line 374
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    const-string v10, "key"

    .line 378
    .line 379
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2}, LNd/d;->c()Ljava/util/Map;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    invoke-interface {v2, v9}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    iget-object v2, v4, LFd/g;->e:Lio/ktor/utils/io/t;

    .line 390
    .line 391
    instance-of v4, v2, Lio/ktor/utils/io/t;

    .line 392
    .line 393
    if-nez v4, :cond_b

    .line 394
    .line 395
    invoke-virtual {v8}, Lxd/c;->b()LNd/d;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    invoke-virtual {v4, v9, v2}, LNd/d;->e(LNd/a;Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    :cond_b
    invoke-virtual {v8}, Lxd/c;->e()LGd/a;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    sget-object v4, LHd/a;->c:Lwa/a;

    .line 407
    .line 408
    iget-object v9, v5, Lwd/c;->j:Ly3/j;

    .line 409
    .line 410
    invoke-virtual {v9, v4}, Ly3/j;->q(Lwa/a;)V

    .line 411
    .line 412
    .line 413
    invoke-interface {v2}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    invoke-static {v4}, LEf/H;->u(Ljf/h;)LEf/m0;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    new-instance v9, Lwd/a;

    .line 422
    .line 423
    invoke-direct {v9, v5, v2}, Lwd/a;-><init>(Lwd/c;LGd/a;)V

    .line 424
    .line 425
    .line 426
    invoke-interface {v4, v9}, LEf/m0;->invokeOnCompletion(Ltf/l;)LEf/U;

    .line 427
    .line 428
    .line 429
    iput-object v6, v0, LCd/k0;->d:Ljava/lang/Object;

    .line 430
    .line 431
    iput-object v6, v0, LCd/k0;->e:Ljava/lang/Object;

    .line 432
    .line 433
    iput v3, v0, LCd/k0;->b:I

    .line 434
    .line 435
    invoke-virtual {v7, v8, v0}, LRd/e;->e(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    if-ne v2, v1, :cond_c

    .line 440
    .line 441
    goto :goto_8

    .line 442
    :cond_c
    :goto_7
    sget-object v1, Lef/C;->a:Lef/C;

    .line 443
    .line 444
    :goto_8
    return-object v1

    .line 445
    :cond_d
    new-instance v1, LJd/w;

    .line 446
    .line 447
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    const-string v3, "header"

    .line 452
    .line 453
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    new-instance v3, Ljava/lang/StringBuilder;

    .line 457
    .line 458
    const-string v4, "Header(s) "

    .line 459
    .line 460
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    const-string v2, " are controlled by the engine and cannot be set explicitly"

    .line 467
    .line 468
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    throw v1

    .line 479
    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 480
    .line 481
    new-instance v2, Ljava/lang/StringBuilder;

    .line 482
    .line 483
    const-string v3, "No request transformation found: "

    .line 484
    .line 485
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    iget-object v3, v8, LFd/c;->d:Ljava/lang/Object;

    .line 489
    .line 490
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    throw v1

    .line 505
    :pswitch_0
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 506
    .line 507
    iget v2, v0, LCd/k0;->b:I

    .line 508
    .line 509
    const/4 v3, 0x1

    .line 510
    if-eqz v2, :cond_10

    .line 511
    .line 512
    if-ne v2, v3, :cond_f

    .line 513
    .line 514
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    move-object/from16 v1, p1

    .line 518
    .line 519
    goto :goto_9

    .line 520
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 521
    .line 522
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 523
    .line 524
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    throw v1

    .line 528
    :cond_10
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    iget-object v2, v0, LCd/k0;->d:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast v2, LCd/u0;

    .line 534
    .line 535
    iget-object v4, v0, LCd/k0;->e:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast v4, LFd/c;

    .line 538
    .line 539
    new-instance v5, LDd/h;

    .line 540
    .line 541
    iget-object v6, v0, LCd/k0;->c:Lwd/c;

    .line 542
    .line 543
    iget-object v6, v6, Lwd/c;->d:Ljf/h;

    .line 544
    .line 545
    invoke-direct {v5, v2, v6}, LDd/h;-><init>(LCd/u0;Ljf/h;)V

    .line 546
    .line 547
    .line 548
    const/4 v2, 0x0

    .line 549
    iput-object v2, v0, LCd/k0;->d:Ljava/lang/Object;

    .line 550
    .line 551
    iput v3, v0, LCd/k0;->b:I

    .line 552
    .line 553
    iget-object v2, v0, LCd/k0;->f:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast v2, Ltf/q;

    .line 556
    .line 557
    invoke-interface {v2, v5, v4, v0}, Ltf/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    if-ne v2, v1, :cond_11

    .line 562
    .line 563
    goto :goto_9

    .line 564
    :cond_11
    move-object v1, v2

    .line 565
    :goto_9
    return-object v1

    .line 566
    :pswitch_1
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 567
    .line 568
    iget v2, v0, LCd/k0;->b:I

    .line 569
    .line 570
    const/4 v3, 0x2

    .line 571
    const/4 v4, 0x1

    .line 572
    const/4 v5, 0x0

    .line 573
    if-eqz v2, :cond_14

    .line 574
    .line 575
    if-eq v2, v4, :cond_13

    .line 576
    .line 577
    if-ne v2, v3, :cond_12

    .line 578
    .line 579
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 580
    .line 581
    .line 582
    goto/16 :goto_f

    .line 583
    .line 584
    :cond_12
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 585
    .line 586
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 587
    .line 588
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    throw v1

    .line 592
    :cond_13
    iget-object v2, v0, LCd/k0;->d:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast v2, LRd/e;

    .line 595
    .line 596
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    move-object/from16 v4, p1

    .line 600
    .line 601
    goto/16 :goto_e

    .line 602
    .line 603
    :cond_14
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    iget-object v2, v0, LCd/k0;->d:Ljava/lang/Object;

    .line 607
    .line 608
    check-cast v2, LRd/e;

    .line 609
    .line 610
    iget-object v6, v0, LCd/k0;->e:Ljava/lang/Object;

    .line 611
    .line 612
    instance-of v7, v6, LMd/c;

    .line 613
    .line 614
    if-eqz v7, :cond_1a

    .line 615
    .line 616
    iget-object v7, v2, LRd/e;->a:Ljava/lang/Object;

    .line 617
    .line 618
    check-cast v7, LFd/c;

    .line 619
    .line 620
    const-class v8, LMd/c;

    .line 621
    .line 622
    if-nez v6, :cond_15

    .line 623
    .line 624
    sget-object v6, LMd/a;->a:LMd/a;

    .line 625
    .line 626
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    iput-object v6, v7, LFd/c;->d:Ljava/lang/Object;

    .line 630
    .line 631
    sget-object v6, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 632
    .line 633
    invoke-virtual {v6, v8}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 634
    .line 635
    .line 636
    move-result-object v6

    .line 637
    :try_start_2
    invoke-static {v8}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 638
    .line 639
    .line 640
    move-result-object v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 641
    goto :goto_a

    .line 642
    :catchall_2
    move-object v8, v5

    .line 643
    :goto_a
    new-instance v9, LSd/a;

    .line 644
    .line 645
    invoke-direct {v9, v6, v8}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v7, v9}, LFd/c;->b(LSd/a;)V

    .line 649
    .line 650
    .line 651
    goto :goto_c

    .line 652
    :cond_15
    instance-of v9, v6, LMd/c;

    .line 653
    .line 654
    const-string v10, "<set-?>"

    .line 655
    .line 656
    if-eqz v9, :cond_16

    .line 657
    .line 658
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    iput-object v6, v7, LFd/c;->d:Ljava/lang/Object;

    .line 665
    .line 666
    invoke-virtual {v7, v5}, LFd/c;->b(LSd/a;)V

    .line 667
    .line 668
    .line 669
    goto :goto_c

    .line 670
    :cond_16
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 671
    .line 672
    .line 673
    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    iput-object v6, v7, LFd/c;->d:Ljava/lang/Object;

    .line 677
    .line 678
    sget-object v6, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 679
    .line 680
    invoke-virtual {v6, v8}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 681
    .line 682
    .line 683
    move-result-object v6

    .line 684
    :try_start_3
    invoke-static {v8}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 685
    .line 686
    .line 687
    move-result-object v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 688
    goto :goto_b

    .line 689
    :catchall_3
    move-object v8, v5

    .line 690
    :goto_b
    new-instance v9, LSd/a;

    .line 691
    .line 692
    invoke-direct {v9, v6, v8}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v7, v9}, LFd/c;->b(LSd/a;)V

    .line 696
    .line 697
    .line 698
    :goto_c
    new-instance v6, LCd/i0;

    .line 699
    .line 700
    iget-object v7, v0, LCd/k0;->f:Ljava/lang/Object;

    .line 701
    .line 702
    check-cast v7, LCd/l0;

    .line 703
    .line 704
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    iget-object v8, v0, LCd/k0;->c:Lwd/c;

    .line 708
    .line 709
    invoke-direct {v6, v8}, LCd/i0;-><init>(Lwd/c;)V

    .line 710
    .line 711
    .line 712
    iget-object v7, v7, LCd/l0;->a:Ljava/util/ArrayList;

    .line 713
    .line 714
    invoke-static {v7}, Lff/o;->G0(Ljava/util/List;)Ljava/util/List;

    .line 715
    .line 716
    .line 717
    move-result-object v7

    .line 718
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 719
    .line 720
    .line 721
    move-result-object v7

    .line 722
    :goto_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 723
    .line 724
    .line 725
    move-result v8

    .line 726
    if-eqz v8, :cond_17

    .line 727
    .line 728
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v8

    .line 732
    check-cast v8, Ltf/q;

    .line 733
    .line 734
    new-instance v9, LCd/j0;

    .line 735
    .line 736
    invoke-direct {v9, v8, v6}, LCd/j0;-><init>(Ltf/q;LCd/u0;)V

    .line 737
    .line 738
    .line 739
    move-object v6, v9

    .line 740
    goto :goto_d

    .line 741
    :cond_17
    iget-object v7, v2, LRd/e;->a:Ljava/lang/Object;

    .line 742
    .line 743
    check-cast v7, LFd/c;

    .line 744
    .line 745
    iput-object v2, v0, LCd/k0;->d:Ljava/lang/Object;

    .line 746
    .line 747
    iput v4, v0, LCd/k0;->b:I

    .line 748
    .line 749
    invoke-interface {v6, v7, v0}, LCd/u0;->a(LFd/c;Llf/c;)Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v4

    .line 753
    if-ne v4, v1, :cond_18

    .line 754
    .line 755
    goto :goto_10

    .line 756
    :cond_18
    :goto_e
    check-cast v4, Lxd/c;

    .line 757
    .line 758
    iput-object v5, v0, LCd/k0;->d:Ljava/lang/Object;

    .line 759
    .line 760
    iput v3, v0, LCd/k0;->b:I

    .line 761
    .line 762
    invoke-virtual {v2, v4, v0}, LRd/e;->e(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v2

    .line 766
    if-ne v2, v1, :cond_19

    .line 767
    .line 768
    goto :goto_10

    .line 769
    :cond_19
    :goto_f
    sget-object v1, Lef/C;->a:Lef/C;

    .line 770
    .line 771
    :goto_10
    return-object v1

    .line 772
    :cond_1a
    new-instance v1, Ljava/lang/StringBuilder;

    .line 773
    .line 774
    const-string v3, "\n|Fail to prepare request body for sending. \n|The body type is: "

    .line 775
    .line 776
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 780
    .line 781
    .line 782
    move-result-object v3

    .line 783
    sget-object v4, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 784
    .line 785
    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 786
    .line 787
    .line 788
    move-result-object v3

    .line 789
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 790
    .line 791
    .line 792
    const-string v3, ", with Content-Type: "

    .line 793
    .line 794
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 795
    .line 796
    .line 797
    iget-object v2, v2, LRd/e;->a:Ljava/lang/Object;

    .line 798
    .line 799
    check-cast v2, LJd/r;

    .line 800
    .line 801
    invoke-static {v2}, Lff/B;->i(LJd/r;)LJd/f;

    .line 802
    .line 803
    .line 804
    move-result-object v2

    .line 805
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 806
    .line 807
    .line 808
    const-string v2, ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header."

    .line 809
    .line 810
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 811
    .line 812
    .line 813
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v1

    .line 817
    invoke-static {v1}, LBf/l;->W(Ljava/lang/String;)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v1

    .line 821
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 822
    .line 823
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v1

    .line 827
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 828
    .line 829
    .line 830
    throw v2

    .line 831
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
