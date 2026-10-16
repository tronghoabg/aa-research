.class public final Lk2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/G;


# instance fields
.field public final a:LF6/r;

.field public b:LS3/c;

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:F

.field public final g:F

.field public h:Z


# direct methods
.method public constructor <init>(LS3/c;Ls2/k;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lk2/v;->b:LS3/c;

    .line 6
    new-instance v0, Lwa/a;

    const/16 v1, 0x18

    .line 7
    invoke-direct {v0, v1}, Lwa/a;-><init>(I)V

    .line 8
    new-instance v1, LF6/r;

    invoke-direct {v1, p2, v0}, LF6/r;-><init>(Ls2/k;Lwa/a;)V

    iput-object v1, p0, Lk2/v;->a:LF6/r;

    .line 9
    iget-object p2, v1, LF6/r;->f:Ljava/lang/Object;

    check-cast p2, LS3/c;

    if-eq p1, p2, :cond_0

    .line 10
    iput-object p1, v1, LF6/r;->f:Ljava/lang/Object;

    .line 11
    iget-object p1, v1, LF6/r;->d:Ljava/lang/Object;

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 12
    iget-object p1, v1, LF6/r;->e:Ljava/lang/Object;

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    iput-wide p1, p0, Lk2/v;->c:J

    .line 14
    iput-wide p1, p0, Lk2/v;->d:J

    .line 15
    iput-wide p1, p0, Lk2/v;->e:J

    const p1, -0x800001

    .line 16
    iput p1, p0, Lk2/v;->f:F

    .line 17
    iput p1, p0, Lk2/v;->g:F

    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lk2/v;->h:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, LS3/c;

    const/16 v1, 0x14

    invoke-direct {v0, p1, v1}, LS3/c;-><init>(Landroid/content/Context;I)V

    .line 2
    new-instance p1, Ls2/k;

    invoke-direct {p1}, Ls2/k;-><init>()V

    invoke-direct {p0, v0, p1}, Lk2/v;-><init>(LS3/c;Ls2/k;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ls2/k;)V
    .locals 2

    .line 3
    new-instance v0, LS3/c;

    const/16 v1, 0x14

    invoke-direct {v0, p1, v1}, LS3/c;-><init>(Landroid/content/Context;I)V

    invoke-direct {p0, v0, p2}, Lk2/v;-><init>(LS3/c;Ls2/k;)V

    return-void
.end method

.method public static d(Ljava/lang/Class;LS3/c;)Lk2/G;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    new-array v2, v1, [Ljava/lang/Class;

    .line 4
    .line 5
    const-class v3, LS1/g;

    .line 6
    .line 7
    aput-object v3, v2, v0

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-array v1, v1, [Ljava/lang/Object;

    .line 14
    .line 15
    aput-object p1, v1, v0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lk2/G;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :catch_0
    move-exception p0

    .line 25
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw p1
.end method


# virtual methods
.method public final a(Lwa/a;)Lk2/G;
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/v;->a:LF6/r;

    .line 2
    .line 3
    iput-object p1, v0, LF6/r;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, v0, LF6/r;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ls2/k;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    iput-object p1, v1, Ls2/k;->f:Lwa/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit v1

    .line 13
    iget-object v0, v0, LF6/r;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lk2/G;

    .line 36
    .line 37
    invoke-interface {v1, p1}, Lk2/G;->a(Lwa/a;)Lk2/G;

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-object p0

    .line 42
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    throw p1

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_1
.end method

.method public final b(Z)Lk2/G;
    .locals 2

    .line 1
    iput-boolean p1, p0, Lk2/v;->h:Z

    .line 2
    .line 3
    iget-object v0, p0, Lk2/v;->a:LF6/r;

    .line 4
    .line 5
    iput-boolean p1, v0, LF6/r;->b:Z

    .line 6
    .line 7
    iget-object v1, v0, LF6/r;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ls2/k;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    iput-boolean p1, v1, Ls2/k;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v1

    .line 15
    iget-object v0, v0, LF6/r;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lk2/G;

    .line 38
    .line 39
    invoke-interface {v1, p1}, Lk2/G;->b(Z)Lk2/G;

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-object p0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw p1
.end method

.method public final c(LN1/w;)Lk2/a;
    .locals 12

    .line 1
    iget-object v0, p1, LN1/w;->b:LN1/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LN1/w;->b:LN1/t;

    .line 7
    .line 8
    iget-object v0, v0, LN1/t;->a:Landroid/net/Uri;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const-string v2, "ssai"

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    throw v1

    .line 27
    :cond_1
    :goto_0
    iget-object v0, p1, LN1/w;->b:LN1/t;

    .line 28
    .line 29
    iget-object v0, v0, LN1/t;->b:Ljava/lang/String;

    .line 30
    .line 31
    const-string v2, "application/x-image-uri"

    .line 32
    .line 33
    invoke-static {v0, v2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_e

    .line 38
    .line 39
    iget-object v0, p1, LN1/w;->b:LN1/t;

    .line 40
    .line 41
    iget-object v2, v0, LN1/t;->a:Landroid/net/Uri;

    .line 42
    .line 43
    iget-object v0, v0, LN1/t;->b:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v2, v0}, LQ1/x;->D(Landroid/net/Uri;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-object v2, p1, LN1/w;->b:LN1/t;

    .line 50
    .line 51
    iget-wide v2, v2, LN1/t;->f:J

    .line 52
    .line 53
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    cmp-long v2, v2, v4

    .line 59
    .line 60
    const/4 v3, 0x1

    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    iget-object v2, p0, Lk2/v;->a:LF6/r;

    .line 64
    .line 65
    iget-object v2, v2, LF6/r;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Ls2/k;

    .line 68
    .line 69
    monitor-enter v2

    .line 70
    :try_start_0
    iput v3, v2, Ls2/k;->g:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    monitor-exit v2

    .line 73
    goto :goto_1

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    move-object p1, v0

    .line 76
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    throw p1

    .line 78
    :cond_2
    :goto_1
    :try_start_2
    iget-object v2, p0, Lk2/v;->a:LF6/r;

    .line 79
    .line 80
    iget-object v6, v2, LF6/r;->e:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v6, Ljava/util/HashMap;

    .line 83
    .line 84
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    check-cast v7, Lk2/G;

    .line 93
    .line 94
    if-eqz v7, :cond_3

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    invoke-virtual {v2, v0}, LF6/r;->c(I)Lk8/p;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    invoke-interface {v7}, Lk8/p;->get()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    check-cast v7, Lk2/G;

    .line 106
    .line 107
    iget-object v8, v2, LF6/r;->g:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v8, Lwa/a;

    .line 110
    .line 111
    invoke-interface {v7, v8}, Lk2/G;->a(Lwa/a;)Lk2/G;

    .line 112
    .line 113
    .line 114
    iget-boolean v2, v2, LF6/r;->b:Z

    .line 115
    .line 116
    invoke-interface {v7, v2}, Lk2/G;->b(Z)Lk2/G;

    .line 117
    .line 118
    .line 119
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v6, v0, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    .line 124
    .line 125
    .line 126
    :goto_2
    iget-object v0, p1, LN1/w;->c:LN1/s;

    .line 127
    .line 128
    invoke-virtual {v0}, LN1/s;->a()LE5/Y;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iget-object v2, p1, LN1/w;->c:LN1/s;

    .line 133
    .line 134
    iget-wide v8, v2, LN1/s;->a:J

    .line 135
    .line 136
    cmp-long v6, v8, v4

    .line 137
    .line 138
    if-nez v6, :cond_4

    .line 139
    .line 140
    iget-wide v8, p0, Lk2/v;->c:J

    .line 141
    .line 142
    iput-wide v8, v0, LE5/Y;->a:J

    .line 143
    .line 144
    :cond_4
    iget v6, v2, LN1/s;->d:F

    .line 145
    .line 146
    const v8, -0x800001

    .line 147
    .line 148
    .line 149
    cmpl-float v6, v6, v8

    .line 150
    .line 151
    if-nez v6, :cond_5

    .line 152
    .line 153
    iget v6, p0, Lk2/v;->f:F

    .line 154
    .line 155
    iput v6, v0, LE5/Y;->d:F

    .line 156
    .line 157
    :cond_5
    iget v6, v2, LN1/s;->e:F

    .line 158
    .line 159
    cmpl-float v6, v6, v8

    .line 160
    .line 161
    if-nez v6, :cond_6

    .line 162
    .line 163
    iget v6, p0, Lk2/v;->g:F

    .line 164
    .line 165
    iput v6, v0, LE5/Y;->e:F

    .line 166
    .line 167
    :cond_6
    iget-wide v8, v2, LN1/s;->b:J

    .line 168
    .line 169
    cmp-long v6, v8, v4

    .line 170
    .line 171
    if-nez v6, :cond_7

    .line 172
    .line 173
    iget-wide v8, p0, Lk2/v;->d:J

    .line 174
    .line 175
    iput-wide v8, v0, LE5/Y;->b:J

    .line 176
    .line 177
    :cond_7
    iget-wide v8, v2, LN1/s;->c:J

    .line 178
    .line 179
    cmp-long v2, v8, v4

    .line 180
    .line 181
    if-nez v2, :cond_8

    .line 182
    .line 183
    iget-wide v4, p0, Lk2/v;->e:J

    .line 184
    .line 185
    iput-wide v4, v0, LE5/Y;->c:J

    .line 186
    .line 187
    :cond_8
    new-instance v2, LN1/s;

    .line 188
    .line 189
    invoke-direct {v2, v0}, LN1/s;-><init>(LE5/Y;)V

    .line 190
    .line 191
    .line 192
    iget-object v0, p1, LN1/w;->c:LN1/s;

    .line 193
    .line 194
    invoke-virtual {v2, v0}, LN1/s;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-nez v0, :cond_9

    .line 199
    .line 200
    invoke-virtual {p1}, LN1/w;->a()LN1/p;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {v2}, LN1/s;->a()LE5/Y;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    iput-object v0, p1, LN1/p;->k:LE5/Y;

    .line 209
    .line 210
    invoke-virtual {p1}, LN1/p;->a()LN1/w;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    :cond_9
    invoke-interface {v7, p1}, Lk2/G;->c(LN1/w;)Lk2/a;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    iget-object v2, p1, LN1/w;->b:LN1/t;

    .line 219
    .line 220
    iget-object v2, v2, LN1/t;->d:Ll8/K;

    .line 221
    .line 222
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    if-nez v4, :cond_c

    .line 227
    .line 228
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    add-int/2addr v4, v3

    .line 233
    new-array v4, v4, [Lk2/a;

    .line 234
    .line 235
    const/4 v5, 0x0

    .line 236
    aput-object v0, v4, v5

    .line 237
    .line 238
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    if-lez v0, :cond_b

    .line 243
    .line 244
    iget-boolean p1, p0, Lk2/v;->h:Z

    .line 245
    .line 246
    if-eqz p1, :cond_a

    .line 247
    .line 248
    new-instance p1, LN1/m;

    .line 249
    .line 250
    invoke-direct {p1}, LN1/m;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    check-cast v0, LN1/v;

    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    sget-object v0, LN1/C;->a:Ljava/util/ArrayList;

    .line 263
    .line 264
    iput-object v1, p1, LN1/m;->m:Ljava/lang/String;

    .line 265
    .line 266
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    check-cast v0, LN1/v;

    .line 271
    .line 272
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    iput-object v1, p1, LN1/m;->d:Ljava/lang/String;

    .line 276
    .line 277
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    check-cast v0, LN1/v;

    .line 282
    .line 283
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    iput v5, p1, LN1/m;->e:I

    .line 287
    .line 288
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    check-cast v0, LN1/v;

    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    iput v5, p1, LN1/m;->f:I

    .line 298
    .line 299
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    check-cast v0, LN1/v;

    .line 304
    .line 305
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    iput-object v1, p1, LN1/m;->b:Ljava/lang/String;

    .line 309
    .line 310
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    check-cast v0, LN1/v;

    .line 315
    .line 316
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    iput-object v1, p1, LN1/m;->a:Ljava/lang/String;

    .line 320
    .line 321
    new-instance v0, LN1/n;

    .line 322
    .line 323
    invoke-direct {v0, p1}, LN1/n;-><init>(LN1/m;)V

    .line 324
    .line 325
    .line 326
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    check-cast p1, LN1/v;

    .line 331
    .line 332
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    throw v1

    .line 336
    :cond_a
    iget-object p1, p0, Lk2/v;->b:LS3/c;

    .line 337
    .line 338
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    check-cast p1, LN1/v;

    .line 346
    .line 347
    new-instance v0, Ljava/util/ArrayList;

    .line 348
    .line 349
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 350
    .line 351
    .line 352
    new-instance v0, Ljava/util/HashSet;

    .line 353
    .line 354
    invoke-direct {v0, v3}, Ljava/util/HashSet;-><init>(I)V

    .line 355
    .line 356
    .line 357
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 358
    .line 359
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 360
    .line 361
    .line 362
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 363
    .line 364
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 365
    .line 366
    .line 367
    sget-object v0, Ll8/K;->b:Ll8/I;

    .line 368
    .line 369
    sget-object v0, Ll8/e0;->e:Ll8/e0;

    .line 370
    .line 371
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 372
    .line 373
    sget-object v0, Ll8/e0;->e:Ll8/e0;

    .line 374
    .line 375
    sget-object v0, LN1/u;->a:LN1/u;

    .line 376
    .line 377
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 378
    .line 379
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    throw v1

    .line 383
    :cond_b
    new-instance v0, Lk2/Q;

    .line 384
    .line 385
    invoke-direct {v0, v4}, Lk2/Q;-><init>([Lk2/a;)V

    .line 386
    .line 387
    .line 388
    :cond_c
    move-object v6, v0

    .line 389
    iget-object v0, p1, LN1/w;->e:LN1/r;

    .line 390
    .line 391
    iget-wide v9, v0, LN1/q;->a:J

    .line 392
    .line 393
    const-wide/high16 v0, -0x8000000000000000L

    .line 394
    .line 395
    cmp-long v0, v9, v0

    .line 396
    .line 397
    if-nez v0, :cond_d

    .line 398
    .line 399
    goto :goto_3

    .line 400
    :cond_d
    new-instance v5, Lk2/h;

    .line 401
    .line 402
    const/4 v11, 0x1

    .line 403
    const-wide/16 v7, 0x0

    .line 404
    .line 405
    invoke-direct/range {v5 .. v11}, Lk2/h;-><init>(Lk2/a;JJZ)V

    .line 406
    .line 407
    .line 408
    move-object v6, v5

    .line 409
    :goto_3
    iget-object v0, p1, LN1/w;->b:LN1/t;

    .line 410
    .line 411
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    iget-object p1, p1, LN1/w;->b:LN1/t;

    .line 415
    .line 416
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    return-object v6

    .line 420
    :catch_0
    move-exception v0

    .line 421
    move-object p1, v0

    .line 422
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 423
    .line 424
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 425
    .line 426
    .line 427
    throw v0

    .line 428
    :cond_e
    iget-object p1, p1, LN1/w;->b:LN1/t;

    .line 429
    .line 430
    iget-wide v2, p1, LN1/t;->f:J

    .line 431
    .line 432
    sget p1, LQ1/x;->a:I

    .line 433
    .line 434
    throw v1
.end method
