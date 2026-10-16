.class public final LVa/B9;
.super LVa/r9;
.source "SourceFile"


# static fields
.field public static final c:[B

.field public static d:I = 0x0

.field public static e:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x34

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/B9;->c:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0xft
        0x23t
        -0x24t
        -0x8t
        -0x2t
        -0x4t
        0xet
        -0x12t
        0x36t
        0x13t
        -0x44t
        0xdt
        -0x3t
        -0xbt
        0xat
        -0x3t
        0xat
        -0x13t
        0x5t
        0x42t
        -0x3dt
        0x7t
        -0xft
        0x45t
        -0x37t
        -0x8t
        -0x2t
        -0x4t
        0xet
        -0x12t
        0x16t
        -0x11t
        0xdt
        -0xbt
        -0x5t
        0x2t
        0x45t
        -0x48t
        0x2t
        -0x8t
        -0x2t
        -0x4t
        0xet
        -0x12t
        0x16t
        -0x11t
        0xdt
        -0xbt
        -0x5t
        0x2t
        0x0t
        0x0t
    .end array-data
.end method

.method public static f(IIBSI)Ljava/lang/String;
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
    add-int/lit8 p1, p1, 0x4

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
    sget-object p1, LVa/B9;->c:[B

    .line 20
    .line 21
    const v2, -0x7182da2

    .line 22
    .line 23
    .line 24
    add-int/2addr v2, p4

    .line 25
    aget-byte p1, p1, v2

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x4

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
    const v2, 0x7182da4

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
    const p2, 0x1e2bbc7a

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
    sget-object p0, LVa/B9;->c:[B

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


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 9

    .line 1
    sget v0, LVa/B9;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/B9;->e:I

    .line 8
    .line 9
    const/16 v0, 0x30

    .line 10
    .line 11
    const-string v1, ""

    .line 12
    .line 13
    invoke-static {v1, v0}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    int-to-short v0, v0

    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v2, v2}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    const-wide/16 v5, 0x0

    .line 26
    .line 27
    cmp-long v3, v3, v5

    .line 28
    .line 29
    const v4, -0x1e2bbc06

    .line 30
    .line 31
    .line 32
    add-int/2addr v3, v4

    .line 33
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 34
    .line 35
    .line 36
    move-result-wide v7

    .line 37
    cmp-long v4, v7, v5

    .line 38
    .line 39
    add-int/lit8 v4, v4, 0x7

    .line 40
    .line 41
    invoke-static {v2}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 42
    .line 43
    .line 44
    move-result-wide v7

    .line 45
    cmp-long v5, v7, v5

    .line 46
    .line 47
    const v6, 0x7182dc9

    .line 48
    .line 49
    .line 50
    sub-int/2addr v6, v5

    .line 51
    invoke-static {v1, v1, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    int-to-byte v1, v1

    .line 56
    invoke-static {v3, v4, v1, v0, v6}, LVa/B9;->f(IIBSI)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget v1, LVa/B9;->d:I

    .line 65
    .line 66
    add-int/lit8 v1, v1, 0x51

    .line 67
    .line 68
    rem-int/lit16 v2, v1, 0x80

    .line 69
    .line 70
    sput v2, LVa/B9;->e:I

    .line 71
    .line 72
    rem-int/lit8 v1, v1, 0x2

    .line 73
    .line 74
    if-eqz v1, :cond_0

    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_0
    const/4 v0, 0x0

    .line 78
    throw v0
.end method

.method public final c()LVa/Z0;
    .locals 2

    .line 1
    new-instance v0, LVa/q6;

    .line 2
    .line 3
    invoke-virtual {p0}, LVa/B9;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, LVa/Z0;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget v1, LVa/B9;->d:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x73

    .line 13
    .line 14
    rem-int/lit16 v1, v1, 0x80

    .line 15
    .line 16
    sput v1, LVa/B9;->e:I

    .line 17
    .line 18
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 7

    .line 1
    sget v0, LVa/B9;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x35

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/B9;->e:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    int-to-short v1, v1

    .line 15
    invoke-static {v0}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x0

    .line 20
    cmpl-float v0, v0, v2

    .line 21
    .line 22
    const v2, -0x1e2bbc06

    .line 23
    .line 24
    .line 25
    add-int/2addr v0, v2

    .line 26
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    shr-int/lit8 v2, v2, 0x10

    .line 31
    .line 32
    rsub-int/lit8 v2, v2, 0x24

    .line 33
    .line 34
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    const-wide/16 v5, 0x0

    .line 39
    .line 40
    cmp-long v3, v3, v5

    .line 41
    .line 42
    const v4, 0x7182da3

    .line 43
    .line 44
    .line 45
    sub-int/2addr v4, v3

    .line 46
    const/16 v3, 0x30

    .line 47
    .line 48
    invoke-static {v3}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    sub-int/2addr v3, v5

    .line 53
    int-to-byte v3, v3

    .line 54
    invoke-static {v0, v2, v3, v1, v4}, LVa/B9;->f(IIBSI)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget v1, LVa/B9;->e:I

    .line 63
    .line 64
    add-int/lit8 v1, v1, 0x6d

    .line 65
    .line 66
    rem-int/lit16 v2, v1, 0x80

    .line 67
    .line 68
    sput v2, LVa/B9;->d:I

    .line 69
    .line 70
    rem-int/lit8 v1, v1, 0x2

    .line 71
    .line 72
    if-nez v1, :cond_0

    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_0
    const/4 v0, 0x0

    .line 76
    throw v0
.end method

.method public final e()Ljava/lang/Class;
    .locals 3

    .line 1
    sget v0, LVa/B9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x17

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/B9;->d:I

    .line 8
    .line 9
    const-class v1, Ltv/superawesome/sdk/publisher/AwesomeAds;

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x75

    .line 12
    .line 13
    rem-int/lit16 v2, v0, 0x80

    .line 14
    .line 15
    sput v2, LVa/B9;->e:I

    .line 16
    .line 17
    rem-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    throw v0
.end method
