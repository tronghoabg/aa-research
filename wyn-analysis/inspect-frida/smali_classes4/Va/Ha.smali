.class public final LVa/Ha;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/lang/String;

.field public static final f:[C

.field public static g:I = 0x0

.field public static h:I = 0x1


# instance fields
.field public final a:LVa/Ra;

.field public final b:LVa/z;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0x70

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/Ha;->f:[C

    .line 9
    .line 10
    const/16 v0, 0x9b

    .line 11
    .line 12
    const/16 v1, 0x25

    .line 13
    .line 14
    const/16 v2, 0x2a

    .line 15
    .line 16
    const/16 v3, 0x46

    .line 17
    .line 18
    filled-new-array {v2, v3, v0, v1}, [I

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x0

    .line 23
    const-string v2, "\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001"

    .line 24
    .line 25
    invoke-static {v2, v0, v1}, LVa/Ha;->d(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, LVa/Ha;->e:Ljava/lang/String;

    .line 34
    .line 35
    sget v0, LVa/Ha;->g:I

    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x77

    .line 38
    .line 39
    rem-int/lit16 v0, v0, 0x80

    .line 40
    .line 41
    sput v0, LVa/Ha;->h:I

    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :array_0
    .array-data 2
        0x91s
        0x122s
        0x118s
        0x111s
        0x113s
        0x112s
        0x110s
        0x111s
        0x116s
        0xfbs
        0xfbs
        0x11fs
        0x101s
        0xf8s
        0x112s
        0xf7s
        0xffs
        0x11as
        0x118s
        0x11ds
        0x120s
        0x11bs
        0x113s
        0x112s
        0x31s
        0x63s
        0x4cs
        0x30s
        0x50s
        0x6cs
        0x6bs
        0x6as
        0x64s
        0x6cs
        0x50s
        0x47s
        0x66s
        0x6cs
        0x6es
        0x6fs
        0x71s
        0x57s
        0x75s
        0xfcs
        0xecs
        0xees
        0xees
        0xe5s
        0xffs
        0xe8s
        0xf4s
        0x114s
        0x109s
        0x101s
        0xfes
        0xfes
        0x107s
        0x10es
        0x114s
        0xf4s
        0xe8s
        0xffs
        0x107s
        0x10es
        0x108s
        0xf9s
        0x101s
        0x10cs
        0xf6s
        0xfcs
        0xf9s
        0xf1s
        0xf9s
        0xfes
        0x10bs
        0x10as
        0x103s
        0xe2s
        0xc7s
        0xc3s
        0xc5s
        0xdas
        0xf9s
        0x107s
        0xebs
        0xc8s
        0xe8s
        0x10as
        0xf8s
        0xf9s
        0xees
        0xdds
        0xdbs
        0xf2s
        0xf1s
        0xd6s
        0xees
        0xe9s
        0xd2s
        0xe9s
        0x106s
        0xeds
        0xebs
        0x103s
        0x105s
        0x110s
        0x10fs
        0x10ds
        0xeds
        0xcbs
        0xeas
        0xe8s
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;LVa/z;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LVa/Ha;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, LVa/Ra;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/16 v2, 0x18

    .line 15
    .line 16
    const/16 v3, 0xaf

    .line 17
    .line 18
    filled-new-array {v1, v2, v3, v1}, [I

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const-string v4, "\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000"

    .line 23
    .line 24
    invoke-static {v4, v3, v1}, LVa/Ha;->d(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const/16 v4, 0x11

    .line 33
    .line 34
    filled-new-array {v2, v4, v1, v1}, [I

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const/4 v2, 0x1

    .line 39
    const-string v4, "\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000"

    .line 40
    .line 41
    invoke-static {v4, v1, v2}, LVa/Ha;->d(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-direct {v0, p1, v3, v1}, LVa/Ra;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, LVa/Ha;->a:LVa/Ra;

    .line 53
    .line 54
    iput-object p2, p0, LVa/Ha;->b:LVa/z;

    .line 55
    .line 56
    iput-object p3, p0, LVa/Ha;->c:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance p2, LVa/j;

    .line 63
    .line 64
    const/4 p3, 0x3

    .line 65
    invoke-direct {p2, p3}, LVa/j;-><init>(I)V

    .line 66
    .line 67
    .line 68
    iput-object p0, p2, LVa/j;->b:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {p1, p2}, LVa/G;->Z(LVa/X;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public static synthetic a(LVa/Ha;)LVa/z;
    .locals 2

    .line 1
    sget v0, LVa/Ha;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Ha;->h:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object p0, p0, LVa/Ha;->b:LVa/z;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0xf

    .line 16
    .line 17
    rem-int/lit16 v0, v1, 0x80

    .line 18
    .line 19
    sput v0, LVa/Ha;->g:I

    .line 20
    .line 21
    rem-int/lit8 v1, v1, 0x2

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const/16 v0, 0x39

    .line 26
    .line 27
    div-int/lit8 v0, v0, 0x0

    .line 28
    .line 29
    :cond_0
    return-object p0

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    throw p0
.end method

.method public static d(Ljava/lang/String;[IZ)Ljava/lang/String;
    .locals 12

    .line 1
    const-string v0, "ISO-8859-1"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, [B

    .line 8
    .line 9
    sget-object v0, LVa/Ab;->z:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :try_start_0
    aget v2, p1, v1

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    aget v4, p1, v3

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    aget v6, p1, v5

    .line 20
    .line 21
    const/4 v7, 0x3

    .line 22
    aget v7, p1, v7

    .line 23
    .line 24
    sget-object v8, LVa/Ha;->f:[C

    .line 25
    .line 26
    new-array v9, v4, [C

    .line 27
    .line 28
    invoke-static {v8, v2, v9, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    new-array v2, v4, [C

    .line 34
    .line 35
    sput v1, LVa/Ab;->y:I

    .line 36
    .line 37
    move v8, v1

    .line 38
    :goto_0
    sget v10, LVa/Ab;->y:I

    .line 39
    .line 40
    if-ge v10, v4, :cond_1

    .line 41
    .line 42
    aget-byte v11, p0, v10

    .line 43
    .line 44
    if-ne v11, v3, :cond_0

    .line 45
    .line 46
    aget-char v11, v9, v10

    .line 47
    .line 48
    shl-int/2addr v11, v3

    .line 49
    add-int/2addr v11, v3

    .line 50
    sub-int/2addr v11, v8

    .line 51
    int-to-char v8, v11

    .line 52
    aput-char v8, v2, v10

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto :goto_4

    .line 57
    :cond_0
    aget-char v11, v9, v10

    .line 58
    .line 59
    shl-int/2addr v11, v3

    .line 60
    sub-int/2addr v11, v8

    .line 61
    int-to-char v8, v11

    .line 62
    aput-char v8, v2, v10

    .line 63
    .line 64
    :goto_1
    aget-char v8, v2, v10

    .line 65
    .line 66
    add-int/lit8 v10, v10, 0x1

    .line 67
    .line 68
    sput v10, LVa/Ab;->y:I

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move-object v9, v2

    .line 72
    :cond_2
    if-lez v7, :cond_3

    .line 73
    .line 74
    new-array p0, v4, [C

    .line 75
    .line 76
    invoke-static {v9, v1, p0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 77
    .line 78
    .line 79
    sub-int v2, v4, v7

    .line 80
    .line 81
    invoke-static {p0, v1, v9, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 82
    .line 83
    .line 84
    invoke-static {p0, v7, v9, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 85
    .line 86
    .line 87
    :cond_3
    if-eqz p2, :cond_5

    .line 88
    .line 89
    new-array p0, v4, [C

    .line 90
    .line 91
    sput v1, LVa/Ab;->y:I

    .line 92
    .line 93
    :goto_2
    sget p2, LVa/Ab;->y:I

    .line 94
    .line 95
    if-ge p2, v4, :cond_4

    .line 96
    .line 97
    sub-int v2, v4, p2

    .line 98
    .line 99
    sub-int/2addr v2, v3

    .line 100
    aget-char v2, v9, v2

    .line 101
    .line 102
    aput-char v2, p0, p2

    .line 103
    .line 104
    add-int/lit8 p2, p2, 0x1

    .line 105
    .line 106
    sput p2, LVa/Ab;->y:I

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    move-object v9, p0

    .line 110
    :cond_5
    if-lez v6, :cond_6

    .line 111
    .line 112
    sput v1, LVa/Ab;->y:I

    .line 113
    .line 114
    :goto_3
    sget p0, LVa/Ab;->y:I

    .line 115
    .line 116
    if-ge p0, v4, :cond_6

    .line 117
    .line 118
    aget-char p2, v9, p0

    .line 119
    .line 120
    aget v1, p1, v5

    .line 121
    .line 122
    sub-int/2addr p2, v1

    .line 123
    int-to-char p2, p2

    .line 124
    aput-char p2, v9, p0

    .line 125
    .line 126
    add-int/lit8 p0, p0, 0x1

    .line 127
    .line 128
    sput p0, LVa/Ab;->y:I

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_6
    new-instance p0, Ljava/lang/String;

    .line 132
    .line 133
    invoke-direct {p0, v9}, Ljava/lang/String;-><init>([C)V

    .line 134
    .line 135
    .line 136
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    return-object p0

    .line 138
    :goto_4
    monitor-exit v0

    .line 139
    throw p0
.end method


# virtual methods
.method public final b(LVa/Pa;LVa/ya;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, LVa/Pa;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    monitor-enter p0

    .line 11
    :try_start_0
    sget v2, LVa/Ha;->h:I

    .line 12
    .line 13
    iget-object v3, p0, LVa/Ha;->c:Ljava/lang/String;

    .line 14
    .line 15
    add-int/lit8 v2, v2, 0x11

    .line 16
    .line 17
    const/16 v4, 0x80

    .line 18
    .line 19
    rem-int/2addr v2, v4

    .line 20
    sput v2, LVa/Ha;->g:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v2, "\u0001"

    .line 27
    .line 28
    const/16 v3, 0x29

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    const/4 v6, 0x0

    .line 32
    filled-new-array {v3, v5, v4, v6}, [I

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v2, v3, v5}, LVa/Ha;->d(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    invoke-virtual {p1}, LVa/Pa;->d()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    sget v1, LVa/G;->F:I

    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x75

    .line 68
    .line 69
    rem-int/2addr v1, v4

    .line 70
    sput v1, LVa/G;->E:I

    .line 71
    .line 72
    invoke-virtual {v0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v6}, Landroid/graphics/Color;->red(I)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    rsub-int/lit8 v1, v1, 0x3

    .line 81
    .line 82
    const-string v2, "\u6d71\u1acb\u82c6\uae6f"

    .line 83
    .line 84
    invoke-static {v1, v2}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v0, v1, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    sget v1, LVa/G;->E:I

    .line 97
    .line 98
    add-int/lit8 v1, v1, 0x65

    .line 99
    .line 100
    rem-int/lit16 v2, v1, 0x80

    .line 101
    .line 102
    sput v2, LVa/G;->F:I

    .line 103
    .line 104
    rem-int/lit8 v1, v1, 0x2

    .line 105
    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    if-eqz v0, :cond_0

    .line 109
    .line 110
    sget v0, LVa/Ha;->h:I

    .line 111
    .line 112
    add-int/lit8 v0, v0, 0x3f

    .line 113
    .line 114
    rem-int/2addr v0, v4

    .line 115
    sput v0, LVa/Ha;->g:I

    .line 116
    .line 117
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, LVa/G;->R()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-nez v0, :cond_1

    .line 126
    .line 127
    sget v0, LVa/Ha;->h:I

    .line 128
    .line 129
    add-int/lit8 v0, v0, 0x31

    .line 130
    .line 131
    rem-int/2addr v0, v4

    .line 132
    sput v0, LVa/Ha;->g:I

    .line 133
    .line 134
    iget-object v0, p0, LVa/Ha;->a:LVa/Ra;

    .line 135
    .line 136
    invoke-virtual {v0, v11}, LVa/Ra;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-nez v0, :cond_0

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_0
    move-object v8, p0

    .line 144
    goto :goto_1

    .line 145
    :cond_1
    :goto_0
    new-instance v7, LVa/Ga;

    .line 146
    .line 147
    move-object v8, p0

    .line 148
    move-object v10, p1

    .line 149
    move-object v12, p2

    .line 150
    invoke-direct/range {v7 .. v12}, LVa/Ga;-><init>(LVa/Ha;Ljava/lang/String;LVa/Pa;Ljava/lang/String;LVa/ya;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v7}, LVa/pb;->I(LVa/Ba;)V

    .line 154
    .line 155
    .line 156
    sget p1, LVa/Ha;->g:I

    .line 157
    .line 158
    add-int/lit8 p1, p1, 0xf

    .line 159
    .line 160
    rem-int/2addr p1, v4

    .line 161
    sput p1, LVa/Ha;->h:I

    .line 162
    .line 163
    :goto_1
    return-void

    .line 164
    :cond_2
    move-object v8, p0

    .line 165
    const/4 p1, 0x0

    .line 166
    throw p1

    .line 167
    :catchall_0
    move-exception v0

    .line 168
    move-object v8, p0

    .line 169
    :goto_2
    move-object p1, v0

    .line 170
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 171
    throw p1

    .line 172
    :catchall_1
    move-exception v0

    .line 173
    goto :goto_2
.end method

.method public final c(LVa/Pa;LVa/ya;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget v0, LVa/Pa;->f:I

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x77

    .line 7
    .line 8
    rem-int/lit16 v1, v0, 0x80

    .line 9
    .line 10
    sput v1, LVa/Pa;->g:I

    .line 11
    .line 12
    rem-int/lit8 v0, v0, 0x2

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    iget-object v0, p1, LVa/Pa;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_3

    .line 24
    .line 25
    invoke-virtual {p1}, LVa/Pa;->g()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_0
    invoke-virtual {p1}, LVa/Pa;->d()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    monitor-enter p0

    .line 41
    :try_start_0
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, LVa/G;->O()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    iget-object v1, p0, LVa/Ha;->d:Ljava/util/ArrayList;

    .line 52
    .line 53
    new-instance v2, LVa/Da;

    .line 54
    .line 55
    const/16 v3, 0x12

    .line 56
    .line 57
    invoke-direct {v2, v3}, LVa/Da;-><init>(I)V

    .line 58
    .line 59
    .line 60
    iput-object p0, v2, LVa/Da;->f:Ljava/lang/Object;

    .line 61
    .line 62
    iput-object p1, v2, LVa/Da;->d:Ljava/lang/Object;

    .line 63
    .line 64
    iput-object p2, v2, LVa/Da;->e:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-exception p1

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    const/4 v1, 0x1

    .line 74
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    invoke-virtual {p0, p1, p2}, LVa/Ha;->b(LVa/Pa;LVa/ya;)V

    .line 78
    .line 79
    .line 80
    :cond_2
    iget-object p1, p0, LVa/Ha;->a:LVa/Ra;

    .line 81
    .line 82
    invoke-virtual {p1, v0}, LVa/Ra;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    return-object p1

    .line 87
    :goto_1
    monitor-exit p0

    .line 88
    throw p1

    .line 89
    :cond_3
    :goto_2
    return-object v1

    .line 90
    :cond_4
    throw v1
.end method
