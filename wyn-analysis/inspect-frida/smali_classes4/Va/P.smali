.class public final LVa/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/ua;


# static fields
.field public static b:I = 0x0

.field public static c:I = 0x1


# instance fields
.field public synthetic a:LVa/V;


# direct methods
.method public static b(IIIZ)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "\u0005\u0002\u0005\u0007\u0003\ufff2\ufff8\u0005"

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
    sget-object v1, LVa/Ab;->x:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    new-array v2, p0, [C

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    sput v3, LVa/Ab;->v:I

    .line 16
    .line 17
    :goto_0
    sget v4, LVa/Ab;->v:I

    .line 18
    .line 19
    if-ge v4, p0, :cond_0

    .line 20
    .line 21
    aget-char v5, v0, v4

    .line 22
    .line 23
    add-int/2addr v5, p1

    .line 24
    int-to-char v5, v5

    .line 25
    aput-char v5, v2, v4

    .line 26
    .line 27
    add-int/lit8 v5, v5, -0x5d

    .line 28
    .line 29
    int-to-char v5, v5

    .line 30
    aput-char v5, v2, v4

    .line 31
    .line 32
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    sput v4, LVa/Ab;->v:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    goto :goto_2

    .line 39
    :cond_0
    if-lez p2, :cond_1

    .line 40
    .line 41
    sput p2, LVa/Ab;->w:I

    .line 42
    .line 43
    new-array p1, p0, [C

    .line 44
    .line 45
    invoke-static {v2, v3, p1, v3, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 46
    .line 47
    .line 48
    sget p2, LVa/Ab;->w:I

    .line 49
    .line 50
    sub-int v0, p0, p2

    .line 51
    .line 52
    invoke-static {p1, v3, v2, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 53
    .line 54
    .line 55
    sget p2, LVa/Ab;->w:I

    .line 56
    .line 57
    sub-int v0, p0, p2

    .line 58
    .line 59
    invoke-static {p1, p2, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 60
    .line 61
    .line 62
    :cond_1
    if-eqz p3, :cond_3

    .line 63
    .line 64
    new-array p1, p0, [C

    .line 65
    .line 66
    sput v3, LVa/Ab;->v:I

    .line 67
    .line 68
    :goto_1
    sget p2, LVa/Ab;->v:I

    .line 69
    .line 70
    if-ge p2, p0, :cond_2

    .line 71
    .line 72
    sub-int p3, p0, p2

    .line 73
    .line 74
    add-int/lit8 p3, p3, -0x1

    .line 75
    .line 76
    aget-char p3, v2, p3

    .line 77
    .line 78
    aput-char p3, p1, p2

    .line 79
    .line 80
    add-int/lit8 p2, p2, 0x1

    .line 81
    .line 82
    sput p2, LVa/Ab;->v:I

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move-object v2, p1

    .line 86
    :cond_3
    new-instance p0, Ljava/lang/String;

    .line 87
    .line 88
    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    .line 89
    .line 90
    .line 91
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    return-object p0

    .line 93
    :goto_2
    monitor-exit v1

    .line 94
    throw p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 4

    .line 1
    sget p2, LVa/P;->c:I

    .line 2
    .line 3
    add-int/lit8 p2, p2, 0x4d

    .line 4
    .line 5
    rem-int/lit16 v0, p2, 0x80

    .line 6
    .line 7
    sput v0, LVa/P;->b:I

    .line 8
    .line 9
    rem-int/lit8 p2, p2, 0x2

    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    add-int/lit8 p2, p2, -0x49

    .line 20
    .line 21
    rsub-int/lit8 p2, p2, 0x65

    .line 22
    .line 23
    const/16 v1, 0x78

    .line 24
    .line 25
    invoke-static {v0, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/16 v2, 0x1360

    .line 30
    .line 31
    shl-int v1, v2, v1

    .line 32
    .line 33
    const/16 v2, 0x72

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    invoke-static {v0, v2, v3, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/4 v2, 0x5

    .line 41
    rem-int/2addr v2, v0

    .line 42
    invoke-static {p2, v1, v2, v3}, LVa/P;->b(IIIZ)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    shr-int/lit8 p2, p2, 0x10

    .line 62
    .line 63
    add-int/lit8 p2, p2, 0x8

    .line 64
    .line 65
    const/16 v1, 0x30

    .line 66
    .line 67
    invoke-static {v0, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    rsub-int v2, v2, 0xc9

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-static {v0, v1, v3, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    rsub-int/lit8 v0, v0, 0x2

    .line 79
    .line 80
    invoke-static {p2, v2, v0, v3}, LVa/P;->b(IIIZ)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_1

    .line 93
    .line 94
    :goto_0
    iget-object p1, p0, LVa/P;->a:LVa/V;

    .line 95
    .line 96
    invoke-virtual {p1}, LVa/V;->u()Lorg/json/JSONObject;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    :cond_1
    sget p1, LVa/P;->b:I

    .line 102
    .line 103
    add-int/lit8 p1, p1, 0xd

    .line 104
    .line 105
    rem-int/lit16 p2, p1, 0x80

    .line 106
    .line 107
    sput p2, LVa/P;->c:I

    .line 108
    .line 109
    rem-int/lit8 p1, p1, 0x2

    .line 110
    .line 111
    const/4 p2, 0x0

    .line 112
    if-eqz p1, :cond_2

    .line 113
    .line 114
    return-object p2

    .line 115
    :cond_2
    throw p2
.end method
