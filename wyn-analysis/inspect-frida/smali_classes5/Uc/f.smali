.class public LUc/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;
.implements Lqc/b;
.implements Lrc/a;


# static fields
.field public static final h:Ljava/util/HashMap;

.field public static final i:Ljava/util/HashMap;


# instance fields
.field public final a:Luc/x;

.field public b:Luc/f;

.field public final c:Ljava/util/concurrent/atomic/AtomicReference;

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/HashMap;

.field public final f:Ljava/util/HashMap;

.field public final g:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LUc/f;->h:Ljava/util/HashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LUc/f;->i:Ljava/util/HashMap;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Luc/x;

    .line 5
    .line 6
    sget-object v1, LUc/c;->d:LUc/c;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Luc/x;-><init>(Luc/w;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LUc/f;->a:Luc/x;

    .line 12
    .line 13
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LUc/f;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    new-instance v0, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, LUc/f;->d:Ljava/util/HashMap;

    .line 27
    .line 28
    new-instance v0, Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, LUc/f;->e:Ljava/util/HashMap;

    .line 34
    .line 35
    new-instance v0, Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, LUc/f;->f:Ljava/util/HashMap;

    .line 41
    .line 42
    new-instance v0, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, LUc/f;->g:Ljava/util/HashMap;

    .line 48
    .line 49
    return-void
.end method

.method public static a(Lcom/google/firebase/firestore/FirebaseFirestore;)V
    .locals 2

    .line 1
    sget-object v0, LUc/f;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, LUc/b;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p0
.end method

.method public static b(Lcom/google/firebase/firestore/FirebaseFirestore;)LUc/b;
    .locals 1

    .line 1
    sget-object v0, LUc/f;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, LUc/b;

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-object p0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw p0
.end method

.method public static c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;
    .locals 3

    .line 1
    sget-object v0, LUc/f;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LUc/n;->a:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v2, p0, LUc/n;->c:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v1, v2}, LUc/f;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-object v1

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v1, p0, LUc/n;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v1}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v2, p0, LUc/n;->c:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v1, v2}, Lcom/google/firebase/firestore/FirebaseFirestore;->e(Ls8/g;Ljava/lang/String;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {p0}, LUc/f;->e(LUc/n;)Lm9/H;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Lcom/google/firebase/firestore/FirebaseFirestore;->h(Lm9/H;)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, LUc/n;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, p0}, LUc/f;->i(Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    monitor-exit v0

    .line 43
    return-object v1

    .line 44
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    throw p0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/firestore/FirebaseFirestore;
    .locals 4

    .line 1
    sget-object v0, LUc/f;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/util/Map$Entry;

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, LUc/b;

    .line 29
    .line 30
    iget-object v3, v3, LUc/b;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 31
    .line 32
    iget-object v3, v3, Lcom/google/firebase/firestore/FirebaseFirestore;->g:Ls8/g;

    .line 33
    .line 34
    invoke-virtual {v3}, Ls8/g;->a()V

    .line 35
    .line 36
    .line 37
    iget-object v3, v3, Ls8/g;->b:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, LUc/b;

    .line 50
    .line 51
    iget-object v3, v3, LUc/b;->b:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_0

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 64
    .line 65
    monitor-exit v0

    .line 66
    return-object p0

    .line 67
    :catchall_0
    move-exception p0

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    monitor-exit v0

    .line 70
    const/4 p0, 0x0

    .line 71
    return-object p0

    .line 72
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    throw p0
.end method

.method public static e(LUc/n;)Lm9/H;
    .locals 5

    .line 1
    new-instance v0, LA7/X;

    .line 2
    .line 3
    invoke-direct {v0}, LA7/X;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LUc/n;->b:LUc/s;

    .line 7
    .line 8
    iget-object v1, v1, LUc/s;->b:Ljava/lang/String;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iput-object v1, v0, LA7/X;->a:Ljava/lang/String;

    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, LUc/n;->b:LUc/s;

    .line 15
    .line 16
    iget-object v1, v1, LUc/s;->c:Ljava/lang/Boolean;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iput-boolean v1, v0, LA7/X;->b:Z

    .line 25
    .line 26
    :cond_1
    iget-object v1, p0, LUc/n;->b:LUc/s;

    .line 27
    .line 28
    iget-object v1, v1, LUc/s;->a:Ljava/lang/Boolean;

    .line 29
    .line 30
    if-eqz v1, :cond_4

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    iget-object p0, p0, LUc/n;->b:LUc/s;

    .line 39
    .line 40
    iget-object p0, p0, LUc/s;->d:Ljava/lang/Long;

    .line 41
    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 45
    .line 46
    .line 47
    move-result-wide v1

    .line 48
    const-wide/16 v3, -0x1

    .line 49
    .line 50
    cmp-long v1, v1, v3

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v1

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const-wide/32 v1, 0x6400000

    .line 60
    .line 61
    .line 62
    :goto_0
    new-instance p0, Lm9/T;

    .line 63
    .line 64
    invoke-direct {p0, v1, v2}, Lm9/T;-><init>(J)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p0}, LA7/X;->b(Lm9/P;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    new-instance p0, Lm9/S;

    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    invoke-direct {p0, v1}, Lm9/S;-><init>(I)V

    .line 75
    .line 76
    .line 77
    new-instance v1, Lm9/Q;

    .line 78
    .line 79
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object p0, v1, Lm9/Q;->a:Lm9/S;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, LA7/X;->b(Lm9/P;)V

    .line 85
    .line 86
    .line 87
    :cond_4
    :goto_1
    invoke-virtual {v0}, LA7/X;->a()Lm9/H;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method

.method public static i(Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, LUc/f;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, LUc/b;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, LUc/b;

    .line 13
    .line 14
    invoke-direct {v1, p0, p1}, LUc/b;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p0
.end method


# virtual methods
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
    const/16 v3, 0x9

    .line 11
    .line 12
    invoke-direct {v2, v3, p0, v0}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public final f(Ljava/lang/String;Luc/i;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, p1, v0, p2}, LUc/f;->g(Ljava/lang/String;Ljava/lang/String;Luc/i;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;Luc/i;)V
    .locals 3

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    invoke-static {p1, v0, p2}, LN0/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, Luc/j;

    .line 8
    .line 9
    iget-object v1, p0, LUc/f;->b:Luc/f;

    .line 10
    .line 11
    iget-object v2, p0, LUc/f;->a:Luc/x;

    .line 12
    .line 13
    invoke-direct {v0, v1, p1, v2}, Luc/j;-><init>(Luc/f;Ljava/lang/String;Luc/s;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p3}, Luc/j;->a(Luc/i;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, LUc/f;->e:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, LUc/f;->f:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final getPluginConstantsForFirebaseApp(Ls8/g;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 1
    new-instance p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v1, LNc/c;

    .line 9
    .line 10
    const/16 v2, 0x9

    .line 11
    .line 12
    invoke-direct {v1, v2, p1}, LNc/c;-><init>(ILcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public final h()V
    .locals 5

    .line 1
    iget-object v0, p0, LUc/f;->e:Ljava/util/HashMap;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LUc/f;->e:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

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
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/lang/String;

    .line 26
    .line 27
    iget-object v4, p0, LUc/f;->e:Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Luc/j;

    .line 34
    .line 35
    invoke-static {v2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3}, Luc/j;->a(Luc/i;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    goto :goto_3

    .line 44
    :cond_0
    iget-object v1, p0, LUc/f;->e:Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 47
    .line 48
    .line 49
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    iget-object v1, p0, LUc/f;->f:Ljava/util/HashMap;

    .line 51
    .line 52
    monitor-enter v1

    .line 53
    :try_start_1
    iget-object v0, p0, LUc/f;->f:Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Ljava/lang/String;

    .line 74
    .line 75
    iget-object v4, p0, LUc/f;->f:Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Luc/i;

    .line 82
    .line 83
    invoke-static {v2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    invoke-interface {v2, v3}, Luc/i;->onCancel(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catchall_1
    move-exception v0

    .line 91
    goto :goto_2

    .line 92
    :cond_1
    iget-object v0, p0, LUc/f;->f:Ljava/util/HashMap;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 95
    .line 96
    .line 97
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 98
    iget-object v0, p0, LUc/f;->g:Ljava/util/HashMap;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :goto_2
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 105
    throw v0

    .line 106
    :goto_3
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 107
    throw v1
.end method

.method public final onAttachedToActivity(Lrc/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LUc/f;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    check-cast p1, Lq/s1;

    .line 4
    .line 5
    iget-object p1, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Landroid/app/Activity;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 5

    .line 1
    iget-object p1, p1, Lqc/a;->c:Luc/f;

    .line 2
    .line 3
    iput-object p1, p0, LUc/f;->b:Luc/f;

    .line 4
    .line 5
    const-string p1, "plugins.flutter.io/firebase_firestore"

    .line 6
    .line 7
    invoke-static {p1, p0}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->registerPlugin(Ljava/lang/String;Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, LUc/f;->b:Luc/f;

    .line 11
    .line 12
    new-instance v0, LVa/X7;

    .line 13
    .line 14
    sget-object v1, LUc/m;->e:LUc/m;

    .line 15
    .line 16
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.loadBundle"

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v2, LUc/k;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-direct {v2, p0, v4}, LUc/k;-><init>(LUc/f;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, LVa/X7;

    .line 32
    .line 33
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.namedQueryGet"

    .line 34
    .line 35
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, LJ9/x;

    .line 39
    .line 40
    const/16 v4, 0x1c

    .line 41
    .line 42
    invoke-direct {v2, p0, v4}, LJ9/x;-><init>(LUc/f;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 46
    .line 47
    .line 48
    new-instance v0, LVa/X7;

    .line 49
    .line 50
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.clearPersistence"

    .line 51
    .line 52
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance v2, LUc/l;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-direct {v2, p0, v4}, LUc/l;-><init>(LUc/f;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 62
    .line 63
    .line 64
    new-instance v0, LVa/X7;

    .line 65
    .line 66
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.disableNetwork"

    .line 67
    .line 68
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance v2, LUc/l;

    .line 72
    .line 73
    const/4 v4, 0x1

    .line 74
    invoke-direct {v2, p0, v4}, LUc/l;-><init>(LUc/f;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 78
    .line 79
    .line 80
    new-instance v0, LVa/X7;

    .line 81
    .line 82
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.enableNetwork"

    .line 83
    .line 84
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    new-instance v2, LUc/l;

    .line 88
    .line 89
    const/4 v4, 0x2

    .line 90
    invoke-direct {v2, p0, v4}, LUc/l;-><init>(LUc/f;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 94
    .line 95
    .line 96
    new-instance v0, LVa/X7;

    .line 97
    .line 98
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.terminate"

    .line 99
    .line 100
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    new-instance v2, LUc/l;

    .line 104
    .line 105
    const/4 v4, 0x3

    .line 106
    invoke-direct {v2, p0, v4}, LUc/l;-><init>(LUc/f;I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 110
    .line 111
    .line 112
    new-instance v0, LVa/X7;

    .line 113
    .line 114
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.waitForPendingWrites"

    .line 115
    .line 116
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    new-instance v2, LUc/l;

    .line 120
    .line 121
    const/4 v4, 0x4

    .line 122
    invoke-direct {v2, p0, v4}, LUc/l;-><init>(LUc/f;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 126
    .line 127
    .line 128
    new-instance v0, LVa/X7;

    .line 129
    .line 130
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.setIndexConfiguration"

    .line 131
    .line 132
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    new-instance v2, LUc/l;

    .line 136
    .line 137
    const/4 v4, 0x5

    .line 138
    invoke-direct {v2, p0, v4}, LUc/l;-><init>(LUc/f;I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 142
    .line 143
    .line 144
    new-instance v0, LVa/X7;

    .line 145
    .line 146
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.setLoggingEnabled"

    .line 147
    .line 148
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    new-instance v2, LUc/l;

    .line 152
    .line 153
    const/4 v4, 0x6

    .line 154
    invoke-direct {v2, p0, v4}, LUc/l;-><init>(LUc/f;I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 158
    .line 159
    .line 160
    new-instance v0, LVa/X7;

    .line 161
    .line 162
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.snapshotsInSyncSetup"

    .line 163
    .line 164
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    new-instance v2, LUc/k;

    .line 168
    .line 169
    const/4 v4, 0x4

    .line 170
    invoke-direct {v2, p0, v4}, LUc/k;-><init>(LUc/f;I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 174
    .line 175
    .line 176
    new-instance v0, LVa/X7;

    .line 177
    .line 178
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.transactionCreate"

    .line 179
    .line 180
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    new-instance v2, LUc/k;

    .line 184
    .line 185
    const/4 v4, 0x3

    .line 186
    invoke-direct {v2, p0, v4}, LUc/k;-><init>(LUc/f;I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 190
    .line 191
    .line 192
    new-instance v0, LVa/X7;

    .line 193
    .line 194
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.transactionStoreResult"

    .line 195
    .line 196
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    new-instance v2, LUc/k;

    .line 200
    .line 201
    const/4 v4, 0x5

    .line 202
    invoke-direct {v2, p0, v4}, LUc/k;-><init>(LUc/f;I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 206
    .line 207
    .line 208
    new-instance v0, LVa/X7;

    .line 209
    .line 210
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.transactionGet"

    .line 211
    .line 212
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    new-instance v2, LUc/k;

    .line 216
    .line 217
    const/4 v4, 0x6

    .line 218
    invoke-direct {v2, p0, v4}, LUc/k;-><init>(LUc/f;I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 222
    .line 223
    .line 224
    new-instance v0, LVa/X7;

    .line 225
    .line 226
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceSet"

    .line 227
    .line 228
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    new-instance v2, LUc/l;

    .line 232
    .line 233
    const/4 v4, 0x7

    .line 234
    invoke-direct {v2, p0, v4}, LUc/l;-><init>(LUc/f;I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 238
    .line 239
    .line 240
    new-instance v0, LVa/X7;

    .line 241
    .line 242
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceUpdate"

    .line 243
    .line 244
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    new-instance v2, LUc/l;

    .line 248
    .line 249
    const/16 v4, 0x8

    .line 250
    .line 251
    invoke-direct {v2, p0, v4}, LUc/l;-><init>(LUc/f;I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 255
    .line 256
    .line 257
    new-instance v0, LVa/X7;

    .line 258
    .line 259
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceGet"

    .line 260
    .line 261
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    new-instance v2, LUc/l;

    .line 265
    .line 266
    const/16 v4, 0x9

    .line 267
    .line 268
    invoke-direct {v2, p0, v4}, LUc/l;-><init>(LUc/f;I)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 272
    .line 273
    .line 274
    new-instance v0, LVa/X7;

    .line 275
    .line 276
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceDelete"

    .line 277
    .line 278
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    new-instance v2, LUc/l;

    .line 282
    .line 283
    const/16 v4, 0xa

    .line 284
    .line 285
    invoke-direct {v2, p0, v4}, LUc/l;-><init>(LUc/f;I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 289
    .line 290
    .line 291
    new-instance v0, LVa/X7;

    .line 292
    .line 293
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.queryGet"

    .line 294
    .line 295
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    new-instance v2, LUc/l;

    .line 299
    .line 300
    const/16 v4, 0xb

    .line 301
    .line 302
    invoke-direct {v2, p0, v4}, LUc/l;-><init>(LUc/f;I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 306
    .line 307
    .line 308
    new-instance v0, LVa/X7;

    .line 309
    .line 310
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.aggregateQuery"

    .line 311
    .line 312
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    new-instance v2, LUc/l;

    .line 316
    .line 317
    const/16 v4, 0xc

    .line 318
    .line 319
    invoke-direct {v2, p0, v4}, LUc/l;-><init>(LUc/f;I)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 323
    .line 324
    .line 325
    new-instance v0, LVa/X7;

    .line 326
    .line 327
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.writeBatchCommit"

    .line 328
    .line 329
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    new-instance v2, LJ9/x;

    .line 333
    .line 334
    const/16 v4, 0x1b

    .line 335
    .line 336
    invoke-direct {v2, p0, v4}, LJ9/x;-><init>(LUc/f;I)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 340
    .line 341
    .line 342
    new-instance v0, LVa/X7;

    .line 343
    .line 344
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.querySnapshot"

    .line 345
    .line 346
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    new-instance v2, LUc/k;

    .line 350
    .line 351
    const/4 v4, 0x1

    .line 352
    invoke-direct {v2, p0, v4}, LUc/k;-><init>(LUc/f;I)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 356
    .line 357
    .line 358
    new-instance v0, LVa/X7;

    .line 359
    .line 360
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.documentReferenceSnapshot"

    .line 361
    .line 362
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    new-instance v2, LUc/k;

    .line 366
    .line 367
    const/4 v4, 0x2

    .line 368
    invoke-direct {v2, p0, v4}, LUc/k;-><init>(LUc/f;I)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0, v2}, LVa/X7;->n(Luc/b;)V

    .line 372
    .line 373
    .line 374
    new-instance v0, LVa/X7;

    .line 375
    .line 376
    const-string v2, "dev.flutter.pigeon.cloud_firestore_platform_interface.FirebaseFirestoreHostApi.persistenceCacheIndexManagerRequest"

    .line 377
    .line 378
    invoke-direct {v0, p1, v1, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    new-instance p1, LJ9/x;

    .line 382
    .line 383
    const/16 v1, 0x1d

    .line 384
    .line 385
    invoke-direct {p1, p0, v1}, LJ9/x;-><init>(LUc/f;I)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0, p1}, LVa/X7;->n(Luc/b;)V

    .line 389
    .line 390
    .line 391
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 2

    .line 1
    iget-object v0, p0, LUc/f;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 2

    .line 1
    iget-object v0, p0, LUc/f;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LUc/f;->h()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, LUc/f;->b:Luc/f;

    .line 6
    .line 7
    return-void
.end method

.method public final onReattachedToActivityForConfigChanges(Lrc/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LUc/f;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    check-cast p1, Lq/s1;

    .line 4
    .line 5
    iget-object p1, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Landroid/app/Activity;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
