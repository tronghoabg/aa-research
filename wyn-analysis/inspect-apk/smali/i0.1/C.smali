.class public final Li0/C;
.super LE9/c;
.source "SourceFile"


# direct methods
.method public static w(Li0/B;)Li0/a;
    .locals 1

    .line 1
    instance-of v0, p0, Li0/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Li0/a;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Cannot only insert VNode into Group"

    .line 11
    .line 12
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p0
.end method


# virtual methods
.method public final l(ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Li0/B;

    .line 2
    .line 3
    const-string p1, "instance"

    .line 4
    .line 5
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final m(ILjava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Li0/B;

    .line 2
    .line 3
    const-string v0, "instance"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LE9/c;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Li0/B;

    .line 11
    .line 12
    invoke-static {v0}, Li0/C;->w(Li0/B;)Li0/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v1, v0, Li0/a;->c:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-ge p1, v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object p1, v0, Li0/a;->h:LA0/p;

    .line 35
    .line 36
    invoke-virtual {p2, p1}, Li0/B;->d(LA0/p;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Li0/B;->c()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final n(III)V
    .locals 5

    .line 1
    iget-object v0, p0, LE9/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li0/B;

    .line 4
    .line 5
    invoke-static {v0}, Li0/C;->w(Li0/B;)Li0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, v0, Li0/a;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-le p1, p2, :cond_0

    .line 13
    .line 14
    :goto_0
    if-ge v2, p3, :cond_1

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Li0/B;

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p2, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 p2, p2, 0x1

    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    :goto_1
    if-ge v2, p3, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Li0/B;

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    add-int/lit8 v4, p2, -0x1

    .line 45
    .line 46
    invoke-virtual {v1, v4, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {v0}, Li0/B;->c()V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final o()V
    .locals 3

    .line 1
    iget-object v0, p0, LE9/c;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li0/B;

    .line 4
    .line 5
    invoke-static {v0}, Li0/C;->w(Li0/B;)Li0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, v0, Li0/a;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v0, v2, v1}, Li0/a;->e(II)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final r(II)V
    .locals 1

    .line 1
    iget-object v0, p0, LE9/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li0/B;

    .line 4
    .line 5
    invoke-static {v0}, Li0/C;->w(Li0/B;)Li0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Li0/a;->e(II)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
