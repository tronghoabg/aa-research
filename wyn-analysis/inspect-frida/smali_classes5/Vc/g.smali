.class public final LVc/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/i;


# instance fields
.field public final a:LA5/h;

.field public final b:Lcom/google/firebase/firestore/FirebaseFirestore;

.field public final c:Ljava/lang/Long;

.field public final d:Ljava/lang/Long;

.field public final e:Ljava/util/concurrent/Semaphore;

.field public f:I

.field public g:Ljava/util/List;

.field public final h:Landroid/os/Handler;


# direct methods
.method public constructor <init>(LA5/h;Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/Semaphore;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LVc/g;->e:Ljava/util/concurrent/Semaphore;

    .line 11
    .line 12
    new-instance v0, Landroid/os/Handler;

    .line 13
    .line 14
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, LVc/g;->h:Landroid/os/Handler;

    .line 22
    .line 23
    iput-object p1, p0, LVc/g;->a:LA5/h;

    .line 24
    .line 25
    iput-object p2, p0, LVc/g;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 26
    .line 27
    iput-object p3, p0, LVc/g;->c:Ljava/lang/Long;

    .line 28
    .line 29
    iput-object p4, p0, LVc/g;->d:Ljava/lang/Long;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final onCancel(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p1, p0, LVc/g;->e:Ljava/util/concurrent/Semaphore;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/concurrent/Semaphore;->release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onListen(Ljava/lang/Object;Luc/g;)V
    .locals 6

    .line 1
    iget-object p1, p0, LVc/g;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 2
    .line 3
    iget-object v0, p0, LVc/g;->d:Ljava/lang/Long;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lm9/e0;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lm9/e0;-><init>(I)V

    .line 15
    .line 16
    .line 17
    new-instance v0, LVc/e;

    .line 18
    .line 19
    check-cast p2, Luc/h;

    .line 20
    .line 21
    invoke-direct {v0, p0, p2}, LVc/e;-><init>(LVc/g;Luc/h;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget-object v2, Lp9/B;->g:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 28
    .line 29
    iget-object v3, p1, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 30
    .line 31
    invoke-virtual {v3}, LDd/c;->C()V

    .line 32
    .line 33
    .line 34
    new-instance v3, LA5/g;

    .line 35
    .line 36
    const/16 v4, 0x11

    .line 37
    .line 38
    invoke-direct {v3, p1, v2, v0, v4}, LA5/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p1, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 42
    .line 43
    monitor-enter p1

    .line 44
    :try_start_0
    invoke-virtual {p1}, LDd/c;->C()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p1, LDd/c;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lp9/n;

    .line 50
    .line 51
    invoke-virtual {v0}, Lp9/n;->e()V

    .line 52
    .line 53
    .line 54
    iget-object v2, v0, Lp9/n;->d:Lw9/e;

    .line 55
    .line 56
    iget-object v2, v2, Lw9/e;->a:Lw9/c;

    .line 57
    .line 58
    new-instance v4, LK3/e;

    .line 59
    .line 60
    const/4 v5, 0x3

    .line 61
    invoke-direct {v4, v0, v1, v3, v5}, LK3/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 65
    .line 66
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 67
    .line 68
    .line 69
    new-instance v1, Lr9/k;

    .line 70
    .line 71
    const/4 v3, 0x2

    .line 72
    invoke-direct {v1, v4, v2, v0, v3}, Lr9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v1}, Lw9/c;->execute(Ljava/lang/Runnable;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 79
    .line 80
    .line 81
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    monitor-exit p1

    .line 83
    new-instance p1, LVc/e;

    .line 84
    .line 85
    invoke-direct {p1, p0, p2}, LVc/e;-><init>(LVc/g;Luc/h;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :catchall_0
    move-exception p2

    .line 93
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    throw p2

    .line 95
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 96
    .line 97
    const-string p2, "Max attempts must be at least 1"

    .line 98
    .line 99
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p1
.end method
