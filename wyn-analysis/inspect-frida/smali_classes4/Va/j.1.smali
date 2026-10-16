.class public final LVa/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/X;


# static fields
.field public static final c:[C

.field public static d:I = 0x0

.field public static e:I = 0x1

.field public static final f:[C


# instance fields
.field public final synthetic a:I

.field public synthetic b:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x36

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/j;->c:[C

    .line 9
    .line 10
    const/16 v0, 0x30

    .line 11
    .line 12
    new-array v0, v0, [C

    .line 13
    .line 14
    fill-array-data v0, :array_1

    .line 15
    .line 16
    .line 17
    sput-object v0, LVa/j;->f:[C

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :array_0
    .array-data 2
        0x54s
        0x206cs
        0x4067s
        0x606as
        -0x7f99s
        -0x5f93s
        -0x3f81s
        -0x1fb2s
        0x58s
        0x207es
        0x404bs
        0x6059s
        -0x7fa1s
        -0x5fd7s
        -0x3fccs
        -0x1fdcs
        0x3es
        0x203cs
        0x4020s
        0x603as
        -0x7feas
        0x1bb8s
        0x3b8as
        0x5b85s
        0x7b9ds
        -0x6465s
        -0x443cs
        -0x2476s
        -0x450s
        0x1bf5s
        0x3bb7s
        0x5baas
        0x7bbes
        -0x644bs
        -0x442bs
        -0x242bs
        -0x42fs
        0x1b8ds
        0x3bdbs
        0x5bc2s
        0x7bd0s
        -0x6411s
        -0x440fs
        -0x241fs
        -0x452s
        0x1bf1s
        0x3be9s
        0x5b12s
        0x7b1fs
        -0x64fes
        -0x44e8s
        -0x24f6s
        -0x4f5s
        0x1b2ds
    .end array-data

    .line 22
    .line 23
    .line 24
    :array_1
    .array-data 2
        0x21s
        0x59s
        0x6es
        0x6es
        0x69s
        0x64s
        0x6bs
        0x71s
        0x70s
        0x5fs
        0x57s
        0x67s
        0x67s
        0x64s
        0x66s
        0x6bs
        0x32s
        0x6fs
        0x71s
        0x6as
        0x66s
        0x65s
        0x6es
        0x6es
        0x6bs
        0x6bs
        0x44s
        0x43s
        0x6as
        0x6bs
        0x6as
        0x67s
        0x61s
        0x6as
        0x6es
        0x56s
        0x5bs
        0x72s
        0x70s
        0x71s
        0x6bs
        0x64s
        0x69s
        0x6es
        0x6es
        0x69s
        0x41s
        0x42s
    .end array-data
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/j;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(IIC)Ljava/lang/String;
    .locals 9

    .line 1
    sget-object v0, LVa/Ab;->u:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-array v1, p1, [C

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    sput v2, LVa/Ab;->t:I

    .line 8
    .line 9
    :goto_0
    sget v2, LVa/Ab;->t:I

    .line 10
    .line 11
    if-ge v2, p1, :cond_0

    .line 12
    .line 13
    sget-object v3, LVa/j;->c:[C

    .line 14
    .line 15
    add-int v4, p0, v2

    .line 16
    .line 17
    aget-char v3, v3, v4

    .line 18
    .line 19
    int-to-long v3, v3

    .line 20
    int-to-long v5, v2

    .line 21
    const-wide v7, 0x480a3d6fd6b32005L    # 1.1161256434082479E39

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    mul-long/2addr v5, v7

    .line 27
    xor-long/2addr v3, v5

    .line 28
    int-to-long v5, p2

    .line 29
    xor-long/2addr v3, v5

    .line 30
    long-to-int v3, v3

    .line 31
    int-to-char v3, v3

    .line 32
    aput-char v3, v1, v2

    .line 33
    .line 34
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    sput v2, LVa/Ab;->t:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 42
    .line 43
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 44
    .line 45
    .line 46
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    return-object p0

    .line 48
    :goto_1
    monitor-exit v0

    .line 49
    throw p0
.end method

.method public static c(Ljava/lang/String;[IZ)Ljava/lang/String;
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
    sget-object v8, LVa/j;->f:[C

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
.method public final a()V
    .locals 13

    .line 1
    iget v0, p0, LVa/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, LVa/j;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LVa/Ga;

    .line 13
    .line 14
    iget-object v1, v1, LVa/Ga;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, LVa/Kb;

    .line 17
    .line 18
    sget v2, LVa/Kb;->x:I

    .line 19
    .line 20
    add-int/lit8 v3, v2, 0x5b

    .line 21
    .line 22
    rem-int/lit16 v3, v3, 0x80

    .line 23
    .line 24
    sput v3, LVa/Kb;->w:I

    .line 25
    .line 26
    iget-object v1, v1, LVa/Kb;->p:LVa/Ha;

    .line 27
    .line 28
    add-int/lit8 v2, v2, 0x5f

    .line 29
    .line 30
    rem-int/lit16 v2, v2, 0x80

    .line 31
    .line 32
    sput v2, LVa/Kb;->w:I

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    sget v2, LVa/G;->E:I

    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x29

    .line 40
    .line 41
    rem-int/lit16 v3, v2, 0x80

    .line 42
    .line 43
    sput v3, LVa/G;->F:I

    .line 44
    .line 45
    rem-int/lit8 v2, v2, 0x2

    .line 46
    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    iget-object v0, v0, LVa/Mb;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, LVa/W;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, LVa/W;->e(LVa/Ha;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    iget-object v0, v0, LVa/Mb;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, LVa/W;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, LVa/W;->e(LVa/Ha;)V

    .line 62
    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    throw v0

    .line 66
    :pswitch_0
    monitor-enter p0

    .line 67
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 68
    .line 69
    iget-object v1, p0, LVa/j;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, LVa/Ha;

    .line 72
    .line 73
    sget v2, LVa/Ha;->h:I

    .line 74
    .line 75
    add-int/lit8 v2, v2, 0x43

    .line 76
    .line 77
    rem-int/lit16 v3, v2, 0x80

    .line 78
    .line 79
    sput v3, LVa/Ha;->g:I

    .line 80
    .line 81
    rem-int/lit8 v2, v2, 0x2

    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    if-nez v2, :cond_3

    .line 85
    .line 86
    iget-object v1, v1, LVa/Ha;->d:Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, LVa/j;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v1, LVa/Ha;

    .line 94
    .line 95
    sget v2, LVa/Ha;->h:I

    .line 96
    .line 97
    add-int/lit8 v2, v2, 0x43

    .line 98
    .line 99
    rem-int/lit16 v4, v2, 0x80

    .line 100
    .line 101
    sput v4, LVa/Ha;->g:I

    .line 102
    .line 103
    rem-int/lit8 v2, v2, 0x2

    .line 104
    .line 105
    if-nez v2, :cond_2

    .line 106
    .line 107
    iget-object v1, v1, LVa/Ha;->d:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 110
    .line 111
    .line 112
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_1

    .line 122
    .line 123
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Ljava/lang/Runnable;

    .line 128
    .line 129
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_1
    return-void

    .line 134
    :catchall_0
    move-exception v0

    .line 135
    goto :goto_1

    .line 136
    :cond_2
    :try_start_1
    iget-object v0, v1, LVa/Ha;->d:Ljava/util/ArrayList;

    .line 137
    .line 138
    throw v3

    .line 139
    :cond_3
    iget-object v0, v1, LVa/Ha;->d:Ljava/util/ArrayList;

    .line 140
    .line 141
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    :goto_1
    monitor-exit p0

    .line 143
    throw v0

    .line 144
    :pswitch_1
    sget v0, LVa/x;->s:I

    .line 145
    .line 146
    add-int/lit8 v0, v0, 0x11

    .line 147
    .line 148
    rem-int/lit16 v1, v0, 0x80

    .line 149
    .line 150
    sput v1, LVa/x;->r:I

    .line 151
    .line 152
    rem-int/lit8 v0, v0, 0x2

    .line 153
    .line 154
    iget-object v1, p0, LVa/j;->b:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v1, LVa/x;

    .line 157
    .line 158
    invoke-virtual {v1}, LVa/x;->p()V

    .line 159
    .line 160
    .line 161
    sget v0, LVa/x;->r:I

    .line 162
    .line 163
    add-int/lit8 v0, v0, 0x17

    .line 164
    .line 165
    rem-int/lit16 v1, v0, 0x80

    .line 166
    .line 167
    sput v1, LVa/x;->s:I

    .line 168
    .line 169
    rem-int/lit8 v0, v0, 0x2

    .line 170
    .line 171
    if-nez v0, :cond_4

    .line 172
    .line 173
    const/16 v0, 0x62

    .line 174
    .line 175
    div-int/lit8 v0, v0, 0x0

    .line 176
    .line 177
    :cond_4
    return-void

    .line 178
    :pswitch_2
    iget-object v0, p0, LVa/j;->b:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, LVa/Da;

    .line 181
    .line 182
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-virtual {v1}, LVa/G;->X()Ljava/util/HashMap;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    iget-object v0, v0, LVa/Da;->f:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v0, LVa/V;

    .line 193
    .line 194
    invoke-static {v0, v1}, LVa/V;->v(LVa/V;Ljava/util/HashMap;)V

    .line 195
    .line 196
    .line 197
    const/4 v1, 0x0

    .line 198
    const/16 v2, 0x10

    .line 199
    .line 200
    filled-new-array {v1, v2, v1, v1}, [I

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    const-string v4, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001"

    .line 205
    .line 206
    invoke-static {v4, v3, v1}, LVa/j;->c(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    const/16 v4, 0x20

    .line 215
    .line 216
    const/16 v5, 0x14

    .line 217
    .line 218
    filled-new-array {v2, v4, v1, v5}, [I

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    const-string v5, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"

    .line 223
    .line 224
    const/4 v6, 0x1

    .line 225
    invoke-static {v5, v4, v6}, LVa/j;->c(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    invoke-static {v3, v4}, LVa/Ab;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    sget v3, LVa/V;->q:I

    .line 237
    .line 238
    add-int/lit8 v3, v3, 0x51

    .line 239
    .line 240
    rem-int/lit16 v3, v3, 0x80

    .line 241
    .line 242
    sput v3, LVa/V;->p:I

    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    new-instance v3, Ljava/util/ArrayList;

    .line 248
    .line 249
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0}, LVa/V;->e()Ljava/util/ArrayList;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    sget v5, LVa/V;->q:I

    .line 261
    .line 262
    add-int/lit8 v5, v5, 0x67

    .line 263
    .line 264
    rem-int/lit16 v5, v5, 0x80

    .line 265
    .line 266
    sput v5, LVa/V;->p:I

    .line 267
    .line 268
    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v5

    .line 272
    if-eqz v5, :cond_7

    .line 273
    .line 274
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    check-cast v5, LVa/B7;

    .line 279
    .line 280
    invoke-virtual {v5}, LVa/B7;->j()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    invoke-virtual {v0, v6}, LVa/V;->F(Ljava/lang/String;)Z

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    if-eqz v6, :cond_5

    .line 289
    .line 290
    sget v6, LVa/V;->p:I

    .line 291
    .line 292
    add-int/lit8 v6, v6, 0x3

    .line 293
    .line 294
    rem-int/lit16 v7, v6, 0x80

    .line 295
    .line 296
    sput v7, LVa/V;->q:I

    .line 297
    .line 298
    rem-int/lit8 v6, v6, 0x2

    .line 299
    .line 300
    if-nez v6, :cond_6

    .line 301
    .line 302
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    const/16 v5, 0x24

    .line 306
    .line 307
    div-int/2addr v5, v1

    .line 308
    goto :goto_2

    .line 309
    :cond_6
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    goto :goto_2

    .line 313
    :cond_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    if-eqz v4, :cond_8

    .line 322
    .line 323
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    check-cast v4, LVa/B7;

    .line 328
    .line 329
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 330
    .line 331
    .line 332
    move-result-wide v5

    .line 333
    const-wide/16 v7, 0x0

    .line 334
    .line 335
    cmp-long v5, v5, v7

    .line 336
    .line 337
    rsub-int v5, v5, 0xe58

    .line 338
    .line 339
    const-string v6, "\u836f\u8d14\u9fec\ua847\uba15\uc4fc\ud552\ue722\uf1e6\u026e\u0c2b\u1eff\u2f59\u3920\u4b8b\u5447"

    .line 340
    .line 341
    invoke-static {v5, v6}, LVa/V;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v5

    .line 345
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    new-instance v6, Ljava/lang/StringBuilder;

    .line 350
    .line 351
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 352
    .line 353
    .line 354
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 355
    .line 356
    .line 357
    move-result v7

    .line 358
    shr-int/2addr v7, v2

    .line 359
    add-int/lit16 v7, v7, 0x50b7

    .line 360
    .line 361
    const-string v8, "\u8368\ud3f2\u2231\u7168\uc192\u10d3\u670f\ub643\u06f3\u5563"

    .line 362
    .line 363
    invoke-static {v7, v8}, LVa/V;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v7

    .line 367
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v7

    .line 371
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v4}, LVa/B7;->o()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v7

    .line 378
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    const/16 v7, 0x33

    .line 382
    .line 383
    const/16 v8, 0xa

    .line 384
    .line 385
    filled-new-array {v7, v8, v1, v1}, [I

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    const-string v8, "\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001"

    .line 390
    .line 391
    invoke-static {v8, v7}, LVa/V;->l(Ljava/lang/String;[I)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v7

    .line 395
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v7

    .line 399
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    invoke-static {v5, v6}, LVa/Ab;->Y(Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v4}, LVa/B7;->j()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v5

    .line 413
    invoke-virtual {v0}, LVa/V;->f()Ljava/util/HashMap;

    .line 414
    .line 415
    .line 416
    move-result-object v6

    .line 417
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v6

    .line 421
    check-cast v6, Lorg/json/JSONObject;

    .line 422
    .line 423
    invoke-virtual {v0, v5, v6}, LVa/V;->s(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 424
    .line 425
    .line 426
    new-instance v5, LVa/S;

    .line 427
    .line 428
    const/4 v6, 0x0

    .line 429
    invoke-direct {v5, v6}, LVa/S;-><init>(I)V

    .line 430
    .line 431
    .line 432
    iput-object v4, v5, LVa/S;->d:LVa/B7;

    .line 433
    .line 434
    invoke-static {v5}, LVa/Cb;->e(LVa/Ba;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0}, LVa/V;->k()Ljava/util/List;

    .line 438
    .line 439
    .line 440
    move-result-object v5

    .line 441
    check-cast v5, Ljava/util/ArrayList;

    .line 442
    .line 443
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    goto/16 :goto_3

    .line 447
    .line 448
    :cond_8
    sget v0, LVa/V;->q:I

    .line 449
    .line 450
    add-int/lit8 v0, v0, 0x23

    .line 451
    .line 452
    rem-int/lit16 v0, v0, 0x80

    .line 453
    .line 454
    sput v0, LVa/V;->p:I

    .line 455
    .line 456
    add-int/lit8 v0, v0, 0x61

    .line 457
    .line 458
    rem-int/lit16 v1, v0, 0x80

    .line 459
    .line 460
    sput v1, LVa/V;->q:I

    .line 461
    .line 462
    rem-int/lit8 v0, v0, 0x2

    .line 463
    .line 464
    if-eqz v0, :cond_9

    .line 465
    .line 466
    return-void

    .line 467
    :cond_9
    const/4 v0, 0x0

    .line 468
    throw v0

    .line 469
    :pswitch_3
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-virtual {v0}, LVa/G;->L()LVa/D;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    sget v1, LVa/D;->i:I

    .line 481
    .line 482
    add-int/lit8 v1, v1, 0x27

    .line 483
    .line 484
    rem-int/lit16 v1, v1, 0x80

    .line 485
    .line 486
    sput v1, LVa/D;->j:I

    .line 487
    .line 488
    invoke-virtual {v0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 493
    .line 494
    .line 495
    move-result v2

    .line 496
    shr-int/lit8 v2, v2, 0x10

    .line 497
    .line 498
    rsub-int v2, v2, 0x1e1d

    .line 499
    .line 500
    int-to-char v2, v2

    .line 501
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 502
    .line 503
    .line 504
    move-result-wide v3

    .line 505
    const-wide/16 v5, 0x0

    .line 506
    .line 507
    cmp-long v3, v3, v5

    .line 508
    .line 509
    const v4, -0x4f86521e

    .line 510
    .line 511
    .line 512
    add-int/2addr v3, v4

    .line 513
    const-string v4, "\ue3ed\u79ad\u1db0\ufd1e"

    .line 514
    .line 515
    const-string v7, "\u5a3a\ubea4\u08c9"

    .line 516
    .line 517
    invoke-static {v2, v4, v7, v3}, LVa/D;->u(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    invoke-virtual {v1, v2, v5, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 526
    .line 527
    .line 528
    move-result-wide v1

    .line 529
    sget v3, LVa/D;->j:I

    .line 530
    .line 531
    add-int/lit8 v3, v3, 0xf

    .line 532
    .line 533
    rem-int/lit16 v3, v3, 0x80

    .line 534
    .line 535
    sput v3, LVa/D;->i:I

    .line 536
    .line 537
    cmp-long v3, v1, v5

    .line 538
    .line 539
    iget-object v4, p0, LVa/j;->b:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v4, LVa/k;

    .line 542
    .line 543
    const/4 v7, 0x0

    .line 544
    const/4 v8, 0x0

    .line 545
    if-nez v3, :cond_a

    .line 546
    .line 547
    sget v1, LVa/j;->e:I

    .line 548
    .line 549
    add-int/lit8 v1, v1, 0x13

    .line 550
    .line 551
    rem-int/lit16 v1, v1, 0x80

    .line 552
    .line 553
    sput v1, LVa/j;->d:I

    .line 554
    .line 555
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 556
    .line 557
    invoke-static {v4, v1}, LVa/k;->a(LVa/k;Ljava/lang/Boolean;)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0}, LVa/D;->t()J

    .line 561
    .line 562
    .line 563
    move-result-wide v1

    .line 564
    const-string v3, ""

    .line 565
    .line 566
    const/16 v9, 0x30

    .line 567
    .line 568
    invoke-static {v3, v9, v7}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 569
    .line 570
    .line 571
    move-result v10

    .line 572
    add-int/lit8 v10, v10, 0x1

    .line 573
    .line 574
    int-to-char v10, v10

    .line 575
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 576
    .line 577
    .line 578
    move-result v11

    .line 579
    shr-int/lit8 v11, v11, 0x10

    .line 580
    .line 581
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 582
    .line 583
    .line 584
    move-result v12

    .line 585
    shr-int/lit8 v12, v12, 0x10

    .line 586
    .line 587
    add-int/lit8 v12, v12, 0x15

    .line 588
    .line 589
    invoke-static {v11, v12, v10}, LVa/j;->b(IIC)Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v10

    .line 593
    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v10

    .line 597
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 598
    .line 599
    .line 600
    move-result v11

    .line 601
    shr-int/lit8 v11, v11, 0x16

    .line 602
    .line 603
    add-int/lit16 v11, v11, 0x1bfd

    .line 604
    .line 605
    int-to-char v11, v11

    .line 606
    invoke-static {v3, v7}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 607
    .line 608
    .line 609
    move-result v12

    .line 610
    add-int/lit8 v12, v12, 0x15

    .line 611
    .line 612
    invoke-static {v3, v9}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 613
    .line 614
    .line 615
    move-result v3

    .line 616
    add-int/lit8 v3, v3, 0x22

    .line 617
    .line 618
    invoke-static {v12, v3, v11}, LVa/j;->b(IIC)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v3

    .line 622
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v3

    .line 626
    invoke-static {v10, v3, v8, v7}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 627
    .line 628
    .line 629
    goto :goto_4

    .line 630
    :cond_a
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 631
    .line 632
    invoke-static {v4, v3}, LVa/k;->a(LVa/k;Ljava/lang/Boolean;)V

    .line 633
    .line 634
    .line 635
    :goto_4
    sget v3, LVa/D;->i:I

    .line 636
    .line 637
    add-int/lit8 v3, v3, 0x17

    .line 638
    .line 639
    rem-int/lit16 v3, v3, 0x80

    .line 640
    .line 641
    sput v3, LVa/D;->j:I

    .line 642
    .line 643
    invoke-virtual {v0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 644
    .line 645
    .line 646
    move-result-object v3

    .line 647
    invoke-static {v7, v7}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 648
    .line 649
    .line 650
    move-result v9

    .line 651
    rsub-int v9, v9, 0x733d

    .line 652
    .line 653
    int-to-char v9, v9

    .line 654
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 655
    .line 656
    .line 657
    move-result v10

    .line 658
    shr-int/lit8 v10, v10, 0x10

    .line 659
    .line 660
    const-string v11, "\u52ec\u411c\u3d89\u1073"

    .line 661
    .line 662
    const-string v12, "\u3ff9\ub8c8"

    .line 663
    .line 664
    invoke-static {v9, v11, v12, v10}, LVa/D;->u(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v9

    .line 668
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v9

    .line 672
    invoke-virtual {v3, v9, v5, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 673
    .line 674
    .line 675
    move-result-wide v5

    .line 676
    sget v3, LVa/D;->i:I

    .line 677
    .line 678
    add-int/lit8 v3, v3, 0x59

    .line 679
    .line 680
    rem-int/lit16 v9, v3, 0x80

    .line 681
    .line 682
    sput v9, LVa/D;->j:I

    .line 683
    .line 684
    rem-int/lit8 v3, v3, 0x2

    .line 685
    .line 686
    if-nez v3, :cond_b

    .line 687
    .line 688
    const/16 v3, 0x63

    .line 689
    .line 690
    div-int/2addr v3, v7

    .line 691
    :cond_b
    sget v3, LVa/k;->i:I

    .line 692
    .line 693
    add-int/lit8 v3, v3, 0x21

    .line 694
    .line 695
    rem-int/lit16 v3, v3, 0x80

    .line 696
    .line 697
    sput v3, LVa/k;->h:I

    .line 698
    .line 699
    iput-wide v5, v4, LVa/k;->b:J

    .line 700
    .line 701
    add-int/lit8 v3, v3, 0x2f

    .line 702
    .line 703
    rem-int/lit16 v3, v3, 0x80

    .line 704
    .line 705
    sput v3, LVa/k;->i:I

    .line 706
    .line 707
    invoke-virtual {v0}, LVa/D;->t()J

    .line 708
    .line 709
    .line 710
    move-result-wide v5

    .line 711
    sget v0, LVa/k;->h:I

    .line 712
    .line 713
    add-int/lit8 v0, v0, 0x1f

    .line 714
    .line 715
    rem-int/lit16 v0, v0, 0x80

    .line 716
    .line 717
    sput v0, LVa/k;->i:I

    .line 718
    .line 719
    iput-wide v5, v4, LVa/k;->c:J

    .line 720
    .line 721
    add-int/lit8 v3, v0, 0x71

    .line 722
    .line 723
    rem-int/lit16 v7, v3, 0x80

    .line 724
    .line 725
    sput v7, LVa/k;->h:I

    .line 726
    .line 727
    rem-int/lit8 v3, v3, 0x2

    .line 728
    .line 729
    if-nez v3, :cond_10

    .line 730
    .line 731
    add-int/lit8 v3, v0, 0x33

    .line 732
    .line 733
    rem-int/lit16 v7, v3, 0x80

    .line 734
    .line 735
    sput v7, LVa/k;->h:I

    .line 736
    .line 737
    rem-int/lit8 v3, v3, 0x2

    .line 738
    .line 739
    if-nez v3, :cond_f

    .line 740
    .line 741
    iget-wide v9, v4, LVa/k;->b:J

    .line 742
    .line 743
    sub-long v9, v1, v9

    .line 744
    .line 745
    iput-wide v9, v4, LVa/k;->d:J

    .line 746
    .line 747
    add-int/lit8 v3, v0, 0x61

    .line 748
    .line 749
    rem-int/lit16 v7, v3, 0x80

    .line 750
    .line 751
    sput v7, LVa/k;->h:I

    .line 752
    .line 753
    rem-int/lit8 v3, v3, 0x2

    .line 754
    .line 755
    if-nez v3, :cond_e

    .line 756
    .line 757
    add-int/lit8 v3, v0, 0x1

    .line 758
    .line 759
    rem-int/lit16 v7, v3, 0x80

    .line 760
    .line 761
    sput v7, LVa/k;->h:I

    .line 762
    .line 763
    rem-int/lit8 v3, v3, 0x2

    .line 764
    .line 765
    if-nez v3, :cond_d

    .line 766
    .line 767
    sub-long/2addr v1, v5

    .line 768
    add-int/lit8 v0, v0, 0x2d

    .line 769
    .line 770
    rem-int/lit16 v0, v0, 0x80

    .line 771
    .line 772
    sput v0, LVa/k;->h:I

    .line 773
    .line 774
    iput-wide v1, v4, LVa/k;->e:J

    .line 775
    .line 776
    add-int/lit8 v0, v0, 0x33

    .line 777
    .line 778
    rem-int/lit16 v0, v0, 0x80

    .line 779
    .line 780
    sput v0, LVa/k;->i:I

    .line 781
    .line 782
    sget v0, LVa/j;->d:I

    .line 783
    .line 784
    add-int/lit8 v0, v0, 0x5

    .line 785
    .line 786
    rem-int/lit16 v1, v0, 0x80

    .line 787
    .line 788
    sput v1, LVa/j;->e:I

    .line 789
    .line 790
    rem-int/lit8 v0, v0, 0x2

    .line 791
    .line 792
    if-eqz v0, :cond_c

    .line 793
    .line 794
    return-void

    .line 795
    :cond_c
    throw v8

    .line 796
    :cond_d
    throw v8

    .line 797
    :cond_e
    throw v8

    .line 798
    :cond_f
    throw v8

    .line 799
    :cond_10
    throw v8

    .line 800
    nop

    .line 801
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
