.class public final LC8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE8/a;


# instance fields
.field public final a:Ls8/g;

.field public final b:LO9/b;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public final e:LC8/l;

.field public final f:LC8/n;

.field public final g:Ljava/util/concurrent/Executor;

.field public final h:Ljava/util/concurrent/Executor;

.field public final i:Ljava/util/concurrent/Executor;

.field public final j:Lcom/google/android/gms/tasks/Task;

.field public final k:Lza/a;

.field public l:Lz8/a;

.field public m:LC8/b;

.field public n:Lcom/google/android/gms/tasks/Task;


# direct methods
.method public constructor <init>(Ls8/g;LO9/b;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, LC8/f;->a:Ls8/g;

    .line 11
    .line 12
    iput-object p2, p0, LC8/f;->b:LO9/b;

    .line 13
    .line 14
    new-instance p2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, LC8/f;->c:Ljava/util/ArrayList;

    .line 20
    .line 21
    new-instance p2, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, LC8/f;->d:Ljava/util/ArrayList;

    .line 27
    .line 28
    new-instance p2, LC8/l;

    .line 29
    .line 30
    invoke-virtual {p1}, Ls8/g;->a()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ls8/g;->g()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iget-object v1, p1, Ls8/g;->a:Landroid/content/Context;

    .line 41
    .line 42
    invoke-static {v1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance v2, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string v3, "com.google.firebase.appcheck.store."

    .line 51
    .line 52
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v2, LL8/p;

    .line 63
    .line 64
    new-instance v3, LC8/k;

    .line 65
    .line 66
    const/4 v4, 0x0

    .line 67
    invoke-direct {v3, v1, v4, v0}, LC8/k;-><init>(Landroid/content/Context;ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v2, v3}, LL8/p;-><init>(LO9/b;)V

    .line 71
    .line 72
    .line 73
    iput-object v2, p2, LC8/l;->a:LL8/p;

    .line 74
    .line 75
    iput-object p2, p0, LC8/f;->e:LC8/l;

    .line 76
    .line 77
    new-instance p2, LC8/n;

    .line 78
    .line 79
    invoke-virtual {p1}, Ls8/g;->a()V

    .line 80
    .line 81
    .line 82
    invoke-direct {p2, v1, p0, p4, p6}, LC8/n;-><init>(Landroid/content/Context;LC8/f;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 83
    .line 84
    .line 85
    iput-object p2, p0, LC8/f;->f:LC8/n;

    .line 86
    .line 87
    iput-object p3, p0, LC8/f;->g:Ljava/util/concurrent/Executor;

    .line 88
    .line 89
    iput-object p4, p0, LC8/f;->h:Ljava/util/concurrent/Executor;

    .line 90
    .line 91
    iput-object p5, p0, LC8/f;->i:Ljava/util/concurrent/Executor;

    .line 92
    .line 93
    new-instance p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 94
    .line 95
    invoke-direct {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 96
    .line 97
    .line 98
    new-instance p2, LC8/d;

    .line 99
    .line 100
    const/4 p3, 0x0

    .line 101
    invoke-direct {p2, p3, p0, p1}, LC8/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {p5, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iput-object p1, p0, LC8/f;->j:Lcom/google/android/gms/tasks/Task;

    .line 112
    .line 113
    new-instance p1, Lza/a;

    .line 114
    .line 115
    const/16 p2, 0xf

    .line 116
    .line 117
    invoke-direct {p1, p2}, Lza/a;-><init>(I)V

    .line 118
    .line 119
    .line 120
    iput-object p1, p0, LC8/f;->k:Lza/a;

    .line 121
    .line 122
    return-void
.end method


# virtual methods
.method public final a(Z)Lcom/google/android/gms/tasks/Task;
    .locals 2

    .line 1
    new-instance v0, LC8/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p0, p1}, LC8/e;-><init>(ILjava/lang/Object;Z)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LC8/f;->j:Lcom/google/android/gms/tasks/Task;

    .line 8
    .line 9
    iget-object v1, p0, LC8/f;->h:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final b()Z
    .locals 5

    .line 1
    iget-object v0, p0, LC8/f;->m:LC8/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v1, v0, LC8/b;->b:J

    .line 6
    .line 7
    iget-wide v3, v0, LC8/b;->c:J

    .line 8
    .line 9
    add-long/2addr v1, v3

    .line 10
    iget-object v0, p0, LC8/f;->k:Lza/a;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    sub-long/2addr v1, v3

    .line 20
    const-wide/32 v3, 0x493e0

    .line 21
    .line 22
    .line 23
    cmp-long v0, v1, v3

    .line 24
    .line 25
    if-lez v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    return v0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    return v0
.end method
