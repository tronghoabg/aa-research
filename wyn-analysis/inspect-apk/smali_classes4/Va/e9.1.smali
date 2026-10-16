.class public final LVa/e9;
.super LVa/c9;
.source "SourceFile"


# static fields
.field public static final e:[B


# instance fields
.field public final d:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/e9;->e:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        -0x2dt
        0x6ct
        -0x6at
        0x7t
        -0x77t
        0x3ct
        -0x7dt
        0x79t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/e9;->d:Ljava/util/ArrayList;

    .line 5
    .line 6
    return-void
.end method

.method public static e(SIIIB)Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, LVa/pb;->J:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    add-int/lit8 p2, p2, 0x5f

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-ne p2, v2, :cond_0

    .line 15
    .line 16
    move v3, v4

    .line 17
    :cond_0
    if-eqz v3, :cond_1

    .line 18
    .line 19
    sget-object p2, LVa/e9;->e:[B

    .line 20
    .line 21
    const v2, -0x7527b58b

    .line 22
    .line 23
    .line 24
    add-int/2addr v2, p3

    .line 25
    aget-byte p2, p2, v2

    .line 26
    .line 27
    add-int/lit8 p2, p2, 0x5f

    .line 28
    .line 29
    int-to-byte p2, p2

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    :goto_0
    if-lez p2, :cond_2

    .line 34
    .line 35
    add-int/2addr p3, p2

    .line 36
    const v2, 0x7527b58d

    .line 37
    .line 38
    .line 39
    sub-int/2addr p3, v2

    .line 40
    add-int/2addr p3, v3

    .line 41
    sput p3, LVa/pb;->F:I

    .line 42
    .line 43
    sput-byte p4, LVa/pb;->G:B

    .line 44
    .line 45
    const p3, -0x513dbce2

    .line 46
    .line 47
    .line 48
    add-int/2addr p1, p3

    .line 49
    int-to-char p1, p1

    .line 50
    sput-char p1, LVa/pb;->H:C

    .line 51
    .line 52
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    sget-char p1, LVa/pb;->H:C

    .line 56
    .line 57
    sput-char p1, LVa/pb;->I:C

    .line 58
    .line 59
    sput v4, LVa/pb;->E:I

    .line 60
    .line 61
    :goto_1
    sget p1, LVa/pb;->E:I

    .line 62
    .line 63
    if-ge p1, p2, :cond_2

    .line 64
    .line 65
    sget-object p1, LVa/e9;->e:[B

    .line 66
    .line 67
    sget p3, LVa/pb;->F:I

    .line 68
    .line 69
    add-int/lit8 p4, p3, -0x1

    .line 70
    .line 71
    sput p4, LVa/pb;->F:I

    .line 72
    .line 73
    aget-byte p1, p1, p3

    .line 74
    .line 75
    sget-char p3, LVa/pb;->I:C

    .line 76
    .line 77
    add-int/2addr p1, p0

    .line 78
    int-to-byte p1, p1

    .line 79
    sget-byte p4, LVa/pb;->G:B

    .line 80
    .line 81
    xor-int/2addr p1, p4

    .line 82
    add-int/2addr p3, p1

    .line 83
    int-to-char p1, p3

    .line 84
    sput-char p1, LVa/pb;->H:C

    .line 85
    .line 86
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    sget-char p1, LVa/pb;->H:C

    .line 90
    .line 91
    sput-char p1, LVa/pb;->I:C

    .line 92
    .line 93
    sget p1, LVa/pb;->E:I

    .line 94
    .line 95
    add-int/2addr p1, v4

    .line 96
    sput p1, LVa/pb;->E:I

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    return-object p0

    .line 105
    :goto_2
    monitor-exit v0

    .line 106
    throw p0
.end method


# virtual methods
.method public final c(LVa/x8;LVa/y7;)LVa/s8;
    .locals 6

    .line 1
    iget-object v0, p0, LVa/e9;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, LVa/y8;

    .line 19
    .line 20
    instance-of v3, v1, LVa/J8;

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    xor-int/2addr v3, v4

    .line 24
    if-eq v3, v4, :cond_0

    .line 25
    .line 26
    move-object v2, v1

    .line 27
    check-cast v2, LVa/J8;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    instance-of v3, v1, LVa/C8;

    .line 31
    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    move-object v3, v1

    .line 35
    check-cast v3, LVa/C8;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget v4, LVa/C8;->f:I

    .line 41
    .line 42
    add-int/lit8 v4, v4, 0x53

    .line 43
    .line 44
    rem-int/lit16 v4, v4, 0x80

    .line 45
    .line 46
    sput v4, LVa/C8;->g:I

    .line 47
    .line 48
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    rem-int/lit16 v5, v4, 0x80

    .line 51
    .line 52
    sput v5, LVa/C8;->f:I

    .line 53
    .line 54
    rem-int/lit8 v4, v4, 0x2

    .line 55
    .line 56
    if-nez v4, :cond_1

    .line 57
    .line 58
    iget-object v2, v3, LVa/C8;->d:LVa/J8;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    throw v2

    .line 62
    :cond_2
    :goto_1
    if-eqz v2, :cond_3

    .line 63
    .line 64
    invoke-virtual {v2}, LVa/J8;->e()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    filled-new-array {v2}, [Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {p1, v2}, LVa/x8;->g(Ljava/util/List;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    invoke-virtual {v1, p1, p2}, LVa/y8;->b(LVa/x8;LVa/y7;)LVa/s8;

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    new-instance p1, LVa/s8;

    .line 84
    .line 85
    invoke-direct {p1, v2}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    .line 1
    iget-object v0, p0, LVa/e9;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, ""

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v2, v2, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    int-to-short v4, v4

    .line 16
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    shr-int/lit8 v5, v5, 0x10

    .line 21
    .line 22
    const v6, 0x513dbd58

    .line 23
    .line 24
    .line 25
    sub-int/2addr v6, v5

    .line 26
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    shr-int/lit8 v5, v5, 0x10

    .line 31
    .line 32
    rsub-int/lit8 v5, v5, -0x5b

    .line 33
    .line 34
    const v7, 0x7527b58b

    .line 35
    .line 36
    .line 37
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    add-int/2addr v8, v7

    .line 42
    const v7, 0x100007d

    .line 43
    .line 44
    .line 45
    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    add-int/2addr v9, v7

    .line 50
    int-to-byte v7, v9

    .line 51
    invoke-static {v4, v6, v5, v8, v7}, LVa/e9;->e(SIIIB)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    const/4 v5, 0x0

    .line 67
    cmpl-float v4, v4, v5

    .line 68
    .line 69
    rsub-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    int-to-short v4, v4

    .line 72
    invoke-static {v3, v3}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 73
    .line 74
    .line 75
    move-result-wide v5

    .line 76
    const-wide/16 v7, 0x0

    .line 77
    .line 78
    cmp-long v5, v5, v7

    .line 79
    .line 80
    const v6, 0x513dbd0f

    .line 81
    .line 82
    .line 83
    add-int/2addr v5, v6

    .line 84
    const/16 v6, 0x30

    .line 85
    .line 86
    invoke-static {v2, v6, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    rsub-int/lit8 v2, v2, -0x5e

    .line 91
    .line 92
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    shr-int/lit8 v6, v6, 0x10

    .line 97
    .line 98
    const v9, 0x7527b58e

    .line 99
    .line 100
    .line 101
    sub-int/2addr v9, v6

    .line 102
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    shr-int/lit8 v6, v6, 0x10

    .line 107
    .line 108
    rsub-int/lit8 v6, v6, -0xd

    .line 109
    .line 110
    int-to-byte v6, v6

    .line 111
    invoke-static {v4, v5, v2, v9, v6}, LVa/e9;->e(SIIIB)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-static {v2, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    shr-int/lit8 v0, v0, 0x10

    .line 131
    .line 132
    int-to-short v0, v0

    .line 133
    invoke-static {v3}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 134
    .line 135
    .line 136
    move-result-wide v4

    .line 137
    cmp-long v2, v4, v7

    .line 138
    .line 139
    const v4, 0x513dbd1d

    .line 140
    .line 141
    .line 142
    sub-int/2addr v4, v2

    .line 143
    invoke-static {v3, v3}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    add-int/lit8 v2, v2, -0x5e

    .line 148
    .line 149
    invoke-static {v3}, Landroid/os/Process;->getThreadPriority(I)I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    add-int/lit8 v3, v3, 0x14

    .line 154
    .line 155
    shr-int/lit8 v3, v3, 0x6

    .line 156
    .line 157
    const v5, 0x7527b58f

    .line 158
    .line 159
    .line 160
    add-int/2addr v3, v5

    .line 161
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 162
    .line 163
    .line 164
    move-result-wide v5

    .line 165
    cmp-long v5, v5, v7

    .line 166
    .line 167
    add-int/lit8 v5, v5, 0x3e

    .line 168
    .line 169
    int-to-byte v5, v5

    .line 170
    invoke-static {v0, v4, v2, v3, v5}, LVa/e9;->e(SIIIB)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    return-object v0
.end method
