.class public final Lod/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmd/E;


# instance fields
.field public final a:Lmd/F;

.field public final b:Ljava/lang/String;

.field public final c:Lod/Y1;

.field public final d:Lod/a2;

.field public final e:Lod/j;

.field public final f:Ljava/util/concurrent/ScheduledExecutorService;

.field public final g:Lmd/C;

.field public final h:LVa/X7;

.field public final i:Lmd/e;

.field public final j:Ljava/util/ArrayList;

.field public final k:Lmd/n0;

.field public final l:Lod/l0;

.field public volatile m:Ljava/util/List;

.field public n:Lod/Q;

.field public final o:Lj/E;

.field public p:Lba/a;

.field public q:Lba/a;

.field public r:Lod/U0;

.field public final s:Ljava/util/ArrayList;

.field public final t:Lod/g0;

.field public u:Lod/k0;

.field public volatile v:Lod/k0;

.field public volatile w:Lmd/n;

.field public x:Lmd/k0;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Lod/Y1;Lod/j;Ljava/util/concurrent/ScheduledExecutorService;Lod/Y;Lmd/n0;Lod/a2;Lmd/C;LVa/X7;Lod/m;Lmd/F;Lmd/e;Ljava/util/ArrayList;)V
    .locals 5

    move-object/from16 v0, p12

    move-object/from16 v1, p13

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lod/o0;->s:Ljava/util/ArrayList;

    .line 3
    new-instance v2, Lod/g0;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lod/g0;-><init>(Lmd/E;I)V

    iput-object v2, p0, Lod/o0;->t:Lod/g0;

    .line 4
    sget-object v2, Lmd/m;->d:Lmd/m;

    invoke-static {v2}, Lmd/n;->a(Lmd/m;)Lmd/n;

    move-result-object v2

    iput-object v2, p0, Lod/o0;->w:Lmd/n;

    .line 5
    const-string v2, "addressGroups"

    invoke-static {p1, v2}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    const-string v3, "addressGroups is empty"

    invoke-static {v3, v2}, LFe/e;->p(Ljava/lang/String;Z)V

    .line 7
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 8
    const-string v4, "addressGroups contains null entry"

    invoke-static {v3, v4}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 10
    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 11
    iput-object p1, p0, Lod/o0;->m:Ljava/util/List;

    .line 12
    new-instance v2, Lod/l0;

    .line 13
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, v2, Lod/l0;->a:Ljava/util/List;

    .line 15
    iput-object v2, p0, Lod/o0;->l:Lod/l0;

    .line 16
    iput-object p2, p0, Lod/o0;->b:Ljava/lang/String;

    .line 17
    iput-object p3, p0, Lod/o0;->c:Lod/Y1;

    .line 18
    iput-object p4, p0, Lod/o0;->e:Lod/j;

    .line 19
    iput-object p5, p0, Lod/o0;->f:Ljava/util/concurrent/ScheduledExecutorService;

    .line 20
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    new-instance p1, Lj/E;

    const/4 p2, 0x1

    .line 22
    invoke-direct {p1, p2}, Lj/E;-><init>(I)V

    .line 23
    iput-object p1, p0, Lod/o0;->o:Lj/E;

    .line 24
    iput-object p7, p0, Lod/o0;->k:Lmd/n0;

    .line 25
    iput-object p8, p0, Lod/o0;->d:Lod/a2;

    .line 26
    iput-object p9, p0, Lod/o0;->g:Lmd/C;

    .line 27
    iput-object p10, p0, Lod/o0;->h:LVa/X7;

    .line 28
    const-string p1, "channelTracer"

    move-object/from16 p2, p11

    invoke-static {p2, p1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    const-string p1, "logId"

    invoke-static {v0, p1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lod/o0;->a:Lmd/F;

    .line 30
    const-string p1, "channelLogger"

    invoke-static {v1, p1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lod/o0;->i:Lmd/e;

    move-object/from16 p1, p14

    .line 31
    iput-object p1, p0, Lod/o0;->j:Ljava/util/ArrayList;

    return-void
.end method

.method public static g(Lod/o0;Lmd/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/o0;->k:Lmd/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmd/n0;->e()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lmd/n;->a(Lmd/m;)Lmd/n;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, Lod/o0;->i(Lmd/n;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static h(Lod/o0;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, v0, Lod/o0;->k:Lmd/n0;

    .line 6
    .line 7
    invoke-virtual {v3}, Lmd/n0;->e()V

    .line 8
    .line 9
    .line 10
    iget-object v4, v0, Lod/o0;->p:Lba/a;

    .line 11
    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    move v4, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v4, v1

    .line 17
    :goto_0
    const-string v5, "Should have no reconnectTask scheduled"

    .line 18
    .line 19
    invoke-static {v5, v4}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    iget-object v4, v0, Lod/o0;->l:Lod/l0;

    .line 23
    .line 24
    iget v5, v4, Lod/l0;->b:I

    .line 25
    .line 26
    if-nez v5, :cond_1

    .line 27
    .line 28
    iget v5, v4, Lod/l0;->c:I

    .line 29
    .line 30
    if-nez v5, :cond_1

    .line 31
    .line 32
    iget-object v5, v0, Lod/o0;->o:Lj/E;

    .line 33
    .line 34
    iput-boolean v1, v5, Lj/E;->b:Z

    .line 35
    .line 36
    invoke-virtual {v5}, Lj/E;->b()V

    .line 37
    .line 38
    .line 39
    :cond_1
    iget-object v5, v4, Lod/l0;->a:Ljava/util/List;

    .line 40
    .line 41
    iget v6, v4, Lod/l0;->b:I

    .line 42
    .line 43
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Lmd/u;

    .line 48
    .line 49
    iget-object v5, v5, Lmd/u;->a:Ljava/util/List;

    .line 50
    .line 51
    iget v6, v4, Lod/l0;->c:I

    .line 52
    .line 53
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    check-cast v5, Ljava/net/SocketAddress;

    .line 58
    .line 59
    instance-of v6, v5, Lmd/z;

    .line 60
    .line 61
    if-eqz v6, :cond_2

    .line 62
    .line 63
    check-cast v5, Lmd/z;

    .line 64
    .line 65
    iget-object v6, v5, Lmd/z;->b:Ljava/net/InetSocketAddress;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const/4 v6, 0x0

    .line 69
    move-object/from16 v20, v6

    .line 70
    .line 71
    move-object v6, v5

    .line 72
    move-object/from16 v5, v20

    .line 73
    .line 74
    :goto_1
    iget-object v7, v4, Lod/l0;->a:Ljava/util/List;

    .line 75
    .line 76
    iget v4, v4, Lod/l0;->b:I

    .line 77
    .line 78
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, Lmd/u;

    .line 83
    .line 84
    iget-object v4, v4, Lmd/u;->b:Lmd/b;

    .line 85
    .line 86
    sget-object v7, Lmd/u;->d:Lmd/a;

    .line 87
    .line 88
    iget-object v8, v4, Lmd/b;->a:Ljava/util/IdentityHashMap;

    .line 89
    .line 90
    invoke-virtual {v8, v7}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    check-cast v7, Ljava/lang/String;

    .line 95
    .line 96
    new-instance v8, Lod/v;

    .line 97
    .line 98
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 99
    .line 100
    .line 101
    const-string v9, "unknown-authority"

    .line 102
    .line 103
    iput-object v9, v8, Lod/v;->a:Ljava/lang/String;

    .line 104
    .line 105
    sget-object v9, Lmd/b;->b:Lmd/b;

    .line 106
    .line 107
    iput-object v9, v8, Lod/v;->b:Lmd/b;

    .line 108
    .line 109
    if-eqz v7, :cond_3

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_3
    iget-object v7, v0, Lod/o0;->b:Ljava/lang/String;

    .line 113
    .line 114
    :goto_2
    const-string v9, "authority"

    .line 115
    .line 116
    invoke-static {v7, v9}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iput-object v7, v8, Lod/v;->a:Ljava/lang/String;

    .line 120
    .line 121
    iput-object v4, v8, Lod/v;->b:Lmd/b;

    .line 122
    .line 123
    iput-object v5, v8, Lod/v;->c:Lmd/z;

    .line 124
    .line 125
    new-instance v4, Lod/n0;

    .line 126
    .line 127
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 128
    .line 129
    .line 130
    iget-object v5, v0, Lod/o0;->a:Lmd/F;

    .line 131
    .line 132
    iput-object v5, v4, Lod/n0;->d:Lmd/F;

    .line 133
    .line 134
    new-instance v5, Lod/k0;

    .line 135
    .line 136
    iget-object v7, v0, Lod/o0;->e:Lod/j;

    .line 137
    .line 138
    new-instance v9, Lod/i;

    .line 139
    .line 140
    iget-object v11, v7, Lod/j;->a:Lpd/g;

    .line 141
    .line 142
    iget-boolean v10, v11, Lpd/g;->n:Z

    .line 143
    .line 144
    if-nez v10, :cond_6

    .line 145
    .line 146
    new-instance v10, LA2/d;

    .line 147
    .line 148
    iget-object v12, v11, Lpd/g;->j:Lod/d;

    .line 149
    .line 150
    iget-object v13, v12, Lod/d;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 151
    .line 152
    invoke-virtual {v13}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 153
    .line 154
    .line 155
    move-result-wide v13

    .line 156
    const/16 v15, 0xb

    .line 157
    .line 158
    invoke-direct {v10, v12, v13, v14, v15}, LA2/d;-><init>(Ljava/lang/Object;JI)V

    .line 159
    .line 160
    .line 161
    new-instance v12, Lg5/d;

    .line 162
    .line 163
    const/16 v15, 0x12

    .line 164
    .line 165
    invoke-direct {v12, v10, v15}, Lg5/d;-><init>(Ljava/lang/Object;I)V

    .line 166
    .line 167
    .line 168
    check-cast v6, Ljava/net/InetSocketAddress;

    .line 169
    .line 170
    new-instance v10, Lpd/m;

    .line 171
    .line 172
    move-wide v14, v13

    .line 173
    iget-object v13, v8, Lod/v;->a:Ljava/lang/String;

    .line 174
    .line 175
    move-wide v15, v14

    .line 176
    iget-object v14, v8, Lod/v;->b:Lmd/b;

    .line 177
    .line 178
    move-wide/from16 v16, v15

    .line 179
    .line 180
    iget-object v15, v8, Lod/v;->c:Lmd/z;

    .line 181
    .line 182
    move-wide/from16 v18, v16

    .line 183
    .line 184
    move-object/from16 v16, v12

    .line 185
    .line 186
    move-object v12, v6

    .line 187
    invoke-direct/range {v10 .. v16}, Lpd/m;-><init>(Lpd/g;Ljava/net/InetSocketAddress;Ljava/lang/String;Lmd/b;Lmd/z;Lg5/d;)V

    .line 188
    .line 189
    .line 190
    iget-boolean v6, v11, Lpd/g;->i:Z

    .line 191
    .line 192
    if-eqz v6, :cond_4

    .line 193
    .line 194
    iput-boolean v2, v10, Lpd/m;->G:Z

    .line 195
    .line 196
    move-wide/from16 v14, v18

    .line 197
    .line 198
    iput-wide v14, v10, Lpd/m;->H:J

    .line 199
    .line 200
    iget-wide v11, v11, Lpd/g;->k:J

    .line 201
    .line 202
    iput-wide v11, v10, Lpd/m;->I:J

    .line 203
    .line 204
    :cond_4
    iget-object v6, v8, Lod/v;->a:Ljava/lang/String;

    .line 205
    .line 206
    invoke-direct {v9, v7, v10, v6}, Lod/i;-><init>(Lod/j;Lod/y;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    iget-object v6, v0, Lod/o0;->h:LVa/X7;

    .line 210
    .line 211
    invoke-direct {v5, v9, v6}, Lod/k0;-><init>(Lod/y;LVa/X7;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v5}, Lod/U;->f()Lmd/F;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    iput-object v6, v4, Lod/n0;->d:Lmd/F;

    .line 219
    .line 220
    iget-object v6, v0, Lod/o0;->g:Lmd/C;

    .line 221
    .line 222
    iget-object v6, v6, Lmd/C;->c:Lj$/util/concurrent/ConcurrentHashMap;

    .line 223
    .line 224
    invoke-virtual {v5}, Lod/U;->f()Lmd/F;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    iget-wide v7, v7, Lmd/F;->c:J

    .line 229
    .line 230
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    check-cast v6, Lmd/E;

    .line 239
    .line 240
    iput-object v5, v0, Lod/o0;->u:Lod/k0;

    .line 241
    .line 242
    iget-object v6, v0, Lod/o0;->s:Ljava/util/ArrayList;

    .line 243
    .line 244
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    new-instance v6, LE5/b;

    .line 248
    .line 249
    invoke-direct {v6, v0, v5}, LE5/b;-><init>(Lod/o0;Lod/k0;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v5, v6}, Lod/U;->e(Lod/T0;)Ljava/lang/Runnable;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    if-eqz v5, :cond_5

    .line 257
    .line 258
    invoke-virtual {v3, v5}, Lmd/n0;->c(Ljava/lang/Runnable;)V

    .line 259
    .line 260
    .line 261
    :cond_5
    iget-object v3, v4, Lod/n0;->d:Lmd/F;

    .line 262
    .line 263
    new-array v2, v2, [Ljava/lang/Object;

    .line 264
    .line 265
    aput-object v3, v2, v1

    .line 266
    .line 267
    iget-object v0, v0, Lod/o0;->i:Lmd/e;

    .line 268
    .line 269
    const-string v1, "Started transport {0}"

    .line 270
    .line 271
    const/4 v3, 0x2

    .line 272
    invoke-virtual {v0, v3, v1, v2}, Lmd/e;->h(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    return-void

    .line 276
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 277
    .line 278
    const-string v1, "The transport factory is closed."

    .line 279
    .line 280
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw v0
.end method

.method public static j(Lmd/k0;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lmd/k0;->a:Lmd/j0;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lmd/k0;->b:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v2, "("

    .line 16
    .line 17
    const-string v3, ")"

    .line 18
    .line 19
    invoke-static {v0, v2, v1, v3}, LN0/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object p0, p0, Lmd/k0;->c:Ljava/lang/Throwable;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    const-string v1, "["

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p0, "]"

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method


# virtual methods
.method public final f()Lmd/F;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/o0;->a:Lmd/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(Lmd/n;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lod/o0;->k:Lmd/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmd/n0;->e()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lod/o0;->w:Lmd/n;

    .line 7
    .line 8
    iget-object v0, v0, Lmd/n;->a:Lmd/m;

    .line 9
    .line 10
    iget-object v1, p1, Lmd/n;->a:Lmd/m;

    .line 11
    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lod/o0;->w:Lmd/n;

    .line 15
    .line 16
    iget-object v0, v0, Lmd/n;->a:Lmd/m;

    .line 17
    .line 18
    sget-object v1, Lmd/m;->e:Lmd/m;

    .line 19
    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v2, "Cannot transition out of SHUTDOWN to "

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lod/o0;->w:Lmd/n;

    .line 43
    .line 44
    iget-object v0, p0, Lod/o0;->d:Lod/a2;

    .line 45
    .line 46
    iget-object v0, v0, Lod/a2;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lmd/N;

    .line 49
    .line 50
    invoke-interface {v0, p1}, Lmd/N;->a(Lmd/n;)V

    .line 51
    .line 52
    .line 53
    :cond_1
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
    iget-object v1, p0, Lod/o0;->a:Lmd/F;

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
    const-string v1, "addressGroups"

    .line 15
    .line 16
    iget-object v2, p0, Lod/o0;->m:Ljava/util/List;

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
