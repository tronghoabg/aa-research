.class public final LRe/A;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements LHe/f;
.implements Lug/b;


# instance fields
.field public final a:LHe/f;

.field public final b:I

.field public final c:Ljava/util/concurrent/atomic/AtomicLong;

.field public final d:LJe/a;

.field public final e:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final f:LZe/b;

.field public final g:LLe/c;

.field public final h:Ljava/util/concurrent/atomic/AtomicReference;

.field public i:Lug/b;

.field public volatile j:Z


# direct methods
.method public constructor <init>(LHe/f;LLe/c;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LRe/A;->a:LHe/f;

    .line 5
    .line 6
    iput-object p2, p0, LRe/A;->g:LLe/c;

    .line 7
    .line 8
    iput p3, p0, LRe/A;->b:I

    .line 9
    .line 10
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LRe/A;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 16
    .line 17
    new-instance p1, LJe/a;

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    invoke-direct {p1, p2}, LJe/a;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, LRe/A;->d:LJe/a;

    .line 24
    .line 25
    new-instance p1, LZe/b;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, LRe/A;->f:LZe/b;

    .line 31
    .line 32
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 33
    .line 34
    const/4 p2, 0x1

    .line 35
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, LRe/A;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 39
    .line 40
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, LRe/A;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, LRe/A;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LVe/b;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, LVe/b;->clear()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, LRe/A;->g:LLe/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LLe/c;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "The mapper returned a null MaybeSource"

    .line 8
    .line 9
    invoke-static {p1, v0}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast p1, LHe/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    iget-object v0, p0, LRe/A;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 17
    .line 18
    .line 19
    new-instance v0, LSe/c;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {v0, p0, v1}, LSe/c;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;I)V

    .line 23
    .line 24
    .line 25
    iget-boolean v1, p0, LRe/A;->j:Z

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, LRe/A;->d:LJe/a;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, LJe/a;->a(LJe/b;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1, v0}, LHe/g;->b(LHe/h;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, LRe/A;->i:Lug/b;

    .line 46
    .line 47
    invoke-interface {v0}, Lug/b;->cancel()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1}, LRe/A;->onError(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
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
    invoke-virtual {p0}, LRe/A;->f()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LRe/A;->j:Z

    .line 3
    .line 4
    iget-object v0, p0, LRe/A;->i:Lug/b;

    .line 5
    .line 6
    invoke-interface {v0}, Lug/b;->cancel()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LRe/A;->d:LJe/a;

    .line 10
    .line 11
    invoke-virtual {v0}, LJe/a;->dispose()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final e(Lug/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, LRe/A;->i:Lug/b;

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
    iput-object p1, p0, LRe/A;->i:Lug/b;

    .line 10
    .line 11
    iget-object v0, p0, LRe/A;->a:LHe/f;

    .line 12
    .line 13
    invoke-interface {v0, p0}, LHe/f;->e(Lug/b;)V

    .line 14
    .line 15
    .line 16
    const v0, 0x7fffffff

    .line 17
    .line 18
    .line 19
    iget v1, p0, LRe/A;->b:I

    .line 20
    .line 21
    if-ne v1, v0, :cond_0

    .line 22
    .line 23
    const-wide v0, 0x7fffffffffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-interface {p1, v0, v1}, Lug/b;->request(J)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    int-to-long v0, v1

    .line 33
    invoke-interface {p1, v0, v1}, Lug/b;->request(J)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public final f()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LRe/A;->a:LHe/f;

    .line 4
    .line 5
    iget-object v2, v0, LRe/A;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 6
    .line 7
    iget-object v3, v0, LRe/A;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    move v5, v4

    .line 11
    :cond_0
    iget-object v6, v0, LRe/A;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    .line 13
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 14
    .line 15
    .line 16
    move-result-wide v6

    .line 17
    const-wide/16 v8, 0x0

    .line 18
    .line 19
    move-wide v10, v8

    .line 20
    :goto_0
    cmp-long v12, v10, v6

    .line 21
    .line 22
    const/4 v13, 0x0

    .line 23
    if-eqz v12, :cond_9

    .line 24
    .line 25
    iget-boolean v14, v0, LRe/A;->j:Z

    .line 26
    .line 27
    if-eqz v14, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, LRe/A;->a()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object v14, v0, LRe/A;->f:LZe/b;

    .line 34
    .line 35
    invoke-virtual {v14}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v14

    .line 39
    check-cast v14, Ljava/lang/Throwable;

    .line 40
    .line 41
    if-eqz v14, :cond_2

    .line 42
    .line 43
    iget-object v2, v0, LRe/A;->f:LZe/b;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v2}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v0}, LRe/A;->a()V

    .line 53
    .line 54
    .line 55
    invoke-interface {v1, v2}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 60
    .line 61
    .line 62
    move-result v14

    .line 63
    if-nez v14, :cond_3

    .line 64
    .line 65
    move v14, v4

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    move v14, v13

    .line 68
    :goto_1
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v15

    .line 72
    check-cast v15, LVe/b;

    .line 73
    .line 74
    if-eqz v15, :cond_4

    .line 75
    .line 76
    invoke-virtual {v15}, LVe/b;->poll()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v15

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    const/4 v15, 0x0

    .line 82
    :goto_2
    if-nez v15, :cond_5

    .line 83
    .line 84
    move/from16 v16, v4

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_5
    move/from16 v16, v13

    .line 88
    .line 89
    :goto_3
    if-eqz v14, :cond_7

    .line 90
    .line 91
    if-eqz v16, :cond_7

    .line 92
    .line 93
    iget-object v2, v0, LRe/A;->f:LZe/b;

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-static {v2}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    if-eqz v2, :cond_6

    .line 103
    .line 104
    invoke-interface {v1, v2}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_6
    invoke-interface {v1}, LHe/f;->onComplete()V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_7
    if-eqz v16, :cond_8

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_8
    invoke-interface {v1, v15}, LHe/f;->b(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    const-wide/16 v12, 0x1

    .line 119
    .line 120
    add-long/2addr v10, v12

    .line 121
    goto :goto_0

    .line 122
    :cond_9
    :goto_4
    if-nez v12, :cond_10

    .line 123
    .line 124
    iget-boolean v6, v0, LRe/A;->j:Z

    .line 125
    .line 126
    if-eqz v6, :cond_a

    .line 127
    .line 128
    invoke-virtual {v0}, LRe/A;->a()V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_a
    iget-object v6, v0, LRe/A;->f:LZe/b;

    .line 133
    .line 134
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    check-cast v6, Ljava/lang/Throwable;

    .line 139
    .line 140
    if-eqz v6, :cond_b

    .line 141
    .line 142
    iget-object v2, v0, LRe/A;->f:LZe/b;

    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-static {v2}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v0}, LRe/A;->a()V

    .line 152
    .line 153
    .line 154
    invoke-interface {v1, v2}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_b
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    if-nez v6, :cond_c

    .line 163
    .line 164
    move v6, v4

    .line 165
    goto :goto_5

    .line 166
    :cond_c
    move v6, v13

    .line 167
    :goto_5
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    check-cast v7, LVe/b;

    .line 172
    .line 173
    if-eqz v7, :cond_d

    .line 174
    .line 175
    invoke-virtual {v7}, LVe/b;->isEmpty()Z

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    if-eqz v7, :cond_e

    .line 180
    .line 181
    :cond_d
    move v13, v4

    .line 182
    :cond_e
    if-eqz v6, :cond_10

    .line 183
    .line 184
    if-eqz v13, :cond_10

    .line 185
    .line 186
    iget-object v2, v0, LRe/A;->f:LZe/b;

    .line 187
    .line 188
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-static {v2}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    if-eqz v2, :cond_f

    .line 196
    .line 197
    invoke-interface {v1, v2}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :cond_f
    invoke-interface {v1}, LHe/f;->onComplete()V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :cond_10
    cmp-long v6, v10, v8

    .line 206
    .line 207
    if-eqz v6, :cond_11

    .line 208
    .line 209
    iget-object v6, v0, LRe/A;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 210
    .line 211
    invoke-static {v6, v10, v11}, LFe/e;->P(Ljava/util/concurrent/atomic/AtomicLong;J)V

    .line 212
    .line 213
    .line 214
    iget v6, v0, LRe/A;->b:I

    .line 215
    .line 216
    const v7, 0x7fffffff

    .line 217
    .line 218
    .line 219
    if-eq v6, v7, :cond_11

    .line 220
    .line 221
    iget-object v6, v0, LRe/A;->i:Lug/b;

    .line 222
    .line 223
    invoke-interface {v6, v10, v11}, Lug/b;->request(J)V

    .line 224
    .line 225
    .line 226
    :cond_11
    neg-int v5, v5

    .line 227
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    if-nez v5, :cond_0

    .line 232
    .line 233
    return-void
.end method

.method public final g()LVe/b;
    .locals 3

    .line 1
    :goto_0
    iget-object v0, p0, LRe/A;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, LVe/b;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    new-instance v1, LVe/b;

    .line 13
    .line 14
    sget v2, LHe/c;->a:I

    .line 15
    .line 16
    invoke-direct {v1, v2}, LVe/b;-><init>(I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    goto :goto_0
.end method

.method public final onComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, LRe/A;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LRe/A;->c()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LRe/A;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LRe/A;->f:LZe/b;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p1}, LZe/d;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, LRe/A;->d:LJe/a;

    .line 18
    .line 19
    invoke-virtual {p1}, LJe/a;->dispose()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, LRe/A;->c()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
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
    iget-object v0, p0, LRe/A;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 8
    .line 9
    invoke-static {v0, p1, p2}, LFe/e;->f(Ljava/util/concurrent/atomic/AtomicLong;J)J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, LRe/A;->c()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
