.class public final LE/E;
.super LA7/B0;
.source "SourceFile"

# interfaces
.implements Lr0/l;


# instance fields
.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:Z


# direct methods
.method public constructor <init>(FFFF)V
    .locals 3

    .line 1
    sget-object v0, Lu0/m;->l:Lu0/m;

    .line 2
    .line 3
    invoke-direct {p0, v0}, LA7/B0;-><init>(Ltf/l;)V

    .line 4
    .line 5
    .line 6
    iput p1, p0, LE/E;->b:F

    .line 7
    .line 8
    iput p2, p0, LE/E;->c:F

    .line 9
    .line 10
    iput p3, p0, LE/E;->d:F

    .line 11
    .line 12
    iput p4, p0, LE/E;->e:F

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, LE/E;->f:Z

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    cmpl-float v1, p1, v0

    .line 19
    .line 20
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 21
    .line 22
    if-gez v1, :cond_0

    .line 23
    .line 24
    invoke-static {p1, v2}, LL0/d;->a(FF)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    :cond_0
    cmpl-float p1, p2, v0

    .line 31
    .line 32
    if-gez p1, :cond_1

    .line 33
    .line 34
    invoke-static {p2, v2}, LL0/d;->a(FF)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_3

    .line 39
    .line 40
    :cond_1
    cmpl-float p1, p3, v0

    .line 41
    .line 42
    if-gez p1, :cond_2

    .line 43
    .line 44
    invoke-static {p3, v2}, LL0/d;->a(FF)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_3

    .line 49
    .line 50
    :cond_2
    cmpl-float p1, p4, v0

    .line 51
    .line 52
    if-gez p1, :cond_4

    .line 53
    .line 54
    invoke-static {p4, v2}, LL0/d;->a(FF)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 62
    .line 63
    const-string p2, "Padding must be non-negative"

    .line 64
    .line 65
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, LE/E;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LE/E;

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
    goto :goto_1

    .line 12
    :cond_1
    iget v0, p0, LE/E;->b:F

    .line 13
    .line 14
    iget v1, p1, LE/E;->b:F

    .line 15
    .line 16
    invoke-static {v0, v1}, LL0/d;->a(FF)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    iget v0, p0, LE/E;->c:F

    .line 23
    .line 24
    iget v1, p1, LE/E;->c:F

    .line 25
    .line 26
    invoke-static {v0, v1}, LL0/d;->a(FF)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iget v0, p0, LE/E;->d:F

    .line 33
    .line 34
    iget v1, p1, LE/E;->d:F

    .line 35
    .line 36
    invoke-static {v0, v1}, LL0/d;->a(FF)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget v0, p0, LE/E;->e:F

    .line 43
    .line 44
    iget v1, p1, LE/E;->e:F

    .line 45
    .line 46
    invoke-static {v0, v1}, LL0/d;->a(FF)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    iget-boolean v0, p0, LE/E;->f:Z

    .line 53
    .line 54
    iget-boolean p1, p1, LE/E;->f:Z

    .line 55
    .line 56
    if-ne v0, p1, :cond_2

    .line 57
    .line 58
    const/4 p1, 0x1

    .line 59
    return p1

    .line 60
    :cond_2
    :goto_1
    const/4 p1, 0x0

    .line 61
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
    .locals 3

    .line 1
    iget v0, p0, LE/E;->b:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, LE/E;->c:F

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, LA/f;->c(FII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, LE/E;->d:F

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, LA/f;->c(FII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, LE/E;->e:F

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, LA/f;->c(FII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v1, p0, LE/E;->f:Z

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    const/16 v1, 0x4cf

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/16 v1, 0x4d5

    .line 36
    .line 37
    :goto_0
    add-int/2addr v0, v1

    .line 38
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
    iget v0, p0, LE/E;->b:F

    .line 12
    .line 13
    invoke-static {p1, v0}, LA7/p0;->a(LL0/b;F)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget v1, p0, LE/E;->d:F

    .line 18
    .line 19
    invoke-static {p1, v1}, LA7/p0;->a(LL0/b;F)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/2addr v1, v0

    .line 24
    iget v0, p0, LE/E;->c:F

    .line 25
    .line 26
    invoke-static {p1, v0}, LA7/p0;->a(LL0/b;F)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v2, p0, LE/E;->e:F

    .line 31
    .line 32
    invoke-static {p1, v2}, LA7/p0;->a(LL0/b;F)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/2addr v2, v0

    .line 37
    neg-int v0, v1

    .line 38
    neg-int v3, v2

    .line 39
    invoke-static {v0, v3, p3, p4}, Lxg/g;->C(IIJ)J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    invoke-interface {p2, v3, v4}, Lr0/m;->e(J)Lr0/t;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iget v0, p2, Lr0/t;->a:I

    .line 48
    .line 49
    add-int/2addr v0, v1

    .line 50
    invoke-static {v0, p3, p4}, Lxg/g;->u(IJ)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget v1, p2, Lr0/t;->b:I

    .line 55
    .line 56
    add-int/2addr v1, v2

    .line 57
    invoke-static {v1, p3, p4}, Lxg/g;->t(IJ)I

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    new-instance p4, LA/a;

    .line 62
    .line 63
    const/4 v1, 0x2

    .line 64
    invoke-direct {p4, p0, p2, p1, v1}, LA/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    invoke-static {p1, v0, p3, p4}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
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
