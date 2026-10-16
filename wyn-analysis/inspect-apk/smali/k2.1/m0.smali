.class public final Lk2/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/F;
.implements Lk2/E;


# instance fields
.field public final a:Lk2/F;

.field public final b:J

.field public c:Lk2/E;


# direct methods
.method public constructor <init>(Lk2/F;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk2/m0;->a:Lk2/F;

    .line 5
    .line 6
    iput-wide p2, p0, Lk2/m0;->b:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lk2/f0;)V
    .locals 0

    .line 1
    check-cast p1, Lk2/F;

    .line 2
    .line 3
    iget-object p1, p0, Lk2/m0;->c:Lk2/E;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, p0}, Lk2/e0;->a(Lk2/f0;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b(JLU1/a0;)J
    .locals 3

    .line 1
    iget-wide v0, p0, Lk2/m0;->b:J

    .line 2
    .line 3
    sub-long/2addr p1, v0

    .line 4
    iget-object v2, p0, Lk2/m0;->a:Lk2/F;

    .line 5
    .line 6
    invoke-interface {v2, p1, p2, p3}, Lk2/F;->b(JLU1/a0;)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    add-long/2addr p1, v0

    .line 11
    return-wide p1
.end method

.method public final c()J
    .locals 5

    .line 1
    iget-object v0, p0, Lk2/m0;->a:Lk2/F;

    .line 2
    .line 3
    invoke-interface {v0}, Lk2/f0;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/high16 v2, -0x8000000000000000L

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    return-wide v2

    .line 14
    :cond_0
    iget-wide v2, p0, Lk2/m0;->b:J

    .line 15
    .line 16
    add-long/2addr v0, v2

    .line 17
    return-wide v0
.end method

.method public final d(J)J
    .locals 3

    .line 1
    iget-wide v0, p0, Lk2/m0;->b:J

    .line 2
    .line 3
    sub-long/2addr p1, v0

    .line 4
    iget-object v2, p0, Lk2/m0;->a:Lk2/F;

    .line 5
    .line 6
    invoke-interface {v2, p1, p2}, Lk2/F;->d(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    add-long/2addr p1, v0

    .line 11
    return-wide p1
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/m0;->a:Lk2/F;

    .line 2
    .line 3
    invoke-interface {v0}, Lk2/f0;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final f()J
    .locals 5

    .line 1
    iget-object v0, p0, Lk2/m0;->a:Lk2/F;

    .line 2
    .line 3
    invoke-interface {v0}, Lk2/F;->f()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v4, v0, v2

    .line 13
    .line 14
    if-nez v4, :cond_0

    .line 15
    .line 16
    return-wide v2

    .line 17
    :cond_0
    iget-wide v2, p0, Lk2/m0;->b:J

    .line 18
    .line 19
    add-long/2addr v0, v2

    .line 20
    return-wide v0
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/m0;->a:Lk2/F;

    .line 2
    .line 3
    invoke-interface {v0}, Lk2/F;->h()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lk2/m0;->b:J

    .line 2
    .line 3
    sub-long/2addr p1, v0

    .line 4
    iget-object v0, p0, Lk2/m0;->a:Lk2/F;

    .line 5
    .line 6
    invoke-interface {v0, p1, p2}, Lk2/F;->i(J)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final j()Lk2/n0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/m0;->a:Lk2/F;

    .line 2
    .line 3
    invoke-interface {v0}, Lk2/F;->j()Lk2/n0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final k(LU1/C;)Z
    .locals 5

    .line 1
    new-instance v0, LU1/B;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p1, LU1/C;->b:F

    .line 7
    .line 8
    iput v1, v0, LU1/B;->b:F

    .line 9
    .line 10
    iget-wide v1, p1, LU1/C;->c:J

    .line 11
    .line 12
    iput-wide v1, v0, LU1/B;->c:J

    .line 13
    .line 14
    iget-wide v1, p0, Lk2/m0;->b:J

    .line 15
    .line 16
    iget-wide v3, p1, LU1/C;->a:J

    .line 17
    .line 18
    sub-long/2addr v3, v1

    .line 19
    iput-wide v3, v0, LU1/B;->a:J

    .line 20
    .line 21
    new-instance p1, LU1/C;

    .line 22
    .line 23
    invoke-direct {p1, v0}, LU1/C;-><init>(LU1/B;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lk2/m0;->a:Lk2/F;

    .line 27
    .line 28
    invoke-interface {v0, p1}, Lk2/f0;->k(LU1/C;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
.end method

.method public final l(Lk2/F;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lk2/m0;->c:Lk2/E;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p0}, Lk2/E;->l(Lk2/F;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final n()J
    .locals 5

    .line 1
    iget-object v0, p0, Lk2/m0;->a:Lk2/F;

    .line 2
    .line 3
    invoke-interface {v0}, Lk2/f0;->n()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/high16 v2, -0x8000000000000000L

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    return-wide v2

    .line 14
    :cond_0
    iget-wide v2, p0, Lk2/m0;->b:J

    .line 15
    .line 16
    add-long/2addr v0, v2

    .line 17
    return-wide v0
.end method

.method public final o(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lk2/m0;->b:J

    .line 2
    .line 3
    sub-long/2addr p1, v0

    .line 4
    iget-object v0, p0, Lk2/m0;->a:Lk2/F;

    .line 5
    .line 6
    invoke-interface {v0, p1, p2}, Lk2/f0;->o(J)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final q(Lk2/E;J)V
    .locals 2

    .line 1
    iput-object p1, p0, Lk2/m0;->c:Lk2/E;

    .line 2
    .line 3
    iget-wide v0, p0, Lk2/m0;->b:J

    .line 4
    .line 5
    sub-long/2addr p2, v0

    .line 6
    iget-object p1, p0, Lk2/m0;->a:Lk2/F;

    .line 7
    .line 8
    invoke-interface {p1, p0, p2, p3}, Lk2/F;->q(Lk2/E;J)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final r([Ln2/q;[Z[Lk2/d0;[ZJ)J
    .locals 11

    .line 1
    array-length v0, p3

    .line 2
    new-array v4, v0, [Lk2/d0;

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    array-length v2, p3

    .line 7
    const/4 v8, 0x0

    .line 8
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    aget-object v2, p3, v1

    .line 11
    .line 12
    check-cast v2, Lk2/l0;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v8, v2, Lk2/l0;->a:Lk2/d0;

    .line 17
    .line 18
    :cond_0
    aput-object v8, v4, v1

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-wide v9, p0, Lk2/m0;->b:J

    .line 24
    .line 25
    sub-long v6, p5, v9

    .line 26
    .line 27
    iget-object v1, p0, Lk2/m0;->a:Lk2/F;

    .line 28
    .line 29
    move-object v2, p1

    .line 30
    move-object v3, p2

    .line 31
    move-object v5, p4

    .line 32
    invoke-interface/range {v1 .. v7}, Lk2/F;->r([Ln2/q;[Z[Lk2/d0;[ZJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide p1

    .line 36
    :goto_1
    array-length v1, p3

    .line 37
    if-ge v0, v1, :cond_5

    .line 38
    .line 39
    aget-object v1, v4, v0

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    aput-object v8, p3, v0

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    aget-object v2, p3, v0

    .line 47
    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    check-cast v2, Lk2/l0;

    .line 51
    .line 52
    iget-object v2, v2, Lk2/l0;->a:Lk2/d0;

    .line 53
    .line 54
    if-eq v2, v1, :cond_4

    .line 55
    .line 56
    :cond_3
    new-instance v2, Lk2/l0;

    .line 57
    .line 58
    invoke-direct {v2, v1, v9, v10}, Lk2/l0;-><init>(Lk2/d0;J)V

    .line 59
    .line 60
    .line 61
    aput-object v2, p3, v0

    .line 62
    .line 63
    :cond_4
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_5
    add-long/2addr p1, v9

    .line 67
    return-wide p1
.end method
