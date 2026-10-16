.class public final synthetic LJ9/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLe/c;
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LJ9/B;->a:Ljava/lang/Object;

    iput-object p2, p0, LJ9/B;->b:Ljava/lang/Object;

    iput-object p3, p0, LJ9/B;->c:Ljava/lang/Object;

    iput-object p4, p0, LJ9/B;->d:Ljava/lang/Object;

    iput-object p5, p0, LJ9/B;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    check-cast p1, Lta/o;

    .line 5
    .line 6
    iget-object v3, p0, LJ9/B;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v3, LJ9/C;

    .line 9
    .line 10
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lta/o;->e()Lcom/google/protobuf/Internal$ProtobufList;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget v4, LHe/c;->a:I

    .line 18
    .line 19
    const-string v4, "source is null"

    .line 20
    .line 21
    invoke-static {p1, v4}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance v4, LRe/m;

    .line 25
    .line 26
    invoke-direct {v4, p1, v1}, LRe/m;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    new-instance p1, LJ9/w;

    .line 30
    .line 31
    invoke-direct {p1, v3, v1}, LJ9/w;-><init>(LJ9/C;I)V

    .line 32
    .line 33
    .line 34
    new-instance v1, LRe/x;

    .line 35
    .line 36
    invoke-direct {v1, v4, p1, v2}, LRe/x;-><init>(LHe/c;Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    new-instance p1, LJ9/y;

    .line 40
    .line 41
    iget-object v4, p0, LJ9/B;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v4, Ljava/lang/String;

    .line 44
    .line 45
    invoke-direct {p1, v4, v2}, LJ9/y;-><init>(Ljava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    new-instance v5, LRe/x;

    .line 49
    .line 50
    invoke-direct {v5, v1, p1, v2}, LRe/x;-><init>(LHe/c;Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, LJ9/B;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, LJ9/w;

    .line 56
    .line 57
    invoke-virtual {v5, p1}, LHe/c;->b(LLe/c;)LRe/B;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object v1, p0, LJ9/B;->d:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, LJ9/z;

    .line 64
    .line 65
    invoke-virtual {p1, v1}, LHe/c;->b(LLe/c;)LRe/B;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget-object v1, p0, LJ9/B;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, LJ9/x;

    .line 72
    .line 73
    invoke-virtual {p1, v1}, LHe/c;->b(LLe/c;)LRe/B;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    new-instance v1, LA0/f;

    .line 78
    .line 79
    invoke-direct {v1, v0}, LA0/f;-><init>(I)V

    .line 80
    .line 81
    .line 82
    new-instance v5, LRe/x;

    .line 83
    .line 84
    invoke-direct {v5, p1}, LRe/x;-><init>(LRe/B;)V

    .line 85
    .line 86
    .line 87
    new-instance p1, LY9/c;

    .line 88
    .line 89
    const/16 v6, 0x13

    .line 90
    .line 91
    invoke-direct {p1, v1, v6}, LY9/c;-><init>(Ljava/lang/Object;I)V

    .line 92
    .line 93
    .line 94
    new-instance v1, LRe/x;

    .line 95
    .line 96
    invoke-direct {v1, v5, p1, v0}, LRe/x;-><init>(LHe/c;Ljava/lang/Object;I)V

    .line 97
    .line 98
    .line 99
    sget p1, LHe/c;->a:I

    .line 100
    .line 101
    const-string v0, "bufferSize"

    .line 102
    .line 103
    invoke-static {p1, v0}, LNe/b;->b(ILjava/lang/String;)V

    .line 104
    .line 105
    .line 106
    new-instance v0, LRe/B;

    .line 107
    .line 108
    invoke-direct {v0, v1, p1}, LRe/B;-><init>(LRe/x;I)V

    .line 109
    .line 110
    .line 111
    new-instance p1, LRe/t;

    .line 112
    .line 113
    invoke-direct {p1, v0}, LRe/t;-><init>(LRe/B;)V

    .line 114
    .line 115
    .line 116
    new-instance v0, LJ9/z;

    .line 117
    .line 118
    invoke-direct {v0, v3, v4, v2}, LJ9/z;-><init>(LJ9/C;Ljava/lang/String;I)V

    .line 119
    .line 120
    .line 121
    new-instance v1, LSe/j;

    .line 122
    .line 123
    invoke-direct {v1, p1, v0, v2}, LSe/j;-><init>(LHe/g;LLe/c;I)V

    .line 124
    .line 125
    .line 126
    return-object v1
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object p1, p0, LJ9/B;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/util/Date;

    .line 4
    .line 5
    iget-object v0, p0, LJ9/B;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/HashMap;

    .line 8
    .line 9
    iget-object v1, p0, LJ9/B;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Laa/h;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, LJ9/B;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lcom/google/android/gms/tasks/Task;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    new-instance p1, LZ9/e;

    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "Firebase Installations failed to get installation ID for fetch."

    .line 33
    .line 34
    invoke-direct {p1, v1, v0}, Ls8/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_0
    iget-object v3, p0, LJ9/B;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Lcom/google/android/gms/tasks/Task;

    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-nez v4, :cond_1

    .line 51
    .line 52
    new-instance p1, LZ9/e;

    .line 53
    .line 54
    invoke-virtual {v3}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v1, "Firebase Installations failed to get installation auth token for fetch."

    .line 59
    .line 60
    invoke-direct {p1, v1, v0}, Ls8/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v3}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, LP9/a;

    .line 79
    .line 80
    iget-object v3, v3, LP9/a;->a:Ljava/lang/String;

    .line 81
    .line 82
    :try_start_0
    invoke-virtual {v1, v2, v3, p1, v0}, Laa/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/HashMap;)Laa/g;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iget v0, p1, Laa/g;->a:I

    .line 87
    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :catch_0
    move-exception p1

    .line 96
    goto :goto_0

    .line 97
    :cond_2
    iget-object v0, v1, Laa/h;->e:Laa/c;

    .line 98
    .line 99
    iget-object v2, p1, Laa/g;->b:Laa/e;

    .line 100
    .line 101
    invoke-virtual {v0, v2}, Laa/c;->e(Laa/e;)Lcom/google/android/gms/tasks/Task;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v1, v1, Laa/h;->c:Ljava/util/concurrent/Executor;

    .line 106
    .line 107
    new-instance v2, LS8/b;

    .line 108
    .line 109
    const/16 v3, 0x13

    .line 110
    .line 111
    invoke-direct {v2, p1, v3}, LS8/b;-><init>(Ljava/lang/Object;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 115
    .line 116
    .line 117
    move-result-object p1
    :try_end_0
    .catch LZ9/f; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    return-object p1

    .line 119
    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1
.end method
