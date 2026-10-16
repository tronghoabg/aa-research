.class public final LVa/B8;
.super LVa/y8;
.source "SourceFile"


# static fields
.field public static e:I = 0x0

.field public static f:I = 0x1


# instance fields
.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LVa/t8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, LVa/B8;->d:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(LVa/x8;LVa/y7;)LVa/s8;
    .locals 10

    .line 1
    new-instance p1, LVa/s8;

    .line 2
    .line 3
    invoke-virtual {p2}, LVa/y7;->c()LVa/Z0;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-object v0, p0, LVa/B8;->d:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    shr-int/lit8 v1, v1, 0x10

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x6

    .line 16
    .line 17
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    shr-int/lit8 v2, v2, 0x8

    .line 22
    .line 23
    add-int/lit16 v2, v2, 0x98

    .line 24
    .line 25
    const-string v3, "\u0013\u0001\u000c\u0003\uffce\u0013"

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    add-int/lit8 v5, v5, 0x5

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    sget-object v6, LVa/Ab;->x:Ljava/lang/Object;

    .line 39
    .line 40
    monitor-enter v6

    .line 41
    :try_start_0
    new-array v7, v1, [C

    .line 42
    .line 43
    sput v4, LVa/Ab;->v:I

    .line 44
    .line 45
    :goto_0
    sget v8, LVa/Ab;->v:I

    .line 46
    .line 47
    if-ge v8, v1, :cond_0

    .line 48
    .line 49
    aget-char v9, v3, v8

    .line 50
    .line 51
    add-int/2addr v9, v2

    .line 52
    int-to-char v9, v9

    .line 53
    aput-char v9, v7, v8

    .line 54
    .line 55
    add-int/lit8 v9, v9, -0x38

    .line 56
    .line 57
    int-to-char v9, v9

    .line 58
    aput-char v9, v7, v8

    .line 59
    .line 60
    add-int/lit8 v8, v8, 0x1

    .line 61
    .line 62
    sput v8, LVa/Ab;->v:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    goto :goto_2

    .line 67
    :cond_0
    if-lez v5, :cond_1

    .line 68
    .line 69
    sput v5, LVa/Ab;->w:I

    .line 70
    .line 71
    new-array v2, v1, [C

    .line 72
    .line 73
    invoke-static {v7, v4, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 74
    .line 75
    .line 76
    sget v3, LVa/Ab;->w:I

    .line 77
    .line 78
    sub-int v5, v1, v3

    .line 79
    .line 80
    invoke-static {v2, v4, v7, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 81
    .line 82
    .line 83
    sget v3, LVa/Ab;->w:I

    .line 84
    .line 85
    sub-int v5, v1, v3

    .line 86
    .line 87
    invoke-static {v2, v3, v7, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 88
    .line 89
    .line 90
    :cond_1
    new-array v2, v1, [C

    .line 91
    .line 92
    sput v4, LVa/Ab;->v:I

    .line 93
    .line 94
    :goto_1
    sget v3, LVa/Ab;->v:I

    .line 95
    .line 96
    const/4 v4, 0x1

    .line 97
    if-ge v3, v1, :cond_2

    .line 98
    .line 99
    sub-int v5, v1, v3

    .line 100
    .line 101
    sub-int/2addr v5, v4

    .line 102
    aget-char v4, v7, v5

    .line 103
    .line 104
    aput-char v4, v2, v3

    .line 105
    .line 106
    add-int/lit8 v3, v3, 0x1

    .line 107
    .line 108
    sput v3, LVa/Ab;->v:I

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    new-instance v1, Ljava/lang/String;

    .line 112
    .line 113
    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    .line 114
    .line 115
    .line 116
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-static {v0, v1}, LVa/pb;->j0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    sget v1, LVa/Z0;->Q:I

    .line 129
    .line 130
    add-int/lit8 v1, v1, 0x63

    .line 131
    .line 132
    rem-int/lit16 v1, v1, 0x80

    .line 133
    .line 134
    sput v1, LVa/Z0;->P:I

    .line 135
    .line 136
    invoke-virtual {p2, v0, v4}, LVa/Z0;->y0(Ljava/lang/String;Z)Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    sget v0, LVa/Z0;->P:I

    .line 141
    .line 142
    add-int/lit8 v0, v0, 0xb

    .line 143
    .line 144
    rem-int/lit16 v1, v0, 0x80

    .line 145
    .line 146
    sput v1, LVa/Z0;->Q:I

    .line 147
    .line 148
    rem-int/lit8 v0, v0, 0x2

    .line 149
    .line 150
    if-eqz v0, :cond_3

    .line 151
    .line 152
    invoke-direct {p1, p2}, LVa/s8;-><init>(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    sget p2, LVa/B8;->f:I

    .line 156
    .line 157
    add-int/lit8 p2, p2, 0x3

    .line 158
    .line 159
    rem-int/lit16 p2, p2, 0x80

    .line 160
    .line 161
    sput p2, LVa/B8;->e:I

    .line 162
    .line 163
    return-object p1

    .line 164
    :cond_3
    const/4 p1, 0x0

    .line 165
    throw p1

    .line 166
    :goto_2
    monitor-exit v6

    .line 167
    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    sget v0, LVa/B8;->e:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x4f

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/B8;->f:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    if-eqz v1, :cond_7

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne p0, p1, :cond_0

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x5

    .line 17
    .line 18
    rem-int/lit16 v0, v0, 0x80

    .line 19
    .line 20
    sput v0, LVa/B8;->f:I

    .line 21
    .line 22
    return v1

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    if-eqz p1, :cond_5

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-class v3, LVa/B8;

    .line 31
    .line 32
    if-eq v3, v2, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    check-cast p1, LVa/B8;

    .line 36
    .line 37
    iget-object p1, p1, LVa/B8;->d:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v2, p0, LVa/B8;->d:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :cond_2
    if-nez p1, :cond_4

    .line 49
    .line 50
    sget p1, LVa/B8;->e:I

    .line 51
    .line 52
    add-int/lit8 p1, p1, 0x7

    .line 53
    .line 54
    rem-int/lit16 p1, p1, 0x80

    .line 55
    .line 56
    sput p1, LVa/B8;->f:I

    .line 57
    .line 58
    add-int/lit8 p1, p1, 0x1f

    .line 59
    .line 60
    rem-int/lit16 v2, p1, 0x80

    .line 61
    .line 62
    sput v2, LVa/B8;->e:I

    .line 63
    .line 64
    rem-int/lit8 p1, p1, 0x2

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    const/16 p1, 0x28

    .line 69
    .line 70
    div-int/2addr p1, v0

    .line 71
    :cond_3
    return v1

    .line 72
    :cond_4
    return v0

    .line 73
    :cond_5
    :goto_0
    sget p1, LVa/B8;->e:I

    .line 74
    .line 75
    add-int/lit8 p1, p1, 0x79

    .line 76
    .line 77
    rem-int/lit16 v1, p1, 0x80

    .line 78
    .line 79
    sput v1, LVa/B8;->f:I

    .line 80
    .line 81
    rem-int/lit8 p1, p1, 0x2

    .line 82
    .line 83
    if-nez p1, :cond_6

    .line 84
    .line 85
    const/16 p1, 0x20

    .line 86
    .line 87
    div-int/2addr p1, v0

    .line 88
    :cond_6
    return v0

    .line 89
    :cond_7
    const/4 p1, 0x0

    .line 90
    throw p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    sget v0, LVa/B8;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x61

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/B8;->e:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/B8;->d:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sget v1, LVa/B8;->e:I

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x6d

    .line 20
    .line 21
    rem-int/lit16 v2, v1, 0x80

    .line 22
    .line 23
    sput v2, LVa/B8;->f:I

    .line 24
    .line 25
    rem-int/lit8 v1, v1, 0x2

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    return v0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    throw v0

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    sget v0, LVa/B8;->e:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x21

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/B8;->f:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x57

    .line 14
    .line 15
    rem-int/lit16 v1, v0, 0x80

    .line 16
    .line 17
    sput v1, LVa/B8;->f:I

    .line 18
    .line 19
    rem-int/lit8 v0, v0, 0x2

    .line 20
    .line 21
    iget-object v1, p0, LVa/B8;->d:Ljava/lang/String;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const/16 v0, 0x5e

    .line 26
    .line 27
    div-int/lit8 v0, v0, 0x0

    .line 28
    .line 29
    :cond_0
    return-object v1

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    throw v0
.end method
