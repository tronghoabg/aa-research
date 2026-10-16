.class public final Lod/G0;
.super Lmd/d;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lod/J0;


# direct methods
.method public constructor <init>(Lod/J0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lod/G0;->a:Lod/J0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lod/G0;->a:Lod/J0;

    .line 2
    .line 3
    iget-object v0, v0, Lod/J0;->b:Ljava/lang/String;

    .line 4
    .line 5
    return-object v0
.end method

.method public final h(LF6/r;Lmd/c;)Lmd/f;
    .locals 7

    .line 1
    new-instance v0, Lod/q;

    .line 2
    .line 3
    iget-object v1, p0, Lod/G0;->a:Lod/J0;

    .line 4
    .line 5
    iget-object v1, v1, Lod/J0;->d:Lod/M0;

    .line 6
    .line 7
    sget-object v2, Lod/M0;->d0:Ljava/util/logging/Logger;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, p2, Lmd/c;->b:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    iget-object v2, v1, Lod/M0;->h:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    :cond_0
    iget-object v1, p0, Lod/G0;->a:Lod/J0;

    .line 19
    .line 20
    iget-object v1, v1, Lod/J0;->d:Lod/M0;

    .line 21
    .line 22
    iget-object v4, v1, Lod/M0;->a0:Ld7/j;

    .line 23
    .line 24
    iget-boolean v1, v1, Lod/M0;->J:Z

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    move-object v5, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    iget-object v1, p0, Lod/G0;->a:Lod/J0;

    .line 32
    .line 33
    iget-object v1, v1, Lod/J0;->d:Lod/M0;

    .line 34
    .line 35
    iget-object v1, v1, Lod/M0;->f:Lod/j;

    .line 36
    .line 37
    iget-object v1, v1, Lod/j;->a:Lpd/g;

    .line 38
    .line 39
    iget-object v1, v1, Lpd/g;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :goto_1
    iget-object v1, p0, Lod/G0;->a:Lod/J0;

    .line 43
    .line 44
    iget-object v1, v1, Lod/J0;->d:Lod/M0;

    .line 45
    .line 46
    iget-object v6, v1, Lod/M0;->M:LVa/X7;

    .line 47
    .line 48
    move-object v1, p1

    .line 49
    move-object v3, p2

    .line 50
    invoke-direct/range {v0 .. v6}, Lod/q;-><init>(LF6/r;Ljava/util/concurrent/Executor;Lmd/c;Ld7/j;Ljava/util/concurrent/ScheduledExecutorService;LVa/X7;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lod/G0;->a:Lod/J0;

    .line 54
    .line 55
    iget-object p1, p1, Lod/J0;->d:Lod/M0;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lod/G0;->a:Lod/J0;

    .line 61
    .line 62
    iget-object p1, p1, Lod/J0;->d:Lod/M0;

    .line 63
    .line 64
    iget-object p1, p1, Lod/M0;->n:Lmd/t;

    .line 65
    .line 66
    iput-object p1, v0, Lod/q;->p:Lmd/t;

    .line 67
    .line 68
    return-object v0
.end method
