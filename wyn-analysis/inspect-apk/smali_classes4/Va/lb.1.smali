.class public LVa/lb;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:[C

.field public static e:I = 0x0

.field public static f:I = 0x1


# instance fields
.field public final a:J

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x83

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/lb;->d:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        -0xa57s
        0x4630s
        -0x6d58s
        -0x10e5s
        0x3b8ds
        0x7419s
        0x69s
        -0x4c05s
        0x6762s
        0x1afbs
        0x593as
        -0x1543s
        0x3e32s
        0x43bds
        -0x4c1as
        0x62s
        -0x2b1bs
        -0x5693s
        0x7dc4s
        0x75s
        -0x4c1fs
        0x6774s
        0x75s
        -0x4c15s
        0x74s
        0x6ds
        -0x4c19s
        0x6774s
        0x1afds
        -0x31b4s
        -0x3f0as
        0x7372s
        -0x581bs
        -0x258as
        0xedds
        0x4152s
        -0xa38s
        0x2857s
        0x5caes
        -0x70dfs
        -0x3c52s
        0x7631s
        -0x7b70s
        0x3717s
        -0x1c7bs
        -0x61e5s
        0x4abes
        0x530s
        -0x4e5bs
        0x6es
        -0x4c01s
        0x6771s
        0x1aees
        0x61s
        -0x4c14s
        0x6761s
        0x1ac7s
        -0x31b7s
        -0x7e3as
        0x3559s
        -0x1734s
        -0x63e1s
        0x4faas
        0x33cs
        -0x4949s
        0x6a02s
        0x6ds
        -0x4c04s
        0x6774s
        0x1aecs
        -0x17b2s
        0x5be3s
        -0x70b2s
        -0xd1es
        0x264es
        0x69cbs
        -0x22aas
        0xc3s
        0x7436s
        -0x586bs
        -0x14c6s
        0x5ea6s
        -0x7de6s
        -0xa7es
        0x390cs
        0x6c83s
        -0x2f38s
        0x462s
        0x77f1s
        -0x448es
        -0x1123s
        0x5246s
        -0x7a35s
        -0x36a8s
        0x3cbds
        0x72f2s
        -0x3eb3s
        0x15d5s
        0x6840s
        -0x431bs
        -0xcc1s
        0x47e6s
        -0x6595s
        -0x116ds
        0x3d16s
        0x7189s
        -0x3bf8s
        0x18f7s
        0x6f32s
        -0x5c5es
        -0x9c5s
        0x4a56s
        -0x6161s
        -0x12bds
        0x21ces
        0x7463s
        -0x3702s
        0x1f27s
        0x53e5s
        -0x59fcs
        -0x570s
        0x4909s
        -0x6231s
        -0x2fdds
        0x24b0s
        0x7b67s
        -0x3056s
        0x3c1s
        0x565as
        -0x5537s
        -0x6a5s
    .end array-data
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p3, p0, LVa/lb;->b:Ljava/lang/Object;

    .line 3
    iput-wide p1, p0, LVa/lb;->a:J

    .line 4
    new-instance p1, LVa/Aa;

    .line 5
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 6
    iput p5, p1, LVa/Aa;->a:I

    .line 7
    iput-object p4, p1, LVa/Aa;->b:Ljava/lang/String;

    .line 8
    iput-object p1, p0, LVa/lb;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LVa/H;J)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, LVa/lb;->b:Ljava/lang/Object;

    .line 11
    iput-object p2, p0, LVa/lb;->c:Ljava/lang/Object;

    .line 12
    iput-wide p3, p0, LVa/lb;->a:J

    .line 13
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    return-void
.end method

.method public static a(IIC)Ljava/lang/String;
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
    sget-object v3, LVa/lb;->d:[C

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
    const-wide v7, 0x1db6ce08bc30b388L

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

.method public static b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, "\u223f\u32f1\ud03e\uf204"

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, [C

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, [C

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, [C

    .line 20
    .line 21
    sget-object v1, LVa/a;->r:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v1

    .line 24
    :try_start_0
    invoke-virtual {p1}, [C->clone()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, [C

    .line 29
    .line 30
    invoke-virtual {v0}, [C->clone()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, [C

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    aget-char v3, p1, v2

    .line 38
    .line 39
    xor-int/2addr p0, v3

    .line 40
    int-to-char p0, p0

    .line 41
    aput-char p0, p1, v2

    .line 42
    .line 43
    const/4 p0, 0x2

    .line 44
    aget-char v3, v0, p0

    .line 45
    .line 46
    int-to-char p3, p3

    .line 47
    add-int/2addr v3, p3

    .line 48
    int-to-char p3, v3

    .line 49
    aput-char p3, v0, p0

    .line 50
    .line 51
    array-length p0, p2

    .line 52
    new-array p3, p0, [C

    .line 53
    .line 54
    sput v2, LVa/a;->q:I

    .line 55
    .line 56
    :goto_0
    sget v3, LVa/a;->q:I

    .line 57
    .line 58
    if-ge v3, p0, :cond_0

    .line 59
    .line 60
    add-int/lit8 v4, v3, 0x2

    .line 61
    .line 62
    rem-int/lit8 v4, v4, 0x4

    .line 63
    .line 64
    add-int/lit8 v5, v3, 0x3

    .line 65
    .line 66
    rem-int/lit8 v5, v5, 0x4

    .line 67
    .line 68
    rem-int/lit8 v6, v3, 0x4

    .line 69
    .line 70
    aget-char v6, p1, v6

    .line 71
    .line 72
    mul-int/lit16 v6, v6, 0x7fce

    .line 73
    .line 74
    aget-char v4, v0, v4

    .line 75
    .line 76
    add-int/2addr v6, v4

    .line 77
    const v7, 0xffff

    .line 78
    .line 79
    .line 80
    rem-int/2addr v6, v7

    .line 81
    int-to-char v6, v6

    .line 82
    aget-char v8, p1, v5

    .line 83
    .line 84
    mul-int/lit16 v8, v8, 0x7fce

    .line 85
    .line 86
    add-int/2addr v8, v4

    .line 87
    div-int/2addr v8, v7

    .line 88
    int-to-char v4, v8

    .line 89
    aput-char v4, v0, v5

    .line 90
    .line 91
    aput-char v6, p1, v5

    .line 92
    .line 93
    aget-char v4, p2, v3

    .line 94
    .line 95
    xor-int/2addr v4, v6

    .line 96
    int-to-long v4, v4

    .line 97
    const-wide v6, -0xdfb2fc1cd0eddc1L    # -1.7348047359012664E241

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    xor-long/2addr v4, v6

    .line 103
    int-to-long v6, v2

    .line 104
    xor-long/2addr v4, v6

    .line 105
    xor-long/2addr v4, v6

    .line 106
    long-to-int v4, v4

    .line 107
    int-to-char v4, v4

    .line 108
    aput-char v4, p3, v3

    .line 109
    .line 110
    add-int/lit8 v3, v3, 0x1

    .line 111
    .line 112
    sput v3, LVa/a;->q:I

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :catchall_0
    move-exception p0

    .line 116
    goto :goto_1

    .line 117
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 118
    .line 119
    invoke-direct {p0, p3}, Ljava/lang/String;-><init>([C)V

    .line 120
    .line 121
    .line 122
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    return-object p0

    .line 124
    :goto_1
    monitor-exit v1

    .line 125
    throw p0
.end method


# virtual methods
.method public c(Lorg/json/JSONObject;ZZZ)Lorg/json/JSONObject;
    .locals 34

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/16 v0, 0x1e

    .line 4
    .line 5
    const/16 v5, 0x18

    .line 6
    .line 7
    const/16 v6, 0x16

    .line 8
    .line 9
    iget-wide v8, v1, LVa/lb;->a:J

    .line 10
    .line 11
    const-string v10, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001"

    .line 12
    .line 13
    sget v11, LVa/lb;->f:I

    .line 14
    .line 15
    add-int/lit8 v11, v11, 0x25

    .line 16
    .line 17
    rem-int/lit16 v12, v11, 0x80

    .line 18
    .line 19
    sput v12, LVa/lb;->e:I

    .line 20
    .line 21
    const/4 v12, 0x2

    .line 22
    rem-int/2addr v11, v12

    .line 23
    const/4 v13, 0x0

    .line 24
    if-eqz v11, :cond_0

    .line 25
    .line 26
    const/16 v11, 0x36

    .line 27
    .line 28
    div-int/2addr v11, v13

    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    if-nez p1, :cond_1

    .line 33
    .line 34
    :goto_0
    new-instance v11, Lorg/json/JSONObject;

    .line 35
    .line 36
    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 37
    .line 38
    .line 39
    sget v14, LVa/lb;->f:I

    .line 40
    .line 41
    add-int/lit8 v14, v14, 0x17

    .line 42
    .line 43
    rem-int/lit16 v14, v14, 0x80

    .line 44
    .line 45
    sput v14, LVa/lb;->e:I

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move-object/from16 v11, p1

    .line 49
    .line 50
    :goto_1
    invoke-static {v11}, LVa/Ab;->u(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    const v14, 0xf5c8

    .line 55
    .line 56
    .line 57
    invoke-static {v13}, Landroid/graphics/Color;->green(I)I

    .line 58
    .line 59
    .line 60
    move-result v15

    .line 61
    sub-int/2addr v14, v15

    .line 62
    int-to-char v14, v14

    .line 63
    const-string v15, ""

    .line 64
    .line 65
    const-wide/16 v16, -0x1

    .line 66
    .line 67
    invoke-static {v15, v13, v13}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const/16 v3, 0x30

    .line 72
    .line 73
    invoke-static {v15, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 74
    .line 75
    .line 76
    move-result v18

    .line 77
    const/16 v19, 0x5

    .line 78
    .line 79
    const/16 v20, 0x61

    .line 80
    .line 81
    rsub-int/lit8 v7, v18, 0x5

    .line 82
    .line 83
    invoke-static {v2, v7, v14}, LVa/lb;->a(IIC)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    sget v7, LVa/H;->j:I

    .line 92
    .line 93
    iget-object v14, v1, LVa/lb;->c:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v14, LVa/H;

    .line 96
    .line 97
    const/16 v18, 0x59

    .line 98
    .line 99
    iget-object v4, v14, LVa/H;->d:Ljava/lang/String;

    .line 100
    .line 101
    add-int/lit8 v7, v7, 0x69

    .line 102
    .line 103
    rem-int/lit16 v7, v7, 0x80

    .line 104
    .line 105
    sput v7, LVa/H;->k:I

    .line 106
    .line 107
    invoke-virtual {v11, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 108
    .line 109
    .line 110
    sget v2, LVa/H;->j:I

    .line 111
    .line 112
    add-int/lit8 v2, v2, 0x29

    .line 113
    .line 114
    rem-int/lit16 v2, v2, 0x80

    .line 115
    .line 116
    sput v2, LVa/H;->k:I

    .line 117
    .line 118
    iget-object v4, v14, LVa/H;->f:Ljava/lang/String;

    .line 119
    .line 120
    add-int/lit8 v2, v2, 0x2b

    .line 121
    .line 122
    rem-int/lit16 v7, v2, 0x80

    .line 123
    .line 124
    sput v7, LVa/H;->j:I

    .line 125
    .line 126
    rem-int/2addr v2, v12

    .line 127
    if-eqz v2, :cond_2

    .line 128
    .line 129
    const/16 v2, 0x33

    .line 130
    .line 131
    div-int/2addr v2, v13

    .line 132
    :cond_2
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    const-wide/16 v21, 0x0

    .line 137
    .line 138
    if-nez v2, :cond_3

    .line 139
    .line 140
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 141
    .line 142
    .line 143
    move-result-wide v23

    .line 144
    cmp-long v2, v23, v21

    .line 145
    .line 146
    add-int/lit8 v2, v2, -0x1

    .line 147
    .line 148
    int-to-char v2, v2

    .line 149
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 150
    .line 151
    .line 152
    move-result v23

    .line 153
    shr-int/lit8 v23, v23, 0x10

    .line 154
    .line 155
    const/16 p1, 0x4

    .line 156
    .line 157
    add-int/lit8 v7, v23, 0x6

    .line 158
    .line 159
    invoke-static {v13}, Landroid/os/Process;->getThreadPriority(I)I

    .line 160
    .line 161
    .line 162
    move-result v23

    .line 163
    add-int/lit8 v23, v23, 0x14

    .line 164
    .line 165
    shr-int/lit8 v23, v23, 0x6

    .line 166
    .line 167
    move/from16 v24, v12

    .line 168
    .line 169
    add-int/lit8 v12, v23, 0x4

    .line 170
    .line 171
    invoke-static {v7, v12, v2}, LVa/lb;->a(IIC)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {v11, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 180
    .line 181
    .line 182
    sget v2, LVa/lb;->f:I

    .line 183
    .line 184
    add-int/lit8 v2, v2, 0x4f

    .line 185
    .line 186
    rem-int/lit16 v2, v2, 0x80

    .line 187
    .line 188
    sput v2, LVa/lb;->e:I

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_3
    move/from16 v24, v12

    .line 192
    .line 193
    const/16 p1, 0x4

    .line 194
    .line 195
    :goto_2
    if-eqz p3, :cond_12

    .line 196
    .line 197
    cmp-long v2, v8, v21

    .line 198
    .line 199
    const/16 v4, 0xa

    .line 200
    .line 201
    if-lez v2, :cond_4

    .line 202
    .line 203
    invoke-static {v13}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    rsub-int v2, v2, 0x5956

    .line 208
    .line 209
    int-to-char v2, v2

    .line 210
    invoke-static {v13, v13}, Landroid/view/View;->resolveSize(II)I

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    rsub-int/lit8 v7, v7, 0xa

    .line 215
    .line 216
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 217
    .line 218
    .line 219
    move-result v12

    .line 220
    shr-int/lit8 v12, v12, 0x10

    .line 221
    .line 222
    add-int/lit8 v12, v12, 0x4

    .line 223
    .line 224
    invoke-static {v7, v12, v2}, LVa/lb;->a(IIC)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-virtual {v11, v2, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 233
    .line 234
    .line 235
    :cond_4
    const v2, 0xb386

    .line 236
    .line 237
    .line 238
    invoke-static {v15, v3, v13, v13}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 239
    .line 240
    .line 241
    move-result v7

    .line 242
    add-int/2addr v7, v2

    .line 243
    int-to-char v2, v7

    .line 244
    invoke-static {v13, v13}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 245
    .line 246
    .line 247
    move-result v7

    .line 248
    add-int/lit8 v7, v7, 0xe

    .line 249
    .line 250
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    shr-int/lit8 v8, v8, 0x10

    .line 255
    .line 256
    rsub-int/lit8 v8, v8, 0x5

    .line 257
    .line 258
    invoke-static {v7, v8, v2}, LVa/lb;->a(IIC)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    sget v7, LVa/H;->k:I

    .line 267
    .line 268
    add-int/lit8 v7, v7, 0x3f

    .line 269
    .line 270
    rem-int/lit16 v8, v7, 0x80

    .line 271
    .line 272
    sput v8, LVa/H;->j:I

    .line 273
    .line 274
    rem-int/lit8 v7, v7, 0x2

    .line 275
    .line 276
    if-nez v7, :cond_11

    .line 277
    .line 278
    iget-boolean v7, v14, LVa/H;->b:Z

    .line 279
    .line 280
    add-int/lit8 v8, v8, 0x67

    .line 281
    .line 282
    rem-int/lit16 v12, v8, 0x80

    .line 283
    .line 284
    sput v12, LVa/H;->k:I

    .line 285
    .line 286
    rem-int/lit8 v8, v8, 0x2

    .line 287
    .line 288
    if-eqz v8, :cond_10

    .line 289
    .line 290
    invoke-virtual {v11, v2, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 291
    .line 292
    .line 293
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    shr-int/lit8 v2, v2, 0x10

    .line 298
    .line 299
    rsub-int v2, v2, 0x1246

    .line 300
    .line 301
    int-to-char v2, v2

    .line 302
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 303
    .line 304
    .line 305
    move-result v7

    .line 306
    shr-int/lit8 v7, v7, 0x10

    .line 307
    .line 308
    const v8, 0x3f584cef

    .line 309
    .line 310
    .line 311
    sub-int/2addr v8, v7

    .line 312
    const-string v7, "\uefd2\u584c\u463f\u9912"

    .line 313
    .line 314
    const-string v12, "\u3685\u1bfe\u4b16"

    .line 315
    .line 316
    invoke-static {v2, v7, v12, v8}, LVa/lb;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    sget v7, LVa/H;->k:I

    .line 325
    .line 326
    add-int/lit8 v7, v7, 0x61

    .line 327
    .line 328
    rem-int/lit16 v7, v7, 0x80

    .line 329
    .line 330
    sput v7, LVa/H;->j:I

    .line 331
    .line 332
    iget-object v8, v14, LVa/H;->h:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v8, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityDeviceIdType;

    .line 335
    .line 336
    add-int/lit8 v7, v7, 0x63

    .line 337
    .line 338
    rem-int/lit16 v12, v7, 0x80

    .line 339
    .line 340
    sput v12, LVa/H;->k:I

    .line 341
    .line 342
    rem-int/lit8 v7, v7, 0x2

    .line 343
    .line 344
    if-eqz v7, :cond_f

    .line 345
    .line 346
    invoke-virtual {v11, v2, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 347
    .line 348
    .line 349
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    const/4 v7, 0x0

    .line 354
    cmpl-float v2, v2, v7

    .line 355
    .line 356
    int-to-char v2, v2

    .line 357
    invoke-static {v13}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 358
    .line 359
    .line 360
    move-result v8

    .line 361
    cmpl-float v8, v8, v7

    .line 362
    .line 363
    rsub-int/lit8 v8, v8, 0x13

    .line 364
    .line 365
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 366
    .line 367
    .line 368
    move-result v12

    .line 369
    shr-int/lit8 v12, v12, 0x10

    .line 370
    .line 371
    move/from16 p3, v4

    .line 372
    .line 373
    const/4 v4, 0x3

    .line 374
    add-int/2addr v12, v4

    .line 375
    invoke-static {v8, v12, v2}, LVa/lb;->a(IIC)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    invoke-virtual {v14}, LVa/H;->c()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v8

    .line 387
    invoke-virtual {v11, v2, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 388
    .line 389
    .line 390
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 391
    .line 392
    .line 393
    move-result v2

    .line 394
    shr-int/2addr v2, v6

    .line 395
    int-to-char v2, v2

    .line 396
    invoke-static {v13, v13, v13}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 397
    .line 398
    .line 399
    move-result v8

    .line 400
    rsub-int/lit8 v8, v8, 0x16

    .line 401
    .line 402
    invoke-static {v13, v13}, Landroid/view/View;->resolveSize(II)I

    .line 403
    .line 404
    .line 405
    move-result v12

    .line 406
    add-int/lit8 v12, v12, 0x2

    .line 407
    .line 408
    invoke-static {v8, v12, v2}, LVa/lb;->a(IIC)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    sget v8, LVa/H;->k:I

    .line 417
    .line 418
    const/16 v12, 0x55

    .line 419
    .line 420
    add-int/2addr v8, v12

    .line 421
    rem-int/lit16 v12, v8, 0x80

    .line 422
    .line 423
    sput v12, LVa/H;->j:I

    .line 424
    .line 425
    rem-int/lit8 v8, v8, 0x2

    .line 426
    .line 427
    if-nez v8, :cond_e

    .line 428
    .line 429
    iget-boolean v8, v14, LVa/H;->a:Z

    .line 430
    .line 431
    add-int/lit8 v12, v12, 0x69

    .line 432
    .line 433
    rem-int/lit16 v12, v12, 0x80

    .line 434
    .line 435
    sput v12, LVa/H;->k:I

    .line 436
    .line 437
    invoke-virtual {v11, v2, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 438
    .line 439
    .line 440
    invoke-static {v15, v3, v13, v13}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 441
    .line 442
    .line 443
    move-result v2

    .line 444
    add-int/lit16 v2, v2, 0x31c4

    .line 445
    .line 446
    int-to-char v2, v2

    .line 447
    invoke-static {v13, v7, v7}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 448
    .line 449
    .line 450
    move-result v8

    .line 451
    cmpl-float v8, v8, v7

    .line 452
    .line 453
    const-string v12, "\ue26d\ua077\uc392\ued31"

    .line 454
    .line 455
    const-string v9, "\uc3bb\ucd0c"

    .line 456
    .line 457
    invoke-static {v2, v12, v9, v8}, LVa/lb;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 466
    .line 467
    .line 468
    move-result-object v8

    .line 469
    invoke-virtual {v8}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    .line 470
    .line 471
    .line 472
    move-result-object v8

    .line 473
    invoke-virtual {v8}, Ljava/util/TimeZone;->getRawOffset()I

    .line 474
    .line 475
    .line 476
    move-result v8

    .line 477
    int-to-double v8, v8

    .line 478
    const-wide v26, 0x414b774000000000L    # 3600000.0

    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    div-double v8, v8, v26

    .line 484
    .line 485
    invoke-virtual {v11, v2, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 486
    .line 487
    .line 488
    invoke-static {v15, v3, v13}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 489
    .line 490
    .line 491
    move-result v2

    .line 492
    add-int/lit16 v2, v2, 0x25ce

    .line 493
    .line 494
    int-to-char v2, v2

    .line 495
    const v8, 0x6c2a99d8

    .line 496
    .line 497
    .line 498
    invoke-static {v13, v13}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 499
    .line 500
    .line 501
    move-result v9

    .line 502
    sub-int/2addr v8, v9

    .line 503
    const-string v9, "\ud819\u2a99\ucd6c\uf525"

    .line 504
    .line 505
    const-string v12, "\u772c\u9f8a\ue446\u3393\u169f"

    .line 506
    .line 507
    invoke-static {v2, v9, v12, v8}, LVa/lb;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/IronSourceAdQuality;->getSDKVersion()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v8

    .line 519
    invoke-virtual {v11, v2, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 520
    .line 521
    .line 522
    invoke-static {v13, v13}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 523
    .line 524
    .line 525
    move-result v2

    .line 526
    int-to-char v2, v2

    .line 527
    invoke-static {v13, v13, v13, v13}, Landroid/graphics/Color;->argb(IIII)I

    .line 528
    .line 529
    .line 530
    move-result v8

    .line 531
    rsub-int/lit8 v8, v8, 0x18

    .line 532
    .line 533
    invoke-static {v13}, Landroid/graphics/Color;->green(I)I

    .line 534
    .line 535
    .line 536
    move-result v9

    .line 537
    const/4 v12, 0x1

    .line 538
    add-int/2addr v9, v12

    .line 539
    invoke-static {v8, v9, v2}, LVa/lb;->a(IIC)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    sget v8, LVa/a;->f:I

    .line 548
    .line 549
    add-int/lit8 v8, v8, 0x5b

    .line 550
    .line 551
    rem-int/lit16 v8, v8, 0x80

    .line 552
    .line 553
    sput v8, LVa/a;->g:I

    .line 554
    .line 555
    :try_start_0
    const-string v9, "\ufd30\u119a\u0785\udae1\ud2ba\uaa67\u0545\u5db9\uc3a8\u2ac5\u7273\ud26b\u2087\u2f2b\u0aaa\u5077\u1ed8\u95a4\ufe3b\uc303\u8cc9\ue16c\u538a\u4930\u7581\ucdc7\u0aaa\u5077\u1ed8\u95a4"

    .line 556
    .line 557
    invoke-static {v15, v13}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 558
    .line 559
    .line 560
    move-result v26
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 561
    const/16 v27, 0x7d

    .line 562
    .line 563
    rsub-int/lit8 v8, v26, 0x1e

    .line 564
    .line 565
    :try_start_1
    invoke-static {v8, v9}, LVa/a;->H(ILjava/lang/String;)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v8

    .line 569
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v8

    .line 573
    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    const v8, 0x5d6c4428

    .line 577
    .line 578
    .line 579
    const v9, 0xca07eee

    .line 580
    .line 581
    .line 582
    filled-new-array {v9, v8}, [I

    .line 583
    .line 584
    .line 585
    move-result-object v8

    .line 586
    invoke-static {v13}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 587
    .line 588
    .line 589
    move-result v9

    .line 590
    add-int/2addr v9, v12

    .line 591
    invoke-static {v9, v8}, LVa/a;->t(I[I)Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v8

    .line 595
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 599
    sget v8, LVa/a;->g:I

    .line 600
    .line 601
    add-int/lit8 v8, v8, 0x7d

    .line 602
    .line 603
    rem-int/lit16 v9, v8, 0x80

    .line 604
    .line 605
    sput v9, LVa/a;->f:I

    .line 606
    .line 607
    rem-int/lit8 v8, v8, 0x2

    .line 608
    .line 609
    if-eqz v8, :cond_5

    .line 610
    .line 611
    div-int/lit8 v8, v18, 0x0

    .line 612
    .line 613
    goto :goto_3

    .line 614
    :catch_0
    const/16 v27, 0x7d

    .line 615
    .line 616
    :catch_1
    :try_start_2
    new-array v0, v0, [I

    .line 617
    .line 618
    fill-array-data v0, :array_0

    .line 619
    .line 620
    .line 621
    invoke-static {v13}, Landroid/graphics/Color;->green(I)I

    .line 622
    .line 623
    .line 624
    move-result v8

    .line 625
    add-int/lit8 v8, v8, 0x3c

    .line 626
    .line 627
    invoke-static {v8, v0}, LVa/a;->t(I[I)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 636
    .line 637
    .line 638
    const-string v0, "\u5911\u3ed6"

    .line 639
    .line 640
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 641
    .line 642
    .line 643
    move-result v8

    .line 644
    shr-int/2addr v8, v6

    .line 645
    rsub-int/lit8 v8, v8, 0x1

    .line 646
    .line 647
    invoke-static {v8, v0}, LVa/a;->H(ILjava/lang/String;)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 655
    goto :goto_3

    .line 656
    :catch_2
    const v0, -0x2446ce3d

    .line 657
    .line 658
    .line 659
    const v8, 0x706f7a8d

    .line 660
    .line 661
    .line 662
    filled-new-array {v0, v8}, [I

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-static {v7, v7}, Landroid/graphics/PointF;->length(FF)F

    .line 667
    .line 668
    .line 669
    move-result v8

    .line 670
    cmpl-float v8, v8, v7

    .line 671
    .line 672
    rsub-int/lit8 v8, v8, 0x1

    .line 673
    .line 674
    invoke-static {v8, v0}, LVa/a;->t(I[I)Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    :cond_5
    :goto_3
    invoke-virtual {v11, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 683
    .line 684
    .line 685
    invoke-static {v3}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 686
    .line 687
    .line 688
    move-result v0

    .line 689
    rsub-int/lit8 v0, v0, 0x30

    .line 690
    .line 691
    int-to-char v0, v0

    .line 692
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 693
    .line 694
    .line 695
    move-result v2

    .line 696
    shr-int/lit8 v2, v2, 0x10

    .line 697
    .line 698
    add-int/lit8 v2, v2, 0x19

    .line 699
    .line 700
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 701
    .line 702
    .line 703
    move-result v8

    .line 704
    cmpl-float v8, v8, v7

    .line 705
    .line 706
    rsub-int/lit8 v8, v8, 0x6

    .line 707
    .line 708
    invoke-static {v2, v8, v0}, LVa/lb;->a(IIC)Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 717
    .line 718
    invoke-virtual {v11, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 719
    .line 720
    .line 721
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 722
    .line 723
    .line 724
    move-result-wide v8

    .line 725
    cmp-long v0, v8, v21

    .line 726
    .line 727
    const v2, 0xc09c

    .line 728
    .line 729
    .line 730
    sub-int/2addr v2, v0

    .line 731
    int-to-char v0, v2

    .line 732
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 733
    .line 734
    .line 735
    move-result-wide v8

    .line 736
    cmp-long v2, v8, v21

    .line 737
    .line 738
    add-int/lit8 v2, v2, 0x1d

    .line 739
    .line 740
    invoke-static {v13}, Landroid/os/Process;->getThreadPriority(I)I

    .line 741
    .line 742
    .line 743
    move-result v8

    .line 744
    add-int/lit8 v8, v8, 0x14

    .line 745
    .line 746
    shr-int/lit8 v8, v8, 0x6

    .line 747
    .line 748
    add-int/lit8 v8, v8, 0xc

    .line 749
    .line 750
    invoke-static {v2, v8, v0}, LVa/lb;->a(IIC)Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 759
    .line 760
    invoke-virtual {v11, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 761
    .line 762
    .line 763
    invoke-static {v13, v13}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 764
    .line 765
    .line 766
    move-result v0

    .line 767
    int-to-char v0, v0

    .line 768
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 769
    .line 770
    .line 771
    move-result v2

    .line 772
    shr-int/lit8 v2, v2, 0x8

    .line 773
    .line 774
    const-string v8, "\u0543\uf459\u5106\u837c"

    .line 775
    .line 776
    const-string v9, "\u6986\ua013\u75b9\u70da\udaa0\u84ca\ueba1\ua5de"

    .line 777
    .line 778
    invoke-static {v0, v8, v9, v2}, LVa/lb;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    const v2, 0x84f1

    .line 787
    .line 788
    .line 789
    invoke-static/range {v21 .. v22}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 790
    .line 791
    .line 792
    move-result v8

    .line 793
    add-int/2addr v8, v2

    .line 794
    int-to-char v2, v8

    .line 795
    invoke-static {v13}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 796
    .line 797
    .line 798
    move-result v8

    .line 799
    add-int/lit8 v8, v8, 0x2b

    .line 800
    .line 801
    invoke-static {v13, v13}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 802
    .line 803
    .line 804
    move-result v9

    .line 805
    rsub-int/lit8 v9, v9, 0x7

    .line 806
    .line 807
    invoke-static {v8, v9, v2}, LVa/lb;->a(IIC)Ljava/lang/String;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v2

    .line 815
    invoke-virtual {v11, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 816
    .line 817
    .line 818
    invoke-static {v15, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 819
    .line 820
    .line 821
    move-result v0

    .line 822
    rsub-int v0, v0, 0x6b11

    .line 823
    .line 824
    int-to-char v0, v0

    .line 825
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 826
    .line 827
    .line 828
    move-result-wide v8

    .line 829
    cmp-long v2, v8, v16

    .line 830
    .line 831
    const v8, 0x2887b387

    .line 832
    .line 833
    .line 834
    sub-int/2addr v8, v2

    .line 835
    const-string v2, "\u865e\u87b3\u1228\u366b"

    .line 836
    .line 837
    const-string v9, "\u8334\u7fb8\ud1f1"

    .line 838
    .line 839
    invoke-static {v0, v2, v9, v8}, LVa/lb;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    sget v2, LVa/qb;->e:I

    .line 848
    .line 849
    add-int/lit8 v2, v2, 0x4b

    .line 850
    .line 851
    rem-int/lit16 v2, v2, 0x80

    .line 852
    .line 853
    sput v2, LVa/qb;->d:I

    .line 854
    .line 855
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 856
    .line 857
    sget v8, LVa/qb;->d:I

    .line 858
    .line 859
    add-int/lit8 v8, v8, 0x5b

    .line 860
    .line 861
    rem-int/lit16 v9, v8, 0x80

    .line 862
    .line 863
    sput v9, LVa/qb;->e:I

    .line 864
    .line 865
    rem-int/lit8 v8, v8, 0x2

    .line 866
    .line 867
    if-nez v8, :cond_6

    .line 868
    .line 869
    div-int/lit8 v8, v20, 0x0

    .line 870
    .line 871
    :cond_6
    invoke-virtual {v11, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 872
    .line 873
    .line 874
    const-string v2, "\u631a\u57db\u6ddd\u47d1\uf83f\ubdb1\ua257\u8ed7\u1844\u9839"

    .line 875
    .line 876
    sget v0, LVa/a;->f:I

    .line 877
    .line 878
    add-int/lit8 v0, v0, 0x41

    .line 879
    .line 880
    rem-int/lit16 v0, v0, 0x80

    .line 881
    .line 882
    sput v0, LVa/a;->g:I

    .line 883
    .line 884
    invoke-static {v13, v13}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 885
    .line 886
    .line 887
    move-result v0

    .line 888
    rsub-int/lit8 v0, v0, 0x8

    .line 889
    .line 890
    const-string v8, "\u45b3\u8f16\ucfa1\u9d9c\u39bd\uf9f3\ud22d\ub74d"

    .line 891
    .line 892
    invoke-static {v0, v8}, LVa/a;->H(ILjava/lang/String;)Ljava/lang/String;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v8

    .line 900
    iget-object v0, v1, LVa/lb;->b:Ljava/lang/Object;

    .line 901
    .line 902
    move-object v9, v0

    .line 903
    check-cast v9, Landroid/content/Context;

    .line 904
    .line 905
    move/from16 v26, v7

    .line 906
    .line 907
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object v7

    .line 911
    :try_start_3
    const-string v0, "\u1fbe\ude2b"

    .line 912
    .line 913
    invoke-static {v15, v3, v13}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 914
    .line 915
    .line 916
    move-result v28
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_4

    .line 917
    move/from16 v29, v4

    .line 918
    .line 919
    add-int/lit8 v4, v28, 0x3

    .line 920
    .line 921
    :try_start_4
    invoke-static {v4, v0}, LVa/a;->H(ILjava/lang/String;)Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    invoke-virtual {v11, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_3

    .line 930
    .line 931
    .line 932
    move/from16 v28, v12

    .line 933
    .line 934
    goto :goto_5

    .line 935
    :catch_3
    move-exception v0

    .line 936
    goto :goto_4

    .line 937
    :catch_4
    move-exception v0

    .line 938
    move/from16 v29, v4

    .line 939
    .line 940
    :goto_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 941
    .line 942
    .line 943
    move-result-wide v30

    .line 944
    cmp-long v4, v30, v21

    .line 945
    .line 946
    rsub-int/lit8 v4, v4, 0x23

    .line 947
    .line 948
    move/from16 v28, v12

    .line 949
    .line 950
    const-string v12, "\ucc58\u7c84\u51b9\u65d0\uab51\uaacb\u96e7\uee75\u70e1\uda5a\u6146\u44c0\u6eb0\u222b\ud2ba\uaa67\u0944\u9657\u201f\ud7e1\u9fa3\u8b1a\ubf87\u7d7c\u3116\u27ce\u8efb\u0f1f\uf254\u9b87\u9580\u09a2\u4698\u866c"

    .line 951
    .line 952
    invoke-static {v4, v12}, LVa/a;->H(ILjava/lang/String;)Ljava/lang/String;

    .line 953
    .line 954
    .line 955
    move-result-object v4

    .line 956
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v4

    .line 960
    invoke-static {v8, v4, v0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 961
    .line 962
    .line 963
    :goto_5
    invoke-virtual {v9}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 964
    .line 965
    .line 966
    move-result-object v4

    .line 967
    :try_start_5
    const-string v0, "\u1b3d\u7d4e"

    .line 968
    .line 969
    invoke-static {v15}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 970
    .line 971
    .line 972
    move-result v12

    .line 973
    add-int/lit8 v12, v12, 0x2

    .line 974
    .line 975
    invoke-static {v12, v0}, LVa/a;->H(ILjava/lang/String;)Ljava/lang/String;

    .line 976
    .line 977
    .line 978
    move-result-object v0

    .line 979
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    move-result-object v0

    .line 983
    invoke-virtual {v4, v7}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    .line 984
    .line 985
    .line 986
    move-result-object v12

    .line 987
    invoke-virtual {v11, v0, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_5

    .line 988
    .line 989
    .line 990
    move/from16 v30, v6

    .line 991
    .line 992
    goto :goto_6

    .line 993
    :catch_5
    move-exception v0

    .line 994
    new-instance v12, Ljava/lang/StringBuilder;

    .line 995
    .line 996
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 997
    .line 998
    .line 999
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 1000
    .line 1001
    .line 1002
    move-result v30

    .line 1003
    shr-int/lit8 v30, v30, 0x8

    .line 1004
    .line 1005
    rsub-int/lit8 v3, v30, 0x34

    .line 1006
    .line 1007
    move/from16 v30, v6

    .line 1008
    .line 1009
    const-string v6, "\ucc58\u7c84\u51b9\u65d0\uab51\uaacb\u96e7\uee75\u70e1\uda5a\u6146\u44c0\u5af0\u8455\udc3d\u7cdc\u7506\udba9\u6048\u7d32\u1ed8\u95a4\u72ab\u0e55\u2d53\u7755\ud432\ub6a6\uf053\ub17a\u0b18\ud296\uaf2a\ue47d\u7104\ufb19\u88fc\u6ab4\uf28b\u1120\ub45b\ud0ce\u18eb\u19d9\u6ddd\u47d1\uf83f\ubdb1\ua257\u8ed7\u1844\u9839"

    .line 1010
    .line 1011
    invoke-static {v3, v6}, LVa/a;->H(ILjava/lang/String;)Ljava/lang/String;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v3

    .line 1015
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v3

    .line 1019
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v0

    .line 1026
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    invoke-static {v8, v0}, LVa/Ab;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1034
    .line 1035
    .line 1036
    :goto_6
    :try_start_6
    invoke-virtual {v4, v7, v13}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    const-string v3, "\uec32\u16c1"

    .line 1041
    .line 1042
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 1043
    .line 1044
    .line 1045
    move-result v6

    .line 1046
    shr-int/lit8 v6, v6, 0x8

    .line 1047
    .line 1048
    add-int/lit8 v6, v6, 0x2

    .line 1049
    .line 1050
    invoke-static {v6, v3}, LVa/a;->H(ILjava/lang/String;)Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v3

    .line 1054
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v3

    .line 1058
    iget v6, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 1059
    .line 1060
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v6

    .line 1064
    invoke-virtual {v11, v3, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1065
    .line 1066
    .line 1067
    const v3, -0x1f4263e3

    .line 1068
    .line 1069
    .line 1070
    const v6, -0x43bc517c

    .line 1071
    .line 1072
    .line 1073
    filled-new-array {v6, v3}, [I

    .line 1074
    .line 1075
    .line 1076
    move-result-object v3

    .line 1077
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 1078
    .line 1079
    .line 1080
    move-result v6

    .line 1081
    shr-int/lit8 v6, v6, 0x16

    .line 1082
    .line 1083
    add-int/lit8 v6, v6, 0x2

    .line 1084
    .line 1085
    invoke-static {v6, v3}, LVa/a;->t(I[I)Ljava/lang/String;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v3

    .line 1089
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v3

    .line 1093
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 1094
    .line 1095
    invoke-virtual {v11, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_6 .. :try_end_6} :catch_7
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_6

    .line 1096
    .line 1097
    .line 1098
    goto :goto_9

    .line 1099
    :catch_6
    move-exception v0

    .line 1100
    goto :goto_7

    .line 1101
    :catch_7
    move-exception v0

    .line 1102
    goto :goto_8

    .line 1103
    :goto_7
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1104
    .line 1105
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1106
    .line 1107
    .line 1108
    new-array v6, v5, [I

    .line 1109
    .line 1110
    fill-array-data v6, :array_1

    .line 1111
    .line 1112
    .line 1113
    invoke-static {v13}, Landroid/graphics/Color;->red(I)I

    .line 1114
    .line 1115
    .line 1116
    move-result v12

    .line 1117
    add-int/lit8 v12, v12, 0x2e

    .line 1118
    .line 1119
    invoke-static {v12, v6}, LVa/a;->t(I[I)Ljava/lang/String;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v6

    .line 1123
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v6

    .line 1127
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v0

    .line 1134
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v0

    .line 1141
    invoke-static {v8, v0}, LVa/Ab;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1142
    .line 1143
    .line 1144
    goto :goto_9

    .line 1145
    :goto_8
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1146
    .line 1147
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1148
    .line 1149
    .line 1150
    const/16 v6, 0x12

    .line 1151
    .line 1152
    new-array v6, v6, [I

    .line 1153
    .line 1154
    fill-array-data v6, :array_2

    .line 1155
    .line 1156
    .line 1157
    invoke-static {v13}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 1158
    .line 1159
    .line 1160
    move-result-wide v32

    .line 1161
    cmp-long v12, v32, v21

    .line 1162
    .line 1163
    rsub-int/lit8 v12, v12, 0x21

    .line 1164
    .line 1165
    invoke-static {v12, v6}, LVa/a;->t(I[I)Ljava/lang/String;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v6

    .line 1169
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v6

    .line 1173
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1174
    .line 1175
    .line 1176
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1177
    .line 1178
    .line 1179
    invoke-static {v13, v13, v13}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 1180
    .line 1181
    .line 1182
    move-result v6

    .line 1183
    add-int/lit8 v6, v6, 0xa

    .line 1184
    .line 1185
    invoke-static {v6, v2}, LVa/a;->H(ILjava/lang/String;)Ljava/lang/String;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v6

    .line 1189
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v6

    .line 1193
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v0

    .line 1200
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v0

    .line 1207
    invoke-static {v8, v0}, LVa/Ab;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1208
    .line 1209
    .line 1210
    :goto_9
    :try_start_7
    invoke-virtual {v4, v7, v13}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v0

    .line 1214
    const-string v3, "\uab51\uaacb"

    .line 1215
    .line 1216
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 1217
    .line 1218
    .line 1219
    move-result v6

    .line 1220
    int-to-byte v6, v6

    .line 1221
    rsub-int/lit8 v12, v6, 0x1

    .line 1222
    .line 1223
    invoke-static {v12, v3}, LVa/a;->H(ILjava/lang/String;)Ljava/lang/String;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v3

    .line 1227
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v3

    .line 1231
    invoke-virtual {v4, v0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v0

    .line 1235
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v0

    .line 1239
    invoke-virtual {v11, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_7
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_7 .. :try_end_7} :catch_9
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_8

    .line 1240
    .line 1241
    .line 1242
    sget v0, LVa/a;->f:I

    .line 1243
    .line 1244
    add-int/lit8 v0, v0, 0x35

    .line 1245
    .line 1246
    rem-int/lit16 v0, v0, 0x80

    .line 1247
    .line 1248
    sput v0, LVa/a;->g:I

    .line 1249
    .line 1250
    goto :goto_c

    .line 1251
    :catch_8
    move-exception v0

    .line 1252
    goto :goto_a

    .line 1253
    :catch_9
    move-exception v0

    .line 1254
    goto :goto_b

    .line 1255
    :goto_a
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1256
    .line 1257
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1258
    .line 1259
    .line 1260
    move/from16 v3, v30

    .line 1261
    .line 1262
    new-array v3, v3, [I

    .line 1263
    .line 1264
    fill-array-data v3, :array_3

    .line 1265
    .line 1266
    .line 1267
    invoke-static {v13}, Landroid/graphics/Color;->alpha(I)I

    .line 1268
    .line 1269
    .line 1270
    move-result v4

    .line 1271
    add-int/lit8 v4, v4, 0x2b

    .line 1272
    .line 1273
    invoke-static {v4, v3}, LVa/a;->t(I[I)Ljava/lang/String;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v3

    .line 1277
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v3

    .line 1281
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v0

    .line 1288
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1289
    .line 1290
    .line 1291
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v0

    .line 1295
    invoke-static {v8, v0}, LVa/Ab;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1296
    .line 1297
    .line 1298
    goto :goto_c

    .line 1299
    :goto_b
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1300
    .line 1301
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1302
    .line 1303
    .line 1304
    const/16 v4, 0x12

    .line 1305
    .line 1306
    new-array v4, v4, [I

    .line 1307
    .line 1308
    fill-array-data v4, :array_4

    .line 1309
    .line 1310
    .line 1311
    const/16 v6, 0x30

    .line 1312
    .line 1313
    invoke-static {v15, v6, v13, v13}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 1314
    .line 1315
    .line 1316
    move-result v12

    .line 1317
    add-int/lit8 v12, v12, 0x22

    .line 1318
    .line 1319
    invoke-static {v12, v4}, LVa/a;->t(I[I)Ljava/lang/String;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v4

    .line 1323
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v4

    .line 1327
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1331
    .line 1332
    .line 1333
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 1334
    .line 1335
    .line 1336
    move-result v4

    .line 1337
    shr-int/lit8 v4, v4, 0x10

    .line 1338
    .line 1339
    rsub-int/lit8 v4, v4, 0xa

    .line 1340
    .line 1341
    invoke-static {v4, v2}, LVa/a;->H(ILjava/lang/String;)Ljava/lang/String;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v2

    .line 1345
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v2

    .line 1349
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1350
    .line 1351
    .line 1352
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v0

    .line 1356
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1357
    .line 1358
    .line 1359
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v0

    .line 1363
    invoke-static {v8, v0}, LVa/Ab;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1364
    .line 1365
    .line 1366
    :goto_c
    const/16 v2, 0xb

    .line 1367
    .line 1368
    :try_start_8
    const-string v0, "\u6d0e\u7268\u3999\u823e\u2553\u68c3\u15fc\u8005\ue8a6\u3f13\u5a73\u268c\ub7f2\u9749\uf3d9\uff4a\u09bf\u1b72\ud485\ud5e5\u270a\u404d\u37ed\u2e32\u8e36\u23d7\u03b9\u0679\uc369\u9e66\u443e\u4ff1\u12ea\ue890\ud741\uf699"

    .line 1369
    .line 1370
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 1371
    .line 1372
    .line 1373
    move-result-wide v3

    .line 1374
    cmp-long v3, v3, v21

    .line 1375
    .line 1376
    rsub-int/lit8 v3, v3, 0x25

    .line 1377
    .line 1378
    invoke-static {v3, v0}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v0

    .line 1382
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v0

    .line 1386
    sget v3, LVa/a;->g:I

    .line 1387
    .line 1388
    add-int/lit8 v3, v3, 0x1

    .line 1389
    .line 1390
    rem-int/lit16 v4, v3, 0x80

    .line 1391
    .line 1392
    sput v4, LVa/a;->f:I

    .line 1393
    .line 1394
    rem-int/lit8 v3, v3, 0x2

    .line 1395
    .line 1396
    if-nez v3, :cond_8

    .line 1397
    .line 1398
    invoke-virtual {v9, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    .line 1399
    .line 1400
    .line 1401
    move-result v0

    .line 1402
    if-nez v0, :cond_7

    .line 1403
    .line 1404
    sget v0, LVa/a;->g:I

    .line 1405
    .line 1406
    add-int/lit8 v0, v0, 0x3d

    .line 1407
    .line 1408
    rem-int/lit16 v0, v0, 0x80

    .line 1409
    .line 1410
    sput v0, LVa/a;->f:I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 1411
    .line 1412
    sget v0, LVa/qb;->d:I

    .line 1413
    .line 1414
    add-int/lit8 v0, v0, 0x15

    .line 1415
    .line 1416
    rem-int/lit16 v0, v0, 0x80

    .line 1417
    .line 1418
    sput v0, LVa/qb;->e:I

    .line 1419
    .line 1420
    :try_start_9
    const-string v0, "\u0000\u0000\u0000\u0001"

    .line 1421
    .line 1422
    const/16 v3, 0xaf

    .line 1423
    .line 1424
    const/16 v4, 0x85

    .line 1425
    .line 1426
    move/from16 v7, p1

    .line 1427
    .line 1428
    move/from16 v6, v24

    .line 1429
    .line 1430
    filled-new-array {v3, v7, v4, v6}, [I

    .line 1431
    .line 1432
    .line 1433
    move-result-object v3

    .line 1434
    move/from16 v4, v28

    .line 1435
    .line 1436
    invoke-static {v0, v3, v4}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v0

    .line 1440
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v0

    .line 1444
    invoke-virtual {v9, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v0

    .line 1448
    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 1449
    .line 1450
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v0

    .line 1454
    const-string v3, "\ude84\ub631\u5715\ue27e"

    .line 1455
    .line 1456
    invoke-static/range {v21 .. v22}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 1457
    .line 1458
    .line 1459
    move-result v4

    .line 1460
    rsub-int/lit8 v4, v4, 0x3

    .line 1461
    .line 1462
    invoke-static {v4, v3}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v3

    .line 1466
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v3

    .line 1470
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getSupplicantState()Landroid/net/wifi/SupplicantState;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v4

    .line 1474
    invoke-virtual {v11, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1475
    .line 1476
    .line 1477
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getSupplicantState()Landroid/net/wifi/SupplicantState;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v3

    .line 1481
    sget-object v4, Landroid/net/wifi/SupplicantState;->COMPLETED:Landroid/net/wifi/SupplicantState;

    .line 1482
    .line 1483
    if-ne v3, v4, :cond_7

    .line 1484
    .line 1485
    const/16 v3, 0xb3

    .line 1486
    .line 1487
    const/16 v4, 0x8b

    .line 1488
    .line 1489
    move/from16 v6, v29

    .line 1490
    .line 1491
    const/4 v7, 0x4

    .line 1492
    filled-new-array {v3, v7, v4, v6}, [I

    .line 1493
    .line 1494
    .line 1495
    move-result-object v3

    .line 1496
    const/4 v4, 0x0

    .line 1497
    const/4 v6, 0x1

    .line 1498
    invoke-static {v4, v3, v6}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v3

    .line 1502
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v3

    .line 1506
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getRssi()I

    .line 1507
    .line 1508
    .line 1509
    move-result v4

    .line 1510
    invoke-virtual {v11, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1511
    .line 1512
    .line 1513
    const-string v3, "\ude84\ub631\ube2c\u07ab"

    .line 1514
    .line 1515
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 1516
    .line 1517
    .line 1518
    move-result v4

    .line 1519
    shr-int/lit8 v4, v4, 0x10

    .line 1520
    .line 1521
    const/4 v7, 0x4

    .line 1522
    rsub-int/lit8 v4, v4, 0x4

    .line 1523
    .line 1524
    invoke-static {v4, v3}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v3

    .line 1528
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v3

    .line 1532
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getLinkSpeed()I

    .line 1533
    .line 1534
    .line 1535
    move-result v0

    .line 1536
    invoke-virtual {v11, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 1537
    .line 1538
    .line 1539
    sget v0, LVa/qb;->e:I

    .line 1540
    .line 1541
    add-int/lit8 v0, v0, 0x25

    .line 1542
    .line 1543
    rem-int/lit16 v0, v0, 0x80

    .line 1544
    .line 1545
    sput v0, LVa/qb;->d:I

    .line 1546
    .line 1547
    :cond_7
    :goto_d
    move/from16 v3, p4

    .line 1548
    .line 1549
    goto :goto_f

    .line 1550
    :catchall_0
    move-exception v0

    .line 1551
    move/from16 v3, p3

    .line 1552
    .line 1553
    const/4 v4, 0x1

    .line 1554
    goto :goto_e

    .line 1555
    :cond_8
    :try_start_a
    invoke-virtual {v9, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    .line 1556
    .line 1557
    .line 1558
    const/16 v25, 0x0

    .line 1559
    .line 1560
    throw v25
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 1561
    :goto_e
    filled-new-array {v4, v2, v13, v3}, [I

    .line 1562
    .line 1563
    .line 1564
    move-result-object v6

    .line 1565
    invoke-static {v10, v6, v13}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v3

    .line 1569
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v3

    .line 1573
    invoke-static/range {v21 .. v22}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 1574
    .line 1575
    .line 1576
    move-result v4

    .line 1577
    add-int/lit8 v4, v4, 0x20

    .line 1578
    .line 1579
    const-string v6, "\ua7a6\uf206\uf111\u978e\u5d2a\u56a0\ueb07\u7e3b\u001b\u6266\u4e54\u5147\u1880\ua41c\u36ed\u7873\ueab3\ucb2b\u4cdf\u0c5c\u49b1\ua927\u6eaa\u5591\ud234\u167c\u0a4c\ufb91\ub1bc\u8771\u0ebf\u13c7"

    .line 1580
    .line 1581
    invoke-static {v4, v6}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v4

    .line 1585
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v4

    .line 1589
    invoke-static {v3, v4, v0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1590
    .line 1591
    .line 1592
    goto :goto_d

    .line 1593
    :goto_f
    invoke-static {v9, v11, v3}, LVa/qb;->h(Landroid/content/Context;Lorg/json/JSONObject;Z)V

    .line 1594
    .line 1595
    .line 1596
    sget v0, LVa/qb;->e:I

    .line 1597
    .line 1598
    add-int/lit8 v0, v0, 0x7b

    .line 1599
    .line 1600
    rem-int/lit16 v3, v0, 0x80

    .line 1601
    .line 1602
    sput v3, LVa/qb;->d:I

    .line 1603
    .line 1604
    const/16 v24, 0x2

    .line 1605
    .line 1606
    rem-int/lit8 v0, v0, 0x2

    .line 1607
    .line 1608
    if-eqz v0, :cond_9

    .line 1609
    .line 1610
    invoke-static {}, LVa/qb;->c()Lorg/json/JSONObject;

    .line 1611
    .line 1612
    .line 1613
    move-result-object v0

    .line 1614
    const/16 v3, 0x20

    .line 1615
    .line 1616
    div-int/2addr v3, v13

    .line 1617
    goto :goto_10

    .line 1618
    :cond_9
    invoke-static {}, LVa/qb;->c()Lorg/json/JSONObject;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v0

    .line 1622
    :goto_10
    invoke-static {v11, v0}, LVa/Ab;->g0(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 1623
    .line 1624
    .line 1625
    sget v0, LVa/qb;->e:I

    .line 1626
    .line 1627
    add-int/lit8 v0, v0, 0x15

    .line 1628
    .line 1629
    rem-int/lit16 v0, v0, 0x80

    .line 1630
    .line 1631
    sput v0, LVa/qb;->d:I

    .line 1632
    .line 1633
    :try_start_b
    invoke-static {}, Landroid/net/TrafficStats;->getTotalRxBytes()J

    .line 1634
    .line 1635
    .line 1636
    move-result-wide v3

    .line 1637
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1638
    .line 1639
    .line 1640
    move-result-wide v6

    .line 1641
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1642
    .line 1643
    .line 1644
    move-result-wide v32
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 1645
    cmp-long v0, v3, v16

    .line 1646
    .line 1647
    if-eqz v0, :cond_a

    .line 1648
    .line 1649
    move v8, v5

    .line 1650
    move-wide/from16 v16, v6

    .line 1651
    .line 1652
    :try_start_c
    invoke-static {}, Landroid/net/TrafficStats;->getTotalRxBytes()J

    .line 1653
    .line 1654
    .line 1655
    move-result-wide v5

    .line 1656
    sub-long v3, v5, v3

    .line 1657
    .line 1658
    long-to-float v0, v3

    .line 1659
    sub-long v3, v32, v16

    .line 1660
    .line 1661
    long-to-float v3, v3

    .line 1662
    const/high16 v4, 0x447a0000    # 1000.0f

    .line 1663
    .line 1664
    div-float/2addr v4, v3

    .line 1665
    mul-float/2addr v4, v0

    .line 1666
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 1667
    .line 1668
    .line 1669
    move-result v0

    .line 1670
    const-string v3, "\u0000\u0001\u0000\u0001"

    .line 1671
    .line 1672
    const/16 v4, 0x79

    .line 1673
    .line 1674
    const/4 v7, 0x4

    .line 1675
    filled-new-array {v4, v7, v13, v13}, [I

    .line 1676
    .line 1677
    .line 1678
    move-result-object v4

    .line 1679
    const/4 v12, 0x1

    .line 1680
    invoke-static {v3, v4, v12}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v3

    .line 1684
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v3

    .line 1688
    invoke-virtual {v11, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1689
    .line 1690
    .line 1691
    const-string v0, "\u0000\u0001\u0001\u0000"

    .line 1692
    .line 1693
    const/16 v3, 0x9e

    .line 1694
    .line 1695
    move/from16 v4, v27

    .line 1696
    .line 1697
    filled-new-array {v4, v7, v3, v13}, [I

    .line 1698
    .line 1699
    .line 1700
    move-result-object v3

    .line 1701
    invoke-static {v0, v3, v13}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v0

    .line 1705
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v0

    .line 1709
    invoke-virtual {v11, v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 1710
    .line 1711
    .line 1712
    sget v0, LVa/qb;->d:I

    .line 1713
    .line 1714
    add-int/lit8 v0, v0, 0x5d

    .line 1715
    .line 1716
    rem-int/lit16 v0, v0, 0x80

    .line 1717
    .line 1718
    sput v0, LVa/qb;->e:I

    .line 1719
    .line 1720
    goto :goto_12

    .line 1721
    :catchall_1
    move-exception v0

    .line 1722
    :goto_11
    const/16 v3, 0xa

    .line 1723
    .line 1724
    const/4 v4, 0x1

    .line 1725
    goto :goto_13

    .line 1726
    :cond_a
    move v8, v5

    .line 1727
    :goto_12
    sget v0, LVa/qb;->d:I

    .line 1728
    .line 1729
    add-int/lit8 v0, v0, 0x49

    .line 1730
    .line 1731
    rem-int/lit16 v0, v0, 0x80

    .line 1732
    .line 1733
    sput v0, LVa/qb;->e:I

    .line 1734
    .line 1735
    goto :goto_14

    .line 1736
    :catchall_2
    move-exception v0

    .line 1737
    move v8, v5

    .line 1738
    goto :goto_11

    .line 1739
    :goto_13
    filled-new-array {v4, v2, v13, v3}, [I

    .line 1740
    .line 1741
    .line 1742
    move-result-object v5

    .line 1743
    invoke-static {v10, v5, v13}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v3

    .line 1747
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v3

    .line 1751
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 1752
    .line 1753
    .line 1754
    move-result v4

    .line 1755
    shr-int/2addr v4, v8

    .line 1756
    add-int/lit8 v4, v4, 0x23

    .line 1757
    .line 1758
    const-string v5, "\ua7a6\uf206\uf111\u978e\u5d2a\u56a0\udc9f.\udb8b\u7bad\u4cdf\u0c5c\u65f1\ua818\u24c4\u97b5\ub394\uf5b9\u6d0e\u7268\uf9bd\u8f95\u2503\u26a4\ud8cc\u37b4\ubbdb\u5d79\u6738\u516d\uefcb\u4149\u242d\u72c2\u67c3\ud431"

    .line 1759
    .line 1760
    invoke-static {v4, v5}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v4

    .line 1764
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v4

    .line 1768
    invoke-static {v3, v4, v0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1769
    .line 1770
    .line 1771
    :goto_14
    invoke-static/range {v21 .. v22}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 1772
    .line 1773
    .line 1774
    move-result v0

    .line 1775
    int-to-char v0, v0

    .line 1776
    invoke-static {v13}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 1777
    .line 1778
    .line 1779
    move-result-wide v3

    .line 1780
    cmp-long v3, v3, v21

    .line 1781
    .line 1782
    rsub-int/lit8 v3, v3, 0x31

    .line 1783
    .line 1784
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 1785
    .line 1786
    .line 1787
    move-result v4

    .line 1788
    shr-int/lit8 v4, v4, 0x10

    .line 1789
    .line 1790
    const/4 v7, 0x4

    .line 1791
    add-int/2addr v4, v7

    .line 1792
    invoke-static {v3, v4, v0}, LVa/lb;->a(IIC)Ljava/lang/String;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v0

    .line 1796
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v0

    .line 1800
    move/from16 v3, p2

    .line 1801
    .line 1802
    invoke-virtual {v11, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1803
    .line 1804
    .line 1805
    :try_start_d
    const-string v0, "\ubfda\uc446\u98b8\u634c\u776c\ub677\u3890\ue448"

    .line 1806
    .line 1807
    const/16 v6, 0x30

    .line 1808
    .line 1809
    invoke-static {v15, v6, v13, v13}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 1810
    .line 1811
    .line 1812
    move-result v3

    .line 1813
    add-int/lit8 v3, v3, 0x9

    .line 1814
    .line 1815
    invoke-static {v3, v0}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v0

    .line 1819
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v0

    .line 1823
    invoke-virtual {v9, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1824
    .line 1825
    .line 1826
    move-result-object v0

    .line 1827
    check-cast v0, Landroid/app/ActivityManager;

    .line 1828
    .line 1829
    new-instance v3, Landroid/app/ActivityManager$MemoryInfo;

    .line 1830
    .line 1831
    invoke-direct {v3}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 1832
    .line 1833
    .line 1834
    invoke-virtual {v0, v3}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 1835
    .line 1836
    .line 1837
    const-string v0, "\u0001\u0000\u0001\u0001"

    .line 1838
    .line 1839
    const/16 v4, 0x55

    .line 1840
    .line 1841
    const/4 v6, 0x2

    .line 1842
    const/4 v7, 0x4

    .line 1843
    filled-new-array {v4, v7, v13, v6}, [I

    .line 1844
    .line 1845
    .line 1846
    move-result-object v4

    .line 1847
    const/4 v12, 0x1

    .line 1848
    invoke-static {v0, v4, v12}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v0

    .line 1852
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1853
    .line 1854
    .line 1855
    move-result-object v0

    .line 1856
    iget-wide v4, v3, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    .line 1857
    .line 1858
    const-wide/32 v6, 0x100000

    .line 1859
    .line 1860
    .line 1861
    div-long/2addr v4, v6

    .line 1862
    invoke-virtual {v11, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1863
    .line 1864
    .line 1865
    const-string v0, "\u0001\u0000\u0001\u0000"

    .line 1866
    .line 1867
    const/16 v4, 0xb1

    .line 1868
    .line 1869
    move/from16 v12, v18

    .line 1870
    .line 1871
    const/4 v5, 0x2

    .line 1872
    const/4 v9, 0x4

    .line 1873
    filled-new-array {v12, v9, v4, v5}, [I

    .line 1874
    .line 1875
    .line 1876
    move-result-object v4

    .line 1877
    invoke-static {v0, v4, v13}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v0

    .line 1881
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v0

    .line 1885
    iget-wide v4, v3, Landroid/app/ActivityManager$MemoryInfo;->threshold:J

    .line 1886
    .line 1887
    div-long/2addr v4, v6

    .line 1888
    invoke-virtual {v11, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1889
    .line 1890
    .line 1891
    iget-boolean v0, v3, Landroid/app/ActivityManager$MemoryInfo;->lowMemory:Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 1892
    .line 1893
    if-eqz v0, :cond_c

    .line 1894
    .line 1895
    sget v0, LVa/qb;->e:I

    .line 1896
    .line 1897
    add-int/lit8 v0, v0, 0x5f

    .line 1898
    .line 1899
    rem-int/lit16 v4, v0, 0x80

    .line 1900
    .line 1901
    sput v4, LVa/qb;->d:I

    .line 1902
    .line 1903
    const/16 v24, 0x2

    .line 1904
    .line 1905
    rem-int/lit8 v0, v0, 0x2

    .line 1906
    .line 1907
    const-string v4, "\uf614\u39c8\u3398\u69d4"

    .line 1908
    .line 1909
    if-eqz v0, :cond_b

    .line 1910
    .line 1911
    :try_start_e
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 1912
    .line 1913
    .line 1914
    move-result-wide v16

    .line 1915
    const-wide/16 v29, 0x1

    .line 1916
    .line 1917
    cmp-long v0, v16, v29

    .line 1918
    .line 1919
    const/4 v9, 0x4

    .line 1920
    add-int/2addr v0, v9

    .line 1921
    invoke-static {v0, v4}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v0

    .line 1925
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v0

    .line 1929
    iget-boolean v4, v3, Landroid/app/ActivityManager$MemoryInfo;->lowMemory:Z

    .line 1930
    .line 1931
    :goto_15
    invoke-virtual {v11, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1932
    .line 1933
    .line 1934
    goto :goto_16

    .line 1935
    :catchall_3
    move-exception v0

    .line 1936
    const/16 v3, 0xa

    .line 1937
    .line 1938
    const/4 v4, 0x1

    .line 1939
    goto :goto_17

    .line 1940
    :cond_b
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 1941
    .line 1942
    .line 1943
    move-result-wide v16

    .line 1944
    cmp-long v0, v16, v21

    .line 1945
    .line 1946
    const/16 v29, 0x3

    .line 1947
    .line 1948
    add-int/lit8 v0, v0, 0x3

    .line 1949
    .line 1950
    invoke-static {v0, v4}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v0

    .line 1954
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1955
    .line 1956
    .line 1957
    move-result-object v0

    .line 1958
    iget-boolean v4, v3, Landroid/app/ActivityManager$MemoryInfo;->lowMemory:Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 1959
    .line 1960
    goto :goto_15

    .line 1961
    :cond_c
    :goto_16
    sget v0, LVa/qb;->d:I

    .line 1962
    .line 1963
    add-int/lit8 v0, v0, 0x51

    .line 1964
    .line 1965
    rem-int/lit16 v0, v0, 0x80

    .line 1966
    .line 1967
    sput v0, LVa/qb;->e:I

    .line 1968
    .line 1969
    :try_start_f
    const-string v0, "\uf614\u39c8\udb8b\u7bad"

    .line 1970
    .line 1971
    invoke-static {v13, v13}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 1972
    .line 1973
    .line 1974
    move-result v4

    .line 1975
    const/4 v9, 0x4

    .line 1976
    add-int/2addr v4, v9

    .line 1977
    invoke-static {v4, v0}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v0

    .line 1981
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v0

    .line 1985
    iget-wide v3, v3, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    .line 1986
    .line 1987
    div-long/2addr v3, v6

    .line 1988
    invoke-virtual {v11, v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 1989
    .line 1990
    .line 1991
    sget v0, LVa/qb;->e:I

    .line 1992
    .line 1993
    add-int/lit8 v0, v0, 0x4f

    .line 1994
    .line 1995
    rem-int/lit16 v0, v0, 0x80

    .line 1996
    .line 1997
    sput v0, LVa/qb;->d:I

    .line 1998
    .line 1999
    const/16 v27, 0x7d

    .line 2000
    .line 2001
    add-int/lit8 v0, v0, 0x7d

    .line 2002
    .line 2003
    rem-int/lit16 v0, v0, 0x80

    .line 2004
    .line 2005
    sput v0, LVa/qb;->e:I

    .line 2006
    .line 2007
    goto :goto_18

    .line 2008
    :goto_17
    filled-new-array {v4, v2, v13, v3}, [I

    .line 2009
    .line 2010
    .line 2011
    move-result-object v3

    .line 2012
    invoke-static {v10, v3, v13}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 2013
    .line 2014
    .line 2015
    move-result-object v3

    .line 2016
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 2017
    .line 2018
    .line 2019
    move-result-object v3

    .line 2020
    new-instance v4, Ljava/lang/StringBuilder;

    .line 2021
    .line 2022
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 2023
    .line 2024
    .line 2025
    const/16 v5, 0x5d

    .line 2026
    .line 2027
    const/16 v6, 0x1c

    .line 2028
    .line 2029
    const/16 v7, 0x78

    .line 2030
    .line 2031
    filled-new-array {v5, v6, v7, v13}, [I

    .line 2032
    .line 2033
    .line 2034
    move-result-object v5

    .line 2035
    const-string v6, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000"

    .line 2036
    .line 2037
    invoke-static {v6, v5, v13}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 2038
    .line 2039
    .line 2040
    move-result-object v5

    .line 2041
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 2042
    .line 2043
    .line 2044
    move-result-object v5

    .line 2045
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2046
    .line 2047
    .line 2048
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 2049
    .line 2050
    .line 2051
    move-result-object v0

    .line 2052
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2053
    .line 2054
    .line 2055
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v0

    .line 2059
    invoke-static {v3, v0}, LVa/Ab;->x(Ljava/lang/String;Ljava/lang/String;)V

    .line 2060
    .line 2061
    .line 2062
    :goto_18
    sget v0, LVa/qb;->e:I

    .line 2063
    .line 2064
    add-int/lit8 v0, v0, 0x37

    .line 2065
    .line 2066
    rem-int/lit16 v0, v0, 0x80

    .line 2067
    .line 2068
    sput v0, LVa/qb;->d:I

    .line 2069
    .line 2070
    :try_start_10
    const-string v0, "\uf3d9\uff4a\u3562\u4357"

    .line 2071
    .line 2072
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 2073
    .line 2074
    .line 2075
    move-result v3

    .line 2076
    cmpl-float v3, v3, v26

    .line 2077
    .line 2078
    rsub-int/lit8 v3, v3, 0x5

    .line 2079
    .line 2080
    invoke-static {v3, v0}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 2081
    .line 2082
    .line 2083
    move-result-object v0

    .line 2084
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 2085
    .line 2086
    .line 2087
    move-result-object v0

    .line 2088
    invoke-static {}, LVa/qb;->d()Lorg/json/JSONObject;

    .line 2089
    .line 2090
    .line 2091
    move-result-object v3

    .line 2092
    invoke-virtual {v11, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_10
    .catch Lorg/json/JSONException; {:try_start_10 .. :try_end_10} :catch_a

    .line 2093
    .line 2094
    .line 2095
    sget v0, LVa/qb;->d:I

    .line 2096
    .line 2097
    add-int/lit8 v0, v0, 0x7b

    .line 2098
    .line 2099
    rem-int/lit16 v0, v0, 0x80

    .line 2100
    .line 2101
    sput v0, LVa/qb;->e:I

    .line 2102
    .line 2103
    :catch_a
    :try_start_11
    new-instance v0, Lorg/json/JSONObject;

    .line 2104
    .line 2105
    invoke-virtual {v14}, LVa/H;->b()Lj$/util/concurrent/ConcurrentHashMap;

    .line 2106
    .line 2107
    .line 2108
    move-result-object v3

    .line 2109
    invoke-direct {v0, v3}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 2110
    .line 2111
    .line 2112
    invoke-static {v13}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 2113
    .line 2114
    .line 2115
    move-result-wide v3

    .line 2116
    cmp-long v3, v3, v21

    .line 2117
    .line 2118
    int-to-char v3, v3

    .line 2119
    invoke-static {v13}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2120
    .line 2121
    .line 2122
    move-result v4

    .line 2123
    add-int/lit8 v4, v4, 0x35

    .line 2124
    .line 2125
    invoke-static {v15, v13}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 2126
    .line 2127
    .line 2128
    move-result v5

    .line 2129
    rsub-int/lit8 v5, v5, 0xd

    .line 2130
    .line 2131
    invoke-static {v4, v5, v3}, LVa/lb;->a(IIC)Ljava/lang/String;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v3

    .line 2135
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v3

    .line 2139
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 2140
    .line 2141
    .line 2142
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2143
    .line 2144
    .line 2145
    move-result-wide v3

    .line 2146
    cmp-long v3, v3, v21

    .line 2147
    .line 2148
    add-int/2addr v3, v2

    .line 2149
    int-to-char v2, v3

    .line 2150
    const-string v3, "\uc1cd\ue158\u0c01\ub600"

    .line 2151
    .line 2152
    const-string v4, "\ufb0d\uea73\uacdc\ucf57\uf343\u7f0f\u2950\u74f7\ucf94\u67ae\ucb05\u2a40\u81aa\ufaea\u31f3\uea9a\u82e1\u27ec"

    .line 2153
    .line 2154
    const/16 v31, 0x30

    .line 2155
    .line 2156
    invoke-static/range {v31 .. v31}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 2157
    .line 2158
    .line 2159
    move-result v5

    .line 2160
    add-int/lit8 v5, v5, -0x30

    .line 2161
    .line 2162
    invoke-static {v2, v3, v4, v5}, LVa/lb;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 2163
    .line 2164
    .line 2165
    move-result-object v2

    .line 2166
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 2167
    .line 2168
    .line 2169
    move-result-object v2

    .line 2170
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 2171
    .line 2172
    .line 2173
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    .line 2174
    .line 2175
    .line 2176
    move-result v2
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_b

    .line 2177
    if-lez v2, :cond_12

    .line 2178
    .line 2179
    sget v2, LVa/lb;->f:I

    .line 2180
    .line 2181
    add-int/lit8 v2, v2, 0x61

    .line 2182
    .line 2183
    rem-int/lit16 v3, v2, 0x80

    .line 2184
    .line 2185
    sput v3, LVa/lb;->e:I

    .line 2186
    .line 2187
    const/16 v24, 0x2

    .line 2188
    .line 2189
    rem-int/lit8 v2, v2, 0x2

    .line 2190
    .line 2191
    if-eqz v2, :cond_d

    .line 2192
    .line 2193
    :try_start_12
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 2194
    .line 2195
    .line 2196
    move-result v2

    .line 2197
    add-int/lit8 v2, v2, 0x72

    .line 2198
    .line 2199
    int-to-char v2, v2

    .line 2200
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 2201
    .line 2202
    .line 2203
    move-result v3

    .line 2204
    shl-int/lit8 v3, v3, 0x3c

    .line 2205
    .line 2206
    shr-int v3, v8, v3

    .line 2207
    .line 2208
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 2209
    .line 2210
    .line 2211
    move-result v4

    .line 2212
    shr-int/lit8 v4, v4, 0x77

    .line 2213
    .line 2214
    shr-int v4, v19, v4

    .line 2215
    .line 2216
    invoke-static {v3, v4, v2}, LVa/lb;->a(IIC)Ljava/lang/String;

    .line 2217
    .line 2218
    .line 2219
    move-result-object v2

    .line 2220
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 2221
    .line 2222
    .line 2223
    move-result-object v2

    .line 2224
    :goto_19
    invoke-virtual {v11, v2, v0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2225
    .line 2226
    .line 2227
    goto :goto_1b

    .line 2228
    :catch_b
    move-exception v0

    .line 2229
    goto :goto_1a

    .line 2230
    :cond_d
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 2231
    .line 2232
    .line 2233
    move-result v2

    .line 2234
    shr-int/lit8 v2, v2, 0x10

    .line 2235
    .line 2236
    int-to-char v2, v2

    .line 2237
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 2238
    .line 2239
    .line 2240
    move-result v3

    .line 2241
    shr-int/lit8 v3, v3, 0x10

    .line 2242
    .line 2243
    add-int/lit8 v3, v3, 0x42

    .line 2244
    .line 2245
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 2246
    .line 2247
    .line 2248
    move-result v4

    .line 2249
    shr-int/lit8 v4, v4, 0x10

    .line 2250
    .line 2251
    const/4 v7, 0x4

    .line 2252
    sub-int/2addr v7, v4

    .line 2253
    invoke-static {v3, v7, v2}, LVa/lb;->a(IIC)Ljava/lang/String;

    .line 2254
    .line 2255
    .line 2256
    move-result-object v2

    .line 2257
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 2258
    .line 2259
    .line 2260
    move-result-object v2
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_b

    .line 2261
    goto :goto_19

    .line 2262
    :goto_1a
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 2263
    .line 2264
    .line 2265
    move-result v2

    .line 2266
    shr-int/lit8 v2, v2, 0x10

    .line 2267
    .line 2268
    const v3, 0xe80f

    .line 2269
    .line 2270
    .line 2271
    add-int/2addr v2, v3

    .line 2272
    int-to-char v2, v2

    .line 2273
    invoke-static {v13}, Landroid/graphics/Color;->green(I)I

    .line 2274
    .line 2275
    .line 2276
    move-result v3

    .line 2277
    rsub-int/lit8 v3, v3, 0x46

    .line 2278
    .line 2279
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 2280
    .line 2281
    .line 2282
    move-result v4

    .line 2283
    cmpl-float v4, v4, v26

    .line 2284
    .line 2285
    add-int/2addr v4, v8

    .line 2286
    invoke-static {v3, v4, v2}, LVa/lb;->a(IIC)Ljava/lang/String;

    .line 2287
    .line 2288
    .line 2289
    move-result-object v2

    .line 2290
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 2291
    .line 2292
    .line 2293
    move-result-object v2

    .line 2294
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 2295
    .line 2296
    .line 2297
    move-result v3

    .line 2298
    shr-int/lit8 v3, v3, 0x10

    .line 2299
    .line 2300
    rsub-int v3, v3, 0x72b7

    .line 2301
    .line 2302
    int-to-char v3, v3

    .line 2303
    const v4, 0x100005f

    .line 2304
    .line 2305
    .line 2306
    invoke-static {v13, v13, v13}, Landroid/graphics/Color;->rgb(III)I

    .line 2307
    .line 2308
    .line 2309
    move-result v5

    .line 2310
    add-int/2addr v5, v4

    .line 2311
    invoke-static {v15, v13}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 2312
    .line 2313
    .line 2314
    move-result v4

    .line 2315
    rsub-int/lit8 v4, v4, 0x24

    .line 2316
    .line 2317
    invoke-static {v5, v4, v3}, LVa/lb;->a(IIC)Ljava/lang/String;

    .line 2318
    .line 2319
    .line 2320
    move-result-object v3

    .line 2321
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 2322
    .line 2323
    .line 2324
    move-result-object v3

    .line 2325
    invoke-static {v2, v3, v0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2326
    .line 2327
    .line 2328
    goto :goto_1b

    .line 2329
    :cond_e
    const/16 v25, 0x0

    .line 2330
    .line 2331
    throw v25

    .line 2332
    :cond_f
    const/16 v25, 0x0

    .line 2333
    .line 2334
    throw v25

    .line 2335
    :cond_10
    const/16 v25, 0x0

    .line 2336
    .line 2337
    throw v25

    .line 2338
    :cond_11
    const/16 v25, 0x0

    .line 2339
    .line 2340
    throw v25

    .line 2341
    :cond_12
    :goto_1b
    return-object v11

    .line 2342
    nop

    :array_0
    .array-data 4
        0xe305736
        0x1aba3d86
        0x7496e084
        0x5f621b39
        -0x77bb388a
        -0x1b6eea53
        0x71797362
        0x3e1ba2a0
        -0x66cccd78
        0x242bcbc5
        -0x7b4ea4f4
        -0x21bde845
        0x44d8b01c
        0x7d110d2a
        0x44d8b01c
        0x7d110d2a
        0x790d79a0
        0x45181269
        -0x3b10bb27
        -0x60fd7645
        -0x2b5df594
        0xb0a0a44
        -0x3f6f8efe
        0x1a09fee4
        -0x69a53580
        0x4c169be1    # 3.948122E7f
        0x2ea58acd
        -0x8af5218
        0x7ecd6999
        -0x169b9c6c
    .end array-data

    :array_1
    .array-data 4
        -0x2a07673a
        0x1883e827
        0x1f178f3e
        0x8066064
        -0x18daf773
        -0xaf49a65
        -0x23f3e835
        -0x14b6bcee
        0x7622f988
        0x299f2078
        0x7ecd6999
        -0x169b9c6c
        -0x724e7d39
        0x3d15c6ce
        -0x574fd29d
        -0x55aea0ae    # -1.8596E-13f
        -0x76e58845
        0x646d5119
        0x1566ef37
        -0x7fe2d214
        0xbfa514f
        -0x3c20e312
        0x2d670e4
        -0x7ba91a8d
    .end array-data

    :array_2
    .array-data 4
        -0x2a07673a
        0x1883e827
        0x1f178f3e
        0x8066064
        0x203632a4
        -0x10fe904
        -0x489fc515
        0x5290b8b3
        -0x3aa07047
        -0x34094885    # -3.2337654E7f
        -0x5e42d3d4
        -0x22006221
        -0x7cd74116
        0x18b936cd
        0x117f25c7
        0x15660e2f
        0x2f2d64b1
        -0x79cb0cdc
    .end array-data

    :array_3
    .array-data 4
        -0x2a07673a
        0x1883e827
        0x1f178f3e
        0x8066064
        -0x18daf773
        -0xaf49a65
        -0x23f3e835
        -0x14b6bcee
        -0x18d6567
        0x1e637952
        -0x60008077
        -0x650d1528
        -0x6950d3f5
        -0x301d38b5
        0x1303e0b8
        0x2db42d81
        -0x4a20f710
        0x752596ac
        -0x37563f07
        0x479d0ce5
        0x75e4aced
        0x3cbee96
    .end array-data

    :array_4
    .array-data 4
        -0x2a07673a
        0x1883e827
        0x1f178f3e
        0x8066064
        0x203632a4
        -0x10fe904
        -0x489fc515
        0x5290b8b3
        -0x3aa07047
        -0x34094885    # -3.2337654E7f
        -0x5e42d3d4
        -0x22006221
        -0x7cd74116
        0x18b936cd
        0x117f25c7
        0x15660e2f
        0x2f2d64b1
        -0x79cb0cdc
    .end array-data
.end method
