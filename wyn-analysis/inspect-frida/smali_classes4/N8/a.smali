.class public final synthetic LN8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ8/a;
.implements LP8/a;
.implements LO9/a;


# instance fields
.field public final synthetic a:LN8/b;


# direct methods
.method public synthetic constructor <init>(LN8/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN8/a;->a:LN8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LR8/r;)V
    .locals 2

    .line 1
    iget-object v0, p0, LN8/a;->a:LN8/b;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, LN8/b;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, LQ8/a;

    .line 7
    .line 8
    instance-of v1, v1, LQ8/b;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, v0, LN8/b;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v1, v0, LN8/b;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, LQ8/a;

    .line 22
    .line 23
    invoke-interface {v1, p1}, LQ8/a;->b(LR8/r;)V

    .line 24
    .line 25
    .line 26
    monitor-exit v0

    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw p1
.end method

.method public f(LO9/b;)V
    .locals 7

    .line 1
    iget-object v0, p0, LN8/a;->a:LN8/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, LO8/c;->a:LO8/c;

    .line 7
    .line 8
    const-string v2, "AnalyticsConnector now available."

    .line 9
    .line 10
    invoke-virtual {v1, v2}, LO8/c;->c(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, LO9/b;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lw8/d;

    .line 18
    .line 19
    new-instance v2, LS3/l;

    .line 20
    .line 21
    invoke-direct {v2, p1}, LS3/l;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v3, LS3/e;

    .line 25
    .line 26
    const/16 v4, 0xc

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-direct {v3, v4, v5}, LS3/e;-><init>(IZ)V

    .line 30
    .line 31
    .line 32
    const-string v4, "clx"

    .line 33
    .line 34
    invoke-interface {p1, v4, v3}, Lw8/d;->h(Ljava/lang/String;Lw8/b;)Lw8/a;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    const/4 v5, 0x0

    .line 39
    if-nez v4, :cond_2

    .line 40
    .line 41
    const-string v4, "FirebaseCrashlytics"

    .line 42
    .line 43
    const/4 v6, 0x3

    .line 44
    invoke-static {v4, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    const-string v6, "Could not register AnalyticsConnectorListener with Crashlytics origin."

    .line 51
    .line 52
    invoke-static {v4, v6, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 53
    .line 54
    .line 55
    :cond_0
    const-string v6, "crash"

    .line 56
    .line 57
    invoke-interface {p1, v6, v3}, Lw8/d;->h(Ljava/lang/String;Lw8/b;)Lw8/a;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-eqz p1, :cond_1

    .line 62
    .line 63
    const-string v6, "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version."

    .line 64
    .line 65
    invoke-static {v4, v6, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 66
    .line 67
    .line 68
    :cond_1
    move-object v4, p1

    .line 69
    :cond_2
    if-eqz v4, :cond_4

    .line 70
    .line 71
    const-string p1, "Registered Firebase Analytics listener."

    .line 72
    .line 73
    invoke-virtual {v1, p1}, LO8/c;->c(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    new-instance p1, Ly3/j;

    .line 77
    .line 78
    const/16 v1, 0x14

    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    invoke-direct {p1, v1, v4}, Ly3/j;-><init>(IZ)V

    .line 82
    .line 83
    .line 84
    new-instance v1, LG9/e;

    .line 85
    .line 86
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 87
    .line 88
    invoke-direct {v1, v2}, LG9/e;-><init>(LS3/l;)V

    .line 89
    .line 90
    .line 91
    monitor-enter v0

    .line 92
    :try_start_0
    iget-object v2, v0, LN8/b;->a:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v2, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-eqz v4, :cond_3

    .line 105
    .line 106
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    check-cast v4, LR8/r;

    .line 111
    .line 112
    invoke-virtual {p1, v4}, Ly3/j;->b(LR8/r;)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :catchall_0
    move-exception p1

    .line 117
    goto :goto_1

    .line 118
    :cond_3
    iput-object p1, v3, LS3/e;->c:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v1, v3, LS3/e;->b:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object p1, v0, LN8/b;->c:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v1, v0, LN8/b;->b:Ljava/lang/Object;

    .line 125
    .line 126
    monitor-exit v0

    .line 127
    return-void

    .line 128
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    throw p1

    .line 130
    :cond_4
    const-string p1, "Could not register Firebase Analytics listener; a listener is already registered."

    .line 131
    .line 132
    invoke-virtual {v1, p1, v5}, LO8/c;->g(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public q(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, LN8/a;->a:LN8/b;

    .line 2
    .line 3
    iget-object v0, v0, LN8/b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LP8/a;

    .line 6
    .line 7
    invoke-interface {v0, p1}, LP8/a;->q(Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
