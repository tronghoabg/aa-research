.class public final LVa/v5;
.super LVa/Z0;
.source "SourceFile"


# static fields
.field public static final R:[C

.field public static final S:[C

.field public static T:I = 0x0

.field public static U:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x24

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/v5;->R:[C

    .line 9
    .line 10
    const/16 v0, 0xa8

    .line 11
    .line 12
    new-array v0, v0, [C

    .line 13
    .line 14
    fill-array-data v0, :array_1

    .line 15
    .line 16
    .line 17
    sput-object v0, LVa/v5;->S:[C

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :array_0
    .array-data 2
        0x69s
        0x6fs
        0x2es
        0x70s
        0x72s
        0x65s
        0x73s
        0x61s
        0x67s
        0x6es
        0x74s
        0x6cs
        0x49s
        0x41s
        0x63s
        0x76s
        0x79s
        0x75s
        0x55s
        0x50s
        0x52s
        0x77s
        0x64s
        0x6ds
        0x43s
        0x66s
        0x62s
        0x6bs
        0x4fs
        0x56s
        0x2ds
        0x6as
        0x71s
        0x78s
        0x7as
        0x7bs
    .end array-data

    .line 22
    .line 23
    .line 24
    :array_1
    .array-data 2
        0x27s
        0x5bs
        0x6es
        0x73s
        0x75s
        0x6bs
        0xd2s
        0xc6s
        0xc7s
        0xd1s
        0xcfs
        0xd5s
        0xd7s
        0xd6s
        0xccs
        0x56s
        0xa6s
        0xa5s
        0xaes
        0xaes
        0xaes
        0xb3s
        0xb2s
        0xabs
        0xacs
        0xb1s
        0x9bs
        0x97s
        0xa6s
        0xa4s
        0xaas
        0xacs
        0xabs
        0xa1s
        0x64s
        0xb4s
        0xafs
        0xc3s
        0xc9s
        0xc4s
        0xbes
        0xbfs
        0xc4s
        0xbas
        0xbes
        0xc8s
        0xc9s
        0xc7s
        0xc1s
        0xc3s
        0xb4s
        0xb8s
        0xces
        0xc9s
        0xc8s
        0xcfs
        0xd0s
        0xcbs
        0xcbs
        0xcbs
        0xc2s
        0x32s
        0x5as
        0x5fs
        0x72s
        0x6es
        0x6bs
        0x62s
        0x5fs
        0x66s
        0x64s
        0x6as
        0x5fs
        0x61s
        0x6bs
        0x6cs
        0x6as
        0x64s
        0x3bs
        0x88s
        0x92s
        0x93s
        0x91s
        0x8bs
        0x8ds
        0x81s
        0x86s
        0x99s
        0x95s
        0x92s
        0x89s
        0x86s
        0x8ds
        0x8bs
        0x91s
        0x80s
        0x79s
        0x8ds
        0x93s
        0x8es
        0x88s
        0x89s
        0x8es
        0x32s
        0x6cs
        0x62s
        0x61s
        0x6bs
        0x6cs
        0x6as
        0x64s
        0x66s
        0x57s
        0x5bs
        0x70s
        0x73s
        0x6as
        0x67s
        0x68s
        0x64s
        0x66s
        0x115s
        0x12as
        0x13as
        0x134s
        0x135s
        0x113s
        0x139s
        0x128s
        0x13bs
        0x135s
        0x10as
        0x13as
        0x13bs
        0x127s
        0x12es
        0x13bs
        0x12as
        0x134s
        0x12fs
        0x138s
        0x12bs
        0x12es
        0x129s
        0x127s
        0x11cs
        0xf4s
        0x12cs
        0x12fs
        0xf4s
        0x134s
        0x135s
        0x133s
        0x133s
        0x135s
        0x129s
        0xf4s
        0x12bs
        0x12ds
        0x127s
        0x139s
        0x12bs
        0x138s
        0x136s
        0xf4s
        0x135s
        0x12fs
        0x138s
    .end array-data
.end method

.method public static C0()Lio/presage/Presage;
    .locals 2

    .line 1
    sget v0, LVa/v5;->T:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/v5;->U:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lio/presage/Presage;->getInstance()Lio/presage/Presage;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x4

    .line 18
    div-int/lit8 v1, v1, 0x0

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    invoke-static {}, Lio/presage/Presage;->getInstance()Lio/presage/Presage;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public static D0(BILjava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->B:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sget-object v1, LVa/v5;->R:[C

    .line 11
    .line 12
    new-array v2, p1, [C

    .line 13
    .line 14
    rem-int/lit8 v3, p1, 0x2

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    add-int/lit8 p1, p1, -0x1

    .line 19
    .line 20
    aget-char v3, p2, p1

    .line 21
    .line 22
    sub-int/2addr v3, p0

    .line 23
    int-to-char v3, v3

    .line 24
    aput-char v3, v2, p1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_3

    .line 29
    :cond_0
    :goto_0
    const/4 v3, 0x1

    .line 30
    if-le p1, v3, :cond_4

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    sput v3, LVa/Ab;->A:I

    .line 34
    .line 35
    :goto_1
    sget v3, LVa/Ab;->A:I

    .line 36
    .line 37
    if-ge v3, p1, :cond_4

    .line 38
    .line 39
    aget-char v4, p2, v3

    .line 40
    .line 41
    add-int/lit8 v5, v3, 0x1

    .line 42
    .line 43
    aget-char v6, p2, v5

    .line 44
    .line 45
    if-ne v4, v6, :cond_1

    .line 46
    .line 47
    sub-int/2addr v4, p0

    .line 48
    int-to-char v4, v4

    .line 49
    aput-char v4, v2, v3

    .line 50
    .line 51
    sub-int/2addr v6, p0

    .line 52
    int-to-char v4, v6

    .line 53
    aput-char v4, v2, v5

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    div-int/lit8 v7, v4, 0x6

    .line 57
    .line 58
    rem-int/lit8 v4, v4, 0x6

    .line 59
    .line 60
    div-int/lit8 v8, v6, 0x6

    .line 61
    .line 62
    rem-int/lit8 v6, v6, 0x6

    .line 63
    .line 64
    if-ne v4, v6, :cond_2

    .line 65
    .line 66
    add-int/lit8 v7, v7, 0x5

    .line 67
    .line 68
    rem-int/lit8 v7, v7, 0x6

    .line 69
    .line 70
    add-int/lit8 v8, v8, 0x5

    .line 71
    .line 72
    rem-int/lit8 v8, v8, 0x6

    .line 73
    .line 74
    mul-int/lit8 v7, v7, 0x6

    .line 75
    .line 76
    add-int/2addr v7, v4

    .line 77
    mul-int/lit8 v8, v8, 0x6

    .line 78
    .line 79
    add-int/2addr v8, v6

    .line 80
    aget-char v4, v1, v7

    .line 81
    .line 82
    aput-char v4, v2, v3

    .line 83
    .line 84
    aget-char v4, v1, v8

    .line 85
    .line 86
    aput-char v4, v2, v5

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    if-ne v7, v8, :cond_3

    .line 90
    .line 91
    add-int/lit8 v4, v4, 0x5

    .line 92
    .line 93
    rem-int/lit8 v4, v4, 0x6

    .line 94
    .line 95
    add-int/lit8 v6, v6, 0x5

    .line 96
    .line 97
    rem-int/lit8 v6, v6, 0x6

    .line 98
    .line 99
    mul-int/lit8 v7, v7, 0x6

    .line 100
    .line 101
    add-int/2addr v7, v4

    .line 102
    mul-int/lit8 v8, v8, 0x6

    .line 103
    .line 104
    add-int/2addr v8, v6

    .line 105
    aget-char v4, v1, v7

    .line 106
    .line 107
    aput-char v4, v2, v3

    .line 108
    .line 109
    aget-char v4, v1, v8

    .line 110
    .line 111
    aput-char v4, v2, v5

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    mul-int/lit8 v7, v7, 0x6

    .line 115
    .line 116
    add-int/2addr v7, v6

    .line 117
    mul-int/lit8 v8, v8, 0x6

    .line 118
    .line 119
    add-int/2addr v8, v4

    .line 120
    aget-char v4, v1, v7

    .line 121
    .line 122
    aput-char v4, v2, v3

    .line 123
    .line 124
    aget-char v4, v1, v8

    .line 125
    .line 126
    aput-char v4, v2, v5

    .line 127
    .line 128
    :goto_2
    add-int/lit8 v3, v3, 0x2

    .line 129
    .line 130
    sput v3, LVa/Ab;->A:I

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_4
    new-instance p0, Ljava/lang/String;

    .line 134
    .line 135
    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    .line 136
    .line 137
    .line 138
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    return-object p0

    .line 140
    :goto_3
    monitor-exit v0

    .line 141
    throw p0
.end method

.method public static E0(Lio/presage/interstitial/optinvideo/PresageOptinVideo;Lio/presage/interstitial/optinvideo/PresageOptinVideoCallback;)V
    .locals 2

    .line 1
    sget v0, LVa/v5;->T:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/v5;->U:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lio/presage/interstitial/optinvideo/PresageOptinVideo;->setOptinVideoCallback(Lio/presage/interstitial/optinvideo/PresageOptinVideoCallback;)V

    .line 12
    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    throw p0
.end method

.method public static F0(Ljava/lang/String;[IZ)Ljava/lang/String;
    .locals 12

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-string v0, "ISO-8859-1"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    check-cast p0, [B

    .line 10
    .line 11
    sget-object v0, LVa/Ab;->z:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :try_start_0
    aget v2, p1, v1

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    aget v4, p1, v3

    .line 19
    .line 20
    const/4 v5, 0x2

    .line 21
    aget v6, p1, v5

    .line 22
    .line 23
    const/4 v7, 0x3

    .line 24
    aget v7, p1, v7

    .line 25
    .line 26
    sget-object v8, LVa/v5;->S:[C

    .line 27
    .line 28
    new-array v9, v4, [C

    .line 29
    .line 30
    invoke-static {v8, v2, v9, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    .line 32
    .line 33
    if-eqz p0, :cond_3

    .line 34
    .line 35
    new-array v2, v4, [C

    .line 36
    .line 37
    sput v1, LVa/Ab;->y:I

    .line 38
    .line 39
    move v8, v1

    .line 40
    :goto_0
    sget v10, LVa/Ab;->y:I

    .line 41
    .line 42
    if-ge v10, v4, :cond_2

    .line 43
    .line 44
    aget-byte v11, p0, v10

    .line 45
    .line 46
    if-ne v11, v3, :cond_1

    .line 47
    .line 48
    aget-char v11, v9, v10

    .line 49
    .line 50
    shl-int/2addr v11, v3

    .line 51
    add-int/2addr v11, v3

    .line 52
    sub-int/2addr v11, v8

    .line 53
    int-to-char v8, v11

    .line 54
    aput-char v8, v2, v10

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    goto :goto_4

    .line 59
    :cond_1
    aget-char v11, v9, v10

    .line 60
    .line 61
    shl-int/2addr v11, v3

    .line 62
    sub-int/2addr v11, v8

    .line 63
    int-to-char v8, v11

    .line 64
    aput-char v8, v2, v10

    .line 65
    .line 66
    :goto_1
    aget-char v8, v2, v10

    .line 67
    .line 68
    add-int/lit8 v10, v10, 0x1

    .line 69
    .line 70
    sput v10, LVa/Ab;->y:I

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    move-object v9, v2

    .line 74
    :cond_3
    if-lez v7, :cond_4

    .line 75
    .line 76
    new-array p0, v4, [C

    .line 77
    .line 78
    invoke-static {v9, v1, p0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 79
    .line 80
    .line 81
    sub-int v2, v4, v7

    .line 82
    .line 83
    invoke-static {p0, v1, v9, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 84
    .line 85
    .line 86
    invoke-static {p0, v7, v9, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 87
    .line 88
    .line 89
    :cond_4
    if-eqz p2, :cond_6

    .line 90
    .line 91
    new-array p0, v4, [C

    .line 92
    .line 93
    sput v1, LVa/Ab;->y:I

    .line 94
    .line 95
    :goto_2
    sget p2, LVa/Ab;->y:I

    .line 96
    .line 97
    if-ge p2, v4, :cond_5

    .line 98
    .line 99
    sub-int v2, v4, p2

    .line 100
    .line 101
    sub-int/2addr v2, v3

    .line 102
    aget-char v2, v9, v2

    .line 103
    .line 104
    aput-char v2, p0, p2

    .line 105
    .line 106
    add-int/lit8 p2, p2, 0x1

    .line 107
    .line 108
    sput p2, LVa/Ab;->y:I

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    move-object v9, p0

    .line 112
    :cond_6
    if-lez v6, :cond_7

    .line 113
    .line 114
    sput v1, LVa/Ab;->y:I

    .line 115
    .line 116
    :goto_3
    sget p0, LVa/Ab;->y:I

    .line 117
    .line 118
    if-ge p0, v4, :cond_7

    .line 119
    .line 120
    aget-char p2, v9, p0

    .line 121
    .line 122
    aget v1, p1, v5

    .line 123
    .line 124
    sub-int/2addr p2, v1

    .line 125
    int-to-char p2, p2

    .line 126
    aput-char p2, v9, p0

    .line 127
    .line 128
    add-int/lit8 p0, p0, 0x1

    .line 129
    .line 130
    sput p0, LVa/Ab;->y:I

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_7
    new-instance p0, Ljava/lang/String;

    .line 134
    .line 135
    invoke-direct {p0, v9}, Ljava/lang/String;-><init>([C)V

    .line 136
    .line 137
    .line 138
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    return-object p0

    .line 140
    :goto_4
    monitor-exit v0

    .line 141
    throw p0
.end method

.method public static G0(Lio/presage/interstitial/PresageInterstitial;Lio/presage/interstitial/PresageInterstitialCallback;)V
    .locals 1

    .line 1
    sget v0, LVa/v5;->T:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/v5;->U:I

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/presage/interstitial/PresageInterstitial;->setInterstitialCallback(Lio/presage/interstitial/PresageInterstitialCallback;)V

    .line 10
    .line 11
    .line 12
    sget p0, LVa/v5;->T:I

    .line 13
    .line 14
    add-int/lit8 p0, p0, 0x2d

    .line 15
    .line 16
    rem-int/lit16 p1, p0, 0x80

    .line 17
    .line 18
    sput p1, LVa/v5;->U:I

    .line 19
    .line 20
    rem-int/lit8 p0, p0, 0x2

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    throw p0
.end method


# virtual methods
.method public final A0()Ljava/util/HashMap;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x67

    .line 7
    .line 8
    const/16 v2, 0x12

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/16 v4, 0x11

    .line 12
    .line 13
    filled-new-array {v1, v2, v3, v4}, [I

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000"

    .line 18
    .line 19
    invoke-static {v2, v1, v3}, LVa/v5;->F0(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v2, LVa/N3;

    .line 28
    .line 29
    const/4 v3, 0x6

    .line 30
    invoke-direct {v2, v3}, LVa/N3;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 37
    .line 38
    .line 39
    move-result-wide v1

    .line 40
    const-wide/16 v5, -0x1

    .line 41
    .line 42
    cmp-long v1, v1, v5

    .line 43
    .line 44
    rsub-int/lit8 v1, v1, 0x18

    .line 45
    .line 46
    const-string v2, ""

    .line 47
    .line 48
    invoke-static {v2}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    sub-int/2addr v4, v2

    .line 53
    int-to-byte v2, v4

    .line 54
    const-string v3, "\u000b\u0000\u0006\u0010\n\u000b\u0000\u0005\u0007\u000b\u0004\u0006\u0001\u0006\u0006\u001d\u0008\u0006\u0008\u001d\u0008\r}"

    .line 55
    .line 56
    invoke-static {v2, v1, v3}, LVa/v5;->D0(BILjava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    new-instance v2, LVa/t5;

    .line 65
    .line 66
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    const-wide/16 v1, 0x0

    .line 73
    .line 74
    invoke-static {v1, v2}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    rsub-int/lit8 v1, v1, 0x14

    .line 79
    .line 80
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    shr-int/lit8 v2, v2, 0x10

    .line 85
    .line 86
    add-int/lit8 v2, v2, 0x3

    .line 87
    .line 88
    int-to-byte v2, v2

    .line 89
    const-string v3, "\u000b\u0000\u0010\"\u0004\t\u0003\u0006\u0018\u0005\u0017\u0004\u0000\u0019\u0008\u0006\u0008\u001d\u0008\rn"

    .line 90
    .line 91
    invoke-static {v2, v1, v3}, LVa/v5;->D0(BILjava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    new-instance v2, LVa/u5;

    .line 100
    .line 101
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    sget v1, LVa/v5;->T:I

    .line 108
    .line 109
    add-int/lit8 v1, v1, 0x5

    .line 110
    .line 111
    rem-int/lit16 v1, v1, 0x80

    .line 112
    .line 113
    sput v1, LVa/v5;->U:I

    .line 114
    .line 115
    return-object v0
.end method

.method public final t0()Ljava/lang/String;
    .locals 7

    .line 1
    sget v0, LVa/v5;->T:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x23

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/v5;->U:I

    .line 8
    .line 9
    invoke-virtual {p0}, LVa/v5;->u0()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    sget v1, LVa/v5;->U:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x21

    .line 18
    .line 19
    rem-int/lit16 v2, v1, 0x80

    .line 20
    .line 21
    sput v2, LVa/v5;->T:I

    .line 22
    .line 23
    rem-int/lit8 v1, v1, 0x2

    .line 24
    .line 25
    const-string v2, "T"

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    const-wide/16 v5, 0x1

    .line 34
    .line 35
    cmp-long v1, v3, v5

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    add-int/lit8 v4, v4, 0x75

    .line 43
    .line 44
    int-to-byte v4, v4

    .line 45
    invoke-static {v4, v1, v2}, LVa/v5;->D0(BILjava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    aget-object v0, v0, v3

    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    const-wide/16 v5, 0x0

    .line 65
    .line 66
    cmp-long v1, v3, v5

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    add-int/lit8 v4, v4, 0x27

    .line 74
    .line 75
    int-to-byte v4, v4

    .line 76
    invoke-static {v4, v1, v2}, LVa/v5;->D0(BILjava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    aget-object v0, v0, v3

    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_1
    const/4 v0, 0x0

    .line 92
    return-object v0
.end method

.method public final u0()Ljava/lang/String;
    .locals 7

    .line 1
    sget v0, LVa/v5;->T:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x63

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/v5;->U:I

    .line 8
    .line 9
    const/16 v0, 0x2e

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/16 v2, 0x79

    .line 13
    .line 14
    const/16 v3, 0x2f

    .line 15
    .line 16
    const/16 v4, 0xc6

    .line 17
    .line 18
    :try_start_0
    filled-new-array {v2, v3, v4, v0}, [I

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-static {v1, v0, v2}, LVa/v5;->F0(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    int-to-byte v2, v2

    .line 40
    neg-int v2, v2

    .line 41
    const-string v3, "v"

    .line 42
    .line 43
    const-string v4, ""

    .line 44
    .line 45
    const/16 v5, 0x30

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    invoke-static {v4, v5, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    add-int/lit8 v4, v4, 0x16

    .line 53
    .line 54
    int-to-byte v4, v4

    .line 55
    invoke-static {v4, v2, v3}, LVa/v5;->D0(BILjava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    new-array v3, v6, [Ljava/lang/Class;

    .line 64
    .line 65
    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-array v2, v6, [Ljava/lang/Object;

    .line 70
    .line 71
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    .line 77
    sget v2, LVa/v5;->U:I

    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1b

    .line 80
    .line 81
    rem-int/lit16 v3, v2, 0x80

    .line 82
    .line 83
    sput v3, LVa/v5;->T:I

    .line 84
    .line 85
    rem-int/lit8 v2, v2, 0x2

    .line 86
    .line 87
    if-nez v2, :cond_0

    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_0
    throw v1

    .line 91
    :catch_0
    :try_start_1
    invoke-static {}, Lio/presage/common/PresageSdk;->getAdsSdkVersion()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    return-object v0

    .line 96
    :catchall_0
    return-object v1
.end method

.method public final w0(Ljava/lang/String;)Ljava/lang/Class;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0xb

    .line 8
    .line 9
    const/16 v3, 0x26

    .line 10
    .line 11
    const/16 v4, 0x13

    .line 12
    .line 13
    const/16 v5, 0x8

    .line 14
    .line 15
    const/16 v6, 0x9

    .line 16
    .line 17
    const-string v7, ""

    .line 18
    .line 19
    const/4 v8, 0x7

    .line 20
    const/16 v9, 0x5d

    .line 21
    .line 22
    const/16 v10, 0x19

    .line 23
    .line 24
    const/4 v11, 0x5

    .line 25
    const/4 v12, 0x2

    .line 26
    const/16 v13, 0xa

    .line 27
    .line 28
    const/4 v14, 0x1

    .line 29
    const/4 v15, 0x0

    .line 30
    sparse-switch v1, :sswitch_data_0

    .line 31
    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :sswitch_0
    const/16 v1, 0x4e

    .line 36
    .line 37
    const/16 v2, 0x27

    .line 38
    .line 39
    filled-new-array {v1, v10, v2, v15}, [I

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v2, "\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000"

    .line 44
    .line 45
    invoke-static {v2, v1, v15}, LVa/v5;->F0(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    move v2, v13

    .line 60
    goto/16 :goto_1

    .line 61
    .line 62
    :sswitch_1
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    shr-int/lit8 v1, v1, 0x10

    .line 67
    .line 68
    rsub-int/lit8 v1, v1, 0x2f

    .line 69
    .line 70
    invoke-static {v15, v15}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    add-int/2addr v2, v9

    .line 75
    int-to-byte v2, v2

    .line 76
    const-string v3, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0008\u000b\u0002\u0003\u0001\n\u000b\u0000\u0005\u0007\u000b\u0004\u0006\u0001\u0006\u0008\u0005\u000c\u0005\u0000\u000e\n\u000b\u0000\u0005\u0007\u000b\u0004\u0006\u0001\u0006\u0007\u0011\u0010\u0008\u0003\u000c\u0004\u0006\u00d6"

    .line 77
    .line 78
    invoke-static {v2, v1, v3}, LVa/v5;->D0(BILjava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    move v2, v12

    .line 93
    goto/16 :goto_1

    .line 94
    .line 95
    :sswitch_2
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    shr-int/lit8 v1, v1, 0x10

    .line 100
    .line 101
    rsub-int/lit8 v1, v1, 0x16

    .line 102
    .line 103
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 104
    .line 105
    .line 106
    move-result-wide v2

    .line 107
    const-wide/16 v4, -0x1

    .line 108
    .line 109
    cmp-long v2, v2, v4

    .line 110
    .line 111
    add-int/lit8 v2, v2, 0x69

    .line 112
    .line 113
    int-to-byte v2, v2

    .line 114
    const-string v3, "\u0018\u0006\u000f\u0006\u000b\u0004\u0000\n\u0006\u0004\u0006\u0004\u0008\u0006\u000e\u000f\u0006\u0004\u000c\u0003\u0010\u0016"

    .line 115
    .line 116
    invoke-static {v2, v1, v3}, LVa/v5;->D0(BILjava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_3

    .line 129
    .line 130
    sget v0, LVa/v5;->T:I

    .line 131
    .line 132
    add-int/lit8 v0, v0, 0x61

    .line 133
    .line 134
    rem-int/lit16 v0, v0, 0x80

    .line 135
    .line 136
    sput v0, LVa/v5;->U:I

    .line 137
    .line 138
    const/4 v2, 0x3

    .line 139
    goto/16 :goto_1

    .line 140
    .line 141
    :sswitch_3
    invoke-static {v7, v15}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    sub-int/2addr v8, v1

    .line 146
    const-wide/16 v1, 0x0

    .line 147
    .line 148
    invoke-static {v1, v2}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    rsub-int/lit8 v1, v1, 0x12

    .line 153
    .line 154
    int-to-byte v1, v1

    .line 155
    const-string v2, "\u0016\u0001\u0000\u000b\u0008\tw"

    .line 156
    .line 157
    invoke-static {v1, v8, v2}, LVa/v5;->D0(BILjava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    xor-int/2addr v0, v14

    .line 170
    if-eq v0, v14, :cond_3

    .line 171
    .line 172
    move v2, v11

    .line 173
    goto/16 :goto_1

    .line 174
    .line 175
    :sswitch_4
    const/16 v1, 0x22

    .line 176
    .line 177
    const/16 v2, 0x1b

    .line 178
    .line 179
    filled-new-array {v1, v2, v9, v6}, [I

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    const-string v2, "\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000"

    .line 184
    .line 185
    invoke-static {v2, v1, v15}, LVa/v5;->F0(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_3

    .line 198
    .line 199
    move v2, v5

    .line 200
    goto/16 :goto_1

    .line 201
    .line 202
    :sswitch_5
    const/16 v1, 0xf

    .line 203
    .line 204
    const/16 v2, 0x40

    .line 205
    .line 206
    filled-new-array {v1, v4, v2, v15}, [I

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    const-string v2, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000"

    .line 211
    .line 212
    invoke-static {v2, v1, v14}, LVa/v5;->F0(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_3

    .line 225
    .line 226
    move v2, v8

    .line 227
    goto/16 :goto_1

    .line 228
    .line 229
    :sswitch_6
    const-string v1, "\u0001\u0000\u0000\u0001\u0001"

    .line 230
    .line 231
    filled-new-array {v15, v11, v15, v15}, [I

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-static {v1, v2, v15}, LVa/v5;->F0(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-eqz v0, :cond_3

    .line 248
    .line 249
    const/4 v2, 0x4

    .line 250
    goto/16 :goto_1

    .line 251
    .line 252
    :sswitch_7
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    shr-int/lit8 v1, v1, 0x10

    .line 257
    .line 258
    add-int/lit8 v1, v1, 0x2c

    .line 259
    .line 260
    invoke-static {v7, v15, v15}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    add-int/lit8 v2, v2, 0x12

    .line 265
    .line 266
    int-to-byte v2, v2

    .line 267
    const-string v3, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0008\u000b\u0002\u0003\u0001\n\u000b\u0000\u0005\u0007\u000b\u0004\u0006\u0001\u0006\u0008\u0005\u000f\u0006\u000b\u0004\u0000\n\u0006\u0004\u0006\u0004\u0008\u0006\u000e\u000f\u0006\u0004\u000c\u0003\u0010\u0016"

    .line 268
    .line 269
    invoke-static {v2, v1, v3}, LVa/v5;->D0(BILjava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-eq v0, v14, :cond_0

    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :cond_0
    move v2, v15

    .line 286
    goto/16 :goto_1

    .line 287
    .line 288
    :sswitch_8
    invoke-static {v15, v15}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    sub-int/2addr v13, v1

    .line 293
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    int-to-byte v1, v1

    .line 298
    rsub-int/lit8 v1, v1, 0x34

    .line 299
    .line 300
    int-to-byte v1, v1

    .line 301
    const-string v4, "\u0017\u0002\u0013\t\n\u001c\u0010\u0006\u000b\u001d"

    .line 302
    .line 303
    invoke-static {v1, v13, v4}, LVa/v5;->D0(BILjava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-eqz v0, :cond_3

    .line 316
    .line 317
    sget v0, LVa/v5;->U:I

    .line 318
    .line 319
    add-int/lit8 v0, v0, 0x2f

    .line 320
    .line 321
    rem-int/lit16 v1, v0, 0x80

    .line 322
    .line 323
    sput v1, LVa/v5;->T:I

    .line 324
    .line 325
    rem-int/2addr v0, v12

    .line 326
    if-eqz v0, :cond_4

    .line 327
    .line 328
    move v2, v3

    .line 329
    goto/16 :goto_1

    .line 330
    .line 331
    :sswitch_9
    const/16 v1, 0x6b

    .line 332
    .line 333
    filled-new-array {v11, v13, v1, v15}, [I

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    const-string v2, "\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000"

    .line 338
    .line 339
    invoke-static {v2, v1, v14}, LVa/v5;->F0(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-eqz v0, :cond_3

    .line 352
    .line 353
    sget v0, LVa/v5;->U:I

    .line 354
    .line 355
    add-int/lit8 v0, v0, 0x43

    .line 356
    .line 357
    rem-int/lit16 v1, v0, 0x80

    .line 358
    .line 359
    sput v1, LVa/v5;->T:I

    .line 360
    .line 361
    rem-int/2addr v0, v12

    .line 362
    if-eqz v0, :cond_1

    .line 363
    .line 364
    move v2, v10

    .line 365
    goto :goto_1

    .line 366
    :cond_1
    const/4 v2, 0x6

    .line 367
    goto :goto_1

    .line 368
    :sswitch_a
    invoke-static {v15}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    sub-int/2addr v4, v1

    .line 373
    invoke-static {v15, v15}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    sub-int/2addr v3, v1

    .line 378
    int-to-byte v1, v3

    .line 379
    const-string v2, "\u000f\u0006\u000b\u0004\u0000\n\u0006\u0004\u0006\u0004\u0008\u0006\u000e\u000f\u0006\u0004\u000c\u0003\u0010\u0016"

    .line 380
    .line 381
    invoke-static {v1, v4, v2}, LVa/v5;->D0(BILjava/lang/String;)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    if-eqz v0, :cond_3

    .line 394
    .line 395
    move v2, v14

    .line 396
    goto :goto_1

    .line 397
    :sswitch_b
    const/16 v1, 0x3d

    .line 398
    .line 399
    const/16 v3, 0x11

    .line 400
    .line 401
    filled-new-array {v1, v3, v15, v2}, [I

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    const-string v2, "\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000"

    .line 406
    .line 407
    invoke-static {v2, v1, v15}, LVa/v5;->F0(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v0

    .line 419
    if-nez v0, :cond_2

    .line 420
    .line 421
    goto :goto_0

    .line 422
    :cond_2
    move v2, v6

    .line 423
    goto :goto_1

    .line 424
    :sswitch_c
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    shr-int/lit8 v1, v1, 0x10

    .line 429
    .line 430
    sub-int/2addr v5, v1

    .line 431
    invoke-static {v15, v15}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    add-int/lit8 v1, v1, 0x77

    .line 436
    .line 437
    int-to-byte v1, v1

    .line 438
    const-string v2, "\u0010\u0013\u0019\u0000\u0007\u001b\u0002\u0006"

    .line 439
    .line 440
    invoke-static {v1, v5, v2}, LVa/v5;->D0(BILjava/lang/String;)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    if-eqz v0, :cond_3

    .line 453
    .line 454
    const/16 v2, 0xc

    .line 455
    .line 456
    goto :goto_1

    .line 457
    :cond_3
    :goto_0
    const/4 v2, -0x1

    .line 458
    :cond_4
    :goto_1
    packed-switch v2, :pswitch_data_0

    .line 459
    .line 460
    .line 461
    const/4 v0, 0x0

    .line 462
    return-object v0

    .line 463
    :pswitch_0
    const-class v0, Lio/presage/common/AdConfig;

    .line 464
    .line 465
    return-object v0

    .line 466
    :pswitch_1
    const-class v0, Lio/presage/common/network/models/RewardItem;

    .line 467
    .line 468
    return-object v0

    .line 469
    :pswitch_2
    const-class v0, Lio/presage/interstitial/optinvideo/PresageOptinVideoCallback;

    .line 470
    .line 471
    return-object v0

    .line 472
    :pswitch_3
    const-class v0, Lio/presage/interstitial/optinvideo/PresageOptinVideo;

    .line 473
    .line 474
    return-object v0

    .line 475
    :pswitch_4
    const-class v0, Lio/presage/interstitial/PresageInterstitialCallback;

    .line 476
    .line 477
    return-object v0

    .line 478
    :pswitch_5
    const-class v0, Lio/presage/interstitial/PresageInterstitial;

    .line 479
    .line 480
    return-object v0

    .line 481
    :pswitch_6
    const-class v0, Lio/presage/common/PresageSdk;

    .line 482
    .line 483
    return-object v0

    .line 484
    :pswitch_7
    const-class v0, Lio/presage/Presage;

    .line 485
    .line 486
    return-object v0

    .line 487
    :pswitch_8
    const-class v0, Lcom/ogury/sdk/Ogury;

    .line 488
    .line 489
    return-object v0

    .line 490
    :pswitch_9
    const-class v0, Lio/presage/interstitial/ui/InterstitialActivity;

    .line 491
    .line 492
    sget v1, LVa/v5;->T:I

    .line 493
    .line 494
    add-int/lit8 v1, v1, 0x75

    .line 495
    .line 496
    rem-int/lit16 v1, v1, 0x80

    .line 497
    .line 498
    sput v1, LVa/v5;->U:I

    .line 499
    .line 500
    return-object v0

    .line 501
    :pswitch_a
    const-class v0, Lio/presage/interstitial/InterstitialActivity;

    .line 502
    .line 503
    return-object v0

    .line 504
    nop

    .line 505
    :sswitch_data_0
    .sparse-switch
        -0x7d40069b -> :sswitch_c
        -0x71b679ae -> :sswitch_b
        -0x659cf985 -> :sswitch_a
        -0x37ef2ef5 -> :sswitch_9
        -0x246514fe -> :sswitch_8
        -0x78e542a -> :sswitch_7
        0x489d884 -> :sswitch_6
        0x29a82d7b -> :sswitch_5
        0x3fa306e0 -> :sswitch_4
        0x504000af -> :sswitch_3
        0x6f86af2f -> :sswitch_2
        0x7dc0525a -> :sswitch_1
        0x7ee598b7 -> :sswitch_0
    .end sparse-switch

    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
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
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_a
        :pswitch_9
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
