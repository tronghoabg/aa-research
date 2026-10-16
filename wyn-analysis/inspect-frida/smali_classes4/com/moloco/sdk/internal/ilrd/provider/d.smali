.class public final Lcom/moloco/sdk/internal/ilrd/provider/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/internal/ilrd/u;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LKd/a;

.field public final c:Lcom/moloco/sdk/internal/ilrd/model/a;

.field public final d:Lef/p;

.field public final e:Lef/p;

.field public final f:LHf/x0;

.field public final g:LHf/j0;


# direct methods
.method public constructor <init>(Landroid/content/Context;LKd/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/provider/d;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/moloco/sdk/internal/ilrd/provider/d;->b:LKd/a;

    .line 7
    .line 8
    sget-object p1, Lcom/moloco/sdk/internal/ilrd/model/a;->a:Lcom/moloco/sdk/internal/ilrd/model/a;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/provider/d;->c:Lcom/moloco/sdk/internal/ilrd/model/a;

    .line 11
    .line 12
    new-instance p1, Lcom/moloco/sdk/internal/ilrd/provider/a;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p1, p0, p2}, Lcom/moloco/sdk/internal/ilrd/provider/a;-><init>(Lcom/moloco/sdk/internal/ilrd/provider/d;I)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/provider/d;->d:Lef/p;

    .line 23
    .line 24
    new-instance p1, Lcom/moloco/sdk/internal/ilrd/provider/a;

    .line 25
    .line 26
    const/4 p2, 0x1

    .line 27
    invoke-direct {p1, p0, p2}, Lcom/moloco/sdk/internal/ilrd/provider/a;-><init>(Lcom/moloco/sdk/internal/ilrd/provider/d;I)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/provider/d;->e:Lef/p;

    .line 35
    .line 36
    sget-object p1, Lcom/moloco/sdk/internal/ilrd/D;->a:Lcom/moloco/sdk/internal/ilrd/D;

    .line 37
    .line 38
    invoke-static {p1}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/provider/d;->f:LHf/x0;

    .line 43
    .line 44
    const/4 p1, 0x7

    .line 45
    const/4 p2, 0x0

    .line 46
    invoke-static {p2, p2, p1}, LHf/k0;->b(III)LHf/j0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lcom/moloco/sdk/internal/ilrd/provider/d;->g:LHf/j0;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a()Lcom/moloco/sdk/internal/ilrd/model/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/ilrd/provider/d;->c:Lcom/moloco/sdk/internal/ilrd/model/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final declared-synchronized b()Ljava/lang/Object;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, Lcom/applovin/communicator/AppLovinCommunicatorMessage;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    .line 4
    :try_start_1
    invoke-static {}, Lcom/applovin/communicator/AppLovinCommunicator;->getInstance()Lcom/applovin/communicator/AppLovinCommunicator;

    .line 5
    .line 6
    .line 7
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    :try_start_2
    iget-object v0, p0, Lcom/moloco/sdk/internal/ilrd/provider/d;->a:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/applovin/communicator/AppLovinCommunicator;->getInstance(Landroid/content/Context;)Lcom/applovin/communicator/AppLovinCommunicator;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 15
    goto :goto_0

    .line 16
    :catchall_1
    move-exception v0

    .line 17
    :try_start_3
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-static {v0}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    check-cast v0, Lcom/applovin/communicator/AppLovinCommunicator;

    .line 28
    .line 29
    new-instance v1, Lcom/moloco/sdk/internal/ilrd/provider/c;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Lcom/moloco/sdk/internal/ilrd/provider/c;-><init>(Lcom/moloco/sdk/internal/ilrd/provider/d;)V

    .line 32
    .line 33
    .line 34
    const-string v2, "max_revenue_events"

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Lcom/applovin/communicator/AppLovinCommunicator;->subscribe(Lcom/applovin/communicator/AppLovinCommunicatorSubscriber;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lef/C;->a:Lef/C;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    invoke-static {v1}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_1
    invoke-static {v0}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const/4 v2, 0x0

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    iget-object v3, p0, Lcom/moloco/sdk/internal/ilrd/provider/d;->f:LHf/x0;

    .line 54
    .line 55
    new-instance v4, Lcom/moloco/sdk/internal/ilrd/B;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-direct {v4, v1}, Lcom/moloco/sdk/internal/ilrd/B;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v2, v4}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :catchall_2
    move-exception v0

    .line 72
    goto :goto_3

    .line 73
    :cond_1
    :goto_2
    instance-of v1, v0, Lef/m;

    .line 74
    .line 75
    if-nez v1, :cond_2

    .line 76
    .line 77
    move-object v1, v0

    .line 78
    check-cast v1, Lef/C;

    .line 79
    .line 80
    iget-object v1, p0, Lcom/moloco/sdk/internal/ilrd/provider/d;->f:LHf/x0;

    .line 81
    .line 82
    sget-object v3, Lcom/moloco/sdk/internal/ilrd/C;->a:Lcom/moloco/sdk/internal/ilrd/C;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v2, v3}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 88
    .line 89
    .line 90
    :cond_2
    monitor-exit p0

    .line 91
    return-object v0

    .line 92
    :goto_3
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 93
    throw v0
.end method

.method public final c()LHf/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/ilrd/provider/d;->e:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LHf/g0;

    .line 8
    .line 9
    return-object v0
.end method

.method public final getState()LHf/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/ilrd/provider/d;->d:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LHf/v0;

    .line 8
    .line 9
    return-object v0
.end method
