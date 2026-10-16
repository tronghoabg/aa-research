.class public final enum LVa/J;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:LVa/J;

.field public static final enum b:LVa/J;

.field public static final enum c:LVa/J;

.field public static final enum d:LVa/J;

.field public static final synthetic e:[LVa/J;

.field public static final f:[C

.field public static g:I = 0x0

.field public static h:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v4, 0x4

    .line 6
    const/16 v5, 0x10

    .line 7
    .line 8
    new-array v6, v5, [C

    .line 9
    .line 10
    fill-array-data v6, :array_0

    .line 11
    .line 12
    .line 13
    sput-object v6, LVa/J;->f:[C

    .line 14
    .line 15
    new-instance v6, LVa/J;

    .line 16
    .line 17
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 18
    .line 19
    .line 20
    move-result-wide v7

    .line 21
    const-wide/16 v9, 0x0

    .line 22
    .line 23
    cmp-long v7, v7, v9

    .line 24
    .line 25
    rsub-int/lit8 v7, v7, 0x4

    .line 26
    .line 27
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 28
    .line 29
    .line 30
    move-result-wide v11

    .line 31
    cmp-long v8, v11, v9

    .line 32
    .line 33
    add-int/lit8 v8, v8, 0x68

    .line 34
    .line 35
    int-to-byte v8, v8

    .line 36
    const-string v11, "\u0001\u0002\u00b5"

    .line 37
    .line 38
    invoke-static {v8, v7, v11}, LVa/J;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-direct {v6, v7, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v6, LVa/J;->a:LVa/J;

    .line 50
    .line 51
    new-instance v7, LVa/J;

    .line 52
    .line 53
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    shr-int/lit8 v8, v8, 0x8

    .line 58
    .line 59
    add-int/lit8 v8, v8, 0x5

    .line 60
    .line 61
    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    rsub-int/lit8 v11, v11, 0x2

    .line 66
    .line 67
    int-to-byte v11, v11

    .line 68
    const-string v12, "\u0001\u0003\u0000\u0007G"

    .line 69
    .line 70
    invoke-static {v11, v8, v12}, LVa/J;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-direct {v7, v8, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 79
    .line 80
    .line 81
    sput-object v7, LVa/J;->b:LVa/J;

    .line 82
    .line 83
    new-instance v8, LVa/J;

    .line 84
    .line 85
    const-string v11, ""

    .line 86
    .line 87
    invoke-static {v11, v3, v3}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 88
    .line 89
    .line 90
    move-result v11

    .line 91
    add-int/lit8 v11, v11, 0x5

    .line 92
    .line 93
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 94
    .line 95
    .line 96
    move-result v12

    .line 97
    shr-int/2addr v12, v5

    .line 98
    add-int/lit8 v12, v12, 0xb

    .line 99
    .line 100
    int-to-byte v12, v12

    .line 101
    const-string v13, "\u0001\u0006\u0002\u0000b"

    .line 102
    .line 103
    invoke-static {v12, v11, v13}, LVa/J;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    invoke-direct {v8, v11, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 112
    .line 113
    .line 114
    sput-object v8, LVa/J;->c:LVa/J;

    .line 115
    .line 116
    new-instance v11, LVa/J;

    .line 117
    .line 118
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 119
    .line 120
    .line 121
    move-result-wide v12

    .line 122
    cmp-long v9, v12, v9

    .line 123
    .line 124
    add-int/2addr v9, v4

    .line 125
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 126
    .line 127
    .line 128
    move-result v10

    .line 129
    shr-int/lit8 v5, v10, 0x10

    .line 130
    .line 131
    add-int/lit8 v5, v5, 0x1d

    .line 132
    .line 133
    int-to-byte v5, v5

    .line 134
    const-string v10, "\u0006\u0004\u0004\u000cq"

    .line 135
    .line 136
    invoke-static {v5, v9, v10}, LVa/J;->a(BILjava/lang/String;)Ljava/lang/String;

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
    invoke-direct {v11, v5, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 145
    .line 146
    .line 147
    sput-object v11, LVa/J;->d:LVa/J;

    .line 148
    .line 149
    new-array v4, v4, [LVa/J;

    .line 150
    .line 151
    aput-object v6, v4, v3

    .line 152
    .line 153
    aput-object v7, v4, v1

    .line 154
    .line 155
    aput-object v8, v4, v2

    .line 156
    .line 157
    aput-object v11, v4, v0

    .line 158
    .line 159
    sput-object v4, LVa/J;->e:[LVa/J;

    .line 160
    .line 161
    sget v0, LVa/J;->g:I

    .line 162
    .line 163
    add-int/lit8 v0, v0, 0x69

    .line 164
    .line 165
    rem-int/lit16 v0, v0, 0x80

    .line 166
    .line 167
    sput v0, LVa/J;->h:I

    .line 168
    .line 169
    return-void

    .line 170
    nop

    .line 171
    :array_0
    .array-data 2
        0x41s
        0x4cs
        0x42s
        0x4fs
        0x56s
        0x45s
        0x57s
        0x58s
        0x43s
        0x54s
        0x44s
        0x46s
        0x47s
        0x48s
        0x49s
        0x4as
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
    sget-object v1, LVa/J;->f:[C

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

.method public static valueOf(Ljava/lang/String;)LVa/J;
    .locals 1

    .line 1
    sget v0, LVa/J;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/J;->g:I

    .line 8
    .line 9
    const-class v0, LVa/J;

    .line 10
    .line 11
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, LVa/J;

    .line 16
    .line 17
    sget v0, LVa/J;->h:I

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x3b

    .line 20
    .line 21
    rem-int/lit16 v0, v0, 0x80

    .line 22
    .line 23
    sput v0, LVa/J;->g:I

    .line 24
    .line 25
    return-object p0
.end method

.method public static values()[LVa/J;
    .locals 3

    .line 1
    sget v0, LVa/J;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x61

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/J;->h:I

    .line 8
    .line 9
    sget-object v0, LVa/J;->e:[LVa/J;

    .line 10
    .line 11
    invoke-virtual {v0}, [LVa/J;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, [LVa/J;

    .line 16
    .line 17
    sget v1, LVa/J;->g:I

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x4b

    .line 20
    .line 21
    rem-int/lit16 v2, v1, 0x80

    .line 22
    .line 23
    sput v2, LVa/J;->h:I

    .line 24
    .line 25
    rem-int/lit8 v1, v1, 0x2

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    throw v0
.end method
