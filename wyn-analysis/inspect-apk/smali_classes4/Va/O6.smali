.class public final LVa/O6;
.super Lcom/unity3d/services/core/webview/WebViewApp;
.source "SourceFile"

# interfaces
.implements LVa/H9;


# static fields
.field public static final d:[C

.field public static e:I = 0x0

.field public static f:I = 0x1


# instance fields
.field public final a:Lcom/unity3d/services/core/webview/WebViewApp;

.field public final b:LVa/Ra;

.field public final synthetic c:LVa/P6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x24

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/O6;->d:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x57s
        0x65s
        0x62s
        0x56s
        0x69s
        0x77s
        0x41s
        0x70s
        0x2es
        0x73s
        0x74s
        0x4cs
        0x6fs
        0x61s
        0x64s
        0x46s
        0x6cs
        0x75s
        0x72s
        0x4ds
        0x67s
        0x43s
        0x49s
        0x6es
        0x7as
        0x66s
        0x76s
        0x6bs
        0x68s
        0x63s
        0x6ds
        0x58s
        0x59s
        0x5as
        0x5bs
        0x5cs
    .end array-data
.end method

.method public constructor <init>(LVa/P6;Lcom/unity3d/services/core/webview/WebViewApp;LVa/Ra;)V
    .locals 0

    .line 1
    iput-object p1, p0, LVa/O6;->c:LVa/P6;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/unity3d/services/core/webview/WebViewApp;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 7
    .line 8
    iput-object p3, p0, LVa/O6;->b:LVa/Ra;

    .line 9
    .line 10
    return-void
.end method

.method public static a(BILjava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->B:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sget-object v1, LVa/O6;->d:[C

    .line 11
    .line 12
    new-array v2, p1, [C

    .line 13
    .line 14
    rem-int/lit8 v3, p1, 0x2

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    add-int/lit8 p1, p1, -0x1

    .line 19
    .line 20
    aget-char v3, p2, p1

    .line 21
    .line 22
    sub-int/2addr v3, p0

    .line 23
    int-to-char v3, v3

    .line 24
    aput-char v3, v2, p1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_3

    .line 29
    :cond_0
    :goto_0
    const/4 v3, 0x1

    .line 30
    if-le p1, v3, :cond_4

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    sput v3, LVa/Ab;->A:I

    .line 34
    .line 35
    :goto_1
    sget v3, LVa/Ab;->A:I

    .line 36
    .line 37
    if-ge v3, p1, :cond_4

    .line 38
    .line 39
    aget-char v4, p2, v3

    .line 40
    .line 41
    add-int/lit8 v5, v3, 0x1

    .line 42
    .line 43
    aget-char v6, p2, v5

    .line 44
    .line 45
    if-ne v4, v6, :cond_1

    .line 46
    .line 47
    sub-int/2addr v4, p0

    .line 48
    int-to-char v4, v4

    .line 49
    aput-char v4, v2, v3

    .line 50
    .line 51
    sub-int/2addr v6, p0

    .line 52
    int-to-char v4, v6

    .line 53
    aput-char v4, v2, v5

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    div-int/lit8 v7, v4, 0x6

    .line 57
    .line 58
    rem-int/lit8 v4, v4, 0x6

    .line 59
    .line 60
    div-int/lit8 v8, v6, 0x6

    .line 61
    .line 62
    rem-int/lit8 v6, v6, 0x6

    .line 63
    .line 64
    if-ne v4, v6, :cond_2

    .line 65
    .line 66
    add-int/lit8 v7, v7, 0x5

    .line 67
    .line 68
    rem-int/lit8 v7, v7, 0x6

    .line 69
    .line 70
    add-int/lit8 v8, v8, 0x5

    .line 71
    .line 72
    rem-int/lit8 v8, v8, 0x6

    .line 73
    .line 74
    mul-int/lit8 v7, v7, 0x6

    .line 75
    .line 76
    add-int/2addr v7, v4

    .line 77
    mul-int/lit8 v8, v8, 0x6

    .line 78
    .line 79
    add-int/2addr v8, v6

    .line 80
    aget-char v4, v1, v7

    .line 81
    .line 82
    aput-char v4, v2, v3

    .line 83
    .line 84
    aget-char v4, v1, v8

    .line 85
    .line 86
    aput-char v4, v2, v5

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    if-ne v7, v8, :cond_3

    .line 90
    .line 91
    add-int/lit8 v4, v4, 0x5

    .line 92
    .line 93
    rem-int/lit8 v4, v4, 0x6

    .line 94
    .line 95
    add-int/lit8 v6, v6, 0x5

    .line 96
    .line 97
    rem-int/lit8 v6, v6, 0x6

    .line 98
    .line 99
    mul-int/lit8 v7, v7, 0x6

    .line 100
    .line 101
    add-int/2addr v7, v4

    .line 102
    mul-int/lit8 v8, v8, 0x6

    .line 103
    .line 104
    add-int/2addr v8, v6

    .line 105
    aget-char v4, v1, v7

    .line 106
    .line 107
    aput-char v4, v2, v3

    .line 108
    .line 109
    aget-char v4, v1, v8

    .line 110
    .line 111
    aput-char v4, v2, v5

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    mul-int/lit8 v7, v7, 0x6

    .line 115
    .line 116
    add-int/2addr v7, v6

    .line 117
    mul-int/lit8 v8, v8, 0x6

    .line 118
    .line 119
    add-int/2addr v8, v4

    .line 120
    aget-char v4, v1, v7

    .line 121
    .line 122
    aput-char v4, v2, v3

    .line 123
    .line 124
    aget-char v4, v1, v8

    .line 125
    .line 126
    aput-char v4, v2, v5

    .line 127
    .line 128
    :goto_2
    add-int/lit8 v3, v3, 0x2

    .line 129
    .line 130
    sput v3, LVa/Ab;->A:I

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_4
    new-instance p0, Ljava/lang/String;

    .line 134
    .line 135
    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    .line 136
    .line 137
    .line 138
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    return-object p0

    .line 140
    :goto_3
    monitor-exit v0

    .line 141
    throw p0
.end method

.method public static b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, "\ufbba\u85f9\ude48\uca21"

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
    const-wide v6, -0x35de21b77a060446L    # -1.3057270555200738E49

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
.method public final addCallback(Lcom/unity3d/services/core/webview/bridge/NativeCallback;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    shr-int/lit8 v1, v1, 0x10

    .line 7
    .line 8
    add-int/lit8 v1, v1, 0x16

    .line 9
    .line 10
    invoke-static {v0, v0, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    rsub-int/lit8 v2, v2, 0x1f

    .line 15
    .line 16
    int-to-byte v2, v2

    .line 17
    const-string v3, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u008f\u008f\u0007\u000e\u0083\u0083\u0013\u000f\u008b\u008b\u0001\u000e\u0018\u001c"

    .line 18
    .line 19
    invoke-static {v2, v1, v3}, LVa/O6;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v2, 0x1

    .line 28
    new-array v2, v2, [Ljava/lang/Object;

    .line 29
    .line 30
    aput-object p1, v2, v0

    .line 31
    .line 32
    iget-object v0, p0, LVa/O6;->c:LVa/P6;

    .line 33
    .line 34
    iget-object v3, p0, LVa/O6;->b:LVa/Ra;

    .line 35
    .line 36
    invoke-virtual {v0, p0, v3, v1, v2}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    sget v1, LVa/O6;->e:I

    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1f

    .line 46
    .line 47
    rem-int/lit16 v1, v1, 0x80

    .line 48
    .line 49
    sput v1, LVa/O6;->f:I

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->addCallback(Lcom/unity3d/services/core/webview/bridge/NativeCallback;)V

    .line 52
    .line 53
    .line 54
    sget p1, LVa/O6;->f:I

    .line 55
    .line 56
    add-int/lit8 p1, p1, 0x1f

    .line 57
    .line 58
    rem-int/lit16 p1, p1, 0x80

    .line 59
    .line 60
    sput p1, LVa/O6;->e:I

    .line 61
    .line 62
    :cond_0
    return-void
.end method

.method public final d()Ljava/lang/Object;
    .locals 1

    .line 1
    sget v0, LVa/O6;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/O6;->e:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x47

    .line 10
    .line 11
    rem-int/lit16 v0, v0, 0x80

    .line 12
    .line 13
    sput v0, LVa/O6;->f:I

    .line 14
    .line 15
    iget-object v0, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 16
    .line 17
    return-object v0
.end method

.method public final getCallback(Ljava/lang/String;)Lcom/unity3d/services/core/webview/bridge/NativeCallback;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    sget v1, LVa/O6;->f:I

    .line 3
    .line 4
    add-int/lit8 v1, v1, 0x31

    .line 5
    .line 6
    rem-int/lit16 v1, v1, 0x80

    .line 7
    .line 8
    sput v1, LVa/O6;->e:I

    .line 9
    .line 10
    const-string v1, ""

    .line 11
    .line 12
    invoke-static {v1, v0}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    int-to-char v1, v1

    .line 17
    invoke-static {v0, v0}, Landroid/view/View;->resolveSize(II)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const-string v3, "\ud963\u9858\uf466\u7ab9"

    .line 22
    .line 23
    const-string v4, "\uae97\u33fc\ud147\u3f0a\ubcca\u973a\uaa86\u2e18\u283a\u10a4\ua15b\ud659\u1f0a\ua179\u5383\u9621\uf793\u2550\u1285\u8f19\ud40d\u9da6"

    .line 24
    .line 25
    invoke-static {v1, v3, v4, v2}, LVa/O6;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x1

    .line 34
    new-array v2, v2, [Ljava/lang/Object;

    .line 35
    .line 36
    aput-object p1, v2, v0

    .line 37
    .line 38
    iget-object v0, p0, LVa/O6;->c:LVa/P6;

    .line 39
    .line 40
    iget-object v3, p0, LVa/O6;->b:LVa/Ra;

    .line 41
    .line 42
    invoke-virtual {v0, p0, v3, v1, v2}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->getCallback(Ljava/lang/String;)Lcom/unity3d/services/core/webview/bridge/NativeCallback;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    sget v0, LVa/O6;->f:I

    .line 55
    .line 56
    add-int/lit8 v0, v0, 0x5

    .line 57
    .line 58
    rem-int/lit16 v2, v0, 0x80

    .line 59
    .line 60
    sput v2, LVa/O6;->e:I

    .line 61
    .line 62
    rem-int/lit8 v0, v0, 0x2

    .line 63
    .line 64
    if-nez v0, :cond_0

    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_0
    throw v1

    .line 68
    :cond_1
    return-object v1
.end method

.method public final getConfiguration()Lcom/unity3d/services/core/configuration/Configuration;
    .locals 4

    .line 1
    sget v0, LVa/O6;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/O6;->e:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    rsub-int/lit8 v1, v1, 0x1b

    .line 15
    .line 16
    const-string v2, ""

    .line 17
    .line 18
    const/16 v3, 0x30

    .line 19
    .line 20
    invoke-static {v2, v3, v0}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    rsub-int/lit8 v2, v2, 0x7b

    .line 25
    .line 26
    int-to-byte v2, v2

    .line 27
    const-string v3, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u00ec\u00ec\u000e\u001a\u0004\u0007\u0012\u000f\u0013\u001d\u0002\u0016\u000c\u0017\u0010\u0007\u0000\u0010\u00ea"

    .line 28
    .line 29
    invoke-static {v2, v1, v3}, LVa/O6;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-array v0, v0, [Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v2, p0, LVa/O6;->c:LVa/P6;

    .line 40
    .line 41
    iget-object v3, p0, LVa/O6;->b:LVa/Ra;

    .line 42
    .line 43
    invoke-virtual {v2, p0, v3, v1, v0}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    sget v1, LVa/O6;->e:I

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x31

    .line 53
    .line 54
    rem-int/lit16 v1, v1, 0x80

    .line 55
    .line 56
    sput v1, LVa/O6;->f:I

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/unity3d/services/core/webview/WebViewApp;->getConfiguration()Lcom/unity3d/services/core/configuration/Configuration;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0

    .line 63
    :cond_0
    const/4 v0, 0x0

    .line 64
    return-object v0
.end method

.method public final getErrorStateFromWebAppCode()Lcom/unity3d/services/core/configuration/ErrorState;
    .locals 5

    .line 1
    sget v0, LVa/O6;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x15

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/O6;->e:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0, v0}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    const-wide/16 v3, 0x0

    .line 15
    .line 16
    cmp-long v1, v1, v3

    .line 17
    .line 18
    rsub-int/lit8 v1, v1, -0x1

    .line 19
    .line 20
    int-to-char v1, v1

    .line 21
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    shr-int/lit8 v2, v2, 0x10

    .line 26
    .line 27
    const-string v3, "\ub01c\u1250\u0fdf\u7f00"

    .line 28
    .line 29
    const-string v4, "\u2b51\u4f33\u3d92\u574d\uf7f4\ueb1f\u82dd\u7289\ue2c6\u66ab\u8f22\u9f44\uade1\u80f7\ua116\u76fe\u2553\ued3a\u14bf\u59d6\uac8a\u5aaa\ud7eb\u6c09\u627b\ud9a9\u0f4f\u1d86\udde8\ufb6f\uf38c\u5be5\uab3e\u8d71\uf192\ua73f\u216e\u5f68"

    .line 30
    .line 31
    invoke-static {v1, v3, v4, v2}, LVa/O6;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-array v2, v0, [Ljava/lang/Object;

    .line 40
    .line 41
    iget-object v3, p0, LVa/O6;->c:LVa/P6;

    .line 42
    .line 43
    iget-object v4, p0, LVa/O6;->b:LVa/Ra;

    .line 44
    .line 45
    invoke-virtual {v3, p0, v4, v1, v2}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    sget v2, LVa/O6;->e:I

    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x75

    .line 55
    .line 56
    rem-int/lit16 v3, v2, 0x80

    .line 57
    .line 58
    sput v3, LVa/O6;->f:I

    .line 59
    .line 60
    rem-int/lit8 v2, v2, 0x2

    .line 61
    .line 62
    if-nez v2, :cond_0

    .line 63
    .line 64
    invoke-virtual {v1}, Lcom/unity3d/services/core/webview/WebViewApp;->getErrorStateFromWebAppCode()Lcom/unity3d/services/core/configuration/ErrorState;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const/16 v2, 0x47

    .line 69
    .line 70
    div-int/2addr v2, v0

    .line 71
    return-object v1

    .line 72
    :cond_0
    invoke-virtual {v1}, Lcom/unity3d/services/core/webview/WebViewApp;->getErrorStateFromWebAppCode()Lcom/unity3d/services/core/configuration/ErrorState;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    return-object v0

    .line 77
    :cond_1
    const/4 v0, 0x0

    .line 78
    return-object v0
.end method

.method public final getWebAppFailureCode()I
    .locals 7

    .line 1
    sget v0, LVa/O6;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0xd

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/O6;->e:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0082\u0082\u000e\u001a\u0004\u0007\u0001\u0002\u0000\u0008\u0082\u0082\u0010\u000e\n\u0016\u000c\u0017\u0003\u0013\r\u000fw"

    .line 12
    .line 13
    iget-object v2, p0, LVa/O6;->b:LVa/Ra;

    .line 14
    .line 15
    iget-object v3, p0, LVa/O6;->c:LVa/P6;

    .line 16
    .line 17
    iget-object v4, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/16 v0, 0x78

    .line 23
    .line 24
    const/4 v6, 0x1

    .line 25
    invoke-static {v6, v6, v5}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    ushr-int/2addr v0, v6

    .line 30
    invoke-static {v5}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    rsub-int/lit8 v6, v6, 0x22

    .line 35
    .line 36
    int-to-byte v6, v6

    .line 37
    invoke-static {v6, v0, v1}, LVa/O6;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-array v1, v5, [Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {v3, p0, v2, v0, v1}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-static {v5, v5, v5}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    rsub-int/lit8 v0, v0, 0x1f

    .line 58
    .line 59
    invoke-static {v5}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    rsub-int/lit8 v6, v6, 0x12

    .line 64
    .line 65
    int-to-byte v6, v6

    .line 66
    invoke-static {v6, v0, v1}, LVa/O6;->a(BILjava/lang/String;)Ljava/lang/String;

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
    new-array v1, v5, [Ljava/lang/Object;

    .line 75
    .line 76
    invoke-virtual {v3, p0, v2, v0, v1}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    if-eqz v4, :cond_1

    .line 80
    .line 81
    :goto_0
    invoke-virtual {v4}, Lcom/unity3d/services/core/webview/WebViewApp;->getWebAppFailureCode()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    sget v1, LVa/O6;->f:I

    .line 86
    .line 87
    add-int/lit8 v1, v1, 0x2d

    .line 88
    .line 89
    rem-int/lit16 v1, v1, 0x80

    .line 90
    .line 91
    sput v1, LVa/O6;->e:I

    .line 92
    .line 93
    return v0

    .line 94
    :cond_1
    return v5
.end method

.method public final getWebAppFailureMessage()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/16 v1, 0x30

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v0, v1, v2, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    rsub-int/lit8 v0, v0, 0x21

    .line 11
    .line 12
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    shr-int/lit8 v1, v1, 0x10

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x4a

    .line 19
    .line 20
    int-to-byte v1, v1

    .line 21
    const-string v3, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u00ba\u00ba\u000e\u001a\u0004\u0007\u0001\u0002\u0000\u0008\u00ba\u00ba\u0010\u000e\n\u0016\u000c\u0017\u0007\u0019\u0003\u0007\u0007\u000f\u0013\u0002"

    .line 22
    .line 23
    invoke-static {v1, v0, v3}, LVa/O6;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-array v1, v2, [Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v2, p0, LVa/O6;->c:LVa/P6;

    .line 34
    .line 35
    iget-object v3, p0, LVa/O6;->b:LVa/Ra;

    .line 36
    .line 37
    invoke-virtual {v2, p0, v3, v0, v1}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    iget-object v1, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    sget v2, LVa/O6;->f:I

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x49

    .line 48
    .line 49
    rem-int/lit16 v3, v2, 0x80

    .line 50
    .line 51
    sput v3, LVa/O6;->e:I

    .line 52
    .line 53
    rem-int/lit8 v2, v2, 0x2

    .line 54
    .line 55
    if-nez v2, :cond_0

    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/unity3d/services/core/webview/WebViewApp;->getWebAppFailureMessage()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0

    .line 62
    :cond_0
    invoke-virtual {v1}, Lcom/unity3d/services/core/webview/WebViewApp;->getWebAppFailureMessage()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :cond_1
    sget v1, LVa/O6;->f:I

    .line 67
    .line 68
    add-int/lit8 v1, v1, 0x55

    .line 69
    .line 70
    rem-int/lit16 v1, v1, 0x80

    .line 71
    .line 72
    sput v1, LVa/O6;->e:I

    .line 73
    .line 74
    return-object v0
.end method

.method public final getWebView()Lcom/unity3d/services/core/webview/WebView;
    .locals 4

    .line 1
    sget v0, LVa/O6;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/O6;->e:I

    .line 8
    .line 9
    const-string v0, ""

    .line 10
    .line 11
    invoke-static {v0}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    rsub-int/lit8 v0, v0, -0x1

    .line 16
    .line 17
    int-to-char v0, v0

    .line 18
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    int-to-byte v1, v1

    .line 23
    const v2, 0x371b5b25

    .line 24
    .line 25
    .line 26
    sub-int/2addr v2, v1

    .line 27
    const-string v1, "\u26a1\u1b5b\uca37\uaeba"

    .line 28
    .line 29
    const-string v3, "\ubaa8\u76c2\u82a7\u152f\u606e\ud9af\u605d\u6485\u354e\uc280\uc1a1\ua526\uc019\u5e01\uc512\u75e5\u641c\u9490\u29a7\uc131\u43bc"

    .line 30
    .line 31
    invoke-static {v0, v1, v3, v2}, LVa/O6;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x0

    .line 40
    new-array v1, v1, [Ljava/lang/Object;

    .line 41
    .line 42
    iget-object v2, p0, LVa/O6;->c:LVa/P6;

    .line 43
    .line 44
    iget-object v3, p0, LVa/O6;->b:LVa/Ra;

    .line 45
    .line 46
    invoke-virtual {v2, p0, v3, v0, v1}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/unity3d/services/core/webview/WebViewApp;->getWebView()Lcom/unity3d/services/core/webview/WebView;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sget v2, LVa/O6;->e:I

    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x3f

    .line 61
    .line 62
    rem-int/lit16 v3, v2, 0x80

    .line 63
    .line 64
    sput v3, LVa/O6;->f:I

    .line 65
    .line 66
    rem-int/lit8 v2, v2, 0x2

    .line 67
    .line 68
    if-eqz v2, :cond_0

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_0
    throw v1

    .line 72
    :cond_1
    return-object v1
.end method

.method public final invokeCallback(Lcom/unity3d/services/core/webview/bridge/Invocation;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, ""

    .line 3
    .line 4
    invoke-static {v1, v0}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    rsub-int/lit8 v1, v1, 0x19

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    shr-int/lit8 v2, v2, 0x16

    .line 15
    .line 16
    rsub-int/lit8 v2, v2, 0x5a

    .line 17
    .line 18
    int-to-byte v2, v2

    .line 19
    const-string v3, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u00ca\u00ca\n\u0002\u0014\u001d\u000f\u0018\u0003\u0013\u000e\u0011\u000e\u0004\u0011\u0019\u00c5"

    .line 20
    .line 21
    invoke-static {v2, v1, v3}, LVa/O6;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v2, 0x1

    .line 30
    new-array v2, v2, [Ljava/lang/Object;

    .line 31
    .line 32
    aput-object p1, v2, v0

    .line 33
    .line 34
    iget-object v3, p0, LVa/O6;->c:LVa/P6;

    .line 35
    .line 36
    iget-object v4, p0, LVa/O6;->b:LVa/Ra;

    .line 37
    .line 38
    invoke-virtual {v3, p0, v4, v1, v2}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    sget v2, LVa/O6;->e:I

    .line 46
    .line 47
    add-int/lit8 v2, v2, 0x55

    .line 48
    .line 49
    rem-int/lit16 v3, v2, 0x80

    .line 50
    .line 51
    sput v3, LVa/O6;->f:I

    .line 52
    .line 53
    rem-int/lit8 v2, v2, 0x2

    .line 54
    .line 55
    if-nez v2, :cond_0

    .line 56
    .line 57
    invoke-virtual {v1, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->invokeCallback(Lcom/unity3d/services/core/webview/bridge/Invocation;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    const/16 v1, 0x57

    .line 62
    .line 63
    div-int/2addr v1, v0

    .line 64
    return p1

    .line 65
    :cond_0
    invoke-virtual {v1, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->invokeCallback(Lcom/unity3d/services/core/webview/bridge/Invocation;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    return p1

    .line 70
    :cond_1
    sget p1, LVa/O6;->f:I

    .line 71
    .line 72
    add-int/lit8 p1, p1, 0x13

    .line 73
    .line 74
    rem-int/lit16 p1, p1, 0x80

    .line 75
    .line 76
    sput p1, LVa/O6;->e:I

    .line 77
    .line 78
    return v0
.end method

.method public final varargs invokeMethod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    sget v2, LVa/O6;->e:I

    .line 4
    .line 5
    add-int/lit8 v2, v2, 0x7d

    .line 6
    .line 7
    rem-int/lit16 v2, v2, 0x80

    .line 8
    .line 9
    sput v2, LVa/O6;->f:I

    .line 10
    .line 11
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    shr-int/lit8 v2, v2, 0x10

    .line 16
    .line 17
    rsub-int/lit8 v2, v2, 0x17

    .line 18
    .line 19
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    shr-int/lit8 v3, v3, 0x10

    .line 24
    .line 25
    add-int/2addr v3, v1

    .line 26
    int-to-byte v3, v3

    .line 27
    const-string v4, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000brr\n\u0002\u0014\u001d\u000f\u0018\u0007\u0019\u0004\u0007\u0018\u0010f"

    .line 28
    .line 29
    invoke-static {v3, v2, v4}, LVa/O6;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const/4 v4, 0x4

    .line 42
    new-array v4, v4, [Ljava/lang/Object;

    .line 43
    .line 44
    aput-object p1, v4, v0

    .line 45
    .line 46
    const/4 v5, 0x1

    .line 47
    aput-object p2, v4, v5

    .line 48
    .line 49
    aput-object p3, v4, v1

    .line 50
    .line 51
    const/4 v5, 0x3

    .line 52
    aput-object v3, v4, v5

    .line 53
    .line 54
    iget-object v3, p0, LVa/O6;->c:LVa/P6;

    .line 55
    .line 56
    iget-object v5, p0, LVa/O6;->b:LVa/Ra;

    .line 57
    .line 58
    invoke-virtual {v3, p0, v5, v2, v4}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v2, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 62
    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    sget v0, LVa/O6;->f:I

    .line 66
    .line 67
    add-int/lit8 v0, v0, 0x27

    .line 68
    .line 69
    rem-int/lit16 v3, v0, 0x80

    .line 70
    .line 71
    sput v3, LVa/O6;->e:I

    .line 72
    .line 73
    rem-int/2addr v0, v1

    .line 74
    if-nez v0, :cond_0

    .line 75
    .line 76
    invoke-virtual {v2, p1, p2, p3, p4}, Lcom/unity3d/services/core/webview/WebViewApp;->invokeMethod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    return p1

    .line 81
    :cond_0
    invoke-virtual {v2, p1, p2, p3, p4}, Lcom/unity3d/services/core/webview/WebViewApp;->invokeMethod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    const/4 p1, 0x0

    .line 85
    throw p1

    .line 86
    :cond_1
    return v0
.end method

.method public final isWebAppInitialized()Z
    .locals 5

    .line 1
    sget v0, LVa/O6;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x35

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/O6;->e:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0, v0}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    const-wide/16 v3, 0x0

    .line 15
    .line 16
    cmp-long v1, v1, v3

    .line 17
    .line 18
    const v2, 0x95f9

    .line 19
    .line 20
    .line 21
    add-int/2addr v1, v2

    .line 22
    int-to-char v1, v1

    .line 23
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const-string v3, "\u4a15\ue0cd\uf8d3\ub895"

    .line 28
    .line 29
    const-string v4, "\uea27\u9f87\u2916\u0444\ueef1\ube3b\u3927\ua8dc4\ua1e2\u755d\u5c52\u417c\u9a38\ub2ae\u56fd\u1326\u5204\ucdc4\u6632\u7b2f\ufb51\ua818\u5189\uce44\uf1a5\uf46a\ub051\u3412\u6ba2"

    .line 30
    .line 31
    invoke-static {v1, v3, v4, v2}, LVa/O6;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-array v2, v0, [Ljava/lang/Object;

    .line 40
    .line 41
    iget-object v3, p0, LVa/O6;->c:LVa/P6;

    .line 42
    .line 43
    iget-object v4, p0, LVa/O6;->b:LVa/Ra;

    .line 44
    .line 45
    invoke-virtual {v3, p0, v4, v1, v2}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 49
    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    sget v0, LVa/O6;->e:I

    .line 53
    .line 54
    add-int/lit8 v0, v0, 0x53

    .line 55
    .line 56
    rem-int/lit16 v0, v0, 0x80

    .line 57
    .line 58
    sput v0, LVa/O6;->f:I

    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/unity3d/services/core/webview/WebViewApp;->isWebAppInitialized()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    return v0

    .line 65
    :cond_0
    sget v1, LVa/O6;->f:I

    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x79

    .line 68
    .line 69
    rem-int/lit16 v1, v1, 0x80

    .line 70
    .line 71
    sput v1, LVa/O6;->e:I

    .line 72
    .line 73
    return v0
.end method

.method public final isWebAppLoaded()Z
    .locals 5

    .line 1
    sget v0, LVa/O6;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2f

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/O6;->e:I

    .line 8
    .line 9
    const v0, 0x1000019

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    add-int/2addr v2, v0

    .line 18
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    shr-int/lit8 v0, v0, 0x10

    .line 23
    .line 24
    rsub-int/lit8 v0, v0, 0x55

    .line 25
    .line 26
    int-to-byte v0, v0

    .line 27
    const-string v3, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u00c5\u00c5\n\u0002\u0006\u0003\u0002\u0003\u0007\u0008\u0008\u0006\r\u000e\r\u0002\u00b9"

    .line 28
    .line 29
    invoke-static {v0, v2, v3}, LVa/O6;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-array v2, v1, [Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v3, p0, LVa/O6;->c:LVa/P6;

    .line 40
    .line 41
    iget-object v4, p0, LVa/O6;->b:LVa/Ra;

    .line 42
    .line 43
    invoke-virtual {v3, p0, v4, v0, v2}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/unity3d/services/core/webview/WebViewApp;->isWebAppLoaded()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    sget v1, LVa/O6;->f:I

    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x1d

    .line 57
    .line 58
    rem-int/lit16 v1, v1, 0x80

    .line 59
    .line 60
    sput v1, LVa/O6;->e:I

    .line 61
    .line 62
    return v0

    .line 63
    :cond_0
    return v1
.end method

.method public final removeCallback(Lcom/unity3d/services/core/webview/bridge/NativeCallback;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    sget v1, LVa/O6;->f:I

    .line 3
    .line 4
    add-int/lit8 v1, v1, 0x21

    .line 5
    .line 6
    rem-int/lit16 v1, v1, 0x80

    .line 7
    .line 8
    sput v1, LVa/O6;->e:I

    .line 9
    .line 10
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    shr-int/lit8 v1, v1, 0x8

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x19

    .line 17
    .line 18
    invoke-static {v0}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    const-wide/16 v4, 0x0

    .line 23
    .line 24
    cmp-long v2, v2, v4

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x54

    .line 27
    .line 28
    int-to-byte v2, v2

    .line 29
    const-string v3, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u00c4\u00c4\u0006\u0014\u0000\u001f\u000e\u0018\u0003\u0013\u000e\u0011\u000e\u0004\u0011\u0019\u00bf"

    .line 30
    .line 31
    invoke-static {v2, v1, v3}, LVa/O6;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const/4 v2, 0x1

    .line 40
    new-array v2, v2, [Ljava/lang/Object;

    .line 41
    .line 42
    aput-object p1, v2, v0

    .line 43
    .line 44
    iget-object v0, p0, LVa/O6;->c:LVa/P6;

    .line 45
    .line 46
    iget-object v3, p0, LVa/O6;->b:LVa/Ra;

    .line 47
    .line 48
    invoke-virtual {v0, p0, v3, v1, v2}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    sget v1, LVa/O6;->f:I

    .line 56
    .line 57
    add-int/lit8 v1, v1, 0x4f

    .line 58
    .line 59
    rem-int/lit16 v2, v1, 0x80

    .line 60
    .line 61
    sput v2, LVa/O6;->e:I

    .line 62
    .line 63
    rem-int/lit8 v1, v1, 0x2

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->removeCallback(Lcom/unity3d/services/core/webview/bridge/NativeCallback;)V

    .line 66
    .line 67
    .line 68
    if-nez v1, :cond_0

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    const/4 p1, 0x0

    .line 72
    throw p1

    .line 73
    :cond_1
    :goto_0
    sget p1, LVa/O6;->e:I

    .line 74
    .line 75
    add-int/lit8 p1, p1, 0x29

    .line 76
    .line 77
    rem-int/lit16 p1, p1, 0x80

    .line 78
    .line 79
    sput p1, LVa/O6;->f:I

    .line 80
    .line 81
    return-void
.end method

.method public final resetWebViewAppInitialization()V
    .locals 9

    .line 1
    sget v0, LVa/O6;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x57

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/O6;->f:I

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    rem-int/2addr v0, v1

    .line 11
    const-string v2, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0082\u0082\u0006\u0014\u0003\u0007\u0004\u0007\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0082\u0082\u0017\u0012\n\u0010\u0001\u0010\u0016\n\u0019\u000c\u0010\n\u0011\u0012"

    .line 12
    .line 13
    iget-object v3, p0, LVa/O6;->b:LVa/Ra;

    .line 14
    .line 15
    iget-object v4, p0, LVa/O6;->c:LVa/P6;

    .line 16
    .line 17
    iget-object v5, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const/16 v0, 0x3c

    .line 23
    .line 24
    invoke-static {v0}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/16 v7, 0x5f

    .line 29
    .line 30
    ushr-int v0, v7, v0

    .line 31
    .line 32
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    shl-int/lit8 v7, v7, 0x6b

    .line 37
    .line 38
    const/16 v8, 0x1b

    .line 39
    .line 40
    ushr-int v7, v8, v7

    .line 41
    .line 42
    int-to-byte v7, v7

    .line 43
    invoke-static {v7, v0, v2}, LVa/O6;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-array v2, v6, [Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {v4, p0, v3, v0, v2}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    if-eqz v5, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const/16 v0, 0x30

    .line 60
    .line 61
    invoke-static {v0}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    rsub-int/lit8 v0, v0, 0x58

    .line 66
    .line 67
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    shr-int/lit8 v7, v7, 0x10

    .line 72
    .line 73
    add-int/lit8 v7, v7, 0x12

    .line 74
    .line 75
    int-to-byte v7, v7

    .line 76
    invoke-static {v7, v0, v2}, LVa/O6;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    new-array v2, v6, [Ljava/lang/Object;

    .line 85
    .line 86
    invoke-virtual {v4, p0, v3, v0, v2}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    if-eqz v5, :cond_1

    .line 90
    .line 91
    :goto_0
    invoke-virtual {v5}, Lcom/unity3d/services/core/webview/WebViewApp;->resetWebViewAppInitialization()V

    .line 92
    .line 93
    .line 94
    :cond_1
    sget v0, LVa/O6;->f:I

    .line 95
    .line 96
    add-int/lit8 v0, v0, 0x11

    .line 97
    .line 98
    rem-int/lit16 v2, v0, 0x80

    .line 99
    .line 100
    sput v2, LVa/O6;->e:I

    .line 101
    .line 102
    rem-int/2addr v0, v1

    .line 103
    if-eqz v0, :cond_2

    .line 104
    .line 105
    div-int/2addr v1, v6

    .line 106
    :cond_2
    return-void
.end method

.method public final varargs sendEvent(Ljava/lang/Enum;Ljava/lang/Enum;[Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/16 v2, 0x10

    .line 4
    .line 5
    const-string v3, ""

    .line 6
    .line 7
    invoke-static {v3}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    int-to-char v3, v3

    .line 12
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    shr-int/2addr v4, v2

    .line 17
    const-string v5, "\uda4a\u7db0\u065d\u6685"

    .line 18
    .line 19
    const-string v6, "\u5322\u1e51\u4a25\ue175\u5bd8\u9267\u3632\u1d67\u67d4\u0125\u66e4\ucd25\u9665\u277e\u2544\uecf1\u8bad\ud00a\u0324\ucf85"

    .line 20
    .line 21
    invoke-static {v3, v5, v6, v4}, LVa/O6;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    const/4 v5, 0x3

    .line 34
    new-array v5, v5, [Ljava/lang/Object;

    .line 35
    .line 36
    aput-object p1, v5, v1

    .line 37
    .line 38
    const/4 v6, 0x1

    .line 39
    aput-object p2, v5, v6

    .line 40
    .line 41
    aput-object v4, v5, v0

    .line 42
    .line 43
    iget-object v4, p0, LVa/O6;->c:LVa/P6;

    .line 44
    .line 45
    iget-object v6, p0, LVa/O6;->b:LVa/Ra;

    .line 46
    .line 47
    invoke-virtual {v4, p0, v6, v3, v5}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v3, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 51
    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    sget v1, LVa/O6;->f:I

    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x2f

    .line 57
    .line 58
    rem-int/lit16 v2, v1, 0x80

    .line 59
    .line 60
    sput v2, LVa/O6;->e:I

    .line 61
    .line 62
    rem-int/2addr v1, v0

    .line 63
    if-nez v1, :cond_0

    .line 64
    .line 65
    invoke-virtual {v3, p1, p2, p3}, Lcom/unity3d/services/core/webview/WebViewApp;->sendEvent(Ljava/lang/Enum;Ljava/lang/Enum;[Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    return p1

    .line 70
    :cond_0
    invoke-virtual {v3, p1, p2, p3}, Lcom/unity3d/services/core/webview/WebViewApp;->sendEvent(Ljava/lang/Enum;Ljava/lang/Enum;[Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    throw p1

    .line 75
    :cond_1
    sget p1, LVa/O6;->e:I

    .line 76
    .line 77
    add-int/lit8 p1, p1, 0x19

    .line 78
    .line 79
    rem-int/lit16 p2, p1, 0x80

    .line 80
    .line 81
    sput p2, LVa/O6;->f:I

    .line 82
    .line 83
    rem-int/2addr p1, v0

    .line 84
    if-nez p1, :cond_2

    .line 85
    .line 86
    div-int/2addr v2, v1

    .line 87
    :cond_2
    return v1
.end method

.method public final setConfiguration(Lcom/unity3d/services/core/configuration/Configuration;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    sget v1, LVa/O6;->e:I

    .line 3
    .line 4
    add-int/lit8 v1, v1, 0x3

    .line 5
    .line 6
    rem-int/lit16 v1, v1, 0x80

    .line 7
    .line 8
    sput v1, LVa/O6;->f:I

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    shr-int/lit8 v1, v1, 0x16

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1b

    .line 17
    .line 18
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    shr-int/lit8 v2, v2, 0x10

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x7

    .line 25
    .line 26
    int-to-byte v2, v2

    .line 27
    const-string v3, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bww\t\n\u0004\u0007\u0012\u000f\u0013\u001d\u0002\u0016\u000c\u0017\u0010\u0007\u0000\u0010u"

    .line 28
    .line 29
    invoke-static {v2, v1, v3}, LVa/O6;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/4 v2, 0x1

    .line 38
    new-array v2, v2, [Ljava/lang/Object;

    .line 39
    .line 40
    aput-object p1, v2, v0

    .line 41
    .line 42
    iget-object v3, p0, LVa/O6;->c:LVa/P6;

    .line 43
    .line 44
    iget-object v4, p0, LVa/O6;->b:LVa/Ra;

    .line 45
    .line 46
    invoke-virtual {v3, p0, v4, v1, v2}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    invoke-virtual {v1, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->setConfiguration(Lcom/unity3d/services/core/configuration/Configuration;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    sget p1, LVa/O6;->e:I

    .line 57
    .line 58
    add-int/lit8 p1, p1, 0x41

    .line 59
    .line 60
    rem-int/lit16 v1, p1, 0x80

    .line 61
    .line 62
    sput v1, LVa/O6;->f:I

    .line 63
    .line 64
    rem-int/lit8 p1, p1, 0x2

    .line 65
    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    const/16 p1, 0x40

    .line 69
    .line 70
    div-int/2addr p1, v0

    .line 71
    :cond_1
    return-void
.end method

.method public final setWebAppFailureCode(I)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    shr-int/lit8 v1, v1, 0x10

    .line 7
    .line 8
    add-int/lit8 v1, v1, 0x1f

    .line 9
    .line 10
    const-string v2, ""

    .line 11
    .line 12
    const/16 v3, 0x30

    .line 13
    .line 14
    invoke-static {v2, v3, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    rsub-int/lit8 v2, v2, 0x5e

    .line 19
    .line 20
    int-to-byte v2, v2

    .line 21
    const-string v3, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u00cf\u00cf\t\n\u0004\u0007\u0001\u0002\u0000\u0008\u00cf\u00cf\u0010\u000e\n\u0016\u000c\u0017\u0003\u0013\r\u000f\u00c4"

    .line 22
    .line 23
    invoke-static {v2, v1, v3}, LVa/O6;->a(BILjava/lang/String;)Ljava/lang/String;

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
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const/4 v3, 0x1

    .line 36
    new-array v3, v3, [Ljava/lang/Object;

    .line 37
    .line 38
    aput-object v2, v3, v0

    .line 39
    .line 40
    iget-object v2, p0, LVa/O6;->c:LVa/P6;

    .line 41
    .line 42
    iget-object v4, p0, LVa/O6;->b:LVa/Ra;

    .line 43
    .line 44
    invoke-virtual {v2, p0, v4, v1, v3}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 48
    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    sget v2, LVa/O6;->f:I

    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x77

    .line 54
    .line 55
    rem-int/lit16 v2, v2, 0x80

    .line 56
    .line 57
    sput v2, LVa/O6;->e:I

    .line 58
    .line 59
    invoke-virtual {v1, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->setWebAppFailureCode(I)V

    .line 60
    .line 61
    .line 62
    :cond_0
    sget p1, LVa/O6;->e:I

    .line 63
    .line 64
    add-int/lit8 p1, p1, 0x7b

    .line 65
    .line 66
    rem-int/lit16 v1, p1, 0x80

    .line 67
    .line 68
    sput v1, LVa/O6;->f:I

    .line 69
    .line 70
    rem-int/lit8 p1, p1, 0x2

    .line 71
    .line 72
    if-nez p1, :cond_1

    .line 73
    .line 74
    const/16 p1, 0x5a

    .line 75
    .line 76
    div-int/2addr p1, v0

    .line 77
    :cond_1
    return-void
.end method

.method public final setWebAppFailureMessage(Ljava/lang/String;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    sget v1, LVa/O6;->e:I

    .line 3
    .line 4
    add-int/lit8 v1, v1, 0xb

    .line 5
    .line 6
    rem-int/lit16 v1, v1, 0x80

    .line 7
    .line 8
    sput v1, LVa/O6;->f:I

    .line 9
    .line 10
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    shr-int/lit8 v1, v1, 0x8

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x22

    .line 17
    .line 18
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    shr-int/lit8 v2, v2, 0x10

    .line 23
    .line 24
    rsub-int/lit8 v2, v2, 0x2e

    .line 25
    .line 26
    int-to-byte v2, v2

    .line 27
    const-string v3, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u009e\u009e\t\n\u0004\u0007\u0001\u0002\u0000\u0008\u009e\u009e\u0010\u000e\n\u0016\u000c\u0017\u0007\u0019\u0003\u0007\u0007\u000f\u0013\u0002"

    .line 28
    .line 29
    invoke-static {v2, v1, v3}, LVa/O6;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/4 v2, 0x1

    .line 38
    new-array v2, v2, [Ljava/lang/Object;

    .line 39
    .line 40
    aput-object p1, v2, v0

    .line 41
    .line 42
    iget-object v3, p0, LVa/O6;->c:LVa/P6;

    .line 43
    .line 44
    iget-object v4, p0, LVa/O6;->b:LVa/Ra;

    .line 45
    .line 46
    invoke-virtual {v3, p0, v4, v1, v2}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    invoke-virtual {v1, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->setWebAppFailureMessage(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    sget p1, LVa/O6;->f:I

    .line 57
    .line 58
    add-int/lit8 p1, p1, 0x4b

    .line 59
    .line 60
    rem-int/lit16 v1, p1, 0x80

    .line 61
    .line 62
    sput v1, LVa/O6;->e:I

    .line 63
    .line 64
    rem-int/lit8 p1, p1, 0x2

    .line 65
    .line 66
    if-eqz p1, :cond_1

    .line 67
    .line 68
    const/16 p1, 0x37

    .line 69
    .line 70
    div-int/2addr p1, v0

    .line 71
    :cond_1
    return-void
.end method

.method public final setWebAppInitialized(Z)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    sget v1, LVa/O6;->e:I

    .line 3
    .line 4
    add-int/lit8 v1, v1, 0x33

    .line 5
    .line 6
    rem-int/lit16 v1, v1, 0x80

    .line 7
    .line 8
    sput v1, LVa/O6;->f:I

    .line 9
    .line 10
    invoke-static {v0}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit8 v1, v1, 0x1f

    .line 15
    .line 16
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    shr-int/lit8 v2, v2, 0x16

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x56

    .line 23
    .line 24
    int-to-byte v2, v2

    .line 25
    const-string v3, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u00c6\u00c6\t\n\u0004\u0007\u0001\u0002\u0000\u0008\u00c6\u00c6\u0017\u0012\n\u0010\u0001\u0010\u0016\n\u0019\u0000\u00ba"

    .line 26
    .line 27
    invoke-static {v2, v1, v3}, LVa/O6;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/4 v3, 0x1

    .line 40
    new-array v3, v3, [Ljava/lang/Object;

    .line 41
    .line 42
    aput-object v2, v3, v0

    .line 43
    .line 44
    iget-object v0, p0, LVa/O6;->c:LVa/P6;

    .line 45
    .line 46
    iget-object v2, p0, LVa/O6;->b:LVa/Ra;

    .line 47
    .line 48
    invoke-virtual {v0, p0, v2, v1, v3}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    sget v1, LVa/O6;->e:I

    .line 56
    .line 57
    add-int/lit8 v1, v1, 0x1f

    .line 58
    .line 59
    rem-int/lit16 v2, v1, 0x80

    .line 60
    .line 61
    sput v2, LVa/O6;->f:I

    .line 62
    .line 63
    rem-int/lit8 v1, v1, 0x2

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->setWebAppInitialized(Z)V

    .line 66
    .line 67
    .line 68
    if-eqz v1, :cond_0

    .line 69
    .line 70
    sget p1, LVa/O6;->f:I

    .line 71
    .line 72
    add-int/lit8 p1, p1, 0x13

    .line 73
    .line 74
    rem-int/lit16 p1, p1, 0x80

    .line 75
    .line 76
    sput p1, LVa/O6;->e:I

    .line 77
    .line 78
    return-void

    .line 79
    :cond_0
    const/4 p1, 0x0

    .line 80
    throw p1

    .line 81
    :cond_1
    return-void
.end method

.method public final setWebAppLoaded(Z)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    sget v1, LVa/O6;->f:I

    .line 3
    .line 4
    add-int/lit8 v1, v1, 0x45

    .line 5
    .line 6
    rem-int/lit16 v1, v1, 0x80

    .line 7
    .line 8
    sput v1, LVa/O6;->e:I

    .line 9
    .line 10
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    shr-int/lit8 v1, v1, 0x10

    .line 15
    .line 16
    rsub-int/lit8 v1, v1, 0x1a

    .line 17
    .line 18
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    shr-int/lit8 v2, v2, 0x10

    .line 23
    .line 24
    rsub-int/lit8 v2, v2, 0x61

    .line 25
    .line 26
    int-to-byte v2, v2

    .line 27
    const-string v3, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u00d1\u00d1\t\n\u0004\u0007\u0001\u0002\u0000\u0008\u00d1\u00d1\u0006\u0011\u000e\u000f\u0002\r"

    .line 28
    .line 29
    invoke-static {v2, v1, v3}, LVa/O6;->a(BILjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const/4 v3, 0x1

    .line 42
    new-array v3, v3, [Ljava/lang/Object;

    .line 43
    .line 44
    aput-object v2, v3, v0

    .line 45
    .line 46
    iget-object v2, p0, LVa/O6;->c:LVa/P6;

    .line 47
    .line 48
    iget-object v4, p0, LVa/O6;->b:LVa/Ra;

    .line 49
    .line 50
    invoke-virtual {v2, p0, v4, v1, v3}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 54
    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    sget v2, LVa/O6;->f:I

    .line 58
    .line 59
    add-int/lit8 v2, v2, 0x43

    .line 60
    .line 61
    rem-int/lit16 v3, v2, 0x80

    .line 62
    .line 63
    sput v3, LVa/O6;->e:I

    .line 64
    .line 65
    rem-int/lit8 v2, v2, 0x2

    .line 66
    .line 67
    invoke-virtual {v1, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->setWebAppLoaded(Z)V

    .line 68
    .line 69
    .line 70
    if-eqz v2, :cond_0

    .line 71
    .line 72
    const/16 p1, 0x23

    .line 73
    .line 74
    div-int/2addr p1, v0

    .line 75
    :cond_0
    sget p1, LVa/O6;->f:I

    .line 76
    .line 77
    add-int/lit8 p1, p1, 0x5f

    .line 78
    .line 79
    rem-int/lit16 v0, p1, 0x80

    .line 80
    .line 81
    sput v0, LVa/O6;->e:I

    .line 82
    .line 83
    rem-int/lit8 p1, p1, 0x2

    .line 84
    .line 85
    if-nez p1, :cond_1

    .line 86
    .line 87
    return-void

    .line 88
    :cond_1
    const/4 p1, 0x0

    .line 89
    throw p1
.end method

.method public final setWebView(Lcom/unity3d/services/core/webview/WebView;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, ""

    .line 3
    .line 4
    invoke-static {v1, v1, v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    int-to-char v1, v1

    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const v3, -0x4a8d7e7d

    .line 16
    .line 17
    .line 18
    sub-int/2addr v3, v2

    .line 19
    const-string v2, "\u8348\u7281\u97b5\u9b80"

    .line 20
    .line 21
    const-string v4, "\u06a8\u5245\u9035\u3bcd\u7b86\udbd6\u55e8\u1ea3\u55ed\ue803\u4cd9\ud18d\ue4c1\u9ea5\u265f\uacef\u030d\uca9f\uad1b\u2a91\ue00c"

    .line 22
    .line 23
    invoke-static {v1, v2, v4, v3}, LVa/O6;->b(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

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
    const/4 v2, 0x1

    .line 32
    new-array v2, v2, [Ljava/lang/Object;

    .line 33
    .line 34
    aput-object p1, v2, v0

    .line 35
    .line 36
    iget-object v0, p0, LVa/O6;->c:LVa/P6;

    .line 37
    .line 38
    iget-object v3, p0, LVa/O6;->b:LVa/Ra;

    .line 39
    .line 40
    invoke-virtual {v0, p0, v3, v1, v2}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, LVa/O6;->a:Lcom/unity3d/services/core/webview/WebViewApp;

    .line 44
    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    sget v1, LVa/O6;->f:I

    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x3

    .line 50
    .line 51
    rem-int/lit16 v1, v1, 0x80

    .line 52
    .line 53
    sput v1, LVa/O6;->e:I

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Lcom/unity3d/services/core/webview/WebViewApp;->setWebView(Lcom/unity3d/services/core/webview/WebView;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    sget p1, LVa/O6;->e:I

    .line 59
    .line 60
    add-int/lit8 p1, p1, 0x75

    .line 61
    .line 62
    rem-int/lit16 v0, p1, 0x80

    .line 63
    .line 64
    sput v0, LVa/O6;->f:I

    .line 65
    .line 66
    rem-int/lit8 p1, p1, 0x2

    .line 67
    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    return-void

    .line 71
    :cond_1
    const/4 p1, 0x0

    .line 72
    throw p1
.end method
