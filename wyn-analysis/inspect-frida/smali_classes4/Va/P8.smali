.class public final LVa/P8;
.super LVa/M8;
.source "SourceFile"


# static fields
.field public static final l:[C

.field public static m:I = 0x0

.field public static n:I = 0x1

.field public static final o:[B

.field public static p:I = 0x0

.field public static q:I = 0x1

.field public static final r:[C

.field public static s:I


# instance fields
.field public final synthetic k:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    new-array v2, v2, [C

    .line 5
    .line 6
    fill-array-data v2, :array_0

    .line 7
    .line 8
    .line 9
    sput-object v2, LVa/P8;->l:[C

    .line 10
    .line 11
    new-array v2, v0, [B

    .line 12
    .line 13
    aput-byte v1, v2, v1

    .line 14
    .line 15
    sput-object v2, LVa/P8;->o:[B

    .line 16
    .line 17
    new-array v0, v0, [C

    .line 18
    .line 19
    const/16 v2, 0xc2

    .line 20
    .line 21
    aput-char v2, v0, v1

    .line 22
    .line 23
    sput-object v0, LVa/P8;->r:[C

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :array_0
    .array-data 2
        0x1fs
        0x3ds
    .end array-data
.end method

.method public synthetic constructor <init>(LVa/y8;LVa/y8;I)V
    .locals 0

    .line 1
    iput p3, p0, LVa/P8;->k:I

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, LVa/N8;-><init>(LVa/y8;LVa/y8;I)V

    return-void
.end method

.method private final m()Ljava/lang/String;
    .locals 14

    .line 1
    sget v0, LVa/P8;->n:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x63

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/P8;->m:I

    .line 8
    .line 9
    const-string v0, "\u0000\u0001"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x2

    .line 13
    const/4 v3, 0x1

    .line 14
    filled-new-array {v1, v2, v1, v3}, [I

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const-string v5, "ISO-8859-1"

    .line 19
    .line 20
    invoke-virtual {v0, v5}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, [B

    .line 25
    .line 26
    sget-object v5, LVa/Ab;->z:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v5

    .line 29
    :try_start_0
    aget v6, v4, v1

    .line 30
    .line 31
    aget v7, v4, v3

    .line 32
    .line 33
    aget v8, v4, v2

    .line 34
    .line 35
    const/4 v9, 0x3

    .line 36
    aget v9, v4, v9

    .line 37
    .line 38
    sget-object v10, LVa/P8;->l:[C

    .line 39
    .line 40
    new-array v11, v7, [C

    .line 41
    .line 42
    invoke-static {v10, v6, v11, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 43
    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    new-array v6, v7, [C

    .line 48
    .line 49
    sput v1, LVa/Ab;->y:I

    .line 50
    .line 51
    move v10, v1

    .line 52
    :goto_0
    sget v12, LVa/Ab;->y:I

    .line 53
    .line 54
    if-ge v12, v7, :cond_1

    .line 55
    .line 56
    aget-byte v13, v0, v12

    .line 57
    .line 58
    if-ne v13, v3, :cond_0

    .line 59
    .line 60
    aget-char v13, v11, v12

    .line 61
    .line 62
    shl-int/2addr v13, v3

    .line 63
    add-int/2addr v13, v3

    .line 64
    sub-int/2addr v13, v10

    .line 65
    int-to-char v10, v13

    .line 66
    aput-char v10, v6, v12

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    goto :goto_4

    .line 71
    :cond_0
    aget-char v13, v11, v12

    .line 72
    .line 73
    shl-int/2addr v13, v3

    .line 74
    sub-int/2addr v13, v10

    .line 75
    int-to-char v10, v13

    .line 76
    aput-char v10, v6, v12

    .line 77
    .line 78
    :goto_1
    aget-char v10, v6, v12

    .line 79
    .line 80
    add-int/lit8 v12, v12, 0x1

    .line 81
    .line 82
    sput v12, LVa/Ab;->y:I

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move-object v11, v6

    .line 86
    :cond_2
    if-lez v9, :cond_3

    .line 87
    .line 88
    new-array v0, v7, [C

    .line 89
    .line 90
    invoke-static {v11, v1, v0, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 91
    .line 92
    .line 93
    sub-int v6, v7, v9

    .line 94
    .line 95
    invoke-static {v0, v1, v11, v6, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v9, v11, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 99
    .line 100
    .line 101
    :cond_3
    new-array v0, v7, [C

    .line 102
    .line 103
    sput v1, LVa/Ab;->y:I

    .line 104
    .line 105
    :goto_2
    sget v6, LVa/Ab;->y:I

    .line 106
    .line 107
    if-ge v6, v7, :cond_4

    .line 108
    .line 109
    sub-int v9, v7, v6

    .line 110
    .line 111
    sub-int/2addr v9, v3

    .line 112
    aget-char v9, v11, v9

    .line 113
    .line 114
    aput-char v9, v0, v6

    .line 115
    .line 116
    add-int/lit8 v6, v6, 0x1

    .line 117
    .line 118
    sput v6, LVa/Ab;->y:I

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    if-lez v8, :cond_5

    .line 122
    .line 123
    sput v1, LVa/Ab;->y:I

    .line 124
    .line 125
    :goto_3
    sget v1, LVa/Ab;->y:I

    .line 126
    .line 127
    if-ge v1, v7, :cond_5

    .line 128
    .line 129
    aget-char v3, v0, v1

    .line 130
    .line 131
    aget v6, v4, v2

    .line 132
    .line 133
    sub-int/2addr v3, v6

    .line 134
    int-to-char v3, v3

    .line 135
    aput-char v3, v0, v1

    .line 136
    .line 137
    add-int/lit8 v1, v1, 0x1

    .line 138
    .line 139
    sput v1, LVa/Ab;->y:I

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_5
    new-instance v1, Ljava/lang/String;

    .line 143
    .line 144
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    .line 145
    .line 146
    .line 147
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    sget v1, LVa/P8;->n:I

    .line 153
    .line 154
    add-int/lit8 v1, v1, 0x29

    .line 155
    .line 156
    rem-int/lit16 v1, v1, 0x80

    .line 157
    .line 158
    sput v1, LVa/P8;->m:I

    .line 159
    .line 160
    return-object v0

    .line 161
    :goto_4
    monitor-exit v5

    .line 162
    throw v0
.end method

.method private final n()Ljava/lang/String;
    .locals 11

    .line 1
    sget v0, LVa/P8;->q:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0xd

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/P8;->p:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0, v0}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    rsub-int/lit8 v1, v1, -0x76

    .line 15
    .line 16
    int-to-short v1, v1

    .line 17
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    shr-int/lit8 v2, v2, 0x10

    .line 22
    .line 23
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    shr-int/lit8 v3, v3, 0x10

    .line 28
    .line 29
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    shr-int/lit8 v4, v4, 0x10

    .line 34
    .line 35
    const v5, -0x37387d27

    .line 36
    .line 37
    .line 38
    add-int/2addr v5, v4

    .line 39
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    rsub-int/lit8 v6, v6, -0xd

    .line 44
    .line 45
    int-to-byte v6, v6

    .line 46
    sget-object v7, LVa/pb;->J:Ljava/lang/Object;

    .line 47
    .line 48
    monitor-enter v7

    .line 49
    :try_start_0
    new-instance v8, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const/4 v9, 0x1

    .line 55
    rsub-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    const/4 v10, -0x1

    .line 58
    if-ne v3, v10, :cond_0

    .line 59
    .line 60
    move v0, v9

    .line 61
    :cond_0
    if-eqz v0, :cond_1

    .line 62
    .line 63
    sget-object v3, LVa/P8;->o:[B

    .line 64
    .line 65
    aget-byte v3, v3, v4

    .line 66
    .line 67
    add-int/lit8 v3, v3, 0x55

    .line 68
    .line 69
    int-to-byte v3, v3

    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    goto :goto_2

    .line 73
    :cond_1
    :goto_0
    if-lez v3, :cond_2

    .line 74
    .line 75
    add-int/2addr v5, v3

    .line 76
    const v4, -0x37387d25

    .line 77
    .line 78
    .line 79
    sub-int/2addr v5, v4

    .line 80
    add-int/2addr v5, v0

    .line 81
    sput v5, LVa/pb;->F:I

    .line 82
    .line 83
    sput-byte v6, LVa/pb;->G:B

    .line 84
    .line 85
    add-int/lit8 v2, v2, 0x3c

    .line 86
    .line 87
    int-to-char v0, v2

    .line 88
    sput-char v0, LVa/pb;->H:C

    .line 89
    .line 90
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    sget-char v0, LVa/pb;->H:C

    .line 94
    .line 95
    sput-char v0, LVa/pb;->I:C

    .line 96
    .line 97
    sput v9, LVa/pb;->E:I

    .line 98
    .line 99
    :goto_1
    sget v0, LVa/pb;->E:I

    .line 100
    .line 101
    if-ge v0, v3, :cond_2

    .line 102
    .line 103
    sget-object v0, LVa/P8;->o:[B

    .line 104
    .line 105
    sget v2, LVa/pb;->F:I

    .line 106
    .line 107
    add-int/lit8 v4, v2, -0x1

    .line 108
    .line 109
    sput v4, LVa/pb;->F:I

    .line 110
    .line 111
    aget-byte v0, v0, v2

    .line 112
    .line 113
    sget-char v2, LVa/pb;->I:C

    .line 114
    .line 115
    add-int/2addr v0, v1

    .line 116
    int-to-byte v0, v0

    .line 117
    sget-byte v4, LVa/pb;->G:B

    .line 118
    .line 119
    xor-int/2addr v0, v4

    .line 120
    add-int/2addr v2, v0

    .line 121
    int-to-char v0, v2

    .line 122
    sput-char v0, LVa/pb;->H:C

    .line 123
    .line 124
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    sget-char v0, LVa/pb;->H:C

    .line 128
    .line 129
    sput-char v0, LVa/pb;->I:C

    .line 130
    .line 131
    sget v0, LVa/pb;->E:I

    .line 132
    .line 133
    add-int/2addr v0, v9

    .line 134
    sput v0, LVa/pb;->E:I

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_2
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sget v1, LVa/P8;->p:I

    .line 147
    .line 148
    add-int/lit8 v1, v1, 0x21

    .line 149
    .line 150
    rem-int/lit16 v1, v1, 0x80

    .line 151
    .line 152
    sput v1, LVa/P8;->q:I

    .line 153
    .line 154
    return-object v0

    .line 155
    :goto_2
    monitor-exit v7

    .line 156
    throw v0
.end method

.method private final o()Ljava/lang/String;
    .locals 7

    .line 1
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shr-int/lit8 v0, v0, 0x10

    .line 6
    .line 7
    rsub-int/lit8 v0, v0, 0x7f

    .line 8
    .line 9
    const-string v1, "\u0081"

    .line 10
    .line 11
    const-string v2, "ISO-8859-1"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v2, LVa/a;->x:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter v2

    .line 20
    :try_start_0
    sget-object v3, LVa/P8;->r:[C

    .line 21
    .line 22
    array-length v4, v1

    .line 23
    sput v4, LVa/a;->w:I

    .line 24
    .line 25
    new-array v4, v4, [C

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    sput v5, LVa/a;->v:I

    .line 29
    .line 30
    :goto_0
    sget v5, LVa/a;->v:I

    .line 31
    .line 32
    sget v6, LVa/a;->w:I

    .line 33
    .line 34
    if-ge v5, v6, :cond_0

    .line 35
    .line 36
    add-int/lit8 v6, v6, -0x1

    .line 37
    .line 38
    sub-int/2addr v6, v5

    .line 39
    aget-byte v6, v1, v6

    .line 40
    .line 41
    add-int/2addr v6, v0

    .line 42
    aget-char v6, v3, v6

    .line 43
    .line 44
    add-int/lit16 v6, v6, -0x84

    .line 45
    .line 46
    int-to-char v6, v6

    .line 47
    aput-char v6, v4, v5

    .line 48
    .line 49
    add-int/lit8 v5, v5, 0x1

    .line 50
    .line 51
    sput v5, LVa/a;->v:I

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 57
    .line 58
    invoke-direct {v0, v4}, Ljava/lang/String;-><init>([C)V

    .line 59
    .line 60
    .line 61
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    return-object v0

    .line 67
    :goto_1
    monitor-exit v2

    .line 68
    throw v0
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 14

    .line 1
    iget v0, p0, LVa/P8;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, ""

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, v0, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x2

    .line 14
    rsub-int/lit8 v0, v0, 0x2

    .line 15
    .line 16
    const-string v3, "\u3ee1\uce47"

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    sget-object v4, LVa/Ab;->F:Ljava/lang/Object;

    .line 23
    .line 24
    monitor-enter v4

    .line 25
    :try_start_0
    array-length v5, v3

    .line 26
    new-array v5, v5, [C

    .line 27
    .line 28
    sput v1, LVa/Ab;->E:I

    .line 29
    .line 30
    new-array v2, v2, [C

    .line 31
    .line 32
    :goto_0
    sget v6, LVa/Ab;->E:I

    .line 33
    .line 34
    array-length v7, v3

    .line 35
    if-ge v6, v7, :cond_1

    .line 36
    .line 37
    aget-char v7, v3, v6

    .line 38
    .line 39
    aput-char v7, v2, v1

    .line 40
    .line 41
    add-int/lit8 v6, v6, 0x1

    .line 42
    .line 43
    aget-char v6, v3, v6

    .line 44
    .line 45
    const/4 v7, 0x1

    .line 46
    aput-char v6, v2, v7

    .line 47
    .line 48
    const v6, 0xe370

    .line 49
    .line 50
    .line 51
    move v8, v1

    .line 52
    :goto_1
    const/16 v9, 0x10

    .line 53
    .line 54
    if-ge v8, v9, :cond_0

    .line 55
    .line 56
    aget-char v9, v2, v7

    .line 57
    .line 58
    aget-char v10, v2, v1

    .line 59
    .line 60
    add-int v11, v10, v6

    .line 61
    .line 62
    shl-int/lit8 v12, v10, 0x4

    .line 63
    .line 64
    const v13, 0xf042

    .line 65
    .line 66
    .line 67
    add-int/2addr v12, v13

    .line 68
    xor-int/2addr v11, v12

    .line 69
    ushr-int/lit8 v12, v10, 0x5

    .line 70
    .line 71
    add-int/lit16 v12, v12, 0x26a3

    .line 72
    .line 73
    xor-int/2addr v11, v12

    .line 74
    sub-int/2addr v9, v11

    .line 75
    int-to-char v9, v9

    .line 76
    aput-char v9, v2, v7

    .line 77
    .line 78
    add-int v11, v9, v6

    .line 79
    .line 80
    shl-int/lit8 v12, v9, 0x4

    .line 81
    .line 82
    const v13, 0x9641

    .line 83
    .line 84
    .line 85
    add-int/2addr v12, v13

    .line 86
    xor-int/2addr v11, v12

    .line 87
    ushr-int/lit8 v9, v9, 0x5

    .line 88
    .line 89
    add-int/lit16 v9, v9, 0x4443

    .line 90
    .line 91
    xor-int/2addr v9, v11

    .line 92
    sub-int/2addr v10, v9

    .line 93
    int-to-char v9, v10

    .line 94
    aput-char v9, v2, v1

    .line 95
    .line 96
    const v9, 0x9e37

    .line 97
    .line 98
    .line 99
    sub-int/2addr v6, v9

    .line 100
    add-int/lit8 v8, v8, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :catchall_0
    move-exception v0

    .line 104
    goto :goto_2

    .line 105
    :cond_0
    sget v6, LVa/Ab;->E:I

    .line 106
    .line 107
    aget-char v8, v2, v1

    .line 108
    .line 109
    aput-char v8, v5, v6

    .line 110
    .line 111
    add-int/lit8 v8, v6, 0x1

    .line 112
    .line 113
    aget-char v7, v2, v7

    .line 114
    .line 115
    aput-char v7, v5, v8

    .line 116
    .line 117
    add-int/lit8 v6, v6, 0x2

    .line 118
    .line 119
    sput v6, LVa/Ab;->E:I

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_1
    new-instance v2, Ljava/lang/String;

    .line 123
    .line 124
    invoke-direct {v2, v5, v1, v0}, Ljava/lang/String;-><init>([CII)V

    .line 125
    .line 126
    .line 127
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    return-object v0

    .line 133
    :goto_2
    monitor-exit v4

    .line 134
    throw v0

    .line 135
    :pswitch_0
    invoke-direct {p0}, LVa/P8;->o()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    return-object v0

    .line 140
    :pswitch_1
    invoke-direct {p0}, LVa/P8;->n()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    return-object v0

    .line 145
    :pswitch_2
    invoke-direct {p0}, LVa/P8;->m()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    return-object v0

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final l(I)Z
    .locals 2

    .line 1
    iget v0, p0, LVa/P8;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-gtz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    return p1

    .line 12
    :pswitch_0
    sget v0, LVa/P8;->s:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0xf

    .line 15
    .line 16
    rem-int/lit16 v0, v0, 0x80

    .line 17
    .line 18
    if-lez p1, :cond_2

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x2d

    .line 21
    .line 22
    rem-int/lit16 p1, v0, 0x80

    .line 23
    .line 24
    sput p1, LVa/P8;->s:I

    .line 25
    .line 26
    rem-int/lit8 v0, v0, 0x2

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    throw p1

    .line 34
    :cond_2
    const/4 p1, 0x0

    .line 35
    :goto_1
    return p1

    .line 36
    :pswitch_1
    sget v0, LVa/P8;->p:I

    .line 37
    .line 38
    add-int/lit8 v1, v0, 0xd

    .line 39
    .line 40
    rem-int/lit16 v1, v1, 0x80

    .line 41
    .line 42
    sput v1, LVa/P8;->q:I

    .line 43
    .line 44
    if-gez p1, :cond_3

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1b

    .line 47
    .line 48
    rem-int/lit16 v1, v1, 0x80

    .line 49
    .line 50
    sput v1, LVa/P8;->p:I

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0xb

    .line 53
    .line 54
    rem-int/lit16 v1, v1, 0x80

    .line 55
    .line 56
    sput v1, LVa/P8;->q:I

    .line 57
    .line 58
    const/4 p1, 0x1

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    add-int/lit8 v0, v0, 0x27

    .line 61
    .line 62
    rem-int/lit16 v0, v0, 0x80

    .line 63
    .line 64
    sput v0, LVa/P8;->q:I

    .line 65
    .line 66
    const/4 p1, 0x0

    .line 67
    :goto_2
    return p1

    .line 68
    :pswitch_2
    const/4 v0, 0x0

    .line 69
    if-ltz p1, :cond_5

    .line 70
    .line 71
    sget p1, LVa/P8;->n:I

    .line 72
    .line 73
    add-int/lit8 p1, p1, 0x15

    .line 74
    .line 75
    rem-int/lit16 v1, p1, 0x80

    .line 76
    .line 77
    sput v1, LVa/P8;->m:I

    .line 78
    .line 79
    rem-int/lit8 p1, p1, 0x2

    .line 80
    .line 81
    const/4 v1, 0x1

    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    const/16 p1, 0x2b

    .line 85
    .line 86
    div-int/2addr p1, v0

    .line 87
    :cond_4
    move v0, v1

    .line 88
    goto :goto_3

    .line 89
    :cond_5
    sget p1, LVa/P8;->m:I

    .line 90
    .line 91
    add-int/lit8 p1, p1, 0x5f

    .line 92
    .line 93
    rem-int/lit16 v1, p1, 0x80

    .line 94
    .line 95
    sput v1, LVa/P8;->n:I

    .line 96
    .line 97
    rem-int/lit8 p1, p1, 0x2

    .line 98
    .line 99
    if-eqz p1, :cond_6

    .line 100
    .line 101
    :goto_3
    return v0

    .line 102
    :cond_6
    const/4 p1, 0x0

    .line 103
    throw p1

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
