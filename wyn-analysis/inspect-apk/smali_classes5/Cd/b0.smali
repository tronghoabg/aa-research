.class public abstract LCd/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lvg/b;

.field public static final b:Lwa/a;

.field public static final c:LDd/c;

.field public static final d:LNd/a;

.field public static final e:LNd/a;

.field public static final f:LNd/a;

.field public static final g:LNd/a;

.field public static final h:LNd/a;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v3, 0x1

    .line 4
    const/4 v4, 0x0

    .line 5
    const-class v5, LFd/c;

    .line 6
    .line 7
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    const-class v7, LCd/g0;

    .line 10
    .line 11
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    const-string v9, "io.ktor.client.plugins.HttpRequestRetry"

    .line 14
    .line 15
    invoke-static {v9}, Lvg/d;->c(Ljava/lang/String;)Lvg/b;

    .line 16
    .line 17
    .line 18
    move-result-object v9

    .line 19
    sput-object v9, LCd/b0;->a:Lvg/b;

    .line 20
    .line 21
    new-instance v9, Lwa/a;

    .line 22
    .line 23
    const/16 v10, 0x13

    .line 24
    .line 25
    invoke-direct {v9, v10}, Lwa/a;-><init>(I)V

    .line 26
    .line 27
    .line 28
    sput-object v9, LCd/b0;->b:Lwa/a;

    .line 29
    .line 30
    sget-object v9, LCd/Z;->a:LCd/Z;

    .line 31
    .line 32
    new-instance v10, LAd/g;

    .line 33
    .line 34
    const/16 v11, 0xd

    .line 35
    .line 36
    invoke-direct {v10, v11}, LAd/g;-><init>(I)V

    .line 37
    .line 38
    .line 39
    const-string v11, "RetryFeature"

    .line 40
    .line 41
    invoke-static {v11, v9, v10}, LU8/v0;->s(Ljava/lang/String;Ltf/a;Ltf/l;)LDd/c;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    sput-object v9, LCd/b0;->c:LDd/c;

    .line 46
    .line 47
    sget-object v9, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 48
    .line 49
    const-class v10, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v9, v10}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    const/4 v10, 0x0

    .line 56
    :try_start_0
    invoke-static {v8}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 57
    .line 58
    .line 59
    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-object v11, v10

    .line 62
    :goto_0
    new-instance v12, LSd/a;

    .line 63
    .line 64
    invoke-direct {v12, v9, v11}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 65
    .line 66
    .line 67
    new-instance v9, LNd/a;

    .line 68
    .line 69
    const-string v11, "MaxRetriesPerRequestAttributeKey"

    .line 70
    .line 71
    invoke-direct {v9, v11, v12}, LNd/a;-><init>(Ljava/lang/String;LSd/a;)V

    .line 72
    .line 73
    .line 74
    sput-object v9, LCd/b0;->d:LNd/a;

    .line 75
    .line 76
    sget-object v9, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 77
    .line 78
    const-class v11, Ltf/q;

    .line 79
    .line 80
    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    :try_start_1
    sget-object v12, Lkotlin/reflect/KTypeProjection;->Companion:Lkotlin/reflect/KTypeProjection$Companion;

    .line 85
    .line 86
    invoke-static {v7}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 87
    .line 88
    .line 89
    move-result-object v13

    .line 90
    invoke-virtual {v12, v13}, Lkotlin/reflect/KTypeProjection$Companion;->invariant(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;

    .line 91
    .line 92
    .line 93
    move-result-object v13

    .line 94
    const-class v14, LFd/b;

    .line 95
    .line 96
    invoke-static {v14}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 97
    .line 98
    .line 99
    move-result-object v14

    .line 100
    invoke-virtual {v12, v14}, Lkotlin/reflect/KTypeProjection$Companion;->invariant(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;

    .line 101
    .line 102
    .line 103
    move-result-object v14

    .line 104
    const-class v15, LGd/a;

    .line 105
    .line 106
    invoke-static {v15}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 107
    .line 108
    .line 109
    move-result-object v15

    .line 110
    invoke-virtual {v12, v15}, Lkotlin/reflect/KTypeProjection$Companion;->invariant(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;

    .line 111
    .line 112
    .line 113
    move-result-object v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 114
    const/16 v16, 0x2

    .line 115
    .line 116
    :try_start_2
    invoke-static {v6}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v12, v2}, Lkotlin/reflect/KTypeProjection$Companion;->invariant(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    new-array v12, v0, [Lkotlin/reflect/KTypeProjection;

    .line 125
    .line 126
    aput-object v13, v12, v4

    .line 127
    .line 128
    aput-object v14, v12, v3

    .line 129
    .line 130
    aput-object v15, v12, v16

    .line 131
    .line 132
    aput-object v2, v12, v1

    .line 133
    .line 134
    invoke-static {v11, v12}, Lkotlin/jvm/internal/H;->d(Ljava/lang/Class;[Lkotlin/reflect/KTypeProjection;)Lkotlin/reflect/KType;

    .line 135
    .line 136
    .line 137
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 138
    goto :goto_1

    .line 139
    :catchall_1
    const/16 v16, 0x2

    .line 140
    .line 141
    :catchall_2
    move-object v2, v10

    .line 142
    :goto_1
    new-instance v12, LSd/a;

    .line 143
    .line 144
    invoke-direct {v12, v9, v2}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 145
    .line 146
    .line 147
    new-instance v2, LNd/a;

    .line 148
    .line 149
    const-string v9, "ShouldRetryPerRequestAttributeKey"

    .line 150
    .line 151
    invoke-direct {v2, v9, v12}, LNd/a;-><init>(Ljava/lang/String;LSd/a;)V

    .line 152
    .line 153
    .line 154
    sput-object v2, LCd/b0;->e:LNd/a;

    .line 155
    .line 156
    sget-object v2, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 157
    .line 158
    invoke-virtual {v2, v11}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    :try_start_3
    sget-object v9, Lkotlin/reflect/KTypeProjection;->Companion:Lkotlin/reflect/KTypeProjection$Companion;

    .line 163
    .line 164
    invoke-static {v7}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    invoke-virtual {v9, v7}, Lkotlin/reflect/KTypeProjection$Companion;->invariant(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    invoke-static {v5}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    invoke-virtual {v9, v12}, Lkotlin/reflect/KTypeProjection$Companion;->invariant(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;

    .line 177
    .line 178
    .line 179
    move-result-object v12

    .line 180
    const-class v13, Ljava/lang/Throwable;

    .line 181
    .line 182
    invoke-static {v13}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 183
    .line 184
    .line 185
    move-result-object v13

    .line 186
    invoke-virtual {v9, v13}, Lkotlin/reflect/KTypeProjection$Companion;->invariant(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;

    .line 187
    .line 188
    .line 189
    move-result-object v13

    .line 190
    invoke-static {v6}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-virtual {v9, v6}, Lkotlin/reflect/KTypeProjection$Companion;->invariant(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    new-array v0, v0, [Lkotlin/reflect/KTypeProjection;

    .line 199
    .line 200
    aput-object v7, v0, v4

    .line 201
    .line 202
    aput-object v12, v0, v3

    .line 203
    .line 204
    aput-object v13, v0, v16

    .line 205
    .line 206
    aput-object v6, v0, v1

    .line 207
    .line 208
    invoke-static {v11, v0}, Lkotlin/jvm/internal/H;->d(Ljava/lang/Class;[Lkotlin/reflect/KTypeProjection;)Lkotlin/reflect/KType;

    .line 209
    .line 210
    .line 211
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 212
    goto :goto_2

    .line 213
    :catchall_3
    move-object v0, v10

    .line 214
    :goto_2
    new-instance v6, LSd/a;

    .line 215
    .line 216
    invoke-direct {v6, v2, v0}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 217
    .line 218
    .line 219
    new-instance v0, LNd/a;

    .line 220
    .line 221
    const-string v2, "ShouldRetryOnExceptionPerRequestAttributeKey"

    .line 222
    .line 223
    invoke-direct {v0, v2, v6}, LNd/a;-><init>(Ljava/lang/String;LSd/a;)V

    .line 224
    .line 225
    .line 226
    sput-object v0, LCd/b0;->f:LNd/a;

    .line 227
    .line 228
    sget-object v0, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 229
    .line 230
    const-class v2, Ltf/p;

    .line 231
    .line 232
    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    :try_start_4
    sget-object v6, Lkotlin/reflect/KTypeProjection;->Companion:Lkotlin/reflect/KTypeProjection$Companion;

    .line 237
    .line 238
    const-class v7, LCd/f0;

    .line 239
    .line 240
    invoke-static {v7}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    invoke-virtual {v6, v7}, Lkotlin/reflect/KTypeProjection$Companion;->invariant(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    invoke-static {v5}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 249
    .line 250
    .line 251
    move-result-object v5

    .line 252
    invoke-virtual {v6, v5}, Lkotlin/reflect/KTypeProjection$Companion;->invariant(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    const-class v9, Lef/C;

    .line 257
    .line 258
    invoke-static {v9}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 259
    .line 260
    .line 261
    move-result-object v9

    .line 262
    invoke-virtual {v6, v9}, Lkotlin/reflect/KTypeProjection$Companion;->invariant(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    new-array v9, v1, [Lkotlin/reflect/KTypeProjection;

    .line 267
    .line 268
    aput-object v7, v9, v4

    .line 269
    .line 270
    aput-object v5, v9, v3

    .line 271
    .line 272
    aput-object v6, v9, v16

    .line 273
    .line 274
    invoke-static {v2, v9}, Lkotlin/jvm/internal/H;->d(Ljava/lang/Class;[Lkotlin/reflect/KTypeProjection;)Lkotlin/reflect/KType;

    .line 275
    .line 276
    .line 277
    move-result-object v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 278
    goto :goto_3

    .line 279
    :catchall_4
    move-object v5, v10

    .line 280
    :goto_3
    new-instance v6, LSd/a;

    .line 281
    .line 282
    invoke-direct {v6, v0, v5}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 283
    .line 284
    .line 285
    new-instance v0, LNd/a;

    .line 286
    .line 287
    const-string v5, "ModifyRequestPerRequestAttributeKey"

    .line 288
    .line 289
    invoke-direct {v0, v5, v6}, LNd/a;-><init>(Ljava/lang/String;LSd/a;)V

    .line 290
    .line 291
    .line 292
    sput-object v0, LCd/b0;->g:LNd/a;

    .line 293
    .line 294
    sget-object v0, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    .line 295
    .line 296
    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    :try_start_5
    sget-object v5, Lkotlin/reflect/KTypeProjection;->Companion:Lkotlin/reflect/KTypeProjection$Companion;

    .line 301
    .line 302
    const-class v6, LCd/d0;

    .line 303
    .line 304
    invoke-static {v6}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 305
    .line 306
    .line 307
    move-result-object v6

    .line 308
    invoke-virtual {v5, v6}, Lkotlin/reflect/KTypeProjection$Companion;->invariant(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;

    .line 309
    .line 310
    .line 311
    move-result-object v6

    .line 312
    invoke-static {v8}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 313
    .line 314
    .line 315
    move-result-object v7

    .line 316
    invoke-virtual {v5, v7}, Lkotlin/reflect/KTypeProjection$Companion;->invariant(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;

    .line 317
    .line 318
    .line 319
    move-result-object v7

    .line 320
    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 321
    .line 322
    invoke-static {v8}, Lkotlin/jvm/internal/H;->b(Ljava/lang/Class;)Lkotlin/reflect/KType;

    .line 323
    .line 324
    .line 325
    move-result-object v8

    .line 326
    invoke-virtual {v5, v8}, Lkotlin/reflect/KTypeProjection$Companion;->invariant(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    new-array v1, v1, [Lkotlin/reflect/KTypeProjection;

    .line 331
    .line 332
    aput-object v6, v1, v4

    .line 333
    .line 334
    aput-object v7, v1, v3

    .line 335
    .line 336
    aput-object v5, v1, v16

    .line 337
    .line 338
    invoke-static {v2, v1}, Lkotlin/jvm/internal/H;->d(Ljava/lang/Class;[Lkotlin/reflect/KTypeProjection;)Lkotlin/reflect/KType;

    .line 339
    .line 340
    .line 341
    move-result-object v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 342
    :catchall_5
    new-instance v1, LSd/a;

    .line 343
    .line 344
    invoke-direct {v1, v0, v10}, LSd/a;-><init>(Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V

    .line 345
    .line 346
    .line 347
    new-instance v0, LNd/a;

    .line 348
    .line 349
    const-string v2, "RetryDelayPerRequestAttributeKey"

    .line 350
    .line 351
    invoke-direct {v0, v2, v1}, LNd/a;-><init>(Ljava/lang/String;LSd/a;)V

    .line 352
    .line 353
    .line 354
    sput-object v0, LCd/b0;->h:LNd/a;

    .line 355
    .line 356
    return-void
.end method

.method public static final a(LFd/c;Ltf/l;)V
    .locals 3

    .line 1
    new-instance v0, LCd/Y;

    .line 2
    .line 3
    invoke-direct {v0}, LCd/Y;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget-object p1, v0, LCd/Y;->a:LCd/W;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    sget-object v2, LCd/b0;->e:LNd/a;

    .line 15
    .line 16
    iget-object p0, p0, LFd/c;->f:LNd/d;

    .line 17
    .line 18
    invoke-virtual {p0, v2, p1}, LNd/d;->e(LNd/a;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, v0, LCd/Y;->b:LCd/V;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    sget-object v2, LCd/b0;->f:LNd/a;

    .line 26
    .line 27
    invoke-virtual {p0, v2, p1}, LNd/d;->e(LNd/a;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, v0, LCd/Y;->c:LBf/s;

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    sget-object v1, LCd/b0;->h:LNd/a;

    .line 35
    .line 36
    invoke-virtual {p0, v1, p1}, LNd/d;->e(LNd/a;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget p1, v0, LCd/Y;->f:I

    .line 40
    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    sget-object v1, LCd/b0;->d:LNd/a;

    .line 46
    .line 47
    invoke-virtual {p0, v1, p1}, LNd/d;->e(LNd/a;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, v0, LCd/Y;->e:Ltf/p;

    .line 51
    .line 52
    sget-object v0, LCd/b0;->g:LNd/a;

    .line 53
    .line 54
    invoke-virtual {p0, v0, p1}, LNd/d;->e(LNd/a;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    const-string p0, "delayMillis"

    .line 59
    .line 60
    invoke-static {p0}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v1

    .line 64
    :cond_1
    const-string p0, "shouldRetryOnException"

    .line 65
    .line 66
    invoke-static {p0}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v1

    .line 70
    :cond_2
    const-string p0, "shouldRetry"

    .line 71
    .line 72
    invoke-static {p0}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v1
.end method
