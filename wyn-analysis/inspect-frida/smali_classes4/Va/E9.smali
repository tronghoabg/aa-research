.class public final LVa/E9;
.super LVa/r9;
.source "SourceFile"


# static fields
.field public static c:I = 0x0

.field public static d:I = 0x1


# direct methods
.method public static f(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, "\u54c9\ude54\u0f52\u3c35"

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, [C

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, [C

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, [C

    .line 20
    .line 21
    sget-object v1, LVa/a;->r:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v1

    .line 24
    :try_start_0
    invoke-virtual {p1}, [C->clone()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, [C

    .line 29
    .line 30
    invoke-virtual {v0}, [C->clone()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, [C

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    aget-char v3, p1, v2

    .line 38
    .line 39
    xor-int/2addr p0, v3

    .line 40
    int-to-char p0, p0

    .line 41
    aput-char p0, p1, v2

    .line 42
    .line 43
    const/4 p0, 0x2

    .line 44
    aget-char v3, v0, p0

    .line 45
    .line 46
    int-to-char p3, p3

    .line 47
    add-int/2addr v3, p3

    .line 48
    int-to-char p3, v3

    .line 49
    aput-char p3, v0, p0

    .line 50
    .line 51
    array-length p0, p2

    .line 52
    new-array p3, p0, [C

    .line 53
    .line 54
    sput v2, LVa/a;->q:I

    .line 55
    .line 56
    :goto_0
    sget v3, LVa/a;->q:I

    .line 57
    .line 58
    if-ge v3, p0, :cond_0

    .line 59
    .line 60
    add-int/lit8 v4, v3, 0x2

    .line 61
    .line 62
    rem-int/lit8 v4, v4, 0x4

    .line 63
    .line 64
    add-int/lit8 v5, v3, 0x3

    .line 65
    .line 66
    rem-int/lit8 v5, v5, 0x4

    .line 67
    .line 68
    rem-int/lit8 v6, v3, 0x4

    .line 69
    .line 70
    aget-char v6, p1, v6

    .line 71
    .line 72
    mul-int/lit16 v6, v6, 0x7fce

    .line 73
    .line 74
    aget-char v4, v0, v4

    .line 75
    .line 76
    add-int/2addr v6, v4

    .line 77
    const v7, 0xffff

    .line 78
    .line 79
    .line 80
    rem-int/2addr v6, v7

    .line 81
    int-to-char v6, v6

    .line 82
    aget-char v8, p1, v5

    .line 83
    .line 84
    mul-int/lit16 v8, v8, 0x7fce

    .line 85
    .line 86
    add-int/2addr v8, v4

    .line 87
    div-int/2addr v8, v7

    .line 88
    int-to-char v4, v8

    .line 89
    aput-char v4, v0, v5

    .line 90
    .line 91
    aput-char v6, p1, v5

    .line 92
    .line 93
    aget-char v4, p2, v3

    .line 94
    .line 95
    xor-int/2addr v4, v6

    .line 96
    int-to-long v4, v4

    .line 97
    const-wide v6, 0x3c350f52de5454c9L    # 1.1416572018573094E-18

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    xor-long/2addr v4, v6

    .line 103
    int-to-long v6, v2

    .line 104
    xor-long/2addr v4, v6

    .line 105
    xor-long/2addr v4, v6

    .line 106
    long-to-int v4, v4

    .line 107
    int-to-char v4, v4

    .line 108
    aput-char v4, p3, v3

    .line 109
    .line 110
    add-int/lit8 v3, v3, 0x1

    .line 111
    .line 112
    sput v3, LVa/a;->q:I

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :catchall_0
    move-exception p0

    .line 116
    goto :goto_1

    .line 117
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 118
    .line 119
    invoke-direct {p0, p3}, Ljava/lang/String;-><init>([C)V

    .line 120
    .line 121
    .line 122
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    return-object p0

    .line 124
    :goto_1
    monitor-exit v1

    .line 125
    throw p0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 9

    .line 1
    sget v0, LVa/E9;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x49

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/E9;->d:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    const-string v2, "\u32d0\ua733\u7b17\u8f51\ucb8d\uae43"

    .line 13
    .line 14
    const-string v3, "\ue440\u5456\u73d3\u84ce"

    .line 15
    .line 16
    const v4, 0xce72

    .line 17
    .line 18
    .line 19
    const-wide/16 v5, 0x0

    .line 20
    .line 21
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 22
    .line 23
    .line 24
    move-result-wide v7

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    cmp-long v0, v7, v5

    .line 28
    .line 29
    rem-int/2addr v4, v0

    .line 30
    int-to-char v0, v4

    .line 31
    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    rem-int/2addr v1, v4

    .line 36
    invoke-static {v0, v3, v2, v1}, LVa/E9;->f(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0

    .line 45
    :cond_0
    cmp-long v0, v7, v5

    .line 46
    .line 47
    add-int/2addr v0, v4

    .line 48
    int-to-char v0, v0

    .line 49
    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    add-int/2addr v4, v1

    .line 54
    invoke-static {v0, v3, v2, v4}, LVa/E9;->f(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    goto :goto_0
.end method

.method public final c()LVa/Z0;
    .locals 3

    .line 1
    new-instance v0, LVa/z6;

    .line 2
    .line 3
    invoke-virtual {p0}, LVa/E9;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, LVa/Z0;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget v1, LVa/E9;->d:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x17

    .line 13
    .line 14
    rem-int/lit16 v2, v1, 0x80

    .line 15
    .line 16
    sput v2, LVa/E9;->c:I

    .line 17
    .line 18
    rem-int/lit8 v1, v1, 0x2

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/16 v1, 0x5b

    .line 23
    .line 24
    div-int/lit8 v1, v1, 0x0

    .line 25
    .line 26
    :cond_0
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 6

    .line 1
    sget v0, LVa/E9;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x19

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/E9;->c:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const v1, 0x601c1d8a

    .line 12
    .line 13
    .line 14
    const-string v2, "\ue457\u6516\u83f9\u001c\uebc7\u671f\u7e8c\u31eb\ufe26\ue2e0\ud0b6\u49ac\ua55c\u6be5\u62a5\u2d94\u9a8c"

    .line 15
    .line 16
    const-string v3, "\u8a8e\u1c1d\ub660\u42bc"

    .line 17
    .line 18
    const v4, 0xbcb6

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    ushr-int/lit8 v0, v0, 0x4e

    .line 29
    .line 30
    ushr-int v0, v4, v0

    .line 31
    .line 32
    int-to-char v0, v0

    .line 33
    const/4 v4, 0x1

    .line 34
    invoke-static {v5, v4, v4, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    shl-int/2addr v1, v4

    .line 39
    :goto_0
    invoke-static {v0, v3, v2, v1}, LVa/E9;->f(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    shr-int/lit8 v0, v0, 0x10

    .line 53
    .line 54
    sub-int/2addr v4, v0

    .line 55
    int-to-char v0, v4

    .line 56
    invoke-static {v5, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    sub-int/2addr v1, v4

    .line 61
    goto :goto_0
.end method

.method public final e()Ljava/lang/Class;
    .locals 2

    .line 1
    sget v0, LVa/E9;->c:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x4f

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, LVa/E9;->d:I

    .line 8
    .line 9
    const-class v1, Lcom/tapjoy/Tapjoy;

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x79

    .line 12
    .line 13
    rem-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    sput v0, LVa/E9;->d:I

    .line 16
    .line 17
    return-object v1
.end method
