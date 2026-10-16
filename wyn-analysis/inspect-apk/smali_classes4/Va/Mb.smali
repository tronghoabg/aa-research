.class public abstract LVa/Mb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Lb;


# static fields
.field public static final c:[C

.field public static final d:[C

.field public static e:I = 0x0

.field public static f:I = 0x1


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x6b

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    new-array v1, v1, [C

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    sput-object v1, LVa/Mb;->c:[C

    .line 11
    .line 12
    new-array v0, v0, [C

    .line 13
    .line 14
    fill-array-data v0, :array_1

    .line 15
    .line 16
    .line 17
    sput-object v0, LVa/Mb;->d:[C

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :array_0
    .array-data 2
        0x41s
        0x64s
        0x20s
        0x69s
        0x73s
        0x70s
        0x6cs
        0x61s
        0x79s
        0x65s
        0x3as
        0x63s
        0x6bs
        0x66s
        0x72s
        0x6fs
        0x6ds
        0x6as
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
        0x47s
        0x48s
    .end array-data

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    nop

    .line 51
    :array_1
    .array-data 2
        -0x79cfs
        -0x3888s
        0x488s
        0x4250s
        -0x7c57s
        -0x3ee1s
        0xe88s
        0x4fe8s
        -0x728fs
        -0x353bs
        0x82ds
        0x49b0s
        -0x68c0s
        -0x2b97s
        0x15e0s
        0x5350s
        -0x6f3es
        -0x21c3s
        0x1fd2s
        -0x3a74s
        -0x7b3bs
        0x4735s
        0x1eas
        -0x3fefs
        -0x7d42s
        0x4d36s
        0xc5cs
        -0x3137s
        0x76s
        0x4105s
        -0x7d43s
        -0x3bcds
        0x590s
        0x477ds
        -0x7704s
        -0x3680s
        0xb01s
        0x4cafs
        -0x71b0s
        -0x303fs
        0x1174s
        0x5246s
        0x75cbs
        0x3493s
        -0x8d9s
        -0x4e08s
        0x7049s
        0x32f6s
        -0x28fs
        -0x43fas
        0x7e88s
        0x396as
        -0x6defs
        -0x2cb5s
        0x10f9s
        0x5662s
        -0x6873s
        -0x2adds
        0x1afas
        0x5bc3s
        -0x66bcs
        -0x2105s
        0x1c04s
        0x5d82s
        -0x7c88s
        0x5a05s
        0x1b4cs
        -0x272cs
        -0x619fs
        0x5f9as
        0x1d3cs
        -0x2d60s
        -0x6c2bs
        0x5156s
        0x16d8s
        -0x2bf2s
        -0x6a71s
        0x4b2cs
        0x841s
        0x5d0as
        0x1c6bs
        -0x202es
        0x2e56s
        0x6f0ds
        -0x5347s
        -0x15c8s
        0x2bd1s
        0x692fs
        -0x5908s
        -0x186bs
        0x2516s
        0x62bes
        -0x5fa1s
        -0x1e22s
        0x3f6ds
        0x7c08s
        -0x4225s
        -0x4des
        0x38a5s
        0x765as
        -0x481bs
        -0xa9ds
        0x3243s
        0x73a5s
        -0x4ed8s
        -0x3138s
        0xc5ds
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lx4/d;

    .line 5
    .line 6
    const/16 v1, 0x1c

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lx4/d;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LVa/Mb;->b:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public static g(BILjava/lang/String;)Ljava/lang/String;
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
    sget-object v1, LVa/Mb;->c:[C

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
    div-int/lit8 v7, v4, 0x5

    .line 57
    .line 58
    rem-int/lit8 v4, v4, 0x5

    .line 59
    .line 60
    div-int/lit8 v8, v6, 0x5

    .line 61
    .line 62
    rem-int/lit8 v6, v6, 0x5

    .line 63
    .line 64
    if-ne v4, v6, :cond_2

    .line 65
    .line 66
    add-int/lit8 v7, v7, 0x4

    .line 67
    .line 68
    rem-int/lit8 v7, v7, 0x5

    .line 69
    .line 70
    add-int/lit8 v8, v8, 0x4

    .line 71
    .line 72
    rem-int/lit8 v8, v8, 0x5

    .line 73
    .line 74
    mul-int/lit8 v7, v7, 0x5

    .line 75
    .line 76
    add-int/2addr v7, v4

    .line 77
    mul-int/lit8 v8, v8, 0x5

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
    add-int/lit8 v4, v4, 0x4

    .line 92
    .line 93
    rem-int/lit8 v4, v4, 0x5

    .line 94
    .line 95
    add-int/lit8 v6, v6, 0x4

    .line 96
    .line 97
    rem-int/lit8 v6, v6, 0x5

    .line 98
    .line 99
    mul-int/lit8 v7, v7, 0x5

    .line 100
    .line 101
    add-int/2addr v7, v4

    .line 102
    mul-int/lit8 v8, v8, 0x5

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
    mul-int/lit8 v7, v7, 0x5

    .line 115
    .line 116
    add-int/2addr v7, v6

    .line 117
    mul-int/lit8 v8, v8, 0x5

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

.method public static o(IIC)Ljava/lang/String;
    .locals 9

    .line 1
    sget-object v0, LVa/Ab;->u:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-array v1, p0, [C

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
    if-ge v2, p0, :cond_0

    .line 12
    .line 13
    sget-object v3, LVa/Mb;->d:[C

    .line 14
    .line 15
    add-int v4, p1, v2

    .line 16
    .line 17
    aget-char v3, v3, v4

    .line 18
    .line 19
    int-to-long v3, v3

    .line 20
    int-to-long v5, v2

    .line 21
    const-wide v7, -0x5d8e43f8aa4bbe94L    # -9.089514614797339E-143

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
.method public declared-synchronized e()Lorg/json/JSONObject;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LVa/Mb;->a:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object v0

    .line 8
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    throw v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto :goto_0
.end method

.method public f(Lorg/json/JSONObject;Ljava/lang/Object;)V
    .locals 5

    .line 1
    sget v0, LVa/Mb;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Mb;->f:I

    .line 8
    .line 9
    :try_start_0
    sget-object v0, LVa/sa;->e:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    const/4 v2, 0x1

    .line 16
    xor-int/2addr v1, v2

    .line 17
    if-eq v1, v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget v1, LVa/Mb;->e:I

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x29

    .line 23
    .line 24
    rem-int/lit16 v1, v1, 0x80

    .line 25
    .line 26
    sput v1, LVa/Mb;->f:I

    .line 27
    .line 28
    :try_start_1
    invoke-virtual {p0, p2}, LVa/Mb;->q(Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 33
    .line 34
    .line 35
    sget p2, LVa/Mb;->e:I

    .line 36
    .line 37
    add-int/lit8 p2, p2, 0x15

    .line 38
    .line 39
    rem-int/lit16 p2, p2, 0x80

    .line 40
    .line 41
    sput p2, LVa/Mb;->f:I

    .line 42
    .line 43
    :goto_0
    :try_start_2
    sget-object p2, LVa/sa;->f:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    invoke-static {}, LVa/pb;->g0()J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    invoke-virtual {p1, p2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 56
    .line 57
    .line 58
    sget p1, LVa/Mb;->f:I

    .line 59
    .line 60
    add-int/lit8 p1, p1, 0x4d

    .line 61
    .line 62
    rem-int/lit16 p1, p1, 0x80

    .line 63
    .line 64
    sput p1, LVa/Mb;->e:I

    .line 65
    .line 66
    return-void

    .line 67
    :catch_0
    move-exception p1

    .line 68
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    const/4 v0, 0x0

    .line 73
    cmpl-float p2, p2, v0

    .line 74
    .line 75
    add-int/lit8 p2, p2, 0xd

    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    invoke-static {v0}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 79
    .line 80
    .line 81
    move-result-wide v1

    .line 82
    const-wide/16 v3, 0x0

    .line 83
    .line 84
    cmp-long v1, v1, v3

    .line 85
    .line 86
    add-int/lit16 v1, v1, 0x5a44

    .line 87
    .line 88
    int-to-char v1, v1

    .line 89
    const-string v2, ""

    .line 90
    .line 91
    invoke-static {v2}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    add-int/lit8 v3, v3, 0x41

    .line 96
    .line 97
    invoke-static {p2, v3, v1}, LVa/Mb;->o(IIC)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    add-int/lit8 v1, v1, 0x19

    .line 110
    .line 111
    invoke-static {v2, v2, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    rsub-int v0, v0, 0x2e13

    .line 116
    .line 117
    int-to-char v0, v0

    .line 118
    invoke-static {v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    rsub-int/lit8 v2, v2, 0x52

    .line 123
    .line 124
    invoke-static {v1, v2, v0}, LVa/Mb;->o(IIC)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {p2, v0, p1}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    :cond_1
    return-void
.end method

.method public h(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V
    .locals 5

    .line 1
    sget v0, LVa/Mb;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x11

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Mb;->f:I

    .line 8
    .line 9
    invoke-virtual {p0, p1, p3}, LVa/Mb;->f(Lorg/json/JSONObject;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    shr-int/lit8 v0, v0, 0x10

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0xd

    .line 19
    .line 20
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    const-wide/16 v3, 0x0

    .line 25
    .line 26
    cmp-long v1, v1, v3

    .line 27
    .line 28
    const v2, 0x9251

    .line 29
    .line 30
    .line 31
    add-int/2addr v1, v2

    .line 32
    int-to-char v1, v1

    .line 33
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    shr-int/lit8 v2, v2, 0x10

    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x34

    .line 40
    .line 41
    invoke-static {v0, v2, v1}, LVa/Mb;->o(IIC)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p0, v0, p1}, LVa/Mb;->i(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, LVa/Mb;->p()LVa/Lb;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {v0, p1, p2, p3}, LVa/Lb;->h(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget p1, LVa/Mb;->e:I

    .line 60
    .line 61
    add-int/lit8 p1, p1, 0xf

    .line 62
    .line 63
    rem-int/lit16 p1, p1, 0x80

    .line 64
    .line 65
    sput p1, LVa/Mb;->f:I

    .line 66
    .line 67
    return-void
.end method

.method public i(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 8

    .line 1
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shr-int/lit8 v0, v0, 0x10

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0xe

    .line 8
    .line 9
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    shr-int/lit8 v1, v1, 0x8

    .line 14
    .line 15
    add-int/lit16 v1, v1, 0x5a44

    .line 16
    .line 17
    int-to-char v1, v1

    .line 18
    const-string v2, ""

    .line 19
    .line 20
    invoke-static {v2}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    rsub-int/lit8 v2, v2, 0x41

    .line 25
    .line 26
    invoke-static {v0, v2, v1}, LVa/Mb;->o(IIC)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    const-wide/16 v4, 0x0

    .line 55
    .line 56
    cmp-long v2, v2, v4

    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x2

    .line 59
    .line 60
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 61
    .line 62
    .line 63
    move-result-wide v6

    .line 64
    cmp-long v3, v6, v4

    .line 65
    .line 66
    rsub-int v3, v3, 0x5d2b

    .line 67
    .line 68
    int-to-char v3, v3

    .line 69
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    shr-int/lit8 v4, v4, 0x8

    .line 74
    .line 75
    rsub-int/lit8 v4, v4, 0x4f

    .line 76
    .line 77
    invoke-static {v2, v4, v3}, LVa/Mb;->o(IIC)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    sget v1, LVa/Ab;->s:I

    .line 96
    .line 97
    add-int/lit8 v1, v1, 0x61

    .line 98
    .line 99
    rem-int/lit16 v2, v1, 0x80

    .line 100
    .line 101
    sput v2, LVa/Ab;->r:I

    .line 102
    .line 103
    rem-int/lit8 v1, v1, 0x2

    .line 104
    .line 105
    const/4 v2, 0x0

    .line 106
    invoke-static {v0, v0, p1, p2, v2}, LVa/Ab;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 107
    .line 108
    .line 109
    sget p1, LVa/Mb;->f:I

    .line 110
    .line 111
    add-int/lit8 p1, p1, 0x2b

    .line 112
    .line 113
    rem-int/lit16 p1, p1, 0x80

    .line 114
    .line 115
    sput p1, LVa/Mb;->e:I

    .line 116
    .line 117
    return-void
.end method

.method public declared-synchronized j(Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, LVa/Mb;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public k(Lorg/json/JSONObject;Landroid/view/View;Landroid/view/KeyEvent$Callback;)V
    .locals 3

    .line 1
    sget v0, LVa/Mb;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x53

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Mb;->f:I

    .line 8
    .line 9
    invoke-virtual {p0, p1, p3}, LVa/Mb;->f(Lorg/json/JSONObject;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0, v0}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/lit8 v1, v1, 0x9

    .line 18
    .line 19
    const v2, 0xc5cd

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v0}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v2

    .line 27
    int-to-char v0, v0

    .line 28
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    int-to-byte v2, v2

    .line 33
    add-int/lit8 v2, v2, 0x14

    .line 34
    .line 35
    invoke-static {v1, v2, v0}, LVa/Mb;->o(IIC)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p0, v0, p1}, LVa/Mb;->i(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, LVa/Mb;->p()LVa/Lb;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0, p1, p2, p3}, LVa/Lb;->k(Lorg/json/JSONObject;Landroid/view/View;Landroid/view/KeyEvent$Callback;)V

    .line 51
    .line 52
    .line 53
    sget p1, LVa/Mb;->f:I

    .line 54
    .line 55
    add-int/lit8 p1, p1, 0x1b

    .line 56
    .line 57
    rem-int/lit16 p1, p1, 0x80

    .line 58
    .line 59
    sput p1, LVa/Mb;->e:I

    .line 60
    .line 61
    return-void
.end method

.method public l(LVa/Lb;)V
    .locals 3

    .line 1
    sget v0, LVa/Mb;->e:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x73

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/Mb;->f:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    iput-object p1, p0, LVa/Mb;->a:Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x31

    .line 16
    .line 17
    rem-int/lit16 p1, v0, 0x80

    .line 18
    .line 19
    sput p1, LVa/Mb;->f:I

    .line 20
    .line 21
    rem-int/lit8 v0, v0, 0x2

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const/16 p1, 0x14

    .line 26
    .line 27
    div-int/lit8 p1, p1, 0x0

    .line 28
    .line 29
    :cond_0
    return-void

    .line 30
    :cond_1
    const/4 p1, 0x0

    .line 31
    throw p1
.end method

.method public m(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .line 1
    sget v0, LVa/Mb;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x41

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Mb;->f:I

    .line 8
    .line 9
    invoke-virtual {p0, p1, p3}, LVa/Mb;->f(Lorg/json/JSONObject;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const-string v0, ""

    .line 13
    .line 14
    const/16 v1, 0x30

    .line 15
    .line 16
    invoke-static {v0, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    add-int/lit8 v1, v1, 0xf

    .line 21
    .line 22
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    shr-int/lit8 v2, v2, 0x10

    .line 27
    .line 28
    int-to-char v2, v2

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static {v0, v3, v3}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    add-int/lit8 v0, v0, 0x1c

    .line 35
    .line 36
    invoke-static {v1, v0, v2}, LVa/Mb;->o(IIC)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, v0, p1}, LVa/Mb;->i(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, LVa/Mb;->p()LVa/Lb;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-interface {v0, p1, p2, p3}, LVa/Lb;->m(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sget p1, LVa/Mb;->e:I

    .line 55
    .line 56
    add-int/lit8 p1, p1, 0x63

    .line 57
    .line 58
    rem-int/lit16 p1, p1, 0x80

    .line 59
    .line 60
    sput p1, LVa/Mb;->f:I

    .line 61
    .line 62
    return-void
.end method

.method public n(Lorg/json/JSONObject;Landroid/view/View;LVa/e0;Ljava/lang/Object;)V
    .locals 4

    .line 1
    sget v0, LVa/Mb;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x79

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Mb;->e:I

    .line 8
    .line 9
    invoke-virtual {p0, p1, p4}, LVa/Mb;->f(Lorg/json/JSONObject;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0, v0}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/lit8 v1, v1, 0x22

    .line 18
    .line 19
    int-to-byte v1, v1

    .line 20
    const-string v2, ""

    .line 21
    .line 22
    invoke-static {v2}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    rsub-int/lit8 v2, v2, 0xa

    .line 27
    .line 28
    const-string v3, "\u0001\u0002\u0001\u000c\u0008\u0001\u000c\r\u0006\u0004\\"

    .line 29
    .line 30
    invoke-static {v1, v2, v3}, LVa/Mb;->g(BILjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p0, v1, p1}, LVa/Mb;->i(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, LVa/Mb;->p()LVa/Lb;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface {v1, p1, p2, p3, p4}, LVa/Lb;->n(Lorg/json/JSONObject;Landroid/view/View;LVa/e0;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget p1, LVa/Mb;->f:I

    .line 49
    .line 50
    add-int/lit8 p1, p1, 0x4f

    .line 51
    .line 52
    rem-int/lit16 p2, p1, 0x80

    .line 53
    .line 54
    sput p2, LVa/Mb;->e:I

    .line 55
    .line 56
    rem-int/lit8 p1, p1, 0x2

    .line 57
    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    const/16 p1, 0x11

    .line 61
    .line 62
    div-int/2addr p1, v0

    .line 63
    :cond_0
    return-void
.end method

.method public p()LVa/Lb;
    .locals 3

    .line 1
    sget v0, LVa/Mb;->f:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x35

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/Mb;->e:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, LVa/Mb;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, LVa/Lb;

    .line 16
    .line 17
    const/16 v2, 0x26

    .line 18
    .line 19
    div-int/lit8 v2, v2, 0x0

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v1, p0, LVa/Mb;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, LVa/Lb;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    :goto_0
    iget-object v0, p0, LVa/Mb;->a:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, LVa/Lb;

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_1
    iget-object v1, p0, LVa/Mb;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lx4/d;

    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x2b

    .line 40
    .line 41
    rem-int/lit16 v2, v0, 0x80

    .line 42
    .line 43
    sput v2, LVa/Mb;->e:I

    .line 44
    .line 45
    rem-int/lit8 v0, v0, 0x2

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    const/16 v0, 0x29

    .line 50
    .line 51
    div-int/lit8 v0, v0, 0x0

    .line 52
    .line 53
    :cond_2
    return-object v1
.end method

.method public abstract q(Ljava/lang/Object;)Ljava/lang/String;
.end method

.method public r(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V
    .locals 4

    .line 1
    sget v0, LVa/Mb;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x65

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Mb;->f:I

    .line 8
    .line 9
    invoke-virtual {p0, p1, p3}, LVa/Mb;->f(Lorg/json/JSONObject;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x12

    .line 21
    .line 22
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    shr-int/lit8 v1, v1, 0x10

    .line 27
    .line 28
    const v2, 0x8670

    .line 29
    .line 30
    .line 31
    sub-int/2addr v2, v1

    .line 32
    int-to-char v1, v2

    .line 33
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    shr-int/lit8 v2, v2, 0x16

    .line 38
    .line 39
    invoke-static {v0, v2, v1}, LVa/Mb;->o(IIC)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p0, v0, p1}, LVa/Mb;->i(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, LVa/Mb;->p()LVa/Lb;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v0, p1, p2, p3}, LVa/Lb;->r(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    sget p1, LVa/Mb;->f:I

    .line 58
    .line 59
    add-int/lit8 p1, p1, 0x59

    .line 60
    .line 61
    rem-int/lit16 p1, p1, 0x80

    .line 62
    .line 63
    sput p1, LVa/Mb;->e:I

    .line 64
    .line 65
    return-void
.end method

.method public s(Lorg/json/JSONObject;Ljava/lang/Object;LVa/e0;Ljava/lang/Object;)V
    .locals 4

    .line 1
    sget v0, LVa/Mb;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x27

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Mb;->e:I

    .line 8
    .line 9
    invoke-virtual {p0, p1, p4}, LVa/Mb;->f(Lorg/json/JSONObject;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/lit8 v1, v1, 0x1f

    .line 18
    .line 19
    int-to-byte v1, v1

    .line 20
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    shr-int/lit8 v2, v2, 0x10

    .line 25
    .line 26
    rsub-int/lit8 v2, v2, 0x13

    .line 27
    .line 28
    const-string v3, "\u0001\u0002\u0001\u000c\u0008\u0001\u000c\r\u0006\u0004\u0003\u000c\n\u0013\u0011\u0001\u0013\u0002Y"

    .line 29
    .line 30
    invoke-static {v1, v2, v3}, LVa/Mb;->g(BILjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p0, v1, p1}, LVa/Mb;->i(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, LVa/Mb;->p()LVa/Lb;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface {v1, p1, p2, p3, p4}, LVa/Lb;->s(Lorg/json/JSONObject;Ljava/lang/Object;LVa/e0;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget p1, LVa/Mb;->f:I

    .line 49
    .line 50
    add-int/lit8 p1, p1, 0x37

    .line 51
    .line 52
    rem-int/lit16 p2, p1, 0x80

    .line 53
    .line 54
    sput p2, LVa/Mb;->e:I

    .line 55
    .line 56
    rem-int/lit8 p1, p1, 0x2

    .line 57
    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    const/16 p1, 0x1b

    .line 61
    .line 62
    div-int/2addr p1, v0

    .line 63
    :cond_0
    return-void
.end method

.method public v(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V
    .locals 4

    .line 1
    sget v0, LVa/Mb;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Mb;->e:I

    .line 8
    .line 9
    invoke-virtual {p0, p1, p3}, LVa/Mb;->f(Lorg/json/JSONObject;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    shr-int/lit8 v0, v0, 0x10

    .line 17
    .line 18
    rsub-int/lit8 v0, v0, 0x78

    .line 19
    .line 20
    int-to-byte v0, v0

    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/lit8 v2, v2, 0xd

    .line 27
    .line 28
    const-string v3, "\u0001\u0002\u0003\u0002\u0004\u0000\u0006\u0007\u0008\t\u0006\u0004\u00b2"

    .line 29
    .line 30
    invoke-static {v0, v2, v3}, LVa/Mb;->g(BILjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p0, v0, p1}, LVa/Mb;->i(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, LVa/Mb;->p()LVa/Lb;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0, p1, p2, p3}, LVa/Lb;->v(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget p1, LVa/Mb;->e:I

    .line 49
    .line 50
    add-int/lit8 p1, p1, 0x1b

    .line 51
    .line 52
    rem-int/lit16 p2, p1, 0x80

    .line 53
    .line 54
    sput p2, LVa/Mb;->f:I

    .line 55
    .line 56
    rem-int/lit8 p1, p1, 0x2

    .line 57
    .line 58
    if-nez p1, :cond_0

    .line 59
    .line 60
    const/16 p1, 0x1c

    .line 61
    .line 62
    div-int/2addr p1, v1

    .line 63
    :cond_0
    return-void
.end method

.method public w(Lorg/json/JSONObject;Landroid/view/View;LVa/Vb;Ljava/lang/Object;)V
    .locals 7

    .line 1
    sget v0, LVa/Mb;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x79

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Mb;->f:I

    .line 8
    .line 9
    invoke-virtual {p0, p1, p4}, LVa/Mb;->f(Lorg/json/JSONObject;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    cmpl-float v1, v1, v2

    .line 19
    .line 20
    rsub-int/lit8 v1, v1, 0xa

    .line 21
    .line 22
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    shr-int/lit8 v2, v2, 0x10

    .line 27
    .line 28
    rsub-int v2, v2, 0x759c

    .line 29
    .line 30
    int-to-char v2, v2

    .line 31
    invoke-static {v0, v0}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    const-wide/16 v5, 0x0

    .line 36
    .line 37
    cmp-long v0, v3, v5

    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x2b

    .line 40
    .line 41
    invoke-static {v1, v0, v2}, LVa/Mb;->o(IIC)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p0, v0, p1}, LVa/Mb;->i(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, LVa/Mb;->p()LVa/Lb;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {v0, p1, p2, p3, p4}, LVa/Lb;->w(Lorg/json/JSONObject;Landroid/view/View;LVa/Vb;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget p1, LVa/Mb;->e:I

    .line 60
    .line 61
    add-int/lit8 p1, p1, 0x5f

    .line 62
    .line 63
    rem-int/lit16 p2, p1, 0x80

    .line 64
    .line 65
    sput p2, LVa/Mb;->f:I

    .line 66
    .line 67
    rem-int/lit8 p1, p1, 0x2

    .line 68
    .line 69
    if-eqz p1, :cond_0

    .line 70
    .line 71
    return-void

    .line 72
    :cond_0
    const/4 p1, 0x0

    .line 73
    throw p1
.end method
