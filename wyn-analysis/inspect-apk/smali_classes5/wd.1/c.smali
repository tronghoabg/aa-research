.class public final Lwd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEf/E;
.implements Ljava/io/Closeable;


# static fields
.field public static final synthetic l:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final a:LAd/e;

.field public final b:Z

.field public final c:LEf/o0;

.field private volatile synthetic closed:I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ljf/h;

.field public final e:LFd/f;

.field public final f:LGd/b;

.field public final g:LFd/f;

.field public final h:LGd/b;

.field public final i:LNd/d;

.field public final j:Ly3/j;

.field public final k:Lwd/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lwd/c;

    .line 2
    .line 3
    const-string v1, "closed"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lwd/c;->l:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(LAd/e;Lwd/d;)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/16 v2, 0x1c

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lwd/c;->a:LAd/e;

    .line 9
    .line 10
    iput v1, p0, Lwd/c;->closed:I

    .line 11
    .line 12
    invoke-virtual {p1}, Lzd/e;->getCoroutineContext()Ljf/h;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    sget-object v4, LEf/l0;->a:LEf/l0;

    .line 17
    .line 18
    invoke-interface {v3, v4}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, LEf/m0;

    .line 23
    .line 24
    new-instance v4, LEf/o0;

    .line 25
    .line 26
    invoke-direct {v4, v3}, LEf/o0;-><init>(LEf/m0;)V

    .line 27
    .line 28
    .line 29
    iput-object v4, p0, Lwd/c;->c:LEf/o0;

    .line 30
    .line 31
    invoke-virtual {p1}, Lzd/e;->getCoroutineContext()Ljf/h;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-interface {v3, v4}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iput-object v3, p0, Lwd/c;->d:Ljf/h;

    .line 40
    .line 41
    new-instance v3, LFd/f;

    .line 42
    .line 43
    invoke-direct {v3, v1}, LFd/f;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iput-object v3, p0, Lwd/c;->e:LFd/f;

    .line 47
    .line 48
    new-instance v3, LGd/b;

    .line 49
    .line 50
    invoke-direct {v3, v0}, LGd/b;-><init>(I)V

    .line 51
    .line 52
    .line 53
    iput-object v3, p0, Lwd/c;->f:LGd/b;

    .line 54
    .line 55
    new-instance v3, LFd/f;

    .line 56
    .line 57
    invoke-direct {v3, v0}, LFd/f;-><init>(I)V

    .line 58
    .line 59
    .line 60
    iput-object v3, p0, Lwd/c;->g:LFd/f;

    .line 61
    .line 62
    new-instance v5, LGd/b;

    .line 63
    .line 64
    invoke-direct {v5, v1}, LGd/b;-><init>(I)V

    .line 65
    .line 66
    .line 67
    iput-object v5, p0, Lwd/c;->h:LGd/b;

    .line 68
    .line 69
    new-instance v1, LNd/d;

    .line 70
    .line 71
    invoke-direct {v1}, LNd/d;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object v1, p0, Lwd/c;->i:LNd/d;

    .line 75
    .line 76
    new-instance v1, Ly3/j;

    .line 77
    .line 78
    const/16 v5, 0xc

    .line 79
    .line 80
    invoke-direct {v1, v5}, Ly3/j;-><init>(I)V

    .line 81
    .line 82
    .line 83
    iput-object v1, p0, Lwd/c;->j:Ly3/j;

    .line 84
    .line 85
    new-instance v1, Lwd/d;

    .line 86
    .line 87
    invoke-direct {v1}, Lwd/d;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v1, p0, Lwd/c;->k:Lwd/d;

    .line 91
    .line 92
    iget-boolean v5, p0, Lwd/c;->b:Z

    .line 93
    .line 94
    if-eqz v5, :cond_0

    .line 95
    .line 96
    new-instance v5, Lwd/a;

    .line 97
    .line 98
    invoke-direct {v5, p0}, Lwd/a;-><init>(Lwd/c;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, v5}, LEf/z0;->invokeOnCompletion(Ltf/l;)LEf/U;

    .line 102
    .line 103
    .line 104
    :cond_0
    sget-object v4, LFd/f;->o:LD8/a;

    .line 105
    .line 106
    new-instance v5, LCd/k0;

    .line 107
    .line 108
    const/4 v6, 0x0

    .line 109
    invoke-direct {v5, p0, p1, v6}, LCd/k0;-><init>(Lwd/c;LAd/e;Ljf/c;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v4, v5}, LRd/d;->f(LD8/a;Ltf/q;)V

    .line 113
    .line 114
    .line 115
    sget-object p1, LFd/f;->p:LD8/a;

    .line 116
    .line 117
    new-instance v4, LCd/a;

    .line 118
    .line 119
    const/16 v5, 0x8

    .line 120
    .line 121
    invoke-direct {v4, p0, v6, v5}, LCd/a;-><init>(Ljava/lang/Object;Ljf/c;I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3, p1, v4}, LRd/d;->f(LD8/a;Ltf/q;)V

    .line 125
    .line 126
    .line 127
    sget-object p1, LCd/T;->b:LDd/c;

    .line 128
    .line 129
    new-instance v3, Lcom/moloco/sdk/internal/publisher/d;

    .line 130
    .line 131
    invoke-direct {v3, v2}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, p1, v3}, Lwd/d;->a(LCd/G;Ltf/l;)V

    .line 135
    .line 136
    .line 137
    sget-object p1, LCd/f;->c:LDd/c;

    .line 138
    .line 139
    new-instance v3, Lcom/moloco/sdk/internal/publisher/d;

    .line 140
    .line 141
    invoke-direct {v3, v2}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, p1, v3}, Lwd/d;->a(LCd/G;Ltf/l;)V

    .line 145
    .line 146
    .line 147
    sget-object p1, LCd/w;->d:LDd/c;

    .line 148
    .line 149
    new-instance v3, Lcom/moloco/sdk/internal/publisher/d;

    .line 150
    .line 151
    invoke-direct {v3, v2}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, p1, v3}, Lwd/d;->a(LCd/G;Ltf/l;)V

    .line 155
    .line 156
    .line 157
    iget-boolean p1, p2, Lwd/d;->f:Z

    .line 158
    .line 159
    if-eqz p1, :cond_1

    .line 160
    .line 161
    new-instance p1, Lcom/moloco/sdk/internal/publisher/d;

    .line 162
    .line 163
    const/16 v3, 0x1b

    .line 164
    .line 165
    invoke-direct {p1, v3}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 166
    .line 167
    .line 168
    iget-object v3, v1, Lwd/d;->c:Ljava/util/LinkedHashMap;

    .line 169
    .line 170
    const-string v4, "DefaultTransformers"

    .line 171
    .line 172
    invoke-interface {v3, v4, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    :cond_1
    sget-object p1, LCd/l0;->b:LCd/b;

    .line 176
    .line 177
    new-instance v3, Lcom/moloco/sdk/internal/publisher/d;

    .line 178
    .line 179
    invoke-direct {v3, v2}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, p1, v3}, Lwd/d;->a(LCd/G;Ltf/l;)V

    .line 183
    .line 184
    .line 185
    sget-object p1, LCd/F;->b:LDd/c;

    .line 186
    .line 187
    new-instance v3, Lcom/moloco/sdk/internal/publisher/d;

    .line 188
    .line 189
    invoke-direct {v3, v2}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1, p1, v3}, Lwd/d;->a(LCd/G;Ltf/l;)V

    .line 193
    .line 194
    .line 195
    iget-boolean v3, p2, Lwd/d;->e:Z

    .line 196
    .line 197
    if-eqz v3, :cond_2

    .line 198
    .line 199
    sget-object v3, LCd/S;->d:LDd/c;

    .line 200
    .line 201
    new-instance v4, Lcom/moloco/sdk/internal/publisher/d;

    .line 202
    .line 203
    invoke-direct {v4, v2}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, v3, v4}, Lwd/d;->a(LCd/G;Ltf/l;)V

    .line 207
    .line 208
    .line 209
    :cond_2
    iget-boolean v3, p2, Lwd/d;->e:Z

    .line 210
    .line 211
    iput-boolean v3, v1, Lwd/d;->e:Z

    .line 212
    .line 213
    iget-boolean v3, p2, Lwd/d;->f:Z

    .line 214
    .line 215
    iput-boolean v3, v1, Lwd/d;->f:Z

    .line 216
    .line 217
    iget-object v3, v1, Lwd/d;->a:Ljava/util/LinkedHashMap;

    .line 218
    .line 219
    iget-object v4, p2, Lwd/d;->a:Ljava/util/LinkedHashMap;

    .line 220
    .line 221
    invoke-interface {v3, v4}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 222
    .line 223
    .line 224
    iget-object v3, v1, Lwd/d;->b:Ljava/util/LinkedHashMap;

    .line 225
    .line 226
    iget-object v4, p2, Lwd/d;->b:Ljava/util/LinkedHashMap;

    .line 227
    .line 228
    invoke-interface {v3, v4}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 229
    .line 230
    .line 231
    iget-object v3, v1, Lwd/d;->c:Ljava/util/LinkedHashMap;

    .line 232
    .line 233
    iget-object v4, p2, Lwd/d;->c:Ljava/util/LinkedHashMap;

    .line 234
    .line 235
    invoke-interface {v3, v4}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 236
    .line 237
    .line 238
    iget-boolean p2, p2, Lwd/d;->f:Z

    .line 239
    .line 240
    if-eqz p2, :cond_3

    .line 241
    .line 242
    sget-object p2, LCd/N;->b:LDd/c;

    .line 243
    .line 244
    new-instance v3, Lcom/moloco/sdk/internal/publisher/d;

    .line 245
    .line 246
    invoke-direct {v3, v2}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1, p2, v3}, Lwd/d;->a(LCd/G;Ltf/l;)V

    .line 250
    .line 251
    .line 252
    :cond_3
    sget-object p2, LCd/m;->a:LNd/a;

    .line 253
    .line 254
    new-instance p2, LAd/g;

    .line 255
    .line 256
    invoke-direct {p2, v1}, LAd/g;-><init>(Lwd/d;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, p1, p2}, Lwd/d;->a(LCd/G;Ltf/l;)V

    .line 260
    .line 261
    .line 262
    iget-object p1, v1, Lwd/d;->a:Ljava/util/LinkedHashMap;

    .line 263
    .line 264
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    check-cast p1, Ljava/lang/Iterable;

    .line 269
    .line 270
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result p2

    .line 278
    if-eqz p2, :cond_4

    .line 279
    .line 280
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    check-cast p2, Ltf/l;

    .line 285
    .line 286
    invoke-interface {p2, p0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    goto :goto_0

    .line 290
    :cond_4
    iget-object p1, v1, Lwd/d;->c:Ljava/util/LinkedHashMap;

    .line 291
    .line 292
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    check-cast p1, Ljava/lang/Iterable;

    .line 297
    .line 298
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 303
    .line 304
    .line 305
    move-result p2

    .line 306
    if-eqz p2, :cond_5

    .line 307
    .line 308
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object p2

    .line 312
    check-cast p2, Ltf/l;

    .line 313
    .line 314
    invoke-interface {p2, p0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    goto :goto_1

    .line 318
    :cond_5
    iget-object p1, p0, Lwd/c;->f:LGd/b;

    .line 319
    .line 320
    sget-object p2, LGd/b;->j:LD8/a;

    .line 321
    .line 322
    new-instance v1, LCd/p;

    .line 323
    .line 324
    const/4 v2, 0x5

    .line 325
    invoke-direct {v1, p0, v6, v2}, LCd/p;-><init>(Ljava/lang/Object;Ljf/c;I)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1, p2, v1}, LRd/d;->f(LD8/a;Ltf/q;)V

    .line 329
    .line 330
    .line 331
    iput-boolean v0, p0, Lwd/c;->b:Z

    .line 332
    .line 333
    return-void
.end method


# virtual methods
.method public final a(LFd/c;Llf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lwd/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lwd/b;

    .line 7
    .line 8
    iget v1, v0, Lwd/b;->c:I

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
    iput v1, v0, Lwd/b;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lwd/b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lwd/b;-><init>(Lwd/c;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lwd/b;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lwd/b;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object p2, LHd/a;->a:Lwa/a;

    .line 52
    .line 53
    iget-object v2, p0, Lwd/c;->j:Ly3/j;

    .line 54
    .line 55
    invoke-virtual {v2, p2}, Ly3/j;->q(Lwa/a;)V

    .line 56
    .line 57
    .line 58
    iget-object p2, p1, LFd/c;->d:Ljava/lang/Object;

    .line 59
    .line 60
    iput v3, v0, Lwd/b;->c:I

    .line 61
    .line 62
    iget-object v2, p0, Lwd/c;->e:LFd/f;

    .line 63
    .line 64
    invoke-virtual {v2, p1, p2, v0}, LRd/d;->a(Ljava/lang/Object;Ljava/lang/Object;Llf/c;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    if-ne p2, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    const-string p1, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall"

    .line 72
    .line 73
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    check-cast p2, Lxd/c;

    .line 77
    .line 78
    return-object p2
.end method

.method public final close()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, Lwd/c;->l:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-virtual {v1, p0, v2, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    sget-object v0, LCd/H;->a:LNd/a;

    .line 13
    .line 14
    iget-object v1, p0, Lwd/c;->i:LNd/d;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, LNd/d;->b(LNd/a;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, LNd/d;

    .line 21
    .line 22
    invoke-virtual {v0}, LNd/d;->c()Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/lang/Iterable;

    .line 31
    .line 32
    invoke-static {v1}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/Iterable;

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, LNd/a;

    .line 53
    .line 54
    const-string v3, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>"

    .line 55
    .line 56
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, LNd/d;->b(LNd/a;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    instance-of v3, v2, Ljava/lang/AutoCloseable;

    .line 64
    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    check-cast v2, Ljava/lang/AutoCloseable;

    .line 68
    .line 69
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    iget-object v0, p0, Lwd/c;->c:LEf/o0;

    .line 74
    .line 75
    invoke-virtual {v0}, LEf/o0;->Y()Z

    .line 76
    .line 77
    .line 78
    iget-boolean v0, p0, Lwd/c;->b:Z

    .line 79
    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    iget-object v0, p0, Lwd/c;->a:LAd/e;

    .line 83
    .line 84
    invoke-virtual {v0}, Lzd/e;->close()V

    .line 85
    .line 86
    .line 87
    :cond_3
    :goto_1
    return-void
.end method

.method public final getCoroutineContext()Ljf/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lwd/c;->d:Ljf/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "HttpClient["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lwd/c;->a:LAd/e;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x5d

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
