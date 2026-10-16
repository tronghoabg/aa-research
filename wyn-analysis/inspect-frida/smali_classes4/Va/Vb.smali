.class public final LVa/Vb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/kb;


# static fields
.field public static b:I = 0x0

.field public static c:I = 0x1


# instance fields
.field public final synthetic a:LVa/b;


# direct methods
.method public constructor <init>(LVa/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/Vb;->a:LVa/b;

    .line 5
    .line 6
    return-void
.end method

.method public static e(LVa/Vb;Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 2

    .line 1
    sget v0, LVa/Vb;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/Vb;->c:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance v0, LVa/Ub;

    .line 18
    .line 19
    invoke-direct {v0, p0, p1, p2, p3}, LVa/Ub;-><init>(LVa/Vb;Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, LVa/Cb;->c(LVa/Ba;)V

    .line 23
    .line 24
    .line 25
    sget p0, LVa/Vb;->c:I

    .line 26
    .line 27
    add-int/lit8 p1, p0, 0x1b

    .line 28
    .line 29
    rem-int/lit16 p2, p1, 0x80

    .line 30
    .line 31
    sput p2, LVa/Vb;->b:I

    .line 32
    .line 33
    rem-int/lit8 p1, p1, 0x2

    .line 34
    .line 35
    if-nez p1, :cond_0

    .line 36
    .line 37
    add-int/lit8 p0, p0, 0x43

    .line 38
    .line 39
    rem-int/lit16 p0, p0, 0x80

    .line 40
    .line 41
    sput p0, LVa/Vb;->b:I

    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    throw v1

    .line 45
    :cond_1
    new-instance v0, LVa/Ub;

    .line 46
    .line 47
    invoke-direct {v0, p0, p1, p2, p3}, LVa/Ub;-><init>(LVa/Vb;Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, LVa/Cb;->c(LVa/Ba;)V

    .line 51
    .line 52
    .line 53
    sget p0, LVa/Vb;->c:I

    .line 54
    .line 55
    add-int/lit8 p0, p0, 0x1b

    .line 56
    .line 57
    rem-int/lit16 p1, p0, 0x80

    .line 58
    .line 59
    sput p1, LVa/Vb;->b:I

    .line 60
    .line 61
    rem-int/lit8 p0, p0, 0x2

    .line 62
    .line 63
    if-nez p0, :cond_2

    .line 64
    .line 65
    throw v1

    .line 66
    :cond_2
    throw v1
.end method

.method public static f(Ljava/lang/String;IIIZ)Ljava/lang/String;
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
    new-array v1, p2, [C

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
    if-ge v3, p2, :cond_0

    .line 18
    .line 19
    aget-char v4, p0, v3

    .line 20
    .line 21
    add-int/2addr v4, p3

    .line 22
    int-to-char v4, v4

    .line 23
    aput-char v4, v1, v3

    .line 24
    .line 25
    add-int/lit8 v4, v4, -0x64

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
    if-lez p1, :cond_1

    .line 38
    .line 39
    sput p1, LVa/Ab;->w:I

    .line 40
    .line 41
    new-array p0, p2, [C

    .line 42
    .line 43
    invoke-static {v1, v2, p0, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    sget p1, LVa/Ab;->w:I

    .line 47
    .line 48
    sub-int p3, p2, p1

    .line 49
    .line 50
    invoke-static {p0, v2, v1, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    sget p1, LVa/Ab;->w:I

    .line 54
    .line 55
    sub-int p3, p2, p1

    .line 56
    .line 57
    invoke-static {p0, p1, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    :cond_1
    if-eqz p4, :cond_3

    .line 61
    .line 62
    new-array p0, p2, [C

    .line 63
    .line 64
    sput v2, LVa/Ab;->v:I

    .line 65
    .line 66
    :goto_1
    sget p1, LVa/Ab;->v:I

    .line 67
    .line 68
    if-ge p1, p2, :cond_2

    .line 69
    .line 70
    sub-int p3, p2, p1

    .line 71
    .line 72
    add-int/lit8 p3, p3, -0x1

    .line 73
    .line 74
    aget-char p3, v1, p3

    .line 75
    .line 76
    aput-char p3, p0, p1

    .line 77
    .line 78
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    sput p1, LVa/Ab;->v:I

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

.method public static g(Ljava/lang/String;I)Ljava/lang/String;
    .locals 12

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
    sget-object v0, LVa/Ab;->F:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    array-length v1, p0

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
    array-length v5, p0

    .line 22
    if-ge v4, v5, :cond_1

    .line 23
    .line 24
    aget-char v5, p0, v4

    .line 25
    .line 26
    aput-char v5, v3, v2

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    aget-char v4, p0, v4

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
    add-int/lit16 v10, v10, 0x52c8

    .line 52
    .line 53
    xor-int/2addr v9, v10

    .line 54
    ushr-int/lit8 v10, v8, 0x5

    .line 55
    .line 56
    const v11, 0xf97f

    .line 57
    .line 58
    .line 59
    add-int/2addr v10, v11

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
    add-int/lit16 v10, v10, 0x1465

    .line 70
    .line 71
    xor-int/2addr v9, v10

    .line 72
    ushr-int/lit8 v7, v7, 0x5

    .line 73
    .line 74
    const v10, 0xbdd3

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
    new-instance p0, Ljava/lang/String;

    .line 110
    .line 111
    invoke-direct {p0, v1, v2, p1}, Ljava/lang/String;-><init>([CII)V

    .line 112
    .line 113
    .line 114
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    return-object p0

    .line 116
    :goto_2
    monitor-exit v0

    .line 117
    throw p0
.end method


# virtual methods
.method public final a(Landroid/webkit/WebView;)V
    .locals 1

    .line 1
    sget v0, LVa/Vb;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x27

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Vb;->c:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/Vb;->a:LVa/b;

    .line 10
    .line 11
    invoke-static {v0, p1}, LVa/b;->B(LVa/b;Landroid/webkit/WebView;)V

    .line 12
    .line 13
    .line 14
    sget p1, LVa/Vb;->c:I

    .line 15
    .line 16
    add-int/lit8 p1, p1, 0x21

    .line 17
    .line 18
    rem-int/lit16 p1, p1, 0x80

    .line 19
    .line 20
    sput p1, LVa/Vb;->b:I

    .line 21
    .line 22
    return-void
.end method

.method public final b(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    new-instance v0, LVa/Ub;

    .line 2
    .line 3
    invoke-direct {v0}, LVa/Ub;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, LVa/Ub;->g:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p1, v0, LVa/Ub;->d:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, v0, LVa/Ub;->e:Ljava/lang/Object;

    .line 11
    .line 12
    iput-boolean p3, v0, LVa/Ub;->f:Z

    .line 13
    .line 14
    invoke-static {v0}, LVa/Cb;->e(LVa/Ba;)V

    .line 15
    .line 16
    .line 17
    sget p1, LVa/Vb;->c:I

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x79

    .line 20
    .line 21
    rem-int/lit16 p1, p1, 0x80

    .line 22
    .line 23
    sput p1, LVa/Vb;->b:I

    .line 24
    .line 25
    return-void
.end method

.method public final c(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 6

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, LVa/sa;->j:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 9
    .line 10
    .line 11
    sget-object p2, LVa/sa;->k:Ljava/lang/String;

    .line 12
    .line 13
    sget-object v1, LVa/sa;->l:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, p2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 16
    .line 17
    .line 18
    new-instance p2, Lorg/json/JSONObject;

    .line 19
    .line 20
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 21
    .line 22
    .line 23
    sget-object v1, LVa/sa;->i:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, LVa/Vb;->a:LVa/b;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, LVa/b;->t(Landroid/webkit/WebView;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, p2, p1, p0, v1}, LVa/Mb;->w(Lorg/json/JSONObject;Landroid/view/View;LVa/Vb;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    sget p1, LVa/Vb;->c:I

    .line 38
    .line 39
    add-int/lit8 p1, p1, 0x43

    .line 40
    .line 41
    rem-int/lit16 p1, p1, 0x80

    .line 42
    .line 43
    sput p1, LVa/Vb;->b:I

    .line 44
    .line 45
    return-void

    .line 46
    :catch_0
    move-exception p1

    .line 47
    const/4 p2, 0x0

    .line 48
    invoke-static {p2, p2}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    add-int/lit8 v0, v0, 0x10

    .line 53
    .line 54
    invoke-static {p2, p2}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    add-int/lit8 v1, v1, 0x10

    .line 59
    .line 60
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 61
    .line 62
    .line 63
    move-result-wide v2

    .line 64
    const-wide/16 v4, 0x0

    .line 65
    .line 66
    cmp-long v2, v2, v4

    .line 67
    .line 68
    add-int/lit16 v2, v2, 0xc4

    .line 69
    .line 70
    const-string v3, "\ufff6\u0004\u0001\ufff5\u0008\u0004\u0016\uffe0\u0003\uffe7\u0000\r\u0003\u000b\u0004\u0011"

    .line 71
    .line 72
    invoke-static {v3, v0, v1, v2, p2}, LVa/Vb;->f(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {p2, p2, p2, p2}, Landroid/graphics/Color;->argb(IIII)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    rsub-int/lit8 v1, v1, 0x6

    .line 85
    .line 86
    const/16 v2, 0x30

    .line 87
    .line 88
    invoke-static {v2}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    add-int/lit8 v3, v3, -0x13

    .line 93
    .line 94
    const-string v4, ""

    .line 95
    .line 96
    invoke-static {v4, v2, p2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    rsub-int v2, v2, 0xc3

    .line 101
    .line 102
    const-string v4, "\uffc0\u0012\u000f\u0012\u0012\uffe5\u000e\u000f\u0013\n\uffc0\u0014\u000e\u0005\u0016\u0005\uffc0\u0003\u0003\u0017\uffc0\u0007\u000e\t\u0014\u0001\u0005\u0012\u0003"

    .line 103
    .line 104
    const/4 v5, 0x1

    .line 105
    invoke-static {v4, v1, v3, v2, v5}, LVa/Vb;->f(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-static {v0, v1, p1, p2}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public final d(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    .line 1
    sget p2, LVa/Vb;->c:I

    .line 2
    .line 3
    add-int/lit8 p2, p2, 0x7

    .line 4
    .line 5
    rem-int/lit16 p2, p2, 0x80

    .line 6
    .line 7
    sput p2, LVa/Vb;->b:I

    .line 8
    .line 9
    const/16 p2, 0x3f

    .line 10
    .line 11
    invoke-virtual {p3, p2}, Ljava/lang/String;->indexOf(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p3, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p3, p2}, Ljava/lang/String;->indexOf(I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x1

    .line 25
    add-int/2addr v2, v3

    .line 26
    invoke-virtual {p3, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    const-string v2, ""

    .line 31
    .line 32
    invoke-static {v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    add-int/lit8 v4, v4, 0x5

    .line 37
    .line 38
    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    rsub-int/lit8 v5, v5, 0x6

    .line 43
    .line 44
    invoke-static {v1, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    add-int/lit16 v6, v6, 0xcc

    .line 49
    .line 50
    const-string v7, "\ufff9\ufffb\ufffa\u000c\u000b\ufffd"

    .line 51
    .line 52
    invoke-static {v7, v4, v5, v6, v3}, LVa/Vb;->f(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    iget-object v5, p0, LVa/Vb;->a:LVa/b;

    .line 65
    .line 66
    if-eqz v4, :cond_0

    .line 67
    .line 68
    invoke-static {v5, p1}, LVa/b;->B(LVa/b;Landroid/webkit/WebView;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_0
    invoke-static {v2, v1}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    add-int/lit8 v2, v2, 0x5

    .line 77
    .line 78
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 79
    .line 80
    .line 81
    move-result-wide v6

    .line 82
    const-wide/16 v8, 0x0

    .line 83
    .line 84
    cmp-long v4, v6, v8

    .line 85
    .line 86
    rsub-int/lit8 v4, v4, 0x7

    .line 87
    .line 88
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 89
    .line 90
    .line 91
    move-result-wide v6

    .line 92
    cmp-long v6, v6, v8

    .line 93
    .line 94
    rsub-int v6, v6, 0xcc

    .line 95
    .line 96
    const-string v7, "\ufffa\ufffc\ufffb\r\u000c\ufffb"

    .line 97
    .line 98
    invoke-static {v7, v2, v4, v6, v3}, LVa/Vb;->f(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-nez v2, :cond_5

    .line 111
    .line 112
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    rsub-int/lit8 p2, p2, 0x6

    .line 117
    .line 118
    const-string v2, "\ub839\ubd02\ufa08\u40bc\u20dc\ud5e1"

    .line 119
    .line 120
    invoke-static {v2, p2}, LVa/Vb;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    if-eqz p2, :cond_2

    .line 133
    .line 134
    invoke-static {p3}, LVa/b;->u(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    sget p3, LVa/b;->q:I

    .line 139
    .line 140
    add-int/lit8 p3, p3, 0x11

    .line 141
    .line 142
    rem-int/lit16 v0, p3, 0x80

    .line 143
    .line 144
    sput v0, LVa/b;->p:I

    .line 145
    .line 146
    rem-int/lit8 p3, p3, 0x2

    .line 147
    .line 148
    if-nez p3, :cond_1

    .line 149
    .line 150
    invoke-virtual {v5}, LVa/b;->D()LVa/e0;

    .line 151
    .line 152
    .line 153
    move-result-object p3

    .line 154
    invoke-virtual {v5, p1}, LVa/b;->t(Landroid/webkit/WebView;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v5, p2, p1, p3, v0}, LVa/Mb;->n(Lorg/json/JSONObject;Landroid/view/View;LVa/e0;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_1
    invoke-virtual {v5}, LVa/b;->D()LVa/e0;

    .line 163
    .line 164
    .line 165
    const/4 p1, 0x0

    .line 166
    throw p1

    .line 167
    :cond_2
    invoke-static {v1, v1}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    rsub-int/lit8 p2, p2, 0x6

    .line 172
    .line 173
    const-string v2, "\ub839\ubd02\ufa08\u40bc\ua35b\u8188"

    .line 174
    .line 175
    invoke-static {v2, p2}, LVa/Vb;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    if-eqz p2, :cond_3

    .line 188
    .line 189
    invoke-static {p3}, LVa/b;->u(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    sget-object p3, LVa/sa;->f:Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {p2, p3}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v5, p1}, LVa/b;->t(Landroid/webkit/WebView;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p3

    .line 202
    invoke-virtual {v5, p2, p1, p3}, LVa/Mb;->h(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :cond_3
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    add-int/lit8 p1, p1, 0x6

    .line 211
    .line 212
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    const/4 v2, 0x0

    .line 217
    cmpl-float p2, p2, v2

    .line 218
    .line 219
    add-int/lit8 p2, p2, 0x6

    .line 220
    .line 221
    invoke-static {v8, v9}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    add-int/lit16 v4, v4, 0xcd

    .line 226
    .line 227
    const-string v5, "\u000b\u000c\ufffa\ufffb\ufff9\ufffc"

    .line 228
    .line 229
    invoke-static {v5, p1, p2, v4, v1}, LVa/Vb;->f(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    if-eqz p1, :cond_4

    .line 242
    .line 243
    sget p1, LVa/Vb;->b:I

    .line 244
    .line 245
    add-int/lit8 p1, p1, 0x7b

    .line 246
    .line 247
    rem-int/lit16 p1, p1, 0x80

    .line 248
    .line 249
    sput p1, LVa/Vb;->c:I

    .line 250
    .line 251
    invoke-static {p3}, LVa/b;->u(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-static {v1}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 256
    .line 257
    .line 258
    move-result-wide p2

    .line 259
    cmp-long p2, p2, v8

    .line 260
    .line 261
    rsub-int/lit8 p2, p2, 0x3

    .line 262
    .line 263
    const-string p3, "\u8bca\u956b\u7dd5\uc05f"

    .line 264
    .line 265
    invoke-static {p3, p2}, LVa/Vb;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p2

    .line 269
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p2

    .line 277
    invoke-static {v2, v2}, Landroid/graphics/PointF;->length(FF)F

    .line 278
    .line 279
    .line 280
    move-result p3

    .line 281
    cmpl-float p3, p3, v2

    .line 282
    .line 283
    add-int/lit8 p3, p3, 0x5

    .line 284
    .line 285
    const-string v0, "\u7b03\u2cf4\u74cb\u7626\u7dd5\uc05f"

    .line 286
    .line 287
    invoke-static {v0, p3}, LVa/Vb;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object p3

    .line 291
    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p3

    .line 295
    invoke-virtual {p1, p3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p3

    .line 299
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 300
    .line 301
    .line 302
    move-result-wide v4

    .line 303
    cmp-long v0, v4, v8

    .line 304
    .line 305
    add-int/lit8 v0, v0, 0x3

    .line 306
    .line 307
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    shr-int/lit8 v2, v2, 0x10

    .line 312
    .line 313
    add-int/lit8 v2, v2, 0x6

    .line 314
    .line 315
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    add-int/lit16 v1, v1, 0xcc

    .line 320
    .line 321
    const-string v4, "\u0007\ufffb\n\ufffd\ufffd\ufffc"

    .line 322
    .line 323
    invoke-static {v4, v0, v2, v1, v3}, LVa/Vb;->f(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-static {v8, v9}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    rsub-int/lit8 v1, v1, 0x5

    .line 340
    .line 341
    const-string v2, "\u7b03\u2cf4\ub839\ubd02\u774e\ue4d0"

    .line 342
    .line 343
    invoke-static {v2, v1}, LVa/Vb;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    sget v1, LVa/Ab;->o:I

    .line 356
    .line 357
    add-int/lit8 v1, v1, 0x5d

    .line 358
    .line 359
    rem-int/lit16 v1, v1, 0x80

    .line 360
    .line 361
    sput v1, LVa/Ab;->p:I

    .line 362
    .line 363
    :try_start_0
    invoke-static {p2, p3, v0, p1}, LVa/Ab;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 364
    .line 365
    .line 366
    sget p1, LVa/Ab;->p:I

    .line 367
    .line 368
    add-int/lit8 p1, p1, 0x79

    .line 369
    .line 370
    rem-int/lit16 p1, p1, 0x80

    .line 371
    .line 372
    sput p1, LVa/Ab;->o:I

    .line 373
    .line 374
    :catchall_0
    :cond_4
    return-void

    .line 375
    :cond_5
    sget v0, LVa/Vb;->c:I

    .line 376
    .line 377
    add-int/2addr v0, p2

    .line 378
    rem-int/lit16 v0, v0, 0x80

    .line 379
    .line 380
    sput v0, LVa/Vb;->b:I

    .line 381
    .line 382
    invoke-static {p3}, LVa/b;->u(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 383
    .line 384
    .line 385
    move-result-object p2

    .line 386
    invoke-virtual {v5, p1}, LVa/b;->t(Landroid/webkit/WebView;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object p3

    .line 390
    invoke-virtual {v5, p2, p1, p3}, LVa/b;->x(Lorg/json/JSONObject;Landroid/webkit/WebView;Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    return-void
.end method
