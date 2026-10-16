.class public final LJ9/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw8/d;


# instance fields
.field public volatile a:Ljava/lang/Object;


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, LJ9/L;->a:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lw8/d;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lw8/d;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {v0, p1, p2}, Lw8/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, LJ9/L;->a:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lw8/d;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lw8/d;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {v0, p1, p2, p3}, Lw8/d;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final d(Ljava/lang/String;)Ljava/util/List;
    .locals 0

    .line 1
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public final e(Z)Ljava/util/Map;
    .locals 0

    .line 1
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    return-object p1
.end method

.method public final f(Ljava/lang/String;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final g(Lw8/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final h(Ljava/lang/String;Lw8/b;)Lw8/a;
    .locals 4

    .line 1
    iget-object v0, p0, LJ9/L;->a:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lw8/d;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lw8/d;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2}, Lw8/d;->h(Ljava/lang/String;Lw8/b;)Lw8/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    check-cast v0, LL8/r;

    .line 15
    .line 16
    new-instance v1, LJ9/K;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v2, Ljava/util/HashSet;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v2, v1, LJ9/K;->a:Ljava/util/HashSet;

    .line 27
    .line 28
    new-instance v2, LA5/g;

    .line 29
    .line 30
    const/4 v3, 0x5

    .line 31
    invoke-direct {v2, v1, p1, p2, v3}, LA5/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2}, LL8/r;->a(LO9/a;)V

    .line 35
    .line 36
    .line 37
    return-object v1
.end method
