.class public final LVa/La;
.super LVa/Ba;
.source "SourceFile"


# static fields
.field public static final f:[I

.field public static g:I = 0x0

.field public static h:I = 0x1


# instance fields
.field public final synthetic c:I

.field public final synthetic d:LVa/p;

.field public final synthetic e:LVa/cb;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/La;->f:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        -0x29ce303d
        0x30c23b4
        -0x6e84e8e3
        -0x1b467a83
        -0x154325a5
        -0x35599e2d    # -5452009.5f
        -0x75d468c2
        0x7c0da391
        0x6331b9fa
        -0x38553675
        -0xa3469f3
        -0x75c0d973
        -0x86ce75d
        -0x350d573b    # -7951458.5f
        0xdfc6419
        -0x7238dc8b
        0x712cd6cf
        0x5364767c
    .end array-data
.end method

.method public constructor <init>(LVa/cb;ILVa/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/La;->e:LVa/cb;

    .line 5
    .line 6
    iput p2, p0, LVa/La;->c:I

    .line 7
    .line 8
    iput-object p3, p0, LVa/La;->d:LVa/p;

    .line 9
    .line 10
    return-void
.end method

.method public static d(I[I)Ljava/lang/String;
    .locals 12

    .line 1
    sget-object v0, LVa/a;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x4

    .line 5
    :try_start_0
    new-array v1, v1, [C

    .line 6
    .line 7
    array-length v2, p1

    .line 8
    const/4 v3, 0x1

    .line 9
    shl-int/2addr v2, v3

    .line 10
    new-array v2, v2, [C

    .line 11
    .line 12
    sget-object v4, LVa/La;->f:[I

    .line 13
    .line 14
    invoke-virtual {v4}, [I->clone()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, [I

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    sput v5, LVa/a;->k:I

    .line 22
    .line 23
    :goto_0
    sget v6, LVa/a;->k:I

    .line 24
    .line 25
    array-length v7, p1

    .line 26
    if-ge v6, v7, :cond_1

    .line 27
    .line 28
    aget v7, p1, v6

    .line 29
    .line 30
    shr-int/lit8 v8, v7, 0x10

    .line 31
    .line 32
    int-to-char v8, v8

    .line 33
    aput-char v8, v1, v5

    .line 34
    .line 35
    int-to-char v7, v7

    .line 36
    aput-char v7, v1, v3

    .line 37
    .line 38
    add-int/lit8 v6, v6, 0x1

    .line 39
    .line 40
    aget v6, p1, v6

    .line 41
    .line 42
    shr-int/lit8 v9, v6, 0x10

    .line 43
    .line 44
    int-to-char v9, v9

    .line 45
    const/4 v10, 0x2

    .line 46
    aput-char v9, v1, v10

    .line 47
    .line 48
    int-to-char v6, v6

    .line 49
    const/4 v11, 0x3

    .line 50
    aput-char v6, v1, v11

    .line 51
    .line 52
    shl-int/lit8 v8, v8, 0x10

    .line 53
    .line 54
    add-int/2addr v8, v7

    .line 55
    sput v8, LVa/a;->l:I

    .line 56
    .line 57
    shl-int/lit8 v7, v9, 0x10

    .line 58
    .line 59
    add-int/2addr v7, v6

    .line 60
    sput v7, LVa/a;->m:I

    .line 61
    .line 62
    invoke-static {v4}, LVa/a;->o([I)V

    .line 63
    .line 64
    .line 65
    move v6, v5

    .line 66
    :goto_1
    const/16 v7, 0x10

    .line 67
    .line 68
    if-ge v6, v7, :cond_0

    .line 69
    .line 70
    sget v7, LVa/a;->l:I

    .line 71
    .line 72
    aget v8, v4, v6

    .line 73
    .line 74
    xor-int/2addr v7, v8

    .line 75
    sput v7, LVa/a;->l:I

    .line 76
    .line 77
    invoke-static {v7}, LVa/a;->G(I)I

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    sget v8, LVa/a;->m:I

    .line 82
    .line 83
    xor-int/2addr v7, v8

    .line 84
    sget v8, LVa/a;->l:I

    .line 85
    .line 86
    sput v7, LVa/a;->l:I

    .line 87
    .line 88
    sput v8, LVa/a;->m:I

    .line 89
    .line 90
    add-int/lit8 v6, v6, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception p0

    .line 94
    goto :goto_2

    .line 95
    :cond_0
    sget v6, LVa/a;->l:I

    .line 96
    .line 97
    sget v8, LVa/a;->m:I

    .line 98
    .line 99
    sput v8, LVa/a;->l:I

    .line 100
    .line 101
    sput v6, LVa/a;->m:I

    .line 102
    .line 103
    aget v7, v4, v7

    .line 104
    .line 105
    xor-int/2addr v6, v7

    .line 106
    sput v6, LVa/a;->m:I

    .line 107
    .line 108
    const/16 v7, 0x11

    .line 109
    .line 110
    aget v7, v4, v7

    .line 111
    .line 112
    xor-int/2addr v7, v8

    .line 113
    sput v7, LVa/a;->l:I

    .line 114
    .line 115
    ushr-int/lit8 v8, v7, 0x10

    .line 116
    .line 117
    int-to-char v8, v8

    .line 118
    aput-char v8, v1, v5

    .line 119
    .line 120
    int-to-char v7, v7

    .line 121
    aput-char v7, v1, v3

    .line 122
    .line 123
    ushr-int/lit8 v7, v6, 0x10

    .line 124
    .line 125
    int-to-char v7, v7

    .line 126
    aput-char v7, v1, v10

    .line 127
    .line 128
    int-to-char v6, v6

    .line 129
    aput-char v6, v1, v11

    .line 130
    .line 131
    invoke-static {v4}, LVa/a;->o([I)V

    .line 132
    .line 133
    .line 134
    sget v6, LVa/a;->k:I

    .line 135
    .line 136
    shl-int/lit8 v7, v6, 0x1

    .line 137
    .line 138
    aget-char v8, v1, v5

    .line 139
    .line 140
    aput-char v8, v2, v7

    .line 141
    .line 142
    add-int/lit8 v8, v7, 0x1

    .line 143
    .line 144
    aget-char v9, v1, v3

    .line 145
    .line 146
    aput-char v9, v2, v8

    .line 147
    .line 148
    add-int/lit8 v8, v7, 0x2

    .line 149
    .line 150
    aget-char v9, v1, v10

    .line 151
    .line 152
    aput-char v9, v2, v8

    .line 153
    .line 154
    add-int/lit8 v7, v7, 0x3

    .line 155
    .line 156
    aget-char v8, v1, v11

    .line 157
    .line 158
    aput-char v8, v2, v7

    .line 159
    .line 160
    add-int/lit8 v6, v6, 0x2

    .line 161
    .line 162
    sput v6, LVa/a;->k:I

    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_1
    new-instance p1, Ljava/lang/String;

    .line 167
    .line 168
    invoke-direct {p1, v2, v5, p0}, Ljava/lang/String;-><init>([CII)V

    .line 169
    .line 170
    .line 171
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 172
    return-object p1

    .line 173
    :goto_2
    monitor-exit v0

    .line 174
    throw p0
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, LVa/Ba;->a(Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, LVa/v;

    .line 5
    .line 6
    const/16 v0, 0x11

    .line 7
    .line 8
    invoke-direct {p1, v0}, LVa/v;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object p0, p1, LVa/v;->d:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {p1}, LVa/Cb;->g(LVa/Ba;)V

    .line 14
    .line 15
    .line 16
    sget p1, LVa/La;->h:I

    .line 17
    .line 18
    add-int/lit8 p1, p1, 0x1

    .line 19
    .line 20
    rem-int/lit16 p1, p1, 0x80

    .line 21
    .line 22
    sput p1, LVa/La;->g:I

    .line 23
    .line 24
    return-void
.end method

.method public final c()V
    .locals 13

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LVa/La;->e:LVa/cb;

    .line 7
    .line 8
    invoke-static {v1}, LVa/cb;->o(LVa/cb;)LVa/Ra;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const v3, -0x44e7a8eb

    .line 13
    .line 14
    .line 15
    const v4, 0x7321b401

    .line 16
    .line 17
    .line 18
    filled-new-array {v3, v4}, [I

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    shr-int/lit8 v4, v4, 0x10

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    add-int/2addr v4, v5

    .line 30
    invoke-static {v4, v3}, LVa/La;->d(I[I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v1, v3}, LVa/cb;->u(LVa/cb;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget v4, LVa/Ra;->d:I

    .line 46
    .line 47
    add-int/lit8 v4, v4, 0x49

    .line 48
    .line 49
    rem-int/lit16 v6, v4, 0x80

    .line 50
    .line 51
    sput v6, LVa/Ra;->c:I

    .line 52
    .line 53
    rem-int/lit8 v4, v4, 0x2

    .line 54
    .line 55
    iget v6, p0, LVa/La;->c:I

    .line 56
    .line 57
    iget-object v2, v2, LVa/Ra;->a:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, LVa/ib;

    .line 60
    .line 61
    if-nez v4, :cond_1

    .line 62
    .line 63
    invoke-virtual {v2, v6, v3}, LVa/ib;->b(ILjava/lang/String;)Ljava/util/HashMap;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_0

    .line 80
    .line 81
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Ljava/lang/String;

    .line 86
    .line 87
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    .line 88
    .line 89
    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    new-instance v6, LVa/Sa;

    .line 93
    .line 94
    const v7, 0x66adbcb9

    .line 95
    .line 96
    .line 97
    const v8, -0x50fb5d36

    .line 98
    .line 99
    .line 100
    const v9, -0x15cae32c

    .line 101
    .line 102
    .line 103
    const v10, -0x3e88b0f2

    .line 104
    .line 105
    .line 106
    filled-new-array {v10, v7, v8, v9}, [I

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    const/4 v9, 0x0

    .line 115
    cmpl-float v8, v8, v9

    .line 116
    .line 117
    add-int/lit8 v8, v8, 0x7

    .line 118
    .line 119
    invoke-static {v8, v7}, LVa/La;->d(I[I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    const v8, -0x3c3fbcd2

    .line 132
    .line 133
    .line 134
    const v9, 0x76c2e29c

    .line 135
    .line 136
    .line 137
    filled-new-array {v9, v8}, [I

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 142
    .line 143
    .line 144
    move-result v9

    .line 145
    shr-int/lit8 v9, v9, 0x10

    .line 146
    .line 147
    add-int/lit8 v9, v9, 0x4

    .line 148
    .line 149
    invoke-static {v9, v8}, LVa/La;->d(I[I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-direct {v6, v7, v4}, LVa/Sa;-><init>(Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    .line 166
    .line 167
    sget v3, LVa/La;->h:I

    .line 168
    .line 169
    add-int/lit8 v3, v3, 0x1f

    .line 170
    .line 171
    rem-int/lit16 v3, v3, 0x80

    .line 172
    .line 173
    sput v3, LVa/La;->g:I

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :catch_0
    invoke-static {v1}, LVa/cb;->i(LVa/cb;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    const/4 v6, 0x6

    .line 181
    new-array v6, v6, [I

    .line 182
    .line 183
    fill-array-data v6, :array_0

    .line 184
    .line 185
    .line 186
    const-string v7, ""

    .line 187
    .line 188
    invoke-static {v7}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    add-int/lit8 v7, v7, 0xc

    .line 193
    .line 194
    invoke-static {v7, v6}, LVa/La;->d(I[I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    new-instance v7, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 205
    .line 206
    .line 207
    const/16 v8, 0x16

    .line 208
    .line 209
    new-array v8, v8, [I

    .line 210
    .line 211
    fill-array-data v8, :array_1

    .line 212
    .line 213
    .line 214
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 215
    .line 216
    .line 217
    move-result-wide v9

    .line 218
    const-wide/16 v11, 0x0

    .line 219
    .line 220
    cmp-long v9, v9, v11

    .line 221
    .line 222
    rsub-int/lit8 v9, v9, 0x2d

    .line 223
    .line 224
    invoke-static {v9, v8}, LVa/La;->d(I[I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v8

    .line 232
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-static {v4, v6, v3, v5}, LVa/Ab;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 243
    .line 244
    .line 245
    goto/16 :goto_0

    .line 246
    .line 247
    :cond_0
    new-instance v1, LVa/y;

    .line 248
    .line 249
    const/16 v2, 0x12

    .line 250
    .line 251
    invoke-direct {v1, v2}, LVa/y;-><init>(I)V

    .line 252
    .line 253
    .line 254
    iput-object p0, v1, LVa/y;->e:Ljava/lang/Object;

    .line 255
    .line 256
    iput-object v0, v1, LVa/y;->d:Ljava/lang/Object;

    .line 257
    .line 258
    invoke-static {v1}, LVa/Cb;->g(LVa/Ba;)V

    .line 259
    .line 260
    .line 261
    sget v0, LVa/La;->g:I

    .line 262
    .line 263
    add-int/lit8 v0, v0, 0x3d

    .line 264
    .line 265
    rem-int/lit16 v0, v0, 0x80

    .line 266
    .line 267
    sput v0, LVa/La;->h:I

    .line 268
    .line 269
    return-void

    .line 270
    :cond_1
    invoke-virtual {v2, v6, v3}, LVa/ib;->b(ILjava/lang/String;)Ljava/util/HashMap;

    .line 271
    .line 272
    .line 273
    const/4 v0, 0x0

    .line 274
    throw v0

    .line 275
    :array_0
    .array-data 4
        0x39c680c1
        -0x4775f2bb
        -0x8c24d49
        -0x61eb4a60
        0x77ef7ee2
        0x5e116543
    .end array-data

    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    :array_1
    .array-data 4
        -0x36395dfc    # -1627200.5f
        0x4111a1cf
        0x5bb864a
        -0x4d2b06de
        -0x550f8781
        -0x1f46831b
        -0x4fdca3e2
        -0x10b7b97e
        0x30a7984a
        -0x736c3293
        0x344c3252
        0x5e8e7074
        -0x74f87684
        -0x306c7783
        0x63fc848c
        0x5fa9bca8
        -0x24e97dd0
        -0x3fcc3189
        -0x20720fa5
        -0x159de748
        0x17d55af7
        0x10278e70
    .end array-data
.end method
