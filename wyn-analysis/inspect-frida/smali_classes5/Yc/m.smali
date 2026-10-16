.class public final LYc/m;
.super Landroid/app/job/JobServiceEngine;
.source "SourceFile"


# instance fields
.field public final a:Lio/flutter/plugins/firebase/messaging/a;

.field public final b:Ljava/lang/Object;

.field public c:Landroid/app/job/JobParameters;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/firebase/messaging/a;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/app/job/JobServiceEngine;-><init>(Landroid/app/Service;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LYc/m;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p1, p0, LYc/m;->a:Lio/flutter/plugins/firebase/messaging/a;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()LYc/l;
    .locals 5

    .line 1
    iget-object v0, p0, LYc/m;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LYc/m;->c:Landroid/app/job/JobParameters;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    return-object v2

    .line 11
    :cond_0
    :try_start_1
    invoke-static {v1}, LU1/b;->c(Landroid/app/job/JobParameters;)Landroid/app/job/JobWorkItem;

    .line 12
    .line 13
    .line 14
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-static {v1}, LU1/b;->e(Landroid/app/job/JobWorkItem;)Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v2, p0, LYc/m;->a:Lio/flutter/plugins/firebase/messaging/a;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, LYc/l;

    .line 32
    .line 33
    invoke-direct {v0, p0, v1}, LYc/l;-><init>(LYc/m;Landroid/app/job/JobWorkItem;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception v1

    .line 40
    :try_start_3
    const-string v3, "JobServiceEngineImpl"

    .line 41
    .line 42
    const-string v4, "Failed to run mParams.dequeueWork()!"

    .line 43
    .line 44
    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 45
    .line 46
    .line 47
    monitor-exit v0

    .line 48
    :cond_1
    return-object v2

    .line 49
    :goto_0
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 50
    throw v1
.end method

.method public final onStartJob(Landroid/app/job/JobParameters;)Z
    .locals 1

    .line 1
    iput-object p1, p0, LYc/m;->c:Landroid/app/job/JobParameters;

    .line 2
    .line 3
    iget-object p1, p0, LYc/m;->a:Lio/flutter/plugins/firebase/messaging/a;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, Lio/flutter/plugins/firebase/messaging/a;->a(Z)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1
.end method

.method public final onStopJob(Landroid/app/job/JobParameters;)Z
    .locals 1

    .line 1
    iget-object p1, p0, LYc/m;->a:Lio/flutter/plugins/firebase/messaging/a;

    .line 2
    .line 3
    iget-object p1, p1, Lio/flutter/plugins/firebase/messaging/a;->c:LG9/e;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p1, LG9/e;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lio/flutter/plugins/firebase/messaging/a;

    .line 10
    .line 11
    invoke-virtual {p1}, Lio/flutter/plugins/firebase/messaging/a;->d()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p1, p0, LYc/m;->b:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter p1

    .line 17
    const/4 v0, 0x0

    .line 18
    :try_start_0
    iput-object v0, p0, LYc/m;->c:Landroid/app/job/JobParameters;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    monitor-exit p1

    .line 22
    return v0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v0
.end method
