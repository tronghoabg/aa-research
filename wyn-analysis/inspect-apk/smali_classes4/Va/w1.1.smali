.class public final LVa/w1;
.super Ljava/util/concurrent/ThreadPoolExecutor;
.source "SourceFile"

# interfaces
.implements LVa/H9;


# static fields
.field public static c:I = 0x0

.field public static d:I = 0x1


# instance fields
.field public final a:LVa/Ra;

.field public final synthetic b:LVa/x1;


# direct methods
.method public constructor <init>(LVa/x1;Ljava/util/concurrent/ThreadPoolExecutor;LVa/Ra;)V
    .locals 7

    .line 1
    iput-object p1, p0, LVa/w1;->b:LVa/x1;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/util/concurrent/ThreadPoolExecutor;->getCorePoolSize()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p2}, Ljava/util/concurrent/ThreadPoolExecutor;->getMaximumPoolSize()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    invoke-virtual {p2, v5}, Ljava/util/concurrent/ThreadPoolExecutor;->getKeepAliveTime(Ljava/util/concurrent/TimeUnit;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    invoke-virtual {p2}, Ljava/util/concurrent/ThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    move-object v0, p0

    .line 22
    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 23
    .line 24
    .line 25
    iput-object p3, v0, LVa/w1;->a:LVa/Ra;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 3

    .line 1
    sget v0, LVa/w1;->d:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x5d

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/w1;->c:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x13

    .line 15
    .line 16
    rem-int/lit16 v1, v0, 0x80

    .line 17
    .line 18
    sput v1, LVa/w1;->c:I

    .line 19
    .line 20
    rem-int/lit8 v0, v0, 0x2

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    throw v2

    .line 26
    :cond_1
    add-int/lit8 v0, v0, 0x13

    .line 27
    .line 28
    rem-int/lit16 v1, v0, 0x80

    .line 29
    .line 30
    sput v1, LVa/w1;->c:I

    .line 31
    .line 32
    rem-int/lit8 v0, v0, 0x2

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    throw v2

    .line 37
    :cond_2
    throw v2
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x1

    .line 6
    sget v4, LVa/w1;->d:I

    .line 7
    .line 8
    add-int/lit8 v4, v4, 0x61

    .line 9
    .line 10
    rem-int/lit16 v4, v4, 0x80

    .line 11
    .line 12
    sput v4, LVa/w1;->c:I

    .line 13
    .line 14
    iget-object v4, v1, LVa/w1;->b:LVa/x1;

    .line 15
    .line 16
    iget-object v5, v1, LVa/w1;->a:LVa/Ra;

    .line 17
    .line 18
    const-string v6, "\ua928\u08e1\u75a9\ua97c\u9a04\ua273\u50a2\u15fe\ue3d1\ud5c1\u1a36\ua096\u3c7f\u2f4c\ucf7c\uef3b\u768e\u7aec\u70e2\u35d9\u833d\ub5d8\u3a72\u406e\udc41\u0f31\uef86\u8f06\u16e5"

    .line 19
    .line 20
    invoke-static {v0, v0, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 21
    .line 22
    .line 23
    move-result v7

    .line 24
    rsub-int/lit8 v7, v7, 0x1

    .line 25
    .line 26
    invoke-virtual {v6}, Ljava/lang/String;->toCharArray()[C

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    sget-object v8, LVa/pb;->D:Ljava/lang/Object;

    .line 31
    .line 32
    monitor-enter v8

    .line 33
    const-wide v9, -0x445e4a5feace6d59L    # -1.8750634860435575E-21

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    :try_start_0
    invoke-static {v9, v10, v6, v7}, LVa/pb;->z(J[CI)[C

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    sput v2, LVa/pb;->C:I

    .line 43
    .line 44
    :goto_0
    sget v7, LVa/pb;->C:I

    .line 45
    .line 46
    array-length v11, v6

    .line 47
    if-ge v7, v11, :cond_0

    .line 48
    .line 49
    add-int/lit8 v11, v7, -0x4

    .line 50
    .line 51
    aget-char v12, v6, v7

    .line 52
    .line 53
    rem-int/lit8 v13, v7, 0x4

    .line 54
    .line 55
    aget-char v13, v6, v13

    .line 56
    .line 57
    xor-int/2addr v12, v13

    .line 58
    int-to-long v12, v12

    .line 59
    int-to-long v14, v11

    .line 60
    mul-long/2addr v14, v9

    .line 61
    xor-long/2addr v12, v14

    .line 62
    long-to-int v11, v12

    .line 63
    int-to-char v11, v11

    .line 64
    aput-char v11, v6, v7

    .line 65
    .line 66
    add-int/2addr v7, v3

    .line 67
    sput v7, LVa/pb;->C:I

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    goto :goto_1

    .line 72
    :cond_0
    new-instance v7, Ljava/lang/String;

    .line 73
    .line 74
    array-length v9, v6

    .line 75
    sub-int/2addr v9, v2

    .line 76
    invoke-direct {v7, v6, v2, v9}, Ljava/lang/String;-><init>([CII)V

    .line 77
    .line 78
    .line 79
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    new-array v3, v3, [Ljava/lang/Object;

    .line 85
    .line 86
    aput-object p1, v3, v0

    .line 87
    .line 88
    invoke-virtual {v4, v1, v5, v2, v3}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-super/range {p0 .. p1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 92
    .line 93
    .line 94
    sget v0, LVa/w1;->c:I

    .line 95
    .line 96
    add-int/lit8 v0, v0, 0x2b

    .line 97
    .line 98
    rem-int/lit16 v2, v0, 0x80

    .line 99
    .line 100
    sput v2, LVa/w1;->d:I

    .line 101
    .line 102
    rem-int/lit8 v0, v0, 0x2

    .line 103
    .line 104
    if-eqz v0, :cond_1

    .line 105
    .line 106
    return-void

    .line 107
    :cond_1
    const/4 v0, 0x0

    .line 108
    throw v0

    .line 109
    :goto_1
    monitor-exit v8

    .line 110
    throw v0
.end method
