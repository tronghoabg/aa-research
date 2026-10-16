.class public final LRe/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHe/f;
.implements LJe/b;


# instance fields
.field public final a:LHe/h;

.field public b:Lug/b;

.field public c:J

.field public d:Z


# direct methods
.method public constructor <init>(LHe/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LRe/s;->a:LHe/h;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, LRe/s;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-wide v0, p0, LRe/s;->c:J

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v2, v0, v2

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, LRe/s;->d:Z

    .line 16
    .line 17
    iget-object v0, p0, LRe/s;->b:Lug/b;

    .line 18
    .line 19
    invoke-interface {v0}, Lug/b;->cancel()V

    .line 20
    .line 21
    .line 22
    sget-object v0, LYe/f;->a:LYe/f;

    .line 23
    .line 24
    iput-object v0, p0, LRe/s;->b:Lug/b;

    .line 25
    .line 26
    iget-object v0, p0, LRe/s;->a:LHe/h;

    .line 27
    .line 28
    invoke-interface {v0, p1}, LHe/h;->onSuccess(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const-wide/16 v2, 0x1

    .line 33
    .line 34
    add-long/2addr v0, v2

    .line 35
    iput-wide v0, p0, LRe/s;->c:J

    .line 36
    .line 37
    return-void
.end method

.method public final dispose()V
    .locals 1

    .line 1
    iget-object v0, p0, LRe/s;->b:Lug/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lug/b;->cancel()V

    .line 4
    .line 5
    .line 6
    sget-object v0, LYe/f;->a:LYe/f;

    .line 7
    .line 8
    iput-object v0, p0, LRe/s;->b:Lug/b;

    .line 9
    .line 10
    return-void
.end method

.method public final e(Lug/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, LRe/s;->b:Lug/b;

    .line 2
    .line 3
    invoke-static {v0, p1}, LYe/f;->d(Lug/b;Lug/b;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, LRe/s;->b:Lug/b;

    .line 10
    .line 11
    iget-object v0, p0, LRe/s;->a:LHe/h;

    .line 12
    .line 13
    invoke-interface {v0, p0}, LHe/h;->a(LJe/b;)V

    .line 14
    .line 15
    .line 16
    const-wide v0, 0x7fffffffffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0, v1}, Lug/b;->request(J)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final onComplete()V
    .locals 1

    .line 1
    sget-object v0, LYe/f;->a:LYe/f;

    .line 2
    .line 3
    iput-object v0, p0, LRe/s;->b:Lug/b;

    .line 4
    .line 5
    iget-boolean v0, p0, LRe/s;->d:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, LRe/s;->d:Z

    .line 11
    .line 12
    iget-object v0, p0, LRe/s;->a:LHe/h;

    .line 13
    .line 14
    invoke-interface {v0}, LHe/h;->onComplete()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LRe/s;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, LRe/s;->d:Z

    .line 11
    .line 12
    sget-object v0, LYe/f;->a:LYe/f;

    .line 13
    .line 14
    iput-object v0, p0, LRe/s;->b:Lug/b;

    .line 15
    .line 16
    iget-object v0, p0, LRe/s;->a:LHe/h;

    .line 17
    .line 18
    invoke-interface {v0, p1}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
