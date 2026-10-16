.class public final LL2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL2/f;


# instance fields
.field public final a:J

.field public final b:I

.field public final c:Ls2/u;


# direct methods
.method public constructor <init>(JJJ)V
    .locals 10

    .line 1
    move-wide v0, p5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    new-instance v2, Ls2/u;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    new-array v6, v3, [J

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    aput-wide p3, v6, v7

    .line 12
    .line 13
    const-wide/16 v8, 0x0

    .line 14
    .line 15
    new-array v3, v3, [J

    .line 16
    .line 17
    aput-wide v8, v3, v7

    .line 18
    .line 19
    invoke-direct {v2, v6, v3, p1, p2}, Ls2/u;-><init>([J[JJ)V

    .line 20
    .line 21
    .line 22
    iput-object v2, p0, LL2/b;->c:Ls2/u;

    .line 23
    .line 24
    iput-wide v0, p0, LL2/b;->a:J

    .line 25
    .line 26
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    cmp-long v2, p1, v2

    .line 32
    .line 33
    const v7, -0x7fffffff

    .line 34
    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    sub-long v0, p3, v0

    .line 39
    .line 40
    const-wide/16 v2, 0x8

    .line 41
    .line 42
    sget-object v6, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 43
    .line 44
    move-wide v4, p1

    .line 45
    invoke-static/range {v0 .. v6}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    cmp-long v2, v0, v8

    .line 50
    .line 51
    if-lez v2, :cond_0

    .line 52
    .line 53
    const-wide/32 v2, 0x7fffffff

    .line 54
    .line 55
    .line 56
    cmp-long v2, v0, v2

    .line 57
    .line 58
    if-gtz v2, :cond_0

    .line 59
    .line 60
    long-to-int v7, v0

    .line 61
    :cond_0
    iput v7, p0, LL2/b;->b:I

    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    iput v7, p0, LL2/b;->b:I

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final b(J)J
    .locals 3

    .line 1
    iget-object v0, p0, LL2/b;->c:Ls2/u;

    .line 2
    .line 3
    iget-object v1, v0, Ls2/u;->b:LQ1/l;

    .line 4
    .line 5
    iget v2, v1, LQ1/l;->b:I

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    return-wide p1

    .line 15
    :cond_0
    iget-object v0, v0, Ls2/u;->a:LQ1/l;

    .line 16
    .line 17
    invoke-static {v0, p1, p2}, LQ1/x;->b(LQ1/l;J)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {v1, p1}, LQ1/l;->c(I)J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    return-wide p1
.end method

.method public final c(J)Ls2/v;
    .locals 1

    .line 1
    iget-object v0, p0, LL2/b;->c:Ls2/u;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ls2/u;->c(J)Ls2/v;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-wide v0, p0, LL2/b;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, LL2/b;->c:Ls2/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls2/u;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final f()J
    .locals 2

    .line 1
    iget-object v0, p0, LL2/b;->c:Ls2/u;

    .line 2
    .line 3
    iget-wide v0, v0, Ls2/u;->c:J

    .line 4
    .line 5
    return-wide v0
.end method

.method public final l()I
    .locals 1

    .line 1
    iget v0, p0, LL2/b;->b:I

    .line 2
    .line 3
    return v0
.end method
