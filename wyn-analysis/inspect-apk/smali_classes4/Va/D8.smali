.class public final LVa/D8;
.super LVa/y8;
.source "SourceFile"


# static fields
.field public static f:I = 0x0

.field public static g:I = 0x1


# instance fields
.field public final d:LVa/y8;

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(LVa/y8;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/D8;->d:LVa/y8;

    .line 5
    .line 6
    iput-object p2, p0, LVa/D8;->e:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(LVa/x8;LVa/y7;)LVa/s8;
    .locals 2

    .line 1
    sget v0, LVa/D8;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/D8;->g:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/D8;->d:LVa/y8;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, LVa/s8;->c()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    instance-of p2, p1, LVa/y7;

    .line 20
    .line 21
    iget-object v0, p0, LVa/D8;->e:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    new-instance p2, LVa/s8;

    .line 26
    .line 27
    check-cast p1, LVa/y7;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, LVa/y7;->q(Ljava/lang/String;)LVa/r8;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {p2, p1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget p1, LVa/D8;->g:I

    .line 37
    .line 38
    add-int/lit8 p1, p1, 0x15

    .line 39
    .line 40
    rem-int/lit16 p1, p1, 0x80

    .line 41
    .line 42
    sput p1, LVa/D8;->f:I

    .line 43
    .line 44
    return-object p2

    .line 45
    :cond_0
    :try_start_0
    new-instance p2, LVa/s8;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {p2, p1}, LVa/s8;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    return-object p2

    .line 63
    :catch_0
    new-instance p1, LVa/s8;

    .line 64
    .line 65
    const/4 p2, 0x0

    .line 66
    invoke-direct {p1, p2}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

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
    if-eqz p1, :cond_6

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, LVa/D8;

    .line 13
    .line 14
    if-eq v3, v2, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    check-cast p1, LVa/D8;

    .line 18
    .line 19
    iget-object v2, p1, LVa/D8;->d:LVa/y8;

    .line 20
    .line 21
    iget-object v3, p0, LVa/D8;->d:LVa/y8;

    .line 22
    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    sget v4, LVa/D8;->g:I

    .line 26
    .line 27
    add-int/lit8 v4, v4, 0x1f

    .line 28
    .line 29
    rem-int/lit16 v4, v4, 0x80

    .line 30
    .line 31
    sput v4, LVa/D8;->f:I

    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_3

    .line 38
    .line 39
    sget p1, LVa/D8;->g:I

    .line 40
    .line 41
    add-int/lit8 p1, p1, 0x31

    .line 42
    .line 43
    rem-int/lit16 p1, p1, 0x80

    .line 44
    .line 45
    sput p1, LVa/D8;->f:I

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    if-eqz v2, :cond_3

    .line 49
    .line 50
    :goto_0
    return v1

    .line 51
    :cond_3
    iget-object p1, p1, LVa/D8;->e:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v2, p0, LVa/D8;->e:Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    return p1

    .line 62
    :cond_4
    if-nez p1, :cond_6

    .line 63
    .line 64
    sget p1, LVa/D8;->g:I

    .line 65
    .line 66
    add-int/lit8 p1, p1, 0x1d

    .line 67
    .line 68
    rem-int/lit16 v2, p1, 0x80

    .line 69
    .line 70
    sput v2, LVa/D8;->f:I

    .line 71
    .line 72
    rem-int/lit8 p1, p1, 0x2

    .line 73
    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    return v1

    .line 77
    :cond_5
    return v0

    .line 78
    :cond_6
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    sget v0, LVa/D8;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/D8;->g:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iget-object v2, p0, LVa/D8;->d:LVa/y8;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/16 v0, 0x36

    .line 17
    .line 18
    div-int/2addr v0, v1

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    if-eqz v2, :cond_1

    .line 23
    .line 24
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v0, v1

    .line 30
    :goto_1
    mul-int/lit8 v0, v0, 0x1f

    .line 31
    .line 32
    iget-object v2, p0, LVa/D8;->e:Ljava/lang/String;

    .line 33
    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    :cond_2
    add-int/2addr v0, v1

    .line 41
    sget v1, LVa/D8;->g:I

    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x17

    .line 44
    .line 45
    rem-int/lit16 v1, v1, 0x80

    .line 46
    .line 47
    sput v1, LVa/D8;->f:I

    .line 48
    .line 49
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v1, LVa/D8;->d:LVa/y8;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, "\u8baa\ue6ee"

    .line 18
    .line 19
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    shr-int/lit8 v3, v3, 0x8

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    rsub-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, [C

    .line 33
    .line 34
    sget-object v5, LVa/Ab;->F:Ljava/lang/Object;

    .line 35
    .line 36
    monitor-enter v5

    .line 37
    :try_start_0
    array-length v6, v2

    .line 38
    new-array v6, v6, [C

    .line 39
    .line 40
    const/4 v7, 0x0

    .line 41
    sput v7, LVa/Ab;->E:I

    .line 42
    .line 43
    const/4 v8, 0x2

    .line 44
    new-array v9, v8, [C

    .line 45
    .line 46
    :goto_0
    sget v10, LVa/Ab;->E:I

    .line 47
    .line 48
    array-length v11, v2

    .line 49
    if-ge v10, v11, :cond_1

    .line 50
    .line 51
    aget-char v11, v2, v10

    .line 52
    .line 53
    aput-char v11, v9, v7

    .line 54
    .line 55
    add-int/lit8 v10, v10, 0x1

    .line 56
    .line 57
    aget-char v10, v2, v10

    .line 58
    .line 59
    aput-char v10, v9, v4

    .line 60
    .line 61
    const v10, 0xe370

    .line 62
    .line 63
    .line 64
    move v11, v7

    .line 65
    :goto_1
    const/16 v12, 0x10

    .line 66
    .line 67
    if-ge v11, v12, :cond_0

    .line 68
    .line 69
    aget-char v12, v9, v4

    .line 70
    .line 71
    aget-char v13, v9, v7

    .line 72
    .line 73
    add-int v14, v13, v10

    .line 74
    .line 75
    shl-int/lit8 v15, v13, 0x4

    .line 76
    .line 77
    const v16, 0xe224

    .line 78
    .line 79
    .line 80
    add-int v15, v15, v16

    .line 81
    .line 82
    xor-int/2addr v14, v15

    .line 83
    ushr-int/lit8 v15, v13, 0x5

    .line 84
    .line 85
    const v16, 0xd714

    .line 86
    .line 87
    .line 88
    add-int v15, v15, v16

    .line 89
    .line 90
    xor-int/2addr v14, v15

    .line 91
    sub-int/2addr v12, v14

    .line 92
    int-to-char v12, v12

    .line 93
    aput-char v12, v9, v4

    .line 94
    .line 95
    add-int v14, v12, v10

    .line 96
    .line 97
    shl-int/lit8 v15, v12, 0x4

    .line 98
    .line 99
    add-int/lit16 v15, v15, 0x215

    .line 100
    .line 101
    xor-int/2addr v14, v15

    .line 102
    ushr-int/lit8 v12, v12, 0x5

    .line 103
    .line 104
    const v15, 0xe4fc

    .line 105
    .line 106
    .line 107
    add-int/2addr v12, v15

    .line 108
    xor-int/2addr v12, v14

    .line 109
    sub-int/2addr v13, v12

    .line 110
    int-to-char v12, v13

    .line 111
    aput-char v12, v9, v7

    .line 112
    .line 113
    const v12, 0x9e37

    .line 114
    .line 115
    .line 116
    sub-int/2addr v10, v12

    .line 117
    add-int/lit8 v11, v11, 0x1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :catchall_0
    move-exception v0

    .line 121
    goto :goto_2

    .line 122
    :cond_0
    sget v10, LVa/Ab;->E:I

    .line 123
    .line 124
    aget-char v11, v9, v7

    .line 125
    .line 126
    aput-char v11, v6, v10

    .line 127
    .line 128
    add-int/lit8 v11, v10, 0x1

    .line 129
    .line 130
    aget-char v12, v9, v4

    .line 131
    .line 132
    aput-char v12, v6, v11

    .line 133
    .line 134
    add-int/lit8 v10, v10, 0x2

    .line 135
    .line 136
    sput v10, LVa/Ab;->E:I

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_1
    new-instance v2, Ljava/lang/String;

    .line 140
    .line 141
    invoke-direct {v2, v6, v7, v3}, Ljava/lang/String;-><init>([CII)V

    .line 142
    .line 143
    .line 144
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    iget-object v2, v1, LVa/D8;->e:Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    sget v2, LVa/D8;->g:I

    .line 162
    .line 163
    add-int/lit8 v2, v2, 0x5d

    .line 164
    .line 165
    rem-int/lit16 v3, v2, 0x80

    .line 166
    .line 167
    sput v3, LVa/D8;->f:I

    .line 168
    .line 169
    rem-int/2addr v2, v8

    .line 170
    if-eqz v2, :cond_2

    .line 171
    .line 172
    const/16 v2, 0xc

    .line 173
    .line 174
    div-int/2addr v2, v7

    .line 175
    :cond_2
    return-object v0

    .line 176
    :goto_2
    monitor-exit v5

    .line 177
    throw v0
.end method
