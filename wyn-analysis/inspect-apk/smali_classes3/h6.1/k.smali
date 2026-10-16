.class public final Lh6/k;
.super LE5/f;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public A:J

.field public B:J

.field public C:J

.field public final m:Landroid/os/Handler;

.field public final n:LE5/F;

.field public final o:Lh6/i;

.field public final p:LS3/s;

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:I

.field public u:LE5/T;

.field public v:Lh6/g;

.field public w:Lh6/j;

.field public x:Lh6/d;

.field public y:Lh6/d;

.field public z:I


# direct methods
.method public constructor <init>(LE5/F;Landroid/os/Looper;)V
    .locals 2

    .line 1
    sget-object v0, Lh6/i;->a:Lh6/i;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {p0, v1}, LE5/f;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lh6/k;->n:LE5/F;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget p1, Lu6/v;->a:I

    .line 14
    .line 15
    new-instance p1, Landroid/os/Handler;

    .line 16
    .line 17
    invoke-direct {p1, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iput-object p1, p0, Lh6/k;->m:Landroid/os/Handler;

    .line 21
    .line 22
    iput-object v0, p0, Lh6/k;->o:Lh6/i;

    .line 23
    .line 24
    new-instance p1, LS3/s;

    .line 25
    .line 26
    const/4 p2, 0x4

    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-direct {p1, p2, v0}, LS3/s;-><init>(IC)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lh6/k;->p:LS3/s;

    .line 32
    .line 33
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    iput-wide p1, p0, Lh6/k;->A:J

    .line 39
    .line 40
    iput-wide p1, p0, Lh6/k;->B:J

    .line 41
    .line 42
    iput-wide p1, p0, Lh6/k;->C:J

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final A(Lh6/c;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lh6/c;->a:Ll8/K;

    .line 2
    .line 3
    iget-object v1, p0, Lh6/k;->n:LE5/F;

    .line 4
    .line 5
    iget-object v2, v1, LE5/F;->a:LE5/I;

    .line 6
    .line 7
    iget-object v2, v2, LE5/I;->l:LK8/H;

    .line 8
    .line 9
    new-instance v3, LE5/C;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v3, v4, v0}, LE5/C;-><init>(ILjava/util/List;)V

    .line 13
    .line 14
    .line 15
    const/16 v0, 0x1b

    .line 16
    .line 17
    invoke-virtual {v2, v0, v3}, LK8/H;->p(ILu6/g;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v1, LE5/F;->a:LE5/I;

    .line 21
    .line 22
    iput-object p1, v1, LE5/I;->d0:Lh6/c;

    .line 23
    .line 24
    new-instance v2, LB8/b;

    .line 25
    .line 26
    const/4 v3, 0x6

    .line 27
    invoke-direct {v2, p1, v3}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    iget-object p1, v1, LE5/I;->l:LK8/H;

    .line 31
    .line 32
    invoke-virtual {p1, v0, v2}, LK8/H;->p(ILu6/g;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final B()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lh6/k;->w:Lh6/j;

    .line 3
    .line 4
    const/4 v1, -0x1

    .line 5
    iput v1, p0, Lh6/k;->z:I

    .line 6
    .line 7
    iget-object v1, p0, Lh6/k;->x:Lh6/d;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lh6/d;->o()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lh6/k;->x:Lh6/d;

    .line 15
    .line 16
    :cond_0
    iget-object v1, p0, Lh6/k;->y:Lh6/d;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, Lh6/d;->o()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lh6/k;->y:Lh6/d;

    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "TextRenderer"

    .line 2
    .line 3
    return-object v0
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 1

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Lh6/c;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lh6/k;->A(Lh6/c;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p1
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh6/k;->r:Z

    .line 2
    .line 3
    return v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final k()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lh6/k;->u:LE5/T;

    .line 3
    .line 4
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v1, p0, Lh6/k;->A:J

    .line 10
    .line 11
    new-instance v3, Lh6/c;

    .line 12
    .line 13
    sget-object v4, Ll8/e0;->e:Ll8/e0;

    .line 14
    .line 15
    iget-wide v5, p0, Lh6/k;->C:J

    .line 16
    .line 17
    invoke-virtual {p0, v5, v6}, Lh6/k;->z(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    invoke-direct {v3, v4, v5, v6}, Lh6/c;-><init>(Ljava/util/List;J)V

    .line 22
    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    iget-object v5, p0, Lh6/k;->m:Landroid/os/Handler;

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    invoke-virtual {v5, v4, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p0, v3}, Lh6/k;->A(Lh6/c;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iput-wide v1, p0, Lh6/k;->B:J

    .line 41
    .line 42
    iput-wide v1, p0, Lh6/k;->C:J

    .line 43
    .line 44
    invoke-virtual {p0}, Lh6/k;->B()V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lh6/k;->v:Lh6/g;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-interface {v1}, LH5/d;->release()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lh6/k;->v:Lh6/g;

    .line 56
    .line 57
    iput v4, p0, Lh6/k;->t:I

    .line 58
    .line 59
    return-void
.end method

.method public final m(JZ)V
    .locals 5

    .line 1
    const/4 p3, 0x3

    .line 2
    const/4 v0, 0x1

    .line 3
    const/4 v1, 0x0

    .line 4
    iput-wide p1, p0, Lh6/k;->C:J

    .line 5
    .line 6
    new-instance p1, Lh6/c;

    .line 7
    .line 8
    sget-object p2, Ll8/e0;->e:Ll8/e0;

    .line 9
    .line 10
    iget-wide v2, p0, Lh6/k;->C:J

    .line 11
    .line 12
    invoke-virtual {p0, v2, v3}, Lh6/k;->z(J)J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-direct {p1, p2, v2, v3}, Lh6/c;-><init>(Ljava/util/List;J)V

    .line 17
    .line 18
    .line 19
    iget-object p2, p0, Lh6/k;->m:Landroid/os/Handler;

    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0, p1}, Lh6/k;->A(Lh6/c;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    iput-boolean v1, p0, Lh6/k;->q:Z

    .line 35
    .line 36
    iput-boolean v1, p0, Lh6/k;->r:Z

    .line 37
    .line 38
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    iput-wide p1, p0, Lh6/k;->A:J

    .line 44
    .line 45
    iget p1, p0, Lh6/k;->t:I

    .line 46
    .line 47
    if-eqz p1, :cond_e

    .line 48
    .line 49
    invoke-virtual {p0}, Lh6/k;->B()V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lh6/k;->v:Lh6/g;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, LH5/d;->release()V

    .line 58
    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    iput-object p1, p0, Lh6/k;->v:Lh6/g;

    .line 62
    .line 63
    iput v1, p0, Lh6/k;->t:I

    .line 64
    .line 65
    iput-boolean v0, p0, Lh6/k;->s:Z

    .line 66
    .line 67
    iget-object p1, p0, Lh6/k;->u:LE5/T;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object p2, p0, Lh6/k;->o:Lh6/i;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object p2, p1, LE5/T;->l:Ljava/lang/String;

    .line 78
    .line 79
    if-eqz p2, :cond_d

    .line 80
    .line 81
    iget v2, p1, LE5/T;->D:I

    .line 82
    .line 83
    iget-object p1, p1, LE5/T;->n:Ljava/util/List;

    .line 84
    .line 85
    const/4 v3, -0x1

    .line 86
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    sparse-switch v4, :sswitch_data_0

    .line 91
    .line 92
    .line 93
    :goto_1
    move v0, v3

    .line 94
    goto/16 :goto_2

    .line 95
    .line 96
    :sswitch_0
    const-string v0, "application/ttml+xml"

    .line 97
    .line 98
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_1
    const/16 v0, 0xb

    .line 106
    .line 107
    goto/16 :goto_2

    .line 108
    .line 109
    :sswitch_1
    const-string v0, "application/x-subrip"

    .line 110
    .line 111
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-nez v0, :cond_2

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    const/16 v0, 0xa

    .line 119
    .line 120
    goto/16 :goto_2

    .line 121
    .line 122
    :sswitch_2
    const-string v0, "application/cea-708"

    .line 123
    .line 124
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_3

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_3
    const/16 v0, 0x9

    .line 132
    .line 133
    goto/16 :goto_2

    .line 134
    .line 135
    :sswitch_3
    const-string v0, "application/cea-608"

    .line 136
    .line 137
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-nez v0, :cond_4

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_4
    const/16 v0, 0x8

    .line 145
    .line 146
    goto/16 :goto_2

    .line 147
    .line 148
    :sswitch_4
    const-string v0, "text/x-exoplayer-cues"

    .line 149
    .line 150
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-nez v0, :cond_5

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_5
    const/4 v0, 0x7

    .line 158
    goto :goto_2

    .line 159
    :sswitch_5
    const-string v0, "application/x-mp4-cea-608"

    .line 160
    .line 161
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-nez v0, :cond_6

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_6
    const/4 v0, 0x6

    .line 169
    goto :goto_2

    .line 170
    :sswitch_6
    const-string v0, "text/x-ssa"

    .line 171
    .line 172
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-nez v0, :cond_7

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_7
    const/4 v0, 0x5

    .line 180
    goto :goto_2

    .line 181
    :sswitch_7
    const-string v0, "application/x-quicktime-tx3g"

    .line 182
    .line 183
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-nez v0, :cond_8

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_8
    const/4 v0, 0x4

    .line 191
    goto :goto_2

    .line 192
    :sswitch_8
    const-string v0, "text/vtt"

    .line 193
    .line 194
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-nez v0, :cond_9

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_9
    move v0, p3

    .line 202
    goto :goto_2

    .line 203
    :sswitch_9
    const-string v0, "application/x-mp4-vtt"

    .line 204
    .line 205
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-nez v0, :cond_a

    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_a
    const/4 v0, 0x2

    .line 213
    goto :goto_2

    .line 214
    :sswitch_a
    const-string v1, "application/pgs"

    .line 215
    .line 216
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-nez v1, :cond_c

    .line 221
    .line 222
    goto/16 :goto_1

    .line 223
    .line 224
    :sswitch_b
    const-string v0, "application/dvbsubs"

    .line 225
    .line 226
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-nez v0, :cond_b

    .line 231
    .line 232
    goto/16 :goto_1

    .line 233
    .line 234
    :cond_b
    move v0, v1

    .line 235
    :cond_c
    :goto_2
    packed-switch v0, :pswitch_data_0

    .line 236
    .line 237
    .line 238
    goto :goto_5

    .line 239
    :pswitch_0
    new-instance p1, Lo6/c;

    .line 240
    .line 241
    invoke-direct {p1}, Lo6/c;-><init>()V

    .line 242
    .line 243
    .line 244
    goto :goto_4

    .line 245
    :pswitch_1
    new-instance p1, Ln6/a;

    .line 246
    .line 247
    invoke-direct {p1}, Ln6/a;-><init>()V

    .line 248
    .line 249
    .line 250
    goto :goto_4

    .line 251
    :pswitch_2
    new-instance p2, Li6/f;

    .line 252
    .line 253
    invoke-direct {p2, v2, p1}, Li6/f;-><init>(ILjava/util/List;)V

    .line 254
    .line 255
    .line 256
    :goto_3
    move-object p1, p2

    .line 257
    goto :goto_4

    .line 258
    :pswitch_3
    new-instance p1, LN7/e;

    .line 259
    .line 260
    invoke-direct {p1, p3}, LN7/e;-><init>(I)V

    .line 261
    .line 262
    .line 263
    goto :goto_4

    .line 264
    :pswitch_4
    new-instance p1, Li6/c;

    .line 265
    .line 266
    invoke-direct {p1, p2, v2}, Li6/c;-><init>(Ljava/lang/String;I)V

    .line 267
    .line 268
    .line 269
    goto :goto_4

    .line 270
    :pswitch_5
    new-instance p2, Lm6/a;

    .line 271
    .line 272
    invoke-direct {p2, p1}, Lm6/a;-><init>(Ljava/util/List;)V

    .line 273
    .line 274
    .line 275
    goto :goto_3

    .line 276
    :pswitch_6
    new-instance p2, Lp6/a;

    .line 277
    .line 278
    invoke-direct {p2, p1}, Lp6/a;-><init>(Ljava/util/List;)V

    .line 279
    .line 280
    .line 281
    goto :goto_3

    .line 282
    :pswitch_7
    new-instance p1, Lq6/i;

    .line 283
    .line 284
    invoke-direct {p1}, Lq6/i;-><init>()V

    .line 285
    .line 286
    .line 287
    goto :goto_4

    .line 288
    :pswitch_8
    new-instance p1, Lj6/a;

    .line 289
    .line 290
    invoke-direct {p1}, Lj6/a;-><init>()V

    .line 291
    .line 292
    .line 293
    goto :goto_4

    .line 294
    :pswitch_9
    new-instance p1, Lk6/a;

    .line 295
    .line 296
    invoke-direct {p1}, Lk6/a;-><init>()V

    .line 297
    .line 298
    .line 299
    goto :goto_4

    .line 300
    :pswitch_a
    new-instance p2, Lj6/a;

    .line 301
    .line 302
    invoke-direct {p2, p1}, Lj6/a;-><init>(Ljava/util/List;)V

    .line 303
    .line 304
    .line 305
    goto :goto_3

    .line 306
    :goto_4
    iput-object p1, p0, Lh6/k;->v:Lh6/g;

    .line 307
    .line 308
    return-void

    .line 309
    :cond_d
    :goto_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 310
    .line 311
    const-string p3, "Attempted to create decoder for unsupported MIME type: "

    .line 312
    .line 313
    invoke-static {p3, p2}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p2

    .line 317
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    throw p1

    .line 321
    :cond_e
    invoke-virtual {p0}, Lh6/k;->B()V

    .line 322
    .line 323
    .line 324
    iget-object p1, p0, Lh6/k;->v:Lh6/g;

    .line 325
    .line 326
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    invoke-interface {p1}, LH5/d;->flush()V

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :sswitch_data_0
    .sparse-switch
        -0x5091057c -> :sswitch_b
        -0x4a6813e3 -> :sswitch_a
        -0x3d28a9ba -> :sswitch_9
        -0x3be2f26c -> :sswitch_8
        0x2935f49f -> :sswitch_7
        0x310bebca -> :sswitch_6
        0x37713300 -> :sswitch_5
        0x47a1c707 -> :sswitch_4
        0x5d578071 -> :sswitch_3
        0x5d578432 -> :sswitch_2
        0x63771bad -> :sswitch_1
        0x64f8068a -> :sswitch_0
    .end sparse-switch

    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q([LE5/T;JJ)V
    .locals 3

    .line 1
    const/4 p2, 0x3

    .line 2
    iput-wide p4, p0, Lh6/k;->B:J

    .line 3
    .line 4
    const/4 p3, 0x0

    .line 5
    aget-object p1, p1, p3

    .line 6
    .line 7
    iput-object p1, p0, Lh6/k;->u:LE5/T;

    .line 8
    .line 9
    iget-object p4, p0, Lh6/k;->v:Lh6/g;

    .line 10
    .line 11
    const/4 p5, 0x1

    .line 12
    if-eqz p4, :cond_0

    .line 13
    .line 14
    iput p5, p0, Lh6/k;->t:I

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iput-boolean p5, p0, Lh6/k;->s:Z

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object p4, p0, Lh6/k;->o:Lh6/i;

    .line 23
    .line 24
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object p4, p1, LE5/T;->l:Ljava/lang/String;

    .line 28
    .line 29
    if-eqz p4, :cond_d

    .line 30
    .line 31
    iget v0, p1, LE5/T;->D:I

    .line 32
    .line 33
    iget-object p1, p1, LE5/T;->n:Ljava/util/List;

    .line 34
    .line 35
    const/4 v1, -0x1

    .line 36
    invoke-virtual {p4}, Ljava/lang/String;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    sparse-switch v2, :sswitch_data_0

    .line 41
    .line 42
    .line 43
    :goto_0
    move p3, v1

    .line 44
    goto/16 :goto_1

    .line 45
    .line 46
    :sswitch_0
    const-string p3, "application/ttml+xml"

    .line 47
    .line 48
    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    if-nez p3, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const/16 p3, 0xb

    .line 56
    .line 57
    goto/16 :goto_1

    .line 58
    .line 59
    :sswitch_1
    const-string p3, "application/x-subrip"

    .line 60
    .line 61
    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    if-nez p3, :cond_2

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const/16 p3, 0xa

    .line 69
    .line 70
    goto/16 :goto_1

    .line 71
    .line 72
    :sswitch_2
    const-string p3, "application/cea-708"

    .line 73
    .line 74
    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p3

    .line 78
    if-nez p3, :cond_3

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    const/16 p3, 0x9

    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :sswitch_3
    const-string p3, "application/cea-608"

    .line 86
    .line 87
    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p3

    .line 91
    if-nez p3, :cond_4

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    const/16 p3, 0x8

    .line 95
    .line 96
    goto/16 :goto_1

    .line 97
    .line 98
    :sswitch_4
    const-string p3, "text/x-exoplayer-cues"

    .line 99
    .line 100
    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    if-nez p3, :cond_5

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_5
    const/4 p3, 0x7

    .line 108
    goto :goto_1

    .line 109
    :sswitch_5
    const-string p3, "application/x-mp4-cea-608"

    .line 110
    .line 111
    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p3

    .line 115
    if-nez p3, :cond_6

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_6
    const/4 p3, 0x6

    .line 119
    goto :goto_1

    .line 120
    :sswitch_6
    const-string p3, "text/x-ssa"

    .line 121
    .line 122
    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    if-nez p3, :cond_7

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_7
    const/4 p3, 0x5

    .line 130
    goto :goto_1

    .line 131
    :sswitch_7
    const-string p3, "application/x-quicktime-tx3g"

    .line 132
    .line 133
    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p3

    .line 137
    if-nez p3, :cond_8

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_8
    const/4 p3, 0x4

    .line 141
    goto :goto_1

    .line 142
    :sswitch_8
    const-string p3, "text/vtt"

    .line 143
    .line 144
    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p3

    .line 148
    if-nez p3, :cond_9

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_9
    move p3, p2

    .line 152
    goto :goto_1

    .line 153
    :sswitch_9
    const-string p3, "application/x-mp4-vtt"

    .line 154
    .line 155
    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result p3

    .line 159
    if-nez p3, :cond_a

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_a
    const/4 p3, 0x2

    .line 163
    goto :goto_1

    .line 164
    :sswitch_a
    const-string p3, "application/pgs"

    .line 165
    .line 166
    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result p3

    .line 170
    if-nez p3, :cond_b

    .line 171
    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    :cond_b
    move p3, p5

    .line 175
    goto :goto_1

    .line 176
    :sswitch_b
    const-string p5, "application/dvbsubs"

    .line 177
    .line 178
    invoke-virtual {p4, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result p5

    .line 182
    if-nez p5, :cond_c

    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :cond_c
    :goto_1
    packed-switch p3, :pswitch_data_0

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :pswitch_0
    new-instance p1, Lo6/c;

    .line 191
    .line 192
    invoke-direct {p1}, Lo6/c;-><init>()V

    .line 193
    .line 194
    .line 195
    goto :goto_3

    .line 196
    :pswitch_1
    new-instance p1, Ln6/a;

    .line 197
    .line 198
    invoke-direct {p1}, Ln6/a;-><init>()V

    .line 199
    .line 200
    .line 201
    goto :goto_3

    .line 202
    :pswitch_2
    new-instance p2, Li6/f;

    .line 203
    .line 204
    invoke-direct {p2, v0, p1}, Li6/f;-><init>(ILjava/util/List;)V

    .line 205
    .line 206
    .line 207
    :goto_2
    move-object p1, p2

    .line 208
    goto :goto_3

    .line 209
    :pswitch_3
    new-instance p1, LN7/e;

    .line 210
    .line 211
    invoke-direct {p1, p2}, LN7/e;-><init>(I)V

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :pswitch_4
    new-instance p1, Li6/c;

    .line 216
    .line 217
    invoke-direct {p1, p4, v0}, Li6/c;-><init>(Ljava/lang/String;I)V

    .line 218
    .line 219
    .line 220
    goto :goto_3

    .line 221
    :pswitch_5
    new-instance p2, Lm6/a;

    .line 222
    .line 223
    invoke-direct {p2, p1}, Lm6/a;-><init>(Ljava/util/List;)V

    .line 224
    .line 225
    .line 226
    goto :goto_2

    .line 227
    :pswitch_6
    new-instance p2, Lp6/a;

    .line 228
    .line 229
    invoke-direct {p2, p1}, Lp6/a;-><init>(Ljava/util/List;)V

    .line 230
    .line 231
    .line 232
    goto :goto_2

    .line 233
    :pswitch_7
    new-instance p1, Lq6/i;

    .line 234
    .line 235
    invoke-direct {p1}, Lq6/i;-><init>()V

    .line 236
    .line 237
    .line 238
    goto :goto_3

    .line 239
    :pswitch_8
    new-instance p1, Lj6/a;

    .line 240
    .line 241
    invoke-direct {p1}, Lj6/a;-><init>()V

    .line 242
    .line 243
    .line 244
    goto :goto_3

    .line 245
    :pswitch_9
    new-instance p1, Lk6/a;

    .line 246
    .line 247
    invoke-direct {p1}, Lk6/a;-><init>()V

    .line 248
    .line 249
    .line 250
    goto :goto_3

    .line 251
    :pswitch_a
    new-instance p2, Lj6/a;

    .line 252
    .line 253
    invoke-direct {p2, p1}, Lj6/a;-><init>(Ljava/util/List;)V

    .line 254
    .line 255
    .line 256
    goto :goto_2

    .line 257
    :goto_3
    iput-object p1, p0, Lh6/k;->v:Lh6/g;

    .line 258
    .line 259
    return-void

    .line 260
    :cond_d
    :goto_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 261
    .line 262
    const-string p2, "Attempted to create decoder for unsupported MIME type: "

    .line 263
    .line 264
    invoke-static {p2, p4}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p2

    .line 268
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    throw p1

    .line 272
    nop

    .line 273
    :sswitch_data_0
    .sparse-switch
        -0x5091057c -> :sswitch_b
        -0x4a6813e3 -> :sswitch_a
        -0x3d28a9ba -> :sswitch_9
        -0x3be2f26c -> :sswitch_8
        0x2935f49f -> :sswitch_7
        0x310bebca -> :sswitch_6
        0x37713300 -> :sswitch_5
        0x47a1c707 -> :sswitch_4
        0x5d578071 -> :sswitch_3
        0x5d578432 -> :sswitch_2
        0x63771bad -> :sswitch_1
        0x64f8068a -> :sswitch_0
    .end sparse-switch

    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
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
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final s(JJ)V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    const-string v4, "application/x-subrip"

    .line 6
    .line 7
    const-string v6, "application/cea-708"

    .line 8
    .line 9
    const-string v8, "application/cea-608"

    .line 10
    .line 11
    const-string v10, "text/x-exoplayer-cues"

    .line 12
    .line 13
    const-string v12, "application/x-mp4-cea-608"

    .line 14
    .line 15
    const-string v14, "text/x-ssa"

    .line 16
    .line 17
    const-string v15, "application/x-quicktime-tx3g"

    .line 18
    .line 19
    const-string v5, "text/vtt"

    .line 20
    .line 21
    const-string v7, "application/x-mp4-vtt"

    .line 22
    .line 23
    const-string v9, "application/pgs"

    .line 24
    .line 25
    const-string v11, "application/dvbsubs"

    .line 26
    .line 27
    iget-object v0, v1, Lh6/k;->p:LS3/s;

    .line 28
    .line 29
    iput-wide v2, v1, Lh6/k;->C:J

    .line 30
    .line 31
    iget-boolean v13, v1, LE5/f;->k:Z

    .line 32
    .line 33
    move-object/from16 v18, v14

    .line 34
    .line 35
    if-eqz v13, :cond_0

    .line 36
    .line 37
    iget-wide v13, v1, Lh6/k;->A:J

    .line 38
    .line 39
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    cmp-long v19, v13, v19

    .line 45
    .line 46
    if-eqz v19, :cond_0

    .line 47
    .line 48
    cmp-long v13, v2, v13

    .line 49
    .line 50
    if-ltz v13, :cond_0

    .line 51
    .line 52
    invoke-virtual {v1}, Lh6/k;->B()V

    .line 53
    .line 54
    .line 55
    const/4 v13, 0x1

    .line 56
    iput-boolean v13, v1, Lh6/k;->r:Z

    .line 57
    .line 58
    :cond_0
    iget-boolean v13, v1, Lh6/k;->r:Z

    .line 59
    .line 60
    if-eqz v13, :cond_1

    .line 61
    .line 62
    goto/16 :goto_1e

    .line 63
    .line 64
    :cond_1
    iget-object v13, v1, Lh6/k;->y:Lh6/d;

    .line 65
    .line 66
    const-string v14, "TextRenderer"

    .line 67
    .line 68
    move-object/from16 v19, v13

    .line 69
    .line 70
    const-string v13, "Subtitle decoding failed. streamFormat="

    .line 71
    .line 72
    move-object/from16 v20, v11

    .line 73
    .line 74
    const-string v11, "Attempted to create decoder for unsupported MIME type: "

    .line 75
    .line 76
    move-object/from16 v21, v11

    .line 77
    .line 78
    iget-object v11, v1, Lh6/k;->o:Lh6/i;

    .line 79
    .line 80
    move-object/from16 v22, v11

    .line 81
    .line 82
    iget-object v11, v1, Lh6/k;->m:Landroid/os/Handler;

    .line 83
    .line 84
    move-object/from16 v23, v9

    .line 85
    .line 86
    if-nez v19, :cond_2

    .line 87
    .line 88
    iget-object v9, v1, Lh6/k;->v:Lh6/g;

    .line 89
    .line 90
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-interface {v9, v2, v3}, Lh6/g;->a(J)V

    .line 94
    .line 95
    .line 96
    :try_start_0
    iget-object v9, v1, Lh6/k;->v:Lh6/g;

    .line 97
    .line 98
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-interface {v9}, LH5/d;->b()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    check-cast v9, Lh6/d;

    .line 106
    .line 107
    iput-object v9, v1, Lh6/k;->y:Lh6/d;
    :try_end_0
    .catch Lh6/h; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    :cond_2
    move-object/from16 v9, v20

    .line 110
    .line 111
    move-object/from16 v20, v13

    .line 112
    .line 113
    move-object v13, v9

    .line 114
    move-object/from16 v9, v18

    .line 115
    .line 116
    move-object/from16 v18, v14

    .line 117
    .line 118
    move-object/from16 v14, v21

    .line 119
    .line 120
    move-object/from16 v21, v11

    .line 121
    .line 122
    move-object/from16 v11, v23

    .line 123
    .line 124
    move-object/from16 v23, v0

    .line 125
    .line 126
    goto/16 :goto_6

    .line 127
    .line 128
    :catch_0
    move-exception v0

    .line 129
    new-instance v2, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v2, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    iget-object v3, v1, Lh6/k;->u:LE5/T;

    .line 135
    .line 136
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-static {v14, v2, v0}, Lu6/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    new-instance v0, Lh6/c;

    .line 147
    .line 148
    sget-object v2, Ll8/e0;->e:Ll8/e0;

    .line 149
    .line 150
    iget-wide v13, v1, Lh6/k;->C:J

    .line 151
    .line 152
    invoke-virtual {v1, v13, v14}, Lh6/k;->z(J)J

    .line 153
    .line 154
    .line 155
    move-result-wide v13

    .line 156
    invoke-direct {v0, v2, v13, v14}, Lh6/c;-><init>(Ljava/util/List;J)V

    .line 157
    .line 158
    .line 159
    if-eqz v11, :cond_3

    .line 160
    .line 161
    const/4 v2, 0x0

    .line 162
    invoke-virtual {v11, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 167
    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_3
    invoke-virtual {v1, v0}, Lh6/k;->A(Lh6/c;)V

    .line 171
    .line 172
    .line 173
    :goto_0
    invoke-virtual {v1}, Lh6/k;->B()V

    .line 174
    .line 175
    .line 176
    iget-object v0, v1, Lh6/k;->v:Lh6/g;

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-interface {v0}, LH5/d;->release()V

    .line 182
    .line 183
    .line 184
    const/4 v2, 0x0

    .line 185
    iput-object v2, v1, Lh6/k;->v:Lh6/g;

    .line 186
    .line 187
    const/4 v2, 0x0

    .line 188
    iput v2, v1, Lh6/k;->t:I

    .line 189
    .line 190
    const/4 v13, 0x1

    .line 191
    iput-boolean v13, v1, Lh6/k;->s:Z

    .line 192
    .line 193
    iget-object v0, v1, Lh6/k;->u:LE5/T;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iget-object v2, v0, LE5/T;->l:Ljava/lang/String;

    .line 202
    .line 203
    if-eqz v2, :cond_10

    .line 204
    .line 205
    iget v3, v0, LE5/T;->D:I

    .line 206
    .line 207
    iget-object v0, v0, LE5/T;->n:Ljava/util/List;

    .line 208
    .line 209
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    sparse-switch v9, :sswitch_data_0

    .line 214
    .line 215
    .line 216
    :goto_1
    const/4 v5, -0x1

    .line 217
    goto/16 :goto_2

    .line 218
    .line 219
    :sswitch_0
    const-string v4, "application/ttml+xml"

    .line 220
    .line 221
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-nez v4, :cond_4

    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_4
    const/16 v5, 0xb

    .line 229
    .line 230
    goto/16 :goto_2

    .line 231
    .line 232
    :sswitch_1
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    if-nez v4, :cond_5

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_5
    const/16 v5, 0xa

    .line 240
    .line 241
    goto/16 :goto_2

    .line 242
    .line 243
    :sswitch_2
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    if-nez v4, :cond_6

    .line 248
    .line 249
    goto :goto_1

    .line 250
    :cond_6
    const/16 v5, 0x9

    .line 251
    .line 252
    goto/16 :goto_2

    .line 253
    .line 254
    :sswitch_3
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    if-nez v4, :cond_7

    .line 259
    .line 260
    goto :goto_1

    .line 261
    :cond_7
    const/16 v5, 0x8

    .line 262
    .line 263
    goto :goto_2

    .line 264
    :sswitch_4
    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    if-nez v4, :cond_8

    .line 269
    .line 270
    goto :goto_1

    .line 271
    :cond_8
    const/4 v5, 0x7

    .line 272
    goto :goto_2

    .line 273
    :sswitch_5
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    if-nez v4, :cond_9

    .line 278
    .line 279
    goto :goto_1

    .line 280
    :cond_9
    const/4 v5, 0x6

    .line 281
    goto :goto_2

    .line 282
    :sswitch_6
    move-object/from16 v9, v18

    .line 283
    .line 284
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    if-nez v4, :cond_a

    .line 289
    .line 290
    goto :goto_1

    .line 291
    :cond_a
    const/4 v5, 0x5

    .line 292
    goto :goto_2

    .line 293
    :sswitch_7
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    if-nez v4, :cond_b

    .line 298
    .line 299
    goto :goto_1

    .line 300
    :cond_b
    const/4 v5, 0x4

    .line 301
    goto :goto_2

    .line 302
    :sswitch_8
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    if-nez v4, :cond_c

    .line 307
    .line 308
    goto :goto_1

    .line 309
    :cond_c
    const/4 v5, 0x3

    .line 310
    goto :goto_2

    .line 311
    :sswitch_9
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    if-nez v4, :cond_d

    .line 316
    .line 317
    goto :goto_1

    .line 318
    :cond_d
    const/4 v5, 0x2

    .line 319
    goto :goto_2

    .line 320
    :sswitch_a
    move-object/from16 v4, v23

    .line 321
    .line 322
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    if-nez v4, :cond_e

    .line 327
    .line 328
    goto :goto_1

    .line 329
    :cond_e
    const/4 v5, 0x1

    .line 330
    goto :goto_2

    .line 331
    :sswitch_b
    move-object/from16 v4, v20

    .line 332
    .line 333
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    if-nez v4, :cond_f

    .line 338
    .line 339
    goto :goto_1

    .line 340
    :cond_f
    const/4 v5, 0x0

    .line 341
    :goto_2
    packed-switch v5, :pswitch_data_0

    .line 342
    .line 343
    .line 344
    goto :goto_5

    .line 345
    :pswitch_0
    new-instance v0, Lo6/c;

    .line 346
    .line 347
    invoke-direct {v0}, Lo6/c;-><init>()V

    .line 348
    .line 349
    .line 350
    goto :goto_4

    .line 351
    :pswitch_1
    new-instance v0, Ln6/a;

    .line 352
    .line 353
    invoke-direct {v0}, Ln6/a;-><init>()V

    .line 354
    .line 355
    .line 356
    goto :goto_4

    .line 357
    :pswitch_2
    new-instance v2, Li6/f;

    .line 358
    .line 359
    invoke-direct {v2, v3, v0}, Li6/f;-><init>(ILjava/util/List;)V

    .line 360
    .line 361
    .line 362
    :goto_3
    move-object v0, v2

    .line 363
    goto :goto_4

    .line 364
    :pswitch_3
    new-instance v0, LN7/e;

    .line 365
    .line 366
    const/4 v2, 0x3

    .line 367
    invoke-direct {v0, v2}, LN7/e;-><init>(I)V

    .line 368
    .line 369
    .line 370
    goto :goto_4

    .line 371
    :pswitch_4
    new-instance v0, Li6/c;

    .line 372
    .line 373
    invoke-direct {v0, v2, v3}, Li6/c;-><init>(Ljava/lang/String;I)V

    .line 374
    .line 375
    .line 376
    goto :goto_4

    .line 377
    :pswitch_5
    new-instance v2, Lm6/a;

    .line 378
    .line 379
    invoke-direct {v2, v0}, Lm6/a;-><init>(Ljava/util/List;)V

    .line 380
    .line 381
    .line 382
    goto :goto_3

    .line 383
    :pswitch_6
    new-instance v2, Lp6/a;

    .line 384
    .line 385
    invoke-direct {v2, v0}, Lp6/a;-><init>(Ljava/util/List;)V

    .line 386
    .line 387
    .line 388
    goto :goto_3

    .line 389
    :pswitch_7
    new-instance v0, Lq6/i;

    .line 390
    .line 391
    invoke-direct {v0}, Lq6/i;-><init>()V

    .line 392
    .line 393
    .line 394
    goto :goto_4

    .line 395
    :pswitch_8
    new-instance v0, Lj6/a;

    .line 396
    .line 397
    invoke-direct {v0}, Lj6/a;-><init>()V

    .line 398
    .line 399
    .line 400
    goto :goto_4

    .line 401
    :pswitch_9
    new-instance v0, Lk6/a;

    .line 402
    .line 403
    invoke-direct {v0}, Lk6/a;-><init>()V

    .line 404
    .line 405
    .line 406
    goto :goto_4

    .line 407
    :pswitch_a
    new-instance v2, Lj6/a;

    .line 408
    .line 409
    invoke-direct {v2, v0}, Lj6/a;-><init>(Ljava/util/List;)V

    .line 410
    .line 411
    .line 412
    goto :goto_3

    .line 413
    :goto_4
    iput-object v0, v1, Lh6/k;->v:Lh6/g;

    .line 414
    .line 415
    goto/16 :goto_1e

    .line 416
    .line 417
    :cond_10
    :goto_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 418
    .line 419
    move-object/from16 v3, v21

    .line 420
    .line 421
    invoke-static {v3, v2}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    throw v0

    .line 429
    :goto_6
    iget v0, v1, LE5/f;->f:I

    .line 430
    .line 431
    const/4 v2, 0x2

    .line 432
    if-eq v0, v2, :cond_11

    .line 433
    .line 434
    goto/16 :goto_1e

    .line 435
    .line 436
    :cond_11
    iget-object v0, v1, Lh6/k;->x:Lh6/d;

    .line 437
    .line 438
    if-eqz v0, :cond_12

    .line 439
    .line 440
    invoke-virtual {v1}, Lh6/k;->y()J

    .line 441
    .line 442
    .line 443
    move-result-wide v2

    .line 444
    const/4 v0, 0x0

    .line 445
    :goto_7
    cmp-long v2, v2, p1

    .line 446
    .line 447
    if-gtz v2, :cond_13

    .line 448
    .line 449
    iget v0, v1, Lh6/k;->z:I

    .line 450
    .line 451
    const/16 v17, 0x1

    .line 452
    .line 453
    add-int/lit8 v0, v0, 0x1

    .line 454
    .line 455
    iput v0, v1, Lh6/k;->z:I

    .line 456
    .line 457
    invoke-virtual {v1}, Lh6/k;->y()J

    .line 458
    .line 459
    .line 460
    move-result-wide v2

    .line 461
    const/4 v0, 0x1

    .line 462
    goto :goto_7

    .line 463
    :cond_12
    const/4 v0, 0x0

    .line 464
    :cond_13
    iget-object v2, v1, Lh6/k;->y:Lh6/d;

    .line 465
    .line 466
    if-eqz v2, :cond_23

    .line 467
    .line 468
    const/4 v3, 0x4

    .line 469
    invoke-virtual {v2, v3}, LH5/a;->h(I)Z

    .line 470
    .line 471
    .line 472
    move-result v24

    .line 473
    if-eqz v24, :cond_24

    .line 474
    .line 475
    if-nez v0, :cond_23

    .line 476
    .line 477
    invoke-virtual {v1}, Lh6/k;->y()J

    .line 478
    .line 479
    .line 480
    move-result-wide v2

    .line 481
    const-wide v24, 0x7fffffffffffffffL

    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    cmp-long v2, v2, v24

    .line 487
    .line 488
    if-nez v2, :cond_23

    .line 489
    .line 490
    iget v2, v1, Lh6/k;->t:I

    .line 491
    .line 492
    const/4 v3, 0x2

    .line 493
    if-ne v2, v3, :cond_22

    .line 494
    .line 495
    invoke-virtual {v1}, Lh6/k;->B()V

    .line 496
    .line 497
    .line 498
    iget-object v2, v1, Lh6/k;->v:Lh6/g;

    .line 499
    .line 500
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    invoke-interface {v2}, LH5/d;->release()V

    .line 504
    .line 505
    .line 506
    const/4 v2, 0x0

    .line 507
    iput-object v2, v1, Lh6/k;->v:Lh6/g;

    .line 508
    .line 509
    const/4 v2, 0x0

    .line 510
    iput v2, v1, Lh6/k;->t:I

    .line 511
    .line 512
    const/4 v2, 0x1

    .line 513
    iput-boolean v2, v1, Lh6/k;->s:Z

    .line 514
    .line 515
    iget-object v2, v1, Lh6/k;->u:LE5/T;

    .line 516
    .line 517
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    iget-object v3, v2, LE5/T;->l:Ljava/lang/String;

    .line 524
    .line 525
    if-eqz v3, :cond_21

    .line 526
    .line 527
    move/from16 v24, v0

    .line 528
    .line 529
    iget v0, v2, LE5/T;->D:I

    .line 530
    .line 531
    iget-object v2, v2, LE5/T;->n:Ljava/util/List;

    .line 532
    .line 533
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 534
    .line 535
    .line 536
    move-result v25

    .line 537
    sparse-switch v25, :sswitch_data_1

    .line 538
    .line 539
    .line 540
    move-object/from16 v25, v14

    .line 541
    .line 542
    :goto_8
    const/4 v14, -0x1

    .line 543
    goto/16 :goto_a

    .line 544
    .line 545
    :sswitch_c
    move-object/from16 v25, v14

    .line 546
    .line 547
    const-string v14, "application/ttml+xml"

    .line 548
    .line 549
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    move-result v14

    .line 553
    if-nez v14, :cond_14

    .line 554
    .line 555
    goto/16 :goto_9

    .line 556
    .line 557
    :cond_14
    const/16 v14, 0xb

    .line 558
    .line 559
    goto/16 :goto_a

    .line 560
    .line 561
    :sswitch_d
    move-object/from16 v25, v14

    .line 562
    .line 563
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    move-result v14

    .line 567
    if-nez v14, :cond_15

    .line 568
    .line 569
    goto/16 :goto_9

    .line 570
    .line 571
    :cond_15
    const/16 v14, 0xa

    .line 572
    .line 573
    goto/16 :goto_a

    .line 574
    .line 575
    :sswitch_e
    move-object/from16 v25, v14

    .line 576
    .line 577
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    move-result v14

    .line 581
    if-nez v14, :cond_16

    .line 582
    .line 583
    goto/16 :goto_9

    .line 584
    .line 585
    :cond_16
    const/16 v14, 0x9

    .line 586
    .line 587
    goto/16 :goto_a

    .line 588
    .line 589
    :sswitch_f
    move-object/from16 v25, v14

    .line 590
    .line 591
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    move-result v14

    .line 595
    if-nez v14, :cond_17

    .line 596
    .line 597
    goto/16 :goto_9

    .line 598
    .line 599
    :cond_17
    const/16 v14, 0x8

    .line 600
    .line 601
    goto/16 :goto_a

    .line 602
    .line 603
    :sswitch_10
    move-object/from16 v25, v14

    .line 604
    .line 605
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    move-result v14

    .line 609
    if-nez v14, :cond_18

    .line 610
    .line 611
    goto :goto_9

    .line 612
    :cond_18
    const/4 v14, 0x7

    .line 613
    goto :goto_a

    .line 614
    :sswitch_11
    move-object/from16 v25, v14

    .line 615
    .line 616
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move-result v14

    .line 620
    if-nez v14, :cond_19

    .line 621
    .line 622
    goto :goto_9

    .line 623
    :cond_19
    const/4 v14, 0x6

    .line 624
    goto :goto_a

    .line 625
    :sswitch_12
    move-object/from16 v25, v14

    .line 626
    .line 627
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    move-result v14

    .line 631
    if-nez v14, :cond_1a

    .line 632
    .line 633
    goto :goto_9

    .line 634
    :cond_1a
    const/4 v14, 0x5

    .line 635
    goto :goto_a

    .line 636
    :sswitch_13
    move-object/from16 v25, v14

    .line 637
    .line 638
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 639
    .line 640
    .line 641
    move-result v14

    .line 642
    if-nez v14, :cond_1b

    .line 643
    .line 644
    goto :goto_9

    .line 645
    :cond_1b
    const/4 v14, 0x4

    .line 646
    goto :goto_a

    .line 647
    :sswitch_14
    move-object/from16 v25, v14

    .line 648
    .line 649
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    move-result v14

    .line 653
    if-nez v14, :cond_1c

    .line 654
    .line 655
    goto :goto_9

    .line 656
    :cond_1c
    const/4 v14, 0x3

    .line 657
    goto :goto_a

    .line 658
    :sswitch_15
    move-object/from16 v25, v14

    .line 659
    .line 660
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    move-result v14

    .line 664
    if-nez v14, :cond_1d

    .line 665
    .line 666
    goto :goto_9

    .line 667
    :cond_1d
    const/4 v14, 0x2

    .line 668
    goto :goto_a

    .line 669
    :sswitch_16
    move-object/from16 v25, v14

    .line 670
    .line 671
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    move-result v14

    .line 675
    if-nez v14, :cond_1e

    .line 676
    .line 677
    goto :goto_9

    .line 678
    :cond_1e
    const/4 v14, 0x1

    .line 679
    goto :goto_a

    .line 680
    :sswitch_17
    move-object/from16 v25, v14

    .line 681
    .line 682
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    move-result v14

    .line 686
    if-nez v14, :cond_1f

    .line 687
    .line 688
    :goto_9
    goto/16 :goto_8

    .line 689
    .line 690
    :cond_1f
    const/4 v14, 0x0

    .line 691
    :goto_a
    packed-switch v14, :pswitch_data_1

    .line 692
    .line 693
    .line 694
    goto :goto_d

    .line 695
    :pswitch_b
    new-instance v0, Lo6/c;

    .line 696
    .line 697
    invoke-direct {v0}, Lo6/c;-><init>()V

    .line 698
    .line 699
    .line 700
    goto :goto_b

    .line 701
    :pswitch_c
    new-instance v0, Ln6/a;

    .line 702
    .line 703
    invoke-direct {v0}, Ln6/a;-><init>()V

    .line 704
    .line 705
    .line 706
    goto :goto_b

    .line 707
    :pswitch_d
    new-instance v3, Li6/f;

    .line 708
    .line 709
    invoke-direct {v3, v0, v2}, Li6/f;-><init>(ILjava/util/List;)V

    .line 710
    .line 711
    .line 712
    move-object v0, v3

    .line 713
    goto :goto_b

    .line 714
    :pswitch_e
    new-instance v0, LN7/e;

    .line 715
    .line 716
    const/4 v2, 0x3

    .line 717
    invoke-direct {v0, v2}, LN7/e;-><init>(I)V

    .line 718
    .line 719
    .line 720
    goto :goto_b

    .line 721
    :pswitch_f
    new-instance v2, Li6/c;

    .line 722
    .line 723
    invoke-direct {v2, v3, v0}, Li6/c;-><init>(Ljava/lang/String;I)V

    .line 724
    .line 725
    .line 726
    move-object v0, v2

    .line 727
    goto :goto_b

    .line 728
    :pswitch_10
    new-instance v0, Lm6/a;

    .line 729
    .line 730
    invoke-direct {v0, v2}, Lm6/a;-><init>(Ljava/util/List;)V

    .line 731
    .line 732
    .line 733
    goto :goto_b

    .line 734
    :pswitch_11
    new-instance v0, Lp6/a;

    .line 735
    .line 736
    invoke-direct {v0, v2}, Lp6/a;-><init>(Ljava/util/List;)V

    .line 737
    .line 738
    .line 739
    goto :goto_b

    .line 740
    :pswitch_12
    new-instance v0, Lq6/i;

    .line 741
    .line 742
    invoke-direct {v0}, Lq6/i;-><init>()V

    .line 743
    .line 744
    .line 745
    goto :goto_b

    .line 746
    :pswitch_13
    new-instance v0, Lj6/a;

    .line 747
    .line 748
    invoke-direct {v0}, Lj6/a;-><init>()V

    .line 749
    .line 750
    .line 751
    goto :goto_b

    .line 752
    :pswitch_14
    new-instance v0, Lk6/a;

    .line 753
    .line 754
    invoke-direct {v0}, Lk6/a;-><init>()V

    .line 755
    .line 756
    .line 757
    goto :goto_b

    .line 758
    :pswitch_15
    new-instance v0, Lj6/a;

    .line 759
    .line 760
    invoke-direct {v0, v2}, Lj6/a;-><init>(Ljava/util/List;)V

    .line 761
    .line 762
    .line 763
    :goto_b
    iput-object v0, v1, Lh6/k;->v:Lh6/g;

    .line 764
    .line 765
    move-object v3, v13

    .line 766
    :cond_20
    :goto_c
    move-wide/from16 v13, p1

    .line 767
    .line 768
    goto :goto_f

    .line 769
    :cond_21
    move-object/from16 v25, v14

    .line 770
    .line 771
    :goto_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 772
    .line 773
    move-object/from16 v14, v25

    .line 774
    .line 775
    invoke-static {v14, v3}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v2

    .line 779
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 780
    .line 781
    .line 782
    throw v0

    .line 783
    :cond_22
    move/from16 v24, v0

    .line 784
    .line 785
    invoke-virtual {v1}, Lh6/k;->B()V

    .line 786
    .line 787
    .line 788
    const/4 v2, 0x1

    .line 789
    iput-boolean v2, v1, Lh6/k;->r:Z

    .line 790
    .line 791
    :goto_e
    move-object v3, v13

    .line 792
    move-object/from16 v25, v14

    .line 793
    .line 794
    goto :goto_c

    .line 795
    :cond_23
    move/from16 v24, v0

    .line 796
    .line 797
    goto :goto_e

    .line 798
    :cond_24
    move/from16 v24, v0

    .line 799
    .line 800
    move-object v3, v13

    .line 801
    move-object/from16 v25, v14

    .line 802
    .line 803
    iget-wide v13, v2, Lh6/d;->c:J

    .line 804
    .line 805
    cmp-long v0, v13, p1

    .line 806
    .line 807
    if-gtz v0, :cond_20

    .line 808
    .line 809
    iget-object v0, v1, Lh6/k;->x:Lh6/d;

    .line 810
    .line 811
    if-eqz v0, :cond_25

    .line 812
    .line 813
    invoke-virtual {v0}, Lh6/d;->o()V

    .line 814
    .line 815
    .line 816
    :cond_25
    move-wide/from16 v13, p1

    .line 817
    .line 818
    invoke-virtual {v2, v13, v14}, Lh6/d;->a(J)I

    .line 819
    .line 820
    .line 821
    move-result v0

    .line 822
    iput v0, v1, Lh6/k;->z:I

    .line 823
    .line 824
    iput-object v2, v1, Lh6/k;->x:Lh6/d;

    .line 825
    .line 826
    const/4 v2, 0x0

    .line 827
    iput-object v2, v1, Lh6/k;->y:Lh6/d;

    .line 828
    .line 829
    const/16 v24, 0x1

    .line 830
    .line 831
    :goto_f
    if-eqz v24, :cond_29

    .line 832
    .line 833
    iget-object v0, v1, Lh6/k;->x:Lh6/d;

    .line 834
    .line 835
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 836
    .line 837
    .line 838
    iget-object v0, v1, Lh6/k;->x:Lh6/d;

    .line 839
    .line 840
    invoke-virtual {v0, v13, v14}, Lh6/d;->a(J)I

    .line 841
    .line 842
    .line 843
    move-result v0

    .line 844
    if-nez v0, :cond_26

    .line 845
    .line 846
    iget-object v0, v1, Lh6/k;->x:Lh6/d;

    .line 847
    .line 848
    move-object/from16 v24, v3

    .line 849
    .line 850
    iget-wide v2, v0, Lh6/d;->c:J

    .line 851
    .line 852
    goto :goto_11

    .line 853
    :cond_26
    move-object/from16 v24, v3

    .line 854
    .line 855
    const/4 v2, -0x1

    .line 856
    if-ne v0, v2, :cond_27

    .line 857
    .line 858
    iget-object v0, v1, Lh6/k;->x:Lh6/d;

    .line 859
    .line 860
    invoke-virtual {v0}, Lh6/d;->p()I

    .line 861
    .line 862
    .line 863
    move-result v3

    .line 864
    const/16 v17, 0x1

    .line 865
    .line 866
    add-int/lit8 v3, v3, -0x1

    .line 867
    .line 868
    invoke-virtual {v0, v3}, Lh6/d;->k(I)J

    .line 869
    .line 870
    .line 871
    move-result-wide v26

    .line 872
    :goto_10
    move-wide/from16 v2, v26

    .line 873
    .line 874
    goto :goto_11

    .line 875
    :cond_27
    const/16 v17, 0x1

    .line 876
    .line 877
    iget-object v3, v1, Lh6/k;->x:Lh6/d;

    .line 878
    .line 879
    add-int/lit8 v0, v0, -0x1

    .line 880
    .line 881
    invoke-virtual {v3, v0}, Lh6/d;->k(I)J

    .line 882
    .line 883
    .line 884
    move-result-wide v26

    .line 885
    goto :goto_10

    .line 886
    :goto_11
    invoke-virtual {v1, v2, v3}, Lh6/k;->z(J)J

    .line 887
    .line 888
    .line 889
    move-result-wide v2

    .line 890
    new-instance v0, Lh6/c;

    .line 891
    .line 892
    move-object/from16 v26, v11

    .line 893
    .line 894
    iget-object v11, v1, Lh6/k;->x:Lh6/d;

    .line 895
    .line 896
    invoke-virtual {v11, v13, v14}, Lh6/d;->g(J)Ljava/util/List;

    .line 897
    .line 898
    .line 899
    move-result-object v11

    .line 900
    invoke-direct {v0, v11, v2, v3}, Lh6/c;-><init>(Ljava/util/List;J)V

    .line 901
    .line 902
    .line 903
    if-eqz v21, :cond_28

    .line 904
    .line 905
    move-object/from16 v2, v21

    .line 906
    .line 907
    const/4 v3, 0x0

    .line 908
    invoke-virtual {v2, v3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 909
    .line 910
    .line 911
    move-result-object v0

    .line 912
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 913
    .line 914
    .line 915
    goto :goto_12

    .line 916
    :cond_28
    move-object/from16 v2, v21

    .line 917
    .line 918
    invoke-virtual {v1, v0}, Lh6/k;->A(Lh6/c;)V

    .line 919
    .line 920
    .line 921
    goto :goto_12

    .line 922
    :cond_29
    move-object/from16 v24, v3

    .line 923
    .line 924
    move-object/from16 v26, v11

    .line 925
    .line 926
    move-object/from16 v2, v21

    .line 927
    .line 928
    :goto_12
    iget v0, v1, Lh6/k;->t:I

    .line 929
    .line 930
    const/4 v3, 0x2

    .line 931
    if-ne v0, v3, :cond_2a

    .line 932
    .line 933
    goto/16 :goto_1e

    .line 934
    .line 935
    :cond_2a
    :goto_13
    :try_start_1
    iget-boolean v0, v1, Lh6/k;->q:Z

    .line 936
    .line 937
    if-nez v0, :cond_3f

    .line 938
    .line 939
    iget-object v0, v1, Lh6/k;->w:Lh6/j;

    .line 940
    .line 941
    if-nez v0, :cond_2c

    .line 942
    .line 943
    iget-object v0, v1, Lh6/k;->v:Lh6/g;

    .line 944
    .line 945
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 946
    .line 947
    .line 948
    invoke-interface {v0}, LH5/d;->c()Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v0

    .line 952
    check-cast v0, Lh6/j;

    .line 953
    .line 954
    if-nez v0, :cond_2b

    .line 955
    .line 956
    goto/16 :goto_1e

    .line 957
    .line 958
    :cond_2b
    iput-object v0, v1, Lh6/k;->w:Lh6/j;

    .line 959
    .line 960
    goto :goto_15

    .line 961
    :catch_1
    move-exception v0

    .line 962
    :goto_14
    const/4 v3, 0x4

    .line 963
    goto/16 :goto_18

    .line 964
    .line 965
    :cond_2c
    :goto_15
    iget v3, v1, Lh6/k;->t:I
    :try_end_1
    .catch Lh6/h; {:try_start_1 .. :try_end_1} :catch_1

    .line 966
    .line 967
    const/4 v13, 0x1

    .line 968
    if-ne v3, v13, :cond_2d

    .line 969
    .line 970
    const/4 v3, 0x4

    .line 971
    :try_start_2
    iput v3, v0, LH5/a;->b:I

    .line 972
    .line 973
    iget-object v3, v1, Lh6/k;->v:Lh6/g;

    .line 974
    .line 975
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 976
    .line 977
    .line 978
    invoke-interface {v3, v0}, LH5/d;->d(Lh6/j;)V

    .line 979
    .line 980
    .line 981
    const/4 v3, 0x0

    .line 982
    iput-object v3, v1, Lh6/k;->w:Lh6/j;
    :try_end_2
    .catch Lh6/h; {:try_start_2 .. :try_end_2} :catch_2

    .line 983
    .line 984
    const/4 v3, 0x2

    .line 985
    :try_start_3
    iput v3, v1, Lh6/k;->t:I

    .line 986
    .line 987
    return-void

    .line 988
    :catch_2
    move-exception v0

    .line 989
    const/4 v3, 0x2

    .line 990
    goto :goto_14

    .line 991
    :cond_2d
    move-object/from16 v11, v23

    .line 992
    .line 993
    const/4 v3, 0x2

    .line 994
    const/4 v13, 0x0

    .line 995
    invoke-virtual {v1, v11, v0, v13}, LE5/f;->r(LS3/s;LH5/h;I)I

    .line 996
    .line 997
    .line 998
    move-result v14
    :try_end_3
    .catch Lh6/h; {:try_start_3 .. :try_end_3} :catch_1

    .line 999
    const/4 v3, -0x4

    .line 1000
    if-ne v14, v3, :cond_30

    .line 1001
    .line 1002
    const/4 v3, 0x4

    .line 1003
    :try_start_4
    invoke-virtual {v0, v3}, LH5/a;->h(I)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v14

    .line 1007
    if-eqz v14, :cond_2e

    .line 1008
    .line 1009
    const/4 v14, 0x1

    .line 1010
    iput-boolean v14, v1, Lh6/k;->q:Z

    .line 1011
    .line 1012
    iput-boolean v13, v1, Lh6/k;->s:Z

    .line 1013
    .line 1014
    goto :goto_16

    .line 1015
    :catch_3
    move-exception v0

    .line 1016
    goto :goto_18

    .line 1017
    :cond_2e
    iget-object v13, v11, LS3/s;->c:Ljava/lang/Object;

    .line 1018
    .line 1019
    check-cast v13, LE5/T;

    .line 1020
    .line 1021
    if-nez v13, :cond_2f

    .line 1022
    .line 1023
    goto/16 :goto_1e

    .line 1024
    .line 1025
    :cond_2f
    iget-wide v13, v13, LE5/T;->p:J

    .line 1026
    .line 1027
    iput-wide v13, v0, Lh6/j;->i:J

    .line 1028
    .line 1029
    invoke-virtual {v0}, LH5/h;->s()V

    .line 1030
    .line 1031
    .line 1032
    iget-boolean v13, v1, Lh6/k;->s:Z

    .line 1033
    .line 1034
    const/4 v14, 0x1

    .line 1035
    invoke-virtual {v0, v14}, LH5/a;->h(I)Z

    .line 1036
    .line 1037
    .line 1038
    move-result v16

    .line 1039
    xor-int/lit8 v16, v16, 0x1

    .line 1040
    .line 1041
    and-int v13, v13, v16

    .line 1042
    .line 1043
    iput-boolean v13, v1, Lh6/k;->s:Z

    .line 1044
    .line 1045
    :goto_16
    iget-boolean v13, v1, Lh6/k;->s:Z

    .line 1046
    .line 1047
    if-nez v13, :cond_31

    .line 1048
    .line 1049
    iget-object v13, v1, Lh6/k;->v:Lh6/g;

    .line 1050
    .line 1051
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1052
    .line 1053
    .line 1054
    invoke-interface {v13, v0}, LH5/d;->d(Lh6/j;)V

    .line 1055
    .line 1056
    .line 1057
    const/4 v13, 0x0

    .line 1058
    iput-object v13, v1, Lh6/k;->w:Lh6/j;
    :try_end_4
    .catch Lh6/h; {:try_start_4 .. :try_end_4} :catch_3

    .line 1059
    .line 1060
    goto :goto_17

    .line 1061
    :cond_30
    const/4 v3, 0x4

    .line 1062
    const/4 v0, -0x3

    .line 1063
    if-ne v14, v0, :cond_31

    .line 1064
    .line 1065
    goto/16 :goto_1e

    .line 1066
    .line 1067
    :cond_31
    :goto_17
    move-object/from16 v23, v11

    .line 1068
    .line 1069
    goto/16 :goto_13

    .line 1070
    .line 1071
    :goto_18
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1072
    .line 1073
    move-object/from16 v13, v20

    .line 1074
    .line 1075
    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1076
    .line 1077
    .line 1078
    iget-object v13, v1, Lh6/k;->u:LE5/T;

    .line 1079
    .line 1080
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v11

    .line 1087
    move-object/from16 v13, v18

    .line 1088
    .line 1089
    invoke-static {v13, v11, v0}, Lu6/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1090
    .line 1091
    .line 1092
    new-instance v0, Lh6/c;

    .line 1093
    .line 1094
    sget-object v11, Ll8/e0;->e:Ll8/e0;

    .line 1095
    .line 1096
    iget-wide v13, v1, Lh6/k;->C:J

    .line 1097
    .line 1098
    invoke-virtual {v1, v13, v14}, Lh6/k;->z(J)J

    .line 1099
    .line 1100
    .line 1101
    move-result-wide v13

    .line 1102
    invoke-direct {v0, v11, v13, v14}, Lh6/c;-><init>(Ljava/util/List;J)V

    .line 1103
    .line 1104
    .line 1105
    if-eqz v2, :cond_32

    .line 1106
    .line 1107
    const/4 v13, 0x0

    .line 1108
    invoke-virtual {v2, v13, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0

    .line 1112
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 1113
    .line 1114
    .line 1115
    goto :goto_19

    .line 1116
    :cond_32
    invoke-virtual {v1, v0}, Lh6/k;->A(Lh6/c;)V

    .line 1117
    .line 1118
    .line 1119
    :goto_19
    invoke-virtual {v1}, Lh6/k;->B()V

    .line 1120
    .line 1121
    .line 1122
    iget-object v0, v1, Lh6/k;->v:Lh6/g;

    .line 1123
    .line 1124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1125
    .line 1126
    .line 1127
    invoke-interface {v0}, LH5/d;->release()V

    .line 1128
    .line 1129
    .line 1130
    const/4 v2, 0x0

    .line 1131
    iput-object v2, v1, Lh6/k;->v:Lh6/g;

    .line 1132
    .line 1133
    const/4 v2, 0x0

    .line 1134
    iput v2, v1, Lh6/k;->t:I

    .line 1135
    .line 1136
    const/4 v13, 0x1

    .line 1137
    iput-boolean v13, v1, Lh6/k;->s:Z

    .line 1138
    .line 1139
    iget-object v0, v1, Lh6/k;->u:LE5/T;

    .line 1140
    .line 1141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1145
    .line 1146
    .line 1147
    iget-object v11, v0, LE5/T;->l:Ljava/lang/String;

    .line 1148
    .line 1149
    if-eqz v11, :cond_40

    .line 1150
    .line 1151
    iget v14, v0, LE5/T;->D:I

    .line 1152
    .line 1153
    iget-object v0, v0, LE5/T;->n:Ljava/util/List;

    .line 1154
    .line 1155
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 1156
    .line 1157
    .line 1158
    move-result v16

    .line 1159
    sparse-switch v16, :sswitch_data_2

    .line 1160
    .line 1161
    .line 1162
    :goto_1a
    const/4 v5, -0x1

    .line 1163
    goto/16 :goto_1b

    .line 1164
    .line 1165
    :sswitch_18
    const-string v2, "application/ttml+xml"

    .line 1166
    .line 1167
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1168
    .line 1169
    .line 1170
    move-result v2

    .line 1171
    if-nez v2, :cond_33

    .line 1172
    .line 1173
    goto :goto_1a

    .line 1174
    :cond_33
    const/16 v5, 0xb

    .line 1175
    .line 1176
    goto/16 :goto_1b

    .line 1177
    .line 1178
    :sswitch_19
    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1179
    .line 1180
    .line 1181
    move-result v2

    .line 1182
    if-nez v2, :cond_34

    .line 1183
    .line 1184
    goto :goto_1a

    .line 1185
    :cond_34
    const/16 v5, 0xa

    .line 1186
    .line 1187
    goto/16 :goto_1b

    .line 1188
    .line 1189
    :sswitch_1a
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1190
    .line 1191
    .line 1192
    move-result v2

    .line 1193
    if-nez v2, :cond_35

    .line 1194
    .line 1195
    goto :goto_1a

    .line 1196
    :cond_35
    const/16 v5, 0x9

    .line 1197
    .line 1198
    goto/16 :goto_1b

    .line 1199
    .line 1200
    :sswitch_1b
    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1201
    .line 1202
    .line 1203
    move-result v2

    .line 1204
    if-nez v2, :cond_36

    .line 1205
    .line 1206
    goto :goto_1a

    .line 1207
    :cond_36
    const/16 v5, 0x8

    .line 1208
    .line 1209
    goto :goto_1b

    .line 1210
    :sswitch_1c
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1211
    .line 1212
    .line 1213
    move-result v2

    .line 1214
    if-nez v2, :cond_37

    .line 1215
    .line 1216
    goto :goto_1a

    .line 1217
    :cond_37
    const/4 v5, 0x7

    .line 1218
    goto :goto_1b

    .line 1219
    :sswitch_1d
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1220
    .line 1221
    .line 1222
    move-result v2

    .line 1223
    if-nez v2, :cond_38

    .line 1224
    .line 1225
    goto :goto_1a

    .line 1226
    :cond_38
    const/4 v5, 0x6

    .line 1227
    goto :goto_1b

    .line 1228
    :sswitch_1e
    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1229
    .line 1230
    .line 1231
    move-result v2

    .line 1232
    if-nez v2, :cond_39

    .line 1233
    .line 1234
    goto :goto_1a

    .line 1235
    :cond_39
    const/4 v5, 0x5

    .line 1236
    goto :goto_1b

    .line 1237
    :sswitch_1f
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1238
    .line 1239
    .line 1240
    move-result v2

    .line 1241
    if-nez v2, :cond_3a

    .line 1242
    .line 1243
    goto :goto_1a

    .line 1244
    :cond_3a
    move v5, v3

    .line 1245
    goto :goto_1b

    .line 1246
    :sswitch_20
    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1247
    .line 1248
    .line 1249
    move-result v2

    .line 1250
    if-nez v2, :cond_3b

    .line 1251
    .line 1252
    goto :goto_1a

    .line 1253
    :cond_3b
    const/4 v5, 0x3

    .line 1254
    goto :goto_1b

    .line 1255
    :sswitch_21
    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1256
    .line 1257
    .line 1258
    move-result v2

    .line 1259
    if-nez v2, :cond_3c

    .line 1260
    .line 1261
    goto :goto_1a

    .line 1262
    :cond_3c
    const/4 v5, 0x2

    .line 1263
    goto :goto_1b

    .line 1264
    :sswitch_22
    move-object/from16 v4, v26

    .line 1265
    .line 1266
    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1267
    .line 1268
    .line 1269
    move-result v2

    .line 1270
    if-nez v2, :cond_3d

    .line 1271
    .line 1272
    goto :goto_1a

    .line 1273
    :cond_3d
    move v5, v13

    .line 1274
    goto :goto_1b

    .line 1275
    :sswitch_23
    move-object/from16 v13, v24

    .line 1276
    .line 1277
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1278
    .line 1279
    .line 1280
    move-result v3

    .line 1281
    if-nez v3, :cond_3e

    .line 1282
    .line 1283
    goto :goto_1a

    .line 1284
    :cond_3e
    move v5, v2

    .line 1285
    :goto_1b
    packed-switch v5, :pswitch_data_2

    .line 1286
    .line 1287
    .line 1288
    goto :goto_1f

    .line 1289
    :pswitch_16
    new-instance v0, Lo6/c;

    .line 1290
    .line 1291
    invoke-direct {v0}, Lo6/c;-><init>()V

    .line 1292
    .line 1293
    .line 1294
    goto :goto_1d

    .line 1295
    :pswitch_17
    new-instance v0, Ln6/a;

    .line 1296
    .line 1297
    invoke-direct {v0}, Ln6/a;-><init>()V

    .line 1298
    .line 1299
    .line 1300
    goto :goto_1d

    .line 1301
    :pswitch_18
    new-instance v2, Li6/f;

    .line 1302
    .line 1303
    invoke-direct {v2, v14, v0}, Li6/f;-><init>(ILjava/util/List;)V

    .line 1304
    .line 1305
    .line 1306
    :goto_1c
    move-object v0, v2

    .line 1307
    goto :goto_1d

    .line 1308
    :pswitch_19
    new-instance v0, LN7/e;

    .line 1309
    .line 1310
    const/4 v2, 0x3

    .line 1311
    invoke-direct {v0, v2}, LN7/e;-><init>(I)V

    .line 1312
    .line 1313
    .line 1314
    goto :goto_1d

    .line 1315
    :pswitch_1a
    new-instance v0, Li6/c;

    .line 1316
    .line 1317
    invoke-direct {v0, v11, v14}, Li6/c;-><init>(Ljava/lang/String;I)V

    .line 1318
    .line 1319
    .line 1320
    goto :goto_1d

    .line 1321
    :pswitch_1b
    new-instance v2, Lm6/a;

    .line 1322
    .line 1323
    invoke-direct {v2, v0}, Lm6/a;-><init>(Ljava/util/List;)V

    .line 1324
    .line 1325
    .line 1326
    goto :goto_1c

    .line 1327
    :pswitch_1c
    new-instance v2, Lp6/a;

    .line 1328
    .line 1329
    invoke-direct {v2, v0}, Lp6/a;-><init>(Ljava/util/List;)V

    .line 1330
    .line 1331
    .line 1332
    goto :goto_1c

    .line 1333
    :pswitch_1d
    new-instance v0, Lq6/i;

    .line 1334
    .line 1335
    invoke-direct {v0}, Lq6/i;-><init>()V

    .line 1336
    .line 1337
    .line 1338
    goto :goto_1d

    .line 1339
    :pswitch_1e
    new-instance v0, Lj6/a;

    .line 1340
    .line 1341
    invoke-direct {v0}, Lj6/a;-><init>()V

    .line 1342
    .line 1343
    .line 1344
    goto :goto_1d

    .line 1345
    :pswitch_1f
    new-instance v0, Lk6/a;

    .line 1346
    .line 1347
    invoke-direct {v0}, Lk6/a;-><init>()V

    .line 1348
    .line 1349
    .line 1350
    goto :goto_1d

    .line 1351
    :pswitch_20
    new-instance v2, Lj6/a;

    .line 1352
    .line 1353
    invoke-direct {v2, v0}, Lj6/a;-><init>(Ljava/util/List;)V

    .line 1354
    .line 1355
    .line 1356
    goto :goto_1c

    .line 1357
    :goto_1d
    iput-object v0, v1, Lh6/k;->v:Lh6/g;

    .line 1358
    .line 1359
    :cond_3f
    :goto_1e
    return-void

    .line 1360
    :cond_40
    :goto_1f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1361
    .line 1362
    move-object/from16 v14, v25

    .line 1363
    .line 1364
    invoke-static {v14, v11}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v2

    .line 1368
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1369
    .line 1370
    .line 1371
    throw v0

    .line 1372
    nop

    .line 1373
    :sswitch_data_0
    .sparse-switch
        -0x5091057c -> :sswitch_b
        -0x4a6813e3 -> :sswitch_a
        -0x3d28a9ba -> :sswitch_9
        -0x3be2f26c -> :sswitch_8
        0x2935f49f -> :sswitch_7
        0x310bebca -> :sswitch_6
        0x37713300 -> :sswitch_5
        0x47a1c707 -> :sswitch_4
        0x5d578071 -> :sswitch_3
        0x5d578432 -> :sswitch_2
        0x63771bad -> :sswitch_1
        0x64f8068a -> :sswitch_0
    .end sparse-switch

    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    :sswitch_data_1
    .sparse-switch
        -0x5091057c -> :sswitch_17
        -0x4a6813e3 -> :sswitch_16
        -0x3d28a9ba -> :sswitch_15
        -0x3be2f26c -> :sswitch_14
        0x2935f49f -> :sswitch_13
        0x310bebca -> :sswitch_12
        0x37713300 -> :sswitch_11
        0x47a1c707 -> :sswitch_10
        0x5d578071 -> :sswitch_f
        0x5d578432 -> :sswitch_e
        0x63771bad -> :sswitch_d
        0x64f8068a -> :sswitch_c
    .end sparse-switch

    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_f
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch

    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    :sswitch_data_2
    .sparse-switch
        -0x5091057c -> :sswitch_23
        -0x4a6813e3 -> :sswitch_22
        -0x3d28a9ba -> :sswitch_21
        -0x3be2f26c -> :sswitch_20
        0x2935f49f -> :sswitch_1f
        0x310bebca -> :sswitch_1e
        0x37713300 -> :sswitch_1d
        0x47a1c707 -> :sswitch_1c
        0x5d578071 -> :sswitch_1b
        0x5d578432 -> :sswitch_1a
        0x63771bad -> :sswitch_19
        0x64f8068a -> :sswitch_18
    .end sparse-switch

    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_1a
        :pswitch_18
        :pswitch_17
        :pswitch_16
    .end packed-switch
.end method

.method public final w(LE5/T;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lh6/k;->o:Lh6/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LE5/T;->l:Ljava/lang/String;

    .line 7
    .line 8
    const-string v1, "text/vtt"

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    const-string v1, "text/x-ssa"

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    const-string v1, "application/ttml+xml"

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    const-string v1, "application/x-mp4-vtt"

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    const-string v1, "application/x-subrip"

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    const-string v1, "application/x-quicktime-tx3g"

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    const-string v1, "application/cea-608"

    .line 59
    .line 60
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_1

    .line 65
    .line 66
    const-string v1, "application/x-mp4-cea-608"

    .line 67
    .line 68
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_1

    .line 73
    .line 74
    const-string v1, "application/cea-708"

    .line 75
    .line 76
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_1

    .line 81
    .line 82
    const-string v1, "application/dvbsubs"

    .line 83
    .line 84
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-nez v1, :cond_1

    .line 89
    .line 90
    const-string v1, "application/pgs"

    .line 91
    .line 92
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-nez v1, :cond_1

    .line 97
    .line 98
    const-string v1, "text/x-exoplayer-cues"

    .line 99
    .line 100
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_0

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_0
    move v0, v3

    .line 108
    goto :goto_1

    .line 109
    :cond_1
    :goto_0
    move v0, v2

    .line 110
    :goto_1
    if-eqz v0, :cond_3

    .line 111
    .line 112
    iget p1, p1, LE5/T;->E:I

    .line 113
    .line 114
    if-nez p1, :cond_2

    .line 115
    .line 116
    const/4 p1, 0x4

    .line 117
    goto :goto_2

    .line 118
    :cond_2
    const/4 p1, 0x2

    .line 119
    :goto_2
    invoke-static {p1, v3, v3}, LA7/p0;->e(III)I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    return p1

    .line 124
    :cond_3
    iget-object p1, p1, LE5/T;->l:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {p1}, Lu6/k;->h(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_4

    .line 131
    .line 132
    invoke-static {v2, v3, v3}, LA7/p0;->e(III)I

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    return p1

    .line 137
    :cond_4
    invoke-static {v3, v3, v3}, LA7/p0;->e(III)I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    return p1
.end method

.method public final y()J
    .locals 4

    .line 1
    iget v0, p0, Lh6/k;->z:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-wide v2, 0x7fffffffffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    return-wide v2

    .line 12
    :cond_0
    iget-object v0, p0, Lh6/k;->x:Lh6/d;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget v0, p0, Lh6/k;->z:I

    .line 18
    .line 19
    iget-object v1, p0, Lh6/k;->x:Lh6/d;

    .line 20
    .line 21
    invoke-virtual {v1}, Lh6/d;->p()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lt v0, v1, :cond_1

    .line 26
    .line 27
    return-wide v2

    .line 28
    :cond_1
    iget-object v0, p0, Lh6/k;->x:Lh6/d;

    .line 29
    .line 30
    iget v1, p0, Lh6/k;->z:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lh6/d;->k(I)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    return-wide v0
.end method

.method public final z(J)J
    .locals 7

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v2, p1, v0

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    move v2, v4

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v3

    .line 15
    :goto_0
    invoke-static {v2}, Lu6/a;->i(Z)V

    .line 16
    .line 17
    .line 18
    iget-wide v5, p0, Lh6/k;->B:J

    .line 19
    .line 20
    cmp-long v0, v5, v0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    move v3, v4

    .line 25
    :cond_1
    invoke-static {v3}, Lu6/a;->i(Z)V

    .line 26
    .line 27
    .line 28
    iget-wide v0, p0, Lh6/k;->B:J

    .line 29
    .line 30
    sub-long/2addr p1, v0

    .line 31
    return-wide p1
.end method
