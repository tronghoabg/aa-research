.class public final LVa/W8;
.super LVa/d9;
.source "SourceFile"


# static fields
.field public static final k:[C

.field public static l:I = 0x0

.field public static m:I = 0x1


# instance fields
.field public final h:LVa/y8;

.field public final i:LVa/c9;

.field public final j:LVa/c9;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/W8;->k:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x6ds
        0xd6s
        0xf5s
        0x119s
        0x5cs
        0xbcs
        0x10s
        0x5s
        0x32s
        0x68s
        0x6fs
        0x6cs
        0x42s
    .end array-data
.end method

.method public constructor <init>(LVa/y8;LVa/c9;LVa/c9;B)V
    .locals 0

    .line 1
    invoke-direct {p0, p4}, LVa/d9;-><init>(B)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/W8;->h:LVa/y8;

    .line 5
    .line 6
    iput-object p2, p0, LVa/W8;->i:LVa/c9;

    .line 7
    .line 8
    iput-object p3, p0, LVa/W8;->j:LVa/c9;

    .line 9
    .line 10
    return-void
.end method

.method public static f(Ljava/lang/String;[IZ)Ljava/lang/String;
    .locals 12

    .line 1
    const-string v0, "ISO-8859-1"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, [B

    .line 8
    .line 9
    sget-object v0, LVa/Ab;->z:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :try_start_0
    aget v2, p1, v1

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    aget v4, p1, v3

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    aget v6, p1, v5

    .line 20
    .line 21
    const/4 v7, 0x3

    .line 22
    aget v7, p1, v7

    .line 23
    .line 24
    sget-object v8, LVa/W8;->k:[C

    .line 25
    .line 26
    new-array v9, v4, [C

    .line 27
    .line 28
    invoke-static {v8, v2, v9, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    new-array v2, v4, [C

    .line 34
    .line 35
    sput v1, LVa/Ab;->y:I

    .line 36
    .line 37
    move v8, v1

    .line 38
    :goto_0
    sget v10, LVa/Ab;->y:I

    .line 39
    .line 40
    if-ge v10, v4, :cond_1

    .line 41
    .line 42
    aget-byte v11, p0, v10

    .line 43
    .line 44
    if-ne v11, v3, :cond_0

    .line 45
    .line 46
    aget-char v11, v9, v10

    .line 47
    .line 48
    shl-int/2addr v11, v3

    .line 49
    add-int/2addr v11, v3

    .line 50
    sub-int/2addr v11, v8

    .line 51
    int-to-char v8, v11

    .line 52
    aput-char v8, v2, v10

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto :goto_4

    .line 57
    :cond_0
    aget-char v11, v9, v10

    .line 58
    .line 59
    shl-int/2addr v11, v3

    .line 60
    sub-int/2addr v11, v8

    .line 61
    int-to-char v8, v11

    .line 62
    aput-char v8, v2, v10

    .line 63
    .line 64
    :goto_1
    aget-char v8, v2, v10

    .line 65
    .line 66
    add-int/lit8 v10, v10, 0x1

    .line 67
    .line 68
    sput v10, LVa/Ab;->y:I

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move-object v9, v2

    .line 72
    :cond_2
    if-lez v7, :cond_3

    .line 73
    .line 74
    new-array p0, v4, [C

    .line 75
    .line 76
    invoke-static {v9, v1, p0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 77
    .line 78
    .line 79
    sub-int v2, v4, v7

    .line 80
    .line 81
    invoke-static {p0, v1, v9, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 82
    .line 83
    .line 84
    invoke-static {p0, v7, v9, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 85
    .line 86
    .line 87
    :cond_3
    if-eqz p2, :cond_5

    .line 88
    .line 89
    new-array p0, v4, [C

    .line 90
    .line 91
    sput v1, LVa/Ab;->y:I

    .line 92
    .line 93
    :goto_2
    sget p2, LVa/Ab;->y:I

    .line 94
    .line 95
    if-ge p2, v4, :cond_4

    .line 96
    .line 97
    sub-int v2, v4, p2

    .line 98
    .line 99
    sub-int/2addr v2, v3

    .line 100
    aget-char v2, v9, v2

    .line 101
    .line 102
    aput-char v2, p0, p2

    .line 103
    .line 104
    add-int/lit8 p2, p2, 0x1

    .line 105
    .line 106
    sput p2, LVa/Ab;->y:I

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    move-object v9, p0

    .line 110
    :cond_5
    if-lez v6, :cond_6

    .line 111
    .line 112
    sput v1, LVa/Ab;->y:I

    .line 113
    .line 114
    :goto_3
    sget p0, LVa/Ab;->y:I

    .line 115
    .line 116
    if-ge p0, v4, :cond_6

    .line 117
    .line 118
    aget-char p2, v9, p0

    .line 119
    .line 120
    aget v1, p1, v5

    .line 121
    .line 122
    sub-int/2addr p2, v1

    .line 123
    int-to-char p2, p2

    .line 124
    aput-char p2, v9, p0

    .line 125
    .line 126
    add-int/lit8 p0, p0, 0x1

    .line 127
    .line 128
    sput p0, LVa/Ab;->y:I

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_6
    new-instance p0, Ljava/lang/String;

    .line 132
    .line 133
    invoke-direct {p0, v9}, Ljava/lang/String;-><init>([C)V

    .line 134
    .line 135
    .line 136
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    return-object p0

    .line 138
    :goto_4
    monitor-exit v0

    .line 139
    throw p0
.end method


# virtual methods
.method public final a()I
    .locals 5

    .line 1
    sget v0, LVa/W8;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x77

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/W8;->l:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/W8;->i:LVa/c9;

    .line 10
    .line 11
    invoke-virtual {v0}, LVa/c9;->a()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p0, LVa/W8;->j:LVa/c9;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    sget v3, LVa/W8;->m:I

    .line 20
    .line 21
    add-int/lit8 v3, v3, 0x2b

    .line 22
    .line 23
    rem-int/lit16 v4, v3, 0x80

    .line 24
    .line 25
    sput v4, LVa/W8;->l:I

    .line 26
    .line 27
    rem-int/lit8 v3, v3, 0x2

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v2}, LVa/c9;->a()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    sub-int/2addr v1, v2

    .line 36
    instance-of v0, v0, LVa/V8;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v2}, LVa/c9;->a()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    add-int/2addr v1, v2

    .line 46
    instance-of v0, v0, LVa/V8;

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    :goto_0
    add-int/lit8 v1, v1, -0x1

    .line 51
    .line 52
    :cond_1
    sget v0, LVa/W8;->l:I

    .line 53
    .line 54
    add-int/lit8 v0, v0, 0x69

    .line 55
    .line 56
    rem-int/lit16 v2, v0, 0x80

    .line 57
    .line 58
    sput v2, LVa/W8;->m:I

    .line 59
    .line 60
    rem-int/lit8 v0, v0, 0x2

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    return v1

    .line 65
    :cond_2
    const/4 v0, 0x0

    .line 66
    throw v0
.end method

.method public final b(LVa/x8;)I
    .locals 2

    .line 1
    invoke-virtual {p1, p0}, LVa/x8;->e(LVa/c9;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    iget-object v1, p0, LVa/W8;->i:LVa/c9;

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    sget p1, LVa/W8;->m:I

    .line 11
    .line 12
    add-int/lit8 p1, p1, 0x23

    .line 13
    .line 14
    rem-int/lit16 p1, p1, 0x80

    .line 15
    .line 16
    sput p1, LVa/W8;->l:I

    .line 17
    .line 18
    instance-of p1, v1, LVa/V8;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    return v0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return p1

    .line 25
    :cond_1
    invoke-virtual {v1}, LVa/c9;->a()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iget-object v1, p0, LVa/W8;->j:LVa/c9;

    .line 30
    .line 31
    instance-of v1, v1, LVa/V8;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    return p1

    .line 36
    :cond_2
    sub-int/2addr p1, v0

    .line 37
    sget v0, LVa/W8;->l:I

    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x6b

    .line 40
    .line 41
    rem-int/lit16 v0, v0, 0x80

    .line 42
    .line 43
    sput v0, LVa/W8;->m:I

    .line 44
    .line 45
    return p1
.end method

.method public final c(LVa/x8;LVa/y7;)LVa/s8;
    .locals 4

    .line 1
    iget-object v0, p0, LVa/W8;->h:LVa/y8;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LVa/s8;->e()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    sget v0, LVa/W8;->m:I

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x73

    .line 17
    .line 18
    rem-int/lit16 v2, v0, 0x80

    .line 19
    .line 20
    sput v2, LVa/W8;->l:I

    .line 21
    .line 22
    rem-int/lit8 v0, v0, 0x2

    .line 23
    .line 24
    iget-object v2, p0, LVa/W8;->i:LVa/c9;

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2, p1, p2}, LVa/c9;->d(LVa/x8;LVa/y7;)LVa/s8;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_0
    invoke-virtual {v2, p1, p2}, LVa/c9;->d(LVa/x8;LVa/y7;)LVa/s8;

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    iget-object v0, p0, LVa/W8;->j:LVa/c9;

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    sget v2, LVa/W8;->l:I

    .line 42
    .line 43
    add-int/lit8 v2, v2, 0x3b

    .line 44
    .line 45
    rem-int/lit16 v3, v2, 0x80

    .line 46
    .line 47
    sput v3, LVa/W8;->m:I

    .line 48
    .line 49
    rem-int/lit8 v2, v2, 0x2

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1, p0}, LVa/x8;->f(LVa/c9;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1, p2}, LVa/c9;->d(LVa/x8;LVa/y7;)LVa/s8;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :cond_2
    invoke-virtual {p1, p0}, LVa/x8;->f(LVa/c9;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1, p2}, LVa/c9;->d(LVa/x8;LVa/y7;)LVa/s8;

    .line 65
    .line 66
    .line 67
    throw v1

    .line 68
    :cond_3
    new-instance p1, LVa/s8;

    .line 69
    .line 70
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-direct {p1, p2}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    sget v0, LVa/W8;->m:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x53

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/W8;->l:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/16 v1, 0xd

    .line 16
    .line 17
    div-int/2addr v1, v3

    .line 18
    if-ne p0, p1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    if-ne p0, p1, :cond_1

    .line 22
    .line 23
    :goto_0
    return v2

    .line 24
    :cond_1
    if-eqz p1, :cond_b

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x55

    .line 27
    .line 28
    rem-int/lit16 v1, v0, 0x80

    .line 29
    .line 30
    sput v1, LVa/W8;->l:I

    .line 31
    .line 32
    rem-int/lit8 v0, v0, 0x2

    .line 33
    .line 34
    if-nez v0, :cond_a

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-class v1, LVa/W8;

    .line 41
    .line 42
    if-eq v1, v0, :cond_2

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_2
    check-cast p1, LVa/W8;

    .line 46
    .line 47
    iget-object v0, p1, LVa/W8;->h:LVa/y8;

    .line 48
    .line 49
    iget-object v1, p0, LVa/W8;->h:LVa/y8;

    .line 50
    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    if-eqz v0, :cond_4

    .line 61
    .line 62
    :goto_1
    return v3

    .line 63
    :cond_4
    iget-object v0, p1, LVa/W8;->i:LVa/c9;

    .line 64
    .line 65
    iget-object v1, p0, LVa/W8;->i:LVa/c9;

    .line 66
    .line 67
    if-eqz v1, :cond_5

    .line 68
    .line 69
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_6

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_5
    if-eqz v0, :cond_6

    .line 77
    .line 78
    :goto_2
    return v3

    .line 79
    :cond_6
    iget-object p1, p1, LVa/W8;->j:LVa/c9;

    .line 80
    .line 81
    iget-object v0, p0, LVa/W8;->j:LVa/c9;

    .line 82
    .line 83
    if-eqz v0, :cond_7

    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    return p1

    .line 90
    :cond_7
    if-nez p1, :cond_8

    .line 91
    .line 92
    return v2

    .line 93
    :cond_8
    sget p1, LVa/W8;->l:I

    .line 94
    .line 95
    add-int/lit8 p1, p1, 0x13

    .line 96
    .line 97
    rem-int/lit16 v0, p1, 0x80

    .line 98
    .line 99
    sput v0, LVa/W8;->m:I

    .line 100
    .line 101
    rem-int/lit8 p1, p1, 0x2

    .line 102
    .line 103
    if-nez p1, :cond_9

    .line 104
    .line 105
    const/16 p1, 0x4b

    .line 106
    .line 107
    div-int/2addr p1, v3

    .line 108
    :cond_9
    return v3

    .line 109
    :cond_a
    const/4 p1, 0x0

    .line 110
    throw p1

    .line 111
    :cond_b
    :goto_3
    return v3
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, LVa/W8;->h:LVa/y8;

    .line 4
    .line 5
    if-eqz v2, :cond_1

    .line 6
    .line 7
    sget v3, LVa/W8;->l:I

    .line 8
    .line 9
    add-int/lit8 v3, v3, 0x79

    .line 10
    .line 11
    rem-int/lit16 v4, v3, 0x80

    .line 12
    .line 13
    sput v4, LVa/W8;->m:I

    .line 14
    .line 15
    rem-int/lit8 v3, v3, 0x2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    move v2, v1

    .line 29
    :goto_0
    mul-int/lit8 v2, v2, 0x1f

    .line 30
    .line 31
    iget-object v3, p0, LVa/W8;->i:LVa/c9;

    .line 32
    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v3, v1

    .line 41
    :goto_1
    add-int/2addr v2, v3

    .line 42
    mul-int/lit8 v2, v2, 0x1f

    .line 43
    .line 44
    iget-object v3, p0, LVa/W8;->j:LVa/c9;

    .line 45
    .line 46
    if-eqz v3, :cond_4

    .line 47
    .line 48
    sget v1, LVa/W8;->l:I

    .line 49
    .line 50
    add-int/lit8 v1, v1, 0x5b

    .line 51
    .line 52
    rem-int/lit16 v4, v1, 0x80

    .line 53
    .line 54
    sput v4, LVa/W8;->m:I

    .line 55
    .line 56
    rem-int/lit8 v1, v1, 0x2

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_4
    sget v0, LVa/W8;->m:I

    .line 70
    .line 71
    add-int/lit8 v0, v0, 0x3d

    .line 72
    .line 73
    rem-int/lit16 v0, v0, 0x80

    .line 74
    .line 75
    sput v0, LVa/W8;->l:I

    .line 76
    .line 77
    :goto_2
    add-int/2addr v2, v1

    .line 78
    return v2
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
    const/4 v2, 0x4

    .line 8
    const/16 v3, 0xb2

    .line 9
    .line 10
    filled-new-array {v1, v2, v3, v1}, [I

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const-string v4, "\u0000\u0000\u0000\u0001"

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    invoke-static {v4, v3, v5}, LVa/W8;->f(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v3, p0, LVa/W8;->h:LVa/y8;

    .line 29
    .line 30
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 v3, 0x98

    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    filled-new-array {v2, v4, v3, v1}, [I

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v3, "\u0000\u0001"

    .line 41
    .line 42
    invoke-static {v3, v2, v5}, LVa/W8;->f(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v2, p0, LVa/W8;->i:LVa/c9;

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v3, p0, LVa/W8;->j:LVa/c9;

    .line 59
    .line 60
    if-eqz v3, :cond_3

    .line 61
    .line 62
    sget v6, LVa/W8;->m:I

    .line 63
    .line 64
    add-int/lit8 v6, v6, 0x27

    .line 65
    .line 66
    rem-int/lit16 v6, v6, 0x80

    .line 67
    .line 68
    sput v6, LVa/W8;->l:I

    .line 69
    .line 70
    instance-of v2, v2, LVa/V8;

    .line 71
    .line 72
    const-string v7, "\u0000"

    .line 73
    .line 74
    if-eqz v2, :cond_1

    .line 75
    .line 76
    add-int/lit8 v6, v6, 0x4b

    .line 77
    .line 78
    rem-int/lit16 v2, v6, 0x80

    .line 79
    .line 80
    sput v2, LVa/W8;->m:I

    .line 81
    .line 82
    rem-int/2addr v6, v4

    .line 83
    const/4 v2, 0x6

    .line 84
    if-nez v6, :cond_0

    .line 85
    .line 86
    filled-new-array {v2, v5, v1, v1}, [I

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-static {v7, v2, v1}, LVa/W8;->f(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    :goto_0
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_0
    filled-new-array {v2, v5, v1, v1}, [I

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-static {v7, v2, v5}, LVa/W8;->f(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    goto :goto_0

    .line 111
    :cond_1
    const/4 v2, 0x7

    .line 112
    filled-new-array {v2, v5, v1, v5}, [I

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-static {v7, v2, v5}, LVa/W8;->f(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    sget v2, LVa/d9;->f:I

    .line 128
    .line 129
    add-int/lit8 v2, v2, 0x45

    .line 130
    .line 131
    rem-int/lit16 v5, v2, 0x80

    .line 132
    .line 133
    sput v5, LVa/d9;->g:I

    .line 134
    .line 135
    rem-int/2addr v2, v4

    .line 136
    iget-byte v4, p0, LVa/d9;->d:B

    .line 137
    .line 138
    invoke-static {v4, v0}, LVa/d9;->e(ILjava/lang/StringBuilder;)V

    .line 139
    .line 140
    .line 141
    if-eqz v2, :cond_2

    .line 142
    .line 143
    :goto_1
    const/16 v2, 0x8

    .line 144
    .line 145
    const/4 v4, 0x5

    .line 146
    filled-new-array {v2, v4, v1, v1}, [I

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    const-string v4, "\u0001\u0001\u0001\u0000\u0001"

    .line 151
    .line 152
    invoke-static {v4, v2, v1}, LVa/W8;->f(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_2
    const/4 v0, 0x0

    .line 168
    throw v0

    .line 169
    :cond_3
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    return-object v0
.end method
