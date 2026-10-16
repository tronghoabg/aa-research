.class public final Lod/M0;
.super Lmd/S;
.source "SourceFile"

# interfaces
.implements Lmd/E;


# static fields
.field public static final d0:Ljava/util/logging/Logger;

.field public static final e0:Ljava/util/regex/Pattern;

.field public static final f0:Lmd/k0;

.field public static final g0:Lmd/k0;

.field public static final h0:Lmd/k0;

.field public static final i0:Lod/S0;

.field public static final j0:Lod/x0;

.field public static final k0:Lod/C;


# instance fields
.field public final A:Ljava/util/HashSet;

.field public B:Ljava/util/LinkedHashSet;

.field public final C:Ljava/lang/Object;

.field public final D:Ljava/util/HashSet;

.field public final E:Lod/H;

.field public final F:LVa/Y7;

.field public final G:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public H:Z

.field public I:Z

.field public volatile J:Z

.field public final K:Ljava/util/concurrent/CountDownLatch;

.field public final L:Lod/Y1;

.field public final M:LVa/X7;

.field public final N:Lod/m;

.field public final O:Lod/k;

.field public final P:Lmd/C;

.field public final Q:Lod/J0;

.field public R:Lod/S0;

.field public S:Z

.field public final T:Z

.field public final U:Lcom/google/android/gms/ads/nativead/l;

.field public final V:J

.field public final W:J

.field public final X:Z

.field public final Y:Lmd/j;

.field public final Z:Lod/g0;

.field public final a:Lmd/F;

.field public final a0:Ld7/j;

.field public final b:Ljava/lang/String;

.field public final b0:Loc/d;

.field public final c:Lmd/g0;

.field public c0:I

.field public final d:LQ9/a;

.field public final e:Lod/a2;

.field public final f:Lod/j;

.field public final g:Lod/K0;

.field public final h:Ljava/util/concurrent/Executor;

.field public final i:La2/v;

.field public final j:Lod/D0;

.field public final k:Lod/D0;

.field public final l:Lod/Y1;

.field public final m:Lmd/n0;

.field public final n:Lmd/t;

.field public final o:Lmd/l;

.field public final p:Lod/Y;

.field public final q:J

.field public final r:Ld7/j;

.field public final s:Lod/Y1;

.field public final t:Lmd/d;

.field public final u:Ljava/util/ArrayList;

.field public v:Lod/L1;

.field public w:Z

.field public x:Lod/E0;

.field public volatile y:Lmd/M;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    const-class v0, Lod/M0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lod/M0;->d0:Ljava/util/logging/Logger;

    .line 12
    .line 13
    const-string v0, "[a-zA-Z][a-zA-Z0-9+.-]*:/.*"

    .line 14
    .line 15
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lod/M0;->e0:Ljava/util/regex/Pattern;

    .line 20
    .line 21
    sget-object v0, Lmd/k0;->n:Lmd/k0;

    .line 22
    .line 23
    const-string v1, "Channel shutdownNow invoked"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sput-object v1, Lod/M0;->f0:Lmd/k0;

    .line 30
    .line 31
    const-string v1, "Channel shutdown invoked"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sput-object v1, Lod/M0;->g0:Lmd/k0;

    .line 38
    .line 39
    const-string v1, "Subchannel shutdown invoked"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lod/M0;->h0:Lmd/k0;

    .line 46
    .line 47
    new-instance v1, Lod/S0;

    .line 48
    .line 49
    new-instance v3, Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 52
    .line 53
    .line 54
    new-instance v4, Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 57
    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    const/4 v7, 0x0

    .line 61
    const/4 v2, 0x0

    .line 62
    const/4 v5, 0x0

    .line 63
    invoke-direct/range {v1 .. v7}, Lod/S0;-><init>(Lod/Q0;Ljava/util/HashMap;Ljava/util/HashMap;Lod/H1;Ljava/lang/Object;Ljava/util/Map;)V

    .line 64
    .line 65
    .line 66
    sput-object v1, Lod/M0;->i0:Lod/S0;

    .line 67
    .line 68
    new-instance v0, Lod/x0;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, Lod/M0;->j0:Lod/x0;

    .line 74
    .line 75
    new-instance v0, Lod/C;

    .line 76
    .line 77
    const/4 v1, 0x1

    .line 78
    invoke-direct {v0, v1}, Lod/C;-><init>(I)V

    .line 79
    .line 80
    .line 81
    sput-object v0, Lod/M0;->k0:Lod/C;

    .line 82
    .line 83
    return-void
.end method

.method public constructor <init>(Lod/N0;Lpd/g;Lod/Y1;La2/v;Lod/Y;Ljava/util/ArrayList;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    sget-object v4, Lod/Y1;->b:Lod/Y1;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v8, Lmd/n0;

    .line 15
    .line 16
    new-instance v5, Lod/A0;

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    invoke-direct {v5, v0, v6}, Lod/A0;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v8, v5}, Lmd/n0;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 23
    .line 24
    .line 25
    iput-object v8, v0, Lod/M0;->m:Lmd/n0;

    .line 26
    .line 27
    new-instance v5, Ld7/j;

    .line 28
    .line 29
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v6, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v6, v5, Ld7/j;->a:Ljava/lang/Object;

    .line 38
    .line 39
    sget-object v6, Lmd/m;->d:Lmd/m;

    .line 40
    .line 41
    iput-object v6, v5, Ld7/j;->b:Ljava/lang/Object;

    .line 42
    .line 43
    iput-object v5, v0, Lod/M0;->r:Ld7/j;

    .line 44
    .line 45
    new-instance v5, Ljava/util/HashSet;

    .line 46
    .line 47
    const/16 v6, 0x10

    .line 48
    .line 49
    const/high16 v7, 0x3f400000    # 0.75f

    .line 50
    .line 51
    invoke-direct {v5, v6, v7}, Ljava/util/HashSet;-><init>(IF)V

    .line 52
    .line 53
    .line 54
    iput-object v5, v0, Lod/M0;->A:Ljava/util/HashSet;

    .line 55
    .line 56
    new-instance v5, Ljava/lang/Object;

    .line 57
    .line 58
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v5, v0, Lod/M0;->C:Ljava/lang/Object;

    .line 62
    .line 63
    new-instance v5, Ljava/util/HashSet;

    .line 64
    .line 65
    const/4 v13, 0x1

    .line 66
    invoke-direct {v5, v13, v7}, Ljava/util/HashSet;-><init>(IF)V

    .line 67
    .line 68
    .line 69
    iput-object v5, v0, Lod/M0;->D:Ljava/util/HashSet;

    .line 70
    .line 71
    new-instance v5, LVa/Y7;

    .line 72
    .line 73
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object v0, v5, LVa/Y7;->d:Ljava/lang/Object;

    .line 77
    .line 78
    new-instance v6, Ljava/lang/Object;

    .line 79
    .line 80
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object v6, v5, LVa/Y7;->a:Ljava/lang/Object;

    .line 84
    .line 85
    new-instance v6, Ljava/util/HashSet;

    .line 86
    .line 87
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v6, v5, LVa/Y7;->b:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object v5, v0, Lod/M0;->F:LVa/Y7;

    .line 93
    .line 94
    new-instance v5, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 95
    .line 96
    const/4 v14, 0x0

    .line 97
    invoke-direct {v5, v14}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 98
    .line 99
    .line 100
    iput-object v5, v0, Lod/M0;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 101
    .line 102
    new-instance v5, Ljava/util/concurrent/CountDownLatch;

    .line 103
    .line 104
    invoke-direct {v5, v13}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 105
    .line 106
    .line 107
    iput-object v5, v0, Lod/M0;->K:Ljava/util/concurrent/CountDownLatch;

    .line 108
    .line 109
    iput v13, v0, Lod/M0;->c0:I

    .line 110
    .line 111
    sget-object v5, Lod/M0;->i0:Lod/S0;

    .line 112
    .line 113
    iput-object v5, v0, Lod/M0;->R:Lod/S0;

    .line 114
    .line 115
    iput-boolean v14, v0, Lod/M0;->S:Z

    .line 116
    .line 117
    new-instance v5, Lcom/google/android/gms/ads/nativead/l;

    .line 118
    .line 119
    const/16 v6, 0xc

    .line 120
    .line 121
    invoke-direct {v5, v6}, Lcom/google/android/gms/ads/nativead/l;-><init>(I)V

    .line 122
    .line 123
    .line 124
    iput-object v5, v0, Lod/M0;->U:Lcom/google/android/gms/ads/nativead/l;

    .line 125
    .line 126
    sget-object v5, Lmd/r;->d:Lmd/j;

    .line 127
    .line 128
    iput-object v5, v0, Lod/M0;->Y:Lmd/j;

    .line 129
    .line 130
    new-instance v15, La2/c;

    .line 131
    .line 132
    const/16 v5, 0x13

    .line 133
    .line 134
    invoke-direct {v15, v0, v5}, La2/c;-><init>(Ljava/lang/Object;I)V

    .line 135
    .line 136
    .line 137
    new-instance v5, Lod/g0;

    .line 138
    .line 139
    const/4 v6, 0x1

    .line 140
    invoke-direct {v5, v0, v6}, Lod/g0;-><init>(Lmd/E;I)V

    .line 141
    .line 142
    .line 143
    iput-object v5, v0, Lod/M0;->Z:Lod/g0;

    .line 144
    .line 145
    new-instance v5, Ld7/j;

    .line 146
    .line 147
    invoke-direct {v5, v0}, Ld7/j;-><init>(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    iput-object v5, v0, Lod/M0;->a0:Ld7/j;

    .line 151
    .line 152
    iget-object v5, v1, Lod/N0;->f:Ljava/lang/String;

    .line 153
    .line 154
    const-string v6, "target"

    .line 155
    .line 156
    invoke-static {v5, v6}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    iput-object v5, v0, Lod/M0;->b:Ljava/lang/String;

    .line 160
    .line 161
    new-instance v6, Lmd/F;

    .line 162
    .line 163
    sget-object v7, Lmd/F;->d:Ljava/util/concurrent/atomic/AtomicLong;

    .line 164
    .line 165
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 166
    .line 167
    .line 168
    move-result-wide v9

    .line 169
    const-string v7, "Channel"

    .line 170
    .line 171
    invoke-direct {v6, v7, v5, v9, v10}, Lmd/F;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 172
    .line 173
    .line 174
    iput-object v6, v0, Lod/M0;->a:Lmd/F;

    .line 175
    .line 176
    iput-object v4, v0, Lod/M0;->l:Lod/Y1;

    .line 177
    .line 178
    iget-object v7, v1, Lod/N0;->a:La2/v;

    .line 179
    .line 180
    const-string v9, "executorPool"

    .line 181
    .line 182
    invoke-static {v7, v9}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    iput-object v7, v0, Lod/M0;->i:La2/v;

    .line 186
    .line 187
    iget-object v7, v7, La2/v;->b:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v7, Lod/U1;

    .line 190
    .line 191
    invoke-static {v7}, Lod/V1;->a(Lod/U1;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    check-cast v7, Ljava/util/concurrent/Executor;

    .line 196
    .line 197
    const-string v9, "executor"

    .line 198
    .line 199
    invoke-static {v7, v9}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    iput-object v7, v0, Lod/M0;->h:Ljava/util/concurrent/Executor;

    .line 203
    .line 204
    new-instance v12, Lod/D0;

    .line 205
    .line 206
    iget-object v9, v1, Lod/N0;->b:La2/v;

    .line 207
    .line 208
    const-string v10, "offloadExecutorPool"

    .line 209
    .line 210
    invoke-static {v9, v10}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-direct {v12, v9}, Lod/D0;-><init>(La2/v;)V

    .line 214
    .line 215
    .line 216
    iput-object v12, v0, Lod/M0;->k:Lod/D0;

    .line 217
    .line 218
    new-instance v9, Lod/j;

    .line 219
    .line 220
    invoke-direct {v9, v2, v12}, Lod/j;-><init>(Lpd/g;Lod/D0;)V

    .line 221
    .line 222
    .line 223
    iput-object v9, v0, Lod/M0;->f:Lod/j;

    .line 224
    .line 225
    new-instance v10, Lod/K0;

    .line 226
    .line 227
    iget-object v2, v2, Lpd/g;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 228
    .line 229
    invoke-direct {v10, v2}, Lod/K0;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 230
    .line 231
    .line 232
    iput-object v10, v0, Lod/M0;->g:Lod/K0;

    .line 233
    .line 234
    new-instance v2, Lod/m;

    .line 235
    .line 236
    invoke-virtual {v4}, Lod/Y1;->d()J

    .line 237
    .line 238
    .line 239
    move-result-wide v13

    .line 240
    const-string v11, "Channel for \'"

    .line 241
    .line 242
    move-object/from16 v16, v7

    .line 243
    .line 244
    const-string v7, "\'"

    .line 245
    .line 246
    invoke-static {v11, v5, v7}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    invoke-direct {v2, v6, v13, v14, v7}, Lod/m;-><init>(Lmd/F;JLjava/lang/String;)V

    .line 251
    .line 252
    .line 253
    iput-object v2, v0, Lod/M0;->N:Lod/m;

    .line 254
    .line 255
    new-instance v11, Lod/k;

    .line 256
    .line 257
    invoke-direct {v11, v2, v4}, Lod/k;-><init>(Lod/m;Lod/Y1;)V

    .line 258
    .line 259
    .line 260
    iput-object v11, v0, Lod/M0;->O:Lod/k;

    .line 261
    .line 262
    sget-object v7, Lod/a0;->m:Lod/o1;

    .line 263
    .line 264
    iget-boolean v2, v1, Lod/N0;->o:Z

    .line 265
    .line 266
    iput-boolean v2, v0, Lod/M0;->X:Z

    .line 267
    .line 268
    new-instance v4, Lod/a2;

    .line 269
    .line 270
    iget-object v6, v1, Lod/N0;->g:Ljava/lang/String;

    .line 271
    .line 272
    invoke-direct {v4, v6}, Lod/a2;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    iput-object v4, v0, Lod/M0;->e:Lod/a2;

    .line 276
    .line 277
    iget-object v13, v1, Lod/N0;->d:Lmd/g0;

    .line 278
    .line 279
    iput-object v13, v0, Lod/M0;->c:Lmd/g0;

    .line 280
    .line 281
    move-object v6, v9

    .line 282
    new-instance v9, Lg2/k;

    .line 283
    .line 284
    iget v14, v1, Lod/N0;->k:I

    .line 285
    .line 286
    move-object/from16 v17, v5

    .line 287
    .line 288
    iget v5, v1, Lod/N0;->l:I

    .line 289
    .line 290
    invoke-direct {v9, v2, v14, v5, v4}, Lg2/k;-><init>(ZIILod/a2;)V

    .line 291
    .line 292
    .line 293
    iget-object v2, v1, Lod/N0;->x:Lcom/google/android/gms/ads/nativead/l;

    .line 294
    .line 295
    iget-object v2, v2, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v2, Lpd/h;

    .line 298
    .line 299
    iget v4, v2, Lpd/h;->g:I

    .line 300
    .line 301
    invoke-static {v4}, LA/f;->f(I)I

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    if-eqz v4, :cond_1

    .line 306
    .line 307
    const/4 v5, 0x1

    .line 308
    if-ne v4, v5, :cond_0

    .line 309
    .line 310
    const/16 v2, 0x50

    .line 311
    .line 312
    goto :goto_0

    .line 313
    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    .line 314
    .line 315
    iget v2, v2, Lpd/h;->g:I

    .line 316
    .line 317
    invoke-static {v2}, Lpd/f;->p(I)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    const-string v3, " not handled"

    .line 322
    .line 323
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    throw v1

    .line 331
    :cond_1
    const/16 v2, 0x1bb

    .line 332
    .line 333
    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    new-instance v5, LQ9/a;

    .line 341
    .line 342
    move-object v14, v6

    .line 343
    move-object/from16 v4, v16

    .line 344
    .line 345
    move-object v6, v2

    .line 346
    move-object/from16 v2, v17

    .line 347
    .line 348
    invoke-direct/range {v5 .. v12}, LQ9/a;-><init>(Ljava/lang/Integer;Lod/o1;Lmd/n0;Lg2/k;Lod/K0;Lod/k;Lod/D0;)V

    .line 349
    .line 350
    .line 351
    iput-object v5, v0, Lod/M0;->d:LQ9/a;

    .line 352
    .line 353
    iget-object v6, v14, Lod/j;->a:Lpd/g;

    .line 354
    .line 355
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    const-class v6, Ljava/net/InetSocketAddress;

    .line 359
    .line 360
    invoke-static {v6}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 361
    .line 362
    .line 363
    move-result-object v6

    .line 364
    invoke-static {v2, v13, v5, v6}, Lod/M0;->t(Ljava/lang/String;Lmd/g0;LQ9/a;Ljava/util/Collection;)Lod/L1;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    iput-object v2, v0, Lod/M0;->v:Lod/L1;

    .line 369
    .line 370
    new-instance v2, Lod/D0;

    .line 371
    .line 372
    move-object/from16 v5, p4

    .line 373
    .line 374
    invoke-direct {v2, v5}, Lod/D0;-><init>(La2/v;)V

    .line 375
    .line 376
    .line 377
    iput-object v2, v0, Lod/M0;->j:Lod/D0;

    .line 378
    .line 379
    new-instance v2, Lod/H;

    .line 380
    .line 381
    invoke-direct {v2, v4, v8}, Lod/H;-><init>(Ljava/util/concurrent/Executor;Lmd/n0;)V

    .line 382
    .line 383
    .line 384
    iput-object v2, v0, Lod/M0;->E:Lod/H;

    .line 385
    .line 386
    invoke-virtual {v2, v15}, Lod/H;->e(Lod/T0;)Ljava/lang/Runnable;

    .line 387
    .line 388
    .line 389
    move-object/from16 v2, p3

    .line 390
    .line 391
    iput-object v2, v0, Lod/M0;->s:Lod/Y1;

    .line 392
    .line 393
    iget-boolean v2, v1, Lod/N0;->q:Z

    .line 394
    .line 395
    iput-boolean v2, v0, Lod/M0;->T:Z

    .line 396
    .line 397
    new-instance v4, Lod/J0;

    .line 398
    .line 399
    iget-object v5, v0, Lod/M0;->v:Lod/L1;

    .line 400
    .line 401
    invoke-virtual {v5}, Lod/L1;->f()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    invoke-direct {v4, v0, v5}, Lod/J0;-><init>(Lod/M0;Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    iput-object v4, v0, Lod/M0;->Q:Lod/J0;

    .line 409
    .line 410
    invoke-virtual/range {p6 .. p6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 415
    .line 416
    .line 417
    move-result v6

    .line 418
    if-eqz v6, :cond_2

    .line 419
    .line 420
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v6

    .line 424
    check-cast v6, Lud/g;

    .line 425
    .line 426
    new-instance v7, Lmd/g;

    .line 427
    .line 428
    invoke-direct {v7, v4, v6}, Lmd/g;-><init>(Lmd/d;Lud/g;)V

    .line 429
    .line 430
    .line 431
    move-object v4, v7

    .line 432
    goto :goto_1

    .line 433
    :cond_2
    iput-object v4, v0, Lod/M0;->t:Lmd/d;

    .line 434
    .line 435
    new-instance v4, Ljava/util/ArrayList;

    .line 436
    .line 437
    iget-object v5, v1, Lod/N0;->e:Ljava/util/ArrayList;

    .line 438
    .line 439
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 440
    .line 441
    .line 442
    iput-object v4, v0, Lod/M0;->u:Ljava/util/ArrayList;

    .line 443
    .line 444
    const-string v4, "stopwatchSupplier"

    .line 445
    .line 446
    invoke-static {v3, v4}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    iput-object v3, v0, Lod/M0;->p:Lod/Y;

    .line 450
    .line 451
    iget-wide v3, v1, Lod/N0;->j:J

    .line 452
    .line 453
    const-wide/16 v5, -0x1

    .line 454
    .line 455
    cmp-long v5, v3, v5

    .line 456
    .line 457
    if-nez v5, :cond_3

    .line 458
    .line 459
    iput-wide v3, v0, Lod/M0;->q:J

    .line 460
    .line 461
    goto :goto_3

    .line 462
    :cond_3
    sget-wide v5, Lod/N0;->A:J

    .line 463
    .line 464
    cmp-long v5, v3, v5

    .line 465
    .line 466
    if-ltz v5, :cond_4

    .line 467
    .line 468
    const/4 v5, 0x1

    .line 469
    goto :goto_2

    .line 470
    :cond_4
    const/4 v5, 0x0

    .line 471
    :goto_2
    const-string v6, "invalid idleTimeoutMillis %s"

    .line 472
    .line 473
    invoke-static {v6, v3, v4, v5}, LFe/e;->o(Ljava/lang/String;JZ)V

    .line 474
    .line 475
    .line 476
    iget-wide v3, v1, Lod/N0;->j:J

    .line 477
    .line 478
    iput-wide v3, v0, Lod/M0;->q:J

    .line 479
    .line 480
    :goto_3
    new-instance v3, Loc/d;

    .line 481
    .line 482
    new-instance v4, Lod/y0;

    .line 483
    .line 484
    const/4 v5, 0x5

    .line 485
    invoke-direct {v4, v0, v5}, Lod/y0;-><init>(Lod/M0;I)V

    .line 486
    .line 487
    .line 488
    iget-object v5, v14, Lod/j;->a:Lpd/g;

    .line 489
    .line 490
    iget-object v5, v5, Lpd/g;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 491
    .line 492
    new-instance v6, Lj/E;

    .line 493
    .line 494
    const/4 v7, 0x1

    .line 495
    invoke-direct {v6, v7}, Lj/E;-><init>(I)V

    .line 496
    .line 497
    .line 498
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 499
    .line 500
    .line 501
    iput-object v4, v3, Loc/d;->e:Ljava/lang/Object;

    .line 502
    .line 503
    iput-object v8, v3, Loc/d;->d:Ljava/lang/Object;

    .line 504
    .line 505
    iput-object v5, v3, Loc/d;->c:Ljava/lang/Object;

    .line 506
    .line 507
    iput-object v6, v3, Loc/d;->f:Ljava/lang/Object;

    .line 508
    .line 509
    invoke-virtual {v6}, Lj/E;->b()V

    .line 510
    .line 511
    .line 512
    iput-object v3, v0, Lod/M0;->b0:Loc/d;

    .line 513
    .line 514
    iget-object v3, v1, Lod/N0;->h:Lmd/t;

    .line 515
    .line 516
    const-string v4, "decompressorRegistry"

    .line 517
    .line 518
    invoke-static {v3, v4}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    iput-object v3, v0, Lod/M0;->n:Lmd/t;

    .line 522
    .line 523
    iget-object v3, v1, Lod/N0;->i:Lmd/l;

    .line 524
    .line 525
    const-string v4, "compressorRegistry"

    .line 526
    .line 527
    invoke-static {v3, v4}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    iput-object v3, v0, Lod/M0;->o:Lmd/l;

    .line 531
    .line 532
    iget-wide v3, v1, Lod/N0;->m:J

    .line 533
    .line 534
    iput-wide v3, v0, Lod/M0;->W:J

    .line 535
    .line 536
    iget-wide v3, v1, Lod/N0;->n:J

    .line 537
    .line 538
    iput-wide v3, v0, Lod/M0;->V:J

    .line 539
    .line 540
    new-instance v3, Lod/Y1;

    .line 541
    .line 542
    const/16 v4, 0xd

    .line 543
    .line 544
    invoke-direct {v3, v4}, Lod/Y1;-><init>(I)V

    .line 545
    .line 546
    .line 547
    iput-object v3, v0, Lod/M0;->L:Lod/Y1;

    .line 548
    .line 549
    new-instance v3, LVa/X7;

    .line 550
    .line 551
    invoke-direct {v3}, LVa/X7;-><init>()V

    .line 552
    .line 553
    .line 554
    iput-object v3, v0, Lod/M0;->M:LVa/X7;

    .line 555
    .line 556
    iget-object v1, v1, Lod/N0;->p:Lmd/C;

    .line 557
    .line 558
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    iput-object v1, v0, Lod/M0;->P:Lmd/C;

    .line 562
    .line 563
    iget-object v1, v1, Lmd/C;->a:Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 564
    .line 565
    invoke-virtual {v0}, Lod/M0;->f()Lmd/F;

    .line 566
    .line 567
    .line 568
    move-result-object v3

    .line 569
    iget-wide v3, v3, Lmd/F;->c:J

    .line 570
    .line 571
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 572
    .line 573
    .line 574
    move-result-object v3

    .line 575
    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    check-cast v1, Lmd/E;

    .line 580
    .line 581
    if-nez v2, :cond_5

    .line 582
    .line 583
    const/4 v1, 0x1

    .line 584
    iput-boolean v1, v0, Lod/M0;->S:Z

    .line 585
    .line 586
    :cond_5
    return-void
.end method

.method public static o(Lod/M0;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    invoke-virtual {p0, v2}, Lod/M0;->w(Z)V

    .line 5
    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, p0, Lod/M0;->E:Lod/H;

    .line 9
    .line 10
    invoke-virtual {v4, v3}, Lod/H;->i(Lmd/M;)V

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lod/M0;->O:Lod/k;

    .line 14
    .line 15
    const-string v5, "Entering IDLE state"

    .line 16
    .line 17
    invoke-virtual {v3, v1, v5}, Lod/k;->g(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object v3, Lmd/m;->d:Lmd/m;

    .line 21
    .line 22
    iget-object v5, p0, Lod/M0;->r:Ld7/j;

    .line 23
    .line 24
    invoke-virtual {v5, v3}, Ld7/j;->d(Lmd/m;)V

    .line 25
    .line 26
    .line 27
    iget-object v3, p0, Lod/M0;->C:Ljava/lang/Object;

    .line 28
    .line 29
    new-array v5, v1, [Ljava/lang/Object;

    .line 30
    .line 31
    aput-object v3, v5, v0

    .line 32
    .line 33
    aput-object v4, v5, v2

    .line 34
    .line 35
    iget-object v3, p0, Lod/M0;->Z:Lod/g0;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    :goto_0
    if-ge v0, v1, :cond_1

    .line 41
    .line 42
    aget-object v4, v5, v0

    .line 43
    .line 44
    iget-object v6, v3, LA7/B0;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v6, Ljava/util/Set;

    .line 47
    .line 48
    invoke-interface {v6, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_0

    .line 53
    .line 54
    invoke-virtual {p0}, Lod/M0;->s()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    add-int/2addr v0, v2

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    return-void
.end method

.method public static p(Lod/M0;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lod/M0;->H:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lod/M0;->A:Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lod/o0;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v2, Lod/i0;

    .line 27
    .line 28
    sget-object v3, Lod/M0;->f0:Lmd/k0;

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    invoke-direct {v2, v1, v3, v4}, Lod/i0;-><init>(Lod/o0;Lmd/k0;I)V

    .line 32
    .line 33
    .line 34
    iget-object v4, v1, Lod/o0;->k:Lmd/n0;

    .line 35
    .line 36
    invoke-virtual {v4, v2}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Lod/i0;

    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    invoke-direct {v2, v1, v3, v5}, Lod/i0;-><init>(Lod/o0;Lmd/k0;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v2}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    iget-object p0, p0, Lod/M0;->D:Ljava/util/HashSet;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-static {p0}, LVa/M6;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    throw p0

    .line 67
    :cond_2
    :goto_1
    return-void
.end method

.method public static q(Lod/M0;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lod/M0;->J:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    iget-object v0, p0, Lod/M0;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lod/M0;->A:Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    iget-object v0, p0, Lod/M0;->D:Ljava/util/HashSet;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object v0, p0, Lod/M0;->O:Lod/k;

    .line 31
    .line 32
    const/4 v1, 0x2

    .line 33
    const-string v2, "Terminated"

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Lod/k;->g(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lod/M0;->P:Lmd/C;

    .line 39
    .line 40
    iget-object v0, v0, Lmd/C;->a:Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 41
    .line 42
    invoke-virtual {p0}, Lod/M0;->f()Lmd/F;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-wide v1, v1, Lmd/F;->c:J

    .line 47
    .line 48
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lmd/E;

    .line 57
    .line 58
    iget-object v0, p0, Lod/M0;->i:La2/v;

    .line 59
    .line 60
    iget-object v1, p0, Lod/M0;->h:Ljava/util/concurrent/Executor;

    .line 61
    .line 62
    iget-object v0, v0, La2/v;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lod/U1;

    .line 65
    .line 66
    invoke-static {v0, v1}, Lod/V1;->b(Lod/U1;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lod/M0;->j:Lod/D0;

    .line 70
    .line 71
    monitor-enter v0

    .line 72
    :try_start_0
    iget-object v1, v0, Lod/D0;->b:Ljava/util/concurrent/Executor;

    .line 73
    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    iget-object v2, v0, Lod/D0;->a:La2/v;

    .line 77
    .line 78
    iget-object v2, v2, La2/v;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, Lod/U1;

    .line 81
    .line 82
    invoke-static {v2, v1}, Lod/V1;->b(Lod/U1;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    iput-object v1, v0, Lod/D0;->b:Ljava/util/concurrent/Executor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    goto :goto_1

    .line 91
    :cond_1
    :goto_0
    monitor-exit v0

    .line 92
    iget-object v0, p0, Lod/M0;->k:Lod/D0;

    .line 93
    .line 94
    invoke-virtual {v0}, Lod/D0;->b()V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lod/M0;->f:Lod/j;

    .line 98
    .line 99
    invoke-virtual {v0}, Lod/j;->close()V

    .line 100
    .line 101
    .line 102
    const/4 v0, 0x1

    .line 103
    iput-boolean v0, p0, Lod/M0;->J:Z

    .line 104
    .line 105
    iget-object p0, p0, Lod/M0;->K:Ljava/util/concurrent/CountDownLatch;

    .line 106
    .line 107
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    throw p0

    .line 113
    :cond_2
    :goto_2
    return-void
.end method

.method public static t(Ljava/lang/String;Lmd/g0;LQ9/a;Ljava/util/Collection;)Lod/L1;
    .locals 10

    .line 1
    const/4 v1, 0x1

    .line 2
    const-string v2, "/"

    .line 3
    .line 4
    new-instance v3, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    :try_start_0
    new-instance v0, Ljava/net/URI;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception v0

    .line 17
    invoke-virtual {v0}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    move-object v0, v4

    .line 25
    :goto_0
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {p1, v5}, Lmd/g0;->b(Ljava/lang/String;)Lmd/f0;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    move-object v5, v4

    .line 37
    :goto_1
    if-nez v5, :cond_1

    .line 38
    .line 39
    sget-object v6, Lod/M0;->e0:Ljava/util/regex/Pattern;

    .line 40
    .line 41
    invoke-virtual {v6, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-nez v6, :cond_1

    .line 50
    .line 51
    :try_start_1
    new-instance v0, Ljava/net/URI;

    .line 52
    .line 53
    monitor-enter p1
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_1

    .line 54
    :try_start_2
    iget-object v5, p1, Lmd/g0;->a:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 55
    .line 56
    :try_start_3
    monitor-exit p1

    .line 57
    const-string v6, ""

    .line 58
    .line 59
    new-instance v7, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-direct {v0, v5, v6, v2, v4}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/net/URISyntaxException; {:try_start_3 .. :try_end_3} :catch_1

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {p1, v2}, Lmd/g0;->b(Ljava/lang/String;)Lmd/f0;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    goto :goto_2

    .line 83
    :catchall_0
    move-exception v0

    .line 84
    move-object p0, v0

    .line 85
    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 86
    :try_start_5
    throw p0
    :try_end_5
    .catch Ljava/net/URISyntaxException; {:try_start_5 .. :try_end_5} :catch_1

    .line 87
    :catch_1
    move-exception v0

    .line 88
    move-object p0, v0

    .line 89
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 90
    .line 91
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_1
    :goto_2
    if-nez v5, :cond_3

    .line 96
    .line 97
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-lez p2, :cond_2

    .line 104
    .line 105
    new-instance p2, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string p3, " ("

    .line 108
    .line 109
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string p3, ")"

    .line 116
    .line 117
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    goto :goto_3

    .line 125
    :cond_2
    const-string p2, ""

    .line 126
    .line 127
    :goto_3
    const-string p3, "Could not find a NameResolverProvider for "

    .line 128
    .line 129
    invoke-static {p3, p0, p2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p1

    .line 137
    :cond_3
    if-eqz p3, :cond_5

    .line 138
    .line 139
    const-class p1, Ljava/net/InetSocketAddress;

    .line 140
    .line 141
    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-interface {p3, p1}, Ljava/util/Collection;->containsAll(Ljava/util/Collection;)Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-eqz p1, :cond_4

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    const-string p3, "Address types of NameResolver \'"

    .line 159
    .line 160
    const-string v0, "\' for \'"

    .line 161
    .line 162
    const-string v1, "\' not supported by transport"

    .line 163
    .line 164
    invoke-static {p3, p2, v0, p0, v1}, LR8/v;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw p1

    .line 172
    :cond_5
    :goto_4
    invoke-virtual {v0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    const-string p3, "dns"

    .line 177
    .line 178
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-eqz p1, :cond_7

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/net/URI;->getPath()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    const-string p3, "targetPath"

    .line 189
    .line 190
    invoke-static {p1, p3}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    const-string p3, "/"

    .line 194
    .line 195
    invoke-virtual {p1, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 196
    .line 197
    .line 198
    move-result p3

    .line 199
    const-string v2, "the path component (%s) of the target (%s) must start with \'/\'"

    .line 200
    .line 201
    if-eqz p3, :cond_6

    .line 202
    .line 203
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    new-instance v4, Lod/O;

    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/net/URI;->getAuthority()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    sget-object v7, Lod/a0;->p:Lod/Y1;

    .line 213
    .line 214
    new-instance v8, Lj/E;

    .line 215
    .line 216
    invoke-direct {v8, v1}, Lj/E;-><init>(I)V

    .line 217
    .line 218
    .line 219
    sget-boolean v9, Lod/P;->a:Z

    .line 220
    .line 221
    move-object v6, p2

    .line 222
    invoke-direct/range {v4 .. v9}, Lod/O;-><init>(Ljava/lang/String;LQ9/a;Lod/Y1;Lj/E;Z)V

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 227
    .line 228
    const/4 p2, 0x2

    .line 229
    new-array p2, p2, [Ljava/lang/Object;

    .line 230
    .line 231
    const/4 p3, 0x0

    .line 232
    aput-object p1, p2, p3

    .line 233
    .line 234
    aput-object v0, p2, v1

    .line 235
    .line 236
    invoke-static {v2, p2}, LFe/g;->E(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    throw p0

    .line 244
    :cond_7
    move-object v6, p2

    .line 245
    :goto_5
    if-eqz v4, :cond_9

    .line 246
    .line 247
    new-instance p0, Lod/L1;

    .line 248
    .line 249
    new-instance p1, Lod/h;

    .line 250
    .line 251
    new-instance p2, Lod/Y1;

    .line 252
    .line 253
    const/4 p3, 0x7

    .line 254
    invoke-direct {p2, p3}, Lod/Y1;-><init>(I)V

    .line 255
    .line 256
    .line 257
    iget-object p3, v6, LQ9/a;->f:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast p3, Lod/K0;

    .line 260
    .line 261
    if-eqz p3, :cond_8

    .line 262
    .line 263
    iget-object v0, v6, LQ9/a;->d:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v0, Lmd/n0;

    .line 266
    .line 267
    invoke-direct {p1, p2, p3, v0}, Lod/h;-><init>(Lod/Y1;Lod/K0;Lmd/n0;)V

    .line 268
    .line 269
    .line 270
    invoke-direct {p0, v4, p1, v0}, Lod/L1;-><init>(Lod/O;Lod/h;Lmd/n0;)V

    .line 271
    .line 272
    .line 273
    return-object p0

    .line 274
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 275
    .line 276
    const-string p1, "ScheduledExecutorService not set in Builder"

    .line 277
    .line 278
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw p0

    .line 282
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 283
    .line 284
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 285
    .line 286
    .line 287
    move-result p2

    .line 288
    if-lez p2, :cond_a

    .line 289
    .line 290
    new-instance p2, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    const-string p3, " ("

    .line 293
    .line 294
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    const-string p3, ")"

    .line 301
    .line 302
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p2

    .line 309
    goto :goto_6

    .line 310
    :cond_a
    const-string p2, ""

    .line 311
    .line 312
    :goto_6
    const-string p3, "cannot create a NameResolver for "

    .line 313
    .line 314
    invoke-static {p3, p0, p2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    throw p1
.end method


# virtual methods
.method public final f()Lmd/F;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/M0;->a:Lmd/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/M0;->t:Lmd/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmd/d;->g()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final h(LF6/r;Lmd/c;)Lmd/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/M0;->t:Lmd/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lmd/d;->h(LF6/r;Lmd/c;)Lmd/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final i(J)Z
    .locals 2

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    iget-object v1, p0, Lod/M0;->K:Ljava/util/concurrent/CountDownLatch;

    .line 4
    .line 5
    invoke-virtual {v1, p1, p2, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final j()V
    .locals 2

    .line 1
    new-instance v0, Lod/y0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lod/y0;-><init>(Lod/M0;I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lod/M0;->m:Lmd/n0;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final k()Lmd/m;
    .locals 4

    .line 1
    iget-object v0, p0, Lod/M0;->r:Ld7/j;

    .line 2
    .line 3
    iget-object v0, v0, Ld7/j;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lmd/m;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    sget-object v1, Lmd/m;->d:Lmd/m;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lod/M0;->m:Lmd/n0;

    .line 14
    .line 15
    new-instance v2, Lod/y0;

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    invoke-direct {v2, p0, v3}, Lod/y0;-><init>(Lod/M0;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object v0

    .line 25
    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 26
    .line 27
    const-string v1, "Channel state API is not implemented"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public final l(Lmd/m;Lv9/n;)V
    .locals 2

    .line 1
    new-instance v0, LA7/w0;

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    invoke-direct {v0, p0, p2, p1, v1}, LA7/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lod/M0;->m:Lmd/n0;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final bridge synthetic m()Lmd/S;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lod/M0;->v()V

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method public final n()Lmd/S;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "shutdownNow() called"

    .line 3
    .line 4
    iget-object v2, p0, Lod/M0;->O:Lod/k;

    .line 5
    .line 6
    invoke-virtual {v2, v0, v1}, Lod/k;->g(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lod/M0;->v()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lod/M0;->Q:Lod/J0;

    .line 13
    .line 14
    iget-object v1, v0, Lod/J0;->d:Lod/M0;

    .line 15
    .line 16
    iget-object v1, v1, Lod/M0;->m:Lmd/n0;

    .line 17
    .line 18
    new-instance v2, Lod/H0;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-direct {v2, v0, v3}, Lod/H0;-><init>(Lod/J0;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lod/y0;

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    invoke-direct {v0, p0, v1}, Lod/y0;-><init>(Lod/M0;I)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lod/M0;->m:Lmd/n0;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    return-object p0
.end method

.method public final r(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lod/M0;->b0:Loc/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Loc/d;->b:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p1, v0, Loc/d;->g:Ljava/util/concurrent/Future;

    .line 9
    .line 10
    check-cast p1, Ljava/util/concurrent/ScheduledFuture;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-interface {p1, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-object p1, v0, Loc/d;->g:Ljava/util/concurrent/Future;

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final s()V
    .locals 4

    .line 1
    iget-object v0, p0, Lod/M0;->m:Lmd/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmd/n0;->e()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lod/M0;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_4

    .line 13
    .line 14
    iget-boolean v0, p0, Lod/M0;->z:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget-object v0, p0, Lod/M0;->Z:Lod/g0;

    .line 20
    .line 21
    iget-object v0, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ljava/util/Set;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-virtual {p0, v0}, Lod/M0;->r(Z)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0}, Lod/M0;->u()V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v0, p0, Lod/M0;->x:Lod/E0;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const-string v0, "Exiting idle mode"

    .line 45
    .line 46
    iget-object v1, p0, Lod/M0;->O:Lod/k;

    .line 47
    .line 48
    const/4 v2, 0x2

    .line 49
    invoke-virtual {v1, v2, v0}, Lod/k;->g(ILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Lod/E0;

    .line 53
    .line 54
    invoke-direct {v0, p0}, Lod/E0;-><init>(Lod/M0;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lod/M0;->e:Lod/a2;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v2, LS3/n;

    .line 63
    .line 64
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v1, v2, LS3/n;->d:Ljava/lang/Object;

    .line 68
    .line 69
    iput-object v0, v2, LS3/n;->a:Ljava/lang/Object;

    .line 70
    .line 71
    iget-object v3, v1, Lod/a2;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v3, Lmd/Q;

    .line 74
    .line 75
    iget-object v1, v1, Lod/a2;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v3, v1}, Lmd/Q;->c(Ljava/lang/String;)Lmd/P;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    iput-object v3, v2, LS3/n;->c:Ljava/lang/Object;

    .line 84
    .line 85
    if-eqz v3, :cond_3

    .line 86
    .line 87
    invoke-virtual {v3, v0}, Lmd/P;->b(Lmd/y;)Lmd/O;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iput-object v1, v2, LS3/n;->b:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v2, v0, Lod/E0;->a:LS3/n;

    .line 94
    .line 95
    iput-object v0, p0, Lod/M0;->x:Lod/E0;

    .line 96
    .line 97
    new-instance v1, Lod/F0;

    .line 98
    .line 99
    iget-object v2, p0, Lod/M0;->v:Lod/L1;

    .line 100
    .line 101
    invoke-direct {v1, p0, v0, v2}, Lod/F0;-><init>(Lod/M0;Lod/E0;Lod/L1;)V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lod/M0;->v:Lod/L1;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Lod/L1;->k(Lmd/e;)V

    .line 107
    .line 108
    .line 109
    const/4 v0, 0x1

    .line 110
    iput-boolean v0, p0, Lod/M0;->w:Z

    .line 111
    .line 112
    return-void

    .line 113
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 114
    .line 115
    const-string v2, "Could not find policy \'"

    .line 116
    .line 117
    const-string v3, "\'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."

    .line 118
    .line 119
    invoke-static {v2, v1, v3}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v0

    .line 127
    :cond_4
    :goto_1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, LBa/c;->S(Ljava/lang/Object;)LA7/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lod/M0;->a:Lmd/F;

    .line 6
    .line 7
    iget-wide v1, v1, Lmd/F;->c:J

    .line 8
    .line 9
    const-string v3, "logId"

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, v3}, LA7/b0;->e(JLjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "target"

    .line 15
    .line 16
    iget-object v2, p0, Lod/M0;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, LA7/b0;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public final u()V
    .locals 10

    .line 1
    iget-wide v0, p0, Lod/M0;->q:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11
    .line 12
    iget-object v3, p0, Lod/M0;->b0:Loc/d;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 22
    .line 23
    iget-object v4, v3, Loc/d;->f:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Lj/E;

    .line 26
    .line 27
    invoke-virtual {v4}, Lj/E;->a()J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    add-long/2addr v4, v0

    .line 32
    const/4 v6, 0x1

    .line 33
    iput-boolean v6, v3, Loc/d;->b:Z

    .line 34
    .line 35
    iget-wide v6, v3, Loc/d;->a:J

    .line 36
    .line 37
    sub-long v6, v4, v6

    .line 38
    .line 39
    const-wide/16 v8, 0x0

    .line 40
    .line 41
    cmp-long v6, v6, v8

    .line 42
    .line 43
    if-ltz v6, :cond_1

    .line 44
    .line 45
    iget-object v6, v3, Loc/d;->g:Ljava/util/concurrent/Future;

    .line 46
    .line 47
    check-cast v6, Ljava/util/concurrent/ScheduledFuture;

    .line 48
    .line 49
    if-nez v6, :cond_3

    .line 50
    .line 51
    :cond_1
    iget-object v6, v3, Loc/d;->g:Ljava/util/concurrent/Future;

    .line 52
    .line 53
    check-cast v6, Ljava/util/concurrent/ScheduledFuture;

    .line 54
    .line 55
    if-eqz v6, :cond_2

    .line 56
    .line 57
    const/4 v7, 0x0

    .line 58
    invoke-interface {v6, v7}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 59
    .line 60
    .line 61
    :cond_2
    new-instance v6, Lod/t1;

    .line 62
    .line 63
    const/4 v7, 0x1

    .line 64
    invoke-direct {v6, v3, v7}, Lod/t1;-><init>(Loc/d;I)V

    .line 65
    .line 66
    .line 67
    iget-object v7, v3, Loc/d;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v7, Ljava/util/concurrent/ScheduledExecutorService;

    .line 70
    .line 71
    invoke-interface {v7, v6, v0, v1, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, v3, Loc/d;->g:Ljava/util/concurrent/Future;

    .line 76
    .line 77
    :cond_3
    iput-wide v4, v3, Loc/d;->a:J

    .line 78
    .line 79
    return-void
.end method

.method public final v()V
    .locals 5

    .line 1
    const-string v0, "shutdown() called"

    .line 2
    .line 3
    iget-object v1, p0, Lod/M0;->O:Lod/k;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-virtual {v1, v2, v0}, Lod/k;->g(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lod/M0;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Lod/y0;

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    invoke-direct {v0, p0, v1}, Lod/y0;-><init>(Lod/M0;I)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lod/M0;->m:Lmd/n0;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lod/M0;->Q:Lod/J0;

    .line 31
    .line 32
    iget-object v2, v0, Lod/J0;->d:Lod/M0;

    .line 33
    .line 34
    iget-object v2, v2, Lod/M0;->m:Lmd/n0;

    .line 35
    .line 36
    new-instance v3, Lod/H0;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-direct {v3, v0, v4}, Lod/H0;-><init>(Lod/J0;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v3}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Lod/y0;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-direct {v0, p0, v2}, Lod/y0;-><init>(Lod/M0;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v0}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final w(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lod/M0;->m:Lmd/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmd/n0;->e()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget-boolean v1, p0, Lod/M0;->w:Z

    .line 10
    .line 11
    const-string v2, "nameResolver is not started"

    .line 12
    .line 13
    invoke-static {v2, v1}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lod/M0;->x:Lod/E0;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v0

    .line 23
    :goto_0
    const-string v2, "lbHelper is null"

    .line 24
    .line 25
    invoke-static {v2, v1}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object v1, p0, Lod/M0;->v:Lod/L1;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-virtual {v1}, Lod/L1;->j()V

    .line 34
    .line 35
    .line 36
    iput-boolean v0, p0, Lod/M0;->w:Z

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    iget-object p1, p0, Lod/M0;->b:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v0, p0, Lod/M0;->c:Lmd/g0;

    .line 43
    .line 44
    iget-object v1, p0, Lod/M0;->d:LQ9/a;

    .line 45
    .line 46
    iget-object v3, p0, Lod/M0;->f:Lod/j;

    .line 47
    .line 48
    iget-object v3, v3, Lod/j;->a:Lpd/g;

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    const-class v3, Ljava/net/InetSocketAddress;

    .line 54
    .line 55
    invoke-static {v3}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-static {p1, v0, v1, v3}, Lod/M0;->t(Ljava/lang/String;Lmd/g0;LQ9/a;Ljava/util/Collection;)Lod/L1;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lod/M0;->v:Lod/L1;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    iput-object v2, p0, Lod/M0;->v:Lod/L1;

    .line 67
    .line 68
    :cond_3
    :goto_1
    iget-object p1, p0, Lod/M0;->x:Lod/E0;

    .line 69
    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    iget-object p1, p1, Lod/E0;->a:LS3/n;

    .line 73
    .line 74
    iget-object v0, p1, LS3/n;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Lmd/O;

    .line 77
    .line 78
    invoke-virtual {v0}, Lmd/O;->f()V

    .line 79
    .line 80
    .line 81
    iput-object v2, p1, LS3/n;->b:Ljava/lang/Object;

    .line 82
    .line 83
    iput-object v2, p0, Lod/M0;->x:Lod/E0;

    .line 84
    .line 85
    :cond_4
    iput-object v2, p0, Lod/M0;->y:Lmd/M;

    .line 86
    .line 87
    return-void
.end method
