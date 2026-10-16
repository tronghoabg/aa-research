.class public final LB8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz8/a;


# instance fields
.field public final a:LC8/i;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:LC8/j;

.field public final e:Lcom/google/android/gms/tasks/Task;


# direct methods
.method public constructor <init>(Ls8/g;LO9/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, LC8/i;

    .line 8
    .line 9
    invoke-direct {v0, p1}, LC8/i;-><init>(Ls8/g;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, LB8/d;->a:LC8/i;

    .line 13
    .line 14
    iput-object p3, p0, LB8/d;->b:Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    iput-object p5, p0, LB8/d;->c:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    new-instance p3, LC8/j;

    .line 19
    .line 20
    const/4 p5, 0x0

    .line 21
    invoke-direct {p3, p5}, LC8/j;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object p3, p0, LB8/d;->d:LC8/j;

    .line 25
    .line 26
    invoke-interface {p2}, LO9/b;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    if-nez p3, :cond_0

    .line 31
    .line 32
    new-instance p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 33
    .line 34
    invoke-direct {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance p3, LB8/a;

    .line 38
    .line 39
    const/4 p5, 0x0

    .line 40
    invoke-direct {p3, p1, p2, p5}, LB8/a;-><init>(Ls8/g;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p4, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, LB8/d;->e:Lcom/google/android/gms/tasks/Task;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    invoke-interface {p2}, LO9/b;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance p1, Ljava/lang/ClassCastException;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 63
    .line 64
    .line 65
    throw p1
.end method


# virtual methods
.method public final getToken()Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    new-instance v0, LB8/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LB8/d;->e:Lcom/google/android/gms/tasks/Task;

    .line 8
    .line 9
    iget-object v2, p0, LB8/d;->b:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, LA5/f;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-direct {v1, v3}, LA5/f;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method
