.class public final Ld2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Landroid/media/MediaCodecInfo$CodecCapabilities;

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ld2/m;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Ld2/m;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Ld2/m;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, Ld2/m;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 14
    .line 15
    iput-boolean p5, p0, Ld2/m;->g:Z

    .line 16
    .line 17
    iput-boolean p6, p0, Ld2/m;->e:Z

    .line 18
    .line 19
    iput-boolean p7, p0, Ld2/m;->f:Z

    .line 20
    .line 21
    iput-boolean p8, p0, Ld2/m;->h:Z

    .line 22
    .line 23
    invoke-static {p2}, LN1/C;->l(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput-boolean p1, p0, Ld2/m;->i:Z

    .line 28
    .line 29
    return-void
.end method

.method public static a(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getWidthAlignment()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getHeightAlignment()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-instance v2, Landroid/graphics/Point;

    .line 10
    .line 11
    invoke-static {p1, v0}, LQ1/x;->f(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    mul-int/2addr p1, v0

    .line 16
    invoke-static {p2, v1}, LQ1/x;->f(II)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    mul-int/2addr p2, v1

    .line 21
    invoke-direct {v2, p1, p2}, Landroid/graphics/Point;-><init>(II)V

    .line 22
    .line 23
    .line 24
    iget p1, v2, Landroid/graphics/Point;->x:I

    .line 25
    .line 26
    iget p2, v2, Landroid/graphics/Point;->y:I

    .line 27
    .line 28
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 29
    .line 30
    cmpl-double v0, p3, v0

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 35
    .line 36
    cmpg-double v0, p3, v0

    .line 37
    .line 38
    if-gez v0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {p3, p4}, Ljava/lang/Math;->floor(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide p3

    .line 45
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/media/MediaCodecInfo$VideoCapabilities;->areSizeAndRateSupported(IID)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->isSizeSupported(II)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0
.end method

.method public static h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZ)Ld2/m;
    .locals 9

    .line 1
    new-instance v0, Ld2/m;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz p3, :cond_2

    .line 6
    .line 7
    const-string v3, "adaptive-playback"

    .line 8
    .line 9
    invoke-virtual {p3, v3}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_2

    .line 14
    .line 15
    sget v3, LQ1/x;->a:I

    .line 16
    .line 17
    const/16 v4, 0x16

    .line 18
    .line 19
    if-gt v3, v4, :cond_1

    .line 20
    .line 21
    sget-object v3, LQ1/x;->d:Ljava/lang/String;

    .line 22
    .line 23
    const-string v4, "ODROID-XU3"

    .line 24
    .line 25
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    const-string v4, "Nexus 10"

    .line 32
    .line 33
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    :cond_0
    const-string v3, "OMX.Exynos.AVC.Decoder"

    .line 40
    .line 41
    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_2

    .line 46
    .line 47
    const-string v3, "OMX.Exynos.AVC.Decoder.secure"

    .line 48
    .line 49
    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move v6, v2

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    :goto_0
    move v6, v1

    .line 59
    :goto_1
    if-eqz p3, :cond_3

    .line 60
    .line 61
    const-string v3, "tunneled-playback"

    .line 62
    .line 63
    invoke-virtual {p3, v3}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    :cond_3
    if-nez p5, :cond_5

    .line 68
    .line 69
    if-eqz p3, :cond_4

    .line 70
    .line 71
    const-string p5, "secure-playback"

    .line 72
    .line 73
    invoke-virtual {p3, p5}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result p5

    .line 77
    if-eqz p5, :cond_4

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    move v7, v1

    .line 81
    goto :goto_3

    .line 82
    :cond_5
    :goto_2
    move v7, v2

    .line 83
    :goto_3
    sget p5, LQ1/x;->a:I

    .line 84
    .line 85
    const/16 v3, 0x23

    .line 86
    .line 87
    if-lt p5, v3, :cond_6

    .line 88
    .line 89
    if-eqz p3, :cond_6

    .line 90
    .line 91
    const-string p5, "detached-surface"

    .line 92
    .line 93
    invoke-virtual {p3, p5}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result p5

    .line 97
    if-eqz p5, :cond_6

    .line 98
    .line 99
    move v8, v2

    .line 100
    move-object v1, p0

    .line 101
    move-object v3, p2

    .line 102
    move-object v4, p3

    .line 103
    move v5, p4

    .line 104
    move-object v2, p1

    .line 105
    goto :goto_4

    .line 106
    :cond_6
    move v8, v1

    .line 107
    move-object v2, p1

    .line 108
    move-object v3, p2

    .line 109
    move-object v4, p3

    .line 110
    move v5, p4

    .line 111
    move-object v1, p0

    .line 112
    :goto_4
    invoke-direct/range {v0 .. v8}, Ld2/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZ)V

    .line 113
    .line 114
    .line 115
    return-object v0
.end method


# virtual methods
.method public final b(LN1/n;LN1/n;)LU1/e;
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object v1, p1, LN1/n;->n:Ljava/lang/String;

    .line 3
    .line 4
    iget-object v2, p2, LN1/n;->n:Ljava/lang/String;

    .line 5
    .line 6
    sget v3, LQ1/x;->a:I

    .line 7
    .line 8
    invoke-static {v1, v2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    iget-boolean v2, p0, Ld2/m;->i:Z

    .line 19
    .line 20
    if-eqz v2, :cond_a

    .line 21
    .line 22
    iget v2, p1, LN1/n;->x:I

    .line 23
    .line 24
    iget v3, p2, LN1/n;->x:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_1

    .line 27
    .line 28
    or-int/lit16 v1, v1, 0x400

    .line 29
    .line 30
    :cond_1
    iget-boolean v2, p0, Ld2/m;->e:Z

    .line 31
    .line 32
    if-nez v2, :cond_3

    .line 33
    .line 34
    iget v2, p1, LN1/n;->u:I

    .line 35
    .line 36
    iget v3, p2, LN1/n;->u:I

    .line 37
    .line 38
    if-ne v2, v3, :cond_2

    .line 39
    .line 40
    iget v2, p1, LN1/n;->v:I

    .line 41
    .line 42
    iget v3, p2, LN1/n;->v:I

    .line 43
    .line 44
    if-eq v2, v3, :cond_3

    .line 45
    .line 46
    :cond_2
    or-int/lit16 v1, v1, 0x200

    .line 47
    .line 48
    :cond_3
    iget-object v2, p1, LN1/n;->B:LN1/f;

    .line 49
    .line 50
    invoke-static {v2}, LN1/f;->e(LN1/f;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    iget-object v4, p2, LN1/n;->B:LN1/f;

    .line 55
    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    invoke-static {v4}, LN1/f;->e(LN1/f;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-nez v3, :cond_5

    .line 63
    .line 64
    :cond_4
    invoke-static {v2, v4}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_5

    .line 69
    .line 70
    or-int/lit16 v1, v1, 0x800

    .line 71
    .line 72
    :cond_5
    sget-object v2, LQ1/x;->d:Ljava/lang/String;

    .line 73
    .line 74
    const-string v3, "SM-T230"

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_6

    .line 81
    .line 82
    const-string v2, "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"

    .line 83
    .line 84
    iget-object v3, p0, Ld2/m;->a:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_6

    .line 91
    .line 92
    invoke-virtual {p1, p2}, LN1/n;->b(LN1/n;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_6

    .line 97
    .line 98
    or-int/2addr v1, v0

    .line 99
    :cond_6
    if-nez v1, :cond_8

    .line 100
    .line 101
    new-instance v2, LU1/e;

    .line 102
    .line 103
    invoke-virtual {p1, p2}, LN1/n;->b(LN1/n;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_7

    .line 108
    .line 109
    const/4 v0, 0x3

    .line 110
    :cond_7
    move v6, v0

    .line 111
    const/4 v7, 0x0

    .line 112
    iget-object v3, p0, Ld2/m;->a:Ljava/lang/String;

    .line 113
    .line 114
    move-object v4, p1

    .line 115
    move-object v5, p2

    .line 116
    invoke-direct/range {v2 .. v7}, LU1/e;-><init>(Ljava/lang/String;LN1/n;LN1/n;II)V

    .line 117
    .line 118
    .line 119
    return-object v2

    .line 120
    :cond_8
    move-object v5, p1

    .line 121
    move-object v6, p2

    .line 122
    :cond_9
    move v8, v1

    .line 123
    goto/16 :goto_1

    .line 124
    .line 125
    :cond_a
    move-object v5, p1

    .line 126
    move-object v6, p2

    .line 127
    iget p1, v5, LN1/n;->C:I

    .line 128
    .line 129
    iget p2, v6, LN1/n;->C:I

    .line 130
    .line 131
    if-eq p1, p2, :cond_b

    .line 132
    .line 133
    or-int/lit16 v1, v1, 0x1000

    .line 134
    .line 135
    :cond_b
    iget p1, v5, LN1/n;->D:I

    .line 136
    .line 137
    iget p2, v6, LN1/n;->D:I

    .line 138
    .line 139
    if-eq p1, p2, :cond_c

    .line 140
    .line 141
    or-int/lit16 v1, v1, 0x2000

    .line 142
    .line 143
    :cond_c
    iget p1, v5, LN1/n;->E:I

    .line 144
    .line 145
    iget p2, v6, LN1/n;->E:I

    .line 146
    .line 147
    if-eq p1, p2, :cond_d

    .line 148
    .line 149
    or-int/lit16 v1, v1, 0x4000

    .line 150
    .line 151
    :cond_d
    iget-object p1, p0, Ld2/m;->b:Ljava/lang/String;

    .line 152
    .line 153
    if-nez v1, :cond_e

    .line 154
    .line 155
    const-string p2, "audio/mp4a-latm"

    .line 156
    .line 157
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    if-eqz p2, :cond_e

    .line 162
    .line 163
    invoke-static {v5}, Ld2/v;->d(LN1/n;)Landroid/util/Pair;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    invoke-static {v6}, Ld2/v;->d(LN1/n;)Landroid/util/Pair;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    if-eqz p2, :cond_e

    .line 172
    .line 173
    if-eqz v2, :cond_e

    .line 174
    .line 175
    iget-object p2, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast p2, Ljava/lang/Integer;

    .line 178
    .line 179
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 180
    .line 181
    .line 182
    move-result p2

    .line 183
    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v2, Ljava/lang/Integer;

    .line 186
    .line 187
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    const/16 v3, 0x2a

    .line 192
    .line 193
    if-ne p2, v3, :cond_e

    .line 194
    .line 195
    if-ne v2, v3, :cond_e

    .line 196
    .line 197
    new-instance v3, LU1/e;

    .line 198
    .line 199
    const/4 v7, 0x3

    .line 200
    const/4 v8, 0x0

    .line 201
    iget-object v4, p0, Ld2/m;->a:Ljava/lang/String;

    .line 202
    .line 203
    invoke-direct/range {v3 .. v8}, LU1/e;-><init>(Ljava/lang/String;LN1/n;LN1/n;II)V

    .line 204
    .line 205
    .line 206
    return-object v3

    .line 207
    :cond_e
    invoke-virtual {v5, v6}, LN1/n;->b(LN1/n;)Z

    .line 208
    .line 209
    .line 210
    move-result p2

    .line 211
    if-nez p2, :cond_f

    .line 212
    .line 213
    or-int/lit8 v1, v1, 0x20

    .line 214
    .line 215
    :cond_f
    const-string p2, "audio/opus"

    .line 216
    .line 217
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    if-eqz p1, :cond_10

    .line 222
    .line 223
    or-int/lit8 p1, v1, 0x2

    .line 224
    .line 225
    move v1, p1

    .line 226
    :cond_10
    if-nez v1, :cond_9

    .line 227
    .line 228
    new-instance v3, LU1/e;

    .line 229
    .line 230
    const/4 v7, 0x1

    .line 231
    const/4 v8, 0x0

    .line 232
    iget-object v4, p0, Ld2/m;->a:Ljava/lang/String;

    .line 233
    .line 234
    invoke-direct/range {v3 .. v8}, LU1/e;-><init>(Ljava/lang/String;LN1/n;LN1/n;II)V

    .line 235
    .line 236
    .line 237
    return-object v3

    .line 238
    :goto_1
    new-instance v3, LU1/e;

    .line 239
    .line 240
    iget-object v4, p0, Ld2/m;->a:Ljava/lang/String;

    .line 241
    .line 242
    const/4 v7, 0x0

    .line 243
    invoke-direct/range {v3 .. v8}, LU1/e;-><init>(Ljava/lang/String;LN1/n;LN1/n;II)V

    .line 244
    .line 245
    .line 246
    return-object v3
.end method

.method public final c(LN1/n;Z)Z
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v4, 0x3

    .line 7
    invoke-static {v1}, Ld2/v;->d(LN1/n;)Landroid/util/Pair;

    .line 8
    .line 9
    .line 10
    move-result-object v6

    .line 11
    iget-object v7, v0, Ld2/m;->c:Ljava/lang/String;

    .line 12
    .line 13
    const-string v8, "video/hevc"

    .line 14
    .line 15
    iget-object v10, v1, LN1/n;->n:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v10, :cond_9

    .line 18
    .line 19
    const-string v11, "video/mv-hevc"

    .line 20
    .line 21
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v12

    .line 25
    if-eqz v12, :cond_9

    .line 26
    .line 27
    invoke-static {v7}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v12

    .line 31
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v11

    .line 35
    if-eqz v11, :cond_1

    .line 36
    .line 37
    :cond_0
    :goto_0
    const/16 v17, 0x1

    .line 38
    .line 39
    goto/16 :goto_d

    .line 40
    .line 41
    :cond_1
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v11

    .line 45
    if-eqz v11, :cond_9

    .line 46
    .line 47
    iget-object v6, v1, LN1/n;->q:Ljava/util/List;

    .line 48
    .line 49
    const/4 v11, 0x0

    .line 50
    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    if-ge v11, v12, :cond_7

    .line 55
    .line 56
    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v12

    .line 60
    check-cast v12, [B

    .line 61
    .line 62
    array-length v13, v12

    .line 63
    if-le v13, v4, :cond_6

    .line 64
    .line 65
    new-array v14, v4, [Z

    .line 66
    .line 67
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 68
    .line 69
    .line 70
    move-result-object v15

    .line 71
    const/4 v5, 0x0

    .line 72
    :goto_2
    array-length v3, v12

    .line 73
    if-ge v5, v3, :cond_3

    .line 74
    .line 75
    array-length v3, v12

    .line 76
    invoke-static {v12, v5, v3, v14}, LR1/n;->b([BII[Z)I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    array-length v5, v12

    .line 81
    if-eq v3, v5, :cond_2

    .line 82
    .line 83
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v15, v5}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    add-int/lit8 v5, v3, 0x3

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    invoke-virtual {v15}, Ll8/H;->g()Ll8/e0;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    const/4 v5, 0x0

    .line 98
    :goto_3
    iget v14, v3, Ll8/e0;->d:I

    .line 99
    .line 100
    if-ge v5, v14, :cond_6

    .line 101
    .line 102
    invoke-virtual {v3, v5}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v14

    .line 106
    check-cast v14, Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v14

    .line 112
    add-int/2addr v14, v4

    .line 113
    if-ge v14, v13, :cond_5

    .line 114
    .line 115
    new-instance v14, LJ5/y;

    .line 116
    .line 117
    invoke-virtual {v3, v5}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v15

    .line 121
    check-cast v15, Ljava/lang/Integer;

    .line 122
    .line 123
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v15

    .line 127
    add-int/2addr v15, v4

    .line 128
    invoke-direct {v14, v15, v12, v13, v4}, LJ5/y;-><init>(I[BII)V

    .line 129
    .line 130
    .line 131
    invoke-static {v14}, LR1/n;->d(LJ5/y;)LD9/n;

    .line 132
    .line 133
    .line 134
    move-result-object v15

    .line 135
    iget v9, v15, LD9/n;->b:I

    .line 136
    .line 137
    const/16 v4, 0x21

    .line 138
    .line 139
    if-ne v9, v4, :cond_4

    .line 140
    .line 141
    iget v4, v15, LD9/n;->c:I

    .line 142
    .line 143
    if-nez v4, :cond_4

    .line 144
    .line 145
    invoke-virtual {v14, v2}, LJ5/y;->t(I)V

    .line 146
    .line 147
    .line 148
    const/4 v4, 0x3

    .line 149
    invoke-virtual {v14, v4}, LJ5/y;->i(I)I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    invoke-virtual {v14}, LJ5/y;->s()V

    .line 154
    .line 155
    .line 156
    const/4 v4, 0x1

    .line 157
    const/4 v9, 0x0

    .line 158
    invoke-static {v14, v4, v3, v9}, LR1/n;->e(LJ5/y;ZILR1/g;)LR1/g;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    iget-object v4, v3, LR1/g;->e:[I

    .line 163
    .line 164
    iget v5, v3, LR1/g;->f:I

    .line 165
    .line 166
    iget v6, v3, LR1/g;->a:I

    .line 167
    .line 168
    iget-boolean v11, v3, LR1/g;->b:Z

    .line 169
    .line 170
    iget v12, v3, LR1/g;->c:I

    .line 171
    .line 172
    iget v3, v3, LR1/g;->d:I

    .line 173
    .line 174
    move/from16 v21, v3

    .line 175
    .line 176
    move-object/from16 v22, v4

    .line 177
    .line 178
    move/from16 v23, v5

    .line 179
    .line 180
    move/from16 v18, v6

    .line 181
    .line 182
    move/from16 v19, v11

    .line 183
    .line 184
    move/from16 v20, v12

    .line 185
    .line 186
    invoke-static/range {v18 .. v23}, LQ1/a;->b(IZII[II)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    goto :goto_4

    .line 191
    :cond_4
    const/4 v4, 0x3

    .line 192
    :cond_5
    const/4 v9, 0x0

    .line 193
    const/16 v17, 0x1

    .line 194
    .line 195
    add-int/lit8 v5, v5, 0x1

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_6
    const/4 v9, 0x0

    .line 199
    const/16 v17, 0x1

    .line 200
    .line 201
    add-int/lit8 v11, v11, 0x1

    .line 202
    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :cond_7
    const/4 v9, 0x0

    .line 206
    move-object v3, v9

    .line 207
    :goto_4
    if-nez v3, :cond_8

    .line 208
    .line 209
    move-object v3, v9

    .line 210
    goto :goto_5

    .line 211
    :cond_8
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    sget v5, LQ1/x;->a:I

    .line 216
    .line 217
    const/4 v5, -0x1

    .line 218
    const-string v6, "\\."

    .line 219
    .line 220
    invoke-virtual {v4, v6, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    iget-object v5, v1, LN1/n;->B:LN1/f;

    .line 225
    .line 226
    invoke-static {v3, v4, v5}, LQ1/a;->c(Ljava/lang/String;[Ljava/lang/String;LN1/f;)Landroid/util/Pair;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    :goto_5
    move-object v6, v3

    .line 231
    :cond_9
    if-nez v6, :cond_a

    .line 232
    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :cond_a
    iget-object v3, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v3, Ljava/lang/Integer;

    .line 238
    .line 239
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    iget-object v4, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v4, Ljava/lang/Integer;

    .line 246
    .line 247
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    const-string v5, "video/dolby-vision"

    .line 252
    .line 253
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    const/16 v6, 0x8

    .line 258
    .line 259
    const/4 v9, 0x2

    .line 260
    iget-object v10, v0, Ld2/m;->b:Ljava/lang/String;

    .line 261
    .line 262
    if-eqz v5, :cond_c

    .line 263
    .line 264
    const-string v5, "video/avc"

    .line 265
    .line 266
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    if-eqz v5, :cond_b

    .line 271
    .line 272
    move v3, v6

    .line 273
    :goto_6
    const/4 v4, 0x0

    .line 274
    goto :goto_7

    .line 275
    :cond_b
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v5

    .line 279
    if-eqz v5, :cond_c

    .line 280
    .line 281
    move v3, v9

    .line 282
    goto :goto_6

    .line 283
    :cond_c
    :goto_7
    iget-boolean v5, v0, Ld2/m;->i:Z

    .line 284
    .line 285
    if-nez v5, :cond_d

    .line 286
    .line 287
    const/16 v5, 0x2a

    .line 288
    .line 289
    if-eq v3, v5, :cond_d

    .line 290
    .line 291
    goto/16 :goto_0

    .line 292
    .line 293
    :cond_d
    iget-object v5, v0, Ld2/m;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 294
    .line 295
    if-eqz v5, :cond_e

    .line 296
    .line 297
    iget-object v11, v5, Landroid/media/MediaCodecInfo$CodecCapabilities;->profileLevels:[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 298
    .line 299
    if-nez v11, :cond_f

    .line 300
    .line 301
    :cond_e
    const/4 v11, 0x0

    .line 302
    new-array v12, v11, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 303
    .line 304
    move-object v11, v12

    .line 305
    :cond_f
    sget v12, LQ1/x;->a:I

    .line 306
    .line 307
    const/16 v13, 0x17

    .line 308
    .line 309
    if-gt v12, v13, :cond_1b

    .line 310
    .line 311
    const-string v12, "video/x-vnd.on2.vp9"

    .line 312
    .line 313
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v12

    .line 317
    if-eqz v12, :cond_1b

    .line 318
    .line 319
    array-length v12, v11

    .line 320
    if-nez v12, :cond_1b

    .line 321
    .line 322
    if-eqz v5, :cond_10

    .line 323
    .line 324
    invoke-virtual {v5}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    .line 325
    .line 326
    .line 327
    move-result-object v5

    .line 328
    if-eqz v5, :cond_10

    .line 329
    .line 330
    invoke-virtual {v5}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getBitrateRange()Landroid/util/Range;

    .line 331
    .line 332
    .line 333
    move-result-object v5

    .line 334
    invoke-virtual {v5}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    check-cast v5, Ljava/lang/Integer;

    .line 339
    .line 340
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    goto :goto_8

    .line 345
    :cond_10
    const/4 v5, 0x0

    .line 346
    :goto_8
    const v11, 0xaba9500

    .line 347
    .line 348
    .line 349
    if-lt v5, v11, :cond_11

    .line 350
    .line 351
    const/16 v2, 0x400

    .line 352
    .line 353
    goto :goto_9

    .line 354
    :cond_11
    const v11, 0x7270e00

    .line 355
    .line 356
    .line 357
    if-lt v5, v11, :cond_12

    .line 358
    .line 359
    const/16 v2, 0x200

    .line 360
    .line 361
    goto :goto_9

    .line 362
    :cond_12
    const v11, 0x3938700

    .line 363
    .line 364
    .line 365
    if-lt v5, v11, :cond_13

    .line 366
    .line 367
    const/16 v2, 0x100

    .line 368
    .line 369
    goto :goto_9

    .line 370
    :cond_13
    const v11, 0x1c9c380

    .line 371
    .line 372
    .line 373
    if-lt v5, v11, :cond_14

    .line 374
    .line 375
    const/16 v2, 0x80

    .line 376
    .line 377
    goto :goto_9

    .line 378
    :cond_14
    const v11, 0x112a880

    .line 379
    .line 380
    .line 381
    if-lt v5, v11, :cond_15

    .line 382
    .line 383
    const/16 v2, 0x40

    .line 384
    .line 385
    goto :goto_9

    .line 386
    :cond_15
    const v11, 0xb71b00

    .line 387
    .line 388
    .line 389
    if-lt v5, v11, :cond_16

    .line 390
    .line 391
    const/16 v2, 0x20

    .line 392
    .line 393
    goto :goto_9

    .line 394
    :cond_16
    const v11, 0x6ddd00

    .line 395
    .line 396
    .line 397
    if-lt v5, v11, :cond_17

    .line 398
    .line 399
    const/16 v2, 0x10

    .line 400
    .line 401
    goto :goto_9

    .line 402
    :cond_17
    const v11, 0x36ee80

    .line 403
    .line 404
    .line 405
    if-lt v5, v11, :cond_18

    .line 406
    .line 407
    move v2, v6

    .line 408
    goto :goto_9

    .line 409
    :cond_18
    const v6, 0x1b7740

    .line 410
    .line 411
    .line 412
    if-lt v5, v6, :cond_19

    .line 413
    .line 414
    goto :goto_9

    .line 415
    :cond_19
    const v2, 0xc3500

    .line 416
    .line 417
    .line 418
    if-lt v5, v2, :cond_1a

    .line 419
    .line 420
    move v2, v9

    .line 421
    goto :goto_9

    .line 422
    :cond_1a
    const/4 v2, 0x1

    .line 423
    :goto_9
    new-instance v5, Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 424
    .line 425
    invoke-direct {v5}, Landroid/media/MediaCodecInfo$CodecProfileLevel;-><init>()V

    .line 426
    .line 427
    .line 428
    const/4 v6, 0x1

    .line 429
    iput v6, v5, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 430
    .line 431
    iput v2, v5, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    .line 432
    .line 433
    new-array v11, v6, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 434
    .line 435
    const/16 v16, 0x0

    .line 436
    .line 437
    aput-object v5, v11, v16

    .line 438
    .line 439
    :cond_1b
    array-length v2, v11

    .line 440
    const/4 v5, 0x0

    .line 441
    :goto_a
    if-ge v5, v2, :cond_1e

    .line 442
    .line 443
    aget-object v6, v11, v5

    .line 444
    .line 445
    iget v12, v6, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 446
    .line 447
    if-ne v12, v3, :cond_1c

    .line 448
    .line 449
    iget v6, v6, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    .line 450
    .line 451
    if-ge v6, v4, :cond_1d

    .line 452
    .line 453
    if-nez p2, :cond_1c

    .line 454
    .line 455
    goto :goto_c

    .line 456
    :cond_1c
    :goto_b
    const/16 v17, 0x1

    .line 457
    .line 458
    goto :goto_e

    .line 459
    :cond_1d
    :goto_c
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v6

    .line 463
    if-eqz v6, :cond_0

    .line 464
    .line 465
    if-ne v9, v3, :cond_0

    .line 466
    .line 467
    sget-object v6, LQ1/x;->b:Ljava/lang/String;

    .line 468
    .line 469
    const-string v12, "sailfish"

    .line 470
    .line 471
    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v12

    .line 475
    if-nez v12, :cond_1c

    .line 476
    .line 477
    const-string v12, "marlin"

    .line 478
    .line 479
    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v6

    .line 483
    if-eqz v6, :cond_0

    .line 484
    .line 485
    goto :goto_b

    .line 486
    :goto_d
    return v17

    .line 487
    :goto_e
    add-int/lit8 v5, v5, 0x1

    .line 488
    .line 489
    goto :goto_a

    .line 490
    :cond_1e
    new-instance v2, Ljava/lang/StringBuilder;

    .line 491
    .line 492
    const-string v3, "codec.profileLevel, "

    .line 493
    .line 494
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    iget-object v1, v1, LN1/n;->k:Ljava/lang/String;

    .line 498
    .line 499
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    const-string v1, ", "

    .line 503
    .line 504
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    invoke-virtual {v0, v1}, Ld2/m;->g(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    const/16 v16, 0x0

    .line 518
    .line 519
    return v16
.end method

.method public final d(LN1/n;)Z
    .locals 7

    .line 1
    iget-object v0, p1, LN1/n;->n:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Ld2/m;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-static {p1}, Ld2/v;->b(LN1/n;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v0, v3

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    move v0, v2

    .line 27
    :goto_1
    if-nez v0, :cond_2

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    invoke-virtual {p0, p1, v2}, Ld2/m;->c(LN1/n;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    :goto_2
    return v3

    .line 37
    :cond_3
    iget-boolean v0, p0, Ld2/m;->i:Z

    .line 38
    .line 39
    if-eqz v0, :cond_5

    .line 40
    .line 41
    iget v0, p1, LN1/n;->u:I

    .line 42
    .line 43
    if-lez v0, :cond_10

    .line 44
    .line 45
    iget v1, p1, LN1/n;->v:I

    .line 46
    .line 47
    if-gtz v1, :cond_4

    .line 48
    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_4
    iget p1, p1, LN1/n;->w:F

    .line 52
    .line 53
    float-to-double v2, p1

    .line 54
    invoke-virtual {p0, v0, v1, v2, v3}, Ld2/m;->f(IID)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    return p1

    .line 59
    :cond_5
    iget-object v0, p0, Ld2/m;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 60
    .line 61
    const/4 v4, -0x1

    .line 62
    iget v5, p1, LN1/n;->D:I

    .line 63
    .line 64
    if-eq v5, v4, :cond_8

    .line 65
    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    const-string p1, "sampleRate.caps"

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Ld2/m;->g(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return v3

    .line 74
    :cond_6
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getAudioCapabilities()Landroid/media/MediaCodecInfo$AudioCapabilities;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    if-nez v6, :cond_7

    .line 79
    .line 80
    const-string p1, "sampleRate.aCaps"

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Ld2/m;->g(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return v3

    .line 86
    :cond_7
    invoke-virtual {v6, v5}, Landroid/media/MediaCodecInfo$AudioCapabilities;->isSampleRateSupported(I)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-nez v6, :cond_8

    .line 91
    .line 92
    new-instance p1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v0, "sampleRate.support, "

    .line 95
    .line 96
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p0, p1}, Ld2/m;->g(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return v3

    .line 110
    :cond_8
    iget p1, p1, LN1/n;->C:I

    .line 111
    .line 112
    if-eq p1, v4, :cond_10

    .line 113
    .line 114
    if-nez v0, :cond_9

    .line 115
    .line 116
    const-string p1, "channelCount.caps"

    .line 117
    .line 118
    invoke-virtual {p0, p1}, Ld2/m;->g(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return v3

    .line 122
    :cond_9
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getAudioCapabilities()Landroid/media/MediaCodecInfo$AudioCapabilities;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    if-nez v0, :cond_a

    .line 127
    .line 128
    const-string p1, "channelCount.aCaps"

    .line 129
    .line 130
    invoke-virtual {p0, p1}, Ld2/m;->g(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return v3

    .line 134
    :cond_a
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo$AudioCapabilities;->getMaxInputChannelCount()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-gt v0, v2, :cond_f

    .line 139
    .line 140
    sget v4, LQ1/x;->a:I

    .line 141
    .line 142
    const/16 v5, 0x1a

    .line 143
    .line 144
    if-lt v4, v5, :cond_b

    .line 145
    .line 146
    if-lez v0, :cond_b

    .line 147
    .line 148
    goto/16 :goto_4

    .line 149
    .line 150
    :cond_b
    const-string v4, "audio/mpeg"

    .line 151
    .line 152
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-nez v4, :cond_f

    .line 157
    .line 158
    const-string v4, "audio/3gpp"

    .line 159
    .line 160
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-nez v4, :cond_f

    .line 165
    .line 166
    const-string v4, "audio/amr-wb"

    .line 167
    .line 168
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    if-nez v4, :cond_f

    .line 173
    .line 174
    const-string v4, "audio/mp4a-latm"

    .line 175
    .line 176
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-nez v4, :cond_f

    .line 181
    .line 182
    const-string v4, "audio/vorbis"

    .line 183
    .line 184
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-nez v4, :cond_f

    .line 189
    .line 190
    const-string v4, "audio/opus"

    .line 191
    .line 192
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    if-nez v4, :cond_f

    .line 197
    .line 198
    const-string v4, "audio/raw"

    .line 199
    .line 200
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    if-nez v4, :cond_f

    .line 205
    .line 206
    const-string v4, "audio/flac"

    .line 207
    .line 208
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    if-nez v4, :cond_f

    .line 213
    .line 214
    const-string v4, "audio/g711-alaw"

    .line 215
    .line 216
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-nez v4, :cond_f

    .line 221
    .line 222
    const-string v4, "audio/g711-mlaw"

    .line 223
    .line 224
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    if-nez v4, :cond_f

    .line 229
    .line 230
    const-string v4, "audio/gsm"

    .line 231
    .line 232
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    if-eqz v4, :cond_c

    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_c
    const-string v4, "audio/ac3"

    .line 240
    .line 241
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    if-eqz v4, :cond_d

    .line 246
    .line 247
    const/4 v1, 0x6

    .line 248
    goto :goto_3

    .line 249
    :cond_d
    const-string v4, "audio/eac3"

    .line 250
    .line 251
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-eqz v1, :cond_e

    .line 256
    .line 257
    const/16 v1, 0x10

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_e
    const/16 v1, 0x1e

    .line 261
    .line 262
    :goto_3
    new-instance v4, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    const-string v5, "AssumedMaxChannelAdjustment: "

    .line 265
    .line 266
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    iget-object v5, p0, Ld2/m;->a:Ljava/lang/String;

    .line 270
    .line 271
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    const-string v5, ", ["

    .line 275
    .line 276
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    const-string v0, " to "

    .line 283
    .line 284
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    const-string v0, "]"

    .line 291
    .line 292
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    const-string v4, "MediaCodecInfo"

    .line 300
    .line 301
    invoke-static {v4, v0}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    move v0, v1

    .line 305
    :cond_f
    :goto_4
    if-ge v0, p1, :cond_10

    .line 306
    .line 307
    new-instance v0, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    const-string v1, "channelCount.support, "

    .line 310
    .line 311
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    invoke-virtual {p0, p1}, Ld2/m;->g(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    return v3

    .line 325
    :cond_10
    :goto_5
    return v2
.end method

.method public final e(LN1/n;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ld2/m;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p1, p0, Ld2/m;->e:Z

    .line 6
    .line 7
    return p1

    .line 8
    :cond_0
    invoke-static {p1}, Ld2/v;->d(LN1/n;)Landroid/util/Pair;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/16 v0, 0x2a

    .line 23
    .line 24
    if-ne p1, v0, :cond_1

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    return p1

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    return p1
.end method

.method public final f(IID)Z
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Ld2/m;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    const-string p1, "sizeAndRate.caps"

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ld2/m;->g(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    invoke-virtual {v1}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    const-string p1, "sizeAndRate.vCaps"

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ld2/m;->g(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return v0

    .line 24
    :cond_1
    sget v2, LQ1/x;->a:I

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    const/16 v4, 0x1d

    .line 28
    .line 29
    const-string v5, "@"

    .line 30
    .line 31
    const-string v6, "x"

    .line 32
    .line 33
    if-lt v2, v4, :cond_e

    .line 34
    .line 35
    const/4 v7, 0x2

    .line 36
    if-lt v2, v4, :cond_b

    .line 37
    .line 38
    sget-object v4, Lic/d;->a:Ljava/lang/Boolean;

    .line 39
    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    goto/16 :goto_4

    .line 49
    .line 50
    :cond_2
    invoke-static {v1}, Lc5/a;->j(Landroid/media/MediaCodecInfo$VideoCapabilities;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    if-eqz v4, :cond_b

    .line 55
    .line 56
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_3

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_3
    invoke-static {}, Ld2/n;->e()V

    .line 64
    .line 65
    .line 66
    double-to-int v8, p3

    .line 67
    invoke-static {p1, p2, v8}, Ld2/n;->d(III)Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    move v9, v0

    .line 72
    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    if-ge v9, v10, :cond_5

    .line 77
    .line 78
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    invoke-static {v10}, Lc5/a;->g(Ljava/lang/Object;)Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    invoke-static {v10, v8}, Lc5/a;->A(Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;)Z

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    if-eqz v10, :cond_4

    .line 91
    .line 92
    move v4, v7

    .line 93
    goto :goto_1

    .line 94
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_5
    move v4, v3

    .line 98
    :goto_1
    if-ne v4, v3, :cond_c

    .line 99
    .line 100
    sget-object v8, Lic/d;->a:Ljava/lang/Boolean;

    .line 101
    .line 102
    if-nez v8, :cond_c

    .line 103
    .line 104
    const/16 v8, 0x23

    .line 105
    .line 106
    if-lt v2, v8, :cond_7

    .line 107
    .line 108
    :cond_6
    move v2, v0

    .line 109
    goto :goto_3

    .line 110
    :cond_7
    invoke-static {v0}, Lgc/b;->q(Z)I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    invoke-static {v3}, Lgc/b;->q(Z)I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-nez v2, :cond_9

    .line 119
    .line 120
    :cond_8
    :goto_2
    move v2, v3

    .line 121
    goto :goto_3

    .line 122
    :cond_9
    if-nez v8, :cond_a

    .line 123
    .line 124
    if-eq v2, v7, :cond_6

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_a
    if-ne v2, v7, :cond_8

    .line 128
    .line 129
    if-eq v8, v7, :cond_6

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    sput-object v8, Lic/d;->a:Ljava/lang/Boolean;

    .line 137
    .line 138
    if-eqz v2, :cond_c

    .line 139
    .line 140
    :cond_b
    :goto_4
    move v4, v0

    .line 141
    :cond_c
    if-ne v4, v7, :cond_d

    .line 142
    .line 143
    goto/16 :goto_6

    .line 144
    .line 145
    :cond_d
    if-ne v4, v3, :cond_e

    .line 146
    .line 147
    const-string v1, "sizeAndRate.cover, "

    .line 148
    .line 149
    invoke-static {v1, p1, v6, p2, v5}, LR8/v;->h(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p1, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-virtual {p0, p1}, Ld2/m;->g(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return v0

    .line 164
    :cond_e
    invoke-static {v1, p1, p2, p3, p4}, Ld2/m;->a(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-nez v2, :cond_12

    .line 169
    .line 170
    if-ge p1, p2, :cond_11

    .line 171
    .line 172
    const-string v2, "OMX.MTK.VIDEO.DECODER.HEVC"

    .line 173
    .line 174
    iget-object v4, p0, Ld2/m;->a:Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-eqz v2, :cond_f

    .line 181
    .line 182
    const-string v2, "mcv5a"

    .line 183
    .line 184
    sget-object v7, LQ1/x;->b:Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-eqz v2, :cond_f

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_f
    invoke-static {v1, p2, p1, p3, p4}, Ld2/m;->a(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-nez v1, :cond_10

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_10
    const-string v0, "sizeAndRate.rotated, "

    .line 201
    .line 202
    invoke-static {v0, p1, v6, p2, v5}, LR8/v;->h(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {p1, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    const-string p2, "AssumedSupport ["

    .line 214
    .line 215
    const-string p3, "] ["

    .line 216
    .line 217
    const-string p4, ", "

    .line 218
    .line 219
    invoke-static {p2, p1, p3, v4, p4}, LA7/p0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    iget-object p2, p0, Ld2/m;->b:Ljava/lang/String;

    .line 224
    .line 225
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    sget-object p2, LQ1/x;->e:Ljava/lang/String;

    .line 232
    .line 233
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    const-string p2, "]"

    .line 237
    .line 238
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    const-string p2, "MediaCodecInfo"

    .line 246
    .line 247
    invoke-static {p2, p1}, LQ1/k;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    return v3

    .line 251
    :cond_11
    :goto_5
    const-string v1, "sizeAndRate.support, "

    .line 252
    .line 253
    invoke-static {v1, p1, v6, p2, v5}, LR8/v;->h(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    invoke-virtual {p1, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-virtual {p0, p1}, Ld2/m;->g(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    return v0

    .line 268
    :cond_12
    :goto_6
    return v3
.end method

.method public final g(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "NoSupport ["

    .line 2
    .line 3
    const-string v1, "] ["

    .line 4
    .line 5
    invoke-static {v0, p1, v1}, Lcom/google/android/gms/internal/consent_sdk/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Ld2/m;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v0, ", "

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Ld2/m;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    sget-object v0, LQ1/x;->e:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v0, "]"

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v0, "MediaCodecInfo"

    .line 42
    .line 43
    invoke-static {v0, p1}, LQ1/k;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ld2/m;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
