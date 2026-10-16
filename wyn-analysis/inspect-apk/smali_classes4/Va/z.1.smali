.class public final LVa/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:[I

.field public static d:I = 0x0

.field public static e:I = 0x1

.field public static final f:[I

.field public static g:I = 0x0

.field public static h:I = 0x1

.field public static i:LVa/Xa; = null

.field public static j:I = 0x0

.field public static k:I = 0x1


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, LVa/z;->c:[I

    .line 9
    .line 10
    new-array v0, v0, [I

    .line 11
    .line 12
    fill-array-data v0, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v0, LVa/z;->f:[I

    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :array_0
    .array-data 4
        -0x1c6ac099
        -0x64eaccb0
        0x1f7f961b
        0x23b7561b
        -0x69d9f456
        0x145926a3
        -0x8fd5155
        -0x1c333232
        -0x7b6ef795
        -0x815227a
        0x246ce828
        0x60c7cce9
        -0x1338d605
        0x47630ab
        -0x752ceecc
        0x67f89da7
        -0x74cd8600
        0x30f710fd
    .end array-data

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    :array_1
    .array-data 4
        0x91b9f8a
        0x409679e7
        -0x649f7ff3
        -0x6be83d35
        0xa55a76a
        0x6569b94c
        0x13d73a9c
        -0x62da712a
        0x14331560
        -0x2a6d68eb
        -0x6c6feebf
        -0x37ebbbe7
        -0x73b9270d
        -0x35c756a7
        -0x138c5193
        -0x5d463280
        -0x689f4805
        0x3c425f24
    .end array-data
.end method

.method public constructor <init>(LVa/V;)V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, LVa/z;->b:Ljava/lang/Object;

    .line 15
    new-instance p1, LVa/q;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, LVa/q;-><init>(Ljava/lang/Object;I)V

    .line 16
    invoke-static {}, LVa/fb;->e()LVa/fb;

    move-result-object v0

    invoke-virtual {v0, p1}, LVa/fb;->f(LVa/db;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LVa/z;->a:Z

    .line 3
    new-instance v1, LVa/Ea;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 4
    invoke-direct {v1}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 5
    iput-boolean v0, v1, LVa/Ea;->b:Z

    .line 6
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, v1, LVa/Ea;->c:Ljava/util/HashSet;

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, v1, LVa/Ea;->a:Landroid/content/Context;

    const/16 v2, 0x1e

    .line 8
    filled-new-array {v0, v2, v0, v0}, [I

    move-result-object v3

    const/4 v4, 0x1

    const-string v5, "\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000"

    invoke-static {v5, v3, v4}, LVa/Ea;->c(Ljava/lang/String;[IZ)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    sget-object v4, LVa/Ea;->d:Ljava/lang/String;

    invoke-static {v4, v3}, LVa/Ab;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    new-instance v3, Landroid/content/IntentFilter;

    invoke-direct {v3}, Landroid/content/IntentFilter;-><init>()V

    const/16 v4, 0x24

    const/16 v5, 0x1a

    const/16 v6, 0x15

    .line 10
    filled-new-array {v2, v4, v5, v6}, [I

    move-result-object v2

    const-string v4, "\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001"

    invoke-static {v4, v2, v0}, LVa/Ea;->c(Ljava/lang/String;[IZ)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 11
    invoke-virtual {p1, v1, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 12
    iput-object v1, p0, LVa/z;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, LVa/z;->b:Ljava/lang/Object;

    .line 19
    iput-boolean p2, p0, LVa/z;->a:Z

    return-void
.end method

.method public static d(ILjava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [C

    .line 6
    .line 7
    sget-object v0, LVa/a;->u:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sput p0, LVa/a;->t:I

    .line 11
    .line 12
    array-length p0, p1

    .line 13
    new-array p0, p0, [C

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    sput v1, LVa/a;->s:I

    .line 17
    .line 18
    :goto_0
    sget v1, LVa/a;->s:I

    .line 19
    .line 20
    array-length v2, p1

    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    aget-char v2, p1, v1

    .line 24
    .line 25
    sget v3, LVa/a;->t:I

    .line 26
    .line 27
    mul-int/2addr v3, v1

    .line 28
    xor-int/2addr v2, v3

    .line 29
    int-to-long v2, v2

    .line 30
    const-wide v4, 0x7eb31312540b9634L    # 2.0438489232316778E302

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    xor-long/2addr v2, v4

    .line 36
    long-to-int v2, v2

    .line 37
    int-to-char v2, v2

    .line 38
    aput-char v2, p0, v1

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    sput v1, LVa/a;->s:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    .line 50
    .line 51
    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    return-object p1

    .line 54
    :goto_1
    monitor-exit v0

    .line 55
    throw p0
.end method

.method public static synthetic e(LVa/z;)LVa/Ea;
    .locals 2

    .line 1
    sget v0, LVa/z;->g:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x25

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, LVa/z;->h:I

    .line 8
    .line 9
    iget-object p0, p0, LVa/z;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, LVa/Ea;

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x6b

    .line 14
    .line 15
    rem-int/lit16 v1, v0, 0x80

    .line 16
    .line 17
    sput v1, LVa/z;->h:I

    .line 18
    .line 19
    rem-int/lit8 v0, v0, 0x2

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    throw p0
.end method

.method public static f(I[I)Ljava/lang/String;
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
    sget-object v4, LVa/z;->c:[I

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

.method public static g(Lcom/ironsource/adqualitysdk/sdk/ISAdQualityMediationNetwork;)Ljava/lang/String;
    .locals 9

    .line 1
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityMediationNetwork;->ADMOB:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityMediationNetwork;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const p0, 0x23e7f2de

    .line 8
    .line 9
    .line 10
    const v0, 0x4fe44304

    .line 11
    .line 12
    .line 13
    const v3, -0x3942e178

    .line 14
    .line 15
    .line 16
    const v4, -0x170a0362

    .line 17
    .line 18
    .line 19
    filled-new-array {v3, v4, p0, v0}, [I

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    cmp-long v0, v3, v1

    .line 28
    .line 29
    rsub-int/lit8 v0, v0, 0x6

    .line 30
    .line 31
    invoke-static {v0, p0}, LVa/z;->f(I[I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_0
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityMediationNetwork;->DT_FAIR_BID:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityMediationNetwork;

    .line 41
    .line 42
    if-ne p0, v0, :cond_1

    .line 43
    .line 44
    sget p0, LVa/z;->e:I

    .line 45
    .line 46
    add-int/lit8 p0, p0, 0x7d

    .line 47
    .line 48
    rem-int/lit16 p0, p0, 0x80

    .line 49
    .line 50
    sput p0, LVa/z;->d:I

    .line 51
    .line 52
    const p0, 0x4ff5df6c

    .line 53
    .line 54
    .line 55
    const v0, -0x11dee2c

    .line 56
    .line 57
    .line 58
    const v1, -0x2c388db2

    .line 59
    .line 60
    .line 61
    const v2, 0x5db253bc

    .line 62
    .line 63
    .line 64
    filled-new-array {v1, v2, p0, v0}, [I

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    shr-int/lit8 v0, v0, 0x8

    .line 73
    .line 74
    rsub-int/lit8 v0, v0, 0x7

    .line 75
    .line 76
    invoke-static {v0, p0}, LVa/z;->f(I[I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_1
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityMediationNetwork;->HELIUM:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityMediationNetwork;

    .line 86
    .line 87
    const/4 v3, 0x1

    .line 88
    const/4 v4, 0x0

    .line 89
    if-ne p0, v0, :cond_2

    .line 90
    .line 91
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    shr-int/lit8 p0, p0, 0x10

    .line 96
    .line 97
    add-int/lit8 p0, p0, 0x6

    .line 98
    .line 99
    invoke-static {v4}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    const/4 v1, 0x0

    .line 104
    cmpl-float v0, v0, v1

    .line 105
    .line 106
    rsub-int v0, v0, 0x100

    .line 107
    .line 108
    invoke-static {v4, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    rsub-int/lit8 v1, v1, 0x6

    .line 113
    .line 114
    const-string v2, "\u0002\n\ufffe\u0001\ufffa\ufffd"

    .line 115
    .line 116
    invoke-static {v2, p0, v0, v1, v3}, LVa/z;->l(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :cond_2
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityMediationNetwork;->LEVEL_PLAY:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityMediationNetwork;

    .line 126
    .line 127
    const/16 v5, 0x30

    .line 128
    .line 129
    const-string v6, ""

    .line 130
    .line 131
    if-ne p0, v0, :cond_3

    .line 132
    .line 133
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 134
    .line 135
    .line 136
    move-result-wide v7

    .line 137
    cmp-long p0, v7, v1

    .line 138
    .line 139
    rsub-int/lit8 p0, p0, 0xb

    .line 140
    .line 141
    invoke-static {v6, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    add-int/lit16 v0, v0, 0x103

    .line 146
    .line 147
    invoke-static {v4, v4}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 148
    .line 149
    .line 150
    move-result-wide v5

    .line 151
    cmp-long v1, v5, v1

    .line 152
    .line 153
    add-int/lit8 v1, v1, 0xa

    .line 154
    .line 155
    const-string v2, "\u0008\u0003\ufff8\u0005\u0006\u0002\u0001\ufffc\ufff6\u0006"

    .line 156
    .line 157
    invoke-static {v2, p0, v0, v1, v4}, LVa/z;->l(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    return-object p0

    .line 166
    :cond_3
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityMediationNetwork;->MAX:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityMediationNetwork;

    .line 167
    .line 168
    if-ne p0, v0, :cond_4

    .line 169
    .line 170
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    shr-int/lit8 p0, p0, 0x10

    .line 175
    .line 176
    add-int/lit8 p0, p0, 0x8

    .line 177
    .line 178
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    shr-int/lit8 v0, v0, 0x16

    .line 183
    .line 184
    add-int/lit16 v0, v0, 0x102

    .line 185
    .line 186
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 187
    .line 188
    .line 189
    move-result-wide v4

    .line 190
    cmp-long v1, v4, v1

    .line 191
    .line 192
    rsub-int/lit8 v1, v1, 0x8

    .line 193
    .line 194
    const-string v2, "\ufffc\t\u0002\uffff\u0003\u0003\ufff4\u0001"

    .line 195
    .line 196
    invoke-static {v2, p0, v0, v1, v3}, LVa/z;->l(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    sget v0, LVa/z;->d:I

    .line 205
    .line 206
    add-int/lit8 v0, v0, 0x5b

    .line 207
    .line 208
    rem-int/lit16 v0, v0, 0x80

    .line 209
    .line 210
    sput v0, LVa/z;->e:I

    .line 211
    .line 212
    return-object p0

    .line 213
    :cond_4
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityMediationNetwork;->UNITY:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityMediationNetwork;

    .line 214
    .line 215
    if-ne p0, v0, :cond_6

    .line 216
    .line 217
    sget p0, LVa/z;->e:I

    .line 218
    .line 219
    add-int/lit8 p0, p0, 0x79

    .line 220
    .line 221
    rem-int/lit16 v0, p0, 0x80

    .line 222
    .line 223
    sput v0, LVa/z;->d:I

    .line 224
    .line 225
    rem-int/lit8 p0, p0, 0x2

    .line 226
    .line 227
    const-string v0, "\u0000\ufffb\u0006\u000b\ufff3\ufff6\u0005\u0007"

    .line 228
    .line 229
    if-eqz p0, :cond_5

    .line 230
    .line 231
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 232
    .line 233
    .line 234
    move-result p0

    .line 235
    ushr-int/lit8 p0, p0, 0x1d

    .line 236
    .line 237
    shr-int p0, v5, p0

    .line 238
    .line 239
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    add-int/lit16 v1, v1, 0x1729

    .line 244
    .line 245
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    ushr-int/lit8 v2, v2, 0x48

    .line 250
    .line 251
    rsub-int/lit8 v2, v2, 0x5d

    .line 252
    .line 253
    invoke-static {v0, p0, v1, v2, v3}, LVa/z;->l(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    return-object p0

    .line 262
    :cond_5
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    shr-int/lit8 p0, p0, 0x10

    .line 267
    .line 268
    rsub-int/lit8 p0, p0, 0x8

    .line 269
    .line 270
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    shr-int/lit8 v1, v1, 0x18

    .line 275
    .line 276
    rsub-int v1, v1, 0x103

    .line 277
    .line 278
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    shr-int/lit8 v2, v2, 0x10

    .line 283
    .line 284
    rsub-int/lit8 v2, v2, 0x7

    .line 285
    .line 286
    invoke-static {v0, p0, v1, v2, v4}, LVa/z;->l(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    return-object p0

    .line 295
    :cond_6
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityMediationNetwork;->SELF_MEDIATED:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityMediationNetwork;

    .line 296
    .line 297
    if-ne p0, v0, :cond_7

    .line 298
    .line 299
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 300
    .line 301
    .line 302
    move-result p0

    .line 303
    shr-int/lit8 p0, p0, 0x10

    .line 304
    .line 305
    rsub-int/lit8 p0, p0, 0xc

    .line 306
    .line 307
    invoke-static {v4, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    add-int/lit16 v0, v0, 0xfd

    .line 312
    .line 313
    invoke-static {v4}, Landroid/os/Process;->getThreadPriority(I)I

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    add-int/lit8 v1, v1, 0x14

    .line 318
    .line 319
    shr-int/lit8 v1, v1, 0x6

    .line 320
    .line 321
    rsub-int/lit8 v1, v1, 0xb

    .line 322
    .line 323
    const-string v2, "\ufffd\u000c\ufff9\u0001\ufffc\ufffd\u0005\ufffe\u0004\ufffd\u000b\ufffc"

    .line 324
    .line 325
    invoke-static {v2, p0, v0, v1, v3}, LVa/z;->l(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    return-object p0

    .line 334
    :cond_7
    sget-object v0, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityMediationNetwork;->OTHER:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityMediationNetwork;

    .line 335
    .line 336
    if-ne p0, v0, :cond_8

    .line 337
    .line 338
    const p0, -0x395aa5c1

    .line 339
    .line 340
    .line 341
    const v0, -0x6cf2cc13

    .line 342
    .line 343
    .line 344
    const v1, -0x5a54484a

    .line 345
    .line 346
    .line 347
    const v2, -0x6bae5fc5

    .line 348
    .line 349
    .line 350
    filled-new-array {v1, v2, p0, v0}, [I

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    invoke-static {v4, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    rsub-int/lit8 v0, v0, 0x5

    .line 359
    .line 360
    invoke-static {v0, p0}, LVa/z;->f(I[I)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object p0

    .line 364
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object p0

    .line 368
    sget v0, LVa/z;->d:I

    .line 369
    .line 370
    add-int/lit8 v0, v0, 0x5

    .line 371
    .line 372
    rem-int/lit16 v0, v0, 0x80

    .line 373
    .line 374
    sput v0, LVa/z;->e:I

    .line 375
    .line 376
    return-object p0

    .line 377
    :cond_8
    return-object v6
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
    sget-object v4, LVa/z;->f:[I

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

.method public static k()Ljava/lang/String;
    .locals 5

    .line 1
    sget v0, LVa/z;->j:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x75

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/z;->k:I

    .line 8
    .line 9
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, LVa/G;->J()LVa/E;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget v1, LVa/E;->i:I

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x2b

    .line 23
    .line 24
    rem-int/lit16 v2, v1, 0x80

    .line 25
    .line 26
    sput v2, LVa/E;->j:I

    .line 27
    .line 28
    rem-int/lit8 v1, v1, 0x2

    .line 29
    .line 30
    iget-object v2, v0, LVa/E;->g:Ljava/lang/String;

    .line 31
    .line 32
    const-string v3, "\u0083\u008a\u0089"

    .line 33
    .line 34
    const-string v4, ""

    .line 35
    .line 36
    invoke-virtual {v0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v1, :cond_0

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-static {v4, v4, v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    mul-int/lit8 v1, v1, 0xa

    .line 48
    .line 49
    :goto_0
    invoke-static {v1, v3}, LVa/E;->t(ILjava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    const/4 v1, 0x0

    .line 63
    invoke-static {v4, v4, v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    add-int/lit8 v1, v1, 0x7f

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :goto_1
    sget v1, LVa/z;->k:I

    .line 71
    .line 72
    add-int/lit8 v1, v1, 0x45

    .line 73
    .line 74
    rem-int/lit16 v1, v1, 0x80

    .line 75
    .line 76
    sput v1, LVa/z;->j:I

    .line 77
    .line 78
    return-object v0
.end method

.method public static l(Ljava/lang/String;IIIZ)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->x:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    new-array v1, p1, [C

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    sput v2, LVa/Ab;->v:I

    .line 14
    .line 15
    :goto_0
    sget v3, LVa/Ab;->v:I

    .line 16
    .line 17
    if-ge v3, p1, :cond_0

    .line 18
    .line 19
    aget-char v4, p0, v3

    .line 20
    .line 21
    add-int/2addr v4, p2

    .line 22
    int-to-char v4, v4

    .line 23
    aput-char v4, v1, v3

    .line 24
    .line 25
    add-int/lit16 v4, v4, -0x95

    .line 26
    .line 27
    int-to-char v4, v4

    .line 28
    aput-char v4, v1, v3

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    sput v3, LVa/Ab;->v:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    if-lez p3, :cond_1

    .line 38
    .line 39
    sput p3, LVa/Ab;->w:I

    .line 40
    .line 41
    new-array p0, p1, [C

    .line 42
    .line 43
    invoke-static {v1, v2, p0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    sget p2, LVa/Ab;->w:I

    .line 47
    .line 48
    sub-int p3, p1, p2

    .line 49
    .line 50
    invoke-static {p0, v2, v1, p3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    sget p2, LVa/Ab;->w:I

    .line 54
    .line 55
    sub-int p3, p1, p2

    .line 56
    .line 57
    invoke-static {p0, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    :cond_1
    if-eqz p4, :cond_3

    .line 61
    .line 62
    new-array p0, p1, [C

    .line 63
    .line 64
    sput v2, LVa/Ab;->v:I

    .line 65
    .line 66
    :goto_1
    sget p2, LVa/Ab;->v:I

    .line 67
    .line 68
    if-ge p2, p1, :cond_2

    .line 69
    .line 70
    sub-int p3, p1, p2

    .line 71
    .line 72
    add-int/lit8 p3, p3, -0x1

    .line 73
    .line 74
    aget-char p3, v1, p3

    .line 75
    .line 76
    aput-char p3, p0, p2

    .line 77
    .line 78
    add-int/lit8 p2, p2, 0x1

    .line 79
    .line 80
    sput p2, LVa/Ab;->v:I

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v1, p0

    .line 84
    :cond_3
    new-instance p0, Ljava/lang/String;

    .line 85
    .line 86
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 87
    .line 88
    .line 89
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    return-object p0

    .line 91
    :goto_2
    monitor-exit v0

    .line 92
    throw p0
.end method


# virtual methods
.method public a()LVa/Ea;
    .locals 2

    .line 1
    sget v0, LVa/z;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x27

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/z;->h:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/z;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, LVa/Ea;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/16 v0, 0x1f

    .line 18
    .line 19
    div-int/lit8 v0, v0, 0x0

    .line 20
    .line 21
    :cond_0
    return-object v1
.end method

.method public b(LVa/Ia;LVa/ha;)V
    .locals 3

    .line 1
    sget v0, LVa/z;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x37

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/z;->h:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p0, LVa/z;->a:Z

    .line 15
    .line 16
    const/16 v2, 0x3e

    .line 17
    .line 18
    div-int/2addr v2, v1

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-boolean v0, p0, LVa/z;->a:Z

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    if-eq v0, v2, :cond_3

    .line 26
    .line 27
    :cond_1
    new-instance v0, LVa/Da;

    .line 28
    .line 29
    const/16 v1, 0x13

    .line 30
    .line 31
    invoke-direct {v0, p0, p1, p2, v1}, LVa/Da;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, LVa/pb;->I(LVa/Ba;)V

    .line 35
    .line 36
    .line 37
    sget p1, LVa/z;->g:I

    .line 38
    .line 39
    add-int/lit8 p1, p1, 0x2f

    .line 40
    .line 41
    rem-int/lit16 p2, p1, 0x80

    .line 42
    .line 43
    sput p2, LVa/z;->h:I

    .line 44
    .line 45
    rem-int/lit8 p1, p1, 0x2

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    const/4 p1, 0x0

    .line 51
    throw p1

    .line 52
    :cond_3
    :goto_0
    const/16 p1, 0x8

    .line 53
    .line 54
    new-array p1, p1, [I

    .line 55
    .line 56
    fill-array-data p1, :array_0

    .line 57
    .line 58
    .line 59
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    shr-int/lit8 p2, p2, 0x16

    .line 64
    .line 65
    rsub-int/lit8 p2, p2, 0xe

    .line 66
    .line 67
    invoke-static {p2, p1}, LVa/z;->j(I[I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const/16 p2, 0x20

    .line 76
    .line 77
    new-array p2, p2, [I

    .line 78
    .line 79
    fill-array-data p2, :array_1

    .line 80
    .line 81
    .line 82
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    rsub-int/lit8 v0, v0, 0x3f

    .line 87
    .line 88
    invoke-static {v0, p2}, LVa/z;->j(I[I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-static {p1, p2}, LVa/Ab;->x(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    nop

    .line 101
    :array_0
    .array-data 4
        -0x51b35381
        0x6d11c40f
        0x2a0edc24
        0x196e1d23
        -0x62347aed
        -0x7be2d4f5
        0x7ea8e633
        0x34bec1e1
    .end array-data

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    :array_1
    .array-data 4
        -0xd06fdb1
        -0x66e7026a
        -0x7e19f741
        -0x741d6278
        0x7f1699bc
        0x74a33bd4
        -0x1ef4f0cf
        0x3b7c4a42
        0x2ffa3e1f
        -0x72cc89dc
        -0x48d6b68b
        -0x132b41f6
        -0x32469d6d    # -3.8878064E8f
        0x372a5848
        -0x18933603
        0x252bd8f4
        -0x18495dc9
        0x1bd91c8c
        -0x51b35381
        0x6d11c40f
        0x2a0edc24
        0x196e1d23
        -0x62347aed
        -0x7be2d4f5
        0x4d80825b    # 2.6950333E8f
        -0x427cfe45
        -0x8f97e1c
        -0x2d5650a1
        0x25c5d815
        -0x3efbc4c1
        -0x4af04d08
        0x5d4886f6
    .end array-data
.end method

.method public c()Ljava/lang/String;
    .locals 7

    .line 1
    sget v0, LVa/z;->j:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/z;->k:I

    .line 8
    .line 9
    sget-object v0, LVa/z;->i:LVa/Xa;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget v1, LVa/Xa;->m:I

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x4d

    .line 17
    .line 18
    rem-int/lit16 v1, v1, 0x80

    .line 19
    .line 20
    sput v1, LVa/Xa;->n:I

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x65

    .line 23
    .line 24
    rem-int/lit16 v2, v1, 0x80

    .line 25
    .line 26
    sput v2, LVa/Xa;->m:I

    .line 27
    .line 28
    rem-int/lit8 v1, v1, 0x2

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-nez v1, :cond_4

    .line 32
    .line 33
    iget-object v0, v0, LVa/Xa;->c:Ljava/io/Serializable;

    .line 34
    .line 35
    check-cast v0, Ljava/lang/String;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    :try_start_0
    const-string v3, "\u966f\ue510\u7083\ucc07\u5b82\ud70a\u228d\ube19\u0d93\u9915\u1483\u6013\uff9f\u4b09\uc687\u5208\ua181\u3d06\u8887"

    .line 39
    .line 40
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    shr-int/lit8 v4, v4, 0x8

    .line 45
    .line 46
    rsub-int v4, v4, 0x737f

    .line 47
    .line 48
    invoke-static {v4, v3}, LVa/z;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-static {}, LVa/z;->k()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v3, "\u966f\u133e\u9cd5\u1988\u833d\u0cec\u899d\u334d\ubce3\u39a7\ua34d\u2c12\ua9a5"

    .line 65
    .line 66
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    const v5, 0x8551

    .line 71
    .line 72
    .line 73
    add-int/2addr v4, v5

    .line 74
    invoke-static {v4, v3}, LVa/z;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    sget-object v4, LVa/z;->i:LVa/Xa;

    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    sget v5, LVa/Xa;->m:I

    .line 88
    .line 89
    add-int/lit8 v5, v5, 0x3f

    .line 90
    .line 91
    rem-int/lit16 v6, v5, 0x80

    .line 92
    .line 93
    sput v6, LVa/Xa;->n:I

    .line 94
    .line 95
    rem-int/lit8 v5, v5, 0x2

    .line 96
    .line 97
    if-eqz v5, :cond_2

    .line 98
    .line 99
    add-int/lit8 v6, v6, 0x17

    .line 100
    .line 101
    rem-int/lit16 v6, v6, 0x80

    .line 102
    .line 103
    sput v6, LVa/Xa;->m:I

    .line 104
    .line 105
    iget-object v4, v4, LVa/Xa;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v4, Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iget-boolean v3, p0, LVa/z;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    .line 115
    const/4 v4, 0x1

    .line 116
    xor-int/2addr v3, v4

    .line 117
    const-string v5, "\u966f\u4eb8\u27df\u1ce9\uf53c\uaa55\u837f\u7b8a\u50c6\u09e8\uee0f\uc754"

    .line 118
    .line 119
    if-eq v3, v4, :cond_1

    .line 120
    .line 121
    sget v3, LVa/z;->j:I

    .line 122
    .line 123
    add-int/lit8 v3, v3, 0x41

    .line 124
    .line 125
    rem-int/lit16 v3, v3, 0x80

    .line 126
    .line 127
    sput v3, LVa/z;->k:I

    .line 128
    .line 129
    :try_start_1
    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    const v4, -0xff2729

    .line 134
    .line 135
    .line 136
    sub-int/2addr v4, v3

    .line 137
    invoke-static {v4, v5}, LVa/z;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    sget-object v4, LVa/z;->i:LVa/Xa;

    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    sget v5, LVa/Xa;->m:I

    .line 151
    .line 152
    add-int/lit8 v5, v5, 0x3f

    .line 153
    .line 154
    rem-int/lit16 v6, v5, 0x80

    .line 155
    .line 156
    sput v6, LVa/Xa;->n:I

    .line 157
    .line 158
    rem-int/lit8 v5, v5, 0x2

    .line 159
    .line 160
    if-eqz v5, :cond_0

    .line 161
    .line 162
    iget-object v4, v4, LVa/Xa;->e:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v4, Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    goto :goto_0

    .line 171
    :catchall_0
    move-exception v3

    .line 172
    goto :goto_1

    .line 173
    :cond_0
    throw v2

    .line 174
    :cond_1
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    shr-int/lit8 v3, v3, 0x10

    .line 179
    .line 180
    const v4, 0xd8d7

    .line 181
    .line 182
    .line 183
    sub-int/2addr v4, v3

    .line 184
    invoke-static {v4, v5}, LVa/z;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    const-string v4, ""

    .line 193
    .line 194
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    :goto_0
    const-string v3, "\u966f\u32fc\udf51\u7bc2\u0436\ua0a5\u4d03\u1672\ub2f8\u5f50\ufbd8\u843a\u209a\ucd10\u9663\u32f4"

    .line 199
    .line 200
    invoke-static {v1}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    const v5, 0xa493

    .line 205
    .line 206
    .line 207
    add-int/2addr v4, v5

    .line 208
    invoke-static {v4, v3}, LVa/z;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    iget-object v4, p0, LVa/z;->b:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v4, Ljava/lang/String;

    .line 219
    .line 220
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 224
    sget v1, LVa/z;->j:I

    .line 225
    .line 226
    add-int/lit8 v1, v1, 0x4f

    .line 227
    .line 228
    rem-int/lit16 v1, v1, 0x80

    .line 229
    .line 230
    sput v1, LVa/z;->k:I

    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_2
    :try_start_2
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 234
    :goto_1
    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    rsub-int v1, v1, 0xa7

    .line 239
    .line 240
    const-string v4, "\u9663\u96f6\u9718\u9797\u94c1\u9512\u95a9\u92ef\u937f\u93a2\u90dc\u9173\u9185\u9e2c\u9f62\u9f92\u9c36"

    .line 241
    .line 242
    invoke-static {v1, v4}, LVa/z;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    new-instance v4, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 253
    .line 254
    .line 255
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    shr-int/lit8 v5, v5, 0x10

    .line 260
    .line 261
    const v6, 0x9463

    .line 262
    .line 263
    .line 264
    sub-int/2addr v6, v5

    .line 265
    const-string v5, "\u9671\u0225\ube80\u2b72\uc7ca\u73fb\uec0f\u98ef\u350c\ua128\u5d8f\uf601\u62da\u1f40\u8b0a\u2796\ud04d\u4cc9\uf8a8\u9508\u01eb\uba5f\u568c\uc2f1"

    .line 266
    .line 267
    invoke-static {v6, v5}, LVa/z;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v3}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-static {v1, v3}, LVa/Ab;->x(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-static {v0}, LVa/pb;->Z([B)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    sget v1, LVa/z;->k:I

    .line 301
    .line 302
    add-int/lit8 v1, v1, 0x3b

    .line 303
    .line 304
    rem-int/lit16 v3, v1, 0x80

    .line 305
    .line 306
    sput v3, LVa/z;->j:I

    .line 307
    .line 308
    rem-int/lit8 v1, v1, 0x2

    .line 309
    .line 310
    if-nez v1, :cond_3

    .line 311
    .line 312
    return-object v0

    .line 313
    :cond_3
    throw v2

    .line 314
    :cond_4
    throw v2
.end method

.method public h()V
    .locals 3

    .line 1
    sget v0, LVa/z;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x51

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/z;->g:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iget-object v2, p0, LVa/z;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, LVa/Ea;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget v0, LVa/Ea;->g:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x23

    .line 24
    .line 25
    rem-int/lit16 v0, v0, 0x80

    .line 26
    .line 27
    sput v0, LVa/Ea;->f:I

    .line 28
    .line 29
    iget-object v0, v2, LVa/Ea;->a:Landroid/content/Context;

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 32
    .line 33
    .line 34
    sget v0, LVa/Ea;->g:I

    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x5b

    .line 37
    .line 38
    rem-int/lit16 v0, v0, 0x80

    .line 39
    .line 40
    sput v0, LVa/Ea;->f:I

    .line 41
    .line 42
    iput-boolean v1, p0, LVa/z;->a:Z

    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    sget v0, LVa/Ea;->g:I

    .line 49
    .line 50
    add-int/lit8 v0, v0, 0x23

    .line 51
    .line 52
    rem-int/lit16 v0, v0, 0x80

    .line 53
    .line 54
    sput v0, LVa/Ea;->f:I

    .line 55
    .line 56
    iget-object v0, v2, LVa/Ea;->a:Landroid/content/Context;

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 59
    .line 60
    .line 61
    sget v0, LVa/Ea;->g:I

    .line 62
    .line 63
    add-int/lit8 v0, v0, 0x5b

    .line 64
    .line 65
    rem-int/lit16 v0, v0, 0x80

    .line 66
    .line 67
    sput v0, LVa/Ea;->f:I

    .line 68
    .line 69
    iput-boolean v1, p0, LVa/z;->a:Z

    .line 70
    .line 71
    return-void
.end method

.method public i(Ljava/lang/String;Lorg/json/JSONObject;LVa/Ia;)V
    .locals 3

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance v0, LVa/ha;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, v0, LVa/ha;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p1, v0, LVa/ha;->b:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {p0, p3, v0}, LVa/z;->b(LVa/Ia;LVa/ha;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    sget p1, LVa/z;->h:I

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x65

    .line 25
    .line 26
    rem-int/lit16 p2, p1, 0x80

    .line 27
    .line 28
    sput p2, LVa/z;->g:I

    .line 29
    .line 30
    rem-int/lit8 p1, p1, 0x2

    .line 31
    .line 32
    const-string p2, ""

    .line 33
    .line 34
    const/4 p3, 0x0

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    new-array p1, v0, [I

    .line 38
    .line 39
    fill-array-data p1, :array_0

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    invoke-static {v0, p3}, Landroid/view/View;->getDefaultSize(II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    const/16 v2, 0x44

    .line 48
    .line 49
    rem-int/2addr v2, v1

    .line 50
    invoke-static {v2, p1}, LVa/z;->j(I[I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const/16 v1, 0x28

    .line 59
    .line 60
    new-array v1, v1, [I

    .line 61
    .line 62
    fill-array-data v1, :array_1

    .line 63
    .line 64
    .line 65
    const/4 v2, 0x3

    .line 66
    invoke-static {p2, v0, v0}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    shr-int p2, v2, p2

    .line 71
    .line 72
    invoke-static {p2, v1}, LVa/z;->j(I[I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-static {p1, p2}, LVa/Ab;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    new-array p1, v0, [I

    .line 85
    .line 86
    fill-array-data p1, :array_2

    .line 87
    .line 88
    .line 89
    invoke-static {p3, p3}, Landroid/view/View;->getDefaultSize(II)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    rsub-int/lit8 v0, v0, 0xe

    .line 94
    .line 95
    invoke-static {v0, p1}, LVa/z;->j(I[I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    const/16 v0, 0x28

    .line 104
    .line 105
    new-array v0, v0, [I

    .line 106
    .line 107
    fill-array-data v0, :array_3

    .line 108
    .line 109
    .line 110
    invoke-static {p2, p3, p3}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    add-int/lit8 p2, p2, 0x4d

    .line 115
    .line 116
    invoke-static {p2, v0}, LVa/z;->j(I[I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    goto :goto_0

    .line 121
    :goto_1
    sget p1, LVa/z;->g:I

    .line 122
    .line 123
    add-int/lit8 p1, p1, 0x3d

    .line 124
    .line 125
    rem-int/lit16 p2, p1, 0x80

    .line 126
    .line 127
    sput p2, LVa/z;->h:I

    .line 128
    .line 129
    rem-int/lit8 p1, p1, 0x2

    .line 130
    .line 131
    if-nez p1, :cond_2

    .line 132
    .line 133
    const/16 p1, 0x55

    .line 134
    .line 135
    div-int/2addr p1, p3

    .line 136
    :cond_2
    return-void

    .line 137
    :array_0
    .array-data 4
        -0x51b35381
        0x6d11c40f
        0x2a0edc24
        0x196e1d23
        -0x62347aed
        -0x7be2d4f5
        0x7ea8e633
        0x34bec1e1
    .end array-data

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    :array_1
    .array-data 4
        -0xbbeb1e0
        0x2924df72
        -0x40a9f7e4
        -0x75cf63bb
        -0x2e1a30f
        -0xd0b1753
        -0x4d3ed1e7
        -0x1275870d
        -0x6c28ed16
        -0x2d9911a5
        -0x83ff9c1
        -0x48e6326a
        0x410236d5
        -0x79f6861e
        -0x59f52d9e
        0x35ad3a86
        0x7fa70df0
        -0x6ede0a1b
        0x3ae51902
        0x11777b84
        0x391b1af4
        0x5661604e
        -0x767b829a
        -0x78003427
        0x7ef280dd
        0x6655852d
        0x771b930c
        -0x5384f31
        -0x547f6213
        0x4c8b587f    # 7.305727E7f
        -0x363d2b7d
        -0x1ffda7d0
        0x6c1880da
        -0x69e22dff
        -0x2598c758
        -0x3e8bd0bf
        0x5641c04f
        0x10da76be
        -0x36668002
        -0x4c4da217
    .end array-data

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    :array_2
    .array-data 4
        -0x51b35381
        0x6d11c40f
        0x2a0edc24
        0x196e1d23
        -0x62347aed
        -0x7be2d4f5
        0x7ea8e633
        0x34bec1e1
    .end array-data

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    :array_3
    .array-data 4
        -0xbbeb1e0
        0x2924df72
        -0x40a9f7e4
        -0x75cf63bb
        -0x2e1a30f
        -0xd0b1753
        -0x4d3ed1e7
        -0x1275870d
        -0x6c28ed16
        -0x2d9911a5
        -0x83ff9c1
        -0x48e6326a
        0x410236d5
        -0x79f6861e
        -0x59f52d9e
        0x35ad3a86
        0x7fa70df0
        -0x6ede0a1b
        0x3ae51902
        0x11777b84
        0x391b1af4
        0x5661604e
        -0x767b829a
        -0x78003427
        0x7ef280dd
        0x6655852d
        0x771b930c
        -0x5384f31
        -0x547f6213
        0x4c8b587f    # 7.305727E7f
        -0x363d2b7d
        -0x1ffda7d0
        0x6c1880da
        -0x69e22dff
        -0x2598c758
        -0x3e8bd0bf
        0x5641c04f
        0x10da76be
        -0x36668002
        -0x4c4da217
    .end array-data
.end method
