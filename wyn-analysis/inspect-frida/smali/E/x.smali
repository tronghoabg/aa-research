.class public final LE/x;
.super LA7/B0;
.source "SourceFile"

# interfaces
.implements Lr0/l;


# instance fields
.field public final b:I

.field public final c:F


# direct methods
.method public constructor <init>(Ltf/l;I)V
    .locals 1

    .line 1
    const-string v0, "direction"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lka/n;->m(ILjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, LA7/B0;-><init>(Ltf/l;)V

    .line 7
    .line 8
    .line 9
    iput p2, p0, LE/x;->b:I

    .line 10
    .line 11
    const/high16 p1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    iput p1, p0, LE/x;->c:F

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, LE/x;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LE/x;

    .line 6
    .line 7
    iget v0, p1, LE/x;->b:I

    .line 8
    .line 9
    iget v1, p0, LE/x;->b:I

    .line 10
    .line 11
    if-ne v1, v0, :cond_0

    .line 12
    .line 13
    iget v0, p0, LE/x;->c:F

    .line 14
    .line 15
    iget p1, p1, LE/x;->c:F

    .line 16
    .line 17
    cmpg-float p1, v0, p1

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
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
    iget v0, p0, LE/x;->b:I

    .line 2
    .line 3
    invoke-static {v0}, LA/f;->f(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, LE/x;->c:F

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
    invoke-static {p3, p4}, LL0/a;->c(J)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget v1, p0, LE/x;->c:F

    .line 16
    .line 17
    iget v2, p0, LE/x;->b:I

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    if-eq v2, v0, :cond_0

    .line 23
    .line 24
    invoke-static {p3, p4}, LL0/a;->e(J)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    int-to-float v0, v0

    .line 29
    mul-float/2addr v0, v1

    .line 30
    invoke-static {v0}, Lvf/a;->H(F)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {p3, p4}, LL0/a;->g(J)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-static {p3, p4}, LL0/a;->e(J)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-static {v0, v3, v4}, Landroid/support/v4/media/session/b;->S(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    move v3, v0

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {p3, p4}, LL0/a;->g(J)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-static {p3, p4}, LL0/a;->e(J)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    :goto_0
    invoke-static {p3, p4}, LL0/a;->b(J)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    const/4 v4, 0x2

    .line 63
    if-eq v2, v4, :cond_1

    .line 64
    .line 65
    invoke-static {p3, p4}, LL0/a;->d(J)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    int-to-float v2, v2

    .line 70
    mul-float/2addr v2, v1

    .line 71
    invoke-static {v2}, Lvf/a;->H(F)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-static {p3, p4}, LL0/a;->f(J)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-static {p3, p4}, LL0/a;->d(J)I

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    invoke-static {v1, v2, p3}, Landroid/support/v4/media/session/b;->S(III)I

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    move p4, p3

    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-static {p3, p4}, LL0/a;->f(J)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-static {p3, p4}, LL0/a;->d(J)I

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    move p4, p3

    .line 98
    move p3, v1

    .line 99
    :goto_1
    invoke-static {v0, v3, p3, p4}, Lxg/g;->a(IIII)J

    .line 100
    .line 101
    .line 102
    move-result-wide p3

    .line 103
    invoke-interface {p2, p3, p4}, Lr0/m;->e(J)Lr0/t;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    iget p3, p2, Lr0/t;->a:I

    .line 108
    .line 109
    iget p4, p2, Lr0/t;->b:I

    .line 110
    .line 111
    new-instance v0, LE/w;

    .line 112
    .line 113
    const/4 v1, 0x0

    .line 114
    invoke-direct {v0, p2, v1}, LE/w;-><init>(Lr0/t;I)V

    .line 115
    .line 116
    .line 117
    invoke-static {p1, p3, p4, v0}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
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
