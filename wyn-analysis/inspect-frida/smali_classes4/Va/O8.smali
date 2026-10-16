.class public final LVa/O8;
.super LVa/y8;
.source "SourceFile"


# static fields
.field public static final f:[I

.field public static final g:[C


# instance fields
.field public final synthetic d:I

.field public e:LVa/y8;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

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
    sput-object v0, LVa/O8;->f:[I

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    new-array v0, v0, [C

    .line 12
    .line 13
    const/16 v1, 0x59

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    aput-char v1, v0, v2

    .line 17
    .line 18
    sput-object v0, LVa/O8;->g:[C

    .line 19
    .line 20
    return-void

    .line 21
    :array_0
    .array-data 4
        -0x663845ec
        0x1c4e36a2
        -0x4b0abd2
        -0x1889d6e3
        0x6f7148e2
        -0xf62268f
        -0x645a4cf5
        0x768907f9
        -0xd92c4d3
        -0x28588141
        0x3e50ecdc
        0xaf96669
        0x59b89650
        -0x42873d9
        -0x66203ec5
        -0x31400ada
        0x693f0659
        -0x62136317
    .end array-data
.end method

.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LVa/O8;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LVa/y8;I)V
    .locals 0

    .line 2
    iput p2, p0, LVa/O8;->d:I

    iput-object p1, p0, LVa/O8;->e:LVa/y8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final e()Ljava/lang/String;
    .locals 12

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x38

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    filled-new-array {v2, v3, v1, v3}, [I

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v4, LVa/Ab;->z:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v4

    .line 17
    :try_start_0
    aget v5, v1, v2

    .line 18
    .line 19
    aget v6, v1, v3

    .line 20
    .line 21
    const/4 v7, 0x2

    .line 22
    aget v8, v1, v7

    .line 23
    .line 24
    const/4 v9, 0x3

    .line 25
    aget v9, v1, v9

    .line 26
    .line 27
    sget-object v10, LVa/O8;->g:[C

    .line 28
    .line 29
    new-array v11, v6, [C

    .line 30
    .line 31
    invoke-static {v10, v5, v11, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    .line 33
    .line 34
    if-lez v9, :cond_0

    .line 35
    .line 36
    new-array v5, v6, [C

    .line 37
    .line 38
    invoke-static {v11, v2, v5, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 39
    .line 40
    .line 41
    sub-int v10, v6, v9

    .line 42
    .line 43
    invoke-static {v5, v2, v11, v10, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    invoke-static {v5, v9, v11, v2, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    goto :goto_3

    .line 52
    :cond_0
    :goto_0
    new-array v5, v6, [C

    .line 53
    .line 54
    sput v2, LVa/Ab;->y:I

    .line 55
    .line 56
    :goto_1
    sget v9, LVa/Ab;->y:I

    .line 57
    .line 58
    if-ge v9, v6, :cond_1

    .line 59
    .line 60
    sub-int v10, v6, v9

    .line 61
    .line 62
    sub-int/2addr v10, v3

    .line 63
    aget-char v10, v11, v10

    .line 64
    .line 65
    aput-char v10, v5, v9

    .line 66
    .line 67
    add-int/lit8 v9, v9, 0x1

    .line 68
    .line 69
    sput v9, LVa/Ab;->y:I

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    if-lez v8, :cond_2

    .line 73
    .line 74
    sput v2, LVa/Ab;->y:I

    .line 75
    .line 76
    :goto_2
    sget v2, LVa/Ab;->y:I

    .line 77
    .line 78
    if-ge v2, v6, :cond_2

    .line 79
    .line 80
    aget-char v3, v5, v2

    .line 81
    .line 82
    aget v8, v1, v7

    .line 83
    .line 84
    sub-int/2addr v3, v8

    .line 85
    int-to-char v3, v3

    .line 86
    aput-char v3, v5, v2

    .line 87
    .line 88
    add-int/lit8 v2, v2, 0x1

    .line 89
    .line 90
    sput v2, LVa/Ab;->y:I

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    new-instance v1, Ljava/lang/String;

    .line 94
    .line 95
    invoke-direct {v1, v5}, Ljava/lang/String;-><init>([C)V

    .line 96
    .line 97
    .line 98
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    iget-object v1, p0, LVa/O8;->e:LVa/y8;

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0

    .line 116
    :goto_3
    monitor-exit v4

    .line 117
    throw v0
.end method


# virtual methods
.method public final b(LVa/x8;LVa/y7;)LVa/s8;
    .locals 2

    .line 1
    iget v0, p0, LVa/O8;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LVa/s8;

    .line 7
    .line 8
    iget-object v1, p0, LVa/O8;->e:LVa/y8;

    .line 9
    .line 10
    invoke-virtual {v1, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, LVa/s8;->e()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    xor-int/lit8 p1, p1, 0x1

    .line 19
    .line 20
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-direct {v0, p1}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_0
    iget-object v0, p0, LVa/O8;->e:LVa/y8;

    .line 29
    .line 30
    check-cast v0, LVa/J8;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p2}, LVa/s8;->a()Ljava/lang/Number;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0}, LVa/J8;->e()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/lit8 v1, v1, -0x1

    .line 49
    .line 50
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p1, v1, v0}, LVa/x8;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object p2

    .line 58
    :pswitch_1
    iget-object v0, p0, LVa/O8;->e:LVa/y8;

    .line 59
    .line 60
    check-cast v0, LVa/J8;

    .line 61
    .line 62
    invoke-virtual {v0, p1, p2}, LVa/y8;->c(LVa/x8;LVa/y7;)LVa/s8;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p2}, LVa/s8;->a()Ljava/lang/Number;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0}, LVa/J8;->e()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    add-int/lit8 v1, v1, 0x1

    .line 79
    .line 80
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {p1, v1, v0}, LVa/x8;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-object p2

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    .line 1
    iget v0, p0, LVa/O8;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_1
    invoke-direct {p0}, LVa/O8;->e()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, LVa/O8;->e:LVa/y8;

    .line 22
    .line 23
    check-cast v1, LVa/J8;

    .line 24
    .line 25
    invoke-virtual {v1}, LVa/J8;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const v1, 0x5580f3c6

    .line 33
    .line 34
    .line 35
    const v2, -0x1f4dd26f

    .line 36
    .line 37
    .line 38
    filled-new-array {v1, v2}, [I

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-wide/16 v2, 0x0

    .line 43
    .line 44
    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const/4 v3, 0x2

    .line 49
    rsub-int/lit8 v2, v2, 0x2

    .line 50
    .line 51
    sget-object v4, LVa/a;->n:Ljava/lang/Object;

    .line 52
    .line 53
    monitor-enter v4

    .line 54
    const/4 v5, 0x4

    .line 55
    :try_start_0
    new-array v6, v5, [C

    .line 56
    .line 57
    new-array v5, v5, [C

    .line 58
    .line 59
    sget-object v7, LVa/O8;->f:[I

    .line 60
    .line 61
    invoke-virtual {v7}, [I->clone()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    check-cast v7, [I

    .line 66
    .line 67
    const/4 v8, 0x0

    .line 68
    sput v8, LVa/a;->k:I

    .line 69
    .line 70
    :goto_0
    sget v9, LVa/a;->k:I

    .line 71
    .line 72
    if-ge v9, v3, :cond_1

    .line 73
    .line 74
    aget v10, v1, v9

    .line 75
    .line 76
    shr-int/lit8 v11, v10, 0x10

    .line 77
    .line 78
    int-to-char v11, v11

    .line 79
    aput-char v11, v6, v8

    .line 80
    .line 81
    int-to-char v10, v10

    .line 82
    const/4 v12, 0x1

    .line 83
    aput-char v10, v6, v12

    .line 84
    .line 85
    add-int/lit8 v9, v9, 0x1

    .line 86
    .line 87
    aget v9, v1, v9

    .line 88
    .line 89
    shr-int/lit8 v13, v9, 0x10

    .line 90
    .line 91
    int-to-char v13, v13

    .line 92
    aput-char v13, v6, v3

    .line 93
    .line 94
    int-to-char v9, v9

    .line 95
    const/4 v14, 0x3

    .line 96
    aput-char v9, v6, v14

    .line 97
    .line 98
    shl-int/lit8 v11, v11, 0x10

    .line 99
    .line 100
    add-int/2addr v11, v10

    .line 101
    sput v11, LVa/a;->l:I

    .line 102
    .line 103
    shl-int/lit8 v10, v13, 0x10

    .line 104
    .line 105
    add-int/2addr v10, v9

    .line 106
    sput v10, LVa/a;->m:I

    .line 107
    .line 108
    invoke-static {v7}, LVa/a;->o([I)V

    .line 109
    .line 110
    .line 111
    move v9, v8

    .line 112
    :goto_1
    const/16 v10, 0x10

    .line 113
    .line 114
    if-ge v9, v10, :cond_0

    .line 115
    .line 116
    sget v10, LVa/a;->l:I

    .line 117
    .line 118
    aget v11, v7, v9

    .line 119
    .line 120
    xor-int/2addr v10, v11

    .line 121
    sput v10, LVa/a;->l:I

    .line 122
    .line 123
    invoke-static {v10}, LVa/a;->G(I)I

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    sget v11, LVa/a;->m:I

    .line 128
    .line 129
    xor-int/2addr v10, v11

    .line 130
    sget v11, LVa/a;->l:I

    .line 131
    .line 132
    sput v10, LVa/a;->l:I

    .line 133
    .line 134
    sput v11, LVa/a;->m:I

    .line 135
    .line 136
    add-int/lit8 v9, v9, 0x1

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :catchall_0
    move-exception v0

    .line 140
    goto :goto_2

    .line 141
    :cond_0
    sget v9, LVa/a;->l:I

    .line 142
    .line 143
    sget v11, LVa/a;->m:I

    .line 144
    .line 145
    sput v11, LVa/a;->l:I

    .line 146
    .line 147
    sput v9, LVa/a;->m:I

    .line 148
    .line 149
    aget v10, v7, v10

    .line 150
    .line 151
    xor-int/2addr v9, v10

    .line 152
    sput v9, LVa/a;->m:I

    .line 153
    .line 154
    const/16 v10, 0x11

    .line 155
    .line 156
    aget v10, v7, v10

    .line 157
    .line 158
    xor-int/2addr v10, v11

    .line 159
    sput v10, LVa/a;->l:I

    .line 160
    .line 161
    ushr-int/lit8 v11, v10, 0x10

    .line 162
    .line 163
    int-to-char v11, v11

    .line 164
    aput-char v11, v6, v8

    .line 165
    .line 166
    int-to-char v10, v10

    .line 167
    aput-char v10, v6, v12

    .line 168
    .line 169
    ushr-int/lit8 v10, v9, 0x10

    .line 170
    .line 171
    int-to-char v10, v10

    .line 172
    aput-char v10, v6, v3

    .line 173
    .line 174
    int-to-char v9, v9

    .line 175
    aput-char v9, v6, v14

    .line 176
    .line 177
    invoke-static {v7}, LVa/a;->o([I)V

    .line 178
    .line 179
    .line 180
    sget v9, LVa/a;->k:I

    .line 181
    .line 182
    shl-int/lit8 v10, v9, 0x1

    .line 183
    .line 184
    aget-char v11, v6, v8

    .line 185
    .line 186
    aput-char v11, v5, v10

    .line 187
    .line 188
    add-int/lit8 v11, v10, 0x1

    .line 189
    .line 190
    aget-char v12, v6, v12

    .line 191
    .line 192
    aput-char v12, v5, v11

    .line 193
    .line 194
    add-int/lit8 v11, v10, 0x2

    .line 195
    .line 196
    aget-char v12, v6, v3

    .line 197
    .line 198
    aput-char v12, v5, v11

    .line 199
    .line 200
    add-int/lit8 v10, v10, 0x3

    .line 201
    .line 202
    aget-char v11, v6, v14

    .line 203
    .line 204
    aput-char v11, v5, v10

    .line 205
    .line 206
    add-int/lit8 v9, v9, 0x2

    .line 207
    .line 208
    sput v9, LVa/a;->k:I

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :cond_1
    new-instance v1, Ljava/lang/String;

    .line 213
    .line 214
    invoke-direct {v1, v5, v8, v2}, Ljava/lang/String;-><init>([CII)V

    .line 215
    .line 216
    .line 217
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 218
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    return-object v0

    .line 230
    :goto_2
    monitor-exit v4

    .line 231
    throw v0

    .line 232
    nop

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
