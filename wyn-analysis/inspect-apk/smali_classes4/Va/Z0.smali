.class public abstract LVa/Z0;
.super LVa/pb;
.source "SourceFile"

# interfaces
.implements LVa/Q6;


# static fields
.field public static final O:[B

.field public static P:I = 0x0

.field public static Q:I = 0x1


# instance fields
.field public K:Ljava/util/Map;

.field public final L:Ljava/lang/String;

.field public M:Ljava/lang/String;

.field public N:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x4a

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/Z0;->O:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0x55t
        0x48t
        -0x41t
        -0x5bt
        0x5ct
        -0x54t
        0x5bt
        0x57t
        0x55t
        -0x4ft
        0x5dt
        0x4bt
        -0x43t
        0x5at
        -0x53t
        0x75t
        -0x77t
        0x50t
        -0x7dt
        -0x6ft
        0x76t
        -0x56t
        0x4ct
        -0x74t
        0x7dt
        -0x5et
        -0x1et
        0x1et
        -0x12t
        -0x1ct
        0x9t
        -0x1bt
        -0xat
        0x8t
        0x5et
        -0x60t
        -0x1et
        0x18t
        0x1at
        -0x16t
        0x4ct
        -0x4bt
        0x18t
        -0x1at
        0x1bt
        0x36t
        0x3et
        0x46t
        -0x4bt
        0x52t
        -0x47t
        -0x4ct
        -0x1et
        0x3t
        -0xet
        -0x9t
        0x7bt
        0x74t
        -0x75t
        -0x7ct
        -0x35t
        0x21t
        -0x78t
        -0x74t
        -0x3dt
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/Z0;->L:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static v0(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
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
    const/16 v6, 0x25ca

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

.method public static z0(IIBSI)Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, LVa/pb;->J:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x23

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-ne p1, v2, :cond_0

    .line 15
    .line 16
    move v3, v4

    .line 17
    :cond_0
    if-eqz v3, :cond_1

    .line 18
    .line 19
    sget-object p1, LVa/Z0;->O:[B

    .line 20
    .line 21
    const v2, -0x4d8a01f9

    .line 22
    .line 23
    .line 24
    add-int/2addr v2, p4

    .line 25
    aget-byte p1, p1, v2

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x23

    .line 28
    .line 29
    int-to-byte p1, p1

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    :goto_0
    if-lez p1, :cond_2

    .line 34
    .line 35
    add-int/2addr p4, p1

    .line 36
    const v2, 0x4d8a01fb    # 2.894232E8f

    .line 37
    .line 38
    .line 39
    sub-int/2addr p4, v2

    .line 40
    add-int/2addr p4, v3

    .line 41
    sput p4, LVa/pb;->F:I

    .line 42
    .line 43
    sput-byte p2, LVa/pb;->G:B

    .line 44
    .line 45
    const p2, 0x4d4791a

    .line 46
    .line 47
    .line 48
    add-int/2addr p0, p2

    .line 49
    int-to-char p0, p0

    .line 50
    sput-char p0, LVa/pb;->H:C

    .line 51
    .line 52
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    sget-char p0, LVa/pb;->H:C

    .line 56
    .line 57
    sput-char p0, LVa/pb;->I:C

    .line 58
    .line 59
    sput v4, LVa/pb;->E:I

    .line 60
    .line 61
    :goto_1
    sget p0, LVa/pb;->E:I

    .line 62
    .line 63
    if-ge p0, p1, :cond_2

    .line 64
    .line 65
    sget-object p0, LVa/Z0;->O:[B

    .line 66
    .line 67
    sget p2, LVa/pb;->F:I

    .line 68
    .line 69
    add-int/lit8 p4, p2, -0x1

    .line 70
    .line 71
    sput p4, LVa/pb;->F:I

    .line 72
    .line 73
    aget-byte p0, p0, p2

    .line 74
    .line 75
    sget-char p2, LVa/pb;->I:C

    .line 76
    .line 77
    add-int/2addr p0, p3

    .line 78
    int-to-byte p0, p0

    .line 79
    sget-byte p4, LVa/pb;->G:B

    .line 80
    .line 81
    xor-int/2addr p0, p4

    .line 82
    add-int/2addr p2, p0

    .line 83
    int-to-char p0, p2

    .line 84
    sput-char p0, LVa/pb;->H:C

    .line 85
    .line 86
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    sget-char p0, LVa/pb;->H:C

    .line 90
    .line 91
    sput-char p0, LVa/pb;->I:C

    .line 92
    .line 93
    sget p0, LVa/pb;->E:I

    .line 94
    .line 95
    add-int/2addr p0, v4

    .line 96
    sput p0, LVa/pb;->E:I

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    return-object p0

    .line 105
    :goto_2
    monitor-exit v0

    .line 106
    throw p0
.end method


# virtual methods
.method public abstract A0()Ljava/util/HashMap;
.end method

.method public final varargs B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p4

    .line 8
    invoke-direct {v1, p4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p2, LVa/Ra;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, LVa/y7;

    .line 17
    .line 18
    const/4 p4, 0x1

    .line 19
    invoke-static {p1, p3, p4, v0, v1}, LVa/y7;->s(LVa/y7;Ljava/lang/String;ZZLjava/util/List;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, LVa/t7;

    .line 23
    .line 24
    invoke-direct {p1, p2, p3, v0, v1}, LVa/t7;-><init>(LVa/Ra;Ljava/lang/String;ZLjava/util/ArrayList;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0}, LVa/y7;->C(LVa/t7;Z)V

    .line 28
    .line 29
    .line 30
    new-instance p1, LVa/t7;

    .line 31
    .line 32
    invoke-direct {p1, p2, p3, p4, v1}, LVa/t7;-><init>(LVa/Ra;Ljava/lang/String;ZLjava/util/ArrayList;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1, p4}, LVa/y7;->C(LVa/t7;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    sget p1, LVa/Z0;->Q:I

    .line 39
    .line 40
    add-int/lit8 p1, p1, 0x79

    .line 41
    .line 42
    rem-int/lit16 p1, p1, 0x80

    .line 43
    .line 44
    sput p1, LVa/Z0;->P:I

    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    new-instance p2, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v0}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    int-to-char p3, p3

    .line 58
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 59
    .line 60
    .line 61
    move-result p4

    .line 62
    const/4 v0, 0x0

    .line 63
    cmpl-float p4, p4, v0

    .line 64
    .line 65
    const v0, -0x63df8d46

    .line 66
    .line 67
    .line 68
    sub-int/2addr v0, p4

    .line 69
    const-string p4, "\uba2b\u2072\u779c\ub3f8"

    .line 70
    .line 71
    const-string v1, "\ud6ca\u3670\u1988\ua389\u4d3e\uf3f5\u3de7\ucdaa\u7e3e"

    .line 72
    .line 73
    invoke-static {p3, p4, v1, v0}, LVa/Z0;->v0(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    invoke-virtual {p3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    iget-object p3, p0, LVa/Z0;->L:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {p3, p2, p1}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final a(LVa/y7;Ljava/lang/String;Ljava/util/ArrayList;LVa/Ra;LVa/x8;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget v0, LVa/Z0;->P:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Z0;->Q:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/Z0;->K:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LVa/Y0;

    .line 16
    .line 17
    iget-object v1, p0, LVa/Z0;->L:Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    sget p1, LVa/Z0;->P:I

    .line 22
    .line 23
    add-int/lit8 p1, p1, 0x5d

    .line 24
    .line 25
    rem-int/lit16 p1, p1, 0x80

    .line 26
    .line 27
    sput p1, LVa/Z0;->Q:I

    .line 28
    .line 29
    :try_start_0
    invoke-interface {v0, p3, p4}, LVa/Y0;->a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    sget p2, LVa/Z0;->Q:I

    .line 34
    .line 35
    add-int/lit8 p2, p2, 0x4d

    .line 36
    .line 37
    rem-int/lit16 p2, p2, 0x80

    .line 38
    .line 39
    sput p2, LVa/Z0;->P:I

    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_0
    :try_start_1
    new-instance p3, LVa/k8;

    .line 43
    .line 44
    invoke-direct {p3, p1, p5, v1, p2}, LVa/k8;-><init>(LVa/y7;LVa/x8;Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3, v1}, LVa/j8;->d(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 48
    .line 49
    .line 50
    goto/16 :goto_0

    .line 51
    .line 52
    :catch_0
    move-exception p1

    .line 53
    new-instance p3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 59
    .line 60
    .line 61
    move-result p4

    .line 62
    shr-int/lit8 p4, p4, 0x8

    .line 63
    .line 64
    int-to-short p4, p4

    .line 65
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 66
    .line 67
    .line 68
    move-result p5

    .line 69
    shr-int/lit8 p5, p5, 0x8

    .line 70
    .line 71
    const v0, -0x4d478d5

    .line 72
    .line 73
    .line 74
    add-int/2addr p5, v0

    .line 75
    const-string v0, ""

    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    invoke-static {v0, v2}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    rsub-int/lit8 v0, v0, -0xd

    .line 83
    .line 84
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    shr-int/lit8 v3, v3, 0x10

    .line 89
    .line 90
    const v4, 0x4d8a0212

    .line 91
    .line 92
    .line 93
    add-int/2addr v3, v4

    .line 94
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    shr-int/lit8 v4, v4, 0x10

    .line 99
    .line 100
    rsub-int/lit8 v4, v4, 0x1b

    .line 101
    .line 102
    int-to-byte v4, v4

    .line 103
    invoke-static {p5, v0, v4, p4, v3}, LVa/Z0;->z0(IIBSI)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p4

    .line 107
    invoke-virtual {p4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p4

    .line 111
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 118
    .line 119
    .line 120
    move-result p4

    .line 121
    shr-int/lit8 p4, p4, 0x10

    .line 122
    .line 123
    int-to-short p4, p4

    .line 124
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 125
    .line 126
    .line 127
    move-result p5

    .line 128
    shr-int/lit8 p5, p5, 0x10

    .line 129
    .line 130
    const v0, -0x4d478fa

    .line 131
    .line 132
    .line 133
    add-int/2addr p5, v0

    .line 134
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    shr-int/lit8 v0, v0, 0x10

    .line 139
    .line 140
    add-int/lit8 v0, v0, -0x21

    .line 141
    .line 142
    const v3, 0x4d8a0227    # 2.894246E8f

    .line 143
    .line 144
    .line 145
    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    sub-int/2addr v3, v4

    .line 150
    const v4, 0x1000039

    .line 151
    .line 152
    .line 153
    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    add-int/2addr v5, v4

    .line 158
    int-to-byte v4, v5

    .line 159
    invoke-static {p5, v0, v4, p4, v3}, LVa/Z0;->z0(IIBSI)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p4

    .line 163
    invoke-virtual {p4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p4

    .line 167
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-static {v2, v2}, Landroid/view/View;->getDefaultSize(II)I

    .line 174
    .line 175
    .line 176
    move-result p2

    .line 177
    int-to-short p2, p2

    .line 178
    const p4, -0x4d478f3

    .line 179
    .line 180
    .line 181
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 182
    .line 183
    .line 184
    move-result p5

    .line 185
    add-int/2addr p5, p4

    .line 186
    invoke-static {v2}, Landroid/os/Process;->getThreadPriority(I)I

    .line 187
    .line 188
    .line 189
    move-result p4

    .line 190
    add-int/lit8 p4, p4, 0x14

    .line 191
    .line 192
    shr-int/lit8 p4, p4, 0x6

    .line 193
    .line 194
    add-int/lit8 p4, p4, -0x22

    .line 195
    .line 196
    const v0, 0x4d8a0228    # 2.8942464E8f

    .line 197
    .line 198
    .line 199
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    sub-int/2addr v0, v3

    .line 204
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    add-int/lit8 v2, v2, 0x7f

    .line 209
    .line 210
    int-to-byte v2, v2

    .line 211
    invoke-static {p5, p4, v2, p2, v0}, LVa/Z0;->z0(IIBSI)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    invoke-static {v1, p2, p1}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 227
    .line 228
    .line 229
    :goto_0
    const/4 p1, 0x0

    .line 230
    return-object p1
.end method

.method public q0()Z
    .locals 1

    .line 1
    sget v0, LVa/Z0;->P:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Z0;->Q:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public r0()Z
    .locals 2

    .line 1
    sget v0, LVa/Z0;->Q:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x11

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, LVa/Z0;->P:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x3

    .line 10
    .line 11
    rem-int/lit16 v1, v0, 0x80

    .line 12
    .line 13
    sput v1, LVa/Z0;->P:I

    .line 14
    .line 15
    rem-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    throw v0
.end method

.method public final s0(Ljava/lang/String;)Ljava/lang/Class;
    .locals 2

    .line 1
    sget v0, LVa/Z0;->P:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0xd

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Z0;->Q:I

    .line 8
    .line 9
    :try_start_0
    invoke-static {}, LVa/a;->p()Z

    .line 10
    .line 11
    .line 12
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    sget v0, LVa/Z0;->Q:I

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x6b

    .line 18
    .line 19
    rem-int/lit16 v1, v0, 0x80

    .line 20
    .line 21
    sput v1, LVa/Z0;->P:I

    .line 22
    .line 23
    rem-int/lit8 v0, v0, 0x2

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    :try_start_1
    invoke-virtual {p0, p1, v0}, LVa/Z0;->y0(Ljava/lang/String;Z)Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    invoke-virtual {p0, p1, v0}, LVa/Z0;->y0(Ljava/lang/String;Z)Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_1
    invoke-virtual {p0, p1}, LVa/Z0;->w0(Ljava/lang/String;)Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    return-object p1

    .line 44
    :catchall_0
    const/4 p1, 0x0

    .line 45
    return-object p1
.end method

.method public abstract t0()Ljava/lang/String;
.end method

.method public u0()Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, LVa/Z0;->P:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x59

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/Z0;->Q:I

    .line 8
    .line 9
    iget-object v1, p0, LVa/Z0;->M:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x29

    .line 14
    .line 15
    rem-int/lit16 v0, v0, 0x80

    .line 16
    .line 17
    sput v0, LVa/Z0;->P:I

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    invoke-virtual {p0}, LVa/Z0;->x0()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public abstract w0(Ljava/lang/String;)Ljava/lang/Class;
.end method

.method public final declared-synchronized x0()Ljava/lang/String;
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/Z0;->P:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, LVa/Z0;->Q:I

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    rem-int/2addr v0, v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LVa/Z0;->N:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    const/16 v3, 0x3a

    .line 22
    .line 23
    :try_start_1
    div-int/2addr v3, v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    if-nez v0, :cond_1

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
    iget-object v0, p0, LVa/Z0;->N:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    :goto_0
    iget-object v0, p0, LVa/Z0;->N:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v2, v2}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    const-wide/16 v5, 0x0

    .line 46
    .line 47
    cmp-long v3, v3, v5

    .line 48
    .line 49
    rsub-int/lit8 v3, v3, -0x1

    .line 50
    .line 51
    int-to-char v3, v3

    .line 52
    const-string v4, "\u94d1\u5b66\uba61\u8ede"

    .line 53
    .line 54
    const-string v5, "\u0581\ube8c\ue5ed\udf6d\u4764\uf9ad\u6c60"

    .line 55
    .line 56
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    shr-int/lit8 v6, v6, 0x10

    .line 61
    .line 62
    const v7, 0x615b6694

    .line 63
    .line 64
    .line 65
    sub-int/2addr v7, v6

    .line 66
    invoke-static {v3, v4, v5, v7}, LVa/Z0;->v0(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    :cond_1
    invoke-virtual {p0}, LVa/Z0;->t0()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, LVa/Z0;->N:Ljava/lang/String;

    .line 85
    .line 86
    :cond_2
    iget-object v0, p0, LVa/Z0;->N:Ljava/lang/String;

    .line 87
    .line 88
    sget v3, LVa/Z0;->P:I

    .line 89
    .line 90
    add-int/lit8 v3, v3, 0x3b

    .line 91
    .line 92
    rem-int/lit16 v4, v3, 0x80

    .line 93
    .line 94
    sput v4, LVa/Z0;->Q:I

    .line 95
    .line 96
    rem-int/2addr v3, v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 97
    if-nez v3, :cond_3

    .line 98
    .line 99
    :try_start_3
    div-int/2addr v1, v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 100
    monitor-exit p0

    .line 101
    return-object v0

    .line 102
    :catchall_2
    move-exception v0

    .line 103
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 104
    :cond_3
    monitor-exit p0

    .line 105
    return-object v0

    .line 106
    :goto_1
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 107
    throw v0
.end method

.method public final y0(Ljava/lang/String;Z)Ljava/lang/Class;
    .locals 15

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const-string v2, ""

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    :try_start_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v6, 0x8

    .line 13
    .line 14
    shr-int/2addr v0, v6

    .line 15
    int-to-short v0, v0

    .line 16
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    shr-int/lit8 v7, v7, 0x16

    .line 21
    .line 22
    const v8, -0x4d478ec

    .line 23
    .line 24
    .line 25
    sub-int/2addr v8, v7

    .line 26
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    int-to-byte v7, v7

    .line 31
    add-int/lit8 v7, v7, -0x21

    .line 32
    .line 33
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    shr-int/lit8 v9, v9, 0x10

    .line 38
    .line 39
    const v10, 0x4d8a0228    # 2.8942464E8f

    .line 40
    .line 41
    .line 42
    sub-int v9, v10, v9

    .line 43
    .line 44
    invoke-static {v2, v5, v5}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    add-int/lit8 v11, v11, 0x5b

    .line 49
    .line 50
    int-to-byte v11, v11

    .line 51
    invoke-static {v8, v7, v11, v0, v9}, LVa/Z0;->z0(IIBSI)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    sget v0, LVa/Z0;->Q:I

    .line 66
    .line 67
    add-int/lit8 v0, v0, 0x4d

    .line 68
    .line 69
    rem-int/lit16 v0, v0, 0x80

    .line 70
    .line 71
    sput v0, LVa/Z0;->P:I

    .line 72
    .line 73
    :try_start_1
    invoke-static/range {p1 .. p2}, LVa/ub;->a(Ljava/lang/String;Z)Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    goto/16 :goto_4

    .line 80
    .line 81
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    const/4 v7, 0x4

    .line 86
    const/4 v8, 0x2

    .line 87
    const/4 v9, 0x1

    .line 88
    sparse-switch v0, :sswitch_data_0

    .line 89
    .line 90
    .line 91
    goto/16 :goto_2

    .line 92
    .line 93
    :sswitch_0
    invoke-static {v2, v5}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    const v7, 0xf9b4

    .line 98
    .line 99
    .line 100
    add-int/2addr v0, v7

    .line 101
    int-to-char v0, v0

    .line 102
    const-string v7, "\uafdc\u1a4c\ub4f6\u4ef9"

    .line 103
    .line 104
    const-string v8, "\ub23b\u3414\u08ca\ue4d8\uc81d"

    .line 105
    .line 106
    invoke-static {v5}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    const v11, -0x9e5b351

    .line 111
    .line 112
    .line 113
    add-int/2addr v10, v11

    .line 114
    invoke-static {v0, v7, v8, v10}, LVa/Z0;->v0(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    if-eqz v0, :cond_4

    .line 127
    .line 128
    sget v0, LVa/Z0;->Q:I

    .line 129
    .line 130
    add-int/2addr v0, v9

    .line 131
    rem-int/lit16 v0, v0, 0x80

    .line 132
    .line 133
    sput v0, LVa/Z0;->P:I

    .line 134
    .line 135
    goto/16 :goto_3

    .line 136
    .line 137
    :sswitch_1
    :try_start_2
    invoke-static {v2}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    int-to-short v0, v0

    .line 142
    invoke-static {v5, v5, v5}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    const v7, -0x4d478b4

    .line 147
    .line 148
    .line 149
    add-int/2addr v6, v7

    .line 150
    invoke-static {v3, v4}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    rsub-int/lit8 v7, v7, -0x1e

    .line 155
    .line 156
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    shr-int/lit8 v8, v8, 0x10

    .line 161
    .line 162
    const v9, 0x4d8a022d    # 2.894248E8f

    .line 163
    .line 164
    .line 165
    sub-int/2addr v9, v8

    .line 166
    invoke-static {v5, v5}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 167
    .line 168
    .line 169
    move-result v8

    .line 170
    rsub-int/lit8 v8, v8, -0xf

    .line 171
    .line 172
    int-to-byte v8, v8

    .line 173
    invoke-static {v6, v7, v8, v0, v9}, LVa/Z0;->z0(IIBSI)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 185
    if-eqz v0, :cond_4

    .line 186
    .line 187
    sget v0, LVa/Z0;->Q:I

    .line 188
    .line 189
    add-int/lit8 v0, v0, 0x7d

    .line 190
    .line 191
    rem-int/lit16 v0, v0, 0x80

    .line 192
    .line 193
    sput v0, LVa/Z0;->P:I

    .line 194
    .line 195
    const/4 v6, 0x3

    .line 196
    goto/16 :goto_3

    .line 197
    .line 198
    :sswitch_2
    :try_start_3
    invoke-static {v5, v5}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    rsub-int v0, v0, 0x25a9

    .line 203
    .line 204
    int-to-char v0, v0

    .line 205
    const-string v6, "\u5f61\u14f8\ua92d\u8f25"

    .line 206
    .line 207
    const-string v7, "\u6780\u1cdb\u235b\u1e7f"

    .line 208
    .line 209
    invoke-static {v2, v5}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 210
    .line 211
    .line 212
    move-result v8

    .line 213
    invoke-static {v0, v6, v7, v8}, LVa/Z0;->v0(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_4

    .line 226
    .line 227
    const/4 v6, 0x7

    .line 228
    goto/16 :goto_3

    .line 229
    .line 230
    :sswitch_3
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    shr-int/lit8 v0, v0, 0x10

    .line 235
    .line 236
    rsub-int v0, v0, 0x4052

    .line 237
    .line 238
    int-to-char v0, v0

    .line 239
    const-string v6, "\u2ea6\uf8ef\u52ad\u7740"

    .line 240
    .line 241
    const-string v7, "\uae1a\ubc84\u9f44\u52ff"

    .line 242
    .line 243
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 244
    .line 245
    .line 246
    move-result-wide v10

    .line 247
    cmp-long v10, v10, v3

    .line 248
    .line 249
    rsub-int/lit8 v10, v10, 0x1

    .line 250
    .line 251
    invoke-static {v0, v6, v7, v10}, LVa/Z0;->v0(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 263
    if-eqz v0, :cond_4

    .line 264
    .line 265
    sget v0, LVa/Z0;->Q:I

    .line 266
    .line 267
    add-int/lit8 v0, v0, 0x7d

    .line 268
    .line 269
    rem-int/lit16 v6, v0, 0x80

    .line 270
    .line 271
    sput v6, LVa/Z0;->P:I

    .line 272
    .line 273
    rem-int/2addr v0, v8

    .line 274
    if-eqz v0, :cond_1

    .line 275
    .line 276
    :goto_0
    move v6, v5

    .line 277
    goto/16 :goto_3

    .line 278
    .line 279
    :cond_1
    move v6, v9

    .line 280
    goto/16 :goto_3

    .line 281
    .line 282
    :sswitch_4
    :try_start_4
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 283
    .line 284
    .line 285
    move-result-wide v6

    .line 286
    cmp-long v0, v6, v3

    .line 287
    .line 288
    rsub-int v0, v0, 0x49b5

    .line 289
    .line 290
    int-to-char v0, v0

    .line 291
    const-string v6, "\u799d\udfa4\ub403\uaa49"

    .line 292
    .line 293
    const-string v7, "\u15a0\u3300\uecf8\u8067"

    .line 294
    .line 295
    const/4 v8, 0x0

    .line 296
    invoke-static {v5, v8, v8}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 297
    .line 298
    .line 299
    move-result v9

    .line 300
    cmpl-float v8, v9, v8

    .line 301
    .line 302
    invoke-static {v0, v6, v7, v8}, LVa/Z0;->v0(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 314
    if-eqz v0, :cond_4

    .line 315
    .line 316
    sget v0, LVa/Z0;->P:I

    .line 317
    .line 318
    add-int/lit8 v0, v0, 0x4b

    .line 319
    .line 320
    rem-int/lit16 v0, v0, 0x80

    .line 321
    .line 322
    sput v0, LVa/Z0;->Q:I

    .line 323
    .line 324
    const/4 v6, 0x5

    .line 325
    goto/16 :goto_3

    .line 326
    .line 327
    :sswitch_5
    const/16 v0, 0x30

    .line 328
    .line 329
    :try_start_5
    invoke-static {v2, v0, v5, v5}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    const v6, 0xcb5c

    .line 334
    .line 335
    .line 336
    sub-int/2addr v6, v0

    .line 337
    int-to-char v0, v6

    .line 338
    const-string v6, "\uc782\u4787\u5dbe\u40cb"

    .line 339
    .line 340
    const-string v7, "\u2777\uee1c\uc3a3\u3039"

    .line 341
    .line 342
    invoke-static {v5, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    .line 343
    .line 344
    .line 345
    move-result v8

    .line 346
    invoke-static {v0, v6, v7, v8}, LVa/Z0;->v0(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 358
    if-eq v0, v9, :cond_2

    .line 359
    .line 360
    goto/16 :goto_2

    .line 361
    .line 362
    :cond_2
    sget v0, LVa/Z0;->Q:I

    .line 363
    .line 364
    add-int/lit8 v0, v0, 0x1f

    .line 365
    .line 366
    rem-int/lit16 v0, v0, 0x80

    .line 367
    .line 368
    sput v0, LVa/Z0;->P:I

    .line 369
    .line 370
    const/4 v6, 0x6

    .line 371
    goto/16 :goto_3

    .line 372
    .line 373
    :sswitch_6
    :try_start_6
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    shr-int/lit8 v0, v0, 0x10

    .line 378
    .line 379
    rsub-int v0, v0, 0x257f

    .line 380
    .line 381
    int-to-char v0, v0

    .line 382
    const-string v6, "\ub40b\u40bb\u7f38\u8b25"

    .line 383
    .line 384
    const-string v8, "\ufa5d\u64e7\u8a94\u77e0"

    .line 385
    .line 386
    invoke-static {v5, v5, v5}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 387
    .line 388
    .line 389
    move-result v9

    .line 390
    invoke-static {v0, v6, v8, v9}, LVa/Z0;->v0(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-eqz v0, :cond_4

    .line 403
    .line 404
    :goto_1
    move v6, v7

    .line 405
    goto :goto_3

    .line 406
    :sswitch_7
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    shr-int/lit8 v0, v0, 0x10

    .line 411
    .line 412
    const v6, 0xfb0e

    .line 413
    .line 414
    .line 415
    sub-int/2addr v6, v0

    .line 416
    int-to-char v0, v6

    .line 417
    const-string v6, "\u3d64\u5743\u0e8f\uaafb"

    .line 418
    .line 419
    const-string v7, "\uc034\ud072\u37db"

    .line 420
    .line 421
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 422
    .line 423
    .line 424
    move-result-wide v8

    .line 425
    cmp-long v8, v8, v3

    .line 426
    .line 427
    const v9, -0x70a8bcc4

    .line 428
    .line 429
    .line 430
    add-int/2addr v8, v9

    .line 431
    invoke-static {v0, v6, v7, v8}, LVa/Z0;->v0(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    if-eqz v0, :cond_4

    .line 444
    .line 445
    goto/16 :goto_0

    .line 446
    .line 447
    :sswitch_8
    invoke-static {v5}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 448
    .line 449
    .line 450
    move-result-wide v11

    .line 451
    cmp-long v0, v11, v3

    .line 452
    .line 453
    int-to-short v0, v0

    .line 454
    invoke-static {v5, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 455
    .line 456
    .line 457
    move-result v6

    .line 458
    const v9, -0x4d478b6

    .line 459
    .line 460
    .line 461
    add-int/2addr v6, v9

    .line 462
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 463
    .line 464
    .line 465
    move-result-wide v11

    .line 466
    const-wide/16 v13, -0x1

    .line 467
    .line 468
    cmp-long v9, v11, v13

    .line 469
    .line 470
    rsub-int/lit8 v9, v9, -0x1c

    .line 471
    .line 472
    invoke-static {v3, v4}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 473
    .line 474
    .line 475
    move-result v11

    .line 476
    sub-int/2addr v10, v11

    .line 477
    invoke-static {v5, v5}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 478
    .line 479
    .line 480
    move-result v11

    .line 481
    rsub-int/lit8 v11, v11, -0x41

    .line 482
    .line 483
    int-to-byte v11, v11

    .line 484
    invoke-static {v6, v9, v11, v0, v10}, LVa/Z0;->z0(IIBSI)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 496
    if-eqz v0, :cond_4

    .line 497
    .line 498
    sget v0, LVa/Z0;->Q:I

    .line 499
    .line 500
    add-int/lit8 v0, v0, 0x1b

    .line 501
    .line 502
    rem-int/lit16 v6, v0, 0x80

    .line 503
    .line 504
    sput v6, LVa/Z0;->P:I

    .line 505
    .line 506
    rem-int/2addr v0, v8

    .line 507
    if-eqz v0, :cond_3

    .line 508
    .line 509
    goto :goto_1

    .line 510
    :cond_3
    move v6, v8

    .line 511
    goto :goto_3

    .line 512
    :cond_4
    :goto_2
    const/4 v6, -0x1

    .line 513
    :goto_3
    packed-switch v6, :pswitch_data_0

    .line 514
    .line 515
    .line 516
    :try_start_7
    invoke-virtual/range {p0 .. p1}, LVa/Z0;->w0(Ljava/lang/String;)Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    return-object v0

    .line 521
    :pswitch_0
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 522
    .line 523
    return-object v0

    .line 524
    :pswitch_1
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 525
    .line 526
    return-object v0

    .line 527
    :pswitch_2
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 528
    .line 529
    return-object v0

    .line 530
    :pswitch_3
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 531
    .line 532
    return-object v0

    .line 533
    :pswitch_4
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 534
    .line 535
    return-object v0

    .line 536
    :pswitch_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 537
    .line 538
    return-object v0

    .line 539
    :pswitch_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 540
    .line 541
    return-object v0

    .line 542
    :pswitch_7
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 543
    .line 544
    return-object v0

    .line 545
    :pswitch_8
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 546
    .line 547
    return-object v0

    .line 548
    :goto_4
    if-eqz p2, :cond_5

    .line 549
    .line 550
    new-instance v6, Ljava/lang/StringBuilder;

    .line 551
    .line 552
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 553
    .line 554
    .line 555
    const v7, 0xc674

    .line 556
    .line 557
    .line 558
    invoke-static {v5, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 559
    .line 560
    .line 561
    move-result v8

    .line 562
    sub-int/2addr v7, v8

    .line 563
    int-to-char v7, v7

    .line 564
    invoke-static {v3, v4}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 565
    .line 566
    .line 567
    move-result v8

    .line 568
    const-string v9, "\u7805\u8100\u74a6\uf2c6"

    .line 569
    .line 570
    const-string v10, "\u8888\ua23d\uf54f\u692d\ua410\ud7ca"

    .line 571
    .line 572
    invoke-static {v7, v9, v10, v8}, LVa/Z0;->v0(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v7

    .line 576
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v7

    .line 580
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 584
    .line 585
    .line 586
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 587
    .line 588
    .line 589
    move-result v1

    .line 590
    shr-int/lit8 v1, v1, 0x10

    .line 591
    .line 592
    int-to-short v1, v1

    .line 593
    const v7, -0x4d478fb

    .line 594
    .line 595
    .line 596
    invoke-static {v2}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 597
    .line 598
    .line 599
    move-result v2

    .line 600
    sub-int/2addr v7, v2

    .line 601
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 602
    .line 603
    .line 604
    move-result v2

    .line 605
    shr-int/lit8 v2, v2, 0x10

    .line 606
    .line 607
    rsub-int/lit8 v2, v2, -0x19

    .line 608
    .line 609
    const v8, 0x4d8a0230

    .line 610
    .line 611
    .line 612
    invoke-static {v3, v4}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 613
    .line 614
    .line 615
    move-result v3

    .line 616
    sub-int/2addr v8, v3

    .line 617
    invoke-static {v5}, Landroid/graphics/Color;->green(I)I

    .line 618
    .line 619
    .line 620
    move-result v3

    .line 621
    add-int/lit8 v3, v3, -0x73

    .line 622
    .line 623
    int-to-byte v3, v3

    .line 624
    invoke-static {v7, v2, v3, v1, v8}, LVa/Z0;->z0(IIBSI)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v1

    .line 639
    iget-object v2, p0, LVa/Z0;->L:Ljava/lang/String;

    .line 640
    .line 641
    invoke-static {v2, v1, v0}, LVa/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 642
    .line 643
    .line 644
    :cond_5
    const/4 v0, 0x0

    .line 645
    return-object v0

    .line 646
    nop

    .line 647
    :sswitch_data_0
    .sparse-switch
        -0x4f08842f -> :sswitch_8
        0x197ef -> :sswitch_7
        0x2e3aea -> :sswitch_6
        0x2e6108 -> :sswitch_5
        0x2e9356 -> :sswitch_4
        0x32c67c -> :sswitch_3
        0x375194 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x685847c -> :sswitch_0
    .end sparse-switch

    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
