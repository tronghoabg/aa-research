.class public final LVa/V;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final o:[C

.field public static p:I = 0x0

.field public static q:I = 0x1


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public b:Z

.field public volatile c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/HashMap;

.field public final f:Ljava/util/HashMap;

.field public final g:LVa/Z7;

.field public h:LVa/x8;

.field public i:Ljava/util/HashMap;

.field public volatile j:LVa/la;

.field public final k:Ljava/lang/String;

.field public final l:LVa/Hb;

.field public final m:LVa/Ha;

.field public final n:LVa/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x3d

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/V;->o:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x16s
        0x2ds
        0x2ds
        0x2ds
        0x2ds
        0x2ds
        0x2ds
        0x2ds
        0x2ds
        0x2ds
        0x2ds
        0x2ds
        0x2ds
        0x2ds
        0x26s
        0x41s
        0x83s
        0x6cs
        0x6ds
        0x83s
        0x81s
        0x81s
        0x83s
        0x7cs
        0x53s
        0x5as
        0x81s
        0x82s
        0x7cs
        0x75s
        0x7as
        0x7fs
        0x7fs
        0x7as
        0x52s
        0x54s
        0x7bs
        0x7cs
        0x77s
        0x75s
        0x73s
        0x51s
        0x5as
        0x81s
        0x22s
        0x44s
        0x48s
        0x47s
        0x41s
        0x47s
        0x49s
        0x39s
        0x70s
        0x71s
        0x6bs
        0x64s
        0x69s
        0x6es
        0x6es
        0x69s
        0x41s
    .end array-data
.end method

.method public constructor <init>(LVa/Ha;LVa/x;Ljava/lang/String;LVa/la;LVa/Hb;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LVa/V;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iput-boolean v1, p0, LVa/V;->b:Z

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LVa/V;->c:Ljava/util/ArrayList;

    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, LVa/V;->d:Ljava/util/ArrayList;

    .line 27
    .line 28
    new-instance v0, Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, LVa/V;->e:Ljava/util/HashMap;

    .line 34
    .line 35
    new-instance v0, Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, LVa/V;->f:Ljava/util/HashMap;

    .line 41
    .line 42
    new-instance v0, LVa/Z7;

    .line 43
    .line 44
    invoke-direct {v0}, LVa/Z7;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, LVa/V;->g:LVa/Z7;

    .line 48
    .line 49
    invoke-static {}, LVa/x8;->a()LVa/x8;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, LVa/V;->h:LVa/x8;

    .line 54
    .line 55
    new-instance v0, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, LVa/V;->i:Ljava/util/HashMap;

    .line 61
    .line 62
    iput-object p1, p0, LVa/V;->m:LVa/Ha;

    .line 63
    .line 64
    new-instance p1, LVa/f0;

    .line 65
    .line 66
    invoke-static {}, LVa/Cb;->d()Landroid/os/Handler;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    new-instance v1, Ljava/util/HashSet;

    .line 74
    .line 75
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v1, p1, LVa/f0;->d:Ljava/util/HashSet;

    .line 79
    .line 80
    new-instance v1, Ljava/util/HashSet;

    .line 81
    .line 82
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object v1, p1, LVa/f0;->e:Ljava/util/HashSet;

    .line 86
    .line 87
    iput-object p2, p1, LVa/f0;->c:LVa/x;

    .line 88
    .line 89
    iput-object v0, p1, LVa/f0;->b:Landroid/os/Handler;

    .line 90
    .line 91
    iput-object p1, p0, LVa/V;->n:LVa/f0;

    .line 92
    .line 93
    new-instance p2, Ljava/lang/ref/WeakReference;

    .line 94
    .line 95
    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sput-object p2, LVa/Ab;->m:Ljava/lang/ref/WeakReference;

    .line 99
    .line 100
    sget p2, LVa/Ab;->p:I

    .line 101
    .line 102
    add-int/lit8 p2, p2, 0x7b

    .line 103
    .line 104
    rem-int/lit16 v0, p2, 0x80

    .line 105
    .line 106
    sput v0, LVa/Ab;->o:I

    .line 107
    .line 108
    rem-int/lit8 p2, p2, 0x2

    .line 109
    .line 110
    if-nez p2, :cond_0

    .line 111
    .line 112
    new-instance p2, LVa/P;

    .line 113
    .line 114
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 115
    .line 116
    .line 117
    iput-object p0, p2, LVa/P;->a:LVa/V;

    .line 118
    .line 119
    invoke-virtual {p1, p2}, LVa/f0;->e(LVa/ua;)V

    .line 120
    .line 121
    .line 122
    iput-object p3, p0, LVa/V;->k:Ljava/lang/String;

    .line 123
    .line 124
    iput-object p4, p0, LVa/V;->j:LVa/la;

    .line 125
    .line 126
    iput-object p5, p0, LVa/V;->l:LVa/Hb;

    .line 127
    .line 128
    return-void

    .line 129
    :cond_0
    const/4 p1, 0x0

    .line 130
    throw p1
.end method

.method public static synthetic A(LVa/V;)LVa/la;
    .locals 2

    .line 1
    sget v0, LVa/V;->q:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x53

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V;->p:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object p0, p0, LVa/V;->j:LVa/la;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget v0, LVa/V;->q:I

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x31

    .line 18
    .line 19
    rem-int/lit16 v0, v0, 0x80

    .line 20
    .line 21
    sput v0, LVa/V;->p:I

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    throw p0
.end method

.method public static B(ILjava/lang/String;)Ljava/lang/String;
    .locals 6

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
    sget-object v0, LVa/a;->u:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sput p0, LVa/a;->t:I

    .line 11
    .line 12
    array-length p0, p1

    .line 13
    new-array p0, p0, [C

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    sput v1, LVa/a;->s:I

    .line 17
    .line 18
    :goto_0
    sget v1, LVa/a;->s:I

    .line 19
    .line 20
    array-length v2, p1

    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    aget-char v2, p1, v1

    .line 24
    .line 25
    sget v3, LVa/a;->t:I

    .line 26
    .line 27
    mul-int/2addr v3, v1

    .line 28
    xor-int/2addr v2, v3

    .line 29
    int-to-long v2, v2

    .line 30
    const-wide v4, 0x6f57b2ec463e832cL    # 2.2456664179719432E228

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    xor-long/2addr v2, v4

    .line 36
    long-to-int v2, v2

    .line 37
    int-to-char v2, v2

    .line 38
    aput-char v2, p0, v1

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    sput v1, LVa/a;->s:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    .line 50
    .line 51
    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    return-object p1

    .line 54
    :goto_1
    monitor-exit v0

    .line 55
    throw p0
.end method

.method public static C(LVa/B7;)Lorg/json/JSONObject;
    .locals 5

    .line 1
    sget v0, LVa/V;->q:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/V;->p:I

    .line 8
    .line 9
    invoke-virtual {p0}, LVa/B7;->h()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, LVa/V;->n(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    :try_start_0
    sget-object v2, LVa/sa;->U:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0}, LVa/B7;->n()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {v0, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception p0

    .line 29
    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    rsub-int v2, v2, 0xe57

    .line 34
    .line 35
    const-string v3, "\u836f\u8d14\u9fec\ua847\uba15\uc4fc\ud552\ue722\uf1e6\u026e\u0c2b\u1eff\u2f59\u3920\u4b8b\u5447"

    .line 36
    .line 37
    invoke-static {v2, v3}, LVa/V;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const v3, 0xb377

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v1}, Landroid/view/View;->getDefaultSize(II)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    add-int/2addr v4, v3

    .line 53
    const-string v3, "\u8369\u3029\ue5b0\u9926\u4e82\u025f\ub785\u6b1f\u18f1\ucc62\u81fe\u3558\uead6\u9e40\u538e\u00b6\ub433\u69a5\u1d1c\ud29c\u8603\u3b9b\uef79\u9cef\u5024\u05c5\ub95f\u6ed3\u225b\ud73e\u84b1\u382b\uedec\ua111\u5691\u0a06\ubffe"

    .line 54
    .line 55
    invoke-static {v4, v3}, LVa/V;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-static {v2, v3, p0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    sget p0, LVa/V;->q:I

    .line 67
    .line 68
    add-int/lit8 p0, p0, 0x3d

    .line 69
    .line 70
    rem-int/lit16 v2, p0, 0x80

    .line 71
    .line 72
    sput v2, LVa/V;->p:I

    .line 73
    .line 74
    rem-int/lit8 p0, p0, 0x2

    .line 75
    .line 76
    if-eqz p0, :cond_0

    .line 77
    .line 78
    const/16 p0, 0x37

    .line 79
    .line 80
    div-int/2addr p0, v1

    .line 81
    :cond_0
    return-object v0
.end method

.method public static synthetic E(LVa/V;Ljava/lang/String;)Z
    .locals 1

    .line 1
    sget v0, LVa/V;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/V;->q:I

    .line 8
    .line 9
    invoke-virtual {p0, p1}, LVa/V;->F(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    sget p1, LVa/V;->q:I

    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x7b

    .line 16
    .line 17
    rem-int/lit16 v0, p1, 0x80

    .line 18
    .line 19
    sput v0, LVa/V;->p:I

    .line 20
    .line 21
    rem-int/lit8 p1, p1, 0x2

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const/16 p1, 0x2f

    .line 26
    .line 27
    div-int/lit8 p1, p1, 0x0

    .line 28
    .line 29
    :cond_0
    return p0
.end method

.method public static G(LVa/V;Landroid/content/Context;Ljava/lang/String;LVa/Z0;)LVa/B7;
    .locals 11

    .line 1
    const/4 v0, 0x6

    .line 2
    sget v1, LVa/V;->q:I

    .line 3
    .line 4
    add-int/lit8 v1, v1, 0x43

    .line 5
    .line 6
    rem-int/lit16 v1, v1, 0x80

    .line 7
    .line 8
    sput v1, LVa/V;->p:I

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget v1, LVa/V;->q:I

    .line 14
    .line 15
    add-int/lit8 v2, v1, 0x7d

    .line 16
    .line 17
    rem-int/lit16 v2, v2, 0x80

    .line 18
    .line 19
    sput v2, LVa/V;->p:I

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    new-instance v1, LVa/b8;

    .line 25
    .line 26
    iget-object v3, p0, LVa/V;->h:LVa/x8;

    .line 27
    .line 28
    const-string v4, ""

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    .line 35
    .line 36
    invoke-direct {v6, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iput-object v6, v1, LVa/b8;->a:Lorg/json/JSONObject;

    .line 40
    .line 41
    iput-object v3, v1, LVa/b8;->b:LVa/x8;

    .line 42
    .line 43
    const p2, -0x498d1fa

    .line 44
    .line 45
    .line 46
    const v3, 0x295cfb3

    .line 47
    .line 48
    .line 49
    filled-new-array {v3, p2}, [I

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-static {v5, v5}, Landroid/view/View;->getDefaultSize(II)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    add-int/lit8 v3, v3, 0x4

    .line 58
    .line 59
    invoke-static {v3, p2}, LVa/b8;->f(I[I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {v6, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    iput-object p2, v1, LVa/b8;->c:Ljava/lang/String;

    .line 72
    .line 73
    new-array p2, v0, [I

    .line 74
    .line 75
    fill-array-data p2, :array_0

    .line 76
    .line 77
    .line 78
    invoke-static {v4}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    add-int/lit8 v3, v3, 0xc

    .line 83
    .line 84
    invoke-static {v3, p2}, LVa/b8;->f(I[I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {v6, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    iput-object p2, v1, LVa/b8;->d:Ljava/lang/String;

    .line 97
    .line 98
    const-string p2, "\u15f2\u1584\u8414\u055f\udd82\u772c\ue397\u07e6\ud8ef\u44aa\ub11f"

    .line 99
    .line 100
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    shr-int/lit8 v3, v3, 0x10

    .line 105
    .line 106
    rsub-int/lit8 v3, v3, 0x1

    .line 107
    .line 108
    invoke-static {v3, p2}, LVa/b8;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-virtual {v6, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    iput-object p2, v1, LVa/b8;->e:Ljava/lang/String;

    .line 121
    .line 122
    const-string p2, "\u9dee\u9d83\uaa4d\ufd6a\ua483\u5979\u1bbe\u7ec7\u50fe\u6af7"

    .line 123
    .line 124
    invoke-static {v4, v5, v5}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    rsub-int/lit8 v3, v3, 0x1

    .line 129
    .line 130
    invoke-static {v3, p2}, LVa/b8;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    invoke-virtual {v6, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    iput-object p2, v1, LVa/b8;->f:Ljava/lang/String;

    .line 143
    .line 144
    const-string p2, "\uca02\uca6f\u93f6\ud1be\ue429\u60ca\u377c\u3e6d\u0712\u534c"

    .line 145
    .line 146
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    shr-int/lit8 v3, v3, 0x10

    .line 151
    .line 152
    rsub-int/lit8 v3, v3, 0x1

    .line 153
    .line 154
    invoke-static {v3, p2}, LVa/b8;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    invoke-virtual {v6, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    iput-object p2, v1, LVa/b8;->g:Ljava/lang/String;

    .line 167
    .line 168
    new-array p2, v0, [I

    .line 169
    .line 170
    fill-array-data p2, :array_1

    .line 171
    .line 172
    .line 173
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    shr-int/lit8 v3, v3, 0x16

    .line 178
    .line 179
    rsub-int/lit8 v3, v3, 0xc

    .line 180
    .line 181
    invoke-static {v3, p2}, LVa/b8;->f(I[I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    invoke-virtual {v6, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    if-eqz p2, :cond_0

    .line 194
    .line 195
    new-array p2, v0, [I

    .line 196
    .line 197
    fill-array-data p2, :array_2

    .line 198
    .line 199
    .line 200
    invoke-static {v5}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 201
    .line 202
    .line 203
    move-result-wide v7

    .line 204
    const-wide/16 v9, 0x0

    .line 205
    .line 206
    cmp-long v0, v7, v9

    .line 207
    .line 208
    add-int/lit8 v0, v0, 0xc

    .line 209
    .line 210
    invoke-static {v0, p2}, LVa/b8;->f(I[I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    invoke-virtual {v6, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    invoke-virtual {v1, p2}, LVa/b8;->h(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 223
    .line 224
    .line 225
    goto :goto_0

    .line 226
    :catchall_0
    move-exception p2

    .line 227
    iget-object v0, v1, LVa/b8;->c:Ljava/lang/String;

    .line 228
    .line 229
    invoke-static {v4, v4, v5, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    rsub-int/lit8 v3, v3, 0x1

    .line 234
    .line 235
    const-string v4, "\uea2f\uea6a\u0adf\uf35e\u99fe\uf9f0\u1596\u4386\u2729\uca2e\u4713\u3e07\u70a2\u84fb\u7288\ued68\u821d\u5101\ubc68\udbee\udf90\u239c\uefba\u967c\ue908\ufc0a\u1acf\u44d7\u3ab7\ucea9\u4443\u335f\u7465\u9b3f\u77df"

    .line 236
    .line 237
    invoke-static {v3, v4}, LVa/b8;->d(ILjava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    invoke-static {v0, v3, p2}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 246
    .line 247
    .line 248
    :cond_0
    :goto_0
    new-instance p2, LVa/B7;

    .line 249
    .line 250
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 251
    .line 252
    .line 253
    iput-object v1, p2, LVa/B7;->a:LVa/b8;

    .line 254
    .line 255
    iget-object v0, p0, LVa/V;->n:LVa/f0;

    .line 256
    .line 257
    iput-object v0, p2, LVa/B7;->b:LVa/f0;

    .line 258
    .line 259
    iget-object p0, p0, LVa/V;->g:LVa/Z7;

    .line 260
    .line 261
    iput-object p0, p2, LVa/B7;->c:LVa/Z7;

    .line 262
    .line 263
    iput-object p3, p2, LVa/B7;->d:LVa/Z0;

    .line 264
    .line 265
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    iput-object p0, p2, LVa/B7;->e:Landroid/content/Context;

    .line 270
    .line 271
    new-instance p0, Ljava/util/ArrayList;

    .line 272
    .line 273
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 274
    .line 275
    .line 276
    iput-object p0, p2, LVa/B7;->f:Ljava/util/ArrayList;

    .line 277
    .line 278
    goto :goto_1

    .line 279
    :cond_1
    add-int/lit8 v1, v1, 0x29

    .line 280
    .line 281
    rem-int/lit16 v1, v1, 0x80

    .line 282
    .line 283
    sput v1, LVa/V;->p:I

    .line 284
    .line 285
    move-object p2, v2

    .line 286
    :goto_1
    sget p0, LVa/V;->q:I

    .line 287
    .line 288
    add-int/lit8 p0, p0, 0x23

    .line 289
    .line 290
    rem-int/lit16 p1, p0, 0x80

    .line 291
    .line 292
    sput p1, LVa/V;->p:I

    .line 293
    .line 294
    rem-int/lit8 p0, p0, 0x2

    .line 295
    .line 296
    if-nez p0, :cond_2

    .line 297
    .line 298
    return-object p2

    .line 299
    :cond_2
    throw v2

    .line 300
    nop

    .line 301
    :array_0
    .array-data 4
        0x65e7c183
        -0x30b070e3
        0x345d482f
        0x685da6d9
        0x78641d35
        0x3589bff4
    .end array-data

    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    :array_1
    .array-data 4
        0x3c0ff1b1
        0x2a6f9daf
        0x1a8c70ff
        -0x6b223ab8
        -0x2df2bedd
        -0x19243445
    .end array-data

    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    :array_2
    .array-data 4
        0x3c0ff1b1
        0x2a6f9daf
        0x1a8c70ff
        -0x6b223ab8
        -0x2df2bedd
        -0x19243445
    .end array-data
.end method

.method public static synthetic H(LVa/B7;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    sget v0, LVa/V;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x9

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V;->q:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-static {p0}, LVa/V;->C(LVa/B7;)Lorg/json/JSONObject;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    div-int/lit8 v0, v1, 0x0

    .line 19
    .line 20
    :cond_0
    sget v0, LVa/V;->q:I

    .line 21
    .line 22
    add-int/2addr v0, v1

    .line 23
    rem-int/lit16 v0, v0, 0x80

    .line 24
    .line 25
    sput v0, LVa/V;->p:I

    .line 26
    .line 27
    return-object p0
.end method

.method public static synthetic M(LVa/V;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 3

    .line 1
    sget v0, LVa/V;->p:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x53

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, LVa/V;->q:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    iget-object p0, p0, LVa/V;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/16 v1, 0x16

    .line 16
    .line 17
    div-int/lit8 v1, v1, 0x0

    .line 18
    .line 19
    :cond_0
    add-int/lit8 v0, v0, 0x3f

    .line 20
    .line 21
    rem-int/lit16 v1, v0, 0x80

    .line 22
    .line 23
    sput v1, LVa/V;->q:I

    .line 24
    .line 25
    rem-int/lit8 v0, v0, 0x2

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    const/4 p0, 0x0

    .line 31
    throw p0
.end method

.method public static N(LVa/V;LVa/Z0;LVa/B7;LVa/r9;LVa/Ba;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 11

    .line 1
    sget v0, LVa/V;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x79

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/V;->q:I

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v1, LVa/T;

    .line 13
    .line 14
    move-object v2, p0

    .line 15
    move-object v3, p1

    .line 16
    move-object v4, p2

    .line 17
    move-object v5, p3

    .line 18
    move-object v6, p4

    .line 19
    move-object/from16 v7, p5

    .line 20
    .line 21
    move-object/from16 v9, p6

    .line 22
    .line 23
    move-object/from16 v8, p7

    .line 24
    .line 25
    move/from16 v10, p8

    .line 26
    .line 27
    invoke-direct/range {v1 .. v10}, LVa/T;-><init>(LVa/V;LVa/Z0;LVa/B7;LVa/r9;LVa/Ba;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, LVa/Cb;->e(LVa/Ba;)V

    .line 31
    .line 32
    .line 33
    sget p0, LVa/V;->q:I

    .line 34
    .line 35
    add-int/lit8 p1, p0, 0xb

    .line 36
    .line 37
    rem-int/lit16 p2, p1, 0x80

    .line 38
    .line 39
    sput p2, LVa/V;->p:I

    .line 40
    .line 41
    rem-int/lit8 p1, p1, 0x2

    .line 42
    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    add-int/lit8 p0, p0, 0x1d

    .line 46
    .line 47
    rem-int/lit16 p1, p0, 0x80

    .line 48
    .line 49
    sput p1, LVa/V;->p:I

    .line 50
    .line 51
    rem-int/lit8 p0, p0, 0x2

    .line 52
    .line 53
    if-eqz p0, :cond_0

    .line 54
    .line 55
    const/16 p0, 0x62

    .line 56
    .line 57
    div-int/lit8 p0, p0, 0x0

    .line 58
    .line 59
    :cond_0
    return-void

    .line 60
    :cond_1
    const/4 p0, 0x0

    .line 61
    throw p0
.end method

.method public static synthetic O(LVa/V;Landroid/content/Context;Ljava/util/LinkedHashMap;LVa/v;)V
    .locals 2

    .line 1
    sget v0, LVa/V;->q:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x51

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V;->p:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p0, p1, p2, p3}, LVa/V;->r(Landroid/content/Context;Ljava/util/LinkedHashMap;LVa/v;)V

    .line 13
    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    sget p0, LVa/V;->p:I

    .line 18
    .line 19
    add-int/lit8 p0, p0, 0x57

    .line 20
    .line 21
    rem-int/lit16 p1, p0, 0x80

    .line 22
    .line 23
    sput p1, LVa/V;->q:I

    .line 24
    .line 25
    rem-int/lit8 p0, p0, 0x2

    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    throw v1

    .line 31
    :cond_1
    throw v1
.end method

.method public static synthetic g(LVa/V;)Z
    .locals 2

    .line 1
    sget v0, LVa/V;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V;->q:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    invoke-virtual {p0}, LVa/V;->d()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/16 v0, 0x34

    .line 18
    .line 19
    div-int/lit8 v0, v0, 0x0

    .line 20
    .line 21
    :cond_0
    sget v0, LVa/V;->p:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x51

    .line 24
    .line 25
    rem-int/lit16 v1, v0, 0x80

    .line 26
    .line 27
    sput v1, LVa/V;->q:I

    .line 28
    .line 29
    rem-int/lit8 v0, v0, 0x2

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    return p0

    .line 34
    :cond_1
    const/4 p0, 0x0

    .line 35
    throw p0
.end method

.method public static synthetic h(LVa/V;)Ljava/util/HashMap;
    .locals 2

    .line 1
    sget v0, LVa/V;->q:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x51

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/V;->p:I

    .line 8
    .line 9
    invoke-virtual {p0}, LVa/V;->f()Ljava/util/HashMap;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget v0, LVa/V;->p:I

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x69

    .line 16
    .line 17
    rem-int/lit16 v1, v0, 0x80

    .line 18
    .line 19
    sput v1, LVa/V;->q:I

    .line 20
    .line 21
    rem-int/lit8 v0, v0, 0x2

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const/16 v0, 0x3c

    .line 26
    .line 27
    div-int/lit8 v0, v0, 0x0

    .line 28
    .line 29
    :cond_0
    return-object p0
.end method

.method public static synthetic j(LVa/V;)V
    .locals 2

    .line 1
    sget v0, LVa/V;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x15

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V;->q:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    invoke-virtual {p0}, LVa/V;->b()V

    .line 12
    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/16 p0, 0x53

    .line 17
    .line 18
    div-int/lit8 p0, p0, 0x0

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static l(Ljava/lang/String;[I)Ljava/lang/String;
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
    sget-object v8, LVa/V;->o:[C

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
    new-array p0, v4, [C

    .line 88
    .line 89
    sput v1, LVa/Ab;->y:I

    .line 90
    .line 91
    :goto_2
    sget v2, LVa/Ab;->y:I

    .line 92
    .line 93
    if-ge v2, v4, :cond_4

    .line 94
    .line 95
    sub-int v7, v4, v2

    .line 96
    .line 97
    sub-int/2addr v7, v3

    .line 98
    aget-char v7, v9, v7

    .line 99
    .line 100
    aput-char v7, p0, v2

    .line 101
    .line 102
    add-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    sput v2, LVa/Ab;->y:I

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    if-lez v6, :cond_5

    .line 108
    .line 109
    sput v1, LVa/Ab;->y:I

    .line 110
    .line 111
    :goto_3
    sget v1, LVa/Ab;->y:I

    .line 112
    .line 113
    if-ge v1, v4, :cond_5

    .line 114
    .line 115
    aget-char v2, p0, v1

    .line 116
    .line 117
    aget v3, p1, v5

    .line 118
    .line 119
    sub-int/2addr v2, v3

    .line 120
    int-to-char v2, v2

    .line 121
    aput-char v2, p0, v1

    .line 122
    .line 123
    add-int/lit8 v1, v1, 0x1

    .line 124
    .line 125
    sput v1, LVa/Ab;->y:I

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_5
    new-instance p1, Ljava/lang/String;

    .line 129
    .line 130
    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    .line 131
    .line 132
    .line 133
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    return-object p1

    .line 135
    :goto_4
    monitor-exit v0

    .line 136
    throw p0
.end method

.method public static synthetic m(LVa/V;)Ljava/util/HashMap;
    .locals 2

    .line 1
    sget v0, LVa/V;->q:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x77

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/V;->p:I

    .line 8
    .line 9
    invoke-virtual {p0}, LVa/V;->c()Ljava/util/HashMap;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget v0, LVa/V;->p:I

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x41

    .line 16
    .line 17
    rem-int/lit16 v1, v0, 0x80

    .line 18
    .line 19
    sput v1, LVa/V;->q:I

    .line 20
    .line 21
    rem-int/lit8 v0, v0, 0x2

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    throw p0
.end method

.method public static n(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 5

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object v1, LVa/sa;->V:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catch_0
    move-exception p0

    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    invoke-static {v1, v2}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    rsub-int v1, v1, 0xe57

    .line 20
    .line 21
    const-string v2, "\u836f\u8d14\u9fec\ua847\uba15\uc4fc\ud552\ue722\uf1e6\u026e\u0c2b\u1eff\u2f59\u3920\u4b8b\u5447"

    .line 22
    .line 23
    invoke-static {v1, v2}, LVa/V;->B(ILjava/lang/String;)Ljava/lang/String;

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
    const/16 v2, 0x30

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const-string v4, ""

    .line 35
    .line 36
    invoke-static {v4, v2, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const v3, 0xb376

    .line 41
    .line 42
    .line 43
    sub-int/2addr v3, v2

    .line 44
    const-string v2, "\u8369\u3029\ue5b0\u9926\u4e82\u025f\ub785\u6b1f\u18f1\ucc62\u81fe\u3558\uead6\u9e40\u538e\u00b6\ub433\u69a5\u1d1c\ud29c\u8603\u3b9b\uef79\u9cef\u5024\u05c5\ub95f\u6ed3\u225b\ud73e\u84b1\u382b\uedec\ua111\u5691\u0a06\ubffe"

    .line 45
    .line 46
    invoke-static {v3, v2}, LVa/V;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-static {v1, v2, p0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    sget p0, LVa/V;->q:I

    .line 58
    .line 59
    add-int/lit8 p0, p0, 0x27

    .line 60
    .line 61
    rem-int/lit16 v1, p0, 0x80

    .line 62
    .line 63
    sput v1, LVa/V;->p:I

    .line 64
    .line 65
    rem-int/lit8 p0, p0, 0x2

    .line 66
    .line 67
    if-nez p0, :cond_0

    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_0
    const/4 p0, 0x0

    .line 71
    throw p0
.end method

.method public static o(Ljava/util/HashMap;)Lorg/json/JSONObject;
    .locals 5

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lorg/json/JSONObject;

    .line 7
    .line 8
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    sget v3, LVa/V;->q:I

    .line 31
    .line 32
    add-int/lit8 v3, v3, 0x2b

    .line 33
    .line 34
    rem-int/lit16 v4, v3, 0x80

    .line 35
    .line 36
    sput v4, LVa/V;->p:I

    .line 37
    .line 38
    rem-int/lit8 v3, v3, 0x2

    .line 39
    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, Lorg/json/JSONObject;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 59
    .line 60
    .line 61
    const/16 v3, 0x1a

    .line 62
    .line 63
    div-int/lit8 v3, v3, 0x0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    check-cast v4, Lorg/json/JSONObject;

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    shr-int/lit8 p0, p0, 0x8

    .line 91
    .line 92
    add-int/lit16 p0, p0, 0x7c31

    .line 93
    .line 94
    const-string v2, "\u835a\uff6e\u7b20\uf7cc"

    .line 95
    .line 96
    invoke-static {p0, v2}, LVa/V;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 105
    .line 106
    .line 107
    sget p0, LVa/V;->q:I

    .line 108
    .line 109
    add-int/lit8 p0, p0, 0x1b

    .line 110
    .line 111
    rem-int/lit16 v1, p0, 0x80

    .line 112
    .line 113
    sput v1, LVa/V;->p:I

    .line 114
    .line 115
    rem-int/lit8 p0, p0, 0x2

    .line 116
    .line 117
    if-nez p0, :cond_2

    .line 118
    .line 119
    return-object v0

    .line 120
    :cond_2
    const/4 p0, 0x0

    .line 121
    throw p0
.end method

.method public static synthetic t(LVa/V;)Ljava/util/List;
    .locals 2

    .line 1
    sget v0, LVa/V;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x57

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V;->q:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, LVa/V;->k()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget v0, LVa/V;->p:I

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x47

    .line 20
    .line 21
    rem-int/lit16 v1, v0, 0x80

    .line 22
    .line 23
    sput v1, LVa/V;->q:I

    .line 24
    .line 25
    rem-int/lit8 v0, v0, 0x2

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x5

    .line 30
    div-int/lit8 v0, v0, 0x0

    .line 31
    .line 32
    :cond_0
    return-object p0

    .line 33
    :cond_1
    invoke-virtual {p0}, LVa/V;->k()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    throw p0
.end method

.method public static synthetic v(LVa/V;Ljava/util/HashMap;)V
    .locals 1

    .line 1
    sget v0, LVa/V;->q:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/V;->p:I

    .line 8
    .line 9
    iput-object p1, p0, LVa/V;->i:Ljava/util/HashMap;

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x71

    .line 12
    .line 13
    rem-int/lit16 p0, v0, 0x80

    .line 14
    .line 15
    sput p0, LVa/V;->q:I

    .line 16
    .line 17
    rem-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    throw p0
.end method

.method public static z(LVa/B7;Ljava/lang/String;)Z
    .locals 3

    .line 1
    sget v0, LVa/V;->q:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x43

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/V;->p:I

    .line 8
    .line 9
    const/16 v0, 0x2c

    .line 10
    .line 11
    const/4 v1, 0x7

    .line 12
    const/4 v2, 0x0

    .line 13
    filled-new-array {v0, v1, v2, v2}, [I

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001"

    .line 18
    .line 19
    invoke-static {v1, v0}, LVa/V;->l(Ljava/lang/String;[I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    sget v0, LVa/V;->p:I

    .line 41
    .line 42
    add-int/lit8 v0, v0, 0x1b

    .line 43
    .line 44
    rem-int/lit16 v1, v0, 0x80

    .line 45
    .line 46
    sput v1, LVa/V;->q:I

    .line 47
    .line 48
    rem-int/lit8 v0, v0, 0x2

    .line 49
    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0}, LVa/B7;->f()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {p1, v0}, LVa/pb;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const/16 v1, 0x49

    .line 61
    .line 62
    div-int/2addr v1, v2

    .line 63
    if-ltz v0, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {p0}, LVa/B7;->f()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {p1, v0}, LVa/pb;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-ltz v0, :cond_2

    .line 75
    .line 76
    :goto_0
    invoke-virtual {p0}, LVa/B7;->e()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p1, p0}, LVa/pb;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-gtz p0, :cond_2

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    :goto_1
    sget p0, LVa/V;->p:I

    .line 88
    .line 89
    add-int/lit8 p0, p0, 0x33

    .line 90
    .line 91
    rem-int/lit16 p0, p0, 0x80

    .line 92
    .line 93
    sput p0, LVa/V;->q:I

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_3
    :goto_2
    const/4 v2, 0x1

    .line 97
    :goto_3
    sget p0, LVa/V;->q:I

    .line 98
    .line 99
    add-int/lit8 p0, p0, 0x61

    .line 100
    .line 101
    rem-int/lit16 p0, p0, 0x80

    .line 102
    .line 103
    sput p0, LVa/V;->p:I

    .line 104
    .line 105
    return v2
.end method


# virtual methods
.method public final D(Landroid/content/Context;LVa/r9;Ljava/lang/String;LVa/Ba;)V
    .locals 7

    .line 1
    new-instance v0, LVa/Ga;

    .line 2
    .line 3
    const/4 v6, 0x1

    .line 4
    move-object v1, p0

    .line 5
    move-object v3, p1

    .line 6
    move-object v4, p2

    .line 7
    move-object v2, p3

    .line 8
    move-object v5, p4

    .line 9
    invoke-direct/range {v0 .. v6}, LVa/Ga;-><init>(LVa/V;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LVa/Ba;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, LVa/Cb;->g(LVa/Ba;)V

    .line 13
    .line 14
    .line 15
    sget p1, LVa/V;->q:I

    .line 16
    .line 17
    add-int/lit8 p1, p1, 0x3

    .line 18
    .line 19
    rem-int/lit16 p2, p1, 0x80

    .line 20
    .line 21
    sput p2, LVa/V;->p:I

    .line 22
    .line 23
    rem-int/lit8 p1, p1, 0x2

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/16 p1, 0x4d

    .line 28
    .line 29
    div-int/lit8 p1, p1, 0x0

    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final F(Ljava/lang/String;)Z
    .locals 4

    .line 1
    sget v0, LVa/V;->q:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x6d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V;->p:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, LVa/V;->i:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v2, 0x1

    .line 21
    xor-int/2addr v0, v2

    .line 22
    if-eq v0, v2, :cond_1

    .line 23
    .line 24
    sget v0, LVa/V;->p:I

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x65

    .line 27
    .line 28
    rem-int/lit16 v3, v0, 0x80

    .line 29
    .line 30
    sput v3, LVa/V;->q:I

    .line 31
    .line 32
    rem-int/lit8 v0, v0, 0x2

    .line 33
    .line 34
    iget-object v3, p0, LVa/V;->k:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    iget-object v0, p0, LVa/V;->i:Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, LVa/K;

    .line 45
    .line 46
    invoke-virtual {p1, v3}, LVa/K;->b(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    return v2

    .line 53
    :cond_0
    iget-object v0, p0, LVa/V;->i:Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, LVa/K;

    .line 60
    .line 61
    invoke-virtual {p1, v3}, LVa/K;->b(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    throw v1

    .line 65
    :cond_1
    sget p1, LVa/V;->p:I

    .line 66
    .line 67
    add-int/lit8 p1, p1, 0x35

    .line 68
    .line 69
    rem-int/lit16 v0, p1, 0x80

    .line 70
    .line 71
    sput v0, LVa/V;->q:I

    .line 72
    .line 73
    rem-int/lit8 p1, p1, 0x2

    .line 74
    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    return p1

    .line 79
    :cond_2
    throw v1

    .line 80
    :cond_3
    iget-object v0, p0, LVa/V;->i:Ljava/util/HashMap;

    .line 81
    .line 82
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    throw v1
.end method

.method public final I(LVa/B7;Ljava/lang/String;)V
    .locals 5

    .line 1
    sget v0, LVa/V;->q:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x55

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V;->p:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, LVa/V;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p1}, LVa/B7;->j()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v2, p0, LVa/V;->j:LVa/la;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    sget p1, LVa/V;->q:I

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x5f

    .line 34
    .line 35
    rem-int/lit16 p2, p1, 0x80

    .line 36
    .line 37
    sput p2, LVa/V;->p:I

    .line 38
    .line 39
    rem-int/lit8 p1, p1, 0x2

    .line 40
    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    :goto_0
    return-void

    .line 44
    :cond_1
    throw v1

    .line 45
    :cond_2
    sget-object v1, LVa/a0;->c:LVa/a0;

    .line 46
    .line 47
    new-instance v3, LVa/Da;

    .line 48
    .line 49
    const/16 v4, 0x8

    .line 50
    .line 51
    invoke-direct {v3, v2, v0, v1, v4}, LVa/Da;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    invoke-static {v3}, LVa/Cb;->g(LVa/Ba;)V

    .line 55
    .line 56
    .line 57
    new-instance v1, LVa/O;

    .line 58
    .line 59
    invoke-direct {v1, p0, p1, v0, p2}, LVa/O;-><init>(LVa/V;LVa/B7;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v1}, LVa/Cb;->g(LVa/Ba;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    iget-object p1, p0, LVa/V;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 69
    .line 70
    .line 71
    throw v1
.end method

.method public final J(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/ArrayList;LVa/Da;)V
    .locals 9

    .line 1
    sget v0, LVa/V;->q:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V;->p:I

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
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/16 v2, 0x10

    .line 19
    .line 20
    div-int/2addr v2, v1

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    :goto_0
    return-void

    .line 31
    :cond_1
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, LVa/r9;

    .line 36
    .line 37
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_3

    .line 48
    .line 49
    sget p2, LVa/V;->q:I

    .line 50
    .line 51
    add-int/lit8 p2, p2, 0x7b

    .line 52
    .line 53
    rem-int/lit16 p3, p2, 0x80

    .line 54
    .line 55
    sput p3, LVa/V;->p:I

    .line 56
    .line 57
    rem-int/lit8 p2, p2, 0x2

    .line 58
    .line 59
    if-nez p2, :cond_2

    .line 60
    .line 61
    move-object v3, p0

    .line 62
    move-object v4, p1

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    const/4 p1, 0x0

    .line 65
    throw p1

    .line 66
    :cond_3
    new-instance v2, LVa/Ga;

    .line 67
    .line 68
    const/4 v8, 0x2

    .line 69
    move-object v3, p0

    .line 70
    move-object v4, p1

    .line 71
    move-object v5, p2

    .line 72
    move-object v6, p3

    .line 73
    move-object v7, p4

    .line 74
    invoke-direct/range {v2 .. v8}, LVa/Ga;-><init>(LVa/V;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LVa/Ba;I)V

    .line 75
    .line 76
    .line 77
    move-object p4, v2

    .line 78
    :goto_1
    invoke-virtual {p0, v4, v0, v1, p4}, LVa/V;->D(Landroid/content/Context;LVa/r9;Ljava/lang/String;LVa/Ba;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final declared-synchronized K()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/V;->p:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x69

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, LVa/V;->q:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, LVa/V;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v0, p0, LVa/V;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 30
    .line 31
    .line 32
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    :goto_0
    monitor-exit p0

    .line 36
    return-void

    .line 37
    :cond_1
    :try_start_1
    iget-object v0, p0, LVa/V;->j:LVa/la;

    .line 38
    .line 39
    new-instance v1, LVa/L;

    .line 40
    .line 41
    invoke-direct {v1}, LVa/L;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p0, v1, LVa/L;->d:LVa/V;

    .line 45
    .line 46
    invoke-static {v1}, LVa/Cb;->e(LVa/Ba;)V

    .line 47
    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    new-instance v1, LVa/v;

    .line 52
    .line 53
    const/16 v2, 0xe

    .line 54
    .line 55
    invoke-direct {v1, v2}, LVa/v;-><init>(I)V

    .line 56
    .line 57
    .line 58
    iput-object v0, v1, LVa/v;->d:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-static {v1}, LVa/Cb;->g(LVa/Ba;)V

    .line 61
    .line 62
    .line 63
    sget v0, LVa/V;->q:I

    .line 64
    .line 65
    add-int/lit8 v0, v0, 0x73

    .line 66
    .line 67
    rem-int/lit16 v0, v0, 0x80

    .line 68
    .line 69
    sput v0, LVa/V;->p:I

    .line 70
    .line 71
    :cond_2
    const/4 v0, 0x0

    .line 72
    iput-object v0, p0, LVa/V;->j:LVa/la;

    .line 73
    .line 74
    sget v0, LVa/V;->p:I

    .line 75
    .line 76
    add-int/lit8 v0, v0, 0x69

    .line 77
    .line 78
    rem-int/lit16 v0, v0, 0x80

    .line 79
    .line 80
    sput v0, LVa/V;->q:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    monitor-exit p0

    .line 83
    return-void

    .line 84
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    throw v0
.end method

.method public final declared-synchronized L()Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitListener;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/V;->q:I

    .line 3
    .line 4
    iget-object v1, p0, LVa/V;->l:LVa/Hb;

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x4f

    .line 7
    .line 8
    rem-int/lit16 v2, v0, 0x80

    .line 9
    .line 10
    sput v2, LVa/V;->p:I

    .line 11
    .line 12
    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/16 v0, 0x13

    .line 17
    .line 18
    :try_start_1
    div-int/lit8 v0, v0, 0x0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-object v1

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 24
    :catchall_1
    move-exception v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    monitor-exit p0

    .line 27
    return-object v1

    .line 28
    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 29
    throw v0
.end method

.method public final P(Landroid/content/Context;LVa/Da;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x3

    .line 4
    new-instance v3, Ljava/util/ArrayList;

    .line 5
    .line 6
    sget-object v4, LVa/Y;->a:Ljava/util/List;

    .line 7
    .line 8
    new-instance v4, LVa/g9;

    .line 9
    .line 10
    invoke-direct {v4, v2}, LVa/g9;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v5, LVa/g9;

    .line 14
    .line 15
    invoke-direct {v5, v1}, LVa/g9;-><init>(I)V

    .line 16
    .line 17
    .line 18
    new-instance v6, LVa/g9;

    .line 19
    .line 20
    invoke-direct {v6, v0}, LVa/g9;-><init>(I)V

    .line 21
    .line 22
    .line 23
    new-array v2, v2, [LVa/r9;

    .line 24
    .line 25
    aput-object v4, v2, v0

    .line 26
    .line 27
    aput-object v5, v2, v1

    .line 28
    .line 29
    const/4 v0, 0x2

    .line 30
    aput-object v6, v2, v0

    .line 31
    .line 32
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget v1, LVa/Y;->e:I

    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x29

    .line 39
    .line 40
    rem-int/lit16 v1, v1, 0x80

    .line 41
    .line 42
    sput v1, LVa/Y;->d:I

    .line 43
    .line 44
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-static {}, LVa/Y;->c()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1, v3, v0, p2}, LVa/V;->J(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/ArrayList;LVa/Da;)V

    .line 57
    .line 58
    .line 59
    sget p1, LVa/V;->q:I

    .line 60
    .line 61
    add-int/lit8 p1, p1, 0x63

    .line 62
    .line 63
    rem-int/lit16 p1, p1, 0x80

    .line 64
    .line 65
    sput p1, LVa/V;->p:I

    .line 66
    .line 67
    return-void
.end method

.method public final declared-synchronized a()Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/V;->p:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x61

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, LVa/V;->q:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LVa/G;->C()Z

    .line 20
    .line 21
    .line 22
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    const/16 v2, 0x30

    .line 24
    .line 25
    :try_start_1
    div-int/2addr v2, v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    :try_start_2
    throw v0

    .line 31
    :catchall_1
    move-exception v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, LVa/G;->C()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    :goto_0
    invoke-virtual {p0}, LVa/V;->d()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    sget v0, LVa/V;->q:I

    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x75

    .line 52
    .line 53
    rem-int/lit16 v1, v0, 0x80

    .line 54
    .line 55
    sput v1, LVa/V;->p:I

    .line 56
    .line 57
    rem-int/lit8 v0, v0, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 58
    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    monitor-exit p0

    .line 62
    const/4 v0, 0x1

    .line 63
    return v0

    .line 64
    :cond_1
    const/4 v0, 0x0

    .line 65
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 66
    :catchall_2
    move-exception v0

    .line 67
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 68
    :cond_2
    monitor-exit p0

    .line 69
    return v1

    .line 70
    :goto_1
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 71
    throw v0
.end method

.method public final declared-synchronized b()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/V;->q:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x79

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, LVa/V;->p:I

    .line 9
    .line 10
    iget-object v0, p0, LVa/V;->j:LVa/la;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    sget v0, LVa/V;->p:I

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x59

    .line 17
    .line 18
    rem-int/lit16 v0, v0, 0x80

    .line 19
    .line 20
    sput v0, LVa/V;->q:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    :try_start_1
    invoke-virtual {p0}, LVa/V;->a()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v0, v1}, LVa/la;->q(Z)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x1

    .line 35
    if-eq v0, v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, LVa/V;->L()Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitListener;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v1, Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;->CONNECTOR_LOAD_TIMEOUT:Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;

    .line 42
    .line 43
    const-string v2, "\u8362\u6e5c\u5932\u4412\u373f\u22d9\u0df8\uf890\uebb7\ud54f\uc075\ub30b\u9e2b\u899f\u74e9\u6798\u52ae\u3c46\u2f22\u1a0d\u052f\uf0c6\ue3e2\uce80\ub9a0\uab0b\u9679\u811c\u6c2b\u5fcc\u4aeb\u359e\u20bf\u13b5\ufd47\ue87d\udb1c\uc62e"

    .line 44
    .line 45
    const-string v3, ""

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-static {v3, v4}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const v4, 0xed1f

    .line 53
    .line 54
    .line 55
    add-int/2addr v3, v4

    .line 56
    invoke-static {v3, v2}, LVa/V;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v0, LVa/Hb;

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, LVa/Hb;->adQualitySdkInitFailed(Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    .line 68
    .line 69
    monitor-exit p0

    .line 70
    return-void

    .line 71
    :cond_1
    :try_start_2
    invoke-virtual {p0}, LVa/V;->L()Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitListener;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, LVa/Hb;

    .line 76
    .line 77
    invoke-virtual {v0}, LVa/Hb;->adQualitySdkInitSuccess()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 78
    .line 79
    .line 80
    monitor-exit p0

    .line 81
    return-void

    .line 82
    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 83
    throw v0
.end method

.method public final declared-synchronized c()Ljava/util/HashMap;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/V;->p:I

    .line 3
    .line 4
    iget-object v1, p0, LVa/V;->f:Ljava/util/HashMap;

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x4b

    .line 7
    .line 8
    rem-int/lit16 v2, v0, 0x80

    .line 9
    .line 10
    sput v2, LVa/V;->q:I

    .line 11
    .line 12
    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    monitor-exit p0

    .line 17
    return-object v1

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    :try_start_2
    throw v0

    .line 22
    :catchall_1
    move-exception v0

    .line 23
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 24
    throw v0
.end method

.method public final declared-synchronized d()Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/V;->p:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x49

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, LVa/V;->q:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, LVa/G;->D()Z

    .line 19
    .line 20
    .line 21
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 22
    const/16 v1, 0x44

    .line 23
    .line 24
    :try_start_1
    div-int/lit8 v1, v1, 0x0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    :try_start_2
    throw v0

    .line 29
    :catchall_1
    move-exception v0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, LVa/G;->D()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    :goto_0
    sget v1, LVa/V;->p:I

    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x3

    .line 42
    .line 43
    rem-int/lit16 v2, v1, 0x80

    .line 44
    .line 45
    sput v2, LVa/V;->q:I

    .line 46
    .line 47
    rem-int/lit8 v1, v1, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 48
    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    const/16 v1, 0x61

    .line 52
    .line 53
    :try_start_3
    div-int/lit8 v1, v1, 0x0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 54
    .line 55
    monitor-exit p0

    .line 56
    return v0

    .line 57
    :catchall_2
    move-exception v0

    .line 58
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 59
    :cond_1
    monitor-exit p0

    .line 60
    return v0

    .line 61
    :goto_1
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 62
    throw v0
.end method

.method public final e()Ljava/util/ArrayList;
    .locals 4

    .line 1
    sget v0, LVa/V;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3f

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/V;->q:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/V;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    iget-object v2, p0, LVa/V;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    sget v2, LVa/V;->p:I

    .line 22
    .line 23
    add-int/lit8 v2, v2, 0xb

    .line 24
    .line 25
    rem-int/lit16 v3, v2, 0x80

    .line 26
    .line 27
    sput v3, LVa/V;->q:I

    .line 28
    .line 29
    rem-int/2addr v2, v1

    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    div-int/lit8 v1, v1, 0x0

    .line 33
    .line 34
    :cond_0
    return-object v0

    .line 35
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    sget v2, LVa/V;->p:I

    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x6d

    .line 43
    .line 44
    rem-int/lit16 v3, v2, 0x80

    .line 45
    .line 46
    sput v3, LVa/V;->q:I

    .line 47
    .line 48
    rem-int/2addr v2, v1

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_2
    const/4 v0, 0x0

    .line 53
    throw v0
.end method

.method public final declared-synchronized f()Ljava/util/HashMap;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/V;->q:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x25

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, LVa/V;->p:I

    .line 9
    .line 10
    iget-object v1, p0, LVa/V;->e:Ljava/util/HashMap;

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x5

    .line 13
    .line 14
    rem-int/lit16 v2, v0, 0x80

    .line 15
    .line 16
    sput v2, LVa/V;->q:I

    .line 17
    .line 18
    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-object v1

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    :try_start_2
    throw v0

    .line 28
    :catchall_1
    move-exception v0

    .line 29
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 30
    throw v0
.end method

.method public final declared-synchronized i()Ljava/util/ArrayList;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/V;->p:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x7

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, LVa/V;->q:I

    .line 9
    .line 10
    iget-object v1, p0, LVa/V;->d:Ljava/util/ArrayList;

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x4b

    .line 13
    .line 14
    rem-int/lit16 v2, v0, 0x80

    .line 15
    .line 16
    sput v2, LVa/V;->p:I

    .line 17
    .line 18
    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-object v1

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    :try_start_2
    throw v0

    .line 28
    :catchall_1
    move-exception v0

    .line 29
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 30
    throw v0
.end method

.method public final declared-synchronized k()Ljava/util/List;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/V;->p:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x67

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, LVa/V;->q:I

    .line 9
    .line 10
    iget-object v0, p0, LVa/V;->c:Ljava/util/ArrayList;

    .line 11
    .line 12
    sget v1, LVa/V;->p:I

    .line 13
    .line 14
    add-int/lit8 v1, v1, 0x6b

    .line 15
    .line 16
    rem-int/lit16 v1, v1, 0x80

    .line 17
    .line 18
    sput v1, LVa/V;->q:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-object v0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw v0
.end method

.method public final p(Landroid/content/Context;)V
    .locals 10

    .line 1
    sget v0, LVa/V;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x9

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/V;->q:I

    .line 8
    .line 9
    invoke-virtual {p0}, LVa/V;->d()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    new-instance v0, LVa/L;

    .line 16
    .line 17
    invoke-direct {v0, p0}, LVa/L;-><init>(LVa/V;)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget v2, LVa/G;->E:I

    .line 28
    .line 29
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    rem-int/lit16 v3, v2, 0x80

    .line 32
    .line 33
    sput v3, LVa/G;->F:I

    .line 34
    .line 35
    rem-int/lit8 v2, v2, 0x2

    .line 36
    .line 37
    iget v3, v1, LVa/G;->j:I

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const-string v5, "\u357a\ucac5\u6a35\u3604"

    .line 41
    .line 42
    invoke-virtual {v1}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 47
    .line 48
    .line 49
    move-result-wide v6

    .line 50
    if-nez v2, :cond_0

    .line 51
    .line 52
    const-wide/16 v8, 0x1

    .line 53
    .line 54
    cmp-long v2, v6, v8

    .line 55
    .line 56
    shr-int v2, v4, v2

    .line 57
    .line 58
    :goto_0
    invoke-static {v2, v5}, LVa/G;->T(ILjava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    goto :goto_1

    .line 71
    :cond_0
    const-wide/16 v8, 0x0

    .line 72
    .line 73
    cmp-long v2, v6, v8

    .line 74
    .line 75
    add-int/2addr v2, v4

    .line 76
    goto :goto_0

    .line 77
    :goto_1
    int-to-long v1, v1

    .line 78
    invoke-static {v0, v1, v2}, LVa/Cb;->f(LVa/Ba;J)V

    .line 79
    .line 80
    .line 81
    sget v0, LVa/V;->q:I

    .line 82
    .line 83
    add-int/lit8 v0, v0, 0x6b

    .line 84
    .line 85
    rem-int/lit16 v0, v0, 0x80

    .line 86
    .line 87
    sput v0, LVa/V;->p:I

    .line 88
    .line 89
    :cond_1
    invoke-static {}, LVa/Y;->e()Ljava/util/LinkedHashMap;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    new-instance v1, LVa/Da;

    .line 94
    .line 95
    invoke-direct {v1, p0, p1, v0}, LVa/Da;-><init>(LVa/V;Landroid/content/Context;Ljava/util/LinkedHashMap;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v1}, LVa/Cb;->g(LVa/Ba;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final q(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LVa/M;)V
    .locals 1

    .line 1
    new-instance v0, LVa/Q;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, LVa/Q;->h:LVa/V;

    .line 7
    .line 8
    iput-object p3, v0, LVa/Q;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p1, v0, LVa/Q;->d:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p2, v0, LVa/Q;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p4, v0, LVa/Q;->f:Ljava/util/List;

    .line 15
    .line 16
    iput-object p5, v0, LVa/Q;->g:LVa/M;

    .line 17
    .line 18
    invoke-static {v0}, LVa/Cb;->e(LVa/Ba;)V

    .line 19
    .line 20
    .line 21
    sget p1, LVa/V;->q:I

    .line 22
    .line 23
    add-int/lit8 p1, p1, 0x71

    .line 24
    .line 25
    rem-int/lit16 p2, p1, 0x80

    .line 26
    .line 27
    sput p2, LVa/V;->p:I

    .line 28
    .line 29
    rem-int/lit8 p1, p1, 0x2

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    const/16 p1, 0x1e

    .line 34
    .line 35
    div-int/lit8 p1, p1, 0x0

    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public final r(Landroid/content/Context;Ljava/util/LinkedHashMap;LVa/v;)V
    .locals 9

    .line 1
    :cond_0
    invoke-interface {p2}, Ljava/util/Map;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_6

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v5, v0

    .line 20
    check-cast v5, Ljava/lang/String;

    .line 21
    .line 22
    invoke-interface {p2, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v6, v0

    .line 27
    check-cast v6, Ljava/util/List;

    .line 28
    .line 29
    if-eqz v6, :cond_3

    .line 30
    .line 31
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    sget v0, LVa/V;->q:I

    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x73

    .line 41
    .line 42
    rem-int/lit16 v0, v0, 0x80

    .line 43
    .line 44
    sput v0, LVa/V;->p:I

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, LVa/r9;

    .line 58
    .line 59
    invoke-virtual {v1}, LVa/r9;->a()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    sget v2, LVa/V;->p:I

    .line 64
    .line 65
    add-int/lit8 v2, v2, 0x75

    .line 66
    .line 67
    rem-int/lit16 v3, v2, 0x80

    .line 68
    .line 69
    sput v3, LVa/V;->q:I

    .line 70
    .line 71
    rem-int/lit8 v2, v2, 0x2

    .line 72
    .line 73
    if-nez v2, :cond_2

    .line 74
    .line 75
    const/16 v2, 0x9

    .line 76
    .line 77
    div-int/2addr v2, v0

    .line 78
    :cond_2
    :goto_0
    move-object v3, v1

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    :goto_1
    const/4 v1, 0x0

    .line 81
    goto :goto_0

    .line 82
    :goto_2
    if-eqz v3, :cond_0

    .line 83
    .line 84
    iget-object v0, p0, LVa/V;->j:LVa/la;

    .line 85
    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    iget-object v0, v0, LVa/la;->a:Ljava/util/HashMap;

    .line 89
    .line 90
    new-instance v1, LVa/c0;

    .line 91
    .line 92
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 93
    .line 94
    .line 95
    sget-object v2, LVa/a0;->a:LVa/a0;

    .line 96
    .line 97
    iput-object v2, v1, LVa/c0;->g:LVa/a0;

    .line 98
    .line 99
    sget-object v2, LVa/b0;->a:LVa/b0;

    .line 100
    .line 101
    iput-object v2, v1, LVa/c0;->h:LVa/b0;

    .line 102
    .line 103
    iput-object v3, v1, LVa/c0;->a:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    :cond_4
    new-instance v1, LVa/N;

    .line 109
    .line 110
    move-object v2, p0

    .line 111
    move-object v4, p1

    .line 112
    move-object v7, p2

    .line 113
    move-object v8, p3

    .line 114
    invoke-direct/range {v1 .. v8}, LVa/N;-><init>(LVa/V;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Ljava/util/LinkedHashMap;LVa/v;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v1}, LVa/Cb;->c(LVa/Ba;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, LVa/V;->d()Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-nez p1, :cond_5

    .line 125
    .line 126
    invoke-virtual {p0, v4, v7, v8}, LVa/V;->r(Landroid/content/Context;Ljava/util/LinkedHashMap;LVa/v;)V

    .line 127
    .line 128
    .line 129
    sget p1, LVa/V;->p:I

    .line 130
    .line 131
    add-int/lit8 p1, p1, 0x45

    .line 132
    .line 133
    :goto_3
    rem-int/lit16 p1, p1, 0x80

    .line 134
    .line 135
    sput p1, LVa/V;->q:I

    .line 136
    .line 137
    :cond_5
    return-void

    .line 138
    :cond_6
    move-object v8, p3

    .line 139
    new-instance p1, LVa/v;

    .line 140
    .line 141
    const/16 p2, 0xc

    .line 142
    .line 143
    invoke-direct {p1, v8, p2}, LVa/v;-><init>(Ljava/lang/Object;I)V

    .line 144
    .line 145
    .line 146
    invoke-static {p1}, LVa/Cb;->e(LVa/Ba;)V

    .line 147
    .line 148
    .line 149
    sget p1, LVa/V;->p:I

    .line 150
    .line 151
    add-int/lit8 p1, p1, 0x65

    .line 152
    .line 153
    goto :goto_3
.end method

.method public final s(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 4

    .line 1
    iget-object v0, p0, LVa/V;->j:LVa/la;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, LVa/a0;->e:LVa/a0;

    .line 6
    .line 7
    new-instance v2, LVa/Da;

    .line 8
    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    invoke-direct {v2, v0, p1, v1, v3}, LVa/Da;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v2}, LVa/Cb;->g(LVa/Ba;)V

    .line 15
    .line 16
    .line 17
    sget p1, LVa/V;->q:I

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x1d

    .line 20
    .line 21
    rem-int/lit16 p1, p1, 0x80

    .line 22
    .line 23
    sput p1, LVa/V;->p:I

    .line 24
    .line 25
    :cond_0
    if-eqz p2, :cond_2

    .line 26
    .line 27
    :try_start_0
    const-string p1, "\u8348\u1838\ub5b1"

    .line 28
    .line 29
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v1, 0x0

    .line 34
    cmpl-float v0, v0, v1

    .line 35
    .line 36
    const v1, 0x9b76

    .line 37
    .line 38
    .line 39
    add-int/2addr v0, v1

    .line 40
    invoke-static {v0, p1}, LVa/V;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const/4 v0, 0x1

    .line 49
    invoke-virtual {p2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    sget p1, LVa/V;->q:I

    .line 53
    .line 54
    add-int/lit8 p1, p1, 0x49

    .line 55
    .line 56
    rem-int/lit16 p2, p1, 0x80

    .line 57
    .line 58
    sput p2, LVa/V;->p:I

    .line 59
    .line 60
    rem-int/lit8 p1, p1, 0x2

    .line 61
    .line 62
    if-nez p1, :cond_1

    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    const/4 p1, 0x0

    .line 66
    throw p1

    .line 67
    :catch_0
    :cond_2
    return-void
.end method

.method public final u()Lorg/json/JSONObject;
    .locals 4

    .line 1
    sget v0, LVa/V;->q:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x75

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V;->p:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {p0}, LVa/V;->f()Ljava/util/HashMap;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, LVa/V;->o(Ljava/util/HashMap;)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    sget v2, LVa/V;->q:I

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x55

    .line 25
    .line 26
    rem-int/lit16 v3, v2, 0x80

    .line 27
    .line 28
    sput v3, LVa/V;->p:I

    .line 29
    .line 30
    rem-int/lit8 v2, v2, 0x2

    .line 31
    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_0
    throw v1

    .line 36
    :catch_0
    move-exception v0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    :try_start_1
    invoke-virtual {p0}, LVa/V;->f()Ljava/util/HashMap;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, LVa/V;->o(Ljava/util/HashMap;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 43
    .line 44
    .line 45
    throw v1

    .line 46
    :goto_0
    const/4 v1, 0x0

    .line 47
    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    add-int/lit16 v2, v2, 0xe57

    .line 52
    .line 53
    const-string v3, "\u836f\u8d14\u9fec\ua847\uba15\uc4fc\ud552\ue722\uf1e6\u026e\u0c2b\u1eff\u2f59\u3920\u4b8b\u5447"

    .line 54
    .line 55
    invoke-static {v2, v3}, LVa/V;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    add-int/lit16 v1, v1, 0x3901

    .line 68
    .line 69
    const-string v3, "\u8369\uba5f\uf15c\u2840\u675a\u9e09\ud54b\u0c4f\u4b40\u824c\ub948\uf040\u2f00\u6642\u9d4d\ud44d\u1352\u4a58\u815d\ub84b\uf757\u2e4b\u651a\u9c4d\udb51\u1247\u4945\u805e\ubf5f\uf65f\u2d41"

    .line 70
    .line 71
    invoke-static {v1, v3}, LVa/V;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-static {v2, v1, v0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    new-instance v0, Lorg/json/JSONObject;

    .line 83
    .line 84
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 85
    .line 86
    .line 87
    return-object v0
.end method

.method public final w(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;LVa/r9;LVa/Ba;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget v6, LVa/r9;->b:I

    .line 17
    .line 18
    add-int/lit8 v6, v6, 0x5f

    .line 19
    .line 20
    rem-int/lit16 v7, v6, 0x80

    .line 21
    .line 22
    sput v7, LVa/r9;->a:I

    .line 23
    .line 24
    rem-int/lit8 v6, v6, 0x2

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    if-nez v6, :cond_a

    .line 28
    .line 29
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-virtual {v6}, LVa/G;->J()LVa/E;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-virtual {v6}, LVa/E;->x()Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    const-wide/16 v8, 0x0

    .line 42
    .line 43
    const/4 v10, 0x0

    .line 44
    const-string v11, "\u8c19\u812b\u9648"

    .line 45
    .line 46
    const-string v12, "\u8c4d\ucfca\u0b56\u46e1\u8267\uddfa\u1918\u548c\u9004\ud3be\u2f6f"

    .line 47
    .line 48
    if-eqz v6, :cond_2

    .line 49
    .line 50
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-virtual {v6}, LVa/G;->J()LVa/E;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {v4}, LVa/r9;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v13

    .line 62
    invoke-virtual {v6, v13}, LVa/E;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v13

    .line 70
    if-eqz v13, :cond_1

    .line 71
    .line 72
    sget v6, LVa/r9;->a:I

    .line 73
    .line 74
    add-int/lit8 v6, v6, 0x6d

    .line 75
    .line 76
    rem-int/lit16 v11, v6, 0x80

    .line 77
    .line 78
    sput v11, LVa/r9;->b:I

    .line 79
    .line 80
    rem-int/lit8 v6, v6, 0x2

    .line 81
    .line 82
    if-eqz v6, :cond_0

    .line 83
    .line 84
    move-object v13, v7

    .line 85
    goto :goto_0

    .line 86
    :cond_0
    throw v7

    .line 87
    :cond_1
    new-instance v13, LVa/Ma;

    .line 88
    .line 89
    new-instance v14, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-static {v10}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 95
    .line 96
    .line 97
    move-result-wide v15

    .line 98
    cmp-long v15, v15, v8

    .line 99
    .line 100
    add-int/lit16 v15, v15, 0x438b

    .line 101
    .line 102
    invoke-static {v15, v12}, LVa/r9;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v12

    .line 106
    invoke-virtual {v12}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v12

    .line 110
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4}, LVa/r9;->a()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v12

    .line 117
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v12

    .line 124
    invoke-static {v10}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 125
    .line 126
    .line 127
    move-result v14

    .line 128
    rsub-int v14, v14, 0xd2b

    .line 129
    .line 130
    invoke-static {v14, v11}, LVa/r9;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    invoke-direct {v13, v12, v11, v6}, LVa/Ma;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    sget v6, LVa/r9;->a:I

    .line 142
    .line 143
    add-int/lit8 v6, v6, 0x3

    .line 144
    .line 145
    rem-int/lit16 v6, v6, 0x80

    .line 146
    .line 147
    sput v6, LVa/r9;->b:I

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_2
    new-instance v13, LVa/Oa;

    .line 151
    .line 152
    new-instance v6, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const-string v14, ""

    .line 158
    .line 159
    const/16 v15, 0x30

    .line 160
    .line 161
    invoke-static {v14, v15, v10, v10}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 162
    .line 163
    .line 164
    move-result v14

    .line 165
    rsub-int v14, v14, 0x438a

    .line 166
    .line 167
    invoke-static {v14, v12}, LVa/r9;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v12

    .line 171
    invoke-virtual {v12}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v4}, LVa/r9;->a()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v12

    .line 182
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    invoke-static {v15}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 190
    .line 191
    .line 192
    move-result v12

    .line 193
    rsub-int v12, v12, 0xd5b

    .line 194
    .line 195
    invoke-static {v12, v11}, LVa/r9;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    const/4 v12, 0x1

    .line 204
    invoke-direct {v13, v12, v6, v11}, LVa/Oa;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    :goto_0
    if-eqz v13, :cond_9

    .line 208
    .line 209
    sget v6, LVa/V;->q:I

    .line 210
    .line 211
    add-int/lit8 v6, v6, 0x35

    .line 212
    .line 213
    rem-int/lit16 v6, v6, 0x80

    .line 214
    .line 215
    sput v6, LVa/V;->p:I

    .line 216
    .line 217
    invoke-virtual {v4}, LVa/r9;->c()LVa/Z0;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    sget v11, LVa/V;->q:I

    .line 222
    .line 223
    add-int/lit8 v11, v11, 0x47

    .line 224
    .line 225
    rem-int/lit16 v11, v11, 0x80

    .line 226
    .line 227
    sput v11, LVa/V;->p:I

    .line 228
    .line 229
    invoke-virtual {v6}, LVa/Z0;->x0()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v11

    .line 233
    invoke-virtual {v0}, LVa/V;->f()Ljava/util/HashMap;

    .line 234
    .line 235
    .line 236
    move-result-object v12

    .line 237
    invoke-static {v11}, LVa/V;->n(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    invoke-virtual {v12, v3, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    sget v11, LVa/V;->p:I

    .line 245
    .line 246
    add-int/lit8 v11, v11, 0x77

    .line 247
    .line 248
    rem-int/lit16 v11, v11, 0x80

    .line 249
    .line 250
    sput v11, LVa/V;->q:I

    .line 251
    .line 252
    iget-object v11, v0, LVa/V;->j:LVa/la;

    .line 253
    .line 254
    if-eqz v11, :cond_3

    .line 255
    .line 256
    sget-object v12, LVa/a0;->b:LVa/a0;

    .line 257
    .line 258
    new-instance v14, LVa/Da;

    .line 259
    .line 260
    const/16 v15, 0x8

    .line 261
    .line 262
    invoke-direct {v14, v11, v3, v12, v15}, LVa/Da;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 263
    .line 264
    .line 265
    invoke-static {v14}, LVa/Cb;->g(LVa/Ba;)V

    .line 266
    .line 267
    .line 268
    sget v11, LVa/V;->p:I

    .line 269
    .line 270
    add-int/lit8 v11, v11, 0x1f

    .line 271
    .line 272
    rem-int/lit16 v11, v11, 0x80

    .line 273
    .line 274
    sput v11, LVa/V;->q:I

    .line 275
    .line 276
    :cond_3
    iget-object v11, v0, LVa/V;->m:LVa/Ha;

    .line 277
    .line 278
    new-instance v12, Lq/s1;

    .line 279
    .line 280
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 281
    .line 282
    .line 283
    iput-object v0, v12, Lq/s1;->g:Ljava/lang/Object;

    .line 284
    .line 285
    iput-object v1, v12, Lq/s1;->a:Ljava/lang/Object;

    .line 286
    .line 287
    iput-object v6, v12, Lq/s1;->b:Ljava/lang/Object;

    .line 288
    .line 289
    iput-object v2, v12, Lq/s1;->c:Ljava/lang/Object;

    .line 290
    .line 291
    iput-object v3, v12, Lq/s1;->d:Ljava/lang/Object;

    .line 292
    .line 293
    iput-object v4, v12, Lq/s1;->e:Ljava/lang/Object;

    .line 294
    .line 295
    iput-object v5, v12, Lq/s1;->f:Ljava/lang/Object;

    .line 296
    .line 297
    invoke-virtual {v11, v13, v12}, LVa/Ha;->c(LVa/Pa;LVa/ya;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v11

    .line 301
    new-instance v12, LVa/U;

    .line 302
    .line 303
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 304
    .line 305
    .line 306
    iput-object v0, v12, LVa/U;->j:LVa/V;

    .line 307
    .line 308
    iput-object v1, v12, LVa/U;->c:Landroid/content/Context;

    .line 309
    .line 310
    iput-object v11, v12, LVa/U;->d:Ljava/lang/String;

    .line 311
    .line 312
    iput-object v6, v12, LVa/U;->e:LVa/Z0;

    .line 313
    .line 314
    iput-object v2, v12, LVa/U;->f:Ljava/lang/String;

    .line 315
    .line 316
    iput-object v3, v12, LVa/U;->g:Ljava/lang/String;

    .line 317
    .line 318
    iput-object v4, v12, LVa/U;->h:LVa/r9;

    .line 319
    .line 320
    iput-object v5, v12, LVa/U;->i:LVa/Ba;

    .line 321
    .line 322
    sget v1, LVa/V;->p:I

    .line 323
    .line 324
    add-int/lit8 v1, v1, 0x53

    .line 325
    .line 326
    rem-int/lit16 v1, v1, 0x80

    .line 327
    .line 328
    sput v1, LVa/V;->q:I

    .line 329
    .line 330
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-virtual {v1}, LVa/G;->R()Z

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    const-wide/16 v2, 0x7d0

    .line 339
    .line 340
    if-eqz v1, :cond_4

    .line 341
    .line 342
    sget v1, LVa/V;->q:I

    .line 343
    .line 344
    add-int/lit8 v1, v1, 0x45

    .line 345
    .line 346
    rem-int/lit16 v1, v1, 0x80

    .line 347
    .line 348
    sput v1, LVa/V;->p:I

    .line 349
    .line 350
    add-int/lit8 v1, v1, 0xd

    .line 351
    .line 352
    rem-int/lit16 v1, v1, 0x80

    .line 353
    .line 354
    sput v1, LVa/V;->q:I

    .line 355
    .line 356
    :goto_1
    move-wide v8, v2

    .line 357
    goto :goto_2

    .line 358
    :cond_4
    iget-object v1, v0, LVa/V;->m:LVa/Ha;

    .line 359
    .line 360
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    sget v4, LVa/Ha;->h:I

    .line 364
    .line 365
    add-int/lit8 v4, v4, 0x2f

    .line 366
    .line 367
    rem-int/lit16 v5, v4, 0x80

    .line 368
    .line 369
    sput v5, LVa/Ha;->g:I

    .line 370
    .line 371
    rem-int/lit8 v4, v4, 0x2

    .line 372
    .line 373
    iget-object v1, v1, LVa/Ha;->a:LVa/Ra;

    .line 374
    .line 375
    if-nez v4, :cond_8

    .line 376
    .line 377
    invoke-virtual {v13}, LVa/Pa;->d()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    invoke-virtual {v1, v4}, LVa/Ra;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    if-eqz v1, :cond_5

    .line 386
    .line 387
    sget v1, LVa/Ha;->g:I

    .line 388
    .line 389
    add-int/lit8 v1, v1, 0x79

    .line 390
    .line 391
    rem-int/lit16 v2, v1, 0x80

    .line 392
    .line 393
    sput v2, LVa/Ha;->h:I

    .line 394
    .line 395
    rem-int/lit8 v1, v1, 0x2

    .line 396
    .line 397
    if-nez v1, :cond_6

    .line 398
    .line 399
    const/16 v1, 0x43

    .line 400
    .line 401
    div-int/2addr v1, v10

    .line 402
    goto :goto_2

    .line 403
    :cond_5
    sget v1, LVa/V;->p:I

    .line 404
    .line 405
    add-int/lit8 v1, v1, 0x27

    .line 406
    .line 407
    rem-int/lit16 v4, v1, 0x80

    .line 408
    .line 409
    sput v4, LVa/V;->q:I

    .line 410
    .line 411
    rem-int/lit8 v1, v1, 0x2

    .line 412
    .line 413
    if-eqz v1, :cond_7

    .line 414
    .line 415
    goto :goto_1

    .line 416
    :cond_6
    :goto_2
    invoke-static {v12, v8, v9}, LVa/Cb;->f(LVa/Ba;J)V

    .line 417
    .line 418
    .line 419
    return-void

    .line 420
    :cond_7
    throw v7

    .line 421
    :cond_8
    invoke-virtual {v13}, LVa/Pa;->d()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    invoke-virtual {v1, v2}, LVa/Ra;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    throw v7

    .line 429
    :cond_9
    invoke-static {v5}, LVa/Cb;->e(LVa/Ba;)V

    .line 430
    .line 431
    .line 432
    return-void

    .line 433
    :cond_a
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    invoke-virtual {v1}, LVa/G;->J()LVa/E;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-virtual {v1}, LVa/E;->x()Z

    .line 442
    .line 443
    .line 444
    throw v7
.end method

.method public final x(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LVa/M;)V
    .locals 14

    .line 1
    sget v0, LVa/V;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/V;->q:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    div-int/lit8 v2, v1, 0x0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eq v2, v1, :cond_1

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    sget v2, LVa/V;->p:I

    .line 33
    .line 34
    add-int/lit8 v2, v2, 0x15

    .line 35
    .line 36
    rem-int/lit16 v3, v2, 0x80

    .line 37
    .line 38
    sput v3, LVa/V;->q:I

    .line 39
    .line 40
    rem-int/lit8 v2, v2, 0x2

    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    move-object v7, v2

    .line 49
    check-cast v7, LVa/r9;

    .line 50
    .line 51
    move-object v3, p0

    .line 52
    move-object v4, p1

    .line 53
    move-object/from16 v5, p2

    .line 54
    .line 55
    move-object/from16 v6, p3

    .line 56
    .line 57
    move-object/from16 v8, p5

    .line 58
    .line 59
    invoke-virtual/range {v3 .. v8}, LVa/V;->w(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;LVa/r9;LVa/Ba;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    move-object v12, v0

    .line 68
    check-cast v12, LVa/r9;

    .line 69
    .line 70
    move-object v8, p0

    .line 71
    move-object v9, p1

    .line 72
    move-object/from16 v10, p2

    .line 73
    .line 74
    move-object/from16 v11, p3

    .line 75
    .line 76
    move-object/from16 v13, p5

    .line 77
    .line 78
    invoke-virtual/range {v8 .. v13}, LVa/V;->w(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;LVa/r9;LVa/Ba;)V

    .line 79
    .line 80
    .line 81
    const/4 p1, 0x0

    .line 82
    throw p1
.end method

.method public final y(Ljava/lang/String;Ljava/util/List;)V
    .locals 3

    .line 1
    iget-object v0, p0, LVa/V;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget p1, LVa/V;->q:I

    .line 10
    .line 11
    add-int/lit8 p1, p1, 0x2b

    .line 12
    .line 13
    :goto_0
    rem-int/lit16 p1, p1, 0x80

    .line 14
    .line 15
    sput p1, LVa/V;->p:I

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0}, LVa/V;->e()Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    sget v1, LVa/V;->q:I

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x45

    .line 35
    .line 36
    rem-int/lit16 v2, v1, 0x80

    .line 37
    .line 38
    sput v2, LVa/V;->p:I

    .line 39
    .line 40
    rem-int/lit8 v1, v1, 0x2

    .line 41
    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, LVa/B7;

    .line 49
    .line 50
    invoke-virtual {v1, p1, p2}, LVa/B7;->p(Ljava/lang/String;Ljava/util/List;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, LVa/B7;

    .line 59
    .line 60
    invoke-virtual {v0, p1, p2}, LVa/B7;->p(Ljava/lang/String;Ljava/util/List;)V

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    throw p1

    .line 65
    :cond_2
    sget p1, LVa/V;->q:I

    .line 66
    .line 67
    add-int/lit8 p1, p1, 0x7d

    .line 68
    .line 69
    goto :goto_0
.end method
