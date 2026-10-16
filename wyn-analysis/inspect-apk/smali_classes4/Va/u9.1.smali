.class public final LVa/u9;
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
    const/16 v0, 0x30

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/u9;->c:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0x2t
        -0xft
        -0x3t
        0x6t
        0x1ct
        -0x1bt
        -0x1t
        -0x3t
        0x29t
        0x1bt
        -0x3dt
        0x7t
        -0xft
        0x5t
        -0x1t
        0x6t
        -0xbt
        0x13t
        -0x8t
        0x5t
        -0x1t
        -0x8t
        0x3ft
        -0x37t
        0x2t
        -0xft
        -0x3t
        0x6t
        -0x4t
        0x5t
        -0x1t
        -0x3t
        0x9t
        0x3bt
        -0x3ft
        -0x2t
        0xct
        0x2t
        -0xft
        -0x3t
        0x6t
        -0x4t
        0x5t
        -0x1t
        -0x3t
        0x9t
        0x0t
        0x0t
    .end array-data
.end method

.method public static f(SIIIB)Ljava/lang/String;
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
    add-int/lit8 p2, p2, 0x4e

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-ne p2, v2, :cond_0

    .line 15
    .line 16
    move v3, v4

    .line 17
    :cond_0
    if-eqz v3, :cond_1

    .line 18
    .line 19
    sget-object p2, LVa/u9;->c:[B

    .line 20
    .line 21
    const v2, 0x21870a61

    .line 22
    .line 23
    .line 24
    add-int/2addr v2, p3

    .line 25
    aget-byte p2, p2, v2

    .line 26
    .line 27
    add-int/lit8 p2, p2, 0x4e

    .line 28
    .line 29
    int-to-byte p2, p2

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
    if-lez p2, :cond_2

    .line 34
    .line 35
    add-int/2addr p3, p2

    .line 36
    const v2, -0x21870a5f

    .line 37
    .line 38
    .line 39
    sub-int/2addr p3, v2

    .line 40
    add-int/2addr p3, v3

    .line 41
    sput p3, LVa/pb;->F:I

    .line 42
    .line 43
    sput-byte p4, LVa/pb;->G:B

    .line 44
    .line 45
    const p3, 0x23f99419

    .line 46
    .line 47
    .line 48
    add-int/2addr p1, p3

    .line 49
    int-to-char p1, p1

    .line 50
    sput-char p1, LVa/pb;->H:C

    .line 51
    .line 52
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    sget-char p1, LVa/pb;->H:C

    .line 56
    .line 57
    sput-char p1, LVa/pb;->I:C

    .line 58
    .line 59
    sput v4, LVa/pb;->E:I

    .line 60
    .line 61
    :goto_1
    sget p1, LVa/pb;->E:I

    .line 62
    .line 63
    if-ge p1, p2, :cond_2

    .line 64
    .line 65
    sget-object p1, LVa/u9;->c:[B

    .line 66
    .line 67
    sget p3, LVa/pb;->F:I

    .line 68
    .line 69
    add-int/lit8 p4, p3, -0x1

    .line 70
    .line 71
    sput p4, LVa/pb;->F:I

    .line 72
    .line 73
    aget-byte p1, p1, p3

    .line 74
    .line 75
    sget-char p3, LVa/pb;->I:C

    .line 76
    .line 77
    add-int/2addr p1, p0

    .line 78
    int-to-byte p1, p1

    .line 79
    sget-byte p4, LVa/pb;->G:B

    .line 80
    .line 81
    xor-int/2addr p1, p4

    .line 82
    add-int/2addr p3, p1

    .line 83
    int-to-char p1, p3

    .line 84
    sput-char p1, LVa/pb;->H:C

    .line 85
    .line 86
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    sget-char p1, LVa/pb;->H:C

    .line 90
    .line 91
    sput-char p1, LVa/pb;->I:C

    .line 92
    .line 93
    sget p1, LVa/pb;->E:I

    .line 94
    .line 95
    add-int/2addr p1, v4

    .line 96
    sput p1, LVa/pb;->E:I

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
    sget v0, LVa/u9;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/u9;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    const v3, -0x21870a3b

    .line 14
    .line 15
    .line 16
    const v4, -0x23f993b0

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-static {v5}, Landroid/graphics/Color;->blue(I)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    int-to-short v0, v0

    .line 27
    invoke-static {v5, v5}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    ushr-int/2addr v4, v6

    .line 32
    const/16 v6, 0x10

    .line 33
    .line 34
    invoke-static {v5}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    rem-int/2addr v6, v7

    .line 39
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 40
    .line 41
    .line 42
    move-result-wide v7

    .line 43
    cmp-long v1, v7, v1

    .line 44
    .line 45
    rem-int/2addr v3, v1

    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-static {v5, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    :goto_0
    int-to-byte v1, v1

    .line 52
    invoke-static {v0, v4, v6, v3, v1}, LVa/u9;->f(SIIIB)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0

    .line 61
    :cond_0
    invoke-static {v5}, Landroid/graphics/Color;->blue(I)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    int-to-short v0, v0

    .line 66
    invoke-static {v5, v5}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    sub-int/2addr v4, v6

    .line 71
    invoke-static {v5}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    add-int/lit8 v6, v6, -0x43

    .line 76
    .line 77
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 78
    .line 79
    .line 80
    move-result-wide v7

    .line 81
    cmp-long v1, v7, v1

    .line 82
    .line 83
    sub-int/2addr v3, v1

    .line 84
    invoke-static {v5, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    goto :goto_0
.end method

.method public final c()LVa/Z0;
    .locals 2

    .line 1
    new-instance v0, LVa/w3;

    .line 2
    .line 3
    invoke-virtual {p0}, LVa/u9;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, LVa/Z0;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget v1, LVa/u9;->d:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x17

    .line 13
    .line 14
    rem-int/lit16 v1, v1, 0x80

    .line 15
    .line 16
    sput v1, LVa/u9;->e:I

    .line 17
    .line 18
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 7

    .line 1
    sget v0, LVa/u9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4f

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/u9;->d:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0, v0}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    const-wide/16 v3, 0x0

    .line 15
    .line 16
    cmp-long v1, v1, v3

    .line 17
    .line 18
    rsub-int/lit8 v1, v1, -0x1

    .line 19
    .line 20
    int-to-short v1, v1

    .line 21
    const v2, -0x23f993b6

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    sub-int/2addr v2, v5

    .line 29
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    cmp-long v3, v5, v3

    .line 34
    .line 35
    add-int/lit8 v3, v3, -0x29

    .line 36
    .line 37
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    shr-int/lit8 v4, v4, 0x10

    .line 42
    .line 43
    const v5, -0x21870a61

    .line 44
    .line 45
    .line 46
    add-int/2addr v4, v5

    .line 47
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    shr-int/lit8 v5, v5, 0x10

    .line 52
    .line 53
    int-to-byte v5, v5

    .line 54
    invoke-static {v1, v2, v3, v4, v5}, LVa/u9;->f(SIIIB)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    sget v2, LVa/u9;->d:I

    .line 63
    .line 64
    add-int/lit8 v2, v2, 0x21

    .line 65
    .line 66
    rem-int/lit16 v3, v2, 0x80

    .line 67
    .line 68
    sput v3, LVa/u9;->e:I

    .line 69
    .line 70
    rem-int/lit8 v2, v2, 0x2

    .line 71
    .line 72
    if-nez v2, :cond_0

    .line 73
    .line 74
    const/16 v2, 0x37

    .line 75
    .line 76
    div-int/2addr v2, v0

    .line 77
    :cond_0
    return-object v1
.end method

.method public final e()Ljava/lang/Class;
    .locals 3

    .line 1
    sget v0, LVa/u9;->d:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x77

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, LVa/u9;->e:I

    .line 8
    .line 9
    const-class v1, Lcom/ironsource/mediationsdk/IronSource;

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0xb

    .line 12
    .line 13
    rem-int/lit16 v2, v0, 0x80

    .line 14
    .line 15
    sput v2, LVa/u9;->e:I

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
