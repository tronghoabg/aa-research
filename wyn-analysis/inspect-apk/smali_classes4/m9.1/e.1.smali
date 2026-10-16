.class public final Lm9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lm9/W;

.field public final b:Lm9/V;


# direct methods
.method public constructor <init>(Lm9/W;Lm9/V;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm9/e;->a:Lm9/W;

    .line 5
    .line 6
    iput-object p2, p0, Lm9/e;->b:Lm9/V;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/tasks/Task;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "AggregateSource must not be null"

    .line 3
    .line 4
    invoke-static {v0, v1}, Lpd/f;->o(ILjava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lm9/e;->a:Lm9/W;

    .line 13
    .line 14
    iget-object v1, v1, Lm9/W;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

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
    move-object v4, v2

    .line 25
    check-cast v4, Lp9/n;

    .line 26
    .line 27
    iget-object v2, p0, Lm9/e;->a:Lm9/W;

    .line 28
    .line 29
    iget-object v5, v2, Lm9/W;->a:Lp9/u;

    .line 30
    .line 31
    invoke-virtual {v4}, Lp9/n;->e()V

    .line 32
    .line 33
    .line 34
    new-instance v7, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 35
    .line 36
    invoke-direct {v7}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance v3, Lkd/V;

    .line 40
    .line 41
    iget-object v6, p0, Lm9/e;->b:Lm9/V;

    .line 42
    .line 43
    const/4 v8, 0x2

    .line 44
    invoke-direct/range {v3 .. v8}, Lkd/V;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v4, Lp9/n;->d:Lw9/e;

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v7}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 53
    .line 54
    .line 55
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    monitor-exit v1

    .line 57
    sget-object v1, Lw9/k;->b:Lcom/applovin/impl/T0;

    .line 58
    .line 59
    new-instance v3, Laa/f;

    .line 60
    .line 61
    const/16 v4, 0xc

    .line 62
    .line 63
    invoke-direct {v3, v4, p0, v0}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    return-object v0

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lm9/e;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lm9/e;

    .line 10
    .line 11
    iget-object v0, p1, Lm9/e;->a:Lm9/W;

    .line 12
    .line 13
    iget-object v1, p0, Lm9/e;->a:Lm9/W;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lm9/W;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lm9/e;->b:Lm9/V;

    .line 22
    .line 23
    iget-object p1, p1, Lm9/e;->b:Lm9/V;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    :goto_0
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 34
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lm9/e;->a:Lm9/W;

    .line 2
    .line 3
    iget-object v1, p0, Lm9/e;->b:Lm9/V;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    new-array v2, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v0, v2, v3

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    aput-object v1, v2, v0

    .line 13
    .line 14
    invoke-static {v2}, Lj$/util/Objects;->hash([Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method
