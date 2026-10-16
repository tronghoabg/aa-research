.class public final Lc0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/b;
.implements Ls0/a;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Lc0/d;

.field public final c:LP/d;

.field public final d:LP/d;


# direct methods
.method public constructor <init>(Ltf/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc0/d;->a:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance p1, LP/d;

    .line 7
    .line 8
    const/16 v0, 0x10

    .line 9
    .line 10
    new-array v1, v0, [Lc0/d;

    .line 11
    .line 12
    invoke-direct {p1, v1}, LP/d;-><init>([Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lc0/d;->c:LP/d;

    .line 16
    .line 17
    new-instance p1, LP/d;

    .line 18
    .line 19
    new-array v0, v0, [Lc0/g;

    .line 20
    .line 21
    invoke-direct {p1, v0}, LP/d;-><init>([Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lc0/d;->d:LP/d;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(Lc0/g;)V
    .locals 1

    .line 1
    const-string v0, "focusModifier"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc0/d;->d:LP/d;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LP/d;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lc0/d;->b:Lc0/d;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lc0/d;->a(Lc0/g;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final b(LP/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc0/d;->d:LP/d;

    .line 2
    .line 3
    iget v1, v0, LP/d;->c:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, LP/d;->c(ILP/d;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lc0/d;->b:Lc0/d;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lc0/d;->b(LP/d;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 10

    .line 1
    iget-object v0, p0, Lc0/d;->d:LP/d;

    .line 2
    .line 3
    iget v1, v0, LP/d;->c:I

    .line 4
    .line 5
    sget-object v2, Lc0/r;->f:Lc0/r;

    .line 6
    .line 7
    if-eqz v1, :cond_9

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    if-eq v1, v3, :cond_8

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    if-lez v1, :cond_5

    .line 15
    .line 16
    iget-object v0, v0, LP/d;->a:[Ljava/lang/Object;

    .line 17
    .line 18
    move-object v6, v5

    .line 19
    :cond_0
    aget-object v7, v0, v4

    .line 20
    .line 21
    check-cast v7, Lc0/g;

    .line 22
    .line 23
    iget-object v8, v7, Lc0/g;->d:Lc0/r;

    .line 24
    .line 25
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    if-eqz v8, :cond_3

    .line 30
    .line 31
    if-eq v8, v3, :cond_3

    .line 32
    .line 33
    const/4 v9, 0x2

    .line 34
    if-eq v8, v9, :cond_3

    .line 35
    .line 36
    const/4 v9, 0x3

    .line 37
    if-eq v8, v9, :cond_2

    .line 38
    .line 39
    const/4 v9, 0x4

    .line 40
    if-eq v8, v9, :cond_3

    .line 41
    .line 42
    const/4 v7, 0x5

    .line 43
    if-eq v8, v7, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    if-nez v5, :cond_4

    .line 50
    .line 51
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 55
    .line 56
    move-object v6, v7

    .line 57
    :cond_4
    :goto_0
    add-int/lit8 v4, v4, 0x1

    .line 58
    .line 59
    if-lt v4, v1, :cond_0

    .line 60
    .line 61
    move-object v0, v5

    .line 62
    move-object v5, v6

    .line 63
    goto :goto_1

    .line 64
    :cond_5
    move-object v0, v5

    .line 65
    :goto_1
    if-eqz v5, :cond_7

    .line 66
    .line 67
    iget-object v1, v5, Lc0/g;->d:Lc0/r;

    .line 68
    .line 69
    if-nez v1, :cond_6

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_6
    move-object v2, v1

    .line 73
    goto :goto_3

    .line 74
    :cond_7
    :goto_2
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_9

    .line 81
    .line 82
    sget-object v2, Lc0/r;->d:Lc0/r;

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_8
    iget-object v0, v0, LP/d;->a:[Ljava/lang/Object;

    .line 86
    .line 87
    aget-object v0, v0, v4

    .line 88
    .line 89
    check-cast v0, Lc0/g;

    .line 90
    .line 91
    iget-object v2, v0, Lc0/g;->d:Lc0/r;

    .line 92
    .line 93
    :cond_9
    :goto_3
    iget-object v0, p0, Lc0/d;->a:Ljava/lang/Object;

    .line 94
    .line 95
    invoke-interface {v0, v2}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lc0/d;->b:Lc0/d;

    .line 99
    .line 100
    if-eqz v0, :cond_a

    .line 101
    .line 102
    invoke-virtual {v0}, Lc0/d;->c()V

    .line 103
    .line 104
    .line 105
    :cond_a
    return-void
.end method

.method public final d(Lc0/g;)V
    .locals 1

    .line 1
    const-string v0, "focusModifier"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc0/d;->d:LP/d;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LP/d;->k(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lc0/d;->b:Lc0/d;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lc0/d;->d(Lc0/g;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final f(LP/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc0/d;->d:LP/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP/d;->l(LP/d;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc0/d;->b:Lc0/d;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lc0/d;->f(LP/d;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final synthetic g(LZ/k;)LZ/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LVa/M6;->f(LZ/k;LZ/k;)LZ/k;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()La2/v;
    .locals 1

    .line 1
    sget-object v0, Lc0/c;->a:La2/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final h(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final o(Ls0/c;)V
    .locals 5

    .line 1
    const-string v0, "scope"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lc0/c;->a:La2/v;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ls0/c;->a(La2/v;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lc0/d;

    .line 13
    .line 14
    iget-object v2, p0, Lc0/d;->b:Lc0/d;

    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    iget-object v2, p0, Lc0/d;->b:Lc0/d;

    .line 23
    .line 24
    iget-object v3, p0, Lc0/d;->d:LP/d;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    iget-object v4, v2, Lc0/d;->c:LP/d;

    .line 29
    .line 30
    invoke-virtual {v4, p0}, LP/d;->k(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v3}, Lc0/d;->f(LP/d;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iput-object v1, p0, Lc0/d;->b:Lc0/d;

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-object v2, v1, Lc0/d;->c:LP/d;

    .line 41
    .line 42
    invoke-virtual {v2, p0}, LP/d;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v3}, Lc0/d;->b(LP/d;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-interface {p1, v0}, Ls0/c;->a(La2/v;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lc0/d;

    .line 53
    .line 54
    iput-object p1, p0, Lc0/d;->b:Lc0/d;

    .line 55
    .line 56
    return-void
.end method

.method public final p(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final synthetic v()Z
    .locals 1

    .line 1
    sget-object v0, LZ/h;->i:LZ/h;

    invoke-static {p0, v0}, LVa/M6;->a(LZ/j;Ltf/l;)Z

    move-result v0

    return v0
.end method
