.class public final LHf/x0;
.super LIf/b;
.source "SourceFile"

# interfaces
.implements LHf/c0;
.implements LHf/d;
.implements LIf/w;


# static fields
.field public static final synthetic f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _state$volatile:Ljava/lang/Object;

.field public e:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "_state$volatile"

    .line 4
    .line 5
    const-class v2, LHf/x0;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, LHf/x0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LHf/x0;->_state$volatile:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljf/h;ILGf/a;)LHf/l;
    .locals 1

    .line 1
    if-ltz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-ge p2, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, -0x2

    .line 8
    if-ne p2, v0, :cond_1

    .line 9
    .line 10
    :goto_0
    sget-object v0, LGf/a;->b:LGf/a;

    .line 11
    .line 12
    if-ne p3, v0, :cond_1

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    invoke-static {p0, p1, p2, p3}, LHf/k0;->t(LHf/g0;Ljf/h;ILGf/a;)LHf/l;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public final b(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LHf/x0;->j(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    return p1
.end method

.method public final c()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "MutableStateFlow.resetReplayCache is not supported"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final collect(LHf/m;Ljf/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, LHf/w0;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, LHf/w0;

    .line 13
    .line 14
    iget v4, v3, LHf/w0;->h:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, LHf/w0;->h:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, LHf/w0;

    .line 27
    .line 28
    invoke-direct {v3, v1, v2}, LHf/w0;-><init>(LHf/x0;Ljf/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, LHf/w0;->f:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, Lkf/a;->a:Lkf/a;

    .line 34
    .line 35
    iget v5, v3, LHf/w0;->h:I

    .line 36
    .line 37
    const/4 v7, 0x3

    .line 38
    const/4 v8, 0x2

    .line 39
    const/4 v9, 0x1

    .line 40
    if-eqz v5, :cond_4

    .line 41
    .line 42
    if-eq v5, v9, :cond_3

    .line 43
    .line 44
    if-eq v5, v8, :cond_2

    .line 45
    .line 46
    if-ne v5, v7, :cond_1

    .line 47
    .line 48
    iget-object v0, v3, LHf/w0;->e:Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v5, v3, LHf/w0;->d:LEf/m0;

    .line 51
    .line 52
    iget-object v10, v3, LHf/w0;->c:LHf/y0;

    .line 53
    .line 54
    iget-object v11, v3, LHf/w0;->b:LHf/m;

    .line 55
    .line 56
    iget-object v12, v3, LHf/w0;->a:LHf/x0;

    .line 57
    .line 58
    :try_start_0
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    goto :goto_3

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    goto/16 :goto_9

    .line 64
    .line 65
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_2
    iget-object v0, v3, LHf/w0;->e:Ljava/lang/Object;

    .line 74
    .line 75
    iget-object v5, v3, LHf/w0;->d:LEf/m0;

    .line 76
    .line 77
    iget-object v10, v3, LHf/w0;->c:LHf/y0;

    .line 78
    .line 79
    iget-object v11, v3, LHf/w0;->b:LHf/m;

    .line 80
    .line 81
    iget-object v12, v3, LHf/w0;->a:LHf/x0;

    .line 82
    .line 83
    :try_start_1
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    .line 85
    .line 86
    goto/16 :goto_6

    .line 87
    .line 88
    :cond_3
    iget-object v10, v3, LHf/w0;->c:LHf/y0;

    .line 89
    .line 90
    iget-object v0, v3, LHf/w0;->b:LHf/m;

    .line 91
    .line 92
    iget-object v12, v3, LHf/w0;->a:LHf/x0;

    .line 93
    .line 94
    :try_start_2
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    invoke-static {v2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, LIf/b;->d()LIf/d;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    move-object v10, v2

    .line 106
    check-cast v10, LHf/y0;

    .line 107
    .line 108
    :try_start_3
    instance-of v2, v0, LHf/A0;

    .line 109
    .line 110
    if-eqz v2, :cond_5

    .line 111
    .line 112
    move-object v2, v0

    .line 113
    check-cast v2, LHf/A0;

    .line 114
    .line 115
    iput-object v1, v3, LHf/w0;->a:LHf/x0;

    .line 116
    .line 117
    iput-object v0, v3, LHf/w0;->b:LHf/m;

    .line 118
    .line 119
    iput-object v10, v3, LHf/w0;->c:LHf/y0;

    .line 120
    .line 121
    iput v9, v3, LHf/w0;->h:I

    .line 122
    .line 123
    invoke-virtual {v2, v3}, LHf/A0;->a(Llf/c;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 127
    if-ne v2, v4, :cond_5

    .line 128
    .line 129
    goto/16 :goto_8

    .line 130
    .line 131
    :goto_1
    move-object v12, v1

    .line 132
    goto/16 :goto_9

    .line 133
    .line 134
    :catchall_1
    move-exception v0

    .line 135
    goto :goto_1

    .line 136
    :cond_5
    move-object v12, v1

    .line 137
    :goto_2
    :try_start_4
    invoke-interface {v3}, Ljf/c;->getContext()Ljf/h;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    sget-object v5, LEf/l0;->a:LEf/l0;

    .line 142
    .line 143
    invoke-interface {v2, v5}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, LEf/m0;

    .line 148
    .line 149
    move-object v11, v0

    .line 150
    move-object v5, v2

    .line 151
    const/4 v0, 0x0

    .line 152
    :cond_6
    :goto_3
    sget-object v2, LHf/x0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 153
    .line 154
    invoke-virtual {v2, v12}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    if-eqz v5, :cond_8

    .line 159
    .line 160
    invoke-interface {v5}, LEf/m0;->isActive()Z

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    if-eqz v13, :cond_7

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_7
    invoke-interface {v5}, LEf/m0;->getCancellationException()Ljava/util/concurrent/CancellationException;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    throw v0

    .line 172
    :cond_8
    :goto_4
    if-eqz v0, :cond_9

    .line 173
    .line 174
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v13

    .line 178
    if-nez v13, :cond_c

    .line 179
    .line 180
    :cond_9
    sget-object v0, LIf/c;->b:LH6/g;

    .line 181
    .line 182
    if-ne v2, v0, :cond_a

    .line 183
    .line 184
    const/4 v0, 0x0

    .line 185
    goto :goto_5

    .line 186
    :cond_a
    move-object v0, v2

    .line 187
    :goto_5
    iput-object v12, v3, LHf/w0;->a:LHf/x0;

    .line 188
    .line 189
    iput-object v11, v3, LHf/w0;->b:LHf/m;

    .line 190
    .line 191
    iput-object v10, v3, LHf/w0;->c:LHf/y0;

    .line 192
    .line 193
    iput-object v5, v3, LHf/w0;->d:LEf/m0;

    .line 194
    .line 195
    iput-object v2, v3, LHf/w0;->e:Ljava/lang/Object;

    .line 196
    .line 197
    iput v8, v3, LHf/w0;->h:I

    .line 198
    .line 199
    invoke-interface {v11, v0, v3}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    if-ne v0, v4, :cond_b

    .line 204
    .line 205
    goto :goto_8

    .line 206
    :cond_b
    move-object v0, v2

    .line 207
    :cond_c
    :goto_6
    iget-object v2, v10, LHf/y0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 208
    .line 209
    sget-object v13, LHf/k0;->b:LH6/g;

    .line 210
    .line 211
    invoke-virtual {v2, v13}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    sget-object v14, LHf/k0;->c:LH6/g;

    .line 219
    .line 220
    if-ne v2, v14, :cond_d

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_d
    iput-object v12, v3, LHf/w0;->a:LHf/x0;

    .line 224
    .line 225
    iput-object v11, v3, LHf/w0;->b:LHf/m;

    .line 226
    .line 227
    iput-object v10, v3, LHf/w0;->c:LHf/y0;

    .line 228
    .line 229
    iput-object v5, v3, LHf/w0;->d:LEf/m0;

    .line 230
    .line 231
    iput-object v0, v3, LHf/w0;->e:Ljava/lang/Object;

    .line 232
    .line 233
    iput v7, v3, LHf/w0;->h:I

    .line 234
    .line 235
    new-instance v2, LEf/n;

    .line 236
    .line 237
    invoke-static {v3}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 238
    .line 239
    .line 240
    move-result-object v14

    .line 241
    invoke-direct {v2, v9, v14}, LEf/n;-><init>(ILjf/c;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2}, LEf/n;->t()V

    .line 245
    .line 246
    .line 247
    iget-object v14, v10, LHf/y0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 248
    .line 249
    :cond_e
    invoke-virtual {v14, v13, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v15

    .line 253
    sget-object v6, Lef/C;->a:Lef/C;

    .line 254
    .line 255
    if-eqz v15, :cond_f

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_f
    invoke-virtual {v14}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v15

    .line 262
    if-eq v15, v13, :cond_e

    .line 263
    .line 264
    invoke-virtual {v2, v6}, LEf/n;->resumeWith(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    :goto_7
    invoke-virtual {v2}, LEf/n;->s()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    sget-object v13, Lkf/a;->a:Lkf/a;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 272
    .line 273
    if-ne v2, v13, :cond_10

    .line 274
    .line 275
    move-object v6, v2

    .line 276
    :cond_10
    if-ne v6, v4, :cond_6

    .line 277
    .line 278
    :goto_8
    return-object v4

    .line 279
    :goto_9
    invoke-virtual {v12, v10}, LIf/b;->g(LIf/d;)V

    .line 280
    .line 281
    .line 282
    throw v0
.end method

.method public final e()LIf/d;
    .locals 1

    .line 1
    new-instance v0, LHf/y0;

    .line 2
    .line 3
    invoke-direct {v0}, LHf/y0;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LHf/x0;->j(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lef/C;->a:Lef/C;

    .line 5
    .line 6
    return-object p1
.end method

.method public final f()[LIf/d;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [LHf/y0;

    .line 3
    .line 4
    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, LIf/c;->b:LH6/g;

    .line 2
    .line 3
    sget-object v1, LHf/x0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v1, v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    :cond_0
    return-object v1
.end method

.method public final i(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    sget-object v0, LIf/c;->b:LH6/g;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    move-object p1, v0

    .line 6
    :cond_0
    if-nez p2, :cond_1

    .line 7
    .line 8
    move-object p2, v0

    .line 9
    :cond_1
    invoke-virtual {p0, p1, p2}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final j(Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LIf/c;->b:LH6/g;

    .line 4
    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0, p1}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final k(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, LHf/x0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 3
    .line 4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return v2

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_0
    :try_start_1
    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    monitor-exit p0

    .line 30
    return v1

    .line 31
    :cond_1
    :try_start_2
    invoke-virtual {v0, p0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget p1, p0, LHf/x0;->e:I

    .line 35
    .line 36
    and-int/lit8 p2, p1, 0x1

    .line 37
    .line 38
    if-nez p2, :cond_b

    .line 39
    .line 40
    add-int/2addr p1, v1

    .line 41
    iput p1, p0, LHf/x0;->e:I

    .line 42
    .line 43
    iget-object p2, p0, LIf/b;->a:[LIf/d;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    .line 45
    monitor-exit p0

    .line 46
    :goto_0
    check-cast p2, [LHf/y0;

    .line 47
    .line 48
    if-eqz p2, :cond_9

    .line 49
    .line 50
    array-length v0, p2

    .line 51
    move v3, v2

    .line 52
    :goto_1
    if-ge v3, v0, :cond_9

    .line 53
    .line 54
    aget-object v4, p2, v3

    .line 55
    .line 56
    if-eqz v4, :cond_8

    .line 57
    .line 58
    iget-object v4, v4, LHf/y0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 59
    .line 60
    :goto_2
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    if-nez v5, :cond_2

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_2
    sget-object v6, LHf/k0;->c:LH6/g;

    .line 68
    .line 69
    if-ne v5, v6, :cond_3

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    sget-object v7, LHf/k0;->b:LH6/g;

    .line 73
    .line 74
    if-ne v5, v7, :cond_6

    .line 75
    .line 76
    :cond_4
    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-eqz v7, :cond_5

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_5
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    if-eq v7, v5, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    invoke-virtual {v4, v5, v7}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-eqz v6, :cond_7

    .line 95
    .line 96
    check-cast v5, LEf/n;

    .line 97
    .line 98
    sget-object v4, Lef/C;->a:Lef/C;

    .line 99
    .line 100
    invoke-virtual {v5, v4}, LEf/n;->resumeWith(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_7
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    if-eq v6, v5, :cond_6

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_8
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_9
    monitor-enter p0

    .line 115
    :try_start_3
    iget p2, p0, LHf/x0;->e:I

    .line 116
    .line 117
    if-ne p2, p1, :cond_a

    .line 118
    .line 119
    add-int/2addr p1, v1

    .line 120
    iput p1, p0, LHf/x0;->e:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 121
    .line 122
    monitor-exit p0

    .line 123
    return v1

    .line 124
    :catchall_1
    move-exception p1

    .line 125
    goto :goto_4

    .line 126
    :cond_a
    :try_start_4
    iget-object p1, p0, LIf/b;->a:[LIf/d;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 127
    .line 128
    monitor-exit p0

    .line 129
    move v8, p2

    .line 130
    move-object p2, p1

    .line 131
    move p1, v8

    .line 132
    goto :goto_0

    .line 133
    :goto_4
    monitor-exit p0

    .line 134
    throw p1

    .line 135
    :cond_b
    add-int/lit8 p1, p1, 0x2

    .line 136
    .line 137
    :try_start_5
    iput p1, p0, LHf/x0;->e:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 138
    .line 139
    monitor-exit p0

    .line 140
    return v1

    .line 141
    :goto_5
    monitor-exit p0

    .line 142
    throw p1
.end method
