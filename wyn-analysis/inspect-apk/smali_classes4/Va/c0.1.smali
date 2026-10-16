.class public final LVa/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:[C

.field public static final j:[I

.field public static k:I = 0x0

.field public static l:I = 0x1


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:LVa/a0;

.field public h:LVa/b0;


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
    sput-object v0, LVa/c0;->i:[C

    .line 9
    .line 10
    const/16 v0, 0x12

    .line 11
    .line 12
    new-array v0, v0, [I

    .line 13
    .line 14
    fill-array-data v0, :array_1

    .line 15
    .line 16
    .line 17
    sput-object v0, LVa/c0;->j:[I

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :array_0
    .array-data 2
        0x45s
        0x4es
        0x41s
        0x42s
        0x4cs
        0x44s
        0x49s
        0x53s
        0x2fs
        0x57s
        0x65s
        0x62s
        0x56s
        0x69s
        0x77s
        0x20s
        0x2ds
        0x4bs
        0x76s
        0x72s
        0x73s
        0x6fs
        0x6es
        0x3as
        0x46s
        0x61s
        0x6cs
        0x64s
        0x74s
        0x63s
        0x47s
        0x48s
        0x4as
        0x4ds
        0x4fs
        0x50s
    .end array-data

    .line 22
    .line 23
    .line 24
    :array_1
    .array-data 4
        0x650139e2
        0x1bd1aee0
        0x481d169d
        0x78139659
        0x2767f4d6
        -0x3637c78b
        -0x67c44d5a
        -0x61ec044
        -0x4e32ab1
        -0x2617804e
        -0x28e16721
        -0x29d9c48e
        -0x5e853a46
        0x6c2c4b3
        -0x324ff906
        0x3a204e75
        0x1ebed1d6
        0x5442dbf2
    .end array-data
.end method

.method public static a(I[I)Ljava/lang/String;
    .locals 12

    .line 1
    sget-object v0, LVa/a;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x4

    .line 5
    :try_start_0
    new-array v1, v1, [C

    .line 6
    .line 7
    array-length v2, p1

    .line 8
    const/4 v3, 0x1

    .line 9
    shl-int/2addr v2, v3

    .line 10
    new-array v2, v2, [C

    .line 11
    .line 12
    sget-object v4, LVa/c0;->j:[I

    .line 13
    .line 14
    invoke-virtual {v4}, [I->clone()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, [I

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    sput v5, LVa/a;->k:I

    .line 22
    .line 23
    :goto_0
    sget v6, LVa/a;->k:I

    .line 24
    .line 25
    array-length v7, p1

    .line 26
    if-ge v6, v7, :cond_1

    .line 27
    .line 28
    aget v7, p1, v6

    .line 29
    .line 30
    shr-int/lit8 v8, v7, 0x10

    .line 31
    .line 32
    int-to-char v8, v8

    .line 33
    aput-char v8, v1, v5

    .line 34
    .line 35
    int-to-char v7, v7

    .line 36
    aput-char v7, v1, v3

    .line 37
    .line 38
    add-int/lit8 v6, v6, 0x1

    .line 39
    .line 40
    aget v6, p1, v6

    .line 41
    .line 42
    shr-int/lit8 v9, v6, 0x10

    .line 43
    .line 44
    int-to-char v9, v9

    .line 45
    const/4 v10, 0x2

    .line 46
    aput-char v9, v1, v10

    .line 47
    .line 48
    int-to-char v6, v6

    .line 49
    const/4 v11, 0x3

    .line 50
    aput-char v6, v1, v11

    .line 51
    .line 52
    shl-int/lit8 v8, v8, 0x10

    .line 53
    .line 54
    add-int/2addr v8, v7

    .line 55
    sput v8, LVa/a;->l:I

    .line 56
    .line 57
    shl-int/lit8 v7, v9, 0x10

    .line 58
    .line 59
    add-int/2addr v7, v6

    .line 60
    sput v7, LVa/a;->m:I

    .line 61
    .line 62
    invoke-static {v4}, LVa/a;->o([I)V

    .line 63
    .line 64
    .line 65
    move v6, v5

    .line 66
    :goto_1
    const/16 v7, 0x10

    .line 67
    .line 68
    if-ge v6, v7, :cond_0

    .line 69
    .line 70
    sget v7, LVa/a;->l:I

    .line 71
    .line 72
    aget v8, v4, v6

    .line 73
    .line 74
    xor-int/2addr v7, v8

    .line 75
    sput v7, LVa/a;->l:I

    .line 76
    .line 77
    invoke-static {v7}, LVa/a;->G(I)I

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    sget v8, LVa/a;->m:I

    .line 82
    .line 83
    xor-int/2addr v7, v8

    .line 84
    sget v8, LVa/a;->l:I

    .line 85
    .line 86
    sput v7, LVa/a;->l:I

    .line 87
    .line 88
    sput v8, LVa/a;->m:I

    .line 89
    .line 90
    add-int/lit8 v6, v6, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception p0

    .line 94
    goto :goto_2

    .line 95
    :cond_0
    sget v6, LVa/a;->l:I

    .line 96
    .line 97
    sget v8, LVa/a;->m:I

    .line 98
    .line 99
    sput v8, LVa/a;->l:I

    .line 100
    .line 101
    sput v6, LVa/a;->m:I

    .line 102
    .line 103
    aget v7, v4, v7

    .line 104
    .line 105
    xor-int/2addr v6, v7

    .line 106
    sput v6, LVa/a;->m:I

    .line 107
    .line 108
    const/16 v7, 0x11

    .line 109
    .line 110
    aget v7, v4, v7

    .line 111
    .line 112
    xor-int/2addr v7, v8

    .line 113
    sput v7, LVa/a;->l:I

    .line 114
    .line 115
    ushr-int/lit8 v8, v7, 0x10

    .line 116
    .line 117
    int-to-char v8, v8

    .line 118
    aput-char v8, v1, v5

    .line 119
    .line 120
    int-to-char v7, v7

    .line 121
    aput-char v7, v1, v3

    .line 122
    .line 123
    ushr-int/lit8 v7, v6, 0x10

    .line 124
    .line 125
    int-to-char v7, v7

    .line 126
    aput-char v7, v1, v10

    .line 127
    .line 128
    int-to-char v6, v6

    .line 129
    aput-char v6, v1, v11

    .line 130
    .line 131
    invoke-static {v4}, LVa/a;->o([I)V

    .line 132
    .line 133
    .line 134
    sget v6, LVa/a;->k:I

    .line 135
    .line 136
    shl-int/lit8 v7, v6, 0x1

    .line 137
    .line 138
    aget-char v8, v1, v5

    .line 139
    .line 140
    aput-char v8, v2, v7

    .line 141
    .line 142
    add-int/lit8 v8, v7, 0x1

    .line 143
    .line 144
    aget-char v9, v1, v3

    .line 145
    .line 146
    aput-char v9, v2, v8

    .line 147
    .line 148
    add-int/lit8 v8, v7, 0x2

    .line 149
    .line 150
    aget-char v9, v1, v10

    .line 151
    .line 152
    aput-char v9, v2, v8

    .line 153
    .line 154
    add-int/lit8 v7, v7, 0x3

    .line 155
    .line 156
    aget-char v8, v1, v11

    .line 157
    .line 158
    aput-char v8, v2, v7

    .line 159
    .line 160
    add-int/lit8 v6, v6, 0x2

    .line 161
    .line 162
    sput v6, LVa/a;->k:I

    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_1
    new-instance p1, Ljava/lang/String;

    .line 167
    .line 168
    invoke-direct {p1, v2, v5, p0}, Ljava/lang/String;-><init>([CII)V

    .line 169
    .line 170
    .line 171
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 172
    return-object p1

    .line 173
    :goto_2
    monitor-exit v0

    .line 174
    throw p0
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
    sget-object v1, LVa/c0;->i:[C

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
.method public final c(LVa/b0;)Ljava/lang/String;
    .locals 8

    .line 1
    const/4 v0, 0x3

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x2

    .line 7
    const/4 v5, 0x0

    .line 8
    if-eqz p1, :cond_7

    .line 9
    .line 10
    sget v6, LVa/c0;->k:I

    .line 11
    .line 12
    add-int/lit8 v6, v6, 0x77

    .line 13
    .line 14
    rem-int/lit16 v7, v6, 0x80

    .line 15
    .line 16
    sput v7, LVa/c0;->l:I

    .line 17
    .line 18
    rem-int/2addr v6, v4

    .line 19
    if-eqz v6, :cond_6

    .line 20
    .line 21
    sget-object v6, LVa/Z;->b:[I

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    aget p1, v6, p1

    .line 28
    .line 29
    if-eq p1, v3, :cond_5

    .line 30
    .line 31
    if-eq p1, v4, :cond_4

    .line 32
    .line 33
    if-eq p1, v0, :cond_3

    .line 34
    .line 35
    const/4 v0, 0x4

    .line 36
    if-eq p1, v0, :cond_2

    .line 37
    .line 38
    const/4 v0, 0x5

    .line 39
    if-eq p1, v0, :cond_0

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :cond_0
    invoke-static {v2, v2, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    rsub-int/lit8 p1, p1, 0x1a

    .line 48
    .line 49
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    const-wide/16 v2, 0x0

    .line 54
    .line 55
    cmp-long v0, v0, v2

    .line 56
    .line 57
    add-int/lit8 v0, v0, 0x5b

    .line 58
    .line 59
    int-to-byte v0, v0

    .line 60
    const-string v1, "\u0019\u001a\u000e\u0019\t\u001c\u0010\u001b\u001b\u0015\u0019\u0017\u0007\u001c\"\u0010\u0011\u001b\u0016\u0017\u001c\u0010\u0018\u001d\u0016\u0014"

    .line 61
    .line 62
    invoke-static {v0, p1, v1}, LVa/c0;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    sget v0, LVa/c0;->l:I

    .line 71
    .line 72
    add-int/lit8 v0, v0, 0x61

    .line 73
    .line 74
    rem-int/lit16 v1, v0, 0x80

    .line 75
    .line 76
    sput v1, LVa/c0;->k:I

    .line 77
    .line 78
    rem-int/2addr v0, v4

    .line 79
    if-nez v0, :cond_1

    .line 80
    .line 81
    return-object p1

    .line 82
    :cond_1
    throw v5

    .line 83
    :cond_2
    new-array p1, v1, [I

    .line 84
    .line 85
    fill-array-data p1, :array_0

    .line 86
    .line 87
    .line 88
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    shr-int/2addr v0, v1

    .line 93
    add-int/lit8 v0, v0, 0x1e

    .line 94
    .line 95
    invoke-static {v0, p1}, LVa/c0;->a(I[I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    return-object p1

    .line 104
    :cond_3
    const/16 p1, 0x1c

    .line 105
    .line 106
    new-array p1, p1, [I

    .line 107
    .line 108
    fill-array-data p1, :array_1

    .line 109
    .line 110
    .line 111
    const/4 v0, 0x0

    .line 112
    invoke-static {v0, v0}, Landroid/graphics/PointF;->length(FF)F

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    cmpl-float v0, v1, v0

    .line 117
    .line 118
    rsub-int/lit8 v0, v0, 0x37

    .line 119
    .line 120
    invoke-static {v0, p1}, LVa/c0;->a(I[I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iget-object v0, p0, LVa/c0;->a:Ljava/lang/String;

    .line 129
    .line 130
    iget-object v1, p0, LVa/c0;->c:Ljava/lang/String;

    .line 131
    .line 132
    new-array v4, v4, [Ljava/lang/Object;

    .line 133
    .line 134
    aput-object v0, v4, v2

    .line 135
    .line 136
    aput-object v1, v4, v3

    .line 137
    .line 138
    invoke-static {p1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    return-object p1

    .line 143
    :cond_4
    const/16 p1, 0x20

    .line 144
    .line 145
    new-array p1, p1, [I

    .line 146
    .line 147
    fill-array-data p1, :array_2

    .line 148
    .line 149
    .line 150
    const-string v1, ""

    .line 151
    .line 152
    invoke-static {v1, v1, v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    rsub-int/lit8 v1, v1, 0x3e

    .line 157
    .line 158
    invoke-static {v1, p1}, LVa/c0;->a(I[I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    iget-object v1, p0, LVa/c0;->a:Ljava/lang/String;

    .line 167
    .line 168
    iget-object v5, p0, LVa/c0;->c:Ljava/lang/String;

    .line 169
    .line 170
    iget-object v6, p0, LVa/c0;->f:Ljava/lang/String;

    .line 171
    .line 172
    new-array v0, v0, [Ljava/lang/Object;

    .line 173
    .line 174
    aput-object v1, v0, v2

    .line 175
    .line 176
    aput-object v5, v0, v3

    .line 177
    .line 178
    aput-object v6, v0, v4

    .line 179
    .line 180
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    return-object p1

    .line 185
    :cond_5
    const/16 p1, 0xc

    .line 186
    .line 187
    new-array p1, p1, [I

    .line 188
    .line 189
    fill-array-data p1, :array_3

    .line 190
    .line 191
    .line 192
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    shr-int/2addr v0, v1

    .line 197
    rsub-int/lit8 v0, v0, 0x16

    .line 198
    .line 199
    invoke-static {v0, p1}, LVa/c0;->a(I[I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    return-object p1

    .line 208
    :cond_6
    sget-object v0, LVa/Z;->b:[I

    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    aget p1, v0, p1

    .line 215
    .line 216
    throw v5

    .line 217
    :cond_7
    :goto_0
    return-object v5

    .line 218
    nop

    .line 219
    :array_0
    .array-data 4
        0x1368355c
        0x53aceade
        -0x59bb49e6
        -0x293adccc
        0x79144866
        -0x3b62088c
        -0x57062d0d
        -0x337d91bc    # -6.838326E7f
        0x43b50ac3
        -0xedf0e1d
        0x3afe61b0
        0x336ecf80
        0xf18f96f
        -0x2be7118c
        0x3419a16b
        0x5323a1b1
    .end array-data

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    :array_1
    .array-data 4
        0x28a11800    # 1.7884999E-14f
        0xe1f448
        0x58d0ef1c
        0x3a6563ea
        0x687fe666
        -0x28aa6e35
        0x96a063
        0x2f98c226
        -0x2872d757
        -0x2d8eefa5
        0x63243ff
        -0x7bd2cf39
        0x260f2714
        0x410e4d21
        0xfe473ef
        0x3e4b3162
        -0x4cac68f3
        -0x3d4d7b04
        -0x6d85c291
        -0x385720f5
        -0x796a9f83
        0x74b5d760
        0x3f29e217
        -0xfe0c930
        -0x2d3fd55c
        -0x4a517c42
        0x5eb5755
        0x30b0199c
    .end array-data

    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    :array_2
    .array-data 4
        -0x5e4a082b
        -0x7a4149c5
        0x35ebf58d
        0x29350c34
        0x687fe666
        -0x28aa6e35
        0x96a063
        0x2f98c226
        0x2fc15965
        -0x473d1d31
        -0x5d90d926
        0x368e6278
        0xea913d3
        0x22dd2c2e
        -0x1ef54bba
        0x19755fc3
        -0x46ea0214
        0x31f637fc
        -0x50ce59a1
        -0x660ac17c
        0x58d0ef1c
        0x3a6563ea
        0x687fe666
        -0x28aa6e35
        0x96a063
        0x2f98c226
        -0x356bb46c    # -4859338.0f
        -0x7bc8e3bd
        0x27fd24e5
        0x21cdbe72
        -0x476ee0a4
        -0x4085ffe
    .end array-data

    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    :array_3
    .array-data 4
        0x7275ec98
        -0x304a1a21
        -0x133ff3ab
        -0x456db340
        0x60c8ec81
        -0x50203597
        0x53d5b256
        -0x40697477
        0x71661cba
        -0x33eeda79    # -3.8049308E7f
        0x60130569
        -0x449df7cb
    .end array-data
.end method

.method public final d(LVa/a0;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const/16 v4, 0x11

    .line 10
    .line 11
    const/4 v5, 0x6

    .line 12
    sget v6, LVa/c0;->k:I

    .line 13
    .line 14
    add-int/lit8 v6, v6, 0x53

    .line 15
    .line 16
    rem-int/lit16 v7, v6, 0x80

    .line 17
    .line 18
    sput v7, LVa/c0;->l:I

    .line 19
    .line 20
    const/4 v7, 0x2

    .line 21
    rem-int/2addr v6, v7

    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v9, 0x5

    .line 24
    if-nez v6, :cond_0

    .line 25
    .line 26
    iput-object v1, v0, LVa/c0;->g:LVa/a0;

    .line 27
    .line 28
    sget-object v6, LVa/a0;->f:LVa/a0;

    .line 29
    .line 30
    div-int/lit8 v10, v4, 0x0

    .line 31
    .line 32
    if-eq v1, v6, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iput-object v1, v0, LVa/c0;->g:LVa/a0;

    .line 36
    .line 37
    sget-object v6, LVa/a0;->f:LVa/a0;

    .line 38
    .line 39
    if-eq v1, v6, :cond_1

    .line 40
    .line 41
    :goto_0
    sget v1, LVa/c0;->l:I

    .line 42
    .line 43
    add-int/2addr v1, v9

    .line 44
    rem-int/lit16 v1, v1, 0x80

    .line 45
    .line 46
    sput v1, LVa/c0;->k:I

    .line 47
    .line 48
    sget-object v1, LVa/b0;->a:LVa/b0;

    .line 49
    .line 50
    iput-object v1, v0, LVa/c0;->h:LVa/b0;

    .line 51
    .line 52
    sget v1, LVa/c0;->k:I

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x2d

    .line 55
    .line 56
    rem-int/lit16 v1, v1, 0x80

    .line 57
    .line 58
    sput v1, LVa/c0;->l:I

    .line 59
    .line 60
    :cond_1
    sget-object v1, LVa/Z;->a:[I

    .line 61
    .line 62
    iget-object v6, v0, LVa/c0;->g:LVa/a0;

    .line 63
    .line 64
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    aget v1, v1, v6

    .line 69
    .line 70
    const/4 v6, 0x3

    .line 71
    if-eq v1, v6, :cond_2

    .line 72
    .line 73
    const/4 v10, 0x4

    .line 74
    if-eq v1, v10, :cond_2

    .line 75
    .line 76
    if-eq v1, v9, :cond_2

    .line 77
    .line 78
    goto/16 :goto_7

    .line 79
    .line 80
    :cond_2
    sget v1, LVa/c0;->l:I

    .line 81
    .line 82
    add-int/lit8 v1, v1, 0x55

    .line 83
    .line 84
    rem-int/lit16 v1, v1, 0x80

    .line 85
    .line 86
    sput v1, LVa/c0;->k:I

    .line 87
    .line 88
    iget-object v1, v0, LVa/c0;->a:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    const/4 v11, 0x0

    .line 95
    cmpl-float v10, v10, v11

    .line 96
    .line 97
    rsub-int/lit8 v10, v10, 0x7

    .line 98
    .line 99
    invoke-static {v8}, Landroid/os/Process;->getThreadPriority(I)I

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    add-int/lit8 v12, v12, 0x14

    .line 104
    .line 105
    shr-int/2addr v12, v5

    .line 106
    rsub-int/lit8 v12, v12, 0x57

    .line 107
    .line 108
    int-to-byte v12, v12

    .line 109
    const-string v13, "\n\u000b\u0006\u0011\u0010\u0007\u00ce"

    .line 110
    .line 111
    invoke-static {v12, v10, v13}, LVa/c0;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-nez v1, :cond_11

    .line 124
    .line 125
    new-instance v1, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    new-instance v10, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    .line 134
    .line 135
    new-instance v12, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    new-array v13, v3, [I

    .line 141
    .line 142
    fill-array-data v13, :array_0

    .line 143
    .line 144
    .line 145
    invoke-static {v8}, Landroid/graphics/Color;->alpha(I)I

    .line 146
    .line 147
    .line 148
    move-result v14

    .line 149
    add-int/lit8 v14, v14, 0xf

    .line 150
    .line 151
    invoke-static {v14, v13}, LVa/c0;->a(I[I)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v13

    .line 155
    invoke-virtual {v13}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v13

    .line 159
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    iget-object v13, v0, LVa/c0;->a:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    new-array v13, v5, [I

    .line 168
    .line 169
    fill-array-data v13, :array_1

    .line 170
    .line 171
    .line 172
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 173
    .line 174
    .line 175
    move-result-wide v14

    .line 176
    const-wide/16 v16, 0x0

    .line 177
    .line 178
    cmp-long v14, v14, v16

    .line 179
    .line 180
    rsub-int/lit8 v14, v14, 0xc

    .line 181
    .line 182
    invoke-static {v14, v13}, LVa/c0;->a(I[I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v13

    .line 186
    invoke-virtual {v13}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v13

    .line 190
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    iget-object v13, v0, LVa/c0;->b:Ljava/lang/String;

    .line 198
    .line 199
    const/16 v14, 0x30

    .line 200
    .line 201
    const-string v15, ""

    .line 202
    .line 203
    if-eqz v13, :cond_3

    .line 204
    .line 205
    invoke-static {v12}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    move-result-object v12

    .line 209
    iget-object v13, v0, LVa/c0;->b:Ljava/lang/String;

    .line 210
    .line 211
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-static {v15, v14, v8, v8}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 215
    .line 216
    .line 217
    move-result v13

    .line 218
    neg-int v13, v13

    .line 219
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 220
    .line 221
    .line 222
    move-result v18

    .line 223
    shr-int/lit8 v18, v18, 0x10

    .line 224
    .line 225
    move/from16 v19, v3

    .line 226
    .line 227
    rsub-int/lit8 v3, v18, 0x37

    .line 228
    .line 229
    int-to-byte v3, v3

    .line 230
    move/from16 v18, v4

    .line 231
    .line 232
    const-string v4, "W"

    .line 233
    .line 234
    invoke-static {v3, v13, v4}, LVa/c0;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v12

    .line 249
    sget v3, LVa/c0;->k:I

    .line 250
    .line 251
    add-int/lit8 v3, v3, 0x11

    .line 252
    .line 253
    rem-int/lit16 v3, v3, 0x80

    .line 254
    .line 255
    sput v3, LVa/c0;->l:I

    .line 256
    .line 257
    goto :goto_1

    .line 258
    :cond_3
    move/from16 v19, v3

    .line 259
    .line 260
    :goto_1
    invoke-static {v12}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-static {v8}, Landroid/graphics/Color;->blue(I)I

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    rsub-int/lit8 v4, v4, 0xe

    .line 269
    .line 270
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 271
    .line 272
    .line 273
    move-result v12

    .line 274
    shr-int/lit8 v12, v12, 0x8

    .line 275
    .line 276
    add-int/lit8 v12, v12, 0x25

    .line 277
    .line 278
    int-to-byte v12, v12

    .line 279
    const-string v13, "RRRRRRRRRRRRRR"

    .line 280
    .line 281
    invoke-static {v12, v4, v13}, LVa/c0;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    const v3, -0xbfe39c3

    .line 300
    .line 301
    .line 302
    const v4, -0x2205567c

    .line 303
    .line 304
    .line 305
    filled-new-array {v3, v4}, [I

    .line 306
    .line 307
    .line 308
    move-result-object v12

    .line 309
    invoke-static {v15}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 310
    .line 311
    .line 312
    move-result v13

    .line 313
    rsub-int/lit8 v13, v13, 0x1

    .line 314
    .line 315
    invoke-static {v13, v12}, LVa/c0;->a(I[I)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v12

    .line 319
    invoke-virtual {v12}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v12

    .line 323
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v10

    .line 330
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    sget v10, LVa/c0;->k:I

    .line 334
    .line 335
    add-int/2addr v10, v9

    .line 336
    rem-int/lit16 v10, v10, 0x80

    .line 337
    .line 338
    sput v10, LVa/c0;->l:I

    .line 339
    .line 340
    iget-object v9, v0, LVa/c0;->a:Ljava/lang/String;

    .line 341
    .line 342
    const/4 v12, 0x0

    .line 343
    if-eqz v9, :cond_6

    .line 344
    .line 345
    iget-object v9, v0, LVa/c0;->c:Ljava/lang/String;

    .line 346
    .line 347
    if-eqz v9, :cond_6

    .line 348
    .line 349
    add-int/lit8 v10, v10, 0x31

    .line 350
    .line 351
    rem-int/lit16 v13, v10, 0x80

    .line 352
    .line 353
    sput v13, LVa/c0;->k:I

    .line 354
    .line 355
    rem-int/2addr v10, v7

    .line 356
    const-string v13, "\u0002\u0007\u0090"

    .line 357
    .line 358
    if-eqz v10, :cond_4

    .line 359
    .line 360
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 361
    .line 362
    .line 363
    move-result v10

    .line 364
    div-int/lit8 v10, v10, 0xe

    .line 365
    .line 366
    rem-int v10, v7, v10

    .line 367
    .line 368
    invoke-static {v8}, Landroid/graphics/Color;->red(I)I

    .line 369
    .line 370
    .line 371
    move-result v18

    .line 372
    move/from16 p1, v6

    .line 373
    .line 374
    rsub-int/lit8 v6, v18, 0x6a

    .line 375
    .line 376
    int-to-byte v6, v6

    .line 377
    invoke-static {v6, v10, v13}, LVa/c0;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v6

    .line 381
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v6

    .line 385
    invoke-virtual {v9, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v6

    .line 389
    if-eqz v6, :cond_5

    .line 390
    .line 391
    goto :goto_2

    .line 392
    :cond_4
    move/from16 p1, v6

    .line 393
    .line 394
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 395
    .line 396
    .line 397
    move-result v6

    .line 398
    shr-int/lit8 v6, v6, 0x10

    .line 399
    .line 400
    rsub-int/lit8 v6, v6, 0x3

    .line 401
    .line 402
    invoke-static {v8}, Landroid/graphics/Color;->red(I)I

    .line 403
    .line 404
    .line 405
    move-result v10

    .line 406
    add-int/lit8 v10, v10, 0x4f

    .line 407
    .line 408
    int-to-byte v10, v10

    .line 409
    invoke-static {v10, v6, v13}, LVa/c0;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v6

    .line 413
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v6

    .line 417
    invoke-virtual {v9, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v6

    .line 421
    if-eqz v6, :cond_5

    .line 422
    .line 423
    :goto_2
    iget-object v6, v0, LVa/c0;->g:LVa/a0;

    .line 424
    .line 425
    sget-object v10, LVa/a0;->e:LVa/a0;

    .line 426
    .line 427
    if-eq v6, v10, :cond_5

    .line 428
    .line 429
    new-array v6, v5, [I

    .line 430
    .line 431
    fill-array-data v6, :array_2

    .line 432
    .line 433
    .line 434
    invoke-static {v8, v8}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 435
    .line 436
    .line 437
    move-result v9

    .line 438
    rsub-int/lit8 v9, v9, 0xb

    .line 439
    .line 440
    invoke-static {v9, v6}, LVa/c0;->a(I[I)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v6

    .line 444
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v9

    .line 448
    :cond_5
    new-instance v6, Ljava/lang/StringBuilder;

    .line 449
    .line 450
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 451
    .line 452
    .line 453
    iget-object v10, v0, LVa/c0;->a:Ljava/lang/String;

    .line 454
    .line 455
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 459
    .line 460
    .line 461
    move-result v10

    .line 462
    shr-int/lit8 v10, v10, 0x10

    .line 463
    .line 464
    add-int/lit8 v10, v10, 0xe

    .line 465
    .line 466
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 467
    .line 468
    .line 469
    move-result v13

    .line 470
    shr-int/lit8 v13, v13, 0x8

    .line 471
    .line 472
    rsub-int/lit8 v13, v13, 0x12

    .line 473
    .line 474
    int-to-byte v13, v13

    .line 475
    move/from16 v18, v7

    .line 476
    .line 477
    const-string v7, "\r\t\u000b\u0017\u000c\u0015\u0007\u0016\u0013\u000e\u0016\u0017\u0015\u0011"

    .line 478
    .line 479
    invoke-static {v13, v10, v7}, LVa/c0;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v7

    .line 483
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v7

    .line 487
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v6

    .line 497
    sget v7, LVa/c0;->l:I

    .line 498
    .line 499
    add-int/lit8 v7, v7, 0x4d

    .line 500
    .line 501
    rem-int/lit16 v7, v7, 0x80

    .line 502
    .line 503
    sput v7, LVa/c0;->k:I

    .line 504
    .line 505
    goto :goto_3

    .line 506
    :cond_6
    move/from16 p1, v6

    .line 507
    .line 508
    move/from16 v18, v7

    .line 509
    .line 510
    move-object v6, v12

    .line 511
    :goto_3
    if-eqz v6, :cond_7

    .line 512
    .line 513
    invoke-static {v6}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    move-result-object v6

    .line 517
    filled-new-array {v3, v4}, [I

    .line 518
    .line 519
    .line 520
    move-result-object v7

    .line 521
    invoke-static {v8}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 522
    .line 523
    .line 524
    move-result v9

    .line 525
    cmpl-float v9, v9, v11

    .line 526
    .line 527
    rsub-int/lit8 v9, v9, 0x1

    .line 528
    .line 529
    invoke-static {v9, v7}, LVa/c0;->a(I[I)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v7

    .line 533
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v7

    .line 537
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v6

    .line 544
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    sget v6, LVa/c0;->k:I

    .line 548
    .line 549
    add-int/lit8 v6, v6, 0x53

    .line 550
    .line 551
    rem-int/lit16 v6, v6, 0x80

    .line 552
    .line 553
    sput v6, LVa/c0;->l:I

    .line 554
    .line 555
    :cond_7
    sget v6, LVa/c0;->l:I

    .line 556
    .line 557
    add-int/lit8 v6, v6, 0x75

    .line 558
    .line 559
    rem-int/lit16 v7, v6, 0x80

    .line 560
    .line 561
    sput v7, LVa/c0;->k:I

    .line 562
    .line 563
    rem-int/lit8 v6, v6, 0x2

    .line 564
    .line 565
    if-nez v6, :cond_10

    .line 566
    .line 567
    iget-object v6, v0, LVa/c0;->d:Ljava/lang/String;

    .line 568
    .line 569
    if-eqz v6, :cond_9

    .line 570
    .line 571
    iget-object v6, v0, LVa/c0;->e:Ljava/lang/String;

    .line 572
    .line 573
    if-eqz v6, :cond_9

    .line 574
    .line 575
    new-instance v6, Ljava/lang/StringBuilder;

    .line 576
    .line 577
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 578
    .line 579
    .line 580
    new-array v7, v2, [I

    .line 581
    .line 582
    fill-array-data v7, :array_3

    .line 583
    .line 584
    .line 585
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 586
    .line 587
    .line 588
    move-result v9

    .line 589
    shr-int/lit8 v9, v9, 0x10

    .line 590
    .line 591
    rsub-int/lit8 v9, v9, 0x18

    .line 592
    .line 593
    invoke-static {v9, v7}, LVa/c0;->a(I[I)Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v7

    .line 597
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v7

    .line 601
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 602
    .line 603
    .line 604
    iget-object v7, v0, LVa/c0;->d:Ljava/lang/String;

    .line 605
    .line 606
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 607
    .line 608
    .line 609
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 610
    .line 611
    .line 612
    move-result v7

    .line 613
    shr-int/lit8 v7, v7, 0x10

    .line 614
    .line 615
    add-int/lit8 v7, v7, 0x3

    .line 616
    .line 617
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 618
    .line 619
    .line 620
    move-result v9

    .line 621
    shr-int/lit8 v9, v9, 0x10

    .line 622
    .line 623
    add-int/lit8 v9, v9, 0x22

    .line 624
    .line 625
    int-to-byte v9, v9

    .line 626
    const-string v10, "\u0010\u0011B"

    .line 627
    .line 628
    invoke-static {v9, v7, v10}, LVa/c0;->b(BILjava/lang/String;)Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v7

    .line 632
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v7

    .line 636
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    iget-object v7, v0, LVa/c0;->e:Ljava/lang/String;

    .line 640
    .line 641
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v6

    .line 648
    sget v7, LVa/c0;->l:I

    .line 649
    .line 650
    add-int/lit8 v7, v7, 0x63

    .line 651
    .line 652
    rem-int/lit16 v9, v7, 0x80

    .line 653
    .line 654
    sput v9, LVa/c0;->k:I

    .line 655
    .line 656
    rem-int/lit8 v7, v7, 0x2

    .line 657
    .line 658
    if-nez v7, :cond_8

    .line 659
    .line 660
    goto :goto_4

    .line 661
    :cond_8
    throw v12

    .line 662
    :cond_9
    move-object v6, v12

    .line 663
    :goto_4
    if-eqz v6, :cond_a

    .line 664
    .line 665
    invoke-static {v6}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    move-result-object v6

    .line 669
    filled-new-array {v3, v4}, [I

    .line 670
    .line 671
    .line 672
    move-result-object v7

    .line 673
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 674
    .line 675
    .line 676
    move-result v9

    .line 677
    shr-int/lit8 v9, v9, 0x10

    .line 678
    .line 679
    rsub-int/lit8 v9, v9, 0x1

    .line 680
    .line 681
    invoke-static {v9, v7}, LVa/c0;->a(I[I)Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v7

    .line 685
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v7

    .line 689
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v6

    .line 696
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 697
    .line 698
    .line 699
    sget v6, LVa/c0;->k:I

    .line 700
    .line 701
    add-int/lit8 v6, v6, 0x2f

    .line 702
    .line 703
    rem-int/lit16 v6, v6, 0x80

    .line 704
    .line 705
    sput v6, LVa/c0;->l:I

    .line 706
    .line 707
    :cond_a
    new-instance v6, Ljava/lang/StringBuilder;

    .line 708
    .line 709
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 710
    .line 711
    .line 712
    const v7, -0x543268a8

    .line 713
    .line 714
    .line 715
    const v9, -0x28eb3b07

    .line 716
    .line 717
    .line 718
    const v10, -0x26a1d433

    .line 719
    .line 720
    .line 721
    const v11, 0x12dd2fb4

    .line 722
    .line 723
    .line 724
    filled-new-array {v7, v9, v10, v11}, [I

    .line 725
    .line 726
    .line 727
    move-result-object v7

    .line 728
    invoke-static {v8}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 729
    .line 730
    .line 731
    move-result-wide v9

    .line 732
    cmp-long v9, v9, v16

    .line 733
    .line 734
    rsub-int/lit8 v9, v9, 0x8

    .line 735
    .line 736
    invoke-static {v9, v7}, LVa/c0;->a(I[I)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v7

    .line 740
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v7

    .line 744
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 745
    .line 746
    .line 747
    iget-object v7, v0, LVa/c0;->g:LVa/a0;

    .line 748
    .line 749
    sget-object v9, LVa/a0;->f:LVa/a0;

    .line 750
    .line 751
    if-ne v7, v9, :cond_b

    .line 752
    .line 753
    const v7, -0x3ea3a452

    .line 754
    .line 755
    .line 756
    const v9, -0x62c4a2b7

    .line 757
    .line 758
    .line 759
    const v10, 0x21119975

    .line 760
    .line 761
    .line 762
    const v11, -0x73fb94b0

    .line 763
    .line 764
    .line 765
    filled-new-array {v7, v9, v10, v11}, [I

    .line 766
    .line 767
    .line 768
    move-result-object v7

    .line 769
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 770
    .line 771
    .line 772
    move-result v9

    .line 773
    shr-int/lit8 v9, v9, 0x10

    .line 774
    .line 775
    add-int/lit8 v9, v9, 0x7

    .line 776
    .line 777
    invoke-static {v9, v7}, LVa/c0;->a(I[I)Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v7

    .line 781
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object v7

    .line 785
    goto :goto_5

    .line 786
    :cond_b
    sget v9, LVa/c0;->l:I

    .line 787
    .line 788
    add-int/lit8 v9, v9, 0xd

    .line 789
    .line 790
    rem-int/lit16 v9, v9, 0x80

    .line 791
    .line 792
    sput v9, LVa/c0;->k:I

    .line 793
    .line 794
    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v7

    .line 798
    sget v9, LVa/c0;->k:I

    .line 799
    .line 800
    add-int/lit8 v9, v9, 0x61

    .line 801
    .line 802
    rem-int/lit16 v9, v9, 0x80

    .line 803
    .line 804
    sput v9, LVa/c0;->l:I

    .line 805
    .line 806
    :goto_5
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 807
    .line 808
    .line 809
    filled-new-array {v3, v4}, [I

    .line 810
    .line 811
    .line 812
    move-result-object v3

    .line 813
    invoke-static {v15, v14, v8, v8}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 814
    .line 815
    .line 816
    move-result v4

    .line 817
    neg-int v4, v4

    .line 818
    invoke-static {v4, v3}, LVa/c0;->a(I[I)Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v3

    .line 822
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v3

    .line 826
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 827
    .line 828
    .line 829
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v3

    .line 833
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 834
    .line 835
    .line 836
    iget-object v3, v0, LVa/c0;->g:LVa/a0;

    .line 837
    .line 838
    sget-object v4, LVa/a0;->d:LVa/a0;

    .line 839
    .line 840
    if-eq v3, v4, :cond_f

    .line 841
    .line 842
    sget-object v4, LVa/a0;->e:LVa/a0;

    .line 843
    .line 844
    if-ne v3, v4, :cond_c

    .line 845
    .line 846
    goto :goto_6

    .line 847
    :cond_c
    iget-object v3, v0, LVa/c0;->h:LVa/b0;

    .line 848
    .line 849
    invoke-virtual {v0, v3}, LVa/c0;->c(LVa/b0;)Ljava/lang/String;

    .line 850
    .line 851
    .line 852
    move-result-object v3

    .line 853
    if-eqz v3, :cond_d

    .line 854
    .line 855
    new-instance v4, Ljava/lang/StringBuilder;

    .line 856
    .line 857
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 858
    .line 859
    .line 860
    new-array v6, v5, [I

    .line 861
    .line 862
    fill-array-data v6, :array_4

    .line 863
    .line 864
    .line 865
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 866
    .line 867
    .line 868
    move-result v7

    .line 869
    shr-int/lit8 v7, v7, 0x10

    .line 870
    .line 871
    rsub-int/lit8 v7, v7, 0x9

    .line 872
    .line 873
    invoke-static {v7, v6}, LVa/c0;->a(I[I)Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v6

    .line 877
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v6

    .line 881
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 882
    .line 883
    .line 884
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 885
    .line 886
    .line 887
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v3

    .line 891
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 892
    .line 893
    .line 894
    :cond_d
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 895
    .line 896
    .line 897
    move-result-object v1

    .line 898
    new-array v3, v5, [I

    .line 899
    .line 900
    fill-array-data v3, :array_5

    .line 901
    .line 902
    .line 903
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 904
    .line 905
    .line 906
    move-result v4

    .line 907
    shr-int/lit8 v4, v4, 0x10

    .line 908
    .line 909
    add-int/2addr v4, v2

    .line 910
    invoke-static {v4, v3}, LVa/c0;->a(I[I)Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v2

    .line 914
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v2

    .line 918
    sget v3, LVa/Ab;->r:I

    .line 919
    .line 920
    add-int/lit8 v3, v3, 0x21

    .line 921
    .line 922
    rem-int/lit16 v4, v3, 0x80

    .line 923
    .line 924
    sput v4, LVa/Ab;->s:I

    .line 925
    .line 926
    rem-int/lit8 v3, v3, 0x2

    .line 927
    .line 928
    invoke-static {v2, v2, v1}, LVa/Ab;->e0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 929
    .line 930
    .line 931
    if-eqz v3, :cond_e

    .line 932
    .line 933
    return-void

    .line 934
    :cond_e
    throw v12

    .line 935
    :cond_f
    :goto_6
    new-array v3, v5, [I

    .line 936
    .line 937
    fill-array-data v3, :array_6

    .line 938
    .line 939
    .line 940
    invoke-static {v8, v8, v8, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 941
    .line 942
    .line 943
    move-result v4

    .line 944
    add-int/2addr v4, v2

    .line 945
    invoke-static {v4, v3}, LVa/c0;->a(I[I)Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 950
    .line 951
    .line 952
    move-result-object v2

    .line 953
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 954
    .line 955
    .line 956
    move-result-object v1

    .line 957
    invoke-static {v2, v1}, LVa/Ab;->Y(Ljava/lang/String;Ljava/lang/String;)V

    .line 958
    .line 959
    .line 960
    return-void

    .line 961
    :cond_10
    throw v12

    .line 962
    :cond_11
    :goto_7
    return-void

    .line 963
    :array_0
    .array-data 4
        -0x7c4201b6
        -0x7c1ac683
        -0x7c4201b6
        -0x7c1ac683
        -0x7c4201b6
        -0x7c1ac683
        -0x39c7666a
        -0x5a7208dc
    .end array-data

    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    :array_1
    .array-data 4
        0x3afe61b0
        0x336ecf80
        0xf18f96f
        -0x2be7118c
        -0x1f77e36
        0xe7efb9f
    .end array-data

    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    :array_2
    .array-data 4
        -0x6a9241cc
        0x34ca701c
        0x3ba2b5b5
        0x30811cc7
        -0x55f3f49d
        -0x46301442
    .end array-data

    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    :array_3
    .array-data 4
        -0xfbbd687
        -0x25b94f1c
        -0x7aaf4941
        0x2a0c335
        -0x6ff4aa7d
        -0x3ad9c307
        0xfe473ef
        0x3e4b3162
        -0x4cac68f3
        -0x3d4d7b04
        0x5427f36c
        -0x66e975b9
    .end array-data

    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    :array_4
    .array-data 4
        0x786e7bf6
        0x556da83d
        -0x319e203d
        -0x7dc72989
        0x30a86a2f
        -0x14e5210
    .end array-data

    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    :array_5
    .array-data 4
        0x3ff87285
        0x403bf367    # 2.936731f
        -0x13e91063
        0x15c08d32
        -0x73156e54
        -0x332e71d0
    .end array-data

    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    :array_6
    .array-data 4
        0x3ff87285
        0x403bf367    # 2.936731f
        -0x13e91063
        0x15c08d32
        -0x73156e54
        -0x332e71d0
    .end array-data
.end method
