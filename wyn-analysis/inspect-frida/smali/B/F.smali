.class public final LB/F;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LB/F;->i:I

    iput-object p1, p0, LB/F;->j:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, LX/k;

    .line 2
    .line 3
    sget-object v0, LX/m;->b:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    sget v1, LX/m;->d:I

    .line 7
    .line 8
    add-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    sput v2, LX/m;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ltf/l;

    .line 16
    .line 17
    new-instance v2, LX/f;

    .line 18
    .line 19
    invoke-direct {v2, v1, p1, v0}, LX/f;-><init>(ILX/k;Ltf/l;)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    monitor-exit v0

    .line 25
    throw p1
.end method

.method private final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LX/u;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, LX/u;->f:LP/d;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    :try_start_0
    iget-object v0, v0, LX/u;->h:LX/t;

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v2, v0, LX/t;->b:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget v3, v0, LX/t;->d:I

    .line 22
    .line 23
    iget-object v4, v0, LX/t;->c:Lx/n;

    .line 24
    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    new-instance v4, Lx/n;

    .line 28
    .line 29
    invoke-direct {v4}, Lx/n;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v4, v0, LX/t;->c:Lx/n;

    .line 33
    .line 34
    iget-object v5, v0, LX/t;->f:Lx/o;

    .line 35
    .line 36
    invoke-virtual {v5, v2, v4}, Lx/o;->j(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {v0, p1, v3, v2, v4}, LX/t;->c(Ljava/lang/Object;ILjava/lang/Object;Lx/n;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    monitor-exit v1

    .line 43
    sget-object p1, Lef/C;->a:Lef/C;

    .line 44
    .line 45
    return-object p1

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    monitor-exit v1

    .line 48
    throw p1
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lu1/G;

    .line 9
    .line 10
    iget-object v0, v0, Lu1/G;->g:LHf/x0;

    .line 11
    .line 12
    new-instance v1, Lu1/k;

    .line 13
    .line 14
    invoke-direct {v1, p1}, Lu1/k;-><init>(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-virtual {v0, p1, v1}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :goto_0
    sget-object p1, Lu1/G;->k:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lu1/G;

    .line 29
    .line 30
    monitor-enter p1

    .line 31
    :try_start_0
    sget-object v1, Lu1/G;->j:Ljava/util/LinkedHashSet;

    .line 32
    .line 33
    invoke-virtual {v0}, Lu1/G;->c()Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    monitor-exit p1

    .line 45
    sget-object p1, Lef/C;->a:Lef/C;

    .line 46
    .line 47
    return-object p1

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    monitor-exit p1

    .line 50
    throw v0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    iget v3, p0, LB/F;->i:I

    .line 5
    .line 6
    packed-switch v3, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, LA/N;

    .line 10
    .line 11
    const-string v0, "$this$null"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lz/f;->a:Lz/f;

    .line 17
    .line 18
    sget-object v2, Lz/f;->b:Lz/f;

    .line 19
    .line 20
    invoke-virtual {p1, v0, v2}, LA/N;->a(Lz/f;Lz/f;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v3, p0, LB/F;->j:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Lz/n;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object p1, v3, Lz/n;->c:LN/V;

    .line 31
    .line 32
    invoke-interface {p1}, LN/K0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lz/e;

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    iget-object v1, p1, Lz/e;->c:LA/u;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    sget-object v0, Lz/f;->c:Lz/f;

    .line 44
    .line 45
    invoke-virtual {p1, v2, v0}, LA/N;->a(Lz/f;Lz/f;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    iget-object p1, v3, Lz/n;->d:LN/V;

    .line 52
    .line 53
    invoke-interface {p1}, LN/K0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lz/e;

    .line 58
    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    iget-object v1, p1, Lz/e;->c:LA/u;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    sget-object v1, Lz/i;->e:LA/F;

    .line 65
    .line 66
    :cond_2
    :goto_0
    if-nez v1, :cond_3

    .line 67
    .line 68
    sget-object v1, Lz/i;->e:LA/F;

    .line 69
    .line 70
    :cond_3
    return-object v1

    .line 71
    :pswitch_0
    check-cast p1, Le0/B;

    .line 72
    .line 73
    const-string v0, "$this$graphicsLayer"

    .line 74
    .line 75
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, LN/K0;

    .line 81
    .line 82
    invoke-interface {v0}, LN/K0;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Ljava/lang/Number;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iput v0, p1, Le0/B;->c:F

    .line 93
    .line 94
    sget-object p1, Lef/C;->a:Lef/C;

    .line 95
    .line 96
    return-object p1

    .line 97
    :pswitch_1
    check-cast p1, Le0/B;

    .line 98
    .line 99
    const-string v0, "$this$graphicsLayer"

    .line 100
    .line 101
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, LA/O;

    .line 107
    .line 108
    iget-object v0, v0, LA/O;->h:LN/Y;

    .line 109
    .line 110
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Ljava/lang/Number;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    iput v0, p1, Le0/B;->c:F

    .line 121
    .line 122
    sget-object p1, Lef/C;->a:Lef/C;

    .line 123
    .line 124
    return-object p1

    .line 125
    :pswitch_2
    check-cast p1, Lx0/g;

    .line 126
    .line 127
    const-string v0, "$this$fakeSemanticsNode"

    .line 128
    .line 129
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Lx0/e;

    .line 135
    .line 136
    iget v0, v0, Lx0/e;->a:I

    .line 137
    .line 138
    invoke-static {p1, v0}, Lx0/p;->b(Lx0/g;I)V

    .line 139
    .line 140
    .line 141
    sget-object p1, Lef/C;->a:Lef/C;

    .line 142
    .line 143
    return-object p1

    .line 144
    :pswitch_3
    invoke-direct {p0, p1}, LB/F;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    return-object p1

    .line 149
    :pswitch_4
    const-string v0, "it"

    .line 150
    .line 151
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    sget-object p1, Lef/C;->a:Lef/C;

    .line 155
    .line 156
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, LGf/e;

    .line 159
    .line 160
    invoke-interface {v0, p1}, LGf/w;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    return-object p1

    .line 164
    :pswitch_5
    check-cast p1, LN/C;

    .line 165
    .line 166
    const-string v0, "$this$DisposableEffect"

    .line 167
    .line 168
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    new-instance p1, LA/X;

    .line 172
    .line 173
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v0, Lu0/O;

    .line 176
    .line 177
    const/4 v1, 0x6

    .line 178
    invoke-direct {p1, v0, v1}, LA/X;-><init>(Ljava/lang/Object;I)V

    .line 179
    .line 180
    .line 181
    return-object p1

    .line 182
    :pswitch_6
    check-cast p1, Lu0/l0;

    .line 183
    .line 184
    const-string v0, "it"

    .line 185
    .line 186
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v0, Lu0/s;

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget-object v1, p1, Lu0/l0;->b:Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-nez v1, :cond_4

    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_4
    iget-object v1, v0, Lu0/s;->d:Lu0/n;

    .line 206
    .line 207
    invoke-virtual {v1}, Lu0/n;->getSnapshotObserver()Lt0/K;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    new-instance v2, Lt0/p;

    .line 212
    .line 213
    invoke-direct {v2, p1, v0}, Lt0/p;-><init>(Lu0/l0;Lu0/s;)V

    .line 214
    .line 215
    .line 216
    iget-object v0, v0, Lu0/s;->y:LB/F;

    .line 217
    .line 218
    invoke-virtual {v1, p1, v0, v2}, Lt0/K;->a(Lt0/J;Ltf/l;Ltf/a;)V

    .line 219
    .line 220
    .line 221
    :goto_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 222
    .line 223
    return-object p1

    .line 224
    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    .line 225
    .line 226
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, Lp0/s;

    .line 229
    .line 230
    iget-object v2, v0, Lp0/s;->c:LEf/n;

    .line 231
    .line 232
    if-eqz v2, :cond_5

    .line 233
    .line 234
    invoke-virtual {v2, p1}, LEf/n;->a(Ljava/lang/Throwable;)Z

    .line 235
    .line 236
    .line 237
    :cond_5
    iput-object v1, v0, Lp0/s;->c:LEf/n;

    .line 238
    .line 239
    sget-object p1, Lef/C;->a:Lef/C;

    .line 240
    .line 241
    return-object p1

    .line 242
    :pswitch_8
    check-cast p1, LN/C;

    .line 243
    .line 244
    const-string v0, "$this$DisposableEffect"

    .line 245
    .line 246
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    new-instance p1, LA/X;

    .line 250
    .line 251
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, LN/p;

    .line 254
    .line 255
    const/4 v1, 0x5

    .line 256
    invoke-direct {p1, v0, v1}, LA/X;-><init>(Ljava/lang/Object;I)V

    .line 257
    .line 258
    .line 259
    return-object p1

    .line 260
    :pswitch_9
    check-cast p1, Lg0/d;

    .line 261
    .line 262
    const-string v0, "$this$null"

    .line 263
    .line 264
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v0, Li0/D;

    .line 270
    .line 271
    iget-object v0, v0, Li0/D;->b:Li0/a;

    .line 272
    .line 273
    invoke-virtual {v0, p1}, Li0/a;->a(Lg0/d;)V

    .line 274
    .line 275
    .line 276
    sget-object p1, Lef/C;->a:Lef/C;

    .line 277
    .line 278
    return-object p1

    .line 279
    :pswitch_a
    check-cast p1, Lg0/d;

    .line 280
    .line 281
    const-string v0, "$this$null"

    .line 282
    .line 283
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v0, Lh0/c;

    .line 289
    .line 290
    invoke-virtual {v0, p1}, Lh0/c;->g(Lg0/d;)V

    .line 291
    .line 292
    .line 293
    sget-object p1, Lef/C;->a:Lef/C;

    .line 294
    .line 295
    return-object p1

    .line 296
    :pswitch_b
    check-cast p1, Le0/B;

    .line 297
    .line 298
    const-string v0, "$this$null"

    .line 299
    .line 300
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v0, Le0/F;

    .line 306
    .line 307
    iget v1, v0, Le0/F;->b:F

    .line 308
    .line 309
    iput v1, p1, Le0/B;->a:F

    .line 310
    .line 311
    iget v1, v0, Le0/F;->c:F

    .line 312
    .line 313
    iput v1, p1, Le0/B;->b:F

    .line 314
    .line 315
    iget v1, v0, Le0/F;->d:F

    .line 316
    .line 317
    iput v1, p1, Le0/B;->c:F

    .line 318
    .line 319
    const/4 v1, 0x0

    .line 320
    iput v1, p1, Le0/B;->d:F

    .line 321
    .line 322
    iget v1, v0, Le0/F;->e:F

    .line 323
    .line 324
    iput v1, p1, Le0/B;->g:F

    .line 325
    .line 326
    iget-wide v1, v0, Le0/F;->f:J

    .line 327
    .line 328
    iput-wide v1, p1, Le0/B;->h:J

    .line 329
    .line 330
    const-string v1, "<set-?>"

    .line 331
    .line 332
    iget-object v2, v0, Le0/F;->g:Le0/E;

    .line 333
    .line 334
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    iput-object v2, p1, Le0/B;->i:Le0/E;

    .line 338
    .line 339
    iget-boolean v1, v0, Le0/F;->h:Z

    .line 340
    .line 341
    iput-boolean v1, p1, Le0/B;->j:Z

    .line 342
    .line 343
    iget-wide v1, v0, Le0/F;->i:J

    .line 344
    .line 345
    iput-wide v1, p1, Le0/B;->e:J

    .line 346
    .line 347
    iget-wide v0, v0, Le0/F;->j:J

    .line 348
    .line 349
    iput-wide v0, p1, Le0/B;->f:J

    .line 350
    .line 351
    sget-object p1, Lef/C;->a:Lef/C;

    .line 352
    .line 353
    return-object p1

    .line 354
    :pswitch_c
    check-cast p1, Lc0/g;

    .line 355
    .line 356
    const-string v0, "destination"

    .line 357
    .line 358
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v0, Lc0/g;

    .line 364
    .line 365
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    if-eqz v0, :cond_6

    .line 370
    .line 371
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 372
    .line 373
    goto :goto_2

    .line 374
    :cond_6
    iget-object v0, p1, Lc0/g;->b:Lc0/g;

    .line 375
    .line 376
    if-eqz v0, :cond_7

    .line 377
    .line 378
    invoke-static {p1}, Lxg/g;->M(Lc0/g;)V

    .line 379
    .line 380
    .line 381
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 382
    .line 383
    :goto_2
    return-object p1

    .line 384
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 385
    .line 386
    const-string v0, "Move focus landed at the root."

    .line 387
    .line 388
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    throw p1

    .line 392
    :pswitch_d
    check-cast p1, Ljava/io/IOException;

    .line 393
    .line 394
    iget-object p1, p0, LB/F;->j:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast p1, La4/f;

    .line 397
    .line 398
    iput-boolean v2, p1, La4/f;->k:Z

    .line 399
    .line 400
    sget-object p1, Lef/C;->a:Lef/C;

    .line 401
    .line 402
    return-object p1

    .line 403
    :pswitch_e
    invoke-direct {p0, p1}, LB/F;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    return-object p1

    .line 408
    :pswitch_f
    invoke-direct {p0, p1}, LB/F;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    return-object p1

    .line 413
    :pswitch_10
    iget-object v1, p0, LB/F;->j:Ljava/lang/Object;

    .line 414
    .line 415
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    :goto_3
    if-ge v0, v3, :cond_8

    .line 420
    .line 421
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    check-cast v4, Ltf/l;

    .line 426
    .line 427
    invoke-interface {v4, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    add-int/2addr v0, v2

    .line 431
    goto :goto_3

    .line 432
    :cond_8
    sget-object p1, Lef/C;->a:Lef/C;

    .line 433
    .line 434
    return-object p1

    .line 435
    :pswitch_11
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v0, LN/s;

    .line 438
    .line 439
    invoke-virtual {v0, p1}, LN/s;->v(Ljava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    sget-object p1, Lef/C;->a:Lef/C;

    .line 443
    .line 444
    return-object p1

    .line 445
    :pswitch_12
    check-cast p1, Ljava/lang/Throwable;

    .line 446
    .line 447
    const-string v0, "Recomposer effect job completed"

    .line 448
    .line 449
    invoke-static {v0, p1}, LEf/H;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    iget-object v2, p0, LB/F;->j:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v2, LN/p0;

    .line 456
    .line 457
    iget-object v3, v2, LN/p0;->b:Ljava/lang/Object;

    .line 458
    .line 459
    monitor-enter v3

    .line 460
    :try_start_0
    iget-object v4, v2, LN/p0;->c:LEf/m0;

    .line 461
    .line 462
    if-eqz v4, :cond_9

    .line 463
    .line 464
    iget-object v5, v2, LN/p0;->q:LHf/x0;

    .line 465
    .line 466
    sget-object v6, LN/j0;->b:LN/j0;

    .line 467
    .line 468
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v5, v1, v6}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    sget-object v5, LN/p0;->u:LHf/x0;

    .line 475
    .line 476
    invoke-interface {v4, v0}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 477
    .line 478
    .line 479
    iput-object v1, v2, LN/p0;->o:LEf/n;

    .line 480
    .line 481
    new-instance v0, LA/W;

    .line 482
    .line 483
    const/16 v1, 0xe

    .line 484
    .line 485
    invoke-direct {v0, v1, v2, p1}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    invoke-interface {v4, v0}, LEf/m0;->invokeOnCompletion(Ltf/l;)LEf/U;

    .line 489
    .line 490
    .line 491
    goto :goto_4

    .line 492
    :catchall_0
    move-exception v0

    .line 493
    move-object p1, v0

    .line 494
    goto :goto_5

    .line 495
    :cond_9
    iput-object v0, v2, LN/p0;->d:Ljava/lang/Throwable;

    .line 496
    .line 497
    iget-object p1, v2, LN/p0;->q:LHf/x0;

    .line 498
    .line 499
    sget-object v0, LN/j0;->a:LN/j0;

    .line 500
    .line 501
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    invoke-virtual {p1, v1, v0}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 505
    .line 506
    .line 507
    :goto_4
    monitor-exit v3

    .line 508
    sget-object p1, Lef/C;->a:Lef/C;

    .line 509
    .line 510
    return-object p1

    .line 511
    :goto_5
    monitor-exit v3

    .line 512
    throw p1

    .line 513
    :pswitch_13
    check-cast p1, Ljava/lang/Throwable;

    .line 514
    .line 515
    sget-object p1, LN/w;->b:Landroid/view/Choreographer;

    .line 516
    .line 517
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 518
    .line 519
    check-cast v0, LN/v;

    .line 520
    .line 521
    invoke-virtual {p1, v0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 522
    .line 523
    .line 524
    sget-object p1, Lef/C;->a:Lef/C;

    .line 525
    .line 526
    return-object p1

    .line 527
    :pswitch_14
    check-cast p1, LL0/b;

    .line 528
    .line 529
    const-string v0, "it"

    .line 530
    .line 531
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast v0, Lt0/t;

    .line 537
    .line 538
    invoke-virtual {v0, p1}, Lt0/t;->B(LL0/b;)V

    .line 539
    .line 540
    .line 541
    sget-object p1, Lef/C;->a:Lef/C;

    .line 542
    .line 543
    return-object p1

    .line 544
    :pswitch_15
    check-cast p1, Ljava/lang/Throwable;

    .line 545
    .line 546
    iget-object p1, p0, LB/F;->j:Ljava/lang/Object;

    .line 547
    .line 548
    check-cast p1, Lp8/p;

    .line 549
    .line 550
    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 551
    .line 552
    .line 553
    sget-object p1, Lef/C;->a:Lef/C;

    .line 554
    .line 555
    return-object p1

    .line 556
    :pswitch_16
    check-cast p1, Ljava/lang/Throwable;

    .line 557
    .line 558
    iget-object v0, p0, LB/F;->j:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v0, LJ3/l;

    .line 561
    .line 562
    if-nez p1, :cond_b

    .line 563
    .line 564
    iget-object p1, v0, LJ3/l;->a:LU3/j;

    .line 565
    .line 566
    invoke-virtual {p1}, LU3/h;->isDone()Z

    .line 567
    .line 568
    .line 569
    move-result p1

    .line 570
    if-eqz p1, :cond_a

    .line 571
    .line 572
    goto :goto_7

    .line 573
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 574
    .line 575
    const-string v0, "Failed requirement."

    .line 576
    .line 577
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    throw p1

    .line 581
    :cond_b
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    .line 582
    .line 583
    if-eqz v1, :cond_c

    .line 584
    .line 585
    iget-object p1, v0, LJ3/l;->a:LU3/j;

    .line 586
    .line 587
    invoke-virtual {p1, v2}, LU3/h;->cancel(Z)Z

    .line 588
    .line 589
    .line 590
    goto :goto_7

    .line 591
    :cond_c
    iget-object v0, v0, LJ3/l;->a:LU3/j;

    .line 592
    .line 593
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 594
    .line 595
    .line 596
    move-result-object v1

    .line 597
    if-nez v1, :cond_d

    .line 598
    .line 599
    goto :goto_6

    .line 600
    :cond_d
    move-object p1, v1

    .line 601
    :goto_6
    invoke-virtual {v0, p1}, LU3/j;->j(Ljava/lang/Throwable;)Z

    .line 602
    .line 603
    .line 604
    :goto_7
    sget-object p1, Lef/C;->a:Lef/C;

    .line 605
    .line 606
    return-object p1

    .line 607
    :pswitch_17
    check-cast p1, LE0/p;

    .line 608
    .line 609
    const-string v0, "it"

    .line 610
    .line 611
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 612
    .line 613
    .line 614
    const-string v0, "fontWeight"

    .line 615
    .line 616
    iget-object v3, p1, LE0/p;->b:LE0/l;

    .line 617
    .line 618
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    new-instance v1, LE0/p;

    .line 622
    .line 623
    const/4 v2, 0x0

    .line 624
    iget v4, p1, LE0/p;->c:I

    .line 625
    .line 626
    iget v5, p1, LE0/p;->d:I

    .line 627
    .line 628
    iget-object v6, p1, LE0/p;->e:Ljava/lang/Object;

    .line 629
    .line 630
    invoke-direct/range {v1 .. v6}, LE0/p;-><init>(LE0/o;LE0/l;IILjava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    iget-object p1, p0, LB/F;->j:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast p1, LE0/f;

    .line 636
    .line 637
    invoke-virtual {p1, v1}, LE0/f;->a(LE0/p;)LE0/q;

    .line 638
    .line 639
    .line 640
    move-result-object p1

    .line 641
    iget-object p1, p1, LE0/q;->a:Ljava/lang/Object;

    .line 642
    .line 643
    return-object p1

    .line 644
    :pswitch_18
    check-cast p1, Lc0/l;

    .line 645
    .line 646
    const-string v1, "$this$focusProperties"

    .line 647
    .line 648
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    iget-object v1, p0, LB/F;->j:Ljava/lang/Object;

    .line 652
    .line 653
    check-cast v1, Ll0/b;

    .line 654
    .line 655
    check-cast v1, Ll0/c;

    .line 656
    .line 657
    iget-object v1, v1, Ll0/c;->a:LN/Y;

    .line 658
    .line 659
    invoke-virtual {v1}, LN/Y;->getValue()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    check-cast v1, Ll0/a;

    .line 664
    .line 665
    iget v1, v1, Ll0/a;->a:I

    .line 666
    .line 667
    if-ne v1, v2, :cond_e

    .line 668
    .line 669
    move v0, v2

    .line 670
    :cond_e
    xor-int/2addr v0, v2

    .line 671
    iput-boolean v0, p1, Lc0/l;->a:Z

    .line 672
    .line 673
    sget-object p1, Lef/C;->a:Lef/C;

    .line 674
    .line 675
    return-object p1

    .line 676
    nop

    .line 677
    :pswitch_data_0
    .packed-switch 0x0
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
