.class public final LVa/D;
.super LVa/Mb;
.source "SourceFile"


# static fields
.field public static final h:[C

.field public static i:I = 0x0

.field public static j:I = 0x1


# instance fields
.field public final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/D;->h:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0xa3s
        0xa5s
        0xa2s
        0xa7s
        0xa1s
        0xa6s
        0xa0s
        0x98s
        0xa9s
        0x97s
        0x9cs
        0x94s
        0x9as
        0x99s
        0xabs
        0xa8s
        0x9fs
    .end array-data
.end method

.method public constructor <init>(LVa/W;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 5
    .line 6
    const-wide/16 v1, 0x78

    .line 7
    .line 8
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    long-to-int v0, v0

    .line 13
    iput v0, p0, LVa/D;->g:I

    .line 14
    .line 15
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    shr-int/lit8 v0, v0, 0x10

    .line 20
    .line 21
    rsub-int/lit8 v0, v0, 0x7f

    .line 22
    .line 23
    const-string v1, "\u0086\u0085\u0083\u0084\u0083\u0082\u0081"

    .line 24
    .line 25
    invoke-static {v0, v1}, LVa/D;->y(ILjava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    const-string v0, ""

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-static {v0, v0, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    int-to-char v0, v0

    .line 40
    const v2, 0xc89172

    .line 41
    .line 42
    .line 43
    invoke-static {v1}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/2addr v1, v2

    .line 48
    const-string v2, "\u7277\uc891\u5c00\u4adc"

    .line 49
    .line 50
    const-string v3, "\u26bf\u14c0\ua6f5\u55dd\u20db\ub4cd\u716f\ue8a8\udf3e"

    .line 51
    .line 52
    invoke-static {v0, v2, v3, v1}, LVa/D;->u(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, LVa/Mb;->b:Ljava/lang/Object;

    .line 60
    .line 61
    return-void
.end method

.method public static u(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, "\u0000\u0000\u0000\u0000"

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, [C

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, [C

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, [C

    .line 20
    .line 21
    sget-object v1, LVa/a;->r:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v1

    .line 24
    :try_start_0
    invoke-virtual {p1}, [C->clone()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, [C

    .line 29
    .line 30
    invoke-virtual {v0}, [C->clone()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, [C

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    aget-char v3, p1, v2

    .line 38
    .line 39
    xor-int/2addr p0, v3

    .line 40
    int-to-char p0, p0

    .line 41
    aput-char p0, p1, v2

    .line 42
    .line 43
    const/4 p0, 0x2

    .line 44
    aget-char v3, v0, p0

    .line 45
    .line 46
    int-to-char p3, p3

    .line 47
    add-int/2addr v3, p3

    .line 48
    int-to-char p3, v3

    .line 49
    aput-char p3, v0, p0

    .line 50
    .line 51
    array-length p0, p2

    .line 52
    new-array p3, p0, [C

    .line 53
    .line 54
    sput v2, LVa/a;->q:I

    .line 55
    .line 56
    :goto_0
    sget v3, LVa/a;->q:I

    .line 57
    .line 58
    if-ge v3, p0, :cond_0

    .line 59
    .line 60
    add-int/lit8 v4, v3, 0x2

    .line 61
    .line 62
    rem-int/lit8 v4, v4, 0x4

    .line 63
    .line 64
    add-int/lit8 v5, v3, 0x3

    .line 65
    .line 66
    rem-int/lit8 v5, v5, 0x4

    .line 67
    .line 68
    rem-int/lit8 v6, v3, 0x4

    .line 69
    .line 70
    aget-char v6, p1, v6

    .line 71
    .line 72
    mul-int/lit16 v6, v6, 0x7fce

    .line 73
    .line 74
    aget-char v4, v0, v4

    .line 75
    .line 76
    add-int/2addr v6, v4

    .line 77
    const v7, 0xffff

    .line 78
    .line 79
    .line 80
    rem-int/2addr v6, v7

    .line 81
    int-to-char v6, v6

    .line 82
    aget-char v8, p1, v5

    .line 83
    .line 84
    mul-int/lit16 v8, v8, 0x7fce

    .line 85
    .line 86
    add-int/2addr v8, v4

    .line 87
    div-int/2addr v8, v7

    .line 88
    int-to-char v4, v8

    .line 89
    aput-char v4, v0, v5

    .line 90
    .line 91
    aput-char v6, p1, v5

    .line 92
    .line 93
    aget-char v4, p2, v3

    .line 94
    .line 95
    xor-int/2addr v4, v6

    .line 96
    int-to-long v4, v4

    .line 97
    int-to-long v6, v2

    .line 98
    xor-long/2addr v4, v6

    .line 99
    const v6, 0xc983

    .line 100
    .line 101
    .line 102
    int-to-long v6, v6

    .line 103
    xor-long/2addr v4, v6

    .line 104
    long-to-int v4, v4

    .line 105
    int-to-char v4, v4

    .line 106
    aput-char v4, p3, v3

    .line 107
    .line 108
    add-int/lit8 v3, v3, 0x1

    .line 109
    .line 110
    sput v3, LVa/a;->q:I

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :catchall_0
    move-exception p0

    .line 114
    goto :goto_1

    .line 115
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 116
    .line 117
    invoke-direct {p0, p3}, Ljava/lang/String;-><init>([C)V

    .line 118
    .line 119
    .line 120
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    return-object p0

    .line 122
    :goto_1
    monitor-exit v1

    .line 123
    throw p0
.end method

.method public static y(ILjava/lang/String;)Ljava/lang/String;
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
    sget-object v1, LVa/D;->h:[C

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
    add-int/lit8 v4, v4, -0x33

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


# virtual methods
.method public final t()J
    .locals 4

    .line 1
    sget v0, LVa/D;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x19

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/D;->j:I

    .line 8
    .line 9
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ""

    .line 14
    .line 15
    invoke-static {v1}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/lit16 v1, v1, 0x80

    .line 20
    .line 21
    const-string v2, "\u0086\u0084"

    .line 22
    .line 23
    invoke-static {v1, v2}, LVa/D;->y(ILjava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-wide/16 v2, 0x0

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    sget v2, LVa/D;->i:I

    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x13

    .line 40
    .line 41
    rem-int/lit16 v3, v2, 0x80

    .line 42
    .line 43
    sput v3, LVa/D;->j:I

    .line 44
    .line 45
    rem-int/lit8 v2, v2, 0x2

    .line 46
    .line 47
    if-nez v2, :cond_0

    .line 48
    .line 49
    const/16 v2, 0x3b

    .line 50
    .line 51
    div-int/lit8 v2, v2, 0x0

    .line 52
    .line 53
    :cond_0
    return-wide v0
.end method

.method public final x()Ljava/util/List;
    .locals 6

    .line 1
    iget-object v0, p0, LVa/Mb;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LVa/W;

    .line 4
    .line 5
    iget-object v0, v0, LVa/W;->d:Lorg/json/JSONObject;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    cmp-long v1, v1, v3

    .line 14
    .line 15
    rsub-int v1, v1, 0x80

    .line 16
    .line 17
    const-string v2, "\u0098\u008c\u0089"

    .line 18
    .line 19
    invoke-static {v1, v2}, LVa/W;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v2, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1, v2}, LVa/Ab;->V(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget v1, LVa/W;->g:I

    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x27

    .line 39
    .line 40
    rem-int/lit16 v1, v1, 0x80

    .line 41
    .line 42
    sput v1, LVa/W;->h:I

    .line 43
    .line 44
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    shr-int/lit8 v2, v2, 0x16

    .line 53
    .line 54
    const v3, 0x8c59

    .line 55
    .line 56
    .line 57
    add-int/2addr v2, v3

    .line 58
    int-to-char v2, v2

    .line 59
    const-string v3, ""

    .line 60
    .line 61
    invoke-static {v3}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    const v4, -0x7869d729

    .line 66
    .line 67
    .line 68
    add-int/2addr v3, v4

    .line 69
    const-string v4, "\ud630\u9628\u5987\u7d8c"

    .line 70
    .line 71
    const-string v5, "\ue491\ufc23\u948c"

    .line 72
    .line 73
    invoke-static {v2, v4, v5, v3}, LVa/D;->u(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    new-instance v3, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-static {v1, v2, v3}, LVa/Ab;->V(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 91
    .line 92
    .line 93
    sget v1, LVa/D;->i:I

    .line 94
    .line 95
    add-int/lit8 v1, v1, 0x6d

    .line 96
    .line 97
    rem-int/lit16 v2, v1, 0x80

    .line 98
    .line 99
    sput v2, LVa/D;->j:I

    .line 100
    .line 101
    rem-int/lit8 v1, v1, 0x2

    .line 102
    .line 103
    if-eqz v1, :cond_0

    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_0
    const/4 v0, 0x0

    .line 107
    throw v0
.end method

.method public final z()I
    .locals 3

    .line 1
    sget v0, LVa/D;->j:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x21

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/D;->i:I

    .line 8
    .line 9
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    shr-int/lit8 v1, v1, 0x8

    .line 18
    .line 19
    rsub-int/lit8 v1, v1, 0x7f

    .line 20
    .line 21
    const-string v2, "\u0081\u0088\u0087"

    .line 22
    .line 23
    invoke-static {v1, v2}, LVa/D;->y(ILjava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/16 v2, 0x28

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    sget v1, LVa/D;->j:I

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x43

    .line 40
    .line 41
    rem-int/lit16 v1, v1, 0x80

    .line 42
    .line 43
    sput v1, LVa/D;->i:I

    .line 44
    .line 45
    return v0
.end method
