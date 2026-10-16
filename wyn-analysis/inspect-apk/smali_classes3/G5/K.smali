.class public final LG5/K;
.super LV5/q;
.source "SourceFile"

# interfaces
.implements Lu6/j;


# instance fields
.field public final E0:Landroid/content/Context;

.field public final F0:LG5/p;

.field public final G0:LG5/G;

.field public H0:I

.field public I0:Z

.field public J0:LE5/T;

.field public K0:J

.field public L0:Z

.field public M0:Z

.field public N0:Z

.field public O0:LE5/K;


# direct methods
.method public constructor <init>(Landroid/content/Context;LV5/j;Landroid/os/Handler;LE5/F;LG5/G;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const v1, 0x472c4400    # 44100.0f

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0, p2, v1}, LV5/q;-><init>(ILV5/j;F)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, LG5/K;->E0:Landroid/content/Context;

    .line 13
    .line 14
    iput-object p5, p0, LG5/K;->G0:LG5/G;

    .line 15
    .line 16
    new-instance p1, LG5/p;

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    invoke-direct {p1, p3, p4, p2}, LG5/p;-><init>(Landroid/os/Handler;LE5/F;I)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, LG5/K;->F0:LG5/p;

    .line 23
    .line 24
    new-instance p1, Ly3/j;

    .line 25
    .line 26
    const/16 p2, 0x8

    .line 27
    .line 28
    invoke-direct {p1, p0, p2}, Ly3/j;-><init>(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p5, LG5/G;->r:Ly3/j;

    .line 32
    .line 33
    return-void
.end method

.method public static q0(LV5/r;LE5/T;ZLG5/G;)Ll8/K;
    .locals 3

    .line 1
    iget-object v0, p1, LE5/T;->l:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Ll8/K;->b:Ll8/I;

    .line 6
    .line 7
    sget-object p0, Ll8/e0;->e:Ll8/e0;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p3, p1}, LG5/G;->f(LE5/T;)I

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz p3, :cond_2

    .line 16
    .line 17
    const-string p3, "audio/raw"

    .line 18
    .line 19
    invoke-static {p3, v1, v1}, LV5/y;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    const/4 p3, 0x0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    check-cast p3, LV5/n;

    .line 36
    .line 37
    :goto_0
    if-eqz p3, :cond_2

    .line 38
    .line 39
    invoke-static {p3}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v0, p2, v1}, LV5/y;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p1}, LV5/y;->b(LE5/T;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-nez p1, :cond_3

    .line 56
    .line 57
    invoke-static {p0}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :cond_3
    invoke-static {p1, p2, v1}, LV5/y;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2, p0}, Ll8/E;->d(Ljava/lang/Iterable;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, p1}, Ll8/E;->d(Ljava/lang/Iterable;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2}, Ll8/H;->g()Ll8/e0;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method


# virtual methods
.method public final J(F[LE5/T;)F
    .locals 5

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, -0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    move v3, v1

    .line 5
    :goto_0
    if-ge v2, v0, :cond_1

    .line 6
    .line 7
    aget-object v4, p2, v2

    .line 8
    .line 9
    iget v4, v4, LE5/T;->z:I

    .line 10
    .line 11
    if-eq v4, v1, :cond_0

    .line 12
    .line 13
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    if-ne v3, v1, :cond_2

    .line 21
    .line 22
    const/high16 p1, -0x40800000    # -1.0f

    .line 23
    .line 24
    return p1

    .line 25
    :cond_2
    int-to-float p2, v3

    .line 26
    mul-float/2addr p2, p1

    .line 27
    return p2
.end method

.method public final K(LV5/r;LE5/T;Z)Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, LG5/K;->G0:LG5/G;

    .line 2
    .line 3
    invoke-static {p1, p2, p3, v0}, LG5/K;->q0(LV5/r;LE5/T;ZLG5/G;)Ll8/K;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object p3, LV5/y;->a:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    new-instance p3, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, LS8/b;

    .line 15
    .line 16
    const/16 v0, 0xa

    .line 17
    .line 18
    invoke-direct {p1, p2, v0}, LS8/b;-><init>(Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    new-instance p2, LV5/s;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-direct {p2, p1, v0}, LV5/s;-><init>(Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    invoke-static {p3, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 28
    .line 29
    .line 30
    return-object p3
.end method

.method public final M(LV5/n;LE5/T;Landroid/media/MediaCrypto;F)LV5/i;
    .locals 11

    .line 1
    iget-object v0, p0, LE5/f;->h:[LE5/T;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, LG5/K;->p0(LV5/n;LE5/T;)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    array-length v2, v0

    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    if-ne v2, v3, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    array-length v2, v0

    .line 17
    move v5, v4

    .line 18
    :goto_0
    if-ge v5, v2, :cond_2

    .line 19
    .line 20
    aget-object v6, v0, v5

    .line 21
    .line 22
    invoke-virtual {p1, p2, v6}, LV5/n;->b(LE5/T;LE5/T;)LH5/i;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    iget v7, v7, LH5/i;->d:I

    .line 27
    .line 28
    if-eqz v7, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, p1, v6}, LG5/K;->p0(LV5/n;LE5/T;)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-static {v1, v6}, Ljava/lang/Math;->max(II)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :goto_1
    iput v1, p0, LG5/K;->H0:I

    .line 42
    .line 43
    sget v0, Lu6/v;->a:I

    .line 44
    .line 45
    const/16 v1, 0x18

    .line 46
    .line 47
    if-ge v0, v1, :cond_4

    .line 48
    .line 49
    const-string v2, "OMX.SEC.aac.dec"

    .line 50
    .line 51
    iget-object v5, p1, LV5/n;->a:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_4

    .line 58
    .line 59
    const-string v2, "samsung"

    .line 60
    .line 61
    sget-object v5, Lu6/v;->c:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    sget-object v2, Lu6/v;->b:Ljava/lang/String;

    .line 70
    .line 71
    const-string v5, "zeroflte"

    .line 72
    .line 73
    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-nez v5, :cond_3

    .line 78
    .line 79
    const-string v5, "herolte"

    .line 80
    .line 81
    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-nez v5, :cond_3

    .line 86
    .line 87
    const-string v5, "heroqlte"

    .line 88
    .line 89
    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_4

    .line 94
    .line 95
    :cond_3
    move v2, v3

    .line 96
    goto :goto_2

    .line 97
    :cond_4
    move v2, v4

    .line 98
    :goto_2
    iput-boolean v2, p0, LG5/K;->I0:Z

    .line 99
    .line 100
    iget v2, p0, LG5/K;->H0:I

    .line 101
    .line 102
    new-instance v7, Landroid/media/MediaFormat;

    .line 103
    .line 104
    invoke-direct {v7}, Landroid/media/MediaFormat;-><init>()V

    .line 105
    .line 106
    .line 107
    iget-object v5, p1, LV5/n;->c:Ljava/lang/String;

    .line 108
    .line 109
    const-string v6, "mime"

    .line 110
    .line 111
    invoke-virtual {v7, v6, v5}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    iget v5, p2, LE5/T;->y:I

    .line 115
    .line 116
    const-string v6, "channel-count"

    .line 117
    .line 118
    invoke-virtual {v7, v6, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 119
    .line 120
    .line 121
    const-string v5, "sample-rate"

    .line 122
    .line 123
    iget v6, p2, LE5/T;->z:I

    .line 124
    .line 125
    invoke-virtual {v7, v5, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 126
    .line 127
    .line 128
    iget-object v5, p2, LE5/T;->n:Ljava/util/List;

    .line 129
    .line 130
    invoke-static {v7, v5}, Lu6/a;->B(Landroid/media/MediaFormat;Ljava/util/List;)V

    .line 131
    .line 132
    .line 133
    const-string v5, "max-input-size"

    .line 134
    .line 135
    invoke-static {v7, v5, v2}, Lu6/a;->y(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 136
    .line 137
    .line 138
    const/16 v2, 0x17

    .line 139
    .line 140
    if-lt v0, v2, :cond_6

    .line 141
    .line 142
    const-string v5, "priority"

    .line 143
    .line 144
    invoke-virtual {v7, v5, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 145
    .line 146
    .line 147
    const/high16 v4, -0x40800000    # -1.0f

    .line 148
    .line 149
    cmpl-float v4, p4, v4

    .line 150
    .line 151
    if-eqz v4, :cond_6

    .line 152
    .line 153
    if-ne v0, v2, :cond_5

    .line 154
    .line 155
    sget-object v2, Lu6/v;->d:Ljava/lang/String;

    .line 156
    .line 157
    const-string v4, "ZTE B2017G"

    .line 158
    .line 159
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-nez v4, :cond_6

    .line 164
    .line 165
    const-string v4, "AXON 7 mini"

    .line 166
    .line 167
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_5

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_5
    const-string v2, "operating-rate"

    .line 175
    .line 176
    invoke-virtual {v7, v2, p4}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 177
    .line 178
    .line 179
    :cond_6
    :goto_3
    const/16 p4, 0x1c

    .line 180
    .line 181
    iget-object v2, p2, LE5/T;->l:Ljava/lang/String;

    .line 182
    .line 183
    if-gt v0, p4, :cond_7

    .line 184
    .line 185
    const-string p4, "audio/ac4"

    .line 186
    .line 187
    invoke-virtual {p4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result p4

    .line 191
    if-eqz p4, :cond_7

    .line 192
    .line 193
    const-string p4, "ac4-is-sync"

    .line 194
    .line 195
    invoke-virtual {v7, p4, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 196
    .line 197
    .line 198
    :cond_7
    const-string p4, "audio/raw"

    .line 199
    .line 200
    if-lt v0, v1, :cond_8

    .line 201
    .line 202
    new-instance v1, LE5/S;

    .line 203
    .line 204
    invoke-direct {v1}, LE5/S;-><init>()V

    .line 205
    .line 206
    .line 207
    iput-object p4, v1, LE5/S;->k:Ljava/lang/String;

    .line 208
    .line 209
    iget v3, p2, LE5/T;->y:I

    .line 210
    .line 211
    iput v3, v1, LE5/S;->x:I

    .line 212
    .line 213
    iput v6, v1, LE5/S;->y:I

    .line 214
    .line 215
    const/4 v3, 0x4

    .line 216
    iput v3, v1, LE5/S;->z:I

    .line 217
    .line 218
    new-instance v4, LE5/T;

    .line 219
    .line 220
    invoke-direct {v4, v1}, LE5/T;-><init>(LE5/S;)V

    .line 221
    .line 222
    .line 223
    iget-object v1, p0, LG5/K;->G0:LG5/G;

    .line 224
    .line 225
    invoke-virtual {v1, v4}, LG5/G;->f(LE5/T;)I

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    const/4 v4, 0x2

    .line 230
    if-ne v1, v4, :cond_8

    .line 231
    .line 232
    const-string v1, "pcm-encoding"

    .line 233
    .line 234
    invoke-virtual {v7, v1, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 235
    .line 236
    .line 237
    :cond_8
    const/16 v1, 0x20

    .line 238
    .line 239
    if-lt v0, v1, :cond_9

    .line 240
    .line 241
    const-string v0, "max-output-channel-count"

    .line 242
    .line 243
    const/16 v1, 0x63

    .line 244
    .line 245
    invoke-virtual {v7, v0, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 246
    .line 247
    .line 248
    :cond_9
    iget-object v0, p1, LV5/n;->b:Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_a

    .line 255
    .line 256
    invoke-virtual {p4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result p4

    .line 260
    if-nez p4, :cond_a

    .line 261
    .line 262
    move-object p4, p2

    .line 263
    goto :goto_4

    .line 264
    :cond_a
    const/4 p4, 0x0

    .line 265
    :goto_4
    iput-object p4, p0, LG5/K;->J0:LE5/T;

    .line 266
    .line 267
    new-instance v5, LV5/i;

    .line 268
    .line 269
    const/4 v9, 0x0

    .line 270
    move-object v6, p1

    .line 271
    move-object v8, p2

    .line 272
    move-object v10, p3

    .line 273
    invoke-direct/range {v5 .. v10}, LV5/i;-><init>(LV5/n;Landroid/media/MediaFormat;LE5/T;Landroid/view/Surface;Landroid/media/MediaCrypto;)V

    .line 274
    .line 275
    .line 276
    return-object v5
.end method

.method public final R(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    const-string v1, "Audio codec error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lu6/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LG5/K;->F0:LG5/p;

    .line 9
    .line 10
    iget-object v1, v0, LG5/p;->b:Landroid/os/Handler;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    new-instance v2, LG5/n;

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    invoke-direct {v2, v0, p1, v3}, LG5/n;-><init>(LG5/p;Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final S(JJLjava/lang/String;)V
    .locals 8

    .line 1
    iget-object v1, p0, LG5/K;->F0:LG5/p;

    .line 2
    .line 3
    iget-object v7, v1, LG5/p;->b:Landroid/os/Handler;

    .line 4
    .line 5
    if-eqz v7, :cond_0

    .line 6
    .line 7
    new-instance v0, LG5/n;

    .line 8
    .line 9
    move-wide v3, p1

    .line 10
    move-wide v5, p3

    .line 11
    move-object v2, p5

    .line 12
    invoke-direct/range {v0 .. v6}, LG5/n;-><init>(LG5/p;Ljava/lang/String;JJ)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final T(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, LG5/K;->F0:LG5/p;

    .line 2
    .line 3
    iget-object v1, v0, LG5/p;->b:Landroid/os/Handler;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    new-instance v2, LG5/n;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v2, v0, p1, v3}, LG5/n;-><init>(LG5/p;Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final U(LS3/s;)LH5/i;
    .locals 4

    .line 1
    invoke-super {p0, p1}, LV5/q;->U(LS3/s;)LH5/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p1, p1, LS3/s;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, LE5/T;

    .line 8
    .line 9
    iget-object v1, p0, LG5/K;->F0:LG5/p;

    .line 10
    .line 11
    iget-object v2, v1, LG5/p;->b:Landroid/os/Handler;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    new-instance v3, LG5/n;

    .line 16
    .line 17
    invoke-direct {v3, v1, p1, v0}, LG5/n;-><init>(LG5/p;LE5/T;LH5/i;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    return-object v0
.end method

.method public final V(LE5/T;Landroid/media/MediaFormat;)V
    .locals 5

    .line 1
    iget-object v0, p0, LG5/K;->J0:LE5/T;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move-object p1, v0

    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, LV5/q;->I:LV5/k;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto/16 :goto_2

    .line 15
    .line 16
    :cond_1
    iget-object v0, p1, LE5/T;->l:Ljava/lang/String;

    .line 17
    .line 18
    const-string v3, "audio/raw"

    .line 19
    .line 20
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    iget v0, p1, LE5/T;->A:I

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    sget v0, Lu6/v;->a:I

    .line 30
    .line 31
    const/16 v4, 0x18

    .line 32
    .line 33
    if-lt v0, v4, :cond_3

    .line 34
    .line 35
    const-string v0, "pcm-encoding"

    .line 36
    .line 37
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    const-string v0, "v-bits-per-sample"

    .line 49
    .line 50
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_4

    .line 55
    .line 56
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {v0}, Lu6/v;->o(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    goto :goto_0

    .line 65
    :cond_4
    const/4 v0, 0x2

    .line 66
    :goto_0
    new-instance v4, LE5/S;

    .line 67
    .line 68
    invoke-direct {v4}, LE5/S;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v3, v4, LE5/S;->k:Ljava/lang/String;

    .line 72
    .line 73
    iput v0, v4, LE5/S;->z:I

    .line 74
    .line 75
    iget v0, p1, LE5/T;->B:I

    .line 76
    .line 77
    iput v0, v4, LE5/S;->A:I

    .line 78
    .line 79
    iget v0, p1, LE5/T;->C:I

    .line 80
    .line 81
    iput v0, v4, LE5/S;->B:I

    .line 82
    .line 83
    const-string v0, "channel-count"

    .line 84
    .line 85
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    iput v0, v4, LE5/S;->x:I

    .line 90
    .line 91
    const-string v0, "sample-rate"

    .line 92
    .line 93
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    iput p2, v4, LE5/S;->y:I

    .line 98
    .line 99
    new-instance p2, LE5/T;

    .line 100
    .line 101
    invoke-direct {p2, v4}, LE5/T;-><init>(LE5/S;)V

    .line 102
    .line 103
    .line 104
    iget-boolean v0, p0, LG5/K;->I0:Z

    .line 105
    .line 106
    if-eqz v0, :cond_5

    .line 107
    .line 108
    iget v0, p2, LE5/T;->y:I

    .line 109
    .line 110
    const/4 v3, 0x6

    .line 111
    if-ne v0, v3, :cond_5

    .line 112
    .line 113
    iget p1, p1, LE5/T;->y:I

    .line 114
    .line 115
    if-ge p1, v3, :cond_5

    .line 116
    .line 117
    new-array v2, p1, [I

    .line 118
    .line 119
    move v0, v1

    .line 120
    :goto_1
    if-ge v0, p1, :cond_5

    .line 121
    .line 122
    aput v0, v2, v0

    .line 123
    .line 124
    add-int/lit8 v0, v0, 0x1

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_5
    move-object p1, p2

    .line 128
    :goto_2
    :try_start_0
    iget-object p2, p0, LG5/K;->G0:LG5/G;

    .line 129
    .line 130
    invoke-virtual {p2, p1, v2}, LG5/G;->b(LE5/T;[I)V
    :try_end_0
    .catch LG5/q; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :catch_0
    move-exception p1

    .line 135
    iget-object p2, p1, LG5/q;->a:LE5/T;

    .line 136
    .line 137
    const/16 v0, 0x1389

    .line 138
    .line 139
    invoke-virtual {p0, p1, p2, v1, v0}, LE5/f;->b(Ljava/lang/Exception;LE5/T;ZI)LE5/o;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    throw p1
.end method

.method public final W()V
    .locals 1

    .line 1
    iget-object v0, p0, LG5/K;->G0:LG5/G;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final Y()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, LG5/K;->G0:LG5/G;

    .line 3
    .line 4
    iput-boolean v0, v1, LG5/G;->G:Z

    .line 5
    .line 6
    return-void
.end method

.method public final Z(LH5/h;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, LG5/K;->L0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    invoke-virtual {p1, v0}, LH5/a;->h(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-wide v0, p1, LH5/h;->f:J

    .line 14
    .line 15
    iget-wide v2, p0, LG5/K;->K0:J

    .line 16
    .line 17
    sub-long/2addr v0, v2

    .line 18
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    const-wide/32 v2, 0x7a120

    .line 23
    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-lez v0, :cond_0

    .line 28
    .line 29
    iget-wide v0, p1, LH5/h;->f:J

    .line 30
    .line 31
    iput-wide v0, p0, LG5/K;->K0:J

    .line 32
    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    iput-boolean p1, p0, LG5/K;->L0:Z

    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public final a(LE5/r0;)V
    .locals 5

    .line 1
    iget-object v0, p0, LG5/K;->G0:LG5/G;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, LE5/r0;

    .line 7
    .line 8
    iget v2, p1, LE5/r0;->a:F

    .line 9
    .line 10
    const v3, 0x3dcccccd    # 0.1f

    .line 11
    .line 12
    .line 13
    const/high16 v4, 0x41000000    # 8.0f

    .line 14
    .line 15
    invoke-static {v2, v3, v4}, Lu6/v;->g(FFF)F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget p1, p1, LE5/r0;->b:F

    .line 20
    .line 21
    invoke-static {p1, v3, v4}, Lu6/v;->g(FFF)F

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-direct {v1, v2, p1}, LE5/r0;-><init>(FF)V

    .line 26
    .line 27
    .line 28
    iget-boolean p1, v0, LG5/G;->k:Z

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    sget p1, Lu6/v;->a:I

    .line 33
    .line 34
    const/16 v2, 0x17

    .line 35
    .line 36
    if-lt p1, v2, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0, v1}, LG5/G;->s(LE5/r0;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    invoke-virtual {v0}, LG5/G;->g()LG5/E;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-boolean p1, p1, LG5/E;->b:Z

    .line 47
    .line 48
    invoke-virtual {v0, v1, p1}, LG5/G;->r(LE5/r0;Z)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final b0(JJLV5/k;Ljava/nio/ByteBuffer;IIIJZZLE5/T;)Z
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LG5/K;->J0:LE5/T;

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    const/4 p3, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    and-int/lit8 p1, p8, 0x2

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {p5, p7, p3}, LV5/k;->x(IZ)V

    .line 18
    .line 19
    .line 20
    return p2

    .line 21
    :cond_0
    iget-object p1, p0, LG5/K;->G0:LG5/G;

    .line 22
    .line 23
    if-eqz p12, :cond_2

    .line 24
    .line 25
    if-eqz p5, :cond_1

    .line 26
    .line 27
    invoke-interface {p5, p7, p3}, LV5/k;->x(IZ)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object p3, p0, LV5/q;->z0:LH5/e;

    .line 31
    .line 32
    iget p4, p3, LH5/e;->g:I

    .line 33
    .line 34
    add-int/2addr p4, p9

    .line 35
    iput p4, p3, LH5/e;->g:I

    .line 36
    .line 37
    iput-boolean p2, p1, LG5/G;->G:Z

    .line 38
    .line 39
    return p2

    .line 40
    :cond_2
    :try_start_0
    invoke-virtual {p1, p10, p11, p9, p6}, LG5/G;->j(JILjava/nio/ByteBuffer;)Z

    .line 41
    .line 42
    .line 43
    move-result p1
    :try_end_0
    .catch LG5/r; {:try_start_0 .. :try_end_0} :catch_1
    .catch LG5/s; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    if-eqz p1, :cond_4

    .line 45
    .line 46
    if-eqz p5, :cond_3

    .line 47
    .line 48
    invoke-interface {p5, p7, p3}, LV5/k;->x(IZ)V

    .line 49
    .line 50
    .line 51
    :cond_3
    iget-object p1, p0, LV5/q;->z0:LH5/e;

    .line 52
    .line 53
    iget p3, p1, LH5/e;->f:I

    .line 54
    .line 55
    add-int/2addr p3, p9

    .line 56
    iput p3, p1, LH5/e;->f:I

    .line 57
    .line 58
    return p2

    .line 59
    :cond_4
    return p3

    .line 60
    :catch_0
    move-exception p1

    .line 61
    iget-boolean p2, p1, LG5/s;->b:Z

    .line 62
    .line 63
    const/16 p3, 0x138a

    .line 64
    .line 65
    invoke-virtual {p0, p1, p14, p2, p3}, LE5/f;->b(Ljava/lang/Exception;LE5/T;ZI)LE5/o;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    throw p1

    .line 70
    :catch_1
    move-exception p1

    .line 71
    const/16 p2, 0x1389

    .line 72
    .line 73
    iget-object p3, p1, LG5/r;->c:LE5/T;

    .line 74
    .line 75
    iget-boolean p4, p1, LG5/r;->b:Z

    .line 76
    .line 77
    invoke-virtual {p0, p1, p3, p4, p2}, LE5/f;->b(Ljava/lang/Exception;LE5/T;ZI)LE5/o;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    throw p1
.end method

.method public final c(ILjava/lang/Object;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object v1, p0, LG5/K;->G0:LG5/G;

    .line 3
    .line 4
    if-eq p1, v0, :cond_7

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    if-eq p1, v0, :cond_4

    .line 8
    .line 9
    const/4 v0, 0x6

    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    packed-switch p1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :pswitch_0
    sget p1, Lu6/v;->a:I

    .line 18
    .line 19
    const/16 v0, 0x17

    .line 20
    .line 21
    if-lt p1, v0, :cond_a

    .line 22
    .line 23
    invoke-static {v1, p2}, LG5/J;->a(LG5/t;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_1
    check-cast p2, LE5/K;

    .line 28
    .line 29
    iput-object p2, p0, LG5/K;->O0:LE5/K;

    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_2
    check-cast p2, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iget p2, v1, LG5/G;->W:I

    .line 39
    .line 40
    if-eq p2, p1, :cond_a

    .line 41
    .line 42
    iput p1, v1, LG5/G;->W:I

    .line 43
    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    const/4 p1, 0x1

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 p1, 0x0

    .line 49
    :goto_0
    iput-boolean p1, v1, LG5/G;->V:Z

    .line 50
    .line 51
    invoke-virtual {v1}, LG5/G;->d()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_3
    check-cast p2, Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-virtual {v1}, LG5/G;->g()LG5/E;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    iget-object p2, p2, LG5/E;->a:LE5/r0;

    .line 66
    .line 67
    invoke-virtual {v1, p2, p1}, LG5/G;->r(LE5/r0;Z)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_1
    check-cast p2, LG5/x;

    .line 72
    .line 73
    iget-object p1, v1, LG5/G;->X:LG5/x;

    .line 74
    .line 75
    invoke-virtual {p1, p2}, LG5/x;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_2

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget-object p1, v1, LG5/G;->u:Landroid/media/AudioTrack;

    .line 86
    .line 87
    if-eqz p1, :cond_3

    .line 88
    .line 89
    iget-object p1, v1, LG5/G;->X:LG5/x;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    :cond_3
    iput-object p2, v1, LG5/G;->X:LG5/x;

    .line 95
    .line 96
    return-void

    .line 97
    :cond_4
    check-cast p2, LG5/h;

    .line 98
    .line 99
    iget-object p1, v1, LG5/G;->v:LG5/h;

    .line 100
    .line 101
    invoke-virtual {p1, p2}, LG5/h;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_5

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_5
    iput-object p2, v1, LG5/G;->v:LG5/h;

    .line 109
    .line 110
    iget-boolean p1, v1, LG5/G;->Z:Z

    .line 111
    .line 112
    if-eqz p1, :cond_6

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_6
    invoke-virtual {v1}, LG5/G;->d()V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_7
    check-cast p2, Ljava/lang/Float;

    .line 120
    .line 121
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    iget p2, v1, LG5/G;->J:F

    .line 126
    .line 127
    cmpl-float p2, p2, p1

    .line 128
    .line 129
    if-eqz p2, :cond_a

    .line 130
    .line 131
    iput p1, v1, LG5/G;->J:F

    .line 132
    .line 133
    invoke-virtual {v1}, LG5/G;->m()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-nez p1, :cond_8

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_8
    sget p1, Lu6/v;->a:I

    .line 141
    .line 142
    const/16 p2, 0x15

    .line 143
    .line 144
    if-lt p1, p2, :cond_9

    .line 145
    .line 146
    iget-object p1, v1, LG5/G;->u:Landroid/media/AudioTrack;

    .line 147
    .line 148
    iget p2, v1, LG5/G;->J:F

    .line 149
    .line 150
    invoke-virtual {p1, p2}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_9
    iget-object p1, v1, LG5/G;->u:Landroid/media/AudioTrack;

    .line 155
    .line 156
    iget p2, v1, LG5/G;->J:F

    .line 157
    .line 158
    invoke-virtual {p1, p2, p2}, Landroid/media/AudioTrack;->setStereoVolume(FF)I

    .line 159
    .line 160
    .line 161
    :cond_a
    :goto_1
    return-void

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Lu6/j;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final e()LE5/r0;
    .locals 2

    .line 1
    iget-object v0, p0, LG5/K;->G0:LG5/G;

    .line 2
    .line 3
    iget-boolean v1, v0, LG5/G;->k:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, LG5/G;->y:LE5/r0;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-virtual {v0}, LG5/G;->g()LG5/E;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, LG5/E;->a:LE5/r0;

    .line 15
    .line 16
    return-object v0
.end method

.method public final e0()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, LG5/K;->G0:LG5/G;

    .line 2
    .line 3
    iget-boolean v1, v0, LG5/G;->S:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, LG5/G;->m()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, LG5/G;->c()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, LG5/G;->o()V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    iput-boolean v1, v0, LG5/G;->S:Z
    :try_end_0
    .catch LG5/s; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :catch_0
    move-exception v0

    .line 27
    const/16 v1, 0x138a

    .line 28
    .line 29
    iget-object v2, v0, LG5/s;->c:LE5/T;

    .line 30
    .line 31
    iget-boolean v3, v0, LG5/s;->b:Z

    .line 32
    .line 33
    invoke-virtual {p0, v0, v2, v3, v1}, LE5/f;->b(Ljava/lang/Exception;LE5/T;ZI)LE5/o;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    throw v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()J
    .locals 2

    .line 1
    iget v0, p0, LE5/f;->f:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, LG5/K;->r0()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, LG5/K;->K0:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public final i()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, LV5/q;->v0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LG5/K;->G0:LG5/G;

    .line 6
    .line 7
    invoke-virtual {v0}, LG5/G;->m()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-boolean v1, v0, LG5/G;->S:Z

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, LG5/G;->k()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    :cond_0
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-object v0, p0, LG5/K;->G0:LG5/G;

    .line 2
    .line 3
    invoke-virtual {v0}, LG5/G;->k()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-super {p0}, LV5/q;->j()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    return v0
.end method

.method public final k()V
    .locals 3

    .line 1
    iget-object v0, p0, LG5/K;->F0:LG5/p;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, LG5/K;->N0:Z

    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, LG5/K;->G0:LG5/G;

    .line 7
    .line 8
    invoke-virtual {v1}, LG5/G;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    .line 11
    :try_start_1
    invoke-super {p0}, LV5/q;->k()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LV5/q;->z0:LH5/e;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, LG5/p;->a(LH5/e;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    iget-object v2, p0, LV5/q;->z0:LH5/e;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, LG5/p;->a(LH5/e;)V

    .line 24
    .line 25
    .line 26
    throw v1

    .line 27
    :catchall_1
    move-exception v1

    .line 28
    :try_start_2
    invoke-super {p0}, LV5/q;->k()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, LV5/q;->z0:LH5/e;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, LG5/p;->a(LH5/e;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :catchall_2
    move-exception v1

    .line 38
    iget-object v2, p0, LV5/q;->z0:LH5/e;

    .line 39
    .line 40
    invoke-virtual {v0, v2}, LG5/p;->a(LH5/e;)V

    .line 41
    .line 42
    .line 43
    throw v1
.end method

.method public final k0(LE5/T;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LG5/K;->G0:LG5/G;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LG5/G;->f(LE5/T;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public final l(ZZ)V
    .locals 3

    .line 1
    new-instance p1, LH5/e;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    invoke-direct {p1, p2}, LH5/e;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, LV5/q;->z0:LH5/e;

    .line 8
    .line 9
    iget-object p2, p0, LG5/K;->F0:LG5/p;

    .line 10
    .line 11
    iget-object v0, p2, LG5/p;->b:Landroid/os/Handler;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v1, LG5/n;

    .line 16
    .line 17
    const/4 v2, 0x4

    .line 18
    invoke-direct {v1, p2, p1, v2}, LG5/n;-><init>(LG5/p;Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, LE5/f;->c:LE5/B0;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-boolean p1, p1, LE5/B0;->a:Z

    .line 30
    .line 31
    const/4 p2, 0x0

    .line 32
    iget-object v0, p0, LG5/K;->G0:LG5/G;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    sget p1, Lu6/v;->a:I

    .line 40
    .line 41
    const/16 v1, 0x15

    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    if-lt p1, v1, :cond_1

    .line 45
    .line 46
    move p2, v2

    .line 47
    :cond_1
    invoke-static {p2}, Lu6/a;->i(Z)V

    .line 48
    .line 49
    .line 50
    iget-boolean p1, v0, LG5/G;->V:Z

    .line 51
    .line 52
    invoke-static {p1}, Lu6/a;->i(Z)V

    .line 53
    .line 54
    .line 55
    iget-boolean p1, v0, LG5/G;->Z:Z

    .line 56
    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    iput-boolean v2, v0, LG5/G;->Z:Z

    .line 60
    .line 61
    invoke-virtual {v0}, LG5/G;->d()V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    iget-boolean p1, v0, LG5/G;->Z:Z

    .line 66
    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    iput-boolean p2, v0, LG5/G;->Z:Z

    .line 70
    .line 71
    invoke-virtual {v0}, LG5/G;->d()V

    .line 72
    .line 73
    .line 74
    :cond_3
    :goto_0
    iget-object p1, p0, LE5/f;->e:LF5/l;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iput-object p1, v0, LG5/G;->q:LF5/l;

    .line 80
    .line 81
    return-void
.end method

.method public final l0(LV5/r;LE5/T;)I
    .locals 11

    .line 1
    iget-object v0, p2, LE5/T;->l:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lu6/k;->g(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1, v1, v1}, LA7/p0;->e(III)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_0
    sget v0, Lu6/v;->a:I

    .line 16
    .line 17
    const/16 v2, 0x15

    .line 18
    .line 19
    if-lt v0, v2, :cond_1

    .line 20
    .line 21
    const/16 v0, 0x20

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v0, v1

    .line 25
    :goto_0
    const/4 v2, 0x1

    .line 26
    iget v3, p2, LE5/T;->E:I

    .line 27
    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    move v4, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    move v4, v1

    .line 33
    :goto_1
    const/4 v5, 0x2

    .line 34
    if-eqz v3, :cond_4

    .line 35
    .line 36
    if-ne v3, v5, :cond_3

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_3
    move v3, v1

    .line 40
    goto :goto_3

    .line 41
    :cond_4
    :goto_2
    move v3, v2

    .line 42
    :goto_3
    const-string v6, "audio/raw"

    .line 43
    .line 44
    const/16 v7, 0x8

    .line 45
    .line 46
    const/4 v8, 0x4

    .line 47
    iget-object v9, p0, LG5/K;->G0:LG5/G;

    .line 48
    .line 49
    if-eqz v3, :cond_7

    .line 50
    .line 51
    invoke-virtual {v9, p2}, LG5/G;->f(LE5/T;)I

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    if-eqz v10, :cond_7

    .line 56
    .line 57
    if-eqz v4, :cond_6

    .line 58
    .line 59
    invoke-static {v6, v1, v1}, LV5/y;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    if-eqz v10, :cond_5

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    goto :goto_4

    .line 71
    :cond_5
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, LV5/n;

    .line 76
    .line 77
    :goto_4
    if-eqz v4, :cond_7

    .line 78
    .line 79
    :cond_6
    invoke-static {v8, v7, v0}, LA7/p0;->e(III)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    return p1

    .line 84
    :cond_7
    iget-object v4, p2, LE5/T;->l:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_9

    .line 91
    .line 92
    invoke-virtual {v9, p2}, LG5/G;->f(LE5/T;)I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_8

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_8
    invoke-static {v2, v1, v1}, LA7/p0;->e(III)I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    return p1

    .line 104
    :cond_9
    :goto_5
    new-instance v4, LE5/S;

    .line 105
    .line 106
    invoke-direct {v4}, LE5/S;-><init>()V

    .line 107
    .line 108
    .line 109
    iput-object v6, v4, LE5/S;->k:Ljava/lang/String;

    .line 110
    .line 111
    iget v6, p2, LE5/T;->y:I

    .line 112
    .line 113
    iput v6, v4, LE5/S;->x:I

    .line 114
    .line 115
    iget v6, p2, LE5/T;->z:I

    .line 116
    .line 117
    iput v6, v4, LE5/S;->y:I

    .line 118
    .line 119
    iput v5, v4, LE5/S;->z:I

    .line 120
    .line 121
    new-instance v6, LE5/T;

    .line 122
    .line 123
    invoke-direct {v6, v4}, LE5/T;-><init>(LE5/S;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v9, v6}, LG5/G;->f(LE5/T;)I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_12

    .line 131
    .line 132
    invoke-static {p1, p2, v1, v9}, LG5/K;->q0(LV5/r;LE5/T;ZLG5/G;)Ll8/K;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-eqz v4, :cond_a

    .line 141
    .line 142
    invoke-static {v2, v1, v1}, LA7/p0;->e(III)I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    return p1

    .line 147
    :cond_a
    if-nez v3, :cond_b

    .line 148
    .line 149
    invoke-static {v5, v1, v1}, LA7/p0;->e(III)I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    return p1

    .line 154
    :cond_b
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    check-cast v3, LV5/n;

    .line 159
    .line 160
    invoke-virtual {v3, p2}, LV5/n;->c(LE5/T;)Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-nez v4, :cond_d

    .line 165
    .line 166
    move v5, v2

    .line 167
    :goto_6
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-ge v5, v6, :cond_d

    .line 172
    .line 173
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    check-cast v6, LV5/n;

    .line 178
    .line 179
    invoke-virtual {v6, p2}, LV5/n;->c(LE5/T;)Z

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    if-eqz v9, :cond_c

    .line 184
    .line 185
    move p1, v1

    .line 186
    move-object v3, v6

    .line 187
    goto :goto_7

    .line 188
    :cond_c
    add-int/lit8 v5, v5, 0x1

    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_d
    move p1, v2

    .line 192
    move v2, v4

    .line 193
    :goto_7
    if-eqz v2, :cond_e

    .line 194
    .line 195
    goto :goto_8

    .line 196
    :cond_e
    const/4 v8, 0x3

    .line 197
    :goto_8
    if-eqz v2, :cond_f

    .line 198
    .line 199
    invoke-virtual {v3, p2}, LV5/n;->d(LE5/T;)Z

    .line 200
    .line 201
    .line 202
    move-result p2

    .line 203
    if-eqz p2, :cond_f

    .line 204
    .line 205
    const/16 v7, 0x10

    .line 206
    .line 207
    :cond_f
    iget-boolean p2, v3, LV5/n;->g:Z

    .line 208
    .line 209
    if-eqz p2, :cond_10

    .line 210
    .line 211
    const/16 p2, 0x40

    .line 212
    .line 213
    goto :goto_9

    .line 214
    :cond_10
    move p2, v1

    .line 215
    :goto_9
    if-eqz p1, :cond_11

    .line 216
    .line 217
    const/16 v1, 0x80

    .line 218
    .line 219
    :cond_11
    or-int p1, v8, v7

    .line 220
    .line 221
    or-int/2addr p1, v0

    .line 222
    or-int/2addr p1, p2

    .line 223
    or-int/2addr p1, v1

    .line 224
    return p1

    .line 225
    :cond_12
    invoke-static {v2, v1, v1}, LA7/p0;->e(III)I

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    return p1
.end method

.method public final m(JZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, LV5/q;->m(JZ)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, LG5/K;->G0:LG5/G;

    .line 5
    .line 6
    invoke-virtual {p3}, LG5/G;->d()V

    .line 7
    .line 8
    .line 9
    iput-wide p1, p0, LG5/K;->K0:J

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, LG5/K;->L0:Z

    .line 13
    .line 14
    iput-boolean p1, p0, LG5/K;->M0:Z

    .line 15
    .line 16
    return-void
.end method

.method public final n()V
    .locals 5

    .line 1
    iget-object v0, p0, LG5/K;->G0:LG5/G;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    :try_start_0
    invoke-virtual {p0}, LV5/q;->B()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LV5/q;->d0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    .line 11
    :try_start_1
    iget-object v3, p0, LV5/q;->C:LA/e0;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v3, v2}, LA/e0;->y(LI5/f;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    iput-object v2, p0, LV5/q;->C:LA/e0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    iget-boolean v2, p0, LG5/K;->N0:Z

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    iput-boolean v1, p0, LG5/K;->N0:Z

    .line 26
    .line 27
    invoke-virtual {v0}, LG5/G;->q()V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void

    .line 31
    :catchall_0
    move-exception v2

    .line 32
    goto :goto_1

    .line 33
    :catchall_1
    move-exception v3

    .line 34
    :try_start_2
    iget-object v4, p0, LV5/q;->C:LA/e0;

    .line 35
    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    invoke-virtual {v4, v2}, LA/e0;->y(LI5/f;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iput-object v2, p0, LV5/q;->C:LA/e0;

    .line 42
    .line 43
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    :goto_1
    iget-boolean v3, p0, LG5/K;->N0:Z

    .line 45
    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    iput-boolean v1, p0, LG5/K;->N0:Z

    .line 49
    .line 50
    invoke-virtual {v0}, LG5/G;->q()V

    .line 51
    .line 52
    .line 53
    :cond_3
    throw v2
.end method

.method public final o()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, LG5/K;->G0:LG5/G;

    .line 3
    .line 4
    iput-boolean v0, v1, LG5/G;->U:Z

    .line 5
    .line 6
    invoke-virtual {v1}, LG5/G;->m()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v1, LG5/G;->i:LG5/w;

    .line 13
    .line 14
    iget-object v0, v0, LG5/w;->f:LG5/v;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, LG5/v;->a()V

    .line 20
    .line 21
    .line 22
    iget-object v0, v1, LG5/G;->u:Landroid/media/AudioTrack;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final p()V
    .locals 7

    .line 1
    invoke-virtual {p0}, LG5/K;->r0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LG5/K;->G0:LG5/G;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, v0, LG5/G;->U:Z

    .line 8
    .line 9
    invoke-virtual {v0}, LG5/G;->m()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    iget-object v2, v0, LG5/G;->i:LG5/w;

    .line 16
    .line 17
    const-wide/16 v3, 0x0

    .line 18
    .line 19
    iput-wide v3, v2, LG5/w;->l:J

    .line 20
    .line 21
    iput v1, v2, LG5/w;->w:I

    .line 22
    .line 23
    iput v1, v2, LG5/w;->v:I

    .line 24
    .line 25
    iput-wide v3, v2, LG5/w;->m:J

    .line 26
    .line 27
    iput-wide v3, v2, LG5/w;->C:J

    .line 28
    .line 29
    iput-wide v3, v2, LG5/w;->F:J

    .line 30
    .line 31
    iput-boolean v1, v2, LG5/w;->k:Z

    .line 32
    .line 33
    iget-wide v3, v2, LG5/w;->x:J

    .line 34
    .line 35
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    cmp-long v1, v3, v5

    .line 41
    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    iget-object v1, v2, LG5/w;->f:LG5/v;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, LG5/v;->a()V

    .line 50
    .line 51
    .line 52
    iget-object v0, v0, LG5/G;->u:Landroid/media/AudioTrack;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 55
    .line 56
    .line 57
    :cond_0
    return-void
.end method

.method public final p0(LV5/n;LE5/T;)I
    .locals 1

    .line 1
    const-string v0, "OMX.google.raw.decoder"

    .line 2
    .line 3
    iget-object p1, p1, LV5/n;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    sget p1, Lu6/v;->a:I

    .line 12
    .line 13
    const/16 v0, 0x18

    .line 14
    .line 15
    if-ge p1, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x17

    .line 18
    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, LG5/K;->E0:Landroid/content/Context;

    .line 22
    .line 23
    invoke-static {p1}, Lu6/v;->x(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    :cond_0
    const/4 p1, -0x1

    .line 30
    return p1

    .line 31
    :cond_1
    iget p1, p2, LE5/T;->m:I

    .line 32
    .line 33
    return p1
.end method

.method public final r0()V
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0}, LG5/K;->i()Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    iget-object v3, v0, LG5/K;->G0:LG5/G;

    .line 9
    .line 10
    invoke-virtual {v3}, LG5/G;->m()Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    iget-boolean v4, v3, LG5/G;->H:Z

    .line 17
    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    :cond_0
    const-wide/high16 v18, -0x8000000000000000L

    .line 21
    .line 22
    goto/16 :goto_14

    .line 23
    .line 24
    :cond_1
    iget-object v4, v3, LG5/G;->i:LG5/w;

    .line 25
    .line 26
    iget-object v8, v4, LG5/w;->c:Landroid/media/AudioTrack;

    .line 27
    .line 28
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v8}, Landroid/media/AudioTrack;->getPlayState()I

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    iget-object v9, v4, LG5/w;->a:Lxa/d;

    .line 36
    .line 37
    const-wide/32 v16, 0xf4240

    .line 38
    .line 39
    .line 40
    const-wide/high16 v18, -0x8000000000000000L

    .line 41
    .line 42
    iget-object v6, v9, Lxa/d;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v6, LG5/G;

    .line 45
    .line 46
    const-wide/16 v10, 0x0

    .line 47
    .line 48
    const/4 v9, 0x3

    .line 49
    if-ne v8, v9, :cond_1a

    .line 50
    .line 51
    invoke-virtual {v4}, LG5/w;->a()J

    .line 52
    .line 53
    .line 54
    move-result-wide v20

    .line 55
    mul-long v20, v20, v16

    .line 56
    .line 57
    iget v8, v4, LG5/w;->g:I

    .line 58
    .line 59
    int-to-long v12, v8

    .line 60
    div-long v12, v20, v12

    .line 61
    .line 62
    cmp-long v8, v12, v10

    .line 63
    .line 64
    if-nez v8, :cond_2

    .line 65
    .line 66
    goto/16 :goto_9

    .line 67
    .line 68
    :cond_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 69
    .line 70
    .line 71
    move-result-wide v20

    .line 72
    const-wide/16 v22, 0x3e8

    .line 73
    .line 74
    div-long v14, v20, v22

    .line 75
    .line 76
    iget-wide v7, v4, LG5/w;->m:J

    .line 77
    .line 78
    sub-long v7, v14, v7

    .line 79
    .line 80
    const-wide/16 v24, 0x7530

    .line 81
    .line 82
    cmp-long v7, v7, v24

    .line 83
    .line 84
    if-ltz v7, :cond_4

    .line 85
    .line 86
    iget v7, v4, LG5/w;->v:I

    .line 87
    .line 88
    sub-long v24, v12, v14

    .line 89
    .line 90
    iget-object v8, v4, LG5/w;->b:[J

    .line 91
    .line 92
    aput-wide v24, v8, v7

    .line 93
    .line 94
    add-int/2addr v7, v1

    .line 95
    const/16 v9, 0xa

    .line 96
    .line 97
    rem-int/2addr v7, v9

    .line 98
    iput v7, v4, LG5/w;->v:I

    .line 99
    .line 100
    iget v7, v4, LG5/w;->w:I

    .line 101
    .line 102
    if-ge v7, v9, :cond_3

    .line 103
    .line 104
    add-int/2addr v7, v1

    .line 105
    iput v7, v4, LG5/w;->w:I

    .line 106
    .line 107
    :cond_3
    iput-wide v14, v4, LG5/w;->m:J

    .line 108
    .line 109
    iput-wide v10, v4, LG5/w;->l:J

    .line 110
    .line 111
    const/4 v7, 0x0

    .line 112
    :goto_0
    iget v9, v4, LG5/w;->w:I

    .line 113
    .line 114
    if-ge v7, v9, :cond_4

    .line 115
    .line 116
    iget-wide v10, v4, LG5/w;->l:J

    .line 117
    .line 118
    aget-wide v26, v8, v7

    .line 119
    .line 120
    move-object/from16 v29, v6

    .line 121
    .line 122
    int-to-long v5, v9

    .line 123
    div-long v26, v26, v5

    .line 124
    .line 125
    add-long v5, v26, v10

    .line 126
    .line 127
    iput-wide v5, v4, LG5/w;->l:J

    .line 128
    .line 129
    add-int/2addr v7, v1

    .line 130
    move-object/from16 v6, v29

    .line 131
    .line 132
    const-wide/16 v10, 0x0

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_4
    move-object/from16 v29, v6

    .line 136
    .line 137
    iget-boolean v5, v4, LG5/w;->h:Z

    .line 138
    .line 139
    if-eqz v5, :cond_5

    .line 140
    .line 141
    move/from16 v30, v2

    .line 142
    .line 143
    goto/16 :goto_a

    .line 144
    .line 145
    :cond_5
    iget-object v5, v4, LG5/w;->f:LG5/v;

    .line 146
    .line 147
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-object v6, v5, LG5/v;->g:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v6, LG5/u;

    .line 153
    .line 154
    const/4 v9, 0x4

    .line 155
    if-eqz v6, :cond_11

    .line 156
    .line 157
    iget-wide v10, v5, LG5/v;->e:J

    .line 158
    .line 159
    sub-long v10, v14, v10

    .line 160
    .line 161
    const-wide/32 v26, 0x7a120

    .line 162
    .line 163
    .line 164
    iget-wide v7, v5, LG5/v;->d:J

    .line 165
    .line 166
    cmp-long v7, v10, v7

    .line 167
    .line 168
    if-gez v7, :cond_6

    .line 169
    .line 170
    :goto_1
    move/from16 v30, v2

    .line 171
    .line 172
    goto/16 :goto_3

    .line 173
    .line 174
    :cond_6
    iput-wide v14, v5, LG5/v;->e:J

    .line 175
    .line 176
    iget-object v7, v6, LG5/u;->a:Landroid/media/AudioTrack;

    .line 177
    .line 178
    iget-object v8, v6, LG5/u;->b:Landroid/media/AudioTimestamp;

    .line 179
    .line 180
    invoke-virtual {v7, v8}, Landroid/media/AudioTrack;->getTimestamp(Landroid/media/AudioTimestamp;)Z

    .line 181
    .line 182
    .line 183
    move-result v7

    .line 184
    if-eqz v7, :cond_8

    .line 185
    .line 186
    iget-wide v10, v8, Landroid/media/AudioTimestamp;->framePosition:J

    .line 187
    .line 188
    move/from16 v30, v2

    .line 189
    .line 190
    iget-wide v1, v6, LG5/u;->d:J

    .line 191
    .line 192
    cmp-long v1, v1, v10

    .line 193
    .line 194
    if-lez v1, :cond_7

    .line 195
    .line 196
    iget-wide v1, v6, LG5/u;->c:J

    .line 197
    .line 198
    const-wide/16 v31, 0x1

    .line 199
    .line 200
    add-long v1, v1, v31

    .line 201
    .line 202
    iput-wide v1, v6, LG5/u;->c:J

    .line 203
    .line 204
    :cond_7
    iput-wide v10, v6, LG5/u;->d:J

    .line 205
    .line 206
    iget-wide v1, v6, LG5/u;->c:J

    .line 207
    .line 208
    const/16 v31, 0x20

    .line 209
    .line 210
    shl-long v1, v1, v31

    .line 211
    .line 212
    add-long/2addr v10, v1

    .line 213
    iput-wide v10, v6, LG5/u;->e:J

    .line 214
    .line 215
    goto :goto_2

    .line 216
    :cond_8
    move/from16 v30, v2

    .line 217
    .line 218
    :goto_2
    iget v1, v5, LG5/v;->b:I

    .line 219
    .line 220
    if-eqz v1, :cond_e

    .line 221
    .line 222
    const/4 v2, 0x1

    .line 223
    if-eq v1, v2, :cond_c

    .line 224
    .line 225
    const/4 v2, 0x2

    .line 226
    if-eq v1, v2, :cond_b

    .line 227
    .line 228
    const/4 v2, 0x3

    .line 229
    if-eq v1, v2, :cond_a

    .line 230
    .line 231
    if-ne v1, v9, :cond_9

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 235
    .line 236
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 237
    .line 238
    .line 239
    throw v1

    .line 240
    :cond_a
    if-eqz v7, :cond_12

    .line 241
    .line 242
    invoke-virtual {v5}, LG5/v;->a()V

    .line 243
    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_b
    if-nez v7, :cond_12

    .line 247
    .line 248
    invoke-virtual {v5}, LG5/v;->a()V

    .line 249
    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_c
    if-eqz v7, :cond_d

    .line 253
    .line 254
    iget-wide v1, v6, LG5/u;->e:J

    .line 255
    .line 256
    iget-wide v10, v5, LG5/v;->f:J

    .line 257
    .line 258
    cmp-long v1, v1, v10

    .line 259
    .line 260
    if-lez v1, :cond_12

    .line 261
    .line 262
    const/4 v2, 0x2

    .line 263
    invoke-virtual {v5, v2}, LG5/v;->b(I)V

    .line 264
    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_d
    invoke-virtual {v5}, LG5/v;->a()V

    .line 268
    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_e
    if-eqz v7, :cond_10

    .line 272
    .line 273
    iget-wide v1, v8, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 274
    .line 275
    div-long v1, v1, v22

    .line 276
    .line 277
    iget-wide v10, v5, LG5/v;->c:J

    .line 278
    .line 279
    cmp-long v1, v1, v10

    .line 280
    .line 281
    if-ltz v1, :cond_f

    .line 282
    .line 283
    iget-wide v1, v6, LG5/u;->e:J

    .line 284
    .line 285
    iput-wide v1, v5, LG5/v;->f:J

    .line 286
    .line 287
    const/4 v2, 0x1

    .line 288
    invoke-virtual {v5, v2}, LG5/v;->b(I)V

    .line 289
    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_f
    :goto_3
    const/4 v7, 0x0

    .line 293
    goto :goto_4

    .line 294
    :cond_10
    iget-wide v1, v5, LG5/v;->c:J

    .line 295
    .line 296
    sub-long v1, v14, v1

    .line 297
    .line 298
    cmp-long v1, v1, v26

    .line 299
    .line 300
    if-lez v1, :cond_12

    .line 301
    .line 302
    const/4 v2, 0x3

    .line 303
    invoke-virtual {v5, v2}, LG5/v;->b(I)V

    .line 304
    .line 305
    .line 306
    goto :goto_4

    .line 307
    :cond_11
    const-wide/32 v26, 0x7a120

    .line 308
    .line 309
    .line 310
    goto/16 :goto_1

    .line 311
    .line 312
    :cond_12
    :goto_4
    const-string v1, "DefaultAudioSink"

    .line 313
    .line 314
    if-nez v7, :cond_13

    .line 315
    .line 316
    const-wide/32 v31, 0x4c4b40

    .line 317
    .line 318
    .line 319
    goto/16 :goto_7

    .line 320
    .line 321
    :cond_13
    if-eqz v6, :cond_14

    .line 322
    .line 323
    iget-object v2, v6, LG5/u;->b:Landroid/media/AudioTimestamp;

    .line 324
    .line 325
    iget-wide v7, v2, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 326
    .line 327
    div-long v7, v7, v22

    .line 328
    .line 329
    goto :goto_5

    .line 330
    :cond_14
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    :goto_5
    const-wide/32 v31, 0x4c4b40

    .line 336
    .line 337
    .line 338
    if-eqz v6, :cond_15

    .line 339
    .line 340
    iget-wide v10, v6, LG5/u;->e:J

    .line 341
    .line 342
    goto :goto_6

    .line 343
    :cond_15
    const-wide/16 v10, -0x1

    .line 344
    .line 345
    :goto_6
    sub-long v33, v7, v14

    .line 346
    .line 347
    invoke-static/range {v33 .. v34}, Ljava/lang/Math;->abs(J)J

    .line 348
    .line 349
    .line 350
    move-result-wide v33

    .line 351
    cmp-long v2, v33, v31

    .line 352
    .line 353
    const-string v6, ", "

    .line 354
    .line 355
    if-lez v2, :cond_16

    .line 356
    .line 357
    const-string v2, "Spurious audio timestamp (system clock mismatch): "

    .line 358
    .line 359
    invoke-static {v10, v11, v2, v6}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-static {v2, v6, v14, v15, v6}, LVa/M6;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v29 .. v29}, LG5/G;->h()J

    .line 376
    .line 377
    .line 378
    move-result-wide v7

    .line 379
    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v29 .. v29}, LG5/G;->i()J

    .line 386
    .line 387
    .line 388
    move-result-wide v6

    .line 389
    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    invoke-static {v1, v2}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v5, v9}, LG5/v;->b(I)V

    .line 400
    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_16
    mul-long v33, v10, v16

    .line 404
    .line 405
    iget v2, v4, LG5/w;->g:I

    .line 406
    .line 407
    move-wide/from16 v35, v10

    .line 408
    .line 409
    int-to-long v9, v2

    .line 410
    div-long v33, v33, v9

    .line 411
    .line 412
    sub-long v33, v33, v12

    .line 413
    .line 414
    invoke-static/range {v33 .. v34}, Ljava/lang/Math;->abs(J)J

    .line 415
    .line 416
    .line 417
    move-result-wide v9

    .line 418
    cmp-long v2, v9, v31

    .line 419
    .line 420
    if-lez v2, :cond_17

    .line 421
    .line 422
    const-string v2, "Spurious audio timestamp (frame position mismatch): "

    .line 423
    .line 424
    move-wide/from16 v10, v35

    .line 425
    .line 426
    invoke-static {v10, v11, v2, v6}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-static {v2, v6, v14, v15, v6}, LVa/M6;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v29 .. v29}, LG5/G;->h()J

    .line 443
    .line 444
    .line 445
    move-result-wide v7

    .line 446
    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v29 .. v29}, LG5/G;->i()J

    .line 453
    .line 454
    .line 455
    move-result-wide v6

    .line 456
    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    invoke-static {v1, v2}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    const/4 v2, 0x4

    .line 467
    invoke-virtual {v5, v2}, LG5/v;->b(I)V

    .line 468
    .line 469
    .line 470
    goto :goto_7

    .line 471
    :cond_17
    const/4 v2, 0x4

    .line 472
    iget v6, v5, LG5/v;->b:I

    .line 473
    .line 474
    if-ne v6, v2, :cond_18

    .line 475
    .line 476
    invoke-virtual {v5}, LG5/v;->a()V

    .line 477
    .line 478
    .line 479
    :cond_18
    :goto_7
    iget-boolean v2, v4, LG5/w;->q:Z

    .line 480
    .line 481
    if-eqz v2, :cond_1b

    .line 482
    .line 483
    iget-object v2, v4, LG5/w;->n:Ljava/lang/reflect/Method;

    .line 484
    .line 485
    if-eqz v2, :cond_1b

    .line 486
    .line 487
    iget-wide v5, v4, LG5/w;->r:J

    .line 488
    .line 489
    sub-long v5, v14, v5

    .line 490
    .line 491
    cmp-long v5, v5, v26

    .line 492
    .line 493
    if-ltz v5, :cond_1b

    .line 494
    .line 495
    :try_start_0
    iget-object v5, v4, LG5/w;->c:Landroid/media/AudioTrack;

    .line 496
    .line 497
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    const/4 v6, 0x0

    .line 501
    new-array v7, v6, [Ljava/lang/Object;

    .line 502
    .line 503
    invoke-virtual {v2, v5, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    check-cast v2, Ljava/lang/Integer;

    .line 508
    .line 509
    sget v5, Lu6/v;->a:I

    .line 510
    .line 511
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 512
    .line 513
    .line 514
    move-result v2

    .line 515
    int-to-long v5, v2

    .line 516
    mul-long v5, v5, v22

    .line 517
    .line 518
    iget-wide v7, v4, LG5/w;->i:J

    .line 519
    .line 520
    sub-long/2addr v5, v7

    .line 521
    iput-wide v5, v4, LG5/w;->o:J

    .line 522
    .line 523
    const-wide/16 v7, 0x0

    .line 524
    .line 525
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 526
    .line 527
    .line 528
    move-result-wide v5

    .line 529
    iput-wide v5, v4, LG5/w;->o:J

    .line 530
    .line 531
    cmp-long v2, v5, v31

    .line 532
    .line 533
    if-lez v2, :cond_19

    .line 534
    .line 535
    new-instance v2, Ljava/lang/StringBuilder;

    .line 536
    .line 537
    const-string v7, "Ignoring impossibly large audio latency: "

    .line 538
    .line 539
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    invoke-static {v1, v2}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    const-wide/16 v7, 0x0

    .line 553
    .line 554
    iput-wide v7, v4, LG5/w;->o:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 555
    .line 556
    goto :goto_8

    .line 557
    :catch_0
    const/4 v1, 0x0

    .line 558
    iput-object v1, v4, LG5/w;->n:Ljava/lang/reflect/Method;

    .line 559
    .line 560
    :cond_19
    :goto_8
    iput-wide v14, v4, LG5/w;->r:J

    .line 561
    .line 562
    goto :goto_a

    .line 563
    :cond_1a
    :goto_9
    move/from16 v30, v2

    .line 564
    .line 565
    move-object/from16 v29, v6

    .line 566
    .line 567
    const-wide/16 v22, 0x3e8

    .line 568
    .line 569
    :cond_1b
    :goto_a
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 570
    .line 571
    .line 572
    move-result-wide v1

    .line 573
    div-long v1, v1, v22

    .line 574
    .line 575
    iget-object v5, v4, LG5/w;->f:LG5/v;

    .line 576
    .line 577
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    iget v6, v5, LG5/v;->b:I

    .line 581
    .line 582
    const/4 v7, 0x2

    .line 583
    if-ne v6, v7, :cond_1c

    .line 584
    .line 585
    const/4 v6, 0x1

    .line 586
    goto :goto_b

    .line 587
    :cond_1c
    const/4 v6, 0x0

    .line 588
    :goto_b
    if-eqz v6, :cond_1f

    .line 589
    .line 590
    iget-object v5, v5, LG5/v;->g:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast v5, LG5/u;

    .line 593
    .line 594
    if-eqz v5, :cond_1d

    .line 595
    .line 596
    iget-wide v10, v5, LG5/u;->e:J

    .line 597
    .line 598
    goto :goto_c

    .line 599
    :cond_1d
    const-wide/16 v10, -0x1

    .line 600
    .line 601
    :goto_c
    mul-long v10, v10, v16

    .line 602
    .line 603
    iget v7, v4, LG5/w;->g:I

    .line 604
    .line 605
    int-to-long v7, v7

    .line 606
    div-long/2addr v10, v7

    .line 607
    if-eqz v5, :cond_1e

    .line 608
    .line 609
    iget-object v5, v5, LG5/u;->b:Landroid/media/AudioTimestamp;

    .line 610
    .line 611
    iget-wide v7, v5, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 612
    .line 613
    div-long v12, v7, v22

    .line 614
    .line 615
    goto :goto_d

    .line 616
    :cond_1e
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    :goto_d
    sub-long v7, v1, v12

    .line 622
    .line 623
    iget v5, v4, LG5/w;->j:F

    .line 624
    .line 625
    invoke-static {v7, v8, v5}, Lu6/v;->n(JF)J

    .line 626
    .line 627
    .line 628
    move-result-wide v7

    .line 629
    add-long/2addr v7, v10

    .line 630
    goto :goto_f

    .line 631
    :cond_1f
    iget v5, v4, LG5/w;->w:I

    .line 632
    .line 633
    if-nez v5, :cond_20

    .line 634
    .line 635
    invoke-virtual {v4}, LG5/w;->a()J

    .line 636
    .line 637
    .line 638
    move-result-wide v7

    .line 639
    mul-long v7, v7, v16

    .line 640
    .line 641
    iget v5, v4, LG5/w;->g:I

    .line 642
    .line 643
    int-to-long v9, v5

    .line 644
    div-long/2addr v7, v9

    .line 645
    goto :goto_e

    .line 646
    :cond_20
    iget-wide v7, v4, LG5/w;->l:J

    .line 647
    .line 648
    add-long/2addr v7, v1

    .line 649
    :goto_e
    if-nez v30, :cond_21

    .line 650
    .line 651
    iget-wide v9, v4, LG5/w;->o:J

    .line 652
    .line 653
    sub-long/2addr v7, v9

    .line 654
    const-wide/16 v9, 0x0

    .line 655
    .line 656
    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 657
    .line 658
    .line 659
    move-result-wide v7

    .line 660
    :cond_21
    :goto_f
    iget-boolean v5, v4, LG5/w;->D:Z

    .line 661
    .line 662
    if-eq v5, v6, :cond_22

    .line 663
    .line 664
    iget-wide v9, v4, LG5/w;->C:J

    .line 665
    .line 666
    iput-wide v9, v4, LG5/w;->F:J

    .line 667
    .line 668
    iget-wide v9, v4, LG5/w;->B:J

    .line 669
    .line 670
    iput-wide v9, v4, LG5/w;->E:J

    .line 671
    .line 672
    :cond_22
    iget-wide v9, v4, LG5/w;->F:J

    .line 673
    .line 674
    sub-long v9, v1, v9

    .line 675
    .line 676
    cmp-long v5, v9, v16

    .line 677
    .line 678
    if-gez v5, :cond_23

    .line 679
    .line 680
    iget-wide v11, v4, LG5/w;->E:J

    .line 681
    .line 682
    iget v5, v4, LG5/w;->j:F

    .line 683
    .line 684
    invoke-static {v9, v10, v5}, Lu6/v;->n(JF)J

    .line 685
    .line 686
    .line 687
    move-result-wide v13

    .line 688
    add-long/2addr v13, v11

    .line 689
    mul-long v9, v9, v22

    .line 690
    .line 691
    div-long v9, v9, v16

    .line 692
    .line 693
    mul-long/2addr v7, v9

    .line 694
    sub-long v9, v22, v9

    .line 695
    .line 696
    mul-long/2addr v9, v13

    .line 697
    add-long/2addr v9, v7

    .line 698
    div-long v7, v9, v22

    .line 699
    .line 700
    :cond_23
    iget-boolean v5, v4, LG5/w;->k:Z

    .line 701
    .line 702
    if-nez v5, :cond_25

    .line 703
    .line 704
    iget-wide v9, v4, LG5/w;->B:J

    .line 705
    .line 706
    cmp-long v5, v7, v9

    .line 707
    .line 708
    if-lez v5, :cond_25

    .line 709
    .line 710
    const/4 v5, 0x1

    .line 711
    iput-boolean v5, v4, LG5/w;->k:Z

    .line 712
    .line 713
    sub-long v9, v7, v9

    .line 714
    .line 715
    invoke-static {v9, v10}, Lu6/v;->F(J)J

    .line 716
    .line 717
    .line 718
    move-result-wide v9

    .line 719
    iget v5, v4, LG5/w;->j:F

    .line 720
    .line 721
    const/high16 v11, 0x3f800000    # 1.0f

    .line 722
    .line 723
    cmpl-float v11, v5, v11

    .line 724
    .line 725
    if-nez v11, :cond_24

    .line 726
    .line 727
    goto :goto_10

    .line 728
    :cond_24
    long-to-double v9, v9

    .line 729
    float-to-double v11, v5

    .line 730
    div-double/2addr v9, v11

    .line 731
    invoke-static {v9, v10}, Ljava/lang/Math;->round(D)J

    .line 732
    .line 733
    .line 734
    move-result-wide v9

    .line 735
    :goto_10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 736
    .line 737
    .line 738
    move-result-wide v11

    .line 739
    invoke-static {v9, v10}, Lu6/v;->F(J)J

    .line 740
    .line 741
    .line 742
    move-result-wide v9

    .line 743
    sub-long/2addr v11, v9

    .line 744
    move-object/from16 v5, v29

    .line 745
    .line 746
    iget-object v5, v5, LG5/G;->r:Ly3/j;

    .line 747
    .line 748
    if-eqz v5, :cond_25

    .line 749
    .line 750
    iget-object v5, v5, Ly3/j;->b:Ljava/lang/Object;

    .line 751
    .line 752
    check-cast v5, LG5/K;

    .line 753
    .line 754
    iget-object v5, v5, LG5/K;->F0:LG5/p;

    .line 755
    .line 756
    iget-object v9, v5, LG5/p;->b:Landroid/os/Handler;

    .line 757
    .line 758
    if-eqz v9, :cond_25

    .line 759
    .line 760
    new-instance v10, LG5/n;

    .line 761
    .line 762
    invoke-direct {v10, v5, v11, v12}, LG5/n;-><init>(LG5/p;J)V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v9, v10}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 766
    .line 767
    .line 768
    :cond_25
    iput-wide v1, v4, LG5/w;->C:J

    .line 769
    .line 770
    iput-wide v7, v4, LG5/w;->B:J

    .line 771
    .line 772
    iput-boolean v6, v4, LG5/w;->D:Z

    .line 773
    .line 774
    iget-object v1, v3, LG5/G;->t:LG5/D;

    .line 775
    .line 776
    invoke-virtual {v3}, LG5/G;->i()J

    .line 777
    .line 778
    .line 779
    move-result-wide v4

    .line 780
    mul-long v4, v4, v16

    .line 781
    .line 782
    iget v1, v1, LG5/D;->e:I

    .line 783
    .line 784
    int-to-long v1, v1

    .line 785
    div-long/2addr v4, v1

    .line 786
    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 787
    .line 788
    .line 789
    move-result-wide v1

    .line 790
    :goto_11
    iget-object v4, v3, LG5/G;->j:Ljava/util/ArrayDeque;

    .line 791
    .line 792
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 793
    .line 794
    .line 795
    move-result v5

    .line 796
    if-nez v5, :cond_26

    .line 797
    .line 798
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v5

    .line 802
    check-cast v5, LG5/E;

    .line 803
    .line 804
    iget-wide v5, v5, LG5/E;->d:J

    .line 805
    .line 806
    cmp-long v5, v1, v5

    .line 807
    .line 808
    if-ltz v5, :cond_26

    .line 809
    .line 810
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v4

    .line 814
    check-cast v4, LG5/E;

    .line 815
    .line 816
    iput-object v4, v3, LG5/G;->x:LG5/E;

    .line 817
    .line 818
    goto :goto_11

    .line 819
    :cond_26
    iget-object v5, v3, LG5/G;->x:LG5/E;

    .line 820
    .line 821
    iget-wide v6, v5, LG5/E;->d:J

    .line 822
    .line 823
    sub-long v8, v1, v6

    .line 824
    .line 825
    iget-object v5, v5, LG5/E;->a:LE5/r0;

    .line 826
    .line 827
    sget-object v6, LE5/r0;->d:LE5/r0;

    .line 828
    .line 829
    invoke-virtual {v5, v6}, LE5/r0;->equals(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    move-result v5

    .line 833
    iget-object v6, v3, LG5/G;->b:LG9/e;

    .line 834
    .line 835
    if-eqz v5, :cond_27

    .line 836
    .line 837
    iget-object v1, v3, LG5/G;->x:LG5/E;

    .line 838
    .line 839
    iget-wide v1, v1, LG5/E;->c:J

    .line 840
    .line 841
    add-long/2addr v1, v8

    .line 842
    goto :goto_13

    .line 843
    :cond_27
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 844
    .line 845
    .line 846
    move-result v5

    .line 847
    if-eqz v5, :cond_2a

    .line 848
    .line 849
    iget-object v1, v6, LG9/e;->d:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast v1, LG5/P;

    .line 852
    .line 853
    iget-wide v4, v1, LG5/P;->o:J

    .line 854
    .line 855
    const-wide/16 v10, 0x400

    .line 856
    .line 857
    cmp-long v2, v4, v10

    .line 858
    .line 859
    if-ltz v2, :cond_29

    .line 860
    .line 861
    iget-wide v4, v1, LG5/P;->n:J

    .line 862
    .line 863
    iget-object v2, v1, LG5/P;->j:LG5/O;

    .line 864
    .line 865
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 866
    .line 867
    .line 868
    iget v7, v2, LG5/O;->k:I

    .line 869
    .line 870
    iget v2, v2, LG5/O;->b:I

    .line 871
    .line 872
    mul-int/2addr v7, v2

    .line 873
    const/16 v28, 0x2

    .line 874
    .line 875
    mul-int/lit8 v7, v7, 0x2

    .line 876
    .line 877
    int-to-long v10, v7

    .line 878
    sub-long v10, v4, v10

    .line 879
    .line 880
    iget-object v2, v1, LG5/P;->h:LG5/k;

    .line 881
    .line 882
    iget v2, v2, LG5/k;->a:I

    .line 883
    .line 884
    iget-object v4, v1, LG5/P;->g:LG5/k;

    .line 885
    .line 886
    iget v4, v4, LG5/k;->a:I

    .line 887
    .line 888
    if-ne v2, v4, :cond_28

    .line 889
    .line 890
    iget-wide v12, v1, LG5/P;->o:J

    .line 891
    .line 892
    invoke-static/range {v8 .. v13}, Lu6/v;->D(JJJ)J

    .line 893
    .line 894
    .line 895
    move-result-wide v1

    .line 896
    goto :goto_12

    .line 897
    :cond_28
    int-to-long v12, v2

    .line 898
    mul-long/2addr v10, v12

    .line 899
    iget-wide v1, v1, LG5/P;->o:J

    .line 900
    .line 901
    int-to-long v4, v4

    .line 902
    mul-long v12, v1, v4

    .line 903
    .line 904
    invoke-static/range {v8 .. v13}, Lu6/v;->D(JJJ)J

    .line 905
    .line 906
    .line 907
    move-result-wide v1

    .line 908
    goto :goto_12

    .line 909
    :cond_29
    iget v1, v1, LG5/P;->c:F

    .line 910
    .line 911
    float-to-double v1, v1

    .line 912
    long-to-double v4, v8

    .line 913
    mul-double/2addr v1, v4

    .line 914
    double-to-long v1, v1

    .line 915
    :goto_12
    iget-object v4, v3, LG5/G;->x:LG5/E;

    .line 916
    .line 917
    iget-wide v4, v4, LG5/E;->c:J

    .line 918
    .line 919
    add-long/2addr v1, v4

    .line 920
    goto :goto_13

    .line 921
    :cond_2a
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v4

    .line 925
    check-cast v4, LG5/E;

    .line 926
    .line 927
    iget-wide v7, v4, LG5/E;->d:J

    .line 928
    .line 929
    sub-long/2addr v7, v1

    .line 930
    iget-object v1, v3, LG5/G;->x:LG5/E;

    .line 931
    .line 932
    iget-object v1, v1, LG5/E;->a:LE5/r0;

    .line 933
    .line 934
    iget v1, v1, LE5/r0;->a:F

    .line 935
    .line 936
    invoke-static {v7, v8, v1}, Lu6/v;->n(JF)J

    .line 937
    .line 938
    .line 939
    move-result-wide v1

    .line 940
    iget-wide v4, v4, LG5/E;->c:J

    .line 941
    .line 942
    sub-long v1, v4, v1

    .line 943
    .line 944
    :goto_13
    iget-object v3, v3, LG5/G;->t:LG5/D;

    .line 945
    .line 946
    iget-object v4, v6, LG9/e;->c:Ljava/lang/Object;

    .line 947
    .line 948
    check-cast v4, LG5/N;

    .line 949
    .line 950
    iget-wide v4, v4, LG5/N;->t:J

    .line 951
    .line 952
    mul-long v4, v4, v16

    .line 953
    .line 954
    iget v3, v3, LG5/D;->e:I

    .line 955
    .line 956
    int-to-long v6, v3

    .line 957
    div-long/2addr v4, v6

    .line 958
    add-long/2addr v4, v1

    .line 959
    goto :goto_15

    .line 960
    :goto_14
    move-wide/from16 v4, v18

    .line 961
    .line 962
    :goto_15
    cmp-long v1, v4, v18

    .line 963
    .line 964
    if-eqz v1, :cond_2c

    .line 965
    .line 966
    iget-boolean v1, v0, LG5/K;->M0:Z

    .line 967
    .line 968
    if-eqz v1, :cond_2b

    .line 969
    .line 970
    goto :goto_16

    .line 971
    :cond_2b
    iget-wide v1, v0, LG5/K;->K0:J

    .line 972
    .line 973
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 974
    .line 975
    .line 976
    move-result-wide v4

    .line 977
    :goto_16
    iput-wide v4, v0, LG5/K;->K0:J

    .line 978
    .line 979
    const/4 v6, 0x0

    .line 980
    iput-boolean v6, v0, LG5/K;->M0:Z

    .line 981
    .line 982
    :cond_2c
    return-void
.end method

.method public final z(LV5/n;LE5/T;LE5/T;)LH5/i;
    .locals 10

    .line 1
    invoke-virtual {p1, p2, p3}, LV5/n;->b(LE5/T;LE5/T;)LH5/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, p3}, LG5/K;->p0(LV5/n;LE5/T;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, p0, LG5/K;->H0:I

    .line 10
    .line 11
    iget v3, v0, LH5/i;->e:I

    .line 12
    .line 13
    if-le v1, v2, :cond_0

    .line 14
    .line 15
    or-int/lit8 v3, v3, 0x40

    .line 16
    .line 17
    :cond_0
    move v9, v3

    .line 18
    new-instance v4, LH5/i;

    .line 19
    .line 20
    if-eqz v9, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    :goto_0
    move v8, v0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget v0, v0, LH5/i;->d:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :goto_1
    iget-object v5, p1, LV5/n;->a:Ljava/lang/String;

    .line 29
    .line 30
    move-object v6, p2

    .line 31
    move-object v7, p3

    .line 32
    invoke-direct/range {v4 .. v9}, LH5/i;-><init>(Ljava/lang/String;LE5/T;LE5/T;II)V

    .line 33
    .line 34
    .line 35
    return-object v4
.end method
