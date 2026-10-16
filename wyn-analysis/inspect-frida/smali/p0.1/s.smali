.class public final Lp0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL0/b;
.implements Ljf/c;


# instance fields
.field public final a:LEf/n;

.field public final synthetic b:Lp0/t;

.field public c:LEf/n;

.field public d:Lp0/g;

.field public final synthetic e:Lp0/t;


# direct methods
.method public constructor <init>(Lp0/t;LEf/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp0/s;->e:Lp0/t;

    .line 5
    .line 6
    iput-object p2, p0, Lp0/s;->a:LEf/n;

    .line 7
    .line 8
    iput-object p1, p0, Lp0/s;->b:Lp0/t;

    .line 9
    .line 10
    sget-object p1, Lp0/g;->b:Lp0/g;

    .line 11
    .line 12
    iput-object p1, p0, Lp0/s;->d:Lp0/g;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/s;->b:Lp0/t;

    .line 2
    .line 3
    iget-object v0, v0, Lp0/t;->d:LL0/b;

    .line 4
    .line 5
    invoke-interface {v0}, LL0/b;->b()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final e(Lp0/g;Llf/a;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LEf/n;

    .line 2
    .line 3
    invoke-static {p2}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, LEf/n;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LEf/n;->t()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lp0/s;->d:Lp0/g;

    .line 15
    .line 16
    iput-object v0, p0, Lp0/s;->c:LEf/n;

    .line 17
    .line 18
    invoke-virtual {v0}, LEf/n;->s()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 23
    .line 24
    return-object p1
.end method

.method public final getContext()Ljf/h;
    .locals 1

    .line 1
    sget-object v0, Ljf/i;->a:Ljf/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFontScale()F
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/s;->b:Lp0/t;

    .line 2
    .line 3
    iget-object v0, v0, Lp0/t;->d:LL0/b;

    .line 4
    .line 5
    invoke-interface {v0}, LL0/b;->getFontScale()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final h()J
    .locals 9

    .line 1
    iget-object v0, p0, Lp0/s;->e:Lp0/t;

    .line 2
    .line 3
    iget-object v1, v0, Lp0/t;->c:Lu0/p0;

    .line 4
    .line 5
    invoke-interface {v1}, Lu0/p0;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    iget-object v3, v0, Lp0/t;->d:LL0/b;

    .line 10
    .line 11
    invoke-interface {v3, v1, v2}, LL0/b;->y(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    iget-object v0, v0, Lp0/n;->a:Lr0/k;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    check-cast v0, Lt0/y;

    .line 20
    .line 21
    iget-wide v3, v0, Lr0/t;->c:J

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-wide/16 v3, 0x0

    .line 25
    .line 26
    :goto_0
    invoke-static {v1, v2}, Ld0/f;->d(J)F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/16 v5, 0x20

    .line 31
    .line 32
    shr-long v5, v3, v5

    .line 33
    .line 34
    long-to-int v5, v5

    .line 35
    int-to-float v5, v5

    .line 36
    sub-float/2addr v0, v5

    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static {v5, v0}, Ljava/lang/Math;->max(FF)F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/high16 v6, 0x40000000    # 2.0f

    .line 43
    .line 44
    div-float/2addr v0, v6

    .line 45
    invoke-static {v1, v2}, Ld0/f;->b(J)F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const-wide v7, 0xffffffffL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long/2addr v3, v7

    .line 55
    long-to-int v2, v3

    .line 56
    int-to-float v2, v2

    .line 57
    sub-float/2addr v1, v2

    .line 58
    invoke-static {v5, v1}, Ljava/lang/Math;->max(FF)F

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    div-float/2addr v1, v6

    .line 63
    invoke-static {v0, v1}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    return-wide v0
.end method

.method public final j(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/s;->b:Lp0/t;

    .line 2
    .line 3
    iget-object v0, v0, Lp0/t;->d:LL0/b;

    .line 4
    .line 5
    invoke-interface {v0, p1}, LL0/b;->j(F)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final l(J)F
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/s;->b:Lp0/t;

    .line 2
    .line 3
    iget-object v0, v0, Lp0/t;->d:LL0/b;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, LL0/b;->l(J)F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lp0/s;->e:Lp0/t;

    .line 2
    .line 3
    iget-object v1, v0, Lp0/t;->f:LP/d;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v0, v0, Lp0/t;->f:LP/d;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, LP/d;->k(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit v1

    .line 12
    iget-object v0, p0, Lp0/s;->a:LEf/n;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, LEf/n;->resumeWith(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    monitor-exit v1

    .line 20
    throw p1
.end method

.method public final t(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/s;->b:Lp0/t;

    .line 2
    .line 3
    iget-object v0, v0, Lp0/t;->d:LL0/b;

    .line 4
    .line 5
    invoke-interface {v0, p1}, LL0/b;->t(F)F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final y(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/s;->b:Lp0/t;

    .line 2
    .line 3
    iget-object v0, v0, Lp0/t;->d:LL0/b;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, LL0/b;->y(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    return-wide p1
.end method
