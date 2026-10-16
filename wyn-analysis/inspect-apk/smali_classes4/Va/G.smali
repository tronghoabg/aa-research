.class public final LVa/G;
.super LVa/Mb;
.source "SourceFile"


# static fields
.field public static C:LVa/G; = null

.field public static final D:[C

.field public static E:I = 0x0

.field public static F:I = 0x1


# instance fields
.field public A:Z

.field public B:LVa/H;

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public k:LVa/Ra;

.field public l:LVa/z;

.field public m:Landroid/os/Handler;

.field public n:LVa/C;

.field public o:LVa/D;

.field public p:LVa/E;

.field public q:LVa/C;

.field public r:LVa/Fb;

.field public s:Ljava/util/ArrayList;

.field public t:Ljava/util/ArrayList;

.field public u:LVa/Eb;

.field public v:Z

.field public w:I

.field public x:Z

.field public y:LVa/A;

.field public z:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/G;->D:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x65s
        0x6ds
        0x64s
        0x63s
        0x73s
        0x6cs
        0x75s
        0x74s
        0x72s
        0x61s
        0x62s
        0x6bs
        0x2es
        0x76s
        0x6fs
        0x6es
        0x66s
        0x69s
        0x67s
        0x52s
        0x43s
        0x70s
        0x71s
        0x55s
        0x54s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    invoke-static {v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    add-int/lit8 v1, v1, 0x3

    .line 11
    .line 12
    const-string v2, "\u6f91\u2e76\uf9ff\u0703"

    .line 13
    .line 14
    invoke-static {v1, v2}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/lit8 v2, v2, 0x3

    .line 27
    .line 28
    invoke-static {v0}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    add-int/lit8 v3, v3, 0x3a

    .line 33
    .line 34
    int-to-byte v3, v3

    .line 35
    const-string v4, "\u0001\u0002\u009d"

    .line 36
    .line 37
    invoke-static {v3, v2, v4}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    shr-int/lit8 v2, v2, 0x16

    .line 49
    .line 50
    add-int/lit8 v2, v2, 0x4

    .line 51
    .line 52
    const-string v3, "\u6cb8\ue0fe\u6a35\u3604"

    .line 53
    .line 54
    invoke-static {v2, v3}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 62
    .line 63
    .line 64
    move-result-wide v2

    .line 65
    const-wide/16 v4, -0x1

    .line 66
    .line 67
    cmp-long v2, v2, v4

    .line 68
    .line 69
    rsub-int/lit8 v2, v2, 0x5

    .line 70
    .line 71
    const-string v3, "\u357a\ucac5\u6a35\u3604"

    .line 72
    .line 73
    invoke-static {v2, v3}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    const/4 v3, 0x0

    .line 85
    cmpl-float v2, v2, v3

    .line 86
    .line 87
    add-int/lit8 v2, v2, 0x3

    .line 88
    .line 89
    const-string v3, "\u4ee5\u5206\u17ac\ud010"

    .line 90
    .line 91
    invoke-static {v2, v3}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    shr-int/lit8 v2, v2, 0x16

    .line 103
    .line 104
    rsub-int/lit8 v2, v2, 0x4

    .line 105
    .line 106
    const-string v3, "\u9f8e\ue3c9\u31ac\uec5b"

    .line 107
    .line 108
    invoke-static {v2, v3}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    const/16 v2, 0x30

    .line 116
    .line 117
    invoke-static {v0, v2, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    add-int/lit8 v2, v2, 0x5

    .line 122
    .line 123
    invoke-static {v0, v1}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    rsub-int/lit8 v0, v0, 0x21

    .line 128
    .line 129
    int-to-byte v0, v0

    .line 130
    const-string v3, "\u0004\u0000\u0007\u0000"

    .line 131
    .line 132
    invoke-static {v0, v2, v3}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    shr-int/lit8 v0, v0, 0x18

    .line 144
    .line 145
    add-int/lit8 v0, v0, 0x3

    .line 146
    .line 147
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    rsub-int/lit8 v2, v2, 0x40

    .line 152
    .line 153
    int-to-byte v2, v2

    .line 154
    const-string v3, "\u0000\t\u00a4"

    .line 155
    .line 156
    invoke-static {v2, v0, v3}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    invoke-static {v1}, Landroid/os/Process;->getThreadPriority(I)I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    add-int/lit8 v0, v0, 0x14

    .line 168
    .line 169
    shr-int/lit8 v0, v0, 0x6

    .line 170
    .line 171
    add-int/lit8 v0, v0, 0x4

    .line 172
    .line 173
    const-string v2, "\uab4f\u3daa\uee6a\u0349"

    .line 174
    .line 175
    invoke-static {v0, v2}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    shr-int/lit8 v0, v0, 0x10

    .line 187
    .line 188
    add-int/lit8 v0, v0, 0x3

    .line 189
    .line 190
    const-string v2, "\ubd8c\u0dd3\u5578\uc6b5"

    .line 191
    .line 192
    invoke-static {v0, v2}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    add-int/lit8 v0, v0, 0x3

    .line 204
    .line 205
    const-wide/16 v2, 0x0

    .line 206
    .line 207
    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    rsub-int/lit8 v2, v2, 0x73

    .line 212
    .line 213
    int-to-byte v2, v2

    .line 214
    const-string v3, "\t\u0001\u00e7"

    .line 215
    .line 216
    invoke-static {v2, v0, v3}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    invoke-static {v1}, Landroid/os/Process;->getThreadPriority(I)I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    add-int/lit8 v0, v0, 0x14

    .line 228
    .line 229
    shr-int/lit8 v0, v0, 0x6

    .line 230
    .line 231
    add-int/lit8 v0, v0, 0x4

    .line 232
    .line 233
    invoke-static {v1, v1}, Landroid/view/View;->getDefaultSize(II)I

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    add-int/lit8 v2, v2, 0x76

    .line 238
    .line 239
    int-to-byte v2, v2

    .line 240
    const-string v3, "\u0002\u0006\u0007\u000c"

    .line 241
    .line 242
    invoke-static {v2, v0, v3}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    .line 250
    .line 251
    const-wide/16 v2, 0x18

    .line 252
    .line 253
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 254
    .line 255
    .line 256
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 257
    .line 258
    const-wide/16 v3, 0x5

    .line 259
    .line 260
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 261
    .line 262
    .line 263
    move-result-wide v3

    .line 264
    long-to-int v3, v3

    .line 265
    iput v3, p0, LVa/G;->g:I

    .line 266
    .line 267
    const-wide/16 v3, 0xc

    .line 268
    .line 269
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 270
    .line 271
    .line 272
    move-result-wide v3

    .line 273
    long-to-int v0, v3

    .line 274
    iput v0, p0, LVa/G;->h:I

    .line 275
    .line 276
    const-wide/16 v3, 0x3

    .line 277
    .line 278
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 279
    .line 280
    .line 281
    move-result-wide v3

    .line 282
    long-to-int v0, v3

    .line 283
    iput v0, p0, LVa/G;->i:I

    .line 284
    .line 285
    const-wide/16 v3, 0xa

    .line 286
    .line 287
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 288
    .line 289
    .line 290
    move-result-wide v2

    .line 291
    long-to-int v0, v2

    .line 292
    iput v0, p0, LVa/G;->j:I

    .line 293
    .line 294
    iput v1, p0, LVa/G;->w:I

    .line 295
    .line 296
    const/4 v0, 0x0

    .line 297
    iput-object v0, p0, LVa/G;->z:Ljava/util/ArrayList;

    .line 298
    .line 299
    iput-boolean v1, p0, LVa/G;->A:Z

    .line 300
    .line 301
    return-void
.end method

.method public static declared-synchronized S()LVa/G;
    .locals 2

    .line 1
    const-class v0, LVa/G;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, LVa/G;->C:LVa/G;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, LVa/G;

    .line 9
    .line 10
    invoke-direct {v1}, LVa/G;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, LVa/G;->C:LVa/G;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    sget-object v1, LVa/G;->C:LVa/G;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v1
.end method

.method public static T(ILjava/lang/String;)Ljava/lang/String;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->F:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    array-length v1, p1

    .line 11
    new-array v1, v1, [C

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    sput v2, LVa/Ab;->E:I

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    new-array v3, v3, [C

    .line 18
    .line 19
    :goto_0
    sget v4, LVa/Ab;->E:I

    .line 20
    .line 21
    array-length v5, p1

    .line 22
    if-ge v4, v5, :cond_1

    .line 23
    .line 24
    aget-char v5, p1, v4

    .line 25
    .line 26
    aput-char v5, v3, v2

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    aget-char v4, p1, v4

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    aput-char v4, v3, v5

    .line 34
    .line 35
    const v4, 0xe370

    .line 36
    .line 37
    .line 38
    move v6, v2

    .line 39
    :goto_1
    const/16 v7, 0x10

    .line 40
    .line 41
    if-ge v6, v7, :cond_0

    .line 42
    .line 43
    aget-char v7, v3, v5

    .line 44
    .line 45
    aget-char v8, v3, v2

    .line 46
    .line 47
    add-int v9, v8, v4

    .line 48
    .line 49
    shl-int/lit8 v10, v8, 0x4

    .line 50
    .line 51
    add-int/lit16 v10, v10, 0x79b8

    .line 52
    .line 53
    xor-int/2addr v9, v10

    .line 54
    ushr-int/lit8 v10, v8, 0x5

    .line 55
    .line 56
    const v11, 0xb54c

    .line 57
    .line 58
    .line 59
    add-int/2addr v10, v11

    .line 60
    xor-int/2addr v9, v10

    .line 61
    sub-int/2addr v7, v9

    .line 62
    int-to-char v7, v7

    .line 63
    aput-char v7, v3, v5

    .line 64
    .line 65
    add-int v9, v7, v4

    .line 66
    .line 67
    shl-int/lit8 v10, v7, 0x4

    .line 68
    .line 69
    add-int/lit16 v10, v10, 0x6153

    .line 70
    .line 71
    xor-int/2addr v9, v10

    .line 72
    ushr-int/lit8 v7, v7, 0x5

    .line 73
    .line 74
    add-int/lit16 v7, v7, 0x18e7

    .line 75
    .line 76
    xor-int/2addr v7, v9

    .line 77
    sub-int/2addr v8, v7

    .line 78
    int-to-char v7, v8

    .line 79
    aput-char v7, v3, v2

    .line 80
    .line 81
    const v7, 0x9e37

    .line 82
    .line 83
    .line 84
    sub-int/2addr v4, v7

    .line 85
    add-int/lit8 v6, v6, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception p0

    .line 89
    goto :goto_2

    .line 90
    :cond_0
    sget v4, LVa/Ab;->E:I

    .line 91
    .line 92
    aget-char v6, v3, v2

    .line 93
    .line 94
    aput-char v6, v1, v4

    .line 95
    .line 96
    add-int/lit8 v6, v4, 0x1

    .line 97
    .line 98
    aget-char v5, v3, v5

    .line 99
    .line 100
    aput-char v5, v1, v6

    .line 101
    .line 102
    add-int/lit8 v4, v4, 0x2

    .line 103
    .line 104
    sput v4, LVa/Ab;->E:I

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    new-instance p1, Ljava/lang/String;

    .line 108
    .line 109
    invoke-direct {p1, v1, v2, p0}, Ljava/lang/String;-><init>([CII)V

    .line 110
    .line 111
    .line 112
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    return-object p1

    .line 114
    :goto_2
    monitor-exit v0

    .line 115
    throw p0
.end method

.method public static W(BILjava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->B:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sget-object v1, LVa/G;->D:[C

    .line 11
    .line 12
    new-array v2, p1, [C

    .line 13
    .line 14
    rem-int/lit8 v3, p1, 0x2

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    add-int/lit8 p1, p1, -0x1

    .line 19
    .line 20
    aget-char v3, p2, p1

    .line 21
    .line 22
    sub-int/2addr v3, p0

    .line 23
    int-to-char v3, v3

    .line 24
    aput-char v3, v2, p1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_3

    .line 29
    :cond_0
    :goto_0
    const/4 v3, 0x1

    .line 30
    if-le p1, v3, :cond_4

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    sput v3, LVa/Ab;->A:I

    .line 34
    .line 35
    :goto_1
    sget v3, LVa/Ab;->A:I

    .line 36
    .line 37
    if-ge v3, p1, :cond_4

    .line 38
    .line 39
    aget-char v4, p2, v3

    .line 40
    .line 41
    add-int/lit8 v5, v3, 0x1

    .line 42
    .line 43
    aget-char v6, p2, v5

    .line 44
    .line 45
    if-ne v4, v6, :cond_1

    .line 46
    .line 47
    sub-int/2addr v4, p0

    .line 48
    int-to-char v4, v4

    .line 49
    aput-char v4, v2, v3

    .line 50
    .line 51
    sub-int/2addr v6, p0

    .line 52
    int-to-char v4, v6

    .line 53
    aput-char v4, v2, v5

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    div-int/lit8 v7, v4, 0x5

    .line 57
    .line 58
    rem-int/lit8 v4, v4, 0x5

    .line 59
    .line 60
    div-int/lit8 v8, v6, 0x5

    .line 61
    .line 62
    rem-int/lit8 v6, v6, 0x5

    .line 63
    .line 64
    if-ne v4, v6, :cond_2

    .line 65
    .line 66
    add-int/lit8 v7, v7, 0x4

    .line 67
    .line 68
    rem-int/lit8 v7, v7, 0x5

    .line 69
    .line 70
    add-int/lit8 v8, v8, 0x4

    .line 71
    .line 72
    rem-int/lit8 v8, v8, 0x5

    .line 73
    .line 74
    mul-int/lit8 v7, v7, 0x5

    .line 75
    .line 76
    add-int/2addr v7, v4

    .line 77
    mul-int/lit8 v8, v8, 0x5

    .line 78
    .line 79
    add-int/2addr v8, v6

    .line 80
    aget-char v4, v1, v7

    .line 81
    .line 82
    aput-char v4, v2, v3

    .line 83
    .line 84
    aget-char v4, v1, v8

    .line 85
    .line 86
    aput-char v4, v2, v5

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    if-ne v7, v8, :cond_3

    .line 90
    .line 91
    add-int/lit8 v4, v4, 0x4

    .line 92
    .line 93
    rem-int/lit8 v4, v4, 0x5

    .line 94
    .line 95
    add-int/lit8 v6, v6, 0x4

    .line 96
    .line 97
    rem-int/lit8 v6, v6, 0x5

    .line 98
    .line 99
    mul-int/lit8 v7, v7, 0x5

    .line 100
    .line 101
    add-int/2addr v7, v4

    .line 102
    mul-int/lit8 v8, v8, 0x5

    .line 103
    .line 104
    add-int/2addr v8, v6

    .line 105
    aget-char v4, v1, v7

    .line 106
    .line 107
    aput-char v4, v2, v3

    .line 108
    .line 109
    aget-char v4, v1, v8

    .line 110
    .line 111
    aput-char v4, v2, v5

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    mul-int/lit8 v7, v7, 0x5

    .line 115
    .line 116
    add-int/2addr v7, v6

    .line 117
    mul-int/lit8 v8, v8, 0x5

    .line 118
    .line 119
    add-int/2addr v8, v4

    .line 120
    aget-char v4, v1, v7

    .line 121
    .line 122
    aput-char v4, v2, v3

    .line 123
    .line 124
    aget-char v4, v1, v8

    .line 125
    .line 126
    aput-char v4, v2, v5

    .line 127
    .line 128
    :goto_2
    add-int/lit8 v3, v3, 0x2

    .line 129
    .line 130
    sput v3, LVa/Ab;->A:I

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_4
    new-instance p0, Ljava/lang/String;

    .line 134
    .line 135
    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    .line 136
    .line 137
    .line 138
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    return-object p0

    .line 140
    :goto_3
    monitor-exit v0

    .line 141
    throw p0
.end method

.method public static synthetic Y(LVa/G;LVa/Fb;)V
    .locals 3

    .line 1
    sget v0, LVa/G;->F:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x3d

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/G;->E:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iput-object p1, p0, LVa/G;->r:LVa/Fb;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x27

    .line 17
    .line 18
    rem-int/lit16 p0, v0, 0x80

    .line 19
    .line 20
    sput p0, LVa/G;->E:I

    .line 21
    .line 22
    rem-int/lit8 v0, v0, 0x2

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    throw v2

    .line 28
    :cond_1
    throw v2
.end method

.method public static synthetic b0(LVa/G;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    sget v0, LVa/G;->E:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/G;->F:I

    .line 8
    .line 9
    iget-object p0, p0, LVa/G;->s:Ljava/util/ArrayList;

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x3d

    .line 12
    .line 13
    rem-int/lit16 v1, v0, 0x80

    .line 14
    .line 15
    sput v1, LVa/G;->E:I

    .line 16
    .line 17
    rem-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    throw p0
.end method

.method public static e0(Lorg/json/JSONObject;J)V
    .locals 7

    .line 1
    sget v0, LVa/G;->E:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/G;->F:I

    .line 8
    .line 9
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    shr-int/lit8 v0, v0, 0x10

    .line 14
    .line 15
    rsub-int/lit8 v0, v0, 0x3

    .line 16
    .line 17
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    shr-int/lit8 v1, v1, 0x10

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x2a

    .line 24
    .line 25
    int-to-byte v1, v1

    .line 26
    const-string v2, "\u0002\t\u009d"

    .line 27
    .line 28
    invoke-static {v1, v0, v2}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/4 v1, 0x1

    .line 41
    if-eq v0, v1, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v0, 0x0

    .line 45
    :try_start_0
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    rsub-int/lit8 v1, v1, 0x3

    .line 50
    .line 51
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    const-wide/16 v5, 0x0

    .line 56
    .line 57
    cmp-long v3, v3, v5

    .line 58
    .line 59
    rsub-int/lit8 v3, v3, 0x2b

    .line 60
    .line 61
    int-to-byte v3, v3

    .line 62
    invoke-static {v3, v1, v2}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {v0, v0}, Landroid/view/View;->getDefaultSize(II)I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    add-int/lit8 v3, v3, 0x3

    .line 75
    .line 76
    invoke-static {v0, v0}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    add-int/lit8 v0, v0, 0x2a

    .line 81
    .line 82
    int-to-byte v0, v0

    .line 83
    invoke-static {v0, v3, v2}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 92
    .line 93
    .line 94
    move-result-wide v2

    .line 95
    const-wide/16 v4, 0x2

    .line 96
    .line 97
    div-long/2addr p1, v4

    .line 98
    add-long/2addr v2, p1

    .line 99
    invoke-virtual {p0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    .line 101
    .line 102
    sget p0, LVa/G;->E:I

    .line 103
    .line 104
    add-int/lit8 p0, p0, 0x2d

    .line 105
    .line 106
    rem-int/lit16 p0, p0, 0x80

    .line 107
    .line 108
    sput p0, LVa/G;->F:I

    .line 109
    .line 110
    :catch_0
    :goto_0
    sget p0, LVa/G;->E:I

    .line 111
    .line 112
    add-int/lit8 p0, p0, 0x1f

    .line 113
    .line 114
    rem-int/lit16 p0, p0, 0x80

    .line 115
    .line 116
    sput p0, LVa/G;->F:I

    .line 117
    .line 118
    return-void
.end method

.method public static synthetic h0(LVa/G;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    sget v0, LVa/G;->E:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x17

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/G;->F:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    iget-object p0, p0, LVa/G;->t:Ljava/util/ArrayList;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x5b

    .line 16
    .line 17
    rem-int/lit16 v0, v0, 0x80

    .line 18
    .line 19
    sput v0, LVa/G;->F:I

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    throw p0
.end method


# virtual methods
.method public final A()Ljava/util/HashMap;
    .locals 3

    .line 1
    sget v0, LVa/G;->E:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x9

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/G;->F:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0}, LVa/G;->u()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    sget v0, LVa/G;->F:I

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1b

    .line 23
    .line 24
    rem-int/lit16 v0, v0, 0x80

    .line 25
    .line 26
    sput v0, LVa/G;->E:I

    .line 27
    .line 28
    iget-object v0, p0, LVa/G;->B:LVa/H;

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    .line 34
    .line 35
    iget-object v1, p0, LVa/G;->B:LVa/H;

    .line 36
    .line 37
    invoke-virtual {v1}, LVa/H;->b()Lj$/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 42
    .line 43
    .line 44
    sget v1, LVa/G;->E:I

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x63

    .line 47
    .line 48
    rem-int/lit16 v2, v1, 0x80

    .line 49
    .line 50
    sput v2, LVa/G;->F:I

    .line 51
    .line 52
    rem-int/lit8 v1, v1, 0x2

    .line 53
    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    const/16 v1, 0x4f

    .line 57
    .line 58
    div-int/lit8 v1, v1, 0x0

    .line 59
    .line 60
    :cond_1
    return-object v0

    .line 61
    :cond_2
    :goto_0
    return-object v1

    .line 62
    :cond_3
    invoke-virtual {p0}, LVa/G;->u()Z

    .line 63
    .line 64
    .line 65
    throw v1
.end method

.method public final B()Z
    .locals 3

    .line 1
    sget v0, LVa/G;->E:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/G;->F:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const-string v2, "\ubd8c\u0dd3\u5578\uc6b5"

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v1}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/lit8 v1, v1, 0x2

    .line 25
    .line 26
    :goto_0
    invoke-static {v1, v2}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    return v0

    .line 39
    :cond_0
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v1}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    rsub-int/lit8 v1, v1, 0x3

    .line 48
    .line 49
    goto :goto_0
.end method

.method public final C()Z
    .locals 3

    .line 1
    sget v0, LVa/G;->F:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x47

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/G;->E:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, "\uab4f\u3daa\uee6a\u0349"

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    mul-int/lit8 v2, v2, 0x60

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x4

    .line 26
    .line 27
    :goto_0
    invoke-static {v2, v1}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    shr-int/lit8 v2, v2, 0x18

    .line 49
    .line 50
    rsub-int/lit8 v2, v2, 0x4

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :goto_1
    sget v1, LVa/G;->F:I

    .line 54
    .line 55
    add-int/lit8 v1, v1, 0x59

    .line 56
    .line 57
    rem-int/lit16 v2, v1, 0x80

    .line 58
    .line 59
    sput v2, LVa/G;->E:I

    .line 60
    .line 61
    rem-int/lit8 v1, v1, 0x2

    .line 62
    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    const/16 v1, 0x4e

    .line 66
    .line 67
    div-int/lit8 v1, v1, 0x0

    .line 68
    .line 69
    :cond_1
    return v0
.end method

.method public final D()Z
    .locals 6

    .line 1
    sget v0, LVa/G;->F:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x63

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/G;->E:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, ""

    .line 12
    .line 13
    const-string v2, "\u0004\u0000\u0007\u0000"

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    add-int/lit8 v3, v3, 0x5

    .line 27
    .line 28
    const/16 v4, 0x47

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    invoke-static {v1, v4, v5}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/16 v4, 0x75

    .line 36
    .line 37
    rem-int/2addr v4, v1

    .line 38
    int-to-byte v1, v4

    .line 39
    invoke-static {v1, v3, v2}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    return v0

    .line 52
    :cond_0
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    add-int/lit8 v4, v4, 0x4

    .line 61
    .line 62
    const/16 v5, 0x30

    .line 63
    .line 64
    invoke-static {v1, v5, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    rsub-int/lit8 v1, v1, 0x20

    .line 69
    .line 70
    int-to-byte v1, v1

    .line 71
    invoke-static {v1, v4, v2}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    goto :goto_0
.end method

.method public final E()I
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    shr-int/lit8 v1, v1, 0x16

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x3

    .line 13
    .line 14
    const-string v2, "\u0000\t\u00a4"

    .line 15
    .line 16
    const-string v3, ""

    .line 17
    .line 18
    const-string v4, ""

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    invoke-static {v3, v4, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    rsub-int/lit8 v3, v3, 0x40

    .line 26
    .line 27
    int-to-byte v3, v3

    .line 28
    invoke-static {v3, v1, v2}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const/16 v2, 0x64

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    return v0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    monitor-exit p0

    .line 46
    throw v0
.end method

.method public final F()J
    .locals 6

    .line 1
    sget v0, LVa/G;->E:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/G;->F:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/G;->k:LVa/Ra;

    .line 10
    .line 11
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    shr-int/lit8 v1, v1, 0x8

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x25

    .line 18
    .line 19
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    const-wide/16 v4, -0x1

    .line 24
    .line 25
    cmp-long v2, v2, v4

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x28

    .line 28
    .line 29
    int-to-byte v2, v2

    .line 30
    const-string v3, "\t\n\u0010\u0013\u000e\u0007\u0007\u0002\n\u0007\u000e\t\u0005\u0016\n\u0013\u0014\u0005\u0002\u0008\r\t\u0018\u0016\u0004\u0007\u0005\u0002\u0016\u0013\u0002\u0001\u0002\t\u0006\u0004\u0099"

    .line 31
    .line 32
    invoke-static {v2, v1, v3}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

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
    invoke-virtual {v0, v1}, LVa/Ra;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    sget v1, LVa/G;->E:I

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x7d

    .line 53
    .line 54
    rem-int/lit16 v2, v1, 0x80

    .line 55
    .line 56
    sput v2, LVa/G;->F:I

    .line 57
    .line 58
    rem-int/lit8 v1, v1, 0x2

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v0

    .line 66
    return-wide v0

    .line 67
    :cond_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 68
    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    throw v0

    .line 72
    :cond_1
    const-wide/16 v0, 0x0

    .line 73
    .line 74
    return-wide v0
.end method

.method public final G()Lorg/json/JSONObject;
    .locals 8

    .line 1
    iget-object v0, p0, LVa/Mb;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LVa/W;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    sget v2, LVa/G;->E:I

    .line 9
    .line 10
    add-int/lit8 v2, v2, 0x2d

    .line 11
    .line 12
    rem-int/lit16 v2, v2, 0x80

    .line 13
    .line 14
    sput v2, LVa/G;->F:I

    .line 15
    .line 16
    iget-object v2, v0, LVa/W;->d:Lorg/json/JSONObject;

    .line 17
    .line 18
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    shr-int/lit8 v3, v3, 0x10

    .line 23
    .line 24
    rsub-int/lit8 v3, v3, 0x4

    .line 25
    .line 26
    const-string v4, ""

    .line 27
    .line 28
    const/16 v5, 0x30

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    invoke-static {v4, v5, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    add-int/lit16 v4, v4, 0xc2

    .line 36
    .line 37
    invoke-static {v6, v6}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    add-int/lit8 v5, v5, 0x3

    .line 42
    .line 43
    const-string v7, "\u000c\ufffe\ufffb\ufffc"

    .line 44
    .line 45
    invoke-static {v7, v3, v4, v5, v6}, LVa/W;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    if-nez v2, :cond_1

    .line 58
    .line 59
    sget v2, LVa/W;->h:I

    .line 60
    .line 61
    add-int/lit8 v3, v2, 0x5f

    .line 62
    .line 63
    rem-int/lit16 v4, v3, 0x80

    .line 64
    .line 65
    sput v4, LVa/W;->g:I

    .line 66
    .line 67
    rem-int/lit8 v3, v3, 0x2

    .line 68
    .line 69
    if-nez v3, :cond_0

    .line 70
    .line 71
    iget-object v0, v0, LVa/W;->e:Lorg/json/JSONObject;

    .line 72
    .line 73
    add-int/lit8 v2, v2, 0xb

    .line 74
    .line 75
    rem-int/lit16 v2, v2, 0x80

    .line 76
    .line 77
    sput v2, LVa/W;->g:I

    .line 78
    .line 79
    move-object v2, v0

    .line 80
    goto :goto_0

    .line 81
    :cond_0
    throw v1

    .line 82
    :cond_1
    :goto_0
    sget v0, LVa/W;->h:I

    .line 83
    .line 84
    add-int/lit8 v0, v0, 0x5f

    .line 85
    .line 86
    rem-int/lit16 v0, v0, 0x80

    .line 87
    .line 88
    sput v0, LVa/W;->g:I

    .line 89
    .line 90
    sget v0, LVa/G;->E:I

    .line 91
    .line 92
    add-int/lit8 v0, v0, 0x3

    .line 93
    .line 94
    rem-int/lit16 v1, v0, 0x80

    .line 95
    .line 96
    sput v1, LVa/G;->F:I

    .line 97
    .line 98
    rem-int/lit8 v0, v0, 0x2

    .line 99
    .line 100
    if-nez v0, :cond_2

    .line 101
    .line 102
    const/16 v0, 0x29

    .line 103
    .line 104
    div-int/2addr v0, v6

    .line 105
    :cond_2
    return-object v2

    .line 106
    :cond_3
    return-object v1
.end method

.method public final declared-synchronized H()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LVa/G;->m:Landroid/os/Handler;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iput-object v1, p0, LVa/G;->m:Landroid/os/Handler;

    .line 9
    .line 10
    new-instance v0, LVa/F;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, v1}, LVa/F;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object p0, v0, LVa/F;->d:LVa/G;

    .line 17
    .line 18
    invoke-static {v0}, LVa/Cb;->g(LVa/Ba;)V

    .line 19
    .line 20
    .line 21
    sget v0, LVa/G;->E:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x3

    .line 24
    .line 25
    rem-int/lit16 v0, v0, 0x80

    .line 26
    .line 27
    sput v0, LVa/G;->F:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    monitor-exit p0

    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw v0
.end method

.method public final I()Ljava/lang/String;
    .locals 10

    .line 1
    sget v0, LVa/G;->E:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/G;->F:I

    .line 8
    .line 9
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    sget v0, LVa/G;->E:I

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x39

    .line 19
    .line 20
    rem-int/lit16 v2, v0, 0x80

    .line 21
    .line 22
    sput v2, LVa/G;->F:I

    .line 23
    .line 24
    rem-int/lit8 v0, v0, 0x2

    .line 25
    .line 26
    const-string v2, "\u0007\u000c\u0007\u000c"

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x4

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    rem-int v5, v4, v5

    .line 41
    .line 42
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    mul-int/lit8 v6, v6, 0xc

    .line 47
    .line 48
    const/16 v7, 0x51

    .line 49
    .line 50
    rem-int/2addr v7, v6

    .line 51
    int-to-byte v6, v7

    .line 52
    invoke-static {v6, v5, v2}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_0

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    return-object v0

    .line 72
    :cond_1
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    add-int/2addr v5, v4

    .line 81
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    shr-int/lit8 v6, v6, 0x8

    .line 86
    .line 87
    rsub-int/lit8 v6, v6, 0x3d

    .line 88
    .line 89
    int-to-byte v6, v6

    .line 90
    invoke-static {v6, v5, v2}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_3

    .line 107
    .line 108
    :goto_0
    iget-object v0, p0, LVa/Mb;->b:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, LVa/W;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    sget v2, LVa/W;->g:I

    .line 116
    .line 117
    add-int/lit8 v2, v2, 0x57

    .line 118
    .line 119
    rem-int/lit16 v2, v2, 0x80

    .line 120
    .line 121
    sput v2, LVa/W;->h:I

    .line 122
    .line 123
    iget-object v0, v0, LVa/W;->d:Lorg/json/JSONObject;

    .line 124
    .line 125
    invoke-static {v3, v3}, Landroid/view/View;->resolveSize(II)I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    add-int/2addr v2, v4

    .line 130
    const-string v5, ""

    .line 131
    .line 132
    invoke-static {v5, v3, v3}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    rsub-int v5, v5, 0xc5

    .line 137
    .line 138
    invoke-static {v3}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    const-wide/16 v8, 0x0

    .line 143
    .line 144
    cmp-long v6, v6, v8

    .line 145
    .line 146
    sub-int/2addr v4, v6

    .line 147
    const/4 v6, 0x1

    .line 148
    const-string v7, "\u0008\ufff8\u0008\ufff8"

    .line 149
    .line 150
    invoke-static {v7, v2, v5, v4, v6}, LVa/W;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-static {v3}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    const/4 v4, 0x0

    .line 163
    cmpl-float v3, v3, v4

    .line 164
    .line 165
    add-int/lit8 v3, v3, 0x7f

    .line 166
    .line 167
    const-string v4, "\u0097\u008c\u0081"

    .line 168
    .line 169
    invoke-static {v3, v4}, LVa/W;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    sget v2, LVa/W;->h:I

    .line 182
    .line 183
    add-int/lit8 v2, v2, 0x25

    .line 184
    .line 185
    rem-int/lit16 v3, v2, 0x80

    .line 186
    .line 187
    sput v3, LVa/W;->g:I

    .line 188
    .line 189
    rem-int/lit8 v2, v2, 0x2

    .line 190
    .line 191
    if-nez v2, :cond_2

    .line 192
    .line 193
    return-object v0

    .line 194
    :cond_2
    throw v1

    .line 195
    :cond_3
    return-object v0

    .line 196
    :cond_4
    return-object v1
.end method

.method public final J()LVa/E;
    .locals 2

    .line 1
    sget v0, LVa/G;->E:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/G;->F:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LVa/G;->p:LVa/E;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    throw v0
.end method

.method public final K()LVa/C;
    .locals 2

    .line 1
    sget v0, LVa/G;->F:I

    .line 2
    .line 3
    iget-object v1, p0, LVa/G;->q:LVa/C;

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x6b

    .line 6
    .line 7
    rem-int/lit16 v0, v0, 0x80

    .line 8
    .line 9
    sput v0, LVa/G;->E:I

    .line 10
    .line 11
    return-object v1
.end method

.method public final L()LVa/D;
    .locals 2

    .line 1
    sget v0, LVa/G;->F:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x43

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/G;->E:I

    .line 8
    .line 9
    iget-object v1, p0, LVa/G;->o:LVa/D;

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1d

    .line 12
    .line 13
    rem-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    sput v0, LVa/G;->F:I

    .line 16
    .line 17
    return-object v1
.end method

.method public final M()Ljava/lang/String;
    .locals 3

    .line 1
    sget v0, LVa/G;->F:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x39

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/G;->E:I

    .line 8
    .line 9
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    rsub-int/lit8 v1, v1, 0x3

    .line 19
    .line 20
    const-string v2, "\u6f91\u2e76\uf9ff\u0703"

    .line 21
    .line 22
    invoke-static {v1, v2}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget v1, LVa/G;->F:I

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x71

    .line 37
    .line 38
    rem-int/lit16 v1, v1, 0x80

    .line 39
    .line 40
    sput v1, LVa/G;->E:I

    .line 41
    .line 42
    return-object v0
.end method

.method public final N()D
    .locals 4

    .line 1
    sget v0, LVa/G;->E:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x39

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/G;->F:I

    .line 8
    .line 9
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {v1}, Landroid/os/Process;->getThreadPriority(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    add-int/lit8 v1, v1, 0x14

    .line 19
    .line 20
    shr-int/lit8 v1, v1, 0x6

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x4

    .line 23
    .line 24
    const-string v2, "\u4ee5\u5206\u17ac\ud010"

    .line 25
    .line 26
    invoke-static {v1, v2}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    sget v2, LVa/G;->F:I

    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x9

    .line 43
    .line 44
    rem-int/lit16 v2, v2, 0x80

    .line 45
    .line 46
    sput v2, LVa/G;->E:I

    .line 47
    .line 48
    return-wide v0
.end method

.method public final declared-synchronized O()Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/G;->F:I

    .line 3
    .line 4
    iget-boolean v1, p0, LVa/G;->v:Z

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x7d

    .line 7
    .line 8
    rem-int/lit16 v2, v0, 0x80

    .line 9
    .line 10
    sput v2, LVa/G;->E:I

    .line 11
    .line 12
    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    monitor-exit p0

    .line 17
    return v1

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    :try_start_2
    throw v0

    .line 22
    :catchall_1
    move-exception v0

    .line 23
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 24
    throw v0
.end method

.method public final P()Z
    .locals 4

    .line 1
    sget v0, LVa/G;->F:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x21

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/G;->E:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-boolean v0, p0, LVa/G;->x:Z

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x4d

    .line 17
    .line 18
    rem-int/lit16 v3, v1, 0x80

    .line 19
    .line 20
    sput v3, LVa/G;->F:I

    .line 21
    .line 22
    rem-int/lit8 v1, v1, 0x2

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    return v0

    .line 27
    :cond_0
    throw v2

    .line 28
    :cond_1
    throw v2
.end method

.method public final Q(Landroid/content/Context;LVa/z;LVa/A;LVa/Eb;Z)V
    .locals 6

    .line 1
    new-instance v0, LVa/Ra;

    .line 2
    .line 3
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    shr-int/lit8 v1, v1, 0x10

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x1c

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {v2, v2}, Landroid/view/View;->resolveSize(II)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    rsub-int/lit8 v3, v3, 0xc

    .line 17
    .line 18
    int-to-byte v3, v3

    .line 19
    const-string v4, "\u0008\t\u0008\u0004\u0005\u000f\u0008\u0004\u000c\r\u000c\u000e\u0011\u0007\u000b\r\u0005\u0003\u0004\u000b\u0005\u0002\u0004\r\u0010\u0011\u0012\u0013"

    .line 20
    .line 21
    invoke-static {v3, v1, v4}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static {v3, v3}, Landroid/graphics/PointF;->length(FF)F

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    cmpl-float v4, v4, v3

    .line 35
    .line 36
    add-int/lit8 v4, v4, 0x14

    .line 37
    .line 38
    const-string v5, "\u21fe\ua93b\u79ab\uaaf3\u27d5\u3a7f\ua767\u1ac1\u8a93\ued55\u1310\uc149\uf22a\u39a8\u40bf\ue8dc\u28be\u7664\u82da\u54e0"

    .line 39
    .line 40
    invoke-static {v4, v5}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-direct {v0, p1, v1, v4}, LVa/Ra;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, LVa/G;->k:LVa/Ra;

    .line 52
    .line 53
    iput-object p2, p0, LVa/G;->l:LVa/z;

    .line 54
    .line 55
    iput-boolean v2, p0, LVa/G;->v:Z

    .line 56
    .line 57
    iput-boolean p5, p0, LVa/G;->x:Z

    .line 58
    .line 59
    iput-object p3, p0, LVa/G;->y:LVa/A;

    .line 60
    .line 61
    new-instance p1, Landroid/os/Handler;

    .line 62
    .line 63
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, LVa/G;->m:Landroid/os/Handler;

    .line 71
    .line 72
    new-instance p1, LVa/W;

    .line 73
    .line 74
    invoke-direct {p1}, LVa/W;-><init>()V

    .line 75
    .line 76
    .line 77
    new-instance p2, LVa/C;

    .line 78
    .line 79
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object p1, p2, LVa/Mb;->b:Ljava/lang/Object;

    .line 83
    .line 84
    iput-object p2, p0, LVa/G;->n:LVa/C;

    .line 85
    .line 86
    new-instance p2, LVa/D;

    .line 87
    .line 88
    invoke-direct {p2, p1}, LVa/D;-><init>(LVa/W;)V

    .line 89
    .line 90
    .line 91
    iput-object p2, p0, LVa/G;->o:LVa/D;

    .line 92
    .line 93
    new-instance p2, LVa/E;

    .line 94
    .line 95
    invoke-direct {p2, p1}, LVa/E;-><init>(LVa/W;)V

    .line 96
    .line 97
    .line 98
    iput-object p2, p0, LVa/G;->p:LVa/E;

    .line 99
    .line 100
    new-instance p2, LVa/C;

    .line 101
    .line 102
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 103
    .line 104
    .line 105
    iput-object p2, p0, LVa/G;->q:LVa/C;

    .line 106
    .line 107
    sget p2, LVa/G;->E:I

    .line 108
    .line 109
    add-int/lit8 p2, p2, 0xf

    .line 110
    .line 111
    rem-int/lit16 p2, p2, 0x80

    .line 112
    .line 113
    sput p2, LVa/G;->F:I

    .line 114
    .line 115
    iget-object p2, p0, LVa/G;->k:LVa/Ra;

    .line 116
    .line 117
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 118
    .line 119
    .line 120
    move-result p3

    .line 121
    cmpl-float p3, p3, v3

    .line 122
    .line 123
    rsub-int/lit8 p3, p3, 0xe

    .line 124
    .line 125
    const-string p5, "\u463d\u99d8\u58a7\u0af1\u09bf\uc6a4\uf365\u354c\u6f7f\u6935\u11bb\ua898\u82c6\uae6f"

    .line 126
    .line 127
    invoke-static {p3, p5}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p3

    .line 135
    invoke-virtual {p2, p3}, LVa/Ra;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    const/4 p3, 0x0

    .line 140
    if-eqz p2, :cond_0

    .line 141
    .line 142
    :try_start_0
    new-instance p5, Lorg/json/JSONObject;

    .line 143
    .line 144
    invoke-direct {p5, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :catch_0
    :cond_0
    new-instance p5, Lorg/json/JSONObject;

    .line 149
    .line 150
    invoke-direct {p5}, Lorg/json/JSONObject;-><init>()V

    .line 151
    .line 152
    .line 153
    sget p2, LVa/G;->E:I

    .line 154
    .line 155
    add-int/lit8 p2, p2, 0x1

    .line 156
    .line 157
    rem-int/lit16 v0, p2, 0x80

    .line 158
    .line 159
    sput v0, LVa/G;->F:I

    .line 160
    .line 161
    rem-int/lit8 p2, p2, 0x2

    .line 162
    .line 163
    if-eqz p2, :cond_2

    .line 164
    .line 165
    :goto_0
    invoke-virtual {p0, p5}, LVa/G;->j(Lorg/json/JSONObject;)V

    .line 166
    .line 167
    .line 168
    iput-object p1, p0, LVa/Mb;->b:Ljava/lang/Object;

    .line 169
    .line 170
    iput-object p4, p0, LVa/G;->u:LVa/Eb;

    .line 171
    .line 172
    new-instance p1, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 175
    .line 176
    .line 177
    iput-object p1, p0, LVa/G;->s:Ljava/util/ArrayList;

    .line 178
    .line 179
    new-instance p1, Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 182
    .line 183
    .line 184
    iput-object p1, p0, LVa/G;->t:Ljava/util/ArrayList;

    .line 185
    .line 186
    sget p1, LVa/G;->F:I

    .line 187
    .line 188
    add-int/lit8 p1, p1, 0x73

    .line 189
    .line 190
    rem-int/lit16 p2, p1, 0x80

    .line 191
    .line 192
    sput p2, LVa/G;->E:I

    .line 193
    .line 194
    rem-int/lit8 p1, p1, 0x2

    .line 195
    .line 196
    if-nez p1, :cond_1

    .line 197
    .line 198
    return-void

    .line 199
    :cond_1
    throw p3

    .line 200
    :cond_2
    throw p3
.end method

.method public final R()Z
    .locals 6

    .line 1
    sget v0, LVa/G;->E:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x37

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/G;->F:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x4

    .line 13
    const-string v3, "\u3ada\uc6f5\u6f7f\u6935"

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    div-int/2addr v2, v1

    .line 27
    invoke-static {v2, v3}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    add-int/2addr v5, v2

    .line 49
    invoke-static {v5, v3}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    :goto_0
    sget v1, LVa/G;->E:I

    .line 62
    .line 63
    add-int/lit8 v1, v1, 0x35

    .line 64
    .line 65
    rem-int/lit16 v2, v1, 0x80

    .line 66
    .line 67
    sput v2, LVa/G;->F:I

    .line 68
    .line 69
    rem-int/lit8 v1, v1, 0x2

    .line 70
    .line 71
    if-nez v1, :cond_1

    .line 72
    .line 73
    const/16 v1, 0x1c

    .line 74
    .line 75
    div-int/2addr v1, v4

    .line 76
    :cond_1
    return v0
.end method

.method public final declared-synchronized U(Z)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/G;->E:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x17

    .line 5
    .line 6
    rem-int/lit16 v2, v1, 0x80

    .line 7
    .line 8
    sput v2, LVa/G;->F:I

    .line 9
    .line 10
    rem-int/lit8 v1, v1, 0x2

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iput-boolean p1, p0, LVa/G;->v:Z

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x3d

    .line 17
    .line 18
    rem-int/lit16 v0, v0, 0x80

    .line 19
    .line 20
    sput v0, LVa/G;->F:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    :try_start_1
    iput-boolean p1, p0, LVa/G;->v:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 30
    :catchall_1
    move-exception p1

    .line 31
    :try_start_3
    throw p1

    .line 32
    :goto_0
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 33
    throw p1
.end method

.method public final V(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, LVa/G;->E:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x29

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/G;->F:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0, p1}, LVa/G;->a0(Ljava/lang/String;)LVa/K;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, p2}, LVa/K;->b(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget p1, LVa/G;->E:I

    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x75

    .line 29
    .line 30
    rem-int/lit16 p1, p1, 0x80

    .line 31
    .line 32
    sput p1, LVa/G;->F:I

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    return p1

    .line 36
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 37
    return p1

    .line 38
    :cond_2
    invoke-virtual {p0, p1}, LVa/G;->a0(Ljava/lang/String;)LVa/K;

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    throw p1
.end method

.method public final X()Ljava/util/HashMap;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    shr-int/lit8 v2, v2, 0x16

    .line 15
    .line 16
    rsub-int/lit8 v2, v2, 0x3

    .line 17
    .line 18
    const-string v3, "\u0003\u0004\u00b7"

    .line 19
    .line 20
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    const-wide/16 v6, -0x1

    .line 25
    .line 26
    cmp-long v4, v4, v6

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x43

    .line 29
    .line 30
    int-to-byte v4, v4

    .line 31
    invoke-static {v4, v2, v3}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_0

    .line 48
    .line 49
    new-instance v2, Lorg/json/JSONObject;

    .line 50
    .line 51
    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance v1, Lm9/S;

    .line 55
    .line 56
    const/16 v3, 0x1b

    .line 57
    .line 58
    invoke-direct {v1, v3}, Lm9/S;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-static {v2, v1}, LVa/Ab;->M(Lorg/json/JSONObject;LVa/rb;)Ljava/util/HashMap;

    .line 62
    .line 63
    .line 64
    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    goto :goto_0

    .line 66
    :catch_0
    move-exception v1

    .line 67
    const/16 v2, 0x30

    .line 68
    .line 69
    invoke-static {v2}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    add-int/lit8 v2, v2, -0x24

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-static {v3}, Landroid/graphics/Color;->red(I)I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    add-int/lit8 v4, v4, 0x3a

    .line 81
    .line 82
    int-to-byte v4, v4

    .line 83
    const-string v5, "\u000f\u0004\u0004\u000b\u0005\u0002\u0018\n\u0010\u0011\u0012\u0013"

    .line 84
    .line 85
    invoke-static {v4, v2, v5}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    shr-int/lit8 v4, v4, 0x10

    .line 98
    .line 99
    add-int/lit8 v4, v4, 0x1f

    .line 100
    .line 101
    const-string v5, "\u41b7\u62f2\u53f2\u7d0e\ud1b2\ua9c0\u6268\ufc85\ub4ec\u1318\u70e1\uf7b2\u8d27\uf749\u8f25\ufcc1\u8a93\ued55\u96d2\ube84\ub058\ua82e\u9210\u6edf\u7fe4\uad1a\uab4f\u3daa\u22fa\ueb2a\u82c6\uae6f"

    .line 102
    .line 103
    invoke-static {v4, v5}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-static {v2, v4, v1, v3}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 112
    .line 113
    .line 114
    :cond_0
    :goto_0
    sget v1, LVa/G;->E:I

    .line 115
    .line 116
    add-int/lit8 v1, v1, 0x21

    .line 117
    .line 118
    rem-int/lit16 v1, v1, 0x80

    .line 119
    .line 120
    sput v1, LVa/G;->F:I

    .line 121
    .line 122
    return-object v0
.end method

.method public final Z(LVa/X;)V
    .locals 3

    .line 1
    sget v0, LVa/G;->E:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x9

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/G;->F:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, LVa/G;->m:Landroid/os/Handler;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v1, LVa/y;

    .line 18
    .line 19
    const/16 v2, 0xb

    .line 20
    .line 21
    invoke-direct {v1, v2}, LVa/y;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object p0, v1, LVa/y;->e:Ljava/lang/Object;

    .line 25
    .line 26
    iput-object p1, v1, LVa/y;->d:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    sget p1, LVa/G;->F:I

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x33

    .line 34
    .line 35
    rem-int/lit16 p1, p1, 0x80

    .line 36
    .line 37
    sput p1, LVa/G;->E:I

    .line 38
    .line 39
    :cond_0
    return-void

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    throw p1
.end method

.method public final a0(Ljava/lang/String;)LVa/K;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget v0, LVa/G;->E:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x61

    .line 6
    .line 7
    rem-int/lit16 v0, v0, 0x80

    .line 8
    .line 9
    sput v0, LVa/G;->F:I

    .line 10
    .line 11
    invoke-virtual {p0}, LVa/G;->X()Ljava/util/HashMap;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, LVa/K;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget p1, LVa/G;->F:I

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x73

    .line 25
    .line 26
    rem-int/lit16 p1, p1, 0x80

    .line 27
    .line 28
    sput p1, LVa/G;->E:I

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    return-object p1
.end method

.method public final c0(J)V
    .locals 5

    .line 1
    sget v0, LVa/G;->F:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/G;->E:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    iget-boolean v0, p0, LVa/G;->A:Z

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x19

    .line 18
    .line 19
    rem-int/lit16 v0, v1, 0x80

    .line 20
    .line 21
    sput v0, LVa/G;->F:I

    .line 22
    .line 23
    rem-int/lit8 v1, v1, 0x2

    .line 24
    .line 25
    const-string v0, "\t\n\u0010\u0013\u000e\u0007\u0007\u0002\n\u0007\u000e\t\u0005\u0016\n\u0013\u0014\u0005\u0002\u0008\r\t\u0018\u0016\u0004\u0007\u0005\u0002\u0016\u0013\u0002\u0001\u0002\t\u0006\u0004\u0099"

    .line 26
    .line 27
    const-string v2, ""

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    iget-object v1, p0, LVa/G;->k:LVa/Ra;

    .line 32
    .line 33
    invoke-static {v2}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    add-int/lit8 v2, v2, 0x77

    .line 38
    .line 39
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    add-int/lit8 v3, v3, -0x30

    .line 44
    .line 45
    const/16 v4, 0x17

    .line 46
    .line 47
    rem-int/2addr v4, v3

    .line 48
    int-to-byte v3, v4

    .line 49
    invoke-static {v3, v2, v0}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    sget p2, LVa/Ra;->c:I

    .line 65
    .line 66
    add-int/lit8 p2, p2, 0x11

    .line 67
    .line 68
    rem-int/lit16 p2, p2, 0x80

    .line 69
    .line 70
    sput p2, LVa/Ra;->d:I

    .line 71
    .line 72
    invoke-virtual {v1, v0, p1}, LVa/Ra;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    sget p1, LVa/Ra;->d:I

    .line 76
    .line 77
    add-int/lit8 p1, p1, 0x61

    .line 78
    .line 79
    rem-int/lit16 p1, p1, 0x80

    .line 80
    .line 81
    sput p1, LVa/Ra;->c:I

    .line 82
    .line 83
    const/4 p1, 0x0

    .line 84
    :goto_0
    iput-boolean p1, p0, LVa/G;->A:Z

    .line 85
    .line 86
    return-void

    .line 87
    :cond_0
    iget-object v1, p0, LVa/G;->k:LVa/Ra;

    .line 88
    .line 89
    invoke-static {v2}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    rsub-int/lit8 v2, v2, 0x25

    .line 94
    .line 95
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    shr-int/lit8 v3, v3, 0x10

    .line 100
    .line 101
    rsub-int/lit8 v3, v3, 0x29

    .line 102
    .line 103
    int-to-byte v3, v3

    .line 104
    invoke-static {v3, v2, v0}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    sget p2, LVa/Ra;->c:I

    .line 120
    .line 121
    add-int/lit8 p2, p2, 0x11

    .line 122
    .line 123
    rem-int/lit16 p2, p2, 0x80

    .line 124
    .line 125
    sput p2, LVa/Ra;->d:I

    .line 126
    .line 127
    invoke-virtual {v1, v0, p1}, LVa/Ra;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    sget p1, LVa/Ra;->d:I

    .line 131
    .line 132
    add-int/lit8 p1, p1, 0x61

    .line 133
    .line 134
    rem-int/lit16 p1, p1, 0x80

    .line 135
    .line 136
    sput p1, LVa/Ra;->c:I

    .line 137
    .line 138
    const/4 p1, 0x1

    .line 139
    goto :goto_0

    .line 140
    :cond_1
    return-void

    .line 141
    :cond_2
    const/4 p1, 0x0

    .line 142
    throw p1
.end method

.method public final d0(LVa/j;)V
    .locals 3

    .line 1
    sget v0, LVa/G;->F:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/G;->E:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, LVa/G;->m:Landroid/os/Handler;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v1, LVa/y;

    .line 18
    .line 19
    const/16 v2, 0xa

    .line 20
    .line 21
    invoke-direct {v1, v2}, LVa/y;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object p0, v1, LVa/y;->e:Ljava/lang/Object;

    .line 25
    .line 26
    iput-object p1, v1, LVa/y;->d:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    sget p1, LVa/G;->F:I

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x6b

    .line 34
    .line 35
    rem-int/lit16 p1, p1, 0x80

    .line 36
    .line 37
    sput p1, LVa/G;->E:I

    .line 38
    .line 39
    :cond_0
    return-void

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    throw p1
.end method

.method public final f0()Z
    .locals 4

    .line 1
    sget v0, LVa/G;->F:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x59

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/G;->E:I

    .line 8
    .line 9
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {v1, v1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/lit8 v2, v2, 0x3

    .line 19
    .line 20
    const-string v3, "\u86f0\uf1b8\u206d\u659f"

    .line 21
    .line 22
    invoke-static {v2, v3}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sget v2, LVa/G;->E:I

    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x37

    .line 37
    .line 38
    rem-int/lit16 v3, v2, 0x80

    .line 39
    .line 40
    sput v3, LVa/G;->F:I

    .line 41
    .line 42
    rem-int/lit8 v2, v2, 0x2

    .line 43
    .line 44
    if-nez v2, :cond_0

    .line 45
    .line 46
    const/16 v2, 0xe

    .line 47
    .line 48
    div-int/2addr v2, v1

    .line 49
    :cond_0
    return v0
.end method

.method public final g0(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    sget v0, LVa/G;->F:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x39

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/G;->E:I

    .line 8
    .line 9
    invoke-virtual {p0, p1}, LVa/G;->a0(Ljava/lang/String;)LVa/K;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    sget v1, LVa/K;->f:I

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x67

    .line 19
    .line 20
    rem-int/lit16 v2, v1, 0x80

    .line 21
    .line 22
    sput v2, LVa/K;->g:I

    .line 23
    .line 24
    rem-int/lit8 v1, v1, 0x2

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    sget v1, LVa/G;->F:I

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x67

    .line 31
    .line 32
    rem-int/lit16 v2, v1, 0x80

    .line 33
    .line 34
    sput v2, LVa/G;->E:I

    .line 35
    .line 36
    rem-int/lit8 v1, v1, 0x2

    .line 37
    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    iget-object p1, p1, LVa/K;->c:Ljava/lang/String;

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_0
    throw v0

    .line 44
    :cond_1
    throw v0

    .line 45
    :cond_2
    return-object v0
.end method

.method public final i0(Landroid/content/Context;LVa/H;Z)V
    .locals 6

    .line 1
    sget v0, LVa/G;->F:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5f

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/G;->E:I

    .line 8
    .line 9
    iput-object p2, p0, LVa/G;->B:LVa/H;

    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    new-instance p3, LVa/F;

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    invoke-direct {p3, v0}, LVa/F;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p0, p3, LVa/F;->d:LVa/G;

    .line 20
    .line 21
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    sget v1, LVa/G;->F:I

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x5d

    .line 31
    .line 32
    rem-int/lit16 v1, v1, 0x80

    .line 33
    .line 34
    sput v1, LVa/G;->E:I

    .line 35
    .line 36
    invoke-virtual {v0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    shr-int/lit8 v2, v2, 0x16

    .line 45
    .line 46
    rsub-int/lit8 v2, v2, 0x4

    .line 47
    .line 48
    const-string v3, "\u6cb8\ue0fe\u6a35\u3604"

    .line 49
    .line 50
    invoke-static {v2, v3}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget v0, v0, LVa/G;->i:I

    .line 59
    .line 60
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    sget v1, LVa/G;->E:I

    .line 65
    .line 66
    add-int/lit8 v1, v1, 0x6d

    .line 67
    .line 68
    rem-int/lit16 v1, v1, 0x80

    .line 69
    .line 70
    sput v1, LVa/G;->F:I

    .line 71
    .line 72
    int-to-long v0, v0

    .line 73
    invoke-static {p3, v0, v1}, LVa/Cb;->a(LVa/Ba;J)V

    .line 74
    .line 75
    .line 76
    sget p3, LVa/G;->E:I

    .line 77
    .line 78
    add-int/lit8 p3, p3, 0x25

    .line 79
    .line 80
    rem-int/lit16 p3, p3, 0x80

    .line 81
    .line 82
    sput p3, LVa/G;->F:I

    .line 83
    .line 84
    :cond_0
    const/4 p3, 0x0

    .line 85
    invoke-virtual {p0, p3}, LVa/G;->U(Z)V

    .line 86
    .line 87
    .line 88
    new-instance v0, Lorg/json/JSONObject;

    .line 89
    .line 90
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 91
    .line 92
    .line 93
    :try_start_0
    new-instance v1, LVa/lb;

    .line 94
    .line 95
    invoke-virtual {p0}, LVa/G;->F()J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    invoke-direct {v1, p1, p2, v2, v3}, LVa/lb;-><init>(Landroid/content/Context;LVa/H;J)V

    .line 100
    .line 101
    .line 102
    new-instance v2, Lorg/json/JSONObject;

    .line 103
    .line 104
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, LVa/G;->y()LVa/z;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {v3}, LVa/z;->a()LVa/Ea;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v3}, LVa/Ea;->f()Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    const/4 v4, 0x1

    .line 120
    invoke-virtual {v1, v2, v3, v4, p3}, LVa/lb;->c(Lorg/json/JSONObject;ZZZ)Lorg/json/JSONObject;

    .line 121
    .line 122
    .line 123
    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    goto :goto_0

    .line 125
    :catch_0
    move-exception v1

    .line 126
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    const/4 v3, 0x0

    .line 131
    cmpl-float v2, v2, v3

    .line 132
    .line 133
    rsub-int/lit8 v2, v2, 0xd

    .line 134
    .line 135
    invoke-static {p3, p3}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 136
    .line 137
    .line 138
    move-result p3

    .line 139
    rsub-int/lit8 p3, p3, 0x3a

    .line 140
    .line 141
    int-to-byte p3, p3

    .line 142
    const-string v3, "\u000f\u0004\u0004\u000b\u0005\u0002\u0018\n\u0010\u0011\u0012\u0013"

    .line 143
    .line 144
    invoke-static {p3, v2, v3}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p3

    .line 148
    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p3

    .line 152
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 153
    .line 154
    .line 155
    move-result-wide v2

    .line 156
    const-wide/16 v4, 0x0

    .line 157
    .line 158
    cmp-long v2, v2, v4

    .line 159
    .line 160
    rsub-int/lit8 v2, v2, 0x1a

    .line 161
    .line 162
    const-string v3, "\u41b7\u62f2\u53f2\u7d0e\ud1b2\ua9c0\u0db4\ue6b1\ub828\ucca8\u5f8a\u952b\u6d5d\ub341\u166f\u8bf9\ue43a\u8256\u301f\u3c87\uea37\ua723\u6f91\u2e76\uef06\uda48"

    .line 163
    .line 164
    invoke-static {v2, v3}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-static {p3, v2, v1}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 173
    .line 174
    .line 175
    :goto_0
    invoke-virtual {p0}, LVa/G;->y()LVa/z;

    .line 176
    .line 177
    .line 178
    move-result-object p3

    .line 179
    iget-object v1, p0, LVa/G;->y:LVa/A;

    .line 180
    .line 181
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    shr-int/lit8 v2, v2, 0x8

    .line 186
    .line 187
    add-int/lit8 v2, v2, 0x4

    .line 188
    .line 189
    const-string v3, "\u6268\ufc85\ub33f\u2553"

    .line 190
    .line 191
    invoke-static {v2, v3}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    sget v3, LVa/A;->e:I

    .line 203
    .line 204
    add-int/lit8 v3, v3, 0x7

    .line 205
    .line 206
    rem-int/lit16 v4, v3, 0x80

    .line 207
    .line 208
    sput v4, LVa/A;->f:I

    .line 209
    .line 210
    rem-int/lit8 v3, v3, 0x2

    .line 211
    .line 212
    iget-object v1, v1, LVa/A;->a:Ljava/lang/String;

    .line 213
    .line 214
    if-eqz v3, :cond_1

    .line 215
    .line 216
    invoke-static {v1, v2}, LVa/A;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    new-instance v2, LVa/cb;

    .line 221
    .line 222
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 223
    .line 224
    .line 225
    iput-object p0, v2, LVa/cb;->c:Ljava/lang/Object;

    .line 226
    .line 227
    iput-object p1, v2, LVa/cb;->a:Ljava/lang/Object;

    .line 228
    .line 229
    iput-object p2, v2, LVa/cb;->b:Ljava/lang/Object;

    .line 230
    .line 231
    invoke-virtual {p3, v1, v0, v2}, LVa/z;->i(Ljava/lang/String;Lorg/json/JSONObject;LVa/Ia;)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :cond_1
    invoke-static {v1, v2}, LVa/A;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    const/4 p1, 0x0

    .line 239
    throw p1
.end method

.method public final declared-synchronized j(Lorg/json/JSONObject;)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/G;->E:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x4b

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, LVa/G;->F:I

    .line 9
    .line 10
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    shr-int/lit8 v0, v0, 0x10

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x6

    .line 17
    .line 18
    const-string v1, "\u8633\u9c5f\u939f\ufbf7\u43c8\uec9a"

    .line 19
    .line 20
    invoke-static {v0, v1}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sget v1, LVa/G;->E:I

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1d

    .line 35
    .line 36
    rem-int/lit16 v2, v1, 0x80

    .line 37
    .line 38
    sput v2, LVa/G;->F:I

    .line 39
    .line 40
    rem-int/lit8 v1, v1, 0x2

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    if-nez v1, :cond_0

    .line 44
    .line 45
    const/4 v1, 0x4

    .line 46
    div-int/2addr v1, v3

    .line 47
    :cond_0
    if-eqz v0, :cond_1

    .line 48
    .line 49
    add-int/lit8 v2, v2, 0x37

    .line 50
    .line 51
    rem-int/lit16 v2, v2, 0x80

    .line 52
    .line 53
    sput v2, LVa/G;->E:I

    .line 54
    .line 55
    const-string v0, ""

    .line 56
    .line 57
    const/16 v1, 0x30

    .line 58
    .line 59
    invoke-static {v0, v1, v3, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    add-int/lit8 v0, v0, 0x7

    .line 64
    .line 65
    const-string v1, "\u8633\u9c5f\u939f\ufbf7\u43c8\uec9a"

    .line 66
    .line 67
    invoke-static {v0, v1}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {p1, v0}, LVa/Ab;->g0(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 80
    .line 81
    .line 82
    sget v0, LVa/G;->E:I

    .line 83
    .line 84
    add-int/lit8 v0, v0, 0x55

    .line 85
    .line 86
    rem-int/lit16 v0, v0, 0x80

    .line 87
    .line 88
    sput v0, LVa/G;->F:I

    .line 89
    .line 90
    add-int/lit8 v0, v0, 0x31

    .line 91
    .line 92
    rem-int/lit16 v0, v0, 0x80

    .line 93
    .line 94
    sput v0, LVa/G;->E:I

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :catchall_0
    move-exception p1

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    :goto_0
    invoke-super {p0, p1}, LVa/Mb;->j(Lorg/json/JSONObject;)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, LVa/G;->n:LVa/C;

    .line 103
    .line 104
    invoke-virtual {v0, p1}, LVa/Mb;->j(Lorg/json/JSONObject;)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, LVa/G;->o:LVa/D;

    .line 108
    .line 109
    invoke-virtual {v0, p1}, LVa/Mb;->j(Lorg/json/JSONObject;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, LVa/G;->p:LVa/E;

    .line 113
    .line 114
    invoke-virtual {v0, p1}, LVa/Mb;->j(Lorg/json/JSONObject;)V

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, LVa/G;->q:LVa/C;

    .line 118
    .line 119
    invoke-virtual {v0, p1}, LVa/Mb;->j(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    .line 121
    .line 122
    monitor-exit p0

    .line 123
    return-void

    .line 124
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    throw p1
.end method

.method public final t()Z
    .locals 6

    .line 1
    sget v0, LVa/G;->F:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x53

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/G;->E:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, "\t\u0001\u00e7"

    .line 12
    .line 13
    const-string v2, ""

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/16 v4, 0x67

    .line 23
    .line 24
    invoke-static {v2, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v4, 0x3

    .line 29
    div-int/2addr v4, v2

    .line 30
    const/16 v2, 0x26

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    invoke-static {v5, v5, v3}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    rem-int/2addr v2, v3

    .line 38
    int-to-byte v2, v2

    .line 39
    invoke-static {v2, v4, v1}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/16 v4, 0x30

    .line 57
    .line 58
    invoke-static {v2, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    add-int/lit8 v2, v2, 0x4

    .line 63
    .line 64
    invoke-static {v3, v3, v3}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    add-int/lit8 v3, v3, 0x73

    .line 69
    .line 70
    int-to-byte v3, v3

    .line 71
    invoke-static {v3, v2, v1}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    goto :goto_0

    .line 76
    :goto_1
    sget v1, LVa/G;->E:I

    .line 77
    .line 78
    add-int/lit8 v1, v1, 0x27

    .line 79
    .line 80
    rem-int/lit16 v2, v1, 0x80

    .line 81
    .line 82
    sput v2, LVa/G;->F:I

    .line 83
    .line 84
    rem-int/lit8 v1, v1, 0x2

    .line 85
    .line 86
    if-eqz v1, :cond_1

    .line 87
    .line 88
    return v0

    .line 89
    :cond_1
    const/4 v0, 0x0

    .line 90
    throw v0
.end method

.method public final u()Z
    .locals 5

    .line 1
    sget v0, LVa/G;->E:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/G;->F:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, ""

    .line 12
    .line 13
    const-string v2, "\u0002\u0006\u0007\u000c"

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/16 v3, 0x35

    .line 22
    .line 23
    invoke-static {v3}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/16 v4, 0x5e

    .line 28
    .line 29
    div-int/2addr v4, v3

    .line 30
    const/16 v3, 0xa

    .line 31
    .line 32
    invoke-static {v1, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const/16 v3, 0x64

    .line 37
    .line 38
    shl-int v1, v3, v1

    .line 39
    .line 40
    :goto_0
    int-to-byte v1, v1

    .line 41
    invoke-static {v1, v4, v2}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const/16 v3, 0x30

    .line 59
    .line 60
    invoke-static {v3}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    rsub-int/lit8 v4, v4, 0x34

    .line 65
    .line 66
    invoke-static {v1, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    rsub-int/lit8 v1, v1, 0x75

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :goto_1
    sget v1, LVa/G;->E:I

    .line 74
    .line 75
    add-int/lit8 v1, v1, 0x1d

    .line 76
    .line 77
    rem-int/lit16 v2, v1, 0x80

    .line 78
    .line 79
    sput v2, LVa/G;->F:I

    .line 80
    .line 81
    rem-int/lit8 v1, v1, 0x2

    .line 82
    .line 83
    if-eqz v1, :cond_1

    .line 84
    .line 85
    return v0

    .line 86
    :cond_1
    const/4 v0, 0x0

    .line 87
    throw v0
.end method

.method public final declared-synchronized x()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/G;->E:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x15

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, LVa/G;->F:I

    .line 9
    .line 10
    iget-object v0, p0, LVa/G;->m:Landroid/os/Handler;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v1, LVa/F;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v1, v2}, LVa/F;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object p0, v1, LVa/F;->d:LVa/G;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    sget v0, LVa/G;->E:I

    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x51

    .line 31
    .line 32
    rem-int/lit16 v1, v0, 0x80

    .line 33
    .line 34
    sput v1, LVa/G;->F:I

    .line 35
    .line 36
    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    const/16 v0, 0x38

    .line 41
    .line 42
    :try_start_1
    div-int/lit8 v0, v0, 0x0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    .line 44
    monitor-exit p0

    .line 45
    return-void

    .line 46
    :catchall_1
    move-exception v0

    .line 47
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 48
    :cond_1
    monitor-exit p0

    .line 49
    return-void

    .line 50
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 51
    throw v0
.end method

.method public final declared-synchronized y()LVa/z;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/G;->E:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0xd

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, LVa/G;->F:I

    .line 9
    .line 10
    iget-object v1, p0, LVa/G;->l:LVa/z;

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x7d

    .line 13
    .line 14
    rem-int/lit16 v2, v0, 0x80

    .line 15
    .line 16
    sput v2, LVa/G;->E:I

    .line 17
    .line 18
    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-object v1

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    :try_start_2
    throw v0

    .line 28
    :catchall_1
    move-exception v0

    .line 29
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 30
    throw v0
.end method

.method public final z()I
    .locals 7

    .line 1
    sget v0, LVa/G;->E:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x71

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/G;->F:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget v1, p0, LVa/G;->g:I

    .line 12
    .line 13
    const-string v2, "\u0008\r\u00d2"

    .line 14
    .line 15
    const-string v3, ""

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v5, 0x1

    .line 25
    invoke-static {v3, v3, v5, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    const/4 v6, 0x4

    .line 30
    shl-int v5, v6, v5

    .line 31
    .line 32
    const/4 v6, 0x5

    .line 33
    invoke-static {v3, v6, v4, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const/16 v4, 0x60

    .line 38
    .line 39
    shl-int v3, v4, v3

    .line 40
    .line 41
    :goto_0
    int-to-byte v3, v3

    .line 42
    invoke-static {v3, v5, v2}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    return v0

    .line 55
    :cond_0
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v3, v3, v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    add-int/lit8 v5, v5, 0x3

    .line 64
    .line 65
    const/16 v6, 0x30

    .line 66
    .line 67
    invoke-static {v3, v6, v4, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    rsub-int/lit8 v3, v3, 0x5d

    .line 72
    .line 73
    goto :goto_0
.end method
