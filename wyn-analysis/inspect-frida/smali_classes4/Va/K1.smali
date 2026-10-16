.class public final LVa/K1;
.super LVa/Z0;
.source "SourceFile"


# static fields
.field public static final R:[B

.field public static S:I = 0x0

.field public static T:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xdd

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/K1;->R:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        -0x65t
        -0x5ft
        -0x77t
        -0x5dt
        -0x75t
        -0x59t
        -0x48t
        0x63t
        -0x69t
        -0x66t
        -0x6at
        -0x5dt
        -0x7ct
        -0x68t
        -0x59t
        -0x71t
        -0x45t
        0x61t
        0x64t
        0x60t
        0x6dt
        0x4et
        0x62t
        0x71t
        0x59t
        -0x7bt
        -0x77t
        -0x55t
        -0x6et
        -0x66t
        -0x6ft
        -0x61t
        -0x47t
        0x68t
        -0x67t
        -0x64t
        -0x68t
        -0x5bt
        -0x7at
        -0x66t
        -0x57t
        -0x6ft
        -0x43t
        0x70t
        -0x60t
        -0x66t
        -0x69t
        -0x6bt
        -0x66t
        -0x66t
        -0x79t
        -0x4at
        0x11t
        0x17t
        -0x1t
        0x19t
        0x1t
        0x1dt
        0x2et
        -0x21t
        0xbt
        0x12t
        0x2t
        0xct
        0x1at
        -0x1t
        0xet
        0xft
        0x30t
        0x13t
        0xbt
        0x21t
        -0x3ft
        0x22t
        0xet
        0x6t
        0xet
        0x5t
        0x4at
        -0x31t
        0x13t
        -0x3t
        0x51t
        -0x3at
        0xdt
        0x10t
        0xct
        0x19t
        -0x6t
        0xet
        0x1dt
        0x5t
        0x11t
        0x41t
        -0x33t
        0xat
        0x18t
        0x1bt
        0x8t
        0x5t
        0x1bt
        0x5t
        0x11t
        0x11t
        0x1dt
        0x1t
        0x16t
        0x35t
        -0x2t
        0x0t
        -0xft
        0x10t
        -0x17t
        0x11t
        0x12t
        -0x4ft
        -0x55t
        -0x58t
        -0x61t
        -0x57t
        -0x4ct
        -0x39t
        -0x78t
        -0x58t
        -0x56t
        -0x65t
        -0x46t
        -0x6dt
        -0x45t
        -0x44t
        0x5ct
        0x56t
        0x53t
        0x4at
        0x54t
        0x5ft
        0x72t
        0x23t
        0x56t
        0x65t
        0x41t
        0x75t
        -0x36t
        -0x30t
        -0x48t
        -0x2et
        -0x46t
        -0x2at
        -0x19t
        -0x68t
        -0x3ct
        -0x35t
        -0x45t
        -0x3bt
        -0x2dt
        -0x48t
        -0x39t
        -0x38t
        -0x17t
        -0x34t
        -0x3ct
        -0x26t
        0x7ct
        -0x29t
        -0x3ft
        -0x48t
        0xdt
        -0x78t
        -0x34t
        -0x4at
        0xat
        0x7ft
        -0x3at
        -0x37t
        -0x3bt
        -0x2et
        -0x4dt
        -0x39t
        -0x2at
        -0x42t
        -0x36t
        -0x6t
        -0x7at
        -0x3dt
        -0x2ft
        0x35t
        0x30t
        0x36t
        0x2bt
        0x73t
        -0x79t
        -0x72t
        0x59t
        0x7bt
        -0x56t
        0x48t
        -0x76t
        0x79t
        0x43t
        0x65t
        0x4ct
        0x54t
        0x4bt
        0x59t
        0x73t
        0x34t
        0x60t
        0x33t
        0x5ct
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public static C0()Ljava/lang/Object;
    .locals 3

    .line 1
    sget v0, LVa/K1;->S:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x69

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/K1;->T:I

    .line 8
    .line 9
    invoke-static {}, Lcom/chartboost/sdk/Chartboost;->getDelegate()Lcom/chartboost/sdk/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget v1, LVa/K1;->S:I

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x5d

    .line 16
    .line 17
    rem-int/lit16 v2, v1, 0x80

    .line 18
    .line 19
    sput v2, LVa/K1;->T:I

    .line 20
    .line 21
    rem-int/lit8 v1, v1, 0x2

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    const/16 v1, 0x62

    .line 26
    .line 27
    div-int/lit8 v1, v1, 0x0

    .line 28
    .line 29
    :cond_0
    return-object v0
.end method

.method public static D0()Z
    .locals 3

    .line 1
    sget v0, LVa/K1;->S:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x59

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/K1;->T:I

    .line 8
    .line 9
    invoke-static {}, Lcom/chartboost/sdk/Chartboost;->isWebViewEnabled()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sget v1, LVa/K1;->T:I

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x3f

    .line 16
    .line 17
    rem-int/lit16 v2, v1, 0x80

    .line 18
    .line 19
    sput v2, LVa/K1;->S:I

    .line 20
    .line 21
    rem-int/lit8 v1, v1, 0x2

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    return v0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    throw v0
.end method

.method public static E0()Ljava/lang/Object;
    .locals 4

    .line 1
    sget v0, LVa/K1;->S:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x79

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/K1;->T:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    sget-object v0, Lcom/chartboost/sdk/g;->d:Lcom/chartboost/sdk/impl/a;

    .line 15
    .line 16
    sget v2, LVa/K1;->S:I

    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x7

    .line 19
    .line 20
    rem-int/lit16 v3, v2, 0x80

    .line 21
    .line 22
    sput v3, LVa/K1;->T:I

    .line 23
    .line 24
    rem-int/lit8 v2, v2, 0x2

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    throw v1

    .line 30
    :cond_1
    sget-object v0, Lcom/chartboost/sdk/g;->d:Lcom/chartboost/sdk/impl/a;

    .line 31
    .line 32
    throw v1
.end method

.method public static F0(Lcom/chartboost/sdk/InPlay/CBInPlay;)Ljava/lang/String;
    .locals 1

    .line 1
    sget v0, LVa/K1;->S:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/K1;->T:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/chartboost/sdk/InPlay/CBInPlay;->getAppName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget v0, LVa/K1;->S:I

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x17

    .line 16
    .line 17
    rem-int/lit16 v0, v0, 0x80

    .line 18
    .line 19
    sput v0, LVa/K1;->T:I

    .line 20
    .line 21
    return-object p0
.end method

.method public static G0(Lcom/chartboost/sdk/ChartboostDelegate;)V
    .locals 2

    .line 1
    sget v0, LVa/K1;->T:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x11

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/K1;->S:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    invoke-static {p0}, Lcom/chartboost/sdk/Chartboost;->setDelegate(Lcom/chartboost/sdk/ChartboostDelegate;)V

    .line 12
    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    throw p0
.end method

.method public static H0(Lcom/chartboost/sdk/InPlay/CBInPlay;)Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, LVa/K1;->S:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5f

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/K1;->T:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/chartboost/sdk/InPlay/CBInPlay;->getLocation()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget v0, LVa/K1;->T:I

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x37

    .line 16
    .line 17
    rem-int/lit16 v1, v0, 0x80

    .line 18
    .line 19
    sput v1, LVa/K1;->S:I

    .line 20
    .line 21
    rem-int/lit8 v0, v0, 0x2

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/16 v0, 0x53

    .line 26
    .line 27
    div-int/lit8 v0, v0, 0x0

    .line 28
    .line 29
    :cond_0
    return-object p0
.end method

.method public static I0(IIBSI)Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, LVa/pb;->J:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x41

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-ne p1, v2, :cond_0

    .line 15
    .line 16
    move v3, v4

    .line 17
    :cond_0
    if-eqz v3, :cond_1

    .line 18
    .line 19
    sget-object p1, LVa/K1;->R:[B

    .line 20
    .line 21
    const v2, 0x5d836747

    .line 22
    .line 23
    .line 24
    add-int/2addr v2, p4

    .line 25
    aget-byte p1, p1, v2

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x41

    .line 28
    .line 29
    int-to-byte p1, p1

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    :goto_0
    if-lez p1, :cond_2

    .line 34
    .line 35
    add-int/2addr p4, p1

    .line 36
    const v2, -0x5d836745

    .line 37
    .line 38
    .line 39
    sub-int/2addr p4, v2

    .line 40
    add-int/2addr p4, v3

    .line 41
    sput p4, LVa/pb;->F:I

    .line 42
    .line 43
    sput-byte p2, LVa/pb;->G:B

    .line 44
    .line 45
    const p2, 0x3f3bb6da

    .line 46
    .line 47
    .line 48
    add-int/2addr p0, p2

    .line 49
    int-to-char p0, p0

    .line 50
    sput-char p0, LVa/pb;->H:C

    .line 51
    .line 52
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    sget-char p0, LVa/pb;->H:C

    .line 56
    .line 57
    sput-char p0, LVa/pb;->I:C

    .line 58
    .line 59
    sput v4, LVa/pb;->E:I

    .line 60
    .line 61
    :goto_1
    sget p0, LVa/pb;->E:I

    .line 62
    .line 63
    if-ge p0, p1, :cond_2

    .line 64
    .line 65
    sget-object p0, LVa/K1;->R:[B

    .line 66
    .line 67
    sget p2, LVa/pb;->F:I

    .line 68
    .line 69
    add-int/lit8 p4, p2, -0x1

    .line 70
    .line 71
    sput p4, LVa/pb;->F:I

    .line 72
    .line 73
    aget-byte p0, p0, p2

    .line 74
    .line 75
    sget-char p2, LVa/pb;->I:C

    .line 76
    .line 77
    add-int/2addr p0, p3

    .line 78
    int-to-byte p0, p0

    .line 79
    sget-byte p4, LVa/pb;->G:B

    .line 80
    .line 81
    xor-int/2addr p0, p4

    .line 82
    add-int/2addr p2, p0

    .line 83
    int-to-char p0, p2

    .line 84
    sput-char p0, LVa/pb;->H:C

    .line 85
    .line 86
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    sget-char p0, LVa/pb;->H:C

    .line 90
    .line 91
    sput-char p0, LVa/pb;->I:C

    .line 92
    .line 93
    sget p0, LVa/pb;->E:I

    .line 94
    .line 95
    add-int/2addr p0, v4

    .line 96
    sput p0, LVa/pb;->E:I

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    return-object p0

    .line 105
    :goto_2
    monitor-exit v0

    .line 106
    throw p0
.end method

.method public static J0()V
    .locals 3

    .line 1
    sget v0, LVa/K1;->T:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x41

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/K1;->S:I

    .line 8
    .line 9
    invoke-static {}, LVa/K1;->C0()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/chartboost/sdk/ChartboostDelegate;

    .line 14
    .line 15
    new-instance v1, LVa/J1;

    .line 16
    .line 17
    invoke-direct {v1, v0}, LVa/J1;-><init>(Lcom/chartboost/sdk/ChartboostDelegate;)V

    .line 18
    .line 19
    .line 20
    sget v0, LVa/K1;->S:I

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x23

    .line 23
    .line 24
    rem-int/lit16 v2, v0, 0x80

    .line 25
    .line 26
    sput v2, LVa/K1;->T:I

    .line 27
    .line 28
    rem-int/lit8 v0, v0, 0x2

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-static {v1}, LVa/K1;->G0(Lcom/chartboost/sdk/ChartboostDelegate;)V

    .line 33
    .line 34
    .line 35
    sget v0, LVa/K1;->T:I

    .line 36
    .line 37
    add-int/lit8 v0, v0, 0xd

    .line 38
    .line 39
    rem-int/lit16 v0, v0, 0x80

    .line 40
    .line 41
    sput v0, LVa/K1;->S:I

    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    const/4 v0, 0x0

    .line 45
    throw v0
.end method

.method public static o(ILjava/lang/String;)Ljava/lang/String;
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
    const-wide v4, -0x17c19c9e351dcb87L    # -1.3864440791391228E194

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


# virtual methods
.method public final A0()Ljava/util/HashMap;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {v1, v1, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    rsub-int v3, v3, 0x30a9

    .line 14
    .line 15
    const-string v4, "\u340a\u04b5\u555f\ua5d6\uf6bf\uc770\u17ea\u608a\ub154\u81ef\ud282\u234e\u73f0"

    .line 16
    .line 17
    invoke-static {v3, v4}, LVa/K1;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    new-instance v4, LVa/y1;

    .line 26
    .line 27
    const/4 v5, 0x1

    .line 28
    invoke-direct {v4, v5}, LVa/y1;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object p0, v4, LVa/y1;->b:LVa/Z0;

    .line 32
    .line 33
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    shr-int/lit8 v3, v3, 0x10

    .line 41
    .line 42
    rsub-int v3, v3, 0x1f85

    .line 43
    .line 44
    const-string v4, "\u341e\u2b99\u0b07\u6ab5\u4a05\ua981\u8915\ue8ae\uc833\u2fbb\u0f24\u6ebd\u4e31\uadfc\u8d5a\uecde\ucc4c\u23cb\u0342\u62d2\u4278"

    .line 45
    .line 46
    invoke-static {v3, v4}, LVa/K1;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    new-instance v4, LVa/B1;

    .line 55
    .line 56
    const/16 v5, 0x8

    .line 57
    .line 58
    invoke-direct {v4, v5}, LVa/B1;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    add-int/lit16 v3, v3, 0x328d

    .line 69
    .line 70
    const-string v4, "\u341e\u0691\u5117\ua39d\ufe25\uc8d9\u1b45\u55d6\ua073\uf2e3\ucd94\u1805\u6a91\ua506\uf7f7\uc265\u1c9d\u6f7b\ub9a3\uf44a\uc718\u1184\u6c02\ubeb5\u8920\udbc8\u164e"

    .line 71
    .line 72
    invoke-static {v3, v4}, LVa/K1;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    new-instance v4, LVa/B1;

    .line 81
    .line 82
    const/4 v5, 0x7

    .line 83
    invoke-direct {v4, v5}, LVa/B1;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    invoke-static {v1}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    add-int/lit16 v3, v3, 0x12ce

    .line 94
    .line 95
    const-string v4, "\u341a\u26c6\u1186\u0c7f\u7f39\u6a1d\u44e3\ub7a0\ua252\u9d24\u881a\ufac4\ud591\uc072\u3320\u2e15\u18da\u0b90\u6657\u512b\u4c11\ubecd\ua980\u8473\uf735\ue219"

    .line 96
    .line 97
    invoke-static {v3, v4}, LVa/K1;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    new-instance v4, LVa/F1;

    .line 106
    .line 107
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-object p0, v4, LVa/F1;->a:LVa/K1;

    .line 111
    .line 112
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    const/16 v3, 0x30

    .line 116
    .line 117
    invoke-static {v1, v3, v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    rsub-int v3, v3, 0x649e

    .line 122
    .line 123
    const-string v4, "\u340a\u5083\ufd33\u19e7\ua66d\uc303\u6fb1\uf454\u10e3\ubd81\uda20\u66df\u8379\u282e\ub4ae\ud144\u7dec\u9a91\u2736\u43c0\ue870"

    .line 124
    .line 125
    invoke-static {v3, v4}, LVa/K1;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    new-instance v4, LVa/G1;

    .line 134
    .line 135
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    const v3, 0xccd1

    .line 142
    .line 143
    .line 144
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    sub-int/2addr v3, v4

    .line 149
    const-string v4, "\u3410\uf8db\uad8c\u526f\u075f\u343a\uf8f6\uadab\u5286\u0765\u343d\uf8e3\uadd7\u5288\u0772\u3422"

    .line 150
    .line 151
    invoke-static {v3, v4}, LVa/K1;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    new-instance v4, LVa/B1;

    .line 160
    .line 161
    const/4 v5, 0x6

    .line 162
    invoke-direct {v4, v5}, LVa/B1;-><init>(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    invoke-static {v2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    rsub-int v3, v3, 0x5293

    .line 173
    .line 174
    const-string v4, "\u341e\u668f\u912b\uc38c\u7e5a\ua8c5\udb6a\u7608\ua088\ud33d\u0da9"

    .line 175
    .line 176
    invoke-static {v3, v4}, LVa/K1;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    new-instance v4, LVa/I1;

    .line 185
    .line 186
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    const/4 v3, 0x0

    .line 193
    invoke-static {v3, v3}, Landroid/graphics/PointF;->length(FF)F

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    cmpl-float v3, v4, v3

    .line 198
    .line 199
    add-int/lit8 v3, v3, -0x7b

    .line 200
    .line 201
    int-to-short v3, v3

    .line 202
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    shr-int/lit8 v4, v4, 0x10

    .line 207
    .line 208
    const v5, -0x3f3bb673

    .line 209
    .line 210
    .line 211
    add-int/2addr v4, v5

    .line 212
    invoke-static {v2, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    rsub-int/lit8 v5, v5, -0x37

    .line 217
    .line 218
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    shr-int/lit8 v6, v6, 0x8

    .line 223
    .line 224
    const v7, -0x5d83668a

    .line 225
    .line 226
    .line 227
    sub-int/2addr v7, v6

    .line 228
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    int-to-byte v6, v6

    .line 233
    invoke-static {v4, v5, v6, v3, v7}, LVa/K1;->I0(IIBSI)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    new-instance v4, LVa/H1;

    .line 242
    .line 243
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    invoke-static {v1}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    rsub-int/lit8 v3, v3, -0x53

    .line 254
    .line 255
    int-to-short v3, v3

    .line 256
    const v4, -0x3f3bb671

    .line 257
    .line 258
    .line 259
    invoke-static {v2, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 260
    .line 261
    .line 262
    move-result v5

    .line 263
    sub-int/2addr v4, v5

    .line 264
    invoke-static {v2}, Landroid/os/Process;->getThreadPriority(I)I

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    add-int/lit8 v5, v5, 0x14

    .line 269
    .line 270
    shr-int/lit8 v5, v5, 0x6

    .line 271
    .line 272
    rsub-int/lit8 v5, v5, -0x35

    .line 273
    .line 274
    const v6, -0x5d836681

    .line 275
    .line 276
    .line 277
    invoke-static {v1, v1, v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    add-int/2addr v1, v6

    .line 282
    const-wide/16 v6, 0x0

    .line 283
    .line 284
    invoke-static {v6, v7}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    rsub-int/lit8 v6, v6, -0x1

    .line 289
    .line 290
    int-to-byte v6, v6

    .line 291
    invoke-static {v4, v5, v6, v3, v1}, LVa/K1;->I0(IIBSI)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    new-instance v3, LVa/B1;

    .line 300
    .line 301
    const/16 v4, 0x9

    .line 302
    .line 303
    invoke-direct {v3, v4}, LVa/B1;-><init>(I)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    sget v1, LVa/K1;->T:I

    .line 310
    .line 311
    add-int/lit8 v1, v1, 0x49

    .line 312
    .line 313
    rem-int/lit16 v3, v1, 0x80

    .line 314
    .line 315
    sput v3, LVa/K1;->S:I

    .line 316
    .line 317
    rem-int/lit8 v1, v1, 0x2

    .line 318
    .line 319
    if-eqz v1, :cond_0

    .line 320
    .line 321
    const/16 v1, 0x62

    .line 322
    .line 323
    div-int/2addr v1, v2

    .line 324
    :cond_0
    return-object v0
.end method

.method public final t0()Ljava/lang/String;
    .locals 6

    .line 1
    sget v0, LVa/K1;->S:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0xb

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/K1;->T:I

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
    :try_start_0
    invoke-static {}, Lcom/chartboost/sdk/Chartboost;->getSDKVersion()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    const/16 v2, 0x49

    .line 19
    .line 20
    :try_start_1
    div-int/2addr v2, v1
    :try_end_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    return-object v0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    throw v0

    .line 24
    :cond_0
    :try_start_2
    invoke-static {}, Lcom/chartboost/sdk/Chartboost;->getSDKVersion()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    .line 28
    return-object v0

    .line 29
    :catch_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    shr-int/lit8 v0, v0, 0x10

    .line 34
    .line 35
    add-int/lit8 v0, v0, -0x33

    .line 36
    .line 37
    int-to-short v0, v0

    .line 38
    const v2, -0x3f3bb6a4

    .line 39
    .line 40
    .line 41
    const-string v3, ""

    .line 42
    .line 43
    invoke-static {v3, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    sub-int/2addr v2, v3

    .line 48
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    shr-int/lit8 v3, v3, 0x10

    .line 53
    .line 54
    rsub-int/lit8 v3, v3, -0x3c

    .line 55
    .line 56
    const v4, -0x5d83668e

    .line 57
    .line 58
    .line 59
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    sub-int/2addr v4, v1

    .line 64
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    const/4 v5, 0x0

    .line 69
    cmpl-float v1, v1, v5

    .line 70
    .line 71
    rsub-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    int-to-byte v1, v1

    .line 74
    invoke-static {v2, v3, v1, v0, v4}, LVa/K1;->I0(IIBSI)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0
.end method

.method public final w0(Ljava/lang/String;)Ljava/lang/Class;
    .locals 14

    .line 1
    sget v0, LVa/K1;->T:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/K1;->S:I

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const v1, -0x3f3bb677

    .line 14
    .line 15
    .line 16
    const/16 v2, 0x8

    .line 17
    .line 18
    const/4 v3, 0x3

    .line 19
    const/4 v4, -0x1

    .line 20
    const/16 v5, 0x30

    .line 21
    .line 22
    const/4 v6, 0x2

    .line 23
    const/4 v7, 0x7

    .line 24
    const-string v8, ""

    .line 25
    .line 26
    const/16 v9, 0x10

    .line 27
    .line 28
    const-wide/16 v10, 0x0

    .line 29
    .line 30
    const/4 v12, 0x0

    .line 31
    const/4 v13, 0x0

    .line 32
    sparse-switch v0, :sswitch_data_0

    .line 33
    .line 34
    .line 35
    goto/16 :goto_1

    .line 36
    .line 37
    :sswitch_0
    invoke-static {v12, v12}, Landroid/graphics/PointF;->length(FF)F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    cmpl-float v0, v0, v12

    .line 42
    .line 43
    const v1, 0x8ecf

    .line 44
    .line 45
    .line 46
    add-int/2addr v0, v1

    .line 47
    const-string v1, "\u343a\ubaf4\u29ae\u987a\u0f15\ufe1e\u6cc2\ud3a9"

    .line 48
    .line 49
    invoke-static {v0, v1}, LVa/K1;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_1

    .line 62
    .line 63
    sget p1, LVa/K1;->T:I

    .line 64
    .line 65
    add-int/2addr p1, v7

    .line 66
    rem-int/lit16 v0, p1, 0x80

    .line 67
    .line 68
    sput v0, LVa/K1;->S:I

    .line 69
    .line 70
    rem-int/2addr p1, v6

    .line 71
    if-eqz p1, :cond_0

    .line 72
    .line 73
    :goto_0
    move v2, v6

    .line 74
    goto/16 :goto_2

    .line 75
    .line 76
    :cond_0
    move v2, v3

    .line 77
    goto/16 :goto_2

    .line 78
    .line 79
    :sswitch_1
    invoke-static {v10, v11}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    rsub-int/lit8 v0, v0, -0x10

    .line 84
    .line 85
    int-to-short v0, v0

    .line 86
    const v1, -0x3f3bb692

    .line 87
    .line 88
    .line 89
    invoke-static {v8, v5, v13}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    sub-int/2addr v1, v3

    .line 94
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 95
    .line 96
    .line 97
    move-result-wide v5

    .line 98
    cmp-long v3, v5, v10

    .line 99
    .line 100
    rsub-int/lit8 v3, v3, -0x34

    .line 101
    .line 102
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    shr-int/lit8 v2, v5, 0x8

    .line 107
    .line 108
    const v5, -0x5d8366e6

    .line 109
    .line 110
    .line 111
    sub-int/2addr v5, v2

    .line 112
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    shr-int/2addr v2, v9

    .line 117
    int-to-byte v2, v2

    .line 118
    invoke-static {v1, v3, v2, v0, v5}, LVa/K1;->I0(IIBSI)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_1

    .line 131
    .line 132
    sget p1, LVa/K1;->T:I

    .line 133
    .line 134
    add-int/lit8 p1, p1, 0x41

    .line 135
    .line 136
    rem-int/lit16 p1, p1, 0x80

    .line 137
    .line 138
    sput p1, LVa/K1;->S:I

    .line 139
    .line 140
    const/16 v2, 0xa

    .line 141
    .line 142
    goto/16 :goto_2

    .line 143
    .line 144
    :sswitch_2
    invoke-static {v13, v13}, Landroid/view/View;->resolveSize(II)I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    rsub-int/lit8 v0, v0, -0x54

    .line 149
    .line 150
    int-to-short v0, v0

    .line 151
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    shr-int/2addr v1, v9

    .line 156
    const v2, -0x3f3bb687

    .line 157
    .line 158
    .line 159
    sub-int/2addr v2, v1

    .line 160
    invoke-static {v13}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    cmpl-float v1, v1, v12

    .line 165
    .line 166
    add-int/lit8 v1, v1, -0x34

    .line 167
    .line 168
    const v3, -0x5d8366c5

    .line 169
    .line 170
    .line 171
    invoke-static {v8}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    add-int/2addr v5, v3

    .line 176
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    shr-int/2addr v3, v9

    .line 181
    int-to-byte v3, v3

    .line 182
    invoke-static {v2, v1, v3, v0, v5}, LVa/K1;->I0(IIBSI)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    if-eqz p1, :cond_1

    .line 195
    .line 196
    move v2, v9

    .line 197
    goto/16 :goto_2

    .line 198
    .line 199
    :sswitch_3
    const v0, 0xcedd

    .line 200
    .line 201
    .line 202
    invoke-static {v8, v8}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    add-int/2addr v1, v0

    .line 207
    const-string v0, "\u3434\ufac1\ua9a7\u5887\u0f6c\u3e5c\ued3e\u9c1d\u42ff\u71f1\u20b4\ud762\u8640\ub52c"

    .line 208
    .line 209
    invoke-static {v1, v0}, LVa/K1;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    if-eqz p1, :cond_1

    .line 222
    .line 223
    const/4 v2, 0x5

    .line 224
    goto/16 :goto_2

    .line 225
    .line 226
    :sswitch_4
    invoke-static {v13, v13, v13}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    add-int/lit8 v0, v0, -0xc

    .line 231
    .line 232
    int-to-short v0, v0

    .line 233
    invoke-static {v13}, Landroid/graphics/Color;->blue(I)I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    add-int/2addr v3, v1

    .line 238
    invoke-static {v13, v12, v12}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    cmpl-float v1, v1, v12

    .line 243
    .line 244
    rsub-int/lit8 v1, v1, -0x13

    .line 245
    .line 246
    invoke-static {v13}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 247
    .line 248
    .line 249
    move-result v5

    .line 250
    cmpl-float v5, v5, v12

    .line 251
    .line 252
    const v6, -0x5d836713

    .line 253
    .line 254
    .line 255
    add-int/2addr v5, v6

    .line 256
    invoke-static {v12, v12}, Landroid/graphics/PointF;->length(FF)F

    .line 257
    .line 258
    .line 259
    move-result v6

    .line 260
    cmpl-float v6, v6, v12

    .line 261
    .line 262
    int-to-byte v6, v6

    .line 263
    invoke-static {v3, v1, v6, v0, v5}, LVa/K1;->I0(IIBSI)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    if-eqz p1, :cond_1

    .line 276
    .line 277
    sget p1, LVa/K1;->S:I

    .line 278
    .line 279
    add-int/lit8 p1, p1, 0x57

    .line 280
    .line 281
    rem-int/lit16 p1, p1, 0x80

    .line 282
    .line 283
    sput p1, LVa/K1;->T:I

    .line 284
    .line 285
    goto/16 :goto_2

    .line 286
    .line 287
    :sswitch_5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 288
    .line 289
    .line 290
    move-result-wide v2

    .line 291
    cmp-long v0, v2, v10

    .line 292
    .line 293
    rsub-int/lit8 v0, v0, 0x3c

    .line 294
    .line 295
    int-to-short v0, v0

    .line 296
    invoke-static {v10, v11}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    add-int/2addr v2, v1

    .line 301
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    shr-int/lit8 v1, v1, 0x16

    .line 306
    .line 307
    add-int/lit8 v1, v1, -0x15

    .line 308
    .line 309
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    shr-int/2addr v3, v9

    .line 314
    const v5, -0x5d8366b9

    .line 315
    .line 316
    .line 317
    add-int/2addr v3, v5

    .line 318
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    shr-int/2addr v5, v9

    .line 323
    int-to-byte v5, v5

    .line 324
    invoke-static {v2, v1, v5, v0, v3}, LVa/K1;->I0(IIBSI)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result p1

    .line 336
    if-eqz p1, :cond_1

    .line 337
    .line 338
    const/16 v2, 0x12

    .line 339
    .line 340
    goto/16 :goto_2

    .line 341
    .line 342
    :sswitch_6
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    shr-int/2addr v0, v9

    .line 347
    const v1, 0xa175

    .line 348
    .line 349
    .line 350
    add-int/2addr v0, v1

    .line 351
    const-string v1, "\u343d\u9565\u76e0\ud04b\ub1c4\u1343\ufcb4\u5e23\u3fb3\u9908\u7a8e\uc43f\ua561\u06cb\ue07e\u41ce\u2345\u8cde\u6e22\ucfb5\ua936"

    .line 352
    .line 353
    invoke-static {v0, v1}, LVa/K1;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result p1

    .line 365
    if-eqz p1, :cond_1

    .line 366
    .line 367
    const/16 v2, 0xd

    .line 368
    .line 369
    goto/16 :goto_2

    .line 370
    .line 371
    :sswitch_7
    invoke-static {v13, v13, v13}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    rsub-int v0, v0, 0x3ae5

    .line 376
    .line 377
    const-string v1, "\u3438\u0ef8"

    .line 378
    .line 379
    invoke-static {v0, v1}, LVa/K1;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result p1

    .line 391
    if-eqz p1, :cond_1

    .line 392
    .line 393
    sget p1, LVa/K1;->T:I

    .line 394
    .line 395
    add-int/2addr p1, v7

    .line 396
    rem-int/lit16 p1, p1, 0x80

    .line 397
    .line 398
    sput p1, LVa/K1;->S:I

    .line 399
    .line 400
    const/16 v2, 0x9

    .line 401
    .line 402
    goto/16 :goto_2

    .line 403
    .line 404
    :sswitch_8
    const v0, -0xffffff

    .line 405
    .line 406
    .line 407
    invoke-static {v13, v13, v13}, Landroid/graphics/Color;->rgb(III)I

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    sub-int/2addr v0, v1

    .line 412
    int-to-short v0, v0

    .line 413
    const v1, -0x3f3bb688

    .line 414
    .line 415
    .line 416
    invoke-static {v13}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    sub-int/2addr v1, v2

    .line 421
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 422
    .line 423
    .line 424
    move-result-wide v2

    .line 425
    cmp-long v2, v2, v10

    .line 426
    .line 427
    add-int/lit8 v2, v2, -0x3a

    .line 428
    .line 429
    const v3, -0x5d8366db

    .line 430
    .line 431
    .line 432
    invoke-static {v13, v13}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 433
    .line 434
    .line 435
    move-result v5

    .line 436
    sub-int/2addr v3, v5

    .line 437
    invoke-static {v13}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 438
    .line 439
    .line 440
    move-result v5

    .line 441
    rsub-int/lit8 v5, v5, -0x1

    .line 442
    .line 443
    int-to-byte v5, v5

    .line 444
    invoke-static {v1, v2, v5, v0, v3}, LVa/K1;->I0(IIBSI)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result p1

    .line 456
    if-eqz p1, :cond_1

    .line 457
    .line 458
    sget p1, LVa/K1;->T:I

    .line 459
    .line 460
    const/16 v2, 0xb

    .line 461
    .line 462
    add-int/2addr p1, v2

    .line 463
    rem-int/lit16 p1, p1, 0x80

    .line 464
    .line 465
    sput p1, LVa/K1;->S:I

    .line 466
    .line 467
    goto/16 :goto_2

    .line 468
    .line 469
    :sswitch_9
    const v0, 0x87de

    .line 470
    .line 471
    .line 472
    invoke-static {v8, v5, v13, v13}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 473
    .line 474
    .line 475
    move-result v1

    .line 476
    add-int/2addr v1, v0

    .line 477
    const-string v0, "\u3430\ub3ca\u3bb7\ua38b\u2b7f\u935b\u1b23\u831b\u0ae5\uf2d5\u7aba\ue26a\u6a66\ud221\u5a03\uc1e6\u49cb\u31b5\ub990\u2175"

    .line 478
    .line 479
    invoke-static {v1, v0}, LVa/K1;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    move-result p1

    .line 491
    if-eqz p1, :cond_1

    .line 492
    .line 493
    const/16 v2, 0xe

    .line 494
    .line 495
    goto/16 :goto_2

    .line 496
    .line 497
    :sswitch_a
    invoke-static {v10, v11}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    add-int/lit8 v0, v0, 0x57

    .line 502
    .line 503
    int-to-short v0, v0

    .line 504
    invoke-static {v13, v13}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 505
    .line 506
    .line 507
    move-result-wide v1

    .line 508
    cmp-long v1, v1, v10

    .line 509
    .line 510
    const v2, -0x3f3bb689

    .line 511
    .line 512
    .line 513
    sub-int/2addr v2, v1

    .line 514
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 515
    .line 516
    .line 517
    move-result-wide v5

    .line 518
    cmp-long v1, v5, v10

    .line 519
    .line 520
    rsub-int/lit8 v1, v1, -0x30

    .line 521
    .line 522
    const v3, -0x5d8366d4

    .line 523
    .line 524
    .line 525
    invoke-static {v13, v13}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 526
    .line 527
    .line 528
    move-result v5

    .line 529
    add-int/2addr v5, v3

    .line 530
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 531
    .line 532
    .line 533
    move-result v3

    .line 534
    shr-int/lit8 v3, v3, 0x18

    .line 535
    .line 536
    int-to-byte v3, v3

    .line 537
    invoke-static {v2, v1, v3, v0, v5}, LVa/K1;->I0(IIBSI)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    move-result p1

    .line 549
    if-eqz p1, :cond_1

    .line 550
    .line 551
    const/16 v2, 0xf

    .line 552
    .line 553
    goto/16 :goto_2

    .line 554
    .line 555
    :sswitch_b
    invoke-static {v13, v13, v13}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 556
    .line 557
    .line 558
    move-result v0

    .line 559
    rsub-int v0, v0, 0x3d3f

    .line 560
    .line 561
    const-string v1, "\u3438\u0922\u4e44\u83a5\uc0e9\u062e\u5b61\u98a1\udde2\u1325"

    .line 562
    .line 563
    invoke-static {v0, v1}, LVa/K1;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    move-result p1

    .line 575
    if-eqz p1, :cond_1

    .line 576
    .line 577
    const/16 v2, 0xc

    .line 578
    .line 579
    goto/16 :goto_2

    .line 580
    .line 581
    :sswitch_c
    const v0, 0xcbc3

    .line 582
    .line 583
    .line 584
    invoke-static {v13, v13, v13, v13}, Landroid/graphics/Color;->argb(IIII)I

    .line 585
    .line 586
    .line 587
    move-result v1

    .line 588
    add-int/2addr v1, v0

    .line 589
    const-string v0, "\u343a\ufff8\ua3b2\u5755\u1b11\ucedf\uf28a\ua658\u6a08\u1dcd\uc189"

    .line 590
    .line 591
    invoke-static {v1, v0}, LVa/K1;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    move-result p1

    .line 603
    if-eqz p1, :cond_1

    .line 604
    .line 605
    const/4 v2, 0x4

    .line 606
    goto/16 :goto_2

    .line 607
    .line 608
    :sswitch_d
    const v0, 0x843b

    .line 609
    .line 610
    .line 611
    invoke-static {v13}, Landroid/graphics/Color;->alpha(I)I

    .line 612
    .line 613
    .line 614
    move-result v1

    .line 615
    add-int/2addr v1, v0

    .line 616
    const-string v0, "\u343a\ub000\u3c46\ub8a5\u24e5\ua12c\u2d7e\ua997\u15d2\u9203\u1e58\u9a9e\u06f1\u82e3\u0f24\u8b6d\u77aa\uf3eb\u781e\ue47b\u6091\uecc7\u691d\ud55d\u5185\uddc3"

    .line 617
    .line 618
    invoke-static {v1, v0}, LVa/K1;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result p1

    .line 630
    if-eqz p1, :cond_1

    .line 631
    .line 632
    sget p1, LVa/K1;->T:I

    .line 633
    .line 634
    add-int/2addr p1, v3

    .line 635
    rem-int/lit16 p1, p1, 0x80

    .line 636
    .line 637
    sput p1, LVa/K1;->S:I

    .line 638
    .line 639
    move v2, v7

    .line 640
    goto/16 :goto_2

    .line 641
    .line 642
    :sswitch_e
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 643
    .line 644
    .line 645
    move-result v0

    .line 646
    shr-int/2addr v0, v9

    .line 647
    add-int/lit8 v0, v0, -0x60

    .line 648
    .line 649
    int-to-short v0, v0

    .line 650
    const v1, -0x3e3bb697

    .line 651
    .line 652
    .line 653
    invoke-static {v13, v13, v13}, Landroid/graphics/Color;->rgb(III)I

    .line 654
    .line 655
    .line 656
    move-result v2

    .line 657
    add-int/2addr v2, v1

    .line 658
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 659
    .line 660
    .line 661
    move-result v1

    .line 662
    shr-int/2addr v1, v9

    .line 663
    rsub-int/lit8 v1, v1, -0x37

    .line 664
    .line 665
    const v3, -0x5d836737

    .line 666
    .line 667
    .line 668
    invoke-static {v8}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 669
    .line 670
    .line 671
    move-result v5

    .line 672
    sub-int/2addr v3, v5

    .line 673
    invoke-static {v10, v11}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 674
    .line 675
    .line 676
    move-result v5

    .line 677
    int-to-byte v5, v5

    .line 678
    invoke-static {v2, v1, v5, v0, v3}, LVa/K1;->I0(IIBSI)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    move-result p1

    .line 690
    if-eqz p1, :cond_1

    .line 691
    .line 692
    goto/16 :goto_0

    .line 693
    .line 694
    :sswitch_f
    invoke-static {v13}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 695
    .line 696
    .line 697
    move-result v0

    .line 698
    add-int/lit8 v0, v0, 0x6a

    .line 699
    .line 700
    int-to-short v0, v0

    .line 701
    const v1, -0x3f3bb697

    .line 702
    .line 703
    .line 704
    invoke-static {v13, v13}, Landroid/view/View;->resolveSize(II)I

    .line 705
    .line 706
    .line 707
    move-result v2

    .line 708
    add-int/2addr v2, v1

    .line 709
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 710
    .line 711
    .line 712
    move-result v1

    .line 713
    cmpl-float v1, v1, v12

    .line 714
    .line 715
    rsub-int/lit8 v1, v1, -0x2e

    .line 716
    .line 717
    invoke-static {v13}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 718
    .line 719
    .line 720
    move-result v3

    .line 721
    cmpl-float v3, v3, v12

    .line 722
    .line 723
    const v5, -0x5d836747

    .line 724
    .line 725
    .line 726
    add-int/2addr v3, v5

    .line 727
    invoke-static {v13, v12, v12}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 728
    .line 729
    .line 730
    move-result v5

    .line 731
    cmpl-float v5, v5, v12

    .line 732
    .line 733
    int-to-byte v5, v5

    .line 734
    invoke-static {v2, v1, v5, v0, v3}, LVa/K1;->I0(IIBSI)Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 743
    .line 744
    .line 745
    move-result p1

    .line 746
    if-eqz p1, :cond_1

    .line 747
    .line 748
    move v2, v13

    .line 749
    goto :goto_2

    .line 750
    :sswitch_10
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 751
    .line 752
    .line 753
    move-result-wide v0

    .line 754
    cmp-long v0, v0, v10

    .line 755
    .line 756
    add-int/lit16 v0, v0, 0x2134

    .line 757
    .line 758
    const-string v1, "\u343a\u150e\u765a\u578b\ub0dd\u9202\uf322\udc79\u3da2\u1ecd\u7804\u5950\uba44\u9bab\ue4eb\uc60b\u275f\u0095\u61b7\u42ef"

    .line 759
    .line 760
    invoke-static {v0, v1}, LVa/K1;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 769
    .line 770
    .line 771
    move-result p1

    .line 772
    if-eqz p1, :cond_1

    .line 773
    .line 774
    const/4 v2, 0x1

    .line 775
    goto :goto_2

    .line 776
    :sswitch_11
    invoke-static {v8}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 777
    .line 778
    .line 779
    move-result v0

    .line 780
    add-int/lit16 v0, v0, 0x5171

    .line 781
    .line 782
    const-string v1, "\u343a\u654a\u96d2\uc047\u71cd\ua33e\udcba\u0e1d\ubf82\ue8e9\u1a7c\u4bcc\ue563\u16ad\u4032\uf191\u2328\u5c9b\u8dff\u3f73\u68db\u9a55\ucbbb\u6527"

    .line 783
    .line 784
    invoke-static {v0, v1}, LVa/K1;->o(ILjava/lang/String;)Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 793
    .line 794
    .line 795
    move-result p1

    .line 796
    if-eqz p1, :cond_1

    .line 797
    .line 798
    sget p1, LVa/K1;->S:I

    .line 799
    .line 800
    add-int/lit8 p1, p1, 0x4b

    .line 801
    .line 802
    rem-int/lit16 p1, p1, 0x80

    .line 803
    .line 804
    sput p1, LVa/K1;->T:I

    .line 805
    .line 806
    const/16 v2, 0x11

    .line 807
    .line 808
    goto :goto_2

    .line 809
    :sswitch_12
    invoke-static {v8, v5, v13, v13}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 810
    .line 811
    .line 812
    move-result v0

    .line 813
    rsub-int/lit8 v0, v0, 0x67

    .line 814
    .line 815
    int-to-short v0, v0

    .line 816
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 817
    .line 818
    .line 819
    move-result v1

    .line 820
    shr-int/2addr v1, v9

    .line 821
    const v2, -0x3f3bb686

    .line 822
    .line 823
    .line 824
    add-int/2addr v1, v2

    .line 825
    invoke-static {v13, v13}, Landroid/view/View;->getDefaultSize(II)I

    .line 826
    .line 827
    .line 828
    move-result v2

    .line 829
    rsub-int/lit8 v2, v2, -0x26

    .line 830
    .line 831
    const v3, -0x5d83672d

    .line 832
    .line 833
    .line 834
    invoke-static {v13}, Landroid/graphics/Color;->red(I)I

    .line 835
    .line 836
    .line 837
    move-result v5

    .line 838
    add-int/2addr v5, v3

    .line 839
    invoke-static {v13}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 840
    .line 841
    .line 842
    move-result v3

    .line 843
    int-to-byte v3, v3

    .line 844
    invoke-static {v1, v2, v3, v0, v5}, LVa/K1;->I0(IIBSI)Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 853
    .line 854
    .line 855
    move-result p1

    .line 856
    if-eqz p1, :cond_1

    .line 857
    .line 858
    const/4 v2, 0x6

    .line 859
    goto :goto_2

    .line 860
    :cond_1
    :goto_1
    move v2, v4

    .line 861
    :goto_2
    packed-switch v2, :pswitch_data_0

    .line 862
    .line 863
    .line 864
    const/4 p1, 0x0

    .line 865
    return-object p1

    .line 866
    :pswitch_0
    const-class p1, Lcom/chartboost/sdk/view/CBImpressionActivity;

    .line 867
    .line 868
    return-object p1

    .line 869
    :pswitch_1
    const-class p1, Lcom/chartboost/sdk/callbacks/StartCallback;

    .line 870
    .line 871
    return-object p1

    .line 872
    :pswitch_2
    const-class p1, Lcom/chartboost/sdk/callbacks/RewardedCallback;

    .line 873
    .line 874
    return-object p1

    .line 875
    :pswitch_3
    const-class p1, Lcom/chartboost/sdk/callbacks/InterstitialCallback;

    .line 876
    .line 877
    return-object p1

    .line 878
    :pswitch_4
    const-class p1, Lcom/chartboost/sdk/callbacks/DismissibleAdCallback;

    .line 879
    .line 880
    return-object p1

    .line 881
    :pswitch_5
    const-class p1, Lcom/chartboost/sdk/callbacks/AdCallback;

    .line 882
    .line 883
    return-object p1

    .line 884
    :pswitch_6
    const-class p1, Lcom/chartboost/sdk/ads/Rewarded;

    .line 885
    .line 886
    return-object p1

    .line 887
    :pswitch_7
    const-class p1, Lcom/chartboost/sdk/ads/Interstitial;

    .line 888
    .line 889
    return-object p1

    .line 890
    :pswitch_8
    const-class p1, Lcom/chartboost/sdk/ads/Ad;

    .line 891
    .line 892
    return-object p1

    .line 893
    :pswitch_9
    const-class p1, Lcom/chartboost/sdk/legacy/CBImpressionActivity;

    .line 894
    .line 895
    return-object p1

    .line 896
    :pswitch_a
    const-class p1, LVa/J1;

    .line 897
    .line 898
    return-object p1

    .line 899
    :pswitch_b
    const-class p1, Lcom/chartboost/sdk/Networking/requests/models/MediationModel;

    .line 900
    .line 901
    return-object p1

    .line 902
    :pswitch_c
    const-class p1, Lcom/chartboost/sdk/Chartboost$CBMediation;

    .line 903
    .line 904
    return-object p1

    .line 905
    :pswitch_d
    const-class p1, Lcom/chartboost/sdk/InPlay/CBInPlay;

    .line 906
    .line 907
    return-object p1

    .line 908
    :pswitch_e
    const-class p1, Lcom/chartboost/sdk/Chartboost;

    .line 909
    .line 910
    return-object p1

    .line 911
    :pswitch_f
    const-class p1, Lcom/chartboost/sdk/CBImpressionActivity;

    .line 912
    .line 913
    return-object p1

    .line 914
    :pswitch_10
    const-class p1, Lcom/chartboost/sdk/ChartboostActivity;

    .line 915
    .line 916
    return-object p1

    .line 917
    :sswitch_data_0
    .sparse-switch
        -0x5f80302a -> :sswitch_12
        -0x4a9a2f44 -> :sswitch_11
        -0x36e72509 -> :sswitch_10
        -0x33d6bb2c -> :sswitch_f
        -0x1e969d5b -> :sswitch_e
        -0x18cd3420 -> :sswitch_d
        -0x1620bca7 -> :sswitch_c
        -0x15086658 -> :sswitch_b
        -0x123ad96d -> :sswitch_a
        -0xd2ccc4f -> :sswitch_9
        -0xa6d4fd2 -> :sswitch_8
        0x843 -> :sswitch_7
        0x11b0dc64 -> :sswitch_6
        0x207bc210 -> :sswitch_5
        0x2402cb6c -> :sswitch_4
        0x26c48131 -> :sswitch_3
        0x2ceef6a7 -> :sswitch_2
        0x2dd6bb4c -> :sswitch_1
        0x560fe338 -> :sswitch_0
    .end sparse-switch

    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
        :pswitch_0
    .end packed-switch
.end method
