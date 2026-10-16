.class public final Lk2/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/F;
.implements Lk2/E;


# instance fields
.field public final a:Lk2/H;

.field public final b:J

.field public final c:Lo2/e;

.field public d:Lk2/a;

.field public e:Lk2/F;

.field public f:Lk2/E;

.field public g:J


# direct methods
.method public constructor <init>(Lk2/H;Lo2/e;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk2/A;->a:Lk2/H;

    .line 5
    .line 6
    iput-object p2, p0, Lk2/A;->c:Lo2/e;

    .line 7
    .line 8
    iput-wide p3, p0, Lk2/A;->b:J

    .line 9
    .line 10
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide p1, p0, Lk2/A;->g:J

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Lk2/f0;)V
    .locals 1

    .line 1
    check-cast p1, Lk2/F;

    .line 2
    .line 3
    iget-object p1, p0, Lk2/A;->f:Lk2/E;

    .line 4
    .line 5
    sget v0, LQ1/x;->a:I

    .line 6
    .line 7
    invoke-interface {p1, p0}, Lk2/e0;->a(Lk2/f0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final b(JLU1/a0;)J
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/A;->e:Lk2/F;

    .line 2
    .line 3
    sget v1, LQ1/x;->a:I

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3}, Lk2/F;->b(JLU1/a0;)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    return-wide p1
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/A;->e:Lk2/F;

    .line 2
    .line 3
    sget v1, LQ1/x;->a:I

    .line 4
    .line 5
    invoke-interface {v0}, Lk2/f0;->c()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final d(J)J
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/A;->e:Lk2/F;

    .line 2
    .line 3
    sget v1, LQ1/x;->a:I

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lk2/F;->d(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    return-wide p1
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/A;->e:Lk2/F;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lk2/f0;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final f()J
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/A;->e:Lk2/F;

    .line 2
    .line 3
    sget v1, LQ1/x;->a:I

    .line 4
    .line 5
    invoke-interface {v0}, Lk2/F;->f()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final g(Lk2/H;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lk2/A;->g:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-wide v0, p0, Lk2/A;->b:J

    .line 14
    .line 15
    :goto_0
    iget-object v2, p0, Lk2/A;->d:Lk2/a;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v3, p0, Lk2/A;->c:Lo2/e;

    .line 21
    .line 22
    invoke-virtual {v2, p1, v3, v0, v1}, Lk2/a;->b(Lk2/H;Lo2/e;J)Lk2/F;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lk2/A;->e:Lk2/F;

    .line 27
    .line 28
    iget-object v2, p0, Lk2/A;->f:Lk2/E;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {p1, p0, v0, v1}, Lk2/F;->q(Lk2/E;J)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/A;->e:Lk2/F;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lk2/F;->h()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lk2/A;->d:Lk2/a;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Lk2/a;->j()V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final i(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/A;->e:Lk2/F;

    .line 2
    .line 3
    sget v1, LQ1/x;->a:I

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lk2/F;->i(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final j()Lk2/n0;
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/A;->e:Lk2/F;

    .line 2
    .line 3
    sget v1, LQ1/x;->a:I

    .line 4
    .line 5
    invoke-interface {v0}, Lk2/F;->j()Lk2/n0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final k(LU1/C;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/A;->e:Lk2/F;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lk2/f0;->k(LU1/C;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public final l(Lk2/F;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lk2/A;->f:Lk2/E;

    .line 2
    .line 3
    sget v0, LQ1/x;->a:I

    .line 4
    .line 5
    invoke-interface {p1, p0}, Lk2/E;->l(Lk2/F;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final n()J
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/A;->e:Lk2/F;

    .line 2
    .line 3
    sget v1, LQ1/x;->a:I

    .line 4
    .line 5
    invoke-interface {v0}, Lk2/f0;->n()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final o(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/A;->e:Lk2/F;

    .line 2
    .line 3
    sget v1, LQ1/x;->a:I

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lk2/f0;->o(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final q(Lk2/E;J)V
    .locals 2

    .line 1
    iput-object p1, p0, Lk2/A;->f:Lk2/E;

    .line 2
    .line 3
    iget-object p1, p0, Lk2/A;->e:Lk2/F;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-wide p2, p0, Lk2/A;->g:J

    .line 8
    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v0, p2, v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-wide p2, p0, Lk2/A;->b:J

    .line 20
    .line 21
    :goto_0
    invoke-interface {p1, p0, p2, p3}, Lk2/F;->q(Lk2/E;J)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public final r([Ln2/q;[Z[Lk2/d0;[ZJ)J
    .locals 12

    .line 1
    iget-wide v0, p0, Lk2/A;->g:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_0

    .line 11
    .line 12
    iget-wide v4, p0, Lk2/A;->b:J

    .line 13
    .line 14
    cmp-long v4, p5, v4

    .line 15
    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    move-wide v10, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-wide/from16 v10, p5

    .line 21
    .line 22
    :goto_0
    iput-wide v2, p0, Lk2/A;->g:J

    .line 23
    .line 24
    iget-object v5, p0, Lk2/A;->e:Lk2/F;

    .line 25
    .line 26
    sget v0, LQ1/x;->a:I

    .line 27
    .line 28
    move-object v6, p1

    .line 29
    move-object v7, p2

    .line 30
    move-object v8, p3

    .line 31
    move-object/from16 v9, p4

    .line 32
    .line 33
    invoke-interface/range {v5 .. v11}, Lk2/F;->r([Ln2/q;[Z[Lk2/d0;[ZJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide p1

    .line 37
    return-wide p1
.end method
