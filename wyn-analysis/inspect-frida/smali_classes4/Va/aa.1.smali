.class public final enum LVa/aa;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:LVa/aa;

.field public static final enum c:LVa/aa;

.field public static final enum d:LVa/aa;

.field public static final enum e:LVa/aa;

.field public static final enum f:LVa/aa;

.field public static final enum g:LVa/aa;

.field public static final enum h:LVa/aa;

.field public static final enum i:LVa/aa;

.field public static final synthetic j:[LVa/aa;

.field public static final k:[C

.field public static l:I = 0x0

.field public static m:I = 0x1


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    const/4 v0, 0x7

    .line 2
    const/4 v1, 0x6

    .line 3
    const/4 v2, 0x5

    .line 4
    const/4 v3, 0x4

    .line 5
    const/4 v4, 0x3

    .line 6
    const/4 v5, 0x2

    .line 7
    const/4 v6, 0x1

    .line 8
    const/4 v7, 0x0

    .line 9
    const/16 v8, 0x8

    .line 10
    .line 11
    const/16 v9, 0x15

    .line 12
    .line 13
    new-array v9, v9, [C

    .line 14
    .line 15
    fill-array-data v9, :array_0

    .line 16
    .line 17
    .line 18
    sput-object v9, LVa/aa;->k:[C

    .line 19
    .line 20
    new-instance v9, LVa/aa;

    .line 21
    .line 22
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 23
    .line 24
    .line 25
    move-result v10

    .line 26
    shr-int/2addr v10, v8

    .line 27
    add-int/lit8 v10, v10, 0x7f

    .line 28
    .line 29
    const-string v11, "\u0082\u0085\u0084\u0082\u0083\u0082\u0081"

    .line 30
    .line 31
    invoke-static {v10, v11}, LVa/aa;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v10

    .line 35
    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    const/4 v11, -0x1

    .line 40
    invoke-direct {v9, v10, v7, v11}, LVa/aa;-><init>(Ljava/lang/String;II)V

    .line 41
    .line 42
    .line 43
    sput-object v9, LVa/aa;->b:LVa/aa;

    .line 44
    .line 45
    new-instance v10, LVa/aa;

    .line 46
    .line 47
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 48
    .line 49
    .line 50
    move-result-wide v11

    .line 51
    const-wide/16 v13, 0x0

    .line 52
    .line 53
    cmp-long v11, v11, v13

    .line 54
    .line 55
    rsub-int v11, v11, 0x80

    .line 56
    .line 57
    const-string v12, "\u008a\u0089\u0088\u0087\u0086"

    .line 58
    .line 59
    invoke-static {v11, v12}, LVa/aa;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    invoke-direct {v10, v11, v6, v7}, LVa/aa;-><init>(Ljava/lang/String;II)V

    .line 68
    .line 69
    .line 70
    sput-object v10, LVa/aa;->c:LVa/aa;

    .line 71
    .line 72
    new-instance v11, LVa/aa;

    .line 73
    .line 74
    const/4 v12, 0x0

    .line 75
    invoke-static {v7, v12, v12}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 76
    .line 77
    .line 78
    move-result v13

    .line 79
    cmpl-float v12, v13, v12

    .line 80
    .line 81
    rsub-int/lit8 v12, v12, 0x7f

    .line 82
    .line 83
    const-string v13, "\u008d\u0087\u008c\u008b"

    .line 84
    .line 85
    invoke-static {v12, v13}, LVa/aa;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v12

    .line 89
    invoke-virtual {v12}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v12

    .line 93
    invoke-direct {v11, v12, v5, v6}, LVa/aa;-><init>(Ljava/lang/String;II)V

    .line 94
    .line 95
    .line 96
    sput-object v11, LVa/aa;->d:LVa/aa;

    .line 97
    .line 98
    new-instance v12, LVa/aa;

    .line 99
    .line 100
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    shr-int/lit8 v13, v13, 0x10

    .line 105
    .line 106
    rsub-int/lit8 v13, v13, 0x7f

    .line 107
    .line 108
    const-string v14, "\u0084\u008a\u008f\u0086\u008e"

    .line 109
    .line 110
    invoke-static {v13, v14}, LVa/aa;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    invoke-virtual {v13}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    invoke-direct {v12, v13, v4, v5}, LVa/aa;-><init>(Ljava/lang/String;II)V

    .line 119
    .line 120
    .line 121
    sput-object v12, LVa/aa;->e:LVa/aa;

    .line 122
    .line 123
    new-instance v13, LVa/aa;

    .line 124
    .line 125
    invoke-static {v7, v7}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 126
    .line 127
    .line 128
    move-result v14

    .line 129
    rsub-int/lit8 v14, v14, 0x7f

    .line 130
    .line 131
    const-string v15, "\u008a\u008d\u0092\u0088\u0091\u0088\u008d\u0090"

    .line 132
    .line 133
    invoke-static {v14, v15}, LVa/aa;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v14

    .line 137
    invoke-virtual {v14}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v14

    .line 141
    invoke-direct {v13, v14, v3, v4}, LVa/aa;-><init>(Ljava/lang/String;II)V

    .line 142
    .line 143
    .line 144
    sput-object v13, LVa/aa;->f:LVa/aa;

    .line 145
    .line 146
    new-instance v14, LVa/aa;

    .line 147
    .line 148
    invoke-static {v7}, Landroid/graphics/Color;->red(I)I

    .line 149
    .line 150
    .line 151
    move-result v15

    .line 152
    rsub-int/lit8 v15, v15, 0x7f

    .line 153
    .line 154
    move/from16 v16, v4

    .line 155
    .line 156
    const-string v4, "\u008a\u0089\u0088\u0090\u0092\u008a\u0085"

    .line 157
    .line 158
    invoke-static {v15, v4}, LVa/aa;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-direct {v14, v4, v2, v3}, LVa/aa;-><init>(Ljava/lang/String;II)V

    .line 167
    .line 168
    .line 169
    sput-object v14, LVa/aa;->g:LVa/aa;

    .line 170
    .line 171
    new-instance v4, LVa/aa;

    .line 172
    .line 173
    invoke-static {v7}, Landroid/os/Process;->getThreadPriority(I)I

    .line 174
    .line 175
    .line 176
    move-result v15

    .line 177
    add-int/lit8 v15, v15, 0x14

    .line 178
    .line 179
    shr-int/2addr v15, v1

    .line 180
    add-int/lit8 v15, v15, 0x7f

    .line 181
    .line 182
    move/from16 v17, v3

    .line 183
    .line 184
    const-string v3, "\u0094\u0086\u008c\u0088\u008c\u0093"

    .line 185
    .line 186
    invoke-static {v15, v3}, LVa/aa;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-direct {v4, v3, v1, v2}, LVa/aa;-><init>(Ljava/lang/String;II)V

    .line 195
    .line 196
    .line 197
    sput-object v4, LVa/aa;->h:LVa/aa;

    .line 198
    .line 199
    new-instance v3, LVa/aa;

    .line 200
    .line 201
    const-string v15, ""

    .line 202
    .line 203
    invoke-static {v15}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    move-result v15

    .line 207
    rsub-int/lit8 v15, v15, 0x7f

    .line 208
    .line 209
    move/from16 v18, v2

    .line 210
    .line 211
    const-string v2, "\u008d\u008a\u0093\u0081\u0084\u0095\u0088\u0094"

    .line 212
    .line 213
    invoke-static {v15, v2}, LVa/aa;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-direct {v3, v2, v0, v1}, LVa/aa;-><init>(Ljava/lang/String;II)V

    .line 222
    .line 223
    .line 224
    sput-object v3, LVa/aa;->i:LVa/aa;

    .line 225
    .line 226
    new-array v2, v8, [LVa/aa;

    .line 227
    .line 228
    aput-object v9, v2, v7

    .line 229
    .line 230
    aput-object v10, v2, v6

    .line 231
    .line 232
    aput-object v11, v2, v5

    .line 233
    .line 234
    aput-object v12, v2, v16

    .line 235
    .line 236
    aput-object v13, v2, v17

    .line 237
    .line 238
    aput-object v14, v2, v18

    .line 239
    .line 240
    aput-object v4, v2, v1

    .line 241
    .line 242
    aput-object v3, v2, v0

    .line 243
    .line 244
    sput-object v2, LVa/aa;->j:[LVa/aa;

    .line 245
    .line 246
    sget v0, LVa/aa;->m:I

    .line 247
    .line 248
    add-int/lit8 v0, v0, 0x6d

    .line 249
    .line 250
    rem-int/lit16 v1, v0, 0x80

    .line 251
    .line 252
    sput v1, LVa/aa;->l:I

    .line 253
    .line 254
    rem-int/2addr v0, v5

    .line 255
    if-nez v0, :cond_0

    .line 256
    .line 257
    return-void

    .line 258
    :cond_0
    const/4 v0, 0x0

    .line 259
    throw v0

    .line 260
    nop

    .line 261
    :array_0
    .array-data 2
        0x17es
        0x177s
        0x174s
        0x178s
        0x180s
        0x172s
        0x176s
        0x16as
        0x170s
        0x16es
        0x171s
        0x17ds
        0x175s
        0x17fs
        0x16ds
        0x179s
        0x182s
        0x16bs
        0x17cs
        0x16cs
        0x17bs
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LVa/aa;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static a(I)LVa/aa;
    .locals 2

    .line 1
    sget v0, LVa/aa;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x17

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/aa;->l:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    packed-switch p0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    return-object v1

    .line 14
    :pswitch_0
    sget-object p0, LVa/aa;->i:LVa/aa;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_1
    sget-object p0, LVa/aa;->h:LVa/aa;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_2
    add-int/lit8 v0, v0, 0x3f

    .line 21
    .line 22
    rem-int/lit16 p0, v0, 0x80

    .line 23
    .line 24
    sput p0, LVa/aa;->m:I

    .line 25
    .line 26
    rem-int/lit8 v0, v0, 0x2

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    sget-object p0, LVa/aa;->g:LVa/aa;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_0
    throw v1

    .line 34
    :pswitch_3
    sget-object p0, LVa/aa;->f:LVa/aa;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_4
    sget-object p0, LVa/aa;->e:LVa/aa;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_5
    sget-object p0, LVa/aa;->d:LVa/aa;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_6
    sget-object p0, LVa/aa;->c:LVa/aa;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_7
    sget-object p0, LVa/aa;->b:LVa/aa;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static c(ILjava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "ISO-8859-1"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, [B

    .line 8
    .line 9
    sget-object v0, LVa/a;->x:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v1, LVa/aa;->k:[C

    .line 13
    .line 14
    array-length v2, p1

    .line 15
    sput v2, LVa/a;->w:I

    .line 16
    .line 17
    new-array v2, v2, [C

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    sput v3, LVa/a;->v:I

    .line 21
    .line 22
    :goto_0
    sget v3, LVa/a;->v:I

    .line 23
    .line 24
    sget v4, LVa/a;->w:I

    .line 25
    .line 26
    if-ge v3, v4, :cond_0

    .line 27
    .line 28
    add-int/lit8 v4, v4, -0x1

    .line 29
    .line 30
    sub-int/2addr v4, v3

    .line 31
    aget-byte v4, p1, v4

    .line 32
    .line 33
    add-int/2addr v4, p0

    .line 34
    aget-char v4, v1, v4

    .line 35
    .line 36
    add-int/lit16 v4, v4, -0x129

    .line 37
    .line 38
    int-to-char v4, v4

    .line 39
    aput-char v4, v2, v3

    .line 40
    .line 41
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    sput v3, LVa/a;->v:I

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    .line 51
    .line 52
    .line 53
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    return-object p0

    .line 55
    :goto_1
    monitor-exit v0

    .line 56
    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)LVa/aa;
    .locals 2

    .line 1
    sget v0, LVa/aa;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0xb

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/aa;->m:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-class v1, LVa/aa;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {v1, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, LVa/aa;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-static {v1, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0
.end method

.method public static values()[LVa/aa;
    .locals 2

    .line 1
    sget v0, LVa/aa;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x57

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/aa;->m:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    sget-object v1, LVa/aa;->j:[LVa/aa;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, [LVa/aa;->clone()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, [LVa/aa;

    .line 20
    .line 21
    const/16 v1, 0x36

    .line 22
    .line 23
    div-int/lit8 v1, v1, 0x0

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    invoke-virtual {v1}, [LVa/aa;->clone()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, [LVa/aa;

    .line 31
    .line 32
    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 2

    .line 1
    sget v0, LVa/aa;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x17

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/aa;->l:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    div-int/lit8 v0, v0, 0x0

    .line 15
    .line 16
    :cond_0
    add-int/lit8 v1, v1, 0x6d

    .line 17
    .line 18
    rem-int/lit16 v1, v1, 0x80

    .line 19
    .line 20
    sput v1, LVa/aa;->m:I

    .line 21
    .line 22
    iget v0, p0, LVa/aa;->a:I

    .line 23
    .line 24
    return v0
.end method
