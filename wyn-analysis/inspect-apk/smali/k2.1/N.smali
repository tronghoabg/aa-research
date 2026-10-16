.class public final Lk2/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln2/q;


# instance fields
.field public final a:Ln2/q;

.field public final b:LN1/O;


# direct methods
.method public constructor <init>(Ln2/q;LN1/O;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk2/N;->a:Ln2/q;

    .line 5
    .line 6
    iput-object p2, p0, Lk2/N;->b:LN1/O;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0}, Ln2/q;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(I)LN1/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ln2/q;->c(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Lk2/N;->b:LN1/O;

    .line 8
    .line 9
    iget-object v0, v0, LN1/O;->d:[LN1/n;

    .line 10
    .line 11
    aget-object p1, v0, p1

    .line 12
    .line 13
    return-object p1
.end method

.method public final c(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ln2/q;->c(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final d(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ln2/q;->d(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0}, Ln2/q;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lk2/N;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lk2/N;

    .line 12
    .line 13
    iget-object v1, p1, Lk2/N;->a:Ln2/q;

    .line 14
    .line 15
    iget-object v3, p0, Lk2/N;->a:Ln2/q;

    .line 16
    .line 17
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lk2/N;->b:LN1/O;

    .line 24
    .line 25
    iget-object p1, p1, Lk2/N;->b:LN1/O;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, LN1/O;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    return v0

    .line 34
    :cond_2
    return v2
.end method

.method public final f(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ln2/q;->f(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final g()LN1/O;
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->b:LN1/O;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ln2/q;->h(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/N;->b:LN1/O;

    .line 2
    .line 3
    invoke-virtual {v0}, LN1/O;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit16 v0, v0, 0x20f

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lk2/N;->a:Ln2/q;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    return v1
.end method

.method public final i()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0}, Ln2/q;->i()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final j()LN1/n;
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0}, Ln2/q;->t()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lk2/N;->b:LN1/O;

    .line 8
    .line 9
    iget-object v1, v1, LN1/O;->d:[LN1/n;

    .line 10
    .line 11
    aget-object v0, v1, v0

    .line 12
    .line 13
    return-object v0
.end method

.method public final k()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0}, Ln2/q;->k()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l(JJJLjava/util/List;[Ll2/m;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    move-wide v1, p1

    .line 4
    move-wide v3, p3

    .line 5
    move-wide v5, p5

    .line 6
    move-object/from16 v7, p7

    .line 7
    .line 8
    move-object/from16 v8, p8

    .line 9
    .line 10
    invoke-interface/range {v0 .. v8}, Ln2/q;->l(JJJLjava/util/List;[Ll2/m;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final length()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0}, Ln2/q;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final m(IJ)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Ln2/q;->m(IJ)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final n()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0}, Ln2/q;->n()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final o(IJ)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Ln2/q;->o(IJ)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final p()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0}, Ln2/q;->p()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final q(LN1/n;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->b:LN1/O;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LN1/O;->a(LN1/n;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ln2/q;->f(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final r(JLl2/e;Ljava/util/List;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, Ln2/q;->r(JLl2/e;Ljava/util/List;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final s(JLjava/util/List;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Ln2/q;->s(JLjava/util/List;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final t()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0}, Ln2/q;->t()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final u()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/N;->a:Ln2/q;

    .line 2
    .line 3
    invoke-interface {v0}, Ln2/q;->u()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
