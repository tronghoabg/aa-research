.class public final LVa/S8;
.super LVa/F8;
.source "SourceFile"


# static fields
.field public static final j:[C

.field public static k:I = 0x0

.field public static l:I = 0x1


# instance fields
.field public final synthetic i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, LVa/S8;->j:[C

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 2
        0x4es
        0x9cs
    .end array-data
.end method

.method public synthetic constructor <init>(LVa/y8;LVa/y8;I)V
    .locals 0

    .line 1
    iput p3, p0, LVa/S8;->i:I

    invoke-direct {p0, p1, p2}, LVa/F8;-><init>(LVa/y8;LVa/y8;)V

    return-void
.end method

.method private final i()Ljava/lang/String;
    .locals 15

    .line 1
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    shr-int/2addr v0, v1

    .line 8
    const/4 v2, 0x2

    .line 9
    add-int/2addr v0, v2

    .line 10
    const-string v3, "\u03f3\ua437"

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    sget-object v4, LVa/Ab;->F:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v4

    .line 19
    :try_start_0
    array-length v5, v3

    .line 20
    new-array v5, v5, [C

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    sput v6, LVa/Ab;->E:I

    .line 24
    .line 25
    new-array v2, v2, [C

    .line 26
    .line 27
    :goto_0
    sget v7, LVa/Ab;->E:I

    .line 28
    .line 29
    array-length v8, v3

    .line 30
    if-ge v7, v8, :cond_1

    .line 31
    .line 32
    aget-char v8, v3, v7

    .line 33
    .line 34
    aput-char v8, v2, v6

    .line 35
    .line 36
    add-int/lit8 v7, v7, 0x1

    .line 37
    .line 38
    aget-char v7, v3, v7

    .line 39
    .line 40
    const/4 v8, 0x1

    .line 41
    aput-char v7, v2, v8

    .line 42
    .line 43
    const v7, 0xe370

    .line 44
    .line 45
    .line 46
    move v9, v6

    .line 47
    :goto_1
    if-ge v9, v1, :cond_0

    .line 48
    .line 49
    aget-char v10, v2, v8

    .line 50
    .line 51
    aget-char v11, v2, v6

    .line 52
    .line 53
    add-int v12, v11, v7

    .line 54
    .line 55
    shl-int/lit8 v13, v11, 0x4

    .line 56
    .line 57
    add-int/lit16 v13, v13, 0x505a

    .line 58
    .line 59
    xor-int/2addr v12, v13

    .line 60
    ushr-int/lit8 v13, v11, 0x5

    .line 61
    .line 62
    const v14, 0xa6df

    .line 63
    .line 64
    .line 65
    add-int/2addr v13, v14

    .line 66
    xor-int/2addr v12, v13

    .line 67
    sub-int/2addr v10, v12

    .line 68
    int-to-char v10, v10

    .line 69
    aput-char v10, v2, v8

    .line 70
    .line 71
    add-int v12, v10, v7

    .line 72
    .line 73
    shl-int/lit8 v13, v10, 0x4

    .line 74
    .line 75
    const v14, 0xfe95

    .line 76
    .line 77
    .line 78
    add-int/2addr v13, v14

    .line 79
    xor-int/2addr v12, v13

    .line 80
    ushr-int/lit8 v10, v10, 0x5

    .line 81
    .line 82
    add-int/lit16 v10, v10, 0x3655

    .line 83
    .line 84
    xor-int/2addr v10, v12

    .line 85
    sub-int/2addr v11, v10

    .line 86
    int-to-char v10, v11

    .line 87
    aput-char v10, v2, v6

    .line 88
    .line 89
    const v10, 0x9e37

    .line 90
    .line 91
    .line 92
    sub-int/2addr v7, v10

    .line 93
    add-int/lit8 v9, v9, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    goto :goto_2

    .line 98
    :cond_0
    sget v7, LVa/Ab;->E:I

    .line 99
    .line 100
    aget-char v9, v2, v6

    .line 101
    .line 102
    aput-char v9, v5, v7

    .line 103
    .line 104
    add-int/lit8 v9, v7, 0x1

    .line 105
    .line 106
    aget-char v8, v2, v8

    .line 107
    .line 108
    aput-char v8, v5, v9

    .line 109
    .line 110
    add-int/lit8 v7, v7, 0x2

    .line 111
    .line 112
    sput v7, LVa/Ab;->E:I

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_1
    new-instance v1, Ljava/lang/String;

    .line 116
    .line 117
    invoke-direct {v1, v5, v6, v0}, Ljava/lang/String;-><init>([CII)V

    .line 118
    .line 119
    .line 120
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0

    .line 126
    :goto_2
    monitor-exit v4

    .line 127
    throw v0
.end method

.method private final j()Ljava/lang/String;
    .locals 14

    .line 1
    sget v0, LVa/S8;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/S8;->k:I

    .line 8
    .line 9
    const-string v0, "\u0000\u0000"

    .line 10
    .line 11
    const/16 v1, 0x20

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x2

    .line 15
    filled-new-array {v2, v3, v1, v3}, [I

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v4, "ISO-8859-1"

    .line 20
    .line 21
    invoke-virtual {v0, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, [B

    .line 26
    .line 27
    sget-object v4, LVa/Ab;->z:Ljava/lang/Object;

    .line 28
    .line 29
    monitor-enter v4

    .line 30
    :try_start_0
    aget v5, v1, v2

    .line 31
    .line 32
    const/4 v6, 0x1

    .line 33
    aget v7, v1, v6

    .line 34
    .line 35
    aget v8, v1, v3

    .line 36
    .line 37
    const/4 v9, 0x3

    .line 38
    aget v9, v1, v9

    .line 39
    .line 40
    sget-object v10, LVa/S8;->j:[C

    .line 41
    .line 42
    new-array v11, v7, [C

    .line 43
    .line 44
    invoke-static {v10, v5, v11, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 45
    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    new-array v5, v7, [C

    .line 50
    .line 51
    sput v2, LVa/Ab;->y:I

    .line 52
    .line 53
    move v10, v2

    .line 54
    :goto_0
    sget v12, LVa/Ab;->y:I

    .line 55
    .line 56
    if-ge v12, v7, :cond_1

    .line 57
    .line 58
    aget-byte v13, v0, v12

    .line 59
    .line 60
    if-ne v13, v6, :cond_0

    .line 61
    .line 62
    aget-char v13, v11, v12

    .line 63
    .line 64
    shl-int/2addr v13, v6

    .line 65
    add-int/2addr v13, v6

    .line 66
    sub-int/2addr v13, v10

    .line 67
    int-to-char v10, v13

    .line 68
    aput-char v10, v5, v12

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    goto :goto_3

    .line 73
    :cond_0
    aget-char v13, v11, v12

    .line 74
    .line 75
    shl-int/2addr v13, v6

    .line 76
    sub-int/2addr v13, v10

    .line 77
    int-to-char v10, v13

    .line 78
    aput-char v10, v5, v12

    .line 79
    .line 80
    :goto_1
    aget-char v10, v5, v12

    .line 81
    .line 82
    add-int/lit8 v12, v12, 0x1

    .line 83
    .line 84
    sput v12, LVa/Ab;->y:I

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    move-object v11, v5

    .line 88
    :cond_2
    if-lez v9, :cond_3

    .line 89
    .line 90
    new-array v0, v7, [C

    .line 91
    .line 92
    invoke-static {v11, v2, v0, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 93
    .line 94
    .line 95
    sub-int v5, v7, v9

    .line 96
    .line 97
    invoke-static {v0, v2, v11, v5, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v9, v11, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 101
    .line 102
    .line 103
    :cond_3
    if-lez v8, :cond_4

    .line 104
    .line 105
    sput v2, LVa/Ab;->y:I

    .line 106
    .line 107
    :goto_2
    sget v0, LVa/Ab;->y:I

    .line 108
    .line 109
    if-ge v0, v7, :cond_4

    .line 110
    .line 111
    aget-char v2, v11, v0

    .line 112
    .line 113
    aget v5, v1, v3

    .line 114
    .line 115
    sub-int/2addr v2, v5

    .line 116
    int-to-char v2, v2

    .line 117
    aput-char v2, v11, v0

    .line 118
    .line 119
    add-int/lit8 v0, v0, 0x1

    .line 120
    .line 121
    sput v0, LVa/Ab;->y:I

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_4
    new-instance v0, Ljava/lang/String;

    .line 125
    .line 126
    invoke-direct {v0, v11}, Ljava/lang/String;-><init>([C)V

    .line 127
    .line 128
    .line 129
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    sget v1, LVa/S8;->l:I

    .line 135
    .line 136
    add-int/lit8 v1, v1, 0x7d

    .line 137
    .line 138
    rem-int/lit16 v1, v1, 0x80

    .line 139
    .line 140
    sput v1, LVa/S8;->k:I

    .line 141
    .line 142
    return-object v0

    .line 143
    :goto_3
    monitor-exit v4

    .line 144
    throw v0
.end method


# virtual methods
.method public final b(LVa/x8;LVa/y7;)LVa/s8;
    .locals 3

    .line 1
    iget v0, p0, LVa/S8;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LVa/F8;->e()LVa/y8;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, LVa/F8;->f()LVa/y8;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v0}, LVa/s8;->c()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    instance-of p2, p2, Ljava/lang/String;

    .line 27
    .line 28
    if-nez p2, :cond_5

    .line 29
    .line 30
    invoke-virtual {p1}, LVa/s8;->c()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    instance-of p2, p2, Ljava/lang/String;

    .line 35
    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_0
    invoke-virtual {v0}, LVa/s8;->a()Ljava/lang/Number;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1}, LVa/s8;->a()Ljava/lang/Number;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    instance-of v0, p2, Ljava/lang/Double;

    .line 48
    .line 49
    if-nez v0, :cond_4

    .line 50
    .line 51
    instance-of v0, p1, Ljava/lang/Double;

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    instance-of v0, p2, Ljava/lang/Long;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    instance-of v0, p1, Ljava/lang/Long;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    :goto_0
    new-instance v0, LVa/s8;

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 68
    .line 69
    .line 70
    move-result-wide v1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide p1

    .line 75
    add-long/2addr p1, v1

    .line 76
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-direct {v0, p1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    new-instance v0, LVa/s8;

    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    add-int/2addr p1, p2

    .line 95
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-direct {v0, p1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_4
    :goto_1
    new-instance v0, LVa/s8;

    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 106
    .line 107
    .line 108
    move-result-wide v1

    .line 109
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 110
    .line 111
    .line 112
    move-result-wide p1

    .line 113
    add-double/2addr p1, v1

    .line 114
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-direct {v0, p1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    :goto_2
    new-instance p2, LVa/s8;

    .line 123
    .line 124
    new-instance v1, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, LVa/s8;->c()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, LVa/s8;->c()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-direct {p2, p1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    move-object v0, p2

    .line 151
    :goto_3
    return-object v0

    .line 152
    :pswitch_0
    new-instance v0, LVa/s8;

    .line 153
    .line 154
    invoke-virtual {p0}, LVa/F8;->e()LVa/y8;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v1, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v1}, LVa/s8;->e()Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-eqz v1, :cond_6

    .line 167
    .line 168
    invoke-virtual {p0}, LVa/F8;->f()LVa/y8;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v1, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-virtual {p1}, LVa/s8;->e()Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-eqz p1, :cond_6

    .line 181
    .line 182
    const/4 p1, 0x1

    .line 183
    goto :goto_4

    .line 184
    :cond_6
    const/4 p1, 0x0

    .line 185
    :goto_4
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-direct {v0, p1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_1
    sget v0, LVa/S8;->k:I

    .line 194
    .line 195
    add-int/lit8 v0, v0, 0x4b

    .line 196
    .line 197
    rem-int/lit16 v1, v0, 0x80

    .line 198
    .line 199
    sput v1, LVa/S8;->l:I

    .line 200
    .line 201
    rem-int/lit8 v0, v0, 0x2

    .line 202
    .line 203
    if-nez v0, :cond_7

    .line 204
    .line 205
    invoke-virtual {p0}, LVa/F8;->e()LVa/y8;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0}, LVa/s8;->e()Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    const/16 v2, 0x22

    .line 218
    .line 219
    div-int/lit8 v2, v2, 0x0

    .line 220
    .line 221
    if-eqz v1, :cond_8

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_7
    invoke-virtual {p0}, LVa/F8;->e()LVa/y8;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {v0, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v0}, LVa/s8;->e()Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-eqz v1, :cond_8

    .line 237
    .line 238
    :goto_5
    sget p1, LVa/S8;->k:I

    .line 239
    .line 240
    add-int/lit8 p1, p1, 0x49

    .line 241
    .line 242
    rem-int/lit16 p1, p1, 0x80

    .line 243
    .line 244
    sput p1, LVa/S8;->l:I

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_8
    invoke-virtual {p0}, LVa/F8;->f()LVa/y8;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-virtual {v0, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    :goto_6
    return-object v0

    .line 256
    nop

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h()Ljava/lang/String;
    .locals 9

    .line 1
    iget v0, p0, LVa/S8;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    shr-int/lit8 v0, v0, 0x16

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {v1, v1}, Landroid/graphics/PointF;->length(FF)F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    cmpl-float v1, v2, v1

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x42

    .line 22
    .line 23
    const-string v2, "\u0000"

    .line 24
    .line 25
    const-string v3, ""

    .line 26
    .line 27
    const-string v4, ""

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    invoke-static {v3, v4, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    sget-object v4, LVa/Ab;->x:Ljava/lang/Object;

    .line 41
    .line 42
    monitor-enter v4

    .line 43
    :try_start_0
    new-array v6, v0, [C

    .line 44
    .line 45
    sput v5, LVa/Ab;->v:I

    .line 46
    .line 47
    :goto_0
    sget v7, LVa/Ab;->v:I

    .line 48
    .line 49
    if-ge v7, v0, :cond_0

    .line 50
    .line 51
    aget-char v8, v2, v7

    .line 52
    .line 53
    add-int/2addr v8, v1

    .line 54
    int-to-char v8, v8

    .line 55
    aput-char v8, v6, v7

    .line 56
    .line 57
    add-int/lit8 v8, v8, -0x17

    .line 58
    .line 59
    int-to-char v8, v8

    .line 60
    aput-char v8, v6, v7

    .line 61
    .line 62
    add-int/lit8 v7, v7, 0x1

    .line 63
    .line 64
    sput v7, LVa/Ab;->v:I

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    goto :goto_2

    .line 69
    :cond_0
    if-lez v3, :cond_1

    .line 70
    .line 71
    sput v3, LVa/Ab;->w:I

    .line 72
    .line 73
    new-array v1, v0, [C

    .line 74
    .line 75
    invoke-static {v6, v5, v1, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 76
    .line 77
    .line 78
    sget v2, LVa/Ab;->w:I

    .line 79
    .line 80
    sub-int v3, v0, v2

    .line 81
    .line 82
    invoke-static {v1, v5, v6, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 83
    .line 84
    .line 85
    sget v2, LVa/Ab;->w:I

    .line 86
    .line 87
    sub-int v3, v0, v2

    .line 88
    .line 89
    invoke-static {v1, v2, v6, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 90
    .line 91
    .line 92
    :cond_1
    new-array v1, v0, [C

    .line 93
    .line 94
    sput v5, LVa/Ab;->v:I

    .line 95
    .line 96
    :goto_1
    sget v2, LVa/Ab;->v:I

    .line 97
    .line 98
    if-ge v2, v0, :cond_2

    .line 99
    .line 100
    sub-int v3, v0, v2

    .line 101
    .line 102
    add-int/lit8 v3, v3, -0x1

    .line 103
    .line 104
    aget-char v3, v6, v3

    .line 105
    .line 106
    aput-char v3, v1, v2

    .line 107
    .line 108
    add-int/lit8 v2, v2, 0x1

    .line 109
    .line 110
    sput v2, LVa/Ab;->v:I

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    new-instance v0, Ljava/lang/String;

    .line 114
    .line 115
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    .line 116
    .line 117
    .line 118
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0

    .line 124
    :goto_2
    monitor-exit v4

    .line 125
    throw v0

    .line 126
    :pswitch_0
    invoke-direct {p0}, LVa/S8;->i()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    return-object v0

    .line 131
    :pswitch_1
    invoke-direct {p0}, LVa/S8;->j()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    return-object v0

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
