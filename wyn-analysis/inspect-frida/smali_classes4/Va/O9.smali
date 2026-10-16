.class public final LVa/O9;
.super LVa/G9;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# static fields
.field public static final c:[B

.field public static d:I = 0x0

.field public static e:I = 0x1


# instance fields
.field public b:LVa/N9;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x3e

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/O9;->c:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        -0x23t
        0x6dt
        -0x6bt
        0x7dt
        -0x7ft
        0x6dt
        0x62t
        -0x70t
        0x4ft
        -0x44t
        0x63t
        -0x67t
        0x67t
        -0x61t
        0x6ft
        0x64t
        0x73t
        -0x50t
        -0x6ft
        0x68t
        -0x65t
        0x61t
        -0x69t
        -0x6et
        0x6dt
        -0x70t
        0x42t
        -0x45t
        0x71t
        -0x1ft
        0x3at
        -0x3dt
        0x30t
        -0x36t
        0x3ct
        0x39t
        -0x3at
        0x3bt
        -0x17t
        0x10t
        0x3at
        -0x76t
        0x6bt
        -0x38t
        0x32t
        -0x34t
        0x34t
        -0x3ct
        -0x31t
        -0x28t
        0x2ft
        -0x35t
        0x22t
        -0x78t
        0x77t
        -0x40t
        -0x74t
        0x6bt
        -0x3at
        0x38t
        -0x3bt
        -0x18t
    .end array-data
.end method

.method public static a(IIBSI)Ljava/lang/String;
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
    add-int/lit8 p1, p1, 0x40

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
    sget-object p1, LVa/O9;->c:[B

    .line 20
    .line 21
    const v2, -0x424ef59d

    .line 22
    .line 23
    .line 24
    add-int/2addr v2, p4

    .line 25
    aget-byte p1, p1, v2

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x40

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
    const v2, 0x424ef59f

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
    const p2, 0x5817ab39

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
    sget-object p0, LVa/O9;->c:[B

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
.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 12

    .line 1
    sget v0, LVa/O9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x37

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/O9;->d:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :try_start_0
    iget-object v1, p0, LVa/O9;->b:LVa/N9;

    .line 11
    .line 12
    invoke-interface {v1, p0, p1}, LVa/N9;->a(LVa/O9;Landroid/media/MediaPlayer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    shr-int/lit8 v2, v2, 0x10

    .line 22
    .line 23
    int-to-short v2, v2

    .line 24
    const v3, -0x5817aaea

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    sub-int/2addr v3, v4

    .line 32
    const-string v4, ""

    .line 33
    .line 34
    invoke-static {v4, v4, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    rsub-int/lit8 v5, v5, -0x41

    .line 39
    .line 40
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    shr-int/lit8 v6, v6, 0x10

    .line 45
    .line 46
    const v7, 0x424ef59d

    .line 47
    .line 48
    .line 49
    sub-int/2addr v7, v6

    .line 50
    invoke-static {v0}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 51
    .line 52
    .line 53
    move-result-wide v8

    .line 54
    const-wide/16 v10, 0x0

    .line 55
    .line 56
    cmp-long v6, v8, v10

    .line 57
    .line 58
    add-int/lit8 v6, v6, 0x6e

    .line 59
    .line 60
    int-to-byte v6, v6

    .line 61
    invoke-static {v3, v5, v6, v2, v7}, LVa/O9;->a(IIBSI)Ljava/lang/String;

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
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    const/4 v5, 0x0

    .line 74
    cmpl-float v3, v3, v5

    .line 75
    .line 76
    add-int/lit8 v3, v3, -0x1

    .line 77
    .line 78
    int-to-short v3, v3

    .line 79
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    shr-int/lit8 v5, v5, 0x10

    .line 84
    .line 85
    const v6, -0x5817aaf4

    .line 86
    .line 87
    .line 88
    add-int/2addr v5, v6

    .line 89
    invoke-static {v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    add-int/lit8 v6, v6, -0x41

    .line 94
    .line 95
    const v7, 0x424ef5ba

    .line 96
    .line 97
    .line 98
    invoke-static {v0}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    sub-int/2addr v7, v8

    .line 103
    const/16 v8, 0x30

    .line 104
    .line 105
    invoke-static {v4, v8, v0}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    rsub-int/lit8 v4, v4, -0x3c

    .line 110
    .line 111
    int-to-byte v4, v4

    .line 112
    invoke-static {v5, v6, v4, v3, v7}, LVa/O9;->a(IIBSI)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-static {v2, v3, v1, v0}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 121
    .line 122
    .line 123
    :goto_0
    iget-object v1, p0, LVa/G9;->a:Ljava/lang/Object;

    .line 124
    .line 125
    if-eqz v1, :cond_0

    .line 126
    .line 127
    check-cast v1, Landroid/media/MediaPlayer$OnCompletionListener;

    .line 128
    .line 129
    invoke-interface {v1, p1}, Landroid/media/MediaPlayer$OnCompletionListener;->onCompletion(Landroid/media/MediaPlayer;)V

    .line 130
    .line 131
    .line 132
    :cond_0
    sget p1, LVa/O9;->d:I

    .line 133
    .line 134
    add-int/lit8 p1, p1, 0x55

    .line 135
    .line 136
    rem-int/lit16 v1, p1, 0x80

    .line 137
    .line 138
    sput v1, LVa/O9;->e:I

    .line 139
    .line 140
    rem-int/lit8 p1, p1, 0x2

    .line 141
    .line 142
    if-nez p1, :cond_1

    .line 143
    .line 144
    const/16 p1, 0xc

    .line 145
    .line 146
    div-int/2addr p1, v0

    .line 147
    :cond_1
    return-void
.end method
