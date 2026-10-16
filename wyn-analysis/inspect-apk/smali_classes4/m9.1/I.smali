.class public final Lm9/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/h;


# instance fields
.field public final a:Ljava/util/HashMap;

.field public final b:Ls8/g;

.field public final c:Landroid/content/Context;

.field public final d:LL8/r;

.field public final e:LL8/r;

.field public final f:Lv9/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ls8/g;LL8/r;LL8/r;Lv9/h;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lm9/I;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    iput-object p1, p0, Lm9/I;->c:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p2, p0, Lm9/I;->b:Ls8/g;

    .line 14
    .line 15
    iput-object p3, p0, Lm9/I;->d:LL8/r;

    .line 16
    .line 17
    iput-object p4, p0, Lm9/I;->e:LL8/r;

    .line 18
    .line 19
    iput-object p5, p0, Lm9/I;->f:Lv9/h;

    .line 20
    .line 21
    invoke-virtual {p2}, Ls8/g;->a()V

    .line 22
    .line 23
    .line 24
    iget-object p1, p2, Ls8/g;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, p0, Lm9/I;->a:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/util/Map$Entry;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 35
    .line 36
    invoke-virtual {v3}, Lcom/google/firebase/firestore/FirebaseFirestore;->j()Lcom/google/android/gms/tasks/Task;

    .line 37
    .line 38
    .line 39
    iget-object v3, p0, Lm9/I;->a:Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    xor-int/2addr v3, v0

    .line 50
    const-string v4, "terminate() should have removed its entry from `instances` for key: %s"

    .line 51
    .line 52
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-array v5, v0, [Ljava/lang/Object;

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    aput-object v2, v5, v6

    .line 60
    .line 61
    invoke-static {v3, v4, v5}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    monitor-exit p0

    .line 68
    return-void

    .line 69
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    throw v0
.end method
