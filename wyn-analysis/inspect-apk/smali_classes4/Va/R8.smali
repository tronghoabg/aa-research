.class public final LVa/R8;
.super LVa/N8;
.source "SourceFile"


# static fields
.field public static final k:[C

.field public static final l:[C

.field public static m:I = 0x0

.field public static n:I = 0x1

.field public static o:I = 0x0

.field public static p:I = 0x1

.field public static q:I = 0x1


# instance fields
.field public final synthetic j:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    new-array v2, v1, [C

    .line 4
    .line 5
    const/16 v3, 0x2d

    .line 6
    .line 7
    aput-char v3, v2, v0

    .line 8
    .line 9
    sput-object v2, LVa/R8;->k:[C

    .line 10
    .line 11
    new-array v1, v1, [C

    .line 12
    .line 13
    const/16 v2, 0x2a

    .line 14
    .line 15
    aput-char v2, v1, v0

    .line 16
    .line 17
    sput-object v1, LVa/R8;->l:[C

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(LVa/y8;LVa/y8;I)V
    .locals 0

    .line 1
    iput p3, p0, LVa/R8;->j:I

    const/4 p3, 0x1

    invoke-direct {p0, p1, p2, p3}, LVa/N8;-><init>(LVa/y8;LVa/y8;I)V

    return-void
.end method

.method public static m(I)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "\u70d9"

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [C

    .line 8
    .line 9
    sget-object v1, LVa/a;->u:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    sput p0, LVa/a;->t:I

    .line 13
    .line 14
    array-length p0, v0

    .line 15
    new-array p0, p0, [C

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    sput v2, LVa/a;->s:I

    .line 19
    .line 20
    :goto_0
    sget v2, LVa/a;->s:I

    .line 21
    .line 22
    array-length v3, v0

    .line 23
    if-ge v2, v3, :cond_0

    .line 24
    .line 25
    aget-char v3, v0, v2

    .line 26
    .line 27
    sget v4, LVa/a;->t:I

    .line 28
    .line 29
    mul-int/2addr v4, v2

    .line 30
    xor-int/2addr v3, v4

    .line 31
    int-to-long v3, v3

    .line 32
    const-wide v5, -0x14b1acdb1aae8f04L

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    xor-long/2addr v3, v5

    .line 38
    long-to-int v3, v3

    .line 39
    int-to-char v3, v3

    .line 40
    aput-char v3, p0, v2

    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    sput v2, LVa/a;->s:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 50
    .line 51
    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    .line 52
    .line 53
    .line 54
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    return-object v0

    .line 56
    :goto_1
    monitor-exit v1

    .line 57
    throw p0
.end method

.method private final n()Ljava/lang/String;
    .locals 11

    .line 1
    sget v0, LVa/R8;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/R8;->o:I

    .line 8
    .line 9
    const-string v0, "\uff80\uffaf\u71da\u14d5\ufc6e"

    .line 10
    .line 11
    const-string v1, ""

    .line 12
    .line 13
    const-string v2, ""

    .line 14
    .line 15
    invoke-static {v1, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v2, LVa/pb;->D:Ljava/lang/Object;

    .line 26
    .line 27
    monitor-enter v2

    .line 28
    const-wide v3, -0x4bb17f58c43679ebL    # -9.71867370235935E-57

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    :try_start_0
    invoke-static {v3, v4, v0, v1}, LVa/pb;->z(J[CI)[C

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v1, 0x4

    .line 38
    sput v1, LVa/pb;->C:I

    .line 39
    .line 40
    :goto_0
    sget v5, LVa/pb;->C:I

    .line 41
    .line 42
    array-length v6, v0

    .line 43
    if-ge v5, v6, :cond_0

    .line 44
    .line 45
    add-int/lit8 v6, v5, -0x4

    .line 46
    .line 47
    aget-char v7, v0, v5

    .line 48
    .line 49
    rem-int/lit8 v8, v5, 0x4

    .line 50
    .line 51
    aget-char v8, v0, v8

    .line 52
    .line 53
    xor-int/2addr v7, v8

    .line 54
    int-to-long v7, v7

    .line 55
    int-to-long v9, v6

    .line 56
    mul-long/2addr v9, v3

    .line 57
    xor-long/2addr v7, v9

    .line 58
    long-to-int v6, v7

    .line 59
    int-to-char v6, v6

    .line 60
    aput-char v6, v0, v5

    .line 61
    .line 62
    add-int/lit8 v5, v5, 0x1

    .line 63
    .line 64
    sput v5, LVa/pb;->C:I

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    goto :goto_1

    .line 69
    :cond_0
    new-instance v3, Ljava/lang/String;

    .line 70
    .line 71
    array-length v4, v0

    .line 72
    sub-int/2addr v4, v1

    .line 73
    invoke-direct {v3, v0, v1, v4}, Ljava/lang/String;-><init>([CII)V

    .line 74
    .line 75
    .line 76
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget v1, LVa/R8;->o:I

    .line 82
    .line 83
    add-int/lit8 v1, v1, 0x37

    .line 84
    .line 85
    rem-int/lit16 v1, v1, 0x80

    .line 86
    .line 87
    sput v1, LVa/R8;->p:I

    .line 88
    .line 89
    return-object v0

    .line 90
    :goto_1
    monitor-exit v2

    .line 91
    throw v0
.end method

.method private final o()Ljava/lang/String;
    .locals 12

    .line 1
    sget v0, LVa/R8;->n:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/R8;->m:I

    .line 8
    .line 9
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    shr-int/lit8 v0, v0, 0x10

    .line 14
    .line 15
    rsub-int/lit8 v1, v0, 0x1

    .line 16
    .line 17
    const-string v2, "y"

    .line 18
    .line 19
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    const-wide/16 v5, 0x0

    .line 24
    .line 25
    cmp-long v3, v3, v5

    .line 26
    .line 27
    rsub-int/lit8 v3, v3, 0x50

    .line 28
    .line 29
    int-to-byte v3, v3

    .line 30
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    sget-object v4, LVa/Ab;->B:Ljava/lang/Object;

    .line 35
    .line 36
    monitor-enter v4

    .line 37
    :try_start_0
    sget-object v5, LVa/R8;->l:[C

    .line 38
    .line 39
    new-array v6, v1, [C

    .line 40
    .line 41
    rem-int/lit8 v7, v1, 0x2

    .line 42
    .line 43
    const/4 v8, 0x0

    .line 44
    if-eqz v7, :cond_0

    .line 45
    .line 46
    rsub-int/lit8 v1, v0, 0x0

    .line 47
    .line 48
    aget-char v0, v2, v1

    .line 49
    .line 50
    sub-int/2addr v0, v3

    .line 51
    int-to-char v0, v0

    .line 52
    aput-char v0, v6, v1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    goto :goto_3

    .line 57
    :cond_0
    :goto_0
    const/4 v0, 0x1

    .line 58
    if-le v1, v0, :cond_4

    .line 59
    .line 60
    sput v8, LVa/Ab;->A:I

    .line 61
    .line 62
    :goto_1
    sget v0, LVa/Ab;->A:I

    .line 63
    .line 64
    if-ge v0, v1, :cond_4

    .line 65
    .line 66
    aget-char v7, v2, v0

    .line 67
    .line 68
    add-int/lit8 v8, v0, 0x1

    .line 69
    .line 70
    aget-char v9, v2, v8

    .line 71
    .line 72
    if-ne v7, v9, :cond_1

    .line 73
    .line 74
    sub-int/2addr v7, v3

    .line 75
    int-to-char v7, v7

    .line 76
    aput-char v7, v6, v0

    .line 77
    .line 78
    sub-int/2addr v9, v3

    .line 79
    int-to-char v7, v9

    .line 80
    aput-char v7, v6, v8

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_1
    rem-int/lit8 v10, v7, 0x1

    .line 84
    .line 85
    rem-int/lit8 v11, v9, 0x1

    .line 86
    .line 87
    if-ne v10, v11, :cond_2

    .line 88
    .line 89
    rem-int/lit8 v7, v7, 0x1

    .line 90
    .line 91
    rem-int/lit8 v9, v9, 0x1

    .line 92
    .line 93
    add-int/2addr v7, v10

    .line 94
    add-int/2addr v9, v11

    .line 95
    aget-char v7, v5, v7

    .line 96
    .line 97
    aput-char v7, v6, v0

    .line 98
    .line 99
    aget-char v7, v5, v9

    .line 100
    .line 101
    aput-char v7, v6, v8

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_2
    if-ne v7, v9, :cond_3

    .line 105
    .line 106
    rem-int/lit8 v10, v10, 0x1

    .line 107
    .line 108
    rem-int/lit8 v11, v11, 0x1

    .line 109
    .line 110
    add-int/2addr v7, v10

    .line 111
    add-int/2addr v9, v11

    .line 112
    aget-char v7, v5, v7

    .line 113
    .line 114
    aput-char v7, v6, v0

    .line 115
    .line 116
    aget-char v7, v5, v9

    .line 117
    .line 118
    aput-char v7, v6, v8

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    add-int/2addr v7, v11

    .line 122
    add-int/2addr v9, v10

    .line 123
    aget-char v7, v5, v7

    .line 124
    .line 125
    aput-char v7, v6, v0

    .line 126
    .line 127
    aget-char v7, v5, v9

    .line 128
    .line 129
    aput-char v7, v6, v8

    .line 130
    .line 131
    :goto_2
    add-int/lit8 v0, v0, 0x2

    .line 132
    .line 133
    sput v0, LVa/Ab;->A:I

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    new-instance v0, Ljava/lang/String;

    .line 137
    .line 138
    invoke-direct {v0, v6}, Ljava/lang/String;-><init>([C)V

    .line 139
    .line 140
    .line 141
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sget v1, LVa/R8;->m:I

    .line 147
    .line 148
    add-int/lit8 v1, v1, 0x7b

    .line 149
    .line 150
    rem-int/lit16 v1, v1, 0x80

    .line 151
    .line 152
    sput v1, LVa/R8;->n:I

    .line 153
    .line 154
    return-object v0

    .line 155
    :goto_3
    monitor-exit v4

    .line 156
    throw v0
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 12

    .line 1
    iget v0, p0, LVa/R8;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget v0, LVa/R8;->q:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x5f

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    const v1, 0xa4e1

    .line 13
    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    add-int/lit8 v0, v0, -0x7b

    .line 22
    .line 23
    div-int/2addr v1, v0

    .line 24
    :goto_0
    invoke-static {v1}, LVa/R8;->m(I)Ljava/lang/String;

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
    goto :goto_1

    .line 33
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    shr-int/lit8 v0, v0, 0x10

    .line 38
    .line 39
    sub-int/2addr v1, v0

    .line 40
    goto :goto_0

    .line 41
    :goto_1
    return-object v0

    .line 42
    :pswitch_0
    invoke-direct {p0}, LVa/R8;->n()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :pswitch_1
    invoke-direct {p0}, LVa/R8;->o()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0

    .line 52
    :pswitch_2
    const/4 v0, 0x0

    .line 53
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    rsub-int/lit8 v2, v1, 0x1

    .line 58
    .line 59
    invoke-static {v0, v0, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    rsub-int/lit8 v3, v3, 0x65

    .line 64
    .line 65
    int-to-byte v3, v3

    .line 66
    const-string v4, "\u0092"

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/String;->toCharArray()[C

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    sget-object v5, LVa/Ab;->B:Ljava/lang/Object;

    .line 73
    .line 74
    monitor-enter v5

    .line 75
    :try_start_0
    sget-object v6, LVa/R8;->k:[C

    .line 76
    .line 77
    new-array v7, v2, [C

    .line 78
    .line 79
    rem-int/lit8 v8, v2, 0x2

    .line 80
    .line 81
    if-eqz v8, :cond_1

    .line 82
    .line 83
    rsub-int/lit8 v2, v1, 0x0

    .line 84
    .line 85
    aget-char v1, v4, v2

    .line 86
    .line 87
    sub-int/2addr v1, v3

    .line 88
    int-to-char v1, v1

    .line 89
    aput-char v1, v7, v2

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    goto :goto_5

    .line 94
    :cond_1
    :goto_2
    const/4 v1, 0x1

    .line 95
    if-le v2, v1, :cond_5

    .line 96
    .line 97
    sput v0, LVa/Ab;->A:I

    .line 98
    .line 99
    :goto_3
    sget v0, LVa/Ab;->A:I

    .line 100
    .line 101
    if-ge v0, v2, :cond_5

    .line 102
    .line 103
    aget-char v1, v4, v0

    .line 104
    .line 105
    add-int/lit8 v8, v0, 0x1

    .line 106
    .line 107
    aget-char v9, v4, v8

    .line 108
    .line 109
    if-ne v1, v9, :cond_2

    .line 110
    .line 111
    sub-int/2addr v1, v3

    .line 112
    int-to-char v1, v1

    .line 113
    aput-char v1, v7, v0

    .line 114
    .line 115
    sub-int/2addr v9, v3

    .line 116
    int-to-char v1, v9

    .line 117
    aput-char v1, v7, v8

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_2
    rem-int/lit8 v10, v1, 0x1

    .line 121
    .line 122
    rem-int/lit8 v11, v9, 0x1

    .line 123
    .line 124
    if-ne v10, v11, :cond_3

    .line 125
    .line 126
    rem-int/lit8 v1, v1, 0x1

    .line 127
    .line 128
    rem-int/lit8 v9, v9, 0x1

    .line 129
    .line 130
    add-int/2addr v1, v10

    .line 131
    add-int/2addr v9, v11

    .line 132
    aget-char v1, v6, v1

    .line 133
    .line 134
    aput-char v1, v7, v0

    .line 135
    .line 136
    aget-char v1, v6, v9

    .line 137
    .line 138
    aput-char v1, v7, v8

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_3
    if-ne v1, v9, :cond_4

    .line 142
    .line 143
    rem-int/lit8 v10, v10, 0x1

    .line 144
    .line 145
    rem-int/lit8 v11, v11, 0x1

    .line 146
    .line 147
    add-int/2addr v1, v10

    .line 148
    add-int/2addr v9, v11

    .line 149
    aget-char v1, v6, v1

    .line 150
    .line 151
    aput-char v1, v7, v0

    .line 152
    .line 153
    aget-char v1, v6, v9

    .line 154
    .line 155
    aput-char v1, v7, v8

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_4
    add-int/2addr v1, v11

    .line 159
    add-int/2addr v9, v10

    .line 160
    aget-char v1, v6, v1

    .line 161
    .line 162
    aput-char v1, v7, v0

    .line 163
    .line 164
    aget-char v1, v6, v9

    .line 165
    .line 166
    aput-char v1, v7, v8

    .line 167
    .line 168
    :goto_4
    add-int/lit8 v0, v0, 0x2

    .line 169
    .line 170
    sput v0, LVa/Ab;->A:I

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_5
    new-instance v0, Ljava/lang/String;

    .line 174
    .line 175
    invoke-direct {v0, v7}, Ljava/lang/String;-><init>([C)V

    .line 176
    .line 177
    .line 178
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    return-object v0

    .line 184
    :goto_5
    monitor-exit v5

    .line 185
    throw v0

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;
    .locals 3

    .line 1
    iget v0, p0, LVa/R8;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Ljava/lang/Double;

    .line 7
    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    sget v0, LVa/R8;->q:I

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x47

    .line 13
    .line 14
    rem-int/lit16 v1, v0, 0x80

    .line 15
    .line 16
    rem-int/lit8 v0, v0, 0x2

    .line 17
    .line 18
    if-nez v0, :cond_3

    .line 19
    .line 20
    instance-of v0, p2, Ljava/lang/Double;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    instance-of v0, p1, Ljava/lang/Long;

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x4b

    .line 30
    .line 31
    rem-int/lit16 v1, v1, 0x80

    .line 32
    .line 33
    sput v1, LVa/R8;->q:I

    .line 34
    .line 35
    instance-of v0, p2, Ljava/lang/Long;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    rem-int/2addr p1, p2

    .line 49
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 59
    .line 60
    .line 61
    move-result-wide p1

    .line 62
    rem-long/2addr v0, p1

    .line 63
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    instance-of p1, p2, Ljava/lang/Double;

    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    throw p1

    .line 72
    :cond_4
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 77
    .line 78
    .line 79
    move-result-wide p1

    .line 80
    rem-double/2addr v0, p1

    .line 81
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    :goto_2
    return-object p1

    .line 86
    :pswitch_0
    sget v0, LVa/R8;->p:I

    .line 87
    .line 88
    add-int/lit8 v0, v0, 0x3f

    .line 89
    .line 90
    rem-int/lit16 v0, v0, 0x80

    .line 91
    .line 92
    sput v0, LVa/R8;->o:I

    .line 93
    .line 94
    instance-of v0, p1, Ljava/lang/Double;

    .line 95
    .line 96
    if-nez v0, :cond_8

    .line 97
    .line 98
    instance-of v0, p2, Ljava/lang/Double;

    .line 99
    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_5
    instance-of v0, p1, Ljava/lang/Long;

    .line 104
    .line 105
    if-nez v0, :cond_7

    .line 106
    .line 107
    instance-of v0, p2, Ljava/lang/Long;

    .line 108
    .line 109
    if-eqz v0, :cond_6

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    div-int/2addr p1, p2

    .line 121
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    sget p2, LVa/R8;->p:I

    .line 126
    .line 127
    add-int/lit8 p2, p2, 0x2f

    .line 128
    .line 129
    rem-int/lit16 p2, p2, 0x80

    .line 130
    .line 131
    sput p2, LVa/R8;->o:I

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_7
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 135
    .line 136
    .line 137
    move-result-wide v0

    .line 138
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 139
    .line 140
    .line 141
    move-result-wide p1

    .line 142
    div-long/2addr v0, p1

    .line 143
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    goto :goto_5

    .line 148
    :cond_8
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 149
    .line 150
    .line 151
    move-result-wide v0

    .line 152
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 153
    .line 154
    .line 155
    move-result-wide p1

    .line 156
    div-double/2addr v0, p1

    .line 157
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    sget p2, LVa/R8;->o:I

    .line 162
    .line 163
    add-int/lit8 p2, p2, 0x21

    .line 164
    .line 165
    rem-int/lit16 v0, p2, 0x80

    .line 166
    .line 167
    sput v0, LVa/R8;->p:I

    .line 168
    .line 169
    rem-int/lit8 p2, p2, 0x2

    .line 170
    .line 171
    if-nez p2, :cond_9

    .line 172
    .line 173
    const/16 p2, 0x43

    .line 174
    .line 175
    div-int/lit8 p2, p2, 0x0

    .line 176
    .line 177
    :cond_9
    :goto_5
    return-object p1

    .line 178
    :pswitch_1
    sget v0, LVa/R8;->n:I

    .line 179
    .line 180
    add-int/lit8 v0, v0, 0x55

    .line 181
    .line 182
    rem-int/lit16 v1, v0, 0x80

    .line 183
    .line 184
    sput v1, LVa/R8;->m:I

    .line 185
    .line 186
    rem-int/lit8 v0, v0, 0x2

    .line 187
    .line 188
    if-eqz v0, :cond_a

    .line 189
    .line 190
    instance-of v0, p1, Ljava/lang/Double;

    .line 191
    .line 192
    const/16 v2, 0x2a

    .line 193
    .line 194
    div-int/lit8 v2, v2, 0x0

    .line 195
    .line 196
    if-nez v0, :cond_f

    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_a
    instance-of v0, p1, Ljava/lang/Double;

    .line 200
    .line 201
    if-nez v0, :cond_f

    .line 202
    .line 203
    :goto_6
    instance-of v0, p2, Ljava/lang/Double;

    .line 204
    .line 205
    if-eqz v0, :cond_b

    .line 206
    .line 207
    goto :goto_8

    .line 208
    :cond_b
    instance-of v0, p1, Ljava/lang/Long;

    .line 209
    .line 210
    if-nez v0, :cond_e

    .line 211
    .line 212
    add-int/lit8 v1, v1, 0x6d

    .line 213
    .line 214
    rem-int/lit16 v0, v1, 0x80

    .line 215
    .line 216
    sput v0, LVa/R8;->n:I

    .line 217
    .line 218
    rem-int/lit8 v1, v1, 0x2

    .line 219
    .line 220
    if-nez v1, :cond_c

    .line 221
    .line 222
    instance-of v0, p2, Ljava/lang/Long;

    .line 223
    .line 224
    const/16 v1, 0x4e

    .line 225
    .line 226
    div-int/lit8 v1, v1, 0x0

    .line 227
    .line 228
    if-eqz v0, :cond_d

    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_c
    instance-of v0, p2, Ljava/lang/Long;

    .line 232
    .line 233
    if-eqz v0, :cond_d

    .line 234
    .line 235
    goto :goto_7

    .line 236
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 241
    .line 242
    .line 243
    move-result p2

    .line 244
    mul-int/2addr p2, p1

    .line 245
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    goto :goto_9

    .line 250
    :cond_e
    :goto_7
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 251
    .line 252
    .line 253
    move-result-wide v0

    .line 254
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 255
    .line 256
    .line 257
    move-result-wide p1

    .line 258
    mul-long/2addr p1, v0

    .line 259
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    sget p2, LVa/R8;->n:I

    .line 264
    .line 265
    add-int/lit8 p2, p2, 0x3d

    .line 266
    .line 267
    rem-int/lit16 p2, p2, 0x80

    .line 268
    .line 269
    sput p2, LVa/R8;->m:I

    .line 270
    .line 271
    goto :goto_9

    .line 272
    :cond_f
    :goto_8
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 273
    .line 274
    .line 275
    move-result-wide v0

    .line 276
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 277
    .line 278
    .line 279
    move-result-wide p1

    .line 280
    mul-double/2addr p1, v0

    .line 281
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    :goto_9
    return-object p1

    .line 286
    :pswitch_2
    instance-of v0, p1, Ljava/lang/Double;

    .line 287
    .line 288
    if-nez v0, :cond_13

    .line 289
    .line 290
    instance-of v0, p2, Ljava/lang/Double;

    .line 291
    .line 292
    if-eqz v0, :cond_10

    .line 293
    .line 294
    goto :goto_b

    .line 295
    :cond_10
    instance-of v0, p1, Ljava/lang/Long;

    .line 296
    .line 297
    if-nez v0, :cond_12

    .line 298
    .line 299
    instance-of v0, p2, Ljava/lang/Long;

    .line 300
    .line 301
    if-eqz v0, :cond_11

    .line 302
    .line 303
    goto :goto_a

    .line 304
    :cond_11
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 305
    .line 306
    .line 307
    move-result p1

    .line 308
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 309
    .line 310
    .line 311
    move-result p2

    .line 312
    sub-int/2addr p1, p2

    .line 313
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    goto :goto_c

    .line 318
    :cond_12
    :goto_a
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 319
    .line 320
    .line 321
    move-result-wide v0

    .line 322
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 323
    .line 324
    .line 325
    move-result-wide p1

    .line 326
    sub-long/2addr v0, p1

    .line 327
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    goto :goto_c

    .line 332
    :cond_13
    :goto_b
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 333
    .line 334
    .line 335
    move-result-wide v0

    .line 336
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 337
    .line 338
    .line 339
    move-result-wide p1

    .line 340
    sub-double/2addr v0, p1

    .line 341
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    :goto_c
    return-object p1

    .line 346
    nop

    .line 347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
