.class public final LVa/m;
.super LVa/Ba;
.source "SourceFile"


# static fields
.field public static final i:[C

.field public static j:I = 0x0

.field public static k:I = 0x1


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lorg/json/JSONObject;

.field public final synthetic e:Lorg/json/JSONObject;

.field public final synthetic f:Z

.field public final synthetic g:LVa/ha;

.field public final synthetic h:LVa/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x27

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/m;->i:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x43s
        0x85s
        0x7as
        0x7cs
        0x7fs
        0x7fs
        0x86s
        0x7cs
        0x7cs
        0x86s
        0x7ds
        0x7cs
        0x86s
        0x32s
        0x69s
        0x67s
        0x67s
        0x35s
        0x6fs
        0x3as
        0x73s
        0x69s
        0x62s
        0x64s
        0x63s
        0x61s
        0x62s
        0x67s
        0x5bs
        0xb6s
        0xb6s
        0xb1s
        0x7as
        0xf9s
        0xffs
        0xfds
        0xf2s
        0xefs
        0xf6s
    .end array-data
.end method

.method public constructor <init>(LVa/n;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;ZLVa/ha;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/m;->h:LVa/n;

    .line 5
    .line 6
    iput-object p2, p0, LVa/m;->c:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, LVa/m;->d:Lorg/json/JSONObject;

    .line 9
    .line 10
    iput-object p4, p0, LVa/m;->e:Lorg/json/JSONObject;

    .line 11
    .line 12
    iput-boolean p5, p0, LVa/m;->f:Z

    .line 13
    .line 14
    iput-object p6, p0, LVa/m;->g:LVa/ha;

    .line 15
    .line 16
    return-void
.end method

.method public static d(Ljava/lang/String;[IZ)Ljava/lang/String;
    .locals 12

    .line 1
    const-string v0, "ISO-8859-1"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, [B

    .line 8
    .line 9
    sget-object v0, LVa/Ab;->z:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :try_start_0
    aget v2, p1, v1

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    aget v4, p1, v3

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    aget v6, p1, v5

    .line 20
    .line 21
    const/4 v7, 0x3

    .line 22
    aget v7, p1, v7

    .line 23
    .line 24
    sget-object v8, LVa/m;->i:[C

    .line 25
    .line 26
    new-array v9, v4, [C

    .line 27
    .line 28
    invoke-static {v8, v2, v9, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    new-array v2, v4, [C

    .line 34
    .line 35
    sput v1, LVa/Ab;->y:I

    .line 36
    .line 37
    move v8, v1

    .line 38
    :goto_0
    sget v10, LVa/Ab;->y:I

    .line 39
    .line 40
    if-ge v10, v4, :cond_1

    .line 41
    .line 42
    aget-byte v11, p0, v10

    .line 43
    .line 44
    if-ne v11, v3, :cond_0

    .line 45
    .line 46
    aget-char v11, v9, v10

    .line 47
    .line 48
    shl-int/2addr v11, v3

    .line 49
    add-int/2addr v11, v3

    .line 50
    sub-int/2addr v11, v8

    .line 51
    int-to-char v8, v11

    .line 52
    aput-char v8, v2, v10

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto :goto_4

    .line 57
    :cond_0
    aget-char v11, v9, v10

    .line 58
    .line 59
    shl-int/2addr v11, v3

    .line 60
    sub-int/2addr v11, v8

    .line 61
    int-to-char v8, v11

    .line 62
    aput-char v8, v2, v10

    .line 63
    .line 64
    :goto_1
    aget-char v8, v2, v10

    .line 65
    .line 66
    add-int/lit8 v10, v10, 0x1

    .line 67
    .line 68
    sput v10, LVa/Ab;->y:I

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move-object v9, v2

    .line 72
    :cond_2
    if-lez v7, :cond_3

    .line 73
    .line 74
    new-array p0, v4, [C

    .line 75
    .line 76
    invoke-static {v9, v1, p0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 77
    .line 78
    .line 79
    sub-int v2, v4, v7

    .line 80
    .line 81
    invoke-static {p0, v1, v9, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 82
    .line 83
    .line 84
    invoke-static {p0, v7, v9, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 85
    .line 86
    .line 87
    :cond_3
    if-eqz p2, :cond_5

    .line 88
    .line 89
    new-array p0, v4, [C

    .line 90
    .line 91
    sput v1, LVa/Ab;->y:I

    .line 92
    .line 93
    :goto_2
    sget p2, LVa/Ab;->y:I

    .line 94
    .line 95
    if-ge p2, v4, :cond_4

    .line 96
    .line 97
    sub-int v2, v4, p2

    .line 98
    .line 99
    sub-int/2addr v2, v3

    .line 100
    aget-char v2, v9, v2

    .line 101
    .line 102
    aput-char v2, p0, p2

    .line 103
    .line 104
    add-int/lit8 p2, p2, 0x1

    .line 105
    .line 106
    sput p2, LVa/Ab;->y:I

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    move-object v9, p0

    .line 110
    :cond_5
    if-lez v6, :cond_6

    .line 111
    .line 112
    sput v1, LVa/Ab;->y:I

    .line 113
    .line 114
    :goto_3
    sget p0, LVa/Ab;->y:I

    .line 115
    .line 116
    if-ge p0, v4, :cond_6

    .line 117
    .line 118
    aget-char p2, v9, p0

    .line 119
    .line 120
    aget v1, p1, v5

    .line 121
    .line 122
    sub-int/2addr p2, v1

    .line 123
    int-to-char p2, p2

    .line 124
    aput-char p2, v9, p0

    .line 125
    .line 126
    add-int/lit8 p0, p0, 0x1

    .line 127
    .line 128
    sput p0, LVa/Ab;->y:I

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_6
    new-instance p0, Ljava/lang/String;

    .line 132
    .line 133
    invoke-direct {p0, v9}, Ljava/lang/String;-><init>([C)V

    .line 134
    .line 135
    .line 136
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    return-object p0

    .line 138
    :goto_4
    monitor-exit v0

    .line 139
    throw p0
.end method


# virtual methods
.method public final c()V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0xd

    .line 3
    .line 4
    const/16 v2, 0x13

    .line 5
    .line 6
    filled-new-array {v0, v1, v2, v0}, [I

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const-string v4, "\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000"

    .line 11
    .line 12
    invoke-static {v4, v3, v0}, LVa/m;->d(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v4, p0, LVa/m;->c:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    iget-object v5, p0, LVa/m;->h:LVa/n;

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v7, 0x2

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget v3, LVa/m;->j:I

    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x4d

    .line 36
    .line 37
    rem-int/lit16 v8, v3, 0x80

    .line 38
    .line 39
    sput v8, LVa/m;->k:I

    .line 40
    .line 41
    rem-int/2addr v3, v7

    .line 42
    if-eqz v3, :cond_5

    .line 43
    .line 44
    invoke-static {v5}, LVa/n;->d(LVa/n;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    sget v3, LVa/n;->n:I

    .line 48
    .line 49
    add-int/lit8 v8, v3, 0x1d

    .line 50
    .line 51
    rem-int/lit16 v8, v8, 0x80

    .line 52
    .line 53
    sput v8, LVa/n;->m:I

    .line 54
    .line 55
    iget v8, v5, LVa/n;->j:I

    .line 56
    .line 57
    add-int/lit8 v3, v3, 0x5

    .line 58
    .line 59
    rem-int/lit16 v3, v3, 0x80

    .line 60
    .line 61
    sput v3, LVa/n;->m:I

    .line 62
    .line 63
    add-int/lit8 v3, v3, 0x45

    .line 64
    .line 65
    rem-int/lit16 v9, v3, 0x80

    .line 66
    .line 67
    sput v9, LVa/n;->n:I

    .line 68
    .line 69
    rem-int/2addr v3, v7

    .line 70
    if-nez v3, :cond_1

    .line 71
    .line 72
    rem-int/lit8 v3, v8, 0x1

    .line 73
    .line 74
    :goto_1
    iput v3, v5, LVa/n;->j:I

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_1
    add-int/lit8 v3, v8, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :goto_2
    iget-object v3, p0, LVa/m;->d:Lorg/json/JSONObject;

    .line 81
    .line 82
    invoke-static {v3}, LVa/Ab;->u(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    const/4 v9, 0x4

    .line 87
    const/4 v10, 0x1

    .line 88
    filled-new-array {v1, v9, v0, v10}, [I

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    const-string v11, "\u0001\u0001\u0001\u0000"

    .line 93
    .line 94
    invoke-static {v11, v1, v0}, LVa/m;->d(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v3, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    const/16 v1, 0x11

    .line 106
    .line 107
    const/4 v11, 0x6

    .line 108
    filled-new-array {v1, v7, v11, v10}, [I

    .line 109
    .line 110
    .line 111
    move-result-object v11

    .line 112
    const-string v12, "\u0001\u0001"

    .line 113
    .line 114
    invoke-static {v12, v11, v10}, LVa/m;->d(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    invoke-virtual {v3, v11, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 123
    .line 124
    .line 125
    const/16 v8, 0x9

    .line 126
    .line 127
    filled-new-array {v2, v8, v0, v0}, [I

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    const-string v8, "\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000"

    .line 132
    .line 133
    invoke-static {v8, v2, v0}, LVa/m;->d(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    iget-object v8, p0, LVa/m;->e:Lorg/json/JSONObject;

    .line 142
    .line 143
    if-eqz v8, :cond_2

    .line 144
    .line 145
    sget-object v2, LVa/sa;->a:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v8, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    sget-object v11, LVa/sa;->U:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {v8, v11, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-virtual {v3, v11, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 158
    .line 159
    .line 160
    :cond_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    if-eqz v6, :cond_3

    .line 165
    .line 166
    sget v2, LVa/m;->k:I

    .line 167
    .line 168
    add-int/lit8 v2, v2, 0xb

    .line 169
    .line 170
    rem-int/lit16 v2, v2, 0x80

    .line 171
    .line 172
    sput v2, LVa/m;->j:I

    .line 173
    .line 174
    const/16 v2, 0x1c

    .line 175
    .line 176
    const/16 v6, 0x48

    .line 177
    .line 178
    filled-new-array {v2, v9, v6, v0}, [I

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    const-string v6, "\u0000\u0001\u0001\u0001"

    .line 183
    .line 184
    invoke-static {v6, v2, v0}, LVa/m;->d(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    sget v6, LVa/m;->k:I

    .line 193
    .line 194
    add-int/2addr v6, v1

    .line 195
    rem-int/lit16 v6, v6, 0x80

    .line 196
    .line 197
    sput v6, LVa/m;->j:I

    .line 198
    .line 199
    :cond_3
    sget-object v1, LVa/sa;->b:Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 202
    .line 203
    .line 204
    sget-object v1, LVa/sa;->c:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result v6

    .line 210
    if-nez v6, :cond_4

    .line 211
    .line 212
    invoke-virtual {v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 213
    .line 214
    .line 215
    :cond_4
    const/16 v1, 0x8b

    .line 216
    .line 217
    const/16 v2, 0x20

    .line 218
    .line 219
    const/4 v6, 0x7

    .line 220
    filled-new-array {v2, v6, v1, v7}, [I

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    const-string v2, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001"

    .line 225
    .line 226
    invoke-static {v2, v1, v0}, LVa/m;->d(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    iget-boolean v1, p0, LVa/m;->f:Z

    .line 239
    .line 240
    invoke-virtual {v5, v3, v1, v10, v0}, LVa/n;->c(Lorg/json/JSONObject;ZZZ)Lorg/json/JSONObject;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    new-instance v1, LVa/y;

    .line 245
    .line 246
    const/4 v2, 0x7

    .line 247
    invoke-direct {v1, v2}, LVa/y;-><init>(I)V

    .line 248
    .line 249
    .line 250
    iput-object p0, v1, LVa/y;->e:Ljava/lang/Object;

    .line 251
    .line 252
    iput-object v0, v1, LVa/y;->d:Ljava/lang/Object;

    .line 253
    .line 254
    invoke-static {v1}, LVa/Cb;->j(LVa/Ba;)V

    .line 255
    .line 256
    .line 257
    return-void

    .line 258
    :cond_5
    invoke-static {v5}, LVa/n;->d(LVa/n;)V

    .line 259
    .line 260
    .line 261
    throw v6
.end method
