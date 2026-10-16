.class public final LVa/Q;
.super LVa/Ba;
.source "SourceFile"


# static fields
.field public static i:I = 0x0

.field public static j:I = 0x1


# instance fields
.field public synthetic c:Ljava/lang/String;

.field public synthetic d:Landroid/content/Context;

.field public synthetic e:Ljava/lang/String;

.field public synthetic f:Ljava/util/List;

.field public synthetic g:LVa/M;

.field public synthetic h:LVa/V;


# direct methods
.method public static d(Ljava/lang/String;IIIZ)Ljava/lang/String;
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
    add-int/lit8 v4, v4, -0x73

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


# virtual methods
.method public final c()V
    .locals 13

    .line 1
    const-string v1, ""

    .line 2
    .line 3
    invoke-static {v1}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, 0x11

    .line 8
    .line 9
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    shr-int/lit8 v2, v2, 0x10

    .line 14
    .line 15
    add-int/lit16 v2, v2, 0xd9

    .line 16
    .line 17
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    shr-int/lit8 v3, v3, 0x16

    .line 22
    .line 23
    add-int/lit8 v3, v3, 0xf

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    const-string v5, "\t\u0008\u0008\uffff\ufffd\u000e\t\u000c\uffe7\ufffb\u0008\ufffb\u0001\uffff\u000c\uffdd"

    .line 27
    .line 28
    invoke-static {v5, v0, v2, v3, v4}, LVa/Q;->d(Ljava/lang/String;IIIZ)Ljava/lang/String;

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
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    shr-int/lit8 v3, v3, 0x10

    .line 46
    .line 47
    rsub-int/lit8 v3, v3, 0x17

    .line 48
    .line 49
    invoke-static {v1, v4}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    add-int/lit16 v6, v6, 0xd6

    .line 54
    .line 55
    invoke-static {v4}, Landroid/graphics/Color;->green(I)I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    rsub-int/lit8 v7, v7, 0x10

    .line 60
    .line 61
    const-string v8, "\u0006\u0017\u0006\u000b\u0004\uffbd\u0000\u000c\u000b\u000b\u0002\u0000\u0011\u000c\u000f\uffbd\uffe6\u000b\u0006\u0011\u0006\ufffe\t"

    .line 62
    .line 63
    invoke-static {v8, v3, v6, v7, v4}, LVa/Q;->d(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget-object v3, p0, LVa/Q;->c:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-static {v0, v2}, LVa/Ab;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :try_start_0
    iget-object v6, p0, LVa/Q;->h:LVa/V;

    .line 87
    .line 88
    iget-object v7, p0, LVa/Q;->d:Landroid/content/Context;

    .line 89
    .line 90
    iget-object v8, p0, LVa/Q;->e:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v9, p0, LVa/Q;->c:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v10, p0, LVa/Q;->f:Ljava/util/List;

    .line 95
    .line 96
    iget-object v11, p0, LVa/Q;->g:LVa/M;

    .line 97
    .line 98
    sget v0, LVa/V;->q:I

    .line 99
    .line 100
    add-int/lit8 v0, v0, 0x1d

    .line 101
    .line 102
    rem-int/lit16 v2, v0, 0x80

    .line 103
    .line 104
    sput v2, LVa/V;->p:I

    .line 105
    .line 106
    rem-int/lit8 v0, v0, 0x2

    .line 107
    .line 108
    if-eqz v0, :cond_0

    .line 109
    .line 110
    invoke-virtual/range {v6 .. v11}, LVa/V;->x(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LVa/M;)V

    .line 111
    .line 112
    .line 113
    const/16 v0, 0x17

    .line 114
    .line 115
    div-int/2addr v0, v4

    .line 116
    goto :goto_0

    .line 117
    :cond_0
    invoke-virtual/range {v6 .. v11}, LVa/V;->x(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LVa/M;)V

    .line 118
    .line 119
    .line 120
    :goto_0
    sget v0, LVa/V;->p:I

    .line 121
    .line 122
    add-int/lit8 v0, v0, 0x3d

    .line 123
    .line 124
    rem-int/lit16 v2, v0, 0x80

    .line 125
    .line 126
    sput v2, LVa/V;->q:I

    .line 127
    .line 128
    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    .line 130
    if-eqz v0, :cond_1

    .line 131
    .line 132
    sget v0, LVa/Q;->j:I

    .line 133
    .line 134
    add-int/lit8 v0, v0, 0x6b

    .line 135
    .line 136
    rem-int/lit16 v0, v0, 0x80

    .line 137
    .line 138
    sput v0, LVa/Q;->i:I

    .line 139
    .line 140
    return-void

    .line 141
    :cond_1
    const/4 v0, 0x0

    .line 142
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    :goto_1
    move-object v8, v0

    .line 144
    goto :goto_2

    .line 145
    :catchall_0
    move-exception v0

    .line 146
    goto :goto_1

    .line 147
    :goto_2
    iget-object v0, p0, LVa/Q;->h:LVa/V;

    .line 148
    .line 149
    invoke-static {v0}, LVa/V;->A(LVa/V;)LVa/la;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    if-eqz v2, :cond_2

    .line 154
    .line 155
    sget-object v6, LVa/b0;->e:LVa/b0;

    .line 156
    .line 157
    new-instance v7, LVa/Da;

    .line 158
    .line 159
    const/4 v9, 0x6

    .line 160
    invoke-direct {v7, v2, v3, v6, v9}, LVa/Da;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 161
    .line 162
    .line 163
    invoke-static {v7}, LVa/Cb;->g(LVa/Ba;)V

    .line 164
    .line 165
    .line 166
    sget v2, LVa/Q;->i:I

    .line 167
    .line 168
    add-int/lit8 v2, v2, 0x69

    .line 169
    .line 170
    rem-int/lit16 v2, v2, 0x80

    .line 171
    .line 172
    sput v2, LVa/Q;->j:I

    .line 173
    .line 174
    :cond_2
    invoke-static {v0}, LVa/V;->m(LVa/V;)Ljava/util/HashMap;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v8}, LVa/Ab;->K(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    iget-object v6, p0, LVa/Q;->e:Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {v0, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    const/4 v0, 0x0

    .line 192
    invoke-static {v4, v0, v0}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    cmpl-float v0, v2, v0

    .line 197
    .line 198
    add-int/lit8 v0, v0, 0x10

    .line 199
    .line 200
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    shr-int/lit8 v2, v2, 0x10

    .line 205
    .line 206
    add-int/lit16 v2, v2, 0xd9

    .line 207
    .line 208
    invoke-static {v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    rsub-int/lit8 v6, v6, 0xf

    .line 213
    .line 214
    invoke-static {v5, v0, v2, v6, v4}, LVa/Q;->d(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    new-instance v0, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
    .line 226
    .line 227
    invoke-static {v1}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    rsub-int/lit8 v2, v2, 0x19

    .line 232
    .line 233
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 234
    .line 235
    .line 236
    move-result-wide v9

    .line 237
    const-wide/16 v11, 0x0

    .line 238
    .line 239
    cmp-long v5, v9, v11

    .line 240
    .line 241
    rsub-int v5, v5, 0xd5

    .line 242
    .line 243
    const/16 v7, 0x30

    .line 244
    .line 245
    invoke-static {v1, v7, v4, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    rsub-int/lit8 v1, v1, 0x14

    .line 250
    .line 251
    const/4 v4, 0x1

    .line 252
    const-string v7, "\u0002\u0004\r\r\u000e\u0002\uffbf\u0006\r\u0008\u0013\u0000\u0004\u0011\u0002\uffbf\u0011\u000e\u0011\u0011\uffe4\uffbf\u0011\u000e\u0013"

    .line 253
    .line 254
    invoke-static {v7, v2, v5, v1, v4}, LVa/Q;->d(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    const/4 v11, 0x0

    .line 273
    const/4 v9, 0x1

    .line 274
    const/4 v10, 0x1

    .line 275
    invoke-static/range {v6 .. v11}, LVa/Ab;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V

    .line 276
    .line 277
    .line 278
    return-void
.end method
