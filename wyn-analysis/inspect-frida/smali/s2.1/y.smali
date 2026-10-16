.class public final Ls2/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/m;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/String;

.field public d:I

.field public e:I

.field public f:Ls2/o;

.field public g:Ls2/C;


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ls2/y;->a:I

    .line 5
    .line 6
    iput p2, p0, Ls2/y;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Ls2/y;->c:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 0

    .line 1
    const-wide/16 p3, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, p3

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    iget p1, p0, Ls2/y;->e:I

    .line 9
    .line 10
    if-ne p1, p2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void

    .line 14
    :cond_1
    :goto_0
    iput p2, p0, Ls2/y;->e:I

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput p1, p0, Ls2/y;->d:I

    .line 18
    .line 19
    return-void
.end method

.method public final g(Ls2/o;)V
    .locals 2

    .line 1
    iput-object p1, p0, Ls2/y;->f:Ls2/o;

    .line 2
    .line 3
    const/16 v0, 0x400

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-interface {p1, v0, v1}, Ls2/o;->m(II)Ls2/C;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Ls2/y;->g:Ls2/C;

    .line 11
    .line 12
    new-instance v0, LN1/m;

    .line 13
    .line 14
    invoke-direct {v0}, LN1/m;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Ls2/y;->c:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v1}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, v0, LN1/m;->m:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0, p1}, LVa/M6;->y(LN1/m;Ls2/C;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Ls2/y;->f:Ls2/o;

    .line 29
    .line 30
    invoke-interface {p1}, Ls2/o;->l()V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Ls2/y;->f:Ls2/o;

    .line 34
    .line 35
    new-instance v0, Ls2/z;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1, v0}, Ls2/o;->s(Ls2/w;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    iput p1, p0, Ls2/y;->e:I

    .line 45
    .line 46
    return-void
.end method

.method public final h()Ls2/m;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final i(Ls2/n;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget v2, p0, Ls2/y;->b:I

    .line 4
    .line 5
    iget v3, p0, Ls2/y;->a:I

    .line 6
    .line 7
    const/4 v4, -0x1

    .line 8
    if-eq v3, v4, :cond_0

    .line 9
    .line 10
    if-eq v2, v4, :cond_0

    .line 11
    .line 12
    move v4, v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v4, v1

    .line 15
    :goto_0
    invoke-static {v4}, LQ1/k;->g(Z)V

    .line 16
    .line 17
    .line 18
    new-instance v4, LQ1/o;

    .line 19
    .line 20
    invoke-direct {v4, v2}, LQ1/o;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iget-object v5, v4, LQ1/o;->a:[B

    .line 24
    .line 25
    check-cast p1, Ls2/j;

    .line 26
    .line 27
    invoke-virtual {p1, v5, v1, v2, v1}, Ls2/j;->c([BIIZ)Z

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4}, LQ1/o;->A()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-ne p1, v3, :cond_1

    .line 35
    .line 36
    return v0

    .line 37
    :cond_1
    return v1
.end method

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Ll8/K;->b:Ll8/I;

    .line 2
    .line 3
    sget-object v0, Ll8/e0;->e:Ll8/e0;

    .line 4
    .line 5
    return-object v0
.end method

.method public final k(Ls2/n;LJ5/n;)I
    .locals 9

    .line 1
    iget p2, p0, Ls2/y;->e:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    const/4 v1, 0x2

    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq p2, v2, :cond_1

    .line 7
    .line 8
    if-ne p2, v1, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 14
    .line 15
    .line 16
    throw p1

    .line 17
    :cond_1
    iget-object p2, p0, Ls2/y;->g:Ls2/C;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/16 v3, 0x400

    .line 23
    .line 24
    invoke-interface {p2, p1, v3, v2}, Ls2/C;->d(LN1/g;IZ)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/4 p2, 0x0

    .line 29
    if-ne p1, v0, :cond_2

    .line 30
    .line 31
    iput v1, p0, Ls2/y;->e:I

    .line 32
    .line 33
    iget-object v2, p0, Ls2/y;->g:Ls2/C;

    .line 34
    .line 35
    iget v6, p0, Ls2/y;->d:I

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x0

    .line 39
    const-wide/16 v3, 0x0

    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    invoke-interface/range {v2 .. v8}, Ls2/C;->a(JIIILs2/B;)V

    .line 43
    .line 44
    .line 45
    iput p2, p0, Ls2/y;->d:I

    .line 46
    .line 47
    return p2

    .line 48
    :cond_2
    iget v0, p0, Ls2/y;->d:I

    .line 49
    .line 50
    add-int/2addr v0, p1

    .line 51
    iput v0, p0, Ls2/y;->d:I

    .line 52
    .line 53
    return p2
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
