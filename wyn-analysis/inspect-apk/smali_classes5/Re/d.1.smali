.class public final LRe/d;
.super LRe/b;
.source "SourceFile"


# instance fields
.field public final m:LHe/f;

.field public final n:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(LHe/f;LJ9/w;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, LRe/b;-><init>(LJ9/w;I)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LRe/d;->m:LHe/f;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LRe/d;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, LRe/b;->j:LZe/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p1}, LZe/d;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, LRe/b;->e:Lug/b;

    .line 13
    .line 14
    invoke-interface {p1}, Lug/b;->cancel()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    invoke-static {v0}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v0, p0, LRe/d;->m:LHe/f;

    .line 28
    .line 29
    invoke-interface {v0, p1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void

    .line 33
    :cond_1
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iget-object v2, p0, LRe/d;->m:LHe/f;

    .line 16
    .line 17
    invoke-interface {v2, p1}, LHe/f;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object p1, p0, LRe/b;->j:LZe/b;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {v2, p1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    return-void
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LRe/b;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LRe/b;->i:Z

    .line 7
    .line 8
    iget-object v0, p0, LRe/b;->a:LRe/e;

    .line 9
    .line 10
    invoke-virtual {v0}, LRe/e;->cancel()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, LRe/b;->e:Lug/b;

    .line 14
    .line 15
    invoke-interface {v0}, Lug/b;->cancel()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 7

    .line 1
    iget-object v0, p0, LRe/d;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_a

    .line 8
    .line 9
    :cond_0
    :goto_0
    iget-boolean v0, p0, LRe/b;->i:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    goto/16 :goto_4

    .line 14
    .line 15
    :cond_1
    iget-boolean v0, p0, LRe/b;->k:Z

    .line 16
    .line 17
    if-nez v0, :cond_9

    .line 18
    .line 19
    iget-boolean v0, p0, LRe/b;->h:Z

    .line 20
    .line 21
    :try_start_0
    iget-object v1, p0, LRe/b;->g:LOe/h;

    .line 22
    .line 23
    invoke-interface {v1}, LOe/h;->poll()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x1

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    move v4, v3

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    move v4, v2

    .line 34
    :goto_1
    if-eqz v0, :cond_3

    .line 35
    .line 36
    if-eqz v4, :cond_3

    .line 37
    .line 38
    iget-object v0, p0, LRe/d;->m:LHe/f;

    .line 39
    .line 40
    invoke-interface {v0}, LHe/f;->onComplete()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_3
    if-nez v4, :cond_9

    .line 45
    .line 46
    :try_start_1
    iget-object v0, p0, LRe/b;->b:LJ9/w;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, LJ9/w;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lug/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 53
    .line 54
    iget v1, p0, LRe/b;->l:I

    .line 55
    .line 56
    if-eq v1, v3, :cond_5

    .line 57
    .line 58
    iget v1, p0, LRe/b;->f:I

    .line 59
    .line 60
    add-int/2addr v1, v3

    .line 61
    iget v4, p0, LRe/b;->d:I

    .line 62
    .line 63
    if-ne v1, v4, :cond_4

    .line 64
    .line 65
    iput v2, p0, LRe/b;->f:I

    .line 66
    .line 67
    iget-object v4, p0, LRe/b;->e:Lug/b;

    .line 68
    .line 69
    int-to-long v5, v1

    .line 70
    invoke-interface {v4, v5, v6}, Lug/b;->request(J)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    iput v1, p0, LRe/b;->f:I

    .line 75
    .line 76
    :cond_5
    :goto_2
    instance-of v1, v0, Ljava/util/concurrent/Callable;

    .line 77
    .line 78
    if-eqz v1, :cond_8

    .line 79
    .line 80
    check-cast v0, Ljava/util/concurrent/Callable;

    .line 81
    .line 82
    :try_start_2
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 86
    if-nez v0, :cond_6

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_6
    iget-object v1, p0, LRe/b;->a:LRe/e;

    .line 90
    .line 91
    iget-boolean v1, v1, LRe/e;->g:Z

    .line 92
    .line 93
    if-eqz v1, :cond_7

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_0

    .line 100
    .line 101
    invoke-virtual {p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_0

    .line 106
    .line 107
    iget-object v1, p0, LRe/d;->m:LHe/f;

    .line 108
    .line 109
    invoke-interface {v1, v0}, LHe/f;->b(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v3, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_0

    .line 117
    .line 118
    iget-object v0, p0, LRe/d;->m:LHe/f;

    .line 119
    .line 120
    iget-object v1, p0, LRe/b;->j:LZe/b;

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-static {v1}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-interface {v0, v1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_7
    iput-boolean v3, p0, LRe/b;->k:Z

    .line 134
    .line 135
    iget-object v1, p0, LRe/b;->a:LRe/e;

    .line 136
    .line 137
    new-instance v2, LRe/g;

    .line 138
    .line 139
    invoke-direct {v2, v1, v0}, LRe/g;-><init>(LHe/f;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v2}, LRe/e;->g(Lug/b;)V

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :catchall_0
    move-exception v0

    .line 147
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    iget-object v1, p0, LRe/b;->e:Lug/b;

    .line 151
    .line 152
    invoke-interface {v1}, Lug/b;->cancel()V

    .line 153
    .line 154
    .line 155
    iget-object v1, p0, LRe/b;->j:LZe/b;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-static {v1, v0}, LZe/d;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 161
    .line 162
    .line 163
    iget-object v0, p0, LRe/d;->m:LHe/f;

    .line 164
    .line 165
    iget-object v1, p0, LRe/b;->j:LZe/b;

    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-static {v1}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-interface {v0, v1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_8
    iput-boolean v3, p0, LRe/b;->k:Z

    .line 179
    .line 180
    iget-object v1, p0, LRe/b;->a:LRe/e;

    .line 181
    .line 182
    invoke-interface {v0, v1}, Lug/a;->a(LHe/f;)V

    .line 183
    .line 184
    .line 185
    goto :goto_3

    .line 186
    :catchall_1
    move-exception v0

    .line 187
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    iget-object v1, p0, LRe/b;->e:Lug/b;

    .line 191
    .line 192
    invoke-interface {v1}, Lug/b;->cancel()V

    .line 193
    .line 194
    .line 195
    iget-object v1, p0, LRe/b;->j:LZe/b;

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-static {v1, v0}, LZe/d;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 201
    .line 202
    .line 203
    iget-object v0, p0, LRe/d;->m:LHe/f;

    .line 204
    .line 205
    iget-object v1, p0, LRe/b;->j:LZe/b;

    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-static {v1}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-interface {v0, v1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :catchall_2
    move-exception v0

    .line 219
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 220
    .line 221
    .line 222
    iget-object v1, p0, LRe/b;->e:Lug/b;

    .line 223
    .line 224
    invoke-interface {v1}, Lug/b;->cancel()V

    .line 225
    .line 226
    .line 227
    iget-object v1, p0, LRe/b;->j:LZe/b;

    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-static {v1, v0}, LZe/d;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 233
    .line 234
    .line 235
    iget-object v0, p0, LRe/d;->m:LHe/f;

    .line 236
    .line 237
    iget-object v1, p0, LRe/b;->j:LZe/b;

    .line 238
    .line 239
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-static {v1}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-interface {v0, v1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :cond_9
    :goto_3
    iget-object v0, p0, LRe/d;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-nez v0, :cond_0

    .line 257
    .line 258
    :cond_a
    :goto_4
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    iget-object v0, p0, LRe/d;->m:LHe/f;

    .line 2
    .line 3
    invoke-interface {v0, p0}, LHe/f;->e(Lug/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, LRe/b;->j:LZe/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p1}, LZe/d;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, LRe/b;->a:LRe/e;

    .line 13
    .line 14
    invoke-virtual {p1}, LRe/e;->cancel()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, LRe/d;->m:LHe/f;

    .line 31
    .line 32
    invoke-interface {v0, p1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void

    .line 36
    :cond_1
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final request(J)V
    .locals 1

    .line 1
    iget-object v0, p0, LRe/b;->a:LRe/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LRe/e;->request(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
