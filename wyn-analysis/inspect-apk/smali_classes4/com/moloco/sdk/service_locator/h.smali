.class public final synthetic Lcom/moloco/sdk/service_locator/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/moloco/sdk/service_locator/h;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x1

    .line 9
    sget-object v6, Lef/C;->a:Lef/C;

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x0

    .line 13
    iget v9, p0, Lcom/moloco/sdk/service_locator/h;->a:I

    .line 14
    .line 15
    packed-switch v9, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    new-instance v0, LNd/d;

    .line 19
    .line 20
    invoke-direct {v0}, LNd/d;-><init>()V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    :try_start_0
    sget-object v0, Lp3/b;->d:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-interface {v0}, Lef/i;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/lang/reflect/Method;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    const-string v1, "beginTransaction"

    .line 41
    .line 42
    new-array v4, v4, [Ljava/lang/Class;

    .line 43
    .line 44
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 45
    .line 46
    aput-object v6, v4, v7

    .line 47
    .line 48
    const-class v7, Landroid/database/sqlite/SQLiteTransactionListener;

    .line 49
    .line 50
    aput-object v7, v4, v5

    .line 51
    .line 52
    aput-object v6, v4, v3

    .line 53
    .line 54
    const-class v3, Landroid/os/CancellationSignal;

    .line 55
    .line 56
    aput-object v3, v4, v2

    .line 57
    .line 58
    invoke-virtual {v0, v1, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 59
    .line 60
    .line 61
    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    :catchall_0
    :cond_0
    return-object v8

    .line 63
    :pswitch_1
    :try_start_1
    const-class v0, Landroid/database/sqlite/SQLiteDatabase;

    .line 64
    .line 65
    const-string v1, "getThreadSession"

    .line 66
    .line 67
    new-array v2, v7, [Ljava/lang/Class;

    .line 68
    .line 69
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    .line 75
    .line 76
    move-object v8, v0

    .line 77
    :catchall_1
    return-object v8

    .line 78
    :pswitch_2
    new-instance v0, Lkd/b;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    return-object v0

    .line 84
    :pswitch_3
    sget-object v0, Lfd/f;->d:Lfd/f;

    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_4
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/l;

    .line 88
    .line 89
    invoke-static {}, Lcom/moloco/sdk/service_locator/j;->a()Lwd/c;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-direct {v0, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/l;-><init>(Lwd/c;)V

    .line 94
    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_5
    :try_start_2
    invoke-static {}, Lcom/moloco/sdk/service_locator/j;->b()Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

    .line 98
    .line 99
    .line 100
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 101
    goto :goto_0

    .line 102
    :catch_0
    move-exception v0

    .line 103
    move-object v4, v0

    .line 104
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 105
    .line 106
    const-string v3, "Failed to create PersistentHttpRequest, invoking NonPersistendHttpRequest"

    .line 107
    .line 108
    const/4 v5, 0x0

    .line 109
    const-string v2, "BestAttemptHttpRequest"

    .line 110
    .line 111
    const/16 v6, 0x8

    .line 112
    .line 113
    const/4 v7, 0x0

    .line 114
    invoke-static/range {v1 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->warn$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/m;->a:Lef/p;

    .line 118
    .line 119
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/l;

    .line 124
    .line 125
    :goto_0
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/c;

    .line 126
    .line 127
    invoke-direct {v1, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/c;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/e;)V

    .line 128
    .line 129
    .line 130
    return-object v1

    .line 131
    :pswitch_6
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/b;

    .line 132
    .line 133
    invoke-direct {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/b;-><init>()V

    .line 134
    .line 135
    .line 136
    return-object v0

    .line 137
    :pswitch_7
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 138
    .line 139
    sget-object v1, LN/P;->f:LN/P;

    .line 140
    .line 141
    invoke-static {v0, v1}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    return-object v0

    .line 146
    :pswitch_8
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 147
    .line 148
    sget-object v1, LN/P;->f:LN/P;

    .line 149
    .line 150
    invoke-static {v0, v1}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    return-object v0

    .line 155
    :pswitch_9
    const/4 v0, 0x0

    .line 156
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    sget-object v1, LN/P;->f:LN/P;

    .line 161
    .line 162
    invoke-static {v0, v1}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    return-object v0

    .line 167
    :pswitch_a
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;

    .line 168
    .line 169
    invoke-static {}, Lcom/moloco/sdk/service_locator/j;->b()Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-direct {v0, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;)V

    .line 174
    .line 175
    .line 176
    return-object v0

    .line 177
    :pswitch_b
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/I;

    .line 178
    .line 179
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 180
    .line 181
    .line 182
    return-object v0

    .line 183
    :pswitch_c
    const/16 v6, 0x18

    .line 184
    .line 185
    new-array v6, v6, [Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/s;

    .line 186
    .line 187
    sget-object v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/a;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/a;

    .line 188
    .line 189
    aput-object v8, v6, v7

    .line 190
    .line 191
    sget-object v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/z;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/z;

    .line 192
    .line 193
    aput-object v7, v6, v5

    .line 194
    .line 195
    sget-object v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/x;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/x;

    .line 196
    .line 197
    aput-object v5, v6, v3

    .line 198
    .line 199
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/y;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/y;

    .line 200
    .line 201
    aput-object v3, v6, v2

    .line 202
    .line 203
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/A;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/A;

    .line 204
    .line 205
    aput-object v2, v6, v4

    .line 206
    .line 207
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/B;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/B;

    .line 208
    .line 209
    const/4 v3, 0x5

    .line 210
    aput-object v2, v6, v3

    .line 211
    .line 212
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/C;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/C;

    .line 213
    .line 214
    const/4 v3, 0x6

    .line 215
    aput-object v2, v6, v3

    .line 216
    .line 217
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/D;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/D;

    .line 218
    .line 219
    const/4 v3, 0x7

    .line 220
    aput-object v2, v6, v3

    .line 221
    .line 222
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/j;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/j;

    .line 223
    .line 224
    const/16 v3, 0x8

    .line 225
    .line 226
    aput-object v2, v6, v3

    .line 227
    .line 228
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/i;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/i;

    .line 229
    .line 230
    const/16 v3, 0x9

    .line 231
    .line 232
    aput-object v2, v6, v3

    .line 233
    .line 234
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/h;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/h;

    .line 235
    .line 236
    aput-object v2, v6, v1

    .line 237
    .line 238
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/l;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/l;

    .line 239
    .line 240
    const/16 v3, 0xb

    .line 241
    .line 242
    aput-object v2, v6, v3

    .line 243
    .line 244
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/b;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/b;

    .line 245
    .line 246
    const/16 v3, 0xc

    .line 247
    .line 248
    aput-object v2, v6, v3

    .line 249
    .line 250
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/d;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/d;

    .line 251
    .line 252
    const/16 v3, 0xd

    .line 253
    .line 254
    aput-object v2, v6, v3

    .line 255
    .line 256
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/e;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/e;

    .line 257
    .line 258
    const/16 v3, 0xe

    .line 259
    .line 260
    aput-object v2, v6, v3

    .line 261
    .line 262
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/c;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/c;

    .line 263
    .line 264
    const/16 v3, 0xf

    .line 265
    .line 266
    aput-object v2, v6, v3

    .line 267
    .line 268
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/f;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/f;

    .line 269
    .line 270
    aput-object v2, v6, v0

    .line 271
    .line 272
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/t;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/t;

    .line 273
    .line 274
    const/16 v3, 0x11

    .line 275
    .line 276
    aput-object v2, v6, v3

    .line 277
    .line 278
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/u;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/u;

    .line 279
    .line 280
    const/16 v3, 0x12

    .line 281
    .line 282
    aput-object v2, v6, v3

    .line 283
    .line 284
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/m;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/m;

    .line 285
    .line 286
    const/16 v3, 0x13

    .line 287
    .line 288
    aput-object v2, v6, v3

    .line 289
    .line 290
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/w;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/w;

    .line 291
    .line 292
    const/16 v3, 0x14

    .line 293
    .line 294
    aput-object v2, v6, v3

    .line 295
    .line 296
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/n;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/n;

    .line 297
    .line 298
    const/16 v3, 0x15

    .line 299
    .line 300
    aput-object v2, v6, v3

    .line 301
    .line 302
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/o;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/o;

    .line 303
    .line 304
    const/16 v3, 0x16

    .line 305
    .line 306
    aput-object v2, v6, v3

    .line 307
    .line 308
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/p;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/p;

    .line 309
    .line 310
    const/16 v3, 0x17

    .line 311
    .line 312
    aput-object v2, v6, v3

    .line 313
    .line 314
    invoke-static {v6}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    invoke-static {v2, v1}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    invoke-static {v1}, Lff/B;->D(I)I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    if-ge v1, v0, :cond_1

    .line 327
    .line 328
    goto :goto_1

    .line 329
    :cond_1
    move v0, v1

    .line 330
    :goto_1
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 331
    .line 332
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 333
    .line 334
    .line 335
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    if-eqz v2, :cond_2

    .line 344
    .line 345
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    move-object v3, v2

    .line 350
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/s;

    .line 351
    .line 352
    invoke-virtual {v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/errors/s;->a()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    goto :goto_2

    .line 360
    :cond_2
    return-object v1

    .line 361
    :pswitch_d
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/StaticAdActivity;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/a;

    .line 362
    .line 363
    if-eqz v0, :cond_3

    .line 364
    .line 365
    invoke-virtual {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/a;->invoke()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    :cond_3
    :pswitch_e
    return-object v6

    .line 369
    :pswitch_f
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/g;->a:Ljava/lang/ref/WeakReference;

    .line 370
    .line 371
    return-object v6

    .line 372
    :pswitch_10
    sget-object v7, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 373
    .line 374
    const/4 v10, 0x0

    .line 375
    const/4 v11, 0x0

    .line 376
    const-string v8, "MraidActivity"

    .line 377
    .line 378
    const-string v9, "Skip button shown in MraidActivity"

    .line 379
    .line 380
    const/16 v12, 0xc

    .line 381
    .line 382
    const/4 v13, 0x0

    .line 383
    invoke-static/range {v7 .. v13}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/g;->j:Ltf/a;

    .line 387
    .line 388
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    return-object v6

    .line 392
    :pswitch_11
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidActivity;->h:LHf/j0;

    .line 393
    .line 394
    invoke-static {}, Lcom/moloco/sdk/service_locator/l;->a()Lcom/moloco/sdk/internal/services/events/c;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    return-object v0

    .line 399
    :pswitch_12
    new-instance v0, Lcom/moloco/sdk/internal/services/events/e;

    .line 400
    .line 401
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 402
    .line 403
    .line 404
    sget-object v1, Lcom/moloco/sdk/internal/services/events/f;->a:Lcom/moloco/sdk/internal/services/events/g;

    .line 405
    .line 406
    iput-object v1, v0, Lcom/moloco/sdk/internal/services/events/e;->a:Lcom/moloco/sdk/internal/services/events/g;

    .line 407
    .line 408
    return-object v0

    .line 409
    :pswitch_13
    new-instance v0, Lcom/moloco/sdk/internal/services/usertracker/c;

    .line 410
    .line 411
    new-instance v1, La9/a;

    .line 412
    .line 413
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 414
    .line 415
    .line 416
    sget-object v2, Lcom/moloco/sdk/service_locator/l;->a:Lef/p;

    .line 417
    .line 418
    invoke-virtual {v2}, Lef/p;->getValue()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    check-cast v2, Lcom/moloco/sdk/internal/services/usertracker/a;

    .line 423
    .line 424
    invoke-direct {v0, v1, v2}, Lcom/moloco/sdk/internal/services/usertracker/c;-><init>(La9/a;Lcom/moloco/sdk/internal/services/usertracker/a;)V

    .line 425
    .line 426
    .line 427
    return-object v0

    .line 428
    :pswitch_14
    new-instance v0, Lcom/moloco/sdk/internal/services/usertracker/a;

    .line 429
    .line 430
    sget-object v1, Lcom/moloco/sdk/service_locator/k;->a:Lef/p;

    .line 431
    .line 432
    invoke-virtual {v1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    check-cast v1, Lcom/moloco/sdk/internal/services/g;

    .line 437
    .line 438
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/usertracker/a;-><init>(Lcom/moloco/sdk/internal/services/g;)V

    .line 439
    .line 440
    .line 441
    return-object v0

    .line 442
    :pswitch_15
    invoke-static {v8}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    const-string v1, "moloco_sdk_preferences"

    .line 447
    .line 448
    invoke-virtual {v0, v1, v7}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    new-instance v1, Lcom/moloco/sdk/internal/services/g;

    .line 453
    .line 454
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    invoke-direct {v1, v0}, Lcom/moloco/sdk/internal/services/g;-><init>(Landroid/content/SharedPreferences;)V

    .line 458
    .line 459
    .line 460
    return-object v1

    .line 461
    :pswitch_16
    sget-object v0, Lcom/moloco/sdk/service_locator/j;->c:Lef/p;

    .line 462
    .line 463
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/o;

    .line 468
    .line 469
    const-string v1, "worker"

    .line 470
    .line 471
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;

    .line 475
    .line 476
    invoke-direct {v1, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/n;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/o;)V

    .line 477
    .line 478
    .line 479
    return-object v1

    .line 480
    :pswitch_17
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/o;

    .line 481
    .line 482
    invoke-static {v8}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    invoke-direct {v0, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/o;-><init>(Landroid/content/Context;)V

    .line 487
    .line 488
    .line 489
    return-object v0

    .line 490
    :pswitch_18
    new-instance v0, Lcom/moloco/sdk/internal/services/c;

    .line 491
    .line 492
    invoke-static {v8}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    invoke-static {}, Lcom/moloco/sdk/service_locator/e;->b()Lcom/moloco/sdk/internal/services/v;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    invoke-direct {v0, v1, v2}, Lcom/moloco/sdk/internal/services/c;-><init>(Landroid/content/Context;Lcom/moloco/sdk/internal/services/v;)V

    .line 501
    .line 502
    .line 503
    return-object v0

    .line 504
    :pswitch_19
    invoke-static {}, Lcom/moloco/sdk/service_locator/e;->a()Lcom/moloco/sdk/internal/services/x;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/services/x;->a()Lcom/moloco/sdk/internal/services/w;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-static {}, Lcom/moloco/sdk/service_locator/e;->b()Lcom/moloco/sdk/internal/services/v;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    invoke-virtual {v1}, Lcom/moloco/sdk/internal/services/v;->a()Lcom/moloco/sdk/internal/services/F;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    new-instance v2, Lcom/moloco/sdk/internal/http/a;

    .line 521
    .line 522
    invoke-direct {v2, v0, v1, v7}, Lcom/moloco/sdk/internal/http/a;-><init>(Lcom/moloco/sdk/internal/services/w;Lcom/moloco/sdk/internal/services/F;I)V

    .line 523
    .line 524
    .line 525
    invoke-static {v2}, Lwd/f;->a(Ltf/l;)Lwd/c;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    return-object v0

    .line 530
    :pswitch_1a
    invoke-static {v8}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    const-string v1, "activity"

    .line 535
    .line 536
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    const-string v1, "null cannot be cast to non-null type android.app.ActivityManager"

    .line 541
    .line 542
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    check-cast v0, Landroid/app/ActivityManager;

    .line 546
    .line 547
    return-object v0

    .line 548
    :pswitch_1b
    new-instance v0, Lcom/moloco/sdk/internal/b;

    .line 549
    .line 550
    invoke-direct {v0}, Lcom/moloco/sdk/internal/b;-><init>()V

    .line 551
    .line 552
    .line 553
    return-object v0

    .line 554
    :pswitch_1c
    new-instance v0, Lcom/moloco/sdk/internal/services/r;

    .line 555
    .line 556
    invoke-static {v8}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 557
    .line 558
    .line 559
    move-result-object v1

    .line 560
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/r;-><init>(Landroid/content/Context;)V

    .line 561
    .line 562
    .line 563
    return-object v0

    .line 564
    nop

    .line 565
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
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
