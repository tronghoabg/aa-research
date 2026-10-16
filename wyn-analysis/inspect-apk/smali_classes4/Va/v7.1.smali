.class public final LVa/v7;
.super LVa/eb;
.source "SourceFile"


# static fields
.field public static final c:[I

.field public static final d:[B

.field public static e:I = 0x0

.field public static f:I = 0x1


# instance fields
.field public synthetic a:Ljava/util/ArrayList;

.field public synthetic b:LVa/y7;


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
    sput-object v0, LVa/v7;->c:[I

    .line 9
    .line 10
    const/16 v0, 0x50

    .line 11
    .line 12
    new-array v0, v0, [B

    .line 13
    .line 14
    fill-array-data v0, :array_1

    .line 15
    .line 16
    .line 17
    sput-object v0, LVa/v7;->d:[B

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :array_0
    .array-data 4
        -0x574af164
        -0x76b7d2b3
        -0x67da8fc
        -0x336d8e73    # -7.67786E7f
        0x2aec294c
        0x679729cb
        -0x254bb948
        -0x51a5a931
        -0x50330b84
        -0x2dbe4862
        -0x3ab06ccf
        0x1eeed234
        -0x4625f5d0
        -0x4f204585
        0x66cf96d2
        0x6f6a3034
        -0x183b1ca6
        -0x2081bace
    .end array-data

    .line 22
    .line 23
    .line 24
    :array_1
    .array-data 1
        -0x66t
        -0x70t
        -0x7et
        -0x5ct
        -0x73t
        -0x7ct
        -0x40t
        0x5bt
        -0x6at
        -0x64t
        -0x7ct
        -0x62t
        -0x7at
        -0x5et
        -0x4dt
        0x64t
        -0x70t
        -0x66t
        -0x33t
        -0x3dt
        -0x32t
        -0x31t
        -0x37t
        -0x11t
        -0x58t
        -0x2dt
        -0x27t
        -0x3ft
        -0x25t
        -0x3dt
        -0x21t
        -0x10t
        -0x5ft
        -0x33t
        -0x5ct
        -0x15t
        0xdt
        -0x19t
        0x1bt
        -0x18t
        -0x4t
        -0x11t
        0x7t
        -0x19t
        -0x5t
        -0x1t
        0x1ft
        -0x22t
        -0x17t
        0xft
        0x8t
        -0x2ct
        -0x1t
        0x5t
        -0x13t
        0x7t
        -0x11t
        0xbt
        0x1ct
        -0x33t
        -0x7t
        -0x64t
        0x7ct
        0x69t
        -0x79t
        0x7at
        0x7bt
        0x7et
        -0x75t
        -0x62t
        0x48t
        -0x7et
        -0x78t
        0x70t
        -0x76t
        0x72t
        -0x72t
        -0x61t
        0x50t
        0x7ct
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
    sget-object v4, LVa/v7;->c:[I

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

.method public static h(IIBSI)Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, LVa/pb;->J:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x77

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-ne p1, v2, :cond_0

    .line 15
    .line 16
    move v3, v4

    .line 17
    :cond_0
    if-eqz v3, :cond_1

    .line 18
    .line 19
    sget-object p1, LVa/v7;->d:[B

    .line 20
    .line 21
    const v2, 0x1621b29b

    .line 22
    .line 23
    .line 24
    add-int/2addr v2, p4

    .line 25
    aget-byte p1, p1, v2

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x77

    .line 28
    .line 29
    int-to-byte p1, p1

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    :goto_0
    if-lez p1, :cond_2

    .line 34
    .line 35
    add-int/2addr p4, p1

    .line 36
    const v2, -0x1621b299

    .line 37
    .line 38
    .line 39
    sub-int/2addr p4, v2

    .line 40
    add-int/2addr p4, v3

    .line 41
    sput p4, LVa/pb;->F:I

    .line 42
    .line 43
    sput-byte p2, LVa/pb;->G:B

    .line 44
    .line 45
    const p2, -0x667980f6

    .line 46
    .line 47
    .line 48
    add-int/2addr p0, p2

    .line 49
    int-to-char p0, p0

    .line 50
    sput-char p0, LVa/pb;->H:C

    .line 51
    .line 52
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    sget-char p0, LVa/pb;->H:C

    .line 56
    .line 57
    sput-char p0, LVa/pb;->I:C

    .line 58
    .line 59
    sput v4, LVa/pb;->E:I

    .line 60
    .line 61
    :goto_1
    sget p0, LVa/pb;->E:I

    .line 62
    .line 63
    if-ge p0, p1, :cond_2

    .line 64
    .line 65
    sget-object p0, LVa/v7;->d:[B

    .line 66
    .line 67
    sget p2, LVa/pb;->F:I

    .line 68
    .line 69
    add-int/lit8 p4, p2, -0x1

    .line 70
    .line 71
    sput p4, LVa/pb;->F:I

    .line 72
    .line 73
    aget-byte p0, p0, p2

    .line 74
    .line 75
    sget-char p2, LVa/pb;->I:C

    .line 76
    .line 77
    add-int/2addr p0, p3

    .line 78
    int-to-byte p0, p0

    .line 79
    sget-byte p4, LVa/pb;->G:B

    .line 80
    .line 81
    xor-int/2addr p0, p4

    .line 82
    add-int/2addr p2, p0

    .line 83
    int-to-char p0, p2

    .line 84
    sput-char p0, LVa/pb;->H:C

    .line 85
    .line 86
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    sget-char p0, LVa/pb;->H:C

    .line 90
    .line 91
    sput-char p0, LVa/pb;->I:C

    .line 92
    .line 93
    sget p0, LVa/pb;->E:I

    .line 94
    .line 95
    add-int/2addr p0, v4

    .line 96
    sput p0, LVa/pb;->E:I

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    return-object p0

    .line 105
    :goto_2
    monitor-exit v0

    .line 106
    throw p0
.end method


# virtual methods
.method public final b(Landroid/app/Activity;)V
    .locals 3

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    sget v1, LVa/v7;->f:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x57

    .line 6
    .line 7
    rem-int/lit16 v2, v1, 0x80

    .line 8
    .line 9
    sput v2, LVa/v7;->e:I

    .line 10
    .line 11
    rem-int/lit8 v1, v1, 0x2

    .line 12
    .line 13
    new-array v0, v0, [I

    .line 14
    .line 15
    fill-array-data v0, :array_0

    .line 16
    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    int-to-byte v1, v1

    .line 25
    const/16 v2, 0x10

    .line 26
    .line 27
    shl-int v1, v2, v1

    .line 28
    .line 29
    invoke-static {v1, v0}, LVa/v7;->a(I[I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p0, p1, v0}, LVa/v7;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    int-to-byte v1, v1

    .line 46
    rsub-int/lit8 v1, v1, 0x18

    .line 47
    .line 48
    invoke-static {v1, v0}, LVa/v7;->a(I[I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    goto :goto_0

    .line 53
    :goto_1
    sget p1, LVa/v7;->e:I

    .line 54
    .line 55
    add-int/lit8 p1, p1, 0xf

    .line 56
    .line 57
    rem-int/lit16 v0, p1, 0x80

    .line 58
    .line 59
    sput v0, LVa/v7;->f:I

    .line 60
    .line 61
    rem-int/lit8 p1, p1, 0x2

    .line 62
    .line 63
    if-nez p1, :cond_1

    .line 64
    .line 65
    const/16 p1, 0x5d

    .line 66
    .line 67
    div-int/lit8 p1, p1, 0x0

    .line 68
    .line 69
    :cond_1
    return-void

    .line 70
    nop

    .line 71
    :array_0
    .array-data 4
        0x74d4f853
        -0x491a9f7c
        -0x6e308053
        0x5efabd4f
        0x7e3e046f
        -0x6735630c
        -0x5aabe254
        0x6ca53d69
        0x62d18c4
        -0x2ee5d890
        0x2d9a58ca
        0x5a14c229
        0x524f31bc
        0x5f3d900
    .end array-data
.end method

.method public final c(Ljava/lang/String;Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    sget v2, LVa/v7;->f:I

    .line 4
    .line 5
    add-int/lit8 v2, v2, 0x57

    .line 6
    .line 7
    rem-int/lit16 v3, v2, 0x80

    .line 8
    .line 9
    sput v3, LVa/v7;->e:I

    .line 10
    .line 11
    rem-int/2addr v2, v1

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    new-array v1, v1, [Ljava/lang/Object;

    .line 16
    .line 17
    aput-object p2, v1, v0

    .line 18
    .line 19
    aput-object p3, v1, v0

    .line 20
    .line 21
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    :goto_0
    invoke-virtual {p0, p1, p2}, LVa/v7;->g(Ljava/lang/String;Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    new-array v1, v1, [Ljava/lang/Object;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    aput-object p2, v1, v2

    .line 33
    .line 34
    aput-object p3, v1, v0

    .line 35
    .line 36
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    goto :goto_0
.end method

.method public final d(Landroid/app/Activity;)V
    .locals 2

    .line 1
    sget v0, LVa/v7;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x33

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/v7;->e:I

    .line 8
    .line 9
    const/16 v0, 0xc

    .line 10
    .line 11
    new-array v0, v0, [I

    .line 12
    .line 13
    fill-array-data v0, :array_0

    .line 14
    .line 15
    .line 16
    const-string v1, ""

    .line 17
    .line 18
    invoke-static {v1}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    rsub-int/lit8 v1, v1, 0x14

    .line 23
    .line 24
    invoke-static {v1, v0}, LVa/v7;->a(I[I)Ljava/lang/String;

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
    invoke-virtual {p0, p1, v0}, LVa/v7;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sget p1, LVa/v7;->e:I

    .line 36
    .line 37
    add-int/lit8 p1, p1, 0x9

    .line 38
    .line 39
    rem-int/lit16 v0, p1, 0x80

    .line 40
    .line 41
    sput v0, LVa/v7;->f:I

    .line 42
    .line 43
    rem-int/lit8 p1, p1, 0x2

    .line 44
    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    const/4 p1, 0x0

    .line 49
    throw p1

    .line 50
    nop

    .line 51
    :array_0
    .array-data 4
        0x74d4f853
        -0x491a9f7c
        -0x11f773a2
        0x3546a382
        -0x4b071d0
        0x19fa23eb
        0x10da2544
        0x37a51f77
        0x2d9a58ca
        0x5a14c229
        0x524f31bc
        0x5f3d900
    .end array-data
.end method

.method public final e(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget v0, LVa/v7;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/v7;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p2, p1}, LVa/v7;->g(Ljava/lang/String;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/16 p1, 0x22

    .line 21
    .line 22
    div-int/lit8 p1, p1, 0x0

    .line 23
    .line 24
    :cond_0
    sget p1, LVa/v7;->f:I

    .line 25
    .line 26
    add-int/lit8 p1, p1, 0x39

    .line 27
    .line 28
    rem-int/lit16 p1, p1, 0x80

    .line 29
    .line 30
    sput p1, LVa/v7;->e:I

    .line 31
    .line 32
    return-void
.end method

.method public final f(Ljava/lang/String;Ljava/util/List;Z)V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    new-array v1, v1, [I

    .line 9
    .line 10
    fill-array-data v1, :array_0

    .line 11
    .line 12
    .line 13
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    cmp-long v2, v2, v4

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x11

    .line 22
    .line 23
    invoke-static {v2, v1}, LVa/v7;->a(I[I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object v0, p0, LVa/v7;->b:LVa/y7;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-static {v0, p1, p3, v1, p2}, LVa/y7;->s(LVa/y7;Ljava/lang/String;ZZLjava/util/List;)V

    .line 45
    .line 46
    .line 47
    sget p1, LVa/v7;->e:I

    .line 48
    .line 49
    add-int/lit8 p1, p1, 0x5

    .line 50
    .line 51
    rem-int/lit16 p1, p1, 0x80

    .line 52
    .line 53
    sput p1, LVa/v7;->f:I

    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :array_0
    .array-data 4
        0x38ce45b2
        -0x3dbeb58c
        0x70e326d3
        -0x6fe8fe12
        -0x18c90955
        0x6e2618cd
        -0x4742e1e7
        -0x313efcb6
        -0x2baa8375
        0xf25d168
    .end array-data
.end method

.method public final g(Ljava/lang/String;Ljava/util/List;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, LVa/v7;->f(Ljava/lang/String;Ljava/util/List;Z)V

    .line 3
    .line 4
    .line 5
    new-instance v0, LVa/Da;

    .line 6
    .line 7
    const/16 v1, 0xb

    .line 8
    .line 9
    invoke-direct {v0, v1}, LVa/Da;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object p0, v0, LVa/Da;->f:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p1, v0, LVa/Da;->d:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p2, v0, LVa/Da;->e:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-static {v0}, LVa/Cb;->j(LVa/Ba;)V

    .line 19
    .line 20
    .line 21
    sget p1, LVa/v7;->e:I

    .line 22
    .line 23
    add-int/lit8 p1, p1, 0x41

    .line 24
    .line 25
    rem-int/lit16 p2, p1, 0x80

    .line 26
    .line 27
    sput p2, LVa/v7;->f:I

    .line 28
    .line 29
    rem-int/lit8 p1, p1, 0x2

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    const/4 p1, 0x0

    .line 35
    throw p1
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    iget-object v0, p0, LVa/v7;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {p1, v0}, LVa/y7;->k(Landroid/app/Activity;Ljava/util/List;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget v0, LVa/v7;->e:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x21

    .line 15
    .line 16
    rem-int/lit16 v0, v0, 0x80

    .line 17
    .line 18
    sput v0, LVa/v7;->f:I

    .line 19
    .line 20
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    shr-int/lit8 v0, v0, 0x10

    .line 25
    .line 26
    rsub-int/lit8 v0, v0, 0x6f

    .line 27
    .line 28
    int-to-short v0, v0

    .line 29
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    shr-int/lit8 v1, v1, 0x18

    .line 34
    .line 35
    const v3, 0x66798165

    .line 36
    .line 37
    .line 38
    add-int/2addr v1, v3

    .line 39
    const-string v3, ""

    .line 40
    .line 41
    invoke-static {v3}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    rsub-int/lit8 v3, v3, -0x79

    .line 46
    .line 47
    invoke-static {v2}, Landroid/os/Process;->getThreadPriority(I)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    add-int/lit8 v4, v4, 0x14

    .line 52
    .line 53
    shr-int/lit8 v4, v4, 0x6

    .line 54
    .line 55
    const v5, -0x1621b29b

    .line 56
    .line 57
    .line 58
    sub-int/2addr v5, v4

    .line 59
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    shr-int/lit8 v4, v4, 0x10

    .line 64
    .line 65
    int-to-byte v4, v4

    .line 66
    invoke-static {v1, v3, v4, v0, v5}, LVa/v7;->h(IIBSI)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p0, v0, p1, p2}, LVa/v7;->c(Ljava/lang/String;Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    sget p1, LVa/v7;->e:I

    .line 78
    .line 79
    add-int/lit8 p1, p1, 0x39

    .line 80
    .line 81
    rem-int/lit16 p2, p1, 0x80

    .line 82
    .line 83
    sput p2, LVa/v7;->f:I

    .line 84
    .line 85
    rem-int/lit8 p1, p1, 0x2

    .line 86
    .line 87
    if-nez p1, :cond_1

    .line 88
    .line 89
    const/16 p1, 0x25

    .line 90
    .line 91
    div-int/2addr p1, v2

    .line 92
    :cond_1
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 5

    .line 1
    sget v0, LVa/v7;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x15

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/v7;->f:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/v7;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-static {p1, v0}, LVa/y7;->k(Landroid/app/Activity;Ljava/util/List;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget v0, LVa/v7;->e:I

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x77

    .line 20
    .line 21
    rem-int/lit16 v0, v0, 0x80

    .line 22
    .line 23
    sput v0, LVa/v7;->f:I

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    rsub-int/lit8 v1, v1, -0x7d

    .line 31
    .line 32
    int-to-short v1, v1

    .line 33
    const-string v2, ""

    .line 34
    .line 35
    invoke-static {v2, v2, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const v4, 0x66798165

    .line 40
    .line 41
    .line 42
    add-int/2addr v3, v4

    .line 43
    invoke-static {v2}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    add-int/lit8 v2, v2, -0x78

    .line 48
    .line 49
    const v4, -0x1621b25e

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    sub-int/2addr v4, v0

    .line 57
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    shr-int/lit8 v0, v0, 0x10

    .line 62
    .line 63
    int-to-byte v0, v0

    .line 64
    invoke-static {v3, v2, v0, v1, v4}, LVa/v7;->h(IIBSI)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p0, p1, v0}, LVa/v7;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_0
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 5

    .line 1
    sget v0, LVa/v7;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/v7;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/v7;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {p1, v1}, LVa/y7;->k(Landroid/app/Activity;Ljava/util/List;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v1, 0xd

    .line 20
    .line 21
    div-int/lit8 v1, v1, 0x0

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {p1, v1}, LVa/y7;->k(Landroid/app/Activity;Ljava/util/List;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    :cond_1
    const/16 v0, 0x8

    .line 33
    .line 34
    new-array v0, v0, [I

    .line 35
    .line 36
    fill-array-data v0, :array_0

    .line 37
    .line 38
    .line 39
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    const-wide/16 v3, 0x0

    .line 44
    .line 45
    cmp-long v1, v1, v3

    .line 46
    .line 47
    add-int/lit8 v1, v1, 0xf

    .line 48
    .line 49
    invoke-static {v1, v0}, LVa/v7;->a(I[I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0, p1, v0}, LVa/v7;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    sget p1, LVa/v7;->f:I

    .line 61
    .line 62
    add-int/lit8 p1, p1, 0x55

    .line 63
    .line 64
    rem-int/lit16 p1, p1, 0x80

    .line 65
    .line 66
    sput p1, LVa/v7;->e:I

    .line 67
    .line 68
    :cond_2
    :goto_0
    return-void

    .line 69
    :array_0
    .array-data 4
        -0x5be8d27
        0x3b51201d
        -0x6f8efea7
        -0x1b46565f
        -0x2908b3fa
        -0x1461ac90
        -0x58d70fc8
        0x3b9c059f
    .end array-data
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    .line 1
    sget v0, LVa/v7;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x29

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/v7;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/v7;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {p1, v1}, LVa/y7;->k(Landroid/app/Activity;Ljava/util/List;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v1, 0x35

    .line 20
    .line 21
    div-int/lit8 v1, v1, 0x0

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {p1, v1}, LVa/y7;->k(Landroid/app/Activity;Ljava/util/List;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    :goto_0
    const/16 v0, 0xa

    .line 33
    .line 34
    new-array v0, v0, [I

    .line 35
    .line 36
    fill-array-data v0, :array_0

    .line 37
    .line 38
    .line 39
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    shr-int/lit8 v1, v1, 0x10

    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x11

    .line 46
    .line 47
    invoke-static {v1, v0}, LVa/v7;->a(I[I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p0, p1, v0}, LVa/v7;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    sget p1, LVa/v7;->f:I

    .line 59
    .line 60
    add-int/lit8 p1, p1, 0x43

    .line 61
    .line 62
    rem-int/lit16 p1, p1, 0x80

    .line 63
    .line 64
    sput p1, LVa/v7;->e:I

    .line 65
    .line 66
    return-void

    .line 67
    :array_0
    .array-data 4
        -0x5be8d27
        0x3b51201d
        -0x6f8efea7
        -0x1b46565f
        -0x211d625d
        -0x286f3673
        -0x519c01ed
        -0x4d7e2d5f
        0x524f31bc
        0x5f3d900
    .end array-data
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    iget-object v0, p0, LVa/v7;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {p1, v0}, LVa/y7;->k(Landroid/app/Activity;Ljava/util/List;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget v0, LVa/v7;->f:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    rem-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    sput v0, LVa/v7;->e:I

    .line 16
    .line 17
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    shr-int/lit8 v0, v0, 0x10

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x6

    .line 24
    .line 25
    int-to-short v0, v0

    .line 26
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    const-wide/16 v3, -0x1

    .line 31
    .line 32
    cmp-long v1, v1, v3

    .line 33
    .line 34
    const v2, 0x66798166

    .line 35
    .line 36
    .line 37
    sub-int/2addr v2, v1

    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    rsub-int/lit8 v1, v1, -0x78

    .line 44
    .line 45
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    shr-int/lit8 v3, v3, 0x10

    .line 50
    .line 51
    const v4, -0x1621b279

    .line 52
    .line 53
    .line 54
    sub-int/2addr v4, v3

    .line 55
    const-wide/16 v5, 0x0

    .line 56
    .line 57
    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    rsub-int/lit8 v3, v3, -0x1

    .line 62
    .line 63
    int-to-byte v3, v3

    .line 64
    invoke-static {v2, v1, v3, v0, v4}, LVa/v7;->h(IIBSI)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p0, v0, p1, p2}, LVa/v7;->c(Ljava/lang/String;Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 73
    .line 74
    .line 75
    :cond_0
    sget p1, LVa/v7;->f:I

    .line 76
    .line 77
    add-int/lit8 p1, p1, 0x6d

    .line 78
    .line 79
    rem-int/lit16 p1, p1, 0x80

    .line 80
    .line 81
    sput p1, LVa/v7;->e:I

    .line 82
    .line 83
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 3

    .line 1
    sget v0, LVa/v7;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x45

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/v7;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/v7;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    invoke-static {p1, v1}, LVa/y7;->k(Landroid/app/Activity;Ljava/util/List;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    sget v0, LVa/v7;->f:I

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x4b

    .line 25
    .line 26
    rem-int/lit16 v0, v0, 0x80

    .line 27
    .line 28
    sput v0, LVa/v7;->e:I

    .line 29
    .line 30
    const/16 v0, 0xa

    .line 31
    .line 32
    new-array v0, v0, [I

    .line 33
    .line 34
    fill-array-data v0, :array_0

    .line 35
    .line 36
    .line 37
    const-string v2, ""

    .line 38
    .line 39
    invoke-static {v2, v1, v1}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    add-int/lit8 v2, v2, 0x11

    .line 44
    .line 45
    invoke-static {v2, v0}, LVa/v7;->a(I[I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p0, p1, v0}, LVa/v7;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    sget p1, LVa/v7;->e:I

    .line 57
    .line 58
    add-int/lit8 p1, p1, 0x53

    .line 59
    .line 60
    rem-int/lit16 v0, p1, 0x80

    .line 61
    .line 62
    sput v0, LVa/v7;->f:I

    .line 63
    .line 64
    rem-int/lit8 p1, p1, 0x2

    .line 65
    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    const/16 p1, 0x41

    .line 69
    .line 70
    div-int/2addr p1, v1

    .line 71
    :cond_1
    return-void

    .line 72
    :cond_2
    invoke-static {p1, v1}, LVa/y7;->k(Landroid/app/Activity;Ljava/util/List;)Z

    .line 73
    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    throw p1

    .line 77
    :array_0
    .array-data 4
        -0x5be8d27
        0x3b51201d
        -0x6f8efea7
        -0x1b46565f
        -0x63b5bac2
        -0x2132bd27
        -0x64addc6e
        -0x1a3ac6d2
        0x524f31bc
        0x5f3d900
    .end array-data
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 8

    .line 1
    sget v0, LVa/v7;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x33

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/v7;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/v7;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {p1, v1}, LVa/y7;->k(Landroid/app/Activity;Ljava/util/List;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x5

    .line 21
    div-int/2addr v1, v2

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {p1, v1}, LVa/y7;->k(Landroid/app/Activity;Ljava/util/List;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    :goto_0
    const-wide/16 v0, 0x0

    .line 32
    .line 33
    invoke-static {v0, v1}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    rsub-int/lit8 v3, v3, 0x32

    .line 38
    .line 39
    int-to-short v3, v3

    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-static {v4, v4}, Landroid/graphics/PointF;->length(FF)F

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    cmpl-float v4, v5, v4

    .line 46
    .line 47
    const v5, 0x66798165

    .line 48
    .line 49
    .line 50
    sub-int/2addr v5, v4

    .line 51
    const v4, -0x1000078

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    sub-int/2addr v4, v6

    .line 59
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 60
    .line 61
    .line 62
    move-result-wide v6

    .line 63
    cmp-long v0, v6, v0

    .line 64
    .line 65
    const v1, -0x1621b28b

    .line 66
    .line 67
    .line 68
    add-int/2addr v0, v1

    .line 69
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    int-to-byte v1, v1

    .line 74
    invoke-static {v5, v4, v1, v3, v0}, LVa/v7;->h(IIBSI)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p0, p1, v0}, LVa/v7;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    sget p1, LVa/v7;->f:I

    .line 86
    .line 87
    add-int/lit8 p1, p1, 0x15

    .line 88
    .line 89
    rem-int/lit16 p1, p1, 0x80

    .line 90
    .line 91
    sput p1, LVa/v7;->e:I

    .line 92
    .line 93
    :cond_1
    return-void
.end method
