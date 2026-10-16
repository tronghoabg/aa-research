.class public final LVa/Y8;
.super LVa/c9;
.source "SourceFile"


# static fields
.field public static final h:[I

.field public static i:I = 0x0

.field public static j:I = 0x1


# instance fields
.field public final d:LVa/y8;

.field public final e:LVa/y8;

.field public final f:LVa/y8;

.field public final g:LVa/c9;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/Y8;->h:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        -0x7dcba8be
        0x2578ac99
        -0x511c7a10
        0x37796468
        0x32604653
        0x390851d3    # 1.3000453E-4f
        -0x3fddd1af
        0x29d54d7f
        0x607fe049
        -0x199766bb
        0x493e3be1
        0x556dd3aa
        0x10c2a8be
        0x2951892a
        -0x11fe75c0
        -0x37e6f982
        0x56245e0d
        0x203db65f
    .end array-data
.end method

.method public constructor <init>(LVa/y8;LVa/y8;LVa/y8;LVa/c9;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/Y8;->d:LVa/y8;

    .line 5
    .line 6
    iput-object p2, p0, LVa/Y8;->e:LVa/y8;

    .line 7
    .line 8
    iput-object p3, p0, LVa/Y8;->f:LVa/y8;

    .line 9
    .line 10
    iput-object p4, p0, LVa/Y8;->g:LVa/c9;

    .line 11
    .line 12
    return-void
.end method

.method public static e(I[I)Ljava/lang/String;
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
    sget-object v4, LVa/Y8;->h:[I

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

.method public static f(LVa/y8;LVa/x8;LVa/y7;)V
    .locals 3

    .line 1
    sget v0, LVa/Y8;->j:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x59

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/Y8;->i:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x5d

    .line 16
    .line 17
    rem-int/lit16 v1, v0, 0x80

    .line 18
    .line 19
    sput v1, LVa/Y8;->i:I

    .line 20
    .line 21
    rem-int/lit8 v0, v0, 0x2

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 26
    .line 27
    .line 28
    const/16 p0, 0x33

    .line 29
    .line 30
    div-int/lit8 p0, p0, 0x0

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    invoke-virtual {p0, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void

    .line 37
    :cond_2
    const/4 p0, 0x0

    .line 38
    throw p0
.end method


# virtual methods
.method public final a()I
    .locals 2

    .line 1
    sget v0, LVa/Y8;->j:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Y8;->i:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/Y8;->g:LVa/c9;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, LVa/c9;->a()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_0
    invoke-virtual {v1}, LVa/c9;->a()I

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    throw v0
.end method

.method public final c(LVa/x8;LVa/y7;)LVa/s8;
    .locals 4

    .line 1
    iget-object v0, p0, LVa/Y8;->d:LVa/y8;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, LVa/Y8;->f(LVa/y8;LVa/x8;LVa/y7;)V

    .line 4
    .line 5
    .line 6
    :goto_0
    iget-object v0, p0, LVa/Y8;->e:LVa/y8;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, LVa/s8;->e()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    sget v0, LVa/Y8;->i:I

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x65

    .line 22
    .line 23
    rem-int/lit16 v2, v0, 0x80

    .line 24
    .line 25
    sput v2, LVa/Y8;->j:I

    .line 26
    .line 27
    rem-int/lit8 v0, v0, 0x2

    .line 28
    .line 29
    iget-object v2, p0, LVa/Y8;->g:LVa/c9;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {v2, p1, p2}, LVa/c9;->d(LVa/x8;LVa/y7;)LVa/s8;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, LVa/s8;->g()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const/4 v3, 0x1

    .line 42
    xor-int/2addr v2, v3

    .line 43
    if-eq v2, v3, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-virtual {v0}, LVa/s8;->b()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    sget p1, LVa/Y8;->j:I

    .line 53
    .line 54
    add-int/lit8 p1, p1, 0x19

    .line 55
    .line 56
    rem-int/lit16 p1, p1, 0x80

    .line 57
    .line 58
    sput p1, LVa/Y8;->i:I

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_1
    iget-object v0, p0, LVa/Y8;->f:LVa/y8;

    .line 62
    .line 63
    invoke-static {v0, p1, p2}, LVa/Y8;->f(LVa/y8;LVa/x8;LVa/y7;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {v2, p1, p2}, LVa/c9;->d(LVa/x8;LVa/y7;)LVa/s8;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, LVa/s8;->g()Z

    .line 72
    .line 73
    .line 74
    throw v1

    .line 75
    :cond_3
    :goto_1
    new-instance p1, LVa/s8;

    .line 76
    .line 77
    invoke-direct {p1, v1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_b

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, LVa/Y8;

    .line 13
    .line 14
    if-eq v3, v2, :cond_1

    .line 15
    .line 16
    goto :goto_3

    .line 17
    :cond_1
    check-cast p1, LVa/Y8;

    .line 18
    .line 19
    iget-object v2, p1, LVa/Y8;->d:LVa/y8;

    .line 20
    .line 21
    iget-object v3, p0, LVa/Y8;->d:LVa/y8;

    .line 22
    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    if-eqz v2, :cond_3

    .line 33
    .line 34
    :goto_0
    return v1

    .line 35
    :cond_3
    iget-object v2, p1, LVa/Y8;->e:LVa/y8;

    .line 36
    .line 37
    iget-object v3, p0, LVa/Y8;->e:LVa/y8;

    .line 38
    .line 39
    if-eqz v3, :cond_4

    .line 40
    .line 41
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_5

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_4
    if-eqz v2, :cond_5

    .line 49
    .line 50
    :goto_1
    return v1

    .line 51
    :cond_5
    iget-object v2, p1, LVa/Y8;->f:LVa/y8;

    .line 52
    .line 53
    iget-object v3, p0, LVa/Y8;->f:LVa/y8;

    .line 54
    .line 55
    if-eqz v3, :cond_6

    .line 56
    .line 57
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_7

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_6
    if-eqz v2, :cond_7

    .line 65
    .line 66
    :goto_2
    return v1

    .line 67
    :cond_7
    iget-object p1, p1, LVa/Y8;->g:LVa/c9;

    .line 68
    .line 69
    iget-object v2, p0, LVa/Y8;->g:LVa/c9;

    .line 70
    .line 71
    if-eqz v2, :cond_8

    .line 72
    .line 73
    sget v0, LVa/Y8;->i:I

    .line 74
    .line 75
    add-int/lit8 v0, v0, 0xd

    .line 76
    .line 77
    rem-int/lit16 v0, v0, 0x80

    .line 78
    .line 79
    sput v0, LVa/Y8;->j:I

    .line 80
    .line 81
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    return p1

    .line 86
    :cond_8
    if-nez p1, :cond_9

    .line 87
    .line 88
    sget p1, LVa/Y8;->j:I

    .line 89
    .line 90
    add-int/lit8 p1, p1, 0x59

    .line 91
    .line 92
    rem-int/lit16 p1, p1, 0x80

    .line 93
    .line 94
    sput p1, LVa/Y8;->i:I

    .line 95
    .line 96
    return v0

    .line 97
    :cond_9
    sget p1, LVa/Y8;->i:I

    .line 98
    .line 99
    add-int/lit8 p1, p1, 0x7

    .line 100
    .line 101
    rem-int/lit16 v0, p1, 0x80

    .line 102
    .line 103
    sput v0, LVa/Y8;->j:I

    .line 104
    .line 105
    rem-int/lit8 p1, p1, 0x2

    .line 106
    .line 107
    if-eqz p1, :cond_a

    .line 108
    .line 109
    return v1

    .line 110
    :cond_a
    const/4 p1, 0x0

    .line 111
    throw p1

    .line 112
    :cond_b
    :goto_3
    return v1
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LVa/Y8;->d:LVa/y8;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, LVa/Y8;->e:LVa/y8;

    .line 15
    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    sget v3, LVa/Y8;->i:I

    .line 19
    .line 20
    add-int/lit8 v3, v3, 0x31

    .line 21
    .line 22
    rem-int/lit16 v4, v3, 0x80

    .line 23
    .line 24
    sput v4, LVa/Y8;->j:I

    .line 25
    .line 26
    rem-int/lit8 v3, v3, 0x2

    .line 27
    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/16 v3, 0x50

    .line 35
    .line 36
    div-int/2addr v3, v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move v2, v0

    .line 44
    :goto_1
    add-int/2addr v1, v2

    .line 45
    mul-int/lit8 v1, v1, 0x1f

    .line 46
    .line 47
    iget-object v2, p0, LVa/Y8;->f:LVa/y8;

    .line 48
    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    goto :goto_2

    .line 56
    :cond_3
    move v2, v0

    .line 57
    :goto_2
    add-int/2addr v1, v2

    .line 58
    mul-int/lit8 v1, v1, 0x1f

    .line 59
    .line 60
    iget-object v2, p0, LVa/Y8;->g:LVa/c9;

    .line 61
    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    sget v2, LVa/Y8;->j:I

    .line 70
    .line 71
    add-int/lit8 v2, v2, 0x69

    .line 72
    .line 73
    rem-int/lit16 v2, v2, 0x80

    .line 74
    .line 75
    sput v2, LVa/Y8;->i:I

    .line 76
    .line 77
    :goto_3
    add-int/2addr v1, v0

    .line 78
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const v1, 0x729352f9

    .line 7
    .line 8
    .line 9
    const v2, -0x256f6e16

    .line 10
    .line 11
    .line 12
    const v3, -0x1fb70145

    .line 13
    .line 14
    .line 15
    const v4, 0x19a9fb6c

    .line 16
    .line 17
    .line 18
    filled-new-array {v3, v4, v1, v2}, [I

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    rsub-int/lit8 v4, v4, 0x5

    .line 29
    .line 30
    invoke-static {v4, v1}, LVa/Y8;->e(I[I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, LVa/Y8;->d:LVa/y8;

    .line 42
    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    sget v1, LVa/Y8;->i:I

    .line 49
    .line 50
    add-int/lit8 v1, v1, 0x49

    .line 51
    .line 52
    rem-int/lit16 v1, v1, 0x80

    .line 53
    .line 54
    sput v1, LVa/Y8;->j:I

    .line 55
    .line 56
    :cond_0
    const v1, -0x357f024b    # -4226778.5f

    .line 57
    .line 58
    .line 59
    const v4, 0x487ddd51

    .line 60
    .line 61
    .line 62
    filled-new-array {v1, v4}, [I

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    const/4 v6, 0x0

    .line 67
    invoke-static {v6, v6}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    add-int/lit8 v6, v6, 0x2

    .line 72
    .line 73
    invoke-static {v6, v5}, LVa/Y8;->e(I[I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-object v5, p0, LVa/Y8;->e:LVa/y8;

    .line 85
    .line 86
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    filled-new-array {v1, v4}, [I

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    cmp-long v2, v4, v2

    .line 98
    .line 99
    rsub-int/lit8 v2, v2, 0x3

    .line 100
    .line 101
    invoke-static {v2, v1}, LVa/Y8;->e(I[I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    iget-object v1, p0, LVa/Y8;->f:LVa/y8;

    .line 113
    .line 114
    if-eqz v1, :cond_1

    .line 115
    .line 116
    sget v2, LVa/Y8;->j:I

    .line 117
    .line 118
    add-int/lit8 v2, v2, 0x69

    .line 119
    .line 120
    rem-int/lit16 v2, v2, 0x80

    .line 121
    .line 122
    sput v2, LVa/Y8;->i:I

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    :cond_1
    const v1, -0x375f5d38    # -328982.25f

    .line 128
    .line 129
    .line 130
    const v2, 0x1352d1c8

    .line 131
    .line 132
    .line 133
    filled-new-array {v1, v2}, [I

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    shr-int/lit8 v2, v2, 0x10

    .line 142
    .line 143
    rsub-int/lit8 v2, v2, 0x2

    .line 144
    .line 145
    invoke-static {v2, v1}, LVa/Y8;->e(I[I)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    iget-object v1, p0, LVa/Y8;->g:LVa/c9;

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    sget v1, LVa/Y8;->j:I

    .line 166
    .line 167
    add-int/lit8 v1, v1, 0x31

    .line 168
    .line 169
    rem-int/lit16 v2, v1, 0x80

    .line 170
    .line 171
    sput v2, LVa/Y8;->i:I

    .line 172
    .line 173
    rem-int/lit8 v1, v1, 0x2

    .line 174
    .line 175
    if-nez v1, :cond_2

    .line 176
    .line 177
    return-object v0

    .line 178
    :cond_2
    const/4 v0, 0x0

    .line 179
    throw v0
.end method
