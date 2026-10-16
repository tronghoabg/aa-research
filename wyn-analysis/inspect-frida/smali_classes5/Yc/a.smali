.class public final synthetic LYc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LDd/c;

.field public final synthetic b:Loc/d;

.field public final synthetic c:Landroid/os/Handler;

.field public final synthetic d:La2/v;

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(LDd/c;Loc/d;Landroid/os/Handler;La2/v;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYc/a;->a:LDd/c;

    iput-object p2, p0, LYc/a;->b:Loc/d;

    iput-object p3, p0, LYc/a;->c:Landroid/os/Handler;

    iput-object p4, p0, LYc/a;->d:La2/v;

    iput-wide p5, p0, LYc/a;->e:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v1, p0, LYc/a;->a:LDd/c;

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lka/e0;->h:Landroid/content/Context;

    .line 7
    .line 8
    iget-object v2, p0, LYc/a;->b:Loc/d;

    .line 9
    .line 10
    invoke-virtual {v2, v0}, Loc/d;->c(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    sget-object v6, Lka/e0;->h:Landroid/content/Context;

    .line 14
    .line 15
    new-instance v0, LYc/b;

    .line 16
    .line 17
    iget-object v3, p0, LYc/a;->d:La2/v;

    .line 18
    .line 19
    iget-wide v4, p0, LYc/a;->e:J

    .line 20
    .line 21
    invoke-direct/range {v0 .. v5}, LYc/b;-><init>(LDd/c;Loc/d;La2/v;J)V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    if-ne v1, v3, :cond_2

    .line 33
    .line 34
    iget-object v1, v2, Loc/d;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, La2/k;

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-boolean v1, v2, Loc/d;->b:Z

    .line 41
    .line 42
    iget-object v5, p0, LYc/a;->c:Landroid/os/Handler;

    .line 43
    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-virtual {v5, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    move-object v3, v2

    .line 51
    new-instance v2, Loc/b;

    .line 52
    .line 53
    const/4 v7, 0x0

    .line 54
    move-object v4, v6

    .line 55
    move-object v6, v0

    .line 56
    invoke-direct/range {v2 .. v7}, Loc/b;-><init>(Loc/d;Landroid/content/Context;Landroid/os/Handler;LYc/b;I)V

    .line 57
    .line 58
    .line 59
    move-object v0, v2

    .line 60
    move-object v2, v3

    .line 61
    iget-object v1, v2, Loc/d;->f:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Ljava/util/concurrent/ExecutorService;

    .line 64
    .line 65
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string v1, "ensureInitializationComplete must be called after startInitialization"

    .line 72
    .line 73
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v0

    .line 77
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    const-string v1, "ensureInitializationComplete must be called on the main thread"

    .line 80
    .line 81
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v0
.end method
