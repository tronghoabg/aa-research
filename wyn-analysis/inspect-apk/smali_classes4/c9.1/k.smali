.class public final Lc9/k;
.super Lc9/c;
.source "SourceFile"


# instance fields
.field public final a:Lc9/g;

.field public final b:Ljava/util/Comparator;


# direct methods
.method public constructor <init>(Lc9/g;Ljava/util/Comparator;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc9/k;->a:Lc9/g;

    .line 5
    .line 6
    iput-object p2, p0, Lc9/k;->b:Ljava/util/Comparator;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc9/k;->j(Ljava/lang/Object;)Lc9/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
.end method

.method public final b(Ls9/h;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc9/k;->j(Ljava/lang/Object;)Lc9/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lc9/g;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method

.method public final c()Ljava/util/Comparator;
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/k;->b:Ljava/util/Comparator;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/k;->a:Lc9/g;

    .line 2
    .line 3
    invoke-interface {v0}, Lc9/g;->h()Lc9/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lc9/g;->getKey()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/k;->a:Lc9/g;

    .line 2
    .line 3
    invoke-interface {v0}, Lc9/g;->g()Lc9/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lc9/g;->getKey()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final f(Ls9/k;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lc9/k;->a:Lc9/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    invoke-interface {v0}, Lc9/g;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-nez v2, :cond_2

    .line 9
    .line 10
    iget-object v2, p0, Lc9/k;->b:Ljava/util/Comparator;

    .line 11
    .line 12
    invoke-interface {v0}, Lc9/g;->getKey()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-interface {v2, p1, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Lc9/g;->a()Lc9/g;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1}, Lc9/g;->size()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    add-int/2addr p1, v1

    .line 31
    return p1

    .line 32
    :cond_0
    if-gez v2, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Lc9/g;->a()Lc9/g;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-interface {v0}, Lc9/g;->a()Lc9/g;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v2}, Lc9/g;->size()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    add-int/2addr v2, v1

    .line 50
    invoke-interface {v0}, Lc9/g;->b()Lc9/g;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    move v1, v2

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const/4 p1, -0x1

    .line 57
    return p1
.end method

.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Lc9/c;
    .locals 2

    .line 1
    iget-object v0, p0, Lc9/k;->a:Lc9/g;

    .line 2
    .line 3
    iget-object v1, p0, Lc9/k;->b:Ljava/util/Comparator;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, v1}, Lc9/g;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lc9/g;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lc9/i;

    .line 10
    .line 11
    const/4 p2, 0x2

    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, p2, v0, v0}, Lc9/i;->j(ILc9/g;Lc9/g;)Lc9/i;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance p2, Lc9/k;

    .line 18
    .line 19
    invoke-direct {p2, p1, v1}, Lc9/k;-><init>(Lc9/g;Ljava/util/Comparator;)V

    .line 20
    .line 21
    .line 22
    return-object p2
.end method

.method public final h(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 3

    .line 1
    new-instance v0, LA7/v;

    .line 2
    .line 3
    iget-object v1, p0, Lc9/k;->b:Ljava/util/Comparator;

    .line 4
    .line 5
    iget-object v2, p0, Lc9/k;->a:Lc9/g;

    .line 6
    .line 7
    invoke-direct {v0, v2, p1, v1}, LA7/v;-><init>(Lc9/g;Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final i(Ljava/lang/Object;)Lc9/c;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lc9/k;->a(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v0, p0, Lc9/k;->a:Lc9/g;

    .line 9
    .line 10
    iget-object v1, p0, Lc9/k;->b:Ljava/util/Comparator;

    .line 11
    .line 12
    invoke-interface {v0, p1, v1}, Lc9/g;->f(Ljava/lang/Object;Ljava/util/Comparator;)Lc9/g;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v0, 0x2

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-interface {p1, v0, v2, v2}, Lc9/g;->c(ILc9/i;Lc9/i;)Lc9/g;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v0, Lc9/k;

    .line 23
    .line 24
    invoke-direct {v0, p1, v1}, Lc9/k;-><init>(Lc9/g;Ljava/util/Comparator;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/k;->a:Lc9/g;

    .line 2
    .line 3
    invoke-interface {v0}, Lc9/g;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 4

    .line 1
    new-instance v0, LA7/v;

    .line 2
    .line 3
    iget-object v1, p0, Lc9/k;->b:Ljava/util/Comparator;

    .line 4
    .line 5
    iget-object v2, p0, Lc9/k;->a:Lc9/g;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, LA7/v;-><init>(Lc9/g;Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final j(Ljava/lang/Object;)Lc9/g;
    .locals 3

    .line 1
    iget-object v0, p0, Lc9/k;->a:Lc9/g;

    .line 2
    .line 3
    :goto_0
    invoke-interface {v0}, Lc9/g;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_2

    .line 8
    .line 9
    iget-object v1, p0, Lc9/k;->b:Ljava/util/Comparator;

    .line 10
    .line 11
    invoke-interface {v0}, Lc9/g;->getKey()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v1, p1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-gez v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Lc9/g;->a()Lc9/g;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    if-nez v1, :cond_1

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    invoke-interface {v0}, Lc9/g;->b()Lc9/g;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const/4 p1, 0x0

    .line 35
    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/k;->a:Lc9/g;

    .line 2
    .line 3
    invoke-interface {v0}, Lc9/g;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
