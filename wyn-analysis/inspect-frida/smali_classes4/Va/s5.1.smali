.class public final LVa/s5;
.super LVa/Z0;
.source "SourceFile"


# static fields
.field public static final R:[C

.field public static S:I = 0x0

.field public static T:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x8a

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/s5;->R:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        -0x72cds
        -0x48ds
        0x61c0s
        -0x11d6s
        0x5494s
        -0x22f6s
        0x4b64s
        -0x4e3es
        0x3e36s
        -0x5b74s
        0x2d1ds
        -0x6485s
        0x1efs
        -0x71des
        -0xb54s
        0x7d1as
        -0x1484s
        0x51c4s
        -0x21d0s
        0x44a6s
        0x4fs
        0x7600s
        -0x1345s
        0x6347s
        -0x261bs
        0x504as
        -0x39fcs
        0x3ca5s
        -0x4ca3s
        0x29eds
        -0x5f8bs
        0x1619s
        -0x7343s
        0x34fs
        0x79cbs
        -0xf98s
        0x661cs
        -0x236as
        0x535as
        0x4fs
        0x7600s
        -0x1345s
        0x6347s
        -0x261bs
        0x504as
        -0x39fcs
        0x3ca5s
        -0x4ca3s
        0x29eds
        -0x5f8bs
        0x1619s
        -0x7343s
        0x34fs
        0x79cbs
        -0xf98s
        0x661cs
        -0x236as
        0x535as
        -0x3617s
        0x4065s
        -0x4a00s
        0x2caes
        -0x5cdcs
        0x19c6s
        -0x6f96s
        0x604s
        0x1acas
        0x6c85s
        -0x9c2s
        0x79c2s
        -0x3ca0s
        0x4ad4s
        -0x2376s
        0x2623s
        -0x5624s
        0x3368s
        -0x4519s
        0xc8ds
        -0x69cbs
        0x19ffs
        0x6343s
        0x77f1s
        0x1bes
        -0x64fbs
        0x14f9s
        -0x51a5s
        0x27efs
        -0x4e4fs
        0x4b18s
        -0x3b19s
        0x5e53s
        -0x2824s
        -0x1d67s
        -0x6b18s
        0xe50s
        -0x7e6as
        0x3b18s
        -0x4d63s
        0x24e5s
        -0x21b7s
        0x51a1s
        -0x34ffs
        0x4285s
        -0xb0ds
        0x6e57s
        -0x1e50s
        -0x64dcs
        0x12a2s
        -0x7b02s
        0x3e71s
        -0x4e43s
        0x2b3cs
        -0x5d6es
        0x54fcs
        -0x31a2s
        0x41ces
        -0x4d0s
        -0x2364s
        -0x5513s
        0x3055s
        -0x4078s
        0x516s
        -0x7365s
        0x1ae4s
        -0x1fb4s
        0x6fb3s
        -0xaebs
        0x7c8ds
        -0x353ds
        0x505fs
        -0x2068s
        -0x5adcs
        0x2c95s
        -0x4515s
        0x5ds
        -0x7041s
        0x152fs
        -0x636fs
    .end array-data
.end method

.method public static C0(IIC)Ljava/lang/String;
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
    sget-object v3, LVa/s5;->R:[C

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
    const-wide v7, 0x725371f424e57667L    # 5.1864167246480845E242

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

.method public static D0(Lcom/ogury/ad/OguryInterstitialAd;Lcom/ogury/ad/OguryInterstitialAdListener;)V
    .locals 2

    .line 1
    sget v0, LVa/s5;->S:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x45

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/s5;->T:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/ogury/ad/OguryInterstitialAd;->setListener(Lcom/ogury/ad/OguryInterstitialAdListener;)V

    .line 12
    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/16 p0, 0x13

    .line 17
    .line 18
    div-int/lit8 p0, p0, 0x0

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static E0(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, "\u0c9c\ub7b6\u6a81\u86f8"

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
    const-wide v6, -0x7907957e4849f364L

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

.method public static F0(Lcom/ogury/ad/OguryRewardedAd;Lcom/ogury/ad/OguryRewardedAdListener;)V
    .locals 1

    .line 1
    sget v0, LVa/s5;->S:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/s5;->T:I

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/ogury/ad/OguryRewardedAd;->setListener(Lcom/ogury/ad/OguryRewardedAdListener;)V

    .line 10
    .line 11
    .line 12
    sget p0, LVa/s5;->S:I

    .line 13
    .line 14
    add-int/lit8 p0, p0, 0x31

    .line 15
    .line 16
    rem-int/lit16 p1, p0, 0x80

    .line 17
    .line 18
    sput p1, LVa/s5;->T:I

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
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    shr-int/lit8 v1, v1, 0x10

    .line 11
    .line 12
    const v2, 0xe2ea

    .line 13
    .line 14
    .line 15
    sub-int/2addr v2, v1

    .line 16
    int-to-char v1, v2

    .line 17
    const-string v2, ""

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static {v2, v2, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    rsub-int/lit8 v3, v3, 0x5c

    .line 25
    .line 26
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    shr-int/lit8 v4, v4, 0x10

    .line 31
    .line 32
    add-int/lit8 v4, v4, 0x19

    .line 33
    .line 34
    invoke-static {v3, v4, v1}, LVa/s5;->C0(IIC)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    new-instance v3, LVa/q5;

    .line 43
    .line 44
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    const/16 v1, 0x30

    .line 51
    .line 52
    invoke-static {v2, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    const v2, 0xdcee

    .line 57
    .line 58
    .line 59
    sub-int/2addr v2, v1

    .line 60
    int-to-char v1, v2

    .line 61
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    shr-int/lit8 v2, v2, 0x8

    .line 66
    .line 67
    add-int/lit8 v2, v2, 0x75

    .line 68
    .line 69
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    shr-int/lit8 v3, v3, 0x10

    .line 74
    .line 75
    rsub-int/lit8 v3, v3, 0x15

    .line 76
    .line 77
    invoke-static {v2, v3, v1}, LVa/s5;->C0(IIC)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    new-instance v2, LVa/r5;

    .line 86
    .line 87
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    sget v1, LVa/s5;->T:I

    .line 94
    .line 95
    add-int/lit8 v1, v1, 0x73

    .line 96
    .line 97
    rem-int/lit16 v1, v1, 0x80

    .line 98
    .line 99
    sput v1, LVa/s5;->S:I

    .line 100
    .line 101
    return-object v0
.end method

.method public final t0()Ljava/lang/String;
    .locals 4

    .line 1
    sget v0, LVa/s5;->S:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x61

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/s5;->T:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :try_start_0
    invoke-static {}, Lcom/ogury/sdk/Ogury;->getSdkVersion()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    sget v2, LVa/s5;->T:I

    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x5

    .line 17
    .line 18
    rem-int/lit16 v3, v2, 0x80

    .line 19
    .line 20
    sput v3, LVa/s5;->S:I

    .line 21
    .line 22
    rem-int/lit8 v2, v2, 0x2

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_0
    throw v0

    .line 28
    :catchall_0
    return-object v0
.end method

.method public final w0(Ljava/lang/String;)Ljava/lang/Class;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x3

    .line 7
    const/16 v3, 0x30

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const-wide/16 v5, 0x0

    .line 11
    .line 12
    const-string v7, ""

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    sparse-switch v0, :sswitch_data_0

    .line 16
    .line 17
    .line 18
    goto/16 :goto_1

    .line 19
    .line 20
    :sswitch_0
    invoke-static {v7, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v4

    .line 25
    int-to-char v0, v0

    .line 26
    const v1, 0x7e2ce527

    .line 27
    .line 28
    .line 29
    invoke-static {v8, v8, v8}, Landroid/graphics/Color;->rgb(III)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    sub-int/2addr v1, v2

    .line 34
    const-string v2, "\u2706\u2ce5\uf47f\u5258"

    .line 35
    .line 36
    const-string v3, "\ucf08\uf638\u404c\ubeb2\u776c\u07c7\u1efa\ub217\u2024\u33b5\u94ac\ued53\ua3c2\u2e64\uf048\u5329\u4d63\u7580\u01b1\uc230\ub804\u87f8\u3146\u8512\u8f61\ue09e\u1575\u22df\u969e\u42d5\u8432\u31c1\u0d04\ud753\udf98\u6d31\u2da7\u91ba\u0ed9\uf4cc\uc9af\ua9c2\udc1f\u5bf8\u02bf\uf3fa\u7033\ua81d\ud548"

    .line 37
    .line 38
    invoke-static {v0, v2, v3, v1}, LVa/s5;->E0(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    move v1, v8

    .line 53
    goto/16 :goto_2

    .line 54
    .line 55
    :sswitch_1
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    shr-int/lit8 v0, v0, 0x10

    .line 60
    .line 61
    int-to-char v0, v0

    .line 62
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    shr-int/lit8 v1, v1, 0x10

    .line 67
    .line 68
    add-int/lit8 v1, v1, 0x14

    .line 69
    .line 70
    invoke-static {v7}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    rsub-int/lit8 v3, v3, 0x13

    .line 75
    .line 76
    invoke-static {v1, v3, v0}, LVa/s5;->C0(IIC)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_1

    .line 89
    .line 90
    sget p1, LVa/s5;->S:I

    .line 91
    .line 92
    add-int/lit8 p1, p1, 0x3f

    .line 93
    .line 94
    rem-int/lit16 p1, p1, 0x80

    .line 95
    .line 96
    sput p1, LVa/s5;->T:I

    .line 97
    .line 98
    :goto_0
    move v1, v2

    .line 99
    goto/16 :goto_2

    .line 100
    .line 101
    :sswitch_2
    const v0, -0xffe57b

    .line 102
    .line 103
    .line 104
    invoke-static {v8, v8, v8}, Landroid/graphics/Color;->rgb(III)I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    sub-int/2addr v0, v3

    .line 109
    int-to-char v0, v0

    .line 110
    invoke-static {v8}, Landroid/graphics/Color;->blue(I)I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    add-int/lit8 v3, v3, 0x42

    .line 115
    .line 116
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 117
    .line 118
    .line 119
    move-result-wide v7

    .line 120
    cmp-long v4, v7, v5

    .line 121
    .line 122
    add-int/lit8 v4, v4, 0xe

    .line 123
    .line 124
    invoke-static {v3, v4, v0}, LVa/s5;->C0(IIC)Ljava/lang/String;

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
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_1

    .line 137
    .line 138
    sget p1, LVa/s5;->S:I

    .line 139
    .line 140
    add-int/lit8 p1, p1, 0x55

    .line 141
    .line 142
    rem-int/lit16 v0, p1, 0x80

    .line 143
    .line 144
    sput v0, LVa/s5;->T:I

    .line 145
    .line 146
    rem-int/2addr p1, v1

    .line 147
    if-nez p1, :cond_0

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_0
    const/4 p1, 0x5

    .line 151
    move v1, p1

    .line 152
    goto/16 :goto_2

    .line 153
    .line 154
    :sswitch_3
    invoke-static {v7, v3, v8}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    add-int/2addr v0, v4

    .line 159
    int-to-char v0, v0

    .line 160
    const v1, -0x7efaf305

    .line 161
    .line 162
    .line 163
    invoke-static {v7, v8}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    add-int/2addr v2, v1

    .line 168
    const-string v1, "\ufbeb\u050c\udb81\u4bea"

    .line 169
    .line 170
    const-string v3, "\u4d88\u20e8\u80c1\ud3b1\u6b04\u0a04\u680e\ua309\u1389\u22e8\u0df6\u118a\u7d65\ud7a3\ue9cf\u8444\u915e\u6a86\u0834\u7939\ufa3c\u52d5\u6284"

    .line 171
    .line 172
    invoke-static {v0, v1, v3, v2}, LVa/s5;->E0(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-eqz p1, :cond_1

    .line 185
    .line 186
    const/4 v1, 0x6

    .line 187
    goto/16 :goto_2

    .line 188
    .line 189
    :sswitch_4
    invoke-static {v8}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    int-to-char v0, v0

    .line 194
    invoke-static {v8, v8}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    rsub-int/lit8 v1, v1, 0x27

    .line 199
    .line 200
    invoke-static {v7}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    add-int/lit8 v2, v2, 0x1b

    .line 205
    .line 206
    invoke-static {v1, v2, v0}, LVa/s5;->C0(IIC)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    if-eqz p1, :cond_1

    .line 219
    .line 220
    const/4 v1, 0x4

    .line 221
    goto/16 :goto_2

    .line 222
    .line 223
    :sswitch_5
    const v0, 0x88e3

    .line 224
    .line 225
    .line 226
    invoke-static {v7, v7, v8, v8}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    add-int/2addr v2, v0

    .line 231
    int-to-char v0, v2

    .line 232
    const v2, 0x31fab3

    .line 233
    .line 234
    .line 235
    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    add-int/2addr v3, v2

    .line 240
    const-string v2, "\ub300\u31fa\ue300\uf188"

    .line 241
    .line 242
    const-string v4, "\u5c17\uc24f\u35d3\u7613\u75bb"

    .line 243
    .line 244
    invoke-static {v0, v2, v4, v3}, LVa/s5;->E0(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

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
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    if-eqz p1, :cond_1

    .line 257
    .line 258
    goto :goto_2

    .line 259
    :sswitch_6
    invoke-static {v8, v8}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    add-int/lit16 v0, v0, 0x77be

    .line 264
    .line 265
    int-to-char v0, v0

    .line 266
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    shr-int/lit8 v1, v1, 0x10

    .line 271
    .line 272
    add-int/lit8 v1, v1, 0x51

    .line 273
    .line 274
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    shr-int/lit8 v2, v2, 0x16

    .line 279
    .line 280
    rsub-int/lit8 v2, v2, 0xb

    .line 281
    .line 282
    invoke-static {v1, v2, v0}, LVa/s5;->C0(IIC)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result p1

    .line 294
    if-eqz p1, :cond_1

    .line 295
    .line 296
    const/4 v1, 0x7

    .line 297
    goto :goto_2

    .line 298
    :sswitch_7
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 299
    .line 300
    .line 301
    move-result-wide v0

    .line 302
    cmp-long v0, v0, v5

    .line 303
    .line 304
    const v1, 0x8d79

    .line 305
    .line 306
    .line 307
    add-int/2addr v0, v1

    .line 308
    int-to-char v0, v0

    .line 309
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    shr-int/lit8 v1, v1, 0x10

    .line 314
    .line 315
    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    add-int/lit8 v2, v2, 0x14

    .line 320
    .line 321
    invoke-static {v1, v2, v0}, LVa/s5;->C0(IIC)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result p1

    .line 333
    if-eqz p1, :cond_1

    .line 334
    .line 335
    sget p1, LVa/s5;->T:I

    .line 336
    .line 337
    add-int/lit8 p1, p1, 0x4b

    .line 338
    .line 339
    rem-int/lit16 p1, p1, 0x80

    .line 340
    .line 341
    sput p1, LVa/s5;->S:I

    .line 342
    .line 343
    move v1, v4

    .line 344
    goto :goto_2

    .line 345
    :cond_1
    :goto_1
    const/4 v1, -0x1

    .line 346
    :goto_2
    packed-switch v1, :pswitch_data_0

    .line 347
    .line 348
    .line 349
    const/4 p1, 0x0

    .line 350
    return-object p1

    .line 351
    :pswitch_0
    const-class p1, Lcom/ogury/ad/OguryReward;

    .line 352
    .line 353
    return-object p1

    .line 354
    :pswitch_1
    const-class p1, Lcom/ogury/ad/OguryRewardedAdListener;

    .line 355
    .line 356
    return-object p1

    .line 357
    :pswitch_2
    const-class p1, Lcom/ogury/ad/OguryRewardedAd;

    .line 358
    .line 359
    return-object p1

    .line 360
    :pswitch_3
    const-class p1, Lcom/ogury/ad/OguryInterstitialAdListener;

    .line 361
    .line 362
    return-object p1

    .line 363
    :pswitch_4
    const-class p1, Lcom/ogury/ad/OguryInterstitialAd;

    .line 364
    .line 365
    return-object p1

    .line 366
    :pswitch_5
    const-class p1, Lcom/ogury/sdk/Ogury;

    .line 367
    .line 368
    return-object p1

    .line 369
    :pswitch_6
    const-class p1, Lcom/ogury/ad/interstitial/ui/InterstitialActivity;

    .line 370
    .line 371
    return-object p1

    .line 372
    nop

    .line 373
    :sswitch_data_0
    .sparse-switch
        -0x659cf985 -> :sswitch_7
        -0x2bcd5f2d -> :sswitch_6
        0x489d884 -> :sswitch_5
        0x4f127e7 -> :sswitch_4
        0xb254c49 -> :sswitch_3
        0x45af6875 -> :sswitch_2
        0x6aa7c213 -> :sswitch_1
        0x6f3bfec7 -> :sswitch_0
    .end sparse-switch

    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
