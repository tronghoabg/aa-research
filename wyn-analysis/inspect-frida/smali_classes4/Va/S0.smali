.class public final LVa/S0;
.super Lz6/a;
.source "SourceFile"

# interfaces
.implements LVa/H9;


# static fields
.field public static final d:[C

.field public static e:I = 0x0

.field public static f:I = 0x1


# instance fields
.field public a:Lz6/a;

.field public b:LVa/Ra;

.field public synthetic c:LVa/W0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xd0

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/S0;->d:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0xde8s
        -0x187fs
        -0x2697s
        -0x4d12s
        -0x5b47s
        -0x618cs
        0x73d7s
        0x6580s
        0x5f0ds
        0x30fds
        0x2ab6s
        0x1c00s
        -0xe13s
        -0x146es
        -0x22e8s
        -0x4913s
        -0x57bbs
        -0x7deds
        0x77f8s
        0x6942s
        0x4322s
        0x34bfs
        0x2e56s
        0x2fs
        -0xa58s
        -0x10bfs
        -0x3ed7s
        -0x4552s
        -0x5387s
        -0x79ccs
        0x7b97s
        0x6d40s
        0x46cds
        0x38bds
        0x1276s
        0x7c0s
        -0x653s
        -0x2c8cs
        -0x3b23s
        0x41s
        -0x15d8s
        -0x2b40s
        -0x40b9s
        -0x56f0s
        -0x6c23s
        0x7e7es
        0x6829s
        0x52a4s
        0x3d54s
        0x271fs
        0x11a9s
        -0x3bcs
        -0x19c5s
        -0x2f4fs
        -0x44bcs
        -0x5a14s
        -0x7046s
        0x7a51s
        0x64ebs
        0x4e8bs
        0x3916s
        0x23ffs
        0xd86s
        -0x7ffs
        -0x1d18s
        -0x3380s
        -0x48f9s
        -0x5e30s
        -0x7463s
        0x763es
        0x60e9s
        0x4b64s
        0x351es
        0x1fd1s
        0xa61s
        -0xbf4s
        -0x2123s
        -0x368cs
        -0x4cc4s
        -0x6251s
        -0x77acs
        0x721fs
        0x5ca9s
        0x4744s
        -0x3b5cs
        0x2ecds
        0x1025s
        0x7ba2s
        0x6df5s
        0x5738s
        -0x4565s
        -0x5334s
        -0x69bfs
        -0x64fs
        -0x1c06s
        -0x2ab4s
        0x38a1s
        0x22des
        0x1454s
        0x7fa1s
        0x6109s
        0x4b5fs
        -0x414cs
        -0x5ff2s
        -0x7592s
        -0x20ds
        -0x18e6s
        -0x369ds
        0x3ce4s
        0x260ds
        0x865s
        0x73e2s
        0x6535s
        0x4f78s
        -0x4d25s
        -0x5bf4s
        -0x707fs
        -0xe05s
        -0x24ccs
        -0x317cs
        0x30e9s
        0x1a38s
        0xd91s
        0x77d9s
        0x594as
        0x4cb1s
        -0x4906s
        -0x67b4s
        -0x7c5fs
        -0xa36s
        -0x20a4s
        -0x3d47s
        0x340ds
        0x1e78s
        0x1a7s
        0x6b1fs
        0x5d6as
        0x40afs
        0x1184s
        -0x413s
        -0x3afbs
        -0x517es
        -0x472bs
        -0x7de8s
        0x6fbbs
        0x79ecs
        0x4361s
        0x2c91s
        0x36das
        0x6cs
        -0x127fs
        -0x802s
        -0x3e8cs
        -0x557fs
        -0x4bd7s
        -0x6181s
        0x6b94s
        0x752es
        0x5f4es
        0x28d3s
        0x323as
        0x1c43s
        -0x163cs
        -0xcc7s
        -0x2287s
        -0x591es
        -0x4ffcs
        -0x65a7s
        0x67f0s
        0x7109s
        0x41s
        -0x15d8s
        -0x2b40s
        -0x40b9s
        -0x56f0s
        -0x6c23s
        0x7e7es
        0x6829s
        0x52a4s
        0x3d54s
        0x271fs
        0x11a9s
        -0x3bcs
        -0x19c5s
        -0x2f4fs
        -0x44bcs
        -0x5a14s
        -0x7046s
        0x7a51s
        0x64ebs
        0x4e8bs
        0x3916s
        0x23ffs
        0xd86s
        -0x7ffs
        -0x1d04s
        -0x334as
        -0x48d7s
        -0x5e37s
        -0x746cs
        0x7635s
        0x60ccs
        0x4b54s
        0x3537s
        0x1ffcs
        0xa67s
        -0xbffs
        -0x2124s
    .end array-data
.end method

.method public static a(IIC)Ljava/lang/String;
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
    sget-object v3, LVa/S0;->d:[C

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
    const-wide v7, -0x5b236e11e38615a8L    # -4.025063540251456E-131

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
.method public final b(Lz6/b;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    sget v1, LVa/S0;->e:I

    .line 3
    .line 4
    add-int/lit8 v1, v1, 0xb

    .line 5
    .line 6
    rem-int/lit16 v1, v1, 0x80

    .line 7
    .line 8
    sput v1, LVa/S0;->f:I

    .line 9
    .line 10
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    shr-int/lit8 v1, v1, 0x18

    .line 15
    .line 16
    add-int/lit16 v1, v1, 0x11c5

    .line 17
    .line 18
    int-to-char v1, v1

    .line 19
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    shr-int/lit8 v2, v2, 0x10

    .line 24
    .line 25
    rsub-int v2, v2, 0x8a

    .line 26
    .line 27
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    shr-int/lit8 v3, v3, 0x10

    .line 32
    .line 33
    add-int/lit8 v3, v3, 0x20

    .line 34
    .line 35
    invoke-static {v2, v3, v1}, LVa/S0;->a(IIC)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x1

    .line 44
    new-array v2, v2, [Ljava/lang/Object;

    .line 45
    .line 46
    aput-object p1, v2, v0

    .line 47
    .line 48
    iget-object v3, p0, LVa/S0;->c:LVa/W0;

    .line 49
    .line 50
    iget-object v4, p0, LVa/S0;->b:LVa/Ra;

    .line 51
    .line 52
    invoke-virtual {v3, p0, v4, v1, v2}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, LVa/S0;->a:Lz6/a;

    .line 56
    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    sget v2, LVa/S0;->f:I

    .line 60
    .line 61
    add-int/lit8 v2, v2, 0x1d

    .line 62
    .line 63
    rem-int/lit16 v3, v2, 0x80

    .line 64
    .line 65
    sput v3, LVa/S0;->e:I

    .line 66
    .line 67
    rem-int/lit8 v2, v2, 0x2

    .line 68
    .line 69
    invoke-virtual {v1, p1}, Lx6/d;->onAdLoaded(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    if-eqz v2, :cond_0

    .line 73
    .line 74
    const/16 p1, 0x3c

    .line 75
    .line 76
    div-int/2addr p1, v0

    .line 77
    :cond_0
    sget p1, LVa/S0;->f:I

    .line 78
    .line 79
    add-int/lit8 p1, p1, 0x39

    .line 80
    .line 81
    rem-int/lit16 p1, p1, 0x80

    .line 82
    .line 83
    sput p1, LVa/S0;->e:I

    .line 84
    .line 85
    return-void
.end method

.method public final d()Ljava/lang/Object;
    .locals 3

    .line 1
    sget v0, LVa/S0;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x49

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/S0;->e:I

    .line 8
    .line 9
    add-int/lit8 v1, v0, 0x7

    .line 10
    .line 11
    rem-int/lit16 v2, v1, 0x80

    .line 12
    .line 13
    sput v2, LVa/S0;->f:I

    .line 14
    .line 15
    rem-int/lit8 v1, v1, 0x2

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x9

    .line 21
    .line 22
    rem-int/lit16 v1, v0, 0x80

    .line 23
    .line 24
    sput v1, LVa/S0;->f:I

    .line 25
    .line 26
    rem-int/lit8 v0, v0, 0x2

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, LVa/S0;->a:Lz6/a;

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    throw v2

    .line 34
    :cond_1
    throw v2
.end method

.method public final onAdFailedToLoad(Lx6/l;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    sget v2, LVa/S0;->e:I

    .line 4
    .line 5
    add-int/lit8 v2, v2, 0x79

    .line 6
    .line 7
    rem-int/lit16 v2, v2, 0x80

    .line 8
    .line 9
    sput v2, LVa/S0;->f:I

    .line 10
    .line 11
    const-string v2, ""

    .line 12
    .line 13
    invoke-static {v2}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    add-int/2addr v3, v1

    .line 18
    int-to-char v3, v3

    .line 19
    const/16 v4, 0x30

    .line 20
    .line 21
    invoke-static {v2, v4, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    rsub-int v2, v2, 0xa9

    .line 26
    .line 27
    invoke-static {v0}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    rsub-int/lit8 v4, v4, 0x25

    .line 32
    .line 33
    invoke-static {v2, v4, v3}, LVa/S0;->a(IIC)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-array v1, v1, [Ljava/lang/Object;

    .line 42
    .line 43
    aput-object p1, v1, v0

    .line 44
    .line 45
    iget-object v0, p0, LVa/S0;->c:LVa/W0;

    .line 46
    .line 47
    iget-object v3, p0, LVa/S0;->b:LVa/Ra;

    .line 48
    .line 49
    invoke-virtual {v0, p0, v3, v2, v1}, LVa/Z0;->B0(LVa/H9;LVa/Ra;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, LVa/S0;->a:Lz6/a;

    .line 53
    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    sget v1, LVa/S0;->e:I

    .line 57
    .line 58
    add-int/lit8 v1, v1, 0x53

    .line 59
    .line 60
    rem-int/lit16 v1, v1, 0x80

    .line 61
    .line 62
    sput v1, LVa/S0;->f:I

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Lx6/d;->onAdFailedToLoad(Lx6/l;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    return-void
.end method

.method public final synthetic onAdLoaded(Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget v0, LVa/S0;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x23

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/S0;->f:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    check-cast p1, Lz6/b;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, LVa/S0;->b(Lz6/b;)V

    .line 14
    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const/16 p1, 0x17

    .line 19
    .line 20
    div-int/lit8 p1, p1, 0x0

    .line 21
    .line 22
    :cond_0
    sget p1, LVa/S0;->f:I

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x43

    .line 25
    .line 26
    rem-int/lit16 v0, p1, 0x80

    .line 27
    .line 28
    sput v0, LVa/S0;->e:I

    .line 29
    .line 30
    rem-int/lit8 p1, p1, 0x2

    .line 31
    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    const/4 p1, 0x0

    .line 36
    throw p1
.end method
