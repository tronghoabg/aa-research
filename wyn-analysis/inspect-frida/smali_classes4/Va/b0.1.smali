.class public final enum LVa/b0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:LVa/b0;

.field public static final enum b:LVa/b0;

.field public static final enum c:LVa/b0;

.field public static final enum d:LVa/b0;

.field public static final enum e:LVa/b0;

.field public static final enum f:LVa/b0;

.field public static final synthetic g:[LVa/b0;

.field public static h:I = 0x0

.field public static i:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    const/4 v0, 0x5

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x6

    .line 4
    const/4 v3, 0x1

    .line 5
    const/4 v4, 0x3

    .line 6
    const/4 v5, 0x4

    .line 7
    const/4 v6, 0x0

    .line 8
    new-instance v7, LVa/b0;

    .line 9
    .line 10
    invoke-static {v6, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 11
    .line 12
    .line 13
    move-result v8

    .line 14
    add-int/2addr v8, v5

    .line 15
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 16
    .line 17
    .line 18
    move-result v9

    .line 19
    shr-int/lit8 v9, v9, 0x10

    .line 20
    .line 21
    add-int/lit16 v9, v9, 0x105

    .line 22
    .line 23
    invoke-static {v6}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 24
    .line 25
    .line 26
    move-result v10

    .line 27
    add-int/2addr v10, v4

    .line 28
    const-string v11, "\u0002\ufff9\u0002\u0003"

    .line 29
    .line 30
    invoke-static {v11, v8, v9, v10, v6}, LVa/b0;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-direct {v7, v8, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    sput-object v7, LVa/b0;->a:LVa/b0;

    .line 42
    .line 43
    new-instance v8, LVa/b0;

    .line 44
    .line 45
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    shr-int/lit8 v9, v9, 0x10

    .line 50
    .line 51
    rsub-int/lit8 v9, v9, 0x14

    .line 52
    .line 53
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    const/4 v11, 0x0

    .line 58
    cmpl-float v10, v10, v11

    .line 59
    .line 60
    rsub-int v10, v10, 0x106

    .line 61
    .line 62
    const-string v11, ""

    .line 63
    .line 64
    invoke-static {v11, v6}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    rsub-int/lit8 v12, v12, 0x10

    .line 69
    .line 70
    const-string v13, "\u0008\u0004\ufff8\u0005\u0012\u0007\u0001\ufff8\ufffa\ufff4\u0012\u0005\ufff8\n\ufff8\u0001\ufff7\ufff8\u0005\ufffc"

    .line 71
    .line 72
    invoke-static {v13, v9, v10, v12, v3}, LVa/b0;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    invoke-direct {v8, v9, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 81
    .line 82
    .line 83
    sput-object v8, LVa/b0;->b:LVa/b0;

    .line 84
    .line 85
    new-instance v9, LVa/b0;

    .line 86
    .line 87
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 88
    .line 89
    .line 90
    move-result-wide v12

    .line 91
    const-wide/16 v14, -0x1

    .line 92
    .line 93
    cmp-long v10, v12, v14

    .line 94
    .line 95
    add-int/lit8 v10, v10, 0x16

    .line 96
    .line 97
    invoke-static {v6, v6, v6, v6}, Landroid/graphics/Color;->argb(IIII)I

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    add-int/lit16 v12, v12, 0x108

    .line 102
    .line 103
    const/16 v13, 0x30

    .line 104
    .line 105
    invoke-static {v11, v13, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 106
    .line 107
    .line 108
    move-result v14

    .line 109
    rsub-int/lit8 v14, v14, 0x6

    .line 110
    .line 111
    const-string v15, "\u0000\u0001\u0001\u0006\u0004\uffff\u0006\uffff\u0000\ufffa\u0004\u0003\ufff6\u0007\u0010\ufffc\ufff5\u0004\u0010\ufff5\ufff6\u0005\u0003"

    .line 112
    .line 113
    invoke-static {v15, v10, v12, v14, v3}, LVa/b0;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    invoke-direct {v9, v10, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 122
    .line 123
    .line 124
    sput-object v9, LVa/b0;->c:LVa/b0;

    .line 125
    .line 126
    new-instance v10, LVa/b0;

    .line 127
    .line 128
    invoke-static {v6, v6}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 129
    .line 130
    .line 131
    move-result-wide v14

    .line 132
    const-wide/16 v16, 0x0

    .line 133
    .line 134
    cmp-long v12, v14, v16

    .line 135
    .line 136
    add-int/lit8 v12, v12, 0x16

    .line 137
    .line 138
    invoke-static {v11, v11, v6, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 139
    .line 140
    .line 141
    move-result v14

    .line 142
    add-int/lit16 v14, v14, 0x104

    .line 143
    .line 144
    invoke-static {v6}, Landroid/graphics/Color;->alpha(I)I

    .line 145
    .line 146
    .line 147
    move-result v15

    .line 148
    rsub-int/lit8 v15, v15, 0x8

    .line 149
    .line 150
    move/from16 v18, v1

    .line 151
    .line 152
    const-string v1, "\u0003\u0014\ufffb\ufff6\ufffe\u0001\ufffa\ufff9\ufffe\u0003\ufffe\t\ufffe\ufff6\u0001\ufffe\u000f\ufff6\t\ufffe\u0004"

    .line 153
    .line 154
    invoke-static {v1, v12, v14, v15, v6}, LVa/b0;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-direct {v10, v1, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 163
    .line 164
    .line 165
    sput-object v10, LVa/b0;->d:LVa/b0;

    .line 166
    .line 167
    new-instance v1, LVa/b0;

    .line 168
    .line 169
    invoke-static {v6}, Landroid/os/Process;->getThreadPriority(I)I

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    add-int/lit8 v12, v12, 0x14

    .line 174
    .line 175
    shr-int/2addr v12, v2

    .line 176
    rsub-int/lit8 v12, v12, 0x1a

    .line 177
    .line 178
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 179
    .line 180
    .line 181
    move-result v14

    .line 182
    shr-int/lit8 v14, v14, 0x8

    .line 183
    .line 184
    rsub-int v14, v14, 0x105

    .line 185
    .line 186
    invoke-static {v11, v13, v6}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    rsub-int/lit8 v11, v11, 0x3

    .line 191
    .line 192
    const-string v13, "\u0000\ufffd\ufff5\ufffa\u0006\u0003\u0008\ufff7\ufff9\u0002\u0002\u0003\ufff7\u0013\ufff9\u0008\ufff5\ufff9\u0006\ufff7\u0013\u0003\u0008\u0013\ufff8\ufff9"

    .line 193
    .line 194
    invoke-static {v13, v12, v14, v11, v3}, LVa/b0;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v11

    .line 198
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v11

    .line 202
    invoke-direct {v1, v11, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 203
    .line 204
    .line 205
    sput-object v1, LVa/b0;->e:LVa/b0;

    .line 206
    .line 207
    new-instance v11, LVa/b0;

    .line 208
    .line 209
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 210
    .line 211
    .line 212
    move-result-wide v12

    .line 213
    cmp-long v12, v12, v16

    .line 214
    .line 215
    rsub-int/lit8 v12, v12, 0x8

    .line 216
    .line 217
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 218
    .line 219
    .line 220
    move-result v13

    .line 221
    shr-int/lit8 v13, v13, 0x10

    .line 222
    .line 223
    rsub-int v13, v13, 0x109

    .line 224
    .line 225
    invoke-static {v6}, Landroid/os/Process;->getThreadPriority(I)I

    .line 226
    .line 227
    .line 228
    move-result v14

    .line 229
    add-int/lit8 v14, v14, 0x14

    .line 230
    .line 231
    shr-int/2addr v14, v2

    .line 232
    add-int/2addr v14, v5

    .line 233
    const-string v15, "\ufffe\uffff\u0007\ufffe\u0005\ufffe\ufffb"

    .line 234
    .line 235
    invoke-static {v15, v12, v13, v14, v6}, LVa/b0;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v12

    .line 239
    invoke-virtual {v12}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v12

    .line 243
    invoke-direct {v11, v12, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 244
    .line 245
    .line 246
    sput-object v11, LVa/b0;->f:LVa/b0;

    .line 247
    .line 248
    new-array v2, v2, [LVa/b0;

    .line 249
    .line 250
    aput-object v7, v2, v6

    .line 251
    .line 252
    aput-object v8, v2, v3

    .line 253
    .line 254
    aput-object v9, v2, v18

    .line 255
    .line 256
    aput-object v10, v2, v4

    .line 257
    .line 258
    aput-object v1, v2, v5

    .line 259
    .line 260
    aput-object v11, v2, v0

    .line 261
    .line 262
    sput-object v2, LVa/b0;->g:[LVa/b0;

    .line 263
    .line 264
    sget v0, LVa/b0;->i:I

    .line 265
    .line 266
    add-int/lit8 v0, v0, 0x7

    .line 267
    .line 268
    rem-int/lit16 v1, v0, 0x80

    .line 269
    .line 270
    sput v1, LVa/b0;->h:I

    .line 271
    .line 272
    rem-int/lit8 v0, v0, 0x2

    .line 273
    .line 274
    if-nez v0, :cond_0

    .line 275
    .line 276
    return-void

    .line 277
    :cond_0
    const/4 v0, 0x0

    .line 278
    throw v0
.end method

.method public static a(Ljava/lang/String;IIIZ)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->x:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    new-array v1, p1, [C

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    sput v2, LVa/Ab;->v:I

    .line 14
    .line 15
    :goto_0
    sget v3, LVa/Ab;->v:I

    .line 16
    .line 17
    if-ge v3, p1, :cond_0

    .line 18
    .line 19
    aget-char v4, p0, v3

    .line 20
    .line 21
    add-int/2addr v4, p2

    .line 22
    int-to-char v4, v4

    .line 23
    aput-char v4, v1, v3

    .line 24
    .line 25
    add-int/lit16 v4, v4, -0xb9

    .line 26
    .line 27
    int-to-char v4, v4

    .line 28
    aput-char v4, v1, v3

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    sput v3, LVa/Ab;->v:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    if-lez p3, :cond_1

    .line 38
    .line 39
    sput p3, LVa/Ab;->w:I

    .line 40
    .line 41
    new-array p0, p1, [C

    .line 42
    .line 43
    invoke-static {v1, v2, p0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    sget p2, LVa/Ab;->w:I

    .line 47
    .line 48
    sub-int p3, p1, p2

    .line 49
    .line 50
    invoke-static {p0, v2, v1, p3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    sget p2, LVa/Ab;->w:I

    .line 54
    .line 55
    sub-int p3, p1, p2

    .line 56
    .line 57
    invoke-static {p0, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    :cond_1
    if-eqz p4, :cond_3

    .line 61
    .line 62
    new-array p0, p1, [C

    .line 63
    .line 64
    sput v2, LVa/Ab;->v:I

    .line 65
    .line 66
    :goto_1
    sget p2, LVa/Ab;->v:I

    .line 67
    .line 68
    if-ge p2, p1, :cond_2

    .line 69
    .line 70
    sub-int p3, p1, p2

    .line 71
    .line 72
    add-int/lit8 p3, p3, -0x1

    .line 73
    .line 74
    aget-char p3, v1, p3

    .line 75
    .line 76
    aput-char p3, p0, p2

    .line 77
    .line 78
    add-int/lit8 p2, p2, 0x1

    .line 79
    .line 80
    sput p2, LVa/Ab;->v:I

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v1, p0

    .line 84
    :cond_3
    new-instance p0, Ljava/lang/String;

    .line 85
    .line 86
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 87
    .line 88
    .line 89
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    return-object p0

    .line 91
    :goto_2
    monitor-exit v0

    .line 92
    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)LVa/b0;
    .locals 2

    .line 1
    sget v0, LVa/b0;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/b0;->h:I

    .line 8
    .line 9
    const-class v0, LVa/b0;

    .line 10
    .line 11
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, LVa/b0;

    .line 16
    .line 17
    sget v0, LVa/b0;->h:I

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x29

    .line 20
    .line 21
    rem-int/lit16 v1, v0, 0x80

    .line 22
    .line 23
    sput v1, LVa/b0;->i:I

    .line 24
    .line 25
    rem-int/lit8 v0, v0, 0x2

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    throw p0
.end method

.method public static values()[LVa/b0;
    .locals 3

    .line 1
    sget v0, LVa/b0;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5f

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/b0;->h:I

    .line 8
    .line 9
    sget-object v0, LVa/b0;->g:[LVa/b0;

    .line 10
    .line 11
    invoke-virtual {v0}, [LVa/b0;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, [LVa/b0;

    .line 16
    .line 17
    sget v1, LVa/b0;->i:I

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1d

    .line 20
    .line 21
    rem-int/lit16 v2, v1, 0x80

    .line 22
    .line 23
    sput v2, LVa/b0;->h:I

    .line 24
    .line 25
    rem-int/lit8 v1, v1, 0x2

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    throw v0
.end method
