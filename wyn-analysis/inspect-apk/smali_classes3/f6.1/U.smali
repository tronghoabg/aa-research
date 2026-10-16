.class public final Lf6/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/w;


# instance fields
.field public A:Z

.field public B:Z

.field public final a:Lf6/S;

.field public final b:Lc2/g;

.field public final c:LE4/n;

.field public final d:LI5/i;

.field public final e:LI5/f;

.field public f:Lf6/N;

.field public g:LE5/T;

.field public h:LA/e0;

.field public i:I

.field public j:[I

.field public k:[J

.field public l:[I

.field public m:[I

.field public n:[J

.field public o:[LJ5/v;

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:J

.field public u:J

.field public v:J

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:LE5/T;


# direct methods
.method public constructor <init>(Lo2/e;LI5/i;LI5/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lf6/U;->d:LI5/i;

    .line 5
    .line 6
    iput-object p3, p0, Lf6/U;->e:LI5/f;

    .line 7
    .line 8
    new-instance p2, Lf6/S;

    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    invoke-direct {p2, p1, p3}, Lf6/S;-><init>(Lo2/e;B)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lf6/U;->a:Lf6/S;

    .line 15
    .line 16
    new-instance p1, Lc2/g;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lf6/U;->b:Lc2/g;

    .line 22
    .line 23
    const/16 p1, 0x3e8

    .line 24
    .line 25
    iput p1, p0, Lf6/U;->i:I

    .line 26
    .line 27
    new-array p2, p1, [I

    .line 28
    .line 29
    iput-object p2, p0, Lf6/U;->j:[I

    .line 30
    .line 31
    new-array p2, p1, [J

    .line 32
    .line 33
    iput-object p2, p0, Lf6/U;->k:[J

    .line 34
    .line 35
    new-array p2, p1, [J

    .line 36
    .line 37
    iput-object p2, p0, Lf6/U;->n:[J

    .line 38
    .line 39
    new-array p2, p1, [I

    .line 40
    .line 41
    iput-object p2, p0, Lf6/U;->m:[I

    .line 42
    .line 43
    new-array p2, p1, [I

    .line 44
    .line 45
    iput-object p2, p0, Lf6/U;->l:[I

    .line 46
    .line 47
    new-array p1, p1, [LJ5/v;

    .line 48
    .line 49
    iput-object p1, p0, Lf6/U;->o:[LJ5/v;

    .line 50
    .line 51
    new-instance p1, LE4/n;

    .line 52
    .line 53
    new-instance p2, Lcom/applovin/impl/Z0;

    .line 54
    .line 55
    const/16 p3, 0x11

    .line 56
    .line 57
    invoke-direct {p2, p3}, Lcom/applovin/impl/Z0;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, p2}, LE4/n;-><init>(Lcom/applovin/impl/Z0;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lf6/U;->c:LE4/n;

    .line 64
    .line 65
    const-wide/high16 p1, -0x8000000000000000L

    .line 66
    .line 67
    iput-wide p1, p0, Lf6/U;->t:J

    .line 68
    .line 69
    iput-wide p1, p0, Lf6/U;->u:J

    .line 70
    .line 71
    iput-wide p1, p0, Lf6/U;->v:J

    .line 72
    .line 73
    const/4 p1, 0x1

    .line 74
    iput-boolean p1, p0, Lf6/U;->y:Z

    .line 75
    .line 76
    iput-boolean p1, p0, Lf6/U;->x:Z

    .line 77
    .line 78
    return-void
.end method


# virtual methods
.method public final a(LE5/T;)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iput-boolean v1, p0, Lf6/U;->y:Z

    .line 5
    .line 6
    iget-object v2, p0, Lf6/U;->z:LE5/T;

    .line 7
    .line 8
    invoke-static {p1, v2}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    move v0, v1

    .line 16
    goto/16 :goto_5

    .line 17
    .line 18
    :cond_0
    :try_start_1
    iget-object v2, p0, Lf6/U;->c:LE4/n;

    .line 19
    .line 20
    iget-object v2, v2, LE4/n;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Landroid/util/SparseArray;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    move v2, v0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v2, v1

    .line 33
    :goto_0
    if-nez v2, :cond_2

    .line 34
    .line 35
    iget-object v2, p0, Lf6/U;->c:LE4/n;

    .line 36
    .line 37
    iget-object v2, v2, LE4/n;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Landroid/util/SparseArray;

    .line 40
    .line 41
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    sub-int/2addr v3, v0

    .line 46
    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Lf6/T;

    .line 51
    .line 52
    iget-object v2, v2, Lf6/T;->a:LE5/T;

    .line 53
    .line 54
    invoke-virtual {v2, p1}, LE5/T;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    iget-object p1, p0, Lf6/U;->c:LE4/n;

    .line 61
    .line 62
    iget-object p1, p1, LE4/n;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Landroid/util/SparseArray;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    sub-int/2addr v2, v0

    .line 71
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Lf6/T;

    .line 76
    .line 77
    iget-object p1, p1, Lf6/T;->a:LE5/T;

    .line 78
    .line 79
    iput-object p1, p0, Lf6/U;->z:LE5/T;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    goto/16 :goto_6

    .line 84
    .line 85
    :cond_2
    iput-object p1, p0, Lf6/U;->z:LE5/T;

    .line 86
    .line 87
    :goto_1
    iget-object p1, p0, Lf6/U;->z:LE5/T;

    .line 88
    .line 89
    iget-object v2, p1, LE5/T;->l:Ljava/lang/String;

    .line 90
    .line 91
    iget-object p1, p1, LE5/T;->i:Ljava/lang/String;

    .line 92
    .line 93
    sget-object v3, Lu6/k;->a:Ljava/util/ArrayList;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    .line 95
    if-nez v2, :cond_4

    .line 96
    .line 97
    :cond_3
    :goto_2
    move p1, v1

    .line 98
    goto/16 :goto_4

    .line 99
    .line 100
    :cond_4
    const/4 v3, -0x1

    .line 101
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    sparse-switch v4, :sswitch_data_0

    .line 106
    .line 107
    .line 108
    goto/16 :goto_3

    .line 109
    .line 110
    :sswitch_0
    const-string v4, "audio/g711-mlaw"

    .line 111
    .line 112
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-nez v2, :cond_5

    .line 117
    .line 118
    goto/16 :goto_3

    .line 119
    .line 120
    :cond_5
    const/16 v3, 0xa

    .line 121
    .line 122
    goto/16 :goto_3

    .line 123
    .line 124
    :sswitch_1
    const-string v4, "audio/g711-alaw"

    .line 125
    .line 126
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-nez v2, :cond_6

    .line 131
    .line 132
    goto/16 :goto_3

    .line 133
    .line 134
    :cond_6
    const/16 v3, 0x9

    .line 135
    .line 136
    goto/16 :goto_3

    .line 137
    .line 138
    :sswitch_2
    const-string v4, "audio/mpeg"

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-nez v2, :cond_7

    .line 145
    .line 146
    goto/16 :goto_3

    .line 147
    .line 148
    :cond_7
    const/16 v3, 0x8

    .line 149
    .line 150
    goto/16 :goto_3

    .line 151
    .line 152
    :sswitch_3
    const-string v4, "audio/flac"

    .line 153
    .line 154
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-nez v2, :cond_8

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_8
    const/4 v3, 0x7

    .line 162
    goto :goto_3

    .line 163
    :sswitch_4
    const-string v4, "audio/eac3"

    .line 164
    .line 165
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-nez v2, :cond_9

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_9
    const/4 v3, 0x6

    .line 173
    goto :goto_3

    .line 174
    :sswitch_5
    const-string v4, "audio/raw"

    .line 175
    .line 176
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-nez v2, :cond_a

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_a
    const/4 v3, 0x5

    .line 184
    goto :goto_3

    .line 185
    :sswitch_6
    const-string v4, "audio/ac3"

    .line 186
    .line 187
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-nez v2, :cond_b

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_b
    const/4 v3, 0x4

    .line 195
    goto :goto_3

    .line 196
    :sswitch_7
    const-string v4, "audio/mp4a-latm"

    .line 197
    .line 198
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-nez v2, :cond_c

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_c
    const/4 v3, 0x3

    .line 206
    goto :goto_3

    .line 207
    :sswitch_8
    const-string v4, "audio/mpeg-L2"

    .line 208
    .line 209
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-nez v2, :cond_d

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_d
    const/4 v3, 0x2

    .line 217
    goto :goto_3

    .line 218
    :sswitch_9
    const-string v4, "audio/mpeg-L1"

    .line 219
    .line 220
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-nez v2, :cond_e

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_e
    move v3, v0

    .line 228
    goto :goto_3

    .line 229
    :sswitch_a
    const-string v4, "audio/eac3-joc"

    .line 230
    .line 231
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    if-nez v2, :cond_f

    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_f
    move v3, v1

    .line 239
    :goto_3
    packed-switch v3, :pswitch_data_0

    .line 240
    .line 241
    .line 242
    goto/16 :goto_2

    .line 243
    .line 244
    :pswitch_0
    if-nez p1, :cond_10

    .line 245
    .line 246
    goto/16 :goto_2

    .line 247
    .line 248
    :cond_10
    :try_start_2
    invoke-static {p1}, Lu6/k;->d(Ljava/lang/String;)LD9/n;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    if-nez p1, :cond_11

    .line 253
    .line 254
    goto/16 :goto_2

    .line 255
    .line 256
    :cond_11
    invoke-virtual {p1}, LD9/n;->a()I

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    if-eqz p1, :cond_3

    .line 261
    .line 262
    const/16 v2, 0x10

    .line 263
    .line 264
    if-eq p1, v2, :cond_3

    .line 265
    .line 266
    :pswitch_1
    move p1, v0

    .line 267
    :goto_4
    iput-boolean p1, p0, Lf6/U;->A:Z

    .line 268
    .line 269
    iput-boolean v1, p0, Lf6/U;->B:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 270
    .line 271
    monitor-exit p0

    .line 272
    :goto_5
    iget-object p1, p0, Lf6/U;->f:Lf6/N;

    .line 273
    .line 274
    if-eqz p1, :cond_12

    .line 275
    .line 276
    if-eqz v0, :cond_12

    .line 277
    .line 278
    iget-object v0, p1, Lf6/N;->o:Landroid/os/Handler;

    .line 279
    .line 280
    iget-object p1, p1, Lf6/N;->m:Lf6/J;

    .line 281
    .line 282
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 283
    .line 284
    .line 285
    :cond_12
    return-void

    .line 286
    :goto_6
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 287
    throw p1

    .line 288
    nop

    .line 289
    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_a
        -0x19cc928c -> :sswitch_9
        -0x19cc928b -> :sswitch_8
        -0x3313c2e -> :sswitch_7
        0xb269698 -> :sswitch_6
        0xb26d66f -> :sswitch_5
        0x59ae0c65 -> :sswitch_4
        0x59aeaa01 -> :sswitch_3
        0x59b1e81e -> :sswitch_2
        0x71710385 -> :sswitch_1
        0x717677f9 -> :sswitch_0
    .end sparse-switch

    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public final b(JIIILJ5/v;)V
    .locals 9

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v3, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v3, v2

    .line 10
    :goto_0
    iget-boolean v4, p0, Lf6/U;->x:Z

    .line 11
    .line 12
    if-eqz v4, :cond_2

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    iput-boolean v2, p0, Lf6/U;->x:Z

    .line 18
    .line 19
    :cond_2
    iget-boolean v2, p0, Lf6/U;->A:Z

    .line 20
    .line 21
    if-eqz v2, :cond_5

    .line 22
    .line 23
    iget-wide v2, p0, Lf6/U;->t:J

    .line 24
    .line 25
    cmp-long v2, p1, v2

    .line 26
    .line 27
    if-gez v2, :cond_3

    .line 28
    .line 29
    :goto_1
    return-void

    .line 30
    :cond_3
    if-nez v0, :cond_5

    .line 31
    .line 32
    iget-boolean v0, p0, Lf6/U;->B:Z

    .line 33
    .line 34
    if-nez v0, :cond_4

    .line 35
    .line 36
    const-string v0, "SampleQueue"

    .line 37
    .line 38
    new-instance v2, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v3, "Overriding unexpected non-sync sample for format: "

    .line 41
    .line 42
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v3, p0, Lf6/U;->z:LE5/T;

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-static {v0, v2}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iput-boolean v1, p0, Lf6/U;->B:Z

    .line 58
    .line 59
    :cond_4
    or-int/lit8 p3, p3, 0x1

    .line 60
    .line 61
    :cond_5
    iget-object v0, p0, Lf6/U;->a:Lf6/S;

    .line 62
    .line 63
    iget-wide v0, v0, Lf6/S;->c:J

    .line 64
    .line 65
    int-to-long v2, p4

    .line 66
    sub-long/2addr v0, v2

    .line 67
    int-to-long v2, p5

    .line 68
    sub-long/2addr v0, v2

    .line 69
    monitor-enter p0

    .line 70
    :try_start_0
    iget p5, p0, Lf6/U;->p:I

    .line 71
    .line 72
    const/4 v2, 0x0

    .line 73
    const/4 v3, 0x1

    .line 74
    if-lez p5, :cond_7

    .line 75
    .line 76
    sub-int/2addr p5, v3

    .line 77
    invoke-virtual {p0, p5}, Lf6/U;->j(I)I

    .line 78
    .line 79
    .line 80
    move-result p5

    .line 81
    iget-object v4, p0, Lf6/U;->k:[J

    .line 82
    .line 83
    aget-wide v5, v4, p5

    .line 84
    .line 85
    iget-object v4, p0, Lf6/U;->l:[I

    .line 86
    .line 87
    aget p5, v4, p5

    .line 88
    .line 89
    int-to-long v7, p5

    .line 90
    add-long/2addr v5, v7

    .line 91
    cmp-long p5, v5, v0

    .line 92
    .line 93
    if-gtz p5, :cond_6

    .line 94
    .line 95
    move p5, v3

    .line 96
    goto :goto_2

    .line 97
    :cond_6
    move p5, v2

    .line 98
    :goto_2
    invoke-static {p5}, Lu6/a;->e(Z)V

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :catchall_0
    move-exception p1

    .line 103
    goto/16 :goto_9

    .line 104
    .line 105
    :cond_7
    :goto_3
    const/high16 p5, 0x20000000

    .line 106
    .line 107
    and-int/2addr p5, p3

    .line 108
    if-eqz p5, :cond_8

    .line 109
    .line 110
    move p5, v3

    .line 111
    goto :goto_4

    .line 112
    :cond_8
    move p5, v2

    .line 113
    :goto_4
    iput-boolean p5, p0, Lf6/U;->w:Z

    .line 114
    .line 115
    iget-wide v4, p0, Lf6/U;->v:J

    .line 116
    .line 117
    invoke-static {v4, v5, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 118
    .line 119
    .line 120
    move-result-wide v4

    .line 121
    iput-wide v4, p0, Lf6/U;->v:J

    .line 122
    .line 123
    iget p5, p0, Lf6/U;->p:I

    .line 124
    .line 125
    invoke-virtual {p0, p5}, Lf6/U;->j(I)I

    .line 126
    .line 127
    .line 128
    move-result p5

    .line 129
    iget-object v4, p0, Lf6/U;->n:[J

    .line 130
    .line 131
    aput-wide p1, v4, p5

    .line 132
    .line 133
    iget-object p1, p0, Lf6/U;->k:[J

    .line 134
    .line 135
    aput-wide v0, p1, p5

    .line 136
    .line 137
    iget-object p1, p0, Lf6/U;->l:[I

    .line 138
    .line 139
    aput p4, p1, p5

    .line 140
    .line 141
    iget-object p1, p0, Lf6/U;->m:[I

    .line 142
    .line 143
    aput p3, p1, p5

    .line 144
    .line 145
    iget-object p1, p0, Lf6/U;->o:[LJ5/v;

    .line 146
    .line 147
    aput-object p6, p1, p5

    .line 148
    .line 149
    iget-object p1, p0, Lf6/U;->j:[I

    .line 150
    .line 151
    aput v2, p1, p5

    .line 152
    .line 153
    iget-object p1, p0, Lf6/U;->c:LE4/n;

    .line 154
    .line 155
    iget-object p1, p1, LE4/n;->c:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p1, Landroid/util/SparseArray;

    .line 158
    .line 159
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-nez p1, :cond_9

    .line 164
    .line 165
    move p1, v3

    .line 166
    goto :goto_5

    .line 167
    :cond_9
    move p1, v2

    .line 168
    :goto_5
    if-nez p1, :cond_a

    .line 169
    .line 170
    iget-object p1, p0, Lf6/U;->c:LE4/n;

    .line 171
    .line 172
    iget-object p1, p1, LE4/n;->c:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p1, Landroid/util/SparseArray;

    .line 175
    .line 176
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    sub-int/2addr p2, v3

    .line 181
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    check-cast p1, Lf6/T;

    .line 186
    .line 187
    iget-object p1, p1, Lf6/T;->a:LE5/T;

    .line 188
    .line 189
    iget-object p2, p0, Lf6/U;->z:LE5/T;

    .line 190
    .line 191
    invoke-virtual {p1, p2}, LE5/T;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    if-nez p1, :cond_10

    .line 196
    .line 197
    :cond_a
    iget-object p1, p0, Lf6/U;->d:LI5/i;

    .line 198
    .line 199
    if-eqz p1, :cond_b

    .line 200
    .line 201
    iget-object p2, p0, Lf6/U;->e:LI5/f;

    .line 202
    .line 203
    iget-object p3, p0, Lf6/U;->z:LE5/T;

    .line 204
    .line 205
    invoke-interface {p1, p2, p3}, LI5/i;->h(LI5/f;LE5/T;)LI5/h;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    goto :goto_6

    .line 210
    :cond_b
    sget-object p1, LI5/h;->a:LI5/h;

    .line 211
    .line 212
    :goto_6
    iget-object p2, p0, Lf6/U;->c:LE4/n;

    .line 213
    .line 214
    iget p3, p0, Lf6/U;->q:I

    .line 215
    .line 216
    iget p4, p0, Lf6/U;->p:I

    .line 217
    .line 218
    add-int/2addr p3, p4

    .line 219
    new-instance p4, Lf6/T;

    .line 220
    .line 221
    iget-object p5, p0, Lf6/U;->z:LE5/T;

    .line 222
    .line 223
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-direct {p4, p5, p1}, Lf6/T;-><init>(LE5/T;LI5/h;)V

    .line 227
    .line 228
    .line 229
    iget p1, p2, LE4/n;->b:I

    .line 230
    .line 231
    iget-object p5, p2, LE4/n;->c:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast p5, Landroid/util/SparseArray;

    .line 234
    .line 235
    const/4 p6, -0x1

    .line 236
    if-ne p1, p6, :cond_d

    .line 237
    .line 238
    invoke-virtual {p5}, Landroid/util/SparseArray;->size()I

    .line 239
    .line 240
    .line 241
    move-result p1

    .line 242
    if-nez p1, :cond_c

    .line 243
    .line 244
    move p1, v3

    .line 245
    goto :goto_7

    .line 246
    :cond_c
    move p1, v2

    .line 247
    :goto_7
    invoke-static {p1}, Lu6/a;->i(Z)V

    .line 248
    .line 249
    .line 250
    iput v2, p2, LE4/n;->b:I

    .line 251
    .line 252
    :cond_d
    invoke-virtual {p5}, Landroid/util/SparseArray;->size()I

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    if-lez p1, :cond_f

    .line 257
    .line 258
    invoke-virtual {p5}, Landroid/util/SparseArray;->size()I

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    sub-int/2addr p1, v3

    .line 263
    invoke-virtual {p5, p1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    if-lt p3, p1, :cond_e

    .line 268
    .line 269
    move p6, v3

    .line 270
    goto :goto_8

    .line 271
    :cond_e
    move p6, v2

    .line 272
    :goto_8
    invoke-static {p6}, Lu6/a;->e(Z)V

    .line 273
    .line 274
    .line 275
    if-ne p1, p3, :cond_f

    .line 276
    .line 277
    invoke-virtual {p5}, Landroid/util/SparseArray;->size()I

    .line 278
    .line 279
    .line 280
    move-result p1

    .line 281
    sub-int/2addr p1, v3

    .line 282
    invoke-virtual {p5, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    iget-object p2, p2, LE4/n;->d:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast p2, Lcom/applovin/impl/Z0;

    .line 289
    .line 290
    invoke-virtual {p2, p1}, Lcom/applovin/impl/Z0;->accept(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    :cond_f
    invoke-virtual {p5, p3, p4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    :cond_10
    iget p1, p0, Lf6/U;->p:I

    .line 297
    .line 298
    add-int/2addr p1, v3

    .line 299
    iput p1, p0, Lf6/U;->p:I

    .line 300
    .line 301
    iget p2, p0, Lf6/U;->i:I

    .line 302
    .line 303
    if-ne p1, p2, :cond_11

    .line 304
    .line 305
    add-int/lit16 p1, p2, 0x3e8

    .line 306
    .line 307
    new-array p3, p1, [I

    .line 308
    .line 309
    new-array p4, p1, [J

    .line 310
    .line 311
    new-array p5, p1, [J

    .line 312
    .line 313
    new-array p6, p1, [I

    .line 314
    .line 315
    new-array v0, p1, [I

    .line 316
    .line 317
    new-array v1, p1, [LJ5/v;

    .line 318
    .line 319
    iget v3, p0, Lf6/U;->r:I

    .line 320
    .line 321
    sub-int/2addr p2, v3

    .line 322
    iget-object v4, p0, Lf6/U;->k:[J

    .line 323
    .line 324
    invoke-static {v4, v3, p4, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 325
    .line 326
    .line 327
    iget-object v3, p0, Lf6/U;->n:[J

    .line 328
    .line 329
    iget v4, p0, Lf6/U;->r:I

    .line 330
    .line 331
    invoke-static {v3, v4, p5, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 332
    .line 333
    .line 334
    iget-object v3, p0, Lf6/U;->m:[I

    .line 335
    .line 336
    iget v4, p0, Lf6/U;->r:I

    .line 337
    .line 338
    invoke-static {v3, v4, p6, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 339
    .line 340
    .line 341
    iget-object v3, p0, Lf6/U;->l:[I

    .line 342
    .line 343
    iget v4, p0, Lf6/U;->r:I

    .line 344
    .line 345
    invoke-static {v3, v4, v0, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 346
    .line 347
    .line 348
    iget-object v3, p0, Lf6/U;->o:[LJ5/v;

    .line 349
    .line 350
    iget v4, p0, Lf6/U;->r:I

    .line 351
    .line 352
    invoke-static {v3, v4, v1, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 353
    .line 354
    .line 355
    iget-object v3, p0, Lf6/U;->j:[I

    .line 356
    .line 357
    iget v4, p0, Lf6/U;->r:I

    .line 358
    .line 359
    invoke-static {v3, v4, p3, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 360
    .line 361
    .line 362
    iget v3, p0, Lf6/U;->r:I

    .line 363
    .line 364
    iget-object v4, p0, Lf6/U;->k:[J

    .line 365
    .line 366
    invoke-static {v4, v2, p4, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 367
    .line 368
    .line 369
    iget-object v4, p0, Lf6/U;->n:[J

    .line 370
    .line 371
    invoke-static {v4, v2, p5, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 372
    .line 373
    .line 374
    iget-object v4, p0, Lf6/U;->m:[I

    .line 375
    .line 376
    invoke-static {v4, v2, p6, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 377
    .line 378
    .line 379
    iget-object v4, p0, Lf6/U;->l:[I

    .line 380
    .line 381
    invoke-static {v4, v2, v0, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 382
    .line 383
    .line 384
    iget-object v4, p0, Lf6/U;->o:[LJ5/v;

    .line 385
    .line 386
    invoke-static {v4, v2, v1, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 387
    .line 388
    .line 389
    iget-object v4, p0, Lf6/U;->j:[I

    .line 390
    .line 391
    invoke-static {v4, v2, p3, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 392
    .line 393
    .line 394
    iput-object p4, p0, Lf6/U;->k:[J

    .line 395
    .line 396
    iput-object p5, p0, Lf6/U;->n:[J

    .line 397
    .line 398
    iput-object p6, p0, Lf6/U;->m:[I

    .line 399
    .line 400
    iput-object v0, p0, Lf6/U;->l:[I

    .line 401
    .line 402
    iput-object v1, p0, Lf6/U;->o:[LJ5/v;

    .line 403
    .line 404
    iput-object p3, p0, Lf6/U;->j:[I

    .line 405
    .line 406
    iput v2, p0, Lf6/U;->r:I

    .line 407
    .line 408
    iput p1, p0, Lf6/U;->i:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 409
    .line 410
    :cond_11
    monitor-exit p0

    .line 411
    return-void

    .line 412
    :goto_9
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 413
    throw p1
.end method

.method public final c(ILY4/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lf6/U;->e(ILY4/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final d(Lt6/i;IZ)I
    .locals 8

    .line 1
    iget-object v0, p0, Lf6/U;->a:Lf6/S;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lf6/S;->d(I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    iget-object v1, v0, Lf6/S;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, LA7/B1;

    .line 10
    .line 11
    iget-object v2, v1, LA7/B1;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lt6/a;

    .line 14
    .line 15
    iget-object v3, v2, Lt6/a;->a:[B

    .line 16
    .line 17
    iget-wide v4, v0, Lf6/S;->c:J

    .line 18
    .line 19
    iget-wide v6, v1, LA7/B1;->b:J

    .line 20
    .line 21
    sub-long/2addr v4, v6

    .line 22
    long-to-int v1, v4

    .line 23
    iget v2, v2, Lt6/a;->b:I

    .line 24
    .line 25
    add-int/2addr v1, v2

    .line 26
    invoke-interface {p1, v3, v1, p2}, Lt6/i;->read([BII)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    const/4 p2, -0x1

    .line 31
    if-ne p1, p2, :cond_1

    .line 32
    .line 33
    if-eqz p3, :cond_0

    .line 34
    .line 35
    return p2

    .line 36
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_1
    iget-wide p2, v0, Lf6/S;->c:J

    .line 43
    .line 44
    int-to-long v1, p1

    .line 45
    add-long/2addr p2, v1

    .line 46
    iput-wide p2, v0, Lf6/S;->c:J

    .line 47
    .line 48
    iget-object v1, v0, Lf6/S;->h:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, LA7/B1;

    .line 51
    .line 52
    iget-wide v2, v1, LA7/B1;->c:J

    .line 53
    .line 54
    cmp-long p2, p2, v2

    .line 55
    .line 56
    if-nez p2, :cond_2

    .line 57
    .line 58
    iget-object p2, v1, LA7/B1;->e:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p2, LA7/B1;

    .line 61
    .line 62
    iput-object p2, v0, Lf6/S;->h:Ljava/lang/Object;

    .line 63
    .line 64
    :cond_2
    return p1
.end method

.method public final e(ILY4/b;)V
    .locals 9

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, Lf6/U;->a:Lf6/S;

    .line 2
    .line 3
    if-lez p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lf6/S;->d(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, v0, Lf6/S;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, LA7/B1;

    .line 12
    .line 13
    iget-object v3, v2, LA7/B1;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lt6/a;

    .line 16
    .line 17
    iget-object v4, v3, Lt6/a;->a:[B

    .line 18
    .line 19
    iget-wide v5, v0, Lf6/S;->c:J

    .line 20
    .line 21
    iget-wide v7, v2, LA7/B1;->b:J

    .line 22
    .line 23
    sub-long/2addr v5, v7

    .line 24
    long-to-int v2, v5

    .line 25
    iget v3, v3, Lt6/a;->b:I

    .line 26
    .line 27
    add-int/2addr v2, v3

    .line 28
    invoke-virtual {p2, v2, v1, v4}, LY4/b;->c(II[B)V

    .line 29
    .line 30
    .line 31
    sub-int/2addr p1, v1

    .line 32
    iget-wide v2, v0, Lf6/S;->c:J

    .line 33
    .line 34
    int-to-long v4, v1

    .line 35
    add-long/2addr v2, v4

    .line 36
    iput-wide v2, v0, Lf6/S;->c:J

    .line 37
    .line 38
    iget-object v1, v0, Lf6/S;->h:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, LA7/B1;

    .line 41
    .line 42
    iget-wide v4, v1, LA7/B1;->c:J

    .line 43
    .line 44
    cmp-long v2, v2, v4

    .line 45
    .line 46
    if-nez v2, :cond_0

    .line 47
    .line 48
    iget-object v1, v1, LA7/B1;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, LA7/B1;

    .line 51
    .line 52
    iput-object v1, v0, Lf6/S;->h:Ljava/lang/Object;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final f(I)J
    .locals 9

    .line 1
    iget-wide v0, p0, Lf6/U;->u:J

    .line 2
    .line 3
    const-wide/high16 v2, -0x8000000000000000L

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    add-int/lit8 v4, p1, -0x1

    .line 9
    .line 10
    invoke-virtual {p0, v4}, Lf6/U;->j(I)I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    const/4 v5, 0x0

    .line 15
    :goto_0
    if-ge v5, p1, :cond_3

    .line 16
    .line 17
    iget-object v6, p0, Lf6/U;->n:[J

    .line 18
    .line 19
    aget-wide v7, v6, v4

    .line 20
    .line 21
    invoke-static {v2, v3, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    iget-object v6, p0, Lf6/U;->m:[I

    .line 26
    .line 27
    aget v6, v6, v4

    .line 28
    .line 29
    and-int/lit8 v6, v6, 0x1

    .line 30
    .line 31
    if-eqz v6, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    add-int/lit8 v4, v4, -0x1

    .line 35
    .line 36
    const/4 v6, -0x1

    .line 37
    if-ne v4, v6, :cond_2

    .line 38
    .line 39
    iget v4, p0, Lf6/U;->i:I

    .line 40
    .line 41
    add-int/lit8 v4, v4, -0x1

    .line 42
    .line 43
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    :goto_1
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    iput-wide v0, p0, Lf6/U;->u:J

    .line 51
    .line 52
    iget v0, p0, Lf6/U;->p:I

    .line 53
    .line 54
    sub-int/2addr v0, p1

    .line 55
    iput v0, p0, Lf6/U;->p:I

    .line 56
    .line 57
    iget v0, p0, Lf6/U;->q:I

    .line 58
    .line 59
    add-int/2addr v0, p1

    .line 60
    iput v0, p0, Lf6/U;->q:I

    .line 61
    .line 62
    iget v1, p0, Lf6/U;->r:I

    .line 63
    .line 64
    add-int/2addr v1, p1

    .line 65
    iput v1, p0, Lf6/U;->r:I

    .line 66
    .line 67
    iget v2, p0, Lf6/U;->i:I

    .line 68
    .line 69
    if-lt v1, v2, :cond_4

    .line 70
    .line 71
    sub-int/2addr v1, v2

    .line 72
    iput v1, p0, Lf6/U;->r:I

    .line 73
    .line 74
    :cond_4
    iget v1, p0, Lf6/U;->s:I

    .line 75
    .line 76
    sub-int/2addr v1, p1

    .line 77
    iput v1, p0, Lf6/U;->s:I

    .line 78
    .line 79
    const/4 p1, 0x0

    .line 80
    if-gez v1, :cond_5

    .line 81
    .line 82
    iput p1, p0, Lf6/U;->s:I

    .line 83
    .line 84
    :cond_5
    :goto_2
    iget-object v1, p0, Lf6/U;->c:LE4/n;

    .line 85
    .line 86
    iget-object v2, v1, LE4/n;->c:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, Landroid/util/SparseArray;

    .line 89
    .line 90
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    add-int/lit8 v3, v3, -0x1

    .line 95
    .line 96
    if-ge p1, v3, :cond_7

    .line 97
    .line 98
    add-int/lit8 v3, p1, 0x1

    .line 99
    .line 100
    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-lt v0, v4, :cond_7

    .line 105
    .line 106
    invoke-virtual {v2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    iget-object v5, v1, LE4/n;->d:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v5, Lcom/applovin/impl/Z0;

    .line 113
    .line 114
    invoke-virtual {v5, v4}, Lcom/applovin/impl/Z0;->accept(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, p1}, Landroid/util/SparseArray;->removeAt(I)V

    .line 118
    .line 119
    .line 120
    iget p1, v1, LE4/n;->b:I

    .line 121
    .line 122
    if-lez p1, :cond_6

    .line 123
    .line 124
    add-int/lit8 p1, p1, -0x1

    .line 125
    .line 126
    iput p1, v1, LE4/n;->b:I

    .line 127
    .line 128
    :cond_6
    move p1, v3

    .line 129
    goto :goto_2

    .line 130
    :cond_7
    iget p1, p0, Lf6/U;->p:I

    .line 131
    .line 132
    if-nez p1, :cond_9

    .line 133
    .line 134
    iget p1, p0, Lf6/U;->r:I

    .line 135
    .line 136
    if-nez p1, :cond_8

    .line 137
    .line 138
    iget p1, p0, Lf6/U;->i:I

    .line 139
    .line 140
    :cond_8
    add-int/lit8 p1, p1, -0x1

    .line 141
    .line 142
    iget-object v0, p0, Lf6/U;->k:[J

    .line 143
    .line 144
    aget-wide v1, v0, p1

    .line 145
    .line 146
    iget-object v0, p0, Lf6/U;->l:[I

    .line 147
    .line 148
    aget p1, v0, p1

    .line 149
    .line 150
    int-to-long v3, p1

    .line 151
    add-long/2addr v1, v3

    .line 152
    return-wide v1

    .line 153
    :cond_9
    iget-object p1, p0, Lf6/U;->k:[J

    .line 154
    .line 155
    iget v0, p0, Lf6/U;->r:I

    .line 156
    .line 157
    aget-wide v0, p1, v0

    .line 158
    .line 159
    return-wide v0
.end method

.method public final g()V
    .locals 3

    .line 1
    iget-object v0, p0, Lf6/U;->a:Lf6/S;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget v1, p0, Lf6/U;->p:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    const-wide/16 v1, -0x1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    :try_start_1
    invoke-virtual {p0, v1}, Lf6/U;->f(I)J

    .line 13
    .line 14
    .line 15
    move-result-wide v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    monitor-exit p0

    .line 17
    :goto_0
    invoke-virtual {v0, v1, v2}, Lf6/S;->b(J)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 23
    throw v0
.end method

.method public final h(IIJZ)I
    .locals 6

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, p2, :cond_4

    .line 5
    .line 6
    iget-object v3, p0, Lf6/U;->n:[J

    .line 7
    .line 8
    aget-wide v4, v3, p1

    .line 9
    .line 10
    cmp-long v3, v4, p3

    .line 11
    .line 12
    if-gtz v3, :cond_4

    .line 13
    .line 14
    if-eqz p5, :cond_0

    .line 15
    .line 16
    iget-object v4, p0, Lf6/U;->m:[I

    .line 17
    .line 18
    aget v4, v4, p1

    .line 19
    .line 20
    and-int/lit8 v4, v4, 0x1

    .line 21
    .line 22
    if-eqz v4, :cond_2

    .line 23
    .line 24
    :cond_0
    if-nez v3, :cond_1

    .line 25
    .line 26
    return v2

    .line 27
    :cond_1
    move v0, v2

    .line 28
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    iget v3, p0, Lf6/U;->i:I

    .line 31
    .line 32
    if-ne p1, v3, :cond_3

    .line 33
    .line 34
    move p1, v1

    .line 35
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    return v0
.end method

.method public final declared-synchronized i()J
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lf6/U;->v:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-wide v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public final j(I)I
    .locals 1

    .line 1
    iget v0, p0, Lf6/U;->r:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iget p1, p0, Lf6/U;->i:I

    .line 5
    .line 6
    if-ge v0, p1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    sub-int/2addr v0, p1

    .line 10
    return v0
.end method

.method public final declared-synchronized k()LE5/T;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lf6/U;->y:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lf6/U;->z:LE5/T;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    :goto_0
    monitor-exit p0

    .line 11
    return-object v0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw v0
.end method

.method public final declared-synchronized l(Z)Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lf6/U;->s:I

    .line 3
    .line 4
    iget v1, p0, Lf6/U;->p:I

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    move v1, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v1, v2

    .line 13
    :goto_0
    if-nez v1, :cond_3

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-boolean p1, p0, Lf6/U;->w:Z

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, Lf6/U;->z:LE5/T;

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Lf6/U;->g:LE5/T;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    if-eq p1, v0, :cond_2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    :goto_1
    move v2, v3

    .line 33
    :cond_2
    monitor-exit p0

    .line 34
    return v2

    .line 35
    :cond_3
    :try_start_1
    iget-object p1, p0, Lf6/U;->c:LE4/n;

    .line 36
    .line 37
    iget v1, p0, Lf6/U;->q:I

    .line 38
    .line 39
    add-int/2addr v1, v0

    .line 40
    invoke-virtual {p1, v1}, LE4/n;->i(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lf6/T;

    .line 45
    .line 46
    iget-object p1, p1, Lf6/T;->a:LE5/T;

    .line 47
    .line 48
    iget-object v0, p0, Lf6/U;->g:LE5/T;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    if-eq p1, v0, :cond_4

    .line 51
    .line 52
    monitor-exit p0

    .line 53
    return v3

    .line 54
    :cond_4
    :try_start_2
    iget p1, p0, Lf6/U;->s:I

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Lf6/U;->j(I)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {p0, p1}, Lf6/U;->m(I)Z

    .line 61
    .line 62
    .line 63
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    monitor-exit p0

    .line 65
    return p1

    .line 66
    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 67
    throw p1
.end method

.method public final m(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lf6/U;->h:LA/e0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, LA/e0;->r()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x4

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lf6/U;->m:[I

    .line 13
    .line 14
    aget p1, v0, p1

    .line 15
    .line 16
    const/high16 v0, 0x40000000    # 2.0f

    .line 17
    .line 18
    and-int/2addr p1, v0

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lf6/U;->h:LA/e0;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_1
    const/4 p1, 0x1

    .line 29
    return p1
.end method

.method public final n(LE5/T;LS3/s;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lf6/U;->g:LE5/T;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-eqz v1, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    iget-object v0, v0, LE5/T;->o:LI5/c;

    .line 13
    .line 14
    :goto_1
    iput-object p1, p0, Lf6/U;->g:LE5/T;

    .line 15
    .line 16
    iget-object v2, p1, LE5/T;->o:LI5/c;

    .line 17
    .line 18
    iget-object v3, p0, Lf6/U;->d:LI5/i;

    .line 19
    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    invoke-interface {v3, p1}, LI5/i;->k(LE5/T;)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-virtual {p1}, LE5/T;->a()LE5/S;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    iput v4, v5, LE5/S;->D:I

    .line 31
    .line 32
    new-instance v4, LE5/T;

    .line 33
    .line 34
    invoke-direct {v4, v5}, LE5/T;-><init>(LE5/S;)V

    .line 35
    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    move-object v4, p1

    .line 39
    :goto_2
    iput-object v4, p2, LS3/s;->c:Ljava/lang/Object;

    .line 40
    .line 41
    iget-object v4, p0, Lf6/U;->h:LA/e0;

    .line 42
    .line 43
    iput-object v4, p2, LS3/s;->b:Ljava/lang/Object;

    .line 44
    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    if-nez v1, :cond_4

    .line 49
    .line 50
    invoke-static {v0, v2}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_4
    iget-object v0, p0, Lf6/U;->h:LA/e0;

    .line 58
    .line 59
    iget-object v1, p0, Lf6/U;->e:LI5/f;

    .line 60
    .line 61
    invoke-interface {v3, v1, p1}, LI5/i;->i(LI5/f;LE5/T;)LA/e0;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Lf6/U;->h:LA/e0;

    .line 66
    .line 67
    iput-object p1, p2, LS3/s;->b:Ljava/lang/Object;

    .line 68
    .line 69
    if-eqz v0, :cond_5

    .line 70
    .line 71
    invoke-virtual {v0, v1}, LA/e0;->y(LI5/f;)V

    .line 72
    .line 73
    .line 74
    :cond_5
    :goto_3
    return-void
.end method

.method public final o(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lf6/U;->a:Lf6/S;

    .line 2
    .line 3
    iget-object v1, v0, Lf6/S;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LA7/B1;

    .line 6
    .line 7
    iget-object v2, v1, LA7/B1;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lt6/a;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget-object v2, v0, Lf6/S;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lo2/e;

    .line 19
    .line 20
    monitor-enter v2

    .line 21
    move-object v5, v1

    .line 22
    :cond_1
    :goto_0
    if-eqz v5, :cond_3

    .line 23
    .line 24
    :try_start_0
    iget-object v6, v2, Lo2/e;->g:[Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v6, [Lt6/a;

    .line 27
    .line 28
    iget v7, v2, Lo2/e;->f:I

    .line 29
    .line 30
    add-int/lit8 v8, v7, 0x1

    .line 31
    .line 32
    iput v8, v2, Lo2/e;->f:I

    .line 33
    .line 34
    iget-object v8, v5, LA7/B1;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v8, Lt6/a;

    .line 37
    .line 38
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    aput-object v8, v6, v7

    .line 42
    .line 43
    iget v6, v2, Lo2/e;->e:I

    .line 44
    .line 45
    sub-int/2addr v6, v4

    .line 46
    iput v6, v2, Lo2/e;->e:I

    .line 47
    .line 48
    iget-object v5, v5, LA7/B1;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v5, LA7/B1;

    .line 51
    .line 52
    if-eqz v5, :cond_2

    .line 53
    .line 54
    iget-object v6, v5, LA7/B1;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v6, Lt6/a;

    .line 57
    .line 58
    if-nez v6, :cond_1

    .line 59
    .line 60
    :cond_2
    move-object v5, v3

    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    goto :goto_4

    .line 64
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    monitor-exit v2

    .line 68
    iput-object v3, v1, LA7/B1;->d:Ljava/lang/Object;

    .line 69
    .line 70
    iput-object v3, v1, LA7/B1;->e:Ljava/lang/Object;

    .line 71
    .line 72
    :goto_1
    iget-object v1, v0, Lf6/S;->f:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, LA7/B1;

    .line 75
    .line 76
    iget v2, v0, Lf6/S;->b:I

    .line 77
    .line 78
    iget-object v5, v1, LA7/B1;->d:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v5, Lt6/a;

    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    if-nez v5, :cond_4

    .line 84
    .line 85
    move v5, v4

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move v5, v6

    .line 88
    :goto_2
    invoke-static {v5}, Lu6/a;->i(Z)V

    .line 89
    .line 90
    .line 91
    const-wide/16 v7, 0x0

    .line 92
    .line 93
    iput-wide v7, v1, LA7/B1;->b:J

    .line 94
    .line 95
    int-to-long v9, v2

    .line 96
    iput-wide v9, v1, LA7/B1;->c:J

    .line 97
    .line 98
    iget-object v1, v0, Lf6/S;->f:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, LA7/B1;

    .line 101
    .line 102
    iput-object v1, v0, Lf6/S;->g:Ljava/lang/Object;

    .line 103
    .line 104
    iput-object v1, v0, Lf6/S;->h:Ljava/lang/Object;

    .line 105
    .line 106
    iput-wide v7, v0, Lf6/S;->c:J

    .line 107
    .line 108
    iget-object v0, v0, Lf6/S;->d:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Lo2/e;

    .line 111
    .line 112
    invoke-virtual {v0}, Lo2/e;->d()V

    .line 113
    .line 114
    .line 115
    iput v6, p0, Lf6/U;->p:I

    .line 116
    .line 117
    iput v6, p0, Lf6/U;->q:I

    .line 118
    .line 119
    iput v6, p0, Lf6/U;->r:I

    .line 120
    .line 121
    iput v6, p0, Lf6/U;->s:I

    .line 122
    .line 123
    iput-boolean v4, p0, Lf6/U;->x:Z

    .line 124
    .line 125
    const-wide/high16 v0, -0x8000000000000000L

    .line 126
    .line 127
    iput-wide v0, p0, Lf6/U;->t:J

    .line 128
    .line 129
    iput-wide v0, p0, Lf6/U;->u:J

    .line 130
    .line 131
    iput-wide v0, p0, Lf6/U;->v:J

    .line 132
    .line 133
    iput-boolean v6, p0, Lf6/U;->w:Z

    .line 134
    .line 135
    iget-object v0, p0, Lf6/U;->c:LE4/n;

    .line 136
    .line 137
    :goto_3
    iget-object v1, v0, LE4/n;->c:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v1, Landroid/util/SparseArray;

    .line 140
    .line 141
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-ge v6, v2, :cond_5

    .line 146
    .line 147
    invoke-virtual {v1, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    iget-object v2, v0, LE4/n;->d:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v2, Lcom/applovin/impl/Z0;

    .line 154
    .line 155
    invoke-virtual {v2, v1}, Lcom/applovin/impl/Z0;->accept(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    add-int/lit8 v6, v6, 0x1

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_5
    const/4 v2, -0x1

    .line 162
    iput v2, v0, LE4/n;->b:I

    .line 163
    .line 164
    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 165
    .line 166
    .line 167
    if-eqz p1, :cond_6

    .line 168
    .line 169
    iput-object v3, p0, Lf6/U;->z:LE5/T;

    .line 170
    .line 171
    iput-boolean v4, p0, Lf6/U;->y:Z

    .line 172
    .line 173
    :cond_6
    return-void

    .line 174
    :goto_4
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 175
    throw p1
.end method

.method public final declared-synchronized p()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    iput v0, p0, Lf6/U;->s:I

    .line 4
    .line 5
    iget-object v0, p0, Lf6/U;->a:Lf6/S;

    .line 6
    .line 7
    iget-object v1, v0, Lf6/S;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, LA7/B1;

    .line 10
    .line 11
    iput-object v1, v0, Lf6/S;->g:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    monitor-exit p0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw v0
.end method

.method public final declared-synchronized q(JZ)Z
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lf6/U;->p()V

    .line 3
    .line 4
    .line 5
    iget v0, p0, Lf6/U;->s:I

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lf6/U;->j(I)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget v0, p0, Lf6/U;->s:I

    .line 12
    .line 13
    iget v1, p0, Lf6/U;->p:I

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x1

    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    move v3, v8

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v3, v7

    .line 22
    :goto_0
    if-eqz v3, :cond_1

    .line 23
    .line 24
    iget-object v3, p0, Lf6/U;->n:[J

    .line 25
    .line 26
    aget-wide v4, v3, v2

    .line 27
    .line 28
    cmp-long v3, p1, v4

    .line 29
    .line 30
    if-ltz v3, :cond_1

    .line 31
    .line 32
    iget-wide v3, p0, Lf6/U;->v:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 33
    .line 34
    cmp-long v3, p1, v3

    .line 35
    .line 36
    if-lez v3, :cond_2

    .line 37
    .line 38
    if-nez p3, :cond_2

    .line 39
    .line 40
    :cond_1
    move-object v1, p0

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    sub-int v3, v1, v0

    .line 43
    .line 44
    const/4 v6, 0x1

    .line 45
    move-object v1, p0

    .line 46
    move-wide v4, p1

    .line 47
    :try_start_1
    invoke-virtual/range {v1 .. v6}, Lf6/U;->h(IIJZ)I

    .line 48
    .line 49
    .line 50
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    const/4 p2, -0x1

    .line 52
    if-ne p1, p2, :cond_3

    .line 53
    .line 54
    monitor-exit p0

    .line 55
    return v7

    .line 56
    :cond_3
    :try_start_2
    iput-wide v4, v1, Lf6/U;->t:J

    .line 57
    .line 58
    iget p2, v1, Lf6/U;->s:I

    .line 59
    .line 60
    add-int/2addr p2, p1

    .line 61
    iput p2, v1, Lf6/U;->s:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    .line 63
    monitor-exit p0

    .line 64
    return v8

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    :goto_1
    move-object p1, v0

    .line 67
    goto :goto_3

    .line 68
    :catchall_1
    move-exception v0

    .line 69
    move-object v1, p0

    .line 70
    goto :goto_1

    .line 71
    :goto_2
    monitor-exit p0

    .line 72
    return v7

    .line 73
    :goto_3
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 74
    throw p1
.end method

.method public final declared-synchronized r(I)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    :try_start_0
    iget v0, p0, Lf6/U;->s:I

    .line 5
    .line 6
    add-int/2addr v0, p1

    .line 7
    iget v1, p0, Lf6/U;->p:I

    .line 8
    .line 9
    if-gt v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    invoke-static {v0}, Lu6/a;->e(Z)V

    .line 17
    .line 18
    .line 19
    iget v0, p0, Lf6/U;->s:I

    .line 20
    .line 21
    add-int/2addr v0, p1

    .line 22
    iput v0, p0, Lf6/U;->s:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    return-void

    .line 26
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw p1
.end method
