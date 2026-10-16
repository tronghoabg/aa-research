.class public final LVa/Q8;
.super LVa/N8;
.source "SourceFile"


# static fields
.field public static k:I = 0x0

.field public static l:I = 0x1

.field public static m:I = 0x0

.field public static n:I = 0x1


# instance fields
.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(LVa/y8;LVa/y8;I)V
    .locals 0

    .line 1
    iput p3, p0, LVa/Q8;->j:I

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, LVa/N8;-><init>(LVa/y8;LVa/y8;I)V

    return-void
.end method

.method public static m(I)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "\u29eb\u1114"

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [C

    .line 8
    .line 9
    sget-object v1, LVa/a;->u:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    sput p0, LVa/a;->t:I

    .line 13
    .line 14
    array-length p0, v0

    .line 15
    new-array p0, p0, [C

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    sput v2, LVa/a;->s:I

    .line 19
    .line 20
    :goto_0
    sget v2, LVa/a;->s:I

    .line 21
    .line 22
    array-length v3, v0

    .line 23
    if-ge v2, v3, :cond_0

    .line 24
    .line 25
    aget-char v3, v0, v2

    .line 26
    .line 27
    sget v4, LVa/a;->t:I

    .line 28
    .line 29
    mul-int/2addr v4, v2

    .line 30
    xor-int/2addr v3, v4

    .line 31
    int-to-long v3, v3

    .line 32
    const-wide v5, 0x5ef6015ffc1429d6L    # 2.8137568084562823E149

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    xor-long/2addr v3, v5

    .line 38
    long-to-int v3, v3

    .line 39
    int-to-char v3, v3

    .line 40
    aput-char v3, p0, v2

    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    sput v2, LVa/a;->s:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    new-instance v0, Ljava/lang/String;

    .line 50
    .line 51
    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    .line 52
    .line 53
    .line 54
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    return-object v0

    .line 56
    :goto_1
    monitor-exit v1

    .line 57
    throw p0
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 15

    .line 1
    iget v0, p0, LVa/Q8;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget v0, LVa/Q8;->n:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x6b

    .line 9
    .line 10
    rem-int/lit16 v0, v0, 0x80

    .line 11
    .line 12
    sput v0, LVa/Q8;->m:I

    .line 13
    .line 14
    const-string v0, "\u80cb\u55e9"

    .line 15
    .line 16
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/16 v2, 0x10

    .line 21
    .line 22
    shr-int/2addr v1, v2

    .line 23
    const/4 v3, 0x2

    .line 24
    rsub-int/lit8 v1, v1, 0x2

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, [C

    .line 31
    .line 32
    sget-object v4, LVa/Ab;->F:Ljava/lang/Object;

    .line 33
    .line 34
    monitor-enter v4

    .line 35
    :try_start_0
    array-length v5, v0

    .line 36
    new-array v5, v5, [C

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    sput v6, LVa/Ab;->E:I

    .line 40
    .line 41
    new-array v7, v3, [C

    .line 42
    .line 43
    :goto_0
    sget v8, LVa/Ab;->E:I

    .line 44
    .line 45
    array-length v9, v0

    .line 46
    const/4 v10, 0x1

    .line 47
    if-ge v8, v9, :cond_1

    .line 48
    .line 49
    aget-char v9, v0, v8

    .line 50
    .line 51
    aput-char v9, v7, v6

    .line 52
    .line 53
    add-int/lit8 v8, v8, 0x1

    .line 54
    .line 55
    aget-char v8, v0, v8

    .line 56
    .line 57
    aput-char v8, v7, v10

    .line 58
    .line 59
    const v8, 0xe370

    .line 60
    .line 61
    .line 62
    move v9, v6

    .line 63
    :goto_1
    if-ge v9, v2, :cond_0

    .line 64
    .line 65
    aget-char v11, v7, v10

    .line 66
    .line 67
    aget-char v12, v7, v6

    .line 68
    .line 69
    add-int v13, v12, v8

    .line 70
    .line 71
    shl-int/lit8 v14, v12, 0x4

    .line 72
    .line 73
    add-int/lit16 v14, v14, 0x3590

    .line 74
    .line 75
    xor-int/2addr v13, v14

    .line 76
    ushr-int/lit8 v14, v12, 0x5

    .line 77
    .line 78
    add-int/lit16 v14, v14, 0x6607

    .line 79
    .line 80
    xor-int/2addr v13, v14

    .line 81
    sub-int/2addr v11, v13

    .line 82
    int-to-char v11, v11

    .line 83
    aput-char v11, v7, v10

    .line 84
    .line 85
    add-int v13, v11, v8

    .line 86
    .line 87
    shl-int/lit8 v14, v11, 0x4

    .line 88
    .line 89
    add-int/lit16 v14, v14, 0x4620

    .line 90
    .line 91
    xor-int/2addr v13, v14

    .line 92
    ushr-int/lit8 v11, v11, 0x5

    .line 93
    .line 94
    add-int/lit16 v11, v11, 0x1a71

    .line 95
    .line 96
    xor-int/2addr v11, v13

    .line 97
    sub-int/2addr v12, v11

    .line 98
    int-to-char v11, v12

    .line 99
    aput-char v11, v7, v6

    .line 100
    .line 101
    const v11, 0x9e37

    .line 102
    .line 103
    .line 104
    sub-int/2addr v8, v11

    .line 105
    add-int/lit8 v9, v9, 0x1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :catchall_0
    move-exception v0

    .line 109
    goto :goto_2

    .line 110
    :cond_0
    sget v8, LVa/Ab;->E:I

    .line 111
    .line 112
    aget-char v9, v7, v6

    .line 113
    .line 114
    aput-char v9, v5, v8

    .line 115
    .line 116
    add-int/lit8 v9, v8, 0x1

    .line 117
    .line 118
    aget-char v10, v7, v10

    .line 119
    .line 120
    aput-char v10, v5, v9

    .line 121
    .line 122
    add-int/lit8 v8, v8, 0x2

    .line 123
    .line 124
    sput v8, LVa/Ab;->E:I

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_1
    new-instance v0, Ljava/lang/String;

    .line 128
    .line 129
    invoke-direct {v0, v5, v6, v1}, Ljava/lang/String;-><init>([CII)V

    .line 130
    .line 131
    .line 132
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    sget v1, LVa/Q8;->m:I

    .line 138
    .line 139
    add-int/2addr v1, v10

    .line 140
    rem-int/lit16 v2, v1, 0x80

    .line 141
    .line 142
    sput v2, LVa/Q8;->n:I

    .line 143
    .line 144
    rem-int/2addr v1, v3

    .line 145
    if-eqz v1, :cond_2

    .line 146
    .line 147
    return-object v0

    .line 148
    :cond_2
    const/4 v0, 0x0

    .line 149
    throw v0

    .line 150
    :goto_2
    monitor-exit v4

    .line 151
    throw v0

    .line 152
    :pswitch_0
    sget v0, LVa/Q8;->l:I

    .line 153
    .line 154
    add-int/lit8 v0, v0, 0x2f

    .line 155
    .line 156
    rem-int/lit16 v1, v0, 0x80

    .line 157
    .line 158
    sput v1, LVa/Q8;->k:I

    .line 159
    .line 160
    rem-int/lit8 v0, v0, 0x2

    .line 161
    .line 162
    if-eqz v0, :cond_3

    .line 163
    .line 164
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    add-int/lit8 v0, v0, 0x3b

    .line 169
    .line 170
    rsub-int v0, v0, 0x1fc4

    .line 171
    .line 172
    :goto_3
    invoke-static {v0}, LVa/Q8;->m(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    goto :goto_4

    .line 181
    :cond_3
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    shr-int/lit8 v0, v0, 0x10

    .line 186
    .line 187
    rsub-int v0, v0, 0x38ff

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :goto_4
    return-object v0

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget v0, p0, LVa/Q8;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget v0, LVa/Q8;->n:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x33

    .line 9
    .line 10
    rem-int/lit16 v0, v0, 0x80

    .line 11
    .line 12
    sput v0, LVa/Q8;->m:I

    .line 13
    .line 14
    if-eq p1, p2, :cond_1

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x4d

    .line 17
    .line 18
    rem-int/lit16 p1, v0, 0x80

    .line 19
    .line 20
    sput p1, LVa/Q8;->n:I

    .line 21
    .line 22
    rem-int/lit8 v0, v0, 0x2

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    throw p1

    .line 30
    :cond_1
    const/4 p1, 0x0

    .line 31
    :goto_0
    return p1

    .line 32
    :pswitch_0
    sget v0, LVa/Q8;->k:I

    .line 33
    .line 34
    add-int/lit8 v1, v0, 0x35

    .line 35
    .line 36
    rem-int/lit16 v2, v1, 0x80

    .line 37
    .line 38
    sput v2, LVa/Q8;->l:I

    .line 39
    .line 40
    rem-int/lit8 v1, v1, 0x2

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    if-ne p1, p2, :cond_3

    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x39

    .line 48
    .line 49
    rem-int/lit16 p1, v0, 0x80

    .line 50
    .line 51
    sput p1, LVa/Q8;->l:I

    .line 52
    .line 53
    rem-int/lit8 v0, v0, 0x2

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    throw v2

    .line 60
    :cond_3
    const/4 p1, 0x0

    .line 61
    :goto_1
    return p1

    .line 62
    :cond_4
    throw v2

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget v0, p0, LVa/Q8;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    sget p1, LVa/Q8;->m:I

    .line 13
    .line 14
    add-int/lit8 p1, p1, 0x3d

    .line 15
    .line 16
    rem-int/lit16 p1, p1, 0x80

    .line 17
    .line 18
    sput p1, LVa/Q8;->n:I

    .line 19
    .line 20
    add-int/lit8 p1, p1, 0x7

    .line 21
    .line 22
    rem-int/lit16 p1, p1, 0x80

    .line 23
    .line 24
    sput p1, LVa/Q8;->m:I

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    return p1

    .line 30
    :pswitch_0
    sget v0, LVa/Q8;->k:I

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x71

    .line 33
    .line 34
    rem-int/lit16 v0, v0, 0x80

    .line 35
    .line 36
    sput v0, LVa/Q8;->l:I

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    sget p2, LVa/Q8;->k:I

    .line 43
    .line 44
    add-int/lit8 p2, p2, 0x49

    .line 45
    .line 46
    rem-int/lit16 p2, p2, 0x80

    .line 47
    .line 48
    sput p2, LVa/Q8;->l:I

    .line 49
    .line 50
    return p1

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final l(I)Z
    .locals 3

    .line 1
    iget v0, p0, LVa/Q8;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget v0, LVa/Q8;->m:I

    .line 7
    .line 8
    add-int/lit8 v1, v0, 0x47

    .line 9
    .line 10
    rem-int/lit16 v2, v1, 0x80

    .line 11
    .line 12
    sput v2, LVa/Q8;->n:I

    .line 13
    .line 14
    rem-int/lit8 v1, v1, 0x2

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x7b

    .line 22
    .line 23
    rem-int/lit16 p1, v0, 0x80

    .line 24
    .line 25
    sput p1, LVa/Q8;->n:I

    .line 26
    .line 27
    rem-int/lit8 v0, v0, 0x2

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    const/16 v0, 0xd

    .line 33
    .line 34
    div-int/2addr v0, v1

    .line 35
    :cond_0
    move v1, p1

    .line 36
    :cond_1
    return v1

    .line 37
    :cond_2
    const/4 p1, 0x0

    .line 38
    throw p1

    .line 39
    :pswitch_0
    sget v0, LVa/Q8;->k:I

    .line 40
    .line 41
    add-int/lit8 v1, v0, 0x39

    .line 42
    .line 43
    rem-int/lit16 v2, v1, 0x80

    .line 44
    .line 45
    sput v2, LVa/Q8;->l:I

    .line 46
    .line 47
    rem-int/lit8 v1, v1, 0x2

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    if-nez v1, :cond_3

    .line 51
    .line 52
    const/16 v1, 0x44

    .line 53
    .line 54
    div-int/2addr v1, v2

    .line 55
    if-nez p1, :cond_4

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    if-nez p1, :cond_4

    .line 59
    .line 60
    :goto_0
    const/4 v2, 0x1

    .line 61
    goto :goto_1

    .line 62
    :cond_4
    add-int/lit8 v0, v0, 0x31

    .line 63
    .line 64
    rem-int/lit16 p1, v0, 0x80

    .line 65
    .line 66
    sput p1, LVa/Q8;->l:I

    .line 67
    .line 68
    rem-int/lit8 v0, v0, 0x2

    .line 69
    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    :goto_1
    return v2

    .line 73
    :cond_5
    const/4 p1, 0x0

    .line 74
    throw p1

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
