.class public final LV5/n;
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


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZ)V
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
    iput-object p1, p0, LV5/n;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, LV5/n;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, LV5/n;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, LV5/n;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 14
    .line 15
    iput-boolean p5, p0, LV5/n;->g:Z

    .line 16
    .line 17
    iput-boolean p6, p0, LV5/n;->e:Z

    .line 18
    .line 19
    iput-boolean p7, p0, LV5/n;->f:Z

    .line 20
    .line 21
    invoke-static {p2}, Lu6/k;->i(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iput-boolean p1, p0, LV5/n;->h:Z

    .line 26
    .line 27
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
    invoke-static {p1, v0}, Lu6/v;->f(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    mul-int/2addr p1, v0

    .line 16
    invoke-static {p2, v1}, Lu6/v;->f(II)I

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

.method public static g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZ)LV5/n;
    .locals 8

    .line 1
    new-instance v0, LV5/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz p3, :cond_2

    .line 6
    .line 7
    sget v3, Lu6/v;->a:I

    .line 8
    .line 9
    const/16 v4, 0x13

    .line 10
    .line 11
    if-lt v3, v4, :cond_2

    .line 12
    .line 13
    const-string v4, "adaptive-playback"

    .line 14
    .line 15
    invoke-virtual {p3, v4}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_2

    .line 20
    .line 21
    const/16 v4, 0x16

    .line 22
    .line 23
    if-gt v3, v4, :cond_1

    .line 24
    .line 25
    sget-object v3, Lu6/v;->d:Ljava/lang/String;

    .line 26
    .line 27
    const-string v4, "ODROID-XU3"

    .line 28
    .line 29
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    const-string v4, "Nexus 10"

    .line 36
    .line 37
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    :cond_0
    const-string v3, "OMX.Exynos.AVC.Decoder"

    .line 44
    .line 45
    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_2

    .line 50
    .line 51
    const-string v3, "OMX.Exynos.AVC.Decoder.secure"

    .line 52
    .line 53
    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move v6, v2

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    :goto_0
    move v6, v1

    .line 63
    :goto_1
    const/16 v3, 0x15

    .line 64
    .line 65
    if-eqz p3, :cond_3

    .line 66
    .line 67
    sget v4, Lu6/v;->a:I

    .line 68
    .line 69
    if-lt v4, v3, :cond_3

    .line 70
    .line 71
    const-string v4, "tunneled-playback"

    .line 72
    .line 73
    invoke-virtual {p3, v4}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    :cond_3
    if-nez p5, :cond_5

    .line 78
    .line 79
    if-eqz p3, :cond_4

    .line 80
    .line 81
    sget p5, Lu6/v;->a:I

    .line 82
    .line 83
    if-lt p5, v3, :cond_4

    .line 84
    .line 85
    const-string p5, "secure-playback"

    .line 86
    .line 87
    invoke-virtual {p3, p5}, Landroid/media/MediaCodecInfo$CodecCapabilities;->isFeatureSupported(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result p5

    .line 91
    if-eqz p5, :cond_4

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    move v7, v1

    .line 95
    move-object v2, p1

    .line 96
    move-object v3, p2

    .line 97
    move-object v4, p3

    .line 98
    move v5, p4

    .line 99
    move-object v1, p0

    .line 100
    goto :goto_3

    .line 101
    :cond_5
    :goto_2
    move v7, v2

    .line 102
    move-object v1, p0

    .line 103
    move-object v3, p2

    .line 104
    move-object v4, p3

    .line 105
    move v5, p4

    .line 106
    move-object v2, p1

    .line 107
    :goto_3
    invoke-direct/range {v0 .. v7}, LV5/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZ)V

    .line 108
    .line 109
    .line 110
    return-object v0
.end method


# virtual methods
.method public final b(LE5/T;LE5/T;)LH5/i;
    .locals 8

    .line 1
    iget-object v0, p1, LE5/T;->l:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p2, LE5/T;->l:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/16 v0, 0x8

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    iget-boolean v1, p0, LV5/n;->h:Z

    .line 16
    .line 17
    if-eqz v1, :cond_9

    .line 18
    .line 19
    iget v1, p1, LE5/T;->t:I

    .line 20
    .line 21
    iget v2, p2, LE5/T;->t:I

    .line 22
    .line 23
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    or-int/lit16 v0, v0, 0x400

    .line 26
    .line 27
    :cond_1
    iget-boolean v1, p0, LV5/n;->e:Z

    .line 28
    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    iget v1, p1, LE5/T;->q:I

    .line 32
    .line 33
    iget v2, p2, LE5/T;->q:I

    .line 34
    .line 35
    if-ne v1, v2, :cond_2

    .line 36
    .line 37
    iget v1, p1, LE5/T;->r:I

    .line 38
    .line 39
    iget v2, p2, LE5/T;->r:I

    .line 40
    .line 41
    if-eq v1, v2, :cond_3

    .line 42
    .line 43
    :cond_2
    or-int/lit16 v0, v0, 0x200

    .line 44
    .line 45
    :cond_3
    iget-object v1, p1, LE5/T;->x:Lv6/b;

    .line 46
    .line 47
    iget-object v2, p2, LE5/T;->x:Lv6/b;

    .line 48
    .line 49
    invoke-static {v1, v2}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_4

    .line 54
    .line 55
    or-int/lit16 v0, v0, 0x800

    .line 56
    .line 57
    :cond_4
    sget-object v1, Lu6/v;->d:Ljava/lang/String;

    .line 58
    .line 59
    const-string v2, "SM-T230"

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_5

    .line 66
    .line 67
    const-string v1, "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"

    .line 68
    .line 69
    iget-object v2, p0, LV5/n;->a:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_5

    .line 76
    .line 77
    invoke-virtual {p1, p2}, LE5/T;->b(LE5/T;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_5

    .line 82
    .line 83
    or-int/lit8 v0, v0, 0x2

    .line 84
    .line 85
    :cond_5
    if-nez v0, :cond_7

    .line 86
    .line 87
    new-instance v1, LH5/i;

    .line 88
    .line 89
    invoke-virtual {p1, p2}, LE5/T;->b(LE5/T;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    const/4 v0, 0x3

    .line 96
    :goto_1
    move v5, v0

    .line 97
    goto :goto_2

    .line 98
    :cond_6
    const/4 v0, 0x2

    .line 99
    goto :goto_1

    .line 100
    :goto_2
    const/4 v6, 0x0

    .line 101
    iget-object v2, p0, LV5/n;->a:Ljava/lang/String;

    .line 102
    .line 103
    move-object v3, p1

    .line 104
    move-object v4, p2

    .line 105
    invoke-direct/range {v1 .. v6}, LH5/i;-><init>(Ljava/lang/String;LE5/T;LE5/T;II)V

    .line 106
    .line 107
    .line 108
    return-object v1

    .line 109
    :cond_7
    move-object v4, p1

    .line 110
    move-object v5, p2

    .line 111
    :cond_8
    move v7, v0

    .line 112
    goto/16 :goto_3

    .line 113
    .line 114
    :cond_9
    move-object v4, p1

    .line 115
    move-object v5, p2

    .line 116
    iget p1, v4, LE5/T;->y:I

    .line 117
    .line 118
    iget p2, v5, LE5/T;->y:I

    .line 119
    .line 120
    if-eq p1, p2, :cond_a

    .line 121
    .line 122
    or-int/lit16 v0, v0, 0x1000

    .line 123
    .line 124
    :cond_a
    iget p1, v4, LE5/T;->z:I

    .line 125
    .line 126
    iget p2, v5, LE5/T;->z:I

    .line 127
    .line 128
    if-eq p1, p2, :cond_b

    .line 129
    .line 130
    or-int/lit16 v0, v0, 0x2000

    .line 131
    .line 132
    :cond_b
    iget p1, v4, LE5/T;->A:I

    .line 133
    .line 134
    iget p2, v5, LE5/T;->A:I

    .line 135
    .line 136
    if-eq p1, p2, :cond_c

    .line 137
    .line 138
    or-int/lit16 v0, v0, 0x4000

    .line 139
    .line 140
    :cond_c
    iget-object p1, p0, LV5/n;->b:Ljava/lang/String;

    .line 141
    .line 142
    if-nez v0, :cond_d

    .line 143
    .line 144
    const-string p2, "audio/mp4a-latm"

    .line 145
    .line 146
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    if-eqz p2, :cond_d

    .line 151
    .line 152
    invoke-static {v4}, LV5/y;->d(LE5/T;)Landroid/util/Pair;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-static {v5}, LV5/y;->d(LE5/T;)Landroid/util/Pair;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    if-eqz p2, :cond_d

    .line 161
    .line 162
    if-eqz v1, :cond_d

    .line 163
    .line 164
    iget-object p2, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p2, Ljava/lang/Integer;

    .line 167
    .line 168
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v1, Ljava/lang/Integer;

    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    const/16 v2, 0x2a

    .line 181
    .line 182
    if-ne p2, v2, :cond_d

    .line 183
    .line 184
    if-ne v1, v2, :cond_d

    .line 185
    .line 186
    new-instance v2, LH5/i;

    .line 187
    .line 188
    const/4 v6, 0x3

    .line 189
    const/4 v7, 0x0

    .line 190
    iget-object v3, p0, LV5/n;->a:Ljava/lang/String;

    .line 191
    .line 192
    invoke-direct/range {v2 .. v7}, LH5/i;-><init>(Ljava/lang/String;LE5/T;LE5/T;II)V

    .line 193
    .line 194
    .line 195
    return-object v2

    .line 196
    :cond_d
    invoke-virtual {v4, v5}, LE5/T;->b(LE5/T;)Z

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    if-nez p2, :cond_e

    .line 201
    .line 202
    or-int/lit8 v0, v0, 0x20

    .line 203
    .line 204
    :cond_e
    const-string p2, "audio/opus"

    .line 205
    .line 206
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-eqz p1, :cond_f

    .line 211
    .line 212
    or-int/lit8 p1, v0, 0x2

    .line 213
    .line 214
    move v0, p1

    .line 215
    :cond_f
    if-nez v0, :cond_8

    .line 216
    .line 217
    new-instance v2, LH5/i;

    .line 218
    .line 219
    const/4 v6, 0x1

    .line 220
    const/4 v7, 0x0

    .line 221
    iget-object v3, p0, LV5/n;->a:Ljava/lang/String;

    .line 222
    .line 223
    invoke-direct/range {v2 .. v7}, LH5/i;-><init>(Ljava/lang/String;LE5/T;LE5/T;II)V

    .line 224
    .line 225
    .line 226
    return-object v2

    .line 227
    :goto_3
    new-instance v2, LH5/i;

    .line 228
    .line 229
    iget-object v3, p0, LV5/n;->a:Ljava/lang/String;

    .line 230
    .line 231
    const/4 v6, 0x0

    .line 232
    invoke-direct/range {v2 .. v7}, LH5/i;-><init>(Ljava/lang/String;LE5/T;LE5/T;II)V

    .line 233
    .line 234
    .line 235
    return-object v2
.end method

.method public final c(LE5/T;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, v1, LE5/T;->l:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v5, v0, LV5/n;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-nez v4, :cond_1

    .line 16
    .line 17
    invoke-static {v1}, LV5/y;->b(LE5/T;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return v2

    .line 29
    :cond_1
    :goto_0
    iget-object v4, v0, LV5/n;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 30
    .line 31
    iget-boolean v7, v0, LV5/n;->h:Z

    .line 32
    .line 33
    iget-object v8, v1, LE5/T;->i:Ljava/lang/String;

    .line 34
    .line 35
    if-nez v8, :cond_2

    .line 36
    .line 37
    :goto_1
    move/from16 v16, v2

    .line 38
    .line 39
    goto/16 :goto_6

    .line 40
    .line 41
    :cond_2
    invoke-static {v1}, LV5/y;->d(LE5/T;)Landroid/util/Pair;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    if-nez v9, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    iget-object v10, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v10, Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v10

    .line 56
    iget-object v9, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v9, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    const-string v11, "video/dolby-vision"

    .line 65
    .line 66
    iget-object v12, v1, LE5/T;->l:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    const-string v12, "video/hevc"

    .line 73
    .line 74
    const/16 v13, 0x8

    .line 75
    .line 76
    const/4 v14, 0x2

    .line 77
    if-eqz v11, :cond_5

    .line 78
    .line 79
    const-string v11, "video/avc"

    .line 80
    .line 81
    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v11

    .line 85
    if-eqz v11, :cond_4

    .line 86
    .line 87
    move v9, v2

    .line 88
    move v10, v13

    .line 89
    goto :goto_2

    .line 90
    :cond_4
    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    if-eqz v11, :cond_5

    .line 95
    .line 96
    move v9, v2

    .line 97
    move v10, v14

    .line 98
    :cond_5
    :goto_2
    if-nez v7, :cond_6

    .line 99
    .line 100
    const/16 v11, 0x2a

    .line 101
    .line 102
    if-eq v10, v11, :cond_6

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_6
    if-eqz v4, :cond_7

    .line 106
    .line 107
    iget-object v11, v4, Landroid/media/MediaCodecInfo$CodecCapabilities;->profileLevels:[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 108
    .line 109
    if-nez v11, :cond_8

    .line 110
    .line 111
    :cond_7
    new-array v11, v2, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 112
    .line 113
    :cond_8
    sget v15, Lu6/v;->a:I

    .line 114
    .line 115
    move/from16 v16, v2

    .line 116
    .line 117
    const/16 v2, 0x17

    .line 118
    .line 119
    if-gt v15, v2, :cond_14

    .line 120
    .line 121
    const-string v2, "video/x-vnd.on2.vp9"

    .line 122
    .line 123
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_14

    .line 128
    .line 129
    array-length v2, v11

    .line 130
    if-nez v2, :cond_14

    .line 131
    .line 132
    if-eqz v4, :cond_9

    .line 133
    .line 134
    invoke-virtual {v4}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    if-eqz v2, :cond_9

    .line 139
    .line 140
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getBitrateRange()Landroid/util/Range;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-virtual {v2}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    check-cast v2, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    goto :goto_3

    .line 155
    :cond_9
    move/from16 v2, v16

    .line 156
    .line 157
    :goto_3
    const v11, 0xaba9500

    .line 158
    .line 159
    .line 160
    if-lt v2, v11, :cond_a

    .line 161
    .line 162
    const/16 v13, 0x400

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_a
    const v11, 0x7270e00

    .line 166
    .line 167
    .line 168
    if-lt v2, v11, :cond_b

    .line 169
    .line 170
    const/16 v13, 0x200

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_b
    const v11, 0x3938700

    .line 174
    .line 175
    .line 176
    if-lt v2, v11, :cond_c

    .line 177
    .line 178
    const/16 v13, 0x100

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_c
    const v11, 0x1c9c380

    .line 182
    .line 183
    .line 184
    if-lt v2, v11, :cond_d

    .line 185
    .line 186
    const/16 v13, 0x80

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_d
    const v11, 0x112a880

    .line 190
    .line 191
    .line 192
    if-lt v2, v11, :cond_e

    .line 193
    .line 194
    const/16 v13, 0x40

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_e
    const v11, 0xb71b00

    .line 198
    .line 199
    .line 200
    if-lt v2, v11, :cond_f

    .line 201
    .line 202
    const/16 v13, 0x20

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_f
    const v11, 0x6ddd00

    .line 206
    .line 207
    .line 208
    if-lt v2, v11, :cond_10

    .line 209
    .line 210
    const/16 v13, 0x10

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_10
    const v11, 0x36ee80

    .line 214
    .line 215
    .line 216
    if-lt v2, v11, :cond_11

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_11
    const v11, 0x1b7740

    .line 220
    .line 221
    .line 222
    if-lt v2, v11, :cond_12

    .line 223
    .line 224
    const/4 v13, 0x4

    .line 225
    goto :goto_4

    .line 226
    :cond_12
    const v11, 0xc3500

    .line 227
    .line 228
    .line 229
    if-lt v2, v11, :cond_13

    .line 230
    .line 231
    move v13, v14

    .line 232
    goto :goto_4

    .line 233
    :cond_13
    move v13, v3

    .line 234
    :goto_4
    new-instance v2, Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 235
    .line 236
    invoke-direct {v2}, Landroid/media/MediaCodecInfo$CodecProfileLevel;-><init>()V

    .line 237
    .line 238
    .line 239
    iput v3, v2, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 240
    .line 241
    iput v13, v2, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    .line 242
    .line 243
    new-array v11, v3, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 244
    .line 245
    aput-object v2, v11, v16

    .line 246
    .line 247
    :cond_14
    array-length v2, v11

    .line 248
    move/from16 v13, v16

    .line 249
    .line 250
    :goto_5
    if-ge v13, v2, :cond_27

    .line 251
    .line 252
    aget-object v15, v11, v13

    .line 253
    .line 254
    iget v6, v15, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 255
    .line 256
    if-ne v6, v10, :cond_26

    .line 257
    .line 258
    iget v6, v15, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    .line 259
    .line 260
    if-lt v6, v9, :cond_26

    .line 261
    .line 262
    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v6

    .line 266
    if-eqz v6, :cond_15

    .line 267
    .line 268
    if-ne v14, v10, :cond_15

    .line 269
    .line 270
    sget-object v6, Lu6/v;->b:Ljava/lang/String;

    .line 271
    .line 272
    const-string v15, "sailfish"

    .line 273
    .line 274
    invoke-virtual {v15, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v15

    .line 278
    if-nez v15, :cond_26

    .line 279
    .line 280
    const-string v15, "marlin"

    .line 281
    .line 282
    invoke-virtual {v15, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    if-eqz v6, :cond_15

    .line 287
    .line 288
    goto/16 :goto_b

    .line 289
    .line 290
    :cond_15
    :goto_6
    const/16 v2, 0x15

    .line 291
    .line 292
    if-eqz v7, :cond_1a

    .line 293
    .line 294
    iget v4, v1, LE5/T;->q:I

    .line 295
    .line 296
    if-lez v4, :cond_25

    .line 297
    .line 298
    iget v5, v1, LE5/T;->r:I

    .line 299
    .line 300
    if-gtz v5, :cond_16

    .line 301
    .line 302
    goto/16 :goto_a

    .line 303
    .line 304
    :cond_16
    sget v6, Lu6/v;->a:I

    .line 305
    .line 306
    if-lt v6, v2, :cond_17

    .line 307
    .line 308
    iget v1, v1, LE5/T;->s:F

    .line 309
    .line 310
    float-to-double v1, v1

    .line 311
    invoke-virtual {v0, v4, v5, v1, v2}, LV5/n;->e(IID)Z

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    return v1

    .line 316
    :cond_17
    mul-int v1, v4, v5

    .line 317
    .line 318
    invoke-static {}, LV5/y;->i()I

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    if-gt v1, v2, :cond_18

    .line 323
    .line 324
    move v2, v3

    .line 325
    goto :goto_7

    .line 326
    :cond_18
    move/from16 v2, v16

    .line 327
    .line 328
    :goto_7
    if-nez v2, :cond_19

    .line 329
    .line 330
    new-instance v1, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    const-string v3, "legacyFrameSize, "

    .line 333
    .line 334
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    const-string v3, "x"

    .line 341
    .line 342
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    invoke-virtual {v0, v1}, LV5/n;->f(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    :cond_19
    return v2

    .line 356
    :cond_1a
    sget v6, Lu6/v;->a:I

    .line 357
    .line 358
    if-lt v6, v2, :cond_25

    .line 359
    .line 360
    const/4 v2, -0x1

    .line 361
    iget v7, v1, LE5/T;->z:I

    .line 362
    .line 363
    if-eq v7, v2, :cond_1d

    .line 364
    .line 365
    if-nez v4, :cond_1b

    .line 366
    .line 367
    const-string v1, "sampleRate.caps"

    .line 368
    .line 369
    invoke-virtual {v0, v1}, LV5/n;->f(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    return v16

    .line 373
    :cond_1b
    invoke-virtual {v4}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getAudioCapabilities()Landroid/media/MediaCodecInfo$AudioCapabilities;

    .line 374
    .line 375
    .line 376
    move-result-object v8

    .line 377
    if-nez v8, :cond_1c

    .line 378
    .line 379
    const-string v1, "sampleRate.aCaps"

    .line 380
    .line 381
    invoke-virtual {v0, v1}, LV5/n;->f(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    return v16

    .line 385
    :cond_1c
    invoke-virtual {v8, v7}, Landroid/media/MediaCodecInfo$AudioCapabilities;->isSampleRateSupported(I)Z

    .line 386
    .line 387
    .line 388
    move-result v8

    .line 389
    if-nez v8, :cond_1d

    .line 390
    .line 391
    new-instance v1, Ljava/lang/StringBuilder;

    .line 392
    .line 393
    const-string v2, "sampleRate.support, "

    .line 394
    .line 395
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    invoke-virtual {v0, v1}, LV5/n;->f(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    return v16

    .line 409
    :cond_1d
    iget v1, v1, LE5/T;->y:I

    .line 410
    .line 411
    if-eq v1, v2, :cond_25

    .line 412
    .line 413
    if-nez v4, :cond_1e

    .line 414
    .line 415
    const-string v1, "channelCount.caps"

    .line 416
    .line 417
    invoke-virtual {v0, v1}, LV5/n;->f(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    return v16

    .line 421
    :cond_1e
    invoke-virtual {v4}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getAudioCapabilities()Landroid/media/MediaCodecInfo$AudioCapabilities;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    if-nez v2, :cond_1f

    .line 426
    .line 427
    const-string v1, "channelCount.aCaps"

    .line 428
    .line 429
    invoke-virtual {v0, v1}, LV5/n;->f(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    return v16

    .line 433
    :cond_1f
    invoke-virtual {v2}, Landroid/media/MediaCodecInfo$AudioCapabilities;->getMaxInputChannelCount()I

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    if-gt v2, v3, :cond_24

    .line 438
    .line 439
    const/16 v4, 0x1a

    .line 440
    .line 441
    if-lt v6, v4, :cond_20

    .line 442
    .line 443
    if-lez v2, :cond_20

    .line 444
    .line 445
    goto/16 :goto_9

    .line 446
    .line 447
    :cond_20
    const-string v4, "audio/mpeg"

    .line 448
    .line 449
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v4

    .line 453
    if-nez v4, :cond_24

    .line 454
    .line 455
    const-string v4, "audio/3gpp"

    .line 456
    .line 457
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v4

    .line 461
    if-nez v4, :cond_24

    .line 462
    .line 463
    const-string v4, "audio/amr-wb"

    .line 464
    .line 465
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v4

    .line 469
    if-nez v4, :cond_24

    .line 470
    .line 471
    const-string v4, "audio/mp4a-latm"

    .line 472
    .line 473
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result v4

    .line 477
    if-nez v4, :cond_24

    .line 478
    .line 479
    const-string v4, "audio/vorbis"

    .line 480
    .line 481
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    move-result v4

    .line 485
    if-nez v4, :cond_24

    .line 486
    .line 487
    const-string v4, "audio/opus"

    .line 488
    .line 489
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v4

    .line 493
    if-nez v4, :cond_24

    .line 494
    .line 495
    const-string v4, "audio/raw"

    .line 496
    .line 497
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v4

    .line 501
    if-nez v4, :cond_24

    .line 502
    .line 503
    const-string v4, "audio/flac"

    .line 504
    .line 505
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v4

    .line 509
    if-nez v4, :cond_24

    .line 510
    .line 511
    const-string v4, "audio/g711-alaw"

    .line 512
    .line 513
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    move-result v4

    .line 517
    if-nez v4, :cond_24

    .line 518
    .line 519
    const-string v4, "audio/g711-mlaw"

    .line 520
    .line 521
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    move-result v4

    .line 525
    if-nez v4, :cond_24

    .line 526
    .line 527
    const-string v4, "audio/gsm"

    .line 528
    .line 529
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result v4

    .line 533
    if-eqz v4, :cond_21

    .line 534
    .line 535
    goto :goto_9

    .line 536
    :cond_21
    const-string v4, "audio/ac3"

    .line 537
    .line 538
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-result v4

    .line 542
    if-eqz v4, :cond_22

    .line 543
    .line 544
    const/4 v6, 0x6

    .line 545
    goto :goto_8

    .line 546
    :cond_22
    const-string v4, "audio/eac3"

    .line 547
    .line 548
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    move-result v4

    .line 552
    if-eqz v4, :cond_23

    .line 553
    .line 554
    const/16 v6, 0x10

    .line 555
    .line 556
    goto :goto_8

    .line 557
    :cond_23
    const/16 v6, 0x1e

    .line 558
    .line 559
    :goto_8
    new-instance v4, Ljava/lang/StringBuilder;

    .line 560
    .line 561
    const-string v5, "AssumedMaxChannelAdjustment: "

    .line 562
    .line 563
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    iget-object v5, v0, LV5/n;->a:Ljava/lang/String;

    .line 567
    .line 568
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    const-string v5, ", ["

    .line 572
    .line 573
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    const-string v2, " to "

    .line 580
    .line 581
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    const-string v2, "]"

    .line 588
    .line 589
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    const-string v4, "MediaCodecInfo"

    .line 597
    .line 598
    invoke-static {v4, v2}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    move v2, v6

    .line 602
    :cond_24
    :goto_9
    if-ge v2, v1, :cond_25

    .line 603
    .line 604
    new-instance v2, Ljava/lang/StringBuilder;

    .line 605
    .line 606
    const-string v3, "channelCount.support, "

    .line 607
    .line 608
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    invoke-virtual {v0, v1}, LV5/n;->f(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    return v16

    .line 622
    :cond_25
    :goto_a
    return v3

    .line 623
    :cond_26
    :goto_b
    add-int/2addr v13, v3

    .line 624
    goto/16 :goto_5

    .line 625
    .line 626
    :cond_27
    const-string v1, "codec.profileLevel, "

    .line 627
    .line 628
    const-string v2, ", "

    .line 629
    .line 630
    invoke-static {v1, v8, v2}, Lcom/google/android/gms/internal/consent_sdk/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    iget-object v2, v0, LV5/n;->c:Ljava/lang/String;

    .line 635
    .line 636
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    invoke-virtual {v0, v1}, LV5/n;->f(Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    return v16
.end method

.method public final d(LE5/T;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LV5/n;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p1, p0, LV5/n;->e:Z

    .line 6
    .line 7
    return p1

    .line 8
    :cond_0
    invoke-static {p1}, LV5/y;->d(LE5/T;)Landroid/util/Pair;

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

.method public final e(IID)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LV5/n;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    const-string p1, "sizeAndRate.caps"

    .line 7
    .line 8
    invoke-virtual {p0, p1}, LV5/n;->f(Ljava/lang/String;)V

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
    invoke-virtual {p0, p1}, LV5/n;->f(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return v0

    .line 24
    :cond_1
    sget v2, Lu6/v;->a:I

    .line 25
    .line 26
    const/16 v3, 0x1d

    .line 27
    .line 28
    const-string v4, "@"

    .line 29
    .line 30
    const-string v5, "x"

    .line 31
    .line 32
    const/4 v6, 0x1

    .line 33
    if-lt v2, v3, :cond_3

    .line 34
    .line 35
    invoke-static {v1, p1, p2, p3, p4}, LV5/m;->a(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/4 v3, 0x2

    .line 40
    if-ne v2, v3, :cond_2

    .line 41
    .line 42
    return v6

    .line 43
    :cond_2
    if-ne v2, v6, :cond_3

    .line 44
    .line 45
    const-string v1, "sizeAndRate.cover, "

    .line 46
    .line 47
    invoke-static {v1, p1, v5, p2, v4}, LR8/v;->h(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p0, p1}, LV5/n;->f(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return v0

    .line 62
    :cond_3
    invoke-static {v1, p1, p2, p3, p4}, LV5/n;->a(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-nez v2, :cond_7

    .line 67
    .line 68
    if-ge p1, p2, :cond_6

    .line 69
    .line 70
    const-string v2, "OMX.MTK.VIDEO.DECODER.HEVC"

    .line 71
    .line 72
    iget-object v3, p0, LV5/n;->a:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    const-string v2, "mcv5a"

    .line 81
    .line 82
    sget-object v7, Lu6/v;->b:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_4

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    invoke-static {v1, p2, p1, p3, p4}, LV5/n;->a(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_5

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_5
    const-string v0, "sizeAndRate.rotated, "

    .line 99
    .line 100
    invoke-static {v0, p1, v5, p2, v4}, LR8/v;->h(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    const-string p2, "AssumedSupport ["

    .line 112
    .line 113
    const-string p3, "] ["

    .line 114
    .line 115
    const-string p4, ", "

    .line 116
    .line 117
    invoke-static {p2, p1, p3, v3, p4}, LA7/p0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iget-object p2, p0, LV5/n;->b:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    sget-object p2, Lu6/v;->e:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string p2, "]"

    .line 135
    .line 136
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    const-string p2, "MediaCodecInfo"

    .line 144
    .line 145
    invoke-static {p2, p1}, Lu6/a;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_6
    :goto_0
    const-string v1, "sizeAndRate.support, "

    .line 150
    .line 151
    invoke-static {v1, p1, v5, p2, v4}, LR8/v;->h(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p1, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {p0, p1}, LV5/n;->f(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return v0

    .line 166
    :cond_7
    :goto_1
    return v6
.end method

.method public final f(Ljava/lang/String;)V
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
    iget-object v0, p0, LV5/n;->a:Ljava/lang/String;

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
    iget-object v0, p0, LV5/n;->b:Ljava/lang/String;

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
    sget-object v0, Lu6/v;->e:Ljava/lang/String;

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
    invoke-static {v0, p1}, Lu6/a;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LV5/n;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
