.class public final LVa/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static b:I = 0x0

.field public static c:I = 0x1


# instance fields
.field public final a:LVa/Sa;


# direct methods
.method public constructor <init>(LVa/Sa;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/l;->a:LVa/Sa;

    .line 5
    .line 6
    return-void
.end method

.method public static f(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, "\u0000\u0000\u0000\u0000"

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
    int-to-long v6, v2

    .line 98
    xor-long/2addr v4, v6

    .line 99
    const/16 v6, 0x1306

    .line 100
    .line 101
    int-to-long v6, v6

    .line 102
    xor-long/2addr v4, v6

    .line 103
    long-to-int v4, v4

    .line 104
    int-to-char v4, v4

    .line 105
    aput-char v4, p3, v3

    .line 106
    .line 107
    add-int/lit8 v3, v3, 0x1

    .line 108
    .line 109
    sput v3, LVa/a;->q:I

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    goto :goto_1

    .line 114
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 115
    .line 116
    invoke-direct {p0, p3}, Ljava/lang/String;-><init>([C)V

    .line 117
    .line 118
    .line 119
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    return-object p0

    .line 121
    :goto_1
    monitor-exit v1

    .line 122
    throw p0
.end method


# virtual methods
.method public final a()J
    .locals 5

    .line 1
    sget v0, LVa/l;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/l;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, LVa/l;->j()Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ""

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {v1, v2, v2}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const v3, 0xd080

    .line 21
    .line 22
    .line 23
    add-int/2addr v1, v3

    .line 24
    int-to-char v1, v1

    .line 25
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const-string v3, "\u326c\u2bae\u80f3\u99d0"

    .line 30
    .line 31
    const-string v4, "\u0c40\uc9e9"

    .line 32
    .line 33
    invoke-static {v1, v3, v4, v2}, LVa/l;->f(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    sget v2, LVa/l;->b:I

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x3b

    .line 48
    .line 49
    rem-int/lit16 v2, v2, 0x80

    .line 50
    .line 51
    sput v2, LVa/l;->c:I

    .line 52
    .line 53
    return-wide v0
.end method

.method public final b()J
    .locals 5

    .line 1
    sget v0, LVa/l;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x59

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/l;->b:I

    .line 8
    .line 9
    invoke-virtual {p0}, LVa/l;->j()Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    const-wide/16 v3, 0x0

    .line 18
    .line 19
    cmp-long v1, v1, v3

    .line 20
    .line 21
    const v2, 0x9399

    .line 22
    .line 23
    .line 24
    sub-int/2addr v2, v1

    .line 25
    int-to-char v1, v2

    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {v2}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    const-string v3, "\uccb6\uaa0e\u9814\u0393"

    .line 34
    .line 35
    const-string v4, "\u8beb\u0c9a"

    .line 36
    .line 37
    invoke-static {v1, v3, v4, v2}, LVa/l;->f(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

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
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    int-to-long v0, v0

    .line 50
    sget v2, LVa/l;->b:I

    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x13

    .line 53
    .line 54
    rem-int/lit16 v3, v2, 0x80

    .line 55
    .line 56
    sput v3, LVa/l;->c:I

    .line 57
    .line 58
    rem-int/lit8 v2, v2, 0x2

    .line 59
    .line 60
    if-eqz v2, :cond_0

    .line 61
    .line 62
    return-wide v0

    .line 63
    :cond_0
    const/4 v0, 0x0

    .line 64
    throw v0
.end method

.method public final c(LVa/l;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, LVa/l;->a()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p1}, LVa/l;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-gez v0, :cond_1

    .line 13
    .line 14
    sget p1, LVa/l;->b:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x4f

    .line 17
    .line 18
    rem-int/lit16 v0, p1, 0x80

    .line 19
    .line 20
    sput v0, LVa/l;->c:I

    .line 21
    .line 22
    rem-int/lit8 p1, p1, 0x2

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const/4 p1, -0x1

    .line 27
    return p1

    .line 28
    :cond_0
    throw v1

    .line 29
    :cond_1
    if-nez v0, :cond_3

    .line 30
    .line 31
    sget v0, LVa/l;->c:I

    .line 32
    .line 33
    add-int/lit8 v0, v0, 0x63

    .line 34
    .line 35
    rem-int/lit16 v2, v0, 0x80

    .line 36
    .line 37
    sput v2, LVa/l;->b:I

    .line 38
    .line 39
    rem-int/lit8 v0, v0, 0x2

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0, p1}, LVa/l;->e(LVa/l;)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :cond_2
    invoke-virtual {p0, p1}, LVa/l;->e(LVa/l;)I

    .line 49
    .line 50
    .line 51
    throw v1

    .line 52
    :cond_3
    const/4 p1, 0x1

    .line 53
    return p1
.end method

.method public final synthetic compareTo(Ljava/lang/Object;)I
    .locals 3

    .line 1
    sget v0, LVa/l;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0xf

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/l;->b:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    check-cast p1, LVa/l;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p1}, LVa/l;->c(LVa/l;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    sget v0, LVa/l;->b:I

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x4f

    .line 23
    .line 24
    rem-int/lit16 v2, v0, 0x80

    .line 25
    .line 26
    sput v2, LVa/l;->c:I

    .line 27
    .line 28
    rem-int/lit8 v0, v0, 0x2

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    return p1

    .line 33
    :cond_0
    throw v1

    .line 34
    :cond_1
    invoke-virtual {p0, p1}, LVa/l;->c(LVa/l;)I

    .line 35
    .line 36
    .line 37
    throw v1
.end method

.method public final d()LVa/Sa;
    .locals 2

    .line 1
    sget v0, LVa/l;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x29

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/l;->c:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/l;->a:LVa/Sa;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/16 v0, 0x2b

    .line 16
    .line 17
    div-int/lit8 v0, v0, 0x0

    .line 18
    .line 19
    :cond_0
    return-object v1
.end method

.method public final e(LVa/l;)I
    .locals 4

    .line 1
    sget v0, LVa/l;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x37

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/l;->b:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0}, LVa/l;->b()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-virtual {p1}, LVa/l;->b()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    cmp-long p1, v0, v2

    .line 22
    .line 23
    if-gez p1, :cond_0

    .line 24
    .line 25
    const/4 p1, -0x1

    .line 26
    return p1

    .line 27
    :cond_0
    cmp-long p1, v0, v2

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    sget p1, LVa/l;->c:I

    .line 33
    .line 34
    add-int/lit8 p1, p1, 0x53

    .line 35
    .line 36
    rem-int/lit16 v1, p1, 0x80

    .line 37
    .line 38
    sput v1, LVa/l;->b:I

    .line 39
    .line 40
    rem-int/lit8 p1, p1, 0x2

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    return v0

    .line 45
    :cond_1
    const/4 p1, 0x0

    .line 46
    return p1

    .line 47
    :cond_2
    return v0

    .line 48
    :cond_3
    invoke-virtual {p0}, LVa/l;->b()J

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, LVa/l;->b()J

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    sget v0, LVa/l;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6f

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/l;->c:I

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    if-eqz p1, :cond_5

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x59

    .line 16
    .line 17
    rem-int/lit16 v1, v0, 0x80

    .line 18
    .line 19
    sput v1, LVa/l;->b:I

    .line 20
    .line 21
    rem-int/lit8 v0, v0, 0x2

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-nez v0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-class v2, LVa/l;

    .line 31
    .line 32
    if-eq v2, v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    check-cast p1, LVa/l;

    .line 36
    .line 37
    sget v0, LVa/l;->b:I

    .line 38
    .line 39
    add-int/lit8 v2, v0, 0x69

    .line 40
    .line 41
    rem-int/lit16 v3, v2, 0x80

    .line 42
    .line 43
    sput v3, LVa/l;->c:I

    .line 44
    .line 45
    rem-int/lit8 v2, v2, 0x2

    .line 46
    .line 47
    iget-object v3, p0, LVa/l;->a:LVa/Sa;

    .line 48
    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    iget-object v2, v3, LVa/Sa;->b:Ljava/lang/String;

    .line 52
    .line 53
    add-int/lit8 v0, v0, 0x69

    .line 54
    .line 55
    rem-int/lit16 v3, v0, 0x80

    .line 56
    .line 57
    sput v3, LVa/l;->c:I

    .line 58
    .line 59
    rem-int/lit8 v0, v0, 0x2

    .line 60
    .line 61
    iget-object p1, p1, LVa/l;->a:LVa/Sa;

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    iget-object p1, p1, LVa/Sa;->b:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    return p1

    .line 72
    :cond_2
    iget-object p1, p1, LVa/Sa;->b:Ljava/lang/String;

    .line 73
    .line 74
    throw v1

    .line 75
    :cond_3
    iget-object p1, v3, LVa/Sa;->b:Ljava/lang/String;

    .line 76
    .line 77
    throw v1

    .line 78
    :cond_4
    throw v1

    .line 79
    :cond_5
    :goto_0
    const/4 p1, 0x0

    .line 80
    return p1
.end method

.method public final g()Ljava/lang/String;
    .locals 9

    .line 1
    sget v0, LVa/l;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/l;->c:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const v2, -0x2b909218

    .line 13
    .line 14
    .line 15
    const-string v3, "\u32ae\u5d43\ubf3b"

    .line 16
    .line 17
    const-string v4, "\ue8f5\u6f6d\u3ad4\ub3f0"

    .line 18
    .line 19
    const v5, 0xf03a

    .line 20
    .line 21
    .line 22
    const-string v6, ""

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, LVa/l;->j()Lorg/json/JSONObject;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v8, 0x1

    .line 32
    invoke-static {v7, v8, v7, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    shl-int/2addr v5, v7

    .line 37
    int-to-char v5, v5

    .line 38
    invoke-static {v6, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    sub-int/2addr v2, v6

    .line 43
    invoke-static {v5, v4, v3, v2}, LVa/l;->f(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    :goto_0
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0

    .line 56
    :cond_0
    invoke-virtual {p0}, LVa/l;->j()Lorg/json/JSONObject;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v7, v7, v7, v7}, Landroid/graphics/Color;->argb(IIII)I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    sub-int/2addr v5, v7

    .line 65
    int-to-char v5, v5

    .line 66
    invoke-static {v6, v6}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    add-int/2addr v6, v2

    .line 71
    invoke-static {v5, v4, v3, v6}, LVa/l;->f(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    goto :goto_0
.end method

.method public final h(Ljava/lang/String;)V
    .locals 7

    .line 1
    sget v0, LVa/l;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/l;->b:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const v1, -0x2b909218

    .line 12
    .line 13
    .line 14
    const-string v2, "\u32ae\u5d43\ubf3b"

    .line 15
    .line 16
    const-string v3, "\ue8f5\u6f6d\u3ad4\ub3f0"

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    const v5, 0xf039

    .line 20
    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    :try_start_0
    invoke-virtual {p0}, LVa/l;->j()Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    cmpl-float v4, v6, v4

    .line 33
    .line 34
    div-int/2addr v5, v4

    .line 35
    int-to-char v4, v5

    .line 36
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    rem-int/lit8 v5, v5, 0x27

    .line 41
    .line 42
    add-int/2addr v5, v1

    .line 43
    invoke-static {v4, v3, v2, v5}, LVa/l;->f(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    invoke-virtual {p0}, LVa/l;->j()Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    cmpl-float v4, v6, v4

    .line 64
    .line 65
    add-int/2addr v4, v5

    .line 66
    int-to-char v4, v4

    .line 67
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    shr-int/lit8 v5, v5, 0x10

    .line 72
    .line 73
    sub-int/2addr v1, v5

    .line 74
    invoke-static {v4, v3, v2, v1}, LVa/l;->f(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    goto :goto_0

    .line 79
    :catch_0
    return-void
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    sget v0, LVa/l;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x55

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/l;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, LVa/l;->j()Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    sget v0, LVa/l;->b:I

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0xb

    .line 18
    .line 19
    rem-int/lit16 v1, v0, 0x80

    .line 20
    .line 21
    sput v1, LVa/l;->c:I

    .line 22
    .line 23
    rem-int/lit8 v0, v0, 0x2

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, LVa/l;->j()Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    sget v2, LVa/l;->c:I

    .line 37
    .line 38
    add-int/lit8 v2, v2, 0xb

    .line 39
    .line 40
    rem-int/lit16 v3, v2, 0x80

    .line 41
    .line 42
    sput v3, LVa/l;->b:I

    .line 43
    .line 44
    rem-int/lit8 v2, v2, 0x2

    .line 45
    .line 46
    if-nez v2, :cond_0

    .line 47
    .line 48
    return v0

    .line 49
    :cond_0
    throw v1

    .line 50
    :cond_1
    invoke-virtual {p0}, LVa/l;->j()Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    :cond_2
    const/4 v0, 0x0

    .line 59
    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 6

    .line 1
    sget v0, LVa/l;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/l;->b:I

    .line 8
    .line 9
    invoke-virtual {p0}, LVa/l;->j()Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    shr-int/lit8 v1, v1, 0x16

    .line 18
    .line 19
    add-int/lit16 v1, v1, 0x3510

    .line 20
    .line 21
    int-to-char v1, v1

    .line 22
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    const-wide/16 v4, 0x0

    .line 27
    .line 28
    cmp-long v2, v2, v4

    .line 29
    .line 30
    rsub-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    const-string v3, "\u9a96\uaeeb\u1094\udc35"

    .line 33
    .line 34
    const-string v4, "\u1c03\u0837\u3061\uc959"

    .line 35
    .line 36
    invoke-static {v1, v3, v4, v2}, LVa/l;->f(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

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
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget v1, LVa/l;->b:I

    .line 49
    .line 50
    add-int/lit8 v1, v1, 0x1f

    .line 51
    .line 52
    rem-int/lit16 v2, v1, 0x80

    .line 53
    .line 54
    sput v2, LVa/l;->c:I

    .line 55
    .line 56
    rem-int/lit8 v1, v1, 0x2

    .line 57
    .line 58
    if-eqz v1, :cond_0

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_0
    const/4 v0, 0x0

    .line 62
    throw v0
.end method

.method public final declared-synchronized j()Lorg/json/JSONObject;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/l;->b:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x75

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, LVa/l;->c:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, LVa/l;->a:LVa/Sa;

    .line 15
    .line 16
    iget-object v0, v0, LVa/Sa;->a:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-object v0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    :try_start_1
    iget-object v0, p0, LVa/l;->a:LVa/Sa;

    .line 23
    .line 24
    iget-object v0, v0, LVa/Sa;->a:Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 28
    :catchall_1
    move-exception v0

    .line 29
    :try_start_3
    throw v0

    .line 30
    :goto_0
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 31
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, LVa/l;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/l;->b:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, LVa/l;->j()Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget v1, LVa/l;->b:I

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x11

    .line 24
    .line 25
    rem-int/lit16 v1, v1, 0x80

    .line 26
    .line 27
    sput v1, LVa/l;->c:I

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    invoke-virtual {p0}, LVa/l;->j()Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    throw v0
.end method
