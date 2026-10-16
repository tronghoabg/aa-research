.class public final Leb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU1/W;
.implements LU1/X;


# instance fields
.field public a:I

.field public b:Lk2/d0;

.field public c:Z

.field public d:J

.field public e:I

.field public final synthetic f:Leb/c;


# direct methods
.method public constructor <init>(Leb/c;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Leb/b;->f:Leb/c;

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    iput-wide v0, p0, Leb/b;->d:J

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput p1, p0, Leb/b;->e:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final A(J)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Leb/b;->c:Z

    .line 3
    .line 4
    return-void
.end method

.method public final B()LU1/D;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final a()V
    .locals 3

    .line 1
    iget v0, p0, Leb/b;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v2, v1

    .line 9
    :goto_0
    invoke-static {v2}, LQ1/k;->g(Z)V

    .line 10
    .line 11
    .line 12
    iput v1, p0, Leb/b;->a:I

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Leb/b;->b:Lk2/d0;

    .line 16
    .line 17
    iput-boolean v1, p0, Leb/b;->c:Z

    .line 18
    .line 19
    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final c(ILjava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final d(LN1/n;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-static {p1, p1, p1, p1}, LR8/v;->a(IIII)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
.end method

.method public final f()I
    .locals 1

    .line 1
    const/4 v0, -0x2

    .line 2
    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ObserverRenderer"

    .line 2
    .line 3
    return-object v0
.end method

.method public final getState()I
    .locals 1

    .line 1
    iget v0, p0, Leb/b;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final synthetic h()V
    .locals 0

    .line 1
    return-void
.end method

.method public final i()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final isReady()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final synthetic j()V
    .locals 0

    .line 1
    return-void
.end method

.method public final k()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Leb/b;->c:Z

    .line 3
    .line 4
    return-void
.end method

.method public final l(LN1/N;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final m(LU1/Y;[LN1/n;Lk2/d0;ZZJJLk2/H;)V
    .locals 8

    .line 1
    iget p1, p0, Leb/b;->a:I

    .line 2
    .line 3
    const/4 p4, 0x1

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    move p1, p4

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    invoke-static {p1}, LQ1/k;->g(Z)V

    .line 10
    .line 11
    .line 12
    iput p4, p0, Leb/b;->a:I

    .line 13
    .line 14
    move-object v0, p0

    .line 15
    move-object v1, p2

    .line 16
    move-object v2, p3

    .line 17
    move-wide v3, p6

    .line 18
    move-wide/from16 v5, p8

    .line 19
    .line 20
    move-object/from16 v7, p10

    .line 21
    .line 22
    invoke-virtual/range {v0 .. v7}, Leb/b;->o([LN1/n;Lk2/d0;JJLk2/H;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final o([LN1/n;Lk2/d0;JJLk2/H;)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Leb/b;->c:Z

    .line 2
    .line 3
    xor-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    invoke-static {p1}, LQ1/k;->g(Z)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Leb/b;->b:Lk2/d0;

    .line 9
    .line 10
    return-void
.end method

.method public final p()V
    .locals 0

    .line 1
    return-void
.end method

.method public final r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Leb/b;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public final synthetic release()V
    .locals 0

    .line 1
    return-void
.end method

.method public final reset()V
    .locals 1

    .line 1
    iget v0, p0, Leb/b;->a:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final s()LU1/X;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final start()V
    .locals 2

    .line 1
    iget v0, p0, Leb/b;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-static {v1}, LQ1/k;->g(Z)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    iput v0, p0, Leb/b;->a:I

    .line 13
    .line 14
    return-void
.end method

.method public final stop()V
    .locals 3

    .line 1
    iget v0, p0, Leb/b;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 11
    .line 12
    .line 13
    iput v2, p0, Leb/b;->a:I

    .line 14
    .line 15
    return-void
.end method

.method public final synthetic t(FF)V
    .locals 0

    .line 1
    return-void
.end method

.method public final u()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final v(JJ)V
    .locals 1

    .line 1
    iget-wide p3, p0, Leb/b;->d:J

    .line 2
    .line 3
    cmp-long p3, p1, p3

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    iget p3, p0, Leb/b;->e:I

    .line 8
    .line 9
    add-int/lit8 p3, p3, 0x1

    .line 10
    .line 11
    iput p3, p0, Leb/b;->e:I

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget p3, p0, Leb/b;->e:I

    .line 15
    .line 16
    const/4 p4, 0x3

    .line 17
    if-lt p3, p4, :cond_1

    .line 18
    .line 19
    iget-object p3, p0, Leb/b;->f:Leb/c;

    .line 20
    .line 21
    iget-object p3, p3, Leb/c;->C:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance p4, Lcom/applovin/adview/a;

    .line 24
    .line 25
    const/16 v0, 0x16

    .line 26
    .line 27
    invoke-direct {p4, p0, v0}, Lcom/applovin/adview/a;-><init>(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p3, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 p3, 0x0

    .line 34
    iput p3, p0, Leb/b;->e:I

    .line 35
    .line 36
    :goto_0
    iput-wide p1, p0, Leb/b;->d:J

    .line 37
    .line 38
    return-void
.end method

.method public final w(ILV1/k;LQ1/q;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final x()Lk2/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Leb/b;->b:Lk2/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic y(Ln2/o;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final z()J
    .locals 2

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    return-wide v0
.end method
