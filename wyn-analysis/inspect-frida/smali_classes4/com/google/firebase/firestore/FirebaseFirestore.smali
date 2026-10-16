.class public Lcom/google/firebase/firestore/FirebaseFirestore;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lm9/B;

.field public final b:Landroid/content/Context;

.field public final c:Ls9/f;

.field public final d:Ljava/lang/String;

.field public final e:Ln9/d;

.field public final f:Ln9/b;

.field public final g:Ls8/g;

.field public final h:Lm9/f0;

.field public final i:Lm9/I;

.field public j:Lm9/H;

.field public final k:LDd/c;

.field public final l:Lv9/h;

.field public m:Lcom/google/android/gms/ads/nativead/l;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ls9/f;Ljava/lang/String;Ln9/d;Ln9/b;Lm9/B;Ls8/g;Lm9/I;Lv9/h;)V
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
    iput-object p1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->b:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->c:Ls9/f;

    .line 10
    .line 11
    new-instance p1, Lm9/f0;

    .line 12
    .line 13
    invoke-direct {p1, p2}, Lm9/f0;-><init>(Ls9/f;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->h:Lm9/f0;

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iput-object p3, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->d:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p4, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->e:Ln9/d;

    .line 24
    .line 25
    iput-object p5, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->f:Ln9/b;

    .line 26
    .line 27
    iput-object p6, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->a:Lm9/B;

    .line 28
    .line 29
    new-instance p1, LDd/c;

    .line 30
    .line 31
    new-instance p2, Lm9/C;

    .line 32
    .line 33
    invoke-direct {p2, p0}, Lm9/C;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p1, p2}, LDd/c;-><init>(Lm9/C;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 40
    .line 41
    iput-object p7, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->g:Ls8/g;

    .line 42
    .line 43
    iput-object p8, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->i:Lm9/I;

    .line 44
    .line 45
    iput-object p9, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Lv9/h;

    .line 46
    .line 47
    new-instance p1, LA7/X;

    .line 48
    .line 49
    invoke-direct {p1}, LA7/X;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, LA7/X;->a()Lm9/H;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->j:Lm9/H;

    .line 57
    .line 58
    return-void
.end method

.method public static e(Ls8/g;Ljava/lang/String;)Lcom/google/firebase/firestore/FirebaseFirestore;
    .locals 7

    .line 1
    const-string v0, "Provided database name must not be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, LFe/c;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, Lm9/I;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ls8/g;->c(Ljava/lang/Class;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    move-object v5, p0

    .line 13
    check-cast v5, Lm9/I;

    .line 14
    .line 15
    const-string p0, "Firestore component is not present."

    .line 16
    .line 17
    invoke-static {v5, p0}, LFe/c;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    monitor-enter v5

    .line 21
    :try_start_0
    iget-object p0, v5, Lm9/I;->a:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 28
    .line 29
    if-nez p0, :cond_0

    .line 30
    .line 31
    iget-object v0, v5, Lm9/I;->c:Landroid/content/Context;

    .line 32
    .line 33
    iget-object v1, v5, Lm9/I;->b:Ls8/g;

    .line 34
    .line 35
    iget-object v2, v5, Lm9/I;->d:LL8/r;

    .line 36
    .line 37
    iget-object v3, v5, Lm9/I;->e:LL8/r;

    .line 38
    .line 39
    iget-object v6, v5, Lm9/I;->f:Lv9/h;

    .line 40
    .line 41
    move-object v4, p1

    .line 42
    invoke-static/range {v0 .. v6}, Lcom/google/firebase/firestore/FirebaseFirestore;->g(Landroid/content/Context;Ls8/g;LL8/r;LL8/r;Ljava/lang/String;Lm9/I;Lv9/h;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    iget-object p1, v5, Lm9/I;->a:Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-virtual {p1, v4, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    move-object p0, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    :goto_0
    monitor-exit v5

    .line 56
    return-object p0

    .line 57
    :goto_1
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw p0
.end method

.method public static g(Landroid/content/Context;Ls8/g;LL8/r;LL8/r;Ljava/lang/String;Lm9/I;Lv9/h;)Lcom/google/firebase/firestore/FirebaseFirestore;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ls8/g;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ls8/g;->c:Ls8/l;

    .line 5
    .line 6
    iget-object v0, v0, Ls8/l;->g:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v2, Ls9/f;

    .line 11
    .line 12
    invoke-direct {v2, v0, p4}, Ls9/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v4, Ln9/d;

    .line 16
    .line 17
    invoke-direct {v4, p2}, Ln9/d;-><init>(LL8/r;)V

    .line 18
    .line 19
    .line 20
    new-instance v5, Ln9/b;

    .line 21
    .line 22
    invoke-direct {v5, p3}, Ln9/b;-><init>(LL8/r;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ls8/g;->a()V

    .line 26
    .line 27
    .line 28
    new-instance v0, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 29
    .line 30
    new-instance v6, Lm9/B;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-direct {v6, v1}, Lm9/B;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iget-object v3, p1, Ls8/g;->b:Ljava/lang/String;

    .line 37
    .line 38
    move-object v1, p0

    .line 39
    move-object v7, p1

    .line 40
    move-object v8, p5

    .line 41
    move-object/from16 v9, p6

    .line 42
    .line 43
    invoke-direct/range {v0 .. v9}, Lcom/google/firebase/firestore/FirebaseFirestore;-><init>(Landroid/content/Context;Ls9/f;Ljava/lang/String;Ln9/d;Ln9/b;Lm9/B;Ls8/g;Lm9/I;Lv9/h;)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    const-string v1, "FirebaseOptions.getProjectId() cannot be null"

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0
.end method

.method public static setClientLanguage(Ljava/lang/String;)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    sput-object p0, Lv9/m;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/tasks/Task;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, LDd/c;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lp9/n;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    iget-object v1, v1, Lp9/n;->d:Lw9/e;

    .line 11
    .line 12
    iget-object v1, v1, Lw9/e;->a:Lw9/c;

    .line 13
    .line 14
    invoke-virtual {v1}, Lw9/c;->c()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v1, Lm9/G;

    .line 22
    .line 23
    sget-object v2, Lm9/F;->h:Lm9/F;

    .line 24
    .line 25
    const-string v3, "Persistence cannot be cleared while the firestore instance is running."

    .line 26
    .line 27
    invoke-direct {v1, v3, v2}, Lm9/G;-><init>(Ljava/lang/String;Lm9/F;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 31
    .line 32
    .line 33
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    monitor-exit v0

    .line 35
    return-object v1

    .line 36
    :cond_1
    :goto_0
    :try_start_1
    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 37
    .line 38
    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance v2, Lcom/applovin/impl/sdk/nativeAd/e;

    .line 42
    .line 43
    const/16 v3, 0x1c

    .line 44
    .line 45
    invoke-direct {v2, v3, p0, v1}, Lcom/applovin/impl/sdk/nativeAd/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v3, v0, LDd/c;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Lw9/e;

    .line 51
    .line 52
    iget-object v3, v3, Lw9/e;->a:Lw9/c;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    .line 57
    :try_start_2
    iget-object v3, v3, Lw9/c;->a:Lw9/a;

    .line 58
    .line 59
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catch_0
    :try_start_3
    const-class v2, Lw9/e;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    const/4 v3, 0x0

    .line 70
    new-array v3, v3, [Ljava/lang/Object;

    .line 71
    .line 72
    const-string v4, "Refused to enqueue task after panic"

    .line 73
    .line 74
    const/4 v5, 0x2

    .line 75
    invoke-static {v2, v4, v5, v3}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :goto_1
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 79
    .line 80
    .line 81
    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 82
    monitor-exit v0

    .line 83
    return-object v1

    .line 84
    :goto_2
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 85
    throw v1

    .line 86
    :catchall_0
    move-exception v1

    .line 87
    goto :goto_2
.end method

.method public final b(Ljava/lang/String;)Lm9/h;
    .locals 4

    .line 1
    const-string v0, "Provided collection path must not be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, LFe/c;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 7
    .line 8
    invoke-virtual {v0}, LDd/c;->C()V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lm9/h;

    .line 12
    .line 13
    invoke-static {p1}, Ls9/m;->l(Ljava/lang/String;)Ls9/m;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v1, Lp9/u;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v1, p1, v2}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1, p0}, Lm9/W;-><init>(Lp9/u;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p1, Ls9/e;->a:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    rem-int/lit8 v2, v2, 0x2

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    if-ne v2, v3, :cond_0

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v3, "Invalid collection reference. Collection references must have an odd number of segments, but "

    .line 43
    .line 44
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ls9/m;->c()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p1, " has "

    .line 55
    .line 56
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v0
.end method

.method public final c(Ljava/lang/String;)Lm9/W;
    .locals 3

    .line 1
    const-string v0, "Provided collection ID must not be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, LFe/c;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "/"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 15
    .line 16
    invoke-virtual {v0}, LDd/c;->C()V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lm9/W;

    .line 20
    .line 21
    new-instance v1, Lp9/u;

    .line 22
    .line 23
    sget-object v2, Ls9/m;->b:Ls9/m;

    .line 24
    .line 25
    invoke-direct {v1, v2, p1}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, p0}, Lm9/W;-><init>(Lp9/u;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    const-string v1, "Invalid collectionId \'"

    .line 35
    .line 36
    const-string v2, "\'. Collection IDs must not contain \'/\'."

    .line 37
    .line 38
    invoke-static {v1, p1, v2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0
.end method

.method public final d(Ljava/lang/String;)Lm9/m;
    .locals 4

    .line 1
    const-string v0, "Provided document path must not be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, LFe/c;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 7
    .line 8
    invoke-virtual {v0}, LDd/c;->C()V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Ls9/m;->l(Ljava/lang/String;)Ls9/m;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p1, Ls9/e;->a:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    rem-int/lit8 v1, v1, 0x2

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    new-instance v0, Lm9/m;

    .line 26
    .line 27
    new-instance v1, Ls9/h;

    .line 28
    .line 29
    invoke-direct {v1, p1}, Ls9/h;-><init>(Ls9/m;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1, p0}, Lm9/m;-><init>(Ls9/h;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 37
    .line 38
    new-instance v2, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v3, "Invalid document reference. Document references must have an even number of segments, but "

    .line 41
    .line 42
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ls9/m;->c()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p1, " has "

    .line 53
    .line 54
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v1
.end method

.method public final f(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0}, LDd/c;->C()V

    .line 5
    .line 6
    .line 7
    iget-object v1, v0, LDd/c;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lp9/n;

    .line 10
    .line 11
    invoke-virtual {v1}, Lp9/n;->e()V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 15
    .line 16
    invoke-direct {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lcom/applovin/impl/mediation/ads/f;

    .line 20
    .line 21
    const/16 v4, 0x1d

    .line 22
    .line 23
    invoke-direct {v3, v1, p1, v2, v4}, Lcom/applovin/impl/mediation/ads/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    iget-object p1, v1, Lp9/n;->d:Lw9/e;

    .line 27
    .line 28
    invoke-virtual {p1, v3}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 32
    .line 33
    .line 34
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    monitor-exit v0

    .line 36
    new-instance v0, Lm9/C;

    .line 37
    .line 38
    invoke-direct {v0, p0}, Lm9/C;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->continueWith(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw p1
.end method

.method public final h(Lm9/H;)V
    .locals 2

    .line 1
    const-string v0, "Provided settings must not be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, LFe/c;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->c:Ls9/f;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 10
    .line 11
    iget-object v1, v1, LDd/c;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lp9/n;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-eqz v1, :cond_2

    .line 21
    .line 22
    iget-object v1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->j:Lm9/H;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lm9/H;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v1, "FirebaseFirestore has already been started and its settings can no longer be changed. You can only call setFirestoreSettings() before calling any other methods on a FirebaseFirestore object."

    .line 34
    .line 35
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    :goto_1
    iput-object p1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->j:Lm9/H;

    .line 42
    .line 43
    monitor-exit v0

    .line 44
    return-void

    .line 45
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    throw p1
.end method

.method public final i(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 2
    .line 3
    invoke-virtual {v0}, LDd/c;->C()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->j:Lm9/H;

    .line 7
    .line 8
    iget-object v1, v0, Lm9/H;->e:Lm9/P;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    instance-of v0, v1, Lm9/T;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-boolean v0, v0, Lm9/H;->c:Z

    .line 16
    .line 17
    :goto_0
    const-string v1, "Cannot enable indexes when persistence is disabled"

    .line 18
    .line 19
    if-eqz v0, :cond_5

    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 27
    .line 28
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string p1, "indexes"

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_4

    .line 38
    .line 39
    const-string p1, "indexes"

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const/4 v1, 0x0

    .line 46
    move v2, v1

    .line 47
    :goto_1
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-ge v2, v3, :cond_4

    .line 52
    .line 53
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const-string v4, "collectionGroup"

    .line 58
    .line 59
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    new-instance v5, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v6, "fields"

    .line 69
    .line 70
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    move v6, v1

    .line 75
    :goto_2
    if-eqz v3, :cond_3

    .line 76
    .line 77
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-ge v6, v7, :cond_3

    .line 82
    .line 83
    invoke-virtual {v3, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    const-string v8, "fieldPath"

    .line 88
    .line 89
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-static {v8}, Ls9/j;->l(Ljava/lang/String;)Ls9/j;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    const-string v9, "CONTAINS"

    .line 98
    .line 99
    const-string v10, "arrayConfig"

    .line 100
    .line 101
    invoke-virtual {v7, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    if-eqz v9, :cond_1

    .line 110
    .line 111
    new-instance v7, Ls9/d;

    .line 112
    .line 113
    const/4 v9, 0x3

    .line 114
    invoke-direct {v7, v9, v8}, Ls9/d;-><init>(ILs9/j;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :catch_0
    move-exception p1

    .line 122
    goto :goto_4

    .line 123
    :cond_1
    const-string v9, "ASCENDING"

    .line 124
    .line 125
    const-string v10, "order"

    .line 126
    .line 127
    invoke-virtual {v7, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    if-eqz v7, :cond_2

    .line 136
    .line 137
    new-instance v7, Ls9/d;

    .line 138
    .line 139
    const/4 v9, 0x1

    .line 140
    invoke-direct {v7, v9, v8}, Ls9/d;-><init>(ILs9/j;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_2
    new-instance v7, Ls9/d;

    .line 148
    .line 149
    const/4 v9, 0x2

    .line 150
    invoke-direct {v7, v9, v8}, Ls9/d;-><init>(ILs9/j;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_3
    sget-object v3, Ls9/a;->e:Ls9/c;

    .line 160
    .line 161
    new-instance v6, Ls9/a;

    .line 162
    .line 163
    const/4 v7, -0x1

    .line 164
    invoke-direct {v6, v7, v4, v5, v3}, Ls9/a;-><init>(ILjava/lang/String;Ljava/util/ArrayList;Ls9/c;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    .line 169
    .line 170
    add-int/lit8 v2, v2, 0x1

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_4
    iget-object p1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 174
    .line 175
    monitor-enter p1

    .line 176
    :try_start_1
    invoke-virtual {p1}, LDd/c;->C()V

    .line 177
    .line 178
    .line 179
    iget-object v1, p1, LDd/c;->c:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v1, Lp9/n;

    .line 182
    .line 183
    invoke-virtual {v1}, Lp9/n;->e()V

    .line 184
    .line 185
    .line 186
    new-instance v2, Lng/a;

    .line 187
    .line 188
    const/4 v3, 0x4

    .line 189
    invoke-direct {v2, v3, v1, v0}, Lng/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    iget-object v0, v1, Lp9/n;->d:Lw9/e;

    .line 193
    .line 194
    invoke-virtual {v0, v2}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 195
    .line 196
    .line 197
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 198
    monitor-exit p1

    .line 199
    return-object v0

    .line 200
    :catchall_0
    move-exception v0

    .line 201
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 202
    throw v0

    .line 203
    :goto_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 204
    .line 205
    const-string v1, "Failed to parse index configuration"

    .line 206
    .line 207
    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 208
    .line 209
    .line 210
    throw v0

    .line 211
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 212
    .line 213
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw p1
.end method

.method public final j()Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->i:Lm9/I;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->c:Ls9/f;

    .line 4
    .line 5
    iget-object v1, v1, Ls9/f;->b:Ljava/lang/String;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v2, v0, Lm9/I;->a:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 15
    .line 16
    invoke-virtual {v0}, LDd/c;->S()Lcom/google/android/gms/tasks/Task;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v1
.end method

.method public final k(Lm9/m;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lm9/m;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 2
    .line 3
    if-ne p1, p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    const-string v0, "Provided document reference is from a different Cloud Firestore instance."

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public final l()Lcom/google/android/gms/tasks/Task;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0}, LDd/c;->C()V

    .line 5
    .line 6
    .line 7
    iget-object v1, v0, LDd/c;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lp9/n;

    .line 10
    .line 11
    invoke-virtual {v1}, Lp9/n;->e()V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 15
    .line 16
    invoke-direct {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lng/a;

    .line 20
    .line 21
    const/4 v4, 0x3

    .line 22
    invoke-direct {v3, v4, v1, v2}, Lng/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, v1, Lp9/n;->d:Lw9/e;

    .line 26
    .line 27
    invoke-virtual {v1, v3}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 31
    .line 32
    .line 33
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    monitor-exit v0

    .line 35
    return-object v1

    .line 36
    :catchall_0
    move-exception v1

    .line 37
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    throw v1
.end method
