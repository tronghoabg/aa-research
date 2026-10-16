.class public final Lo2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo2/n;


# static fields
.field public static final d:LU5/f;

.field public static final e:LU5/f;

.field public static final f:LU5/f;


# instance fields
.field public final a:Lp2/a;

.field public b:Lo2/i;

.field public c:Ljava/io/IOException;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, LU5/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v2, v3, v1, v4}, LU5/f;-><init>(JIZ)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lo2/m;->d:LU5/f;

    .line 14
    .line 15
    new-instance v0, LU5/f;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v0, v2, v3, v1, v4}, LU5/f;-><init>(JIZ)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lo2/m;->e:LU5/f;

    .line 23
    .line 24
    new-instance v0, LU5/f;

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    invoke-direct {v0, v2, v3, v1, v4}, LU5/f;-><init>(JIZ)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lo2/m;->f:LU5/f;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "ExoPlayer:Loader:"

    .line 2
    invoke-static {v0, p1}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    sget v0, LQ1/x;->a:I

    .line 4
    new-instance v0, LQ1/w;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LQ1/w;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    .line 5
    new-instance v0, Lm9/B;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lm9/B;-><init>(I)V

    .line 6
    new-instance v1, Lp2/a;

    invoke-direct {v1, p1, v0}, Lp2/a;-><init>(Ljava/util/concurrent/ExecutorService;Lm9/B;)V

    .line 7
    invoke-direct {p0, v1}, Lo2/m;-><init>(Lp2/a;)V

    return-void
.end method

.method public constructor <init>(Lp2/a;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lo2/m;->a:Lp2/a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lo2/m;->c:Ljava/io/IOException;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lo2/m;->b:Lo2/i;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v1, v0, Lo2/i;->e:Ljava/io/IOException;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget v2, v0, Lo2/i;->f:I

    .line 14
    .line 15
    iget v0, v0, Lo2/i;->a:I

    .line 16
    .line 17
    if-gt v2, v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    throw v1

    .line 21
    :cond_1
    :goto_0
    return-void

    .line 22
    :cond_2
    throw v0
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lo2/m;->b:Lo2/i;

    .line 2
    .line 3
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Lo2/i;->a(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lo2/m;->c:Ljava/io/IOException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lo2/m;->b:Lo2/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final e(Lo2/k;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo2/m;->b:Lo2/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Lo2/i;->a(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lo2/m;->a:Lp2/a;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    new-instance v1, Lg5/d;

    .line 14
    .line 15
    const/4 v2, 0x4

    .line 16
    invoke-direct {v1, p1, v2}, Lg5/d;-><init>(Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lp2/a;->execute(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object p1, v0, Lp2/a;->c:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object p1, v0, Lp2/a;->b:Ljava/util/concurrent/Executor;

    .line 25
    .line 26
    check-cast p1, Ljava/util/concurrent/ExecutorService;

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final f(Lo2/j;Lo2/h;I)J
    .locals 8

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    invoke-static {v2}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lo2/m;->c:Ljava/io/IOException;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v6

    .line 15
    new-instance v0, Lo2/i;

    .line 16
    .line 17
    move-object v1, p0

    .line 18
    move-object v3, p1

    .line 19
    move-object v4, p2

    .line 20
    move v5, p3

    .line 21
    invoke-direct/range {v0 .. v7}, Lo2/i;-><init>(Lo2/m;Landroid/os/Looper;Lo2/j;Lo2/h;IJ)V

    .line 22
    .line 23
    .line 24
    iget-object p1, v1, Lo2/m;->b:Lo2/i;

    .line 25
    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    :goto_0
    invoke-static {p1}, LQ1/k;->g(Z)V

    .line 32
    .line 33
    .line 34
    iput-object v0, v1, Lo2/m;->b:Lo2/i;

    .line 35
    .line 36
    invoke-virtual {v0}, Lo2/i;->b()V

    .line 37
    .line 38
    .line 39
    return-wide v6
.end method
