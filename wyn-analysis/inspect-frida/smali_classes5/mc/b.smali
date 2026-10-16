.class public final Lmc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/f;


# instance fields
.field public a:J

.field public b:Z

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lmc/b;->a:J

    .line 3
    new-instance v0, Lo/j;

    invoke-direct {v0, p0}, Lo/j;-><init>(Lmc/b;)V

    iput-object v0, p0, Lmc/b;->f:Ljava/lang/Object;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lmc/b;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/flutter/embedding/engine/FlutterJNI;Landroid/content/res/AssetManager;J)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lmc/b;->b:Z

    .line 7
    new-instance v0, Lad/L;

    const/16 v1, 0xf

    invoke-direct {v0, p0, v1}, Lad/L;-><init>(Ljava/lang/Object;I)V

    .line 8
    iput-object p1, p0, Lmc/b;->c:Ljava/lang/Object;

    .line 9
    iput-object p2, p0, Lmc/b;->d:Ljava/lang/Object;

    .line 10
    iput-wide p3, p0, Lmc/b;->a:J

    .line 11
    new-instance p2, Lmc/j;

    invoke-direct {p2, p1}, Lmc/j;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    iput-object p2, p0, Lmc/b;->e:Ljava/lang/Object;

    .line 12
    const-string p3, "flutter/isolate"

    const/4 p4, 0x0

    invoke-virtual {p2, p3, v0, p4}, Lmc/j;->i(Ljava/lang/String;Luc/d;Lab/b;)V

    .line 13
    new-instance p3, La2/c;

    const/16 p4, 0x12

    invoke-direct {p3, p2, p4}, La2/c;-><init>(Ljava/lang/Object;I)V

    iput-object p3, p0, Lmc/b;->f:Ljava/lang/Object;

    .line 14
    invoke-virtual {p1}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lmc/b;->b:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lmc/b;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lmc/b;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lk1/X;

    .line 25
    .line 26
    invoke-virtual {v1}, Lk1/X;->b()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    iput-boolean v0, p0, Lmc/b;->b:Z

    .line 32
    .line 33
    return-void
.end method

.method public b()Lab/b;
    .locals 2

    .line 1
    new-instance v0, Luc/m;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lmc/b;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, La2/c;

    .line 9
    .line 10
    iget-object v1, v1, La2/c;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lmc/j;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lmc/j;->c(Luc/m;)Lab/b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public c(LG9/e;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lmc/b;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string p1, "DartExecutor"

    .line 6
    .line 7
    const-string v0, "Attempted to run a DartExecutor that is already running."

    .line 8
    .line 9
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string v0, "DartExecutor#executeDartCallback"

    .line 14
    .line 15
    invoke-static {v0}, Lld/a;->b(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-static {p1}, Lj$/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lmc/b;->c:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v1, v0

    .line 24
    check-cast v1, Lio/flutter/embedding/engine/FlutterJNI;

    .line 25
    .line 26
    iget-object v0, p1, LG9/e;->c:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v2, v0

    .line 29
    check-cast v2, Ljava/lang/String;

    .line 30
    .line 31
    iget-object v0, p1, LG9/e;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lio/flutter/view/FlutterCallbackInformation;

    .line 34
    .line 35
    iget-object v3, v0, Lio/flutter/view/FlutterCallbackInformation;->callbackName:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v4, v0, Lio/flutter/view/FlutterCallbackInformation;->callbackLibraryPath:Ljava/lang/String;

    .line 38
    .line 39
    iget-object p1, p1, LG9/e;->b:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v5, p1

    .line 42
    check-cast v5, Landroid/content/res/AssetManager;

    .line 43
    .line 44
    iget-wide v7, p0, Lmc/b;->a:J

    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    invoke-virtual/range {v1 .. v8}, Lio/flutter/embedding/engine/FlutterJNI;->runBundleAndSnapshotFromLibrary(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;Ljava/util/List;J)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    iput-boolean p1, p0, Lmc/b;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    move-object p1, v0

    .line 59
    :try_start_1
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_1
    move-exception v0

    .line 64
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    throw p1
.end method

.method public d(Lmc/a;Ljava/util/List;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lmc/b;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string p1, "DartExecutor"

    .line 6
    .line 7
    const-string p2, "Attempted to run a DartExecutor that is already running."

    .line 8
    .line 9
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string v0, "DartExecutor#executeDartEntrypoint"

    .line 14
    .line 15
    invoke-static {v0}, Lld/a;->b(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-static {p1}, Lj$/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lmc/b;->c:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v1, v0

    .line 24
    check-cast v1, Lio/flutter/embedding/engine/FlutterJNI;

    .line 25
    .line 26
    iget-object v2, p1, Lmc/a;->a:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v3, p1, Lmc/a;->c:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v4, p1, Lmc/a;->b:Ljava/lang/String;

    .line 31
    .line 32
    iget-object p1, p0, Lmc/b;->d:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v5, p1

    .line 35
    check-cast v5, Landroid/content/res/AssetManager;

    .line 36
    .line 37
    iget-wide v7, p0, Lmc/b;->a:J

    .line 38
    .line 39
    move-object v6, p2

    .line 40
    invoke-virtual/range {v1 .. v8}, Lio/flutter/embedding/engine/FlutterJNI;->runBundleAndSnapshotFromLibrary(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;Ljava/util/List;J)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    iput-boolean p1, p0, Lmc/b;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    move-object p1, v0

    .line 52
    :try_start_1
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_1
    move-exception v0

    .line 57
    move-object p2, v0

    .line 58
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    throw p1
.end method

.method public e()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lmc/b;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lmc/b;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_5

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lk1/X;

    .line 25
    .line 26
    iget-wide v2, p0, Lmc/b;->a:J

    .line 27
    .line 28
    const-wide/16 v4, 0x0

    .line 29
    .line 30
    cmp-long v4, v2, v4

    .line 31
    .line 32
    if-ltz v4, :cond_2

    .line 33
    .line 34
    invoke-virtual {v1, v2, v3}, Lk1/X;->c(J)V

    .line 35
    .line 36
    .line 37
    :cond_2
    iget-object v2, p0, Lmc/b;->d:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Landroid/view/animation/BaseInterpolator;

    .line 40
    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    iget-object v3, v1, Lk1/X;->a:Ljava/lang/ref/WeakReference;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Landroid/view/View;

    .line 50
    .line 51
    if-eqz v3, :cond_3

    .line 52
    .line 53
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v3, v2}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 58
    .line 59
    .line 60
    :cond_3
    iget-object v2, p0, Lmc/b;->e:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v2, LU8/v0;

    .line 63
    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    iget-object v2, p0, Lmc/b;->f:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Lo/j;

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Lk1/X;->d(Lk1/Y;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    iget-object v1, v1, Lk1/X;->a:Ljava/lang/ref/WeakReference;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Landroid/view/View;

    .line 80
    .line 81
    if-eqz v1, :cond_1

    .line 82
    .line 83
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    const/4 v0, 0x1

    .line 92
    iput-boolean v0, p0, Lmc/b;->b:Z

    .line 93
    .line 94
    return-void
.end method

.method public i(Ljava/lang/String;Luc/d;Lab/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmc/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La2/c;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, La2/c;->i(Ljava/lang/String;Luc/d;Lab/b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public j(Ljava/lang/String;Ljava/nio/ByteBuffer;Luc/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmc/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La2/c;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, La2/c;->j(Ljava/lang/String;Ljava/nio/ByteBuffer;Luc/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public l(Ljava/lang/String;Luc/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmc/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La2/c;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, La2/c;->l(Ljava/lang/String;Luc/d;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public q(Ljava/lang/String;Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmc/b;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La2/c;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, La2/c;->q(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
