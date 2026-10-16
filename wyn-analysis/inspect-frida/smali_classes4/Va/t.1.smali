.class public final LVa/t;
.super LVa/Ba;
.source "SourceFile"


# static fields
.field public static final g:[B


# instance fields
.field public synthetic c:LVa/lb;

.field public synthetic d:I

.field public synthetic e:Ljava/lang/String;

.field public synthetic f:LVa/Ra;


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
    sput-object v0, LVa/t;->g:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0x6t
        0x6at
        0x59t
        0x76t
        -0x77t
        -0x7dt
        -0x7dt
        -0x7ft
        -0x6et
        0x77t
        -0x2at
        0x30t
        -0x77t
        -0x54t
        -0x55t
        0x76t
        0x3et
        -0x76t
        -0x73t
        0x73t
        -0x4bt
        0x65t
        0x7at
        -0x73t
        0x76t
        -0x29t
        0x3ct
        0x78t
        -0x71t
        0x76t
        -0x25t
        0x3dt
        0x7dt
        -0x7dt
        -0x7ft
        0x7ft
        -0x25t
        0x30t
        -0x76t
        -0x73t
        0x72t
        -0x25t
        0x3dt
        0x7dt
        -0x77t
        -0x7bt
        0x78t
        -0x6dt
        0x7ct
        -0x7et
        -0x60t
        -0x2ct
    .end array-data
.end method

.method public static d(IIBSI)Ljava/lang/String;
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
    add-int/lit8 p4, p4, 0x2d

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-ne p4, v2, :cond_0

    .line 15
    .line 16
    move v3, v4

    .line 17
    :cond_0
    if-eqz v3, :cond_1

    .line 18
    .line 19
    sget-object p4, LVa/t;->g:[B

    .line 20
    .line 21
    const v2, -0xa251255

    .line 22
    .line 23
    .line 24
    add-int/2addr v2, p0

    .line 25
    aget-byte p4, p4, v2

    .line 26
    .line 27
    add-int/lit8 p4, p4, 0x2d

    .line 28
    .line 29
    int-to-byte p4, p4

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
    if-lez p4, :cond_2

    .line 34
    .line 35
    add-int/2addr p0, p4

    .line 36
    const v2, 0xa251257

    .line 37
    .line 38
    .line 39
    sub-int/2addr p0, v2

    .line 40
    add-int/2addr p0, v3

    .line 41
    sput p0, LVa/pb;->F:I

    .line 42
    .line 43
    sput-byte p2, LVa/pb;->G:B

    .line 44
    .line 45
    const p0, -0x584beeb8

    .line 46
    .line 47
    .line 48
    add-int/2addr p1, p0

    .line 49
    int-to-char p0, p1

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
    if-ge p0, p4, :cond_2

    .line 64
    .line 65
    sget-object p0, LVa/t;->g:[B

    .line 66
    .line 67
    sget p1, LVa/pb;->F:I

    .line 68
    .line 69
    add-int/lit8 p2, p1, -0x1

    .line 70
    .line 71
    sput p2, LVa/pb;->F:I

    .line 72
    .line 73
    aget-byte p0, p0, p1

    .line 74
    .line 75
    sget-char p1, LVa/pb;->I:C

    .line 76
    .line 77
    add-int/2addr p0, p3

    .line 78
    int-to-byte p0, p0

    .line 79
    sget-byte p2, LVa/pb;->G:B

    .line 80
    .line 81
    xor-int/2addr p0, p2

    .line 82
    add-int/2addr p1, p0

    .line 83
    int-to-char p0, p1

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
.method public final c()V
    .locals 12

    .line 1
    iget-object v0, p0, LVa/t;->f:LVa/Ra;

    .line 2
    .line 3
    iget-object v0, v0, LVa/Ra;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LS3/i;

    .line 6
    .line 7
    iget-object v0, v0, LS3/i;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LVa/p;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    shr-int/lit8 v2, v2, 0x10

    .line 21
    .line 22
    int-to-byte v2, v2

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static {v3, v3}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const v5, 0xa251255

    .line 29
    .line 30
    .line 31
    sub-int/2addr v5, v4

    .line 32
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    shr-int/lit8 v4, v4, 0x8

    .line 37
    .line 38
    const v6, 0x584bef0b

    .line 39
    .line 40
    .line 41
    add-int/2addr v4, v6

    .line 42
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 43
    .line 44
    .line 45
    move-result-wide v6

    .line 46
    const-wide/16 v8, 0x0

    .line 47
    .line 48
    cmp-long v6, v6, v8

    .line 49
    .line 50
    rsub-int/lit8 v6, v6, 0x7d

    .line 51
    .line 52
    int-to-short v6, v6

    .line 53
    invoke-static {v3, v3}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 54
    .line 55
    .line 56
    move-result-wide v10

    .line 57
    cmp-long v7, v10, v8

    .line 58
    .line 59
    rsub-int/lit8 v7, v7, -0x2f

    .line 60
    .line 61
    invoke-static {v5, v4, v2, v6, v7}, LVa/t;->d(IIBSI)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    iget v2, p0, LVa/t;->d:I

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-static {v3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    int-to-byte v2, v2

    .line 82
    const v4, 0xa251288

    .line 83
    .line 84
    .line 85
    invoke-static {v3, v3, v3}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    sub-int/2addr v4, v5

    .line 90
    const v5, 0x584beed8

    .line 91
    .line 92
    .line 93
    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    add-int/2addr v3, v5

    .line 98
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    const/4 v6, 0x0

    .line 103
    cmpl-float v5, v5, v6

    .line 104
    .line 105
    rsub-int/lit8 v5, v5, 0xa

    .line 106
    .line 107
    int-to-short v5, v5

    .line 108
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 109
    .line 110
    .line 111
    move-result-wide v6

    .line 112
    cmp-long v6, v6, v8

    .line 113
    .line 114
    rsub-int/lit8 v6, v6, -0x2d

    .line 115
    .line 116
    invoke-static {v4, v3, v2, v5, v6}, LVa/t;->d(IIBSI)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    iget-object v2, p0, LVa/t;->e:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    iget-object v2, p0, LVa/t;->c:LVa/lb;

    .line 137
    .line 138
    invoke-virtual {v0, v2, v1}, LVa/p;->b(LVa/lb;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-void
.end method
