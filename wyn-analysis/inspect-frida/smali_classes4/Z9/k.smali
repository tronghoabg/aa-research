.class public final LZ9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lca/a;


# static fields
.field public static final j:Ljava/util/Random;

.field public static final k:Ljava/util/HashMap;


# instance fields
.field public final a:Ljava/util/HashMap;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/util/concurrent/ScheduledExecutorService;

.field public final d:Ls8/g;

.field public final e:LP9/d;

.field public final f:Lt8/c;

.field public final g:LO9/b;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Random;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LZ9/k;->j:Ljava/util/Random;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LZ9/k;->k:Ljava/util/HashMap;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Ls8/g;LP9/d;Lt8/c;LO9/b;)V
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
    iput-object v0, p0, LZ9/k;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LZ9/k;->i:Ljava/util/HashMap;

    .line 17
    .line 18
    iput-object p1, p0, LZ9/k;->b:Landroid/content/Context;

    .line 19
    .line 20
    iput-object p2, p0, LZ9/k;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 21
    .line 22
    iput-object p3, p0, LZ9/k;->d:Ls8/g;

    .line 23
    .line 24
    iput-object p4, p0, LZ9/k;->e:LP9/d;

    .line 25
    .line 26
    iput-object p5, p0, LZ9/k;->f:Lt8/c;

    .line 27
    .line 28
    iput-object p6, p0, LZ9/k;->g:LO9/b;

    .line 29
    .line 30
    invoke-virtual {p3}, Ls8/g;->a()V

    .line 31
    .line 32
    .line 33
    iget-object p3, p3, Ls8/g;->c:Ls8/l;

    .line 34
    .line 35
    iget-object p3, p3, Ls8/l;->b:Ljava/lang/String;

    .line 36
    .line 37
    iput-object p3, p0, LZ9/k;->h:Ljava/lang/String;

    .line 38
    .line 39
    sget-object p3, LZ9/j;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Landroid/app/Application;

    .line 46
    .line 47
    sget-object p3, LZ9/j;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 48
    .line 49
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p4

    .line 53
    if-nez p4, :cond_2

    .line 54
    .line 55
    new-instance p4, LZ9/j;

    .line 56
    .line 57
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    :cond_0
    const/4 p5, 0x0

    .line 61
    invoke-virtual {p3, p5, p4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p5

    .line 65
    if-eqz p5, :cond_1

    .line 66
    .line 67
    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/d;->c(Landroid/app/Application;)V

    .line 68
    .line 69
    .line 70
    sget-object p1, Lcom/google/android/gms/common/api/internal/d;->e:Lcom/google/android/gms/common/api/internal/d;

    .line 71
    .line 72
    invoke-virtual {p1, p4}, Lcom/google/android/gms/common/api/internal/d;->a(Lcom/google/android/gms/common/api/internal/c;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p5

    .line 80
    if-eqz p5, :cond_0

    .line 81
    .line 82
    :cond_2
    :goto_0
    new-instance p1, LG8/c;

    .line 83
    .line 84
    const/16 p3, 0x8

    .line 85
    .line 86
    invoke-direct {p1, p0, p3}, LG8/c;-><init>(Ljava/lang/Object;I)V

    .line 87
    .line 88
    .line 89
    invoke-static {p2, p1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 90
    .line 91
    .line 92
    return-void
.end method


# virtual methods
.method public final declared-synchronized a()LZ9/d;
    .locals 14

    .line 1
    const-string v0, "_firebase_settings"

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    const-string v1, "fetch"

    .line 5
    .line 6
    invoke-virtual {p0, v1}, LZ9/k;->c(Ljava/lang/String;)Laa/c;

    .line 7
    .line 8
    .line 9
    move-result-object v7

    .line 10
    const-string v1, "activate"

    .line 11
    .line 12
    invoke-virtual {p0, v1}, LZ9/k;->c(Ljava/lang/String;)Laa/c;

    .line 13
    .line 14
    .line 15
    move-result-object v8

    .line 16
    const-string v1, "defaults"

    .line 17
    .line 18
    invoke-virtual {p0, v1}, LZ9/k;->c(Ljava/lang/String;)Laa/c;

    .line 19
    .line 20
    .line 21
    move-result-object v9

    .line 22
    iget-object v1, p0, LZ9/k;->b:Landroid/content/Context;

    .line 23
    .line 24
    iget-object v2, p0, LZ9/k;->h:Ljava/lang/String;

    .line 25
    .line 26
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v4, "frc_"

    .line 29
    .line 30
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v12, Laa/k;

    .line 49
    .line 50
    invoke-direct {v12, v0}, Laa/k;-><init>(Landroid/content/SharedPreferences;)V

    .line 51
    .line 52
    .line 53
    new-instance v11, Laa/i;

    .line 54
    .line 55
    iget-object v0, p0, LZ9/k;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 56
    .line 57
    invoke-direct {v11, v0, v8, v9}, Laa/i;-><init>(Ljava/util/concurrent/Executor;Laa/c;Laa/c;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, LZ9/k;->d:Ls8/g;

    .line 61
    .line 62
    iget-object v1, p0, LZ9/k;->g:LO9/b;

    .line 63
    .line 64
    invoke-virtual {v0}, Ls8/g;->a()V

    .line 65
    .line 66
    .line 67
    const-string v2, "[DEFAULT]"

    .line 68
    .line 69
    iget-object v0, v0, Ls8/g;->b:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    new-instance v0, LX2/j;

    .line 78
    .line 79
    invoke-direct {v0, v1}, LX2/j;-><init>(LO9/b;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    const/4 v0, 0x0

    .line 84
    :goto_0
    if-eqz v0, :cond_1

    .line 85
    .line 86
    new-instance v1, LZ9/i;

    .line 87
    .line 88
    invoke-direct {v1, v0}, LZ9/i;-><init>(LX2/j;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v11, v1}, Laa/i;->a(LZ9/i;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    move-object v2, p0

    .line 97
    goto :goto_2

    .line 98
    :cond_1
    :goto_1
    new-instance v0, Lba/a;

    .line 99
    .line 100
    const/4 v1, 0x0

    .line 101
    invoke-direct {v0, v1}, Lba/a;-><init>(I)V

    .line 102
    .line 103
    .line 104
    iput-object v8, v0, Lba/a;->b:Ljava/lang/Object;

    .line 105
    .line 106
    iput-object v9, v0, Lba/a;->c:Ljava/lang/Object;

    .line 107
    .line 108
    new-instance v13, LVa/Za;

    .line 109
    .line 110
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 111
    .line 112
    .line 113
    new-instance v1, Lj$/util/concurrent/ConcurrentHashMap;

    .line 114
    .line 115
    invoke-direct {v1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iput-object v1, v13, LVa/Za;->d:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v8, v13, LVa/Za;->a:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v0, v13, LVa/Za;->b:Ljava/lang/Object;

    .line 127
    .line 128
    iget-object v6, p0, LZ9/k;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 129
    .line 130
    iput-object v6, v13, LVa/Za;->c:Ljava/lang/Object;

    .line 131
    .line 132
    iget-object v3, p0, LZ9/k;->d:Ls8/g;

    .line 133
    .line 134
    iget-object v4, p0, LZ9/k;->e:LP9/d;

    .line 135
    .line 136
    iget-object v5, p0, LZ9/k;->f:Lt8/c;

    .line 137
    .line 138
    invoke-virtual {p0, v7, v12}, LZ9/k;->d(Laa/c;Laa/k;)Laa/h;

    .line 139
    .line 140
    .line 141
    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    move-object v2, p0

    .line 143
    :try_start_1
    invoke-virtual/range {v2 .. v13}, LZ9/k;->b(Ls8/g;LP9/d;Lt8/c;Ljava/util/concurrent/Executor;Laa/c;Laa/c;Laa/c;Laa/h;Laa/i;Laa/k;LVa/Za;)LZ9/d;

    .line 144
    .line 145
    .line 146
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 147
    monitor-exit p0

    .line 148
    return-object v0

    .line 149
    :catchall_1
    move-exception v0

    .line 150
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 151
    throw v0
.end method

.method public final declared-synchronized b(Ls8/g;LP9/d;Lt8/c;Ljava/util/concurrent/Executor;Laa/c;Laa/c;Laa/c;Laa/h;Laa/i;Laa/k;LVa/Za;)LZ9/d;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "firebase"

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v2, v1, LZ9/k;->a:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    new-instance v8, LZ9/d;

    .line 15
    .line 16
    iget-object v9, v1, LZ9/k;->b:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual/range {p1 .. p1}, Ls8/g;->a()V

    .line 19
    .line 20
    .line 21
    const-string v2, "[DEFAULT]"

    .line 22
    .line 23
    move-object/from16 v3, p1

    .line 24
    .line 25
    iget-object v4, v3, Ls8/g;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    move-object/from16 v10, p3

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v2, 0x0

    .line 37
    move-object v10, v2

    .line 38
    :goto_0
    iget-object v6, v1, LZ9/k;->b:Landroid/content/Context;

    .line 39
    .line 40
    move-object/from16 v5, p6

    .line 41
    .line 42
    move-object/from16 v4, p8

    .line 43
    .line 44
    move-object/from16 v7, p10

    .line 45
    .line 46
    move-object v2, v3

    .line 47
    move-object/from16 v3, p2

    .line 48
    .line 49
    invoke-virtual/range {v1 .. v7}, LZ9/k;->e(Ls8/g;LP9/d;Laa/h;Laa/c;Landroid/content/Context;Laa/k;)LVa/Y7;

    .line 50
    .line 51
    .line 52
    move-result-object v14

    .line 53
    move-object/from16 v5, p2

    .line 54
    .line 55
    move-object/from16 v7, p4

    .line 56
    .line 57
    move-object/from16 v11, p8

    .line 58
    .line 59
    move-object/from16 v12, p9

    .line 60
    .line 61
    move-object/from16 v13, p10

    .line 62
    .line 63
    move-object/from16 v15, p11

    .line 64
    .line 65
    move-object v3, v8

    .line 66
    move-object v4, v9

    .line 67
    move-object v6, v10

    .line 68
    move-object/from16 v8, p5

    .line 69
    .line 70
    move-object/from16 v9, p6

    .line 71
    .line 72
    move-object/from16 v10, p7

    .line 73
    .line 74
    invoke-direct/range {v3 .. v15}, LZ9/d;-><init>(Landroid/content/Context;LP9/d;Lt8/c;Ljava/util/concurrent/Executor;Laa/c;Laa/c;Laa/c;Laa/h;Laa/i;Laa/k;LVa/Y7;LVa/Za;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual/range {p6 .. p6}, Laa/c;->b()Lcom/google/android/gms/tasks/Task;

    .line 78
    .line 79
    .line 80
    invoke-virtual/range {p7 .. p7}, Laa/c;->b()Lcom/google/android/gms/tasks/Task;

    .line 81
    .line 82
    .line 83
    invoke-virtual/range {p5 .. p5}, Laa/c;->b()Lcom/google/android/gms/tasks/Task;

    .line 84
    .line 85
    .line 86
    iget-object v2, v1, LZ9/k;->a:Ljava/util/HashMap;

    .line 87
    .line 88
    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    sget-object v2, LZ9/k;->k:Ljava/util/HashMap;

    .line 92
    .line 93
    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :catchall_0
    move-exception v0

    .line 98
    goto :goto_2

    .line 99
    :cond_1
    :goto_1
    iget-object v2, v1, LZ9/k;->a:Ljava/util/HashMap;

    .line 100
    .line 101
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, LZ9/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    .line 107
    monitor-exit p0

    .line 108
    return-object v0

    .line 109
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    throw v0
.end method

.method public final c(Ljava/lang/String;)Laa/c;
    .locals 5

    .line 1
    iget-object v0, p0, LZ9/k;->h:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "frc_"

    .line 4
    .line 5
    const-string v2, "_firebase_"

    .line 6
    .line 7
    const-string v3, ".json"

    .line 8
    .line 9
    invoke-static {v1, v0, v2, p1, v3}, LR8/v;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, LZ9/k;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 14
    .line 15
    iget-object v1, p0, LZ9/k;->b:Landroid/content/Context;

    .line 16
    .line 17
    sget-object v2, Laa/o;->c:Ljava/util/HashMap;

    .line 18
    .line 19
    const-class v2, Laa/o;

    .line 20
    .line 21
    monitor-enter v2

    .line 22
    :try_start_0
    sget-object v3, Laa/o;->c:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    new-instance v4, Laa/o;

    .line 31
    .line 32
    invoke-direct {v4, v1, p1}, Laa/o;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    :goto_0
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Laa/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    monitor-exit v2

    .line 48
    invoke-static {v0, p1}, Laa/c;->d(Ljava/util/concurrent/Executor;Laa/o;)Laa/c;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :goto_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    throw p1
.end method

.method public final declared-synchronized d(Laa/c;Laa/k;)Laa/h;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v9, p2

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    new-instance v2, Laa/h;

    .line 7
    .line 8
    iget-object v3, v1, LZ9/k;->e:LP9/d;

    .line 9
    .line 10
    iget-object v0, v1, LZ9/k;->d:Ls8/g;

    .line 11
    .line 12
    invoke-virtual {v0}, Ls8/g;->a()V

    .line 13
    .line 14
    .line 15
    const-string v4, "[DEFAULT]"

    .line 16
    .line 17
    iget-object v0, v0, Ls8/g;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, v1, LZ9/k;->g:LO9/b;

    .line 26
    .line 27
    :goto_0
    move-object v4, v0

    .line 28
    goto :goto_1

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto :goto_2

    .line 31
    :cond_0
    new-instance v0, LL8/g;

    .line 32
    .line 33
    const/4 v4, 0x7

    .line 34
    invoke-direct {v0, v4}, LL8/g;-><init>(I)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :goto_1
    iget-object v5, v1, LZ9/k;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 39
    .line 40
    sget-object v6, LZ9/k;->j:Ljava/util/Random;

    .line 41
    .line 42
    iget-object v0, v1, LZ9/k;->d:Ls8/g;

    .line 43
    .line 44
    invoke-virtual {v0}, Ls8/g;->a()V

    .line 45
    .line 46
    .line 47
    iget-object v0, v0, Ls8/g;->c:Ls8/l;

    .line 48
    .line 49
    iget-object v13, v0, Ls8/l;->a:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v0, v1, LZ9/k;->d:Ls8/g;

    .line 52
    .line 53
    invoke-virtual {v0}, Ls8/g;->a()V

    .line 54
    .line 55
    .line 56
    iget-object v0, v0, Ls8/g;->c:Ls8/l;

    .line 57
    .line 58
    iget-object v12, v0, Ls8/l;->b:Ljava/lang/String;

    .line 59
    .line 60
    new-instance v8, Lcom/google/firebase/remoteconfig/internal/ConfigFetchHttpClient;

    .line 61
    .line 62
    const-string v0, "fetch_timeout_in_seconds"

    .line 63
    .line 64
    iget-object v7, v9, Laa/k;->a:Landroid/content/SharedPreferences;

    .line 65
    .line 66
    const-wide/16 v10, 0x3c

    .line 67
    .line 68
    invoke-interface {v7, v0, v10, v11}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 69
    .line 70
    .line 71
    move-result-wide v14

    .line 72
    const-string v0, "fetch_timeout_in_seconds"

    .line 73
    .line 74
    iget-object v7, v9, Laa/k;->a:Landroid/content/SharedPreferences;

    .line 75
    .line 76
    invoke-interface {v7, v0, v10, v11}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 77
    .line 78
    .line 79
    move-result-wide v16

    .line 80
    iget-object v11, v1, LZ9/k;->b:Landroid/content/Context;

    .line 81
    .line 82
    move-object v10, v8

    .line 83
    invoke-direct/range {v10 .. v17}, Lcom/google/firebase/remoteconfig/internal/ConfigFetchHttpClient;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JJ)V

    .line 84
    .line 85
    .line 86
    move-object v8, v10

    .line 87
    iget-object v10, v1, LZ9/k;->i:Ljava/util/HashMap;

    .line 88
    .line 89
    move-object/from16 v7, p1

    .line 90
    .line 91
    invoke-direct/range {v2 .. v10}, Laa/h;-><init>(LP9/d;LO9/b;Ljava/util/concurrent/Executor;Ljava/util/Random;Laa/c;Lcom/google/firebase/remoteconfig/internal/ConfigFetchHttpClient;Laa/k;Ljava/util/HashMap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    .line 94
    monitor-exit p0

    .line 95
    return-object v2

    .line 96
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    throw v0
.end method

.method public final declared-synchronized e(Ls8/g;LP9/d;Laa/h;Laa/c;Landroid/content/Context;Laa/k;)LVa/Y7;
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, LVa/Y7;

    .line 3
    .line 4
    iget-object v9, p0, LZ9/k;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v7, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v7, v0, LVa/Y7;->a:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance v1, Laa/n;

    .line 17
    .line 18
    move-object v2, p1

    .line 19
    move-object v3, p2

    .line 20
    move-object v4, p3

    .line 21
    move-object v5, p4

    .line 22
    move-object v6, p5

    .line 23
    move-object/from16 v8, p6

    .line 24
    .line 25
    invoke-direct/range {v1 .. v9}, Laa/n;-><init>(Ls8/g;LP9/d;Laa/h;Laa/c;Landroid/content/Context;Ljava/util/LinkedHashSet;Laa/k;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, v0, LVa/Y7;->b:Ljava/lang/Object;

    .line 29
    .line 30
    iput-object p5, v0, LVa/Y7;->c:Ljava/lang/Object;

    .line 31
    .line 32
    iput-object v9, v0, LVa/Y7;->d:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    monitor-exit p0

    .line 35
    return-object v0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    move-object p1, v0

    .line 38
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw p1
.end method
