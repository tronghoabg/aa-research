.class public final LRe/c;
.super LRe/b;
.source "SourceFile"


# instance fields
.field public final m:LHe/f;

.field public final n:Z


# direct methods
.method public constructor <init>(LHe/f;LJ9/w;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, LRe/b;-><init>(LJ9/w;I)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LRe/c;->m:LHe/f;

    .line 5
    .line 6
    iput-boolean p4, p0, LRe/c;->n:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

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
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-boolean p1, p0, LRe/c;->n:Z

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, LRe/b;->e:Lug/b;

    .line 17
    .line 18
    invoke-interface {p1}, Lug/b;->cancel()V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, LRe/b;->h:Z

    .line 23
    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    iput-boolean p1, p0, LRe/b;->k:Z

    .line 26
    .line 27
    invoke-virtual {p0}, LRe/c;->f()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LRe/c;->m:LHe/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LHe/f;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
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
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_c

    .line 6
    .line 7
    :cond_0
    :goto_0
    iget-boolean v0, p0, LRe/b;->i:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    goto/16 :goto_4

    .line 12
    .line 13
    :cond_1
    iget-boolean v0, p0, LRe/b;->k:Z

    .line 14
    .line 15
    if-nez v0, :cond_b

    .line 16
    .line 17
    iget-boolean v0, p0, LRe/b;->h:Z

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-boolean v1, p0, LRe/c;->n:Z

    .line 22
    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    iget-object v1, p0, LRe/b;->j:LZe/b;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/Throwable;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    iget-object v0, p0, LRe/c;->m:LHe/f;

    .line 36
    .line 37
    iget-object v1, p0, LRe/b;->j:LZe/b;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v0, v1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    :try_start_0
    iget-object v1, p0, LRe/b;->g:LOe/h;

    .line 51
    .line 52
    invoke-interface {v1}, LOe/h;->poll()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 56
    const/4 v2, 0x0

    .line 57
    const/4 v3, 0x1

    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    move v4, v3

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    move v4, v2

    .line 63
    :goto_1
    if-eqz v0, :cond_5

    .line 64
    .line 65
    if-eqz v4, :cond_5

    .line 66
    .line 67
    iget-object v0, p0, LRe/b;->j:LZe/b;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    iget-object v1, p0, LRe/c;->m:LHe/f;

    .line 79
    .line 80
    invoke-interface {v1, v0}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_4
    iget-object v0, p0, LRe/c;->m:LHe/f;

    .line 85
    .line 86
    invoke-interface {v0}, LHe/f;->onComplete()V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_5
    if-nez v4, :cond_b

    .line 91
    .line 92
    :try_start_1
    iget-object v0, p0, LRe/b;->b:LJ9/w;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, LJ9/w;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Lug/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    .line 100
    iget v1, p0, LRe/b;->l:I

    .line 101
    .line 102
    if-eq v1, v3, :cond_7

    .line 103
    .line 104
    iget v1, p0, LRe/b;->f:I

    .line 105
    .line 106
    add-int/2addr v1, v3

    .line 107
    iget v4, p0, LRe/b;->d:I

    .line 108
    .line 109
    if-ne v1, v4, :cond_6

    .line 110
    .line 111
    iput v2, p0, LRe/b;->f:I

    .line 112
    .line 113
    iget-object v2, p0, LRe/b;->e:Lug/b;

    .line 114
    .line 115
    int-to-long v4, v1

    .line 116
    invoke-interface {v2, v4, v5}, Lug/b;->request(J)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_6
    iput v1, p0, LRe/b;->f:I

    .line 121
    .line 122
    :cond_7
    :goto_2
    instance-of v1, v0, Ljava/util/concurrent/Callable;

    .line 123
    .line 124
    if-eqz v1, :cond_a

    .line 125
    .line 126
    check-cast v0, Ljava/util/concurrent/Callable;

    .line 127
    .line 128
    :try_start_2
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 132
    if-nez v0, :cond_8

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_8
    iget-object v1, p0, LRe/b;->a:LRe/e;

    .line 136
    .line 137
    iget-boolean v1, v1, LRe/e;->g:Z

    .line 138
    .line 139
    if-eqz v1, :cond_9

    .line 140
    .line 141
    iget-object v1, p0, LRe/c;->m:LHe/f;

    .line 142
    .line 143
    invoke-interface {v1, v0}, LHe/f;->b(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    goto/16 :goto_0

    .line 147
    .line 148
    :cond_9
    iput-boolean v3, p0, LRe/b;->k:Z

    .line 149
    .line 150
    iget-object v1, p0, LRe/b;->a:LRe/e;

    .line 151
    .line 152
    new-instance v2, LRe/g;

    .line 153
    .line 154
    invoke-direct {v2, v1, v0}, LRe/g;-><init>(LHe/f;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v2}, LRe/e;->g(Lug/b;)V

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    iget-object v1, p0, LRe/b;->e:Lug/b;

    .line 166
    .line 167
    invoke-interface {v1}, Lug/b;->cancel()V

    .line 168
    .line 169
    .line 170
    iget-object v1, p0, LRe/b;->j:LZe/b;

    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-static {v1, v0}, LZe/d;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 176
    .line 177
    .line 178
    iget-object v0, p0, LRe/c;->m:LHe/f;

    .line 179
    .line 180
    iget-object v1, p0, LRe/b;->j:LZe/b;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-static {v1}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-interface {v0, v1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_a
    iput-boolean v3, p0, LRe/b;->k:Z

    .line 194
    .line 195
    iget-object v1, p0, LRe/b;->a:LRe/e;

    .line 196
    .line 197
    invoke-interface {v0, v1}, Lug/a;->a(LHe/f;)V

    .line 198
    .line 199
    .line 200
    goto :goto_3

    .line 201
    :catchall_1
    move-exception v0

    .line 202
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    iget-object v1, p0, LRe/b;->e:Lug/b;

    .line 206
    .line 207
    invoke-interface {v1}, Lug/b;->cancel()V

    .line 208
    .line 209
    .line 210
    iget-object v1, p0, LRe/b;->j:LZe/b;

    .line 211
    .line 212
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-static {v1, v0}, LZe/d;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 216
    .line 217
    .line 218
    iget-object v0, p0, LRe/c;->m:LHe/f;

    .line 219
    .line 220
    iget-object v1, p0, LRe/b;->j:LZe/b;

    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-static {v1}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-interface {v0, v1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :catchall_2
    move-exception v0

    .line 234
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 235
    .line 236
    .line 237
    iget-object v1, p0, LRe/b;->e:Lug/b;

    .line 238
    .line 239
    invoke-interface {v1}, Lug/b;->cancel()V

    .line 240
    .line 241
    .line 242
    iget-object v1, p0, LRe/b;->j:LZe/b;

    .line 243
    .line 244
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-static {v1, v0}, LZe/d;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 248
    .line 249
    .line 250
    iget-object v0, p0, LRe/c;->m:LHe/f;

    .line 251
    .line 252
    iget-object v1, p0, LRe/b;->j:LZe/b;

    .line 253
    .line 254
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-static {v1}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-interface {v0, v1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :cond_b
    :goto_3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-nez v0, :cond_0

    .line 270
    .line 271
    :cond_c
    :goto_4
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    iget-object v0, p0, LRe/c;->m:LHe/f;

    .line 2
    .line 3
    invoke-interface {v0, p0}, LHe/f;->e(Lug/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

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
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, LRe/b;->h:Z

    .line 14
    .line 15
    invoke-virtual {p0}, LRe/c;->f()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
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
