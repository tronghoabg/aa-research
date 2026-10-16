.class public final Lod/p;
.super LT3/d;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lme/a;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lod/p;->c:I

    .line 5
    iput-object p1, p0, Lod/p;->d:Ljava/lang/Object;

    .line 6
    iget-object p1, p1, Lme/a;->c:Ljava/lang/Object;

    check-cast p1, Lod/q;

    .line 7
    iget-object p1, p1, Lod/q;->f:Lmd/q;

    const/4 v0, 0x1

    .line 8
    invoke-direct {p0, p1, v0}, LT3/d;-><init>(Ljava/lang/Object;I)V

    return-void
.end method

.method public constructor <init>(Lod/I0;Lmd/q;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lod/p;->c:I

    .line 1
    iput-object p1, p0, Lod/p;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p2, p1}, LT3/d;-><init>(Ljava/lang/Object;I)V

    return-void
.end method

.method public constructor <init>(Lod/I0;Lod/E;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lod/p;->c:I

    .line 2
    iput-object p2, p0, Lod/p;->d:Ljava/lang/Object;

    .line 3
    iget-object p1, p1, Lod/I0;->c:Lmd/q;

    const/4 p2, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, LT3/d;-><init>(Ljava/lang/Object;I)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    .line 1
    iget v0, p0, Lod/p;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lod/p;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lod/E;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    :goto_0
    monitor-enter v0

    .line 19
    :try_start_0
    iget-object v2, v0, Lod/E;->f:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    iput-object v1, v0, Lod/E;->f:Ljava/util/List;

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    iput-boolean v1, v0, Lod/E;->e:Z

    .line 32
    .line 33
    monitor-exit v0

    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    iget-object v2, v0, Lod/E;->f:Ljava/util/List;

    .line 38
    .line 39
    iput-object v1, v0, Lod/E;->f:Ljava/util/List;

    .line 40
    .line 41
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ljava/lang/Runnable;

    .line 57
    .line 58
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 63
    .line 64
    .line 65
    move-object v1, v2

    .line 66
    goto :goto_0

    .line 67
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    throw v1

    .line 69
    :pswitch_0
    iget-object v0, p0, Lod/p;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Lod/I0;

    .line 72
    .line 73
    invoke-virtual {v0}, Lod/I0;->h()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_1
    iget-object v0, p0, Lod/p;->d:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Lme/a;

    .line 80
    .line 81
    invoke-static {}, LXd/b;->c()V

    .line 82
    .line 83
    .line 84
    :try_start_2
    iget-object v1, v0, Lme/a;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Lod/q;

    .line 87
    .line 88
    iget-object v1, v1, Lod/q;->b:LXd/c;

    .line 89
    .line 90
    invoke-static {}, LXd/b;->a()V

    .line 91
    .line 92
    .line 93
    sget-object v1, LXd/b;->a:LXd/a;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object v1, v0, Lme/a;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, Lmd/k0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 101
    .line 102
    if-eqz v1, :cond_2

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_2
    :try_start_3
    iget-object v1, v0, Lme/a;->a:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, Lmd/e;

    .line 108
    .line 109
    invoke-virtual {v1}, Lmd/e;->m()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :catchall_1
    move-exception v1

    .line 114
    :try_start_4
    sget-object v2, Lmd/k0;->f:Lmd/k0;

    .line 115
    .line 116
    invoke-virtual {v2, v1}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    const-string v2, "Failed to call onReady."

    .line 121
    .line 122
    invoke-virtual {v1, v2}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    iput-object v1, v0, Lme/a;->b:Ljava/lang/Object;

    .line 127
    .line 128
    iget-object v0, v0, Lme/a;->c:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Lod/q;

    .line 131
    .line 132
    iget-object v0, v0, Lod/q;->j:Lod/r;

    .line 133
    .line 134
    invoke-interface {v0, v1}, Lod/r;->g(Lmd/k0;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 135
    .line 136
    .line 137
    :goto_3
    sget-object v0, LXd/b;->a:LXd/a;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :catchall_2
    move-exception v0

    .line 144
    :try_start_5
    sget-object v1, LXd/b;->a:LXd/a;

    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :catchall_3
    move-exception v1

    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    :goto_4
    throw v0

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
