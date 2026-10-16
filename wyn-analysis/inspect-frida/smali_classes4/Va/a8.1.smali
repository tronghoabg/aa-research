.class public final LVa/a8;
.super LVa/pb;
.source "SourceFile"

# interfaces
.implements LVa/Q6;


# static fields
.field public static final Q:[C

.field public static R:I = 0x0

.field public static S:I = 0x1


# instance fields
.field public K:Ljava/lang/String;

.field public L:LVa/W9;

.field public M:Ljava/lang/String;

.field public N:Ljava/lang/String;

.field public final O:Lorg/json/JSONObject;

.field public final P:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/a8;->Q:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x12ds
        0x12bs
        0x13as
        0x107s
        0x12as
        0x13cs
        0x138s
        0x12fs
        0x139s
        0x10fs
        0x11as
        0x13fs
        0x136s
        0x10as
        0x11bs
        0x132s
        0x10cs
        0x134s
        0x127s
        0x119s
        0x135s
        0x13bs
        0x129s
        0x12es
        0x12cs
        0x110s
        0x10bs
        0xe6s
        0x13es
        0x133s
        0xeds
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/json/JSONObject;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LVa/a8;->O:Lorg/json/JSONObject;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LVa/a8;->P:Ljava/util/ArrayList;

    .line 17
    .line 18
    return-void
.end method

.method public static o(ILjava/lang/String;)Ljava/lang/String;
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
    add-int/lit16 v10, v10, 0x3399

    .line 52
    .line 53
    xor-int/2addr v9, v10

    .line 54
    ushr-int/lit8 v10, v8, 0x5

    .line 55
    .line 56
    add-int/lit16 v10, v10, 0x1856

    .line 57
    .line 58
    xor-int/2addr v9, v10

    .line 59
    sub-int/2addr v7, v9

    .line 60
    int-to-char v7, v7

    .line 61
    aput-char v7, v3, v5

    .line 62
    .line 63
    add-int v9, v7, v4

    .line 64
    .line 65
    shl-int/lit8 v10, v7, 0x4

    .line 66
    .line 67
    const v11, 0xb756

    .line 68
    .line 69
    .line 70
    add-int/2addr v10, v11

    .line 71
    xor-int/2addr v9, v10

    .line 72
    ushr-int/lit8 v7, v7, 0x5

    .line 73
    .line 74
    add-int/lit16 v7, v7, 0x549c

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

.method public static v0(ILjava/lang/String;)Ljava/lang/String;
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
    sget-object v1, LVa/a8;->Q:[C

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
    add-int/lit16 v4, v4, -0xc6

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


# virtual methods
.method public final a(LVa/y7;Ljava/lang/String;Ljava/util/ArrayList;LVa/Ra;LVa/x8;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    const-string v3, ""

    .line 8
    .line 9
    const/16 v4, 0x30

    .line 10
    .line 11
    const/16 v5, 0x10

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v8

    .line 19
    const/16 v9, 0x15

    .line 20
    .line 21
    const/4 v10, 0x1

    .line 22
    const/4 v11, 0x3

    .line 23
    const/16 v12, 0xd

    .line 24
    .line 25
    const/16 v13, 0xf

    .line 26
    .line 27
    const-wide/16 v14, 0x0

    .line 28
    .line 29
    const/16 v16, 0x5

    .line 30
    .line 31
    const/16 v17, 0x57

    .line 32
    .line 33
    const/16 v18, 0x8

    .line 34
    .line 35
    const/16 v19, 0xc

    .line 36
    .line 37
    const/16 v20, 0x2

    .line 38
    .line 39
    sparse-switch v8, :sswitch_data_0

    .line 40
    .line 41
    .line 42
    goto/16 :goto_0

    .line 43
    .line 44
    :sswitch_0
    invoke-static {v3}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    add-int/lit8 v8, v8, 0x7f

    .line 49
    .line 50
    const-string v10, "\u0082\u0097\u0087\u0096\u0095\u0094\u0090\u0087\u008f\u0083\u0089\u0082\u008e\u0083\u0082\u0089"

    .line 51
    .line 52
    invoke-static {v8, v10}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    if-eqz v8, :cond_5

    .line 65
    .line 66
    sget v8, LVa/a8;->S:I

    .line 67
    .line 68
    add-int/lit8 v8, v8, 0x5b

    .line 69
    .line 70
    rem-int/lit16 v8, v8, 0x80

    .line 71
    .line 72
    sput v8, LVa/a8;->R:I

    .line 73
    .line 74
    const/16 v10, 0xe

    .line 75
    .line 76
    goto/16 :goto_1

    .line 77
    .line 78
    :catch_0
    move-exception v0

    .line 79
    move-object/from16 v10, p1

    .line 80
    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :sswitch_1
    :try_start_1
    invoke-static {v3, v4, v6, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    add-int/lit16 v8, v8, 0x80

    .line 88
    .line 89
    const-string v10, "\u0082\u0097\u0087\u0096\u0095\u0094\u0085\u008a\u0087\u0082\u0089\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081"

    .line 90
    .line 91
    invoke-static {v8, v10}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-eqz v8, :cond_5

    .line 104
    .line 105
    const/16 v10, 0xb

    .line 106
    .line 107
    goto/16 :goto_1

    .line 108
    .line 109
    :sswitch_2
    invoke-static {v6}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    rsub-int/lit8 v8, v8, 0x7f

    .line 114
    .line 115
    const-string v10, "\u0095\u0099\u0092\u008a\u0087\u0082\u0089\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0089\u0093\u0098"

    .line 116
    .line 117
    invoke-static {v8, v10}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-eqz v8, :cond_5

    .line 130
    .line 131
    const/16 v10, 0x14

    .line 132
    .line 133
    goto/16 :goto_1

    .line 134
    .line 135
    :sswitch_3
    invoke-static {v6}, Landroid/graphics/Color;->green(I)I

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    add-int/lit8 v8, v8, 0x7f

    .line 140
    .line 141
    const-string v10, "\u0090\u0087\u008f\u0090\u0093\u0092\u0088\u0091\u0083\u0082\u0081"

    .line 142
    .line 143
    invoke-static {v8, v10}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v8
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 155
    if-eqz v8, :cond_5

    .line 156
    .line 157
    sget v8, LVa/a8;->R:I

    .line 158
    .line 159
    add-int/lit8 v8, v8, 0x57

    .line 160
    .line 161
    rem-int/lit16 v8, v8, 0x80

    .line 162
    .line 163
    sput v8, LVa/a8;->S:I

    .line 164
    .line 165
    const/4 v10, 0x6

    .line 166
    goto/16 :goto_1

    .line 167
    .line 168
    :sswitch_4
    :try_start_2
    const-string v8, "\u0ba4\u5449\u8b17\u97e5\u76b5\u0625\u242b\u0612\u3e82\ub6ed\uaaab\udf49"

    .line 169
    .line 170
    invoke-static {v3, v4, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    add-int/lit8 v10, v10, 0xc

    .line 175
    .line 176
    invoke-static {v10, v8}, LVa/a8;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    if-eqz v8, :cond_5

    .line 189
    .line 190
    const/4 v10, 0x7

    .line 191
    goto/16 :goto_1

    .line 192
    .line 193
    :sswitch_5
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    shr-int/lit8 v8, v8, 0x8

    .line 198
    .line 199
    rsub-int/lit8 v8, v8, 0x7f

    .line 200
    .line 201
    const-string v10, "\u0082\u0097\u0087\u0096\u0095\u0094\u0090\u0087\u008f\u0082\u0097\u0087\u0096\u0095\u0094\u0083\u0082\u0089"

    .line 202
    .line 203
    invoke-static {v8, v10}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v8
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 215
    if-eqz v8, :cond_5

    .line 216
    .line 217
    sget v8, LVa/a8;->R:I

    .line 218
    .line 219
    add-int/lit8 v8, v8, 0x3f

    .line 220
    .line 221
    rem-int/lit16 v8, v8, 0x80

    .line 222
    .line 223
    sput v8, LVa/a8;->S:I

    .line 224
    .line 225
    const/16 v10, 0x12

    .line 226
    .line 227
    goto/16 :goto_1

    .line 228
    .line 229
    :sswitch_6
    :try_start_3
    invoke-static {v3}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 230
    .line 231
    .line 232
    move-result v8

    .line 233
    rsub-int/lit8 v8, v8, 0x7f

    .line 234
    .line 235
    const-string v10, "\u0082\u008d\u008c\u008b\u0085\u008a\u0087\u0082\u0089\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081"

    .line 236
    .line 237
    invoke-static {v8, v10}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    if-eqz v8, :cond_5

    .line 250
    .line 251
    move/from16 v10, v20

    .line 252
    .line 253
    goto/16 :goto_1

    .line 254
    .line 255
    :sswitch_7
    invoke-static {v3}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 256
    .line 257
    .line 258
    move-result v8

    .line 259
    rsub-int/lit8 v8, v8, 0x7e

    .line 260
    .line 261
    const-string v10, "\u0090\u0087\u008f\u0083\u0089\u0082\u008e\u0083\u0082\u0089"

    .line 262
    .line 263
    invoke-static {v8, v10}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    if-eqz v8, :cond_5

    .line 276
    .line 277
    move/from16 v10, v16

    .line 278
    .line 279
    goto/16 :goto_1

    .line 280
    .line 281
    :sswitch_8
    invoke-static {v6, v6}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 282
    .line 283
    .line 284
    move-result v8

    .line 285
    add-int/lit8 v8, v8, 0x7f

    .line 286
    .line 287
    const-string v11, "\u0082\u0097\u0087\u0096\u0095\u0094\u0085\u008a\u0087\u0082\u0089\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0089"

    .line 288
    .line 289
    invoke-static {v8, v11}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v8

    .line 301
    if-eq v8, v10, :cond_0

    .line 302
    .line 303
    goto/16 :goto_0

    .line 304
    .line 305
    :cond_0
    move/from16 v10, v19

    .line 306
    .line 307
    goto/16 :goto_1

    .line 308
    .line 309
    :sswitch_9
    invoke-static {v4}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 310
    .line 311
    .line 312
    move-result v8

    .line 313
    add-int/lit8 v8, v8, 0x4f

    .line 314
    .line 315
    const-string v10, "\u0082\u0097\u0087\u0096\u0095\u0094\u0090\u0087\u008f\u0082\u0097\u0087\u0096\u0095\u0094\u0083\u0082\u0081"

    .line 316
    .line 317
    invoke-static {v8, v10}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v8

    .line 321
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v8

    .line 325
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v8
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 329
    if-eqz v8, :cond_5

    .line 330
    .line 331
    sget v8, LVa/a8;->R:I

    .line 332
    .line 333
    add-int/lit8 v8, v8, 0x7d

    .line 334
    .line 335
    rem-int/lit16 v8, v8, 0x80

    .line 336
    .line 337
    sput v8, LVa/a8;->S:I

    .line 338
    .line 339
    const/16 v10, 0x11

    .line 340
    .line 341
    goto/16 :goto_1

    .line 342
    .line 343
    :sswitch_a
    :try_start_4
    const-string v8, "\ubc98\u4dd3\u8b17\u97e5\u76b5\u0625\u242b\u0612\u3e82\ub6ed\u997f\uac59\u7ad4\u0088\u57d8\uf1fb\ue425\ua54b"

    .line 344
    .line 345
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 346
    .line 347
    .line 348
    move-result-wide v17

    .line 349
    cmp-long v11, v17, v14

    .line 350
    .line 351
    add-int/2addr v11, v5

    .line 352
    invoke-static {v11, v8}, LVa/a8;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v8

    .line 356
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v8

    .line 360
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v8
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 364
    xor-int/2addr v8, v10

    .line 365
    if-eq v8, v10, :cond_5

    .line 366
    .line 367
    sget v8, LVa/a8;->S:I

    .line 368
    .line 369
    add-int/lit8 v8, v8, 0x49

    .line 370
    .line 371
    rem-int/lit16 v10, v8, 0x80

    .line 372
    .line 373
    sput v10, LVa/a8;->R:I

    .line 374
    .line 375
    rem-int/lit8 v8, v8, 0x2

    .line 376
    .line 377
    if-eqz v8, :cond_1

    .line 378
    .line 379
    const/16 v10, 0x48

    .line 380
    .line 381
    goto/16 :goto_1

    .line 382
    .line 383
    :cond_1
    move v10, v13

    .line 384
    goto/16 :goto_1

    .line 385
    .line 386
    :sswitch_b
    :try_start_5
    const-string v8, "\ubc98\u4dd3\ue290\u4c36\ubb33\uba08\u26eb\uaead\u77f3\u48a3\udc03\uf1f5\u3678\uad22\u2bbc\u189b"

    .line 387
    .line 388
    invoke-static {v14, v15}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 389
    .line 390
    .line 391
    move-result v10

    .line 392
    add-int/2addr v10, v5

    .line 393
    invoke-static {v10, v8}, LVa/a8;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v8

    .line 397
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v8

    .line 401
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v8

    .line 405
    if-eqz v8, :cond_5

    .line 406
    .line 407
    move v10, v12

    .line 408
    goto/16 :goto_1

    .line 409
    .line 410
    :sswitch_c
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 411
    .line 412
    .line 413
    move-result v8

    .line 414
    shr-int/2addr v8, v5

    .line 415
    rsub-int/lit8 v8, v8, 0x7f

    .line 416
    .line 417
    const-string v10, "\u0082\u008d\u008c\u008b\u0085\u008a\u0087\u0082\u0089\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0089"

    .line 418
    .line 419
    invoke-static {v8, v10}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v8

    .line 423
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v8

    .line 427
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v8

    .line 431
    if-eqz v8, :cond_5

    .line 432
    .line 433
    move v10, v11

    .line 434
    goto/16 :goto_1

    .line 435
    .line 436
    :sswitch_d
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 437
    .line 438
    .line 439
    move-result v8

    .line 440
    shr-int/2addr v8, v5

    .line 441
    add-int/lit8 v8, v8, 0x7f

    .line 442
    .line 443
    const-string v10, "\u0092\u0095\u0089\u009a\u0095\u0083"

    .line 444
    .line 445
    invoke-static {v8, v10}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v8

    .line 449
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v8

    .line 453
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result v8

    .line 457
    if-eqz v8, :cond_5

    .line 458
    .line 459
    move v10, v9

    .line 460
    goto/16 :goto_1

    .line 461
    .line 462
    :sswitch_e
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 463
    .line 464
    .line 465
    move-result v8

    .line 466
    shr-int/2addr v8, v5

    .line 467
    add-int/lit8 v8, v8, 0x7f

    .line 468
    .line 469
    const-string v10, "\u0089\u0090\u0087\u008f\u0082\u0097\u0087\u0096\u0095\u0094\u0085\u0085\u0093"

    .line 470
    .line 471
    invoke-static {v8, v10}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v8

    .line 475
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v8

    .line 479
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v8
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 483
    if-nez v8, :cond_2

    .line 484
    .line 485
    goto/16 :goto_0

    .line 486
    .line 487
    :cond_2
    sget v8, LVa/a8;->S:I

    .line 488
    .line 489
    add-int/lit8 v8, v8, 0x2d

    .line 490
    .line 491
    rem-int/lit16 v8, v8, 0x80

    .line 492
    .line 493
    sput v8, LVa/a8;->R:I

    .line 494
    .line 495
    const/16 v10, 0xa

    .line 496
    .line 497
    goto/16 :goto_1

    .line 498
    .line 499
    :sswitch_f
    :try_start_6
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 500
    .line 501
    .line 502
    move-result v8

    .line 503
    shr-int/2addr v8, v5

    .line 504
    rsub-int/lit8 v8, v8, 0x7f

    .line 505
    .line 506
    const-string v11, "\u0085\u008a\u0087\u0082\u0089\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0089"

    .line 507
    .line 508
    invoke-static {v8, v11}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v8

    .line 512
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v8

    .line 516
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v8
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 520
    if-eqz v8, :cond_5

    .line 521
    .line 522
    sget v8, LVa/a8;->S:I

    .line 523
    .line 524
    add-int/lit8 v8, v8, 0x67

    .line 525
    .line 526
    rem-int/lit16 v8, v8, 0x80

    .line 527
    .line 528
    sput v8, LVa/a8;->R:I

    .line 529
    .line 530
    goto/16 :goto_1

    .line 531
    .line 532
    :sswitch_10
    :try_start_7
    const-string v8, "\ubc98\u4dd3\ub9f9\u9441\u2b2f\ue9fc\u40d5\u0aed\uec3d\u6707\u0ba4\u5449\ua4a4\ue044\u7ad4\u0088\u57d8\uf1fb\ue475\ub9e4\u0679\u8fcd\u6174\u2a26"

    .line 533
    .line 534
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 535
    .line 536
    .line 537
    move-result v10

    .line 538
    shr-int/lit8 v10, v10, 0x8

    .line 539
    .line 540
    rsub-int/lit8 v10, v10, 0x17

    .line 541
    .line 542
    invoke-static {v10, v8}, LVa/a8;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v8

    .line 546
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v8

    .line 550
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    move-result v8

    .line 554
    if-eqz v8, :cond_5

    .line 555
    .line 556
    const/16 v10, 0x13

    .line 557
    .line 558
    goto/16 :goto_1

    .line 559
    .line 560
    :sswitch_11
    invoke-static {v3}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 561
    .line 562
    .line 563
    move-result v8

    .line 564
    rsub-int/lit8 v8, v8, 0x7e

    .line 565
    .line 566
    const-string v10, "\u0082\u0097\u0087\u0096\u0095\u0094\u0090\u0087\u008f\u0090\u0093\u0092\u0088\u0091\u0083\u0082\u0089"

    .line 567
    .line 568
    invoke-static {v8, v10}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v8

    .line 572
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v8

    .line 576
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    move-result v8
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 580
    if-eqz v8, :cond_5

    .line 581
    .line 582
    sget v8, LVa/a8;->S:I

    .line 583
    .line 584
    add-int/2addr v8, v11

    .line 585
    rem-int/lit16 v10, v8, 0x80

    .line 586
    .line 587
    sput v10, LVa/a8;->R:I

    .line 588
    .line 589
    rem-int/lit8 v8, v8, 0x2

    .line 590
    .line 591
    if-eqz v8, :cond_3

    .line 592
    .line 593
    move/from16 v10, v17

    .line 594
    .line 595
    goto/16 :goto_1

    .line 596
    .line 597
    :cond_3
    move v10, v5

    .line 598
    goto/16 :goto_1

    .line 599
    .line 600
    :sswitch_12
    :try_start_8
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 601
    .line 602
    .line 603
    move-result v8

    .line 604
    shr-int/2addr v8, v5

    .line 605
    add-int/lit8 v8, v8, 0x7f

    .line 606
    .line 607
    const-string v11, "\u0089\u0090\u0087\u008f\u0082\u0097\u0087\u0096\u0095\u0094\u0083\u0082\u0081"

    .line 608
    .line 609
    invoke-static {v8, v11}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v8

    .line 613
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v8

    .line 617
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    move-result v8

    .line 621
    if-eq v8, v10, :cond_4

    .line 622
    .line 623
    goto :goto_0

    .line 624
    :cond_4
    move/from16 v10, v18

    .line 625
    .line 626
    goto :goto_1

    .line 627
    :sswitch_13
    invoke-static {v3, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 628
    .line 629
    .line 630
    move-result v8

    .line 631
    rsub-int/lit8 v8, v8, 0x7e

    .line 632
    .line 633
    const-string v10, "\u0090\u0087\u008f\u0083\u0089\u0082\u008e\u0083\u0082\u0081"

    .line 634
    .line 635
    invoke-static {v8, v10}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v8

    .line 639
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v8

    .line 643
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    move-result v8

    .line 647
    if-eqz v8, :cond_5

    .line 648
    .line 649
    const/4 v10, 0x4

    .line 650
    goto :goto_1

    .line 651
    :sswitch_14
    const-string v8, "\u51f3\ub297\u36fd\u84f9\u7ad4\u0088\u57d8\uf1fb\u36e6\u18f5\u77f3\u48a3"

    .line 652
    .line 653
    invoke-static {v6, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 654
    .line 655
    .line 656
    move-result v10

    .line 657
    rsub-int/lit8 v10, v10, 0xc

    .line 658
    .line 659
    invoke-static {v10, v8}, LVa/a8;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v8

    .line 663
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v8

    .line 667
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 668
    .line 669
    .line 670
    move-result v8

    .line 671
    if-eqz v8, :cond_5

    .line 672
    .line 673
    const/16 v10, 0x9

    .line 674
    .line 675
    goto :goto_1

    .line 676
    :sswitch_15
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 677
    .line 678
    .line 679
    move-result v8

    .line 680
    shr-int/lit8 v8, v8, 0x18

    .line 681
    .line 682
    rsub-int/lit8 v8, v8, 0x7f

    .line 683
    .line 684
    const-string v10, "\u0085\u008a\u0087\u0082\u0089\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081"

    .line 685
    .line 686
    invoke-static {v8, v10}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v8

    .line 690
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v8

    .line 694
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 695
    .line 696
    .line 697
    move-result v8
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 698
    if-eqz v8, :cond_5

    .line 699
    .line 700
    sget v8, LVa/a8;->R:I

    .line 701
    .line 702
    add-int/lit8 v8, v8, 0x45

    .line 703
    .line 704
    rem-int/lit16 v8, v8, 0x80

    .line 705
    .line 706
    sput v8, LVa/a8;->S:I

    .line 707
    .line 708
    move v10, v6

    .line 709
    goto :goto_1

    .line 710
    :cond_5
    :goto_0
    const/4 v10, -0x1

    .line 711
    :goto_1
    iget-object v8, v1, LVa/a8;->O:Lorg/json/JSONObject;

    .line 712
    .line 713
    const-class v11, Ljava/lang/String;

    .line 714
    .line 715
    packed-switch v10, :pswitch_data_0

    .line 716
    .line 717
    .line 718
    :try_start_9
    new-instance v0, LVa/k8;

    .line 719
    .line 720
    const-string v8, "\u9a24\u31ce\uf53b\u198a\u3247\u5fcd\u4a15\uacba\u40d5\u0aed\ua691\ue112\u9183\uea32"

    .line 721
    .line 722
    invoke-static {v6, v6, v6}, Landroid/graphics/Color;->rgb(III)I

    .line 723
    .line 724
    .line 725
    move-result v9

    .line 726
    const v10, -0xfffff2

    .line 727
    .line 728
    .line 729
    sub-int/2addr v10, v9

    .line 730
    invoke-static {v10, v8}, LVa/a8;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v8

    .line 734
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v8
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    .line 738
    move-object/from16 v10, p1

    .line 739
    .line 740
    move-object/from16 v9, p5

    .line 741
    .line 742
    :try_start_a
    invoke-direct {v0, v10, v9, v8, v2}, LVa/k8;-><init>(LVa/y7;LVa/x8;Ljava/lang/String;Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    invoke-virtual {v10}, LVa/y7;->f()Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v8

    .line 749
    invoke-virtual {v0, v8}, LVa/j8;->d(Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    return-object v7

    .line 753
    :catch_1
    move-exception v0

    .line 754
    goto/16 :goto_4

    .line 755
    .line 756
    :pswitch_0
    move-object/from16 v10, p1

    .line 757
    .line 758
    invoke-virtual {v1}, LVa/a8;->q0()Lorg/json/JSONObject;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    return-object v0

    .line 763
    :pswitch_1
    move-object/from16 v10, p1

    .line 764
    .line 765
    invoke-virtual {v1}, LVa/a8;->r0()Ljava/lang/Boolean;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    return-object v0

    .line 770
    :pswitch_2
    move-object/from16 v10, p1

    .line 771
    .line 772
    sget v0, LVa/a8;->R:I

    .line 773
    .line 774
    add-int/lit8 v9, v0, 0x1

    .line 775
    .line 776
    rem-int/lit16 v11, v9, 0x80

    .line 777
    .line 778
    sput v11, LVa/a8;->S:I

    .line 779
    .line 780
    rem-int/lit8 v9, v9, 0x2

    .line 781
    .line 782
    if-eqz v9, :cond_6

    .line 783
    .line 784
    add-int/lit8 v0, v0, 0x31

    .line 785
    .line 786
    rem-int/lit16 v0, v0, 0x80

    .line 787
    .line 788
    sput v0, LVa/a8;->S:I

    .line 789
    .line 790
    return-object v8

    .line 791
    :cond_6
    throw v7

    .line 792
    :pswitch_3
    move-object/from16 v10, p1

    .line 793
    .line 794
    invoke-static {v0, v6, v11}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    check-cast v0, Ljava/lang/String;

    .line 799
    .line 800
    sget v9, LVa/a8;->R:I

    .line 801
    .line 802
    add-int/lit8 v9, v9, 0x41

    .line 803
    .line 804
    rem-int/lit16 v11, v9, 0x80

    .line 805
    .line 806
    sput v11, LVa/a8;->S:I

    .line 807
    .line 808
    rem-int/lit8 v9, v9, 0x2
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    .line 809
    .line 810
    if-eqz v9, :cond_7

    .line 811
    .line 812
    :try_start_b
    sget-object v9, LVa/sa;->w:Ljava/lang/String;

    .line 813
    .line 814
    invoke-virtual {v8, v9, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 815
    .line 816
    .line 817
    goto/16 :goto_5

    .line 818
    .line 819
    :cond_7
    sget-object v9, LVa/sa;->w:Ljava/lang/String;

    .line 820
    .line 821
    invoke-virtual {v8, v9, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_2
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1

    .line 822
    .line 823
    .line 824
    :try_start_c
    throw v7

    .line 825
    :pswitch_4
    move-object/from16 v10, p1

    .line 826
    .line 827
    invoke-virtual {v1}, LVa/a8;->s0()Ljava/lang/String;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    return-object v0

    .line 832
    :pswitch_5
    move-object/from16 v10, p1

    .line 833
    .line 834
    invoke-static {v0, v6, v11}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    check-cast v0, Ljava/lang/String;

    .line 839
    .line 840
    sget v9, LVa/a8;->S:I

    .line 841
    .line 842
    add-int/lit8 v9, v9, 0x55

    .line 843
    .line 844
    rem-int/lit16 v11, v9, 0x80

    .line 845
    .line 846
    sput v11, LVa/a8;->R:I

    .line 847
    .line 848
    rem-int/lit8 v9, v9, 0x2
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1

    .line 849
    .line 850
    if-eqz v9, :cond_8

    .line 851
    .line 852
    :try_start_d
    sget-object v9, LVa/sa;->q:Ljava/lang/String;

    .line 853
    .line 854
    invoke-virtual {v8, v9, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_d} :catch_2
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1

    .line 855
    .line 856
    .line 857
    const/16 v0, 0x41

    .line 858
    .line 859
    :try_start_e
    div-int/2addr v0, v6
    :try_end_e
    .catch Lorg/json/JSONException; {:try_start_e .. :try_end_e} :catch_2
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 860
    goto/16 :goto_5

    .line 861
    .line 862
    :catchall_0
    move-exception v0

    .line 863
    :try_start_f
    throw v0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_1

    .line 864
    :cond_8
    :try_start_10
    sget-object v9, LVa/sa;->q:Ljava/lang/String;

    .line 865
    .line 866
    invoke-virtual {v8, v9, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_10
    .catch Lorg/json/JSONException; {:try_start_10 .. :try_end_10} :catch_2
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1

    .line 867
    .line 868
    .line 869
    goto/16 :goto_5

    .line 870
    .line 871
    :pswitch_6
    move-object/from16 v10, p1

    .line 872
    .line 873
    :try_start_11
    invoke-virtual {v1}, LVa/a8;->t0()Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    return-object v0

    .line 878
    :pswitch_7
    move-object/from16 v10, p1

    .line 879
    .line 880
    invoke-static {v0, v6, v11}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 881
    .line 882
    .line 883
    move-result-object v0

    .line 884
    check-cast v0, Ljava/lang/String;

    .line 885
    .line 886
    invoke-virtual {v1, v0}, LVa/a8;->u0(Ljava/lang/String;)V

    .line 887
    .line 888
    .line 889
    return-object v7

    .line 890
    :pswitch_8
    move-object/from16 v10, p1

    .line 891
    .line 892
    sget v0, LVa/a8;->R:I

    .line 893
    .line 894
    add-int/lit8 v0, v0, 0x65

    .line 895
    .line 896
    rem-int/lit16 v9, v0, 0x80

    .line 897
    .line 898
    sput v9, LVa/a8;->S:I

    .line 899
    .line 900
    rem-int/lit8 v0, v0, 0x2

    .line 901
    .line 902
    if-eqz v0, :cond_9

    .line 903
    .line 904
    sget-object v0, LVa/sa;->p:Ljava/lang/String;

    .line 905
    .line 906
    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    return-object v0

    .line 911
    :cond_9
    sget-object v0, LVa/sa;->p:Ljava/lang/String;

    .line 912
    .line 913
    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 914
    .line 915
    .line 916
    throw v7

    .line 917
    :pswitch_9
    move-object/from16 v10, p1

    .line 918
    .line 919
    invoke-static {v0, v6, v11}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    move-result-object v0

    .line 923
    check-cast v0, Ljava/lang/String;

    .line 924
    .line 925
    sget v9, LVa/a8;->R:I

    .line 926
    .line 927
    add-int/lit8 v9, v9, 0x5

    .line 928
    .line 929
    rem-int/lit16 v11, v9, 0x80

    .line 930
    .line 931
    sput v11, LVa/a8;->S:I

    .line 932
    .line 933
    rem-int/lit8 v9, v9, 0x2
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_1

    .line 934
    .line 935
    if-nez v9, :cond_a

    .line 936
    .line 937
    :try_start_12
    sget-object v9, LVa/sa;->m:Ljava/lang/String;

    .line 938
    .line 939
    invoke-virtual {v8, v9, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_12
    .catch Lorg/json/JSONException; {:try_start_12 .. :try_end_12} :catch_2
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_1

    .line 940
    .line 941
    .line 942
    const/16 v0, 0x5c

    .line 943
    .line 944
    :try_start_13
    div-int/2addr v0, v6
    :try_end_13
    .catch Lorg/json/JSONException; {:try_start_13 .. :try_end_13} :catch_2
    .catchall {:try_start_13 .. :try_end_13} :catchall_1

    .line 945
    goto :goto_2

    .line 946
    :catchall_1
    move-exception v0

    .line 947
    :try_start_14
    throw v0
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_1

    .line 948
    :cond_a
    :try_start_15
    sget-object v9, LVa/sa;->m:Ljava/lang/String;

    .line 949
    .line 950
    invoke-virtual {v8, v9, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_15
    .catch Lorg/json/JSONException; {:try_start_15 .. :try_end_15} :catch_2
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_1

    .line 951
    .line 952
    .line 953
    :goto_2
    :try_start_16
    sget v0, LVa/a8;->R:I

    .line 954
    .line 955
    add-int/lit8 v0, v0, 0x61

    .line 956
    .line 957
    rem-int/lit16 v0, v0, 0x80

    .line 958
    .line 959
    sput v0, LVa/a8;->S:I

    .line 960
    .line 961
    goto/16 :goto_5

    .line 962
    .line 963
    :pswitch_a
    move-object/from16 v10, p1

    .line 964
    .line 965
    sget v0, LVa/a8;->R:I

    .line 966
    .line 967
    add-int/2addr v0, v13

    .line 968
    rem-int/lit16 v0, v0, 0x80

    .line 969
    .line 970
    sput v0, LVa/a8;->S:I

    .line 971
    .line 972
    sget-object v0, LVa/sa;->m:Ljava/lang/String;

    .line 973
    .line 974
    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 975
    .line 976
    .line 977
    move-result-object v0

    .line 978
    sget v8, LVa/a8;->S:I

    .line 979
    .line 980
    add-int/lit8 v8, v8, 0x31

    .line 981
    .line 982
    rem-int/lit16 v8, v8, 0x80

    .line 983
    .line 984
    sput v8, LVa/a8;->R:I

    .line 985
    .line 986
    return-object v0

    .line 987
    :pswitch_b
    move-object/from16 v10, p1

    .line 988
    .line 989
    const-class v8, Ljava/util/List;

    .line 990
    .line 991
    invoke-static {v0, v6, v8}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    check-cast v0, Ljava/util/List;

    .line 996
    .line 997
    invoke-virtual {v1, v0}, LVa/a8;->w0(Ljava/util/List;)V

    .line 998
    .line 999
    .line 1000
    return-object v7

    .line 1001
    :pswitch_c
    move-object/from16 v10, p1

    .line 1002
    .line 1003
    invoke-static {v0, v6, v11}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v0

    .line 1007
    check-cast v0, Ljava/lang/String;

    .line 1008
    .line 1009
    invoke-virtual {v1, v0}, LVa/a8;->x0(Ljava/lang/String;)V

    .line 1010
    .line 1011
    .line 1012
    return-object v7

    .line 1013
    :pswitch_d
    move-object/from16 v10, p1

    .line 1014
    .line 1015
    sget v0, LVa/a8;->S:I

    .line 1016
    .line 1017
    add-int/lit8 v0, v0, 0x7b

    .line 1018
    .line 1019
    rem-int/lit16 v8, v0, 0x80

    .line 1020
    .line 1021
    sput v8, LVa/a8;->R:I

    .line 1022
    .line 1023
    rem-int/lit8 v0, v0, 0x2

    .line 1024
    .line 1025
    if-nez v0, :cond_b

    .line 1026
    .line 1027
    iget-object v0, v1, LVa/a8;->P:Ljava/util/ArrayList;

    .line 1028
    .line 1029
    return-object v0

    .line 1030
    :cond_b
    throw v7

    .line 1031
    :pswitch_e
    move-object/from16 v10, p1

    .line 1032
    .line 1033
    invoke-static {v0, v6, v11}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v0

    .line 1037
    check-cast v0, Ljava/lang/String;

    .line 1038
    .line 1039
    sget v8, LVa/a8;->R:I

    .line 1040
    .line 1041
    add-int/lit8 v8, v8, 0x23

    .line 1042
    .line 1043
    rem-int/lit16 v9, v8, 0x80

    .line 1044
    .line 1045
    sput v9, LVa/a8;->S:I

    .line 1046
    .line 1047
    rem-int/lit8 v8, v8, 0x2

    .line 1048
    .line 1049
    if-eqz v8, :cond_d

    .line 1050
    .line 1051
    iput-object v0, v1, LVa/a8;->N:Ljava/lang/String;

    .line 1052
    .line 1053
    add-int/lit8 v9, v9, 0x25

    .line 1054
    .line 1055
    rem-int/lit16 v0, v9, 0x80

    .line 1056
    .line 1057
    sput v0, LVa/a8;->R:I

    .line 1058
    .line 1059
    rem-int/lit8 v9, v9, 0x2

    .line 1060
    .line 1061
    if-nez v9, :cond_c

    .line 1062
    .line 1063
    goto/16 :goto_5

    .line 1064
    .line 1065
    :cond_c
    throw v7

    .line 1066
    :cond_d
    iput-object v0, v1, LVa/a8;->N:Ljava/lang/String;

    .line 1067
    .line 1068
    throw v7

    .line 1069
    :pswitch_f
    move-object/from16 v10, p1

    .line 1070
    .line 1071
    sget v0, LVa/a8;->R:I

    .line 1072
    .line 1073
    add-int/lit8 v0, v0, 0x27

    .line 1074
    .line 1075
    rem-int/lit16 v8, v0, 0x80

    .line 1076
    .line 1077
    sput v8, LVa/a8;->S:I

    .line 1078
    .line 1079
    rem-int/lit8 v0, v0, 0x2

    .line 1080
    .line 1081
    if-nez v0, :cond_e

    .line 1082
    .line 1083
    iget-object v0, v1, LVa/a8;->N:Ljava/lang/String;

    .line 1084
    .line 1085
    const/16 v8, 0x38

    .line 1086
    .line 1087
    div-int/2addr v8, v6

    .line 1088
    return-object v0

    .line 1089
    :cond_e
    iget-object v0, v1, LVa/a8;->N:Ljava/lang/String;

    .line 1090
    .line 1091
    return-object v0

    .line 1092
    :pswitch_10
    move-object/from16 v10, p1

    .line 1093
    .line 1094
    invoke-static {v0, v6, v11}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v0

    .line 1098
    check-cast v0, Ljava/lang/String;

    .line 1099
    .line 1100
    sget v8, LVa/a8;->R:I

    .line 1101
    .line 1102
    add-int/lit8 v8, v8, 0x1b

    .line 1103
    .line 1104
    rem-int/lit16 v9, v8, 0x80

    .line 1105
    .line 1106
    sput v9, LVa/a8;->S:I

    .line 1107
    .line 1108
    rem-int/lit8 v8, v8, 0x2

    .line 1109
    .line 1110
    if-nez v8, :cond_f

    .line 1111
    .line 1112
    iput-object v0, v1, LVa/a8;->M:Ljava/lang/String;

    .line 1113
    .line 1114
    const/16 v0, 0x4f

    .line 1115
    .line 1116
    div-int/2addr v0, v6

    .line 1117
    return-object v7

    .line 1118
    :cond_f
    iput-object v0, v1, LVa/a8;->M:Ljava/lang/String;

    .line 1119
    .line 1120
    return-object v7

    .line 1121
    :pswitch_11
    move-object/from16 v10, p1

    .line 1122
    .line 1123
    sget v0, LVa/a8;->S:I

    .line 1124
    .line 1125
    add-int/lit8 v0, v0, 0x3d

    .line 1126
    .line 1127
    rem-int/lit16 v8, v0, 0x80

    .line 1128
    .line 1129
    sput v8, LVa/a8;->R:I

    .line 1130
    .line 1131
    rem-int/lit8 v0, v0, 0x2

    .line 1132
    .line 1133
    if-nez v0, :cond_10

    .line 1134
    .line 1135
    iget-object v0, v1, LVa/a8;->M:Ljava/lang/String;

    .line 1136
    .line 1137
    return-object v0

    .line 1138
    :cond_10
    throw v7

    .line 1139
    :pswitch_12
    move-object/from16 v10, p1

    .line 1140
    .line 1141
    const-class v8, Ljava/lang/Integer;

    .line 1142
    .line 1143
    invoke-static {v0, v6, v8}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v0

    .line 1147
    check-cast v0, Ljava/lang/Integer;

    .line 1148
    .line 1149
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1150
    .line 1151
    .line 1152
    move-result v0

    .line 1153
    invoke-static {v0}, LVa/W9;->a(I)LVa/W9;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v0

    .line 1157
    sget v8, LVa/a8;->S:I

    .line 1158
    .line 1159
    add-int/lit8 v11, v8, 0x9

    .line 1160
    .line 1161
    rem-int/lit16 v12, v11, 0x80

    .line 1162
    .line 1163
    sput v12, LVa/a8;->R:I

    .line 1164
    .line 1165
    rem-int/lit8 v11, v11, 0x2

    .line 1166
    .line 1167
    if-eqz v11, :cond_11

    .line 1168
    .line 1169
    iput-object v0, v1, LVa/a8;->L:LVa/W9;

    .line 1170
    .line 1171
    const/16 v0, 0x4f

    .line 1172
    .line 1173
    div-int/2addr v0, v6

    .line 1174
    goto :goto_3

    .line 1175
    :cond_11
    iput-object v0, v1, LVa/a8;->L:LVa/W9;

    .line 1176
    .line 1177
    :goto_3
    add-int/2addr v8, v9

    .line 1178
    rem-int/lit16 v8, v8, 0x80

    .line 1179
    .line 1180
    sput v8, LVa/a8;->R:I

    .line 1181
    .line 1182
    return-object v7

    .line 1183
    :pswitch_13
    move-object/from16 v10, p1

    .line 1184
    .line 1185
    sget v0, LVa/a8;->R:I

    .line 1186
    .line 1187
    add-int/lit8 v0, v0, 0x3b

    .line 1188
    .line 1189
    rem-int/lit16 v0, v0, 0x80

    .line 1190
    .line 1191
    sput v0, LVa/a8;->S:I

    .line 1192
    .line 1193
    iget-object v8, v1, LVa/a8;->L:LVa/W9;

    .line 1194
    .line 1195
    add-int/lit8 v0, v0, 0x2d

    .line 1196
    .line 1197
    rem-int/lit16 v0, v0, 0x80

    .line 1198
    .line 1199
    sput v0, LVa/a8;->R:I

    .line 1200
    .line 1201
    if-eqz v8, :cond_14

    .line 1202
    .line 1203
    add-int/lit8 v0, v0, 0x3b

    .line 1204
    .line 1205
    rem-int/lit16 v0, v0, 0x80

    .line 1206
    .line 1207
    sput v0, LVa/a8;->S:I

    .line 1208
    .line 1209
    add-int/lit8 v0, v0, 0x2d

    .line 1210
    .line 1211
    rem-int/lit16 v0, v0, 0x80

    .line 1212
    .line 1213
    sput v0, LVa/a8;->R:I

    .line 1214
    .line 1215
    invoke-virtual {v8}, LVa/W9;->b()I

    .line 1216
    .line 1217
    .line 1218
    move-result v0

    .line 1219
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v0

    .line 1223
    return-object v0

    .line 1224
    :pswitch_14
    move-object/from16 v10, p1

    .line 1225
    .line 1226
    invoke-static {v0, v6, v11}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v0

    .line 1230
    check-cast v0, Ljava/lang/String;

    .line 1231
    .line 1232
    sget v8, LVa/a8;->S:I

    .line 1233
    .line 1234
    add-int/2addr v8, v12

    .line 1235
    rem-int/lit16 v9, v8, 0x80

    .line 1236
    .line 1237
    sput v9, LVa/a8;->R:I

    .line 1238
    .line 1239
    rem-int/lit8 v8, v8, 0x2

    .line 1240
    .line 1241
    if-eqz v8, :cond_12

    .line 1242
    .line 1243
    iput-object v0, v1, LVa/a8;->K:Ljava/lang/String;

    .line 1244
    .line 1245
    const/16 v0, 0x49

    .line 1246
    .line 1247
    div-int/2addr v0, v6

    .line 1248
    return-object v7

    .line 1249
    :cond_12
    iput-object v0, v1, LVa/a8;->K:Ljava/lang/String;

    .line 1250
    .line 1251
    return-object v7

    .line 1252
    :pswitch_15
    move-object/from16 v10, p1

    .line 1253
    .line 1254
    sget v0, LVa/a8;->R:I

    .line 1255
    .line 1256
    add-int/lit8 v0, v0, 0x77

    .line 1257
    .line 1258
    rem-int/lit16 v8, v0, 0x80

    .line 1259
    .line 1260
    sput v8, LVa/a8;->S:I

    .line 1261
    .line 1262
    rem-int/lit8 v0, v0, 0x2

    .line 1263
    .line 1264
    if-eqz v0, :cond_13

    .line 1265
    .line 1266
    iget-object v0, v1, LVa/a8;->K:Ljava/lang/String;

    .line 1267
    .line 1268
    return-object v0

    .line 1269
    :cond_13
    throw v7
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_1

    .line 1270
    :goto_4
    invoke-virtual {v10}, LVa/y7;->f()Ljava/lang/String;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v8

    .line 1274
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1275
    .line 1276
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 1277
    .line 1278
    .line 1279
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 1280
    .line 1281
    .line 1282
    move-result v10

    .line 1283
    shr-int/lit8 v5, v10, 0x10

    .line 1284
    .line 1285
    add-int/lit8 v5, v5, 0x7f

    .line 1286
    .line 1287
    const-string v10, "\u009f\u009c\u0085\u0095\u0098\u0083\u0082\u009e\u009c\u0082\u0086\u0088\u0083\u0093\u0092\u009c\u0095\u0099\u0092\u008a\u0087\u0082\u0089\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u009c\u0081\u0092\u0088\u0083\u0096\u0097\u0082\u009d\u0082\u009c\u0087\u0095\u0087\u0087\u009b"

    .line 1288
    .line 1289
    invoke-static {v5, v10}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v5

    .line 1293
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v5

    .line 1297
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1301
    .line 1302
    .line 1303
    invoke-static {v3, v4, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 1304
    .line 1305
    .line 1306
    move-result v2

    .line 1307
    add-int/lit16 v2, v2, 0x80

    .line 1308
    .line 1309
    const-string v3, "\u009f"

    .line 1310
    .line 1311
    invoke-static {v2, v3}, LVa/a8;->v0(ILjava/lang/String;)Ljava/lang/String;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v2

    .line 1315
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v2

    .line 1319
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1320
    .line 1321
    .line 1322
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v2

    .line 1326
    invoke-static {v8, v2, v0}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1327
    .line 1328
    .line 1329
    :catch_2
    :cond_14
    :goto_5
    return-object v7

    .line 1330
    nop

    .line 1331
    :sswitch_data_0
    .sparse-switch
        -0x7e4425e4 -> :sswitch_15
        -0x6d74084d -> :sswitch_14
        -0x655f90c9 -> :sswitch_13
        -0x53fe086b -> :sswitch_12
        -0x4d481d6a -> :sswitch_11
        -0x4a60805c -> :sswitch_10
        -0x47fb2ad8 -> :sswitch_f
        -0x410d00e0 -> :sswitch_e
        -0x33ce45fd -> :sswitch_d
        -0x2e11fb7e -> :sswitch_c
        -0x1842c1ce -> :sswitch_b
        -0x153e8576 -> :sswitch_a
        -0x8657da7 -> :sswitch_9
        0xc3fab63 -> :sswitch_8
        0xe11bcab -> :sswitch_7
        0x2df16f76 -> :sswitch_6
        0x2e711bcd -> :sswitch_5
        0x4df72e9b -> :sswitch_4
        0x533ecd8f -> :sswitch_3
        0x72b4f1b3 -> :sswitch_2
        0x75142957 -> :sswitch_1
        0x7a93a4a6 -> :sswitch_0
    .end sparse-switch

    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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

.method public final q0()Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, LVa/a8;->K:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    sget v2, LVa/a8;->R:I

    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x5f

    .line 13
    .line 14
    rem-int/lit16 v2, v2, 0x80

    .line 15
    .line 16
    sput v2, LVa/a8;->S:I

    .line 17
    .line 18
    :try_start_1
    iget-object v3, p0, LVa/a8;->L:LVa/W9;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 19
    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x3f

    .line 23
    .line 24
    rem-int/lit16 v3, v2, 0x80

    .line 25
    .line 26
    sput v3, LVa/a8;->R:I

    .line 27
    .line 28
    rem-int/lit8 v2, v2, 0x2

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    :try_start_2
    sget-object v2, LVa/sa;->m:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    sget-object v1, LVa/sa;->n:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v2, p0, LVa/a8;->L:LVa/W9;

    .line 40
    .line 41
    invoke-virtual {v2}, LVa/W9;->b()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 50
    .line 51
    .line 52
    const/16 v1, 0x49

    .line 53
    .line 54
    :try_start_3
    div-int/lit8 v1, v1, 0x0
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    throw v0

    .line 59
    :cond_0
    :try_start_4
    sget-object v2, LVa/sa;->m:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    sget-object v1, LVa/sa;->n:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v2, p0, LVa/a8;->L:LVa/W9;

    .line 67
    .line 68
    invoke-virtual {v2}, LVa/W9;->b()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 77
    .line 78
    .line 79
    :cond_1
    :goto_0
    sget-object v1, LVa/sa;->p:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v2, p0, LVa/a8;->M:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 84
    .line 85
    .line 86
    sget-object v1, LVa/sa;->q:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v2, p0, LVa/a8;->N:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, LVa/a8;->P:Ljava/util/ArrayList;

    .line 94
    .line 95
    :try_start_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-lez v2, :cond_2

    .line 100
    .line 101
    sget-object v2, LVa/sa;->w:Ljava/lang/String;

    .line 102
    .line 103
    new-instance v3, Lorg/json/JSONArray;

    .line 104
    .line 105
    invoke-direct {v3, v1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0

    .line 109
    .line 110
    .line 111
    :cond_2
    iget-object v1, p0, LVa/a8;->O:Lorg/json/JSONObject;

    .line 112
    .line 113
    :try_start_6
    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    .line 114
    .line 115
    .line 116
    move-result v2
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_0

    .line 117
    if-lez v2, :cond_3

    .line 118
    .line 119
    sget v2, LVa/a8;->S:I

    .line 120
    .line 121
    add-int/lit8 v2, v2, 0x4d

    .line 122
    .line 123
    rem-int/lit16 v2, v2, 0x80

    .line 124
    .line 125
    sput v2, LVa/a8;->R:I

    .line 126
    .line 127
    :try_start_7
    sget-object v2, LVa/sa;->o:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_0

    .line 134
    .line 135
    .line 136
    :cond_3
    sget v1, LVa/a8;->R:I

    .line 137
    .line 138
    add-int/lit8 v1, v1, 0x67

    .line 139
    .line 140
    rem-int/lit16 v1, v1, 0x80

    .line 141
    .line 142
    sput v1, LVa/a8;->S:I

    .line 143
    .line 144
    :catch_0
    return-object v0
.end method

.method public final r0()Ljava/lang/Boolean;
    .locals 2

    .line 1
    iget-object v0, p0, LVa/a8;->K:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    xor-int/2addr v0, v1

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, LVa/a8;->M:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    sget v0, LVa/a8;->S:I

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x6b

    .line 22
    .line 23
    rem-int/lit16 v0, v0, 0x80

    .line 24
    .line 25
    sput v0, LVa/a8;->R:I

    .line 26
    .line 27
    iget-object v0, p0, LVa/a8;->N:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, LVa/a8;->P:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-lez v0, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v1, 0x0

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    sget v0, LVa/a8;->S:I

    .line 47
    .line 48
    add-int/lit8 v0, v0, 0x2d

    .line 49
    .line 50
    rem-int/lit16 v0, v0, 0x80

    .line 51
    .line 52
    sput v0, LVa/a8;->R:I

    .line 53
    .line 54
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0
.end method

.method public final s0()Ljava/lang/String;
    .locals 4

    .line 1
    sget v0, LVa/a8;->S:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x79

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/a8;->R:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iget-object v2, p0, LVa/a8;->O:Lorg/json/JSONObject;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    sget-object v0, LVa/sa;->w:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget v2, LVa/a8;->R:I

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0xb

    .line 25
    .line 26
    rem-int/lit16 v3, v2, 0x80

    .line 27
    .line 28
    sput v3, LVa/a8;->S:I

    .line 29
    .line 30
    rem-int/lit8 v2, v2, 0x2

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_0
    throw v1

    .line 36
    :cond_1
    sget-object v0, LVa/sa;->w:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    throw v1
.end method

.method public final t0()Ljava/lang/String;
    .locals 4

    .line 1
    sget v0, LVa/a8;->S:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x35

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/a8;->R:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/a8;->O:Lorg/json/JSONObject;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    sget-object v0, LVa/sa;->q:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget v1, LVa/a8;->S:I

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x9

    .line 25
    .line 26
    rem-int/lit16 v3, v1, 0x80

    .line 27
    .line 28
    sput v3, LVa/a8;->R:I

    .line 29
    .line 30
    rem-int/lit8 v1, v1, 0x2

    .line 31
    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_0
    throw v2

    .line 36
    :cond_1
    sget-object v0, LVa/sa;->q:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    throw v2
.end method

.method public final u0(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget v0, LVa/a8;->S:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/a8;->R:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iget-object v2, p0, LVa/a8;->O:Lorg/json/JSONObject;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    :try_start_0
    sget-object v0, LVa/sa;->p:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    sget p1, LVa/a8;->R:I

    .line 22
    .line 23
    add-int/lit8 p1, p1, 0x1d

    .line 24
    .line 25
    rem-int/lit16 v0, p1, 0x80

    .line 26
    .line 27
    sput v0, LVa/a8;->S:I

    .line 28
    .line 29
    rem-int/lit8 p1, p1, 0x2

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    throw v1

    .line 35
    :cond_1
    :try_start_1
    sget-object v0, LVa/sa;->p:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 38
    .line 39
    .line 40
    throw v1

    .line 41
    :catch_0
    return-void
.end method

.method public final w0(Ljava/util/List;)V
    .locals 2

    .line 1
    sget v0, LVa/a8;->S:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x43

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/a8;->R:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    sget v0, LVa/a8;->S:I

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x41

    .line 26
    .line 27
    rem-int/lit16 v1, v0, 0x80

    .line 28
    .line 29
    sput v1, LVa/a8;->R:I

    .line 30
    .line 31
    rem-int/lit8 v0, v0, 0x2

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, LVa/a8;->x0(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/16 v0, 0x12

    .line 45
    .line 46
    div-int/lit8 v0, v0, 0x0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, LVa/a8;->x0(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :goto_1
    sget v0, LVa/a8;->R:I

    .line 59
    .line 60
    add-int/lit8 v0, v0, 0x51

    .line 61
    .line 62
    rem-int/lit16 v0, v0, 0x80

    .line 63
    .line 64
    sput v0, LVa/a8;->S:I

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    return-void

    .line 68
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    throw p1
.end method

.method public final x0(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    xor-int/2addr v0, v1

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget v0, LVa/a8;->R:I

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x79

    .line 13
    .line 14
    rem-int/lit16 v0, v0, 0x80

    .line 15
    .line 16
    sput v0, LVa/a8;->S:I

    .line 17
    .line 18
    iget-object v0, p0, LVa/a8;->P:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    sget v1, LVa/a8;->S:I

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x2b

    .line 29
    .line 30
    rem-int/lit16 v1, v1, 0x80

    .line 31
    .line 32
    sput v1, LVa/a8;->R:I

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    sget p1, LVa/a8;->R:I

    .line 38
    .line 39
    add-int/lit8 p1, p1, 0x61

    .line 40
    .line 41
    rem-int/lit16 p1, p1, 0x80

    .line 42
    .line 43
    sput p1, LVa/a8;->S:I

    .line 44
    .line 45
    :cond_1
    :goto_0
    return-void
.end method
