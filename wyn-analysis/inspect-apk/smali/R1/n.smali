.class public abstract LR1/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B

.field public static final b:[F

.field public static final c:Ljava/lang/Object;

.field public static d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, LR1/n;->a:[B

    .line 8
    .line 9
    const/16 v0, 0x11

    .line 10
    .line 11
    new-array v0, v0, [F

    .line 12
    .line 13
    fill-array-data v0, :array_1

    .line 14
    .line 15
    .line 16
    sput-object v0, LR1/n;->b:[F

    .line 17
    .line 18
    new-instance v0, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    sput-object v0, LR1/n;->c:Ljava/lang/Object;

    .line 24
    .line 25
    const/16 v0, 0xa

    .line 26
    .line 27
    new-array v0, v0, [I

    .line 28
    .line 29
    sput-object v0, LR1/n;->d:[I

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x400ba2e9
        0x3fe8ba2f
        0x403a2e8c
        0x401b26ca
        0x3fd1745d
        0x3fae8ba3
        0x3ff83e10
        0x3fcede62
        0x3faaaaab
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method public static a([Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    aput-boolean v0, p0, v0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    aput-boolean v0, p0, v1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    aput-boolean v0, p0, v1

    .line 9
    .line 10
    return-void
.end method

.method public static b([BII[Z)I
    .locals 8

    .line 1
    sub-int v0, p2, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    move v3, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v3, v1

    .line 10
    :goto_0
    invoke-static {v3}, LQ1/k;->g(Z)V

    .line 11
    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return p2

    .line 16
    :cond_1
    aget-boolean v3, p3, v1

    .line 17
    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    invoke-static {p3}, LR1/n;->a([Z)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 p1, p1, -0x3

    .line 24
    .line 25
    return p1

    .line 26
    :cond_2
    const/4 v3, 0x2

    .line 27
    if-le v0, v2, :cond_3

    .line 28
    .line 29
    aget-boolean v4, p3, v2

    .line 30
    .line 31
    if-eqz v4, :cond_3

    .line 32
    .line 33
    aget-byte v4, p0, p1

    .line 34
    .line 35
    if-ne v4, v2, :cond_3

    .line 36
    .line 37
    invoke-static {p3}, LR1/n;->a([Z)V

    .line 38
    .line 39
    .line 40
    sub-int/2addr p1, v3

    .line 41
    return p1

    .line 42
    :cond_3
    if-le v0, v3, :cond_4

    .line 43
    .line 44
    aget-boolean v4, p3, v3

    .line 45
    .line 46
    if-eqz v4, :cond_4

    .line 47
    .line 48
    aget-byte v4, p0, p1

    .line 49
    .line 50
    if-nez v4, :cond_4

    .line 51
    .line 52
    add-int/lit8 v4, p1, 0x1

    .line 53
    .line 54
    aget-byte v4, p0, v4

    .line 55
    .line 56
    if-ne v4, v2, :cond_4

    .line 57
    .line 58
    invoke-static {p3}, LR1/n;->a([Z)V

    .line 59
    .line 60
    .line 61
    sub-int/2addr p1, v2

    .line 62
    return p1

    .line 63
    :cond_4
    add-int/lit8 v4, p2, -0x1

    .line 64
    .line 65
    add-int/2addr p1, v3

    .line 66
    :goto_1
    if-ge p1, v4, :cond_7

    .line 67
    .line 68
    aget-byte v5, p0, p1

    .line 69
    .line 70
    and-int/lit16 v6, v5, 0xfe

    .line 71
    .line 72
    if-eqz v6, :cond_5

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_5
    add-int/lit8 v6, p1, -0x2

    .line 76
    .line 77
    aget-byte v7, p0, v6

    .line 78
    .line 79
    if-nez v7, :cond_6

    .line 80
    .line 81
    add-int/lit8 v7, p1, -0x1

    .line 82
    .line 83
    aget-byte v7, p0, v7

    .line 84
    .line 85
    if-nez v7, :cond_6

    .line 86
    .line 87
    if-ne v5, v2, :cond_6

    .line 88
    .line 89
    invoke-static {p3}, LR1/n;->a([Z)V

    .line 90
    .line 91
    .line 92
    return v6

    .line 93
    :cond_6
    add-int/lit8 p1, p1, -0x2

    .line 94
    .line 95
    :goto_2
    add-int/lit8 p1, p1, 0x3

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_7
    if-le v0, v3, :cond_9

    .line 99
    .line 100
    add-int/lit8 p1, p2, -0x3

    .line 101
    .line 102
    aget-byte p1, p0, p1

    .line 103
    .line 104
    if-nez p1, :cond_8

    .line 105
    .line 106
    add-int/lit8 p1, p2, -0x2

    .line 107
    .line 108
    aget-byte p1, p0, p1

    .line 109
    .line 110
    if-nez p1, :cond_8

    .line 111
    .line 112
    aget-byte p1, p0, v4

    .line 113
    .line 114
    if-ne p1, v2, :cond_8

    .line 115
    .line 116
    :goto_3
    move p1, v2

    .line 117
    goto :goto_4

    .line 118
    :cond_8
    move p1, v1

    .line 119
    goto :goto_4

    .line 120
    :cond_9
    if-ne v0, v3, :cond_a

    .line 121
    .line 122
    aget-boolean p1, p3, v3

    .line 123
    .line 124
    if-eqz p1, :cond_8

    .line 125
    .line 126
    add-int/lit8 p1, p2, -0x2

    .line 127
    .line 128
    aget-byte p1, p0, p1

    .line 129
    .line 130
    if-nez p1, :cond_8

    .line 131
    .line 132
    aget-byte p1, p0, v4

    .line 133
    .line 134
    if-ne p1, v2, :cond_8

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_a
    aget-boolean p1, p3, v2

    .line 138
    .line 139
    if-eqz p1, :cond_8

    .line 140
    .line 141
    aget-byte p1, p0, v4

    .line 142
    .line 143
    if-ne p1, v2, :cond_8

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :goto_4
    aput-boolean p1, p3, v1

    .line 147
    .line 148
    if-le v0, v2, :cond_c

    .line 149
    .line 150
    add-int/lit8 p1, p2, -0x2

    .line 151
    .line 152
    aget-byte p1, p0, p1

    .line 153
    .line 154
    if-nez p1, :cond_b

    .line 155
    .line 156
    aget-byte p1, p0, v4

    .line 157
    .line 158
    if-nez p1, :cond_b

    .line 159
    .line 160
    :goto_5
    move p1, v2

    .line 161
    goto :goto_6

    .line 162
    :cond_b
    move p1, v1

    .line 163
    goto :goto_6

    .line 164
    :cond_c
    aget-boolean p1, p3, v3

    .line 165
    .line 166
    if-eqz p1, :cond_b

    .line 167
    .line 168
    aget-byte p1, p0, v4

    .line 169
    .line 170
    if-nez p1, :cond_b

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :goto_6
    aput-boolean p1, p3, v2

    .line 174
    .line 175
    aget-byte p0, p0, v4

    .line 176
    .line 177
    if-nez p0, :cond_d

    .line 178
    .line 179
    move v1, v2

    .line 180
    :cond_d
    aput-boolean v1, p3, v3

    .line 181
    .line 182
    return p2
.end method

.method public static c(B)Z
    .locals 3

    .line 1
    and-int/lit8 v0, p0, 0x60

    .line 2
    .line 3
    shr-int/lit8 v0, v0, 0x5

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    and-int/lit8 p0, p0, 0x1f

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-ne p0, v1, :cond_1

    .line 13
    .line 14
    return v0

    .line 15
    :cond_1
    const/16 v2, 0x9

    .line 16
    .line 17
    if-ne p0, v2, :cond_2

    .line 18
    .line 19
    return v0

    .line 20
    :cond_2
    const/16 v2, 0xe

    .line 21
    .line 22
    if-ne p0, v2, :cond_3

    .line 23
    .line 24
    return v0

    .line 25
    :cond_3
    return v1
.end method

.method public static d(LJ5/y;)LD9/n;
    .locals 3

    .line 1
    invoke-virtual {p0}, LJ5/y;->s()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x6

    .line 5
    invoke-virtual {p0, v0}, LJ5/y;->i(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0, v0}, LJ5/y;->i(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x3

    .line 14
    invoke-virtual {p0, v2}, LJ5/y;->i(I)I

    .line 15
    .line 16
    .line 17
    new-instance p0, LD9/n;

    .line 18
    .line 19
    const/4 v2, 0x5

    .line 20
    invoke-direct {p0, v1, v0, v2}, LD9/n;-><init>(III)V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public static e(LJ5/y;ZILR1/g;)LR1/g;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const/4 v3, 0x6

    .line 8
    new-array v4, v3, [I

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/16 v6, 0x8

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    if-eqz p1, :cond_3

    .line 15
    .line 16
    invoke-virtual {v0, v5}, LJ5/y;->i(I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 21
    .line 22
    .line 23
    move-result v8

    .line 24
    const/4 v9, 0x5

    .line 25
    invoke-virtual {v0, v9}, LJ5/y;->i(I)I

    .line 26
    .line 27
    .line 28
    move-result v9

    .line 29
    move v10, v7

    .line 30
    move v11, v10

    .line 31
    :goto_0
    const/16 v12, 0x20

    .line 32
    .line 33
    if-ge v10, v12, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 36
    .line 37
    .line 38
    move-result v12

    .line 39
    if-eqz v12, :cond_0

    .line 40
    .line 41
    const/4 v12, 0x1

    .line 42
    shl-int/2addr v12, v10

    .line 43
    or-int/2addr v11, v12

    .line 44
    :cond_0
    add-int/lit8 v10, v10, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move v10, v7

    .line 48
    :goto_1
    if-ge v10, v3, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0, v6}, LJ5/y;->i(I)I

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    aput v12, v4, v10

    .line 55
    .line 56
    add-int/lit8 v10, v10, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move v13, v2

    .line 60
    :goto_2
    move-object/from16 v17, v4

    .line 61
    .line 62
    move v14, v8

    .line 63
    move v15, v9

    .line 64
    move/from16 v16, v11

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    if-eqz v2, :cond_4

    .line 68
    .line 69
    iget v3, v2, LR1/g;->a:I

    .line 70
    .line 71
    iget-boolean v8, v2, LR1/g;->b:Z

    .line 72
    .line 73
    iget v9, v2, LR1/g;->c:I

    .line 74
    .line 75
    iget v11, v2, LR1/g;->d:I

    .line 76
    .line 77
    iget-object v4, v2, LR1/g;->e:[I

    .line 78
    .line 79
    move v13, v3

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    move-object/from16 v17, v4

    .line 82
    .line 83
    move v13, v7

    .line 84
    move v14, v13

    .line 85
    move v15, v14

    .line 86
    move/from16 v16, v15

    .line 87
    .line 88
    :goto_3
    invoke-virtual {v0, v6}, LJ5/y;->i(I)I

    .line 89
    .line 90
    .line 91
    move-result v18

    .line 92
    move v2, v7

    .line 93
    :goto_4
    if-ge v7, v1, :cond_7

    .line 94
    .line 95
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_5

    .line 100
    .line 101
    add-int/lit8 v2, v2, 0x58

    .line 102
    .line 103
    :cond_5
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_6

    .line 108
    .line 109
    add-int/lit8 v2, v2, 0x8

    .line 110
    .line 111
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_7
    invoke-virtual {v0, v2}, LJ5/y;->t(I)V

    .line 115
    .line 116
    .line 117
    if-lez v1, :cond_8

    .line 118
    .line 119
    sub-int/2addr v6, v1

    .line 120
    mul-int/2addr v6, v5

    .line 121
    invoke-virtual {v0, v6}, LJ5/y;->t(I)V

    .line 122
    .line 123
    .line 124
    :cond_8
    new-instance v12, LR1/g;

    .line 125
    .line 126
    invoke-direct/range {v12 .. v18}, LR1/g;-><init>(IZII[II)V

    .line 127
    .line 128
    .line 129
    return-object v12
.end method

.method public static f(II[B)LR1/i;
    .locals 8

    .line 1
    add-int/lit8 p0, p0, 0x2

    .line 2
    .line 3
    add-int/lit8 p1, p1, -0x1

    .line 4
    .line 5
    :goto_0
    aget-byte v0, p2, p1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    if-le p1, p0, :cond_0

    .line 10
    .line 11
    add-int/lit8 p1, p1, -0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    if-eqz v0, :cond_e

    .line 15
    .line 16
    if-gt p1, p0, :cond_1

    .line 17
    .line 18
    goto/16 :goto_7

    .line 19
    .line 20
    :cond_1
    new-instance v0, LJ5/y;

    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x1

    .line 23
    .line 24
    const/4 v1, 0x3

    .line 25
    invoke-direct {v0, p0, p2, p1, v1}, LJ5/y;-><init>(I[BII)V

    .line 26
    .line 27
    .line 28
    :cond_2
    const/16 p0, 0x10

    .line 29
    .line 30
    invoke-virtual {v0, p0}, LJ5/y;->d(I)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_e

    .line 35
    .line 36
    const/16 p0, 0x8

    .line 37
    .line 38
    invoke-virtual {v0, p0}, LJ5/y;->i(I)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    const/4 p2, 0x0

    .line 43
    move v1, p2

    .line 44
    :goto_1
    const/16 v2, 0xff

    .line 45
    .line 46
    if-ne p1, v2, :cond_3

    .line 47
    .line 48
    add-int/lit16 v1, v1, 0xff

    .line 49
    .line 50
    invoke-virtual {v0, p0}, LJ5/y;->i(I)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    goto :goto_1

    .line 55
    :cond_3
    add-int/2addr v1, p1

    .line 56
    invoke-virtual {v0, p0}, LJ5/y;->i(I)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    move v3, p2

    .line 61
    :goto_2
    if-ne p1, v2, :cond_4

    .line 62
    .line 63
    add-int/lit16 v3, v3, 0xff

    .line 64
    .line 65
    invoke-virtual {v0, p0}, LJ5/y;->i(I)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    goto :goto_2

    .line 70
    :cond_4
    add-int/2addr v3, p1

    .line 71
    if-eqz v3, :cond_e

    .line 72
    .line 73
    invoke-virtual {v0, v3}, LJ5/y;->d(I)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-nez p0, :cond_5

    .line 78
    .line 79
    goto/16 :goto_7

    .line 80
    .line 81
    :cond_5
    const/16 p0, 0xb0

    .line 82
    .line 83
    if-ne v1, p0, :cond_2

    .line 84
    .line 85
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_6

    .line 94
    .line 95
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    goto :goto_3

    .line 100
    :cond_6
    move v1, p2

    .line 101
    :goto_3
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    const/4 v3, -0x1

    .line 106
    move v4, p2

    .line 107
    :goto_4
    if-gt v4, v2, :cond_d

    .line 108
    .line 109
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 114
    .line 115
    .line 116
    const/4 v5, 0x6

    .line 117
    invoke-virtual {v0, v5}, LJ5/y;->i(I)I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    const/16 v7, 0x3f

    .line 122
    .line 123
    if-ne v6, v7, :cond_7

    .line 124
    .line 125
    goto :goto_7

    .line 126
    :cond_7
    if-nez v6, :cond_8

    .line 127
    .line 128
    add-int/lit8 v6, p0, -0x1e

    .line 129
    .line 130
    invoke-static {p2, v6}, Ljava/lang/Math;->max(II)I

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    goto :goto_5

    .line 135
    :cond_8
    add-int/2addr v6, p0

    .line 136
    add-int/lit8 v6, v6, -0x1f

    .line 137
    .line 138
    invoke-static {p2, v6}, Ljava/lang/Math;->max(II)I

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    :goto_5
    invoke-virtual {v0, v6}, LJ5/y;->i(I)I

    .line 143
    .line 144
    .line 145
    if-eqz p1, :cond_b

    .line 146
    .line 147
    invoke-virtual {v0, v5}, LJ5/y;->i(I)I

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-ne v5, v7, :cond_9

    .line 152
    .line 153
    goto :goto_7

    .line 154
    :cond_9
    if-nez v5, :cond_a

    .line 155
    .line 156
    add-int/lit8 v5, v1, -0x1e

    .line 157
    .line 158
    invoke-static {p2, v5}, Ljava/lang/Math;->max(II)I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    goto :goto_6

    .line 163
    :cond_a
    add-int/2addr v5, v1

    .line 164
    add-int/lit8 v5, v5, -0x1f

    .line 165
    .line 166
    invoke-static {p2, v5}, Ljava/lang/Math;->max(II)I

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    :goto_6
    invoke-virtual {v0, v5}, LJ5/y;->i(I)I

    .line 171
    .line 172
    .line 173
    :cond_b
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    if-eqz v5, :cond_c

    .line 178
    .line 179
    const/16 v5, 0xa

    .line 180
    .line 181
    invoke-virtual {v0, v5}, LJ5/y;->t(I)V

    .line 182
    .line 183
    .line 184
    :cond_c
    add-int/lit8 v4, v4, 0x1

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_d
    new-instance p0, LR1/i;

    .line 188
    .line 189
    const/4 p1, 0x0

    .line 190
    const/4 p2, 0x0

    .line 191
    invoke-direct {p0, v3, p1, p2}, LR1/i;-><init>(IIB)V

    .line 192
    .line 193
    .line 194
    return-object p0

    .line 195
    :cond_e
    :goto_7
    const/4 p0, 0x0

    .line 196
    return-object p0
.end method

.method public static g([BIILVa/X7;)LR1/j;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    new-instance v4, LJ5/y;

    .line 10
    .line 11
    const/4 v5, 0x3

    .line 12
    invoke-direct {v4, v1, v0, v2, v5}, LJ5/y;-><init>(I[BII)V

    .line 13
    .line 14
    .line 15
    invoke-static {v4}, LR1/n;->d(LJ5/y;)LD9/n;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v5, 0x2

    .line 20
    add-int/2addr v1, v5

    .line 21
    new-instance v6, LJ5/y;

    .line 22
    .line 23
    const/4 v7, 0x3

    .line 24
    invoke-direct {v6, v1, v0, v2, v7}, LJ5/y;-><init>(I[BII)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    invoke-virtual {v6, v0}, LJ5/y;->t(I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v7, 0x1

    .line 37
    iget v4, v4, LD9/n;->c:I

    .line 38
    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    const/4 v9, 0x7

    .line 42
    if-ne v2, v9, :cond_0

    .line 43
    .line 44
    move v9, v7

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 v9, 0x0

    .line 47
    :goto_0
    if-eqz v3, :cond_1

    .line 48
    .line 49
    iget-object v10, v3, LVa/X7;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v10, Ll8/K;

    .line 52
    .line 53
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    if-nez v11, :cond_1

    .line 58
    .line 59
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->size()I

    .line 60
    .line 61
    .line 62
    move-result v11

    .line 63
    sub-int/2addr v11, v7

    .line 64
    invoke-static {v4, v11}, Ljava/lang/Math;->min(II)I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, LR1/f;

    .line 73
    .line 74
    iget v4, v4, LR1/f;->a:I

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    const/4 v4, 0x0

    .line 78
    :goto_1
    const/4 v10, 0x0

    .line 79
    if-nez v9, :cond_3

    .line 80
    .line 81
    invoke-virtual {v6}, LJ5/y;->s()V

    .line 82
    .line 83
    .line 84
    invoke-static {v6, v7, v2, v10}, LR1/n;->e(LJ5/y;ZILR1/g;)LR1/g;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    :cond_2
    :goto_2
    move-object v12, v10

    .line 89
    goto :goto_3

    .line 90
    :cond_3
    if-eqz v3, :cond_2

    .line 91
    .line 92
    iget-object v11, v3, LVa/X7;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v11, LS3/e;

    .line 95
    .line 96
    iget-object v12, v11, LS3/e;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v12, [I

    .line 99
    .line 100
    aget v12, v12, v4

    .line 101
    .line 102
    iget-object v11, v11, LS3/e;->b:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v11, Ll8/K;

    .line 105
    .line 106
    invoke-virtual {v11}, Ljava/util/AbstractCollection;->size()I

    .line 107
    .line 108
    .line 109
    move-result v13

    .line 110
    if-le v13, v12, :cond_2

    .line 111
    .line 112
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    check-cast v10, LR1/g;

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :goto_3
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 120
    .line 121
    .line 122
    const/4 v10, -0x1

    .line 123
    const/16 v11, 0x8

    .line 124
    .line 125
    if-eqz v9, :cond_7

    .line 126
    .line 127
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 128
    .line 129
    .line 130
    move-result v13

    .line 131
    if-eqz v13, :cond_4

    .line 132
    .line 133
    invoke-virtual {v6, v11}, LJ5/y;->i(I)I

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    goto :goto_4

    .line 138
    :cond_4
    move v13, v10

    .line 139
    :goto_4
    if-eqz v3, :cond_6

    .line 140
    .line 141
    iget-object v14, v3, LVa/X7;->c:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v14, LS3/s;

    .line 144
    .line 145
    if-eqz v14, :cond_6

    .line 146
    .line 147
    if-ne v13, v10, :cond_5

    .line 148
    .line 149
    iget-object v13, v14, LS3/s;->c:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v13, [I

    .line 152
    .line 153
    aget v13, v13, v4

    .line 154
    .line 155
    :cond_5
    if-eq v13, v10, :cond_6

    .line 156
    .line 157
    iget-object v14, v14, LS3/s;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v14, Ll8/K;

    .line 160
    .line 161
    invoke-virtual {v14}, Ljava/util/AbstractCollection;->size()I

    .line 162
    .line 163
    .line 164
    move-result v15

    .line 165
    if-le v15, v13, :cond_6

    .line 166
    .line 167
    invoke-interface {v14, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    check-cast v13, LR1/h;

    .line 172
    .line 173
    iget v14, v13, LR1/h;->a:I

    .line 174
    .line 175
    iget v14, v13, LR1/h;->d:I

    .line 176
    .line 177
    iget v15, v13, LR1/h;->e:I

    .line 178
    .line 179
    iget v10, v13, LR1/h;->b:I

    .line 180
    .line 181
    iget v13, v13, LR1/h;->c:I

    .line 182
    .line 183
    :goto_5
    move/from16 v29, v13

    .line 184
    .line 185
    move v13, v10

    .line 186
    move v10, v15

    .line 187
    move v15, v14

    .line 188
    move/from16 v14, v29

    .line 189
    .line 190
    goto :goto_9

    .line 191
    :cond_6
    const/4 v10, 0x0

    .line 192
    const/4 v13, 0x0

    .line 193
    const/4 v14, 0x0

    .line 194
    const/4 v15, 0x0

    .line 195
    goto :goto_9

    .line 196
    :cond_7
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 197
    .line 198
    .line 199
    move-result v10

    .line 200
    if-ne v10, v1, :cond_8

    .line 201
    .line 202
    invoke-virtual {v6}, LJ5/y;->s()V

    .line 203
    .line 204
    .line 205
    :cond_8
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 206
    .line 207
    .line 208
    move-result v13

    .line 209
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 210
    .line 211
    .line 212
    move-result v14

    .line 213
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 214
    .line 215
    .line 216
    move-result v15

    .line 217
    if-eqz v15, :cond_c

    .line 218
    .line 219
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 220
    .line 221
    .line 222
    move-result v15

    .line 223
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 224
    .line 225
    .line 226
    move-result v16

    .line 227
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 228
    .line 229
    .line 230
    move-result v17

    .line 231
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 232
    .line 233
    .line 234
    move-result v18

    .line 235
    if-eq v10, v7, :cond_a

    .line 236
    .line 237
    if-ne v10, v5, :cond_9

    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_9
    move/from16 v19, v7

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_a
    :goto_6
    move/from16 v19, v5

    .line 244
    .line 245
    :goto_7
    add-int v15, v15, v16

    .line 246
    .line 247
    mul-int v15, v15, v19

    .line 248
    .line 249
    sub-int/2addr v13, v15

    .line 250
    if-ne v10, v7, :cond_b

    .line 251
    .line 252
    move v10, v5

    .line 253
    goto :goto_8

    .line 254
    :cond_b
    move v10, v7

    .line 255
    :goto_8
    add-int v17, v17, v18

    .line 256
    .line 257
    mul-int v17, v17, v10

    .line 258
    .line 259
    sub-int v14, v14, v17

    .line 260
    .line 261
    :cond_c
    move v15, v14

    .line 262
    move v14, v13

    .line 263
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 268
    .line 269
    .line 270
    move-result v13

    .line 271
    goto :goto_5

    .line 272
    :goto_9
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 273
    .line 274
    .line 275
    move-result v16

    .line 276
    if-nez v9, :cond_f

    .line 277
    .line 278
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 279
    .line 280
    .line 281
    move-result v17

    .line 282
    if-eqz v17, :cond_d

    .line 283
    .line 284
    const/16 v17, 0x0

    .line 285
    .line 286
    goto :goto_a

    .line 287
    :cond_d
    move/from16 v17, v2

    .line 288
    .line 289
    :goto_a
    move/from16 v8, v17

    .line 290
    .line 291
    const/4 v11, -0x1

    .line 292
    :goto_b
    if-gt v8, v2, :cond_e

    .line 293
    .line 294
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 295
    .line 296
    .line 297
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    invoke-static {v5, v11}, Ljava/lang/Math;->max(II)I

    .line 302
    .line 303
    .line 304
    move-result v11

    .line 305
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 306
    .line 307
    .line 308
    add-int/lit8 v8, v8, 0x1

    .line 309
    .line 310
    const/4 v5, 0x2

    .line 311
    goto :goto_b

    .line 312
    :cond_e
    move/from16 v18, v11

    .line 313
    .line 314
    goto :goto_c

    .line 315
    :cond_f
    const/16 v18, -0x1

    .line 316
    .line 317
    :goto_c
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 318
    .line 319
    .line 320
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 321
    .line 322
    .line 323
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 324
    .line 325
    .line 326
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 327
    .line 328
    .line 329
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 330
    .line 331
    .line 332
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 333
    .line 334
    .line 335
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    if-eqz v2, :cond_11

    .line 340
    .line 341
    if-eqz v9, :cond_10

    .line 342
    .line 343
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    goto :goto_d

    .line 348
    :cond_10
    const/4 v2, 0x0

    .line 349
    :goto_d
    const/4 v5, 0x6

    .line 350
    if-eqz v2, :cond_12

    .line 351
    .line 352
    invoke-virtual {v6, v5}, LJ5/y;->t(I)V

    .line 353
    .line 354
    .line 355
    :cond_11
    const/4 v0, 0x2

    .line 356
    goto :goto_13

    .line 357
    :cond_12
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    if-eqz v2, :cond_11

    .line 362
    .line 363
    const/4 v2, 0x0

    .line 364
    :goto_e
    if-ge v2, v0, :cond_11

    .line 365
    .line 366
    const/4 v8, 0x0

    .line 367
    :goto_f
    if-ge v8, v5, :cond_17

    .line 368
    .line 369
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 370
    .line 371
    .line 372
    move-result v9

    .line 373
    if-nez v9, :cond_13

    .line 374
    .line 375
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 376
    .line 377
    .line 378
    goto :goto_11

    .line 379
    :cond_13
    shl-int/lit8 v9, v2, 0x1

    .line 380
    .line 381
    add-int/2addr v9, v0

    .line 382
    shl-int v9, v7, v9

    .line 383
    .line 384
    const/16 v11, 0x40

    .line 385
    .line 386
    invoke-static {v11, v9}, Ljava/lang/Math;->min(II)I

    .line 387
    .line 388
    .line 389
    move-result v9

    .line 390
    if-le v2, v7, :cond_14

    .line 391
    .line 392
    invoke-virtual {v6}, LJ5/y;->n()I

    .line 393
    .line 394
    .line 395
    :cond_14
    const/4 v11, 0x0

    .line 396
    :goto_10
    if-ge v11, v9, :cond_15

    .line 397
    .line 398
    invoke-virtual {v6}, LJ5/y;->n()I

    .line 399
    .line 400
    .line 401
    add-int/lit8 v11, v11, 0x1

    .line 402
    .line 403
    goto :goto_10

    .line 404
    :cond_15
    :goto_11
    if-ne v2, v1, :cond_16

    .line 405
    .line 406
    move v9, v1

    .line 407
    goto :goto_12

    .line 408
    :cond_16
    move v9, v7

    .line 409
    :goto_12
    add-int/2addr v8, v9

    .line 410
    goto :goto_f

    .line 411
    :cond_17
    add-int/lit8 v2, v2, 0x1

    .line 412
    .line 413
    goto :goto_e

    .line 414
    :goto_13
    invoke-virtual {v6, v0}, LJ5/y;->t(I)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    if-eqz v0, :cond_18

    .line 422
    .line 423
    const/16 v0, 0x8

    .line 424
    .line 425
    invoke-virtual {v6, v0}, LJ5/y;->t(I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 429
    .line 430
    .line 431
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 432
    .line 433
    .line 434
    invoke-virtual {v6}, LJ5/y;->s()V

    .line 435
    .line 436
    .line 437
    :cond_18
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    const/4 v2, 0x0

    .line 442
    new-array v5, v2, [I

    .line 443
    .line 444
    new-array v8, v2, [I

    .line 445
    .line 446
    move v9, v2

    .line 447
    const/4 v2, -0x1

    .line 448
    const/4 v11, -0x1

    .line 449
    :goto_14
    if-ge v9, v0, :cond_2a

    .line 450
    .line 451
    if-eqz v9, :cond_25

    .line 452
    .line 453
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 454
    .line 455
    .line 456
    move-result v19

    .line 457
    if-eqz v19, :cond_25

    .line 458
    .line 459
    move/from16 v19, v7

    .line 460
    .line 461
    add-int v7, v11, v2

    .line 462
    .line 463
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 464
    .line 465
    .line 466
    move-result v20

    .line 467
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 468
    .line 469
    .line 470
    move-result v21

    .line 471
    add-int/lit8 v21, v21, 0x1

    .line 472
    .line 473
    const/16 v17, 0x2

    .line 474
    .line 475
    mul-int/lit8 v20, v20, 0x2

    .line 476
    .line 477
    rsub-int/lit8 v20, v20, 0x1

    .line 478
    .line 479
    mul-int v20, v20, v21

    .line 480
    .line 481
    add-int/lit8 v1, v7, 0x1

    .line 482
    .line 483
    move/from16 v22, v0

    .line 484
    .line 485
    new-array v0, v1, [Z

    .line 486
    .line 487
    move-object/from16 v23, v0

    .line 488
    .line 489
    const/4 v0, 0x0

    .line 490
    :goto_15
    if-gt v0, v7, :cond_1a

    .line 491
    .line 492
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 493
    .line 494
    .line 495
    move-result v24

    .line 496
    if-nez v24, :cond_19

    .line 497
    .line 498
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 499
    .line 500
    .line 501
    move-result v24

    .line 502
    aput-boolean v24, v23, v0

    .line 503
    .line 504
    goto :goto_16

    .line 505
    :cond_19
    aput-boolean v19, v23, v0

    .line 506
    .line 507
    :goto_16
    add-int/lit8 v0, v0, 0x1

    .line 508
    .line 509
    goto :goto_15

    .line 510
    :cond_1a
    new-array v0, v1, [I

    .line 511
    .line 512
    new-array v1, v1, [I

    .line 513
    .line 514
    add-int/lit8 v24, v2, -0x1

    .line 515
    .line 516
    const/16 v25, 0x0

    .line 517
    .line 518
    :goto_17
    if-ltz v24, :cond_1c

    .line 519
    .line 520
    aget v26, v8, v24

    .line 521
    .line 522
    add-int v26, v26, v20

    .line 523
    .line 524
    if-gez v26, :cond_1b

    .line 525
    .line 526
    add-int v27, v11, v24

    .line 527
    .line 528
    aget-boolean v27, v23, v27

    .line 529
    .line 530
    if-eqz v27, :cond_1b

    .line 531
    .line 532
    add-int/lit8 v27, v25, 0x1

    .line 533
    .line 534
    aput v26, v0, v25

    .line 535
    .line 536
    move/from16 v25, v27

    .line 537
    .line 538
    :cond_1b
    add-int/lit8 v24, v24, -0x1

    .line 539
    .line 540
    goto :goto_17

    .line 541
    :cond_1c
    if-gez v20, :cond_1d

    .line 542
    .line 543
    aget-boolean v24, v23, v7

    .line 544
    .line 545
    if-eqz v24, :cond_1d

    .line 546
    .line 547
    add-int/lit8 v24, v25, 0x1

    .line 548
    .line 549
    aput v20, v0, v25

    .line 550
    .line 551
    move/from16 v25, v24

    .line 552
    .line 553
    :cond_1d
    move/from16 v24, v4

    .line 554
    .line 555
    move/from16 v4, v25

    .line 556
    .line 557
    move-object/from16 v25, v5

    .line 558
    .line 559
    const/4 v5, 0x0

    .line 560
    :goto_18
    if-ge v5, v11, :cond_1f

    .line 561
    .line 562
    aget v26, v25, v5

    .line 563
    .line 564
    add-int v26, v26, v20

    .line 565
    .line 566
    if-gez v26, :cond_1e

    .line 567
    .line 568
    aget-boolean v27, v23, v5

    .line 569
    .line 570
    if-eqz v27, :cond_1e

    .line 571
    .line 572
    add-int/lit8 v27, v4, 0x1

    .line 573
    .line 574
    aput v26, v0, v4

    .line 575
    .line 576
    move/from16 v4, v27

    .line 577
    .line 578
    :cond_1e
    add-int/lit8 v5, v5, 0x1

    .line 579
    .line 580
    goto :goto_18

    .line 581
    :cond_1f
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([II)[I

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    add-int/lit8 v5, v11, -0x1

    .line 586
    .line 587
    const/16 v26, 0x0

    .line 588
    .line 589
    :goto_19
    if-ltz v5, :cond_21

    .line 590
    .line 591
    aget v27, v25, v5

    .line 592
    .line 593
    add-int v27, v27, v20

    .line 594
    .line 595
    if-lez v27, :cond_20

    .line 596
    .line 597
    aget-boolean v28, v23, v5

    .line 598
    .line 599
    if-eqz v28, :cond_20

    .line 600
    .line 601
    add-int/lit8 v28, v26, 0x1

    .line 602
    .line 603
    aput v27, v1, v26

    .line 604
    .line 605
    move/from16 v26, v28

    .line 606
    .line 607
    :cond_20
    add-int/lit8 v5, v5, -0x1

    .line 608
    .line 609
    goto :goto_19

    .line 610
    :cond_21
    if-lez v20, :cond_22

    .line 611
    .line 612
    aget-boolean v5, v23, v7

    .line 613
    .line 614
    if-eqz v5, :cond_22

    .line 615
    .line 616
    add-int/lit8 v5, v26, 0x1

    .line 617
    .line 618
    aput v20, v1, v26

    .line 619
    .line 620
    move/from16 v26, v5

    .line 621
    .line 622
    :cond_22
    move/from16 v5, v26

    .line 623
    .line 624
    const/4 v7, 0x0

    .line 625
    :goto_1a
    if-ge v7, v2, :cond_24

    .line 626
    .line 627
    aget v25, v8, v7

    .line 628
    .line 629
    add-int v25, v25, v20

    .line 630
    .line 631
    if-lez v25, :cond_23

    .line 632
    .line 633
    add-int v26, v11, v7

    .line 634
    .line 635
    aget-boolean v26, v23, v26

    .line 636
    .line 637
    if-eqz v26, :cond_23

    .line 638
    .line 639
    add-int/lit8 v26, v5, 0x1

    .line 640
    .line 641
    aput v25, v1, v5

    .line 642
    .line 643
    move/from16 v5, v26

    .line 644
    .line 645
    :cond_23
    add-int/lit8 v7, v7, 0x1

    .line 646
    .line 647
    goto :goto_1a

    .line 648
    :cond_24
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    move-object v8, v1

    .line 653
    move v11, v4

    .line 654
    move v2, v5

    .line 655
    move-object v5, v0

    .line 656
    goto :goto_1f

    .line 657
    :cond_25
    move/from16 v22, v0

    .line 658
    .line 659
    move/from16 v24, v4

    .line 660
    .line 661
    move/from16 v19, v7

    .line 662
    .line 663
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 664
    .line 665
    .line 666
    move-result v0

    .line 667
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 668
    .line 669
    .line 670
    move-result v1

    .line 671
    new-array v2, v0, [I

    .line 672
    .line 673
    const/4 v4, 0x0

    .line 674
    :goto_1b
    if-ge v4, v0, :cond_27

    .line 675
    .line 676
    if-lez v4, :cond_26

    .line 677
    .line 678
    add-int/lit8 v5, v4, -0x1

    .line 679
    .line 680
    aget v5, v2, v5

    .line 681
    .line 682
    goto :goto_1c

    .line 683
    :cond_26
    const/4 v5, 0x0

    .line 684
    :goto_1c
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 685
    .line 686
    .line 687
    move-result v7

    .line 688
    add-int/lit8 v7, v7, 0x1

    .line 689
    .line 690
    sub-int/2addr v5, v7

    .line 691
    aput v5, v2, v4

    .line 692
    .line 693
    invoke-virtual {v6}, LJ5/y;->s()V

    .line 694
    .line 695
    .line 696
    add-int/lit8 v4, v4, 0x1

    .line 697
    .line 698
    goto :goto_1b

    .line 699
    :cond_27
    new-array v4, v1, [I

    .line 700
    .line 701
    const/4 v5, 0x0

    .line 702
    :goto_1d
    if-ge v5, v1, :cond_29

    .line 703
    .line 704
    if-lez v5, :cond_28

    .line 705
    .line 706
    add-int/lit8 v7, v5, -0x1

    .line 707
    .line 708
    aget v7, v4, v7

    .line 709
    .line 710
    goto :goto_1e

    .line 711
    :cond_28
    const/4 v7, 0x0

    .line 712
    :goto_1e
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 713
    .line 714
    .line 715
    move-result v8

    .line 716
    add-int/lit8 v8, v8, 0x1

    .line 717
    .line 718
    add-int/2addr v8, v7

    .line 719
    aput v8, v4, v5

    .line 720
    .line 721
    invoke-virtual {v6}, LJ5/y;->s()V

    .line 722
    .line 723
    .line 724
    add-int/lit8 v5, v5, 0x1

    .line 725
    .line 726
    goto :goto_1d

    .line 727
    :cond_29
    move v11, v0

    .line 728
    move-object v5, v2

    .line 729
    move-object v8, v4

    .line 730
    move v2, v1

    .line 731
    :goto_1f
    add-int/lit8 v9, v9, 0x1

    .line 732
    .line 733
    move/from16 v7, v19

    .line 734
    .line 735
    move/from16 v0, v22

    .line 736
    .line 737
    move/from16 v4, v24

    .line 738
    .line 739
    const/4 v1, 0x3

    .line 740
    goto/16 :goto_14

    .line 741
    .line 742
    :cond_2a
    move/from16 v24, v4

    .line 743
    .line 744
    move/from16 v19, v7

    .line 745
    .line 746
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 747
    .line 748
    .line 749
    move-result v0

    .line 750
    if-eqz v0, :cond_2b

    .line 751
    .line 752
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 753
    .line 754
    .line 755
    move-result v0

    .line 756
    const/4 v8, 0x0

    .line 757
    :goto_20
    if-ge v8, v0, :cond_2b

    .line 758
    .line 759
    add-int/lit8 v1, v16, 0x5

    .line 760
    .line 761
    invoke-virtual {v6, v1}, LJ5/y;->t(I)V

    .line 762
    .line 763
    .line 764
    add-int/lit8 v8, v8, 0x1

    .line 765
    .line 766
    goto :goto_20

    .line 767
    :cond_2b
    const/4 v0, 0x2

    .line 768
    invoke-virtual {v6, v0}, LJ5/y;->t(I)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 772
    .line 773
    .line 774
    move-result v1

    .line 775
    const/high16 v2, 0x3f800000    # 1.0f

    .line 776
    .line 777
    if-eqz v1, :cond_36

    .line 778
    .line 779
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 780
    .line 781
    .line 782
    move-result v1

    .line 783
    if-eqz v1, :cond_2e

    .line 784
    .line 785
    const/16 v1, 0x8

    .line 786
    .line 787
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 788
    .line 789
    .line 790
    move-result v4

    .line 791
    const/16 v1, 0xff

    .line 792
    .line 793
    if-ne v4, v1, :cond_2c

    .line 794
    .line 795
    const/16 v1, 0x10

    .line 796
    .line 797
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 798
    .line 799
    .line 800
    move-result v4

    .line 801
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 802
    .line 803
    .line 804
    move-result v1

    .line 805
    if-eqz v4, :cond_2e

    .line 806
    .line 807
    if-eqz v1, :cond_2e

    .line 808
    .line 809
    int-to-float v2, v4

    .line 810
    int-to-float v1, v1

    .line 811
    div-float/2addr v2, v1

    .line 812
    goto :goto_21

    .line 813
    :cond_2c
    const/16 v1, 0x11

    .line 814
    .line 815
    if-ge v4, v1, :cond_2d

    .line 816
    .line 817
    sget-object v1, LR1/n;->b:[F

    .line 818
    .line 819
    aget v2, v1, v4

    .line 820
    .line 821
    goto :goto_21

    .line 822
    :cond_2d
    const-string v1, "Unexpected aspect_ratio_idc value: "

    .line 823
    .line 824
    const-string v5, "NalUnitUtil"

    .line 825
    .line 826
    invoke-static {v4, v1, v5}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 827
    .line 828
    .line 829
    :cond_2e
    :goto_21
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 830
    .line 831
    .line 832
    move-result v1

    .line 833
    if-eqz v1, :cond_2f

    .line 834
    .line 835
    invoke-virtual {v6}, LJ5/y;->s()V

    .line 836
    .line 837
    .line 838
    :cond_2f
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 839
    .line 840
    .line 841
    move-result v1

    .line 842
    if-eqz v1, :cond_32

    .line 843
    .line 844
    const/4 v1, 0x3

    .line 845
    invoke-virtual {v6, v1}, LJ5/y;->t(I)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 849
    .line 850
    .line 851
    move-result v1

    .line 852
    if-eqz v1, :cond_30

    .line 853
    .line 854
    move/from16 v5, v19

    .line 855
    .line 856
    goto :goto_22

    .line 857
    :cond_30
    move v5, v0

    .line 858
    :goto_22
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 859
    .line 860
    .line 861
    move-result v0

    .line 862
    if-eqz v0, :cond_31

    .line 863
    .line 864
    const/16 v0, 0x8

    .line 865
    .line 866
    invoke-virtual {v6, v0}, LJ5/y;->i(I)I

    .line 867
    .line 868
    .line 869
    move-result v1

    .line 870
    invoke-virtual {v6, v0}, LJ5/y;->i(I)I

    .line 871
    .line 872
    .line 873
    move-result v3

    .line 874
    invoke-virtual {v6, v0}, LJ5/y;->t(I)V

    .line 875
    .line 876
    .line 877
    invoke-static {v1}, LN1/f;->f(I)I

    .line 878
    .line 879
    .line 880
    move-result v0

    .line 881
    invoke-static {v3}, LN1/f;->g(I)I

    .line 882
    .line 883
    .line 884
    move-result v1

    .line 885
    goto :goto_23

    .line 886
    :cond_31
    const/4 v0, -0x1

    .line 887
    const/4 v1, -0x1

    .line 888
    goto :goto_23

    .line 889
    :cond_32
    if-eqz v3, :cond_33

    .line 890
    .line 891
    iget-object v0, v3, LVa/X7;->d:Ljava/lang/Object;

    .line 892
    .line 893
    check-cast v0, LS3/c;

    .line 894
    .line 895
    if-eqz v0, :cond_33

    .line 896
    .line 897
    iget-object v1, v0, LS3/c;->c:Ljava/lang/Object;

    .line 898
    .line 899
    check-cast v1, [I

    .line 900
    .line 901
    aget v1, v1, v24

    .line 902
    .line 903
    iget-object v0, v0, LS3/c;->b:Ljava/lang/Object;

    .line 904
    .line 905
    check-cast v0, Ll8/K;

    .line 906
    .line 907
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 908
    .line 909
    .line 910
    move-result v3

    .line 911
    if-le v3, v1, :cond_33

    .line 912
    .line 913
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    check-cast v0, LR1/k;

    .line 918
    .line 919
    iget v1, v0, LR1/k;->a:I

    .line 920
    .line 921
    iget v3, v0, LR1/k;->b:I

    .line 922
    .line 923
    iget v0, v0, LR1/k;->c:I

    .line 924
    .line 925
    move v5, v1

    .line 926
    move v1, v0

    .line 927
    move v0, v5

    .line 928
    move v5, v3

    .line 929
    goto :goto_23

    .line 930
    :cond_33
    const/4 v0, -0x1

    .line 931
    const/4 v1, -0x1

    .line 932
    const/4 v5, -0x1

    .line 933
    :goto_23
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 934
    .line 935
    .line 936
    move-result v3

    .line 937
    if-eqz v3, :cond_34

    .line 938
    .line 939
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 940
    .line 941
    .line 942
    invoke-virtual {v6}, LJ5/y;->m()I

    .line 943
    .line 944
    .line 945
    :cond_34
    invoke-virtual {v6}, LJ5/y;->s()V

    .line 946
    .line 947
    .line 948
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 949
    .line 950
    .line 951
    move-result v3

    .line 952
    if-eqz v3, :cond_35

    .line 953
    .line 954
    mul-int/lit8 v10, v10, 0x2

    .line 955
    .line 956
    :cond_35
    move/from16 v19, v0

    .line 957
    .line 958
    move/from16 v21, v1

    .line 959
    .line 960
    move/from16 v17, v2

    .line 961
    .line 962
    move/from16 v20, v5

    .line 963
    .line 964
    move/from16 v16, v10

    .line 965
    .line 966
    goto :goto_24

    .line 967
    :cond_36
    move/from16 v17, v2

    .line 968
    .line 969
    move/from16 v16, v10

    .line 970
    .line 971
    const/16 v19, -0x1

    .line 972
    .line 973
    const/16 v20, -0x1

    .line 974
    .line 975
    const/16 v21, -0x1

    .line 976
    .line 977
    :goto_24
    new-instance v11, LR1/j;

    .line 978
    .line 979
    invoke-direct/range {v11 .. v21}, LR1/j;-><init>(LR1/g;IIIIFIIII)V

    .line 980
    .line 981
    .line 982
    return-object v11
.end method

.method public static h(II[B)LVa/X7;
    .locals 40

    .line 1
    new-instance v0, LJ5/y;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    move/from16 v2, p0

    .line 5
    .line 6
    move/from16 v3, p1

    .line 7
    .line 8
    move-object/from16 v4, p2

    .line 9
    .line 10
    invoke-direct {v0, v2, v4, v3, v1}, LJ5/y;-><init>(I[BII)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, LR1/n;->d(LJ5/y;)LD9/n;

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    invoke-virtual {v0, v1}, LJ5/y;->t(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x6

    .line 29
    invoke-virtual {v0, v4}, LJ5/y;->i(I)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    add-int/lit8 v6, v5, 0x1

    .line 34
    .line 35
    const/4 v7, 0x3

    .line 36
    invoke-virtual {v0, v7}, LJ5/y;->i(I)I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    const/16 v9, 0x11

    .line 41
    .line 42
    invoke-virtual {v0, v9}, LJ5/y;->t(I)V

    .line 43
    .line 44
    .line 45
    const/4 v9, 0x1

    .line 46
    const/4 v10, 0x0

    .line 47
    invoke-static {v0, v9, v8, v10}, LR1/n;->e(LJ5/y;ZILR1/g;)LR1/g;

    .line 48
    .line 49
    .line 50
    move-result-object v11

    .line 51
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 52
    .line 53
    .line 54
    move-result v12

    .line 55
    const/4 v13, 0x0

    .line 56
    if-eqz v12, :cond_0

    .line 57
    .line 58
    move v12, v13

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move v12, v8

    .line 61
    :goto_0
    if-gt v12, v8, :cond_1

    .line 62
    .line 63
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 70
    .line 71
    .line 72
    add-int/lit8 v12, v12, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    invoke-virtual {v0, v4}, LJ5/y;->i(I)I

    .line 76
    .line 77
    .line 78
    move-result v12

    .line 79
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 80
    .line 81
    .line 82
    move-result v14

    .line 83
    add-int/2addr v14, v9

    .line 84
    invoke-static {v11}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 85
    .line 86
    .line 87
    move-result-object v15

    .line 88
    move/from16 p0, v4

    .line 89
    .line 90
    new-instance v4, LS3/e;

    .line 91
    .line 92
    new-array v7, v9, [I

    .line 93
    .line 94
    invoke-direct {v4, v15, v7}, LS3/e;-><init>(Ll8/e0;[I)V

    .line 95
    .line 96
    .line 97
    const/4 v7, 0x2

    .line 98
    if-lt v6, v7, :cond_2

    .line 99
    .line 100
    if-lt v14, v7, :cond_2

    .line 101
    .line 102
    move v15, v9

    .line 103
    goto :goto_1

    .line 104
    :cond_2
    move v15, v13

    .line 105
    :goto_1
    if-eqz v2, :cond_3

    .line 106
    .line 107
    if-eqz v3, :cond_3

    .line 108
    .line 109
    move v2, v9

    .line 110
    goto :goto_2

    .line 111
    :cond_3
    move v2, v13

    .line 112
    :goto_2
    add-int/lit8 v3, v12, 0x1

    .line 113
    .line 114
    if-lt v3, v6, :cond_4

    .line 115
    .line 116
    move/from16 v16, v9

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_4
    move/from16 v16, v13

    .line 120
    .line 121
    :goto_3
    if-eqz v15, :cond_5

    .line 122
    .line 123
    if-eqz v2, :cond_5

    .line 124
    .line 125
    if-nez v16, :cond_6

    .line 126
    .line 127
    :cond_5
    move-object v1, v10

    .line 128
    goto/16 :goto_5f

    .line 129
    .line 130
    :cond_6
    new-array v2, v7, [I

    .line 131
    .line 132
    aput v3, v2, v9

    .line 133
    .line 134
    aput v14, v2, v13

    .line 135
    .line 136
    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 137
    .line 138
    invoke-static {v15, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, [[I

    .line 143
    .line 144
    move/from16 p2, v9

    .line 145
    .line 146
    new-array v9, v14, [I

    .line 147
    .line 148
    new-array v7, v14, [I

    .line 149
    .line 150
    aget-object v17, v2, v13

    .line 151
    .line 152
    aput v13, v17, v13

    .line 153
    .line 154
    aput p2, v9, v13

    .line 155
    .line 156
    aput v13, v7, v13

    .line 157
    .line 158
    move/from16 v13, p2

    .line 159
    .line 160
    :goto_4
    if-ge v13, v14, :cond_9

    .line 161
    .line 162
    const/4 v10, 0x0

    .line 163
    const/16 v19, 0x0

    .line 164
    .line 165
    :goto_5
    if-gt v10, v12, :cond_8

    .line 166
    .line 167
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 168
    .line 169
    .line 170
    move-result v20

    .line 171
    if-eqz v20, :cond_7

    .line 172
    .line 173
    aget-object v20, v2, v13

    .line 174
    .line 175
    add-int/lit8 v21, v19, 0x1

    .line 176
    .line 177
    aput v10, v20, v19

    .line 178
    .line 179
    aput v10, v7, v13

    .line 180
    .line 181
    move/from16 v19, v21

    .line 182
    .line 183
    :cond_7
    aput v19, v9, v13

    .line 184
    .line 185
    add-int/lit8 v10, v10, 0x1

    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_8
    add-int/lit8 v13, v13, 0x1

    .line 189
    .line 190
    const/4 v10, 0x0

    .line 191
    goto :goto_4

    .line 192
    :cond_9
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    if-eqz v10, :cond_18

    .line 197
    .line 198
    const/16 v10, 0x40

    .line 199
    .line 200
    invoke-virtual {v0, v10}, LJ5/y;->t(I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    if-eqz v10, :cond_a

    .line 208
    .line 209
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 210
    .line 211
    .line 212
    :cond_a
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    const/4 v1, 0x0

    .line 217
    :goto_6
    if-ge v1, v10, :cond_18

    .line 218
    .line 219
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 220
    .line 221
    .line 222
    if-eqz v1, :cond_d

    .line 223
    .line 224
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 225
    .line 226
    .line 227
    move-result v20

    .line 228
    if-eqz v20, :cond_b

    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_b
    const/16 v20, 0x0

    .line 232
    .line 233
    const/16 v21, 0x0

    .line 234
    .line 235
    :cond_c
    const/16 v22, 0x0

    .line 236
    .line 237
    goto :goto_8

    .line 238
    :cond_d
    :goto_7
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 239
    .line 240
    .line 241
    move-result v20

    .line 242
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 243
    .line 244
    .line 245
    move-result v21

    .line 246
    if-nez v20, :cond_e

    .line 247
    .line 248
    if-eqz v21, :cond_c

    .line 249
    .line 250
    :cond_e
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 251
    .line 252
    .line 253
    move-result v22

    .line 254
    if-eqz v22, :cond_f

    .line 255
    .line 256
    const/16 v13, 0x13

    .line 257
    .line 258
    invoke-virtual {v0, v13}, LJ5/y;->t(I)V

    .line 259
    .line 260
    .line 261
    :cond_f
    const/16 v13, 0x8

    .line 262
    .line 263
    invoke-virtual {v0, v13}, LJ5/y;->t(I)V

    .line 264
    .line 265
    .line 266
    if-eqz v22, :cond_10

    .line 267
    .line 268
    const/4 v13, 0x4

    .line 269
    invoke-virtual {v0, v13}, LJ5/y;->t(I)V

    .line 270
    .line 271
    .line 272
    :cond_10
    const/16 v13, 0xf

    .line 273
    .line 274
    invoke-virtual {v0, v13}, LJ5/y;->t(I)V

    .line 275
    .line 276
    .line 277
    :goto_8
    const/4 v13, 0x0

    .line 278
    :goto_9
    if-gt v13, v8, :cond_17

    .line 279
    .line 280
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 281
    .line 282
    .line 283
    move-result v24

    .line 284
    if-nez v24, :cond_11

    .line 285
    .line 286
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 287
    .line 288
    .line 289
    move-result v24

    .line 290
    :cond_11
    if-eqz v24, :cond_12

    .line 291
    .line 292
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 293
    .line 294
    .line 295
    const/16 v24, 0x0

    .line 296
    .line 297
    goto :goto_a

    .line 298
    :cond_12
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 299
    .line 300
    .line 301
    move-result v24

    .line 302
    :goto_a
    if-nez v24, :cond_13

    .line 303
    .line 304
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 305
    .line 306
    .line 307
    move-result v24

    .line 308
    move/from16 v25, v24

    .line 309
    .line 310
    move/from16 v24, v1

    .line 311
    .line 312
    move/from16 v1, v25

    .line 313
    .line 314
    :goto_b
    move-object/from16 v25, v2

    .line 315
    .line 316
    goto :goto_c

    .line 317
    :cond_13
    move/from16 v24, v1

    .line 318
    .line 319
    const/4 v1, 0x0

    .line 320
    goto :goto_b

    .line 321
    :goto_c
    add-int v2, v20, v21

    .line 322
    .line 323
    move-object/from16 v26, v7

    .line 324
    .line 325
    const/4 v7, 0x0

    .line 326
    :goto_d
    if-ge v7, v2, :cond_16

    .line 327
    .line 328
    move/from16 v27, v2

    .line 329
    .line 330
    const/4 v2, 0x0

    .line 331
    :goto_e
    if-gt v2, v1, :cond_15

    .line 332
    .line 333
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 337
    .line 338
    .line 339
    if-eqz v22, :cond_14

    .line 340
    .line 341
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 345
    .line 346
    .line 347
    :cond_14
    invoke-virtual {v0}, LJ5/y;->s()V

    .line 348
    .line 349
    .line 350
    add-int/lit8 v2, v2, 0x1

    .line 351
    .line 352
    goto :goto_e

    .line 353
    :cond_15
    add-int/lit8 v7, v7, 0x1

    .line 354
    .line 355
    move/from16 v2, v27

    .line 356
    .line 357
    goto :goto_d

    .line 358
    :cond_16
    add-int/lit8 v13, v13, 0x1

    .line 359
    .line 360
    move/from16 v1, v24

    .line 361
    .line 362
    move-object/from16 v2, v25

    .line 363
    .line 364
    move-object/from16 v7, v26

    .line 365
    .line 366
    goto :goto_9

    .line 367
    :cond_17
    move/from16 v24, v1

    .line 368
    .line 369
    move-object/from16 v25, v2

    .line 370
    .line 371
    move-object/from16 v26, v7

    .line 372
    .line 373
    add-int/lit8 v1, v24, 0x1

    .line 374
    .line 375
    goto/16 :goto_6

    .line 376
    .line 377
    :cond_18
    move-object/from16 v25, v2

    .line 378
    .line 379
    move-object/from16 v26, v7

    .line 380
    .line 381
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    if-nez v1, :cond_19

    .line 386
    .line 387
    new-instance v0, LVa/X7;

    .line 388
    .line 389
    const/4 v1, 0x0

    .line 390
    invoke-direct {v0, v1, v4, v1, v1}, LVa/X7;-><init>(Ll8/e0;LS3/e;LS3/s;LS3/c;)V

    .line 391
    .line 392
    .line 393
    return-object v0

    .line 394
    :cond_19
    iget v1, v0, LJ5/y;->e:I

    .line 395
    .line 396
    if-lez v1, :cond_1a

    .line 397
    .line 398
    const/16 v23, 0x8

    .line 399
    .line 400
    rsub-int/lit8 v13, v1, 0x8

    .line 401
    .line 402
    invoke-virtual {v0, v13}, LJ5/y;->t(I)V

    .line 403
    .line 404
    .line 405
    :cond_1a
    const/4 v1, 0x0

    .line 406
    invoke-static {v0, v1, v8, v11}, LR1/n;->e(LJ5/y;ZILR1/g;)LR1/g;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    const/16 v7, 0x10

    .line 415
    .line 416
    new-array v10, v7, [Z

    .line 417
    .line 418
    move/from16 v20, v1

    .line 419
    .line 420
    const/4 v1, 0x0

    .line 421
    const/4 v13, 0x0

    .line 422
    :goto_f
    if-ge v13, v7, :cond_1c

    .line 423
    .line 424
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 425
    .line 426
    .line 427
    move-result v21

    .line 428
    aput-boolean v21, v10, v13

    .line 429
    .line 430
    if-eqz v21, :cond_1b

    .line 431
    .line 432
    add-int/lit8 v1, v1, 0x1

    .line 433
    .line 434
    :cond_1b
    add-int/lit8 v13, v13, 0x1

    .line 435
    .line 436
    goto :goto_f

    .line 437
    :cond_1c
    if-eqz v1, :cond_1d

    .line 438
    .line 439
    aget-boolean v13, v10, p2

    .line 440
    .line 441
    if-nez v13, :cond_1e

    .line 442
    .line 443
    :cond_1d
    const/4 v1, 0x0

    .line 444
    goto/16 :goto_5e

    .line 445
    .line 446
    :cond_1e
    new-array v13, v1, [I

    .line 447
    .line 448
    move-object/from16 v22, v9

    .line 449
    .line 450
    const/4 v7, 0x0

    .line 451
    :goto_10
    sub-int v9, v1, v20

    .line 452
    .line 453
    if-ge v7, v9, :cond_1f

    .line 454
    .line 455
    const/4 v9, 0x3

    .line 456
    invoke-virtual {v0, v9}, LJ5/y;->i(I)I

    .line 457
    .line 458
    .line 459
    move-result v24

    .line 460
    aput v24, v13, v7

    .line 461
    .line 462
    add-int/lit8 v7, v7, 0x1

    .line 463
    .line 464
    goto :goto_10

    .line 465
    :cond_1f
    add-int/lit8 v7, v1, 0x1

    .line 466
    .line 467
    new-array v7, v7, [I

    .line 468
    .line 469
    if-eqz v20, :cond_22

    .line 470
    .line 471
    move/from16 v9, p2

    .line 472
    .line 473
    :goto_11
    if-ge v9, v1, :cond_21

    .line 474
    .line 475
    move-object/from16 v24, v7

    .line 476
    .line 477
    const/4 v7, 0x0

    .line 478
    :goto_12
    if-ge v7, v9, :cond_20

    .line 479
    .line 480
    aget v27, v24, v9

    .line 481
    .line 482
    aget v28, v13, v7

    .line 483
    .line 484
    add-int/lit8 v28, v28, 0x1

    .line 485
    .line 486
    add-int v28, v28, v27

    .line 487
    .line 488
    aput v28, v24, v9

    .line 489
    .line 490
    add-int/lit8 v7, v7, 0x1

    .line 491
    .line 492
    goto :goto_12

    .line 493
    :cond_20
    add-int/lit8 v9, v9, 0x1

    .line 494
    .line 495
    move-object/from16 v7, v24

    .line 496
    .line 497
    goto :goto_11

    .line 498
    :cond_21
    move-object/from16 v24, v7

    .line 499
    .line 500
    aput p0, v24, v1

    .line 501
    .line 502
    :goto_13
    const/4 v7, 0x2

    .line 503
    goto :goto_14

    .line 504
    :cond_22
    move-object/from16 v24, v7

    .line 505
    .line 506
    goto :goto_13

    .line 507
    :goto_14
    new-array v9, v7, [I

    .line 508
    .line 509
    aput v1, v9, p2

    .line 510
    .line 511
    const/16 v17, 0x0

    .line 512
    .line 513
    aput v6, v9, v17

    .line 514
    .line 515
    invoke-static {v15, v9}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v7

    .line 519
    check-cast v7, [[I

    .line 520
    .line 521
    new-array v9, v6, [I

    .line 522
    .line 523
    aput v17, v9, v17

    .line 524
    .line 525
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 526
    .line 527
    .line 528
    move-result v15

    .line 529
    move-object/from16 v27, v7

    .line 530
    .line 531
    move/from16 v7, p2

    .line 532
    .line 533
    :goto_15
    if-ge v7, v6, :cond_26

    .line 534
    .line 535
    if-eqz v15, :cond_23

    .line 536
    .line 537
    move/from16 v28, v7

    .line 538
    .line 539
    move/from16 v7, p0

    .line 540
    .line 541
    invoke-virtual {v0, v7}, LJ5/y;->i(I)I

    .line 542
    .line 543
    .line 544
    move-result v29

    .line 545
    aput v29, v9, v28

    .line 546
    .line 547
    goto :goto_16

    .line 548
    :cond_23
    move/from16 v28, v7

    .line 549
    .line 550
    move/from16 v7, p0

    .line 551
    .line 552
    aput v28, v9, v28

    .line 553
    .line 554
    :goto_16
    if-nez v20, :cond_24

    .line 555
    .line 556
    const/4 v7, 0x0

    .line 557
    :goto_17
    if-ge v7, v1, :cond_25

    .line 558
    .line 559
    aget-object v29, v27, v28

    .line 560
    .line 561
    aget v30, v13, v7

    .line 562
    .line 563
    move/from16 v31, v7

    .line 564
    .line 565
    add-int/lit8 v7, v30, 0x1

    .line 566
    .line 567
    invoke-virtual {v0, v7}, LJ5/y;->i(I)I

    .line 568
    .line 569
    .line 570
    move-result v7

    .line 571
    aput v7, v29, v31

    .line 572
    .line 573
    add-int/lit8 v7, v31, 0x1

    .line 574
    .line 575
    goto :goto_17

    .line 576
    :cond_24
    const/4 v7, 0x0

    .line 577
    :goto_18
    if-ge v7, v1, :cond_25

    .line 578
    .line 579
    aget-object v29, v27, v28

    .line 580
    .line 581
    aget v30, v9, v28

    .line 582
    .line 583
    add-int/lit8 v31, v7, 0x1

    .line 584
    .line 585
    aget v32, v24, v31

    .line 586
    .line 587
    shl-int v32, p2, v32

    .line 588
    .line 589
    add-int/lit8 v32, v32, -0x1

    .line 590
    .line 591
    and-int v30, v30, v32

    .line 592
    .line 593
    aget v32, v24, v7

    .line 594
    .line 595
    shr-int v30, v30, v32

    .line 596
    .line 597
    aput v30, v29, v7

    .line 598
    .line 599
    move/from16 v7, v31

    .line 600
    .line 601
    goto :goto_18

    .line 602
    :cond_25
    add-int/lit8 v7, v28, 0x1

    .line 603
    .line 604
    const/16 p0, 0x6

    .line 605
    .line 606
    goto :goto_15

    .line 607
    :cond_26
    new-array v1, v3, [I

    .line 608
    .line 609
    move/from16 v7, p2

    .line 610
    .line 611
    const/4 v13, 0x0

    .line 612
    :goto_19
    const/4 v15, -0x1

    .line 613
    if-ge v13, v6, :cond_2d

    .line 614
    .line 615
    aget v20, v9, v13

    .line 616
    .line 617
    aput v15, v1, v20

    .line 618
    .line 619
    move-object/from16 v24, v1

    .line 620
    .line 621
    const/4 v15, 0x0

    .line 622
    const/16 v20, 0x0

    .line 623
    .line 624
    :goto_1a
    const/16 v1, 0x10

    .line 625
    .line 626
    if-ge v15, v1, :cond_29

    .line 627
    .line 628
    aget-boolean v1, v10, v15

    .line 629
    .line 630
    if-eqz v1, :cond_28

    .line 631
    .line 632
    move/from16 v1, p2

    .line 633
    .line 634
    if-ne v15, v1, :cond_27

    .line 635
    .line 636
    aget v1, v9, v13

    .line 637
    .line 638
    aget-object v28, v27, v13

    .line 639
    .line 640
    aget v28, v28, v20

    .line 641
    .line 642
    aput v28, v24, v1

    .line 643
    .line 644
    :cond_27
    add-int/lit8 v20, v20, 0x1

    .line 645
    .line 646
    :cond_28
    add-int/lit8 v15, v15, 0x1

    .line 647
    .line 648
    const/16 p2, 0x1

    .line 649
    .line 650
    goto :goto_1a

    .line 651
    :cond_29
    if-lez v13, :cond_2c

    .line 652
    .line 653
    const/4 v1, 0x0

    .line 654
    :goto_1b
    if-ge v1, v13, :cond_2b

    .line 655
    .line 656
    aget v15, v9, v13

    .line 657
    .line 658
    aget v15, v24, v15

    .line 659
    .line 660
    aget v20, v9, v1

    .line 661
    .line 662
    move/from16 v28, v1

    .line 663
    .line 664
    aget v1, v24, v20

    .line 665
    .line 666
    if-ne v15, v1, :cond_2a

    .line 667
    .line 668
    const/4 v1, 0x0

    .line 669
    goto :goto_1c

    .line 670
    :cond_2a
    add-int/lit8 v1, v28, 0x1

    .line 671
    .line 672
    goto :goto_1b

    .line 673
    :cond_2b
    const/4 v1, 0x1

    .line 674
    :goto_1c
    if-eqz v1, :cond_2c

    .line 675
    .line 676
    add-int/lit8 v7, v7, 0x1

    .line 677
    .line 678
    :cond_2c
    add-int/lit8 v13, v13, 0x1

    .line 679
    .line 680
    move-object/from16 v1, v24

    .line 681
    .line 682
    const/16 p2, 0x1

    .line 683
    .line 684
    goto :goto_19

    .line 685
    :cond_2d
    move-object/from16 v24, v1

    .line 686
    .line 687
    const/4 v13, 0x4

    .line 688
    invoke-virtual {v0, v13}, LJ5/y;->i(I)I

    .line 689
    .line 690
    .line 691
    move-result v1

    .line 692
    const/4 v10, 0x2

    .line 693
    if-lt v7, v10, :cond_89

    .line 694
    .line 695
    if-nez v1, :cond_2e

    .line 696
    .line 697
    goto/16 :goto_5d

    .line 698
    .line 699
    :cond_2e
    new-array v10, v7, [I

    .line 700
    .line 701
    const/4 v13, 0x0

    .line 702
    :goto_1d
    if-ge v13, v7, :cond_2f

    .line 703
    .line 704
    invoke-virtual {v0, v1}, LJ5/y;->i(I)I

    .line 705
    .line 706
    .line 707
    move-result v20

    .line 708
    aput v20, v10, v13

    .line 709
    .line 710
    add-int/lit8 v13, v13, 0x1

    .line 711
    .line 712
    goto :goto_1d

    .line 713
    :cond_2f
    new-array v1, v3, [I

    .line 714
    .line 715
    const/4 v13, 0x0

    .line 716
    :goto_1e
    if-ge v13, v6, :cond_30

    .line 717
    .line 718
    aget v15, v9, v13

    .line 719
    .line 720
    invoke-static {v15, v12}, Ljava/lang/Math;->min(II)I

    .line 721
    .line 722
    .line 723
    move-result v15

    .line 724
    aput v13, v1, v15

    .line 725
    .line 726
    add-int/lit8 v13, v13, 0x1

    .line 727
    .line 728
    const/4 v15, -0x1

    .line 729
    goto :goto_1e

    .line 730
    :cond_30
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 731
    .line 732
    .line 733
    move-result-object v13

    .line 734
    const/4 v15, 0x0

    .line 735
    :goto_1f
    if-gt v15, v12, :cond_32

    .line 736
    .line 737
    move-object/from16 v20, v1

    .line 738
    .line 739
    aget v1, v24, v15

    .line 740
    .line 741
    move/from16 v28, v7

    .line 742
    .line 743
    const/16 v27, 0x1

    .line 744
    .line 745
    add-int/lit8 v7, v28, -0x1

    .line 746
    .line 747
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 748
    .line 749
    .line 750
    move-result v1

    .line 751
    if-ltz v1, :cond_31

    .line 752
    .line 753
    aget v1, v10, v1

    .line 754
    .line 755
    goto :goto_20

    .line 756
    :cond_31
    const/4 v1, -0x1

    .line 757
    :goto_20
    new-instance v7, LR1/f;

    .line 758
    .line 759
    move-object/from16 v27, v9

    .line 760
    .line 761
    aget v9, v20, v15

    .line 762
    .line 763
    invoke-direct {v7, v9, v1}, LR1/f;-><init>(II)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v13, v7}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 767
    .line 768
    .line 769
    add-int/lit8 v15, v15, 0x1

    .line 770
    .line 771
    move-object/from16 v1, v20

    .line 772
    .line 773
    move-object/from16 v9, v27

    .line 774
    .line 775
    move/from16 v7, v28

    .line 776
    .line 777
    goto :goto_1f

    .line 778
    :cond_32
    move-object/from16 v27, v9

    .line 779
    .line 780
    invoke-virtual {v13}, Ll8/H;->g()Ll8/e0;

    .line 781
    .line 782
    .line 783
    move-result-object v1

    .line 784
    const/4 v7, 0x0

    .line 785
    invoke-virtual {v1, v7}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v9

    .line 789
    check-cast v9, LR1/f;

    .line 790
    .line 791
    iget v7, v9, LR1/f;->b:I

    .line 792
    .line 793
    const/4 v9, -0x1

    .line 794
    if-ne v7, v9, :cond_33

    .line 795
    .line 796
    new-instance v0, LVa/X7;

    .line 797
    .line 798
    const/4 v1, 0x0

    .line 799
    invoke-direct {v0, v1, v4, v1, v1}, LVa/X7;-><init>(Ll8/e0;LS3/e;LS3/s;LS3/c;)V

    .line 800
    .line 801
    .line 802
    return-object v0

    .line 803
    :cond_33
    const/4 v7, 0x1

    .line 804
    :goto_21
    if-gt v7, v12, :cond_35

    .line 805
    .line 806
    invoke-virtual {v1, v7}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v10

    .line 810
    check-cast v10, LR1/f;

    .line 811
    .line 812
    iget v10, v10, LR1/f;->b:I

    .line 813
    .line 814
    if-eq v10, v9, :cond_34

    .line 815
    .line 816
    goto :goto_22

    .line 817
    :cond_34
    add-int/lit8 v7, v7, 0x1

    .line 818
    .line 819
    goto :goto_21

    .line 820
    :cond_35
    move v7, v9

    .line 821
    :goto_22
    if-ne v7, v9, :cond_36

    .line 822
    .line 823
    new-instance v0, LVa/X7;

    .line 824
    .line 825
    const/4 v1, 0x0

    .line 826
    invoke-direct {v0, v1, v4, v1, v1}, LVa/X7;-><init>(Ll8/e0;LS3/e;LS3/s;LS3/c;)V

    .line 827
    .line 828
    .line 829
    return-object v0

    .line 830
    :cond_36
    const/4 v10, 0x2

    .line 831
    new-array v9, v10, [I

    .line 832
    .line 833
    const/4 v12, 0x1

    .line 834
    aput v6, v9, v12

    .line 835
    .line 836
    const/16 v17, 0x0

    .line 837
    .line 838
    aput v6, v9, v17

    .line 839
    .line 840
    sget-object v13, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 841
    .line 842
    invoke-static {v13, v9}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v9

    .line 846
    check-cast v9, [[Z

    .line 847
    .line 848
    new-array v15, v10, [I

    .line 849
    .line 850
    aput v6, v15, v12

    .line 851
    .line 852
    aput v6, v15, v17

    .line 853
    .line 854
    invoke-static {v13, v15}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 855
    .line 856
    .line 857
    move-result-object v10

    .line 858
    check-cast v10, [[Z

    .line 859
    .line 860
    const/4 v12, 0x1

    .line 861
    :goto_23
    if-ge v12, v6, :cond_38

    .line 862
    .line 863
    const/4 v15, 0x0

    .line 864
    :goto_24
    if-ge v15, v12, :cond_37

    .line 865
    .line 866
    aget-object v20, v9, v12

    .line 867
    .line 868
    aget-object v24, v10, v12

    .line 869
    .line 870
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 871
    .line 872
    .line 873
    move-result v28

    .line 874
    aput-boolean v28, v24, v15

    .line 875
    .line 876
    aput-boolean v28, v20, v15

    .line 877
    .line 878
    add-int/lit8 v15, v15, 0x1

    .line 879
    .line 880
    goto :goto_24

    .line 881
    :cond_37
    add-int/lit8 v12, v12, 0x1

    .line 882
    .line 883
    goto :goto_23

    .line 884
    :cond_38
    const/4 v12, 0x1

    .line 885
    :goto_25
    if-ge v12, v6, :cond_3c

    .line 886
    .line 887
    const/4 v15, 0x0

    .line 888
    :goto_26
    if-ge v15, v5, :cond_3b

    .line 889
    .line 890
    move-object/from16 p0, v9

    .line 891
    .line 892
    const/4 v9, 0x0

    .line 893
    :goto_27
    if-ge v9, v12, :cond_3a

    .line 894
    .line 895
    aget-object v20, v10, v12

    .line 896
    .line 897
    aget-boolean v24, v20, v9

    .line 898
    .line 899
    if-eqz v24, :cond_39

    .line 900
    .line 901
    aget-object v24, v10, v9

    .line 902
    .line 903
    aget-boolean v24, v24, v15

    .line 904
    .line 905
    if-eqz v24, :cond_39

    .line 906
    .line 907
    const/16 v24, 0x1

    .line 908
    .line 909
    aput-boolean v24, v20, v15

    .line 910
    .line 911
    goto :goto_28

    .line 912
    :cond_39
    add-int/lit8 v9, v9, 0x1

    .line 913
    .line 914
    goto :goto_27

    .line 915
    :cond_3a
    :goto_28
    add-int/lit8 v15, v15, 0x1

    .line 916
    .line 917
    move-object/from16 v9, p0

    .line 918
    .line 919
    goto :goto_26

    .line 920
    :cond_3b
    move-object/from16 p0, v9

    .line 921
    .line 922
    add-int/lit8 v12, v12, 0x1

    .line 923
    .line 924
    goto :goto_25

    .line 925
    :cond_3c
    move-object/from16 p0, v9

    .line 926
    .line 927
    new-array v9, v3, [I

    .line 928
    .line 929
    const/4 v12, 0x0

    .line 930
    :goto_29
    if-ge v12, v6, :cond_3e

    .line 931
    .line 932
    const/4 v15, 0x0

    .line 933
    const/16 v20, 0x0

    .line 934
    .line 935
    :goto_2a
    if-ge v15, v12, :cond_3d

    .line 936
    .line 937
    aget-object v24, p0, v12

    .line 938
    .line 939
    aget-boolean v24, v24, v15

    .line 940
    .line 941
    add-int v20, v20, v24

    .line 942
    .line 943
    add-int/lit8 v15, v15, 0x1

    .line 944
    .line 945
    goto :goto_2a

    .line 946
    :cond_3d
    aget v15, v27, v12

    .line 947
    .line 948
    aput v20, v9, v15

    .line 949
    .line 950
    add-int/lit8 v12, v12, 0x1

    .line 951
    .line 952
    goto :goto_29

    .line 953
    :cond_3e
    const/4 v12, 0x0

    .line 954
    const/4 v15, 0x0

    .line 955
    :goto_2b
    if-ge v12, v6, :cond_40

    .line 956
    .line 957
    aget v20, v27, v12

    .line 958
    .line 959
    aget v20, v9, v20

    .line 960
    .line 961
    if-nez v20, :cond_3f

    .line 962
    .line 963
    add-int/lit8 v15, v15, 0x1

    .line 964
    .line 965
    :cond_3f
    add-int/lit8 v12, v12, 0x1

    .line 966
    .line 967
    goto :goto_2b

    .line 968
    :cond_40
    const/4 v12, 0x1

    .line 969
    if-le v15, v12, :cond_41

    .line 970
    .line 971
    new-instance v0, LVa/X7;

    .line 972
    .line 973
    const/4 v1, 0x0

    .line 974
    invoke-direct {v0, v1, v4, v1, v1}, LVa/X7;-><init>(Ll8/e0;LS3/e;LS3/s;LS3/c;)V

    .line 975
    .line 976
    .line 977
    return-object v0

    .line 978
    :cond_41
    new-array v12, v6, [I

    .line 979
    .line 980
    new-array v15, v14, [I

    .line 981
    .line 982
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 983
    .line 984
    .line 985
    move-result v20

    .line 986
    if-eqz v20, :cond_42

    .line 987
    .line 988
    move-object/from16 v20, v9

    .line 989
    .line 990
    const/4 v9, 0x0

    .line 991
    :goto_2c
    if-ge v9, v6, :cond_43

    .line 992
    .line 993
    move/from16 v24, v9

    .line 994
    .line 995
    const/4 v9, 0x3

    .line 996
    invoke-virtual {v0, v9}, LJ5/y;->i(I)I

    .line 997
    .line 998
    .line 999
    move-result v28

    .line 1000
    aput v28, v12, v24

    .line 1001
    .line 1002
    add-int/lit8 v9, v24, 0x1

    .line 1003
    .line 1004
    goto :goto_2c

    .line 1005
    :cond_42
    move-object/from16 v20, v9

    .line 1006
    .line 1007
    const/4 v9, 0x0

    .line 1008
    invoke-static {v12, v9, v6, v8}, Ljava/util/Arrays;->fill([IIII)V

    .line 1009
    .line 1010
    .line 1011
    :cond_43
    const/4 v9, 0x0

    .line 1012
    :goto_2d
    if-ge v9, v14, :cond_45

    .line 1013
    .line 1014
    move/from16 v24, v9

    .line 1015
    .line 1016
    move-object/from16 v28, v10

    .line 1017
    .line 1018
    move-object/from16 v29, v12

    .line 1019
    .line 1020
    const/4 v9, 0x0

    .line 1021
    const/4 v10, 0x0

    .line 1022
    :goto_2e
    aget v12, v22, v24

    .line 1023
    .line 1024
    if-ge v9, v12, :cond_44

    .line 1025
    .line 1026
    aget-object v12, v25, v24

    .line 1027
    .line 1028
    aget v12, v12, v9

    .line 1029
    .line 1030
    invoke-virtual {v1, v12}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v12

    .line 1034
    check-cast v12, LR1/f;

    .line 1035
    .line 1036
    iget v12, v12, LR1/f;->a:I

    .line 1037
    .line 1038
    aget v12, v29, v12

    .line 1039
    .line 1040
    invoke-static {v10, v12}, Ljava/lang/Math;->max(II)I

    .line 1041
    .line 1042
    .line 1043
    move-result v10

    .line 1044
    add-int/lit8 v9, v9, 0x1

    .line 1045
    .line 1046
    goto :goto_2e

    .line 1047
    :cond_44
    add-int/lit8 v10, v10, 0x1

    .line 1048
    .line 1049
    aput v10, v15, v24

    .line 1050
    .line 1051
    add-int/lit8 v9, v24, 0x1

    .line 1052
    .line 1053
    move-object/from16 v10, v28

    .line 1054
    .line 1055
    move-object/from16 v12, v29

    .line 1056
    .line 1057
    goto :goto_2d

    .line 1058
    :cond_45
    move-object/from16 v28, v10

    .line 1059
    .line 1060
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 1061
    .line 1062
    .line 1063
    move-result v9

    .line 1064
    if-eqz v9, :cond_48

    .line 1065
    .line 1066
    const/4 v9, 0x0

    .line 1067
    :goto_2f
    if-ge v9, v5, :cond_48

    .line 1068
    .line 1069
    add-int/lit8 v10, v9, 0x1

    .line 1070
    .line 1071
    move v12, v10

    .line 1072
    :goto_30
    if-ge v12, v6, :cond_47

    .line 1073
    .line 1074
    aget-object v24, p0, v12

    .line 1075
    .line 1076
    aget-boolean v24, v24, v9

    .line 1077
    .line 1078
    if-eqz v24, :cond_46

    .line 1079
    .line 1080
    move/from16 v24, v5

    .line 1081
    .line 1082
    const/4 v5, 0x3

    .line 1083
    invoke-virtual {v0, v5}, LJ5/y;->t(I)V

    .line 1084
    .line 1085
    .line 1086
    goto :goto_31

    .line 1087
    :cond_46
    move/from16 v24, v5

    .line 1088
    .line 1089
    :goto_31
    add-int/lit8 v12, v12, 0x1

    .line 1090
    .line 1091
    move/from16 v5, v24

    .line 1092
    .line 1093
    goto :goto_30

    .line 1094
    :cond_47
    move v9, v10

    .line 1095
    goto :goto_2f

    .line 1096
    :cond_48
    invoke-virtual {v0}, LJ5/y;->s()V

    .line 1097
    .line 1098
    .line 1099
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 1100
    .line 1101
    .line 1102
    move-result v5

    .line 1103
    const/4 v12, 0x1

    .line 1104
    add-int/2addr v5, v12

    .line 1105
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v9

    .line 1109
    invoke-virtual {v9, v11}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 1110
    .line 1111
    .line 1112
    if-le v5, v12, :cond_49

    .line 1113
    .line 1114
    invoke-virtual {v9, v2}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 1115
    .line 1116
    .line 1117
    const/4 v10, 0x2

    .line 1118
    :goto_32
    if-ge v10, v5, :cond_49

    .line 1119
    .line 1120
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 1121
    .line 1122
    .line 1123
    move-result v11

    .line 1124
    invoke-static {v0, v11, v8, v2}, LR1/n;->e(LJ5/y;ZILR1/g;)LR1/g;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v2

    .line 1128
    invoke-virtual {v9, v2}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 1129
    .line 1130
    .line 1131
    add-int/lit8 v10, v10, 0x1

    .line 1132
    .line 1133
    goto :goto_32

    .line 1134
    :cond_49
    invoke-virtual {v9}, Ll8/H;->g()Ll8/e0;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v2

    .line 1138
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 1139
    .line 1140
    .line 1141
    move-result v8

    .line 1142
    add-int/2addr v8, v14

    .line 1143
    if-le v8, v14, :cond_4a

    .line 1144
    .line 1145
    new-instance v0, LVa/X7;

    .line 1146
    .line 1147
    const/4 v1, 0x0

    .line 1148
    invoke-direct {v0, v1, v4, v1, v1}, LVa/X7;-><init>(Ll8/e0;LS3/e;LS3/s;LS3/c;)V

    .line 1149
    .line 1150
    .line 1151
    return-object v0

    .line 1152
    :cond_4a
    const/4 v10, 0x2

    .line 1153
    invoke-virtual {v0, v10}, LJ5/y;->i(I)I

    .line 1154
    .line 1155
    .line 1156
    move-result v9

    .line 1157
    new-array v11, v10, [I

    .line 1158
    .line 1159
    const/4 v12, 0x1

    .line 1160
    aput v3, v11, v12

    .line 1161
    .line 1162
    const/4 v10, 0x0

    .line 1163
    aput v8, v11, v10

    .line 1164
    .line 1165
    invoke-static {v13, v11}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v11

    .line 1169
    check-cast v11, [[Z

    .line 1170
    .line 1171
    new-array v12, v8, [I

    .line 1172
    .line 1173
    move/from16 v17, v10

    .line 1174
    .line 1175
    new-array v10, v8, [I

    .line 1176
    .line 1177
    move-object/from16 v24, v10

    .line 1178
    .line 1179
    move/from16 v10, v17

    .line 1180
    .line 1181
    :goto_33
    if-ge v10, v14, :cond_4f

    .line 1182
    .line 1183
    aput v17, v12, v10

    .line 1184
    .line 1185
    aget v29, v26, v10

    .line 1186
    .line 1187
    aput v29, v24, v10

    .line 1188
    .line 1189
    if-nez v9, :cond_4b

    .line 1190
    .line 1191
    move/from16 v29, v10

    .line 1192
    .line 1193
    aget-object v10, v11, v29

    .line 1194
    .line 1195
    move-object/from16 v30, v11

    .line 1196
    .line 1197
    aget v11, v22, v29

    .line 1198
    .line 1199
    move-object/from16 v31, v12

    .line 1200
    .line 1201
    move-object/from16 v32, v15

    .line 1202
    .line 1203
    move/from16 v15, v17

    .line 1204
    .line 1205
    const/4 v12, 0x1

    .line 1206
    invoke-static {v10, v15, v11, v12}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1207
    .line 1208
    .line 1209
    aget v10, v22, v29

    .line 1210
    .line 1211
    aput v10, v31, v29

    .line 1212
    .line 1213
    :goto_34
    const/16 v17, 0x0

    .line 1214
    .line 1215
    goto :goto_37

    .line 1216
    :cond_4b
    move/from16 v29, v10

    .line 1217
    .line 1218
    move-object/from16 v30, v11

    .line 1219
    .line 1220
    move-object/from16 v31, v12

    .line 1221
    .line 1222
    move-object/from16 v32, v15

    .line 1223
    .line 1224
    const/4 v12, 0x1

    .line 1225
    if-ne v9, v12, :cond_4e

    .line 1226
    .line 1227
    aget v10, v26, v29

    .line 1228
    .line 1229
    const/4 v11, 0x0

    .line 1230
    :goto_35
    aget v12, v22, v29

    .line 1231
    .line 1232
    if-ge v11, v12, :cond_4d

    .line 1233
    .line 1234
    aget-object v12, v30, v29

    .line 1235
    .line 1236
    aget-object v15, v25, v29

    .line 1237
    .line 1238
    aget v15, v15, v11

    .line 1239
    .line 1240
    if-ne v15, v10, :cond_4c

    .line 1241
    .line 1242
    const/4 v15, 0x1

    .line 1243
    goto :goto_36

    .line 1244
    :cond_4c
    const/4 v15, 0x0

    .line 1245
    :goto_36
    aput-boolean v15, v12, v11

    .line 1246
    .line 1247
    add-int/lit8 v11, v11, 0x1

    .line 1248
    .line 1249
    goto :goto_35

    .line 1250
    :cond_4d
    const/4 v12, 0x1

    .line 1251
    aput v12, v31, v29

    .line 1252
    .line 1253
    goto :goto_34

    .line 1254
    :cond_4e
    const/16 v17, 0x0

    .line 1255
    .line 1256
    aget-object v10, v30, v17

    .line 1257
    .line 1258
    aput-boolean v12, v10, v17

    .line 1259
    .line 1260
    aput v12, v31, v17

    .line 1261
    .line 1262
    :goto_37
    add-int/lit8 v10, v29, 0x1

    .line 1263
    .line 1264
    move-object/from16 v11, v30

    .line 1265
    .line 1266
    move-object/from16 v12, v31

    .line 1267
    .line 1268
    move-object/from16 v15, v32

    .line 1269
    .line 1270
    goto :goto_33

    .line 1271
    :cond_4f
    move-object/from16 v30, v11

    .line 1272
    .line 1273
    move-object/from16 v31, v12

    .line 1274
    .line 1275
    move-object/from16 v32, v15

    .line 1276
    .line 1277
    const/4 v12, 0x1

    .line 1278
    new-array v10, v3, [I

    .line 1279
    .line 1280
    const/4 v11, 0x2

    .line 1281
    new-array v15, v11, [I

    .line 1282
    .line 1283
    aput v3, v15, v12

    .line 1284
    .line 1285
    aput v8, v15, v17

    .line 1286
    .line 1287
    invoke-static {v13, v15}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v3

    .line 1291
    check-cast v3, [[Z

    .line 1292
    .line 1293
    const/4 v12, 0x1

    .line 1294
    const/4 v13, 0x0

    .line 1295
    :goto_38
    if-ge v12, v8, :cond_5d

    .line 1296
    .line 1297
    if-ne v9, v11, :cond_51

    .line 1298
    .line 1299
    const/4 v11, 0x0

    .line 1300
    :goto_39
    aget v15, v22, v12

    .line 1301
    .line 1302
    if-ge v11, v15, :cond_51

    .line 1303
    .line 1304
    aget-object v15, v30, v12

    .line 1305
    .line 1306
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 1307
    .line 1308
    .line 1309
    move-result v26

    .line 1310
    aput-boolean v26, v15, v11

    .line 1311
    .line 1312
    aget v15, v31, v12

    .line 1313
    .line 1314
    aget-object v26, v30, v12

    .line 1315
    .line 1316
    aget-boolean v26, v26, v11

    .line 1317
    .line 1318
    add-int v15, v15, v26

    .line 1319
    .line 1320
    aput v15, v31, v12

    .line 1321
    .line 1322
    if-eqz v26, :cond_50

    .line 1323
    .line 1324
    aget-object v15, v25, v12

    .line 1325
    .line 1326
    aget v15, v15, v11

    .line 1327
    .line 1328
    aput v15, v24, v12

    .line 1329
    .line 1330
    :cond_50
    add-int/lit8 v11, v11, 0x1

    .line 1331
    .line 1332
    goto :goto_39

    .line 1333
    :cond_51
    if-nez v13, :cond_53

    .line 1334
    .line 1335
    aget-object v11, v25, v12

    .line 1336
    .line 1337
    const/16 v17, 0x0

    .line 1338
    .line 1339
    aget v11, v11, v17

    .line 1340
    .line 1341
    if-nez v11, :cond_54

    .line 1342
    .line 1343
    aget-object v11, v30, v12

    .line 1344
    .line 1345
    aget-boolean v11, v11, v17

    .line 1346
    .line 1347
    if-eqz v11, :cond_54

    .line 1348
    .line 1349
    const/4 v11, 0x1

    .line 1350
    :goto_3a
    aget v15, v22, v12

    .line 1351
    .line 1352
    if-ge v11, v15, :cond_54

    .line 1353
    .line 1354
    aget-object v15, v25, v12

    .line 1355
    .line 1356
    aget v15, v15, v11

    .line 1357
    .line 1358
    if-ne v15, v7, :cond_52

    .line 1359
    .line 1360
    aget-object v15, v30, v12

    .line 1361
    .line 1362
    aget-boolean v15, v15, v7

    .line 1363
    .line 1364
    if-eqz v15, :cond_52

    .line 1365
    .line 1366
    move v13, v12

    .line 1367
    :cond_52
    add-int/lit8 v11, v11, 0x1

    .line 1368
    .line 1369
    goto :goto_3a

    .line 1370
    :cond_53
    const/16 v17, 0x0

    .line 1371
    .line 1372
    :cond_54
    move/from16 v11, v17

    .line 1373
    .line 1374
    :goto_3b
    aget v15, v22, v12

    .line 1375
    .line 1376
    if-ge v11, v15, :cond_5b

    .line 1377
    .line 1378
    const/4 v15, 0x1

    .line 1379
    if-le v5, v15, :cond_59

    .line 1380
    .line 1381
    aget-object v15, v3, v12

    .line 1382
    .line 1383
    aget-object v26, v30, v12

    .line 1384
    .line 1385
    aget-boolean v26, v26, v11

    .line 1386
    .line 1387
    aput-boolean v26, v15, v11

    .line 1388
    .line 1389
    move-object v15, v2

    .line 1390
    move-object/from16 v26, v3

    .line 1391
    .line 1392
    int-to-double v2, v5

    .line 1393
    sget-object v29, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 1394
    .line 1395
    invoke-static {v2, v3}, Ln8/c;->c(D)I

    .line 1396
    .line 1397
    .line 1398
    move-result v2

    .line 1399
    aget-object v3, v26, v12

    .line 1400
    .line 1401
    aget-boolean v3, v3, v11

    .line 1402
    .line 1403
    if-nez v3, :cond_57

    .line 1404
    .line 1405
    aget-object v3, v25, v12

    .line 1406
    .line 1407
    aget v3, v3, v11

    .line 1408
    .line 1409
    invoke-virtual {v1, v3}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v3

    .line 1413
    check-cast v3, LR1/f;

    .line 1414
    .line 1415
    move/from16 v29, v5

    .line 1416
    .line 1417
    move/from16 v5, v17

    .line 1418
    .line 1419
    :goto_3c
    if-ge v5, v11, :cond_56

    .line 1420
    .line 1421
    aget-object v33, v25, v12

    .line 1422
    .line 1423
    move/from16 v34, v5

    .line 1424
    .line 1425
    aget v5, v33, v34

    .line 1426
    .line 1427
    invoke-virtual {v1, v5}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v5

    .line 1431
    check-cast v5, LR1/f;

    .line 1432
    .line 1433
    move/from16 v33, v7

    .line 1434
    .line 1435
    iget v7, v3, LR1/f;->a:I

    .line 1436
    .line 1437
    aget-object v7, v28, v7

    .line 1438
    .line 1439
    iget v5, v5, LR1/f;->a:I

    .line 1440
    .line 1441
    aget-boolean v5, v7, v5

    .line 1442
    .line 1443
    if-eqz v5, :cond_55

    .line 1444
    .line 1445
    aget-object v3, v26, v12

    .line 1446
    .line 1447
    const/4 v5, 0x1

    .line 1448
    aput-boolean v5, v3, v11

    .line 1449
    .line 1450
    goto :goto_3e

    .line 1451
    :cond_55
    add-int/lit8 v5, v34, 0x1

    .line 1452
    .line 1453
    move/from16 v7, v33

    .line 1454
    .line 1455
    goto :goto_3c

    .line 1456
    :cond_56
    :goto_3d
    move/from16 v33, v7

    .line 1457
    .line 1458
    goto :goto_3e

    .line 1459
    :cond_57
    move/from16 v29, v5

    .line 1460
    .line 1461
    goto :goto_3d

    .line 1462
    :goto_3e
    aget-object v3, v26, v12

    .line 1463
    .line 1464
    aget-boolean v3, v3, v11

    .line 1465
    .line 1466
    if-eqz v3, :cond_5a

    .line 1467
    .line 1468
    if-lez v13, :cond_58

    .line 1469
    .line 1470
    if-ne v12, v13, :cond_58

    .line 1471
    .line 1472
    invoke-virtual {v0, v2}, LJ5/y;->i(I)I

    .line 1473
    .line 1474
    .line 1475
    move-result v2

    .line 1476
    aput v2, v10, v11

    .line 1477
    .line 1478
    goto :goto_3f

    .line 1479
    :cond_58
    invoke-virtual {v0, v2}, LJ5/y;->t(I)V

    .line 1480
    .line 1481
    .line 1482
    goto :goto_3f

    .line 1483
    :cond_59
    move-object v15, v2

    .line 1484
    move-object/from16 v26, v3

    .line 1485
    .line 1486
    move/from16 v29, v5

    .line 1487
    .line 1488
    move/from16 v33, v7

    .line 1489
    .line 1490
    :cond_5a
    :goto_3f
    add-int/lit8 v11, v11, 0x1

    .line 1491
    .line 1492
    move-object v2, v15

    .line 1493
    move-object/from16 v3, v26

    .line 1494
    .line 1495
    move/from16 v5, v29

    .line 1496
    .line 1497
    move/from16 v7, v33

    .line 1498
    .line 1499
    goto :goto_3b

    .line 1500
    :cond_5b
    move-object v15, v2

    .line 1501
    move-object/from16 v26, v3

    .line 1502
    .line 1503
    move/from16 v29, v5

    .line 1504
    .line 1505
    move/from16 v33, v7

    .line 1506
    .line 1507
    aget v2, v31, v12

    .line 1508
    .line 1509
    const/4 v5, 0x1

    .line 1510
    if-ne v2, v5, :cond_5c

    .line 1511
    .line 1512
    aget v2, v24, v12

    .line 1513
    .line 1514
    aget v2, v20, v2

    .line 1515
    .line 1516
    if-lez v2, :cond_5c

    .line 1517
    .line 1518
    invoke-virtual {v0}, LJ5/y;->s()V

    .line 1519
    .line 1520
    .line 1521
    :cond_5c
    add-int/lit8 v12, v12, 0x1

    .line 1522
    .line 1523
    move-object v2, v15

    .line 1524
    move-object/from16 v3, v26

    .line 1525
    .line 1526
    move/from16 v5, v29

    .line 1527
    .line 1528
    move/from16 v7, v33

    .line 1529
    .line 1530
    const/4 v11, 0x2

    .line 1531
    goto/16 :goto_38

    .line 1532
    .line 1533
    :cond_5d
    move-object v15, v2

    .line 1534
    move-object/from16 v26, v3

    .line 1535
    .line 1536
    const/16 v17, 0x0

    .line 1537
    .line 1538
    if-nez v13, :cond_5e

    .line 1539
    .line 1540
    new-instance v0, LVa/X7;

    .line 1541
    .line 1542
    const/4 v1, 0x0

    .line 1543
    invoke-direct {v0, v1, v4, v1, v1}, LVa/X7;-><init>(Ll8/e0;LS3/e;LS3/s;LS3/c;)V

    .line 1544
    .line 1545
    .line 1546
    return-object v0

    .line 1547
    :cond_5e
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 1548
    .line 1549
    .line 1550
    move-result v2

    .line 1551
    add-int/lit8 v3, v2, 0x1

    .line 1552
    .line 1553
    const-string v4, "expectedSize"

    .line 1554
    .line 1555
    invoke-static {v3, v4}, Ll8/s;->d(ILjava/lang/String;)V

    .line 1556
    .line 1557
    .line 1558
    const-string v5, "initialCapacity"

    .line 1559
    .line 1560
    invoke-static {v3, v5}, Ll8/s;->d(ILjava/lang/String;)V

    .line 1561
    .line 1562
    .line 1563
    new-array v7, v3, [Ljava/lang/Object;

    .line 1564
    .line 1565
    new-array v9, v6, [I

    .line 1566
    .line 1567
    move-object v13, v7

    .line 1568
    move/from16 v7, v17

    .line 1569
    .line 1570
    move v11, v7

    .line 1571
    move v12, v11

    .line 1572
    :goto_40
    if-ge v7, v3, :cond_67

    .line 1573
    .line 1574
    move/from16 v24, v7

    .line 1575
    .line 1576
    const/16 v7, 0x10

    .line 1577
    .line 1578
    invoke-virtual {v0, v7}, LJ5/y;->i(I)I

    .line 1579
    .line 1580
    .line 1581
    move-result v21

    .line 1582
    invoke-virtual {v0, v7}, LJ5/y;->i(I)I

    .line 1583
    .line 1584
    .line 1585
    move-result v25

    .line 1586
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 1587
    .line 1588
    .line 1589
    move-result v28

    .line 1590
    move/from16 v29, v12

    .line 1591
    .line 1592
    if-eqz v28, :cond_60

    .line 1593
    .line 1594
    const/4 v7, 0x2

    .line 1595
    invoke-virtual {v0, v7}, LJ5/y;->i(I)I

    .line 1596
    .line 1597
    .line 1598
    move-result v12

    .line 1599
    const/4 v7, 0x3

    .line 1600
    if-ne v12, v7, :cond_5f

    .line 1601
    .line 1602
    invoke-virtual {v0}, LJ5/y;->s()V

    .line 1603
    .line 1604
    .line 1605
    :cond_5f
    const/4 v7, 0x4

    .line 1606
    invoke-virtual {v0, v7}, LJ5/y;->i(I)I

    .line 1607
    .line 1608
    .line 1609
    move-result v30

    .line 1610
    invoke-virtual {v0, v7}, LJ5/y;->i(I)I

    .line 1611
    .line 1612
    .line 1613
    move-result v31

    .line 1614
    move/from16 v35, v30

    .line 1615
    .line 1616
    move/from16 v36, v31

    .line 1617
    .line 1618
    goto :goto_41

    .line 1619
    :cond_60
    move/from16 v12, v17

    .line 1620
    .line 1621
    move/from16 v35, v12

    .line 1622
    .line 1623
    move/from16 v36, v35

    .line 1624
    .line 1625
    :goto_41
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 1626
    .line 1627
    .line 1628
    move-result v7

    .line 1629
    if-eqz v7, :cond_64

    .line 1630
    .line 1631
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 1632
    .line 1633
    .line 1634
    move-result v7

    .line 1635
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 1636
    .line 1637
    .line 1638
    move-result v30

    .line 1639
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 1640
    .line 1641
    .line 1642
    move-result v31

    .line 1643
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 1644
    .line 1645
    .line 1646
    move-result v33

    .line 1647
    move/from16 v34, v7

    .line 1648
    .line 1649
    const/4 v7, 0x1

    .line 1650
    if-eq v12, v7, :cond_62

    .line 1651
    .line 1652
    const/4 v7, 0x2

    .line 1653
    if-ne v12, v7, :cond_61

    .line 1654
    .line 1655
    goto :goto_42

    .line 1656
    :cond_61
    const/4 v7, 0x1

    .line 1657
    goto :goto_43

    .line 1658
    :cond_62
    :goto_42
    const/4 v7, 0x2

    .line 1659
    :goto_43
    add-int v30, v34, v30

    .line 1660
    .line 1661
    mul-int v30, v30, v7

    .line 1662
    .line 1663
    sub-int v21, v21, v30

    .line 1664
    .line 1665
    const/4 v7, 0x1

    .line 1666
    if-ne v12, v7, :cond_63

    .line 1667
    .line 1668
    const/4 v7, 0x2

    .line 1669
    goto :goto_44

    .line 1670
    :cond_63
    const/4 v7, 0x1

    .line 1671
    :goto_44
    add-int v31, v31, v33

    .line 1672
    .line 1673
    mul-int v31, v31, v7

    .line 1674
    .line 1675
    sub-int v25, v25, v31

    .line 1676
    .line 1677
    :cond_64
    move/from16 v37, v21

    .line 1678
    .line 1679
    move/from16 v38, v25

    .line 1680
    .line 1681
    new-instance v33, LR1/h;

    .line 1682
    .line 1683
    move/from16 v34, v12

    .line 1684
    .line 1685
    invoke-direct/range {v33 .. v38}, LR1/h;-><init>(IIIII)V

    .line 1686
    .line 1687
    .line 1688
    array-length v7, v13

    .line 1689
    add-int/lit8 v12, v11, 0x1

    .line 1690
    .line 1691
    invoke-static {v7, v12}, Ll8/E;->f(II)I

    .line 1692
    .line 1693
    .line 1694
    move-result v7

    .line 1695
    array-length v12, v13

    .line 1696
    if-gt v7, v12, :cond_66

    .line 1697
    .line 1698
    if-eqz v29, :cond_65

    .line 1699
    .line 1700
    goto :goto_45

    .line 1701
    :cond_65
    move/from16 v12, v29

    .line 1702
    .line 1703
    goto :goto_46

    .line 1704
    :cond_66
    :goto_45
    invoke-static {v13, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v7

    .line 1708
    move-object v13, v7

    .line 1709
    move/from16 v12, v17

    .line 1710
    .line 1711
    :goto_46
    add-int/lit8 v7, v11, 0x1

    .line 1712
    .line 1713
    aput-object v33, v13, v11

    .line 1714
    .line 1715
    add-int/lit8 v11, v24, 0x1

    .line 1716
    .line 1717
    move/from16 v39, v11

    .line 1718
    .line 1719
    move v11, v7

    .line 1720
    move/from16 v7, v39

    .line 1721
    .line 1722
    goto/16 :goto_40

    .line 1723
    .line 1724
    :cond_67
    const/4 v12, 0x1

    .line 1725
    if-le v3, v12, :cond_68

    .line 1726
    .line 1727
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 1728
    .line 1729
    .line 1730
    move-result v7

    .line 1731
    if-eqz v7, :cond_68

    .line 1732
    .line 1733
    int-to-double v2, v3

    .line 1734
    sget-object v7, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 1735
    .line 1736
    invoke-static {v2, v3}, Ln8/c;->c(D)I

    .line 1737
    .line 1738
    .line 1739
    move-result v2

    .line 1740
    const/4 v3, 0x1

    .line 1741
    :goto_47
    if-ge v3, v6, :cond_69

    .line 1742
    .line 1743
    invoke-virtual {v0, v2}, LJ5/y;->i(I)I

    .line 1744
    .line 1745
    .line 1746
    move-result v7

    .line 1747
    aput v7, v9, v3

    .line 1748
    .line 1749
    add-int/lit8 v3, v3, 0x1

    .line 1750
    .line 1751
    goto :goto_47

    .line 1752
    :cond_68
    const/4 v3, 0x1

    .line 1753
    :goto_48
    if-ge v3, v6, :cond_69

    .line 1754
    .line 1755
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 1756
    .line 1757
    .line 1758
    move-result v7

    .line 1759
    aput v7, v9, v3

    .line 1760
    .line 1761
    add-int/lit8 v3, v3, 0x1

    .line 1762
    .line 1763
    goto :goto_48

    .line 1764
    :cond_69
    new-instance v2, LS3/s;

    .line 1765
    .line 1766
    invoke-static {v11, v13}, Ll8/K;->h(I[Ljava/lang/Object;)Ll8/e0;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v3

    .line 1770
    invoke-direct {v2, v3, v9}, LS3/s;-><init>(Ll8/e0;[I)V

    .line 1771
    .line 1772
    .line 1773
    const/4 v7, 0x2

    .line 1774
    invoke-virtual {v0, v7}, LJ5/y;->t(I)V

    .line 1775
    .line 1776
    .line 1777
    const/4 v3, 0x1

    .line 1778
    :goto_49
    if-ge v3, v6, :cond_6b

    .line 1779
    .line 1780
    aget v7, v27, v3

    .line 1781
    .line 1782
    aget v7, v20, v7

    .line 1783
    .line 1784
    if-nez v7, :cond_6a

    .line 1785
    .line 1786
    invoke-virtual {v0}, LJ5/y;->s()V

    .line 1787
    .line 1788
    .line 1789
    :cond_6a
    add-int/lit8 v3, v3, 0x1

    .line 1790
    .line 1791
    goto :goto_49

    .line 1792
    :cond_6b
    const/4 v3, 0x1

    .line 1793
    :goto_4a
    if-ge v3, v8, :cond_72

    .line 1794
    .line 1795
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 1796
    .line 1797
    .line 1798
    move-result v7

    .line 1799
    move/from16 v9, v17

    .line 1800
    .line 1801
    :goto_4b
    aget v11, v32, v3

    .line 1802
    .line 1803
    if-ge v9, v11, :cond_71

    .line 1804
    .line 1805
    if-lez v9, :cond_6c

    .line 1806
    .line 1807
    if-eqz v7, :cond_6c

    .line 1808
    .line 1809
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 1810
    .line 1811
    .line 1812
    move-result v11

    .line 1813
    goto :goto_4c

    .line 1814
    :cond_6c
    if-nez v9, :cond_6d

    .line 1815
    .line 1816
    const/4 v11, 0x1

    .line 1817
    goto :goto_4c

    .line 1818
    :cond_6d
    move/from16 v11, v17

    .line 1819
    .line 1820
    :goto_4c
    if-eqz v11, :cond_70

    .line 1821
    .line 1822
    move/from16 v11, v17

    .line 1823
    .line 1824
    :goto_4d
    aget v12, v22, v3

    .line 1825
    .line 1826
    if-ge v11, v12, :cond_6f

    .line 1827
    .line 1828
    aget-object v12, v26, v3

    .line 1829
    .line 1830
    aget-boolean v12, v12, v11

    .line 1831
    .line 1832
    if-eqz v12, :cond_6e

    .line 1833
    .line 1834
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 1835
    .line 1836
    .line 1837
    :cond_6e
    add-int/lit8 v11, v11, 0x1

    .line 1838
    .line 1839
    goto :goto_4d

    .line 1840
    :cond_6f
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 1841
    .line 1842
    .line 1843
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 1844
    .line 1845
    .line 1846
    :cond_70
    add-int/lit8 v9, v9, 0x1

    .line 1847
    .line 1848
    goto :goto_4b

    .line 1849
    :cond_71
    add-int/lit8 v3, v3, 0x1

    .line 1850
    .line 1851
    goto :goto_4a

    .line 1852
    :cond_72
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 1853
    .line 1854
    .line 1855
    move-result v3

    .line 1856
    const/16 v16, 0x2

    .line 1857
    .line 1858
    add-int/lit8 v3, v3, 0x2

    .line 1859
    .line 1860
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 1861
    .line 1862
    .line 1863
    move-result v7

    .line 1864
    if-eqz v7, :cond_73

    .line 1865
    .line 1866
    invoke-virtual {v0, v3}, LJ5/y;->t(I)V

    .line 1867
    .line 1868
    .line 1869
    goto :goto_50

    .line 1870
    :cond_73
    const/4 v7, 0x1

    .line 1871
    :goto_4e
    if-ge v7, v6, :cond_76

    .line 1872
    .line 1873
    move/from16 v8, v17

    .line 1874
    .line 1875
    :goto_4f
    if-ge v8, v7, :cond_75

    .line 1876
    .line 1877
    aget-object v9, p0, v7

    .line 1878
    .line 1879
    aget-boolean v9, v9, v8

    .line 1880
    .line 1881
    if-eqz v9, :cond_74

    .line 1882
    .line 1883
    invoke-virtual {v0, v3}, LJ5/y;->t(I)V

    .line 1884
    .line 1885
    .line 1886
    :cond_74
    add-int/lit8 v8, v8, 0x1

    .line 1887
    .line 1888
    goto :goto_4f

    .line 1889
    :cond_75
    add-int/lit8 v7, v7, 0x1

    .line 1890
    .line 1891
    goto :goto_4e

    .line 1892
    :cond_76
    :goto_50
    invoke-virtual {v0}, LJ5/y;->m()I

    .line 1893
    .line 1894
    .line 1895
    move-result v3

    .line 1896
    const/4 v7, 0x1

    .line 1897
    :goto_51
    if-gt v7, v3, :cond_77

    .line 1898
    .line 1899
    const/16 v13, 0x8

    .line 1900
    .line 1901
    invoke-virtual {v0, v13}, LJ5/y;->t(I)V

    .line 1902
    .line 1903
    .line 1904
    add-int/lit8 v7, v7, 0x1

    .line 1905
    .line 1906
    goto :goto_51

    .line 1907
    :cond_77
    const/16 v13, 0x8

    .line 1908
    .line 1909
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 1910
    .line 1911
    .line 1912
    move-result v3

    .line 1913
    if-eqz v3, :cond_88

    .line 1914
    .line 1915
    iget v3, v0, LJ5/y;->e:I

    .line 1916
    .line 1917
    if-lez v3, :cond_78

    .line 1918
    .line 1919
    rsub-int/lit8 v3, v3, 0x8

    .line 1920
    .line 1921
    invoke-virtual {v0, v3}, LJ5/y;->t(I)V

    .line 1922
    .line 1923
    .line 1924
    :cond_78
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 1925
    .line 1926
    .line 1927
    move-result v3

    .line 1928
    if-nez v3, :cond_79

    .line 1929
    .line 1930
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 1931
    .line 1932
    .line 1933
    move-result v3

    .line 1934
    goto :goto_52

    .line 1935
    :cond_79
    const/4 v3, 0x1

    .line 1936
    :goto_52
    if-eqz v3, :cond_7a

    .line 1937
    .line 1938
    invoke-virtual {v0}, LJ5/y;->s()V

    .line 1939
    .line 1940
    .line 1941
    :cond_7a
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 1942
    .line 1943
    .line 1944
    move-result v3

    .line 1945
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 1946
    .line 1947
    .line 1948
    move-result v7

    .line 1949
    if-nez v3, :cond_7b

    .line 1950
    .line 1951
    if-eqz v7, :cond_81

    .line 1952
    .line 1953
    :cond_7b
    move/from16 v8, v17

    .line 1954
    .line 1955
    :goto_53
    if-ge v8, v14, :cond_81

    .line 1956
    .line 1957
    move/from16 v9, v17

    .line 1958
    .line 1959
    :goto_54
    aget v11, v32, v8

    .line 1960
    .line 1961
    if-ge v9, v11, :cond_80

    .line 1962
    .line 1963
    if-eqz v3, :cond_7c

    .line 1964
    .line 1965
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 1966
    .line 1967
    .line 1968
    move-result v11

    .line 1969
    goto :goto_55

    .line 1970
    :cond_7c
    move/from16 v11, v17

    .line 1971
    .line 1972
    :goto_55
    if-eqz v7, :cond_7d

    .line 1973
    .line 1974
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 1975
    .line 1976
    .line 1977
    move-result v12

    .line 1978
    goto :goto_56

    .line 1979
    :cond_7d
    move/from16 v12, v17

    .line 1980
    .line 1981
    :goto_56
    if-eqz v11, :cond_7e

    .line 1982
    .line 1983
    const/16 v11, 0x20

    .line 1984
    .line 1985
    invoke-virtual {v0, v11}, LJ5/y;->t(I)V

    .line 1986
    .line 1987
    .line 1988
    :cond_7e
    if-eqz v12, :cond_7f

    .line 1989
    .line 1990
    const/16 v11, 0x12

    .line 1991
    .line 1992
    invoke-virtual {v0, v11}, LJ5/y;->t(I)V

    .line 1993
    .line 1994
    .line 1995
    :cond_7f
    add-int/lit8 v9, v9, 0x1

    .line 1996
    .line 1997
    goto :goto_54

    .line 1998
    :cond_80
    add-int/lit8 v8, v8, 0x1

    .line 1999
    .line 2000
    goto :goto_53

    .line 2001
    :cond_81
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 2002
    .line 2003
    .line 2004
    move-result v3

    .line 2005
    if-eqz v3, :cond_82

    .line 2006
    .line 2007
    const/4 v13, 0x4

    .line 2008
    invoke-virtual {v0, v13}, LJ5/y;->i(I)I

    .line 2009
    .line 2010
    .line 2011
    move-result v7

    .line 2012
    const/4 v12, 0x1

    .line 2013
    add-int/2addr v7, v12

    .line 2014
    goto :goto_57

    .line 2015
    :cond_82
    move v7, v6

    .line 2016
    :goto_57
    invoke-static {v7, v4}, Ll8/s;->d(ILjava/lang/String;)V

    .line 2017
    .line 2018
    .line 2019
    invoke-static {v7, v5}, Ll8/s;->d(ILjava/lang/String;)V

    .line 2020
    .line 2021
    .line 2022
    new-array v4, v7, [Ljava/lang/Object;

    .line 2023
    .line 2024
    new-array v5, v6, [I

    .line 2025
    .line 2026
    move-object v11, v4

    .line 2027
    move/from16 v4, v17

    .line 2028
    .line 2029
    move v8, v4

    .line 2030
    move v9, v8

    .line 2031
    :goto_58
    if-ge v4, v7, :cond_86

    .line 2032
    .line 2033
    const/4 v12, 0x3

    .line 2034
    invoke-virtual {v0, v12}, LJ5/y;->t(I)V

    .line 2035
    .line 2036
    .line 2037
    invoke-virtual {v0}, LJ5/y;->h()Z

    .line 2038
    .line 2039
    .line 2040
    move-result v13

    .line 2041
    if-eqz v13, :cond_83

    .line 2042
    .line 2043
    const/4 v13, 0x1

    .line 2044
    :goto_59
    const/16 v14, 0x8

    .line 2045
    .line 2046
    goto :goto_5a

    .line 2047
    :cond_83
    move/from16 v13, v16

    .line 2048
    .line 2049
    goto :goto_59

    .line 2050
    :goto_5a
    invoke-virtual {v0, v14}, LJ5/y;->i(I)I

    .line 2051
    .line 2052
    .line 2053
    move-result v18

    .line 2054
    invoke-static/range {v18 .. v18}, LN1/f;->f(I)I

    .line 2055
    .line 2056
    .line 2057
    move-result v12

    .line 2058
    invoke-virtual {v0, v14}, LJ5/y;->i(I)I

    .line 2059
    .line 2060
    .line 2061
    move-result v18

    .line 2062
    move/from16 p0, v3

    .line 2063
    .line 2064
    invoke-static/range {v18 .. v18}, LN1/f;->g(I)I

    .line 2065
    .line 2066
    .line 2067
    move-result v3

    .line 2068
    invoke-virtual {v0, v14}, LJ5/y;->t(I)V

    .line 2069
    .line 2070
    .line 2071
    new-instance v14, LR1/k;

    .line 2072
    .line 2073
    invoke-direct {v14, v12, v13, v3}, LR1/k;-><init>(III)V

    .line 2074
    .line 2075
    .line 2076
    array-length v3, v11

    .line 2077
    add-int/lit8 v12, v8, 0x1

    .line 2078
    .line 2079
    invoke-static {v3, v12}, Ll8/E;->f(II)I

    .line 2080
    .line 2081
    .line 2082
    move-result v3

    .line 2083
    array-length v12, v11

    .line 2084
    if-gt v3, v12, :cond_84

    .line 2085
    .line 2086
    if-eqz v9, :cond_85

    .line 2087
    .line 2088
    :cond_84
    invoke-static {v11, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2089
    .line 2090
    .line 2091
    move-result-object v3

    .line 2092
    move-object v11, v3

    .line 2093
    move/from16 v9, v17

    .line 2094
    .line 2095
    :cond_85
    add-int/lit8 v3, v8, 0x1

    .line 2096
    .line 2097
    aput-object v14, v11, v8

    .line 2098
    .line 2099
    add-int/lit8 v4, v4, 0x1

    .line 2100
    .line 2101
    move v8, v3

    .line 2102
    move/from16 v3, p0

    .line 2103
    .line 2104
    goto :goto_58

    .line 2105
    :cond_86
    move/from16 p0, v3

    .line 2106
    .line 2107
    if-eqz p0, :cond_87

    .line 2108
    .line 2109
    const/4 v12, 0x1

    .line 2110
    if-le v7, v12, :cond_87

    .line 2111
    .line 2112
    move/from16 v13, v17

    .line 2113
    .line 2114
    :goto_5b
    if-ge v13, v6, :cond_87

    .line 2115
    .line 2116
    const/4 v7, 0x4

    .line 2117
    invoke-virtual {v0, v7}, LJ5/y;->i(I)I

    .line 2118
    .line 2119
    .line 2120
    move-result v3

    .line 2121
    aput v3, v5, v13

    .line 2122
    .line 2123
    add-int/lit8 v13, v13, 0x1

    .line 2124
    .line 2125
    goto :goto_5b

    .line 2126
    :cond_87
    new-instance v0, LS3/c;

    .line 2127
    .line 2128
    invoke-static {v8, v11}, Ll8/K;->h(I[Ljava/lang/Object;)Ll8/e0;

    .line 2129
    .line 2130
    .line 2131
    move-result-object v3

    .line 2132
    invoke-direct {v0, v3, v5}, LS3/c;-><init>(Ll8/e0;[I)V

    .line 2133
    .line 2134
    .line 2135
    goto :goto_5c

    .line 2136
    :cond_88
    const/4 v0, 0x0

    .line 2137
    :goto_5c
    new-instance v3, LVa/X7;

    .line 2138
    .line 2139
    new-instance v4, LS3/e;

    .line 2140
    .line 2141
    invoke-direct {v4, v15, v10}, LS3/e;-><init>(Ll8/e0;[I)V

    .line 2142
    .line 2143
    .line 2144
    invoke-direct {v3, v1, v4, v2, v0}, LVa/X7;-><init>(Ll8/e0;LS3/e;LS3/s;LS3/c;)V

    .line 2145
    .line 2146
    .line 2147
    return-object v3

    .line 2148
    :cond_89
    :goto_5d
    new-instance v0, LVa/X7;

    .line 2149
    .line 2150
    const/4 v1, 0x0

    .line 2151
    invoke-direct {v0, v1, v4, v1, v1}, LVa/X7;-><init>(Ll8/e0;LS3/e;LS3/s;LS3/c;)V

    .line 2152
    .line 2153
    .line 2154
    return-object v0

    .line 2155
    :goto_5e
    new-instance v0, LVa/X7;

    .line 2156
    .line 2157
    invoke-direct {v0, v1, v4, v1, v1}, LVa/X7;-><init>(Ll8/e0;LS3/e;LS3/s;LS3/c;)V

    .line 2158
    .line 2159
    .line 2160
    return-object v0

    .line 2161
    :goto_5f
    new-instance v0, LVa/X7;

    .line 2162
    .line 2163
    invoke-direct {v0, v1, v4, v1, v1}, LVa/X7;-><init>(Ll8/e0;LS3/e;LS3/s;LS3/c;)V

    .line 2164
    .line 2165
    .line 2166
    return-object v0
.end method

.method public static i(II[B)LR1/m;
    .locals 30

    .line 1
    const/4 v0, 0x1

    .line 2
    add-int/lit8 v1, p0, 0x1

    .line 3
    .line 4
    new-instance v2, LJ5/y;

    .line 5
    .line 6
    const/4 v3, 0x3

    .line 7
    move/from16 v4, p1

    .line 8
    .line 9
    move-object/from16 v5, p2

    .line 10
    .line 11
    invoke-direct {v2, v1, v5, v4, v3}, LJ5/y;-><init>(I[BII)V

    .line 12
    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    invoke-virtual {v2, v1}, LJ5/y;->i(I)I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-virtual {v2, v1}, LJ5/y;->i(I)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    invoke-virtual {v2, v1}, LJ5/y;->i(I)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    const/16 v8, 0x56

    .line 33
    .line 34
    const/16 v9, 0x2c

    .line 35
    .line 36
    const/16 v10, 0xf4

    .line 37
    .line 38
    const/16 v11, 0x7a

    .line 39
    .line 40
    const/16 v12, 0x6e

    .line 41
    .line 42
    const/16 v13, 0x64

    .line 43
    .line 44
    const/4 v14, 0x3

    .line 45
    if-eq v4, v13, :cond_1

    .line 46
    .line 47
    if-eq v4, v12, :cond_1

    .line 48
    .line 49
    if-eq v4, v11, :cond_1

    .line 50
    .line 51
    if-eq v4, v10, :cond_1

    .line 52
    .line 53
    if-eq v4, v9, :cond_1

    .line 54
    .line 55
    const/16 v15, 0x53

    .line 56
    .line 57
    if-eq v4, v15, :cond_1

    .line 58
    .line 59
    if-eq v4, v8, :cond_1

    .line 60
    .line 61
    const/16 v15, 0x76

    .line 62
    .line 63
    if-eq v4, v15, :cond_1

    .line 64
    .line 65
    const/16 v15, 0x80

    .line 66
    .line 67
    if-eq v4, v15, :cond_1

    .line 68
    .line 69
    const/16 v15, 0x8a

    .line 70
    .line 71
    if-ne v4, v15, :cond_0

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    move v15, v0

    .line 75
    const/16 p1, 0x10

    .line 76
    .line 77
    const/4 v11, 0x0

    .line 78
    const/4 v12, 0x0

    .line 79
    const/16 v16, 0x0

    .line 80
    .line 81
    goto/16 :goto_8

    .line 82
    .line 83
    :cond_1
    :goto_0
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 84
    .line 85
    .line 86
    move-result v15

    .line 87
    if-ne v15, v14, :cond_2

    .line 88
    .line 89
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 90
    .line 91
    .line 92
    move-result v16

    .line 93
    goto :goto_1

    .line 94
    :cond_2
    const/16 v16, 0x0

    .line 95
    .line 96
    :goto_1
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 97
    .line 98
    .line 99
    move-result v17

    .line 100
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 101
    .line 102
    .line 103
    move-result v18

    .line 104
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 108
    .line 109
    .line 110
    move-result v19

    .line 111
    if-eqz v19, :cond_8

    .line 112
    .line 113
    if-eq v15, v14, :cond_3

    .line 114
    .line 115
    move v3, v1

    .line 116
    :goto_2
    const/16 p1, 0x10

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_3
    const/16 v19, 0xc

    .line 120
    .line 121
    move/from16 v3, v19

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :goto_3
    const/4 v1, 0x0

    .line 125
    :goto_4
    if-ge v1, v3, :cond_9

    .line 126
    .line 127
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 128
    .line 129
    .line 130
    move-result v19

    .line 131
    if-eqz v19, :cond_7

    .line 132
    .line 133
    const/4 v10, 0x6

    .line 134
    if-ge v1, v10, :cond_4

    .line 135
    .line 136
    move/from16 v10, p1

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_4
    const/16 v10, 0x40

    .line 140
    .line 141
    :goto_5
    const/4 v11, 0x0

    .line 142
    const/16 v20, 0x8

    .line 143
    .line 144
    const/16 v21, 0x8

    .line 145
    .line 146
    :goto_6
    if-ge v11, v10, :cond_7

    .line 147
    .line 148
    if-eqz v20, :cond_5

    .line 149
    .line 150
    invoke-virtual {v2}, LJ5/y;->n()I

    .line 151
    .line 152
    .line 153
    move-result v20

    .line 154
    add-int v12, v20, v21

    .line 155
    .line 156
    add-int/lit16 v12, v12, 0x100

    .line 157
    .line 158
    rem-int/lit16 v12, v12, 0x100

    .line 159
    .line 160
    move/from16 v20, v12

    .line 161
    .line 162
    :cond_5
    if-nez v20, :cond_6

    .line 163
    .line 164
    goto :goto_7

    .line 165
    :cond_6
    move/from16 v21, v20

    .line 166
    .line 167
    :goto_7
    add-int/lit8 v11, v11, 0x1

    .line 168
    .line 169
    const/16 v12, 0x6e

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 173
    .line 174
    const/16 v10, 0xf4

    .line 175
    .line 176
    const/16 v11, 0x7a

    .line 177
    .line 178
    const/16 v12, 0x6e

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_8
    const/16 p1, 0x10

    .line 182
    .line 183
    :cond_9
    move/from16 v11, v17

    .line 184
    .line 185
    move/from16 v12, v18

    .line 186
    .line 187
    :goto_8
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    add-int/lit8 v1, v1, 0x4

    .line 192
    .line 193
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-nez v3, :cond_a

    .line 198
    .line 199
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 200
    .line 201
    .line 202
    move-result v10

    .line 203
    add-int/lit8 v10, v10, 0x4

    .line 204
    .line 205
    move/from16 v21, v0

    .line 206
    .line 207
    move/from16 v23, v1

    .line 208
    .line 209
    move v0, v8

    .line 210
    :goto_9
    const/16 v18, 0x0

    .line 211
    .line 212
    goto :goto_b

    .line 213
    :cond_a
    if-ne v3, v0, :cond_c

    .line 214
    .line 215
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 216
    .line 217
    .line 218
    move-result v10

    .line 219
    invoke-virtual {v2}, LJ5/y;->n()I

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2}, LJ5/y;->n()I

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 226
    .line 227
    .line 228
    move-result v13

    .line 229
    int-to-long v8, v13

    .line 230
    move/from16 v21, v0

    .line 231
    .line 232
    move/from16 v23, v1

    .line 233
    .line 234
    const/4 v13, 0x0

    .line 235
    :goto_a
    int-to-long v0, v13

    .line 236
    cmp-long v0, v0, v8

    .line 237
    .line 238
    if-gez v0, :cond_b

    .line 239
    .line 240
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 241
    .line 242
    .line 243
    add-int/lit8 v13, v13, 0x1

    .line 244
    .line 245
    goto :goto_a

    .line 246
    :cond_b
    move/from16 v18, v10

    .line 247
    .line 248
    const/16 v0, 0x56

    .line 249
    .line 250
    const/4 v10, 0x0

    .line 251
    goto :goto_b

    .line 252
    :cond_c
    move/from16 v21, v0

    .line 253
    .line 254
    move/from16 v23, v1

    .line 255
    .line 256
    move v0, v8

    .line 257
    const/4 v10, 0x0

    .line 258
    goto :goto_9

    .line 259
    :goto_b
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    add-int/lit8 v1, v1, 0x1

    .line 270
    .line 271
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    add-int/lit8 v8, v8, 0x1

    .line 276
    .line 277
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 278
    .line 279
    .line 280
    move-result v9

    .line 281
    rsub-int/lit8 v13, v9, 0x2

    .line 282
    .line 283
    mul-int/2addr v8, v13

    .line 284
    if-nez v9, :cond_d

    .line 285
    .line 286
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 287
    .line 288
    .line 289
    :cond_d
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 290
    .line 291
    .line 292
    mul-int/lit8 v1, v1, 0x10

    .line 293
    .line 294
    mul-int/lit8 v8, v8, 0x10

    .line 295
    .line 296
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 297
    .line 298
    .line 299
    move-result v24

    .line 300
    const/16 v25, 0x2

    .line 301
    .line 302
    if-eqz v24, :cond_11

    .line 303
    .line 304
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 305
    .line 306
    .line 307
    move-result v24

    .line 308
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 309
    .line 310
    .line 311
    move-result v26

    .line 312
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 313
    .line 314
    .line 315
    move-result v27

    .line 316
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 317
    .line 318
    .line 319
    move-result v28

    .line 320
    if-nez v15, :cond_e

    .line 321
    .line 322
    move/from16 v0, v21

    .line 323
    .line 324
    goto :goto_e

    .line 325
    :cond_e
    move/from16 v0, v21

    .line 326
    .line 327
    if-ne v15, v14, :cond_f

    .line 328
    .line 329
    goto :goto_c

    .line 330
    :cond_f
    move/from16 v21, v25

    .line 331
    .line 332
    :goto_c
    if-ne v15, v0, :cond_10

    .line 333
    .line 334
    move/from16 v15, v25

    .line 335
    .line 336
    goto :goto_d

    .line 337
    :cond_10
    move v15, v0

    .line 338
    :goto_d
    mul-int/2addr v13, v15

    .line 339
    :goto_e
    add-int v24, v24, v26

    .line 340
    .line 341
    mul-int v24, v24, v21

    .line 342
    .line 343
    sub-int v1, v1, v24

    .line 344
    .line 345
    add-int v27, v27, v28

    .line 346
    .line 347
    mul-int v27, v27, v13

    .line 348
    .line 349
    sub-int v8, v8, v27

    .line 350
    .line 351
    :goto_f
    move v13, v9

    .line 352
    move v9, v8

    .line 353
    move v8, v1

    .line 354
    const/16 v1, 0x2c

    .line 355
    .line 356
    goto :goto_10

    .line 357
    :cond_11
    move/from16 v0, v21

    .line 358
    .line 359
    goto :goto_f

    .line 360
    :goto_10
    if-eq v4, v1, :cond_12

    .line 361
    .line 362
    const/16 v1, 0x56

    .line 363
    .line 364
    if-eq v4, v1, :cond_12

    .line 365
    .line 366
    const/16 v1, 0x64

    .line 367
    .line 368
    if-eq v4, v1, :cond_12

    .line 369
    .line 370
    const/16 v1, 0x6e

    .line 371
    .line 372
    if-eq v4, v1, :cond_12

    .line 373
    .line 374
    const/16 v1, 0x7a

    .line 375
    .line 376
    if-eq v4, v1, :cond_12

    .line 377
    .line 378
    const/16 v1, 0xf4

    .line 379
    .line 380
    if-ne v4, v1, :cond_13

    .line 381
    .line 382
    :cond_12
    and-int/lit8 v1, v5, 0x10

    .line 383
    .line 384
    if-eqz v1, :cond_13

    .line 385
    .line 386
    const/4 v15, 0x0

    .line 387
    goto :goto_11

    .line 388
    :cond_13
    move/from16 v15, p1

    .line 389
    .line 390
    :goto_11
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 391
    .line 392
    .line 393
    move-result v1

    .line 394
    const/16 v17, -0x1

    .line 395
    .line 396
    const/high16 v19, 0x3f800000    # 1.0f

    .line 397
    .line 398
    if-eqz v1, :cond_22

    .line 399
    .line 400
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    if-eqz v1, :cond_16

    .line 405
    .line 406
    const/16 v1, 0x8

    .line 407
    .line 408
    invoke-virtual {v2, v1}, LJ5/y;->i(I)I

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    const/16 v1, 0xff

    .line 413
    .line 414
    if-ne v0, v1, :cond_14

    .line 415
    .line 416
    move/from16 v1, p1

    .line 417
    .line 418
    invoke-virtual {v2, v1}, LJ5/y;->i(I)I

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    invoke-virtual {v2, v1}, LJ5/y;->i(I)I

    .line 423
    .line 424
    .line 425
    move-result v1

    .line 426
    if-eqz v0, :cond_16

    .line 427
    .line 428
    if-eqz v1, :cond_16

    .line 429
    .line 430
    int-to-float v0, v0

    .line 431
    int-to-float v1, v1

    .line 432
    div-float v19, v0, v1

    .line 433
    .line 434
    goto :goto_12

    .line 435
    :cond_14
    const/16 v1, 0x11

    .line 436
    .line 437
    if-ge v0, v1, :cond_15

    .line 438
    .line 439
    sget-object v1, LR1/n;->b:[F

    .line 440
    .line 441
    aget v19, v1, v0

    .line 442
    .line 443
    goto :goto_12

    .line 444
    :cond_15
    const-string v1, "Unexpected aspect_ratio_idc value: "

    .line 445
    .line 446
    const-string v14, "NalUnitUtil"

    .line 447
    .line 448
    invoke-static {v0, v1, v14}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    :cond_16
    :goto_12
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    if-eqz v0, :cond_17

    .line 456
    .line 457
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 458
    .line 459
    .line 460
    :cond_17
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    if-eqz v0, :cond_1a

    .line 465
    .line 466
    const/4 v0, 0x3

    .line 467
    invoke-virtual {v2, v0}, LJ5/y;->t(I)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 471
    .line 472
    .line 473
    move-result v0

    .line 474
    if-eqz v0, :cond_18

    .line 475
    .line 476
    const/4 v0, 0x1

    .line 477
    goto :goto_13

    .line 478
    :cond_18
    move/from16 v0, v25

    .line 479
    .line 480
    :goto_13
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 481
    .line 482
    .line 483
    move-result v1

    .line 484
    if-eqz v1, :cond_19

    .line 485
    .line 486
    const/16 v1, 0x8

    .line 487
    .line 488
    invoke-virtual {v2, v1}, LJ5/y;->i(I)I

    .line 489
    .line 490
    .line 491
    move-result v14

    .line 492
    invoke-virtual {v2, v1}, LJ5/y;->i(I)I

    .line 493
    .line 494
    .line 495
    move-result v17

    .line 496
    invoke-virtual {v2, v1}, LJ5/y;->t(I)V

    .line 497
    .line 498
    .line 499
    invoke-static {v14}, LN1/f;->f(I)I

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    invoke-static/range {v17 .. v17}, LN1/f;->g(I)I

    .line 504
    .line 505
    .line 506
    move-result v17

    .line 507
    move/from16 v29, v17

    .line 508
    .line 509
    move/from16 v17, v1

    .line 510
    .line 511
    move/from16 v1, v29

    .line 512
    .line 513
    goto :goto_14

    .line 514
    :cond_19
    move/from16 v1, v17

    .line 515
    .line 516
    goto :goto_14

    .line 517
    :cond_1a
    move/from16 v0, v17

    .line 518
    .line 519
    move v1, v0

    .line 520
    :goto_14
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 521
    .line 522
    .line 523
    move-result v14

    .line 524
    if-eqz v14, :cond_1b

    .line 525
    .line 526
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 527
    .line 528
    .line 529
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 530
    .line 531
    .line 532
    :cond_1b
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 533
    .line 534
    .line 535
    move-result v14

    .line 536
    if-eqz v14, :cond_1c

    .line 537
    .line 538
    const/16 v14, 0x41

    .line 539
    .line 540
    invoke-virtual {v2, v14}, LJ5/y;->t(I)V

    .line 541
    .line 542
    .line 543
    :cond_1c
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 544
    .line 545
    .line 546
    move-result v14

    .line 547
    if-eqz v14, :cond_1d

    .line 548
    .line 549
    invoke-static {v2}, LR1/n;->j(LJ5/y;)V

    .line 550
    .line 551
    .line 552
    :cond_1d
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 553
    .line 554
    .line 555
    move-result v20

    .line 556
    if-eqz v20, :cond_1e

    .line 557
    .line 558
    invoke-static {v2}, LR1/n;->j(LJ5/y;)V

    .line 559
    .line 560
    .line 561
    :cond_1e
    if-nez v14, :cond_1f

    .line 562
    .line 563
    if-eqz v20, :cond_20

    .line 564
    .line 565
    :cond_1f
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 566
    .line 567
    .line 568
    :cond_20
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 572
    .line 573
    .line 574
    move-result v14

    .line 575
    if-eqz v14, :cond_21

    .line 576
    .line 577
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 581
    .line 582
    .line 583
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 584
    .line 585
    .line 586
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 587
    .line 588
    .line 589
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 590
    .line 591
    .line 592
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 593
    .line 594
    .line 595
    move-result v15

    .line 596
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 597
    .line 598
    .line 599
    :cond_21
    move/from16 v14, v17

    .line 600
    .line 601
    move/from16 v17, v10

    .line 602
    .line 603
    move/from16 v10, v19

    .line 604
    .line 605
    move/from16 v19, v14

    .line 606
    .line 607
    move/from16 v20, v0

    .line 608
    .line 609
    move/from16 v21, v1

    .line 610
    .line 611
    move v14, v13

    .line 612
    move/from16 v22, v15

    .line 613
    .line 614
    move/from16 v13, v16

    .line 615
    .line 616
    move/from16 v16, v3

    .line 617
    .line 618
    goto :goto_15

    .line 619
    :cond_22
    move v14, v13

    .line 620
    move/from16 v22, v15

    .line 621
    .line 622
    move/from16 v13, v16

    .line 623
    .line 624
    move/from16 v20, v17

    .line 625
    .line 626
    move/from16 v21, v20

    .line 627
    .line 628
    move/from16 v16, v3

    .line 629
    .line 630
    move/from16 v17, v10

    .line 631
    .line 632
    move/from16 v10, v19

    .line 633
    .line 634
    move/from16 v19, v21

    .line 635
    .line 636
    :goto_15
    new-instance v3, LR1/m;

    .line 637
    .line 638
    move/from16 v15, v23

    .line 639
    .line 640
    invoke-direct/range {v3 .. v22}, LR1/m;-><init>(IIIIIIFIIZZIIIZIIII)V

    .line 641
    .line 642
    .line 643
    return-object v3
.end method

.method public static j(LJ5/y;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LJ5/y;->m()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {p0, v1}, LJ5/y;->t(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, LJ5/y;->m()I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, LJ5/y;->m()I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, LJ5/y;->s()V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/16 v0, 0x14

    .line 28
    .line 29
    invoke-virtual {p0, v0}, LJ5/y;->t(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static k(I[B)I
    .locals 8

    .line 1
    sget-object v0, LR1/n;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    move v3, v2

    .line 7
    :cond_0
    :goto_0
    if-ge v2, p0, :cond_4

    .line 8
    .line 9
    :goto_1
    add-int/lit8 v4, p0, -0x2

    .line 10
    .line 11
    if-ge v2, v4, :cond_2

    .line 12
    .line 13
    :try_start_0
    aget-byte v4, p1, v2

    .line 14
    .line 15
    if-nez v4, :cond_1

    .line 16
    .line 17
    add-int/lit8 v4, v2, 0x1

    .line 18
    .line 19
    aget-byte v4, p1, v4

    .line 20
    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    add-int/lit8 v4, v2, 0x2

    .line 24
    .line 25
    aget-byte v4, p1, v4

    .line 26
    .line 27
    const/4 v5, 0x3

    .line 28
    if-ne v4, v5, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move v2, p0

    .line 35
    :goto_2
    if-ge v2, p0, :cond_0

    .line 36
    .line 37
    sget-object v4, LR1/n;->d:[I

    .line 38
    .line 39
    array-length v5, v4

    .line 40
    if-gt v5, v3, :cond_3

    .line 41
    .line 42
    array-length v5, v4

    .line 43
    mul-int/lit8 v5, v5, 0x2

    .line 44
    .line 45
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    sput-object v4, LR1/n;->d:[I

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto :goto_5

    .line 54
    :cond_3
    :goto_3
    sget-object v4, LR1/n;->d:[I

    .line 55
    .line 56
    add-int/lit8 v5, v3, 0x1

    .line 57
    .line 58
    aput v2, v4, v3

    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x3

    .line 61
    .line 62
    move v3, v5

    .line 63
    goto :goto_0

    .line 64
    :cond_4
    sub-int/2addr p0, v3

    .line 65
    move v2, v1

    .line 66
    move v4, v2

    .line 67
    move v5, v4

    .line 68
    :goto_4
    if-ge v2, v3, :cond_5

    .line 69
    .line 70
    sget-object v6, LR1/n;->d:[I

    .line 71
    .line 72
    aget v6, v6, v2

    .line 73
    .line 74
    sub-int/2addr v6, v5

    .line 75
    invoke-static {p1, v5, p1, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 76
    .line 77
    .line 78
    add-int/2addr v4, v6

    .line 79
    add-int/lit8 v7, v4, 0x1

    .line 80
    .line 81
    aput-byte v1, p1, v4

    .line 82
    .line 83
    add-int/lit8 v4, v4, 0x2

    .line 84
    .line 85
    aput-byte v1, p1, v7

    .line 86
    .line 87
    add-int/lit8 v6, v6, 0x3

    .line 88
    .line 89
    add-int/2addr v5, v6

    .line 90
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    sub-int v1, p0, v4

    .line 94
    .line 95
    invoke-static {p1, v5, p1, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 96
    .line 97
    .line 98
    monitor-exit v0

    .line 99
    return p0

    .line 100
    :goto_5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    throw p0
.end method
