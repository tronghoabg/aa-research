.class public abstract LJ3/x;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final a(LJ3/s;)LS3/e;
    .locals 4

    .line 1
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, LK3/q;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    new-instance v1, LK3/k;

    .line 15
    .line 16
    invoke-direct {v1, v0, p1}, LK3/k;-><init>(LK3/q;Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    iget-boolean p1, v1, LK3/k;->e:Z

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    new-instance p1, LT3/e;

    .line 24
    .line 25
    invoke-direct {p1, v1}, LT3/e;-><init>(LK3/k;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, LK3/q;->d:Lb7/k;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lb7/k;->v(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p1, LT3/e;->b:LS3/e;

    .line 34
    .line 35
    iput-object p1, v1, LK3/k;->f:LS3/e;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v2, "Already enqueued work ids ("

    .line 45
    .line 46
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v2, v1, LK3/k;->c:Ljava/util/ArrayList;

    .line 50
    .line 51
    const-string v3, ", "

    .line 52
    .line 53
    invoke-static {v3, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v2, ")"

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sget-object v2, LK3/k;->g:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {p1, v2, v0}, LJ3/r;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :goto_0
    iget-object p1, v1, LK3/k;->f:LS3/e;

    .line 75
    .line 76
    return-object p1

    .line 77
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 78
    .line 79
    const-string v0, "enqueue needs at least one WorkRequest."

    .line 80
    .line 81
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1
.end method
