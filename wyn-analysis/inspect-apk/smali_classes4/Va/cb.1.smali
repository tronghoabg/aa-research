.class public final LVa/cb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Ia;
.implements LVa/rb;


# static fields
.field public static d:LVa/cb; = null

.field public static final e:[C

.field public static f:I = 0x0

.field public static g:I = 0x1

.field public static final h:[C

.field public static i:I = 0x0

.field public static j:I = 0x1

.field public static k:I = 0x0

.field public static l:I = 0x1


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x1e

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/cb;->e:[C

    .line 9
    .line 10
    const/16 v0, 0x41

    .line 11
    .line 12
    new-array v0, v0, [C

    .line 13
    .line 14
    fill-array-data v0, :array_1

    .line 15
    .line 16
    .line 17
    sput-object v0, LVa/cb;->h:[C

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :array_0
    .array-data 2
        0x74s
        0x99s
        0x9cs
        0x8fs
        0x8es
        0x81s
        0xa2s
        0x90s
        0x95s
        0x79s
        0x96s
        0xa0s
        0xa1s
        0x92s
        0x9bs
        0x9fs
        0x80s
        0xa3s
        0x72s
        0x4ds
        0x94s
        0xa4s
        0x85s
        0x86s
        0x98s
        0x93s
        0x83s
        0x9ds
        0xa6s
        0xa5s
    .end array-data

    .line 22
    .line 23
    .line 24
    :array_1
    .array-data 2
        -0x5a80s
        0x5976s
        0x5c3ds
        0x53fes
        0x56a2s
        0x4a72s
        0x4917s
        0x4cfas
        0x43b4s
        0x477ds
        0x7a31s
        0x79fes
        0x53s
        -0x34cs
        -0x61fs
        -0x9e0s
        -0xc9fs
        -0x104as
        -0x130bs
        -0x16dfs
        -0x1983s
        -0x1d5bs
        -0x201as
        -0x23ces
        -0x26d4s
        -0x2a41s
        -0x2d15s
        -0x30d4s
        -0x338bs
        -0x3748s
        -0x3a1cs
        -0x3dcas
        -0x4090s
        -0x440bs
        -0x470bs
        -0x4ac8s
        -0x4d8as
        -0x5141s
        -0x540ds
        -0x57c4s
        -0x5adas
        0xef7s
        -0xdc7s
        -0x893s
        -0x755s
        0x4410s
        -0x472as
        -0x426es
        -0x6eaes
        0x6d82s
        0x68cds
        0x670ds
        0x6242s
        0x7e8cs
        0x7dc1s
        0x7849s
        0x774bs
        0x7388s
        0x4ec9s
        0x4d03s
        0x4849s
        -0x4d75s
        0x4e4ds
        -0x5d77s
        0x5e49s
    .end array-data
.end method

.method public static a(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
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
    const/16 v6, 0x12ff

    .line 100
    .line 101
    int-to-long v6, v6

    .line 102
    xor-long/2addr v4, v6

    .line 103
    long-to-int v4, v4

    .line 104
    int-to-char v4, v4

    .line 105
    aput-char v4, p3, v3

    .line 106
    .line 107
    add-int/lit8 v3, v3, 0x1

    .line 108
    .line 109
    sput v3, LVa/a;->q:I

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    goto :goto_1

    .line 114
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 115
    .line 116
    invoke-direct {p0, p3}, Ljava/lang/String;-><init>([C)V

    .line 117
    .line 118
    .line 119
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    return-object p0

    .line 121
    :goto_1
    monitor-exit v1

    .line 122
    throw p0
.end method

.method public static d(IIC)Ljava/lang/String;
    .locals 9

    .line 1
    sget-object v0, LVa/Ab;->u:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-array v1, p1, [C

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    sput v2, LVa/Ab;->t:I

    .line 8
    .line 9
    :goto_0
    sget v2, LVa/Ab;->t:I

    .line 10
    .line 11
    if-ge v2, p1, :cond_0

    .line 12
    .line 13
    sget-object v3, LVa/cb;->h:[C

    .line 14
    .line 15
    add-int v4, p0, v2

    .line 16
    .line 17
    aget-char v3, v3, v4

    .line 18
    .line 19
    int-to-long v3, v3

    .line 20
    int-to-long v5, v2

    .line 21
    const-wide v7, -0x5403742776a4033fL    # -8.352775659340511E-97

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    mul-long/2addr v5, v7

    .line 27
    xor-long/2addr v3, v5

    .line 28
    int-to-long v5, p2

    .line 29
    xor-long/2addr v3, v5

    .line 30
    long-to-int v3, v3

    .line 31
    int-to-char v3, v3

    .line 32
    aput-char v3, v1, v2

    .line 33
    .line 34
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    sput v2, LVa/Ab;->t:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 42
    .line 43
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 44
    .line 45
    .line 46
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    return-object p0

    .line 48
    :goto_1
    monitor-exit v0

    .line 49
    throw p0
.end method

.method public static e(ILjava/lang/String;)Ljava/lang/String;
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
    sget-object v1, LVa/cb;->e:[C

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
    add-int/lit8 v4, v4, -0x2d

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

.method public static f(Landroid/view/View;LVa/K7;)V
    .locals 2

    .line 1
    sget v0, LVa/cb;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x75

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/cb;->f:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x4b

    .line 14
    .line 15
    rem-int/lit16 v1, v1, 0x80

    .line 16
    .line 17
    sput v1, LVa/cb;->g:I

    .line 18
    .line 19
    invoke-static {p0, p1}, LVa/pb;->u(Landroid/view/View;LVa/X9;)V

    .line 20
    .line 21
    .line 22
    sget p0, LVa/cb;->f:I

    .line 23
    .line 24
    add-int/lit8 p0, p0, 0x53

    .line 25
    .line 26
    rem-int/lit16 p0, p0, 0x80

    .line 27
    .line 28
    sput p0, LVa/cb;->g:I

    .line 29
    .line 30
    const/16 p0, 0x5a

    .line 31
    .line 32
    div-int/lit8 p0, p0, 0x0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    add-int/lit8 v1, v1, 0x4b

    .line 36
    .line 37
    rem-int/lit16 v1, v1, 0x80

    .line 38
    .line 39
    sput v1, LVa/cb;->g:I

    .line 40
    .line 41
    invoke-static {p0, p1}, LVa/pb;->u(Landroid/view/View;LVa/X9;)V

    .line 42
    .line 43
    .line 44
    sget p0, LVa/cb;->f:I

    .line 45
    .line 46
    add-int/lit8 p0, p0, 0x53

    .line 47
    .line 48
    rem-int/lit16 p0, p0, 0x80

    .line 49
    .line 50
    sput p0, LVa/cb;->g:I

    .line 51
    .line 52
    :goto_0
    sget p0, LVa/cb;->g:I

    .line 53
    .line 54
    add-int/lit8 p0, p0, 0x3

    .line 55
    .line 56
    rem-int/lit16 p1, p0, 0x80

    .line 57
    .line 58
    sput p1, LVa/cb;->f:I

    .line 59
    .line 60
    rem-int/lit8 p0, p0, 0x2

    .line 61
    .line 62
    if-eqz p0, :cond_1

    .line 63
    .line 64
    const/16 p0, 0x27

    .line 65
    .line 66
    div-int/lit8 p0, p0, 0x0

    .line 67
    .line 68
    :cond_1
    return-void
.end method

.method public static g(Landroid/view/ViewGroup;)Z
    .locals 6

    .line 1
    sget v0, LVa/cb;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x57

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/cb;->g:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :try_start_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    move v1, v0

    .line 18
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-ge v1, v2, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    instance-of v2, v2, Landroid/widget/TextView;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    sget p0, LVa/cb;->g:I

    .line 33
    .line 34
    add-int/lit8 p0, p0, 0x1d

    .line 35
    .line 36
    rem-int/lit16 p0, p0, 0x80

    .line 37
    .line 38
    sput p0, LVa/cb;->f:I

    .line 39
    .line 40
    return v0

    .line 41
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    sget p0, LVa/cb;->f:I

    .line 47
    .line 48
    add-int/lit8 p0, p0, 0x53

    .line 49
    .line 50
    rem-int/lit16 p0, p0, 0x80

    .line 51
    .line 52
    sput p0, LVa/cb;->g:I

    .line 53
    .line 54
    const/4 p0, 0x1

    .line 55
    return p0

    .line 56
    :goto_1
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    shr-int/lit8 v1, v1, 0x8

    .line 61
    .line 62
    add-int/lit8 v1, v1, 0x7f

    .line 63
    .line 64
    const-string v2, "\u008e\u0088\u008b\u0092\u0090\u008e\u0091\u0090\u008e\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0082\u0085\u0084\u0083\u0082\u0081"

    .line 65
    .line 66
    invoke-static {v1, v2}, LVa/cb;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 75
    .line 76
    .line 77
    move-result-wide v2

    .line 78
    const-wide/16 v4, 0x0

    .line 79
    .line 80
    cmp-long v2, v2, v4

    .line 81
    .line 82
    add-int/lit8 v2, v2, 0x7e

    .line 83
    .line 84
    const-string v3, "\u008c\u0096\u008e\u008b\u009b\u008d\u009e\u008e\u0086\u0094\u009d\u0082\u008f\u0083\u0094\u008c\u008f\u008b\u0085\u008d\u008f\u0083\u0088\u0094\u009c\u0087\u0083\u0090\u0081\u0096\u008e\u008b\u009b\u0094\u009a\u008b\u0094\u0095\u008f\u008b\u0099\u0088\u008e\u0089\u0088\u0094\u0090\u0083\u0090\u0090\u0093"

    .line 85
    .line 86
    invoke-static {v2, v3}, LVa/cb;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-static {v1, v2, p0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    return v0
.end method

.method public static h(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, "\u3455\u75f7\u300a\u634d"

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
    const-wide v6, 0x634d300a75f73455L    # 2.203062613426144E170

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    xor-long/2addr v4, v6

    .line 103
    int-to-long v6, v2

    .line 104
    xor-long/2addr v4, v6

    .line 105
    xor-long/2addr v4, v6

    .line 106
    long-to-int v4, v4

    .line 107
    int-to-char v4, v4

    .line 108
    aput-char v4, p3, v3

    .line 109
    .line 110
    add-int/lit8 v3, v3, 0x1

    .line 111
    .line 112
    sput v3, LVa/a;->q:I

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :catchall_0
    move-exception p0

    .line 116
    goto :goto_1

    .line 117
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 118
    .line 119
    invoke-direct {p0, p3}, Ljava/lang/String;-><init>([C)V

    .line 120
    .line 121
    .line 122
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    return-object p0

    .line 124
    :goto_1
    monitor-exit v1

    .line 125
    throw p0
.end method

.method public static i(LVa/cb;)Ljava/lang/String;
    .locals 5

    .line 1
    sget v0, LVa/cb;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/cb;->k:I

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    shr-int/lit8 v1, v1, 0x10

    .line 22
    .line 23
    rsub-int v1, v1, 0x6f99

    .line 24
    .line 25
    int-to-char v1, v1

    .line 26
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    shr-int/lit8 v2, v2, 0x10

    .line 31
    .line 32
    const-string v3, "\u4a99\u15f7\u9909\uc86f"

    .line 33
    .line 34
    const-string v4, "\ucac4\ub657\ue981\u3d0e\ufdf2\u4f6a\u8cad\u2004\ue76a\uf193\u75b1\u5000\ua0cf\u1a94"

    .line 35
    .line 36
    invoke-static {v1, v3, v4, v2}, LVa/cb;->a(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, LVa/cb;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    shr-int/lit8 p0, p0, 0x10

    .line 59
    .line 60
    const v1, 0x9f95

    .line 61
    .line 62
    .line 63
    sub-int/2addr v1, p0

    .line 64
    int-to-char p0, v1

    .line 65
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    shr-int/lit8 v1, v1, 0x8

    .line 70
    .line 71
    const v2, -0x27d82bae

    .line 72
    .line 73
    .line 74
    sub-int/2addr v2, v1

    .line 75
    const-string v1, "\u52bb\u27d4\u95d8\u679f"

    .line 76
    .line 77
    const-string v3, "\u3510"

    .line 78
    .line 79
    invoke-static {p0, v1, v3, v2}, LVa/cb;->a(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    sget v0, LVa/cb;->k:I

    .line 95
    .line 96
    add-int/lit8 v0, v0, 0x11

    .line 97
    .line 98
    rem-int/lit16 v1, v0, 0x80

    .line 99
    .line 100
    sput v1, LVa/cb;->l:I

    .line 101
    .line 102
    rem-int/lit8 v0, v0, 0x2

    .line 103
    .line 104
    const/4 v2, 0x0

    .line 105
    if-eqz v0, :cond_1

    .line 106
    .line 107
    add-int/lit8 v1, v1, 0x15

    .line 108
    .line 109
    rem-int/lit16 v0, v1, 0x80

    .line 110
    .line 111
    sput v0, LVa/cb;->k:I

    .line 112
    .line 113
    rem-int/lit8 v1, v1, 0x2

    .line 114
    .line 115
    if-nez v1, :cond_0

    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_0
    throw v2

    .line 119
    :cond_1
    throw v2
.end method

.method public static j(LVa/cb;LVa/Sa;)Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, LVa/cb;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/cb;->k:I

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget v0, LVa/cb;->l:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x39

    .line 15
    .line 16
    rem-int/lit16 v0, v0, 0x80

    .line 17
    .line 18
    sput v0, LVa/cb;->k:I

    .line 19
    .line 20
    iget-object p1, p1, LVa/Sa;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, LVa/cb;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget p1, LVa/cb;->k:I

    .line 27
    .line 28
    add-int/lit8 v0, p1, 0x59

    .line 29
    .line 30
    rem-int/lit16 v1, v0, 0x80

    .line 31
    .line 32
    sput v1, LVa/cb;->l:I

    .line 33
    .line 34
    rem-int/lit8 v0, v0, 0x2

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    add-int/lit8 p1, p1, 0x17

    .line 40
    .line 41
    rem-int/lit16 v0, p1, 0x80

    .line 42
    .line 43
    sput v0, LVa/cb;->l:I

    .line 44
    .line 45
    rem-int/lit8 p1, p1, 0x2

    .line 46
    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_0
    throw v1

    .line 51
    :cond_1
    throw v1
.end method

.method public static m(LVa/cb;Landroid/view/ViewGroup;LVa/ab;)V
    .locals 5

    .line 1
    sget v0, LVa/cb;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0xf

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/cb;->g:I

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p1, :cond_3

    .line 14
    .line 15
    sget v1, LVa/cb;->g:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0xb

    .line 18
    .line 19
    rem-int/lit16 v2, v1, 0x80

    .line 20
    .line 21
    sput v2, LVa/cb;->f:I

    .line 22
    .line 23
    rem-int/lit8 v1, v1, 0x2

    .line 24
    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    invoke-static {p1}, LVa/cb;->g(Landroid/view/ViewGroup;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    invoke-static {p1}, LVa/Bb;->b(Landroid/view/View;)Landroid/app/Activity;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {}, LVa/ib;->d()LVa/ib;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    monitor-enter v2

    .line 43
    :try_start_0
    sget-object v3, LVa/hb;->b:LVa/hb;

    .line 44
    .line 45
    invoke-virtual {v2, v1}, LVa/ib;->e(Landroid/app/Activity;)LVa/hb;

    .line 46
    .line 47
    .line 48
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    monitor-exit v2

    .line 50
    if-ne v3, v4, :cond_1

    .line 51
    .line 52
    const v1, 0x9951914

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-nez v1, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, LVa/cb;->y(Landroid/view/ViewGroup;LVa/ab;)V

    .line 62
    .line 63
    .line 64
    sget p0, LVa/cb;->f:I

    .line 65
    .line 66
    add-int/lit8 p0, p0, 0x27

    .line 67
    .line 68
    :goto_0
    rem-int/lit16 p0, p0, 0x80

    .line 69
    .line 70
    sput p0, LVa/cb;->g:I

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-static {}, LVa/ib;->d()LVa/ib;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2, v1}, LVa/ib;->c(Landroid/app/Activity;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    const/4 v2, 0x1

    .line 82
    xor-int/2addr v1, v2

    .line 83
    if-eq v1, v2, :cond_3

    .line 84
    .line 85
    invoke-virtual {p0, p1, p2}, LVa/cb;->q(Landroid/view/ViewGroup;LVa/ab;)V

    .line 86
    .line 87
    .line 88
    sget p0, LVa/cb;->f:I

    .line 89
    .line 90
    add-int/lit8 p0, p0, 0x59

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :catchall_0
    move-exception p0

    .line 94
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    throw p0

    .line 96
    :cond_2
    invoke-static {p1}, LVa/cb;->g(Landroid/view/ViewGroup;)Z

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    :cond_3
    :goto_1
    sget p0, LVa/cb;->g:I

    .line 101
    .line 102
    add-int/lit8 p0, p0, 0x9

    .line 103
    .line 104
    rem-int/lit16 p1, p0, 0x80

    .line 105
    .line 106
    sput p1, LVa/cb;->f:I

    .line 107
    .line 108
    rem-int/lit8 p0, p0, 0x2

    .line 109
    .line 110
    if-nez p0, :cond_4

    .line 111
    .line 112
    return-void

    .line 113
    :cond_4
    throw v0
.end method

.method public static synthetic o(LVa/cb;)LVa/Ra;
    .locals 2

    .line 1
    sget v0, LVa/cb;->k:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/cb;->l:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object p0, p0, LVa/cb;->c:Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p0, LVa/Ra;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    throw p0
.end method

.method public static declared-synchronized p()LVa/cb;
    .locals 10

    .line 1
    const-class v1, LVa/cb;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    sget v0, LVa/cb;->g:I

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x77

    .line 7
    .line 8
    rem-int/lit16 v2, v0, 0x80

    .line 9
    .line 10
    sput v2, LVa/cb;->f:I

    .line 11
    .line 12
    rem-int/lit8 v0, v0, 0x2

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    sget-object v0, LVa/cb;->d:LVa/cb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    .line 18
    const/16 v2, 0x4d

    .line 19
    .line 20
    :try_start_1
    div-int/lit8 v2, v2, 0x0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    :try_start_2
    throw v0

    .line 27
    :catchall_1
    move-exception v0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    sget-object v0, LVa/cb;->d:LVa/cb;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    :goto_0
    new-instance v0, LVa/cb;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v2, Ljava/util/WeakHashMap;

    .line 39
    .line 40
    invoke-direct {v2}, Ljava/util/WeakHashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v2, v0, LVa/cb;->b:Ljava/lang/Object;

    .line 44
    .line 45
    new-instance v3, LVa/ta;

    .line 46
    .line 47
    const-wide/16 v6, -0x1

    .line 48
    .line 49
    const-wide/16 v8, -0x1

    .line 50
    .line 51
    const/4 v4, -0x1

    .line 52
    const/4 v5, -0x1

    .line 53
    invoke-direct/range {v3 .. v9}, LVa/ta;-><init>(IIJJ)V

    .line 54
    .line 55
    .line 56
    iput-object v3, v0, LVa/cb;->c:Ljava/lang/Object;

    .line 57
    .line 58
    sput-object v0, LVa/cb;->d:LVa/cb;

    .line 59
    .line 60
    sget v0, LVa/cb;->g:I

    .line 61
    .line 62
    add-int/lit8 v0, v0, 0x4f

    .line 63
    .line 64
    rem-int/lit16 v0, v0, 0x80

    .line 65
    .line 66
    sput v0, LVa/cb;->f:I

    .line 67
    .line 68
    :cond_1
    sget-object v0, LVa/cb;->d:LVa/cb;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 69
    .line 70
    monitor-exit v1

    .line 71
    return-object v0

    .line 72
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 73
    throw v0
.end method

.method public static s(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Landroid/view/ViewGroup;
    .locals 4

    .line 1
    sget v0, LVa/cb;->g:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1d

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, LVa/cb;->f:I

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x2f

    .line 12
    .line 13
    rem-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    sput v0, LVa/cb;->f:I

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    move-object v0, p1

    .line 19
    :goto_0
    if-eqz p1, :cond_4

    .line 20
    .line 21
    sget v1, LVa/cb;->g:I

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x13

    .line 24
    .line 25
    rem-int/lit16 v2, v1, 0x80

    .line 26
    .line 27
    sput v2, LVa/cb;->f:I

    .line 28
    .line 29
    rem-int/lit8 v1, v1, 0x2

    .line 30
    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-ne v1, p0, :cond_2

    .line 38
    .line 39
    if-ne v0, p1, :cond_1

    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_1
    return-object v0

    .line 43
    :cond_2
    instance-of v0, v1, Landroid/view/ViewGroup;

    .line 44
    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    move-object v0, v1

    .line 48
    check-cast v0, Landroid/view/ViewGroup;

    .line 49
    .line 50
    move-object v3, v0

    .line 51
    move-object v0, p1

    .line 52
    move-object p1, v3

    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    throw p0

    .line 59
    :cond_4
    return-object p1
.end method

.method public static synthetic u(LVa/cb;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget v0, LVa/cb;->l:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5f

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/cb;->k:I

    .line 8
    .line 9
    invoke-virtual {p0, p1}, LVa/cb;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget p1, LVa/cb;->k:I

    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x79

    .line 16
    .line 17
    rem-int/lit16 p1, p1, 0x80

    .line 18
    .line 19
    sput p1, LVa/cb;->l:I

    .line 20
    .line 21
    return-object p0
.end method


# virtual methods
.method public b(LVa/lb;Ljava/lang/String;)V
    .locals 7

    .line 1
    const/4 p2, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    sget v0, LVa/cb;->j:I

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x77

    .line 7
    .line 8
    rem-int/lit16 v1, v0, 0x80

    .line 9
    .line 10
    sput v1, LVa/cb;->i:I

    .line 11
    .line 12
    rem-int/lit8 v0, v0, 0x2

    .line 13
    .line 14
    iget-object p1, p1, LVa/lb;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, LVa/Aa;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    iget p1, p1, LVa/Aa;->a:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    throw p2

    .line 24
    :cond_1
    sget p1, LVa/cb;->i:I

    .line 25
    .line 26
    add-int/lit8 p1, p1, 0x6d

    .line 27
    .line 28
    rem-int/lit16 p1, p1, 0x80

    .line 29
    .line 30
    sput p1, LVa/cb;->j:I

    .line 31
    .line 32
    const/4 p1, -0x1

    .line 33
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    int-to-char v2, v2

    .line 44
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    const/4 v4, 0x0

    .line 49
    cmpl-float v3, v3, v4

    .line 50
    .line 51
    rsub-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    const-string v5, "\ued3c\u628e\ud8db\u329d"

    .line 54
    .line 55
    const-string v6, "\u64d2\u3e9b\u33c9\ua79b\u6cc0\uabbf\ucdaf\u6709\u5024\u5c77\u8c0c\u91a8\uc8e4\ua0f6\u843c\u4c58\u2f03\u401a\u3727\u20b8\u7263\uc7ef\u756c\u4004\ud73f\u3685\ucb8c\u8ea2\u9cb8\u35e4\uda27\u50e3\ub145\ufefb"

    .line 56
    .line 57
    invoke-static {v2, v5, v6, v3}, LVa/cb;->h(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const v2, 0xa5d2

    .line 76
    .line 77
    .line 78
    invoke-static {v1, v1, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    sub-int/2addr v2, v3

    .line 83
    int-to-char v2, v2

    .line 84
    invoke-static {v1}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    cmpl-float v3, v3, v4

    .line 89
    .line 90
    const-string v4, ""

    .line 91
    .line 92
    invoke-static {v4, v4, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    add-int/lit8 v1, v1, 0xc

    .line 97
    .line 98
    invoke-static {v3, v1, v2}, LVa/cb;->d(IIC)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-static {v1, v0}, LVa/Ab;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const/16 v0, 0x193

    .line 110
    .line 111
    if-eq p1, v0, :cond_5

    .line 112
    .line 113
    sget p1, LVa/G;->F:I

    .line 114
    .line 115
    add-int/lit8 v0, p1, 0x23

    .line 116
    .line 117
    rem-int/lit16 v0, v0, 0x80

    .line 118
    .line 119
    sput v0, LVa/G;->E:I

    .line 120
    .line 121
    iget-object v0, p0, LVa/cb;->c:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, LVa/G;

    .line 124
    .line 125
    iget v1, v0, LVa/G;->w:I

    .line 126
    .line 127
    add-int/lit8 v2, v1, 0x1

    .line 128
    .line 129
    iput v2, v0, LVa/G;->w:I

    .line 130
    .line 131
    add-int/lit8 p1, p1, 0x25

    .line 132
    .line 133
    rem-int/lit16 p1, p1, 0x80

    .line 134
    .line 135
    sput p1, LVa/G;->E:I

    .line 136
    .line 137
    add-int/lit8 p1, p1, 0x4d

    .line 138
    .line 139
    rem-int/lit16 p1, p1, 0x80

    .line 140
    .line 141
    sput p1, LVa/G;->F:I

    .line 142
    .line 143
    invoke-virtual {v0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 148
    .line 149
    .line 150
    move-result-wide v2

    .line 151
    const-wide/16 v4, 0x0

    .line 152
    .line 153
    cmp-long v2, v2, v4

    .line 154
    .line 155
    const/4 v3, 0x3

    .line 156
    add-int/2addr v2, v3

    .line 157
    const-string v4, "\ud8b1\ucd58\u271e\ud6c2"

    .line 158
    .line 159
    invoke-static {v2, v4}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    sget v2, LVa/G;->F:I

    .line 172
    .line 173
    add-int/lit8 v2, v2, 0x43

    .line 174
    .line 175
    rem-int/lit16 v3, v2, 0x80

    .line 176
    .line 177
    sput v3, LVa/G;->E:I

    .line 178
    .line 179
    rem-int/lit8 v2, v2, 0x2

    .line 180
    .line 181
    if-nez v2, :cond_4

    .line 182
    .line 183
    add-int/lit8 v3, v3, 0x3d

    .line 184
    .line 185
    rem-int/lit16 v2, v3, 0x80

    .line 186
    .line 187
    sput v2, LVa/G;->F:I

    .line 188
    .line 189
    rem-int/lit8 v3, v3, 0x2

    .line 190
    .line 191
    if-eqz v3, :cond_3

    .line 192
    .line 193
    if-ge v1, p1, :cond_5

    .line 194
    .line 195
    sget p1, LVa/cb;->j:I

    .line 196
    .line 197
    add-int/lit8 p1, p1, 0x35

    .line 198
    .line 199
    rem-int/lit16 v1, p1, 0x80

    .line 200
    .line 201
    sput v1, LVa/cb;->i:I

    .line 202
    .line 203
    rem-int/lit8 p1, p1, 0x2

    .line 204
    .line 205
    if-nez p1, :cond_2

    .line 206
    .line 207
    invoke-virtual {v0}, LVa/G;->z()I

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    invoke-virtual {p0, p1}, LVa/cb;->w(I)V

    .line 212
    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_2
    invoke-virtual {v0}, LVa/G;->z()I

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    invoke-virtual {p0, p1}, LVa/cb;->w(I)V

    .line 220
    .line 221
    .line 222
    throw p2

    .line 223
    :cond_3
    throw p2

    .line 224
    :cond_4
    throw p2

    .line 225
    :cond_5
    :goto_1
    sget p1, LVa/cb;->i:I

    .line 226
    .line 227
    add-int/lit8 p1, p1, 0x51

    .line 228
    .line 229
    rem-int/lit16 v0, p1, 0x80

    .line 230
    .line 231
    sput v0, LVa/cb;->j:I

    .line 232
    .line 233
    rem-int/lit8 p1, p1, 0x2

    .line 234
    .line 235
    if-eqz p1, :cond_6

    .line 236
    .line 237
    return-void

    .line 238
    :cond_6
    throw p2
.end method

.method public c(LVa/lb;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, LVa/cb;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, LVa/G;

    .line 8
    .line 9
    const-string v3, ""

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    const-wide/16 v6, 0x0

    .line 14
    .line 15
    const/16 v8, 0x30

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    :try_start_0
    iget-object v10, v0, LVa/lb;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v10, LVa/Aa;

    .line 21
    .line 22
    iget v11, v10, LVa/Aa;->a:I

    .line 23
    .line 24
    iget-object v10, v10, LVa/Aa;->b:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    const/16 v12, 0xc8

    .line 27
    .line 28
    if-lt v11, v12, :cond_0

    .line 29
    .line 30
    sget v12, LVa/cb;->i:I

    .line 31
    .line 32
    add-int/lit8 v12, v12, 0x9

    .line 33
    .line 34
    rem-int/lit16 v12, v12, 0x80

    .line 35
    .line 36
    sput v12, LVa/cb;->j:I

    .line 37
    .line 38
    const/16 v12, 0x12b

    .line 39
    .line 40
    if-le v11, v12, :cond_1

    .line 41
    .line 42
    :cond_0
    move/from16 v16, v4

    .line 43
    .line 44
    goto/16 :goto_2

    .line 45
    .line 46
    :cond_1
    :try_start_1
    iget-object v10, v0, LVa/lb;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v10, Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    if-nez v11, :cond_2

    .line 55
    .line 56
    new-instance v11, Lorg/json/JSONObject;

    .line 57
    .line 58
    invoke-direct {v11, v10}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    new-instance v11, Lorg/json/JSONObject;

    .line 63
    .line 64
    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 65
    .line 66
    .line 67
    :goto_0
    invoke-static {v9}, Landroid/graphics/Color;->red(I)I

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    const v12, 0xeb10

    .line 72
    .line 73
    .line 74
    sub-int/2addr v12, v10

    .line 75
    int-to-char v10, v12

    .line 76
    const-string v12, "\u1a0c\uc21b\u10a5\uedeb"

    .line 77
    .line 78
    const-string v13, "\u982d\u5a58\uf44d"

    .line 79
    .line 80
    invoke-static {v9, v9}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 81
    .line 82
    .line 83
    move-result v14

    .line 84
    const v15, -0x5a3de4e6    # -3.3672E-16f

    .line 85
    .line 86
    .line 87
    sub-int/2addr v15, v14

    .line 88
    invoke-static {v10, v12, v13, v15}, LVa/cb;->h(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    invoke-virtual {v11, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v10
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 100
    if-eqz v10, :cond_3

    .line 101
    .line 102
    sget v10, LVa/cb;->j:I

    .line 103
    .line 104
    add-int/lit8 v10, v10, 0x43

    .line 105
    .line 106
    rem-int/lit16 v10, v10, 0x80

    .line 107
    .line 108
    sput v10, LVa/cb;->i:I

    .line 109
    .line 110
    :try_start_2
    invoke-static {}, LVa/Kb;->u()LVa/Kb;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    invoke-virtual {v10}, LVa/Kb;->l()V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :catch_0
    move-exception v0

    .line 119
    move/from16 v16, v4

    .line 120
    .line 121
    goto/16 :goto_3

    .line 122
    .line 123
    :cond_3
    :goto_1
    invoke-static {v3, v8, v9, v9}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    const v12, 0xa5d3

    .line 128
    .line 129
    .line 130
    add-int/2addr v10, v12

    .line 131
    int-to-char v10, v10

    .line 132
    invoke-static {v3}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v12

    .line 136
    add-int/2addr v12, v5

    .line 137
    invoke-static {v3}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    add-int/lit8 v13, v13, 0xc

    .line 142
    .line 143
    invoke-static {v12, v13, v10}, LVa/cb;->d(IIC)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 152
    .line 153
    .line 154
    move-result v12

    .line 155
    cmpl-float v12, v12, v4

    .line 156
    .line 157
    rsub-int/lit8 v12, v12, 0x1

    .line 158
    .line 159
    int-to-char v12, v12

    .line 160
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 161
    .line 162
    .line 163
    move-result-wide v13

    .line 164
    const-wide/16 v15, -0x1

    .line 165
    .line 166
    cmp-long v13, v13, v15

    .line 167
    .line 168
    add-int/lit8 v13, v13, 0xb

    .line 169
    .line 170
    invoke-static {v9, v9, v9}, Landroid/graphics/Color;->rgb(III)I

    .line 171
    .line 172
    .line 173
    move-result v14

    .line 174
    const v17, -0xffffe3

    .line 175
    .line 176
    .line 177
    sub-int v14, v17, v14

    .line 178
    .line 179
    invoke-static {v13, v14, v12}, LVa/cb;->d(IIC)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    invoke-virtual {v12}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    invoke-static {v10, v12, v11}, LVa/Ab;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-static {v11}, LVa/Ab;->u(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 195
    .line 196
    .line 197
    move-result v12

    .line 198
    shr-int/lit8 v12, v12, 0x10

    .line 199
    .line 200
    add-int/lit16 v12, v12, 0xe9b

    .line 201
    .line 202
    int-to-char v12, v12

    .line 203
    invoke-static {v9, v9, v9}, Landroid/graphics/Color;->rgb(III)I

    .line 204
    .line 205
    .line 206
    move-result v13

    .line 207
    const v14, -0xffffd7

    .line 208
    .line 209
    .line 210
    sub-int/2addr v14, v13

    .line 211
    invoke-static {v3, v8, v9, v9}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 212
    .line 213
    .line 214
    move-result v13

    .line 215
    rsub-int/lit8 v13, v13, 0x3

    .line 216
    .line 217
    invoke-static {v14, v13, v12}, LVa/cb;->d(IIC)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    invoke-virtual {v12}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v12

    .line 225
    invoke-virtual {v10, v12, v6, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 226
    .line 227
    .line 228
    move-result-wide v12

    .line 229
    invoke-virtual {v2, v12, v13}, LVa/G;->c0(J)V

    .line 230
    .line 231
    .line 232
    invoke-static {v9}, Landroid/graphics/Color;->red(I)I

    .line 233
    .line 234
    .line 235
    move-result v12

    .line 236
    rsub-int v12, v12, 0x4463

    .line 237
    .line 238
    int-to-char v12, v12

    .line 239
    invoke-static {v9}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 240
    .line 241
    .line 242
    move-result-wide v13

    .line 243
    cmp-long v13, v13, v6

    .line 244
    .line 245
    add-int/lit8 v13, v13, 0x2d

    .line 246
    .line 247
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 248
    .line 249
    .line 250
    move-result v14

    .line 251
    shr-int/lit8 v14, v14, 0x10

    .line 252
    .line 253
    rsub-int/lit8 v14, v14, 0x3

    .line 254
    .line 255
    invoke-static {v13, v14, v12}, LVa/cb;->d(IIC)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v12

    .line 259
    invoke-virtual {v12}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v12

    .line 263
    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    sget v12, LVa/G;->F:I

    .line 267
    .line 268
    add-int/lit8 v12, v12, 0x51

    .line 269
    .line 270
    rem-int/lit16 v12, v12, 0x80

    .line 271
    .line 272
    sput v12, LVa/G;->E:I

    .line 273
    .line 274
    iget-object v13, v2, LVa/G;->k:LVa/Ra;

    .line 275
    .line 276
    add-int/lit8 v12, v12, 0x6b

    .line 277
    .line 278
    rem-int/lit16 v12, v12, 0x80

    .line 279
    .line 280
    sput v12, LVa/G;->F:I

    .line 281
    .line 282
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 283
    .line 284
    .line 285
    move-result-wide v17

    .line 286
    cmp-long v12, v17, v15

    .line 287
    .line 288
    const v14, 0x911f

    .line 289
    .line 290
    .line 291
    add-int/2addr v12, v14

    .line 292
    int-to-char v12, v12

    .line 293
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 294
    .line 295
    .line 296
    move-result v14

    .line 297
    shr-int/lit8 v14, v14, 0x10

    .line 298
    .line 299
    add-int/2addr v14, v8

    .line 300
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 301
    .line 302
    .line 303
    move-result v15

    .line 304
    shr-int/lit8 v15, v15, 0x8

    .line 305
    .line 306
    rsub-int/lit8 v15, v15, 0xd

    .line 307
    .line 308
    invoke-static {v14, v15, v12}, LVa/cb;->d(IIC)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v12

    .line 312
    invoke-virtual {v12}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v12

    .line 316
    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v10

    .line 320
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    invoke-static {}, LVa/Ra;->k()Landroid/os/Handler;

    .line 324
    .line 325
    .line 326
    move-result-object v14

    .line 327
    new-instance v15, LVa/Qa;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 328
    .line 329
    move/from16 v16, v4

    .line 330
    .line 331
    const/4 v4, 0x0

    .line 332
    :try_start_3
    invoke-direct {v15, v4}, LVa/Qa;-><init>(I)V

    .line 333
    .line 334
    .line 335
    iput-object v13, v15, LVa/Qa;->f:LVa/Ra;

    .line 336
    .line 337
    iput-object v12, v15, LVa/Qa;->d:Ljava/lang/String;

    .line 338
    .line 339
    iput-object v10, v15, LVa/Qa;->e:Ljava/lang/String;

    .line 340
    .line 341
    invoke-virtual {v14, v15}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 342
    .line 343
    .line 344
    sget v4, LVa/Ra;->c:I

    .line 345
    .line 346
    add-int/lit8 v4, v4, 0x69

    .line 347
    .line 348
    rem-int/lit16 v4, v4, 0x80

    .line 349
    .line 350
    sput v4, LVa/Ra;->d:I

    .line 351
    .line 352
    invoke-static {v3, v3, v9, v9}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    const v10, 0xb2ff

    .line 357
    .line 358
    .line 359
    sub-int/2addr v10, v4

    .line 360
    int-to-char v4, v10

    .line 361
    invoke-static {v6, v7}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 362
    .line 363
    .line 364
    move-result v10

    .line 365
    add-int/lit8 v10, v10, 0x3e

    .line 366
    .line 367
    invoke-static {v3, v8, v9}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 368
    .line 369
    .line 370
    move-result v12

    .line 371
    add-int/lit8 v12, v12, 0x3

    .line 372
    .line 373
    invoke-static {v10, v12, v4}, LVa/cb;->d(IIC)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    invoke-static {}, LVa/pb;->g0()J

    .line 382
    .line 383
    .line 384
    move-result-wide v12

    .line 385
    invoke-virtual {v11, v4, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 386
    .line 387
    .line 388
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 389
    .line 390
    .line 391
    move-result v4

    .line 392
    shr-int/lit8 v4, v4, 0x10

    .line 393
    .line 394
    const v10, 0xa2fc

    .line 395
    .line 396
    .line 397
    add-int/2addr v4, v10

    .line 398
    int-to-char v4, v4

    .line 399
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 400
    .line 401
    .line 402
    move-result v10

    .line 403
    shr-int/lit8 v10, v10, 0x10

    .line 404
    .line 405
    rsub-int/lit8 v10, v10, 0x3f

    .line 406
    .line 407
    invoke-static {v9, v9}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 408
    .line 409
    .line 410
    move-result v12

    .line 411
    add-int/lit8 v12, v12, 0x2

    .line 412
    .line 413
    invoke-static {v10, v12, v4}, LVa/cb;->d(IIC)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    invoke-static {}, LVa/pb;->S()J

    .line 422
    .line 423
    .line 424
    move-result-wide v12

    .line 425
    invoke-virtual {v11, v4, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 426
    .line 427
    .line 428
    iget-wide v12, v0, LVa/lb;->a:J

    .line 429
    .line 430
    invoke-static {v11, v12, v13}, LVa/G;->e0(Lorg/json/JSONObject;J)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2, v11}, LVa/G;->j(Lorg/json/JSONObject;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 434
    .line 435
    .line 436
    sget v0, LVa/cb;->i:I

    .line 437
    .line 438
    add-int/lit8 v0, v0, 0xd

    .line 439
    .line 440
    rem-int/lit16 v0, v0, 0x80

    .line 441
    .line 442
    sput v0, LVa/cb;->j:I

    .line 443
    .line 444
    goto :goto_4

    .line 445
    :catch_1
    move-exception v0

    .line 446
    goto :goto_3

    .line 447
    :goto_2
    :try_start_4
    invoke-virtual {v1, v0, v10}, LVa/cb;->b(LVa/lb;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 448
    .line 449
    .line 450
    return-void

    .line 451
    :goto_3
    const v4, 0xa5d2

    .line 452
    .line 453
    .line 454
    invoke-static {v9, v9, v9}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 455
    .line 456
    .line 457
    move-result v10

    .line 458
    add-int/2addr v10, v4

    .line 459
    int-to-char v4, v10

    .line 460
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 461
    .line 462
    .line 463
    move-result v10

    .line 464
    cmpl-float v10, v10, v16

    .line 465
    .line 466
    add-int/lit8 v10, v10, -0x1

    .line 467
    .line 468
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 469
    .line 470
    .line 471
    move-result v11

    .line 472
    cmpl-float v11, v11, v16

    .line 473
    .line 474
    rsub-int/lit8 v11, v11, 0xd

    .line 475
    .line 476
    invoke-static {v10, v11, v4}, LVa/cb;->d(IIC)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v4

    .line 480
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v4

    .line 484
    invoke-static {v9}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 485
    .line 486
    .line 487
    move-result-wide v10

    .line 488
    cmp-long v10, v10, v6

    .line 489
    .line 490
    const v11, 0xbb4e

    .line 491
    .line 492
    .line 493
    add-int/2addr v10, v11

    .line 494
    int-to-char v10, v10

    .line 495
    invoke-static {v9}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 496
    .line 497
    .line 498
    move-result-wide v11

    .line 499
    cmp-long v6, v11, v6

    .line 500
    .line 501
    const-string v7, "\ubfbf\ud116\u4e96\ue1bb"

    .line 502
    .line 503
    const-string v11, "\u8f7f\u36ee\ue441\u9e7d\u2979\u25c7\ua0ad\u8e63\udd34\u6266\ub4e2\u8cf6\u9ba4\ubd23\udb60\u7883\ufa3f\ua77a\udbc5\u14c3\u993b\u3021\u5eba\uc137\uf1cc\u8a8c\u943b\u5843\uaf16\uc4da\u4697\ufb62"

    .line 504
    .line 505
    invoke-static {v10, v7, v11, v6}, LVa/cb;->h(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v6

    .line 509
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v6

    .line 513
    invoke-static {v4, v6, v0, v9, v5}, LVa/Ab;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 514
    .line 515
    .line 516
    :goto_4
    sget v0, LVa/G;->E:I

    .line 517
    .line 518
    add-int/lit8 v0, v0, 0x79

    .line 519
    .line 520
    rem-int/lit16 v4, v0, 0x80

    .line 521
    .line 522
    sput v4, LVa/G;->F:I

    .line 523
    .line 524
    rem-int/lit8 v0, v0, 0x2

    .line 525
    .line 526
    invoke-virtual {v2}, LVa/G;->x()V

    .line 527
    .line 528
    .line 529
    if-eqz v0, :cond_5

    .line 530
    .line 531
    sget v0, LVa/G;->F:I

    .line 532
    .line 533
    add-int/lit8 v0, v0, 0x33

    .line 534
    .line 535
    rem-int/lit16 v4, v0, 0x80

    .line 536
    .line 537
    sput v4, LVa/G;->E:I

    .line 538
    .line 539
    rem-int/lit8 v0, v0, 0x2

    .line 540
    .line 541
    if-eqz v0, :cond_4

    .line 542
    .line 543
    const/16 v0, 0xd

    .line 544
    .line 545
    div-int/2addr v0, v9

    .line 546
    :cond_4
    add-int/lit8 v4, v4, 0x59

    .line 547
    .line 548
    rem-int/lit16 v4, v4, 0x80

    .line 549
    .line 550
    sput v4, LVa/G;->F:I

    .line 551
    .line 552
    invoke-virtual {v2}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    const v4, -0xfffffd

    .line 557
    .line 558
    .line 559
    invoke-static {v9, v9, v9}, Landroid/graphics/Color;->rgb(III)I

    .line 560
    .line 561
    .line 562
    move-result v5

    .line 563
    sub-int/2addr v4, v5

    .line 564
    invoke-static {v3, v8, v9}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 565
    .line 566
    .line 567
    move-result v3

    .line 568
    rsub-int/lit8 v3, v3, 0x4f

    .line 569
    .line 570
    int-to-byte v3, v3

    .line 571
    const-string v5, "\u0004\u0008\u00c4"

    .line 572
    .line 573
    invoke-static {v3, v4, v5}, LVa/G;->W(BILjava/lang/String;)Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v3

    .line 581
    iget v2, v2, LVa/G;->h:I

    .line 582
    .line 583
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 584
    .line 585
    .line 586
    move-result v0

    .line 587
    sget v2, LVa/G;->E:I

    .line 588
    .line 589
    add-int/lit8 v2, v2, 0x49

    .line 590
    .line 591
    rem-int/lit16 v2, v2, 0x80

    .line 592
    .line 593
    sput v2, LVa/G;->F:I

    .line 594
    .line 595
    invoke-virtual {v1, v0}, LVa/cb;->w(I)V

    .line 596
    .line 597
    .line 598
    return-void

    .line 599
    :cond_5
    const/4 v0, 0x0

    .line 600
    throw v0
.end method

.method public k(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LVa/cb;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget v0, LVa/cb;->k:I

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x5b

    .line 23
    .line 24
    rem-int/lit16 v0, v0, 0x80

    .line 25
    .line 26
    sput v0, LVa/cb;->l:I

    .line 27
    .line 28
    return-object p1
.end method

.method public declared-synchronized l(LVa/ta;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/cb;->g:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x27

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, LVa/cb;->f:I

    .line 9
    .line 10
    iput-object p1, p0, LVa/cb;->c:Ljava/lang/Object;

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x5f

    .line 13
    .line 14
    rem-int/lit16 p1, v0, 0x80

    .line 15
    .line 16
    sput p1, LVa/cb;->g:I

    .line 17
    .line 18
    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    :try_start_2
    throw p1

    .line 28
    :catchall_1
    move-exception p1

    .line 29
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 30
    throw p1
.end method

.method public synthetic n(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v0, LVa/r8;

    .line 2
    .line 3
    sget v1, LVa/g8;->i:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x1b

    .line 6
    .line 7
    rem-int/lit16 v1, v1, 0x80

    .line 8
    .line 9
    sput v1, LVa/g8;->j:I

    .line 10
    .line 11
    iget-object v2, p0, LVa/cb;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, LVa/g8;

    .line 14
    .line 15
    iget-object v2, v2, LVa/g8;->a:Ljava/lang/String;

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x71

    .line 18
    .line 19
    rem-int/lit16 v1, v1, 0x80

    .line 20
    .line 21
    sput v1, LVa/g8;->i:I

    .line 22
    .line 23
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-object p2, p0, LVa/cb;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p2, [LVa/r8;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    aget-object v5, p2, v6

    .line 33
    .line 34
    iget-object v1, p0, LVa/cb;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    move-object v3, p1

    .line 39
    invoke-direct/range {v0 .. v5}, LVa/r8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;LVa/r8;)V

    .line 40
    .line 41
    .line 42
    aput-object v0, p2, v6

    .line 43
    .line 44
    return-object v0
.end method

.method public q(Landroid/view/ViewGroup;LVa/ab;)V
    .locals 4

    .line 1
    new-instance v0, LVa/K7;

    .line 2
    .line 3
    invoke-direct {v0}, LVa/K7;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, LVa/K7;->b:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v1, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, LVa/O;

    .line 18
    .line 19
    const/4 v3, 0x3

    .line 20
    invoke-direct {v2, v3}, LVa/O;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object p0, v2, LVa/O;->g:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object p1, v2, LVa/O;->d:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object v0, v2, LVa/O;->e:Ljava/lang/Object;

    .line 28
    .line 29
    iput-object p2, v2, LVa/O;->f:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    sget p1, LVa/cb;->g:I

    .line 35
    .line 36
    add-int/lit8 p1, p1, 0x4b

    .line 37
    .line 38
    rem-int/lit16 p2, p1, 0x80

    .line 39
    .line 40
    sput p2, LVa/cb;->f:I

    .line 41
    .line 42
    rem-int/lit8 p1, p1, 0x2

    .line 43
    .line 44
    if-nez p1, :cond_0

    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    const/4 p1, 0x0

    .line 48
    throw p1
.end method

.method public declared-synchronized r()LVa/ta;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/cb;->f:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x5b

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, LVa/cb;->g:I

    .line 9
    .line 10
    iget-object v1, p0, LVa/cb;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LVa/ta;

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x4f

    .line 15
    .line 16
    rem-int/lit16 v0, v0, 0x80

    .line 17
    .line 18
    sput v0, LVa/cb;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-object v1

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw v0
.end method

.method public t(LVa/Sa;LVa/v;)V
    .locals 3

    .line 1
    invoke-static {}, LVa/Ra;->k()Landroid/os/Handler;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LVa/Da;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2}, LVa/Da;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object p0, v1, LVa/Da;->f:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p1, v1, LVa/Da;->d:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p2, v1, LVa/Da;->e:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    sget p1, LVa/cb;->k:I

    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x1d

    .line 23
    .line 24
    rem-int/lit16 p1, p1, 0x80

    .line 25
    .line 26
    sput p1, LVa/cb;->l:I

    .line 27
    .line 28
    return-void
.end method

.method public declared-synchronized v()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/cb;->f:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x63

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, LVa/cb;->g:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, LVa/cb;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LVa/f;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    new-instance v0, LVa/f;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {v0, v1}, LVa/f;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object p0, v0, LVa/f;->b:Ljava/lang/Object;

    .line 27
    .line 28
    iput-object v0, p0, LVa/cb;->a:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {}, LVa/Za;->n()LVa/Za;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v1, p0, LVa/cb;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, LVa/f;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, LVa/Za;->p(LVa/gb;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    sget v0, LVa/cb;->f:I

    .line 45
    .line 46
    add-int/lit8 v0, v0, 0x3b

    .line 47
    .line 48
    rem-int/lit16 v1, v0, 0x80

    .line 49
    .line 50
    sput v1, LVa/cb;->g:I

    .line 51
    .line 52
    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    if-nez v0, :cond_1

    .line 55
    .line 56
    const/16 v0, 0x10

    .line 57
    .line 58
    :try_start_1
    div-int/lit8 v0, v0, 0x0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    .line 60
    monitor-exit p0

    .line 61
    return-void

    .line 62
    :catchall_1
    move-exception v0

    .line 63
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    :cond_1
    monitor-exit p0

    .line 65
    return-void

    .line 66
    :cond_2
    const/4 v0, 0x0

    .line 67
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 68
    :catchall_2
    move-exception v0

    .line 69
    :try_start_4
    throw v0

    .line 70
    :goto_1
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 71
    throw v0
.end method

.method public w(I)V
    .locals 4

    .line 1
    iget-object v0, p0, LVa/cb;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LVa/G;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, LVa/cb;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, LVa/G;

    .line 9
    .line 10
    sget v2, LVa/G;->F:I

    .line 11
    .line 12
    add-int/lit8 v3, v2, 0x41

    .line 13
    .line 14
    rem-int/lit16 v3, v3, 0x80

    .line 15
    .line 16
    sput v3, LVa/G;->E:I

    .line 17
    .line 18
    iget-object v1, v1, LVa/G;->m:Landroid/os/Handler;

    .line 19
    .line 20
    add-int/lit8 v2, v2, 0x75

    .line 21
    .line 22
    rem-int/lit16 v2, v2, 0x80

    .line 23
    .line 24
    sput v2, LVa/G;->E:I

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    new-instance v1, LVa/v;

    .line 29
    .line 30
    const/4 v2, 0x5

    .line 31
    invoke-direct {v1, v2}, LVa/v;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iput-object p0, v1, LVa/v;->d:Ljava/lang/Object;

    .line 35
    .line 36
    int-to-long v2, p1

    .line 37
    invoke-static {v1, v2, v3}, LVa/Cb;->f(LVa/Ba;J)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    return-void

    .line 45
    :goto_1
    monitor-exit v0

    .line 46
    throw p1
.end method

.method public x(Landroid/view/MotionEvent;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LVa/y;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {v0, v1}, LVa/y;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object p0, v0, LVa/y;->e:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p1, v0, LVa/y;->d:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {v0}, LVa/Cb;->j(LVa/Ba;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    sget p1, LVa/cb;->g:I

    .line 19
    .line 20
    add-int/lit8 p1, p1, 0x3b

    .line 21
    .line 22
    rem-int/lit16 v0, p1, 0x80

    .line 23
    .line 24
    sput v0, LVa/cb;->f:I

    .line 25
    .line 26
    rem-int/lit8 p1, p1, 0x2

    .line 27
    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const/4 p1, 0x0

    .line 32
    throw p1

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    const-wide/16 v2, 0x0

    .line 39
    .line 40
    cmp-long v0, v0, v2

    .line 41
    .line 42
    add-int/lit8 v0, v0, 0x7e

    .line 43
    .line 44
    const-string v1, "\u008e\u0088\u008b\u0092\u0090\u008e\u0091\u0090\u008e\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0082\u0085\u0084\u0083\u0082\u0081"

    .line 45
    .line 46
    invoke-static {v0, v1}, LVa/cb;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, ""

    .line 55
    .line 56
    invoke-static {v1}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/lit8 v1, v1, 0x7f

    .line 61
    .line 62
    const-string v2, "\u0098\u0096\u0085\u0090\u0094\u0090\u0083\u0094\u0097\u0096\u0085\u0090\u0094\u0089\u0088\u0087\u0083\u008d\u0094\u0095\u008f\u008b\u008d\u008d\u008e\u0095\u0094\u0090\u0083\u0090\u0090\u0093"

    .line 63
    .line 64
    invoke-static {v1, v2}, LVa/cb;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const/4 v2, 0x0

    .line 73
    invoke-static {v0, v1, p1, v2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public y(Landroid/view/ViewGroup;LVa/ab;)V
    .locals 4

    .line 1
    new-instance v0, LVa/bb;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, p0, v1}, LVa/bb;-><init>(LVa/cb;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 12
    .line 13
    .line 14
    monitor-enter p0

    .line 15
    :try_start_0
    iget-object v1, p0, LVa/cb;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ljava/util/WeakHashMap;

    .line 18
    .line 19
    new-instance v2, Ljava/lang/Object;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    const v1, 0x9951914

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Landroid/os/Handler;

    .line 35
    .line 36
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 41
    .line 42
    .line 43
    new-instance v2, LVa/Da;

    .line 44
    .line 45
    const/16 v3, 0x15

    .line 46
    .line 47
    invoke-direct {v2, v3}, LVa/Da;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v2, LVa/Da;->d:Ljava/lang/Object;

    .line 51
    .line 52
    iput-object v0, v2, LVa/Da;->e:Ljava/lang/Object;

    .line 53
    .line 54
    iput-object p2, v2, LVa/Da;->f:Ljava/lang/Object;

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    monitor-exit p0

    .line 62
    throw p1
.end method
