.class public final LJ9/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz9/E;


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LJ9/u;LM9/a;LJ9/X;LJ9/V;LN9/b;LJ9/G;LJ9/i;LN9/h;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LJ9/o;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, LJ9/o;->c:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, LJ9/o;->d:Ljava/lang/Object;

    .line 5
    iput-object p4, p0, LJ9/o;->e:Ljava/lang/Object;

    .line 6
    iput-object p5, p0, LJ9/o;->f:Ljava/lang/Object;

    .line 7
    iput-object p6, p0, LJ9/o;->g:Ljava/lang/Object;

    .line 8
    iput-object p7, p0, LJ9/o;->h:Ljava/lang/Object;

    .line 9
    iput-object p8, p0, LJ9/o;->i:Ljava/lang/Object;

    .line 10
    iput-object p9, p0, LJ9/o;->j:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, LJ9/o;->a:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LS8/b;LN1/c;LY9/c;)V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 14
    iput-object p1, p0, LJ9/o;->b:Ljava/lang/Object;

    .line 15
    iput-object p2, p0, LJ9/o;->c:Ljava/lang/Object;

    .line 16
    iput-object p3, p0, LJ9/o;->j:Ljava/lang/Object;

    .line 17
    iput-object p4, p0, LJ9/o;->i:Ljava/lang/Object;

    .line 18
    sget p2, LQ1/x;->a:I

    .line 19
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 20
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    .line 21
    :goto_0
    new-instance p3, Landroid/os/Handler;

    const/4 p4, 0x0

    invoke-direct {p3, p2, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 22
    iput-object p3, p0, LJ9/o;->d:Ljava/lang/Object;

    .line 23
    sget p2, LQ1/x;->a:I

    const/16 v0, 0x17

    if-lt p2, v0, :cond_1

    new-instance p2, LW1/c;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, LW1/c;-><init>(Ljava/lang/Object;I)V

    goto :goto_1

    :cond_1
    move-object p2, p4

    :goto_1
    iput-object p2, p0, LJ9/o;->e:Ljava/lang/Object;

    .line 24
    new-instance p2, LA7/V1;

    const/16 v0, 0x8

    invoke-direct {p2, p0, v0}, LA7/V1;-><init>(Ljava/lang/Object;I)V

    iput-object p2, p0, LJ9/o;->f:Ljava/lang/Object;

    .line 25
    sget-object p2, LW1/b;->c:LW1/b;

    .line 26
    sget-object p2, LQ1/x;->c:Ljava/lang/String;

    const-string v0, "Amazon"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "Xiaomi"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    move-object p2, p4

    goto :goto_3

    .line 27
    :cond_3
    :goto_2
    const-string p2, "external_surround_sound_enabled"

    invoke-static {p2}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    :goto_3
    if-eqz p2, :cond_4

    .line 28
    new-instance p4, LW1/d;

    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-direct {p4, p0, p3, p1, p2}, LW1/d;-><init>(LJ9/o;Landroid/os/Handler;Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 30
    :cond_4
    iput-object p4, p0, LJ9/o;->g:Ljava/lang/Object;

    return-void
.end method

.method public static e(LHe/g;LHe/m;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LJ9/m;

    .line 7
    .line 8
    invoke-direct {v1, v0}, LJ9/m;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, LSe/r;

    .line 12
    .line 13
    sget-object v3, LNe/b;->d:Lya/b;

    .line 14
    .line 15
    invoke-direct {v2, p0, v1, v3}, LSe/r;-><init>(LHe/g;LLe/b;LLe/b;)V

    .line 16
    .line 17
    .line 18
    new-instance p0, LG8/c;

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    invoke-direct {p0, v0, v1}, LG8/c;-><init>(Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    new-instance v1, LSe/k;

    .line 25
    .line 26
    invoke-direct {v1, p0}, LSe/k;-><init>(Ljava/util/concurrent/Callable;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v1}, LHe/g;->d(LHe/g;)LHe/g;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance v1, LJ9/m;

    .line 34
    .line 35
    invoke-direct {v1, v0}, LJ9/m;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, LSe/j;

    .line 39
    .line 40
    const/4 v3, 0x2

    .line 41
    invoke-direct {v2, p0, v1, v3}, LSe/j;-><init>(LHe/g;LLe/c;I)V

    .line 42
    .line 43
    .line 44
    const-string p0, "scheduler is null"

    .line 45
    .line 46
    invoke-static {p1, p0}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance p0, LSe/b;

    .line 50
    .line 51
    invoke-direct {p0}, LSe/b;-><init>()V

    .line 52
    .line 53
    .line 54
    :try_start_0
    new-instance v1, LSe/i;

    .line 55
    .line 56
    invoke-direct {v1, p0}, LSe/i;-><init>(LHe/h;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v1}, LMe/a;->e(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z

    .line 60
    .line 61
    .line 62
    new-instance p0, LL7/b;

    .line 63
    .line 64
    const/4 v3, 0x6

    .line 65
    invoke-direct {p0, v3, v1, v2}, LL7/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p0}, LHe/m;->b(Ljava/lang/Runnable;)LJe/b;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    iget-object p1, v1, LSe/i;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, LJe/c;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static {p1, p0}, LMe/a;->c(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :catchall_0
    move-exception p0

    .line 88
    invoke-static {p0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    new-instance p1, Ljava/lang/NullPointerException;

    .line 92
    .line 93
    const-string v0, "subscribeActual failed"

    .line 94
    .line 95
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :catch_0
    move-exception p0

    .line 103
    throw p0
.end method


# virtual methods
.method public a(Lz9/D;)Lcom/google/android/gms/tasks/Task;
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    iget-object v3, p0, LJ9/o;->h:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v3, LJ9/i;

    .line 7
    .line 8
    invoke-virtual {v3}, LJ9/i;->a()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    const-string v3, "Attempting to record: render error to metrics logger"

    .line 15
    .line 16
    invoke-static {v3}, Lic/d;->E(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v3, LA5/h;

    .line 20
    .line 21
    const/4 v4, 0x6

    .line 22
    invoke-direct {v3, v4, p0, p1}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, LQe/b;

    .line 26
    .line 27
    invoke-direct {p1, v3, v2}, LQe/b;-><init>(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, LJ9/o;->d()LHe/a;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    new-array v4, v0, [LHe/a;

    .line 35
    .line 36
    aput-object v3, v4, v1

    .line 37
    .line 38
    aput-object p1, v4, v2

    .line 39
    .line 40
    new-instance p1, LQe/b;

    .line 41
    .line 42
    invoke-direct {p1, v4, v1}, LQe/b;-><init>(Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    new-instance v3, LJ9/n;

    .line 46
    .line 47
    invoke-direct {v3, p0, v0}, LJ9/n;-><init>(LJ9/o;I)V

    .line 48
    .line 49
    .line 50
    new-instance v4, LQe/b;

    .line 51
    .line 52
    invoke-direct {v4, v3, v2}, LQe/b;-><init>(Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    new-array v0, v0, [LHe/a;

    .line 56
    .line 57
    aput-object p1, v0, v1

    .line 58
    .line 59
    aput-object v4, v0, v2

    .line 60
    .line 61
    new-instance p1, LQe/b;

    .line 62
    .line 63
    invoke-direct {p1, v0, v1}, LQe/b;-><init>(Ljava/lang/Object;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, LHe/a;->f()LHe/g;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-object v0, p0, LJ9/o;->d:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, LJ9/X;

    .line 73
    .line 74
    iget-object v0, v0, LJ9/X;->a:LHe/m;

    .line 75
    .line 76
    invoke-static {p1, v0}, LJ9/o;->e(LHe/g;LHe/m;)Lcom/google/android/gms/tasks/Task;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1

    .line 81
    :cond_0
    const-string p1, "render error to metrics logger"

    .line 82
    .line 83
    invoke-virtual {p0, p1}, LJ9/o;->c(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    new-instance p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 87
    .line 88
    invoke-direct {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    return-object p1
.end method

.method public b()Lcom/google/android/gms/tasks/Task;
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v3, p0, LJ9/o;->h:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v3, LJ9/i;

    .line 7
    .line 8
    invoke-virtual {v3}, LJ9/i;->a()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    iget-boolean v3, p0, LJ9/o;->a:Z

    .line 15
    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    const-string v3, "Attempting to record: message impression to metrics logger"

    .line 19
    .line 20
    invoke-static {v3}, Lic/d;->E(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v3, LJ9/n;

    .line 24
    .line 25
    invoke-direct {v3, p0, v2}, LJ9/n;-><init>(LJ9/o;I)V

    .line 26
    .line 27
    .line 28
    new-instance v4, LQe/b;

    .line 29
    .line 30
    invoke-direct {v4, v3, v1}, LQe/b;-><init>(Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, LJ9/o;->d()LHe/a;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    new-array v5, v0, [LHe/a;

    .line 38
    .line 39
    aput-object v3, v5, v2

    .line 40
    .line 41
    aput-object v4, v5, v1

    .line 42
    .line 43
    new-instance v3, LQe/b;

    .line 44
    .line 45
    invoke-direct {v3, v5, v2}, LQe/b;-><init>(Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    new-instance v4, LJ9/n;

    .line 49
    .line 50
    invoke-direct {v4, p0, v0}, LJ9/n;-><init>(LJ9/o;I)V

    .line 51
    .line 52
    .line 53
    new-instance v5, LQe/b;

    .line 54
    .line 55
    invoke-direct {v5, v4, v1}, LQe/b;-><init>(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    new-array v0, v0, [LHe/a;

    .line 59
    .line 60
    aput-object v3, v0, v2

    .line 61
    .line 62
    aput-object v5, v0, v1

    .line 63
    .line 64
    new-instance v1, LQe/b;

    .line 65
    .line 66
    invoke-direct {v1, v0, v2}, LQe/b;-><init>(Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, LHe/a;->f()LHe/g;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-object v1, p0, LJ9/o;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, LJ9/X;

    .line 76
    .line 77
    iget-object v1, v1, LJ9/X;->a:LHe/m;

    .line 78
    .line 79
    invoke-static {v0, v1}, LJ9/o;->e(LHe/g;LHe/m;)Lcom/google/android/gms/tasks/Task;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0

    .line 84
    :cond_0
    const-string v0, "message impression to metrics logger"

    .line 85
    .line 86
    invoke-virtual {p0, v0}, LJ9/o;->c(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 90
    .line 91
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, LJ9/o;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LN9/h;

    .line 4
    .line 5
    iget-object v0, v0, LN9/h;->b:LE5/b;

    .line 6
    .line 7
    const-string v1, "Not recording: "

    .line 8
    .line 9
    iget-boolean v0, v0, LE5/b;->b:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p1, ". Reason: Message is test message"

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Lic/d;->E(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iget-object v0, p0, LJ9/o;->h:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, LJ9/i;

    .line 37
    .line 38
    invoke-virtual {v0}, LJ9/i;->a()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p1, ". Reason: Data collection is disabled"

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Lic/d;->E(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1}, Lic/d;->E(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public d()LHe/a;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, LJ9/o;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, LN9/h;

    .line 6
    .line 7
    iget-object v2, v2, LN9/h;->b:LE5/b;

    .line 8
    .line 9
    iget-object v2, v2, LE5/b;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/lang/String;

    .line 12
    .line 13
    const-string v3, "Attempting to record message impression in impression store for id: "

    .line 14
    .line 15
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v3}, Lic/d;->E(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lta/c;->e()Lta/b;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-object v4, p0, LJ9/o;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, LM9/a;

    .line 29
    .line 30
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    invoke-virtual {v3, v4, v5}, Lta/b;->b(J)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v2}, Lta/b;->a(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lta/c;

    .line 48
    .line 49
    iget-object v3, p0, LJ9/o;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v3, LJ9/u;

    .line 52
    .line 53
    invoke-virtual {v3}, LJ9/u;->a()LHe/g;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    sget-object v5, LJ9/u;->c:Lta/f;

    .line 58
    .line 59
    const-string v6, "item is null"

    .line 60
    .line 61
    invoke-static {v5, v6}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v5}, LHe/g;->a(Ljava/lang/Object;)LHe/g;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v4, v5}, LHe/g;->d(LHe/g;)LHe/g;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    new-instance v5, LA5/h;

    .line 73
    .line 74
    const/16 v7, 0x8

    .line 75
    .line 76
    invoke-direct {v5, v7, v3, v2}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    new-instance v2, LQe/f;

    .line 80
    .line 81
    invoke-direct {v2, v4, v5, v1}, LQe/f;-><init>(Ljava/lang/Object;LLe/c;I)V

    .line 82
    .line 83
    .line 84
    new-instance v3, LF5/d;

    .line 85
    .line 86
    const/16 v4, 0xc

    .line 87
    .line 88
    invoke-direct {v3, v4}, LF5/d;-><init>(I)V

    .line 89
    .line 90
    .line 91
    sget-object v4, LNe/b;->c:Lx9/d;

    .line 92
    .line 93
    new-instance v5, LQe/e;

    .line 94
    .line 95
    invoke-direct {v5, v2, v3, v4}, LQe/e;-><init>(LHe/a;LLe/b;LLe/a;)V

    .line 96
    .line 97
    .line 98
    new-instance v2, LF5/d;

    .line 99
    .line 100
    const/16 v3, 0xd

    .line 101
    .line 102
    invoke-direct {v2, v3}, LF5/d;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, v2}, LHe/a;->b(LLe/a;)LQe/e;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const-string v3, "ON_FOREGROUND"

    .line 110
    .line 111
    iget-object v5, p0, LJ9/o;->j:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v5, Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-eqz v3, :cond_0

    .line 120
    .line 121
    iget-object v3, p0, LJ9/o;->e:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v3, LJ9/V;

    .line 124
    .line 125
    invoke-virtual {v3}, LJ9/V;->a()LHe/g;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    sget-object v7, LJ9/V;->d:LJ9/S;

    .line 130
    .line 131
    invoke-static {v7, v6}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v7}, LHe/g;->a(Ljava/lang/Object;)LHe/g;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-virtual {v5, v6}, LHe/g;->d(LHe/g;)LHe/g;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    new-instance v6, LJ9/T;

    .line 143
    .line 144
    iget-object v7, p0, LJ9/o;->f:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v7, LN9/b;

    .line 147
    .line 148
    invoke-direct {v6, v3, v7, v0}, LJ9/T;-><init>(LJ9/V;LN9/b;I)V

    .line 149
    .line 150
    .line 151
    new-instance v3, LQe/f;

    .line 152
    .line 153
    invoke-direct {v3, v5, v6, v1}, LQe/f;-><init>(Ljava/lang/Object;LLe/c;I)V

    .line 154
    .line 155
    .line 156
    new-instance v5, LF5/d;

    .line 157
    .line 158
    const/16 v6, 0xe

    .line 159
    .line 160
    invoke-direct {v5, v6}, LF5/d;-><init>(I)V

    .line 161
    .line 162
    .line 163
    new-instance v6, LQe/e;

    .line 164
    .line 165
    invoke-direct {v6, v3, v5, v4}, LQe/e;-><init>(LHe/a;LLe/b;LLe/a;)V

    .line 166
    .line 167
    .line 168
    new-instance v3, LF5/d;

    .line 169
    .line 170
    const/16 v4, 0xf

    .line 171
    .line 172
    invoke-direct {v3, v4}, LF5/d;-><init>(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v6, v3}, LHe/a;->b(LLe/a;)LQe/e;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    new-instance v4, LQe/b;

    .line 180
    .line 181
    const/4 v5, 0x3

    .line 182
    invoke-direct {v4, v3, v5}, LQe/b;-><init>(Ljava/lang/Object;I)V

    .line 183
    .line 184
    .line 185
    const/4 v3, 0x2

    .line 186
    new-array v3, v3, [LHe/a;

    .line 187
    .line 188
    aput-object v4, v3, v0

    .line 189
    .line 190
    aput-object v2, v3, v1

    .line 191
    .line 192
    new-instance v1, LQe/b;

    .line 193
    .line 194
    invoke-direct {v1, v3, v0}, LQe/b;-><init>(Ljava/lang/Object;I)V

    .line 195
    .line 196
    .line 197
    return-object v1

    .line 198
    :cond_0
    return-object v2
.end method

.method public f(Lz9/C;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    .line 1
    iget-object v0, p0, LJ9/o;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LJ9/i;

    .line 4
    .line 5
    invoke-virtual {v0}, LJ9/i;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const-string v0, "Attempting to record: message dismissal to metrics logger"

    .line 12
    .line 13
    invoke-static {v0}, Lic/d;->E(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, LA5/h;

    .line 17
    .line 18
    const/4 v1, 0x7

    .line 19
    invoke-direct {v0, v1, p0, p1}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, LQe/b;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {p1, v0, v1}, LQe/b;-><init>(Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    iget-boolean v0, p0, LJ9/o;->a:Z

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, LJ9/o;->b()Lcom/google/android/gms/tasks/Task;

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p1}, LHe/a;->f()LHe/g;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object v0, p0, LJ9/o;->d:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, LJ9/X;

    .line 42
    .line 43
    iget-object v0, v0, LJ9/X;->a:LHe/m;

    .line 44
    .line 45
    invoke-static {p1, v0}, LJ9/o;->e(LHe/g;LHe/m;)Lcom/google/android/gms/tasks/Task;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :cond_1
    const-string p1, "message dismissal to metrics logger"

    .line 51
    .line 52
    invoke-virtual {p0, p1}, LJ9/o;->c(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 56
    .line 57
    invoke-direct {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1
.end method

.method public g(LW1/b;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, LJ9/o;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, LJ9/o;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LW1/b;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, LW1/b;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_3

    .line 14
    .line 15
    iput-object p1, p0, LJ9/o;->h:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, p0, LJ9/o;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, LS8/b;

    .line 20
    .line 21
    iget-object v0, v0, LS8/b;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, LW1/t;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v2, v0, LW1/t;->f0:Landroid/os/Looper;

    .line 33
    .line 34
    if-eq v2, v1, :cond_2

    .line 35
    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    const-string p1, "null"

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    :goto_0
    if-nez v1, :cond_1

    .line 50
    .line 51
    const-string v0, "null"

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :goto_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v2, "Current looper ("

    .line 65
    .line 66
    const-string v3, ") is not the playback looper ("

    .line 67
    .line 68
    const-string v4, ")"

    .line 69
    .line 70
    invoke-static {v2, v0, v3, p1, v4}, LR8/v;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v1

    .line 78
    :cond_2
    iget-object v1, v0, LW1/t;->w:LW1/b;

    .line 79
    .line 80
    invoke-virtual {p1, v1}, LW1/b;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_3

    .line 85
    .line 86
    iput-object p1, v0, LW1/t;->w:LW1/b;

    .line 87
    .line 88
    iget-object p1, v0, LW1/t;->r:Lxa/d;

    .line 89
    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    iget-object p1, p1, Lxa/d;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p1, LW1/v;

    .line 95
    .line 96
    iget-object v0, p1, LU1/d;->a:Ljava/lang/Object;

    .line 97
    .line 98
    monitor-enter v0

    .line 99
    :try_start_0
    iget-object p1, p1, LU1/d;->q:Ln2/o;

    .line 100
    .line 101
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    if-eqz p1, :cond_3

    .line 103
    .line 104
    invoke-virtual {p1}, Ln2/o;->g()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :catchall_0
    move-exception p1

    .line 109
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    throw p1

    .line 111
    :cond_3
    return-void
.end method

.method public h(Landroid/media/AudioDeviceInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, LJ9/o;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LY9/c;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    move-object v0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, v0, LY9/c;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/media/AudioDeviceInfo;

    .line 13
    .line 14
    :goto_0
    sget v2, LQ1/x;->a:I

    .line 15
    .line 16
    invoke-static {p1, v0}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    if-eqz p1, :cond_2

    .line 24
    .line 25
    new-instance v1, LY9/c;

    .line 26
    .line 27
    const/16 v0, 0x18

    .line 28
    .line 29
    invoke-direct {v1, p1, v0}, LY9/c;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    :cond_2
    iput-object v1, p0, LJ9/o;->i:Ljava/lang/Object;

    .line 33
    .line 34
    iget-object p1, p0, LJ9/o;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Landroid/content/Context;

    .line 37
    .line 38
    iget-object v0, p0, LJ9/o;->j:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, LN1/c;

    .line 41
    .line 42
    invoke-static {p1, v0, v1}, LW1/b;->b(Landroid/content/Context;LN1/c;LY9/c;)LW1/b;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, LJ9/o;->g(LW1/b;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method
