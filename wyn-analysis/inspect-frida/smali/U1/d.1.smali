.class public abstract LU1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU1/W;
.implements LU1/X;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:I

.field public final c:LS3/c;

.field public d:LU1/Y;

.field public e:I

.field public f:LV1/k;

.field public g:LQ1/q;

.field public h:I

.field public i:Lk2/d0;

.field public j:[LN1/n;

.field public k:J

.field public l:J

.field public m:J

.field public n:Z

.field public o:Z

.field public p:LN1/N;

.field public q:Ln2/o;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LU1/d;->a:Ljava/lang/Object;

    .line 10
    .line 11
    iput p1, p0, LU1/d;->b:I

    .line 12
    .line 13
    new-instance p1, LS3/c;

    .line 14
    .line 15
    const/16 v0, 0x19

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {p1, v0, v1}, LS3/c;-><init>(IZ)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, LU1/d;->c:LS3/c;

    .line 22
    .line 23
    const-wide/high16 v0, -0x8000000000000000L

    .line 24
    .line 25
    iput-wide v0, p0, LU1/d;->m:J

    .line 26
    .line 27
    sget-object p1, LN1/N;->a:LN1/K;

    .line 28
    .line 29
    iput-object p1, p0, LU1/d;->p:LN1/N;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final A(J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LU1/d;->n:Z

    .line 3
    .line 4
    iput-wide p1, p0, LU1/d;->l:J

    .line 5
    .line 6
    iput-wide p1, p0, LU1/d;->m:J

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2, v0}, LU1/d;->F(JZ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public B()LU1/D;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final C(Ljava/lang/Exception;LN1/n;ZI)LU1/j;
    .locals 10

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    iget-boolean v1, p0, LU1/d;->o:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, LU1/d;->o:Z

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :try_start_0
    invoke-interface {p0, p2}, LU1/X;->d(LN1/n;)I

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch LU1/j; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    and-int/lit8 v2, v2, 0x7

    .line 17
    .line 18
    iput-boolean v1, p0, LU1/d;->o:Z

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    iput-boolean v1, p0, LU1/d;->o:Z

    .line 23
    .line 24
    throw v0

    .line 25
    :catch_0
    iput-boolean v1, p0, LU1/d;->o:Z

    .line 26
    .line 27
    :cond_0
    move v2, v0

    .line 28
    :goto_0
    invoke-interface {p0}, LU1/W;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget v6, p0, LU1/d;->e:I

    .line 33
    .line 34
    new-instance v1, LU1/j;

    .line 35
    .line 36
    if-nez p2, :cond_1

    .line 37
    .line 38
    move v8, v0

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v8, v2

    .line 41
    :goto_1
    const/4 v2, 0x1

    .line 42
    move-object v3, p1

    .line 43
    move-object v7, p2

    .line 44
    move v9, p3

    .line 45
    move v4, p4

    .line 46
    invoke-direct/range {v1 .. v9}, LU1/j;-><init>(ILjava/lang/Exception;ILjava/lang/String;ILN1/n;IZ)V

    .line 47
    .line 48
    .line 49
    return-object v1
.end method

.method public abstract D()V
.end method

.method public E(ZZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract F(JZ)V
.end method

.method public G()V
    .locals 0

    .line 1
    return-void
.end method

.method public H()V
    .locals 0

    .line 1
    return-void
.end method

.method public I()V
    .locals 0

    .line 1
    return-void
.end method

.method public J()V
    .locals 0

    .line 1
    return-void
.end method

.method public K([LN1/n;JJLk2/H;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final L(LS3/c;LT1/d;I)I
    .locals 4

    .line 1
    iget-object v0, p0, LU1/d;->i:Lk2/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1, p2, p3}, Lk2/d0;->s(LS3/c;LT1/d;I)I

    .line 7
    .line 8
    .line 9
    move-result p3

    .line 10
    const/4 v0, -0x4

    .line 11
    if-ne p3, v0, :cond_2

    .line 12
    .line 13
    const/4 p1, 0x4

    .line 14
    invoke-virtual {p2, p1}, LH5/a;->h(I)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const-wide/high16 p1, -0x8000000000000000L

    .line 21
    .line 22
    iput-wide p1, p0, LU1/d;->m:J

    .line 23
    .line 24
    iget-boolean p1, p0, LU1/d;->n:Z

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    return v0

    .line 29
    :cond_0
    const/4 p1, -0x3

    .line 30
    return p1

    .line 31
    :cond_1
    iget-wide v0, p2, LT1/d;->g:J

    .line 32
    .line 33
    iget-wide v2, p0, LU1/d;->k:J

    .line 34
    .line 35
    add-long/2addr v0, v2

    .line 36
    iput-wide v0, p2, LT1/d;->g:J

    .line 37
    .line 38
    iget-wide p1, p0, LU1/d;->m:J

    .line 39
    .line 40
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    iput-wide p1, p0, LU1/d;->m:J

    .line 45
    .line 46
    return p3

    .line 47
    :cond_2
    const/4 p2, -0x5

    .line 48
    if-ne p3, p2, :cond_3

    .line 49
    .line 50
    iget-object p2, p1, LS3/c;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p2, LN1/n;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-wide v0, p2, LN1/n;->s:J

    .line 58
    .line 59
    const-wide v2, 0x7fffffffffffffffL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    cmp-long v2, v0, v2

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    invoke-virtual {p2}, LN1/n;->a()LN1/m;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    iget-wide v2, p0, LU1/d;->k:J

    .line 73
    .line 74
    add-long/2addr v0, v2

    .line 75
    iput-wide v0, p2, LN1/m;->r:J

    .line 76
    .line 77
    new-instance v0, LN1/n;

    .line 78
    .line 79
    invoke-direct {v0, p2}, LN1/n;-><init>(LN1/m;)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p1, LS3/c;->c:Ljava/lang/Object;

    .line 83
    .line 84
    :cond_3
    return p3
.end method

.method public final a()V
    .locals 3

    .line 1
    iget v0, p0, LU1/d;->h:I

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
    iget-object v0, p0, LU1/d;->c:LS3/c;

    .line 13
    .line 14
    invoke-virtual {v0}, LS3/c;->i()V

    .line 15
    .line 16
    .line 17
    iput v1, p0, LU1/d;->h:I

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, LU1/d;->i:Lk2/d0;

    .line 21
    .line 22
    iput-object v0, p0, LU1/d;->j:[LN1/n;

    .line 23
    .line 24
    iput-boolean v1, p0, LU1/d;->n:Z

    .line 25
    .line 26
    invoke-virtual {p0}, LU1/d;->D()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LU1/d;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public c(ILjava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, LU1/d;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final getState()I
    .locals 1

    .line 1
    iget v0, p0, LU1/d;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-object v0, p0, LU1/d;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-object v1, p0, LU1/d;->q:Ln2/o;

    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v1

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    throw v1
.end method

.method public final i()Z
    .locals 4

    .line 1
    iget-wide v0, p0, LU1/d;->m:J

    .line 2
    .line 3
    const-wide/high16 v2, -0x8000000000000000L

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public synthetic j()V
    .locals 0

    .line 1
    return-void
.end method

.method public final k()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LU1/d;->n:Z

    .line 3
    .line 4
    return-void
.end method

.method public final l(LN1/N;)V
    .locals 2

    .line 1
    iget-object v0, p0, LU1/d;->p:LN1/N;

    .line 2
    .line 3
    sget v1, LQ1/x;->a:I

    .line 4
    .line 5
    invoke-static {v0, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, LU1/d;->p:LN1/N;

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final m(LU1/Y;[LN1/n;Lk2/d0;ZZJJLk2/H;)V
    .locals 9

    .line 1
    iget v0, p0, LU1/d;->h:I

    .line 2
    .line 3
    const/4 v8, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v8

    .line 10
    :goto_0
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LU1/d;->d:LU1/Y;

    .line 14
    .line 15
    iput v1, p0, LU1/d;->h:I

    .line 16
    .line 17
    invoke-virtual {p0, p4, p5}, LU1/d;->E(ZZ)V

    .line 18
    .line 19
    .line 20
    move-object v0, p0

    .line 21
    move-object v1, p2

    .line 22
    move-object v2, p3

    .line 23
    move-wide v3, p6

    .line 24
    move-wide/from16 v5, p8

    .line 25
    .line 26
    move-object/from16 v7, p10

    .line 27
    .line 28
    invoke-virtual/range {v0 .. v7}, LU1/d;->o([LN1/n;Lk2/d0;JJLk2/H;)V

    .line 29
    .line 30
    .line 31
    iput-boolean v8, p0, LU1/d;->n:Z

    .line 32
    .line 33
    iput-wide v3, p0, LU1/d;->l:J

    .line 34
    .line 35
    iput-wide v3, p0, LU1/d;->m:J

    .line 36
    .line 37
    invoke-virtual {p0, v3, v4, p4}, LU1/d;->F(JZ)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final o([LN1/n;Lk2/d0;JJLk2/H;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, LU1/d;->n:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, LU1/d;->i:Lk2/d0;

    .line 9
    .line 10
    iget-wide v0, p0, LU1/d;->m:J

    .line 11
    .line 12
    const-wide/high16 v2, -0x8000000000000000L

    .line 13
    .line 14
    cmp-long p2, v0, v2

    .line 15
    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    iput-wide p3, p0, LU1/d;->m:J

    .line 19
    .line 20
    :cond_0
    iput-object p1, p0, LU1/d;->j:[LN1/n;

    .line 21
    .line 22
    iput-wide p5, p0, LU1/d;->k:J

    .line 23
    .line 24
    move-object v0, p0

    .line 25
    move-object v1, p1

    .line 26
    move-wide v2, p3

    .line 27
    move-wide v4, p5

    .line 28
    move-object v6, p7

    .line 29
    invoke-virtual/range {v0 .. v6}, LU1/d;->K([LN1/n;JJLk2/H;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final p()V
    .locals 1

    .line 1
    iget-object v0, p0, LU1/d;->i:Lk2/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Lk2/d0;->a()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LU1/d;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method public final release()V
    .locals 1

    .line 1
    iget v0, p0, LU1/d;->h:I

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
    invoke-virtual {p0}, LU1/d;->G()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final reset()V
    .locals 1

    .line 1
    iget v0, p0, LU1/d;->h:I

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
    iget-object v0, p0, LU1/d;->c:LS3/c;

    .line 12
    .line 13
    invoke-virtual {v0}, LS3/c;->i()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, LU1/d;->H()V

    .line 17
    .line 18
    .line 19
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
    iget v0, p0, LU1/d;->h:I

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
    iput v0, p0, LU1/d;->h:I

    .line 13
    .line 14
    invoke-virtual {p0}, LU1/d;->I()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final stop()V
    .locals 3

    .line 1
    iget v0, p0, LU1/d;->h:I

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
    iput v2, p0, LU1/d;->h:I

    .line 14
    .line 15
    invoke-virtual {p0}, LU1/d;->J()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public synthetic t(FF)V
    .locals 0

    .line 1
    return-void
.end method

.method public u()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final w(ILV1/k;LQ1/q;)V
    .locals 0

    .line 1
    iput p1, p0, LU1/d;->e:I

    .line 2
    .line 3
    iput-object p2, p0, LU1/d;->f:LV1/k;

    .line 4
    .line 5
    iput-object p3, p0, LU1/d;->g:LQ1/q;

    .line 6
    .line 7
    return-void
.end method

.method public final x()Lk2/d0;
    .locals 1

    .line 1
    iget-object v0, p0, LU1/d;->i:Lk2/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y(Ln2/o;)V
    .locals 1

    .line 1
    iget-object v0, p0, LU1/d;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, LU1/d;->q:Ln2/o;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p1
.end method

.method public final z()J
    .locals 2

    .line 1
    iget-wide v0, p0, LU1/d;->m:J

    .line 2
    .line 3
    return-wide v0
.end method
