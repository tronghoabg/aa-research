.class public abstract LVa/M8;
.super LVa/N8;
.source "SourceFile"


# static fields
.field public static final j:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/M8;->j:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0x0t
        0x4et
        0x6t
        -0x58t
        0x8t
        -0x4at
        0x11t
        -0x3dt
        0x76t
        0x63t
        -0x44t
        -0x48t
        -0x49t
        -0x3ct
        -0x4ft
        -0xat
        -0x44t
        0x72t
        0x4bt
        0x7t
    .end array-data
.end method

.method public static g(SIIIB)Ljava/lang/String;
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
    add-int/lit8 p2, p2, 0xf

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
    sget-object p2, LVa/M8;->j:[B

    .line 20
    .line 21
    const v2, 0x690bcf70

    .line 22
    .line 23
    .line 24
    add-int/2addr v2, p3

    .line 25
    aget-byte p2, p2, v2

    .line 26
    .line 27
    add-int/lit8 p2, p2, 0xf

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
    const v2, -0x690bcf6e

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
    const p3, 0x784f8a0c

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
    sget-object p1, LVa/M8;->j:[B

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
.method public final j(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    shr-int/lit8 v2, v2, 0x18

    .line 13
    .line 14
    add-int/lit8 v2, v2, -0x65

    .line 15
    .line 16
    int-to-short v2, v2

    .line 17
    const v3, -0x784f89c9

    .line 18
    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-static {v4, v4}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    sub-int/2addr v3, v5

    .line 26
    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    rsub-int/lit8 v5, v5, -0x10

    .line 31
    .line 32
    const v6, -0x690bcf70

    .line 33
    .line 34
    .line 35
    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    add-int/2addr v7, v6

    .line 40
    const-wide/16 v8, 0x0

    .line 41
    .line 42
    invoke-static {v8, v9}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    rsub-int/lit8 v6, v6, 0x51

    .line 47
    .line 48
    int-to-byte v6, v6

    .line 49
    invoke-static {v2, v3, v5, v7, v6}, LVa/M8;->g(SIIIB)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    shr-int/lit8 p1, p1, 0x16

    .line 68
    .line 69
    add-int/lit8 p1, p1, 0x1f

    .line 70
    .line 71
    int-to-short p1, p1

    .line 72
    const v2, -0x784f89ec

    .line 73
    .line 74
    .line 75
    invoke-static {v4, v4}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    add-int/2addr v3, v2

    .line 80
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    shr-int/lit8 v2, v2, 0x8

    .line 85
    .line 86
    rsub-int/lit8 v2, v2, -0x10

    .line 87
    .line 88
    const v5, -0x690bcf61

    .line 89
    .line 90
    .line 91
    const-string v6, ""

    .line 92
    .line 93
    invoke-static {v6, v4}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    add-int/2addr v4, v5

    .line 98
    invoke-static {v6}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    add-int/lit8 v5, v5, 0x68

    .line 103
    .line 104
    int-to-byte v5, v5

    .line 105
    invoke-static {p1, v3, v2, v4, v5}, LVa/M8;->g(SIIIB)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v0
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, ""

    .line 9
    .line 10
    const/16 v3, 0x30

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-static {v2, v3, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    rsub-int/lit8 v5, v5, -0x66

    .line 18
    .line 19
    int-to-short v5, v5

    .line 20
    const v6, -0x784f89c9

    .line 21
    .line 22
    .line 23
    invoke-static {v4, v4}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    add-int/2addr v7, v6

    .line 28
    invoke-static {v2}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    rsub-int/lit8 v6, v6, -0x10

    .line 33
    .line 34
    const v8, -0x690bcf71

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3, v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    sub-int/2addr v8, v2

    .line 42
    const v2, 0x1000052

    .line 43
    .line 44
    .line 45
    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    add-int/2addr v3, v2

    .line 50
    int-to-byte v2, v3

    .line 51
    invoke-static {v5, v7, v6, v8, v2}, LVa/M8;->g(SIIIB)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    const-wide/16 v4, 0x0

    .line 70
    .line 71
    cmp-long p1, v2, v4

    .line 72
    .line 73
    add-int/lit8 p1, p1, 0x1e

    .line 74
    .line 75
    int-to-short p1, p1

    .line 76
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    shr-int/lit8 v2, v2, 0x10

    .line 81
    .line 82
    const v3, -0x784f89ec

    .line 83
    .line 84
    .line 85
    add-int/2addr v2, v3

    .line 86
    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    add-int/lit8 v3, v3, -0x10

    .line 91
    .line 92
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    shr-int/lit8 v4, v4, 0x10

    .line 97
    .line 98
    const v5, -0x690bcf61

    .line 99
    .line 100
    .line 101
    sub-int/2addr v5, v4

    .line 102
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    shr-int/lit8 v4, v4, 0x18

    .line 107
    .line 108
    rsub-int/lit8 v4, v4, 0x67

    .line 109
    .line 110
    int-to-byte v4, v4

    .line 111
    invoke-static {p1, v2, v3, v5, v4}, LVa/M8;->g(SIIIB)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0
.end method
