.class public final LVa/o8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/p8;


# static fields
.field public static final c:[C

.field public static d:I = 0x0

.field public static e:I = 0x1


# instance fields
.field public final synthetic a:I

.field public synthetic b:LVa/q8;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/o8;->c:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x36s
        0x8fs
        0xb1s
        0xbas
        0xbcs
        0xb4s
        0xb1s
        0xb1s
        0xb8s
        0x96s
        0x97s
        0xc1s
        0xb8s
        0x8es
        0x96s
        0xb6s
        0xb8s
        0x9fs
        0x9es
        0xc0s
        0xb7s
        0xb3s
        0xb4s
        0x8es
        0x8fs
        0xb1s
        0xb9s
        0xb8s
        0xb1s
        0xb7s
        0xc1s
        0xabs
    .end array-data
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/o8;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, LVa/o8;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v2, v1, LVa/o8;->b:LVa/q8;

    .line 11
    .line 12
    invoke-virtual {v2, v0}, LVa/q8;->s(Ljava/util/List;)LVa/y8;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :pswitch_0
    sget v2, LVa/o8;->d:I

    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x51

    .line 20
    .line 21
    rem-int/lit16 v2, v2, 0x80

    .line 22
    .line 23
    sput v2, LVa/o8;->e:I

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x43

    .line 26
    .line 27
    rem-int/lit16 v2, v2, 0x80

    .line 28
    .line 29
    sput v2, LVa/o8;->d:I

    .line 30
    .line 31
    iget-object v2, v1, LVa/o8;->b:LVa/q8;

    .line 32
    .line 33
    sget v3, LVa/q8;->h:I

    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x69

    .line 36
    .line 37
    rem-int/lit16 v3, v3, 0x80

    .line 38
    .line 39
    sput v3, LVa/q8;->i:I

    .line 40
    .line 41
    invoke-virtual {v2, v0}, LVa/q8;->d(Ljava/util/List;)LVa/y8;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget v2, LVa/q8;->i:I

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x4f

    .line 48
    .line 49
    rem-int/lit16 v2, v2, 0x80

    .line 50
    .line 51
    sput v2, LVa/q8;->h:I

    .line 52
    .line 53
    instance-of v2, v0, LVa/B8;

    .line 54
    .line 55
    const/4 v3, 0x1

    .line 56
    if-eq v2, v3, :cond_8

    .line 57
    .line 58
    sget v2, LVa/o8;->e:I

    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x6f

    .line 61
    .line 62
    rem-int/lit16 v4, v2, 0x80

    .line 63
    .line 64
    sput v4, LVa/o8;->d:I

    .line 65
    .line 66
    const/4 v4, 0x2

    .line 67
    rem-int/2addr v2, v4

    .line 68
    const/4 v5, 0x0

    .line 69
    if-eqz v2, :cond_0

    .line 70
    .line 71
    instance-of v2, v0, LVa/J8;

    .line 72
    .line 73
    const/16 v6, 0x1a

    .line 74
    .line 75
    div-int/2addr v6, v5

    .line 76
    if-eqz v2, :cond_1

    .line 77
    .line 78
    goto/16 :goto_6

    .line 79
    .line 80
    :cond_0
    instance-of v2, v0, LVa/J8;

    .line 81
    .line 82
    if-eqz v2, :cond_1

    .line 83
    .line 84
    goto/16 :goto_6

    .line 85
    .line 86
    :cond_1
    iget-object v2, v1, LVa/o8;->b:LVa/q8;

    .line 87
    .line 88
    new-instance v6, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v7, "\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001"

    .line 94
    .line 95
    const/16 v8, 0x20

    .line 96
    .line 97
    const/16 v9, 0x4d

    .line 98
    .line 99
    filled-new-array {v5, v8, v9, v5}, [I

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    const-string v9, "ISO-8859-1"

    .line 104
    .line 105
    invoke-virtual {v7, v9}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    sget-object v9, LVa/Ab;->z:Ljava/lang/Object;

    .line 110
    .line 111
    monitor-enter v9

    .line 112
    :try_start_0
    aget v10, v8, v5

    .line 113
    .line 114
    aget v11, v8, v3

    .line 115
    .line 116
    aget v12, v8, v4

    .line 117
    .line 118
    const/4 v13, 0x3

    .line 119
    aget v13, v8, v13

    .line 120
    .line 121
    sget-object v14, LVa/o8;->c:[C

    .line 122
    .line 123
    new-array v15, v11, [C

    .line 124
    .line 125
    invoke-static {v14, v10, v15, v5, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 126
    .line 127
    .line 128
    if-eqz v7, :cond_4

    .line 129
    .line 130
    new-array v10, v11, [C

    .line 131
    .line 132
    sput v5, LVa/Ab;->y:I

    .line 133
    .line 134
    move/from16 p1, v4

    .line 135
    .line 136
    move v14, v5

    .line 137
    :goto_0
    sget v4, LVa/Ab;->y:I

    .line 138
    .line 139
    if-ge v4, v11, :cond_3

    .line 140
    .line 141
    aget-byte v5, v7, v4

    .line 142
    .line 143
    if-ne v5, v3, :cond_2

    .line 144
    .line 145
    aget-char v5, v15, v4

    .line 146
    .line 147
    shl-int/2addr v5, v3

    .line 148
    add-int/2addr v5, v3

    .line 149
    sub-int/2addr v5, v14

    .line 150
    int-to-char v5, v5

    .line 151
    aput-char v5, v10, v4

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :catchall_0
    move-exception v0

    .line 155
    goto/16 :goto_5

    .line 156
    .line 157
    :cond_2
    aget-char v5, v15, v4

    .line 158
    .line 159
    shl-int/2addr v5, v3

    .line 160
    sub-int/2addr v5, v14

    .line 161
    int-to-char v5, v5

    .line 162
    aput-char v5, v10, v4

    .line 163
    .line 164
    :goto_1
    aget-char v14, v10, v4

    .line 165
    .line 166
    add-int/lit8 v4, v4, 0x1

    .line 167
    .line 168
    sput v4, LVa/Ab;->y:I

    .line 169
    .line 170
    const/4 v5, 0x0

    .line 171
    goto :goto_0

    .line 172
    :cond_3
    move-object v15, v10

    .line 173
    goto :goto_2

    .line 174
    :cond_4
    move/from16 p1, v4

    .line 175
    .line 176
    :goto_2
    if-lez v13, :cond_5

    .line 177
    .line 178
    new-array v4, v11, [C

    .line 179
    .line 180
    const/4 v5, 0x0

    .line 181
    invoke-static {v15, v5, v4, v5, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 182
    .line 183
    .line 184
    sub-int v7, v11, v13

    .line 185
    .line 186
    invoke-static {v4, v5, v15, v7, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 187
    .line 188
    .line 189
    invoke-static {v4, v13, v15, v5, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 190
    .line 191
    .line 192
    :cond_5
    new-array v4, v11, [C

    .line 193
    .line 194
    const/16 v16, 0x0

    .line 195
    .line 196
    sput v16, LVa/Ab;->y:I

    .line 197
    .line 198
    :goto_3
    sget v5, LVa/Ab;->y:I

    .line 199
    .line 200
    if-ge v5, v11, :cond_6

    .line 201
    .line 202
    sub-int v7, v11, v5

    .line 203
    .line 204
    sub-int/2addr v7, v3

    .line 205
    aget-char v7, v15, v7

    .line 206
    .line 207
    aput-char v7, v4, v5

    .line 208
    .line 209
    add-int/lit8 v5, v5, 0x1

    .line 210
    .line 211
    sput v5, LVa/Ab;->y:I

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_6
    if-lez v12, :cond_7

    .line 215
    .line 216
    const/16 v16, 0x0

    .line 217
    .line 218
    sput v16, LVa/Ab;->y:I

    .line 219
    .line 220
    :goto_4
    sget v3, LVa/Ab;->y:I

    .line 221
    .line 222
    if-ge v3, v11, :cond_7

    .line 223
    .line 224
    aget-char v5, v4, v3

    .line 225
    .line 226
    aget v7, v8, p1

    .line 227
    .line 228
    sub-int/2addr v5, v7

    .line 229
    int-to-char v5, v5

    .line 230
    aput-char v5, v4, v3

    .line 231
    .line 232
    add-int/lit8 v3, v3, 0x1

    .line 233
    .line 234
    sput v3, LVa/Ab;->y:I

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_7
    new-instance v3, Ljava/lang/String;

    .line 238
    .line 239
    invoke-direct {v3, v4}, Ljava/lang/String;-><init>([C)V

    .line 240
    .line 241
    .line 242
    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 243
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    sget v3, LVa/q8;->h:I

    .line 258
    .line 259
    add-int/lit8 v3, v3, 0x19

    .line 260
    .line 261
    rem-int/lit16 v3, v3, 0x80

    .line 262
    .line 263
    sput v3, LVa/q8;->i:I

    .line 264
    .line 265
    invoke-virtual {v2, v0}, LVa/q8;->q(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    const/4 v0, 0x0

    .line 269
    throw v0

    .line 270
    :goto_5
    monitor-exit v9

    .line 271
    throw v0

    .line 272
    :cond_8
    :goto_6
    sget v2, LVa/o8;->e:I

    .line 273
    .line 274
    add-int/lit8 v2, v2, 0x2f

    .line 275
    .line 276
    rem-int/lit16 v2, v2, 0x80

    .line 277
    .line 278
    sput v2, LVa/o8;->d:I

    .line 279
    .line 280
    return-object v0

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
