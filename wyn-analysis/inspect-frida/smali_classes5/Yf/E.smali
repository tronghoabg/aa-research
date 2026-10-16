.class public final LYf/E;
.super Lcom/moloco/sdk/internal/publisher/H;
.source "SourceFile"

# interfaces
.implements LXf/m;


# instance fields
.field public final b:LE4/F;

.field public final c:LXf/c;

.field public final d:LYf/I;

.field public final e:[LXf/m;

.field public final f:Lza/a;

.field public final g:LXf/h;

.field public h:Z

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;


# direct methods
.method public constructor <init>(LE4/F;LXf/c;LYf/I;[LXf/m;)V
    .locals 1

    .line 1
    const-string v0, "composer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "json"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LYf/E;->b:LE4/F;

    .line 15
    .line 16
    iput-object p2, p0, LYf/E;->c:LXf/c;

    .line 17
    .line 18
    iput-object p3, p0, LYf/E;->d:LYf/I;

    .line 19
    .line 20
    iput-object p4, p0, LYf/E;->e:[LXf/m;

    .line 21
    .line 22
    iget-object p1, p2, LXf/c;->b:Lza/a;

    .line 23
    .line 24
    iput-object p1, p0, LYf/E;->f:Lza/a;

    .line 25
    .line 26
    iget-object p1, p2, LXf/c;->a:LXf/h;

    .line 27
    .line 28
    iput-object p1, p0, LYf/E;->g:LXf/h;

    .line 29
    .line 30
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p4, :cond_1

    .line 35
    .line 36
    aget-object p2, p4, p1

    .line 37
    .line 38
    if-nez p2, :cond_0

    .line 39
    .line 40
    if-eq p2, p0, :cond_1

    .line 41
    .line 42
    :cond_0
    aput-object p0, p4, p1

    .line 43
    .line 44
    :cond_1
    return-void
.end method


# virtual methods
.method public final A(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z
    .locals 0

    .line 1
    const-string p2, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LYf/E;->g:LXf/h;

    .line 7
    .line 8
    iget-boolean p1, p1, LXf/h;->a:Z

    .line 9
    .line 10
    return p1
.end method

.method public final B(Lkotlinx/serialization/json/b;)V
    .locals 1

    .line 1
    const-string v0, "element"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LYf/E;->i:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    instance-of v0, p1, Lkotlinx/serialization/json/c;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, LYf/E;->j:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, p1}, LYf/r;->q(Ljava/lang/String;Lkotlinx/serialization/json/b;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    throw p1

    .line 22
    :cond_1
    :goto_0
    sget-object v0, LXf/k;->a:LXf/k;

    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, LYf/E;->n(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final C(I)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LYf/E;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, LYf/E;->F(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, LYf/E;->b:LE4/F;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, LE4/F;->n(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final F(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LYf/E;->b:LE4/F;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LE4/F;->r(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final S(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V
    .locals 7

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LYf/E;->d:LYf/I;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0x2c

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    iget-object v3, p0, LYf/E;->b:LE4/F;

    .line 16
    .line 17
    if-eq v0, v2, :cond_7

    .line 18
    .line 19
    const/16 v4, 0x3a

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x2

    .line 23
    if-eq v0, v6, :cond_4

    .line 24
    .line 25
    const/4 v6, 0x3

    .line 26
    if-eq v0, v6, :cond_1

    .line 27
    .line 28
    iget-boolean v0, v3, LE4/F;->b:Z

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v3, v1}, LE4/F;->m(C)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v3}, LE4/F;->i()V

    .line 36
    .line 37
    .line 38
    const-string v0, "json"

    .line 39
    .line 40
    iget-object v1, p0, LYf/E;->c:LXf/c;

    .line 41
    .line 42
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1, p1}, LYf/r;->n(LXf/c;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, p2}, Lkotlinx/serialization/descriptors/SerialDescriptor;->e(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p1}, LYf/E;->F(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v4}, LE4/F;->m(C)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, LE4/F;->t()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    if-nez p2, :cond_2

    .line 63
    .line 64
    iput-boolean v2, p0, LYf/E;->h:Z

    .line 65
    .line 66
    :cond_2
    if-ne p2, v2, :cond_3

    .line 67
    .line 68
    invoke-virtual {v3, v1}, LE4/F;->m(C)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, LE4/F;->t()V

    .line 72
    .line 73
    .line 74
    iput-boolean v5, p0, LYf/E;->h:Z

    .line 75
    .line 76
    :cond_3
    return-void

    .line 77
    :cond_4
    iget-boolean p1, v3, LE4/F;->b:Z

    .line 78
    .line 79
    if-nez p1, :cond_6

    .line 80
    .line 81
    rem-int/2addr p2, v6

    .line 82
    if-nez p2, :cond_5

    .line 83
    .line 84
    invoke-virtual {v3, v1}, LE4/F;->m(C)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, LE4/F;->i()V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    invoke-virtual {v3, v4}, LE4/F;->m(C)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3}, LE4/F;->t()V

    .line 95
    .line 96
    .line 97
    move v2, v5

    .line 98
    :goto_0
    iput-boolean v2, p0, LYf/E;->h:Z

    .line 99
    .line 100
    return-void

    .line 101
    :cond_6
    iput-boolean v2, p0, LYf/E;->h:Z

    .line 102
    .line 103
    invoke-virtual {v3}, LE4/F;->i()V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_7
    iget-boolean p1, v3, LE4/F;->b:Z

    .line 108
    .line 109
    if-nez p1, :cond_8

    .line 110
    .line 111
    invoke-virtual {v3, v1}, LE4/F;->m(C)V

    .line 112
    .line 113
    .line 114
    :cond_8
    invoke-virtual {v3}, LE4/F;->i()V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final a()Lza/a;
    .locals 1

    .line 1
    iget-object v0, p0, LYf/E;->f:Lza/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(Lkotlinx/serialization/descriptors/SerialDescriptor;)LVf/b;
    .locals 5

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LYf/E;->c:LXf/c;

    .line 7
    .line 8
    invoke-static {v0, p1}, LYf/r;->o(LXf/c;Lkotlinx/serialization/descriptors/SerialDescriptor;)LYf/I;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-char v2, v1, LYf/I;->a:C

    .line 13
    .line 14
    iget-object v3, p0, LYf/E;->b:LE4/F;

    .line 15
    .line 16
    invoke-virtual {v3, v2}, LE4/F;->m(C)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3}, LE4/F;->e()V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, LYf/E;->i:Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    iget-object v4, p0, LYf/E;->j:Ljava/lang/String;

    .line 27
    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    invoke-interface {p1}, Lkotlinx/serialization/descriptors/SerialDescriptor;->h()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    :cond_0
    invoke-virtual {v3}, LE4/F;->i()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v2}, LYf/E;->F(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/16 p1, 0x3a

    .line 41
    .line 42
    invoke-virtual {v3, p1}, LE4/F;->m(C)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, LE4/F;->t()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v4}, LYf/E;->F(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    iput-object p1, p0, LYf/E;->i:Ljava/lang/String;

    .line 53
    .line 54
    iput-object p1, p0, LYf/E;->j:Ljava/lang/String;

    .line 55
    .line 56
    :cond_1
    iget-object p1, p0, LYf/E;->d:LYf/I;

    .line 57
    .line 58
    if-ne p1, v1, :cond_2

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_2
    iget-object p1, p0, LYf/E;->e:[LXf/m;

    .line 62
    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    aget-object v2, p1, v2

    .line 70
    .line 71
    if-eqz v2, :cond_3

    .line 72
    .line 73
    return-object v2

    .line 74
    :cond_3
    new-instance v2, LYf/E;

    .line 75
    .line 76
    invoke-direct {v2, v3, v0, v1, p1}, LYf/E;-><init>(LE4/F;LXf/c;LYf/I;[LXf/m;)V

    .line 77
    .line 78
    .line 79
    return-object v2
.end method

.method public final c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 1

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LYf/E;->d:LYf/I;

    .line 7
    .line 8
    iget-object v0, p0, LYf/E;->b:LE4/F;

    .line 9
    .line 10
    invoke-virtual {v0}, LE4/F;->u()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, LE4/F;->j()V

    .line 14
    .line 15
    .line 16
    iget-char p1, p1, LYf/I;->b:C

    .line 17
    .line 18
    invoke-virtual {v0, p1}, LE4/F;->m(C)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final d()LXf/c;
    .locals 1

    .line 1
    iget-object v0, p0, LYf/E;->c:LXf/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(D)V
    .locals 6

    .line 1
    iget-boolean v0, p0, LYf/E;->h:Z

    .line 2
    .line 3
    iget-object v1, p0, LYf/E;->b:LE4/F;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, LYf/E;->F(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v2, v1, LE4/F;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, LA/x;

    .line 25
    .line 26
    invoke-virtual {v2, v0}, LA/x;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    const-wide v4, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    cmpg-double v0, v2, v4

    .line 39
    .line 40
    if-gtz v0, :cond_1

    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object p2, v1, LE4/F;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p2, LA/x;

    .line 50
    .line 51
    invoke-virtual {p2}, LA/x;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-static {p1, p2}, LYf/r;->a(Ljava/lang/Number;Ljava/lang/String;)LYf/o;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    throw p1
.end method

.method public final g(B)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LYf/E;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, LYf/E;->F(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, LYf/E;->b:LE4/F;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, LE4/F;->l(B)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "serializer"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-nez p4, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, LYf/E;->g:LXf/h;

    .line 14
    .line 15
    iget-boolean v0, v0, LXf/h;->f:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void

    .line 21
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Lcom/moloco/sdk/internal/publisher/H;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/KSerializer;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final l(Lkotlinx/serialization/descriptors/SerialDescriptor;I)V
    .locals 1

    .line 1
    const-string v0, "enumDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p2}, Lkotlinx/serialization/descriptors/SerialDescriptor;->e(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, LYf/E;->F(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final m(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;
    .locals 5

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LYf/F;->a(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, LYf/E;->d:LYf/I;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    iget-object v3, p0, LYf/E;->c:LXf/c;

    .line 14
    .line 15
    iget-object v4, p0, LYf/E;->b:LE4/F;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    instance-of p1, v4, LYf/l;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p1, v4, LE4/F;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, LA/x;

    .line 27
    .line 28
    iget-boolean v0, p0, LYf/E;->h:Z

    .line 29
    .line 30
    new-instance v4, LYf/l;

    .line 31
    .line 32
    invoke-direct {v4, p1, v0}, LYf/l;-><init>(LA/x;Z)V

    .line 33
    .line 34
    .line 35
    :goto_0
    new-instance p1, LYf/E;

    .line 36
    .line 37
    invoke-direct {p1, v4, v3, v1, v2}, LYf/E;-><init>(LE4/F;LXf/c;LYf/I;[LXf/m;)V

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_1
    invoke-interface {p1}, Lkotlinx/serialization/descriptors/SerialDescriptor;->isInline()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    sget-object v0, LXf/j;->a:LWf/F;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    instance-of p1, v4, LYf/k;

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    iget-object p1, v4, LE4/F;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, LA/x;

    .line 63
    .line 64
    iget-boolean v0, p0, LYf/E;->h:Z

    .line 65
    .line 66
    new-instance v4, LYf/k;

    .line 67
    .line 68
    invoke-direct {v4, p1, v0}, LYf/k;-><init>(LA/x;Z)V

    .line 69
    .line 70
    .line 71
    :goto_1
    new-instance p1, LYf/E;

    .line 72
    .line 73
    invoke-direct {p1, v4, v3, v1, v2}, LYf/E;-><init>(LE4/F;LXf/c;LYf/I;[LXf/m;)V

    .line 74
    .line 75
    .line 76
    return-object p1

    .line 77
    :cond_3
    iget-object v0, p0, LYf/E;->i:Ljava/lang/String;

    .line 78
    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    invoke-interface {p1}, Lkotlinx/serialization/descriptors/SerialDescriptor;->h()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, LYf/E;->j:Ljava/lang/String;

    .line 86
    .line 87
    :cond_4
    return-object p0
.end method

.method public final n(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)V
    .locals 5

    .line 1
    const-string v0, "serializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LYf/E;->c:LXf/c;

    .line 7
    .line 8
    iget-object v1, v0, LXf/c;->a:LXf/h;

    .line 9
    .line 10
    instance-of v2, p1, LSf/d;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    iget-object v1, v1, LXf/h;->j:LXf/a;

    .line 16
    .line 17
    sget-object v4, LXf/a;->a:LXf/a;

    .line 18
    .line 19
    if-eq v1, v4, :cond_4

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v1, v1, LXf/h;->j:LXf/a;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_4

    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    if-eq v1, v4, :cond_2

    .line 32
    .line 33
    const/4 v0, 0x2

    .line 34
    if-ne v1, v0, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    new-instance p1, LE5/Q;

    .line 38
    .line 39
    const/16 p2, 0x9

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-direct {p1, v0, p2}, LE5/Q;-><init>(BI)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :cond_2
    invoke-interface {p1}, Lkotlinx/serialization/KSerializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v1}, Lkotlinx/serialization/descriptors/SerialDescriptor;->getKind()LS3/f;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    sget-object v4, LUf/j;->p:LUf/j;

    .line 55
    .line 56
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-nez v4, :cond_3

    .line 61
    .line 62
    sget-object v4, LUf/j;->s:LUf/j;

    .line 63
    .line 64
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    :cond_3
    :goto_0
    invoke-interface {p1}, Lkotlinx/serialization/KSerializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v0, v1}, LYf/r;->g(LXf/c;Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    :goto_1
    move-object v0, v3

    .line 80
    :goto_2
    if-eqz v2, :cond_6

    .line 81
    .line 82
    check-cast p1, LSf/d;

    .line 83
    .line 84
    if-nez p2, :cond_5

    .line 85
    .line 86
    new-instance p2, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v0, "Value for serializer "

    .line 89
    .line 90
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, LSf/d;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string p1, " should always be non-null. Please report issue to the kotlinx.serialization tracker."

    .line 101
    .line 102
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p2

    .line 119
    :cond_5
    invoke-static {p1, p0, p2}, Landroid/support/v4/media/session/b;->f0(LSf/d;Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    throw v3

    .line 123
    :cond_6
    if-eqz v0, :cond_7

    .line 124
    .line 125
    invoke-interface {p1}, Lkotlinx/serialization/KSerializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-interface {v1}, Lkotlinx/serialization/descriptors/SerialDescriptor;->h()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iput-object v0, p0, LYf/E;->i:Ljava/lang/String;

    .line 134
    .line 135
    iput-object v1, p0, LYf/E;->j:Ljava/lang/String;

    .line 136
    .line 137
    :cond_7
    invoke-interface {p1, p0, p2}, Lkotlinx/serialization/KSerializer;->serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    return-void
.end method

.method public final o(J)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LYf/E;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, LYf/E;->F(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, LYf/E;->b:LE4/F;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, LE4/F;->o(J)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final p()V
    .locals 2

    .line 1
    iget-object v0, p0, LYf/E;->b:LE4/F;

    .line 2
    .line 3
    const-string v1, "null"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LE4/F;->p(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final q(S)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LYf/E;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, LYf/E;->F(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, LYf/E;->b:LE4/F;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, LE4/F;->q(S)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final r(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LYf/E;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, LYf/E;->F(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, LYf/E;->b:LE4/F;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v0, v0, LE4/F;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, LA/x;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, LA/x;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final u(F)V
    .locals 3

    .line 1
    iget-boolean v0, p0, LYf/E;->h:Z

    .line 2
    .line 3
    iget-object v1, p0, LYf/E;->b:LE4/F;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, LYf/E;->F(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v2, v1, LE4/F;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, LA/x;

    .line 25
    .line 26
    invoke-virtual {v2, v0}, LA/x;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 34
    .line 35
    .line 36
    cmpg-float v0, v0, v2

    .line 37
    .line 38
    if-gtz v0, :cond_1

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object v0, v1, LE4/F;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, LA/x;

    .line 48
    .line 49
    invoke-virtual {v0}, LA/x;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {p1, v0}, LYf/r;->a(Ljava/lang/Number;Ljava/lang/String;)LYf/o;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    throw p1
.end method

.method public final w(C)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, LYf/E;->F(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
