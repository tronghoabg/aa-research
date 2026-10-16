.class public final LVa/v9;
.super LVa/r9;
.source "SourceFile"


# static fields
.field public static final c:[C

.field public static d:I = 0x0

.field public static e:I = 0x1


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
    sput-object v0, LVa/v9;->c:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x6as
        0x70s
        0x2es
        0x6ds
        0x61s
        0x69s
        0x6fs
        0x73s
        0x64s
        0x6bs
        0x6es
        0x72s
        0x4ds
        0x41s
        0x6cs
        0x71s
    .end array-data
.end method

.method public static f(BILjava/lang/String;)Ljava/lang/String;
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
    sget-object v1, LVa/v9;->c:[C

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


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 5

    .line 1
    sget v0, LVa/v9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x49

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/v9;->d:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/lit8 v0, v0, 0x4

    .line 15
    .line 16
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    cmp-long v1, v1, v3

    .line 23
    .line 24
    rsub-int/lit8 v1, v1, 0x7

    .line 25
    .line 26
    int-to-byte v1, v1

    .line 27
    const-string v2, "\u0000\u0007\u0006\u0007"

    .line 28
    .line 29
    invoke-static {v1, v0, v2}, LVa/v9;->f(BILjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget v1, LVa/v9;->d:I

    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x47

    .line 40
    .line 41
    rem-int/lit16 v2, v1, 0x80

    .line 42
    .line 43
    sput v2, LVa/v9;->e:I

    .line 44
    .line 45
    rem-int/lit8 v1, v1, 0x2

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_0
    const/4 v0, 0x0

    .line 51
    throw v0
.end method

.method public final c()LVa/Z0;
    .locals 3

    .line 1
    new-instance v0, LVa/M3;

    .line 2
    .line 3
    invoke-virtual {p0}, LVa/v9;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, LVa/Z0;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget v1, LVa/v9;->e:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x1d

    .line 13
    .line 14
    rem-int/lit16 v2, v1, 0x80

    .line 15
    .line 16
    sput v2, LVa/v9;->d:I

    .line 17
    .line 18
    rem-int/lit8 v1, v1, 0x2

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    throw v0
.end method

.method public final d()Ljava/lang/String;
    .locals 5

    .line 1
    sget v0, LVa/v9;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x31

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/v9;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, "\u0001\u0002\u0003\u0000\u0005\u0006\n\u0006\u0004\u000b\n\u0001\u0006\u0008\t\u0008\u0007\u0006\n\u0000\u0000\u0008\u0006\u0007\u000c\t\u00a7"

    .line 12
    .line 13
    const-string v2, ""

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    add-int/lit8 v4, v4, 0x59

    .line 24
    .line 25
    invoke-static {v2, v2, v3, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    mul-int/lit8 v0, v0, 0x16

    .line 30
    .line 31
    int-to-byte v0, v0

    .line 32
    invoke-static {v0, v4, v1}, LVa/v9;->f(BILjava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    add-int/lit8 v0, v0, 0x1b

    .line 46
    .line 47
    invoke-static {v2, v2, v3, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    rsub-int/lit8 v2, v2, 0x34

    .line 52
    .line 53
    int-to-byte v2, v2

    .line 54
    invoke-static {v2, v0, v1}, LVa/v9;->f(BILjava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    goto :goto_0

    .line 59
    :goto_1
    sget v1, LVa/v9;->e:I

    .line 60
    .line 61
    add-int/lit8 v1, v1, 0x73

    .line 62
    .line 63
    rem-int/lit16 v2, v1, 0x80

    .line 64
    .line 65
    sput v2, LVa/v9;->d:I

    .line 66
    .line 67
    rem-int/lit8 v1, v1, 0x2

    .line 68
    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    const/16 v1, 0x53

    .line 72
    .line 73
    div-int/2addr v1, v3

    .line 74
    :cond_1
    return-object v0
.end method

.method public final e()Ljava/lang/Class;
    .locals 2

    .line 1
    sget v0, LVa/v9;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x63

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/v9;->e:I

    .line 8
    .line 9
    const-class v1, Ljp/maio/sdk/android/MaioAds;

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    rem-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    sput v0, LVa/v9;->d:I

    .line 16
    .line 17
    return-object v1
.end method
