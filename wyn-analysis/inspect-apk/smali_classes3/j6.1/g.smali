.class public final Lj6/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:[B

.field public static final i:[B

.field public static final j:[B


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public final b:Landroid/graphics/Paint;

.field public final c:Landroid/graphics/Canvas;

.field public final d:LR2/b;

.field public final e:Lj6/b;

.field public final f:LR2/h;

.field public g:Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v1, Lj6/g;->h:[B

    .line 8
    .line 9
    new-array v0, v0, [B

    .line 10
    .line 11
    fill-array-data v0, :array_1

    .line 12
    .line 13
    .line 14
    sput-object v0, Lj6/g;->i:[B

    .line 15
    .line 16
    const/16 v0, 0x10

    .line 17
    .line 18
    new-array v0, v0, [B

    .line 19
    .line 20
    fill-array-data v0, :array_2

    .line 21
    .line 22
    .line 23
    sput-object v0, Lj6/g;->j:[B

    .line 24
    .line 25
    return-void

    .line 26
    nop

    :array_0
    .array-data 1
        0x0t
        0x7t
        0x8t
        0xft
    .end array-data

    :array_1
    .array-data 1
        0x0t
        0x77t
        -0x78t
        -0x1t
    .end array-data

    :array_2
    .array-data 1
        0x0t
        0x11t
        0x22t
        0x33t
        0x44t
        0x55t
        0x66t
        0x77t
        -0x78t
        -0x67t
        -0x56t
        -0x45t
        -0x34t
        -0x23t
        -0x12t
        -0x1t
    .end array-data
.end method

.method public constructor <init>(II)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lj6/g;->a:Landroid/graphics/Paint;

    .line 10
    .line 11
    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 17
    .line 18
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    .line 19
    .line 20
    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 28
    .line 29
    .line 30
    new-instance v0, Landroid/graphics/Paint;

    .line 31
    .line 32
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lj6/g;->b:Landroid/graphics/Paint;

    .line 36
    .line 37
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 40
    .line 41
    .line 42
    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    .line 43
    .line 44
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->DST_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 45
    .line 46
    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 53
    .line 54
    .line 55
    new-instance v0, Landroid/graphics/Canvas;

    .line 56
    .line 57
    invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lj6/g;->c:Landroid/graphics/Canvas;

    .line 61
    .line 62
    new-instance v1, LR2/b;

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    const/16 v5, 0x2cf

    .line 66
    .line 67
    const/16 v2, 0x2cf

    .line 68
    .line 69
    const/16 v3, 0x23f

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    const/16 v7, 0x23f

    .line 73
    .line 74
    invoke-direct/range {v1 .. v7}, LR2/b;-><init>(IIIIII)V

    .line 75
    .line 76
    .line 77
    iput-object v1, p0, Lj6/g;->d:LR2/b;

    .line 78
    .line 79
    new-instance v0, Lj6/b;

    .line 80
    .line 81
    const v1, -0x808081

    .line 82
    .line 83
    .line 84
    const/4 v2, -0x1

    .line 85
    const/4 v3, 0x0

    .line 86
    const/high16 v4, -0x1000000

    .line 87
    .line 88
    filled-new-array {v3, v2, v4, v1}, [I

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {}, Lj6/g;->b()[I

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-static {}, Lj6/g;->c()[I

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-direct {v0, v3, v1, v2, v4}, Lj6/b;-><init>(I[I[I[I)V

    .line 101
    .line 102
    .line 103
    iput-object v0, p0, Lj6/g;->e:Lj6/b;

    .line 104
    .line 105
    new-instance v0, LR2/h;

    .line 106
    .line 107
    const/4 v1, 0x1

    .line 108
    invoke-direct {v0, p1, p2, v1}, LR2/h;-><init>(III)V

    .line 109
    .line 110
    .line 111
    iput-object v0, p0, Lj6/g;->f:LR2/h;

    .line 112
    .line 113
    return-void
.end method

.method public static a(IILJ5/y;)[B
    .locals 3

    .line 1
    new-array v0, p0, [B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, p0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p2, p1}, LJ5/y;->i(I)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    int-to-byte v2, v2

    .line 11
    aput-byte v2, v0, v1

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0
.end method

.method public static b()[I
    .locals 9

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aput v2, v1, v2

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    :goto_0
    if-ge v3, v0, :cond_7

    .line 10
    .line 11
    const/16 v4, 0x8

    .line 12
    .line 13
    const/16 v5, 0xff

    .line 14
    .line 15
    if-ge v3, v4, :cond_3

    .line 16
    .line 17
    and-int/lit8 v4, v3, 0x1

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    move v4, v5

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move v4, v2

    .line 24
    :goto_1
    and-int/lit8 v6, v3, 0x2

    .line 25
    .line 26
    if-eqz v6, :cond_1

    .line 27
    .line 28
    move v6, v5

    .line 29
    goto :goto_2

    .line 30
    :cond_1
    move v6, v2

    .line 31
    :goto_2
    and-int/lit8 v7, v3, 0x4

    .line 32
    .line 33
    if-eqz v7, :cond_2

    .line 34
    .line 35
    move v7, v5

    .line 36
    goto :goto_3

    .line 37
    :cond_2
    move v7, v2

    .line 38
    :goto_3
    invoke-static {v5, v4, v6, v7}, Lj6/g;->d(IIII)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    aput v4, v1, v3

    .line 43
    .line 44
    goto :goto_7

    .line 45
    :cond_3
    and-int/lit8 v4, v3, 0x1

    .line 46
    .line 47
    const/16 v6, 0x7f

    .line 48
    .line 49
    if-eqz v4, :cond_4

    .line 50
    .line 51
    move v4, v6

    .line 52
    goto :goto_4

    .line 53
    :cond_4
    move v4, v2

    .line 54
    :goto_4
    and-int/lit8 v7, v3, 0x2

    .line 55
    .line 56
    if-eqz v7, :cond_5

    .line 57
    .line 58
    move v7, v6

    .line 59
    goto :goto_5

    .line 60
    :cond_5
    move v7, v2

    .line 61
    :goto_5
    and-int/lit8 v8, v3, 0x4

    .line 62
    .line 63
    if-eqz v8, :cond_6

    .line 64
    .line 65
    goto :goto_6

    .line 66
    :cond_6
    move v6, v2

    .line 67
    :goto_6
    invoke-static {v5, v4, v7, v6}, Lj6/g;->d(IIII)I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    aput v4, v1, v3

    .line 72
    .line 73
    :goto_7
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_7
    return-object v1
.end method

.method public static c()[I
    .locals 11

    .line 1
    const/16 v0, 0x100

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aput v2, v1, v2

    .line 7
    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v0, :cond_20

    .line 10
    .line 11
    const/16 v4, 0x8

    .line 12
    .line 13
    const/16 v5, 0xff

    .line 14
    .line 15
    if-ge v3, v4, :cond_3

    .line 16
    .line 17
    and-int/lit8 v4, v3, 0x1

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    move v4, v5

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move v4, v2

    .line 24
    :goto_1
    and-int/lit8 v6, v3, 0x2

    .line 25
    .line 26
    if-eqz v6, :cond_1

    .line 27
    .line 28
    move v6, v5

    .line 29
    goto :goto_2

    .line 30
    :cond_1
    move v6, v2

    .line 31
    :goto_2
    and-int/lit8 v7, v3, 0x4

    .line 32
    .line 33
    if-eqz v7, :cond_2

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_2
    move v5, v2

    .line 37
    :goto_3
    const/16 v7, 0x3f

    .line 38
    .line 39
    invoke-static {v7, v4, v6, v5}, Lj6/g;->d(IIII)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    aput v4, v1, v3

    .line 44
    .line 45
    goto/16 :goto_1c

    .line 46
    .line 47
    :cond_3
    and-int/lit16 v6, v3, 0x88

    .line 48
    .line 49
    const/16 v7, 0xaa

    .line 50
    .line 51
    const/16 v8, 0x55

    .line 52
    .line 53
    if-eqz v6, :cond_19

    .line 54
    .line 55
    const/16 v9, 0x7f

    .line 56
    .line 57
    if-eq v6, v4, :cond_12

    .line 58
    .line 59
    const/16 v4, 0x80

    .line 60
    .line 61
    const/16 v7, 0x2b

    .line 62
    .line 63
    if-eq v6, v4, :cond_b

    .line 64
    .line 65
    const/16 v4, 0x88

    .line 66
    .line 67
    if-eq v6, v4, :cond_4

    .line 68
    .line 69
    goto/16 :goto_1c

    .line 70
    .line 71
    :cond_4
    and-int/lit8 v4, v3, 0x1

    .line 72
    .line 73
    if-eqz v4, :cond_5

    .line 74
    .line 75
    move v4, v7

    .line 76
    goto :goto_4

    .line 77
    :cond_5
    move v4, v2

    .line 78
    :goto_4
    and-int/lit8 v6, v3, 0x10

    .line 79
    .line 80
    if-eqz v6, :cond_6

    .line 81
    .line 82
    move v6, v8

    .line 83
    goto :goto_5

    .line 84
    :cond_6
    move v6, v2

    .line 85
    :goto_5
    add-int/2addr v4, v6

    .line 86
    and-int/lit8 v6, v3, 0x2

    .line 87
    .line 88
    if-eqz v6, :cond_7

    .line 89
    .line 90
    move v6, v7

    .line 91
    goto :goto_6

    .line 92
    :cond_7
    move v6, v2

    .line 93
    :goto_6
    and-int/lit8 v9, v3, 0x20

    .line 94
    .line 95
    if-eqz v9, :cond_8

    .line 96
    .line 97
    move v9, v8

    .line 98
    goto :goto_7

    .line 99
    :cond_8
    move v9, v2

    .line 100
    :goto_7
    add-int/2addr v6, v9

    .line 101
    and-int/lit8 v9, v3, 0x4

    .line 102
    .line 103
    if-eqz v9, :cond_9

    .line 104
    .line 105
    goto :goto_8

    .line 106
    :cond_9
    move v7, v2

    .line 107
    :goto_8
    and-int/lit8 v9, v3, 0x40

    .line 108
    .line 109
    if-eqz v9, :cond_a

    .line 110
    .line 111
    goto :goto_9

    .line 112
    :cond_a
    move v8, v2

    .line 113
    :goto_9
    add-int/2addr v7, v8

    .line 114
    invoke-static {v5, v4, v6, v7}, Lj6/g;->d(IIII)I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    aput v4, v1, v3

    .line 119
    .line 120
    goto/16 :goto_1c

    .line 121
    .line 122
    :cond_b
    and-int/lit8 v4, v3, 0x1

    .line 123
    .line 124
    if-eqz v4, :cond_c

    .line 125
    .line 126
    move v4, v7

    .line 127
    goto :goto_a

    .line 128
    :cond_c
    move v4, v2

    .line 129
    :goto_a
    add-int/2addr v4, v9

    .line 130
    and-int/lit8 v6, v3, 0x10

    .line 131
    .line 132
    if-eqz v6, :cond_d

    .line 133
    .line 134
    move v6, v8

    .line 135
    goto :goto_b

    .line 136
    :cond_d
    move v6, v2

    .line 137
    :goto_b
    add-int/2addr v4, v6

    .line 138
    and-int/lit8 v6, v3, 0x2

    .line 139
    .line 140
    if-eqz v6, :cond_e

    .line 141
    .line 142
    move v6, v7

    .line 143
    goto :goto_c

    .line 144
    :cond_e
    move v6, v2

    .line 145
    :goto_c
    add-int/2addr v6, v9

    .line 146
    and-int/lit8 v10, v3, 0x20

    .line 147
    .line 148
    if-eqz v10, :cond_f

    .line 149
    .line 150
    move v10, v8

    .line 151
    goto :goto_d

    .line 152
    :cond_f
    move v10, v2

    .line 153
    :goto_d
    add-int/2addr v6, v10

    .line 154
    and-int/lit8 v10, v3, 0x4

    .line 155
    .line 156
    if-eqz v10, :cond_10

    .line 157
    .line 158
    goto :goto_e

    .line 159
    :cond_10
    move v7, v2

    .line 160
    :goto_e
    add-int/2addr v7, v9

    .line 161
    and-int/lit8 v9, v3, 0x40

    .line 162
    .line 163
    if-eqz v9, :cond_11

    .line 164
    .line 165
    goto :goto_f

    .line 166
    :cond_11
    move v8, v2

    .line 167
    :goto_f
    add-int/2addr v7, v8

    .line 168
    invoke-static {v5, v4, v6, v7}, Lj6/g;->d(IIII)I

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    aput v4, v1, v3

    .line 173
    .line 174
    goto/16 :goto_1c

    .line 175
    .line 176
    :cond_12
    and-int/lit8 v4, v3, 0x1

    .line 177
    .line 178
    if-eqz v4, :cond_13

    .line 179
    .line 180
    move v4, v8

    .line 181
    goto :goto_10

    .line 182
    :cond_13
    move v4, v2

    .line 183
    :goto_10
    and-int/lit8 v5, v3, 0x10

    .line 184
    .line 185
    if-eqz v5, :cond_14

    .line 186
    .line 187
    move v5, v7

    .line 188
    goto :goto_11

    .line 189
    :cond_14
    move v5, v2

    .line 190
    :goto_11
    add-int/2addr v4, v5

    .line 191
    and-int/lit8 v5, v3, 0x2

    .line 192
    .line 193
    if-eqz v5, :cond_15

    .line 194
    .line 195
    move v5, v8

    .line 196
    goto :goto_12

    .line 197
    :cond_15
    move v5, v2

    .line 198
    :goto_12
    and-int/lit8 v6, v3, 0x20

    .line 199
    .line 200
    if-eqz v6, :cond_16

    .line 201
    .line 202
    move v6, v7

    .line 203
    goto :goto_13

    .line 204
    :cond_16
    move v6, v2

    .line 205
    :goto_13
    add-int/2addr v5, v6

    .line 206
    and-int/lit8 v6, v3, 0x4

    .line 207
    .line 208
    if-eqz v6, :cond_17

    .line 209
    .line 210
    goto :goto_14

    .line 211
    :cond_17
    move v8, v2

    .line 212
    :goto_14
    and-int/lit8 v6, v3, 0x40

    .line 213
    .line 214
    if-eqz v6, :cond_18

    .line 215
    .line 216
    goto :goto_15

    .line 217
    :cond_18
    move v7, v2

    .line 218
    :goto_15
    add-int/2addr v8, v7

    .line 219
    invoke-static {v9, v4, v5, v8}, Lj6/g;->d(IIII)I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    aput v4, v1, v3

    .line 224
    .line 225
    goto :goto_1c

    .line 226
    :cond_19
    and-int/lit8 v4, v3, 0x1

    .line 227
    .line 228
    if-eqz v4, :cond_1a

    .line 229
    .line 230
    move v4, v8

    .line 231
    goto :goto_16

    .line 232
    :cond_1a
    move v4, v2

    .line 233
    :goto_16
    and-int/lit8 v6, v3, 0x10

    .line 234
    .line 235
    if-eqz v6, :cond_1b

    .line 236
    .line 237
    move v6, v7

    .line 238
    goto :goto_17

    .line 239
    :cond_1b
    move v6, v2

    .line 240
    :goto_17
    add-int/2addr v4, v6

    .line 241
    and-int/lit8 v6, v3, 0x2

    .line 242
    .line 243
    if-eqz v6, :cond_1c

    .line 244
    .line 245
    move v6, v8

    .line 246
    goto :goto_18

    .line 247
    :cond_1c
    move v6, v2

    .line 248
    :goto_18
    and-int/lit8 v9, v3, 0x20

    .line 249
    .line 250
    if-eqz v9, :cond_1d

    .line 251
    .line 252
    move v9, v7

    .line 253
    goto :goto_19

    .line 254
    :cond_1d
    move v9, v2

    .line 255
    :goto_19
    add-int/2addr v6, v9

    .line 256
    and-int/lit8 v9, v3, 0x4

    .line 257
    .line 258
    if-eqz v9, :cond_1e

    .line 259
    .line 260
    goto :goto_1a

    .line 261
    :cond_1e
    move v8, v2

    .line 262
    :goto_1a
    and-int/lit8 v9, v3, 0x40

    .line 263
    .line 264
    if-eqz v9, :cond_1f

    .line 265
    .line 266
    goto :goto_1b

    .line 267
    :cond_1f
    move v7, v2

    .line 268
    :goto_1b
    add-int/2addr v8, v7

    .line 269
    invoke-static {v5, v4, v6, v8}, Lj6/g;->d(IIII)I

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    aput v4, v1, v3

    .line 274
    .line 275
    :goto_1c
    add-int/lit8 v3, v3, 0x1

    .line 276
    .line 277
    goto/16 :goto_0

    .line 278
    .line 279
    :cond_20
    return-object v1
.end method

.method public static d(IIII)I
    .locals 0

    .line 1
    shl-int/lit8 p0, p0, 0x18

    .line 2
    .line 3
    shl-int/lit8 p1, p1, 0x10

    .line 4
    .line 5
    or-int/2addr p0, p1

    .line 6
    shl-int/lit8 p1, p2, 0x8

    .line 7
    .line 8
    or-int/2addr p0, p1

    .line 9
    or-int/2addr p0, p3

    .line 10
    return p0
.end method

.method public static e([B[IIIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v7, p5

    .line 6
    .line 7
    new-instance v8, LJ5/y;

    .line 8
    .line 9
    array-length v2, v0

    .line 10
    const/4 v3, 0x6

    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v8, v0, v2, v3, v4}, LJ5/y;-><init>([BIIB)V

    .line 13
    .line 14
    .line 15
    move/from16 v2, p3

    .line 16
    .line 17
    move/from16 v9, p4

    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    const/4 v11, 0x0

    .line 21
    const/4 v12, 0x0

    .line 22
    :goto_0
    invoke-virtual {v8}, LJ5/y;->b()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_21

    .line 27
    .line 28
    const/16 v13, 0x8

    .line 29
    .line 30
    invoke-virtual {v8, v13}, LJ5/y;->i(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/16 v4, 0xf0

    .line 35
    .line 36
    if-eq v3, v4, :cond_20

    .line 37
    .line 38
    const/4 v14, 0x2

    .line 39
    const/4 v15, 0x1

    .line 40
    const/16 v16, 0x0

    .line 41
    .line 42
    const/4 v4, 0x3

    .line 43
    const/4 v5, 0x4

    .line 44
    packed-switch v3, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    packed-switch v3, :pswitch_data_1

    .line 48
    .line 49
    .line 50
    goto/16 :goto_12

    .line 51
    .line 52
    :pswitch_0
    const/16 v3, 0x10

    .line 53
    .line 54
    invoke-static {v3, v13, v8}, Lj6/g;->a(IILJ5/y;)[B

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    goto/16 :goto_12

    .line 59
    .line 60
    :pswitch_1
    invoke-static {v5, v13, v8}, Lj6/g;->a(IILJ5/y;)[B

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    goto/16 :goto_12

    .line 65
    .line 66
    :pswitch_2
    invoke-static {v5, v5, v8}, Lj6/g;->a(IILJ5/y;)[B

    .line 67
    .line 68
    .line 69
    move-result-object v12

    .line 70
    goto/16 :goto_12

    .line 71
    .line 72
    :pswitch_3
    move v14, v2

    .line 73
    move/from16 v2, v16

    .line 74
    .line 75
    :goto_1
    invoke-virtual {v8, v13}, LJ5/y;->i(I)I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_0

    .line 80
    .line 81
    move/from16 v17, v2

    .line 82
    .line 83
    move/from16 v18, v15

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_0
    invoke-virtual {v8}, LJ5/y;->h()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    const/4 v4, 0x7

    .line 91
    if-nez v3, :cond_2

    .line 92
    .line 93
    invoke-virtual {v8, v4}, LJ5/y;->i(I)I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_1

    .line 98
    .line 99
    move/from16 v17, v2

    .line 100
    .line 101
    move/from16 v18, v3

    .line 102
    .line 103
    move/from16 v3, v16

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_1
    move/from16 v17, v15

    .line 107
    .line 108
    move/from16 v3, v16

    .line 109
    .line 110
    move/from16 v18, v3

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_2
    invoke-virtual {v8, v4}, LJ5/y;->i(I)I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    invoke-virtual {v8, v13}, LJ5/y;->i(I)I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    move/from16 v17, v2

    .line 122
    .line 123
    move/from16 v18, v3

    .line 124
    .line 125
    move v3, v4

    .line 126
    :goto_2
    if-eqz v18, :cond_3

    .line 127
    .line 128
    if-eqz v7, :cond_3

    .line 129
    .line 130
    aget v2, p1, v3

    .line 131
    .line 132
    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 133
    .line 134
    .line 135
    int-to-float v3, v14

    .line 136
    int-to-float v4, v9

    .line 137
    add-int v2, v14, v18

    .line 138
    .line 139
    int-to-float v5, v2

    .line 140
    add-int/lit8 v2, v9, 0x1

    .line 141
    .line 142
    int-to-float v6, v2

    .line 143
    move-object/from16 v2, p6

    .line 144
    .line 145
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 146
    .line 147
    .line 148
    :cond_3
    add-int v14, v14, v18

    .line 149
    .line 150
    if-eqz v17, :cond_4

    .line 151
    .line 152
    move v2, v14

    .line 153
    goto/16 :goto_12

    .line 154
    .line 155
    :cond_4
    move/from16 v2, v17

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :pswitch_4
    if-ne v1, v4, :cond_6

    .line 159
    .line 160
    if-nez v11, :cond_5

    .line 161
    .line 162
    sget-object v3, Lj6/g;->j:[B

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_5
    move-object v3, v11

    .line 166
    :goto_3
    move-object/from16 v17, v3

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_6
    const/16 v17, 0x0

    .line 170
    .line 171
    :goto_4
    move/from16 v3, v16

    .line 172
    .line 173
    :goto_5
    invoke-virtual {v8, v5}, LJ5/y;->i(I)I

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    if-eqz v6, :cond_7

    .line 178
    .line 179
    move/from16 v18, v3

    .line 180
    .line 181
    move/from16 v19, v15

    .line 182
    .line 183
    goto/16 :goto_9

    .line 184
    .line 185
    :cond_7
    invoke-virtual {v8}, LJ5/y;->h()Z

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    if-nez v6, :cond_9

    .line 190
    .line 191
    invoke-virtual {v8, v4}, LJ5/y;->i(I)I

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    if-eqz v6, :cond_8

    .line 196
    .line 197
    add-int/lit8 v6, v6, 0x2

    .line 198
    .line 199
    move/from16 v18, v3

    .line 200
    .line 201
    move/from16 v19, v6

    .line 202
    .line 203
    :goto_6
    move/from16 v6, v16

    .line 204
    .line 205
    goto :goto_9

    .line 206
    :cond_8
    move/from16 v18, v15

    .line 207
    .line 208
    :goto_7
    move/from16 v6, v16

    .line 209
    .line 210
    move/from16 v19, v6

    .line 211
    .line 212
    goto :goto_9

    .line 213
    :cond_9
    invoke-virtual {v8}, LJ5/y;->h()Z

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    if-nez v6, :cond_a

    .line 218
    .line 219
    invoke-virtual {v8, v14}, LJ5/y;->i(I)I

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    add-int/2addr v6, v5

    .line 224
    invoke-virtual {v8, v5}, LJ5/y;->i(I)I

    .line 225
    .line 226
    .line 227
    move-result v18

    .line 228
    :goto_8
    move/from16 v19, v6

    .line 229
    .line 230
    move/from16 v6, v18

    .line 231
    .line 232
    move/from16 v18, v3

    .line 233
    .line 234
    goto :goto_9

    .line 235
    :cond_a
    invoke-virtual {v8, v14}, LJ5/y;->i(I)I

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    if-eqz v6, :cond_e

    .line 240
    .line 241
    if-eq v6, v15, :cond_d

    .line 242
    .line 243
    if-eq v6, v14, :cond_c

    .line 244
    .line 245
    if-eq v6, v4, :cond_b

    .line 246
    .line 247
    move/from16 v18, v3

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_b
    invoke-virtual {v8, v13}, LJ5/y;->i(I)I

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    add-int/lit8 v6, v6, 0x19

    .line 255
    .line 256
    invoke-virtual {v8, v5}, LJ5/y;->i(I)I

    .line 257
    .line 258
    .line 259
    move-result v18

    .line 260
    goto :goto_8

    .line 261
    :cond_c
    invoke-virtual {v8, v5}, LJ5/y;->i(I)I

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    add-int/lit8 v6, v6, 0x9

    .line 266
    .line 267
    invoke-virtual {v8, v5}, LJ5/y;->i(I)I

    .line 268
    .line 269
    .line 270
    move-result v18

    .line 271
    goto :goto_8

    .line 272
    :cond_d
    move/from16 v18, v3

    .line 273
    .line 274
    move/from16 v19, v14

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_e
    move/from16 v18, v3

    .line 278
    .line 279
    move/from16 v19, v15

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :goto_9
    if-eqz v19, :cond_10

    .line 283
    .line 284
    if-eqz v7, :cond_10

    .line 285
    .line 286
    if-eqz v17, :cond_f

    .line 287
    .line 288
    aget-byte v6, v17, v6

    .line 289
    .line 290
    :cond_f
    aget v3, p1, v6

    .line 291
    .line 292
    invoke-virtual {v7, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 293
    .line 294
    .line 295
    int-to-float v3, v2

    .line 296
    move v6, v4

    .line 297
    int-to-float v4, v9

    .line 298
    add-int v0, v2, v19

    .line 299
    .line 300
    int-to-float v0, v0

    .line 301
    add-int/lit8 v5, v9, 0x1

    .line 302
    .line 303
    int-to-float v5, v5

    .line 304
    move/from16 v21, v5

    .line 305
    .line 306
    move v5, v0

    .line 307
    move v0, v6

    .line 308
    move/from16 v6, v21

    .line 309
    .line 310
    move/from16 v21, v2

    .line 311
    .line 312
    move-object/from16 v2, p6

    .line 313
    .line 314
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 315
    .line 316
    .line 317
    goto :goto_a

    .line 318
    :cond_10
    move/from16 v21, v2

    .line 319
    .line 320
    move v0, v4

    .line 321
    :goto_a
    add-int v2, v21, v19

    .line 322
    .line 323
    if-eqz v18, :cond_11

    .line 324
    .line 325
    invoke-virtual {v8}, LJ5/y;->c()V

    .line 326
    .line 327
    .line 328
    goto/16 :goto_12

    .line 329
    .line 330
    :cond_11
    move v4, v0

    .line 331
    move/from16 v3, v18

    .line 332
    .line 333
    const/4 v5, 0x4

    .line 334
    goto/16 :goto_5

    .line 335
    .line 336
    :pswitch_5
    move v0, v4

    .line 337
    if-ne v1, v0, :cond_13

    .line 338
    .line 339
    if-nez v10, :cond_12

    .line 340
    .line 341
    sget-object v3, Lj6/g;->i:[B

    .line 342
    .line 343
    goto :goto_b

    .line 344
    :cond_12
    move-object v3, v10

    .line 345
    :goto_b
    move-object/from16 v17, v3

    .line 346
    .line 347
    goto :goto_c

    .line 348
    :cond_13
    if-ne v1, v14, :cond_15

    .line 349
    .line 350
    if-nez v12, :cond_14

    .line 351
    .line 352
    sget-object v3, Lj6/g;->h:[B

    .line 353
    .line 354
    goto :goto_b

    .line 355
    :cond_14
    move-object v3, v12

    .line 356
    goto :goto_b

    .line 357
    :cond_15
    const/16 v17, 0x0

    .line 358
    .line 359
    :goto_c
    move/from16 v3, v16

    .line 360
    .line 361
    :goto_d
    invoke-virtual {v8, v14}, LJ5/y;->i(I)I

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    if-eqz v4, :cond_16

    .line 366
    .line 367
    move/from16 v18, v3

    .line 368
    .line 369
    move v5, v4

    .line 370
    move/from16 v19, v15

    .line 371
    .line 372
    :goto_e
    const/4 v4, 0x4

    .line 373
    goto/16 :goto_10

    .line 374
    .line 375
    :cond_16
    invoke-virtual {v8}, LJ5/y;->h()Z

    .line 376
    .line 377
    .line 378
    move-result v4

    .line 379
    if-eqz v4, :cond_17

    .line 380
    .line 381
    invoke-virtual {v8, v0}, LJ5/y;->i(I)I

    .line 382
    .line 383
    .line 384
    move-result v4

    .line 385
    add-int/2addr v4, v0

    .line 386
    invoke-virtual {v8, v14}, LJ5/y;->i(I)I

    .line 387
    .line 388
    .line 389
    move-result v5

    .line 390
    :goto_f
    move/from16 v18, v3

    .line 391
    .line 392
    move/from16 v19, v4

    .line 393
    .line 394
    goto :goto_e

    .line 395
    :cond_17
    invoke-virtual {v8}, LJ5/y;->h()Z

    .line 396
    .line 397
    .line 398
    move-result v4

    .line 399
    if-eqz v4, :cond_18

    .line 400
    .line 401
    move/from16 v18, v3

    .line 402
    .line 403
    move/from16 v19, v15

    .line 404
    .line 405
    move/from16 v5, v16

    .line 406
    .line 407
    goto :goto_e

    .line 408
    :cond_18
    invoke-virtual {v8, v14}, LJ5/y;->i(I)I

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    if-eqz v4, :cond_1c

    .line 413
    .line 414
    if-eq v4, v15, :cond_1b

    .line 415
    .line 416
    if-eq v4, v14, :cond_1a

    .line 417
    .line 418
    if-eq v4, v0, :cond_19

    .line 419
    .line 420
    move/from16 v18, v3

    .line 421
    .line 422
    move/from16 v5, v16

    .line 423
    .line 424
    move/from16 v19, v5

    .line 425
    .line 426
    goto :goto_e

    .line 427
    :cond_19
    invoke-virtual {v8, v13}, LJ5/y;->i(I)I

    .line 428
    .line 429
    .line 430
    move-result v4

    .line 431
    add-int/lit8 v4, v4, 0x1d

    .line 432
    .line 433
    invoke-virtual {v8, v14}, LJ5/y;->i(I)I

    .line 434
    .line 435
    .line 436
    move-result v5

    .line 437
    goto :goto_f

    .line 438
    :cond_1a
    const/4 v4, 0x4

    .line 439
    invoke-virtual {v8, v4}, LJ5/y;->i(I)I

    .line 440
    .line 441
    .line 442
    move-result v5

    .line 443
    add-int/lit8 v5, v5, 0xc

    .line 444
    .line 445
    invoke-virtual {v8, v14}, LJ5/y;->i(I)I

    .line 446
    .line 447
    .line 448
    move-result v6

    .line 449
    move/from16 v18, v3

    .line 450
    .line 451
    move/from16 v19, v5

    .line 452
    .line 453
    move v5, v6

    .line 454
    goto :goto_10

    .line 455
    :cond_1b
    const/4 v4, 0x4

    .line 456
    move/from16 v18, v3

    .line 457
    .line 458
    move/from16 v19, v14

    .line 459
    .line 460
    move/from16 v5, v16

    .line 461
    .line 462
    goto :goto_10

    .line 463
    :cond_1c
    const/4 v4, 0x4

    .line 464
    move/from16 v18, v15

    .line 465
    .line 466
    move/from16 v5, v16

    .line 467
    .line 468
    move/from16 v19, v5

    .line 469
    .line 470
    :goto_10
    if-eqz v19, :cond_1e

    .line 471
    .line 472
    if-eqz v7, :cond_1e

    .line 473
    .line 474
    if-eqz v17, :cond_1d

    .line 475
    .line 476
    aget-byte v5, v17, v5

    .line 477
    .line 478
    :cond_1d
    aget v3, p1, v5

    .line 479
    .line 480
    invoke-virtual {v7, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 481
    .line 482
    .line 483
    int-to-float v3, v2

    .line 484
    move/from16 v20, v4

    .line 485
    .line 486
    int-to-float v4, v9

    .line 487
    add-int v5, v2, v19

    .line 488
    .line 489
    int-to-float v5, v5

    .line 490
    add-int/lit8 v6, v9, 0x1

    .line 491
    .line 492
    int-to-float v6, v6

    .line 493
    move/from16 v21, v2

    .line 494
    .line 495
    move-object/from16 v2, p6

    .line 496
    .line 497
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 498
    .line 499
    .line 500
    goto :goto_11

    .line 501
    :cond_1e
    move/from16 v21, v2

    .line 502
    .line 503
    move/from16 v20, v4

    .line 504
    .line 505
    :goto_11
    add-int v2, v21, v19

    .line 506
    .line 507
    if-eqz v18, :cond_1f

    .line 508
    .line 509
    invoke-virtual {v8}, LJ5/y;->c()V

    .line 510
    .line 511
    .line 512
    goto :goto_12

    .line 513
    :cond_1f
    move-object/from16 v7, p5

    .line 514
    .line 515
    move/from16 v3, v18

    .line 516
    .line 517
    goto/16 :goto_d

    .line 518
    .line 519
    :cond_20
    add-int/lit8 v9, v9, 0x2

    .line 520
    .line 521
    move/from16 v2, p3

    .line 522
    .line 523
    :goto_12
    move-object/from16 v7, p5

    .line 524
    .line 525
    goto/16 :goto_0

    .line 526
    .line 527
    :cond_21
    return-void

    .line 528
    nop

    .line 529
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    :pswitch_data_1
    .packed-switch 0x20
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static f(LJ5/y;I)Lj6/b;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LJ5/y;->i(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {v0, v1}, LJ5/y;->t(I)V

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    add-int/lit8 v4, p1, -0x2

    .line 14
    .line 15
    const v5, -0x808081

    .line 16
    .line 17
    .line 18
    const/4 v6, -0x1

    .line 19
    const/4 v7, 0x0

    .line 20
    const/high16 v8, -0x1000000

    .line 21
    .line 22
    filled-new-array {v7, v6, v8, v5}, [I

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-static {}, Lj6/g;->b()[I

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-static {}, Lj6/g;->c()[I

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    :goto_0
    if-lez v4, :cond_4

    .line 35
    .line 36
    invoke-virtual {v0, v1}, LJ5/y;->i(I)I

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    invoke-virtual {v0, v1}, LJ5/y;->i(I)I

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    and-int/lit16 v11, v10, 0x80

    .line 45
    .line 46
    if-eqz v11, :cond_0

    .line 47
    .line 48
    move-object v11, v5

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    and-int/lit8 v11, v10, 0x40

    .line 51
    .line 52
    if-eqz v11, :cond_1

    .line 53
    .line 54
    move-object v11, v6

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-object v11, v8

    .line 57
    :goto_1
    and-int/lit8 v10, v10, 0x1

    .line 58
    .line 59
    if-eqz v10, :cond_2

    .line 60
    .line 61
    invoke-virtual {v0, v1}, LJ5/y;->i(I)I

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    invoke-virtual {v0, v1}, LJ5/y;->i(I)I

    .line 66
    .line 67
    .line 68
    move-result v12

    .line 69
    invoke-virtual {v0, v1}, LJ5/y;->i(I)I

    .line 70
    .line 71
    .line 72
    move-result v13

    .line 73
    invoke-virtual {v0, v1}, LJ5/y;->i(I)I

    .line 74
    .line 75
    .line 76
    move-result v14

    .line 77
    add-int/lit8 v4, v4, -0x6

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    const/4 v10, 0x6

    .line 81
    invoke-virtual {v0, v10}, LJ5/y;->i(I)I

    .line 82
    .line 83
    .line 84
    move-result v12

    .line 85
    shl-int/2addr v12, v3

    .line 86
    const/4 v13, 0x4

    .line 87
    invoke-virtual {v0, v13}, LJ5/y;->i(I)I

    .line 88
    .line 89
    .line 90
    move-result v14

    .line 91
    shl-int/2addr v14, v13

    .line 92
    invoke-virtual {v0, v13}, LJ5/y;->i(I)I

    .line 93
    .line 94
    .line 95
    move-result v15

    .line 96
    shl-int/lit8 v13, v15, 0x4

    .line 97
    .line 98
    invoke-virtual {v0, v3}, LJ5/y;->i(I)I

    .line 99
    .line 100
    .line 101
    move-result v15

    .line 102
    shl-int/lit8 v10, v15, 0x6

    .line 103
    .line 104
    add-int/lit8 v4, v4, -0x4

    .line 105
    .line 106
    move/from16 v23, v14

    .line 107
    .line 108
    move v14, v10

    .line 109
    move v10, v12

    .line 110
    move/from16 v12, v23

    .line 111
    .line 112
    :goto_2
    const/16 v15, 0xff

    .line 113
    .line 114
    if-nez v10, :cond_3

    .line 115
    .line 116
    move v12, v7

    .line 117
    move v13, v12

    .line 118
    move v14, v15

    .line 119
    :cond_3
    and-int/2addr v14, v15

    .line 120
    rsub-int v14, v14, 0xff

    .line 121
    .line 122
    int-to-byte v14, v14

    .line 123
    move/from16 p1, v4

    .line 124
    .line 125
    int-to-double v3, v10

    .line 126
    add-int/lit8 v12, v12, -0x80

    .line 127
    .line 128
    move/from16 v16, v2

    .line 129
    .line 130
    int-to-double v1, v12

    .line 131
    const-wide v17, 0x3ff66e978d4fdf3bL    # 1.402

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    mul-double v17, v17, v1

    .line 137
    .line 138
    move-object v12, v11

    .line 139
    add-double v10, v17, v3

    .line 140
    .line 141
    double-to-int v10, v10

    .line 142
    add-int/lit8 v13, v13, -0x80

    .line 143
    .line 144
    move-object/from16 v17, v8

    .line 145
    .line 146
    int-to-double v7, v13

    .line 147
    const-wide v19, 0x3fd60663c74fb54aL    # 0.34414

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    mul-double v19, v19, v7

    .line 153
    .line 154
    sub-double v19, v3, v19

    .line 155
    .line 156
    const-wide v21, 0x3fe6da3c21187e7cL    # 0.71414

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    mul-double v1, v1, v21

    .line 162
    .line 163
    sub-double v1, v19, v1

    .line 164
    .line 165
    double-to-int v1, v1

    .line 166
    const-wide v19, 0x3ffc5a1cac083127L    # 1.772

    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    mul-double v7, v7, v19

    .line 172
    .line 173
    add-double/2addr v7, v3

    .line 174
    double-to-int v2, v7

    .line 175
    const/4 v11, 0x0

    .line 176
    invoke-static {v10, v11, v15}, Lu6/v;->h(III)I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    invoke-static {v1, v11, v15}, Lu6/v;->h(III)I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    invoke-static {v2, v11, v15}, Lu6/v;->h(III)I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    invoke-static {v14, v3, v1, v2}, Lj6/g;->d(IIII)I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    aput v1, v12, v9

    .line 193
    .line 194
    move/from16 v4, p1

    .line 195
    .line 196
    move v7, v11

    .line 197
    move/from16 v2, v16

    .line 198
    .line 199
    move-object/from16 v8, v17

    .line 200
    .line 201
    const/16 v1, 0x8

    .line 202
    .line 203
    const/4 v3, 0x2

    .line 204
    goto/16 :goto_0

    .line 205
    .line 206
    :cond_4
    move/from16 v16, v2

    .line 207
    .line 208
    move-object/from16 v17, v8

    .line 209
    .line 210
    new-instance v0, Lj6/b;

    .line 211
    .line 212
    move/from16 v1, v16

    .line 213
    .line 214
    move-object/from16 v2, v17

    .line 215
    .line 216
    invoke-direct {v0, v1, v5, v6, v2}, Lj6/b;-><init>(I[I[I[I)V

    .line 217
    .line 218
    .line 219
    return-object v0
.end method

.method public static g(LJ5/y;)Lj6/c;
    .locals 6

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LJ5/y;->i(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x4

    .line 8
    invoke-virtual {p0, v2}, LJ5/y;->t(I)V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    invoke-virtual {p0, v2}, LJ5/y;->i(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual {p0}, LJ5/y;->h()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x1

    .line 21
    invoke-virtual {p0, v4}, LJ5/y;->t(I)V

    .line 22
    .line 23
    .line 24
    sget-object v5, Lu6/v;->f:[B

    .line 25
    .line 26
    if-ne v2, v4, :cond_0

    .line 27
    .line 28
    const/16 v2, 0x8

    .line 29
    .line 30
    invoke-virtual {p0, v2}, LJ5/y;->i(I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    mul-int/2addr v2, v0

    .line 35
    invoke-virtual {p0, v2}, LJ5/y;->t(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    if-nez v2, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0, v0}, LJ5/y;->i(I)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-virtual {p0, v0}, LJ5/y;->i(I)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-lez v2, :cond_1

    .line 50
    .line 51
    new-array v5, v2, [B

    .line 52
    .line 53
    invoke-virtual {p0, v2, v5}, LJ5/y;->l(I[B)V

    .line 54
    .line 55
    .line 56
    :cond_1
    if-lez v0, :cond_2

    .line 57
    .line 58
    new-array v2, v0, [B

    .line 59
    .line 60
    invoke-virtual {p0, v0, v2}, LJ5/y;->l(I[B)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    :goto_0
    move-object v2, v5

    .line 65
    :goto_1
    new-instance p0, Lj6/c;

    .line 66
    .line 67
    invoke-direct {p0, v1, v3, v5, v2}, Lj6/c;-><init>(IZ[B[B)V

    .line 68
    .line 69
    .line 70
    return-object p0
.end method
