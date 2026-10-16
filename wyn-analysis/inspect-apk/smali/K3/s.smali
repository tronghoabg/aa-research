.class public final LK3/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final s:Ljava/lang/String;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/List;

.field public final d:Lb7/k;

.field public final e:LS3/p;

.field public f:LJ3/q;

.field public final g:Lb7/k;

.field public h:LJ3/p;

.field public final i:LJ3/b;

.field public final j:LK3/f;

.field public final k:Landroidx/work/impl/WorkDatabase;

.field public final l:LS3/q;

.field public final m:LS3/c;

.field public final n:Ljava/util/ArrayList;

.field public o:Ljava/lang/String;

.field public final p:LU3/j;

.field public final q:LU3/j;

.field public volatile r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "WorkerWrapper"

    .line 2
    .line 3
    invoke-static {v0}, LJ3/r;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LK3/s;->s:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LK3/r;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LJ3/m;

    .line 5
    .line 6
    invoke-direct {v0}, LJ3/m;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LK3/s;->h:LJ3/p;

    .line 10
    .line 11
    new-instance v0, LU3/j;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LK3/s;->p:LU3/j;

    .line 17
    .line 18
    new-instance v0, LU3/j;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LK3/s;->q:LU3/j;

    .line 24
    .line 25
    iget-object v0, p1, LK3/r;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Landroid/content/Context;

    .line 28
    .line 29
    iput-object v0, p0, LK3/s;->a:Landroid/content/Context;

    .line 30
    .line 31
    iget-object v0, p1, LK3/r;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lb7/k;

    .line 34
    .line 35
    iput-object v0, p0, LK3/s;->g:Lb7/k;

    .line 36
    .line 37
    iget-object v0, p1, LK3/r;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, LK3/f;

    .line 40
    .line 41
    iput-object v0, p0, LK3/s;->j:LK3/f;

    .line 42
    .line 43
    iget-object v0, p1, LK3/r;->f:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, LS3/p;

    .line 46
    .line 47
    iput-object v0, p0, LK3/s;->e:LS3/p;

    .line 48
    .line 49
    iget-object v0, v0, LS3/p;->a:Ljava/lang/String;

    .line 50
    .line 51
    iput-object v0, p0, LK3/s;->b:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v0, p1, LK3/r;->g:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Ljava/util/List;

    .line 56
    .line 57
    iput-object v0, p0, LK3/s;->c:Ljava/util/List;

    .line 58
    .line 59
    iget-object v0, p1, LK3/r;->i:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Lb7/k;

    .line 62
    .line 63
    iput-object v0, p0, LK3/s;->d:Lb7/k;

    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    iput-object v0, p0, LK3/s;->f:LJ3/q;

    .line 67
    .line 68
    iget-object v0, p1, LK3/r;->d:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, LJ3/b;

    .line 71
    .line 72
    iput-object v0, p0, LK3/s;->i:LJ3/b;

    .line 73
    .line 74
    iget-object v0, p1, LK3/r;->e:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Landroidx/work/impl/WorkDatabase;

    .line 77
    .line 78
    iput-object v0, p0, LK3/s;->k:Landroidx/work/impl/WorkDatabase;

    .line 79
    .line 80
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->u()LS3/q;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iput-object v1, p0, LK3/s;->l:LS3/q;

    .line 85
    .line 86
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->p()LS3/c;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iput-object v0, p0, LK3/s;->m:LS3/c;

    .line 91
    .line 92
    iget-object p1, p1, LK3/r;->h:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p1, Ljava/util/ArrayList;

    .line 95
    .line 96
    iput-object p1, p0, LK3/s;->n:Ljava/util/ArrayList;

    .line 97
    .line 98
    return-void
.end method


# virtual methods
.method public final a(LJ3/p;)V
    .locals 12

    .line 1
    instance-of v0, p1, LJ3/o;

    .line 2
    .line 3
    iget-object v1, p0, LK3/s;->e:LS3/p;

    .line 4
    .line 5
    sget-object v2, LK3/s;->s:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_5

    .line 8
    .line 9
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "Worker result SUCCESS for "

    .line 16
    .line 17
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v3, p0, LK3/s;->o:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v2, v0}, LJ3/r;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, LS3/p;->c()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0}, LK3/s;->d()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    iget-object p1, p0, LK3/s;->m:LS3/c;

    .line 43
    .line 44
    iget-object v0, p0, LK3/s;->b:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v1, p0, LK3/s;->l:LS3/q;

    .line 47
    .line 48
    iget-object v3, p0, LK3/s;->k:Landroidx/work/impl/WorkDatabase;

    .line 49
    .line 50
    invoke-virtual {v3}, Lk3/m;->c()V

    .line 51
    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    const/4 v5, 0x3

    .line 55
    :try_start_0
    invoke-virtual {v1, v5, v0}, LS3/q;->l(ILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object v5, p0, LK3/s;->h:LJ3/p;

    .line 59
    .line 60
    check-cast v5, LJ3/o;

    .line 61
    .line 62
    iget-object v5, v5, LJ3/o;->a:LJ3/h;

    .line 63
    .line 64
    invoke-virtual {v1, v0, v5}, LS3/q;->k(Ljava/lang/String;LJ3/h;)V

    .line 65
    .line 66
    .line 67
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 68
    .line 69
    .line 70
    move-result-wide v5

    .line 71
    invoke-virtual {p1, v0}, LS3/c;->k(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-eqz v7, :cond_4

    .line 84
    .line 85
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    check-cast v7, Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v1, v7}, LS3/q;->e(Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    const/4 v9, 0x5

    .line 96
    if-ne v8, v9, :cond_1

    .line 97
    .line 98
    const-string v8, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)"

    .line 99
    .line 100
    const/4 v9, 0x1

    .line 101
    invoke-static {v9, v8}, Lk3/q;->d(ILjava/lang/String;)Lk3/q;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    if-nez v7, :cond_2

    .line 106
    .line 107
    invoke-virtual {v8, v9}, Lk3/q;->N(I)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    invoke-virtual {v8, v9, v7}, Lk3/q;->x(ILjava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :goto_1
    iget-object v10, p1, LS3/c;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v10, Landroidx/work/impl/WorkDatabase_Impl;

    .line 117
    .line 118
    invoke-virtual {v10}, Lk3/m;->b()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v10, v8}, Lk3/m;->l(Lo3/f;)Landroid/database/Cursor;

    .line 122
    .line 123
    .line 124
    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 125
    :try_start_1
    invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    if-eqz v11, :cond_3

    .line 130
    .line 131
    invoke-interface {v10, v4}, Landroid/database/Cursor;->getInt(I)I

    .line 132
    .line 133
    .line 134
    move-result v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 135
    if-eqz v11, :cond_3

    .line 136
    .line 137
    move v11, v9

    .line 138
    goto :goto_2

    .line 139
    :catchall_0
    move-exception p1

    .line 140
    goto :goto_3

    .line 141
    :cond_3
    move v11, v4

    .line 142
    :goto_2
    :try_start_2
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v8}, Lk3/q;->h()V

    .line 146
    .line 147
    .line 148
    if-eqz v11, :cond_1

    .line 149
    .line 150
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    new-instance v10, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const-string v11, "Setting status to enqueued for "

    .line 160
    .line 161
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    invoke-virtual {v8, v2, v10}, LJ3/r;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v9, v7}, LS3/q;->l(ILjava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v5, v6, v7}, LS3/q;->j(JLjava/lang/String;)V

    .line 178
    .line 179
    .line 180
    goto :goto_0

    .line 181
    :catchall_1
    move-exception p1

    .line 182
    goto :goto_4

    .line 183
    :goto_3
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v8}, Lk3/q;->h()V

    .line 187
    .line 188
    .line 189
    throw p1

    .line 190
    :cond_4
    invoke-virtual {v3}, Lk3/m;->n()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3}, Lk3/m;->j()V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v4}, LK3/s;->e(Z)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :goto_4
    invoke-virtual {v3}, Lk3/m;->j()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0, v4}, LK3/s;->e(Z)V

    .line 204
    .line 205
    .line 206
    throw p1

    .line 207
    :cond_5
    instance-of p1, p1, LJ3/n;

    .line 208
    .line 209
    if-eqz p1, :cond_6

    .line 210
    .line 211
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    new-instance v0, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    const-string v1, "Worker result RETRY for "

    .line 218
    .line 219
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    iget-object v1, p0, LK3/s;->o:Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {p1, v2, v0}, LJ3/r;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0}, LK3/s;->c()V

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :cond_6
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    new-instance v0, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    const-string v3, "Worker result FAILURE for "

    .line 245
    .line 246
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    iget-object v3, p0, LK3/s;->o:Ljava/lang/String;

    .line 250
    .line 251
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-virtual {p1, v2, v0}, LJ3/r;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1}, LS3/p;->c()Z

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    if-eqz p1, :cond_7

    .line 266
    .line 267
    invoke-virtual {p0}, LK3/s;->d()V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :cond_7
    invoke-virtual {p0}, LK3/s;->g()V

    .line 272
    .line 273
    .line 274
    return-void
.end method

.method public final b()V
    .locals 7

    .line 1
    invoke-virtual {p0}, LK3/s;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, LK3/s;->k:Landroidx/work/impl/WorkDatabase;

    .line 6
    .line 7
    iget-object v2, p0, LK3/s;->b:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_4

    .line 10
    .line 11
    invoke-virtual {v1}, Lk3/m;->c()V

    .line 12
    .line 13
    .line 14
    :try_start_0
    iget-object v0, p0, LK3/s;->l:LS3/q;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, LS3/q;->e(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->t()LS3/n;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-object v4, v3, LS3/n;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v4, Landroidx/work/impl/WorkDatabase_Impl;

    .line 27
    .line 28
    invoke-virtual {v4}, Lk3/m;->b()V

    .line 29
    .line 30
    .line 31
    iget-object v3, v3, LS3/n;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, LS3/h;

    .line 34
    .line 35
    invoke-virtual {v3}, LE9/c;->a()Lo3/g;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const/4 v6, 0x1

    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    invoke-interface {v5, v6}, Lo3/e;->N(I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-interface {v5, v6, v2}, Lo3/e;->x(ILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-virtual {v4}, Lk3/m;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    :try_start_1
    invoke-interface {v5}, Lo3/g;->g()I

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4}, Lk3/m;->n()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    .line 57
    .line 58
    :try_start_2
    invoke-virtual {v4}, Lk3/m;->j()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v5}, LE9/c;->q(Lo3/g;)V

    .line 62
    .line 63
    .line 64
    if-nez v0, :cond_1

    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    invoke-virtual {p0, v0}, LK3/s;->e(Z)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    goto :goto_2

    .line 73
    :cond_1
    const/4 v3, 0x2

    .line 74
    if-ne v0, v3, :cond_2

    .line 75
    .line 76
    iget-object v0, p0, LK3/s;->h:LJ3/p;

    .line 77
    .line 78
    invoke-virtual {p0, v0}, LK3/s;->a(LJ3/p;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-static {v0}, LA7/p0;->d(I)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_3

    .line 87
    .line 88
    invoke-virtual {p0}, LK3/s;->c()V

    .line 89
    .line 90
    .line 91
    :cond_3
    :goto_1
    invoke-virtual {v1}, Lk3/m;->n()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Lk3/m;->j()V

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :catchall_1
    move-exception v0

    .line 99
    :try_start_3
    invoke-virtual {v4}, Lk3/m;->j()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v5}, LE9/c;->q(Lo3/g;)V

    .line 103
    .line 104
    .line 105
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 106
    :goto_2
    invoke-virtual {v1}, Lk3/m;->j()V

    .line 107
    .line 108
    .line 109
    throw v0

    .line 110
    :cond_4
    :goto_3
    iget-object v0, p0, LK3/s;->c:Ljava/util/List;

    .line 111
    .line 112
    if-eqz v0, :cond_6

    .line 113
    .line 114
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_5

    .line 123
    .line 124
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    check-cast v4, LK3/h;

    .line 129
    .line 130
    invoke-interface {v4, v2}, LK3/h;->a(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_5
    iget-object v2, p0, LK3/s;->i:LJ3/b;

    .line 135
    .line 136
    invoke-static {v2, v1, v0}, LK3/i;->a(LJ3/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 137
    .line 138
    .line 139
    :cond_6
    return-void
.end method

.method public final c()V
    .locals 6

    .line 1
    iget-object v0, p0, LK3/s;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, LK3/s;->l:LS3/q;

    .line 4
    .line 5
    iget-object v2, p0, LK3/s;->k:Landroidx/work/impl/WorkDatabase;

    .line 6
    .line 7
    invoke-virtual {v2}, Lk3/m;->c()V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    :try_start_0
    invoke-virtual {v1, v3, v0}, LS3/q;->l(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    invoke-virtual {v1, v4, v5, v0}, LS3/q;->j(JLjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-wide/16 v4, -0x1

    .line 22
    .line 23
    invoke-virtual {v1, v4, v5, v0}, LS3/q;->i(JLjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Lk3/m;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Lk3/m;->j()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v3}, LK3/s;->e(Z)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    invoke-virtual {v2}, Lk3/m;->j()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v3}, LK3/s;->e(Z)V

    .line 41
    .line 42
    .line 43
    throw v0
.end method

.method public final d()V
    .locals 8

    .line 1
    iget-object v0, p0, LK3/s;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, LK3/s;->l:LS3/q;

    .line 4
    .line 5
    iget-object v2, p0, LK3/s;->k:Landroidx/work/impl/WorkDatabase;

    .line 6
    .line 7
    invoke-virtual {v2}, Lk3/m;->c()V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    invoke-virtual {v1, v4, v5, v0}, LS3/q;->j(JLjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    invoke-virtual {v1, v4, v0}, LS3/q;->l(ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    iget-object v5, v1, LS3/q;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v5, Landroidx/work/impl/WorkDatabase_Impl;

    .line 25
    .line 26
    :try_start_1
    invoke-virtual {v5}, Lk3/m;->b()V

    .line 27
    .line 28
    .line 29
    iget-object v6, v1, LS3/q;->i:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v6, LS3/h;

    .line 32
    .line 33
    invoke-virtual {v6}, LE9/c;->a()Lo3/g;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    invoke-interface {v7, v4}, Lo3/e;->N(I)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-interface {v7, v4, v0}, Lo3/e;->x(ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-virtual {v5}, Lk3/m;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    .line 49
    :try_start_2
    invoke-interface {v7}, Lo3/g;->g()I

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5}, Lk3/m;->n()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 53
    .line 54
    .line 55
    :try_start_3
    invoke-virtual {v5}, Lk3/m;->j()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v6, v7}, LE9/c;->q(Lo3/g;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5}, Lk3/m;->b()V

    .line 62
    .line 63
    .line 64
    iget-object v6, v1, LS3/q;->e:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v6, LS3/h;

    .line 67
    .line 68
    invoke-virtual {v6}, LE9/c;->a()Lo3/g;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    if-nez v0, :cond_1

    .line 73
    .line 74
    invoke-interface {v7, v4}, Lo3/e;->N(I)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    invoke-interface {v7, v4, v0}, Lo3/e;->x(ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :goto_1
    invoke-virtual {v5}, Lk3/m;->c()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 82
    .line 83
    .line 84
    :try_start_4
    invoke-interface {v7}, Lo3/g;->g()I

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5}, Lk3/m;->n()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 88
    .line 89
    .line 90
    :try_start_5
    invoke-virtual {v5}, Lk3/m;->j()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6, v7}, LE9/c;->q(Lo3/g;)V

    .line 94
    .line 95
    .line 96
    const-wide/16 v4, -0x1

    .line 97
    .line 98
    invoke-virtual {v1, v4, v5, v0}, LS3/q;->i(JLjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Lk3/m;->n()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Lk3/m;->j()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v3}, LK3/s;->e(Z)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :catchall_0
    move-exception v0

    .line 112
    goto :goto_2

    .line 113
    :catchall_1
    move-exception v0

    .line 114
    :try_start_6
    invoke-virtual {v5}, Lk3/m;->j()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, v7}, LE9/c;->q(Lo3/g;)V

    .line 118
    .line 119
    .line 120
    throw v0

    .line 121
    :catchall_2
    move-exception v0

    .line 122
    invoke-virtual {v5}, Lk3/m;->j()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v6, v7}, LE9/c;->q(Lo3/g;)V

    .line 126
    .line 127
    .line 128
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 129
    :goto_2
    invoke-virtual {v2}, Lk3/m;->j()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v3}, LK3/s;->e(Z)V

    .line 133
    .line 134
    .line 135
    throw v0
.end method

.method public final e(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, LK3/s;->k:Landroidx/work/impl/WorkDatabase;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk3/m;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, LK3/s;->k:Landroidx/work/impl/WorkDatabase;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->u()LS3/q;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-string v1, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {v2, v1}, Lk3/q;->d(ILjava/lang/String;)Lk3/q;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v0, v0, LS3/q;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 25
    .line 26
    invoke-virtual {v0}, Lk3/m;->b()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lk3/m;->l(Lo3/f;)Landroid/database/Cursor;

    .line 30
    .line 31
    .line 32
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 33
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const/4 v4, 0x1

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 41
    .line 42
    .line 43
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    move v3, v4

    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_3

    .line 50
    :cond_0
    move v3, v2

    .line 51
    :goto_0
    :try_start_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lk3/q;->h()V

    .line 55
    .line 56
    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    iget-object v0, p0, LK3/s;->a:Landroid/content/Context;

    .line 60
    .line 61
    const-class v1, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    .line 62
    .line 63
    invoke-static {v0, v1, v2}, LT3/k;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catchall_1
    move-exception p1

    .line 68
    goto :goto_4

    .line 69
    :cond_1
    :goto_1
    if-eqz p1, :cond_2

    .line 70
    .line 71
    iget-object v0, p0, LK3/s;->l:LS3/q;

    .line 72
    .line 73
    iget-object v1, p0, LK3/s;->b:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v0, v4, v1}, LS3/q;->l(ILjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, LK3/s;->l:LS3/q;

    .line 79
    .line 80
    iget-object v1, p0, LK3/s;->b:Ljava/lang/String;

    .line 81
    .line 82
    const-wide/16 v2, -0x1

    .line 83
    .line 84
    invoke-virtual {v0, v2, v3, v1}, LS3/q;->i(JLjava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    iget-object v0, p0, LK3/s;->e:LS3/p;

    .line 88
    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    iget-object v0, p0, LK3/s;->f:LJ3/q;

    .line 92
    .line 93
    if-eqz v0, :cond_3

    .line 94
    .line 95
    iget-object v0, p0, LK3/s;->j:LK3/f;

    .line 96
    .line 97
    iget-object v1, p0, LK3/s;->b:Ljava/lang/String;

    .line 98
    .line 99
    iget-object v2, v0, LK3/f;->l:Ljava/lang/Object;

    .line 100
    .line 101
    monitor-enter v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 102
    :try_start_3
    iget-object v0, v0, LK3/f;->f:Ljava/util/HashMap;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    :try_start_4
    iget-object v0, p0, LK3/s;->j:LK3/f;

    .line 112
    .line 113
    iget-object v1, p0, LK3/s;->b:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v0, v1}, LK3/f;->k(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :catchall_2
    move-exception p1

    .line 120
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 121
    :try_start_6
    throw p1

    .line 122
    :cond_3
    :goto_2
    iget-object v0, p0, LK3/s;->k:Landroidx/work/impl/WorkDatabase;

    .line 123
    .line 124
    invoke-virtual {v0}, Lk3/m;->n()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, LK3/s;->k:Landroidx/work/impl/WorkDatabase;

    .line 128
    .line 129
    invoke-virtual {v0}, Lk3/m;->j()V

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, LK3/s;->p:LU3/j;

    .line 133
    .line 134
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {v0, p1}, LU3/j;->i(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :goto_3
    :try_start_7
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Lk3/q;->h()V

    .line 146
    .line 147
    .line 148
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 149
    :goto_4
    iget-object v0, p0, LK3/s;->k:Landroidx/work/impl/WorkDatabase;

    .line 150
    .line 151
    invoke-virtual {v0}, Lk3/m;->j()V

    .line 152
    .line 153
    .line 154
    throw p1
.end method

.method public final f()V
    .locals 6

    .line 1
    iget-object v0, p0, LK3/s;->l:LS3/q;

    .line 2
    .line 3
    iget-object v1, p0, LK3/s;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LS3/q;->e(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x2

    .line 10
    const-string v3, "Status for "

    .line 11
    .line 12
    sget-object v4, LK3/s;->s:Ljava/lang/String;

    .line 13
    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, " is RUNNING; not doing any work and rescheduling for later execution"

    .line 29
    .line 30
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v4, v1}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    invoke-virtual {p0, v0}, LK3/s;->e(Z)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const-string v5, " is "

    .line 50
    .line 51
    invoke-static {v3, v1, v5}, Lcom/google/android/gms/internal/consent_sdk/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v0}, LA7/p0;->B(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v0, " ; not doing any work"

    .line 63
    .line 64
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v2, v4, v0}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    invoke-virtual {p0, v0}, LK3/s;->e(Z)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final g()V
    .locals 8

    .line 1
    iget-object v0, p0, LK3/s;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, LK3/s;->k:Landroidx/work/impl/WorkDatabase;

    .line 4
    .line 5
    invoke-virtual {v1}, Lk3/m;->c()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :try_start_0
    new-instance v3, Ljava/util/LinkedList;

    .line 10
    .line 11
    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    iget-object v5, p0, LK3/s;->l:LS3/q;

    .line 22
    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    :try_start_1
    invoke-virtual {v3}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v5, v4}, LS3/q;->e(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    const/4 v7, 0x6

    .line 36
    if-eq v6, v7, :cond_0

    .line 37
    .line 38
    const/4 v6, 0x4

    .line 39
    invoke-virtual {v5, v6, v4}, LS3/q;->l(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    iget-object v5, p0, LK3/s;->m:LS3/c;

    .line 43
    .line 44
    invoke-virtual {v5, v4}, LS3/c;->k(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v3, v4}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-object v3, p0, LK3/s;->h:LJ3/p;

    .line 53
    .line 54
    check-cast v3, LJ3/m;

    .line 55
    .line 56
    iget-object v3, v3, LJ3/m;->a:LJ3/h;

    .line 57
    .line 58
    invoke-virtual {v5, v0, v3}, LS3/q;->k(Ljava/lang/String;LJ3/h;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Lk3/m;->n()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Lk3/m;->j()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v2}, LK3/s;->e(Z)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    invoke-virtual {v1}, Lk3/m;->j()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v2}, LK3/s;->e(Z)V

    .line 76
    .line 77
    .line 78
    throw v0
.end method

.method public final h()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, LK3/s;->r:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v2, LK3/s;->s:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v3, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "Work interrupted for "

    .line 15
    .line 16
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v4, p0, LK3/s;->o:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v0, v2, v3}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, LK3/s;->l:LS3/q;

    .line 32
    .line 33
    iget-object v2, p0, LK3/s;->b:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v2}, LS3/q;->e(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v2, 0x1

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0, v1}, LK3/s;->e(Z)V

    .line 43
    .line 44
    .line 45
    return v2

    .line 46
    :cond_0
    invoke-static {v0}, LA7/p0;->d(I)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    xor-int/2addr v0, v2

    .line 51
    invoke-virtual {p0, v0}, LK3/s;->e(Z)V

    .line 52
    .line 53
    .line 54
    return v2

    .line 55
    :cond_1
    return v1
.end method

.method public final run()V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v3, "Work [ id="

    .line 7
    .line 8
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v3, v1, LK3/s;->b:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v4, ", tags={ "

    .line 17
    .line 18
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v4, v1, LK3/s;->n:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    const/4 v6, 0x1

    .line 28
    move v7, v6

    .line 29
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    if-eqz v8, :cond_1

    .line 34
    .line 35
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    check-cast v8, Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v7, :cond_0

    .line 42
    .line 43
    move v7, v2

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    const-string v9, ", "

    .line 46
    .line 47
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    :goto_1
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const-string v5, " } ]"

    .line 55
    .line 56
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, v1, LK3/s;->o:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v5, v1, LK3/s;->e:LS3/p;

    .line 66
    .line 67
    const-string v0, "Delaying execution for "

    .line 68
    .line 69
    invoke-virtual {v1}, LK3/s;->h()Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_2

    .line 74
    .line 75
    goto/16 :goto_a

    .line 76
    .line 77
    :cond_2
    iget-object v7, v1, LK3/s;->k:Landroidx/work/impl/WorkDatabase;

    .line 78
    .line 79
    invoke-virtual {v7}, Lk3/m;->c()V

    .line 80
    .line 81
    .line 82
    :try_start_0
    iget v8, v5, LS3/p;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    iget-object v9, v5, LS3/p;->c:Ljava/lang/String;

    .line 85
    .line 86
    sget-object v10, LK3/s;->s:Ljava/lang/String;

    .line 87
    .line 88
    if-eq v8, v6, :cond_3

    .line 89
    .line 90
    :try_start_1
    invoke-virtual {v1}, LK3/s;->f()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v7}, Lk3/m;->n()V

    .line 94
    .line 95
    .line 96
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    new-instance v2, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v3, " is not in ENQUEUED state. Nothing more to do"

    .line 109
    .line 110
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v0, v10, v2}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    .line 119
    .line 120
    invoke-virtual {v7}, Lk3/m;->j()V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :catchall_0
    move-exception v0

    .line 125
    goto/16 :goto_d

    .line 126
    .line 127
    :cond_3
    :try_start_2
    invoke-virtual {v5}, LS3/p;->c()Z

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    if-nez v8, :cond_5

    .line 132
    .line 133
    iget v8, v5, LS3/p;->b:I

    .line 134
    .line 135
    if-ne v8, v6, :cond_4

    .line 136
    .line 137
    iget v8, v5, LS3/p;->k:I

    .line 138
    .line 139
    if-lez v8, :cond_4

    .line 140
    .line 141
    move v8, v6

    .line 142
    goto :goto_2

    .line 143
    :cond_4
    move v8, v2

    .line 144
    :goto_2
    if-eqz v8, :cond_6

    .line 145
    .line 146
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 147
    .line 148
    .line 149
    move-result-wide v11

    .line 150
    invoke-virtual {v5}, LS3/p;->a()J

    .line 151
    .line 152
    .line 153
    move-result-wide v13

    .line 154
    cmp-long v8, v11, v13

    .line 155
    .line 156
    if-gez v8, :cond_6

    .line 157
    .line 158
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    new-instance v3, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v0, " because it is being executed before schedule."

    .line 171
    .line 172
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v2, v10, v0}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v6}, LK3/s;->e(Z)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v7}, Lk3/m;->n()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 186
    .line 187
    .line 188
    invoke-virtual {v7}, Lk3/m;->j()V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_6
    :try_start_3
    invoke-virtual {v7}, Lk3/m;->n()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 193
    .line 194
    .line 195
    invoke-virtual {v7}, Lk3/m;->j()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v5}, LS3/p;->c()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    iget-object v8, v1, LK3/s;->l:LS3/q;

    .line 203
    .line 204
    iget-object v11, v1, LK3/s;->i:LJ3/b;

    .line 205
    .line 206
    if-eqz v0, :cond_7

    .line 207
    .line 208
    iget-object v0, v5, LS3/p;->e:LJ3/h;

    .line 209
    .line 210
    goto/16 :goto_7

    .line 211
    .line 212
    :cond_7
    iget-object v0, v11, LJ3/b;->d:Lya/b;

    .line 213
    .line 214
    iget-object v12, v5, LS3/p;->d:Ljava/lang/String;

    .line 215
    .line 216
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    sget-object v0, LJ3/k;->a:Ljava/lang/String;

    .line 220
    .line 221
    :try_start_4
    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    new-array v14, v2, [Ljava/lang/Class;

    .line 226
    .line 227
    invoke-virtual {v0, v14}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    new-array v14, v2, [Ljava/lang/Object;

    .line 232
    .line 233
    invoke-virtual {v0, v14}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    check-cast v0, LJ3/k;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :catch_0
    move-exception v0

    .line 241
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 242
    .line 243
    .line 244
    move-result-object v14

    .line 245
    const-string v15, "Trouble instantiating + "

    .line 246
    .line 247
    invoke-static {v15, v12}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v12

    .line 251
    sget-object v15, LJ3/k;->a:Ljava/lang/String;

    .line 252
    .line 253
    invoke-virtual {v14, v15, v12, v0}, LJ3/r;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 254
    .line 255
    .line 256
    const/4 v0, 0x0

    .line 257
    :goto_3
    if-nez v0, :cond_8

    .line 258
    .line 259
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    new-instance v2, Ljava/lang/StringBuilder;

    .line 264
    .line 265
    const-string v3, "Could not create Input Merger "

    .line 266
    .line 267
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    iget-object v3, v5, LS3/p;->d:Ljava/lang/String;

    .line 271
    .line 272
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-virtual {v0, v10, v2}, LJ3/r;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1}, LK3/s;->g()V

    .line 283
    .line 284
    .line 285
    goto/16 :goto_a

    .line 286
    .line 287
    :cond_8
    new-instance v12, Ljava/util/ArrayList;

    .line 288
    .line 289
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 290
    .line 291
    .line 292
    iget-object v14, v5, LS3/p;->e:LJ3/h;

    .line 293
    .line 294
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    const-string v14, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"

    .line 301
    .line 302
    invoke-static {v6, v14}, Lk3/q;->d(ILjava/lang/String;)Lk3/q;

    .line 303
    .line 304
    .line 305
    move-result-object v14

    .line 306
    if-nez v3, :cond_9

    .line 307
    .line 308
    invoke-virtual {v14, v6}, Lk3/q;->N(I)V

    .line 309
    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_9
    invoke-virtual {v14, v6, v3}, Lk3/q;->x(ILjava/lang/String;)V

    .line 313
    .line 314
    .line 315
    :goto_4
    iget-object v15, v8, LS3/q;->a:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v15, Landroidx/work/impl/WorkDatabase_Impl;

    .line 318
    .line 319
    invoke-virtual {v15}, Lk3/m;->b()V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v15, v14}, Lk3/m;->l(Lo3/f;)Landroid/database/Cursor;

    .line 323
    .line 324
    .line 325
    move-result-object v15

    .line 326
    :try_start_5
    new-instance v13, Ljava/util/ArrayList;

    .line 327
    .line 328
    invoke-interface {v15}, Landroid/database/Cursor;->getCount()I

    .line 329
    .line 330
    .line 331
    move-result v6

    .line 332
    invoke-direct {v13, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 333
    .line 334
    .line 335
    :goto_5
    invoke-interface {v15}, Landroid/database/Cursor;->moveToNext()Z

    .line 336
    .line 337
    .line 338
    move-result v6

    .line 339
    if-eqz v6, :cond_b

    .line 340
    .line 341
    invoke-interface {v15, v2}, Landroid/database/Cursor;->isNull(I)Z

    .line 342
    .line 343
    .line 344
    move-result v6

    .line 345
    if-eqz v6, :cond_a

    .line 346
    .line 347
    const/4 v6, 0x0

    .line 348
    goto :goto_6

    .line 349
    :cond_a
    invoke-interface {v15, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    :goto_6
    invoke-static {v6}, LJ3/h;->a([B)LJ3/h;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 358
    .line 359
    .line 360
    goto :goto_5

    .line 361
    :catchall_1
    move-exception v0

    .line 362
    goto/16 :goto_c

    .line 363
    .line 364
    :cond_b
    invoke-interface {v15}, Landroid/database/Cursor;->close()V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v14}, Lk3/q;->h()V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0, v12}, LJ3/k;->a(Ljava/util/ArrayList;)LJ3/h;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    :goto_7
    new-instance v6, Landroidx/work/WorkerParameters;

    .line 378
    .line 379
    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 380
    .line 381
    .line 382
    move-result-object v12

    .line 383
    iget-object v13, v11, LJ3/b;->a:Ljava/util/concurrent/ExecutorService;

    .line 384
    .line 385
    new-instance v14, LT3/u;

    .line 386
    .line 387
    iget-object v15, v1, LK3/s;->g:Lb7/k;

    .line 388
    .line 389
    invoke-direct {v14, v7, v15}, LT3/u;-><init>(Landroidx/work/impl/WorkDatabase;Lb7/k;)V

    .line 390
    .line 391
    .line 392
    new-instance v2, LT3/t;

    .line 393
    .line 394
    move-object/from16 v16, v3

    .line 395
    .line 396
    iget-object v3, v1, LK3/s;->j:LK3/f;

    .line 397
    .line 398
    invoke-direct {v2, v7, v3, v15}, LT3/t;-><init>(Landroidx/work/impl/WorkDatabase;LK3/f;Lb7/k;)V

    .line 399
    .line 400
    .line 401
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 402
    .line 403
    .line 404
    iput-object v12, v6, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 405
    .line 406
    iput-object v0, v6, Landroidx/work/WorkerParameters;->b:LJ3/h;

    .line 407
    .line 408
    new-instance v0, Ljava/util/HashSet;

    .line 409
    .line 410
    invoke-direct {v0, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 411
    .line 412
    .line 413
    iput-object v0, v6, Landroidx/work/WorkerParameters;->c:Ljava/util/HashSet;

    .line 414
    .line 415
    iget-object v0, v1, LK3/s;->d:Lb7/k;

    .line 416
    .line 417
    iput-object v0, v6, Landroidx/work/WorkerParameters;->d:Lb7/k;

    .line 418
    .line 419
    iget v0, v5, LS3/p;->k:I

    .line 420
    .line 421
    iput v0, v6, Landroidx/work/WorkerParameters;->e:I

    .line 422
    .line 423
    iput-object v13, v6, Landroidx/work/WorkerParameters;->f:Ljava/util/concurrent/ExecutorService;

    .line 424
    .line 425
    iput-object v15, v6, Landroidx/work/WorkerParameters;->g:Lb7/k;

    .line 426
    .line 427
    iget-object v0, v11, LJ3/b;->c:LJ3/y;

    .line 428
    .line 429
    iput-object v0, v6, Landroidx/work/WorkerParameters;->h:LJ3/y;

    .line 430
    .line 431
    iput-object v14, v6, Landroidx/work/WorkerParameters;->i:LT3/u;

    .line 432
    .line 433
    iput-object v2, v6, Landroidx/work/WorkerParameters;->j:LT3/t;

    .line 434
    .line 435
    iget-object v3, v1, LK3/s;->f:LJ3/q;

    .line 436
    .line 437
    if-nez v3, :cond_c

    .line 438
    .line 439
    iget-object v3, v1, LK3/s;->a:Landroid/content/Context;

    .line 440
    .line 441
    invoke-virtual {v0, v3, v9, v6}, LJ3/z;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)LJ3/q;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    iput-object v0, v1, LK3/s;->f:LJ3/q;

    .line 446
    .line 447
    :cond_c
    iget-object v0, v1, LK3/s;->f:LJ3/q;

    .line 448
    .line 449
    if-nez v0, :cond_d

    .line 450
    .line 451
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    new-instance v2, Ljava/lang/StringBuilder;

    .line 456
    .line 457
    const-string v3, "Could not create Worker "

    .line 458
    .line 459
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    invoke-virtual {v0, v10, v2}, LJ3/r;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v1}, LK3/s;->g()V

    .line 473
    .line 474
    .line 475
    goto/16 :goto_a

    .line 476
    .line 477
    :cond_d
    invoke-virtual {v0}, LJ3/q;->isUsed()Z

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    if-eqz v0, :cond_e

    .line 482
    .line 483
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    new-instance v2, Ljava/lang/StringBuilder;

    .line 488
    .line 489
    const-string v3, "Received an already-used Worker "

    .line 490
    .line 491
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    const-string v3, "; Worker Factory should return new instances"

    .line 498
    .line 499
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    invoke-virtual {v0, v10, v2}, LJ3/r;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v1}, LK3/s;->g()V

    .line 510
    .line 511
    .line 512
    goto/16 :goto_a

    .line 513
    .line 514
    :cond_e
    iget-object v0, v1, LK3/s;->f:LJ3/q;

    .line 515
    .line 516
    invoke-virtual {v0}, LJ3/q;->setUsed()V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v7}, Lk3/m;->c()V

    .line 520
    .line 521
    .line 522
    move-object/from16 v3, v16

    .line 523
    .line 524
    :try_start_6
    invoke-virtual {v8, v3}, LS3/q;->e(Ljava/lang/String;)I

    .line 525
    .line 526
    .line 527
    move-result v0

    .line 528
    const/4 v4, 0x1

    .line 529
    if-ne v0, v4, :cond_10

    .line 530
    .line 531
    const/4 v0, 0x2

    .line 532
    invoke-virtual {v8, v0, v3}, LS3/q;->l(ILjava/lang/String;)V

    .line 533
    .line 534
    .line 535
    iget-object v0, v8, LS3/q;->a:Ljava/lang/Object;

    .line 536
    .line 537
    move-object v4, v0

    .line 538
    check-cast v4, Landroidx/work/impl/WorkDatabase_Impl;

    .line 539
    .line 540
    invoke-virtual {v4}, Lk3/m;->b()V

    .line 541
    .line 542
    .line 543
    iget-object v0, v8, LS3/q;->h:Ljava/lang/Object;

    .line 544
    .line 545
    move-object v5, v0

    .line 546
    check-cast v5, LS3/h;

    .line 547
    .line 548
    invoke-virtual {v5}, LE9/c;->a()Lo3/g;

    .line 549
    .line 550
    .line 551
    move-result-object v6

    .line 552
    if-nez v3, :cond_f

    .line 553
    .line 554
    const/4 v8, 0x1

    .line 555
    invoke-interface {v6, v8}, Lo3/e;->N(I)V

    .line 556
    .line 557
    .line 558
    goto :goto_8

    .line 559
    :cond_f
    const/4 v8, 0x1

    .line 560
    invoke-interface {v6, v8, v3}, Lo3/e;->x(ILjava/lang/String;)V

    .line 561
    .line 562
    .line 563
    :goto_8
    invoke-virtual {v4}, Lk3/m;->c()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 564
    .line 565
    .line 566
    :try_start_7
    invoke-interface {v6}, Lo3/g;->g()I

    .line 567
    .line 568
    .line 569
    invoke-virtual {v4}, Lk3/m;->n()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 570
    .line 571
    .line 572
    :try_start_8
    invoke-virtual {v4}, Lk3/m;->j()V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v5, v6}, LE9/c;->q(Lo3/g;)V

    .line 576
    .line 577
    .line 578
    move v6, v8

    .line 579
    goto :goto_9

    .line 580
    :catchall_2
    move-exception v0

    .line 581
    invoke-virtual {v4}, Lk3/m;->j()V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v5, v6}, LE9/c;->q(Lo3/g;)V

    .line 585
    .line 586
    .line 587
    throw v0

    .line 588
    :catchall_3
    move-exception v0

    .line 589
    goto :goto_b

    .line 590
    :cond_10
    const/4 v6, 0x0

    .line 591
    :goto_9
    invoke-virtual {v7}, Lk3/m;->n()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 592
    .line 593
    .line 594
    invoke-virtual {v7}, Lk3/m;->j()V

    .line 595
    .line 596
    .line 597
    if-eqz v6, :cond_12

    .line 598
    .line 599
    invoke-virtual {v1}, LK3/s;->h()Z

    .line 600
    .line 601
    .line 602
    move-result v0

    .line 603
    if-eqz v0, :cond_11

    .line 604
    .line 605
    goto :goto_a

    .line 606
    :cond_11
    new-instance v16, LT3/s;

    .line 607
    .line 608
    iget-object v0, v1, LK3/s;->f:LJ3/q;

    .line 609
    .line 610
    iget-object v3, v1, LK3/s;->a:Landroid/content/Context;

    .line 611
    .line 612
    iget-object v4, v1, LK3/s;->e:LS3/p;

    .line 613
    .line 614
    iget-object v5, v1, LK3/s;->g:Lb7/k;

    .line 615
    .line 616
    move-object/from16 v19, v0

    .line 617
    .line 618
    move-object/from16 v20, v2

    .line 619
    .line 620
    move-object/from16 v17, v3

    .line 621
    .line 622
    move-object/from16 v18, v4

    .line 623
    .line 624
    move-object/from16 v21, v5

    .line 625
    .line 626
    invoke-direct/range {v16 .. v21}, LT3/s;-><init>(Landroid/content/Context;LS3/p;LJ3/q;LT3/t;Lb7/k;)V

    .line 627
    .line 628
    .line 629
    move-object/from16 v0, v16

    .line 630
    .line 631
    iget-object v2, v15, Lb7/k;->d:Ljava/lang/Object;

    .line 632
    .line 633
    check-cast v2, LA7/V0;

    .line 634
    .line 635
    invoke-virtual {v2, v0}, LA7/V0;->execute(Ljava/lang/Runnable;)V

    .line 636
    .line 637
    .line 638
    new-instance v2, LC8/d;

    .line 639
    .line 640
    iget-object v0, v0, LT3/s;->a:LU3/j;

    .line 641
    .line 642
    const/16 v3, 0x10

    .line 643
    .line 644
    invoke-direct {v2, v3, v1, v0}, LC8/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 645
    .line 646
    .line 647
    new-instance v3, LT3/o;

    .line 648
    .line 649
    const/4 v4, 0x0

    .line 650
    invoke-direct {v3, v4}, LT3/o;-><init>(I)V

    .line 651
    .line 652
    .line 653
    iget-object v4, v1, LK3/s;->q:LU3/j;

    .line 654
    .line 655
    invoke-virtual {v4, v2, v3}, LU3/h;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 656
    .line 657
    .line 658
    new-instance v2, LA7/p;

    .line 659
    .line 660
    const/16 v3, 0x1a

    .line 661
    .line 662
    invoke-direct {v2, v3, v1, v0}, LA7/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 663
    .line 664
    .line 665
    iget-object v3, v15, Lb7/k;->d:Ljava/lang/Object;

    .line 666
    .line 667
    check-cast v3, LA7/V0;

    .line 668
    .line 669
    invoke-virtual {v0, v2, v3}, LU3/h;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 670
    .line 671
    .line 672
    iget-object v0, v1, LK3/s;->o:Ljava/lang/String;

    .line 673
    .line 674
    new-instance v2, LA7/p;

    .line 675
    .line 676
    const/16 v3, 0x1b

    .line 677
    .line 678
    invoke-direct {v2, v3, v1, v0}, LA7/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 679
    .line 680
    .line 681
    iget-object v0, v15, Lb7/k;->b:Ljava/lang/Object;

    .line 682
    .line 683
    check-cast v0, LT3/m;

    .line 684
    .line 685
    invoke-virtual {v4, v2, v0}, LU3/h;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 686
    .line 687
    .line 688
    goto :goto_a

    .line 689
    :cond_12
    invoke-virtual {v1}, LK3/s;->f()V

    .line 690
    .line 691
    .line 692
    :goto_a
    return-void

    .line 693
    :goto_b
    invoke-virtual {v7}, Lk3/m;->j()V

    .line 694
    .line 695
    .line 696
    throw v0

    .line 697
    :goto_c
    invoke-interface {v15}, Landroid/database/Cursor;->close()V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v14}, Lk3/q;->h()V

    .line 701
    .line 702
    .line 703
    throw v0

    .line 704
    :goto_d
    invoke-virtual {v7}, Lk3/m;->j()V

    .line 705
    .line 706
    .line 707
    throw v0
.end method
