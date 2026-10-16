.class public final Lx0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lx0/h;

.field public final b:Z

.field public c:Z

.field public d:Lx0/k;

.field public final e:Lx0/g;

.field public final f:I

.field public final g:Lt0/t;


# direct methods
.method public constructor <init>(Lx0/h;Z)V
    .locals 1

    .line 1
    const-string v0, "outerSemanticsEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lx0/k;->a:Lx0/h;

    .line 10
    .line 11
    iput-boolean p2, p0, Lx0/k;->b:Z

    .line 12
    .line 13
    invoke-virtual {p1}, Lx0/h;->j()Lx0/g;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iput-object p2, p0, Lx0/k;->e:Lx0/g;

    .line 18
    .line 19
    iget-object p2, p1, LX0/E;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p2, LZ/j;

    .line 22
    .line 23
    check-cast p2, Lx0/i;

    .line 24
    .line 25
    check-cast p2, Lx0/j;

    .line 26
    .line 27
    iget p2, p2, Lx0/j;->a:I

    .line 28
    .line 29
    iput p2, p0, Lx0/k;->f:I

    .line 30
    .line 31
    iget-object p1, p1, LX0/E;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Lt0/y;

    .line 34
    .line 35
    iget-object p1, p1, Lt0/y;->e:Lt0/t;

    .line 36
    .line 37
    iput-object p1, p0, Lx0/k;->g:Lt0/t;

    .line 38
    .line 39
    return-void
.end method

.method public static b(Lx0/k;Ljava/util/List;ZI)Ljava/util/List;
    .locals 4

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x2

    .line 11
    and-int/2addr p3, v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz p3, :cond_1

    .line 14
    .line 15
    move p2, v1

    .line 16
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p2, v1}, Lx0/k;->j(ZZ)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    move p3, v1

    .line 28
    :goto_0
    if-ge p3, p2, :cond_4

    .line 29
    .line 30
    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lx0/k;

    .line 35
    .line 36
    invoke-virtual {v2}, Lx0/k;->h()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iget-object v3, v2, Lx0/k;->e:Lx0/g;

    .line 47
    .line 48
    iget-boolean v3, v3, Lx0/g;->c:Z

    .line 49
    .line 50
    if-nez v3, :cond_3

    .line 51
    .line 52
    invoke-static {v2, p1, v1, v0}, Lx0/k;->b(Lx0/k;Ljava/util/List;ZI)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    :cond_3
    :goto_1
    add-int/lit8 p3, p3, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    return-object p1
.end method


# virtual methods
.method public final a(Lx0/e;Ltf/l;)Lx0/k;
    .locals 6

    .line 1
    new-instance v0, Lx0/k;

    .line 2
    .line 3
    new-instance v1, Lx0/h;

    .line 4
    .line 5
    new-instance v2, Lt0/t;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-direct {v2, v3}, Lt0/t;-><init>(Z)V

    .line 9
    .line 10
    .line 11
    new-instance v4, Lx0/j;

    .line 12
    .line 13
    iget v5, p0, Lx0/k;->f:I

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const p1, 0x3b9aca00

    .line 18
    .line 19
    .line 20
    :goto_0
    add-int/2addr v5, p1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const p1, 0x77359400

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :goto_1
    const/4 p1, 0x0

    .line 27
    invoke-direct {v4, v5, p1, p2}, Lx0/j;-><init>(IZLtf/l;)V

    .line 28
    .line 29
    .line 30
    iget-object p2, v2, Lt0/t;->x:Lt0/i;

    .line 31
    .line 32
    invoke-direct {v1, p2, v4}, Lx0/h;-><init>(Lt0/y;Lx0/i;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1, p1}, Lx0/k;-><init>(Lx0/h;Z)V

    .line 36
    .line 37
    .line 38
    iput-boolean v3, v0, Lx0/k;->c:Z

    .line 39
    .line 40
    iput-object p0, v0, Lx0/k;->d:Lx0/k;

    .line 41
    .line 42
    return-object v0
.end method

.method public final c()Lt0/y;
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/k;->e:Lx0/g;

    .line 2
    .line 3
    iget-boolean v0, v0, Lx0/g;->b:Z

    .line 4
    .line 5
    iget-object v1, p0, Lx0/k;->a:Lx0/h;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lx0/k;->g:Lt0/t;

    .line 10
    .line 11
    invoke-static {v0}, LS3/f;->u(Lt0/t;)Lx0/h;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v1, v0

    .line 19
    :goto_0
    iget-object v0, v1, LX0/E;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lt0/y;

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_1
    iget-object v0, v1, LX0/E;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lt0/y;

    .line 27
    .line 28
    return-object v0
.end method

.method public final d()Ld0/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/k;->g:Lt0/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt0/t;->r()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Ld0/d;->e:Ld0/d;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lx0/k;->c()Lt0/y;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, LFe/g;->q(Lt0/y;)Ld0/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public final e(Z)Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/k;->e:Lx0/g;

    .line 2
    .line 3
    iget-boolean v0, v0, Lx0/g;->c:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Lff/v;->a:Lff/v;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p0}, Lx0/k;->h()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-static {p0, v0, p1, v1}, Lx0/k;->b(Lx0/k;Ljava/util/List;ZI)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_1
    invoke-virtual {p0, p1, v1}, Lx0/k;->j(ZZ)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method

.method public final f()Lx0/g;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lx0/k;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lx0/k;->e:Lx0/g;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, Lx0/g;

    .line 13
    .line 14
    invoke-direct {v0}, Lx0/g;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-boolean v2, v1, Lx0/g;->b:Z

    .line 18
    .line 19
    iput-boolean v2, v0, Lx0/g;->b:Z

    .line 20
    .line 21
    iget-boolean v2, v1, Lx0/g;->c:Z

    .line 22
    .line 23
    iput-boolean v2, v0, Lx0/g;->c:Z

    .line 24
    .line 25
    iget-object v2, v0, Lx0/g;->a:Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    iget-object v1, v1, Lx0/g;->a:Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-interface {v2, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lx0/k;->i(Lx0/g;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_0
    return-object v1
.end method

.method public final g()Lx0/k;
    .locals 7

    .line 1
    iget-object v0, p0, Lx0/k;->d:Lx0/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    iget-object v3, p0, Lx0/k;->g:Lt0/t;

    .line 10
    .line 11
    iget-boolean v4, p0, Lx0/k;->b:Z

    .line 12
    .line 13
    if-eqz v4, :cond_3

    .line 14
    .line 15
    invoke-virtual {v3}, Lt0/t;->j()Lt0/t;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    :goto_0
    if-eqz v5, :cond_3

    .line 20
    .line 21
    invoke-static {v5}, LS3/f;->v(Lt0/t;)Lx0/h;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    if-eqz v6, :cond_1

    .line 26
    .line 27
    invoke-virtual {v6}, Lx0/h;->j()Lx0/g;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    if-eqz v6, :cond_1

    .line 32
    .line 33
    iget-boolean v6, v6, Lx0/g;->b:Z

    .line 34
    .line 35
    if-ne v6, v0, :cond_1

    .line 36
    .line 37
    move v6, v0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v6, v1

    .line 40
    :goto_1
    if-eqz v6, :cond_2

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    invoke-virtual {v5}, Lt0/t;->j()Lt0/t;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    move-object v5, v2

    .line 49
    :goto_2
    if-nez v5, :cond_7

    .line 50
    .line 51
    invoke-virtual {v3}, Lt0/t;->j()Lt0/t;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    :goto_3
    if-eqz v3, :cond_6

    .line 56
    .line 57
    invoke-static {v3}, LS3/f;->v(Lt0/t;)Lx0/h;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    if-eqz v5, :cond_4

    .line 62
    .line 63
    move v5, v0

    .line 64
    goto :goto_4

    .line 65
    :cond_4
    move v5, v1

    .line 66
    :goto_4
    if-eqz v5, :cond_5

    .line 67
    .line 68
    move-object v5, v3

    .line 69
    goto :goto_5

    .line 70
    :cond_5
    invoke-virtual {v3}, Lt0/t;->j()Lt0/t;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    goto :goto_3

    .line 75
    :cond_6
    move-object v5, v2

    .line 76
    :cond_7
    :goto_5
    if-eqz v5, :cond_8

    .line 77
    .line 78
    invoke-static {v5}, LS3/f;->v(Lt0/t;)Lx0/h;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    goto :goto_6

    .line 83
    :cond_8
    move-object v0, v2

    .line 84
    :goto_6
    if-nez v0, :cond_9

    .line 85
    .line 86
    return-object v2

    .line 87
    :cond_9
    new-instance v1, Lx0/k;

    .line 88
    .line 89
    invoke-direct {v1, v0, v4}, Lx0/k;-><init>(Lx0/h;Z)V

    .line 90
    .line 91
    .line 92
    return-object v1
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/k;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lx0/k;->e:Lx0/g;

    .line 6
    .line 7
    iget-boolean v0, v0, Lx0/g;->b:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final i(Lx0/g;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lx0/k;->e:Lx0/g;

    .line 2
    .line 3
    iget-boolean v0, v0, Lx0/g;->c:Z

    .line 4
    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0, v0}, Lx0/k;->j(ZZ)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    :goto_0
    if-ge v0, v2, :cond_3

    .line 17
    .line 18
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Lx0/k;

    .line 23
    .line 24
    invoke-virtual {v3}, Lx0/k;->h()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-nez v4, :cond_2

    .line 29
    .line 30
    iget-object v4, v3, Lx0/k;->e:Lx0/g;

    .line 31
    .line 32
    const-string v5, "child"

    .line 33
    .line 34
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v4, v4, Lx0/g;->a:Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_1

    .line 52
    .line 53
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    check-cast v5, Ljava/util/Map$Entry;

    .line 58
    .line 59
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    check-cast v6, Lx0/q;

    .line 64
    .line 65
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    iget-object v7, p1, Lx0/g;->a:Ljava/util/LinkedHashMap;

    .line 70
    .line 71
    invoke-virtual {v7, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    iget-object v9, v6, Lx0/q;->b:Ltf/p;

    .line 76
    .line 77
    invoke-interface {v9, v8, v5}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    if-eqz v5, :cond_0

    .line 82
    .line 83
    invoke-interface {v7, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    invoke-virtual {v3, p1}, Lx0/k;->i(Lx0/g;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    return-void
.end method

.method public final j(ZZ)Ljava/util/List;
    .locals 7

    .line 1
    iget-boolean v0, p0, Lx0/k;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lff/v;->a:Lff/v;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lx0/k;->g:Lt0/t;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    new-instance p1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {v1, p1}, LU8/v0;->F(Lt0/t;Ljava/util/ArrayList;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, p1}, LS3/f;->p(Lt0/t;Ljava/util/ArrayList;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v2, 0x0

    .line 39
    move v3, v2

    .line 40
    :goto_1
    if-ge v3, v1, :cond_2

    .line 41
    .line 42
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lx0/h;

    .line 47
    .line 48
    new-instance v5, Lx0/k;

    .line 49
    .line 50
    iget-boolean v6, p0, Lx0/k;->b:Z

    .line 51
    .line 52
    invoke-direct {v5, v4, v6}, Lx0/k;-><init>(Lx0/h;Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    add-int/lit8 v3, v3, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    if-eqz p2, :cond_5

    .line 62
    .line 63
    sget-object p1, Lx0/n;->o:Lx0/q;

    .line 64
    .line 65
    iget-object p2, p0, Lx0/k;->e:Lx0/g;

    .line 66
    .line 67
    invoke-static {p2, p1}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Lx0/e;

    .line 72
    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    iget-boolean v1, p2, Lx0/g;->b:Z

    .line 76
    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_3

    .line 84
    .line 85
    new-instance v1, LB/F;

    .line 86
    .line 87
    const/16 v3, 0x16

    .line 88
    .line 89
    invoke-direct {v1, p1, v3}, LB/F;-><init>(Ljava/lang/Object;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1, v1}, Lx0/k;->a(Lx0/e;Ltf/l;)Lx0/k;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :cond_3
    sget-object p1, Lx0/n;->a:Lx0/q;

    .line 100
    .line 101
    invoke-virtual {p2, p1}, Lx0/g;->a(Lx0/q;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_5

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_5

    .line 112
    .line 113
    iget-boolean v1, p2, Lx0/g;->b:Z

    .line 114
    .line 115
    if-eqz v1, :cond_5

    .line 116
    .line 117
    invoke-static {p2, p1}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    check-cast p1, Ljava/util/List;

    .line 122
    .line 123
    const/4 p2, 0x0

    .line 124
    if-eqz p1, :cond_4

    .line 125
    .line 126
    invoke-static {p1}, Lff/o;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    check-cast p1, Ljava/lang/String;

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_4
    move-object p1, p2

    .line 134
    :goto_2
    if-eqz p1, :cond_5

    .line 135
    .line 136
    new-instance v1, LK/s;

    .line 137
    .line 138
    const/4 v3, 0x2

    .line 139
    invoke-direct {v1, p1, v3}, LK/s;-><init>(Ljava/lang/String;I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, p2, v1}, Lx0/k;->a(Lx0/e;Ltf/l;)Lx0/k;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {v0, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :cond_5
    return-object v0
.end method
