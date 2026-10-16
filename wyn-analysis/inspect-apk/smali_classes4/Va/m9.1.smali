.class public abstract LVa/m9;
.super LVa/r9;
.source "SourceFile"


# static fields
.field public static final d:[C

.field public static e:I = 0x0

.field public static f:I = 0x1

.field public static final g:[I


# instance fields
.field public final synthetic c:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/m9;->d:[C

    .line 9
    .line 10
    const/16 v0, 0x12

    .line 11
    .line 12
    new-array v0, v0, [I

    .line 13
    .line 14
    fill-array-data v0, :array_1

    .line 15
    .line 16
    .line 17
    sput-object v0, LVa/m9;->g:[I

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :array_0
    .array-data 2
        0x102s
        0x119s
        0x114s
        0x105s
        0x104s
        0x101s
        0x10es
        0x103s
    .end array-data

    .line 22
    .line 23
    .line 24
    :array_1
    .array-data 4
        -0x62933a7
        0x776c971c
        -0x54abca20
        -0x4aa8d73c
        -0x661bd426
        -0x9138c8c
        0x7d2384d6
        -0x2eacb6d5
        -0x2dcdeaec
        -0x2e7daf73
        0x52b0d157
        -0x46c5b578
        -0x4bd27cca
        -0x66169bff
        -0x1b3a1e70
        0x6c711b5d
        0x29a267c9
        -0x6f003e99
    .end array-data
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/m9;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final f()Ljava/lang/String;
    .locals 7

    .line 1
    sget v0, LVa/m9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x43

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/m9;->f:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit16 v1, v1, 0x80

    .line 15
    .line 16
    const-string v2, "\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"

    .line 17
    .line 18
    const-string v3, "ISO-8859-1"

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, [B

    .line 25
    .line 26
    sget-object v3, LVa/a;->x:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v3

    .line 29
    :try_start_0
    sget-object v4, LVa/m9;->d:[C

    .line 30
    .line 31
    array-length v5, v2

    .line 32
    sput v5, LVa/a;->w:I

    .line 33
    .line 34
    new-array v5, v5, [C

    .line 35
    .line 36
    sput v0, LVa/a;->v:I

    .line 37
    .line 38
    :goto_0
    sget v0, LVa/a;->v:I

    .line 39
    .line 40
    sget v6, LVa/a;->w:I

    .line 41
    .line 42
    if-ge v0, v6, :cond_0

    .line 43
    .line 44
    add-int/lit8 v6, v6, -0x1

    .line 45
    .line 46
    sub-int/2addr v6, v0

    .line 47
    aget-byte v6, v2, v6

    .line 48
    .line 49
    add-int/2addr v6, v1

    .line 50
    aget-char v6, v4, v6

    .line 51
    .line 52
    add-int/lit16 v6, v6, -0xa0

    .line 53
    .line 54
    int-to-char v6, v6

    .line 55
    aput-char v6, v5, v0

    .line 56
    .line 57
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    sput v0, LVa/a;->v:I

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    goto :goto_1

    .line 64
    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 65
    .line 66
    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    .line 67
    .line 68
    .line 69
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sget v1, LVa/m9;->f:I

    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x7b

    .line 77
    .line 78
    rem-int/lit16 v2, v1, 0x80

    .line 79
    .line 80
    sput v2, LVa/m9;->e:I

    .line 81
    .line 82
    rem-int/lit8 v1, v1, 0x2

    .line 83
    .line 84
    if-nez v1, :cond_1

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_1
    const/4 v0, 0x0

    .line 88
    throw v0

    .line 89
    :goto_1
    monitor-exit v3

    .line 90
    throw v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 15

    .line 1
    iget v0, p0, LVa/m9;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const v0, -0xe59aa49

    .line 7
    .line 8
    .line 9
    const v1, -0x11a3aa25

    .line 10
    .line 11
    .line 12
    const v2, 0x467b2811

    .line 13
    .line 14
    .line 15
    const v3, -0x29ea4509

    .line 16
    .line 17
    .line 18
    filled-new-array {v2, v3, v0, v1}, [I

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-static {v1, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    rsub-int/lit8 v2, v2, 0x6

    .line 28
    .line 29
    sget-object v3, LVa/a;->n:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v3

    .line 32
    const/4 v4, 0x4

    .line 33
    :try_start_0
    new-array v5, v4, [C

    .line 34
    .line 35
    const/16 v6, 0x8

    .line 36
    .line 37
    new-array v6, v6, [C

    .line 38
    .line 39
    sget-object v7, LVa/m9;->g:[I

    .line 40
    .line 41
    invoke-virtual {v7}, [I->clone()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    check-cast v7, [I

    .line 46
    .line 47
    sput v1, LVa/a;->k:I

    .line 48
    .line 49
    :goto_0
    sget v8, LVa/a;->k:I

    .line 50
    .line 51
    if-ge v8, v4, :cond_1

    .line 52
    .line 53
    aget v9, v0, v8

    .line 54
    .line 55
    shr-int/lit8 v10, v9, 0x10

    .line 56
    .line 57
    int-to-char v10, v10

    .line 58
    aput-char v10, v5, v1

    .line 59
    .line 60
    int-to-char v9, v9

    .line 61
    const/4 v11, 0x1

    .line 62
    aput-char v9, v5, v11

    .line 63
    .line 64
    add-int/lit8 v8, v8, 0x1

    .line 65
    .line 66
    aget v8, v0, v8

    .line 67
    .line 68
    shr-int/lit8 v12, v8, 0x10

    .line 69
    .line 70
    int-to-char v12, v12

    .line 71
    const/4 v13, 0x2

    .line 72
    aput-char v12, v5, v13

    .line 73
    .line 74
    int-to-char v8, v8

    .line 75
    const/4 v14, 0x3

    .line 76
    aput-char v8, v5, v14

    .line 77
    .line 78
    shl-int/lit8 v10, v10, 0x10

    .line 79
    .line 80
    add-int/2addr v10, v9

    .line 81
    sput v10, LVa/a;->l:I

    .line 82
    .line 83
    shl-int/lit8 v9, v12, 0x10

    .line 84
    .line 85
    add-int/2addr v9, v8

    .line 86
    sput v9, LVa/a;->m:I

    .line 87
    .line 88
    invoke-static {v7}, LVa/a;->o([I)V

    .line 89
    .line 90
    .line 91
    move v8, v1

    .line 92
    :goto_1
    const/16 v9, 0x10

    .line 93
    .line 94
    if-ge v8, v9, :cond_0

    .line 95
    .line 96
    sget v9, LVa/a;->l:I

    .line 97
    .line 98
    aget v10, v7, v8

    .line 99
    .line 100
    xor-int/2addr v9, v10

    .line 101
    sput v9, LVa/a;->l:I

    .line 102
    .line 103
    invoke-static {v9}, LVa/a;->G(I)I

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    sget v10, LVa/a;->m:I

    .line 108
    .line 109
    xor-int/2addr v9, v10

    .line 110
    sget v10, LVa/a;->l:I

    .line 111
    .line 112
    sput v9, LVa/a;->l:I

    .line 113
    .line 114
    sput v10, LVa/a;->m:I

    .line 115
    .line 116
    add-int/lit8 v8, v8, 0x1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :catchall_0
    move-exception v0

    .line 120
    goto :goto_2

    .line 121
    :cond_0
    sget v8, LVa/a;->l:I

    .line 122
    .line 123
    sget v10, LVa/a;->m:I

    .line 124
    .line 125
    sput v10, LVa/a;->l:I

    .line 126
    .line 127
    sput v8, LVa/a;->m:I

    .line 128
    .line 129
    aget v9, v7, v9

    .line 130
    .line 131
    xor-int/2addr v8, v9

    .line 132
    sput v8, LVa/a;->m:I

    .line 133
    .line 134
    const/16 v9, 0x11

    .line 135
    .line 136
    aget v9, v7, v9

    .line 137
    .line 138
    xor-int/2addr v9, v10

    .line 139
    sput v9, LVa/a;->l:I

    .line 140
    .line 141
    ushr-int/lit8 v10, v9, 0x10

    .line 142
    .line 143
    int-to-char v10, v10

    .line 144
    aput-char v10, v5, v1

    .line 145
    .line 146
    int-to-char v9, v9

    .line 147
    aput-char v9, v5, v11

    .line 148
    .line 149
    ushr-int/lit8 v9, v8, 0x10

    .line 150
    .line 151
    int-to-char v9, v9

    .line 152
    aput-char v9, v5, v13

    .line 153
    .line 154
    int-to-char v8, v8

    .line 155
    aput-char v8, v5, v14

    .line 156
    .line 157
    invoke-static {v7}, LVa/a;->o([I)V

    .line 158
    .line 159
    .line 160
    sget v8, LVa/a;->k:I

    .line 161
    .line 162
    shl-int/lit8 v9, v8, 0x1

    .line 163
    .line 164
    aget-char v10, v5, v1

    .line 165
    .line 166
    aput-char v10, v6, v9

    .line 167
    .line 168
    add-int/lit8 v10, v9, 0x1

    .line 169
    .line 170
    aget-char v11, v5, v11

    .line 171
    .line 172
    aput-char v11, v6, v10

    .line 173
    .line 174
    add-int/lit8 v10, v9, 0x2

    .line 175
    .line 176
    aget-char v11, v5, v13

    .line 177
    .line 178
    aput-char v11, v6, v10

    .line 179
    .line 180
    add-int/lit8 v9, v9, 0x3

    .line 181
    .line 182
    aget-char v10, v5, v14

    .line 183
    .line 184
    aput-char v10, v6, v9

    .line 185
    .line 186
    add-int/lit8 v8, v8, 0x2

    .line 187
    .line 188
    sput v8, LVa/a;->k:I

    .line 189
    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :cond_1
    new-instance v0, Ljava/lang/String;

    .line 193
    .line 194
    invoke-direct {v0, v6, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 195
    .line 196
    .line 197
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    return-object v0

    .line 203
    :goto_2
    monitor-exit v3

    .line 204
    throw v0

    .line 205
    :pswitch_0
    invoke-direct {p0}, LVa/m9;->f()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    return-object v0

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c()LVa/Z0;
    .locals 3

    .line 1
    new-instance v0, LVa/h2;

    .line 2
    .line 3
    invoke-virtual {p0}, LVa/m9;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, LVa/Z0;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget v1, LVa/m9;->e:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x57

    .line 13
    .line 14
    rem-int/lit16 v2, v1, 0x80

    .line 15
    .line 16
    sput v2, LVa/m9;->f:I

    .line 17
    .line 18
    rem-int/lit8 v1, v1, 0x2

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    throw v0
.end method
