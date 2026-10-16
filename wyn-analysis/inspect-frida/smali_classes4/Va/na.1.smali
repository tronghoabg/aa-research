.class public final LVa/na;
.super LVa/pb;
.source "SourceFile"

# interfaces
.implements LVa/Q6;


# static fields
.field public static final P:[C

.field public static final Q:[C

.field public static R:I = 0x0

.field public static S:I = 0x1


# instance fields
.field public K:Ljava/lang/reflect/Field;

.field public final L:Ljava/util/Collection;

.field public M:Ljava/util/Map;

.field public N:Ljava/lang/Object;

.field public O:LVa/na;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x2e

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/na;->P:[C

    .line 9
    .line 10
    const/16 v0, 0x6e

    .line 11
    .line 12
    new-array v0, v0, [C

    .line 13
    .line 14
    fill-array-data v0, :array_1

    .line 15
    .line 16
    .line 17
    sput-object v0, LVa/na;->Q:[C

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :array_0
    .array-data 2
        0x67s
        0x1850s
        0x301es
        0x48c9s
        0x60b5s
        0x7965s
        -0x6eb5s
        -0x56eas
        -0x6783s
        -0x7faes
        -0x57c3s
        -0x2f1cs
        -0x754s
        -0x1e8fs
        0x94fs
        0x3104s
        0x59c8s
        0x41a0s
        0x6a69s
        -0x6dc3s
        0x1265s
        0xa52s
        0x221cs
        0x5ad0s
        0x72b7s
        0x6b7bs
        -0x1f25s
        -0x714s
        -0x2f5es
        -0x578ds
        -0x7ff7s
        -0x6639s
        0x71e7s
        0x49a1s
        0x2160s
        0x67s
        0x1850s
        0x301es
        0x48d6s
        0x60bas
        0x797as
        -0x6eb6s
        -0x56ees
        -0x3e3as
        -0x2642s
        -0xd89s
    .end array-data

    .line 22
    .line 23
    .line 24
    :array_1
    .array-data 2
        0x32s
        0x6ds
        0x70s
        0x66s
        0x5bs
        0x65s
        0x6cs
        0x6cs
        0x6as
        0xd9s
        0xc7s
        0xc2s
        0xd2s
        0xd3s
        0xd3s
        0x34s
        0x67s
        0x68s
        0x68s
        0x65s
        0x66s
        0x6cs
        0x5ds
        0x36s
        0x6cs
        0x6ds
        0x59s
        0x5bs
        0x6cs
        0x66s
        0x6as
        0x6es
        0x6cs
        0x6es
        0x6bs
        0x64s
        0x74s
        0xe0s
        0xcfs
        0xd8s
        0xe6s
        0x27s
        0x58s
        0x66s
        0x67s
        0x64s
        0x6bs
        0x5ds
        0x57s
        0x67s
        0x68s
        0x68s
        0x56s
        0x5bs
        0x6es
        0x6es
        0x22s
        0x5bs
        0x72s
        0x70s
        0x70s
        0x49s
        0x4bs
        0x6fs
        0x68s
        0x6as
        0x68s
        0x42s
        0x42s
        0x6es
        0x6es
        0x64s
        0x6cs
        0x74s
        0x6es
        0x6bs
        0x6as
        0x43s
        0x37s
        0x58s
        0x66s
        0x67s
        0x64s
        0x6bs
        0x5ds
        0x57s
        0x67s
        0x68s
        0x68s
        0x56s
        0x5bs
        0x6es
        0x6es
        0x46s
        0x47s
        0x67s
        0x6as
        0x6es
        0x6fs
        0x6ds
        0x42s
        0x46s
        0x69s
        0x6cs
        0x6es
        0x6bs
        0x69s
        0x42s
        0x23s
        0x13s
    .end array-data
.end method

.method public constructor <init>(Ljava/util/Collection;Ljava/lang/Object;LVa/na;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/na;->L:Ljava/util/Collection;

    .line 5
    .line 6
    iput-object p2, p0, LVa/na;->N:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, LVa/na;->O:LVa/na;

    .line 9
    .line 10
    return-void
.end method

.method public static Y(Ljava/lang/String;[IZ)Ljava/lang/String;
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
    sget-object v8, LVa/na;->Q:[C

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

.method public static q0(IIC)Ljava/lang/String;
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
    sget-object v3, LVa/na;->P:[C

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
    const-wide v7, -0x1ace8c6ac5b8e7cbL    # -2.828720837992934E179

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


# virtual methods
.method public final a(LVa/y7;Ljava/lang/String;Ljava/util/ArrayList;LVa/Ra;LVa/x8;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    const/4 v5, 0x0

    .line 8
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    const/16 v6, 0x30

    .line 13
    .line 14
    const-string v7, ""

    .line 15
    .line 16
    const/4 v8, 0x6

    .line 17
    const/4 v9, 0x4

    .line 18
    const/16 v10, 0xf

    .line 19
    .line 20
    const/4 v11, 0x5

    .line 21
    const/4 v12, 0x3

    .line 22
    const/16 v13, 0x9

    .line 23
    .line 24
    const/4 v14, 0x7

    .line 25
    const/16 v15, 0x8

    .line 26
    .line 27
    const/16 v16, 0x2

    .line 28
    .line 29
    sparse-switch v0, :sswitch_data_0

    .line 30
    .line 31
    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :sswitch_0
    :try_start_1
    const-string v0, "\u0000\u0000\u0001\u0001\u0000\u0001\u0000"

    .line 35
    .line 36
    const/16 v6, 0x6b

    .line 37
    .line 38
    filled-new-array {v15, v14, v6, v14}, [I

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-static {v0, v6, v5}, LVa/na;->Y(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    sget v0, LVa/na;->S:I

    .line 57
    .line 58
    add-int/lit8 v0, v0, 0x2b

    .line 59
    .line 60
    rem-int/lit16 v6, v0, 0x80

    .line 61
    .line 62
    sput v6, LVa/na;->R:I

    .line 63
    .line 64
    rem-int/lit8 v0, v0, 0x2

    .line 65
    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    :goto_0
    move v8, v12

    .line 69
    goto/16 :goto_4

    .line 70
    .line 71
    :cond_0
    move/from16 v8, v16

    .line 72
    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :catch_0
    move-exception v0

    .line 76
    move-object/from16 v7, p1

    .line 77
    .line 78
    goto/16 :goto_5

    .line 79
    .line 80
    :sswitch_1
    :try_start_2
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 81
    .line 82
    .line 83
    move-result-wide v6

    .line 84
    const-wide/16 v8, -0x1

    .line 85
    .line 86
    cmp-long v0, v6, v8

    .line 87
    .line 88
    rsub-int/lit8 v0, v0, 0x1

    .line 89
    .line 90
    int-to-char v0, v0

    .line 91
    invoke-static {v5, v5, v5}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    const/4 v8, 0x0

    .line 100
    cmpl-float v7, v7, v8

    .line 101
    .line 102
    rsub-int/lit8 v7, v7, 0x9

    .line 103
    .line 104
    invoke-static {v6, v7, v0}, LVa/na;->q0(IIC)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 116
    if-eqz v0, :cond_3

    .line 117
    .line 118
    sget v0, LVa/na;->S:I

    .line 119
    .line 120
    add-int/lit8 v0, v0, 0x1b

    .line 121
    .line 122
    rem-int/lit16 v6, v0, 0x80

    .line 123
    .line 124
    sput v6, LVa/na;->R:I

    .line 125
    .line 126
    rem-int/lit8 v0, v0, 0x2

    .line 127
    .line 128
    if-eqz v0, :cond_1

    .line 129
    .line 130
    :goto_1
    move v8, v4

    .line 131
    goto/16 :goto_4

    .line 132
    .line 133
    :cond_1
    move v8, v5

    .line 134
    goto/16 :goto_4

    .line 135
    .line 136
    :sswitch_2
    :try_start_3
    const-string v0, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"

    .line 137
    .line 138
    filled-new-array {v10, v15, v5, v9}, [I

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-static {v0, v6, v5}, LVa/na;->Y(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_3

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :sswitch_3
    const-string v0, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000"

    .line 158
    .line 159
    filled-new-array {v5, v15, v5, v15}, [I

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    invoke-static {v0, v6, v4}, LVa/na;->Y(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_3

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :sswitch_4
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    shr-int/lit8 v0, v0, 0x10

    .line 183
    .line 184
    const v6, 0xe0bc

    .line 185
    .line 186
    .line 187
    add-int/2addr v0, v6

    .line 188
    int-to-char v0, v0

    .line 189
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    shr-int/lit8 v6, v6, 0x16

    .line 194
    .line 195
    add-int/lit8 v6, v6, 0x1a

    .line 196
    .line 197
    invoke-static {v5}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 198
    .line 199
    .line 200
    move-result v7

    .line 201
    rsub-int/lit8 v7, v7, 0x9

    .line 202
    .line 203
    invoke-static {v6, v7, v0}, LVa/na;->q0(IIC)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_3

    .line 216
    .line 217
    move v8, v15

    .line 218
    goto/16 :goto_4

    .line 219
    .line 220
    :sswitch_5
    invoke-static {v5, v5, v5}, Landroid/graphics/Color;->rgb(III)I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    const v6, -0xff67ec

    .line 225
    .line 226
    .line 227
    sub-int/2addr v6, v0

    .line 228
    int-to-char v0, v6

    .line 229
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    shr-int/lit8 v6, v6, 0x10

    .line 234
    .line 235
    sub-int/2addr v15, v6

    .line 236
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    shr-int/lit8 v6, v6, 0x10

    .line 241
    .line 242
    add-int/lit8 v6, v6, 0xc

    .line 243
    .line 244
    invoke-static {v15, v6, v0}, LVa/na;->q0(IIC)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 256
    if-eqz v0, :cond_3

    .line 257
    .line 258
    sget v0, LVa/na;->S:I

    .line 259
    .line 260
    add-int/lit8 v0, v0, 0x47

    .line 261
    .line 262
    rem-int/lit16 v6, v0, 0x80

    .line 263
    .line 264
    sput v6, LVa/na;->R:I

    .line 265
    .line 266
    rem-int/lit8 v0, v0, 0x2

    .line 267
    .line 268
    if-eqz v0, :cond_2

    .line 269
    .line 270
    :goto_2
    move v8, v11

    .line 271
    goto/16 :goto_4

    .line 272
    .line 273
    :cond_2
    move v8, v9

    .line 274
    goto/16 :goto_4

    .line 275
    .line 276
    :sswitch_6
    :try_start_4
    const-string v0, "\u0000\u0001\u0000\u0000\u0000"

    .line 277
    .line 278
    const/16 v6, 0x24

    .line 279
    .line 280
    const/16 v7, 0x78

    .line 281
    .line 282
    filled-new-array {v6, v11, v7, v5}, [I

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    invoke-static {v0, v6, v4}, LVa/na;->Y(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    if-eqz v0, :cond_3

    .line 299
    .line 300
    goto :goto_4

    .line 301
    :sswitch_7
    invoke-static {v7, v6, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    rsub-int v0, v0, 0x1201

    .line 306
    .line 307
    int-to-char v0, v0

    .line 308
    const-wide/16 v6, 0x0

    .line 309
    .line 310
    invoke-static {v6, v7}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 311
    .line 312
    .line 313
    move-result v6

    .line 314
    add-int/lit8 v6, v6, 0x14

    .line 315
    .line 316
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    shr-int/lit8 v7, v7, 0x16

    .line 321
    .line 322
    sub-int/2addr v8, v7

    .line 323
    invoke-static {v6, v8, v0}, LVa/na;->q0(IIC)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    if-eqz v0, :cond_3

    .line 336
    .line 337
    move v8, v14

    .line 338
    goto :goto_4

    .line 339
    :sswitch_8
    invoke-static {v6}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    add-int/lit8 v0, v0, -0x30

    .line 344
    .line 345
    int-to-char v0, v0

    .line 346
    invoke-static {v7, v5}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 347
    .line 348
    .line 349
    move-result v6

    .line 350
    rsub-int/lit8 v6, v6, 0x23

    .line 351
    .line 352
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 353
    .line 354
    .line 355
    move-result v7

    .line 356
    shr-int/lit8 v7, v7, 0x10

    .line 357
    .line 358
    rsub-int/lit8 v7, v7, 0xb

    .line 359
    .line 360
    invoke-static {v6, v7, v0}, LVa/na;->q0(IIC)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-eqz v0, :cond_3

    .line 373
    .line 374
    move v8, v13

    .line 375
    goto :goto_4

    .line 376
    :sswitch_9
    const-string v0, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000"

    .line 377
    .line 378
    const/16 v6, 0x17

    .line 379
    .line 380
    const/16 v7, 0xd

    .line 381
    .line 382
    filled-new-array {v6, v7, v5, v14}, [I

    .line 383
    .line 384
    .line 385
    move-result-object v6

    .line 386
    invoke-static {v0, v6, v4}, LVa/na;->Y(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    xor-int/2addr v0, v4

    .line 399
    if-eq v0, v4, :cond_3

    .line 400
    .line 401
    goto/16 :goto_2

    .line 402
    .line 403
    :cond_3
    :goto_3
    const/4 v8, -0x1

    .line 404
    :goto_4
    packed-switch v8, :pswitch_data_0

    .line 405
    .line 406
    .line 407
    new-instance v0, LVa/k8;

    .line 408
    .line 409
    const-string v6, "\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"

    .line 410
    .line 411
    const/16 v7, 0x29

    .line 412
    .line 413
    filled-new-array {v7, v10, v5, v5}, [I

    .line 414
    .line 415
    .line 416
    move-result-object v7

    .line 417
    invoke-static {v6, v7, v5}, LVa/na;->Y(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v6

    .line 421
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v6
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 425
    move-object/from16 v7, p1

    .line 426
    .line 427
    move-object/from16 v8, p5

    .line 428
    .line 429
    :try_start_5
    invoke-direct {v0, v7, v8, v6, v2}, LVa/k8;-><init>(LVa/y7;LVa/x8;Ljava/lang/String;Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v7}, LVa/y7;->f()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v6

    .line 436
    invoke-virtual {v0, v6}, LVa/j8;->d(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    return-object v3

    .line 440
    :catch_1
    move-exception v0

    .line 441
    goto/16 :goto_5

    .line 442
    .line 443
    :pswitch_0
    move-object/from16 v7, p1

    .line 444
    .line 445
    sget v0, LVa/na;->S:I

    .line 446
    .line 447
    add-int/lit8 v6, v0, 0x77

    .line 448
    .line 449
    rem-int/lit16 v8, v6, 0x80

    .line 450
    .line 451
    sput v8, LVa/na;->R:I

    .line 452
    .line 453
    rem-int/lit8 v6, v6, 0x2

    .line 454
    .line 455
    if-nez v6, :cond_5

    .line 456
    .line 457
    iget-object v2, v1, LVa/na;->N:Ljava/lang/Object;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 458
    .line 459
    add-int/lit8 v0, v0, 0x4b

    .line 460
    .line 461
    rem-int/lit16 v4, v0, 0x80

    .line 462
    .line 463
    sput v4, LVa/na;->R:I

    .line 464
    .line 465
    rem-int/lit8 v0, v0, 0x2

    .line 466
    .line 467
    if-nez v0, :cond_4

    .line 468
    .line 469
    return-object v2

    .line 470
    :cond_4
    throw v3

    .line 471
    :cond_5
    :try_start_6
    throw v3

    .line 472
    :pswitch_1
    move-object/from16 v7, p1

    .line 473
    .line 474
    sget v0, LVa/na;->S:I

    .line 475
    .line 476
    add-int/lit8 v0, v0, 0x7b

    .line 477
    .line 478
    rem-int/lit16 v6, v0, 0x80

    .line 479
    .line 480
    sput v6, LVa/na;->R:I

    .line 481
    .line 482
    rem-int/lit8 v0, v0, 0x2

    .line 483
    .line 484
    iget-object v6, v1, LVa/na;->O:LVa/na;

    .line 485
    .line 486
    if-eqz v0, :cond_6

    .line 487
    .line 488
    const/16 v0, 0x34

    .line 489
    .line 490
    div-int/2addr v0, v5

    .line 491
    :cond_6
    return-object v6

    .line 492
    :pswitch_2
    move-object/from16 v7, p1

    .line 493
    .line 494
    sget v0, LVa/na;->R:I

    .line 495
    .line 496
    add-int/lit8 v6, v0, 0x61

    .line 497
    .line 498
    rem-int/lit16 v8, v6, 0x80

    .line 499
    .line 500
    sput v8, LVa/na;->S:I

    .line 501
    .line 502
    rem-int/lit8 v6, v6, 0x2

    .line 503
    .line 504
    if-eqz v6, :cond_7

    .line 505
    .line 506
    add-int/2addr v0, v12

    .line 507
    rem-int/lit16 v0, v0, 0x80

    .line 508
    .line 509
    sput v0, LVa/na;->S:I

    .line 510
    .line 511
    iget-object v0, v1, LVa/na;->M:Ljava/util/Map;

    .line 512
    .line 513
    return-object v0

    .line 514
    :cond_7
    throw v3

    .line 515
    :pswitch_3
    move-object/from16 v7, p1

    .line 516
    .line 517
    invoke-virtual {v1}, LVa/na;->v0()Z

    .line 518
    .line 519
    .line 520
    move-result v0

    .line 521
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    return-object v0

    .line 526
    :pswitch_4
    move-object/from16 v7, p1

    .line 527
    .line 528
    sget v0, LVa/na;->S:I

    .line 529
    .line 530
    add-int/lit8 v0, v0, 0x43

    .line 531
    .line 532
    rem-int/lit16 v6, v0, 0x80

    .line 533
    .line 534
    sput v6, LVa/na;->R:I

    .line 535
    .line 536
    rem-int/lit8 v0, v0, 0x2

    .line 537
    .line 538
    if-eqz v0, :cond_8

    .line 539
    .line 540
    const/16 v0, 0x2d

    .line 541
    .line 542
    div-int/2addr v0, v5

    .line 543
    :cond_8
    add-int/2addr v6, v13

    .line 544
    rem-int/lit16 v0, v6, 0x80

    .line 545
    .line 546
    sput v0, LVa/na;->S:I

    .line 547
    .line 548
    rem-int/lit8 v6, v6, 0x2

    .line 549
    .line 550
    if-eqz v6, :cond_9

    .line 551
    .line 552
    iget-object v0, v1, LVa/na;->L:Ljava/util/Collection;

    .line 553
    .line 554
    return-object v0

    .line 555
    :cond_9
    throw v3

    .line 556
    :pswitch_5
    move-object/from16 v7, p1

    .line 557
    .line 558
    invoke-virtual {v1}, LVa/na;->u0()Z

    .line 559
    .line 560
    .line 561
    move-result v0

    .line 562
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    return-object v0

    .line 567
    :pswitch_6
    move-object/from16 v7, p1

    .line 568
    .line 569
    invoke-virtual {v1}, LVa/na;->t0()Ljava/lang/reflect/Field;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    return-object v0

    .line 574
    :pswitch_7
    move-object/from16 v7, p1

    .line 575
    .line 576
    invoke-virtual {v1}, LVa/na;->w0()Z

    .line 577
    .line 578
    .line 579
    move-result v0

    .line 580
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    return-object v0

    .line 585
    :pswitch_8
    move-object/from16 v7, p1

    .line 586
    .line 587
    const-class v0, Ljava/lang/Object;

    .line 588
    .line 589
    move-object/from16 v6, p3

    .line 590
    .line 591
    invoke-static {v6, v5, v0}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-virtual {v1, v0}, LVa/na;->r0(Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    return-object v3

    .line 599
    :pswitch_9
    move-object/from16 v7, p1

    .line 600
    .line 601
    invoke-virtual {v1}, LVa/na;->s0()Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 605
    return-object v0

    .line 606
    :goto_5
    invoke-virtual {v7}, LVa/y7;->f()Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v6

    .line 610
    new-instance v7, Ljava/lang/StringBuilder;

    .line 611
    .line 612
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 613
    .line 614
    .line 615
    const/16 v8, 0x38

    .line 616
    .line 617
    const/16 v9, 0x35

    .line 618
    .line 619
    filled-new-array {v8, v9, v5, v5}, [I

    .line 620
    .line 621
    .line 622
    move-result-object v8

    .line 623
    const-string v9, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001"

    .line 624
    .line 625
    invoke-static {v9, v8, v5}, LVa/na;->Y(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v8

    .line 629
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v8

    .line 633
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    const/16 v2, 0x6d

    .line 640
    .line 641
    filled-new-array {v2, v4, v5, v5}, [I

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    const-string v5, "\u0001"

    .line 646
    .line 647
    invoke-static {v5, v2, v4}, LVa/na;->Y(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    invoke-static {v6, v2, v0}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 663
    .line 664
    .line 665
    return-object v3

    .line 666
    nop

    .line 667
    :sswitch_data_0
    .sparse-switch
        -0x7989996c -> :sswitch_9
        -0x630f2df5 -> :sswitch_8
        -0x4a77a9da -> :sswitch_7
        0x5fd17d2 -> :sswitch_6
        0x19a0ab68 -> :sswitch_5
        0x29c22ba0 -> :sswitch_4
        0x53d8522f -> :sswitch_3
        0x746c4744 -> :sswitch_2
        0x754a37bb -> :sswitch_1
        0x7ab74df0 -> :sswitch_0
    .end sparse-switch

    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final r0(Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget v0, LVa/na;->R:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x25

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/na;->S:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, LVa/na;->w0()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0xf

    .line 18
    .line 19
    div-int/lit8 v1, v1, 0x0

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0}, LVa/na;->w0()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    :goto_0
    sget v0, LVa/na;->S:I

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x13

    .line 33
    .line 34
    rem-int/lit16 v0, v0, 0x80

    .line 35
    .line 36
    sput v0, LVa/na;->R:I

    .line 37
    .line 38
    :try_start_0
    iget-object v0, p0, LVa/na;->K:Ljava/lang/reflect/Field;

    .line 39
    .line 40
    iget-object v1, p0, LVa/na;->N:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catch_0
    :cond_1
    sget p1, LVa/na;->S:I

    .line 47
    .line 48
    add-int/lit8 p1, p1, 0x67

    .line 49
    .line 50
    rem-int/lit16 v0, p1, 0x80

    .line 51
    .line 52
    sput v0, LVa/na;->R:I

    .line 53
    .line 54
    rem-int/lit8 p1, p1, 0x2

    .line 55
    .line 56
    if-nez p1, :cond_2

    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    const/4 p1, 0x0

    .line 60
    throw p1
.end method

.method public final s0()Ljava/lang/Object;
    .locals 3

    .line 1
    sget v0, LVa/na;->S:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x55

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/na;->R:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/na;->N:Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, LVa/na;->w0()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v2, 0x42

    .line 20
    .line 21
    div-int/lit8 v2, v2, 0x0

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p0}, LVa/na;->w0()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    :goto_0
    :try_start_0
    iget-object v0, p0, LVa/na;->K:Ljava/lang/reflect/Field;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    return-object v0

    .line 39
    :cond_1
    invoke-virtual {p0}, LVa/na;->u0()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0}, LVa/na;->v0()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catch_0
    :cond_2
    const/4 v0, 0x0

    .line 53
    return-object v0

    .line 54
    :cond_3
    :goto_1
    sget v0, LVa/na;->S:I

    .line 55
    .line 56
    add-int/lit8 v0, v0, 0x2b

    .line 57
    .line 58
    rem-int/lit16 v0, v0, 0x80

    .line 59
    .line 60
    sput v0, LVa/na;->R:I

    .line 61
    .line 62
    return-object v1
.end method

.method public final t0()Ljava/lang/reflect/Field;
    .locals 1

    .line 1
    sget v0, LVa/na;->S:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/na;->R:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x69

    .line 10
    .line 11
    rem-int/lit16 v0, v0, 0x80

    .line 12
    .line 13
    sput v0, LVa/na;->S:I

    .line 14
    .line 15
    iget-object v0, p0, LVa/na;->K:Ljava/lang/reflect/Field;

    .line 16
    .line 17
    return-object v0
.end method

.method public final u0()Z
    .locals 4

    .line 1
    sget v0, LVa/na;->S:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/na;->R:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iget-object v3, p0, LVa/na;->L:Ljava/util/Collection;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/16 v0, 0x62

    .line 17
    .line 18
    div-int/2addr v0, v2

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    if-eqz v3, :cond_1

    .line 23
    .line 24
    :goto_0
    add-int/lit8 v1, v1, 0x75

    .line 25
    .line 26
    rem-int/lit16 v1, v1, 0x80

    .line 27
    .line 28
    sput v1, LVa/na;->S:I

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    return v0

    .line 32
    :cond_1
    return v2
.end method

.method public final v0()Z
    .locals 4

    .line 1
    sget v0, LVa/na;->S:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/na;->R:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iget-object v3, p0, LVa/na;->M:Ljava/util/Map;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/16 v0, 0x57

    .line 17
    .line 18
    div-int/2addr v0, v2

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    if-eqz v3, :cond_1

    .line 23
    .line 24
    :goto_0
    add-int/lit8 v1, v1, 0x4b

    .line 25
    .line 26
    rem-int/lit16 v1, v1, 0x80

    .line 27
    .line 28
    sput v1, LVa/na;->S:I

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    return v0

    .line 32
    :cond_1
    return v2
.end method

.method public final w0()Z
    .locals 2

    .line 1
    sget v0, LVa/na;->R:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x13

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/na;->S:I

    .line 8
    .line 9
    iget-object v1, p0, LVa/na;->K:Ljava/lang/reflect/Field;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x29

    .line 14
    .line 15
    rem-int/lit16 v0, v0, 0x80

    .line 16
    .line 17
    sput v0, LVa/na;->R:I

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method
