.class public final LG8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz8/a;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/google/android/play/core/integrity/IntegrityManager;

.field public final c:LC8/i;

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:LC8/j;


# direct methods
.method public constructor <init>(Ls8/g;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ls8/g;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ls8/g;->c:Ls8/l;

    .line 5
    .line 6
    iget-object v0, v0, Ls8/l;->e:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1}, Ls8/g;->a()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p1, Ls8/g;->a:Landroid/content/Context;

    .line 12
    .line 13
    invoke-static {v1}, Lcom/google/android/play/core/integrity/IntegrityManagerFactory;->create(Landroid/content/Context;)Lcom/google/android/play/core/integrity/IntegrityManager;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, LC8/i;

    .line 18
    .line 19
    invoke-direct {v2, p1}, LC8/i;-><init>(Ls8/g;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, LC8/j;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-direct {p1, v3}, LC8/j;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, LG8/d;->a:Ljava/lang/String;

    .line 32
    .line 33
    iput-object v1, p0, LG8/d;->b:Lcom/google/android/play/core/integrity/IntegrityManager;

    .line 34
    .line 35
    iput-object v2, p0, LG8/d;->c:LC8/i;

    .line 36
    .line 37
    iput-object p2, p0, LG8/d;->d:Ljava/util/concurrent/Executor;

    .line 38
    .line 39
    iput-object p3, p0, LG8/d;->e:Ljava/util/concurrent/Executor;

    .line 40
    .line 41
    iput-object p1, p0, LG8/d;->f:LC8/j;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final getToken()Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    new-instance v0, Lx9/d;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lx9/d;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, LG8/c;

    .line 9
    .line 10
    invoke-direct {v1, p0, v0}, LG8/c;-><init>(LG8/d;Lx9/d;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, LG8/d;->e:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, LG8/b;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v1, p0, v2}, LG8/b;-><init>(LG8/d;I)V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, LG8/d;->d:Ljava/util/concurrent/Executor;

    .line 26
    .line 27
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, LG8/b;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-direct {v1, p0, v3}, LG8/b;-><init>(LG8/d;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v1, LF5/d;

    .line 42
    .line 43
    const/16 v3, 0x8

    .line 44
    .line 45
    invoke-direct {v1, v3}, LF5/d;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0
.end method
