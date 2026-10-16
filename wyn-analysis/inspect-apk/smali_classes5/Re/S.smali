.class public final LRe/S;
.super LHe/c;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/Object;

.field public final c:LLe/c;


# direct methods
.method public constructor <init>(Ljava/lang/Object;LLe/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LRe/S;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, LRe/S;->c:LLe/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e(LHe/f;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, LRe/S;->c:LLe/c;

    .line 2
    .line 3
    iget-object v1, p0, LRe/S;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0, v1}, LLe/c;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "The mapper returned a null Publisher"

    .line 10
    .line 11
    invoke-static {v0, v1}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v0, Lug/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    .line 16
    instance-of v1, v0, Ljava/util/concurrent/Callable;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    :try_start_1
    check-cast v0, Ljava/util/concurrent/Callable;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, LYe/d;->a(LHe/f;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    new-instance v1, LYe/e;

    .line 33
    .line 34
    invoke-direct {v1, p1, v0}, LYe/e;-><init>(LHe/f;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, v1}, LHe/f;->e(Lug/b;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0, p1}, LYe/d;->b(Ljava/lang/Throwable;LHe/f;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    invoke-interface {v0, p1}, Lug/a;->a(LHe/f;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :catchall_1
    move-exception v0

    .line 54
    invoke-static {v0, p1}, LYe/d;->b(Ljava/lang/Throwable;LHe/f;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method
