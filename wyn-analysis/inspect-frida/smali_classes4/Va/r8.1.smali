.class public final LVa/r8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static f:I = 0x0

.field public static g:I = 0x1


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[Ljava/lang/String;

.field public final c:LVa/V8;

.field public final d:LVa/r8;

.field public e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;LVa/r8;)V
    .locals 8

    .line 1
    const-string v1, "\udd10\u0180\u0ec7\u740c\udd55\ue462\uc595\uc4d3\u4b22\u7a70\u6fd7\u329d\uf1e2\u13e3\uf90e\ua952\u1fb7\ua9f0\u834a\u0719\u8464\u3f78\u2a88\u7dd8\u3270\ud577"

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v3, -0x1

    .line 7
    iput v3, p0, LVa/r8;->e:I

    .line 8
    .line 9
    invoke-static {p3}, LVa/t8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iput-object v3, p0, LVa/r8;->a:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p5, p0, LVa/r8;->d:LVa/r8;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-static {v3, v3}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const-string v5, "\uc1fd\uc54d\uf21b\u44fc\uc19c\u20af\u395c\uf43f"

    .line 23
    .line 24
    invoke-static {v4, v5}, LVa/r8;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {p4, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    new-instance v5, LVa/ka;

    .line 37
    .line 38
    const/16 v6, 0x1c

    .line 39
    .line 40
    invoke-direct {v5, v6}, LVa/ka;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-static {v4, v5}, LVa/Ab;->d0(Lorg/json/JSONArray;LVa/sb;)Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    new-array v5, v5, [Ljava/lang/String;

    .line 52
    .line 53
    iput-object v5, p0, LVa/r8;->b:[Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    :try_start_0
    const-string v4, "\u86dd\u6cb0\u00e3\u4cb4\u86bf\u894f\ucba7\ufc7d"

    .line 59
    .line 60
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    const/4 v6, 0x0

    .line 65
    cmpl-float v5, v5, v6

    .line 66
    .line 67
    invoke-static {v5, v4}, LVa/r8;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {p4, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {p1, p3, v0}, LVa/l8;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    new-instance v5, LVa/q8;

    .line 84
    .line 85
    invoke-direct {v5}, LVa/q8;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5, v0}, LVa/q8;->k(Ljava/util/ArrayList;)LVa/V8;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, LVa/r8;->c:LVa/V8;
    :try_end_0
    .catch LVa/w8; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    return-void

    .line 95
    :goto_0
    move-object v7, v0

    .line 96
    goto :goto_2

    .line 97
    :catchall_0
    move-exception v0

    .line 98
    goto :goto_1

    .line 99
    :catch_0
    move-exception v0

    .line 100
    goto :goto_0

    .line 101
    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    shr-int/lit8 v6, v6, 0x10

    .line 111
    .line 112
    invoke-static {v6, v1}, LVa/r8;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    iget-object v1, p0, LVa/r8;->a:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    shr-int/lit8 v1, v1, 0x10

    .line 133
    .line 134
    const v6, 0xe018

    .line 135
    .line 136
    .line 137
    sub-int/2addr v6, v1

    .line 138
    int-to-char v1, v6

    .line 139
    const v6, -0x721e0481

    .line 140
    .line 141
    .line 142
    invoke-static {v3, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    sub-int/2addr v6, v3

    .line 147
    const-string v3, "\u7f96\ue1fb\u188d\ua4e0"

    .line 148
    .line 149
    const-string v7, "\ueb41\uea2d\uda4a"

    .line 150
    .line 151
    invoke-static {v1, v3, v7, v6}, LVa/r8;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    new-instance v1, LVa/j8;

    .line 174
    .line 175
    invoke-virtual {p0}, LVa/r8;->a()I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    const/4 v7, 0x0

    .line 180
    move-object v2, p1

    .line 181
    move-object v3, p2

    .line 182
    move-object v4, p3

    .line 183
    invoke-direct/range {v1 .. v7}, LVa/j8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;LVa/w8;)V

    .line 184
    .line 185
    .line 186
    invoke-static {p1, v6, v0, v1}, LVa/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;LVa/j8;)V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    const-string v4, ""

    .line 196
    .line 197
    invoke-static {v4, v4, v3, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    invoke-static {v3, v1}, LVa/r8;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    iget-object v1, p0, LVa/r8;->a:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    shr-int/lit8 v1, v1, 0x10

    .line 222
    .line 223
    const-string v3, "\ue97f\ufda9\u565d\u7247\ue958\u1819\u9d1c\uc283\u7f1f\u8615\u3754\u34d9\uc59a\uef99"

    .line 224
    .line 225
    invoke-static {v1, v3}, LVa/r8;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0}, LVa/r8;->a()I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    iget v3, v7, LVa/w8;->a:I

    .line 241
    .line 242
    add-int/2addr v1, v3

    .line 243
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    const-wide/16 v3, 0x0

    .line 247
    .line 248
    invoke-static {v3, v4}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    add-int/lit8 v1, v1, 0x1

    .line 253
    .line 254
    const-string v3, "\u2425\u383e\u9dc8\udefc\u241f\udd8e"

    .line 255
    .line 256
    invoke-static {v1, v3}, LVa/r8;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    new-instance v1, LVa/j8;

    .line 279
    .line 280
    invoke-virtual {p0}, LVa/r8;->a()I

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    move-object v2, p1

    .line 285
    move-object v3, p2

    .line 286
    move-object v4, p3

    .line 287
    invoke-direct/range {v1 .. v7}, LVa/j8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;LVa/w8;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1, p1}, LVa/j8;->d(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    return-void
.end method

.method public static b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, "\u0000\u0000\u0000\u0000"

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, [C

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, [C

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, [C

    .line 20
    .line 21
    sget-object v1, LVa/a;->r:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v1

    .line 24
    :try_start_0
    invoke-virtual {p1}, [C->clone()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, [C

    .line 29
    .line 30
    invoke-virtual {v0}, [C->clone()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, [C

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    aget-char v3, p1, v2

    .line 38
    .line 39
    xor-int/2addr p0, v3

    .line 40
    int-to-char p0, p0

    .line 41
    aput-char p0, p1, v2

    .line 42
    .line 43
    const/4 p0, 0x2

    .line 44
    aget-char v3, v0, p0

    .line 45
    .line 46
    int-to-char p3, p3

    .line 47
    add-int/2addr v3, p3

    .line 48
    int-to-char p3, v3

    .line 49
    aput-char p3, v0, p0

    .line 50
    .line 51
    array-length p0, p2

    .line 52
    new-array p3, p0, [C

    .line 53
    .line 54
    sput v2, LVa/a;->q:I

    .line 55
    .line 56
    :goto_0
    sget v3, LVa/a;->q:I

    .line 57
    .line 58
    if-ge v3, p0, :cond_0

    .line 59
    .line 60
    add-int/lit8 v4, v3, 0x2

    .line 61
    .line 62
    rem-int/lit8 v4, v4, 0x4

    .line 63
    .line 64
    add-int/lit8 v5, v3, 0x3

    .line 65
    .line 66
    rem-int/lit8 v5, v5, 0x4

    .line 67
    .line 68
    rem-int/lit8 v6, v3, 0x4

    .line 69
    .line 70
    aget-char v6, p1, v6

    .line 71
    .line 72
    mul-int/lit16 v6, v6, 0x7fce

    .line 73
    .line 74
    aget-char v4, v0, v4

    .line 75
    .line 76
    add-int/2addr v6, v4

    .line 77
    const v7, 0xffff

    .line 78
    .line 79
    .line 80
    rem-int/2addr v6, v7

    .line 81
    int-to-char v6, v6

    .line 82
    aget-char v8, p1, v5

    .line 83
    .line 84
    mul-int/lit16 v8, v8, 0x7fce

    .line 85
    .line 86
    add-int/2addr v8, v4

    .line 87
    div-int/2addr v8, v7

    .line 88
    int-to-char v4, v8

    .line 89
    aput-char v4, v0, v5

    .line 90
    .line 91
    aput-char v6, p1, v5

    .line 92
    .line 93
    aget-char v4, p2, v3

    .line 94
    .line 95
    xor-int/2addr v4, v6

    .line 96
    int-to-long v4, v4

    .line 97
    int-to-long v6, v2

    .line 98
    xor-long/2addr v4, v6

    .line 99
    const v6, 0xca0a

    .line 100
    .line 101
    .line 102
    int-to-long v6, v6

    .line 103
    xor-long/2addr v4, v6

    .line 104
    long-to-int v4, v4

    .line 105
    int-to-char v4, v4

    .line 106
    aput-char v4, p3, v3

    .line 107
    .line 108
    add-int/lit8 v3, v3, 0x1

    .line 109
    .line 110
    sput v3, LVa/a;->q:I

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :catchall_0
    move-exception p0

    .line 114
    goto :goto_1

    .line 115
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 116
    .line 117
    invoke-direct {p0, p3}, Ljava/lang/String;-><init>([C)V

    .line 118
    .line 119
    .line 120
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    return-object p0

    .line 122
    :goto_1
    monitor-exit v1

    .line 123
    throw p0
.end method

.method public static d(ILjava/lang/String;)Ljava/lang/String;
    .locals 9

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
    sget-object v0, LVa/pb;->D:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    const-wide v1, -0x56cb0f00ab631a70L    # -3.483110285497692E-110

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-static {v1, v2, p1, p0}, LVa/pb;->z(J[CI)[C

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 p1, 0x4

    .line 20
    sput p1, LVa/pb;->C:I

    .line 21
    .line 22
    :goto_0
    sget v3, LVa/pb;->C:I

    .line 23
    .line 24
    array-length v4, p0

    .line 25
    if-ge v3, v4, :cond_0

    .line 26
    .line 27
    add-int/lit8 v4, v3, -0x4

    .line 28
    .line 29
    aget-char v5, p0, v3

    .line 30
    .line 31
    rem-int/lit8 v6, v3, 0x4

    .line 32
    .line 33
    aget-char v6, p0, v6

    .line 34
    .line 35
    xor-int/2addr v5, v6

    .line 36
    int-to-long v5, v5

    .line 37
    int-to-long v7, v4

    .line 38
    mul-long/2addr v7, v1

    .line 39
    xor-long/2addr v5, v7

    .line 40
    long-to-int v4, v5

    .line 41
    int-to-char v4, v4

    .line 42
    aput-char v4, p0, v3

    .line 43
    .line 44
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    sput v3, LVa/pb;->C:I

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    new-instance v1, Ljava/lang/String;

    .line 52
    .line 53
    array-length v2, p0

    .line 54
    sub-int/2addr v2, p1

    .line 55
    invoke-direct {v1, p0, p1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 56
    .line 57
    .line 58
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    return-object v1

    .line 60
    :goto_1
    monitor-exit v0

    .line 61
    throw p0
.end method


# virtual methods
.method public final a()I
    .locals 4

    .line 1
    iget v0, p0, LVa/r8;->e:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_2

    .line 5
    .line 6
    sget v0, LVa/r8;->g:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x4d

    .line 9
    .line 10
    rem-int/lit16 v0, v0, 0x80

    .line 11
    .line 12
    sput v0, LVa/r8;->f:I

    .line 13
    .line 14
    iget-object v0, p0, LVa/r8;->d:LVa/r8;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iput v1, p0, LVa/r8;->e:I

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {v0}, LVa/r8;->a()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    iget-object v0, v0, LVa/r8;->c:LVa/V8;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    sget v3, LVa/r8;->g:I

    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x5f

    .line 33
    .line 34
    rem-int/lit16 v3, v3, 0x80

    .line 35
    .line 36
    sput v3, LVa/r8;->f:I

    .line 37
    .line 38
    invoke-virtual {v0}, LVa/V8;->a()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    sget v0, LVa/r8;->f:I

    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x3d

    .line 46
    .line 47
    rem-int/lit16 v0, v0, 0x80

    .line 48
    .line 49
    sput v0, LVa/r8;->g:I

    .line 50
    .line 51
    move v0, v1

    .line 52
    :goto_0
    add-int/2addr v2, v0

    .line 53
    add-int/2addr v2, v1

    .line 54
    iput v2, p0, LVa/r8;->e:I

    .line 55
    .line 56
    :cond_2
    :goto_1
    iget v0, p0, LVa/r8;->e:I

    .line 57
    .line 58
    sget v1, LVa/r8;->f:I

    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x6f

    .line 61
    .line 62
    rem-int/lit16 v2, v1, 0x80

    .line 63
    .line 64
    sput v2, LVa/r8;->g:I

    .line 65
    .line 66
    rem-int/lit8 v1, v1, 0x2

    .line 67
    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    return v0

    .line 71
    :cond_3
    const/4 v0, 0x0

    .line 72
    throw v0
.end method

.method public final c(LVa/x8;LVa/y7;Ljava/util/List;)LVa/s8;
    .locals 11

    .line 1
    new-instance v0, LVa/x8;

    .line 2
    .line 3
    iget-object v1, p0, LVa/r8;->b:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget v2, LVa/r8;->f:I

    .line 10
    .line 11
    add-int/lit8 v2, v2, 0x61

    .line 12
    .line 13
    rem-int/lit16 v3, v2, 0x80

    .line 14
    .line 15
    sput v3, LVa/r8;->g:I

    .line 16
    .line 17
    rem-int/lit8 v2, v2, 0x2

    .line 18
    .line 19
    iget-object v6, p0, LVa/r8;->a:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/16 v4, 0x2b

    .line 34
    .line 35
    div-int/2addr v4, v8

    .line 36
    if-eq v2, v3, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eq v2, v3, :cond_1

    .line 48
    .line 49
    :goto_0
    invoke-virtual {p2}, LVa/y7;->f()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v6}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v8, v8, v8, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    add-int/lit16 v4, v4, 0x3799

    .line 62
    .line 63
    int-to-char v4, v4

    .line 64
    const v5, 0x3707c71b

    .line 65
    .line 66
    .line 67
    invoke-static {v8}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    sub-int/2addr v5, v9

    .line 72
    const-string v9, "\u1b6e\u07c7\u9937\u0137"

    .line 73
    .line 74
    const-string v10, "\u5f7a\u35f8\u3c5e\ueeb3\u956f\ue587\u2b9d\u53f9\u1a4d\u34b9\u1306\uf87d\u4233\u903b\u1ac0\uc57d\ueebc"

    .line 75
    .line 76
    invoke-static {v4, v9, v10, v5}, LVa/r8;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    shr-int/lit8 v1, v1, 0x10

    .line 99
    .line 100
    int-to-char v1, v1

    .line 101
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    shr-int/lit8 v4, v4, 0x8

    .line 106
    .line 107
    const-string v5, "\u7bb6\u4935\ufee5\u6417"

    .line 108
    .line 109
    const-string v9, "\ude1d\u4041\ube32\u7188\u0278\u47d5\uba61\uc6e9\u3db9\u736b\u935d\u04ae\uf75a\u6561\uaade\u138e\uc0f4\u952f\uf85d\u690f\ucaca\u9af9\u5c60\u3ff7"

    .line 110
    .line 111
    invoke-static {v1, v5, v9, v4}, LVa/r8;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    invoke-static {v2, p3}, LVa/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    move-object v1, v7

    .line 137
    goto :goto_2

    .line 138
    :cond_1
    new-instance v2, Ljava/util/HashMap;

    .line 139
    .line 140
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 141
    .line 142
    .line 143
    move v3, v8

    .line 144
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-ge v3, v4, :cond_3

    .line 149
    .line 150
    sget v4, LVa/r8;->f:I

    .line 151
    .line 152
    add-int/lit8 v4, v4, 0x4f

    .line 153
    .line 154
    rem-int/lit16 v5, v4, 0x80

    .line 155
    .line 156
    sput v5, LVa/r8;->g:I

    .line 157
    .line 158
    rem-int/lit8 v4, v4, 0x2

    .line 159
    .line 160
    if-nez v4, :cond_2

    .line 161
    .line 162
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    add-int/lit8 v3, v3, 0x7d

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_2
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    add-int/lit8 v3, v3, 0x1

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_3
    sget p3, LVa/r8;->g:I

    .line 191
    .line 192
    add-int/lit8 p3, p3, 0x4b

    .line 193
    .line 194
    rem-int/lit16 v1, p3, 0x80

    .line 195
    .line 196
    sput v1, LVa/r8;->f:I

    .line 197
    .line 198
    rem-int/lit8 p3, p3, 0x2

    .line 199
    .line 200
    if-eqz p3, :cond_4

    .line 201
    .line 202
    const/16 p3, 0x3f

    .line 203
    .line 204
    div-int/2addr p3, v8

    .line 205
    :cond_4
    move-object v1, v2

    .line 206
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    sget p3, LVa/x8;->k:I

    .line 210
    .line 211
    add-int/lit8 p3, p3, 0x6b

    .line 212
    .line 213
    rem-int/lit16 p3, p3, 0x80

    .line 214
    .line 215
    sput p3, LVa/x8;->l:I

    .line 216
    .line 217
    add-int/lit8 p3, p3, 0xf

    .line 218
    .line 219
    rem-int/lit16 p3, p3, 0x80

    .line 220
    .line 221
    sput p3, LVa/x8;->k:I

    .line 222
    .line 223
    iget-object v2, p1, LVa/x8;->c:LVa/x8;

    .line 224
    .line 225
    if-nez v2, :cond_5

    .line 226
    .line 227
    const/4 p3, 0x1

    .line 228
    move v5, p3

    .line 229
    :goto_3
    move-object v3, p0

    .line 230
    move-object v4, p1

    .line 231
    goto :goto_4

    .line 232
    :cond_5
    move v5, v8

    .line 233
    goto :goto_3

    .line 234
    :goto_4
    invoke-direct/range {v0 .. v5}, LVa/x8;-><init>(Ljava/util/HashMap;LVa/x8;LVa/r8;LVa/x8;Z)V

    .line 235
    .line 236
    .line 237
    iget-object p1, v3, LVa/r8;->c:LVa/V8;

    .line 238
    .line 239
    if-eqz p1, :cond_6

    .line 240
    .line 241
    sget p3, LVa/r8;->g:I

    .line 242
    .line 243
    add-int/lit8 p3, p3, 0x25

    .line 244
    .line 245
    rem-int/lit16 p3, p3, 0x80

    .line 246
    .line 247
    sput p3, LVa/r8;->f:I

    .line 248
    .line 249
    invoke-virtual {p1, v0, p2}, LVa/c9;->d(LVa/x8;LVa/y7;)LVa/s8;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    return-object p1

    .line 254
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 257
    .line 258
    .line 259
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 260
    .line 261
    .line 262
    move-result-wide v1

    .line 263
    const-wide/16 v4, 0x0

    .line 264
    .line 265
    cmp-long p3, v1, v4

    .line 266
    .line 267
    add-int/lit8 p3, p3, -0x1

    .line 268
    .line 269
    const-string v1, "\u2db7\u0cd4\u61b5\ub548\u2df2\ue936\uaae7\u0597\ubb85\u7724\u00bc\uf3d6\u0141\u1eab\u967e\u6811\uef19\ua4e3\uec75\uc655\u74d2\u3230\u45fd\ubc97\uc293\ud824\udbf2"

    .line 270
    .line 271
    invoke-static {p3, v1}, LVa/r8;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p3

    .line 275
    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p3

    .line 279
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-static {v8, v8}, Landroid/view/View;->getDefaultSize(II)I

    .line 286
    .line 287
    .line 288
    move-result p3

    .line 289
    int-to-char p3, p3

    .line 290
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 291
    .line 292
    .line 293
    move-result-wide v1

    .line 294
    cmp-long v1, v1, v4

    .line 295
    .line 296
    const v2, 0x276ddbd1

    .line 297
    .line 298
    .line 299
    sub-int/2addr v2, v1

    .line 300
    const-string v1, "\ud0ef\u6ddb\ud527\u65e5"

    .line 301
    .line 302
    const-string v4, "\u3f5c\ubec1\u7b31\u8b28\u87d5\u71d0\ud3ed\u9a80\u1c3f\u7f88\uf339\ud184\uc315\u19f1\ub996\u8041\u5c96\u5334\uc493\uc035\ub5f2\u38ff\u01fe"

    .line 303
    .line 304
    invoke-static {p3, v1, v4, v2}, LVa/r8;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p3

    .line 308
    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p3

    .line 312
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    new-instance p3, LVa/j8;

    .line 320
    .line 321
    invoke-direct {p3, p2, v0, p1, v7}, LVa/j8;-><init>(LVa/y7;LVa/x8;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {p2}, LVa/y7;->f()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    invoke-virtual {p3, p1}, LVa/j8;->d(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    sget p1, LVa/r8;->f:I

    .line 332
    .line 333
    add-int/lit8 p1, p1, 0x57

    .line 334
    .line 335
    rem-int/lit16 p1, p1, 0x80

    .line 336
    .line 337
    sput p1, LVa/r8;->g:I

    .line 338
    .line 339
    return-object v7
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    invoke-static {v1}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const-string v3, "\u7653\u1303\ue4dc\u6b9b\u7635\uf6e6\u2f92\udb48\ue067\u68ba\u85d3\u2d05\u5af3"

    .line 13
    .line 14
    invoke-static {v2, v3}, LVa/r8;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, LVa/r8;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    shr-int/lit8 v2, v2, 0x8

    .line 35
    .line 36
    const-string v3, "\u6ae2\ud2ba\u0557\u509e\u6aca"

    .line 37
    .line 38
    invoke-static {v2, v3}, LVa/r8;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-static {v2, v2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    const v4, 0xd2cd

    .line 55
    .line 56
    .line 57
    sub-int/2addr v4, v3

    .line 58
    int-to-char v3, v4

    .line 59
    invoke-static {v2, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    const-string v5, "\u4e83\ud0fd\ucdc1\u5dd2"

    .line 64
    .line 65
    const-string v6, "\u0cea\u8fe8"

    .line 66
    .line 67
    invoke-static {v3, v5, v6, v4}, LVa/r8;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    if-eqz v3, :cond_2

    .line 76
    .line 77
    new-instance v4, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    iget-object v5, p0, LVa/r8;->b:[Ljava/lang/String;

    .line 83
    .line 84
    array-length v6, v5

    .line 85
    const/4 v7, 0x1

    .line 86
    if-lez v6, :cond_0

    .line 87
    .line 88
    aget-object v6, v5, v2

    .line 89
    .line 90
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    move v6, v7

    .line 94
    :goto_0
    array-length v8, v5

    .line 95
    if-ge v6, v8, :cond_0

    .line 96
    .line 97
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    aget-object v8, v5, v6

    .line 101
    .line 102
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    add-int/lit8 v6, v6, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_0
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const/16 v3, 0x30

    .line 116
    .line 117
    invoke-static {v1, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    add-int/lit16 v1, v1, 0x203a

    .line 122
    .line 123
    int-to-char v1, v1

    .line 124
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    shr-int/lit8 v3, v3, 0x10

    .line 129
    .line 130
    const-string v4, "\u5875\u8c2f\u3953\u4020"

    .line 131
    .line 132
    const-string v5, "\u7715\u4efb"

    .line 133
    .line 134
    invoke-static {v1, v4, v5, v3}, LVa/r8;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    iget-object v1, p0, LVa/r8;->c:LVa/V8;

    .line 146
    .line 147
    if-eqz v1, :cond_1

    .line 148
    .line 149
    sget v2, LVa/r8;->f:I

    .line 150
    .line 151
    add-int/lit8 v2, v2, 0x67

    .line 152
    .line 153
    rem-int/lit16 v2, v2, 0x80

    .line 154
    .line 155
    sput v2, LVa/r8;->g:I

    .line 156
    .line 157
    invoke-virtual {v1}, LVa/V8;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    sget v2, LVa/r8;->g:I

    .line 162
    .line 163
    add-int/2addr v2, v7

    .line 164
    rem-int/lit16 v2, v2, 0x80

    .line 165
    .line 166
    sput v2, LVa/r8;->f:I

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_1
    const-string v1, "\u13d6\u90a8\u6394\uc953\u13ad\u7518\ua8c9"

    .line 170
    .line 171
    invoke-static {v2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    invoke-static {v2, v1}, LVa/r8;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    return-object v0

    .line 191
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    .line 192
    .line 193
    const-string v1, "delimiter"

    .line 194
    .line 195
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v0
.end method
