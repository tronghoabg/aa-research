.class public final LRe/Q;
.super LHe/c;
.source "SourceFile"


# instance fields
.field public final b:LHe/c;

.field public final c:Ljava/util/concurrent/atomic/AtomicReference;

.field public final d:I

.field public final e:LRe/N;


# direct methods
.method public constructor <init>(LRe/N;LHe/c;Ljava/util/concurrent/atomic/AtomicReference;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LRe/Q;->e:LRe/N;

    .line 5
    .line 6
    iput-object p2, p0, LRe/Q;->b:LHe/c;

    .line 7
    .line 8
    iput-object p3, p0, LRe/Q;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    iput p4, p0, LRe/Q;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final e(LHe/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, LRe/Q;->e:LRe/N;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LRe/N;->a(LHe/f;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f()V
    .locals 4

    .line 1
    :goto_0
    iget-object v0, p0, LRe/Q;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, LRe/P;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, LRe/P;->f()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    :cond_0
    new-instance v2, LRe/P;

    .line 18
    .line 19
    iget v3, p0, LRe/Q;->d:I

    .line 20
    .line 21
    invoke-direct {v2, v0, v3}, LRe/P;-><init>(Ljava/util/concurrent/atomic/AtomicReference;I)V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_4

    .line 29
    .line 30
    move-object v1, v2

    .line 31
    :cond_2
    iget-object v0, v1, LRe/P;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_3

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    iget-object v0, p0, LRe/Q;->b:LHe/c;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, LHe/c;->d(LHe/f;)V

    .line 50
    .line 51
    .line 52
    :cond_3
    return-void

    .line 53
    :cond_4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-eq v3, v1, :cond_1

    .line 58
    .line 59
    goto :goto_0
.end method
