.class public LTc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;
.implements Luc/p;
.implements Lqc/b;
.implements Luc/i;


# instance fields
.field public a:Luc/r;

.field public final b:Ljava/util/HashMap;

.field public c:Luc/j;

.field public final d:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LTc/b;->b:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, LTc/b;->d:Landroid/os/Handler;

    .line 21
    .line 22
    return-void
.end method

.method public static a(LZ9/d;)Ljava/util/HashMap;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LZ9/d;->c()Laa/p;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v1, v1, Laa/p;->c:LC8/j;

    .line 11
    .line 12
    iget-wide v1, v1, LC8/j;->a:J

    .line 13
    .line 14
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "fetchTimeout"

    .line 19
    .line 20
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, LZ9/d;->c()Laa/p;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v1, v1, Laa/p;->c:LC8/j;

    .line 28
    .line 29
    iget-wide v3, v1, LC8/j;->b:J

    .line 30
    .line 31
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v3, "minimumFetchInterval"

    .line 36
    .line 37
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, LZ9/d;->c()Laa/p;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-wide v3, v1, Laa/p;->a:J

    .line 45
    .line 46
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v3, "lastFetchTime"

    .line 51
    .line 52
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, LZ9/d;->c()Laa/p;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const/4 v1, -0x1

    .line 60
    iget p0, p0, Laa/p;->b:I

    .line 61
    .line 62
    if-eq p0, v1, :cond_2

    .line 63
    .line 64
    if-eqz p0, :cond_1

    .line 65
    .line 66
    const/4 v1, 0x2

    .line 67
    if-eq p0, v1, :cond_0

    .line 68
    .line 69
    const-string p0, "failure"

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    const-string p0, "throttled"

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    const-string p0, "noFetchYet"

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    const-string p0, "success"

    .line 79
    .line 80
    :goto_0
    const-string v1, "lastFetchStatus"

    .line 81
    .line 82
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, Lj$/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    return-object v0
.end method

.method public static b(Ljava/util/HashMap;)Ljava/util/HashMap;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_3

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Laa/q;

    .line 31
    .line 32
    invoke-static {v3}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    new-instance v4, Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    iget v5, v3, Laa/q;->b:I

    .line 41
    .line 42
    if-nez v5, :cond_0

    .line 43
    .line 44
    sget-object v3, LZ9/d;->m:[B

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    iget-object v3, v3, Laa/q;->a:Ljava/lang/String;

    .line 48
    .line 49
    sget-object v6, Laa/i;->e:Ljava/nio/charset/Charset;

    .line 50
    .line 51
    invoke-virtual {v3, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    :goto_1
    const-string v6, "value"

    .line 56
    .line 57
    invoke-virtual {v4, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    const/4 v3, 0x1

    .line 61
    if-eq v5, v3, :cond_2

    .line 62
    .line 63
    const/4 v3, 0x2

    .line 64
    if-eq v5, v3, :cond_1

    .line 65
    .line 66
    const-string v3, "static"

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_1
    const-string v3, "remote"

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    const-string v3, "default"

    .line 73
    .line 74
    :goto_2
    const-string v5, "source"

    .line 75
    .line 76
    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    return-object v0
.end method


# virtual methods
.method public final c()V
    .locals 5

    .line 1
    iget-object v0, p0, LTc/b;->b:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Laa/l;

    .line 22
    .line 23
    iget-object v3, v2, Laa/l;->b:LVa/Y7;

    .line 24
    .line 25
    iget-object v2, v2, Laa/l;->a:LTc/a;

    .line 26
    .line 27
    monitor-enter v3

    .line 28
    :try_start_0
    iget-object v4, v3, LVa/Y7;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v4, Ljava/util/LinkedHashSet;

    .line 31
    .line 32
    invoke-interface {v4, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    monitor-exit v3

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw v0

    .line 40
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final didReinitializeFirebaseCore()Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LT3/r;

    .line 9
    .line 10
    const/4 v3, 0x2

    .line 11
    invoke-direct {v2, v3, p0, v0}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method public final getPluginConstantsForFirebaseApp(Ls8/g;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v2, LB8/a;

    .line 9
    .line 10
    invoke-direct {v2, p0, p1, v0}, LB8/a;-><init>(LTc/b;Ls8/g;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 2

    .line 1
    iget-object p1, p1, Lqc/a;->c:Luc/f;

    .line 2
    .line 3
    const-string v0, "plugins.flutter.io/firebase_remote_config"

    .line 4
    .line 5
    invoke-static {v0, p0}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->registerPlugin(Ljava/lang/String;Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Luc/r;

    .line 9
    .line 10
    invoke-direct {v1, p1, v0}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, LTc/b;->a:Luc/r;

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Luc/r;->b(Luc/p;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Luc/j;

    .line 19
    .line 20
    const-string v1, "plugins.flutter.io/firebase_remote_config_updated"

    .line 21
    .line 22
    invoke-direct {v0, p1, v1}, Luc/j;-><init>(Luc/f;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, LTc/b;->c:Luc/j;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Luc/j;->a(Luc/i;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final onCancel(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v0, "appName"

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/lang/String;

    .line 16
    .line 17
    iget-object v0, p0, LTc/b;->b:Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Laa/l;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object v2, v1, Laa/l;->b:LVa/Y7;

    .line 28
    .line 29
    iget-object v1, v1, Laa/l;->a:LTc/a;

    .line 30
    .line 31
    monitor-enter v2

    .line 32
    :try_start_0
    iget-object v3, v2, LVa/Y7;->a:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Ljava/util/LinkedHashSet;

    .line 35
    .line 36
    invoke-interface {v3, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    monitor-exit v2

    .line 40
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw p1

    .line 47
    :cond_1
    :goto_0
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 1

    .line 1
    iget-object p1, p0, LTc/b;->a:Luc/r;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Luc/r;->b(Luc/p;)V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, LTc/b;->a:Luc/r;

    .line 8
    .line 9
    iget-object p1, p0, LTc/b;->c:Luc/j;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Luc/j;->a(Luc/i;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LTc/b;->c:Luc/j;

    .line 15
    .line 16
    invoke-virtual {p0}, LTc/b;->c()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onListen(Ljava/lang/Object;Luc/g;)V
    .locals 3

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    const-string v0, "appName"

    .line 4
    .line 5
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-class v1, LZ9/k;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, LZ9/k;

    .line 25
    .line 26
    invoke-virtual {v0}, LZ9/k;->a()LZ9/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "appName"

    .line 31
    .line 32
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    check-cast p1, Ljava/lang/String;

    .line 40
    .line 41
    iget-object v1, p0, LTc/b;->b:Ljava/util/HashMap;

    .line 42
    .line 43
    new-instance v2, LTc/a;

    .line 44
    .line 45
    check-cast p2, Luc/h;

    .line 46
    .line 47
    invoke-direct {v2, p0, p2}, LTc/a;-><init>(LTc/b;Luc/h;)V

    .line 48
    .line 49
    .line 50
    iget-object p2, v0, LZ9/d;->k:LVa/Y7;

    .line 51
    .line 52
    monitor-enter p2

    .line 53
    :try_start_0
    iget-object v0, p2, LVa/Y7;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 56
    .line 57
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, LVa/Y7;->c()V

    .line 61
    .line 62
    .line 63
    new-instance v0, Laa/l;

    .line 64
    .line 65
    invoke-direct {v0, p2, v2}, Laa/l;-><init>(LVa/Y7;LTc/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    monitor-exit p2

    .line 69
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    throw p1
.end method

.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 13

    .line 1
    const/4 v0, 0x6

    .line 2
    const/4 v1, 0x5

    .line 3
    const/4 v2, 0x3

    .line 4
    const/4 v3, 0x7

    .line 5
    const/4 v4, 0x4

    .line 6
    const/4 v5, 0x2

    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v7, 0x1

    .line 9
    iget-object v8, p1, Luc/o;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v8, Ljava/util/Map;

    .line 12
    .line 13
    const-string v9, "appName"

    .line 14
    .line 15
    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v8

    .line 19
    invoke-static {v8}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    check-cast v8, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v8}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 25
    .line 26
    .line 27
    move-result-object v8

    .line 28
    const-class v9, LZ9/k;

    .line 29
    .line 30
    invoke-virtual {v8, v9}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    check-cast v8, LZ9/k;

    .line 35
    .line 36
    invoke-virtual {v8}, LZ9/k;->a()LZ9/d;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    iget-object v9, p1, Luc/o;->a:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const/4 v10, -0x1

    .line 46
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    sparse-switch v11, :sswitch_data_0

    .line 51
    .line 52
    .line 53
    goto/16 :goto_0

    .line 54
    .line 55
    :sswitch_0
    const-string v11, "RemoteConfig#setDefaults"

    .line 56
    .line 57
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-nez v9, :cond_0

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_0
    move v10, v3

    .line 66
    goto :goto_0

    .line 67
    :sswitch_1
    const-string v11, "RemoteConfig#fetchAndActivate"

    .line 68
    .line 69
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    if-nez v9, :cond_1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    move v10, v0

    .line 77
    goto :goto_0

    .line 78
    :sswitch_2
    const-string v11, "RemoteConfig#getAll"

    .line 79
    .line 80
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    if-nez v9, :cond_2

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    move v10, v1

    .line 88
    goto :goto_0

    .line 89
    :sswitch_3
    const-string v11, "RemoteConfig#activate"

    .line 90
    .line 91
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    if-nez v9, :cond_3

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    move v10, v4

    .line 99
    goto :goto_0

    .line 100
    :sswitch_4
    const-string v11, "RemoteConfig#fetch"

    .line 101
    .line 102
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    if-nez v9, :cond_4

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_4
    move v10, v2

    .line 110
    goto :goto_0

    .line 111
    :sswitch_5
    const-string v11, "RemoteConfig#getProperties"

    .line 112
    .line 113
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    if-nez v9, :cond_5

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_5
    move v10, v5

    .line 121
    goto :goto_0

    .line 122
    :sswitch_6
    const-string v11, "RemoteConfig#setConfigSettings"

    .line 123
    .line 124
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    if-nez v9, :cond_6

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_6
    move v10, v7

    .line 132
    goto :goto_0

    .line 133
    :sswitch_7
    const-string v11, "RemoteConfig#ensureInitialized"

    .line 134
    .line 135
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    if-nez v9, :cond_7

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_7
    move v10, v6

    .line 143
    :goto_0
    packed-switch v10, :pswitch_data_0

    .line 144
    .line 145
    .line 146
    check-cast p2, Ltc/g;

    .line 147
    .line 148
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :pswitch_0
    const-string v0, "defaults"

    .line 153
    .line 154
    invoke-virtual {p1, v0}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    check-cast p1, Ljava/util/Map;

    .line 159
    .line 160
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    check-cast p1, Ljava/util/Map;

    .line 164
    .line 165
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    new-instance v0, Ljava/util/HashMap;

    .line 169
    .line 170
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_9

    .line 186
    .line 187
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    check-cast v1, Ljava/util/Map$Entry;

    .line 192
    .line 193
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    instance-of v3, v2, [B

    .line 198
    .line 199
    if-eqz v3, :cond_8

    .line 200
    .line 201
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    check-cast v1, Ljava/lang/String;

    .line 206
    .line 207
    new-instance v3, Ljava/lang/String;

    .line 208
    .line 209
    check-cast v2, [B

    .line 210
    .line 211
    invoke-direct {v3, v2}, Ljava/lang/String;-><init>([B)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_8
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    check-cast v1, Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_9
    :try_start_0
    invoke-static {}, Laa/e;->c()Laa/d;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    new-instance v1, Lorg/json/JSONObject;

    .line 237
    .line 238
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 239
    .line 240
    .line 241
    iput-object v1, p1, Laa/d;->a:Lorg/json/JSONObject;

    .line 242
    .line 243
    invoke-virtual {p1}, Laa/d;->a()Laa/e;

    .line 244
    .line 245
    .line 246
    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 247
    iget-object v0, v8, LZ9/d;->f:Laa/c;

    .line 248
    .line 249
    invoke-virtual {v0, p1}, Laa/c;->e(Laa/e;)Lcom/google/android/gms/tasks/Task;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    sget-object v0, LM8/i;->a:LM8/i;

    .line 254
    .line 255
    new-instance v1, LV1/c;

    .line 256
    .line 257
    const/16 v2, 0xd

    .line 258
    .line 259
    invoke-direct {v1, v2}, LV1/c;-><init>(I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    goto/16 :goto_2

    .line 267
    .line 268
    :catch_0
    move-exception p1

    .line 269
    const-string v0, "FirebaseRemoteConfig"

    .line 270
    .line 271
    const-string v1, "The provided defaults map could not be processed."

    .line 272
    .line 273
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 274
    .line 275
    .line 276
    const/4 p1, 0x0

    .line 277
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    goto/16 :goto_2

    .line 282
    .line 283
    :pswitch_1
    invoke-virtual {v8}, LZ9/d;->a()Lcom/google/android/gms/tasks/Task;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    new-instance v0, LZ9/c;

    .line 288
    .line 289
    invoke-direct {v0, v8}, LZ9/c;-><init>(LZ9/d;)V

    .line 290
    .line 291
    .line 292
    iget-object v1, v8, LZ9/d;->c:Ljava/util/concurrent/Executor;

    .line 293
    .line 294
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    goto/16 :goto_2

    .line 299
    .line 300
    :pswitch_2
    invoke-virtual {v8}, LZ9/d;->b()Ljava/util/HashMap;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    invoke-static {p1}, LTc/b;->b(Ljava/util/HashMap;)Ljava/util/HashMap;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    goto/16 :goto_2

    .line 313
    .line 314
    :pswitch_3
    iget-object p1, v8, LZ9/d;->d:Laa/c;

    .line 315
    .line 316
    invoke-virtual {p1}, Laa/c;->b()Lcom/google/android/gms/tasks/Task;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    iget-object v0, v8, LZ9/d;->e:Laa/c;

    .line 321
    .line 322
    invoke-virtual {v0}, Laa/c;->b()Lcom/google/android/gms/tasks/Task;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    new-array v1, v5, [Lcom/google/android/gms/tasks/Task;

    .line 327
    .line 328
    aput-object p1, v1, v6

    .line 329
    .line 330
    aput-object v0, v1, v7

    .line 331
    .line 332
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->whenAllComplete([Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    new-instance v2, LA5/g;

    .line 337
    .line 338
    const/16 v3, 0x8

    .line 339
    .line 340
    invoke-direct {v2, v8, p1, v0, v3}, LA5/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 341
    .line 342
    .line 343
    iget-object p1, v8, LZ9/d;->c:Ljava/util/concurrent/Executor;

    .line 344
    .line 345
    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    goto/16 :goto_2

    .line 350
    .line 351
    :pswitch_4
    invoke-virtual {v8}, LZ9/d;->a()Lcom/google/android/gms/tasks/Task;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    goto/16 :goto_2

    .line 356
    .line 357
    :pswitch_5
    invoke-static {v8}, LTc/b;->a(LZ9/d;)Ljava/util/HashMap;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    goto/16 :goto_2

    .line 366
    .line 367
    :pswitch_6
    const-string v0, "fetchTimeout"

    .line 368
    .line 369
    invoke-virtual {p1, v0}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    check-cast v0, Ljava/lang/Integer;

    .line 374
    .line 375
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    const-string v1, "minimumFetchInterval"

    .line 383
    .line 384
    invoke-virtual {p1, v1}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    check-cast p1, Ljava/lang/Integer;

    .line 389
    .line 390
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 394
    .line 395
    .line 396
    move-result p1

    .line 397
    new-instance v1, LC8/j;

    .line 398
    .line 399
    invoke-direct {v1, v7}, LC8/j;-><init>(I)V

    .line 400
    .line 401
    .line 402
    int-to-long v9, v0

    .line 403
    const-wide/16 v11, 0x0

    .line 404
    .line 405
    cmp-long v0, v9, v11

    .line 406
    .line 407
    if-ltz v0, :cond_a

    .line 408
    .line 409
    iput-wide v9, v1, LC8/j;->a:J

    .line 410
    .line 411
    int-to-long v5, p1

    .line 412
    invoke-virtual {v1, v5, v6}, LC8/j;->a(J)V

    .line 413
    .line 414
    .line 415
    new-instance p1, LC8/j;

    .line 416
    .line 417
    invoke-direct {p1, v1}, LC8/j;-><init>(LC8/j;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    new-instance v0, LB8/c;

    .line 424
    .line 425
    invoke-direct {v0, v3, v8, p1}, LB8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    iget-object p1, v8, LZ9/d;->c:Ljava/util/concurrent/Executor;

    .line 429
    .line 430
    invoke-static {p1, v0}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 431
    .line 432
    .line 433
    move-result-object p1

    .line 434
    goto :goto_2

    .line 435
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 436
    .line 437
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 438
    .line 439
    .line 440
    move-result-object p2

    .line 441
    new-array v0, v7, [Ljava/lang/Object;

    .line 442
    .line 443
    aput-object p2, v0, v6

    .line 444
    .line 445
    const-string p2, "Fetch connection timeout has to be a non-negative number. %d is an invalid argument"

    .line 446
    .line 447
    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object p2

    .line 451
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    throw p1

    .line 455
    :pswitch_7
    iget-object p1, v8, LZ9/d;->e:Laa/c;

    .line 456
    .line 457
    invoke-virtual {p1}, Laa/c;->b()Lcom/google/android/gms/tasks/Task;

    .line 458
    .line 459
    .line 460
    move-result-object p1

    .line 461
    iget-object v9, v8, LZ9/d;->f:Laa/c;

    .line 462
    .line 463
    invoke-virtual {v9}, Laa/c;->b()Lcom/google/android/gms/tasks/Task;

    .line 464
    .line 465
    .line 466
    move-result-object v9

    .line 467
    iget-object v10, v8, LZ9/d;->d:Laa/c;

    .line 468
    .line 469
    invoke-virtual {v10}, Laa/c;->b()Lcom/google/android/gms/tasks/Task;

    .line 470
    .line 471
    .line 472
    move-result-object v10

    .line 473
    new-instance v11, LG8/c;

    .line 474
    .line 475
    invoke-direct {v11, v8, v3}, LG8/c;-><init>(Ljava/lang/Object;I)V

    .line 476
    .line 477
    .line 478
    iget-object v3, v8, LZ9/d;->c:Ljava/util/concurrent/Executor;

    .line 479
    .line 480
    invoke-static {v3, v11}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 481
    .line 482
    .line 483
    move-result-object v11

    .line 484
    iget-object v8, v8, LZ9/d;->j:LP9/d;

    .line 485
    .line 486
    check-cast v8, LP9/c;

    .line 487
    .line 488
    invoke-virtual {v8}, LP9/c;->d()Lcom/google/android/gms/tasks/Task;

    .line 489
    .line 490
    .line 491
    move-result-object v12

    .line 492
    invoke-virtual {v8}, LP9/c;->e()Lcom/google/android/gms/tasks/Task;

    .line 493
    .line 494
    .line 495
    move-result-object v8

    .line 496
    new-array v0, v0, [Lcom/google/android/gms/tasks/Task;

    .line 497
    .line 498
    aput-object p1, v0, v6

    .line 499
    .line 500
    aput-object v9, v0, v7

    .line 501
    .line 502
    aput-object v10, v0, v5

    .line 503
    .line 504
    aput-object v11, v0, v2

    .line 505
    .line 506
    aput-object v12, v0, v4

    .line 507
    .line 508
    aput-object v8, v0, v1

    .line 509
    .line 510
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->whenAllComplete([Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    .line 511
    .line 512
    .line 513
    move-result-object p1

    .line 514
    new-instance v0, LS8/b;

    .line 515
    .line 516
    const/16 v1, 0x12

    .line 517
    .line 518
    invoke-direct {v0, v11, v1}, LS8/b;-><init>(Ljava/lang/Object;I)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {p1, v3, v0}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 522
    .line 523
    .line 524
    move-result-object p1

    .line 525
    new-array v0, v7, [Lcom/google/android/gms/tasks/Task;

    .line 526
    .line 527
    aput-object p1, v0, v6

    .line 528
    .line 529
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->whenAll([Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    .line 530
    .line 531
    .line 532
    move-result-object p1

    .line 533
    :goto_2
    new-instance v0, LKa/b;

    .line 534
    .line 535
    check-cast p2, Ltc/g;

    .line 536
    .line 537
    invoke-direct {v0, p2, v4}, LKa/b;-><init>(Ltc/g;I)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 541
    .line 542
    .line 543
    return-void

    .line 544
    nop

    .line 545
    :sswitch_data_0
    .sparse-switch
        -0x444528c5 -> :sswitch_7
        -0x39aef1f4 -> :sswitch_6
        -0x312298d2 -> :sswitch_5
        0x2cfdbf -> :sswitch_4
        0x2d6c3ce -> :sswitch_3
        0x7271406 -> :sswitch_2
        0xbced8ab -> :sswitch_1
        0x3fc37019 -> :sswitch_0
    .end sparse-switch

    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    :pswitch_data_0
    .packed-switch 0x0
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
