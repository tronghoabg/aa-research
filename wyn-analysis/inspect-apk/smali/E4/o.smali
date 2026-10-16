.class public final LE4/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:Z


# instance fields
.field public final a:LE4/y;

.field public final b:Lwa/a;

.field public final c:LG4/d;

.field public final d:LD6/o;

.field public final e:LE4/F;

.field public final f:LE4/n;

.field public final g:LVa/Y7;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "Engine"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput-boolean v0, LE4/o;->h:Z

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(LG4/d;LS3/l;LH4/c;LH4/c;LH4/c;LH4/c;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE4/o;->c:LG4/d;

    .line 5
    .line 6
    new-instance v0, Ld7/j;

    .line 7
    .line 8
    invoke-direct {v0, p2}, Ld7/j;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, LVa/Y7;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {p2, v1}, LVa/Y7;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, LE4/o;->g:LVa/Y7;

    .line 18
    .line 19
    monitor-enter p0

    .line 20
    :try_start_0
    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    :try_start_1
    iput-object p0, p2, LVa/Y7;->d:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 24
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    new-instance p2, Lwa/a;

    .line 26
    .line 27
    const/16 v1, 0x10

    .line 28
    .line 29
    invoke-direct {p2, v1}, Lwa/a;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, LE4/o;->b:Lwa/a;

    .line 33
    .line 34
    new-instance p2, LE4/y;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {p2, v1}, LE4/y;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput-object p2, p0, LE4/o;->a:LE4/y;

    .line 41
    .line 42
    new-instance v2, LD6/o;

    .line 43
    .line 44
    move-object v8, p0

    .line 45
    move-object v7, p0

    .line 46
    move-object v3, p3

    .line 47
    move-object v4, p4

    .line 48
    move-object v5, p5

    .line 49
    move-object v6, p6

    .line 50
    invoke-direct/range {v2 .. v8}, LD6/o;-><init>(LH4/c;LH4/c;LH4/c;LH4/c;LE4/o;LE4/o;)V

    .line 51
    .line 52
    .line 53
    iput-object v2, v7, LE4/o;->d:LD6/o;

    .line 54
    .line 55
    new-instance p2, LE4/n;

    .line 56
    .line 57
    invoke-direct {p2, v0}, LE4/n;-><init>(Ld7/j;)V

    .line 58
    .line 59
    .line 60
    iput-object p2, v7, LE4/o;->f:LE4/n;

    .line 61
    .line 62
    new-instance p2, LE4/F;

    .line 63
    .line 64
    invoke-direct {p2}, LE4/F;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p2, v7, LE4/o;->e:LE4/F;

    .line 68
    .line 69
    iput-object v7, p1, LG4/d;->d:LE4/o;

    .line 70
    .line 71
    return-void

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    move-object v7, p0

    .line 74
    :goto_0
    move-object p1, v0

    .line 75
    goto :goto_2

    .line 76
    :catchall_1
    move-exception v0

    .line 77
    move-object v7, p0

    .line 78
    :goto_1
    move-object p1, v0

    .line 79
    :try_start_3
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 80
    :try_start_4
    throw p1

    .line 81
    :catchall_2
    move-exception v0

    .line 82
    goto :goto_0

    .line 83
    :catchall_3
    move-exception v0

    .line 84
    goto :goto_1

    .line 85
    :goto_2
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 86
    throw p1
.end method

.method public static d(Ljava/lang/String;JLE4/t;)V
    .locals 1

    .line 1
    const-string v0, " in "

    .line 2
    .line 3
    invoke-static {p0, v0}, LA7/p0;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1, p2}, LY4/i;->a(J)D

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, "ms, key: "

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string p1, "Engine"

    .line 27
    .line 28
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static g(LE4/B;)V
    .locals 1

    .line 1
    instance-of v0, p0, LE4/u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LE4/u;

    .line 6
    .line 7
    invoke-virtual {p0}, LE4/u;->d()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string v0, "Cannot release anything but an EngineResource"

    .line 14
    .line 15
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p0
.end method


# virtual methods
.method public final a(Lcom/bumptech/glide/c;Ljava/lang/Object;LB4/d;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/d;LE4/m;LY4/d;ZZLB4/g;ZZLU4/d;LY4/g;)LDd/c;
    .locals 23

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    sget-boolean v0, LE4/o;->h:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget v0, LY4/i;->b:I

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    :goto_0
    iget-object v3, v2, LE4/o;->b:Lwa/a;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v4, LE4/t;

    .line 22
    .line 23
    move-object/from16 v5, p2

    .line 24
    .line 25
    move-object/from16 v6, p3

    .line 26
    .line 27
    move/from16 v7, p4

    .line 28
    .line 29
    move/from16 v8, p5

    .line 30
    .line 31
    move-object/from16 v10, p6

    .line 32
    .line 33
    move-object/from16 v11, p7

    .line 34
    .line 35
    move-object/from16 v9, p10

    .line 36
    .line 37
    move-object/from16 v12, p13

    .line 38
    .line 39
    invoke-direct/range {v4 .. v12}, LE4/t;-><init>(Ljava/lang/Object;LB4/d;IILY4/d;Ljava/lang/Class;Ljava/lang/Class;LB4/g;)V

    .line 40
    .line 41
    .line 42
    monitor-enter p0

    .line 43
    move/from16 v3, p14

    .line 44
    .line 45
    :try_start_0
    invoke-virtual {v2, v4, v3, v0, v1}, LE4/o;->c(LE4/t;ZJ)LE4/u;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    if-nez v5, :cond_1

    .line 50
    .line 51
    move-object/from16 v5, p3

    .line 52
    .line 53
    move/from16 v6, p4

    .line 54
    .line 55
    move/from16 v7, p5

    .line 56
    .line 57
    move-object/from16 v8, p6

    .line 58
    .line 59
    move-object/from16 v9, p7

    .line 60
    .line 61
    move-object/from16 v10, p8

    .line 62
    .line 63
    move-object/from16 v11, p9

    .line 64
    .line 65
    move-object/from16 v12, p10

    .line 66
    .line 67
    move/from16 v13, p11

    .line 68
    .line 69
    move/from16 v14, p12

    .line 70
    .line 71
    move-object/from16 v15, p13

    .line 72
    .line 73
    move/from16 v17, p15

    .line 74
    .line 75
    move-object/from16 v18, p16

    .line 76
    .line 77
    move-object/from16 v19, p17

    .line 78
    .line 79
    move-wide/from16 v21, v0

    .line 80
    .line 81
    move/from16 v16, v3

    .line 82
    .line 83
    move-object/from16 v20, v4

    .line 84
    .line 85
    move-object/from16 v3, p1

    .line 86
    .line 87
    move-object/from16 v4, p2

    .line 88
    .line 89
    invoke-virtual/range {v2 .. v22}, LE4/o;->h(Lcom/bumptech/glide/c;Ljava/lang/Object;LB4/d;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/d;LE4/m;LY4/d;ZZLB4/g;ZZLU4/d;LY4/g;LE4/t;J)LDd/c;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    monitor-exit p0

    .line 94
    return-object v0

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    goto :goto_1

    .line 97
    :cond_1
    move-object v0, v5

    .line 98
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    const/4 v1, 0x5

    .line 100
    move-object/from16 v2, p16

    .line 101
    .line 102
    invoke-virtual {v2, v0, v1}, LU4/d;->j(LE4/B;I)V

    .line 103
    .line 104
    .line 105
    const/4 v0, 0x0

    .line 106
    return-object v0

    .line 107
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    throw v0
.end method

.method public final b(LE4/t;)LE4/u;
    .locals 8

    .line 1
    iget-object v1, p0, LE4/o;->c:LG4/d;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v0, v1, LW1/r;->c:Ljava/io/Serializable;

    .line 5
    .line 6
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    :try_start_1
    iget-wide v2, v1, LW1/r;->b:J

    .line 15
    .line 16
    invoke-virtual {v1, v0}, LG4/d;->c(Ljava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    int-to-long v4, v4

    .line 21
    sub-long/2addr v2, v4

    .line 22
    iput-wide v2, v1, LW1/r;->b:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    move-object p1, v0

    .line 27
    move-object v7, p0

    .line 28
    goto :goto_4

    .line 29
    :cond_0
    :goto_0
    monitor-exit v1

    .line 30
    move-object v3, v0

    .line 31
    check-cast v3, LE4/B;

    .line 32
    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    :goto_1
    move-object v7, p0

    .line 37
    move-object v6, p1

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    instance-of v0, v3, LE4/u;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    move-object v0, v3

    .line 44
    check-cast v0, LE4/u;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    new-instance v2, LE4/u;

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    const/4 v5, 0x1

    .line 51
    move-object v7, p0

    .line 52
    move-object v6, p1

    .line 53
    invoke-direct/range {v2 .. v7}, LE4/u;-><init>(LE4/B;ZZLE4/t;LE4/o;)V

    .line 54
    .line 55
    .line 56
    move-object v0, v2

    .line 57
    :goto_2
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0}, LE4/u;->c()V

    .line 60
    .line 61
    .line 62
    iget-object p1, v7, LE4/o;->g:LVa/Y7;

    .line 63
    .line 64
    invoke-virtual {p1, v6, v0}, LVa/Y7;->a(LE4/t;LE4/u;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    return-object v0

    .line 68
    :catchall_1
    move-exception v0

    .line 69
    move-object v7, p0

    .line 70
    :goto_3
    move-object p1, v0

    .line 71
    :goto_4
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 72
    throw p1

    .line 73
    :catchall_2
    move-exception v0

    .line 74
    goto :goto_3
.end method

.method public final c(LE4/t;ZJ)LE4/u;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    iget-object p2, p0, LE4/o;->g:LVa/Y7;

    .line 6
    .line 7
    monitor-enter p2

    .line 8
    :try_start_0
    iget-object v1, p2, LVa/Y7;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, LE4/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    monitor-exit p2

    .line 21
    move-object v2, v0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, LE4/u;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {p2, v1}, LVa/Y7;->d(LE4/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto :goto_3

    .line 37
    :cond_2
    :goto_0
    monitor-exit p2

    .line 38
    :goto_1
    if-eqz v2, :cond_3

    .line 39
    .line 40
    invoke-virtual {v2}, LE4/u;->c()V

    .line 41
    .line 42
    .line 43
    :cond_3
    if-eqz v2, :cond_5

    .line 44
    .line 45
    sget-boolean p2, LE4/o;->h:Z

    .line 46
    .line 47
    if-eqz p2, :cond_4

    .line 48
    .line 49
    const-string p2, "Loaded resource from active resources"

    .line 50
    .line 51
    invoke-static {p2, p3, p4, p1}, LE4/o;->d(Ljava/lang/String;JLE4/t;)V

    .line 52
    .line 53
    .line 54
    :cond_4
    return-object v2

    .line 55
    :cond_5
    invoke-virtual {p0, p1}, LE4/o;->b(LE4/t;)LE4/u;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    if-eqz p2, :cond_7

    .line 60
    .line 61
    sget-boolean v0, LE4/o;->h:Z

    .line 62
    .line 63
    if-eqz v0, :cond_6

    .line 64
    .line 65
    const-string v0, "Loaded resource from cache"

    .line 66
    .line 67
    invoke-static {v0, p3, p4, p1}, LE4/o;->d(Ljava/lang/String;JLE4/t;)V

    .line 68
    .line 69
    .line 70
    :cond_6
    return-object p2

    .line 71
    :cond_7
    :goto_2
    return-object v0

    .line 72
    :goto_3
    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    throw p1
.end method

.method public final declared-synchronized e(LE4/s;LE4/t;LE4/u;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    :try_start_0
    iget-boolean v0, p3, LE4/u;->a:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, LE4/o;->g:LVa/Y7;

    .line 9
    .line 10
    invoke-virtual {v0, p2, p3}, LVa/Y7;->a(LE4/t;LE4/u;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    iget-object p3, p0, LE4/o;->a:LE4/y;

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object p3, p3, LE4/y;->a:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {p3, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p3, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    :cond_1
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p1
.end method

.method public final f(LE4/t;LE4/u;)V
    .locals 3

    .line 1
    iget-object v0, p0, LE4/o;->g:LVa/Y7;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, LVa/Y7;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, LE4/c;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iput-object v2, v1, LE4/c;->c:LE4/B;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :cond_0
    monitor-exit v0

    .line 23
    iget-boolean v0, p2, LE4/u;->a:Z

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, LE4/o;->c:LG4/d;

    .line 28
    .line 29
    invoke-virtual {v0, p1, p2}, LW1/r;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, LE4/B;

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object p1, p0, LE4/o;->e:LE4/F;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-virtual {p1, p2, v0}, LE4/F;->s(LE4/B;Z)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw p1
.end method

.method public final h(Lcom/bumptech/glide/c;Ljava/lang/Object;LB4/d;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/d;LE4/m;LY4/d;ZZLB4/g;ZZLU4/d;LY4/g;LE4/t;J)LDd/c;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p13

    move-object/from16 v9, p16

    move-object/from16 v10, p17

    move-object/from16 v11, p18

    move-wide/from16 v12, p19

    .line 1
    iget-object v14, v1, LE4/o;->a:LE4/y;

    .line 2
    iget-object v14, v14, LE4/y;->a:Ljava/util/HashMap;

    .line 3
    invoke-virtual {v14, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LE4/s;

    if-eqz v14, :cond_1

    .line 4
    invoke-virtual {v14, v9, v10}, LE4/s;->a(LU4/d;LY4/g;)V

    .line 5
    sget-boolean v0, LE4/o;->h:Z

    if-eqz v0, :cond_0

    .line 6
    const-string v0, "Added to existing load"

    invoke-static {v0, v12, v13, v11}, LE4/o;->d(Ljava/lang/String;JLE4/t;)V

    .line 7
    :cond_0
    new-instance v0, LDd/c;

    invoke-direct {v0, v1, v9, v14}, LDd/c;-><init>(LE4/o;LU4/d;LE4/s;)V

    return-object v0

    .line 8
    :cond_1
    iget-object v14, v1, LE4/o;->d:LD6/o;

    .line 9
    iget-object v14, v14, LD6/o;->g:Ljava/lang/Object;

    check-cast v14, LDd/c;

    .line 10
    invoke-virtual {v14}, LDd/c;->z()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LE4/s;

    .line 11
    monitor-enter v14

    .line 12
    :try_start_0
    iput-object v11, v14, LE4/s;->k:LE4/t;

    move/from16 v15, p14

    .line 13
    iput-boolean v15, v14, LE4/s;->l:Z

    move/from16 v15, p15

    .line 14
    iput-boolean v15, v14, LE4/s;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    monitor-exit v14

    .line 16
    iget-object v15, v1, LE4/o;->f:LE4/n;

    .line 17
    iget-object v12, v15, LE4/n;->d:Ljava/lang/Object;

    check-cast v12, LDd/c;

    .line 18
    invoke-virtual {v12}, LDd/c;->z()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LE4/k;

    .line 19
    iget v13, v15, LE4/n;->b:I

    add-int/lit8 v9, v13, 0x1

    iput v9, v15, LE4/n;->b:I

    .line 20
    iget-object v9, v12, LE4/k;->a:LE4/i;

    iput-object v0, v9, LE4/i;->c:Lcom/bumptech/glide/c;

    .line 21
    iput-object v2, v9, LE4/i;->d:Ljava/lang/Object;

    .line 22
    iput-object v3, v9, LE4/i;->n:LB4/d;

    .line 23
    iput v4, v9, LE4/i;->e:I

    .line 24
    iput v5, v9, LE4/i;->f:I

    .line 25
    iput-object v7, v9, LE4/i;->p:LE4/m;

    move-object/from16 v15, p6

    .line 26
    iput-object v15, v9, LE4/i;->g:Ljava/lang/Class;

    .line 27
    iget-object v15, v12, LE4/k;->d:Ld7/j;

    iput-object v15, v9, LE4/i;->h:Ld7/j;

    move-object/from16 v15, p7

    .line 28
    iput-object v15, v9, LE4/i;->k:Ljava/lang/Class;

    .line 29
    iput-object v6, v9, LE4/i;->o:Lcom/bumptech/glide/d;

    .line 30
    iput-object v8, v9, LE4/i;->i:LB4/g;

    move-object/from16 v15, p10

    .line 31
    iput-object v15, v9, LE4/i;->j:LY4/d;

    move/from16 v15, p11

    .line 32
    iput-boolean v15, v9, LE4/i;->q:Z

    move/from16 v15, p12

    .line 33
    iput-boolean v15, v9, LE4/i;->r:Z

    .line 34
    iput-object v0, v12, LE4/k;->h:Lcom/bumptech/glide/c;

    .line 35
    iput-object v3, v12, LE4/k;->i:LB4/d;

    .line 36
    iput-object v6, v12, LE4/k;->j:Lcom/bumptech/glide/d;

    .line 37
    iput-object v11, v12, LE4/k;->k:LE4/t;

    .line 38
    iput v4, v12, LE4/k;->l:I

    .line 39
    iput v5, v12, LE4/k;->m:I

    .line 40
    iput-object v7, v12, LE4/k;->n:LE4/m;

    .line 41
    iput-object v8, v12, LE4/k;->o:LB4/g;

    .line 42
    iput-object v14, v12, LE4/k;->p:LE4/s;

    .line 43
    iput v13, v12, LE4/k;->q:I

    const/4 v0, 0x1

    .line 44
    iput v0, v12, LE4/k;->C:I

    .line 45
    iput-object v2, v12, LE4/k;->s:Ljava/lang/Object;

    .line 46
    iget-object v0, v1, LE4/o;->a:LE4/y;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    iget-object v0, v0, LE4/y;->a:Ljava/util/HashMap;

    .line 48
    invoke-virtual {v0, v11, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v9, p16

    .line 49
    invoke-virtual {v14, v9, v10}, LE4/s;->a(LU4/d;LY4/g;)V

    .line 50
    invoke-virtual {v14, v12}, LE4/s;->k(LE4/k;)V

    .line 51
    sget-boolean v0, LE4/o;->h:Z

    if-eqz v0, :cond_2

    .line 52
    const-string v0, "Started new load"

    move-wide/from16 v12, p19

    invoke-static {v0, v12, v13, v11}, LE4/o;->d(Ljava/lang/String;JLE4/t;)V

    .line 53
    :cond_2
    new-instance v0, LDd/c;

    invoke-direct {v0, v1, v9, v14}, LDd/c;-><init>(LE4/o;LU4/d;LE4/s;)V

    return-object v0

    :catchall_0
    move-exception v0

    .line 54
    :try_start_1
    monitor-exit v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
