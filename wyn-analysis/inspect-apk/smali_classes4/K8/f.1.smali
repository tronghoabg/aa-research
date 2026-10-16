.class public final LK8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lqd/b;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iget-boolean v0, p1, Lqd/b;->a:Z

    iput-boolean v0, p0, LK8/f;->a:Z

    .line 5
    iget-object v0, p1, Lqd/b;->b:[Ljava/lang/String;

    iput-object v0, p0, LK8/f;->c:Ljava/lang/Object;

    .line 6
    iget-object v0, p1, Lqd/b;->c:[Ljava/lang/String;

    iput-object v0, p0, LK8/f;->d:Ljava/lang/Object;

    .line 7
    iget-boolean p1, p1, Lqd/b;->d:Z

    iput-boolean p1, p0, LK8/f;->b:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, LK8/f;->a:Z

    return-void
.end method

.method public static b(Lp9/u;Lc9/c;)Lc9/d;
    .locals 3

    .line 1
    new-instance v0, Lc9/d;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    .line 5
    invoke-virtual {p0}, Lp9/u;->a()LO7/d;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v1, v2}, Lc9/d;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/util/Map$Entry;

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ls9/k;

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lp9/u;->g(Ls9/k;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-object v0
.end method

.method public static d(Lp9/u;ILc9/d;Ls9/o;)Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lp9/u;->h:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move v0, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v1

    .line 14
    :goto_0
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_3

    .line 17
    :cond_1
    iget-object p2, p2, Lc9/d;->a:Lc9/c;

    .line 18
    .line 19
    invoke-virtual {p2}, Lc9/c;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eq p1, v0, :cond_2

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    iget p0, p0, Lp9/u;->i:I

    .line 27
    .line 28
    if-ne p0, v2, :cond_3

    .line 29
    .line 30
    invoke-virtual {p2}, Lc9/c;->d()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ls9/k;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    invoke-virtual {p2}, Lc9/c;->e()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Ls9/k;

    .line 42
    .line 43
    :goto_1
    if-nez p0, :cond_4

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_4
    invoke-virtual {p0}, Ls9/k;->c()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_7

    .line 51
    .line 52
    iget p1, p0, Ls9/k;->f:I

    .line 53
    .line 54
    const/4 p2, 0x2

    .line 55
    invoke-static {p1, p2}, LA/f;->b(II)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_5
    iget-object p0, p0, Ls9/k;->c:Ls9/o;

    .line 63
    .line 64
    invoke-virtual {p0, p3}, Ls9/o;->a(Ls9/o;)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-lez p0, :cond_6

    .line 69
    .line 70
    :goto_2
    return v2

    .line 71
    :cond_6
    :goto_3
    return v1

    .line 72
    :cond_7
    :goto_4
    return v2
.end method


# virtual methods
.method public a(Lc9/d;Lp9/u;Ls9/b;)Lc9/c;
    .locals 2

    .line 1
    iget-object v0, p0, LK8/f;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LVa/Za;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p2, p3, v1}, LVa/Za;->g(Lp9/u;Ls9/b;LR1/i;)Lc9/c;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p1}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    move-object p3, p1

    .line 15
    check-cast p3, LA7/v;

    .line 16
    .line 17
    iget-object v0, p3, LA7/v;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/util/Iterator;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p3}, LA7/v;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    check-cast p3, Ls9/k;

    .line 32
    .line 33
    iget-object v0, p3, Ls9/k;->a:Ls9/h;

    .line 34
    .line 35
    invoke-virtual {p2, v0, p3}, Lc9/c;->g(Ljava/lang/Object;Ljava/lang/Object;)Lc9/c;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-object p2
.end method

.method public varargs c([Lqd/a;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, LK8/f;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    array-length v0, p1

    .line 6
    new-array v0, v0, [Ljava/lang/String;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    array-length v2, p1

    .line 10
    if-ge v1, v2, :cond_0

    .line 11
    .line 12
    aget-object v2, p1, v1

    .line 13
    .line 14
    iget-object v2, v2, Lqd/a;->a:Ljava/lang/String;

    .line 15
    .line 16
    aput-object v2, v0, v1

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iput-object v0, p0, LK8/f;->c:Ljava/lang/Object;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "no cipher suites for cleartext connections"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1
.end method

.method public e(Lp9/u;)Lc9/c;
    .locals 7

    .line 1
    invoke-virtual {p1}, Lp9/u;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, Lp9/u;->i()Lp9/A;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, LK8/f;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lr9/f;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Lr9/f;->k(Lp9/A;)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-static {v1, v2}, LA/f;->b(II)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    :goto_0
    const/4 p1, 0x0

    .line 28
    return-object p1

    .line 29
    :cond_1
    iget-wide v3, p1, Lp9/u;->h:J

    .line 30
    .line 31
    const-wide/16 v5, -0x1

    .line 32
    .line 33
    cmp-long v3, v3, v5

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    move v3, v2

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v3, v4

    .line 41
    :goto_1
    if-eqz v3, :cond_3

    .line 42
    .line 43
    const/4 v3, 0x2

    .line 44
    invoke-static {v1, v3}, LA/f;->b(II)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-virtual {p1, v5, v6}, Lp9/u;->f(J)Lp9/u;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p0, p1}, LK8/f;->e(Lp9/u;)Lc9/c;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1

    .line 59
    :cond_3
    iget-object v1, p0, LK8/f;->d:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Lr9/f;

    .line 62
    .line 63
    invoke-interface {v1, v0}, Lr9/f;->p(Lp9/A;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-eqz v1, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    move v2, v4

    .line 71
    :goto_2
    const-string v3, "index manager must return results for partial and full indexes."

    .line 72
    .line 73
    new-array v4, v4, [Ljava/lang/Object;

    .line 74
    .line 75
    invoke-static {v2, v3, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v2, p0, LK8/f;->c:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, LVa/Za;

    .line 81
    .line 82
    invoke-virtual {v2, v1}, LVa/Za;->e(Ljava/lang/Iterable;)Lc9/c;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    iget-object v3, p0, LK8/f;->d:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v3, Lr9/f;

    .line 89
    .line 90
    invoke-interface {v3, v0}, Lr9/f;->x(Lp9/A;)Ls9/b;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {p1, v2}, LK8/f;->b(Lp9/u;Lc9/c;)Lc9/d;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v1, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    iget-object v3, v0, Ls9/b;->a:Ls9/o;

    .line 105
    .line 106
    invoke-static {p1, v1, v2, v3}, LK8/f;->d(Lp9/u;ILc9/d;Ls9/o;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_5

    .line 111
    .line 112
    invoke-virtual {p1, v5, v6}, Lp9/u;->f(J)Lp9/u;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p0, p1}, LK8/f;->e(Lp9/u;)Lc9/c;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    return-object p1

    .line 121
    :cond_5
    invoke-virtual {p0, v2, p1, v0}, LK8/f;->a(Lc9/d;Lp9/u;Ls9/b;)Lc9/c;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    return-object p1
.end method

.method public varargs f([Lqd/m;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, LK8/f;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    array-length v0, p1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    array-length v0, p1

    .line 9
    new-array v0, v0, [Ljava/lang/String;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    array-length v2, p1

    .line 13
    if-ge v1, v2, :cond_0

    .line 14
    .line 15
    aget-object v2, p1, v1

    .line 16
    .line 17
    iget-object v2, v2, Lqd/m;->a:Ljava/lang/String;

    .line 18
    .line 19
    aput-object v2, v0, v1

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-object v0, p0, LK8/f;->d:Ljava/lang/Object;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    const-string v0, "At least one TlsVersion is required"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string v0, "no TLS versions for cleartext connections"

    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1
.end method
