.class public final LVa/U0;
.super Lx6/k;
.source "SourceFile"

# interfaces
.implements LVa/H9;


# static fields
.field public static final d:[I

.field public static e:I = 0x0

.field public static f:I = 0x1


# instance fields
.field public a:Lx6/k;

.field public b:LVa/Ra;

.field public synthetic c:LVa/W0;


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
    sput-object v0, LVa/U0;->d:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x3e707efe
        -0x36249ce1
        0x54d1f4ca
        0x734ce204
        0x2eda6363
        0x34dbd340
        0x349044f
        0x8c3965a
        -0x74655902
        -0x1cadd2a6
        -0x7aeb0bd9
        0x66720d58
        -0xf5f6fa1
        0x109e3b98
        -0x177646e0
        0x588b8b20
        -0x2416561e
        -0x5dd3a642
    .end array-data
.end method

.method public static a(I[I)Ljava/lang/String;
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
    sget-object v4, LVa/U0;->d:[I

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


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 4

    .line 1
    sget v0, LVa/U0;->f:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x5f

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/U0;->e:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    add-int/lit8 v1, v0, 0x27

    .line 15
    .line 16
    rem-int/lit16 v3, v1, 0x80

    .line 17
    .line 18
    sput v3, LVa/U0;->e:I

    .line 19
    .line 20
    rem-int/lit8 v1, v1, 0x2

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, LVa/U0;->a:Lx6/k;

    .line 25
    .line 26
    const/16 v3, 0x12

    .line 27
    .line 28
    div-int/lit8 v3, v3, 0x0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    throw v2

    .line 32
    :cond_1
    add-int/lit8 v1, v0, 0x27

    .line 33
    .line 34
    rem-int/lit16 v3, v1, 0x80

    .line 35
    .line 36
    sput v3, LVa/U0;->e:I

    .line 37
    .line 38
    rem-int/lit8 v1, v1, 0x2

    .line 39
    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    iget-object v1, p0, LVa/U0;->a:Lx6/k;

    .line 43
    .line 44
    :goto_0
    add-int/lit8 v0, v0, 0x39

    .line 45
    .line 46
    rem-int/lit16 v3, v0, 0x80

    .line 47
    .line 48
    sput v3, LVa/U0;->e:I

    .line 49
    .line 50
    rem-int/lit8 v0, v0, 0x2

    .line 51
    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_2
    throw v2

    .line 56
    :cond_3
    throw v2
.end method

.method public final onAdClicked()V
    .locals 5

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    const v1, -0xffffdb

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    sub-int/2addr v1, v3

    .line 17
    invoke-static {v1, v0}, LVa/U0;->a(I[I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-array v1, v2, [Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v3, p0, LVa/U0;->c:LVa/W0;

    .line 28
    .line 29
    iget-object v4, p0, LVa/U0;->b:LVa/Ra;

    .line 30
    .line 31
    invoke-virtual {v3, p0, v4, v0, v1}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, LVa/U0;->a:Lx6/k;

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    sget v1, LVa/U0;->e:I

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x65

    .line 41
    .line 42
    rem-int/lit16 v1, v1, 0x80

    .line 43
    .line 44
    sput v1, LVa/U0;->f:I

    .line 45
    .line 46
    invoke-virtual {v0}, Lx6/k;->onAdClicked()V

    .line 47
    .line 48
    .line 49
    :cond_0
    sget v0, LVa/U0;->e:I

    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x6d

    .line 52
    .line 53
    rem-int/lit16 v1, v0, 0x80

    .line 54
    .line 55
    sput v1, LVa/U0;->f:I

    .line 56
    .line 57
    rem-int/lit8 v0, v0, 0x2

    .line 58
    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    const/16 v0, 0x23

    .line 62
    .line 63
    div-int/2addr v0, v2

    .line 64
    :cond_1
    return-void

    .line 65
    :array_0
    .array-data 4
        0x2f793cf2
        -0x3025c56a
        0xe1090f
        -0x5cd7f160
        0x7a706bd3
        0x2ad0ab30
        -0x40ab57ae
        -0x7299c356
        0x6b86d488    # 3.2599942E26f
        0x679d86f3
        -0xb9aec8a
        -0x16ea2ddd
        0x242692c9
        0x3164be15
        -0x42890ddf
        0x347130a1
        -0x7a07f751
        -0x426c9026
        -0x31868ae8
        0x393e9103
    .end array-data
.end method

.method public final onAdDismissedFullScreenContent()V
    .locals 6

    .line 1
    sget v0, LVa/U0;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/U0;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/U0;->b:LVa/Ra;

    .line 12
    .line 13
    iget-object v2, p0, LVa/U0;->c:LVa/W0;

    .line 14
    .line 15
    iget-object v3, p0, LVa/U0;->a:Lx6/k;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/16 v0, 0x1c

    .line 20
    .line 21
    new-array v0, v0, [I

    .line 22
    .line 23
    fill-array-data v0, :array_0

    .line 24
    .line 25
    .line 26
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    div-int/lit8 v4, v4, 0x7d

    .line 31
    .line 32
    const/16 v5, 0x5b

    .line 33
    .line 34
    shr-int v4, v5, v4

    .line 35
    .line 36
    invoke-static {v4, v0}, LVa/U0;->a(I[I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v4, 0x1

    .line 45
    new-array v4, v4, [Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {v2, p0, v1, v0, v4}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/16 v0, 0x1c

    .line 54
    .line 55
    new-array v0, v0, [I

    .line 56
    .line 57
    fill-array-data v0, :array_1

    .line 58
    .line 59
    .line 60
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    shr-int/lit8 v4, v4, 0x10

    .line 65
    .line 66
    rsub-int/lit8 v4, v4, 0x38

    .line 67
    .line 68
    invoke-static {v4, v0}, LVa/U0;->a(I[I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const/4 v4, 0x0

    .line 77
    new-array v4, v4, [Ljava/lang/Object;

    .line 78
    .line 79
    invoke-virtual {v2, p0, v1, v0, v4}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    if-eqz v3, :cond_1

    .line 83
    .line 84
    :goto_0
    invoke-virtual {v3}, Lx6/k;->onAdDismissedFullScreenContent()V

    .line 85
    .line 86
    .line 87
    :cond_1
    sget v0, LVa/U0;->f:I

    .line 88
    .line 89
    add-int/lit8 v0, v0, 0x33

    .line 90
    .line 91
    rem-int/lit16 v0, v0, 0x80

    .line 92
    .line 93
    sput v0, LVa/U0;->e:I

    .line 94
    .line 95
    return-void

    .line 96
    nop

    .line 97
    :array_0
    .array-data 4
        0x2f793cf2
        -0x3025c56a
        0xe1090f
        -0x5cd7f160
        0x7a706bd3
        0x2ad0ab30
        -0x40ab57ae
        -0x7299c356
        0x6b86d488    # 3.2599942E26f
        0x679d86f3
        -0xb9aec8a
        -0x16ea2ddd
        0x242692c9
        0x3164be15
        -0x7318094d
        -0x54ef2e58
        0x41ef9e31
        -0x1b75fcd2
        0x1f94a104
        0x1219a37e
        -0x5255f2b8
        -0x5f32a8d6
        -0x2a633dda
        0x7eabdaae
        0x6904e905
        -0x4d9d5c8f
        -0xca845f0
        0x71d5cb14
    .end array-data

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    :array_1
    .array-data 4
        0x2f793cf2
        -0x3025c56a
        0xe1090f
        -0x5cd7f160
        0x7a706bd3
        0x2ad0ab30
        -0x40ab57ae
        -0x7299c356
        0x6b86d488    # 3.2599942E26f
        0x679d86f3
        -0xb9aec8a
        -0x16ea2ddd
        0x242692c9
        0x3164be15
        -0x7318094d
        -0x54ef2e58
        0x41ef9e31
        -0x1b75fcd2
        0x1f94a104
        0x1219a37e
        -0x5255f2b8
        -0x5f32a8d6
        -0x2a633dda
        0x7eabdaae
        0x6904e905
        -0x4d9d5c8f
        -0xca845f0
        0x71d5cb14
    .end array-data
.end method

.method public final onAdFailedToShowFullScreenContent(Lx6/a;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    sget v1, LVa/U0;->e:I

    .line 3
    .line 4
    add-int/lit8 v1, v1, 0x11

    .line 5
    .line 6
    rem-int/lit16 v2, v1, 0x80

    .line 7
    .line 8
    sput v2, LVa/U0;->f:I

    .line 9
    .line 10
    rem-int/lit8 v1, v1, 0x2

    .line 11
    .line 12
    iget-object v2, p0, LVa/U0;->b:LVa/Ra;

    .line 13
    .line 14
    iget-object v3, p0, LVa/U0;->c:LVa/W0;

    .line 15
    .line 16
    iget-object v4, p0, LVa/U0;->a:Lx6/k;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const/16 v1, 0x1e

    .line 21
    .line 22
    new-array v1, v1, [I

    .line 23
    .line 24
    fill-array-data v1, :array_0

    .line 25
    .line 26
    .line 27
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    add-int/lit8 v5, v5, -0x13

    .line 32
    .line 33
    const/16 v6, 0x38

    .line 34
    .line 35
    ushr-int v5, v6, v5

    .line 36
    .line 37
    invoke-static {v5, v1}, LVa/U0;->a(I[I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const/4 v5, 0x1

    .line 46
    new-array v5, v5, [Ljava/lang/Object;

    .line 47
    .line 48
    aput-object p1, v5, v0

    .line 49
    .line 50
    invoke-virtual {v3, p0, v2, v1, v5}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/16 v1, 0x1e

    .line 57
    .line 58
    new-array v1, v1, [I

    .line 59
    .line 60
    fill-array-data v1, :array_1

    .line 61
    .line 62
    .line 63
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    shr-int/lit8 v5, v5, 0x10

    .line 68
    .line 69
    add-int/lit8 v5, v5, 0x3b

    .line 70
    .line 71
    invoke-static {v5, v1}, LVa/U0;->a(I[I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    const/4 v5, 0x1

    .line 80
    new-array v5, v5, [Ljava/lang/Object;

    .line 81
    .line 82
    aput-object p1, v5, v0

    .line 83
    .line 84
    invoke-virtual {v3, p0, v2, v1, v5}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    if-eqz v4, :cond_1

    .line 88
    .line 89
    :goto_0
    sget v1, LVa/U0;->f:I

    .line 90
    .line 91
    add-int/lit8 v1, v1, 0x7d

    .line 92
    .line 93
    rem-int/lit16 v2, v1, 0x80

    .line 94
    .line 95
    sput v2, LVa/U0;->e:I

    .line 96
    .line 97
    rem-int/lit8 v1, v1, 0x2

    .line 98
    .line 99
    invoke-virtual {v4, p1}, Lx6/k;->onAdFailedToShowFullScreenContent(Lx6/a;)V

    .line 100
    .line 101
    .line 102
    if-eqz v1, :cond_1

    .line 103
    .line 104
    const/16 p1, 0x3a

    .line 105
    .line 106
    div-int/2addr p1, v0

    .line 107
    :cond_1
    return-void

    .line 108
    nop

    :array_0
    .array-data 4
        0x2f793cf2
        -0x3025c56a
        0xe1090f
        -0x5cd7f160
        0x7a706bd3
        0x2ad0ab30
        -0x40ab57ae
        -0x7299c356
        0x6b86d488    # 3.2599942E26f
        0x679d86f3
        -0xb9aec8a
        -0x16ea2ddd
        0x242692c9
        0x3164be15
        0x75ef1552
        0x2465dc78
        0x2f076da8
        0x7fa80540
        -0x4d0cb87f
        0x19b9b6eb
        0x6498d11d
        -0x883d3df
        0x49b4e01a    # 1481731.2f
        -0x9594f7c
        -0x691cd4b1
        0x112a6c22
        -0x7ba07c1b
        -0x521b446f
        0x3d0b235b
        0x47c19bf5
    .end array-data

    :array_1
    .array-data 4
        0x2f793cf2
        -0x3025c56a
        0xe1090f
        -0x5cd7f160
        0x7a706bd3
        0x2ad0ab30
        -0x40ab57ae
        -0x7299c356
        0x6b86d488    # 3.2599942E26f
        0x679d86f3
        -0xb9aec8a
        -0x16ea2ddd
        0x242692c9
        0x3164be15
        0x75ef1552
        0x2465dc78
        0x2f076da8
        0x7fa80540
        -0x4d0cb87f
        0x19b9b6eb
        0x6498d11d
        -0x883d3df
        0x49b4e01a    # 1481731.2f
        -0x9594f7c
        -0x691cd4b1
        0x112a6c22
        -0x7ba07c1b
        -0x521b446f
        0x3d0b235b
        0x47c19bf5
    .end array-data
.end method

.method public final onAdImpression()V
    .locals 4

    .line 1
    sget v0, LVa/U0;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/U0;->e:I

    .line 8
    .line 9
    const/16 v0, 0x14

    .line 10
    .line 11
    new-array v0, v0, [I

    .line 12
    .line 13
    fill-array-data v0, :array_0

    .line 14
    .line 15
    .line 16
    const-wide/16 v1, 0x0

    .line 17
    .line 18
    invoke-static {v1, v2}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/lit8 v1, v1, 0x28

    .line 23
    .line 24
    invoke-static {v1, v0}, LVa/U0;->a(I[I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x0

    .line 33
    new-array v1, v1, [Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v2, p0, LVa/U0;->c:LVa/W0;

    .line 36
    .line 37
    iget-object v3, p0, LVa/U0;->b:LVa/Ra;

    .line 38
    .line 39
    invoke-virtual {v2, p0, v3, v0, v1}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, LVa/U0;->a:Lx6/k;

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-virtual {v0}, Lx6/k;->onAdImpression()V

    .line 47
    .line 48
    .line 49
    sget v0, LVa/U0;->e:I

    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x2f

    .line 52
    .line 53
    rem-int/lit16 v0, v0, 0x80

    .line 54
    .line 55
    sput v0, LVa/U0;->f:I

    .line 56
    .line 57
    :cond_0
    return-void

    .line 58
    nop

    .line 59
    :array_0
    .array-data 4
        0x2f793cf2
        -0x3025c56a
        0xe1090f
        -0x5cd7f160
        0x7a706bd3
        0x2ad0ab30
        -0x40ab57ae
        -0x7299c356
        0x6b86d488    # 3.2599942E26f
        0x679d86f3
        -0xb9aec8a
        -0x16ea2ddd
        0x242692c9
        0x3164be15
        0x7925b0e7
        -0xb2c9eae
        0x63d8fc88
        -0x42923441
        -0x67eaa291
        -0x265eb4db
    .end array-data
.end method

.method public final onAdShowedFullScreenContent()V
    .locals 4

    .line 1
    const/16 v0, 0x1c

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    shr-int/lit8 v1, v1, 0x10

    .line 13
    .line 14
    add-int/lit8 v1, v1, 0x35

    .line 15
    .line 16
    invoke-static {v1, v0}, LVa/U0;->a(I[I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x0

    .line 25
    new-array v1, v1, [Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v2, p0, LVa/U0;->c:LVa/W0;

    .line 28
    .line 29
    iget-object v3, p0, LVa/U0;->b:LVa/Ra;

    .line 30
    .line 31
    invoke-virtual {v2, p0, v3, v0, v1}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, LVa/U0;->a:Lx6/k;

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    sget v1, LVa/U0;->f:I

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x71

    .line 41
    .line 42
    rem-int/lit16 v1, v1, 0x80

    .line 43
    .line 44
    sput v1, LVa/U0;->e:I

    .line 45
    .line 46
    invoke-virtual {v0}, Lx6/k;->onAdShowedFullScreenContent()V

    .line 47
    .line 48
    .line 49
    :cond_0
    sget v0, LVa/U0;->f:I

    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x2b

    .line 52
    .line 53
    rem-int/lit16 v0, v0, 0x80

    .line 54
    .line 55
    sput v0, LVa/U0;->e:I

    .line 56
    .line 57
    return-void

    .line 58
    nop

    .line 59
    :array_0
    .array-data 4
        0x2f793cf2
        -0x3025c56a
        0xe1090f
        -0x5cd7f160
        0x7a706bd3
        0x2ad0ab30
        -0x40ab57ae
        -0x7299c356
        0x6b86d488    # 3.2599942E26f
        0x679d86f3
        -0xb9aec8a
        -0x16ea2ddd
        0x242692c9
        0x3164be15
        0x5587c186
        0x62963f6a
        -0x5d02a691
        -0x23b75047
        0x2f793cf2
        -0x3025c56a
        0xe1090f
        -0x5cd7f160
        0x7a706bd3
        0x2ad0ab30
        -0x40ab57ae
        -0x7299c356
        0x7c1f8b60
        -0x539045ee
    .end array-data
.end method
