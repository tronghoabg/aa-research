.class public abstract LXe/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOe/a;
.implements LOe/e;


# instance fields
.field public final a:LOe/a;

.field public b:Lug/b;

.field public c:LOe/e;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(LOe/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LXe/a;->a:LOe/a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LXe/a;->b:Lug/b;

    .line 5
    .line 6
    invoke-interface {v0}, Lug/b;->cancel()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, LXe/a;->onError(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public c(I)I
    .locals 2

    .line 1
    iget-object v0, p0, LXe/a;->c:LOe/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    and-int/lit8 v1, p1, 0x4

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p1}, LOe/d;->c(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iput p1, p0, LXe/a;->e:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :cond_1
    :goto_0
    return p1
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, LXe/a;->b:Lug/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lug/b;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final clear()V
    .locals 1

    .line 1
    iget-object v0, p0, LXe/a;->c:LOe/e;

    .line 2
    .line 3
    invoke-interface {v0}, LOe/h;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(Lug/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LXe/a;->b:Lug/b;

    .line 2
    .line 3
    invoke-static {v0, p1}, LYe/f;->d(Lug/b;Lug/b;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iput-object p1, p0, LXe/a;->b:Lug/b;

    .line 10
    .line 11
    instance-of v0, p1, LOe/e;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, LOe/e;

    .line 16
    .line 17
    iput-object p1, p0, LXe/a;->c:LOe/e;

    .line 18
    .line 19
    :cond_0
    iget-object p1, p0, LXe/a;->a:LOe/a;

    .line 20
    .line 21
    invoke-interface {p1, p0}, LHe/f;->e(Lug/b;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public final isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, LXe/a;->c:LOe/e;

    .line 2
    .line 3
    invoke-interface {v0}, LOe/h;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final offer(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Should not be called!"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public onComplete()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LXe/a;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, LXe/a;->d:Z

    .line 8
    .line 9
    iget-object v0, p0, LXe/a;->a:LOe/a;

    .line 10
    .line 11
    invoke-interface {v0}, LHe/f;->onComplete()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LXe/a;->d:Z

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
    iput-boolean v0, p0, LXe/a;->d:Z

    .line 11
    .line 12
    iget-object v0, p0, LXe/a;->a:LOe/a;

    .line 13
    .line 14
    invoke-interface {v0, p1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final request(J)V
    .locals 1

    .line 1
    iget-object v0, p0, LXe/a;->b:Lug/b;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lug/b;->request(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
