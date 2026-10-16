.class public final Lod/n;
.super LT3/d;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Lme/a;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lme/a;LL4/g;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lod/n;->c:I

    .line 5
    iput-object p1, p0, Lod/n;->d:Lme/a;

    iput-object p2, p0, Lod/n;->e:Ljava/lang/Object;

    .line 6
    iget-object p1, p1, Lme/a;->c:Ljava/lang/Object;

    check-cast p1, Lod/q;

    .line 7
    iget-object p1, p1, Lod/q;->f:Lmd/q;

    const/4 p2, 0x1

    .line 8
    invoke-direct {p0, p1, p2}, LT3/d;-><init>(Ljava/lang/Object;I)V

    return-void
.end method

.method public constructor <init>(Lme/a;Lmd/b0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lod/n;->c:I

    .line 1
    iput-object p1, p0, Lod/n;->d:Lme/a;

    iput-object p2, p0, Lod/n;->e:Ljava/lang/Object;

    .line 2
    iget-object p1, p1, Lme/a;->c:Ljava/lang/Object;

    check-cast p1, Lod/q;

    .line 3
    iget-object p1, p1, Lod/q;->f:Lmd/q;

    const/4 p2, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, LT3/d;-><init>(Ljava/lang/Object;I)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    .line 1
    iget v0, p0, Lod/n;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, LXd/b;->c()V

    .line 7
    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, Lod/n;->d:Lme/a;

    .line 10
    .line 11
    iget-object v0, v0, Lme/a;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lod/q;

    .line 14
    .line 15
    iget-object v0, v0, Lod/q;->b:LXd/c;

    .line 16
    .line 17
    invoke-static {}, LXd/b;->a()V

    .line 18
    .line 19
    .line 20
    sget-object v0, LXd/b;->a:LXd/a;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lod/n;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    :try_start_1
    sget-object v1, LXd/b;->a:LXd/a;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_1
    move-exception v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    throw v0

    .line 44
    :pswitch_0
    iget-object v0, p0, Lod/n;->d:Lme/a;

    .line 45
    .line 46
    invoke-static {}, LXd/b;->c()V

    .line 47
    .line 48
    .line 49
    :try_start_2
    iget-object v1, v0, Lme/a;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Lod/q;

    .line 52
    .line 53
    iget-object v1, v1, Lod/q;->b:LXd/c;

    .line 54
    .line 55
    invoke-static {}, LXd/b;->a()V

    .line 56
    .line 57
    .line 58
    sget-object v1, LXd/b;->a:LXd/a;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object v1, v0, Lme/a;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lmd/k0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 66
    .line 67
    if-eqz v1, :cond_0

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_0
    :try_start_3
    iget-object v1, v0, Lme/a;->a:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, Lmd/e;

    .line 73
    .line 74
    iget-object v2, p0, Lod/n;->e:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, Lmd/b0;

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Lmd/e;->k(Lmd/b0;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :catchall_2
    move-exception v1

    .line 83
    :try_start_4
    sget-object v2, Lmd/k0;->f:Lmd/k0;

    .line 84
    .line 85
    invoke-virtual {v2, v1}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    const-string v2, "Failed to read headers"

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iput-object v1, v0, Lme/a;->b:Ljava/lang/Object;

    .line 96
    .line 97
    iget-object v0, v0, Lme/a;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Lod/q;

    .line 100
    .line 101
    iget-object v0, v0, Lod/q;->j:Lod/r;

    .line 102
    .line 103
    invoke-interface {v0, v1}, Lod/r;->g(Lmd/k0;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 104
    .line 105
    .line 106
    :goto_1
    sget-object v0, LXd/b;->a:LXd/a;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :catchall_3
    move-exception v0

    .line 113
    :try_start_5
    sget-object v1, LXd/b;->a:LXd/a;

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :catchall_4
    move-exception v1

    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    :goto_2
    throw v0

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e()V
    .locals 6

    .line 1
    iget-object v0, p0, Lod/n;->d:Lme/a;

    .line 2
    .line 3
    iget-object v1, v0, Lme/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lmd/k0;

    .line 6
    .line 7
    iget-object v2, v0, Lme/a;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lod/q;

    .line 10
    .line 11
    iget-object v3, p0, Lod/n;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, LL4/g;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    sget-object v0, Lod/a0;->a:Ljava/util/logging/Logger;

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v3}, LL4/g;->a()Ljava/io/InputStream;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-static {v0}, Lod/a0;->b(Ljava/io/Closeable;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :goto_1
    :try_start_0
    invoke-virtual {v3}, LL4/g;->a()Ljava/io/InputStream;

    .line 30
    .line 31
    .line 32
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    :try_start_1
    iget-object v4, v0, Lme/a;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v4, Lmd/e;

    .line 38
    .line 39
    iget-object v5, v2, Lod/q;->a:LF6/r;

    .line 40
    .line 41
    invoke-virtual {v5, v1}, LF6/r;->e(Ljava/io/InputStream;)Lcom/google/protobuf/MessageLite;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v4, v5}, Lmd/e;->l(Lcom/google/protobuf/MessageLite;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    .line 47
    .line 48
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception v1

    .line 53
    goto :goto_2

    .line 54
    :catchall_1
    move-exception v4

    .line 55
    invoke-static {v1}, Lod/a0;->b(Ljava/io/Closeable;)V

    .line 56
    .line 57
    .line 58
    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    :goto_2
    sget-object v4, Lod/a0;->a:Ljava/util/logging/Logger;

    .line 60
    .line 61
    :goto_3
    invoke-virtual {v3}, LL4/g;->a()Ljava/io/InputStream;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    if-eqz v4, :cond_1

    .line 66
    .line 67
    invoke-static {v4}, Lod/a0;->b(Ljava/io/Closeable;)V

    .line 68
    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_1
    sget-object v3, Lmd/k0;->f:Lmd/k0;

    .line 72
    .line 73
    invoke-virtual {v3, v1}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const-string v3, "Failed to read message."

    .line 78
    .line 79
    invoke-virtual {v1, v3}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iput-object v1, v0, Lme/a;->b:Ljava/lang/Object;

    .line 84
    .line 85
    iget-object v0, v2, Lod/q;->j:Lod/r;

    .line 86
    .line 87
    invoke-interface {v0, v1}, Lod/r;->g(Lmd/k0;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    return-void
.end method
