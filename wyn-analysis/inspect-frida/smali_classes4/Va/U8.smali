.class public final LVa/U8;
.super LVa/y8;
.source "SourceFile"


# static fields
.field public static final f:[B


# instance fields
.field public final d:Ljava/lang/Object;

.field public final synthetic e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, LVa/U8;->f:[B

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 1
        0x39t
        -0x60t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LVa/U8;->e:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LVa/U8;->d:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public static f(SIIIB)Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, LVa/pb;->J:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    add-int/lit8 p2, p2, 0x2d

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-ne p2, v2, :cond_0

    .line 15
    .line 16
    move v3, v4

    .line 17
    :cond_0
    if-eqz v3, :cond_1

    .line 18
    .line 19
    sget-object p2, LVa/U8;->f:[B

    .line 20
    .line 21
    const v2, -0x754de26f

    .line 22
    .line 23
    .line 24
    add-int/2addr v2, p3

    .line 25
    aget-byte p2, p2, v2

    .line 26
    .line 27
    add-int/lit8 p2, p2, 0x2d

    .line 28
    .line 29
    int-to-byte p2, p2

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    :goto_0
    if-lez p2, :cond_2

    .line 34
    .line 35
    add-int/2addr p3, p2

    .line 36
    const v2, 0x754de271

    .line 37
    .line 38
    .line 39
    sub-int/2addr p3, v2

    .line 40
    add-int/2addr p3, v3

    .line 41
    sput p3, LVa/pb;->F:I

    .line 42
    .line 43
    sput-byte p4, LVa/pb;->G:B

    .line 44
    .line 45
    const p3, 0x20c12e9e

    .line 46
    .line 47
    .line 48
    add-int/2addr p1, p3

    .line 49
    int-to-char p1, p1

    .line 50
    sput-char p1, LVa/pb;->H:C

    .line 51
    .line 52
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    sget-char p1, LVa/pb;->H:C

    .line 56
    .line 57
    sput-char p1, LVa/pb;->I:C

    .line 58
    .line 59
    sput v4, LVa/pb;->E:I

    .line 60
    .line 61
    :goto_1
    sget p1, LVa/pb;->E:I

    .line 62
    .line 63
    if-ge p1, p2, :cond_2

    .line 64
    .line 65
    sget-object p1, LVa/U8;->f:[B

    .line 66
    .line 67
    sget p3, LVa/pb;->F:I

    .line 68
    .line 69
    add-int/lit8 p4, p3, -0x1

    .line 70
    .line 71
    sput p4, LVa/pb;->F:I

    .line 72
    .line 73
    aget-byte p1, p1, p3

    .line 74
    .line 75
    sget-char p3, LVa/pb;->I:C

    .line 76
    .line 77
    add-int/2addr p1, p0

    .line 78
    int-to-byte p1, p1

    .line 79
    sget-byte p4, LVa/pb;->G:B

    .line 80
    .line 81
    xor-int/2addr p1, p4

    .line 82
    add-int/2addr p3, p1

    .line 83
    int-to-char p1, p3

    .line 84
    sput-char p1, LVa/pb;->H:C

    .line 85
    .line 86
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    sget-char p1, LVa/pb;->H:C

    .line 90
    .line 91
    sput-char p1, LVa/pb;->I:C

    .line 92
    .line 93
    sget p1, LVa/pb;->E:I

    .line 94
    .line 95
    add-int/2addr p1, v4

    .line 96
    sput p1, LVa/pb;->E:I

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    return-object p0

    .line 105
    :goto_2
    monitor-exit v0

    .line 106
    throw p0
.end method


# virtual methods
.method public final b(LVa/x8;LVa/y7;)LVa/s8;
    .locals 0

    .line 1
    new-instance p1, LVa/s8;

    .line 2
    .line 3
    iget-object p2, p0, LVa/U8;->d:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p1, p2}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final e()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LVa/U8;->d:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    check-cast p1, LVa/U8;

    .line 20
    .line 21
    iget-object p1, p1, LVa/U8;->d:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v2, p0, LVa/U8;->d:Ljava/lang/Object;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1

    .line 32
    :cond_2
    if-nez p1, :cond_3

    .line 33
    .line 34
    return v0

    .line 35
    :cond_3
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LVa/U8;->d:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LVa/U8;->e:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, LVa/U8;->e()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    return-object v1

    .line 13
    :pswitch_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    add-int/lit8 v3, v3, -0x74

    .line 24
    .line 25
    int-to-short v3, v3

    .line 26
    const v4, -0x20c12e7c

    .line 27
    .line 28
    .line 29
    invoke-static {v2, v2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    sub-int/2addr v4, v5

    .line 34
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    shr-int/lit8 v5, v5, 0x18

    .line 39
    .line 40
    rsub-int/lit8 v5, v5, -0x2c

    .line 41
    .line 42
    const-string v6, ""

    .line 43
    .line 44
    const/16 v7, 0x30

    .line 45
    .line 46
    invoke-static {v6, v7, v2, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    const v9, 0x754de26e

    .line 51
    .line 52
    .line 53
    sub-int v8, v9, v8

    .line 54
    .line 55
    invoke-static {v2, v2}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    int-to-byte v10, v10

    .line 60
    invoke-static {v3, v4, v5, v8, v10}, LVa/U8;->f(SIIIB)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, LVa/U8;->e()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-static {v6, v7}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    rsub-int/lit8 v4, v4, -0x47

    .line 80
    .line 81
    int-to-short v4, v4

    .line 82
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    const v8, -0x20c12e42

    .line 87
    .line 88
    .line 89
    sub-int v5, v8, v5

    .line 90
    .line 91
    invoke-static {v2}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 92
    .line 93
    .line 94
    move-result-wide v10

    .line 95
    const-wide/16 v12, 0x0

    .line 96
    .line 97
    cmp-long v10, v10, v12

    .line 98
    .line 99
    rsub-int/lit8 v10, v10, -0x2c

    .line 100
    .line 101
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    shr-int/lit8 v11, v11, 0x16

    .line 106
    .line 107
    const v14, 0x754de26f

    .line 108
    .line 109
    .line 110
    sub-int v11, v14, v11

    .line 111
    .line 112
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 113
    .line 114
    .line 115
    move-result v15

    .line 116
    shr-int/lit8 v15, v15, 0x18

    .line 117
    .line 118
    int-to-byte v15, v15

    .line 119
    invoke-static {v4, v5, v10, v11, v15}, LVa/U8;->f(SIIIB)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    shr-int/lit8 v5, v5, 0x10

    .line 132
    .line 133
    add-int/lit8 v5, v5, -0x39

    .line 134
    .line 135
    int-to-short v5, v5

    .line 136
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    shr-int/lit8 v10, v10, 0x10

    .line 141
    .line 142
    add-int/2addr v10, v8

    .line 143
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 144
    .line 145
    .line 146
    move-result v11

    .line 147
    int-to-byte v11, v11

    .line 148
    rsub-int/lit8 v11, v11, -0x2c

    .line 149
    .line 150
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 151
    .line 152
    .line 153
    move-result v15

    .line 154
    shr-int/lit8 v15, v15, 0x16

    .line 155
    .line 156
    sub-int v15, v14, v15

    .line 157
    .line 158
    invoke-static {v2, v2}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 159
    .line 160
    .line 161
    move-result-wide v16

    .line 162
    cmp-long v16, v16, v12

    .line 163
    .line 164
    move/from16 v17, v7

    .line 165
    .line 166
    rsub-int/lit8 v7, v16, -0x1

    .line 167
    .line 168
    int-to-byte v7, v7

    .line 169
    invoke-static {v5, v10, v11, v15, v7}, LVa/U8;->f(SIIIB)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    shr-int/lit8 v4, v4, 0x10

    .line 186
    .line 187
    add-int/lit8 v4, v4, -0x74

    .line 188
    .line 189
    int-to-short v4, v4

    .line 190
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 191
    .line 192
    .line 193
    move-result-wide v10

    .line 194
    cmp-long v5, v10, v12

    .line 195
    .line 196
    const v7, -0x20c12e7b

    .line 197
    .line 198
    .line 199
    sub-int/2addr v7, v5

    .line 200
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    const/4 v10, 0x0

    .line 205
    cmpl-float v5, v5, v10

    .line 206
    .line 207
    add-int/lit8 v5, v5, -0x2d

    .line 208
    .line 209
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 210
    .line 211
    .line 212
    move-result-wide v11

    .line 213
    const-wide/16 v15, -0x1

    .line 214
    .line 215
    cmp-long v11, v11, v15

    .line 216
    .line 217
    add-int/2addr v11, v9

    .line 218
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 219
    .line 220
    .line 221
    move-result v9

    .line 222
    shr-int/lit8 v9, v9, 0x10

    .line 223
    .line 224
    int-to-byte v9, v9

    .line 225
    invoke-static {v4, v7, v5, v11, v9}, LVa/U8;->f(SIIIB)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    invoke-static {v10, v10}, Landroid/graphics/PointF;->length(FF)F

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    cmpl-float v5, v5, v10

    .line 238
    .line 239
    rsub-int/lit8 v5, v5, 0x26

    .line 240
    .line 241
    int-to-short v5, v5

    .line 242
    invoke-static {v2, v2}, Landroid/view/View;->resolveSize(II)I

    .line 243
    .line 244
    .line 245
    move-result v7

    .line 246
    add-int/2addr v7, v8

    .line 247
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 248
    .line 249
    .line 250
    move-result v8

    .line 251
    shr-int/lit8 v8, v8, 0x10

    .line 252
    .line 253
    rsub-int/lit8 v8, v8, -0x2b

    .line 254
    .line 255
    const v9, 0x754de270

    .line 256
    .line 257
    .line 258
    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    .line 259
    .line 260
    .line 261
    move-result v10

    .line 262
    add-int/2addr v10, v9

    .line 263
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 264
    .line 265
    .line 266
    move-result v9

    .line 267
    int-to-byte v9, v9

    .line 268
    invoke-static {v5, v7, v8, v10, v9}, LVa/U8;->f(SIIIB)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    rsub-int/lit8 v2, v2, -0x74

    .line 288
    .line 289
    int-to-short v2, v2

    .line 290
    const v3, -0x20c12e4c

    .line 291
    .line 292
    .line 293
    invoke-static/range {v17 .. v17}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    sub-int/2addr v3, v4

    .line 298
    invoke-static {v6}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 299
    .line 300
    .line 301
    move-result v4

    .line 302
    add-int/lit8 v4, v4, -0x2b

    .line 303
    .line 304
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 305
    .line 306
    .line 307
    move-result v5

    .line 308
    shr-int/lit8 v5, v5, 0x18

    .line 309
    .line 310
    add-int/2addr v5, v14

    .line 311
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 312
    .line 313
    .line 314
    move-result-wide v6

    .line 315
    cmp-long v6, v6, v15

    .line 316
    .line 317
    add-int/lit8 v6, v6, -0x1

    .line 318
    .line 319
    int-to-byte v6, v6

    .line 320
    invoke-static {v2, v3, v4, v5, v6}, LVa/U8;->f(SIIIB)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    return-object v1

    .line 336
    nop

    .line 337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
