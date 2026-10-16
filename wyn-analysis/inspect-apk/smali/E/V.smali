.class public final LE/V;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, LZ/k;

    .line 2
    .line 3
    check-cast p2, LN/o;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    const-string p3, "$this$composed"

    .line 11
    .line 12
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const p1, 0x15733969

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 19
    .line 20
    .line 21
    sget-object p1, LE/S;->s:Ljava/util/WeakHashMap;

    .line 22
    .line 23
    const p1, -0x5173c916

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 27
    .line 28
    .line 29
    sget-object p1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:LN/L0;

    .line 30
    .line 31
    invoke-virtual {p2, p1}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Landroid/view/View;

    .line 36
    .line 37
    sget-object p3, LE/S;->s:Ljava/util/WeakHashMap;

    .line 38
    .line 39
    monitor-enter p3

    .line 40
    :try_start_0
    invoke-virtual {p3, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    new-instance v0, LE/S;

    .line 47
    .line 48
    invoke-direct {v0, p1}, LE/S;-><init>(Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p3, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_1

    .line 57
    :cond_0
    :goto_0
    check-cast v0, LE/S;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    monitor-exit p3

    .line 60
    new-instance p3, LA/W;

    .line 61
    .line 62
    const/4 v1, 0x5

    .line 63
    invoke-direct {p3, v1, v0, p1}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v0, p3, p2}, LN/d;->c(Ljava/lang/Object;Ltf/l;LN/o;)V

    .line 67
    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    invoke-virtual {p2, p1}, LN/o;->p(Z)V

    .line 71
    .line 72
    .line 73
    const p3, 0x44faf204

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2, p3}, LN/o;->M(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-nez p3, :cond_1

    .line 88
    .line 89
    sget-object p3, LN/k;->a:LN/P;

    .line 90
    .line 91
    if-ne v1, p3, :cond_2

    .line 92
    .line 93
    :cond_1
    iget-object p3, v0, LE/S;->b:LE/a;

    .line 94
    .line 95
    new-instance v1, LE/B;

    .line 96
    .line 97
    invoke-direct {v1, p3}, LE/B;-><init>(LE/a;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, v1}, LN/o;->U(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_2
    invoke-virtual {p2, p1}, LN/o;->p(Z)V

    .line 104
    .line 105
    .line 106
    check-cast v1, LE/B;

    .line 107
    .line 108
    invoke-virtual {p2, p1}, LN/o;->p(Z)V

    .line 109
    .line 110
    .line 111
    return-object v1

    .line 112
    :goto_1
    monitor-exit p3

    .line 113
    throw p1
.end method
