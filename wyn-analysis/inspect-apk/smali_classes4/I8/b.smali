.class public final LI8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz8/a;


# instance fields
.field public final a:Lcom/google/android/gms/tasks/Task;

.field public final b:LC8/i;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:LC8/j;

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ls8/g;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 2

    .line 1
    new-instance v0, LC8/i;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LC8/i;-><init>(Ls8/g;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ld7/e;->c:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p3}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ls8/g;->a()V

    .line 15
    .line 16
    .line 17
    iget-object v1, p1, Ls8/g;->c:Ls8/l;

    .line 18
    .line 19
    iget-object v1, v1, Ls8/l;->a:Ljava/lang/String;

    .line 20
    .line 21
    iput-object v1, p0, LI8/b;->f:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p2, p0, LI8/b;->c:Ljava/util/concurrent/Executor;

    .line 24
    .line 25
    iput-object p4, p0, LI8/b;->d:Ljava/util/concurrent/Executor;

    .line 26
    .line 27
    invoke-virtual {p1}, Ls8/g;->a()V

    .line 28
    .line 29
    .line 30
    new-instance p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 31
    .line 32
    invoke-direct {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance p4, LC8/d;

    .line 36
    .line 37
    iget-object p1, p1, Ls8/g;->a:Landroid/content/Context;

    .line 38
    .line 39
    invoke-direct {p4, p1, p2}, LC8/d;-><init>(Landroid/content/Context;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p3, p4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, LI8/b;->a:Lcom/google/android/gms/tasks/Task;

    .line 50
    .line 51
    iput-object v0, p0, LI8/b;->b:LC8/i;

    .line 52
    .line 53
    new-instance p1, LC8/j;

    .line 54
    .line 55
    const/4 p2, 0x0

    .line 56
    invoke-direct {p1, p2}, LC8/j;-><init>(I)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, LI8/b;->e:LC8/j;

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final getToken()Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    new-instance v0, LI8/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LI8/a;-><init>(LI8/b;I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LI8/b;->a:Lcom/google/android/gms/tasks/Task;

    .line 8
    .line 9
    iget-object v2, p0, LI8/b;->c:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, LI8/a;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-direct {v1, p0, v3}, LI8/a;-><init>(LI8/b;I)V

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
