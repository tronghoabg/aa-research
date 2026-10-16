.class public final LVa/C;
.super LVa/Mb;
.source "SourceFile"


# static fields
.field public static g:I = 0x0

.field public static h:I = 0x1

.field public static i:I = 0x0

.field public static j:I = 0x1


# direct methods
.method public static A(Ljava/lang/String;IIIZ)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->x:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    new-array v1, p1, [C

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    sput v2, LVa/Ab;->v:I

    .line 14
    .line 15
    :goto_0
    sget v3, LVa/Ab;->v:I

    .line 16
    .line 17
    if-ge v3, p1, :cond_0

    .line 18
    .line 19
    aget-char v4, p0, v3

    .line 20
    .line 21
    add-int/2addr v4, p2

    .line 22
    int-to-char v4, v4

    .line 23
    aput-char v4, v1, v3

    .line 24
    .line 25
    add-int/lit16 v4, v4, -0xa7

    .line 26
    .line 27
    int-to-char v4, v4

    .line 28
    aput-char v4, v1, v3

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    sput v3, LVa/Ab;->v:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    if-lez p3, :cond_1

    .line 38
    .line 39
    sput p3, LVa/Ab;->w:I

    .line 40
    .line 41
    new-array p0, p1, [C

    .line 42
    .line 43
    invoke-static {v1, v2, p0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    sget p2, LVa/Ab;->w:I

    .line 47
    .line 48
    sub-int p3, p1, p2

    .line 49
    .line 50
    invoke-static {p0, v2, v1, p3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    sget p2, LVa/Ab;->w:I

    .line 54
    .line 55
    sub-int p3, p1, p2

    .line 56
    .line 57
    invoke-static {p0, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    :cond_1
    if-eqz p4, :cond_3

    .line 61
    .line 62
    new-array p0, p1, [C

    .line 63
    .line 64
    sput v2, LVa/Ab;->v:I

    .line 65
    .line 66
    :goto_1
    sget p2, LVa/Ab;->v:I

    .line 67
    .line 68
    if-ge p2, p1, :cond_2

    .line 69
    .line 70
    sub-int p3, p1, p2

    .line 71
    .line 72
    add-int/lit8 p3, p3, -0x1

    .line 73
    .line 74
    aget-char p3, v1, p3

    .line 75
    .line 76
    aput-char p3, p0, p2

    .line 77
    .line 78
    add-int/lit8 p2, p2, 0x1

    .line 79
    .line 80
    sput p2, LVa/Ab;->v:I

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v1, p0

    .line 84
    :cond_3
    new-instance p0, Ljava/lang/String;

    .line 85
    .line 86
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 87
    .line 88
    .line 89
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    return-object p0

    .line 91
    :goto_2
    monitor-exit v0

    .line 92
    throw p0
.end method

.method public static t(Ljava/lang/String;IIIZ)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->x:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    new-array v1, p1, [C

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    sput v2, LVa/Ab;->v:I

    .line 14
    .line 15
    :goto_0
    sget v3, LVa/Ab;->v:I

    .line 16
    .line 17
    if-ge v3, p1, :cond_0

    .line 18
    .line 19
    aget-char v4, p0, v3

    .line 20
    .line 21
    add-int/2addr v4, p2

    .line 22
    int-to-char v4, v4

    .line 23
    aput-char v4, v1, v3

    .line 24
    .line 25
    add-int/lit16 v4, v4, -0x9a

    .line 26
    .line 27
    int-to-char v4, v4

    .line 28
    aput-char v4, v1, v3

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    sput v3, LVa/Ab;->v:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    if-lez p3, :cond_1

    .line 38
    .line 39
    sput p3, LVa/Ab;->w:I

    .line 40
    .line 41
    new-array p0, p1, [C

    .line 42
    .line 43
    invoke-static {v1, v2, p0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    sget p2, LVa/Ab;->w:I

    .line 47
    .line 48
    sub-int p3, p1, p2

    .line 49
    .line 50
    invoke-static {p0, v2, v1, p3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    sget p2, LVa/Ab;->w:I

    .line 54
    .line 55
    sub-int p3, p1, p2

    .line 56
    .line 57
    invoke-static {p0, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    :cond_1
    if-eqz p4, :cond_3

    .line 61
    .line 62
    new-array p0, p1, [C

    .line 63
    .line 64
    sput v2, LVa/Ab;->v:I

    .line 65
    .line 66
    :goto_1
    sget p2, LVa/Ab;->v:I

    .line 67
    .line 68
    if-ge p2, p1, :cond_2

    .line 69
    .line 70
    sub-int p3, p1, p2

    .line 71
    .line 72
    add-int/lit8 p3, p3, -0x1

    .line 73
    .line 74
    aget-char p3, v1, p3

    .line 75
    .line 76
    aput-char p3, p0, p2

    .line 77
    .line 78
    add-int/lit8 p2, p2, 0x1

    .line 79
    .line 80
    sput p2, LVa/Ab;->v:I

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v1, p0

    .line 84
    :cond_3
    new-instance p0, Ljava/lang/String;

    .line 85
    .line 86
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 87
    .line 88
    .line 89
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    return-object p0

    .line 91
    :goto_2
    monitor-exit v0

    .line 92
    throw p0
.end method


# virtual methods
.method public B()Ljava/util/List;
    .locals 5

    .line 1
    sget v0, LVa/C;->j:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/C;->i:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/Mb;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, LVa/W;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget v1, LVa/W;->g:I

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x61

    .line 19
    .line 20
    rem-int/lit16 v2, v1, 0x80

    .line 21
    .line 22
    sput v2, LVa/W;->h:I

    .line 23
    .line 24
    rem-int/lit8 v1, v1, 0x2

    .line 25
    .line 26
    iget-object v2, v0, LVa/W;->a:Ljava/util/List;

    .line 27
    .line 28
    const-string v3, "\u0095\u0093\u0088"

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    iget-object v0, v0, LVa/W;->d:Lorg/json/JSONObject;

    .line 32
    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    const/16 v1, 0x38

    .line 36
    .line 37
    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    ushr-int/2addr v1, v4

    .line 42
    :goto_0
    invoke-static {v1, v3}, LVa/W;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v0, v1, v2}, LVa/Ab;->V(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    rsub-int/lit8 v1, v1, 0x7f

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :goto_1
    sget v1, LVa/C;->j:I

    .line 63
    .line 64
    add-int/lit8 v1, v1, 0x5f

    .line 65
    .line 66
    rem-int/lit16 v1, v1, 0x80

    .line 67
    .line 68
    sput v1, LVa/C;->i:I

    .line 69
    .line 70
    return-object v0
.end method

.method public C()Lorg/json/JSONObject;
    .locals 8

    .line 1
    sget v0, LVa/C;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/C;->h:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, "\u0006\u0004\ufff3\ufffb\u0006\u0005"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    shr-int/lit8 v4, v4, 0x15

    .line 26
    .line 27
    const/16 v5, 0x1b

    .line 28
    .line 29
    rem-int/2addr v5, v4

    .line 30
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    rem-int/lit8 v4, v4, 0xf

    .line 35
    .line 36
    mul-int/lit16 v4, v4, 0x3536

    .line 37
    .line 38
    const/4 v6, 0x1

    .line 39
    const/high16 v7, 0x40000000    # 2.0f

    .line 40
    .line 41
    invoke-static {v6, v7, v2}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const/high16 v6, 0x3f800000    # 1.0f

    .line 46
    .line 47
    cmpl-float v2, v2, v6

    .line 48
    .line 49
    const/16 v6, 0x17

    .line 50
    .line 51
    shr-int v2, v6, v2

    .line 52
    .line 53
    invoke-static {v1, v5, v4, v2, v3}, LVa/C;->t(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    goto :goto_1

    .line 66
    :cond_0
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    shr-int/lit8 v4, v4, 0x10

    .line 75
    .line 76
    add-int/lit8 v4, v4, 0x6

    .line 77
    .line 78
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    shr-int/lit8 v5, v5, 0x10

    .line 83
    .line 84
    add-int/lit16 v5, v5, 0x108

    .line 85
    .line 86
    invoke-static {v3, v2, v2}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    cmpl-float v2, v6, v2

    .line 91
    .line 92
    add-int/lit8 v2, v2, 0x6

    .line 93
    .line 94
    invoke-static {v1, v4, v5, v2, v3}, LVa/C;->t(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    goto :goto_0

    .line 99
    :goto_1
    sget v1, LVa/C;->g:I

    .line 100
    .line 101
    add-int/lit8 v1, v1, 0x47

    .line 102
    .line 103
    rem-int/lit16 v2, v1, 0x80

    .line 104
    .line 105
    sput v2, LVa/C;->h:I

    .line 106
    .line 107
    rem-int/lit8 v1, v1, 0x2

    .line 108
    .line 109
    if-nez v1, :cond_1

    .line 110
    .line 111
    const/16 v1, 0x3b

    .line 112
    .line 113
    div-int/2addr v1, v3

    .line 114
    :cond_1
    return-object v0
.end method

.method public u()I
    .locals 3

    .line 1
    sget v0, LVa/C;->j:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/C;->i:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/Mb;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, LVa/W;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget v1, LVa/W;->h:I

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x27

    .line 19
    .line 20
    rem-int/lit16 v1, v1, 0x80

    .line 21
    .line 22
    sput v1, LVa/W;->g:I

    .line 23
    .line 24
    iget-object v0, v0, LVa/W;->d:Lorg/json/JSONObject;

    .line 25
    .line 26
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    shr-int/lit8 v1, v1, 0x10

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x7f

    .line 33
    .line 34
    const-string v2, "\u0083\u0096\u0093\u0088"

    .line 35
    .line 36
    invoke-static {v1, v2}, LVa/W;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/4 v2, 0x7

    .line 45
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    sget v1, LVa/W;->g:I

    .line 50
    .line 51
    add-int/lit8 v1, v1, 0x73

    .line 52
    .line 53
    rem-int/lit16 v1, v1, 0x80

    .line 54
    .line 55
    sput v1, LVa/W;->h:I

    .line 56
    .line 57
    sget v1, LVa/C;->j:I

    .line 58
    .line 59
    add-int/lit8 v1, v1, 0x1b

    .line 60
    .line 61
    rem-int/lit16 v2, v1, 0x80

    .line 62
    .line 63
    sput v2, LVa/C;->i:I

    .line 64
    .line 65
    rem-int/lit8 v1, v1, 0x2

    .line 66
    .line 67
    if-eqz v1, :cond_0

    .line 68
    .line 69
    const/16 v1, 0x55

    .line 70
    .line 71
    div-int/lit8 v1, v1, 0x0

    .line 72
    .line 73
    :cond_0
    return v0
.end method

.method public x()I
    .locals 6

    .line 1
    sget v0, LVa/C;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x31

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/C;->j:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/Mb;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, LVa/W;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget v1, LVa/W;->g:I

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    rem-int/lit16 v1, v1, 0x80

    .line 21
    .line 22
    sput v1, LVa/W;->h:I

    .line 23
    .line 24
    iget-object v0, v0, LVa/W;->d:Lorg/json/JSONObject;

    .line 25
    .line 26
    const-string v1, ""

    .line 27
    .line 28
    const/16 v2, 0x30

    .line 29
    .line 30
    invoke-static {v1, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-int/lit8 v1, v1, 0x5

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-static {v2, v2}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    add-int/lit16 v3, v3, 0xc1

    .line 42
    .line 43
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    add-int/lit8 v4, v4, 0x3

    .line 48
    .line 49
    const-string v5, "\ufffb\u000b\ufffc\u0001"

    .line 50
    .line 51
    invoke-static {v5, v1, v3, v4, v2}, LVa/W;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const/4 v3, 0x2

    .line 60
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    sget v1, LVa/W;->g:I

    .line 65
    .line 66
    add-int/lit8 v1, v1, 0x9

    .line 67
    .line 68
    rem-int/lit16 v1, v1, 0x80

    .line 69
    .line 70
    sput v1, LVa/W;->h:I

    .line 71
    .line 72
    sget v1, LVa/C;->j:I

    .line 73
    .line 74
    add-int/lit8 v1, v1, 0x61

    .line 75
    .line 76
    rem-int/lit16 v4, v1, 0x80

    .line 77
    .line 78
    sput v4, LVa/C;->i:I

    .line 79
    .line 80
    rem-int/2addr v1, v3

    .line 81
    if-eqz v1, :cond_0

    .line 82
    .line 83
    const/16 v1, 0x3a

    .line 84
    .line 85
    div-int/2addr v1, v2

    .line 86
    :cond_0
    return v0
.end method

.method public y()Ljava/lang/String;
    .locals 8

    .line 1
    sget v0, LVa/C;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x13

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/C;->g:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const v1, 0x1000001

    .line 12
    .line 13
    .line 14
    const-string v2, "\ufff6\u0005\u0005"

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v4, v3}, Landroid/view/View;->getDefaultSize(II)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    rsub-int/lit8 v5, v5, 0x2

    .line 29
    .line 30
    const/16 v6, 0x212f

    .line 31
    .line 32
    invoke-static {v3, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    rem-int/2addr v6, v7

    .line 37
    invoke-static {v4, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    shr-int/2addr v1, v4

    .line 42
    invoke-static {v2, v5, v6, v1, v3}, LVa/C;->t(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0

    .line 55
    :cond_0
    invoke-virtual {p0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v4, v4}, Landroid/view/View;->getDefaultSize(II)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    add-int/lit8 v5, v5, 0x3

    .line 64
    .line 65
    invoke-static {v4, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    rsub-int v6, v6, 0x109

    .line 70
    .line 71
    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    add-int/2addr v4, v1

    .line 76
    invoke-static {v2, v5, v6, v4, v3}, LVa/C;->t(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    goto :goto_0
.end method

.method public z()Ljava/util/List;
    .locals 3

    .line 1
    sget v0, LVa/C;->j:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/C;->i:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LVa/Mb;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, LVa/W;

    .line 16
    .line 17
    invoke-virtual {v0}, LVa/W;->d()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x5

    .line 22
    div-int/lit8 v1, v1, 0x0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, LVa/Mb;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, LVa/W;

    .line 28
    .line 29
    invoke-virtual {v0}, LVa/W;->d()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    sget v1, LVa/C;->j:I

    .line 34
    .line 35
    add-int/lit8 v1, v1, 0x7b

    .line 36
    .line 37
    rem-int/lit16 v2, v1, 0x80

    .line 38
    .line 39
    sput v2, LVa/C;->i:I

    .line 40
    .line 41
    rem-int/lit8 v1, v1, 0x2

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    div-int/lit8 v1, v1, 0x0

    .line 47
    .line 48
    :cond_1
    return-object v0
.end method
