.class public final enum LVa/a0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:LVa/a0;

.field public static final enum b:LVa/a0;

.field public static final enum c:LVa/a0;

.field public static final enum d:LVa/a0;

.field public static final enum e:LVa/a0;

.field public static final enum f:LVa/a0;

.field public static final synthetic g:[LVa/a0;

.field public static h:I = 0x0

# The value of this static final field might be set in the static constructor
.field public static final i:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    const/4 v0, 0x5

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x6

    .line 5
    const/4 v4, 0x1

    .line 6
    const/4 v5, 0x0

    .line 7
    const/4 v6, 0x4

    .line 8
    new-instance v7, LVa/a0;

    .line 9
    .line 10
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 11
    .line 12
    .line 13
    move-result v8

    .line 14
    const/4 v9, 0x0

    .line 15
    cmpl-float v8, v8, v9

    .line 16
    .line 17
    rsub-int/lit8 v8, v8, 0x4

    .line 18
    .line 19
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 20
    .line 21
    .line 22
    move-result v10

    .line 23
    shr-int/lit8 v10, v10, 0x10

    .line 24
    .line 25
    add-int/lit16 v10, v10, 0x81

    .line 26
    .line 27
    invoke-static {v5}, Landroid/graphics/Color;->blue(I)I

    .line 28
    .line 29
    .line 30
    move-result v11

    .line 31
    add-int/2addr v11, v4

    .line 32
    const-string v12, "\t\u0000\ufff7"

    .line 33
    .line 34
    invoke-static {v12, v8, v10, v11, v5}, LVa/a0;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-direct {v7, v8, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    sput-object v7, LVa/a0;->a:LVa/a0;

    .line 46
    .line 47
    new-instance v8, LVa/a0;

    .line 48
    .line 49
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    shr-int/lit8 v10, v10, 0x10

    .line 54
    .line 55
    rsub-int/lit8 v10, v10, 0x8

    .line 56
    .line 57
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    shr-int/lit8 v11, v11, 0x10

    .line 62
    .line 63
    rsub-int/lit8 v11, v11, 0x7c

    .line 64
    .line 65
    const-wide/16 v12, 0x0

    .line 66
    .line 67
    invoke-static {v12, v13}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 68
    .line 69
    .line 70
    move-result v14

    .line 71
    rsub-int/lit8 v14, v14, 0x7

    .line 72
    .line 73
    const-string v15, "\ufffe\u0005\u0000\uffff\ufffa\u000b\ufffc\ufffd"

    .line 74
    .line 75
    invoke-static {v15, v10, v11, v14, v4}, LVa/a0;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    invoke-direct {v8, v10, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    sput-object v8, LVa/a0;->b:LVa/a0;

    .line 87
    .line 88
    new-instance v10, LVa/a0;

    .line 89
    .line 90
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    shr-int/lit8 v11, v11, 0x8

    .line 95
    .line 96
    add-int/lit8 v11, v11, 0xc

    .line 97
    .line 98
    invoke-static {v5}, Landroid/graphics/Color;->red(I)I

    .line 99
    .line 100
    .line 101
    move-result v14

    .line 102
    rsub-int/lit8 v14, v14, 0x7e

    .line 103
    .line 104
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 105
    .line 106
    .line 107
    move-result-wide v15

    .line 108
    cmp-long v15, v15, v12

    .line 109
    .line 110
    add-int/2addr v15, v3

    .line 111
    move/from16 v16, v9

    .line 112
    .line 113
    const-string v9, "\ufff6\u0001\ufffe\u000f\ufffe\u0003\ufffc\ufffe\u0003\ufffe\t\ufffe"

    .line 114
    .line 115
    invoke-static {v9, v11, v14, v15, v5}, LVa/a0;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    invoke-direct {v10, v9, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 124
    .line 125
    .line 126
    sput-object v10, LVa/a0;->c:LVa/a0;

    .line 127
    .line 128
    new-instance v9, LVa/a0;

    .line 129
    .line 130
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 131
    .line 132
    .line 133
    move-result-wide v14

    .line 134
    cmp-long v11, v14, v12

    .line 135
    .line 136
    rsub-int/lit8 v11, v11, 0x3

    .line 137
    .line 138
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 139
    .line 140
    .line 141
    move-result v12

    .line 142
    cmpl-float v12, v12, v16

    .line 143
    .line 144
    rsub-int v12, v12, 0x81

    .line 145
    .line 146
    const-string v13, ""

    .line 147
    .line 148
    const/16 v14, 0x30

    .line 149
    .line 150
    invoke-static {v13, v14}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 151
    .line 152
    .line 153
    move-result v15

    .line 154
    neg-int v15, v15

    .line 155
    move/from16 v16, v2

    .line 156
    .line 157
    const-string v2, "\ufffe\u0002"

    .line 158
    .line 159
    invoke-static {v2, v11, v12, v15, v5}, LVa/a0;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-direct {v9, v2, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 168
    .line 169
    .line 170
    sput-object v9, LVa/a0;->d:LVa/a0;

    .line 171
    .line 172
    new-instance v2, LVa/a0;

    .line 173
    .line 174
    invoke-static {v13, v14}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 175
    .line 176
    .line 177
    move-result v11

    .line 178
    rsub-int/lit8 v11, v11, 0x7

    .line 179
    .line 180
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 181
    .line 182
    .line 183
    move-result v12

    .line 184
    shr-int/lit8 v12, v12, 0x10

    .line 185
    .line 186
    rsub-int/lit8 v12, v12, 0x7a

    .line 187
    .line 188
    invoke-static {v13, v5}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 189
    .line 190
    .line 191
    move-result v13

    .line 192
    rsub-int/lit8 v13, v13, 0x1

    .line 193
    .line 194
    const-string v14, "\ufffd\ufffd\u0002\u000c\ufffa\ufffb\u0005\ufffe"

    .line 195
    .line 196
    invoke-static {v14, v11, v12, v13, v5}, LVa/a0;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    invoke-direct {v2, v11, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 205
    .line 206
    .line 207
    sput-object v2, LVa/a0;->e:LVa/a0;

    .line 208
    .line 209
    new-instance v11, LVa/a0;

    .line 210
    .line 211
    invoke-static {v5}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 212
    .line 213
    .line 214
    move-result v12

    .line 215
    add-int/2addr v12, v0

    .line 216
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 217
    .line 218
    .line 219
    move-result v13

    .line 220
    shr-int/lit8 v13, v13, 0x18

    .line 221
    .line 222
    rsub-int v13, v13, 0x81

    .line 223
    .line 224
    invoke-static {v5}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 225
    .line 226
    .line 227
    move-result v14

    .line 228
    add-int/2addr v14, v1

    .line 229
    const-string v15, "\u0004\u0004\ufff7\u0004\u0001"

    .line 230
    .line 231
    invoke-static {v15, v12, v13, v14, v4}, LVa/a0;->a(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v12

    .line 235
    invoke-virtual {v12}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v12

    .line 239
    invoke-direct {v11, v12, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 240
    .line 241
    .line 242
    sput-object v11, LVa/a0;->f:LVa/a0;

    .line 243
    .line 244
    new-array v3, v3, [LVa/a0;

    .line 245
    .line 246
    aput-object v7, v3, v5

    .line 247
    .line 248
    aput-object v8, v3, v4

    .line 249
    .line 250
    aput-object v10, v3, v16

    .line 251
    .line 252
    aput-object v9, v3, v1

    .line 253
    .line 254
    aput-object v2, v3, v6

    .line 255
    .line 256
    aput-object v11, v3, v0

    .line 257
    .line 258
    sput-object v3, LVa/a0;->g:[LVa/a0;

    .line 259
    .line 260
    sget v0, LVa/a0;->h:I

    .line 261
    .line 262
    add-int/lit8 v0, v0, 0x73

    .line 263
    .line 264
    rem-int/lit16 v0, v0, 0x80

    .line 265
    .line 266
    sput v0, LVa/a0;->i:I

    .line 267
    .line 268
    return-void
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
    add-int/lit8 v4, v4, -0x33

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

.method public static valueOf(Ljava/lang/String;)LVa/a0;
    .locals 3

    .line 1
    sget v0, LVa/a0;->i:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1b

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/a0;->h:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    const-class v2, LVa/a0;

    .line 12
    .line 13
    invoke-static {v2, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, LVa/a0;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/16 v1, 0x8

    .line 22
    .line 23
    div-int/lit8 v1, v1, 0x0

    .line 24
    .line 25
    :cond_0
    add-int/lit8 v0, v0, 0x5

    .line 26
    .line 27
    rem-int/lit16 v0, v0, 0x80

    .line 28
    .line 29
    sput v0, LVa/a0;->h:I

    .line 30
    .line 31
    return-object p0
.end method

.method public static values()[LVa/a0;
    .locals 2

    .line 1
    sget v0, LVa/a0;->i:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x5f

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, LVa/a0;->h:I

    .line 8
    .line 9
    sget-object v1, LVa/a0;->g:[LVa/a0;

    .line 10
    .line 11
    invoke-virtual {v1}, [LVa/a0;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, [LVa/a0;

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x7b

    .line 18
    .line 19
    rem-int/lit16 v0, v0, 0x80

    .line 20
    .line 21
    sput v0, LVa/a0;->h:I

    .line 22
    .line 23
    return-object v1
.end method
