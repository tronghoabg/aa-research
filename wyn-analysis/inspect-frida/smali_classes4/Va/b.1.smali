.class public final LVa/b;
.super LVa/Mb;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# static fields
.field public static p:I = 0x0

.field public static q:I = 0x1


# instance fields
.field public g:Ljava/util/List;

.field public h:Ljava/lang/String;

.field public i:Z

.field public j:Z

.field public k:LVa/ob;

.field public final l:Ljava/util/WeakHashMap;

.field public m:LVa/z;

.field public final n:Ljava/util/ArrayList;

.field public final synthetic o:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/b;->o:I

    .line 2
    .line 3
    invoke-direct {p0}, LVa/Mb;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/WeakHashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LVa/b;->l:Ljava/util/WeakHashMap;

    .line 12
    .line 13
    new-instance p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, LVa/b;->n:Ljava/util/ArrayList;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic B(LVa/b;Landroid/webkit/WebView;)V
    .locals 1

    .line 1
    sget v0, LVa/b;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x37

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/b;->q:I

    .line 8
    .line 9
    invoke-virtual {p0, p1}, LVa/b;->A(Landroid/webkit/WebView;)V

    .line 10
    .line 11
    .line 12
    sget p0, LVa/b;->p:I

    .line 13
    .line 14
    add-int/lit8 p0, p0, 0x69

    .line 15
    .line 16
    rem-int/lit16 p1, p0, 0x80

    .line 17
    .line 18
    sput p1, LVa/b;->q:I

    .line 19
    .line 20
    rem-int/lit8 p0, p0, 0x2

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    throw p0
.end method

.method public static synthetic E(LVa/b;)Ljava/util/List;
    .locals 2

    .line 1
    sget v0, LVa/b;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x21

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/b;->q:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object p0, p0, LVa/b;->g:Ljava/util/List;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/16 v0, 0x5b

    .line 16
    .line 17
    div-int/lit8 v0, v0, 0x0

    .line 18
    .line 19
    :cond_0
    add-int/lit8 v1, v1, 0x5f

    .line 20
    .line 21
    rem-int/lit16 v0, v1, 0x80

    .line 22
    .line 23
    sput v0, LVa/b;->p:I

    .line 24
    .line 25
    rem-int/lit8 v1, v1, 0x2

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    throw p0
.end method

.method public static synthetic u(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    sget v0, LVa/b;->q:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x59

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/b;->p:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-static {p0}, LVa/b;->z(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget v0, LVa/b;->p:I

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x5f

    .line 20
    .line 21
    rem-int/lit16 v1, v0, 0x80

    .line 22
    .line 23
    sput v1, LVa/b;->q:I

    .line 24
    .line 25
    rem-int/lit8 v0, v0, 0x2

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    const/16 v0, 0x30

    .line 30
    .line 31
    div-int/lit8 v0, v0, 0x0

    .line 32
    .line 33
    :cond_0
    return-object p0

    .line 34
    :cond_1
    invoke-static {p0}, LVa/b;->z(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    throw p0
.end method

.method public static y(Ljava/lang/String;IIIZ)Ljava/lang/String;
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
    add-int/lit16 v4, v4, -0x87

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

.method public static z(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 7

    .line 1
    sget v0, LVa/b;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/b;->q:I

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    :try_start_0
    invoke-static {v2}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    cmpl-float v3, v3, v1

    .line 17
    .line 18
    rsub-int/lit8 v3, v3, 0x4

    .line 19
    .line 20
    const-string v4, "\uffe9\u0002\u0010\u0011\ufff4"

    .line 21
    .line 22
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    const v6, 0x1000005

    .line 27
    .line 28
    .line 29
    add-int/2addr v5, v6

    .line 30
    const-string v6, ""

    .line 31
    .line 32
    invoke-static {v6}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    rsub-int v6, v6, 0xcb

    .line 37
    .line 38
    invoke-static {v4, v3, v5, v6, v0}, LVa/b;->y(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {p0, v3}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_0

    .line 55
    .line 56
    new-instance v3, Lorg/json/JSONObject;

    .line 57
    .line 58
    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    sget p0, LVa/b;->p:I

    .line 62
    .line 63
    add-int/lit8 p0, p0, 0x3b

    .line 64
    .line 65
    rem-int/lit16 p0, p0, 0x80

    .line 66
    .line 67
    sput p0, LVa/b;->q:I

    .line 68
    .line 69
    return-object v3

    .line 70
    :catch_0
    move-exception p0

    .line 71
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    add-int/lit8 v3, v3, 0x9

    .line 76
    .line 77
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    cmpl-float v1, v4, v1

    .line 82
    .line 83
    rsub-int/lit8 v1, v1, 0x11

    .line 84
    .line 85
    invoke-static {v2, v2}, Landroid/view/View;->getDefaultSize(II)I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    rsub-int v4, v4, 0xe8

    .line 90
    .line 91
    const-string v5, "\u0003\uffe0\u0016\u0004\u0008\ufff5\u0001\u0004\ufff6\u0011\u0004\u000b\u0003\r\u0000\uffe7"

    .line 92
    .line 93
    invoke-static {v5, v3, v1, v4, v0}, LVa/b;->y(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v2, v2}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 102
    .line 103
    .line 104
    move-result-wide v3

    .line 105
    const-wide/16 v5, 0x0

    .line 106
    .line 107
    cmp-long v1, v3, v5

    .line 108
    .line 109
    add-int/lit8 v1, v1, 0x9

    .line 110
    .line 111
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    shr-int/lit8 v3, v3, 0x10

    .line 116
    .line 117
    rsub-int/lit8 v3, v3, 0x12

    .line 118
    .line 119
    invoke-static {v2, v2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    add-int/lit16 v4, v4, 0xe8

    .line 124
    .line 125
    const-string v5, "\u0008\r\u0006\uffbf\u0003\u0000\u0013\u0000\uffe4\u0011\u0011\u000e\u0011\uffbf\u0006\u0004\u0013\u0013"

    .line 126
    .line 127
    invoke-static {v5, v1, v3, v4, v2}, LVa/b;->y(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-static {v0, v1, p0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    :cond_0
    new-instance p0, Lorg/json/JSONObject;

    .line 139
    .line 140
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 141
    .line 142
    .line 143
    return-object p0
.end method


# virtual methods
.method public final A(Landroid/webkit/WebView;)V
    .locals 5

    .line 1
    iget-object v0, p0, LVa/b;->l:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LVa/ob;

    .line 8
    .line 9
    iget-boolean v1, p0, LVa/b;->i:Z

    .line 10
    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    sget v1, LVa/b;->p:I

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x13

    .line 16
    .line 17
    rem-int/lit16 v1, v1, 0x80

    .line 18
    .line 19
    sput v1, LVa/b;->q:I

    .line 20
    .line 21
    iget-object v1, v0, LVa/ob;->b:LE5/b;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget v2, LE5/b;->g:I

    .line 27
    .line 28
    add-int/lit8 v3, v2, 0x73

    .line 29
    .line 30
    rem-int/lit16 v4, v3, 0x80

    .line 31
    .line 32
    sput v4, LE5/b;->h:I

    .line 33
    .line 34
    rem-int/lit8 v3, v3, 0x2

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    iget-boolean v1, v1, LE5/b;->b:Z

    .line 38
    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    const/16 v3, 0x2f

    .line 42
    .line 43
    div-int/2addr v3, v4

    .line 44
    :cond_0
    add-int/lit8 v2, v2, 0x4f

    .line 45
    .line 46
    rem-int/lit16 v2, v2, 0x80

    .line 47
    .line 48
    sput v2, LE5/b;->h:I

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    sget v1, LVa/Ab;->i:I

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x19

    .line 55
    .line 56
    rem-int/lit16 v1, v1, 0x80

    .line 57
    .line 58
    sput v1, LVa/Ab;->j:I

    .line 59
    .line 60
    invoke-static {p1}, LVa/Ab;->F(Landroid/webkit/WebView;)Landroid/webkit/WebViewClient;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    instance-of v1, v1, LVa/V9;

    .line 65
    .line 66
    sget v2, LVa/Ab;->i:I

    .line 67
    .line 68
    add-int/lit8 v2, v2, 0x1

    .line 69
    .line 70
    rem-int/lit16 v3, v2, 0x80

    .line 71
    .line 72
    sput v3, LVa/Ab;->j:I

    .line 73
    .line 74
    rem-int/lit8 v2, v2, 0x2

    .line 75
    .line 76
    if-nez v2, :cond_1

    .line 77
    .line 78
    const/4 v2, 0x4

    .line 79
    div-int/2addr v2, v4

    .line 80
    :cond_1
    if-nez v1, :cond_2

    .line 81
    .line 82
    new-instance v1, LVa/mb;

    .line 83
    .line 84
    invoke-direct {v1, v0}, LVa/mb;-><init>(LVa/ob;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, v0, LVa/ob;->b:LE5/b;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, LE5/b;->t(LVa/mb;)V

    .line 90
    .line 91
    .line 92
    sget v0, LVa/b;->q:I

    .line 93
    .line 94
    add-int/lit8 v0, v0, 0x63

    .line 95
    .line 96
    rem-int/lit16 v0, v0, 0x80

    .line 97
    .line 98
    sput v0, LVa/b;->p:I

    .line 99
    .line 100
    :cond_2
    sget v0, LVa/b;->q:I

    .line 101
    .line 102
    add-int/lit8 v0, v0, 0x6f

    .line 103
    .line 104
    rem-int/lit16 v0, v0, 0x80

    .line 105
    .line 106
    sput v0, LVa/b;->p:I

    .line 107
    .line 108
    iget-object v0, p0, LVa/b;->m:LVa/z;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    :try_start_0
    new-instance v1, LVa/y;

    .line 114
    .line 115
    const/16 v2, 0x17

    .line 116
    .line 117
    invoke-direct {v1, v2, v0, p1}, LVa/y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v1}, LVa/Cb;->j(LVa/Ba;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    .line 122
    .line 123
    sget p1, LVa/z;->j:I

    .line 124
    .line 125
    add-int/lit8 p1, p1, 0x55

    .line 126
    .line 127
    rem-int/lit16 p1, p1, 0x80

    .line 128
    .line 129
    sput p1, LVa/z;->k:I

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :catch_0
    move-exception p1

    .line 133
    const-string v0, ""

    .line 134
    .line 135
    invoke-static {v0, v0, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    rsub-int v0, v0, 0xa7

    .line 140
    .line 141
    const-string v1, "\u9663\u96f6\u9718\u9797\u94c1\u9512\u95a9\u92ef\u937f\u93a2\u90dc\u9173\u9185\u9e2c\u9f62\u9f92\u9c36"

    .line 142
    .line 143
    invoke-static {v0, v1}, LVa/z;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    new-instance v1, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    const/16 v2, 0x30

    .line 157
    .line 158
    invoke-static {v2}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    rsub-int v2, v2, 0xe5

    .line 163
    .line 164
    const-string v3, "\u9671\u96f3\u972c\u9444\u9492\u959d\u9263\u92a9\u93f6\u900c\u9145\u9187\u9e21\u9f6b\u9fb5\u9c8f\u9d0e\u9a42\u9aae\u9b2f\u987f\u98cd\u99cd\u8612\u86ae\u87cf\u843f\u8546\u858f\u828f\u8322"

    .line 165
    .line 166
    invoke-static {v2, v3}, LVa/z;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-static {v0, p1}, LVa/Ab;->x(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :goto_0
    sget p1, LVa/b;->q:I

    .line 192
    .line 193
    add-int/lit8 p1, p1, 0x63

    .line 194
    .line 195
    rem-int/lit16 p1, p1, 0x80

    .line 196
    .line 197
    sput p1, LVa/b;->p:I

    .line 198
    .line 199
    add-int/lit8 p1, p1, 0x2f

    .line 200
    .line 201
    rem-int/lit16 p1, p1, 0x80

    .line 202
    .line 203
    sput p1, LVa/b;->q:I

    .line 204
    .line 205
    :cond_3
    return-void
.end method

.method public final C(Landroid/webkit/WebView;)V
    .locals 6

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    sget v0, LVa/b;->p:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x6b

    .line 6
    .line 7
    rem-int/lit16 v0, v0, 0x80

    .line 8
    .line 9
    sput v0, LVa/b;->q:I

    .line 10
    .line 11
    iget-object v0, p0, LVa/b;->l:Ljava/util/WeakHashMap;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    shr-int/lit8 v1, v1, 0x10

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    rsub-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    shr-int/lit8 v3, v3, 0x10

    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x9

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-static {v4, v4}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    rsub-int v4, v4, 0xdb

    .line 42
    .line 43
    const-string v5, "\r\uffdb\uffdb\uffe6\u0017\u000e\u0018\u000f\u0010"

    .line 44
    .line 45
    invoke-static {v5, v1, v3, v4, v2}, LVa/b;->y(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {p1, v1}, LVa/ob;->f(Landroid/webkit/WebView;Ljava/lang/String;)LVa/ob;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v2, p0, LVa/b;->k:LVa/ob;

    .line 58
    .line 59
    if-nez v2, :cond_0

    .line 60
    .line 61
    iput-object v1, p0, LVa/b;->k:LVa/ob;

    .line 62
    .line 63
    :cond_0
    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    new-instance v0, LVa/Vb;

    .line 67
    .line 68
    invoke-direct {v0, p0}, LVa/Vb;-><init>(LVa/b;)V

    .line 69
    .line 70
    .line 71
    sget v2, LVa/b;->q:I

    .line 72
    .line 73
    add-int/lit8 v2, v2, 0x23

    .line 74
    .line 75
    rem-int/lit16 v2, v2, 0x80

    .line 76
    .line 77
    sput v2, LVa/b;->p:I

    .line 78
    .line 79
    iget-object v2, p0, LVa/b;->n:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    iget-object v1, v1, LVa/ob;->c:Ljava/util/HashSet;

    .line 85
    .line 86
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p1}, LVa/b;->A(Landroid/webkit/WebView;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 93
    .line 94
    .line 95
    sget p1, LVa/b;->q:I

    .line 96
    .line 97
    add-int/lit8 p1, p1, 0x69

    .line 98
    .line 99
    rem-int/lit16 p1, p1, 0x80

    .line 100
    .line 101
    sput p1, LVa/b;->p:I

    .line 102
    .line 103
    :cond_1
    return-void
.end method

.method public final D()LVa/e0;
    .locals 4

    .line 1
    sget v0, LVa/b;->p:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0xd

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/b;->q:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    iget-object v1, p0, LVa/b;->k:LVa/ob;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x21

    .line 19
    .line 20
    rem-int/lit16 v3, v0, 0x80

    .line 21
    .line 22
    sput v3, LVa/b;->q:I

    .line 23
    .line 24
    rem-int/lit8 v0, v0, 0x2

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1}, LVa/ob;->e()LVa/e0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :cond_0
    invoke-virtual {v1}, LVa/ob;->e()LVa/e0;

    .line 34
    .line 35
    .line 36
    throw v2

    .line 37
    :cond_1
    return-object v2

    .line 38
    :cond_2
    throw v2
.end method

.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    :try_start_0
    instance-of p2, p1, Landroid/webkit/WebView;

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    if-eqz p2, :cond_1

    .line 5
    .line 6
    check-cast p1, Landroid/webkit/WebView;

    .line 7
    .line 8
    iget-object p2, p0, LVa/b;->l:Ljava/util/WeakHashMap;

    .line 9
    .line 10
    invoke-virtual {p2, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    sget p2, LVa/b;->q:I

    .line 17
    .line 18
    add-int/lit8 p2, p2, 0x4f

    .line 19
    .line 20
    rem-int/lit16 p4, p2, 0x80

    .line 21
    .line 22
    sput p4, LVa/b;->p:I

    .line 23
    .line 24
    rem-int/lit8 p2, p2, 0x2

    .line 25
    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    :try_start_1
    invoke-virtual {p0, p1}, LVa/b;->A(Landroid/webkit/WebView;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    invoke-virtual {p0, p1}, LVa/b;->A(Landroid/webkit/WebView;)V

    .line 35
    .line 36
    .line 37
    throw p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    :cond_1
    :goto_0
    sget p1, LVa/b;->p:I

    .line 39
    .line 40
    add-int/lit8 p1, p1, 0x65

    .line 41
    .line 42
    rem-int/lit16 p2, p1, 0x80

    .line 43
    .line 44
    sput p2, LVa/b;->q:I

    .line 45
    .line 46
    rem-int/lit8 p1, p1, 0x2

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    throw p3

    .line 52
    :goto_1
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 53
    .line 54
    .line 55
    move-result-wide p2

    .line 56
    const-wide/16 p4, 0x0

    .line 57
    .line 58
    cmp-long p2, p2, p4

    .line 59
    .line 60
    rsub-int/lit8 p2, p2, 0xa

    .line 61
    .line 62
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 63
    .line 64
    .line 65
    move-result p3

    .line 66
    shr-int/lit8 p3, p3, 0x10

    .line 67
    .line 68
    rsub-int/lit8 p3, p3, 0x10

    .line 69
    .line 70
    const-string p4, ""

    .line 71
    .line 72
    const/4 p5, 0x0

    .line 73
    invoke-static {p4, p5, p5}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 74
    .line 75
    .line 76
    move-result p6

    .line 77
    add-int/lit16 p6, p6, 0xe8

    .line 78
    .line 79
    const-string p7, "\u0003\uffe0\u0016\u0004\u0008\ufff5\u0001\u0004\ufff6\u0011\u0004\u000b\u0003\r\u0000\uffe7"

    .line 80
    .line 81
    const/4 p8, 0x1

    .line 82
    invoke-static {p7, p2, p3, p6, p8}, LVa/b;->y(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 91
    .line 92
    .line 93
    move-result p3

    .line 94
    shr-int/lit8 p3, p3, 0x10

    .line 95
    .line 96
    add-int/lit8 p3, p3, 0x10

    .line 97
    .line 98
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 99
    .line 100
    .line 101
    move-result p6

    .line 102
    shr-int/lit8 p6, p6, 0x8

    .line 103
    .line 104
    rsub-int/lit8 p6, p6, 0x17

    .line 105
    .line 106
    const/16 p7, 0x30

    .line 107
    .line 108
    invoke-static {p4, p7}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 109
    .line 110
    .line 111
    move-result p4

    .line 112
    rsub-int p4, p4, 0xe7

    .line 113
    .line 114
    const-string p7, "\u0014\u000e\u0018\u0000\uffeb\r\u000e\uffbf\r\u0008\uffbf\u0011\u000e\u0011\u0011\uffe4\u0004\u0006\r\u0000\u0007\uffe2\u0013"

    .line 115
    .line 116
    invoke-static {p7, p3, p6, p4, p8}, LVa/b;->y(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p3

    .line 124
    invoke-static {p2, p3, p1, p5}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    sget p1, LVa/b;->p:I

    .line 2
    .line 3
    iget-object v0, p0, LVa/b;->h:Ljava/lang/String;

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x3f

    .line 6
    .line 7
    rem-int/lit16 p1, p1, 0x80

    .line 8
    .line 9
    sput p1, LVa/b;->q:I

    .line 10
    .line 11
    return-object v0
.end method

.method public final r(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget v0, LVa/b;->q:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x6b

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, LVa/b;->p:I

    .line 8
    .line 9
    check-cast p2, Landroid/webkit/WebView;

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x9

    .line 12
    .line 13
    rem-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    sput v0, LVa/b;->p:I

    .line 16
    .line 17
    sget-object v0, LVa/sa;->f:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-super {p0, p1, p2, p3}, LVa/Mb;->r(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget p1, LVa/b;->q:I

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x33

    .line 28
    .line 29
    rem-int/lit16 p1, p1, 0x80

    .line 30
    .line 31
    sput p1, LVa/b;->p:I

    .line 32
    .line 33
    return-void
.end method

.method public final t(Landroid/webkit/WebView;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LVa/b;->o:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LVa/Bb;->b(Landroid/view/View;)Landroid/app/Activity;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    sget-object v0, LVa/Bb;->a:Landroid/graphics/Rect;

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v0, v0, Landroid/view/View;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Landroid/view/View;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic v(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget v0, LVa/b;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/b;->q:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    check-cast p2, Landroid/webkit/WebView;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3}, LVa/b;->x(Lorg/json/JSONObject;Landroid/webkit/WebView;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    throw p1
.end method

.method public final x(Lorg/json/JSONObject;Landroid/webkit/WebView;Ljava/lang/Object;)V
    .locals 3

    .line 1
    sget v0, LVa/b;->q:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x11

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/b;->p:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/16 v0, 0x4c

    .line 15
    .line 16
    div-int/2addr v0, v1

    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-eqz p2, :cond_2

    .line 21
    .line 22
    :goto_0
    :try_start_0
    sget-object v0, LVa/sa;->W:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 25
    .line 26
    .line 27
    move-result-object v2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    sget v1, LVa/b;->q:I

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x7

    .line 33
    .line 34
    rem-int/lit16 v1, v1, 0x80

    .line 35
    .line 36
    sput v1, LVa/b;->p:I

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    :cond_1
    :try_start_1
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 40
    .line 41
    .line 42
    sget v0, LVa/b;->p:I

    .line 43
    .line 44
    add-int/lit8 v0, v0, 0x59

    .line 45
    .line 46
    rem-int/lit16 v0, v0, 0x80

    .line 47
    .line 48
    sput v0, LVa/b;->q:I

    .line 49
    .line 50
    :catch_0
    :cond_2
    invoke-super {p0, p1, p2, p3}, LVa/Mb;->v(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget p1, LVa/b;->p:I

    .line 54
    .line 55
    add-int/lit8 p1, p1, 0x2b

    .line 56
    .line 57
    rem-int/lit16 p1, p1, 0x80

    .line 58
    .line 59
    sput p1, LVa/b;->q:I

    .line 60
    .line 61
    return-void
.end method
