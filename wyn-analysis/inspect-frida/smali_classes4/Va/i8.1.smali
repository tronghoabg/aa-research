.class public final LVa/i8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:[C

.field public static e:I = 0x0

.field public static f:I = 0x1


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/i8;->d:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x61s
        0x6es
        0x64s
        0x72s
        0x6fs
        0x69s
        0x2ds
        0x2es
        0x73s
        0x6cs
        0x20s
        0x74s
        0x2cs
        0xas
        0x5bs
        0x5ds
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LVa/i8;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p1, p0, LVa/i8;->b:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p2, p0, LVa/i8;->c:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method

.method public static b(BILjava/lang/String;)Ljava/lang/String;
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
    sget-object v1, LVa/i8;->d:[C

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
    div-int/lit8 v7, v4, 0x4

    .line 57
    .line 58
    rem-int/lit8 v4, v4, 0x4

    .line 59
    .line 60
    div-int/lit8 v8, v6, 0x4

    .line 61
    .line 62
    rem-int/lit8 v6, v6, 0x4

    .line 63
    .line 64
    if-ne v4, v6, :cond_2

    .line 65
    .line 66
    add-int/lit8 v7, v7, 0x3

    .line 67
    .line 68
    rem-int/lit8 v7, v7, 0x4

    .line 69
    .line 70
    add-int/lit8 v8, v8, 0x3

    .line 71
    .line 72
    rem-int/lit8 v8, v8, 0x4

    .line 73
    .line 74
    mul-int/lit8 v7, v7, 0x4

    .line 75
    .line 76
    add-int/2addr v7, v4

    .line 77
    mul-int/lit8 v8, v8, 0x4

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
    add-int/lit8 v4, v4, 0x3

    .line 92
    .line 93
    rem-int/lit8 v4, v4, 0x4

    .line 94
    .line 95
    add-int/lit8 v6, v6, 0x3

    .line 96
    .line 97
    rem-int/lit8 v6, v6, 0x4

    .line 98
    .line 99
    mul-int/lit8 v7, v7, 0x4

    .line 100
    .line 101
    add-int/2addr v7, v4

    .line 102
    mul-int/lit8 v8, v8, 0x4

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
    mul-int/lit8 v7, v7, 0x4

    .line 115
    .line 116
    add-int/2addr v7, v6

    .line 117
    mul-int/lit8 v8, v8, 0x4

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

.method public static c(ILjava/lang/String;)Ljava/lang/String;
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
    const v11, 0xf9df

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
    add-int/lit16 v10, v10, 0x4a3d

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
    add-int/lit16 v10, v10, 0x3928

    .line 70
    .line 71
    xor-int/2addr v9, v10

    .line 72
    ushr-int/lit8 v7, v7, 0x5

    .line 73
    .line 74
    const v10, 0x9c33

    .line 75
    .line 76
    .line 77
    add-int/2addr v7, v10

    .line 78
    xor-int/2addr v7, v9

    .line 79
    sub-int/2addr v8, v7

    .line 80
    int-to-char v7, v8

    .line 81
    aput-char v7, v3, v2

    .line 82
    .line 83
    const v7, 0x9e37

    .line 84
    .line 85
    .line 86
    sub-int/2addr v4, v7

    .line 87
    add-int/lit8 v6, v6, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catchall_0
    move-exception p0

    .line 91
    goto :goto_2

    .line 92
    :cond_0
    sget v4, LVa/Ab;->E:I

    .line 93
    .line 94
    aget-char v6, v3, v2

    .line 95
    .line 96
    aput-char v6, v1, v4

    .line 97
    .line 98
    add-int/lit8 v6, v4, 0x1

    .line 99
    .line 100
    aget-char v5, v3, v5

    .line 101
    .line 102
    aput-char v5, v1, v6

    .line 103
    .line 104
    add-int/lit8 v4, v4, 0x2

    .line 105
    .line 106
    sput v4, LVa/Ab;->E:I

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    new-instance p1, Ljava/lang/String;

    .line 110
    .line 111
    invoke-direct {p1, v1, v2, p0}, Ljava/lang/String;-><init>([CII)V

    .line 112
    .line 113
    .line 114
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    return-object p1

    .line 116
    :goto_2
    monitor-exit v0

    .line 117
    throw p0
.end method

.method public static d(ILjava/lang/String;)Ljava/lang/String;
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
    const v11, 0xe4c3

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
    add-int/lit16 v10, v10, 0xbf9

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
    const v11, 0xfc23

    .line 70
    .line 71
    .line 72
    add-int/2addr v10, v11

    .line 73
    xor-int/2addr v9, v10

    .line 74
    ushr-int/lit8 v7, v7, 0x5

    .line 75
    .line 76
    add-int/lit16 v7, v7, 0x852

    .line 77
    .line 78
    xor-int/2addr v7, v9

    .line 79
    sub-int/2addr v8, v7

    .line 80
    int-to-char v7, v8

    .line 81
    aput-char v7, v3, v2

    .line 82
    .line 83
    const v7, 0x9e37

    .line 84
    .line 85
    .line 86
    sub-int/2addr v4, v7

    .line 87
    add-int/lit8 v6, v6, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catchall_0
    move-exception p0

    .line 91
    goto :goto_2

    .line 92
    :cond_0
    sget v4, LVa/Ab;->E:I

    .line 93
    .line 94
    aget-char v6, v3, v2

    .line 95
    .line 96
    aput-char v6, v1, v4

    .line 97
    .line 98
    add-int/lit8 v6, v4, 0x1

    .line 99
    .line 100
    aget-char v5, v3, v5

    .line 101
    .line 102
    aput-char v5, v1, v6

    .line 103
    .line 104
    add-int/lit8 v4, v4, 0x2

    .line 105
    .line 106
    sput v4, LVa/Ab;->E:I

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    new-instance p1, Ljava/lang/String;

    .line 110
    .line 111
    invoke-direct {p1, v1, v2, p0}, Ljava/lang/String;-><init>([CII)V

    .line 112
    .line 113
    .line 114
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    return-object p1

    .line 116
    :goto_2
    monitor-exit v0

    .line 117
    throw p0
.end method


# virtual methods
.method public final a(LVa/m8;)V
    .locals 2

    .line 1
    sget v0, LVa/i8;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x69

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/i8;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/i8;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/16 p1, 0x37

    .line 19
    .line 20
    div-int/lit8 p1, p1, 0x0

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v1, v1}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    cmp-long v2, v2, v4

    .line 14
    .line 15
    rsub-int/lit8 v2, v2, 0x4

    .line 16
    .line 17
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    rsub-int/lit8 v3, v3, 0x3

    .line 22
    .line 23
    int-to-byte v3, v3

    .line 24
    const-string v6, "##\u0003\u0008#"

    .line 25
    .line 26
    invoke-static {v3, v2, v6}, LVa/i8;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, LVa/i8;->a:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {v1, v1}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 44
    .line 45
    .line 46
    move-result-wide v6

    .line 47
    cmp-long v3, v6, v4

    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x3

    .line 50
    .line 51
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    shr-int/lit8 v4, v4, 0x10

    .line 56
    .line 57
    add-int/lit8 v4, v4, 0xf

    .line 58
    .line 59
    int-to-byte v4, v4

    .line 60
    const-string v5, "\u000e\u0008"

    .line 61
    .line 62
    invoke-static {v4, v3, v5}, LVa/i8;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    shr-int/lit8 v4, v4, 0x18

    .line 75
    .line 76
    rsub-int/lit8 v4, v4, 0x6

    .line 77
    .line 78
    invoke-static {v1, v1}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    rsub-int/lit8 v5, v5, 0x11

    .line 83
    .line 84
    int-to-byte v5, v5

    .line 85
    const-string v6, "\u000e\t\u0008\u0002\u0008\u000b"

    .line 86
    .line 87
    invoke-static {v5, v4, v6}, LVa/i8;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    shr-int/lit8 v3, v3, 0x10

    .line 104
    .line 105
    add-int/lit8 v3, v3, 0x1

    .line 106
    .line 107
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    rsub-int/lit8 v4, v4, 0x14

    .line 112
    .line 113
    int-to-byte v4, v4

    .line 114
    const-string v5, "o"

    .line 115
    .line 116
    invoke-static {v4, v3, v5}, LVa/i8;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    const-string v4, ""

    .line 125
    .line 126
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    shr-int/lit8 v3, v3, 0x10

    .line 135
    .line 136
    rsub-int/lit8 v3, v3, 0x1

    .line 137
    .line 138
    invoke-static {v1, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    rsub-int/lit8 v1, v1, 0x49

    .line 143
    .line 144
    int-to-byte v1, v1

    .line 145
    const-string v5, "\u00a6"

    .line 146
    .line 147
    invoke-static {v1, v3, v5}, LVa/i8;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v2, v1, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    sget v1, LVa/i8;->e:I

    .line 167
    .line 168
    add-int/lit8 v1, v1, 0x67

    .line 169
    .line 170
    rem-int/lit16 v2, v1, 0x80

    .line 171
    .line 172
    sput v2, LVa/i8;->f:I

    .line 173
    .line 174
    rem-int/lit8 v1, v1, 0x2

    .line 175
    .line 176
    if-eqz v1, :cond_0

    .line 177
    .line 178
    return-object v0

    .line 179
    :cond_0
    const/4 v0, 0x0

    .line 180
    throw v0
.end method
