.class public final LS3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD3/h;
.implements LC4/d;
.implements LH6/e;
.implements LJ3/w;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements LL4/l;
.implements Lw8/b;
.implements LHe/o;
.implements LHe/h;
.implements LJ5/e;
.implements Lk1/r;
.implements LWf/m0;
.implements Luc/p;
.implements LY2/w;
.implements Lx6/q;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, LS3/e;->a:I

    packed-switch p1, :pswitch_data_0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance p1, Landroidx/lifecycle/E;

    .line 18
    invoke-direct {p1}, Landroidx/lifecycle/D;-><init>()V

    .line 19
    iput-object p1, p0, LS3/e;->b:Ljava/lang/Object;

    .line 20
    new-instance p1, LU3/j;

    .line 21
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, LS3/e;->c:Ljava/lang/Object;

    .line 23
    sget-object p1, LJ3/w;->M8:LJ3/u;

    invoke-virtual {p0, p1}, LS3/e;->r(LFe/c;)V

    return-void

    .line 24
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, LS3/e;->b:Ljava/lang/Object;

    .line 26
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, LS3/e;->c:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LS3/e;->a:I

    iput-object p3, p0, LS3/e;->b:Ljava/lang/Object;

    iput-object p2, p0, LS3/e;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 2
    iput p1, p0, LS3/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LD3/b;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, LS3/e;->a:I

    .line 12
    new-instance v0, LS3/c;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, LS3/c;-><init>(I)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, LS3/e;->b:Ljava/lang/Object;

    .line 15
    iput-object v0, p0, LS3/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LY2/y;)V
    .locals 4

    const/16 v0, 0x1a

    iput v0, p0, LS3/e;->a:I

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS3/e;->c:Ljava/lang/Object;

    .line 42
    new-instance p1, LJ5/y;

    const/4 v0, 0x4

    new-array v1, v0, [B

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 43
    invoke-direct {p1, v1, v0, v2, v3}, LJ5/y;-><init>([BIIB)V

    .line 44
    iput-object p1, p0, LS3/e;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/media/MediaCodec$CryptoInfo;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, LS3/e;->a:I

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, LS3/e;->b:Ljava/lang/Object;

    .line 37
    invoke-static {}, LA7/O0;->e()Landroid/media/MediaCodec$CryptoInfo$Pattern;

    move-result-object p1

    iput-object p1, p0, LS3/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LS3/e;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, LS3/e;->b:Ljava/lang/Object;

    .line 6
    new-instance v0, LS3/b;

    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p1, v1}, LS3/b;-><init>(Lk3/m;I)V

    .line 8
    iput-object v0, p0, LS3/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, LS3/e;->a:I

    iput-object p1, p0, LS3/e;->b:Ljava/lang/Object;

    iput-object p3, p0, LS3/e;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, LS3/e;->a:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, LS3/e;->b:Ljava/lang/Object;

    .line 11
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [LJ5/w;

    iput-object p1, p0, LS3/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll8/e0;[I)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, LS3/e;->a:I

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    invoke-static {p1}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    move-result-object p1

    iput-object p1, p0, LS3/e;->b:Ljava/lang/Object;

    .line 40
    iput-object p2, p0, LS3/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ltf/l;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, LS3/e;->a:I

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS3/e;->b:Ljava/lang/Object;

    .line 34
    new-instance p1, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, LS3/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ltf/l;Ltf/l;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LS3/e;->a:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    check-cast p1, Lkotlin/jvm/internal/n;

    iput-object p1, p0, LS3/e;->b:Ljava/lang/Object;

    .line 29
    check-cast p2, Lkotlin/jvm/internal/n;

    iput-object p2, p0, LS3/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu6/t;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, LS3/e;->a:I

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, LS3/e;->b:Ljava/lang/Object;

    .line 32
    new-instance p1, LY4/b;

    invoke-direct {p1}, LY4/b;-><init>()V

    iput-object p1, p0, LS3/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public static j(Landroid/content/Context;)LS3/e;
    .locals 5

    .line 1
    const-string v0, "generatefid.lock"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    new-instance v2, Ljava/io/File;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-direct {v2, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance p0, Ljava/io/RandomAccessFile;

    .line 14
    .line 15
    const-string v0, "rw"

    .line 16
    .line 17
    invoke-direct {p0, v2, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 21
    .line 22
    .line 23
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_0 .. :try_end_0} :catch_6

    .line 24
    :try_start_1
    invoke-virtual {p0}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    .line 25
    .line 26
    .line 27
    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_1 .. :try_end_1} :catch_3

    .line 28
    :try_start_2
    new-instance v2, LS3/e;

    .line 29
    .line 30
    const/16 v3, 0xd

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-direct {v2, p0, v4, v0, v3}, LS3/e;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/nio/channels/OverlappingFileLockException; {:try_start_2 .. :try_end_2} :catch_0

    .line 34
    .line 35
    .line 36
    return-object v2

    .line 37
    :catch_0
    move-exception v2

    .line 38
    goto :goto_2

    .line 39
    :catch_1
    move-exception v2

    .line 40
    goto :goto_2

    .line 41
    :catch_2
    move-exception v2

    .line 42
    goto :goto_2

    .line 43
    :catch_3
    move-exception v2

    .line 44
    :goto_0
    move-object v0, v1

    .line 45
    goto :goto_2

    .line 46
    :catch_4
    move-exception v2

    .line 47
    goto :goto_0

    .line 48
    :catch_5
    move-exception v2

    .line 49
    goto :goto_0

    .line 50
    :catch_6
    move-exception v2

    .line 51
    :goto_1
    move-object p0, v1

    .line 52
    move-object v0, p0

    .line 53
    goto :goto_2

    .line 54
    :catch_7
    move-exception v2

    .line 55
    goto :goto_1

    .line 56
    :catch_8
    move-exception v2

    .line 57
    goto :goto_1

    .line 58
    :goto_2
    const-string v3, "CrossProcessLock"

    .line 59
    .line 60
    const-string v4, "encountered error while creating and acquiring the lock, ignoring"

    .line 61
    .line 62
    invoke-static {v3, v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 63
    .line 64
    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    :try_start_3
    invoke-virtual {v0}, Ljava/nio/channels/FileLock;->release()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_9

    .line 68
    .line 69
    .line 70
    :catch_9
    :cond_0
    if-eqz p0, :cond_1

    .line 71
    .line 72
    :try_start_4
    invoke-virtual {p0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_a

    .line 73
    .line 74
    .line 75
    :catch_a
    :cond_1
    return-object v1
.end method

.method public static n(I)Ljava/lang/String;
    .locals 6

    .line 1
    and-int/lit16 v0, p0, 0xff

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    shr-int/lit8 v1, p0, 0x8

    .line 8
    .line 9
    and-int/lit16 v1, v1, 0xff

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    shr-int/lit8 v2, p0, 0x10

    .line 16
    .line 17
    and-int/lit16 v2, v2, 0xff

    .line 18
    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    shr-int/lit8 p0, p0, 0x18

    .line 24
    .line 25
    and-int/lit16 p0, p0, 0xff

    .line 26
    .line 27
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const/4 v3, 0x4

    .line 32
    new-array v4, v3, [Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    aput-object v0, v4, v5

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    aput-object v1, v4, v0

    .line 39
    .line 40
    const/4 v0, 0x2

    .line 41
    aput-object v2, v4, v0

    .line 42
    .line 43
    const/4 v0, 0x3

    .line 44
    aput-object p0, v4, v0

    .line 45
    .line 46
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string v0, "%d.%d.%d.%d"

    .line 51
    .line 52
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method


# virtual methods
.method public a(LJe/b;)V
    .locals 1

    .line 1
    iget v0, p0, LS3/e;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LS3/e;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LHe/o;

    .line 9
    .line 10
    invoke-interface {v0, p1}, LHe/o;->a(LJe/b;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :sswitch_0
    iget-object v0, p0, LS3/e;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LSe/q;

    .line 17
    .line 18
    invoke-static {v0, p1}, LMe/a;->e(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :sswitch_1
    iget-object v0, p0, LS3/e;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, LSe/i;

    .line 25
    .line 26
    invoke-static {v0, p1}, LMe/a;->c(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public b(LQ1/u;Ls2/o;LT5/B;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    iget-object v0, p0, LS3/e;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LE4/G;

    .line 4
    .line 5
    iget-object v1, p0, LS3/e;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LI4/o;

    .line 8
    .line 9
    iget-object v2, v0, LE4/G;->f:LI4/o;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    if-ne v2, v1, :cond_0

    .line 14
    .line 15
    iget-object v2, v0, LE4/G;->g:LE4/f;

    .line 16
    .line 17
    iget-object v1, v1, LI4/o;->c:LC4/e;

    .line 18
    .line 19
    invoke-interface {v1}, LC4/e;->d()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget-object v0, v0, LE4/G;->b:LE4/k;

    .line 24
    .line 25
    invoke-virtual {v0, v2, p1, v1, v3}, LE4/k;->b(LB4/d;Ljava/lang/Exception;LC4/e;I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public d(LF4/a;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    iget-object v0, p0, LS3/e;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LY4/f;

    .line 4
    .line 5
    iget-object v0, v0, LY4/f;->b:Ljava/io/IOException;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-interface {p1, p2}, LF4/a;->f(Landroid/graphics/Bitmap;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    throw v0

    .line 15
    :cond_1
    return-void
.end method

.method public e(LQ1/o;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, LQ1/o;->u()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {p1}, LQ1/o;->u()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    and-int/lit16 v0, v0, 0x80

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_1
    const/4 v0, 0x6

    .line 18
    invoke-virtual {p1, v0}, LQ1/o;->H(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, LQ1/o;->a()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x4

    .line 26
    div-int/2addr v0, v1

    .line 27
    const/4 v2, 0x0

    .line 28
    move v3, v2

    .line 29
    :goto_0
    iget-object v4, p0, LS3/e;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v4, LY2/y;

    .line 32
    .line 33
    if-ge v3, v0, :cond_4

    .line 34
    .line 35
    iget-object v5, p0, LS3/e;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, LJ5/y;

    .line 38
    .line 39
    iget-object v6, v5, LJ5/y;->b:[B

    .line 40
    .line 41
    invoke-virtual {p1, v2, v1, v6}, LQ1/o;->f(II[B)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v2}, LJ5/y;->q(I)V

    .line 45
    .line 46
    .line 47
    const/16 v6, 0x10

    .line 48
    .line 49
    invoke-virtual {v5, v6}, LJ5/y;->i(I)I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    const/4 v7, 0x3

    .line 54
    invoke-virtual {v5, v7}, LJ5/y;->t(I)V

    .line 55
    .line 56
    .line 57
    const/16 v7, 0xd

    .line 58
    .line 59
    if-nez v6, :cond_2

    .line 60
    .line 61
    invoke-virtual {v5, v7}, LJ5/y;->t(I)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    invoke-virtual {v5, v7}, LJ5/y;->i(I)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    iget-object v6, v4, LY2/y;->h:Landroid/util/SparseArray;

    .line 70
    .line 71
    invoke-virtual {v6, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    if-nez v6, :cond_3

    .line 76
    .line 77
    iget-object v6, v4, LY2/y;->h:Landroid/util/SparseArray;

    .line 78
    .line 79
    new-instance v7, LY2/x;

    .line 80
    .line 81
    new-instance v8, LN2/j;

    .line 82
    .line 83
    invoke-direct {v8, v4, v5}, LN2/j;-><init>(LY2/y;I)V

    .line 84
    .line 85
    .line 86
    invoke-direct {v7, v8}, LY2/x;-><init>(LY2/w;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6, v5, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget v5, v4, LY2/y;->n:I

    .line 93
    .line 94
    add-int/lit8 v5, v5, 0x1

    .line 95
    .line 96
    iput v5, v4, LY2/y;->n:I

    .line 97
    .line 98
    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    iget p1, v4, LY2/y;->a:I

    .line 102
    .line 103
    const/4 v0, 0x2

    .line 104
    if-eq p1, v0, :cond_5

    .line 105
    .line 106
    iget-object p1, v4, LY2/y;->h:Landroid/util/SparseArray;

    .line 107
    .line 108
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->remove(I)V

    .line 109
    .line 110
    .line 111
    :cond_5
    :goto_2
    return-void
.end method

.method public f(ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "Analytics listener received message. ID: "

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p1, ", Extras: "

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v0, 0x2

    .line 26
    const-string v1, "FirebaseCrashlytics"

    .line 27
    .line 28
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-static {v1, p1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 36
    .line 37
    .line 38
    :cond_0
    const-string p1, "name"

    .line 39
    .line 40
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_4

    .line 45
    .line 46
    const-string v0, "params"

    .line 47
    .line 48
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    if-nez p2, :cond_1

    .line 53
    .line 54
    new-instance p2, Landroid/os/Bundle;

    .line 55
    .line 56
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 57
    .line 58
    .line 59
    :cond_1
    const-string v0, "_o"

    .line 60
    .line 61
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v1, "clx"

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    iget-object v0, p0, LS3/e;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, LG9/e;

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    iget-object v0, p0, LS3/e;->c:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Ly3/j;

    .line 81
    .line 82
    :goto_0
    if-nez v0, :cond_3

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-interface {v0, p2, p1}, LP8/b;->m(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_4
    :goto_1
    return-void
.end method

.method public g(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;
    .locals 4

    .line 1
    iget-object v0, p0, LS3/e;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-static {p1}, LFe/b;->y(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    new-instance v2, LWf/j;

    .line 16
    .line 17
    iget-object v3, p0, LS3/e;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ltf/l;

    .line 20
    .line 21
    invoke-interface {v3, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lkotlinx/serialization/KSerializer;

    .line 26
    .line 27
    invoke-direct {v2, p1}, LWf/j;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Lj$/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v2, p1

    .line 38
    :cond_1
    :goto_0
    check-cast v2, LWf/j;

    .line 39
    .line 40
    iget-object p1, v2, LWf/j;->a:Lkotlinx/serialization/KSerializer;

    .line 41
    .line 42
    return-object p1
.end method

.method public h()V
    .locals 2

    .line 1
    iget-object v0, p0, LS3/e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LL4/t;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, v0, LL4/t;->a:[B

    .line 7
    .line 8
    array-length v1, v1

    .line 9
    iput v1, v0, LL4/t;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw v1
.end method

.method public i(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, LS3/e;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LE4/G;

    .line 4
    .line 5
    iget-object v1, p0, LS3/e;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LI4/o;

    .line 8
    .line 9
    iget-object v2, v0, LE4/G;->f:LI4/o;

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    if-ne v2, v1, :cond_1

    .line 14
    .line 15
    iget-object v2, v0, LE4/G;->a:LE4/i;

    .line 16
    .line 17
    iget-object v2, v2, LE4/i;->p:LE4/m;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object v3, v1, LI4/o;->c:LC4/e;

    .line 22
    .line 23
    invoke-interface {v3}, LC4/e;->d()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {v2, v3}, LE4/m;->a(I)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    iput-object p1, v0, LE4/G;->e:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object p1, v0, LE4/G;->b:LE4/k;

    .line 36
    .line 37
    invoke-virtual {p1}, LE4/k;->o()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    move-object v2, v1

    .line 42
    iget-object v1, v2, LI4/o;->a:LB4/d;

    .line 43
    .line 44
    iget-object v3, v2, LI4/o;->c:LC4/e;

    .line 45
    .line 46
    invoke-interface {v3}, LC4/e;->d()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    iget-object v5, v0, LE4/G;->g:LE4/f;

    .line 51
    .line 52
    iget-object v0, v0, LE4/G;->b:LE4/k;

    .line 53
    .line 54
    move-object v2, p1

    .line 55
    invoke-virtual/range {v0 .. v5}, LE4/k;->a(LB4/d;Ljava/lang/Object;LC4/e;ILB4/d;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public k(JLY4/b;)V
    .locals 4

    .line 1
    invoke-virtual {p3}, LY4/b;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p3}, LY4/b;->d()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p3}, LY4/b;->d()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p3}, LY4/b;->q()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/16 v3, 0x1b2

    .line 23
    .line 24
    if-ne v0, v3, :cond_1

    .line 25
    .line 26
    const v0, 0x47413934

    .line 27
    .line 28
    .line 29
    if-ne v1, v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x3

    .line 32
    if-ne v2, v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, LS3/e;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, [LJ5/w;

    .line 37
    .line 38
    invoke-static {p1, p2, p3, v0}, LFe/g;->x(JLY4/b;[LJ5/w;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    return-void
.end method

.method public l()V
    .locals 3

    .line 1
    iget-object v0, p0, LS3/e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, LS3/e;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LX8/c;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v2, Ljava/io/File;

    .line 13
    .line 14
    iget-object v1, v1, LX8/c;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/io/File;

    .line 17
    .line 18
    invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception v1

    .line 26
    const-string v2, "Error creating marker: "

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v2, "FirebaseCrashlytics"

    .line 33
    .line 34
    invoke-static {v2, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public m(LJ5/m;LT5/B;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, LS3/e;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, [LJ5/w;

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-ge v1, v3, :cond_2

    .line 9
    .line 10
    invoke-virtual {p2}, LT5/B;->a()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, LT5/B;->b()V

    .line 14
    .line 15
    .line 16
    iget v3, p2, LT5/B;->e:I

    .line 17
    .line 18
    const/4 v4, 0x3

    .line 19
    invoke-interface {p1, v3, v4}, LJ5/m;->m(II)LJ5/w;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v4, p0, LS3/e;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, LE5/T;

    .line 32
    .line 33
    iget-object v5, v4, LE5/T;->l:Ljava/lang/String;

    .line 34
    .line 35
    const-string v6, "application/cea-608"

    .line 36
    .line 37
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-nez v6, :cond_1

    .line 42
    .line 43
    const-string v6, "application/cea-708"

    .line 44
    .line 45
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    move v6, v0

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    :goto_1
    const/4 v6, 0x1

    .line 55
    :goto_2
    new-instance v7, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v8, "Invalid closed caption mime type provided: "

    .line 58
    .line 59
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-static {v7, v6}, Lu6/a;->d(Ljava/lang/String;Z)V

    .line 70
    .line 71
    .line 72
    new-instance v6, LE5/S;

    .line 73
    .line 74
    invoke-direct {v6}, LE5/S;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, LT5/B;->b()V

    .line 78
    .line 79
    .line 80
    iget-object v7, p2, LT5/B;->f:Ljava/lang/String;

    .line 81
    .line 82
    iput-object v7, v6, LE5/S;->a:Ljava/lang/String;

    .line 83
    .line 84
    iput-object v5, v6, LE5/S;->k:Ljava/lang/String;

    .line 85
    .line 86
    iget v5, v4, LE5/T;->d:I

    .line 87
    .line 88
    iput v5, v6, LE5/S;->d:I

    .line 89
    .line 90
    iget-object v5, v4, LE5/T;->c:Ljava/lang/String;

    .line 91
    .line 92
    iput-object v5, v6, LE5/S;->c:Ljava/lang/String;

    .line 93
    .line 94
    iget v5, v4, LE5/T;->D:I

    .line 95
    .line 96
    iput v5, v6, LE5/S;->C:I

    .line 97
    .line 98
    iget-object v4, v4, LE5/T;->n:Ljava/util/List;

    .line 99
    .line 100
    iput-object v4, v6, LE5/S;->m:Ljava/util/List;

    .line 101
    .line 102
    new-instance v4, LE5/T;

    .line 103
    .line 104
    invoke-direct {v4, v6}, LE5/T;-><init>(LE5/S;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v3, v4}, LJ5/w;->a(LE5/T;)V

    .line 108
    .line 109
    .line 110
    aput-object v3, v2, v1

    .line 111
    .line 112
    add-int/lit8 v1, v1, 0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_2
    return-void
.end method

.method public o(Ljava/lang/String;)Ljava/lang/Long;
    .locals 4

    .line 1
    const-string v0, "SELECT long_value FROM Preference where `key`=?"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v1, v0}, Lk3/q;->d(ILjava/lang/String;)Lk3/q;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, v1, p1}, Lk3/q;->x(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LS3/e;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Landroidx/work/impl/WorkDatabase_Impl;

    .line 14
    .line 15
    invoke-virtual {p1}, Lk3/m;->b()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lk3/m;->l(Lo3/f;)Landroid/database/Cursor;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-interface {p1, v1}, Landroid/database/Cursor;->isNull(I)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lk3/q;->h()V

    .line 52
    .line 53
    .line 54
    return-object v2

    .line 55
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lk3/q;->h()V

    .line 59
    .line 60
    .line 61
    throw v1
.end method

.method public onComplete()V
    .locals 1

    .line 18
    iget-object v0, p0, LS3/e;->b:Ljava/lang/Object;

    check-cast v0, LHe/h;

    invoke-interface {v0}, LHe/h;->onComplete()V

    return-void
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 7

    iget-object v0, p0, LS3/e;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/auth/internal/RecaptchaActivity;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v1, v4}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v1

    .line 3
    iget-object v3, p0, LS3/e;->c:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    new-instance v5, Landroid/content/Intent;

    const-string v6, "android.support.customtabs.action.CustomTabsService"

    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v1, v5, v4}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    const/high16 v4, 0x10000000

    const/high16 v5, 0x40000000    # 2.0f

    if-eqz v1, :cond_0

    .line 6
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 7
    new-instance v1, Lp9/C;

    invoke-direct {v1}, Lp9/C;-><init>()V

    invoke-virtual {v1}, Lp9/C;->b()Lu/k;

    move-result-object v1

    .line 8
    iget-object v2, v1, Lu/k;->a:Landroid/content/Intent;

    invoke-virtual {v2, v5}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 9
    invoke-virtual {v2, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {v1, v0, p1}, Lu/k;->a(Landroid/content/Context;Landroid/net/Uri;)V

    return-void

    .line 11
    :cond_0
    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    invoke-direct {v1, v2, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 12
    const-string p1, "com.android.browser.application_id"

    invoke-virtual {v1, p1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 13
    invoke-virtual {v1, v5}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 14
    invoke-virtual {v1, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 15
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    .line 16
    :cond_1
    const-string p1, "RecaptchaActivity"

    const-string v1, "Device cannot resolve intent for: android.intent.action.VIEW"

    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/firebase-auth-api/zzadk;->zzb(Lcom/google/android/gms/internal/firebase-auth-api/zzadl;Ljava/lang/String;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget v0, p0, LS3/e;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LS3/e;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LHe/o;

    .line 9
    .line 10
    invoke-interface {v0, p1}, LHe/o;->onError(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :sswitch_0
    iget-object v0, p0, LS3/e;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LHe/h;

    .line 17
    .line 18
    invoke-interface {v0, p1}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :sswitch_1
    iget-object v0, p0, LS3/e;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, LHe/o;

    .line 25
    .line 26
    invoke-interface {v0, p1}, LHe/o;->onError(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public onMethodCall(Luc/o;Luc/q;)V
    .locals 11

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Luc/o;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "getDeviceInfo"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_7

    .line 15
    .line 16
    new-instance p1, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v0, "board"

    .line 22
    .line 23
    sget-object v1, Landroid/os/Build;->BOARD:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    const-string v0, "bootloader"

    .line 29
    .line 30
    sget-object v1, Landroid/os/Build;->BOOTLOADER:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 36
    .line 37
    const-string v1, "brand"

    .line 38
    .line 39
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 43
    .line 44
    const-string v2, "device"

    .line 45
    .line 46
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    const-string v2, "display"

    .line 50
    .line 51
    sget-object v3, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    sget-object v2, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 57
    .line 58
    const-string v3, "fingerprint"

    .line 59
    .line 60
    invoke-virtual {p1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    sget-object v3, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 64
    .line 65
    const-string v4, "hardware"

    .line 66
    .line 67
    invoke-virtual {p1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    const-string v4, "host"

    .line 71
    .line 72
    sget-object v5, Landroid/os/Build;->HOST:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    const-string v4, "id"

    .line 78
    .line 79
    sget-object v5, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {p1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 85
    .line 86
    const-string v5, "manufacturer"

    .line 87
    .line 88
    invoke-virtual {p1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 92
    .line 93
    const-string v6, "model"

    .line 94
    .line 95
    invoke-virtual {p1, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    sget-object v6, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 99
    .line 100
    const-string v7, "product"

    .line 101
    .line 102
    invoke-virtual {p1, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    sget-object v7, Landroid/os/Build;->SUPPORTED_32_BIT_ABIS:[Ljava/lang/String;

    .line 106
    .line 107
    array-length v8, v7

    .line 108
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-static {v7}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    const-string v8, "supported32BitAbis"

    .line 117
    .line 118
    invoke-virtual {p1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    sget-object v7, Landroid/os/Build;->SUPPORTED_64_BIT_ABIS:[Ljava/lang/String;

    .line 122
    .line 123
    array-length v8, v7

    .line 124
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    invoke-static {v7}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    const-string v8, "supported64BitAbis"

    .line 133
    .line 134
    invoke-virtual {p1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    sget-object v7, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 138
    .line 139
    array-length v8, v7

    .line 140
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-static {v7}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    const-string v8, "supportedAbis"

    .line 149
    .line 150
    invoke-virtual {p1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    const-string v7, "tags"

    .line 154
    .line 155
    sget-object v8, Landroid/os/Build;->TAGS:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {p1, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    const-string v7, "type"

    .line 161
    .line 162
    sget-object v8, Landroid/os/Build;->TYPE:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {p1, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    const-string v7, "BRAND"

    .line 168
    .line 169
    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    const-string v7, "generic"

    .line 173
    .line 174
    const/4 v8, 0x0

    .line 175
    invoke-static {v0, v7, v8}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    const/4 v9, 0x1

    .line 180
    const-string v10, "unknown"

    .line 181
    .line 182
    if-eqz v0, :cond_0

    .line 183
    .line 184
    const-string v0, "DEVICE"

    .line 185
    .line 186
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-static {v1, v7, v8}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-nez v0, :cond_2

    .line 194
    .line 195
    :cond_0
    const-string v0, "FINGERPRINT"

    .line 196
    .line 197
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v2, v7, v8}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-nez v0, :cond_2

    .line 205
    .line 206
    invoke-static {v2, v10, v8}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-nez v0, :cond_2

    .line 211
    .line 212
    const-string v0, "HARDWARE"

    .line 213
    .line 214
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    const-string v0, "goldfish"

    .line 218
    .line 219
    invoke-static {v3, v0, v8}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-nez v0, :cond_2

    .line 224
    .line 225
    const-string v0, "ranchu"

    .line 226
    .line 227
    invoke-static {v3, v0, v8}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-nez v0, :cond_2

    .line 232
    .line 233
    const-string v0, "MODEL"

    .line 234
    .line 235
    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    const-string v0, "google_sdk"

    .line 239
    .line 240
    invoke-static {v5, v0, v8}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-nez v0, :cond_2

    .line 245
    .line 246
    const-string v0, "Emulator"

    .line 247
    .line 248
    invoke-static {v5, v0, v8}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-nez v0, :cond_2

    .line 253
    .line 254
    const-string v0, "Android SDK built for x86"

    .line 255
    .line 256
    invoke-static {v5, v0, v8}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-nez v0, :cond_2

    .line 261
    .line 262
    const-string v0, "MANUFACTURER"

    .line 263
    .line 264
    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    const-string v0, "Genymotion"

    .line 268
    .line 269
    invoke-static {v4, v0, v8}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-nez v0, :cond_2

    .line 274
    .line 275
    const-string v0, "PRODUCT"

    .line 276
    .line 277
    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    const-string v0, "sdk"

    .line 281
    .line 282
    invoke-static {v6, v0, v8}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-nez v0, :cond_2

    .line 287
    .line 288
    const-string v0, "vbox86p"

    .line 289
    .line 290
    invoke-static {v6, v0, v8}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-nez v0, :cond_2

    .line 295
    .line 296
    const-string v0, "emulator"

    .line 297
    .line 298
    invoke-static {v6, v0, v8}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-nez v0, :cond_2

    .line 303
    .line 304
    const-string v0, "simulator"

    .line 305
    .line 306
    invoke-static {v6, v0, v8}, LBf/k;->n0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-eqz v0, :cond_1

    .line 311
    .line 312
    goto :goto_0

    .line 313
    :cond_1
    move v0, v8

    .line 314
    goto :goto_1

    .line 315
    :cond_2
    :goto_0
    move v0, v9

    .line 316
    :goto_1
    xor-int/2addr v0, v9

    .line 317
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    const-string v1, "isPhysicalDevice"

    .line 322
    .line 323
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    iget-object v0, p0, LS3/e;->b:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v0, Landroid/content/pm/PackageManager;

    .line 329
    .line 330
    invoke-virtual {v0}, Landroid/content/pm/PackageManager;->getSystemAvailableFeatures()[Landroid/content/pm/FeatureInfo;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    const-string v1, "getSystemAvailableFeatures(...)"

    .line 335
    .line 336
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    new-instance v1, Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 342
    .line 343
    .line 344
    array-length v2, v0

    .line 345
    :goto_2
    if-ge v8, v2, :cond_4

    .line 346
    .line 347
    aget-object v3, v0, v8

    .line 348
    .line 349
    iget-object v4, v3, Landroid/content/pm/FeatureInfo;->name:Ljava/lang/String;

    .line 350
    .line 351
    if-nez v4, :cond_3

    .line 352
    .line 353
    goto :goto_3

    .line 354
    :cond_3
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    :goto_3
    add-int/lit8 v8, v8, 0x1

    .line 358
    .line 359
    goto :goto_2

    .line 360
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 361
    .line 362
    const/16 v2, 0xa

    .line 363
    .line 364
    invoke-static {v1, v2}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    if-eqz v2, :cond_5

    .line 380
    .line 381
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    check-cast v2, Landroid/content/pm/FeatureInfo;

    .line 386
    .line 387
    iget-object v2, v2, Landroid/content/pm/FeatureInfo;->name:Ljava/lang/String;

    .line 388
    .line 389
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    goto :goto_4

    .line 393
    :cond_5
    const-string v1, "systemFeatures"

    .line 394
    .line 395
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    new-instance v0, Ljava/util/HashMap;

    .line 399
    .line 400
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 401
    .line 402
    .line 403
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 404
    .line 405
    const-string v2, "baseOS"

    .line 406
    .line 407
    sget-object v3, Landroid/os/Build$VERSION;->BASE_OS:Ljava/lang/String;

    .line 408
    .line 409
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    sget v2, Landroid/os/Build$VERSION;->PREVIEW_SDK_INT:I

    .line 413
    .line 414
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    const-string v3, "previewSdkInt"

    .line 419
    .line 420
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    const-string v2, "securityPatch"

    .line 424
    .line 425
    sget-object v3, Landroid/os/Build$VERSION;->SECURITY_PATCH:Ljava/lang/String;

    .line 426
    .line 427
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    const-string v2, "codename"

    .line 431
    .line 432
    sget-object v3, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    .line 433
    .line 434
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    const-string v2, "incremental"

    .line 438
    .line 439
    sget-object v3, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    .line 440
    .line 441
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    const-string v2, "release"

    .line 445
    .line 446
    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 447
    .line 448
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    const-string v3, "sdkInt"

    .line 456
    .line 457
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    const-string v2, "version"

    .line 461
    .line 462
    invoke-virtual {p1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    iget-object v0, p0, LS3/e;->c:Ljava/lang/Object;

    .line 466
    .line 467
    check-cast v0, Landroid/app/ActivityManager;

    .line 468
    .line 469
    invoke-virtual {v0}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 470
    .line 471
    .line 472
    move-result v0

    .line 473
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    const-string v2, "isLowRamDevice"

    .line 478
    .line 479
    invoke-virtual {p1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    const/16 v0, 0x1a

    .line 483
    .line 484
    const-string v2, "serialNumber"

    .line 485
    .line 486
    if-lt v1, v0, :cond_6

    .line 487
    .line 488
    :try_start_0
    invoke-static {}, LU1/b;->n()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v10
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 492
    :catch_0
    invoke-virtual {p1, v2, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    goto :goto_5

    .line 496
    :cond_6
    sget-object v0, Landroid/os/Build;->SERIAL:Ljava/lang/String;

    .line 497
    .line 498
    invoke-virtual {p1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    :goto_5
    check-cast p2, Ltc/g;

    .line 502
    .line 503
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    return-void

    .line 507
    :cond_7
    check-cast p2, Ltc/g;

    .line 508
    .line 509
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 510
    .line 511
    .line 512
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LS3/e;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LS3/e;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LHe/o;

    .line 9
    .line 10
    :try_start_0
    iget-object v1, p0, LS3/e;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LUe/a;

    .line 13
    .line 14
    iget-object v1, v1, LUe/a;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, LLe/b;

    .line 17
    .line 18
    invoke-interface {v1, p1}, LLe/b;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p1}, LHe/o;->onSuccess(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, p1}, LHe/o;->onError(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :sswitch_0
    iget-object v0, p0, LS3/e;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, LHe/h;

    .line 36
    .line 37
    invoke-interface {v0, p1}, LHe/h;->onSuccess(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :sswitch_1
    iget-object v0, p0, LS3/e;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, LHe/o;

    .line 44
    .line 45
    invoke-interface {v0, p1}, LHe/o;->onSuccess(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public p()Ljava/lang/String;
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_4

    .line 7
    .line 8
    iget-object v0, p0, LS3/e;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getLinkProperties(Landroid/net/Network;)Landroid/net/LinkProperties;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/net/LinkProperties;->getLinkAddresses()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v0, v2

    .line 30
    :goto_0
    if-eqz v0, :cond_5

    .line 31
    .line 32
    check-cast v0, Ljava/lang/Iterable;

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    move-object v3, v1

    .line 49
    check-cast v3, Landroid/net/LinkAddress;

    .line 50
    .line 51
    invoke-virtual {v3}, Landroid/net/LinkAddress;->getAddress()Ljava/net/InetAddress;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    const/16 v4, 0x2e

    .line 62
    .line 63
    invoke-static {v3, v4}, LBf/k;->o0(Ljava/lang/CharSequence;C)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const/4 v3, 0x0

    .line 69
    :goto_1
    if-eqz v3, :cond_1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    move-object v1, v2

    .line 73
    :goto_2
    check-cast v1, Landroid/net/LinkAddress;

    .line 74
    .line 75
    if-eqz v1, :cond_5

    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/net/LinkAddress;->getAddress()Ljava/net/InetAddress;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    return-object v0

    .line 88
    :cond_4
    iget-object v0, p0, LS3/e;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    const-string v1, "getConnectionInfo(...)"

    .line 97
    .line 98
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getIpAddress()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    invoke-static {v0}, LS3/e;->n(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    return-object v0

    .line 112
    :cond_5
    return-object v2
.end method

.method public q(LS3/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, LS3/e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Lk3/m;->b()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lk3/m;->c()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object v1, p0, LS3/e;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, LS3/b;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lk3/e;->x(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lk3/m;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lk3/m;->j()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    invoke-virtual {v0}, Lk3/m;->j()V

    .line 27
    .line 28
    .line 29
    throw p1
.end method

.method public r(LFe/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, LS3/e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/E;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroidx/lifecycle/D;->h(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    instance-of v0, p1, LJ3/v;

    .line 9
    .line 10
    iget-object v1, p0, LS3/e;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LU3/j;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    check-cast p1, LJ3/v;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, LU3/j;->i(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    instance-of v0, p1, LJ3/t;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    check-cast p1, LJ3/t;

    .line 27
    .line 28
    iget-object p1, p1, LJ3/t;->a:Ljava/lang/Throwable;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, LU3/j;->j(Ljava/lang/Throwable;)Z

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public s()V
    .locals 3

    .line 1
    sget-object v0, Lu6/v;->f:[B

    .line 2
    .line 3
    iget-object v1, p0, LS3/e;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LY4/b;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    array-length v2, v0

    .line 11
    invoke-virtual {v1, v2, v0}, LY4/b;->y(I[B)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public t(LJ5/h;J)LJ5/d;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-wide v5, v1, LJ5/h;->d:J

    .line 6
    .line 7
    iget-wide v2, v1, LJ5/h;->c:J

    .line 8
    .line 9
    sub-long/2addr v2, v5

    .line 10
    const-wide/16 v7, 0x4e20

    .line 11
    .line 12
    invoke-static {v7, v8, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    long-to-int v2, v2

    .line 17
    iget-object v3, v0, LS3/e;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, LY4/b;

    .line 20
    .line 21
    invoke-virtual {v3, v2}, LY4/b;->x(I)V

    .line 22
    .line 23
    .line 24
    iget-object v4, v3, LY4/b;->a:[B

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    invoke-virtual {v1, v4, v7, v2, v7}, LJ5/h;->c([BIIZ)Z

    .line 28
    .line 29
    .line 30
    const/4 v1, -0x1

    .line 31
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    move v2, v1

    .line 37
    move-wide v11, v7

    .line 38
    :goto_0
    invoke-virtual {v3}, LY4/b;->a()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    const/4 v9, 0x4

    .line 43
    if-lt v4, v9, :cond_e

    .line 44
    .line 45
    iget-object v4, v3, LY4/b;->a:[B

    .line 46
    .line 47
    iget v10, v3, LY4/b;->b:I

    .line 48
    .line 49
    invoke-static {v10, v4}, LM5/a;->I(I[B)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const/4 v10, 0x1

    .line 54
    const/16 v13, 0x1ba

    .line 55
    .line 56
    if-eq v4, v13, :cond_0

    .line 57
    .line 58
    invoke-virtual {v3, v10}, LY4/b;->B(I)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {v3, v9}, LY4/b;->B(I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v3}, LT5/u;->c(LY4/b;)J

    .line 66
    .line 67
    .line 68
    move-result-wide v14

    .line 69
    cmp-long v1, v14, v7

    .line 70
    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    iget-object v1, v0, LS3/e;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, Lu6/t;

    .line 76
    .line 77
    invoke-virtual {v1, v14, v15}, Lu6/t;->b(J)J

    .line 78
    .line 79
    .line 80
    move-result-wide v14

    .line 81
    cmp-long v1, v14, p2

    .line 82
    .line 83
    if-lez v1, :cond_2

    .line 84
    .line 85
    cmp-long v1, v11, v7

    .line 86
    .line 87
    if-nez v1, :cond_1

    .line 88
    .line 89
    new-instance v1, LJ5/d;

    .line 90
    .line 91
    const/4 v2, -0x1

    .line 92
    move-wide v3, v14

    .line 93
    invoke-direct/range {v1 .. v6}, LJ5/d;-><init>(IJJ)V

    .line 94
    .line 95
    .line 96
    return-object v1

    .line 97
    :cond_1
    int-to-long v1, v2

    .line 98
    add-long v11, v5, v1

    .line 99
    .line 100
    new-instance v7, LJ5/d;

    .line 101
    .line 102
    const/4 v8, 0x0

    .line 103
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    invoke-direct/range {v7 .. v12}, LJ5/d;-><init>(IJJ)V

    .line 109
    .line 110
    .line 111
    return-object v7

    .line 112
    :cond_2
    move-wide v1, v14

    .line 113
    const-wide/32 v11, 0x186a0

    .line 114
    .line 115
    .line 116
    add-long v14, v1, v11

    .line 117
    .line 118
    cmp-long v4, v14, p2

    .line 119
    .line 120
    if-lez v4, :cond_3

    .line 121
    .line 122
    iget v1, v3, LY4/b;->b:I

    .line 123
    .line 124
    int-to-long v1, v1

    .line 125
    add-long v11, v5, v1

    .line 126
    .line 127
    new-instance v7, LJ5/d;

    .line 128
    .line 129
    const/4 v8, 0x0

    .line 130
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    invoke-direct/range {v7 .. v12}, LJ5/d;-><init>(IJJ)V

    .line 136
    .line 137
    .line 138
    return-object v7

    .line 139
    :cond_3
    iget v4, v3, LY4/b;->b:I

    .line 140
    .line 141
    move-wide v11, v1

    .line 142
    move v2, v4

    .line 143
    :cond_4
    iget v1, v3, LY4/b;->c:I

    .line 144
    .line 145
    invoke-virtual {v3}, LY4/b;->a()I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    const/16 v14, 0xa

    .line 150
    .line 151
    if-ge v4, v14, :cond_5

    .line 152
    .line 153
    invoke-virtual {v3, v1}, LY4/b;->A(I)V

    .line 154
    .line 155
    .line 156
    goto/16 :goto_2

    .line 157
    .line 158
    :cond_5
    const/16 v4, 0x9

    .line 159
    .line 160
    invoke-virtual {v3, v4}, LY4/b;->B(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3}, LY4/b;->q()I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    and-int/lit8 v4, v4, 0x7

    .line 168
    .line 169
    invoke-virtual {v3}, LY4/b;->a()I

    .line 170
    .line 171
    .line 172
    move-result v14

    .line 173
    if-ge v14, v4, :cond_6

    .line 174
    .line 175
    invoke-virtual {v3, v1}, LY4/b;->A(I)V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_6
    invoke-virtual {v3, v4}, LY4/b;->B(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3}, LY4/b;->a()I

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-ge v4, v9, :cond_7

    .line 187
    .line 188
    invoke-virtual {v3, v1}, LY4/b;->A(I)V

    .line 189
    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_7
    iget-object v4, v3, LY4/b;->a:[B

    .line 193
    .line 194
    iget v14, v3, LY4/b;->b:I

    .line 195
    .line 196
    invoke-static {v14, v4}, LM5/a;->I(I[B)I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    const/16 v14, 0x1bb

    .line 201
    .line 202
    if-ne v4, v14, :cond_9

    .line 203
    .line 204
    invoke-virtual {v3, v9}, LY4/b;->B(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3}, LY4/b;->v()I

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    invoke-virtual {v3}, LY4/b;->a()I

    .line 212
    .line 213
    .line 214
    move-result v14

    .line 215
    if-ge v14, v4, :cond_8

    .line 216
    .line 217
    invoke-virtual {v3, v1}, LY4/b;->A(I)V

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_8
    invoke-virtual {v3, v4}, LY4/b;->B(I)V

    .line 222
    .line 223
    .line 224
    :cond_9
    :goto_1
    invoke-virtual {v3}, LY4/b;->a()I

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    if-lt v4, v9, :cond_d

    .line 229
    .line 230
    iget-object v4, v3, LY4/b;->a:[B

    .line 231
    .line 232
    iget v14, v3, LY4/b;->b:I

    .line 233
    .line 234
    invoke-static {v14, v4}, LM5/a;->I(I[B)I

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    if-eq v4, v13, :cond_d

    .line 239
    .line 240
    const/16 v14, 0x1b9

    .line 241
    .line 242
    if-ne v4, v14, :cond_a

    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_a
    ushr-int/lit8 v4, v4, 0x8

    .line 246
    .line 247
    if-eq v4, v10, :cond_b

    .line 248
    .line 249
    goto :goto_2

    .line 250
    :cond_b
    invoke-virtual {v3, v9}, LY4/b;->B(I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3}, LY4/b;->a()I

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    const/4 v14, 0x2

    .line 258
    if-ge v4, v14, :cond_c

    .line 259
    .line 260
    invoke-virtual {v3, v1}, LY4/b;->A(I)V

    .line 261
    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_c
    invoke-virtual {v3}, LY4/b;->v()I

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    iget v14, v3, LY4/b;->c:I

    .line 269
    .line 270
    iget v15, v3, LY4/b;->b:I

    .line 271
    .line 272
    add-int/2addr v15, v4

    .line 273
    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    invoke-virtual {v3, v4}, LY4/b;->A(I)V

    .line 278
    .line 279
    .line 280
    goto :goto_1

    .line 281
    :cond_d
    :goto_2
    iget v1, v3, LY4/b;->b:I

    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :cond_e
    cmp-long v2, v11, v7

    .line 286
    .line 287
    if-eqz v2, :cond_f

    .line 288
    .line 289
    int-to-long v1, v1

    .line 290
    add-long v13, v5, v1

    .line 291
    .line 292
    new-instance v9, LJ5/d;

    .line 293
    .line 294
    const/4 v10, -0x2

    .line 295
    invoke-direct/range {v9 .. v14}, LJ5/d;-><init>(IJJ)V

    .line 296
    .line 297
    .line 298
    return-object v9

    .line 299
    :cond_f
    sget-object v1, LJ5/d;->d:LJ5/d;

    .line 300
    .line 301
    return-object v1
.end method

.method public u(Ljava/lang/Throwable;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LS3/e;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, LA7/P0;

    .line 5
    .line 6
    invoke-virtual {v1}, LA7/B;->c0()V

    .line 7
    .line 8
    .line 9
    iput-boolean v0, v1, LA7/P0;->i:Z

    .line 10
    .line 11
    iget-object v2, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, LA7/n0;

    .line 14
    .line 15
    iget-object v3, v2, LA7/n0;->g:LA7/e;

    .line 16
    .line 17
    sget-object v4, LA7/y;->N0:LA7/D;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    invoke-virtual {v3, v5, v4}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, LA7/P0;->D0()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "registerTriggerAsync failed with throwable"

    .line 34
    .line 35
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 36
    .line 37
    invoke-virtual {v0, v1, p1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    iget-object v3, v2, LA7/n0;->g:LA7/e;

    .line 42
    .line 43
    sget-object v4, LA7/y;->L0:LA7/D;

    .line 44
    .line 45
    invoke-virtual {v3, v5, v4}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    const/4 v4, 0x2

    .line 50
    const/4 v5, 0x1

    .line 51
    if-eqz v3, :cond_4

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iput-boolean v0, v1, LA7/P0;->m:Z

    .line 58
    .line 59
    if-eqz v3, :cond_4

    .line 60
    .line 61
    instance-of v6, p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    if-nez v6, :cond_2

    .line 64
    .line 65
    const-string v6, "garbage collected"

    .line 66
    .line 67
    invoke-virtual {v3, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-nez v6, :cond_2

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    const-string v7, "ServiceUnavailableException"

    .line 82
    .line 83
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    instance-of v6, p1, Ljava/lang/SecurityException;

    .line 91
    .line 92
    if-eqz v6, :cond_4

    .line 93
    .line 94
    const-string v6, "READ_DEVICE_CONFIG"

    .line 95
    .line 96
    invoke-virtual {v3, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_4

    .line 101
    .line 102
    const/4 v3, 0x3

    .line 103
    goto :goto_1

    .line 104
    :cond_2
    :goto_0
    const-string v6, "Background"

    .line 105
    .line 106
    invoke-virtual {v3, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eqz v3, :cond_3

    .line 111
    .line 112
    iput-boolean v5, v1, LA7/P0;->m:Z

    .line 113
    .line 114
    :cond_3
    move v3, v5

    .line 115
    goto :goto_1

    .line 116
    :cond_4
    move v3, v4

    .line 117
    :goto_1
    sub-int/2addr v3, v5

    .line 118
    iget-object v6, p0, LS3/e;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v6, LA7/E1;

    .line 121
    .line 122
    if-eqz v3, :cond_9

    .line 123
    .line 124
    if-eq v3, v5, :cond_6

    .line 125
    .line 126
    if-eq v3, v4, :cond_5

    .line 127
    .line 128
    return-void

    .line 129
    :cond_5
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v2}, LA7/n0;->j()LA7/I;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v2}, LA7/I;->k0()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-static {v2}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 146
    .line 147
    const-string v3, "registerTriggerAsync failed. Dropping URI. App ID, Throwable"

    .line 148
    .line 149
    invoke-virtual {v0, v2, v3, p1}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, LA7/B0;->a0()LA7/Z;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p1}, LA7/Z;->m0()Landroid/util/SparseArray;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iget-wide v2, v6, LA7/E1;->b:J

    .line 161
    .line 162
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    iget v2, v6, LA7/E1;->c:I

    .line 167
    .line 168
    invoke-virtual {p1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, LA7/B0;->a0()LA7/Z;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v0, p1}, LA7/Z;->h0(Landroid/util/SparseArray;)V

    .line 176
    .line 177
    .line 178
    iput v5, v1, LA7/P0;->j:I

    .line 179
    .line 180
    invoke-virtual {v1}, LA7/P0;->D0()V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :cond_6
    invoke-virtual {v1}, LA7/P0;->y0()Ljava/util/PriorityQueue;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {v3, v6}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    iget v3, v1, LA7/P0;->j:I

    .line 192
    .line 193
    const/16 v4, 0x20

    .line 194
    .line 195
    if-le v3, v4, :cond_7

    .line 196
    .line 197
    iput v5, v1, LA7/P0;->j:I

    .line 198
    .line 199
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v2}, LA7/n0;->j()LA7/I;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-virtual {v1}, LA7/I;->k0()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-static {v1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 224
    .line 225
    const-string v2, "registerTriggerAsync failed. May try later. App ID, throwable"

    .line 226
    .line 227
    invoke-virtual {v0, v1, v2, p1}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :cond_7
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    invoke-virtual {v2}, LA7/n0;->j()LA7/I;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    invoke-virtual {v4}, LA7/I;->k0()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    invoke-static {v4}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    iget v6, v1, LA7/P0;->j:I

    .line 248
    .line 249
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    invoke-static {v6}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    iget-object v3, v3, LA7/N;->i:LA7/P;

    .line 266
    .line 267
    const-string v7, "registerTriggerAsync failed. App ID, delay in seconds, throwable"

    .line 268
    .line 269
    invoke-virtual {v3, v4, v6, p1, v7}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    iget p1, v1, LA7/P0;->j:I

    .line 273
    .line 274
    iget-object v3, v1, LA7/P0;->k:LA7/X0;

    .line 275
    .line 276
    if-nez v3, :cond_8

    .line 277
    .line 278
    new-instance v3, LA7/X0;

    .line 279
    .line 280
    invoke-direct {v3, v1, v2, v0}, LA7/X0;-><init>(LA7/P0;LA7/C0;I)V

    .line 281
    .line 282
    .line 283
    iput-object v3, v1, LA7/P0;->k:LA7/X0;

    .line 284
    .line 285
    :cond_8
    iget-object v0, v1, LA7/P0;->k:LA7/X0;

    .line 286
    .line 287
    mul-int/lit16 p1, p1, 0x3e8

    .line 288
    .line 289
    int-to-long v2, p1

    .line 290
    invoke-virtual {v0, v2, v3}, LA7/n;->b(J)V

    .line 291
    .line 292
    .line 293
    iget p1, v1, LA7/P0;->j:I

    .line 294
    .line 295
    shl-int/2addr p1, v5

    .line 296
    iput p1, v1, LA7/P0;->j:I

    .line 297
    .line 298
    return-void

    .line 299
    :cond_9
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {v2}, LA7/n0;->j()LA7/I;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    invoke-virtual {v2}, LA7/I;->k0()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    invoke-static {v2}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    invoke-static {p1}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 324
    .line 325
    const-string v3, "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable"

    .line 326
    .line 327
    invoke-virtual {v0, v2, v3, p1}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    iput v5, v1, LA7/P0;->j:I

    .line 331
    .line 332
    invoke-virtual {v1}, LA7/P0;->y0()Ljava/util/PriorityQueue;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    invoke-virtual {p1, v6}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    return-void
.end method

.method public v(Landroid/view/View;Lk1/v0;)Lk1/v0;
    .locals 16

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
    iget-object v3, v0, LS3/e;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, LG5/c;

    .line 10
    .line 11
    iget v4, v3, LG5/c;->a:I

    .line 12
    .line 13
    iget-object v5, v0, LS3/e;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v5, LE4/F;

    .line 16
    .line 17
    iget-object v6, v2, Lk1/v0;->a:Lk1/s0;

    .line 18
    .line 19
    const/16 v7, 0x207

    .line 20
    .line 21
    invoke-virtual {v6, v7}, Lk1/s0;->f(I)Lb1/c;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    const/16 v8, 0x20

    .line 26
    .line 27
    invoke-virtual {v6, v8}, Lk1/s0;->f(I)Lb1/c;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    iget v8, v7, Lb1/c;->b:I

    .line 32
    .line 33
    iget-object v9, v5, LE4/F;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 36
    .line 37
    iput v8, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w:I

    .line 38
    .line 39
    invoke-static {v1}, LW7/k;->e(Landroid/view/View;)Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 48
    .line 49
    .line 50
    move-result v11

    .line 51
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 52
    .line 53
    .line 54
    move-result v12

    .line 55
    iget-boolean v13, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:Z

    .line 56
    .line 57
    if-eqz v13, :cond_0

    .line 58
    .line 59
    invoke-virtual {v2}, Lk1/v0;->a()I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    iput v10, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:I

    .line 64
    .line 65
    iget v14, v3, LG5/c;->c:I

    .line 66
    .line 67
    add-int/2addr v10, v14

    .line 68
    :cond_0
    iget v3, v3, LG5/c;->b:I

    .line 69
    .line 70
    iget-boolean v14, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Z

    .line 71
    .line 72
    iget v15, v7, Lb1/c;->a:I

    .line 73
    .line 74
    if-eqz v14, :cond_2

    .line 75
    .line 76
    if-eqz v8, :cond_1

    .line 77
    .line 78
    move v11, v3

    .line 79
    goto :goto_0

    .line 80
    :cond_1
    move v11, v4

    .line 81
    :goto_0
    add-int/2addr v11, v15

    .line 82
    :cond_2
    iget-boolean v14, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:Z

    .line 83
    .line 84
    iget v0, v7, Lb1/c;->c:I

    .line 85
    .line 86
    if-eqz v14, :cond_4

    .line 87
    .line 88
    if-eqz v8, :cond_3

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    move v4, v3

    .line 92
    :goto_1
    add-int v12, v4, v0

    .line 93
    .line 94
    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 99
    .line 100
    iget-boolean v4, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->s:Z

    .line 101
    .line 102
    const/4 v8, 0x1

    .line 103
    if-eqz v4, :cond_5

    .line 104
    .line 105
    iget v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 106
    .line 107
    if-eq v4, v15, :cond_5

    .line 108
    .line 109
    iput v15, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 110
    .line 111
    move v4, v8

    .line 112
    goto :goto_2

    .line 113
    :cond_5
    const/4 v4, 0x0

    .line 114
    :goto_2
    iget-boolean v14, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->t:Z

    .line 115
    .line 116
    if-eqz v14, :cond_6

    .line 117
    .line 118
    iget v14, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 119
    .line 120
    if-eq v14, v0, :cond_6

    .line 121
    .line 122
    iput v0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 123
    .line 124
    move v4, v8

    .line 125
    :cond_6
    iget-boolean v0, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u:Z

    .line 126
    .line 127
    if-eqz v0, :cond_7

    .line 128
    .line 129
    iget v0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 130
    .line 131
    iget v7, v7, Lb1/c;->b:I

    .line 132
    .line 133
    if-eq v0, v7, :cond_7

    .line 134
    .line 135
    iput v7, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_7
    move v8, v4

    .line 139
    :goto_3
    if-eqz v8, :cond_8

    .line 140
    .line 141
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 142
    .line 143
    .line 144
    :cond_8
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-virtual {v1, v11, v0, v12, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 149
    .line 150
    .line 151
    iget-boolean v0, v5, LE4/F;->b:Z

    .line 152
    .line 153
    if-eqz v0, :cond_9

    .line 154
    .line 155
    iget v1, v6, Lb1/c;->d:I

    .line 156
    .line 157
    iput v1, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m:I

    .line 158
    .line 159
    :cond_9
    if-nez v13, :cond_b

    .line 160
    .line 161
    if-eqz v0, :cond_a

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_a
    return-object v2

    .line 165
    :cond_b
    :goto_4
    invoke-virtual {v9}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G()V

    .line 166
    .line 167
    .line 168
    return-object v2
.end method

.method public w()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, LS3/e;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/nio/channels/FileLock;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/channels/FileLock;->release()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LS3/e;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/nio/channels/FileChannel;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catch_0
    move-exception v0

    .line 17
    const-string v1, "CrossProcessLock"

    .line 18
    .line 19
    const-string v2, "encountered error while releasing, ignoring"

    .line 20
    .line 21
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public synthetic zza(Ljava/lang/String;)LH6/o;
    .locals 3

    .line 1
    new-instance v0, LH6/d;

    .line 2
    .line 3
    iget-object v1, p0, LS3/e;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LH6/f;

    .line 6
    .line 7
    iget-object v2, p0, LS3/e;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Landroid/content/Context;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, p1}, LH6/d;-><init>(LH6/f;Landroid/content/Context;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 15
    .line 16
    .line 17
    sget-object p1, LH6/o;->a:LH6/o;

    .line 18
    .line 19
    return-object p1
.end method
