.class public abstract LVa/Cb;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/os/Handler;

.field public static final b:Landroid/os/Handler;

.field public static final c:Ljava/util/concurrent/ScheduledExecutorService;

.field public static d:I = 0x0

.field public static e:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LVa/Cb;->a:Landroid/os/Handler;

    .line 11
    .line 12
    sget v0, LVa/Cb;->e:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x67

    .line 15
    .line 16
    rem-int/lit16 v1, v0, 0x80

    .line 17
    .line 18
    sput v1, LVa/Cb;->d:I

    .line 19
    .line 20
    rem-int/lit8 v0, v0, 0x2

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v0, v1

    .line 28
    :goto_0
    xor-int/2addr v0, v1

    .line 29
    :goto_1
    const/4 v2, 0x3

    .line 30
    const/4 v3, 0x0

    .line 31
    if-ge v0, v2, :cond_2

    .line 32
    .line 33
    :try_start_0
    new-instance v2, Landroid/os/HandlerThread;

    .line 34
    .line 35
    const-string v4, "\ue948\uf4d0\u4b4f\ud187\u1748\u2771\uf7f1\ub90f\ub23f\u7d81"

    .line 36
    .line 37
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    const/4 v6, 0x0

    .line 42
    cmpl-float v5, v5, v6

    .line 43
    .line 44
    rsub-int/lit8 v5, v5, 0xa

    .line 45
    .line 46
    invoke-static {v5, v4}, LVa/Cb;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-direct {v2, v4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 58
    .line 59
    .line 60
    new-instance v4, Landroid/os/Handler;

    .line 61
    .line 62
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-direct {v4, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :catchall_0
    move-object v2, v3

    .line 71
    :catchall_1
    const-string v4, "\u9607\u9ec0\uee7f\u8a38\u61a4\u2d74\uc02c\u9be7\u87fa\u872a\ud251\u9071"

    .line 72
    .line 73
    const-string v5, ""

    .line 74
    .line 75
    if-eqz v2, :cond_1

    .line 76
    .line 77
    :try_start_2
    invoke-virtual {v2}, Landroid/os/HandlerThread;->quitSafely()Z

    .line 78
    .line 79
    .line 80
    :cond_1
    const/16 v2, 0x30

    .line 81
    .line 82
    invoke-static {v5, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    rsub-int/lit8 v6, v6, 0xb

    .line 87
    .line 88
    invoke-static {v6, v4}, LVa/Cb;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    const-string v7, "\uf1a5\uaa61\u8502V\u17b4\ua2e5\u1489\ufab4\u823d\ud87f\uee0c\ubbfc\u413d\u9c92\u2340\u81f2\u70be\u6a95\u7cf7\ub1c6\u568f\u2636\u5fce\u4203\uaba0\ucadd\u305b\u36fa\u5135\uf7c6\u09c4\u639e\u7f70\u8c37\u081d\u0ccb\uc6e7\u4192\ucc39\u81e9\u235e\ufa81\u4dce\u361f\u0fbc\u771a\udd2a\u39de"

    .line 97
    .line 98
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    shr-int/lit8 v8, v8, 0x8

    .line 103
    .line 104
    add-int/2addr v8, v2

    .line 105
    invoke-static {v8, v7}, LVa/Cb;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-static {v6, v2, v1}, LVa/Ab;->C(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 114
    .line 115
    .line 116
    add-int/lit8 v0, v0, 0x1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :catchall_2
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    shr-int/lit8 v0, v0, 0x10

    .line 124
    .line 125
    add-int/lit8 v0, v0, 0xc

    .line 126
    .line 127
    invoke-static {v0, v4}, LVa/Cb;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v5, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    rsub-int/lit8 v2, v2, 0x23

    .line 140
    .line 141
    const-string v4, "\uf1a5\uaa61\u8502V\u17b4\ua2e5\u1489\ufab4\u823d\ud87f\uee0c\ubbfc\u413d\u9c92\u2340\u81f2\u70be\u6a95\u7cf7\ub1c6\u568f\u2636\u5fce\u4203\uaba0\ucadd\u305b\u36fa\u5135\uf7c6\u09c4\u639e\u7f70\u8c37\ua110\ube47"

    .line 142
    .line 143
    invoke-static {v2, v4}, LVa/Cb;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-static {v0, v2, v1}, LVa/Ab;->C(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_2
    sget v0, LVa/Cb;->e:I

    .line 156
    .line 157
    add-int/lit8 v0, v0, 0x79

    .line 158
    .line 159
    rem-int/lit16 v0, v0, 0x80

    .line 160
    .line 161
    sput v0, LVa/Cb;->d:I

    .line 162
    .line 163
    :goto_2
    move-object v4, v3

    .line 164
    :goto_3
    sput-object v4, LVa/Cb;->b:Landroid/os/Handler;

    .line 165
    .line 166
    if-nez v4, :cond_3

    .line 167
    .line 168
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    sget v0, LVa/Cb;->d:I

    .line 173
    .line 174
    add-int/lit8 v0, v0, 0x1d

    .line 175
    .line 176
    rem-int/lit16 v0, v0, 0x80

    .line 177
    .line 178
    sput v0, LVa/Cb;->e:I

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_3
    sget v0, LVa/Cb;->e:I

    .line 182
    .line 183
    add-int/lit8 v0, v0, 0x11

    .line 184
    .line 185
    rem-int/lit16 v0, v0, 0x80

    .line 186
    .line 187
    sput v0, LVa/Cb;->d:I

    .line 188
    .line 189
    :goto_4
    sput-object v3, LVa/Cb;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 190
    .line 191
    return-void
.end method

.method public static a(LVa/Ba;J)V
    .locals 2

    .line 1
    sget v0, LVa/Cb;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x27

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Cb;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :try_start_0
    invoke-static {}, LVa/Cb;->i()Landroid/os/Handler;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    sget p0, LVa/Cb;->d:I

    .line 22
    .line 23
    add-int/lit8 p0, p0, 0x21

    .line 24
    .line 25
    rem-int/lit16 p1, p0, 0x80

    .line 26
    .line 27
    sput p1, LVa/Cb;->e:I

    .line 28
    .line 29
    rem-int/lit8 p0, p0, 0x2

    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    throw v1

    .line 35
    :cond_1
    :try_start_1
    invoke-static {}, LVa/Cb;->i()Landroid/os/Handler;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, p0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 40
    .line 41
    .line 42
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    :catchall_0
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 44
    .line 45
    .line 46
    move-result-wide p0

    .line 47
    const-wide/16 v0, -0x1

    .line 48
    .line 49
    cmp-long p0, p0, v0

    .line 50
    .line 51
    rsub-int/lit8 p0, p0, 0xd

    .line 52
    .line 53
    const-string p1, "\u9607\u9ec0\uee7f\u8a38\u61a4\u2d74\uc02c\u9be7\u87fa\u872a\ud251\u9071"

    .line 54
    .line 55
    invoke-static {p0, p1}, LVa/Cb;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const/4 p1, 0x0

    .line 64
    invoke-static {p1}, Landroid/os/Process;->getThreadPriority(I)I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    add-int/lit8 p2, p2, 0x14

    .line 69
    .line 70
    shr-int/lit8 p2, p2, 0x6

    .line 71
    .line 72
    add-int/lit8 p2, p2, 0x25

    .line 73
    .line 74
    const-string v0, "\uf1a5\uaa61\u8502V\u17b4\ua2e5\u1489\ufab4\u823d\ud87f\u2568\u98e3\u6c61\ude20\u473a\u6fb6\u3ec3\u2468\u713d\ub865\u17b4\ua2e5\u905f\u609d\ubc3b\u1da9\u6b01\u4f01\u4dce\u361f\u1489\ufab4\ua9e6\uf816\u413d\u9c92\u242b\u7dfb"

    .line 75
    .line 76
    invoke-static {p2, v0}, LVa/Cb;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-static {p0, p2, p1}, LVa/Ab;->C(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public static b(ILjava/lang/String;)Ljava/lang/String;
    .locals 12

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
    sget-object v0, LVa/Ab;->F:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    array-length v1, p1

    .line 11
    new-array v1, v1, [C

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    sput v2, LVa/Ab;->E:I

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    new-array v3, v3, [C

    .line 18
    .line 19
    :goto_0
    sget v4, LVa/Ab;->E:I

    .line 20
    .line 21
    array-length v5, p1

    .line 22
    if-ge v4, v5, :cond_1

    .line 23
    .line 24
    aget-char v5, p1, v4

    .line 25
    .line 26
    aput-char v5, v3, v2

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    aget-char v4, p1, v4

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    aput-char v4, v3, v5

    .line 34
    .line 35
    const v4, 0xe370

    .line 36
    .line 37
    .line 38
    move v6, v2

    .line 39
    :goto_1
    const/16 v7, 0x10

    .line 40
    .line 41
    if-ge v6, v7, :cond_0

    .line 42
    .line 43
    aget-char v7, v3, v5

    .line 44
    .line 45
    aget-char v8, v3, v2

    .line 46
    .line 47
    add-int v9, v8, v4

    .line 48
    .line 49
    shl-int/lit8 v10, v8, 0x4

    .line 50
    .line 51
    const v11, 0xdae4

    .line 52
    .line 53
    .line 54
    add-int/2addr v10, v11

    .line 55
    xor-int/2addr v9, v10

    .line 56
    ushr-int/lit8 v10, v8, 0x5

    .line 57
    .line 58
    add-int/lit16 v10, v10, 0x71ef

    .line 59
    .line 60
    xor-int/2addr v9, v10

    .line 61
    sub-int/2addr v7, v9

    .line 62
    int-to-char v7, v7

    .line 63
    aput-char v7, v3, v5

    .line 64
    .line 65
    add-int v9, v7, v4

    .line 66
    .line 67
    shl-int/lit8 v10, v7, 0x4

    .line 68
    .line 69
    add-int/lit16 v10, v10, 0x5a15

    .line 70
    .line 71
    xor-int/2addr v9, v10

    .line 72
    ushr-int/lit8 v7, v7, 0x5

    .line 73
    .line 74
    add-int/lit16 v7, v7, 0xf5e

    .line 75
    .line 76
    xor-int/2addr v7, v9

    .line 77
    sub-int/2addr v8, v7

    .line 78
    int-to-char v7, v8

    .line 79
    aput-char v7, v3, v2

    .line 80
    .line 81
    const v7, 0x9e37

    .line 82
    .line 83
    .line 84
    sub-int/2addr v4, v7

    .line 85
    add-int/lit8 v6, v6, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception p0

    .line 89
    goto :goto_2

    .line 90
    :cond_0
    sget v4, LVa/Ab;->E:I

    .line 91
    .line 92
    aget-char v6, v3, v2

    .line 93
    .line 94
    aput-char v6, v1, v4

    .line 95
    .line 96
    add-int/lit8 v6, v4, 0x1

    .line 97
    .line 98
    aget-char v5, v3, v5

    .line 99
    .line 100
    aput-char v5, v1, v6

    .line 101
    .line 102
    add-int/lit8 v4, v4, 0x2

    .line 103
    .line 104
    sput v4, LVa/Ab;->E:I

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    new-instance p1, Ljava/lang/String;

    .line 108
    .line 109
    invoke-direct {p1, v1, v2, p0}, Ljava/lang/String;-><init>([CII)V

    .line 110
    .line 111
    .line 112
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    return-object p1

    .line 114
    :goto_2
    monitor-exit v0

    .line 115
    throw p0
.end method

.method public static c(LVa/Ba;)V
    .locals 3

    .line 1
    sget v0, LVa/Cb;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x27

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Cb;->e:I

    .line 8
    .line 9
    :try_start_0
    invoke-static {}, LVa/Cb;->i()Landroid/os/Handler;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    sget p0, LVa/Cb;->e:I

    .line 17
    .line 18
    add-int/lit8 p0, p0, 0x7b

    .line 19
    .line 20
    rem-int/lit16 p0, p0, 0x80

    .line 21
    .line 22
    sput p0, LVa/Cb;->d:I

    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    const/4 p0, 0x0

    .line 26
    invoke-static {p0, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int/lit8 v0, v0, 0xc

    .line 31
    .line 32
    const-string v1, "\u9607\u9ec0\uee7f\u8a38\u61a4\u2d74\uc02c\u9be7\u87fa\u872a\ud251\u9071"

    .line 33
    .line 34
    invoke-static {v0, v1}, LVa/Cb;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, ""

    .line 43
    .line 44
    const/16 v2, 0x30

    .line 45
    .line 46
    invoke-static {v1, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    rsub-int/lit8 v1, v1, 0x1c

    .line 51
    .line 52
    const-string v2, "\uf1a5\uaa61\u8502V\u17b4\ua2e5\u1489\ufab4\u823d\ud87f\u2568\u98e3\u6c61\ude20\u905f\u609d\ubc3b\u1da9\u6b01\u4f01\u4dce\u361f\u1489\ufab4\ua9e6\uf816\u413d\u9c92\u242b\u7dfb"

    .line 53
    .line 54
    invoke-static {v1, v2}, LVa/Cb;->b(ILjava/lang/String;)Ljava/lang/String;

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
    invoke-static {v0, v1, p0}, LVa/Ab;->C(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public static d()Landroid/os/Handler;
    .locals 3

    .line 1
    sget v0, LVa/Cb;->d:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x3d

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/Cb;->e:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x55

    .line 15
    .line 16
    rem-int/lit16 v1, v0, 0x80

    .line 17
    .line 18
    sput v1, LVa/Cb;->e:I

    .line 19
    .line 20
    rem-int/lit8 v0, v0, 0x2

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    sget-object v0, LVa/Cb;->b:Landroid/os/Handler;

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    throw v2

    .line 28
    :cond_1
    throw v2
.end method

.method public static e(LVa/Ba;)V
    .locals 7

    .line 1
    sget v0, LVa/Cb;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x21

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Cb;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, "\u9607\u9ec0\uee7f\u8a38\u61a4\u2d74\uc02c\u9be7\u87fa\u872a\ud251\u9071"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-static {}, LVa/Cb;->d()Landroid/os/Handler;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/16 v3, 0x4f

    .line 21
    .line 22
    div-int/2addr v3, v2

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {}, LVa/Cb;->d()Landroid/os/Handler;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    :goto_0
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    sget-object v0, LVa/Cb;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    sget p0, LVa/Cb;->d:I

    .line 44
    .line 45
    add-int/lit8 p0, p0, 0x71

    .line 46
    .line 47
    rem-int/lit16 v0, p0, 0x80

    .line 48
    .line 49
    sput v0, LVa/Cb;->e:I

    .line 50
    .line 51
    rem-int/lit8 p0, p0, 0x2

    .line 52
    .line 53
    if-eqz p0, :cond_2

    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    const/4 p0, 0x0

    .line 57
    throw p0

    .line 58
    :cond_3
    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 59
    .line 60
    .line 61
    move-result-wide v3

    .line 62
    const-wide/16 v5, -0x1

    .line 63
    .line 64
    cmp-long p0, v3, v5

    .line 65
    .line 66
    add-int/lit8 p0, p0, 0xb

    .line 67
    .line 68
    invoke-static {p0, v1}, LVa/Cb;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    const-string v0, "\u7a10\u17f4\u70be\u6a95\u7cf7\ub1c6\u568f\u2636\u5fce\u4203\uaba0\ucadd\u305b\u36fa\u5135\uf7c6\u09c4\u639e\u7f70\u8c37\u5c68\u2013\uf95e\u2564\u7725\ub4e0\u61a4\u2d74\ubde5\u551a\u7cf7\ub1c6\u1668\uf716\u543c\u7e14\uedf7\u1459\u69b7\u2118\uf95e\u2564\ub518\u4156\ufe0e\u8431\u8502V\u5a65\u9d08\u7f70\u8c37"

    .line 77
    .line 78
    const-string v3, ""

    .line 79
    .line 80
    invoke-static {v3}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    add-int/lit8 v3, v3, 0x34

    .line 85
    .line 86
    invoke-static {v3, v0}, LVa/Cb;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {p0, v0, v2}, LVa/Ab;->C(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :catchall_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    const/4 v0, 0x0

    .line 103
    cmpl-float p0, p0, v0

    .line 104
    .line 105
    rsub-int/lit8 p0, p0, 0xd

    .line 106
    .line 107
    invoke-static {p0, v1}, LVa/Cb;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    shr-int/lit8 v0, v0, 0x10

    .line 120
    .line 121
    add-int/lit8 v0, v0, 0x24

    .line 122
    .line 123
    const-string v1, "\uf1a5\uaa61\u8502V\u17b4\ua2e5\u1489\ufab4\u823d\ud87f\u2568\u98e3\u6c61\ude20\u905f\u609d\ubc3b\u1da9\u46bd\ufd2e\ud40b\u06b4\uade2\ubcb3\u0dcb\u855e\u09c4\u639e\u366d\u0f96\ue70e\udfc7\u17c4\ud2e9\u7391\u4029"

    .line 124
    .line 125
    invoke-static {v0, v1}, LVa/Cb;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {p0, v0, v2}, LVa/Ab;->C(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method public static f(LVa/Ba;J)V
    .locals 6

    .line 1
    sget v0, LVa/Cb;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x31

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Cb;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, "\u9607\u9ec0\uee7f\u8a38\u61a4\u2d74\uc02c\u9be7\u87fa\u872a\ud251\u9071"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    :try_start_0
    invoke-static {}, LVa/Cb;->d()Landroid/os/Handler;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, p0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    sget-object v0, LVa/Cb;->c:Ljava/util/concurrent/ScheduledExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget v4, LVa/Cb;->d:I

    .line 32
    .line 33
    add-int/lit8 v4, v4, 0x3d

    .line 34
    .line 35
    rem-int/lit16 v5, v4, 0x80

    .line 36
    .line 37
    sput v5, LVa/Cb;->e:I

    .line 38
    .line 39
    rem-int/lit8 v4, v4, 0x2

    .line 40
    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    :try_start_1
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 44
    .line 45
    invoke-interface {v0, p0, p1, p2, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 50
    .line 51
    invoke-interface {v0, p0, p1, p2, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 52
    .line 53
    .line 54
    throw v3

    .line 55
    :cond_2
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    add-int/lit8 p0, p0, 0xc

    .line 60
    .line 61
    invoke-static {p0, v1}, LVa/Cb;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-string p1, "\u7a10\u17f4\u70be\u6a95\u7cf7\ub1c6\u568f\u2636\u5fce\u4203\uaba0\ucadd\u305b\u36fa\u5135\uf7c6\u09c4\u639e\u7f70\u8c37\u5c68\u2013\uf95e\u2564\u7725\ub4e0\u61a4\u2d74\ubde5\u551a\u7cf7\ub1c6\u1668\uf716\u543c\u7e14\uedf7\u1459\u69b7\u2118\uf95e\u2564\ub518\u4156\ufe0e\u8431\u8502V\u5a65\u9d08\u7f70\u8c37"

    .line 70
    .line 71
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    shr-int/lit8 p2, p2, 0x10

    .line 76
    .line 77
    rsub-int/lit8 p2, p2, 0x34

    .line 78
    .line 79
    invoke-static {p2, p1}, LVa/Cb;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p0, p1, v2}, LVa/Ab;->C(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    .line 89
    .line 90
    sget p0, LVa/Cb;->d:I

    .line 91
    .line 92
    add-int/lit8 p0, p0, 0x3d

    .line 93
    .line 94
    rem-int/lit16 p1, p0, 0x80

    .line 95
    .line 96
    sput p1, LVa/Cb;->e:I

    .line 97
    .line 98
    rem-int/lit8 p0, p0, 0x2

    .line 99
    .line 100
    if-eqz p0, :cond_3

    .line 101
    .line 102
    return-void

    .line 103
    :cond_3
    throw v3

    .line 104
    :cond_4
    :try_start_2
    invoke-static {}, LVa/Cb;->d()Landroid/os/Handler;

    .line 105
    .line 106
    .line 107
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 108
    :catchall_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 109
    .line 110
    .line 111
    move-result-wide p0

    .line 112
    const-wide/16 v3, 0x0

    .line 113
    .line 114
    cmp-long p0, p0, v3

    .line 115
    .line 116
    rsub-int/lit8 p0, p0, 0xd

    .line 117
    .line 118
    invoke-static {p0, v1}, LVa/Cb;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    shr-int/lit8 p1, p1, 0x16

    .line 131
    .line 132
    rsub-int/lit8 p1, p1, 0x2c

    .line 133
    .line 134
    const-string p2, "\uf1a5\uaa61\u8502V\u17b4\ua2e5\u1489\ufab4\u823d\ud87f\u2568\u98e3\u6c61\ude20\u473a\u6fb6\u3ec3\u2468\u713d\ub865\u17b4\ua2e5\u905f\u609d\ubc3b\u1da9\u46bd\ufd2e\ud40b\u06b4\uade2\ubcb3\u0dcb\u855e\u09c4\u639e\u366d\u0f96\ue70e\udfc7\u17c4\ud2e9\u7391\u4029"

    .line 135
    .line 136
    invoke-static {p1, p2}, LVa/Cb;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-static {p0, p1, v2}, LVa/Ab;->C(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 145
    .line 146
    .line 147
    return-void
.end method

.method public static g(LVa/Ba;)V
    .locals 2

    .line 1
    sget v0, LVa/Cb;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Cb;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    invoke-static {}, LVa/Cb;->h()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, LVa/Ba;->run()V

    .line 21
    .line 22
    .line 23
    sget p0, LVa/Cb;->d:I

    .line 24
    .line 25
    add-int/lit8 p0, p0, 0xb

    .line 26
    .line 27
    rem-int/lit16 v0, p0, 0x80

    .line 28
    .line 29
    sput v0, LVa/Cb;->e:I

    .line 30
    .line 31
    rem-int/lit8 p0, p0, 0x2

    .line 32
    .line 33
    if-nez p0, :cond_0

    .line 34
    .line 35
    const/16 p0, 0x2b

    .line 36
    .line 37
    div-int/lit8 p0, p0, 0x0

    .line 38
    .line 39
    :cond_0
    return-void

    .line 40
    :cond_1
    invoke-static {p0}, LVa/Cb;->c(LVa/Ba;)V

    .line 41
    .line 42
    .line 43
    sget p0, LVa/Cb;->d:I

    .line 44
    .line 45
    add-int/lit8 p0, p0, 0x3f

    .line 46
    .line 47
    rem-int/lit16 v0, p0, 0x80

    .line 48
    .line 49
    sput v0, LVa/Cb;->e:I

    .line 50
    .line 51
    rem-int/lit8 p0, p0, 0x2

    .line 52
    .line 53
    if-eqz p0, :cond_2

    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    throw v1

    .line 57
    :cond_3
    invoke-static {}, LVa/Cb;->h()Z

    .line 58
    .line 59
    .line 60
    throw v1
.end method

.method public static h()Z
    .locals 3

    .line 1
    sget v0, LVa/Cb;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x61

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Cb;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x0

    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    sget v0, LVa/Cb;->d:I

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x31

    .line 27
    .line 28
    rem-int/lit16 v1, v0, 0x80

    .line 29
    .line 30
    sput v1, LVa/Cb;->e:I

    .line 31
    .line 32
    rem-int/lit8 v0, v0, 0x2

    .line 33
    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    return v2

    .line 37
    :cond_0
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    :cond_1
    sget v0, LVa/Cb;->e:I

    .line 40
    .line 41
    add-int/lit8 v0, v0, 0x4f

    .line 42
    .line 43
    rem-int/lit16 v0, v0, 0x80

    .line 44
    .line 45
    sput v0, LVa/Cb;->d:I

    .line 46
    .line 47
    return v2

    .line 48
    :cond_2
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 49
    .line 50
    .line 51
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    throw v0
.end method

.method public static i()Landroid/os/Handler;
    .locals 3

    .line 1
    sget v0, LVa/Cb;->e:I

    .line 2
    .line 3
    sget-object v1, LVa/Cb;->a:Landroid/os/Handler;

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x43

    .line 6
    .line 7
    rem-int/lit16 v2, v0, 0x80

    .line 8
    .line 9
    sput v2, LVa/Cb;->d:I

    .line 10
    .line 11
    rem-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    throw v0
.end method

.method public static j(LVa/Ba;)V
    .locals 1

    .line 1
    sget v0, LVa/Cb;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x49

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Cb;->e:I

    .line 8
    .line 9
    invoke-static {}, LVa/Cb;->h()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, LVa/Cb;->e(LVa/Ba;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p0}, LVa/Ba;->run()V

    .line 20
    .line 21
    .line 22
    sget p0, LVa/Cb;->e:I

    .line 23
    .line 24
    add-int/lit8 p0, p0, 0x35

    .line 25
    .line 26
    rem-int/lit16 p0, p0, 0x80

    .line 27
    .line 28
    sput p0, LVa/Cb;->d:I

    .line 29
    .line 30
    return-void
.end method
