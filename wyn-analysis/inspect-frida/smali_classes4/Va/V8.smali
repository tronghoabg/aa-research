.class public final LVa/V8;
.super LVa/d9;
.source "SourceFile"


# static fields
.field public static i:I = 0x0

.field public static j:I = 0x1


# instance fields
.field public final h:[LVa/c9;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;B)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, LVa/d9;-><init>(B)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    new-array p2, p2, [LVa/c9;

    .line 9
    .line 10
    iput-object p2, p0, LVa/V8;->h:[LVa/c9;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static f(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
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
    const v6, 0x6e98086a

    .line 98
    .line 99
    .line 100
    int-to-long v6, v6

    .line 101
    xor-long/2addr v4, v6

    .line 102
    int-to-long v6, v2

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


# virtual methods
.method public final a()I
    .locals 5

    .line 1
    sget v0, LVa/V8;->j:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5f

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/V8;->i:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/V8;->h:[LVa/c9;

    .line 10
    .line 11
    array-length v1, v0

    .line 12
    const/4 v2, 0x2

    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    if-ge v3, v1, :cond_0

    .line 15
    .line 16
    sget v4, LVa/V8;->j:I

    .line 17
    .line 18
    add-int/lit8 v4, v4, 0x37

    .line 19
    .line 20
    rem-int/lit16 v4, v4, 0x80

    .line 21
    .line 22
    sput v4, LVa/V8;->i:I

    .line 23
    .line 24
    aget-object v4, v0, v3

    .line 25
    .line 26
    invoke-virtual {v4}, LVa/c9;->a()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    add-int/2addr v2, v4

    .line 31
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    sget v4, LVa/V8;->i:I

    .line 34
    .line 35
    add-int/lit8 v4, v4, 0x1d

    .line 36
    .line 37
    rem-int/lit16 v4, v4, 0x80

    .line 38
    .line 39
    sput v4, LVa/V8;->j:I

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return v2
.end method

.method public final b(LVa/x8;)I
    .locals 4

    .line 1
    sget v0, LVa/V8;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6f

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/V8;->j:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    move v1, v0

    .line 11
    :goto_0
    sget v2, LVa/x8;->l:I

    .line 12
    .line 13
    iget-short v3, p1, LVa/x8;->h:S

    .line 14
    .line 15
    add-int/lit8 v2, v2, 0x21

    .line 16
    .line 17
    rem-int/lit16 v2, v2, 0x80

    .line 18
    .line 19
    sput v2, LVa/x8;->k:I

    .line 20
    .line 21
    if-ge v0, v3, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, LVa/V8;->h:[LVa/c9;

    .line 24
    .line 25
    aget-object v2, v2, v0

    .line 26
    .line 27
    invoke-virtual {v2}, LVa/c9;->a()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    add-int/2addr v1, v2

    .line 32
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sget p1, LVa/V8;->i:I

    .line 36
    .line 37
    add-int/lit8 p1, p1, 0x19

    .line 38
    .line 39
    rem-int/lit16 p1, p1, 0x80

    .line 40
    .line 41
    sput p1, LVa/V8;->j:I

    .line 42
    .line 43
    return v1
.end method

.method public final c(LVa/x8;LVa/y7;)LVa/s8;
    .locals 8

    .line 1
    new-instance v0, LVa/s8;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance v2, LVa/x8;

    .line 8
    .line 9
    invoke-direct {v2, p1}, LVa/x8;-><init>(LVa/x8;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, p0, LVa/V8;->h:[LVa/c9;

    .line 13
    .line 14
    array-length v4, v3

    .line 15
    const/4 v5, 0x0

    .line 16
    :goto_0
    if-ge v5, v4, :cond_3

    .line 17
    .line 18
    aget-object v0, v3, v5

    .line 19
    .line 20
    invoke-virtual {v0, v2, p2}, LVa/c9;->d(LVa/x8;LVa/y7;)LVa/s8;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, LVa/s8;->b()Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-nez v6, :cond_3

    .line 29
    .line 30
    invoke-virtual {v0}, LVa/s8;->g()Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-nez v6, :cond_3

    .line 35
    .line 36
    sget v6, LVa/V8;->i:I

    .line 37
    .line 38
    add-int/lit8 v6, v6, 0x6f

    .line 39
    .line 40
    rem-int/lit16 v7, v6, 0x80

    .line 41
    .line 42
    sput v7, LVa/V8;->j:I

    .line 43
    .line 44
    rem-int/lit8 v6, v6, 0x2

    .line 45
    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    sget v6, LVa/s8;->f:I

    .line 49
    .line 50
    iget-boolean v7, v0, LVa/s8;->d:Z

    .line 51
    .line 52
    add-int/lit8 v6, v6, 0x79

    .line 53
    .line 54
    rem-int/lit16 v6, v6, 0x80

    .line 55
    .line 56
    sput v6, LVa/s8;->g:I

    .line 57
    .line 58
    if-eqz v7, :cond_0

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    sget v6, LVa/x8;->k:I

    .line 62
    .line 63
    add-int/lit8 v6, v6, 0x2d

    .line 64
    .line 65
    rem-int/lit16 v6, v6, 0x80

    .line 66
    .line 67
    sput v6, LVa/x8;->l:I

    .line 68
    .line 69
    iget-short v7, p1, LVa/x8;->h:S

    .line 70
    .line 71
    add-int/lit8 v7, v7, 0x1

    .line 72
    .line 73
    int-to-short v7, v7

    .line 74
    iput-short v7, p1, LVa/x8;->h:S

    .line 75
    .line 76
    add-int/lit8 v6, v6, 0x7b

    .line 77
    .line 78
    rem-int/lit16 v7, v6, 0x80

    .line 79
    .line 80
    sput v7, LVa/x8;->k:I

    .line 81
    .line 82
    rem-int/lit8 v6, v6, 0x2

    .line 83
    .line 84
    if-nez v6, :cond_1

    .line 85
    .line 86
    add-int/lit8 v5, v5, 0x1

    .line 87
    .line 88
    sget v6, LVa/V8;->j:I

    .line 89
    .line 90
    add-int/lit8 v6, v6, 0x6b

    .line 91
    .line 92
    rem-int/lit16 v6, v6, 0x80

    .line 93
    .line 94
    sput v6, LVa/V8;->i:I

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    throw v1

    .line 98
    :cond_2
    sget p1, LVa/s8;->f:I

    .line 99
    .line 100
    add-int/lit8 p1, p1, 0x79

    .line 101
    .line 102
    rem-int/lit16 p1, p1, 0x80

    .line 103
    .line 104
    sput p1, LVa/s8;->g:I

    .line 105
    .line 106
    throw v1

    .line 107
    :cond_3
    :goto_1
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    sget p1, LVa/V8;->j:I

    .line 5
    .line 6
    add-int/lit8 p1, p1, 0x51

    .line 7
    .line 8
    rem-int/lit16 p1, p1, 0x80

    .line 9
    .line 10
    sput p1, LVa/V8;->i:I

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz p1, :cond_6

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-class v4, LVa/V8;

    .line 22
    .line 23
    if-eq v4, v3, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    check-cast p1, LVa/V8;

    .line 27
    .line 28
    iget-object p1, p1, LVa/V8;->h:[LVa/c9;

    .line 29
    .line 30
    iget-object v3, p0, LVa/V8;->h:[LVa/c9;

    .line 31
    .line 32
    if-eqz v3, :cond_3

    .line 33
    .line 34
    sget v0, LVa/V8;->i:I

    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x23

    .line 37
    .line 38
    rem-int/lit16 v1, v0, 0x80

    .line 39
    .line 40
    sput v1, LVa/V8;->j:I

    .line 41
    .line 42
    rem-int/lit8 v0, v0, 0x2

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1

    .line 51
    :cond_2
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    throw v2

    .line 55
    :cond_3
    if-nez p1, :cond_5

    .line 56
    .line 57
    sget p1, LVa/V8;->i:I

    .line 58
    .line 59
    add-int/lit8 p1, p1, 0x53

    .line 60
    .line 61
    rem-int/lit16 v1, p1, 0x80

    .line 62
    .line 63
    sput v1, LVa/V8;->j:I

    .line 64
    .line 65
    rem-int/lit8 p1, p1, 0x2

    .line 66
    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    return v0

    .line 70
    :cond_4
    throw v2

    .line 71
    :cond_5
    return v1

    .line 72
    :cond_6
    :goto_0
    sget p1, LVa/V8;->i:I

    .line 73
    .line 74
    add-int/lit8 p1, p1, 0xb

    .line 75
    .line 76
    rem-int/lit16 v0, p1, 0x80

    .line 77
    .line 78
    sput v0, LVa/V8;->j:I

    .line 79
    .line 80
    rem-int/lit8 p1, p1, 0x2

    .line 81
    .line 82
    if-eqz p1, :cond_7

    .line 83
    .line 84
    return v1

    .line 85
    :cond_7
    throw v2
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    sget v0, LVa/V8;->j:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xf

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, LVa/V8;->i:I

    .line 8
    .line 9
    iget-object v1, p0, LVa/V8;->h:[LVa/c9;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0

    .line 18
    :cond_0
    add-int/lit8 v0, v0, 0x7d

    .line 19
    .line 20
    rem-int/lit16 v0, v0, 0x80

    .line 21
    .line 22
    sput v0, LVa/V8;->i:I

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    return v0
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
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    shr-int/lit8 v1, v1, 0x8

    .line 11
    .line 12
    rsub-int v1, v1, 0x2811

    .line 13
    .line 14
    int-to-char v1, v1

    .line 15
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    shr-int/lit8 v2, v2, 0x10

    .line 20
    .line 21
    const-string v3, "\u3a33\uf116\u111e\u1328"

    .line 22
    .line 23
    const-string v4, "\u7678\u63c0"

    .line 24
    .line 25
    invoke-static {v1, v3, v4, v2}, LVa/V8;->f(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, LVa/V8;->h:[LVa/c9;

    .line 37
    .line 38
    array-length v2, v1

    .line 39
    const/4 v3, 0x0

    .line 40
    :goto_0
    iget-byte v4, p0, LVa/d9;->d:B

    .line 41
    .line 42
    if-ge v3, v2, :cond_1

    .line 43
    .line 44
    sget v5, LVa/V8;->j:I

    .line 45
    .line 46
    add-int/lit8 v5, v5, 0x1f

    .line 47
    .line 48
    rem-int/lit16 v5, v5, 0x80

    .line 49
    .line 50
    sput v5, LVa/V8;->i:I

    .line 51
    .line 52
    aget-object v5, v1, v3

    .line 53
    .line 54
    sget v6, LVa/d9;->f:I

    .line 55
    .line 56
    add-int/lit8 v6, v6, 0x45

    .line 57
    .line 58
    rem-int/lit16 v7, v6, 0x80

    .line 59
    .line 60
    sput v7, LVa/d9;->g:I

    .line 61
    .line 62
    rem-int/lit8 v6, v6, 0x2

    .line 63
    .line 64
    invoke-static {v4, v0}, LVa/d9;->e(ILjava/lang/StringBuilder;)V

    .line 65
    .line 66
    .line 67
    if-eqz v6, :cond_0

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    shr-int/lit8 v4, v4, 0x10

    .line 81
    .line 82
    const v5, 0xf9f6

    .line 83
    .line 84
    .line 85
    add-int/2addr v4, v5

    .line 86
    int-to-char v4, v4

    .line 87
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    shr-int/lit8 v5, v5, 0x18

    .line 92
    .line 93
    const v6, 0x4c2c5bf4    # 4.518293E7f

    .line 94
    .line 95
    .line 96
    sub-int/2addr v6, v5

    .line 97
    const-string v5, "\uf4dc\u2c5b\uf64c\u7af9"

    .line 98
    .line 99
    const-string v7, "\ud832"

    .line 100
    .line 101
    invoke-static {v4, v5, v7, v6}, LVa/V8;->f(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    add-int/lit8 v3, v3, 0x1

    .line 113
    .line 114
    sget v4, LVa/V8;->i:I

    .line 115
    .line 116
    add-int/lit8 v4, v4, 0x41

    .line 117
    .line 118
    rem-int/lit16 v4, v4, 0x80

    .line 119
    .line 120
    sput v4, LVa/V8;->j:I

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_0
    const/4 v0, 0x0

    .line 124
    throw v0

    .line 125
    :cond_1
    sget v1, LVa/d9;->g:I

    .line 126
    .line 127
    add-int/lit8 v1, v1, 0x21

    .line 128
    .line 129
    rem-int/lit16 v2, v1, 0x80

    .line 130
    .line 131
    sput v2, LVa/d9;->f:I

    .line 132
    .line 133
    rem-int/lit8 v1, v1, 0x2

    .line 134
    .line 135
    if-eqz v1, :cond_2

    .line 136
    .line 137
    shl-int/lit8 v1, v4, -0x1

    .line 138
    .line 139
    invoke-static {v1, v0}, LVa/d9;->e(ILjava/lang/StringBuilder;)V

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_2
    add-int/lit8 v4, v4, -0x1

    .line 144
    .line 145
    invoke-static {v4, v0}, LVa/d9;->e(ILjava/lang/StringBuilder;)V

    .line 146
    .line 147
    .line 148
    :goto_1
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    shr-int/lit8 v1, v1, 0x10

    .line 153
    .line 154
    rsub-int v1, v1, 0x4ba5

    .line 155
    .line 156
    int-to-char v1, v1

    .line 157
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 158
    .line 159
    .line 160
    move-result-wide v2

    .line 161
    const-wide/16 v4, 0x0

    .line 162
    .line 163
    cmp-long v2, v2, v4

    .line 164
    .line 165
    const v3, 0x5c6a87b8

    .line 166
    .line 167
    .line 168
    add-int/2addr v2, v3

    .line 169
    const-string v3, "\ub983\u6a87\ua55c\u304b"

    .line 170
    .line 171
    const-string v4, "\ubd26"

    .line 172
    .line 173
    invoke-static {v1, v3, v4, v2}, LVa/V8;->f(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    return-object v0
.end method
