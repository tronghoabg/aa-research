.class public final LE/B;
.super LA7/B0;
.source "SourceFile"

# interfaces
.implements Lr0/l;
.implements Ls0/a;
.implements Ls0/b;


# instance fields
.field public final b:LE/a;

.field public final c:LN/Y;

.field public final d:LN/Y;


# direct methods
.method public constructor <init>(LE/a;)V
    .locals 2

    .line 1
    sget-object v0, Lu0/m;->l:Lu0/m;

    .line 2
    .line 3
    const-string v1, "insets"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, LA7/B0;-><init>(Ltf/l;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LE/B;->b:LE/a;

    .line 12
    .line 13
    sget-object v0, LN/P;->f:LN/P;

    .line 14
    .line 15
    invoke-static {p1, v0}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, p0, LE/B;->c:LN/Y;

    .line 20
    .line 21
    invoke-static {p1, v0}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, LE/B;->d:LN/Y;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, LE/B;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, LE/B;

    .line 12
    .line 13
    iget-object p1, p1, LE/B;->b:LE/a;

    .line 14
    .line 15
    iget-object v0, p0, LE/B;->b:LE/a;

    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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
    sget-object v0, LE/U;->a:La2/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LE/B;->d:LN/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LE/Q;

    .line 8
    .line 9
    return-object v0
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

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LE/B;->b:LE/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/a;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final o(Ls0/c;)V
    .locals 3

    .line 1
    const-string v0, "scope"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LE/U;->a:La2/v;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ls0/c;->a(La2/v;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, LE/Q;

    .line 13
    .line 14
    iget-object v0, p0, LE/B;->b:LE/a;

    .line 15
    .line 16
    const-string v1, "<this>"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v1, "insets"

    .line 22
    .line 23
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, LE/v;

    .line 27
    .line 28
    invoke-direct {v1, v0, p1}, LE/v;-><init>(LE/a;LE/Q;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, LE/B;->c:LN/Y;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v0}, Lp7/b;->V(LE/Q;LE/Q;)LE/N;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v0, p0, LE/B;->d:LN/Y;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
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

.method public final q(Lt0/r;Lr0/m;J)LD0/b;
    .locals 6

    .line 1
    const-string v0, "$this$measure"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "measurable"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LE/B;->c:LN/Y;

    .line 12
    .line 13
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, LE/Q;

    .line 18
    .line 19
    iget-object v2, p1, Lt0/r;->a:Lt0/t;

    .line 20
    .line 21
    iget-object v3, v2, Lt0/t;->p:LL0/i;

    .line 22
    .line 23
    invoke-interface {v1, p1, v3}, LE/Q;->b(Lt0/r;LL0/i;)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, LE/Q;

    .line 32
    .line 33
    invoke-interface {v3, p1}, LE/Q;->d(Lt0/r;)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, LE/Q;

    .line 42
    .line 43
    iget-object v2, v2, Lt0/t;->p:LL0/i;

    .line 44
    .line 45
    invoke-interface {v4, p1, v2}, LE/Q;->a(Lt0/r;LL0/i;)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, LE/Q;

    .line 54
    .line 55
    invoke-interface {v0, p1}, LE/Q;->c(Lt0/r;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    add-int/2addr v2, v1

    .line 60
    add-int/2addr v0, v3

    .line 61
    neg-int v4, v2

    .line 62
    neg-int v5, v0

    .line 63
    invoke-static {v4, v5, p3, p4}, Lxg/g;->C(IIJ)J

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    invoke-interface {p2, v4, v5}, Lr0/m;->e(J)Lr0/t;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    iget v4, p2, Lr0/t;->a:I

    .line 72
    .line 73
    add-int/2addr v4, v2

    .line 74
    invoke-static {v4, p3, p4}, Lxg/g;->u(IJ)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    iget v4, p2, Lr0/t;->b:I

    .line 79
    .line 80
    add-int/2addr v4, v0

    .line 81
    invoke-static {v4, p3, p4}, Lxg/g;->t(IJ)I

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    new-instance p4, LE/A;

    .line 86
    .line 87
    invoke-direct {p4, p2, v1, v3}, LE/A;-><init>(Lr0/t;II)V

    .line 88
    .line 89
    .line 90
    invoke-static {p1, v2, p3, p4}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
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
