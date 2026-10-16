.class public final LVa/J9;
.super LVa/m9;
.source "SourceFile"


# static fields
.field public static h:I = 0x0

.field public static i:I = 0x1


# virtual methods
.method public final c()LVa/Z0;
    .locals 3

    .line 1
    new-instance v0, LVa/m7;

    .line 2
    .line 3
    invoke-virtual {p0}, LVa/m9;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, LVa/Z0;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget v1, LVa/J9;->h:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x65

    .line 13
    .line 14
    rem-int/lit16 v2, v1, 0x80

    .line 15
    .line 16
    sput v2, LVa/J9;->i:I

    .line 17
    .line 18
    rem-int/lit8 v1, v1, 0x2

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    const/16 v1, 0x5d

    .line 23
    .line 24
    div-int/lit8 v1, v1, 0x0

    .line 25
    .line 26
    :cond_0
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 15

    .line 1
    sget v0, LVa/J9;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x39

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/J9;->i:I

    .line 8
    .line 9
    const-string v0, "\ubf8d\uad67\uf237\u541f\u9b88\uf48f\u3111\u88ea\uc93e\u25d6\ue17f\u9252\u9eeb\u89db\u1b68\uad46\u51c5\uabd7\u9099\ub90a\u77cd\u487f\u86f3\u530e\u6d99\uf02e\ue10c\uc5e1\ub5c6\ua6c2\u0646\u18a9\uccab\u4d0f\u3111\u88ea\uc93e\u25d6\u0d18\u7c36\ue03a\ue560\uff57\uac64\u9047\uc8df\uc7fe\u8baa"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    rsub-int/lit8 v2, v2, 0x2f

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, [C

    .line 23
    .line 24
    sget-object v3, LVa/Ab;->F:Ljava/lang/Object;

    .line 25
    .line 26
    monitor-enter v3

    .line 27
    :try_start_0
    array-length v4, v0

    .line 28
    new-array v4, v4, [C

    .line 29
    .line 30
    sput v1, LVa/Ab;->E:I

    .line 31
    .line 32
    const/4 v5, 0x2

    .line 33
    new-array v6, v5, [C

    .line 34
    .line 35
    :goto_0
    sget v7, LVa/Ab;->E:I

    .line 36
    .line 37
    array-length v8, v0

    .line 38
    if-ge v7, v8, :cond_1

    .line 39
    .line 40
    aget-char v8, v0, v7

    .line 41
    .line 42
    aput-char v8, v6, v1

    .line 43
    .line 44
    add-int/lit8 v7, v7, 0x1

    .line 45
    .line 46
    aget-char v7, v0, v7

    .line 47
    .line 48
    const/4 v8, 0x1

    .line 49
    aput-char v7, v6, v8

    .line 50
    .line 51
    const v7, 0xe370

    .line 52
    .line 53
    .line 54
    move v9, v1

    .line 55
    :goto_1
    const/16 v10, 0x10

    .line 56
    .line 57
    if-ge v9, v10, :cond_0

    .line 58
    .line 59
    aget-char v10, v6, v8

    .line 60
    .line 61
    aget-char v11, v6, v1

    .line 62
    .line 63
    add-int v12, v11, v7

    .line 64
    .line 65
    shl-int/lit8 v13, v11, 0x4

    .line 66
    .line 67
    const v14, 0xe63f

    .line 68
    .line 69
    .line 70
    add-int/2addr v13, v14

    .line 71
    xor-int/2addr v12, v13

    .line 72
    ushr-int/lit8 v13, v11, 0x5

    .line 73
    .line 74
    add-int/lit16 v13, v13, 0x690

    .line 75
    .line 76
    xor-int/2addr v12, v13

    .line 77
    sub-int/2addr v10, v12

    .line 78
    int-to-char v10, v10

    .line 79
    aput-char v10, v6, v8

    .line 80
    .line 81
    add-int v12, v10, v7

    .line 82
    .line 83
    shl-int/lit8 v13, v10, 0x4

    .line 84
    .line 85
    add-int/lit16 v13, v13, 0x78b4

    .line 86
    .line 87
    xor-int/2addr v12, v13

    .line 88
    ushr-int/lit8 v10, v10, 0x5

    .line 89
    .line 90
    const v13, 0xe574

    .line 91
    .line 92
    .line 93
    add-int/2addr v10, v13

    .line 94
    xor-int/2addr v10, v12

    .line 95
    sub-int/2addr v11, v10

    .line 96
    int-to-char v10, v11

    .line 97
    aput-char v10, v6, v1

    .line 98
    .line 99
    const v10, 0x9e37

    .line 100
    .line 101
    .line 102
    sub-int/2addr v7, v10

    .line 103
    add-int/lit8 v9, v9, 0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :catchall_0
    move-exception v0

    .line 107
    goto :goto_2

    .line 108
    :cond_0
    sget v7, LVa/Ab;->E:I

    .line 109
    .line 110
    aget-char v9, v6, v1

    .line 111
    .line 112
    aput-char v9, v4, v7

    .line 113
    .line 114
    add-int/lit8 v9, v7, 0x1

    .line 115
    .line 116
    aget-char v8, v6, v8

    .line 117
    .line 118
    aput-char v8, v4, v9

    .line 119
    .line 120
    add-int/lit8 v7, v7, 0x2

    .line 121
    .line 122
    sput v7, LVa/Ab;->E:I

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_1
    new-instance v0, Ljava/lang/String;

    .line 126
    .line 127
    invoke-direct {v0, v4, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 128
    .line 129
    .line 130
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    sget v2, LVa/J9;->h:I

    .line 136
    .line 137
    add-int/lit8 v2, v2, 0x65

    .line 138
    .line 139
    rem-int/lit16 v3, v2, 0x80

    .line 140
    .line 141
    sput v3, LVa/J9;->i:I

    .line 142
    .line 143
    rem-int/2addr v2, v5

    .line 144
    if-nez v2, :cond_2

    .line 145
    .line 146
    const/16 v2, 0x12

    .line 147
    .line 148
    div-int/2addr v2, v1

    .line 149
    :cond_2
    return-object v0

    .line 150
    :goto_2
    monitor-exit v3

    .line 151
    throw v0
.end method

.method public final e()Ljava/lang/Class;
    .locals 2

    .line 1
    sget v0, LVa/J9;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x77

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/J9;->h:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-class v0, Lcom/vungle/ads/internal/network/VungleApiClient;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    throw v0
.end method
