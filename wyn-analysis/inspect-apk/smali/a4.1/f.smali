.class public final La4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# static fields
.field public static final q:LBf/i;


# instance fields
.field public final a:Lcg/y;

.field public final b:J

.field public final c:Lcg/y;

.field public final d:Lcg/y;

.field public final e:Lcg/y;

.field public final f:Ljava/util/LinkedHashMap;

.field public final g:LKd/a;

.field public h:J

.field public i:I

.field public j:Lcg/A;

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public final p:La4/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LBf/i;

    .line 2
    .line 3
    const-string v1, "[a-z0-9_-]{1,120}"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LBf/i;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La4/f;->q:LBf/i;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(JLLf/d;Lcg/u;Lcg/y;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p5, p0, La4/f;->a:Lcg/y;

    .line 5
    .line 6
    iput-wide p1, p0, La4/f;->b:J

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    cmp-long p1, p1, v0

    .line 11
    .line 12
    if-lez p1, :cond_0

    .line 13
    .line 14
    const-string p1, "journal"

    .line 15
    .line 16
    invoke-virtual {p5, p1}, Lcg/y;->d(Ljava/lang/String;)Lcg/y;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La4/f;->c:Lcg/y;

    .line 21
    .line 22
    const-string p1, "journal.tmp"

    .line 23
    .line 24
    invoke-virtual {p5, p1}, Lcg/y;->d(Ljava/lang/String;)Lcg/y;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, La4/f;->d:Lcg/y;

    .line 29
    .line 30
    const-string p1, "journal.bkp"

    .line 31
    .line 32
    invoke-virtual {p5, p1}, Lcg/y;->d(Ljava/lang/String;)Lcg/y;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, La4/f;->e:Lcg/y;

    .line 37
    .line 38
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    const/high16 p5, 0x3f400000    # 0.75f

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    invoke-direct {p1, p2, p5, v0}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, La4/f;->f:Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    invoke-static {}, LEf/H;->f()LEf/I0;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p3, v0}, LLf/d;->y(I)LEf/A;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-static {p1, p2}, LFe/c;->B(Ljf/h;Ljf/h;)Ljf/h;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, La4/f;->g:LKd/a;

    .line 66
    .line 67
    new-instance p1, La4/d;

    .line 68
    .line 69
    invoke-direct {p1, p4}, La4/d;-><init>(Lcg/u;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, La4/f;->p:La4/d;

    .line 73
    .line 74
    return-void

    .line 75
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 76
    .line 77
    const-string p2, "maxSize <= 0"

    .line 78
    .line 79
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1
.end method

.method public static J(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, La4/f;->q:LBf/i;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LBf/i;->b(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string v0, "keys must match regex [a-z0-9_-]{1,120}: \""

    .line 11
    .line 12
    const/16 v1, 0x22

    .line 13
    .line 14
    invoke-static {v1, v0, p0}, Lka/n;->f(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0
.end method

.method public static final a(La4/f;LA7/b0;Z)V
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p1, LA7/b0;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, La4/b;

    .line 5
    .line 6
    iget-object v1, v0, La4/b;->g:LA7/b0;

    .line 7
    .line 8
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_e

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x2

    .line 16
    if-eqz p2, :cond_5

    .line 17
    .line 18
    iget-boolean v3, v0, La4/b;->f:Z

    .line 19
    .line 20
    if-nez v3, :cond_5

    .line 21
    .line 22
    move v3, v1

    .line 23
    :goto_0
    if-ge v3, v2, :cond_1

    .line 24
    .line 25
    iget-object v4, p1, LA7/b0;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, [Z

    .line 28
    .line 29
    aget-boolean v4, v4, v3

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    iget-object v4, p0, La4/f;->p:La4/d;

    .line 34
    .line 35
    iget-object v5, v0, La4/b;->d:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Lcg/y;

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Lcg/m;->c(Lcg/y;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-nez v4, :cond_0

    .line 48
    .line 49
    invoke-virtual {p1, v1}, LA7/b0;->l(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    monitor-exit p0

    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto/16 :goto_8

    .line 56
    .line 57
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move p1, v1

    .line 61
    :goto_1
    if-ge p1, v2, :cond_6

    .line 62
    .line 63
    :try_start_1
    iget-object v3, v0, La4/b;->d:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Lcg/y;

    .line 70
    .line 71
    iget-object v4, v0, La4/b;->c:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Lcg/y;

    .line 78
    .line 79
    iget-object v5, p0, La4/f;->p:La4/d;

    .line 80
    .line 81
    invoke-virtual {v5, v3}, Lcg/m;->c(Lcg/y;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_2

    .line 86
    .line 87
    iget-object v5, p0, La4/f;->p:La4/d;

    .line 88
    .line 89
    invoke-virtual {v5, v3, v4}, La4/d;->j(Lcg/y;Lcg/y;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    iget-object v3, p0, La4/f;->p:La4/d;

    .line 94
    .line 95
    iget-object v5, v0, La4/b;->c:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    check-cast v5, Lcg/y;

    .line 102
    .line 103
    invoke-virtual {v3, v5}, Lcg/m;->c(Lcg/y;)Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-nez v6, :cond_3

    .line 108
    .line 109
    invoke-virtual {v3, v5}, La4/d;->h(Lcg/y;)Lcg/F;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-static {v3}, Lk4/e;->a(Ljava/io/Closeable;)V

    .line 114
    .line 115
    .line 116
    :cond_3
    :goto_2
    iget-object v3, v0, La4/b;->b:[J

    .line 117
    .line 118
    aget-wide v5, v3, p1

    .line 119
    .line 120
    iget-object v3, p0, La4/f;->p:La4/d;

    .line 121
    .line 122
    invoke-virtual {v3, v4}, Lcg/m;->e(Lcg/y;)LR0/e;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    iget-object v3, v3, LR0/e;->e:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v3, Ljava/lang/Long;

    .line 129
    .line 130
    if-eqz v3, :cond_4

    .line 131
    .line 132
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 133
    .line 134
    .line 135
    move-result-wide v3

    .line 136
    goto :goto_3

    .line 137
    :cond_4
    const-wide/16 v3, 0x0

    .line 138
    .line 139
    :goto_3
    iget-object v7, v0, La4/b;->b:[J

    .line 140
    .line 141
    aput-wide v3, v7, p1

    .line 142
    .line 143
    iget-wide v7, p0, La4/f;->h:J

    .line 144
    .line 145
    sub-long/2addr v7, v5

    .line 146
    add-long/2addr v7, v3

    .line 147
    iput-wide v7, p0, La4/f;->h:J

    .line 148
    .line 149
    add-int/lit8 p1, p1, 0x1

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_5
    move p1, v1

    .line 153
    :goto_4
    if-ge p1, v2, :cond_6

    .line 154
    .line 155
    iget-object v3, p0, La4/f;->p:La4/d;

    .line 156
    .line 157
    iget-object v4, v0, La4/b;->d:Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    check-cast v4, Lcg/y;

    .line 164
    .line 165
    invoke-virtual {v3, v4}, Lcg/m;->b(Lcg/y;)V

    .line 166
    .line 167
    .line 168
    add-int/lit8 p1, p1, 0x1

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_6
    const/4 p1, 0x0

    .line 172
    iput-object p1, v0, La4/b;->g:LA7/b0;

    .line 173
    .line 174
    iget-boolean p1, v0, La4/b;->f:Z

    .line 175
    .line 176
    if-eqz p1, :cond_7

    .line 177
    .line 178
    invoke-virtual {p0, v0}, La4/f;->B(La4/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 179
    .line 180
    .line 181
    monitor-exit p0

    .line 182
    return-void

    .line 183
    :cond_7
    :try_start_2
    iget p1, p0, La4/f;->i:I

    .line 184
    .line 185
    const/4 v2, 0x1

    .line 186
    add-int/2addr p1, v2

    .line 187
    iput p1, p0, La4/f;->i:I

    .line 188
    .line 189
    iget-object p1, p0, La4/f;->j:Lcg/A;

    .line 190
    .line 191
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    const/16 v3, 0x20

    .line 195
    .line 196
    const/16 v4, 0xa

    .line 197
    .line 198
    if-nez p2, :cond_9

    .line 199
    .line 200
    iget-boolean p2, v0, La4/b;->e:Z

    .line 201
    .line 202
    if-eqz p2, :cond_8

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_8
    iget-object p2, p0, La4/f;->f:Ljava/util/LinkedHashMap;

    .line 206
    .line 207
    iget-object v5, v0, La4/b;->a:Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {p2, v5}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    const-string p2, "REMOVE"

    .line 213
    .line 214
    invoke-virtual {p1, p2}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, v3}, Lcg/A;->writeByte(I)Lcg/h;

    .line 218
    .line 219
    .line 220
    iget-object p2, v0, La4/b;->a:Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual {p1, p2}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1, v4}, Lcg/A;->writeByte(I)Lcg/h;

    .line 226
    .line 227
    .line 228
    goto :goto_7

    .line 229
    :cond_9
    :goto_5
    iput-boolean v2, v0, La4/b;->e:Z

    .line 230
    .line 231
    const-string p2, "CLEAN"

    .line 232
    .line 233
    invoke-virtual {p1, p2}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1, v3}, Lcg/A;->writeByte(I)Lcg/h;

    .line 237
    .line 238
    .line 239
    iget-object p2, v0, La4/b;->a:Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {p1, p2}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 242
    .line 243
    .line 244
    iget-object p2, v0, La4/b;->b:[J

    .line 245
    .line 246
    array-length v0, p2

    .line 247
    move v5, v1

    .line 248
    :goto_6
    if-ge v5, v0, :cond_a

    .line 249
    .line 250
    aget-wide v6, p2, v5

    .line 251
    .line 252
    invoke-virtual {p1, v3}, Lcg/A;->writeByte(I)Lcg/h;

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1, v6, v7}, Lcg/A;->writeDecimalLong(J)Lcg/h;

    .line 256
    .line 257
    .line 258
    add-int/lit8 v5, v5, 0x1

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_a
    invoke-virtual {p1, v4}, Lcg/A;->writeByte(I)Lcg/h;

    .line 262
    .line 263
    .line 264
    :goto_7
    invoke-virtual {p1}, Lcg/A;->flush()V

    .line 265
    .line 266
    .line 267
    iget-wide p1, p0, La4/f;->h:J

    .line 268
    .line 269
    iget-wide v3, p0, La4/f;->b:J

    .line 270
    .line 271
    cmp-long p1, p1, v3

    .line 272
    .line 273
    if-gtz p1, :cond_c

    .line 274
    .line 275
    iget p1, p0, La4/f;->i:I

    .line 276
    .line 277
    const/16 p2, 0x7d0

    .line 278
    .line 279
    if-lt p1, p2, :cond_b

    .line 280
    .line 281
    move v1, v2

    .line 282
    :cond_b
    if-eqz v1, :cond_d

    .line 283
    .line 284
    :cond_c
    invoke-virtual {p0}, La4/f;->i()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 285
    .line 286
    .line 287
    :cond_d
    monitor-exit p0

    .line 288
    return-void

    .line 289
    :cond_e
    :try_start_3
    const-string p1, "Check failed."

    .line 290
    .line 291
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 292
    .line 293
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    throw p2

    .line 297
    :goto_8
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 298
    throw p1
.end method


# virtual methods
.method public final B(La4/b;)V
    .locals 10

    .line 1
    iget v0, p1, La4/b;->h:I

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    iget-object v3, p1, La4/b;->a:Ljava/lang/String;

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, La4/f;->j:Lcg/A;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string v4, "DIRTY"

    .line 16
    .line 17
    invoke-virtual {v0, v4}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Lcg/A;->writeByte(I)Lcg/h;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v3}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcg/A;->writeByte(I)Lcg/h;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcg/A;->flush()V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget v0, p1, La4/b;->h:I

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    if-gtz v0, :cond_5

    .line 36
    .line 37
    iget-object v0, p1, La4/b;->g:LA7/b0;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/4 v0, 0x0

    .line 43
    :goto_0
    const/4 v5, 0x2

    .line 44
    if-ge v0, v5, :cond_2

    .line 45
    .line 46
    iget-object v5, p1, La4/b;->c:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    check-cast v5, Lcg/y;

    .line 53
    .line 54
    iget-object v6, p0, La4/f;->p:La4/d;

    .line 55
    .line 56
    invoke-virtual {v6, v5}, Lcg/m;->b(Lcg/y;)V

    .line 57
    .line 58
    .line 59
    iget-wide v5, p0, La4/f;->h:J

    .line 60
    .line 61
    iget-object v7, p1, La4/b;->b:[J

    .line 62
    .line 63
    aget-wide v8, v7, v0

    .line 64
    .line 65
    sub-long/2addr v5, v8

    .line 66
    iput-wide v5, p0, La4/f;->h:J

    .line 67
    .line 68
    const-wide/16 v5, 0x0

    .line 69
    .line 70
    aput-wide v5, v7, v0

    .line 71
    .line 72
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    iget p1, p0, La4/f;->i:I

    .line 76
    .line 77
    add-int/2addr p1, v4

    .line 78
    iput p1, p0, La4/f;->i:I

    .line 79
    .line 80
    iget-object p1, p0, La4/f;->j:Lcg/A;

    .line 81
    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    const-string v0, "REMOVE"

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v2}, Lcg/A;->writeByte(I)Lcg/h;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v3}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v1}, Lcg/A;->writeByte(I)Lcg/h;

    .line 96
    .line 97
    .line 98
    :cond_3
    iget-object p1, p0, La4/f;->f:Ljava/util/LinkedHashMap;

    .line 99
    .line 100
    invoke-virtual {p1, v3}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    iget p1, p0, La4/f;->i:I

    .line 104
    .line 105
    const/16 v0, 0x7d0

    .line 106
    .line 107
    if-lt p1, v0, :cond_4

    .line 108
    .line 109
    invoke-virtual {p0}, La4/f;->i()V

    .line 110
    .line 111
    .line 112
    :cond_4
    return-void

    .line 113
    :cond_5
    :goto_1
    iput-boolean v4, p1, La4/b;->f:Z

    .line 114
    .line 115
    return-void
.end method

.method public final D()V
    .locals 4

    .line 1
    :goto_0
    iget-wide v0, p0, La4/f;->h:J

    .line 2
    .line 3
    iget-wide v2, p0, La4/f;->b:J

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-lez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, La4/f;->f:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, La4/b;

    .line 30
    .line 31
    iget-boolean v2, v1, La4/b;->f:Z

    .line 32
    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0, v1}, La4/f;->B(La4/b;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-void

    .line 40
    :cond_2
    const/4 v0, 0x0

    .line 41
    iput-boolean v0, p0, La4/f;->n:Z

    .line 42
    .line 43
    return-void
.end method

.method public final declared-synchronized P()V
    .locals 12

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, La4/f;->j:Lcg/A;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lcg/A;->close()V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto/16 :goto_7

    .line 12
    .line 13
    :cond_0
    :goto_0
    iget-object v0, p0, La4/f;->p:La4/d;

    .line 14
    .line 15
    iget-object v1, p0, La4/f;->d:Lcg/y;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, La4/d;->h(Lcg/y;)Lcg/F;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lcg/b;->c(Lcg/F;)Lcg/A;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    const/4 v1, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    :try_start_1
    const-string v3, "libcore.io.DiskLruCache"

    .line 28
    .line 29
    invoke-virtual {v0, v3}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 30
    .line 31
    .line 32
    const/16 v3, 0xa

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Lcg/A;->writeByte(I)Lcg/h;

    .line 35
    .line 36
    .line 37
    const-string v4, "1"

    .line 38
    .line 39
    invoke-virtual {v0, v4}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v3}, Lcg/A;->writeByte(I)Lcg/h;

    .line 43
    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    int-to-long v4, v4

    .line 47
    invoke-virtual {v0, v4, v5}, Lcg/A;->writeDecimalLong(J)Lcg/h;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v3}, Lcg/A;->writeByte(I)Lcg/h;

    .line 51
    .line 52
    .line 53
    const/4 v4, 0x2

    .line 54
    int-to-long v4, v4

    .line 55
    invoke-virtual {v0, v4, v5}, Lcg/A;->writeDecimalLong(J)Lcg/h;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v3}, Lcg/A;->writeByte(I)Lcg/h;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v3}, Lcg/A;->writeByte(I)Lcg/h;

    .line 62
    .line 63
    .line 64
    iget-object v4, p0, La4/f;->f:Ljava/util/LinkedHashMap;

    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_3

    .line 79
    .line 80
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    check-cast v5, La4/b;

    .line 85
    .line 86
    iget-object v6, v5, La4/b;->g:LA7/b0;

    .line 87
    .line 88
    const/16 v7, 0x20

    .line 89
    .line 90
    if-eqz v6, :cond_1

    .line 91
    .line 92
    const-string v6, "DIRTY"

    .line 93
    .line 94
    invoke-virtual {v0, v6}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v7}, Lcg/A;->writeByte(I)Lcg/h;

    .line 98
    .line 99
    .line 100
    iget-object v5, v5, La4/b;->a:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v0, v5}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v3}, Lcg/A;->writeByte(I)Lcg/h;

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :catchall_1
    move-exception v3

    .line 110
    goto :goto_3

    .line 111
    :cond_1
    const-string v6, "CLEAN"

    .line 112
    .line 113
    invoke-virtual {v0, v6}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v7}, Lcg/A;->writeByte(I)Lcg/h;

    .line 117
    .line 118
    .line 119
    iget-object v6, v5, La4/b;->a:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v0, v6}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 122
    .line 123
    .line 124
    iget-object v5, v5, La4/b;->b:[J

    .line 125
    .line 126
    array-length v6, v5

    .line 127
    move v8, v1

    .line 128
    :goto_2
    if-ge v8, v6, :cond_2

    .line 129
    .line 130
    aget-wide v9, v5, v8

    .line 131
    .line 132
    invoke-virtual {v0, v7}, Lcg/A;->writeByte(I)Lcg/h;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v9, v10}, Lcg/A;->writeDecimalLong(J)Lcg/h;

    .line 136
    .line 137
    .line 138
    add-int/lit8 v8, v8, 0x1

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_2
    invoke-virtual {v0, v3}, Lcg/A;->writeByte(I)Lcg/h;

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_3
    sget-object v3, Lef/C;->a:Lef/C;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :goto_3
    move-object v11, v3

    .line 149
    move-object v3, v2

    .line 150
    move-object v2, v11

    .line 151
    :goto_4
    :try_start_2
    invoke-virtual {v0}, Lcg/A;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 152
    .line 153
    .line 154
    goto :goto_5

    .line 155
    :catchall_2
    move-exception v0

    .line 156
    if-nez v2, :cond_4

    .line 157
    .line 158
    move-object v2, v0

    .line 159
    goto :goto_5

    .line 160
    :cond_4
    :try_start_3
    invoke-static {v2, v0}, LFe/b;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    :goto_5
    if-nez v2, :cond_6

    .line 164
    .line 165
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    iget-object v0, p0, La4/f;->p:La4/d;

    .line 169
    .line 170
    iget-object v2, p0, La4/f;->c:Lcg/y;

    .line 171
    .line 172
    invoke-virtual {v0, v2}, Lcg/m;->c(Lcg/y;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_5

    .line 177
    .line 178
    iget-object v0, p0, La4/f;->p:La4/d;

    .line 179
    .line 180
    iget-object v2, p0, La4/f;->c:Lcg/y;

    .line 181
    .line 182
    iget-object v3, p0, La4/f;->e:Lcg/y;

    .line 183
    .line 184
    invoke-virtual {v0, v2, v3}, La4/d;->j(Lcg/y;Lcg/y;)V

    .line 185
    .line 186
    .line 187
    iget-object v0, p0, La4/f;->p:La4/d;

    .line 188
    .line 189
    iget-object v2, p0, La4/f;->d:Lcg/y;

    .line 190
    .line 191
    iget-object v3, p0, La4/f;->c:Lcg/y;

    .line 192
    .line 193
    invoke-virtual {v0, v2, v3}, La4/d;->j(Lcg/y;Lcg/y;)V

    .line 194
    .line 195
    .line 196
    iget-object v0, p0, La4/f;->p:La4/d;

    .line 197
    .line 198
    iget-object v2, p0, La4/f;->e:Lcg/y;

    .line 199
    .line 200
    invoke-virtual {v0, v2}, Lcg/m;->b(Lcg/y;)V

    .line 201
    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_5
    iget-object v0, p0, La4/f;->p:La4/d;

    .line 205
    .line 206
    iget-object v2, p0, La4/f;->d:Lcg/y;

    .line 207
    .line 208
    iget-object v3, p0, La4/f;->c:Lcg/y;

    .line 209
    .line 210
    invoke-virtual {v0, v2, v3}, La4/d;->j(Lcg/y;Lcg/y;)V

    .line 211
    .line 212
    .line 213
    :goto_6
    invoke-virtual {p0}, La4/f;->o()Lcg/A;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    iput-object v0, p0, La4/f;->j:Lcg/A;

    .line 218
    .line 219
    iput v1, p0, La4/f;->i:I

    .line 220
    .line 221
    iput-boolean v1, p0, La4/f;->k:Z

    .line 222
    .line 223
    iput-boolean v1, p0, La4/f;->o:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 224
    .line 225
    monitor-exit p0

    .line 226
    return-void

    .line 227
    :cond_6
    :try_start_4
    throw v2

    .line 228
    :goto_7
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 229
    throw v0
.end method

.method public final declared-synchronized b(Ljava/lang/String;)LA7/b0;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, La4/f;->m:Z

    .line 3
    .line 4
    if-nez v0, :cond_7

    .line 5
    .line 6
    invoke-static {p1}, La4/f;->J(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, La4/f;->h()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La4/f;->f:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La4/b;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v2, v0, La4/b;->g:LA7/b0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v2, v1

    .line 27
    :goto_0
    if-eqz v2, :cond_1

    .line 28
    .line 29
    monitor-exit p0

    .line 30
    return-object v1

    .line 31
    :cond_1
    if-eqz v0, :cond_2

    .line 32
    .line 33
    :try_start_1
    iget v2, v0, La4/b;->h:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    monitor-exit p0

    .line 38
    return-object v1

    .line 39
    :cond_2
    :try_start_2
    iget-boolean v2, p0, La4/f;->n:Z

    .line 40
    .line 41
    if-nez v2, :cond_6

    .line 42
    .line 43
    iget-boolean v2, p0, La4/f;->o:Z

    .line 44
    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_3
    iget-object v2, p0, La4/f;->j:Lcg/A;

    .line 49
    .line 50
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    const-string v3, "DIRTY"

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 56
    .line 57
    .line 58
    const/16 v3, 0x20

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Lcg/A;->writeByte(I)Lcg/h;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, p1}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 64
    .line 65
    .line 66
    const/16 v3, 0xa

    .line 67
    .line 68
    invoke-virtual {v2, v3}, Lcg/A;->writeByte(I)Lcg/h;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lcg/A;->flush()V

    .line 72
    .line 73
    .line 74
    iget-boolean v2, p0, La4/f;->k:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 75
    .line 76
    if-eqz v2, :cond_4

    .line 77
    .line 78
    monitor-exit p0

    .line 79
    return-object v1

    .line 80
    :cond_4
    if-nez v0, :cond_5

    .line 81
    .line 82
    :try_start_3
    new-instance v0, La4/b;

    .line 83
    .line 84
    invoke-direct {v0, p0, p1}, La4/b;-><init>(La4/f;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, La4/f;->f:Ljava/util/LinkedHashMap;

    .line 88
    .line 89
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception p1

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    :goto_1
    new-instance p1, LA7/b0;

    .line 96
    .line 97
    invoke-direct {p1, p0, v0}, LA7/b0;-><init>(La4/f;La4/b;)V

    .line 98
    .line 99
    .line 100
    iput-object p1, v0, La4/b;->g:LA7/b0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 101
    .line 102
    monitor-exit p0

    .line 103
    return-object p1

    .line 104
    :cond_6
    :goto_2
    :try_start_4
    invoke-virtual {p0}, La4/f;->i()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 105
    .line 106
    .line 107
    monitor-exit p0

    .line 108
    return-object v1

    .line 109
    :cond_7
    :try_start_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    const-string v0, "cache is closed"

    .line 112
    .line 113
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p1

    .line 117
    :goto_3
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 118
    throw p1
.end method

.method public final declared-synchronized close()V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, La4/f;->l:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-boolean v0, p0, La4/f;->m:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v0, p0, La4/f;->f:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v2, 0x0

    .line 19
    new-array v3, v2, [La4/b;

    .line 20
    .line 21
    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    .line 26
    .line 27
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    check-cast v0, [La4/b;

    .line 31
    .line 32
    array-length v3, v0

    .line 33
    :goto_0
    if-ge v2, v3, :cond_2

    .line 34
    .line 35
    aget-object v4, v0, v2

    .line 36
    .line 37
    iget-object v4, v4, La4/b;->g:LA7/b0;

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    iget-object v5, v4, LA7/b0;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v5, La4/b;

    .line 44
    .line 45
    iget-object v6, v5, La4/b;->g:LA7/b0;

    .line 46
    .line 47
    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    iput-boolean v1, v5, La4/b;->f:Z

    .line 54
    .line 55
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-virtual {p0}, La4/f;->D()V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, La4/f;->g:LKd/a;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-static {v0, v2}, LEf/H;->j(LEf/E;Ljava/util/concurrent/CancellationException;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, La4/f;->j:Lcg/A;

    .line 70
    .line 71
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Lcg/A;->close()V

    .line 75
    .line 76
    .line 77
    iput-object v2, p0, La4/f;->j:Lcg/A;

    .line 78
    .line 79
    iput-boolean v1, p0, La4/f;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    monitor-exit p0

    .line 82
    return-void

    .line 83
    :cond_3
    :goto_1
    :try_start_1
    iput-boolean v1, p0, La4/f;->m:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    .line 85
    monitor-exit p0

    .line 86
    return-void

    .line 87
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 88
    throw v0
.end method

.method public final declared-synchronized d(Ljava/lang/String;)La4/c;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, La4/f;->m:Z

    .line 3
    .line 4
    if-nez v0, :cond_4

    .line 5
    .line 6
    invoke-static {p1}, La4/f;->J(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, La4/f;->h()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La4/f;->f:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La4/b;

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    invoke-virtual {v0}, La4/b;->a()La4/c;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    iget v1, p0, La4/f;->i:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    add-int/2addr v1, v2

    .line 33
    iput v1, p0, La4/f;->i:I

    .line 34
    .line 35
    iget-object v1, p0, La4/f;->j:Lcg/A;

    .line 36
    .line 37
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const-string v3, "READ"

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 43
    .line 44
    .line 45
    const/16 v3, 0x20

    .line 46
    .line 47
    invoke-virtual {v1, v3}, Lcg/A;->writeByte(I)Lcg/h;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1}, Lcg/A;->writeUtf8(Ljava/lang/String;)Lcg/h;

    .line 51
    .line 52
    .line 53
    const/16 p1, 0xa

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Lcg/A;->writeByte(I)Lcg/h;

    .line 56
    .line 57
    .line 58
    iget p1, p0, La4/f;->i:I

    .line 59
    .line 60
    const/16 v1, 0x7d0

    .line 61
    .line 62
    if-lt p1, v1, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const/4 v2, 0x0

    .line 66
    :goto_0
    if-eqz v2, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0}, La4/f;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_0
    move-exception p1

    .line 73
    goto :goto_3

    .line 74
    :cond_2
    :goto_1
    monitor-exit p0

    .line 75
    return-object v0

    .line 76
    :cond_3
    :goto_2
    monitor-exit p0

    .line 77
    const/4 p1, 0x0

    .line 78
    return-object p1

    .line 79
    :cond_4
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string v0, "cache is closed"

    .line 82
    .line 83
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :goto_3
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    throw p1
.end method

.method public final declared-synchronized flush()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, La4/f;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-boolean v0, p0, La4/f;->m:Z

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, La4/f;->D()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La4/f;->j:Lcg/A;

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcg/A;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    :try_start_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v1, "cache is closed"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    throw v0
.end method

.method public final declared-synchronized h()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, La4/f;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-object v0, p0, La4/f;->p:La4/d;

    .line 9
    .line 10
    iget-object v1, p0, La4/f;->d:Lcg/y;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcg/m;->b(Lcg/y;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La4/f;->p:La4/d;

    .line 16
    .line 17
    iget-object v1, p0, La4/f;->e:Lcg/y;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcg/m;->c(Lcg/y;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, La4/f;->p:La4/d;

    .line 26
    .line 27
    iget-object v1, p0, La4/f;->c:Lcg/y;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcg/m;->c(Lcg/y;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, La4/f;->p:La4/d;

    .line 36
    .line 37
    iget-object v1, p0, La4/f;->e:Lcg/y;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcg/m;->b(Lcg/y;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    iget-object v0, p0, La4/f;->p:La4/d;

    .line 46
    .line 47
    iget-object v1, p0, La4/f;->e:Lcg/y;

    .line 48
    .line 49
    iget-object v2, p0, La4/f;->c:Lcg/y;

    .line 50
    .line 51
    invoke-virtual {v0, v1, v2}, La4/d;->j(Lcg/y;Lcg/y;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    :goto_0
    iget-object v0, p0, La4/f;->p:La4/d;

    .line 55
    .line 56
    iget-object v1, p0, La4/f;->c:Lcg/y;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lcg/m;->c(Lcg/y;)Z

    .line 59
    .line 60
    .line 61
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    const/4 v1, 0x1

    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    :try_start_2
    invoke-virtual {p0}, La4/f;->y()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, La4/f;->w()V

    .line 69
    .line 70
    .line 71
    iput-boolean v1, p0, La4/f;->l:Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 72
    .line 73
    monitor-exit p0

    .line 74
    return-void

    .line 75
    :catch_0
    const/4 v0, 0x0

    .line 76
    :try_start_3
    invoke-virtual {p0}, La4/f;->close()V

    .line 77
    .line 78
    .line 79
    iget-object v2, p0, La4/f;->p:La4/d;

    .line 80
    .line 81
    iget-object v3, p0, La4/f;->a:Lcg/y;

    .line 82
    .line 83
    invoke-static {v2, v3}, Lff/B;->q(Lcg/m;Lcg/y;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 84
    .line 85
    .line 86
    :try_start_4
    iput-boolean v0, p0, La4/f;->m:Z

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catchall_1
    move-exception v1

    .line 90
    iput-boolean v0, p0, La4/f;->m:Z

    .line 91
    .line 92
    throw v1

    .line 93
    :cond_3
    :goto_1
    invoke-virtual {p0}, La4/f;->P()V

    .line 94
    .line 95
    .line 96
    iput-boolean v1, p0, La4/f;->l:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 97
    .line 98
    monitor-exit p0

    .line 99
    return-void

    .line 100
    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 101
    throw v0
.end method

.method public final i()V
    .locals 4

    .line 1
    new-instance v0, La4/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, La4/e;-><init>(La4/f;Ljf/c;)V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    iget-object v3, p0, La4/f;->g:LKd/a;

    .line 9
    .line 10
    invoke-static {v3, v1, v0, v2}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final o()Lcg/A;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "file"

    .line 3
    .line 4
    iget-object v2, p0, La4/f;->p:La4/d;

    .line 5
    .line 6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v3, p0, La4/f;->c:Lcg/y;

    .line 10
    .line 11
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v2, La4/d;->b:Lcg/u;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3}, Lcg/y;->e()Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sget-object v2, Lcg/w;->a:Ljava/util/logging/Logger;

    .line 30
    .line 31
    new-instance v2, Ljava/io/FileOutputStream;

    .line 32
    .line 33
    invoke-direct {v2, v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lcg/c;

    .line 37
    .line 38
    new-instance v3, Lcg/J;

    .line 39
    .line 40
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-direct {v1, v0, v2, v3}, Lcg/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, La4/g;

    .line 47
    .line 48
    new-instance v2, LB/F;

    .line 49
    .line 50
    const/16 v3, 0xb

    .line 51
    .line 52
    invoke-direct {v2, p0, v3}, LB/F;-><init>(Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, v1, v2}, La4/g;-><init>(Lcg/F;LB/F;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lcg/b;->c(Lcg/F;)Lcg/A;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0
.end method

.method public final w()V
    .locals 9

    .line 1
    iget-object v0, p0, La4/f;->f:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_3

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, La4/b;

    .line 24
    .line 25
    iget-object v4, v3, La4/b;->g:LA7/b0;

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    const/4 v6, 0x0

    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    :goto_1
    if-ge v6, v5, :cond_0

    .line 32
    .line 33
    iget-object v4, v3, La4/b;->b:[J

    .line 34
    .line 35
    aget-wide v7, v4, v6

    .line 36
    .line 37
    add-long/2addr v1, v7

    .line 38
    add-int/lit8 v6, v6, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/4 v4, 0x0

    .line 42
    iput-object v4, v3, La4/b;->g:LA7/b0;

    .line 43
    .line 44
    :goto_2
    if-ge v6, v5, :cond_2

    .line 45
    .line 46
    iget-object v4, v3, La4/b;->c:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, Lcg/y;

    .line 53
    .line 54
    iget-object v7, p0, La4/f;->p:La4/d;

    .line 55
    .line 56
    invoke-virtual {v7, v4}, Lcg/m;->b(Lcg/y;)V

    .line 57
    .line 58
    .line 59
    iget-object v4, v3, La4/b;->d:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Lcg/y;

    .line 66
    .line 67
    invoke-virtual {v7, v4}, Lcg/m;->b(Lcg/y;)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v6, v6, 0x1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    iput-wide v1, p0, La4/f;->h:J

    .line 78
    .line 79
    return-void
.end method

.method public final y()V
    .locals 13

    .line 1
    const-string v0, ", "

    .line 2
    .line 3
    const-string v1, "unexpected journal header: ["

    .line 4
    .line 5
    iget-object v2, p0, La4/f;->p:La4/d;

    .line 6
    .line 7
    iget-object v3, p0, La4/f;->c:Lcg/y;

    .line 8
    .line 9
    invoke-virtual {v2, v3}, La4/d;->i(Lcg/y;)Lcg/H;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v2}, Lcg/b;->d(Lcg/H;)Lcg/B;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-wide v3, 0x7fffffffffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    :try_start_0
    invoke-virtual {v2, v3, v4}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-virtual {v2, v3, v4}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-virtual {v2, v3, v4}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-virtual {v2, v3, v4}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v9

    .line 39
    invoke-virtual {v2, v3, v4}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v10

    .line 43
    const-string v11, "libcore.io.DiskLruCache"

    .line 44
    .line 45
    invoke-virtual {v11, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v11

    .line 49
    if-eqz v11, :cond_1

    .line 50
    .line 51
    const-string v11, "1"

    .line 52
    .line 53
    invoke-virtual {v11, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    if-eqz v11, :cond_1

    .line 58
    .line 59
    const/4 v11, 0x1

    .line 60
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    invoke-static {v11, v8}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    if-eqz v11, :cond_1

    .line 69
    .line 70
    const/4 v11, 0x2

    .line 71
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    invoke-static {v11, v9}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    if-eqz v11, :cond_1

    .line 80
    .line 81
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    if-gtz v11, :cond_1

    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    :goto_0
    :try_start_1
    invoke-virtual {v2, v3, v4}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {p0, v1}, La4/f;->z(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    .line 94
    .line 95
    add-int/lit8 v0, v0, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :catchall_0
    move-exception v0

    .line 99
    goto :goto_2

    .line 100
    :catch_0
    :try_start_2
    iget-object v1, p0, La4/f;->f:Ljava/util/LinkedHashMap;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    sub-int/2addr v0, v1

    .line 107
    iput v0, p0, La4/f;->i:I

    .line 108
    .line 109
    invoke-virtual {v2}, Lcg/B;->exhausted()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_0

    .line 114
    .line 115
    invoke-virtual {p0}, La4/f;->P()V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_0
    invoke-virtual {p0}, La4/f;->o()Lcg/A;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    iput-object v0, p0, La4/f;->j:Lcg/A;

    .line 124
    .line 125
    :goto_1
    sget-object v0, Lef/C;->a:Lef/C;

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_1
    new-instance v3, Ljava/io/IOException;

    .line 129
    .line 130
    new-instance v4, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const/16 v0, 0x5d

    .line 163
    .line 164
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-direct {v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 175
    :goto_2
    move-object v12, v5

    .line 176
    move-object v5, v0

    .line 177
    move-object v0, v12

    .line 178
    :goto_3
    :try_start_3
    invoke-virtual {v2}, Lcg/B;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 179
    .line 180
    .line 181
    goto :goto_4

    .line 182
    :catchall_1
    move-exception v1

    .line 183
    if-nez v5, :cond_2

    .line 184
    .line 185
    move-object v5, v1

    .line 186
    goto :goto_4

    .line 187
    :cond_2
    invoke-static {v5, v1}, LFe/b;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    :goto_4
    if-nez v5, :cond_3

    .line 191
    .line 192
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_3
    throw v5
.end method

.method public final z(Ljava/lang/String;)V
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    const/16 v1, 0x20

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x6

    .line 6
    invoke-static {p1, v1, v2, v3}, LBf/k;->v0(Ljava/lang/CharSequence;CII)I

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    const-string v5, "unexpected journal line: "

    .line 11
    .line 12
    const/4 v6, -0x1

    .line 13
    if-eq v4, v6, :cond_8

    .line 14
    .line 15
    add-int/lit8 v7, v4, 0x1

    .line 16
    .line 17
    const/4 v8, 0x4

    .line 18
    invoke-static {p1, v1, v7, v8}, LBf/k;->v0(Ljava/lang/CharSequence;CII)I

    .line 19
    .line 20
    .line 21
    move-result v9

    .line 22
    iget-object v10, p0, La4/f;->f:Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    const-string v11, "this as java.lang.String).substring(startIndex)"

    .line 25
    .line 26
    if-ne v9, v6, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    if-ne v4, v3, :cond_1

    .line 36
    .line 37
    const-string v3, "REMOVE"

    .line 38
    .line 39
    invoke-static {p1, v3, v2}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    invoke-virtual {v10, v7}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    invoke-virtual {p1, v7, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    const-string v3, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 54
    .line 55
    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    invoke-virtual {v10, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    if-nez v3, :cond_2

    .line 63
    .line 64
    new-instance v3, La4/b;

    .line 65
    .line 66
    invoke-direct {v3, p0, v7}, La4/b;-><init>(La4/f;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v10, v7, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    :cond_2
    check-cast v3, La4/b;

    .line 73
    .line 74
    const/4 v7, 0x5

    .line 75
    if-eq v9, v6, :cond_4

    .line 76
    .line 77
    if-ne v4, v7, :cond_4

    .line 78
    .line 79
    const-string v10, "CLEAN"

    .line 80
    .line 81
    invoke-static {p1, v10, v2}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    if-eqz v10, :cond_4

    .line 86
    .line 87
    add-int/2addr v9, v0

    .line 88
    invoke-virtual {p1, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1, v11}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-array v4, v0, [C

    .line 96
    .line 97
    aput-char v1, v4, v2

    .line 98
    .line 99
    invoke-static {p1, v4}, LBf/k;->H0(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iput-boolean v0, v3, La4/b;->e:Z

    .line 104
    .line 105
    const/4 v1, 0x0

    .line 106
    iput-object v1, v3, La4/b;->g:LA7/b0;

    .line 107
    .line 108
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    iget-object v4, v3, La4/b;->i:La4/f;

    .line 113
    .line 114
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    const/4 v4, 0x2

    .line 118
    if-ne v1, v4, :cond_3

    .line 119
    .line 120
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    :goto_0
    if-ge v2, v1, :cond_6

    .line 125
    .line 126
    iget-object v4, v3, La4/b;->b:[J

    .line 127
    .line 128
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    check-cast v6, Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 135
    .line 136
    .line 137
    move-result-wide v6

    .line 138
    aput-wide v6, v4, v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    .line 140
    add-int/2addr v2, v0

    .line 141
    goto :goto_0

    .line 142
    :catch_0
    new-instance v0, Ljava/io/IOException;

    .line 143
    .line 144
    new-instance v1, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v0

    .line 160
    :cond_3
    new-instance v0, Ljava/io/IOException;

    .line 161
    .line 162
    new-instance v1, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v0

    .line 178
    :cond_4
    if-ne v9, v6, :cond_5

    .line 179
    .line 180
    if-ne v4, v7, :cond_5

    .line 181
    .line 182
    const-string v0, "DIRTY"

    .line 183
    .line 184
    invoke-static {p1, v0, v2}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_5

    .line 189
    .line 190
    new-instance p1, LA7/b0;

    .line 191
    .line 192
    invoke-direct {p1, p0, v3}, LA7/b0;-><init>(La4/f;La4/b;)V

    .line 193
    .line 194
    .line 195
    iput-object p1, v3, La4/b;->g:LA7/b0;

    .line 196
    .line 197
    return-void

    .line 198
    :cond_5
    if-ne v9, v6, :cond_7

    .line 199
    .line 200
    if-ne v4, v8, :cond_7

    .line 201
    .line 202
    const-string v0, "READ"

    .line 203
    .line 204
    invoke-static {p1, v0, v2}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_7

    .line 209
    .line 210
    :cond_6
    return-void

    .line 211
    :cond_7
    new-instance v0, Ljava/io/IOException;

    .line 212
    .line 213
    invoke-virtual {v5, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw v0

    .line 221
    :cond_8
    new-instance v0, Ljava/io/IOException;

    .line 222
    .line 223
    invoke-virtual {v5, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw v0
.end method
