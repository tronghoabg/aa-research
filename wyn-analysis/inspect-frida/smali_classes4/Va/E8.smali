.class public final LVa/E8;
.super LVa/H8;
.source "SourceFile"


# static fields
.field public static final k:[I

.field public static l:I = 0x0

.field public static m:I = 0x1


# instance fields
.field public final i:LVa/y8;

.field public final j:[LVa/y8;


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
    sput-object v0, LVa/E8;->k:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x788e042
        -0x1f0b88cc
        -0xb0a1cc9
        -0x25dd02b0
        0x762bff24
        -0x36a38771
        0x34bdac1e
        0x77589799
        -0x711a410f
        -0x391c253c
        -0x2b80bd1b
        0x5dbacc60
        0x2831e05f
        0x7a888505
        0x1c1c5ed5
        -0xc3f7d5
        0x66316938
        0x68527176
    .end array-data
.end method

.method public constructor <init>(LVa/y8;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p4}, LVa/H8;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/E8;->i:LVa/y8;

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    new-array p1, p1, [LVa/y8;

    .line 13
    .line 14
    iput-object p1, p0, LVa/E8;->j:[LVa/y8;

    .line 15
    .line 16
    invoke-interface {p3, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public static i([LVa/y8;LVa/x8;LVa/y7;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    sget v3, LVa/E8;->l:I

    .line 11
    .line 12
    add-int/lit8 v3, v3, 0x21

    .line 13
    .line 14
    rem-int/lit16 v3, v3, 0x80

    .line 15
    .line 16
    sput v3, LVa/E8;->m:I

    .line 17
    .line 18
    aget-object v3, p0, v2

    .line 19
    .line 20
    invoke-virtual {v3, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v3}, LVa/s8;->c()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Ljava/lang/Class;

    .line 29
    .line 30
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    sget v3, LVa/E8;->m:I

    .line 36
    .line 37
    add-int/lit8 v3, v3, 0x4f

    .line 38
    .line 39
    rem-int/lit16 v3, v3, 0x80

    .line 40
    .line 41
    sput v3, LVa/E8;->l:I

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-object v0
.end method

.method public static j(I[I)Ljava/lang/String;
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
    sget-object v4, LVa/E8;->k:[I

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
.method public final b(LVa/x8;LVa/y7;)LVa/s8;
    .locals 9

    .line 1
    const/16 v1, 0xc

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LVa/H8;->h(LVa/x8;LVa/y7;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v5

    .line 7
    iget-object v0, p0, LVa/E8;->i:LVa/y8;

    .line 8
    .line 9
    instance-of v2, v0, LVa/J8;

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    check-cast v0, LVa/J8;

    .line 16
    .line 17
    invoke-virtual {v0}, LVa/J8;->e()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const v2, -0x4a0e04f9

    .line 22
    .line 23
    .line 24
    const v4, 0x23f749dd

    .line 25
    .line 26
    .line 27
    const v6, 0x6d359775

    .line 28
    .line 29
    .line 30
    const v7, 0x4e760bac

    .line 31
    .line 32
    .line 33
    filled-new-array {v2, v4, v6, v7}, [I

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v3}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    cmpl-float v4, v4, v8

    .line 42
    .line 43
    add-int/lit8 v4, v4, 0x5

    .line 44
    .line 45
    invoke-static {v4, v2}, LVa/E8;->j(I[I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    invoke-virtual {p2}, LVa/y7;->h()LVa/ha;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v0, v0, LVa/ha;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, LVa/ha;

    .line 66
    .line 67
    invoke-virtual {p0}, LVa/H8;->g()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v1}, LVa/ha;->f(Ljava/lang/String;)LVa/r8;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0, p1, p2, v5}, LVa/r8;->c(LVa/x8;LVa/y7;Ljava/util/List;)LVa/s8;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1, v3}, LVa/s8;->d(Z)V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_0
    iget-object v0, p0, LVa/E8;->i:LVa/y8;

    .line 84
    .line 85
    invoke-virtual {v0, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, LVa/s8;->c()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    instance-of v0, v2, LVa/Q6;

    .line 94
    .line 95
    if-eqz v0, :cond_1

    .line 96
    .line 97
    new-instance v0, LVa/s8;

    .line 98
    .line 99
    check-cast v2, LVa/Q6;

    .line 100
    .line 101
    invoke-virtual {p0}, LVa/H8;->g()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {p2}, LVa/y7;->b()LVa/Ra;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    move-object v7, p1

    .line 110
    move-object v3, p2

    .line 111
    invoke-interface/range {v2 .. v7}, LVa/Q6;->a(LVa/y7;Ljava/lang/String;Ljava/util/ArrayList;LVa/Ra;LVa/x8;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-direct {v0, p1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    return-object v0

    .line 119
    :cond_1
    move-object v7, p1

    .line 120
    move p1, v3

    .line 121
    move-object v3, p2

    .line 122
    instance-of p2, v2, LVa/y7;

    .line 123
    .line 124
    if-eqz p2, :cond_3

    .line 125
    .line 126
    monitor-enter v2

    .line 127
    :try_start_0
    move-object p2, v2

    .line 128
    check-cast p2, LVa/y7;

    .line 129
    .line 130
    invoke-virtual {p0}, LVa/H8;->g()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {p2, v0}, LVa/y7;->q(Ljava/lang/String;)LVa/r8;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    if-eqz v0, :cond_2

    .line 139
    .line 140
    invoke-virtual {p2}, LVa/y7;->e()LVa/x8;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {v0, v1, p2, v5}, LVa/r8;->c(LVa/x8;LVa/y7;Ljava/util/List;)LVa/s8;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-virtual {p2, p1}, LVa/s8;->d(Z)V

    .line 149
    .line 150
    .line 151
    monitor-exit v2

    .line 152
    return-object p2

    .line 153
    :catchall_0
    move-exception v0

    .line 154
    move-object p1, v0

    .line 155
    goto :goto_0

    .line 156
    :cond_2
    invoke-virtual {v3}, LVa/y7;->f()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    new-array v4, v1, [I

    .line 166
    .line 167
    fill-array-data v4, :array_0

    .line 168
    .line 169
    .line 170
    const-string v6, ""

    .line 171
    .line 172
    invoke-static {v6}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    add-int/lit8 v6, v6, 0x18

    .line 177
    .line 178
    invoke-static {v6, v4}, LVa/E8;->j(I[I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0}, LVa/H8;->g()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    new-instance v4, Ljava/lang/NoSuchMethodException;

    .line 201
    .line 202
    invoke-direct {v4}, Ljava/lang/NoSuchMethodException;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-static {p2, v0, v4}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 206
    .line 207
    .line 208
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 209
    goto :goto_1

    .line 210
    :goto_0
    monitor-exit v2

    .line 211
    throw p1

    .line 212
    :cond_3
    :goto_1
    :try_start_1
    iget-object p2, p0, LVa/E8;->j:[LVa/y8;

    .line 213
    .line 214
    if-eqz p2, :cond_4

    .line 215
    .line 216
    invoke-static {p2, v7, v3}, LVa/E8;->i([LVa/y8;LVa/x8;LVa/y7;)Ljava/util/ArrayList;

    .line 217
    .line 218
    .line 219
    move-result-object p2

    .line 220
    invoke-virtual {p0}, LVa/H8;->g()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-static {v2, v0, p2}, LVa/ub;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/reflect/Method;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    goto :goto_2

    .line 229
    :catch_0
    move-exception v0

    .line 230
    move-object p1, v0

    .line 231
    goto :goto_3

    .line 232
    :catch_1
    move-exception v0

    .line 233
    move-object p1, v0

    .line 234
    goto :goto_4

    .line 235
    :catch_2
    move-exception v0

    .line 236
    move-object p1, v0

    .line 237
    goto :goto_5

    .line 238
    :cond_4
    invoke-virtual {p0}, LVa/H8;->g()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    invoke-static {v2, p2, v5}, LVa/ub;->k(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)Ljava/lang/reflect/Method;

    .line 243
    .line 244
    .line 245
    move-result-object p2

    .line 246
    :goto_2
    if-nez p2, :cond_5

    .line 247
    .line 248
    invoke-virtual {v5, p1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    new-instance p1, LVa/s8;

    .line 252
    .line 253
    invoke-virtual {v3}, LVa/y7;->d()LVa/Z7;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    invoke-virtual {p0}, LVa/H8;->g()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    invoke-virtual {v3}, LVa/y7;->b()LVa/Ra;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    invoke-virtual/range {v2 .. v7}, LVa/Z7;->a(LVa/y7;Ljava/lang/String;Ljava/util/ArrayList;LVa/Ra;LVa/x8;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p2

    .line 269
    invoke-direct {p1, p2}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    return-object p1

    .line 273
    :cond_5
    new-instance p1, LVa/s8;

    .line 274
    .line 275
    invoke-virtual {v5}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {p2, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p2

    .line 283
    invoke-direct {p1, p2}, LVa/s8;-><init>(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 284
    .line 285
    .line 286
    return-object p1

    .line 287
    :goto_3
    new-instance p2, Ljava/lang/RuntimeException;

    .line 288
    .line 289
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 290
    .line 291
    .line 292
    throw p2

    .line 293
    :goto_4
    invoke-virtual {v3}, LVa/y7;->f()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p2

    .line 297
    new-instance v0, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 300
    .line 301
    .line 302
    new-array v1, v1, [I

    .line 303
    .line 304
    fill-array-data v1, :array_1

    .line 305
    .line 306
    .line 307
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    shr-int/lit8 v2, v2, 0x10

    .line 312
    .line 313
    rsub-int/lit8 v2, v2, 0x17

    .line 314
    .line 315
    invoke-static {v2, v1}, LVa/E8;->j(I[I)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-static {p2, v0, p1}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 334
    .line 335
    .line 336
    goto :goto_6

    .line 337
    :goto_5
    invoke-virtual {v3}, LVa/y7;->f()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object p2

    .line 341
    new-instance v0, Ljava/lang/StringBuilder;

    .line 342
    .line 343
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 344
    .line 345
    .line 346
    new-array v1, v1, [I

    .line 347
    .line 348
    fill-array-data v1, :array_2

    .line 349
    .line 350
    .line 351
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    cmpl-float v2, v2, v8

    .line 356
    .line 357
    rsub-int/lit8 v2, v2, 0x18

    .line 358
    .line 359
    invoke-static {v2, v1}, LVa/E8;->j(I[I)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-static {p2, v0, p1}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 378
    .line 379
    .line 380
    :goto_6
    const/4 p1, 0x0

    .line 381
    return-object p1

    .line 382
    nop

    .line 383
    :array_0
    .array-data 4
        -0xb9e3b1
        0x47de7d14
        -0x744fdc74
        -0x3327b6d6
        0x1dff4922
        0x1d95c604
        -0x5619c006    # -1.022515E-13f
        -0x36fd3b
        0x6836ad45
        -0x7176672e
        -0x1b76f32f
        -0x18cabfa3
    .end array-data

    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    :array_1
    .array-data 4
        -0xb9e3b1
        0x47de7d14
        -0x744fdc74
        -0x3327b6d6
        0x1dff4922
        0x1d95c604
        -0x5619c006    # -1.022515E-13f
        -0x36fd3b
        0x6836ad45
        -0x7176672e
        -0x1b76f32f
        -0x18cabfa3
    .end array-data

    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    :array_2
    .array-data 4
        -0xb9e3b1
        0x47de7d14
        -0x744fdc74
        -0x3327b6d6
        0x1dff4922
        0x1d95c604
        -0x5619c006    # -1.022515E-13f
        -0x36fd3b
        0x6836ad45
        -0x7176672e
        -0x1b76f32f
        -0x18cabfa3
    .end array-data
.end method

.method public final e([Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LVa/E8;->i:LVa/y8;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const v1, -0x7e0b08c6

    .line 12
    .line 13
    .line 14
    const v2, -0x3220c70a    # -4.6813152E8f

    .line 15
    .line 16
    .line 17
    filled-new-array {v1, v2}, [I

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    cmpl-float v2, v2, v3

    .line 27
    .line 28
    invoke-static {v2, v1}, LVa/E8;->j(I[I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, LVa/H8;->g()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    sget v1, LVa/E8;->m:I

    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x27

    .line 49
    .line 50
    rem-int/lit16 v2, v1, 0x80

    .line 51
    .line 52
    sput v2, LVa/E8;->l:I

    .line 53
    .line 54
    rem-int/lit8 v1, v1, 0x2

    .line 55
    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    iget-object v1, p0, LVa/E8;->j:[LVa/y8;

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    new-instance v2, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const v3, -0x14df3968

    .line 68
    .line 69
    .line 70
    const v4, -0x6f400d31

    .line 71
    .line 72
    .line 73
    filled-new-array {v3, v4}, [I

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    const/4 v4, 0x0

    .line 78
    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    rsub-int/lit8 v5, v5, 0x1

    .line 83
    .line 84
    invoke-static {v5, v3}, LVa/E8;->j(I[I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-static {v1}, LVa/y8;->d([Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const v1, 0xf75efc2

    .line 103
    .line 104
    .line 105
    const v3, 0x3c58deab

    .line 106
    .line 107
    .line 108
    filled-new-array {v1, v3}, [I

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-static {v4, v4, v4}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    add-int/lit8 v3, v3, 0x1

    .line 117
    .line 118
    invoke-static {v3, v1}, LVa/E8;->j(I[I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    goto :goto_0

    .line 134
    :cond_0
    add-int/lit8 v2, v2, 0x77

    .line 135
    .line 136
    rem-int/lit16 v2, v2, 0x80

    .line 137
    .line 138
    sput v2, LVa/E8;->m:I

    .line 139
    .line 140
    const-string v1, ""

    .line 141
    .line 142
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const v1, 0x3deb3c44

    .line 146
    .line 147
    .line 148
    const v2, 0x7f852296

    .line 149
    .line 150
    .line 151
    filled-new-array {v1, v2}, [I

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    shr-int/lit8 v2, v2, 0x10

    .line 160
    .line 161
    rsub-int/lit8 v2, v2, 0x1

    .line 162
    .line 163
    invoke-static {v2, v1}, LVa/E8;->j(I[I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-static {p1}, LVa/y8;->d([Ljava/lang/Object;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const p1, -0x767da223

    .line 182
    .line 183
    .line 184
    const v1, 0x83ed1a5

    .line 185
    .line 186
    .line 187
    filled-new-array {p1, v1}, [I

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 192
    .line 193
    .line 194
    move-result-wide v1

    .line 195
    const-wide/16 v3, -0x1

    .line 196
    .line 197
    cmp-long v1, v1, v3

    .line 198
    .line 199
    invoke-static {v1, p1}, LVa/E8;->j(I[I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    sget v0, LVa/E8;->l:I

    .line 215
    .line 216
    add-int/lit8 v0, v0, 0x53

    .line 217
    .line 218
    rem-int/lit16 v0, v0, 0x80

    .line 219
    .line 220
    sput v0, LVa/E8;->m:I

    .line 221
    .line 222
    return-object p1

    .line 223
    :cond_1
    const/4 p1, 0x0

    .line 224
    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_6

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, LVa/E8;

    .line 13
    .line 14
    if-eq v3, v2, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    invoke-super {p0, p1}, LVa/H8;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    sget p1, LVa/E8;->m:I

    .line 24
    .line 25
    add-int/lit8 p1, p1, 0x1b

    .line 26
    .line 27
    rem-int/lit16 p1, p1, 0x80

    .line 28
    .line 29
    sput p1, LVa/E8;->l:I

    .line 30
    .line 31
    return v1

    .line 32
    :cond_2
    check-cast p1, LVa/E8;

    .line 33
    .line 34
    iget-object v2, p1, LVa/E8;->i:LVa/y8;

    .line 35
    .line 36
    iget-object v3, p0, LVa/E8;->i:LVa/y8;

    .line 37
    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_4

    .line 45
    .line 46
    sget p1, LVa/E8;->m:I

    .line 47
    .line 48
    add-int/lit8 p1, p1, 0x7d

    .line 49
    .line 50
    rem-int/lit16 p1, p1, 0x80

    .line 51
    .line 52
    sput p1, LVa/E8;->l:I

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    if-eqz v2, :cond_4

    .line 56
    .line 57
    :goto_0
    return v1

    .line 58
    :cond_4
    iget-object p1, p1, LVa/E8;->j:[LVa/y8;

    .line 59
    .line 60
    iget-object v2, p0, LVa/E8;->j:[LVa/y8;

    .line 61
    .line 62
    if-eqz v2, :cond_5

    .line 63
    .line 64
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    return p1

    .line 69
    :cond_5
    if-nez p1, :cond_6

    .line 70
    .line 71
    return v0

    .line 72
    :cond_6
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    sget v0, LVa/E8;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x31

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/E8;->m:I

    .line 8
    .line 9
    invoke-super {p0}, LVa/H8;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    mul-int/lit8 v0, v0, 0x1f

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iget-object v2, p0, LVa/E8;->i:LVa/y8;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget v2, LVa/E8;->l:I

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x37

    .line 28
    .line 29
    rem-int/lit16 v2, v2, 0x80

    .line 30
    .line 31
    sput v2, LVa/E8;->m:I

    .line 32
    .line 33
    move v2, v1

    .line 34
    :goto_0
    add-int/2addr v0, v2

    .line 35
    mul-int/lit8 v0, v0, 0x1f

    .line 36
    .line 37
    iget-object v2, p0, LVa/E8;->j:[LVa/y8;

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    sget v2, LVa/E8;->m:I

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x4d

    .line 48
    .line 49
    rem-int/lit16 v2, v2, 0x80

    .line 50
    .line 51
    sput v2, LVa/E8;->l:I

    .line 52
    .line 53
    :cond_1
    add-int/2addr v0, v1

    .line 54
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    sget v0, LVa/E8;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x55

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/E8;->l:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/H8;->e:[LVa/y8;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    sget v0, LVa/H8;->g:I

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0xd

    .line 19
    .line 20
    rem-int/lit16 v3, v0, 0x80

    .line 21
    .line 22
    sput v3, LVa/H8;->h:I

    .line 23
    .line 24
    rem-int/lit8 v0, v0, 0x2

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, v1}, LVa/E8;->e([Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget v1, LVa/E8;->l:I

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x25

    .line 35
    .line 36
    rem-int/lit16 v1, v1, 0x80

    .line 37
    .line 38
    sput v1, LVa/E8;->m:I

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_0
    throw v2

    .line 42
    :cond_1
    sget v0, LVa/H8;->g:I

    .line 43
    .line 44
    add-int/lit8 v0, v0, 0xd

    .line 45
    .line 46
    rem-int/lit16 v3, v0, 0x80

    .line 47
    .line 48
    sput v3, LVa/H8;->h:I

    .line 49
    .line 50
    rem-int/lit8 v0, v0, 0x2

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0, v1}, LVa/E8;->e([Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    throw v2

    .line 58
    :cond_2
    throw v2
.end method
