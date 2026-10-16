.class public final LE/O;
.super LA7/B0;
.source "SourceFile"

# interfaces
.implements Lr0/l;


# instance fields
.field public final b:F

.field public final c:F


# direct methods
.method public constructor <init>(FF)V
    .locals 1

    .line 1
    sget-object v0, Lu0/m;->l:Lu0/m;

    .line 2
    .line 3
    invoke-direct {p0, v0}, LA7/B0;-><init>(Ltf/l;)V

    .line 4
    .line 5
    .line 6
    iput p1, p0, LE/O;->b:F

    .line 7
    .line 8
    iput p2, p0, LE/O;->c:F

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, LE/O;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, LE/O;

    .line 7
    .line 8
    iget v0, p1, LE/O;->b:F

    .line 9
    .line 10
    iget v1, p0, LE/O;->b:F

    .line 11
    .line 12
    invoke-static {v1, v0}, LL0/d;->a(FF)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget v0, p0, LE/O;->c:F

    .line 19
    .line 20
    iget p1, p1, LE/O;->c:F

    .line 21
    .line 22
    invoke-static {v0, p1}, LL0/d;->a(FF)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 31
    return p1
.end method

.method public final synthetic g(LZ/k;)LZ/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LVa/M6;->f(LZ/k;LZ/k;)LZ/k;

    move-result-object p1

    return-object p1
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
    .locals 2

    .line 1
    iget v0, p0, LE/O;->b:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, LE/O;->c:F

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    return v1
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
    .locals 5

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
    iget v0, p0, LE/O;->b:F

    .line 12
    .line 13
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 14
    .line 15
    invoke-static {v0, v1}, LL0/d;->a(FF)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    invoke-static {p3, p4}, LL0/a;->g(J)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    invoke-static {p1, v0}, LA7/p0;->a(LL0/b;F)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {p3, p4}, LL0/a;->e(J)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-le v0, v2, :cond_0

    .line 37
    .line 38
    move v0, v2

    .line 39
    :cond_0
    if-gez v0, :cond_2

    .line 40
    .line 41
    move v0, v3

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-static {p3, p4}, LL0/a;->g(J)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    :cond_2
    :goto_0
    invoke-static {p3, p4}, LL0/a;->e(J)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    iget v4, p0, LE/O;->c:F

    .line 52
    .line 53
    invoke-static {v4, v1}, LL0/d;->a(FF)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_5

    .line 58
    .line 59
    invoke-static {p3, p4}, LL0/a;->f(J)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_5

    .line 64
    .line 65
    invoke-static {p1, v4}, LA7/p0;->a(LL0/b;F)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-static {p3, p4}, LL0/a;->d(J)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-le v1, v4, :cond_3

    .line 74
    .line 75
    move v1, v4

    .line 76
    :cond_3
    if-gez v1, :cond_4

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    move v3, v1

    .line 80
    goto :goto_1

    .line 81
    :cond_5
    invoke-static {p3, p4}, LL0/a;->f(J)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    :goto_1
    invoke-static {p3, p4}, LL0/a;->d(J)I

    .line 86
    .line 87
    .line 88
    move-result p3

    .line 89
    invoke-static {v0, v2, v3, p3}, Lxg/g;->a(IIII)J

    .line 90
    .line 91
    .line 92
    move-result-wide p3

    .line 93
    invoke-interface {p2, p3, p4}, Lr0/m;->e(J)Lr0/t;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    iget p3, p2, Lr0/t;->a:I

    .line 98
    .line 99
    iget p4, p2, Lr0/t;->b:I

    .line 100
    .line 101
    new-instance v0, LE/w;

    .line 102
    .line 103
    const/4 v1, 0x2

    .line 104
    invoke-direct {v0, p2, v1}, LE/w;-><init>(Lr0/t;I)V

    .line 105
    .line 106
    .line 107
    invoke-static {p1, p3, p4, v0}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
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
