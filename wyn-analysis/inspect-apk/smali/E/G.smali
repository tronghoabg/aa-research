.class public final LE/G;
.super LA7/B0;
.source "SourceFile"

# interfaces
.implements Lr0/l;


# instance fields
.field public final b:LE/F;


# direct methods
.method public constructor <init>(LE/F;)V
    .locals 2

    .line 1
    sget-object v0, Lu0/m;->l:Lu0/m;

    .line 2
    .line 3
    const-string v1, "paddingValues"

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
    iput-object p1, p0, LE/G;->b:LE/F;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, LE/G;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LE/G;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_1
    iget-object v0, p0, LE/G;->b:LE/F;

    .line 14
    .line 15
    iget-object p1, p1, LE/G;->b:LE/F;

    .line 16
    .line 17
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, LE/G;->b:LE/F;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/F;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
    .locals 9

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
    iget-object v0, p1, Lt0/r;->a:Lt0/t;

    .line 12
    .line 13
    iget-object v1, v0, Lt0/t;->p:LL0/i;

    .line 14
    .line 15
    iget-object v2, p0, LE/G;->b:LE/F;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-string v3, "layoutDirection"

    .line 21
    .line 22
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sget-object v4, LL0/i;->a:LL0/i;

    .line 26
    .line 27
    iget v5, v2, LE/F;->c:F

    .line 28
    .line 29
    iget v6, v2, LE/F;->a:F

    .line 30
    .line 31
    if-ne v1, v4, :cond_0

    .line 32
    .line 33
    move v1, v6

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v1, v5

    .line 36
    :goto_0
    const/4 v7, 0x0

    .line 37
    int-to-float v7, v7

    .line 38
    invoke-static {v1, v7}, Ljava/lang/Float;->compare(FF)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-ltz v1, :cond_4

    .line 43
    .line 44
    iget v1, v2, LE/F;->b:F

    .line 45
    .line 46
    invoke-static {v1, v7}, Ljava/lang/Float;->compare(FF)I

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-ltz v8, :cond_4

    .line 51
    .line 52
    iget-object v8, v0, Lt0/t;->p:LL0/i;

    .line 53
    .line 54
    invoke-static {v8, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    if-ne v8, v4, :cond_1

    .line 58
    .line 59
    move v8, v5

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move v8, v6

    .line 62
    :goto_1
    invoke-static {v8, v7}, Ljava/lang/Float;->compare(FF)I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    if-ltz v8, :cond_4

    .line 67
    .line 68
    iget v2, v2, LE/F;->d:F

    .line 69
    .line 70
    invoke-static {v2, v7}, Ljava/lang/Float;->compare(FF)I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-ltz v7, :cond_4

    .line 75
    .line 76
    iget-object v7, v0, Lt0/t;->p:LL0/i;

    .line 77
    .line 78
    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    if-ne v7, v4, :cond_2

    .line 82
    .line 83
    move v7, v6

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    move v7, v5

    .line 86
    :goto_2
    invoke-static {p1, v7}, LA7/p0;->a(LL0/b;F)I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    iget-object v0, v0, Lt0/t;->p:LL0/i;

    .line 91
    .line 92
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    if-ne v0, v4, :cond_3

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_3
    move v5, v6

    .line 99
    :goto_3
    invoke-static {p1, v5}, LA7/p0;->a(LL0/b;F)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    add-int/2addr v0, v7

    .line 104
    invoke-static {p1, v1}, LA7/p0;->a(LL0/b;F)I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    invoke-static {p1, v2}, LA7/p0;->a(LL0/b;F)I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    add-int/2addr v2, v1

    .line 113
    neg-int v1, v0

    .line 114
    neg-int v3, v2

    .line 115
    invoke-static {v1, v3, p3, p4}, Lxg/g;->C(IIJ)J

    .line 116
    .line 117
    .line 118
    move-result-wide v3

    .line 119
    invoke-interface {p2, v3, v4}, Lr0/m;->e(J)Lr0/t;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    iget v1, p2, Lr0/t;->a:I

    .line 124
    .line 125
    add-int/2addr v1, v0

    .line 126
    invoke-static {v1, p3, p4}, Lxg/g;->u(IJ)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    iget v1, p2, Lr0/t;->b:I

    .line 131
    .line 132
    add-int/2addr v1, v2

    .line 133
    invoke-static {v1, p3, p4}, Lxg/g;->t(IJ)I

    .line 134
    .line 135
    .line 136
    move-result p3

    .line 137
    new-instance p4, LA/a;

    .line 138
    .line 139
    const/4 v1, 0x3

    .line 140
    invoke-direct {p4, p2, p1, p0, v1}, LA/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 141
    .line 142
    .line 143
    invoke-static {p1, v0, p3, p4}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    return-object p1

    .line 148
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 149
    .line 150
    const-string p2, "Padding must be non-negative"

    .line 151
    .line 152
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p1
.end method

.method public final synthetic v()Z
    .locals 1

    .line 1
    sget-object v0, LZ/h;->i:LZ/h;

    invoke-static {p0, v0}, LVa/M6;->a(LZ/j;Ltf/l;)Z

    move-result v0

    return v0
.end method
