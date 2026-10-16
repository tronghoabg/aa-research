.class public final LVa/X8;
.super LVa/c9;
.source "SourceFile"


# static fields
.field public static final e:[I

.field public static f:I = 0x0

.field public static g:I = 0x1


# instance fields
.field public final synthetic d:I


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
    sput-object v0, LVa/X8;->e:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        -0x23aff5c5
        -0xf06391b
        -0x4f4c8a6
        0x52ca1c81
        0x6d545eb0
        0x1d274aaa
        0x546ef94f
        0x314590de
        -0x14581cb1
        0x113289d4
        0x7db2042c
        -0x14258ad1
        -0xd8c5ed4
        -0x2a2b4e62
        -0x62e4ed50
        0x34a2df3d
        -0x20ed73ef
        0x254914e    # 1.5617E-37f
    .end array-data
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/X8;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(I)Ljava/lang/String;
    .locals 13

    .line 1
    const-string v0, "\u9fb0\u109e\u4eeb\u8636\u1cfa\u5edc"

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
    sget-object v1, LVa/Ab;->F:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    array-length v2, v0

    .line 13
    new-array v2, v2, [C

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    sput v3, LVa/Ab;->E:I

    .line 17
    .line 18
    const/4 v4, 0x2

    .line 19
    new-array v4, v4, [C

    .line 20
    .line 21
    :goto_0
    sget v5, LVa/Ab;->E:I

    .line 22
    .line 23
    array-length v6, v0

    .line 24
    if-ge v5, v6, :cond_1

    .line 25
    .line 26
    aget-char v6, v0, v5

    .line 27
    .line 28
    aput-char v6, v4, v3

    .line 29
    .line 30
    add-int/lit8 v5, v5, 0x1

    .line 31
    .line 32
    aget-char v5, v0, v5

    .line 33
    .line 34
    const/4 v6, 0x1

    .line 35
    aput-char v5, v4, v6

    .line 36
    .line 37
    const v5, 0xe370

    .line 38
    .line 39
    .line 40
    move v7, v3

    .line 41
    :goto_1
    const/16 v8, 0x10

    .line 42
    .line 43
    if-ge v7, v8, :cond_0

    .line 44
    .line 45
    aget-char v8, v4, v6

    .line 46
    .line 47
    aget-char v9, v4, v3

    .line 48
    .line 49
    add-int v10, v9, v5

    .line 50
    .line 51
    shl-int/lit8 v11, v9, 0x4

    .line 52
    .line 53
    const v12, 0x8a86

    .line 54
    .line 55
    .line 56
    add-int/2addr v11, v12

    .line 57
    xor-int/2addr v10, v11

    .line 58
    ushr-int/lit8 v11, v9, 0x5

    .line 59
    .line 60
    const v12, 0xe08d

    .line 61
    .line 62
    .line 63
    add-int/2addr v11, v12

    .line 64
    xor-int/2addr v10, v11

    .line 65
    sub-int/2addr v8, v10

    .line 66
    int-to-char v8, v8

    .line 67
    aput-char v8, v4, v6

    .line 68
    .line 69
    add-int v10, v8, v5

    .line 70
    .line 71
    shl-int/lit8 v11, v8, 0x4

    .line 72
    .line 73
    const v12, 0xbe80

    .line 74
    .line 75
    .line 76
    add-int/2addr v11, v12

    .line 77
    xor-int/2addr v10, v11

    .line 78
    ushr-int/lit8 v8, v8, 0x5

    .line 79
    .line 80
    add-int/lit16 v8, v8, 0x46e4

    .line 81
    .line 82
    xor-int/2addr v8, v10

    .line 83
    sub-int/2addr v9, v8

    .line 84
    int-to-char v8, v9

    .line 85
    aput-char v8, v4, v3

    .line 86
    .line 87
    const v8, 0x9e37

    .line 88
    .line 89
    .line 90
    sub-int/2addr v5, v8

    .line 91
    add-int/lit8 v7, v7, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :catchall_0
    move-exception p0

    .line 95
    goto :goto_2

    .line 96
    :cond_0
    sget v5, LVa/Ab;->E:I

    .line 97
    .line 98
    aget-char v7, v4, v3

    .line 99
    .line 100
    aput-char v7, v2, v5

    .line 101
    .line 102
    add-int/lit8 v7, v5, 0x1

    .line 103
    .line 104
    aget-char v6, v4, v6

    .line 105
    .line 106
    aput-char v6, v2, v7

    .line 107
    .line 108
    add-int/lit8 v5, v5, 0x2

    .line 109
    .line 110
    sput v5, LVa/Ab;->E:I

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_1
    new-instance v0, Ljava/lang/String;

    .line 114
    .line 115
    invoke-direct {v0, v2, v3, p0}, Ljava/lang/String;-><init>([CII)V

    .line 116
    .line 117
    .line 118
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    return-object v0

    .line 120
    :goto_2
    monitor-exit v1

    .line 121
    throw p0
.end method


# virtual methods
.method public final c(LVa/x8;LVa/y7;)LVa/s8;
    .locals 3

    .line 1
    iget p1, p0, LVa/X8;->d:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, LVa/s8;

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    invoke-direct {p1, p2}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sget v0, LVa/s8;->f:I

    .line 13
    .line 14
    add-int/lit8 v1, v0, 0x47

    .line 15
    .line 16
    rem-int/lit16 v2, v1, 0x80

    .line 17
    .line 18
    sput v2, LVa/s8;->g:I

    .line 19
    .line 20
    rem-int/lit8 v1, v1, 0x2

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    iput-boolean v2, p1, LVa/s8;->c:Z

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x63

    .line 26
    .line 27
    rem-int/lit16 v1, v0, 0x80

    .line 28
    .line 29
    sput v1, LVa/s8;->g:I

    .line 30
    .line 31
    rem-int/lit8 v0, v0, 0x2

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    sget v0, LVa/X8;->g:I

    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x31

    .line 38
    .line 39
    rem-int/lit16 v1, v0, 0x80

    .line 40
    .line 41
    sput v1, LVa/X8;->f:I

    .line 42
    .line 43
    rem-int/lit8 v0, v0, 0x2

    .line 44
    .line 45
    if-nez v0, :cond_0

    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_0
    throw p2

    .line 49
    :cond_1
    throw p2

    .line 50
    :pswitch_0
    new-instance p1, LVa/s8;

    .line 51
    .line 52
    const/4 p2, 0x0

    .line 53
    invoke-direct {p1, p2}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget p2, LVa/s8;->g:I

    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    iput-boolean v0, p1, LVa/s8;->d:Z

    .line 60
    .line 61
    add-int/lit8 p2, p2, 0x9

    .line 62
    .line 63
    rem-int/lit16 p2, p2, 0x80

    .line 64
    .line 65
    sput p2, LVa/s8;->f:I

    .line 66
    .line 67
    return-object p1

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 17

    .line 1
    const/4 v1, 0x6

    .line 2
    const/4 v2, 0x0

    .line 3
    const/4 v3, 0x2

    .line 4
    const/4 v4, 0x1

    .line 5
    const/16 v5, 0x10

    .line 6
    .line 7
    move-object/from16 v6, p0

    .line 8
    .line 9
    iget v7, v6, LVa/X8;->d:I

    .line 10
    .line 11
    packed-switch v7, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget v0, LVa/X8;->f:I

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x5d

    .line 17
    .line 18
    rem-int/lit16 v1, v0, 0x80

    .line 19
    .line 20
    sput v1, LVa/X8;->g:I

    .line 21
    .line 22
    rem-int/2addr v0, v3

    .line 23
    const-wide/16 v7, 0x0

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-static {v4, v2}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    cmp-long v0, v0, v7

    .line 32
    .line 33
    rsub-int/lit8 v0, v0, 0x73

    .line 34
    .line 35
    :goto_0
    invoke-static {v0}, LVa/X8;->e(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-static {v2, v2}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    cmp-long v0, v0, v7

    .line 49
    .line 50
    add-int/lit8 v0, v0, 0x7

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :goto_1
    sget v1, LVa/X8;->f:I

    .line 54
    .line 55
    add-int/lit8 v1, v1, 0x4d

    .line 56
    .line 57
    rem-int/lit16 v1, v1, 0x80

    .line 58
    .line 59
    sput v1, LVa/X8;->g:I

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_0
    new-array v7, v1, [I

    .line 63
    .line 64
    fill-array-data v7, :array_0

    .line 65
    .line 66
    .line 67
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    rsub-int/lit8 v8, v8, 0x9

    .line 72
    .line 73
    sget-object v9, LVa/a;->n:Ljava/lang/Object;

    .line 74
    .line 75
    monitor-enter v9

    .line 76
    const/4 v10, 0x4

    .line 77
    :try_start_0
    new-array v10, v10, [C

    .line 78
    .line 79
    const/16 v11, 0xc

    .line 80
    .line 81
    new-array v11, v11, [C

    .line 82
    .line 83
    sget-object v12, LVa/X8;->e:[I

    .line 84
    .line 85
    invoke-virtual {v12}, [I->clone()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v12

    .line 89
    check-cast v12, [I

    .line 90
    .line 91
    sput v2, LVa/a;->k:I

    .line 92
    .line 93
    :goto_2
    sget v13, LVa/a;->k:I

    .line 94
    .line 95
    if-ge v13, v1, :cond_2

    .line 96
    .line 97
    aget v14, v7, v13

    .line 98
    .line 99
    shr-int/lit8 v15, v14, 0x10

    .line 100
    .line 101
    int-to-char v15, v15

    .line 102
    aput-char v15, v10, v2

    .line 103
    .line 104
    int-to-char v14, v14

    .line 105
    aput-char v14, v10, v4

    .line 106
    .line 107
    add-int/2addr v13, v4

    .line 108
    aget v13, v7, v13

    .line 109
    .line 110
    const/16 v16, 0x3

    .line 111
    .line 112
    shr-int/lit8 v0, v13, 0x10

    .line 113
    .line 114
    int-to-char v0, v0

    .line 115
    aput-char v0, v10, v3

    .line 116
    .line 117
    int-to-char v13, v13

    .line 118
    aput-char v13, v10, v16

    .line 119
    .line 120
    shl-int/2addr v15, v5

    .line 121
    add-int/2addr v15, v14

    .line 122
    sput v15, LVa/a;->l:I

    .line 123
    .line 124
    shl-int/2addr v0, v5

    .line 125
    add-int/2addr v0, v13

    .line 126
    sput v0, LVa/a;->m:I

    .line 127
    .line 128
    invoke-static {v12}, LVa/a;->o([I)V

    .line 129
    .line 130
    .line 131
    move v0, v2

    .line 132
    :goto_3
    if-ge v0, v5, :cond_1

    .line 133
    .line 134
    sget v13, LVa/a;->l:I

    .line 135
    .line 136
    aget v14, v12, v0

    .line 137
    .line 138
    xor-int/2addr v13, v14

    .line 139
    sput v13, LVa/a;->l:I

    .line 140
    .line 141
    invoke-static {v13}, LVa/a;->G(I)I

    .line 142
    .line 143
    .line 144
    move-result v13

    .line 145
    sget v14, LVa/a;->m:I

    .line 146
    .line 147
    xor-int/2addr v13, v14

    .line 148
    sget v14, LVa/a;->l:I

    .line 149
    .line 150
    sput v13, LVa/a;->l:I

    .line 151
    .line 152
    sput v14, LVa/a;->m:I

    .line 153
    .line 154
    add-int/2addr v0, v4

    .line 155
    goto :goto_3

    .line 156
    :catchall_0
    move-exception v0

    .line 157
    goto :goto_4

    .line 158
    :cond_1
    sget v0, LVa/a;->l:I

    .line 159
    .line 160
    sget v13, LVa/a;->m:I

    .line 161
    .line 162
    sput v13, LVa/a;->l:I

    .line 163
    .line 164
    sput v0, LVa/a;->m:I

    .line 165
    .line 166
    aget v14, v12, v5

    .line 167
    .line 168
    xor-int/2addr v0, v14

    .line 169
    sput v0, LVa/a;->m:I

    .line 170
    .line 171
    const/16 v14, 0x11

    .line 172
    .line 173
    aget v14, v12, v14

    .line 174
    .line 175
    xor-int/2addr v13, v14

    .line 176
    sput v13, LVa/a;->l:I

    .line 177
    .line 178
    ushr-int/lit8 v14, v13, 0x10

    .line 179
    .line 180
    int-to-char v14, v14

    .line 181
    aput-char v14, v10, v2

    .line 182
    .line 183
    int-to-char v13, v13

    .line 184
    aput-char v13, v10, v4

    .line 185
    .line 186
    ushr-int/lit8 v13, v0, 0x10

    .line 187
    .line 188
    int-to-char v13, v13

    .line 189
    aput-char v13, v10, v3

    .line 190
    .line 191
    int-to-char v0, v0

    .line 192
    aput-char v0, v10, v16

    .line 193
    .line 194
    invoke-static {v12}, LVa/a;->o([I)V

    .line 195
    .line 196
    .line 197
    sget v0, LVa/a;->k:I

    .line 198
    .line 199
    shl-int/lit8 v13, v0, 0x1

    .line 200
    .line 201
    aget-char v14, v10, v2

    .line 202
    .line 203
    aput-char v14, v11, v13

    .line 204
    .line 205
    add-int/lit8 v14, v13, 0x1

    .line 206
    .line 207
    aget-char v15, v10, v4

    .line 208
    .line 209
    aput-char v15, v11, v14

    .line 210
    .line 211
    add-int/lit8 v14, v13, 0x2

    .line 212
    .line 213
    aget-char v15, v10, v3

    .line 214
    .line 215
    aput-char v15, v11, v14

    .line 216
    .line 217
    add-int/lit8 v13, v13, 0x3

    .line 218
    .line 219
    aget-char v14, v10, v16

    .line 220
    .line 221
    aput-char v14, v11, v13

    .line 222
    .line 223
    add-int/2addr v0, v3

    .line 224
    sput v0, LVa/a;->k:I

    .line 225
    .line 226
    goto/16 :goto_2

    .line 227
    .line 228
    :cond_2
    new-instance v0, Ljava/lang/String;

    .line 229
    .line 230
    invoke-direct {v0, v11, v2, v8}, Ljava/lang/String;-><init>([CII)V

    .line 231
    .line 232
    .line 233
    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 234
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    return-object v0

    .line 239
    :goto_4
    monitor-exit v9

    .line 240
    throw v0

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    :array_0
    .array-data 4
        0x42cbfb7b
        0x5bac6760
        -0x15ee8bf8
        -0x3c0529a9
        -0x72f75b2c
        0x2323f902
    .end array-data
.end method
