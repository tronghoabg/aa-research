.class public final LTe/h;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements LJe/b;
.implements LHe/j;


# static fields
.field public static final o:[LTe/g;

.field public static final p:[LTe/g;


# instance fields
.field public final a:LHe/j;

.field public final b:LF5/d;

.field public final c:I

.field public final d:I

.field public volatile e:LOe/g;

.field public volatile f:Z

.field public final g:LZe/b;

.field public volatile h:Z

.field public final i:Ljava/util/concurrent/atomic/AtomicReference;

.field public j:LJe/b;

.field public k:J

.field public l:J

.field public m:I

.field public n:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [LTe/g;

    .line 3
    .line 4
    sput-object v1, LTe/h;->o:[LTe/g;

    .line 5
    .line 6
    new-array v0, v0, [LTe/g;

    .line 7
    .line 8
    sput-object v0, LTe/h;->p:[LTe/g;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(LHe/j;LF5/d;I)V
    .locals 1

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
    iput-object v0, p0, LTe/h;->g:LZe/b;

    .line 10
    .line 11
    iput-object p1, p0, LTe/h;->a:LHe/j;

    .line 12
    .line 13
    iput-object p2, p0, LTe/h;->b:LF5/d;

    .line 14
    .line 15
    const p1, 0x7fffffff

    .line 16
    .line 17
    .line 18
    iput p1, p0, LTe/h;->c:I

    .line 19
    .line 20
    iput p3, p0, LTe/h;->d:I

    .line 21
    .line 22
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 23
    .line 24
    sget-object p2, LTe/h;->o:[LTe/g;

    .line 25
    .line 26
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, LTe/h;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a(LJe/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LTe/h;->j:LJe/b;

    .line 2
    .line 3
    invoke-static {v0, p1}, LMe/a;->f(LJe/b;LJe/b;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, LTe/h;->j:LJe/b;

    .line 10
    .line 11
    iget-object p1, p0, LTe/h;->a:LHe/j;

    .line 12
    .line 13
    invoke-interface {p1, p0}, LHe/j;->a(LJe/b;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LTe/h;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    iget-object v0, p0, LTe/h;->b:LF5/d;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LF5/d;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, LHe/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    iget v0, p0, LTe/h;->c:I

    .line 15
    .line 16
    const v1, 0x7fffffff

    .line 17
    .line 18
    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    .line 21
    monitor-enter p0

    .line 22
    :try_start_1
    iget v0, p0, LTe/h;->n:I

    .line 23
    .line 24
    iget v1, p0, LTe/h;->c:I

    .line 25
    .line 26
    if-eq v0, v1, :cond_1

    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    iput v0, p0, LTe/h;->n:I

    .line 31
    .line 32
    monitor-exit p0

    .line 33
    goto :goto_1

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 p1, 0x0

    .line 37
    throw p1

    .line 38
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw p1

    .line 40
    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, LTe/h;->h(LHe/i;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_1
    move-exception p1

    .line 45
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, LTe/h;->j:LJe/b;

    .line 49
    .line 50
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1}, LTe/h;->onError(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final c()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, LTe/h;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, LTe/h;->g:LZe/b;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Throwable;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, LTe/h;->d()Z

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, LTe/h;->g:LZe/b;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v2, LZe/d;->a:LZe/c;

    .line 30
    .line 31
    if-eq v0, v2, :cond_1

    .line 32
    .line 33
    iget-object v2, p0, LTe/h;->a:LHe/j;

    .line 34
    .line 35
    invoke-interface {v2, v0}, LHe/j;->onError(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    return v1

    .line 39
    :cond_2
    const/4 v0, 0x0

    .line 40
    return v0
.end method

.method public final d()Z
    .locals 4

    .line 1
    iget-object v0, p0, LTe/h;->j:LJe/b;

    .line 2
    .line 3
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LTe/h;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, [LTe/g;

    .line 13
    .line 14
    sget-object v2, LTe/h;->p:[LTe/g;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eq v1, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, [LTe/g;

    .line 24
    .line 25
    if-eq v0, v2, :cond_1

    .line 26
    .line 27
    array-length v1, v0

    .line 28
    :goto_0
    if-ge v3, v1, :cond_0

    .line 29
    .line 30
    aget-object v2, v0, v3

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {v2}, LMe/a;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v0, 0x1

    .line 42
    return v0

    .line 43
    :cond_1
    return v3
.end method

.method public final dispose()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LTe/h;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LTe/h;->h:Z

    .line 7
    .line 8
    invoke-virtual {p0}, LTe/h;->d()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, LTe/h;->g:LZe/b;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    sget-object v1, LZe/d;->a:LZe/c;

    .line 26
    .line 27
    if-eq v0, v1, :cond_0

    .line 28
    .line 29
    invoke-static {v0}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final e()V
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
    invoke-virtual {p0}, LTe/h;->f()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 13

    .line 1
    iget-object v0, p0, LTe/h;->a:LHe/j;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    move v2, v1

    .line 5
    :cond_0
    :goto_0
    invoke-virtual {p0}, LTe/h;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-eqz v3, :cond_1

    .line 10
    .line 11
    goto/16 :goto_9

    .line 12
    .line 13
    :cond_1
    iget-object v3, p0, LTe/h;->e:LOe/g;

    .line 14
    .line 15
    if-eqz v3, :cond_5

    .line 16
    .line 17
    :cond_2
    :goto_1
    invoke-virtual {p0}, LTe/h;->c()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_3

    .line 22
    .line 23
    goto/16 :goto_9

    .line 24
    .line 25
    :cond_3
    invoke-interface {v3}, LOe/h;->poll()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    if-nez v4, :cond_4

    .line 30
    .line 31
    if-nez v4, :cond_2

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_4
    invoke-interface {v0, v4}, LHe/j;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_5
    :goto_2
    iget-boolean v3, p0, LTe/h;->f:Z

    .line 39
    .line 40
    iget-object v4, p0, LTe/h;->e:LOe/g;

    .line 41
    .line 42
    iget-object v5, p0, LTe/h;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    check-cast v5, [LTe/g;

    .line 49
    .line 50
    array-length v6, v5

    .line 51
    iget v7, p0, LTe/h;->c:I

    .line 52
    .line 53
    const v8, 0x7fffffff

    .line 54
    .line 55
    .line 56
    const/4 v9, 0x0

    .line 57
    if-ne v7, v8, :cond_1e

    .line 58
    .line 59
    if-eqz v3, :cond_8

    .line 60
    .line 61
    if-eqz v4, :cond_6

    .line 62
    .line 63
    invoke-interface {v4}, LOe/h;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_8

    .line 68
    .line 69
    :cond_6
    if-nez v6, :cond_8

    .line 70
    .line 71
    iget-object v1, p0, LTe/h;->g:LZe/b;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {v1}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    sget-object v2, LZe/d;->a:LZe/c;

    .line 81
    .line 82
    if-eq v1, v2, :cond_1d

    .line 83
    .line 84
    if-nez v1, :cond_7

    .line 85
    .line 86
    invoke-interface {v0}, LHe/j;->onComplete()V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_9

    .line 90
    .line 91
    :cond_7
    invoke-interface {v0, v1}, LHe/j;->onError(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_9

    .line 95
    .line 96
    :cond_8
    if-eqz v6, :cond_1a

    .line 97
    .line 98
    iget-wide v3, p0, LTe/h;->l:J

    .line 99
    .line 100
    iget v7, p0, LTe/h;->m:I

    .line 101
    .line 102
    if-le v6, v7, :cond_9

    .line 103
    .line 104
    aget-object v10, v5, v7

    .line 105
    .line 106
    iget-wide v10, v10, LTe/g;->a:J

    .line 107
    .line 108
    cmp-long v10, v10, v3

    .line 109
    .line 110
    if-eqz v10, :cond_e

    .line 111
    .line 112
    :cond_9
    if-gt v6, v7, :cond_a

    .line 113
    .line 114
    move v7, v9

    .line 115
    :cond_a
    move v10, v9

    .line 116
    :goto_3
    if-ge v10, v6, :cond_d

    .line 117
    .line 118
    aget-object v11, v5, v7

    .line 119
    .line 120
    iget-wide v11, v11, LTe/g;->a:J

    .line 121
    .line 122
    cmp-long v11, v11, v3

    .line 123
    .line 124
    if-nez v11, :cond_b

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_b
    add-int/lit8 v7, v7, 0x1

    .line 128
    .line 129
    if-ne v7, v6, :cond_c

    .line 130
    .line 131
    move v7, v9

    .line 132
    :cond_c
    add-int/lit8 v10, v10, 0x1

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_d
    :goto_4
    iput v7, p0, LTe/h;->m:I

    .line 136
    .line 137
    aget-object v3, v5, v7

    .line 138
    .line 139
    iget-wide v3, v3, LTe/g;->a:J

    .line 140
    .line 141
    iput-wide v3, p0, LTe/h;->l:J

    .line 142
    .line 143
    :cond_e
    move v3, v9

    .line 144
    move v4, v3

    .line 145
    :goto_5
    if-ge v3, v6, :cond_19

    .line 146
    .line 147
    invoke-virtual {p0}, LTe/h;->c()Z

    .line 148
    .line 149
    .line 150
    move-result v10

    .line 151
    if-eqz v10, :cond_f

    .line 152
    .line 153
    goto/16 :goto_9

    .line 154
    .line 155
    :cond_f
    aget-object v10, v5, v7

    .line 156
    .line 157
    :cond_10
    invoke-virtual {p0}, LTe/h;->c()Z

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    if-eqz v11, :cond_11

    .line 162
    .line 163
    goto/16 :goto_9

    .line 164
    .line 165
    :cond_11
    iget-object v11, v10, LTe/g;->d:LOe/h;

    .line 166
    .line 167
    if-nez v11, :cond_12

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_12
    :try_start_0
    invoke-interface {v11}, LOe/h;->poll()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    if-nez v12, :cond_16

    .line 175
    .line 176
    if-nez v12, :cond_10

    .line 177
    .line 178
    :goto_6
    iget-boolean v11, v10, LTe/g;->c:Z

    .line 179
    .line 180
    iget-object v12, v10, LTe/g;->d:LOe/h;

    .line 181
    .line 182
    if-eqz v11, :cond_15

    .line 183
    .line 184
    if-eqz v12, :cond_13

    .line 185
    .line 186
    invoke-interface {v12}, LOe/h;->isEmpty()Z

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    if-eqz v11, :cond_15

    .line 191
    .line 192
    :cond_13
    invoke-virtual {p0, v10}, LTe/h;->g(LTe/g;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0}, LTe/h;->c()Z

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    if-eqz v4, :cond_14

    .line 200
    .line 201
    goto :goto_9

    .line 202
    :cond_14
    move v4, v1

    .line 203
    :cond_15
    add-int/lit8 v7, v7, 0x1

    .line 204
    .line 205
    if-ne v7, v6, :cond_18

    .line 206
    .line 207
    move v7, v9

    .line 208
    goto :goto_7

    .line 209
    :cond_16
    invoke-interface {v0, v12}, LHe/j;->b(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, LTe/h;->c()Z

    .line 213
    .line 214
    .line 215
    move-result v12

    .line 216
    if-eqz v12, :cond_12

    .line 217
    .line 218
    goto :goto_9

    .line 219
    :catchall_0
    move-exception v4

    .line 220
    invoke-static {v4}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v10}, LMe/a;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 224
    .line 225
    .line 226
    iget-object v11, p0, LTe/h;->g:LZe/b;

    .line 227
    .line 228
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-static {v11, v4}, LZe/d;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0}, LTe/h;->c()Z

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    if-eqz v4, :cond_17

    .line 239
    .line 240
    goto :goto_9

    .line 241
    :cond_17
    invoke-virtual {p0, v10}, LTe/h;->g(LTe/g;)V

    .line 242
    .line 243
    .line 244
    add-int/lit8 v3, v3, 0x1

    .line 245
    .line 246
    move v4, v1

    .line 247
    :cond_18
    :goto_7
    add-int/2addr v3, v1

    .line 248
    goto :goto_5

    .line 249
    :cond_19
    iput v7, p0, LTe/h;->m:I

    .line 250
    .line 251
    aget-object v3, v5, v7

    .line 252
    .line 253
    iget-wide v5, v3, LTe/g;->a:J

    .line 254
    .line 255
    iput-wide v5, p0, LTe/h;->l:J

    .line 256
    .line 257
    move v9, v4

    .line 258
    :cond_1a
    if-eqz v9, :cond_1c

    .line 259
    .line 260
    iget v3, p0, LTe/h;->c:I

    .line 261
    .line 262
    if-ne v3, v8, :cond_1b

    .line 263
    .line 264
    goto/16 :goto_0

    .line 265
    .line 266
    :cond_1b
    monitor-enter p0

    .line 267
    const/4 v0, 0x0

    .line 268
    :try_start_1
    throw v0

    .line 269
    :goto_8
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 270
    throw v0

    .line 271
    :catchall_1
    move-exception v0

    .line 272
    goto :goto_8

    .line 273
    :cond_1c
    neg-int v2, v2

    .line 274
    invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    if-nez v2, :cond_0

    .line 279
    .line 280
    :cond_1d
    :goto_9
    return-void

    .line 281
    :cond_1e
    monitor-enter p0

    .line 282
    const/4 v0, 0x0

    .line 283
    :try_start_2
    throw v0

    .line 284
    :goto_a
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 285
    throw v0

    .line 286
    :catchall_2
    move-exception v0

    .line 287
    goto :goto_a
.end method

.method public final g(LTe/g;)V
    .locals 7

    .line 1
    :goto_0
    iget-object v0, p0, LTe/h;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, [LTe/g;

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
    sget-object v2, LTe/h;->o:[LTe/g;

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_4
    add-int/lit8 v6, v2, -0x1

    .line 36
    .line 37
    new-array v6, v6, [LTe/g;

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

.method public final h(LHe/i;)V
    .locals 6

    .line 1
    instance-of v0, p1, Ljava/util/concurrent/Callable;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_7

    .line 5
    .line 6
    check-cast p1, Ljava/util/concurrent/Callable;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    const v2, 0x7fffffff

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, LTe/h;->a:LHe/j;

    .line 32
    .line 33
    invoke-interface {v0, p1}, LHe/j;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_5

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object v0, p0, LTe/h;->e:LOe/g;

    .line 44
    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    iget v0, p0, LTe/h;->c:I

    .line 48
    .line 49
    if-ne v0, v2, :cond_2

    .line 50
    .line 51
    new-instance v0, LVe/b;

    .line 52
    .line 53
    iget v1, p0, LTe/h;->d:I

    .line 54
    .line 55
    invoke-direct {v0, v1}, LVe/b;-><init>(I)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    new-instance v0, LVe/a;

    .line 60
    .line 61
    iget v1, p0, LTe/h;->c:I

    .line 62
    .line 63
    invoke-direct {v0, v1}, LVe/a;-><init>(I)V

    .line 64
    .line 65
    .line 66
    :goto_0
    iput-object v0, p0, LTe/h;->e:LOe/g;

    .line 67
    .line 68
    :cond_3
    invoke-interface {v0, p1}, LOe/h;->offer(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-nez p1, :cond_4

    .line 73
    .line 74
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string v0, "Scalar queue full?!"

    .line 77
    .line 78
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p1}, LTe/h;->onError(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_5
    invoke-virtual {p0}, LTe/h;->f()V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :catchall_0
    move-exception p1

    .line 97
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, LTe/h;->g:LZe/b;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {v0, p1}, LZe/d;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, LTe/h;->e()V

    .line 109
    .line 110
    .line 111
    :goto_1
    iget p1, p0, LTe/h;->c:I

    .line 112
    .line 113
    if-ne p1, v2, :cond_6

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_6
    monitor-enter p0

    .line 117
    const/4 p1, 0x0

    .line 118
    :try_start_1
    throw p1

    .line 119
    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 120
    throw p1

    .line 121
    :catchall_1
    move-exception p1

    .line 122
    goto :goto_2

    .line 123
    :cond_7
    new-instance v0, LTe/g;

    .line 124
    .line 125
    iget-wide v2, p0, LTe/h;->k:J

    .line 126
    .line 127
    const-wide/16 v4, 0x1

    .line 128
    .line 129
    add-long/2addr v4, v2

    .line 130
    iput-wide v4, p0, LTe/h;->k:J

    .line 131
    .line 132
    invoke-direct {v0, p0, v2, v3}, LTe/g;-><init>(LTe/h;J)V

    .line 133
    .line 134
    .line 135
    :goto_3
    iget-object v2, p0, LTe/h;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    check-cast v3, [LTe/g;

    .line 142
    .line 143
    sget-object v4, LTe/h;->p:[LTe/g;

    .line 144
    .line 145
    if-ne v3, v4, :cond_8

    .line 146
    .line 147
    invoke-static {v0}, LMe/a;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_8
    array-length v4, v3

    .line 152
    add-int/lit8 v5, v4, 0x1

    .line 153
    .line 154
    new-array v5, v5, [LTe/g;

    .line 155
    .line 156
    invoke-static {v3, v1, v5, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 157
    .line 158
    .line 159
    aput-object v0, v5, v4

    .line 160
    .line 161
    :cond_9
    invoke-virtual {v2, v3, v5}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_a

    .line 166
    .line 167
    invoke-virtual {p1, v0}, LHe/i;->c(LHe/j;)V

    .line 168
    .line 169
    .line 170
    :goto_4
    return-void

    .line 171
    :cond_a
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    if-eq v4, v3, :cond_9

    .line 176
    .line 177
    goto :goto_3
.end method

.method public final onComplete()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LTe/h;->f:Z

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
    iput-boolean v0, p0, LTe/h;->f:Z

    .line 8
    .line 9
    invoke-virtual {p0}, LTe/h;->e()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LTe/h;->f:Z

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
    iget-object v0, p0, LTe/h;->g:LZe/b;

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
    iput-boolean p1, p0, LTe/h;->f:Z

    .line 22
    .line 23
    invoke-virtual {p0}, LTe/h;->e()V

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
