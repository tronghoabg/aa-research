.class public final LVa/K9;
.super LVa/m9;
.source "SourceFile"


# static fields
.field public static h:I


# direct methods
.method public static g(ILjava/lang/String;)Ljava/lang/String;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->F:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    array-length v1, p1

    .line 11
    new-array v1, v1, [C

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    sput v2, LVa/Ab;->E:I

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    new-array v3, v3, [C

    .line 18
    .line 19
    :goto_0
    sget v4, LVa/Ab;->E:I

    .line 20
    .line 21
    array-length v5, p1

    .line 22
    if-ge v4, v5, :cond_1

    .line 23
    .line 24
    aget-char v5, p1, v4

    .line 25
    .line 26
    aput-char v5, v3, v2

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    aget-char v4, p1, v4

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    aput-char v4, v3, v5

    .line 34
    .line 35
    const v4, 0xe370

    .line 36
    .line 37
    .line 38
    move v6, v2

    .line 39
    :goto_1
    const/16 v7, 0x10

    .line 40
    .line 41
    if-ge v6, v7, :cond_0

    .line 42
    .line 43
    aget-char v7, v3, v5

    .line 44
    .line 45
    aget-char v8, v3, v2

    .line 46
    .line 47
    add-int v9, v8, v4

    .line 48
    .line 49
    shl-int/lit8 v10, v8, 0x4

    .line 50
    .line 51
    const v11, 0xab77

    .line 52
    .line 53
    .line 54
    add-int/2addr v10, v11

    .line 55
    xor-int/2addr v9, v10

    .line 56
    ushr-int/lit8 v10, v8, 0x5

    .line 57
    .line 58
    add-int/lit16 v10, v10, 0x324f

    .line 59
    .line 60
    xor-int/2addr v9, v10

    .line 61
    sub-int/2addr v7, v9

    .line 62
    int-to-char v7, v7

    .line 63
    aput-char v7, v3, v5

    .line 64
    .line 65
    add-int v9, v7, v4

    .line 66
    .line 67
    shl-int/lit8 v10, v7, 0x4

    .line 68
    .line 69
    add-int/lit16 v10, v10, 0x2c50

    .line 70
    .line 71
    xor-int/2addr v9, v10

    .line 72
    ushr-int/lit8 v7, v7, 0x5

    .line 73
    .line 74
    const v10, 0xbb37

    .line 75
    .line 76
    .line 77
    add-int/2addr v7, v10

    .line 78
    xor-int/2addr v7, v9

    .line 79
    sub-int/2addr v8, v7

    .line 80
    int-to-char v7, v8

    .line 81
    aput-char v7, v3, v2

    .line 82
    .line 83
    const v7, 0x9e37

    .line 84
    .line 85
    .line 86
    sub-int/2addr v4, v7

    .line 87
    add-int/lit8 v6, v6, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catchall_0
    move-exception p0

    .line 91
    goto :goto_2

    .line 92
    :cond_0
    sget v4, LVa/Ab;->E:I

    .line 93
    .line 94
    aget-char v6, v3, v2

    .line 95
    .line 96
    aput-char v6, v1, v4

    .line 97
    .line 98
    add-int/lit8 v6, v4, 0x1

    .line 99
    .line 100
    aget-char v5, v3, v5

    .line 101
    .line 102
    aput-char v5, v1, v6

    .line 103
    .line 104
    add-int/lit8 v4, v4, 0x2

    .line 105
    .line 106
    sput v4, LVa/Ab;->E:I

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    new-instance p1, Ljava/lang/String;

    .line 110
    .line 111
    invoke-direct {p1, v1, v2, p0}, Ljava/lang/String;-><init>([CII)V

    .line 112
    .line 113
    .line 114
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    return-object p1

    .line 116
    :goto_2
    monitor-exit v0

    .line 117
    throw p0
.end method


# virtual methods
.method public final c()LVa/Z0;
    .locals 3

    .line 1
    new-instance v0, LVa/n6;

    .line 2
    .line 3
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    int-to-byte v1, v1

    .line 8
    add-int/lit8 v1, v1, 0x7

    .line 9
    .line 10
    const-string v2, "\u17bd\uc0bf\u3856\u4d41\u1662\u0d62"

    .line 11
    .line 12
    invoke-static {v1, v2}, LVa/K9;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, v1}, LVa/Z0;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget v1, LVa/K9;->h:I

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x3f

    .line 26
    .line 27
    rem-int/lit8 v1, v1, 0x2

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    const/16 v1, 0x5f

    .line 32
    .line 33
    div-int/lit8 v1, v1, 0x0

    .line 34
    .line 35
    :cond_0
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v0, v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    rsub-int/lit8 v0, v0, 0x21

    .line 9
    .line 10
    const-string v1, "\uf8f1\u0509\u6340\udc4d\u17bd\uc0bf\u3856\u4d41\u1662\u0d62\u5b8e\u2c09\udc03\u4b6b\u5f54\u4acd\uf85d\u5098\u3046\u18b4\u3856\u4d41\u1662\u0d62\ufc9e\uad56\ue400\u7818\u541e\u7e54H\ud613\u0ea5\ub6fa"

    .line 11
    .line 12
    invoke-static {v0, v1}, LVa/K9;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget v1, LVa/K9;->h:I

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x75

    .line 23
    .line 24
    rem-int/lit8 v1, v1, 0x2

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    throw v0
.end method

.method public final e()Ljava/lang/Class;
    .locals 3

    .line 1
    sget v0, LVa/K9;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x39

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    const-class v1, Lcom/vungle/warren/VungleApiClient;

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x1d

    .line 10
    .line 11
    rem-int/lit16 v2, v0, 0x80

    .line 12
    .line 13
    sput v2, LVa/K9;->h:I

    .line 14
    .line 15
    rem-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    throw v0
.end method
