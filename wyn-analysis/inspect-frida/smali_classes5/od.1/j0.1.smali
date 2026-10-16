.class public final Lod/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod/r;


# instance fields
.field public final synthetic a:Lod/r;

.field public final synthetic b:Lod/k0;


# direct methods
.method public constructor <init>(Lod/k0;Lod/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lod/j0;->b:Lod/k0;

    .line 5
    .line 6
    iput-object p2, p0, Lod/j0;->a:Lod/r;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lmd/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/j0;->a:Lod/r;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lod/X1;->a(Lmd/k;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/j0;->a:Lod/r;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lod/r;->b(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(Ltd/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/j0;->a:Lod/r;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lod/X1;->c(Ltd/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/j0;->a:Lod/r;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lod/X1;->d(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/j0;->a:Lod/r;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lod/r;->e(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(Lmd/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/j0;->a:Lod/r;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lod/r;->f(Lmd/r;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/j0;->a:Lod/r;

    .line 2
    .line 3
    invoke-interface {v0}, Lod/X1;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g(Lmd/k0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/j0;->a:Lod/r;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lod/r;->g(Lmd/k0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/j0;->a:Lod/r;

    .line 2
    .line 3
    invoke-interface {v0}, Lod/X1;->h()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i(LN/J0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/j0;->a:Lod/r;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lod/r;->i(LN/J0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final isReady()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lod/j0;->a:Lod/r;

    .line 2
    .line 3
    invoke-interface {v0}, Lod/X1;->isReady()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/j0;->a:Lod/r;

    .line 2
    .line 3
    invoke-interface {v0}, Lod/r;->j()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final k(Lod/t;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lod/j0;->b:Lod/k0;

    .line 2
    .line 3
    iget-object v0, v0, Lod/k0;->b:LVa/X7;

    .line 4
    .line 5
    iget-object v1, v0, LVa/X7;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lod/w0;

    .line 8
    .line 9
    invoke-interface {v1}, Lod/w0;->a()V

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, LVa/X7;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lod/Y1;

    .line 15
    .line 16
    invoke-virtual {v0}, Lod/Y1;->d()J

    .line 17
    .line 18
    .line 19
    new-instance v0, Lod/a2;

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    invoke-direct {v0, v1, p0, p1}, Lod/a2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lod/j0;->a:Lod/r;

    .line 26
    .line 27
    invoke-interface {p1, v0}, Lod/r;->k(Lod/t;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final l(Lmd/t;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/j0;->a:Lod/r;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lod/r;->l(Lmd/t;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, LBa/c;->S(Ljava/lang/Object;)LA7/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "delegate"

    .line 6
    .line 7
    iget-object v2, p0, Lod/j0;->a:Lod/r;

    .line 8
    .line 9
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, LA7/b0;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method
