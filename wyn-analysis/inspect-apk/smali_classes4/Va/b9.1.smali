.class public final LVa/b9;
.super LVa/a9;
.source "SourceFile"


# static fields
.field public static h:I = 0x0

.field public static i:I = 0x1


# direct methods
.method public static f(ILjava/lang/String;)Ljava/lang/String;
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
    add-int/lit16 v10, v10, 0x7d5b

    .line 52
    .line 53
    xor-int/2addr v9, v10

    .line 54
    ushr-int/lit8 v10, v8, 0x5

    .line 55
    .line 56
    add-int/lit16 v10, v10, 0x3a9f

    .line 57
    .line 58
    xor-int/2addr v9, v10

    .line 59
    sub-int/2addr v7, v9

    .line 60
    int-to-char v7, v7

    .line 61
    aput-char v7, v3, v5

    .line 62
    .line 63
    add-int v9, v7, v4

    .line 64
    .line 65
    shl-int/lit8 v10, v7, 0x4

    .line 66
    .line 67
    const v11, 0xd7e0

    .line 68
    .line 69
    .line 70
    add-int/2addr v10, v11

    .line 71
    xor-int/2addr v9, v10

    .line 72
    ushr-int/lit8 v7, v7, 0x5

    .line 73
    .line 74
    const v10, 0xed88

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


# virtual methods
.method public final c(LVa/x8;LVa/y7;)LVa/s8;
    .locals 2

    .line 1
    sget v0, LVa/b9;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x49

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/b9;->h:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-super {p0, p1, p2}, LVa/a9;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1, v1}, LVa/s8;->d(Z)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-super {p0, p1, p2}, LVa/a9;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 p2, 0x1

    .line 27
    invoke-virtual {p1, p2}, LVa/s8;->d(Z)V

    .line 28
    .line 29
    .line 30
    :goto_0
    sget p2, LVa/b9;->h:I

    .line 31
    .line 32
    add-int/lit8 p2, p2, 0x45

    .line 33
    .line 34
    rem-int/lit16 v0, p2, 0x80

    .line 35
    .line 36
    sput v0, LVa/b9;->i:I

    .line 37
    .line 38
    rem-int/lit8 p2, p2, 0x2

    .line 39
    .line 40
    if-nez p2, :cond_1

    .line 41
    .line 42
    const/16 p2, 0x2b

    .line 43
    .line 44
    div-int/2addr p2, v1

    .line 45
    :cond_1
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    sget v0, LVa/b9;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x57

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/b9;->i:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/a9;->d:LVa/y8;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    sget v0, LVa/a9;->f:I

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x53

    .line 20
    .line 21
    rem-int/lit16 v4, v0, 0x80

    .line 22
    .line 23
    sput v4, LVa/a9;->g:I

    .line 24
    .line 25
    rem-int/lit8 v0, v0, 0x2

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/16 v0, 0x3a

    .line 30
    .line 31
    div-int/2addr v0, v3

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    throw v2

    .line 36
    :cond_1
    sget v0, LVa/a9;->f:I

    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x53

    .line 39
    .line 40
    rem-int/lit16 v4, v0, 0x80

    .line 41
    .line 42
    sput v4, LVa/a9;->g:I

    .line 43
    .line 44
    rem-int/lit8 v0, v0, 0x2

    .line 45
    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    shr-int/lit8 v1, v1, 0x10

    .line 60
    .line 61
    rsub-int/lit8 v1, v1, 0x7

    .line 62
    .line 63
    const-string v3, "\u0912\u208e\u673d\udfc2\u3704\u9b43\u108f\u0ba3"

    .line 64
    .line 65
    invoke-static {v1, v3}, LVa/b9;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-super {p0}, LVa/a9;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sget v1, LVa/b9;->h:I

    .line 88
    .line 89
    add-int/lit8 v1, v1, 0x75

    .line 90
    .line 91
    rem-int/lit16 v3, v1, 0x80

    .line 92
    .line 93
    sput v3, LVa/b9;->i:I

    .line 94
    .line 95
    rem-int/lit8 v1, v1, 0x2

    .line 96
    .line 97
    if-eqz v1, :cond_2

    .line 98
    .line 99
    return-object v0

    .line 100
    :cond_2
    throw v2

    .line 101
    :cond_3
    invoke-static {v3, v3}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    add-int/lit8 v0, v0, 0x7

    .line 106
    .line 107
    const-string v1, "\u0912\u208e\u673d\udfc2\u3704\u9b43\ua3fb\u8e09"

    .line 108
    .line 109
    invoke-static {v0, v1}, LVa/b9;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sget v1, LVa/b9;->i:I

    .line 118
    .line 119
    add-int/lit8 v1, v1, 0x6d

    .line 120
    .line 121
    rem-int/lit16 v1, v1, 0x80

    .line 122
    .line 123
    sput v1, LVa/b9;->h:I

    .line 124
    .line 125
    return-object v0

    .line 126
    :cond_4
    throw v2
.end method
