.class public abstract LE5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/x0;


# instance fields
.field public final a:I

.field public final b:LS3/s;

.field public c:LE5/B0;

.field public d:I

.field public e:LF5/l;

.field public f:I

.field public g:Lf6/V;

.field public h:[LE5/T;

.field public i:J

.field public j:J

.field public k:Z

.field public l:Z


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LE5/f;->a:I

    .line 5
    .line 6
    new-instance p1, LS3/s;

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p1, v0, v1}, LS3/s;-><init>(IC)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LE5/f;->b:LS3/s;

    .line 14
    .line 15
    const-wide/high16 v0, -0x8000000000000000L

    .line 16
    .line 17
    iput-wide v0, p0, LE5/f;->j:J

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Exception;LE5/T;ZI)LE5/o;
    .locals 10

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    iget-boolean v1, p0, LE5/f;->l:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, LE5/f;->l:Z

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p0, p2}, LE5/f;->w(LE5/T;)I

    .line 13
    .line 14
    .line 15
    move-result v2
    :try_end_0
    .catch LE5/o; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    and-int/lit8 v2, v2, 0x7

    .line 17
    .line 18
    iput-boolean v1, p0, LE5/f;->l:Z

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    iput-boolean v1, p0, LE5/f;->l:Z

    .line 23
    .line 24
    throw v0

    .line 25
    :catch_0
    iput-boolean v1, p0, LE5/f;->l:Z

    .line 26
    .line 27
    :cond_0
    move v2, v0

    .line 28
    :goto_0
    invoke-virtual {p0}, LE5/f;->f()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget v6, p0, LE5/f;->d:I

    .line 33
    .line 34
    new-instance v1, LE5/o;

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
    invoke-direct/range {v1 .. v9}, LE5/o;-><init>(ILjava/lang/Exception;ILjava/lang/String;ILE5/T;IZ)V

    .line 47
    .line 48
    .line 49
    return-object v1
.end method

.method public c(ILjava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d()Lu6/j;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public final h()Z
    .locals 4

    .line 1
    iget-wide v0, p0, LE5/f;->j:J

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

.method public abstract i()Z
.end method

.method public abstract j()Z
.end method

.method public abstract k()V
.end method

.method public l(ZZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract m(JZ)V
.end method

.method public n()V
    .locals 0

    .line 1
    return-void
.end method

.method public o()V
    .locals 0

    .line 1
    return-void
.end method

.method public p()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract q([LE5/T;JJ)V
.end method

.method public final r(LS3/s;LH5/h;I)I
    .locals 4

    .line 1
    iget-object v0, p0, LE5/f;->g:Lf6/V;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1, p2, p3}, Lf6/V;->h(LS3/s;LH5/h;I)I

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
    iput-wide p1, p0, LE5/f;->j:J

    .line 23
    .line 24
    iget-boolean p1, p0, LE5/f;->k:Z

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
    iget-wide v0, p2, LH5/h;->f:J

    .line 32
    .line 33
    iget-wide v2, p0, LE5/f;->i:J

    .line 34
    .line 35
    add-long/2addr v0, v2

    .line 36
    iput-wide v0, p2, LH5/h;->f:J

    .line 37
    .line 38
    iget-wide p1, p0, LE5/f;->j:J

    .line 39
    .line 40
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    iput-wide p1, p0, LE5/f;->j:J

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
    iget-object p2, p1, LS3/s;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p2, LE5/T;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-wide v0, p2, LE5/T;->p:J

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
    invoke-virtual {p2}, LE5/T;->a()LE5/S;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    iget-wide v2, p0, LE5/f;->i:J

    .line 73
    .line 74
    add-long/2addr v0, v2

    .line 75
    iput-wide v0, p2, LE5/S;->o:J

    .line 76
    .line 77
    new-instance v0, LE5/T;

    .line 78
    .line 79
    invoke-direct {v0, p2}, LE5/T;-><init>(LE5/S;)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p1, LS3/s;->c:Ljava/lang/Object;

    .line 83
    .line 84
    :cond_3
    return p3
.end method

.method public abstract s(JJ)V
.end method

.method public final t([LE5/T;Lf6/V;JJ)V
    .locals 6

    .line 1
    iget-boolean v0, p0, LE5/f;->k:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lu6/a;->i(Z)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, LE5/f;->g:Lf6/V;

    .line 9
    .line 10
    iget-wide v0, p0, LE5/f;->j:J

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
    iput-wide p3, p0, LE5/f;->j:J

    .line 19
    .line 20
    :cond_0
    iput-object p1, p0, LE5/f;->h:[LE5/T;

    .line 21
    .line 22
    iput-wide p5, p0, LE5/f;->i:J

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
    invoke-virtual/range {v0 .. v5}, LE5/f;->q([LE5/T;JJ)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final u()V
    .locals 1

    .line 1
    iget v0, p0, LE5/f;->f:I

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
    invoke-static {v0}, Lu6/a;->i(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LE5/f;->b:LS3/s;

    .line 12
    .line 13
    invoke-virtual {v0}, LS3/s;->e()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, LE5/f;->n()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public v(FF)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract w(LE5/T;)I
.end method

.method public x()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method
