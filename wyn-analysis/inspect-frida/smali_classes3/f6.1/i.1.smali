.class public abstract Lf6/i;
.super Lf6/a;
.source "SourceFile"


# instance fields
.field public final h:Ljava/util/HashMap;

.field public i:Landroid/os/Handler;

.field public j:Lt6/K;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lf6/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lf6/i;->h:Ljava/util/HashMap;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lf6/i;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lf6/h;

    .line 22
    .line 23
    iget-object v2, v1, Lf6/h;->a:Lf6/a;

    .line 24
    .line 25
    iget-object v1, v1, Lf6/h;->b:Lf6/g;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Lf6/a;->b(Lf6/A;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method

.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lf6/i;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lf6/h;

    .line 22
    .line 23
    iget-object v2, v1, Lf6/h;->a:Lf6/a;

    .line 24
    .line 25
    iget-object v1, v1, Lf6/h;->b:Lf6/g;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Lf6/a;->d(Lf6/A;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method

.method public i()V
    .locals 2

    .line 1
    iget-object v0, p0, Lf6/i;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lf6/h;

    .line 22
    .line 23
    iget-object v1, v1, Lf6/h;->a:Lf6/a;

    .line 24
    .line 25
    invoke-virtual {v1}, Lf6/a;->i()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public o()V
    .locals 5

    .line 1
    iget-object v0, p0, Lf6/i;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lf6/h;

    .line 22
    .line 23
    iget-object v3, v2, Lf6/h;->a:Lf6/a;

    .line 24
    .line 25
    iget-object v4, v2, Lf6/h;->b:Lf6/g;

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Lf6/a;->n(Lf6/A;)V

    .line 28
    .line 29
    .line 30
    iget-object v3, v2, Lf6/h;->c:LS3/i;

    .line 31
    .line 32
    iget-object v2, v2, Lf6/h;->a:Lf6/a;

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Lf6/a;->q(Lf6/D;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v3}, Lf6/a;->p(LI5/g;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public abstract r(Ljava/lang/Object;Lf6/z;)Lf6/z;
.end method

.method public s(JLjava/lang/Object;)J
    .locals 0

    .line 1
    return-wide p1
.end method

.method public t(ILjava/lang/Object;)I
    .locals 0

    .line 1
    return p1
.end method

.method public abstract u(Ljava/lang/Object;Lf6/a;LE5/J0;)V
.end method

.method public final v(Ljava/lang/Object;Lf6/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lf6/i;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    xor-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    invoke-static {v1}, Lu6/a;->e(Z)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lf6/g;

    .line 13
    .line 14
    invoke-direct {v1, p0, p1}, Lf6/g;-><init>(Lf6/i;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, LS3/i;

    .line 18
    .line 19
    invoke-direct {v2, p0, p1}, LS3/i;-><init>(Lf6/i;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Lf6/h;

    .line 23
    .line 24
    invoke-direct {v3, p2, v1, v2}, Lf6/h;-><init>(Lf6/a;Lf6/g;LS3/i;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lf6/i;->i:Landroid/os/Handler;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v0, p2, Lf6/a;->c:LI5/f;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v3, Lf6/C;

    .line 44
    .line 45
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, v3, Lf6/C;->a:Landroid/os/Handler;

    .line 49
    .line 50
    iput-object v2, v3, Lf6/C;->b:Ljava/lang/Object;

    .line 51
    .line 52
    iget-object p1, v0, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 53
    .line 54
    invoke-virtual {p1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lf6/i;->i:Landroid/os/Handler;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object p1, p2, Lf6/a;->d:LI5/f;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v0, LI5/e;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v2, v0, LI5/e;->a:Ljava/lang/Object;

    .line 73
    .line 74
    iget-object p1, p1, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lf6/i;->j:Lt6/K;

    .line 80
    .line 81
    iget-object v0, p0, Lf6/a;->g:LF5/l;

    .line 82
    .line 83
    invoke-static {v0}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, v1, p1, v0}, Lf6/a;->j(Lf6/A;Lt6/K;LF5/l;)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lf6/a;->b:Ljava/util/HashSet;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_0

    .line 96
    .line 97
    invoke-virtual {p2, v1}, Lf6/a;->b(Lf6/A;)V

    .line 98
    .line 99
    .line 100
    :cond_0
    return-void
.end method
