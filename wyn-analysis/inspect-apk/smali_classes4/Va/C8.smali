.class public final LVa/C8;
.super LVa/y8;
.source "SourceFile"


# static fields
.field public static f:I = 0x0

.field public static g:I = 0x1


# instance fields
.field public final d:LVa/J8;

.field public final e:LVa/y8;


# direct methods
.method public constructor <init>(LVa/J8;LVa/y8;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/C8;->d:LVa/J8;

    .line 5
    .line 6
    iput-object p2, p0, LVa/C8;->e:LVa/y8;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(LVa/x8;LVa/y7;)LVa/s8;
    .locals 2

    .line 1
    sget v0, LVa/C8;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/C8;->g:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/C8;->e:LVa/y8;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iget-object v0, p0, LVa/C8;->d:LVa/J8;

    .line 16
    .line 17
    invoke-virtual {v0}, LVa/J8;->e()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p2}, LVa/s8;->c()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p1, v1, v0}, LVa/x8;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    sget p1, LVa/C8;->g:I

    .line 29
    .line 30
    add-int/lit8 p1, p1, 0x29

    .line 31
    .line 32
    rem-int/lit16 p1, p1, 0x80

    .line 33
    .line 34
    sput p1, LVa/C8;->f:I

    .line 35
    .line 36
    return-object p2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne p0, p1, :cond_1

    .line 4
    .line 5
    sget p1, LVa/C8;->g:I

    .line 6
    .line 7
    add-int/lit8 p1, p1, 0x67

    .line 8
    .line 9
    rem-int/lit16 v2, p1, 0x80

    .line 10
    .line 11
    sput v2, LVa/C8;->f:I

    .line 12
    .line 13
    rem-int/lit8 p1, p1, 0x2

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    throw v0

    .line 19
    :cond_1
    const/4 v2, 0x0

    .line 20
    if-eqz p1, :cond_8

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-class v4, LVa/C8;

    .line 27
    .line 28
    if-eq v4, v3, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    check-cast p1, LVa/C8;

    .line 32
    .line 33
    iget-object v3, p1, LVa/C8;->d:LVa/J8;

    .line 34
    .line 35
    iget-object v4, p0, LVa/C8;->d:LVa/J8;

    .line 36
    .line 37
    if-eqz v4, :cond_3

    .line 38
    .line 39
    invoke-virtual {v4, v3}, LVa/J8;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_5

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    if-eqz v3, :cond_5

    .line 47
    .line 48
    :goto_0
    sget p1, LVa/C8;->g:I

    .line 49
    .line 50
    add-int/lit8 p1, p1, 0x43

    .line 51
    .line 52
    rem-int/lit16 v1, p1, 0x80

    .line 53
    .line 54
    sput v1, LVa/C8;->f:I

    .line 55
    .line 56
    rem-int/lit8 p1, p1, 0x2

    .line 57
    .line 58
    if-nez p1, :cond_4

    .line 59
    .line 60
    return v2

    .line 61
    :cond_4
    throw v0

    .line 62
    :cond_5
    iget-object p1, p1, LVa/C8;->e:LVa/y8;

    .line 63
    .line 64
    iget-object v0, p0, LVa/C8;->e:LVa/y8;

    .line 65
    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    return p1

    .line 73
    :cond_6
    if-nez p1, :cond_8

    .line 74
    .line 75
    sget p1, LVa/C8;->f:I

    .line 76
    .line 77
    add-int/lit8 p1, p1, 0x6d

    .line 78
    .line 79
    rem-int/lit16 v0, p1, 0x80

    .line 80
    .line 81
    sput v0, LVa/C8;->g:I

    .line 82
    .line 83
    rem-int/lit8 p1, p1, 0x2

    .line 84
    .line 85
    if-nez p1, :cond_7

    .line 86
    .line 87
    return v2

    .line 88
    :cond_7
    return v1

    .line 89
    :cond_8
    :goto_1
    return v2
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LVa/C8;->d:LVa/J8;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {v1}, LVa/J8;->hashCode()I

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
    iget-object v2, p0, LVa/C8;->e:LVa/y8;

    .line 15
    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    sget v0, LVa/C8;->f:I

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x3b

    .line 21
    .line 22
    rem-int/lit16 v3, v0, 0x80

    .line 23
    .line 24
    sput v3, LVa/C8;->g:I

    .line 25
    .line 26
    rem-int/lit8 v0, v0, 0x2

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sget v2, LVa/C8;->f:I

    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x4d

    .line 37
    .line 38
    rem-int/lit16 v2, v2, 0x80

    .line 39
    .line 40
    sput v2, LVa/C8;->g:I

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    throw v0

    .line 48
    :cond_2
    :goto_1
    add-int/2addr v1, v0

    .line 49
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 15

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LVa/C8;->d:LVa/J8;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "\uc2d7\u3e39\ud2c4\uda65"

    .line 12
    .line 13
    const-string v2, ""

    .line 14
    .line 15
    const/16 v3, 0x30

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-static {v2, v3, v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/lit8 v2, v2, 0x4

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, [C

    .line 29
    .line 30
    sget-object v3, LVa/Ab;->F:Ljava/lang/Object;

    .line 31
    .line 32
    monitor-enter v3

    .line 33
    :try_start_0
    array-length v5, v1

    .line 34
    new-array v5, v5, [C

    .line 35
    .line 36
    sput v4, LVa/Ab;->E:I

    .line 37
    .line 38
    const/4 v6, 0x2

    .line 39
    new-array v6, v6, [C

    .line 40
    .line 41
    :goto_0
    sget v7, LVa/Ab;->E:I

    .line 42
    .line 43
    array-length v8, v1

    .line 44
    if-ge v7, v8, :cond_1

    .line 45
    .line 46
    aget-char v8, v1, v7

    .line 47
    .line 48
    aput-char v8, v6, v4

    .line 49
    .line 50
    add-int/lit8 v7, v7, 0x1

    .line 51
    .line 52
    aget-char v7, v1, v7

    .line 53
    .line 54
    const/4 v8, 0x1

    .line 55
    aput-char v7, v6, v8

    .line 56
    .line 57
    const v7, 0xe370

    .line 58
    .line 59
    .line 60
    move v9, v4

    .line 61
    :goto_1
    const/16 v10, 0x10

    .line 62
    .line 63
    if-ge v9, v10, :cond_0

    .line 64
    .line 65
    aget-char v10, v6, v8

    .line 66
    .line 67
    aget-char v11, v6, v4

    .line 68
    .line 69
    add-int v12, v11, v7

    .line 70
    .line 71
    shl-int/lit8 v13, v11, 0x4

    .line 72
    .line 73
    const v14, 0xf99a

    .line 74
    .line 75
    .line 76
    add-int/2addr v13, v14

    .line 77
    xor-int/2addr v12, v13

    .line 78
    ushr-int/lit8 v13, v11, 0x5

    .line 79
    .line 80
    const v14, 0x905b

    .line 81
    .line 82
    .line 83
    add-int/2addr v13, v14

    .line 84
    xor-int/2addr v12, v13

    .line 85
    sub-int/2addr v10, v12

    .line 86
    int-to-char v10, v10

    .line 87
    aput-char v10, v6, v8

    .line 88
    .line 89
    add-int v12, v10, v7

    .line 90
    .line 91
    shl-int/lit8 v13, v10, 0x4

    .line 92
    .line 93
    const v14, 0xd00d

    .line 94
    .line 95
    .line 96
    add-int/2addr v13, v14

    .line 97
    xor-int/2addr v12, v13

    .line 98
    ushr-int/lit8 v10, v10, 0x5

    .line 99
    .line 100
    const v13, 0xd7ac

    .line 101
    .line 102
    .line 103
    add-int/2addr v10, v13

    .line 104
    xor-int/2addr v10, v12

    .line 105
    sub-int/2addr v11, v10

    .line 106
    int-to-char v10, v11

    .line 107
    aput-char v10, v6, v4

    .line 108
    .line 109
    const v10, 0x9e37

    .line 110
    .line 111
    .line 112
    sub-int/2addr v7, v10

    .line 113
    add-int/lit8 v9, v9, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :catchall_0
    move-exception v0

    .line 117
    goto :goto_2

    .line 118
    :cond_0
    sget v7, LVa/Ab;->E:I

    .line 119
    .line 120
    aget-char v9, v6, v4

    .line 121
    .line 122
    aput-char v9, v5, v7

    .line 123
    .line 124
    add-int/lit8 v9, v7, 0x1

    .line 125
    .line 126
    aget-char v8, v6, v8

    .line 127
    .line 128
    aput-char v8, v5, v9

    .line 129
    .line 130
    add-int/lit8 v7, v7, 0x2

    .line 131
    .line 132
    sput v7, LVa/Ab;->E:I

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_1
    new-instance v1, Ljava/lang/String;

    .line 136
    .line 137
    invoke-direct {v1, v5, v4, v2}, Ljava/lang/String;-><init>([CII)V

    .line 138
    .line 139
    .line 140
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    iget-object v1, p0, LVa/C8;->e:LVa/y8;

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    sget v1, LVa/C8;->f:I

    .line 158
    .line 159
    add-int/lit8 v1, v1, 0x79

    .line 160
    .line 161
    rem-int/lit16 v1, v1, 0x80

    .line 162
    .line 163
    sput v1, LVa/C8;->g:I

    .line 164
    .line 165
    return-object v0

    .line 166
    :goto_2
    monitor-exit v3

    .line 167
    throw v0
.end method
