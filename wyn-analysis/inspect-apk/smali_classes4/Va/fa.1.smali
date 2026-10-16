.class public final LVa/fa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:[C

.field public static g:I = 0x0

.field public static h:I = 0x1


# instance fields
.field public final a:Ljava/util/List;

.field public final b:I

.field public final c:Ljava/util/HashSet;

.field public final d:Ljava/util/HashSet;

.field public e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x56

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/fa;->f:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x25s
        0x11s
        0x2es
        0x2ds
        0x6ds
        0x1es
        0x2fs
        0x22s
        0x30s
        0x57s
        0x72s
        0x6cs
        0x11s
        0x3cs
        0x78s
        0x2es
        0x3fs
        0xc5s
        0xd7s
        0x51s
        0xads
        0x11s
        0x4as
        0x73s
        0x6as
        0x66s
        0x67s
        0x61s
        0x40s
        0x4es
        0x5as
        0x2es
        0x41s
        0x6as
        0x6as
        0x62s
        0x61s
        0x40s
        0x27s
        0x27s
        0x43s
        0x68s
        0x68s
        0x69s
        0x71s
        0x5bs
        0x32s
        0x2es
        0x88s
        0x87s
        0x94s
        0x72s
        0x86s
        0x87s
        0x94s
        0x83s
        0x8as
        0x75s
        0x44s
        0x5cs
        0x44s
        0x95s
        0x95s
        0x83s
        0x8es
        0x85s
        0x81s
        0x44s
        0x9ds
        0x5cs
        0x44s
        0x83s
        0x96s
        0x83s
        0x86s
        0x81s
        0x44s
        0x4es
        0x44s
        0x95s
        0x87s
        0x85s
        0x90s
        0x87s
        0x94s
        0x87s
    .end array-data
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LVa/fa;->c:Ljava/util/HashSet;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LVa/fa;->d:Ljava/util/HashSet;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, LVa/fa;->e:I

    .line 20
    .line 21
    iput-object p2, p0, LVa/fa;->a:Ljava/util/List;

    .line 22
    .line 23
    iput p1, p0, LVa/fa;->b:I

    .line 24
    .line 25
    return-void
.end method

.method public static a(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget v1, LVa/fa;->h:I

    .line 7
    .line 8
    add-int/lit8 v1, v1, 0x1d

    .line 9
    .line 10
    rem-int/lit16 v1, v1, 0x80

    .line 11
    .line 12
    sput v1, LVa/fa;->g:I

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-ge v1, v2, :cond_0

    .line 20
    .line 21
    invoke-static {p0, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    sget v2, LVa/fa;->g:I

    .line 31
    .line 32
    add-int/lit8 v2, v2, 0x75

    .line 33
    .line 34
    rem-int/lit16 v2, v2, 0x80

    .line 35
    .line 36
    sput v2, LVa/fa;->h:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0xc

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    filled-new-array {v1, v2, v3, v2}, [I

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    const-string v5, "\u0000"

    .line 15
    .line 16
    invoke-static {v5, v4, v3}, LVa/fa;->h(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v4, ""

    .line 28
    .line 29
    invoke-static {v4, v3}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    rsub-int/lit8 v6, v6, 0x1

    .line 34
    .line 35
    const v7, 0x1000061

    .line 36
    .line 37
    .line 38
    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    add-int/2addr v8, v7

    .line 43
    invoke-static {v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    add-int/2addr v7, v2

    .line 48
    invoke-static {v5, v6, v8, v7, v3}, LVa/fa;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    const/16 v7, 0x1c

    .line 57
    .line 58
    const/16 v8, 0xd

    .line 59
    .line 60
    const/4 v9, 0x2

    .line 61
    filled-new-array {v8, v9, v7, v3}, [I

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    const-string v10, "\u0000\u0000"

    .line 66
    .line 67
    invoke-static {v10, v7, v3}, LVa/fa;->h(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-virtual {p0, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    filled-new-array {v1, v2, v3, v2}, [I

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-static {v5, v6, v3}, LVa/fa;->h(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    const/16 v7, 0xf

    .line 92
    .line 93
    filled-new-array {v7, v9, v3, v3}, [I

    .line 94
    .line 95
    .line 96
    move-result-object v11

    .line 97
    invoke-static {v10, v11, v3}, LVa/fa;->h(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    invoke-virtual {p0, v6, v11}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {v4}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    neg-int v4, v4

    .line 114
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    shr-int/lit8 v6, v6, 0x16

    .line 119
    .line 120
    add-int/2addr v6, v7

    .line 121
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    int-to-byte v7, v7

    .line 126
    neg-int v7, v7

    .line 127
    invoke-static {v5, v4, v6, v7, v2}, LVa/fa;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    const/16 v6, 0x11

    .line 136
    .line 137
    const/16 v7, 0x69

    .line 138
    .line 139
    filled-new-array {v6, v9, v7, v2}, [I

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    const/4 v7, 0x0

    .line 144
    invoke-static {v7, v6, v2}, LVa/fa;->h(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    invoke-virtual {p0, v4, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    const/4 v6, 0x0

    .line 161
    cmpl-float v4, v4, v6

    .line 162
    .line 163
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    shr-int/lit8 v7, v7, 0x10

    .line 168
    .line 169
    rsub-int/lit8 v7, v7, 0x12

    .line 170
    .line 171
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 172
    .line 173
    .line 174
    move-result v11

    .line 175
    shr-int/lit8 v11, v11, 0x10

    .line 176
    .line 177
    rsub-int/lit8 v11, v11, 0x1

    .line 178
    .line 179
    invoke-static {v5, v4, v7, v11, v2}, LVa/fa;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    const/16 v7, 0x13

    .line 188
    .line 189
    const/16 v11, 0x46

    .line 190
    .line 191
    filled-new-array {v7, v9, v11, v3}, [I

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    invoke-static {v10, v7, v3}, LVa/fa;->h(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    invoke-virtual {p0, v4, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    add-int/2addr v4, v2

    .line 212
    const-wide/16 v10, 0x0

    .line 213
    .line 214
    invoke-static {v10, v11}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    sub-int/2addr v8, v7

    .line 219
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    shr-int/lit8 v7, v7, 0x10

    .line 224
    .line 225
    rsub-int/lit8 v7, v7, 0x1

    .line 226
    .line 227
    invoke-static {v5, v4, v8, v7, v3}, LVa/fa;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 236
    .line 237
    .line 238
    move-result v7

    .line 239
    shr-int/lit8 v7, v7, 0x10

    .line 240
    .line 241
    rsub-int/lit8 v7, v7, 0x2

    .line 242
    .line 243
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 244
    .line 245
    .line 246
    move-result v8

    .line 247
    cmpl-float v6, v8, v6

    .line 248
    .line 249
    rsub-int/lit8 v6, v6, 0x6e

    .line 250
    .line 251
    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 252
    .line 253
    .line 254
    move-result v8

    .line 255
    sub-int/2addr v9, v8

    .line 256
    const-string v8, "\u000c\ufff4"

    .line 257
    .line 258
    invoke-static {v8, v7, v6, v9, v2}, LVa/fa;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    invoke-virtual {p0, v4, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    filled-new-array {v1, v2, v3, v2}, [I

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    invoke-static {v5, p0, v3}, LVa/fa;->h(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    sget v0, LVa/fa;->h:I

    .line 293
    .line 294
    add-int/lit8 v0, v0, 0x45

    .line 295
    .line 296
    rem-int/lit16 v0, v0, 0x80

    .line 297
    .line 298
    sput v0, LVa/fa;->g:I

    .line 299
    .line 300
    return-object p0
.end method

.method public static c(Ljava/lang/String;IIIZ)Ljava/lang/String;
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
    add-int/lit8 v4, v4, -0x5

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

.method public static g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget v0, LVa/fa;->g:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x2b

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, LVa/fa;->h:I

    .line 8
    .line 9
    instance-of v1, p0, Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    instance-of v1, p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget v0, LVa/fa;->g:I

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    rem-int/lit16 v0, v0, 0x80

    .line 35
    .line 36
    sput v0, LVa/fa;->h:I

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_1
    add-int/lit8 v0, v0, 0x11

    .line 40
    .line 41
    rem-int/lit16 v0, v0, 0x80

    .line 42
    .line 43
    sput v0, LVa/fa;->h:I

    .line 44
    .line 45
    return-object p0
.end method

.method public static h(Ljava/lang/String;[IZ)Ljava/lang/String;
    .locals 12

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-string v0, "ISO-8859-1"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    check-cast p0, [B

    .line 10
    .line 11
    sget-object v0, LVa/Ab;->z:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :try_start_0
    aget v2, p1, v1

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    aget v4, p1, v3

    .line 19
    .line 20
    const/4 v5, 0x2

    .line 21
    aget v6, p1, v5

    .line 22
    .line 23
    const/4 v7, 0x3

    .line 24
    aget v7, p1, v7

    .line 25
    .line 26
    sget-object v8, LVa/fa;->f:[C

    .line 27
    .line 28
    new-array v9, v4, [C

    .line 29
    .line 30
    invoke-static {v8, v2, v9, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    .line 32
    .line 33
    if-eqz p0, :cond_3

    .line 34
    .line 35
    new-array v2, v4, [C

    .line 36
    .line 37
    sput v1, LVa/Ab;->y:I

    .line 38
    .line 39
    move v8, v1

    .line 40
    :goto_0
    sget v10, LVa/Ab;->y:I

    .line 41
    .line 42
    if-ge v10, v4, :cond_2

    .line 43
    .line 44
    aget-byte v11, p0, v10

    .line 45
    .line 46
    if-ne v11, v3, :cond_1

    .line 47
    .line 48
    aget-char v11, v9, v10

    .line 49
    .line 50
    shl-int/2addr v11, v3

    .line 51
    add-int/2addr v11, v3

    .line 52
    sub-int/2addr v11, v8

    .line 53
    int-to-char v8, v11

    .line 54
    aput-char v8, v2, v10

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    goto :goto_4

    .line 59
    :cond_1
    aget-char v11, v9, v10

    .line 60
    .line 61
    shl-int/2addr v11, v3

    .line 62
    sub-int/2addr v11, v8

    .line 63
    int-to-char v8, v11

    .line 64
    aput-char v8, v2, v10

    .line 65
    .line 66
    :goto_1
    aget-char v8, v2, v10

    .line 67
    .line 68
    add-int/lit8 v10, v10, 0x1

    .line 69
    .line 70
    sput v10, LVa/Ab;->y:I

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    move-object v9, v2

    .line 74
    :cond_3
    if-lez v7, :cond_4

    .line 75
    .line 76
    new-array p0, v4, [C

    .line 77
    .line 78
    invoke-static {v9, v1, p0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    .line 80
    .line 81
    sub-int v2, v4, v7

    .line 82
    .line 83
    invoke-static {p0, v1, v9, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 84
    .line 85
    .line 86
    invoke-static {p0, v7, v9, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 87
    .line 88
    .line 89
    :cond_4
    if-eqz p2, :cond_6

    .line 90
    .line 91
    new-array p0, v4, [C

    .line 92
    .line 93
    sput v1, LVa/Ab;->y:I

    .line 94
    .line 95
    :goto_2
    sget p2, LVa/Ab;->y:I

    .line 96
    .line 97
    if-ge p2, v4, :cond_5

    .line 98
    .line 99
    sub-int v2, v4, p2

    .line 100
    .line 101
    sub-int/2addr v2, v3

    .line 102
    aget-char v2, v9, v2

    .line 103
    .line 104
    aput-char v2, p0, p2

    .line 105
    .line 106
    add-int/lit8 p2, p2, 0x1

    .line 107
    .line 108
    sput p2, LVa/Ab;->y:I

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    move-object v9, p0

    .line 112
    :cond_6
    if-lez v6, :cond_7

    .line 113
    .line 114
    sput v1, LVa/Ab;->y:I

    .line 115
    .line 116
    :goto_3
    sget p0, LVa/Ab;->y:I

    .line 117
    .line 118
    if-ge p0, v4, :cond_7

    .line 119
    .line 120
    aget-char p2, v9, p0

    .line 121
    .line 122
    aget v1, p1, v5

    .line 123
    .line 124
    sub-int/2addr p2, v1

    .line 125
    int-to-char p2, p2

    .line 126
    aput-char p2, v9, p0

    .line 127
    .line 128
    add-int/lit8 p0, p0, 0x1

    .line 129
    .line 130
    sput p0, LVa/Ab;->y:I

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_7
    new-instance p0, Ljava/lang/String;

    .line 134
    .line 135
    invoke-direct {p0, v9}, Ljava/lang/String;-><init>([C)V

    .line 136
    .line 137
    .line 138
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    return-object p0

    .line 140
    :goto_4
    monitor-exit v0

    .line 141
    throw p0
.end method

.method public static k(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    instance-of v1, p0, Ljava/lang/Number;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    sget v1, LVa/fa;->g:I

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x2b

    .line 24
    .line 25
    rem-int/lit16 v1, v1, 0x80

    .line 26
    .line 27
    sput v1, LVa/fa;->h:I

    .line 28
    .line 29
    check-cast p0, Ljava/lang/Number;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    const-wide/16 v5, 0x0

    .line 36
    .line 37
    cmpl-double p0, v3, v5

    .line 38
    .line 39
    if-nez p0, :cond_2

    .line 40
    .line 41
    return v0

    .line 42
    :cond_2
    return v2

    .line 43
    :cond_3
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 44
    .line 45
    if-eqz v1, :cond_5

    .line 46
    .line 47
    sget v1, LVa/fa;->h:I

    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x5f

    .line 50
    .line 51
    rem-int/lit16 v1, v1, 0x80

    .line 52
    .line 53
    sput v1, LVa/fa;->g:I

    .line 54
    .line 55
    check-cast p0, Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-nez p0, :cond_4

    .line 62
    .line 63
    sget p0, LVa/fa;->h:I

    .line 64
    .line 65
    add-int/lit8 p0, p0, 0x59

    .line 66
    .line 67
    rem-int/lit16 p0, p0, 0x80

    .line 68
    .line 69
    sput p0, LVa/fa;->g:I

    .line 70
    .line 71
    return v0

    .line 72
    :cond_4
    return v2

    .line 73
    :cond_5
    instance-of v1, p0, Ljava/util/Collection;

    .line 74
    .line 75
    if-eqz v1, :cond_7

    .line 76
    .line 77
    check-cast p0, Ljava/util/Collection;

    .line 78
    .line 79
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    sget v0, LVa/fa;->g:I

    .line 84
    .line 85
    add-int/lit8 v0, v0, 0x7d

    .line 86
    .line 87
    rem-int/lit16 v1, v0, 0x80

    .line 88
    .line 89
    sput v1, LVa/fa;->h:I

    .line 90
    .line 91
    rem-int/lit8 v0, v0, 0x2

    .line 92
    .line 93
    if-nez v0, :cond_6

    .line 94
    .line 95
    const/16 v0, 0x1e

    .line 96
    .line 97
    div-int/2addr v0, v2

    .line 98
    :cond_6
    return p0

    .line 99
    :cond_7
    instance-of v1, p0, Ljava/util/Map;

    .line 100
    .line 101
    if-eqz v1, :cond_8

    .line 102
    .line 103
    check-cast p0, Ljava/util/Map;

    .line 104
    .line 105
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    return p0

    .line 110
    :cond_8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_b

    .line 119
    .line 120
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-nez p0, :cond_a

    .line 125
    .line 126
    sget p0, LVa/fa;->g:I

    .line 127
    .line 128
    add-int/lit8 p0, p0, 0x6f

    .line 129
    .line 130
    rem-int/lit16 v1, p0, 0x80

    .line 131
    .line 132
    sput v1, LVa/fa;->h:I

    .line 133
    .line 134
    rem-int/lit8 p0, p0, 0x2

    .line 135
    .line 136
    if-nez p0, :cond_9

    .line 137
    .line 138
    return v2

    .line 139
    :cond_9
    return v0

    .line 140
    :cond_a
    sget p0, LVa/fa;->g:I

    .line 141
    .line 142
    add-int/lit8 p0, p0, 0x7

    .line 143
    .line 144
    rem-int/lit16 p0, p0, 0x80

    .line 145
    .line 146
    sput p0, LVa/fa;->h:I

    .line 147
    .line 148
    :cond_b
    return v2
.end method


# virtual methods
.method public final d(Ljava/lang/Class;)[Ljava/lang/reflect/Field;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p1, :cond_0

    .line 7
    .line 8
    sget v1, LVa/fa;->h:I

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x71

    .line 11
    .line 12
    rem-int/lit16 v1, v1, 0x80

    .line 13
    .line 14
    sput v1, LVa/fa;->g:I

    .line 15
    .line 16
    iget-object v1, p0, LVa/fa;->a:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {p1, v1}, LVa/ub;->g(Ljava/lang/Class;Ljava/util/List;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 p1, 0x0

    .line 41
    new-array p1, p1, [Ljava/lang/reflect/Field;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, [Ljava/lang/reflect/Field;

    .line 48
    .line 49
    sget v0, LVa/fa;->h:I

    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x67

    .line 52
    .line 53
    rem-int/lit16 v0, v0, 0x80

    .line 54
    .line 55
    sput v0, LVa/fa;->g:I

    .line 56
    .line 57
    return-object p1
.end method

.method public final e(Ljava/lang/Object;)Ljava/lang/String;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, LVa/fa;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, ""

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/lit8 v1, v1, 0x4

    .line 18
    .line 19
    invoke-static {v4, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    add-int/lit8 v5, v5, 0x73

    .line 24
    .line 25
    invoke-static {v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    sub-int/2addr v3, v2

    .line 30
    const-string v2, "\ufffe\ufffe\u0000\u0007"

    .line 31
    .line 32
    invoke-static {v2, v1, v5, v3, v4}, LVa/fa;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    return-object v1

    .line 41
    :cond_0
    instance-of v5, v1, Ljava/lang/String;

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    sget v2, LVa/fa;->h:I

    .line 47
    .line 48
    add-int/lit8 v2, v2, 0x5

    .line 49
    .line 50
    rem-int/lit16 v4, v2, 0x80

    .line 51
    .line 52
    sput v4, LVa/fa;->g:I

    .line 53
    .line 54
    rem-int/2addr v2, v3

    .line 55
    if-nez v2, :cond_1

    .line 56
    .line 57
    check-cast v1, Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, LVa/fa;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    sget v2, LVa/fa;->g:I

    .line 64
    .line 65
    add-int/lit8 v2, v2, 0x47

    .line 66
    .line 67
    rem-int/lit16 v2, v2, 0x80

    .line 68
    .line 69
    sput v2, LVa/fa;->h:I

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_1
    check-cast v1, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, LVa/fa;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    throw v6

    .line 78
    :cond_2
    instance-of v5, v1, Ljava/lang/Number;

    .line 79
    .line 80
    if-nez v5, :cond_21

    .line 81
    .line 82
    sget v5, LVa/fa;->h:I

    .line 83
    .line 84
    add-int/lit8 v7, v5, 0x2f

    .line 85
    .line 86
    rem-int/lit16 v7, v7, 0x80

    .line 87
    .line 88
    sput v7, LVa/fa;->g:I

    .line 89
    .line 90
    instance-of v8, v1, Ljava/lang/Boolean;

    .line 91
    .line 92
    if-eqz v8, :cond_3

    .line 93
    .line 94
    goto/16 :goto_9

    .line 95
    .line 96
    :cond_3
    instance-of v8, v1, Ljava/lang/Character;

    .line 97
    .line 98
    if-eqz v8, :cond_4

    .line 99
    .line 100
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v1}, LVa/fa;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    return-object v1

    .line 109
    :cond_4
    instance-of v8, v1, Lorg/json/JSONArray;

    .line 110
    .line 111
    if-eqz v8, :cond_5

    .line 112
    .line 113
    add-int/lit8 v5, v5, 0x19

    .line 114
    .line 115
    rem-int/lit16 v5, v5, 0x80

    .line 116
    .line 117
    sput v5, LVa/fa;->g:I

    .line 118
    .line 119
    check-cast v1, Lorg/json/JSONArray;

    .line 120
    .line 121
    invoke-static {v1}, LVa/Ab;->i(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v0, v1}, LVa/fa;->j(Ljava/util/Collection;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    return-object v1

    .line 130
    :cond_5
    instance-of v8, v1, Lorg/json/JSONObject;

    .line 131
    .line 132
    if-eqz v8, :cond_7

    .line 133
    .line 134
    add-int/lit8 v7, v7, 0x47

    .line 135
    .line 136
    rem-int/lit16 v2, v7, 0x80

    .line 137
    .line 138
    sput v2, LVa/fa;->h:I

    .line 139
    .line 140
    rem-int/2addr v7, v3

    .line 141
    if-eqz v7, :cond_6

    .line 142
    .line 143
    check-cast v1, Lorg/json/JSONObject;

    .line 144
    .line 145
    invoke-static {v1}, LVa/Ab;->N(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v0, v1}, LVa/fa;->f(Ljava/util/Map;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    return-object v1

    .line 154
    :cond_6
    check-cast v1, Lorg/json/JSONObject;

    .line 155
    .line 156
    invoke-static {v1}, LVa/Ab;->N(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v0, v1}, LVa/fa;->f(Ljava/util/Map;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    throw v6

    .line 164
    :cond_7
    instance-of v7, v1, Ljava/util/Map;

    .line 165
    .line 166
    const/16 v8, 0x16

    .line 167
    .line 168
    if-eqz v7, :cond_9

    .line 169
    .line 170
    add-int/lit8 v5, v5, 0x1f

    .line 171
    .line 172
    rem-int/lit16 v5, v5, 0x80

    .line 173
    .line 174
    sput v5, LVa/fa;->g:I

    .line 175
    .line 176
    check-cast v1, Ljava/util/Map;

    .line 177
    .line 178
    invoke-virtual {v0, v1}, LVa/fa;->f(Ljava/util/Map;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    sget v2, LVa/fa;->g:I

    .line 183
    .line 184
    add-int/lit8 v2, v2, 0x35

    .line 185
    .line 186
    rem-int/lit16 v5, v2, 0x80

    .line 187
    .line 188
    sput v5, LVa/fa;->h:I

    .line 189
    .line 190
    rem-int/2addr v2, v3

    .line 191
    if-nez v2, :cond_8

    .line 192
    .line 193
    div-int/2addr v8, v4

    .line 194
    :cond_8
    return-object v1

    .line 195
    :cond_9
    instance-of v5, v1, Ljava/util/Collection;

    .line 196
    .line 197
    if-nez v5, :cond_20

    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    invoke-virtual {v5}, Ljava/lang/Class;->isArray()Z

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    if-eqz v5, :cond_b

    .line 208
    .line 209
    sget v2, LVa/fa;->g:I

    .line 210
    .line 211
    add-int/lit8 v2, v2, 0x31

    .line 212
    .line 213
    rem-int/lit16 v4, v2, 0x80

    .line 214
    .line 215
    sput v4, LVa/fa;->h:I

    .line 216
    .line 217
    rem-int/2addr v2, v3

    .line 218
    if-eqz v2, :cond_a

    .line 219
    .line 220
    invoke-static {v1}, LVa/fa;->a(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-virtual {v0, v1}, LVa/fa;->j(Ljava/util/Collection;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    return-object v1

    .line 229
    :cond_a
    invoke-static {v1}, LVa/fa;->a(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v0, v1}, LVa/fa;->j(Ljava/util/Collection;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    throw v6

    .line 237
    :cond_b
    instance-of v5, v1, Landroid/os/Bundle;

    .line 238
    .line 239
    const/4 v7, 0x1

    .line 240
    const/16 v9, 0x9

    .line 241
    .line 242
    const/16 v10, 0x15

    .line 243
    .line 244
    const-string v11, "\u0000"

    .line 245
    .line 246
    if-nez v5, :cond_1e

    .line 247
    .line 248
    instance-of v5, v1, Landroid/content/SharedPreferences;

    .line 249
    .line 250
    const-wide/16 v12, 0x0

    .line 251
    .line 252
    if-eqz v5, :cond_c

    .line 253
    .line 254
    check-cast v1, Landroid/content/SharedPreferences;

    .line 255
    .line 256
    new-instance v2, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 259
    .line 260
    .line 261
    const/16 v3, 0x26

    .line 262
    .line 263
    const/16 v5, 0x22

    .line 264
    .line 265
    const/16 v9, 0x30

    .line 266
    .line 267
    filled-new-array {v9, v3, v5, v10}, [I

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    invoke-static {v6, v3, v7}, LVa/fa;->h(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-virtual {v0, v1}, LVa/fa;->f(Ljava/util/Map;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    add-int/2addr v1, v7

    .line 298
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 299
    .line 300
    .line 301
    move-result-wide v3

    .line 302
    cmp-long v3, v3, v12

    .line 303
    .line 304
    rsub-int v3, v3, 0x83

    .line 305
    .line 306
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    shr-int/2addr v4, v8

    .line 311
    rsub-int/lit8 v4, v4, 0x1

    .line 312
    .line 313
    invoke-static {v11, v1, v3, v4, v7}, LVa/fa;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    sget v2, LVa/fa;->g:I

    .line 329
    .line 330
    add-int/lit8 v2, v2, 0x77

    .line 331
    .line 332
    rem-int/lit16 v2, v2, 0x80

    .line 333
    .line 334
    sput v2, LVa/fa;->h:I

    .line 335
    .line 336
    return-object v1

    .line 337
    :cond_c
    sget v5, LVa/fa;->h:I

    .line 338
    .line 339
    add-int/lit8 v5, v5, 0x4b

    .line 340
    .line 341
    rem-int/lit16 v10, v5, 0x80

    .line 342
    .line 343
    sput v10, LVa/fa;->g:I

    .line 344
    .line 345
    rem-int/2addr v5, v3

    .line 346
    if-nez v5, :cond_1d

    .line 347
    .line 348
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    iget-object v10, v0, LVa/fa;->a:Ljava/util/List;

    .line 353
    .line 354
    invoke-static {v5, v10}, LVa/ub;->g(Ljava/lang/Class;Ljava/util/List;)Z

    .line 355
    .line 356
    .line 357
    move-result v5

    .line 358
    const/16 v10, 0xa

    .line 359
    .line 360
    if-eqz v5, :cond_1b

    .line 361
    .line 362
    iget v5, v0, LVa/fa;->e:I

    .line 363
    .line 364
    iget v14, v0, LVa/fa;->b:I

    .line 365
    .line 366
    if-gt v5, v14, :cond_19

    .line 367
    .line 368
    sget v5, LVa/fa;->h:I

    .line 369
    .line 370
    add-int/lit8 v5, v5, 0x17

    .line 371
    .line 372
    rem-int/lit16 v14, v5, 0x80

    .line 373
    .line 374
    sput v14, LVa/fa;->g:I

    .line 375
    .line 376
    rem-int/2addr v5, v3

    .line 377
    iget-object v14, v0, LVa/fa;->c:Ljava/util/HashSet;

    .line 378
    .line 379
    if-eqz v5, :cond_d

    .line 380
    .line 381
    invoke-virtual {v14, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v5

    .line 385
    const/16 v15, 0x12

    .line 386
    .line 387
    div-int/2addr v15, v4

    .line 388
    if-eqz v5, :cond_e

    .line 389
    .line 390
    goto/16 :goto_7

    .line 391
    .line 392
    :cond_d
    invoke-virtual {v14, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v5

    .line 396
    if-eqz v5, :cond_e

    .line 397
    .line 398
    goto/16 :goto_7

    .line 399
    .line 400
    :cond_e
    invoke-virtual {v14, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    iget v5, v0, LVa/fa;->e:I

    .line 404
    .line 405
    add-int/2addr v5, v7

    .line 406
    iput v5, v0, LVa/fa;->e:I

    .line 407
    .line 408
    new-instance v5, Ljava/lang/StringBuilder;

    .line 409
    .line 410
    invoke-static {v4}, Landroid/graphics/Color;->green(I)I

    .line 411
    .line 412
    .line 413
    move-result v14

    .line 414
    add-int/2addr v14, v10

    .line 415
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 416
    .line 417
    .line 418
    move-result v15

    .line 419
    shr-int/lit8 v15, v15, 0x18

    .line 420
    .line 421
    rsub-int/lit8 v15, v15, 0x5c

    .line 422
    .line 423
    invoke-static {v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 424
    .line 425
    .line 426
    move-result v16

    .line 427
    rsub-int/lit8 v9, v16, 0x9

    .line 428
    .line 429
    move-object/from16 p1, v6

    .line 430
    .line 431
    const-string v6, "\uffcb\u001c\u001c\n\u0015\u000c\u0008\uffcb$\uffe3"

    .line 432
    .line 433
    invoke-static {v6, v14, v15, v9, v7}, LVa/fa;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v6

    .line 437
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v6

    .line 441
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    move-result-object v6

    .line 448
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v6

    .line 452
    invoke-static {v6}, LVa/fa;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v6

    .line 456
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    sget v6, LVa/fa;->g:I

    .line 460
    .line 461
    add-int/lit8 v6, v6, 0x3b

    .line 462
    .line 463
    rem-int/lit16 v6, v6, 0x80

    .line 464
    .line 465
    sput v6, LVa/fa;->h:I

    .line 466
    .line 467
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v6

    .line 471
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 472
    .line 473
    .line 474
    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 475
    if-eqz v9, :cond_11

    .line 476
    .line 477
    sget v6, LVa/fa;->h:I

    .line 478
    .line 479
    add-int/lit8 v6, v6, 0x73

    .line 480
    .line 481
    rem-int/lit16 v9, v6, 0x80

    .line 482
    .line 483
    sput v9, LVa/fa;->g:I

    .line 484
    .line 485
    rem-int/2addr v6, v3

    .line 486
    if-nez v6, :cond_10

    .line 487
    .line 488
    :catchall_0
    :cond_f
    move-object/from16 v6, p1

    .line 489
    .line 490
    goto :goto_0

    .line 491
    :cond_10
    :try_start_1
    throw p1

    .line 492
    :cond_11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 493
    .line 494
    .line 495
    move-result v9

    .line 496
    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v9

    .line 500
    new-instance v14, Ljava/lang/StringBuilder;

    .line 501
    .line 502
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    move-result-object v15

    .line 509
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v15

    .line 513
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    filled-new-array {v4, v7, v10, v7}, [I

    .line 517
    .line 518
    .line 519
    move-result-object v15

    .line 520
    invoke-static {v11, v15, v4}, LVa/fa;->h(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v15

    .line 524
    invoke-virtual {v15}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v15

    .line 528
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v14

    .line 538
    invoke-virtual {v6, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-result v14

    .line 542
    if-nez v14, :cond_f

    .line 543
    .line 544
    new-instance v14, Ljava/lang/StringBuilder;

    .line 545
    .line 546
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    move-result-object v15

    .line 553
    invoke-virtual {v15}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v15

    .line 557
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    filled-new-array {v4, v7, v10, v7}, [I

    .line 561
    .line 562
    .line 563
    move-result-object v10

    .line 564
    invoke-static {v11, v10, v4}, LVa/fa;->h(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v10

    .line 568
    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v10

    .line 572
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v9

    .line 582
    invoke-virtual {v6, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 586
    if-eq v9, v7, :cond_f

    .line 587
    .line 588
    :goto_0
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 589
    .line 590
    .line 591
    move-result v9

    .line 592
    if-nez v9, :cond_12

    .line 593
    .line 594
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 595
    .line 596
    .line 597
    move-result v9

    .line 598
    shr-int/lit8 v9, v9, 0x8

    .line 599
    .line 600
    rsub-int/lit8 v9, v9, 0xd

    .line 601
    .line 602
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 603
    .line 604
    .line 605
    move-result v10

    .line 606
    shr-int/lit8 v10, v10, 0x10

    .line 607
    .line 608
    rsub-int/lit8 v10, v10, 0x5b

    .line 609
    .line 610
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 611
    .line 612
    .line 613
    move-result-wide v14

    .line 614
    cmp-long v14, v14, v12

    .line 615
    .line 616
    rsub-int/lit8 v14, v14, 0x7

    .line 617
    .line 618
    const-string v15, "\u001c\u0013\u0018\u0011\uffcc\uffe4\uffd6\uffcc\t\u001e\u0019\ufffd\u001e"

    .line 619
    .line 620
    invoke-static {v15, v9, v10, v14, v4}, LVa/fa;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v9

    .line 624
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v9

    .line 628
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v0, v6}, LVa/fa;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v6

    .line 635
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    :cond_12
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    move-result-object v6

    .line 642
    invoke-virtual {v0, v6}, LVa/fa;->d(Ljava/lang/Class;)[Ljava/lang/reflect/Field;

    .line 643
    .line 644
    .line 645
    move-result-object v6

    .line 646
    array-length v9, v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 647
    move v10, v4

    .line 648
    :goto_1
    if-ge v10, v9, :cond_18

    .line 649
    .line 650
    sget v14, LVa/fa;->h:I

    .line 651
    .line 652
    add-int/lit8 v14, v14, 0x65

    .line 653
    .line 654
    rem-int/lit16 v14, v14, 0x80

    .line 655
    .line 656
    sput v14, LVa/fa;->g:I

    .line 657
    .line 658
    :try_start_3
    aget-object v14, v6, v10

    .line 659
    .line 660
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 661
    .line 662
    .line 663
    move-result v15

    .line 664
    invoke-static {v15}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 665
    .line 666
    .line 667
    move-result v15

    .line 668
    if-nez v15, :cond_13

    .line 669
    .line 670
    sget v15, LVa/fa;->g:I

    .line 671
    .line 672
    add-int/lit8 v15, v15, 0x69

    .line 673
    .line 674
    rem-int/lit16 v15, v15, 0x80

    .line 675
    .line 676
    sput v15, LVa/fa;->h:I

    .line 677
    .line 678
    move/from16 v17, v8

    .line 679
    .line 680
    goto :goto_2

    .line 681
    :cond_13
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    move-result-object v15

    .line 685
    invoke-virtual {v15}, Ljava/lang/Class;->isPrimitive()Z

    .line 686
    .line 687
    .line 688
    move-result v16

    .line 689
    if-nez v16, :cond_17

    .line 690
    .line 691
    sget v16, LVa/fa;->h:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 692
    .line 693
    move/from16 v17, v8

    .line 694
    .line 695
    add-int/lit8 v8, v16, 0x79

    .line 696
    .line 697
    :try_start_4
    rem-int/lit16 v8, v8, 0x80

    .line 698
    .line 699
    sput v8, LVa/fa;->g:I

    .line 700
    .line 701
    const-class v8, Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 702
    .line 703
    if-ne v15, v8, :cond_14

    .line 704
    .line 705
    goto :goto_3

    .line 706
    :cond_14
    :goto_2
    sget v8, LVa/fa;->h:I

    .line 707
    .line 708
    add-int/lit8 v8, v8, 0x11

    .line 709
    .line 710
    rem-int/lit16 v15, v8, 0x80

    .line 711
    .line 712
    sput v15, LVa/fa;->g:I

    .line 713
    .line 714
    rem-int/2addr v8, v3

    .line 715
    if-eqz v8, :cond_16

    .line 716
    .line 717
    :try_start_5
    invoke-virtual {v14, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v14, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v8

    .line 724
    invoke-static {v8}, LVa/fa;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object v8

    .line 728
    invoke-static {v8}, LVa/fa;->k(Ljava/lang/Object;)Z

    .line 729
    .line 730
    .line 731
    move-result v15

    .line 732
    if-nez v15, :cond_15

    .line 733
    .line 734
    goto :goto_4

    .line 735
    :cond_15
    :goto_3
    move-wide/from16 v18, v12

    .line 736
    .line 737
    goto :goto_5

    .line 738
    :cond_16
    invoke-virtual {v14, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 739
    .line 740
    .line 741
    invoke-virtual {v14, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v8

    .line 745
    invoke-static {v8}, LVa/fa;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v8

    .line 749
    invoke-static {v8}, LVa/fa;->k(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v15

    .line 753
    if-nez v15, :cond_15

    .line 754
    .line 755
    :goto_4
    invoke-static {v4, v4}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 756
    .line 757
    .line 758
    move-result v15

    .line 759
    add-int/2addr v15, v3

    .line 760
    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    .line 761
    .line 762
    .line 763
    move-result v16

    .line 764
    move-wide/from16 v18, v12

    .line 765
    .line 766
    add-int/lit8 v12, v16, 0x2c

    .line 767
    .line 768
    const-string v13, "\ufffb\u0005"

    .line 769
    .line 770
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 771
    .line 772
    .line 773
    move-result-wide v20

    .line 774
    cmp-long v16, v20, v18

    .line 775
    .line 776
    add-int/lit8 v3, v16, 0x1

    .line 777
    .line 778
    invoke-static {v13, v15, v12, v3, v7}, LVa/fa;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v3

    .line 782
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v3

    .line 786
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 787
    .line 788
    .line 789
    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v3

    .line 793
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 794
    .line 795
    .line 796
    const-string v3, "\u0000\u0000"

    .line 797
    .line 798
    const/4 v12, 0x2

    .line 799
    filled-new-array {v7, v12, v4, v4}, [I

    .line 800
    .line 801
    .line 802
    move-result-object v13

    .line 803
    invoke-static {v3, v13, v4}, LVa/fa;->h(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v3

    .line 807
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 808
    .line 809
    .line 810
    move-result-object v3

    .line 811
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v0, v8}, LVa/fa;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 815
    .line 816
    .line 817
    move-result-object v3

    .line 818
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 819
    .line 820
    .line 821
    goto :goto_5

    .line 822
    :catchall_1
    move/from16 v17, v8

    .line 823
    .line 824
    goto :goto_6

    .line 825
    :cond_17
    move/from16 v17, v8

    .line 826
    .line 827
    goto :goto_3

    .line 828
    :goto_5
    add-int/lit8 v10, v10, 0x1

    .line 829
    .line 830
    sget v3, LVa/fa;->g:I

    .line 831
    .line 832
    add-int/lit8 v3, v3, 0x5d

    .line 833
    .line 834
    rem-int/lit16 v3, v3, 0x80

    .line 835
    .line 836
    sput v3, LVa/fa;->h:I

    .line 837
    .line 838
    move/from16 v8, v17

    .line 839
    .line 840
    move-wide/from16 v12, v18

    .line 841
    .line 842
    const/4 v3, 0x2

    .line 843
    goto/16 :goto_1

    .line 844
    .line 845
    :cond_18
    move/from16 v17, v8

    .line 846
    .line 847
    sget v1, LVa/fa;->g:I

    .line 848
    .line 849
    add-int/lit8 v1, v1, 0x4f

    .line 850
    .line 851
    rem-int/lit16 v1, v1, 0x80

    .line 852
    .line 853
    sput v1, LVa/fa;->h:I

    .line 854
    .line 855
    :catchall_2
    :goto_6
    iget v1, v0, LVa/fa;->e:I

    .line 856
    .line 857
    sub-int/2addr v1, v7

    .line 858
    iput v1, v0, LVa/fa;->e:I

    .line 859
    .line 860
    const/4 v1, 0x0

    .line 861
    invoke-static {v1, v1}, Landroid/graphics/PointF;->length(FF)F

    .line 862
    .line 863
    .line 864
    move-result v3

    .line 865
    cmpl-float v1, v3, v1

    .line 866
    .line 867
    add-int/2addr v1, v7

    .line 868
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 869
    .line 870
    .line 871
    move-result v3

    .line 872
    shr-int/lit8 v3, v3, 0x16

    .line 873
    .line 874
    add-int/lit16 v3, v3, 0x82

    .line 875
    .line 876
    invoke-static {v2}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 877
    .line 878
    .line 879
    move-result v2

    .line 880
    rsub-int/lit8 v2, v2, 0x1

    .line 881
    .line 882
    invoke-static {v11, v1, v3, v2, v7}, LVa/fa;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    move-result-object v1

    .line 886
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v1

    .line 890
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 891
    .line 892
    .line 893
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object v1

    .line 897
    return-object v1

    .line 898
    :cond_19
    :goto_7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 899
    .line 900
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 901
    .line 902
    .line 903
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 904
    .line 905
    .line 906
    move-result-object v3

    .line 907
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object v3

    .line 911
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 912
    .line 913
    .line 914
    filled-new-array {v4, v7, v10, v7}, [I

    .line 915
    .line 916
    .line 917
    move-result-object v3

    .line 918
    invoke-static {v11, v3, v4}, LVa/fa;->h(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 919
    .line 920
    .line 921
    move-result-object v3

    .line 922
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 923
    .line 924
    .line 925
    move-result-object v3

    .line 926
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 927
    .line 928
    .line 929
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 930
    .line 931
    .line 932
    move-result v1

    .line 933
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 934
    .line 935
    .line 936
    move-result-object v1

    .line 937
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 938
    .line 939
    .line 940
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 941
    .line 942
    .line 943
    move-result-object v1

    .line 944
    invoke-static {v1}, LVa/fa;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    sget v2, LVa/fa;->g:I

    .line 949
    .line 950
    add-int/lit8 v2, v2, 0x2d

    .line 951
    .line 952
    rem-int/lit16 v3, v2, 0x80

    .line 953
    .line 954
    sput v3, LVa/fa;->h:I

    .line 955
    .line 956
    const/16 v20, 0x2

    .line 957
    .line 958
    rem-int/lit8 v2, v2, 0x2

    .line 959
    .line 960
    if-nez v2, :cond_1a

    .line 961
    .line 962
    const/16 v2, 0x41

    .line 963
    .line 964
    div-int/2addr v2, v4

    .line 965
    :cond_1a
    return-object v1

    .line 966
    :cond_1b
    move-object/from16 p1, v6

    .line 967
    .line 968
    sget v2, LVa/fa;->g:I

    .line 969
    .line 970
    add-int/lit8 v2, v2, 0x27

    .line 971
    .line 972
    rem-int/lit16 v3, v2, 0x80

    .line 973
    .line 974
    sput v3, LVa/fa;->h:I

    .line 975
    .line 976
    const/16 v20, 0x2

    .line 977
    .line 978
    rem-int/lit8 v2, v2, 0x2

    .line 979
    .line 980
    if-eqz v2, :cond_1c

    .line 981
    .line 982
    new-instance v2, Ljava/lang/StringBuilder;

    .line 983
    .line 984
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 985
    .line 986
    .line 987
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 988
    .line 989
    .line 990
    move-result-object v3

    .line 991
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 992
    .line 993
    .line 994
    move-result-object v3

    .line 995
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 996
    .line 997
    .line 998
    filled-new-array {v4, v7, v10, v7}, [I

    .line 999
    .line 1000
    .line 1001
    move-result-object v3

    .line 1002
    invoke-static {v11, v3, v4}, LVa/fa;->h(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v3

    .line 1006
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v3

    .line 1010
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 1014
    .line 1015
    .line 1016
    move-result v1

    .line 1017
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v1

    .line 1021
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v1

    .line 1028
    invoke-static {v1}, LVa/fa;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v1

    .line 1032
    return-object v1

    .line 1033
    :cond_1c
    throw p1

    .line 1034
    :cond_1d
    move-object/from16 p1, v6

    .line 1035
    .line 1036
    throw p1

    .line 1037
    :cond_1e
    check-cast v1, Landroid/os/Bundle;

    .line 1038
    .line 1039
    new-instance v3, Ljava/util/HashMap;

    .line 1040
    .line 1041
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v5

    .line 1048
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v5

    .line 1052
    sget v6, LVa/fa;->h:I

    .line 1053
    .line 1054
    add-int/lit8 v6, v6, 0x73

    .line 1055
    .line 1056
    rem-int/lit16 v6, v6, 0x80

    .line 1057
    .line 1058
    sput v6, LVa/fa;->g:I

    .line 1059
    .line 1060
    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1061
    .line 1062
    .line 1063
    move-result v6

    .line 1064
    if-eqz v6, :cond_1f

    .line 1065
    .line 1066
    sget v6, LVa/fa;->g:I

    .line 1067
    .line 1068
    add-int/lit8 v6, v6, 0x59

    .line 1069
    .line 1070
    rem-int/lit16 v6, v6, 0x80

    .line 1071
    .line 1072
    sput v6, LVa/fa;->h:I

    .line 1073
    .line 1074
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v6

    .line 1078
    check-cast v6, Ljava/lang/String;

    .line 1079
    .line 1080
    invoke-virtual {v1, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v8

    .line 1084
    invoke-virtual {v3, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    goto :goto_8

    .line 1088
    :cond_1f
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1089
    .line 1090
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1091
    .line 1092
    .line 1093
    const/16 v5, 0x1b

    .line 1094
    .line 1095
    filled-new-array {v10, v5, v4, v9}, [I

    .line 1096
    .line 1097
    .line 1098
    move-result-object v4

    .line 1099
    const-string v5, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000"

    .line 1100
    .line 1101
    invoke-static {v5, v4, v7}, LVa/fa;->h(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v4

    .line 1105
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v4

    .line 1109
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual {v0, v3}, LVa/fa;->f(Ljava/util/Map;)Ljava/lang/String;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v3

    .line 1116
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1117
    .line 1118
    .line 1119
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 1120
    .line 1121
    .line 1122
    move-result v3

    .line 1123
    shr-int/lit8 v3, v3, 0x10

    .line 1124
    .line 1125
    add-int/2addr v3, v7

    .line 1126
    invoke-static {v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 1127
    .line 1128
    .line 1129
    move-result v2

    .line 1130
    rsub-int v2, v2, 0x82

    .line 1131
    .line 1132
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 1133
    .line 1134
    .line 1135
    move-result v4

    .line 1136
    shr-int/lit8 v4, v4, 0x10

    .line 1137
    .line 1138
    rsub-int/lit8 v4, v4, 0x1

    .line 1139
    .line 1140
    invoke-static {v11, v3, v2, v4, v7}, LVa/fa;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v2

    .line 1144
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v2

    .line 1148
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v1

    .line 1155
    return-object v1

    .line 1156
    :cond_20
    check-cast v1, Ljava/util/Collection;

    .line 1157
    .line 1158
    invoke-virtual {v0, v1}, LVa/fa;->j(Ljava/util/Collection;)Ljava/lang/String;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v1

    .line 1162
    return-object v1

    .line 1163
    :cond_21
    :goto_9
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v1

    .line 1167
    return-object v1
.end method

.method public final f(Ljava/util/Map;)Ljava/lang/String;
    .locals 12

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {v1}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x1

    .line 10
    rsub-int/lit8 v2, v2, 0x1

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    rsub-int v5, v5, 0x80

    .line 18
    .line 19
    invoke-static {v1}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    add-int/2addr v6, v3

    .line 24
    const-string v7, "\u0000"

    .line 25
    .line 26
    invoke-static {v7, v2, v5, v6, v4}, LVa/fa;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    move v2, v3

    .line 46
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_2

    .line 51
    .line 52
    sget v5, LVa/fa;->h:I

    .line 53
    .line 54
    add-int/lit8 v5, v5, 0x3b

    .line 55
    .line 56
    rem-int/lit16 v5, v5, 0x80

    .line 57
    .line 58
    sput v5, LVa/fa;->g:I

    .line 59
    .line 60
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    check-cast v5, Ljava/util/Map$Entry;

    .line 65
    .line 66
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-static {v6}, LVa/fa;->k(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-nez v6, :cond_0

    .line 75
    .line 76
    sget v6, LVa/fa;->h:I

    .line 77
    .line 78
    add-int/lit8 v6, v6, 0x47

    .line 79
    .line 80
    rem-int/lit16 v6, v6, 0x80

    .line 81
    .line 82
    sput v6, LVa/fa;->g:I

    .line 83
    .line 84
    const-wide/16 v8, 0x0

    .line 85
    .line 86
    if-nez v2, :cond_1

    .line 87
    .line 88
    invoke-static {v4, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    rsub-int/lit8 v2, v2, 0x1

    .line 93
    .line 94
    invoke-static {v4, v4}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 95
    .line 96
    .line 97
    move-result-wide v10

    .line 98
    cmp-long v6, v10, v8

    .line 99
    .line 100
    rsub-int/lit8 v6, v6, 0x30

    .line 101
    .line 102
    invoke-static {v4, v4}, Landroid/view/View;->resolveSize(II)I

    .line 103
    .line 104
    .line 105
    move-result v10

    .line 106
    add-int/2addr v10, v3

    .line 107
    invoke-static {v7, v2, v6, v10, v3}, LVa/fa;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    :cond_1
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-static {v2}, LVa/fa;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    const/4 v6, 0x0

    .line 138
    cmpl-float v2, v2, v6

    .line 139
    .line 140
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 141
    .line 142
    .line 143
    move-result-wide v10

    .line 144
    cmp-long v6, v10, v8

    .line 145
    .line 146
    add-int/lit8 v6, v6, 0x3e

    .line 147
    .line 148
    invoke-static {v1}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    rsub-int/lit8 v8, v8, 0x1

    .line 153
    .line 154
    invoke-static {v7, v2, v6, v8, v4}, LVa/fa;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {p0, v2}, LVa/fa;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    sget v2, LVa/fa;->h:I

    .line 177
    .line 178
    add-int/lit8 v2, v2, 0x5f

    .line 179
    .line 180
    rem-int/lit16 v2, v2, 0x80

    .line 181
    .line 182
    sput v2, LVa/fa;->g:I

    .line 183
    .line 184
    move v2, v4

    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :cond_2
    invoke-static {v1, v1, v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    add-int/2addr p1, v3

    .line 192
    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    add-int/lit16 v1, v1, 0x82

    .line 197
    .line 198
    invoke-static {v4}, Landroid/graphics/Color;->green(I)I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    rsub-int/lit8 v2, v2, 0x1

    .line 203
    .line 204
    invoke-static {v7, p1, v1, v2, v3}, LVa/fa;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    return-object p1
.end method

.method public final i(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    sget v0, LVa/fa;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/fa;->h:I

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v1, 0x1e

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    if-le v0, v1, :cond_1

    .line 17
    .line 18
    sget v0, LVa/fa;->g:I

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x27

    .line 21
    .line 22
    rem-int/lit16 v0, v0, 0x80

    .line 23
    .line 24
    sput v0, LVa/fa;->h:I

    .line 25
    .line 26
    iget-object v0, p0, LVa/fa;->d:Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sget p1, LVa/fa;->h:I

    .line 39
    .line 40
    add-int/lit8 p1, p1, 0x41

    .line 41
    .line 42
    rem-int/lit16 p1, p1, 0x80

    .line 43
    .line 44
    sput p1, LVa/fa;->g:I

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    const/4 v0, 0x5

    .line 48
    const/4 v1, 0x7

    .line 49
    filled-new-array {v0, v1, p1, v2}, [I

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const/4 v0, 0x1

    .line 54
    const-string v1, "\u0000\u0000\u0000\u0000\u0000\u0001\u0001"

    .line 55
    .line 56
    invoke-static {v1, p1, v0}, LVa/fa;->h(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    :cond_1
    :goto_0
    invoke-static {p1}, LVa/fa;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    sget v0, LVa/fa;->g:I

    .line 70
    .line 71
    add-int/lit8 v0, v0, 0x6b

    .line 72
    .line 73
    rem-int/lit16 v1, v0, 0x80

    .line 74
    .line 75
    sput v1, LVa/fa;->h:I

    .line 76
    .line 77
    rem-int/2addr v0, v2

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    return-object p1

    .line 81
    :cond_2
    const/4 p1, 0x0

    .line 82
    throw p1
.end method

.method public final j(Ljava/util/Collection;)Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    filled-new-array {v1, v2, v3, v2}, [I

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v4, "\u0001"

    .line 11
    .line 12
    invoke-static {v4, v1, v2}, LVa/fa;->h(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    sget v1, LVa/fa;->h:I

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x4d

    .line 30
    .line 31
    rem-int/lit16 v1, v1, 0x80

    .line 32
    .line 33
    sput v1, LVa/fa;->g:I

    .line 34
    .line 35
    move v1, v2

    .line 36
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const-string v5, "\u0000"

    .line 41
    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    sget v4, LVa/fa;->h:I

    .line 45
    .line 46
    add-int/lit8 v4, v4, 0x2d

    .line 47
    .line 48
    rem-int/lit16 v4, v4, 0x80

    .line 49
    .line 50
    sput v4, LVa/fa;->g:I

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-static {v4}, LVa/fa;->k(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-nez v6, :cond_0

    .line 61
    .line 62
    if-nez v1, :cond_1

    .line 63
    .line 64
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    shr-int/lit8 v1, v1, 0x16

    .line 69
    .line 70
    rsub-int/lit8 v1, v1, 0x1

    .line 71
    .line 72
    invoke-static {v3}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    const/4 v7, 0x0

    .line 77
    cmpl-float v6, v6, v7

    .line 78
    .line 79
    add-int/lit8 v6, v6, 0x31

    .line 80
    .line 81
    const-string v7, ""

    .line 82
    .line 83
    invoke-static {v7}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    rsub-int/lit8 v7, v7, 0x1

    .line 88
    .line 89
    invoke-static {v5, v1, v6, v7, v2}, LVa/fa;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    :cond_1
    invoke-virtual {p0, v4}, LVa/fa;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    move v1, v3

    .line 108
    goto :goto_0

    .line 109
    :cond_2
    const/4 p1, 0x4

    .line 110
    const/16 v1, 0x7d

    .line 111
    .line 112
    filled-new-array {p1, v2, v1, v3}, [I

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {v5, p1, v3}, LVa/fa;->h(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    return-object p1
.end method
