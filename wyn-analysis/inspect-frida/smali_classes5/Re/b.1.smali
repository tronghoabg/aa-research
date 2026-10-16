.class public abstract LRe/b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements LHe/f;
.implements LRe/f;
.implements Lug/b;


# instance fields
.field public final a:LRe/e;

.field public final b:LJ9/w;

.field public final c:I

.field public final d:I

.field public e:Lug/b;

.field public f:I

.field public g:LOe/h;

.field public volatile h:Z

.field public volatile i:Z

.field public final j:LZe/b;

.field public volatile k:Z

.field public l:I


# direct methods
.method public constructor <init>(LJ9/w;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LRe/b;->b:LJ9/w;

    .line 5
    .line 6
    iput p2, p0, LRe/b;->c:I

    .line 7
    .line 8
    iput p2, p0, LRe/b;->d:I

    .line 9
    .line 10
    new-instance p1, LRe/e;

    .line 11
    .line 12
    invoke-direct {p1, p0}, LRe/e;-><init>(LRe/b;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LRe/b;->a:LRe/e;

    .line 16
    .line 17
    new-instance p1, LZe/b;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, LRe/b;->j:LZe/b;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LRe/b;->l:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, LRe/b;->g:LOe/h;

    .line 7
    .line 8
    invoke-interface {v0, p1}, LOe/h;->offer(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, LRe/b;->e:Lug/b;

    .line 15
    .line 16
    invoke-interface {p1}, Lug/b;->cancel()V

    .line 17
    .line 18
    .line 19
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "Queue full?!"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, p1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-virtual {p0}, LRe/b;->f()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final e(Lug/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, LRe/b;->e:Lug/b;

    .line 2
    .line 3
    invoke-static {v0, p1}, LYe/f;->d(Lug/b;Lug/b;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iput-object p1, p0, LRe/b;->e:Lug/b;

    .line 10
    .line 11
    instance-of v0, p1, LOe/e;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    move-object v0, p1

    .line 16
    check-cast v0, LOe/e;

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    invoke-interface {v0, v1}, LOe/d;->c(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x1

    .line 24
    if-ne v1, v2, :cond_0

    .line 25
    .line 26
    iput v1, p0, LRe/b;->l:I

    .line 27
    .line 28
    iput-object v0, p0, LRe/b;->g:LOe/h;

    .line 29
    .line 30
    iput-boolean v2, p0, LRe/b;->h:Z

    .line 31
    .line 32
    invoke-virtual {p0}, LRe/b;->g()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, LRe/b;->f()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    const/4 v2, 0x2

    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    iput v1, p0, LRe/b;->l:I

    .line 43
    .line 44
    iput-object v0, p0, LRe/b;->g:LOe/h;

    .line 45
    .line 46
    invoke-virtual {p0}, LRe/b;->g()V

    .line 47
    .line 48
    .line 49
    iget v0, p0, LRe/b;->c:I

    .line 50
    .line 51
    int-to-long v0, v0

    .line 52
    invoke-interface {p1, v0, v1}, Lug/b;->request(J)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    new-instance v0, LVe/a;

    .line 57
    .line 58
    iget v1, p0, LRe/b;->c:I

    .line 59
    .line 60
    invoke-direct {v0, v1}, LVe/a;-><init>(I)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, LRe/b;->g:LOe/h;

    .line 64
    .line 65
    invoke-virtual {p0}, LRe/b;->g()V

    .line 66
    .line 67
    .line 68
    iget v0, p0, LRe/b;->c:I

    .line 69
    .line 70
    int-to-long v0, v0

    .line 71
    invoke-interface {p1, v0, v1}, Lug/b;->request(J)V

    .line 72
    .line 73
    .line 74
    :cond_2
    return-void
.end method

.method public abstract f()V
.end method

.method public abstract g()V
.end method

.method public final onComplete()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LRe/b;->h:Z

    .line 3
    .line 4
    invoke-virtual {p0}, LRe/b;->f()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
