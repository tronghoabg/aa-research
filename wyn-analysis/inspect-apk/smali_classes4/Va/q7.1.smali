.class public final LVa/q7;
.super LVa/a;
.source "SourceFile"


# static fields
.field public static final A:[C

.field public static B:I = 0x0

.field public static C:I = 0x1


# instance fields
.field public synthetic y:Z

.field public synthetic z:LVa/y7;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x79

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/q7;->A:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x61s
        0x67as
        0xc78s
        0x1233s
        0x180bs
        0x1ee6s
        0x24d8s
        0x2ab3s
        0x3089s
        0x376bs
        0x3d48s
        0x61s
        0x67as
        0xc78s
        0x1233s
        0x180bs
        0x1ee6s
        0x24d8s
        0x2ab3s
        0x3089s
        0x376bs
        0x3d48s
        0x430fs
        0x4910s
        0x4ff2s
        0x55d6s
        0x5ba3s
        0x61s
        0x67as
        0xc7fs
        0x1236s
        0x1811s
        0x1ef5s
        0x24dfs
        0x2ab7s
        0x3094s
        -0x37e2s
        -0x31fbs
        -0x3c00s
        -0x25b7s
        -0x2f92s
        -0x2976s
        -0x1360s
        -0x1d38s
        -0x715s
        -0xc9s
        -0xadfs
        -0x74a6s
        -0x7e86s
        -0x784ds
        -0x6258s
        0x61s
        0x67as
        0xc7fs
        0x1236s
        0x1817s
        0x1ee5s
        0x24d1s
        0x2ab6s
        0x76cs
        0x16ds
        0xb43s
        0x1537s
        0x1f23s
        0x19f8s
        0x23das
        0x2da9s
        0x3789s
        0x307cs
        0x3a53s
        0x4434s
        0x4adfs
        0x4cd3s
        0x46f6s
        0x58b1s
        0x52b8s
        0x544cs
        0x6e73s
        0x6017s
        0x7a3ds
        0x7de5s
        0x77e8s
        0x98bs
        0x3a5s
        0x540s
        0x1f78s
        0x112fs
        0x2b3es
        0x2d33s
        0x24das
        0x3ee6s
        0x63s
        0x66bs
        0xc4fs
        0x122es
        0x1817s
        0x1efbs
        0x24f1s
        0x2aa4s
        0x3095s
        0x3760s
        0x3d58s
        0x41s
        0x67ds
        0xc48s
        0x1233s
        0x180es
        0x1effs
        0x24c0s
        0x2aabs
        0x30b1s
        0x376as
        0x3d60s
        0x4323s
        0x491bs
        0x4ff2s
        0x55c1s
        0x5bacs
        0x6185s
        0x678cs
        0x6e32s
    .end array-data
.end method

.method public static M(IIC)Ljava/lang/String;
    .locals 9

    .line 1
    sget-object v0, LVa/Ab;->u:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-array v1, p1, [C

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    sput v2, LVa/Ab;->t:I

    .line 8
    .line 9
    :goto_0
    sget v2, LVa/Ab;->t:I

    .line 10
    .line 11
    if-ge v2, p1, :cond_0

    .line 12
    .line 13
    sget-object v3, LVa/q7;->A:[C

    .line 14
    .line 15
    add-int v4, p0, v2

    .line 16
    .line 17
    aget-char v3, v3, v4

    .line 18
    .line 19
    int-to-long v3, v3

    .line 20
    int-to-long v5, v2

    .line 21
    const-wide v7, -0x4b08205f58cff9e2L    # -1.557821506476822E-53

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    mul-long/2addr v5, v7

    .line 27
    xor-long/2addr v3, v5

    .line 28
    int-to-long v5, p2

    .line 29
    xor-long/2addr v3, v5

    .line 30
    long-to-int v3, v3

    .line 31
    int-to-char v3, v3

    .line 32
    aput-char v3, v1, v2

    .line 33
    .line 34
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    sput v2, LVa/Ab;->t:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 42
    .line 43
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 44
    .line 45
    .line 46
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    return-object p0

    .line 48
    :goto_1
    monitor-exit v0

    .line 49
    throw p0
.end method


# virtual methods
.method public final A(Lorg/json/JSONObject;Landroid/webkit/WebView;LVa/e0;Landroid/app/Activity;)V
    .locals 9

    .line 1
    sget v0, LVa/q7;->B:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/q7;->C:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const v1, 0xc87f

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-static {v0, v2}, Landroid/view/View;->resolveSize(II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    ushr-int v0, v1, v0

    .line 23
    .line 24
    int-to-char v0, v0

    .line 25
    const/16 v1, 0x4b

    .line 26
    .line 27
    invoke-static {v1}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/16 v2, 0x5d

    .line 32
    .line 33
    shr-int v1, v2, v1

    .line 34
    .line 35
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    ushr-int/lit8 v2, v2, 0x44

    .line 40
    .line 41
    const/16 v3, 0x37

    .line 42
    .line 43
    ushr-int v2, v3, v2

    .line 44
    .line 45
    invoke-static {v1, v2, v0}, LVa/q7;->M(IIC)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    move-object v1, p0

    .line 54
    move-object v3, p1

    .line 55
    move-object v4, p2

    .line 56
    move-object v5, p3

    .line 57
    move-object v6, p4

    .line 58
    invoke-virtual/range {v1 .. v6}, LVa/q7;->N(Ljava/lang/String;Lorg/json/JSONObject;Landroid/webkit/WebView;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    move-object v3, p1

    .line 63
    move-object v4, p2

    .line 64
    move-object v5, p3

    .line 65
    move-object v6, p4

    .line 66
    invoke-static {v2, v2}, Landroid/view/View;->resolveSize(II)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    sub-int/2addr v1, p1

    .line 71
    int-to-char p1, v1

    .line 72
    const/16 p2, 0x30

    .line 73
    .line 74
    invoke-static {p2}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    rsub-int/lit8 p2, p2, 0x54

    .line 79
    .line 80
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    shr-int/lit8 p3, p3, 0x10

    .line 85
    .line 86
    rsub-int/lit8 p3, p3, 0xf

    .line 87
    .line 88
    invoke-static {p2, p3, p1}, LVa/q7;->M(IIC)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    move-object v7, v5

    .line 97
    move-object v8, v6

    .line 98
    move-object v5, v3

    .line 99
    move-object v6, v4

    .line 100
    move-object v3, p0

    .line 101
    move-object v4, p1

    .line 102
    invoke-virtual/range {v3 .. v8}, LVa/q7;->N(Ljava/lang/String;Lorg/json/JSONObject;Landroid/webkit/WebView;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 103
    .line 104
    .line 105
    :goto_0
    sget p1, LVa/q7;->C:I

    .line 106
    .line 107
    add-int/lit8 p1, p1, 0x4f

    .line 108
    .line 109
    rem-int/lit16 p1, p1, 0x80

    .line 110
    .line 111
    sput p1, LVa/q7;->B:I

    .line 112
    .line 113
    return-void
.end method

.method public final B(Lorg/json/JSONObject;Landroid/webkit/WebView;Landroid/app/Activity;)V
    .locals 7

    .line 1
    sget v0, LVa/q7;->C:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x19

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/q7;->B:I

    .line 8
    .line 9
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    cmpl-float v0, v0, v1

    .line 15
    .line 16
    rsub-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    int-to-char v0, v0

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-static {v1, v1}, Landroid/view/View;->resolveSize(II)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    rsub-int/lit8 v1, v1, 0x33

    .line 25
    .line 26
    const-string v2, ""

    .line 27
    .line 28
    const/16 v3, 0x30

    .line 29
    .line 30
    invoke-static {v2, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    rsub-int/lit8 v2, v2, 0x7

    .line 35
    .line 36
    invoke-static {v1, v2, v0}, LVa/q7;->M(IIC)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const/4 v5, 0x0

    .line 45
    move-object v1, p0

    .line 46
    move-object v3, p1

    .line 47
    move-object v4, p2

    .line 48
    move-object v6, p3

    .line 49
    invoke-virtual/range {v1 .. v6}, LVa/q7;->N(Ljava/lang/String;Lorg/json/JSONObject;Landroid/webkit/WebView;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 50
    .line 51
    .line 52
    sget p1, LVa/q7;->B:I

    .line 53
    .line 54
    add-int/lit8 p1, p1, 0x51

    .line 55
    .line 56
    rem-int/lit16 p2, p1, 0x80

    .line 57
    .line 58
    sput p2, LVa/q7;->C:I

    .line 59
    .line 60
    rem-int/lit8 p1, p1, 0x2

    .line 61
    .line 62
    if-eqz p1, :cond_0

    .line 63
    .line 64
    return-void

    .line 65
    :cond_0
    const/4 p1, 0x0

    .line 66
    throw p1
.end method

.method public final E(Lorg/json/JSONObject;Landroid/webkit/WebView;Landroid/app/Activity;)V
    .locals 12

    .line 1
    sget v0, LVa/q7;->C:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x59

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/q7;->B:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const-string v1, ""

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-static {v1, v2, v0}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    int-to-char v1, v1

    .line 22
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/16 v4, 0x6a

    .line 27
    .line 28
    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    ushr-int v0, v4, v0

    .line 33
    .line 34
    invoke-static {v3, v0, v1}, LVa/q7;->M(IIC)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const/4 v5, 0x0

    .line 43
    move-object v1, p0

    .line 44
    move-object v3, p1

    .line 45
    move-object v4, p2

    .line 46
    move-object v6, p3

    .line 47
    invoke-virtual/range {v1 .. v6}, LVa/q7;->N(Ljava/lang/String;Lorg/json/JSONObject;Landroid/webkit/WebView;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    move-object v3, p1

    .line 52
    move-object v4, p2

    .line 53
    move-object v6, p3

    .line 54
    invoke-static {v1, v2, v2}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    int-to-char p1, p1

    .line 59
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 64
    .line 65
    .line 66
    move-result p3

    .line 67
    rsub-int/lit8 p3, p3, 0xb

    .line 68
    .line 69
    invoke-static {p2, p3, p1}, LVa/q7;->M(IIC)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    const/4 v10, 0x0

    .line 78
    move-object v8, v3

    .line 79
    move-object v9, v4

    .line 80
    move-object v11, v6

    .line 81
    move-object v6, p0

    .line 82
    invoke-virtual/range {v6 .. v11}, LVa/q7;->N(Ljava/lang/String;Lorg/json/JSONObject;Landroid/webkit/WebView;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final L(Lorg/json/JSONObject;Landroid/webkit/WebView;Landroid/app/Activity;)V
    .locals 7

    .line 1
    sget v0, LVa/q7;->C:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/q7;->B:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit16 v1, v1, 0x71a

    .line 15
    .line 16
    int-to-char v1, v1

    .line 17
    invoke-static {v0, v0}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    const-wide/16 v4, 0x0

    .line 22
    .line 23
    cmp-long v0, v2, v4

    .line 24
    .line 25
    rsub-int/lit8 v0, v0, 0x3a

    .line 26
    .line 27
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    const-wide/16 v4, -0x1

    .line 32
    .line 33
    cmp-long v2, v2, v4

    .line 34
    .line 35
    add-int/lit8 v2, v2, 0xb

    .line 36
    .line 37
    invoke-static {v0, v2, v1}, LVa/q7;->M(IIC)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const/4 v5, 0x0

    .line 46
    move-object v1, p0

    .line 47
    move-object v3, p1

    .line 48
    move-object v4, p2

    .line 49
    move-object v6, p3

    .line 50
    invoke-virtual/range {v1 .. v6}, LVa/q7;->N(Ljava/lang/String;Lorg/json/JSONObject;Landroid/webkit/WebView;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 51
    .line 52
    .line 53
    sget p1, LVa/q7;->B:I

    .line 54
    .line 55
    add-int/lit8 p1, p1, 0x61

    .line 56
    .line 57
    rem-int/lit16 p2, p1, 0x80

    .line 58
    .line 59
    sput p2, LVa/q7;->C:I

    .line 60
    .line 61
    rem-int/lit8 p1, p1, 0x2

    .line 62
    .line 63
    if-eqz p1, :cond_0

    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    const/4 p1, 0x0

    .line 67
    throw p1
.end method

.method public final N(Ljava/lang/String;Lorg/json/JSONObject;Landroid/webkit/WebView;Ljava/lang/Object;Landroid/app/Activity;)V
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    int-to-char v3, v3

    .line 13
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    shr-int/lit8 v4, v4, 0x10

    .line 18
    .line 19
    add-int/lit8 v4, v4, 0x66

    .line 20
    .line 21
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    shr-int/lit8 v5, v5, 0x10

    .line 26
    .line 27
    rsub-int/lit8 v5, v5, 0x13

    .line 28
    .line 29
    invoke-static {v4, v5, v3}, LVa/q7;->M(IIC)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const/4 v2, 0x4

    .line 48
    new-array v2, v2, [Ljava/lang/Object;

    .line 49
    .line 50
    aput-object p2, v2, v1

    .line 51
    .line 52
    const/4 p2, 0x1

    .line 53
    aput-object p3, v2, p2

    .line 54
    .line 55
    aput-object p4, v2, v0

    .line 56
    .line 57
    const/4 p2, 0x3

    .line 58
    aput-object p5, v2, p2

    .line 59
    .line 60
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    iget-object p3, p0, LVa/q7;->z:LVa/y7;

    .line 65
    .line 66
    iget-boolean p4, p0, LVa/q7;->y:Z

    .line 67
    .line 68
    invoke-static {p3, p1, p4, v1, p2}, LVa/y7;->s(LVa/y7;Ljava/lang/String;ZZLjava/util/List;)V

    .line 69
    .line 70
    .line 71
    sget p1, LVa/q7;->C:I

    .line 72
    .line 73
    add-int/lit8 p1, p1, 0x7

    .line 74
    .line 75
    rem-int/lit16 p2, p1, 0x80

    .line 76
    .line 77
    sput p2, LVa/q7;->B:I

    .line 78
    .line 79
    rem-int/2addr p1, v0

    .line 80
    if-nez p1, :cond_0

    .line 81
    .line 82
    return-void

    .line 83
    :cond_0
    const/4 p1, 0x0

    .line 84
    throw p1
.end method

.method public final b(Lorg/json/JSONObject;Landroid/webkit/WebView;LVa/e0;Landroid/app/Activity;)V
    .locals 7

    .line 1
    sget v0, LVa/q7;->C:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x27

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/q7;->B:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    int-to-char v0, v0

    .line 15
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    shr-int/lit8 v1, v1, 0x10

    .line 20
    .line 21
    rsub-int/lit8 v1, v1, 0x1b

    .line 22
    .line 23
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    shr-int/lit8 v2, v2, 0x10

    .line 28
    .line 29
    rsub-int/lit8 v2, v2, 0x9

    .line 30
    .line 31
    invoke-static {v1, v2, v0}, LVa/q7;->M(IIC)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    move-object v1, p0

    .line 40
    move-object v3, p1

    .line 41
    move-object v4, p2

    .line 42
    move-object v5, p3

    .line 43
    move-object v6, p4

    .line 44
    invoke-virtual/range {v1 .. v6}, LVa/q7;->N(Ljava/lang/String;Lorg/json/JSONObject;Landroid/webkit/WebView;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 45
    .line 46
    .line 47
    sget p1, LVa/q7;->C:I

    .line 48
    .line 49
    add-int/lit8 p1, p1, 0x67

    .line 50
    .line 51
    rem-int/lit16 p2, p1, 0x80

    .line 52
    .line 53
    sput p2, LVa/q7;->B:I

    .line 54
    .line 55
    rem-int/lit8 p1, p1, 0x2

    .line 56
    .line 57
    if-nez p1, :cond_0

    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    const/4 p1, 0x0

    .line 61
    throw p1
.end method

.method public final c(Lorg/json/JSONObject;Landroid/webkit/WebView;Landroid/app/Activity;)V
    .locals 7

    .line 1
    sget v0, LVa/q7;->C:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/q7;->B:I

    .line 8
    .line 9
    const-string v0, ""

    .line 10
    .line 11
    invoke-static {v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    int-to-char v0, v0

    .line 16
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    shr-int/lit8 v1, v1, 0x10

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x5b

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    rsub-int/lit8 v2, v2, 0xb

    .line 30
    .line 31
    invoke-static {v1, v2, v0}, LVa/q7;->M(IIC)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/4 v5, 0x0

    .line 40
    move-object v1, p0

    .line 41
    move-object v3, p1

    .line 42
    move-object v4, p2

    .line 43
    move-object v6, p3

    .line 44
    invoke-virtual/range {v1 .. v6}, LVa/q7;->N(Ljava/lang/String;Lorg/json/JSONObject;Landroid/webkit/WebView;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 45
    .line 46
    .line 47
    sget p1, LVa/q7;->B:I

    .line 48
    .line 49
    add-int/lit8 p1, p1, 0x21

    .line 50
    .line 51
    rem-int/lit16 p1, p1, 0x80

    .line 52
    .line 53
    sput p1, LVa/q7;->C:I

    .line 54
    .line 55
    return-void
.end method

.method public final synthetic h(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget v0, LVa/q7;->C:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x71

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/q7;->B:I

    .line 8
    .line 9
    check-cast p2, Landroid/webkit/WebView;

    .line 10
    .line 11
    check-cast p3, Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3}, LVa/q7;->c(Lorg/json/JSONObject;Landroid/webkit/WebView;Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    sget p1, LVa/q7;->C:I

    .line 17
    .line 18
    add-int/lit8 p1, p1, 0x51

    .line 19
    .line 20
    rem-int/lit16 p1, p1, 0x80

    .line 21
    .line 22
    sput p1, LVa/q7;->B:I

    .line 23
    .line 24
    return-void
.end method

.method public final j(Lorg/json/JSONObject;Landroid/webkit/WebView;LVa/Vb;Landroid/app/Activity;)V
    .locals 7

    .line 1
    sget v0, LVa/q7;->B:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/q7;->C:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit16 v1, v1, 0x4aa8

    .line 15
    .line 16
    int-to-char v1, v1

    .line 17
    const-string v2, ""

    .line 18
    .line 19
    const/16 v3, 0x30

    .line 20
    .line 21
    invoke-static {v2, v3, v0, v0}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    add-int/lit8 v4, v4, 0x48

    .line 26
    .line 27
    invoke-static {v2, v3, v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/lit8 v0, v0, 0x15

    .line 32
    .line 33
    invoke-static {v4, v0, v1}, LVa/q7;->M(IIC)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    move-object v1, p0

    .line 42
    move-object v3, p1

    .line 43
    move-object v4, p2

    .line 44
    move-object v5, p3

    .line 45
    move-object v6, p4

    .line 46
    invoke-virtual/range {v1 .. v6}, LVa/q7;->N(Ljava/lang/String;Lorg/json/JSONObject;Landroid/webkit/WebView;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 47
    .line 48
    .line 49
    sget p1, LVa/q7;->B:I

    .line 50
    .line 51
    add-int/lit8 p1, p1, 0x19

    .line 52
    .line 53
    rem-int/lit16 p2, p1, 0x80

    .line 54
    .line 55
    sput p2, LVa/q7;->C:I

    .line 56
    .line 57
    rem-int/lit8 p1, p1, 0x2

    .line 58
    .line 59
    if-eqz p1, :cond_0

    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    const/4 p1, 0x0

    .line 63
    throw p1
.end method

.method public final synthetic k(Lorg/json/JSONObject;Landroid/view/View;Landroid/view/KeyEvent$Callback;)V
    .locals 2

    .line 1
    sget v0, LVa/q7;->B:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/q7;->C:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    check-cast p2, Landroid/webkit/WebView;

    .line 12
    .line 13
    check-cast p3, Landroid/app/Activity;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, p3}, LVa/q7;->B(Lorg/json/JSONObject;Landroid/webkit/WebView;Landroid/app/Activity;)V

    .line 16
    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    throw p1
.end method

.method public final l(Lorg/json/JSONObject;Landroid/webkit/WebView;Landroid/app/Activity;)V
    .locals 8

    .line 1
    sget v0, LVa/q7;->C:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x51

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/q7;->B:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0, v0, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    int-to-char v1, v1

    .line 15
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    const-wide/16 v4, 0x0

    .line 20
    .line 21
    cmp-long v2, v2, v4

    .line 22
    .line 23
    rsub-int/lit8 v2, v2, 0xc

    .line 24
    .line 25
    const-string v3, ""

    .line 26
    .line 27
    invoke-static {v3, v3, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    add-int/lit8 v3, v3, 0x10

    .line 32
    .line 33
    invoke-static {v2, v3, v1}, LVa/q7;->M(IIC)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const/4 v6, 0x0

    .line 42
    move-object v2, p0

    .line 43
    move-object v4, p1

    .line 44
    move-object v5, p2

    .line 45
    move-object v7, p3

    .line 46
    invoke-virtual/range {v2 .. v7}, LVa/q7;->N(Ljava/lang/String;Lorg/json/JSONObject;Landroid/webkit/WebView;Ljava/lang/Object;Landroid/app/Activity;)V

    .line 47
    .line 48
    .line 49
    sget p1, LVa/q7;->C:I

    .line 50
    .line 51
    add-int/lit8 p1, p1, 0x1d

    .line 52
    .line 53
    rem-int/lit16 p2, p1, 0x80

    .line 54
    .line 55
    sput p2, LVa/q7;->B:I

    .line 56
    .line 57
    rem-int/lit8 p1, p1, 0x2

    .line 58
    .line 59
    if-eqz p1, :cond_0

    .line 60
    .line 61
    const/16 p1, 0x1b

    .line 62
    .line 63
    div-int/2addr p1, v0

    .line 64
    :cond_0
    return-void
.end method

.method public final synthetic m(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget v0, LVa/q7;->B:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x9

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/q7;->C:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    check-cast p2, Landroid/webkit/WebView;

    .line 12
    .line 13
    check-cast p3, Landroid/app/Activity;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, p3}, LVa/q7;->L(Lorg/json/JSONObject;Landroid/webkit/WebView;Landroid/app/Activity;)V

    .line 16
    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    throw p1
.end method

.method public final synthetic n(Lorg/json/JSONObject;Landroid/view/View;LVa/e0;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget v0, LVa/q7;->B:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x75

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/q7;->C:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    check-cast p2, Landroid/webkit/WebView;

    .line 12
    .line 13
    check-cast p4, Landroid/app/Activity;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, p3, p4}, LVa/q7;->A(Lorg/json/JSONObject;Landroid/webkit/WebView;LVa/e0;Landroid/app/Activity;)V

    .line 16
    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    throw p1
.end method

.method public final synthetic r(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget v0, LVa/q7;->C:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3b

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/q7;->B:I

    .line 8
    .line 9
    check-cast p2, Landroid/webkit/WebView;

    .line 10
    .line 11
    check-cast p3, Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3}, LVa/q7;->l(Lorg/json/JSONObject;Landroid/webkit/WebView;Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    sget p1, LVa/q7;->B:I

    .line 17
    .line 18
    add-int/lit8 p1, p1, 0x1d

    .line 19
    .line 20
    rem-int/lit16 p2, p1, 0x80

    .line 21
    .line 22
    sput p2, LVa/q7;->C:I

    .line 23
    .line 24
    rem-int/lit8 p1, p1, 0x2

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    throw p1
.end method

.method public final synthetic s(Lorg/json/JSONObject;Ljava/lang/Object;LVa/e0;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget v0, LVa/q7;->C:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x29

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/q7;->B:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    check-cast p2, Landroid/webkit/WebView;

    .line 12
    .line 13
    check-cast p4, Landroid/app/Activity;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, p3, p4}, LVa/q7;->b(Lorg/json/JSONObject;Landroid/webkit/WebView;LVa/e0;Landroid/app/Activity;)V

    .line 16
    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    throw p1
.end method

.method public final synthetic v(Lorg/json/JSONObject;Landroid/view/View;Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget v0, LVa/q7;->C:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/q7;->B:I

    .line 8
    .line 9
    check-cast p2, Landroid/webkit/WebView;

    .line 10
    .line 11
    check-cast p3, Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2, p3}, LVa/q7;->E(Lorg/json/JSONObject;Landroid/webkit/WebView;Landroid/app/Activity;)V

    .line 14
    .line 15
    .line 16
    sget p1, LVa/q7;->C:I

    .line 17
    .line 18
    add-int/lit8 p1, p1, 0x5b

    .line 19
    .line 20
    rem-int/lit16 p2, p1, 0x80

    .line 21
    .line 22
    sput p2, LVa/q7;->B:I

    .line 23
    .line 24
    rem-int/lit8 p1, p1, 0x2

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x3

    .line 29
    div-int/lit8 p1, p1, 0x0

    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final synthetic w(Lorg/json/JSONObject;Landroid/view/View;LVa/Vb;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget v0, LVa/q7;->B:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x77

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/q7;->C:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    check-cast p2, Landroid/webkit/WebView;

    .line 12
    .line 13
    check-cast p4, Landroid/app/Activity;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, p3, p4}, LVa/q7;->j(Lorg/json/JSONObject;Landroid/webkit/WebView;LVa/Vb;Landroid/app/Activity;)V

    .line 16
    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const/16 p1, 0x30

    .line 21
    .line 22
    div-int/lit8 p1, p1, 0x0

    .line 23
    .line 24
    :cond_0
    sget p1, LVa/q7;->C:I

    .line 25
    .line 26
    add-int/lit8 p1, p1, 0x4d

    .line 27
    .line 28
    rem-int/lit16 p2, p1, 0x80

    .line 29
    .line 30
    sput p2, LVa/q7;->B:I

    .line 31
    .line 32
    rem-int/lit8 p1, p1, 0x2

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    const/16 p1, 0x39

    .line 37
    .line 38
    div-int/lit8 p1, p1, 0x0

    .line 39
    .line 40
    :cond_1
    return-void
.end method
