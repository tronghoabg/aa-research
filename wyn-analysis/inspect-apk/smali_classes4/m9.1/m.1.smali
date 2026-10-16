.class public final Lm9/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ls9/h;

.field public final b:Lcom/google/firebase/firestore/FirebaseFirestore;


# direct methods
.method public constructor <init>(Ls9/h;Lcom/google/firebase/firestore/FirebaseFirestore;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lm9/m;->a:Ls9/h;

    .line 8
    .line 9
    iput-object p2, p0, Lm9/m;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/Executor;Lp9/g;Lm9/p;)Lm9/l;
    .locals 3

    .line 1
    new-instance v0, LVc/a;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1, p0, p3}, LVc/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance p3, Lp9/b;

    .line 8
    .line 9
    invoke-direct {p3, p1, v0}, Lp9/b;-><init>(Ljava/util/concurrent/Executor;Lm9/p;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lm9/m;->a:Ls9/h;

    .line 13
    .line 14
    iget-object p1, p1, Ls9/h;->a:Ls9/m;

    .line 15
    .line 16
    new-instance v0, Lp9/u;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, p1, v1}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lm9/m;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 23
    .line 24
    iget-object p1, p1, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 25
    .line 26
    monitor-enter p1

    .line 27
    :try_start_0
    invoke-virtual {p1}, LDd/c;->C()V

    .line 28
    .line 29
    .line 30
    iget-object v1, p1, LDd/c;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lp9/n;

    .line 33
    .line 34
    invoke-virtual {v1, v0, p2, p3}, Lp9/n;->b(Lp9/u;Lp9/g;Lp9/b;)Lp9/v;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    new-instance v0, Lm9/l;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-direct {v0, p3, v1, p2, v2}, Lm9/l;-><init>(Lp9/b;Lp9/n;Lp9/v;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    monitor-exit p1

    .line 45
    return-object v0

    .line 46
    :catchall_0
    move-exception p2

    .line 47
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw p2
.end method

.method public final b()Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 1
    new-instance v0, Lt9/e;

    .line 2
    .line 3
    iget-object v1, p0, Lm9/m;->a:Ls9/h;

    .line 4
    .line 5
    sget-object v2, Lt9/m;->c:Lt9/m;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lt9/h;-><init>(Ls9/h;Lt9/m;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lm9/m;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 15
    .line 16
    iget-object v1, v1, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 17
    .line 18
    monitor-enter v1

    .line 19
    :try_start_0
    invoke-virtual {v1}, LDd/c;->C()V

    .line 20
    .line 21
    .line 22
    iget-object v2, v1, LDd/c;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Lp9/n;

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Lp9/n;->f(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;

    .line 27
    .line 28
    .line 29
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    monitor-exit v1

    .line 31
    sget-object v1, Lw9/k;->b:Lcom/applovin/impl/T0;

    .line 32
    .line 33
    sget-object v2, Lw9/p;->a:Lm9/B;

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw v0
.end method

.method public final c(I)Lcom/google/android/gms/tasks/Task;
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lm9/m;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 5
    .line 6
    iget-object v0, p1, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    invoke-virtual {v0}, LDd/c;->C()V

    .line 10
    .line 11
    .line 12
    iget-object p1, v0, LDd/c;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lp9/n;

    .line 15
    .line 16
    invoke-virtual {p1}, Lp9/n;->e()V

    .line 17
    .line 18
    .line 19
    new-instance v1, LB8/c;

    .line 20
    .line 21
    iget-object v2, p0, Lm9/m;->a:Ls9/h;

    .line 22
    .line 23
    const/16 v3, 0xb

    .line 24
    .line 25
    invoke-direct {v1, v3, p1, v2}, LB8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p1, Lp9/n;->d:Lw9/e;

    .line 29
    .line 30
    iget-object p1, p1, Lw9/e;->a:Lw9/c;

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Lw9/c;->b(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v1, Lm9/B;

    .line 37
    .line 38
    const/16 v2, 0xd

    .line 39
    .line 40
    invoke-direct {v1, v2}, Lm9/B;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/Task;->continueWith(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 44
    .line 45
    .line 46
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    monitor-exit v0

    .line 48
    sget-object v0, Lw9/k;->b:Lcom/applovin/impl/T0;

    .line 49
    .line 50
    new-instance v1, Lcom/unity3d/services/core/webview/b;

    .line 51
    .line 52
    const/16 v2, 0x14

    .line 53
    .line 54
    invoke-direct {v1, p0, v2}, Lcom/unity3d/services/core/webview/b;-><init>(Ljava/lang/Object;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    throw p1

    .line 65
    :cond_0
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 66
    .line 67
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 68
    .line 69
    .line 70
    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 71
    .line 72
    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 73
    .line 74
    .line 75
    new-instance v2, Lp9/g;

    .line 76
    .line 77
    invoke-direct {v2}, Lp9/g;-><init>()V

    .line 78
    .line 79
    .line 80
    const/4 v3, 0x1

    .line 81
    iput-boolean v3, v2, Lp9/g;->a:Z

    .line 82
    .line 83
    iput-boolean v3, v2, Lp9/g;->b:Z

    .line 84
    .line 85
    iput-boolean v3, v2, Lp9/g;->c:Z

    .line 86
    .line 87
    sget-object v3, Lw9/k;->b:Lcom/applovin/impl/T0;

    .line 88
    .line 89
    new-instance v4, Lm9/k;

    .line 90
    .line 91
    const/4 v5, 0x0

    .line 92
    invoke-direct {v4, v0, v1, p1, v5}, Lm9/k;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;II)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v3, v2, v4}, Lm9/m;->a(Ljava/util/concurrent/Executor;Lp9/g;Lm9/p;)Lm9/l;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {v1, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    return-object p1
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm9/m;->a:Ls9/h;

    .line 2
    .line 3
    iget-object v0, v0, Ls9/h;->a:Ls9/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Ls9/m;->c()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final e(Ljava/lang/Object;Lm9/a0;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    .line 1
    const-string v0, "Provided data must not be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, LFe/c;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "Provided options must not be null."

    .line 7
    .line 8
    invoke-static {p2, v0}, LFe/c;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p2, Lm9/a0;->a:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lm9/m;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->h:Lm9/f0;

    .line 18
    .line 19
    iget-object p2, p2, Lm9/a0;->b:Lt9/f;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Lm9/f0;->e(Ljava/lang/Object;Lt9/f;)Lmd/J;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object p2, p0, Lm9/m;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 27
    .line 28
    iget-object p2, p2, Lcom/google/firebase/firestore/FirebaseFirestore;->h:Lm9/f0;

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Lm9/f0;->g(Ljava/lang/Object;)Lmd/J;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    iget-object p2, p0, Lm9/m;->a:Ls9/h;

    .line 35
    .line 36
    sget-object v0, Lt9/m;->c:Lt9/m;

    .line 37
    .line 38
    invoke-virtual {p1, p2, v0}, Lmd/J;->y(Ls9/h;Lt9/m;)Lt9/h;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object p2, p0, Lm9/m;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 47
    .line 48
    iget-object p2, p2, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 49
    .line 50
    monitor-enter p2

    .line 51
    :try_start_0
    invoke-virtual {p2}, LDd/c;->C()V

    .line 52
    .line 53
    .line 54
    iget-object v0, p2, LDd/c;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lp9/n;

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Lp9/n;->f(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;

    .line 59
    .line 60
    .line 61
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    monitor-exit p2

    .line 63
    sget-object p2, Lw9/k;->b:Lcom/applovin/impl/T0;

    .line 64
    .line 65
    sget-object v0, Lw9/p;->a:Lm9/B;

    .line 66
    .line 67
    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    :catchall_0
    move-exception p1

    .line 73
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lm9/m;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lm9/m;

    .line 12
    .line 13
    iget-object v1, p1, Lm9/m;->a:Ls9/h;

    .line 14
    .line 15
    iget-object v3, p0, Lm9/m;->a:Ls9/h;

    .line 16
    .line 17
    invoke-virtual {v3, v1}, Ls9/h;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lm9/m;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 24
    .line 25
    iget-object p1, p1, Lm9/m;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    return v0

    .line 34
    :cond_2
    return v2
.end method

.method public final varargs f(Lm9/r;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 10

    .line 1
    iget-object v0, p0, Lm9/m;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->h:Lm9/f0;

    .line 4
    .line 5
    sget-object v1, Lw9/p;->a:Lm9/B;

    .line 6
    .line 7
    array-length v1, p3

    .line 8
    rem-int/lit8 v1, v1, 0x2

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eq v1, v2, :cond_a

    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    invoke-static {v1, p3}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    move p2, p1

    .line 29
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    if-ge p2, p3, :cond_2

    .line 34
    .line 35
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    instance-of v3, p3, Ljava/lang/String;

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    instance-of v3, p3, Lm9/r;

    .line 44
    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 49
    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v1, "Excepted field name at argument position "

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    add-int/lit8 p2, p2, 0x2

    .line 58
    .line 59
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p2, " but got "

    .line 63
    .line 64
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string p2, " in call to update.  The arguments to update should alternate between field names and values"

    .line 71
    .line 72
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1

    .line 83
    :cond_1
    :goto_1
    add-int/lit8 p2, p2, 0x2

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    rem-int/lit8 p2, p2, 0x2

    .line 91
    .line 92
    if-nez p2, :cond_3

    .line 93
    .line 94
    move p2, v2

    .line 95
    goto :goto_2

    .line 96
    :cond_3
    move p2, p1

    .line 97
    :goto_2
    const-string p3, "Expected fieldAndValues to contain an even number of elements"

    .line 98
    .line 99
    new-array v3, p1, [Ljava/lang/Object;

    .line 100
    .line 101
    invoke-static {p2, p3, v3}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    new-instance p2, LE4/n;

    .line 105
    .line 106
    const/4 p3, 0x3

    .line 107
    const/16 v3, 0x13

    .line 108
    .line 109
    invoke-direct {p2, p3, v3}, LE4/n;-><init>(II)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2}, LE4/n;->x()LE5/b;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    new-instance v5, Ls9/l;

    .line 117
    .line 118
    invoke-direct {v5}, Ls9/l;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    :cond_4
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_9

    .line 130
    .line 131
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    instance-of v6, v3, Ljava/lang/String;

    .line 140
    .line 141
    if-nez v6, :cond_6

    .line 142
    .line 143
    instance-of v7, v3, Lm9/r;

    .line 144
    .line 145
    if-eqz v7, :cond_5

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_5
    move v7, p1

    .line 149
    goto :goto_5

    .line 150
    :cond_6
    :goto_4
    move v7, v2

    .line 151
    :goto_5
    const-string v8, "Expected argument to be String or FieldPath."

    .line 152
    .line 153
    new-array v9, p1, [Ljava/lang/Object;

    .line 154
    .line 155
    invoke-static {v7, v8, v9}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    if-eqz v6, :cond_7

    .line 159
    .line 160
    check-cast v3, Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {v3}, Lm9/r;->a(Ljava/lang/String;)Lm9/r;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    iget-object v3, v3, Lm9/r;->a:Ls9/j;

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_7
    check-cast v3, Lm9/r;

    .line 170
    .line 171
    iget-object v3, v3, Lm9/r;->a:Ls9/j;

    .line 172
    .line 173
    :goto_6
    instance-of v6, v4, Lm9/u;

    .line 174
    .line 175
    if-eqz v6, :cond_8

    .line 176
    .line 177
    invoke-virtual {p3, v3}, LE5/b;->a(Ls9/j;)V

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_8
    invoke-virtual {p3, v3}, LE5/b;->c(Ls9/j;)LE5/b;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    invoke-virtual {v0, v4, v6}, Lm9/f0;->b(Ljava/lang/Object;LE5/b;)Lka/C1;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    if-eqz v4, :cond_4

    .line 190
    .line 191
    invoke-virtual {p3, v3}, LE5/b;->a(Ls9/j;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v5, v4, v3}, Ls9/l;->g(Lka/C1;Ls9/j;)V

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_9
    iget-object p1, p2, LE4/n;->c:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast p1, Ljava/util/HashSet;

    .line 201
    .line 202
    new-instance v6, Lt9/f;

    .line 203
    .line 204
    invoke-direct {v6, p1}, Lt9/f;-><init>(Ljava/util/HashSet;)V

    .line 205
    .line 206
    .line 207
    iget-object p1, p2, LE4/n;->d:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast p1, Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    iget-object v4, p0, Lm9/m;->a:Ls9/h;

    .line 216
    .line 217
    invoke-static {v2}, Lt9/m;->a(Z)Lt9/m;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    new-instance v3, Lt9/l;

    .line 222
    .line 223
    invoke-direct/range {v3 .. v8}, Lt9/l;-><init>(Ls9/h;Ls9/l;Lt9/f;Lt9/m;Ljava/util/List;)V

    .line 224
    .line 225
    .line 226
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    iget-object p2, p0, Lm9/m;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 231
    .line 232
    iget-object p2, p2, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 233
    .line 234
    monitor-enter p2

    .line 235
    :try_start_0
    invoke-virtual {p2}, LDd/c;->C()V

    .line 236
    .line 237
    .line 238
    iget-object p3, p2, LDd/c;->c:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast p3, Lp9/n;

    .line 241
    .line 242
    invoke-virtual {p3, p1}, Lp9/n;->f(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;

    .line 243
    .line 244
    .line 245
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 246
    monitor-exit p2

    .line 247
    sget-object p2, Lw9/k;->b:Lcom/applovin/impl/T0;

    .line 248
    .line 249
    sget-object p3, Lw9/p;->a:Lm9/B;

    .line 250
    .line 251
    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    return-object p1

    .line 256
    :catchall_0
    move-exception v0

    .line 257
    move-object p1, v0

    .line 258
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 259
    throw p1

    .line 260
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 261
    .line 262
    const-string p2, "Missing value in call to update().  There must be an even number of arguments that alternate between field names and values"

    .line 263
    .line 264
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lm9/m;->a:Ls9/h;

    .line 2
    .line 3
    iget-object v0, v0, Ls9/h;->a:Ls9/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Ls9/e;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lm9/m;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    return v1
.end method
