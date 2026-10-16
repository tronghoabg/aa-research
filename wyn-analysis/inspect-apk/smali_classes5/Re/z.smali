.class public final LRe/z;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements LHe/f;
.implements Lug/b;


# static fields
.field public static final q:[LRe/y;

.field public static final r:[LRe/y;


# instance fields
.field public final a:LHe/f;

.field public final b:Lza/a;

.field public final c:I

.field public final d:I

.field public volatile e:LOe/g;

.field public volatile f:Z

.field public final g:LZe/b;

.field public volatile h:Z

.field public final i:Ljava/util/concurrent/atomic/AtomicReference;

.field public final j:Ljava/util/concurrent/atomic/AtomicLong;

.field public k:Lug/b;

.field public l:J

.field public m:J

.field public n:I

.field public o:I

.field public final p:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [LRe/y;

    .line 3
    .line 4
    sput-object v1, LRe/z;->q:[LRe/y;

    .line 5
    .line 6
    new-array v0, v0, [LRe/y;

    .line 7
    .line 8
    sput-object v0, LRe/z;->r:[LRe/y;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(LHe/f;Lza/a;II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LZe/b;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LRe/z;->g:LZe/b;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LRe/z;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    new-instance v1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, LRe/z;->j:Ljava/util/concurrent/atomic/AtomicLong;

    .line 24
    .line 25
    iput-object p1, p0, LRe/z;->a:LHe/f;

    .line 26
    .line 27
    iput-object p2, p0, LRe/z;->b:Lza/a;

    .line 28
    .line 29
    iput p3, p0, LRe/z;->c:I

    .line 30
    .line 31
    iput p4, p0, LRe/z;->d:I

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    shr-int/lit8 p2, p3, 0x1

    .line 35
    .line 36
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput p1, p0, LRe/z;->p:I

    .line 41
    .line 42
    sget-object p1, LRe/z;->q:[LRe/y;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, LRe/z;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, LRe/z;->e:LOe/g;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    invoke-interface {v0}, LOe/h;->clear()V

    .line 11
    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    iget-object v0, p0, LRe/z;->g:LZe/b;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    iget-object v0, p0, LRe/z;->e:LOe/g;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0}, LOe/h;->clear()V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, LRe/z;->g:LZe/b;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sget-object v2, LZe/d;->a:LZe/c;

    .line 39
    .line 40
    if-eq v0, v2, :cond_2

    .line 41
    .line 42
    iget-object v2, p0, LRe/z;->a:LHe/f;

    .line 43
    .line 44
    invoke-interface {v2, v0}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return v1

    .line 48
    :cond_3
    const/4 v0, 0x0

    .line 49
    return v0
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, LRe/z;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_1

    .line 6
    .line 7
    :cond_0
    :try_start_0
    iget-object v0, p0, LRe/z;->b:Lza/a;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v0, "The mapper returned a null Publisher"

    .line 13
    .line 14
    invoke-static {p1, v0}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast p1, Lug/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    .line 19
    instance-of v0, p1, Ljava/util/concurrent/Callable;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz v0, :cond_b

    .line 23
    .line 24
    :try_start_1
    check-cast p1, Ljava/util/concurrent/Callable;

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    const/4 v0, 0x1

    .line 31
    const v2, 0x7fffffff

    .line 32
    .line 33
    .line 34
    if-eqz p1, :cond_9

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const-string v4, "Scalar queue full?!"

    .line 41
    .line 42
    if-nez v3, :cond_6

    .line 43
    .line 44
    invoke-virtual {p0, v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_6

    .line 49
    .line 50
    iget-object v3, p0, LRe/z;->j:Ljava/util/concurrent/atomic/AtomicLong;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 53
    .line 54
    .line 55
    move-result-wide v5

    .line 56
    iget-object v3, p0, LRe/z;->e:LOe/g;

    .line 57
    .line 58
    const-wide/16 v7, 0x0

    .line 59
    .line 60
    cmp-long v7, v5, v7

    .line 61
    .line 62
    if-eqz v7, :cond_3

    .line 63
    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    invoke-interface {v3}, LOe/h;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_3

    .line 71
    .line 72
    :cond_1
    iget-object v3, p0, LRe/z;->a:LHe/f;

    .line 73
    .line 74
    invoke-interface {v3, p1}, LHe/f;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    const-wide v3, 0x7fffffffffffffffL

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    cmp-long p1, v5, v3

    .line 83
    .line 84
    if-eqz p1, :cond_2

    .line 85
    .line 86
    iget-object p1, p0, LRe/z;->j:Ljava/util/concurrent/atomic/AtomicLong;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->decrementAndGet()J

    .line 89
    .line 90
    .line 91
    :cond_2
    iget p1, p0, LRe/z;->c:I

    .line 92
    .line 93
    if-eq p1, v2, :cond_5

    .line 94
    .line 95
    iget-boolean p1, p0, LRe/z;->h:Z

    .line 96
    .line 97
    if-nez p1, :cond_5

    .line 98
    .line 99
    iget p1, p0, LRe/z;->o:I

    .line 100
    .line 101
    add-int/2addr p1, v0

    .line 102
    iput p1, p0, LRe/z;->o:I

    .line 103
    .line 104
    iget v0, p0, LRe/z;->p:I

    .line 105
    .line 106
    if-ne p1, v0, :cond_5

    .line 107
    .line 108
    iput v1, p0, LRe/z;->o:I

    .line 109
    .line 110
    iget-object p1, p0, LRe/z;->k:Lug/b;

    .line 111
    .line 112
    int-to-long v0, v0

    .line 113
    invoke-interface {p1, v0, v1}, Lug/b;->request(J)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    if-nez v3, :cond_4

    .line 118
    .line 119
    invoke-virtual {p0}, LRe/z;->g()LOe/g;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    :cond_4
    invoke-interface {v3, p1}, LOe/h;->offer(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-nez p1, :cond_5

    .line 128
    .line 129
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 130
    .line 131
    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, p1}, LRe/z;->onError(Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_5
    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    if-nez p1, :cond_8

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_6
    invoke-virtual {p0}, LRe/z;->g()LOe/g;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-interface {v0, p1}, LOe/h;->offer(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-nez p1, :cond_7

    .line 154
    .line 155
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 156
    .line 157
    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, p1}, LRe/z;->onError(Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_7
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_8

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_8
    invoke-virtual {p0}, LRe/z;->f()V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :cond_9
    iget p1, p0, LRe/z;->c:I

    .line 176
    .line 177
    if-eq p1, v2, :cond_a

    .line 178
    .line 179
    iget-boolean p1, p0, LRe/z;->h:Z

    .line 180
    .line 181
    if-nez p1, :cond_a

    .line 182
    .line 183
    iget p1, p0, LRe/z;->o:I

    .line 184
    .line 185
    add-int/2addr p1, v0

    .line 186
    iput p1, p0, LRe/z;->o:I

    .line 187
    .line 188
    iget v0, p0, LRe/z;->p:I

    .line 189
    .line 190
    if-ne p1, v0, :cond_a

    .line 191
    .line 192
    iput v1, p0, LRe/z;->o:I

    .line 193
    .line 194
    iget-object p1, p0, LRe/z;->k:Lug/b;

    .line 195
    .line 196
    int-to-long v0, v0

    .line 197
    invoke-interface {p1, v0, v1}, Lug/b;->request(J)V

    .line 198
    .line 199
    .line 200
    :cond_a
    :goto_1
    return-void

    .line 201
    :catchall_0
    move-exception p1

    .line 202
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    iget-object v0, p0, LRe/z;->g:LZe/b;

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-static {v0, p1}, LZe/d;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0}, LRe/z;->c()V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :cond_b
    new-instance v0, LRe/y;

    .line 218
    .line 219
    iget-wide v2, p0, LRe/z;->l:J

    .line 220
    .line 221
    const-wide/16 v4, 0x1

    .line 222
    .line 223
    add-long/2addr v4, v2

    .line 224
    iput-wide v4, p0, LRe/z;->l:J

    .line 225
    .line 226
    invoke-direct {v0, p0, v2, v3}, LRe/y;-><init>(LRe/z;J)V

    .line 227
    .line 228
    .line 229
    :goto_2
    iget-object v2, p0, LRe/z;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 230
    .line 231
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    check-cast v3, [LRe/y;

    .line 236
    .line 237
    sget-object v4, LRe/z;->r:[LRe/y;

    .line 238
    .line 239
    if-ne v3, v4, :cond_c

    .line 240
    .line 241
    invoke-static {v0}, LYe/f;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_c
    array-length v4, v3

    .line 246
    add-int/lit8 v5, v4, 0x1

    .line 247
    .line 248
    new-array v5, v5, [LRe/y;

    .line 249
    .line 250
    invoke-static {v3, v1, v5, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 251
    .line 252
    .line 253
    aput-object v0, v5, v4

    .line 254
    .line 255
    :cond_d
    invoke-virtual {v2, v3, v5}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    if-eqz v4, :cond_e

    .line 260
    .line 261
    invoke-interface {p1, v0}, Lug/a;->a(LHe/f;)V

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :cond_e
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    if-eq v4, v3, :cond_d

    .line 270
    .line 271
    goto :goto_2

    .line 272
    :catchall_1
    move-exception p1

    .line 273
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 274
    .line 275
    .line 276
    iget-object v0, p0, LRe/z;->k:Lug/b;

    .line 277
    .line 278
    invoke-interface {v0}, Lug/b;->cancel()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p0, p1}, LRe/z;->onError(Ljava/lang/Throwable;)V

    .line 282
    .line 283
    .line 284
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LRe/z;->f()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final cancel()V
    .locals 4

    .line 1
    iget-boolean v0, p0, LRe/z;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LRe/z;->h:Z

    .line 7
    .line 8
    iget-object v0, p0, LRe/z;->k:Lug/b;

    .line 9
    .line 10
    invoke-interface {v0}, Lug/b;->cancel()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, LRe/z;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, [LRe/y;

    .line 20
    .line 21
    sget-object v2, LRe/z;->r:[LRe/y;

    .line 22
    .line 23
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, [LRe/y;

    .line 30
    .line 31
    if-eq v0, v2, :cond_1

    .line 32
    .line 33
    array-length v1, v0

    .line 34
    const/4 v2, 0x0

    .line 35
    :goto_0
    if-ge v2, v1, :cond_0

    .line 36
    .line 37
    aget-object v3, v0, v2

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {v3}, LYe/f;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object v0, p0, LRe/z;->g:LZe/b;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    sget-object v1, LZe/d;->a:LZe/c;

    .line 60
    .line 61
    if-eq v0, v1, :cond_1

    .line 62
    .line 63
    invoke-static {v0}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_2

    .line 71
    .line 72
    iget-object v0, p0, LRe/z;->e:LOe/g;

    .line 73
    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    invoke-interface {v0}, LOe/h;->clear()V

    .line 77
    .line 78
    .line 79
    :cond_2
    return-void
.end method

.method public final e(Lug/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, LRe/z;->k:Lug/b;

    .line 2
    .line 3
    invoke-static {v0, p1}, LYe/f;->d(Lug/b;Lug/b;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iput-object p1, p0, LRe/z;->k:Lug/b;

    .line 10
    .line 11
    iget-object v0, p0, LRe/z;->a:LHe/f;

    .line 12
    .line 13
    invoke-interface {v0, p0}, LHe/f;->e(Lug/b;)V

    .line 14
    .line 15
    .line 16
    iget-boolean v0, p0, LRe/z;->h:Z

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget v0, p0, LRe/z;->c:I

    .line 21
    .line 22
    const v1, 0x7fffffff

    .line 23
    .line 24
    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    const-wide v0, 0x7fffffffffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-interface {p1, v0, v1}, Lug/b;->request(J)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    int-to-long v0, v0

    .line 37
    invoke-interface {p1, v0, v1}, Lug/b;->request(J)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public final f()V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, LRe/z;->a:LHe/f;

    .line 4
    .line 5
    const/4 v4, 0x1

    .line 6
    :cond_0
    :goto_0
    invoke-virtual {v1}, LRe/z;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    goto/16 :goto_16

    .line 13
    .line 14
    :cond_1
    iget-object v0, v1, LRe/z;->e:LOe/g;

    .line 15
    .line 16
    iget-object v5, v1, LRe/z;->j:Ljava/util/concurrent/atomic/AtomicLong;

    .line 17
    .line 18
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 19
    .line 20
    .line 21
    move-result-wide v5

    .line 22
    const-wide v7, 0x7fffffffffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v9, v5, v7

    .line 28
    .line 29
    if-nez v9, :cond_2

    .line 30
    .line 31
    const/4 v9, 0x1

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    const/4 v9, 0x0

    .line 34
    :goto_1
    const-wide/16 v12, 0x1

    .line 35
    .line 36
    const-wide/16 v14, 0x0

    .line 37
    .line 38
    if-eqz v0, :cond_9

    .line 39
    .line 40
    move-wide/from16 v16, v14

    .line 41
    .line 42
    :goto_2
    move-wide v7, v14

    .line 43
    const/16 v18, 0x0

    .line 44
    .line 45
    :goto_3
    cmp-long v19, v5, v14

    .line 46
    .line 47
    if-eqz v19, :cond_5

    .line 48
    .line 49
    const/16 v19, 0x1

    .line 50
    .line 51
    invoke-interface {v0}, LOe/h;->poll()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v1}, LRe/z;->a()Z

    .line 56
    .line 57
    .line 58
    move-result v18

    .line 59
    if-eqz v18, :cond_3

    .line 60
    .line 61
    goto/16 :goto_16

    .line 62
    .line 63
    :cond_3
    if-nez v3, :cond_4

    .line 64
    .line 65
    move-object/from16 v18, v3

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_4
    invoke-interface {v2, v3}, LHe/f;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    add-long v16, v16, v12

    .line 72
    .line 73
    add-long/2addr v7, v12

    .line 74
    sub-long/2addr v5, v12

    .line 75
    move-object/from16 v18, v3

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_5
    const/16 v19, 0x1

    .line 79
    .line 80
    :goto_4
    cmp-long v3, v7, v14

    .line 81
    .line 82
    if-eqz v3, :cond_7

    .line 83
    .line 84
    if-eqz v9, :cond_6

    .line 85
    .line 86
    const-wide v5, 0x7fffffffffffffffL

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    goto :goto_5

    .line 92
    :cond_6
    iget-object v3, v1, LRe/z;->j:Ljava/util/concurrent/atomic/AtomicLong;

    .line 93
    .line 94
    neg-long v5, v7

    .line 95
    invoke-virtual {v3, v5, v6}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 96
    .line 97
    .line 98
    move-result-wide v5

    .line 99
    :cond_7
    :goto_5
    cmp-long v3, v5, v14

    .line 100
    .line 101
    if-eqz v3, :cond_a

    .line 102
    .line 103
    if-nez v18, :cond_8

    .line 104
    .line 105
    goto :goto_6

    .line 106
    :cond_8
    const-wide v7, 0x7fffffffffffffffL

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_9
    const/16 v19, 0x1

    .line 113
    .line 114
    move-wide/from16 v16, v14

    .line 115
    .line 116
    :cond_a
    :goto_6
    iget-boolean v0, v1, LRe/z;->f:Z

    .line 117
    .line 118
    iget-object v3, v1, LRe/z;->e:LOe/g;

    .line 119
    .line 120
    iget-object v7, v1, LRe/z;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 121
    .line 122
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    check-cast v7, [LRe/y;

    .line 127
    .line 128
    array-length v8, v7

    .line 129
    if-eqz v0, :cond_d

    .line 130
    .line 131
    if-eqz v3, :cond_b

    .line 132
    .line 133
    invoke-interface {v3}, LOe/h;->isEmpty()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_d

    .line 138
    .line 139
    :cond_b
    if-nez v8, :cond_d

    .line 140
    .line 141
    iget-object v0, v1, LRe/z;->g:LZe/b;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-static {v0}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    sget-object v3, LZe/d;->a:LZe/c;

    .line 151
    .line 152
    if-eq v0, v3, :cond_28

    .line 153
    .line 154
    if-nez v0, :cond_c

    .line 155
    .line 156
    invoke-interface {v2}, LHe/f;->onComplete()V

    .line 157
    .line 158
    .line 159
    goto/16 :goto_16

    .line 160
    .line 161
    :cond_c
    invoke-interface {v2, v0}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    goto/16 :goto_16

    .line 165
    .line 166
    :cond_d
    if-eqz v8, :cond_25

    .line 167
    .line 168
    iget-wide v10, v1, LRe/z;->m:J

    .line 169
    .line 170
    iget v0, v1, LRe/z;->n:I

    .line 171
    .line 172
    if-le v8, v0, :cond_e

    .line 173
    .line 174
    aget-object v3, v7, v0

    .line 175
    .line 176
    move-wide/from16 v20, v12

    .line 177
    .line 178
    iget-wide v12, v3, LRe/y;->a:J

    .line 179
    .line 180
    cmp-long v3, v12, v10

    .line 181
    .line 182
    if-eqz v3, :cond_13

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_e
    move-wide/from16 v20, v12

    .line 186
    .line 187
    :goto_7
    if-gt v8, v0, :cond_f

    .line 188
    .line 189
    const/4 v0, 0x0

    .line 190
    :cond_f
    const/4 v3, 0x0

    .line 191
    :goto_8
    if-ge v3, v8, :cond_12

    .line 192
    .line 193
    aget-object v12, v7, v0

    .line 194
    .line 195
    iget-wide v12, v12, LRe/y;->a:J

    .line 196
    .line 197
    cmp-long v12, v12, v10

    .line 198
    .line 199
    if-nez v12, :cond_10

    .line 200
    .line 201
    goto :goto_9

    .line 202
    :cond_10
    add-int/lit8 v0, v0, 0x1

    .line 203
    .line 204
    if-ne v0, v8, :cond_11

    .line 205
    .line 206
    const/4 v0, 0x0

    .line 207
    :cond_11
    add-int/lit8 v3, v3, 0x1

    .line 208
    .line 209
    goto :goto_8

    .line 210
    :cond_12
    :goto_9
    iput v0, v1, LRe/z;->n:I

    .line 211
    .line 212
    aget-object v3, v7, v0

    .line 213
    .line 214
    iget-wide v10, v3, LRe/y;->a:J

    .line 215
    .line 216
    iput-wide v10, v1, LRe/z;->m:J

    .line 217
    .line 218
    :cond_13
    move v3, v0

    .line 219
    const/4 v0, 0x0

    .line 220
    const/4 v10, 0x0

    .line 221
    :goto_a
    if-ge v10, v8, :cond_24

    .line 222
    .line 223
    invoke-virtual {v1}, LRe/z;->a()Z

    .line 224
    .line 225
    .line 226
    move-result v11

    .line 227
    if-eqz v11, :cond_14

    .line 228
    .line 229
    goto/16 :goto_16

    .line 230
    .line 231
    :cond_14
    aget-object v11, v7, v3

    .line 232
    .line 233
    const/4 v12, 0x0

    .line 234
    :goto_b
    invoke-virtual {v1}, LRe/z;->a()Z

    .line 235
    .line 236
    .line 237
    move-result v13

    .line 238
    if-eqz v13, :cond_15

    .line 239
    .line 240
    goto/16 :goto_16

    .line 241
    .line 242
    :cond_15
    iget-object v13, v11, LRe/y;->f:LOe/h;

    .line 243
    .line 244
    if-nez v13, :cond_16

    .line 245
    .line 246
    move-object v13, v7

    .line 247
    move-wide/from16 v22, v14

    .line 248
    .line 249
    goto/16 :goto_10

    .line 250
    .line 251
    :cond_16
    move-wide/from16 v22, v14

    .line 252
    .line 253
    :goto_c
    cmp-long v24, v5, v22

    .line 254
    .line 255
    if-eqz v24, :cond_1a

    .line 256
    .line 257
    :try_start_0
    invoke-interface {v13}, LOe/h;->poll()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 261
    if-nez v12, :cond_17

    .line 262
    .line 263
    goto :goto_d

    .line 264
    :cond_17
    invoke-interface {v2, v12}, LHe/f;->b(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1}, LRe/z;->a()Z

    .line 268
    .line 269
    .line 270
    move-result v24

    .line 271
    if-eqz v24, :cond_18

    .line 272
    .line 273
    goto/16 :goto_16

    .line 274
    .line 275
    :cond_18
    sub-long v5, v5, v20

    .line 276
    .line 277
    add-long v14, v14, v20

    .line 278
    .line 279
    goto :goto_c

    .line 280
    :catchall_0
    move-exception v0

    .line 281
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 282
    .line 283
    .line 284
    invoke-static {v11}, LYe/f;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 285
    .line 286
    .line 287
    iget-object v12, v1, LRe/z;->g:LZe/b;

    .line 288
    .line 289
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-static {v12, v0}, LZe/d;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 293
    .line 294
    .line 295
    iget-object v0, v1, LRe/z;->k:Lug/b;

    .line 296
    .line 297
    invoke-interface {v0}, Lug/b;->cancel()V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1}, LRe/z;->a()Z

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    if-eqz v0, :cond_19

    .line 305
    .line 306
    goto/16 :goto_16

    .line 307
    .line 308
    :cond_19
    invoke-virtual {v1, v11}, LRe/z;->h(LRe/y;)V

    .line 309
    .line 310
    .line 311
    add-int/lit8 v10, v10, 0x1

    .line 312
    .line 313
    move-object v13, v7

    .line 314
    move/from16 v0, v19

    .line 315
    .line 316
    goto :goto_12

    .line 317
    :cond_1a
    :goto_d
    cmp-long v13, v14, v22

    .line 318
    .line 319
    if-eqz v13, :cond_1c

    .line 320
    .line 321
    if-nez v9, :cond_1b

    .line 322
    .line 323
    iget-object v5, v1, LRe/z;->j:Ljava/util/concurrent/atomic/AtomicLong;

    .line 324
    .line 325
    move-object v13, v7

    .line 326
    neg-long v6, v14

    .line 327
    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 328
    .line 329
    .line 330
    move-result-wide v5

    .line 331
    goto :goto_e

    .line 332
    :cond_1b
    move-object v13, v7

    .line 333
    const-wide v5, 0x7fffffffffffffffL

    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    :goto_e
    invoke-virtual {v11, v14, v15}, LRe/y;->a(J)V

    .line 339
    .line 340
    .line 341
    goto :goto_f

    .line 342
    :cond_1c
    move-object v13, v7

    .line 343
    :goto_f
    cmp-long v7, v5, v22

    .line 344
    .line 345
    if-eqz v7, :cond_1e

    .line 346
    .line 347
    if-nez v12, :cond_1d

    .line 348
    .line 349
    goto :goto_10

    .line 350
    :cond_1d
    move-object v7, v13

    .line 351
    move-wide/from16 v14, v22

    .line 352
    .line 353
    goto :goto_b

    .line 354
    :cond_1e
    :goto_10
    iget-boolean v7, v11, LRe/y;->e:Z

    .line 355
    .line 356
    iget-object v12, v11, LRe/y;->f:LOe/h;

    .line 357
    .line 358
    if-eqz v7, :cond_21

    .line 359
    .line 360
    if-eqz v12, :cond_1f

    .line 361
    .line 362
    invoke-interface {v12}, LOe/h;->isEmpty()Z

    .line 363
    .line 364
    .line 365
    move-result v7

    .line 366
    if-eqz v7, :cond_21

    .line 367
    .line 368
    :cond_1f
    invoke-virtual {v1, v11}, LRe/z;->h(LRe/y;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v1}, LRe/z;->a()Z

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    if-eqz v0, :cond_20

    .line 376
    .line 377
    goto :goto_16

    .line 378
    :cond_20
    add-long v16, v16, v20

    .line 379
    .line 380
    move/from16 v0, v19

    .line 381
    .line 382
    :cond_21
    cmp-long v7, v5, v22

    .line 383
    .line 384
    if-nez v7, :cond_22

    .line 385
    .line 386
    :goto_11
    move v10, v0

    .line 387
    goto :goto_13

    .line 388
    :cond_22
    add-int/lit8 v3, v3, 0x1

    .line 389
    .line 390
    if-ne v3, v8, :cond_23

    .line 391
    .line 392
    const/4 v3, 0x0

    .line 393
    :cond_23
    :goto_12
    add-int/lit8 v10, v10, 0x1

    .line 394
    .line 395
    move-object v7, v13

    .line 396
    move-wide/from16 v14, v22

    .line 397
    .line 398
    goto/16 :goto_a

    .line 399
    .line 400
    :cond_24
    move-object v13, v7

    .line 401
    move-wide/from16 v22, v14

    .line 402
    .line 403
    goto :goto_11

    .line 404
    :goto_13
    iput v3, v1, LRe/z;->n:I

    .line 405
    .line 406
    aget-object v0, v13, v3

    .line 407
    .line 408
    iget-wide v5, v0, LRe/y;->a:J

    .line 409
    .line 410
    iput-wide v5, v1, LRe/z;->m:J

    .line 411
    .line 412
    :goto_14
    move-wide/from16 v5, v16

    .line 413
    .line 414
    goto :goto_15

    .line 415
    :cond_25
    move-wide/from16 v22, v14

    .line 416
    .line 417
    const/4 v10, 0x0

    .line 418
    goto :goto_14

    .line 419
    :goto_15
    cmp-long v0, v5, v22

    .line 420
    .line 421
    if-eqz v0, :cond_26

    .line 422
    .line 423
    iget-boolean v0, v1, LRe/z;->h:Z

    .line 424
    .line 425
    if-nez v0, :cond_26

    .line 426
    .line 427
    iget-object v0, v1, LRe/z;->k:Lug/b;

    .line 428
    .line 429
    invoke-interface {v0, v5, v6}, Lug/b;->request(J)V

    .line 430
    .line 431
    .line 432
    :cond_26
    if-eqz v10, :cond_27

    .line 433
    .line 434
    goto/16 :goto_0

    .line 435
    .line 436
    :cond_27
    neg-int v0, v4

    .line 437
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 438
    .line 439
    .line 440
    move-result v4

    .line 441
    if-nez v4, :cond_0

    .line 442
    .line 443
    :cond_28
    :goto_16
    return-void
.end method

.method public final g()LOe/g;
    .locals 2

    .line 1
    iget-object v0, p0, LRe/z;->e:LOe/g;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, LRe/z;->c:I

    .line 6
    .line 7
    const v1, 0x7fffffff

    .line 8
    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, LVe/b;

    .line 13
    .line 14
    iget v1, p0, LRe/z;->d:I

    .line 15
    .line 16
    invoke-direct {v0, v1}, LVe/b;-><init>(I)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LVe/a;

    .line 21
    .line 22
    iget v1, p0, LRe/z;->c:I

    .line 23
    .line 24
    invoke-direct {v0, v1}, LVe/a;-><init>(I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iput-object v0, p0, LRe/z;->e:LOe/g;

    .line 28
    .line 29
    :cond_1
    return-object v0
.end method

.method public final h(LRe/y;)V
    .locals 7

    .line 1
    :goto_0
    iget-object v0, p0, LRe/z;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, [LRe/y;

    .line 8
    .line 9
    array-length v2, v1

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_4

    .line 13
    :cond_0
    const/4 v3, 0x0

    .line 14
    move v4, v3

    .line 15
    :goto_1
    if-ge v4, v2, :cond_2

    .line 16
    .line 17
    aget-object v5, v1, v4

    .line 18
    .line 19
    if-ne v5, p1, :cond_1

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    const/4 v4, -0x1

    .line 26
    :goto_2
    if-gez v4, :cond_3

    .line 27
    .line 28
    goto :goto_4

    .line 29
    :cond_3
    const/4 v5, 0x1

    .line 30
    if-ne v2, v5, :cond_4

    .line 31
    .line 32
    sget-object v2, LRe/z;->q:[LRe/y;

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_4
    add-int/lit8 v6, v2, -0x1

    .line 36
    .line 37
    new-array v6, v6, [LRe/y;

    .line 38
    .line 39
    invoke-static {v1, v3, v6, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v3, v4, 0x1

    .line 43
    .line 44
    sub-int/2addr v2, v4

    .line 45
    sub-int/2addr v2, v5

    .line 46
    invoke-static {v1, v3, v6, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 47
    .line 48
    .line 49
    move-object v2, v6

    .line 50
    :cond_5
    :goto_3
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_6

    .line 55
    .line 56
    :goto_4
    return-void

    .line 57
    :cond_6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-eq v3, v1, :cond_5

    .line 62
    .line 63
    goto :goto_0
.end method

.method public final onComplete()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LRe/z;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, LRe/z;->f:Z

    .line 8
    .line 9
    invoke-virtual {p0}, LRe/z;->c()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LRe/z;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, LRe/z;->g:LZe/b;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {v0, p1}, LZe/d;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, LRe/z;->f:Z

    .line 22
    .line 23
    invoke-virtual {p0}, LRe/z;->c()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final request(J)V
    .locals 1

    .line 1
    invoke-static {p1, p2}, LYe/f;->c(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LRe/z;->j:Ljava/util/concurrent/atomic/AtomicLong;

    .line 8
    .line 9
    invoke-static {v0, p1, p2}, LFe/e;->f(Ljava/util/concurrent/atomic/AtomicLong;J)J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, LRe/z;->c()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
