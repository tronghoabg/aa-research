.class public final LVa/T0;
.super Lcom/google/android/gms/ads/AdListener;
.source "SourceFile"

# interfaces
.implements LVa/H9;


# static fields
.field public static final d:[C

.field public static e:I = 0x0

.field public static f:I = 0x1


# instance fields
.field public a:Lcom/google/android/gms/ads/AdListener;

.field public b:LVa/Ra;

.field public synthetic c:LVa/W0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x24

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/T0;->d:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x41s
        0x64s
        0x4cs
        0x69s
        0x73s
        0x74s
        0x65s
        0x6es
        0x72s
        0x2es
        0x6fs
        0x43s
        0x6cs
        0x46s
        0x61s
        0x54s
        0x57s
        0x68s
        0x45s
        0x66s
        0x70s
        0x63s
        0x4fs
        0x49s
        0x6ds
        0x53s
        0x77s
        0x47s
        0x75s
        0x6bs
        0x42s
        0x44s
        0x48s
        0x4as
        0x4bs
        0x4ds
    .end array-data
.end method

.method public static a(BILjava/lang/String;)Ljava/lang/String;
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
    sget-object v1, LVa/T0;->d:[C

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
    div-int/lit8 v7, v4, 0x6

    .line 57
    .line 58
    rem-int/lit8 v4, v4, 0x6

    .line 59
    .line 60
    div-int/lit8 v8, v6, 0x6

    .line 61
    .line 62
    rem-int/lit8 v6, v6, 0x6

    .line 63
    .line 64
    if-ne v4, v6, :cond_2

    .line 65
    .line 66
    add-int/lit8 v7, v7, 0x5

    .line 67
    .line 68
    rem-int/lit8 v7, v7, 0x6

    .line 69
    .line 70
    add-int/lit8 v8, v8, 0x5

    .line 71
    .line 72
    rem-int/lit8 v8, v8, 0x6

    .line 73
    .line 74
    mul-int/lit8 v7, v7, 0x6

    .line 75
    .line 76
    add-int/2addr v7, v4

    .line 77
    mul-int/lit8 v8, v8, 0x6

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
    add-int/lit8 v4, v4, 0x5

    .line 92
    .line 93
    rem-int/lit8 v4, v4, 0x6

    .line 94
    .line 95
    add-int/lit8 v6, v6, 0x5

    .line 96
    .line 97
    rem-int/lit8 v6, v6, 0x6

    .line 98
    .line 99
    mul-int/lit8 v7, v7, 0x6

    .line 100
    .line 101
    add-int/2addr v7, v4

    .line 102
    mul-int/lit8 v8, v8, 0x6

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
    mul-int/lit8 v7, v7, 0x6

    .line 115
    .line 116
    add-int/2addr v7, v6

    .line 117
    mul-int/lit8 v8, v8, 0x6

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


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 2

    .line 1
    sget v0, LVa/T0;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/T0;->e:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x2d

    .line 10
    .line 11
    rem-int/lit16 v1, v0, 0x80

    .line 12
    .line 13
    sput v1, LVa/T0;->f:I

    .line 14
    .line 15
    rem-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x6f

    .line 20
    .line 21
    rem-int/lit16 v0, v1, 0x80

    .line 22
    .line 23
    sput v0, LVa/T0;->e:I

    .line 24
    .line 25
    rem-int/lit8 v1, v1, 0x2

    .line 26
    .line 27
    iget-object v0, p0, LVa/T0;->a:Lcom/google/android/gms/ads/AdListener;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    const/16 v1, 0x30

    .line 32
    .line 33
    div-int/lit8 v1, v1, 0x0

    .line 34
    .line 35
    :cond_0
    return-object v0

    .line 36
    :cond_1
    const/4 v0, 0x0

    .line 37
    throw v0
.end method

.method public final onAdClosed()V
    .locals 4

    .line 1
    sget v0, LVa/T0;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x61

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/T0;->e:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0}, Landroid/os/Process;->getThreadPriority(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit8 v1, v1, 0x14

    .line 15
    .line 16
    shr-int/lit8 v1, v1, 0x6

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x15

    .line 19
    .line 20
    invoke-static {v0}, Landroid/os/Process;->getThreadPriority(I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/lit8 v2, v2, 0x14

    .line 25
    .line 26
    shr-int/lit8 v2, v2, 0x6

    .line 27
    .line 28
    rsub-int/lit8 v2, v2, 0x72

    .line 29
    .line 30
    int-to-byte v2, v2

    .line 31
    const-string v3, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0008\u0007\t\n\u000b\u0006\u0001\u0005\u0007\u0010\u0006\u0000\n\u00d6"

    .line 32
    .line 33
    invoke-static {v2, v1, v3}, LVa/T0;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-array v0, v0, [Ljava/lang/Object;

    .line 42
    .line 43
    iget-object v2, p0, LVa/T0;->c:LVa/W0;

    .line 44
    .line 45
    iget-object v3, p0, LVa/T0;->b:LVa/Ra;

    .line 46
    .line 47
    invoke-virtual {v2, p0, v3, v1, v0}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, LVa/T0;->a:Lcom/google/android/gms/ads/AdListener;

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    sget v1, LVa/T0;->e:I

    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x29

    .line 57
    .line 58
    rem-int/lit16 v1, v1, 0x80

    .line 59
    .line 60
    sput v1, LVa/T0;->f:I

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdListener;->onAdClosed()V

    .line 63
    .line 64
    .line 65
    sget v0, LVa/T0;->f:I

    .line 66
    .line 67
    add-int/lit8 v0, v0, 0x5d

    .line 68
    .line 69
    rem-int/lit16 v0, v0, 0x80

    .line 70
    .line 71
    sput v0, LVa/T0;->e:I

    .line 72
    .line 73
    :cond_0
    return-void
.end method

.method public final onAdFailedToLoad(Lx6/l;)V
    .locals 4

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
    add-int/lit8 v0, v0, 0x26

    .line 8
    .line 9
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    shr-int/lit8 v1, v1, 0x8

    .line 14
    .line 15
    rsub-int/lit8 v1, v1, 0x54

    .line 16
    .line 17
    int-to-byte v1, v1

    .line 18
    const-string v2, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0008\u0007\t\n\u000b\u0006\u0001\u0007\u0013\u000f\u0002\u0012\u000c\u0003\r\u0008\u0004\u0008\u0010\u0004\r\u0004\u0000\u000c\u0005\u0000\u0013\u00c6\u00c6\u000b\t"

    .line 19
    .line 20
    invoke-static {v1, v0, v2}, LVa/T0;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x1

    .line 29
    new-array v1, v1, [Ljava/lang/Object;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    aput-object p1, v1, v2

    .line 33
    .line 34
    iget-object v2, p0, LVa/T0;->c:LVa/W0;

    .line 35
    .line 36
    iget-object v3, p0, LVa/T0;->b:LVa/Ra;

    .line 37
    .line 38
    invoke-virtual {v2, p0, v3, v0, v1}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, LVa/T0;->a:Lcom/google/android/gms/ads/AdListener;

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    sget v1, LVa/T0;->e:I

    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x3d

    .line 48
    .line 49
    rem-int/lit16 v1, v1, 0x80

    .line 50
    .line 51
    sput v1, LVa/T0;->f:I

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/AdListener;->onAdFailedToLoad(Lx6/l;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    sget p1, LVa/T0;->e:I

    .line 57
    .line 58
    add-int/lit8 p1, p1, 0x5d

    .line 59
    .line 60
    rem-int/lit16 p1, p1, 0x80

    .line 61
    .line 62
    sput p1, LVa/T0;->f:I

    .line 63
    .line 64
    return-void
.end method

.method public final onAdImpression()V
    .locals 7

    .line 1
    sget v0, LVa/T0;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x33

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/T0;->f:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0008\u0007\t\n\u000b\u0006\u0001\u0005\u0013\u001a\u0012\t\u0007yy\u0004\tt"

    .line 12
    .line 13
    iget-object v2, p0, LVa/T0;->b:LVa/Ra;

    .line 14
    .line 15
    iget-object v3, p0, LVa/T0;->c:LVa/W0;

    .line 16
    .line 17
    iget-object v4, p0, LVa/T0;->a:Lcom/google/android/gms/ads/AdListener;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-static {v5, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/16 v6, 0x77

    .line 28
    .line 29
    rem-int/2addr v6, v0

    .line 30
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    rem-int/lit8 v0, v0, 0xc

    .line 35
    .line 36
    mul-int/lit8 v0, v0, 0x7d

    .line 37
    .line 38
    int-to-byte v0, v0

    .line 39
    invoke-static {v0, v6, v1}, LVa/T0;->a(BILjava/lang/String;)Ljava/lang/String;

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
    new-array v1, v5, [Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {v3, p0, v2, v0, v1}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-static {v5, v5}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    rsub-int/lit8 v0, v0, 0x19

    .line 60
    .line 61
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    shr-int/lit8 v6, v6, 0x10

    .line 66
    .line 67
    add-int/lit8 v6, v6, 0x6

    .line 68
    .line 69
    int-to-byte v6, v6

    .line 70
    invoke-static {v6, v0, v1}, LVa/T0;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    new-array v1, v5, [Ljava/lang/Object;

    .line 79
    .line 80
    invoke-virtual {v3, p0, v2, v0, v1}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    if-eqz v4, :cond_1

    .line 84
    .line 85
    :goto_0
    invoke-virtual {v4}, Lcom/google/android/gms/ads/AdListener;->onAdImpression()V

    .line 86
    .line 87
    .line 88
    :cond_1
    sget v0, LVa/T0;->e:I

    .line 89
    .line 90
    add-int/lit8 v0, v0, 0x51

    .line 91
    .line 92
    rem-int/lit16 v0, v0, 0x80

    .line 93
    .line 94
    sput v0, LVa/T0;->f:I

    .line 95
    .line 96
    return-void
.end method

.method public final onAdLoaded()V
    .locals 4

    .line 1
    sget v0, LVa/T0;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x11

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/T0;->f:I

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    rsub-int/lit8 v0, v0, 0x16

    .line 18
    .line 19
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    shr-int/lit8 v1, v1, 0x16

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x4d

    .line 26
    .line 27
    int-to-byte v1, v1

    .line 28
    const-string v2, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0008\u0007\t\n\u000b\u0006\u0001\u0002\u0003\u0008\u0010\u0000\u0007\u00b1"

    .line 29
    .line 30
    invoke-static {v1, v0, v2}, LVa/T0;->a(BILjava/lang/String;)Ljava/lang/String;

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
    const/4 v1, 0x0

    .line 39
    new-array v1, v1, [Ljava/lang/Object;

    .line 40
    .line 41
    iget-object v2, p0, LVa/T0;->c:LVa/W0;

    .line 42
    .line 43
    iget-object v3, p0, LVa/T0;->b:LVa/Ra;

    .line 44
    .line 45
    invoke-virtual {v2, p0, v3, v0, v1}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, LVa/T0;->a:Lcom/google/android/gms/ads/AdListener;

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    sget v1, LVa/T0;->e:I

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x19

    .line 55
    .line 56
    rem-int/lit16 v2, v1, 0x80

    .line 57
    .line 58
    sput v2, LVa/T0;->f:I

    .line 59
    .line 60
    rem-int/lit8 v1, v1, 0x2

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdListener;->onAdLoaded()V

    .line 63
    .line 64
    .line 65
    if-eqz v1, :cond_0

    .line 66
    .line 67
    return-void

    .line 68
    :cond_0
    const/4 v0, 0x0

    .line 69
    throw v0

    .line 70
    :cond_1
    return-void
.end method

.method public final onAdOpened()V
    .locals 5

    .line 1
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x14

    .line 10
    .line 11
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    const-wide/16 v3, -0x1

    .line 16
    .line 17
    cmp-long v1, v1, v3

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x47

    .line 20
    .line 21
    int-to-byte v1, v1

    .line 22
    const-string v2, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0008\u0007\t\n\u000b\u0006\u0001\u0004\u0013\u0012\u0008\u0008\u0007\u00ac"

    .line 23
    .line 24
    invoke-static {v1, v0, v2}, LVa/T0;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x0

    .line 33
    new-array v1, v1, [Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v2, p0, LVa/T0;->c:LVa/W0;

    .line 36
    .line 37
    iget-object v3, p0, LVa/T0;->b:LVa/Ra;

    .line 38
    .line 39
    invoke-virtual {v2, p0, v3, v0, v1}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, LVa/T0;->a:Lcom/google/android/gms/ads/AdListener;

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    sget v1, LVa/T0;->e:I

    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x5

    .line 49
    .line 50
    rem-int/lit16 v1, v1, 0x80

    .line 51
    .line 52
    sput v1, LVa/T0;->f:I

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdListener;->onAdOpened()V

    .line 55
    .line 56
    .line 57
    sget v0, LVa/T0;->e:I

    .line 58
    .line 59
    add-int/lit8 v0, v0, 0x53

    .line 60
    .line 61
    rem-int/lit16 v0, v0, 0x80

    .line 62
    .line 63
    sput v0, LVa/T0;->f:I

    .line 64
    .line 65
    :cond_0
    return-void
.end method

.method public final onAdSwipeGestureClicked()V
    .locals 11

    .line 1
    sget v0, LVa/T0;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/T0;->f:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, ""

    .line 12
    .line 13
    const-string v2, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\u0008\u0007\t\n\u000b\u0006\u0001\u0007\u001f\u001b\u0002\u0012\u0008\u0018\t\u0005\u0000\u001a\n\u0007\u0006\u000f\u0000\u0017\u001b\u0007\u0000"

    .line 14
    .line 15
    iget-object v3, p0, LVa/T0;->b:LVa/Ra;

    .line 16
    .line 17
    iget-object v4, p0, LVa/T0;->c:LVa/W0;

    .line 18
    .line 19
    iget-object v5, p0, LVa/T0;->a:Lcom/google/android/gms/ads/AdListener;

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 25
    .line 26
    .line 27
    move-result-wide v7

    .line 28
    const-wide/16 v9, 0x1

    .line 29
    .line 30
    cmp-long v0, v7, v9

    .line 31
    .line 32
    const/16 v7, 0x7b

    .line 33
    .line 34
    rem-int/2addr v7, v0

    .line 35
    const/16 v0, 0x31

    .line 36
    .line 37
    const/4 v8, 0x1

    .line 38
    invoke-static {v1, v0, v6, v8}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    mul-int/lit8 v0, v0, 0x1e

    .line 43
    .line 44
    int-to-byte v0, v0

    .line 45
    invoke-static {v0, v7, v2}, LVa/T0;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-array v1, v6, [Ljava/lang/Object;

    .line 54
    .line 55
    invoke-virtual {v4, p0, v3, v0, v1}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    if-eqz v5, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 62
    .line 63
    .line 64
    move-result-wide v7

    .line 65
    const-wide/16 v9, 0x0

    .line 66
    .line 67
    cmp-long v0, v7, v9

    .line 68
    .line 69
    add-int/lit8 v0, v0, 0x21

    .line 70
    .line 71
    const/16 v7, 0x30

    .line 72
    .line 73
    invoke-static {v1, v7, v6, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    add-int/lit8 v1, v1, 0x7

    .line 78
    .line 79
    int-to-byte v1, v1

    .line 80
    invoke-static {v1, v0, v2}, LVa/T0;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    new-array v1, v6, [Ljava/lang/Object;

    .line 89
    .line 90
    invoke-virtual {v4, p0, v3, v0, v1}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    if-eqz v5, :cond_1

    .line 94
    .line 95
    :goto_0
    sget v0, LVa/T0;->e:I

    .line 96
    .line 97
    add-int/lit8 v0, v0, 0x35

    .line 98
    .line 99
    rem-int/lit16 v1, v0, 0x80

    .line 100
    .line 101
    sput v1, LVa/T0;->f:I

    .line 102
    .line 103
    rem-int/lit8 v0, v0, 0x2

    .line 104
    .line 105
    invoke-virtual {v5}, Lcom/google/android/gms/ads/AdListener;->onAdSwipeGestureClicked()V

    .line 106
    .line 107
    .line 108
    if-nez v0, :cond_1

    .line 109
    .line 110
    const/16 v0, 0x18

    .line 111
    .line 112
    div-int/2addr v0, v6

    .line 113
    :cond_1
    sget v0, LVa/T0;->e:I

    .line 114
    .line 115
    add-int/lit8 v0, v0, 0x6d

    .line 116
    .line 117
    rem-int/lit16 v1, v0, 0x80

    .line 118
    .line 119
    sput v1, LVa/T0;->f:I

    .line 120
    .line 121
    rem-int/lit8 v0, v0, 0x2

    .line 122
    .line 123
    if-eqz v0, :cond_2

    .line 124
    .line 125
    return-void

    .line 126
    :cond_2
    const/4 v0, 0x0

    .line 127
    throw v0
.end method
