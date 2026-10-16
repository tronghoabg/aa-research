.class public final LVa/Z8;
.super LVa/c9;
.source "SourceFile"


# static fields
.field public static g:I = 0x0

.field public static h:I = 0x1


# instance fields
.field public final d:LVa/V8;

.field public final e:LVa/V8;

.field public final f:LVa/J8;


# direct methods
.method public constructor <init>(LVa/V8;LVa/V8;LVa/J8;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/Z8;->d:LVa/V8;

    .line 5
    .line 6
    iput-object p2, p0, LVa/Z8;->e:LVa/V8;

    .line 7
    .line 8
    iput-object p3, p0, LVa/Z8;->f:LVa/J8;

    .line 9
    .line 10
    return-void
.end method

.method public static e(ILjava/lang/String;)Ljava/lang/String;
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
    add-int/lit16 v10, v10, 0x15c7

    .line 52
    .line 53
    xor-int/2addr v9, v10

    .line 54
    ushr-int/lit8 v10, v8, 0x5

    .line 55
    .line 56
    const v11, 0x8f76

    .line 57
    .line 58
    .line 59
    add-int/2addr v10, v11

    .line 60
    xor-int/2addr v9, v10

    .line 61
    sub-int/2addr v7, v9

    .line 62
    int-to-char v7, v7

    .line 63
    aput-char v7, v3, v5

    .line 64
    .line 65
    add-int v9, v7, v4

    .line 66
    .line 67
    shl-int/lit8 v10, v7, 0x4

    .line 68
    .line 69
    const v11, 0xa01a

    .line 70
    .line 71
    .line 72
    add-int/2addr v10, v11

    .line 73
    xor-int/2addr v9, v10

    .line 74
    ushr-int/lit8 v7, v7, 0x5

    .line 75
    .line 76
    const v10, 0xdc1f

    .line 77
    .line 78
    .line 79
    add-int/2addr v7, v10

    .line 80
    xor-int/2addr v7, v9

    .line 81
    sub-int/2addr v8, v7

    .line 82
    int-to-char v7, v8

    .line 83
    aput-char v7, v3, v2

    .line 84
    .line 85
    const v7, 0x9e37

    .line 86
    .line 87
    .line 88
    sub-int/2addr v4, v7

    .line 89
    add-int/lit8 v6, v6, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception p0

    .line 93
    goto :goto_2

    .line 94
    :cond_0
    sget v4, LVa/Ab;->E:I

    .line 95
    .line 96
    aget-char v6, v3, v2

    .line 97
    .line 98
    aput-char v6, v1, v4

    .line 99
    .line 100
    add-int/lit8 v6, v4, 0x1

    .line 101
    .line 102
    aget-char v5, v3, v5

    .line 103
    .line 104
    aput-char v5, v1, v6

    .line 105
    .line 106
    add-int/lit8 v4, v4, 0x2

    .line 107
    .line 108
    sput v4, LVa/Ab;->E:I

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    new-instance p1, Ljava/lang/String;

    .line 112
    .line 113
    invoke-direct {p1, v1, v2, p0}, Ljava/lang/String;-><init>([CII)V

    .line 114
    .line 115
    .line 116
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    return-object p1

    .line 118
    :goto_2
    monitor-exit v0

    .line 119
    throw p0
.end method


# virtual methods
.method public final a()I
    .locals 3

    .line 1
    sget v0, LVa/Z8;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Z8;->g:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/Z8;->d:LVa/V8;

    .line 10
    .line 11
    invoke-virtual {v0}, LVa/V8;->a()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, LVa/Z8;->e:LVa/V8;

    .line 16
    .line 17
    invoke-virtual {v1}, LVa/V8;->a()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-int/2addr v1, v0

    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    sget v0, LVa/Z8;->h:I

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x55

    .line 27
    .line 28
    rem-int/lit16 v2, v0, 0x80

    .line 29
    .line 30
    sput v2, LVa/Z8;->g:I

    .line 31
    .line 32
    rem-int/lit8 v0, v0, 0x2

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    const/16 v0, 0x3f

    .line 37
    .line 38
    div-int/lit8 v0, v0, 0x0

    .line 39
    .line 40
    :cond_0
    return v1
.end method

.method public final b(LVa/x8;)I
    .locals 2

    .line 1
    sget v0, LVa/Z8;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Z8;->g:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p1, p0}, LVa/x8;->e(LVa/c9;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    sget p1, LVa/Z8;->h:I

    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x1b

    .line 23
    .line 24
    rem-int/lit16 v0, p1, 0x80

    .line 25
    .line 26
    sput v0, LVa/Z8;->g:I

    .line 27
    .line 28
    rem-int/lit8 p1, p1, 0x2

    .line 29
    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    return p1

    .line 34
    :cond_0
    throw v1

    .line 35
    :cond_1
    iget-object p1, p0, LVa/Z8;->d:LVa/V8;

    .line 36
    .line 37
    invoke-virtual {p1}, LVa/V8;->a()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1

    .line 42
    :cond_2
    invoke-virtual {p1, p0}, LVa/x8;->e(LVa/c9;)Z

    .line 43
    .line 44
    .line 45
    throw v1
.end method

.method public final c(LVa/x8;LVa/y7;)LVa/s8;
    .locals 4

    .line 1
    iget-object v0, p0, LVa/Z8;->d:LVa/V8;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    :try_start_0
    new-instance v2, LVa/x8;

    .line 7
    .line 8
    invoke-direct {v2, p1}, LVa/x8;-><init>(LVa/x8;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v2, p2}, LVa/c9;->d(LVa/x8;LVa/y7;)LVa/s8;

    .line 12
    .line 13
    .line 14
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    sget p2, LVa/Z8;->h:I

    .line 16
    .line 17
    add-int/lit8 p2, p2, 0x9

    .line 18
    .line 19
    rem-int/lit16 v0, p2, 0x80

    .line 20
    .line 21
    sput v0, LVa/Z8;->g:I

    .line 22
    .line 23
    rem-int/lit8 p2, p2, 0x2

    .line 24
    .line 25
    if-nez p2, :cond_0

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    throw v1

    .line 29
    :catchall_0
    move-exception v2

    .line 30
    invoke-virtual {p1, v0}, LVa/x8;->k(LVa/c9;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, LVa/Z8;->e:LVa/V8;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p1, p0}, LVa/x8;->f(LVa/c9;)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Ljava/util/HashMap;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v3, p0, LVa/Z8;->f:LVa/J8;

    .line 46
    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    invoke-virtual {v3}, LVa/J8;->e()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-static {v3}, LVa/t8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    sget v2, LVa/Z8;->g:I

    .line 61
    .line 62
    add-int/lit8 v2, v2, 0x6f

    .line 63
    .line 64
    rem-int/lit16 v2, v2, 0x80

    .line 65
    .line 66
    sput v2, LVa/Z8;->h:I

    .line 67
    .line 68
    :cond_1
    new-instance v2, LVa/x8;

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-direct {v2, v1, p1, v3}, LVa/x8;-><init>(Ljava/util/HashMap;LVa/x8;Z)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v2, p2}, LVa/c9;->d(LVa/x8;LVa/y7;)LVa/s8;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_2
    new-instance p1, LVa/s8;

    .line 80
    .line 81
    invoke-direct {p1, v1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    sget v0, LVa/Z8;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x29

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Z8;->h:I

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-ne p0, p1, :cond_0

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    if-eqz p1, :cond_8

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-class v3, LVa/Z8;

    .line 21
    .line 22
    if-eq v3, v2, :cond_1

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_1
    check-cast p1, LVa/Z8;

    .line 26
    .line 27
    iget-object v2, p1, LVa/Z8;->d:LVa/V8;

    .line 28
    .line 29
    iget-object v3, p0, LVa/Z8;->d:LVa/V8;

    .line 30
    .line 31
    if-eqz v3, :cond_3

    .line 32
    .line 33
    sget v4, LVa/Z8;->g:I

    .line 34
    .line 35
    add-int/lit8 v4, v4, 0x53

    .line 36
    .line 37
    rem-int/lit16 v5, v4, 0x80

    .line 38
    .line 39
    sput v5, LVa/Z8;->h:I

    .line 40
    .line 41
    rem-int/lit8 v4, v4, 0x2

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    invoke-virtual {v3, v2}, LVa/V8;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const/16 v3, 0x18

    .line 50
    .line 51
    div-int/2addr v3, v1

    .line 52
    if-nez v2, :cond_4

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-virtual {v3, v2}, LVa/V8;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_4

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    if-eqz v2, :cond_4

    .line 63
    .line 64
    :goto_0
    return v1

    .line 65
    :cond_4
    iget-object v2, p1, LVa/Z8;->e:LVa/V8;

    .line 66
    .line 67
    iget-object v3, p0, LVa/Z8;->e:LVa/V8;

    .line 68
    .line 69
    if-eqz v3, :cond_5

    .line 70
    .line 71
    invoke-virtual {v3, v2}, LVa/V8;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-nez v2, :cond_6

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_5
    if-eqz v2, :cond_6

    .line 79
    .line 80
    :goto_1
    return v1

    .line 81
    :cond_6
    iget-object p1, p1, LVa/Z8;->f:LVa/J8;

    .line 82
    .line 83
    iget-object v2, p0, LVa/Z8;->f:LVa/J8;

    .line 84
    .line 85
    if-eqz v2, :cond_7

    .line 86
    .line 87
    sget v0, LVa/Z8;->g:I

    .line 88
    .line 89
    add-int/lit8 v0, v0, 0xf

    .line 90
    .line 91
    rem-int/lit16 v0, v0, 0x80

    .line 92
    .line 93
    sput v0, LVa/Z8;->h:I

    .line 94
    .line 95
    invoke-virtual {v2, p1}, LVa/J8;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    return p1

    .line 100
    :cond_7
    if-nez p1, :cond_8

    .line 101
    .line 102
    return v0

    .line 103
    :cond_8
    :goto_2
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    sget v0, LVa/Z8;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x63

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Z8;->g:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iget-object v1, p0, LVa/Z8;->d:LVa/V8;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, LVa/V8;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v1, v0

    .line 20
    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 21
    .line 22
    iget-object v2, p0, LVa/Z8;->e:LVa/V8;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    sget v3, LVa/Z8;->h:I

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x17

    .line 29
    .line 30
    rem-int/lit16 v3, v3, 0x80

    .line 31
    .line 32
    sput v3, LVa/Z8;->g:I

    .line 33
    .line 34
    invoke-virtual {v2}, LVa/V8;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v2, v0

    .line 40
    :goto_1
    add-int/2addr v1, v2

    .line 41
    mul-int/lit8 v1, v1, 0x1f

    .line 42
    .line 43
    iget-object v2, p0, LVa/Z8;->f:LVa/J8;

    .line 44
    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-virtual {v2}, LVa/J8;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    sget v2, LVa/Z8;->g:I

    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x77

    .line 55
    .line 56
    rem-int/lit16 v2, v2, 0x80

    .line 57
    .line 58
    sput v2, LVa/Z8;->h:I

    .line 59
    .line 60
    :goto_2
    add-int/2addr v1, v0

    .line 61
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    shr-int/lit8 v1, v1, 0x16

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x4

    .line 13
    .line 14
    const-string v2, "\uc2c3\u43e1\u9adb\u9716"

    .line 15
    .line 16
    invoke-static {v1, v2}, LVa/Z8;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, LVa/Z8;->d:LVa/V8;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    shr-int/lit8 v1, v1, 0x10

    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x8

    .line 39
    .line 40
    const-string v2, "\uede5\u9ea8\ued12\ua541\u43af\u6007\u32ca\u173f"

    .line 41
    .line 42
    invoke-static {v1, v2}, LVa/Z8;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, LVa/Z8;->f:LVa/J8;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const/16 v1, 0x30

    .line 59
    .line 60
    invoke-static {v1}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    add-int/lit8 v1, v1, -0x2e

    .line 65
    .line 66
    const-string v2, "\u4ccd\uafa8"

    .line 67
    .line 68
    invoke-static {v1, v2}, LVa/Z8;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, LVa/Z8;->e:LVa/V8;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sget v1, LVa/Z8;->g:I

    .line 89
    .line 90
    add-int/lit8 v1, v1, 0x7

    .line 91
    .line 92
    rem-int/lit16 v2, v1, 0x80

    .line 93
    .line 94
    sput v2, LVa/Z8;->h:I

    .line 95
    .line 96
    rem-int/lit8 v1, v1, 0x2

    .line 97
    .line 98
    if-nez v1, :cond_0

    .line 99
    .line 100
    const/16 v1, 0x1a

    .line 101
    .line 102
    div-int/lit8 v1, v1, 0x0

    .line 103
    .line 104
    :cond_0
    return-object v0
.end method
