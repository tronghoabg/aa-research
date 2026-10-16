.class public final LN3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK3/h;


# static fields
.field public static final e:Ljava/lang/String;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/app/job/JobScheduler;

.field public final c:LK3/q;

.field public final d:LN3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "SystemJobScheduler"

    .line 2
    .line 3
    invoke-static {v0}, LJ3/r;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LN3/b;->e:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LK3/q;)V
    .locals 2

    .line 1
    const-string v0, "jobscheduler"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/job/JobScheduler;

    .line 8
    .line 9
    new-instance v1, LN3/a;

    .line 10
    .line 11
    invoke-direct {v1, p1}, LN3/a;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, LN3/b;->a:Landroid/content/Context;

    .line 18
    .line 19
    iput-object p2, p0, LN3/b;->c:LK3/q;

    .line 20
    .line 21
    iput-object v0, p0, LN3/b;->b:Landroid/app/job/JobScheduler;

    .line 22
    .line 23
    iput-object v1, p0, LN3/b;->d:LN3/a;

    .line 24
    .line 25
    return-void
.end method

.method public static b(Landroid/app/job/JobScheduler;I)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/app/job/JobScheduler;->cancel(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception p0

    .line 6
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 v2, 0x1

    .line 19
    new-array v2, v2, [Ljava/lang/Object;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    aput-object p1, v2, v3

    .line 23
    .line 24
    const-string p1, "Exception while trying to cancel job (%d)"

    .line 25
    .line 26
    invoke-static {v1, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    sget-object v1, LN3/b;->e:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v1, p1, p0}, LJ3/r;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static d(Landroid/content/Context;Landroid/app/job/JobScheduler;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    invoke-static {p0, p1}, LN3/b;->f(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroid/app/job/JobInfo;

    .line 30
    .line 31
    invoke-static {v0}, LN3/b;->g(Landroid/app/job/JobInfo;)LS3/j;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object v1, v1, LS3/j;->a:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/app/job/JobInfo;->getId()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    return-object p1
.end method

.method public static f(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Landroid/app/job/JobScheduler;->getAllPendingJobs()Ljava/util/List;

    .line 3
    .line 4
    .line 5
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, LN3/b;->e:Ljava/lang/String;

    .line 13
    .line 14
    const-string v3, "getAllPendingJobs() is not reliable on this device."

    .line 15
    .line 16
    invoke-virtual {v1, v2, v3, p1}, LJ3/r;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object p1, v0

    .line 20
    :goto_0
    if-nez p1, :cond_0

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Landroid/content/ComponentName;

    .line 33
    .line 34
    const-class v2, Landroidx/work/impl/background/systemjob/SystemJobService;

    .line 35
    .line 36
    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Landroid/app/job/JobInfo;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/app/job/JobInfo;->getService()Landroid/content/ComponentName;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v1, v2}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    return-object v0
.end method

.method public static g(Landroid/app/job/JobInfo;)LS3/j;
    .locals 3

    .line 1
    const-string v0, "EXTRA_WORK_SPEC_ID"

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/job/JobInfo;->getExtras()Landroid/os/PersistableBundle;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v1, "EXTRA_WORK_SPEC_GENERATION"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {p0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    new-instance v2, LS3/j;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v2, p0, v1}, LS3/j;-><init>(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :catch_0
    :cond_0
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, LN3/b;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, LN3/b;->b:Landroid/app/job/JobScheduler;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, LN3/b;->d(Landroid/content/Context;Landroid/app/job/JobScheduler;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_2

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-static {v1, v2}, LN3/b;->b(Landroid/app/job/JobScheduler;I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object v0, p0, LN3/b;->c:LK3/q;

    .line 42
    .line 43
    iget-object v0, v0, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->r()LS3/i;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v1, v0, LS3/i;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Landroidx/work/impl/WorkDatabase_Impl;

    .line 52
    .line 53
    invoke-virtual {v1}, Lk3/m;->b()V

    .line 54
    .line 55
    .line 56
    iget-object v0, v0, LS3/i;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, LS3/h;

    .line 59
    .line 60
    invoke-virtual {v0}, LE9/c;->a()Lo3/g;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    const/4 v3, 0x1

    .line 65
    if-nez p1, :cond_1

    .line 66
    .line 67
    invoke-interface {v2, v3}, Lo3/e;->N(I)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-interface {v2, v3, p1}, Lo3/e;->x(ILjava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :goto_1
    invoke-virtual {v1}, Lk3/m;->c()V

    .line 75
    .line 76
    .line 77
    :try_start_0
    invoke-interface {v2}, Lo3/g;->g()I

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Lk3/m;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Lk3/m;->j()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v2}, LE9/c;->q(Lo3/g;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :catchall_0
    move-exception p1

    .line 91
    invoke-virtual {v1}, Lk3/m;->j()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v2}, LE9/c;->q(Lo3/g;)V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_2
    return-void
.end method

.method public final varargs c([LS3/p;)V
    .locals 14

    .line 1
    iget-object v0, p0, LN3/b;->c:LK3/q;

    .line 2
    .line 3
    iget-object v1, v0, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 4
    .line 5
    new-instance v2, LA/e0;

    .line 6
    .line 7
    invoke-direct {v2, v1}, LA/e0;-><init>(Landroidx/work/impl/WorkDatabase;)V

    .line 8
    .line 9
    .line 10
    array-length v3, p1

    .line 11
    const/4 v4, 0x0

    .line 12
    move v5, v4

    .line 13
    :goto_0
    if-ge v5, v3, :cond_7

    .line 14
    .line 15
    aget-object v6, p1, v5

    .line 16
    .line 17
    invoke-virtual {v1}, Lk3/m;->c()V

    .line 18
    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->u()LS3/q;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    iget-object v8, v6, LS3/p;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v7, v8}, LS3/q;->h(Ljava/lang/String;)LS3/p;

    .line 27
    .line 28
    .line 29
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    const-string v8, "Skipping scheduling "

    .line 31
    .line 32
    sget-object v9, LN3/b;->e:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v10, v6, LS3/p;->a:Ljava/lang/String;

    .line 35
    .line 36
    if-nez v7, :cond_0

    .line 37
    .line 38
    :try_start_1
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    new-instance v7, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v8, " because it\'s no longer in the DB"

    .line 54
    .line 55
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-virtual {v6, v9, v7}, LJ3/r;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Lk3/m;->n()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    .line 68
    :goto_1
    invoke-virtual {v1}, Lk3/m;->j()V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_4

    .line 72
    .line 73
    :catchall_0
    move-exception p1

    .line 74
    goto/16 :goto_5

    .line 75
    .line 76
    :cond_0
    :try_start_2
    iget v7, v7, LS3/p;->b:I

    .line 77
    .line 78
    const/4 v11, 0x1

    .line 79
    if-eq v7, v11, :cond_1

    .line 80
    .line 81
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    new-instance v7, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v8, " because it is no longer enqueued"

    .line 97
    .line 98
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-virtual {v6, v9, v7}, LJ3/r;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Lk3/m;->n()V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_1
    invoke-static {v6}, LFe/c;->s(LS3/p;)LS3/j;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->r()LS3/i;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    invoke-virtual {v8, v7}, LS3/i;->c(LS3/j;)LS3/g;

    .line 121
    .line 122
    .line 123
    move-result-object v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    const-string v9, "workDatabase.runInTransa\u2026            id\n        })"

    .line 125
    .line 126
    iget-object v11, v2, LA/e0;->b:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v11, Landroidx/work/impl/WorkDatabase;

    .line 129
    .line 130
    if-eqz v8, :cond_2

    .line 131
    .line 132
    :try_start_3
    iget v12, v8, LS3/g;->c:I

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_2
    iget-object v12, v0, LK3/q;->b:LJ3/b;

    .line 136
    .line 137
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget-object v12, v0, LK3/q;->b:LJ3/b;

    .line 141
    .line 142
    iget v12, v12, LJ3/b;->g:I

    .line 143
    .line 144
    new-instance v13, LT3/g;

    .line 145
    .line 146
    invoke-direct {v13, v2, v12}, LT3/g;-><init>(LA/e0;I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v11, v13}, Lk3/m;->m(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    invoke-static {v12, v9}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    check-cast v12, Ljava/lang/Number;

    .line 157
    .line 158
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v12

    .line 162
    :goto_2
    if-nez v8, :cond_3

    .line 163
    .line 164
    new-instance v8, LS3/g;

    .line 165
    .line 166
    iget-object v13, v7, LS3/j;->a:Ljava/lang/String;

    .line 167
    .line 168
    iget v7, v7, LS3/j;->b:I

    .line 169
    .line 170
    invoke-direct {v8, v13, v7, v12}, LS3/g;-><init>(Ljava/lang/String;II)V

    .line 171
    .line 172
    .line 173
    iget-object v7, v0, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 174
    .line 175
    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->r()LS3/i;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    invoke-virtual {v7, v8}, LS3/i;->d(LS3/g;)V

    .line 180
    .line 181
    .line 182
    :cond_3
    invoke-virtual {p0, v6, v12}, LN3/b;->h(LS3/p;I)V

    .line 183
    .line 184
    .line 185
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 186
    .line 187
    const/16 v8, 0x17

    .line 188
    .line 189
    if-ne v7, v8, :cond_6

    .line 190
    .line 191
    iget-object v7, p0, LN3/b;->a:Landroid/content/Context;

    .line 192
    .line 193
    iget-object v8, p0, LN3/b;->b:Landroid/app/job/JobScheduler;

    .line 194
    .line 195
    invoke-static {v7, v8, v10}, LN3/b;->d(Landroid/content/Context;Landroid/app/job/JobScheduler;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    if-eqz v7, :cond_6

    .line 200
    .line 201
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    if-ltz v8, :cond_4

    .line 210
    .line 211
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    :cond_4
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    if-nez v8, :cond_5

    .line 219
    .line 220
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    check-cast v7, Ljava/lang/Integer;

    .line 225
    .line 226
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 227
    .line 228
    .line 229
    move-result v7

    .line 230
    goto :goto_3

    .line 231
    :cond_5
    iget-object v7, v0, LK3/q;->b:LJ3/b;

    .line 232
    .line 233
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    iget-object v7, v0, LK3/q;->b:LJ3/b;

    .line 237
    .line 238
    iget v7, v7, LJ3/b;->g:I

    .line 239
    .line 240
    new-instance v8, LT3/g;

    .line 241
    .line 242
    invoke-direct {v8, v2, v7}, LT3/g;-><init>(LA/e0;I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v11, v8}, Lk3/m;->m(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    check-cast v7, Ljava/lang/Number;

    .line 253
    .line 254
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    :goto_3
    invoke-virtual {p0, v6, v7}, LN3/b;->h(LS3/p;I)V

    .line 259
    .line 260
    .line 261
    :cond_6
    invoke-virtual {v1}, Lk3/m;->n()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 262
    .line 263
    .line 264
    goto/16 :goto_1

    .line 265
    .line 266
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 267
    .line 268
    goto/16 :goto_0

    .line 269
    .line 270
    :goto_5
    invoke-virtual {v1}, Lk3/m;->j()V

    .line 271
    .line 272
    .line 273
    throw p1

    .line 274
    :cond_7
    return-void
.end method

.method public final e()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final h(LS3/p;I)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v0, p2

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v6, 0x2

    .line 10
    iget-object v7, v1, LN3/b;->b:Landroid/app/job/JobScheduler;

    .line 11
    .line 12
    iget-object v8, v1, LN3/b;->d:LN3/a;

    .line 13
    .line 14
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v9, v2, LS3/p;->j:LJ3/d;

    .line 18
    .line 19
    new-instance v10, Landroid/os/PersistableBundle;

    .line 20
    .line 21
    invoke-direct {v10}, Landroid/os/PersistableBundle;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v11, "EXTRA_WORK_SPEC_ID"

    .line 25
    .line 26
    iget-object v12, v2, LS3/p;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v10, v11, v12}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v11, "EXTRA_WORK_SPEC_GENERATION"

    .line 32
    .line 33
    iget v13, v2, LS3/p;->t:I

    .line 34
    .line 35
    invoke-virtual {v10, v11, v13}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    const-string v11, "EXTRA_IS_PERIODIC"

    .line 39
    .line 40
    invoke-virtual {v2}, LS3/p;->c()Z

    .line 41
    .line 42
    .line 43
    move-result v13

    .line 44
    invoke-virtual {v10, v11, v13}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    new-instance v11, Landroid/app/job/JobInfo$Builder;

    .line 48
    .line 49
    iget-object v8, v8, LN3/a;->a:Landroid/content/ComponentName;

    .line 50
    .line 51
    invoke-direct {v11, v0, v8}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    .line 52
    .line 53
    .line 54
    iget-boolean v8, v9, LJ3/d;->b:Z

    .line 55
    .line 56
    invoke-virtual {v11, v8}, Landroid/app/job/JobInfo$Builder;->setRequiresCharging(Z)Landroid/app/job/JobInfo$Builder;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    iget-boolean v11, v9, LJ3/d;->c:Z

    .line 61
    .line 62
    invoke-virtual {v8, v11}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    invoke-virtual {v8, v10}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 71
    .line 72
    const/16 v13, 0x1e

    .line 73
    .line 74
    const/16 v14, 0x18

    .line 75
    .line 76
    const/16 v15, 0x1a

    .line 77
    .line 78
    iget v4, v9, LJ3/d;->a:I

    .line 79
    .line 80
    if-lt v10, v13, :cond_0

    .line 81
    .line 82
    const/4 v13, 0x6

    .line 83
    if-ne v4, v13, :cond_0

    .line 84
    .line 85
    new-instance v4, Landroid/net/NetworkRequest$Builder;

    .line 86
    .line 87
    invoke-direct {v4}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 88
    .line 89
    .line 90
    const/16 v13, 0x19

    .line 91
    .line 92
    invoke-virtual {v4, v13}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v4}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-static {v8, v4}, LA0/j;->q(Landroid/app/job/JobInfo$Builder;Landroid/net/NetworkRequest;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_0
    invoke-static {v4}, LA/f;->f(I)I

    .line 105
    .line 106
    .line 107
    move-result v13

    .line 108
    if-eqz v13, :cond_6

    .line 109
    .line 110
    if-eq v13, v5, :cond_4

    .line 111
    .line 112
    if-eq v13, v6, :cond_5

    .line 113
    .line 114
    if-eq v13, v3, :cond_2

    .line 115
    .line 116
    const/4 v3, 0x4

    .line 117
    if-eq v13, v3, :cond_1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_1
    if-lt v10, v15, :cond_3

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_2
    if-lt v10, v14, :cond_3

    .line 124
    .line 125
    const/4 v3, 0x3

    .line 126
    goto :goto_1

    .line 127
    :cond_3
    :goto_0
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-static {v4}, LA7/p0;->A(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    const-string v13, "API version too low. Cannot convert network type value "

    .line 136
    .line 137
    invoke-virtual {v13, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    sget-object v13, LN3/a;->b:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v3, v13, v4}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_4
    move v3, v5

    .line 147
    goto :goto_1

    .line 148
    :cond_5
    move v3, v6

    .line 149
    goto :goto_1

    .line 150
    :cond_6
    const/4 v3, 0x0

    .line 151
    :goto_1
    invoke-virtual {v8, v3}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    .line 152
    .line 153
    .line 154
    :goto_2
    if-nez v11, :cond_8

    .line 155
    .line 156
    iget v3, v2, LS3/p;->l:I

    .line 157
    .line 158
    if-ne v3, v6, :cond_7

    .line 159
    .line 160
    const/4 v3, 0x0

    .line 161
    :goto_3
    move v11, v6

    .line 162
    goto :goto_4

    .line 163
    :cond_7
    move v3, v5

    .line 164
    goto :goto_3

    .line 165
    :goto_4
    iget-wide v5, v2, LS3/p;->m:J

    .line 166
    .line 167
    invoke-virtual {v8, v5, v6, v3}, Landroid/app/job/JobInfo$Builder;->setBackoffCriteria(JI)Landroid/app/job/JobInfo$Builder;

    .line 168
    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_8
    move v11, v6

    .line 172
    :goto_5
    invoke-virtual {v2}, LS3/p;->a()J

    .line 173
    .line 174
    .line 175
    move-result-wide v5

    .line 176
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 177
    .line 178
    .line 179
    move-result-wide v17

    .line 180
    sub-long v5, v5, v17

    .line 181
    .line 182
    move v13, v11

    .line 183
    move-object v3, v12

    .line 184
    const-wide/16 v11, 0x0

    .line 185
    .line 186
    invoke-static {v5, v6, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 187
    .line 188
    .line 189
    move-result-wide v5

    .line 190
    const/16 v4, 0x1c

    .line 191
    .line 192
    if-gt v10, v4, :cond_9

    .line 193
    .line 194
    invoke-virtual {v8, v5, v6}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 195
    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_9
    cmp-long v4, v5, v11

    .line 199
    .line 200
    if-lez v4, :cond_a

    .line 201
    .line 202
    invoke-virtual {v8, v5, v6}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 203
    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_a
    iget-boolean v4, v2, LS3/p;->q:Z

    .line 207
    .line 208
    if-nez v4, :cond_b

    .line 209
    .line 210
    invoke-static {v8}, LA0/j;->p(Landroid/app/job/JobInfo$Builder;)V

    .line 211
    .line 212
    .line 213
    :cond_b
    :goto_6
    if-lt v10, v14, :cond_d

    .line 214
    .line 215
    iget-object v4, v9, LJ3/d;->h:Ljava/util/Set;

    .line 216
    .line 217
    move-object v10, v4

    .line 218
    check-cast v10, Ljava/util/Collection;

    .line 219
    .line 220
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 221
    .line 222
    .line 223
    move-result v10

    .line 224
    if-nez v10, :cond_d

    .line 225
    .line 226
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v10

    .line 234
    if-eqz v10, :cond_c

    .line 235
    .line 236
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v10

    .line 240
    check-cast v10, LJ3/c;

    .line 241
    .line 242
    iget-boolean v14, v10, LJ3/c;->b:Z

    .line 243
    .line 244
    invoke-static {}, LA7/O0;->l()V

    .line 245
    .line 246
    .line 247
    iget-object v10, v10, LJ3/c;->a:Landroid/net/Uri;

    .line 248
    .line 249
    invoke-static {v10, v14}, LA7/O0;->d(Landroid/net/Uri;I)Landroid/app/job/JobInfo$TriggerContentUri;

    .line 250
    .line 251
    .line 252
    move-result-object v10

    .line 253
    invoke-static {v8, v10}, LA7/O0;->o(Landroid/app/job/JobInfo$Builder;Landroid/app/job/JobInfo$TriggerContentUri;)V

    .line 254
    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_c
    move-wide/from16 v18, v11

    .line 258
    .line 259
    iget-wide v11, v9, LJ3/d;->f:J

    .line 260
    .line 261
    invoke-static {v8, v11, v12}, LA7/O0;->n(Landroid/app/job/JobInfo$Builder;J)V

    .line 262
    .line 263
    .line 264
    iget-wide v10, v9, LJ3/d;->g:J

    .line 265
    .line 266
    invoke-static {v8, v10, v11}, LA7/O0;->B(Landroid/app/job/JobInfo$Builder;J)V

    .line 267
    .line 268
    .line 269
    :goto_8
    const/4 v4, 0x0

    .line 270
    goto :goto_9

    .line 271
    :cond_d
    move-wide/from16 v18, v11

    .line 272
    .line 273
    goto :goto_8

    .line 274
    :goto_9
    invoke-virtual {v8, v4}, Landroid/app/job/JobInfo$Builder;->setPersisted(Z)Landroid/app/job/JobInfo$Builder;

    .line 275
    .line 276
    .line 277
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 278
    .line 279
    if-lt v4, v15, :cond_e

    .line 280
    .line 281
    iget-boolean v10, v9, LJ3/d;->d:Z

    .line 282
    .line 283
    invoke-static {v8, v10}, LA0/h;->o(Landroid/app/job/JobInfo$Builder;Z)V

    .line 284
    .line 285
    .line 286
    iget-boolean v9, v9, LJ3/d;->e:Z

    .line 287
    .line 288
    invoke-static {v8, v9}, LA0/h;->A(Landroid/app/job/JobInfo$Builder;Z)V

    .line 289
    .line 290
    .line 291
    :cond_e
    iget v9, v2, LS3/p;->k:I

    .line 292
    .line 293
    if-lez v9, :cond_f

    .line 294
    .line 295
    const/4 v9, 0x1

    .line 296
    goto :goto_a

    .line 297
    :cond_f
    const/4 v9, 0x0

    .line 298
    :goto_a
    cmp-long v5, v5, v18

    .line 299
    .line 300
    if-lez v5, :cond_10

    .line 301
    .line 302
    const/4 v5, 0x1

    .line 303
    goto :goto_b

    .line 304
    :cond_10
    const/4 v5, 0x0

    .line 305
    :goto_b
    const/16 v6, 0x1f

    .line 306
    .line 307
    if-lt v4, v6, :cond_11

    .line 308
    .line 309
    iget-boolean v4, v2, LS3/p;->q:Z

    .line 310
    .line 311
    if-eqz v4, :cond_11

    .line 312
    .line 313
    if-nez v9, :cond_11

    .line 314
    .line 315
    if-nez v5, :cond_11

    .line 316
    .line 317
    invoke-static {v8}, LF5/i;->m(Landroid/app/job/JobInfo$Builder;)V

    .line 318
    .line 319
    .line 320
    :cond_11
    invoke-virtual {v8}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    .line 321
    .line 322
    .line 323
    move-result-object v4

    .line 324
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 325
    .line 326
    .line 327
    move-result-object v5

    .line 328
    new-instance v6, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    const-string v8, "Scheduling work ID "

    .line 331
    .line 332
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    const-string v8, "Job ID "

    .line 339
    .line 340
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v6

    .line 350
    sget-object v8, LN3/b;->e:Ljava/lang/String;

    .line 351
    .line 352
    invoke-virtual {v5, v8, v6}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    :try_start_0
    invoke-virtual {v7, v4}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    if-nez v4, :cond_12

    .line 360
    .line 361
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    new-instance v5, Ljava/lang/StringBuilder;

    .line 366
    .line 367
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 368
    .line 369
    .line 370
    const-string v6, "Unable to schedule work ID "

    .line 371
    .line 372
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    invoke-virtual {v4, v8, v5}, LJ3/r;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    iget-boolean v4, v2, LS3/p;->q:Z

    .line 386
    .line 387
    if-eqz v4, :cond_12

    .line 388
    .line 389
    iget v4, v2, LS3/p;->r:I

    .line 390
    .line 391
    const/4 v5, 0x1

    .line 392
    if-ne v4, v5, :cond_12

    .line 393
    .line 394
    const/4 v5, 0x0

    .line 395
    iput-boolean v5, v2, LS3/p;->q:Z

    .line 396
    .line 397
    new-instance v5, Ljava/lang/StringBuilder;

    .line 398
    .line 399
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 400
    .line 401
    .line 402
    const-string v6, "Scheduling a non-expedited job (work ID "

    .line 403
    .line 404
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    const-string v3, ")"

    .line 411
    .line 412
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 420
    .line 421
    .line 422
    move-result-object v5

    .line 423
    invoke-virtual {v5, v8, v3}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {p0 .. p2}, LN3/b;->h(LS3/p;I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 427
    .line 428
    .line 429
    return-void

    .line 430
    :catchall_0
    move-exception v0

    .line 431
    goto :goto_c

    .line 432
    :catch_0
    move-exception v0

    .line 433
    goto :goto_d

    .line 434
    :goto_c
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 435
    .line 436
    .line 437
    move-result-object v3

    .line 438
    new-instance v4, Ljava/lang/StringBuilder;

    .line 439
    .line 440
    const-string v5, "Unable to schedule "

    .line 441
    .line 442
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    invoke-virtual {v3, v8, v2, v0}, LJ3/r;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 453
    .line 454
    .line 455
    :cond_12
    return-void

    .line 456
    :goto_d
    iget-object v2, v1, LN3/b;->a:Landroid/content/Context;

    .line 457
    .line 458
    invoke-static {v2, v7}, LN3/b;->f(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    if-eqz v2, :cond_13

    .line 463
    .line 464
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 465
    .line 466
    .line 467
    move-result v2

    .line 468
    goto :goto_e

    .line 469
    :cond_13
    const/4 v2, 0x0

    .line 470
    :goto_e
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    iget-object v5, v1, LN3/b;->c:LK3/q;

    .line 479
    .line 480
    iget-object v6, v5, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 481
    .line 482
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->u()LS3/q;

    .line 483
    .line 484
    .line 485
    move-result-object v6

    .line 486
    invoke-virtual {v6}, LS3/q;->d()Ljava/util/ArrayList;

    .line 487
    .line 488
    .line 489
    move-result-object v6

    .line 490
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 491
    .line 492
    .line 493
    move-result v6

    .line 494
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 495
    .line 496
    .line 497
    move-result-object v6

    .line 498
    iget-object v7, v5, LK3/q;->b:LJ3/b;

    .line 499
    .line 500
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 501
    .line 502
    iget v7, v7, LJ3/b;->h:I

    .line 503
    .line 504
    const/16 v10, 0x17

    .line 505
    .line 506
    if-ne v9, v10, :cond_14

    .line 507
    .line 508
    div-int/2addr v7, v13

    .line 509
    :cond_14
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 510
    .line 511
    .line 512
    move-result-object v7

    .line 513
    const/4 v9, 0x3

    .line 514
    new-array v9, v9, [Ljava/lang/Object;

    .line 515
    .line 516
    const/16 v16, 0x0

    .line 517
    .line 518
    aput-object v2, v9, v16

    .line 519
    .line 520
    const/4 v4, 0x1

    .line 521
    aput-object v6, v9, v4

    .line 522
    .line 523
    aput-object v7, v9, v13

    .line 524
    .line 525
    const-string v2, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d."

    .line 526
    .line 527
    invoke-static {v3, v2, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    invoke-virtual {v3, v8, v2}, LJ3/r;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 539
    .line 540
    invoke-direct {v3, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 541
    .line 542
    .line 543
    iget-object v0, v5, LK3/q;->b:LJ3/b;

    .line 544
    .line 545
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    throw v3
.end method
