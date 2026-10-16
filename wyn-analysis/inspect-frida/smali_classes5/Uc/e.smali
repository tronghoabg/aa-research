.class public final synthetic LUc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LUc/e;->a:I

    iput-object p3, p0, LUc/e;->c:Ljava/lang/Object;

    iput-object p4, p0, LUc/e;->d:Ljava/lang/Object;

    iput p1, p0, LUc/e;->b:I

    iput-object p5, p0, LUc/e;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lm9/e;ILjava/util/List;LPc/p;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, LUc/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUc/e;->c:Ljava/lang/Object;

    iput p2, p0, LUc/e;->b:I

    iput-object p3, p0, LUc/e;->d:Ljava/lang/Object;

    iput-object p4, p0, LUc/e;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p0, LUc/e;->a:I

    .line 3
    .line 4
    packed-switch v1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LUc/e;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lt5/i;

    .line 10
    .line 11
    iget v2, p0, LUc/e;->b:I

    .line 12
    .line 13
    iget-object v3, p0, LUc/e;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Ljava/lang/Runnable;

    .line 16
    .line 17
    iget-object v4, p0, LUc/e;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, Lz5/f;

    .line 20
    .line 21
    iget-object v5, v4, Lz5/f;->f:LB5/c;

    .line 22
    .line 23
    :try_start_0
    iget-object v6, v4, Lz5/f;->c:LA5/d;

    .line 24
    .line 25
    invoke-static {v6}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    new-instance v7, Lo1/c;

    .line 29
    .line 30
    const/16 v8, 0x17

    .line 31
    .line 32
    invoke-direct {v7, v6, v8}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    move-object v6, v5

    .line 36
    check-cast v6, LA5/m;

    .line 37
    .line 38
    invoke-virtual {v6, v7}, LA5/m;->o(LB5/b;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    iget-object v6, v4, Lz5/f;->a:Landroid/content/Context;

    .line 42
    .line 43
    const-string v7, "connectivity"

    .line 44
    .line 45
    invoke-virtual {v6, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    check-cast v6, Landroid/net/ConnectivityManager;

    .line 50
    .line 51
    invoke-virtual {v6}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    if-eqz v6, :cond_0

    .line 56
    .line 57
    invoke-virtual {v6}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_0

    .line 62
    .line 63
    invoke-virtual {v4, v1, v2}, Lz5/f;->a(Lt5/i;I)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    goto :goto_2

    .line 69
    :cond_0
    new-instance v6, LE5/z;

    .line 70
    .line 71
    invoke-direct {v6, v4, v1, v2}, LE5/z;-><init>(Lz5/f;Lt5/i;I)V

    .line 72
    .line 73
    .line 74
    check-cast v5, LA5/m;

    .line 75
    .line 76
    invoke-virtual {v5, v6}, LA5/m;->o(LB5/b;)Ljava/lang/Object;
    :try_end_0
    .catch LB5/a; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    :goto_0
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :catch_0
    :try_start_1
    iget-object v4, v4, Lz5/f;->d:Lz5/c;

    .line 84
    .line 85
    add-int/2addr v2, v0

    .line 86
    const/4 v0, 0x0

    .line 87
    invoke-virtual {v4, v1, v2, v0}, Lz5/c;->a(Lt5/i;IZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :goto_1
    return-void

    .line 92
    :goto_2
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    .line 93
    .line 94
    .line 95
    throw v0

    .line 96
    :pswitch_0
    iget-object v0, p0, LUc/e;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Lmd/J;

    .line 99
    .line 100
    iget-object v1, p0, LUc/e;->d:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, [B

    .line 103
    .line 104
    iget v2, p0, LUc/e;->b:I

    .line 105
    .line 106
    iget-object v3, p0, LUc/e;->e:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v3, Ljava/util/Map;

    .line 109
    .line 110
    invoke-virtual {v0, v2, v1}, Lmd/J;->k(I[B)Lt9/d;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    monitor-enter v3

    .line 115
    :try_start_2
    iget-object v1, v0, Lt9/d;->b:Lt9/h;

    .line 116
    .line 117
    iget-object v1, v1, Lt9/h;->a:Ls9/h;

    .line 118
    .line 119
    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    monitor-exit v3

    .line 123
    return-void

    .line 124
    :catchall_1
    move-exception v0

    .line 125
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 126
    throw v0

    .line 127
    :pswitch_1
    iget-object v0, p0, LUc/e;->c:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Lcom/applovin/impl/sdk/l;

    .line 130
    .line 131
    iget-object v1, p0, LUc/e;->d:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, Ljava/lang/String;

    .line 134
    .line 135
    iget v2, p0, LUc/e;->b:I

    .line 136
    .line 137
    iget-object v3, p0, LUc/e;->e:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v3, Ljava/lang/String;

    .line 140
    .line 141
    invoke-static {v0, v1, v2, v3}, Lcom/applovin/impl/sdk/l;->a(Lcom/applovin/impl/sdk/l;Ljava/lang/String;ILjava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :pswitch_2
    const-string v1, "Unknown AggregateSource value: "

    .line 146
    .line 147
    iget-object v2, p0, LUc/e;->c:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v2, Lm9/e;

    .line 150
    .line 151
    iget v3, p0, LUc/e;->b:I

    .line 152
    .line 153
    iget-object v4, p0, LUc/e;->d:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v4, Ljava/util/List;

    .line 156
    .line 157
    iget-object v5, p0, LUc/e;->e:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v5, LPc/p;

    .line 160
    .line 161
    sget-object v6, LUc/f;->h:Ljava/util/HashMap;

    .line 162
    .line 163
    :try_start_3
    invoke-static {v3}, LA/f;->f(I)I

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-nez v6, :cond_6

    .line 168
    .line 169
    invoke-virtual {v2}, Lm9/e;->a()Lcom/google/android/gms/tasks/Task;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    check-cast v1, Lm9/f;

    .line 178
    .line 179
    new-instance v2, Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    if-eqz v4, :cond_5

    .line 193
    .line 194
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    check-cast v4, LUc/h;

    .line 199
    .line 200
    iget v6, v4, LUc/h;->a:I

    .line 201
    .line 202
    invoke-static {v6}, LA/f;->f(I)I

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    const/4 v7, 0x0

    .line 207
    if-eqz v6, :cond_4

    .line 208
    .line 209
    const/4 v8, 0x2

    .line 210
    if-eq v6, v0, :cond_3

    .line 211
    .line 212
    if-eq v6, v8, :cond_1

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_1
    iget-object v6, v4, LUc/h;->b:Ljava/lang/String;

    .line 216
    .line 217
    new-instance v8, Lm9/a;

    .line 218
    .line 219
    invoke-static {v6}, Lm9/r;->a(Ljava/lang/String;)Lm9/r;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    const-string v9, "average"

    .line 224
    .line 225
    invoke-direct {v8, v6, v9}, Lm9/d;-><init>(Lm9/r;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1, v8}, Lm9/f;->c(Lm9/d;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    check-cast v6, Ljava/lang/Number;

    .line 233
    .line 234
    if-eqz v6, :cond_2

    .line 235
    .line 236
    invoke-virtual {v6}, Ljava/lang/Number;->doubleValue()D

    .line 237
    .line 238
    .line 239
    move-result-wide v6

    .line 240
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    :cond_2
    iget-object v4, v4, LUc/h;->b:Ljava/lang/String;

    .line 245
    .line 246
    new-instance v6, LUc/i;

    .line 247
    .line 248
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 249
    .line 250
    .line 251
    const/4 v8, 0x3

    .line 252
    invoke-virtual {v6, v8}, LUc/i;->a(I)V

    .line 253
    .line 254
    .line 255
    iput-object v4, v6, LUc/i;->b:Ljava/lang/String;

    .line 256
    .line 257
    iput-object v7, v6, LUc/i;->c:Ljava/lang/Double;

    .line 258
    .line 259
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    goto :goto_3

    .line 263
    :catch_1
    move-exception v0

    .line 264
    goto :goto_5

    .line 265
    :cond_3
    iget-object v6, v4, LUc/h;->b:Ljava/lang/String;

    .line 266
    .line 267
    new-instance v7, Lm9/c;

    .line 268
    .line 269
    invoke-static {v6}, Lm9/r;->a(Ljava/lang/String;)Lm9/r;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    const-string v9, "sum"

    .line 274
    .line 275
    invoke-direct {v7, v6, v9}, Lm9/d;-><init>(Lm9/r;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v1, v7}, Lm9/f;->b(Lm9/d;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    invoke-static {v6}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    check-cast v6, Ljava/lang/Number;

    .line 286
    .line 287
    invoke-virtual {v6}, Ljava/lang/Number;->doubleValue()D

    .line 288
    .line 289
    .line 290
    move-result-wide v6

    .line 291
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    iget-object v4, v4, LUc/h;->b:Ljava/lang/String;

    .line 296
    .line 297
    new-instance v7, LUc/i;

    .line 298
    .line 299
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v7, v8}, LUc/i;->a(I)V

    .line 303
    .line 304
    .line 305
    iput-object v4, v7, LUc/i;->b:Ljava/lang/String;

    .line 306
    .line 307
    iput-object v6, v7, LUc/i;->c:Ljava/lang/Double;

    .line 308
    .line 309
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    goto :goto_3

    .line 313
    :cond_4
    invoke-virtual {v1}, Lm9/f;->a()J

    .line 314
    .line 315
    .line 316
    move-result-wide v8

    .line 317
    long-to-double v8, v8

    .line 318
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    new-instance v6, LUc/i;

    .line 323
    .line 324
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v6, v0}, LUc/i;->a(I)V

    .line 328
    .line 329
    .line 330
    iput-object v7, v6, LUc/i;->b:Ljava/lang/String;

    .line 331
    .line 332
    iput-object v4, v6, LUc/i;->c:Ljava/lang/Double;

    .line 333
    .line 334
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    goto/16 :goto_3

    .line 338
    .line 339
    :cond_5
    invoke-virtual {v5, v2}, LPc/p;->a(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    goto :goto_6

    .line 343
    :cond_6
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 344
    .line 345
    if-eq v3, v0, :cond_7

    .line 346
    .line 347
    const-string v0, "null"

    .line 348
    .line 349
    goto :goto_4

    .line 350
    :cond_7
    const-string v0, "SERVER"

    .line 351
    .line 352
    :goto_4
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    throw v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 360
    :goto_5
    invoke-static {v5, v0}, Lvf/a;->K(LUc/y;Ljava/lang/Exception;)V

    .line 361
    .line 362
    .line 363
    :goto_6
    return-void

    .line 364
    nop

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
