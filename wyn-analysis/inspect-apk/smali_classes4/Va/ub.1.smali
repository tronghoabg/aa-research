.class public abstract LVa/ub;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lj$/util/concurrent/ConcurrentHashMap;

.field public static final b:[C

.field public static c:I = 0x0

.field public static d:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x1a

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/ub;->b:[C

    .line 9
    .line 10
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, LVa/ub;->a:Lj$/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    sget v0, LVa/ub;->d:I

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x25

    .line 20
    .line 21
    rem-int/lit16 v1, v0, 0x80

    .line 22
    .line 23
    sput v1, LVa/ub;->c:I

    .line 24
    .line 25
    rem-int/lit8 v0, v0, 0x2

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/16 v0, 0x39

    .line 30
    .line 31
    div-int/lit8 v0, v0, 0x0

    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    nop

    .line 35
    :array_0
    .array-data 2
        0x9ds
        0xb0s
        0xb1s
        0xb7s
        0xaes
        0xbfs
        0xb4s
        0xbas
        0xb9s
        0xa0s
        0xbes
        0x8es
        0xacs
        0x6bs
        0xc0s
        0xafs
        0x90s
        0xbds
        0xb2s
        0xb3s
        0xb8s
        0x99s
        0x72s
        0x79s
        0xbcs
        0xc4s
    .end array-data
.end method

.method public static a(Ljava/lang/String;Z)Ljava/lang/Class;
    .locals 6

    .line 1
    sget v0, LVa/ub;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/ub;->d:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    sget p1, LVa/ub;->c:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0xd

    .line 17
    .line 18
    rem-int/lit16 v1, p1, 0x80

    .line 19
    .line 20
    sput v1, LVa/ub;->d:I

    .line 21
    .line 22
    rem-int/lit8 p1, p1, 0x2

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    throw v0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    const-wide/16 v4, 0x0

    .line 36
    .line 37
    cmp-long p1, v2, v4

    .line 38
    .line 39
    add-int/lit8 p1, p1, 0x7e

    .line 40
    .line 41
    const-string v2, "\u008b\u0084\u0087\u0086\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0084\u0083\u0082\u0081"

    .line 42
    .line 43
    invoke-static {p1, v2}, LVa/ub;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance v2, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    const/4 v4, 0x0

    .line 61
    cmpl-float v3, v3, v4

    .line 62
    .line 63
    add-int/lit8 v3, v3, 0x7e

    .line 64
    .line 65
    const-string v4, "\u008e\u008b\u008b\u008d\u0084\u008c"

    .line 66
    .line 67
    invoke-static {v3, v4}, LVa/ub;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    shr-int/lit8 p0, p0, 0x16

    .line 86
    .line 87
    add-int/lit8 p0, p0, 0x7f

    .line 88
    .line 89
    const-string v3, "\u0090\u0089\u008f\u0088\u0083\u008e\u0086\u0088\u0089\u008e"

    .line 90
    .line 91
    invoke-static {p0, v3}, LVa/ub;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p1, p0, v1}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    :cond_1
    return-object v0
.end method

.method public static b(Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/reflect/Method;
    .locals 5

    .line 1
    sget v0, LVa/ub;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/ub;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    :try_start_0
    invoke-static {p2}, LVa/ub;->h(Ljava/util/ArrayList;)[Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    instance-of v0, p0, Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget v0, LVa/ub;->c:I

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x5f

    .line 25
    .line 26
    rem-int/lit16 v2, v0, 0x80

    .line 27
    .line 28
    sput v2, LVa/ub;->d:I

    .line 29
    .line 30
    rem-int/lit8 v0, v0, 0x2

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    :try_start_1
    move-object v0, p0

    .line 35
    check-cast v0, Ljava/lang/Class;

    .line 36
    .line 37
    invoke-virtual {v0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_0
    move-object v0, p0

    .line 43
    check-cast v0, Ljava/lang/Class;

    .line 44
    .line 45
    invoke-virtual {v0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0

    .line 46
    .line 47
    .line 48
    throw v1

    .line 49
    :catch_0
    :try_start_2
    const-class v0, Ljava/lang/Class;

    .line 50
    .line 51
    invoke-virtual {v0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :catch_1
    move-exception p2

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_2
    invoke-static {p2}, LVa/ub;->h(Ljava/util/ArrayList;)[Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    instance-of p0, p0, Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1

    .line 71
    .line 72
    throw v1

    .line 73
    :goto_0
    const-wide/16 v2, 0x0

    .line 74
    .line 75
    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    add-int/lit16 v0, v0, 0x80

    .line 80
    .line 81
    const-string v2, "\u008b\u0084\u0087\u0086\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0084\u0083\u0082\u0081"

    .line 82
    .line 83
    invoke-static {v0, v2}, LVa/ub;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    new-instance v2, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    shr-int/lit8 v3, v3, 0x18

    .line 101
    .line 102
    rsub-int/lit8 v3, v3, 0x7f

    .line 103
    .line 104
    const-string v4, "\u0097\u008e\u0088\u0096"

    .line 105
    .line 106
    invoke-static {v3, v4}, LVa/ub;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const/4 p1, 0x0

    .line 121
    invoke-static {p1, p1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    rsub-int/lit8 p1, p1, 0x7f

    .line 126
    .line 127
    const-string v3, "\u008e\u0092\u0088\u0083\u008e\u0090\u0089\u008f\u0088\u0083\u008e\u0090\u0088\u0094\u0086\u0082\u0095\u008e\u0097"

    .line 128
    .line 129
    invoke-static {p1, v3}, LVa/ub;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-static {v0, p0, p2}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    return-object v1
.end method

.method public static c(ILjava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "ISO-8859-1"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, [B

    .line 8
    .line 9
    sget-object v0, LVa/a;->x:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v1, LVa/ub;->b:[C

    .line 13
    .line 14
    array-length v2, p1

    .line 15
    sput v2, LVa/a;->w:I

    .line 16
    .line 17
    new-array v2, v2, [C

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    sput v3, LVa/a;->v:I

    .line 21
    .line 22
    :goto_0
    sget v3, LVa/a;->v:I

    .line 23
    .line 24
    sget v4, LVa/a;->w:I

    .line 25
    .line 26
    if-ge v3, v4, :cond_0

    .line 27
    .line 28
    add-int/lit8 v4, v4, -0x1

    .line 29
    .line 30
    sub-int/2addr v4, v3

    .line 31
    aget-byte v4, p1, v4

    .line 32
    .line 33
    add-int/2addr v4, p0

    .line 34
    aget-char v4, v1, v4

    .line 35
    .line 36
    add-int/lit8 v4, v4, -0x4b

    .line 37
    .line 38
    int-to-char v4, v4

    .line 39
    aput-char v4, v2, v3

    .line 40
    .line 41
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    sput v3, LVa/a;->v:I

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    .line 51
    .line 52
    .line 53
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    return-object p0

    .line 55
    :goto_1
    monitor-exit v0

    .line 56
    throw p0
.end method

.method public static d(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)Ljava/lang/reflect/Method;
    .locals 1

    .line 1
    sget v0, LVa/ub;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/ub;->d:I

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-static {p0, p1, p2, v0}, LVa/ub;->j(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;Z)Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget p1, LVa/ub;->d:I

    .line 19
    .line 20
    add-int/lit8 p1, p1, 0x55

    .line 21
    .line 22
    rem-int/lit16 p2, p1, 0x80

    .line 23
    .line 24
    sput p2, LVa/ub;->c:I

    .line 25
    .line 26
    rem-int/lit8 p1, p1, 0x2

    .line 27
    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    throw p0
.end method

.method public static e([Ljava/lang/Class;Ljava/util/List;)Z
    .locals 13

    .line 1
    sget v0, LVa/ub;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/ub;->c:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    move v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v1

    .line 18
    :goto_0
    array-length v3, p0

    .line 19
    if-ge v0, v3, :cond_1e

    .line 20
    .line 21
    sget v3, LVa/ub;->c:I

    .line 22
    .line 23
    add-int/lit8 v3, v3, 0x59

    .line 24
    .line 25
    rem-int/lit16 v4, v3, 0x80

    .line 26
    .line 27
    sput v4, LVa/ub;->d:I

    .line 28
    .line 29
    rem-int/lit8 v3, v3, 0x2

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    if-eqz v3, :cond_1d

    .line 33
    .line 34
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    const-class v5, Ljava/lang/Object;

    .line 41
    .line 42
    aget-object v6, p0, v0

    .line 43
    .line 44
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_1b

    .line 49
    .line 50
    :cond_1
    if-eqz v3, :cond_1c

    .line 51
    .line 52
    aget-object v5, p0, v0

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    sget-object v6, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    const-class v7, Ljava/lang/Byte;

    .line 65
    .line 66
    if-eqz v6, :cond_2

    .line 67
    .line 68
    sget v6, LVa/ub;->c:I

    .line 69
    .line 70
    add-int/lit8 v6, v6, 0x6f

    .line 71
    .line 72
    rem-int/lit16 v6, v6, 0x80

    .line 73
    .line 74
    sput v6, LVa/ub;->d:I

    .line 75
    .line 76
    invoke-virtual {v3, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-nez v6, :cond_1c

    .line 81
    .line 82
    :cond_2
    sget-object v6, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 83
    .line 84
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    const-class v9, Ljava/lang/Short;

    .line 89
    .line 90
    if-eqz v8, :cond_3

    .line 91
    .line 92
    sget v8, LVa/ub;->c:I

    .line 93
    .line 94
    add-int/lit8 v8, v8, 0x33

    .line 95
    .line 96
    rem-int/lit16 v8, v8, 0x80

    .line 97
    .line 98
    sput v8, LVa/ub;->d:I

    .line 99
    .line 100
    invoke-virtual {v3, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-nez v8, :cond_1c

    .line 105
    .line 106
    :cond_3
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-eqz v6, :cond_4

    .line 111
    .line 112
    sget v6, LVa/ub;->d:I

    .line 113
    .line 114
    add-int/lit8 v6, v6, 0x73

    .line 115
    .line 116
    rem-int/lit16 v6, v6, 0x80

    .line 117
    .line 118
    sput v6, LVa/ub;->c:I

    .line 119
    .line 120
    invoke-virtual {v3, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-nez v6, :cond_1c

    .line 125
    .line 126
    :cond_4
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 127
    .line 128
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    const-class v10, Ljava/lang/Integer;

    .line 133
    .line 134
    if-eqz v8, :cond_6

    .line 135
    .line 136
    sget v8, LVa/ub;->c:I

    .line 137
    .line 138
    add-int/lit8 v8, v8, 0x7d

    .line 139
    .line 140
    rem-int/lit16 v11, v8, 0x80

    .line 141
    .line 142
    sput v11, LVa/ub;->d:I

    .line 143
    .line 144
    rem-int/lit8 v8, v8, 0x2

    .line 145
    .line 146
    if-nez v8, :cond_5

    .line 147
    .line 148
    invoke-virtual {v3, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    const/16 v11, 0x51

    .line 153
    .line 154
    div-int/2addr v11, v1

    .line 155
    if-nez v8, :cond_1c

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_5
    invoke-virtual {v3, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    if-nez v8, :cond_1c

    .line 163
    .line 164
    :cond_6
    :goto_1
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    if-eqz v8, :cond_8

    .line 169
    .line 170
    sget v8, LVa/ub;->c:I

    .line 171
    .line 172
    add-int/lit8 v8, v8, 0x3b

    .line 173
    .line 174
    rem-int/lit16 v11, v8, 0x80

    .line 175
    .line 176
    sput v11, LVa/ub;->d:I

    .line 177
    .line 178
    rem-int/lit8 v8, v8, 0x2

    .line 179
    .line 180
    if-eqz v8, :cond_7

    .line 181
    .line 182
    invoke-virtual {v3, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 183
    .line 184
    .line 185
    move-result v8

    .line 186
    if-nez v8, :cond_1c

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_7
    invoke-virtual {v3, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 190
    .line 191
    .line 192
    throw v4

    .line 193
    :cond_8
    :goto_2
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    if-eqz v6, :cond_9

    .line 198
    .line 199
    invoke-virtual {v3, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    if-nez v6, :cond_1c

    .line 204
    .line 205
    :cond_9
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 206
    .line 207
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 208
    .line 209
    .line 210
    move-result v8

    .line 211
    const-class v11, Ljava/lang/Long;

    .line 212
    .line 213
    if-eqz v8, :cond_a

    .line 214
    .line 215
    invoke-virtual {v3, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 216
    .line 217
    .line 218
    move-result v8

    .line 219
    if-nez v8, :cond_1c

    .line 220
    .line 221
    :cond_a
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 222
    .line 223
    .line 224
    move-result v8

    .line 225
    if-eqz v8, :cond_b

    .line 226
    .line 227
    invoke-virtual {v3, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 228
    .line 229
    .line 230
    move-result v8

    .line 231
    if-nez v8, :cond_1c

    .line 232
    .line 233
    :cond_b
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 234
    .line 235
    .line 236
    move-result v8

    .line 237
    if-eqz v8, :cond_c

    .line 238
    .line 239
    sget v8, LVa/ub;->d:I

    .line 240
    .line 241
    add-int/lit8 v8, v8, 0x19

    .line 242
    .line 243
    rem-int/lit16 v8, v8, 0x80

    .line 244
    .line 245
    sput v8, LVa/ub;->c:I

    .line 246
    .line 247
    invoke-virtual {v3, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 248
    .line 249
    .line 250
    move-result v8

    .line 251
    if-nez v8, :cond_1c

    .line 252
    .line 253
    :cond_c
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    if-eqz v6, :cond_d

    .line 258
    .line 259
    invoke-virtual {v3, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    if-nez v6, :cond_1c

    .line 264
    .line 265
    :cond_d
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 266
    .line 267
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 268
    .line 269
    .line 270
    move-result v8

    .line 271
    const-class v12, Ljava/lang/Float;

    .line 272
    .line 273
    if-eqz v8, :cond_e

    .line 274
    .line 275
    sget v8, LVa/ub;->c:I

    .line 276
    .line 277
    add-int/lit8 v8, v8, 0x59

    .line 278
    .line 279
    rem-int/lit16 v8, v8, 0x80

    .line 280
    .line 281
    sput v8, LVa/ub;->d:I

    .line 282
    .line 283
    invoke-virtual {v3, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 284
    .line 285
    .line 286
    move-result v8

    .line 287
    if-nez v8, :cond_1c

    .line 288
    .line 289
    :cond_e
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 290
    .line 291
    .line 292
    move-result v8

    .line 293
    if-eqz v8, :cond_f

    .line 294
    .line 295
    invoke-virtual {v3, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 296
    .line 297
    .line 298
    move-result v8

    .line 299
    if-nez v8, :cond_1c

    .line 300
    .line 301
    :cond_f
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 302
    .line 303
    .line 304
    move-result v8

    .line 305
    if-eqz v8, :cond_10

    .line 306
    .line 307
    invoke-virtual {v3, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 308
    .line 309
    .line 310
    move-result v8

    .line 311
    if-nez v8, :cond_1c

    .line 312
    .line 313
    :cond_10
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 314
    .line 315
    .line 316
    move-result v8

    .line 317
    if-eqz v8, :cond_11

    .line 318
    .line 319
    invoke-virtual {v3, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 320
    .line 321
    .line 322
    move-result v8

    .line 323
    if-nez v8, :cond_1c

    .line 324
    .line 325
    :cond_11
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    if-eqz v6, :cond_12

    .line 330
    .line 331
    invoke-virtual {v3, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 332
    .line 333
    .line 334
    move-result v6

    .line 335
    if-nez v6, :cond_1c

    .line 336
    .line 337
    :cond_12
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 338
    .line 339
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 340
    .line 341
    .line 342
    move-result v8

    .line 343
    if-eqz v8, :cond_13

    .line 344
    .line 345
    sget v8, LVa/ub;->d:I

    .line 346
    .line 347
    add-int/lit8 v8, v8, 0x31

    .line 348
    .line 349
    rem-int/lit16 v8, v8, 0x80

    .line 350
    .line 351
    sput v8, LVa/ub;->c:I

    .line 352
    .line 353
    const-class v8, Ljava/lang/Double;

    .line 354
    .line 355
    invoke-virtual {v3, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 356
    .line 357
    .line 358
    move-result v8

    .line 359
    xor-int/2addr v8, v2

    .line 360
    if-eq v8, v2, :cond_13

    .line 361
    .line 362
    goto/16 :goto_4

    .line 363
    .line 364
    :cond_13
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 365
    .line 366
    .line 367
    move-result v8

    .line 368
    if-eqz v8, :cond_14

    .line 369
    .line 370
    invoke-virtual {v3, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 371
    .line 372
    .line 373
    move-result v8

    .line 374
    if-eq v8, v2, :cond_1c

    .line 375
    .line 376
    :cond_14
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 377
    .line 378
    .line 379
    move-result v8

    .line 380
    if-eqz v8, :cond_15

    .line 381
    .line 382
    invoke-virtual {v3, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 383
    .line 384
    .line 385
    move-result v8

    .line 386
    if-nez v8, :cond_1c

    .line 387
    .line 388
    :cond_15
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 389
    .line 390
    .line 391
    move-result v8

    .line 392
    if-eqz v8, :cond_16

    .line 393
    .line 394
    invoke-virtual {v3, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 395
    .line 396
    .line 397
    move-result v8

    .line 398
    if-nez v8, :cond_1c

    .line 399
    .line 400
    :cond_16
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 401
    .line 402
    .line 403
    move-result v8

    .line 404
    if-nez v8, :cond_17

    .line 405
    .line 406
    goto :goto_3

    .line 407
    :cond_17
    invoke-virtual {v3, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 408
    .line 409
    .line 410
    move-result v8

    .line 411
    if-nez v8, :cond_1c

    .line 412
    .line 413
    :goto_3
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 414
    .line 415
    .line 416
    move-result v6

    .line 417
    if-eqz v6, :cond_18

    .line 418
    .line 419
    sget v6, LVa/ub;->c:I

    .line 420
    .line 421
    add-int/lit8 v6, v6, 0x19

    .line 422
    .line 423
    rem-int/lit16 v6, v6, 0x80

    .line 424
    .line 425
    sput v6, LVa/ub;->d:I

    .line 426
    .line 427
    invoke-virtual {v3, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 428
    .line 429
    .line 430
    move-result v6

    .line 431
    if-nez v6, :cond_1c

    .line 432
    .line 433
    :cond_18
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 434
    .line 435
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 436
    .line 437
    .line 438
    move-result v6

    .line 439
    if-eqz v6, :cond_1a

    .line 440
    .line 441
    sget v6, LVa/ub;->d:I

    .line 442
    .line 443
    add-int/lit8 v6, v6, 0x1f

    .line 444
    .line 445
    rem-int/lit16 v7, v6, 0x80

    .line 446
    .line 447
    sput v7, LVa/ub;->c:I

    .line 448
    .line 449
    rem-int/lit8 v6, v6, 0x2

    .line 450
    .line 451
    const-class v7, Ljava/lang/Boolean;

    .line 452
    .line 453
    if-nez v6, :cond_19

    .line 454
    .line 455
    invoke-virtual {v3, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 456
    .line 457
    .line 458
    move-result v4

    .line 459
    if-eqz v4, :cond_1a

    .line 460
    .line 461
    goto :goto_4

    .line 462
    :cond_19
    invoke-virtual {v3, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 463
    .line 464
    .line 465
    throw v4

    .line 466
    :cond_1a
    invoke-virtual {v5, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 467
    .line 468
    .line 469
    move-result v3

    .line 470
    if-eqz v3, :cond_1b

    .line 471
    .line 472
    goto :goto_4

    .line 473
    :cond_1b
    return v1

    .line 474
    :cond_1c
    :goto_4
    add-int/lit8 v0, v0, 0x1

    .line 475
    .line 476
    goto/16 :goto_0

    .line 477
    .line 478
    :cond_1d
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    throw v4

    .line 482
    :cond_1e
    return v2
.end method

.method public static f([Ljava/lang/reflect/Field;[Ljava/lang/reflect/Field;)[Ljava/lang/reflect/Field;
    .locals 4

    .line 1
    sget v0, LVa/ub;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x17

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/ub;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    array-length v0, p0

    .line 14
    array-length v1, p1

    .line 15
    shr-int v2, v0, v1

    .line 16
    .line 17
    new-array v2, v2, [Ljava/lang/reflect/Field;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-static {p0, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v3, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    return-object v2

    .line 27
    :cond_0
    array-length v0, p0

    .line 28
    array-length v1, p1

    .line 29
    add-int v2, v0, v1

    .line 30
    .line 31
    new-array v2, v2, [Ljava/lang/reflect/Field;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-static {p0, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v3, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    .line 39
    .line 40
    return-object v2
.end method

.method public static g(Ljava/lang/Class;Ljava/util/List;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_9

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz p1, :cond_8

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget v2, LVa/ub;->c:I

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x79

    .line 22
    .line 23
    rem-int/lit16 v2, v2, 0x80

    .line 24
    .line 25
    sput v2, LVa/ub;->d:I

    .line 26
    .line 27
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_5

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    const-string v3, ""

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_3

    .line 46
    .line 47
    sget v4, LVa/ub;->d:I

    .line 48
    .line 49
    add-int/lit8 v4, v4, 0x15

    .line 50
    .line 51
    rem-int/lit16 v4, v4, 0x80

    .line 52
    .line 53
    sput v4, LVa/ub;->c:I

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    if-eqz v4, :cond_4

    .line 60
    .line 61
    sget v4, LVa/ub;->c:I

    .line 62
    .line 63
    add-int/lit8 v4, v4, 0x13

    .line 64
    .line 65
    rem-int/lit16 v5, v4, 0x80

    .line 66
    .line 67
    sput v5, LVa/ub;->d:I

    .line 68
    .line 69
    rem-int/lit8 v4, v4, 0x2

    .line 70
    .line 71
    if-eqz v4, :cond_2

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v4}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-nez v4, :cond_4

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    const/4 p0, 0x0

    .line 100
    throw p0

    .line 101
    :cond_3
    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-nez v3, :cond_1

    .line 106
    .line 107
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {v3, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_1

    .line 116
    .line 117
    :cond_4
    sget p0, LVa/ub;->d:I

    .line 118
    .line 119
    add-int/lit8 p0, p0, 0x15

    .line 120
    .line 121
    rem-int/lit16 p1, p0, 0x80

    .line 122
    .line 123
    sput p1, LVa/ub;->c:I

    .line 124
    .line 125
    rem-int/lit8 p0, p0, 0x2

    .line 126
    .line 127
    if-eqz p0, :cond_8

    .line 128
    .line 129
    const/16 p0, 0xb

    .line 130
    .line 131
    div-int/2addr p0, v0

    .line 132
    return v1

    .line 133
    :cond_5
    const-class p1, LVa/ub;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-static {v0, v0}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    rsub-int/lit8 v3, v3, 0x7f

    .line 144
    .line 145
    const-string v4, "\u009a\u0086\u0087\u0084\u008d\u008f\u0099\u0090\u008d\u0098\u0082\u0085\u0092\u008f\u0088\u008b\u0089\u0088\u0092\u0087\u0098\u0095\u0088\u0085"

    .line 146
    .line 147
    invoke-static {v3, v4}, LVa/ub;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-nez v2, :cond_9

    .line 160
    .line 161
    sget v2, LVa/ub;->d:I

    .line 162
    .line 163
    add-int/lit8 v2, v2, 0x4b

    .line 164
    .line 165
    rem-int/lit16 v3, v2, 0x80

    .line 166
    .line 167
    sput v3, LVa/ub;->c:I

    .line 168
    .line 169
    rem-int/lit8 v2, v2, 0x2

    .line 170
    .line 171
    if-eqz v2, :cond_6

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    const/16 v3, 0x4f

    .line 178
    .line 179
    div-int/2addr v3, v0

    .line 180
    if-nez v2, :cond_7

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    if-nez v2, :cond_7

    .line 188
    .line 189
    :goto_1
    sget v2, LVa/ub;->d:I

    .line 190
    .line 191
    add-int/lit8 v2, v2, 0x55

    .line 192
    .line 193
    rem-int/lit16 v2, v2, 0x80

    .line 194
    .line 195
    sput v2, LVa/ub;->c:I

    .line 196
    .line 197
    invoke-virtual {p0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    if-eqz v2, :cond_8

    .line 202
    .line 203
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    if-eqz v2, :cond_9

    .line 208
    .line 209
    invoke-virtual {p1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-virtual {p0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result p0

    .line 221
    if-eqz p0, :cond_9

    .line 222
    .line 223
    :cond_8
    :goto_2
    return v1

    .line 224
    :cond_9
    return v0
.end method

.method public static h(Ljava/util/ArrayList;)[Ljava/lang/Class;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v0, v0, [Ljava/lang/Class;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ge v1, v2, :cond_0

    .line 13
    .line 14
    sget v2, LVa/ub;->c:I

    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x17

    .line 17
    .line 18
    rem-int/lit16 v2, v2, 0x80

    .line 19
    .line 20
    sput v2, LVa/ub;->d:I

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/Class;

    .line 27
    .line 28
    aput-object v2, v0, v1

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget p0, LVa/ub;->c:I

    .line 34
    .line 35
    add-int/lit8 p0, p0, 0x3b

    .line 36
    .line 37
    rem-int/lit16 v1, p0, 0x80

    .line 38
    .line 39
    sput v1, LVa/ub;->d:I

    .line 40
    .line 41
    rem-int/lit8 p0, p0, 0x2

    .line 42
    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_1
    const/4 p0, 0x0

    .line 47
    throw p0
.end method

.method public static i(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget v0, LVa/ub;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x45

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/ub;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    array-length v0, p0

    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    const/4 v3, 0x0

    .line 17
    if-ge v2, v0, :cond_4

    .line 18
    .line 19
    sget v4, LVa/ub;->d:I

    .line 20
    .line 21
    add-int/lit8 v4, v4, 0x45

    .line 22
    .line 23
    rem-int/lit16 v5, v4, 0x80

    .line 24
    .line 25
    sput v5, LVa/ub;->c:I

    .line 26
    .line 27
    rem-int/lit8 v4, v4, 0x2

    .line 28
    .line 29
    if-nez v4, :cond_3

    .line 30
    .line 31
    aget-object v4, p0, v2

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    array-length v5, v5

    .line 38
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-ne v5, v6, :cond_2

    .line 43
    .line 44
    sget v5, LVa/ub;->c:I

    .line 45
    .line 46
    add-int/lit8 v5, v5, 0x75

    .line 47
    .line 48
    rem-int/lit16 v6, v5, 0x80

    .line 49
    .line 50
    sput v6, LVa/ub;->d:I

    .line 51
    .line 52
    rem-int/lit8 v5, v5, 0x2

    .line 53
    .line 54
    if-eqz v5, :cond_1

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-static {v3, p1}, LVa/ub;->e([Ljava/lang/Class;Ljava/util/List;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    sget v5, LVa/ub;->d:I

    .line 65
    .line 66
    add-int/lit8 v6, v5, 0x1b

    .line 67
    .line 68
    rem-int/lit16 v6, v6, 0x80

    .line 69
    .line 70
    sput v6, LVa/ub;->c:I

    .line 71
    .line 72
    if-nez v3, :cond_0

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_0
    add-int/lit8 v5, v5, 0x1d

    .line 76
    .line 77
    rem-int/lit16 v5, v5, 0x80

    .line 78
    .line 79
    sput v5, LVa/ub;->c:I

    .line 80
    .line 81
    move-object v3, v4

    .line 82
    goto :goto_2

    .line 83
    :cond_1
    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {p0, p1}, LVa/ub;->e([Ljava/lang/Class;Ljava/util/List;)Z

    .line 88
    .line 89
    .line 90
    throw v3

    .line 91
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    aget-object p0, p0, v2

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    array-length p0, p0

    .line 101
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    throw v3

    .line 105
    :cond_4
    sget p0, LVa/ub;->d:I

    .line 106
    .line 107
    add-int/lit8 p0, p0, 0x39

    .line 108
    .line 109
    rem-int/lit16 p0, p0, 0x80

    .line 110
    .line 111
    sput p0, LVa/ub;->c:I

    .line 112
    .line 113
    :goto_2
    invoke-interface {p1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {v3, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    sget p1, LVa/ub;->c:I

    .line 122
    .line 123
    add-int/lit8 p1, p1, 0x51

    .line 124
    .line 125
    rem-int/lit16 v0, p1, 0x80

    .line 126
    .line 127
    sput v0, LVa/ub;->d:I

    .line 128
    .line 129
    rem-int/lit8 p1, p1, 0x2

    .line 130
    .line 131
    if-nez p1, :cond_5

    .line 132
    .line 133
    const/16 p1, 0x25

    .line 134
    .line 135
    div-int/2addr p1, v1

    .line 136
    :cond_5
    return-object p0
.end method

.method public static j(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;Z)Ljava/lang/reflect/Method;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    array-length v0, p0

    .line 6
    sget v1, LVa/ub;->d:I

    .line 7
    .line 8
    add-int/lit8 v1, v1, 0x17

    .line 9
    .line 10
    rem-int/lit16 v1, v1, 0x80

    .line 11
    .line 12
    sput v1, LVa/ub;->c:I

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    const/4 v3, 0x0

    .line 17
    if-ge v2, v0, :cond_4

    .line 18
    .line 19
    sget v4, LVa/ub;->c:I

    .line 20
    .line 21
    add-int/lit8 v4, v4, 0x3f

    .line 22
    .line 23
    rem-int/lit16 v5, v4, 0x80

    .line 24
    .line 25
    sput v5, LVa/ub;->d:I

    .line 26
    .line 27
    rem-int/lit8 v4, v4, 0x2

    .line 28
    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    aget-object v4, p0, v2

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v5, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    const/16 v6, 0x5a

    .line 42
    .line 43
    div-int/2addr v6, v1

    .line 44
    if-eqz v5, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    aget-object v4, p0, v2

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v5, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_3

    .line 58
    .line 59
    :goto_1
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    array-length v5, v5

    .line 64
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-ne v5, v6, :cond_3

    .line 69
    .line 70
    sget v5, LVa/ub;->c:I

    .line 71
    .line 72
    add-int/lit8 v5, v5, 0xb

    .line 73
    .line 74
    rem-int/lit16 v5, v5, 0x80

    .line 75
    .line 76
    sput v5, LVa/ub;->d:I

    .line 77
    .line 78
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-ne v5, p3, :cond_3

    .line 87
    .line 88
    sget v5, LVa/ub;->d:I

    .line 89
    .line 90
    add-int/lit8 v5, v5, 0x7b

    .line 91
    .line 92
    rem-int/lit16 v6, v5, 0x80

    .line 93
    .line 94
    sput v6, LVa/ub;->c:I

    .line 95
    .line 96
    rem-int/lit8 v5, v5, 0x2

    .line 97
    .line 98
    if-nez v5, :cond_2

    .line 99
    .line 100
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-static {v3, p2}, LVa/ub;->e([Ljava/lang/Class;Ljava/util/List;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    const/4 v5, 0x1

    .line 109
    if-eq v3, v5, :cond_1

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_1
    return-object v4

    .line 113
    :cond_2
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-static {p0, p2}, LVa/ub;->e([Ljava/lang/Class;Ljava/util/List;)Z

    .line 118
    .line 119
    .line 120
    throw v3

    .line 121
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_4
    return-object v3
.end method

.method public static k(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)Ljava/lang/reflect/Method;
    .locals 7

    .line 1
    new-instance v0, LVa/tb;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    sget v3, LVa/ub;->d:I

    .line 19
    .line 20
    add-int/lit8 v3, v3, 0x77

    .line 21
    .line 22
    rem-int/lit16 v3, v3, 0x80

    .line 23
    .line 24
    sput v3, LVa/ub;->c:I

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    sget v4, LVa/ub;->d:I

    .line 33
    .line 34
    add-int/lit8 v4, v4, 0x61

    .line 35
    .line 36
    rem-int/lit16 v4, v4, 0x80

    .line 37
    .line 38
    sput v4, LVa/ub;->c:I

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const-class v3, Ljava/lang/Object;

    .line 49
    .line 50
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    instance-of v2, p0, Ljava/lang/Class;

    .line 58
    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    move-object v3, p0

    .line 62
    check-cast v3, Ljava/lang/Class;

    .line 63
    .line 64
    iput-object v3, v0, LVa/tb;->a:Ljava/lang/Class;

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    iput-object v3, v0, LVa/tb;->a:Ljava/lang/Class;

    .line 72
    .line 73
    :goto_1
    iput-object p1, v0, LVa/tb;->b:Ljava/lang/String;

    .line 74
    .line 75
    iput-object v1, v0, LVa/tb;->c:Ljava/util/ArrayList;

    .line 76
    .line 77
    sget-object v1, LVa/ub;->a:Lj$/util/concurrent/ConcurrentHashMap;

    .line 78
    .line 79
    invoke-virtual {v1, v0}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, Ljava/lang/reflect/Method;

    .line 84
    .line 85
    if-eqz v3, :cond_4

    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-static {v4, p2}, LVa/ub;->e([Ljava/lang/Class;Ljava/util/List;)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_3

    .line 96
    .line 97
    return-object v3

    .line 98
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 99
    .line 100
    .line 101
    move-result-wide v3

    .line 102
    const-wide/16 v5, 0x0

    .line 103
    .line 104
    cmp-long v3, v3, v5

    .line 105
    .line 106
    add-int/lit8 v3, v3, 0x7e

    .line 107
    .line 108
    const-string v4, "\u008b\u0084\u0087\u0086\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0084\u0083\u0082\u0081"

    .line 109
    .line 110
    invoke-static {v3, v4}, LVa/ub;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    new-instance v4, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    const/4 v5, 0x0

    .line 124
    invoke-static {v5}, Landroid/os/Process;->getThreadPriority(I)I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    add-int/lit8 v5, v5, 0x14

    .line 129
    .line 130
    shr-int/lit8 v5, v5, 0x6

    .line 131
    .line 132
    rsub-int/lit8 v5, v5, 0x7f

    .line 133
    .line 134
    const-string v6, "\u008e\u0090\u0088\u0094\u0086\u0082\u0095\u008e\u0090\u0082\u0094\u0085\u008d\u0085\u008e\u0093\u0089\u0087\u0086\u0086\u0082\u0093\u008e\u0092\u0088\u0092\u0092\u0091"

    .line 135
    .line 136
    invoke-static {v5, v6}, LVa/ub;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-static {v3, v4}, LVa/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_4
    if-eqz v2, :cond_5

    .line 158
    .line 159
    check-cast p0, Ljava/lang/Class;

    .line 160
    .line 161
    const/4 v2, 0x1

    .line 162
    invoke-static {p0, p1, p2, v2}, LVa/ub;->j(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;Z)Ljava/lang/reflect/Method;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    if-nez p0, :cond_6

    .line 167
    .line 168
    const-class p0, Ljava/lang/Class;

    .line 169
    .line 170
    invoke-static {p0, p1, p2}, LVa/ub;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)Ljava/lang/reflect/Method;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    sget p1, LVa/ub;->d:I

    .line 175
    .line 176
    add-int/lit8 p1, p1, 0x19

    .line 177
    .line 178
    rem-int/lit16 p1, p1, 0x80

    .line 179
    .line 180
    sput p1, LVa/ub;->c:I

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_5
    invoke-static {p0, p1, p2}, LVa/ub;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)Ljava/lang/reflect/Method;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    :cond_6
    :goto_2
    if-eqz p0, :cond_7

    .line 188
    .line 189
    sget p1, LVa/ub;->c:I

    .line 190
    .line 191
    add-int/lit8 p1, p1, 0x59

    .line 192
    .line 193
    rem-int/lit16 p1, p1, 0x80

    .line 194
    .line 195
    sput p1, LVa/ub;->d:I

    .line 196
    .line 197
    invoke-virtual {v1, v0, p0}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    :cond_7
    sget p1, LVa/ub;->c:I

    .line 201
    .line 202
    add-int/lit8 p1, p1, 0x41

    .line 203
    .line 204
    rem-int/lit16 p1, p1, 0x80

    .line 205
    .line 206
    sput p1, LVa/ub;->d:I

    .line 207
    .line 208
    return-object p0
.end method

.method public static l([Ljava/lang/reflect/Method;[Ljava/lang/reflect/Method;)[Ljava/lang/reflect/Method;
    .locals 4

    .line 1
    sget v0, LVa/ub;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/ub;->c:I

    .line 8
    .line 9
    array-length v0, p0

    .line 10
    array-length v1, p1

    .line 11
    add-int v2, v0, v1

    .line 12
    .line 13
    new-array v2, v2, [Ljava/lang/reflect/Method;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-static {p0, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v3, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 20
    .line 21
    .line 22
    sget p0, LVa/ub;->c:I

    .line 23
    .line 24
    add-int/lit8 p0, p0, 0x59

    .line 25
    .line 26
    rem-int/lit16 p0, p0, 0x80

    .line 27
    .line 28
    sput p0, LVa/ub;->d:I

    .line 29
    .line 30
    return-object v2
.end method
