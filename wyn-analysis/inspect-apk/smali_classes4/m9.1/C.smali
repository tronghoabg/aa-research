.class public final synthetic Lm9/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw9/m;
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:Lcom/google/firebase/firestore/FirebaseFirestore;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/FirebaseFirestore;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm9/C;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lm9/C;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 2
    .line 3
    move-object v6, p1

    .line 4
    check-cast v6, Lw9/e;

    .line 5
    .line 6
    iget-object p1, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:LDd/c;

    .line 7
    .line 8
    monitor-enter p1

    .line 9
    :try_start_0
    new-instance v3, LA7/b0;

    .line 10
    .line 11
    iget-object v1, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->c:Ls9/f;

    .line 12
    .line 13
    iget-object v2, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->d:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v4, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->j:Lm9/H;

    .line 16
    .line 17
    iget-object v5, v4, Lm9/H;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-boolean v7, v4, Lm9/H;->b:Z

    .line 20
    .line 21
    invoke-direct {v3, v1, v2, v5, v7}, LA7/b0;-><init>(Ls9/f;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lp9/n;

    .line 25
    .line 26
    iget-object v2, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->b:Landroid/content/Context;

    .line 27
    .line 28
    move-object v5, v4

    .line 29
    iget-object v4, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->e:Ln9/d;

    .line 30
    .line 31
    move-object v7, v5

    .line 32
    iget-object v5, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->f:Ln9/b;

    .line 33
    .line 34
    move-object v8, v7

    .line 35
    iget-object v7, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Lv9/h;

    .line 36
    .line 37
    iget-object v0, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->a:Lm9/B;

    .line 38
    .line 39
    invoke-virtual {v0, v8}, Lm9/B;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    move-object v8, v0

    .line 44
    check-cast v8, Lp9/s;

    .line 45
    .line 46
    invoke-direct/range {v1 .. v8}, Lp9/n;-><init>(Landroid/content/Context;LA7/b0;Ln9/d;Ln9/b;Lw9/e;Lv9/h;Lp9/s;)V

    .line 47
    .line 48
    .line 49
    monitor-exit p1

    .line 50
    return-object v1

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    throw v0
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lm9/C;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lp9/u;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    new-instance v1, Lm9/W;

    .line 15
    .line 16
    invoke-direct {v1, p1, v0}, Lm9/W;-><init>(Lp9/u;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return-object p1
.end method
