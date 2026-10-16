.class public final Lnd/b;
.super Lmd/S;
.source "SourceFile"


# instance fields
.field public final a:Lmd/S;

.field public final b:Landroid/content/Context;

.field public final c:Landroid/net/ConnectivityManager;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lmd/S;Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    iput-object v0, p0, Lnd/b;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p1, p0, Lnd/b;->a:Lmd/S;

    .line 12
    .line 13
    iput-object p2, p0, Lnd/b;->b:Landroid/content/Context;

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    const-string p1, "connectivity"

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 24
    .line 25
    iput-object p1, p0, Lnd/b;->c:Landroid/net/ConnectivityManager;

    .line 26
    .line 27
    :try_start_0
    invoke-virtual {p0}, Lnd/b;->o()V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catch_0
    move-exception p1

    .line 32
    const-string p2, "AndroidChannelBuilder"

    .line 33
    .line 34
    const-string v0, "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?"

    .line 35
    .line 36
    invoke-static {p2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    const/4 p1, 0x0

    .line 41
    iput-object p1, p0, Lnd/b;->c:Landroid/net/ConnectivityManager;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lnd/b;->a:Lmd/S;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmd/d;->g()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final h(LF6/r;Lmd/c;)Lmd/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lnd/b;->a:Lmd/S;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lmd/d;->h(LF6/r;Lmd/c;)Lmd/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final i(J)Z
    .locals 1

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    iget-object v0, p0, Lnd/b;->a:Lmd/S;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lmd/S;->i(J)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, Lnd/b;->a:Lmd/S;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmd/S;->j()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final k()Lmd/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lnd/b;->a:Lmd/S;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmd/S;->k()Lmd/m;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final l(Lmd/m;Lv9/n;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnd/b;->a:Lmd/S;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lmd/S;->l(Lmd/m;Lv9/n;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final m()Lmd/S;
    .locals 2

    .line 1
    iget-object v0, p0, Lnd/b;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lnd/b;->e:Ljava/lang/Runnable;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, Lnd/b;->e:Ljava/lang/Runnable;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    iget-object v0, p0, Lnd/b;->a:Lmd/S;

    .line 19
    .line 20
    invoke-virtual {v0}, Lmd/S;->m()Lmd/S;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw v1
.end method

.method public final n()Lmd/S;
    .locals 2

    .line 1
    iget-object v0, p0, Lnd/b;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lnd/b;->e:Ljava/lang/Runnable;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, Lnd/b;->e:Ljava/lang/Runnable;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    iget-object v0, p0, Lnd/b;->a:Lmd/S;

    .line 19
    .line 20
    invoke-virtual {v0}, Lmd/S;->n()Lmd/S;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw v1
.end method

.method public final o()V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lnd/b;->c:Landroid/net/ConnectivityManager;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, LQ3/h;

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    invoke-direct {v1, p0, v2}, LQ3/h;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Ld2/b;->q(Landroid/net/ConnectivityManager;LQ3/h;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, LL7/b;

    .line 21
    .line 22
    const/16 v2, 0x15

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-direct {v0, p0, v3, v1, v2}, LL7/b;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lnd/b;->e:Ljava/lang/Runnable;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance v0, Lnd/a;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, p0, v1}, Lnd/a;-><init>(Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    new-instance v1, Landroid/content/IntentFilter;

    .line 38
    .line 39
    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 40
    .line 41
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lnd/b;->b:Landroid/content/Context;

    .line 45
    .line 46
    invoke-virtual {v2, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 47
    .line 48
    .line 49
    new-instance v1, LL7/b;

    .line 50
    .line 51
    const/16 v2, 0x16

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    invoke-direct {v1, p0, v3, v0, v2}, LL7/b;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 55
    .line 56
    .line 57
    iput-object v1, p0, Lnd/b;->e:Ljava/lang/Runnable;

    .line 58
    .line 59
    return-void
.end method
